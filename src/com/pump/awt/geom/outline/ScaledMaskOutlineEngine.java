package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.mask.RectangleMask;

import java.awt.*;
import java.awt.geom.*;
import java.util.List;

/**
 * This uses RectangleMasks to perform operations. This basically sets up a shape that acts like a pixel-based
 * representation of a shape.
 * <p>
 * You can define a <code>resolution</code> for this engine, which is analogous to the resolution of your
 * monitor. A value of one with give you clear aliased edges. A value of two (two pixels in each dimension)
 * packs four subpixels in one pixel, which will look good on a normal (not high-resolution) monitor. A value
 * of four will look high quality even on a high-resolution monitor.
 * </p>
 */
public class ScaledMaskOutlineEngine implements OutlineEngine {

    private final double resolution;
    private final AffineTransform scaleUp, scaleDown;

    /**
     * The number of
     */
    public ScaledMaskOutlineEngine(int resolution) {
        if (resolution < 1)
            throw new IllegalArgumentException("resolution must be greater than zero");
        this.resolution = resolution;
        scaleUp = AffineTransform.getScaleInstance(resolution, resolution);
        scaleDown = AffineTransform.getScaleInstance(1.0 / resolution, 1.0 / resolution);
    }

    @Override
    public Shape calculate(List<OutlineOperation> operations) {
        RectangleMask returnValue = new RectangleMask();
        for(OutlineOperation op : operations) {
            RectangleMask operand;
            Shape shape = op.shape;
            if (shape instanceof ScaledShape) {
                ScaledShape ss = (ScaledShape) shape;
                if (ss.getScale() == 1.0 / resolution)
                    shape = ((ScaledShape)shape).getShape();
            }
            if (shape instanceof RectangleMask) {
                operand = (RectangleMask) shape;
            } else {
                operand = new RectangleMask(op.shape, scaleUp, 1);
            }

            switch (op.type) {
                case ADD:
                    returnValue.add(operand);
                    break;
                case SUBTRACT:
                    returnValue.subtract(operand);
                    break;
                case INTERSECT:
                    returnValue.clip(operand);
                    break;
                case XOR:
                    returnValue.xor(operand);
                    break;
            }
        }
//        return scaleDown.createTransformedShape(returnValue);
        return new ScaledShape(returnValue, 1.0 / resolution);
    }

    @Override
    public OutlineOperation createOperation(OutlineOperation.Type type, Shape shape) {
        return new OutlineOperation(type, shape);
    }

    @Override
    public String toString() {
        String str = getClass().getSimpleName();
        if (resolution == 1)
            return str;
        return str + "[ resolution = "+resolution+"]";
    }

    static class ScaledShape implements Shape {

        protected final Shape delegate;
        protected final double scale;

        public ScaledShape(Shape shape, double scale) {
            this.delegate = shape;
            this.scale = scale;
        }

        @Override
        public Rectangle getBounds() {
            return getBounds2D().getBounds();
        }

        @Override
        public Rectangle2D getBounds2D() {
            return ShapeUtils.getBounds2D(delegate.getPathIterator(AffineTransform.getScaleInstance(scale, scale)));
        }

        @Override
        public boolean contains(double x, double y) {
            return delegate.contains(x / scale, y / scale);
        }

        @Override
        public boolean contains(Point2D p) {
            return contains(p.getX(), p.getY());
        }

        @Override
        public boolean intersects(double x, double y, double w, double h) {
            return delegate.intersects(x / scale, y / scale, w / scale, h / scale);
        }

        @Override
        public boolean intersects(Rectangle2D r) {
            return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
        }

        @Override
        public boolean contains(double x, double y, double w, double h) {
            return delegate.contains(x / scale, y / scale, w / scale, h / scale);
        }

        @Override
        public boolean contains(Rectangle2D r) {
            return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at) {
            if (at == null)
                at = new AffineTransform();
            at.concatenate(AffineTransform.getScaleInstance(scale, scale));
            return delegate.getPathIterator(at);
        }

        @Override
        public PathIterator getPathIterator(AffineTransform at, double flatness) {
            if (at == null)
                at = new AffineTransform();
            at.concatenate(AffineTransform.getScaleInstance(scale, scale));
            return delegate.getPathIterator(at, flatness);
        }

        public Shape getShape() {
            return delegate;
        }

        public double getScale() {
            return scale;
        }
    }
}
