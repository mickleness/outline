package com.pump.util;

import junit.framework.TestCase;

public class RangeTest extends TestCase {

    Range<Integer> r5_10 = new Range.Integer(5, 10);

    public void testToString() {
        assertEquals("[5,10)", r5_10.toString());
    }

    public void testContainsElement() {
        assertFalse(r5_10.contains(4));
        assertTrue(r5_10.contains(5));
        assertTrue(r5_10.contains(7));
        assertTrue(r5_10.contains(9));
        assertFalse(r5_10.contains(10));
        assertFalse(r5_10.contains(11));
    }

    public void testContainsRange() {
        // easy stuff that's clearly strays out of range:
        assertFalse(r5_10.contains(2, 6));
        assertFalse(r5_10.contains(9, 12));

        // easy stuff that's clearly in range:
        assertTrue(r5_10.contains(6, 7));

        // test one Range that can fit inside another:
        Range<Integer> big = new Range.Integer(0, 15);
        assertFalse(r5_10.contains(big));
        assertTrue(big.contains(r5_10));

        // test some cases where two ranges are adjacent:
        assertFalse(r5_10.contains(2, 5));
        assertFalse(r5_10.contains(10, 12));

        assertTrue(r5_10.contains(6, 10));
        assertTrue(r5_10.contains(5, 9));
        assertTrue(r5_10.contains(r5_10));
    }

    public void testIntersectsRange() {
        assertIntersects(true, r5_10, new Range.Integer(2,6));
        assertIntersects(true, r5_10, new Range.Integer(2,11));
        assertIntersects(true, r5_10, new Range.Integer(7,14));

        assertIntersects(false, r5_10, new Range.Integer(2,5));
        assertIntersects(false, r5_10, new Range.Integer(10,16));

        assertIntersects(false, r5_10, new Range.Integer(12,14));
        assertIntersects(false, r5_10, new Range.Integer(2,4));

        assertIntersects(true, r5_10, new Range.Integer(5, 6));
        assertIntersects(true, r5_10, new Range.Integer(7, 8));
        assertIntersects(true, r5_10, new Range.Integer(9, 10));

        assertIntersects(false, r5_10, new Range.Integer(4, 5));
        assertIntersects(false, r5_10, new Range.Integer(10, 11));
    }

    /**
     * Confirm whether two ranges should intersect. This checks the value of r1.intersects(r2) and r2.intersects(r1),
     * which should be symmetrically identical.
     */
    private void assertIntersects(boolean expectedValue, Range<Integer> r1, Range<Integer> r2) {
        assertEquals(expectedValue, r1.intersects(r2));
        assertEquals(expectedValue, r2.intersects(r1));
    }
}
