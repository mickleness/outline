package com.pump.math;

import junit.framework.TestCase;

import java.util.Arrays;

public class PolynomialFunctionTest extends TestCase {

    /**
     * This tests a cubic polynomial with a leading coefficient of zero.
     * (So it is effectively a quadratic polynomial.)
     */
    public void testDegenerateCubic_1() {
        double[] eqn = {0, 46.862915010152385, -46.86291501015239, 8.715728752538102};
        PolynomialFunction f = new PolynomialFunction(eqn);
        double[] solutions = f.solve();
        assertEquals(Arrays.toString(solutions), 2, solutions.length);
        Arrays.sort(solutions, 0, solutions.length);
        assertTrue(Double.toString(solutions[0]), Math.abs(solutions[0] - 0.24698516981) < .00001);
        assertTrue(Double.toString(solutions[1]), Math.abs(solutions[1] - 0.75301483018) < .00001);
    }

    /**
     * This tests a quadratic polynomial with a leading coefficient near zero.
     * So it has 2 roots, but one is very large.
     */
    public void testDegenerateQuadratic_1() {
        double[] eqn = new double[] { 4.263256414560601E-14, -93.72583002030478, 46.86291501015239};
        PolynomialFunction f = new PolynomialFunction(eqn);
        double[] solutions = f.solve();

        assertEquals(Arrays.toString(solutions), 2, solutions.length);
        Arrays.sort(solutions, 0, solutions.length);
        assertTrue(Double.toString(solutions[0]), Math.abs(solutions[0] - .5) < .00001);
        assertTrue(Double.toString(solutions[1]), Math.abs(solutions[1] - 2.198456318512682E15) < 10000);
    }

    /**
     * This tests a cubic polynomial with a leading coefficient near zero.
     * So it has 3 roots, but one is very large.
     */
    public void testDegenerateCubic_2() {
        double[] eqn = {1.4210854715202004E-14, -46.86291501015239, 46.86291501015239, -5.715728752538098};

        PolynomialFunction f = new PolynomialFunction(eqn);
        double[] solutions = f.solve();
        assertEquals(Arrays.toString(solutions), 3, solutions.length);
        Arrays.sort(solutions, 0, solutions.length);
        assertTrue(Double.toString(solutions[0]), Math.abs(solutions[0] - .14218299566818918) < .00001);
        assertTrue(Double.toString(solutions[1]), Math.abs(solutions[1] - .8578170043318111) < .00001);
        assertTrue(Double.toString(solutions[2]), Math.abs(solutions[2] - 3.297684477769023E15) < 1000);
    }
}
