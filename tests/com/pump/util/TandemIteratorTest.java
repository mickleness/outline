package com.pump.util;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class TandemIteratorTest extends TestCase {

    public void testIterator() {
        for(int a = 0; a<0xff; a++) {
            TreeSet<Integer> setA = createSet(a);
            for(int b = 0; b<0xff; b++) {
                TreeSet<Integer> setB = createSet(b);

                TreeSet<Integer> combo = new TreeSet<>();
                combo.addAll(setA);
                combo.addAll(setB);

                List<List<Integer>> expectedValues = new LinkedList<>();
                for(Integer i : combo) {
                    List<Integer> v = new ArrayList<>(2);
                    if (setA.isEmpty() || i.compareTo(setA.first()) < 0 || i.compareTo(setA.last()) > 0) {
                        v.add(null);
                    } else {
                        v.add(setA.floor(i));
                    }

                    if (setB.isEmpty() || i.compareTo(setB.first()) < 0 || i.compareTo(setB.last()) > 0) {
                        v.add(null);
                    } else {
                        v.add(setB.floor(i));
                    }
                    expectedValues.add(v);
                }


//                System.out.println("----- a = "+a+", b = "+b);
//                System.out.println("setA: "+setA);
//                System.out.println("setB: "+setB);

                List<List<Integer>> actualValues = new LinkedList<>();
                TandemIterator<Integer> iter = new TandemIterator(setA.iterator(), setB.iterator());
                while (iter.hasNext()) {
                    actualValues.add(iter.next());
                }

//                for(Object k : expectedValues) {
//                    System.out.println("\t"+k);
//                }

                assertEquals("setA: "+setA+"\nsetB: "+setB, expectedValues, actualValues);
            }
        }
    }

    private TreeSet<Integer> createSet(int a) {
        String str = Integer.toBinaryString(a);
        while (str.length() < 8)
            str = "0" + str;
        TreeSet<Integer> returnValue = new TreeSet<>();
        for(int b = 0; b<str.length(); b++) {
            if (str.charAt(b) == '1') {
                returnValue.add(b);
            }
        }
        return returnValue;
    }

}
