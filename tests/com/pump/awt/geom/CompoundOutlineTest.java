package com.pump.awt.geom;

import com.pump.awt.geom.outline.AreaOutline;
import com.pump.awt.geom.outline.AreaOutlineFactory;
import com.pump.awt.geom.outline.CompoundOutline;
import junit.framework.TestCase;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;

public class CompoundOutlineTest extends TestCase {

    static class TestOutlineFactory extends AreaOutlineFactory {
        int operationCtr = 0;

        @Override
        public AreaOutline create(Shape shape) {
            operationCtr++;
            return super.create(shape);
        }

        @Override
        public AreaOutline create() {
            operationCtr++;
            return super.create();
        }
    }

    /**
     * This makes sure that if s1 contains the newly added shape: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWherePreexistingOperandContainsIncomingOperand() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(0,0,10,10));
        s1.add(new Ellipse2D.Float(5,5,1, 1));

        assertEquals(0, factory.operationCtr);
    }

    public void testAdd_optimizeCaseWherePreexistingOperandContainsIncomingOperand_var1() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(0,0,10,10));
        s1.add(new CompoundOutline(factory, new Ellipse2D.Float(5,5,1, 1)));

        assertEquals(0, factory.operationCtr);
    }

    /**
     * This makes sure that if the newly added shape contains s1: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWhereIncomingOperandContainsPreexistingOperand() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(5,5,1, 1));
        s1.add(new Ellipse2D.Float(0,0,10,10));

        assertEquals(0, factory.operationCtr);
    }

    /**
     * This makes sure that if we add a shape to an empty CompoundShape: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWhereIncomingOperandContainsPreexistingOperand_var1() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory);
        s1.add(new Ellipse2D.Float(0,0,10,10));

        assertEquals(0, factory.operationCtr);
    }

    public void testAdd_optimizeCaseWhereIncomingOperandContainsPreexistingOperand_var2() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(5,5,1, 1));
        s1.add(new CompoundOutline(factory, new Ellipse2D.Float(0,0,10,10)));

        assertEquals(0, factory.operationCtr);
    }

    /**
     * This makes sure that if s1 and the new shape do not touch: we recognize
     * this is a null op and we do NOT do further work.
     */
    public void testAdd_optimizeCaseWhereOperandsDoNotTouch() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(0,0,5,5));
        s1.add(new Ellipse2D.Float(0, 6, 5, 5));

        assertEquals(0, factory.operationCtr);
    }

    public void testAdd_optimizeCaseWhereOperandsDoNotTouch_var1() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(0,0,5,5));
        s1.add(new CompoundOutline(factory, new Ellipse2D.Float(0, 6, 5, 5)));

        assertEquals(0, factory.operationCtr);
    }

    /**
     * This makes sure if two shapes overlap we do pass the work on to the underlying engine.
     * (This is also partially just a baseline test to make sure `engine.operationCtr`
     * is working.
     */
    public void testAdd_noOptimizationForOverlappingOperands() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(0,0,5,5));
        s1.add(new Ellipse2D.Float(2, 3, 5, 5));

        assertEquals(1, factory.operationCtr);
    }

    public void testAdd_noOptimizationForOverlappingOperands_var1() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(0,0,5,5));
        s1.add(new CompoundOutline(factory, new Ellipse2D.Float(2, 3, 5, 5)));

        assertEquals(1, factory.operationCtr);
    }

    public void testAdd_overlappingCompoundShapes() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(5,5,1,1),
                new Ellipse2D.Float(15,5,1,1));
        CompoundOutline s2 = new CompoundOutline(factory, new Ellipse2D.Float(0,0,9,9),
                new Ellipse2D.Float(10,10,9,9));
        s1.add(s2);

        assertEquals(0, factory.operationCtr);
    }

    public void testAdd_overlappingPartialShapes() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(5,5,1,1),
                new Ellipse2D.Float(15,5,1,1));
        s1.add(new Ellipse2D.Float(0,0,9,9));
        s1.add(new Ellipse2D.Float(10,0,9,9));

        assertEquals(0, factory.operationCtr);
    }

    public void testAdd_overlappingButNotIntersecting() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(5,5,2,2),
                new Ellipse2D.Float(15,15,2,2));
        s1.add(new Ellipse2D.Float(5,15,2,2));
        s1.add(new Ellipse2D.Float(15,5,2,2));

        assertEquals(0, factory.operationCtr);
    }

    public void testAdd_overlappingButNotIntersecting_var1() {
        TestOutlineFactory factory = new TestOutlineFactory();
        CompoundOutline s1 = new CompoundOutline(factory, new Ellipse2D.Float(5,5,2,2),
                new Ellipse2D.Float(15,15,2,2));
        CompoundOutline s2 = new CompoundOutline(factory, new Ellipse2D.Float(15,5,2,2),
                new Ellipse2D.Float(5,15,2,2));
        s1.add(s2);

        assertEquals(0, factory.operationCtr);
    }

    public void testAdd_overlappingButNotIntersecting_var2() {
        TestOutlineFactory factory = new TestOutlineFactory();
        Path2D p1 = new Path2D.Double();
        p1.append(new Ellipse2D.Float(5,5,2,2), false);
        p1.append(new Ellipse2D.Float(15,15,2,2), false);

        Path2D p2 = new Path2D.Double();
        p2.append(new Ellipse2D.Float(15,5,2,2), false);
        p2.append(new Ellipse2D.Float(5,15,2,2), false);

        CompoundOutline s1 = new CompoundOutline(factory, p1);
        s1.add(p2);

        // TODO: we could make engine.operationCtr == 0 *if* we changed
        // CompoundShape.add(..) to split up incoming operands with multiple paths.
        // In fact, we could simplify the code a little if we made CompoundShape's
        // constructor automatically split separate paths into separate members,
        // and then just always use add(CompoundShape) logic.

//        assertEquals(0, engine.operationCtr);

        // ... but the current code sees our Path2Ds as one blob, so we expect them
        // to intersect and we'll have to use the engine to resolve the add(..):
        assertEquals(1, factory.operationCtr);
    }
}