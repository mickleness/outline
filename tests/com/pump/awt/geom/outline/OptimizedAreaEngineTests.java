package com.pump.awt.geom.outline;

import java.awt.*;
import java.util.List;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;

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

    public void testPreprocessOperationsUsingRectangleMask_rectSubtraction() {
        OptimizedAreaEngine engine = new OptimizedAreaEngine(1);
        Outline outline = new Outline(engine);
        outline.add(new Rectangle(0,0,100,100));
        outline.subtract(new Rectangle(50, 50, 10, 10));
        outline.subtract(new Ellipse2D.Float(55,55,3,3));
        engine.preprocessOperationsUsingRectangleMask(outline.operationQueue);

        assertEquals(2, outline.operationQueue.size());
    }

    public void testRemoveRectangleEnclosedOperations_add() {
        OptimizedAreaEngine engine = new OptimizedAreaEngine(1);
        Outline outline = new Outline(engine);
        outline.add(new Rectangle(0,0,100,100));
        outline.add(new Ellipse2D.Float(50, 50, 10, 10));
        outline.add(new Ellipse2D.Float(55,55,3,3));

        List<OptimizedAreaEngine.OptimizedOutlineOperation> optOps = new ArrayList<>();
        optOps.addAll( (List) outline.operationQueue);
        engine.removeRectangleEnclosedOperations(optOps);
        assertEquals(1, optOps.size());
    }


    public void testRemoveRectangleEnclosedOperations_clip() {
        OptimizedAreaEngine engine = new OptimizedAreaEngine(1);
        Outline outline = new Outline(engine);
        outline.add(new Rectangle(0,0,100,100));
        outline.intersect(new Rectangle(50, 50, 10, 10));
        outline.intersect(new Ellipse2D.Float(55,55,3,3));

        List<OptimizedAreaEngine.OptimizedOutlineOperation> optClipOps = new ArrayList<>();
        optClipOps.add( (OptimizedAreaEngine.OptimizedOutlineOperation) outline.operationQueue.get(1) );
        optClipOps.add( (OptimizedAreaEngine.OptimizedOutlineOperation) outline.operationQueue.get(2) );
        engine.removeRectangleEnclosedOperations(optClipOps);
        assertEquals(1, optClipOps.size());
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
}
