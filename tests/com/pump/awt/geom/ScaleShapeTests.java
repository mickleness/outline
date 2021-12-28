package com.pump.awt.geom;

import junit.framework.TestCase;

import java.awt.geom.Path2D;

public class ScaleShapeTests extends TestCase {

    public void test() {
        Path2D path = createTriangle();

        RectangularTransform tx = new RectangularTransform(-1, 0, 0, 0);
        ScaledShape scaledShape = new ScaledShape(createTriangle(), tx);

        path.transform(tx.createAffineTransform());

        ShapeUtilsTest.testEquals("expected", "actual", path, scaledShape, true);

        assertEquals( path.getBounds(), scaledShape.getBounds());
        assertEquals( path.getBounds2D(), scaledShape.getBounds2D());

        for(int y = -10; y<=20; y++) {
            for(int x = -10; x<=20; x++) {
                String str = "x = "+x+", y = "+y;
                assertEquals( str, path.intersects(x, y, 1, 1), scaledShape.intersects(x, y, 1, 1) );
                assertEquals( str, path.contains(x, y, 1, 1), scaledShape.contains(x, y, 1, 1) );
                assertEquals( str, path.contains(x, y), scaledShape.contains(x, y) );
            }
        }
    }

    private Path2D createTriangle() {
        Path2D p = new Path2D.Double();
        p.moveTo(1,1);
        p.lineTo(1, 10);
        p.lineTo( 10, 10);
        p.closePath();
        return p;
    }
}
