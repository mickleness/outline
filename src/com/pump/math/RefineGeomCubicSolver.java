package com.pump.math;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

/**
 * This uses {@link QuadCurve2D#solveQuadratic(double[], double[])} and
 * {@link CubicCurve2D#solveCubic(double[], double[])} when it can, but it
 * also may consult {@link BinarySearchCubicSolver} if it detects a potential
 * problem.
 * <p>
 * (That is: this attempts to leverage the efficiency of existing solutions,
 * but it resorts to the slower <code>BinarySearchCubicSolver</code> when
 * it thinks accuracy may be at stake.)
 * </p>
 */
public class RefineGeomCubicSolver extends CubicSolver {

    /**
     * We may (?) have stumbled into a local extrema, which means our attempts
     * to use Newton's Method may fail.
     */
    protected static class LocalExtremaException extends RuntimeException {

    }

    /**
     * Two consecutive roots looked suspiciously similar. CubicCurve2D can
     * sometimes return 3 roots when it should return 2. If we think this
     * might be occurring: let's throw this exception and we'll use our
     * fallback solver to be safe.
     */
    protected static class PossibleDoubleRootException extends RuntimeException {

    }

    @Override
    public int solveCubic(final double[] eqn,final double minX,final double maxX,final double[] res,final int resOffset) {
        if (eqn[3] == 0) {
            return solveQuadratic(eqn, minX, maxX, res, resOffset);
        }

        try {
            double[] dst = resOffset == 0 ? res : new double[3];
            int returnValue = CubicCurve2D.solveCubic(eqn, dst);

            for (int a = 0; a < returnValue; a++) {
                dst[a] = refineRoot(eqn, 3, dst[a]);
            }

            if (returnValue == 1 && Math.abs(eqn[2] / eqn[3]) > 1e8) {
                // if there's a very wide disparity between the (x^3) coefficient and the (x^2) coefficient,
                // and if we successfully honed in on one root: let's double-check if we can find any others.

                // (alternatively: another approach might be to just solve the equation as if it's a quadratic
                // and then refine the root(s) you produce?)

                double[] quadEqn = cubicToQuadSyntheticDivision(eqn, dst[0]);
                int quadRoots = solveQuadratic(quadEqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, dst, 1);
                if (quadRoots > 0) {
                    returnValue += quadRoots;
                    for (int a = 1; a < returnValue; a++) {
                        dst[a] = refineRoot(eqn, 3, dst[a]);
                    }
                }
            }

            for (int rootIndex = 0; rootIndex < returnValue - 1; rootIndex++) {
                double delta = dst[rootIndex + 1] - dst[rootIndex];
                double ulp = Math.ulp(dst[rootIndex]);
                if (delta < ulp * 1000000000) {
                    throw new PossibleDoubleRootException();
                }
            }

            returnValue = constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);

            return returnValue;
        } catch(Exception e) {
            return new BinarySearchCubicSolver().solveCubic(eqn, minX, maxX, res, resOffset);
        }
    }

    /**
     * Return a quadratic equation by dividing a cubic equation by one of its supposed roots
     */
    protected double[] cubicToQuadSyntheticDivision(double[] cubicEqn, double cubicRoot) {
        double a = cubicEqn[3];
        double b = cubicEqn[2] + cubicRoot * a;
        double c = cubicEqn[1] + cubicRoot * b;

        return new double[] { c, b, a };
    }

    private double refineRoot(double[] eqn, int degree, double value) {
        double bestAbsY = Double.MAX_VALUE;
        double bestX = 0;

        for (int ctr = 300; ctr >= 0; ctr--) {
            double y = evaluate(eqn, degree, value);
            if (y == 0)
                return value;

            double yAbs = Math.abs(y);
            if (yAbs < bestAbsY) {
                bestAbsY = yAbs;
                bestX = value;
            } else if (ctr > 4) {
                // immediately start the real countdown to return our best answer
                ctr = 4;
            }

            double dy = evaluateDerivative(eqn, degree, value);
            if (dy == 0) {
                throw new LocalExtremaException();
            }

            double newValue = value - y / dy;
            if (value == newValue)
                return newValue;
            value = newValue;
        }
        return bestX;
    }

    @Override
    public int solveQuadratic(final double[] eqn,final double minX,final double maxX,final double[] res,final int resOffset) {
        try {
            double[] dst = resOffset == 0 ? res : new double[2];
            int returnValue = solveQuadratic(eqn, dst, true);
            return constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);
        } catch(Exception e) {
            return new BinarySearchCubicSolver().solveQuadratic(eqn, minX, maxX, res, resOffset);
        }
    }

    protected int solveQuadratic(double[] eqn, double[] dst, boolean refineRoots) {
        if (eqn[2] != 0) {
            double secondHighestCoeff = Math.abs(eqn[1] / eqn[2]);
            if (secondHighestCoeff > 1e8) {
                double x = -eqn[0] / eqn[1];
                if (refineRoots) {
                    dst[0] = refineRoot(eqn, 2, x);
                } else {
                    dst[0] = x;
                }
                return 1;
            }
        }

        int returnValue = QuadCurve2D.solveQuadratic(eqn, dst);
        if (refineRoots && returnValue > 0) {
            for (int a = 0; a < returnValue; a++) {
                dst[a] = refineRoot(eqn, 2, dst[a]);
            }
        }
        return returnValue;
    }
}
