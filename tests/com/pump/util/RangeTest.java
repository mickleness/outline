package com.pump.util;

import junit.framework.TestCase;

import java.util.TreeSet;

public class RangeTest extends TestCase {

    Range<Integer> r5i_10i = new Range<>(5, true, 10, true);
    Range<Integer> r5e_10i = new Range<>(5, false, 10, true);
    Range<Integer> r5i_10e = new Range<>(5, true, 10, false);
    Range<Integer> r5e_10e = new Range<>(5, false, 10, false);

    public void testToString() {
        assertEquals("[5,10]", r5i_10i.toString());
        assertEquals("(5,10]", r5e_10i.toString());
        assertEquals("[5,10)", r5i_10e.toString());
        assertEquals("(5,10)", r5e_10e.toString());
    }

    public void testContainsElement() {
        assertFalse(r5i_10i.contains(4));
        assertTrue(r5i_10i.contains(5));
        assertTrue(r5i_10i.contains(7));
        assertTrue(r5i_10i.contains(10));
        assertFalse(r5i_10i.contains(11));

        assertFalse(r5e_10i.contains(4));
        assertFalse(r5e_10i.contains(5));
        assertTrue(r5e_10i.contains(7));
        assertTrue(r5e_10i.contains(10));
        assertFalse(r5e_10i.contains(11));

        assertFalse(r5i_10e.contains(4));
        assertTrue(r5i_10e.contains(5));
        assertTrue(r5i_10e.contains(7));
        assertFalse(r5i_10e.contains(10));
        assertFalse(r5i_10e.contains(11));

        assertFalse(r5e_10e.contains(4));
        assertFalse(r5e_10e.contains(5));
        assertTrue(r5e_10e.contains(7));
        assertFalse(r5e_10e.contains(10));
        assertFalse(r5e_10e.contains(11));
    }

    public void testContainsRange() {
        // easy stuff that's clearly strays out of range:
        assertFalse(r5i_10i.contains(new Range<Integer>(2, false, 6, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(2, false, 6, false)));
        assertFalse(r5i_10i.contains(new Range<Integer>(2, true, 6, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(2, true, 6, false)));
        assertFalse(r5i_10i.contains(new Range<Integer>(9, true, 12, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(9, true, 12, false)));
        assertFalse(r5i_10i.contains(new Range<Integer>(9, false, 12, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(9, false, 12, false)));

        // easy stuff that's clearly in range:
        assertTrue(r5i_10i.contains(new Range<Integer>(6, false, 7, false)));
        assertTrue(r5i_10i.contains(new Range<Integer>(6, false, 7, true)));
        assertTrue(r5i_10i.contains(new Range<Integer>(6, true, 7, false)));
        assertTrue(r5i_10i.contains(new Range<Integer>(6, true, 7, true)));

        // test one Range that can fit inside another:
        Range<Integer> big = new Range<Integer>(0, true, 15, true);
        assertFalse(r5i_10i.contains(big));
        assertTrue(big.contains(r5i_10i));
        assertTrue(big.contains(r5e_10i));
        assertTrue(big.contains(r5i_10e));
        assertTrue(big.contains(r5e_10e));

        // test some cases where two ranges are adjacent but they butt into each other:
        assertFalse(r5i_10i.contains(new Range<Integer>(2, false, 5, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(2, false, 5, false)));
        assertFalse(r5i_10i.contains(new Range<Integer>(2, true, 5, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(2, true, 5, false)));

        assertFalse(r5i_10i.contains(new Range<Integer>(10, false, 12, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(10, false, 12, false)));
        assertFalse(r5i_10i.contains(new Range<Integer>(10, true, 12, true)));
        assertFalse(r5i_10i.contains(new Range<Integer>(10, true, 12, false)));

        // test that the inclusive endpoints (span1) envelopes the exclusive endpoints:
        assertTrue(r5i_10i.contains(r5i_10i));
        assertTrue(r5i_10i.contains(r5e_10i));
        assertTrue(r5i_10i.contains(r5i_10e));
        assertTrue(r5i_10i.contains(r5e_10e));

        // ... and confirm the exclusive endpoints (span4) does NOT envelope inclusive endpoints:
        assertFalse(r5e_10e.contains(r5i_10i));
        assertFalse(r5e_10e.contains(r5i_10i));
        assertFalse(r5e_10e.contains(r5i_10i));
        assertTrue(r5e_10e.contains(r5e_10e));

        assertTrue(r5i_10i.contains(new Range<Integer>(6, false, 10, false)));
        assertTrue(r5i_10i.contains(new Range<Integer>(6, false, 10, true)));
        assertTrue(r5i_10i.contains(new Range<Integer>(6, true, 10, false)));
        assertTrue(r5i_10i.contains(new Range<Integer>(6, true, 10, true)));

        assertTrue(r5i_10i.contains(new Range<Integer>(5, false, 9, false)));
        assertTrue(r5i_10i.contains(new Range<Integer>(5, false, 9, true)));
        assertTrue(r5i_10i.contains(new Range<Integer>(5, true, 9, false)));
        assertTrue(r5i_10i.contains(new Range<Integer>(5, true, 9, true)));

        assertTrue(r5e_10e.contains(new Range<Integer>(6, false, 10, false)));
        assertFalse(r5e_10e.contains(new Range<Integer>(6, false, 10, true)));
        assertTrue(r5e_10e.contains(new Range<Integer>(6, true, 10, false)));
        assertFalse(r5e_10e.contains(new Range<Integer>(6, true, 10, true)));

        assertTrue(r5e_10e.contains(new Range<Integer>(5, false, 9, false)));
        assertTrue(r5e_10e.contains(new Range<Integer>(5, false, 9, true)));
        assertFalse(r5e_10e.contains(new Range<Integer>(5, true, 9, false)));
        assertFalse(r5e_10e.contains(new Range<Integer>(5, true, 9, true)));
    }

    public void testIntersectsRange() {
        // a few special cases where the boundaries are adjacent and the inclusivity/exclusivity matters:
        assertIntersects(false, r5i_10i, new Range<Integer>(2,true,5,false));
        assertIntersects(true, r5i_10i, new Range<Integer>(2,true,5,true));
        assertIntersects(false, r5e_10i, new Range<Integer>(2,true,5,true));
        assertIntersects(false, r5i_10i, new Range<Integer>(10,false,16,true));
        assertIntersects(true, r5i_10i, new Range<Integer>(10,true,16,true));

        // more obvious intersection cases where inclusivity/exclusivity is irrelevant:
        boolean[] booleans = new boolean[] { true, false};
        for(boolean minInclusive : booleans) {
            for(boolean maxInclusive : booleans) {
                assertIntersects(true, r5i_10i, new Range<Integer>(2,minInclusive,6,maxInclusive));
                assertIntersects(true, r5i_10i, new Range<Integer>(2,minInclusive,11,maxInclusive));
                assertIntersects(true, r5i_10i, new Range<Integer>(7,minInclusive,14,maxInclusive));

                assertIntersects(false, r5i_10i, new Range<Integer>(12,minInclusive,14,maxInclusive));
                assertIntersects(false, r5i_10i, new Range<Integer>(2,minInclusive,4,maxInclusive));
            }
        }
    }

    /**
     * Confirm whether two ranges should intersect. This checks the value of r1.intersects(r2) and r2.intersects(r1),
     * which should be symmetrically identical.
     */
    private void assertIntersects(boolean expectedValue, Range<Integer> r1, Range<Integer> r2) {
        assertEquals(expectedValue, r1.intersects(r2));
        assertEquals(expectedValue, r2.intersects(r1));
    }

    public void testContains_edgeOfExclusiveBounds() {
        Range<Integer> r = new Range(3, false, 5, false);

        assertEquals(false, r.contains(3));
        assertEquals(false, r.contains(5));

        assertEquals(false, r.contains(3, false, 3, false));
        assertEquals(false, r.contains(5, false, 5, false));
    }

    public void testIntersects_edgeOfExclusiveBounds() {
        Range<Integer> r = new Range<>(3, false, 5, false);

        assertEquals(false, r.intersects(1, true, 3, false));
        assertEquals(false, r.intersects(5, false, 8, true));

        assertEquals(false, r.intersects(3, false, 3, false));
        assertEquals(false, r.intersects(5, false, 5, false));

        r = new Range<>(3, true, 5, true);

        assertEquals(true, r.intersects(3, false, 3, false));
        assertEquals(true, r.intersects(5, false, 5, false));

        assertEquals(true, r.intersects(3, true, 3, true));
        assertEquals(true, r.intersects(5, true, 5, true));
    }
}
