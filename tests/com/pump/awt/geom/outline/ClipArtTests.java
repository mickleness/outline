package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtilsTest;
import com.pump.awt.geom.outline.clipart.*;
import org.junit.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Writer;
import java.text.DecimalFormat;
import java.util.*;
import java.util.List;

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

    static class ClipArtTest {
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

        ClipArtTest(Icon icon, int loops) {
            this.icon = new ScaledIcon(icon, 600, 600);
            this.loops = loops;
            name = icon.getClass().getSimpleName();
            if (loops > 1)
                name += " x "+loops;
        }
    }

    public static final ClipArtTest[] IMAGES = new ClipArtTest[] {
            new ClipArtTest(new Broccoli(), 1),
            new ClipArtTest(new Cat5(), 1),
            new ClipArtTest(new CelticKnot5(), 10),
            new ClipArtTest(new EasterEgg(), 4),
            new ClipArtTest(new ExitSign(), 1),
            new ClipArtTest(new GardenSign(), 1),
            new ClipArtTest(new GiftBox(), 1),
            new ClipArtTest(new Globe3(), 5),
            new ClipArtTest(new IceCream12(), 1),
            new ClipArtTest(new JackOLantern(), 50),
            new ClipArtTest(new JohnLemon(), 50),
            new ClipArtTest(new MotherAndBaby(), 1),
            new ClipArtTest(new MRIMachine(), 100),
            new ClipArtTest(new MysteriousCube(), 1),
            new ClipArtTest(new OrangeJuice(), 100),
            new ClipArtTest(new PersonAtComputer(), 5),
            new ClipArtTest(new RockingChair(), 5),
            new ClipArtTest(new RunningDogRetro(), 5),
            new ClipArtTest(new RussianBulldozer(), 10),
            new ClipArtTest(new Salad(), 4),
            new ClipArtTest(new ShareRoadSign(), 100),
            new ClipArtTest(new SpaceTravel(), 50),
            new ClipArtTest(new StackOfBooks4(), 10),
            new ClipArtTest(new Stew(), 1),
            new ClipArtTest(new Students(), 1),
            new ClipArtTest(new TeleworkGuy(), 100),
            new ClipArtTest(new WellDressedOwl(), 1)
    };

    @Test
    public void testAdd() throws Exception {
        List<AddResult> results = new LinkedList<>();
        try(Writer logWriter = createLog("Clip Art Outlines")) {

            logWriter.write("This table shows how long it takes to create an outline of clip art using different models.\n\n");

            StringBuilder sb = new StringBuilder();
            OutlineEngine[] engines = getEngines();
            for(OutlineEngine engine : engines) {
                sb.append(engine.toString());
                sb.append("\t");
            }
            sb.append("Clip Art Name");
            logWriter.write(sb+"\n");

            for(ClipArtTest clipArt : IMAGES) {
                List<Shape> shapes = new LinkedList<>();
                Icon icon = clipArt.icon;
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

                AddResult result = testAdd(engines, clipArt, shapes);
                logWriter.write(result.toString(false)+"\n");
                results.add(result);

                // to visually inspect the clip art:
                // ImageIO.write(bi, "png", new File("clipart-"+icon.getClass().getSimpleName()+".png"));
            }

            logWriter.write("\nSummary execution times:\n");
            logWriter.write(getTotalSummary(engines, results, false)+"\n\n");

            logWriter.write("... and here is the same info expressed as percents:\n");
            for(AddResult result : results) {
                logWriter.write(result.toString(true) + "\n");
            }

            logWriter.write("\nSummary execution times:\n");
            logWriter.write(getTotalSummary(engines, results, true)+"\n");
            logWriter.write("\nAverage execution percent:\n");
            logWriter.write(getAverageSummary(engines, results)+"\n\n");
        }
    }

    /**
     * Describe the total time it took to execute all tests.
     *
     * @param engines
     * @param results
     * @param asPercent
     * @return
     */
    private String getTotalSummary(OutlineEngine[] engines, List<AddResult> results, boolean asPercent) {
        Map<OutlineEngine, Double> totalEngineTimes = new HashMap<>();
        long baselineTotalTime = -1;
        StringBuilder sb = new StringBuilder();
        for(OutlineEngine engine : engines) {
            long totalTime = 0;
            for(AddResult addResult : results) {
                totalTime += addResult.engineTimes.get(engine);
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
     * @param engines
     * @param results
     * @return
     */
    private String getAverageSummary(OutlineEngine[] engines, List<AddResult> results) {
        long baselineTotalTime = -1;
        StringBuilder sb = new StringBuilder();
        for(OutlineEngine engine : engines) {
            double avg = 0;
            for(AddResult addResult : results) {
                avg += addResult.engineTimes.get(engine) * 100.0 / addResult.baselineTime;
            }
            avg = avg / results.size();

            String percent = DecimalFormat.getInstance().format(avg);
            sb.append(percent+"%\t");
        }
        return sb.toString();
    }

    class AddResult {
        Outline baselineShape;
        long baselineTime;
        LinkedHashMap<OutlineEngine, Long> engineTimes = new LinkedHashMap<>();
        String testName;

        public AddResult(String testName) {
            this.testName = testName;
        }

        @Override
        public String toString() {
            return toString(false);
        }

        public String toString(boolean asPercent) {
            StringBuilder sb = new StringBuilder();

            Iterator<Long> timeIter = engineTimes.values().iterator();
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

        public void setBaseline(OutlineEngine baselineEngine, Outline baselineShape, long baselineTime) {
            this.baselineShape = baselineShape;
            this.baselineTime = baselineTime;
            engineTimes.put(baselineEngine, baselineTime);
        }

        public boolean isBaselineDefined() {
            return baselineShape != null;
        }

        public void addEngineTime(OutlineEngine engine, long medianTime) {
            engineTimes.put(engine, medianTime);
        }
    }

    private AddResult testAdd(OutlineEngine[] engines, ClipArtTest clipArt, List<Shape> shapes) throws IOException {
        AddResult result = new AddResult(clipArt.name);

        for(OutlineEngine engine : engines) {
            // collect more samples for the baseline just to be extra cautious
            int sampleCount = result.isBaselineDefined() ? 5 : 10;

            long[] times = new long[sampleCount];
            Outline lastSum = null;
            for (int a = 0; a < times.length; a++) {
                long totalTime = 0;
                for(int loopIndex = 0; loopIndex < clipArt.loops; loopIndex++) {
                    // try and get GC churn out of the way before our timer:
                    System.gc();
                    System.runFinalization();
                    System.gc();
                    System.runFinalization();

                    long startTime = System.currentTimeMillis();
                    Outline sum = new Outline(engine);
                    for (Shape shape : shapes) {
                        sum.add(shape);
                    }
                    sum.flush();
                    long elapsedTime = System.currentTimeMillis() - startTime;

                    lastSum = sum;
                    totalTime += elapsedTime;
                }
                times[a] = totalTime;
            }
            Arrays.sort(times);
            long medianTime = times[times.length/2];

            if (!result.isBaselineDefined()) {
                result.setBaseline(engine, lastSum, medianTime);
            } else {
                result.addEngineTime(engine, medianTime);
                String expectedName = clipArt.name;
                String actualName = clipArt.name+"-"+engine.toString();
                boolean highPrecision = true;
                if (engine instanceof ScaledMaskOutlineEngine)
                    highPrecision = false;

                ShapeUtilsTest.testEquals(expectedName, actualName, result.baselineShape, lastSum, highPrecision);
            }
        }
        return result;
    }
}
