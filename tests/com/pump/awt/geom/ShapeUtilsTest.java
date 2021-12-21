package com.pump.awt.geom;

import com.pump.awt.geom.outline.Outline;
import junit.framework.TestCase;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ShapeUtilsTest extends TestCase {

    // As of this writing the ShapeUtils class also contains a getBounds2D() method. There are unit tests for that method,
    // but I did not copy them here.

    public void testToRectangle2D_clockwise_topleft() {
        testToRectangle(0, 0, 10, 0, 10, 10, 0, 10);
    }

    public void testToRectangle2D_clockwise_topright() {
        testToRectangle(10, 0, 10, 10, 0, 10, 0, 0);
    }

    public void testToRectangle2D_clockwise_bottomright() {
        testToRectangle(10, 10, 0, 10, 0, 0, 10, 0);
    }

    public void testToRectangle2D_clockwise_bottomleft() {
        testToRectangle(0, 10, 0, 0, 10, 0, 10, 10);
    }

    public void testToRectangle2D_counter_clockwise_topleft() {
        testToRectangle(0, 0, 0, 10, 10, 10, 10, 0);
    }

    public void testToRectangle2D_counter_clockwise_bottomleft() {
        testToRectangle(0, 10, 10, 10, 10, 0, 0, 0);
    }

    public void testToRectangle2D_counter_clockwise_bottomright() {
        testToRectangle(10, 10, 10, 0, 0, 0, 0, 10);
    }

    public void testToRectangle2D_counter_clockwise_topright() {
        testToRectangle(10, 0, 0, 0, 0, 10, 10, 10);
    }

    public void testToRectangleNull_1() {
        testToRectangleNull(new Point(0,0), new Point(10, 10), new Point(10, 0), new Point(0, 10));
    }

    public void testToRectangleNull_2() {
        testToRectangleNull(new Point(0,0), new Point(0, 10), new Point(10, 0), new Point(10, 10));
    }

    public void testToRectangleNull_3() {
        testToRectangleNull(new Point(0,0), new Point(0, 10), new Point(10, 0));
    }

    public void testToRectangleMultiplePaths() {
        Path2D p = new Path2D.Double();
        p.append(new Rectangle(0,0,10,10), false);
        p.append(new Rectangle(0,0,10,10), false);
        assertEquals(null, ShapeUtils.toRectangle2D(p.getPathIterator(null)));
    }

    private void testToRectangle(int x0, int y0,int x1, int y1,int x2, int y2,int x3, int y3) {
        for(int dx : new int[] { -100, 0, 100}) {
            for(int dy : new int[] { -100, 0, 100}) {
                for (boolean closed : new boolean[] {true, false}) {
                    Path2D p = new Path2D.Double();
                    p.moveTo(x0 + dx, y0 + dy);
                    p.lineTo(x1+ dx, y1 + dy);
                    p.lineTo(x2+ dx, y2 + dy);
                    p.lineTo(x3+ dx, y3 + dy);
                    if (closed)
                        p.closePath();

                    Rectangle r = (Rectangle) ShapeUtils.toRectangle2D(p.getPathIterator(null));
                    assertEquals(0 + dx, r.x);
                    assertEquals(0 + dy, r.y);
                    assertEquals(10, r.width);
                    assertEquals(10, r.height);
                }
            }
        }
    }

    private void testToRectangleNull(Point... pts) {
        Path2D p = new Path2D.Double();
        p.moveTo(pts[0].x, pts[0].y);
        for(int a = 1; a<pts.length; a++) {
            p.lineTo(pts[a].x, pts[a].y);
        }
        assertEquals(null, ShapeUtils.toRectangle2D(p.getPathIterator(null)));
    }

    public void testToRectangle_awtRectangle() {
        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(new Rectangle(0,0,10,10).getPathIterator(null)));
    }

    // TODO: make rectangle-detection smarter so this unit test passes:
//    public void testToRectangle2D_midpoint() {
//        Path2D p = new Path2D.Double();
//        p.moveTo(5, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.lineTo(0,0);
//        p.closePath();
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//    }

    // TODO: make rectangle-detection smarter so this unit test passes:
//    public void testToRectangle2D_closedness() {
//        // this has all 4 points, but it isn't closed:
//        Path2D p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//
//        assertEquals(null, ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//
//        // this has all 4 points, it isn't closed, but it circles back to the origin:
//        p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.lineTo(0, 0);
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//
//        // this has all 4 points, and it IS closed:
//        p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.closePath();
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//
//        // this has all 4 points, and it circles back to the origin, and its closed:
//        p = new Path2D.Double();
//        p.moveTo(0, 0);
//        p.lineTo(10, 0);
//        p.lineTo(10, 10);
//        p.lineTo(0, 10);
//        p.lineTo(0, 0);
//        p.closePath();
//
//        assertEquals(new Rectangle(0,0,10,10), ShapeUtils.toRectangle2D(p.getPathIterator(null)));
//    }


    public static void testEquals(String name, Shape expectedShape, Shape actualShape) {
        Rectangle r = expectedShape.getBounds();
        r.add(actualShape.getBounds());
        BufferedImage expectedImage = createImage(expectedShape, r);
        BufferedImage actualImage = createImage(actualShape, r);
        assertImageEquals(name, expectedImage, actualImage);
    }

    protected static BufferedImage createImage(Shape shape, Rectangle bounds) {
        try {
            int w = Math.max(100, Math.min(1000, bounds.width));
            int h = Math.max(100, Math.min(1000, bounds.height));
            BufferedImage bi = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = bi.createGraphics();
            if (w != bounds.width || h != bounds.height)
                g.scale( ((double)w)/((double)bounds.width), ((double)h)/((double)bounds.height) );
            g.setColor(Color.black);
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.translate(-bounds.x, -bounds.y);
            g.fill(shape);
            g.dispose();
            return bi;
        } catch(OutOfMemoryError e) {
            System.err.println("bounds: "+bounds);
            throw e;
        }
    }

    public static void assertImageEquals(String name, BufferedImage expected, BufferedImage actual) {
        try {
            assertEquals(expected.getHeight(), actual.getHeight());
            assertEquals(expected.getWidth(), actual.getWidth());
            assertEquals(expected.getType(), actual.getType());

            int w = expected.getWidth();
            int h = expected.getHeight();
            int[] row1 = new int[w];
            int[] row2 = new int[w];
            for (int y = 0; y < h; y++) {
                expected.getRaster().getDataElements(0, y, w, 1, row1);
                actual.getRaster().getDataElements(0, y, w, 1, row2);
                for (int x = 0; x < w; x++) {
                    int argb1 = row1[x];
                    int argb2 = row2[x];
                    int rgb1 = argb1 & 0xffffff;
                    int rgb2 = argb2 & 0xffffff;
                    assertEquals(x + ", " + y, Integer.toHexString(rgb1), Integer.toHexString(rgb2));

                    int alpha1 = (argb1 >> 24) & 0xff;
                    int alpha2 = (argb2 >> 24) & 0xff;
                    if (Math.abs(alpha1 - alpha2) > 20) {
                        Graphics2D g1 = expected.createGraphics();
                        Graphics2D g2 = actual.createGraphics();
                        g1.setColor(Color.red);
                        g1.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                        g1.draw(new Ellipse2D.Float(x - 3, y - 3, 6, 6));
                        g1.dispose();
                        g2.setColor(Color.red);
                        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                        g2.draw(new Ellipse2D.Float(x - 3, y - 3, 6, 6));
                        g2.dispose();
                        fail(x + ", " + y+" alpha1 = "+Integer.toHexString(alpha1)+", alpha2 = "+Integer.toHexString(alpha2));
                    }
                }
            }
        } catch(Throwable t) {
            writeImage(name+"-expected", expected);
            writeImage(name+"-actual", actual);
            throw t;
        }
    }

    public static void writeImage(String name, BufferedImage bi) {
        File file = new File(name+".png");
        try {
            ImageIO.write(bi, "png", file);
            System.err.println("Wrote "+file.getAbsolutePath());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
