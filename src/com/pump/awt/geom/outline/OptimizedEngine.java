package com.pump.awt.geom.outline;

import com.pump.awt.geom.AddingShape;
import com.pump.awt.geom.ShapeUtils;
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
        // remove transforms by propagating them across all the ops they affect
        removeTransforms(operationQueue);
        removeOperationsOutsideOfClipping(operationQueue);
        removeSubtractionsAndReplaceXors(operationQueue);
        operationQueue = consolidateOperationsWithSameType(operationQueue);

        if (operationQueue.size() == 1) {
            OutlineOperation op = operationQueue.get(0);
            return op.shape;
        }

        return delegateEngine.calculate(operationQueue);
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

    private AddingShape add(Shape shape1, Shape shape2) {
        AddingShape baseShape;
        if (shape1 instanceof AddingShape) {
            baseShape = (AddingShape) shape1;
        } else {
            // TODO: should we pass our delegate engine into AddingShape's constructor?
            // AddingShape currently creates Areas, which is really what the delegate engine should
            // decide to do or not. (Someday an alt engine might use a different class.)
            baseShape = new AddingShape(shape1);
        }
        baseShape.addSafely(shape2);

        return baseShape;
    }

    private Area intersect(Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        boolean empty2 = ShapeUtils.isEmpty(shape2);

        if (empty1 || empty2)
            return new Area();

        Rectangle2D r1 = ShapeUtils.getBounds2D(shape1);
        Rectangle2D r2 = ShapeUtils.getBounds2D(shape2);

        if (!r1.intersects(r2))
            return new Area();

        // TODO: use delegateEngine to decide whether to use Areas or not, use Clipper for rects

        Area area1 = new Area(shape1);
        Area area2 = new Area(shape2);
        area1.intersect(area2);
        return area1;
    }

    private Shape xor(Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        boolean empty2 = ShapeUtils.isEmpty(shape2);

        if (empty1 && empty2)
            return new Area();
        if (empty1)
            return shape2;
        if (empty2)
            return shape1;

        // TODO: use delegateEngine to decide whether to use Areas or not

        Area area1 = new Area(shape1);
        Area area2 = new Area(shape2);
        area1.exclusiveOr(area2);
        return area1;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
