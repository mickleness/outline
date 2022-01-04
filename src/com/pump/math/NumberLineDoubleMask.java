package com.pump.math;

import com.pump.util.RangeDouble;
import com.pump.util.RangeDouble;
import com.pump.util.TandemIterator;

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

    protected TreeSet<RangeDouble> ranges;

    public NumberLineDoubleMask() {
        initialize();
    }

    public NumberLineDoubleMask(NumberLineDoubleMask maskToCopy) {
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
     * Return true if the argument is contained inside this NumberLineDouble.
     */
    public boolean contains(double x) {
        RangeDouble floorEntry = ranges.floor(new RangeDouble(x, Double.MAX_VALUE));
        RangeDouble range = floorEntry == null ? null : floorEntry;
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
        RangeDouble floorEntry = ranges.floor(new RangeDouble(min, Double.MAX_VALUE));
        RangeDouble range = floorEntry == null ? null : floorEntry;
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
        RangeDouble floorEntry = ranges.floor(new RangeDouble(min, Double.MAX_VALUE));

        Iterator<RangeDouble> iter;
        if (floorEntry == null) {
            iter = ranges.iterator();
        } else {
            iter = ranges.tailSet(floorEntry).iterator();
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

            RangeDouble floorEntry = ranges.floor(new RangeDouble(x1, x2));
            RangeDouble ceilingEntry = ranges.ceiling(new RangeDouble(x2, Double.MAX_VALUE));

            Iterator<RangeDouble> iter;
            if (floorEntry != null) {
                iter = ranges.tailSet(floorEntry, true).iterator();
            } else {
                iter = ranges.iterator();
            }

            while (iter.hasNext()) {
                RangeDouble existingRange = iter.next();
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

            ranges.add(new RangeDouble(x1, x2));
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

            RangeDouble floorEntry = ranges.floor(range);
            RangeDouble ceilingEntry = ranges.ceiling(new RangeDouble(range.max, Double.MAX_VALUE));

            Iterator<RangeDouble> iter;
            if (floorEntry != null) {
                iter = ranges.tailSet(floorEntry, true).iterator();
            } else {
                iter = ranges.iterator();
            }

            while (iter.hasNext()) {
                RangeDouble existingRange = iter.next();
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
                        ranges.add(new RangeDouble(existingRange.min, range.min));
                    }
                    if (addRightEdge) {
                        ranges.add(new RangeDouble(range.max, existingRange.max));
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

        double minA = ranges.first().min;
        double minB = other.ranges.first().min;
        double maxA = ranges.last().max;
        double maxB = other.ranges.last().max;
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
        return ranges.first().min;
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
        return ranges.last().max;
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
        return ranges.toArray(new RangeDouble[0]);
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        RangeDouble[] array = ranges.toArray(new RangeDouble[0]);
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
                ranges.add(range);
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
        return ranges.first().equals(range);
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

    public boolean xor(RangeDouble newRange) {
        return xor(newRange.min, newRange.max);
    }

    public boolean xor(double x1, double x2) {
        boolean returnValue = false;

        Collection<RangeDouble> additions = new ArrayList<>();

        Iterator<RangeDouble> iter = ranges.iterator();
        Double lastXinRange = null;
        while (iter.hasNext()) {
            RangeDouble existing = iter.next();

            if (existing.max == x1) {
                iter.remove();
                additions.add(existing);
            } else if (existing.intersects(x1, x2) || existing.min == x2) {
                iter.remove();
                returnValue = true;

                if (lastXinRange == null) {
                    if (existing.min > x1)
                        additions.add(new RangeDouble(x1, existing.min));
                } else {
                    additions.add(new RangeDouble(lastXinRange, existing.min));
                }

                if (existing.min < x1) {
                    additions.add(new RangeDouble(existing.min, x1));
                }
                if (existing.max > x2) {
                    additions.add(new RangeDouble(x2, existing.max));
                }
                lastXinRange = existing.max;
            } else if (existing.min > x2) {
                break;
            }
        }

        if (lastXinRange == null) {
            additions.add(new RangeDouble(x1, x2));
        } else if (lastXinRange.compareTo(x2) < 0) {
            additions.add(new RangeDouble(lastXinRange, x2));
        }

        // join adjacent ranges in additions;
        RangeDouble uncommitted = null;
        RangeDouble[] additionsArray = additions.toArray(new RangeDouble[additions.size()]);
        additions.clear();
        for(RangeDouble r : additionsArray) {
            if (uncommitted == null) {
                uncommitted = r;
            } else {
                if (uncommitted.max == r.min) {
                    uncommitted = new RangeDouble(uncommitted.min, r.max);
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

//    public boolean contains(NumberLineDoubleMask other) {
//        for(RangeDouble otherRange : other.ranges) {
//            if (!contains(otherRange.min, otherRange.max))
//                return false;
//        }
//        return true;
//    }
//
//    public boolean intersects(NumberLineDoubleMask other) {
//        for(RangeDouble otherRange : other.ranges) {
//            if (intersects(otherRange.min, otherRange.max))
//                return true;
//        }
//        return false;
//    }

    public boolean contains(NumberLineDoubleMask other) {
        if (isEmpty() || other.isEmpty())
            return false;

        Iterator<RangeDouble> myIter;

        RangeDouble myFloor = ranges.floor(other.ranges.first());
        RangeDouble myCeil = ranges.ceiling(other.ranges.last());
        if (myFloor != null && myCeil != null) {
            myIter = ranges.subSet(myFloor, true, myCeil, true).iterator();
        } else if (myFloor != null) {
            myIter = ranges.tailSet(myFloor, true).iterator();
        }  else {
            myIter = ranges.iterator();
        }

        TandemIterator<RangeDouble> tandemIterator = new TandemIterator<>(myIter, other.ranges.iterator());

        List<RangeDouble> l = new ArrayList<>(2);
        while (tandemIterator.hasNext()) {
            tandemIterator.next(l);
            if (l.get(0) == null)
                return false;
            if (l.get(1) == null)
                continue;
            if (!l.get(0).contains(l.get(1)))
                return false;
        }

        return true;
    }

    public boolean intersects(NumberLineDoubleMask other) {
        if (isEmpty() || other.isEmpty())
            return false;

        Iterator<RangeDouble> myIter;

        RangeDouble myFloor = ranges.floor(other.ranges.first());
        RangeDouble myCeil = ranges.ceiling(other.ranges.last());
        if (myFloor != null && myCeil != null) {
            myIter = ranges.subSet(myFloor, true, myCeil, true).iterator();
        } else if (myFloor != null) {
            myIter = ranges.tailSet(myFloor, true).iterator();
        }  else {
            myIter = ranges.iterator();
        }

        TandemIterator<RangeDouble> tandemIterator = new TandemIterator<>(myIter, other.ranges.iterator());

        List<RangeDouble> l = new ArrayList<>(2);
        while (tandemIterator.hasNext()) {
            tandemIterator.next(l);
            if (l.get(0) == null)
                continue;
            if (l.get(1) == null) {
                if (tandemIterator.isIterator2Finished())
                    break;
                continue;
            }
            if (l.get(0).intersects(l.get(1)))
                return true;
        }

        return false;
    }
}