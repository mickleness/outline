package com.pump.awt.geom.outline;

import com.pump.awt.geom.CompoundShape;

import java.awt.*;
import java.awt.geom.Area;
import java.util.List;

/**
 * This engine only exists for the EngineAccuracyTests to confirm that
 * the CompoundShape's operations remain visually accurate. The CompoundShape
 * performs some optimizations of its own, and folding (hacking) its
 * functionality into the EngineAccuracyTests seemed like an easy
 * way to test it.
 */
class CompoundShapeEngine implements OutlineEngine {

    @Override
    public Shape calculate(List<OutlineOperation> operationQueue) {
        CompoundShape returnValue = new CompoundShape();
        for(OutlineOperation op : operationQueue) {
            switch(op.type) {
                case ADD:
                    returnValue.add(op.shape);
                    break;
                case SUBTRACT:
                    returnValue.subtract(op.shape);
                    break;
                case XOR:
                    returnValue.xor(op.shape);
                    break;
                case INTERSECT:
                    returnValue.clip(op.shape);
                    break;
                case TRANSFORM:
                    // TODO: will the CompoundShape include an optimized transform(tx) method?
                    if (returnValue != null)
                        returnValue = new CompoundShape(op.transform.createTransformedShape(returnValue));
                    break;
            }
        }
        return returnValue;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
