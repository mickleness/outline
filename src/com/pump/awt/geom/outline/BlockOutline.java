package com.pump.awt.geom.outline;

import com.pump.util.Range;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.*;

/**
 * This is a shape composed of rectangles.
 * <p>
 * The Area class can (in rare cases) throw memory errors or take an excessively long time to compute
 * seemingly simple operations. This class is simpler and more reliable. (And the trade-off is: it only
 * uses horizontal or vertical lines.)
 * </p>
 */
public class BlockOutline implements Shape {

    static class NumberLineMask<T extends Number> {
        static class EmptyNumberLineMaskException extends RuntimeException {}

        static Comparator<Range<Integer>> MIN_COMPARATOR = new Comparator<Range<Integer>>() {
            @Override
            public int compare(Range<Integer> o1, Range<Integer> o2) {
                return o1.getMin().compareTo(o2.getMin());
            }
        };

        protected final TreeSet<Range<Integer>> masks = new TreeSet<>(MIN_COMPARATOR);

        public NumberLineMask() {
        }

        @Override
        public String toString() {
            return masks.toString();
        }

        @Override
        public NumberLineMask clone() {
            NumberLineMask copy = new NumberLineMask();
            copy.masks.addAll(masks);
            return copy;
        }

        public boolean contains(int x) {
            Range<Integer> floor = masks.floor(new Range<Integer>(x, true, x, true));
            if (floor == null)
                return false;
            return floor.contains(x);
        }

        public void addRange(final int x1,final int x2) {
            Range<Integer> newRange = new Range(x1, true, x2, false);

            Iterator<Range<Integer>> iter = masks.iterator();
            int newMin = x1;
            int newMax = x2;
            while(iter.hasNext()) {
                Range<Integer> existingRange = iter.next();
                if (newRange.intersects(existingRange) ||
                        (existingRange.getMax().equals(x1) && (existingRange.isMaxInclusive() || newRange.isMinInclusive()))) {
                    newMin = Math.min(existingRange.getMin(), newMin);
                    newMax = Math.max(existingRange.getMax(), newMax);
                    iter.remove();
                }
            }

            masks.add(new Range<Integer>(newMin, true, newMax, false));
        }

        public int getMin() {
            if (masks.isEmpty())
                throw new EmptyNumberLineMaskException();
            return masks.first().getMin();
        }

        public int getMax() {
            if (masks.isEmpty())
                throw new EmptyNumberLineMaskException();
            return masks.last().getMax();
        }

        public boolean isEmpty() {
            return masks.isEmpty();
        }
    }


    class PixelMaskIterator implements PathIterator {

        // TODO:

        @Override
        public int getWindingRule() {
            return PathIterator.WIND_NON_ZERO;
        }

        @Override
        public boolean isDone() {
            return false;
        }

        @Override
        public void next() {

        }

        @Override
        public int currentSegment(float[] coords) {
            return 0;
        }

        @Override
        public int currentSegment(double[] coords) {
            return 0;
        }
    }

    protected final TreeMap<Integer, NumberLineMask> rows = new TreeMap<>();

    public BlockOutline() {
        rows.put(0, new NumberLineMask());
    }

    public void add(int x, int y, int width, int height) {
        Rectangle r = new Rectangle(x, y, width, height);
        add(r);
    }

    private void ensureRow(int y) {
        Map.Entry<Integer, NumberLineMask> nearestRow = rows.floorEntry(y);
        if (nearestRow.getKey().intValue() == y)
            return;
        NumberLineMask newRow = nearestRow.getValue().clone();
        rows.put(y, newRow);
    }

    public void add(Rectangle r) {
        if (r.width < 0 || r.height < 0)
            throw new IllegalArgumentException(r.toString());
        if (r.width == 0 || r.height == 0)
            return;

        ensureRow(r.y);
        ensureRow(r.y + r.height);

        for(Map.Entry<Integer, NumberLineMask> entry : rows.tailMap(r.y).entrySet()) {
            if (entry.getKey() == r.y + r.height)
                break;
            entry.getValue().addRange(r.x, r.x + r.width);
        }

        // TODO: collapse
    }

    @Override
    public Rectangle getBounds() {
        if (rows.isEmpty()) {
            return new Rectangle(0,0,0,0);
        }

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        boolean empty = true;
        for(Map.Entry<Integer, NumberLineMask> rowEntry : rows.entrySet()) {
            NumberLineMask row = rowEntry.getValue();
            if (empty) {
                empty = false;
                y1 = rowEntry.getKey().intValue();
                x1 = row.getMin();
                x2 = row.getMax();
            }
            if (!row.masks.isEmpty()) {
                x1 = Math.min(x1, rowEntry.getValue().getMin());
                x2 = Math.min(x2, rowEntry.getValue().getMax());
            }
            y2 = rowEntry.getKey().intValue() + 1;
        }

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return getBounds();
    }

    @Override
    public boolean contains(double x, double y) {
        int xi = (int) (Math.round(x) + .5);
        int yi = (int) (Math.round(y) + .5);

        Map.Entry<Integer, NumberLineMask> floorRow = rows.floorEntry(yi);
        if (floorRow == null)
            return false;
        return floorRow.getValue().contains(xi);
    }

    @Override
    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        // TODO: implement
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        // TODO: implement
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return r.contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return new PixelMaskIterator();
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return getPathIterator(at);
    }
}