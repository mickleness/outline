package com.pump.awt.geom.mask;

import com.pump.awt.geom.RectangularTransform;
import com.pump.math.NumberLineDoubleMask;
import com.pump.math.NumberLineIntegerMask;
import com.pump.util.RangeDouble;
import com.pump.util.RangeInteger;
import com.pump.util.TandemIterator;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serial;
import java.util.*;
import java.util.List;

/**
 * This is a composition of double-based java.awt.geom.Rectangle2D.Doubles.
 */
public class RectangleMask2D extends AbstractRectangleMask<Rectangle2D.Double> {

    @Serial
    private static final long serialVersionUID = 1L;

    class MaskIterator implements Iterator<Rectangle2D.Double> {
        Iterator<Map.Entry<Double, NumberLineDoubleMask>> iter;
        List<Rectangle2D.Double> iteratorValues = new LinkedList<>();
        Map.Entry<Double, NumberLineDoubleMask> prevRow;
        final int expectedModCount;

        {
            expectedModCount = modCount;
            iter = rows.entrySet().iterator();
            prevRow = iter.hasNext() ? iter.next() : null;
            updateIteratorValues();
        }

        private void updateIteratorValues() {
            while (iter.hasNext()) {
                Map.Entry<Double, NumberLineDoubleMask> currentRow = iter.next();

                for (RangeDouble range : prevRow.getValue().getRanges()) {
                    double x = range.min;
                    double y = prevRow.getKey();
                    double x2 = range.max;
                    double y2 = currentRow.getKey();
                    Rectangle2D.Double rect = new Rectangle2D.Double(x, y, x2 - x, y2 - y);
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
        public Rectangle2D.Double next() {
            checkForComodification();
            Rectangle2D.Double returnValue = iteratorValues.remove(0);
            updateIteratorValues();
            return returnValue;
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    protected final TreeMap<Double, NumberLineDoubleMask> rows = new TreeMap<>();
    protected double[] touchedRows;

    public RectangleMask2D() {
        clear();
    }

    public RectangleMask2D(Rectangle2D r) {
        this(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public RectangleMask2D(double x, double y, double width, double height) {
        this();
        add(x, y, width, height);
    }

    /**
     * Create a RectangleMask2D that traces a given shape. This may be a little too large especially on the right
     * and bottom edges; it is not guaranteed to be a perfect match.
     *
     * @param shape the shape to create a mask of
     * @param tx the optional AffineTransform to apply to the shape
     * @param maxSegmentArea the maximum area (width * height) of each segment's bounds. The smaller this value
     *                       is the more each segment will be partitioned into subsegments. Finer details lead to
     *                       greater accuracy and a larger data structure.
     */
    public RectangleMask2D(Shape shape, AffineTransform tx, double maxSegmentArea) {
        Objects.requireNonNull(shape);

        suspendAutoCollapseRows();

        // step 1: trace the perimeter/outline of the shape:

        OutlineTracer tracer = new OutlineTracer(shape, tx, maxSegmentArea) {

            @Override
            protected void addUnsortedEdges(double x0, double x1, double y0, double y1) {
                double xMin = Math.min(x0, x1);
                double xMax = Math.max(x0, x1);

                double yMin = Math.min(y0, y1);
                double yMax = Math.max(y0, y1);

                if (xMin == xMax)
                    xMax += Math.ulp(xMax);
                if (yMin == yMax)
                    yMax += Math.ulp(yMax);

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
                Map.Entry<Double, NumberLineDoubleMask> lastEntry = null;
                for(Map.Entry<Double, NumberLineDoubleMask> entry : rows.entrySet()) {
                    if (lastEntry != null) {
                        fill(lastEntry.getKey(), entry.getKey(), lastEntry.getValue());
                    }

                    lastEntry = entry;
                }
            }

            NumberLineDoubleMask prevFillMask = null;
            NumberLineDoubleMask prevEmptyMask = null;
            private void fill(double y1, double y2, NumberLineDoubleMask horizMask) {
                double y = (y1 + y2) / 2.0;

                NumberLineDoubleMask currentFillMask = new NumberLineDoubleMask();
                NumberLineDoubleMask currentEmptyMask = new NumberLineDoubleMask();

                if (prevFillMask != null) {
                    // if our unfilled segments intersect the filled/unfilled info from the previous row,
                    // that can inform how we flood-fill without having to call shape#contains(..)
                    RangeDouble[] ranges = horizMask.getRanges();
                    for(int a = 1; a < ranges.length; a++) {
                        double x1 = ranges[a - 1].max;
                        double x2 = ranges[a].min;
                        if (prevFillMask.intersects(x1, x2)) {
                            currentFillMask.add(x1, x2);
                            horizMask.add(x1, x2);
                        }
                        if (prevEmptyMask.intersects(x1, x2)) {
                            currentEmptyMask.add(x1, x2);
                        }
                    }
                }

                RangeDouble[] ranges = horizMask.getRanges();
                for(int a = 1; a < ranges.length; a++) {
                    double x1 = ranges[a-1].max;
                    double x2 = ranges[a].min;

                    // we already figured out this must be an empty zone
                    if (currentEmptyMask.intersects(x1, x2))
                        continue;

                    // ... and [x1,x2) won't be in currentFillMask or horizMask, because the
                    // range [x1, x2) is by definition a gap in those number line masks

                    double x = (x1 + x2) / 2.0;
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
            rows.put(0.0, new NumberLineDoubleMask());
            modCount++;
            cachedBounds = null;
            return true;
        }
        return false;
    }

    private NumberLineDoubleMask ensureRow(double y) {
        Map.Entry<Double, NumberLineDoubleMask> nearestRow = rows.floorEntry(y);
        if (nearestRow == null) {
            NumberLineDoubleMask newRow = new NumberLineDoubleMask();
            rows.put( Double.valueOf(y), newRow);
            return newRow;
        } else if (nearestRow.getKey().doubleValue() == y) {
            return nearestRow.getValue();
        } else {
            NumberLineDoubleMask newRow = new NumberLineDoubleMask(nearestRow.getValue());
            rows.put(y, newRow);
            return newRow;
        }
    }

    public boolean add(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.ADD, x, y, x + width, y + height);
    }

    public boolean xor(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.XOR, x, y, x + width, y + height);
    }

    public boolean subtract(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.SUBTRACT, x, y, x + width, y + height);
    }

    public boolean clip(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.CLIP, x, y, x + width, y + height);
    }

    protected boolean performOperation(Operation op, double x, double y, double x2, double y2) {
        ensureRow(y);
        ensureRow(y2);

        if (touchedRows == null) {
            touchedRows = new double[] {y, y2};
        } else {
            touchedRows[0] = Math.min(y, touchedRows[0]);
            touchedRows[1] = Math.max(y, touchedRows[1]);
        }

        suspendAutoCollapseRows();

        try {
            boolean returnValue = false;
            for (Map.Entry<Double, NumberLineDoubleMask> entry : rows.tailMap(y).entrySet()) {
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

    private void removeRowsAboveAndBelow(double y1, double y2) {
        Iterator<Map.Entry<Double, NumberLineDoubleMask>> iter;
        iter = rows.entrySet().iterator();

        NumberLineDoubleMask prevRowMask = new NumberLineDoubleMask();
        while (iter.hasNext()) {
            Map.Entry<Double, NumberLineDoubleMask> entry = iter.next();
            if (entry.getKey().doubleValue() < y1 || entry.getKey().doubleValue() > y2) {
                iter.remove();
            } else if (entry.getKey().compareTo(y2) == 0) {
                if (prevRowMask != null && prevRowMask.isEmpty()) {
                    iter.remove();
                } else if (!entry.getValue().isEmpty()) {
                    entry.getValue().clear();
                }
            } else {
                NumberLineDoubleMask currentMask = entry.getValue();
                if (currentMask.equals(prevRowMask)) {
                    iter.remove();
                }
                prevRowMask = currentMask;
            }
        }

        if (!rows.isEmpty() && !rows.lastEntry().getValue().isEmpty()) {
            rows.put(y2, new NumberLineDoubleMask());
        }
    }

    @Override
    protected Rectangle2D.Double createBounds() {
        if (rows.isEmpty() || (rows.size()==1 && rows.entrySet().iterator().next().getValue().isEmpty()) ) {
            return new Rectangle2D.Double();
        }

        double x1, y1, x2, y2;
        x1 = y1 = x2 = y2 = 0;
        boolean undefined = true;
        for(Map.Entry<Double, NumberLineDoubleMask> rowEntry : rows.entrySet()) {
            NumberLineDoubleMask row = rowEntry.getValue();
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

        return new Rectangle2D.Double(x1, y1, x2 - x1, y2 - y1);
    }

    public boolean contains(double x, double y) {
        Map.Entry<Double, NumberLineDoubleMask> floorRow = rows.floorEntry(y);
        if (floorRow == null)
            return false;
        return floorRow.getValue().contains(x);
    }

    public boolean contains(double x, double y, double width,double height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Double floorKey = rows.floorKey(y);
        if (floorKey == null)
            return false;
        double y2 = y + height;
        double x2 = x + width;
        for (Map.Entry<Double, NumberLineDoubleMask> entry : rows.tailMap(floorKey, true).entrySet()) {
            if (entry.getKey().compareTo(y2) >= 0)
                return true;

            if (!entry.getValue().contains(x, x2)) {
                return false;
            }
        }
        return true;
    }

    public boolean intersects(double x, double y, double width,double height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Double floorKey = rows.floorKey(y);
        Iterator<Map.Entry<Double, NumberLineDoubleMask>> iter = floorKey == null ?
                rows.entrySet().iterator() :
                rows.tailMap(floorKey, true).entrySet().iterator();
        double y2 = y + height;
        double x2 = x + width;
        while (iter.hasNext()) {
            Map.Entry<Double, NumberLineDoubleMask> entry = iter.next();
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
    protected Rectangle2D.Double toRectangle() {
        double x1, y1, x2, y2;
        Iterator<Map.Entry<Double, NumberLineDoubleMask>> iter = rows.entrySet().iterator();
        if (!iter.hasNext())
            return null;
        Map.Entry<Double, NumberLineDoubleMask> firstEntry = iter.next();

        y1 = firstEntry.getKey();
        x1 = firstEntry.getValue().getMin();
        x2 = firstEntry.getValue().getMax();

        if (!iter.hasNext())
            return null;

        Map.Entry<Double, NumberLineDoubleMask> secondEntry = iter.next();
        if (!secondEntry.getValue().isEmpty())
            return null;
        y2 = secondEntry.getKey();

        return new Rectangle2D.Double(x1, y1, x2 - x1, y2 - y1);
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(double x, double y, double width, double height) {
        return isEqual(new Rectangle2D.Double(x, y, width, height));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleMask2D rMask = (RectangleMask2D) o;
        return Objects.equals(rows, rMask.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows);
    }

    @Override
    public Iterator<Rectangle2D.Double> iterator() {
        return new MaskIterator();
    }

    @Override
    public boolean add(Rectangle2D.Double r) {
        return add(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean xor(Rectangle2D.Double r) {
        return xor(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean subtract(Rectangle2D.Double r) {
        return subtract(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean clip(Rectangle2D.Double r) {
        return clip(r.x, r.y, r.width, r.height);
    }

    @Override
    protected void collapseRows() {
        if (touchedRows == null)
            return;
        Double k1 = rows.floorKey(touchedRows[0]);
        Double k2 = rows.ceilingKey(touchedRows[1]);

        if (k1 != null) {
            k1 = rows.lowerKey(k1);
        }

        if (k2 != null) {
            Double k3 = rows.higherKey(k2);
            if (k3 != null)
                k2 = k3;
        }

        Iterator<Map.Entry<Double, NumberLineDoubleMask>> iter;
        if (k1 == null) {
            iter = rows.entrySet().iterator();
        } else {
            iter = rows.subMap(k1, true, k2, true).entrySet().iterator();
        }

        Map.Entry<Double, NumberLineDoubleMask> lowerEntry = k1 == null ? null : rows.lowerEntry(k1);
        NumberLineDoubleMask prevRowMask = lowerEntry == null ? new NumberLineDoubleMask() : lowerEntry.getValue();

        while (iter.hasNext()) {
            Map.Entry<Double, NumberLineDoubleMask> entry = iter.next();
            NumberLineDoubleMask currentMask = entry.getValue();
            if (currentMask.equals(prevRowMask)) {
                iter.remove();
            }
            prevRowMask = currentMask;
        }
    }

    @Override
    public RectangleMask2D clone() {
        RectangleMask2D copy = new RectangleMask2D();
        copy.add(this);
        return copy;
    }

    /**
     * Transform this mask.
     */
    public void transform(RectangularTransform transform) {
        cachedBounds = null;

        // TODO: we could optimize this further when scaleX and scaleY are positive

        RectangleMask2D newMask = new RectangleMask2D();
        Iterator<Rectangle2D.Double> iter = iterator();
        while (iter.hasNext()) {
            Rectangle2D.Double rect = iter.next();
            transform.transform(rect, rect);
            newMask.add(rect);
        }
        rows.clear();
        rows.putAll(newMask.rows);
        modCount++;
        collapseRows();
    }

    static boolean useTandem = false;

    public boolean contains(RectangleMask2D mask) {
        if (isEmpty() || mask.isEmpty())
            return false;

        if (useTandem) {
            TandemIterator<Map.Entry<Double, NumberLineDoubleMask>> tandemIter = new TandemIterator<>(rows.entrySet().iterator(), mask.rows.entrySet().iterator());
            List<Map.Entry<Double, NumberLineDoubleMask>> l = new ArrayList<>(2);
            while (tandemIter.hasNext()) {
                tandemIter.next(l);
                if (l.get(0) == null)
                    return false;
                if (l.get(1) == null)
                    continue;

                if (!l.get(0).getValue().contains(l.get(1).getValue()))
                    return false;
            }
        } else {
            Iterator<Rectangle2D.Double> iter = mask.iterator();
            while (iter.hasNext()) {
                if (!contains(iter.next()))
                    return false;
            }
        }

        return true;
    }

    public boolean intersects(RectangleMask2D mask) {
        if (isEmpty() || mask.isEmpty())
            return false;

        if (useTandem) {
            TandemIterator<Map.Entry<Double, NumberLineDoubleMask>> tandemIter = new TandemIterator<>(rows.entrySet().iterator(), mask.rows.entrySet().iterator());
            List<Map.Entry<Double, NumberLineDoubleMask>> l = new ArrayList<>(2);
            while (tandemIter.hasNext()) {
                tandemIter.next(l);
                if (l.get(0) == null || l.get(1) == null)
                    continue;

                if (!l.get(0).getValue().intersects(l.get(1).getValue()))
                    return true;
            }
        } else {
            Iterator<Rectangle2D.Double> iter = mask.iterator();
            while (iter.hasNext()) {
                if (intersects(iter.next()))
                    return true;
            }
        }

        return false;
    }
}
