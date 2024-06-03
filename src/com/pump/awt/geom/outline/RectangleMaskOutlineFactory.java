package com.pump.awt.geom.outline;

import java.io.*;

/**
 * This OutlineFactory creates a {@link RectangleMaskOutline}.
 */
public class RectangleMaskOutlineFactory extends OutlineFactory<RectangleMaskOutline> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int resolution;

    /**
     * Create a new ScaledMaskOutlineEngine.
     *
     * @param resolution the resolution to render shapes with. For example if the resolution is
     *                   2 then this mask will break up each 1x1 rectangle into 4 subrectangles.
     *                   A resolution of 1 will produce an aliased outline. A resolution of 2 will
     *                   appear antialiased on a normal monitor. A resolution of 3 or 4 will appear
     *                   antialiased on a high-res (200%) monitor.
     *
     */
    public RectangleMaskOutlineFactory(int resolution) {
        if (resolution < 1)
            throw new IllegalArgumentException("resolution must be greater than zero");
        this.resolution = resolution;
    }

    /**
     * The resolution this engine renders shapes with.
     */
    public int getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        String str = getClass().getSimpleName();
        if (resolution == 1)
            return str;
        return str + "[ resolution = "+resolution+"]";
    }

    @Serial
    private void writeObject(ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);
        out.writeInt(resolution);
    }

    @Serial
    private void readObject(ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            resolution = in.readInt();
        } else {
            throw new IOException("Unsupported internal version: " + internalVersion);
        }
    }

    @Override
    public RectangleMaskOutline create() {
        return new RectangleMaskOutline(resolution);
    }

    @Override
    public int hashCode() {
        return -8627239;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == getClass() &&
                ((RectangleMaskOutlineFactory)obj).resolution == resolution;
    }
}
