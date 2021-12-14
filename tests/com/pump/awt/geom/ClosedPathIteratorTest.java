package com.pump.awt.geom;

import junit.framework.TestCase;

import java.awt.geom.Path2D;
import java.awt.geom.PathIterator;

public class ClosedPathIteratorTest extends TestCase {

    public void testClosedPathIterator_oneShape_noLine_unclosed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_oneShape_noLine_closed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);
        input.closePath();

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_oneShape_line_unclosed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);
        input.lineTo(5, 10);

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_oneShape_line_closed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();

        // this exactly resembles the expected value: let's be sure our iterator doesn't
        // screw anything up

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);
        input.lineTo(5, 10);
        input.closePath();

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    // the "_twoShapes" tests mimic the "oneShape" tests above, but they contain two subpaths.

    public void testClosedPathIterator_twoShapes_noLine_unclosed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();
        expected.moveTo(25, 10);
        expected.lineTo(20, 5);
        expected.lineTo(25, 0);
        expected.lineTo(30, 5);
        expected.lineTo(25, 10);
        expected.closePath();

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);

        input.moveTo(25, 10);
        input.lineTo(20, 5);
        input.lineTo(25, 0);
        input.lineTo(30, 5);

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_twoShapes_noLine_closed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();
        expected.moveTo(25, 10);
        expected.lineTo(20, 5);
        expected.lineTo(25, 0);
        expected.lineTo(30, 5);
        expected.lineTo(25, 10);
        expected.closePath();

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);
        input.closePath();
        input.moveTo(25, 10);
        input.lineTo(20, 5);
        input.lineTo(25, 0);
        input.lineTo(30, 5);
        input.closePath();

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_twoShapes_line_unclosed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();
        expected.moveTo(25, 10);
        expected.lineTo(20, 5);
        expected.lineTo(25, 0);
        expected.lineTo(30, 5);
        expected.lineTo(25, 10);
        expected.closePath();

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);
        input.lineTo(5, 10);
        input.moveTo(25, 10);
        input.lineTo(20, 5);
        input.lineTo(25, 0);
        input.lineTo(30, 5);
        input.lineTo(25, 10);

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_singleShape_line_closed() {
        Path2D expected = new Path2D.Double();

        expected.moveTo(5, 10);
        expected.lineTo(0, 5);
        expected.lineTo(5, 0);
        expected.lineTo(10, 5);
        expected.lineTo(5, 10);
        expected.closePath();
        expected.moveTo(25, 10);
        expected.lineTo(20, 5);
        expected.lineTo(25, 0);
        expected.lineTo(30, 5);
        expected.lineTo(25, 10);
        expected.closePath();

        // this exactly resembles the expected value: let's be sure our iterator doesn't
        // screw anything up

        Path2D input = new Path2D.Double();
        input.moveTo(5, 10);
        input.lineTo(0, 5);
        input.lineTo(5, 0);
        input.lineTo(10, 5);
        input.lineTo(5, 10);
        input.closePath();
        input.moveTo(25, 10);
        input.lineTo(20, 5);
        input.lineTo(25, 0);
        input.lineTo(30, 5);
        input.lineTo(25, 10);
        input.closePath();

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_emptyPath() {
        Path2D expected = new Path2D.Double();
        Path2D input = new Path2D.Double();

        // mostly I just want to be sure this doesn't throw an exception. I'd probably need to see this fringe case
        // in action to know for sure what the expected behavior is.
        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    public void testClosedPathIterator_onlyMoveTo() {
        Path2D expected = new Path2D.Double();
        expected.moveTo(2,2);

        Path2D input = new Path2D.Double();
        input.moveTo(2,2);

        // mostly I just want to be sure this doesn't throw an exception. I'd probably need to see this fringe case
        // in action to know for sure what the expected behavior is.

        assertEquals(toString(expected.getPathIterator(null)), toString(new ClosedPathIterator(input.getPathIterator(null))));
    }

    private String toString(PathIterator pi) {
        double[] coords = new double[6];
        StringBuilder sb = new StringBuilder();
        while (!pi.isDone()) {
            int k = pi.currentSegment(coords);
            switch(k) {
                case PathIterator.SEG_MOVETO:
                    sb.append("m "+coords[0] +" "+coords[1]+" ");
                    break;
                case PathIterator.SEG_LINETO:
                    sb.append("l "+coords[0] +" "+coords[1]+" ");
                    break;
                case PathIterator.SEG_QUADTO:
                    sb.append("q "+coords[0] +" "+coords[1]+" "+coords[2]+" "+coords[3]);
                    break;
                case PathIterator.SEG_CUBICTO:
                    sb.append("c "+coords[0] +" "+coords[1]+" "+coords[2]+" "+coords[3]+" "+coords[4]+" "+coords[5]);
                    break;
                case PathIterator.SEG_CLOSE:
                    sb.append("z ");
                    break;
            }
            pi.next();
        }
        return sb.toString().trim();
    }
}
