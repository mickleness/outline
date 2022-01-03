package com.pump.awt.geom.mask;

import com.pump.awt.geom.ClosedPathIterator;
import com.pump.awt.geom.MonotonicPathIterator;
import com.pump.math.NumberLineDoubleMask;
import com.pump.math.NumberLineIntegerMask;
import com.pump.util.RangeInteger;
import com.pump.util.TandemIterator;

import java.awt.*;
import java.awt.geom.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;
import java.util.List;

/**
 * This is a composition int-based rectangles.
 */
public class RectangleMask extends AbstractRectangleMask<Rectangle> {
    @Serial
    private static final long serialVersionUID = 1L;

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
    public RectangleMask(Shape shape, AffineTransform tx, double maxSegmentArea) {
        Objects.requireNonNull(shape);

        suspendAutoCollapseRows();

        // step 1: trace the perimeter/outline of the shape:

        OutlineTracer tracer = new OutlineTracer(shape, tx, maxSegmentArea) {

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

    @Override
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

    private NumberLineIntegerMask ensureRow(int y) {
        Map.Entry<Integer, NumberLineIntegerMask> nearestRow = rows.floorEntry(y);
        if (nearestRow == null) {
            NumberLineIntegerMask newRow = new NumberLineIntegerMask();
            rows.put( Integer.valueOf(y), newRow);
            return newRow;
        } else if (nearestRow.getKey().intValue() == y) {
            return nearestRow.getValue();
        } else {
            NumberLineIntegerMask newRow = new NumberLineIntegerMask(nearestRow.getValue());
            rows.put(y, newRow);
            return newRow;
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
            for (Map.Entry<Integer, NumberLineIntegerMask> entry : rows.tailMap(y).entrySet()) {
                if (entry.getKey().equals(y2))
                    break;

                boolean opResults = switch (op) {
                    case ADD -> entry.getValue().add(x, x2);
                    case SUBTRACT -> entry.getValue().subtract(x, x2);
                    case CLIP -> entry.getValue().clip(x, x2);
                    case XOR -> entry.getValue().xor(x, x2);
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
        Iterator<Map.Entry<Integer, NumberLineIntegerMask>> iter;
        iter = rows.entrySet().iterator();

        NumberLineIntegerMask prevRowMask = new NumberLineIntegerMask();
        while (iter.hasNext()) {
            Map.Entry<Integer, NumberLineIntegerMask> entry = iter.next();
            if (entry.getKey().intValue() < y1 || entry.getKey().intValue() > y2) {
                iter.remove();
            } else if (entry.getKey().compareTo(y2) == 0) {
                if (prevRowMask != null && prevRowMask.isEmpty()) {
                    iter.remove();
                } else if (!entry.getValue().isEmpty()) {
                    entry.getValue().clear();
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
        }
    }

    @Override
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
        for (Map.Entry<Integer, NumberLineIntegerMask> entry : rows.tailMap(floorKey, true).entrySet()) {
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
    public boolean isEmpty() {
        return rows.isEmpty() || rows.firstEntry().getValue().isEmpty();
    }

    @Override
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
        Integer k1 = rows.floorKey(touchedRows[0]);
        Integer k2 = rows.ceilingKey(touchedRows[1]);

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

        TandemIterator<Map.Entry<Integer, NumberLineIntegerMask>> tandemIter = new TandemIterator<>(rows.entrySet().iterator(), mask.rows.entrySet().iterator());
        List<Map.Entry<Integer, NumberLineIntegerMask>> l = new ArrayList<>(2);
        while (tandemIter.hasNext()) {
            tandemIter.next(l);
            if (l.get(0) == null)
                return false;
            if (l.get(1) == null)
                continue;

            if (!l.get(0).getValue().contains(l.get(1).getValue()))
                return false;
        }

        return true;
    }

    public boolean intersects(RectangleMask mask) {
        if (isEmpty() || mask.isEmpty())
            return false;

        TandemIterator<Map.Entry<Integer, NumberLineIntegerMask>> tandemIter = new TandemIterator<>(rows.entrySet().iterator(), mask.rows.entrySet().iterator());
        List<Map.Entry<Integer, NumberLineIntegerMask>> l = new ArrayList<>(2);
        while (tandemIter.hasNext()) {
            tandemIter.next(l);
            if (l.get(0) == null || l.get(1) == null)
                continue;

            if (!l.get(0).getValue().intersects(l.get(1).getValue()))
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
        // TODO similarly remove all methods in AbstractRectangleMask
        // that take an AbstractRectangleMask as an arg and create
        // specialized methods like this one. It doesn't significantly
        // affect performance, but it adds a few ulps of accuracy
        // because we're not bouncing in and out of a Rectangle2D.

        if (mask.isEmpty())
            return false;

        suspendAutoCollapseRows();
        try {
            boolean returnValue = false;
            for(Map.Entry<Integer, NumberLineIntegerMask> otherRow : mask.rows.entrySet()) {
                ensureRow(otherRow.getKey().intValue());
            }

            Iterator<Map.Entry<Integer, NumberLineIntegerMask>> myIter = rows.subMap(mask.rows.firstKey(), true, mask.rows.lastKey(), true).entrySet().iterator();
            NumberLineIntegerMask mostRecentOtherRow = null;
            while (myIter.hasNext()) {
                Map.Entry<Integer, NumberLineIntegerMask> myRow = myIter.next();
                NumberLineIntegerMask otherRow = mask.rows.get(myRow.getKey());
                if (otherRow != null) {
                    mostRecentOtherRow = otherRow;
                }
                if (mostRecentOtherRow != null && myRow.getValue().add(mostRecentOtherRow))
                    returnValue = true;
            }

            if (touchedRows == null) {
                touchedRows = new int[] {mask.rows.firstKey().intValue(), mask.rows.lastKey().intValue()};
            } else {
                touchedRows[0] = Math.min(touchedRows[0], mask.rows.firstKey().intValue());
                touchedRows[1] = Math.max(touchedRows[1], mask.rows.lastKey().intValue());
            }

            return returnValue;
        } finally {
            modCount++;
            cachedBounds = null;
            resumeAutoCollapseRows();
        }
    }
}