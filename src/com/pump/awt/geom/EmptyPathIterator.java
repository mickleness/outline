package com.pump.awt.geom;

import java.awt.geom.PathIterator;

/**
 * This PathIterator contains no data.
 */
class EmptyPathIterator implements PathIterator {

    public static final EmptyPathIterator INSTANCE = new EmptyPathIterator();

    private EmptyPathIterator() {}

    @Override
    public int getWindingRule() {
        return PathIterator.WIND_EVEN_ODD;
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public void next() {
        // intentionally empty
    }

    @Override
    public int currentSegment(float[] coords) {
        return PathIterator.SEG_MOVETO;
    }

    @Override
    public int currentSegment(double[] coords) {
        return PathIterator.SEG_MOVETO;
    }
};