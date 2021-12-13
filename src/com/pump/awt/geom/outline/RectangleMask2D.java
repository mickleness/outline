package com.pump.awt.geom.outline;

import java.awt.geom.Rectangle2D;

/**
 * This is a composition of double-based java.awt.geom.Rectangle2D.Doubles.
 */
public class RectangleMask2D extends AbstractRectangleMask<Double, Rectangle2D.Double> {

    protected RectangleMask2D() {
        super(0.0);
    }

    public RectangleMask2D(Rectangle2D r) {
        this(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public RectangleMask2D(double x, double y, double width, double height) {
        this();
        add(x, y, width, height);
    }

    @Override
    protected Double add(Double n1, Double n2) {
        return n1 + n2;
    }

    @Override
    public boolean add(Rectangle2D.Double r) {
        return add(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean subtract(Rectangle2D.Double r) {
        return subtract(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean clip(Rectangle2D.Double r) {
        return clip(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    protected Rectangle2D.Double createBounds(Double x1, Double y1, Double x2, Double y2) {
        return new Rectangle2D.Double(x1, y1, x2 - x1, y2 - y1);
    }

    @Override
    protected Rectangle2D.Double createEmptyBounds() {
        return new Rectangle2D.Double(0,0,0,0);
    }

    @Override
    public boolean contains(double x, double y) {
        return super.contains( (Double) x, (Double) y);
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return super.intersects( (Double) x, (Double) y, (Double) w, (Double) h);
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return super.contains( (Double) x, (Double) y, (Double) w, (Double) h);
    }
}
