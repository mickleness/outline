package com.pump.awt.geom.outline;

import com.pump.math.NumberLineMask;
import com.pump.util.Range;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
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
public abstract class AbstractRectangleMask<N extends Comparable, R extends Rectangle2D> implements Serializable {

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
                    iteratorValues.add(createBounds(range.min, prevRow.getKey(), range.max, currentRow.getKey()));
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

    public R getBounds() {
        if (cachedBounds == null)
            cachedBounds = createBounds();
        return (R) cachedBounds.clone();
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
}
