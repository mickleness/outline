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
     * @param eqn the coefficients were the nth term corresponds to the (x^n) variable
     * @param roots the roots this polynomial. This only contains unique values, so a
     *              single element might be a double or triple root.
     */
    public Polynomial(double[] eqn, double[] roots) {
        this.eqn = eqn;
        this.roots = roots;
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
