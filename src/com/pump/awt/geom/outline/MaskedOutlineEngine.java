package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.mask.RectangleMask2D;

import java.awt.*;
import java.awt.geom.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MaskedOutlineEngine implements OutlineEngine {

    static class AppendedShape implements Shape {
        List<Shape> shapes = new LinkedList<>();

        public void append(Shape shape) {
            if (shape instanceof AppendedShape) {
                AppendedShape as = (AppendedShape) shape;
                shapes.addAll( as.shapes );
            } else {
                shapes.add(shape);
            }
        }

        @Override
        public Rectangle getBounds() {
            return getBounds2D().getBounds();
        }

        @Override
        public Rectangle2D getBounds2D() {
            Rectangle2D sum = null;
            for(Shape shape : shapes) {
                Rectangle2D bounds = (Rectangle2D) shape.getBounds2D().clone();
                if (bounds.isEmpty())
                    continue;
                if (sum == null) {
                    sum = bounds;
                } else {
                    sum.add(bounds);
                }
            }
            if (sum == null)
                sum = new Rectangle2D.Double();
            return sum;
        }

        @Override
        public boolean contains(double x, double y) {
            for (Shape shape : shapes) {
                if (shape.contains(x, y))
                    return true;
            }
            return false;
        }

        @Override
        public boolean contains(Point2D p) {
            for (Shape shape : shapes) {
                if (shape.contains(p))
                    return true;
            }
            return false;
        }

        @Override
        public boolean intersects(double x, double y, double w, double h) {
            for (Shape shape : shapes) {
                if (shape.intersects(x, y, w, h))
                    return true;
            }
            return false;
        }

        @Override
        public boolean intersects(Rectangle2D r) {
            for (Shape shape : shapes) {
                if (shape.intersects(r))
                    return true;
            }
            return false;
        }

        @Override
        public boolean contains(double x, double y, double w, double h) {
            for (Shape shape : shapes) {
                if (shape.contains(x, y, w, h))
                    return true;
            }
            return false;
        }

        @Override
        public boolean contains(Rectangle2D r) {
            for (Shape shape : shapes) {
                if (shape.contains(r))
                    return true;
            }
            return false;
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at) {
            return new AppendedPathIterator(new LinkedList<>(shapes), at, null);
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at, double flatness) {
            return new AppendedPathIterator(new LinkedList<>(shapes), at, Double.valueOf(flatness));
        }
    }

    static class AppendedPathIterator implements PathIterator {

        List<Shape> shapes;
        AffineTransform transform;
        Double flatness;

        PathIterator current;

        public AppendedPathIterator(List<Shape> shapes, AffineTransform transform, Double flatness) {
            this.shapes = shapes;
            this.transform = transform;
            this.flatness = flatness;

            next();
        }

        @Override
        public int getWindingRule() {
            // TODO: address winding rule
            return PathIterator.WIND_NON_ZERO;
        }

        @Override
        public boolean isDone() {
            return current == null;
        }

        @Override
        public void next() {
            if (current != null) {
                current.next();
            }
            if (current == null || current.isDone()) {
                current = null;
                if (!shapes.isEmpty()) {
                    Shape nextShape = shapes.remove(0);
                    if (flatness != null) {
                        current = nextShape.getPathIterator(transform, flatness.doubleValue());
                    } else {
                        current = nextShape.getPathIterator(transform);
                    }
                }
            }
        }

        @Override
        public int currentSegment(float[] coords) {
            if (current != null)
                return current.currentSegment(coords);
            throw new IllegalStateException();
        }

        @Override
        public int currentSegment(double[] coords) {
            if (current != null)
                return current.currentSegment(coords);
            throw new IllegalStateException();
        }
    }

    class ShapeInfo {
        Shape shape;

        int maxOrder;

        /**
         * This rectangle mask contains the bounds of shapes.
         * Initially a ShapeInfo object just represents one shape, so this represents
         * one rectangle. But after five add operations this mask may include six
         * separate rectangles (if none of the six shapes involved overlap).
         */
        RectangleMask2D bounds;

        /**
         * This mask traces a loose contour of the shape. For example: imagine
         * tetris pieces. Their bounding box may overlap, but a mask of their
         * shapes may actually show many configurations in which pieces don't
         * overlap.
         */
        RectangleMask2D mask;
        List<ShapeInfo> pendingMaskAdditions = new LinkedList<>();

        double originalArea;
        Rectangle2D origRect;

        public ShapeInfo() {
            reset(null);
        }

        public ShapeInfo(Shape shape) {
            reset(shape);
        }

        public RectangleMask2D getMask() {
            if (mask == null) {
                Rectangle2D rect = bounds.getBounds2D();
                double area = Math.max(.000000001, rect.getWidth()) * Math.max(.000000001, rect.getHeight());
                double maxSegmentArea = area * divisor;
                mask = new RectangleMask2D(shape, null, maxSegmentArea);
            }

            for(ShapeInfo i : pendingMaskAdditions) {
                mask.add(i.getMask());
            }
            pendingMaskAdditions.clear();

            return mask;
        }

        public void reset(Shape shape) {
            if (shape == null)
                shape = new Path2D.Double();
            this.shape = shape;

            maxOrder = 0;
            PathIterator pi = shape.getPathIterator(null);
            double[] coords = new double[6];
            while (!pi.isDone()) {
                int k = pi.currentSegment(coords);
                if (k == PathIterator.SEG_LINETO || k == PathIterator.SEG_QUADTO || k == PathIterator.SEG_CUBICTO) {
                    maxOrder = Math.max(maxOrder, k);
                }
                pi.next();
            }

            origRect = ShapeUtils.getBounds2D(shape);
            bounds = new RectangleMask2D(origRect);
            originalArea = origRect.getWidth() * origRect.getHeight();
            mask = null;
        }


        /**
         * This appends multiple non-overlapping shapes. The actual shape paths don't need to be calculated.
         */
        public void append(ShapeInfo rhs) {
            if (shape instanceof AppendedShape) {
                AppendedShape as = (AppendedShape) shape;
                as.append(rhs.shape);
            } else {
                AppendedShape newShape = new AppendedShape();
                newShape.append(shape);
                newShape.append(rhs.shape);
                shape = newShape;
            }

            bounds.add(rhs.bounds);
            pendingMaskAdditions.add(rhs);
            maxOrder = Math.max(maxOrder, rhs.maxOrder);
        }

        /**
         * The merges shapes that might overlap.
         */
        public void merge(ShapeInfo rhs) {
            List<OutlineOperation> ops = new LinkedList<>();
            for(Shape s : getShapes(shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.ADD, s));
            }
            for(Shape s : getShapes(rhs.shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.ADD, s));
            }

            shape = parentEngine.calculate(ops);

            bounds.add(rhs.bounds);
            pendingMaskAdditions.add(rhs);
            maxOrder = Math.max(maxOrder, rhs.maxOrder);
        }

        public void subtract(ShapeInfo rhs) {
            List<OutlineOperation> ops = new LinkedList<>();
            for(Shape s : getShapes(shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.ADD, s));
            }
            for(Shape s : getShapes(rhs.shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.SUBTRACT, s));
            }

            shape = parentEngine.calculate(ops);
            reset(shape);
        }

        public void intersect(ShapeInfo rhs) {
            List<OutlineOperation> ops = new LinkedList<>();
            for(Shape s : getShapes(shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.ADD, s));
            }
            for(Shape s : getShapes(rhs.shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.INTERSECT, s));
            }

            shape = parentEngine.calculate(ops);
            reset(shape);
        }

        public void xor(ShapeInfo rhs) {
            List<OutlineOperation> ops = new LinkedList<>();
            for(Shape s : getShapes(shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.ADD, s));
            }
            for(Shape s : getShapes(rhs.shape)) {
                ops.add(parentEngine.createOperation(OutlineOperation.Type.XOR, s));
            }

            shape = parentEngine.calculate(ops);
            reset(shape);
        }

        private List<Shape> getShapes(Shape shape) {
            List<Shape> returnValue = new LinkedList<>();
            if (shape instanceof AppendedShape) {
                AppendedShape as = (AppendedShape) shape;
                for (Shape s : as.shapes) {
                    returnValue.addAll( getShapes(s) );
                }
            } else {
                returnValue.add(shape);
            }
            return returnValue;
        }
    }

    class MaskedOutlineOperation extends OutlineOperation {
        ShapeInfo info;

        public MaskedOutlineOperation(Type type, Shape shape) {
            super(type, shape);
            info = new ShapeInfo(shape);
        }
    }

    OutlineEngine parentEngine;
    double divisor;

    public MaskedOutlineEngine(double divisor) {
        this(new PlainAreaEngine(), divisor);
    }

    public MaskedOutlineEngine(OutlineEngine parentEngine, double divisor) {
        this.parentEngine = parentEngine;
        this.divisor = divisor;
    }

    private static Comparator<MaskedOutlineOperation> SIMPLEST_SHAPE_SMALLEST_AREA = new Comparator<MaskedOutlineOperation>() {
        @Override
        public int compare(MaskedOutlineOperation o1, MaskedOutlineOperation o2) {
            int k = Integer.compare(o1.info.maxOrder, o2.info.maxOrder);
            if (k != 0)
                return k;
            return Double.compare(o1.info.originalArea, o2.info.originalArea);
        }
    };

    private static Comparator<MaskedOutlineOperation> SIMPLEST_SHAPE_LARGEST_AREA = new Comparator<MaskedOutlineOperation>() {
        @Override
        public int compare(MaskedOutlineOperation o1, MaskedOutlineOperation o2) {
            int k = Integer.compare(o1.info.maxOrder, o2.info.maxOrder);
            if (k != 0)
                return k;
            return -Double.compare(o1.info.originalArea, o2.info.originalArea);
        }
    };

    @Override
    public Shape calculate(List<OutlineOperation> operationQueue) {
        ShapeInfo returnValue = new ShapeInfo(new Path2D.Double());

        for(List<MaskedOutlineOperation> run : getRunsOfSameType(operationQueue)) {
            if (run.get(0).type == OutlineOperation.Type.INTERSECT || run.get(0).type == OutlineOperation.Type.XOR) {
                // clip to the smallest size first to maybe make other ops redundant
                // (not sure if any sorting can help xor ops?)
                Collections.sort(run, SIMPLEST_SHAPE_SMALLEST_AREA);
            } else {
                // do the largest ops first, and hopefully then smaller ops become null ops
                Collections.sort(run, SIMPLEST_SHAPE_LARGEST_AREA);
            }

            for(OutlineOperation op : run) {
                switch (op.type) {
                    case ADD:
                        add(returnValue, op);
                        break;
                    case SUBTRACT:
                        subtract(returnValue, op);
                        break;
                    case INTERSECT:
                        intersect(returnValue, op);
                        break;
                    case XOR:
                        xor(returnValue, op);
                        break;
                    default:
                        throw new RuntimeException("Unrecognized operation type: "+op.type);
                }
            }
        }
        return returnValue.shape;
    }

    private List<List<MaskedOutlineOperation>> getRunsOfSameType(List<OutlineOperation> allOperations) {
        List<List<MaskedOutlineOperation>> returnValue = new LinkedList<>();

        while (!allOperations.isEmpty()) {
            List<MaskedOutlineOperation> currentRun = new LinkedList<>();
            currentRun.add( (MaskedOutlineOperation) allOperations.remove(0));
            OutlineOperation.Type runType = currentRun.get(0).type;
            while( !allOperations.isEmpty() && allOperations.get(0).type == runType) {
                currentRun.add( (MaskedOutlineOperation) allOperations.remove(0));
            }
            returnValue.add(currentRun);
        }

        return returnValue;
    }

    private void add(ShapeInfo returnValue, OutlineOperation op) {
        MaskedOutlineOperation mop = (MaskedOutlineOperation) op;

        if (mop.info.bounds.isEmpty()) {
            // this is a null-op
            return;
        }

        // first only consult bounds:
        if (!returnValue.bounds.intersects(mop.info.bounds)) {
            returnValue.append(mop.info);
            return;
        }

        if (returnValue.bounds.contains(mop.info.bounds)) {
            // that's a good preliminary sign, but it's not precise:
            if (mop.info.bounds.isContainedBy(returnValue.shape)) {
                // this is a null-op
                return;
            }
        }

        // now same checks but consult (more expensive) mask:
        if (!returnValue.getMask().intersects(mop.info.getMask())) {
            returnValue.append(mop.info);
            return;
        }

        if (returnValue.getMask().contains(mop.info.getMask())) {
            if (mop.info.getMask().isContainedBy(returnValue.shape)) {
                // this is a null-op
                return;
            }
        }

        returnValue.merge(mop.info);
    }

    private void subtract(ShapeInfo returnValue, OutlineOperation op) {
        MaskedOutlineOperation mop = (MaskedOutlineOperation) op;
        if (mop.info.bounds.isEmpty() || !returnValue.bounds.intersects(mop.info.bounds) || !returnValue.getMask().intersects(mop.info.getMask())) {
            // this is a null-op
            return;
        }

        returnValue.subtract(mop.info);
    }

    private void intersect(ShapeInfo returnValue, OutlineOperation op) {
        MaskedOutlineOperation mop = (MaskedOutlineOperation) op;
        if (!returnValue.bounds.intersects(mop.info.bounds) || !returnValue.getMask().intersects(mop.info.getMask())) {
            returnValue.reset(null);
            return;
        }

        returnValue.intersect(mop.info);
    }

    private void xor(ShapeInfo returnValue, OutlineOperation op) {
        MaskedOutlineOperation mop = (MaskedOutlineOperation) op;
        if (!returnValue.bounds.intersects(mop.info.bounds) || !returnValue.getMask().intersects(mop.info.getMask())) {
            returnValue.append(mop.info);
            return;
        }

        returnValue.xor(mop.info);
    }

    @Override
    public OutlineOperation createOperation(OutlineOperation.Type type, Shape shape) {
        return new MaskedOutlineOperation(type, shape);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"[ divisor = "+divisor+"]";
    }
}
