package com.pump.math;

import java.util.Objects;

public abstract class CubicSolver {

    private static CubicSolver DEFAULT_SOLVER = new RefineGeomCubicSolver();

    /**
     * Return the session's current default CubicSolver.
     */
    public static CubicSolver getDefault() {
        return DEFAULT_SOLVER;
    }

    public static void setDefault(CubicSolver solver) {
        DEFAULT_SOLVER = Objects.requireNonNull(solver);
    }

    /**
     * Solve the cubic whose coefficients are in the {@code eqn}
     * array and place the non-complex roots into the {@code res}
     * array, returning the number of roots.
     * The cubic solved is represented by the equation:
     *     eqn = {c, b, a, d}
     *     dx^3 + ax^2 + bx + c = 0
     * A return value of -1 is used to distinguish a constant equation,
     * which may be always 0 or never 0, from an equation which has no
     * zeroes.
     * @param eqn the specified array of coefficients to use to solve
     *        the cubic equation
     * @param res the array that contains the non-complex roots
     *        resulting from the solution of the cubic equation
     * @return the number of roots, or -1 if the equation is a constant
     */
    public abstract int solveCubic(double[] eqn, double minX, double maxX, double[] res, int resOffset);

    /**
     * Solves the quadratic whose coefficients are in the {@code eqn}
     * array and places the non-complex roots into the {@code res}
     * array, returning the number of roots.
     * The quadratic solved is represented by the equation:
     * <pre>
     *     eqn = {C, B, A};
     *     ax^2 + bx + c = 0
     * </pre>
     * A return value of {@code -1} is used to distinguish a constant
     * equation, which might be always 0 or never 0, from an equation that
     * has no zeroes.
     * @param eqn the specified array of coefficients to use to solve
     *        the quadratic equation
     * @param res the array that contains the non-complex roots
     *        resulting from the solution of the quadratic equation
     * @return the number of roots, or {@code -1} if the equation is
     *  a constant.
     */
    public abstract int solveQuadratic(double[] eqn, double minX, double maxX, double[] res, int resOffset);


    /**
     * This eliminates values outside [minX, maxX] and stores the results in sorted order in 'res'
     */
    protected static int constrainAndSort(int returnValue, double minX, double maxX, double[] data, int dataOffset, double[] res, int resOffset) {
        // step 1: prune values that aren't between [minX, maxX]

        switch (returnValue) {
            case 3:
                boolean b1 = data[dataOffset] >= minX && data[dataOffset] <= maxX;
                boolean b2 = data[dataOffset + 1] >= minX && data[dataOffset + 1] <= maxX;
                boolean b3 = data[dataOffset + 2] >= minX && data[dataOffset + 2] <= maxX;

                if (b1 && b2 && b3) {
                    // intentionally empty
                } else if (b1 && b2 && !b3) {
                    returnValue = 2;
                } else if (b1 && !b2 && b3) {
                    data[dataOffset + 1] = data[dataOffset + 2];
                    returnValue = 2;
                } else if (b1 && !b2 && !b3) {
                    returnValue = 1;
                } else if (!b1 && b2 && b3) {
                    data[dataOffset] = data[dataOffset + 1];
                    data[dataOffset + 1] = data[dataOffset + 2];
                    returnValue = 2;
                } else if (!b1 && b2 && !b3) {
                    data[dataOffset] = data[dataOffset + 1];
                    returnValue = 1;
                } else if (!b1 && !b2 && b3) {
                    data[dataOffset] = data[dataOffset + 2];
                    returnValue = 1;
                } else if (!b1 && !b2 && !b3) {
                    returnValue = 0;
                }
                break;
            case 2:
                boolean c1 = data[dataOffset] >= minX && data[dataOffset] <= maxX;
                boolean c2 = data[dataOffset + 1] >= minX && data[dataOffset + 1] <= maxX;

                if (c1 && c2) {
                    // intentionally empty
                } else if (c1 && !c2) {
                    returnValue = 1;
                } else if (!c1 && c2) {
                    data[dataOffset] = data[dataOffset + 1];
                    returnValue = 1;
                } else if (!c2 && !c2) {
                    returnValue = 0;
                }
                break;
            case 1:
                boolean d1 = data[dataOffset] >= minX && data[dataOffset] <= maxX;
                if (d1) {
                    // intentionally empty
                } else {
                    returnValue = 0;
                }
        }

        // step 2: sort values and store in `res`

        switch (returnValue) {
            case 3:
                double min = data[dataOffset + 1] < data[dataOffset + 2] ? data[dataOffset + 1] : data[dataOffset + 2];
                min = min < data[dataOffset] ? min : data[dataOffset];

                double max = data[dataOffset + 1] > data[dataOffset + 2] ? data[dataOffset + 1] : data[dataOffset + 2];
                max = max > data[dataOffset] ? max : data[dataOffset];

                if (min == max) {
                    res[resOffset] = min;
                    returnValue = 1;
                    break;
                }

                double middle;
                if ((min == data[dataOffset] || min == data[dataOffset + 1]) &&
                        (max == data[dataOffset] || max == data[dataOffset + 1])) {
                    middle = data[dataOffset + 2];
                } else if ((min == data[dataOffset] || min == data[dataOffset + 2]) &&
                        (max == data[dataOffset] || max == data[dataOffset + 2])) {
                    middle = data[dataOffset + 1];
                } else {
                    middle = data[dataOffset];
                }

                if (middle == min || middle == max) {
                    res[resOffset] = min;
                    res[resOffset + 1] = max;
                    returnValue = 2;
                    break;
                }

                res[resOffset] = min;
                res[resOffset + 1] = middle;
                res[resOffset + 2] = max;
                break;
            case 2:
                if (data[dataOffset] < data[dataOffset + 1]) {
                    min = data[dataOffset];
                    max = data[dataOffset + 1];
                } else {
                    min = data[dataOffset + 1];
                    max = data[dataOffset];
                }

                if (min == max) {
                    res[resOffset] = min;
                    returnValue = 1;
                    break;
                }

                res[resOffset] = min;
                res[resOffset + 1] = max;
                break;
            case 1:
                res[resOffset] = data[dataOffset];
        }

        return returnValue;
    }

    protected static double evaluate(double[] eqn, int degree, double x) {
        switch (degree) {
            case 3:
                return eqn[0] + x * (eqn[1] + x * (eqn[2] + x * eqn[3]));
            case 2:
                return eqn[0] + x * (eqn[1] + x * eqn[2]);
            case 1:
                return eqn[0] + x * eqn[1];
            case 0:
                return eqn[0];
            default:
                throw new IllegalArgumentException("degree = "+degree);
        }
    }

    protected double evaluateDerivative(double[] eqn, int degree, double x) {
        switch (degree) {
            case 3:
                return eqn[1] + x * (2 * eqn[2] + 3 * x * eqn[3]);
            case 2:
                return eqn[1] + 2 * x * eqn[2];
            case 1:
                return eqn[1];
            case 0:
                return 0;
            default:
                throw new IllegalArgumentException("degree = "+degree);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
