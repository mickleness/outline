package com.pump.awt.geom;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

/**
 * This is a shape with an applied RectangularTransform.
 * <p>
 * The RectangularTransform can scale the rectangles and points used in
 * {@link Shape#intersects(Rectangle2D)} and {@link Shape#contains(Rectangle2D)}
 * methods on the fly.
 */
public class ScaledShape implements Shape, Serializable {
    private static final long serialVersionUID = 1L;

    private RectangularTransform transform;
    private Shape shape;

    public ScaledShape(Shape shape, RectangularTransform transform) {
        Objects.requireNonNull(shape);
        this.shape = shape;
        this.transform = transform == null ? new RectangularTransform() : transform.clone();
    }

    public Shape getUntransformedShape() {
        return shape;
    }

    public RectangularTransform getTransform() {
        return new RectangularTransform(transform);
    }

    @Override
    public Rectangle getBounds() {
        return getBounds2D().getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        return ShapeUtils.getBounds2D(shape.getPathIterator(transform.createAffineTransform()));
    }

    @Override
    public boolean contains(double x, double y) {
        Point2D p = new Point2D.Double(x, y);
        transform.transformInverse(p, p);
        return shape.contains(p);
    }

    @Override
    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        Rectangle2D r = new Rectangle2D.Double(x, y, w, h);
        transform.transformInverse(r, r);
        return shape.intersects(r);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        Rectangle2D r = new Rectangle2D.Double(x, y, w, h);
        transform.transformInverse(r, r);
        return shape.contains(r);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        AffineTransform transform = new AffineTransform();
        if (at != null)
            transform.concatenate(at);
        transform.concatenate(this.transform.createAffineTransform());
        return shape.getPathIterator(transform);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        AffineTransform transform = new AffineTransform();
        if (at != null)
            transform.concatenate(at);
        transform.concatenate(this.transform.createAffineTransform());
        return shape.getPathIterator(transform, flatness);
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws java.io.IOException
    {
        out.writeInt(0);
        out.writeObject(shape);
        out.writeObject(transform);
    }

    private void readObject(java.io.ObjectInputStream in)
            throws ClassNotFoundException, IOException
    {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            shape = (Shape) in.readObject();
            transform = (RectangularTransform) in.readObject();
        } else {
            throw new IOException("unsupported internal version: "+internalVersion);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScaledShape that = (ScaledShape) o;
        return Objects.equals(transform, that.transform) && Objects.equals(shape, that.shape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transform, shape);
    }

    @Override
    public String toString() {
        return "ScaledShape{" +
                "transform=" + transform +
                ", shape=" + shape +
                '}';
    }
}
