package com.pump.awt.geom.outline;

import java.awt.*;

public class OptimizedAreaEngineTests extends OutlineTests {

    public void testRemoveClippedOperations() {
        OptimizedAreaEngine engine = new OptimizedAreaEngine(1);
        Outline outline = new Outline(engine);
        outline.add(new Rectangle(3,3,3,3));
        outline.intersect(new Rectangle(0,0,4,4));
        outline.intersect(new Rectangle(5,5,4,4));
        engine.removeClippedOperations(outline.operationQueue);

        assertEquals(2, outline.operationQueue.size());

        engine.removeInitialNegativeOperations(outline.operationQueue);

        assertEquals(0, outline.operationQueue.size());
    }

    /**
     * This tests a specific failure we observed with random combinations of operations.
     */
    public void testPreprocessOperationsUsingRectangleMask() {
        // normally the engine#removeClippedOperations intervenes to save us a step
        // here, but if we OMIT that filter the preprocessOperationsUsingRectangleMask
        // used to purge the first clip, which produced a bad result.

        OptimizedAreaEngine engine = new OptimizedAreaEngine(1);
        Outline outline = new Outline(engine);
        outline.add(createTriangle(1.3, 2.3, .9, .9));
        outline.intersect(createSquare(0.8, 2.1, .9, .9));
        outline.exclusiveOr(createSquare(1.4, 1.4, .9, .9));
        outline.intersect(createSquare(1.8, 1.6, .9, .9));
        engine.preprocessOperationsUsingRectangleMask(outline.operationQueue);

        assertEquals(4, outline.operationQueue.size());
    }

    // TODO:
//    public void testMemoryFailure_1() {
//        Outline outline = new Outline(new PlainAreaEngine());
//        outline.add(createEllipse(0, 2, .9, .9));
//        outline.exclusiveOr(createTriangle(0, 2, .9, .9));
//        outline.exclusiveOr(createEllipse(0, 2, .9, .9));
//        outline.add(createSquare(2, 2, .9, .9));
//        outline.add(createEllipse(1, 2, .9, .9));
//        outline.exclusiveOr(createEllipse(0, 2, .9, .9));
//        outline.add(createSquare(0, 0, .9, .9));
//        outline.add(createTriangle(2, 1, .9, .9));
//        outline.add(createEllipse(2, 0, .9, .9));
//        outline.subtract(createEllipse(1, 0, .9, .9));
//        outline.flush();
//    }
}
