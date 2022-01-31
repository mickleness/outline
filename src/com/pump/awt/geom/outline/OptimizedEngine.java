package com.pump.awt.geom.outline;

import com.pump.awt.geom.AddingShape;
import com.pump.awt.geom.ShapeUtils;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
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
        removeTransforms(operationQueue);
        operationQueue = consolidate(operationQueue);

        if (operationQueue.size() == 1) {
            OutlineOperation op = operationQueue.get(0);
            if (op.type == OutlineOperation.Type.ADD || op.type == OutlineOperation.Type.XOR)
               return op.shape;
        }

        return delegateEngine.calculate(operationQueue);
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
            currentTx = null;
        }
    }

    /**
     * Consolidate all consecutive operations of the same type. For example: 5 consecutive add operations
     * can be consolidated into 1 add operation. 5 clip operations can become 1 clip, etc.
     */
    private List<OutlineOperation> consolidate(List<OutlineOperation> operationQueue) {
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
    public String toString() {
        return getClass().getSimpleName();
    }
}
