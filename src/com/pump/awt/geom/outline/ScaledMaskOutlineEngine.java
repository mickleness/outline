package com.pump.awt.geom.outline;

import com.pump.awt.geom.mask.RectangleMask;

import java.awt.*;
import java.awt.geom.AffineTransform;
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
public class ScaledMaskOutlineEngine implements OutlineEngine {

    private final double resolution;
    private final AffineTransform scaleUp, scaleDown;

    /**
     * The number of
     */
    public ScaledMaskOutlineEngine(int resolution) {
        if (resolution < 1)
            throw new IllegalArgumentException("resolution must be greater than zero");
        this.resolution = resolution;
        scaleUp = AffineTransform.getScaleInstance(resolution, resolution);
        scaleDown = AffineTransform.getScaleInstance(1.0 / resolution, 1.0 / resolution);
    }

    @Override
    public Shape calculate(List<OutlineOperation> operations) {
        RectangleMask returnValue = new RectangleMask();
        for(OutlineOperation op : operations) {
            RectangleMask operand = new RectangleMask(op.shape, scaleUp, 1);
            switch (op.type) {
                case ADD:
                    returnValue.add(operand);
                    break;
                case SUBTRACT:
                    returnValue.subtract(operand);
                    break;
                case INTERSECT:
                    returnValue.clip(operand);
                    break;
                case XOR:
//                    TODO: returnValue.xor(operand);
                    if (true)
                        throw new IllegalArgumentException();
                    break;
            }
        }
        return scaleDown.createTransformedShape(returnValue);
    }

    @Override
    public OutlineOperation createOperation(OutlineOperation.Type type, Shape shape) {
        return new OutlineOperation(type, shape);
    }

    @Override
    public String toString() {
        String str = getClass().getSimpleName();
        if (resolution == 1)
            return str;
        return str + "[ resolution = "+resolution+"]";
    }
}
