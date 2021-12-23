package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * This is a composition of double-based java.awt.geom.Rectangle2D.Doubles.
 */
public class RectangleMask2D extends AbstractRectangleMask<Double, Rectangle2D.Double> {

    public RectangleMask2D() {
        super(0.0);
    }

    /**
     * @param shape the shape to create a mask of
     * @param tx the optional AffineTransform to apply to the shape
     * @param maxSegmentArea the maximum area (width * height) of each segment's bounds. The smaller this value
     *                       is the more each segment will be partitioned into subsegments. Finer details lead to
     *                       greater accuracy and a larger data structure.
     */
    public RectangleMask2D(Shape shape, AffineTransform tx, double maxSegmentArea) {
        super(0.0, shape, tx, maxSegmentArea);
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
    protected Rectangle2D.Double createRectangleFromGeneric(Double x1, Double y1, Double x2, Double y2) {
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

    @Override
    protected double midpoint(Double v1, Double v2) {
        return (v1.doubleValue() + v2.doubleValue() )/2.0;
    }

    @Override
    protected Rectangle2D.Double createRectangleFromDouble(double x1, double y1, double x2, double y2, boolean allowZeroDimension) {
        double w, h;
        if (allowZeroDimension) {
            w = x2 - x1;
            h = y2 - y1;
        } else {
            w = Math.max(x2 - x1, .0000000001);
            h = Math.max(y2 - y1, .0000000001);
        }
        return new Rectangle2D.Double(x1, y1, w, h);
    }

    @Override
    protected RectangleMask2D createMask() {
        return new RectangleMask2D();
    }
}
