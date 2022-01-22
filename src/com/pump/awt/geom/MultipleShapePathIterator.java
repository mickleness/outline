package com.pump.awt.geom;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.util.Iterator;

/**
 * This iterates over multiple shapes.
 */
public class MultipleShapePathIterator implements PathIterator {

    Iterator<Shape> shapes;
    AffineTransform transform;
    Double flatness;
    int windingRule;
    PathIterator current;

    public MultipleShapePathIterator(Iterator<Shape> shapes, AffineTransform transform, Double flatness, int windingRule) {
        this.shapes = shapes;
        this.transform = transform;
        this.flatness = flatness;

        // When winding rule is UNKNOWN: we can pick either.
        this.windingRule = windingRule == AddingShape.WIND_UNKNOWN ? PathIterator.WIND_NON_ZERO : windingRule;

        next();
    }

    @Override
    public int getWindingRule() {
        return windingRule;
    }

    @Override
    public boolean isDone() {
        return current == null;
    }

    @Override
    public void next() {
        if (current != null) {
            current.next();
        }
        if (current == null || current.isDone()) {
            current = null;
            if (shapes.hasNext()) {
                Shape nextShape = shapes.next();

                if (flatness != null) {
                    current = nextShape.getPathIterator(transform, flatness);
                } else {
                    current = nextShape.getPathIterator(transform);
                }
            }
        }
    }

    @Override
    public int currentSegment(float[] coords) {
        if (current != null)
            return current.currentSegment(coords);
        throw new IllegalStateException();
    }

    @Override
    public int currentSegment(double[] coords) {
        if (current != null)
            return current.currentSegment(coords);
        throw new IllegalStateException();
    }
}