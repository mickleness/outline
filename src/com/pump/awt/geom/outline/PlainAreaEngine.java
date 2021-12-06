package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.Area;
import java.util.List;

/**
 * This OutlineEngine uses the Area class to execute each OutlineOperation
 * sequentially in the current thread. This is the plainest / most unoptimized
 * interpretation of an OutlineEngine. This is a good baseline to measure
 * performance of optimizations against.
 */
public class PlainAreaEngine implements OutlineEngine {

    @Override
    public Area calculate(List<OutlineOperation> operationQueue) {
        Area area = new Area();
        for(OutlineOperation operation : operationQueue) {
            Area rhs;
            switch(operation.type) {
                case ADD:
                    rhs = new Area(operation.shape);
                    area.add(rhs);
                    break;
                case SUBTRACT:
                    rhs = new Area(operation.shape);
                    area.subtract(rhs);
                    break;
                case XOR:
                    rhs = new Area(operation.shape);
                    area.exclusiveOr(rhs);
                    break;
                case INTERSECT:
                    rhs = new Area(operation.shape);
                    area.intersect(rhs);
                    break;
            }
        }
        if (area.isEmpty())
            return null;
        return area;
    }

    @Override
    public OutlineOperation createOperation(OutlineOperation.Type type, Shape shape) {
        return new OutlineOperation(type, shape);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
