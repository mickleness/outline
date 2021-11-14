package com.pump.awt.geom.outline;

import java.awt.*;
import java.util.List;

public interface OutlineEngine {

    /**
     *
     * @param body this may be null
     * @param operationQueue the queue of operations to execute. This method may modify this list.
     * @return this may be null if there is no shape data
     */
    Shape flush(Shape body, List<OutlineOperation> operationQueue);

    OutlineOperation createOperation(OutlineOperation.Type type, Shape shape);
}
