package com.pump.math;

import junit.framework.TestCase;

import java.awt.geom.QuadCurve2D;
import java.util.Arrays;

public class RefineGeomCubicSolverTests extends TestCase {

    public void testCubicToQuadSyntheticDivision() {
        for (int root1 = 0; root1 <= 40; root1++) {
            for (int root2 = 0; root2 <= 40; root2++) {
                for (int root3 = 0; root3 <= 40; root3++) {
                    for(double multiplier : new double[] {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5}) {
                        Polynomial p = Polynomial.createFromRoots(root1, root2, root3, multiplier);
                        try {
                            double[] quadEqn = new RefineGeomCubicSolver().cubicToQuadSyntheticDivision(p.eqn, root1);
                            double[] quadRoots = new double[2];
                            int quadRootCtr = QuadCurve2D.solveQuadratic(quadEqn, quadRoots);
                            Arrays.sort(quadRoots, 0, quadRootCtr);

                            if (Math.abs(quadRoots[0]) == 0)
                                quadRoots[0] = 0;
                            if (Math.abs(quadRoots[1]) == 0)
                                quadRoots[1] = 0;

                            double[] remainingRoots = new double[] {root2, root3};
                            Arrays.sort(remainingRoots);

                            if (quadRootCtr == 2) {
                                assertEquals(remainingRoots[0], quadRoots[0]);
                                assertEquals(remainingRoots[1], quadRoots[1]);
                            } else if (quadRootCtr == 1) {
                                assertEquals(remainingRoots[0], quadRoots[0]);
                                assertEquals(remainingRoots[1], quadRoots[0]);
                            } else {
                                fail("quadRootCtr = "+quadRootCtr);
                            }
                        } catch(Throwable t) {
                            System.err.println("root1 = "+root1);
                            System.err.println("root2 = "+root2);
                            System.err.println("root3 = "+root3);
                            System.err.println("multiplier = "+multiplier);
                            System.err.println(p.getEquationString());
                            throw t;
                        }
                    }
                }
            }
        }
    }


    public void testCubicToLineSyntheticDivision() {
        for (int root1 = 0; root1 <= 40; root1++) {
            for (int root2 = 0; root2 <= 40; root2++) {
                for (int root3 = 0; root3 <= 40; root3++) {
                    for(double multiplier : new double[] {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5}) {
                        Polynomial p = Polynomial.createFromRoots(root1, root2, root3, multiplier);
                        try {
                            double[] lineEqn = new RefineGeomCubicSolver().cubicToLineSyntheticDivision(p.eqn, root1, root2);
                            double derivedRoot3 = -lineEqn[0] / lineEqn[1];

                            if (Math.abs(derivedRoot3) == 0)
                                derivedRoot3 = 0;

                            assertEquals( (double) root3, derivedRoot3);
                        } catch(Throwable t) {
                            System.err.println("root1 = "+root1);
                            System.err.println("root2 = "+root2);
                            System.err.println("root3 = "+root3);
                            System.err.println("multiplier = "+multiplier);
                            System.err.println(p.getEquationString());
                            throw t;
                        }
                    }
                }
            }
        }
    }
}
