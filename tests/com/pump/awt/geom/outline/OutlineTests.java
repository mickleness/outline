package com.pump.awt.geom.outline;

import com.pump.awt.geom.outline.OptimizedAreaEngine;
import com.pump.awt.geom.outline.Outline;
import com.pump.awt.geom.outline.OutlineEngine;
import com.pump.awt.geom.outline.PlainAreaEngine;
import junit.framework.TestCase;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

public abstract class OutlineTests extends TestCase {

    public Writer createLog(String name) throws FileNotFoundException {if (name.contains("/") || name.contains("\\"))
        throw new IllegalArgumentException("illegal name = "+name);
        File file = new File(name+" Output.log");
        FileOutputStream fileOut = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fileOut) {
            @Override
            public void write(String str) throws IOException {
                super.write(str);
                System.out.print(str);
            }
        };

        return writer;
    }

    public OutlineEngine[] getEngines() {
        return new OutlineEngine[] { new PlainAreaEngine(), new OptimizedAreaEngine(1), new OptimizedAreaEngine(4) };
    }

    public void testEquals(String name, Shape expectedShape, Outline actualShape) {
        Rectangle r = expectedShape.getBounds();
        r.add(actualShape.getBounds());
        BufferedImage expectedImage = createImage(expectedShape, r);
        BufferedImage actualImage = createImage(actualShape, r);
        assertImageEquals(name, expectedImage, actualImage);
    }

    protected BufferedImage createImage(Shape shape, Rectangle bounds) {
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

    public void assertImageEquals(String name, BufferedImage expected, BufferedImage actual) {
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

    protected void writeImage(String name, BufferedImage bi) {
        File file = new File(name+".png");
        try {
            ImageIO.write(bi, "png", file);
            System.err.println("Wrote "+file.getAbsolutePath());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Create a shape whose top-left is at (x,y) and who is .9 x .9 px in size.
     * This contains random cubic data to make it challenging enough for performance gains
     * to become apparent.
     */
    protected Path2D createSquiggle(long randomSeed, double x, double y) {
        Random random = new Random(randomSeed);
        Path2D p = new Path2D.Double();
        p.moveTo(x + .9f * random.nextFloat(), y + .9f * random.nextFloat());
        for (int a = 0; a<10; a++) {
            p.curveTo(x + .9f * random.nextFloat(), y + .9f * random.nextFloat(),
                    x + .9f * random.nextFloat(), y + .9f * random.nextFloat(),
                    x + .9f * random.nextFloat(), y + .9f * random.nextFloat());
        }
        p.closePath();
        return p;
    }

    // this completely envelopes all the other shapes
    protected Rectangle2D createSquare(double x, double y, double w, double h) {
        return new Rectangle2D.Double(x - .01, y - .01, w + .02, h + .02);
    }

    protected Ellipse2D createEllipse(double x, double y, double w, double h) {
        return new Ellipse2D.Double(x, y, w, h);
    }

    protected Path2D createPlus(double x, double y, double w, double h) {
        double k = Math.min(w, h) / .9;
        Path2D p = new Path2D.Double();
        p.moveTo(x + w/2 - k, y);
        p.lineTo(x + w/2 + k, y);
        p.lineTo(x + w/2 + k, y + h/2 - k);
        p.lineTo(x + w, y + h/2 - k);
        p.lineTo(x + w, y + h/2 + k);
        p.lineTo(x + w/2 + k, y + h/2 + k);
        p.lineTo(x + w/2 + k, y + h);
        p.lineTo(x + w/2 - k, y + h);
        p.lineTo(x + w/2 - k, y + h/2 + k);
        p.lineTo(x, y + h/2 + k);
        p.lineTo(x, y + h/2 - k);
        p.lineTo(x + w/2 - k, y + h/2 - k);
        p.closePath();
        return p;
    }

    protected Path2D createTriangle(double x, double y, double w, double h) {
        Path2D p = new Path2D.Double();
        p.moveTo(x + w/2, y);
        p.lineTo(x + w, y + h);
        p.lineTo(x , y + h);
        p.closePath();
        return p;
    }
}
