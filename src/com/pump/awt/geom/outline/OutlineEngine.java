package com.pump.awt.geom.outline;

import java.awt.*;
import java.util.List;

/**
 * This executes a series of {@link OutlineOperation} objects.
 */
public interface OutlineEngine {

    /**
     * Calculate the result of a series of operations.
     *
     * @param operationQueue the queue of operations to execute. This method may modify this list.
     * @return the resulting shape. This should not return null, but it may return an empty shape.
     */
    Shape calculate(List<OutlineOperation> operationQueue);
}
