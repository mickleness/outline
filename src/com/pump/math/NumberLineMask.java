package com.pump.math;

import com.pump.util.Range;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;

/**
 * This describes a mask that covers zero or more parts of the number line.
 * <p>
 * This object is not thread safe.
 * </p>
 */
public class NumberLineMask<T extends Comparable> implements Serializable {

    static class EmptyNumberLineMaskException extends RuntimeException {}

    @Serial
    private static final long serialVersionUID = 1L;

    protected TreeMap<T, Range<T>> ranges;

    public NumberLineMask() {
        initialize();
    }

    public NumberLineMask(NumberLineMask<T> maskToCopy) {
        initialize();
        ranges.putAll(maskToCopy.ranges);
    }

    protected void initialize() {
        ranges = new TreeMap<>();
    }

    @Override
    public String toString() {
        return ranges.values().toString();
    }

    /**
     * Return true if the argument is contained inside this NumberLine.
     */
    public boolean contains(T x) {
        Map.Entry<T, Range<T>> floorEntry = ranges.floorEntry(x);
        Range<T> range = floorEntry == null ? null : floorEntry.getValue();
        if (range == null)
            return false;
        return range.contains(x);
    }

    /**
     * Return true if the argument is contained inside this NumberLine.
     */
    public boolean contains(Range<T> x) {
        return contains(x.min, x.max);
    }

    /**
     * Return true if the argument is contained inside this NumberLine.
     */
    public boolean contains(T min, T max) {
        Map.Entry<T, Range<T>> floorEntry = ranges.floorEntry(min);
        Range<T> range = floorEntry == null ? null : floorEntry.getValue();
        if (range == null)
            return false;
        return range.contains(min, max);
    }

    /**
     * Return true if the argument intersects this NumberLine.
     */
    public boolean intersects(Range<T> x) {
        return intersects(x.min, x.max);
    }

    /**
     * Return true if the argument intersects this NumberLine.
     */
    public boolean intersects(T min, T max) {
        Map.Entry<T, Range<T>> floorEntry = ranges.floorEntry(min);

        Iterator<Range<T>> iter;
        if (floorEntry == null) {
            iter = ranges.values().iterator();
        } else {
            iter = ranges.tailMap(floorEntry.getKey()).values().iterator();
        }
        while (iter.hasNext()) {
            Range range = iter.next();
            if (range.intersects(min, max))
                return true;
            if (range.max.compareTo(max) > 0)
                break;
        }
        return false;
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(T x1, T x2) {
        boolean returnValue = false;

        boolean repeat = true;
        while (repeat) {
            repeat = false;

            Map.Entry<T, Range<T>> floorEntry = ranges.floorEntry(x1);
            Map.Entry<T, Range<T>> ceilingEntry = ranges.ceilingEntry(x2);

            Iterator<Map.Entry<T, Range<T>>> iter;
            if (floorEntry != null) {
                iter = ranges.tailMap(floorEntry.getKey(), true).entrySet().iterator();
            } else {
                iter = ranges.entrySet().iterator();
            }

            while (iter.hasNext()) {
                Map.Entry<T, Range<T>> entry = iter.next();
                Range<T> existingRange = entry.getValue();
                if (existingRange.contains(x1, x2)) {
                    return returnValue;
                } else if (existingRange.intersects(x1, x2) ||
                        x1.equals(existingRange.max) ||
                        x2.equals(existingRange.min)) {
                    returnValue = true;
                    iter.remove();
                    if (x1.compareTo(existingRange.min) > 0)
                        x1 = existingRange.min;
                    if (existingRange.max.compareTo(x2) > 0)
                        x2 = existingRange.max;
                    repeat = true;
                }
                if (ceilingEntry != null && existingRange == ceilingEntry.getValue()) {
                    break;
                }
            }

            ranges.put(x1, new Range<>(x1, x2));
            return true;
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(Range<T> newRange) {
        return add(newRange.min, newRange.max);
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(NumberLineMask<T> other) {
        boolean returnValue = false;
        for(Range<T> range : other.getRanges()) {
            if (add(range.min, range.max))
                returnValue = true;
        }
        return returnValue;
    }

    public boolean subtract(T x1, T x2) {
        return subtract(new Range<>(x1, x2));
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(final Range<T> range) {
        boolean returnValue = false;

        boolean repeat = true;
        while (repeat) {
            repeat = false;

            Map.Entry<T, Range<T>> floorEntry = ranges.floorEntry(range.min);
            Map.Entry<T, Range<T>> ceilingEntry = ranges.ceilingEntry(range.max);

            Iterator<Map.Entry<T, Range<T>>> iter;
            if (floorEntry != null) {
                iter = ranges.tailMap(floorEntry.getKey(), true).entrySet().iterator();
            } else {
                iter = ranges.entrySet().iterator();
            }

            while (iter.hasNext()) {
                Map.Entry<T, Range<T>> entry = iter.next();
                Range<T> existingRange = entry.getValue();
                boolean addLeftEdge = false;
                boolean addRightEdge = false;
                try {
                    if (range.contains(existingRange)) {
                        iter.remove();
                        returnValue = true;
                        repeat = true;
                        break;
                    } else if (existingRange.contains(range)) {
                        iter.remove();
                        if (range.min.equals(existingRange.min)) {
                            if (range.max.equals(existingRange.max)) {
                                // this should be covered above by 'range.contains(existingRange)'
                            } else {
                                addRightEdge = true;
                            }
                        } else if (range.max.equals(existingRange.max)) {
                            addLeftEdge = true;
                        } else {
                            addLeftEdge = true;
                            addRightEdge = true;
                        }
                        return true;
                    } else if (existingRange.contains(range.min)) {
                        iter.remove();
                        returnValue = true;
                        addLeftEdge = true;
                        repeat = true;
                        break;
                    } else if (existingRange.min.compareTo(range.max) == 0) {
                        // do nothing
                    } else if (existingRange.contains(range.max)) {
                        iter.remove();
                        returnValue = true;
                        addRightEdge = true;
                        repeat = true;
                        break;
                    }
                } finally {
                    if (addLeftEdge) {
                        ranges.put(existingRange.min, new Range<>(existingRange.min, range.min));
                    }
                    if (addRightEdge) {
                        ranges.put(range.max, new Range<>(range.max, existingRange.max));
                    }
                }

                if (ceilingEntry != null && existingRange == ceilingEntry.getValue()) {
                    break;
                }
            }
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(NumberLineMask<T> other) {
        boolean returnValue = false;
        for(Range<T> range : other.getRanges()) {
            if (subtract(range.min, range.max))
                returnValue = true;
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if clipping to the argument makes no difference.
     */
    public boolean clip(Range<T> range) {
        return clip(range.min, range.max);
    }

    /**
     * @return true if a change occurred, false if clipping to the argument makes no difference.
     */
    public boolean clip(T x1, T x2) {
        NumberLineMask<T> scratch = new NumberLineMask<>();
        scratch.add(x1, x2);
        return clip(scratch);
    }

    public boolean clip(NumberLineMask<T> other) {
        if (ranges.isEmpty())
            return false;

        if (other.isEmpty()) {
            ranges.clear();
            return true;
        }

        T minA = ranges.firstEntry().getValue().min;
        T minB = other.ranges.firstEntry().getValue().min;
        T maxA = ranges.lastEntry().getValue().max;
        T maxB = other.ranges.lastEntry().getValue().max;
        T min = minA.compareTo(minB) < 0 ? minA : minB;
        T max = maxA.compareTo(maxB) > 0 ? maxA : maxB;
        NumberLineMask<T> scratch = new NumberLineMask<>();
        scratch.add(min, max);
        scratch.subtract(other);
        return subtract(scratch);
    }

    /**
     * Return the minimum value in this number line. Note number lines are defined by {@link Range} objects
     * that may or may not include the min. So <code>contains(getMin())</code> may or may not return true.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no maximum.
     */
    public T getMin() {
        if (ranges.isEmpty())
            throw new EmptyNumberLineMaskException();
        return ranges.firstEntry().getValue().min;
    }

    /**
     * Return the maximum value in this number line. Note number lines are defined by {@link Range} objects
     * that may or may not include the max. So <code>contains(getMax())</code> may or may not return true.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no maximum.
     */
    public T getMax() {
        if (ranges.isEmpty())
            throw new EmptyNumberLineMaskException();
        return ranges.lastEntry().getValue().max;
    }

    /**
     * Return true if this number line is empty.
     */
    public boolean isEmpty() {
        return ranges.isEmpty();
    }

    /**
     * Remove all data from this NumberLineMask so {@link #getRanges()} returns an empty array.
     */
    public void clear() {
        ranges.clear();
    }

    /**
     * Return all the Ranges that make up this NumberLineMask.
     */
    public Range<T>[] getRanges() {
        return ranges.values().toArray(new Range[0]);
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        Range<T>[] array = ranges.values().toArray(new Range[0]);
        out.writeObject(array);
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        initialize();

        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            Range[] array = (Range[]) in.readObject();
            for(Range range : array) {
                ranges.put( (T) range.min, range);
            }
        } else {
            throw new IOException("Unsupported internal version: "+internalVersion);
        }
    }

    /**
     * Return true if this mask contains only one element that equals the argument.
     */
    public boolean isEqual(Range<T> range) {
        if (ranges.size() != 1)
            return false;
        return ranges.entrySet().iterator().next().getValue().equals(range);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberLineMask<?> that = (NumberLineMask<?>) o;
        return Objects.equals(ranges, that.ranges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ranges);
    }
}