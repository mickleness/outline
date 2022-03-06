package com.pump.math;

import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This uses a binary search to identify all the roots of a cubic (and its derivatives).
 * <p>
 * This is slower than other approaches, but it more reliable. This is used as a last resort.
 * </p>
 */
public class BinarySearchCubicSolver extends CubicSolver {

    enum Direction { LEFT, RIGHT }

    @Override
    public int solveCubic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        double[] deriv = new double[] { eqn[1], 2 * eqn[2], 3 * eqn[3] };

        double[] extremaX = new double[2];
        int derivRootCount = solveQuadratic(deriv, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, extremaX, 0);

        if (derivRootCount == -1)
            return -1;


        if (derivRootCount == 0) {
            res[resOffset] = solveCubic_oneRoot_noExtrema(eqn);
            return 1;
        }

        List<Point2D.Double> windowPoints = new ArrayList<>(derivRootCount + 4);

        findCubicBinarySearchWindowBoundary(windowPoints, eqn, extremaX[0], Direction.LEFT);

        for (int a = 0; a < derivRootCount; a++) {
            double x = extremaX[a];
            double y = evaluate(eqn, 3, extremaX[a]);
            windowPoints.add(new Point2D.Double(x,y));
        }

        findCubicBinarySearchWindowBoundary(windowPoints, eqn, extremaX[derivRootCount - 1], Direction.RIGHT);

        int returnValue = 0;

        if (windowPoints.size() > 1) {
            for (int windowPointIndex = 0; windowPointIndex < windowPoints.size() - 1; windowPointIndex++) {
                double leftY = windowPoints.get(windowPointIndex).y;
                double rightY = windowPoints.get(windowPointIndex + 1).y;

                if (leftY == 0) {
                    double leftX = windowPoints.get(windowPointIndex).x;
                    res[resOffset + (returnValue++)] = leftX;
                } else if (rightY == 0) {
                    if (windowPointIndex + 1 == windowPoints.size() - 1) {
                        double rightX = windowPoints.get(windowPointIndex + 1).x;
                        res[resOffset + (returnValue++)] = rightX;
                    } else {
                        // we'll pick this up next iteration
                    }
                } else {
                    boolean crossesZero = (leftY > 0 && rightY < 0) || (leftY < 0 && rightY > 0);
                    if (crossesZero) {
                        double leftX = windowPoints.get(windowPointIndex).x;
                        double rightX = windowPoints.get(windowPointIndex + 1).x;
                        res[resOffset + (returnValue++)] = refineBinarySearch(eqn, 3, leftX, leftY, rightX, rightY);
                    }
                }
            }

            returnValue = dropRedundantCubicRoot(returnValue, eqn, res, resOffset);
        } else if (windowPoints.size() == 1) {
            // this can happen for a triple root

            if (windowPoints.get(0).y == 0) {
                double leftX = windowPoints.get(0).x;
                res[resOffset + (returnValue++)] = leftX;
            } else {
                // erg, but this should never happen
                throw new IllegalStateException();
            }
        }

        return constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
    }

    /**
     * This may remove one root from res and decrement the returnValue (the number of roots)
     */
    private int dropRedundantCubicRoot(int returnValue, double[] eqn, double[] res, int resOffset) {
        if (returnValue > 1) {

            // this is extracted from CubicCurve2D#solveCubic(..):

            final double d = eqn[3];
            final double A = eqn[2] / d;
            final double B = eqn[1] / d;
            final double C = eqn[0] / d;
            double sq_A = A * A;
            double p = 1.0 / 3 * (-1.0 / 3 * sq_A + B);
            double q = 1.0 / 2 * (2.0 / 27 * A * sq_A - 1.0 / 3 * A * B + C);
            double cb_p = p * p * p;
            double D = q * q + cb_p;

            // so here CubicCurve2D#solveCubic does different things if D is <= 0,
            // but it appears possible that we come to the wrong conclusion as
            // D approaches zero. So here's our own solution:

            if (Math.abs(D) < .0000001) {
                if (returnValue == 3) {
                    double d1 = Math.abs(res[resOffset] - res[resOffset + 1]);
                    double d2 = Math.abs(res[resOffset + 1] - res[resOffset + 2]);
                    double z1, z2, z3;
                    if (d1 < d2) {
                        double midRes = (res[resOffset] + res[resOffset + 1]) / 2.0;
                        z1 = evaluate(eqn, 3, res[resOffset]);
                        z2 = evaluate(eqn, 3, res[resOffset + 1]);
                        z3 = evaluate(eqn, 3, midRes);
                    } else {
                        double midRes = (res[resOffset + 1] + res[resOffset + 2]) / 2.0;
                        z1 = evaluate(eqn, 3, res[resOffset + 1]);
                        z2 = evaluate(eqn, 3, res[resOffset + 2]);
                        z3 = evaluate(eqn, 3, midRes);
                    }
                    if (Math.abs(z3) <= Math.min(Math.abs(z1), Math.abs(z2))) {
                        if (d1 < d2) {
                            res[resOffset + 1] = res[resOffset + 2];
                        }
                        returnValue--;
                    }
                } else if (returnValue == 2) {
                    double d1 = Math.abs(res[resOffset] - res[resOffset + 1]);
                    double z1, z2, z3;

                    double midRes = (res[resOffset] + res[resOffset + 1]) / 2.0;
                    z1 = evaluate(eqn, 3, res[resOffset]);
                    z2 = evaluate(eqn, 3, res[resOffset + 1]);
                    z3 = evaluate(eqn, 3, midRes);

                    if (Math.abs(z3) <= Math.min(Math.abs(z1), Math.abs(z2))) {
                        returnValue--;
                    }
                }
            }
        }
        return returnValue;
    }

    private double solveCubic_oneRoot_noExtrema(double[] eqn) {
        // we have a root and no extrema

        if (eqn[0] == 0) {
            // unlikely fringe case, but we'll take it:
            return 0;
        }

        // use x = 0 as one of our arbitrary bounds

        Direction direction;
        if (eqn[3] > 0) {
            direction =  (eqn[0] > 0) ? Direction.LEFT : Direction.RIGHT;
        } else {
            direction = (eqn[0] > 0) ? Direction.RIGHT : Direction.LEFT;
        }
        List<Point2D.Double> windowPoints = new ArrayList<>(2);
        if (direction == Direction.RIGHT) {
            windowPoints.add(new Point2D.Double(0, eqn[0]));
            findCubicBinarySearchWindowBoundary(windowPoints, eqn, 0, direction);
        } else {
            findCubicBinarySearchWindowBoundary(windowPoints, eqn, 0, direction);
            windowPoints.add(new Point2D.Double(0, eqn[0]));
        }
        return refineBinarySearch(eqn, 3, windowPoints.get(0).x, windowPoints.get(0).y, windowPoints.get(1).x, windowPoints.get(1).y);
    }

    /**
     * This looks to the left/right of a given x-value and identifies another x-value where the function
     * has definitely crossed over the y-axis. This only adds one element to dest.
     *
     * @param eqn the cubic equation
     * @param initialX the initial x value
     * @param direction -1 to look to the left, +1 to look to the right
     */
    private void findCubicBinarySearchWindowBoundary(List<Point2D.Double> dest, double[] eqn, double initialX, Direction direction) {
        double y = evaluate(eqn, 3, initialX);
        if (y == 0)
            return;

        boolean isInitialYPositive = y > 0;

        // will there be any roots between (initialX, initialY) and infinity? If not: abort
        if (eqn[3] > 0) {
            // we ultimately slope up to +infinity:

            if (direction == Direction.RIGHT && isInitialYPositive)
                return;
            if (direction == Direction.LEFT && !isInitialYPositive)
                return;
        } else {
            // we ultimately slope down to -infinity:

            if (direction == Direction.RIGHT && !isInitialYPositive)
                return;
            if (direction == Direction.LEFT && isInitialYPositive)
                return;
        }

        double x = initialX;
        boolean finished = false;
        double dirMultiplier = direction == Direction.LEFT ? -1 : 1;
        int degree = Math.getExponent(initialX);
        for(int loop = 1; loop < 100; loop++, degree += Math.max(1, Math.abs(degree * 3 / 2))) {
            double newX = x + dirMultiplier * Math.pow(2, degree);
            while (Double.isInfinite(newX)) {
                degree--;
                newX = x + dirMultiplier * Math.pow(2, degree);
            }
            double newY = evaluate(eqn, 3, newX);
            if (newY == 0) {
                dest.add(new Point2D.Double(newX, 0));
                return;
            }

            if (isInitialYPositive) {
                if (newY > 0) {
                    x = newX;
                    y = newY;
                } else {
                    finished = true;
                }
            } else {
                if (newY < 0) {
                    x = newX;
                    y = newY;
                } else {
                    finished = true;
                }
            }

            if (finished) {
                dest.add(new Point2D.Double(newX, newY));
                return;
            }
        }
        throw new IllegalStateException("eqn = " + Arrays.toString(eqn)+", x = "+x+", direction = "+direction);
    }

    @Override
    public int solveQuadratic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        double determinantSquared = eqn[1] * eqn[1] - 4 * eqn[0] * eqn[2];
        if (determinantSquared < 0) {
            return 0;
        }

        double[] deriv = new double[] { eqn[1], 2 * eqn[2] };
        double vertexX = - deriv[0] / deriv[1];

        if (determinantSquared == 0) {
            res[resOffset] = vertexX;
            return 1;
        }

        double determinant = Math.sqrt(determinantSquared);

        double x1 = vertexX - 1.25 * determinant / (2 * eqn[2]);
        double x2 = vertexX - .75 * determinant / (2 * eqn[2]);
        double x3 = vertexX + .75 * determinant / (2 * eqn[2]);
        double x4 = vertexX + 1.25 * determinant / (2 * eqn[2]);
        double y2 = evaluate(eqn, 2, x2);
        double y3 = evaluate(eqn, 2, x3);

        int returnValue;
        if ((y2 < 0 && y3 > 0) || (y2 > 0 && y3 < 0)) {
            // this is an edge case that can happen where the determinant is very small (1e-14 ish),
            // and it basically SHOULD be zero, and we really only have one root to find:
            res[resOffset] = refineBinarySearch(eqn, 2, x2, y2, x3, y3);
            returnValue = 1;
        } else {
            double y1 = evaluate(eqn, 2, x1);
            double y4 = evaluate(eqn, 2, x4);

            res[resOffset] = refineBinarySearch(eqn, 2, x1, y1, x2, y2);
            res[resOffset + 1] = refineBinarySearch(eqn, 2, x3, y3, x4, y4);
            returnValue = 2;
        }

        return constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
    }

    private double refineBinarySearch(double[] eqn, int degree, double x1, double y1, double x2, double y2) {
        if (y1 == 0)
            return x1;

        if (y2 == 0)
            return x2;

        boolean isYincreasing = y1 < 0 && y2 > 0;
        boolean isYdecreasing = y1 > 0 && y2 < 0;

        if (!isYdecreasing && !isYincreasing)
            throw new IllegalStateException("f("+x1+") = "+y1+", f("+x2+") = "+y2);

        while (true) {
            double x = (x1 + x2) / 2.0;
            if (x == x1 || x == x2)
                return x;

            double y = evaluate(eqn, degree, x);
            if (y == 0) {
                return x;
            } else if (y > 0 == isYincreasing) {
                x2 = x;
            } else {
                x1 = x;
            }
        }
    }
}
