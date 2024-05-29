package com.pump.awt.geom;

import com.pump.awt.geom.outline.AreaOutlineEngine;
import com.pump.awt.geom.outline.OutlineOperation;
import junit.framework.TestCase;

import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.util.List;

public class CompoundShapeTest extends TestCase {

    static class TestOutlineEngine extends AreaOutlineEngine {
        int operationCtr = 0;

        @Override
        public Area calculate(List<OutlineOperation> operationQueue) {
            operationCtr++;
            return super.calculate(operationQueue);
        }
    }

    /**
     * This makes sure that if s1 contains the newly added shape: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWherePreexistingOperandContainsIncomingOperand() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(0,0,10,10));
        s1.add(new Ellipse2D.Float(5,5,1, 1));

        assertEquals(0, engine.operationCtr);
    }

    public void testAdd_optimizeCaseWherePreexistingOperandContainsIncomingOperand_var1() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(0,0,10,10));
        s1.add(new CompoundShape(engine, new Ellipse2D.Float(5,5,1, 1)));

        assertEquals(0, engine.operationCtr);
    }

    /**
     * This makes sure that if the newly added shape contains s1: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWhereIncomingOperandContainsPreexistingOperand() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(5,5,1, 1));
        s1.add(new Ellipse2D.Float(0,0,10,10));

        assertEquals(0, engine.operationCtr);
    }

    /**
     * This makes sure that if we add a shape to an empty CompoundShape: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWhereIncomingOperandContainsPreexistingOperand_var1() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine);
        s1.add(new Ellipse2D.Float(0,0,10,10));

        assertEquals(0, engine.operationCtr);
    }

    public void testAdd_optimizeCaseWhereIncomingOperandContainsPreexistingOperand_var2() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(5,5,1, 1));
        s1.add(new CompoundShape(engine, new Ellipse2D.Float(0,0,10,10)));

        assertEquals(0, engine.operationCtr);
    }

    /**
     * This makes sure that if s1 and the new shape do not touch: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWhereOperandsDoNotTouch() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(0,0,5,5));
        s1.add(new Ellipse2D.Float(0, 6, 5, 5));

        assertEquals(0, engine.operationCtr);
    }

    public void testAdd_optimizeCaseWhereOperandsDoNotTouch_var1() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(0,0,5,5));
        s1.add(new CompoundShape(engine, new Ellipse2D.Float(0, 6, 5, 5)));

        assertEquals(0, engine.operationCtr);
    }

    /**
     * This makes sure if two shapes overlap we do pass the work on to the underlying engine.
     * (This is also partially just a baseline test to make sure `engine.operationCtr`
     * is working.
     */
    public void testAdd_noOptimizationForOverlappingOperands() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(0,0,5,5));
        s1.add(new Ellipse2D.Float(2, 3, 5, 5));

        assertEquals(1, engine.operationCtr);
    }

    public void testAdd_noOptimizationForOverlappingOperands_var1() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(0,0,5,5));
        s1.add(new CompoundShape(engine, new Ellipse2D.Float(2, 3, 5, 5)));

        assertEquals(1, engine.operationCtr);
    }

    public void testAdd_overlappingCompoundShapes() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(5,5,1,1),
                new Ellipse2D.Float(15,5,1,1));
        CompoundShape s2 = new CompoundShape(engine, new Ellipse2D.Float(0,0,9,9),
                new Ellipse2D.Float(10,10,9,9));
        s1.add(s2);

        assertEquals(0, engine.operationCtr);
    }

    public void testAdd_overlappingPartialShapes() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(5,5,1,1),
                new Ellipse2D.Float(15,5,1,1));
        s1.add(new Ellipse2D.Float(0,0,9,9));
        s1.add(new Ellipse2D.Float(10,0,9,9));

        assertEquals(0, engine.operationCtr);
    }

    public void testAdd_overlappingButNotIntersecting() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(5,5,2,2),
                new Ellipse2D.Float(15,15,2,2));
        s1.add(new Ellipse2D.Float(5,15,2,2));
        s1.add(new Ellipse2D.Float(15,5,2,2));

        assertEquals(0, engine.operationCtr);
    }

    public void testAdd_overlappingButNotIntersecting__var1() {
        TestOutlineEngine engine = new TestOutlineEngine();
        CompoundShape s1 = new CompoundShape(engine, new Ellipse2D.Float(5,5,2,2),
                new Ellipse2D.Float(15,15,2,2));
        CompoundShape s2 = new CompoundShape(engine, new Ellipse2D.Float(15,5,2,2),
                new Ellipse2D.Float(5,15,2,2));
        s1.add(s2);

        assertEquals(0, engine.operationCtr);
    }

    public void testAdd_overlappingButNotIntersecting__var2() {
        TestOutlineEngine engine = new TestOutlineEngine();
        Path2D p1 = new Path2D.Double();
        p1.append(new Ellipse2D.Float(5,5,2,2), false);
        p1.append(new Ellipse2D.Float(15,15,2,2), false);

        Path2D p2 = new Path2D.Double();
        p2.append(new Ellipse2D.Float(15,5,2,2), false);
        p2.append(new Ellipse2D.Float(5,15,2,2), false);

        CompoundShape s1 = new CompoundShape(engine, p1);
        s1.add(p2);

        // TODO: we could make engine.operationCtr == 0 *if* we changed
        // CompoundShape.add(..) to split up incoming operands with multiple paths.
        // In fact, we could simplify the code a little if we made CompoundShape's
        // constructor automatically split separate paths into separate members,
        // and then just always use add(CompoundShape) logic.

//        assertEquals(0, engine.operationCtr);

        // ... but the current code sees our Path2Ds as one blob, so we expect them
        // to intersect and we'll have to use the engine to resolve the add(..):
        assertEquals(1, engine.operationCtr);
    }
}