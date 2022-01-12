package com.pump.util;

import junit.framework.TestCase;

import java.util.*;

public class ChurnSortedSetTest extends TestCase {
    TreeSet<Double> treeSet = new TreeSet<>();
    ChurnSortedSet<Double> churnSet = new ChurnSortedSet<>();

    {
        for(double d : new double[] {1.0,
                3.0, 4.0,
                6.0, 7.0, 8.0,
                10.0, 11.0, 12.0, 13.0 }) {
            treeSet.add(d);
            churnSet.add(d);
        }
    }

    public void testFloor() {
        for(int a = 0; a<=16; a++) {
            Double v = Double.valueOf(a);
            Double expectedValue = treeSet.floor(v);
            Double actualValue = churnSet.floor(v);
            assertEquals("a = " + a, expectedValue, actualValue);
        }
    }

    public void testCeiling() {
        for(int a = 0; a<=16; a++) {
            Double v = Double.valueOf(a);
            Double expectedValue = treeSet.ceiling(v);
            Double actualValue = churnSet.ceiling(v);
            assertEquals("a = " + a, expectedValue, actualValue);
        }
    }

    public void testLower() {
        for(int a = 0; a<=16; a++) {
            Double v = Double.valueOf(a);
            Double expectedValue = treeSet.lower(v);
            Double actualValue = churnSet.lower(v);
            assertEquals("a = " + a, expectedValue, actualValue);
        }
    }

    public void testHigher() {
        for(int a = 0; a<=16; a++) {
            Double v = Double.valueOf(a);
            Double expectedValue = treeSet.higher(v);
            Double actualValue = churnSet.higher(v);
            assertEquals("a = " + a, expectedValue, actualValue);
        }
    }



    public void testSubSet() {
        for(int a = -1; a<=17; a++) {
            for(int b = a; b<=17; b++) {
                Double ad = Double.valueOf(a);
                Double bd = Double.valueOf(b);

                for(boolean includeFloor : new boolean[] { true, false}) {
                    for(boolean includeCeiling : new boolean[] { true, false}) {
                        SortedSet<Double> treeSubSet = treeSet.subSet(ad, includeFloor, bd, includeCeiling);
                        Collection<Double> churnSubSet = collect(churnSet.subSet(ad, includeFloor, bd, includeCeiling));
                        assertEquals("a = "+a+", b = "+b+", includeFloor = "+includeFloor+", includeCeiling = " + includeCeiling, treeSubSet, churnSubSet);
                    }
                }
            }
        }
    }

    private <T> Collection<T> collect(Iterable<T> iterable) {
        TreeSet returnValue = new TreeSet<>();
        for(T value : iterable) {
            returnValue.add(value);
        }
        return returnValue;
    }

    public void testMutations_1() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.startEdit();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);
        set.clear();
        set.add(7.0);
        set.add(6.0);
        set.finishEdit();

        Double[] actualValue = set.toArray(new Double[] {});
        Double[] expectedValue = new Double[] {6.0, 7.0};
        assertTrue(Arrays.equals(expectedValue, actualValue));
    }

    public void testMutations_2() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.startEdit();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);
        // this forces the ChurnSortedSet to process pending additions
        set.iterator();

        set.clear();
        set.add(7.0);
        set.add(6.0);
        set.finishEdit();

        Double[] actualValue = set.toArray(new Double[] {});
        Double[] expectedValue = new Double[] {6.0, 7.0};
        assertTrue(Arrays.equals(expectedValue, actualValue));
    }

    public void testMutations_3_inEdit() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.startEdit();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);

        Iterator<Double> iter = set.iterator();
        assertEquals(1.0, iter.next());
        assertEquals(2.0, iter.next());
        iter.remove();
        assertEquals(3.0, iter.next());
        iter.remove();
        assertEquals(4.0, iter.next());

        set.finishEdit();

        Double[] actualValue = set.toArray(new Double[] {});
        Double[] expectedValue = new Double[] {1.0, 4.0};
        assertTrue(Arrays.equals(expectedValue, actualValue));
    }

    public void testMutations_3_noEdit() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);

        Iterator<Double> iter = set.iterator();
        assertEquals(1.0, iter.next());
        assertEquals(2.0, iter.next());
        iter.remove();
        assertEquals(3.0, iter.next());
        iter.remove();
        assertEquals(4.0, iter.next());

        Double[] actualValue = set.toArray(new Double[] {});
        Double[] expectedValue = new Double[] {1.0, 4.0};
        assertTrue(Arrays.equals(expectedValue, actualValue));
    }

    public void testMutations_4_inEdit() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.startEdit();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);

        Iterator<Double> iter = set.iterator();
        assertEquals(1.0, iter.next());
        iter.remove();
        assertEquals(2.0, iter.next());
        assertEquals(3.0, iter.next());
        assertEquals(4.0, iter.next());
        iter.remove();

        set.finishEdit();

        Double[] actualValue = set.toArray(new Double[] {});
        Double[] expectedValue = new Double[] {2.0, 3.0};
        assertTrue(Arrays.equals(expectedValue, actualValue));
    }

    public void testMutations_4_noEdit() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);

        Iterator<Double> iter = set.iterator();
        assertEquals(1.0, iter.next());
        iter.remove();
        assertEquals(2.0, iter.next());
        assertEquals(3.0, iter.next());
        assertEquals(4.0, iter.next());
        iter.remove();

        Double[] actualValue = set.toArray(new Double[] {});
        Double[] expectedValue = new Double[] {2.0, 3.0};
        assertTrue(Arrays.equals(expectedValue, actualValue));
    }

    public void testTailSet_inclusive() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);

        Double[] actualValue = collect(set.tailSet(2.0, true)).toArray(new Double[] {});
        Double[] expectedValue = new Double[] {2.0, 3.0, 4.0};

        assertTrue(Arrays.equals(expectedValue, actualValue));
    }

    public void testTailSet_not_inclusive() {
        ChurnSortedSet<Double> set = new ChurnSortedSet<>();
        set.add(1.0);
        set.add(2.0);
        set.add(3.0);
        set.add(4.0);

        Double[] actualValue = collect(set.tailSet(2.0, false)).toArray(new Double[] {});
        Double[] expectedValue = new Double[] {3.0, 4.0};

        assertTrue(Arrays.equals(expectedValue, actualValue));
    }
}
