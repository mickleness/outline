package com.pump.awt.geom;

import com.pump.util.RangeDouble;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
                ctrlX1 > bounds[boundsOffset + 1] ||
                ctrlX2 < bounds[boundsOffset] ||
                ctrlX2 > bounds[boundsOffset + 1]) {
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
                if (points.size() < 5) {
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

        // if our rectangle wrapped around to its origin
        if (points.size() == 5 && points.get(0).equals(points.get(4)))
            points.remove(4);

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

    public static Line2D.Double splitLine(Line2D.Double line, double t0, double t1) {
        if (t0 >= t1)
            throw new IllegalArgumentException("t0 ("+t0+") must be less than t1 ("+t1+")");

        double ax = line.x2 - line.x1;

        double x0 = ax * t0 + line.x1;
        double x1 = ax * t1 + line.x1;

        double ay = line.y2 - line.y1;

        double y0 = ay * t0 + line.y1;
        double y1 = ay * t1 + line.y1;

        return new Line2D.Double(x0, y0, x1, y1);

    }

    public static QuadCurve2D.Double splitQuadraticCurve(QuadCurve2D.Double quad, double t0, double t1) {
        if (t0 >= t1)
            throw new IllegalArgumentException("t0 ("+t0+") must be less than t1 ("+t1+")");

        double ax = quad.x1 - 2 * quad.ctrlx + quad.x2;
        double bx = -2 * quad.x1 + 2 * quad.ctrlx;
        double cx = quad.x1;

        double ay = quad.y1 - 2 * quad.ctrly + quad.y2;
        double by = -2 * quad.y1 + 2 * quad.ctrly;
        double cy = quad.y1;

        double tZ = (t0 + t1) / 2.0;

        double f0 = (ay * t0 + by) * t0 + cy;
        double f1 = (ay * tZ + by) * tZ + cy;
        double f2 = (ay * t1 + by) * t1 + cy;

        double ay2 = 2 * f2 - 4 * f1 + 2 * f0;
        double cy2 = f0;
        double by2 = f2 - cy2 - ay2;

        f0 = (ax * t0 + bx) * t0 + cx;
        f1 = (ax * tZ + bx) * tZ + cx;
        f2 = (ax * t1 + bx) * t1 + cx;

        double ax2 = 2 * f2 - 4 * f1 + 2 * f0;
        double cx2 = f0;
        double bx2 = f2 - cx2 - ax2;

        double newCtrlY = (2 * cy2 + by2) / 2;
        double newY1 = ay2 - cy2 + 2 * newCtrlY;

        double newCtrlX = (2 * cx2 + bx2) / 2;
        double newX1 = ax2 - cx2 + 2 * newCtrlX;

        return new QuadCurve2D.Double(cx2, cy2, newCtrlX, newCtrlY, newX1, newY1);
    }

    public static CubicCurve2D.Double splitCubicCurve(CubicCurve2D.Double cubic, double t0, double t1) {
        if (t0 >= t1)
            throw new IllegalArgumentException("t0 ("+t0+") must be less than t1 ("+t1+")");

        double ax = -cubic.x1 + 3 * cubic.ctrlx1 - 3 * cubic.ctrlx2 + cubic.x2;
        double bx = 3 * cubic.x1 - 6 * cubic.ctrlx1 + 3 * cubic.ctrlx2;
        double cx = -3 * cubic.x1 + 3 * cubic.ctrlx1;
        double dx = cubic.x1;
        double ay = -cubic.y1 + 3 * cubic.ctrly1 - 3 * cubic.ctrly2 + cubic.y2;
        double by = 3 * cubic.y1 - 6 * cubic.ctrly1 + 3 * cubic.ctrly2;
        double cy = -3 * cubic.y1 + 3 * cubic.ctrly1;
        double dy = cubic.y1;

        double tW = 2.0 * t0 / 3.0 + t1 / 3.0;
        double tZ = t0 / 3.0 + 2.0 * t1 / 3.0;

        double f0 = ((ay * t0 + by) * t0 + cy) * t0 + dy;
        double f1 = ((ay * tW + by) * tW + cy) * tW + dy;
        double f2 = ((ay * tZ + by) * tZ + cy) * tZ + dy;
        double f3 = ((ay * t1 + by) * t1 + cy) * t1 + dy;

        double dy2 = f0;
        double cy2 = (-11 * f0 + 18 * f1 - 9 * f2 + 2 * f3) / 2.0;
        double by2 = (-19 * f0 + 27 * f2 - 8 * f3 - 10 * cy2) / 4;
        double ay2 = f3 - by2 - cy2 - f0;

        f0 = ((ax * t0 + bx) * t0 + cx) * t0 + dx;
        f1 = ((ax * tW + bx) * tW + cx) * tW + dx;
        f2 = ((ax * tZ + bx) * tZ + cx) * tZ + dx;
        f3 = ((ax * t1 + bx) * t1 + cx) * t1 + dx;

        double dx2 = f0;
        double cx2 = (-11 * f0 + 18 * f1 - 9 * f2 + 2 * f3) / 2.0;
        double bx2 = (-19 * f0 + 27 * f2 - 8 * f3 - 10 * cx2) / 4;
        double ax2 = f3 - bx2 - cx2 - f0;

        double cy0 = (3 * dy2 + cy2) / 3;
        double cy1 = (by2 - 3 * dy2 + 6 * cy0) / 3;
        double y1 = ay2 + dy2 - 3 * cy0 + 3 * cy1;

        double cx0 = (3 * dx2 + cx2) / 3;
        double cx1 = (bx2 - 3 * dx2 + 6 * cx0) / 3;
        double x1 = ax2 + dx2 - 3 * cx0 + 3 * cx1;

        return new CubicCurve2D.Double(dx2, dy2, cx0, cy0, cx1, cy1, x1, y1);
    }

    /**
     * Return true if a shape has no path segment data to iterate over.
     */
    public static boolean isEmpty(Shape shape) {
        if (shape instanceof Area)
            return ((Area)shape).isEmpty();
        PathIterator pi = shape.getPathIterator(null);
        return pi.isDone();
    }

    /**
     * Return the exact bounds of the argument.
     * <p>
     * By default the {@link Shape#getBounds2D()} is allowed to generously round up
     * some bounding boxes so it can include lots of empty space.
     * </p>
     */
    public static Rectangle2D getBounds2D(Shape shape) {
        if (shape instanceof Area || shape instanceof AddingShape || shape instanceof RectangularShape) {
            // these shapes are known to have accurate getBounds2D() methods
            return shape.getBounds2D();
        }
        return getBounds2D(shape.getPathIterator(null));
    }

    /**
     * Return the maximum order of a path, where "1" indicates
     * the path is a polygon, "2" indicates the path contains
     * at least one quadratic path segment, and "3" indicates
     * the path contains at least one cubic segment.
     */
    public static int getOrder(PathIterator pi) {
        double[] coords = new double[6];
        int returnValue = 0;
        while (!pi.isDone()) {
            int k = pi.currentSegment(coords);
            if (k == PathIterator.SEG_CUBICTO)
                return 3;
            if (k == PathIterator.SEG_QUADTO)
                returnValue = 2;
            if (k == PathIterator.SEG_LINETO)
                returnValue = Math.max(returnValue, 1);
            pi.next();
        }
        return returnValue;
    }

    /**
     * This is a return value for the {@link #getRelationship(Shape, Shape)} method.
     */
    public enum Relationship {
        /**
         * This indicates a quick scan shows two shapes might intersect.
         */
        MAY_INTERSECT,

        /**
         * This indicates the left hand side shape contains the right hand side shape.
         */
        LHS_CONTAINS_RHS,

        /**
         * This indicates the right hand side shape contains the left hand side shape.
         */
        RHS_CONTAINS_LHS,

        /**
         * This indicates other enum options may not describe the relationship between two shapes.
         * This can happen when there are multiple subpaths in both shapes.
         */
        OTHER,

        /**
         * This indicates two shapes do not intersect.
         */
        NONE
    }

    /**
     * Return a Relationship for two given shapes.
     * @param shape1 the left-hand-side shape
     * @param shape2 the right-hand-side shape
     *
     * @return a Relationship enum describing the arguments.
     */
    public static Relationship getRelationship(Shape shape1, Shape shape2) {
        Objects.requireNonNull(shape1);
        Objects.requireNonNull(shape2);

        Rectangle2D shapeBounds1 = getBounds2D(shape1);
        Rectangle2D shapeBounds2 = getBounds2D(shape2);

        if (!shapeBounds1.intersects(shapeBounds2))
            return Relationship.NONE;

        int shape1containsOtherSubpathCtr = 0;
        int shape2containsOtherSubpathCtr = 0;
        int subpathCtr1 = 0;
        int subpathCtr2 = 0;

        double[] coords = new double[6];

        PathIterator pi1 = shape1.getPathIterator(null);
        int segments1 = 0;
        while (!pi1.isDone()) {
            int k = pi1.currentSegment(coords);
            if (k == PathIterator.SEG_MOVETO) {
                subpathCtr1++;

                if (shape2.contains(coords[0], coords[1])) {
                    shape2containsOtherSubpathCtr++;
                }
            }
            pi1.next();
            segments1++;
        }

        PathIterator pi2 = shape2.getPathIterator(null);
        int segments2 = 0;
        while (!pi2.isDone()) {
            int k = pi2.currentSegment(coords);
            if (k == PathIterator.SEG_MOVETO) {
                subpathCtr2++;

                if (shape1.contains(coords[0], coords[1])) {
                    shape1containsOtherSubpathCtr++;

                    if (shape2containsOtherSubpathCtr > 0)
                        return Relationship.OTHER;
                }
            }
            pi2.next();
            segments2++;
        }

        if (segments1 < segments2) {
            if (isIntersection(shape1, shape2, shapeBounds2, coords))
                return Relationship.MAY_INTERSECT;
        } else {
            if (isIntersection(shape2, shape1, shapeBounds1, coords))
                return Relationship.MAY_INTERSECT;
        }

        if (subpathCtr1 == shape2containsOtherSubpathCtr && subpathCtr1 > 0)
            return Relationship.RHS_CONTAINS_LHS;
        if (subpathCtr2 == shape1containsOtherSubpathCtr && subpathCtr2 > 0)
            return Relationship.LHS_CONTAINS_RHS;
        return Relationship.NONE;
    }

    private static boolean isIntersection(Shape outerLoop, Shape innerLoop, Rectangle2D innerLoopBounds, double[] coords) {
        PathIterator pi1 = new ClosedPathIterator(outerLoop.getPathIterator(null));
        Rectangle2D r1 = new Rectangle2D.Double();
        Rectangle2D r2 = new Rectangle2D.Double();
        double lastX1 = -1;
        double lastY1 = -1;
        double lastX2 = -1;
        double lastY2 = -1;

        while (!pi1.isDone()) {
            int k = pi1.currentSegment(coords);
            pi1.next();

            switch(k) {
                case PathIterator.SEG_MOVETO:
                    lastX1 = coords[0];
                    lastY1 = coords[1];
                    continue;
                case PathIterator.SEG_LINETO:
                    setRect(r1, lastX1, lastY1, coords, 1);
                    lastX1 = coords[0];
                    lastY1 = coords[1];
                    break;
                case PathIterator.SEG_QUADTO:
                    setRect(r1, lastX1, lastY1, coords, 2);
                    lastX1 = coords[2];
                    lastY1 = coords[3];
                    break;
                case PathIterator.SEG_CUBICTO:
                    setRect(r1, lastX1, lastY1, coords, 3);
                    lastX1 = coords[4];
                    lastY1 = coords[5];
                    break;
            }

            if (intersects(r1, innerLoopBounds)) {
                PathIterator pi2 = new ClosedPathIterator(innerLoop.getPathIterator(null));
                while (!pi2.isDone()) {
                    k = pi2.currentSegment(coords);
                    pi2.next();
                    switch (k) {
                        case PathIterator.SEG_MOVETO:
                            lastX2 = coords[0];
                            lastY2 = coords[1];
                            continue;
                        case PathIterator.SEG_LINETO:
                            setRect(r2, lastX2, lastY2, coords, 1);
                            lastX2 = coords[0];
                            lastY2 = coords[1];
                            break;
                        case PathIterator.SEG_QUADTO:
                            setRect(r2, lastX2, lastY2, coords, 2);
                            lastX2 = coords[2];
                            lastY2 = coords[3];
                            break;
                        case PathIterator.SEG_CUBICTO:
                            setRect(r2, lastX2, lastY2, coords, 3);
                            lastX2 = coords[4];
                            lastY2 = coords[5];
                            break;
                    }
                    // TODO: we could recursively break down this potential intersection at least
                    // a few times to help identify whether they might not intersect
                    if (intersects(r1, r2)) {
                        ctr++;
                        System.out.println(ctr);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static int ctr = 0;

    private static void setRect(Rectangle2D r, double x, double y, double[] coords, int coordCount) {
        double x0, x1, y0, y1;
        x0 = x1 = x;
        y0 = y1 = y;
        for(int a = 0; a < coordCount; a++) {
            int z = 2 * a;
            if (coords[z] < x0) {
                x0 = coords[z];
            } else if(coords[z] > x1) {
                x1 = coords[z];
            }

            z++;
            if (coords[z] < y) {
                y0 = coords[z];
            } else if(coords[z] > y1) {
                y1 = coords[z];
            }
        }
        r.setRect(x0, y0, x1 - x0, y1 - y0);
    }

    /**
     * This identifies whether two Rectangle2Ds intersect -- even if
     * either or both of the arguments are lines with no width or height.
     * <p>
     * {@link Rectangle2D#intersects(Rectangle2D)} returns false if either the width or height is zero,
     * so it will return false if you ask if a vertical and horizontal line intersect.
     * </p>
     */
    public static boolean intersects(Rectangle2D r1, Rectangle2D r2) {
        double width1 = r1.getWidth();
        double height1 = r1.getHeight();

        if (width1 == 0) {
            if (height1 == 0) {
                return false;
            }
            return intersectsWithVerticalLine(r2, r1.getMinX(), r1.getMinY(), r1.getMaxY());
        } else if (height1 == 0) {
            return intersectsWithHorizontalLine(r2, r1.getMinY(), r1.getMinX(), r1.getMaxX());
        }

        double width2 = r2.getWidth();
        double height2 = r2.getHeight();

        if (width2 == 0) {
            if (height2 == 0) {
                return false;
            }
            return intersectsWithVerticalLine(r1, r2.getMinX(), r2.getMinY(), r2.getMaxY());
        } else if (height2 == 0) {
            return intersectsWithHorizontalLine(r1, r2.getMinY(), r2.getMinX(), r2.getMaxX());
        }

        return r1.intersects(r2);
    }

    private static boolean intersectsWithVerticalLine(Rectangle2D r, double lineX, double lineMinY, double lineMaxY) {
        if (r.getWidth() == 0) {
            // r is a vert line too

            double x2 = r.getMinX();
            if (lineX == x2) {
                return RangeDouble.intersects(lineMinY, lineMaxY, r.getMinY(), r.getMaxY());
            }
            return false;
        }

        return r.getMinX() <= lineX && lineX <= r.getMaxX() &&
                RangeDouble.intersects(lineMinY, lineMaxY, r.getMinY(), r.getMaxY());
    }

    private static boolean intersectsWithHorizontalLine(Rectangle2D r, double lineY, double lineMinX, double lineMaxX) {
        if (r.getHeight() == 0) {
            // r is a horiz line too

            double y2 = r.getMinY();
            if (lineY == y2) {
                return RangeDouble.intersects(lineMinX, lineMaxX, r.getMinX(), r.getMaxX());
            }
            return false;
        }

        return r.getMinY() <= lineY && lineY <= r.getMaxY() &&
            RangeDouble.intersects(lineMinX, lineMaxX, r.getMinX(), r.getMaxX());
    }
}
