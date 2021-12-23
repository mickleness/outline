package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * This is a composition of int-based java.awt.Rectangles.
 */
public class RectangleMask extends AbstractRectangleMask<Integer, Rectangle> {

    public RectangleMask() {
        super(0);
    }

    public RectangleMask(Rectangle r) {
        this(r.x, r.y, r.width, r.height);
    }

    public RectangleMask(int x, int y, int width, int height) {
        super(0);
        add(x, y, width, height);
    }

    /**
     * @param shape the shape to create a mask of
     * @param tx the optional AffineTransform to apply to the shape
     * @param maxSegmentArea the maximum area (width * height) of each segment's bounds. The smaller this value
     *                       is the more each segment will be partitioned into subsegments. Finer details lead to
     *                       greater accuracy and a larger data structure.
     */
    public RectangleMask(Shape shape, AffineTransform tx, int maxSegmentArea) {
        super(0, shape, tx, maxSegmentArea);
    }

    @Override
    protected Integer add(Integer n1, Integer n2) {
        return n1 + n2;
    }

    @Override
    public boolean add(Rectangle r) {
        return add(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean subtract(Rectangle r) {
        return subtract(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean clip(Rectangle r) {
        return clip(r.x, r.y, r.width, r.height);
    }

    @Override
    protected Rectangle createRectangleFromGeneric(Integer x1, Integer y1, Integer x2, Integer y2) {
        return new Rectangle(x1, y1, x2 - x1, y2 - y1);
    }

    @Override
    protected Rectangle createEmptyBounds() {
        return new Rectangle(0,0,0,0);
    }

    @Override
    public boolean contains(double x, double y) {
        int xi = (int) (Math.round(x) + .5);
        int yi = (int) (Math.round(y) + .5);
        return super.contains( (Integer) xi, (Integer) yi);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        int x1 = (int) (Math.floor(x));
        int y1 = (int) (Math.floor(y));
        int x2 = (int) (Math.ceil(x + w));
        int y2 = (int) (Math.ceil(y + h));
        return super.intersects( (Integer) x1, (Integer) y1, (Integer)  (x2 - x1), (Integer)  (y2 - y1) );
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        int x1 = (int) (Math.floor(x));
        int y1 = (int) (Math.floor(y));
        int x2 = (int) (Math.ceil(x + w));
        int y2 = (int) (Math.ceil(y + h));
        return super.contains( (Integer) x1, (Integer) y1, (Integer) (x2 - x1), (Integer) (y2 - y1) );
    }

    @Override
    protected double midpoint(Integer v1, Integer v2) {
        return (v1.doubleValue() + v2.doubleValue())/2.0;
    }

    @Override
    protected Integer[] createRectangleFromDouble(double x1, double y1, double x2, double y2, boolean allowZeroDimension) {
        Rectangle r = new Rectangle2D.Double(x1, y1, x2 - x1, y2 - y1).getBounds();
        if (!allowZeroDimension) {
            r.width = Math.max(1, r.width);
            r.height = Math.max(1, r.height);
        }
        return new Integer[] {r.x, r.y, r.width, r.height};
    }

    @Override
    protected RectangleMask createMask() {
        return new RectangleMask();
    }
}