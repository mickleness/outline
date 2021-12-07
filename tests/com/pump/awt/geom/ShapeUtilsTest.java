package com.pump.awt.geom;

import junit.framework.TestCase;

import java.awt.*;
import java.awt.geom.Path2D;

public class ShapeUtilsTest extends TestCase {

    // As of this writing the ShapeUtils class also contains a getBounds2D() method. There are unit tests for that method,
    // but I did not copy them here.

    public void testToRectangle2D_clockwise_topleft() {
        testToRectangle(0, 0, 10, 0, 10, 10, 0, 10);
    }

    public void testToRectangle2D_clockwise_topright() {
        testToRectangle(10, 0, 10, 10, 0, 10, 0, 0);
    }

    public void testToRectangle2D_clockwise_bottomright() {
        testToRectangle(10, 10, 0, 10, 0, 0, 10, 0);
    }

    public void testToRectangle2D_clockwise_bottomleft() {
        testToRectangle(0, 10, 0, 0, 10, 0, 10, 10);
    }

    public void testToRectangle2D_counter_clockwise_topleft() {
        testToRectangle(0, 0, 0, 10, 10, 10, 10, 0);
    }

    public void testToRectangle2D_counter_clockwise_bottomleft() {
        testToRectangle(0, 10, 10, 10, 10, 0, 0, 0);
    }

    public void testToRectangle2D_counter_clockwise_bottomright() {
        testToRectangle(10, 10, 10, 0, 0, 0, 0, 10);
    }

    public void testToRectangle2D_counter_clockwise_topright() {
        testToRectangle(10, 0, 0, 0, 0, 10, 10, 10);
    }

    public void testToRectangleNull_1() {
        testToRectangleNull(new Point(0,0), new Point(10, 10), new Point(10, 0), new Point(0, 10));
    }

    public void testToRectangleNull_2() {
        testToRectangleNull(new Point(0,0), new Point(0, 10), new Point(10, 0), new Point(10, 10));
    }

    public void testToRectangleNull_3() {
        testToRectangleNull(new Point(0,0), new Point(0, 10), new Point(10, 0));
    }

    public void testToRectangleMultiplePaths() {
        Path2D p = new Path2D.Double();
        p.append(new Rectangle(0,0,10,10), false);
        p.append(new Rectangle(0,0,10,10), false);
        assertEquals(null, ShapeUtils.toRectangle2D(p.getPathIterator(null)));
    }

    private void testToRectangle(int x0, int y0,int x1, int y1,int x2, int y2,int x3, int y3) {
        for(int dx : new int[] { -100, 0, 100}) {
            for(int dy : new int[] { -100, 0, 100}) {
                for (boolean closed : new boolean[] {true, false}) {
                    Path2D p = new Path2D.Double();
                    p.moveTo(x0 + dx, y0 + dy);
                    p.lineTo(x1+ dx, y1 + dy);
                    p.lineTo(x2+ dx, y2 + dy);
                    p.lineTo(x3+ dx, y3 + dy);
                    if (closed)
                        p.closePath();

                    Rectangle r = (Rectangle) ShapeUtils.toRectangle2D(p.getPathIterator(null));
                    assertEquals(0 + dx, r.x);
                    assertEquals(0 + dy, r.y);
                    assertEquals(10, r.width);
                    assertEquals(10, r.height);
                }
            }
        }
    }

    private void testToRectangleNull(Point... pts) {
        Path2D p = new Path2D.Double();
        p.moveTo(pts[0].x, pts[0].y);
        for(int a = 1; a<pts.length; a++) {
            p.lineTo(pts[a].x, pts[a].y);
        }
        assertEquals(null, ShapeUtils.toRectangle2D(p.getPathIterator(null)));
    }

    // TODO: make rectangle-detection smarter so this unit test passes:
//    public void testToRectangle2D_midpoint() {
//        Path2D p = new Path2D.Double();
//        p.moveTo(5, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.lineTo(0,0);
//        p.closePath();
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//    }

    // TODO: make rectangle-detection smarter so this unit test passes:
//    public void testToRectangle2D_closedness() {
//        // this has all 4 points, but it isn't closed:
//        Path2D p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//
//        assertEquals(null, ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//
//        // this has all 4 points, it isn't closed, but it circles back to the origin:
//        p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.lineTo(0, 0);
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//
//        // this has all 4 points, and it IS closed:
//        p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.closePath();
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//
//        // this has all 4 points, and it circles back to the origin, and its closed:
//        p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.lineTo(0, 0);
//        p.closePath();
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//    }
}
