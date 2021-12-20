package com.pump.awt.geom;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.nio.file.Path;
import java.util.*;

/**
 * This PathIterator guarantees that every segment is monotonic.
 * <p>
 * For example: if a single cubic curve is used to represent an S-shape, then this
 * iterator will represent the same shape data using 3 cubic curves.
 * </p>
 */
public class MonotonicPathIterator extends FilterPathIterator {

    private double[] scratchArray;

    public MonotonicPathIterator(PathIterator delegate) {
        super(delegate);
    }

    @Override
    protected List<PathSegment> createLastPathSegments(Point2D.Double move, Point2D.Double last) {
        return Collections.EMPTY_LIST;
    }

    @Override
    protected List<PathSegment> createPathSegments(int segType, Point2D.Double move, Point2D.Double last, double[] coords) {
        switch(segType) {
            case PathIterator.SEG_MOVETO:
            case PathIterator.SEG_LINETO:
                return Collections.singletonList(new PathSegment(segType, new double[]{coords[0], coords[1]}));
            case PathIterator.SEG_CLOSE:
                return Collections.singletonList(new PathSegment(segType, new double[]{}));
        }

        Collection<Double> tValues = new TreeSet<>();
        switch(segType) {
            case PathIterator.SEG_QUADTO:
                double tx = -2.0 * (coords[0] - last.getX()) / (2.0 * ((coords[2] - coords[0]) - (coords[0] - last.getX())));
                if (tx > 0 && tx < 1) {
                    tValues.add(tx);
                }

                double ty = -2.0 * (coords[1] - last.getY()) / (2.0 * ((coords[3] - coords[1]) - (coords[1] - last.getY())));
                if (ty > 0 && ty < 1) {
                    tValues.add(ty);
                }
                break;
            case PathIterator.SEG_CUBICTO:
                if (scratchArray == null)
                    scratchArray = new double[3];

                scratchArray[0] = 3.0 * (coords[0] - last.getX());
                scratchArray[1] = 2.0 * (((3.0 * (coords[2] - coords[0])) - (3.0 * (coords[0] - last.getX()))));
                scratchArray[2] = 3.0 * ((coords[4] - last.getX()) - (3.0 * (coords[2] - coords[0])));

                int tExtremaCount = QuadCurve2D.solveQuadratic(scratchArray, scratchArray);
                for (int i = 0; i < tExtremaCount; i++) {
                    if (scratchArray[i] > 0 && scratchArray[i] < 1)
                        tValues.add(scratchArray[i]);
                }

                scratchArray[0] = 3.0 * (coords[1] - last.getY());
                scratchArray[1] = 2.0 * (((3.0 * (coords[3] - coords[1])) - (3.0 * (coords[1] - last.getY()))));
                scratchArray[2] = 3.0 * ((coords[5] - last.getY()) - (3.0 * (coords[3] - coords[1])));

                tExtremaCount = QuadCurve2D.solveQuadratic(scratchArray, scratchArray);
                for (int i = 0; i < tExtremaCount; i++) {
                    if (scratchArray[i] > 0 && scratchArray[i] < 1)
                        tValues.add(scratchArray[i]);
                }
                break;
        }

        if (tValues.isEmpty()) {
            if (segType == PathIterator.SEG_QUADTO) {
                return Collections.singletonList(new PathSegment(segType, new double[]{coords[0], coords[1], coords[2], coords[3]}));
            } else {
                return Collections.singletonList(new PathSegment(segType, new double[]{coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]}));
            }
        }
        tValues.add(0.0);
        tValues.add(1.0);

        List<PathSegment> returnValue = new LinkedList<>();
        Double[] tArray = tValues.toArray(new Double[0]);
        if (segType == PathIterator.SEG_QUADTO) {
            QuadCurve2D.Double quad = new QuadCurve2D.Double(last.getX(), last.getY(), coords[0], coords[1], coords[2], coords[3]);
            for (int a = 1; a < tArray.length; a++) {
                returnValue.add(new PathSegment(ShapeUtils.splitQuadraticCurve(quad, tArray[a - 1], tArray[a])));
            }
        } else {
            CubicCurve2D.Double cubic = new CubicCurve2D.Double(last.getX(), last.getY(), coords[0], coords[1], coords[2], coords[3], coords[4], coords[5]);
            for (int a = 1; a < tArray.length; a++) {
                returnValue.add(new PathSegment(ShapeUtils.splitCubicCurve(cubic, tArray[a - 1], tArray[a])));
            }
        }
        return returnValue;
    }
}
