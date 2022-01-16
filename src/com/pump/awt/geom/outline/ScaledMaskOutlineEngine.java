package com.pump.awt.geom.outline;

import com.pump.awt.geom.RectangularTransform;
import com.pump.awt.geom.ScaledShape;
import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.mask.RectangleMask;

import java.awt.*;
import java.awt.geom.*;
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
    private final RectangularTransform scaleUp, scaleDown;

    /**
     * The number of
     */
    public ScaledMaskOutlineEngine(int resolution) {
        if (resolution < 1)
            throw new IllegalArgumentException("resolution must be greater than zero");
        this.resolution = resolution;
        scaleUp = RectangularTransform.getScaleInstance(resolution);
        scaleDown = RectangularTransform.getScaleInstance(1.0 / resolution);
    }

    @Override
    public Shape calculate(List<OutlineOperation> operations) {
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
                operand = new RectangleMask(op.shape, scaleUp.createAffineTransform(), 1, true);
            }

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
                    returnValue.xor(operand);
                    break;
            }
        }
        return new ScaledShape(returnValue, scaleDown);
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
