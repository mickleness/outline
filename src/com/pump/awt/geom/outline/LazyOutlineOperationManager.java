package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.clip.RectangularClipperFactory;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;

/**
 * This OutlineEngine optimizes some operations before passing them
 * to a delegate engine.
 */
class LazyOutlineOperationManager {

    public Shape execute(OutlineFactory outlineFactory, List<OutlineOperation> operationQueue) {
        removeAndPropagateTransforms(operationQueue);
        removeOperationsOutsideOfClipping(operationQueue);
        removeSubtractionsAndReplaceXors(operationQueue);

        removeRectangularClipping(operationQueue);

        consolidateOperationsWithSameType(outlineFactory, operationQueue);

        if (operationQueue.size() == 1) {
            OutlineOperation op = operationQueue.get(0);
            return op.shape;
        }

        CompoundOutline result = new CompoundOutline(outlineFactory);
        for (OutlineOperation op : operationQueue) {
            switch (op.type) {
                case ADD:
                    result.add(op.shape);
                    break;
                case SUBTRACT:
                    result.subtract(op.shape);
                    break;
                case CLIP:
                    result.clip(op.shape);
                    break;
                case EXCLUSIVE_OR:
                    result.exclusiveOr(op.shape);
                    break;
            }
        }

        // some external libraries may have their own optimizations that
        // benefit from knowing if a shape is an instanceof an Area:
        if (result.getShapeCount() == 1)
            return result.getShapes()[0];

        return result;
    }

    private void removeRectangularClipping(List<OutlineOperation> operationQueue) {
        ListIterator<OutlineOperation> iter = operationQueue.listIterator(operationQueue.size());
        Rectangle2D clipBounds = null;
        while (iter.hasPrevious()) {
            OutlineOperation op = iter.previous();
            if (op.type == OutlineOperation.Type.CLIP) {
                Rectangle2D opBounds = ShapeUtils.getBounds2D(op.shape);
                Rectangle2D opAsRect = ShapeUtils.toRectangle2D(op.shape.getPathIterator(null));
                if (opAsRect != null) {
                    iter.remove();
                }

                if (clipBounds == null) {
                    clipBounds = opBounds;
                } else {
                    Rectangle2D.intersect(clipBounds, opBounds, clipBounds);
                }

                if (clipBounds.isEmpty()) {
                    // we should have previously identified this condition in another method, but just in case
                    // it's trivial to address here too:
                    while (iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    return;
                }
            } else {
                if (clipBounds != null) {
                    Shape clippedShape = RectangularClipperFactory.get().createClipper().clip(op.shape, null, clipBounds);
                    OutlineOperation newOp = new OutlineOperation(op.type, clippedShape);
                    iter.set(newOp);
                }
            }
        }
    }

    /**
     * This iterates forward through the queue and does two things:
     * 1. If a subtraction op doesn't intersect the existing bounds, then that op is removed.
     * 2. If an xor op doesn't intersect the existing bounds, then it is converted to an add op.
     *
     * This uses rectangles to approximate intersection, so it's possible this scan will mess
     * some subtraction/xor ops that should (to a human eye) be removed or converted.
     */
    private void removeSubtractionsAndReplaceXors(List<OutlineOperation> operationQueue) {
        ListIterator<OutlineOperation> iter = operationQueue.listIterator();
        Rectangle2D totalBounds = null;
        while (iter.hasNext()) {
            OutlineOperation op = iter.next();
            Rectangle2D opBounds = ShapeUtils.getBounds2D(op.shape);

            if (op.type == OutlineOperation.Type.EXCLUSIVE_OR) {
                if (totalBounds == null || !totalBounds.intersects(opBounds)) {
                    op = new OutlineOperation(OutlineOperation.Type.ADD, op.shape);
                    iter.set(op);
                }
            }

            switch (op.type) {
                case SUBTRACT:
                    if (totalBounds == null || !totalBounds.intersects(opBounds))
                        iter.remove();
                    break;
                case CLIP:
                    if (totalBounds == null) {
                        iter.remove();
                    } else {
                        Rectangle2D.intersect(totalBounds, opBounds, totalBounds);
                        if (totalBounds.isEmpty())
                            totalBounds = null;
                    }
                    break;
                default:
                    if (totalBounds == null) {
                        totalBounds = opBounds;
                    } else {
                        totalBounds.add(opBounds);
                    }
                    break;
            }
        }
    }

    /**
     * This removes operations if their bounds fall completely outside of a future clipping operation.
     * This should be called after we remove transforms.
     */
    private void removeOperationsOutsideOfClipping(List<OutlineOperation> operationQueue) {
        ListIterator<OutlineOperation> listIter = operationQueue.listIterator(operationQueue.size());
        Rectangle2D clippingBounds = null;
        while (listIter.hasPrevious()) {
            OutlineOperation op = listIter.previous();
            Rectangle2D bounds = ShapeUtils.getBounds2D(op.shape);

            if (op.type == OutlineOperation.Type.CLIP) {
                if (clippingBounds == null) {
                    clippingBounds = bounds;
                } else {
                    Rectangle2D.intersect(clippingBounds, bounds, clippingBounds);
                }

                if (clippingBounds.isEmpty()) {
                    // nothing else is showing:
                    listIter.remove();
                    while (listIter.hasPrevious()) {
                        listIter.previous();
                        listIter.remove();
                    }
                    return;
                }
            } else {
                if (clippingBounds != null && !bounds.intersects(clippingBounds)) {
                    listIter.remove();
                }
            }
        }
    }

    /**
     * This identifies all Operation.Type.TRANSFORM operations and modifies
     * preceding shape-based operations. This also removes TRANSFORM operations.
     * So after this method is run: the queue will not contain any TRANSFORM
     * operations, and some shape-based operations in the queue may be replaced.
     */
    public void removeAndPropagateTransforms(List<OutlineOperation> operationQueue) {
        ListIterator<OutlineOperation> iter = operationQueue.listIterator();
        AffineTransform currentTx = null;
        while (iter.hasNext()) {
            OutlineOperation op = iter.next();
            if (op.type == OutlineOperation.Type.TRANSFORM) {
                if (currentTx == null) {
                    currentTx = new AffineTransform(op.transform);
                } else {
                    currentTx.preConcatenate(op.transform);
                }
                iter.remove();
            } else if (currentTx != null) {
                if (!currentTx.isIdentity()) {
                    iter.previous();
                    while (iter.hasPrevious()) {
                        OutlineOperation op2 = iter.previous();
                        iter.set(new OutlineOperation(op2.type, currentTx.createTransformedShape(op2.shape)));
                    }
                }
                currentTx = null;
            }
        }

        if (currentTx != null) {
            if (!currentTx.isIdentity()) {
                while (iter.hasPrevious()) {
                    OutlineOperation op2 = iter.previous();
                    iter.set(new OutlineOperation(op2.type, currentTx.createTransformedShape(op2.shape)));
                }
            }
        }
    }

    /**
     * Consolidate all consecutive operations of the same type. For example: 5 consecutive add operations
     * can be consolidated into 1 add operation. 5 clip operations can become 1 clip, etc.
     */
    private void consolidateOperationsWithSameType(OutlineFactory outlineFactory, List<OutlineOperation> operationQueue) {
        ListIterator<OutlineOperation> listIter = operationQueue.listIterator();
        while (listIter.hasNext()) {
            OutlineOperation runStart = listIter.next();

            // we shouldn't have OutlineOperation.Type.TRANSFORM here, but just in case something changes:
            if (runStart.shape != null) {
                Shape newOpShape = runStart.shape;
                boolean dirty = false;
                while (listIter.hasNext()) {
                    OutlineOperation op = listIter.next();
                    if (op.type != runStart.type)
                        break;

                    if (runStart.type == OutlineOperation.Type.ADD || runStart.type == OutlineOperation.Type.SUBTRACT) {
                        newOpShape = add(outlineFactory, newOpShape, op.shape);
                    } else if (runStart.type == OutlineOperation.Type.CLIP) {
                        newOpShape = clip(outlineFactory, newOpShape, op.shape);
                    } else if (op.type == OutlineOperation.Type.EXCLUSIVE_OR) {
                        newOpShape = xor(outlineFactory, newOpShape, op.shape);
                    } else {
                        // this shouldn't be possible; was a new type added?
                        throw new IllegalStateException("op.type = " + runStart.type);
                    }
                    listIter.remove();
                    dirty = true;
                }

                if (dirty) {
                    // rewind to our starting point:
                    while (listIter.previous() != runStart) ;

                    // replace it:
                    listIter.set(new OutlineOperation(runStart.type, newOpShape));
                    listIter.next();
                }
            }
        }
    }

    private CompoundOutline add(OutlineFactory outlineFactory, Shape shape1, Shape shape2) {
        CompoundOutline baseShape;
        if (shape1 instanceof CompoundOutline compoundOutline && compoundOutline.factory == outlineFactory) {
            baseShape = compoundOutline;
        } else {
            baseShape = new CompoundOutline(outlineFactory, shape1);
        }
        baseShape.add(shape2);

        return baseShape;
    }

    private Shape clip(OutlineFactory outlineFactory, Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        if (empty1)
            return shape1;

        boolean empty2 = ShapeUtils.isEmpty(shape2);
        if (empty2)
            return shape2;

        Rectangle2D r1 = ShapeUtils.getBounds2D(shape1);
        Rectangle2D r2 = ShapeUtils.getBounds2D(shape2);

        if (!r1.intersects(r2))
            return new Area();

        if (shape1 instanceof CompoundOutline compoundOutline && compoundOutline.factory == outlineFactory) {
            CompoundOutline cs = (CompoundOutline) shape1;
            cs.clip(shape2);
            return cs;
        } else if (shape2 instanceof CompoundOutline compoundOutline && compoundOutline.factory == outlineFactory) {
            CompoundOutline cs = compoundOutline;
            cs.clip(shape1);
            return cs;
        }

        Rectangle2D r1b = ShapeUtils.toRectangle2D(shape1);
        Rectangle2D r2b = ShapeUtils.toRectangle2D(shape2);

        if (r1b != null) {
            return RectangularClipperFactory.get().createClipper().clip(shape2, null, r1b);
        } else if(r2b != null) {
            return RectangularClipperFactory.get().createClipper().clip(shape1, null, r2b);
        }

        Outline returnValue = outlineFactory.create(shape1);
        returnValue.clip(shape2);
        return returnValue;
    }

    private Shape xor(OutlineFactory outlineFactory, Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        if (empty1)
            return shape2;

        boolean empty2 = ShapeUtils.isEmpty(shape2);
        if (empty2)
            return shape1;

        CompoundOutline returnValue = new CompoundOutline(outlineFactory, shape1);
        returnValue.exclusiveOr(shape2);

        return returnValue;
    }
}
