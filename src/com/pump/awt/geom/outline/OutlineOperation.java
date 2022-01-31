package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public final class OutlineOperation {

    public enum Type {
        ADD, SUBTRACT, INTERSECT, XOR, TRANSFORM
    }

    public final Type type;

    /**
     * This is non-null when type is ADD, SUBTRACT, INTERSECT or XOR
     */
    public final Shape shape;

    /**
     * This is only non-null when type is TRANSFORM
     */
    public final AffineTransform transform;

    public OutlineOperation(AffineTransform tx) {
        this.type = Type.TRANSFORM;
        this.shape = null;
        this.transform = new AffineTransform(tx);
    }

    public OutlineOperation(Type type, Shape shape) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(shape);
        this.type = type;
        this.shape = shape;
        this.transform = null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName()+"[ "+type);
        if (transform != null) {
            sb.append(" "+transform);
        }
        sb.append("]");
        return sb.toString();
    }
}
