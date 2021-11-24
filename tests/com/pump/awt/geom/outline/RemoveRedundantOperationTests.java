package com.pump.awt.geom.outline;

import org.junit.Test;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

public class RemoveRedundantOperationTests extends OutlineTests {

    abstract class RedundancyTest {
        String name;
        Map<OutlineEngine, Long> timeMap = new LinkedHashMap<>();

        RedundancyTest(String name) {
            this.name = name;
        }

        public String run() {
            Outline baselineShape = null;
            String description = null;
            try {
                for (OutlineEngine engine : getEngines()) {
                    Outline outline = null;
                    PlainAreaEngine plainEngine = new PlainAreaEngine();
                    long[] times = new long[5];
                    for (int b = 0; b < times.length; b++) {
                        times[b] = System.currentTimeMillis();
                        outline = new Outline(engine);
                        description = populate(outline);

                        // exclusively test removeRedundanciesBasedOnBoundingBoxes method:
                        if (engine instanceof OptimizedAreaEngine) {
                            OptimizedAreaEngine opt = (OptimizedAreaEngine) engine;
                            outline.shape = opt.removeRedundanciesBasedOnBoundingBoxes(null, outline.operationQueue);
                        }
                        outline.shape = plainEngine.flush(null, outline.operationQueue);
                        outline.operationQueue.clear();

                        times[b] = System.currentTimeMillis() - times[b];
                    }
                    Arrays.sort(times);
                    timeMap.put(engine, times[times.length / 2]);

                    if (baselineShape == null) {
                        baselineShape = outline;
                        // to visually inspect everything:
                        // writeImage(name, createImage(outline));
                    } else {
                        try {
                            testEquals(name, baselineShape, outline);
                        } catch (RuntimeException | Error e) {
                            System.err.println(description);
                            throw e;
                        }
                    }
                }
            } catch(OutOfMemoryError error) {
                // TODO: https://github.com/mickleness/outline/issues/2
                System.err.println("failed for "+name);
                System.err.println("description:\n"+description);
                error.printStackTrace();
            }
            return description;
        }

        /**
         * @param outline the outline to populate
         * @return an optional String to print if there is an error
         */
        protected abstract String populate(Outline outline);

        public String toRowString(OutlineEngine[] engines) {
            StringBuilder sb = new StringBuilder();
            for(OutlineEngine engine : engines) {
                Long l = timeMap.get(engine);
                String str = l == null ? "NA" : l.toString();
                sb.append(str);
                sb.append("\t");
            }
            return sb.toString();
        }

        public String toHeaderString(OutlineEngine[] engines) {
            StringBuilder sb = new StringBuilder();
            for(OutlineEngine engine : engines) {
                sb.append(engine.toString());
                sb.append("\t");
            }
            return sb.toString();
        }
    }

    static OutlineEngine[] engines = null;

    @Override
    public OutlineEngine[] getEngines() {
        if (engines == null) {
            engines = new OutlineEngine[]{new PlainAreaEngine(), new OptimizedAreaEngine(1)};
        }
        return engines;
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
                for(int a = 0; a<20; a++) {
                    String str = "";
                    int x = random.nextInt(3);
                    int y = random.nextInt(3);
                    OutlineOperation.Type type = OutlineOperation.Type.values()[random.nextInt(OutlineOperation.Type.values().length)];
                    Shape operand = null;
                    switch(random.nextInt(3)) {
                        case 0:
                            operand = createPlus(x, y);
                            str = "createPlus("+x+", "+y+")";
                            break;
                        case 1:
                            operand = createTriangle(x, y);
                            str = "createTriangle("+x+", "+y+")";
                            break;
                        case 2:
                            operand = createSquare(x, y);
                            str = "createSquare("+x+", "+y+")";
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

        for(int a = 0; a < 1000000; a++) {
            // skip cases that cause OutOfMemoryErrors ( TODO: https://github.com/mickleness/outline/issues/2 )
            if (a == 64565 || a == 67011 || a == 153537 || a == 184421 || a == 256840 || a == 345497 || a == 507907 )
                continue;

            long time = System.currentTimeMillis();
            AccuracyTest test = new AccuracyTest(a);
            String description = null;
            try {
                description = test.run();
            } catch(RuntimeException | Error e) {
                System.err.println("a = "+a);
                throw e;
            } finally {
                time = System.currentTimeMillis() - time;
                if (time > 500) {
                    System.err.println("## test " + a + " took " + time + " ms");
                    System.err.println(description);
                }
            }
        }
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

        System.out.println(test.toHeaderString(getEngines()));
        System.out.println(test.toRowString(getEngines()));
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

        System.out.println(test.toHeaderString(getEngines()));
        System.out.println(test.toRowString(getEngines()));
    }

    @Test
    public void testRedundantIntersectWithBody_noOverlap() {
        RedundancyTest test = new RedundancyTest("unnecessary add with no overlap and body") {
            @Override
            protected String populate(Outline outline) {
                outline.add(createSquiggle(0, 0,0));
                outline.add(createSquiggle(0, 1,0));
                outline.add(createSquiggle(0, 2,0));
                outline.intersect(createSquare(1, 1));
                outline.add(createSquiggle(0, 2,0));
                outline.flush();
                return null;
            }
        };

        System.out.println(test.toHeaderString(getEngines()));
        System.out.println(test.toRowString(getEngines()));
    }

    @Test
    public void testRedundantIntersectWithBody_overlap() {
        RedundancyTest test = new RedundancyTest("unnecessary add with overlap and body") {
            @Override
            protected String populate(Outline outline) {
                outline.add(createSquiggle(0, 0,0));
                outline.add(createSquiggle(0, 1,0));
                outline.add(createSquiggle(1, 1,0));
                outline.intersect(createSquare(1, 1));
                outline.add(createSquiggle(0, 2,0));
                outline.flush();
                return null;
            }
        };

        System.out.println(test.toHeaderString(getEngines()));
        System.out.println(test.toRowString(getEngines()));
    }

    /**
     * Create a shape whose top-left is at (x,y) and who is .9 x .9 px in size.
     * This contains random cubic data to make it challenging enough for performance gains
     * to become apparent.
     */
    private Path2D createSquiggle(long randomSeed, int x, int y) {
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
    private Rectangle2D createSquare(int x, int y) {
        return new Rectangle2D.Double(x - .01, y - .01, .9 + .02, .9 + .02);
    }

    private Ellipse2D createEllipse(int x, int y) {
        return new Ellipse2D.Double(x, y, .9, .9);
    }

    private Path2D createPlus(int x, int y) {
        double k = .1;
        Path2D p = new Path2D.Double();
        p.moveTo(x + .9/2 - k, y);
        p.lineTo(x + .9/2 + k, y);
        p.lineTo(x + .9/2 + k, y + .9/2 - k);
        p.lineTo(x + .9, y + .9/2 - k);
        p.lineTo(x + .9, y + .9/2 + k);
        p.lineTo(x + .9/2 + k, y + .9/2 + k);
        p.lineTo(x + .9/2 + k, y + .9);
        p.lineTo(x + .9/2 - k, y + .9);
        p.lineTo(x + .9/2 - k, y + .9/2 + k);
        p.lineTo(x, y + .9/2 + k);
        p.lineTo(x, y + .9/2 - k);
        p.lineTo(x + .9/2 - k, y + .9/2 - k);
        p.closePath();
        return p;
    }

    private Path2D createTriangle(int x, int y) {
        Path2D p = new Path2D.Double();
        p.moveTo(x + .9/2, y);
        p.lineTo(x + .9, y + .9);
        p.lineTo(x , y + .9);
        p.closePath();
        return p;
    }
}
