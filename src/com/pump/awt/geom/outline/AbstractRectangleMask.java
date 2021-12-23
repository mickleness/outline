package com.pump.awt.geom.outline;

import com.pump.awt.geom.ClosedPathIterator;
import com.pump.awt.geom.MonotonicPathIterator;
import com.pump.awt.geom.ShapeUtils;
import com.pump.math.NumberLineMask;
import com.pump.util.Range;

import java.awt.*;
import java.awt.geom.*;
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
 * @param <N> the type of number (Integer, Double, BigDecimal) this mask is expressed with
 * @param <R> the type of Rectangle2D this mask interacts with
 */
public abstract class AbstractRectangleMask<N extends Comparable, R extends Rectangle2D> implements Serializable, Shape {

    enum Operation {
        ADD, SUBTRACT,
        CLIP() {

            /**
             * This operation is unique because it deletes rows above and below the operation.
             */
            @Override
            public <N extends Comparable> boolean finish(TreeMap<N, NumberLineMask<N>> rows, N y1, N y2) {
                boolean returnValue = false;

                Iterator<Map.Entry<N, NumberLineMask<N>>> iter;
                iter = rows.entrySet().iterator();

                NumberLineMask<N> prevRowMask = new NumberLineMask<>();
                while (iter.hasNext()) {
                    Map.Entry<N, NumberLineMask<N>> entry = iter.next();
                    if (entry.getKey().compareTo(y1) < 0 || entry.getKey().compareTo(y2) > 0) {
                        returnValue = true;
                        iter.remove();
                    } else if (entry.getKey().compareTo(y2) == 0) {
                        if (prevRowMask != null && prevRowMask.isEmpty()) {
                            iter.remove();
                        } else if (!entry.getValue().isEmpty()) {
                            entry.getValue().clear();
                            returnValue = true;
                        }
                    } else {
                        NumberLineMask<N> currentMask = entry.getValue();
                        if (currentMask.equals(prevRowMask)) {
                            iter.remove();
                        }
                        prevRowMask = currentMask;
                    }
                }

                if (!rows.isEmpty() && !rows.lastEntry().getValue().isEmpty()) {
                    rows.put(y2, new NumberLineMask<>());
                    returnValue = true;
                }
                return returnValue;
            }
        };

        public <N extends Comparable> boolean finish(TreeMap<N, NumberLineMask<N>> rows, N y1, N y2) {
            N k1 = rows.floorKey(y1);
            N k2 = rows.ceilingKey(y2);

            if (k1 != null) {
                k1 = rows.lowerKey(k1);
            }

            if (k2 != null) {
                N k3 = rows.higherKey(k2);
                if (k3 != null)
                    k2 = k3;
            }

            Iterator<Map.Entry<N, NumberLineMask<N>>> iter;
            if (k1 == null) {
                iter = rows.entrySet().iterator();
            } else {
                iter = rows.subMap(k1, true, k2, true).entrySet().iterator();
            }

            Map.Entry<N, NumberLineMask<N>> lowerEntry = k1 == null ? null : rows.lowerEntry(k1);
            NumberLineMask<N> prevRowMask = lowerEntry == null ? new NumberLineMask<>() : lowerEntry.getValue();

            while (iter.hasNext()) {
                Map.Entry<N, NumberLineMask<N>> entry = iter.next();
                NumberLineMask<N> currentMask = entry.getValue();
                if (currentMask.equals(prevRowMask)) {
                    iter.remove();
                }
                prevRowMask = currentMask;
            }
            return false;
        }
    }

    class MaskIterator implements Iterator<R> {
        Iterator<Map.Entry<N, NumberLineMask<N>>> iter;
        List<R> iteratorValues = new LinkedList<>();
        Map.Entry<N, NumberLineMask<N>> prevRow;
        final int expectedModCount;

        {
            expectedModCount = modCount;
            iter = AbstractRectangleMask.this.rows.entrySet().iterator();
            prevRow = iter.hasNext() ? iter.next() : null;
            updateIteratorValues();
        }

        private void updateIteratorValues() {
            while (iter.hasNext()) {
                Map.Entry<N, NumberLineMask<N>> currentRow = iter.next();

                for (Range<N> range : prevRow.getValue().getRanges()) {
                    iteratorValues.add(createRectangleFromGeneric(range.min, prevRow.getKey(), range.max, currentRow.getKey()));
                }

                prevRow = currentRow;

                if (!iteratorValues.isEmpty())
                    return;
            }
        }

        @Override
        public boolean hasNext() {
            return !iteratorValues.isEmpty();
        }

        @Override
        public R next() {
            checkForComodification();
            R returnValue = iteratorValues.remove(0);
            updateIteratorValues();
            return returnValue;
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    protected final TreeMap<N, NumberLineMask<N>> rows = new TreeMap<>();

    /**
     * The number of times this mask has been modified.
     * <p>
     * This is used by {@link #iterator()} to create an iterator with fail-fast behavior.
     * </p>
     */
    protected transient int modCount = 0;

    protected R cachedBounds;

    private final N zero;

    protected AbstractRectangleMask(N zero) {
        this.zero = zero;
        clear();
    }

    public boolean clear() {
        boolean uninitialized = rows.isEmpty();
        if (!isEmpty() || uninitialized) {
            rows.clear();
            rows.put(zero, new NumberLineMask<>());
            modCount++;
            cachedBounds = null;
            return true;
        }
        return false;
    }

    private void ensureRow(N y) {
        Map.Entry<N, NumberLineMask<N>> nearestRow = rows.floorEntry(y);
        if (nearestRow == null) {
            NumberLineMask<N> newRow = new NumberLineMask<>();
            rows.put(y, newRow);
        } else if (nearestRow.getKey().equals(y)) {
            // intentionally empty
        } else {
            NumberLineMask<N> newRow = new NumberLineMask<>(nearestRow.getValue());
            rows.put(y, newRow);
        }
    }

    /**
     * Calculate the same of two values "a + b".
     */
    protected abstract N add(N a, N b);

    public abstract boolean add(R r);

    public abstract boolean subtract(R r);

    public abstract boolean clip(R r);

    public boolean add(N x, N y, N width, N height) {
        return performOperation(Operation.ADD, x, y, width, height);
    }

    public boolean subtract(N x, N y, N width, N height) {
        return performOperation(Operation.SUBTRACT, x, y, width, height);
    }

    public boolean clip(N x, N y, N width, N height) {
        return performOperation(Operation.CLIP, x, y, width, height);
    }

    protected boolean performOperation(Operation op, N x, N y, N width, N height) {
        if (width.compareTo(zero) < 0 || height.compareTo(zero) < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width.equals(zero) || height.equals(zero))
            return false;

        N y2 = add(y, height);
        N x2 = add(x, width);

        ensureRow(y);
        ensureRow(y2);

        boolean returnValue = false;
        for(Map.Entry<N, NumberLineMask<N>> entry : rows.tailMap(y).entrySet()) {
            if (entry.getKey().equals(y2))
                break;

            boolean opResults = switch (op) {
                case ADD -> entry.getValue().add(x, x2);
                case SUBTRACT -> entry.getValue().subtract(x, x2);
                case CLIP -> entry.getValue().clip(x, x2);
            };

            if (opResults)
                returnValue = true;
        }

        if (op.finish(rows, y, y2))
            returnValue = true;

        if (returnValue) {
            modCount++;
            cachedBounds = null;
        }

        return returnValue;
    }

    @Override
    public Rectangle2D getBounds2D() {
        if (cachedBounds == null)
            cachedBounds = createBounds();
        return (Rectangle2D) cachedBounds.clone();
    }

    @Override
    public Rectangle getBounds() {
        if (cachedBounds == null)
            cachedBounds = createBounds();
        return cachedBounds.getBounds();
    }

    protected R createBounds() {
        if (rows.isEmpty() || (rows.size()==1 && rows.entrySet().iterator().next().getValue().isEmpty()) ) {
            return createEmptyBounds();
        }

        N x1, y1, x2, y2;
        x1 = y1 = x2 = y2 = null;
        for(Map.Entry<N, NumberLineMask<N>> rowEntry : rows.entrySet()) {
            NumberLineMask<N> row = rowEntry.getValue();
            if (x1 == null) {
                y1 = rowEntry.getKey();
                x1 = row.getMin();
                x2 = row.getMax();
            }
            if (!row.isEmpty()) {
                x1 = x1.compareTo(rowEntry.getValue().getMin()) < 0 ? x1 : rowEntry.getValue().getMin();
                x2 = x2.compareTo(rowEntry.getValue().getMax()) > 0 ? x2 : rowEntry.getValue().getMax();
            }
            y2 = rowEntry.getKey();
        }

        return createRectangleFromGeneric(x1, y1, x2, y2);
    }

    protected abstract R createRectangleFromGeneric(N x1, N y1, N x2, N y2);

    protected abstract R createEmptyBounds();

    public abstract boolean contains(double x, double y);

    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    public abstract boolean intersects(double x, double y, double w, double h);

    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public abstract boolean contains(double x, double y, double w, double h);

    public boolean contains(N x, N y) {
        Map.Entry<N, NumberLineMask<N>> floorRow = rows.floorEntry(y);
        if (floorRow == null)
            return false;
        return floorRow.getValue().contains(x);
    }

    public boolean contains(N x, N y, N width,N height) {
        if (width.compareTo(zero) < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height.compareTo(zero) < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width.equals(zero) || height.equals(zero))
            return false;

        N floorKey = rows.floorKey(y);
        if (floorKey == null)
            return false;
        N y2 = add(y, height);
        N x2 = add(x, width);
        Iterator<Map.Entry<N, NumberLineMask<N>>> iter = rows.tailMap(floorKey, true).entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<N, NumberLineMask<N>> entry = iter.next();
            if (entry.getKey().compareTo(y2) >= 0)
                return true;

            if (!entry.getValue().contains(x, x2)) {
                return false;
            }
        }
        return true;
    }

    public boolean intersects(N x, N y, N width,N height) {
        if (width.compareTo(zero) < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height.compareTo(zero) < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width.equals(zero) || height.equals(zero))
            return false;

        N floorKey = rows.floorKey(y);
        Iterator<Map.Entry<N, NumberLineMask<N>>> iter = floorKey == null ?
                rows.entrySet().iterator() :
                rows.tailMap(floorKey, true).entrySet().iterator();
        N y2 = add(y, height);
        N x2 = add(x, width);
        while (iter.hasNext()) {
            Map.Entry<N, NumberLineMask<N>> entry = iter.next();
            if (entry.getKey().compareTo(y2) >= 0)
                return false;

            if (entry.getValue().intersects(x, x2)) {
                return true;
            }
        }
        return false;
    }

    public boolean contains(Rectangle2D r) {
        return r.contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public boolean isEmpty() {
        return rows.isEmpty() || rows.firstEntry().getValue().isEmpty();
    }

    /**
     * Return a Rectangle representing this shape, or null if this shape cannot be accurately represented
     * as a Rectangle.
     */
    protected R toRectangle() {
        N x1, y1, x2, y2;
        Iterator<Map.Entry<N, NumberLineMask<N>>> iter = rows.entrySet().iterator();
        if (!iter.hasNext())
            return null;
        Map.Entry<N, NumberLineMask<N>> firstEntry = iter.next();

        y1 = firstEntry.getKey();
        x1 = firstEntry.getValue().getMin();
        x2 = firstEntry.getValue().getMax();

        if (!iter.hasNext())
            return null;

        Map.Entry<N, NumberLineMask<N>> secondEntry = iter.next();
        if (!secondEntry.getValue().isEmpty())
            return null;
        y2 = secondEntry.getKey();

        return createRectangleFromGeneric(x1, y1, x2, y2);
    }

    /**
     * If this returns true then this RectangleMask is graphically equivalent to {@link #getBounds()}.
     */
    public boolean isRectangle() {
        return toRectangle() != null;
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(N x, N y, N width, N height) {
        return isEqual(createRectangleFromGeneric(x, y, add(x, width), add(y, height)));
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(R r) {
        return r.equals(toRectangle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractRectangleMask rMask = (AbstractRectangleMask) o;
        return Objects.equals(rows, rMask.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows);
    }

    /**
     * Return true if this mask contains the argument.
     */
    public boolean contains(AbstractRectangleMask<N, R> mask) {
        Iterator<R> iter = mask.iterator();
        while(iter.hasNext()) {
            if (!contains(iter.next()))
                return false;
        }
        return true;
    }

    /**
     * Return true if this mask intersects the argument.
     */
    public boolean intersects(AbstractRectangleMask<N, R> mask) {
        Iterator<R> iter = mask.iterator();
        while(iter.hasNext()) {
            if (!intersects(iter.next()))
                return true;
        }
        return false;
    }

    /**
     * Add another mask to this mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean add(AbstractRectangleMask<N, R> mask) {
        Iterator<R> iter = mask.iterator();
        boolean returnValue = false;
        while(iter.hasNext()) {
            R r = iter.next();
            if (add(r))
                returnValue = true;
        }
        return returnValue;
    }

    /**
     * Subtract another mask from this mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean subtract(AbstractRectangleMask<N, R> mask) {
        Iterator<R> iter = mask.iterator();
        boolean returnValue = false;
        while(iter.hasNext()) {
            R r = iter.next();
            if (subtract(r))
                returnValue = true;
        }
        return returnValue;
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
    public Iterator<R> iterator() {
        return new MaskIterator();
    }

    // TODO: implement PathIterator

    /**
     * @param shape the shape to create a mask of
     * @param tx the optional AffineTransform to apply to the shape
     * @param maxSegmentArea the maximum area (width * height) of each segment's bounds. The smaller this value
     *                       is the more each segment will be partitioned into subsegments. Finer details lead to
     *                       greater accuracy and a larger data structure.
     */
    public AbstractRectangleMask(N zero, Shape shape, AffineTransform tx, double maxSegmentArea) {
        this(zero);

        Objects.requireNonNull(shape);

        // step 1: trace the perimeter/outline of the shape:

        MonotonicPathIterator pi = new MonotonicPathIterator(new ClosedPathIterator(shape.getPathIterator(tx)));
        double lastX = 0;
        double lastY = 0;
        double[] coords = new double[6];

        Line2D.Double line = new Line2D.Double();
        QuadCurve2D.Double quad = new QuadCurve2D.Double();
        CubicCurve2D.Double cubic = new CubicCurve2D.Double();

        double x1 = 0;
        double y1 = 0;

        while(!pi.isDone()) {
            int k = pi.currentSegment(coords);

            Shape currentSegment = null;

            switch(k) {
                case PathIterator.SEG_MOVETO:
                    x1 = coords[0];
                    y1 = coords[1];
                    break;
                case PathIterator.SEG_LINETO:
                    x1 = coords[0];
                    y1 = coords[1];
                    line.setLine(lastX, lastY, x1, y1);
                    currentSegment = line;
                    break;
                case PathIterator.SEG_QUADTO:
                    x1 = coords[2];
                    y1 = coords[3];
                    quad.setCurve(lastX, lastY, coords[0], coords[1], x1, y1);
                    currentSegment = quad;
                    break;
                case PathIterator.SEG_CUBICTO:
                    x1 = coords[4];
                    y1 = coords[5];
                    cubic.setCurve(lastX, lastY, coords[0], coords[1], coords[2], coords[3], x1, y1);
                    currentSegment = cubic;
                    break;
            }

            if (currentSegment != null) {
                addShapeSegmentOutline(currentSegment, maxSegmentArea);
            }

            lastX = x1;
            lastY = y1;


            pi.next();
        }

        // step 2: flood fill the interior path/paths

        class FloodFill {

            AffineTransform inverseT = null;
            Point2D p = new Point2D.Double();

            {
                try {
                    inverseT = tx == null ? null : tx.createInverse();
                } catch(Throwable t) {
                    throw new RuntimeException(t);
                }
            }

            public void run() {
                Map.Entry<N, NumberLineMask<N>> lastEntry = null;
                for(Map.Entry<N, NumberLineMask<N>> entry : rows.entrySet()) {
                    if (lastEntry != null) {
                        fill(lastEntry.getKey(), entry.getKey(), lastEntry.getValue());
                    }

                    lastEntry = entry;
                }
            }

            NumberLineMask<N> prevFillMask = null;
            NumberLineMask<N> prevEmptyMask = null;
            private void fill(N y1, N y2, NumberLineMask<N> horizMask) {
                double y = midpoint(y1, y2);

                NumberLineMask<N> currentFillMask = new NumberLineMask<>();
                NumberLineMask<N> currentEmptyMask = new NumberLineMask<>();

                if (prevFillMask != null) {
                    // if our unfilled segments intersect the filled/unfilled info from the previous row,
                    // that can inform how we flood-fill without having to call shape#contains(..)
                    Range<N>[] ranges = horizMask.getRanges();
                    for(int a = 1; a < ranges.length; a++) {
                        N x1 = ranges[a - 1].max;
                        N x2 = ranges[a].min;
                        if (prevFillMask.contains(x1, x2)) {
                            currentFillMask.add(x1, x2);
                            horizMask.add(x1, x2);
                        }
                        if (prevEmptyMask.contains(x1, x2)) {
                            currentEmptyMask.add(x1, x2);
                        }
                    }
                }

                Range<N>[] ranges = horizMask.getRanges();
                for(int a = 1; a < ranges.length; a++) {
                    N x1 = ranges[a-1].max;
                    N x2 = ranges[a].min;

                    // we already figured out this must be an empty zone
                    if (currentEmptyMask.intersects(x1, x2))
                        continue;

                    // ... and [x1,x2) won't be in currentFillMask or horizMask, because the
                    // range [x1, x2) is by definition a gap in those number line masks

                    double x = midpoint(x1, x2);
                    p.setLocation(x, y);
                    if (inverseT != null)
                        inverseT.transform(p, p);

                    // the call to shape.contains(Point2D) is probably our most
                    // expensive call here:

                    if (shape.contains(p)) {
                        currentFillMask.add(x1, x2);
                        horizMask.add(x1, x2);
                    } else {
                        currentEmptyMask.add(x1, x2);
                    }
                }

                prevFillMask = currentFillMask;
                prevEmptyMask = currentEmptyMask;
            }
        }

        new FloodFill().run();
    }

    protected abstract double midpoint(N v1, N v2);

    private void addShapeSegmentOutline(Shape segment, double maxArea) {
        double area;
        double x1, x2, y1, y2;
        if (segment instanceof Line2D.Double) {
            Line2D.Double l = (Line2D.Double) segment;
            x1 = l.x1;
            y1 = l.y1;
            x2 = l.x2;
            y2 = l.y2;
        } else if (segment instanceof QuadCurve2D.Double) {
            QuadCurve2D.Double q = (QuadCurve2D.Double) segment;
            x1 = q.x1;
            y1 = q.y1;
            x2 = q.x2;
            y2 = q.y2;
        } else if (segment instanceof CubicCurve2D.Double) {
            CubicCurve2D.Double c = (CubicCurve2D.Double) segment;
            x1 = c.x1;
            y1 = c.y1;
            x2 = c.x2;
            y2 = c.y2;
        } else {
            // this is a private method that should only be called with one of the three shape types listed above
            throw new IllegalStateException(segment.getClass().getName());
        }
        area = (x2 - x1) * (y2 - y1);
        if (area < 0) area = -area;
        if (area > maxArea) {
            if (segment instanceof Line2D.Double) {
                Line2D.Double l = (Line2D.Double) segment;
                addShapeSegmentOutline( ShapeUtils.splitLine(l, 0, .5), maxArea);
                addShapeSegmentOutline( ShapeUtils.splitLine(l, .5, 1), maxArea);
            } else if (segment instanceof QuadCurve2D.Double) {
                QuadCurve2D.Double q = (QuadCurve2D.Double) segment;
                addShapeSegmentOutline( ShapeUtils.splitQuadraticCurve(q, 0, .5), maxArea);
                addShapeSegmentOutline( ShapeUtils.splitQuadraticCurve(q, .5, 1), maxArea);
            } else if (segment instanceof CubicCurve2D.Double) {
                CubicCurve2D.Double c = (CubicCurve2D.Double) segment;
                addShapeSegmentOutline( ShapeUtils.splitCubicCurve(c, 0, .5), maxArea);
                addShapeSegmentOutline( ShapeUtils.splitCubicCurve(c, .5, 1), maxArea);
            }
        } else {
            R r = createRectangleFromDouble(
                    Math.min(x1, x2),
                    Math.min(y1, y2),
                    Math.max(x1, x2),
                    Math.max(y1, y2),
                    false);
            add(r);
        }
    }

    /**
     * @param allowZeroDimension if true then the return value can have a zero width or height. If false then the
     *                           return value should have a small width or height so it contains (but does not match)
     *                           the arguments.
     */
    protected abstract R createRectangleFromDouble(double x1, double y1, double x2, double y2, boolean allowZeroDimension);

    protected abstract AbstractRectangleMask<N,R> createMask();

    @Override
    public PathIterator getPathIterator(AffineTransform tx) {
        // TODO: implement better targeted iterator
        // return new MaskPathIterator();

        Path2D.Double p = new Path2D.Double();
        Iterator<R> iter = iterator();
        while (iter.hasNext()) {
            Rectangle2D r = (Rectangle2D) iter.next();
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
}
