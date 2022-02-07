package com.pump.math;

import junit.framework.TestCase;

import java.util.Arrays;

public class PolynomialFunctionTest extends TestCase {
    public void testDegenerateCubic() {
        double[] eqn = {0, 46.862915010152385, -46.86291501015239, 8.715728752538102};
        PolynomialFunction f = new PolynomialFunction(eqn);
        double[] solutions = f.solve();
        assertEquals(Arrays.toString(solutions), 2, solutions.length);
        assertTrue(Double.toString(solutions[0]), Math.abs(solutions[0] - 0.24698516981) < .00001);
        assertTrue(Double.toString(solutions[1]), Math.abs(solutions[1] - 0.75301483018) < .00001);
    }
}
