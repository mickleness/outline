package com.pump.awt.geom.outline;

import com.pump.awt.geom.CompoundShape;
import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.clip.RectangularClipper;
import com.pump.awt.geom.clip.RectangularClipperFactory;
import com.pump.util.ListUtils;

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
public class OptimizedEngine implements OutlineEngine {

    OutlineEngine delegateEngine;

    public OptimizedEngine() {
        this(new PlainAreaEngine());
    }

    public OptimizedEngine(OutlineEngine delegateEngine) {
        this.delegateEngine = delegateEngine;
    }

    @Override
    public Shape calculate(List<OutlineOperation> operationQueue) {
        // remove transforms by propagating them across all the ops they affected
        removeTransforms(operationQueue);
        removeOperationsOutsideOfClipping(operationQueue);
        removeSubtractionsAndReplaceXors(operationQueue);

        removeRectangularClipping(operationQueue);

        operationQueue = consolidateOperationsWithSameType(operationQueue);

        if (operationQueue.size() == 1) {
            OutlineOperation op = operationQueue.get(0);
            return op.shape;
        }

        CompoundShape result = new CompoundShape(delegateEngine);
        for (OutlineOperation op : operationQueue) {
            switch (op.type) {
                case ADD:
                    result.addSafely(op.shape);
                    break;
                case SUBTRACT:
                    result.subtract(op.shape);
                    break;
                case INTERSECT:
                    result.clip(op.shape);
                    break;
                case XOR:
                    result.xor(op.shape);
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
            if (op.type == OutlineOperation.Type.INTERSECT) {
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

            if (op.type == OutlineOperation.Type.XOR) {
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
                case INTERSECT:
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
        Iterator<OutlineOperation> listIter = ListUtils.descendingIterator(operationQueue);
        Rectangle2D clippingBounds = null;
        while (listIter.hasNext()) {
            OutlineOperation op = listIter.next();
            Rectangle2D bounds = ShapeUtils.getBounds2D(op.shape);

            if (op.type == OutlineOperation.Type.INTERSECT) {
                if (clippingBounds == null) {
                    clippingBounds = bounds;
                } else {
                    Rectangle2D.intersect(clippingBounds, bounds, clippingBounds);
                }

                if (clippingBounds.isEmpty()) {
                    // nothing else is showing:
                    listIter.remove();
                    while (listIter.hasNext()) {
                        listIter.next();
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
    public void removeTransforms(List<OutlineOperation> operationQueue) {
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
     *
     * TODO: modify the incoming list if possible; avoid returning a new list here. Just for consistency with other
     * methods in this class.
     */
    private List<OutlineOperation> consolidateOperationsWithSameType(List<OutlineOperation> operationQueue) {
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
                    lastOp = new OutlineOperation(op.type, newShape);
                } else if (op.type == OutlineOperation.Type.INTERSECT) {
                    Shape newShape = intersect(lastOp.shape, op.shape);
                    lastOp = new OutlineOperation(OutlineOperation.Type.INTERSECT, newShape);
                } else if (op.type == OutlineOperation.Type.XOR) {
                    Shape newShape = xor(lastOp.shape, op.shape);
                    lastOp = new OutlineOperation(OutlineOperation.Type.XOR, newShape);
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

    private CompoundShape add(Shape shape1, Shape shape2) {
        CompoundShape baseShape;
        if (shape1 instanceof CompoundShape) {
            baseShape = (CompoundShape) shape1;
        } else {
            baseShape = new CompoundShape(delegateEngine, shape1);
        }
        baseShape.addSafely(shape2);

        return baseShape;
    }

    private Shape intersect(Shape shape1, Shape shape2) {
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

        if (shape1 instanceof CompoundShape) {
            CompoundShape cs = (CompoundShape) shape1;
            cs.clip(shape2);
            return cs;
        } else if (shape2 instanceof CompoundShape) {
            CompoundShape cs = (CompoundShape) shape2;
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

        List<OutlineOperation> newQueue = new LinkedList<>();
        newQueue.add(new OutlineOperation(OutlineOperation.Type.ADD, shape1));
        newQueue.add(new OutlineOperation(OutlineOperation.Type.INTERSECT, shape2));
        return delegateEngine.calculate(newQueue);
    }

    private Shape xor(Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        if (empty1)
            return shape2;

        boolean empty2 = ShapeUtils.isEmpty(shape2);
        if (empty2)
            return shape1;

        CompoundShape returnValue = new CompoundShape(delegateEngine, shape1);
        returnValue.xor(shape2);

        return returnValue;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
