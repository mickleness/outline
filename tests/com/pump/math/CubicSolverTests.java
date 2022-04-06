package com.pump.math;

import com.pump.TestUtils;
import com.pump.awt.geom.clip.DefaultRectangularClipper;
import com.pump.awt.geom.clip.RectangularClipper;
import com.pump.awt.geom.clip.RectangularClipperTest;
import com.pump.awt.geom.outline.OutlineTests;
import junit.framework.TestCase;

import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CubicSolverTests extends TestCase {

    /**
     * If true then we'll write .log files describing all the GeomCubicSolver failures.
     * <p>
     * This is useful if we want to catalog the failures of CubicCurve2D / QuadCurve2D, but that's
     * not really the main reason this class exists.
     * </p>
     */
    private static boolean logGeomFailures = false;

    /**
     * This tests a few equations that we've personally visually inspected. This includes several
     * cases that are associated with individual commits/fixes are problems were observed in other
     * tests.
     */
    public void testSamples_basics() throws IOException {
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

        samples.add(new Polynomial(new double[] { 2.9013724134673826E53, 4.830516357299138E29, 3.0, 0},
                new double[] {-1.6101661127372E29, -6.0063625123646355E23 } ));

        // here BinarySearchCubicSolver failed because getSingleBound was just a little too small
        // (it returned the root itself; probably a machine rounding error):
        samples.add(new Polynomial(new double[] {-14.7157287525381, 46.86291501015238, -46.86291501015238, -1.7763568394002505E-15},
                new double[] {-2.6381475822152184E16} ));

        // here CubicCurve2D.solveCubic(..) returns 3 roots, even though there should only be 1
        samples.add(new Polynomial(new double[] {-14.715728752538102, 46.86291501015238, -46.86291501015237, -1.0658141036401503E-14},
                new double[] {-4.396912637025364E15}));

        // these samples failed intermittently as I developed the solution to the previous sample. (The failures had to do
        // with how we applied Newton's Method, and how we looked for local extrema and/or aborted when we thought we found them.)
        samples.add(new Polynomial(new double[] {-1620.0, -882.0, -132.0, -6},
                new double[] {-10, -9, -3}));
        samples.add(new Polynomial(new double[] {11.7157287525381, -46.86291501015239, 46.86291501015239,-7.105427357601002E-15},
                new double[] {0.5000000000000001, 6.595368955538046E15}));
        samples.add(new Polynomial(new double[] {-80.0,-66.2741699796952,12.548339959390404,13.725830020304798},
                new double[] {-1.7954389122043282, -1.4142135623730976, 2.2954389122043324}));

        // this relates to the BinarySearchCubicSolver and how it handles double roots:
        samples.add(new Polynomial(new double[] { 11.715728752538098, -46.8629150101524, 46.86291501015242, -2.1316282072803006E-14 },
                new double[] {.5, 2.198456318512683E15}));

        // TODO: reinstate
//        samples.add(new Polynomial(new double[] {8.713322750169244E76, 2.9013724134673826E53, 2.415258178649569E29, 1.0},
//                new double[] {-2.4152461659245442E29, -6.0138842979012276E23, -5.998840726851468E23}));

        testSamples("basics", samples, false);
    }

    private void testSamples(String name, List<Polynomial> samples, boolean geomSolverExpectedToPass) throws IOException {
        int failures = 0;
        int expectedFailures = 0;

        CubicSolver[] solvers = new CubicSolver[]{
                new BinarySearchCubicSolver(),
                new RefineGeomCubicSolver(),
                new GeomCubicSolver()
        };

        File geomSolverLog = new File(name+" GeomCubicSolver.log");
        try (Writer logWriter = TestUtils.createLog(name + " GeomCubicSolver", logGeomFailures, false)) {
            sampleLoop : for (int sampleIndex = 0; sampleIndex < samples.size(); sampleIndex++) {
                StringBuilder sb = new StringBuilder();
                StringBuilder stacktrace = new StringBuilder();

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
                boolean includeInGeomLog = false;
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
                            includeInGeomLog = solver instanceof GeomCubicSolver;
                            if (solver instanceof GeomCubicSolver && !geomSolverExpectedToPass) {
                                sb.append("\tFAILED (as expected)\n");
                                expectedFailures++;
                            } else {
                                sb.append("\tFAILED\n");
                                failures++;
                                showReport = true;
                            }

                            stacktrace.append(getStackTrace(t) + "\n");

                            if (failures > 100) {
                                break sampleLoop;
                            }
                        }
                    }
                } finally {
                    if (showReport) {
                        if (failures == 101) {
                            System.out.println("Max loggable failures reached");
                        } else if (failures <= 100) {
                            System.out.println(sb);
                            System.out.println(stacktrace);
                        }
                    }
                    if (includeInGeomLog) {
                        logWriter.write(sb.toString());
                        logWriter.write("\n");
                        logWriter.flush();
                    }
                }
            }
        }

        if (geomSolverLog.exists() && geomSolverLog.length() == 0)
            geomSolverLog.delete();

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

    /**
     * This unit tests harvests all the CubicSolver usages in the {@link RectangularClipperTest#testCircle()} method and analyzes them.
     * <p>
     * The testCircle() method presents some challenging use cases for CubicSolvers.
     * Among other things: it takes a circular Ellipse2D.Double and rotates it 45°. This results in some unusual
     * bezier curves where one dimension is a "normal" cubic polynomial, and the other dimension is supposed
     * to be quadratic/linear (because it's degenerated cubic), but because of rounding error the leading coefficient
     * is not technically zero.
     * </p>
     */
    public void testSamples_fromTestCircle() throws IOException {
        RectangularClipperTest t = new RectangularClipperTest() {

            @Override
            protected RectangularClipper[] getClippers() {
                // if we return just the DefaultRectangularClipper and nothing else:
                // then we'll still invoke the CubicSolver class, but we won't do the
                // expensive shape comparisons.
                return new RectangularClipper[] { new DefaultRectangularClipper() };
            }
        };

        class CubicSolverUsageLog implements AutoCloseable {

            CubicSolver origDefault = CubicSolver.getDefault();
            List<Polynomial> polynomials = new ArrayList<>();

            {
                CubicSolver.setDefault(new BinarySearchCubicSolver() {
                    @Override
                    public int solveCubic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
                        int returnValue = super.solveCubic(eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, res, resOffset);
                        logPolynomial(eqn, res, resOffset, returnValue);
                        return constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
                    }

                    private void logPolynomial(double[] eqn, double[] res, int resOffset, int resLength) {
                        if (resLength >= 0) {
                            double[] results = new double[resLength];
                            for (int a = 0; a < results.length; a++) {
                                results[a] = res[resOffset + a];
                            }
                            polynomials.add(
                                    new Polynomial(
                                            eqn.clone(),
                                            results
                                    )
                            );
                        }
                    }

                    @Override
                    public int solveQuadratic(double[] eqn, double minX, double maxX, double[] res, int resOffset) {
                        int returnValue = super.solveQuadratic(eqn, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, res, resOffset);
                        logPolynomial(eqn, res, resOffset, returnValue);
                        return constrainAndSort(returnValue, minX, maxX, res, resOffset, res, resOffset);
                    }
                });
            }

            @Override
            public void close() {
                CubicSolver.setDefault(origDefault);
            }
        }

        try(CubicSolverUsageLog usageLog = new CubicSolverUsageLog()) {
            t.testCircle();
            System.out.println("Identified "+usageLog.polynomials.size()+" usages in RectangularClipperTest#testCircle");
            testSamples("RectangularClipperTest#testCircle", usageLog.polynomials, false);

            // in some early testing the BinarySearchCubicSolver failed to identify one root in some cases.
            // a cubic should always have one root, so let's sanity check that:
            for (Polynomial p : usageLog.polynomials) {
                if (p.eqn.length == 4 && p.roots.length == 0) {
                    fail(p.toString());
                }
            }
        }
    }

    public void testSamples_threeSmallIntegerRoots() throws IOException {
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

        testSamples("threeSmallIntegerRoots", samples, true);
    }

    public void testSamples_threeLargeIntegerRoots() throws IOException {
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

        testSamples("threeLargeIntegerRoots", samples, true);
    }

    public void testSamples_threeSmallDoubleRoots() throws IOException {
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

        testSamples("threeSmallDoubleRoots", samples, true);
    }

    public void testSamples_threeLargeDoubleRoots() throws IOException {
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

        testSamples("threeLargeDoubleRoots", samples, false);
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

    public void testSamples_twoSmallIntegerRoots() throws IOException {
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

        testSamples("twoSmallIntegerRoots", samples, false);
    }

    public void testSamples_twoLargeIntegerRoots() throws IOException {
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

        testSamples("twoLargeIntegerRoots", samples, false);
    }

    public void testSamples_twoSmallDoubleRoots() throws IOException {
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

        System.out.println("Skipped "+DecimalFormat.getInstance().format(skippedCtr)+" samples");

        testSamples("twoSmallDoubleRoots", samples, false);
    }

    public void testSamples_twoLargeDoubleRoots() throws IOException {
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

        testSamples("twoLargeDoubleRoots", samples, false);
    }

    // test triple roots:

    public void testSamples_oneSmallTripleIntegerRoot() throws IOException {
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

        testSamples("oneSmallTripleIntegerRoot", samples, false);
    }

    public void testSamples_oneLargeTripleIntegerRoot() throws IOException {
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

        testSamples("oneLargeTripleIntegerRoot", samples, false);
    }

    public void testSamples_oneSmallTripleDoubleRoot() throws IOException {
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

        testSamples("oneSmallTripleDoubleRoot", samples, false);
    }

    public void testSamples_oneLargeTripleDoubleRoot() throws IOException {
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

        testSamples("oneLargeTripleDoubleRoot", samples, false);
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
