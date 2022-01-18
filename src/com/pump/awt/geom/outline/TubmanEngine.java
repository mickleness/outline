package com.pump.awt.geom.outline;

import com.pump.awt.geom.ClosedPathIterator;
import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.mask.RectangleMask2D;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;

public class TubmanEngine implements OutlineEngine {
    public enum Model {
        NONE, RECTANGLE, MASK
    }

    public enum MaskModel {
        BOUNDS, EXACT, APPROXIMATE
    }

    public enum ContainsModel {
        SHAPE, SHAPE_UTILS, MASK
    }

    OutlineEngine delegateEngine;
    final Model trackBounds, optimizeContains;
    final boolean divideAndConquer;
    final MaskModel maskModel;
    final ContainsModel containsModel;
    final boolean orderSimplerShapesFirst;

    Map<Shape, Rectangle2D> boundsMap = new HashMap<>();
    Map<Shape, Integer> orderMap = new HashMap<>();
    Map<Shape, RectangleMask2D> maskMap = new HashMap<>();

    public TubmanEngine(Model trackBounds, Model optimizeContains, boolean divideAndConquer, MaskModel maskModel, ContainsModel containsModel, boolean orderSimplerShapesFirst) {
        this(new PlainAreaEngine(), trackBounds, optimizeContains, divideAndConquer, maskModel, containsModel, orderSimplerShapesFirst);
    }

    public TubmanEngine(OutlineEngine delegateEngine, Model trackBounds, Model optimizeContains, boolean divideAndConquer, MaskModel maskModel, ContainsModel containsModel, boolean orderSimplerShapesFirst) {
        this.delegateEngine = delegateEngine;
        this.trackBounds = trackBounds;
        this.optimizeContains = optimizeContains;
        this.divideAndConquer = divideAndConquer;
        this.maskModel = maskModel;
        this.containsModel = containsModel;
        this.orderSimplerShapesFirst = orderSimplerShapesFirst;
    }

    Comparator<OutlineOperation> orderComparator = new Comparator<OutlineOperation>() {

        @Override
        public int compare(OutlineOperation s1, OutlineOperation s2) {
            int order1 = getOrder(s1.shape);
            int order2 = getOrder(s2.shape);
            int k = Integer.compare(order1, order2);

            if (k != 0)
                return k;

            Rectangle2D r1 = getBounds(s1.shape);
            Rectangle2D r2 = getBounds(s2.shape);
            double area1 = r1.getWidth() * r1.getHeight();
            double area2 = r2.getWidth() * r2.getHeight();
            return -Double.compare(area1, area2);
        }
    };

    @Override
    public Shape calculate(List<OutlineOperation> operationQueue) {
        try {

//        if (groupUnrelatedShapes != Model.NONE) {
//            groupUnrelatedShapes(operationQueue);
//        }

            if (orderSimplerShapesFirst) {
                Collections.sort(operationQueue, orderComparator);
            }

            if (divideAndConquer) {
                operationQueue = divideAndConquer(operationQueue);
            } else {
                operationQueue = serial(operationQueue);
            }

            if (operationQueue.size() == 1) {
                return operationQueue.get(0).shape;
            }

            return delegateEngine.calculate(operationQueue);
        } finally {
            boundsMap.clear();
            orderMap.clear();
            maskMap.clear();
        }
    }

    private List<OutlineOperation> serial(List<OutlineOperation> operationQueue) {
        List<OutlineOperation> newQueue = new ArrayList<>(operationQueue.size());

        OutlineOperation lastOp = null;
        for(OutlineOperation op : operationQueue) {
            if (lastOp == null || lastOp.type != op.type) {
                if (lastOp != null)
                    newQueue.add(lastOp);
                lastOp = op;
            } else {
                if (op.type == OutlineOperation.Type.ADD || op.type == OutlineOperation.Type.SUBTRACT) {
                    Shape newShape = add(lastOp.shape, op.shape);
                    lastOp = createOperation(op.type, newShape);
                } else if (op.type == OutlineOperation.Type.INTERSECT) {
                    Shape newShape = intersect(lastOp.shape, op.shape);
                    lastOp = createOperation(OutlineOperation.Type.INTERSECT, newShape);
                } else if (op.type == OutlineOperation.Type.XOR) {
                    Shape newShape = xor(lastOp.shape, op.shape);
                    lastOp = createOperation(OutlineOperation.Type.XOR, newShape);
                } else {
                    // this shouldn't be possible, but in case something changes:
                    newQueue.add(lastOp);
                    lastOp = op;
                }
            }
        }

        if (lastOp != null)
            newQueue.add(lastOp);

        return newQueue;
    }

    private List<OutlineOperation> divideAndConquer(List<OutlineOperation> operationQueue) {
        boolean needsAnotherPass = true;
        do {
            needsAnotherPass = false;

            List<OutlineOperation> newQueue = new ArrayList<>(operationQueue.size());
            Iterator<OutlineOperation> iter = operationQueue.iterator();
            OutlineOperation nextOp = null;
            while (iter.hasNext()) {
                if (nextOp == null) {
                    nextOp = iter.next();
                }
                OutlineOperation op1 = nextOp;
                nextOp = null;

                if (!iter.hasNext()) {
                    newQueue.add(op1);
                    break;
                }

                OutlineOperation op2 = iter.next();
                if (op2.type == op1.type) {
                    if (op1.type == OutlineOperation.Type.ADD || op1.type == OutlineOperation.Type.SUBTRACT) {
                        Shape newShape = add(op1.shape, op2.shape);
                        newQueue.add(createOperation(op1.type, newShape));
                        needsAnotherPass = true;
                    } else if (op1.type == OutlineOperation.Type.INTERSECT) {
                        Shape newShape = intersect(op1.shape, op2.shape);
                        newQueue.add(createOperation(OutlineOperation.Type.INTERSECT, newShape));
                        needsAnotherPass = true;
                    } else if (op1.type == OutlineOperation.Type.XOR) {
                        Shape newShape = xor(op1.shape, op2.shape);
                        newQueue.add(createOperation(OutlineOperation.Type.XOR, newShape));
                        needsAnotherPass = true;
                    } else {
                        // this isn't possible as of this writing, but in case something changes:
                        newQueue.add(op1);
                        newQueue.add(op2);
                    }
                } else {
                    newQueue.add(op1);
                    nextOp = op2;
                }
            }
            if (nextOp != null)
                newQueue.add(nextOp);

            operationQueue = newQueue;
        } while (needsAnotherPass);

        return operationQueue;
    }

    private MaskedOutlineEngine.AppendedShape getAppendedShape(Shape shape1, Shape shape2) {
        MaskedOutlineEngine.AppendedShape appendedShape;
        if (shape1 instanceof MaskedOutlineEngine.AppendedShape) {
            appendedShape = (MaskedOutlineEngine.AppendedShape) shape1;
        } else {
            appendedShape = new MaskedOutlineEngine.AppendedShape();
            appendedShape.append(shape1);
        }

        if (shape2 instanceof MaskedOutlineEngine.AppendedShape) {
            MaskedOutlineEngine.AppendedShape appendedShape2 = (MaskedOutlineEngine.AppendedShape) shape2;
            for(Shape shape : appendedShape2.shapes) {
                appendedShape.append(shape);
            }
        } else {
            appendedShape.append(shape2);
        }

        return appendedShape;
    }

    private Shape add(Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        boolean empty2 = ShapeUtils.isEmpty(shape2);

        if (empty1 && empty2)
            return new Area();
        if (empty1)
            return new Area(shape2);
        if (empty2)
            return new Area(shape1);

        Rectangle2D bounds1 = null;
        Rectangle2D bounds2 = null;
        RectangleMask2D mask1 = null;
        RectangleMask2D mask2 = null;

        if (trackBounds == Model.RECTANGLE || trackBounds == Model.MASK) {
            if (bounds1 == null)
                bounds1 = getBounds(shape1);
            if (bounds2 == null)
                bounds2 = getBounds(shape2);

            if (!(bounds1.intersects(bounds2))) {
                MaskedOutlineEngine.AppendedShape appendedShape = getAppendedShape(shape1, shape2);
                bounds1.add(bounds2);
                setBounds(appendedShape, bounds1);
                mask1 = getMask(shape1, false);
                mask2 = getMask(shape2, false);
                RectangleMask2D appendedShapeMask = null;
                if (mask1 != null && mask2 != null) {
                    mask1.add(mask2);
                    appendedShapeMask = mask1;
                } else if (mask1 != null) {
                    mask1.add(new RectangleMask2D(bounds2));
                    appendedShapeMask = mask1;
                } else if (mask2 != null) {
                    mask2.add(new RectangleMask2D(bounds1));
                    appendedShapeMask = mask2;
                }
                if (appendedShapeMask != null)
                    setMask(appendedShape, appendedShapeMask);
                return appendedShape;
            }
        }

        ShapeUtils.Relationship boundsBasedRelationship = null;
        if (optimizeContains == Model.RECTANGLE) {
            if (bounds1 == null)
                bounds1 = getBounds(shape1);
            if (bounds2 == null)
                bounds2 = getBounds(shape2);

            if (bounds1.contains(bounds2)) {
                if (containsModel == ContainsModel.SHAPE_UTILS) {
                    boundsBasedRelationship = ShapeUtils.getRelationship(shape1, bounds1, bounds2, bounds2);
                } else {
                    boundsBasedRelationship = shape1.contains(bounds2) ? ShapeUtils.Relationship.LHS_CONTAINS_RHS : ShapeUtils.Relationship.OTHER;
                }
            } else if (bounds2.contains(bounds1)) {
                if (containsModel == ContainsModel.SHAPE_UTILS) {
                    boundsBasedRelationship = ShapeUtils.getRelationship(bounds1, bounds1, shape2, bounds2);
                } else {
                    boundsBasedRelationship = shape2.contains(bounds1) ? ShapeUtils.Relationship.RHS_CONTAINS_LHS : ShapeUtils.Relationship.OTHER;
                }
            } else {
                boundsBasedRelationship = null;
            }
        }

        if (boundsBasedRelationship == ShapeUtils.Relationship.LHS_CONTAINS_RHS) {
            return shape1;
        }
        if (boundsBasedRelationship == ShapeUtils.Relationship.RHS_CONTAINS_LHS) {
            return shape2;
        }

        boolean testedMaskIntersection = false;
        boolean testedMaskContainment = false;
        for (boolean canCalculateMissingMask : new boolean[] {false, true}) {
            if (trackBounds == Model.MASK) {
                if (bounds1 == null)
                    bounds1 = getBounds(shape1);
                if (bounds2 == null)
                    bounds2 = getBounds(shape2);

                if (mask1 == null)
                    mask1 = getMask(shape1, canCalculateMissingMask);
                if (mask2 == null)
                    mask2 = getMask(shape2, canCalculateMissingMask);

                boolean appendShapes;
                if (mask1 != null && !mask1.intersects(bounds2)) {
                    appendShapes = true;
                } else if (mask2 != null && !mask2.intersects(bounds1)) {
                    appendShapes = true;
                } else if (mask1 != null && mask2 != null && !testedMaskIntersection) {
                    testedMaskIntersection = true;
                    if(!mask1.intersects(mask2)) {
                        appendShapes = true;
                    } else {
                        appendShapes = false;
                    }
                } else {
                    appendShapes = false;
                }

                if (appendShapes) {
                    MaskedOutlineEngine.AppendedShape appendedShape = getAppendedShape(shape1, shape2);
                    bounds1.add(bounds2);
                    setBounds(appendedShape, bounds1);
                    RectangleMask2D appendedShapeMask = null;
                    if (mask1 != null && mask2 != null) {
                        mask1.add(mask2);
                        appendedShapeMask = mask1;
                    } else if (mask1 != null) {
                        mask1.add(new RectangleMask2D(bounds2));
                        appendedShapeMask = mask1;
                    } else if (mask2 != null) {
                        mask2.add(new RectangleMask2D(bounds1));
                        appendedShapeMask = mask2;
                    }
                    if (appendedShapeMask != null)
                        setMask(appendedShape, appendedShapeMask);
                    return appendedShape;
                }
            }

            if (optimizeContains == Model.MASK) {
                if (bounds1 == null)
                    bounds1 = getBounds(shape1);
                if (bounds2 == null)
                    bounds2 = getBounds(shape2);

                if (mask1 == null)
                    mask1 = getMask(shape1, canCalculateMissingMask);
                if (mask2 == null)
                    mask2 = getMask(shape2, canCalculateMissingMask);

                ShapeUtils.Relationship maskBasedRelationship = null;
                if (mask1 != null && mask2 != null && !testedMaskContainment) {
                    testedMaskContainment = true;
                    if (mask1.contains(mask2)) {
                        if (containsModel == ContainsModel.SHAPE_UTILS) {
                            maskBasedRelationship = ShapeUtils.getRelationship(shape1, bounds1, bounds2, bounds2);
                        } else if (containsModel == ContainsModel.SHAPE) {
                            maskBasedRelationship = shape1.contains(bounds2) ? ShapeUtils.Relationship.LHS_CONTAINS_RHS : ShapeUtils.Relationship.OTHER;
                        } else if (containsModel == ContainsModel.MASK) {
                            maskBasedRelationship = mask2.isContainedBy(shape1) ? ShapeUtils.Relationship.LHS_CONTAINS_RHS : ShapeUtils.Relationship.OTHER;
                        }
                    } else if (mask2.contains(mask1)) {
                        if (containsModel == ContainsModel.SHAPE_UTILS) {
                            maskBasedRelationship = ShapeUtils.getRelationship(bounds1, bounds1, shape2, bounds2);
                        } else if (containsModel == ContainsModel.SHAPE) {
                            maskBasedRelationship = shape2.contains(bounds1) ? ShapeUtils.Relationship.RHS_CONTAINS_LHS : ShapeUtils.Relationship.OTHER;
                        } else if(containsModel == ContainsModel.MASK) {
                            maskBasedRelationship = mask1.isContainedBy(shape2) ? ShapeUtils.Relationship.RHS_CONTAINS_LHS : ShapeUtils.Relationship.OTHER;
                        }
                    }
                } else if(mask1 != null && mask2 == null) {
                    // this can only occur when canCalculateMissingMask = false
                    // this is less precise info, but maybe still worth exploring:
                    if (mask1.contains(bounds2)) {
                        if (containsModel == ContainsModel.SHAPE_UTILS) {
                            maskBasedRelationship = ShapeUtils.getRelationship(shape1, bounds1, bounds2, bounds2);
                        } else if (containsModel == ContainsModel.SHAPE) {
                            maskBasedRelationship = shape1.contains(bounds2) ? ShapeUtils.Relationship.LHS_CONTAINS_RHS : ShapeUtils.Relationship.OTHER;
                        } else if (containsModel == ContainsModel.MASK) {
                            // erg, can't test this
                        }
                    }
                } else if(mask2 != null && mask1 == null) {
                    if (mask2.contains(bounds1)) {
                        if (containsModel == ContainsModel.SHAPE_UTILS) {
                            maskBasedRelationship = ShapeUtils.getRelationship(bounds1, bounds1, shape2, bounds2);
                        } else if (containsModel == ContainsModel.SHAPE) {
                            maskBasedRelationship = shape2.contains(bounds1) ? ShapeUtils.Relationship.RHS_CONTAINS_LHS : ShapeUtils.Relationship.OTHER;
                        } else if(containsModel == ContainsModel.MASK) {
                            // likewise can't test this
                        }
                    }
                }
                if (maskBasedRelationship == ShapeUtils.Relationship.LHS_CONTAINS_RHS) {
                    return shape1;
                }
                if (maskBasedRelationship == ShapeUtils.Relationship.RHS_CONTAINS_LHS) {
                    return shape2;
                }
            }
        }

        Area result = new Area(shape1);
        Area area2 = new Area(shape2);
        result.add(area2);

        if (bounds1 != null && bounds2 != null) {
            Rectangle2D sumBounds = new Rectangle2D.Double();
            sumBounds.setFrame(bounds1);
            sumBounds.add(bounds2);
            setBounds(result, sumBounds);
        }

        if (mask1 != null && mask2 != null) {
            mask1.add(mask2);
            setMask(result, mask1);
        }

        return result;
    }

    private void setBounds(Shape shape, Rectangle2D bounds) {
        boundsMap.put(shape, bounds);
    }

    private Rectangle2D getBounds(Shape shape) {
        Rectangle2D r = boundsMap.get(shape);
        if (r == null) {
            r = ShapeUtils.getBounds2D(shape.getPathIterator(null));
            boundsMap.put(shape, r);
        }
        return (Rectangle2D) r.clone();
    }

    private void setOrder(Shape shape, Integer order) {
        orderMap.put(shape, order);
    }

    private Integer getOrder(Shape shape) {
        Integer order = orderMap.get(shape);
        if (order == null) {
            order = ShapeUtils.getOrder(shape.getPathIterator(null));
            orderMap.put(shape, order);
        }
        return order;
    }

    private void setMask(Shape shape, RectangleMask2D mask) {
        maskMap.put(shape, mask);
    }

    private RectangleMask2D getMask(Shape shape, boolean canCalculateIfMissing) {
        RectangleMask2D r = maskMap.get(shape);
        if (r == null) {
            if (!canCalculateIfMissing)
                return null;

            if (maskModel == MaskModel.EXACT) {
                r = new RectangleMask2D(shape, null, Double.MAX_VALUE, true);
            } else if (maskModel == MaskModel.APPROXIMATE) {
                r = new RectangleMask2D( shape, null, Double.MAX_VALUE, false);
            } else {
                r = new RectangleMask2D( getBounds(shape) );
            }
            maskMap.put(shape, r);
        }
        return r;
    }

    private Area intersect(Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        boolean empty2 = ShapeUtils.isEmpty(shape2);

        if (empty1 || empty2)
            return new Area();

        Area area1 = new Area(shape1);
        Area area2 = new Area(shape2);
        area1.intersect(area2);
        return area1;
    }

    private Area xor(Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        boolean empty2 = ShapeUtils.isEmpty(shape2);

        if (empty1 && empty2)
            return new Area();
        if (empty1)
            return new Area(shape2);
        if (empty2)
            return new Area(shape1);

        Area area1 = new Area(shape1);
        Area area2 = new Area(shape2);
        area1.exclusiveOr(area2);
        return area1;
    }

    @Override
    public OutlineOperation createOperation(OutlineOperation.Type type, Shape shape) {
        return delegateEngine.createOperation(type, shape);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"[ trackBounds = "+trackBounds+
                ", optimizeContains = "+optimizeContains+
                // " divideAndConquer = "+divideAndConquer+
                " maskModel = "+maskModel+
                " containsModel = "+containsModel+
                " orderSimplerShapesFirst = "+orderSimplerShapesFirst+
                "]";
    }
}
