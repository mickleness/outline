package com.pump.math;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;

/**
 * This uses the java.awt.geom classes CubicCurve2D and QuadCurve2D to solve equations.
 */
public class GeomCubicSolver extends CubicSolver {

    @Override
    public int solveCubic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        double[] dst = resOffset == 0 ? res : new double[3];
        int returnValue = CubicCurve2D.solveCubic(eqn, dst);
        return constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);
    }

    @Override
    public int solveQuadratic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        double[] dst = resOffset == 0 ? res : new double[2];
        int returnValue = QuadCurve2D.solveQuadratic(eqn, dst);
        return constrainAndSort(returnValue, minX, maxX, dst, 0, res, resOffset);
    }
}
