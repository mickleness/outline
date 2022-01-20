package com.pump.awt.geom.outline;

import com.pump.awt.geom.AppendedShape;
import com.pump.awt.geom.ShapeUtils;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.*;
import java.util.List;

public class TubmanEngine implements OutlineEngine {

    static class Context {
        Map<Shape, Rectangle2D> boundsMap = new HashMap<>();

        Rectangle2D getBounds(Shape shape) {
            if (shape instanceof AppendedShape || shape instanceof Area || shape instanceof RectangularShape) {
                return shape.getBounds2D();
            }

            Rectangle2D r = boundsMap.get(shape);
            if (r == null) {
                r = ShapeUtils.getBounds2D(shape.getPathIterator(null));
                boundsMap.put(shape, r);
            }
            return (Rectangle2D) r.clone();
        }
    }

    OutlineEngine delegateEngine;

    public TubmanEngine() {
        this(new PlainAreaEngine());
    }

    public TubmanEngine(OutlineEngine delegateEngine) {
        this.delegateEngine = delegateEngine;
    }

    @Override
    public Shape calculate(List<OutlineOperation> operationQueue) {
        operationQueue = consolidate(operationQueue);

        if (operationQueue.size() == 1) {
            return operationQueue.get(0).shape;
        }

        return delegateEngine.calculate(operationQueue);
    }

    /**
     * Consolidate all consecutive operations of the same type. For example: 5 consecutive add operations
     * can be consolidated into 1 add operation. 5 clip operations can become 1 clip, etc.
     */
    private List<OutlineOperation> consolidate(List<OutlineOperation> operationQueue) {
        Context context = new Context();

        List<OutlineOperation> newQueue = new ArrayList<>(operationQueue.size());

        OutlineOperation lastOp = null;
        for(OutlineOperation op : operationQueue) {
            if (lastOp == null || lastOp.type != op.type) {
                if (lastOp != null)
                    newQueue.add(lastOp);
                lastOp = op;
            } else {
                if (op.type == OutlineOperation.Type.ADD || op.type == OutlineOperation.Type.SUBTRACT) {
                    Shape newShape = add(context, lastOp.shape, op.shape);
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

    private AppendedShape add(Context context, Shape shape1, Shape shape2) {
        AppendedShape baseShape;
        if (shape1 instanceof AppendedShape) {
            baseShape = (AppendedShape) shape1;
        } else {
            baseShape = new AppendedShape(shape1);
        }
        baseShape.appendSafely(shape2);

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
    public OutlineOperation createOperation(OutlineOperation.Type type, Shape shape) {
        return delegateEngine.createOperation(type, shape);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
