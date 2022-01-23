package com.pump.awt.geom.mask;

import com.pump.awt.geom.ClosedPathIterator;
import com.pump.awt.geom.MonotonicPathIterator;
import com.pump.math.NumberLineDoubleMask;
import com.pump.math.NumberLineIntegerMask;
import com.pump.util.RangeInteger;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;
import java.util.List;

/**
 * This is a composition int-based rectangles.
 */
public class RectangleMask extends AbstractRectangleMask<Rectangle> implements Iterable<Rectangle> {
    @Serial
    private static final long serialVersionUID = 1L;

    class MaskIterator implements Iterator<Rectangle> {
        Iterator<Row> iter;
        List<Rectangle> iteratorValues = new LinkedList<>();
        Row prevRow;
        final int expectedModCount;

        {
            expectedModCount = modCount;
            iter = rows.iterator();
            prevRow = iter.hasNext() ? iter.next() : null;
            updateIteratorValues();
        }

        private void updateIteratorValues() {
            while (iter.hasNext()) {
                Row currentRow = iter.next();

                for (RangeInteger range : prevRow.xMask.getRanges()) {
                    int x = range.min;
                    int y = prevRow.y;
                    int x2 = range.max;
                    int y2 = currentRow.y;
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

    protected static class Row implements Comparable<Row> {
        int y;
        NumberLineIntegerMask xMask;

        public Row(int y) {
            this.y = y;
        }

        public Row(int y, NumberLineIntegerMask xMask) {
            this.y = y;
            this.xMask = xMask;
        }

        @Override
        public int compareTo(Row o) {
            return Integer.compare(y, o.y);
        }
    }

    protected final TreeSet<Row> rows = new TreeSet<>();
    protected int[] touchedRows;

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
     * Create a RectangleMask that traces a given shape. This may introduce a few extra pixels on the right
     * and bottom edges; it is not guaranteed to be a perfect match.
     *
     * @param shape the shape to create a mask of
     * @param tx the optional AffineTransform to apply to the shape
     * @param maxSegmentArea the maximum area (width * height) of each segment's bounds. The smaller this value
     *                       is the more each segment will be partitioned into subsegments. Finer details lead to
     *                       greater accuracy and a larger data structure.
     */
    public RectangleMask(Shape shape, AffineTransform tx, double maxSegmentArea, boolean exactContour) {
        Objects.requireNonNull(shape);

        suspendAutoCollapseRows();

        // step 1: trace the perimeter/outline of the shape:

        OutlineTracer tracer = new OutlineTracer(shape, tx, maxSegmentArea, exactContour) {

            @Override
            protected void addRectangle(Rectangle2D.Double r) {
                int xMin = (int) Math.floor(r.getMinX());
                int xMax = (int) Math.ceil(r.getMaxX());

                int yMin = (int) Math.floor(r.getMinY());
                int yMax = (int) Math.ceil(r.getMaxY());

                if (xMin == xMax)
                    xMax++;
                if (yMin == yMax)
                    yMax++;

                performOperation(Operation.ADD, xMin, yMin, xMax, yMax);
            }

            @Override
            protected void addUnsortedEdges(double x0, double x1, double y0, double y1) {
                int xMin = (int) Math.floor(Math.min(x0, x1));
                int xMax = (int) Math.ceil(Math.max(x0, x1));

                int yMin = (int) Math.floor(Math.min(y0, y1));
                int yMax = (int) Math.ceil(Math.max(y0, y1));

                if (xMin == xMax)
                    xMax++;
                if (yMin == yMax)
                    yMax++;

                performOperation(Operation.ADD, xMin, yMin, xMax, yMax);
            }
        };
        tracer.run();

        resumeAutoCollapseRows();

        // step 2: flood fill the interior path/paths

        class FloodFill {

            final AffineTransform inverseT;
            Point2D p = new Point2D.Double();

            {
                try {
                    inverseT = tx == null ? null : tx.createInverse();
                } catch(Throwable t) {
                    throw new RuntimeException(t);
                }
            }

            public void run() {
                Row lastEntry = null;
                for(Row entry : rows) {
                    if (lastEntry != null) {
                        fill(lastEntry.y, entry.y, lastEntry.xMask);
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

    @Override
    public boolean clear() {
        boolean uninitialized = rows.isEmpty();
        if (!isEmpty() || uninitialized) {
            rows.clear();
            rows.add(new Row(0, new NumberLineIntegerMask()));
            modCount++;
            cachedBounds = null;
            return true;
        }
        return false;
    }

    private void ensureRow(int y) {
        Row nearestRow = rows.floor(new Row(y));
        if (nearestRow == null) {
            Row newRow = new Row(y, new NumberLineIntegerMask());
            rows.add(newRow);
        } else if (nearestRow.y == y) {
            // intentionally empty
        } else {
            Row newRow = new Row(y, new NumberLineIntegerMask(nearestRow.xMask));
            rows.add(newRow);
        }
    }

    public boolean add(int x, int y, int width, int height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.ADD, x, y, x + width, y + height);
    }

    public boolean xor(int x, int y, int width, int height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.XOR, x, y, x + width, y + height);
    }

    public boolean subtract(int x, int y, int width, int height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.SUBTRACT, x, y, x + width, y + height);
    }

    public boolean clip(int x, int y, int width, int height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.CLIP, x, y, x + width, y + height);
    }

    protected boolean performOperation(Operation op, int x, int y, int x2, int y2) {
        ensureRow(y);
        ensureRow(y2);

        if (touchedRows == null) {
            touchedRows = new int[] {y, y2};
        } else {
            touchedRows[0] = Math.min(y, touchedRows[0]);
            touchedRows[1] = Math.max(y, touchedRows[1]);
        }

        suspendAutoCollapseRows();

        try {
            boolean returnValue = false;
            for (Row entry : rows.tailSet(new Row(y))) {
                if (entry.y == y2)
                    break;

                boolean opResults = switch (op) {
                    case ADD -> entry.xMask.add(x, x2);
                    case SUBTRACT -> entry.xMask.subtract(x, x2);
                    case CLIP -> entry.xMask.clip(x, x2);
                    case XOR -> entry.xMask.xor(x, x2);
                };

                if (opResults)
                    returnValue = true;
            }

            if (op == Operation.CLIP)
                removeRowsAboveAndBelow(y, y2);

            if (returnValue) {
                modCount++;
                cachedBounds = null;
            }

            return returnValue;
        } finally {
            resumeAutoCollapseRows();
        }
    }

    private void removeRowsAboveAndBelow(int y1, int y2) {
        Iterator<Row> iter;
        iter = rows.iterator();

        NumberLineIntegerMask prevRowMask = new NumberLineIntegerMask();
        while (iter.hasNext()) {
            Row entry = iter.next();
            if (entry.y < y1 || entry.y > y2) {
                iter.remove();
            } else if (entry.y == y2) {
                if (prevRowMask != null && prevRowMask.isEmpty()) {
                    iter.remove();
                } else if (!entry.xMask.isEmpty()) {
                    entry.xMask.clear();
                }
            } else {
                NumberLineIntegerMask currentMask = entry.xMask;
                if (currentMask.equals(prevRowMask)) {
                    iter.remove();
                }
                prevRowMask = currentMask;
            }
        }

        if (!rows.isEmpty() && !rows.last().xMask.isEmpty()) {
            rows.add(new Row(y2, new NumberLineIntegerMask()));
        }
    }

    @Override
    protected Rectangle createBounds() {
        if (rows.isEmpty() || (rows.size()==1 && rows.iterator().next().xMask.isEmpty()) ) {
            return new Rectangle();
        }

        int x1, y1, x2, y2;
        x1 = y1 = x2 = y2 = 0;
        boolean undefined = true;
        for(Row rowEntry : rows) {
            NumberLineIntegerMask row = rowEntry.xMask;
            if (undefined) {
                undefined = false;
                y1 = rowEntry.y;
                x1 = row.getMin();
                x2 = row.getMax();
            }
            if (!row.isEmpty()) {
                x1 = x1 < rowEntry.xMask.getMin() ? x1 : rowEntry.xMask.getMin();
                x2 = x2 > rowEntry.xMask.getMax() ? x2 : rowEntry.xMask.getMax();
            }
            y2 = rowEntry.y;
        }

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    public boolean contains(int x, int y) {
        Row floorRow = rows.floor(new Row(y));
        if (floorRow == null)
            return false;
        return floorRow.xMask.contains(x);
    }

    public boolean contains(int x, int y, int width,int height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Row floor = rows.floor(new Row(y));
        if (floor == null)
            return false;
        int y2 = y + height;
        int x2 = x + width;
        for (Row entry : rows.tailSet(floor, true)) {
            if (entry.y >= y2)
                return true;

            if (!entry.xMask.contains(x, x2)) {
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

        Row floor = rows.floor(new Row(y));
        Iterator<Row> iter = floor == null ?
                rows.iterator() :
                rows.tailSet(floor, true).iterator();
        int y2 = y + height;
        int x2 = x + width;
        while (iter.hasNext()) {
            Row entry = iter.next();
            if (entry.y >= y2)
                return false;

            if (entry.xMask.intersects(x, x2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return rows.isEmpty() || rows.first().xMask.isEmpty();
    }

    @Override
    protected Rectangle toRectangle() {
        int x1, y1, x2, y2;
        Iterator<Row> iter = rows.iterator();
        if (!iter.hasNext())
            return null;
        Row firstEntry = iter.next();

        y1 = firstEntry.y;
        x1 = firstEntry.xMask.getMin();
        x2 = firstEntry.xMask.getMax();

        if (!iter.hasNext())
            return null;

        Row secondEntry = iter.next();
        if (!secondEntry.xMask.isEmpty())
            return null;
        y2 = secondEntry.y;

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(int x, int y, int width, int height) {
        return isEqual(new Rectangle(x, y, width, height));
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

    @Override
    public Iterator<Rectangle> iterator() {
        return new MaskIterator();
    }

    @Override
    public boolean add(Rectangle r) {
        return add(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean xor(Rectangle r) {
        return xor(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean subtract(Rectangle r) {
        return subtract(r.x, r.y, r.width, r.height);
    }

    @Override
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

    @Override
    protected void collapseRows() {
        if (touchedRows == null)
            return;
        Row k1 = rows.floor(new Row(touchedRows[0]));
        Row k2 = rows.ceiling(new Row(touchedRows[1]));

        if (k1 != null) {
            k1 = rows.lower(k1);
        }

        if (k2 != null) {
            Row k3 = rows.higher(k2);
            if (k3 != null)
                k2 = k3;
        }

        Iterator<Row> iter;
        if (k1 == null) {
            iter = rows.iterator();
        } else if (k2 == null) {
            iter = rows.tailSet(k1, true).iterator();
        } else {
            iter = rows.subSet(k1, true, k2, true).iterator();
        }

        Row lowerEntry = k1 == null ? null : rows.lower(k1);
        NumberLineIntegerMask prevRowMask = lowerEntry == null ? new NumberLineIntegerMask() : lowerEntry.xMask;

        while (iter.hasNext()) {
            Row entry = iter.next();
            NumberLineIntegerMask currentMask = entry.xMask;
            if (currentMask.equals(prevRowMask)) {
                iter.remove();
            }
            prevRowMask = currentMask;
        }
    }

    @Override
    public RectangleMask clone() {
        RectangleMask copy = new RectangleMask();
        copy.add(this);
        return copy;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        if (r instanceof Rectangle) {
            // this one instanceof check can save us some autoboxing and some
            // subsequent Math.floor(double) and Math.ceil(double) calls
            Rectangle r2 = (Rectangle) r;
            return intersects(r2.x, r2.y, r2.width, r2.height);
        }
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(Rectangle2D r) {
        if (r instanceof Rectangle) {
            Rectangle r2 = (Rectangle) r;
            return contains(r2.x, r2.y, r2.width, r2.height);
        }
        return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public boolean contains(RectangleMask mask) {
        if (isEmpty() || mask.isEmpty())
            return false;

        Iterator<Rectangle> iter = mask.iterator();
        while (iter.hasNext()) {
            if (!contains(iter.next()))
                return false;
        }

        return true;
    }

    public boolean intersects(RectangleMask mask) {
        if (isEmpty() || mask.isEmpty())
            return false;

        Iterator<Rectangle> iter = mask.iterator();
        while (iter.hasNext()) {
            if (intersects(iter.next()))
                return true;
        }

        return false;
    }

    /**
     * Add another mask to this mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean add(RectangleMask rhs) {
        // TODO similarly remove all methods in AbstractRectangleMask
        // that take an AbstractRectangleMask as an arg and create
        // specialized methods like this one. It doesn't significantly
        // affect performance, but it adds a few ulps of accuracy
        // because we're not bouncing in and out of a Rectangle2D.

        if (rhs.isEmpty())
            return false;

        suspendAutoCollapseRows();
        try {
            boolean returnValue = false;
            if (isEmpty()) {
                rows.clear();
                for (Row entry : rhs.rows) {
                    rows.add(new Row(entry.y, new NumberLineIntegerMask(entry.xMask)));
                }
                returnValue = true;
            } else if(isAboveOrBelow(rhs)) {
                for (Row entry : rhs.rows) {
                    rows.add(new Row(entry.y, new NumberLineIntegerMask(entry.xMask)));
                }
                returnValue = true;
            } else {
                for (Row otherRow : rhs.rows) {
                    ensureRow(otherRow.y);
                }

                Iterator<Row> myIter = rows.subSet(rhs.rows.first(), true, rhs.rows.last(), true).iterator();
                while (myIter.hasNext()) {
                    Row myRow = myIter.next();
                    Row otherRow = rhs.rows.floor(myRow);
                    if (otherRow != null && myRow.xMask.add(otherRow.xMask))
                        returnValue = true;
                }

                if (touchedRows == null) {
                    touchedRows = new int[] {rhs.rows.first().y, rhs.rows.last().y};
                } else {
                    touchedRows[0] = Math.min(touchedRows[0], rhs.rows.first().y);
                    touchedRows[1] = Math.max(touchedRows[1], rhs.rows.last().y);
                }
            }

            if (returnValue) {
                modCount++;
                cachedBounds = null;
            }

            return returnValue;
        } finally {
            resumeAutoCollapseRows();
        }
    }

    /**
     * Subtract another mask from this mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean subtract(RectangleMask rhs) {
        if (rhs.isEmpty() || isEmpty() || !getBounds().intersects(rhs.getBounds()))
            return false;

        suspendAutoCollapseRows();
        try {
            boolean returnValue = false;
            for (Row otherRow : rhs.rows) {
                ensureRow(otherRow.y);
            }

            Iterator<Row> myIter = rows.subSet(rhs.rows.first(), true, rhs.rows.last(), true).iterator();
            while (myIter.hasNext()) {
                Row myRow = myIter.next();
                Row otherRow = rhs.rows.floor(myRow);
                if (otherRow != null && myRow.xMask.subtract(otherRow.xMask))
                    returnValue = true;
            }

            if (touchedRows == null) {
                touchedRows = new int[] {rhs.rows.first().y, rhs.rows.last().y};
            } else {
                touchedRows[0] = Math.min(touchedRows[0], rhs.rows.first().y);
                touchedRows[1] = Math.max(touchedRows[1], rhs.rows.last().y);
            }

            if (returnValue) {
                modCount++;
                cachedBounds = null;
            }

            return returnValue;
        } finally {
            resumeAutoCollapseRows();
        }
    }

    private boolean isAboveOrBelow(RectangleMask other) {
        return rows.last().y < other.rows.first().y || rows.first().y > other.rows.last().y;
    }
}