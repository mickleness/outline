package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.ShapeUtilsTest;
import org.junit.Test;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.text.NumberFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This confirms that other OutlineEngines produce visual results that
 * resemble the PlainAreaEngine.
 */
public class EngineAccuracyTests extends OutlineTests {

    abstract class RedundancyTest {
        String name;

        RedundancyTest(String name) {
            this.name = name;
        }

        public String run() {
            Outline baselineShape = null;
            String description = null;
            List<OutlineOperation> ops = null;
            for (OutlineEngine engine : getEngines()) {
                Outline outline = null;

                outline = new Outline(engine);
                description = populate(outline);
                if (ops == null) {
                    ops = new LinkedList<>();
                    ops.addAll(outline.operationQueue);

                    new OptimizedEngine().removeTransforms(ops);
                }
                outline.flush();

                if (baselineShape == null) {
                    baselineShape = outline;
                } else {
                    try {
                        ShapeUtilsTest.testEquals(name+"-expected", name+"-actual", baselineShape, outline, true);
                    } catch (RuntimeException | Error e) {
                        System.err.println("engine: " + engine.toString());
                        System.err.println(description);
                        try {
                            ShapeUtilsTest.testEquals(name+"-expected", name+"-actual", baselineShape, outline, true);
                        } catch(Throwable t) {}

                        Rectangle2D r = null;
                        for(OutlineOperation op : ops) {
                            if (r == null) {
                                r = op.shape.getBounds2D();
                            } else {
                                r.add(op.shape.getBounds2D());
                            }
                        }
                        if (r != null) {
                            BufferedImage img = createDebugImage(r, ops);
                            ShapeUtilsTest.writeImage(name + "-ops", img);
                        }

                        throw e;
                    }
                }
            }
            return description;
        }

        Color[] colors = new Color[] { new Color(0xef476f), new Color(0xffd166), new Color(0x06d6a0), new Color(0x118ab2), new Color(0x073b4c) };
        private BufferedImage createDebugImage(Rectangle2D shapeBounds, List<OutlineOperation> ops) {
            Rectangle imgBounds = new Rectangle(0,0,400,400);
            AffineTransform tx = new AffineTransform();
            tx.scale(imgBounds.getWidth() / shapeBounds.getWidth(), imgBounds.getHeight() / shapeBounds.getHeight());
            tx.translate(-shapeBounds.getX(), -shapeBounds.getY());
            BufferedImage bi = new BufferedImage(imgBounds.width, imgBounds.height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = bi.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g.setColor(new Color(0,0,0,100));
            g.setStroke(new BasicStroke(1, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 10, new float[] {3, 3}, 0));
            for(int y = -5; y<10; y++) {
                g.draw(tx.createTransformedShape(new Line2D.Float(-5, y, 15, y)));
            }
            for(int x = -5; x<10; x++) {
                g.draw(tx.createTransformedShape(new Line2D.Float(x, -5, x, 15)));
            }

            Font font = new Font("sanserif", 0, 16);
            g.setFont(font);
            for(int a = 0; a<ops.size(); a++) {
                Color c = colors[a%colors.length];
                g.setColor(new Color(c.getRed(), c.getGreen(), c.getBlue(), 50));
                g.fill(tx.createTransformedShape(ops.get(a).shape));
                Rectangle2D opBounds = ShapeUtils.getBounds2D(ops.get(a).shape.getPathIterator(tx));
                String str;
                if (ops.get(a).type == OutlineOperation.Type.ADD) {
                    str = "+";
                } else if (ops.get(a).type == OutlineOperation.Type.SUBTRACT) {
                    str = "-";
                } else if (ops.get(a).type == OutlineOperation.Type.XOR) {
                    str = "X";
                } else if (ops.get(a).type == OutlineOperation.Type.INTERSECT) {
                    str = "[]";
                } else {
                    str = "?";
                }
                g.setColor(new Color(c.getRed()/2, c.getGreen()/2, c.getBlue()/2, 240));
                Rectangle2D strBounds = g.getFontMetrics(font).getStringBounds(str, g);
                g.drawString(str, (float)(opBounds.getCenterX() - strBounds.getWidth()/2), (float)(opBounds.getCenterY() - strBounds.getY()/2) );
            }

            g.dispose();
            return bi;
        }

        /**
         * @param outline the outline to populate
         * @return an optional String to print if there is an error
         */
        protected abstract String populate(Outline outline);
    }

    @Override
    public OutlineEngine[] getEngines() {
        return new OutlineEngine[]{new PlainAreaEngine(),
                new OptimizedEngine()};
    }

    /**
     * Test a wide range of random operations and make sure the results of both engines match..
     */
    @Test
    public void testAccuracy() {
        class AccuracyTest extends RedundancyTest {
            long randomSeed;
            public AccuracyTest(long randomSeed) {
                super("seed-"+randomSeed);
                this.randomSeed = randomSeed;
            }

            @Override
            protected String populate(Outline outline) {
                String returnValue = "";
                Random random = new Random(randomSeed);
                for(int a = 0; a < 4; a++) {
                    String str = "";
                    OutlineOperation.Type type = OutlineOperation.Type.values()[random.nextInt(OutlineOperation.Type.values().length)];
                    if (type == OutlineOperation.Type.TRANSFORM) {
                        double theta = 4 * Math.PI * (random.nextDouble() - .5);
                        double cx = 30 * random.nextInt(3);
                        double cy = 30 * random.nextInt(3);
                        AffineTransform at = AffineTransform.getRotateInstance(theta, cx, cy);
                        outline.transform(at);
                        str = "outline.transform( AffineTransform.getRotateInstance(" + theta + ", " + cx + ", " + cy + ") )";
                    } else {
                        double x = random.nextInt(3)+ ((double)random.nextInt(10))/10.0;
                        double y = random.nextInt(3) + ((double)random.nextInt(10))/10.0;
                        double w = random.nextInt(2) + .9;
                        double h = random.nextInt(2) + .9;
                        Shape operand = null;
                        switch(random.nextInt(3)) {
                            case 0:
                                operand = createPlus(x, y, w, h);
                                str = "createPlus("+x+", "+y+", "+w+", "+h+")";
                                break;
                            case 1:
                                operand = createTriangle(x, y, w, h);
                                str = "createTriangle("+x+", "+y+", "+w+", "+h+")";
                                break;
                            case 2:
                                operand = createSquare(x, y, w, h);
                                str = "createSquare("+x+", "+y+", "+w+", "+h+")";
                                break;
                        }
                        switch(type) {
                            case ADD:
                                outline.add(operand);
                                str = "outline.add("+str+")";
                                break;
                            case SUBTRACT:
                                outline.subtract(operand);
                                str = "outline.subtract("+str+")";
                                break;
                            case XOR:
                                outline.exclusiveOr(operand);
                                str = "outline.exclusiveOr("+str+")";
                                break;
                            case INTERSECT:
                                outline.intersect(operand);
                                str = "outline.intersect("+str+")";
                                break;
                            default:
                                throw new IllegalStateException();
                        }
                    }

                    returnValue += str + "\n";
                }
                return returnValue;
            }
        }

        boolean fail = false;
        long lastOutput = System.currentTimeMillis();

        int max = 50_000;
        boolean overnight = false;
        if (overnight) {
            max = 57_000_000;
        }

        for (int ctr = 0; ctr <= max; ctr++) {
            long time = System.currentTimeMillis();
            long elapsedTime = time - lastOutput;
            if ( elapsedTime > 10000) {
                lastOutput = time;
                System.out.println("... currently on sample #"+NumberFormat.getInstance().format(ctr));
            }
            AccuracyTest test = new AccuracyTest(ctr);
            String description = null;
            try {
                description = test.run();
            } catch(RuntimeException | Error e) {
                System.err.println("sample = "+ctr);
                e.printStackTrace();
                fail = true;
            }
        }

        System.out.println("... finished #"+NumberFormat.getInstance().format(max)+" samples.");

        if (fail)
            fail();
    }

    /**
     * This was identified with a randomized trial. (The exact origins may be somewhere in git's history, but I
     * forget what they are now...)
     */
    public void testMemoryFailure() {
        for(OutlineEngine engine : getEngines()) {
            Outline outline = new Outline(engine);
            outline.add(createEllipse(0, 2, .9, .9));
            outline.exclusiveOr(createTriangle(0, 2, .9, .9));
            outline.exclusiveOr(createEllipse(0, 2, .9, .9));
            outline.add(createSquare(2, 2, .9, .9));
            outline.add(createEllipse(1, 2, .9, .9));
            outline.exclusiveOr(createEllipse(0, 2, .9, .9));
            outline.add(createSquare(0, 0, .9, .9));
            outline.add(createTriangle(2, 1, .9, .9));
            outline.add(createEllipse(2, 0, .9, .9));
            outline.subtract(createEllipse(1, 0, .9, .9));

            boolean expectFailure = engine instanceof PlainAreaEngine;
            try {
                outline.flush();
                if (expectFailure) {
                    fail();
                }
            } catch (Throwable t) {
                if (!expectFailure) {
                    t.printStackTrace();
                    fail();
                }
            }
        }
    }
}
