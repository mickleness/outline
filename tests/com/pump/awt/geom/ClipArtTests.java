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
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ClipArtTests {

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
        try(Writer logWriter = TestUtils.createLog("Clip Art Outlines")) {

            logWriter.write("This table shows how long it takes to create an outline of clip art using different models.\n\n");

            StringBuilder sb = new StringBuilder();
            OutlineEngine[] engines = TestUtils.getEngines();
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

                testAdd(engines, logWriter, icon.getClass().getSimpleName(), shapes);

                // to visually inspect the clip art:
                // ImageIO.write(bi, "png", new File("clipart-"+icon.getClass().getSimpleName()+".png"));
            }
        }
    }

    private void testAdd(OutlineEngine[] engines, Writer logWriter, String name, List<Shape> shapes) throws IOException {
        long baselineTime = -1;

        StringBuilder sb = new StringBuilder();
        for(OutlineEngine engine : engines) {
            long[] times = new long[5];
            for (int a = 0; a < times.length; a++) {
                times[a] = System.currentTimeMillis();
                Outline sum = new Outline(engine);
                for(Shape shape : shapes) {
                    sum.add(shape);
                }
                sum.flush();
                times[a] = System.currentTimeMillis() - times[a];
            }
            Arrays.sort(times);
            long t = times[times.length/2];
            sb.append(t);
            sb.append("\t");
            if (baselineTime == -1) {
                baselineTime = t;
            } else {
                double percent = ((double)t) / ((double) baselineTime) * 100.0;
                sb.append(DecimalFormat.getInstance().format(percent)+"%\t");
            }
        }
        sb.append(name);
        logWriter.write(sb+"\n");
    }
}
