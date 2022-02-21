package com.pump.math;

public abstract class CubicSolver {

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
}
