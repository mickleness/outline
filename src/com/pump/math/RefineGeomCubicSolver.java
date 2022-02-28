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

    static class Solution {
        double[] roots;
        int rootCount;

        public Solution(double[] roots, int rootCount) {
            this.roots = roots;
            this.rootCount = rootCount;
        }

        public void add(double newRoot) {
            roots[rootCount++] = newRoot;
        }

        public int getRoots(double[] dst) {
            System.arraycopy(roots, 0, dst, 0, rootCount);
            return rootCount;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int a = 0; a<rootCount; a++) {
                if (a != 0)
                    sb.append(", ");
                sb.append(roots[a]);
            }
            sb.append("]");
            return sb.toString();
        }
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

            double coeffRatio = Math.abs(eqn[2] / eqn[3]);
            boolean verySmallLeadingCoefficient = coeffRatio > 1e8;
            boolean veryLargeLeadingCoefficient = coeffRatio < 1e-8;
            if (verySmallLeadingCoefficient || veryLargeLeadingCoefficient) {
                // if there's a very wide disparity between the (x^3) coefficient and the (x^2) coefficient
                // the code above can miss some solutions.

                Solution s1 = null;
                if (verySmallLeadingCoefficient)
                    s1 = solveCubic_treatLeadingCoefficientAsZero(eqn);
                if (s1 != null)
                    returnValue = s1.getRoots(dst);
//
//                } else {
//                    if (returnValue == 1) {
//                        double[] quadEqn = cubicToQuadSyntheticDivision(eqn, dst[0]);
//                        int quadRoots = solveQuadratic(quadEqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, dst, 1);
//                        for (int a = 0; a < quadRoots; a++) {
//                            dst[a + 1] = refineRoot(eqn, 3, dst[1 + a]);
//                            returnValue++;
//                        }
//                    } else if (returnValue == 2) {
//                        double[] lineEqn = cubicToLineSyntheticDivision(eqn, dst[0], dst[1]);
//                        if (lineEqn[1] == 0) {
//                            // not sure if this ever happens? Just in case let's abort
//                            throw new RuntimeException();
//                        }
//                        dst[2] = refineRoot(eqn, 3, -lineEqn[0] / lineEqn[1]);
//                        returnValue++;
//                    }
//                }
            }

            // not constraining; just sorting:
            constrainAndSort(returnValue, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, dst, 0, dst, 0);

            // now check for potential double roots
            for (int rootIndex = 0; rootIndex < returnValue - 1; rootIndex++) {
                double delta = dst[rootIndex + 1] - dst[rootIndex];
                double ulp = Math.ulp(dst[rootIndex]);
                if (delta < ulp * 1000000000) {
                    throw new PossibleDoubleRootException();
                }
            }

            // as our very last step we'll apply the constraints:
            returnValue = constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);

            return returnValue;
        } catch(Exception e) {
            return new BinarySearchCubicSolver().solveCubic(eqn, minX, maxX, res, resOffset);
        }
    }

    private Solution solveCubic_treatLeadingCoefficientAsZero(double[] eqn) {
        double[] dst = new double[3];
        int k = solveQuadratic(eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, dst, 0);
        switch(k) {
            case 2:
                // they are already refined to fit the quadratic, but now refine them to fit the cubic:
                dst[0] = refineRoot(eqn, 3, dst[0]);
                dst[1] = refineRoot(eqn, 3, dst[1]);
                double[] line = cubicToLineSyntheticDivision(eqn, dst[0], dst[1]);
                dst[2] = refineRoot(eqn, 3, -line[0] / line[1]);
                return new Solution(dst, 3);
            case 1:
                dst[0] = refineRoot(eqn, 3, dst[0]);
                double[] j = cubicToQuadSyntheticDivision(eqn, dst[0]);
                k = solveQuadratic(j, Double.NEGATIVE_INFINITY, Double.MAX_VALUE, j, 0);
                Solution returnValue = new Solution(dst, 1);
                if (k == 1) {
                    returnValue.add(refineRoot(eqn, 3, j[0]));
                } else if (k == 2) {
                    returnValue.add(refineRoot(eqn, 3, j[1]));
                    returnValue.add(refineRoot(eqn, 3, j[1]));
                }
                return returnValue;
        }
        return null;
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

    /**
     * Return a linear equation by dividing a cubic equation by two of its supposed roots
     */
    protected double[] cubicToLineSyntheticDivision(double[] cubicEqn, double cubicRoot1, double cubicRoot2) {
        // define our quadratic as:
        // y = (x - cubicRoot1) * (x - cubicRoot2)

        // double a = 1;
        double b = -cubicRoot1 - cubicRoot2;
        //double c = cubicRoot1 * cubicRoot2;

        return new double[] { cubicEqn[2] - cubicEqn[3] * b, cubicEqn[3] };
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
