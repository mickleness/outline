package com.pump.awt.geom.clip;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

/**
 * This clips an arbitrary shape to a Rectangle2D.
 */
public interface RectangularClipper {
    /**
     * Clip an arbitrary shape to a Rectangle2D.
     * <p>
     * This may return the original shape argument if it is completely inside the
     * clip bounds.
     * </p>
     *
     * @param shape the shape to clip.
     * @param tx the optional transform to apply to the shape; this may be null.
     * @param clip the clip rect to clip the shape to.
     * @return the clipped shape.
     */
    public Shape clip(Shape shape, AffineTransform tx, Rectangle2D clip);
}
