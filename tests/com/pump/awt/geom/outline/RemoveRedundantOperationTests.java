package com.pump.awt.geom.outline;

import org.junit.Test;

import java.awt.*;
import java.awt.geom.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
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
                        outline.flush();
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
                            System.err.println("engine: " + engine.toString());
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

        public String toRowString(OutlineEngine[] engines, long[] times) {
            StringBuilder sb = new StringBuilder();
            for (int a = 0; a<engines.length; a++) {
                sb.append(Long.toString(times[a]));
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

        public void incrementTimes(long[] totalTimes) {
            for(int a = 0; a<engines.length; a++) {
                Long l = timeMap.get(engines[a]);
                if (l != null)
                    totalTimes[a] += l.longValue();
            }
        }
    }

    static OutlineEngine[] engines = null;

    @Override
    public OutlineEngine[] getEngines() {
        if (engines == null) {
            engines = new OutlineEngine[]{new PlainAreaEngine(),
                    // this engine ONLY evaluates null-ops, just for comparison
                    new OptimizedAreaEngine(1) {
                        @Override
                        public Area flush(Shape body, List<OutlineOperation> operationQueue) {
                            flushFutures( (List) prepareFutures);

                            Area result = body == null ? new Area() : new Area(body);
                            result = removeRedundanciesBasedOnBoundingBoxes(result, operationQueue);

                            return new PlainAreaEngine().flush(result, operationQueue);
                        }

                        @Override
                        public String toString() {
                            return "RemoveRedundanciesOnly";
                        }
                    },
                    new OptimizedAreaEngine(1)};
        }
        return engines;
    }

    /**
     * This tests a specific failure we observed with random combinations of operations.
     */
    public void testClip_1() {
        RedundancyTest r = new RedundancyTest("clip test") {

            @Override
            protected String populate(Outline outline) {
                outline.add(createPlus(0.8, 0.8));
                outline.add(createPlus(2.3, 1.1));
                outline.intersect(createTriangle(2.1, 0.9));
                outline.intersect(createTriangle(1.9, 0.8));
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
                outline.add(createPlus(0.8, 0.8));
                outline.add(createPlus(2.3, 1.1));
                outline.intersect(createTriangle(2.1, 0.9));
                outline.intersect(createTriangle(1.9, 0.8));
                return null;
            }
        };
        r.run();
    }

    /**
     * This tests a specific failure we observed with random combinations of operations.
     */
    public void testClip_3() {
        RedundancyTest r = new RedundancyTest("clip test 3") {

            @Override
            protected String populate(Outline outline) {
                outline.add(createTriangle(1.3, 2.3));
                outline.intersect(createSquare(0.8, 2.1));
                outline.exclusiveOr(createSquare(1.4, 1.4));
                outline.intersect(createSquare(1.8, 1.6));
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
        // TODO: revise this test; it's too long
        if (true)
            return;
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

        long[] totalTimes = new long[getEngines().length];
        AccuracyTest lastTest = null;
        long lastOutput = System.currentTimeMillis() + 10000;
        for(int a = 0; a < 100_000_000; a++) {
            long time = System.currentTimeMillis();
            if ( time - lastOutput > 10000) {
                lastOutput = time;
                System.out.println(lastTest.toRowString(getEngines(), totalTimes)+"\t"+NumberFormat.getInstance().format(a));
                time = System.currentTimeMillis();
            }
            AccuracyTest test = new AccuracyTest(a);
            if (lastTest == null) {
                System.out.println(test.toHeaderString(getEngines())+"\tSample");
            }
            lastTest = test;
            String description = null;
            try {
                description = test.run();
            } catch(RuntimeException | Error e) {
                System.err.println("a = "+a);
                throw e;
            } finally {
                time = System.currentTimeMillis() - time;
                test.incrementTimes(totalTimes);
                if (time > 500) {
                    System.out.println("## test " + a + " took " + time + " ms");
                    System.out.println(description);
                    System.out.println(test.toHeaderString(getEngines()));
                    System.out.println(test.toRowString(getEngines()));
                }
            }
        }

        System.out.println(lastTest.toHeaderString(getEngines()));
        System.out.println(lastTest.toRowString(getEngines(), totalTimes));
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
    private Path2D createSquiggle(long randomSeed, double x, double y) {
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
    private Rectangle2D createSquare(double x, double y) {
        return new Rectangle2D.Double(x - .01, y - .01, .9 + .02, .9 + .02);
    }

    private Ellipse2D createEllipse(double x, double y) {
        return new Ellipse2D.Double(x, y, .9, .9);
    }

    private Path2D createPlus(double x, double y) {
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

    private Path2D createTriangle(double x, double y) {
        Path2D p = new Path2D.Double();
        p.moveTo(x + .9/2, y);
        p.lineTo(x + .9, y + .9);
        p.lineTo(x , y + .9);
        p.closePath();
        return p;
    }
}
