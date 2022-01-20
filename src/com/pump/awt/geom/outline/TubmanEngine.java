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

    /**
     * This just raises the visibility of appendGenericShape. In our case: we already have a copy of the bounds and
     * winding rule handy, so it's a waste to regenerate those in a tight loop.
     */
    static class MyAppendedShape extends AppendedShape {
        public MyAppendedShape(Shape shape) {
            super(shape);
        }

        public MyAppendedShape() {
            super();
        }

        @Override
        public void appendGenericShape(int shapeWindingRule, Shape shape, Rectangle2D shapeBounds) throws IncompatibleWindingRuleException {
            super.appendGenericShape(shapeWindingRule, shape, shapeBounds);
        }

        /**
         * This spares us the (admittedly small) expense of making an array if we just want to iterate over the shapes
         * in a tight loop.
         */
        public Iterable<? extends Shape> getRealShapes() {
            return shapes;
        }
    }

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
    boolean splitAppendedShapes;

    public TubmanEngine(boolean splitAppendedShapes) {
        this(new PlainAreaEngine(), splitAppendedShapes);
    }

    public TubmanEngine(OutlineEngine delegateEngine, boolean splitAppendedShapes) {
        this.delegateEngine = delegateEngine;
        this.splitAppendedShapes = splitAppendedShapes;
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

    private Shape add(Context context, Shape shape1, Shape shape2) {
        boolean empty1 = ShapeUtils.isEmpty(shape1);
        boolean empty2 = ShapeUtils.isEmpty(shape2);

        if (empty1 && empty2)
            return new Path2D.Double();
        if (empty1)
            return shape2;
        if (empty2)
            return shape1;

        Rectangle2D bounds1 = context.getBounds(shape1);
        Rectangle2D bounds2 = context.getBounds(shape2);

        if (!(bounds1.intersects(bounds2))) {
            MyAppendedShape appendedShape = new MyAppendedShape(shape1);
            appendedShape.appendSafely(shape2);
            return appendedShape;
        }

        if (bounds1.contains(bounds2) && shape1.contains(bounds2)) {
            return shape1;
        } else if (bounds2.contains(bounds1) && shape2.contains(bounds1)) {
            return shape2;
        }

        if (splitAppendedShapes && shape1 instanceof MyAppendedShape) {
            MyAppendedShape src = (MyAppendedShape) shape1;
            int windingRule = src.getWindingRule();
            MyAppendedShape intersectingShapes = new MyAppendedShape();
            MyAppendedShape nonintersectingShapes = new MyAppendedShape();

            try {
                for (Shape innerShape : src.getRealShapes()) {
                    Rectangle2D innerShapeBounds = context.getBounds(innerShape);
                    if (innerShapeBounds.intersects(bounds2)) {
                        intersectingShapes.appendGenericShape(windingRule, innerShape, innerShapeBounds);
                    } else {
                        nonintersectingShapes.appendGenericShape(windingRule, innerShape, innerShapeBounds);
                    }
                }

                Area area1 = new Area(intersectingShapes);
                Area area2 = new Area(shape2);
                area1.add(area2);

                if (nonintersectingShapes.isEmpty()) {
                    return area1;
                }

                nonintersectingShapes.appendGenericShape(windingRule, area1, area1.getBounds2D());
                return nonintersectingShapes;
            } catch(AppendedShape.IncompatibleWindingRuleException e) {
                // this shouldn't happen, since we're just splitting apart an existing AppendedShape into two
                throw new IllegalStateException(e);
            }
        }


        Area result = new Area(shape1);
        Area area2 = new Area(shape2);
        result.add(area2);

        return result;
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
        return getClass().getSimpleName() + "[ splitAppendedShapes = "+splitAppendedShapes+"]";
    }
}
