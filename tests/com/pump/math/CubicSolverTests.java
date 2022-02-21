package com.pump.math;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class CubicSolverTests extends TestCase {

    double[] SAMPLE_A_EQUATION = new double[] {-.1, 0, 1, 1};
    double[] SAMPLE_A_ROOTS = new double[] {-0.8669513175959772, -0.4126055722546906, 0.2795568898506678};
    double[] SAMPLE_A_ROOTS_NEG_1_TO_0 = new double[] {-0.8669513175959772, -0.4126055722546906};
    double[] SAMPLE_A_ROOTS_0_TO_1 = new double[] {0.2795568898506678};

    double[] SAMPLE_B_EQUATION = new double[] {-.5, -1, 1};
    double[] SAMPLE_B_ROOTS = new double[] {-0.36602540378443865, 1.3660254037844386};
    double[] SAMPLE_B_ROOTS_NEG_1_TO_0 = new double[] {-0.36602540378443865};
    double[] SAMPLE_B_ROOTS_0_TO_2 = new double[] {1.3660254037844386};

    /**
     * This makes sure our roots are sorted and bounded.
     */
    @Test
    public void testBasics_cubic() {
        for (CubicSolver solver : getSolvers()) {
            double[] res = new double[3];
            int rootCount = solver.solveCubic(SAMPLE_A_EQUATION, -10, 10, res, 0);
            assertEquals(SAMPLE_A_ROOTS.length, rootCount);
            testSimilar(SAMPLE_A_ROOTS, res, SAMPLE_A_ROOTS.length);

            rootCount = solver.solveCubic(SAMPLE_A_EQUATION, -1, 0, res, 0);
            assertEquals(SAMPLE_A_ROOTS_NEG_1_TO_0.length, rootCount);
            testSimilar(SAMPLE_A_ROOTS_NEG_1_TO_0, res, SAMPLE_A_ROOTS_NEG_1_TO_0.length);

            rootCount = solver.solveCubic(SAMPLE_A_EQUATION, 0, 1, res, 0);
            assertEquals(SAMPLE_A_ROOTS_0_TO_1.length, rootCount);
            testSimilar(SAMPLE_A_ROOTS_0_TO_1, res, SAMPLE_A_ROOTS_0_TO_1.length);

            rootCount = solver.solveCubic(SAMPLE_A_EQUATION, -2, -1, res, 0);
            assertEquals(0, rootCount);

            rootCount = solver.solveCubic(SAMPLE_A_EQUATION, 1, 100000, res, 0);
            assertEquals(0, rootCount);
        }
    }

    /**
     * This makes sure our roots are sorted and bounded.
     */
    @Test
    public void testBasics_quadratic() {
        for (CubicSolver solver : getSolvers()) {
            double[] res = new double[2];
            int rootCount = solver.solveQuadratic(SAMPLE_B_EQUATION, -10, 10, res, 0);
            assertEquals(SAMPLE_B_ROOTS.length, rootCount);
            testSimilar(SAMPLE_B_ROOTS, res, SAMPLE_B_ROOTS.length);

            rootCount = solver.solveQuadratic(SAMPLE_B_EQUATION, -1, 0, res, 0);
            assertEquals(SAMPLE_B_ROOTS_NEG_1_TO_0.length, rootCount);
            testSimilar(SAMPLE_B_ROOTS_NEG_1_TO_0, res, SAMPLE_B_ROOTS_NEG_1_TO_0.length);

            rootCount = solver.solveQuadratic(SAMPLE_B_EQUATION, 0, 2, res, 0);
            assertEquals(SAMPLE_B_ROOTS_0_TO_2.length, rootCount);
            testSimilar(SAMPLE_B_ROOTS_0_TO_2, res, SAMPLE_B_ROOTS_0_TO_2.length);

            rootCount = solver.solveQuadratic(SAMPLE_B_EQUATION, -2, -1, res, 0);
            assertEquals(0, rootCount);

            rootCount = solver.solveQuadratic(SAMPLE_B_EQUATION, 2, 100000, res, 0);
            assertEquals(0, rootCount);
        }
    }

    @Test
    public void testProblemCubic_1() {
        double[] eqn = new double[] {-0.17840294740142326, 17.15585614380484, -1.6553704005295913, -5.6843418860808015E-14};
        double[] res = new double[3];

        for (CubicSolver solver : getSolvers()) {
            int k = solver.solveCubic(eqn, 0, 1, res, 0);
            assertEquals(toString(res, 0, k), 1, k);
            double expectedRoot = 0.010409408593045498;
            testRoots(eqn, res, k);
            assertSimilar(expectedRoot, res[0]);
        }
    }

    @Test
    public void testProblemCubic_2() {
        boolean failed = false;
        for (int exp = 0; exp < 30; exp++) {
            double[] eqn = new double[]{-0.17840294740142326, 17.15585614380484, -1.6553704005295913, -5.6843418860808015 * Math.pow(10, -exp) };
            double[] res = new double[3];

            int expectedRootCount = -1;
            String expectedRoots = null;

            for (CubicSolver solver : getSolvers()) {
                try {
                    int k = solver.solveCubic(eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, res, 0);
                    if (expectedRootCount == -1) {
                        expectedRootCount = k;
                        expectedRoots = toString(res, 0, k);
                    } else {
                        assertEquals("expected "+expectedRoots+", but was "+toString(res, 0, k), expectedRootCount, k);
                    }

                    testRoots(eqn, res, k);
                } catch(Throwable e) {
                    System.err.println("exp = " + exp);
                    System.err.println("solver = " + solver);
                    e.printStackTrace();

                    failed = true;
                }
            }
        }
        if (failed)
            fail();
    }

    /**
     * This confirms that the roots are as close as possible to y = 0 with double precision. If we try
     * a double value that is larger or smaller than a given root: we start to stray farther from y = 0.
     */
    private void testRoots(double[] equation, double[] roots, int rootCount) {
        PolynomialFunction f = new PolynomialFunction(equation);
        for (int a = 0; a < rootCount; a++) {
            double root = roots[a];
            double value = f.evaluate(root);
            double rootUlp = Math.ulp(root);

            double rootIncr = root + rootUlp;
            double value1 = f.evaluate(rootIncr);

            assertTrue( "f("+root+") = "+value+", f("+root+" + "+rootUlp+") = "+value1, Math.abs(value/value1) <= 100);

            double rootDecr = root - rootUlp;
            double value2 = f.evaluate(rootDecr);
            assertTrue( "f("+root+") = "+value+", f("+root+" - "+rootUlp+") = "+value2, Math.abs(value/value2) <= 100);
        }
    }

    private String toString(double[] array, int offset, int length) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int a = 0; a < length; a++) {
            if (a != 0)
                sb.append(", ");
            sb.append(array[offset + a]);
        }
        sb.append("]");
        return sb.toString();
    }

    private void testSimilar(double[] expected, double[] actual, int length) {
        for(int a = 0; a < length; a++) {
            assertSimilar(expected[a], actual[a]);
        }
    }

    private void assertSimilar(double expected, double actual) {
        assertTrue( "expected = "+expected+", actual = "+actual,
                Math.abs(expected - actual) < .0000001 );
    }

    private CubicSolver[] getSolvers() {
        return new CubicSolver[] { new PolynomialCubicSolver(), new GeomCubicSolver()};
    }
}
