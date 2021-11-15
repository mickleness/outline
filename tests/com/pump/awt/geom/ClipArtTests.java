package com.pump.awt.geom;

import com.pump.awt.geom.clipart.*;
import com.pump.awt.geom.outline.OutlineEngine;
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

    public static final Icon[] ICONS = new Icon[] {
            new Broccoli(),
            new Cat5(),
            new CelticKnot5(),
            new EasterEgg(),
            new ExitSign(),
            new GardenSign(),
            new GiftBox(),
            new Globe3(),
            new IceCream12(),
            new JackOLantern(),
            new JohnLemon(),
            new MotherAndBaby(),
            new MRIMachine(),
            new MysteriousCube(),
            new OrangeJuice(),
            new PersonAtComputer(),
            new RockingChair(),
            new RunningDogRetro(),
            new RussianBulldozer(),
            new Salad(),
            new ShareRoadSign(),
            new SpaceTravel(),
            new StackOfBooks4(),
            new Stew(),
            new Students(),
            new TeleworkGuy(),
            new WellDressedOwl()
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

            for(Icon icon : ICONS) {
                List<Shape> shapes = new LinkedList<>();
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

                AddResult result = testAdd(engines, icon.getClass().getSimpleName(), shapes);
                logWriter.write(result.toString(false)+"\n");
                results.add(result);

                // to visually inspect the clip art:
                // ImageIO.write(bi, "png", new File("clipart-"+icon.getClass().getSimpleName()+".png"));
            }

            logWriter.write("\nSummary execution times:\n");
            logWriter.write(getSummary(engines, results, false)+"\n\n");

            logWriter.write("... and here is the same info expressed as percents:\n");
            for(AddResult result : results) {
                logWriter.write(result.toString(true) + "\n");
            }

            logWriter.write("\nSummary execution times:\n");
            logWriter.write(getSummary(engines, results, true)+"\n\n");
        }
    }

    private String getSummary(OutlineEngine[] engines, List<AddResult> results, boolean asPercent) {
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

    private AddResult testAdd(OutlineEngine[] engines, String name, List<Shape> shapes) throws IOException {
        AddResult result = new AddResult(name);

        for(OutlineEngine engine : engines) {
            // collect more samples for the baseline just to be extra cautious
            int sampleCount = result.isBaselineDefined() ? 5 : 10;

            long[] times = new long[sampleCount];
            Outline lastSum = null;
            for (int a = 0; a < times.length; a++) {

                // try and get GC churn out of the way before our test:
                System.gc();
                System.runFinalization();
                System.gc();
                System.runFinalization();

                times[a] = System.currentTimeMillis();
                Outline sum = new Outline(engine);
                for(Shape shape : shapes) {
                    sum.add(shape);
                }
                sum.flush();
                lastSum = sum;
                times[a] = System.currentTimeMillis() - times[a];
            }
            Arrays.sort(times);
            long medianTime = times[times.length/2];

            if (!result.isBaselineDefined()) {
                result.setBaseline(engine, lastSum, medianTime);
            } else {
                result.addEngineTime(engine, medianTime);
                testEquals(name, result.baselineShape, lastSum);
            }
        }
        return result;
    }
}
