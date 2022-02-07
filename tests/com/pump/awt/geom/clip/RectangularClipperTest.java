package com.pump.awt.geom.clip;

import com.pump.awt.geom.RectangularTransform;
import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.ShapeUtilsTest;
import com.pump.awt.geom.mask.RectangleMask2D;
import junit.framework.TestCase;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class RectangularClipperTest extends TestCase {

    /**
     * This clips a circle thousands of times to a rectangle and compares
     * the result of multiple RectangularClipper implementations.
     */
    public void testCircle() {
        double r = 40;
        Rectangle rect = new Rectangle(0,0,100,100);
        int testCtr = 0;
        for(int cy = -150; cy <= 150; cy++) {
            for(int cx = -150; cx <= 150; cx++) {
                Ellipse2D.Double circle = new Ellipse2D.Double(cx - r, cy - r, 2.0 * r, 2.0 * r);

                testCtr++;
                String testName = testCtr+" "+toString(circle)+" "+rect;

                testClip(testName, circle, rect);
            }
        }

        // a circle rotated exactly 45• presents some unique challenges: lots of bezier curves
        // come up where the (t^3) coefficient is zero or nearly zero

        for (int angleMultiplier = 1; angleMultiplier<=8; angleMultiplier++) {
            for (int cy = -150; cy <= 150; cy++) {
                for (int cx = -150; cx <= 150; cx++) {
                    Ellipse2D.Double circle = new Ellipse2D.Double(cx - r, cy - r, 2.0 * r, 2.0 * r);

                    testCtr++;
                    String testName = testCtr + " rotated " + toString(circle) + " " + rect;

                    Shape rotated = AffineTransform.getRotateInstance(Math.PI * angleMultiplier / 4.0, cx, cy).createTransformedShape(circle);

                    testClip(testName, rotated, rect);
                }
            }
        }

        // test lots of random variations:

        Random random = new Random(0);
        for (double cy = -150; cy <= 150; cy += random.nextDouble() ) {
            for (double cx = -150; cx <= 150; cx += random.nextDouble() ) {
                double dx = random.nextDouble() * 2 - 1;
                double dy = random.nextDouble() * 2 - 1;
                double dr = random.nextDouble() * 2 - 1;

                Ellipse2D.Double circle = new Ellipse2D.Double(cx - r + dx, cy - r + dy, 2.0 * r + dr, 2.0 * r + dr);

                testCtr++;
                String testName = testCtr+" "+toString(circle)+" "+rect;

                Shape rotated = AffineTransform.getRotateInstance(random.nextDouble(), cx, cy).createTransformedShape(circle);

                testClip(testName, rotated, rect);
            }
        }

        System.out.println("Tested "+testCtr+" configurations");
    }

    private String toString(Shape shape) {
        if (shape instanceof Ellipse2D) {
            Ellipse2D e = (Ellipse2D) shape;
            return "Ellipse2D( " + e.getX()+", "+e.getY()+", "+e.getWidth()+", "+e.getHeight()+")";
        }
        return shape.toString();
    }

    private void testClip(String testName, Shape shape, Rectangle2D rect) {
        Shape lastClippedShape = null;
        Shape baselineShape = null;
        String baselineName = null;
        try {
            for (RectangularClipper clipper : getClippers()) {
                Shape clippedShape = clipper.clip(shape, null, rect);
                lastClippedShape = clippedShape;
                if (baselineShape == null) {
                    baselineShape = clippedShape;
                    baselineName = testName + " " + clipper.getClass().getSimpleName();
                } else {
                    String currentName = testName + " " + clipper.getClass().getSimpleName();
                    ShapeUtilsTest.testEquals(baselineName, currentName, baselineShape, clippedShape, true);
                }
            }
        } catch(RuntimeException | Error t) {
            Rectangle2D bounds = ShapeUtils.getBounds2D(rect);
            bounds.add(ShapeUtils.getBounds2D(shape));
            bounds.setFrame(bounds.getMinX() - 5, bounds.getMinY() - 5,
                    bounds.getWidth() + 10, bounds.getHeight() + 10);
            double size = Math.max(bounds.getWidth(), bounds.getHeight());
            bounds.setFrame(bounds.getMinX(), bounds.getMinY(), size, size);
            BufferedImage bi = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = bi.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            RectangularTransform rt = new RectangularTransform(bounds, new Rectangle(0,0,bi.getWidth(),bi.getHeight()));
            g.transform(rt.createAffineTransform());
            g.setColor(new Color(0,200,100,50));
            g.fill(rect);
            g.setColor(new Color(150,200,0,50));
            g.fill(shape);
            if (lastClippedShape != null) {
                g.setColor(new Color(150, 0, 200, 50));
                g.fill(lastClippedShape);
            }
            if (baselineShape != null) {
                g.setColor(new Color(0, 0, 0, 50));
                g.draw(baselineShape);
            }
            g.dispose();

            try {
                File file = new File(testName+" composition.png");
                ImageIO.write(bi, "png", file);
            } catch(IOException e) {
                e.printStackTrace();
            }
            throw t;
        }
    }

    private RectangularClipper[] getClippers() {
        return new RectangularClipper[] { new AreaRectangularClipper(), new DefaultRectangularClipper() };
    }
}
