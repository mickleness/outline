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
        return constrainAndSort(returnValue, minX, maxX, dst, res, resOffset);
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
        return constrainAndSort(returnValue, minX, maxX, dst, res, resOffset);
    }

    /**
     * This eliminates values outside [minX, maxX] and stores the results in sorted order in 'res'
     */
    private int constrainAndSort(int returnValue, double minX, double maxX, double[] data, double[] res, int resOffset) {
        // step 1: prune values that aren't between [minX, maxX]

        switch (returnValue) {
            case 3:
                boolean b1 = data[0] >= minX && data[0] <= maxX;
                boolean b2 = data[1] >= minX && data[1] <= maxX;
                boolean b3 = data[2] >= minX && data[2] <= maxX;

                if (b1 && b2 && b3) {
                    // intentionally empty
                } else if (b1 && b2 && !b3) {
                    returnValue = 2;
                } else if (b1 && !b2 && b3) {
                    data[1] = data[2];
                    returnValue = 2;
                } else if (b1 && !b2 && !b3) {
                    returnValue = 1;
                } else if (!b1 && b2 && b3) {
                    data[0] = data[1];
                    data[1] = data[2];
                    returnValue = 2;
                } else if (!b1 && b2 && !b3) {
                    data[0] = data[1];
                    returnValue = 1;
                } else if (!b1 && !b2 && b3) {
                    data[0] = data[2];
                    returnValue = 1;
                } else if (!b1 && !b2 && !b3) {
                    returnValue = 0;
                }
                break;
            case 2:
                boolean c1 = data[0] >= minX && data[0] <= maxX;
                boolean c2 = data[1] >= minX && data[1] <= maxX;

                if (c1 && c2) {
                    // intentionally empty
                } else if (c1 && !c2) {
                    returnValue = 1;
                } else if (!c1 && c2) {
                    data[0] = data[1];
                    returnValue = 1;
                } else if (!c2 && !c2) {
                    returnValue = 0;
                }
                break;
            case 1:
                boolean d1 = data[0] >= minX && data[0] <= maxX;
                if (d1) {
                    // intentionally empty
                } else {
                    returnValue = 0;
                }
        }

        // step 2: sort values and store in `res`

        switch (returnValue) {
            case 3:
                double min = data[1] < data[2] ? data[1] : data[2];
                min = min < data[0] ? min : data[0];

                double max = data[1] > data[2] ? data[1] : data[2];
                max = max > data[0] ? max : data[0];

                double middle;
                if ((min == data[0] || min == data[1]) &&
                        (max == data[0] || max == data[1])) {
                    middle = data[2];
                } else if ((min == data[0] || min == data[2]) &&
                        (max == data[0] || max == data[2])) {
                    middle = data[1];
                } else {
                    middle = data[0];
                }

                res[resOffset] = min;
                res[resOffset + 1] = middle;
                res[resOffset + 2] = max;
                break;
            case 2:
                if (data[0] < data[1]) {
                    min = data[0];
                    max = data[1];
                } else {
                    min = data[1];
                    max = data[0];
                }

                res[resOffset] = min;
                res[resOffset + 1] = max;
                break;
            case 1:
                res[resOffset] = data[0];
        }

        return returnValue;
    }
}
