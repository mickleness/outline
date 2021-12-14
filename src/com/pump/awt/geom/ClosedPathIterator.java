package com.pump.awt.geom;

import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * This PathIterator closes every subpath. This may involve adding between zero and two segments to every subpath:
 * a line to the subpath's initial SEG_MOVETO segment, and/or a SEG_CLOSE segment.
 */
public class ClosedPathIterator implements PathIterator {

    static class PathSegment {
        int type;
        double[] coords;

        public PathSegment(int type, double[] coords) {
            this.type = type;
            this.coords = coords;
        }
    }

    PathIterator delegate;

    private int segmentType = -1;
    Point2D.Double moveLoc = null;
    boolean subpathContainedMoreThanMoveTo = false;
    Point2D.Double lastLoc = null;

    List<PathSegment> segments = new LinkedList<>();

    double[] coords = new double[6];

    public ClosedPathIterator(PathIterator delegate) {
        Objects.requireNonNull(delegate);
        this.delegate = delegate;
        populateQueue();
    }

    @Override
    public int getWindingRule() {
        return delegate.getWindingRule();
    }

    @Override
    public boolean isDone() {
        return segments.isEmpty();
    }

    @Override
    public void next() {
        if (!segments.isEmpty())
            segments.remove(0);
        if (!segments.isEmpty())
            return;

        delegate.next();
        populateQueue();
    }

    private void populateQueue() {
        if (!delegate.isDone()) {
            segmentType = delegate.currentSegment(coords);
            segments.add(new PathSegment(segmentType, Arrays.copyOf(coords, coords.length)));

            switch(segmentType) {
                case PathIterator.SEG_MOVETO:
                    ensureSubpathClosed();
                    moveLoc = new Point2D.Double(coords[0], coords[1]);
                    lastLoc = new Point2D.Double(coords[0], coords[1]);
                    break;
                case PathIterator.SEG_LINETO:
                    lastLoc.setLocation(coords[0], coords[1]);
                    subpathContainedMoreThanMoveTo = true;
                    break;
                case PathIterator.SEG_QUADTO:
                    lastLoc.setLocation(coords[2], coords[3]);
                    subpathContainedMoreThanMoveTo = true;
                    break;
                case PathIterator.SEG_CUBICTO:
                    lastLoc.setLocation(coords[4], coords[5]);
                    subpathContainedMoreThanMoveTo = true;
                    break;
                case PathIterator.SEG_CLOSE:
                    ensureSubpathClosed();
                    break;
            }
        } else {
            ensureSubpathClosed();
        }
    }

    private void ensureSubpathClosed() {
        if (moveLoc != null && lastLoc != null && subpathContainedMoreThanMoveTo) {
            if (segments.isEmpty() || segments.get(segments.size()-1).type != PathIterator.SEG_CLOSE) {
                segments.add(0, new PathSegment(PathIterator.SEG_CLOSE,
                        new double[]{}));
            }

            if (!lastLoc.equals(moveLoc)) {
                segments.add(0, new PathSegment(PathIterator.SEG_LINETO,
                        new double[] { moveLoc.getX(), moveLoc.getY() }));
            }
        }
        moveLoc = null;
        lastLoc = null;
        subpathContainedMoreThanMoveTo = false;
    }

    @Override
    public int currentSegment(float[] coords) {
        PathSegment ps = segments.get(0);
        for (int a = 0; a<ps.coords.length; a++) {
            coords[a] = (float) ps.coords[a];
        }
        return ps.type;
    }

    @Override
    public int currentSegment(double[] coords) {
        PathSegment ps = segments.get(0);
        System.arraycopy(ps.coords, 0, coords, 0, ps.coords.length);
        return ps.type;
    }
}
