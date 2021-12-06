package com.pump.awt.geom.outline;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class OutlineOperation {

    public enum Type {
        ADD(false), SUBTRACT(true), INTERSECT(true), XOR(false);

        /**
         * True if this operation is guaranteed to either be a null-op or to remove data. False if this operation may add data.
         */
        public final boolean isNegative;

        Type(boolean isNegative) {
            this.isNegative = isNegative;
        }
    }

    public final Type type;
    public final Shape shape;

    public OutlineOperation(Type type, Shape shape) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(shape);
        this.type = type;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "OutlineOperation["+type+"]";
    }
}
