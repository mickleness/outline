package com.pump.util;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

/**
 * An immutable range of values. For example: this could be a range of Doubles, Integers, BigDecimals,
 * Strings, etc.
 * <p>
 * Each boundary can be declared inclusive or exclusive.
 * </p>
 */
public class Range<T extends Comparable> implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private T min, max;
    private boolean minInclusive, maxInclusive;

    /**
     * Create a new Range that includes the min and excludes that max. For example
     * if the min is 0 and the max is 5, then this will contain the five values:
     * {0, 1, 2, 3, 4}
     */
    public Range(T min, T max) {
        this(min, true, max, false);
    }

    /**
     * Create a new Range.
     */
    public Range(T min, boolean minInclusive, T max, boolean maxInclusive) {
        int k = min.compareTo(max);
        if (k > 0)
            throw new IllegalArgumentException(min+" > "+max);
        this.min = min;
        this.max = max;
        this.minInclusive = minInclusive;
        this.maxInclusive = maxInclusive;
    }

    /**
     * Return the minimum value in this Range.
     */
    public T getMin() {
        return min;
    }

    /**
     * Return the maximum value in this Range.
     */
    public T getMax() {
        return max;
    }

    /**
     * Return true if <code>getMin()</code> is considered part of this Range.
     * This returns the same value as <code>contains(getMin())</code>.
     */
    public boolean isMinInclusive() {
        return minInclusive;
    }

    /**
     * Return true if <code>getMax()</code> is considered part of this Range.
     * This returns the same value as <code>contains(getMax())</code>.
     */
    public boolean isMaxInclusive() {
        return maxInclusive;
    }

    /**
     * Return true if this Range contains the argument
     */
    public boolean contains(Range<T> other) {
        return contains(other.getMin(), other.isMinInclusive(), other.getMax(), other.isMaxInclusive());
    }

    /**
     * Return true if this Range contains the arguments.
     */
    public boolean contains(T otherX1, boolean otherMinInclusive,
                            T otherX2, boolean otherMaxInclusive) {
        int k = min.compareTo(otherX1);
        if (k == 0) {
            if (otherX1.equals(otherX2)) {
                return minInclusive;
            }
            if (!minInclusive && otherMinInclusive)
                return false;
        } else if(k > 0) {
            return false;
        }

        k = max.compareTo(otherX2);
        if (k == 0) {
            if (otherX1.equals(otherX2)) {
                return maxInclusive;
            }
            return maxInclusive || !otherMaxInclusive;
        } else return k >= 0;
    }

    /**
     * Return true if this Range intersects the argument.
     */
    public boolean intersects(Range<T> other) {
        return intersects(other.getMin(), other.isMinInclusive(), other.getMax(), other.isMaxInclusive());
    }

    /**
     * Return true if this Range intersects the arguments.
     */
    public boolean intersects(T otherX1, boolean otherMinInclusive,
                            T otherX2, boolean otherMaxInclusive) {
        int k = min.compareTo(otherX2);
        if (k == 0) {
            if (otherX1.equals(otherX2))
                return minInclusive;
            return minInclusive && otherMaxInclusive;
        } else if (k > 0)
            return false;

        k = max.compareTo(otherX1);
        if (k == 0) {
            if (otherX1.equals(otherX2))
                return maxInclusive;
            return maxInclusive && otherMinInclusive;
        } else return k >= 0;
    }

    /**
     * Return true if this Range contains the argument.
     */
    public boolean contains(T number) {
        int k = min.compareTo(number);
        if (minInclusive) {
            if (k > 0)
                return false;
        } else {
            if (k >= 0)
                return false;
        }

        k = max.compareTo(number);
        if (maxInclusive) {
            return k >= 0;
        } else {
            return k > 0;
        }
    }

    @Override
    public int hashCode() {
        return min.hashCode() ^ max.hashCode();
    }

    public boolean equals(T x1, boolean minInclusive, T x2, boolean maxInclusive) {
        if (!x1.equals(this.min))
            return false;
        if (!x2.equals(this.max))
            return false;
        if (minInclusive != this.minInclusive)
            return false;
        if (maxInclusive != this.maxInclusive)
            return false;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Range))
            return false;
        Range<T> other = (Range<T>) obj;
        return equals(other.min, other.minInclusive, other.max, other.maxInclusive);
    }

    /**
     * Parentheses are used to indicate an exclusive  boundary, and square brackets are used to
     * indicate an inclusive boundary. For example: the value <code>5</code> is included in
     * <code>[5, 10]</code>, but it is NOT included in <code>(5, 10)</code>.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (minInclusive) {
            sb.append('[');
        } else {
            sb.append('(');
        }
        sb.append(min);
        sb.append(',');
        sb.append(max);
        if (maxInclusive) {
            sb.append(']');
        } else {
            sb.append(')');
        }
        return sb.toString();
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        out.writeObject(min);
        out.writeObject(max);
        out.writeBoolean(minInclusive);
        out.writeBoolean(maxInclusive);
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            min = (T) in.readObject();
            max = (T) in.readObject();
            minInclusive = in.readBoolean();
            maxInclusive = in.readBoolean();
        } else {
            throw new IOException("Unsupported internal version: "+internalVersion);
        }
    }
}