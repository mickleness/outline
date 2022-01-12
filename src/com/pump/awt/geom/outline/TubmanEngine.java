package com.pump.awt.geom.outline;

import com.pump.awt.geom.ClosedPathIterator;
import com.pump.awt.geom.ShapeUtils;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;

public class TubmanEngine implements OutlineEngine {
    OutlineEngine delegateEngine;
    final boolean trackBounds, optimizeContains, groupUnrelatedShapes, smartMerge;

    public TubmanEngine(boolean groupUnrelatedShapes, boolean trackBounds, boolean optimizeContains, boolean smartMerge) {
        this(new PlainAreaEngine(), groupUnrelatedShapes, trackBounds, optimizeContains, smartMerge);
    }

    public TubmanEngine(OutlineEngine delegateEngine, boolean groupUnrelatedShapes, boolean trackBounds, boolean optimizeContains, boolean smartMerge) {
        this.delegateEngine = delegateEngine;
        this.trackBounds = trackBounds;
        this.optimizeContains = optimizeContains;
        this.groupUnrelatedShapes = groupUnrelatedShapes;
        this.smartMerge = smartMerge;
    }

    @Override
    public Shape calculate(List<OutlineOperation> operationQueue) {

        if (groupUnrelatedShapes) {
            groupUnrelatedShapes(operationQueue);
        }

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
        } while(needsAnotherPass);

        return delegateEngine.calculate(operationQueue);
    }

    private void groupUnrelatedShapes(List<OutlineOperation> operationQueue) {
        // TODO: consider runs of different op types. This only works when everything is an ADD
        for(int a = 0; a < operationQueue.size(); a++) {
            Shape shape1 = operationQueue.get(a).shape;
            Rectangle2D r1 = getBounds(shape1);
            for(int b = a + 1; b < operationQueue.size(); b++) {
                Rectangle2D r2 = getBounds(operationQueue.get(b).shape);
                if (!r1.intersects(r2)) {
                    MaskedOutlineEngine.AppendedShape appendedShape;
                    if (shape1 instanceof MaskedOutlineEngine.AppendedShape) {
                        ((MaskedOutlineEngine.AppendedShape)shape1).append(operationQueue.get(b).shape);
                    } else {
                        MaskedOutlineEngine.AppendedShape newShape = new MaskedOutlineEngine.AppendedShape();
                        newShape.append(operationQueue.get(a).shape);
                        newShape.append(operationQueue.get(b).shape);
                        operationQueue.set(a, createOperation(operationQueue.get(a).type, newShape));
                    }
                    operationQueue.remove(b);
                    b--;

                    r1.add(r2);
                    setBounds(operationQueue.get(a).shape, r1);
                }
            }
        }
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

        Rectangle2D bounds1, bounds2;
        if (trackBounds) {
            bounds1 = getBounds(shape1);
            bounds2 = getBounds(shape2);

            if (!(bounds1.intersects(bounds2))) {
                MaskedOutlineEngine.AppendedShape appendedShape;
                if (shape1 instanceof MaskedOutlineEngine.AppendedShape) {
                    appendedShape = (MaskedOutlineEngine.AppendedShape) shape1;
                } else {
                    appendedShape = new MaskedOutlineEngine.AppendedShape();
                    appendedShape.append(shape1);
                }
                appendedShape.append(shape2);
                return appendedShape;
            }

            if (optimizeContains) {
                ShapeUtils.Relationship r;
                if (bounds1.contains(bounds2)) {
                    r = ShapeUtils.getRelationship(shape1, bounds1, bounds2, bounds2);
                } else if (bounds2.contains(bounds1)) {
                    r = ShapeUtils.getRelationship(bounds1, bounds1, shape2, bounds2);
                } else {
                    r = null;
                }
                if (r == ShapeUtils.Relationship.LHS_CONTAINS_RHS)
                    return shape1;
                if (r == ShapeUtils.Relationship.RHS_CONTAINS_LHS)
                    return shape2;
            }
        } else {
            bounds1 = null;
            bounds2 = null;
        }

        Area result = null;
        if (smartMerge) {
            if (shape1 instanceof MaskedOutlineEngine.AppendedShape) {
                MaskedOutlineEngine.AppendedShape as1 = (MaskedOutlineEngine.AppendedShape) shape1;
                for (Shape s : as1.shapes) {
                    if (s instanceof Area) {
                        if (result == null) {
                            // TODO: it'd be great if we could *sometimes* clone this shape IFF it came
                            // to us externally
                            result = (Area)s;
                        } else {
                            result.add( (Area) s);
                        }
                    } else {
                        if (result == null) {
                            result = new Area(s);
                        } else {
                            result.add(new Area(s));
                        }
                    }
                }
            } else {
                result = new Area(shape1);
            }

            if (shape2 instanceof MaskedOutlineEngine.AppendedShape) {
                MaskedOutlineEngine.AppendedShape as2 = (MaskedOutlineEngine.AppendedShape) shape2;
                for (Shape s : as2.shapes) {
                    if (s instanceof Area) {
                        result.add( (Area) s);
                    } else {
                        result.add(new Area(s));
                    }
                }
            } else {
                result.add(new Area(shape2));
            }
        } else {
            result = new Area(shape1);
            Area area2 = new Area(shape2);
            result.add(area2);
        }

        if (bounds1 != null && bounds2 != null) {
            Rectangle2D sumBounds = new Rectangle2D.Double();
            sumBounds.setFrame(bounds1);
            sumBounds.add(bounds2);
            setBounds(result, sumBounds);
        }

        return result;
    }

    Map<Shape, Rectangle2D> boundsMap = new HashMap<>();
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
        return getClass().getSimpleName()+"[ trackBounds = "+trackBounds+", optimizeContains = "+optimizeContains+" groupUnrelatedShapes = "+groupUnrelatedShapes+", smartMerge = "+smartMerge+"]";
    }
}
