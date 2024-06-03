package com.pump.awt.geom.outline;

import com.pump.awt.geom.RectangularTransform;
import com.pump.awt.geom.mask.RectangleMask2D;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serial;

public class RectangleMaskOutline implements Outline {

    @Serial
    private static final long serialVersionUID = 1L;

    private int resolution;
    private RectangularTransform scaleUp, scaleDown;

    RectangleMask2D highResMask = new RectangleMask2D();

    /**
     * Create a new RectangleMaskOutline.
     *
     * @param resolution the resolution to render shapes with. For example if the resolution is
     *                   2 then this mask will break up each 1x1 rectangle into 4 subrectangles.
     *                   A resolution of 1 will produce an aliased outline. A resolution of 2 will
     *                   appear antialiased on a normal monitor. A resolution of 3 or 4 will appear
     *                   antialiased on a high-res (200%) monitor.
     */
    public RectangleMaskOutline(int resolution) {
        if (resolution < 1)
            throw new IllegalArgumentException("resolution must be greater than zero");
        this.resolution = resolution;
        initialize();
    }

    private void initialize() {
        scaleUp = RectangularTransform.getScaleInstance(resolution);
        scaleDown = RectangularTransform.getScaleInstance(1.0/resolution);
    }

    @Override
    public void add(Shape shape) {
        highResMask.add(new RectangleMask2D(shape, scaleUp.createAffineTransform(), resolution));
    }

    @Override
    public void subtract(Shape shape) {
        highResMask.subtract(new RectangleMask2D(shape, scaleUp.createAffineTransform(), resolution));
    }

    @Override
    public void clip(Shape shape) {
        highResMask.clip(new RectangleMask2D(shape, scaleUp.createAffineTransform(), resolution));
    }

    @Override
    public void exclusiveOr(Shape shape) {
        highResMask.xor(new RectangleMask2D(shape, scaleUp.createAffineTransform(), resolution));
    }

    @Override
    public void transform(AffineTransform transform) {
        RectangularTransform rt = RectangularTransform.get(transform);
        if (rt != null) {
            highResMask.transform(rt);
        } else {
            Shape shape = transform.createTransformedShape(this);
            highResMask.clear();
            add(shape);
        }
    }

    @Override
    public boolean isEmpty() {
        return highResMask.isEmpty();
    }

    @Override
    public void clear() {
        highResMask.clear();
    }

    @Override
    public Rectangle getBounds() {
        return getBounds2D().getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        Rectangle2D r = highResMask.getBounds2D();
        return scaleDown.transform(r);
    }

    @Override
    public boolean contains(double x, double y) {
        return contains(new Point2D.Double(x,y));
    }

    @Override
    public boolean contains(Point2D p) {
        return highResMask.contains(scaleUp.transform(p));
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return intersects(new Rectangle2D.Double(x,y,w,h));
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return highResMask.intersects(scaleUp.transform(r));
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return contains(new Rectangle2D.Double(x,y,w,h));
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return highResMask.contains(scaleUp.transform(r));
    }

    @Override
    public PathIterator getPathIterator(AffineTransform tx) {
        // TODO: test this and other getPathIterator() method:
        // when you pass in a transform, are we concatenating in the correct order here?
        if (tx == null)
            tx = new AffineTransform();
        tx = new AffineTransform(tx);
        tx.concatenate(scaleDown.createAffineTransform());
        return highResMask.getPathIterator(tx);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform tx, double flatness) {
        if (tx == null)
            tx = new AffineTransform();
        tx = new AffineTransform(tx);
        tx.concatenate(scaleDown.createAffineTransform());
        return highResMask.getPathIterator(tx, flatness);
    }

    private void readObject(ObjectInputStream objIn) throws IOException, ClassNotFoundException {
        int internalVersion = objIn.readInt();
        if (internalVersion == 0) {
            resolution = objIn.readInt();
            initialize();
            highResMask = (RectangleMask2D) objIn.readObject();
        } else {
            throw new IOException("unsupported internal version: "+internalVersion);
        }
    }

    private void writeObject(ObjectOutputStream objOut) throws IOException {
        objOut.writeInt(resolution);
        objOut.writeObject(highResMask);
    }
}
