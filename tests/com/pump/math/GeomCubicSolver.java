package com.pump.math;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

/**
 * This uses the java.awt.geom classes CubicCurve2D and QuadCurve2D to solve equations.
 */
public class GeomCubicSolver extends CubicSolver {

    @Override
    public int solveCubic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        if (eqn[3] != 0) {
            double secondHighestCoeff = Math.abs(eqn[2] / eqn[3]);
            if (secondHighestCoeff > 1e8) {
                return solveQuadratic(eqn, minX, maxX, res, resOffset);
            }
        }
        double[] dst = resOffset == 0 ? res : new double[3];
        int returnValue = CubicCurve2D.solveCubic(eqn, dst);
        return constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);
    }

    @Override
    public int solveQuadratic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        if (eqn[2] != 0) {
            double secondHighestCoeff = Math.abs(eqn[1] / eqn[2]);
            if (secondHighestCoeff > 1e8) {
                double x = -eqn[0] / eqn[1];
                if (x >= minX && x <= maxX) {
                    res[resOffset] = x;
                    return 1;
                }
                return 0;
            }
        }

        double[] dst = resOffset == 0 ? res : new double[2];
        int returnValue = QuadCurve2D.solveQuadratic(eqn, dst);
        return constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);
    }
}
