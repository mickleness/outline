package com.pump.util;

import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;

/**
 * An immutable range of int values.
 * <p>
 * The smaller bound (the minimum) is inclusive, and the maximum is exclusive. So a range from 0-2 would include 0 and
 * 1 but not 2. (The goal is to model how graphics are rendered, so if you imagine a java.awt.Rectangle defined
 * as <code>new Rectangle(0, 0, 2, 2)</code>: we would fill in the first pixel and the second pixel but not the third.)
 * </p>
 */
public class RangeInteger implements Serializable, Comparable<RangeInteger> {

    @Serial
    private static final long serialVersionUID = 1L;

    public final int min, max;

    /**
     * Create a new RangeInteger.
     */
    public RangeInteger(int min, int max) {
        if (min == max)
            throw new IllegalArgumentException(min+" = "+max);
        if (min > max)
            throw new IllegalArgumentException(min+" > "+max);
        this.min = min;
        this.max = max;
    }

    /**
     * Return true if this RangeInteger contains the argument
     */
    public boolean contains(RangeInteger other) {
        return contains(other.min, other.max);
    }

    /**
     * Return true if this RangeInteger contains the arguments.
     */
    public boolean contains(int otherX1,
                            int otherX2) {
        if (min > otherX1)
            return false;

        return max >= otherX2;
    }

    /**
     * Return true if this RangeInteger intersects the argument.
     */
    public boolean intersects(RangeInteger other) {
        return intersects(other.min, other.max);
    }

    /**
     * Return true if this RangeInteger intersects the arguments.
     */
    public boolean intersects(int otherX1, int otherX2) {
        if (min == otherX2)
            return false;
        if (min > otherX2)
            return false;

        if (max == otherX1)
            return false;
        return max > otherX1;
    }

    /**
     * Return true if this RangeInteger contains the argument.
     */
    public boolean contains(int number) {
        if (min > number)
            return false;

        return max > number;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(min) ^ Integer.hashCode(max);
    }

    public boolean equals(int x1, int x2) {
        if (x1 != min)
            return false;
        if (x2 != max)
            return false;
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof RangeInteger))
            return false;
        RangeInteger other = (RangeInteger) obj;
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
        sb.append(')');
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

    @Override
    public int compareTo(RangeInteger o) {
        int k = Integer.compare(min, o.min);
        if (k != 0)
            return k;
        k = Integer.compare(max, o.max);
        return k;
    }
}