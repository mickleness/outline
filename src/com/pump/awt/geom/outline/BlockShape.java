package com.pump.awt.geom.outline;

import com.pump.math.NumberLineMask;
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
public class BlockShape implements Shape {

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

    public BlockShape() {
        rows.put(0, new NumberLineMask());
    }

    public void add(int x, int y, int width, int height) {
        Rectangle r = new Rectangle(x, y, width, height);
        add(r);
    }

    private void ensureRow(int y) {
        Map.Entry<Integer, NumberLineMask<Integer>> nearestRow = rows.floorEntry(y);
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

        for(Map.Entry<Integer, NumberLineMask<Integer>> entry : rows.tailMap(r.y).entrySet()) {
            if (entry.getKey() == r.y + r.height)
                break;
            entry.getValue().add(r.x, r.x + r.width);
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