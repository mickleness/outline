package com.pump.util;

import com.pump.awt.geom.outline.OutlineOperation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Static methods related to lists
 */
public class ListUtils {

    /**
     * Return an Iterator that iterates a list backwards.
     */
    public static <T> Iterator<T> descendingIterator(List<T> list) {
        if (list instanceof LinkedList)
            return ((LinkedList<T>)list).descendingIterator();

        ListIterator<T> listIter = list.listIterator(list.size());

        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return listIter.hasPrevious();
            }

            @Override
            public T next() {
                return listIter.previous();
            }

            @Override
            public void remove() {
                listIter.remove();
            }
        };
    }
}
