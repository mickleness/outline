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

    protected void initialize() {
        ranges = new TreeMap<>();
    }

    @Override
    public String toString() {
        return ranges.values().toString();
    }

    @Override
    public NumberLineMask<T> clone() {
        NumberLineMask<T> copy = new NumberLineMask<>();
        copy.ranges.putAll(ranges);
        return copy;
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
     * Add a range that includes the min and excludes the max.
     *
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(T x1,T x2) {
        return add(x1, true, x2, false);
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(T x1, boolean minInclusive, T x2, boolean maxInclusive) {
        Map.Entry<T, Range<T>> floorEntry = ranges.floorEntry(x1);
        T floorKey = floorEntry == null ? null : floorEntry.getKey();

        if (floorEntry != null && floorEntry.getValue().equals(x1, minInclusive, x2, maxInclusive))
            return false;

        Map.Entry<T, Range<T>> ceilingEntry = ranges.ceilingEntry(x2);

        Iterator<Map.Entry<T, Range<T>>> iter;
        if (floorKey != null) {
            iter = ranges.tailMap(floorKey, true).entrySet().iterator();
        } else {
            iter = ranges.entrySet().iterator();
        }

        while (iter.hasNext()) {
            Map.Entry<T, Range<T>> entry = iter.next();
            Range<T> existingRange = entry.getValue();
            if (existingRange.contains(x1, minInclusive, x2, maxInclusive)) {
                return false;
            } else if(x1.equals(x2)) {
                if (existingRange.getMin().equals(x1)) {
                    iter.remove();
                    return add(x1, true, existingRange.getMax(), existingRange.isMaxInclusive());
                } else if (existingRange.getMax().equals(x1)) {
                    iter.remove();
                    return add(existingRange.getMin(), existingRange.isMinInclusive(), x2, true);
                }
            } else if (existingRange.intersects(x1, minInclusive, x2, maxInclusive)) {
                if (existingRange.getMin().compareTo(x1) < 0) {
                    x1 = existingRange.getMin();
                    minInclusive = existingRange.isMinInclusive();
                }
                if (existingRange.getMax().compareTo(x2) > 0) {
                    x2 = existingRange.getMax();
                    maxInclusive = existingRange.isMaxInclusive();
                }
                iter.remove();
            } else if (existingRange.getMax().equals(x1)) {
                if(existingRange.isMaxInclusive() || minInclusive) {
                    x1 = existingRange.getMin();
                    minInclusive = existingRange.isMinInclusive();
                    iter.remove();
                }
            } else if (existingRange.getMin().equals(x2)) {
                if (existingRange.isMinInclusive() || maxInclusive) {
                    x2 = existingRange.getMax();
                    maxInclusive = existingRange.isMaxInclusive();
                    iter.remove();
                }
            }
            if (ceilingEntry != null && existingRange == ceilingEntry.getValue()) {
                break;
            }
        }

        ranges.put(x1, new Range<T>(x1, minInclusive, x2, maxInclusive));
        return true;
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(Range<T> newRange) {
        return add(newRange.getMin(), newRange.isMinInclusive(), newRange.getMax(), newRange.isMaxInclusive());
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(NumberLineMask<T> other) {
        boolean returnValue = false;
        for(Range<T> range : other.getRanges()) {
            if (add(range.getMin(), range.isMinInclusive(), range.getMax(), range.isMaxInclusive()))
                returnValue = true;
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(Range<T> removedRange) {
        return subtract(removedRange.getMin(), removedRange.isMinInclusive(), removedRange.getMax(), removedRange.isMaxInclusive());
    }

    /**
     * Subtract a range that includes the min and excludes the max.
     *
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(T min, T max) {
        return subtract(min, true, max, false);
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(T x1, boolean minInclusive, T x2, boolean maxInclusive) {
        Map.Entry<T, Range<T>> floorEntry = ranges.floorEntry(x1);
        T floorKey = floorEntry == null ? null : floorEntry.getKey();

        Range<T> replacementFloor;
        boolean returnValue = false;

        Iterator<Map.Entry<T, Range<T>>> iter;
        if (floorKey != null) {
            boolean removeFloor;
            if (!floorEntry.getValue().intersects(x1, minInclusive, x2, maxInclusive)) {
                removeFloor = false;
                replacementFloor = null;
            } else {
                int k1 = floorEntry.getValue().getMax().compareTo(x1);
                if (k1 == 0) {
                    if (floorEntry.getValue().isMaxInclusive() && minInclusive) {
                        replacementFloor = new Range<T>(floorEntry.getValue().getMin(),
                                floorEntry.getValue().isMinInclusive(), floorEntry.getValue().getMax(), false);
                        removeFloor = true;
                    } else {
                        replacementFloor = null;
                        removeFloor = false;
                    }
                } else {
                    int k2 = floorEntry.getValue().getMin().compareTo(x1);
                    if (k2 == 0) {
                        if (floorEntry.getValue().isMinInclusive() && !minInclusive) {
                            replacementFloor = new Range<T>(floorEntry.getValue().getMin(),
                                    false, floorEntry.getValue().getMin(), false);
                            removeFloor = true;
                        } else {
                            replacementFloor = null;
                            removeFloor = true;
                        }
                    } else {
                        // k1 and k2 should always be negative, since it is a "floor":
                        replacementFloor = new Range<T>(floorEntry.getValue().getMin(),
                                floorEntry.getValue().isMinInclusive(), x1, !minInclusive);
                        removeFloor = true;
                    }
                }
            }
            iter = ranges.tailMap(floorKey, true).entrySet().iterator();
            iter.next();
            if(removeFloor) {
                returnValue = true;
                iter.remove();
            }
        } else {
            iter = ranges.entrySet().iterator();
            replacementFloor = null;
        }

        Range<T> replacementCeiling = null;
        while (iter.hasNext()) {
            Map.Entry<T, Range<T>> entry = iter.next();
            int k = x2.compareTo(entry.getValue().getMax());
            if (k > 0) {
                iter.remove();
                returnValue = true;
            } else if (k == 0) {
                if (entry.getValue().isMaxInclusive() && !maxInclusive) {
                    iter.remove();
                    replacementCeiling = new Range<>(entry.getValue().getMax(), false,
                            entry.getValue().getMax(), false);
                    break;
                } else {
                    iter.remove();
                    break;
                }
            } else {
                int k2 = x2.compareTo(entry.getValue().getMin());
                if (k2 < 0) {
                    // we're all done
                    break;
                } else if (k2 == 0) {
                    if (maxInclusive) {
                        if (entry.getValue().isMinInclusive()) {
                            iter.remove();
                            replacementCeiling = new Range<>(entry.getValue().getMin(), false, entry.getValue().getMax(), entry.getValue().isMaxInclusive());
                        } else {
                            return false;
                        }
                    } else {
                        // do nothing
                    }
                } else {
                    iter.remove();
                    replacementCeiling = new Range<>(x2, !maxInclusive, entry.getValue().getMax(), entry.getValue().isMaxInclusive());
                }
            }
        }

        if (replacementFloor != null) {
            returnValue = true;
            ranges.put(replacementFloor.getMin(), replacementFloor);
        }
        if (replacementCeiling != null) {
            returnValue = true;
            ranges.put(replacementCeiling.getMin(), replacementCeiling);
        }

        return returnValue;
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(NumberLineMask<T> other) {
        boolean returnValue = false;
        for(Range<T> range : other.getRanges()) {
            if (subtract(range.getMin(), range.isMinInclusive(), range.getMax(), range.isMaxInclusive()))
                returnValue = true;
        }
        return returnValue;
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
        return ranges.firstEntry().getValue().getMin();
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
        return ranges.lastEntry().getValue().getMax();
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
                ranges.put( (T) range.getMin(), range);
            }
        } else {
            throw new IOException("Unsupported internal version: "+internalVersion);
        }
    }
}