package com.pump.math;

import com.pump.util.Range;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;

/**
 * This describes a mask that covers zero or more parts of the number line.
 * <p>
 * This is implemented as a series of {@link Range Ranges}, where the minimum is inclusive
 * and the maximum is inclusive. So if you call <code>addRange(0, 5)</code>, then
 * <code>contains(x)</code> will return true for 0-4, and it will return false for 5.
 */
public class NumberLineMask<T extends Comparable> implements Serializable {
    static class EmptyNumberLineMaskException extends RuntimeException {}

    @Serial
    private static final long serialVersionUID = 1L;

    static Comparator<Range> MIN_COMPARATOR = new Comparator<Range>() {
        @Override
        public int compare(Range o1, Range o2) {
            return o1.getMin().compareTo(o2.getMin());
        }
    };

    protected TreeSet<Range<T>> ranges = new TreeSet<>(MIN_COMPARATOR);

    public NumberLineMask() {
    }

    @Override
    public String toString() {
        return ranges.toString();
    }

    @Override
    public NumberLineMask<T> clone() {
        NumberLineMask<T> copy = new NumberLineMask<>();
        copy.ranges.addAll(ranges);
        return copy;
    }

    public boolean contains(T x) {
        Range floor = ranges.floor(new Range( x, true, x, true));
        if (floor == null)
            return false;
        return floor.contains(x);
    }

    public void addRange(final T x1,final T x2) {
        Range<T> newRange = new Range(x1, true, x2, false);

        Iterator<Range<T>> iter = ranges.iterator();
        T newMin = x1;
        T newMax = x2;
        while(iter.hasNext()) {
            Range<T> existingRange = iter.next();
            if (newRange.intersects(existingRange) ||
                    (existingRange.getMax().equals(x1) && (existingRange.isMaxInclusive() || newRange.isMinInclusive()))) {
                newMin = existingRange.getMin().compareTo(newMin) < 0 ? existingRange.getMin() : newMin;
                newMax = existingRange.getMax().compareTo(newMax) > 0 ? existingRange.getMax() : newMax;
                iter.remove();
            }
        }

        ranges.add(new Range<T>(newMin, true, newMax, false));
    }

    /**
     * Return the minimum value in this number line.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no maximum.
     */
    public T getMin() {
        if (ranges.isEmpty())
            throw new EmptyNumberLineMaskException();
        return ranges.first().getMin();
    }

    /**
     * Return the maximum value in this number line. Note number lines are defined by {@link Range} objects
     * that include the minimum and exclude the maximum, so <code>contains(getMax())</code> will always
     * return false.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no maximum.
     */
    public T getMax() {
        if (ranges.isEmpty())
            throw new EmptyNumberLineMaskException();
        return ranges.last().getMax();
    }

    /**
     * Return true if this number line is empty.
     */
    public boolean isEmpty() {
        return ranges.isEmpty();
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        Range<T>[] array = ranges.toArray(new Range[0]);
        out.writeObject(array);
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            Range[] array = (Range[]) in.readObject();
            ranges.addAll( (List) Arrays.asList(array));
        } else {
            throw new IOException("Unsupported internal version: "+internalVersion);
        }
    }
}