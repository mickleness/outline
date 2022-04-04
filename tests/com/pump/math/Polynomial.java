package com.pump.math;

public class Polynomial {

    protected static Polynomial createFromRoots(double root1, double root2, double root3, double multiplier) {
        double[] eqn = new double[]{
                (multiplier) * (-root1 * root2 * root3),
                (multiplier) * (root1 * root2 + root1 * root3 + root2 * root3),
                (multiplier) * (-root1 - root2 - root3),
                (multiplier) * (1)};
        double[] allRoots = new double[]{root1, root2, root3};
        int uniqueRootCount = CubicSolver.constrainAndSort(3, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, allRoots, 0, allRoots, 0);

        double[] results = new double[uniqueRootCount];
        System.arraycopy(allRoots, 0, results, 0, uniqueRootCount);

        return new Polynomial(eqn, results);
    }


    double[] eqn, roots;

    /**
     * @param eqn the coefficients where the nth term corresponds to the (x^n) variable
     * @param roots the roots of this polynomial. This only contains unique values, so a
     *              single element might be a double or triple root.
     *
     * @throws ArithmeticException is any argument is NaN, infinite, or any of the roots end up creating an
     *                             infinite y value. Also this throws an ArithmeticException if
     *                             the roots argument indicates we expect a double or triple root,
     *                             but due to rounding error the cubic equation that we produce doesn't
     *                             exactly produce f(root) = 0.
     */
    public Polynomial(double[] eqn, double[] roots) throws ArithmeticException {
        this.eqn = eqn;
        this.roots = roots;

        for (int a = 0; a < eqn.length; a++) {
            if (Double.isNaN(eqn[a]) || Double.isInfinite(eqn[a]))
                throw new ArithmeticException(toString());
        }
        for (int a = 0; a < roots.length; a++) {
            if (Double.isNaN(roots[a]) || Double.isInfinite(roots[a]))
                throw new ArithmeticException(toString());
            double y = CubicSolver.evaluate(eqn, eqn.length - 1, roots[a]);

            if (y != 0) {
                if (isDoubleOrTripleRoot(roots[a])) {
                    // this rules out a LOT of polynomials, but we can't really test our math in good faith otherwise.
                    // for ex: if f(y) = 1e-14, then either:
                    //   A. if this crosses the y-axis there are two roots (made possible by machine error)
                    //   B. if this doesn't cross the y-axis: this isn't technically a root, even though it should be
                    throw new ArithmeticException(this + ", f(" + roots[a] + ") = " + y);
                } else {
                    if (Double.isNaN(y) || Double.isInfinite(y))
                        throw new ArithmeticException(toString());
                }
            }
        }
    }

    private boolean isDoubleOrTripleRoot(double root) {
        int occurances = 0;
        for (int a = 0; a < roots.length; a++) {
            if (roots[a] == root)
                occurances++;
        }
        return occurances > 1;
    }

    @Override
    public String toString() {
        return "Polynomial[ eqn = " + CubicSolverTests.toString(eqn, 0, eqn.length) + ", expected results = " + CubicSolverTests.toString(roots, 0, roots.length) + "]";
    }

    /**
     * This returns a "y = ..." equation as a String.
     * <p>
     * This can be copied and pasted into a graphing utility (like Grapher on Mac)
     * to help visualize a polynomial's roots.
     * </p>
     */
    public String getEquationString() {
        StringBuilder sb = new StringBuilder();
        sb.append("y = ");
        boolean needsPlus = false;
        for (int a = 0; a < eqn.length; a++) {
            if (eqn[a] != 0) {
                if (needsPlus && eqn[a] > 0) {
                    sb.append('+');
                }
                needsPlus = true;
                sb.append(Double.toString(eqn[a]));
                if (a == 0) {
                    // do nothing
                } else if (a == 1) {
                    sb.append("*x");
                } else {
                    sb.append("*(x^" + a + ")");
                }
            }
        }
        return sb.toString();
    }
}
