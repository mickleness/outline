package com.pump.awt.geom.outline.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import static java.awt.Color.WHITE;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/209151/drink-orange-juice
 * </p>
 */
public class OrangeJuice implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public OrangeJuice() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public OrangeJuice(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getIconHeight() {
        return height;
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        double coef = Math.min((double) width / (double) 1, (double) height / (double) 1);

        Graphics2D g2d = (Graphics2D) g.create();
        g2d.translate(x, y);
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.scale(coef, coef);
        paint(g2d);
        g2d.dispose();
    }

    /**
     * Paints the transcoded SVG image on the specified graphics context.
     * 
     * @param g Graphics context.
     */
    private static void paint(Graphics2D g) {
        Shape shape = null;
        
        float origAlpha = 1.0f;
        
        java.util.LinkedList<AffineTransform> transformations = new java.util.LinkedList<AffineTransform>();
        

        // 
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.025050102f, 0, 0, 0.025050102f, 0.009769524f, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, 0, 39.92f));

        // _0_0

        // _0_0_0

        // _0_0_0_0

        // _0_0_0_0_0

        // _0_0_0_0_0_0

        // _0_0_0_0_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_0_0_0_0_0

        // _0_0_0_0_0_0_0_0_0

        // _0_0_0_0_0_0_0_0_0_0

        // _0_0_0_0_0_0_0_0_0_0_0

        // _0_0_0_0_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.52, 30.113);
        ((GeneralPath) shape).lineTo(4.52, 30.238);
        ((GeneralPath) shape).curveTo(4.562, 30.730001, 5.18, 31.148, 6.375, 31.488);
        ((GeneralPath) shape).curveTo(7.594, 31.828001, 9.055, 32.0, 10.762, 32.0);
        ((GeneralPath) shape).curveTo(12.445, 32.0, 13.895, 31.828, 15.113, 31.488);
        ((GeneralPath) shape).curveTo(16.328, 31.145, 16.957, 30.730001, 17.0, 30.238);
        ((GeneralPath) shape).lineTo(14.762, 11.809);
        ((GeneralPath) shape).lineTo(14.762, 11.742);
        ((GeneralPath) shape).curveTo(14.762, 11.401999, 14.363, 11.113, 13.574, 10.879);
        ((GeneralPath) shape).curveTo(12.809, 10.6449995, 11.867001, 10.526999, 10.762, 10.526999);
        ((GeneralPath) shape).curveTo(9.652, 10.526999, 8.711, 10.6449995, 7.945, 10.879);
        ((GeneralPath) shape).curveTo(7.156, 11.113, 6.762, 11.401999, 6.762, 11.742);
        ((GeneralPath) shape).lineTo(6.762, 11.809);
        ((GeneralPath) shape).lineTo(4.52, 30.113);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_0_0_0_0_0

        // _0_0_0_1

        // _0_0_0_1_0

        // _0_0_0_1_0_0

        // _0_0_0_1_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.258, 26.494);
        ((GeneralPath) shape).lineTo(14.398, 11.775999);
        ((GeneralPath) shape).lineTo(7.1679997, 11.614999);
        ((GeneralPath) shape).lineTo(5.184, 26.494);
        ((GeneralPath) shape).lineTo(16.258, 26.494);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(18.488000869750977, -5.393099784851074), 18.617f, new Point2D.Double(18.488000869750977, -5.393099784851074), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(0.27848f, -0.57624f, 0.57624f, 0.27848f, 6.216f, 34.939f)));
        g.fill(shape);

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.473, 26.783);
        ((GeneralPath) shape).curveTo(6.988, 26.912, 8.543, 27.018002, 10.145, 27.104);
        ((GeneralPath) shape).curveTo(13.344, 27.276001, 15.199, 27.24, 15.711, 27.006);
        ((GeneralPath) shape).curveTo(16.395, 26.666, 16.277, 26.315, 15.359, 25.951);
        ((GeneralPath) shape).curveTo(14.336, 25.526001, 12.695, 25.311, 10.434, 25.311);
        ((GeneralPath) shape).curveTo(8.363, 25.334002, 6.891, 25.537, 6.016, 25.92);
        ((GeneralPath) shape).lineTo(5.312, 26.529);
        ((GeneralPath) shape).lineTo(5.312, 26.657999);
        ((GeneralPath) shape).curveTo(5.332, 26.720999, 5.3869996, 26.764, 5.4729996, 26.782999);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_3

        // _0_0_0_3_0

        // _0_0_0_3_0_0

        // _0_0_0_3_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.938, 26.69);
        ((GeneralPath) shape).curveTo(15.938, 26.346, 15.422, 26.045, 14.398, 25.791);
        ((GeneralPath) shape).curveTo(13.355, 25.557001, 12.098, 25.44, 10.625, 25.44);
        ((GeneralPath) shape).curveTo(9.152, 25.44, 7.902, 25.557001, 6.8789997, 25.791);
        ((GeneralPath) shape).curveTo(5.8549995, 26.045, 5.344, 26.346, 5.344, 26.69);
        ((GeneralPath) shape).curveTo(5.344, 27.029001, 5.855, 27.326, 6.8789997, 27.584);
        ((GeneralPath) shape).curveTo(7.9019995, 27.817999, 9.151999, 27.935999, 10.625, 27.935999);
        ((GeneralPath) shape).curveTo(12.098001, 27.935999, 13.355, 27.817999, 14.398, 27.584);
        ((GeneralPath) shape).curveTo(15.422, 27.326, 15.938, 27.029, 15.938, 26.69);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-22.257999420166016, -10.918000221252441), new Point2D.Double(-9.673299789428711, -10.918000221252441), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(-0.63056f, -0.10936f, -0.10936f, 0.63056f, 5.6E-4f, 31.936f)));
        g.fill(shape);

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.215, 25.983);
        ((GeneralPath) shape).curveTo(9.406, 25.983, 9.504, 25.876999, 9.504, 25.666);
        ((GeneralPath) shape).curveTo(9.504, 25.471, 9.406, 25.377, 9.215, 25.377);
        ((GeneralPath) shape).curveTo(9.004, 25.377, 8.895, 25.471, 8.895, 25.666);
        ((GeneralPath) shape).curveTo(8.895, 25.877, 9.004001, 25.983, 9.215, 25.983);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(9.184, 25.471);
        ((GeneralPath) shape).curveTo(9.332, 25.471, 9.406, 25.545, 9.406, 25.697);
        ((GeneralPath) shape).curveTo(9.406, 25.846, 9.332, 25.92, 9.184, 25.92);
        ((GeneralPath) shape).curveTo(9.035, 25.92, 8.961, 25.846, 8.961, 25.697);
        ((GeneralPath) shape).curveTo(8.961, 25.545, 9.035001, 25.471, 9.184, 25.471);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.391, 26.463);
        ((GeneralPath) shape).curveTo(15.539, 26.463, 15.613, 26.389, 15.613, 26.24);
        ((GeneralPath) shape).curveTo(15.613, 26.092, 15.539, 26.018, 15.391, 26.018);
        ((GeneralPath) shape).curveTo(15.242, 26.018, 15.168, 26.092, 15.168, 26.24);
        ((GeneralPath) shape).curveTo(15.168, 26.389, 15.242001, 26.463, 15.391, 26.463);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(15.391, 26.111);
        ((GeneralPath) shape).curveTo(15.5, 26.111, 15.551, 26.166, 15.551, 26.272);
        ((GeneralPath) shape).curveTo(15.551, 26.376999, 15.5, 26.432, 15.391, 26.432);
        ((GeneralPath) shape).curveTo(15.285, 26.432, 15.23, 26.376999, 15.23, 26.272);
        ((GeneralPath) shape).curveTo(15.23, 26.165998, 15.285, 26.111, 15.391, 26.111);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.207, 25.983);
        ((GeneralPath) shape).curveTo(10.422, 25.983, 10.526999, 25.876999, 10.526999, 25.666);
        ((GeneralPath) shape).curveTo(10.526999, 25.451, 10.422, 25.346, 10.207, 25.346);
        ((GeneralPath) shape).curveTo(9.995999, 25.346, 9.887, 25.451, 9.887, 25.666);
        ((GeneralPath) shape).curveTo(9.887, 25.877, 9.996, 25.983, 10.207, 25.983);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(10.176, 25.471);
        ((GeneralPath) shape).curveTo(10.323999, 25.471, 10.398, 25.545, 10.398, 25.697);
        ((GeneralPath) shape).curveTo(10.398, 25.846, 10.323999, 25.92, 10.176, 25.92);
        ((GeneralPath) shape).curveTo(10.026999, 25.92, 9.953, 25.846, 9.953, 25.697);
        ((GeneralPath) shape).curveTo(9.953, 25.545, 10.027, 25.471, 10.176, 25.471);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_7

        // _0_0_0_7_0

        // _0_0_0_7_0_0

        // _0_0_0_7_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_7_0_0_0_0

        // _0_0_0_7_0_0_0_0_0

        // _0_0_0_7_0_0_0_0_0_0

        // _0_0_0_7_0_0_0_0_0_0_0

        // _0_0_0_7_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.008, 28.777);
        ((GeneralPath) shape).lineTo(14.863001, 29.16);
        ((GeneralPath) shape).lineTo(13.617001, 11.785);
        ((GeneralPath) shape).lineTo(12.559001, 11.238);
        ((GeneralPath) shape).lineTo(13.008001, 28.777);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_7_0_0_0_0

        // _0_0_0_8

        // _0_0_0_8_0

        // _0_0_0_8_0_0

        // _0_0_0_8_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_8_0_0_0_0

        // _0_0_0_8_0_0_0_0_0

        // _0_0_0_8_0_0_0_0_0_0

        // _0_0_0_8_0_0_0_0_0_0_0

        // _0_0_0_8_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.551, 29.465);
        ((GeneralPath) shape).curveTo(6.215, 28.973, 7.0550003, 28.727, 8.078, 28.727);
        ((GeneralPath) shape).curveTo(10.02, 28.727, 11.375, 28.737999, 12.145, 28.762);
        ((GeneralPath) shape).curveTo(13.68, 28.844, 14.703001, 28.995998, 15.215, 29.206999);
        ((GeneralPath) shape).curveTo(15.984, 29.526999, 16.441, 29.772999, 16.594, 29.945);
        ((GeneralPath) shape).lineTo(14.512, 12.246);
        ((GeneralPath) shape).curveTo(11.719, 11.4140005, 9.691, 11.18, 8.434, 11.543);
        ((GeneralPath) shape).curveTo(7.664, 11.777, 7.164, 12.035, 6.9300003, 12.312);
        ((GeneralPath) shape).lineTo(6.8320003, 12.633);
        ((GeneralPath) shape).lineTo(4.879, 30.199001);
        ((GeneralPath) shape).curveTo(5.0080004, 29.945002, 5.23, 29.699001, 5.551, 29.465002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_8_0_0_0_0

        // _0_0_0_9

        // _0_0_0_9_0

        // _0_0_0_9_0_0

        // _0_0_0_9_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_9_0_0_0_0

        // _0_0_0_9_0_0_0_0_0

        // _0_0_0_9_0_0_0_0_0_0

        // _0_0_0_9_0_0_0_0_0_0_0

        // _0_0_0_9_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.594, 25.008);
        ((GeneralPath) shape).curveTo(6.594, 24.754, 6.4769998, 24.625, 6.238, 24.625);
        ((GeneralPath) shape).curveTo(6.027, 24.625, 5.922, 24.754, 5.922, 25.008);
        ((GeneralPath) shape).curveTo(5.922, 25.241999, 6.027, 25.359, 6.238, 25.359);
        ((GeneralPath) shape).curveTo(6.4769998, 25.359, 6.594, 25.241999, 6.594, 25.008);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_9_0_0_0_0

        // _0_0_0_10

        // _0_0_0_10_0

        // _0_0_0_10_0_0

        // _0_0_0_10_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_10_0_0_0_0

        // _0_0_0_10_0_0_0_0_0

        // _0_0_0_10_0_0_0_0_0_0

        // _0_0_0_10_0_0_0_0_0_0_0

        // _0_0_0_10_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.727, 20.016);
        ((GeneralPath) shape).curveTo(14.727, 19.652, 14.578, 19.473001, 14.281, 19.473001);
        ((GeneralPath) shape).curveTo(13.961, 19.473001, 13.801001, 19.652002, 13.801001, 20.016);
        ((GeneralPath) shape).curveTo(13.801001, 20.379002, 13.961, 20.559, 14.281, 20.559);
        ((GeneralPath) shape).curveTo(14.578, 20.559, 14.727, 20.379, 14.727, 20.016);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_10_0_0_0_0

        // _0_0_0_11

        // _0_0_0_11_0

        // _0_0_0_11_0_0

        // _0_0_0_11_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_11_0_0_0_0

        // _0_0_0_11_0_0_0_0_0

        // _0_0_0_11_0_0_0_0_0_0

        // _0_0_0_11_0_0_0_0_0_0_0

        // _0_0_0_11_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.52, 18.062);
        ((GeneralPath) shape).curveTo(14.52, 17.766, 14.4140005, 17.617, 14.199, 17.617);
        ((GeneralPath) shape).curveTo(13.988, 17.617, 13.879001, 17.766, 13.879001, 18.062);
        ((GeneralPath) shape).curveTo(13.879001, 18.34, 13.988001, 18.48, 14.199, 18.48);
        ((GeneralPath) shape).curveTo(14.4140005, 18.48, 14.52, 18.34, 14.52, 18.062);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_11_0_0_0_0

        // _0_0_0_12

        // _0_0_0_12_0

        // _0_0_0_12_0_0

        // _0_0_0_12_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_12_0_0_0_0

        // _0_0_0_12_0_0_0_0_0

        // _0_0_0_12_0_0_0_0_0_0

        // _0_0_0_12_0_0_0_0_0_0_0

        // _0_0_0_12_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.586, 15.801);
        ((GeneralPath) shape).curveTo(8.586, 15.5859995, 8.5, 15.48, 8.328, 15.48);
        ((GeneralPath) shape).curveTo(8.137, 15.48, 8.0390005, 15.5859995, 8.0390005, 15.801);
        ((GeneralPath) shape).curveTo(8.0390005, 16.012, 8.137, 16.121, 8.328, 16.121);
        ((GeneralPath) shape).curveTo(8.5, 16.121, 8.586, 16.012001, 8.586, 15.801001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_12_0_0_0_0

        // _0_0_0_13

        // _0_0_0_13_0

        // _0_0_0_13_0_0

        // _0_0_0_13_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_13_0_0_0_0

        // _0_0_0_13_0_0_0_0_0

        // _0_0_0_13_0_0_0_0_0_0

        // _0_0_0_13_0_0_0_0_0_0_0

        // _0_0_0_13_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.359, 13.609);
        ((GeneralPath) shape).curveTo(11.359, 13.457, 11.316, 13.332, 11.2300005, 13.223001);
        ((GeneralPath) shape).curveTo(11.148001, 13.117001, 11.051001, 13.062, 10.945001, 13.062);
        ((GeneralPath) shape).curveTo(10.836, 13.062, 10.754001, 13.117001, 10.688001, 13.223001);
        ((GeneralPath) shape).curveTo(10.602, 13.332001, 10.559001, 13.457001, 10.559001, 13.609);
        ((GeneralPath) shape).curveTo(10.559001, 13.949, 10.688001, 14.121, 10.945001, 14.121);
        ((GeneralPath) shape).curveTo(11.223001, 14.121, 11.359, 13.949, 11.359, 13.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_13_0_0_0_0

        // _0_0_0_14

        // _0_0_0_14_0

        // _0_0_0_14_0_0

        // _0_0_0_14_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_14_0_0_0_0

        // _0_0_0_14_0_0_0_0_0

        // _0_0_0_14_0_0_0_0_0_0

        // _0_0_0_14_0_0_0_0_0_0_0

        // _0_0_0_14_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.527, 23.871);
        ((GeneralPath) shape).curveTo(12.527, 23.66, 12.453, 23.551, 12.305, 23.551);
        ((GeneralPath) shape).curveTo(12.156, 23.551, 12.078, 23.66, 12.078, 23.871);
        ((GeneralPath) shape).curveTo(12.078, 24.062, 12.156, 24.16, 12.305, 24.16);
        ((GeneralPath) shape).curveTo(12.453, 24.16, 12.527, 24.062, 12.527, 23.871);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_14_0_0_0_0

        // _0_0_0_15

        // _0_0_0_15_0

        // _0_0_0_15_0_0

        // _0_0_0_15_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_15_0_0_0_0

        // _0_0_0_15_0_0_0_0_0

        // _0_0_0_15_0_0_0_0_0_0

        // _0_0_0_15_0_0_0_0_0_0_0

        // _0_0_0_15_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.281, 23.664);
        ((GeneralPath) shape).curveTo(15.281, 23.491999, 15.227, 23.406, 15.121, 23.406);
        ((GeneralPath) shape).curveTo(15.012, 23.406, 14.961, 23.492, 14.961, 23.664);
        ((GeneralPath) shape).curveTo(14.961, 23.835999, 15.012, 23.921999, 15.121, 23.921999);
        ((GeneralPath) shape).curveTo(15.227, 23.921999, 15.281, 23.835999, 15.281, 23.664);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_15_0_0_0_0

        // _0_0_0_16

        // _0_0_0_16_0

        // _0_0_0_16_0_0

        // _0_0_0_16_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_16_0_0_0_0

        // _0_0_0_16_0_0_0_0_0

        // _0_0_0_16_0_0_0_0_0_0

        // _0_0_0_16_0_0_0_0_0_0_0

        // _0_0_0_16_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.969, 16.785);
        ((GeneralPath) shape).curveTo(9.969, 16.612999, 9.8949995, 16.527, 9.742, 16.527);
        ((GeneralPath) shape).curveTo(9.594, 16.527, 9.5199995, 16.613, 9.5199995, 16.785);
        ((GeneralPath) shape).curveTo(9.5199995, 16.953, 9.594, 17.039, 9.742, 17.039);
        ((GeneralPath) shape).curveTo(9.8949995, 17.039, 9.969, 16.953, 9.969, 16.785);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_16_0_0_0_0

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.016, 29.279);
        ((GeneralPath) shape).lineTo(6.9449997, 29.088);
        ((GeneralPath) shape).curveTo(7.7109995, 20.192999, 8.054999, 15.060999, 7.969, 13.697);
        ((GeneralPath) shape).curveTo(7.883, 12.181999, 7.23, 17.376999, 6.016, 29.279);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.754, 28.318);
        ((GeneralPath) shape).curveTo(8.066, 28.318, 6.1639996, 28.67, 5.055, 29.373001);
        ((GeneralPath) shape).lineTo(7.008, 13.088001);
        ((GeneralPath) shape).lineTo(7.008, 13.057001);
        ((GeneralPath) shape).curveTo(7.008, 12.736001, 7.371, 12.471001, 8.094, 12.256001);
        ((GeneralPath) shape).curveTo(8.801, 12.041001, 9.664, 11.936002, 10.688, 11.936002);
        ((GeneralPath) shape).curveTo(11.7109995, 11.936002, 12.573999, 12.041001, 13.276999, 12.256001);
        ((GeneralPath) shape).curveTo(13.983999, 12.471002, 14.3359995, 12.736001, 14.3359995, 13.057001);
        ((GeneralPath) shape).lineTo(14.3359995, 13.088001);
        ((GeneralPath) shape).lineTo(16.289, 29.311);
        ((GeneralPath) shape).curveTo(15.113, 28.651001, 13.2699995, 28.318, 10.754, 28.318);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(14.496, 29.311);
        ((GeneralPath) shape).curveTo(15.5, 29.568, 16.0, 29.877, 16.0, 30.240002);
        ((GeneralPath) shape).curveTo(16.0, 30.604002, 15.5, 30.901001, 14.496, 31.135002);
        ((GeneralPath) shape).curveTo(13.473001, 31.393002, 12.246, 31.522001, 10.816, 31.522001);
        ((GeneralPath) shape).curveTo(9.387, 31.522001, 8.172, 31.393002, 7.168, 31.135002);
        ((GeneralPath) shape).curveTo(6.1450005, 30.881002, 5.6330004, 30.580002, 5.6330004, 30.240002);
        ((GeneralPath) shape).curveTo(5.6330004, 29.877, 6.1450005, 29.568, 7.168, 29.311);
        ((GeneralPath) shape).curveTo(8.172, 29.057001, 9.387, 28.928001, 10.816, 28.928001);
        ((GeneralPath) shape).curveTo(12.266, 28.928001, 13.492001, 29.057001, 14.496, 29.311);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(14.625, 31.553001);
        ((GeneralPath) shape).lineTo(14.688, 31.522001);
        ((GeneralPath) shape).lineTo(15.07, 31.424002);
        ((GeneralPath) shape).lineTo(15.105, 31.424002);
        ((GeneralPath) shape).lineTo(15.5199995, 31.295002);
        ((GeneralPath) shape).curveTo(16.48, 30.955002, 16.969, 30.580002, 16.991999, 30.178001);
        ((GeneralPath) shape).lineTo(14.753999, 11.744001);
        ((GeneralPath) shape).lineTo(14.753999, 11.682001);
        ((GeneralPath) shape).curveTo(14.753999, 11.338001, 14.358998, 11.053001, 13.569999, 10.818001);
        ((GeneralPath) shape).curveTo(12.800999, 10.580001, 11.862999, 10.467001, 10.753999, 10.467001);
        ((GeneralPath) shape).curveTo(9.644999, 10.467001, 8.702999, 10.580001, 7.937999, 10.818001);
        ((GeneralPath) shape).curveTo(7.1449986, 11.053, 6.7539988, 11.338001, 6.7539988, 11.682001);
        ((GeneralPath) shape).lineTo(6.7539988, 11.744001);
        ((GeneralPath) shape).lineTo(4.5119987, 30.049002);
        ((GeneralPath) shape).lineTo(4.5119987, 30.174002);
        ((GeneralPath) shape).curveTo(4.554999, 30.580002, 5.0469985, 30.955002, 5.983999, 31.295002);
        ((GeneralPath) shape).lineTo(6.3669987, 31.424002);
        ((GeneralPath) shape).lineTo(6.397999, 31.424002);
        ((GeneralPath) shape).lineTo(6.815999, 31.522001);
        ((GeneralPath) shape).lineTo(6.878999, 31.549002);
        ((GeneralPath) shape).lineTo(8.32, 31.807001);
        ((GeneralPath) shape).lineTo(8.573999, 31.807001);
        ((GeneralPath) shape).lineTo(9.855, 31.904001);
        ((GeneralPath) shape).lineTo(10.113, 31.936);
        ((GeneralPath) shape).lineTo(11.391, 31.936);
        ((GeneralPath) shape).lineTo(11.617, 31.904001);
        ((GeneralPath) shape).lineTo(12.0, 31.904001);
        ((GeneralPath) shape).lineTo(12.93, 31.807001);
        ((GeneralPath) shape).lineTo(13.152, 31.807001);
        ((GeneralPath) shape).lineTo(14.078, 31.647001);
        ((GeneralPath) shape).lineTo(14.207, 31.615002);
        ((GeneralPath) shape).lineTo(14.625, 31.553001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.113, 12.67);
        ((GeneralPath) shape).curveTo(14.41, 12.311, 14.359, 11.959, 13.953, 11.615);
        ((GeneralPath) shape).curveTo(13.504, 11.252, 12.727, 11.040999, 11.617001, 10.974999);
        ((GeneralPath) shape).curveTo(9.418001, 10.849999, 8.055, 11.091999, 7.5200005, 11.712999);
        ((GeneralPath) shape).curveTo(7.3910003, 11.860999, 7.3280005, 12.021999, 7.3280005, 12.192999);
        ((GeneralPath) shape).curveTo(7.3480005, 12.321999, 7.4020004, 12.427999, 7.4880004, 12.513999);
        ((GeneralPath) shape).curveTo(8.148001, 12.126999, 9.215, 11.935999, 10.688001, 11.935999);
        ((GeneralPath) shape).curveTo(12.4140005, 11.935999, 13.559001, 12.181999, 14.113001, 12.669999);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.223, 10.881);
        ((GeneralPath) shape).curveTo(9.164, 10.69, 10.132999, 10.610999, 11.136999, 10.658);
        ((GeneralPath) shape).curveTo(12.116999, 10.721, 12.991999, 10.881, 13.761999, 11.135);
        ((GeneralPath) shape).curveTo(14.077999, 11.244, 14.323999, 11.35, 14.495999, 11.455);
        ((GeneralPath) shape).lineTo(14.754, 11.713);
        ((GeneralPath) shape).lineTo(14.754, 11.682);
        ((GeneralPath) shape).curveTo(14.754, 11.338, 14.358999, 11.049, 13.57, 10.815001);
        ((GeneralPath) shape).curveTo(12.801, 10.580001, 11.863, 10.463, 10.754, 10.463);
        ((GeneralPath) shape).curveTo(9.7699995, 10.463, 8.917999, 10.561, 8.191, 10.752);
        ((GeneralPath) shape).curveTo(7.508, 10.924, 7.039, 11.147, 6.785, 11.424);
        ((GeneralPath) shape).curveTo(7.039, 11.209, 7.52, 11.028999, 8.223, 10.881);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8BC3CF));
        g.fill(shape);

        // _0_0_0_21

        // _0_0_0_21_0

        // _0_0_0_21_0_0

        // _0_0_0_21_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_21_0_0_0_0

        // _0_0_0_21_0_0_0_0_0

        // _0_0_0_21_0_0_0_0_0_0

        // _0_0_0_21_0_0_0_0_0_0_0

        // _0_0_0_21_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.281, 28.238);
        ((GeneralPath) shape).lineTo(31.312, 28.238);
        ((GeneralPath) shape).lineTo(29.039, 9.809);
        ((GeneralPath) shape).lineTo(29.07, 9.777);
        ((GeneralPath) shape).curveTo(29.07, 9.434, 28.676, 9.148001, 27.887, 8.910001);
        ((GeneralPath) shape).curveTo(27.120998, 8.676001, 26.179998, 8.559001, 25.07, 8.559001);
        ((GeneralPath) shape).curveTo(23.961, 8.559001, 23.022999, 8.676001, 22.258, 8.910001);
        ((GeneralPath) shape).curveTo(21.469, 9.148001, 21.07, 9.434001, 21.07, 9.777);
        ((GeneralPath) shape).lineTo(21.07, 9.809);
        ((GeneralPath) shape).lineTo(18.832, 28.113);
        ((GeneralPath) shape).lineTo(18.801, 28.207);
        ((GeneralPath) shape).lineTo(18.801, 28.238);
        ((GeneralPath) shape).curveTo(18.844, 28.730001, 19.473001, 29.148, 20.688, 29.488);
        ((GeneralPath) shape).curveTo(21.883, 29.828001, 23.332, 30.0, 25.039, 30.0);
        ((GeneralPath) shape).curveTo(26.745998, 30.0, 28.206999, 29.828, 29.425999, 29.488);
        ((GeneralPath) shape).curveTo(30.640999, 29.148, 31.258, 28.730001, 31.280998, 28.238);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_21_0_0_0_0

        // _0_0_0_22

        // _0_0_0_22_0

        // _0_0_0_22_0_0

        // _0_0_0_22_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.527, 24.51);
        ((GeneralPath) shape).lineTo(28.703001, 9.791);
        ((GeneralPath) shape).lineTo(21.473001, 9.6310005);
        ((GeneralPath) shape).lineTo(19.488, 24.51);
        ((GeneralPath) shape).lineTo(30.527, 24.51);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(31.003999710083008, -24.167999267578125), 18.617f, new Point2D.Double(31.003999710083008, -24.167999267578125), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(0.27848f, -0.57624f, 0.57624f, 0.27848f, 27.854f, 45.395f)));
        g.fill(shape);

        // _0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.016, 25.026);
        ((GeneralPath) shape).curveTo(30.699001, 24.705, 30.582, 24.349998, 29.664001, 23.967);
        ((GeneralPath) shape).curveTo(28.617, 23.540998, 26.977001, 23.338, 24.738, 23.360998);
        ((GeneralPath) shape).curveTo(22.668001, 23.360998, 21.195002, 23.560999, 20.32, 23.967);
        ((GeneralPath) shape).lineTo(19.617, 24.575998);
        ((GeneralPath) shape).lineTo(19.617, 24.669998);
        ((GeneralPath) shape).curveTo(19.637001, 24.755999, 19.68, 24.810999, 19.742, 24.829998);
        ((GeneralPath) shape).lineTo(24.414001, 25.150997);
        ((GeneralPath) shape).curveTo(27.637001, 25.302998, 29.504002, 25.259996, 30.016003, 25.025997);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_24

        // _0_0_0_24_0

        // _0_0_0_24_0_0

        // _0_0_0_24_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.238, 24.705);
        ((GeneralPath) shape).curveTo(30.238, 24.361, 29.727001, 24.065, 28.703001, 23.807);
        ((GeneralPath) shape).curveTo(27.660002, 23.571999, 26.398, 23.455, 24.93, 23.455);
        ((GeneralPath) shape).curveTo(23.457, 23.455, 22.207, 23.572, 21.184, 23.807);
        ((GeneralPath) shape).curveTo(20.137, 24.064999, 19.613, 24.361, 19.613, 24.705);
        ((GeneralPath) shape).curveTo(19.613, 25.045, 20.137001, 25.346, 21.184, 25.6);
        ((GeneralPath) shape).curveTo(22.207, 25.834, 23.457, 25.951, 24.93, 25.951);
        ((GeneralPath) shape).curveTo(26.398, 25.951, 27.66, 25.834, 28.703001, 25.6);
        ((GeneralPath) shape).curveTo(29.727001, 25.346, 30.238, 25.045, 30.238, 24.705);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-43.75899887084961, -17.791000366210938), new Point2D.Double(-31.173999786376953, -17.791000366210938), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(-0.63056f, -0.10936f, -0.10936f, 0.63056f, 5.6E-4f, 31.936f)));
        g.fill(shape);

        // _0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.77, 23.998);
        ((GeneralPath) shape).curveTo(24.98, 23.998, 25.086, 23.893, 25.086, 23.682);
        ((GeneralPath) shape).curveTo(25.086, 23.49, 24.98, 23.393, 24.77, 23.393);
        ((GeneralPath) shape).curveTo(24.574001, 23.393, 24.48, 23.49, 24.48, 23.682);
        ((GeneralPath) shape).curveTo(24.48, 23.893, 24.574, 23.998, 24.77, 23.998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(24.77, 23.522);
        ((GeneralPath) shape).curveTo(24.918001, 23.522, 24.992, 23.595999, 24.992, 23.744);
        ((GeneralPath) shape).curveTo(24.992, 23.893, 24.918001, 23.967, 24.77, 23.967);
        ((GeneralPath) shape).curveTo(24.621, 23.967, 24.543001, 23.893, 24.543001, 23.744);
        ((GeneralPath) shape).curveTo(24.543001, 23.595999, 24.621, 23.522, 24.77, 23.522);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.039, 23.998);
        ((GeneralPath) shape).curveTo(27.254, 23.998, 27.359, 23.893, 27.359, 23.682);
        ((GeneralPath) shape).curveTo(27.359, 23.467, 27.254, 23.361, 27.039, 23.361);
        ((GeneralPath) shape).curveTo(26.828, 23.361, 26.719, 23.467001, 26.719, 23.682);
        ((GeneralPath) shape).curveTo(26.719, 23.893, 26.828, 23.998, 27.039, 23.998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(27.039, 23.486);
        ((GeneralPath) shape).curveTo(27.191, 23.486, 27.262, 23.572, 27.262, 23.744);
        ((GeneralPath) shape).curveTo(27.262, 23.893, 27.188, 23.967, 27.039, 23.967);
        ((GeneralPath) shape).curveTo(26.890999, 23.967, 26.816, 23.893, 26.816, 23.744);
        ((GeneralPath) shape).curveTo(26.816, 23.571999, 26.891, 23.486, 27.039, 23.486);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_27

        // _0_0_0_27_0

        // _0_0_0_27_0_0

        // _0_0_0_27_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_27_0_0_0_0

        // _0_0_0_27_0_0_0_0_0

        // _0_0_0_27_0_0_0_0_0_0

        // _0_0_0_27_0_0_0_0_0_0_0

        // _0_0_0_27_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.328, 26.777);
        ((GeneralPath) shape).lineTo(29.151999, 27.16);
        ((GeneralPath) shape).lineTo(27.937998, 9.785);
        ((GeneralPath) shape).lineTo(26.878998, 9.238);
        ((GeneralPath) shape).lineTo(27.327997, 26.777);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_27_0_0_0_0

        // _0_0_0_28

        // _0_0_0_28_0

        // _0_0_0_28_0_0

        // _0_0_0_28_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_28_0_0_0_0

        // _0_0_0_28_0_0_0_0_0

        // _0_0_0_28_0_0_0_0_0_0

        // _0_0_0_28_0_0_0_0_0_0_0

        // _0_0_0_28_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.871, 27.504);
        ((GeneralPath) shape).curveTo(20.512001, 27.012, 21.355, 26.77, 22.398, 26.77);
        ((GeneralPath) shape).curveTo(24.512001, 26.77, 25.867, 26.777, 26.465, 26.801);
        ((GeneralPath) shape).curveTo(28.0, 26.863, 29.012001, 27.004, 29.504, 27.215);
        ((GeneralPath) shape).curveTo(30.293, 27.559, 30.754, 27.812, 30.879, 27.984);
        ((GeneralPath) shape).lineTo(28.800999, 10.289);
        ((GeneralPath) shape).curveTo(28.116999, 10.073999, 27.348, 9.882999, 26.495998, 9.7109995);
        ((GeneralPath) shape).curveTo(24.788998, 9.391, 23.543, 9.351999, 22.753998, 9.5859995);
        ((GeneralPath) shape).curveTo(21.960999, 9.82, 21.448997, 10.061999, 21.214998, 10.32);
        ((GeneralPath) shape).lineTo(21.120998, 10.641);
        ((GeneralPath) shape).lineTo(19.198997, 28.237999);
        ((GeneralPath) shape).curveTo(19.327997, 27.984, 19.550997, 27.737999, 19.870998, 27.504);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_28_0_0_0_0

        // _0_0_0_29

        // _0_0_0_29_0

        // _0_0_0_29_0_0

        // _0_0_0_29_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_29_0_0_0_0

        // _0_0_0_29_0_0_0_0_0

        // _0_0_0_29_0_0_0_0_0_0

        // _0_0_0_29_0_0_0_0_0_0_0

        // _0_0_0_29_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.879, 23.008);
        ((GeneralPath) shape).curveTo(20.879, 22.772999, 20.772999, 22.656, 20.559, 22.656);
        ((GeneralPath) shape).curveTo(20.348, 22.656, 20.238, 22.773, 20.238, 23.008);
        ((GeneralPath) shape).curveTo(20.238, 23.241999, 20.348001, 23.359, 20.559, 23.359);
        ((GeneralPath) shape).curveTo(20.773, 23.359, 20.879, 23.241999, 20.879, 23.008);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_29_0_0_0_0

        // _0_0_0_30

        // _0_0_0_30_0

        // _0_0_0_30_0_0

        // _0_0_0_30_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_30_0_0_0_0

        // _0_0_0_30_0_0_0_0_0

        // _0_0_0_30_0_0_0_0_0_0

        // _0_0_0_30_0_0_0_0_0_0_0

        // _0_0_0_30_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.68, 21.895);
        ((GeneralPath) shape).curveTo(29.68, 21.746, 29.637001, 21.617, 29.551, 21.512001);
        ((GeneralPath) shape).curveTo(29.445, 21.406, 29.328001, 21.352001, 29.199001, 21.352001);
        ((GeneralPath) shape).curveTo(29.070002, 21.352001, 28.965002, 21.406002, 28.879002, 21.512001);
        ((GeneralPath) shape).curveTo(28.773, 21.617, 28.719002, 21.746, 28.719002, 21.895);
        ((GeneralPath) shape).curveTo(28.719002, 22.047, 28.773003, 22.172, 28.879002, 22.281);
        ((GeneralPath) shape).curveTo(28.965002, 22.387001, 29.070002, 22.441, 29.199001, 22.441);
        ((GeneralPath) shape).curveTo(29.328001, 22.441, 29.445002, 22.387, 29.551, 22.281);
        ((GeneralPath) shape).curveTo(29.637001, 22.172, 29.68, 22.047, 29.68, 21.895);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_30_0_0_0_0

        // _0_0_0_31

        // _0_0_0_31_0

        // _0_0_0_31_0_0

        // _0_0_0_31_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_31_0_0_0_0

        // _0_0_0_31_0_0_0_0_0

        // _0_0_0_31_0_0_0_0_0_0

        // _0_0_0_31_0_0_0_0_0_0_0

        // _0_0_0_31_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.809, 16.113);
        ((GeneralPath) shape).curveTo(28.809, 15.836, 28.711, 15.695001, 28.52, 15.695001);
        ((GeneralPath) shape).curveTo(28.309, 15.695001, 28.199001, 15.836, 28.199001, 16.113);
        ((GeneralPath) shape).curveTo(28.199001, 16.410002, 28.309002, 16.559, 28.52, 16.559);
        ((GeneralPath) shape).curveTo(28.711, 16.559, 28.809, 16.41, 28.809, 16.113);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_31_0_0_0_0

        // _0_0_0_32

        // _0_0_0_32_0

        // _0_0_0_32_0_0

        // _0_0_0_32_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_32_0_0_0_0

        // _0_0_0_32_0_0_0_0_0

        // _0_0_0_32_0_0_0_0_0_0

        // _0_0_0_32_0_0_0_0_0_0_0

        // _0_0_0_32_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.863, 13.809);
        ((GeneralPath) shape).curveTo(22.863, 13.594, 22.77, 13.488, 22.574001, 13.488);
        ((GeneralPath) shape).curveTo(22.406002, 13.488, 22.320002, 13.594, 22.320002, 13.809);
        ((GeneralPath) shape).curveTo(22.320002, 14.043, 22.406002, 14.16, 22.574001, 14.16);
        ((GeneralPath) shape).curveTo(22.77, 14.16, 22.863, 14.043, 22.863, 13.809);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_32_0_0_0_0

        // _0_0_0_33

        // _0_0_0_33_0

        // _0_0_0_33_0_0

        // _0_0_0_33_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_33_0_0_0_0

        // _0_0_0_33_0_0_0_0_0

        // _0_0_0_33_0_0_0_0_0_0

        // _0_0_0_33_0_0_0_0_0_0_0

        // _0_0_0_33_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.648, 11.617);
        ((GeneralPath) shape).curveTo(25.648, 11.254, 25.52, 11.07, 25.266, 11.07);
        ((GeneralPath) shape).curveTo(25.008001, 11.07, 24.879002, 11.254, 24.879002, 11.617);
        ((GeneralPath) shape).curveTo(24.879002, 11.98, 25.008001, 12.16, 25.266, 12.16);
        ((GeneralPath) shape).curveTo(25.52, 12.16, 25.648, 11.98, 25.648, 11.617);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_33_0_0_0_0

        // _0_0_0_34

        // _0_0_0_34_0

        // _0_0_0_34_0_0

        // _0_0_0_34_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_34_0_0_0_0

        // _0_0_0_34_0_0_0_0_0

        // _0_0_0_34_0_0_0_0_0_0

        // _0_0_0_34_0_0_0_0_0_0_0

        // _0_0_0_34_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.816, 21.879);
        ((GeneralPath) shape).curveTo(26.816, 21.668, 26.754, 21.559, 26.625, 21.559);
        ((GeneralPath) shape).curveTo(26.477, 21.559, 26.398, 21.668, 26.398, 21.879);
        ((GeneralPath) shape).curveTo(26.398, 22.094, 26.477001, 22.199, 26.625, 22.199);
        ((GeneralPath) shape).curveTo(26.754, 22.199, 26.816, 22.094, 26.816, 21.879);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_34_0_0_0_0

        // _0_0_0_35

        // _0_0_0_35_0

        // _0_0_0_35_0_0

        // _0_0_0_35_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_35_0_0_0_0

        // _0_0_0_35_0_0_0_0_0

        // _0_0_0_35_0_0_0_0_0_0

        // _0_0_0_35_0_0_0_0_0_0_0

        // _0_0_0_35_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.633, 20.383);
        ((GeneralPath) shape).curveTo(27.633, 20.215, 27.566, 20.129, 27.441, 20.129);
        ((GeneralPath) shape).curveTo(27.332, 20.129, 27.281, 20.215, 27.281, 20.383);
        ((GeneralPath) shape).curveTo(27.281, 20.555, 27.332, 20.640999, 27.441, 20.640999);
        ((GeneralPath) shape).curveTo(27.566, 20.640999, 27.633, 20.554998, 27.633, 20.383);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_35_0_0_0_0

        // _0_0_0_36

        // _0_0_0_36_0

        // _0_0_0_36_0_0

        // _0_0_0_36_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_36_0_0_0_0

        // _0_0_0_36_0_0_0_0_0

        // _0_0_0_36_0_0_0_0_0_0

        // _0_0_0_36_0_0_0_0_0_0_0

        // _0_0_0_36_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.215, 14.785);
        ((GeneralPath) shape).curveTo(24.215, 14.613, 24.141, 14.526999, 23.992, 14.526999);
        ((GeneralPath) shape).curveTo(23.863, 14.526999, 23.801, 14.613, 23.801, 14.785);
        ((GeneralPath) shape).curveTo(23.801, 14.953, 23.863, 15.039, 23.992, 15.039);
        ((GeneralPath) shape).curveTo(24.141, 15.039, 24.215, 14.952999, 24.215, 14.785);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_36_0_0_0_0

        // _0_0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.32, 27.295);
        ((GeneralPath) shape).lineTo(21.215, 27.104);
        ((GeneralPath) shape).curveTo(21.406, 24.885, 21.602, 22.572, 21.793, 20.158);
        ((GeneralPath) shape).curveTo(22.156, 15.3810005, 22.311998, 12.565001, 22.272999, 11.713001);
        ((GeneralPath) shape).curveTo(22.188, 10.217001, 21.534998, 15.412001, 20.32, 27.295002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.551, 10.272);
        ((GeneralPath) shape).curveTo(28.277, 10.5060005, 28.641, 10.772, 28.641, 11.0720005);
        ((GeneralPath) shape).lineTo(28.609001, 11.104);
        ((GeneralPath) shape).lineTo(30.59, 27.326);
        ((GeneralPath) shape).curveTo(29.375, 26.666, 27.52, 26.334, 25.023, 26.334);
        ((GeneralPath) shape).curveTo(22.355001, 26.334, 20.457, 26.697, 19.328001, 27.424);
        ((GeneralPath) shape).lineTo(21.312, 11.104);
        ((GeneralPath) shape).lineTo(21.312, 11.0720005);
        ((GeneralPath) shape).curveTo(21.312, 10.772, 21.664, 10.5060005, 22.367, 10.272);
        ((GeneralPath) shape).curveTo(23.094, 10.061, 23.957, 9.951, 24.957, 9.951);
        ((GeneralPath) shape).curveTo(25.961, 9.951, 26.828001, 10.061, 27.551, 10.272);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(30.305, 28.256);
        ((GeneralPath) shape).curveTo(30.305, 28.619001, 29.793001, 28.928001, 28.77, 29.182001);
        ((GeneralPath) shape).curveTo(27.742, 29.44, 26.527, 29.568, 25.121, 29.568);
        ((GeneralPath) shape).curveTo(23.691, 29.568, 22.465, 29.44, 21.438, 29.182001);
        ((GeneralPath) shape).curveTo(20.438, 28.928001, 19.934, 28.619001, 19.934, 28.256);
        ((GeneralPath) shape).curveTo(19.934, 27.893, 20.438, 27.584, 21.438, 27.326);
        ((GeneralPath) shape).curveTo(22.461, 27.072, 23.691, 26.943, 25.121, 26.943);
        ((GeneralPath) shape).curveTo(26.527, 26.943, 27.742, 27.072, 28.77, 27.326);
        ((GeneralPath) shape).curveTo(29.793001, 27.584, 30.305, 27.893, 30.305, 28.256);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(29.375, 29.44);
        ((GeneralPath) shape).lineTo(29.406, 29.44);
        ((GeneralPath) shape).lineTo(29.793, 29.311);
        ((GeneralPath) shape).lineTo(29.824, 29.311);
        ((GeneralPath) shape).curveTo(30.762, 28.994001, 31.241999, 28.619001, 31.262, 28.193);
        ((GeneralPath) shape).lineTo(31.296999, 28.193);
        ((GeneralPath) shape).lineTo(29.022999, 9.76);
        ((GeneralPath) shape).lineTo(29.054998, 9.729);
        ((GeneralPath) shape).curveTo(29.054998, 9.389, 28.659998, 9.1, 27.870998, 8.865);
        ((GeneralPath) shape).curveTo(27.102, 8.631, 26.163998, 8.514, 25.054998, 8.514);
        ((GeneralPath) shape).curveTo(23.944998, 8.514, 23.008, 8.631, 22.237999, 8.865);
        ((GeneralPath) shape).curveTo(21.449, 9.099999, 21.054998, 9.389, 21.054998, 9.729);
        ((GeneralPath) shape).lineTo(21.054998, 9.76);
        ((GeneralPath) shape).lineTo(18.815998, 28.065);
        ((GeneralPath) shape).lineTo(18.784998, 28.158);
        ((GeneralPath) shape).lineTo(18.784998, 28.193);
        ((GeneralPath) shape).curveTo(18.827997, 28.639, 19.315998, 29.014, 20.257998, 29.311);
        ((GeneralPath) shape).lineTo(20.288998, 29.311);
        ((GeneralPath) shape).lineTo(20.671997, 29.44);
        ((GeneralPath) shape).lineTo(20.702997, 29.44);
        ((GeneralPath) shape).lineTo(21.085997, 29.568);
        ((GeneralPath) shape).lineTo(21.183996, 29.568);
        ((GeneralPath) shape).lineTo(21.565996, 29.662);
        ((GeneralPath) shape).lineTo(21.694996, 29.662);
        ((GeneralPath) shape).lineTo(22.077995, 29.76);
        ((GeneralPath) shape).lineTo(22.269995, 29.76);
        ((GeneralPath) shape).lineTo(23.198996, 29.885);
        ((GeneralPath) shape).lineTo(23.519995, 29.885);
        ((GeneralPath) shape).lineTo(24.155994, 29.951);
        ((GeneralPath) shape).lineTo(25.886993, 29.951);
        ((GeneralPath) shape).lineTo(26.558994, 29.885);
        ((GeneralPath) shape).lineTo(26.878994, 29.885);
        ((GeneralPath) shape).lineTo(27.804995, 29.76);
        ((GeneralPath) shape).lineTo(27.995995, 29.76);
        ((GeneralPath) shape).lineTo(28.378994, 29.662);
        ((GeneralPath) shape).lineTo(28.476994, 29.662);
        ((GeneralPath) shape).lineTo(28.894993, 29.568);
        ((GeneralPath) shape).lineTo(28.956993, 29.568);
        ((GeneralPath) shape).lineTo(29.374992, 29.44);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        // _0_0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.414, 10.69);
        ((GeneralPath) shape).curveTo(28.715, 10.325999, 28.66, 9.971, 28.258, 9.631);
        ((GeneralPath) shape).curveTo(27.809, 9.268, 27.031, 9.056999, 25.921999, 8.99);
        ((GeneralPath) shape).curveTo(23.723, 8.885, 22.348, 9.131, 21.793, 9.729);
        ((GeneralPath) shape).curveTo(21.688, 9.877, 21.633, 10.037, 21.633, 10.209);
        ((GeneralPath) shape).curveTo(21.633, 10.334, 21.675999, 10.443, 21.762, 10.528999);
        ((GeneralPath) shape).curveTo(22.464998, 10.143, 23.530998, 9.950999, 24.960999, 9.950999);
        ((GeneralPath) shape).curveTo(26.624998, 9.950999, 27.776999, 10.197, 28.413998, 10.69);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.055, 9.729);
        ((GeneralPath) shape).curveTo(29.055, 9.385, 28.66, 9.1, 27.871, 8.865);
        ((GeneralPath) shape).curveTo(27.105, 8.631, 26.164, 8.514, 25.059, 8.514);
        ((GeneralPath) shape).curveTo(24.074, 8.514, 23.211, 8.608, 22.465, 8.799);
        ((GeneralPath) shape).curveTo(21.781, 8.971, 21.324, 9.193, 21.09, 9.471);
        ((GeneralPath) shape).curveTo(21.387001, 9.236, 21.867, 9.045, 22.527, 8.896999);
        ((GeneralPath) shape).curveTo(23.469, 8.704999, 24.438, 8.638999, 25.441, 8.704999);
        ((GeneralPath) shape).curveTo(26.398, 8.747999, 27.266, 8.896999, 28.031, 9.153999);
        ((GeneralPath) shape).curveTo(28.414, 9.3029995, 28.758, 9.4939995, 29.055, 9.728999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8BC3CF));
        g.fill(shape);

        // _0_0_0_41

        // _0_0_0_41_0

        // _0_0_0_41_0_0

        // _0_0_0_41_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_41_0_0_0_0

        // _0_0_0_41_0_0_0_0_0

        // _0_0_0_41_0_0_0_0_0_0

        // _0_0_0_41_0_0_0_0_0_0_0

        // _0_0_0_41_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 24.367);
        ((GeneralPath) shape).lineTo(0.0, 24.527);
        ((GeneralPath) shape).curveTo(0.043, 25.02, 0.672, 25.445, 1.887, 25.809);
        ((GeneralPath) shape).curveTo(3.125, 26.148, 4.617, 26.32, 6.367, 26.32);
        ((GeneralPath) shape).curveTo(8.098, 26.32, 9.578, 26.147999, 10.816, 25.809);
        ((GeneralPath) shape).curveTo(12.055, 25.445, 12.695, 25.02, 12.734, 24.527);
        ((GeneralPath) shape).lineTo(10.434, 5.7420006);
        ((GeneralPath) shape).lineTo(10.465, 5.680001);
        ((GeneralPath) shape).curveTo(10.465, 5.3400006, 10.059, 5.0510006, 9.246, 4.816001);
        ((GeneralPath) shape).curveTo(8.438001, 4.559001, 7.477, 4.434001, 6.3670006, 4.434001);
        ((GeneralPath) shape).curveTo(5.2580004, 4.434001, 4.3010006, 4.559001, 3.4880006, 4.816001);
        ((GeneralPath) shape).curveTo(2.6990006, 5.051001, 2.3050008, 5.340001, 2.3050008, 5.680001);
        ((GeneralPath) shape).lineTo(2.3050008, 5.7420006);
        ((GeneralPath) shape).lineTo(7.1525574E-7, 24.367);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_41_0_0_0_0

        // _0_0_0_42

        // _0_0_0_42_0

        // _0_0_0_42_0_0

        // _0_0_0_42_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.969, 20.736);
        ((GeneralPath) shape).lineTo(10.113, 5.729);
        ((GeneralPath) shape).lineTo(2.7189999, 5.5680003);
        ((GeneralPath) shape).lineTo(0.70299983, 20.736);
        ((GeneralPath) shape).lineTo(11.969, 20.736);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(23.724000930786133, 4.806600093841553), 18.98f, new Point2D.Double(23.724000930786133, 4.806600093841553), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(0.27864f, -0.57616f, 0.57616f, 0.27864f, -5.5389f, 29.257f)));
        g.fill(shape);

        // _0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.992, 21.026);
        ((GeneralPath) shape).curveTo(2.527, 21.151, 4.117, 21.259998, 5.762, 21.342);
        ((GeneralPath) shape).curveTo(9.023, 21.514, 10.91, 21.483, 11.426001, 21.248);
        ((GeneralPath) shape).curveTo(12.129001, 20.904, 12.012001, 20.545, 11.070001, 20.157999);
        ((GeneralPath) shape).curveTo(10.027, 19.709, 8.352001, 19.498, 6.047001, 19.522);
        ((GeneralPath) shape).curveTo(3.938001, 19.540998, 2.434001, 19.755999, 1.5350008, 20.157999);
        ((GeneralPath) shape).lineTo(0.8320008, 20.768);
        ((GeneralPath) shape).curveTo(0.8090008, 20.916, 0.8630008, 21.001999, 0.9920008, 21.026);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_44

        // _0_0_0_44_0

        // _0_0_0_44_0_0

        // _0_0_0_44_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.648, 20.928);
        ((GeneralPath) shape).curveTo(11.648, 20.564999, 11.125, 20.255999, 10.078, 19.998);
        ((GeneralPath) shape).curveTo(9.035, 19.764, 7.754, 19.647, 6.238, 19.647);
        ((GeneralPath) shape).curveTo(4.746, 19.647, 3.477, 19.764, 2.434, 19.998);
        ((GeneralPath) shape).curveTo(1.387, 20.255999, 0.86300004, 20.564999, 0.86300004, 20.928);
        ((GeneralPath) shape).curveTo(0.86300004, 21.268, 1.3870001, 21.567999, 2.434, 21.821999);
        ((GeneralPath) shape).curveTo(3.477, 22.079998, 4.7460003, 22.204998, 6.238, 22.204998);
        ((GeneralPath) shape).curveTo(7.734, 22.204998, 9.012, 22.079998, 10.078, 21.821999);
        ((GeneralPath) shape).curveTo(11.125, 21.588, 11.648, 21.290998, 11.648, 20.928);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-14.086000442504883, -18.62700080871582), new Point2D.Double(-1.3000999689102173, -18.62700080871582), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(-0.63064f, -0.10888f, -0.10888f, 0.63064f, 4.0E-4f, 31.936f)));
        g.fill(shape);

        // _0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.391, 20.193);
        ((GeneralPath) shape).curveTo(7.605, 20.193, 7.711, 20.084002, 7.711, 19.873001);
        ((GeneralPath) shape).curveTo(7.711, 19.658, 7.605, 19.553001, 7.391, 19.553001);
        ((GeneralPath) shape).curveTo(7.199, 19.553001, 7.1049995, 19.658, 7.1049995, 19.873001);
        ((GeneralPath) shape).curveTo(7.1049995, 20.084002, 7.1989994, 20.193, 7.391, 20.193);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(7.391, 19.682001);
        ((GeneralPath) shape).curveTo(7.5429997, 19.682001, 7.6169996, 19.756, 7.6169996, 19.904001);
        ((GeneralPath) shape).curveTo(7.6169996, 20.076002, 7.5389996, 20.158, 7.391, 20.158);
        ((GeneralPath) shape).curveTo(7.2419996, 20.158, 7.1679997, 20.076, 7.1679997, 19.904001);
        ((GeneralPath) shape).curveTo(7.1679997, 19.756, 7.2419996, 19.682001, 7.391, 19.682001);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.84, 20.033);
        ((GeneralPath) shape).curveTo(7.988, 20.033, 8.062, 19.955002, 8.062, 19.807001);
        ((GeneralPath) shape).curveTo(8.062, 19.658, 7.9880004, 19.584002, 7.84, 19.584002);
        ((GeneralPath) shape).curveTo(7.691, 19.584002, 7.617, 19.658, 7.617, 19.807001);
        ((GeneralPath) shape).curveTo(7.617, 19.955002, 7.691, 20.033, 7.84, 20.033);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(7.84, 19.682001);
        ((GeneralPath) shape).curveTo(7.945, 19.682001, 8.0, 19.733002, 8.0, 19.838001);
        ((GeneralPath) shape).curveTo(8.0, 19.947, 7.945, 19.998001, 7.84, 19.998001);
        ((GeneralPath) shape).curveTo(7.734, 19.998001, 7.6800003, 19.947, 7.6800003, 19.838001);
        ((GeneralPath) shape).curveTo(7.6800003, 19.733002, 7.734, 19.682001, 7.84, 19.682001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.039, 20.865);
        ((GeneralPath) shape).curveTo(11.254, 20.865, 11.358999, 20.748, 11.358999, 20.51);
        ((GeneralPath) shape).curveTo(11.358999, 20.299, 11.254, 20.193, 11.039, 20.193);
        ((GeneralPath) shape).curveTo(10.804999, 20.193, 10.688, 20.299002, 10.688, 20.51);
        ((GeneralPath) shape).curveTo(10.688, 20.748001, 10.804999, 20.865, 11.039, 20.865);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(11.007999, 20.317999);
        ((GeneralPath) shape).curveTo(11.155999, 20.317999, 11.23, 20.404, 11.23, 20.575998);
        ((GeneralPath) shape).curveTo(11.23, 20.724998, 11.155999, 20.798998, 11.007999, 20.798998);
        ((GeneralPath) shape).curveTo(10.858999, 20.798998, 10.785, 20.724998, 10.785, 20.575998);
        ((GeneralPath) shape).curveTo(10.785, 20.403997, 10.859, 20.317999, 11.007999, 20.317999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_48

        // _0_0_0_48_0

        // _0_0_0_48_0_0

        // _0_0_0_48_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_48_0_0_0_0

        // _0_0_0_48_0_0_0_0_0

        // _0_0_0_48_0_0_0_0_0_0

        // _0_0_0_48_0_0_0_0_0_0_0

        // _0_0_0_48_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.719, 23.055);
        ((GeneralPath) shape).lineTo(10.573999, 23.441);
        ((GeneralPath) shape).lineTo(9.327999, 5.7110004);
        ((GeneralPath) shape).lineTo(8.237999, 5.168);
        ((GeneralPath) shape).lineTo(8.718999, 23.055);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_48_0_0_0_0

        // _0_0_0_49

        // _0_0_0_49_0

        // _0_0_0_49_0_0

        // _0_0_0_49_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_49_0_0_0_0

        // _0_0_0_49_0_0_0_0_0

        // _0_0_0_49_0_0_0_0_0_0

        // _0_0_0_49_0_0_0_0_0_0_0

        // _0_0_0_49_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.07, 23.754);
        ((GeneralPath) shape).curveTo(1.7540001, 23.262, 2.617, 23.015999, 3.664, 23.015999);
        ((GeneralPath) shape).curveTo(5.648, 23.015999, 7.023, 23.026999, 7.793, 23.046999);
        ((GeneralPath) shape).curveTo(9.352, 23.133, 10.395, 23.280998, 10.93, 23.495998);
        ((GeneralPath) shape).curveTo(11.719, 23.835999, 12.176001, 24.093998, 12.305, 24.265999);
        ((GeneralPath) shape).lineTo(10.191, 6.2459984);
        ((GeneralPath) shape).curveTo(9.488, 6.0349984, 8.699, 5.8439984, 7.824, 5.6719985);
        ((GeneralPath) shape).curveTo(6.098, 5.3319983, 4.828, 5.2769985, 4.016, 5.5119987);
        ((GeneralPath) shape).curveTo(3.2269998, 5.745999, 2.7149997, 6.0039988, 2.4799998, 6.2809987);
        ((GeneralPath) shape).lineTo(2.3519998, 6.601999);
        ((GeneralPath) shape).lineTo(0.39799976, 24.519999);
        ((GeneralPath) shape).curveTo(0.5269998, 24.265999, 0.75399977, 24.008, 1.0699997, 23.753998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_49_0_0_0_0

        // _0_0_0_50

        // _0_0_0_50_0

        // _0_0_0_50_0_0

        // _0_0_0_50_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_50_0_0_0_0

        // _0_0_0_50_0_0_0_0_0

        // _0_0_0_50_0_0_0_0_0_0

        // _0_0_0_50_0_0_0_0_0_0_0

        // _0_0_0_50_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.391, 15.895);
        ((GeneralPath) shape).curveTo(5.391, 15.660001, 5.285, 15.543, 5.0699997, 15.543);
        ((GeneralPath) shape).curveTo(4.8359995, 15.543, 4.719, 15.66, 4.719, 15.895);
        ((GeneralPath) shape).curveTo(4.719, 16.152, 4.836, 16.281, 5.0699997, 16.281);
        ((GeneralPath) shape).curveTo(5.285, 16.281, 5.391, 16.152, 5.391, 15.895);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_50_0_0_0_0

        // _0_0_0_51

        // _0_0_0_51_0

        // _0_0_0_51_0_0

        // _0_0_0_51_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_51_0_0_0_0

        // _0_0_0_51_0_0_0_0_0

        // _0_0_0_51_0_0_0_0_0_0

        // _0_0_0_51_0_0_0_0_0_0_0

        // _0_0_0_51_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.199, 17.375);
        ((GeneralPath) shape).curveTo(5.199, 17.227, 5.1559997, 17.098, 5.0699997, 16.992);
        ((GeneralPath) shape).curveTo(4.9649997, 16.887001, 4.8479996, 16.832, 4.719, 16.832);
        ((GeneralPath) shape).curveTo(4.398, 16.832, 4.238, 17.012001, 4.238, 17.375);
        ((GeneralPath) shape).curveTo(4.238, 17.737999, 4.398, 17.922, 4.719, 17.922);
        ((GeneralPath) shape).curveTo(5.039, 17.922, 5.199, 17.738, 5.199, 17.375);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_51_0_0_0_0

        // _0_0_0_52

        // _0_0_0_52_0

        // _0_0_0_52_0_0

        // _0_0_0_52_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_52_0_0_0_0

        // _0_0_0_52_0_0_0_0_0

        // _0_0_0_52_0_0_0_0_0_0

        // _0_0_0_52_0_0_0_0_0_0_0

        // _0_0_0_52_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.879, 10.863);
        ((GeneralPath) shape).curveTo(8.879, 10.566, 8.773, 10.414, 8.559, 10.414);
        ((GeneralPath) shape).curveTo(8.348, 10.414, 8.238, 10.566, 8.238, 10.863);
        ((GeneralPath) shape).curveTo(8.238, 11.141, 8.348, 11.281, 8.559, 11.281);
        ((GeneralPath) shape).curveTo(8.773, 11.281, 8.879, 11.141, 8.879, 10.863);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_52_0_0_0_0

        // _0_0_0_53

        // _0_0_0_53_0

        // _0_0_0_53_0_0

        // _0_0_0_53_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_53_0_0_0_0

        // _0_0_0_53_0_0_0_0_0

        // _0_0_0_53_0_0_0_0_0_0

        // _0_0_0_53_0_0_0_0_0_0_0

        // _0_0_0_53_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.383, 9.809);
        ((GeneralPath) shape).curveTo(9.383, 9.594, 9.2890005, 9.488, 9.098001, 9.488);
        ((GeneralPath) shape).curveTo(8.926001, 9.488, 8.84, 9.594, 8.84, 9.809);
        ((GeneralPath) shape).curveTo(8.84, 10.043, 8.926001, 10.16, 9.098001, 10.16);
        ((GeneralPath) shape).curveTo(9.2890005, 10.16, 9.383, 10.043, 9.383, 9.809);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_53_0_0_0_0

        // _0_0_0_54

        // _0_0_0_54_0

        // _0_0_0_54_0_0

        // _0_0_0_54_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_54_0_0_0_0

        // _0_0_0_54_0_0_0_0_0

        // _0_0_0_54_0_0_0_0_0_0

        // _0_0_0_54_0_0_0_0_0_0_0

        // _0_0_0_54_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.398, 7.574);
        ((GeneralPath) shape).curveTo(4.398, 7.2149997, 4.2619996, 7.031, 3.9839997, 7.031);
        ((GeneralPath) shape).curveTo(3.7269998, 7.031, 3.6019998, 7.215, 3.6019998, 7.5740004);
        ((GeneralPath) shape).curveTo(3.6019998, 7.938, 3.7269998, 8.121, 3.9839997, 8.121);
        ((GeneralPath) shape).curveTo(4.0899997, 8.121, 4.1879997, 8.066, 4.273, 7.9610004);
        ((GeneralPath) shape).curveTo(4.3589997, 7.852, 4.398, 7.727, 4.398, 7.5740004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_54_0_0_0_0

        // _0_0_0_55

        // _0_0_0_55_0

        // _0_0_0_55_0_0

        // _0_0_0_55_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_55_0_0_0_0

        // _0_0_0_55_0_0_0_0_0

        // _0_0_0_55_0_0_0_0_0_0

        // _0_0_0_55_0_0_0_0_0_0_0

        // _0_0_0_55_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.809, 18.031);
        ((GeneralPath) shape).curveTo(10.809, 17.82, 10.734, 17.711, 10.586, 17.711);
        ((GeneralPath) shape).curveTo(10.434, 17.711, 10.359, 17.82, 10.359, 18.031);
        ((GeneralPath) shape).curveTo(10.359, 18.223, 10.434, 18.32, 10.586, 18.32);
        ((GeneralPath) shape).curveTo(10.734, 18.32, 10.809, 18.223, 10.809, 18.031);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_55_0_0_0_0

        // _0_0_0_56

        // _0_0_0_56_0

        // _0_0_0_56_0_0

        // _0_0_0_56_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_56_0_0_0_0

        // _0_0_0_56_0_0_0_0_0

        // _0_0_0_56_0_0_0_0_0_0

        // _0_0_0_56_0_0_0_0_0_0_0

        // _0_0_0_56_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.84, 19.145);
        ((GeneralPath) shape).curveTo(1.84, 18.973, 1.7850001, 18.887001, 1.6800001, 18.887001);
        ((GeneralPath) shape).curveTo(1.5740001, 18.887001, 1.5200001, 18.973001, 1.5200001, 19.145);
        ((GeneralPath) shape).curveTo(1.5200001, 19.316, 1.5740001, 19.398, 1.6800001, 19.398);
        ((GeneralPath) shape).curveTo(1.7850001, 19.398, 1.84, 19.316, 1.84, 19.145);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_56_0_0_0_0

        // _0_0_0_57

        // _0_0_0_57_0

        // _0_0_0_57_0_0

        // _0_0_0_57_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_57_0_0_0_0

        // _0_0_0_57_0_0_0_0_0

        // _0_0_0_57_0_0_0_0_0_0

        // _0_0_0_57_0_0_0_0_0_0_0

        // _0_0_0_57_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.527, 10.824);
        ((GeneralPath) shape).curveTo(5.527, 10.652, 5.453, 10.566, 5.305, 10.566);
        ((GeneralPath) shape).curveTo(5.1559997, 10.566, 5.078, 10.652, 5.078, 10.824);
        ((GeneralPath) shape).curveTo(5.078, 10.996, 5.156, 11.078, 5.3050003, 11.078);
        ((GeneralPath) shape).curveTo(5.453, 11.078, 5.5270004, 10.996, 5.5270004, 10.824);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_57_0_0_0_0

        // _0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.535, 23.553);
        ((GeneralPath) shape).lineTo(2.496, 23.361);
        ((GeneralPath) shape).curveTo(2.688, 21.1, 2.879, 18.74, 3.0700002, 16.287);
        ((GeneralPath) shape).curveTo(3.4340003, 11.404001, 3.5860002, 8.522001, 3.5200002, 7.6470003);
        ((GeneralPath) shape).curveTo(3.4340003, 6.135, 2.7730002, 11.436001, 1.5350002, 23.553001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.367, 22.592);
        ((GeneralPath) shape).curveTo(5.09, 22.592, 3.914, 22.689999, 2.848, 22.880999);
        ((GeneralPath) shape).curveTo(1.824, 23.092, 1.0550001, 23.360998, 0.543, 23.678);
        ((GeneralPath) shape).lineTo(2.559, 7.0719986);
        ((GeneralPath) shape).lineTo(2.559, 7.0059986);
        ((GeneralPath) shape).curveTo(2.559, 6.7089987, 2.922, 6.4429984, 3.648, 6.2049985);
        ((GeneralPath) shape).curveTo(4.395, 5.9939985, 5.281, 5.8889985, 6.3050003, 5.8889985);
        ((GeneralPath) shape).curveTo(7.328, 5.8889985, 8.203, 5.9939985, 8.93, 6.2049985);
        ((GeneralPath) shape).curveTo(9.652, 6.4429984, 10.016001, 6.7089987, 10.016001, 7.0059986);
        ((GeneralPath) shape).lineTo(10.016001, 7.0719986);
        ((GeneralPath) shape).lineTo(12.031001, 23.583998);
        ((GeneralPath) shape).curveTo(10.816001, 22.923998, 8.930001, 22.591997, 6.367001, 22.591997);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(11.742001, 24.544998);
        ((GeneralPath) shape).curveTo(11.742001, 24.907999, 11.2300005, 25.217, 10.207001, 25.470999);
        ((GeneralPath) shape).curveTo(9.1640005, 25.728998, 7.9020004, 25.857998, 6.434001, 25.857998);
        ((GeneralPath) shape).curveTo(4.980001, 25.857998, 3.734001, 25.728998, 2.688001, 25.470999);
        ((GeneralPath) shape).curveTo(1.6640009, 25.217, 1.1520009, 24.907999, 1.1520009, 24.544998);
        ((GeneralPath) shape).curveTo(1.1520009, 24.181997, 1.664001, 23.860998, 2.688001, 23.583998);
        ((GeneralPath) shape).curveTo(3.734001, 23.329998, 4.980001, 23.200998, 6.434001, 23.200998);
        ((GeneralPath) shape).curveTo(7.902001, 23.200998, 9.164001, 23.329998, 10.207001, 23.583998);
        ((GeneralPath) shape).curveTo(11.2300005, 23.860998, 11.742001, 24.181997, 11.742001, 24.544998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(7.2300005, 26.239998);
        ((GeneralPath) shape).lineTo(7.6480007, 26.239998);
        ((GeneralPath) shape).lineTo(9.762001, 25.982998);
        ((GeneralPath) shape).lineTo(10.305001, 25.857998);
        ((GeneralPath) shape).lineTo(10.367002, 25.857998);
        ((GeneralPath) shape).lineTo(10.785002, 25.759998);
        ((GeneralPath) shape).lineTo(10.816002, 25.728998);
        ((GeneralPath) shape).lineTo(11.234002, 25.599998);
        ((GeneralPath) shape).curveTo(12.172002, 25.302998, 12.672002, 24.927998, 12.738002, 24.482998);
        ((GeneralPath) shape).lineTo(10.434002, 5.6969986);
        ((GeneralPath) shape).lineTo(10.465002, 5.6309986);
        ((GeneralPath) shape).curveTo(10.465002, 5.2909985, 10.059002, 5.0019984, 9.250002, 4.7679987);
        ((GeneralPath) shape).curveTo(8.438002, 4.5139985, 7.477002, 4.384999, 6.367002, 4.384999);
        ((GeneralPath) shape).curveTo(5.2580023, 4.384999, 4.301002, 4.513999, 3.488002, 4.7679987);
        ((GeneralPath) shape).curveTo(2.699002, 5.001999, 2.3050022, 5.2909985, 2.3050022, 5.6309986);
        ((GeneralPath) shape).lineTo(2.3050022, 5.6969986);
        ((GeneralPath) shape).lineTo(2.1457672E-6, 24.317999);
        ((GeneralPath) shape).lineTo(2.1457672E-6, 24.478998);
        ((GeneralPath) shape).curveTo(0.043002147, 24.903997, 0.5430021, 25.278997, 1.5040021, 25.599998);
        ((GeneralPath) shape).lineTo(1.5040021, 25.630999);
        ((GeneralPath) shape).lineTo(1.9220021, 25.728998);
        ((GeneralPath) shape).lineTo(1.9530021, 25.759998);
        ((GeneralPath) shape).lineTo(2.367002, 25.853998);
        ((GeneralPath) shape).lineTo(2.434002, 25.888998);
        ((GeneralPath) shape).lineTo(5.090002, 26.235998);
        ((GeneralPath) shape).lineTo(5.473002, 26.235998);
        ((GeneralPath) shape).lineTo(5.727002, 26.271997);
        ((GeneralPath) shape).lineTo(7.0080023, 26.271997);
        ((GeneralPath) shape).lineTo(7.2300024, 26.239998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        // _0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.793, 6.623);
        ((GeneralPath) shape).curveTo(10.09, 6.26, 10.0390005, 5.908, 9.633, 5.5680003);
        ((GeneralPath) shape).curveTo(9.184, 5.1860003, 8.395, 4.959, 7.2660003, 4.8970003);
        ((GeneralPath) shape).curveTo(5.004, 4.768, 3.6050003, 5.0260005, 3.0740004, 5.6660004);
        ((GeneralPath) shape).curveTo(2.9450004, 5.8150005, 2.8790004, 5.9750004, 2.8790004, 6.1430006);
        ((GeneralPath) shape).curveTo(2.9020004, 6.272001, 2.9570005, 6.377001, 3.0390005, 6.463001);
        ((GeneralPath) shape).curveTo(3.7460005, 6.080001, 4.8320007, 5.889001, 6.3050003, 5.889001);
        ((GeneralPath) shape).curveTo(8.074, 5.889001, 9.238001, 6.1350007, 9.793, 6.623001);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.465, 5.631);
        ((GeneralPath) shape).curveTo(10.465, 5.291, 10.059, 5.002, 9.246, 4.768);
        ((GeneralPath) shape).curveTo(8.438001, 4.514, 7.477, 4.385, 6.3670006, 4.385);
        ((GeneralPath) shape).curveTo(5.3870006, 4.385, 4.5120006, 4.479, 3.7420006, 4.6740003);
        ((GeneralPath) shape).curveTo(3.0620005, 4.8650002, 2.5940006, 5.1000004, 2.3360004, 5.3770003);
        ((GeneralPath) shape).curveTo(2.6370006, 5.1190004, 3.1250005, 4.9280005, 3.8090005, 4.7990003);
        ((GeneralPath) shape).curveTo(5.8120003, 4.373, 7.6910005, 4.471, 9.441, 5.0880003);
        ((GeneralPath) shape).curveTo(9.867, 5.2170005, 10.195, 5.4080005, 10.434, 5.6660004);
        ((GeneralPath) shape).lineTo(10.465, 5.6310005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8BC3CF));
        g.fill(shape);

        // _0_0_0_62

        // _0_0_0_62_0

        // _0_0_0_62_0_0

        // _0_0_0_62_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_62_0_0_0_0

        // _0_0_0_62_0_0_0_0_0

        // _0_0_0_62_0_0_0_0_0_0

        // _0_0_0_62_0_0_0_0_0_0_0

        // _0_0_0_62_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.344, 21.602);
        ((GeneralPath) shape).lineTo(23.375, 21.602);
        ((GeneralPath) shape).lineTo(20.91, 1.441);
        ((GeneralPath) shape).lineTo(20.91, 1.375);
        ((GeneralPath) shape).curveTo(20.91, 1.016, 20.484, 0.703, 19.633, 0.449);
        ((GeneralPath) shape).curveTo(18.776999, 0.19100001, 17.741999, 0.062000006, 16.527, 0.062000006);
        ((GeneralPath) shape).curveTo(15.332001, 0.062000006, 14.301001, 0.191, 13.426001, 0.449);
        ((GeneralPath) shape).curveTo(12.570001, 0.703, 12.145, 1.0120001, 12.145, 1.375);
        ((GeneralPath) shape).lineTo(12.176001, 1.441);
        ((GeneralPath) shape).lineTo(9.711, 21.473);
        ((GeneralPath) shape).lineTo(9.68, 21.566);
        ((GeneralPath) shape).lineTo(9.68, 21.602);
        ((GeneralPath) shape).lineTo(9.711, 21.602);
        ((GeneralPath) shape).curveTo(9.754001, 22.133, 10.438001, 22.581999, 11.762001, 22.945);
        ((GeneralPath) shape).curveTo(13.082001, 23.328, 14.672001, 23.52, 16.527, 23.52);
        ((GeneralPath) shape).curveTo(18.383, 23.52, 19.973, 23.328001, 21.297, 22.945);
        ((GeneralPath) shape).curveTo(22.641, 22.581999, 23.324001, 22.133, 23.344002, 21.602);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_62_0_0_0_0

        // _0_0_0_63

        // _0_0_0_63_0

        // _0_0_0_63_0_0

        // _0_0_0_63_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.527, 17.502);
        ((GeneralPath) shape).lineTo(20.512001, 1.408001);
        ((GeneralPath) shape).lineTo(12.609001, 1.248001);
        ((GeneralPath) shape).lineTo(10.434001, 17.502);
        ((GeneralPath) shape).lineTo(22.527, 17.502);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(35.35300064086914, -6.849100112915039), 20.367f, new Point2D.Double(35.35300064086914, -6.849100112915039), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(0.27848f, -0.57624f, 0.57624f, 0.27848f, 7.8928f, 35.751f)));
        g.fill(shape);

        // _0_0_0_64
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.719, 17.858);
        ((GeneralPath) shape).curveTo(12.382999, 17.983, 14.09, 18.1, 15.84, 18.205);
        ((GeneralPath) shape).curveTo(19.359001, 18.377, 21.398, 18.334, 21.953, 18.08);
        ((GeneralPath) shape).curveTo(22.699, 17.717, 22.57, 17.334, 21.57, 16.928);
        ((GeneralPath) shape).curveTo(20.438, 16.459, 18.645, 16.225, 16.191, 16.225);
        ((GeneralPath) shape).curveTo(13.93, 16.244, 12.309, 16.471, 11.328, 16.897001);
        ((GeneralPath) shape).lineTo(10.562, 17.568);
        ((GeneralPath) shape).lineTo(10.562, 17.697);
        ((GeneralPath) shape).curveTo(10.582001, 17.779001, 10.633, 17.834, 10.719, 17.858);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_65

        // _0_0_0_65_0

        // _0_0_0_65_0_0

        // _0_0_0_65_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.176, 17.729);
        ((GeneralPath) shape).curveTo(22.176, 17.346, 21.609001, 17.014, 20.480001, 16.736);
        ((GeneralPath) shape).curveTo(19.348001, 16.479, 17.984001, 16.354, 16.383001, 16.354);
        ((GeneralPath) shape).curveTo(14.785002, 16.354, 13.418001, 16.479, 12.289001, 16.736);
        ((GeneralPath) shape).curveTo(11.156001, 17.014, 10.594002, 17.346, 10.594002, 17.729);
        ((GeneralPath) shape).curveTo(10.594002, 18.111, 11.156002, 18.432, 12.289001, 18.69);
        ((GeneralPath) shape).curveTo(13.418001, 18.967001, 14.785002, 19.104, 16.383001, 19.104);
        ((GeneralPath) shape).curveTo(17.984001, 19.104, 19.348001, 18.967001, 20.480001, 18.69);
        ((GeneralPath) shape).curveTo(21.609001, 18.432001, 22.176, 18.111, 22.176, 17.729);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-29.423999786376953, -26.261999130249023), new Point2D.Double(-15.67199993133545, -26.261999130249023), new float[]{0, 1}, new Color[]{new Color(0xFFAA00), new Color(0xE66100)}, NO_CYCLE, SRGB, new AffineTransform(-0.63056f, -0.10936f, -0.10936f, 0.63056f, 0, 31.936f)));
        g.fill(shape);

        // _0_0_0_66
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.121, 17.248);
        ((GeneralPath) shape).curveTo(13.3550005, 17.248, 13.473001, 17.143, 13.473001, 16.928);
        ((GeneralPath) shape).curveTo(13.473001, 16.692999, 13.3550005, 16.576, 13.121, 16.576);
        ((GeneralPath) shape).curveTo(12.906, 16.576, 12.801001, 16.693, 12.801001, 16.928);
        ((GeneralPath) shape).curveTo(12.801001, 17.143, 12.906, 17.248, 13.121, 17.248);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(13.121, 16.705);
        ((GeneralPath) shape).curveTo(13.27, 16.705, 13.344, 16.791, 13.344, 16.959);
        ((GeneralPath) shape).curveTo(13.344, 17.131, 13.2699995, 17.217, 13.121, 17.217);
        ((GeneralPath) shape).curveTo(12.949, 17.217, 12.863, 17.130999, 12.863, 16.959);
        ((GeneralPath) shape).curveTo(12.863, 16.791, 12.949, 16.705, 13.121, 16.705);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_67
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.113, 16.799);
        ((GeneralPath) shape).curveTo(18.262001, 16.799, 18.336, 16.713, 18.336, 16.545);
        ((GeneralPath) shape).curveTo(18.336, 16.373, 18.262001, 16.287, 18.113, 16.287);
        ((GeneralPath) shape).curveTo(17.941, 16.287, 17.855001, 16.373001, 17.855001, 16.545);
        ((GeneralPath) shape).curveTo(17.855001, 16.713, 17.941002, 16.799, 18.113, 16.799);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(18.078001, 16.385);
        ((GeneralPath) shape).curveTo(18.207, 16.385, 18.273, 16.447, 18.273, 16.576);
        ((GeneralPath) shape).curveTo(18.273, 16.705, 18.207, 16.768, 18.078001, 16.768);
        ((GeneralPath) shape).curveTo(17.973001, 16.768, 17.922, 16.705, 17.922, 16.576);
        ((GeneralPath) shape).curveTo(17.922, 16.447, 17.973001, 16.385, 18.078001, 16.385);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_68
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.215, 17.026);
        ((GeneralPath) shape).curveTo(17.43, 17.026, 17.535, 16.907999, 17.535, 16.669998);
        ((GeneralPath) shape).curveTo(17.535, 16.435999, 17.43, 16.321999, 17.215, 16.321999);
        ((GeneralPath) shape).curveTo(16.98, 16.321999, 16.863, 16.435999, 16.863, 16.669998);
        ((GeneralPath) shape).curveTo(16.863, 16.907999, 16.980001, 17.026, 17.215, 17.026);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(17.184, 16.478998);
        ((GeneralPath) shape).curveTo(17.355, 16.478998, 17.441, 16.556997, 17.441, 16.704998);
        ((GeneralPath) shape).curveTo(17.441, 16.872997, 17.355, 16.958998, 17.184, 16.958998);
        ((GeneralPath) shape).curveTo(17.012, 16.958998, 16.93, 16.872997, 16.93, 16.704998);
        ((GeneralPath) shape).curveTo(16.93, 16.552998, 17.012001, 16.478998, 17.184, 16.478998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_69

        // _0_0_0_69_0

        // _0_0_0_69_0_0

        // _0_0_0_69_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_69_0_0_0_0

        // _0_0_0_69_0_0_0_0_0

        // _0_0_0_69_0_0_0_0_0_0

        // _0_0_0_69_0_0_0_0_0_0_0

        // _0_0_0_69_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.0, 19.984);
        ((GeneralPath) shape).lineTo(21.016, 20.397999);
        ((GeneralPath) shape).lineTo(19.672, 1.3909988);
        ((GeneralPath) shape).lineTo(18.52, 0.78499883);
        ((GeneralPath) shape).lineTo(19.0, 19.983997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_69_0_0_0_0

        // _0_0_0_70

        // _0_0_0_70_0

        // _0_0_0_70_0_0

        // _0_0_0_70_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_70_0_0_0_0

        // _0_0_0_70_0_0_0_0_0

        // _0_0_0_70_0_0_0_0_0_0

        // _0_0_0_70_0_0_0_0_0_0_0

        // _0_0_0_70_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.855, 20.762);
        ((GeneralPath) shape).curveTo(11.582, 20.227, 12.507999, 19.960999, 13.641, 19.960999);
        ((GeneralPath) shape).curveTo(15.901999, 19.960999, 17.375, 19.972998, 18.055, 19.991999);
        ((GeneralPath) shape).curveTo(19.742, 20.054998, 20.859001, 20.214998, 21.414, 20.473);
        ((GeneralPath) shape).curveTo(22.27, 20.836, 22.77, 21.112999, 22.921999, 21.305);
        ((GeneralPath) shape).lineTo(20.647999, 1.9449997);
        ((GeneralPath) shape).curveTo(19.879, 1.7109997, 19.039, 1.5079997, 18.120998, 1.3359997);
        ((GeneralPath) shape).curveTo(16.241999, 0.9729997, 14.878998, 0.9219997, 14.022999, 1.1759998);
        ((GeneralPath) shape).curveTo(13.171999, 1.4339998, 12.616999, 1.6989998, 12.358999, 1.9769998);
        ((GeneralPath) shape).lineTo(12.23, 2.3279998);
        ((GeneralPath) shape).lineTo(10.120999, 21.559);
        ((GeneralPath) shape).curveTo(10.245999, 21.281, 10.492, 21.016, 10.855, 20.762);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_70_0_0_0_0

        // _0_0_0_71

        // _0_0_0_71_0

        // _0_0_0_71_0_0

        // _0_0_0_71_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_71_0_0_0_0

        // _0_0_0_71_0_0_0_0_0

        // _0_0_0_71_0_0_0_0_0_0

        // _0_0_0_71_0_0_0_0_0_0_0

        // _0_0_0_71_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.465, 12.336);
        ((GeneralPath) shape).curveTo(15.465, 12.078, 15.348001, 11.953, 15.113, 11.953);
        ((GeneralPath) shape).curveTo(14.879, 11.953, 14.762, 12.078, 14.762, 12.336);
        ((GeneralPath) shape).curveTo(14.762, 12.594001, 14.879, 12.719001, 15.113, 12.719001);
        ((GeneralPath) shape).curveTo(15.348, 12.719001, 15.465, 12.594001, 15.465, 12.336);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_71_0_0_0_0

        // _0_0_0_72

        // _0_0_0_72_0

        // _0_0_0_72_0_0

        // _0_0_0_72_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_72_0_0_0_0

        // _0_0_0_72_0_0_0_0_0

        // _0_0_0_72_0_0_0_0_0_0

        // _0_0_0_72_0_0_0_0_0_0_0

        // _0_0_0_72_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.785, 10.145);
        ((GeneralPath) shape).curveTo(20.785, 9.762, 20.612999, 9.566, 20.273, 9.566);
        ((GeneralPath) shape).curveTo(19.93, 9.566, 19.762001, 9.762, 19.762001, 10.145);
        ((GeneralPath) shape).curveTo(19.762001, 10.527, 19.93, 10.719001, 20.273, 10.719001);
        ((GeneralPath) shape).curveTo(20.613, 10.719001, 20.785, 10.527, 20.785, 10.145);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_72_0_0_0_0

        // _0_0_0_73

        // _0_0_0_73_0

        // _0_0_0_73_0_0

        // _0_0_0_73_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_73_0_0_0_0

        // _0_0_0_73_0_0_0_0_0

        // _0_0_0_73_0_0_0_0_0_0

        // _0_0_0_73_0_0_0_0_0_0_0

        // _0_0_0_73_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.711, 11.281);
        ((GeneralPath) shape).curveTo(12.711, 10.961, 12.6050005, 10.801001, 12.391001, 10.801001);
        ((GeneralPath) shape).curveTo(12.156001, 10.801001, 12.0390005, 10.961, 12.0390005, 11.281);
        ((GeneralPath) shape).curveTo(12.0390005, 11.602, 12.156, 11.762, 12.391001, 11.762);
        ((GeneralPath) shape).curveTo(12.6050005, 11.762, 12.711, 11.602, 12.711, 11.281);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_73_0_0_0_0

        // _0_0_0_74

        // _0_0_0_74_0

        // _0_0_0_74_0_0

        // _0_0_0_74_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_74_0_0_0_0

        // _0_0_0_74_0_0_0_0_0

        // _0_0_0_74_0_0_0_0_0_0

        // _0_0_0_74_0_0_0_0_0_0_0

        // _0_0_0_74_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.574, 5.969);
        ((GeneralPath) shape).curveTo(15.574, 5.7339997, 15.4800005, 5.6169996, 15.2890005, 5.6169996);
        ((GeneralPath) shape).curveTo(15.098001, 5.6169996, 15.000001, 5.7339997, 15.000001, 5.969);
        ((GeneralPath) shape).curveTo(15.000001, 6.203, 15.098001, 6.3199997, 15.2890005, 6.3199997);
        ((GeneralPath) shape).curveTo(15.4800005, 6.3199997, 15.574, 6.2029996, 15.574, 5.969);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_74_0_0_0_0

        // _0_0_0_75

        // _0_0_0_75_0

        // _0_0_0_75_0_0

        // _0_0_0_75_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_75_0_0_0_0

        // _0_0_0_75_0_0_0_0_0

        // _0_0_0_75_0_0_0_0_0_0

        // _0_0_0_75_0_0_0_0_0_0_0

        // _0_0_0_75_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.742, 3.473);
        ((GeneralPath) shape).curveTo(17.742, 3.0900002, 17.594, 2.895, 17.297, 2.895);
        ((GeneralPath) shape).curveTo(17.02, 2.895, 16.879002, 3.09, 16.879002, 3.473);
        ((GeneralPath) shape).curveTo(16.879002, 3.879, 17.020002, 4.078, 17.297, 4.078);
        ((GeneralPath) shape).curveTo(17.594002, 4.078, 17.742, 3.8790002, 17.742, 3.473);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_75_0_0_0_0

        // _0_0_0_76

        // _0_0_0_76_0

        // _0_0_0_76_0_0

        // _0_0_0_76_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_76_0_0_0_0

        // _0_0_0_76_0_0_0_0_0

        // _0_0_0_76_0_0_0_0_0_0

        // _0_0_0_76_0_0_0_0_0_0_0

        // _0_0_0_76_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.727, 14.047);
        ((GeneralPath) shape).curveTo(11.727, 13.8359995, 11.652, 13.727, 11.504001, 13.727);
        ((GeneralPath) shape).curveTo(11.3550005, 13.727, 11.281001, 13.836, 11.281001, 14.047);
        ((GeneralPath) shape).curveTo(11.281001, 14.281, 11.355001, 14.398, 11.504001, 14.398);
        ((GeneralPath) shape).curveTo(11.652, 14.398, 11.727, 14.281, 11.727, 14.047);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_76_0_0_0_0

        // _0_0_0_77

        // _0_0_0_77_0

        // _0_0_0_77_0_0

        // _0_0_0_77_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_77_0_0_0_0

        // _0_0_0_77_0_0_0_0_0

        // _0_0_0_77_0_0_0_0_0_0

        // _0_0_0_77_0_0_0_0_0_0_0

        // _0_0_0_77_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.465, 6.512);
        ((GeneralPath) shape).curveTo(16.465, 6.34, 16.398, 6.258, 16.273, 6.258);
        ((GeneralPath) shape).curveTo(16.145, 6.258, 16.078001, 6.3399997, 16.078001, 6.512);
        ((GeneralPath) shape).curveTo(16.078001, 6.703, 16.145, 6.801, 16.273, 6.801);
        ((GeneralPath) shape).curveTo(16.398, 6.801, 16.465, 6.703, 16.465, 6.512);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_77_0_0_0_0

        // _0_0_0_78

        // _0_0_0_78_0

        // _0_0_0_78_0_0

        // _0_0_0_78_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.06432f));

        // _0_0_0_78_0_0_0_0

        // _0_0_0_78_0_0_0_0_0

        // _0_0_0_78_0_0_0_0_0_0

        // _0_0_0_78_0_0_0_0_0_0_0

        // _0_0_0_78_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.039, 11.594);
        ((GeneralPath) shape).curveTo(19.039, 11.398, 18.953, 11.305, 18.785, 11.305);
        ((GeneralPath) shape).curveTo(18.637, 11.305, 18.559, 11.398001, 18.559, 11.594);
        ((GeneralPath) shape).curveTo(18.559, 11.785, 18.637, 11.879, 18.785, 11.879);
        ((GeneralPath) shape).curveTo(18.953, 11.879, 19.039, 11.785, 19.039, 11.594);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_78_0_0_0_0

        // _0_0_0_79
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.359, 20.576);
        ((GeneralPath) shape).lineTo(12.352, 20.354);
        ((GeneralPath) shape).curveTo(12.566, 17.92, 12.77, 15.393, 12.961, 12.768);
        ((GeneralPath) shape).curveTo(13.367001, 7.522, 13.535001, 4.4279995, 13.473001, 3.4899998);
        ((GeneralPath) shape).curveTo(13.387, 1.8649998, 12.684001, 7.561, 11.359, 20.576);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_80
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.59, 20.576);
        ((GeneralPath) shape).curveTo(21.27, 19.873001, 19.242, 19.522, 16.512001, 19.522);
        ((GeneralPath) shape).curveTo(15.145001, 19.522, 13.887001, 19.626999, 12.734001, 19.838);
        ((GeneralPath) shape).curveTo(11.625001, 20.053, 10.805001, 20.33, 10.270001, 20.67);
        ((GeneralPath) shape).lineTo(12.445002, 2.8500004);
        ((GeneralPath) shape).lineTo(12.414001, 2.8150003);
        ((GeneralPath) shape).curveTo(12.414001, 2.4750004, 12.809002, 2.1860003, 13.5980015, 1.9510002);
        ((GeneralPath) shape).curveTo(14.387001, 1.7170002, 15.336001, 1.6000001, 16.445002, 1.6000001);
        ((GeneralPath) shape).curveTo(17.555002, 1.6000001, 18.496002, 1.7170001, 19.262001, 1.9510002);
        ((GeneralPath) shape).curveTo(20.051, 2.186, 20.445002, 2.4750001, 20.445002, 2.8150003);
        ((GeneralPath) shape).lineTo(20.414001, 2.8500004);
        ((GeneralPath) shape).lineTo(22.590002, 20.576);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(22.273, 21.6);
        ((GeneralPath) shape).curveTo(22.273, 22.006, 21.719, 22.334, 20.609001, 22.592001);
        ((GeneralPath) shape).curveTo(19.52, 22.869001, 18.188002, 23.006, 16.609001, 23.006);
        ((GeneralPath) shape).curveTo(15.031001, 23.006, 13.688002, 22.869001, 12.574001, 22.592001);
        ((GeneralPath) shape).curveTo(11.465001, 22.334002, 10.910002, 22.006, 10.910002, 21.6);
        ((GeneralPath) shape).curveTo(10.910002, 21.217001, 11.465002, 20.885, 12.574001, 20.608);
        ((GeneralPath) shape).curveTo(13.707002, 20.33, 15.051002, 20.192999, 16.609001, 20.192999);
        ((GeneralPath) shape).curveTo(18.164001, 20.192999, 19.500002, 20.329998, 20.609001, 20.608);
        ((GeneralPath) shape).curveTo(21.719002, 20.885, 22.273, 21.217, 22.273, 21.6);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(18.91, 23.326);
        ((GeneralPath) shape).lineTo(19.137, 23.326);
        ((GeneralPath) shape).lineTo(20.734, 23.041);
        ((GeneralPath) shape).lineTo(20.800999, 23.041);
        ((GeneralPath) shape).lineTo(21.245998, 22.912);
        ((GeneralPath) shape).lineTo(21.280998, 22.912);
        ((GeneralPath) shape).lineTo(21.729998, 22.752);
        ((GeneralPath) shape).curveTo(22.772997, 22.412, 23.308998, 22.006, 23.327997, 21.537);
        ((GeneralPath) shape).lineTo(23.358997, 21.537);
        ((GeneralPath) shape).lineTo(20.894997, 1.3770008);
        ((GeneralPath) shape).lineTo(20.894997, 1.3110008);
        ((GeneralPath) shape).curveTo(20.894997, 0.94700086, 20.468996, 0.63900083, 19.612997, 0.38500082);
        ((GeneralPath) shape).curveTo(18.761997, 0.12700084, 17.726997, 0.0020008385, 16.511997, 0.0020008385);
        ((GeneralPath) shape).curveTo(15.315997, 0.0020008385, 14.280997, 0.12700084, 13.405997, 0.38500082);
        ((GeneralPath) shape).curveTo(12.554997, 0.63900083, 12.128998, 0.9470008, 12.128998, 1.3110008);
        ((GeneralPath) shape).lineTo(12.159998, 1.3770008);
        ((GeneralPath) shape).lineTo(9.694998, 21.377);
        ((GeneralPath) shape).lineTo(9.663998, 21.502);
        ((GeneralPath) shape).lineTo(9.663998, 21.537);
        ((GeneralPath) shape).lineTo(9.694998, 21.537);
        ((GeneralPath) shape).curveTo(9.737998, 22.006, 10.272998, 22.412, 11.296998, 22.752);
        ((GeneralPath) shape).lineTo(11.296998, 22.783);
        ((GeneralPath) shape).lineTo(11.710998, 22.912);
        ((GeneralPath) shape).lineTo(11.776998, 22.912);
        ((GeneralPath) shape).lineTo(12.190997, 23.041);
        ((GeneralPath) shape).lineTo(12.288997, 23.041);
        ((GeneralPath) shape).lineTo(13.854997, 23.326);
        ((GeneralPath) shape).lineTo(14.144997, 23.326);
        ((GeneralPath) shape).lineTo(14.495996, 23.393);
        ((GeneralPath) shape).lineTo(18.526997, 23.393);
        ((GeneralPath) shape).lineTo(18.909996, 23.326);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCF6FF));
        g.fill(shape);

        // _0_0_0_81
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.191, 2.401);
        ((GeneralPath) shape).curveTo(20.512, 1.994, 20.457, 1.6110001, 20.031, 1.248);
        ((GeneralPath) shape).curveTo(19.539, 0.842, 18.688, 0.60800004, 17.473, 0.545);
        ((GeneralPath) shape).curveTo(15.082, 0.416, 13.577999, 0.68200004, 12.9609995, 1.346);
        ((GeneralPath) shape).curveTo(12.832, 1.5139999, 12.7699995, 1.686, 12.7699995, 1.858);
        ((GeneralPath) shape).curveTo(12.789, 2.006, 12.844, 2.1230001, 12.929999, 2.209);
        ((GeneralPath) shape).curveTo(13.632999, 1.8030001, 14.804999, 1.6000001, 16.449, 1.6000001);
        ((GeneralPath) shape).curveTo(18.305, 1.6000001, 19.550999, 1.8650001, 20.191, 2.401);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_82
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.895, 1.311);
        ((GeneralPath) shape).curveTo(20.895, 0.947, 20.469, 0.639, 19.613, 0.385);
        ((GeneralPath) shape).curveTo(18.762001, 0.127, 17.727001, 0.002000004, 16.512001, 0.002000004);
        ((GeneralPath) shape).curveTo(15.445001, 0.002000004, 14.516001, 0.108, 13.727001, 0.322);
        ((GeneralPath) shape).curveTo(12.980001, 0.514, 12.469001, 0.76, 12.191001, 1.057);
        ((GeneralPath) shape).curveTo(12.426001, 0.822, 12.949001, 0.60800004, 13.758001, 0.41600007);
        ((GeneralPath) shape).curveTo(15.957001, -0.032999933, 17.973001, 0.076000065, 19.809002, 0.73600006);
        ((GeneralPath) shape).curveTo(20.148003, 0.84200007, 20.414001, 0.95900005, 20.605001, 1.088);
        ((GeneralPath) shape).curveTo(20.758001, 1.217, 20.852001, 1.3030001, 20.895002, 1.342);
        ((GeneralPath) shape).lineTo(20.895002, 1.311);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8BC3CF));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

