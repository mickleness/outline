package com.pump.awt.geom.outline;

import junit.framework.TestCase;

import java.awt.*;

public class BoxShapeTests extends TestCase {

    public void testEmptyContains() {
        BoxShape mask = new BoxShape();
        assertFalse(mask.contains(0, 0));
        assertTrue(mask.isEmpty());
    }

    /**
     * This creates the same outline a few different ways and makes sure the
     * resulting BoxShape is always the same.
     */
    public void testAddEqualsContains() {
        BoxShape b1 = new BoxShape();
        b1.add(0, 0, 3, 3);
        b1.add(1, 1, 3, 3);

        BoxShape b2 = new BoxShape();
        b2.add(0, 0, 3, 1);
        b2.add(0, 1, 4, 2);
        b2.add(1, 3, 3, 1);

        BoxShape b3 = new BoxShape();
        b3.add(0, 0, 1, 3);
        b3.add(1, 0, 2, 4);
        b3.add(3, 1, 1, 3);

        // one px at a time, horizontally, left-to-right
        BoxShape b4 = new BoxShape();
        b4.add(0, 0, 1, 1);
        b4.add(1, 0, 1, 1);
        b4.add(2, 0, 1, 1);

        b4.add(0, 1, 1, 1);
        b4.add(1, 1, 1, 1);
        b4.add(2, 1, 1, 1);
        b4.add(3, 1, 1, 1);

        b4.add(0, 2, 1, 1);
        b4.add(1, 2, 1, 1);
        b4.add(2, 2, 1, 1);
        b4.add(3, 2, 1, 1);

        b4.add(1, 3, 1, 1);
        b4.add(2, 3, 1, 1);
        b4.add(3, 3, 1, 1);

        // one px at a time, horizontally, right-to-left
        BoxShape b5 = new BoxShape();
        b5.add(2, 0, 1, 1);
        b5.add(1, 0, 1, 1);
        b5.add(0, 0, 1, 1);

        b5.add(3, 1, 1, 1);
        b5.add(2, 1, 1, 1);
        b5.add(1, 1, 1, 1);
        b5.add(0, 1, 1, 1);

        b5.add(3, 2, 1, 1);
        b5.add(2, 2, 1, 1);
        b5.add(1, 2, 1, 1);
        b5.add(0, 2, 1, 1);

        b5.add(3, 3, 1, 1);
        b5.add(2, 3, 1, 1);
        b5.add(1, 3, 1, 1);

        // one px at a time, vertically, top-to-bottom
        BoxShape b6 = new BoxShape();
        b6.add(0, 0, 1, 1);
        b6.add(0, 1, 1, 1);
        b6.add(0, 2, 1, 1);

        b6.add(1, 0, 1, 1);
        b6.add(1, 1, 1, 1);
        b6.add(1, 2, 1, 1);
        b6.add(1, 3, 1, 1);

        b6.add(2, 0, 1, 1);
        b6.add(2, 1, 1, 1);
        b6.add(2, 2, 1, 1);
        b6.add(2, 3, 1, 1);

        b6.add(3, 1, 1, 1);
        b6.add(3, 2, 1, 1);
        b6.add(3, 3, 1, 1);

        // one px at a time, vertically, bottom-to-top
        BoxShape b7 = new BoxShape();
        b7.add(0, 2, 1, 1);
        b7.add(0, 1, 1, 1);
        b7.add(0, 0, 1, 1);

        b7.add(1, 3, 1, 1);
        b7.add(1, 2, 1, 1);
        b7.add(1, 1, 1, 1);
        b7.add(1, 0, 1, 1);

        b7.add(2, 3, 1, 1);
        b7.add(2, 2, 1, 1);
        b7.add(2, 1, 1, 1);
        b7.add(2, 0, 1, 1);

        b7.add(3, 3, 1, 1);
        b7.add(3, 2, 1, 1);
        b7.add(3, 1, 1, 1);

        // one px at a time, randomly:
        BoxShape b8 = new BoxShape();
        b8.add(2, 1, 1, 1);
        b8.add(1, 2, 1, 1);
        b8.add(1, 1, 1, 1);
        b8.add(0, 2, 1, 1);
        b8.add(1, 0, 1, 1);
        b8.add(3, 3, 1, 1);
        b8.add(0, 0, 1, 1);
        b8.add(1, 3, 1, 1);
        b8.add(2, 0, 1, 1);
        b8.add(2, 3, 1, 1);
        b8.add(2, 2, 1, 1);
        b8.add(3, 1, 1, 1);
        b8.add(0, 1, 1, 1);
        b8.add(3, 2, 1, 1);

        BoxShape b9 = new BoxShape();
        b9.add(1, 1, 3, 3);
        b9.add(0, 0, 2, 2);
        b9.add(1, 0, 2, 2);
        b9.add(0, 1, 2, 2);

        testEqualsContains(b1, b2, b3, b4, b5, b6, b7, b8, b9);
    }

    /**
     * Return a String representing of a BoxShape were 'X' indicates a filled pixel and ' ' indicates empty space.
     */
    private String toString(BoxShape boxShape) {
        StringBuilder returnValue = new StringBuilder();
        Rectangle bounds = boxShape.getBounds();
        for(int y = bounds.y; y < bounds.y + bounds.height; y++) {
            for(int x = bounds.x; x < bounds.x + bounds.width; x++) {
                if (boxShape.contains(x, y)) {
                    returnValue.append('X');
                } else {
                    returnValue.append(' ');
                }
            }
            returnValue.append('\n');
        }
        return returnValue.toString();
    }

    /**
     * This makes sure the contains(x,y) and equals(Object) method are consistent for a set
     * of identical shapes.
     */
    private void testEqualsContains(BoxShape... boxShapes) {
        Rectangle bounds = boxShapes[0].getBounds();
        String[] str = new String[boxShapes.length];
        for(int a = 0; a<boxShapes.length; a++) {
            str[a] = toString(boxShapes[a]);
            bounds.add(boxShapes[a].getBounds());
        }

        for(int a = 0; a < boxShapes.length; a++) {
            for (int b = 0; b < boxShapes.length; b++) {
                try {
                    if (!str[a].equals(str[b])) {
                        fail("Two or more BoxShapes that were expected to be the same had different results for #contains(x,y)");
                    }
                    assertEquals(boxShapes[a], boxShapes[b]);
                    // TODO:
//                    assertTrue(boxShapes[a].intersects(boxShapes[b]));
//                    assertTrue(boxShapes[a].contains(boxShapes[b]));
                } catch(Error | RuntimeException e) {
                    System.err.println("a = "+a);
                    System.err.println(str[a]);
                    System.err.println("b = "+b);
                    System.err.println(str[b]);
                    boolean b1 = boxShapes[a].equals(boxShapes[b]);
                    boolean b2 = boxShapes[b].equals(boxShapes[a]);
                    boxShapes[a].equals(boxShapes[b]);
                    boxShapes[b].equals(boxShapes[a]);
                    throw e;
                }
            }
        }
    }

    /**
     * Test the size of the BoxShape#rows field as it expands and then contracts during a series of adds.
     */
    public void testAddCollapseRows() {
        BoxShape b = new BoxShape();
        assertEquals(1, b.rows.size());
        assertTrue(b.add(0, 0, 5, 5));
        assertEquals(2, b.rows.size());
        assertTrue(b.add(5, 5, 5, 5));
        assertEquals(3, b.rows.size());

        // this call modifies a row, but shouldn't change the #
        assertTrue(b.add(5, 0, 5, 5));
        assertEquals(3, b.rows.size());

        // this actually lets us collapse rows into two elements:
        assertTrue(b.add(0, 5, 5, 5));
        assertEquals(2, b.rows.size());
    }

    /**
     * This adds four 5x5 rectangles together to form a large square, and it makes sure
     * the resulting shape is equal to its bounds.
     */
    public void testIsEquals() {
        BoxShape b = new BoxShape();
        assertTrue(b.add(0, 0, 5, 5));
        assertTrue(b.isEqual(b.getBounds()));
        assertTrue(b.isRectangle());

        assertTrue(b.add(5, 5, 5, 5));
        assertFalse(b.isEqual(b.getBounds()));
        assertFalse(b.isRectangle());

        assertTrue(b.add(5, 0, 5, 5));
        assertFalse(b.isEqual(b.getBounds()));
        assertFalse(b.isRectangle());

        assertTrue(b.add(0, 5, 5, 5));
        assertTrue(b.isEqual(b.getBounds()));
        assertTrue(b.isRectangle());
    }
}
