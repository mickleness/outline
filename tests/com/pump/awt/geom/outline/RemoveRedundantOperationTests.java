package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.ShapeUtilsTest;
import org.junit.Test;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.*;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class RemoveRedundantOperationTests extends OutlineTests {

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
                }
                outline.flush();

                if (baselineShape == null) {
                    baselineShape = outline;
                } else {
                    try {
                        ShapeUtilsTest.testEquals(name+"-expected", name+"-actual", baselineShape, outline);
                    } catch (RuntimeException | Error e) {
                        System.err.println("engine: " + engine.toString());
                        System.err.println(description);

                        Rectangle2D r = null;
                        for(OutlineOperation op : ops) {
                            if (r == null) {
                                r = op.shape.getBounds2D();
                            } else {
                                r.add(op.shape.getBounds2D());
                            }
                        }
                        BufferedImage img = createDebugImage(r, ops);
                        ShapeUtilsTest.writeImage(name+"-ops", img);

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
                    new OptimizedAreaEngine(1)};
    }

    /**
     * This tests a specific failure we observed with random combinations of operations.
     */
    public void testClip_1() {
        RedundancyTest r = new RedundancyTest("clip test 1") {

            @Override
            protected String populate(Outline outline) {
                outline.add(createPlus(0.8, 0.8, .9, .9));
                outline.add(createPlus(2.3, 1.1, .9, .9));
                outline.intersect(createTriangle(2.1, 0.9, .9, .9));
                outline.intersect(createTriangle(1.9, 0.8, .9, .9));
                return null;
            }
        };
        r.run();
    }

    /**
     * This tests a specific failure we observed with random combinations of operations.
     */
    public void testClip_2() {
        RedundancyTest r = new RedundancyTest("clip test 2") {

            @Override
            protected String populate(Outline outline) {
                outline.add(createTriangle(1.3, 2.3, .9, .9));
                outline.intersect(createSquare(0.8, 2.1, .9, .9));
                outline.exclusiveOr(createSquare(1.4, 1.4, .9, .9));
                outline.intersect(createSquare(1.8, 1.6, .9, .9));
                return null;
            }
        };
        r.run();
    }

    /**
     * Test a wide range of random operations and make sure the results of both engines match.
     * <p>
     * This test isn't interested in performance (many tests will happen to take the same amount of time);
     * this test wants to rigorously test combinations and hopefully test edge cases.
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
                    double x = random.nextInt(3)+ ((double)random.nextInt(10))/10.0;
                    double y = random.nextInt(3) + ((double)random.nextInt(10))/10.0;
                    double w = random.nextInt(2) + .9;
                    double h = random.nextInt(2) + .9;
                    OutlineOperation.Type type = OutlineOperation.Type.values()[random.nextInt(OutlineOperation.Type.values().length)];
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
                    returnValue += str + "\n";
                }
                return returnValue;
            }
        }

        AtomicInteger ctr = new AtomicInteger(0);
        int threadCount = 8;
        AtomicBoolean fail = new AtomicBoolean(false);
        final Thread[] threads = new Thread[threadCount];
        for(int a = 0; a < threadCount; a++) {
            threads[a] = new Thread() {
                long lastOutput = System.currentTimeMillis();
                public void run() {
                    while (true) {
                        int nextSample = ctr.getAndIncrement();
                        if (nextSample >= 10_000)
                            return;

                        long time = System.currentTimeMillis();
                        if ( time - lastOutput > 10000 && this == threads[0]) {
                            lastOutput = time;
                            System.out.println(NumberFormat.getInstance().format(nextSample));
                        }
                        AccuracyTest test = new AccuracyTest(nextSample);
                        String description = null;
                        try {
                            description = test.run();
                        } catch(RuntimeException | Error e) {
                            System.err.println("a = "+nextSample);
                            e.printStackTrace();
                            fail.set(true);
                        }
                    }
                }
            };
            threads[a].start();
        }
        for(int a = 0; a < threadCount; a++) {
            try {
                threads[a].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (fail.get())
            fail();
    }

    @Test
    public void testRedundantSubtractWithBody() {
        RedundancyTest test = new RedundancyTest("unnecessary subtract with body") {
            @Override
            protected String populate(Outline outline) {
                outline.add(createSquiggle(0, 0,0));
                outline.add(createSquiggle(0, 1,0));
                outline.add(createSquiggle(0, 2,0));
                outline.subtract(createSquiggle(0, 3,0));
                outline.subtract(createSquiggle(0, 0,1));
                outline.subtract(createSquiggle(0, 0,-1));
                outline.subtract(createSquiggle(0, -1,0));
                outline.add(createSquiggle(0, 4,0));
                outline.flush();
                return null;
            }
        };
    }

    @Test
    public void testRedundantSubtractWithoutBody() {
        RedundancyTest test = new RedundancyTest("unnecessary subtract without body") {
            @Override
            protected String populate(Outline outline) {
                outline.subtract(createSquiggle(0, 3,0));
                outline.subtract(createSquiggle(0, 0,1));
                outline.subtract(createSquiggle(0, 0,-1));
                outline.subtract(createSquiggle(0, -1,0));
                outline.add(createSquiggle(0, 0,0));
                outline.add(createSquiggle(0, 1,0));
                outline.add(createSquiggle(0, 2,0));
                outline.flush();
                return null;
            }
        };
    }

    @Test
    public void testRedundantIntersectWithBody_noOverlap() {
        RedundancyTest test = new RedundancyTest("unnecessary add with no overlap and body") {
            @Override
            protected String populate(Outline outline) {
                outline.add(createSquiggle(0, 0,0));
                outline.add(createSquiggle(0, 1,0));
                outline.add(createSquiggle(0, 2,0));
                outline.intersect(createSquare(1, 1, .9, .9));
                outline.add(createSquiggle(0, 2,0));
                outline.flush();
                return null;
            }
        };
    }

    @Test
    public void testRedundantIntersectWithBody_overlap() {
        RedundancyTest test = new RedundancyTest("unnecessary add with overlap and body") {
            @Override
            protected String populate(Outline outline) {
                outline.add(createSquiggle(0, 0,0));
                outline.add(createSquiggle(0, 1,0));
                outline.add(createSquiggle(1, 1,0));
                outline.intersect(createSquare(1, 1, .9, .9));
                outline.add(createSquiggle(0, 2,0));
                outline.flush();
                return null;
            }
        };
    }
}
