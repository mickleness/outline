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
        Shape returnValue = null;
        for(OutlineOperation op : operationQueue) {
            switch(op.type) {
                case ADD:
                    if (returnValue == null) {
                        returnValue = op.shape;
                    } else {
                        CompoundShape cs = new CompoundShape(returnValue);
                        cs.addSafely(op.shape);
                        returnValue = cs;
                    }
                    break;
                case SUBTRACT:
                    if (returnValue == null) {
                        // intentionally empty
                    } else {
                        // TODO: use CompoundShape
                        Area area = returnValue instanceof Area ? (Area) returnValue : new Area(returnValue);
                        area.subtract(new Area(op.shape));
                        returnValue = area;
                    }
                    break;
                case XOR:
                    if (returnValue == null) {
                        // it's effectively an add op:
                        returnValue = new CompoundShape(op.shape);
                    } else {
                        // TODO: use CompoundShape
                        Area area = returnValue instanceof Area ? (Area) returnValue : new Area(returnValue);
                        area.exclusiveOr(new Area(op.shape));
                        returnValue = area;
                    }
                    break;
                case INTERSECT:
                    // TODO: why does the ClipArtTests#testClip show a significant performance difference
                    // between this engine and the PlainAreaEngine? Shouldn't they be nearly the same?
                    // Sometimes it was much better, sometimes it was much worse.

                    if (returnValue == null) {
                        // intentionally empty
                    } else {
                        // TODO: use CompoundShape
                        Area area = returnValue instanceof Area ? (Area) returnValue : new Area(returnValue);
                        area.intersect(new Area(op.shape));
                        returnValue = area;
                    }
                    break;
                case TRANSFORM:
                    // TODO: will the CompoundShape include an optimized transform(tx) method?
                    if (returnValue != null)
                        returnValue = op.transform.createTransformedShape(returnValue);
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
