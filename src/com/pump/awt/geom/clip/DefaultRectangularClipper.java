package com.pump.awt.geom.clip;

import com.pump.awt.geom.ClosedPathIterator;
import com.pump.math.MathUtils;

import java.awt.*;
import java.awt.geom.*;
import java.util.Arrays;
import java.util.Stack;

/**
 * This class lets you clip/intersect an arbitrary shape to a Rectangle2D.
 * <p>
 * This demonstrates a simple model that iterates over a path exactly once to
 * get the clipped shape.
 * <p>
 * (This does not use Sutherland-Hodgman clipping algorithm, the Weiler-Atherton
 * clipping algorithm, or the <code>Area<code> class.)
 *
 * @see <a href=
 *      "https://javagraphics.blogspot.com/2007/04/shapes-clipping-to-rectangle.html">Shapes:
 *      Clipping to a Rectangle</a>
 */
public class DefaultRectangularClipper implements RectangularClipper {

    /**
     * This is the tolerance with which 2 numbers must be similar to be
     * considered "equal".
     * <P>
     * This is necessary because as we much around with numbers and equations,
     * machine rounding will inevitably cause .5's to become .49999's and other
     * small rounding differences.
     */
    private static final double TOLERANCE = .00000001;

    /**
     * A function used to describe one of the 2 parametric equations for a
     * segment of a path. This can be thought of is <code>x = f(t)</code>.
     */
    interface Function {

        /** evaluates this function at a given value */
        double evaluate(double t);

        /**
         * Calculates all the t-values between (0,1) which will yield the result "f" in this
         * function.
         *
         * @param f
         *            the function result you're searching for
         * @param dest
         *            the array the results will be stored in
         * @param destOffset
         *            the offset at which data will be added to the array
         * @return the number of solutions found.
         */
        int evaluateInverse(double f, double[] dest, int destOffset);

        /** Return the derivative (df/dt) for a given value of t */
        double getDerivative(double t);
    }

    static class LinearFunction implements Function {
        double slope, intercept;

        /**
         * Defines this linear function.
         *
         * @param x1
         *            at t = 0, x1 is the output of this function
         * @param x2
         *            at t = 1, x2 is the output of this function
         */
        public void define(double x1, double x2) {
            slope = (x2 - x1);
            intercept = x1;
        }

        @Override
        public String toString() {
            return slope + "*t+" + intercept;
        }

        @Override
        public double evaluate(double t) {
            return slope * t + intercept;
        }

        @Override
        public int evaluateInverse(double x, double[] dest, int offset) {
            double value = (x - intercept) / slope;
            if (value <= 0.0 || value >= 1.0)
                return 0;

            dest[offset] = value;
            return 1;
        }

        @Override
        public double getDerivative(double t) {
            return slope;
        }
    }

    static class QuadraticFunction implements Function {
        double a, b, c;

        @Override
        public String toString() {
            return a + "*t*t+" + b + "*t+" + c;
        }

        /**
         * Use the 3 control points of a bezier quadratic
         */
        public void define(double x0, double x1, double x2) {
            a = x0 - 2.0 * x1 + x2;
            b = -2.0 * x0 + 2.0 * x1;
            c = x0;
        }

        @Override
        public double evaluate(double t) {
            return (a * t + b) * t + c;
        }

        @Override
        public double getDerivative(double t) {
            return 2.0 * a * t + b;
        }

        @Override
        public int evaluateInverse(double x, double[] dest, int offset) {
            double C = c - x;
            double det = b * b - 4.0 * a * C;
            if (det < 0.0)
                return 0;
            if (det == 0.0) {
                double value = -b / (2.0 * a);
                if (value <= 0.0 || value >= 1.0)
                    return 0;
                dest[offset] = value;
                return 1;
            }
            det = Math.sqrt(det);

            double v1 = (-b + det) / (2.0 * a);
            double v2 = (-b - det) / (2.0 * a);

            int returnValue = 0;

            if (v1 > 0.0 && v1 < 1.0) {
                dest[offset++] = v1;
                returnValue++;
            }

            if (v2 > 0.0 && v2 < 1.0) {
                dest[offset] = v2;
                returnValue++;
            }

            return returnValue;
        }
    }

    static class CubicFunction implements Function {
        double a, b, c, d;

        @Override
        public String toString() {
            return a + "*t*t*t+" + b + "*t*t+" + c + "*t+" + d;
        }

        public void define(double x0, double x1, double x2, double x3) {
            a = -x0 + 3.0 * x1 - 3.0 * x2 + x3;
            b = 3.0 * x0 - 6.0 * x1 + 3.0 * x2;
            c = -3.0 * x0 + 3.0 * x1;
            d = x0;
        }

        @Override
        public double evaluate(double t) {
            return ((a * t + b) * t + c) * t + d;
        }

        @Override
        public double getDerivative(double t) {
            return (3 * a * t + 2 * b) * t + c;
        }

        /**
         * Recycle arrays here. Remember this is possibly going to be 1 object
         * called hundreds of times, so reusing the same arrays here will save
         * us time & memory allocation. In current setup there is only 1 thread
         * that will be using these values.
         */
        double[] t2 = new double[3];
        double[] eqn = new double[4];

        @Override
        public int evaluateInverse(double x, double[] dest, int offset) {
            eqn[0] = d - x;
            eqn[1] = c;
            eqn[2] = b;
            eqn[3] = a;

            int k = MathUtils.solveCubic(eqn, t2, 0, 1);
            if (k < 0)
                return 0;

            int returnValue = 0;

            for (int a = 0; a < k; a++) {
                if (t2[a] > 0.0 && t2[a] < 1.0) {
                    dest[offset++] = t2[a];
                    returnValue++;
                }
            }

            return returnValue;
        }
    }

    private static class RectangleClipper {
        final double rTop;
        final double rLeft;
        final double rRight;
        final double rBottom;

        private RectangleClipper(Rectangle2D rect) {
            rTop = rect.getY();
            rLeft = rect.getX();
            rRight = rect.getX() + rect.getWidth();
            rBottom = rect.getY() + rect.getHeight();
        }

        boolean contains(double x, double y) {
            return (x >= rLeft && x <= rRight && y >= rTop && y <= rBottom);
        }

        boolean cap(Point2D.Double p) {
            boolean returnValue = false;
            if (p.x < rLeft) {
                p.x = rLeft;
                returnValue = true;
            } else if (p.x > rRight) {
                p.x = rRight;
                returnValue = true;
            }

            if (p.y < rTop) {
                p.y = rTop;
                returnValue = true;
            } else if (p.y > rBottom) {
                p.y = rBottom;
                returnValue = true;
            }
            return returnValue;
        }

        int collectIntersectionTimes(Function xf, Function yf,
                                     double[] intersectionTimes) {
            int sum = 0;
            sum += xf.evaluateInverse(rLeft, intersectionTimes, sum);
            sum += xf.evaluateInverse(rRight, intersectionTimes, sum);
            sum += yf.evaluateInverse(rTop, intersectionTimes, sum);
            sum += yf.evaluateInverse(rBottom, intersectionTimes, sum);
            return sum;
        }

        Path2D clip(Shape incomingShape, AffineTransform transform) {
            PathIterator i = new ClosedPathIterator(incomingShape.getPathIterator(transform));
            ClippedPath p = new ClippedPath(i.getWindingRule());
            int k;
            double[] f = new double[6];
            double lastX = 0.0;
            double lastY = 0.0;

            // create 1 copy of objects and recycle them
            // to reduce memory allocation:
            LinearFunction lxf = new LinearFunction();
            LinearFunction lyf = new LinearFunction();
            QuadraticFunction qxf = new QuadraticFunction();
            QuadraticFunction qyf = new QuadraticFunction();
            CubicFunction cxf = new CubicFunction();
            CubicFunction cyf = new CubicFunction();

            Function xf;
            Function yf;
            Point2D.Double point = new Point2D.Double();
            double[] intersectionTimes = new double[16];
            int tCtr;

            while (!i.isDone()) {
                k = i.currentSegment(f);
                i.next();

                if (k == PathIterator.SEG_MOVETO) {
                    point.setLocation(f[0], f[1]);
                    cap(point);

                    p.moveTo(point.x, point.y);

                    lastX = f[0];
                    lastY = f[1];
                } else if (k == PathIterator.SEG_CLOSE) {
                    // because we used a ClosingPathIterator: we're guaranteed our subpath ended with a LINETO
                    // that ended at the original MOVETO starting point
                    p.closePath();
                } else {
                    if (k == PathIterator.SEG_LINETO) {
                        lxf.define(lastX, f[0]);
                        lyf.define(lastY, f[1]);

                        xf = lxf;
                        yf = lyf;

                        lastX = f[0];
                        lastY = f[1];
                    } else if (k == PathIterator.SEG_QUADTO) {
                        qxf.define(lastX, f[0], f[2]);
                        qyf.define(lastY, f[1], f[3]);

                        xf = qxf;
                        yf = qyf;

                        lastX = f[2];
                        lastY = f[3];
                    } else if (k == PathIterator.SEG_CUBICTO) {
                        cxf.define(lastX, f[0], f[2], f[4]);
                        cyf.define(lastY, f[1], f[3], f[5]);

                        xf = cxf;
                        yf = cyf;

                        lastX = f[4];
                        lastY = f[5];
                    } else {
                        throw new IllegalStateException("currentSegment = "+k);
                    }

                    // gather all the t values at which we might be
                    // crossing the bounds of our rectangle:

                    tCtr = collectIntersectionTimes(xf, yf, intersectionTimes);
                    intersectionTimes[tCtr++] = 1.0;
                    // put them in ascending order:
                    Arrays.sort(intersectionTimes, 0, tCtr);

                    double prevT = 0;
                    for (int a = 0; a < tCtr; a++) {
                        double currentT = intersectionTimes[a];
                        if (prevT == currentT) {
                            // this is a harmless condition that could happen if both the x & y functions
                            // identified the same interesting times.
                            continue;
                        }

                        // Remember it's OK if we end up making redundant horiz/vert lines,
                        // because the object we're writing to should clean those up.

                        double midT = (currentT + prevT) / 2.0;
                        point.setLocation(xf.evaluate(midT), yf.evaluate(midT));
                        boolean outside = cap(point);

                        if (outside || xf instanceof LinearFunction) {
                            point.setLocation(xf.evaluate(currentT), yf.evaluate(currentT));
                            cap(point);
                            p.lineTo(point.x, point.y);
                        } else {
                            p.curveTo(xf, yf, prevT, currentT);
                        }

                        prevT = currentT;
                    }
                }
            }
            p.flush();
            return p.p;
        }
    }

    /**
     * This does 2 things: 1. It collapses redundant line segments that fall on
     * the same horizontal or vertical line. This is very important, given how
     * clipToRect() works. And not only does it vastly simplify your shape (lots
     * of redundant lineTo's will be called), but if a shape is properly
     * collapsed it has a much better chance of return a truly accurate result
     * when you call getBounds() on it.
     * <P>
     * Note that there are still some far fetched examples (involving
     * discontinous shapes) where getBounds() may be inaccurate, though. 2. This
     * can take a Function (either quadratic or cubic) and split it over a
     * smaller interval from an arbitrary [t0,t1].
     */
    static class ClippedPath {
        public final Path2D p;
        private final Stack<double[]> uncommittedPoints = new Stack<>();
        private double initialX, initialY;

        public ClippedPath(int windingRule) {
            p = new Path2D.Double(windingRule);
        }

        public void moveTo(double x, double y) {
            flush();
            p.moveTo(x, y);
            initialX = x;
            initialY = y;
        }

        /**
         * This makes a cubic curve to based on xf and yf that ranges from
         * [t0,t1]. So this takes a little subset of the curves if [t0,t1] is
         * smaller than [0,1].
         */
        public void curveTo(Function xf, Function yf, double t0, double t1) {
            flush(); // flush out lines

            double dt = (t1 - t0);
            // I know I'm not explaining the math here, but you can derive
            // it with a little time and a few sheets of paper. The API for
            // the PathIterator shows the equations relating to bezier
            // parametric
            // curves. From there you can calculate whatever you need:
            // it just might take a few pages of pen & paper.
            double dx0 = xf.getDerivative(t0) * dt;
            double dx1 = xf.getDerivative(t1) * dt;
            double dy0 = yf.getDerivative(t0) * dt;
            double dy1 = yf.getDerivative(t1) * dt;
            double x0 = xf.evaluate(t0);
            double x1 = xf.evaluate(t1);
            double y0 = yf.evaluate(t0);
            double y1 = yf.evaluate(t1);

            p.curveTo( (x0 + dx0 / 3), (y0 + dy0 / 3),
                    (x1 - dx1 / 3), (y1 - dy1 / 3),
                    x1, y1);
        }

        /**
         * Adds a line to (x,y)
         * <P>
         * This method doesn't actually commit a line until it's sure that it
         * isn't writing heavily redundant lines. That is the points (0,0),
         * (5,0) and (2,0) would be consolidated so only the first and last
         * point remained.
         * <P>
         * However only horizontal/vertical lines are consolidated, because this
         * method is aimed at clipping to (non-rotated) rectangles.
         */
        public void lineTo(double x, double y) {

            if (uncommittedPoints.size() > 0) {
                double[] last = uncommittedPoints.peek();
                // are we adding the same point?
                if (Math.abs(last[0] - x) < TOLERANCE
                        && Math.abs(last[1] - y) < TOLERANCE)
                    return;
            }

            double[] f = new double[2];
            f[0] = x;
            f[1] = y;
            uncommittedPoints.push(f);
        }

        public void closePath() {
            lineTo(initialX, initialY);
            flush();
            p.closePath();
        }

        /** Flush out the stack of uncommitted points. */
        public void flush() {
            while (uncommittedPoints.size() > 0) {
                while (uncommittedPoints.size() >= 3) {
                    double[] first = uncommittedPoints.get(0);
                    double[] middle = uncommittedPoints.get(1);
                    double[] last = uncommittedPoints.get(2);

                    if (Math.abs(first[0] - middle[0]) < TOLERANCE
                            && Math.abs(first[0] - last[0]) < TOLERANCE) {
                        // everything has the same x, so we have a vertical line
                        uncommittedPoints.remove(1);
                    } else if (Math.abs(first[1] - middle[1]) < TOLERANCE
                            && Math.abs(first[1] - last[1]) < TOLERANCE) {
                        // everything has the same y, so we have a horizontal
                        // line
                        uncommittedPoints.remove(1);
                    } else {
                        break;
                    }
                }

                double[] point = uncommittedPoints.remove(0);
                p.lineTo(point[0], point[1]);
            }
        }
    }

    @Override
    public Shape clip(Shape shape, AffineTransform tx, Rectangle2D clip) {
        RectangleClipper clipper = new RectangleClipper(clip);
        return clipper.clip(shape, tx);
    }
}