package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.util.List;

/**
 * This iterates over multiple shapes.
 */
public class AppendedShapePathIterator implements PathIterator {

    java.util.List<Shape> shapes;
    AffineTransform transform;
    Double flatness;
    int windingRule;
    PathIterator current;

    public AppendedShapePathIterator(List<Shape> shapes, AffineTransform transform, Double flatness, int windingRule) {
        this.shapes = shapes;
        this.transform = transform;
        this.flatness = flatness;
        this.windingRule = windingRule;

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
            if (!shapes.isEmpty()) {
                Shape nextShape = shapes.remove(0);
                if (flatness != null) {
                    current = nextShape.getPathIterator(transform, flatness.doubleValue());
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