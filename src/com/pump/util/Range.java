package com.pump.util;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

/**
 * An immutable range of values. For example: this could be a range of Doubles, Integers, BigDecimals,
 * Strings, etc. The boundaries are inclusive.
 */
public abstract class Range<T extends Comparable> implements Serializable {

    public static class Integer extends Range<java.lang.Integer> {

        public Integer(java.lang.Integer min, java.lang.Integer max) {
            super(min, max);
        }

        @Override
        public java.lang.Integer getPreviousValue() {
            return min - 1;
        }

        @Override
        public java.lang.Integer getNextValue() {
            return max + 1;
        }
    }

    @Serial
    private static final long serialVersionUID = 1L;

    public final T min, max;

    /**
     * Create a new Range.
     */
    public Range(T min, T max) {
        int k = min.compareTo(max);
        if (k > 0)
            throw new IllegalArgumentException(min+" > "+max);
        this.min = min;
        this.max = max;
    }

    /**
     * Return true if this Range contains the argument
     */
    public boolean contains(Range<T> other) {
        return contains(other.min, other.max);
    }

    /**
     * Return true if this Range contains the arguments.
     */
    public boolean contains(T otherX1,
                            T otherX2) {
        int k1 = min.compareTo(otherX1);
        if (k1 > 0)
            return false;

        int k2 = max.compareTo(otherX2);
        return k2 >= 0;
    }

    /**
     * Return true if this Range intersects the argument.
     */
    public boolean intersects(Range<T> other) {
        return intersects(other.min, other.max);
    }

    /**
     * Return true if this Range intersects the arguments.
     */
    public boolean intersects(T otherX1, T otherX2) {
        int k = min.compareTo(otherX2);
        if (k == 0) {
            return true;
        } else if (k > 0)
            return false;

        k = max.compareTo(otherX1);
        if (k == 0) {
            return true;
        } else return k >= 0;
    }

    /**
     * Return true if this Range contains the argument.
     */
    public boolean contains(T number) {
        int k = min.compareTo(number);
        if (k > 0)
            return false;

        k = max.compareTo(number);
        return k >= 0;
    }

    @Override
    public int hashCode() {
        return min.hashCode() ^ max.hashCode();
    }

    public boolean equals(T x1, T x2) {
        if (!x1.equals(this.min))
            return false;
        if (!x2.equals(this.max))
            return false;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Range))
            return false;
        Range<T> other = (Range<T>) obj;
        return equals(other.min, other.max);
    }

    /**
     * Parentheses are used to indicate an exclusive  boundary, and square brackets are used to
     * indicate an inclusive boundary. For example: the value <code>5</code> is included in
     * <code>[5, 10]</code>, but it is NOT included in <code>(5, 10)</code>.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(min);
        sb.append(',');
        sb.append(max);
        sb.append(']');
        return sb.toString();
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        out.defaultWriteObject();
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            in.defaultReadObject();
        } else {
            throw new IOException("Unsupported internal version: "+internalVersion);
        }
    }

    /**
     * Return the value immediately before this range.
     */
    public abstract T getPreviousValue();

    /**
     * Return the value immediately after this range.
     */
    public abstract T getNextValue();
}