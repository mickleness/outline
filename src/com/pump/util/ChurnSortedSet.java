package com.pump.util;

import java.lang.reflect.Array;
import java.util.*;

/**
 * TODO: evaluate whether to keep this class or not
 */
public class ChurnSortedSet<T extends Comparable> implements Iterable<T> {

    class EmptyIterator<T> implements Iterator<T> {

        int expectedModCount;

        EmptyIterator(int expectedModCount) {
            this.expectedModCount = expectedModCount;
        }

        @Override
        public boolean hasNext() {
            checkForComodification();
            return false;
        }

        private void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }

        @Override
        public T next() {
            throw new NoSuchElementException();
        }
    }

    class EmptyIterable<T> implements Iterable<T> {

        int expectedModCount;

        EmptyIterable() {
            expectedModCount = modCount;
        }

        @Override
        public Iterator<T> iterator() {
            return new EmptyIterator<>(expectedModCount);
        }
    }

    /**
     * This puts null elements last
     */
    static class NullTailComparator implements Comparator {
        Comparator comparator;

        NullTailComparator(Comparator comparator) {
            this.comparator = comparator;
        }

        @Override
        public int compare(Object o1, Object o2) {
            if (o1 == null && o2 == null)
                return 0;
            if (o2 == null)
                return -1;
            if (o1 == null)
                return 1;

            return comparator.compare(o1, o2);
        }
    }

    /**
     * This assumes the objects being compared implement Comparable.
     */
    private static Comparator COMPARABLE_COMPARATOR = new Comparator() {
        @Override
        public int compare(Object o1, Object o2) {
            return ((Comparable)o1).compareTo(o2);
        }
    };

    ArrayList<T> elements = new ArrayList<>();
    Collection<T> pendingAdditions = new HashSet<>();
    int modCount = 0;

    int editing = 0;

    /**
     * The number of null entries currently in elements
     */
    int nullElements = 0;

    Comparator comparator;

    public ChurnSortedSet() {
        this(COMPARABLE_COMPARATOR);
    }

    public ChurnSortedSet(Comparator comparator) {
        this.comparator = new NullTailComparator(comparator);
    }

    /**
     * This can return true if the argument is a ChurnSortedSet or Collection.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        Iterator<T> iter1, iter2;
        if (obj instanceof ChurnSortedSet) {
            ChurnSortedSet other = (ChurnSortedSet) obj;
            if (size() != other.size())
                return false;
            iter1 = iterator();
            iter2 = other.iterator();
        } else if(obj instanceof Collection) {
            Collection other = (Collection) obj;
            if (size() != other.size())
                return false;
            iter1 = iterator();
            iter2 = other.iterator();
        } else {
            return false;
        }

        while (iter1.hasNext()) {
            Object k1 = iter1.next();
            Object k2 = iter2.next();
            if (!Objects.equals(k1, k2))
                return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        Iterator<T> iter1 = iterator();
        int returnValue = 0;
        while (iter1.hasNext()) {
            Object k1 = iter1.next();
            returnValue = returnValue ^ k1.hashCode();
        }
        return returnValue;
    }

    public T last() {
        resolveAdditions();
        for (int a = elements.size() - 1; a >= 0; a--) {
            T v = elements.get(a);
            if (v != null)
                return v;
        }
        return null;
    }

    public T first() {
        resolveAdditions();
        for (int a = 0; a<elements.size(); a++) {
            T v = elements.get(a);
            if (v != null)
                return v;
        }
        return null;
    }

    public void startEdit() {
        editing++;
    }

    public void finishEdit() {
        editing--;
        if (editing == 0)
            resolveNullElements();
    }

    public void clear() {
        if (size() > 0) {
            pendingAdditions.clear();
            if (editing > 0) {
                for (int a = 0; a < elements.size(); a++) {
                    elements.set(a, null);
                }
                nullElements = elements.size();
            } else {
                elements.clear();
                nullElements = 0;
            }
            modCount++;
        }
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public void add(T row) {
        Objects.requireNonNull(row);

        startEdit();
        try {
            pendingAdditions.add(row);
            modCount++;
        } finally {
            finishEdit();
        }
    }

    private void resolveNullElements() {
        resolveAdditions();

        if (nullElements > 0) {
            // this will constantly copy large segments of the array one unit to the left

            // now if we have several consecutive null elements: we could manually do this faster, but it'll
            // be more work...
            ListIterator<T> iter = elements.listIterator();
            while (iter.hasNext()) {
                T v = iter.next();
                if (v == null) {
                    iter.remove();
                    nullElements--;
                }
            }

            if (nullElements != 0)
                throw new IllegalStateException();
        }
    }

    private void resolveAdditions() {
        if (!pendingAdditions.isEmpty()) {
            int size = pendingAdditions.size();
            if (size == 1) {
                T newElement = (T) pendingAdditions.iterator().next();
                int i = Collections.binarySearch(elements, newElement, comparator);
                if (i >= 0) {
                    elements.set(i, newElement);
                } else {
                    elements.add(-i-1, newElement);
                }
            } else {
                elements.addAll(pendingAdditions);
                Collections.sort(elements, comparator);
            }

            pendingAdditions.clear();

            // our comparator will put all null elements at the end:
            while (nullElements > 0) {
                Object removedElement = elements.remove(elements.size() - 1);
                if (removedElement != null)
                    throw new IllegalStateException("removed elements was expected to be null, but was "+removedElement);
                nullElements--;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        // our iterator can handle null elements, but we have to resolve additions up front
        resolveAdditions();

        return subSet(first(), true, last(), true).iterator();
    }

    static class BinarySearchResults<T> {
        private final int lowerIndex;
        private final T lowerValue;

        private final int upperIndex;
        private final T upperValue;

        private final boolean isExactMatch;

        BinarySearchResults(int lowerIndex, T lowerValue, int upperIndex, T upperValue) {
            this.lowerIndex = lowerIndex;
            this.lowerValue = lowerValue;
            this.upperIndex = upperIndex;
            this.upperValue = upperValue;
            this.isExactMatch = false;
        }

        public BinarySearchResults(int index, T value) {
            this.lowerIndex = index;
            this.lowerValue = value;
            this.upperIndex = index;
            this.upperValue = value;
            this.isExactMatch = true;
        }
    }

    public T floor(T v) {
        BinarySearchResults<T> e = binarySearch(v);
        if (e == null)
            return null;
        return e.lowerValue;
    }

    protected BinarySearchResults<T> binarySearch(T v) {
        if (isEmpty())
            return null;

        resolveAdditions();
        resolveNullElements();

        int lowIndex = 0;
        int highIndex = elements.size()-1;

        T lowValue = elements.get(lowIndex);

        int lowCompareValue = comparator.compare(lowValue, v);

        if (lowCompareValue == 1)
            return new BinarySearchResults<>(-1, null, lowIndex, lowValue);
        if (lowCompareValue == 0)
            return new BinarySearchResults<>(lowIndex, lowValue);

        T highValue = elements.get(highIndex);

        int highCompareValue = comparator.compare(highValue, v);

        if (highCompareValue == 0)
            return new BinarySearchResults<>(highIndex, highValue);
        if (highCompareValue == -1)
            return new BinarySearchResults<>(highIndex, highValue, -1, null);

        while (lowIndex <= highIndex) {
            int midIndex = (lowIndex + highIndex) >>> 1;
            T midValue = elements.get(midIndex);
            int midCompareValue = comparator.compare(midValue, v);

            if (midCompareValue == 0)
                return new BinarySearchResults<>(midIndex, midValue);

            if (midCompareValue < 0) {
                lowIndex = midIndex;
                lowValue = midValue;
                lowCompareValue = midCompareValue;
            } else if (midCompareValue > 0) {
                highIndex = midIndex;
                highValue = midValue;
                highCompareValue = midCompareValue;
            }

            if (highCompareValue == 1 && highIndex == lowIndex + 1 && lowCompareValue == -1) {
                return new BinarySearchResults(lowIndex, lowValue, highIndex, highValue);
            }
        }

        return null;
    }

    public T ceiling(T v) {
        BinarySearchResults<T> e = binarySearch(v);
        if (e == null)
            return null;
        return e.upperValue;
    }

    public T lower(T v) {
        BinarySearchResults<T> e = binarySearch(v);
        if (e == null || e.lowerValue == null)
            return null;
        if (e.isExactMatch) {
            if (e.lowerIndex - 1 < 0)
                return null;
            return elements.get(e.lowerIndex - 1);
        }
        return e.lowerValue;
    }

    public T higher(T v) {
        BinarySearchResults<T> e = binarySearch(v);
        if (e == null || e.upperValue == null)
            return null;
        if (e.isExactMatch) {
            if (e.upperIndex + 1 >= elements.size())
                return null;
            return elements.get(e.upperIndex + 1);
        }
        return e.upperValue;
    }

    public Iterable<T> tailSet(T floor, boolean inclusive) {
        return subSet(floor, inclusive, last(), true);
    }

    public Iterable<T> tailSet(T floor) {
        return subSet(floor, true, last(), true);
    }

    public Iterable<T> subSet(T floor, boolean includeFloor, T ceiling, boolean includeCeiling) {
        if (isEmpty())
            return new EmptyIterable();

        BinarySearchResults floorResults = binarySearch(floor);
        BinarySearchResults ceilingResults = binarySearch(ceiling);

        int firstIndex, lastIndex;

        if (floorResults == null || floorResults.lowerValue == null) {
            firstIndex = 0;
        } else {
            firstIndex = floorResults.lowerIndex;
            if (!floorResults.isExactMatch) {
                firstIndex++;
            } else if (!includeFloor) {
                firstIndex++;
            }
        }

        if (ceilingResults == null || ceilingResults.upperValue == null) {
            lastIndex = elements.size() - 1;
        } else {
            lastIndex = ceilingResults.upperIndex;
            if (!ceilingResults.isExactMatch) {
                lastIndex--;
            } else if (!includeCeiling) {
                lastIndex--;
            }
        }

        if (lastIndex < firstIndex)
            return new EmptyIterable();

        return new ChurnSortedSetIterable(firstIndex, lastIndex, modCount);
    }

    public void addAll(Iterable<T> rows) {
        startEdit();
        try {
            for(T e : rows) {
                Objects.requireNonNull(e);
                pendingAdditions.add(e);
            }
            modCount++;
        } finally {
            finishEdit();
        }
    }

    public int size() {
        return elements.size() - nullElements + pendingAdditions.size();
    }

    public T[] toArray(T[] dest) {
        resolveAdditions();

        if (nullElements == 0) {
            return elements.toArray(dest);
        }

        T[] returnValue;
        int size = size();
        if (size <= dest.length) {
            returnValue = dest;
        } else {
            returnValue = (T[]) Array.newInstance(dest.getClass().getComponentType(), size);
        }

        int i = 0;
        Iterator<T> iter = iterator();
        while (iter.hasNext()) {
            T element = iter.next();
            returnValue[i++] = element;
        }
        return returnValue;
    }

    class ChurnSortedSetIterable<T> implements Iterable<T> {
        int startIndex, endIndex, expectedModCount;

        public ChurnSortedSetIterable(int startIndex, int endIndex, int expectedModCount) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.expectedModCount = expectedModCount;
        }

        @Override
        public Iterator<T> iterator() {
            return new ChurnSortedSetIterator(startIndex, endIndex, expectedModCount);
        }
    }

    class ChurnSortedSetIterator<T> implements Iterator<T> {
        int startIndex, endIndex, expectedModCount;
        int currentIndex, prevIndex;
        T currentValue;

        ChurnSortedSetIterator(int startIndex, int endIndex, int expectedModCount) {
            this.startIndex = startIndex;
            this.endIndex = endIndex;
            this.expectedModCount = expectedModCount;

            checkForComodification();

            currentValue = (T) elements.get(startIndex);
            currentIndex = startIndex;
            prevIndex = -1;
        }

        private void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }

        private void queueNext() {
            prevIndex = currentIndex;
            while (true) {
                currentIndex++;
                if (currentIndex > endIndex) {
                    currentValue = null;
                    return;
                }
                currentValue = (T) elements.get(currentIndex);
                if (currentValue != null)
                    return;
            }
        }

        @Override
        public boolean hasNext() {
            return currentValue != null;
        }

        @Override
        public T next() {
            checkForComodification();

            T returnValue = currentValue;
            queueNext();
            return returnValue;
        }

        @Override
        public void remove() {
            checkForComodification();

            elements.set(prevIndex, null);
            nullElements++;
        }
    }
}