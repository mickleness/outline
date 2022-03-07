package com.pump.math;

import com.pump.util.RangeDouble;

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

    static class Solution {
        Root[] roots;

        public Solution(Root... roots) {
            this.roots = roots;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder("[");
            for (int a = 0; a<roots.length; a++) {
                if (a != 0)
                    sb.append(", ");
                sb.append(roots[a]);
            }
            sb.append("]");
            return sb.toString();
        }
    }

    static class Root {
        double x;
        double yAbs;

        boolean isRangeDefined;
        double minX, maxX;

        /**
         *
         * @param x the x value for this root
         * @param yAbs the absolute value of f(x). In an ideal world this would be zero, but because of double
         *             precision it may not be.
         */
        public Root(double x, double yAbs) {
            this.x = x;
            this.yAbs = yAbs;
        }

        @Override
        public String toString() {
            return "f("+x+") = "+yAbs;
        }

        public Root merge(double[] eqn, Root other) {
            if (isRangeDefined) {
                if (RangeDouble.contains(minX, maxX, other.x, other.x)) {
                    return this;
                }
                return null;
            }
            if (other.isRangeDefined) {
                if (RangeDouble.contains(other.minX, other.maxX, x, x)) {
                    return other;
                }
                return null;
            }
            define(eqn);

            if (RangeDouble.contains(minX, maxX, other.x, other.x)) {
                return this;
            }
            return null;
        }

        private void define(double[] eqn) {
            if (isRangeDefined) return;
            isRangeDefined = true;
            minX = maxX = x;

            double newX = maxX;
            for (int k = 0; k < 10; k++) {
                newX = Math.nextUp(newX);
                double y = evaluate(eqn, 3, newX);
                if (y == 0) {
                    maxX = newX;
                    k = 0;
                }
            }

            newX = minX;
            for (int k = 0; k < 10; k++) {
                newX = Math.nextDown(newX);
                double y = evaluate(eqn, 3, newX);
                if (y == 0) {
                    minX = newX;
                    k = 0;
                }
            }

            x = (minX + maxX) / 2.0;
        }
    }

    @Override
    public int solveCubic(final double[] eqn,final double minX,final double maxX,final double[] res,final int resOffset) {
        try {
            if (eqn[3] == 0) {
                return solveQuadratic(eqn, minX, maxX, res, resOffset);
            } else if (eqn[0] == 0) {
                return solveCubic_constantIsZero(eqn, minX, maxX, res, resOffset);
            }

            double[] dst = resOffset == 0 ? res : new double[3];
            int dstLength = CubicCurve2D.solveCubic(eqn, dst);

            Root[] roots = dstLength < 0 ? new Root[] {} : new Root[dstLength];
            for (int a = 0; a < dstLength; a++) {
                roots[a] = refineRoot(eqn, 3, dst[a] + .01);
            }

            if (roots.length < 3) {
                int exp0 = Math.getExponent(eqn[0]);
                int exp1 = Math.getExponent(eqn[1]);
                int exp2 = Math.getExponent(eqn[2]);
                int exp3 = Math.getExponent(eqn[3]);

                Solution altSolution = null;

                boolean isVerySmallLeadingCoefficient = (exp3 < exp2 - 8) && (exp3 < exp1 - 8) && (exp3 < exp0 - 8);
                if (isVerySmallLeadingCoefficient) {
                    altSolution = solveCubic_treatLeadingCoefficientAsZero(eqn);
                }

                if (altSolution == null) {
                    boolean isVerySmallConstant = (exp0 < exp1 - 8) && (exp0 < exp2 - 8) && (exp0 < exp3 - 8);
                    if (isVerySmallConstant)
                        altSolution = solveCubic_treatConstantAsZero(eqn);
                }

                if (altSolution != null)
                    roots = altSolution.roots;

                if (roots.length == 2) {
                    altSolution = solveCubic_twoKnownRoots(eqn, roots[0], roots[1]);
                    if (altSolution != null)
                        roots = altSolution.roots;
                }
            }

            roots = consolidateRedundantRoots(eqn, roots);

            int returnValue = roots.length;
            if (roots.length == 1) {
                dst[0] = roots[0].x;
            } else if (roots.length == 2) {
                dst[0] = roots[0].x;
                dst[1] = roots[1].x;
            } else if (roots.length == 3) {
                dst[0] = roots[0].x;
                dst[1] = roots[1].x;
                dst[2] = roots[2].x;
            }

            return constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);
        } catch(Exception e) {
            return new BinarySearchCubicSolver().solveCubic(eqn, minX, maxX, res, resOffset);
        }
    }

    private Root[] consolidateRedundantRoots(double[] eqn, Root[] roots) {
        for (int a = 0; a < roots.length; a++) {
            if (roots[a].yAbs == 0) {
                for (int b = 0; b < roots.length; b++) {
                    if (a != b && roots[b].yAbs == 0) {
                        Root mergedRoot = roots[a].merge(eqn, roots[b]);
                        if (mergedRoot != null) {

                            // recursively check to see we can further consolidate roots (that is:
                            // can a double root be consolidated into a triple root?)

                            roots[a] = null;
                            roots[b] = null;
                            Root[] newArray = new Root[roots.length - 1];
                            for (int c = 0; c < roots.length; c++) {
                                if (roots[c] != null) {
                                    newArray[0] = roots[c];
                                }
                            }
                            newArray[newArray.length - 1] = mergedRoot;
                            return consolidateRedundantRoots(eqn, newArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    private Solution solveCubic_twoKnownRoots(double[] eqn, Root knownRoot1, Root knownRoot2) {
        // explore the possibility that there's a double root:

        double[] doubleRootLine1 = cubicToLineSyntheticDivision(eqn, knownRoot1.x, knownRoot1.x);
        double altRoot2 = -doubleRootLine1[0] / doubleRootLine1[1];
        double ratio = knownRoot2.x / altRoot2;
        if (ratio >= .999999 && ratio <= 1.000001) {
            // this looks like knownRoot1 is a double root; this is OK.
            return null;
        }

        double[] doubleRootLine2 = cubicToLineSyntheticDivision(eqn, knownRoot2.x, knownRoot2.x);
        double altRoot1 = -doubleRootLine2[0] / doubleRootLine2[1];
        ratio = knownRoot1.x / altRoot1;
        if (ratio >= .999999 && ratio <= 1.000001) {
            // this looks like knownRoot2 is a double root; this is OK.
            return null;
        }

        double[] line = cubicToLineSyntheticDivision(eqn, knownRoot1.x, knownRoot2.x);
        double candidateRootX = - line[0] / line[1];
        Root candidateRoot = refineRoot(eqn, 3, candidateRootX);

        return new Solution(candidateRoot, knownRoot1, knownRoot2);
    }

    private int solveCubic_constantIsZero(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        res[resOffset] = 0;
        int returnValue = 1;

        double[] quadEqn = new double[] { eqn[1], eqn[2], eqn[3] };
        int k = solveQuadratic(quadEqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, res, resOffset + 1);
        if (k == 1) {
            double[] line = cubicToLineSyntheticDivision(eqn, 0, res[resOffset + 1]);
            if (line[1] == 0) {
                returnValue = 2;
            } else {
                res[resOffset + 2] = refineRoot(eqn, 3, -line[0] / line[1]).x;
                returnValue = 3;
            }
        } else if (k == 2) {
            returnValue = 3;
        }
        returnValue = constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
        return returnValue;
    }

    /**
     * If the constant term in a cubic equation is near zero (that is: if it's exponent is significantly less
     * than other terms), then we'll use Newton's Method with an initial guess of x = 0 to find the first
     * root. Then use synthetic division to identify the remaining quadratic and solve it.
     */
    private Solution solveCubic_treatConstantAsZero(double[] eqn) {
        Root root1 = refineRoot(eqn, 3, 0);
        double[] quad = cubicToQuadSyntheticDivision(eqn, root1.x);
        int k = solveQuadratic(quad, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, quad, 0);
        switch (k) {
            case 2:
                Root root2 = refineRoot(eqn, 3, quad[0]);
                Root root3 = refineRoot(eqn, 3, quad[1]);
                return new Solution(root1, root2, root3);
            case 1:
                Root root4 = refineRoot(eqn, 3, quad[0]);
                return new Solution(root1, root4);
            default:
                return new Solution(root1);
        }
    }

    /**
     * This is used when the coefficient for the (x^3) is significantly smaller than all the other coefficients.
     * <p>
     * In this case: let's assume that coefficient can be treated as if it were nearly zero. That leaves
     * us with a quadratic. Solve that quadratic, and then apply Newton's Method to those N roots to hone
     * in on N of the cubic's roots. Then use synthetic division to identify the remaining root.
     * </p>
     * <p>
     * (It's also worth noting: the remaining root is probably far removed from the other roots. For ex if
     * two roots are between [0,1], then the third root might be around 1e10. So far this class's primary use
     * case relates to graphics and Bezier curves, so solutions outside of [0,1] will eventually be dropped.
     * It is useful to keep track of those roots until we're done, though, because if we can identify
     * three roots we often interpret that as "this approach worked because we can't possibly be missing any roots".)
     * </p>
     */
    private Solution solveCubic_treatLeadingCoefficientAsZero(double[] eqn) {
        double[] dst = new double[3];
        int k = solveQuadratic(eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, dst, 0);
        switch(k) {
            case 2:
                // they are already refined to fit the quadratic, but now refine them to fit the cubic:
                Root root1 = refineRoot(eqn, 3, dst[0]);
                Root root2 = refineRoot(eqn, 3, dst[1]);
                double[] line = cubicToLineSyntheticDivision(eqn, dst[0], dst[1]);
                Root root3 = refineRoot(eqn, 3, -line[0] / line[1]);
                return new Solution(root1, root2, root3);
            case 1:
                Root root4 = refineRoot(eqn, 3, dst[0]);
                double[] j = cubicToQuadSyntheticDivision(eqn, dst[0]);
                k = solveQuadratic(j, Double.NEGATIVE_INFINITY, Double.MAX_VALUE, j, 0);
                Solution returnValue;
                if (k == 1) {
                    returnValue = new Solution(root4, refineRoot(eqn, 3, j[0]));
                } else if (k == 2) {
                    returnValue = new Solution(root4, refineRoot(eqn, 3, j[0]), refineRoot(eqn, 3, j[1]));
                } else {
                    returnValue = new Solution(root4);
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

        return new double[] { cubicEqn[2] / cubicEqn[3] - b, 1 };
    }

    /**
     * Most of the time we used [0,3] nudges. If we use more than MAX_NUDGES
     * we're probably way off and nudging isn't going to fix our problems (but
     * it may become a major performance drain).
     */
    private static final int MAX_NUDGES = 50;

    private Root refineRoot(double[] eqn, int degree, double value) {
        double bestAbsY = Double.MAX_VALUE;
        double bestX = 0;

        for (int ctr = 300; ctr >= 0; ctr--) {
            double y = evaluate(eqn, degree, value);
            if (y == 0)
                return new Root(value, y);

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
                return new Root(newValue, yAbs);
            value = newValue;
        }

        // our bestX value might be really close now, but we might be able to do better.
        // For ex: if it's "5.9999999999" we might be able to nudge it to "6.0"

        int nudges = 0;
        double leftX = Math.nextDown(bestX);
        double leftYAbs = Math.abs(evaluate(eqn, 3, leftX));
        if (leftYAbs < bestAbsY) {
            while (leftYAbs < bestAbsY && nudges < MAX_NUDGES) {
                bestX = leftX;
                bestAbsY = leftYAbs;
                // TODO: look inside Math.nextDown; we can optimize this
                leftX = Math.nextDown(leftX);
                leftYAbs = Math.abs(evaluate(eqn, 3, leftX));
                nudges++;
            }
        } else {
            double rightX = Math.nextUp(bestX);
            double rightYAbs = Math.abs(evaluate(eqn, 3, rightX));
            while (rightYAbs < bestAbsY && nudges < MAX_NUDGES) {
                bestX = rightX;
                bestAbsY = rightYAbs;
                rightX = Math.nextUp(rightX);
                rightYAbs = Math.abs(evaluate(eqn, 3, rightX));
                nudges++;
            }
        }

        return new Root(bestX, bestAbsY);
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
                    dst[0] = refineRoot(eqn, 2, x).x;
                } else {
                    dst[0] = x;
                }
                return 1;
            }
        }

        int returnValue = QuadCurve2D.solveQuadratic(eqn, dst);
        if (refineRoots && returnValue > 0) {
            for (int a = 0; a < returnValue; a++) {
                dst[a] = refineRoot(eqn, 2, dst[a]).x;
            }
        }
        return returnValue;
    }
}