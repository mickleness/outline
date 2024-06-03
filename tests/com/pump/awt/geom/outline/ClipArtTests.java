package com.pump.awt.geom.outline;

import com.pump.TestUtils;
import com.pump.awt.geom.ShapeUtilsTest;
import com.pump.awt.geom.outline.clipart.*;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

/**
 * When run as a unit test this makes sure all our OutlineEngines return results consistent with the
 * default Area-based implementation. (This may take 5 minutes.)
 * <p>
 * When run as an executable this takes several minutes (1 hour) to profile
 * the relative performance of each engine. The profile should be run in an environment with minimal
 * CPU turbulence.
 * <p>
 */
public class ClipArtTests extends OutlineTests {

    static class ScaledIcon implements Icon {
        Icon icon;
        int iconWidth, iconHeight;

        public ScaledIcon(Icon icon, int width, int height) {
            iconWidth = width;
            iconHeight = height;
            this.icon = icon;
        }

        @Override
        public void paintIcon(Component c, Graphics g, int x, int y) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.translate(x,y);
            double scaleX = ((double)iconWidth) / ((double)icon.getIconWidth());
            double scaleY = ((double)iconHeight) / ((double)icon.getIconHeight());
            g2.scale(scaleX, scaleY);
            icon.paintIcon(c, g2, 0, 0);
        }

        @Override
        public int getIconWidth() {
            return iconWidth;
        }

        @Override
        public int getIconHeight() {
            return iconHeight;
        }
    }

    static class ClipArtImage {
        Icon icon;
        String name;

        /**
         * The number of times we should process a test in a sample.
         * By default this is 1. But some pieces of clip art are so simple
         * that we want to process them 5, 20, or 100 times in a sample.
         * This is a subjective number. My broad goal is for no test to
         * complete in under 10ms, or ideally event 50ms. Measure the time
         * it takes for sample to complete in inherently an imprecise
         * science, but I at least want a few significant digits in my
         * baseline sample lengths.
         */
        int loops;

        /**
         * This indicates this object should only be considered when
         * {@link OutlineTests#RUN_OVERNIGHT} is true (because either it
         * is very expensive or there are similar tests).
         */
        boolean runOvernightOnly;

        ClipArtImage(Icon icon, int loops, boolean runOvernightOnly) {
            this.icon = new ScaledIcon(icon, 600, 600);
            this.loops = loops;
            name = icon.getClass().getSimpleName();
            if (loops > 1)
                name += " x "+loops;
            this.runOvernightOnly = runOvernightOnly;
        }

        private List<Shape> shapes = null;
        public List<Shape> getShapes() {
            if (shapes == null) {
                shapes = new LinkedList<>();
                BufferedImage bi = new BufferedImage(icon.getIconWidth(), icon.getIconHeight(), BufferedImage.TYPE_INT_ARGB);
                Graphics2D g = bi.createGraphics();
                g = new ShapeHarvesterGraphics2D(g, shapes);
                icon.paintIcon(null, g, 0, 0);
                g.dispose();

                g = bi.createGraphics();
                g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Random random = new Random(0);
                for (Shape shape : shapes) {
                    float hue = random.nextFloat();
                    Color c = new Color(0xbb000000 + (Color.HSBtoRGB(hue, .8f, .8f) & 0xffffff));
                    g.setColor(c);
                    g.fill(shape);
                }
                g.dispose();

                //to visually inspect the clip art:
//                try {
//                    String name = (icon instanceof ScaledIcon) ? ((ScaledIcon)icon).icon.getClass().getSimpleName() : icon.getClass().getSimpleName();
//                    ImageIO.write(bi, "png", new File("clipart-" + name + ".png"));
//                } catch(IOException e) {
//                    e.printStackTrace();
//                }
            }

            return shapes;
        }
    }

    public static final ClipArtImage[] IMAGES = new ClipArtImage[] {
            new ClipArtImage(new Broccoli(), 1, false),
            new ClipArtImage(new Cat5(), 1, false),
            new ClipArtImage(new CelticKnot5(), 10, false),
            new ClipArtImage(new EasterEgg(), 4, true),
            new ClipArtImage(new ExitSign(), 1, true),
            new ClipArtImage(new GardenSign(), 1, true),
            new ClipArtImage(new GiftBox(), 1, true),
            new ClipArtImage(new Globe3(), 5, false),
            new ClipArtImage(new IceCream12(), 1, true),
            new ClipArtImage(new JackOLantern(), 50, false),
            new ClipArtImage(new JohnLemon(), 50, false),
            new ClipArtImage(new MotherAndBaby(), 1, true),
            new ClipArtImage(new MRIMachine(), 100, false),
            new ClipArtImage(new MysteriousCube(), 1, true),
            new ClipArtImage(new OrangeJuice(), 100, false),
            new ClipArtImage(new PersonAtComputer(), 5, false),
            new ClipArtImage(new RockingChair(), 5, true),
            new ClipArtImage(new RunningDogRetro(), 5, true),
            new ClipArtImage(new RussianBulldozer(), 10, true),
            new ClipArtImage(new Salad(), 4, true),
            new ClipArtImage(new ShareRoadSign(), 100, false),
            new ClipArtImage(new SpaceTravel(), 50, false),
            new ClipArtImage(new StackOfBooks4(), 10, true),
            new ClipArtImage(new Stew(), 1, true),
            new ClipArtImage(new Students(), 1, true),
            new ClipArtImage(new TeleworkGuy(), 100, true),
            new ClipArtImage(new WellDressedOwl(), 1, true)
    };



    interface TestScript {
        Result run(OutlineFactory[] factories, ClipArtImage clipArt);
    }

    @Test
    public void testAdd() throws Exception {
        TestScript script = new TestScript() {
            @Override
            public Result run(OutlineFactory[] factories, ClipArtImage clipArt) {
                Result result = new Result(clipArt.name);
                List<Shape> shapes = clipArt.getShapes();

                for(OutlineFactory factory : factories) {
                    int sampleCount = OutlineTests.RUN_OVERNIGHT ? 20 : 1;

                    long[] times = new long[sampleCount];
                    Outline lastOutline = null;

                    for (int a = 0; a < times.length; a++) {
                        long totalTime = 0;
                        int loopCount = OutlineTests.RUN_OVERNIGHT ? clipArt.loops : 1;
                        for(int loopIndex = 0; loopIndex < loopCount; loopIndex++) {

                            // try and get GC churn out of the way before our timer:
                            System.gc();
                            System.runFinalization();
                            System.gc();
                            System.runFinalization();

                            long startTime = System.currentTimeMillis();
                            Outline outline = factory.create();
                            for (Shape shape : shapes) {
                                outline.add(shape);
                            }

                            // the LazyOperationOutline doesn't fully process everything until a call like getPathIterator
                            outline.getPathIterator(null);

                            long elapsedTime = System.currentTimeMillis() - startTime;

                            lastOutline = outline;
                            totalTime += elapsedTime;
                        }
                        times[a] = totalTime;
                    }
                    Arrays.sort(times);
                    long medianTime = times[times.length/2];

                    if (!result.isBaselineDefined()) {
                        result.setBaseline(factory, lastOutline, medianTime);
                    } else {
                        result.addFactoryTime(factory, medianTime);
                        String expectedName = clipArt.name;
                        String actualName = clipArt.name+"-"+factory.toString();
                        boolean highPrecision = true;
                        if (factory instanceof RectangleMaskOutlineFactory)
                            highPrecision = false;

                        ShapeUtilsTest.testEquals(expectedName, actualName, result.baselineShape, lastOutline, highPrecision);
                    }
                }
                return result;
            }
        };
        testScript("Adding Shapes For Outline", "This table shows how long it takes to create an outline of clip art using different models.",
                script);
    }

    private Collection<ClipArtImage> getImages() {
        if (OutlineTests.RUN_OVERNIGHT) {
            return Arrays.asList(IMAGES);
        }
        List<ClipArtImage> returnValue = new LinkedList<>();
        for(ClipArtImage img : IMAGES) {
            if (!img.runOvernightOnly)
                returnValue.add(img);
        }
        return returnValue;
    }

    private void testScript(String logName, String description, TestScript script) throws Exception {
        List<Result> results = new LinkedList<>();
        try(Writer logWriter = TestUtils.createLog(logName, OutlineTests.RUN_OVERNIGHT, true)) {

            logWriter.write(description + "\n\n");

            if (OutlineTests.RUN_OVERNIGHT) {
                logWriter.write("The full profiler is running, which may take over an hour.\n\n");
            } else {
                logWriter.write("Running as a unit test. The times shown in this table are approximate, but each engine is also being tested for accuracy.\n\n");
            }

            StringBuilder sb = new StringBuilder();
            OutlineFactory[] factories = getOutlineFactories();
            for(OutlineFactory factory : factories) {
                sb.append(factory.toString());
                sb.append("\t");
            }
            sb.append("Clip Art Name");
            logWriter.write(sb+"\n");

            for(ClipArtImage clipArt : getImages()) {
                Result result = script.run(factories, clipArt);
                logWriter.write(result.toString(false)+"\n");
                results.add(result);
            }

            logWriter.write("\nSummary execution times:\n");
            logWriter.write(getTotalSummary(factories, results, false)+"\n\n");

            logWriter.write("... and here is the same info expressed as percents:\n");
            for(Result result : results) {
                logWriter.write(result.toString(true) + "\n");
            }

            logWriter.write("\nSummary execution times:\n");
            logWriter.write(getTotalSummary(factories, results, true)+"\n");
            logWriter.write("\nAverage execution percent:\n");
            logWriter.write(getAverageSummary(factories, results)+"\n\n");
        }
    }

    /**
     * Describe the total time it took to execute all tests.
     *
     * @param factories
     * @param results
     * @param asPercent
     * @return
     */
    private String getTotalSummary(OutlineFactory[] factories, List<Result> results, boolean asPercent) {
        Map<OutlineFactory, Double> totalEngineTimes = new HashMap<>();
        long baselineTotalTime = -1;
        StringBuilder sb = new StringBuilder();
        for(OutlineFactory factory : factories) {
            long totalTime = 0;
            for(Result addResult : results) {
                totalTime += addResult.factoryTimes.get(factory);
            }

            if (baselineTotalTime == -1) {
                baselineTotalTime = totalTime;
            }
            if (asPercent) {
                double p = ((double)totalTime) / ((double)baselineTotalTime) * 100.0;
                String percent = DecimalFormat.getInstance().format(p);
                sb.append(percent+"%\t");
            } else {
                sb.append(totalTime+"\t");
            }
        }
        return sb.toString();
    }

    /**
     * Describe the average time it took to execute all tests.
     *
     * @param factories
     * @param results
     * @return
     */
    private String getAverageSummary(OutlineFactory[] factories, List<Result> results) {
        long baselineTotalTime = -1;
        StringBuilder sb = new StringBuilder();
        for(OutlineFactory factory : factories) {
            double avg = 0;
            for(Result addResult : results) {
                avg += addResult.factoryTimes.get(factory) * 100.0 / addResult.baselineTime;
            }
            avg = avg / results.size();

            String percent = DecimalFormat.getInstance().format(avg);
            sb.append(percent+"%\t");
        }
        return sb.toString();
    }

    class Result {
        Outline baselineShape;
        long baselineTime;
        LinkedHashMap<OutlineFactory, Long> factoryTimes = new LinkedHashMap<>();
        String testName;

        public Result(String testName) {
            this.testName = testName;
        }

        @Override
        public String toString() {
            return toString(false);
        }

        public String toString(boolean asPercent) {
            StringBuilder sb = new StringBuilder();

            Iterator<Long> timeIter = factoryTimes.values().iterator();
            while (timeIter.hasNext()) {
                Long engineTime = timeIter.next();
                if(asPercent) {
                    double percent = engineTime.doubleValue() / ((double) baselineTime) * 100.0;
                    sb.append(DecimalFormat.getInstance().format(percent) + "%\t");
                } else {
                    sb.append(engineTime.longValue() + "\t");
                }
            }
            sb.append(testName);
            return sb.toString();
        }

        public void setBaseline(OutlineFactory baselineFactory, Outline baselineShape, long baselineTime) {
            this.baselineShape = baselineShape;
            this.baselineTime = baselineTime;
            factoryTimes.put(baselineFactory, baselineTime);
        }

        public boolean isBaselineDefined() {
            return baselineShape != null;
        }

        public void addFactoryTime(OutlineFactory factory, long medianTime) {
            factoryTimes.put(factory, medianTime);
        }
    }

    @Test
    public void testClip() throws Exception {
        TestScript script = new TestScript() {
            @Override
            public Result run(OutlineFactory[] engines, ClipArtImage clipArt) {
                Result result = new Result(clipArt.name);
                List<Shape> shapes = clipArt.getShapes();

                Outline outline = new AreaOutlineFactory().create();
                for (Shape shape : shapes) {
                    outline.add(shape);
                }
                Path2D baseShape = new Path2D.Double(outline);

                Rectangle2D outlineBounds = outline.getBounds2D();
                Random random = new Random(clipArt.name.hashCode());

                Rectangle2D clipRect = new Rectangle2D.Double(outlineBounds.getMinX() + outlineBounds.getWidth() / 2.0,
                        outlineBounds.getMinY() + outlineBounds.getHeight() / 2.0,
                        outlineBounds.getWidth() / 2.0,
                        outlineBounds.getHeight() / 2.0 );

                for(OutlineFactory factory : getOutlineFactories()) {
                    int sampleCount = OutlineTests.RUN_OVERNIGHT ? 20 : 1;

                    long[] times = new long[sampleCount];
                    Outline lastOutline = null;

                    for (int a = 0; a < times.length; a++) {
                        long totalTime = 0;
                        int loopCount = OutlineTests.RUN_OVERNIGHT ? clipArt.loops : 1;
                        for(int loopIndex = 0; loopIndex < loopCount; loopIndex++) {

                            // try and get GC churn out of the way before our timer:
                            System.gc();
                            System.runFinalization();
                            System.gc();
                            System.runFinalization();

                            long startTime = System.currentTimeMillis();

                            for(int b = 0; b < (OutlineTests.RUN_OVERNIGHT ? 10 : 1); b++) {
                                outline = factory.create();
                                outline.add(baseShape);
                                outline.clip(clipRect);
                                // make sure the LazyOperationOutline processes its ops
                                outline.getPathIterator(null);
                            }

                            long elapsedTime = System.currentTimeMillis() - startTime;

                            lastOutline = outline;
                            totalTime += elapsedTime;
                        }
                        times[a] = totalTime;
                    }
                    Arrays.sort(times);
                    long medianTime = times[times.length/2];

                    if (!result.isBaselineDefined()) {
                        result.setBaseline(factory, lastOutline, medianTime);
                    } else {
                        result.addFactoryTime(factory, medianTime);
                        String expectedName = clipArt.name;
                        String actualName = clipArt.name+"-"+factory.toString();
                        boolean highPrecision = true;
                        if (factory instanceof RectangleMaskOutlineFactory)
                            highPrecision = false;

                        ShapeUtilsTest.testEquals(expectedName, actualName, result.baselineShape, lastOutline, highPrecision);
                    }
                }
                return result;
            }
        };
        testScript("Clipping Shapes", "This table shows how long it takes to clip outlines of clip art using different models.",
                script);
    }
}
