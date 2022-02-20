package com.pump.awt.geom.outline;

import com.pump.awt.geom.RectangularTransform;
import com.pump.awt.geom.ScaledShape;
import com.pump.awt.geom.mask.RectangleMask;

import java.awt.*;
import java.io.*;
import java.util.List;

/**
 * This uses RectangleMasks to perform operations. This basically sets up a shape that acts like a pixel-based
 * representation of a shape.
 * <p>
 * You can define a <code>resolution</code> for this engine, which is analogous to the resolution of your
 * monitor. A value of one with give you clear aliased edges. A value of two (two pixels in each dimension)
 * packs four subpixels in one pixel, which will look good on a normal (not high-resolution) monitor. A value
 * of four will look high quality even on a high-resolution monitor.
 * </p>
 */
public class ScaledMaskOutlineEngine implements OutlineEngine, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private int resolution;
    private RectangularTransform scaleUp, scaleDown;

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
    public ScaledMaskOutlineEngine(int resolution) {
        if (resolution < 1)
            throw new IllegalArgumentException("resolution must be greater than zero");
        this.resolution = resolution;
        initialize();
    }

    /**
     * The resolution this engine renders shapes with.
     */
    public int getResolution() {
        return resolution;
    }

    private void initialize() {
        scaleUp = RectangularTransform.getScaleInstance(resolution);
        scaleDown = RectangularTransform.getScaleInstance(1.0 / resolution);
    }

    @Override
    public Shape calculate(List<OutlineOperation> operations) {
        new OptimizedEngine().removeTransforms(operations);
        RectangleMask returnValue = new RectangleMask();
        for(OutlineOperation op : operations) {
            RectangleMask operand;
            Shape shape = op.shape;
            if (shape instanceof ScaledShape) {
                ScaledShape ss = (ScaledShape) shape;
                if (ss.getTransform().equals(scaleDown))
                    shape = ss.getUntransformedShape();
            }
            if (shape instanceof RectangleMask) {
                operand = (RectangleMask) shape;
            } else {
                operand = new RectangleMask(op.shape, scaleUp.createAffineTransform(), 1);
            }

            switch (op.type) {
                case ADD:
                    returnValue.add(operand);
                    break;
                case SUBTRACT:
                    returnValue.subtract(operand);
                    break;
                case CLIP:
                    returnValue.clip(operand);
                    break;
                case EXCLUSIVE_OR:
                    returnValue.xor(operand);
                    break;
            }
        }
        return new ScaledShape(returnValue, scaleDown);
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
            initialize();
        } else {
            throw new IOException("Unsupported internal version: " + internalVersion);
        }
    }
}
