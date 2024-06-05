package com.pump.awt.geom;

import junit.framework.TestCase;
import org.junit.Test;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.QuadCurve2D;
import java.util.concurrent.atomic.AtomicInteger;

public class CurveTest extends TestCase {

    /**
     * This confirms that we don't recursively call rectCrossingsForCubic
     * for a specific configuration. If sun's Curve class were structured
     * as a class we could similarly test: it would fail this unit test.
     * <p>
     * This is testing efficiency; this is not testing correctness.
     */
    @Test
    public void testCrossingCounter() {
        AtomicInteger maxRecursionLevel = new AtomicInteger(0);

        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0,0,0,50,0,100,100,100);

        // test against a skinny vertical rectangle that extends above and below our curve
        new Curve.RectCrossingsCounter(cubicCurve.getPathIterator(null), 67.001, -10, 67.002, 110) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };

        // this example reached a maxRecursionLevel of 17 before this change
        assertEquals(0, maxRecursionLevel.get());

        // test against a skinny horizontal rectangle that extends past the left and right edge of our curve
        new Curve.RectCrossingsCounter(cubicCurve.getPathIterator(null), -10, 53, 110, 54) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };
        assertEquals(0, maxRecursionLevel.get());


        QuadCurve2D quadCurve2D = new QuadCurve2D.Double(0,0,0,100,100,100);

        // test against a skinny vertical rectangle that extends above and below our curve
        new Curve.RectCrossingsCounter(quadCurve2D.getPathIterator(null), 53, -10, 54, 110) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };
        assertEquals(0, maxRecursionLevel.get());

        // test against a skinny horizontal rectangle that extends past the left and right edge of our curve
        new Curve.RectCrossingsCounter(quadCurve2D.getPathIterator(null), -10, 53, 110, 54) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };
        assertEquals(0, maxRecursionLevel.get());
    }

    @Test
    public void testCrossingCounter_var2() {
        AtomicInteger maxRecursionLevel = new AtomicInteger(0);

        CubicCurve2D cubicCurve = new CubicCurve2D.Double(0,0,0,50,0,100,100,100);

        // test against a skinny vertical rectangle that extends above and below our curve
        new Curve.RectCrossingsCounter(cubicCurve.getPathIterator(null), 67.001, 80, 67.002, 110) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };

        // this example reached a maxRecursionLevel of 17 before this change
        assertEquals(2, maxRecursionLevel.get());

        // test against a skinny horizontal rectangle that extends past the left and right edge of our curve
        new Curve.RectCrossingsCounter(cubicCurve.getPathIterator(null), -10, 53, 33, 54) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };
        assertEquals(2, maxRecursionLevel.get());


        QuadCurve2D quadCurve2D = new QuadCurve2D.Double(0,0,0,100,100,100);

        // test against a skinny vertical rectangle that extends above and below our curve
        new Curve.RectCrossingsCounter(quadCurve2D.getPathIterator(null), 53, 80, 54, 110) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };
        assertEquals(2, maxRecursionLevel.get());

        // test against a skinny horizontal rectangle that extends past the left and right edge of our curve
        new Curve.RectCrossingsCounter(quadCurve2D.getPathIterator(null), -10, 53, 33, 54) {

            @Override
            void rectCrossingsForCubic(double x0,  double y0,
                                       double xc0, double yc0,
                                       double xc1, double yc1,
                                       double x1,  double y1,
                                       int level) {
                maxRecursionLevel.set(Math.max(level, maxRecursionLevel.get()));
                super.rectCrossingsForCubic(x0, y0, xc0, yc0, xc1, yc1, x1, y1, level);
            }

        };
        assertEquals(2, maxRecursionLevel.get());
    }
}