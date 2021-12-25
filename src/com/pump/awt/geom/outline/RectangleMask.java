package com.pump.awt.geom.outline;

import com.pump.awt.geom.ClosedPathIterator;
import com.pump.awt.geom.MonotonicPathIterator;
import com.pump.math.NumberLineIntegerMask;
import com.pump.math.NumberLineMask;
import com.pump.util.Range;
import com.pump.util.RangeInteger;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serializable;
import java.util.*;
import java.util.List;

/**
 * This is a composition int-based rectangles.
 */
public class RectangleMask implements Shape, Serializable {

    enum Operation {
        ADD, SUBTRACT,
        CLIP() {

            /**
             * This operation is unique because it deletes rows above and below the operation.
             */
            @Override
            public <N extends Comparable> boolean finish(TreeMap<Integer, NumberLineIntegerMask> rows, int y1, int y2) {
                boolean returnValue = false;

                Iterator<Map.Entry<Integer, NumberLineIntegerMask>> iter;
                iter = rows.entrySet().iterator();

                NumberLineIntegerMask prevRowMask = new NumberLineIntegerMask();
                while (iter.hasNext()) {
                    Map.Entry<Integer, NumberLineIntegerMask> entry = iter.next();
                    if (entry.getKey().intValue() < y1 || entry.getKey().intValue() > y2) {
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
                        NumberLineIntegerMask currentMask = entry.getValue();
                        if (currentMask.equals(prevRowMask)) {
                            iter.remove();
                        }
                        prevRowMask = currentMask;
                    }
                }

                if (!rows.isEmpty() && !rows.lastEntry().getValue().isEmpty()) {
                    rows.put(y2, new NumberLineIntegerMask());
                    returnValue = true;
                }
                return returnValue;
            }
        };

        public <N extends Comparable> boolean finish(TreeMap<Integer, NumberLineIntegerMask> rows, int y1, int y2) {
            Integer k1 = rows.floorKey(y1);
            Integer k2 = rows.ceilingKey(y2);

            if (k1 != null) {
                k1 = rows.lowerKey(k1);
            }

            if (k2 != null) {
                Integer k3 = rows.higherKey(k2);
                if (k3 != null)
                    k2 = k3;
            }

            Iterator<Map.Entry<Integer, NumberLineIntegerMask>> iter;
            if (k1 == null) {
                iter = rows.entrySet().iterator();
            } else {
                iter = rows.subMap(k1, true, k2, true).entrySet().iterator();
            }

            Map.Entry<Integer, NumberLineIntegerMask> lowerEntry = k1 == null ? null : rows.lowerEntry(k1);
            NumberLineIntegerMask prevRowMask = lowerEntry == null ? new NumberLineIntegerMask() : lowerEntry.getValue();

            while (iter.hasNext()) {
                Map.Entry<Integer, NumberLineIntegerMask> entry = iter.next();
                NumberLineIntegerMask currentMask = entry.getValue();
                if (currentMask.equals(prevRowMask)) {
                    iter.remove();
                }
                prevRowMask = currentMask;
            }
            return false;
        }
    }

    class MaskIterator implements Iterator<Rectangle> {
        Iterator<Map.Entry<Integer, NumberLineIntegerMask>> iter;
        List<Rectangle> iteratorValues = new LinkedList<>();
        Map.Entry<Integer, NumberLineIntegerMask> prevRow;
        final int expectedModCount;

        {
            expectedModCount = modCount;
            iter = rows.entrySet().iterator();
            prevRow = iter.hasNext() ? iter.next() : null;
            updateIteratorValues();
        }

        private void updateIteratorValues() {
            while (iter.hasNext()) {
                Map.Entry<Integer, NumberLineIntegerMask> currentRow = iter.next();

                for (RangeInteger range : prevRow.getValue().getRanges()) {
                    int x = range.min;
                    int y = prevRow.getKey();
                    int x2 = range.max;
                    int y2 = currentRow.getKey();
                    Rectangle rect = new Rectangle(x, y, x2 - x, y2 - y);
                    iteratorValues.add(rect);
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
        public Rectangle next() {
            checkForComodification();
            Rectangle returnValue = iteratorValues.remove(0);
            updateIteratorValues();
            return returnValue;
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    protected final TreeMap<Integer, NumberLineIntegerMask> rows = new TreeMap<>();

    /**
     * The number of times this mask has been modified.
     * <p>
     * This is used by {@link #iterator()} to create an iterator with fail-fast behavior.
     * </p>
     */
    protected transient int modCount = 0;

    protected Rectangle cachedBounds;

    public RectangleMask() {
        clear();
    }

    public RectangleMask(Rectangle r) {
        this(r.x, r.y, r.width, r.height);
    }

    public RectangleMask(int x, int y, int width, int height) {
        this();
        add(x, y, width, height);
    }

    /**
     * @param shape the shape to create a mask of
     * @param tx the optional AffineTransform to apply to the shape
     * @param maxSegmentArea the maximum area (width * height) of each segment's bounds. The smaller this value
     *                       is the more each segment will be partitioned into subsegments. Finer details lead to
     *                       greater accuracy and a larger data structure.
     */
    public RectangleMask(Shape shape, AffineTransform tx, double maxSegmentArea) {
        Objects.requireNonNull(shape);

        // step 1: trace the perimeter/outline of the shape:

        class TraceOutline {
            public void run() {
                MonotonicPathIterator pi = new MonotonicPathIterator(new ClosedPathIterator(shape.getPathIterator(tx)));
                double lastX = 0;
                double lastY = 0;
                double[] coords = new double[6];

                while (!pi.isDone()) {
                    int k = pi.currentSegment(coords);

                    Shape currentSegment = null;

                    switch (k) {
                        case PathIterator.SEG_MOVETO:
                            lastX = coords[0];
                            lastY = coords[1];
                            break;
                        case PathIterator.SEG_LINETO:
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
                        case PathIterator.SEG_QUADTO:
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
                        case PathIterator.SEG_CUBICTO:
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
                    pi.next();
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

            private void addUnsortedEdges(double x0, double x1, double y0, double y1) {
                int xMin = (int) Math.floor(Math.min(x0, x1));
                int xMax = (int) Math.ceil(Math.max(x0, x1));

                int yMin = (int) Math.floor(Math.min(y0, y1));
                int yMax = (int) Math.ceil(Math.max(y0, y1));

                if (xMin == xMax)
                    xMax++;
                if (yMin == yMax)
                    yMax++;

                performOperation_edges(Operation.ADD, xMin, yMin, xMax, yMax, false);
            }

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

        new TraceOutline().run();

        // consolidate everything
        Operation.ADD.finish(rows, rows.firstKey().intValue(), rows.lastKey().intValue());

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
                Map.Entry<Integer, NumberLineIntegerMask> lastEntry = null;
                for(Map.Entry<Integer, NumberLineIntegerMask> entry : rows.entrySet()) {
                    if (lastEntry != null) {
                        fill(lastEntry.getKey(), entry.getKey(), lastEntry.getValue());
                    }

                    lastEntry = entry;
                }
            }

            NumberLineIntegerMask prevFillMask = null;
            NumberLineIntegerMask prevEmptyMask = null;
            private void fill(int y1, int y2, NumberLineIntegerMask horizMask) {
                double y = ((double)(y1 + y2)) / 2.0;

                NumberLineIntegerMask currentFillMask = new NumberLineIntegerMask();
                NumberLineIntegerMask currentEmptyMask = new NumberLineIntegerMask();

                if (prevFillMask != null) {
                    // if our unfilled segments intersect the filled/unfilled info from the previous row,
                    // that can inform how we flood-fill without having to call shape#contains(..)
                    RangeInteger[] ranges = horizMask.getRanges();
                    for(int a = 1; a < ranges.length; a++) {
                        int x1 = ranges[a - 1].max;
                        int x2 = ranges[a].min;
                        if (prevFillMask.intersects(x1, x2)) {
                            currentFillMask.add(x1, x2);
                            horizMask.add(x1, x2);
                        }
                        if (prevEmptyMask.intersects(x1, x2)) {
                            currentEmptyMask.add(x1, x2);
                        }
                    }
                }

                RangeInteger[] ranges = horizMask.getRanges();
                for(int a = 1; a < ranges.length; a++) {
                    int x1 = ranges[a-1].max;
                    int x2 = ranges[a].min;

                    // we already figured out this must be an empty zone
                    if (currentEmptyMask.intersects(x1, x2))
                        continue;

                    // ... and [x1,x2) won't be in currentFillMask or horizMask, because the
                    // range [x1, x2) is by definition a gap in those number line masks

                    double x = ((double)(x1 + x2)) / 2.0;
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

    public boolean clear() {
        boolean uninitialized = rows.isEmpty();
        if (!isEmpty() || uninitialized) {
            rows.clear();
            rows.put(0, new NumberLineIntegerMask());
            modCount++;
            cachedBounds = null;
            return true;
        }
        return false;
    }

    private void ensureRow(int y) {
        Map.Entry<Integer, NumberLineIntegerMask> nearestRow = rows.floorEntry(y);
        if (nearestRow == null) {
            NumberLineIntegerMask newRow = new NumberLineIntegerMask();
            rows.put( Integer.valueOf(y), newRow);
        } else if (nearestRow.getKey().intValue() == y) {
            // intentionally empty
        } else {
            NumberLineIntegerMask newRow = new NumberLineIntegerMask(nearestRow.getValue());
            rows.put(y, newRow);
        }
    }

    public boolean add(int x, int y, int width, int height) {
        return performOperation_widthHeight(Operation.ADD, x, y, width, height, true);
    }

    public boolean subtract(int x, int y, int width, int height) {
        return performOperation_widthHeight(Operation.SUBTRACT, x, y, width, height, true);
    }

    public boolean clip(int x, int y, int width, int height) {
        return performOperation_widthHeight(Operation.CLIP, x, y, width, height, true);
    }

    protected boolean performOperation_widthHeight(Operation op, int x, int y, int width, int height, boolean executeFinishHook) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        int y2 = y + height;
        int x2 = x + width;
        return performOperation_edges(op, x, y, x2, y2, executeFinishHook);
    }

    protected boolean performOperation_edges(Operation op, int x, int y, int x2, int y2, boolean executeFinishHook) {
        ensureRow(y);
        ensureRow(y2);

        boolean returnValue = false;
        for(Map.Entry<Integer, NumberLineIntegerMask> entry : rows.tailMap(y).entrySet()) {
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

        if (executeFinishHook && op.finish(rows, y, y2))
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
        return (Rectangle) cachedBounds.clone();
    }

    protected Rectangle createBounds() {
        if (rows.isEmpty() || (rows.size()==1 && rows.entrySet().iterator().next().getValue().isEmpty()) ) {
            return new Rectangle();
        }

        int x1, y1, x2, y2;
        x1 = y1 = x2 = y2 = 0;
        boolean undefined = true;
        for(Map.Entry<Integer, NumberLineIntegerMask> rowEntry : rows.entrySet()) {
            NumberLineIntegerMask row = rowEntry.getValue();
            if (undefined) {
                undefined = false;
                y1 = rowEntry.getKey();
                x1 = row.getMin();
                x2 = row.getMax();
            }
            if (!row.isEmpty()) {
                x1 = x1 < rowEntry.getValue().getMin() ? x1 : rowEntry.getValue().getMin();
                x2 = x2 > rowEntry.getValue().getMax() ? x2 : rowEntry.getValue().getMax();
            }
            y2 = rowEntry.getKey();
        }

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    @Override
    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public boolean contains(int x, int y) {
        Map.Entry<Integer, NumberLineIntegerMask> floorRow = rows.floorEntry(y);
        if (floorRow == null)
            return false;
        return floorRow.getValue().contains(x);
    }

    public boolean contains(int x, int y, int width,int height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Integer floorKey = rows.floorKey(y);
        if (floorKey == null)
            return false;
        int y2 = y + height;
        int x2 = x + width;
        Iterator<Map.Entry<Integer, NumberLineIntegerMask>> iter = rows.tailMap(floorKey, true).entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, NumberLineIntegerMask> entry = iter.next();
            if (entry.getKey().compareTo(y2) >= 0)
                return true;

            if (!entry.getValue().contains(x, x2)) {
                return false;
            }
        }
        return true;
    }

    public boolean intersects(int x, int y, int width,int height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Integer floorKey = rows.floorKey(y);
        Iterator<Map.Entry<Integer, NumberLineIntegerMask>> iter = floorKey == null ?
                rows.entrySet().iterator() :
                rows.tailMap(floorKey, true).entrySet().iterator();
        int y2 = y + height;
        int x2 = x + width;
        while (iter.hasNext()) {
            Map.Entry<Integer, NumberLineIntegerMask> entry = iter.next();
            if (entry.getKey().compareTo(y2) >= 0)
                return false;

            if (entry.getValue().intersects(x, x2)) {
                return true;
            }
        }
        return false;
    }

    @Override
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
    protected Rectangle toRectangle() {
        int x1, y1, x2, y2;
        Iterator<Map.Entry<Integer, NumberLineIntegerMask>> iter = rows.entrySet().iterator();
        if (!iter.hasNext())
            return null;
        Map.Entry<Integer, NumberLineIntegerMask> firstEntry = iter.next();

        y1 = firstEntry.getKey();
        x1 = firstEntry.getValue().getMin();
        x2 = firstEntry.getValue().getMax();

        if (!iter.hasNext())
            return null;

        Map.Entry<Integer, NumberLineIntegerMask> secondEntry = iter.next();
        if (!secondEntry.getValue().isEmpty())
            return null;
        y2 = secondEntry.getKey();

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
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
    public boolean isEqual(int x, int y, int width, int height) {
        return isEqual(new Rectangle(x, y, width, height));
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(Rectangle r) {
        return r.equals(toRectangle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleMask rMask = (RectangleMask) o;
        return Objects.equals(rows, rMask.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows);
    }

    /**
     * Return true if this mask contains the argument.
     */
    public boolean contains(RectangleMask mask) {
        Iterator<Rectangle> iter = mask.iterator();
        while(iter.hasNext()) {
            if (!contains(iter.next()))
                return false;
        }
        return true;
    }

    /**
     * Return true if this mask intersects the argument.
     */
    public boolean intersects(RectangleMask mask) {
        Iterator<Rectangle> iter = mask.iterator();
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
    public boolean add(RectangleMask mask) {
        // TODO: suspend auto-collapsing of rows
        Iterator<Rectangle> iter = mask.iterator();
        boolean returnValue = false;
        while(iter.hasNext()) {
            Rectangle r = iter.next();
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
    public boolean subtract(RectangleMask mask) {
        Iterator<Rectangle> iter = mask.iterator();
        boolean returnValue = false;
        while(iter.hasNext()) {
            Rectangle r = iter.next();
            if (subtract(r))
                returnValue = true;
        }
        return returnValue;
    }

    /**
     * Return true if this mask intersects the argument.
     */
    public boolean intersects(Shape shape) {
        Iterator<Rectangle> iter = iterator();
        while(iter.hasNext()) {
            Rectangle rect = iter.next();
            if (shape.intersects(rect))
                return true;
        }
        return false;
    }

    /**
     * Return true if this mask is completely contained within the argument.
     */
    public boolean isContainedBy(Shape shape) {
        Iterator<Rectangle> iter = iterator();
        while(iter.hasNext()) {
            Rectangle rect = iter.next();
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
    public Iterator<Rectangle> iterator() {
        return new MaskIterator();
    }

    @Override
    public PathIterator getPathIterator(AffineTransform tx) {
        // TODO: implement better targeted iterator
        // return new MaskPathIterator();

        Path2D.Double p = new Path2D.Double();
        Iterator<Rectangle> iter = iterator();
        while (iter.hasNext()) {
            Rectangle r = iter.next();
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

    public boolean add(Rectangle r) {
        return add(r.x, r.y, r.width, r.height);
    }

    public boolean subtract(Rectangle r) {
        return subtract(r.x, r.y, r.width, r.height);
    }

    public boolean clip(Rectangle r) {
        return clip(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean contains(double x, double y) {
        int xi = (int) (Math.round(x) + .5);
        int yi = (int) (Math.round(y) + .5);
        return contains(xi, yi);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        int x1 = (int) (Math.floor(x));
        int y1 = (int) (Math.floor(y));
        int x2 = (int) (Math.ceil(x + w));
        int y2 = (int) (Math.ceil(y + h));
        return intersects( x1, y1, x2 - x1, y2 - y1 );
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        int x1 = (int) (Math.floor(x));
        int y1 = (int) (Math.floor(y));
        int x2 = (int) (Math.ceil(x + w));
        int y2 = (int) (Math.ceil(y + h));
        return contains( x1, y1, x2 - x1, y2 - y1);
    }
}