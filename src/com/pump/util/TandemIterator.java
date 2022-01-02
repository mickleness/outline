package com.pump.util;

import java.util.*;

public class TandemIterator<T> implements Iterator<List<T>> {

    static class PeekIterator implements Iterator<Object> {

        static final Object UNSTARTED = new Object() {
            @Override
            public String toString() {
                return "** unstarted";
            }
        };
        static final Object FINISHED = new Object() {
            @Override
            public String toString() {
                return "** finished";
            }
        };

        Object current = UNSTARTED;
        Object next;
        Iterator<?> delegate;

        public PeekIterator(Iterator<?> iter) {
            delegate = iter;
            next = UNSTARTED;
            iterate();

            // this was an empty iterator. We didn't transition from UNSTARTED to FINISHED,
            // we were always only ever FINISHED.
            if (next == FINISHED) {
                current = FINISHED;
            }
        }

        private void iterate() {
            current = next;
            if (!delegate.hasNext()) {
                next = FINISHED;
            } else {
                next = delegate.next();
            }
        }

        public Object current() {
            return current;
        }

        public Object peek() {
            return next;
        }

        @Override
        public boolean hasNext() {
            return next != FINISHED;
        }

        @Override
        public Object next() {
            iterate();
            return current();
        }
    }

    final PeekIterator iter1, iter2;
    final Comparator<T> comparator;

    /**
     * This will either be of type T or it will be PeekIterator.UNSTARTED or PeekIterator.FINISHED
     */
    Object cursor = PeekIterator.UNSTARTED;

    public TandemIterator(Iterator<T> iter1, Iterator<T> iter2) {
        this( iter1, iter2, null);
    }

    public TandemIterator(Iterator<T> iter1, Iterator<T> iter2, Comparator<T> comparator) {
        this.iter1 = new PeekIterator(iter1);
        this.iter2 = new PeekIterator(iter2);
        this.comparator = comparator;
    }

    private int compare(Object v1, Object v2) {
        if (v1 == PeekIterator.UNSTARTED) {
            if (v2 == PeekIterator.UNSTARTED) {
                return 0;
            }
            return -1;
        } else if (v2 == PeekIterator.UNSTARTED) {
            return 1;
        }

        if (v1 == PeekIterator.FINISHED) {
            if (v2 == PeekIterator.FINISHED) {
                return 0;
            }
            return 1;
        } else if (v2 == PeekIterator.FINISHED) {
            return -1;
        }

        int returnValue;
        if (comparator != null) {
            returnValue = comparator.compare( (T) v1, (T) v2);
        } else {
            Object c1 = (v1 instanceof Map.Entry) ? ((Map.Entry) v1).getKey() : v1;
            Object c2 = (v2 instanceof Map.Entry) ? ((Map.Entry) v2).getKey() : v2;
            returnValue = ((Comparable) c1).compareTo((Comparable) c2);
        }

        return returnValue;
    }

    @Override
    public boolean hasNext() {
        boolean finished = iter1.peek() == PeekIterator.FINISHED && iter2.peek() == PeekIterator.FINISHED;
        return !finished;
    }

    @Override
    public List<T> next() {
        return next(null);
    }

    public List<T> next(List<T> dest) {
        if (dest == null) {
            dest = new ArrayList<>(2);
        } else {
            dest.clear();
        }

        // we want to iterate the cursor forward...

        Object p1 = iter1.peek();
        Object p2 = iter2.peek();

        int k = compare(p1, p2);

        if (k == 0) {
            cursor = p1;
            dest.add( (T) iter1.next() );
            dest.add( (T) iter2.next() );
        } else if (k < 0) {
            cursor = p1;
            dest.add( (T) iter1.next());

            if (p2 == PeekIterator.FINISHED || iter2.current() == PeekIterator.UNSTARTED) {
                dest.add(null);
            } else {
                dest.add( (T) iter2.current());
            }
        } else {
            cursor = p2;

            if (p1 == PeekIterator.FINISHED || iter1.current() == PeekIterator.UNSTARTED) {
                dest.add(null);
            } else {
                dest.add( (T) iter1.current());
            }

            dest.add( (T) iter2.next() );
        }

        return dest;
    }

    public boolean isIterator1Finished() {
        return iter1.peek() == PeekIterator.FINISHED;
    }

    public boolean isIterator2Finished() {
        return iter2.peek() == PeekIterator.FINISHED;
    }
}
