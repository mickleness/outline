package com.pump.math;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CubicSolverTests extends TestCase {

    class Sample {
        double[] eqn, expectedResults;

        public Sample(double[] eqn, double[] results) {
            this.eqn = eqn;
            this.expectedResults = results;
        }

        public void test(CubicSolver solver) {
            double[] actualResults = new double[3];
            try {
                int rootCount;
                if (eqn.length == 4) {
                    rootCount = solver.solveCubic(eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, actualResults, 0);
                } else if (eqn.length == 3) {
                    rootCount = solver.solveQuadratic(eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, actualResults, 0);
                } else {
                    throw new IllegalStateException();
                }

                if (expectedResults.length == 0) {
                    assertTrue("rootCount = " + rootCount, rootCount <= 0);
                } else {
                    assertEquals(
                            CubicSolverTests.toString(actualResults, 0, rootCount),
                            expectedResults.length, rootCount);
                    for (int a = 0; a < rootCount; a++) {
                        assertSimilar("root #" + (a + 1) + " should be " + expectedResults[a] + ", but was " + actualResults[a],
                                expectedResults[a], actualResults[a]);
                    }
                }
            } catch (Throwable t) {
                System.err.println(solver);
                System.err.println(this);
                throw t;
            }
        }

        @Override
        public String toString() {
            return "Sample[ eqn = " + CubicSolverTests.toString(eqn, 0, eqn.length) + ", expected results = " + CubicSolverTests.toString(expectedResults, 0, expectedResults.length) + "]";
        }
    }

    private void assertSimilar(String msg, double expected, double actual) {
        if (expected == 0) {
            assertTrue(msg, Math.abs(actual) < .0000000000001);
        } else {
            double ulp1 = Math.ulp(expected);
            double ulp2 = Math.ulp(actual);
            double ulp = Math.max(ulp1, ulp2);
            assertTrue(msg, Math.abs(expected - actual) < 1_000_000_000 * ulp);
        }
    }

    public void testSamples_basics() {
        List<Sample> samples = new ArrayList<>();
        samples.add(new Sample(new double[]{-.1, 0, 1, 1}, new double[]{-0.8669513175959772, -0.4126055722546906, 0.2795568898506678}));
        samples.add(new Sample(new double[]{-.5, -1, 1}, new double[]{-0.36602540378443865, 1.3660254037844386}));
        samples.add(new Sample(new double[]{-6, -7, 0, 1}, new double[]{-2, -1, 3}));

        // this has only 1 root:
        samples.add(new Sample(new double[]{2, 0, -1, 1}, new double[]{-1}));

        // this was a real case we observed in the wild (after rotating a circle, so the leading coefficient is near zero). This
        // is one of the primary motivators for setting up this architecture and these unit tests:
        samples.add(new Sample(new double[]{-0.17840294740142326, 17.15585614380484, -1.6553704005295913, -5.6843418860808015E-14},
                new double[]{-2.9121584058546367E13, 0.010409408593045498, 10.353347330267443}));

        // this came up in a randomized test and I wanted to safeguard it. Here there's a double root at x = -7, and
        // CubicCurve2D#solveCubic returns two roots:
        samples.add(new Sample(new double[]{192.0, 112.0, 19.0, 1.0},
                new double[]{-8, -3}));

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    private void testSamples(List<Sample> samples, CubicSolver solver, boolean shouldPass) {
        int failures = 0;
        for (int sampleIndex = 0; sampleIndex < samples.size(); sampleIndex++) {
            try {
                Sample s = samples.get(sampleIndex);
                s.test(solver);
            } catch (Throwable t) {
                System.err.println("sampleIndex = " + sampleIndex);
                t.printStackTrace();
                failures++;
                if (failures > 100) {
                    System.err.println("Max loggable failures reached; prematurely aborting test");
                    break;
                }
            }
        }

        assertEquals(shouldPass, failures == 0);
    }

    public void testSamples_threeSmallIntegerRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int root1 = -10; root1 <= 10; root1++) {
            for (int root2 = -10; root2 <= 10; root2++) {
                for (int root3 = -10; root3 <= 10; root3++) {
                    for (double multiplier : new double[]{-1, 1}) {
                        if (root1 != root2 && root2 != root3)
                            samples.add(createSampleFromRoots(root1, root2, root3, multiplier));
                    }
                }
            }
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_threeLargeIntegerRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextInt();
            double root2 = random.nextInt();
            double root3 = random.nextInt();
            if (root1 != root2 && root2 != root3)
                samples.add(createSampleFromRoots(root1, root2, root3, 1));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_threeSmallDoubleRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextDouble() * 20 - 10;
            double root2 = random.nextDouble() * 20 - 10;
            double root3 = random.nextDouble() * 20 - 10;
            double multiplier = random.nextBoolean() ? -1.0 : 1.0;
            if (root1 != root2 && root2 != root3)
                samples.add(createSampleFromRoots(root1, root2, root3, multiplier));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), true);
    }

    public void testSamples_threeLargeDoubleRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = Double.longBitsToDouble(random.nextLong());
            double root2 = Double.longBitsToDouble(random.nextLong());
            double root3 = Double.longBitsToDouble(random.nextLong());
            if (root1 != root2 && root2 != root3)
                samples.add(createSampleFromRoots(root1, root2, root3, 1));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    // test double roots:

    public void testSamples_twoSmallIntegerRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int root1 = -10; root1 <= 10; root1++) {
            for (int root2 = -10; root2 <= 10; root2++) {
                for (double multiplier : new double[]{-1, 1}) {
                    if (root1 != root2)
                        samples.add(createSampleFromRoots(root1, root2, root2, multiplier));
                }
            }
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_twoLargeIntegerRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextInt();
            double root2 = random.nextInt();
            if (root1 != root2)
                samples.add(createSampleFromRoots(root1, root2, root2, 1));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_twoSmallDoubleRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextDouble() * 20 - 10;
            double root2 = random.nextDouble() * 20 - 10;
            double multiplier = random.nextBoolean() ? -1.0 : 1.0;
            if (root1 != root2)
                samples.add(createSampleFromRoots(root1, root2, root2, multiplier));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_twoLargeDoubleRoots() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = Double.longBitsToDouble(random.nextLong());
            double root2 = Double.longBitsToDouble(random.nextLong());
            if (root1 != root2)
                samples.add(createSampleFromRoots(root1, root2, root2, 1));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    // test triple roots:

    public void testSamples_oneSmallTripleIntegerRoot() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int root1 = -10; root1 <= 10; root1++) {
            for (double multiplier : new double[]{-1, 1}) {
                samples.add(createSampleFromRoots(root1, root1, root1, multiplier));
            }
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_oneLargeTripleIntegerRoot() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < 1_000_000; i++) {
            double root1 = random.nextInt();
            samples.add(createSampleFromRoots(root1, root1, root1, 1));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_oneSmallTripleDoubleRoot() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < 1_000_000; i++) {
            double root1 = random.nextDouble() * 20 - 10;
            double multiplier = random.nextBoolean() ? -1.0 : 1.0;
            samples.add(createSampleFromRoots(root1, root1, root1, multiplier));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    public void testSamples_oneLargeTripleDoubleRoot() {
        List<Sample> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < 1_000_000; i++) {
            double root1 = Double.longBitsToDouble(random.nextLong());
            samples.add(createSampleFromRoots(root1, root1, root1, 1));
        }

        testSamples(samples, new BinarySearchCubicSolver(), true);
        testSamples(samples, new RefineGeomCubicSolver(), true);
        testSamples(samples, new GeomCubicSolver(), false);
    }

    // TODO: add tests for two imaginary roots

    private Sample createSampleFromRoots(double root1, double root2, double root3, double multiplier) {
        double[] eqn = new double[]{
                (multiplier) * (-root1 * root2 * root3),
                (multiplier) * (root1 * root2 + root1 * root3 + root2 * root3),
                (multiplier) * (-root1 - root2 - root3),
                (multiplier) * (1)};
        double[] allRoots = new double[]{root1, root2, root3};
        int uniqueRootCount = CubicSolver.constrainAndSort(3, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, allRoots, 0, allRoots, 0);

        double[] results = new double[uniqueRootCount];
        System.arraycopy(allRoots, 0, results, 0, uniqueRootCount);

        return new Sample(eqn, results);
    }

    public static String toString(double[] array, int offset, int length) {
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
}
