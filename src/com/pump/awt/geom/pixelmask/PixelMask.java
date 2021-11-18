package com.pump.awt.geom.pixelmask;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class PixelMask implements Shape {

    static class Row {
        protected final TreeMap<Integer, Boolean> xMasks = new TreeMap<>();

        public Row() {

        }

        public Row(int x1, int x2) {
            addRun(x1, x2);
        }

        public void addRun(int x1, int x2) {
            Map.Entry<Integer, Boolean> x1e = xMasks.floorEntry(x1);
            Map.Entry<Integer, Boolean> x2e = xMasks.floorEntry(x2);
            if (x1e == null && x2e == null) {
                xMasks.put(x1, Boolean.TRUE);
                xMasks.put(x2, Boolean.FALSE);
                return;
            } else if(x1e.getKey() == x2e.getKey() && x1e.getKey().intValue() < x1) {
                // we're adding to the right of existing data
                xMasks.put(x1, Boolean.TRUE);
                xMasks.put(x2, Boolean.FALSE);
                return;
            } else if(x2e.getKey().intValue() >= x1) {
                Iterator<Map.Entry<Integer, Boolean>> iter = xMasks.tailMap(x2e.getKey()).entrySet().iterator();
                Boolean lastRemovedValue = null;
                Boolean firstRemovedValue = null;
                while (iter.hasNext()) {
                    Map.Entry<Integer, Boolean> entry = iter.next();
                    if (entry.getKey().intValue() < x2) {
                        lastRemovedValue = entry.getValue();
                        if (firstRemovedValue == null)
                            firstRemovedValue = entry.getValue();
                        iter.remove();
                    }
                }
                if (Boolean.FALSE.equals(lastRemovedValue))
                    xMasks.put(x2, Boolean.FALSE);
                if (Boolean.TRUE.equals(firstRemovedValue))
                    xMasks.put(x1, Boolean.FALSE);
                return;
            }


            throw new IllegalStateException();
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

    protected final TreeMap<Integer, Row> rows = new TreeMap<>();

    public void add(int x, int y, int width, int height) {
        Rectangle r = new Rectangle(x, y, width, height);
        add(r);
    }

    public void add(Rectangle r) {
        if (r.width < 0 || r.height < 0)
            throw new IllegalArgumentException(r.toString());
        if (r.width == 0 || r.height == 0)
            return;

        Map.Entry<Integer, Row> y1e = rows.floorEntry(r.y);
        Map.Entry<Integer, Row> y2e = rows.floorEntry(r.y + r.height);

        if (y1e == null && y2e == null) {
            // we're inserting something far above all existing data
            rows.put(r.y, new Row(r.x, r.x + r.width));
            rows.put(r.y + r.height, new Row());
            return;
        } else if (y1e == null && y2e != null && y2e.getKey().intValue() == r.y + r.height) {
            // we're inserting something just above all existing data
            rows.put(r.y, new Row(r.x, r.x + r.width));
            return;
        } else if (y1e.getKey() == y2e.getKey() &&
                y1e.getKey() <= r.y &&
                y1e.getValue().xMasks.isEmpty()) {
            // we're inserting something below existing data
            rows.put(r.y, new Row(r.x, r.x + r.width));
            rows.put(r.y + r.height, new Row());
            return;
        } else if(y1e.getKey().intValue() == r.y &&
                y2e.getKey().intValue() == r.y + r.height) {
            // we have an existing upper and lower Row, so just add the run to all Rows
            // between those two
            for(Map.Entry<Integer, Row> entry : rows.tailMap(y1e.getKey()).entrySet()) {
                if (entry.getKey().intValue() == r.y + r.height)
                    break;
                entry.getValue().addRun(r.x, r.x + r.width);
            }
            return;
        }

        throw new IllegalStateException();
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
        for(Map.Entry<Integer, Row> rowEntry : rows.entrySet()) {
            Row row = rowEntry.getValue();
            if (empty) {
                empty = false;
                y1 = rowEntry.getKey().intValue();
                x1 = row.xMasks.firstKey().intValue();
                x2 = row.xMasks.lastKey().intValue() - 1;
            }
            if (!row.xMasks.isEmpty()) {
                x1 = Math.min(x1, rowEntry.getValue().xMasks.firstKey().intValue());
                x2 = Math.min(x2, rowEntry.getValue().xMasks.lastKey().intValue() - 1);
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

        Map.Entry<Integer, Row> floorRow = rows.floorEntry(yi);
        if (floorRow == null)
            return false;
        Map.Entry<Integer, Boolean> mask = floorRow.getValue().xMasks.floorEntry(xi);
        if (mask == null)
            return false;

        return mask.getValue() == true;
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