package com.pump.awt.geom.clip;

public class RectangularClipperFactory {
    private static RectangularClipperFactory globalInstance;

    static {
        set(null);
    }

    public static RectangularClipperFactory get() {
        return globalInstance;
    }

    public static void set(RectangularClipperFactory factory) {
        if (factory == null)
            factory = new RectangularClipperFactory();
        globalInstance = factory;
    }

    public RectangularClipper createClipper() {
        return new DefaultRectangularClipper();
    }
}
