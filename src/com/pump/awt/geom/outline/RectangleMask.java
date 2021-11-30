package com.pump.awt.geom.outline;

import java.awt.*;

/**
 * This is a composition of int-based java.awt.Rectangles.
 */
public class RectangleMask extends AbstractRectangleMask<Integer, Rectangle> {

    protected RectangleMask() {
        super(0);
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
    protected Rectangle createBounds(Integer x1, Integer y1, Integer x2, Integer y2) {
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
}