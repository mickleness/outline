package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.Map;

public interface Outline extends Shape {

    void add(Shape shape);
    void subtract(Shape shape);

    /**
     * Clip this shape to another shape. This function is identical to
     * {@link java.awt.geom.Area#intersect(Area)}, but the name is changed
     * to help differentiate this function from the similar-sounding
     * {@link java.awt.Shape#intersects(Rectangle2D)} methods.
     */
    void clip(Shape shape);

    void exclusiveOr(Shape shape);
    void transform(AffineTransform transform);
    boolean isEmpty();
    void clear();

    /**
     * This calls {@link #clear()}. The `clear` method name is preferred because it
     * matches the naming conventions in {@link List#clear()} and {@link Map#clear()},
     * but the name `reset` is used in {@link Area#reset()} so it's preserved here for
     * legacy similarity.
     */
    default void reset() {
        clear();
    }

    default void execute(List<OutlineOperation> opsToProcess) {
        for (OutlineOperation operation : opsToProcess) {
            operation.execute(this);
        }
    }
}
