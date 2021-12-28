package com.pump.awt.geom;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.io.Serializable;
import java.util.Objects;

/**
 * This is a transform that only scales and translates. It is a subset of an
 * <code>AffineTransform</code>, except with no rotation/shearing.
 */
public class RectangularTransform implements Serializable {

    private static final long serialVersionUID = 1L;

    private static Rectangle2D transform(Rectangle2D src, Rectangle2D dst, double scaleX, double scaleY, double translateX, double translateY) {
        double newX = src.getX() * scaleX + translateX;
        double newY = src.getY() * scaleY + translateY;
        double newW = src.getWidth() * scaleX;
        double newH = src.getHeight() * scaleY;

        if (dst == null) {
            dst = (Rectangle2D) src.clone();
            dst.setFrame(newX, newY, newW, newH);

            if (dst.getX() == newX &&
                    dst.getY() == newY &&
                    dst.getWidth() == newW &&
                    dst.getHeight() == newH) {
                // if we started with a Rectangle and dst was null, can we return a new
                // Rectangle without losing any necessary precision?
                return dst;
            }

            dst = new Rectangle2D.Double();
        }
        dst.setFrame(newX, newY, newW, newH);

        return dst;
    }

    private static Point2D transform(Point2D src, Point2D dst, double scaleX, double scaleY, double translateX, double translateY) {
        double newX = src.getX() * scaleX + translateX;
        double newY = src.getY() * scaleY + translateY;

        if (dst == null) {
            dst = (Point2D) src.clone();
            dst.setLocation(newX, newY);

            if (dst.getX() == newX &&
                    dst.getY() == newY) {
                return dst;
            }

            dst = new Point2D.Double();
        }
        dst.setLocation(newX, newY);

        return dst;
    }

    private double translateX = 0;
    private double translateY = 0;
    private double scaleX = 1;
    private double scaleY = 1;

    /** Creates an identity transform. */
    public RectangularTransform() {
    }

    /**
     * Creates a <code>RectangularTransform</code> that transforms from one
     * rectangle to another.
     *
     * @param oldRect
     *            the initial rectangle.
     * @param newRect
     *            the final (transformed) rectangle.
     */
    public RectangularTransform(Rectangle2D oldRect, Rectangle2D newRect) {
        setTransform(oldRect, newRect);
    }

    /**
     * Creates a <code>RectangularTransform</code>.
     *
     * @param sx
     *            the scaleX factor
     * @param sy
     *            the scaleY factor
     * @param tx
     *            the x-translation
     * @param ty
     *            the y-translation
     */
    public RectangularTransform(double sx, double sy, double tx, double ty) {
        scaleX = sx;
        scaleY = sy;
        translateX = tx;
        translateY = ty;
    }

    /**
     * Create a copy of an existing transform.
     */
    public RectangularTransform(RectangularTransform transform) {
        setTransform(transform);
    }

    /**
     * Create a new RectangularTransform with a given x and y scale.
     */
    public static RectangularTransform getScaleInstance(double scale) {
        return getScaleInstance(scale, scale);
    }

    /**
     * Create a new RectangularTransform with a given x and y scale.
     */
    public static RectangularTransform getScaleInstance(double scaleX, double scaleY) {
        return new RectangularTransform(scaleX, scaleY, 0, 0);
    }

    /** Transforms the source argument. */
    public Rectangle2D transform(Rectangle2D src) {
        return transform(src, null, scaleX, scaleY, translateX, translateY);
    }

    /**
     * Transforms the source argument.
     *
     * @param src
     *            the initial rectangle.
     * @param dst
     *            the optional Rectangle2D to store the results in.
     *
     * @return the dst argument, or a new Rectangle2D if that argument was null.
     */
    public Rectangle2D transform(Rectangle2D src, Rectangle2D dst) {
        return transform(src, dst, scaleX, scaleY, translateX, translateY);
    }

    /**
     * Transforms the source argument.
     *
     * @param src
     *            the initial point.
     *
     * @return the transformed point
     */
    public Point2D transform(Point2D src) {
        return transform(src, null, scaleX, scaleY, translateX, translateY);
    }

    /**
     * Transforms the source argument.
     *
     * @param src
     *            the initial point.
     * @param dst
     *            the optional Point2D to store the results in.
     *
     * @return the dst argument, or a new Point2D if that argument was null.
     */
    public Point2D transform(Point2D src, Point2D dst) {
        return transform(src, dst, scaleX, scaleY, translateX, translateY);
    }

    /**
     * Defines this transform.
     *
     * @param oldRect
     *            the initial rect.
     * @param newRect
     *            what this transform should turn the initial rectangle into.
     */
    public void setTransform(Rectangle2D oldRect, Rectangle2D newRect) {
        scaleX = newRect.getWidth() / oldRect.getWidth();
        scaleY = newRect.getHeight() / oldRect.getHeight();

        translateX = -oldRect.getX() * scaleX + newRect.getX();
        translateY = -oldRect.getY() * scaleY + newRect.getY();
    }

    /**
     * Define this transform.
     *
     * @param transform the transform to copy the translate and scale attributes from.
     */
    public void setTransform(RectangularTransform transform) {
        scaleX = transform.scaleX;
        scaleY = transform.scaleY;

        translateX = transform.translateX;
        translateY = transform.translateY;
    }

    /**
     * Translates this transform.
     *
     * @param tx
     *            the x-translation.
     * @param ty
     *            the y-translation.
     */
    public void translate(double tx, double ty) {
        translateX = tx * scaleX + translateX;
        translateY = ty * scaleY + translateY;
    }

    public double getScaleX() {
        return scaleX;
    }

    public double getScaleY() {
        return scaleY;
    }

    public double getTranslateX() {
        return translateX;
    }

    public double getTranslateY() {
        return translateY;
    }

    /**
     * Scales this transform.
     *
     * @param sx
     *            the factor to scale X-values by.
     * @param sy
     *            the factor to scale Y-values by.
     */
    public void scale(double sx, double sy) {
        scaleX = scaleX * sx;
        scaleY = scaleY * sy;
    }

    /**
     * Converts this to an <code>AffineTransform</code>.
     */
    public AffineTransform createAffineTransform() {
        return new AffineTransform(scaleX, 0, 0, scaleY, translateX, translateY);
    }

    /**
     * Creates a transform that is the inverse of this one.
     */
    public RectangularTransform createInverse() {
        return new RectangularTransform(1.0 / scaleX, 1.0 / scaleY, -translateX
                / scaleX, -translateY / scaleY);
    }

    public Point2D transformInverse(Point2D src, Point2D dst) {
        return transform(src, dst, 1.0 / scaleX, 1.0 / scaleY, -translateX / scaleX, -translateY / scaleY);
    }

    public Rectangle2D transformInverse(Rectangle2D src, Rectangle2D dst) {
        return transform(src, dst, 1.0 / scaleX, 1.0 / scaleY, -translateX / scaleX, -translateY / scaleY);
    }

    @Override
    public RectangularTransform clone() {
        return new RectangularTransform(this);
    }

    private void writeObject(java.io.ObjectOutputStream out)
            throws java.io.IOException
    {
        out.writeInt(0);
        out.writeDouble(scaleX);
        out.writeDouble(scaleY);
        out.writeDouble(translateX);
        out.writeDouble(translateY);
    }

    private void readObject(java.io.ObjectInputStream in)
            throws ClassNotFoundException, IOException
    {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            scaleX = in.readDouble();
            scaleY = in.readDouble();
            translateX = in.readDouble();
            translateY = in.readDouble();
        } else {
            throw new IOException("unsupported internal version: "+internalVersion);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangularTransform that = (RectangularTransform) o;
        return that.translateX == translateX &&
                that.translateY == translateY &&
                that.scaleX == scaleX &&
                that.scaleY == scaleY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(translateX, translateY, scaleX, scaleY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RectangularTransform[");
        if (scaleX == scaleY) {
            if (scaleX == 1) {
                // don't mention it
            } else {
                sb.append(" scale = "+scaleX);
            }
        } else {
            if (scaleX != 1) {
                sb.append(" scaleX = "+scaleX);
            }
            if (scaleY != 1) {
                sb.append(" scaleY = "+scaleY);
            }
        }
        if (translateX != 0) {
            sb.append(" translateX = "+translateX);
        }
        if (translateY != 0) {
            sb.append(" translateY = "+translateX);
        }
        sb.append("]");
        return sb.toString();
    }
}