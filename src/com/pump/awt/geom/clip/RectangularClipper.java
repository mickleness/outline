package com.pump.awt.geom.clip;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;

public interface RectangularClipper {
    public Shape clip(Shape shape, AffineTransform tx, Rectangle2D clip);
}
