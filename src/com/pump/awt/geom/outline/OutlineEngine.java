package com.pump.awt.geom.outline;

import java.awt.*;
import java.util.List;

public interface OutlineEngine {

    /**
     *
     * @param body this may be null
     * @param operationQueue
     * @return this may be null if there is no shape data
     */
    Shape flush(Shape body, List<OutlineOperation> operationQueue);

    void prepare(OutlineOperation addOperation);
}
