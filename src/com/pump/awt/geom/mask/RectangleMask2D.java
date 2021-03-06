package com.pump.awt.geom.mask;

import com.pump.awt.geom.RectangularTransform;
import com.pump.math.NumberLineDoubleMask;
import com.pump.util.RangeDouble;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.io.Serial;
import java.util.*;
import java.util.List;

/**
 * This is a composition of double-based java.awt.geom.Rectangle2D.Doubles.
 */
public class RectangleMask2D extends AbstractRectangleMask<Rectangle2D.Double> implements Iterable<Rectangle2D.Double> {

    @Serial
    private static final long serialVersionUID = 1L;

    class MaskIterator implements Iterator<Rectangle2D.Double> {
        Iterator<Row> iter;
        List<Rectangle2D.Double> iteratorValues = new LinkedList<>();
        Row prevRow;
        final int expectedModCount;

        {
            expectedModCount = modCount;
            iter = rows.iterator();
            prevRow = iter.hasNext() ? iter.next() : null;
            updateIteratorValues();
        }

        private void updateIteratorValues() {
            while (iter.hasNext()) {
                Row currentRow = iter.next();

                for (RangeDouble range : prevRow.xMask.getRanges()) {
                    double x = range.min;
                    double y = prevRow.y;
                    double x2 = range.max;
                    double y2 = currentRow.y;
                    Rectangle2D.Double rect = new Rectangle2D.Double(x, y, x2 - x, y2 - y);
                    iteratorValues.add(rect);
                }

                prevRow = currentRow;

                if (!iteratorValues.isEmpty())
                    return;
            }
        }

        @Override
        public boolean hasNext() {
            return !iteratorValues.isEmpty();
        }

        @Override
        public Rectangle2D.Double next() {
            checkForComodification();
            Rectangle2D.Double returnValue = iteratorValues.remove(0);
            updateIteratorValues();
            return returnValue;
        }

        final void checkForComodification() {
            if (modCount != expectedModCount)
                throw new ConcurrentModificationException();
        }
    }

    protected static class Row implements Comparable<Row> {
        double y;
        NumberLineDoubleMask xMask;

        public Row(double y) {
            this.y = y;
        }

        public Row(double y, NumberLineDoubleMask xMask) {
            this.y = y;
            this.xMask = xMask;
        }

        @Override
        public int compareTo(Row o) {
            return Double.compare(y, o.y);
        }
    }

    protected TreeSet<Row> rows = new TreeSet<>();

    protected double[] touchedRows;

    public RectangleMask2D() {
        clear();
    }

    public RectangleMask2D(Rectangle2D r) {
        this(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    public RectangleMask2D(double x, double y, double width, double height) {
        this();
        add(x, y, width, height);
    }

    /**
     * Create a RectangleMask2D that traces a given shape. This may be a little too large especially on the right
     * and bottom edges; it is not guaranteed to be a perfect match.
     *
     * @param shape the shape to create a mask of
     * @param tx the optional AffineTransform to apply to the shape
     * @param maxSegmentArea the maximum area (width * height) of each segment's bounds. The smaller this value
     *                       is the more each segment will be partitioned into subsegments. Finer details lead to
     *                       greater accuracy and a larger data structure.
     */
    public RectangleMask2D(Shape shape, AffineTransform tx, double maxSegmentArea) {
        Objects.requireNonNull(shape);

        suspendAutoCollapseRows();

        // step 1: trace the perimeter/outline of the shape:

        OutlineTracer tracer = new OutlineTracer(shape, tx, maxSegmentArea) {

            @Override
            protected void addUnsortedEdges(double x0, double x1, double y0, double y1) {
                double xMin = Math.min(x0, x1);
                double xMax = Math.max(x0, x1);

                double yMin = Math.min(y0, y1);
                double yMax = Math.max(y0, y1);

                if (xMin == xMax)
                    xMax += Math.ulp(xMax);
                if (yMin == yMax)
                    yMax += Math.ulp(yMax);

                performOperation(Operation.ADD, xMin, yMin, xMax, yMax);
            }
        };
        tracer.run();

        resumeAutoCollapseRows();

        // step 2: flood fill the interior path/paths

        class FloodFill {

            final AffineTransform inverseT;
            Point2D p = new Point2D.Double();

            {
                try {
                    inverseT = tx == null ? null : tx.createInverse();
                } catch(Throwable t) {
                    throw new RuntimeException(t);
                }
            }

            public void run() {
                Row lastRow = null;
                for(Row row : rows) {
                    if (lastRow != null) {
                        fill(lastRow.y, row.y, lastRow.xMask);
                    }

                    lastRow = row;
                }
            }

            NumberLineDoubleMask prevFillMask = null;
            NumberLineDoubleMask prevEmptyMask = null;
            private void fill(double y1, double y2, NumberLineDoubleMask horizMask) {
                double y = (y1 + y2) / 2.0;

                NumberLineDoubleMask currentFillMask = new NumberLineDoubleMask();
                NumberLineDoubleMask currentEmptyMask = new NumberLineDoubleMask();

                if (prevFillMask != null) {
                    // if our unfilled segments intersect the filled/unfilled info from the previous row,
                    // that can inform how we flood-fill without having to call shape#contains(..)
                    RangeDouble[] ranges = horizMask.getRanges();
                    for(int a = 1; a < ranges.length; a++) {
                        double x1 = ranges[a - 1].max;
                        double x2 = ranges[a].min;
                        if (prevFillMask.intersects(x1, x2)) {
                            currentFillMask.add(x1, x2);
                            horizMask.add(x1, x2);
                        }
                        if (prevEmptyMask.intersects(x1, x2)) {
                            currentEmptyMask.add(x1, x2);
                        }
                    }
                }

                RangeDouble[] ranges = horizMask.getRanges();
                for(int a = 1; a < ranges.length; a++) {
                    double x1 = ranges[a-1].max;
                    double x2 = ranges[a].min;

                    // we already figured out this must be an empty zone
                    if (currentEmptyMask.intersects(x1, x2))
                        continue;

                    // ... and [x1,x2) won't be in currentFillMask or horizMask, because the
                    // range [x1, x2) is by definition a gap in those number line masks

                    double x = (x1 + x2) / 2.0;
                    p.setLocation(x, y);
                    if (inverseT != null)
                        inverseT.transform(p, p);

                    // the call to shape.contains(Point2D) is probably our most
                    // expensive call here:

                    if (shape.contains(p)) {
                        currentFillMask.add(x1, x2);
                        horizMask.add(x1, x2);
                    } else {
                        currentEmptyMask.add(x1, x2);
                    }
                }

                prevFillMask = currentFillMask;
                prevEmptyMask = currentEmptyMask;
            }
        }

        new FloodFill().run();
    }

    @Override
    public boolean clear() {
        boolean uninitialized = rows.isEmpty();
        if (!isEmpty() || uninitialized) {
            try {
                rows.clear();
                rows.add(new Row(0.0, new NumberLineDoubleMask()));
            } finally {
                modCount++;
                cachedBounds = null;
            }
            return true;
        }
        return false;
    }

    private void ensureRows(double[] y) {
        Row[] nearestRows = new Row[y.length];
        for(int a = 0; a < y.length; a++) {
            nearestRows[a] = rows.floor(new Row(y[a]));
        }
        for(int a = 0; a < y.length; a++) {
            if (nearestRows[a] == null) {
                Row newRow = new Row(y[a], new NumberLineDoubleMask());
                rows.add(newRow);
            } else if (nearestRows[a].y == y[a]) {
                // intentionally empty
            } else {
                Row newRow = new Row(y[a], new NumberLineDoubleMask(nearestRows[a].xMask));
                rows.add(newRow);
            }
        }
    }

    public boolean add(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.ADD, x, y, x + width, y + height);
    }

    public boolean xor(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.XOR, x, y, x + width, y + height);
    }

    public boolean subtract(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.SUBTRACT, x, y, x + width, y + height);
    }

    public boolean clip(double x, double y, double width, double height) {
        if (width < 0 || height < 0)
            throw new IllegalArgumentException("x = "+x+", y = "+y+", width = "+width+", y = "+height);
        if (width == 0 || height == 0)
            return false;

        return performOperation(Operation.CLIP, x, y, x + width, y + height);
    }

    protected boolean performOperation(Operation op, double x, double y, double x2, double y2) {
        ensureRows(new double[] { y, y2 });

        if (touchedRows == null) {
            touchedRows = new double[]{y, y2};
        } else {
            touchedRows[0] = Math.min(y, touchedRows[0]);
            touchedRows[1] = Math.max(y, touchedRows[1]);
        }

        suspendAutoCollapseRows();

        try {
            boolean returnValue = false;
            for (Row row : rows.tailSet(new Row(y), true)) {
                if (row.y == y2)
                    break;

                boolean opResults = switch (op) {
                    case ADD -> row.xMask.add(x, x2);
                    case SUBTRACT -> row.xMask.subtract(x, x2);
                    case CLIP -> row.xMask.clip(x, x2);
                    case XOR -> row.xMask.xor(x, x2);
                };

                if (opResults)
                    returnValue = true;
            }

            if (op == Operation.CLIP)
                removeRowsAboveAndBelow(y, y2);

            if (returnValue) {
                modCount++;
                cachedBounds = null;
            }

            return returnValue;
        } finally {
            resumeAutoCollapseRows();
        }
    }

    private void removeRowsAboveAndBelow(double y1, double y2) {
        Iterator<Row> iter = rows.iterator();

        NumberLineDoubleMask prevRowMask = new NumberLineDoubleMask();
        while (iter.hasNext()) {
            Row entry = iter.next();
            if (entry.y < y1 || entry.y > y2) {
                iter.remove();
            } else if (entry.y == y2) {
                if (prevRowMask != null && prevRowMask.isEmpty()) {
                    iter.remove();
                } else if (!entry.xMask.isEmpty()) {
                    entry.xMask.clear();
                }
            } else {
                NumberLineDoubleMask currentMask = entry.xMask;
                if (currentMask.equals(prevRowMask)) {
                    iter.remove();
                }
                prevRowMask = currentMask;
            }
        }

        if (!rows.isEmpty() && !rows.last().xMask.isEmpty()) {
            rows.add(new Row(y2, new NumberLineDoubleMask()));
        }
    }

    @Override
    protected Rectangle2D.Double createBounds() {
        if (rows.isEmpty() || (rows.size()==1 && rows.first().xMask.isEmpty()) ) {
            return new Rectangle2D.Double();
        }

        double x1, y1, x2, y2;
        x1 = y1 = x2 = y2 = 0;
        boolean undefined = true;
        for(Row rowEntry : rows) {
            NumberLineDoubleMask row = rowEntry.xMask;
            if (undefined) {
                undefined = false;
                y1 = rowEntry.y;
                x1 = row.getMin();
                x2 = row.getMax();
            }
            if (!row.isEmpty()) {
                x1 = x1 < rowEntry.xMask.getMin() ? x1 : rowEntry.xMask.getMin();
                x2 = x2 > rowEntry.xMask.getMax() ? x2 : rowEntry.xMask.getMax();
            }
            y2 = rowEntry.y;
        }

        return new Rectangle2D.Double(x1, y1, x2 - x1, y2 - y1);
    }

    public boolean contains(double x, double y) {
        Row floorRow = rows.floor(new Row(y));
        if (floorRow == null)
            return false;
        return floorRow.xMask.contains(x);
    }

    public boolean contains(double x, double y, double width,double height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Row floor = rows.floor(new Row(y));
        if (floor == null)
            return false;
        double y2 = y + height;
        double x2 = x + width;
        for (Row entry : rows.tailSet(floor, true)) {
            if (entry.y >= y2)
                return true;

            if (!entry.xMask.contains(x, x2)) {
                return false;
            }
        }
        return true;
    }

    public boolean intersects(double x, double y, double width,double height) {
        if (width < 0)
            throw new IllegalArgumentException("width = "+width);
        if (height < 0)
            throw new IllegalArgumentException("height = "+height);
        if (width == 0 || height == 0)
            return false;

        Row floor = rows.floor(new Row(y));
        Iterator<Row> iter = floor == null ?
                rows.iterator() :
                rows.tailSet(floor, true).iterator();
        double y2 = y + height;
        double x2 = x + width;
        while (iter.hasNext()) {
            Row entry = iter.next();
            if (entry.y >= y2)
                return false;

            if (entry.xMask.intersects(x, x2)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return rows.isEmpty() || rows.first().xMask.isEmpty();
    }

    @Override
    protected Rectangle2D.Double toRectangle() {
        double x1, y1, x2, y2;
        Iterator<Row> iter = rows.iterator();
        if (!iter.hasNext())
            return null;
        Row firstEntry = iter.next();

        y1 = firstEntry.y;
        x1 = firstEntry.xMask.getMin();
        x2 = firstEntry.xMask.getMax();

        if (!iter.hasNext())
            return null;

        Row secondEntry = iter.next();
        if (!secondEntry.xMask.isEmpty())
            return null;
        y2 = secondEntry.y;

        return new Rectangle2D.Double(x1, y1, x2 - x1, y2 - y1);
    }

    /**
     * Return true if this RectangleMask is equivalent to the rectangle provided.
     */
    public boolean isEqual(double x, double y, double width, double height) {
        return isEqual(new Rectangle2D.Double(x, y, width, height));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RectangleMask2D rMask = (RectangleMask2D) o;
        return Objects.equals(rows, rMask.rows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rows);
    }

    @Override
    public Iterator<Rectangle2D.Double> iterator() {
        return new MaskIterator();
    }

    @Override
    public boolean add(Rectangle2D.Double r) {
        return add(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean xor(Rectangle2D.Double r) {
        return xor(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean subtract(Rectangle2D.Double r) {
        return subtract(r.x, r.y, r.width, r.height);
    }

    @Override
    public boolean clip(Rectangle2D.Double r) {
        return clip(r.x, r.y, r.width, r.height);
    }

    @Override
    protected void collapseRows() {
        if (touchedRows == null)
            return;
        Row k1 = rows.floor(new Row(touchedRows[0]));
        Row k2 = rows.ceiling(new Row(touchedRows[1]));

        if (k1 != null) {
            k1 = rows.lower(k1);
        }

        if (k2 != null) {
            Row k3 = rows.higher(k2);
            if (k3 != null)
                k2 = k3;
        }

        Iterator<Row> iter;
        if (k1 == null) {
            iter = rows.iterator();
        } else if (k2 == null) {
            iter = rows.tailSet(k1, true).iterator();
        } else {
            iter = rows.subSet(k1, true, k2, true).iterator();
        }

        Row lowerEntry = k1 == null ? null : rows.lower(k1);
        NumberLineDoubleMask prevRowMask = lowerEntry == null ? new NumberLineDoubleMask() : lowerEntry.xMask;

        while (iter.hasNext()) {
            Row entry = iter.next();
            NumberLineDoubleMask currentMask = entry.xMask;
            if (currentMask.equals(prevRowMask)) {
                iter.remove();
            }
            prevRowMask = currentMask;
        }
    }

    @Override
    public RectangleMask2D clone() {
        RectangleMask2D copy = new RectangleMask2D();
        copy.add(this);
        return copy;
    }

    /**
     * Transform this mask.
     */
    public void transform(RectangularTransform transform) {
        try {
            cachedBounds = null;

            // TODO: we could optimize this further when scaleX and scaleY are positive

            RectangleMask2D newMask = new RectangleMask2D();
            Iterator<Rectangle2D.Double> iter = iterator();
            while (iter.hasNext()) {
                Rectangle2D.Double rect = iter.next();
                transform.transform(rect, rect);
                newMask.add(rect);
            }
            rows.clear();
            rows.addAll(newMask.rows);
        } finally {
            modCount++;
            collapseRows();
        }
    }

    public boolean contains(RectangleMask2D mask) {
        if (isEmpty() || mask.isEmpty())
            return false;

        Iterator<Rectangle2D.Double> iter = mask.iterator();
        while (iter.hasNext()) {
            if (!contains(iter.next()))
                return false;
        }

        return true;
    }

    public boolean intersects(RectangleMask2D mask) {
        if (isEmpty() || mask.isEmpty())
            return false;

        Iterator<Rectangle2D.Double> iter = mask.iterator();
        while (iter.hasNext()) {
            if (intersects(iter.next()))
                return true;
        }

        return false;
    }

    /**
     * Add another mask to this mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean add(RectangleMask2D rhs) {
        if (rhs.isEmpty())
            return false;

        suspendAutoCollapseRows();
        try {
            boolean returnValue = false;
            if (isEmpty()) {
                rows.clear();
                for (Row entry : rhs.rows) {
                    rows.add(new Row(entry.y, new NumberLineDoubleMask(entry.xMask)));
                }
                returnValue = true;
            } else if(isAboveOrBelow(rhs)) {
                for (Row entry : rhs.rows) {
                    rows.add(new Row(entry.y, new NumberLineDoubleMask(entry.xMask)));
                }
                returnValue = true;
            } else {
                double[] rowYs = new double[rhs.rows.size()];
                int i = 0;
                for (Row otherRow : rhs.rows) {
                    rowYs[i++] = otherRow.y;
                }
                ensureRows(rowYs);

                Iterator<Row> myIter = rows.subSet(rhs.rows.first(), true, rhs.rows.last(), true).iterator();
                while (myIter.hasNext()) {
                    Row myRow = myIter.next();
                    Row otherRow = rhs.rows.floor(myRow);
                    if (otherRow != null && myRow.xMask.add(otherRow.xMask))
                        returnValue = true;
                }

                if (touchedRows == null) {
                    touchedRows = new double[] {rhs.rows.first().y, rhs.rows.last().y};
                } else {
                    touchedRows[0] = Math.min(touchedRows[0], rhs.rows.first().y);
                    touchedRows[1] = Math.max(touchedRows[1], rhs.rows.last().y);
                }
            }

            if (returnValue) {
                modCount++;
                cachedBounds = null;
            }

            return returnValue;
        } finally {
            resumeAutoCollapseRows();
        }
    }

    /**
     * Subtract another mask from this mask.
     *
     * @return true if this operation changed this mask.
     */
    public boolean subtract(RectangleMask2D rhs) {
        if (rhs.isEmpty() || isEmpty() || !getBounds2D().intersects(rhs.getBounds2D()))
            return false;

        suspendAutoCollapseRows();
        try {
            boolean returnValue = false;

            double[] rowYs = new double[rhs.rows.size()];
            int i = 0;
            for (Row otherRow : rhs.rows) {
                rowYs[i++] = otherRow.y;
            }
            ensureRows(rowYs);

            Iterator<Row> myIter = rows.subSet(rhs.rows.first(), true, rhs.rows.last(), true).iterator();
            while (myIter.hasNext()) {
                Row myRow = myIter.next();
                Row otherRow = rhs.rows.floor(myRow);
                if (otherRow != null && myRow.xMask.subtract(otherRow.xMask))
                    returnValue = true;
            }

            if (touchedRows == null) {
                touchedRows = new double[] {rhs.rows.first().y, rhs.rows.last().y};
            } else {
                touchedRows[0] = Math.min(touchedRows[0], rhs.rows.first().y);
                touchedRows[1] = Math.max(touchedRows[1], rhs.rows.last().y);
            }

            if (returnValue) {
                modCount++;
                cachedBounds = null;
            }

            return returnValue;
        } finally {
            resumeAutoCollapseRows();
        }
    }

    private boolean isAboveOrBelow(RectangleMask2D other) {
        return rows.last().y < other.rows.first().y || rows.first().y > other.rows.last().y;
    }
}