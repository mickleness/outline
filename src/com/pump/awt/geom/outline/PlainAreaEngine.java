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
    public Shape flush(Shape body, List<OutlineOperation> operationQueue) {
        Area area = body == null ? new Area() : new Area(body);
        for(OutlineOperation operation : operationQueue) {
            Area rhs;
            switch(operation.getType()) {
                case ADD:
                    rhs = new Area(operation.getShape());
                    area.add(rhs);
                    break;
                case SUBTRACT:
                    rhs = new Area(operation.getShape());
                    area.subtract(rhs);
                    break;
                case XOR:
                    rhs = new Area(operation.getShape());
                    area.exclusiveOr(rhs);
                    break;
                case INTERSECT:
                    rhs = new Area(operation.getShape());
                    area.intersect(rhs);
                    break;
            }
        }
        if (area.isEmpty())
            return null;
        return area;
    }

    @Override
    public void prepare(OutlineOperation addOperation) {
        // intentionally empty
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
