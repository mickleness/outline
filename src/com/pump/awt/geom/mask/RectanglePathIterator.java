package com.pump.awt.geom.mask;

import com.pump.awt.geom.PathSegment;
import com.pump.awt.geom.ShapeUtils;

import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.util.LinkedList;
import java.util.List;

/**
 * This supports a few new segment types that are 8 elements long: 4 points that
 * compose a rectangle.
 */
class RectangleIterator implements PathIterator {

    /**
     * This will populate the coords array with 8 values: four consecutive (x,y) values that
     * form a rectangle.
     * <p>
     * This indicates the original PathIterator provided exactly 4 points and a SEG_CLOSE
     * </p>
     */
    public static final int SEG_RECTANGLE_EARLY_CLOSE = -999;

    /**
     * This will populate the coords array with 8 values: four consecutive (x,y) values that
     * form a rectangle.
     * <p>
     * This indicates the original PathIterator provided exactly 4 lines (5 points)
     * and a SEG_CLOSE.
     * </p>
     */
    public static final int SEG_RECTANGLE_FULL_CLOSE = -998;

    /**
     * This will populate the coords array with 8 values: four consecutive (x,y) values that
     * form a rectangle.
     * <p>
     * This indicates the original PathIterator provided exactly 4 lines (5 points)
     * and no SEG_CLOSE.
     * </p>
     */
    public static final int SEG_RECTANGLE_FULL_NO_CLOSE = -997;

    /**
     * This will populate the coords array with 8 values: four consecutive (x,y) values that
     * form a rectangle.
     * <p>
     * This indicates the original PathIterator provided exactly 4 points and finished.
     * </p>
     */
    public static final int SEG_RECTANGLE_EARLY_DONE = -996;

    PathIterator delegate;
    List<PathSegment> queue = new LinkedList<>();
    private double[] scratch = new double[6];

    public RectangleIterator(PathIterator delegate) {
        this.delegate = delegate;

        populateQueue();
    }

    private void populateQueue() {
        if (delegate.isDone())
            return;

        if (!queue.isEmpty())
            return;

        int s1 = delegate.currentSegment(scratch);
        delegate.next();

        if (s1 != PathIterator.SEG_MOVETO || delegate.isDone()) {
            queue.add(new PathSegment(s1, scratch.clone()));
            return;
        }

        double s1x = scratch[0];
        double s1y = scratch[1];

        int s2 = delegate.currentSegment(scratch);
        delegate.next();

        if (s2 != PathIterator.SEG_LINETO || delegate.isDone()) {
            queue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[] {s1x, s1y}));
            queue.add(new PathSegment(s2, scratch.clone()));
            return;
        }

        double s2x = scratch[0];
        double s2y = scratch[1];

        int s3 = delegate.currentSegment(scratch);
        delegate.next();

        if (s3 != PathIterator.SEG_LINETO || delegate.isDone()) {
            queue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[] {s1x, s1y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[] {s2x, s2y}));
            queue.add(new PathSegment(s3, scratch.clone()));
            return;
        }

        double s3x = scratch[0];
        double s3y = scratch[1];

        int s4 = delegate.currentSegment(scratch);
        delegate.next();

        if (s4 != PathIterator.SEG_LINETO) {
            queue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[] {s1x, s1y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[] {s2x, s2y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[] {s3x, s3y}));
            queue.add(new PathSegment(s4, scratch.clone()));
            return;
        }

        double s4x = scratch[0];
        double s4y = scratch[1];

        if (delegate.isDone()) {
            Path2D p = new Path2D.Double();
            p.moveTo(s1x, s1y);
            p.lineTo(s2x, s2y);
            p.lineTo(s3x, s3y);
            p.lineTo(s4x, s4y);
            if (ShapeUtils.toRectangle2D(p.getPathIterator(null)) == null) {
                queue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[]{s1x, s1y}));
                queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s2x, s2y}));
                queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s3x, s3y}));
                queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s4x, s4y}));
                return;
            }

            queue.add(new PathSegment(SEG_RECTANGLE_EARLY_DONE, new double[] {s1x, s1y, s2x, s2y, s3x, s3y, s4x, s4y}));
            return;
        }

        int s5 = delegate.currentSegment(scratch);
        delegate.next();

        if (s5 == PathIterator.SEG_CLOSE) {
            Path2D p = new Path2D.Double();
            p.moveTo(s1x, s1y);
            p.lineTo(s2x, s2y);
            p.lineTo(s3x, s3y);
            p.lineTo(s4x, s4y);
            p.closePath();
            if (ShapeUtils.toRectangle2D(p.getPathIterator(null)) == null) {
                queue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[]{s1x, s1y}));
                queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s2x, s2y}));
                queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s3x, s3y}));
                queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s4x, s4y}));
                queue.add(new PathSegment(PathIterator.SEG_CLOSE, new double[]{}));
                return;
            }

            queue.add(new PathSegment(SEG_RECTANGLE_EARLY_CLOSE, new double[] {s1x, s1y, s2x, s2y, s3x, s3y, s4x, s4y}));
            return;
        }

        if (!(s5 == PathIterator.SEG_LINETO && scratch[0] == s1x && scratch[1] == s1y)) {
            queue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[] {s1x, s1y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[] {s2x, s2y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[] {s3x, s3y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[] {s4x, s4y}));
            queue.add(new PathSegment(s5, scratch.clone()));
            return;
        }

        Path2D p = new Path2D.Double();
        p.moveTo(s1x, s1y);
        p.lineTo(s2x, s2y);
        p.lineTo(s3x, s3y);
        p.lineTo(s4x, s4y);
        p.lineTo(s1x, s1y);
        if (ShapeUtils.toRectangle2D(p.getPathIterator(null)) == null) {
            queue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[]{s1x, s1y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s2x, s2y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s3x, s3y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s4x, s4y}));
            queue.add(new PathSegment(PathIterator.SEG_LINETO, new double[]{s1x, s1y}));
            return;
        }

        int s6 = delegate.currentSegment(scratch);
        if (s6 == PathIterator.SEG_CLOSE) {
            delegate.next();
            queue.add(new PathSegment(SEG_RECTANGLE_FULL_CLOSE, new double[] {s1x, s1y, s2x, s2y, s3x, s3y, s4x, s4y}));
        }

        queue.add(new PathSegment(SEG_RECTANGLE_FULL_NO_CLOSE, new double[] {s1x, s1y, s2x, s2y, s3x, s3y, s4x, s4y}));
    }

    @Override
    public int getWindingRule() {
        return delegate.getWindingRule();
    }

    @Override
    public boolean isDone() {
        return queue.isEmpty() && delegate.isDone();
    }

    @Override
    public void next() {
        if (!queue.isEmpty()) {
            queue.remove(0);
        }
        populateQueue();
    }

    @Override
    public int currentSegment(float[] coords) {
        int returnValue = currentSegment(scratch);
        for(int a = 0; a<6; a++) {
            coords[a] = (float) scratch[a];
        }
        return returnValue;
    }

    @Override
    public int currentSegment(double[] coords) {
        if (!queue.isEmpty()) {
            return queue.get(0).currentSegment(coords);
        }
        throw new IllegalStateException();
    }
}