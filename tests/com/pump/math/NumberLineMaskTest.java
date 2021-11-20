package com.pump.math;

import com.pump.util.Range;
import junit.framework.TestCase;

public class NumberLineMaskTest extends TestCase {

    public void testBasics() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertEquals(true, m.isEmpty());

        try {
            m.getMin();
            fail();
        } catch(NumberLineMask.EmptyNumberLineMaskException e) {
            // pass
        }

        try {
            m.getMax();
            fail();
        } catch(NumberLineMask.EmptyNumberLineMaskException e) {
            // pass
        }

        m.addRange(0, 1);
        assertEquals(false, m.isEmpty());

        assertEquals(Integer.valueOf(0), m.getMin());
        assertEquals(Integer.valueOf(1), m.getMax());

        assertEquals(true, m.contains(0));
        assertEquals(false, m.contains(1));

        m.clear();

        assertEquals(true, m.isEmpty());
    }

    public void testAdd_1() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(0,1) );
        assertTrue( m.addRange(0,2) );

        testIntegerMask(m, new Range(0, 2));

        // make sure redundant adds don't hurt anything:

        assertFalse( m.addRange(0,1) );
        testIntegerMask(m, new Range(0, 2));

        assertFalse( m.addRange(1, 2) );
        testIntegerMask(m, new Range(0, 2));

        assertFalse( m.addRange(0, 2) );
        testIntegerMask(m, new Range(0, 2));
    }

    public void testAdd_2() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(0,1) );
        assertTrue( m.addRange(0,3) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_3() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(0,1) );
        assertTrue( m.addRange(1,3) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_4() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(0,1) );
        assertTrue( m.addRange(2,3) );

        testIntegerMask(m, new Range(0, 1), new Range(2, 3));
    }

    public void testAdd_5() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(2, 3) );
        assertTrue( m.addRange(0, 2) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_6() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(2, 3) );
        assertTrue( m.addRange(0, 3) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_7() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(2, 3) );
        assertTrue( m.addRange(0, 1) );

        testIntegerMask(m, new Range(0, 1), new Range(2, 3));
    }

    public void testAdd_8() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(2, 3) );
        assertTrue( m.addRange(0, 5) );

        testIntegerMask(m, new Range(0, 5));
    }

    public void testAdd_9() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(0, 5) );
        assertFalse( m.addRange(2, 3) );

        testIntegerMask(m, new Range(0, 5));
    }

    public void testAdd_10() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(0, 1) );
        assertTrue( m.addRange(2, 3) );
        assertTrue( m.addRange(4, 5) );
        assertTrue( m.addRange(6, 7) );
        assertTrue( m.addRange(3, 4) );

        testIntegerMask(m, new Range(0, 1), new Range(2,5), new Range(6,7));
    }

    public void testAdd_11() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.addRange(0, true, 1, false) );
        assertTrue( m.addRange(1, false, 2, true) );

        testIntegerMask(m, new Range(0, true, 1, false), new Range(1, false, 2, true));

        // this is a silly/fringe case:
        assertTrue( m.addRange(1, false, 1, false) );
        testIntegerMask(m, new Range(0, true, 2, true));
    }

    public void testAdd_12() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue(m.addRange(0, true, 5, true));
        assertTrue(m.addRange(3, false, 7, false));
        testIntegerMask(m, new Range(0, true, 7, false));

        m.clear();
        assertTrue(m.addRange(3, false, 7, false));
        assertTrue(m.addRange(0, true, 5, true));
        testIntegerMask(m, new Range(0, true, 7, false));

        m.clear();
        assertTrue(m.addRange(0, false, 5, false));
        assertTrue(m.addRange(3, true, 7, true));
        testIntegerMask(m, new Range(0, false, 7, true));

        m.clear();
        assertTrue(m.addRange(3, true, 7, true));
        assertTrue(m.addRange(0, false, 5, false));
        testIntegerMask(m, new Range(0, false, 7, true));
    }

    public void testAdd_13() {
        NumberLineMask<Integer> m = new NumberLineMask<>();
        for(boolean minInclusive : new boolean[] { false}) {
            for(boolean maxInclusive : new boolean[] { true}) {
                try {
                    m.clear();
                    assertTrue(m.addRange(5, false, 6, false));
                    assertEquals(false, m.contains(5));
                    assertTrue(m.addRange(5, minInclusive, 5, maxInclusive));
                    assertEquals(true, m.contains(5));

                    m.clear();
                    assertTrue(m.addRange(5, false, 6, false));
                    assertEquals(false, m.contains(6));
                    assertTrue(m.addRange(6, minInclusive, 6, maxInclusive));
                    assertEquals(true, m.contains(6));
                } catch(RuntimeException | Error e) {
                    System.err.println("minInclusive = "+minInclusive);
                    System.err.println("maxInclusive = "+maxInclusive);
                    throw e;
                }
            }
        }
    }

    public void testAdd_14() {
        NumberLineMask<Integer> m = new NumberLineMask<>();
        assertTrue(m.addRange(1, false, 1, false));
        assertTrue(m.addRange(3, false, 3, false));
        assertTrue(m.addRange(5, false, 5, false));

        // a fringe case, but it should be false:
        assertFalse(m.addRange(3, false, 3, false));
    }

    private void testIntegerMask(NumberLineMask<Integer> mask, Range... expectedRanges) {
        Range<Integer>[] actualRanges = mask.getRanges();
        assertEquals(expectedRanges.length, actualRanges.length);
        for(int a = 0; a < expectedRanges.length; a++) {
            assertEquals(expectedRanges[a], actualRanges[a]);
        }
    }
}
