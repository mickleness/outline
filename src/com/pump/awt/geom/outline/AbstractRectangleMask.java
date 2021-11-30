package com.pump.awt.geom.outline;

import com.pump.math.NumberLineMask;

import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

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
public abstract class AbstractRectangleMask<N extends Comparable, R extends Rectangle2D> implements Serializable {

    enum Operation {
        ADD, SUBTRACT, CLIP
    }

    protected final TreeMap<N, NumberLineMask<N>> rows = new TreeMap<>();

    private final N zero;

    protected AbstractRectangleMask(N zero) {
        this.zero = zero;
        rows.put(zero, new NumberLineMask<>());
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

    protected abstract N add(N n1, N n2);

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
        boolean returnValue = performOperation(Operation.CLIP, x, y, width, height);

        // TODO: consolidate iterators. For this operation we probably
        // need to iterate over all rows (the top and bottom rows need
        // removing, and the middle rows need to be clipped).

        // drop rows above & below our clipped rect:
        Iterator<Map.Entry<N, NumberLineMask<N>>> iter = rows.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<N, NumberLineMask<N>> entry = iter.next();
            if (entry.getKey() == y)
                break;
            iter.remove();
            returnValue = true;
        }

        N y2 = add(y, height);
        iter = rows.descendingMap().entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<N, NumberLineMask<N>> entry = iter.next();
            if (entry.getKey().compareTo(y2) < 0)
                break;
            iter.remove();
            returnValue = true;
        }

        rows.put(y2, new NumberLineMask<>());

        return returnValue;
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

        // TODO: reinstate collapseRows limits
        collapseRows(); // y - 1, y + height + 1);
        return returnValue;
    }

    private void collapseRows() {
        // N y1, N } y2) {
//        N floorKey = rows.floorKey(y1);
        Iterator<Map.Entry<N, NumberLineMask<N>>> iter;
//        if (floorKey == null) {
            iter = rows.entrySet().iterator();
//        } else {
//            iter = rows.tailMap(floorKey).entrySet().iterator();
//        }
        Map.Entry<N, NumberLineMask<N>> entry = iter.hasNext() ? iter.next() : null;
        NumberLineMask<N> lastRowMask = entry == null ? null : entry.getValue();

        while (iter.hasNext() && lastRowMask != null && lastRowMask.isEmpty()) {
            iter.remove();
            entry = iter.hasNext() ? iter.next() : null;
            lastRowMask = entry == null ? null : entry.getValue();
        }

        while (iter.hasNext()) {
            entry = iter.next();
            NumberLineMask<N> currentRowMask = entry.getValue();
            if (currentRowMask.equals(lastRowMask)) {
                iter.remove();
            }
            lastRowMask = currentRowMask;
        }
    }

    public R getBounds() {
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

        return createBounds(x1, y1, x2, y2);
    }

    protected abstract R createBounds(N x1, N y1, N x2, N y2);

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

        return createBounds(x1, y1, x2, y2);
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
        return isEqual(createBounds(x, y, add(x, width), add(y, height)));
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
}
