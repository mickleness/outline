package com.pump.awt.geom;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

public class ShapeUtils {

    /**
     * Returns a high precision bounding box of the specified PathIterator.
     * <p>
     * This method provides a basic facility for implementors of the {@link Shape} interface to
     * implement support for the {@link Shape#getBounds2D()} method.
     * </p>
     * <p>
     * This is copied and pasted from a pull request for JDK 8176501
     * (https://github.com/openjdk/jdk/pull/6227).
     * </p>
     *
     * TODO: If the PR referenced above if accepted: remove this code and invoke the
     * same method in Path2D instead. (Also remove the "accumulateX" methods below.)
     *
     * @return an instance of {@code Rectangle2D} that is a high-precision bounding box of the
     *         {@code PathIterator}.
     * @see Shape#getBounds2D()
     */
    public static Rectangle2D getBounds2D(final PathIterator pi) {
        final double[] coeff = new double[4];
        final double[] deriv_coeff = new double[3];

        final double[] coords = new double[6];

        // bounds are stored as {leftX, rightX, topY, bottomY}
        double[] bounds = null;
        double lastX = 0.0;
        double lastY = 0.0;
        double endX = 0.0;
        double endY = 0.0;

        for (; !pi.isDone(); pi.next()) {
            final int type = pi.currentSegment(coords);
            switch (type) {
                case PathIterator.SEG_MOVETO:
                    if (bounds == null) {
                        bounds = new double[] { coords[0], coords[0], coords[1], coords[1] };
                    }
                    endX = coords[0];
                    endY = coords[1];
                    break;
                case PathIterator.SEG_LINETO:
                    endX = coords[0];
                    endY = coords[1];
                    break;
                case PathIterator.SEG_QUADTO:
                    endX = coords[2];
                    endY = coords[3];
                    break;
                case PathIterator.SEG_CUBICTO:
                    endX = coords[4];
                    endY = coords[5];
                    break;
                case PathIterator.SEG_CLOSE:
                default:
                    continue;
            }

            if (endX < bounds[0]) bounds[0] = endX;
            if (endX > bounds[1]) bounds[1] = endX;
            if (endY < bounds[2]) bounds[2] = endY;
            if (endY > bounds[3]) bounds[3] = endY;

            switch (type) {
                case PathIterator.SEG_QUADTO:
                    accumulateExtremaBoundsForQuad(bounds, 0, lastX, coords[0], coords[2], coeff, deriv_coeff);
                    accumulateExtremaBoundsForQuad(bounds, 2, lastY, coords[1], coords[3], coeff, deriv_coeff);
                    break;
                case PathIterator.SEG_CUBICTO:
                    accumulateExtremaBoundsForCubic(bounds, 0, lastX, coords[0], coords[2], coords[4], coeff, deriv_coeff);
                    accumulateExtremaBoundsForCubic(bounds, 2, lastY, coords[1], coords[3], coords[5], coeff, deriv_coeff);
                    break;
                default:
                    break;
            }

            lastX = endX;
            lastY = endY;
        }
        if (bounds != null) {
            return new Rectangle2D.Double(bounds[0], bounds[2], bounds[1] - bounds[0], bounds[3] - bounds[2]);
        }

        // there's room to debate what should happen here, but historically we return a zeroed
        // out rectangle here. So for backwards compatibility let's keep doing that:
        return new Rectangle2D.Double();
    }

    /**
     * Accumulate the quadratic extrema into the pre-existing bounding array.
     * <p>
     * This method focuses on one dimension at a time, so to get both the x and y
     * dimensions you'll need to call this method twice.
     * </p>
     * <p>
     * Whenever we have to examine cubic or quadratic extrema that change our bounding
     * box: we run the risk of machine error that may produce a box that is slightly
     * too small. But the contract of {@link Shape#getBounds2D()} says we should err
     * on the side of being too large. So to address this: we'll apply a margin based
     * on the upper limit of numerical error caused by the polynomial evaluation (horner
     * scheme).
     * </p>
     *
     * @param bounds the bounds to update, which are expressed as: { minX, maxX }
     * @param boundsOffset the index in boundsof the minimum value
     * @param x1 the starting value of the bezier curve where t = 0.0
     * @param ctrlX the control value of the bezier curve
     * @param x2 the ending value of the bezier curve where t = 1.0
     * @param coeff an array of at least 3 elements that will be overwritten and reused
     * @param deriv_coeff an array of at least 2 elements that will be overwritten and reused
     */
    private static void accumulateExtremaBoundsForQuad(double[] bounds, int boundsOffset, double x1, double ctrlX, double x2, double[] coeff, double[] deriv_coeff) {
        if (ctrlX < bounds[boundsOffset] ||
                ctrlX > bounds[boundsOffset + 1]) {

            final double dx21 = ctrlX - x1;
            coeff[2] = (x2 - ctrlX) - dx21;  // A = P3 - P0 - 2 P2
            coeff[1] = 2.0 * dx21;           // B = 2 (P2 - P1)
            coeff[0] = x1;                   // C = P1

            deriv_coeff[0] = coeff[1];
            deriv_coeff[1] = 2.0 * coeff[2];

            final double t = -deriv_coeff[0] / deriv_coeff[1];
            if (t > 0.0 && t < 1.0) {
                final double v = coeff[0] + t * (coeff[1] + t * coeff[2]);

                // error condition = sum ( abs (coeff) ):
                final double margin = Math.ulp(Math.abs(coeff[0])
                        + Math.abs(coeff[1]) + Math.abs(coeff[2]));

                if (v - margin < bounds[boundsOffset]) {
                    bounds[boundsOffset] = v - margin;
                }
                if (v + margin > bounds[boundsOffset + 1]) {
                    bounds[boundsOffset + 1] = v + margin;
                }
            }
        }
    }

    /**
     * Accumulate the cubic extrema into the pre-existing bounding array.
     * <p>
     * This method focuses on one dimension at a time, so to get both the x and y
     * dimensions you'll need to call this method twice.
     * </p>
     * <p>
     * Whenever we have to examine cubic or quadratic extrema that change our bounding
     * box: we run the risk of machine error that may produce a box that is slightly
     * too small. But the contract of {@link Shape#getBounds2D()} says we should err
     * on the side of being too large. So to address this: we'll apply a margin based
     * on the upper limit of numerical error caused by the polynomial evaluation (horner
     * scheme).
     * </p>
     *
     * @param bounds the bounds to update, which are expressed as: { minX, maxX }
     * @param boundsOffset the index in boundsof the minimum value
     * @param x1 the starting value of the bezier curve where t = 0.0
     * @param ctrlX1 the first control value of the bezier curve
     * @param ctrlX1 the second control value of the bezier curve
     * @param x2 the ending value of the bezier curve where t = 1.0
     * @param coeff an array of at least 3 elements that will be overwritten and reused
     * @param deriv_coeff an array of at least 2 elements that will be overwritten and reused
     */
    private static void accumulateExtremaBoundsForCubic(double[] bounds, int boundsOffset, double x1, double ctrlX1, double ctrlX2, double x2, double[] coeff, double[] deriv_coeff) {
        if (ctrlX1 < bounds[boundsOffset] ||
                ctrlX1 > bounds[boundsOffset + 1]) {
            final double dx32 = 3.0 * (ctrlX2 - ctrlX1);
            final double dx21 = 3.0 * (ctrlX1 - x1);
            coeff[3] = (x2 - x1) - dx32;  // A = P3 - P0 - 3 (P2 - P1) = (P3 - P0) + 3 (P1 - P2)
            coeff[2] = (dx32 - dx21);         // B = 3 (P2 - P1) - 3(P1 - P0) = 3 (P2 + P0) - 6 P1
            coeff[1] = dx21;                  // C = 3 (P1 - P0)
            coeff[0] = x1;                 // D = P0

            deriv_coeff[0] = coeff[1];
            deriv_coeff[1] = 2.0 * coeff[2];
            deriv_coeff[2] = 3.0 * coeff[3];

            // reuse this array, give it a new name for readability:
            final double[] tExtrema = deriv_coeff;

            // solveQuadratic should be improved to get correct t extrema (1 ulp):
            final int tExtremaCount = QuadCurve2D.solveQuadratic(deriv_coeff, tExtrema);
            if (tExtremaCount > 0) {
                // error condition = sum ( abs (coeff) ):
                final double margin = Math.ulp(Math.abs(coeff[0])
                        + Math.abs(coeff[1]) + Math.abs(coeff[2])
                        + Math.abs(coeff[3]));

                for (int i = 0; i < tExtremaCount; i++) {
                    final double t = tExtrema[i];
                    if (t > 0.0 && t < 1.0) {
                        final double v = coeff[0] + t * (coeff[1] + t * (coeff[2] + t * coeff[3]));
                        if (v - margin < bounds[boundsOffset]) {
                            bounds[boundsOffset] = v - margin;
                        }
                        if (v + margin > bounds[boundsOffset + 1]) {
                            bounds[boundsOffset + 1] = v + margin;
                        }
                    }
                }
            }
        }
    }

    /**
     * This returns the Rectangle2D (or Rectangle) that a PathIterator represents, or null if the
     * argument is not a rectangle.
     */
    public static Rectangle2D toRectangle2D(PathIterator pi) {
        List<Point2D.Double> points = new ArrayList<>(4);
        double[] coords = new double[6];
        while (!pi.isDone()) {
            int k = pi.currentSegment(coords);
            if (k == PathIterator.SEG_MOVETO) {
                if (points.isEmpty()) {
                    points.add(new Point2D.Double(coords[0], coords[1]));
                } else {
                    return null;
                }
            } else if (k == PathIterator.SEG_LINETO) {
                if (points.size() < 4) {
                    points.add(new Point2D.Double(coords[0], coords[1]));
                } else {
                    return null;
                }
            } else if (k == PathIterator.SEG_CLOSE) {
                // intentionally empty
            } else {
                return null;
            }
            pi.next();
        }

        if (points.size() != 4)
            return null;

        Point2D.Double p0 = points.get(0);
        Point2D.Double p1 = points.get(1);
        Point2D.Double p2 = points.get(2);
        Point2D.Double p3 = points.get(3);

        double minX = Math.min( Math.min(p0.getX(), p1.getX()), Math.min(p2.getX(), p3.getX()));
        double maxX = Math.max( Math.max(p0.getX(), p1.getX()), Math.max(p2.getX(), p3.getX()));
        double minY = Math.min( Math.min(p0.getY(), p1.getY()), Math.min(p2.getY(), p3.getY()));
        double maxY = Math.max( Math.max(p0.getY(), p1.getY()), Math.max(p2.getY(), p3.getY()));

        boolean valid = false;
        if (p0.x == minX && p0.y == minY &&
                p1.x == maxX && p1.y == minY &&
                p2.x == maxX && p2.y == maxY &&
                p3.x == minX && p3.y == maxY) {
            // clockwise from top-left
            valid = true;
        } else if (p0.x == maxX && p0.y == minY &&
                p1.x == maxX && p1.y == maxY &&
                p2.x == minX && p2.y == maxY &&
                p3.x == minX && p3.y == minY) {
            // clockwise from top-right
            valid = true;
        } else if (p0.x == maxX && p0.y == maxY &&
                p1.x == minX && p1.y == maxY &&
                p2.x == minX && p2.y == minY &&
                p3.x == maxX && p3.y == minY) {
            // clockwise from bottom-right
            valid = true;
        } else if (p0.x == minX && p0.y == maxY &&
                p1.x == minX && p1.y == minY &&
                p2.x == maxX && p2.y == minY &&
                p3.x == maxX && p3.y == maxY) {
            // clockwise from bottom-left
            valid = true;
        } else if (p0.x == minX && p0.y == minY &&
                p1.x == minX && p1.y == maxY &&
                p2.x == maxX && p2.y == maxY &&
                p3.x == maxX && p3.y == minY) {
            // counter-clockwise from top-left
            valid = true;
        } else if (p0.x == minX && p0.y == maxY &&
                p1.x == maxX && p1.y == maxY &&
                p2.x == maxX && p2.y == minY &&
                p3.x == minX && p3.y == minY) {
            // counter-clockwise from bottom-left
            valid = true;
        } else if (p0.x == maxX && p0.y == maxY &&
                p1.x == maxX && p1.y == minY &&
                p2.x == minX && p2.y == minY &&
                p3.x == minX && p3.y == maxY) {
            // counter-clockwise from bottom-right
            valid = true;
        } else if (p0.x == maxX && p0.y == minY &&
                p1.x == minX && p1.y == minY &&
                p2.x == minX && p2.y == maxY &&
                p3.x == maxX && p3.y == maxY) {
            // counter-clockwise from bottom-left
            valid = true;
        }

        if (!valid)
            return null;

        int minXi = (int)(Math.round(minX));
        int minYi = (int)(Math.round(minY));
        int maxXi = (int)(Math.round(maxX));
        int maxYi = (int)(Math.round(maxY));
        if (minXi == minX && minYi == minY && maxXi == maxX && maxYi == maxY) {
            return new Rectangle(minXi, minYi, maxXi - minXi, maxYi - minYi);
        }
        return new Rectangle2D.Double(minX, minY, maxX - minX, maxY - minY);
    }
}
