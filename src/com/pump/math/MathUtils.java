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
     * @param minX the minimum X value to consider. If a root is found that is less than this number it is ignored.
     * @param maxX the maximum X value to consider. If a root is found that is greater than this number it is ignored.
     * @return the number of roots written to 'res' between the min and max, or -1 if the equation is a constant.
     */
    public static int solveCubic(double[] eqn, double[] res, double minX, double maxX) {
        // TODO: in the "area" project/repo I had encouraging results optimizing
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

        PolynomialFunction p = new PolynomialFunction(eqn, false);
        if (p.getDegree() <= 1)
            return -1;

        int resultCount = p.solve(0, res, 0);

        if (resultCount > 0) {
            int minIndex = 0;
            int maxIndex = resultCount - 1;
            for (int i = minIndex; i <= maxIndex; i++) {
                if (res[i] < minX || res[i] > maxX) {
                    for (int z = i + 1; z <= maxIndex; z++) {
                        res[z-1] = res[z];
                    }
                    maxIndex--;
                    resultCount--;
                }
            }
        }

        return resultCount;
    }
}
