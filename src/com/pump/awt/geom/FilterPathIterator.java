package com.pump.awt.geom;

import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * This filters the data of an existing PathIterator as each new segment is read.
 */
public abstract class FilterPathIterator implements PathIterator {
    private PathIterator delegate;
    private List<PathSegment> newSegmentsQueue = new LinkedList<>();
    private Point2D.Double last, move;
    private double[] coords = new double[6];

    protected FilterPathIterator(PathIterator delegate) {
        Objects.requireNonNull(delegate);
        this.delegate = delegate;
        populateQueue();
    }
    
    private void populateQueue() {
        if (delegate.isDone())
            return;

        int segType = delegate.currentSegment(coords);
        delegate.next();
        
        List<PathSegment> newSegments = createPathSegments(segType, move, last, coords);
        for (PathSegment ps : newSegments) {
            newSegmentsQueue.add(ps);
            switch (ps.type) {
                case PathIterator.SEG_MOVETO:
                    if (move == null) {
                        move = new Point2D.Double();
                        last = new Point2D.Double();
                    }
                    move.setLocation(coords[0], coords[1]);
                case PathIterator.SEG_LINETO:
                    last.setLocation(coords[0], coords[1]);
                    break;
                case PathIterator.SEG_QUADTO:
                    last.setLocation(coords[2], coords[3]);
                    break;
                case PathIterator.SEG_CUBICTO:
                    last.setLocation(coords[4], coords[5]);
                    break;
                case PathIterator.SEG_CLOSE:
                    move = null;
                    last = null;
                    break;
            }
        }

        if (delegate.isDone()) {
            newSegmentsQueue.addAll(createLastPathSegments(move, last));
        }
    }

    @Override
    public int getWindingRule() {
        return delegate.getWindingRule();
    }

    @Override
    public boolean isDone() {
        return newSegmentsQueue.isEmpty();
    }

    @Override
    public void next() {
        if (!newSegmentsQueue.isEmpty())
            newSegmentsQueue.remove(0);
        if (newSegmentsQueue.isEmpty())
            populateQueue();
    }

    @Override
    public int currentSegment(float[] coords) {
        int returnValue = currentSegment(coords);
        for(int a = 0; a < 6; a++) {
            coords[a] = (float) coords[a];
        }
        return returnValue;
    }

    @Override
    public int currentSegment(double[] coords) {
        if (!newSegmentsQueue.isEmpty()) {
            PathSegment p = newSegmentsQueue.get(0);
            return p.currentSegment(coords);
        }
        // either this iterator is corrupt or the caller is invoking this method after isDone() returned true
        throw new IllegalStateException();
    }

    /**
     * This filters the newest path segment into zero or more PathSegments.
     *
     * @param segType the segment type, such as PathIterator.SEG_MOVETO, PathIterator.SEG_QUADTO, etc.
     * @param move the last known move-to location, or null if there has not been a move-to instruction yet.
     * @param last the edge of the last known segment (line, quad or cubic), or null if this subpath doesn't have
     *             a line, quad or cubic yet.
     * @param coords the incoming coordinates that correspond with segType
     * @return a list of zero or more PathSegments used to filter this incoming instruction.
     */
    protected abstract List<PathSegment> createPathSegments(int segType, Point2D.Double move, Point2D.Double last, double[] coords);

    /**
     * This is called when the delegate PathIterator is finished.
     * @param move the last known move-to location, or null if there has not been a move-to instruction yet.
     * @param last the edge of the last known segment (line, quad or cubic), or null if this subpath doesn't have
     *             a line, quad or cubic yet.
     * @return a list of zero or more PathSegments to apply now that all path data is complete.
     */
    protected abstract List<PathSegment> createLastPathSegments(Point2D.Double move, Point2D.Double last);
}
