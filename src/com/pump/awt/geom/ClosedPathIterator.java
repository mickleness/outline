package com.pump.awt.geom;

import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.nio.file.Path;
import java.util.*;

/**
 * This PathIterator closes every subpath. This may involve adding between zero and two segments to every subpath:
 * a line to the subpath's initial SEG_MOVETO segment, and/or a SEG_CLOSE segment.
 */
public class ClosedPathIterator extends FilterPathIterator {

    boolean subpathContainedMoreThanMoveTo = false;

    public ClosedPathIterator(PathIterator delegate) {
        super(delegate);
    }

    @Override
    protected List<PathSegment> createPathSegments(int segType, Point2D.Double move, Point2D.Double last, double[] coords) {
        switch(segType) {
            case PathIterator.SEG_MOVETO:
                List<PathSegment> returnValue = ensureSubpathClosed(move, last);
                returnValue.add(new PathSegment(PathIterator.SEG_MOVETO, new double[] { coords[0], coords[1]}));
                return returnValue;
            case PathIterator.SEG_LINETO:
                subpathContainedMoreThanMoveTo = true;
                return Collections.singletonList(new PathSegment(PathIterator.SEG_LINETO, new double[] {coords[0], coords[1]}));
            case PathIterator.SEG_QUADTO:
                subpathContainedMoreThanMoveTo = true;
                return Collections.singletonList(new PathSegment(PathIterator.SEG_QUADTO, new double[] {coords[0], coords[1], coords[2], coords[3]}));
            case PathIterator.SEG_CUBICTO:
                subpathContainedMoreThanMoveTo = true;
                return Collections.singletonList(new PathSegment(PathIterator.SEG_CUBICTO, new double[] {coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]}));
            case PathIterator.SEG_CLOSE:
                return ensureSubpathClosed(move, last);
        }
        throw new IllegalArgumentException("unrecognized segment type: "+segType);
    }

    @Override
    protected List<PathSegment> createLastPathSegments(Point2D.Double move, Point2D.Double last) {
        return ensureSubpathClosed(move, last);
    }

    private List<PathSegment> ensureSubpathClosed(Point2D.Double move, Point2D.Double last) {
        List<PathSegment> returnValue = new LinkedList<>();
        if (move != null && last != null && subpathContainedMoreThanMoveTo) {
            subpathContainedMoreThanMoveTo = false;
            returnValue.add(new PathSegment(PathIterator.SEG_CLOSE,
                    new double[]{}));

            if (!move.equals(last)) {
                returnValue.add(0, new PathSegment(PathIterator.SEG_LINETO,
                        new double[] { move.getX(), move.getY() }));
            }
        }
        return returnValue;
    }
}
