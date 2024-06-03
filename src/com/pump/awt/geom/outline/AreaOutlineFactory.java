package com.pump.awt.geom.outline;

import java.awt.*;

/**
 * This OutlineFactory creates an {@link AreaOutline}
 */
public class AreaOutlineFactory extends OutlineFactory<AreaOutline> {

    @Override
    public AreaOutline create(Shape shape) {
        // calling super.create(shape) should be twice as expensive as this implementation:
        return new AreaOutline(shape);
    }

    @Override
    public AreaOutline create() {
        return new AreaOutline();
    }

    @Override
    public int hashCode() {
        return 12512509;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == getClass();
    }
}
