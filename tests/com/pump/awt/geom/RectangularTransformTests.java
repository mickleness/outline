package com.pump.awt.geom;

import junit.framework.TestCase;

import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class RectangularTransformTests extends TestCase {

    public void testRectangleTransform() {
        RectangularTransform tx = new RectangularTransform(3,2,-5,-11);
        Rectangle src = new Rectangle(1,2,3,5);
        Rectangle expected = new Rectangle( 1 * 3 - 5, 2 * 2 - 11, 3 * 3, 5 * 2);

        assertEquals(expected, tx.transform(src));
        assertTrue(tx.transform(src) instanceof Rectangle);
    }

    public void testRectangleInverse() {
        RectangularTransform tx = new RectangularTransform(3,2,-5,-11);
        Rectangle src = new Rectangle(1,2,3,5);
        Rectangle2D transformed = tx.transform(src);
        Rectangle2D invertedSrc = tx.createInverse().transform(transformed);
        assertEquals(src, invertedSrc);
    }

    public void testPoinntTransform() {
        RectangularTransform tx = new RectangularTransform(3,2,-5,-11);
        Point src = new Point(1,2);
        Point expected = new Point( 1 * 3 - 5, 2 * 2 - 11);

        assertEquals(expected, tx.transform(src));
        assertTrue(tx.transform(src) instanceof Point);
    }

    public void testPointInverse() {
        RectangularTransform tx = new RectangularTransform(3,2,-5,-11);
        Point src = new Point(1,2);
        Point2D transformed = tx.transform(src);
        Point2D invertedSrc = tx.createInverse().transform(transformed);
        assertEquals(src, invertedSrc);
    }
}
