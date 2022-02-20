package com.pump.awt.geom.clip;

/**
 * This creates a {@link RectangularClipper}.
 */
public class RectangularClipperFactory {
    private static RectangularClipperFactory globalInstance;

    static {
        set(null);
    }

    /**
     * Return the current default clipper factory.
     */
    public static RectangularClipperFactory get() {
        return globalInstance;
    }

    /**
     * Set the current default clipper factory.
     */
    public static void set(RectangularClipperFactory factory) {
        if (factory == null)
            factory = new RectangularClipperFactory();
        globalInstance = factory;
    }

    /**
     * Create a RectangularClipper.
     */
    public RectangularClipper createClipper() {
        return new DefaultRectangularClipper();
    }
}
