package com.pump.awt.geom.clip;

import com.pump.awt.geom.ShapeUtils;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * This abstract RectangularClipper optimizes specific cases involving clipping a rectangle.
 * <p>
 * For example: if you start with a java.awt.geom.Path2D that happens to be a rectangle
 * (but isn't a Rectangle2D), and if the transform is a simple translation/scaling transform,
 * then this object uses {@link Rectangle2D#intersect(Rectangle2D, Rectangle2D, Rectangle2D)}
 * to return the appropriate rectangle.
 * </p>
 * <p>
 * This should offer both a performance boost (because clipping a rectangle with another rectangle
 * is trivially easy) and it may benefit callers who may have optimized behaviors if the returned
 * value is a Rectangle or Rectangle2D.
 * </p>
 * <p>
 * Subclasses are still responsible clipping an arbitrary shape to a rectangle.
 * </p>
 */
public abstract class AbstractRectangularClipper implements RectangularClipper {

    @Override
    public Shape clip(Shape shape, AffineTransform tx, Rectangle2D clip) {
        Rectangle2D clipAsRect = clipAsRect(shape, tx, clip);
        if (clipAsRect != null)
            return clipAsRect;
        return clipAsShape(shape, tx, clip);
    }

    /**
     * Clip a shape to an arbitrary Rectangle2D.
     */
    protected abstract Shape clipAsShape(Shape shape, AffineTransform tx, Rectangle2D clip);

    /**
     * Return a Rectangle2D that expresses the clipped shape, or null if this method failed.
     * This method helps both performance (because Rectangle2D's are easier to intersect
     * against) and the return type (because some callers may have optimized behavior
     * if they get back a Rectangle or Rectangle2D).
     */
    protected Rectangle2D clipAsRect(Shape shape, AffineTransform tx, Rectangle2D clip) {
        // can we express the shape as a Rectangle? (most specific / most preferred)
        Rectangle shapeAsRect = null;

        // can we express the shape as a Rectangle2D (still helpful)
        Rectangle2D shapeAsRect2D = null;

        if (tx != null && tx.isIdentity())
            tx = null;

        if (shape instanceof Rectangle && tx == null) {
            shapeAsRect = (Rectangle) shape;
            shapeAsRect2D = (Rectangle) shape;
        } else if (shape instanceof Rectangle2D && tx == null) {
            shapeAsRect2D = (Rectangle2D) shape;

            // ShapeUtils#toRectangle2D will return a java.awt.Rectangle if possible:
            Rectangle2D t = ShapeUtils.toRectangle2D(shapeAsRect2D);
            shapeAsRect = t instanceof Rectangle ? (Rectangle) t : null;
        } else {
            shapeAsRect2D = ShapeUtils.toRectangle2D(shape.getPathIterator(tx));
            shapeAsRect = shapeAsRect2D instanceof Rectangle ? (Rectangle) shapeAsRect2D : null;

            tx = null;
        }

        if (shapeAsRect2D == null)
            return null;

        if (shapeAsRect != null && clip instanceof Rectangle) {
            Rectangle returnValue = new Rectangle();
            Rectangle2D.intersect(shapeAsRect, clip, returnValue);
            return returnValue;
        } else if (shapeAsRect2D != null) {
            Rectangle2D returnValue = new Rectangle2D.Double();
            Rectangle2D.intersect(shapeAsRect2D, clip, returnValue);
            return returnValue;
        }

        return null;
    }
}
