package com.pump.math;

public class PolynomialCubicSolver extends CubicSolver {
    @Override
    public int solveCubic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        PolynomialFunction f = new PolynomialFunction(eqn, 4);
        int returnValue = f.solve(0, res, resOffset);
        returnValue = constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
        return returnValue;
    }

    @Override
    public int solveQuadratic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
        PolynomialFunction f = new PolynomialFunction(eqn, 3);
        int returnValue = f.solve(0, res, resOffset);
        returnValue = constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
        return returnValue;
    }
}
