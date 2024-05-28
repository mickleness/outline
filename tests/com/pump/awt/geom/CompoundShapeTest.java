package com.pump.awt.geom;

import com.pump.awt.geom.outline.AreaOutlineEngine;
import com.pump.awt.geom.outline.OutlineOperation;
import junit.framework.TestCase;

import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
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
}