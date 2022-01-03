package com.pump.awt.geom.mask;

import com.pump.awt.geom.*;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;
import java.util.List;

/**
 * This is a composition of rectangles.
 * <p>
 * The Area class can (in rare cases) throw memory errors or take an excessively long time to compute
 * seemingly simple operations. This object represents shape data using only horizontal and vertical
 * lines; as a result it is more reliable.
 * </p>
 *
 * @param <R> the type of Rectangle2D this mask interacts with
 */
public abstract class AbstractRectangleMask<R extends Rectangle2D> implements Serializable, Shape {

    @Serial
    private static final long serialVersionUID = 1L;

    protected enum Operation {
        ADD, SUBTRACT, CLIP, XOR
    }


    protected static abstract class OutlineTracer implements Runnable{
        double maxSegmentArea;
        Shape shape;
        AffineTransform tx;

        OutlineTracer(Shape shape, AffineTransform tx, double maxSegmentArea) {
            this.shape = shape;
            this.tx = tx;
            this.maxSegmentArea = maxSegmentArea;
        }

        @Override
        public void run() {
            MonotonicPathIterator pi = new MonotonicPathIterator(new ClosedPathIterator(shape.getPathIterator(tx)));
            RectangleIterator ri = new RectangleIterator(pi);
            double lastX = 0;
            double lastY = 0;
            double[] coords = new double[8];

            while (!ri.isDone()) {
                int k = ri.currentSegment(coords);

                switch (k) {
                    case RectangleIterator.SEG_RECTANGLE_EARLY_CLOSE:
                    case RectangleIterator.SEG_RECTANGLE_EARLY_DONE:
                    case RectangleIterator.SEG_RECTANGLE_FULL_CLOSE:
                    case RectangleIterator.SEG_RECTANGLE_FULL_NO_CLOSE:
                    {
                        double minX = Math.min(Math.min(coords[0], coords[2]), Math.min(coords[4], coords[6]));
                        double minY = Math.min(Math.min(coords[1], coords[3]), Math.min(coords[5], coords[7]));
                        double maxX = Math.max(Math.max(coords[0], coords[2]), Math.max(coords[4], coords[6]));
                        double maxY = Math.max(Math.max(coords[1], coords[3]), Math.max(coords[5], coords[7]));
                        addUnsortedEdges(minX, maxX, minY, maxY);
                        lastX = coords[6];
                        lastY = coords[7];
                        break;
                    }
                    case PathIterator.SEG_MOVETO: {
                        lastX = coords[0];
                        lastY = coords[1];
                        break;
                    }
                    case PathIterator.SEG_LINETO: {
                        {
                            double ax = -lastX + coords[0];
                            double bx = lastX;
                            double ay = -lastY + coords[1];
                            double by = lastY;

                            addLineSegment(ax, bx, ay, by, 0, 1);
                        }
                        lastX = coords[0];
                        lastY = coords[1];
                        break;
                    }
                    case PathIterator.SEG_QUADTO: {
                        {
                            double ax = lastX - 2 * coords[0] + coords[2];
                            double bx = -2 * lastX + 2 * coords[0];
                            double cx = lastX;
                            double ay = lastY - 2 * coords[1] + coords[3];
                            double by = -2 * lastY + 2 * coords[1];
                            double cy = lastY;

                            addQuadSegment(ax, bx, cx, ay, by, cy, 0, 1);
                        }
                        lastX = coords[2];
                        lastY = coords[3];
                        break;
                    }
                    case PathIterator.SEG_CUBICTO: {
                        {
                            double ax = -lastX + 3 * coords[0] - 3 * coords[2] + coords[4];
                            double bx = 3 * lastX - 6 * coords[0] + 3 * coords[2];
                            double cx = -3 * lastX + 3 * coords[0];
                            double dx = lastX;
                            double ay = -lastY + 3 * coords[1] - 3 * coords[3] + coords[5];
                            double by = 3 * lastY - 6 * coords[1] + 3 * coords[3];
                            double cy = -3 * lastY + 3 * coords[1];
                            double dy = lastY;

                            addCubicSegment(ax, bx, cx, dx, ay, by, cy, dy, 0, 1);
                        }
                        lastX = coords[4];
                        lastY = coords[5];
                        break;
                    }
                }
                ri.next();
            }
        }

        private void addLineSegment(double ax, double bx, double ay, double by, double t0, double t1) {
            double x0 = ax * t0;
            double x1 = ax * t1;
            double y0 = ay * t0;
            double y1 = ay * t1;

            double area = (x1 - x0) * (y1 - y0);
            if (area < 0) area = -area;
            if (area > maxSegmentArea) {
                double mid = (t0 + t1) / 2.0;
                addLineSegment(ax, bx, ay, by, t0, mid);
                addLineSegment(ax, bx, ay, by, mid, t1);
            } else {
                x0 += bx;
                x1 += bx;
                y0 += by;
                y1 += by;
                addUnsortedEdges(x0, x1, y0, y1);
            }
        }

        /**
         * Add a rectangle defined by a bounding box where the x and y values may not be in ascending order.
         */
        protected abstract void addUnsortedEdges(double x0, double x1, double y0, double y1);

        private void addQuadSegment(double ax, double bx, double cx, double ay, double by, double cy, double t0, double t1) {
            double x0 = (ax * t0 + bx) * t0;
            double x1 = (ax * t1 + bx) * t1;
            double y0 = (ay * t0 + by) * t0;
            double y1 = (ay * t1 + by) * t1;

            double area = (x1 - x0) * (y1 - y0);
            if (area < 0) area = -area;
            if (area > maxSegmentArea) {
                double mid = (t0 + t1) / 2.0;
                addQuadSegment(ax, bx, cx, ay, by, cy, t0, mid);
                addQuadSegment(ax, bx, cx, ay, by, cy, mid, t1);
            } else {
                x0 += cx;
                x1 += cx;
                y0 += cy;
                y1 += cy;
                addUnsortedEdges(x0, x1, y0, y1);
            }
        }

        private void addCubicSegment(double ax, double bx, double cx, double dx, double ay, double by, double cy, double dy, double t0, double t1) {
            double x0 = ((ax * t0 + bx) * t0 + cx) * t0;
            double x1 = ((ax * t1 + bx) * t1 + cx) * t1;
            double y0 = ((ay * t0 + by) * t0 + cy) * t0;
            double y1 = ((ay * t1 + by) * t1 + cy) * t1;

            double area = (x1 - x0) * (y1 - y0);
            if (area < 0) area = -area;
            if (area > maxSegmentArea) {
                double mid = (t0 + t1) / 2.0;
                addCubicSegment(ax, bx, cx, dx, ay, by, cy, dy, t0, mid);
                addCubicSegment(ax, bx, cx, dx, ay, by, cy, dy, mid, t1);
            } else {
                x0 += dx;
                x1 += dx;
                y0 += dy;
                y1 += dy;
                addUnsortedEdges(x0, x1, y0, y1);
            }
        }
    }

    /**
     * The number of times this mask has been modified.
     * <p>
     * This is used by {@link #iterator()} to create an iterator with fail-fast behavior.
     * </p>
     */
    protected transient int modCount = 0;

    protected R cachedBounds;

    protected int autoCollapseRowSuspensions = 0;

    public abstract boolean clear();

    public abstract boolean isEmpty();

    @Override
    public Rectangle2D getBounds2D() {
        if (cachedBounds == null)
            cachedBounds = createBounds();
        return (Rectangle2D) cachedBounds.clone();
    }

    protected abstract R createBounds();

    @Override
    public Rectangle getBounds() {
        if (cachedBounds == null)
            cachedBounds = createBounds();
        return (Rectangle) cachedBounds.clone();
    }

    @Override
    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    /**
     * Return a rectangle representing this shape, or null if this shape cannot be accurately represented
     * as a rectangle.
     */
    protected abstract R toRectangle();

    /**
     * If this returns true then this RectangleMask is graphically equivalent to {@link #getBounds()}.
     */
    public boolean isRectangle() {
        return toRectangle() != null;
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(R r) {
        return r.equals(toRectangle());
    }

    public abstract boolean subtract(R rect);

    public abstract boolean add(R rect);

    public abstract boolean xor(R rect);

    public abstract boolean clip(R rect);

    /**
     * Xor (exclusive or) another mask to this mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean xor(AbstractRectangleMask<R> mask) {
        if (mask.isEmpty())
            return false;

        suspendAutoCollapseRows();
        try {
            Iterator<R> iter = mask.iterator();
            boolean returnValue = false;
            while(iter.hasNext()) {
                R r = iter.next();
                if (xor(r))
                    returnValue = true;
            }
            return returnValue;
        } finally {
            resumeAutoCollapseRows();
        }
    }

    /**
     * Return true if this mask intersects the argument.
     */
    public boolean intersects(Shape shape) {
        Iterator<R> iter = iterator();
        while(iter.hasNext()) {
            R rect = iter.next();
            if (shape.intersects(rect))
                return true;
        }
        return false;
    }

    /**
     * Return true if this mask is completely contained within the argument.
     */
    public boolean isContainedBy(Shape shape) {
        Iterator<R> iter = iterator();
        while(iter.hasNext()) {
            R rect = iter.next();
            if (!shape.contains(rect))
                return false;
        }
        return true;
    }

    /**
     * Create an Iterator that identifies all the rectangles required to recreate this mask.
     * <p>
     * This iterator does not guarantee that the set of rectangles it returns is the most
     * efficient way to express this mask, or that the rectangles do or do not overlap; the only
     * guarantee this iterator provides is that if you reassemble all of these rectangles you
     * will fully recreate this mask.
     * </p>
     */
    public abstract Iterator<R> iterator();

    @Override
    public PathIterator getPathIterator(AffineTransform tx) {
        // TODO: implement better targeted iterator
        // return new MaskPathIterator();

        Path2D.Double p = new Path2D.Double();
        Iterator<R> iter = iterator();
        while (iter.hasNext()) {
            R r = iter.next();
            p.append( r, false );
        }
        return p.getPathIterator(tx);
    }

    /**
     * This returns {@link #getPathIterator(AffineTransform)}. The flatness argument doesn't apply
     * because there are no curves in this object; it is a series of horizontal and vertical lines.
     */
    @Override
    public PathIterator getPathIterator(AffineTransform tx, double flatness) {
        return getPathIterator(tx);
    }

    /**
     * Avoid calling {@link #collapseRows()} until every call
     * to <code>suspendAutoCollapseRows()</code> is matched with a call
     * to <code>resumeAutoCollapseRows().</code>
     */
    protected void suspendAutoCollapseRows() {
        autoCollapseRowSuspensions++;
    }

    /**
     * This must be called after {@link #suspendAutoCollapseRows()} to resume
     * collapsing rows when appropriate.
     */
    protected void resumeAutoCollapseRows() {
        autoCollapseRowSuspensions--;
        if (autoCollapseRowSuspensions == 0) {
            collapseRows();
        }
        if (autoCollapseRowSuspensions < 0)
            throw new IllegalStateException("resumeAutoCollapseRows() has been called more times than suspendAutoCollapseRows()");
    }

    /**
     * Collapse any possible redundant rows after an operation.
     */
    protected abstract void collapseRows();

    /**
     * Clip this mask to another mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean clip(AbstractRectangleMask<R> mask) {
        if (isEmpty())
            return false;
        if (mask.isEmpty()) {
            clear();
            return true;
        }

        AbstractRectangleMask<R> src = clone();

        clear();
        suspendAutoCollapseRows();

        R scratch = null;

        Iterator<R> iter1 = src.iterator();
        while (iter1.hasNext()) {
            R rect1 = iter1.next();

            if (scratch == null)
                scratch = (R) rect1.clone();

            Iterator<R> iter2 = mask.iterator();
            while (iter2.hasNext()) {
                R rect2 = iter2.next();
                Rectangle.intersect(rect1, rect2, scratch);

                if (!scratch.isEmpty()) {
                    add(scratch);
                }
            }
        }

        resumeAutoCollapseRows();
        return true;
    }

    public abstract AbstractRectangleMask<R> clone();
}
