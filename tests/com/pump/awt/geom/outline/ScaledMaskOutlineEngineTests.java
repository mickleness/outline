package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtilsTest;
import junit.framework.TestCase;

import java.awt.*;

public class ScaledMaskOutlineEngineTests extends TestCase  {

    /**
     * This tests a known bug in which after every flush if you
     * further modify a RectangleMask: the ScaledMaskOutlineEngine
     * recreates a mask of the shape each time. This resulted in
     * new lossy imperfections compounding on each other with each
     * consecutive operation.
     */
    public void testReuse() {
        Rectangle[] rects = new Rectangle[] {
                new Rectangle(0,0,1,1),
                new Rectangle(2,4,1,1),
                new Rectangle(1,3,1,1),
                new Rectangle(5,2,1,1)
        };

        Outline outline_expected = new Outline(new ScaledMaskOutlineEngine(4));
        Outline outline_actual = new Outline(new ScaledMaskOutlineEngine(4));
        for(Rectangle rect : rects) {
            outline_expected.add(rect);

            outline_actual.add(rect);
            outline_actual.flush();
        }

        ShapeUtilsTest.testEquals("expected", "actual", outline_expected, outline_actual, true);
    }
}
