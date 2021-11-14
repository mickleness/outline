package com.pump.awt.geom.outline;

import java.awt.*;
import java.util.Objects;

public class OutlineOperation {

    public enum Type {
        ADD, SUBTRACT, INTERSECT, XOR
    }

    private final Type type;
    private final Shape shape;

    public OutlineOperation(Type type, Shape shape) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(shape);
        this.type = type;
        this.shape = shape;
    }

    public Type getType() {
        return type;
    }

    public Shape getShape() {
        return shape;
    }
}
