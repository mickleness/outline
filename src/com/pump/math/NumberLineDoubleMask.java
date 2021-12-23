package com.pump.math;

import com.pump.util.RangeDouble;

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
public class NumberLineDoubleMask implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    protected TreeMap<Double, RangeDouble> ranges;

    public NumberLineDoubleMask() {
        initialize();
    }

    public NumberLineDoubleMask(NumberLineDoubleMask maskToCopy) {
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
     * Return true if the argument is contained inside this NumberLineDouble.
     */
    public boolean contains(double x) {
        Map.Entry<Double, RangeDouble> floorEntry = ranges.floorEntry(Double.valueOf(x));
        RangeDouble range = floorEntry == null ? null : floorEntry.getValue();
        if (range == null)
            return false;
        return range.contains(x);
    }

    /**
     * Return true if the argument is contained inside this NumberLineDoubleMask.
     */
    public boolean contains(RangeDouble x) {
        return contains(x.min, x.max);
    }

    /**
     * Return true if the argument is contained inside this NumberLineDoubleMask.
     */
    public boolean contains(double min, double max) {
        Map.Entry<Double, RangeDouble> floorEntry = ranges.floorEntry(Double.valueOf(min));
        RangeDouble range = floorEntry == null ? null : floorEntry.getValue();
        if (range == null)
            return false;
        return range.contains(min, max);
    }

    /**
     * Return true if the argument intersects this NumberLine.
     */
    public boolean intersects(RangeDouble x) {
        return intersects(x.min, x.max);
    }

    /**
     * Return true if the argument intersects this NumberLine.
     */
    public boolean intersects(double min, double max) {
        Map.Entry<Double, RangeDouble> floorEntry = ranges.floorEntry(Double.valueOf(min));

        Iterator<RangeDouble> iter;
        if (floorEntry == null) {
            iter = ranges.values().iterator();
        } else {
            iter = ranges.tailMap(floorEntry.getKey()).values().iterator();
        }
        while (iter.hasNext()) {
            RangeDouble range = iter.next();
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
    public boolean add(double x1, double x2) {
        boolean returnValue = false;

        boolean repeat = true;
        while (repeat) {
            repeat = false;

            Map.Entry<Double, RangeDouble> floorEntry = ranges.floorEntry(Double.valueOf(x1));
            Map.Entry<Double, RangeDouble> ceilingEntry = ranges.ceilingEntry(Double.valueOf(x2));

            Iterator<Map.Entry<Double, RangeDouble>> iter;
            if (floorEntry != null) {
                iter = ranges.tailMap(floorEntry.getKey(), true).entrySet().iterator();
            } else {
                iter = ranges.entrySet().iterator();
            }

            while (iter.hasNext()) {
                Map.Entry<Double, RangeDouble> entry = iter.next();
                RangeDouble existingRange = entry.getValue();
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
                if (ceilingEntry != null && existingRange == ceilingEntry.getValue()) {
                    break;
                }
            }

            ranges.put(x1, new RangeDouble(x1, x2));
            return true;
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(RangeDouble newRange) {
        return add(newRange.min, newRange.max);
    }

    /**
     * @return true if a change occurred, false if the argument was already part of this mask.
     */
    public boolean add(NumberLineDoubleMask other) {
        boolean returnValue = false;
        for(RangeDouble range : other.getRanges()) {
            if (add(range.min, range.max))
                returnValue = true;
        }
        return returnValue;
    }

    public boolean subtract(double x1, double x2) {
        return subtract(new RangeDouble(x1, x2));
    }

    /**
     * @return true if a change occurred, false if the argument was already not a part of this mask.
     */
    public boolean subtract(final RangeDouble range) {
        boolean returnValue = false;

        boolean repeat = true;
        while (repeat) {
            repeat = false;

            Map.Entry<Double, RangeDouble> floorEntry = ranges.floorEntry(Double.valueOf(range.min));
            Map.Entry<Double, RangeDouble> ceilingEntry = ranges.ceilingEntry(Double.valueOf(range.max));

            Iterator<Map.Entry<Double, RangeDouble>> iter;
            if (floorEntry != null) {
                iter = ranges.tailMap(floorEntry.getKey(), true).entrySet().iterator();
            } else {
                iter = ranges.entrySet().iterator();
            }

            while (iter.hasNext()) {
                Map.Entry<Double, RangeDouble> entry = iter.next();
                RangeDouble existingRange = entry.getValue();
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
                        ranges.put(existingRange.min, new RangeDouble(existingRange.min, range.min));
                    }
                    if (addRightEdge) {
                        ranges.put(range.max, new RangeDouble(range.max, existingRange.max));
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
    public boolean subtract(NumberLineDoubleMask other) {
        boolean returnValue = false;
        for(RangeDouble range : other.getRanges()) {
            if (subtract(range.min, range.max))
                returnValue = true;
        }
        return returnValue;
    }

    /**
     * @return true if a change occurred, false if clipping to the argument makes no difference.
     */
    public boolean clip(RangeDouble range) {
        return clip(range.min, range.max);
    }

    /**
     * @return true if a change occurred, false if clipping to the argument makes no difference.
     */
    public boolean clip(double x1, double x2) {
        NumberLineDoubleMask scratch = new NumberLineDoubleMask();
        scratch.add(x1, x2);
        return clip(scratch);
    }

    public boolean clip(NumberLineDoubleMask other) {
        if (ranges.isEmpty())
            return false;

        if (other.isEmpty()) {
            ranges.clear();
            return true;
        }

        double minA = ranges.firstEntry().getValue().min;
        double minB = other.ranges.firstEntry().getValue().min;
        double maxA = ranges.lastEntry().getValue().max;
        double maxB = other.ranges.lastEntry().getValue().max;
        double min = minA < minB ? minA : minB;
        double max = maxA > maxB ? maxA : maxB;
        NumberLineDoubleMask scratch = new NumberLineDoubleMask();
        scratch.add(min, max);
        scratch.subtract(other);
        return subtract(scratch);
    }

    /**
     * Return the minimum value in this number line.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no minimum.
     */
    public double getMin() {
        if (ranges.isEmpty())
            throw new EmptyNumberLineMaskException();
        return ranges.firstEntry().getValue().min;
    }

    /**
     * Return the maximum value in this number line. Note number lines exclude the max, so
     * <code>contains(getMax())</code> should always return false.
     *
     * @throws EmptyNumberLineMaskException if {@link #isEmpty()} returns true so there is no maximum.
     */
    public double getMax() {
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
     * Return all the RangeDoubles that make up this mask.
     */
    public RangeDouble[] getRanges() {
        return ranges.values().toArray(new RangeDouble[0]);
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        RangeDouble[] array = ranges.values().toArray(new RangeDouble[0]);
        out.writeObject(array);
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        initialize();

        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            RangeDouble[] array = (RangeDouble[]) in.readObject();
            for(RangeDouble range : array) {
                ranges.put( Double.valueOf(range.min), range);
            }
        } else {
            throw new IOException("Unsupported internal version: "+internalVersion);
        }
    }

    /**
     * Return true if this mask contains only one element that equals the argument.
     */
    public boolean isEqual(RangeDouble range) {
        if (ranges.size() != 1)
            return false;
        return ranges.entrySet().iterator().next().getValue().equals(range);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberLineDoubleMask that = (NumberLineDoubleMask) o;
        return Objects.equals(ranges, that.ranges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ranges);
    }
}