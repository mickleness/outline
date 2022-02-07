package com.pump.awt.geom.clip;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

/**
 * This RectangularClipper uses {@link Area#intersect(Area)}.
 * <p>
 * In general the {@link DefaultRectangularClipper} is preferred. This class is used
 * for testing/comparison, and you may want to switch to it if that class shows
 * unexpected bugs in production. (See {@link RectangularClipperFactory#set(RectangularClipperFactory).
 * </p>
 */
public class AreaRectangularClipper implements RectangularClipper {
    @Override
    public Shape clip(Shape shape, AffineTransform tx, Rectangle2D clip) {
        if (tx != null && !tx.isIdentity()) {
            shape = tx.createTransformedShape(shape);
        }
        Area area = new Area(shape);
        area.intersect(new Area(clip));
        return area;
    }
}
