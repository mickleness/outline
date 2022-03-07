package com.pump.math;

import com.pump.awt.geom.outline.OutlineTests;
import junit.framework.TestCase;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CubicSolverTests extends TestCase {

    /**
     * This tests a few equations that we've personally visually inspected.
     */
    public void testSamples_basics() {
        List<Polynomial> samples = new ArrayList<>();
        samples.add(new Polynomial(new double[]{-.1, 0, 1, 1}, new double[]{-0.8669513175959772, -0.4126055722546906, 0.2795568898506678}));
        samples.add(new Polynomial(new double[]{-.5, -1, 1}, new double[]{-0.36602540378443865, 1.3660254037844386}));
        samples.add(new Polynomial(new double[]{-6, -7, 0, 1}, new double[]{-2, -1, 3}));

        // this has only 1 root:
        samples.add(new Polynomial(new double[]{2, 0, -1, 1}, new double[]{-1}));

        // this was a real case we observed in the wild (after rotating a circle, so the leading coefficient is near zero). This
        // is one of the primary motivators for setting up this architecture and these unit tests:
        samples.add(new Polynomial(new double[]{-0.17840294740142326, 17.15585614380484, -1.6553704005295913, -5.6843418860808015E-14},
                new double[]{-2.9121584058546367E13, 0.010409408593045498, 10.353347330267443}));

        // Here there's a double root at x = -8, and CubicCurve2D#solveCubic returns
        // [-8.000000117366898, -7.999999882633097, -3.0]
        samples.add(new Polynomial(new double[]{192.0, 112.0, 19.0, 1.0},
                new double[]{-8, -3}));

        samples.add(new Polynomial(new double[] {8.371561982193448E60, 5.361709507616027E45, 2.5964398283509223E29, 1.0},
                new double[] {-2.5964398283507157E29, -1.8948666914412416E16, -1.701569032021228E15}));

        samples.add(new Polynomial(new double[] {8.91196835595777E64, 1.865424474044341E47, 5.227272950813287E28, 1.0},
                new double[] {-5.227272950456423E28, -3.0004176752467594E18, -5.6822029661275674E17}));

        samples.add(new Polynomial(new double[] {-6.614122855865396E57, 8.53770964749607E42, 3.466178091247499E29, 1.0},
                new double[] {-3.466178091247499E29, -1.5100087732218594E14, 1.2636939728065319E14}));

        samples.add(new Polynomial(new double[] {-10.715728752538103, 46.862915010152385, -46.86291501015237, -3.552713678800501E-15},
                new double[] {-1.3190737911076092E16, 0.3539218196826379, 0.6460781803173623}));

        samples.add(new Polynomial(new double[] {-5.653812879800323E61,-5.4847578233899334E48,-5.332758563166307E24, 1.0},
                new double[] {-8.824707147652072E23, -1.0308227020974588E13, 6.215229277941822E24}));

        samples.add(new Polynomial(new double[] { -3.12535144655481E71, -4.3437116376849414E58, 5.3832333713648586E29, 1.0 },
                new double[] { -6.0958070476229905E29, -7.19511723439478E12, 7.1257367625813165E28}));

        samples.add(new Polynomial(new double[] {8.713322750169244E76, 2.9013724134673826E53, 2.415258178649569E29, 1.0},
                new double[] {-2.4152461659245442E29, -6.0138842979012276E23, -5.998840726851468E23}));

        testSamples(samples, false);
    }

    private void testSamples(List<Polynomial> samples, boolean geomSolverExpectedToPass) {
        int failures = 0;
        int expectedFailures = 0;

        CubicSolver[] solvers = new CubicSolver[]{
                new BinarySearchCubicSolver(),
                new RefineGeomCubicSolver(),
                new GeomCubicSolver()
        };

        sampleLoop : for (int sampleIndex = 0; sampleIndex < samples.size(); sampleIndex++) {
            StringBuilder sb = new StringBuilder();

            Polynomial sample = samples.get(sampleIndex);

            sb.append("***** Sample Index: " + sampleIndex + "\n");
            sb.append(sample.getEquationString() + "\n");
            sb.append("Expected root(s): " + toString(sample.roots, 0, sample.roots.length)+"\n");
            double[] rootYs = new double[sample.roots.length];
            for(int a = 0; a<sample.roots.length; a++) {
                rootYs[a] = CubicSolver.evaluate(sample.eqn, sample.eqn.length - 1, sample.roots[a]);
                sb.append("f("+sample.roots[a]+") = "+rootYs[a]+"\n");
            }

            boolean showReport = false;
            try {
                for (CubicSolver solver : solvers) {
                    sb.append(solver.getClass().getSimpleName()+"\n");
                    try {
                        double[] actualResults = new double[3];
                        int rootCount;
                        if (sample.eqn.length == 4) {
                            rootCount = solver.solveCubic(sample.eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, actualResults, 0);
                        } else if (sample.eqn.length == 3) {
                            rootCount = solver.solveQuadratic(sample.eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, actualResults, 0);
                        } else {
                            throw new IllegalStateException();
                        }

                        if (sample.roots.length == 0) {
                            sb.append("\tIdentified no roots\n");
                            assertTrue("rootCount = " + rootCount, rootCount <= 0);
                        } else {
                            sb.append("\tIdentified "+rootCount+" root(s): " + toString(actualResults, 0, rootCount)+"\n");
                            assertEquals(
                                    "the number of identified roots is incorrect",
                                    sample.roots.length, rootCount);
                            for (int a = 0; a < rootCount; a++) {
                                // check each root. Due to machine error: it's possible the roots the solver identified
                                // may be perfect fits for the polynomial even if they aren't the same as the
                                // *intended* root we used to generate the Sample's polynomial.

                                double expectedRoot = sample.roots[a];
                                double observedRoot = actualResults[a];

                                double observedRootY = CubicSolver.evaluate(sample.eqn, sample.eqn.length - 1, observedRoot);
                                if (observedRootY != rootYs[a]) {
                                    sb.append("\tf("+observedRoot+") = "+observedRootY+"\n");
                                }

                                String msg = "expected = "+expectedRoot+", observed = "+observedRoot;

                                if (expectedRoot != 0) {
                                    if (Math.abs(observedRootY) <= Math.abs(rootYs[a])) {
                                        // OK, great. Maybe the x-value it gave us didn't exactly match the x-value
                                        // we wanted, but (through the magic of rounding error) the end result shows
                                        // that x-value is as good (or better!) than the x-value we originally wanted
                                    } else {
                                        // not good. The y-value we get when we plug in the observed root is
                                        // worse than if we found the expected x-value. So now we have to quantify
                                        // "how far off is too far off?"
                                        double ulp1 = Math.ulp(expectedRoot);
                                        double ulp2 = Math.ulp(observedRoot);
                                        double ulp = Math.max(ulp1, ulp2);
                                        assertTrue(msg, Math.abs(expectedRoot - observedRoot) < 1_000_000_000 * ulp);
                                    }
                                } else {
                                    // the ulp logic doesn't do well if the root should be zero:
                                    assertTrue(msg, Math.abs(observedRoot) < .0000000000001);
                                }
                            }
                        }

                        sb.append("\tPASSED\n");
                    } catch (Throwable t) {
                        if (solver instanceof GeomCubicSolver && !geomSolverExpectedToPass) {
                            sb.append("\tFAILED (as expected)\n");
                            expectedFailures++;
                        } else {
                            sb.append("\tFAILED\n");
                            failures++;
                            showReport = true;
                        }

                        sb.append(getStackTrace(t) + "\n");

                        if (failures > 100) {
                            sb.append("Max loggable failures reached; prematurely aborting test\n");
                            break sampleLoop;
                        }
                    }
                }
            } finally {
                if (showReport)
                    System.out.println(sb);
            }
        }

        if (expectedFailures == 0 && !geomSolverExpectedToPass)
            fail("The GeomCubicSolver was expected to fail at least once, but it didn't.");

        if (failures > 0)
            fail(DecimalFormat.getInstance().format(failures)+" occurred; see console for details");

        System.out.println("Passed "+DecimalFormat.getInstance().format(samples.size())+" polynomials");
    }

    private static String getStackTrace(Throwable throwable) {
        try (StringWriter sw = new StringWriter();
             PrintWriter pw = new PrintWriter(sw)) {
            throwable.printStackTrace(pw);
            return sw.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException(ioe);
        }
    }

    public void testSamples_threeSmallIntegerRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        for (int root1 = -10; root1 <= 10; root1++) {
            for (int root2 = -10; root2 <= 10; root2++) {
                for (int root3 = -10; root3 <= 10; root3++) {
                    for (double multiplier : new double[]{ -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10}) {
                        if (root1 != root2 && root2 != root3 && root1 != root3) {
                            try {
                                samples.add(Polynomial.createFromRoots(root1, root2, root3, multiplier));
                            } catch(ArithmeticException e) {
                                skippedCtr++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, true);
    }

    public void testSamples_threeLargeIntegerRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextInt();
            double root2 = random.nextInt();
            double root3 = random.nextInt();
            if (root1 != root2 && root2 != root3 && root1 != root3) {
                try {
                    samples.add(Polynomial.createFromRoots(root1, root2, root3, random.nextInt()));
                } catch(ArithmeticException e) {
                    skippedCtr++;
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, true);
    }

    public void testSamples_threeSmallDoubleRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextDouble() * 20 - 10;
            double root2 = random.nextDouble() * 20 - 10;
            double root3 = random.nextDouble() * 20 - 10;
            double multiplier = random.nextBoolean() ? -1.0 : 1.0;
            multiplier = multiplier * random.nextDouble() + .2;
            if (root1 != root2 && root2 != root3 && root1 != root3) {
                try {
                 samples.add(Polynomial.createFromRoots(root1, root2, root3, multiplier));
                } catch(ArithmeticException e) {
                    skippedCtr++;
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, true);
    }

    public void testSamples_threeLargeDoubleRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);

        // this test is expensive to set up, because lots of Polynomials get rejected:
        int testCount = OutlineTests.RUN_OVERNIGHT ? 1_000_000 : 10_000;

        while (samples.size() < testCount) {
            double root1 = getLargeDouble(random);
            double root2 = getLargeDouble(random);
            double root3 = getLargeDouble(random);
            if (root1 != root2 && root2 != root3 && root1 != root3) {
                try {
                    Polynomial p = Polynomial.createFromRoots(root1, root2, root3, 1);
                    samples.add(p);
                } catch(ArithmeticException e) {
                    skippedCtr++;
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    /**
     * Return a double that has a large exponent. Here "large" is taken to mean
     * "between 40 and 100". This value will probably be a root of a cubic equation, so we need
     * to be able to cube it safely. If the max exponent a java double can have is 1023, then
     * the absolute max exponent we should consider is around 340 (1023/3).
     */
    private double getLargeDouble(Random random) {
        while (true) {
            double d = Double.longBitsToDouble(random.nextLong());
            int exp = Math.getExponent(d);
            if (exp > 40 && exp < 100)
                return d;
        }
    }

    // test double roots:

    public void testSamples_twoSmallIntegerRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        for (int root1 = -10; root1 <= 10; root1++) {
            for (int root2 = -10; root2 <= 10; root2++) {
                for (double multiplier : new double[]{-1, 1}) {
                    if (root1 != root2) {
                        try {
                            samples.add(Polynomial.createFromRoots(root1, root2, root2, multiplier));
                        } catch(ArithmeticException e) {
                            skippedCtr++;
                        }
                    }
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    public void testSamples_twoLargeIntegerRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextInt();
            double root2 = random.nextInt();
            if (root1 != root2) {
                try {
                    samples.add(Polynomial.createFromRoots(root1, root2, root2, 1));
                } catch(ArithmeticException e) {
                    skippedCtr++;
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    public void testSamples_twoSmallDoubleRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = random.nextDouble() * 20 - 10;
            double root2 = random.nextDouble() * 20 - 10;
            double multiplier = random.nextBoolean() ? -1.0 : 1.0;
            if (root1 != root2) {
                try {
                    samples.add(Polynomial.createFromRoots(root1, root2, root2, multiplier));
                } catch(ArithmeticException e) {
                    skippedCtr++;
                }
            }
        }

        testSamples(samples, false);
    }

    public void testSamples_twoLargeDoubleRoots() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        while (samples.size() < 1_000_000) {
            double root1 = getLargeDouble(random);
            double root2 = getLargeDouble(random);
            if (root1 != root2) {
                try {
                    samples.add(Polynomial.createFromRoots(root1, root2, root2, 1));
                } catch(ArithmeticException e) {
                    skippedCtr++;
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    // test triple roots:

    public void testSamples_oneSmallTripleIntegerRoot() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        for (int root1 = -10; root1 <= 10; root1++) {
            for (double multiplier : new double[]{-1, 1}) {
                try {
                    samples.add(Polynomial.createFromRoots(root1, root1, root1, multiplier));
                } catch(ArithmeticException e) {
                    skippedCtr++;
                }
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    public void testSamples_oneLargeTripleIntegerRoot() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < 1_000_000; i++) {
            double root1 = random.nextInt();
            try {
                samples.add(Polynomial.createFromRoots(root1, root1, root1, 1));
            } catch(ArithmeticException e) {
                skippedCtr++;
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    public void testSamples_oneSmallTripleDoubleRoot() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < 1_000_000; i++) {
            double root1 = random.nextDouble() * 20 - 10;
            double multiplier = random.nextBoolean() ? -1.0 : 1.0;
            try {
                samples.add(Polynomial.createFromRoots(root1, root1, root1, multiplier));
            } catch(ArithmeticException e) {
                skippedCtr++;
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    public void testSamples_oneLargeTripleDoubleRoot() {
        int skippedCtr = 0;
        List<Polynomial> samples = new ArrayList<>();
        Random random = new Random(0);
        for (int i = 0; i < 1_000_000; i++) {
            double root1 = getLargeDouble(random);
            try {
                samples.add(Polynomial.createFromRoots(root1, root1, root1, 1));
            } catch(ArithmeticException e) {
                skippedCtr++;
            }
        }

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples(samples, false);
    }

    // TODO: add tests for two imaginary roots

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
