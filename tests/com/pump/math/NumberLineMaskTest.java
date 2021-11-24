package com.pump.math;

import com.pump.util.Range;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

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

        m.add(0, 1);
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
        assertTrue( m.add(0,1) );
        assertTrue( m.add(0,2) );

        testIntegerMask(m, new Range(0, 2));

        // make sure redundant adds don't hurt anything:

        assertFalse( m.add(0,1) );
        testIntegerMask(m, new Range(0, 2));

        assertFalse( m.add(1, 2) );
        testIntegerMask(m, new Range(0, 2));

        assertFalse( m.add(0, 2) );
        testIntegerMask(m, new Range(0, 2));
    }

    public void testAdd_2() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(0,3) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_3() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(1,3) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_4() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(2,3) );

        testIntegerMask(m, new Range(0, 1), new Range(2, 3));
    }

    public void testAdd_5() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 2) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_6() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 3) );

        testIntegerMask(m, new Range(0, 3));
    }

    public void testAdd_7() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 1) );

        testIntegerMask(m, new Range(0, 1), new Range(2, 3));
    }

    public void testAdd_8() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 5) );

        testIntegerMask(m, new Range(0, 5));
    }

    public void testAdd_9() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(0, 5) );
        assertFalse( m.add(2, 3) );

        testIntegerMask(m, new Range(0, 5));
    }

    public void testAdd_10() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(0, 1) );
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(4, 5) );
        assertTrue( m.add(6, 7) );
        assertTrue( m.add(3, 4) );

        testIntegerMask(m, new Range(0, 1), new Range(2,5), new Range(6,7));
    }

    public void testAdd_11() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue( m.add(0, true, 1, false) );
        assertTrue( m.add(1, false, 2, true) );

        testIntegerMask(m, new Range(0, true, 1, false), new Range(1, false, 2, true));

        // this is a silly/fringe case:
        assertTrue( m.add(1, false, 1, false) );
        testIntegerMask(m, new Range(0, true, 2, true));
    }

    public void testAdd_12() {
        NumberLineMask<Integer> m = new NumberLineMask<Integer>();
        assertTrue(m.add(0, true, 5, true));
        assertTrue(m.add(3, false, 7, false));
        testIntegerMask(m, new Range(0, true, 7, false));

        m.clear();
        assertTrue(m.add(3, false, 7, false));
        assertTrue(m.add(0, true, 5, true));
        testIntegerMask(m, new Range(0, true, 7, false));

        m.clear();
        assertTrue(m.add(0, false, 5, false));
        assertTrue(m.add(3, true, 7, true));
        testIntegerMask(m, new Range(0, false, 7, true));

        m.clear();
        assertTrue(m.add(3, true, 7, true));
        assertTrue(m.add(0, false, 5, false));
        testIntegerMask(m, new Range(0, false, 7, true));
    }

    public void testAdd_13() {
        NumberLineMask<Integer> m = new NumberLineMask<>();
        for(boolean minInclusive : new boolean[] { false}) {
            for(boolean maxInclusive : new boolean[] { true}) {
                try {
                    m.clear();
                    assertTrue(m.add(5, false, 6, false));
                    assertEquals(false, m.contains(5));
                    assertTrue(m.add(5, minInclusive, 5, maxInclusive));
                    assertEquals(true, m.contains(5));

                    m.clear();
                    assertTrue(m.add(5, false, 6, false));
                    assertEquals(false, m.contains(6));
                    assertTrue(m.add(6, minInclusive, 6, maxInclusive));
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
        assertTrue(m.add(1, false, 1, false));
        assertTrue(m.add(3, false, 3, false));
        assertTrue(m.add(5, false, 5, false));

        // a fringe case, but it should be false:
        assertFalse(m.add(3, false, 3, false));
    }

    public void testSubtract_1() {
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        NumberLineMask<Integer> l2 = new NumberLineMask<>();

        // test "nothing minus nothing"
        assertFalse(l1.subtract(l2));

        l2.add(0, 100);
        // test "nothing minus something"
        assertFalse(l1.subtract(l2));

        // test "something minus nothing"
        assertFalse(l2.subtract(l1));
    }

    public void testSubtract_2() {
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.subtract(5, 15));
        assertEquals(new Range<Integer>(0, true, 5, false), l1.getRanges()[0]);

        assertTrue(l1.contains(4));
        assertFalse(l1.contains(5));
    }

    public void testSubtract_3() {
        // given 4 ranges, remove the middle two
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.add(60, 70));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new Range<Integer>(0, true, 10, false), l1.getRanges()[0]);
        assertEquals(new Range<Integer>(60, true, 70, false), l1.getRanges()[1]);
    }

    public void testSubtract_4() {
        // given three ranges, remove the first two
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.add(60, 70));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new Range<Integer>(60, true, 70, false), l1.getRanges()[0]);
    }

    public void testSubtract_5() {
        // given three ranges, remove the last two
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new Range<Integer>(0, true, 10, false), l1.getRanges()[0]);
    }

    public void testSubtract_6() {
        // given two ranges: remove both

        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.subtract(15, 55));
    }

    public void testSubtract_7() {
        // test subtraction when the subtraction operand is adjacent to an existing range on the right:

        // here the right edge of range is inclusive
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, true, 30, true));
        assertTrue(l1.subtract(30, true, 40, true));
        assertEquals(new Range<Integer>(20, true, 30, false), l1.getRanges()[0]);

        // here the right edge of range is exclusive
        l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, true, 30, false));
        assertFalse(l1.subtract(30, true, 40, true));
        assertEquals(new Range<Integer>(20, true, 30, false), l1.getRanges()[0]);

        // now repeat, but switch so the subtraction operand's left edge is NOT inclusive:
        l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, true, 30, true));
        assertFalse(l1.subtract(30, false, 40, true));
        assertEquals(new Range<Integer>(20, true, 30, true), l1.getRanges()[0]);

        // here the right edge of range is exclusive
        l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, true, 30, false));
        assertFalse(l1.subtract(30, false, 40, true));
        assertEquals(new Range<Integer>(20, true, 30, false), l1.getRanges()[0]);
    }


    public void testSubtract_8() {
        // test subtraction when the subtraction operand is adjacent to an existing range on the left:

        // here the left edge of range is inclusive
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, true, 40, true));
        assertTrue(l1.subtract(0, true, 20, true));
        assertEquals(new Range<Integer>(20, false, 40, true), l1.getRanges()[0]);

        // here the left edge of range is exclusive
        l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, false, 40, false));
        assertFalse(l1.subtract(0, true, 20, true));
        assertEquals(new Range<Integer>(20, false, 40, false), l1.getRanges()[0]);

        // now repeat, but switch so the subtraction operand's right edge is NOT inclusive:
        l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, true, 40, true));
        assertFalse(l1.subtract(0, false, 20, false));
        assertEquals(new Range<Integer>(20, true, 40, true), l1.getRanges()[0]);

        // here the right edge of range is exclusive
        l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, false, 40, false));
        assertFalse(l1.subtract(0, false, 20, false));
        assertEquals(new Range<Integer>(20, false, 40, false), l1.getRanges()[0]);
    }

    public void testSubtract_9() {
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(20, true, 40, true));
        assertTrue(l1.subtract(10, true, 30, true));
        assertEquals(new Range<Integer>(30, false, 40, true), l1.getRanges()[0]);
    }

    public void testSubtract_10() {
        NumberLineMask<Integer> l1 = new NumberLineMask<>();
        assertTrue(l1.add(0, true, 15, true));
        assertTrue(l1.add(20, true, 40, true));
        assertTrue(l1.subtract(10, true, 30, true));
        assertEquals(new Range<Integer>(0, true, 10, false), l1.getRanges()[0]);
        assertEquals(new Range<Integer>(30, false, 40, true), l1.getRanges()[1]);
    }

    private void testIntegerMask(NumberLineMask<Integer> mask, Range... expectedRanges) {
        Range<Integer>[] actualRanges = mask.getRanges();
        assertEquals(expectedRanges.length, actualRanges.length);
        for(int a = 0; a < expectedRanges.length; a++) {
            assertEquals(expectedRanges[a], actualRanges[a]);
        }
    }
}
