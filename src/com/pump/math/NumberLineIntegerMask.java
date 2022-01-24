package com.pump.math;

import com.pump.util.RangeInteger;

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
public class NumberLineIntegerMask implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    protected TreeSet<RangeInteger> ranges;

    public NumberLineIntegerMask() {
        initialize();
    }

    public NumberLineIntegerMask(NumberLineIntegerMask maskToCopy) {
        initialize();
        ranges.addAll(maskToCopy.ranges);
    }

    protected void initialize() {
        ranges = new TreeSet<>();
    }

    @Override
    public String toString() {
        return ranges.toString();
    }

    /**
     * Return true if the argument is contained inside this NumberLineInteger.
     */
    public boolean contains(int x) {
        RangeInteger floorEntry = ranges.floor(new RangeInteger(x, Integer.MAX_VALUE));
        RangeInteger range = floorEntry == null ? null : floorEntry;
        if (range == null)
            return false;
        return range.contains(x);
    }

    /**
     * Return true if the argument is contained inside this NumberLineIntegerMask.
     */
    public boolean contains(RangeInteger x) {
        return contains(x.min, x.max);
    }

    /**
     * Return true if the argument is contained inside this NumberLineIntegerMask.
     */
    public boolean contains(int min, int max) {
        RangeInteger floorEntry = ranges.floor(new RangeInteger(min, Integer.MAX_VALUE));
        RangeInteger range = floorEntry == null ? null : floorEntry;
        if (range == null)
            return false;
        return range.contains(min, max);
    }

    /**
     * Return true if the argument intersects this NumberLine.
     */
    public boolean intersects(RangeInteger x) {
        return intersects(x.min, x.max);
    }

    /**
     * Return true if the argument intersects this NumberLine.
     */
    public boolean intersects(int min, int max) {
        RangeInteger floorEntry = ranges.floor(new RangeInteger(min, Integer.MAX_VALUE));

        Iterator<RangeInteger> iter;
        if (floorEntry == null) {
            iter = ranges.iterator();
        } else {
            iter = ranges.tailSet(floorEntry).iterator();
        }
        while (iter.hasNext()) {
            RangeInteger range = iter.next();
            if (range.intersects(min, max))
                return true;
            if (range.max > max)
                break;
        }
        return false;
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(int x1, int x2) {
        boolean returnValue = false;

        boolean repeat = true;
        while (repeat) {
            repeat = false;

            RangeInteger floorEntry = ranges.floor(new RangeInteger(x1, Integer.MAX_VALUE));
            RangeInteger ceilingEntry = ranges.ceiling(new RangeInteger(x2, Integer.MAX_VALUE));

            Iterator<RangeInteger> iter;
            if (floorEntry != null) {
                iter = ranges.tailSet(floorEntry, true).iterator();
            } else {
                iter = ranges.iterator();
            }

            while (iter.hasNext()) {
                RangeInteger existingRange = iter.next();
                if (existingRange.contains(x1, x2)) {
                    return returnValue;
                } else if (existingRange.intersects(x1, x2) ||
                        x1 == existingRange.max ||
                        x2 == existingRange.min) {
                    returnValue = true;
                    iter.remove();
                    if (x1 > existingRange.min)
                        x1 = existingRange.min;
                    if (existingRange.max > x2)
                        x2 = existingRange.max;
                    repeat = true;
                }
                if (ceilingEntry != null && existingRange == ceilingEntry) {
                    break;
                }
            }

            ranges.add(new RangeInteger(x1, x2));
            return true;
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(RangeInteger newRange) {
        return add(newRange.min, newRange.max);
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(NumberLineIntegerMask other) {
        boolean returnValue = false;
        for(RangeInteger range : other.ranges) {
            if (add(range.min, range.max))
                returnValue = true;
        }
        return returnValue;
    }

    public boolean subtract(int x1, int x2) {
        return subtract(new RangeInteger(x1, x2));
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(final RangeInteger range) {
        boolean returnValue = false;

        boolean repeat = true;
        while (repeat) {
            repeat = false;

            RangeInteger floorEntry = ranges.floor(range);
            RangeInteger ceilingEntry = ranges.ceiling(new RangeInteger(range.max, Integer.MAX_VALUE));

            Iterator<RangeInteger> iter;
            if (floorEntry != null) {
                iter = ranges.tailSet(floorEntry, true).iterator();
            } else {
                iter = ranges.iterator();
            }

            while (iter.hasNext()) {
                RangeInteger existingRange = iter.next();
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
                        if (range.min == existingRange.min) {
                            if (range.max == existingRange.max) {
                                // this should be covered above by 'range.contains(existingRange)'
                            } else {
                                addRightEdge = true;
                            }
                        } else if (range.max == existingRange.max) {
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
                    } else if (existingRange.min == range.max) {
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
                        ranges.add(new RangeInteger(existingRange.min, range.min));
                    }
                    if (addRightEdge) {
                        ranges.add(new RangeInteger(range.max, existingRange.max));
                    }
                }

                if (ceilingEntry != null && existingRange == ceilingEntry) {
                    break;
                }
            }
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(NumberLineIntegerMask other) {
        boolean returnValue = false;
        for(RangeInteger range : other.ranges) {
            if (subtract(range.min, range.max))
                returnValue = true;
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if clipping to the argument makes no difference.
     */
    public boolean clip(RangeInteger range) {
        return clip(range.min, range.max);
    }

    /**
     * @return true if a change occurred, false if clipping to the argument makes no difference.
     */
    public boolean clip(int x1, int x2) {
        NumberLineIntegerMask scratch = new NumberLineIntegerMask();
        scratch.add(x1, x2);
        return clip(scratch);
    }

    public boolean clip(NumberLineIntegerMask other) {
        if (ranges.isEmpty())
            return false;

        if (other.isEmpty()) {
            ranges.clear();
            return true;
        }

        int minA = ranges.first().min;
        int minB = other.ranges.first().min;
        int maxA = ranges.last().max;
        int maxB = other.ranges.last().max;
        int min = minA < minB ? minA : minB;
        int max = maxA > maxB ? maxA : maxB;
        NumberLineIntegerMask scratch = new NumberLineIntegerMask();
        scratch.add(min, max);
        scratch.subtract(other);
        return subtract(scratch);
    }

    /**
     * Return the minimum value in this number line.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no minimum.
     */
    public int getMin() {
        if (ranges.isEmpty())
            throw new EmptyNumberLineMaskException();
        return ranges.first().min;
    }

    /**
     * Return the maximum value in this number line. Note number lines exclude the max, so
     * <code>contains(getMax())</code> should always return false.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no maximum.
     */
    public int getMax() {
        if (ranges.isEmpty())
            throw new EmptyNumberLineMaskException();
        return ranges.last().max;
    }

    /**
     * Return true if this number line is empty.
     */
    public boolean isEmpty() {
        return ranges.isEmpty();
    }

    /**
     * Remove all data from this NumberLineIntegerMask so {@link #getRanges()} returns an empty array.
     */
    public void clear() {
        ranges.clear();
    }

    /**
     * Return all the RangeIntegers that make up this mask.
     */
    public RangeInteger[] getRanges() {
        return ranges.toArray(new RangeInteger[0]);
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        RangeInteger[] array = ranges.toArray(new RangeInteger[0]);
        out.writeObject(array);
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        initialize();

        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            RangeInteger[] array = (RangeInteger[]) in.readObject();
            for(RangeInteger range : array) {
                ranges.add(range);
            }
        } else {
            throw new IOException("Unsupported internal version: "+internalVersion);
        }
    }

    /**
     * Return true if this mask contains only one element that equals the argument.
     */
    public boolean isEqual(RangeInteger range) {
        if (ranges.size() != 1)
            return false;
        return ranges.first().equals(range);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberLineIntegerMask that = (NumberLineIntegerMask) o;

        // this should be slightly more efficient than calling
        // ranges.equals(that.ranges), because here we get to
        // rely on their sorted order:

        if (ranges.size() != that.ranges.size())
            return false;

        Iterator<RangeInteger> iter1 = ranges.iterator();
        Iterator<RangeInteger> iter2 = that.ranges.iterator();

        while (iter1.hasNext()) {
            RangeInteger r1 = iter1.next();
            RangeInteger r2 = iter2.next();
            if (r1.min != r2.min || r1.max != r2.max)
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ranges);
    }

    public boolean xor(RangeInteger newRange) {
        return xor(newRange.min, newRange.max);
    }

    public boolean xor(int x1, int x2) {
        boolean returnValue = false;

        Collection<RangeInteger> additions = new ArrayList<>();

        Iterator<RangeInteger> iter = ranges.iterator();
        Integer lastXinRange = null;
        while (iter.hasNext()) {
            RangeInteger existing = iter.next();

            if (existing.max == x1) {
                iter.remove();
                additions.add(existing);
            } else if (existing.intersects(x1, x2) || existing.min == x2) {
                iter.remove();
                returnValue = true;

                if (lastXinRange == null) {
                    if (existing.min > x1)
                        additions.add(new RangeInteger(x1, existing.min));
                } else {
                    additions.add(new RangeInteger(lastXinRange, existing.min));
                }

                if (existing.min < x1) {
                    additions.add(new RangeInteger(existing.min, x1));
                }
                if (existing.max > x2) {
                    additions.add(new RangeInteger(x2, existing.max));
                }
                lastXinRange = existing.max;
            } else if (existing.min > x2) {
                break;
            }
        }

        if (lastXinRange == null) {
            additions.add(new RangeInteger(x1, x2));
        } else if (lastXinRange.compareTo(x2) < 0) {
            additions.add(new RangeInteger(lastXinRange, x2));
        }

        // join adjacent ranges in additions;
        RangeInteger uncommitted = null;
        RangeInteger[] additionsArray = additions.toArray(new RangeInteger[additions.size()]);
        additions.clear();
        for(RangeInteger r : additionsArray) {
            if (uncommitted == null) {
                uncommitted = r;
            } else {
                if (uncommitted.max == r.min) {
                    uncommitted = new RangeInteger(uncommitted.min, r.max);
                } else {
                    additions.add(uncommitted);
                    uncommitted = r;
                }
            }
        }
        if (uncommitted != null)
            additions.add(uncommitted);

        ranges.addAll(additions);

        return returnValue;
    }

    public boolean contains(NumberLineIntegerMask other) {
        for(RangeInteger otherRange : other.ranges) {
            if (!contains(otherRange.min, otherRange.max))
                return false;
        }
        return true;
    }

    public boolean intersects(NumberLineIntegerMask other) {
        for(RangeInteger otherRange : other.ranges) {
            if (intersects(otherRange.min, otherRange.max))
                return true;
        }
        return false;
    }
}