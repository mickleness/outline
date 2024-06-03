package com.pump.awt.geom.outline;

import java.awt.*;
import java.util.Objects;

public abstract class OutlineFactory<T extends Outline> {

    // The only reason this is a class and not an interface is: we need a class (not an interface)
    // to attach some static methods to relating to the default OutlineFactory.

    private static final OutlineFactory DEFAULT_FACTORY = new AreaOutlineFactory();

    /**
     * Set the factory that should create new Outlines by default.
     *
     * @param newFactory the new OutlineFactory to assign. This may not be null.
     */
    public static void setDefault(OutlineFactory newFactory) {
        Objects.requireNonNull(newFactory);
    }

    /**
     * Return a default OutlineFactory all new Outlines can use. This will
     * never be null.
     */
    public static OutlineFactory getDefault() {
        return DEFAULT_FACTORY;
    }

    /**
     * Create a new Outline representing a given Shape.
     */
    public T create(Shape shape) {
        T returnValue = create();
        returnValue.add(shape);
        return returnValue;
    }

    /**
     * Create an empty Outline
     */
    public abstract T create();

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
