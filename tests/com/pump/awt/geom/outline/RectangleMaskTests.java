package com.pump.awt.geom.outline;

import junit.framework.TestCase;

import java.awt.*;

public class RectangleMaskTests extends TestCase {

    public void testEmptyContains() {
        RectangleMask mask = new RectangleMask();
        assertFalse(mask.contains(0, 0));
        assertTrue(mask.isEmpty());
    }

    /**
     * This creates the same outline a few different ways and makes sure the
     * resulting RectangleMask is always the same.
     */
    public void testEqualsContains_1() {
        RectangleMask b0 = new RectangleMask();
        b0.add(0, 0, 3, 3);
        b0.add(1, 1, 3, 3);

        RectangleMask b1 = new RectangleMask();
        b1.add(0, 0, 3, 1);
        b1.add(0, 1, 4, 2);
        b1.add(1, 3, 3, 1);

        RectangleMask b2 = new RectangleMask();
        b2.add(0, 0, 1, 3);
        b2.add(1, 0, 2, 4);
        b2.add(3, 1, 1, 3);

        // one px at a time, horizontally, left-to-right
        RectangleMask b3 = new RectangleMask();
        b3.add(0, 0, 1, 1);
        b3.add(1, 0, 1, 1);
        b3.add(2, 0, 1, 1);

        b3.add(0, 1, 1, 1);
        b3.add(1, 1, 1, 1);
        b3.add(2, 1, 1, 1);
        b3.add(3, 1, 1, 1);

        b3.add(0, 2, 1, 1);
        b3.add(1, 2, 1, 1);
        b3.add(2, 2, 1, 1);
        b3.add(3, 2, 1, 1);

        b3.add(1, 3, 1, 1);
        b3.add(2, 3, 1, 1);
        b3.add(3, 3, 1, 1);

        // one px at a time, horizontally, right-to-left
        RectangleMask b4 = new RectangleMask();
        b4.add(2, 0, 1, 1);
        b4.add(1, 0, 1, 1);
        b4.add(0, 0, 1, 1);

        b4.add(3, 1, 1, 1);
        b4.add(2, 1, 1, 1);
        b4.add(1, 1, 1, 1);
        b4.add(0, 1, 1, 1);

        b4.add(3, 2, 1, 1);
        b4.add(2, 2, 1, 1);
        b4.add(1, 2, 1, 1);
        b4.add(0, 2, 1, 1);

        b4.add(3, 3, 1, 1);
        b4.add(2, 3, 1, 1);
        b4.add(1, 3, 1, 1);

        // one px at a time, vertically, top-to-bottom
        RectangleMask b5 = new RectangleMask();
        b5.add(0, 0, 1, 1);
        b5.add(0, 1, 1, 1);
        b5.add(0, 2, 1, 1);

        b5.add(1, 0, 1, 1);
        b5.add(1, 1, 1, 1);
        b5.add(1, 2, 1, 1);
        b5.add(1, 3, 1, 1);

        b5.add(2, 0, 1, 1);
        b5.add(2, 1, 1, 1);
        b5.add(2, 2, 1, 1);
        b5.add(2, 3, 1, 1);

        b5.add(3, 1, 1, 1);
        b5.add(3, 2, 1, 1);
        b5.add(3, 3, 1, 1);

        // one px at a time, vertically, bottom-to-top
        RectangleMask b6 = new RectangleMask();
        b6.add(0, 2, 1, 1);
        b6.add(0, 1, 1, 1);
        b6.add(0, 0, 1, 1);

        b6.add(1, 3, 1, 1);
        b6.add(1, 2, 1, 1);
        b6.add(1, 1, 1, 1);
        b6.add(1, 0, 1, 1);

        b6.add(2, 3, 1, 1);
        b6.add(2, 2, 1, 1);
        b6.add(2, 1, 1, 1);
        b6.add(2, 0, 1, 1);

        b6.add(3, 3, 1, 1);
        b6.add(3, 2, 1, 1);
        b6.add(3, 1, 1, 1);

        // one px at a time, randomly:
        RectangleMask b7 = new RectangleMask();
        b7.add(2, 1, 1, 1);
        b7.add(1, 2, 1, 1);
        b7.add(1, 1, 1, 1);
        b7.add(0, 2, 1, 1);
        b7.add(1, 0, 1, 1);
        b7.add(3, 3, 1, 1);
        b7.add(0, 0, 1, 1);
        b7.add(1, 3, 1, 1);
        b7.add(2, 0, 1, 1);
        b7.add(2, 3, 1, 1);
        b7.add(2, 2, 1, 1);
        b7.add(3, 1, 1, 1);
        b7.add(0, 1, 1, 1);
        b7.add(3, 2, 1, 1);

        RectangleMask b8 = new RectangleMask();
        b8.add(1, 1, 3, 3);
        b8.add(0, 0, 2, 2);
        b8.add(1, 0, 2, 2);
        b8.add(0, 1, 2, 2);

        RectangleMask b9 = new RectangleMask();
        b9.add(0, 0, 4, 4);
        b9.subtract(3, 0, 1, 1);
        b9.subtract(0,3, 1, 1);

        RectangleMask b10 = new RectangleMask();
        b10.add(0, 0, 4, 4);
        b10.subtract(3, -1, 2, 2);
        b10.subtract(-1,3, 2, 2);

        RectangleMask b11 = new RectangleMask();
        b11.add(-1, -1, 4, 4);
        b11.add(1, 1, 4, 4);
        b11.clip(0,0,4,4);

        testEqualsContains(b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11);
    }

    /**
     * This creates 3 concentric rectangles a couple of different ways.
     */
    public void testEqualsContains_2() {
        RectangleMask b0 = new RectangleMask();
        b0.add(0,0,10,10);
        b0.subtract(1,1,8,8);
        b0.add(2,2,6,6);
        b0.subtract(3,3,4,4);
        b0.add(4,4,2,2);

        RectangleMask b1 = new RectangleMask();
        b1.add(0,0,10,1);
        b1.add(0,0,1,10);
        b1.add(0,9,10,1);
        b1.add(9,0,1,10);

        b1.add(2,2,6,1);
        b1.add(2,2,1,6);
        b1.add(2,7,6,1);
        b1.add(7,2,1,6);

        b1.add(4,4,2,2);

        testEqualsContains(b0, b1);
    }

    /**
     * Return a String representing of a RectangleMask were 'X' indicates a filled pixel and ' ' indicates empty space.
     */
    private String toString(RectangleMask rMask) {
        StringBuilder returnValue = new StringBuilder();
        Rectangle bounds = rMask.getBounds();
        for(int y = bounds.y; y < bounds.y + bounds.height; y++) {
            for(int x = bounds.x; x < bounds.x + bounds.width; x++) {
                if (rMask.contains(x, y)) {
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
    private void testEqualsContains(RectangleMask... rMasks) {
        Rectangle bounds = rMasks[0].getBounds();
        String[] str = new String[rMasks.length];
        for(int a = 0; a<rMasks.length; a++) {
            str[a] = toString(rMasks[a]);
            bounds.add(rMasks[a].getBounds());
        }

        for(int a = 0; a < rMasks.length; a++) {
            for (int b = 0; b < rMasks.length; b++) {
                try {
                    if (!str[a].equals(str[b])) {
                        fail("Two or more RectangleMasks that were expected to be the same had different results for #contains(x,y)");
                    }
                    assertEquals(rMasks[a], rMasks[b]);
                } catch(Error | RuntimeException e) {
                    System.err.println("a = "+a);
                    System.err.println(str[a]);
                    System.err.println("b = "+b);
                    System.err.println(str[b]);
                    throw e;
                }
            }
        }
    }

    /**
     * Test the size of the RectangleMask#rows field as it expands and then contracts during a series of adds.
     */
    public void testAddCollapseRows() {
        RectangleMask b = new RectangleMask();
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
        RectangleMask b = new RectangleMask();
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

    public void testContainsRectIntersectsRect() {
        RectangleMask r = new RectangleMask();
        r.add(0, -10, 10, 10);
        testContainsIntersects(r,false, false, 0,-13,2,2);
        testContainsIntersects(r,false, false, 0,-12,2,2);
        testContainsIntersects(r,false, true, 0,-11,2,2);
        testContainsIntersects(r,true, true, 0,-10,2,2);
        testContainsIntersects(r,true, true, 0,-9,2,2);

        testContainsIntersects(r,true, true, 0,-3,2,2);
        testContainsIntersects(r,true, true, 0,-2,2,2);
        testContainsIntersects(r,false, true, 0,-1,2,2);
        testContainsIntersects(r,false, false, 0,0,2,2);
        testContainsIntersects(r,false, false, 0,1,2,2);

        testContainsIntersects(r,false, false,-3,-5,2,2);
        testContainsIntersects(r,false, false,-2,-5,2,2);
        testContainsIntersects(r,false, true,-1,-5,2,2);
        testContainsIntersects(r,true, true,0,-5,2,2);
        testContainsIntersects(r,true, true,1,-5,2,2);

        testContainsIntersects(r,true, true,7,-5,2,2);
        testContainsIntersects(r,true, true,8,-5,2,2);
        testContainsIntersects(r,false, true,9,-5,2,2);
        testContainsIntersects(r,false, false,10,-5,2,2);
        testContainsIntersects(r,false, false,11,-5,2,2);

        r.subtract(1, -9, 8, 8);
        testContainsIntersects(r,false, false,5,-13,2,2);
        testContainsIntersects(r,false, false,5,-12,2,2);
        testContainsIntersects(r,false, true,5,-11,2,2);
        testContainsIntersects(r,false, true,5,-10,2,2);
        testContainsIntersects(r,false, false,5,-9,2,2);

        testContainsIntersects(r,false, false,5,-3,2,2);
        testContainsIntersects(r,false, true,5,-2,2,2);
        testContainsIntersects(r,false, true,5,-1,2,2);
        testContainsIntersects(r,false, false,5,0,2,2);
        testContainsIntersects(r,false, false,5,1,2,2);

        testContainsIntersects(r,false, false,-3,-5,2,2);
        testContainsIntersects(r,false, false,-2,-5,2,2);
        testContainsIntersects(r,false, true,-1,-5,2,2);
        testContainsIntersects(r,false, true,0,-5,2,2);
        testContainsIntersects(r,false, false,1,-5,2,2);

        testContainsIntersects(r,false, false,7,-5,2,2);
        testContainsIntersects(r,false, true,8,-5,2,2);
        testContainsIntersects(r,false, true,9,-5,2,2);
        testContainsIntersects(r,false, false,10,-5,2,2);
        testContainsIntersects(r,false, false,11,-5,2,2);

        r.add(2, -8, 6, 6);
        testContainsIntersects(r,false, true,4,-10,2,2);
        testContainsIntersects(r,false, true,4,-9,2,2);
        testContainsIntersects(r,true, true,4,-8,2,2);
        testContainsIntersects(r,true, true,4,-7,2,2);

        testContainsIntersects(r,true, true,4,-5,2,2);
        testContainsIntersects(r,true, true,4,-4,2,2);
        testContainsIntersects(r,false, true,4,-3,2,2);
        testContainsIntersects(r,false, true,4,-2,2,2);
        testContainsIntersects(r,false, true,4,-1,2,2);

        testContainsIntersects(r,false, true,-1,-5,2,2);
        testContainsIntersects(r,false, true,0,-5,2,2);
        testContainsIntersects(r,false, true,1,-5,2,2);
        testContainsIntersects(r,true, true,2,-5,2,2);
        testContainsIntersects(r,true, true,3,-5,2,2);

        testContainsIntersects(r,true, true,5,-5,2,2);
        testContainsIntersects(r,true, true,6,-5,2,2);
        testContainsIntersects(r,false, true,7,-5,2,2);
        testContainsIntersects(r,false, true,8,-5,2,2);
        testContainsIntersects(r,false, true,9,-5,2,2);

        r.add(0, -10, 10, 10);
        testContainsIntersects(r,true, true, 0,-10,10,10);

        testContainsIntersects(r,false, true, 1,-10,10,10);
        testContainsIntersects(r,false, true, -1,-10,10,10);
        testContainsIntersects(r,false, true, 0,-11,10,10);
        testContainsIntersects(r,false, true, 0,-9,10,10);

        testContainsIntersects(r,false, false, 15,-5,1,1);
        testContainsIntersects(r,false, false, -15,-10,1,1);
        testContainsIntersects(r, false, false,0,-15,1,1);
        testContainsIntersects(r, false, false,0,5,1,1);
    }

    private void testContainsIntersects(RectangleMask r, boolean expectedContains, boolean expectedIntersects, int x, int y, int width, int height) {
        assertEquals(expectedContains, r.contains(x, y, width, height));
        assertEquals(expectedIntersects, r.intersects(x, y, width, height));
    }

    /**
     * This tests a specific failure observed during randomized tests.
     * Specifically if collapseRows() purged the new row at y (because it was redundant),
     * then the resulting mask would appear empty.
     */
    public void testClip() {
        RectangleMask m = new RectangleMask(new Rectangle(200, 149, 90, 90));
        m.clip(199, 229, 92, 92);
        assertEquals(2, m.rows.size());
        assertFalse(m.isEmpty());
        assertEquals(new Rectangle(200, 229, 90, 10), m.getBounds());
    }
}
