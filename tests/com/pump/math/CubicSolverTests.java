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
            // TODO: finer detail
            assertTrue( "expected 0.0104, found "+res[0], Math.abs(res[0] - 0.0104) < .0001);
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
            assertTrue( "expected = "+expected[a]+", actual = "+actual[a],
                    Math.abs(expected[a] - actual[a]) < .0000001 );
        }
    }

    private CubicSolver[] getSolvers() {
        return new CubicSolver[] { new GeomCubicSolver() };
    }
}
