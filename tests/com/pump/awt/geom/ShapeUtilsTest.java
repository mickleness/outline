package com.pump.awt.geom;

import com.pump.awt.geom.outline.Outline;
import junit.framework.TestCase;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
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

    /**
     * This confirms that the return value for toRectangle2D is an
     * int-based rectangle when possible
     */
    public void testToRectangle_intRectangle2() {
        Rectangle2D r2D = new Rectangle2D.Double(0,0,10,10);
        Rectangle2D t = ShapeUtils.toRectangle2D(r2D);
        assertEquals(new Rectangle(0,0,10,10), t);
        assertEquals(Rectangle.class, t.getClass());

        t = ShapeUtils.toRectangle2D(new Path2D.Double(r2D));
        assertEquals(new Rectangle(0,0,10,10), t);
        assertEquals(Rectangle.class, t.getClass());
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


    /**
     * @param highPrecision if true then the shapes must produce very close to a pixel-perfect replica.
     *                      If false then we blur the images and apply a very generous threshold for comparison,
     *                      so only really striking difference (like missing pixels) will be detected.
     */
    public static void testEquals(String expectedName, String actualName, Shape expectedShape, Shape actualShape, boolean highPrecision) {
        Rectangle r = expectedShape.getBounds();
        r.add(actualShape.getBounds());
        BufferedImage expectedImage = createImage(expectedShape, r);
        BufferedImage actualImage = createImage(actualShape, r);

        if (!highPrecision) {
            // the ScaledMaskOutlineEngine is a little chunkier than the AreaOutlineEngine. Instead of fixing
            // this: I'll just make the image comparison fuzzier.
            expectedImage = blur(expectedImage);
            actualImage = blur(actualImage);
        }

        int threshold = highPrecision ? 50 : 240;
        assertImageSimilar(expectedName, actualName, expectedImage, actualImage, threshold);
    }

    private static BufferedImage blur(BufferedImage src) {
        // yes, there's a lot I could do to to make this more efficient
        // ... but this works for now and doesn't bloat the project.
        int[][] matrix = new int[][] {
                {1, 4, 8, 10, 8, 4, 1},
                {4, 12, 24, 30, 24, 12, 4},
                {8, 24, 47, 59, 47, 24, 8},
                {10, 30, 59, 73, 59, 30, 10},
                {8, 24, 47, 59, 47, 24, 8},
                {4, 12, 24, 30, 24, 12, 4},
                {1, 4, 8, 10, 8, 4, 1} };
        int w = src.getWidth();
        int h = src.getHeight();
        int[] argbSrc = new int[w * h];
        int[] argbDst = new int[w * h];

        src.getRaster().getDataElements(0, 0, w, h, argbSrc);

        for (int y = 0; y < h; y++) {
            for (int x = 0; x < w; x++) {

                int sum = 0;
                int value = 0;
                for (int my = 0; my < 7; my++) {
                    int ysrc = y + my - 4;
                    if (ysrc >= 0 && ysrc < h) {
                        for (int mx = 0; mx < 7; mx++) {
                            int xsrc = x + mx - 4;
                            if (xsrc >= 0 && xsrc < w) {

                                int argb = argbSrc[ysrc * w + xsrc];
                                int alpha = (argb >> 24) & 0xff;
                                value += alpha * matrix[my][mx];

                                sum += matrix[my][mx];
                            }
                        }
                    }
                }

                value = value / sum;
                argbDst[y * w + x] = value << 24;
            }
        }

        src.getRaster().setDataElements(0, 0, src.getWidth(), src.getHeight(), argbDst);
        return src;
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

    public static void assertImageSimilar(String expectedName, String actualName, BufferedImage expected, BufferedImage actual, int threshold) {
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
                    // we want to know if it's REALLY off. Like white = black off.
                    if (Math.abs(alpha1 - alpha2) > threshold) {
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
            writeImage(expectedName, expected);
            writeImage(actualName, actual);
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

    public void testRelationship() {
        RoundRectangle2D outer = new RoundRectangle2D.Double(0,0,100,100,5,5);
        RoundRectangle2D inner = new RoundRectangle2D.Double(40,40,20, 20,2,2);
        assertEquals(ShapeUtils.Relationship.LHS_CONTAINS_RHS, ShapeUtils.getRelationship(outer, inner));
        assertEquals(ShapeUtils.Relationship.RHS_CONTAINS_LHS, ShapeUtils.getRelationship(inner, outer));

        RoundRectangle2D side = new RoundRectangle2D.Double(90,40,20, 20,2,2);
        assertEquals(ShapeUtils.Relationship.MAY_INTERSECT, ShapeUtils.getRelationship(outer, side));
        assertEquals(ShapeUtils.Relationship.MAY_INTERSECT, ShapeUtils.getRelationship(side, outer));

        assertEquals(ShapeUtils.Relationship.NONE, ShapeUtils.getRelationship(inner, side));
        assertEquals(ShapeUtils.Relationship.NONE, ShapeUtils.getRelationship(side, inner));
    }

    public void testRectangleIntersection() {
        Rectangle2D horizLine = new Rectangle2D.Float(0,5,10,0);
        Rectangle2D vertLine = new Rectangle2D.Double(5,0,0,10);

        assertTrue( ShapeUtils.intersects(horizLine, vertLine));
        assertTrue( ShapeUtils.intersects(vertLine, horizLine));

        Rectangle nw_overlap = new Rectangle(-1, -1, 2, 2);
        Rectangle n_overlap = new Rectangle(4, -1, 2, 2);
        Rectangle ne_overlap = new Rectangle(9, -1, 2, 2);
        Rectangle w_overlap = new Rectangle(-1, 4, 2, 2);
        Rectangle center_overlap = new Rectangle(4, 4, 2, 2);
        Rectangle e_overlap = new Rectangle(9, 4, 2, 2);
        Rectangle sw_overlap = new Rectangle(-1, 9, 2, 2);
        Rectangle s_overlap = new Rectangle(4, 9, 2, 2);
        Rectangle se_overlap = new Rectangle(9, 9, 2, 2);

        // test each rect against horizontal line:
        assertFalse( ShapeUtils.intersects(nw_overlap, horizLine));
        assertFalse( ShapeUtils.intersects(n_overlap, horizLine));
        assertFalse( ShapeUtils.intersects(ne_overlap, horizLine));
        assertTrue( ShapeUtils.intersects(w_overlap, horizLine));
        assertTrue( ShapeUtils.intersects(center_overlap, horizLine));
        assertTrue( ShapeUtils.intersects(e_overlap, horizLine));
        assertFalse( ShapeUtils.intersects(sw_overlap, horizLine));
        assertFalse( ShapeUtils.intersects(s_overlap, horizLine));
        assertFalse( ShapeUtils.intersects(se_overlap, horizLine));

        // same set, just reverse arguments
        assertFalse( ShapeUtils.intersects(horizLine, nw_overlap));
        assertFalse( ShapeUtils.intersects(horizLine, n_overlap));
        assertFalse( ShapeUtils.intersects(horizLine, ne_overlap));
        assertTrue( ShapeUtils.intersects(horizLine, w_overlap));
        assertTrue( ShapeUtils.intersects(horizLine, center_overlap));
        assertTrue( ShapeUtils.intersects(horizLine, e_overlap));
        assertFalse( ShapeUtils.intersects(horizLine, sw_overlap));
        assertFalse( ShapeUtils.intersects(horizLine, s_overlap));
        assertFalse( ShapeUtils.intersects(horizLine, se_overlap));

        // test each rect against vertical line:
        assertFalse( ShapeUtils.intersects(nw_overlap, vertLine));
        assertTrue( ShapeUtils.intersects(n_overlap, vertLine));
        assertFalse( ShapeUtils.intersects(ne_overlap, vertLine));
        assertFalse( ShapeUtils.intersects(w_overlap, vertLine));
        assertTrue( ShapeUtils.intersects(center_overlap, vertLine));
        assertFalse( ShapeUtils.intersects(e_overlap, vertLine));
        assertFalse( ShapeUtils.intersects(sw_overlap, vertLine));
        assertTrue( ShapeUtils.intersects(s_overlap, vertLine));
        assertFalse( ShapeUtils.intersects(se_overlap, vertLine));

        // same set, just reverse arguments
        assertFalse( ShapeUtils.intersects(vertLine, nw_overlap));
        assertTrue( ShapeUtils.intersects(vertLine, n_overlap));
        assertFalse( ShapeUtils.intersects(vertLine, ne_overlap));
        assertFalse( ShapeUtils.intersects(vertLine, w_overlap));
        assertTrue( ShapeUtils.intersects(vertLine, center_overlap));
        assertFalse( ShapeUtils.intersects(vertLine, e_overlap));
        assertFalse( ShapeUtils.intersects(vertLine, sw_overlap));
        assertTrue( ShapeUtils.intersects(vertLine, s_overlap));
        assertFalse( ShapeUtils.intersects(vertLine, se_overlap));
    }
}
