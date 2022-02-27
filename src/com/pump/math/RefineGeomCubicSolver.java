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
            double secondHighestCoeff = Math.abs(eqn[2] / eqn[3]);
            if (secondHighestCoeff > 1e8) {
                int returnValue = solveCubic_unbounded_smallLeadingCoefficient(eqn, res, resOffset);
                return constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
            }

            double[] dst = resOffset == 0 ? res : new double[3];
            int returnValue = CubicCurve2D.solveCubic(eqn, dst);
            returnValue = constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);

            for (int a = 0; a < returnValue; a++) {
                res[resOffset] = refineRoot(eqn, 3, res[resOffset]);
            }

            for (int rootIndex = 0; rootIndex < returnValue - 1; rootIndex++) {
                double delta = res[rootIndex + 1] - res[rootIndex];
                double ulp = Math.ulp(res[rootIndex]);
                if (delta < ulp * 1000000000) {
                    throw new PossibleDoubleRootException();
                }
            }
            return returnValue;
        } catch(Exception e) {
            return new BinarySearchCubicSolver().solveCubic(eqn, minX, maxX, res, resOffset);
        }
    }

    protected int solveCubic_unbounded_smallLeadingCoefficient(double[] eqn, double[] res, int resOffset) {
        // the leading coefficient of the (x^3) is so small we should ignore it and see what roots we
        // identify when we treat this like a quadratic. We'll still use Newton's method to refine
        // the x-value we get:

        double[] quadDst = resOffset == 0 ? res : new double[2];
        int rootCount = solveQuadratic(eqn, quadDst, false);

        // step 1: refine. Even if the results of solveQuadratic were perfect
        // (and they probably weren't), they didn't take into account the (x^3)
        // term, so they're probably a little bit off:
        switch(rootCount) {
            case 2:
                res[resOffset] = refineRoot(eqn, 3, quadDst[0]);
                res[resOffset + 1] = refineRoot(eqn, 3, quadDst[1]);
                if (res[resOffset] == res[resOffset + 1]) {
                    // unlikely, but if we somehow honed in on only one root:
                    rootCount = 1;
                }
                break;
            case 1:
                res[resOffset] = refineRoot(eqn, 3, quadDst[0]);
                break;
        }

        // step 2:

        switch(rootCount) {
            case 2:
                // this is derived from a synthetic division approach:
                double newRoot = - eqn[2] / eqn[3] - res[resOffset] - res[resOffset + 1];
                res[resOffset + 2] = refineRoot(eqn, 3, newRoot);
                rootCount++;
                break;
            case 1:
                // use synthetic division to identify the remaining quadratic:
                double[] scratch = new double[] {
                        eqn[1] - (eqn[2] - eqn[3] * res[resOffset]) * res[resOffset],
                        eqn[2] - eqn[3] * res[resOffset],
                        eqn[3],
                };
                int k = QuadCurve2D.solveQuadratic(scratch, scratch);
                if (k == 2) {
                    res[resOffset + 1] = refineRoot(eqn, 3, scratch[0]);
                    res[resOffset + 2] = refineRoot(eqn, 3, scratch[1]);
                    rootCount+=2;
                } else if (k == 1) {
                    res[resOffset + 1] = refineRoot(eqn, 3, scratch[0]);
                    rootCount++;
                }
                break;
            case 0:
            case -1:
                // TODO: explore
                throw new RuntimeException();
        }

        return rootCount;
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
