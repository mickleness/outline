package com.pump.math;

import java.awt.geom.CubicCurve2D;

public class MathUtils {

    /**
     * This is an alternative to {@link CubicCurve2D#solveCubic(double[], double[])} with
     * improved precision.
     * <p>
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
     * @param minX the minimum X value to consider
     * @param maxX the maximum X value to consider
     * @return the number of roots between the min and max, or -1 if the equation is a constant
     * @since 1.3
     */
    public static int solveCubic(double[] eqn, double[] res, double minX, double maxX) {
        int returnValue = 0;

        // TODO : in the "area" project/repo I had encouraging results optimizing
        // the Order3's solve-cubic logic. We should revisit that approach when
        // we branch the Area class itself.

        // this is the code that doesn't pass our unit test that we're trying to replace:

//        double[] results = new double[3];
//        int k = CubicCurve2D.solveCubic(eqn, results);
//
//        for (int a = 0; a < k; a++) {
//            if (results[a] >= minX && results[a] <= maxX) {
//                res[returnValue++] = results[a];
//            }
//        }

        double[] eqn2 = new double[] { eqn[3], eqn[2], eqn[1], eqn[0]};
        PolynomialFunction p = new PolynomialFunction(eqn2, false);
        if (p.getDegree() <= 1)
            return -1;

        int resultCount = p.solve(0, eqn, 0);

        for(int i = 0; i < resultCount; i++) {
            double result = eqn[i];
            if (result >= minX && result <= maxX) {
                res[returnValue++] = result;
            }
        }

        return returnValue;
    }
}
