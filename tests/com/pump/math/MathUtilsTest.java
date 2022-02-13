package com.pump.math;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class MathUtilsTest extends TestCase {

    @Test
    public void testSolveCubic_1() {
        double[] eqn = new double[] {-0.17840294740142326, 17.15585614380484, -1.6553704005295913, -5.6843418860808015E-14};
        double[] res = new double[3];
        int k = MathUtils.solveCubic(eqn, res, 0, 1);
        assertEquals(Arrays.toString(res), 1, k);
        assertTrue( "expected 0.0104, found "+res[0], Math.abs(res[0] - 0.0104) < .0001);
    }

    @Test
    public void testSolveCubic_2() {
        double[] eqn = new double[] {18.89076737162236, 0, 0, 0};
        double[] res = new double[3];
        int k = MathUtils.solveCubic(eqn, res, 0, 1);
        assertEquals(Arrays.toString(res), -1, k);
    }
}
