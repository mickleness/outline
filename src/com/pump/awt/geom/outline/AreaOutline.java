package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.Area;

/**
 * This is an Area implementation of the Outline interface.
 */
public class AreaOutline extends Area implements Outline {

    public AreaOutline(Shape shape) {
        super(shape);
    }

    public AreaOutline() {
        super();
    }

    @Override
    public void add(Shape shape) {
        super.add(new AreaOutline(shape));
    }

    @Override
    public void subtract(Shape shape) {
        super.subtract(new AreaOutline(shape));
    }

    @Override
    public void clip(Shape shape) {
        intersect(new AreaOutline(shape));
    }

    @Override
    public void exclusiveOr(Shape shape) {
        super.exclusiveOr(new AreaOutline(shape));
    }

    @Override
    public void clear() {
        reset();
    }
}
