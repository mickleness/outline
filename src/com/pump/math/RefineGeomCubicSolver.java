package com.pump.math;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import java.util.LinkedList;
import java.util.List;

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
     * fallback CubicSolver to be safe.
     */
    protected static class PossibleDoubleRootException extends RuntimeException {

    }

    static class Solution {
        double[] roots;

        public Solution(double root1) {
            roots = new double[] { root1 };
        }

        public Solution(double root1, double root2) {
            if (root1 < root2) {
                roots = new double[] { root1, root2};
            } else {
                roots = new double[] { root2, root1 };
            }
        }

        public Solution(double root1, double root2, double root3) {
            roots = new double[] { root1, root2, root3 };
            // sort the roots:
            constrainAndSort(3, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, roots, 0, roots, 0);
        }

        public Solution(double[] roots) {
            this.roots = roots;
            constrainAndSort(roots.length, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, roots, 0, roots, 0);
        }

        public int getRoots(double[] dst) {
            System.arraycopy(roots, 0, dst, 0, roots.length);
            return roots.length;
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

        /**
         * Identify which Solution produces y-values that are closer to zero.
         * @return -1 if this object produces y-values that are closer, 1 if the argument produces y-values that
         * are closer, or 0 if they're equivalent in this respect.
         */
        public int compareTo(double[] eqn, Solution other) {
            if (roots.length > other.roots.length)
                return -1;
            if (roots.length < other.roots.length)
                return 1;

            double y0 = evaluate(eqn, 3, roots[0]);
            double y1 = evaluate(eqn, 3, roots[1]);
            double y2 = evaluate(eqn, 3, roots[2]);

            double otherY0 = evaluate(eqn, 3, other.roots[0]);
            double otherY1 = evaluate(eqn, 3, other.roots[1]);
            double otherY2 = evaluate(eqn, 3, other.roots[2]);

            double sum = 0;
            double otherSum = 0;

            if (y0 != otherY0) {
                sum += y0 * y0;
                otherSum += otherY0 * otherY0;
            }

            if (y1 != otherY1) {
                sum += y1 * y1;
                otherSum += otherY1 * otherY1;
            }

            if (y2 != otherY2) {
                sum += y2 * y2;
                otherSum += otherY2 * otherY2;
            }

            return Double.compare(sum, otherSum);
        }
    }

    @Override
    public int solveCubic(final double[] eqn,final double minX,final double maxX,final double[] res,final int resOffset) {
        try {
            // first consider cases that are guaranteed to be simpler:
            if (eqn[3] == 0) {
                return solveQuadratic(eqn, minX, maxX, res, resOffset);
            } else if (eqn[0] == 0) {
                return solveCubic_constantIsZero(eqn, minX, maxX, res, resOffset);
            }

            double[] dst = resOffset == 0 ? res : new double[3];
            int returnValue = CubicCurve2D.solveCubic(eqn, dst);

            List<Solution> solutions = new LinkedList<>();
            if (returnValue == 1) {
                solutions.add(new Solution(refineRoot(eqn, 3, dst[0])));
            } else if (returnValue == 2) {
                solutions.add(new Solution(refineRoot(eqn, 3, dst[0]),
                        refineRoot(eqn, 3, dst[1]),
                        refineRoot(eqn, 3, dst[2])));
            } else {
                solutions.add(new Solution(refineRoot(eqn, 3, dst[0]),
                        refineRoot(eqn, 3, dst[1])));
            }

            int exp0 = Math.getExponent(eqn[0]);
            int exp1 = Math.getExponent(eqn[1]);
            int exp2 = Math.getExponent(eqn[2]);
            int exp3 = Math.getExponent(eqn[3]);

            boolean isVerySmallLeadingCoefficient = (exp3 < exp2 - 8) && (exp3 < exp1 - 8) && (exp3 < exp0 - 8);

            if (isVerySmallLeadingCoefficient) {
                // if there's a very wide disparity between the (x^3) coefficient and the (x^2) coefficient
                // then Cubic2D.solveCubic can miss some:
                solutions.add(solveCubic_treatLeadingCoefficientAsZero(eqn));
            }


            boolean isVerySmallConstant = (exp0 < exp1 - 8) && (exp0 < exp2 - 8) && (exp0 < exp3 - 8);
            if (isVerySmallConstant) {
                solutions.add(solveCubic_treatConstantAsZero(eqn));
            }

            for (Solution s : solutions.toArray(new Solution[0])) {
                if (s.roots.length == 2) {
                    Solution threeRoots = solveCubic_twoKnownRoots(eqn, dst[0], dst[1]);
                    if (threeRoots != null)
                        solutions.add(threeRoots);
                }
            }

            if (Math.max(Math.max(exp0, exp1), Math.max(exp2, exp3)) > 50) {
                for (Solution s : solutions.toArray(new Solution[0])) {
                    for (Solution newS : solveCubic_findAltSolutions(eqn, s.roots)) {
                        if (newS != null)
                            solutions.add(newS);
                    }
                }

                Solution currentSolution = solutions.remove(0);
                for (Solution altSolution : solutions) {
                    if (altSolution == null)
                        break;

                    if (altSolution.compareTo(eqn, currentSolution) < 0) {
                        currentSolution = altSolution;
                    }
                }

                returnValue = currentSolution.getRoots(dst);
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

            return constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);
        } catch(Exception e) {
            return new BinarySearchCubicSolver().solveCubic(eqn, minX, maxX, res, resOffset);
        }
    }

    private Solution[] solveCubic_findAltSolutions(double[] eqn, double[] threeRoots) {
        Solution[] returnValue = new Solution[6];
        int ctr = 0;
        for (double initialRoot : threeRoots) {
            double[] quad = cubicToQuadSyntheticDivision(eqn, initialRoot);
            int k = solveQuadratic(quad, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, quad, 0);
            if (k == 1) {
                quad[0] = refineRoot(eqn, 3, quad[0]);
                double[] line = cubicToLineSyntheticDivision(eqn, initialRoot, quad[0]);
                double lastRoot = -line[0] / line[1];
                lastRoot = refineRoot(eqn, 3, lastRoot);
                returnValue[ctr++] = new Solution(initialRoot, quad[0], lastRoot);
            } else if (k == 2) {
                quad[0] = refineRoot(eqn, 3, quad[0]);
                quad[1] = refineRoot(eqn, 3, quad[1]);

                double[] line = cubicToLineSyntheticDivision(eqn, initialRoot, quad[0]);
                double lastRoot = -line[0] / line[1];
                lastRoot = refineRoot(eqn, 3, lastRoot);

                returnValue[ctr++] = new Solution(initialRoot, quad[0], lastRoot);

                line = cubicToLineSyntheticDivision(eqn, initialRoot, quad[1]);
                lastRoot = -line[0] / line[1];
                lastRoot = refineRoot(eqn, 3, lastRoot);

                returnValue[ctr++] = new Solution(initialRoot, quad[1], lastRoot);
            }
        }

        return returnValue;
    }

    private Solution solveCubic_twoKnownRoots(double[] eqn, double knownRoot1, double knownRoot2) {
        // explore the possibility that there's a double root:

        double[] doubleRootLine1 = cubicToLineSyntheticDivision(eqn, knownRoot1, knownRoot1);
        double altRoot2 = -doubleRootLine1[0] / doubleRootLine1[1];
        double ratio = knownRoot2 / altRoot2;
        if (ratio >= .999999 && ratio <= 1.000001) {
            // this looks like knownRoot1 is a double root; this is OK.
            return null;
        }

        double[] doubleRootLine2 = cubicToLineSyntheticDivision(eqn, knownRoot2, knownRoot2);
        double altRoot1 = -doubleRootLine2[0] / doubleRootLine2[1];
        ratio = knownRoot1 / altRoot1;
        if (ratio >= .999999 && ratio <= 1.000001) {
            // this looks like knownRoot2 is a double root; this is OK.
            return null;
        }

        double[] line = cubicToLineSyntheticDivision(eqn, knownRoot1, knownRoot2);
        double candidateRoot = - line[0] / line[1];
        candidateRoot = refineRoot(eqn, 3, candidateRoot);

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
                res[resOffset + 2] = refineRoot(eqn, 3, -line[0] / line[1]);
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
        double root1 = refineRoot(eqn, 3, 0);
        double[] quad = cubicToQuadSyntheticDivision(eqn, root1);
        int k = solveQuadratic(quad, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, quad, 0);
        switch (k) {
            case 2:
                quad[0] = refineRoot(eqn, 3, quad[0]);
                quad[1] = refineRoot(eqn, 3, quad[1]);
                return new Solution(root1, quad[0], quad[1]);
            case 1:
                quad[0] = refineRoot(eqn, 3, quad[0]);
                return new Solution(root1, quad[0]);
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
                dst[0] = refineRoot(eqn, 3, dst[0]);
                dst[1] = refineRoot(eqn, 3, dst[1]);
                double[] line = cubicToLineSyntheticDivision(eqn, dst[0], dst[1]);
                dst[2] = refineRoot(eqn, 3, -line[0] / line[1]);
                return new Solution(dst);
            case 1:
                dst[0] = refineRoot(eqn, 3, dst[0]);
                double[] j = cubicToQuadSyntheticDivision(eqn, dst[0]);
                k = solveQuadratic(j, Double.NEGATIVE_INFINITY, Double.MAX_VALUE, j, 0);
                if (k == 1) {
                    return new Solution(dst[0], refineRoot(eqn, 3, j[0]));
                } else if (k == 2) {
                    return new Solution(dst[0], refineRoot(eqn, 3, j[0]), refineRoot(eqn, 3, j[1]));
                } else {
                    return new Solution(dst[0]);
                }
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

        // our bestX value might be really close now, but we might be able to do better.
        // For ex: if it's "5.9999999999" we might be able to nudge it to "6.0"

        int nudges = 0;
        double leftX = Math.nextDown(bestX);
        double leftYAbs = Math.abs(evaluate(eqn, 3, leftX));
        if (leftYAbs < bestAbsY) {
            while (leftYAbs < bestAbsY && nudges < MAX_NUDGES) {
                bestX = leftX;
                bestAbsY = leftYAbs;
                // TODO: look inside Math.nextDown; we can optimize this, + the else block's loop
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