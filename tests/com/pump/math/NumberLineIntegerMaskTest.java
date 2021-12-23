package com.pump.math;

import com.pump.util.Range;
import com.pump.util.RangeInteger;
import junit.framework.TestCase;

public class NumberLineIntegerMaskTest extends TestCase {

    public void testBasics() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue(m.isEmpty());

        try {
            m.getMin();
            fail();
        } catch(EmptyNumberLineMaskException e) {
            // pass
        }

        try {
            m.getMax();
            fail();
        } catch(EmptyNumberLineMaskException e) {
            // pass
        }

        m.add(0, 1);
        assertFalse(m.isEmpty());

        assertEquals(0, m.getMin());
        assertEquals(1, m.getMax());

        assertTrue(m.contains(0));
        assertFalse(m.contains(1));

        m.clear();

        assertTrue(m.isEmpty());
    }

    public void testAdd_1() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(0,2) );

        testIntegerMask(m, new RangeInteger(0, 2));

        // make sure redundant adds don't hurt anything:

        assertFalse( m.add(0,1) );
        testIntegerMask(m, new RangeInteger(0, 2));

        assertFalse( m.add(1, 2) );
        testIntegerMask(m, new RangeInteger(0, 2));

        assertFalse( m.add(0, 2) );
        testIntegerMask(m, new RangeInteger(0, 2));
    }

    public void testAdd_2() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(0,3) );

        testIntegerMask(m, new RangeInteger(0, 3));
    }

    public void testAdd_3() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(1,3) );

        testIntegerMask(m, new RangeInteger(0, 3));
    }

    public void testAdd_4() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(0,1) );
        assertTrue( m.add(2,3) );

        testIntegerMask(m, new RangeInteger(0, 1), new RangeInteger(2, 3));
    }

    public void testAdd_5() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 2) );

        testIntegerMask(m, new RangeInteger(0, 3));
    }

    public void testAdd_6() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 3) );

        testIntegerMask(m, new RangeInteger(0, 3));
    }

    public void testAdd_7() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 1) );

        testIntegerMask(m, new RangeInteger(0, 1), new RangeInteger(2, 3));
    }

    public void testAdd_8() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(0, 5) );

        testIntegerMask(m, new RangeInteger(0, 5));
    }

    public void testAdd_9() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(0, 5) );
        assertFalse( m.add(2, 3) );

        testIntegerMask(m, new RangeInteger(0, 5));
    }

    public void testAdd_10() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(0, 1) );
        assertTrue( m.add(2, 3) );
        assertTrue( m.add(4, 5) );
        assertTrue( m.add(6, 7) );
        assertTrue( m.add(3, 4) );

        testIntegerMask(m, new RangeInteger(0, 1), new RangeInteger(2, 5), new RangeInteger(6, 7));
    }

    public void testAdd_11() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue( m.add(0, 2) );
        assertFalse( m.add(1, 1) );
        testIntegerMask(m, new RangeInteger(0, 2));
    }

    public void testAdd_12() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue(m.add(0, 5));
        assertTrue(m.add(3, 7));
        testIntegerMask(m, new RangeInteger(0, 7));

        m.clear();
        assertTrue(m.add(3, 7));
        assertTrue(m.add(0, 5));
        testIntegerMask(m, new RangeInteger(0, 7));
    }

    public void testAdd_13() {

        NumberLineIntegerMask m = new NumberLineIntegerMask();
        assertTrue(m.add(5, 7));
        assertFalse(m.add(5, 5));
        assertFalse(m.add(6, 6));
        assertFalse(m.add(7, 7));
        testIntegerMask(m, new RangeInteger(5, 7));
    }

    public void testAdd_14() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        try {
            assertTrue(m.add(1, 1));
            fail();
        } catch(IllegalArgumentException e) {
            // pass
        }

        assertFalse(m.contains(1));
    }

    public void testSubtract_1() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        NumberLineIntegerMask l2 = new NumberLineIntegerMask();

        // test "nothing minus nothing"
        assertFalse(l1.subtract(l2));

        l2.add(0, 100);
        // test "nothing minus something"
        assertFalse(l1.subtract(l2));

        // test "something minus nothing"
        assertFalse(l2.subtract(l1));
    }

    public void testSubtract_2() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.subtract(5, 15));
        assertEquals(new RangeInteger(0, 5), l1.getRanges()[0]);

        assertTrue(l1.contains(4));
        assertFalse(l1.contains(5));
    }

    public void testSubtract_3() {
        // given 4 ranges, remove the middle two
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.add(60, 70));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new RangeInteger(0, 10), l1.getRanges()[0]);
        assertEquals(new RangeInteger(60, 70), l1.getRanges()[1]);
    }

    public void testSubtract_4() {
        // given three ranges, remove the first two
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.add(60, 70));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new RangeInteger(60, 70), l1.getRanges()[0]);
    }

    public void testSubtract_5() {
        // given three ranges, remove the last two
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(0, 10));
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.subtract(15, 55));
        assertEquals(new RangeInteger(0, 10), l1.getRanges()[0]);
    }

    public void testSubtract_6() {
        // given two ranges: remove both

        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(20, 30));
        assertTrue(l1.add(40, 50));
        assertTrue(l1.subtract(15, 55));
        assertTrue(l1.isEmpty());
    }

    public void testSubtract_7() {
        // test subtraction when the subtraction operand is adjacent to an existing range on the right:

        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(20, 30));
        assertFalse(l1.subtract(30, 40));
        assertEquals(1, l1.getRanges().length);
        assertEquals(new RangeInteger(20, 30), l1.getRanges()[0]);
    }

    public void testSubtract_8() {
        // test subtraction when the subtraction operand is adjacent to an existing range on the left:

        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(20, 40));
        assertFalse(l1.subtract(0, 20));
        assertEquals(new RangeInteger(20, 40), l1.getRanges()[0]);

        l1.clear();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(0, 21));
        assertEquals(new RangeInteger(21, 40), l1.getRanges()[0]);
    }

    public void testSubtract_9() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(10, 30));
        assertEquals(new RangeInteger(30, 40), l1.getRanges()[0]);
    }

    public void testSubtract_10() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(10, 50));
        assertTrue(l1.isEmpty());
    }

    public void testSubtract_11() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(30, 50));
        assertEquals(new RangeInteger(20, 30), l1.getRanges()[0]);
    }

    public void testSubtract_12() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        assertTrue(l1.add(0, 15));
        assertTrue(l1.add(20, 40));
        assertTrue(l1.subtract(10, 30));
        assertEquals(new RangeInteger(0, 10), l1.getRanges()[0]);
        assertEquals(new RangeInteger(30, 40), l1.getRanges()[1]);
    }

    public void testSubtract_13() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        l1.add(0, 2);
        l1.add(4, 6);
        l1.add(8, 10);

        NumberLineIntegerMask l2 = new NumberLineIntegerMask();
        l2.add(0, 1);
        l2.add(9, 10);

        assertTrue(l1.subtract(l2));
        assertEquals(new RangeInteger(1, 2), l1.getRanges()[0]);
        assertEquals(new RangeInteger(4, 6), l1.getRanges()[1]);
        assertEquals(new RangeInteger(8, 9), l1.getRanges()[2]);
    }

    public void testSubtract_14() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        l1.add(0, 10);

        NumberLineIntegerMask l2 = new NumberLineIntegerMask();
        l2.add(0, 1);

        assertTrue(l1.subtract(l2));
        assertEquals(new RangeInteger(1, 10), l1.getRanges()[0]);
    }

    public void testSubtract_15() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        l1.add(0, 10);

        NumberLineIntegerMask l2 = new NumberLineIntegerMask();
        l2.add(9, 10);

        assertTrue(l1.subtract(l2));
        assertEquals(new RangeInteger(0, 9), l1.getRanges()[0]);
    }

    public void testClip_1() {
        NumberLineIntegerMask l1 = new NumberLineIntegerMask();
        l1.add(0,2);
        l1.add(4,6);
        l1.add(8,10);
        l1.clip(1,9);
        assertEquals(3, l1.getRanges().length);
        assertEquals(new RangeInteger(1, 2), l1.getRanges()[0]);
        assertEquals(new RangeInteger(4, 6), l1.getRanges()[1]);
        assertEquals(new RangeInteger(8, 9), l1.getRanges()[2]);
    }

    /**
     * Test {@link NumberLineIntegerMask#clip(NumberLineIntegerMask)} for empty masks
     */
    public void testClip_2() {
        NumberLineIntegerMask n = new NumberLineIntegerMask();
        assertFalse(n.clip(n));

        NumberLineIntegerMask n2 = new NumberLineIntegerMask();
        assertFalse(n.clip(n2));

        n.add(0, 100);
        assertTrue(n.clip(n2));

        n.add(0, 100);
        assertFalse(n2.clip(n));
    }

    @SafeVarargs
    private void testIntegerMask(NumberLineIntegerMask mask, RangeInteger... expectedRanges) {
        RangeInteger[] actualRanges = mask.getRanges();
        assertEquals(expectedRanges.length, actualRanges.length);
        for(int a = 0; a < expectedRanges.length; a++) {
            assertEquals(expectedRanges[a], actualRanges[a]);
        }
    }

    public void testIntersects() {
        NumberLineIntegerMask m = new NumberLineIntegerMask();
        m.add(0, 3);
        m.add(6, 9);
        m.add(12, 15);

        for(int x1 = -5; x1 < 20; x1++) {
            for(int x2 = x1 + 1; x2 < 20; x2++) {
                boolean expectedValue = false;
                for(RangeInteger range : m.getRanges()) {
                    if (range.intersects(x1, x2) )
                        expectedValue = true;
                }
                assertEquals(expectedValue, m.intersects(x1, x2));
            }
        }
    }
}
