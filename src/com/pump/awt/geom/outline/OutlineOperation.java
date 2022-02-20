package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * This represents an operation (add/subtract/etc) that alters a <code>java.awt.Shape</code>.
 * <p>
 * The {@link Outline} object collects these operations and the
 * {@link OutlineEngine} processes them.
 * </p>
 * <p>
 * This object has three fields, but one of them is always null. If the type is TRANSFORM
 * then the {@link #transform} field is non-null and the {@link #shape} field is null.
 * Otherwise the {@link #shape} field is non-null and the {@link #transform} field
 * is null.
 * </p>
 * <p>
 * This architecture assumes the shape and transform operands aren't going to change over time,
 * but that isn't enforced.
 * </p>
 */
public final class OutlineOperation implements Serializable {

    public enum Type {
        /**
         * This operation originates from {@link Outline#add(Shape)}
         */
        ADD,

        /**
         * This operation originates from {@link Outline#subtract(Shape)}
         */
        SUBTRACT,

        /**
         * This operation originates from {@link Outline#clip(Shape)}
         */
        CLIP,

        /**
         * This operation originates from {@link Outline#exclusiveOr(Shape)}
         */
        EXCLUSIVE_OR,

        /**
         * This operation originates from {@link Outline#transform(AffineTransform)}
         */
        TRANSFORM
    }

    // I'm always reluctant to implement Serializable with the default
    // serialization before, but (I think?) in this case we HAVE to use
    // the default behavior if we want to preserve the 'final' keywords
    // for the three fields (type, shape, transform). I think keeping
    // those public and final is worth it.

    @Serial
    private static final long serialVersionUID = 1L;

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
