package com.pump.math;

import com.pump.util.Range;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class NumberLineMaskTest extends TestCase {

    public void testBasics() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
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
        assertEquals(true, m.contains(1));

        m.clear();

        assertEquals(true, m.isEmpty());
    }

    public void testAdd_1() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(0,2) );

        testIntegerMask(m, new Range.Integer(0, 2));

        // make sure redundant adds don't hurt anything:

        assertFalse( m.add(0,1) );
        testIntegerMask(m, new Range.Integer(0, 2));

        assertFalse( m.add(1, 2) );
        testIntegerMask(m, new Range.Integer(0, 2));

        assertFalse( m.add(0, 2) );
        testIntegerMask(m, new Range.Integer(0, 2));
    }

    public void testAdd_2() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(0,3) );

        testIntegerMask(m, new Range.Integer(0, 3));
    }

    public void testAdd_3() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(1,3) );

        testIntegerMask(m, new Range.Integer(0, 3));
    }

    public void testAdd_4() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(2,3) );

        testIntegerMask(m, new Range.Integer(0, 1), new Range.Integer(2, 3));
    }

    public void testAdd_5() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 2) );

        testIntegerMask(m, new Range.Integer(0, 3));
    }

    public void testAdd_6() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 3) );

        testIntegerMask(m, new Range.Integer(0, 3));
    }

    public void testAdd_7() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 1) );

        testIntegerMask(m, new Range.Integer(0, 1), new Range.Integer(2, 3));
    }

    public void testAdd_8() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 5) );

        testIntegerMask(m, new Range.Integer(0, 5));
    }

    public void testAdd_9() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(0, 5) );
        assertFalse( m.add(2, 3) );

        testIntegerMask(m, new Range.Integer(0, 5));
    }

    public void testAdd_10() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(0, 1) );
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(4, 5) );
        assertTrue( m.add(6, 7) );
        assertTrue( m.add(3, 4) );

        testIntegerMask(m, new Range.Integer(0, 1), new Range.Integer(2,5), new Range.Integer(6,7));
    }

    public void testAdd_11() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue( m.add(0, 2) );
        assertFalse( m.add(1, 1) );
        testIntegerMask(m, new Range.Integer(0, 2));
    }

    public void testAdd_12() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue(m.add(0, 5));
        assertTrue(m.add(3, 7));
        testIntegerMask(m, new Range.Integer(0, 7));

        m.clear();
        assertTrue(m.add(3, 7));
        assertTrue(m.add(0, 5));
        testIntegerMask(m, new Range.Integer(0, 7));
    }

    public void testAdd_13() {

        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue(m.add(5, 7));
        assertFalse(m.add(5, 5));
        assertFalse(m.add(6, 6));
        assertFalse(m.add(7, 7));
        testIntegerMask(m, new Range.Integer(5, 7));
    }

    public void testAdd_14() {
        NumberLineMask<Integer> m = new NumberLineMask.Integer();
        assertTrue(m.add(1, 1));
        assertTrue(m.add(3, 3));
        assertTrue(m.add(5, 5));

        // a fringe case, but it should be false:
        assertFalse(m.add(3, 3));
    }

    public void testSubtract_1() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        NumberLineMask<Integer> l2 = new NumberLineMask.Integer();

        // test "nothing minus nothing"
        assertFalse(l1.subtract(l2));

        l2.add(0, 100);
        // test "nothing minus something"
        assertFalse(l1.subtract(l2));

        // test "something minus nothing"
        assertFalse(l2.subtract(l1));
    }

    public void testSubtract_2() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.subtract(5, 15));
        assertEquals(new Range.Integer(0, 4), l1.getRanges()[0]);

        assertTrue(l1.contains(4));
        assertFalse(l1.contains(5));
    }

    public void testSubtract_3() {
        // given 4 ranges, remove the middle two
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.add(60, 70));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new Range.Integer(0, 10), l1.getRanges()[0]);
        assertEquals(new Range.Integer(60, 70), l1.getRanges()[1]);
    }

    public void testSubtract_4() {
        // given three ranges, remove the first two
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.add(60, 70));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new Range.Integer(60, 70), l1.getRanges()[0]);
    }

    public void testSubtract_5() {
        // given three ranges, remove the last two
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new Range.Integer(0, 10), l1.getRanges()[0]);
    }

    public void testSubtract_6() {
        // given two ranges: remove both

        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.subtract(15, 55));
        assertTrue(l1.isEmpty());
    }

    public void testSubtract_7() {
        // test subtraction when the subtraction operand is adjacent to an existing range on the right:

        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(20, 30));
        assertTrue(l1.subtract(30, 40));
        assertEquals(1, l1.getRanges().length);
        assertEquals(new Range.Integer(20, 29), l1.getRanges()[0]);
    }

    public void testSubtract_8() {
        // test subtraction when the subtraction operand is adjacent to an existing range on the left:

        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(0, 20));
        assertEquals(new Range.Integer(21, 40), l1.getRanges()[0]);
    }

    public void testSubtract_9() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(10, 30));
        assertEquals(new Range.Integer(31, 40), l1.getRanges()[0]);
    }

    public void testSubtract_10() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(10, 50));
        assertEquals(true, l1.isEmpty());
    }

    public void testSubtract_11() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(30, 50));
        assertEquals(new Range.Integer(20, 29), l1.getRanges()[0]);
    }

    public void testSubtract_12() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        assertTrue(l1.add(0, 15));
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(10, 30));
        assertEquals(new Range.Integer(0, 9), l1.getRanges()[0]);
        assertEquals(new Range.Integer(31, 40), l1.getRanges()[1]);
    }

    public void testSubtract_13() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        l1.add(0, 2);
        l1.add(4, 6);
        l1.add(8, 10);

        NumberLineMask<Integer> l2 = new NumberLineMask.Integer();
        l2.add(0, 1);
        l2.add(9, 10);

        assertTrue(l1.subtract(l2));
        assertEquals(new Range.Integer(2, 2), l1.getRanges()[0]);
        assertEquals(new Range.Integer(4, 6), l1.getRanges()[1]);
        assertEquals(new Range.Integer(8, 8), l1.getRanges()[2]);
    }

    public void testSubtract_14() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        l1.add(0, 10);

        NumberLineMask<Integer> l2 = new NumberLineMask.Integer();
        l2.add(0, 1);

        assertTrue(l1.subtract(l2));
        assertEquals(new Range.Integer(2, 10), l1.getRanges()[0]);
    }

    public void testSubtract_15() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        l1.add(0, 10);

        NumberLineMask<Integer> l2 = new NumberLineMask.Integer();
        l2.add(9, 10);

        assertTrue(l1.subtract(l2));
        assertEquals(new Range.Integer(0, 8), l1.getRanges()[0]);
    }

    public void testClip_1() {
        NumberLineMask<Integer> l1 = new NumberLineMask.Integer();
        l1.add(0,2);
        l1.add(4,6);
        l1.add(8,10);
        l1.clip(1,9);
        assertEquals(3, l1.getRanges().length);
        assertEquals(new Range.Integer(1,2), l1.getRanges()[0]);
        assertEquals(new Range.Integer(4,6), l1.getRanges()[1]);
        assertEquals(new Range.Integer(8,9), l1.getRanges()[2]);
    }

    private void testIntegerMask(NumberLineMask<Integer> mask, Range... expectedRanges) {
        Range<Integer>[] actualRanges = mask.getRanges();
        assertEquals(expectedRanges.length, actualRanges.length);
        for(int a = 0; a < expectedRanges.length; a++) {
            assertEquals(expectedRanges[a], actualRanges[a]);
        }
    }
}
