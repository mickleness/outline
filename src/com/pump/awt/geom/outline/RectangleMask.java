package com.pump.awt.geom.outline;

import com.pump.math.NumberLineMask;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serializable;
import java.util.*;

/**
 * This is a composition of rectangles.
 * <p>
 * The Area class can (in rare cases) throw memory errors or take an excessively long time to compute
 * seemingly simple operations. This object represents shape data using only horizontal and vertical
 * lines; as a result it is more reliable.
 * </p>
 */
public class RectangleMask implements Shape, Serializable {

    private enum Operation {
        ADD() {
            @Override
            public boolean execute(NumberLineMask<Integer> mask, int x1, int x2) {
                return mask.add(x1, x2);
            }
        },

        SUBTRACT() {
            @Override
            public boolean execute(NumberLineMask<Integer> mask, int x1, int x2) {
                return mask.subtract(x1, x2);
            }
        },

        CLIP() {
            @Override
            public boolean execute(NumberLineMask<Integer> mask, int x1, int x2) {
                return mask.clip(x1, x2);
            }
        };

        public abstract boolean execute(NumberLineMask<Integer> mask, int x1, int x2);
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

    protected final TreeMap<Integer, NumberLineMask<Integer>> rows = new TreeMap<>();

    public RectangleMask() {
        rows.put(0, new NumberLineMask.Integer());
    }

    private void ensureRow(int y) {
        Map.Entry<Integer, NumberLineMask<Integer>> nearestRow = rows.floorEntry(y);
        if (nearestRow == null) {
            NumberLineMask newRow = new NumberLineMask.Integer();
            rows.put(y, newRow);
        } else if (nearestRow.getKey().intValue() == y) {
            return;
        } else {
            NumberLineMask newRow = nearestRow.getValue().clone();
            rows.put(y, newRow);
        }
    }

    public boolean add(Rectangle r) {
        return add(r.x, r.y, r.width, r.height);
    }

    public boolean add(int x, int y, int width, int height) {
        return performOperation(Operation.ADD, x, y, width, height);
    }

    public boolean subtract(Rectangle r) {
        return subtract(r.x, r.y, r.width, r.height);
    }

    public boolean subtract(int x, int y, int width, int height) {
        return performOperation(Operation.SUBTRACT, x, y, width, height);
    }

    public boolean clip(Rectangle r) {
        return clip(r.x, r.y, r.width, r.height);
    }

    public boolean clip(int x, int y, int width, int height) {
        boolean returnValue = performOperation(Operation.CLIP, x, y, width, height);

        // TODO: consolidate iterators. For this operation we probably
        // need to iterate over all rows (the top and bottom rows need
        // removing, and the middle rows need to be clipped).

        // drop rows above & below our clipped rect:
        Iterator<Map.Entry<Integer, NumberLineMask<Integer>>> iter = rows.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, NumberLineMask<Integer>> entry = iter.next();
            if (entry.getKey() == y)
                break;
            iter.remove();
            returnValue = true;
        }

        iter = rows.descendingMap().entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, NumberLineMask<Integer>> entry = iter.next();
            if (entry.getKey() < y + height)
                break;
            iter.remove();
            returnValue = true;
        }

        rows.put(y + height, new NumberLineMask.Integer());

        return returnValue;
    }

    private boolean performOperation(Operation op, int x, int y, int width, int height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", height = "+height);
        if (width == 0 || height == 0)
            return false;

        ensureRow(y);
        ensureRow(y + height);

        boolean returnValue = false;
        for(Map.Entry<Integer, NumberLineMask<Integer>> entry : rows.tailMap(y).entrySet()) {
            if (entry.getKey() == y + height)
                break;
            if (op.execute(entry.getValue(), x, x + width))
                returnValue = true;
        }

        collapseRows(y - 1, y + height + 1);
        return returnValue;
    }

    private void collapseRows(int y1, int y2) {
        Integer floorKey = rows.floorKey(y1);
        Iterator<Map.Entry<Integer, NumberLineMask<Integer>>> iter;
        if (floorKey == null) {
            iter = rows.entrySet().iterator();
        } else {
            iter = rows.tailMap(floorKey).entrySet().iterator();
        }
        Map.Entry<Integer, NumberLineMask<Integer>> entry = iter.hasNext() ? iter.next() : null;
        NumberLineMask<Integer> lastRowMask = entry == null ? null : entry.getValue();

        while (iter.hasNext() && lastRowMask != null && lastRowMask.isEmpty()) {
            iter.remove();
            entry = iter.hasNext() ? iter.next() : null;
            lastRowMask = entry == null ? null : entry.getValue();
        }

        while (iter.hasNext()) {
            entry = iter.next();
            NumberLineMask<Integer> currentRowMask = entry.getValue();
            if (currentRowMask.equals(lastRowMask)) {
                iter.remove();
            }
            lastRowMask = currentRowMask;
        }
    }

    @Override
    public Rectangle getBounds() {
        if (rows.isEmpty() || (rows.size()==1 && rows.entrySet().iterator().next().getValue().isEmpty()) ) {
            return new Rectangle(0,0,0,0);
        }

        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        boolean started = false;
        for(Map.Entry<Integer, NumberLineMask<Integer>> rowEntry : rows.entrySet()) {
            NumberLineMask<Integer> row = rowEntry.getValue();
            if (!started) {
                started = true;
                y1 = rowEntry.getKey().intValue();
                x1 = row.getMin();
                x2 = row.getMax();
            }
            if (!row.isEmpty()) {
                x1 = Math.min(x1, rowEntry.getValue().getMin());
                x2 = Math.max(x2, rowEntry.getValue().getMax());
            }
            y2 = rowEntry.getKey().intValue();
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

        Map.Entry<Integer, NumberLineMask<Integer>> floorRow = rows.floorEntry(yi);
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
        int x1 = (int) (Math.floor(x) + .5);
        int y1 = (int) (Math.floor(y) + .5);
        int x2 = (int) (Math.ceil(x + w) + .5);
        int y2 = (int) (Math.ceil(y + h) + .5);
        return intersects(x1, y1, x2 - x1, y2 - y1);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        int x1 = (int) (Math.floor(x) + .5);
        int y1 = (int) (Math.floor(y) + .5);
        int x2 = (int) (Math.ceil(x + w) + .5);
        int y2 = (int) (Math.ceil(y + h) + .5);
        return contains(x1, y1, x2 - x1, y2 - y1);
    }

    public boolean contains(int x, int y, int width,int height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Integer floorKey = rows.floorKey(y);
        if (floorKey == null)
            return false;
        Iterator<Map.Entry<Integer, NumberLineMask<Integer>>> iter = rows.tailMap(floorKey, true).entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, NumberLineMask<Integer>> entry = iter.next();
            if (entry.getKey().compareTo(y + height) >= 0)
                return true;

            if (!entry.getValue().contains(x, x + width)) {
                return false;
            }
        }
        return true;
    }

    public boolean intersects(int x, int y, int width,int height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Integer floorKey = rows.floorKey(y);
        Iterator<Map.Entry<Integer, NumberLineMask<Integer>>> iter = floorKey == null ?
                rows.entrySet().iterator() :
                rows.tailMap(floorKey, true).entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Integer, NumberLineMask<Integer>> entry = iter.next();
            if (entry.getKey().compareTo(y + height) >= 0)
                return false;

            if (entry.getValue().intersects(x, x + width)) {
                return true;
            }
        }
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

    public boolean isEmpty() {
        return rows.isEmpty() || rows.firstEntry().getValue().isEmpty();
    }

    /**
     * Return a Rectangle representing this shape, or null if this shape cannot be accurately represented
     * as a Rectangle.
     */
    protected Rectangle toRectangle() {
        int x1, y1, x2, y2;
        Iterator<Map.Entry<Integer, NumberLineMask<Integer>>> iter = rows.entrySet().iterator();
        if (!iter.hasNext())
            return null;
        Map.Entry<Integer, NumberLineMask<Integer>> firstEntry = iter.next();

        y1 = firstEntry.getKey().intValue();
        x1 = firstEntry.getValue().getMin();
        x2 = firstEntry.getValue().getMax();

        if (!iter.hasNext())
            return null;

        Map.Entry<Integer, NumberLineMask<Integer>> secondEntry = iter.next();
        if (!secondEntry.getValue().isEmpty())
            return null;
        y2 = secondEntry.getKey().intValue();

        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    /**
     * If this returns true then this RectangleMask is graphically equivalent to {@link #getBounds2D()}.
     */
    public boolean isRectangle() {
        return toRectangle() != null;
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(int x, int y, int width, int height) {
        return isEqual(new Rectangle(x, y, width, height));
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(Rectangle r) {
        return r.equals(toRectangle());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleMask rMask = (RectangleMask) o;
        return Objects.equals(rows, rMask.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows);
    }
}