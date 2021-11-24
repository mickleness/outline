package com.pump.awt.geom.outline.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import static java.awt.Color.BLACK;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/208720/alpine-landscape-exit-sign-01a-newxptutorialgroddle
 * </p>
 */
public class ExitSign implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public ExitSign() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public ExitSign(int width, int height) {
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
        g.transform(new AffineTransform(0.0076005165f, 0, 0, 0.0076005165f, 0, 0.09204229f));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, 0, 107.35f));

        // _0_0

        // _0_0_0

        // _0_0_0_0

        // _0_0_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.79456f, -0.09312f, 0.01256f, 0.16944f, -5.8463f, 6.8742f));

        // _0_0_0_0_0_0

        // _0_0_0_0_0_0_0

        // _0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.762, 28.051);
        ((GeneralPath) shape).curveTo(21.375, 28.289001, 32.121, 27.332, 45.0, 25.168001);
        ((GeneralPath) shape).curveTo(60.628998, 22.555, 74.293, 19.145, 86.0, 14.930001);
        ((GeneralPath) shape).curveTo(97.949, 10.637001, 103.7, 6.957001, 103.24, 3.8910017);
        ((GeneralPath) shape).curveTo(102.79, 0.9020016, 96.440994, -0.3629985, 84.202995, 0.09000158);
        ((GeneralPath) shape).curveTo(72.227, 0.5700016, 58.628998, 2.5040016, 43.401997, 5.8910017);
        ((GeneralPath) shape).curveTo(30.761997, 8.715002, 20.308996, 11.875002, 12.042997, 15.367002);
        ((GeneralPath) shape).curveTo(3.9339972, 18.809002, -0.07800293, 21.715002, -2.861023E-6, 24.09);
        ((GeneralPath) shape).curveTo(0.10899714, 26.488, 4.3589973, 27.809, 12.761997, 28.051);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(71.0510025024414, 81.6259994506836), 63.795f, new Point2D.Double(71.0510025024414, 81.6259994506836), new float[]{0, 1}, new Color[]{BLACK, BLACK}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_0_0_0

        // _0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.402, 16.93);
        ((GeneralPath) shape).curveTo(35.613, 16.852001, 36.055, 16.852001, 36.723, 16.93);
        ((GeneralPath) shape).curveTo(36.695, 17.25, 36.453, 17.516, 36.0, 17.731);
        ((GeneralPath) shape).curveTo(36.348, 17.703001, 36.895, 17.703001, 37.641, 17.731);
        ((GeneralPath) shape).curveTo(37.801, 17.703001, 38.016, 17.625, 38.281, 17.488);
        ((GeneralPath) shape).curveTo(38.546997, 17.356, 38.761997, 17.289001, 38.921997, 17.289001);
        ((GeneralPath) shape).curveTo(38.999996, 16.703001, 39.016, 16.305002, 38.961, 16.090002);
        ((GeneralPath) shape).curveTo(38.883, 15.875002, 38.695, 15.691002, 38.402, 15.531002);
        ((GeneralPath) shape).curveTo(38.055, 15.344002, 37.828, 15.199002, 37.723, 15.090002);
        ((GeneralPath) shape).curveTo(37.535, 14.902002, 37.387, 14.543002, 37.281, 14.012002);
        ((GeneralPath) shape).curveTo(37.203, 13.582002, 36.948997, 13.289002, 36.519997, 13.129002);
        ((GeneralPath) shape).curveTo(36.253998, 12.996001, 35.827995, 12.891002, 35.241997, 12.809002);
        ((GeneralPath) shape).curveTo(34.656, 12.731002, 34.226997, 12.625002, 33.961, 12.488002);
        ((GeneralPath) shape).curveTo(33.508, 12.2230015, 33.253998, 12.078002, 33.203, 12.051002);
        ((GeneralPath) shape).curveTo(32.988, 11.969002, 32.695, 11.930001, 32.32, 11.930001);
        ((GeneralPath) shape).lineTo(31.203, 11.891002);
        ((GeneralPath) shape).lineTo(31.48, 12.129002);
        ((GeneralPath) shape).lineTo(27.359, 12.090002);
        ((GeneralPath) shape).curveTo(26.668, 12.090002, 26.254, 12.106002, 26.120998, 12.129002);
        ((GeneralPath) shape).curveTo(25.772999, 12.211001, 25.425999, 12.438002, 25.081999, 12.813002);
        ((GeneralPath) shape).curveTo(24.762, 13.129002, 24.519999, 13.383001, 24.359, 13.570002);
        ((GeneralPath) shape).curveTo(24.066, 13.918001, 23.934, 14.2230015, 23.960999, 14.488002);
        ((GeneralPath) shape).curveTo(24.468998, 14.570002, 25.293, 14.582002, 26.440998, 14.531002);
        ((GeneralPath) shape).curveTo(27.425999, 14.582002, 28.136997, 14.902002, 28.561998, 15.488002);
        ((GeneralPath) shape).lineTo(31.960999, 17.691002);
        ((GeneralPath) shape).curveTo(33.055, 17.797003, 33.921997, 17.731003, 34.562, 17.488003);
        ((GeneralPath) shape).curveTo(34.75, 17.383003, 35.027, 17.199003, 35.402, 16.930002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x26000000, true));
        g.fill(shape);

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.762, 16.371);
        ((GeneralPath) shape).curveTo(21.655998, 16.719, 21.387, 17.012001, 20.960999, 17.25);
        ((GeneralPath) shape).curveTo(21.655998, 17.543, 22.187998, 17.691, 22.561998, 17.691);
        ((GeneralPath) shape).lineTo(24.359, 17.891);
        ((GeneralPath) shape).curveTo(24.414, 17.570002, 24.241999, 17.316, 23.84, 17.129002);
        ((GeneralPath) shape).curveTo(23.309, 16.891, 23.0, 16.731, 22.922, 16.648);
        ((GeneralPath) shape).curveTo(22.816, 16.488, 22.75, 16.289001, 22.723001, 16.051);
        ((GeneralPath) shape).lineTo(22.723001, 15.332001);
        ((GeneralPath) shape).curveTo(22.270002, 15.223001, 21.988, 15.2890005, 21.883001, 15.531001);
        ((GeneralPath) shape).curveTo(21.855001, 15.875001, 21.816002, 16.156002, 21.762001, 16.371);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.961, 18.691);
        ((GeneralPath) shape).curveTo(27.789, 18.664, 28.773, 18.543, 29.922, 18.332);
        ((GeneralPath) shape).curveTo(30.586, 18.199001, 31.574001, 17.996, 32.883, 17.731);
        ((GeneralPath) shape).lineTo(34.801, 17.488);
        ((GeneralPath) shape).curveTo(36.136997, 17.305, 36.866997, 17.117, 37.0, 16.93);
        ((GeneralPath) shape).curveTo(37.266, 16.531, 37.254, 15.996, 36.961, 15.332001);
        ((GeneralPath) shape).curveTo(36.586, 14.504001, 35.601997, 13.852001, 34.0, 13.371);
        ((GeneralPath) shape).curveTo(33.414, 13.211, 32.762, 13.145, 32.043, 13.172);
        ((GeneralPath) shape).curveTo(31.188, 13.223, 30.519999, 13.276999, 30.043, 13.332);
        ((GeneralPath) shape).curveTo(29.188, 13.332, 28.574, 13.356, 28.203, 13.41);
        ((GeneralPath) shape).curveTo(27.265999, 13.543, 27.054998, 13.8359995, 27.561998, 14.289);
        ((GeneralPath) shape).lineTo(26.960999, 18.691);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.762, 13.891);
        ((GeneralPath) shape).lineTo(32.961, 19.09);
        ((GeneralPath) shape).curveTo(33.573997, 18.824, 34.812, 18.305, 36.68, 17.531);
        ((GeneralPath) shape).curveTo(38.121002, 16.703001, 38.48, 15.676001, 37.762, 14.449);
        ((GeneralPath) shape).curveTo(37.332, 13.809, 36.414, 13.371, 35.0, 13.129001);
        ((GeneralPath) shape).curveTo(34.094, 12.969001, 32.934, 12.918, 31.52, 12.969001);
        ((GeneralPath) shape).curveTo(29.602001, 12.996001, 28.68, 13.305001, 28.762001, 13.891001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(67.082, 3.371);
        ((GeneralPath) shape).curveTo(66.121, 3.5310001, 65.375, 3.676, 64.840004, 3.813);
        ((GeneralPath) shape).curveTo(63.855003, 4.023, 63.176003, 4.316, 62.801003, 4.691);
        ((GeneralPath) shape).curveTo(63.176003, 4.797, 63.773003, 4.797, 64.602005, 4.691);
        ((GeneralPath) shape).curveTo(65.562004, 4.559, 66.203, 4.504, 66.520004, 4.531);
        ((GeneralPath) shape).curveTo(66.520004, 4.691, 66.547005, 4.813, 66.602005, 4.8910003);
        ((GeneralPath) shape).curveTo(66.949005, 4.945, 67.35901, 4.984, 67.840004, 5.012);
        ((GeneralPath) shape).curveTo(68.137, 5.117, 68.227005, 5.477, 68.121, 6.09);
        ((GeneralPath) shape).curveTo(67.801, 6.145, 67.242004, 6.156, 66.441, 6.1330004);
        ((GeneralPath) shape).curveTo(65.75, 6.1060004, 65.203, 6.1450005, 64.801, 6.2500005);
        ((GeneralPath) shape).curveTo(64.215004, 6.4380007, 63.652004, 6.7420006, 63.121002, 7.1720004);
        ((GeneralPath) shape).curveTo(62.480003, 7.7580004, 62.359, 8.266001, 62.762, 8.691);
        ((GeneralPath) shape).lineTo(68.359, 9.488);
        ((GeneralPath) shape).curveTo(68.68, 9.543, 69.441, 9.383, 70.641, 9.012);
        ((GeneralPath) shape).curveTo(71.68, 8.6640005, 72.426, 8.637, 72.882996, 8.93);
        ((GeneralPath) shape).curveTo(73.574, 9.328, 73.547, 9.848001, 72.800995, 10.488);
        ((GeneralPath) shape).curveTo(73.413994, 10.621, 74.10899, 10.449, 74.882996, 9.969);
        ((GeneralPath) shape).curveTo(75.227, 9.754, 75.42999, 9.531, 75.479996, 9.289);
        ((GeneralPath) shape).curveTo(75.507996, 9.2109995, 75.534996, 8.891, 75.562, 8.327999);
        ((GeneralPath) shape).curveTo(75.562, 7.6879992, 75.468994, 7.144999, 75.281, 6.6879992);
        ((GeneralPath) shape).curveTo(75.120995, 6.315999, 74.909996, 6.0349994, 74.641, 5.847999);
        ((GeneralPath) shape).curveTo(74.479996, 5.714999, 74.159996, 5.5429993, 73.68, 5.327999);
        ((GeneralPath) shape).lineTo(69.723, 3.4099991);
        ((GeneralPath) shape).curveTo(69.32, 3.1949992, 68.879, 3.101999, 68.402, 3.1289992);
        ((GeneralPath) shape).curveTo(68.109, 3.1289992, 67.668, 3.2109993, 67.082, 3.3709993);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(72.961, 7.488);
        ((GeneralPath) shape).lineTo(73.961, 7.691);
        ((GeneralPath) shape).curveTo(73.961, 5.691, 73.215, 4.637, 71.723, 4.531);
        ((GeneralPath) shape).curveTo(70.387, 4.3980002, 69.453, 4.3440003, 68.922, 4.3710003);
        ((GeneralPath) shape).curveTo(67.507996, 4.3980002, 66.854996, 4.703, 66.961, 5.2890005);
        ((GeneralPath) shape).curveTo(67.359, 5.3160005, 68.641, 5.3980007, 70.800995, 5.5310006);
        ((GeneralPath) shape).curveTo(72.69499, 5.824001, 73.413994, 6.4770007, 72.961, 7.488001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(61.961, 10.09);
        ((GeneralPath) shape).lineTo(63.562, 8.2890005);
        ((GeneralPath) shape).curveTo(63.293, 8.316001, 63.109, 8.266001, 63.0, 8.129001);
        ((GeneralPath) shape).curveTo(62.922, 7.8910007, 62.828, 7.6910005, 62.723, 7.5310006);
        ((GeneralPath) shape).curveTo(62.453, 7.1060004, 62.215, 6.8130007, 62.0, 6.6480007);
        ((GeneralPath) shape).curveTo(61.762, 6.4380007, 61.402, 6.2660007, 60.922, 6.1290007);
        ((GeneralPath) shape).curveTo(60.281002, 5.9450006, 59.535, 5.8360004, 58.68, 5.8130007);
        ((GeneralPath) shape).curveTo(57.641, 5.758001, 56.922, 5.8520007, 56.52, 6.0900006);
        ((GeneralPath) shape).curveTo(57.027, 6.4920006, 58.348, 7.2890005, 60.48, 8.492001);
        ((GeneralPath) shape).curveTo(59.98, 8.543, 58.973, 8.543, 57.461, 8.492001);
        ((GeneralPath) shape).curveTo(58.386997, 8.551001, 59.363, 8.875001, 60.402, 9.449);
        ((GeneralPath) shape).curveTo(60.535, 9.531, 60.773, 9.703, 61.121002, 9.969);
        ((GeneralPath) shape).curveTo(61.469, 10.184, 61.750004, 10.223, 61.961002, 10.09);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(62.16, 6.488);
        ((GeneralPath) shape).lineTo(63.562, 6.891);
        ((GeneralPath) shape).curveTo(63.348, 6.4649997, 63.082, 6.1169996, 62.762, 5.8519998);
        ((GeneralPath) shape).curveTo(62.336002, 5.4769998, 61.949, 5.371, 61.602, 5.5309997);
        ((GeneralPath) shape).curveTo(61.84, 5.93, 62.027, 6.2499995, 62.16, 6.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.16, 46.531);
        ((GeneralPath) shape).lineTo(25.16, 46.968998);
        ((GeneralPath) shape).curveTo(25.32, 47.288998, 25.496, 47.476997, 25.68, 47.531);
        ((GeneralPath) shape).curveTo(25.789, 47.559, 25.867, 47.559, 25.922, 47.531);
        ((GeneralPath) shape).lineTo(31.84, 45.57);
        ((GeneralPath) shape).curveTo(32.934002, 45.223, 33.961, 45.012, 34.922, 44.93);
        ((GeneralPath) shape).curveTo(34.574, 44.609, 34.055, 44.316, 33.359, 44.051);
        ((GeneralPath) shape).curveTo(31.977001, 43.516, 30.426, 43.356, 28.723001, 43.57);
        ((GeneralPath) shape).curveTo(27.387001, 43.731, 26.414001, 44.172, 25.801003, 44.891);
        ((GeneralPath) shape).curveTo(25.402002, 45.343998, 25.188002, 45.891, 25.160002, 46.531);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x806646));
        g.fill(shape);

        // _0_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.121, 45.77);
        ((GeneralPath) shape).lineTo(25.16, 46.531002);
        ((GeneralPath) shape).curveTo(25.188, 45.891003, 25.402, 45.344, 25.801, 44.891003);
        ((GeneralPath) shape).curveTo(26.414001, 44.172, 27.387001, 43.731003, 28.723, 43.570004);
        ((GeneralPath) shape).curveTo(30.425999, 43.356003, 31.977, 43.516003, 33.359, 44.051003);
        ((GeneralPath) shape).curveTo(34.055, 44.316, 34.574, 44.609, 34.922, 44.930004);
        ((GeneralPath) shape).lineTo(35.402, 42.012005);
        ((GeneralPath) shape).curveTo(35.027, 41.957005, 34.656002, 41.758003, 34.281002, 41.410004);
        ((GeneralPath) shape).curveTo(33.508003, 40.742004, 33.094, 39.664005, 33.043003, 38.172005);
        ((GeneralPath) shape).curveTo(32.961002, 35.797005, 33.656002, 31.996004, 35.121002, 26.770004);
        ((GeneralPath) shape).curveTo(35.148003, 19.676004, 35.148003, 15.731005, 35.121002, 14.930004);
        ((GeneralPath) shape).lineTo(35.121002, 14.731004);
        ((GeneralPath) shape).curveTo(34.188004, 13.637004, 32.496002, 13.117003, 30.043003, 13.172004);
        ((GeneralPath) shape).curveTo(28.977003, 13.199004, 28.000004, 13.488004, 27.121002, 14.051003);
        ((GeneralPath) shape).curveTo(26.453003, 14.477003, 25.695002, 15.156004, 24.840002, 16.090004);
        ((GeneralPath) shape).curveTo(25.137003, 26.758003, 25.227001, 33.199005, 25.121002, 35.410004);
        ((GeneralPath) shape).curveTo(25.043003, 36.930004, 25.043003, 40.383003, 25.121002, 45.770004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A4934));
        g.fill(shape);

        // _0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.121, 43.691);
        ((GeneralPath) shape).curveTo(32.253998, 43.238003, 32.348, 42.516003, 32.401997, 41.531002);
        ((GeneralPath) shape).lineTo(32.519997, 26.172);
        ((GeneralPath) shape).curveTo(32.496, 26.488, 32.452995, 27.836, 32.401997, 30.211);
        ((GeneralPath) shape).curveTo(32.378998, 32.305, 32.378998, 33.606, 32.401997, 34.109);
        ((GeneralPath) shape).curveTo(32.319996, 32.926003, 32.281, 29.93, 32.281, 25.129002);
        ((GeneralPath) shape).curveTo(32.281, 20.012001, 32.253998, 16.969002, 32.203, 16.012001);
        ((GeneralPath) shape).lineTo(32.043, 13.250001);
        ((GeneralPath) shape).lineTo(31.281, 13.211001);
        ((GeneralPath) shape).curveTo(31.629, 14.758001, 31.801, 16.051, 31.801, 17.090002);
        ((GeneralPath) shape).curveTo(31.883001, 22.742002, 31.883001, 28.449001, 31.801, 34.211002);
        ((GeneralPath) shape).curveTo(31.801, 36.559002, 31.789001, 37.863003, 31.762001, 38.129);
        ((GeneralPath) shape).curveTo(31.414001, 36.824, 31.242, 35.172, 31.242, 33.172);
        ((GeneralPath) shape).lineTo(31.203001, 34.691);
        ((GeneralPath) shape).curveTo(31.203001, 35.863003, 31.188002, 36.77, 31.160002, 37.410004);
        ((GeneralPath) shape).curveTo(31.133001, 38.531002, 31.027002, 39.438004, 30.840002, 40.129005);
        ((GeneralPath) shape).curveTo(30.336002, 41.598007, 29.988003, 42.715004, 29.801003, 43.488007);
        ((GeneralPath) shape).lineTo(30.281002, 43.488007);
        ((GeneralPath) shape).curveTo(30.574001, 42.848007, 30.816002, 42.238007, 31.000002, 41.648006);
        ((GeneralPath) shape).curveTo(31.082003, 40.262005, 31.137001, 39.516006, 31.160002, 39.410007);
        ((GeneralPath) shape).lineTo(31.203001, 40.930008);
        ((GeneralPath) shape).curveTo(31.352001, 40.33201, 31.43, 39.715008, 31.441002, 39.090008);
        ((GeneralPath) shape).curveTo(31.445002, 39.703007, 31.473001, 41.20701, 31.520002, 43.60901);
        ((GeneralPath) shape).lineTo(32.121002, 43.69101);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4E3F2D));
        g.fill(shape);

        // _0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.84, 23.609);
        ((GeneralPath) shape).lineTo(32.562, 25.93);
        ((GeneralPath) shape).lineTo(32.762, 33.41);
        ((GeneralPath) shape).curveTo(32.84, 33.356, 32.883, 31.824, 32.883, 28.813);
        ((GeneralPath) shape).curveTo(32.883, 27.289, 32.867, 25.758, 32.84, 24.210999);
        ((GeneralPath) shape).lineTo(32.84, 23.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.422, 30.648);
        ((GeneralPath) shape).lineTo(28.52, 25.25);
        ((GeneralPath) shape).curveTo(28.52, 23.277, 28.547, 22.012001, 28.602001, 21.449);
        ((GeneralPath) shape).lineTo(28.641, 22.129);
        ((GeneralPath) shape).lineTo(28.68, 16.210999);
        ((GeneralPath) shape).lineTo(28.602001, 15.331999);
        ((GeneralPath) shape).curveTo(28.602001, 18.554998, 28.574001, 20.503998, 28.52, 21.171999);
        ((GeneralPath) shape).lineTo(28.359001, 13.448999);
        ((GeneralPath) shape).lineTo(28.203001, 13.530999);
        ((GeneralPath) shape).lineTo(28.281, 15.57);
        ((GeneralPath) shape).curveTo(28.348, 17.609, 28.395, 22.637, 28.422, 30.647999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.84, 13.648);
        ((GeneralPath) shape).curveTo(27.867, 14.101999, 27.84, 14.929999, 27.762001, 16.129);
        ((GeneralPath) shape).lineTo(27.801, 16.171999);
        ((GeneralPath) shape).curveTo(27.801, 15.448999, 27.895, 14.581999, 28.082, 13.569999);
        ((GeneralPath) shape).lineTo(27.84, 13.647999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.723, 43.77);
        ((GeneralPath) shape).lineTo(27.68, 43.648);
        ((GeneralPath) shape).lineTo(27.723, 42.128998);
        ((GeneralPath) shape).lineTo(27.52, 43.809);
        ((GeneralPath) shape).lineTo(27.723, 43.769997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.84, 42.809);
        ((GeneralPath) shape).lineTo(32.922, 36.171997);
        ((GeneralPath) shape).curveTo(32.949, 35.769997, 33.055, 35.144997, 33.242, 34.288998);
        ((GeneralPath) shape).curveTo(33.27, 34.078, 33.348, 32.758, 33.48, 30.331997);
        ((GeneralPath) shape).curveTo(33.586, 27.929996, 33.668, 26.608997, 33.723, 26.370996);
        ((GeneralPath) shape).curveTo(33.773, 26.077997, 33.801, 25.183996, 33.801, 23.690996);
        ((GeneralPath) shape).lineTo(33.641, 25.647997);
        ((GeneralPath) shape).curveTo(33.508, 25.249996, 33.453, 24.608997, 33.48, 23.730997);
        ((GeneralPath) shape).curveTo(33.508, 23.249996, 33.535, 22.581997, 33.562, 21.730997);
        ((GeneralPath) shape).lineTo(33.602, 13.647997);
        ((GeneralPath) shape).lineTo(33.203003, 13.530997);
        ((GeneralPath) shape).lineTo(33.043003, 15.730997);
        ((GeneralPath) shape).curveTo(33.043003, 19.222998, 33.016003, 21.355997, 32.961002, 22.128998);
        ((GeneralPath) shape).lineTo(32.840004, 24.210999);
        ((GeneralPath) shape).curveTo(32.867004, 25.758, 32.883003, 27.288998, 32.883003, 28.808998);
        ((GeneralPath) shape).curveTo(32.883003, 31.823997, 32.840004, 33.356, 32.762005, 33.409996);
        ((GeneralPath) shape).lineTo(32.562004, 25.929996);
        ((GeneralPath) shape).lineTo(32.520004, 26.171997);
        ((GeneralPath) shape).lineTo(32.402004, 41.531);
        ((GeneralPath) shape).curveTo(32.348003, 42.516, 32.254005, 43.238, 32.121006, 43.690998);
        ((GeneralPath) shape).lineTo(32.883007, 43.891);
        ((GeneralPath) shape).curveTo(32.828007, 43.41, 32.816006, 43.051, 32.840008, 42.809);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.922, 36.172);
        ((GeneralPath) shape).lineTo(32.84, 42.809002);
        ((GeneralPath) shape).curveTo(32.816, 43.051003, 32.828, 43.410004, 32.883, 43.891003);
        ((GeneralPath) shape).lineTo(33.121, 43.969);
        ((GeneralPath) shape).curveTo(33.413998, 43.063004, 33.535, 41.836002, 33.48, 40.289);
        ((GeneralPath) shape).curveTo(33.215, 39.703003, 33.065998, 38.996002, 33.043, 38.172);
        ((GeneralPath) shape).curveTo(33.043, 37.555, 33.082, 37.012, 33.16, 36.531002);
        ((GeneralPath) shape).curveTo(33.16, 36.211002, 33.266, 35.758003, 33.48, 35.172);
        ((GeneralPath) shape).curveTo(33.586, 34.852, 33.746, 34.199, 33.961, 33.211002);
        ((GeneralPath) shape).lineTo(34.0, 26.090002);
        ((GeneralPath) shape).curveTo(33.949, 23.797003, 33.961, 20.891003, 34.043, 17.371002);
        ((GeneralPath) shape).lineTo(34.121, 13.930002);
        ((GeneralPath) shape).lineTo(33.601997, 13.648003);
        ((GeneralPath) shape).lineTo(33.561996, 21.731003);
        ((GeneralPath) shape).curveTo(33.534996, 22.582003, 33.507996, 23.250004, 33.479996, 23.731003);
        ((GeneralPath) shape).curveTo(33.452995, 24.609003, 33.507996, 25.250004, 33.640995, 25.648003);
        ((GeneralPath) shape).lineTo(33.800995, 23.691002);
        ((GeneralPath) shape).curveTo(33.800995, 25.184002, 33.772995, 26.078003, 33.722996, 26.371002);
        ((GeneralPath) shape).curveTo(33.667995, 26.609003, 33.585995, 27.930002, 33.479996, 30.332003);
        ((GeneralPath) shape).curveTo(33.347996, 32.758003, 33.265995, 34.078003, 33.241997, 34.289);
        ((GeneralPath) shape).curveTo(33.054996, 35.145, 32.948997, 35.77, 32.921997, 36.172);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3B3022));
        g.fill(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.402, 34.109);
        ((GeneralPath) shape).curveTo(32.379, 33.602, 32.379, 32.305, 32.402, 30.211);
        ((GeneralPath) shape).curveTo(32.453, 27.836, 32.496002, 26.488, 32.52, 26.168);
        ((GeneralPath) shape).lineTo(32.961002, 22.129);
        ((GeneralPath) shape).curveTo(33.016003, 21.355999, 33.043003, 19.223, 33.043003, 15.731);
        ((GeneralPath) shape).lineTo(33.203003, 13.531);
        ((GeneralPath) shape).lineTo(32.922005, 13.449);
        ((GeneralPath) shape).lineTo(32.641006, 20.57);
        ((GeneralPath) shape).curveTo(32.590008, 19.555, 32.535007, 17.145, 32.480007, 13.332);
        ((GeneralPath) shape).lineTo(32.043007, 13.25);
        ((GeneralPath) shape).lineTo(32.203007, 16.012001);
        ((GeneralPath) shape).curveTo(32.254005, 16.969002, 32.281006, 20.012001, 32.281006, 25.129002);
        ((GeneralPath) shape).curveTo(32.281006, 29.930002, 32.320007, 32.922, 32.402004, 34.109);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.961, 42.09);
        ((GeneralPath) shape).lineTo(31.0, 41.648);
        ((GeneralPath) shape).curveTo(30.816, 42.238, 30.574, 42.851997, 30.281, 43.488);
        ((GeneralPath) shape).lineTo(30.641, 43.488);
        ((GeneralPath) shape).curveTo(30.695002, 43.171997, 30.801, 42.703, 30.961, 42.09);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.203, 40.93);
        ((GeneralPath) shape).lineTo(31.32, 43.57);
        ((GeneralPath) shape).lineTo(31.52, 43.609);
        ((GeneralPath) shape).curveTo(31.473, 41.207, 31.445, 39.703003, 31.441, 39.09);
        ((GeneralPath) shape).curveTo(31.43, 39.715, 31.352, 40.332, 31.203, 40.93);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.883, 40.852);
        ((GeneralPath) shape).curveTo(27.934, 40.93, 28.015999, 41.398003, 28.121, 42.25);
        ((GeneralPath) shape).lineTo(28.281, 43.648);
        ((GeneralPath) shape).lineTo(28.359, 43.608997);
        ((GeneralPath) shape).lineTo(28.241999, 42.051);
        ((GeneralPath) shape).curveTo(28.241999, 41.940998, 28.214998, 41.516, 28.159998, 40.77);
        ((GeneralPath) shape).curveTo(28.108997, 40.023, 28.054998, 39.531002, 27.999998, 39.289);
        ((GeneralPath) shape).lineTo(27.921999, 39.129);
        ((GeneralPath) shape).lineTo(27.883, 40.852);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.402, 13.449);
        ((GeneralPath) shape).lineTo(28.359001, 13.449);
        ((GeneralPath) shape).lineTo(28.52, 21.168);
        ((GeneralPath) shape).curveTo(28.574001, 20.504, 28.602001, 18.555, 28.602001, 15.327999);
        ((GeneralPath) shape).lineTo(28.402, 13.448999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.84, 13.648);
        ((GeneralPath) shape).lineTo(27.32, 13.929999);
        ((GeneralPath) shape).lineTo(27.723, 16.609);
        ((GeneralPath) shape).lineTo(27.762, 16.129);
        ((GeneralPath) shape).curveTo(27.839998, 14.929999, 27.866999, 14.106, 27.839998, 13.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.883, 17.57);
        ((GeneralPath) shape).lineTo(26.16, 23.449);
        ((GeneralPath) shape).curveTo(26.16, 19.719, 26.121, 16.956999, 26.043, 15.171999);
        ((GeneralPath) shape).lineTo(26.043, 14.890999);
        ((GeneralPath) shape).lineTo(25.960999, 14.929998);
        ((GeneralPath) shape).lineTo(25.883, 17.050999);
        ((GeneralPath) shape).lineTo(25.800999, 16.647999);
        ((GeneralPath) shape).lineTo(25.883, 17.57);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.762, 13.211);
        ((GeneralPath) shape).lineTo(30.561998, 22.289001);
        ((GeneralPath) shape).lineTo(30.359, 15.211001);
        ((GeneralPath) shape).lineTo(29.921999, 13.172001);
        ((GeneralPath) shape).lineTo(29.762, 13.211);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.922, 13.449);
        ((GeneralPath) shape).lineTo(32.48, 13.332001);
        ((GeneralPath) shape).curveTo(32.535, 17.145, 32.586, 19.555, 32.641, 20.57);
        ((GeneralPath) shape).lineTo(32.921997, 13.448999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x281F16));
        g.fill(shape);

        // _0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.48, 40.289);
        ((GeneralPath) shape).curveTo(33.535, 41.836002, 33.413998, 43.063, 33.121, 43.969);
        ((GeneralPath) shape).curveTo(33.921997, 44.238003, 34.519997, 44.555, 34.921997, 44.93);
        ((GeneralPath) shape).lineTo(35.401997, 42.012);
        ((GeneralPath) shape).curveTo(35.187996, 41.984, 34.948997, 41.891003, 34.679996, 41.731003);
        ((GeneralPath) shape).curveTo(34.175995, 41.410004, 33.772995, 40.930004, 33.479996, 40.289);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.961, 33.211);
        ((GeneralPath) shape).curveTo(33.988, 33.078, 34.108997, 31.637, 34.32, 28.890999);
        ((GeneralPath) shape).curveTo(34.535, 26.438, 34.723, 25.171999, 34.883, 25.089998);
        ((GeneralPath) shape).lineTo(35.121, 24.968998);
        ((GeneralPath) shape).curveTo(35.203, 20.038998, 35.203, 16.690998, 35.121, 14.929998);
        ((GeneralPath) shape).lineTo(35.121, 14.730998);
        ((GeneralPath) shape).curveTo(34.906, 14.437998, 34.573997, 14.171998, 34.121, 13.929998);
        ((GeneralPath) shape).lineTo(34.043, 17.370998);
        ((GeneralPath) shape).curveTo(33.961, 20.890999, 33.948997, 23.796999, 34.0, 26.089998);
        ((GeneralPath) shape).lineTo(33.961, 33.211);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.32, 43.57);
        ((GeneralPath) shape).lineTo(31.16, 39.41);
        ((GeneralPath) shape).curveTo(31.133, 39.516, 31.082, 40.262, 31.0, 41.648);
        ((GeneralPath) shape).lineTo(30.961, 42.09);
        ((GeneralPath) shape).curveTo(30.801, 42.703, 30.695, 43.172, 30.641, 43.488);
        ((GeneralPath) shape).lineTo(31.320002, 43.57);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.68, 16.211);
        ((GeneralPath) shape).lineTo(28.641, 13.371);
        ((GeneralPath) shape).lineTo(28.402, 13.449);
        ((GeneralPath) shape).lineTo(28.68, 16.211);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.762, 40.731);
        ((GeneralPath) shape).lineTo(27.679998, 43.648);
        ((GeneralPath) shape).lineTo(27.722998, 43.77);
        ((GeneralPath) shape).lineTo(28.280998, 43.648);
        ((GeneralPath) shape).lineTo(28.120998, 42.25);
        ((GeneralPath) shape).curveTo(28.015999, 41.398, 27.933998, 40.93, 27.882998, 40.852);
        ((GeneralPath) shape).lineTo(27.761997, 40.731003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.121, 26.77);
        ((GeneralPath) shape).lineTo(35.121, 24.969);
        ((GeneralPath) shape).lineTo(34.883, 25.09);
        ((GeneralPath) shape).curveTo(34.723, 25.172, 34.535, 26.438, 34.32, 28.891);
        ((GeneralPath) shape).curveTo(34.227, 30.109001, 34.152, 31.07, 34.102, 31.77);
        ((GeneralPath) shape).curveTo(33.773003, 33.379, 33.52, 34.656002, 33.34, 35.609);
        ((GeneralPath) shape).curveTo(33.375, 35.477, 33.422, 35.328003, 33.48, 35.172);
        ((GeneralPath) shape).curveTo(33.586, 34.852, 33.746, 34.199, 33.961, 33.211002);
        ((GeneralPath) shape).curveTo(33.976997, 33.137, 34.023, 32.656002, 34.101997, 31.770002);
        ((GeneralPath) shape).curveTo(34.382996, 30.356003, 34.722996, 28.691002, 35.121, 26.770002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.562, 45.051);
        ((GeneralPath) shape).lineTo(25.52, 45.25);
        ((GeneralPath) shape).curveTo(25.707, 44.984, 25.895, 44.77, 26.082, 44.609);
        ((GeneralPath) shape).lineTo(26.082, 40.172);
        ((GeneralPath) shape).curveTo(26.082, 39.77, 26.066, 39.117, 26.043001, 38.211002);
        ((GeneralPath) shape).curveTo(26.016, 37.356003, 26.027, 36.703003, 26.082, 36.250004);
        ((GeneralPath) shape).curveTo(26.246, 37.047005, 26.371, 37.973003, 26.461, 39.031002);
        ((GeneralPath) shape).curveTo(26.426, 38.523003, 26.383001, 37.852, 26.32, 37.012);
        ((GeneralPath) shape).curveTo(26.75, 40.078003, 27.015999, 42.398003, 27.121, 43.973);
        ((GeneralPath) shape).lineTo(27.16, 43.934);
        ((GeneralPath) shape).curveTo(27.215, 42.813, 27.203, 41.25, 27.121, 39.25);
        ((GeneralPath) shape).lineTo(26.961, 22.613);
        ((GeneralPath) shape).curveTo(26.961, 22.316, 26.934, 21.465, 26.883001, 20.051);
        ((GeneralPath) shape).curveTo(26.828001, 18.719, 26.773, 17.891, 26.723001, 17.57);
        ((GeneralPath) shape).lineTo(26.680002, 17.331999);
        ((GeneralPath) shape).lineTo(26.762003, 23.210999);
        ((GeneralPath) shape).curveTo(26.812002, 24.569998, 26.867002, 27.276999, 26.922003, 31.331999);
        ((GeneralPath) shape).curveTo(26.949003, 35.625, 26.961002, 38.343998, 26.961002, 39.491997);
        ((GeneralPath) shape).lineTo(26.320002, 24.409996);
        ((GeneralPath) shape).curveTo(26.293001, 24.835997, 26.270002, 26.315996, 26.242002, 28.851995);
        ((GeneralPath) shape).curveTo(26.215002, 31.331995, 26.215002, 32.812996, 26.242002, 33.288994);
        ((GeneralPath) shape).curveTo(25.977003, 32.569992, 25.734003, 30.464994, 25.520002, 26.972994);
        ((GeneralPath) shape).curveTo(25.309002, 23.370995, 25.109003, 21.249994, 24.922003, 20.612993);
        ((GeneralPath) shape).lineTo(25.082003, 24.491993);
        ((GeneralPath) shape).lineTo(25.160002, 24.851994);
        ((GeneralPath) shape).curveTo(25.266003, 25.198994, 25.348001, 26.690994, 25.402002, 29.331993);
        ((GeneralPath) shape).curveTo(25.453003, 32.159992, 25.496002, 33.663994, 25.520002, 33.851994);
        ((GeneralPath) shape).lineTo(25.641003, 33.890995);
        ((GeneralPath) shape).curveTo(25.668003, 34.155994, 25.680002, 35.421993, 25.680002, 37.690994);
        ((GeneralPath) shape).lineTo(25.680002, 40.569996);
        ((GeneralPath) shape).curveTo(25.629002, 42.542995, 25.586002, 44.034996, 25.562002, 45.050995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6B563D));
        g.fill(shape);

        // _0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.082, 43.531);
        ((GeneralPath) shape).lineTo(29.68, 43.488);
        ((GeneralPath) shape).curveTo(29.707, 42.957, 29.801, 42.063, 29.961, 40.809);
        ((GeneralPath) shape).lineTo(30.562, 36.929996);
        ((GeneralPath) shape).curveTo(30.773, 35.382996, 30.895, 34.077995, 30.922, 33.011997);
        ((GeneralPath) shape).curveTo(30.922, 31.862997, 30.84, 30.128998, 30.68, 27.812998);
        ((GeneralPath) shape).curveTo(30.496, 25.116997, 30.293001, 23.476997, 30.082, 22.890999);
        ((GeneralPath) shape).curveTo(29.762001, 21.984, 29.574001, 21.237999, 29.52, 20.651999);
        ((GeneralPath) shape).curveTo(29.496, 18.012, 29.441, 16.608997, 29.359001, 16.448997);
        ((GeneralPath) shape).curveTo(29.309002, 16.851997, 29.281002, 19.089998, 29.281002, 23.171997);
        ((GeneralPath) shape).lineTo(29.320002, 40.690994);
        ((GeneralPath) shape).lineTo(29.121002, 36.608994);
        ((GeneralPath) shape).lineTo(29.082003, 43.530994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.68, 23.09);
        ((GeneralPath) shape).lineTo(28.602001, 21.449);
        ((GeneralPath) shape).curveTo(28.547, 22.012, 28.52, 23.276999, 28.52, 25.25);
        ((GeneralPath) shape).lineTo(28.52, 41.531);
        ((GeneralPath) shape).curveTo(28.629, 38.383, 28.668001, 36.011997, 28.641, 34.41);
        ((GeneralPath) shape).curveTo(28.75, 35.238, 28.828001, 36.117, 28.883001, 37.051);
        ((GeneralPath) shape).lineTo(28.883001, 33.051);
        ((GeneralPath) shape).curveTo(28.883001, 27.796999, 28.816002, 24.476997, 28.680002, 23.089998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_36
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.121, 45.77);
        ((GeneralPath) shape).lineTo(25.16, 46.488);
        ((GeneralPath) shape).curveTo(25.16, 46.145, 25.281, 45.731, 25.52, 45.25);
        ((GeneralPath) shape).lineTo(25.562, 45.051);
        ((GeneralPath) shape).curveTo(25.586, 44.035, 25.629, 42.543, 25.68, 40.57);
        ((GeneralPath) shape).lineTo(25.68, 37.688);
        ((GeneralPath) shape).curveTo(25.68, 35.422, 25.668001, 34.156, 25.641, 33.891);
        ((GeneralPath) shape).lineTo(25.52, 33.848);
        ((GeneralPath) shape).curveTo(25.496, 33.664, 25.453001, 32.156, 25.402, 29.328);
        ((GeneralPath) shape).curveTo(25.348, 26.688, 25.266, 25.195, 25.16, 24.848);
        ((GeneralPath) shape).lineTo(25.082, 24.487999);
        ((GeneralPath) shape).curveTo(25.109001, 25.289, 25.133001, 27.155998, 25.16, 30.09);
        ((GeneralPath) shape).curveTo(25.16, 32.891, 25.148, 34.664, 25.121, 35.41);
        ((GeneralPath) shape).curveTo(25.043001, 36.93, 25.043001, 40.383, 25.121, 45.77);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x83694A));
        g.fill(shape);

        // _0_0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.121, 43.969);
        ((GeneralPath) shape).curveTo(27.016, 42.398003, 26.75, 40.078003, 26.32, 37.012);
        ((GeneralPath) shape).curveTo(26.402, 38.129, 26.453, 38.957, 26.48, 39.488003);
        ((GeneralPath) shape).lineTo(26.48, 40.051003);
        ((GeneralPath) shape).curveTo(26.48, 41.918003, 26.508, 43.316, 26.562, 44.250004);
        ((GeneralPath) shape).lineTo(27.121, 43.969006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.52, 41.531);
        ((GeneralPath) shape).lineTo(28.52, 43.608997);
        ((GeneralPath) shape).lineTo(29.082, 43.531);
        ((GeneralPath) shape).lineTo(28.883001, 37.051);
        ((GeneralPath) shape).curveTo(28.828001, 36.116997, 28.746002, 35.238, 28.641, 34.41);
        ((GeneralPath) shape).curveTo(28.668001, 36.012, 28.629002, 38.383, 28.52, 41.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.16, 13.25);
        ((GeneralPath) shape).lineTo(28.641, 13.371);
        ((GeneralPath) shape).lineTo(29.320002, 40.691);
        ((GeneralPath) shape).lineTo(29.160002, 13.250002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.762, 23.211);
        ((GeneralPath) shape).lineTo(26.679998, 17.328001);
        ((GeneralPath) shape).curveTo(26.679998, 16.715, 26.640999, 16.371, 26.561998, 16.289001);
        ((GeneralPath) shape).lineTo(26.479998, 16.211002);
        ((GeneralPath) shape).lineTo(26.440998, 16.211002);
        ((GeneralPath) shape).curveTo(26.280998, 16.184002, 26.202997, 16.516003, 26.202997, 17.211002);
        ((GeneralPath) shape).lineTo(26.202997, 23.211002);
        ((GeneralPath) shape).lineTo(26.960997, 39.488003);
        ((GeneralPath) shape).curveTo(26.960997, 38.344, 26.948997, 35.625004, 26.921997, 31.332003);
        ((GeneralPath) shape).curveTo(26.866997, 27.277002, 26.815996, 24.570004, 26.761997, 23.211002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_41
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.082, 45.41);
        ((GeneralPath) shape).lineTo(29.242, 45.332);
        ((GeneralPath) shape).lineTo(29.32, 44.77);
        ((GeneralPath) shape).curveTo(28.254, 44.852, 27.508, 45.078, 27.082, 45.449);
        ((GeneralPath) shape).lineTo(26.961, 46.09);
        ((GeneralPath) shape).curveTo(27.148, 45.957, 27.426, 45.957, 27.801, 46.09);
        ((GeneralPath) shape).lineTo(27.84, 46.09);
        ((GeneralPath) shape).curveTo(28.055, 45.77, 28.469, 45.543, 29.082, 45.41);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA88760));
        g.fill(shape);

        // _0_0_0_42
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.52, 46.969);
        ((GeneralPath) shape).lineTo(28.32, 46.691);
        ((GeneralPath) shape).lineTo(27.723, 46.570004);
        ((GeneralPath) shape).lineTo(27.562, 46.770004);
        ((GeneralPath) shape).lineTo(27.52, 46.969006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.242, 46.129);
        ((GeneralPath) shape).curveTo(28.762001, 46.184002, 28.402, 46.25, 28.16, 46.332);
        ((GeneralPath) shape).lineTo(28.562, 46.609);
        ((GeneralPath) shape).lineTo(29.242, 46.41);
        ((GeneralPath) shape).lineTo(29.242, 46.129);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.48, 47.012);
        ((GeneralPath) shape).lineTo(27.640999, 46.57);
        ((GeneralPath) shape).curveTo(27.293, 46.465, 27.07, 46.332, 26.960999, 46.172);
        ((GeneralPath) shape).curveTo(26.883, 46.488003, 26.854998, 46.77, 26.883, 47.012);
        ((GeneralPath) shape).lineTo(26.921999, 47.172);
        ((GeneralPath) shape).lineTo(27.48, 47.012);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.48, 46.09);
        ((GeneralPath) shape).lineTo(29.48, 46.332);
        ((GeneralPath) shape).lineTo(32.68, 45.332);
        ((GeneralPath) shape).lineTo(32.562, 45.25);
        ((GeneralPath) shape).curveTo(31.68, 44.93, 30.656, 44.77, 29.48, 44.77);
        ((GeneralPath) shape).lineTo(29.48, 45.289);
        ((GeneralPath) shape).curveTo(30.043, 45.238003, 30.281, 45.422, 30.203, 45.852);
        ((GeneralPath) shape).curveTo(30.175999, 45.957, 29.934, 46.035, 29.48, 46.09);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.16, 46.531);
        ((GeneralPath) shape).lineTo(25.16, 46.809);
        ((GeneralPath) shape).curveTo(25.32, 46.116997, 25.812, 45.331997, 26.640999, 44.448997);
        ((GeneralPath) shape).curveTo(26.905998, 44.211, 27.32, 44.062996, 27.883, 44.011997);
        ((GeneralPath) shape).curveTo(28.203, 43.983997, 28.640999, 43.968998, 29.203, 43.968998);
        ((GeneralPath) shape).lineTo(30.561998, 43.851997);
        ((GeneralPath) shape).curveTo(30.854998, 43.874996, 31.308998, 43.956997, 31.921999, 44.089996);
        ((GeneralPath) shape).curveTo(32.082, 44.089996, 32.348, 44.128998, 32.723, 44.210995);
        ((GeneralPath) shape).curveTo(33.07, 44.288994, 33.336, 44.315994, 33.52, 44.288994);
        ((GeneralPath) shape).lineTo(33.922, 44.288994);
        ((GeneralPath) shape).curveTo(32.453, 43.569992, 30.723001, 43.331993, 28.723001, 43.569992);
        ((GeneralPath) shape).curveTo(27.387001, 43.73099, 26.414001, 44.171993, 25.801003, 44.89099);
        ((GeneralPath) shape).curveTo(25.402002, 45.34399, 25.188002, 45.89099, 25.160002, 46.53099);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.922, 46.09);
        ((GeneralPath) shape).lineTo(26.961, 46.09);
        ((GeneralPath) shape).lineTo(27.121, 45.211);
        ((GeneralPath) shape).curveTo(27.043001, 45.288998, 26.922, 45.488, 26.762001, 45.809);
        ((GeneralPath) shape).lineTo(26.602001, 46.128998);
        ((GeneralPath) shape).lineTo(26.441002, 46.809);
        ((GeneralPath) shape).lineTo(26.480001, 46.809);
        ((GeneralPath) shape).curveTo(26.641, 46.809, 26.773, 46.929996, 26.883001, 47.171997);
        ((GeneralPath) shape).lineTo(26.922, 47.171997);
        ((GeneralPath) shape).lineTo(26.883001, 47.011997);
        ((GeneralPath) shape).curveTo(26.855001, 46.769997, 26.883001, 46.488, 26.961, 46.171997);
        ((GeneralPath) shape).lineTo(26.922, 46.089996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x876C4D));
        g.fill(shape);

        // _0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.48, 45.289);
        ((GeneralPath) shape).lineTo(29.48, 46.09);
        ((GeneralPath) shape).curveTo(29.934, 46.035, 30.175999, 45.957, 30.203, 45.852);
        ((GeneralPath) shape).curveTo(30.280998, 45.422, 30.043, 45.238003, 29.48, 45.289);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.242, 46.129);
        ((GeneralPath) shape).lineTo(29.242, 45.332);
        ((GeneralPath) shape).lineTo(29.082, 45.41);
        ((GeneralPath) shape).curveTo(28.469, 45.543, 28.055, 45.77, 27.84, 46.09);
        ((GeneralPath) shape).curveTo(27.922, 46.117, 28.027, 46.195, 28.16, 46.332);
        ((GeneralPath) shape).curveTo(28.402, 46.25, 28.762, 46.184002, 29.242, 46.129);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.961, 46.172);
        ((GeneralPath) shape).curveTo(27.066, 46.332, 27.293001, 46.465, 27.641, 46.57);
        ((GeneralPath) shape).lineTo(27.723001, 46.57);
        ((GeneralPath) shape).lineTo(28.320002, 46.690998);
        ((GeneralPath) shape).lineTo(28.562002, 46.608997);
        ((GeneralPath) shape).lineTo(28.160002, 46.331997);
        ((GeneralPath) shape).curveTo(28.027002, 46.194996, 27.922, 46.116997, 27.840002, 46.089996);
        ((GeneralPath) shape).lineTo(27.801003, 46.089996);
        ((GeneralPath) shape).curveTo(27.426003, 45.956997, 27.148003, 45.956997, 26.961002, 46.089996);
        ((GeneralPath) shape).lineTo(26.922003, 46.089996);
        ((GeneralPath) shape).lineTo(26.961002, 46.171997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.242, 46.41);
        ((GeneralPath) shape).lineTo(29.480001, 46.332);
        ((GeneralPath) shape).lineTo(29.480001, 44.77);
        ((GeneralPath) shape).curveTo(29.480001, 44.504, 29.453001, 44.316, 29.402002, 44.211);
        ((GeneralPath) shape).lineTo(29.242002, 45.331997);
        ((GeneralPath) shape).lineTo(29.242002, 46.409996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.883, 47.172);
        ((GeneralPath) shape).curveTo(26.772999, 46.93, 26.640999, 46.809002, 26.48, 46.809002);
        ((GeneralPath) shape).lineTo(26.441, 46.809002);
        ((GeneralPath) shape).curveTo(26.309, 46.809002, 25.949, 46.969, 25.359, 47.289);
        ((GeneralPath) shape).curveTo(25.546999, 47.531002, 25.734, 47.609, 25.921999, 47.531002);
        ((GeneralPath) shape).lineTo(26.883, 47.172);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x66513A));
        g.fill(shape);

        // _0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.562, 45.25);
        ((GeneralPath) shape).lineTo(32.68, 45.332);
        ((GeneralPath) shape).curveTo(33.535, 45.117, 34.281002, 44.984, 34.922, 44.93);
        ((GeneralPath) shape).curveTo(34.762, 44.77, 34.52, 44.609, 34.203, 44.449);
        ((GeneralPath) shape).lineTo(33.961, 44.488003);
        ((GeneralPath) shape).curveTo(32.948997, 44.598003, 32.226997, 44.715004, 31.800999, 44.852);
        ((GeneralPath) shape).curveTo(31.905998, 44.93, 32.16, 45.063, 32.562, 45.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.16, 41.09);
        ((GeneralPath) shape).lineTo(34.281, 41.012);
        ((GeneralPath) shape).curveTo(35.026997, 40.852, 35.375, 40.438, 35.32, 39.77);
        ((GeneralPath) shape).lineTo(35.082, 24.648);
        ((GeneralPath) shape).curveTo(34.762, 25.051, 34.602, 25.465, 34.602, 25.891);
        ((GeneralPath) shape).lineTo(33.961002, 30.648);
        ((GeneralPath) shape).lineTo(33.762, 29.609001);
        ((GeneralPath) shape).lineTo(33.762, 32.609);
        ((GeneralPath) shape).curveTo(33.762, 33.195, 33.695, 33.316, 33.562, 32.969);
        ((GeneralPath) shape).curveTo(33.402, 32.621002, 33.32, 32.289, 33.32, 31.969002);
        ((GeneralPath) shape).curveTo(33.109, 29.356003, 33.0, 28.156002, 33.0, 28.371002);
        ((GeneralPath) shape).lineTo(32.922, 36.328003);
        ((GeneralPath) shape).curveTo(32.922, 37.422005, 32.961002, 38.543003, 33.043, 39.688004);
        ((GeneralPath) shape).lineTo(33.16, 41.090004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x281F16));
        g.fill(shape);

        // _0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.32, 38.809);
        ((GeneralPath) shape).curveTo(28.402, 38.891, 28.469, 39.023, 28.52, 39.211);
        ((GeneralPath) shape).lineTo(28.68, 39.648);
        ((GeneralPath) shape).lineTo(28.68, 37.891);
        ((GeneralPath) shape).curveTo(28.469, 37.063, 28.332, 36.41, 28.281, 35.93);
        ((GeneralPath) shape).curveTo(28.148, 37.664, 28.082, 38.703, 28.082, 39.051);
        ((GeneralPath) shape).lineTo(27.723001, 36.25);
        ((GeneralPath) shape).curveTo(27.641, 36.57, 27.586002, 37.063, 27.562002, 37.731);
        ((GeneralPath) shape).curveTo(27.508001, 38.398, 27.441002, 38.891, 27.359003, 39.211);
        ((GeneralPath) shape).lineTo(27.359003, 39.25);
        ((GeneralPath) shape).lineTo(27.602003, 40.012);
        ((GeneralPath) shape).lineTo(27.602003, 39.488003);
        ((GeneralPath) shape).curveTo(27.680002, 38.344, 27.707003, 37.637, 27.680002, 37.371002);
        ((GeneralPath) shape).curveTo(27.816002, 38.145, 27.906002, 38.719, 27.961002, 39.090004);
        ((GeneralPath) shape).curveTo(28.043003, 39.891003, 28.109003, 40.316006, 28.160002, 40.371002);
        ((GeneralPath) shape).curveTo(28.215002, 40.289, 28.227001, 39.996002, 28.203001, 39.488003);
        ((GeneralPath) shape).curveTo(28.176, 39.039, 28.215, 38.809002, 28.320002, 38.809002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4E3F2D));
        g.fill(shape);

        // _0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.68, 39.531);
        ((GeneralPath) shape).lineTo(29.961, 39.211);
        ((GeneralPath) shape).curveTo(30.227001, 38.863, 30.387001, 38.690998, 30.441, 38.690998);
        ((GeneralPath) shape).lineTo(30.883, 38.690998);
        ((GeneralPath) shape).curveTo(30.906, 38.133, 31.015999, 37.276997, 31.203, 36.133);
        ((GeneralPath) shape).lineTo(31.120998, 35.613);
        ((GeneralPath) shape).curveTo(31.043, 35.078, 30.948997, 34.277, 30.839998, 33.211);
        ((GeneralPath) shape).lineTo(30.800999, 32.968998);
        ((GeneralPath) shape).lineTo(30.762, 33.211);
        ((GeneralPath) shape).curveTo(30.811998, 35.156, 30.745998, 36.703, 30.561998, 37.851997);
        ((GeneralPath) shape).lineTo(30.401999, 38.448997);
        ((GeneralPath) shape).curveTo(30.319998, 38.476997, 30.265999, 38.516, 30.241999, 38.569996);
        ((GeneralPath) shape).curveTo(30.026999, 38.862995, 29.905998, 39.011997, 29.883, 39.011997);
        ((GeneralPath) shape).lineTo(29.562, 38.968998);
        ((GeneralPath) shape).lineTo(29.68, 39.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.281, 38.809);
        ((GeneralPath) shape).lineTo(33.32, 38.809);
        ((GeneralPath) shape).curveTo(33.453, 38.011997, 33.547, 37.516, 33.602, 37.328);
        ((GeneralPath) shape).curveTo(33.656002, 36.531, 33.641003, 35.823997, 33.562, 35.211);
        ((GeneralPath) shape).lineTo(33.281002, 36.09);
        ((GeneralPath) shape).lineTo(33.160004, 36.691);
        ((GeneralPath) shape).curveTo(33.109005, 37.117, 33.043003, 37.398003, 32.961002, 37.531002);
        ((GeneralPath) shape).curveTo(32.855003, 37.371002, 32.801003, 37.051003, 32.801003, 36.570004);
        ((GeneralPath) shape).curveTo(32.828003, 36.305004, 32.855003, 35.957005, 32.883003, 35.531002);
        ((GeneralPath) shape).lineTo(33.000004, 33.813004);
        ((GeneralPath) shape).lineTo(32.883003, 33.731003);
        ((GeneralPath) shape).curveTo(32.828003, 33.648003, 32.801003, 33.504, 32.801003, 33.289);
        ((GeneralPath) shape).curveTo(32.750004, 32.918003, 32.707, 32.371002, 32.680004, 31.648);
        ((GeneralPath) shape).curveTo(32.602005, 31.012001, 32.547005, 30.664001, 32.520004, 30.609001);
        ((GeneralPath) shape).lineTo(32.520004, 31.289001);
        ((GeneralPath) shape).lineTo(32.402004, 31.930002);
        ((GeneralPath) shape).curveTo(32.320004, 32.488003, 32.281006, 33.223003, 32.281006, 34.129);
        ((GeneralPath) shape).curveTo(32.309006, 35.332, 32.309006, 36.078003, 32.281006, 36.371002);
        ((GeneralPath) shape).curveTo(32.148006, 37.090004, 32.055004, 37.625004, 32.000008, 37.969);
        ((GeneralPath) shape).lineTo(32.160007, 38.531002);
        ((GeneralPath) shape).lineTo(32.160007, 38.731003);
        ((GeneralPath) shape).lineTo(32.320007, 38.891003);
        ((GeneralPath) shape).curveTo(32.535007, 39.078003, 32.723007, 39.129, 32.883007, 39.051003);
        ((GeneralPath) shape).lineTo(33.281006, 38.809002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.32, 40.852);
        ((GeneralPath) shape).curveTo(26.426, 40.852, 26.508, 40.648003, 26.562, 40.25);
        ((GeneralPath) shape).curveTo(26.586, 40.035, 26.602001, 39.691, 26.602001, 39.211);
        ((GeneralPath) shape).lineTo(26.480001, 39.25);
        ((GeneralPath) shape).curveTo(26.375002, 39.305, 26.281002, 39.438, 26.203001, 39.648);
        ((GeneralPath) shape).curveTo(26.121, 39.891, 26.055, 40.063, 26.000002, 40.168);
        ((GeneralPath) shape).curveTo(25.922003, 40.012, 25.855001, 39.918, 25.801003, 39.891);
        ((GeneralPath) shape).curveTo(25.723003, 39.809, 25.613003, 39.809, 25.480003, 39.891);
        ((GeneralPath) shape).curveTo(25.402004, 39.940998, 25.320004, 40.101997, 25.242002, 40.371);
        ((GeneralPath) shape).curveTo(25.137003, 40.636997, 25.082003, 40.836, 25.082003, 40.968998);
        ((GeneralPath) shape).lineTo(25.043003, 40.968998);
        ((GeneralPath) shape).lineTo(25.043003, 41.371);
        ((GeneralPath) shape).lineTo(25.602003, 40.891);
        ((GeneralPath) shape).curveTo(25.602003, 40.465, 25.668003, 40.223, 25.801003, 40.168);
        ((GeneralPath) shape).curveTo(25.906002, 40.117, 26.016003, 40.195, 26.121002, 40.41);
        ((GeneralPath) shape).curveTo(26.176003, 40.516, 26.242002, 40.664, 26.320002, 40.852);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.801, 36.57);
        ((GeneralPath) shape).curveTo(32.801, 37.051, 32.855, 37.371, 32.961, 37.531);
        ((GeneralPath) shape).curveTo(33.043, 37.398, 33.108997, 37.116997, 33.16, 36.690998);
        ((GeneralPath) shape).lineTo(33.281, 36.089996);
        ((GeneralPath) shape).lineTo(33.561996, 35.210995);
        ((GeneralPath) shape).curveTo(33.640995, 35.823994, 33.656, 36.530994, 33.601997, 37.327995);
        ((GeneralPath) shape).curveTo(33.733997, 36.874996, 33.801, 36.503994, 33.801, 36.210995);
        ((GeneralPath) shape).curveTo(33.801, 35.804996, 33.828, 35.499996, 33.883, 35.288994);
        ((GeneralPath) shape).lineTo(33.883, 35.249992);
        ((GeneralPath) shape).curveTo(33.824, 34.948994, 33.742, 34.706993, 33.641, 34.53099);
        ((GeneralPath) shape).curveTo(33.32, 34.05099, 33.148, 33.67599, 33.121, 33.409992);
        ((GeneralPath) shape).lineTo(33.043, 31.569992);
        ((GeneralPath) shape).lineTo(32.883, 35.53099);
        ((GeneralPath) shape).curveTo(32.855, 35.95699, 32.828, 36.30499, 32.801, 36.569992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3B3022));
        g.fill(shape);

        // _0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.883, 38.691);
        ((GeneralPath) shape).lineTo(30.441, 38.691);
        ((GeneralPath) shape).curveTo(30.387, 38.691, 30.227, 38.863003, 29.961, 39.211002);
        ((GeneralPath) shape).lineTo(29.68, 39.531002);
        ((GeneralPath) shape).lineTo(29.723, 39.77);
        ((GeneralPath) shape).curveTo(29.934, 40.25, 30.147999, 40.516, 30.359, 40.57);
        ((GeneralPath) shape).curveTo(30.706999, 40.598, 30.883, 40.315998, 30.883, 39.731);
        ((GeneralPath) shape).curveTo(30.883, 39.198997, 30.934, 38.863, 31.043, 38.731);
        ((GeneralPath) shape).curveTo(31.203, 38.891, 31.348, 39.277, 31.48, 39.891);
        ((GeneralPath) shape).lineTo(31.441, 37.809);
        ((GeneralPath) shape).lineTo(31.359, 37.608997);
        ((GeneralPath) shape).lineTo(31.32, 34.351997);
        ((GeneralPath) shape).curveTo(31.296999, 35.081997, 31.258, 35.659996, 31.203, 36.089996);
        ((GeneralPath) shape).lineTo(31.203, 36.128998);
        ((GeneralPath) shape).curveTo(31.015999, 37.276997, 30.905998, 38.128998, 30.883, 38.690998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.883, 39.051);
        ((GeneralPath) shape).curveTo(32.723, 39.128998, 32.535, 39.078, 32.32, 38.891);
        ((GeneralPath) shape).lineTo(32.16, 38.731);
        ((GeneralPath) shape).lineTo(32.242, 39.051);
        ((GeneralPath) shape).curveTo(32.293, 39.184, 32.426, 39.277, 32.641, 39.331997);
        ((GeneralPath) shape).curveTo(32.883, 39.409996, 33.055, 39.409996, 33.16, 39.331997);
        ((GeneralPath) shape).curveTo(33.215, 39.304996, 33.266, 39.128998, 33.32, 38.812996);
        ((GeneralPath) shape).lineTo(33.281, 38.812996);
        ((GeneralPath) shape).lineTo(32.883, 39.050995);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.48, 40.852);
        ((GeneralPath) shape).curveTo(28.612999, 40.715, 28.68, 40.531002, 28.68, 40.289);
        ((GeneralPath) shape).lineTo(28.68, 39.648003);
        ((GeneralPath) shape).lineTo(28.52, 39.211002);
        ((GeneralPath) shape).curveTo(28.469, 39.023003, 28.402, 38.891003, 28.32, 38.809002);
        ((GeneralPath) shape).curveTo(28.215, 38.809002, 28.176, 39.035004, 28.203, 39.488003);
        ((GeneralPath) shape).curveTo(28.227, 39.996002, 28.214998, 40.289, 28.16, 40.371002);
        ((GeneralPath) shape).curveTo(28.109, 40.316, 28.043, 39.891003, 27.961, 39.090004);
        ((GeneralPath) shape).curveTo(27.906, 38.715004, 27.812, 38.145004, 27.68, 37.371002);
        ((GeneralPath) shape).curveTo(27.707, 37.637, 27.68, 38.344, 27.602001, 39.488003);
        ((GeneralPath) shape).lineTo(27.602001, 40.012);
        ((GeneralPath) shape).lineTo(27.723001, 40.449);
        ((GeneralPath) shape).curveTo(27.723001, 40.477, 27.789001, 40.648003, 27.922, 40.969);
        ((GeneralPath) shape).curveTo(28.137001, 41.078003, 28.320002, 41.039, 28.480001, 40.852);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_63
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.043, 41.371);
        ((GeneralPath) shape).lineTo(25.081999, 41.968998);
        ((GeneralPath) shape).lineTo(26.839998, 40.769997);
        ((GeneralPath) shape).lineTo(26.960999, 39.809);
        ((GeneralPath) shape).lineTo(26.839998, 39.371);
        ((GeneralPath) shape).curveTo(26.788998, 39.101997, 26.722998, 38.901997, 26.640999, 38.769997);
        ((GeneralPath) shape).lineTo(26.602, 39.211);
        ((GeneralPath) shape).curveTo(26.602, 39.690998, 26.585999, 40.035, 26.561998, 40.25);
        ((GeneralPath) shape).curveTo(26.507998, 40.648, 26.425999, 40.852, 26.319998, 40.852);
        ((GeneralPath) shape).curveTo(26.241999, 40.664, 26.175999, 40.516003, 26.120998, 40.41);
        ((GeneralPath) shape).curveTo(26.015999, 40.195, 25.905998, 40.117, 25.800999, 40.168);
        ((GeneralPath) shape).curveTo(25.668, 40.223, 25.602, 40.465, 25.602, 40.891);
        ((GeneralPath) shape).lineTo(25.043, 41.371);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_64
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.84, 40.77);
        ((GeneralPath) shape).lineTo(25.082, 41.969);
        ((GeneralPath) shape).lineTo(25.16, 46.891003);
        ((GeneralPath) shape).curveTo(26.016, 46.785004, 26.921999, 46.598003, 27.883, 46.332);
        ((GeneralPath) shape).curveTo(29.987999, 45.77, 31.745998, 45.035, 33.16, 44.129);
        ((GeneralPath) shape).curveTo(33.375, 43.969, 33.723, 43.742, 34.203, 43.449);
        ((GeneralPath) shape).curveTo(34.601997, 43.156002, 34.895, 42.863003, 35.082, 42.57);
        ((GeneralPath) shape).curveTo(35.242, 42.383, 35.332, 42.184, 35.359, 41.968998);
        ((GeneralPath) shape).lineTo(35.0, 41.891);
        ((GeneralPath) shape).lineTo(34.961, 41.851997);
        ((GeneralPath) shape).curveTo(34.668, 41.714996, 34.48, 41.608997, 34.402, 41.531);
        ((GeneralPath) shape).lineTo(34.043, 41.211);
        ((GeneralPath) shape).lineTo(33.961, 41.09);
        ((GeneralPath) shape).curveTo(34.894997, 40.984, 35.348, 40.543, 35.32, 39.77);
        ((GeneralPath) shape).lineTo(35.32, 39.531002);
        ((GeneralPath) shape).lineTo(35.281, 39.332);
        ((GeneralPath) shape).curveTo(35.065998, 38.531002, 34.668, 37.344, 34.081997, 35.77);
        ((GeneralPath) shape).lineTo(33.882996, 35.289);
        ((GeneralPath) shape).lineTo(33.882996, 35.25);
        ((GeneralPath) shape).curveTo(33.827995, 35.465, 33.800995, 35.781, 33.800995, 36.211);
        ((GeneralPath) shape).curveTo(33.800995, 36.503998, 33.733994, 36.875, 33.601994, 37.328);
        ((GeneralPath) shape).curveTo(33.546993, 37.516, 33.452995, 38.012, 33.319992, 38.809);
        ((GeneralPath) shape).curveTo(33.269993, 39.128998, 33.214993, 39.304996, 33.159992, 39.328);
        ((GeneralPath) shape).curveTo(33.054993, 39.41, 32.88299, 39.41, 32.64099, 39.328);
        ((GeneralPath) shape).curveTo(32.42599, 39.277, 32.29299, 39.184, 32.241993, 39.051);
        ((GeneralPath) shape).lineTo(32.159992, 38.731);
        ((GeneralPath) shape).lineTo(32.159992, 38.531);
        ((GeneralPath) shape).lineTo(31.960993, 37.848);
        ((GeneralPath) shape).lineTo(31.640993, 36.168);
        ((GeneralPath) shape).curveTo(31.542994, 35.621, 31.491993, 35.203, 31.479994, 34.91);
        ((GeneralPath) shape).lineTo(31.479994, 39.891);
        ((GeneralPath) shape).curveTo(31.347994, 39.277, 31.202993, 38.891, 31.042994, 38.731);
        ((GeneralPath) shape).curveTo(30.933994, 38.863, 30.882994, 39.198997, 30.882994, 39.731);
        ((GeneralPath) shape).curveTo(30.882994, 40.315998, 30.706993, 40.598, 30.358994, 40.57);
        ((GeneralPath) shape).curveTo(30.147993, 40.516, 29.933994, 40.25, 29.722994, 39.77);
        ((GeneralPath) shape).lineTo(28.999994, 36.609);
        ((GeneralPath) shape).curveTo(28.815994, 35.863003, 28.706995, 35.332, 28.679995, 35.012);
        ((GeneralPath) shape).curveTo(28.733995, 35.969, 28.733995, 36.93, 28.679995, 37.891003);
        ((GeneralPath) shape).lineTo(28.679995, 40.289);
        ((GeneralPath) shape).curveTo(28.679995, 40.531002, 28.612995, 40.719, 28.479994, 40.852);
        ((GeneralPath) shape).curveTo(28.319994, 41.039, 28.132994, 41.078003, 27.921993, 40.969);
        ((GeneralPath) shape).curveTo(27.788994, 40.652, 27.722994, 40.477, 27.722994, 40.449);
        ((GeneralPath) shape).lineTo(27.319994, 39.133003);
        ((GeneralPath) shape).curveTo(27.136993, 38.332005, 27.026995, 37.918003, 26.999994, 37.891003);
        ((GeneralPath) shape).lineTo(26.999994, 39.250004);
        ((GeneralPath) shape).lineTo(26.960995, 39.488003);
        ((GeneralPath) shape).lineTo(26.960995, 39.809002);
        ((GeneralPath) shape).lineTo(26.839994, 40.77);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x281F16));
        g.fill(shape);

        // _0_0_0_65
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.242, 37.172);
        ((GeneralPath) shape).curveTo(62.84, 37.652, 62.629, 38.199, 62.602, 38.813);
        ((GeneralPath) shape).lineTo(62.641003, 39.211);
        ((GeneralPath) shape).curveTo(62.773003, 39.531, 62.934002, 39.731, 63.121002, 39.813);
        ((GeneralPath) shape).curveTo(63.227, 39.836, 63.309002, 39.836, 63.363003, 39.813);
        ((GeneralPath) shape).lineTo(69.32, 37.813);
        ((GeneralPath) shape).curveTo(70.414, 37.492, 71.441, 37.277, 72.402, 37.172);
        ((GeneralPath) shape).curveTo(72.055, 36.852, 71.535, 36.57, 70.844, 36.332);
        ((GeneralPath) shape).curveTo(69.43, 35.797, 67.867004, 35.637, 66.16, 35.852);
        ((GeneralPath) shape).curveTo(64.828, 36.012, 63.855003, 36.449, 63.242004, 37.172);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x806646));
        g.fill(shape);

        // _0_0_0_66
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(62.602, 38.051);
        ((GeneralPath) shape).lineTo(62.602, 38.809);
        ((GeneralPath) shape).curveTo(62.629, 38.195, 62.84, 37.648, 63.242, 37.168);
        ((GeneralPath) shape).curveTo(63.855, 36.448997, 64.828, 36.012, 66.16, 35.851997);
        ((GeneralPath) shape).curveTo(67.867004, 35.636997, 69.426, 35.796997, 70.840004, 36.331997);
        ((GeneralPath) shape).curveTo(71.535, 36.569996, 72.055, 36.851997, 72.402, 37.171997);
        ((GeneralPath) shape).lineTo(72.883, 34.249996);
        ((GeneralPath) shape).curveTo(72.508, 34.198997, 72.121, 33.999996, 71.723, 33.651997);
        ((GeneralPath) shape).curveTo(70.949, 32.983997, 70.547, 31.917997, 70.523, 30.448997);
        ((GeneralPath) shape).curveTo(70.441, 28.077997, 71.137, 24.276997, 72.602005, 19.050999);
        ((GeneralPath) shape).curveTo(72.629005, 11.929998, 72.629005, 7.9839983, 72.602005, 7.2109985);
        ((GeneralPath) shape).lineTo(72.602005, 6.9689984);
        ((GeneralPath) shape).curveTo(72.04301, 6.3559985, 71.281006, 5.9299984, 70.32001, 5.6909986);
        ((GeneralPath) shape).curveTo(69.602005, 5.5039988, 68.656006, 5.4219985, 67.48001, 5.4489985);
        ((GeneralPath) shape).curveTo(66.44101, 5.4769983, 65.48001, 5.7699986, 64.60201, 6.3319983);
        ((GeneralPath) shape).curveTo(63.934013, 6.7309985, 63.16001, 7.3979983, 62.281013, 8.331999);
        ((GeneralPath) shape).curveTo(62.574013, 19.022999, 62.668015, 25.464998, 62.56201, 27.647999);
        ((GeneralPath) shape).curveTo(62.50801, 29.089998, 62.52001, 32.555, 62.602013, 38.051);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A4934));
        g.fill(shape);

        // _0_0_0_67
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.562, 35.969);
        ((GeneralPath) shape).curveTo(69.723, 35.488003, 69.827995, 34.77, 69.879, 33.813004);
        ((GeneralPath) shape).lineTo(70.0, 18.449003);
        ((GeneralPath) shape).curveTo(69.973, 18.742002, 69.934, 20.090004, 69.879, 22.492004);
        ((GeneralPath) shape).curveTo(69.854996, 24.586004, 69.854996, 25.883005, 69.879, 26.391005);
        ((GeneralPath) shape).curveTo(69.800995, 25.203005, 69.762, 22.195004, 69.762, 17.371004);
        ((GeneralPath) shape).curveTo(69.762, 12.250004, 69.734, 9.211004, 69.68, 8.250004);
        ((GeneralPath) shape).lineTo(69.52, 5.531004);
        ((GeneralPath) shape).lineTo(68.76199, 5.453004);
        ((GeneralPath) shape).curveTo(69.08199, 6.8910036, 69.25399, 8.184004, 69.28099, 9.332004);
        ((GeneralPath) shape).lineTo(69.28099, 26.453003);
        ((GeneralPath) shape).curveTo(69.30899, 28.266003, 69.28099, 29.586002, 69.19899, 30.410004);
        ((GeneralPath) shape).curveTo(68.87899, 29.051004, 68.71899, 27.383003, 68.71899, 25.410004);
        ((GeneralPath) shape).lineTo(68.64098, 26.973003);
        ((GeneralPath) shape).curveTo(68.64098, 28.145004, 68.62898, 29.051003, 68.60198, 29.691004);
        ((GeneralPath) shape).curveTo(68.57398, 30.785004, 68.47998, 31.680004, 68.319984, 32.371002);
        ((GeneralPath) shape).curveTo(67.81198, 33.867, 67.46899, 35.000004, 67.28098, 35.773003);
        ((GeneralPath) shape).lineTo(67.761986, 35.773003);
        ((GeneralPath) shape).lineTo(68.47999, 33.934002);
        ((GeneralPath) shape).curveTo(68.50799, 33.664, 68.51999, 33.266003, 68.51999, 32.731003);
        ((GeneralPath) shape).curveTo(68.51999, 32.277004, 68.56199, 31.934002, 68.64099, 31.691002);
        ((GeneralPath) shape).lineTo(68.67999, 33.211002);
        ((GeneralPath) shape).curveTo(68.812, 32.633003, 68.882996, 32.074, 68.87899, 31.531002);
        ((GeneralPath) shape).lineTo(68.96099, 35.852);
        ((GeneralPath) shape).lineTo(69.56199, 35.973);
        ((GeneralPath) shape).lineTo(69.56199, 35.968998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4E3F2D));
        g.fill(shape);

        // _0_0_0_68
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.281, 15.891);
        ((GeneralPath) shape).lineTo(70.043, 18.211);
        ((GeneralPath) shape).lineTo(70.242, 25.691);
        ((GeneralPath) shape).curveTo(70.32, 25.637, 70.348, 24.09, 70.32, 21.051);
        ((GeneralPath) shape).curveTo(70.32, 19.531, 70.309, 17.996, 70.281, 16.449001);
        ((GeneralPath) shape).lineTo(70.281, 15.891002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_69
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.082, 13.731);
        ((GeneralPath) shape).lineTo(66.16, 8.448999);
        ((GeneralPath) shape).lineTo(66.082, 7.6089993);
        ((GeneralPath) shape).lineTo(66.0, 13.41);
        ((GeneralPath) shape).lineTo(65.84, 5.731);
        ((GeneralPath) shape).lineTo(65.67999, 5.77);
        ((GeneralPath) shape).lineTo(65.76199, 7.852);
        ((GeneralPath) shape).curveTo(65.827995, 9.867001, 65.87499, 14.887, 65.90199, 22.91);
        ((GeneralPath) shape).lineTo(65.99999, 17.531);
        ((GeneralPath) shape).curveTo(65.99999, 15.555, 66.02699, 14.289, 66.08199, 13.731);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_70
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.281, 7.891);
        ((GeneralPath) shape).curveTo(65.324, 7.3399997, 65.406, 6.66, 65.522995, 5.8519998);
        ((GeneralPath) shape).lineTo(65.281, 5.93);
        ((GeneralPath) shape).curveTo(65.327995, 6.3399997, 65.327995, 6.9919996, 65.281, 7.891);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_71
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.562, 31.988);
        ((GeneralPath) shape).curveTo(65.550995, 31.953001, 65.547, 31.922, 65.543, 31.891);
        ((GeneralPath) shape).curveTo(65.547, 31.922, 65.551, 31.953001, 65.562, 31.988);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(65.58199, 32.109);
        ((GeneralPath) shape).curveTo(65.647995, 32.695, 65.67999, 33.422, 65.67999, 34.289);
        ((GeneralPath) shape).lineTo(65.84, 35.891003);
        ((GeneralPath) shape).lineTo(65.961, 35.852);
        ((GeneralPath) shape).lineTo(65.961, 34.852);
        ((GeneralPath) shape).lineTo(65.582, 32.109);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_72
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.16, 36.051);
        ((GeneralPath) shape).lineTo(65.16, 34.371);
        ((GeneralPath) shape).lineTo(65.0, 36.09);
        ((GeneralPath) shape).lineTo(65.16, 36.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.883, 33.809);
        ((GeneralPath) shape).curveTo(69.828, 34.769997, 69.723, 35.488, 69.562004, 35.968998);
        ((GeneralPath) shape).lineTo(70.32001, 36.171997);
        ((GeneralPath) shape).curveTo(70.29301, 35.796997, 70.29301, 35.437996, 70.32001, 35.089996);
        ((GeneralPath) shape).lineTo(70.35901, 28.409996);
        ((GeneralPath) shape).curveTo(70.35901, 28.355995, 70.48001, 27.741997, 70.72301, 26.569996);
        ((GeneralPath) shape).curveTo(70.77301, 26.116997, 70.922005, 23.476995, 71.16, 18.647995);
        ((GeneralPath) shape).curveTo(71.29301, 18.089994, 71.336006, 17.198996, 71.281006, 15.968995);
        ((GeneralPath) shape).lineTo(71.08201, 17.890995);
        ((GeneralPath) shape).curveTo(70.977005, 17.487995, 70.934006, 16.862995, 70.961006, 16.011995);
        ((GeneralPath) shape).curveTo(70.961006, 15.530995, 70.98801, 14.862995, 71.04301, 14.011995);
        ((GeneralPath) shape).lineTo(71.04301, 5.9299955);
        ((GeneralPath) shape).lineTo(70.684006, 5.7699957);
        ((GeneralPath) shape).lineTo(70.520004, 8.011995);
        ((GeneralPath) shape).curveTo(70.492004, 11.476995, 70.453, 13.597996, 70.40201, 14.3709955);
        ((GeneralPath) shape).lineTo(70.281006, 16.448996);
        ((GeneralPath) shape).curveTo(70.309006, 17.995996, 70.32001, 19.530996, 70.32001, 21.050995);
        ((GeneralPath) shape).curveTo(70.34801, 24.089994, 70.32001, 25.636995, 70.242004, 25.690994);
        ((GeneralPath) shape).lineTo(70.04301, 18.210995);
        ((GeneralPath) shape).lineTo(70.00001, 18.448996);
        ((GeneralPath) shape).lineTo(69.88301, 33.808994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_74
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.32, 36.172);
        ((GeneralPath) shape).lineTo(70.562, 36.25);
        ((GeneralPath) shape).lineTo(70.562, 36.211);
        ((GeneralPath) shape).curveTo(70.854996, 35.331997, 70.977, 34.106, 70.922, 32.531);
        ((GeneralPath) shape).curveTo(70.652, 31.835999, 70.52, 31.144999, 70.52, 30.448997);
        ((GeneralPath) shape).curveTo(70.492, 30.022997, 70.534996, 29.476997, 70.641, 28.808998);
        ((GeneralPath) shape).curveTo(70.641, 28.515999, 70.746, 28.050999, 70.961, 27.409998);
        ((GeneralPath) shape).curveTo(70.988, 27.355997, 71.132996, 26.714998, 71.397995, 25.487997);
        ((GeneralPath) shape).lineTo(71.602, 6.171997);
        ((GeneralPath) shape).lineTo(71.038994, 5.929997);
        ((GeneralPath) shape).lineTo(71.038994, 14.011997);
        ((GeneralPath) shape).curveTo(70.98799, 14.862997, 70.96099, 15.530997, 70.96099, 16.011997);
        ((GeneralPath) shape).curveTo(70.93399, 16.862997, 70.97299, 17.487997, 71.07799, 17.890997);
        ((GeneralPath) shape).lineTo(71.28099, 15.968997);
        ((GeneralPath) shape).curveTo(71.33199, 17.198997, 71.29299, 18.089996, 71.15999, 18.651997);
        ((GeneralPath) shape).curveTo(70.92199, 23.476997, 70.77299, 26.116997, 70.71899, 26.569996);
        ((GeneralPath) shape).curveTo(70.47999, 27.741997, 70.358986, 28.355995, 70.358986, 28.409996);
        ((GeneralPath) shape).lineTo(70.319984, 35.089996);
        ((GeneralPath) shape).curveTo(70.292984, 35.437996, 70.292984, 35.796997, 70.319984, 36.171997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3B3022));
        g.fill(shape);

        // _0_0_0_75
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.762, 17.371);
        ((GeneralPath) shape).curveTo(69.762, 22.195, 69.801, 25.203, 69.879, 26.391);
        ((GeneralPath) shape).curveTo(69.854996, 25.883001, 69.854996, 24.582, 69.879, 22.488);
        ((GeneralPath) shape).curveTo(69.934, 20.09, 69.973, 18.742, 70.0, 18.449001);
        ((GeneralPath) shape).lineTo(70.402, 14.371001);
        ((GeneralPath) shape).curveTo(70.453, 13.5980015, 70.492, 11.477001, 70.52, 8.012001);
        ((GeneralPath) shape).lineTo(70.68, 5.770001);
        ((GeneralPath) shape).lineTo(70.398, 5.691001);
        ((GeneralPath) shape).lineTo(70.082, 12.852001);
        ((GeneralPath) shape).curveTo(70.055, 11.836001, 70.016, 9.422001, 69.961, 5.609001);
        ((GeneralPath) shape).lineTo(69.52, 5.531001);
        ((GeneralPath) shape).lineTo(69.68, 8.250001);
        ((GeneralPath) shape).curveTo(69.734, 9.211001, 69.762, 12.250001, 69.762, 17.371002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_76
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.441, 34.332);
        ((GeneralPath) shape).lineTo(68.48, 33.93);
        ((GeneralPath) shape).lineTo(67.762, 35.77);
        ((GeneralPath) shape).lineTo(68.121, 35.77);
        ((GeneralPath) shape).curveTo(68.176, 35.449, 68.281006, 34.969, 68.441, 34.332);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_77
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.68, 33.211);
        ((GeneralPath) shape).lineTo(68.801, 35.851997);
        ((GeneralPath) shape).lineTo(68.961006, 35.851997);
        ((GeneralPath) shape).lineTo(68.879005, 31.530998);
        ((GeneralPath) shape).curveTo(68.883, 32.07, 68.816, 32.633, 68.68001, 33.211);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_78
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.402, 31.371);
        ((GeneralPath) shape).lineTo(65.359, 33.129);
        ((GeneralPath) shape).curveTo(65.414, 33.211002, 65.492004, 33.676003, 65.602, 34.531002);
        ((GeneralPath) shape).lineTo(65.762, 35.891003);
        ((GeneralPath) shape).lineTo(65.840004, 35.891003);
        ((GeneralPath) shape).lineTo(65.68, 34.289);
        ((GeneralPath) shape).curveTo(65.68, 33.145, 65.613, 32.238003, 65.48, 31.570002);
        ((GeneralPath) shape).lineTo(65.402, 31.371002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_79
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.082, 7.609);
        ((GeneralPath) shape).lineTo(65.883, 5.691);
        ((GeneralPath) shape).lineTo(65.840004, 5.731);
        ((GeneralPath) shape).lineTo(66.00001, 13.41);
        ((GeneralPath) shape).lineTo(66.08201, 7.6089997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_80
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.281, 5.93);
        ((GeneralPath) shape).lineTo(64.800995, 6.211);
        ((GeneralPath) shape).lineTo(65.202995, 8.852);
        ((GeneralPath) shape).lineTo(65.242, 8.371);
        ((GeneralPath) shape).curveTo(65.32, 7.2230005, 65.336, 6.4100003, 65.281, 5.9300003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_81
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.281, 8.93);
        ((GeneralPath) shape).lineTo(63.601997, 15.731001);
        ((GeneralPath) shape).curveTo(63.601997, 11.996001, 63.561996, 9.238001, 63.479996, 7.4490013);
        ((GeneralPath) shape).lineTo(63.479996, 7.1720014);
        ((GeneralPath) shape).lineTo(63.440994, 7.2110014);
        ((GeneralPath) shape).lineTo(63.358994, 9.289001);
        ((GeneralPath) shape).lineTo(63.280994, 8.930001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_82
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(67.242, 5.449);
        ((GeneralPath) shape).lineTo(68.043, 14.57);
        ((GeneralPath) shape).lineTo(67.84, 7.488);
        ((GeneralPath) shape).lineTo(67.35899, 5.449);
        ((GeneralPath) shape).lineTo(67.242, 5.449);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_83
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.402, 5.691);
        ((GeneralPath) shape).lineTo(69.961, 5.609);
        ((GeneralPath) shape).curveTo(70.016, 9.422, 70.055, 11.836, 70.082, 12.852);
        ((GeneralPath) shape).lineTo(70.402, 5.6910005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x281F16));
        g.fill(shape);

        // _0_0_0_84
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.562, 36.211);
        ((GeneralPath) shape).lineTo(70.562, 36.25);
        ((GeneralPath) shape).curveTo(71.38699, 36.516, 72.0, 36.824, 72.40199, 37.168);
        ((GeneralPath) shape).lineTo(72.882996, 34.25);
        ((GeneralPath) shape).curveTo(72.668, 34.223, 72.42999, 34.129, 72.159996, 33.969);
        ((GeneralPath) shape).curveTo(71.629, 33.648003, 71.215, 33.168003, 70.922, 32.531002);
        ((GeneralPath) shape).curveTo(70.977, 34.106003, 70.854996, 35.332, 70.562, 36.211002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_85
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(72.359, 17.332);
        ((GeneralPath) shape).lineTo(72.602, 17.25);
        ((GeneralPath) shape).lineTo(72.602, 6.969);
        ((GeneralPath) shape).curveTo(72.227, 6.598, 71.895, 6.332, 71.602, 6.172);
        ((GeneralPath) shape).lineTo(71.402, 25.487999);
        ((GeneralPath) shape).curveTo(71.453, 25.304998, 71.586, 23.862999, 71.801, 21.171999);
        ((GeneralPath) shape).curveTo(72.016, 18.690998, 72.203, 17.41, 72.359, 17.331999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_86
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.801, 35.852);
        ((GeneralPath) shape).lineTo(68.641, 31.691002);
        ((GeneralPath) shape).curveTo(68.562, 31.930002, 68.523, 32.277, 68.523, 32.731003);
        ((GeneralPath) shape).curveTo(68.523, 33.266003, 68.508, 33.664, 68.48, 33.930004);
        ((GeneralPath) shape).lineTo(68.441, 34.332005);
        ((GeneralPath) shape).curveTo(68.281, 34.969006, 68.176, 35.449005, 68.121, 35.770004);
        ((GeneralPath) shape).lineTo(68.801, 35.852005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_87
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.16, 8.449);
        ((GeneralPath) shape).lineTo(66.121, 5.6480002);
        ((GeneralPath) shape).lineTo(65.883, 5.6910005);
        ((GeneralPath) shape).lineTo(66.16, 8.449);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_88
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.242, 33.012);
        ((GeneralPath) shape).lineTo(65.159996, 36.051003);
        ((GeneralPath) shape).lineTo(65.76199, 35.891003);
        ((GeneralPath) shape).lineTo(65.60199, 34.531002);
        ((GeneralPath) shape).curveTo(65.49199, 33.676003, 65.41399, 33.211002, 65.35899, 33.129);
        ((GeneralPath) shape).lineTo(65.242, 33.012);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_89
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.961, 27.41);
        ((GeneralPath) shape).curveTo(70.988, 27.355999, 71.137, 26.715, 71.402, 25.487999);
        ((GeneralPath) shape).curveTo(71.43, 25.390999, 71.484, 24.945, 71.562004, 24.147999);
        ((GeneralPath) shape).curveTo(71.242004, 25.699, 70.996, 26.945, 70.82001, 27.890999);
        ((GeneralPath) shape).curveTo(70.85901, 27.737999, 70.906006, 27.578, 70.961006, 27.409998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(71.562, 24.147999);
        ((GeneralPath) shape).curveTo(71.848, 22.714998, 72.190994, 21.015999, 72.602, 19.050999);
        ((GeneralPath) shape).lineTo(72.602, 17.249998);
        ((GeneralPath) shape).lineTo(72.359, 17.331999);
        ((GeneralPath) shape).curveTo(72.203, 17.409998, 72.016, 18.690998, 71.801, 21.171999);
        ((GeneralPath) shape).curveTo(71.699005, 22.445, 71.621, 23.440998, 71.562004, 24.147999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_90
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.0, 37.289);
        ((GeneralPath) shape).lineTo(63.0, 37.531002);
        ((GeneralPath) shape).curveTo(63.137, 37.289, 63.32, 37.063004, 63.562, 36.852);
        ((GeneralPath) shape).lineTo(63.562, 32.449);
        ((GeneralPath) shape).curveTo(63.562, 32.051003, 63.535, 31.398, 63.48, 30.488);
        ((GeneralPath) shape).curveTo(63.453, 29.637001, 63.48, 28.984001, 63.562, 28.531);
        ((GeneralPath) shape).curveTo(63.723, 29.57, 63.84, 30.648, 63.922, 31.77);
        ((GeneralPath) shape).curveTo(63.922, 31.211, 63.867, 30.383001, 63.762, 29.289001);
        ((GeneralPath) shape).curveTo(64.215004, 32.356003, 64.492004, 34.664, 64.602, 36.211002);
        ((GeneralPath) shape).lineTo(64.641, 36.211002);
        ((GeneralPath) shape).curveTo(64.668, 35.090004, 64.656, 33.516003, 64.602, 31.488003);
        ((GeneralPath) shape).lineTo(64.562, 18.648003);
        ((GeneralPath) shape).curveTo(64.562, 17.852003, 64.507996, 16.598003, 64.40199, 14.891003);
        ((GeneralPath) shape).curveTo(64.40199, 14.598002, 64.38699, 13.7420025, 64.35899, 12.332003);
        ((GeneralPath) shape).curveTo(64.30899, 10.969003, 64.25399, 10.129003, 64.202995, 9.813003);
        ((GeneralPath) shape).lineTo(64.159996, 9.609003);
        ((GeneralPath) shape).lineTo(64.242, 15.449003);
        ((GeneralPath) shape).curveTo(64.242, 15.742003, 64.309, 21.184004, 64.440994, 31.770002);
        ((GeneralPath) shape).lineTo(63.761993, 16.648003);
        ((GeneralPath) shape).lineTo(63.679993, 25.570004);
        ((GeneralPath) shape).curveTo(63.440994, 24.852003, 63.214993, 22.742004, 62.999992, 19.250004);
        ((GeneralPath) shape).curveTo(62.788994, 15.652004, 62.58599, 13.531004, 62.401993, 12.891004);
        ((GeneralPath) shape).lineTo(62.561993, 16.731003);
        ((GeneralPath) shape).lineTo(62.64099, 17.133003);
        ((GeneralPath) shape).curveTo(62.749992, 17.477003, 62.82799, 18.957003, 62.88299, 21.570004);
        ((GeneralPath) shape).curveTo(62.93399, 24.426003, 62.976994, 25.945004, 62.999992, 26.133003);
        ((GeneralPath) shape).lineTo(63.12099, 26.172003);
        ((GeneralPath) shape).curveTo(63.14799, 26.438004, 63.159992, 27.703003, 63.159992, 29.973003);
        ((GeneralPath) shape).lineTo(63.159992, 32.852005);
        ((GeneralPath) shape).curveTo(63.159992, 33.836006, 63.108994, 35.316006, 62.999992, 37.289005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6B563D));
        g.fill(shape);

        // _0_0_0_91
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(67.441, 33.09);
        ((GeneralPath) shape).lineTo(68.043, 29.211);
        ((GeneralPath) shape).curveTo(68.254, 27.664, 68.375, 26.356, 68.402, 25.289001);
        ((GeneralPath) shape).curveTo(68.402, 24.145, 68.32, 22.410002, 68.16, 20.090002);
        ((GeneralPath) shape).curveTo(67.977005, 17.371002, 67.773, 15.715002, 67.562004, 15.129002);
        ((GeneralPath) shape).curveTo(67.242004, 14.277001, 67.04301, 13.543001, 66.961006, 12.930002);
        ((GeneralPath) shape).curveTo(66.961006, 10.266003, 66.922005, 8.863003, 66.840004, 8.731003);
        ((GeneralPath) shape).curveTo(66.762, 9.344003, 66.72301, 11.570003, 66.72301, 15.410003);
        ((GeneralPath) shape).lineTo(66.76201, 32.930004);
        ((GeneralPath) shape).lineTo(66.56201, 28.852005);
        ((GeneralPath) shape).lineTo(66.52001, 35.809006);
        ((GeneralPath) shape).curveTo(66.680016, 35.781006, 66.89501, 35.770004, 67.16001, 35.770004);
        ((GeneralPath) shape).curveTo(67.18801, 35.129005, 67.28101, 34.238003, 67.44101, 33.090004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_92
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.0, 18.531);
        ((GeneralPath) shape).curveTo(65.949, 24.742, 65.934, 28.371, 65.961, 29.41);
        ((GeneralPath) shape).lineTo(66.0, 33.813);
        ((GeneralPath) shape).curveTo(66.082, 29.57, 66.109, 27.199, 66.082, 26.691);
        ((GeneralPath) shape).lineTo(66.363, 29.332);
        ((GeneralPath) shape).lineTo(66.363, 25.332);
        ((GeneralPath) shape).curveTo(66.363, 20.078001, 66.293, 16.746, 66.159996, 15.332001);
        ((GeneralPath) shape).lineTo(66.08199, 13.731001);
        ((GeneralPath) shape).curveTo(66.02699, 14.2890005, 65.99999, 15.559001, 65.99999, 17.531);
        ((GeneralPath) shape).lineTo(65.99999, 18.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_93
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(62.602, 38.051);
        ((GeneralPath) shape).lineTo(62.602, 38.77);
        ((GeneralPath) shape).lineTo(62.641003, 38.77);
        ((GeneralPath) shape).curveTo(62.641003, 38.316, 62.762, 37.902, 63.000004, 37.531002);
        ((GeneralPath) shape).lineTo(63.000004, 37.289);
        ((GeneralPath) shape).curveTo(63.109005, 35.316, 63.160004, 33.836002, 63.160004, 32.852);
        ((GeneralPath) shape).lineTo(63.160004, 29.969002);
        ((GeneralPath) shape).curveTo(63.160004, 27.703001, 63.148003, 26.438002, 63.121002, 26.172);
        ((GeneralPath) shape).lineTo(63.000004, 26.129002);
        ((GeneralPath) shape).curveTo(62.977005, 25.945002, 62.934002, 24.422, 62.883003, 21.570002);
        ((GeneralPath) shape).curveTo(62.828003, 18.957, 62.750004, 17.477001, 62.641003, 17.129002);
        ((GeneralPath) shape).lineTo(62.562004, 16.731);
        ((GeneralPath) shape).curveTo(62.586002, 17.77, 62.602005, 19.648, 62.602005, 22.371);
        ((GeneralPath) shape).curveTo(62.602005, 25.305, 62.586006, 27.063, 62.562004, 27.652);
        ((GeneralPath) shape).curveTo(62.508003, 29.09, 62.520004, 32.555, 62.602005, 38.051003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x83694A));
        g.fill(shape);

        // _0_0_0_94
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.043, 36.531);
        ((GeneralPath) shape).lineTo(64.602, 36.211);
        ((GeneralPath) shape).curveTo(64.492, 34.663998, 64.215, 32.356, 63.761997, 29.288998);
        ((GeneralPath) shape).curveTo(63.866997, 30.382998, 63.921997, 31.210999, 63.921997, 31.769997);
        ((GeneralPath) shape).lineTo(63.961, 32.288998);
        ((GeneralPath) shape).curveTo(63.961, 34.156, 63.988, 35.569996, 64.043, 36.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_95
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.082, 26.731);
        ((GeneralPath) shape).lineTo(66.082, 26.691);
        ((GeneralPath) shape).lineTo(66.082, 26.731);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(66.082, 26.852001);
        ((GeneralPath) shape).curveTo(66.102, 27.598001, 66.074, 29.918001, 66.0, 33.809002);
        ((GeneralPath) shape).lineTo(65.961, 35.852);
        ((GeneralPath) shape).lineTo(66.159996, 35.852);
        ((GeneralPath) shape).lineTo(66.52, 35.809002);
        ((GeneralPath) shape).lineTo(66.08199, 26.852001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_96
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.641, 5.531);
        ((GeneralPath) shape).lineTo(66.121, 5.6480002);
        ((GeneralPath) shape).lineTo(66.762, 32.93);
        ((GeneralPath) shape).lineTo(66.641, 5.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_97
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.242, 15.449);
        ((GeneralPath) shape).lineTo(64.159996, 9.609);
        ((GeneralPath) shape).curveTo(64.159996, 8.996, 64.10899, 8.637, 63.999996, 8.531);
        ((GeneralPath) shape).lineTo(63.921997, 8.488);
        ((GeneralPath) shape).curveTo(63.761997, 8.465, 63.679996, 8.582, 63.679996, 8.848);
        ((GeneralPath) shape).lineTo(63.679996, 15.487999);
        ((GeneralPath) shape).lineTo(64.440994, 31.769999);
        ((GeneralPath) shape).curveTo(64.30899, 21.183998, 64.242, 15.741999, 64.242, 15.448999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_98
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.52, 37.648);
        ((GeneralPath) shape).lineTo(66.723, 37.608997);
        ((GeneralPath) shape).lineTo(66.762, 37.051);
        ((GeneralPath) shape).curveTo(65.801, 37.101997, 65.066, 37.315998, 64.562004, 37.690998);
        ((GeneralPath) shape).lineTo(64.441, 38.331997);
        ((GeneralPath) shape).curveTo(64.656, 38.222996, 64.934, 38.222996, 65.281, 38.331997);
        ((GeneralPath) shape).lineTo(65.32, 38.371);
        ((GeneralPath) shape).curveTo(65.48, 38.128998, 65.883, 37.891, 66.52, 37.648);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA88760));
        g.fill(shape);

        // _0_0_0_99
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.0, 39.25);
        ((GeneralPath) shape).lineTo(65.801, 38.969);
        ((GeneralPath) shape).lineTo(65.16, 38.852);
        ((GeneralPath) shape).lineTo(65.04301, 39.012);
        ((GeneralPath) shape).lineTo(65.00001, 39.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_100
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.723, 38.648);
        ((GeneralPath) shape).lineTo(66.723, 38.41);
        ((GeneralPath) shape).lineTo(65.641, 38.57);
        ((GeneralPath) shape).lineTo(66.043, 38.891);
        ((GeneralPath) shape).lineTo(66.723, 38.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_101
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.961, 39.25);
        ((GeneralPath) shape).lineTo(65.082, 38.852);
        ((GeneralPath) shape).curveTo(64.734, 38.742, 64.508, 38.598, 64.398, 38.41);
        ((GeneralPath) shape).curveTo(64.348, 38.809, 64.332, 39.102, 64.359, 39.289);
        ((GeneralPath) shape).lineTo(64.359, 39.449);
        ((GeneralPath) shape).lineTo(64.961, 39.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_102
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.961, 37.051);
        ((GeneralPath) shape).lineTo(66.961, 37.57);
        ((GeneralPath) shape).curveTo(67.547, 37.438, 67.772995, 37.609, 67.641, 38.09);
        ((GeneralPath) shape).curveTo(67.613, 38.223, 67.387, 38.316, 66.961, 38.371);
        ((GeneralPath) shape).lineTo(66.961, 38.57);
        ((GeneralPath) shape).lineTo(70.121, 37.609);
        ((GeneralPath) shape).lineTo(70.043, 37.488003);
        ((GeneralPath) shape).curveTo(68.949, 37.145004, 67.922, 36.996002, 66.961, 37.051003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_103
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.242, 37.172);
        ((GeneralPath) shape).curveTo(62.84, 37.652, 62.629, 38.199, 62.602, 38.813);
        ((GeneralPath) shape).lineTo(62.641003, 39.051);
        ((GeneralPath) shape).curveTo(62.855003, 38.198997, 63.348003, 37.426, 64.121, 36.731);
        ((GeneralPath) shape).curveTo(64.363, 36.465, 64.773, 36.315998, 65.363, 36.288998);
        ((GeneralPath) shape).curveTo(65.68, 36.266, 66.121, 36.249996, 66.68, 36.249996);
        ((GeneralPath) shape).lineTo(67.359, 36.128998);
        ((GeneralPath) shape).curveTo(67.629, 36.106, 67.840004, 36.106, 68.0, 36.128998);
        ((GeneralPath) shape).curveTo(68.32, 36.156, 68.773, 36.223, 69.359, 36.331997);
        ((GeneralPath) shape).curveTo(69.492004, 36.331997, 69.762, 36.382996, 70.16, 36.487995);
        ((GeneralPath) shape).curveTo(70.508, 36.569996, 70.789, 36.597996, 71.0, 36.569996);
        ((GeneralPath) shape).lineTo(71.402, 36.569996);
        ((GeneralPath) shape).curveTo(69.828, 35.851997, 68.082, 35.608997, 66.16, 35.851997);
        ((GeneralPath) shape).curveTo(64.828, 36.011997, 63.855003, 36.448997, 63.242004, 37.171997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_104
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.922, 39.09);
        ((GeneralPath) shape).lineTo(63.961002, 39.09);
        ((GeneralPath) shape).curveTo(64.121, 39.09, 64.254005, 39.211, 64.359, 39.449);
        ((GeneralPath) shape).lineTo(64.359, 39.289);
        ((GeneralPath) shape).curveTo(64.336, 39.106003, 64.348, 38.809002, 64.402, 38.41);
        ((GeneralPath) shape).lineTo(64.359, 38.371);
        ((GeneralPath) shape).lineTo(64.441, 38.331997);
        ((GeneralPath) shape).lineTo(64.602005, 37.448997);
        ((GeneralPath) shape).lineTo(64.203, 38.051);
        ((GeneralPath) shape).lineTo(64.082, 38.41);
        ((GeneralPath) shape).curveTo(63.977, 38.676, 63.922, 38.902, 63.922, 39.09);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x876C4D));
        g.fill(shape);

        // _0_0_0_105
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.961, 37.57);
        ((GeneralPath) shape).lineTo(66.961, 38.371);
        ((GeneralPath) shape).curveTo(67.387, 38.315998, 67.613, 38.223, 67.641, 38.09);
        ((GeneralPath) shape).curveTo(67.773, 37.609, 67.547, 37.438, 66.961, 37.57);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_106
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.32, 38.371);
        ((GeneralPath) shape).lineTo(65.641, 38.57);
        ((GeneralPath) shape).lineTo(66.723, 38.41);
        ((GeneralPath) shape).lineTo(66.723, 38.328);
        ((GeneralPath) shape).curveTo(66.695, 38.09, 66.695, 37.848, 66.723, 37.608997);
        ((GeneralPath) shape).lineTo(66.52, 37.648);
        ((GeneralPath) shape).curveTo(65.882996, 37.891, 65.479996, 38.128998, 65.32, 38.371);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_107
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.801, 38.969);
        ((GeneralPath) shape).lineTo(66.043, 38.891003);
        ((GeneralPath) shape).lineTo(65.641, 38.570004);
        ((GeneralPath) shape).lineTo(65.32, 38.371002);
        ((GeneralPath) shape).lineTo(65.281, 38.332);
        ((GeneralPath) shape).curveTo(64.934, 38.223, 64.656, 38.223, 64.441, 38.332);
        ((GeneralPath) shape).lineTo(64.359, 38.371002);
        ((GeneralPath) shape).lineTo(64.402, 38.410004);
        ((GeneralPath) shape).curveTo(64.508, 38.598003, 64.734, 38.742004, 65.082, 38.852005);
        ((GeneralPath) shape).lineTo(65.16, 38.852005);
        ((GeneralPath) shape).lineTo(65.801, 38.969006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_108
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.723, 38.648);
        ((GeneralPath) shape).lineTo(66.961, 38.57);
        ((GeneralPath) shape).lineTo(66.961, 37.051);
        ((GeneralPath) shape).curveTo(66.961, 36.758, 66.934, 36.555, 66.879, 36.448997);
        ((GeneralPath) shape).lineTo(66.762, 37.051);
        ((GeneralPath) shape).lineTo(66.723, 37.608997);
        ((GeneralPath) shape).curveTo(66.695, 37.851997, 66.695, 38.089996, 66.723, 38.328);
        ((GeneralPath) shape).lineTo(66.723, 38.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_109
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.359, 39.449);
        ((GeneralPath) shape).curveTo(64.254, 39.211002, 64.121, 39.09, 63.961002, 39.09);
        ((GeneralPath) shape).lineTo(63.922, 39.09);
        ((GeneralPath) shape).curveTo(63.789, 39.09, 63.426003, 39.25, 62.84, 39.57);
        ((GeneralPath) shape).curveTo(63.027, 39.809, 63.203, 39.891, 63.359, 39.809);
        ((GeneralPath) shape).lineTo(64.359, 39.448997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x66513A));
        g.fill(shape);

        // _0_0_0_110
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.043, 37.488);
        ((GeneralPath) shape).lineTo(70.121, 37.608997);
        ((GeneralPath) shape).curveTo(70.977005, 37.398, 71.734, 37.249996, 72.402, 37.167995);
        ((GeneralPath) shape).curveTo(72.242, 37.034996, 72.004, 36.890995, 71.684, 36.730995);
        ((GeneralPath) shape).lineTo(71.441, 36.769997);
        ((GeneralPath) shape).curveTo(70.508, 36.823997, 69.777, 36.940998, 69.242004, 37.128998);
        ((GeneralPath) shape).curveTo(69.72301, 37.315998, 69.98801, 37.437996, 70.04301, 37.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_111
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.602, 33.371);
        ((GeneralPath) shape).lineTo(71.723, 33.288998);
        ((GeneralPath) shape).curveTo(72.469, 33.128998, 72.828, 32.714996, 72.801, 32.051);
        ((GeneralPath) shape).lineTo(72.562004, 16.890999);
        ((GeneralPath) shape).curveTo(72.242004, 17.289, 72.082, 17.714998, 72.082, 18.171999);
        ((GeneralPath) shape).lineTo(71.441, 22.890999);
        ((GeneralPath) shape).lineTo(71.203, 21.890999);
        ((GeneralPath) shape).lineTo(71.203, 24.890999);
        ((GeneralPath) shape).curveTo(71.203, 25.477, 71.137, 25.581999, 71.0, 25.210999);
        ((GeneralPath) shape).curveTo(70.867, 24.862999, 70.801, 24.530998, 70.801, 24.210999);
        ((GeneralPath) shape).curveTo(70.562004, 21.624998, 70.441, 20.421999, 70.441, 20.609);
        ((GeneralPath) shape).lineTo(70.402, 28.609);
        ((GeneralPath) shape).curveTo(70.402, 29.703, 70.441, 30.824, 70.52, 31.969);
        ((GeneralPath) shape).lineTo(70.602, 33.371);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x281F16));
        g.fill(shape);

        // _0_0_0_112
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.641, 32.609);
        ((GeneralPath) shape).curveTo(65.695, 32.531002, 65.707, 32.25, 65.68, 31.77);
        ((GeneralPath) shape).curveTo(65.656, 31.316, 65.695, 31.078001, 65.801, 31.051);
        ((GeneralPath) shape).curveTo(65.91, 31.184, 66.016, 31.465, 66.121, 31.891);
        ((GeneralPath) shape).lineTo(66.16, 30.129002);
        ((GeneralPath) shape).curveTo(65.949005, 29.277002, 65.812004, 28.625002, 65.762, 28.172);
        ((GeneralPath) shape).lineTo(65.520004, 31.289001);
        ((GeneralPath) shape).curveTo(65.520004, 31.051, 65.469, 30.691002, 65.359, 30.211002);
        ((GeneralPath) shape).lineTo(65.203, 28.531002);
        ((GeneralPath) shape).curveTo(65.094, 28.852001, 65.027, 29.344002, 65.0, 30.012001);
        ((GeneralPath) shape).curveTo(64.977, 30.703001, 64.922, 31.199001, 64.84, 31.492);
        ((GeneralPath) shape).lineTo(64.84, 31.531);
        ((GeneralPath) shape).lineTo(65.043, 32.289);
        ((GeneralPath) shape).lineTo(65.082, 31.770002);
        ((GeneralPath) shape).curveTo(65.082, 31.289001, 65.109, 30.582003, 65.16, 29.652002);
        ((GeneralPath) shape).curveTo(65.29301, 30.426003, 65.375, 31.000002, 65.402, 31.371002);
        ((GeneralPath) shape).curveTo(65.402, 31.398003, 65.43, 31.609003, 65.48, 32.012);
        ((GeneralPath) shape).curveTo(65.508, 32.305, 65.562004, 32.504, 65.64101, 32.609);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4E3F2D));
        g.fill(shape);

        // _0_0_0_113
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.801, 29.012);
        ((GeneralPath) shape).lineTo(68.840004, 29.852);
        ((GeneralPath) shape).lineTo(68.922005, 30.09);
        ((GeneralPath) shape).lineTo(68.922005, 29.449);
        ((GeneralPath) shape).lineTo(68.801, 29.012);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_114
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(67.922, 30.969);
        ((GeneralPath) shape).lineTo(68.35899, 30.93);
        ((GeneralPath) shape).curveTo(68.35899, 30.742, 68.468994, 29.902, 68.67999, 28.41);
        ((GeneralPath) shape).lineTo(68.60199, 27.891);
        ((GeneralPath) shape).curveTo(68.51999, 27.356, 68.42599, 26.543001, 68.31999, 25.449001);
        ((GeneralPath) shape).lineTo(68.24199, 25.250002);
        ((GeneralPath) shape).lineTo(68.24199, 25.488003);
        ((GeneralPath) shape).curveTo(68.24199, 27.598003, 68.17599, 29.145002, 68.04299, 30.129002);
        ((GeneralPath) shape).lineTo(67.88299, 30.731);
        ((GeneralPath) shape).lineTo(67.722984, 30.809);
        ((GeneralPath) shape).lineTo(67.358986, 31.25);
        ((GeneralPath) shape).lineTo(67.042984, 31.25);
        ((GeneralPath) shape).lineTo(67.15998, 31.77);
        ((GeneralPath) shape).curveTo(67.24198, 31.715, 67.33598, 31.609001, 67.44098, 31.449001);
        ((GeneralPath) shape).curveTo(67.67998, 31.129002, 67.83998, 30.969002, 67.92198, 30.969002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_115
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.082, 31.371);
        ((GeneralPath) shape).curveTo(70.137, 31.398, 70.227, 31.371, 70.363, 31.289);
        ((GeneralPath) shape).lineTo(70.762, 31.09);
        ((GeneralPath) shape).curveTo(70.844, 30.742, 70.949, 30.238, 71.082, 29.57);
        ((GeneralPath) shape).curveTo(71.082, 28.397999, 71.066, 27.703, 71.043, 27.487999);
        ((GeneralPath) shape).lineTo(70.723, 28.331999);
        ((GeneralPath) shape).lineTo(70.441, 29.808998);
        ((GeneralPath) shape).curveTo(70.336, 29.647999, 70.281, 29.315998, 70.281, 28.808998);
        ((GeneralPath) shape).curveTo(70.309, 28.542997, 70.336, 28.210999, 70.363, 27.808998);
        ((GeneralPath) shape).curveTo(70.363, 27.409998, 70.402, 26.823997, 70.479996, 26.050999);
        ((GeneralPath) shape).curveTo(70.42999, 26.050999, 70.38699, 26.022999, 70.363, 25.968998);
        ((GeneralPath) shape).curveTo(70.309, 25.753998, 70.27, 25.620998, 70.242, 25.569998);
        ((GeneralPath) shape).lineTo(70.120995, 23.890997);
        ((GeneralPath) shape).curveTo(70.093994, 23.702997, 70.05499, 23.355997, 70.004, 22.847998);
        ((GeneralPath) shape).lineTo(69.961, 23.569998);
        ((GeneralPath) shape).lineTo(69.84, 24.210999);
        ((GeneralPath) shape).curveTo(69.73399, 24.769999, 69.695, 25.503998, 69.723, 26.409998);
        ((GeneralPath) shape).curveTo(69.75, 27.769999, 69.762, 28.515999, 69.762, 28.647999);
        ((GeneralPath) shape).curveTo(69.629, 29.343998, 69.535, 29.874998, 69.48, 30.249998);
        ((GeneralPath) shape).lineTo(69.64101, 31.011997);
        ((GeneralPath) shape).lineTo(69.80101, 31.128998);
        ((GeneralPath) shape).curveTo(69.93401, 31.265997, 70.02701, 31.343998, 70.08201, 31.370998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_116
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.762, 33.129);
        ((GeneralPath) shape).curveTo(63.949, 33.129, 64.043, 32.582, 64.043, 31.488);
        ((GeneralPath) shape).lineTo(63.922, 31.531);
        ((GeneralPath) shape).curveTo(63.84, 31.582, 63.746002, 31.715, 63.641003, 31.93);
        ((GeneralPath) shape).curveTo(63.535004, 32.199, 63.465004, 32.356, 63.441, 32.41);
        ((GeneralPath) shape).curveTo(63.281002, 32.117, 63.121002, 32.023, 62.961002, 32.129);
        ((GeneralPath) shape).curveTo(62.879, 32.211002, 62.801003, 32.383003, 62.719, 32.648003);
        ((GeneralPath) shape).curveTo(62.613003, 32.918003, 62.559002, 33.117004, 62.559002, 33.250004);
        ((GeneralPath) shape).lineTo(62.52, 33.250004);
        ((GeneralPath) shape).lineTo(62.52, 33.648003);
        ((GeneralPath) shape).lineTo(63.043, 33.172);
        ((GeneralPath) shape).curveTo(63.148, 32.719, 63.226997, 32.477, 63.281, 32.449);
        ((GeneralPath) shape).curveTo(63.386997, 32.398003, 63.546997, 32.625, 63.761997, 33.129);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_117
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.281, 28.809);
        ((GeneralPath) shape).curveTo(70.281, 29.316, 70.336, 29.648, 70.441, 29.809);
        ((GeneralPath) shape).lineTo(70.723, 28.332);
        ((GeneralPath) shape).lineTo(71.043, 27.488);
        ((GeneralPath) shape).curveTo(71.066, 27.703001, 71.082, 28.398, 71.082, 29.570002);
        ((GeneralPath) shape).curveTo(71.215004, 29.172, 71.281, 28.813002, 71.281, 28.488);
        ((GeneralPath) shape).lineTo(71.32, 27.531);
        ((GeneralPath) shape).lineTo(71.363, 27.531);
        ((GeneralPath) shape).curveTo(71.336, 27.238, 71.254, 26.996, 71.121, 26.813);
        ((GeneralPath) shape).curveTo(70.801, 26.25, 70.629005, 25.862999, 70.602005, 25.652);
        ((GeneralPath) shape).curveTo(70.562004, 25.145, 70.535, 24.738, 70.523, 24.43);
        ((GeneralPath) shape).lineTo(70.48, 26.051);
        ((GeneralPath) shape).curveTo(70.402, 26.824001, 70.36301, 27.41, 70.36301, 27.809);
        ((GeneralPath) shape).curveTo(70.336006, 28.211, 70.309006, 28.543, 70.281006, 28.809);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3B3022));
        g.fill(shape);

        // _0_0_0_118
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.242, 32.57);
        ((GeneralPath) shape).curveTo(68.32, 32.383, 68.35899, 32.199, 68.35899, 32.012);
        ((GeneralPath) shape).curveTo(68.35899, 31.449001, 68.413994, 31.117, 68.52, 31.012001);
        ((GeneralPath) shape).curveTo(68.68, 31.172, 68.827995, 31.559002, 68.961, 32.172);
        ((GeneralPath) shape).lineTo(68.922, 30.09);
        ((GeneralPath) shape).lineTo(68.84, 29.852);
        ((GeneralPath) shape).lineTo(68.800995, 29.012);
        ((GeneralPath) shape).lineTo(68.84, 28.769999);
        ((GeneralPath) shape).lineTo(68.76199, 27.187998);
        ((GeneralPath) shape).curveTo(68.745995, 27.644999, 68.718994, 28.022997, 68.67999, 28.327997);
        ((GeneralPath) shape).lineTo(68.67999, 28.409998);
        ((GeneralPath) shape).curveTo(68.465, 29.901999, 68.35899, 30.741999, 68.35899, 30.929998);
        ((GeneralPath) shape).lineTo(67.922, 30.968998);
        ((GeneralPath) shape).curveTo(67.84, 30.968998, 67.68, 31.128998, 67.440994, 31.448997);
        ((GeneralPath) shape).curveTo(67.33199, 31.608997, 67.242, 31.714998, 67.159996, 31.769997);
        ((GeneralPath) shape).lineTo(67.202995, 32.050995);
        ((GeneralPath) shape).curveTo(67.413994, 32.530994, 67.629, 32.780994, 67.84, 32.808994);
        ((GeneralPath) shape).curveTo(68.0, 32.835995, 68.13699, 32.757996, 68.242, 32.569996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_119
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.359, 31.289);
        ((GeneralPath) shape).curveTo(70.227, 31.371, 70.137, 31.397999, 70.082, 31.371);
        ((GeneralPath) shape).curveTo(70.027, 31.344002, 69.934, 31.266, 69.801, 31.129);
        ((GeneralPath) shape).lineTo(69.641, 31.012);
        ((GeneralPath) shape).lineTo(69.68, 31.331999);
        ((GeneralPath) shape).curveTo(69.762, 31.438, 69.91, 31.530998, 70.121, 31.609);
        ((GeneralPath) shape).curveTo(70.336, 31.691, 70.496, 31.691, 70.602005, 31.609);
        ((GeneralPath) shape).curveTo(70.711006, 31.581999, 70.76201, 31.41, 70.76201, 31.09);
        ((GeneralPath) shape).lineTo(70.35901, 31.289);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_120
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.082, 31.77);
        ((GeneralPath) shape).lineTo(65.043, 32.289);
        ((GeneralPath) shape).lineTo(65.203, 32.731003);
        ((GeneralPath) shape).curveTo(65.203, 32.969, 65.254005, 33.145004, 65.359, 33.250004);
        ((GeneralPath) shape).curveTo(65.574, 33.356003, 65.762, 33.316006, 65.922005, 33.129005);
        ((GeneralPath) shape).curveTo(66.05501, 32.996006, 66.121, 32.813004, 66.121, 32.570007);
        ((GeneralPath) shape).lineTo(66.121, 31.891006);
        ((GeneralPath) shape).curveTo(66.016, 31.465006, 65.906006, 31.184006, 65.801, 31.051006);
        ((GeneralPath) shape).curveTo(65.695, 31.078007, 65.652, 31.316006, 65.68, 31.770006);
        ((GeneralPath) shape).curveTo(65.707, 32.250008, 65.695, 32.531006, 65.641, 32.609005);
        ((GeneralPath) shape).curveTo(65.562, 32.504005, 65.507996, 32.305004, 65.479996, 32.012005);
        ((GeneralPath) shape).curveTo(65.42999, 31.609005, 65.40199, 31.398005, 65.40199, 31.371004);
        ((GeneralPath) shape).curveTo(65.37499, 30.996004, 65.29299, 30.422005, 65.159996, 29.648005);
        ((GeneralPath) shape).curveTo(65.10899, 30.582005, 65.08199, 31.289005, 65.08199, 31.770004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_121
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.281, 33.051);
        ((GeneralPath) shape).curveTo(64.363, 32.731, 64.402, 32.398, 64.402, 32.051);
        ((GeneralPath) shape).lineTo(64.32, 31.647999);
        ((GeneralPath) shape).lineTo(64.121, 31.050999);
        ((GeneralPath) shape).lineTo(64.043, 31.487999);
        ((GeneralPath) shape).curveTo(64.043, 32.582, 63.948997, 33.128998, 63.762, 33.128998);
        ((GeneralPath) shape).curveTo(63.547, 32.624996, 63.387, 32.398, 63.281002, 32.448997);
        ((GeneralPath) shape).curveTo(63.227, 32.476997, 63.148003, 32.714996, 63.039, 33.168);
        ((GeneralPath) shape).lineTo(62.52, 33.648);
        ((GeneralPath) shape).lineTo(62.52, 34.25);
        ((GeneralPath) shape).lineTo(64.281, 33.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_122
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.961, 27.371);
        ((GeneralPath) shape).lineTo(68.961, 32.172);
        ((GeneralPath) shape).curveTo(68.827995, 31.555, 68.68, 31.172, 68.52, 31.012001);
        ((GeneralPath) shape).curveTo(68.413994, 31.117, 68.35899, 31.449001, 68.35899, 32.012);
        ((GeneralPath) shape).curveTo(68.35899, 32.199, 68.31999, 32.383, 68.242, 32.57);
        ((GeneralPath) shape).curveTo(68.13699, 32.758, 68.0, 32.836, 67.84, 32.813);
        ((GeneralPath) shape).curveTo(67.629, 32.785, 67.413994, 32.531, 67.202995, 32.051);
        ((GeneralPath) shape).lineTo(67.04299, 31.249998);
        ((GeneralPath) shape).lineTo(66.96099, 31.050999);
        ((GeneralPath) shape).lineTo(66.47999, 28.890999);
        ((GeneralPath) shape).curveTo(66.249985, 28.012, 66.12899, 27.484, 66.12099, 27.313);
        ((GeneralPath) shape).lineTo(66.12099, 32.57);
        ((GeneralPath) shape).curveTo(66.12099, 32.813, 66.054985, 32.996, 65.92199, 33.128998);
        ((GeneralPath) shape).curveTo(65.761986, 33.315998, 65.57399, 33.356, 65.358986, 33.249996);
        ((GeneralPath) shape).curveTo(65.25398, 33.144997, 65.20299, 32.968998, 65.20299, 32.730995);
        ((GeneralPath) shape).lineTo(64.80099, 31.409996);
        ((GeneralPath) shape).curveTo(64.64098, 30.663996, 64.53499, 30.249996, 64.47999, 30.167995);
        ((GeneralPath) shape).curveTo(64.47999, 30.780996, 64.46899, 31.237995, 64.44099, 31.530996);
        ((GeneralPath) shape).lineTo(64.44099, 31.769997);
        ((GeneralPath) shape).lineTo(64.401985, 32.050995);
        ((GeneralPath) shape).curveTo(64.401985, 32.397995, 64.358986, 32.730995, 64.28098, 33.050995);
        ((GeneralPath) shape).lineTo(62.522984, 34.249996);
        ((GeneralPath) shape).lineTo(62.601982, 38.809);
        ((GeneralPath) shape).lineTo(62.640984, 39.171997);
        ((GeneralPath) shape).curveTo(63.788982, 38.956997, 64.694984, 38.769997, 65.358986, 38.608997);
        ((GeneralPath) shape).curveTo(67.60199, 37.968998, 69.358986, 37.226997, 70.64098, 36.371);
        ((GeneralPath) shape).curveTo(71.62898, 35.758, 72.26598, 35.25, 72.56198, 34.851997);
        ((GeneralPath) shape).curveTo(72.694984, 34.663998, 72.78898, 34.464996, 72.83998, 34.249996);
        ((GeneralPath) shape).lineTo(72.80098, 34.249996);
        ((GeneralPath) shape).lineTo(72.47998, 34.132996);
        ((GeneralPath) shape).lineTo(72.40198, 34.132996);
        ((GeneralPath) shape).lineTo(71.88298, 33.808994);
        ((GeneralPath) shape).lineTo(71.51998, 33.487995);
        ((GeneralPath) shape).lineTo(71.51998, 33.448994);
        ((GeneralPath) shape).lineTo(71.44098, 33.370995);
        ((GeneralPath) shape).curveTo(72.37498, 33.265995, 72.82798, 32.823994, 72.80098, 32.050995);
        ((GeneralPath) shape).lineTo(72.76198, 31.769995);
        ((GeneralPath) shape).lineTo(72.72298, 31.608995);
        ((GeneralPath) shape).curveTo(72.612976, 31.210995, 72.226974, 30.022995, 71.56197, 28.050995);
        ((GeneralPath) shape).lineTo(71.35897, 27.530994);
        ((GeneralPath) shape).lineTo(71.31997, 27.530994);
        ((GeneralPath) shape).lineTo(71.28097, 28.487995);
        ((GeneralPath) shape).curveTo(71.28097, 28.808994, 71.214966, 29.171995, 71.08197, 29.569996);
        ((GeneralPath) shape).curveTo(70.94897, 30.237995, 70.83997, 30.741997, 70.76197, 31.089996);
        ((GeneralPath) shape).curveTo(70.76197, 31.409996, 70.70697, 31.581997, 70.60197, 31.608995);
        ((GeneralPath) shape).curveTo(70.49197, 31.690996, 70.33597, 31.690996, 70.120964, 31.608995);
        ((GeneralPath) shape).curveTo(69.909966, 31.530996, 69.76196, 31.437996, 69.67996, 31.331995);
        ((GeneralPath) shape).lineTo(69.479965, 30.249994);
        ((GeneralPath) shape).lineTo(69.44096, 30.128994);
        ((GeneralPath) shape).curveTo(69.28096, 29.569994, 69.159966, 29.011993, 69.08196, 28.448994);
        ((GeneralPath) shape).curveTo(69.01196, 28.030994, 68.97296, 27.671993, 68.96096, 27.370995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x281F16));
        g.fill(shape);

        // _0_0_0_123

        // _0_0_0_123_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.8f, 0, 0, 0.8f, 0.0011714f, -49.95f));

        // _0_0_0_123_0_0

        // _0_0_0_123_0_0_0

        // _0_0_0_123_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.52, 46.969);
        ((GeneralPath) shape).lineTo(28.562, 46.609);
        ((GeneralPath) shape).lineTo(31.359001, 45.731003);
        ((GeneralPath) shape).lineTo(31.359001, 45.691);
        ((GeneralPath) shape).lineTo(32.801003, 45.289);
        ((GeneralPath) shape).lineTo(33.121002, 45.25);
        ((GeneralPath) shape).lineTo(33.203003, 45.211);
        ((GeneralPath) shape).lineTo(34.203003, 45.011997);
        ((GeneralPath) shape).lineTo(34.320004, 45.011997);
        ((GeneralPath) shape).lineTo(34.520004, 44.968998);
        ((GeneralPath) shape).lineTo(34.602005, 44.968998);
        ((GeneralPath) shape).lineTo(34.723003, 44.929996);
        ((GeneralPath) shape).lineTo(34.922005, 44.929996);
        ((GeneralPath) shape).lineTo(35.402004, 42.011997);
        ((GeneralPath) shape).lineTo(35.359005, 42.011997);
        ((GeneralPath) shape).lineTo(35.359005, 41.968998);
        ((GeneralPath) shape).lineTo(35.043003, 41.891);
        ((GeneralPath) shape).lineTo(35.000004, 41.891);
        ((GeneralPath) shape).lineTo(34.961002, 41.851997);
        ((GeneralPath) shape).curveTo(34.668003, 41.714996, 34.480003, 41.608997, 34.402, 41.531);
        ((GeneralPath) shape).lineTo(34.0, 41.171997);
        ((GeneralPath) shape).lineTo(33.961, 41.089996);
        ((GeneralPath) shape).lineTo(34.203, 41.050995);
        ((GeneralPath) shape).lineTo(34.68, 40.890995);
        ((GeneralPath) shape).lineTo(34.723, 40.890995);
        ((GeneralPath) shape).lineTo(34.883, 40.769997);
        ((GeneralPath) shape).lineTo(34.961, 40.730995);
        ((GeneralPath) shape).lineTo(35.043, 40.608994);
        ((GeneralPath) shape).lineTo(35.121, 40.530994);
        ((GeneralPath) shape).lineTo(35.203, 40.409996);
        ((GeneralPath) shape).lineTo(35.242, 40.327995);
        ((GeneralPath) shape).lineTo(35.281002, 40.167995);
        ((GeneralPath) shape).lineTo(35.320004, 40.089996);
        ((GeneralPath) shape).lineTo(35.320004, 39.531);
        ((GeneralPath) shape).curveTo(35.266003, 38.304996, 35.203003, 34.063, 35.121002, 26.808998);
        ((GeneralPath) shape).lineTo(35.121002, 14.730998);
        ((GeneralPath) shape).lineTo(34.641003, 14.249998);
        ((GeneralPath) shape).lineTo(34.121002, 13.929998);
        ((GeneralPath) shape).lineTo(34.121002, 13.890999);
        ((GeneralPath) shape).lineTo(33.883003, 13.808999);
        ((GeneralPath) shape).lineTo(33.602005, 13.647999);
        ((GeneralPath) shape).lineTo(33.520004, 13.647999);
        ((GeneralPath) shape).lineTo(32.922005, 13.448998);
        ((GeneralPath) shape).lineTo(32.883003, 13.409999);
        ((GeneralPath) shape).lineTo(32.762005, 13.409999);
        ((GeneralPath) shape).lineTo(32.320004, 13.288999);
        ((GeneralPath) shape).lineTo(32.082005, 13.288999);
        ((GeneralPath) shape).lineTo(32.043003, 13.249999);
        ((GeneralPath) shape).lineTo(31.281004, 13.2109995);
        ((GeneralPath) shape).curveTo(31.148005, 13.183999, 30.934004, 13.167999, 30.641005, 13.167999);
        ((GeneralPath) shape).lineTo(29.160004, 13.249999);
        ((GeneralPath) shape).lineTo(28.961004, 13.288999);
        ((GeneralPath) shape).lineTo(28.441004, 13.448998);
        ((GeneralPath) shape).lineTo(28.359003, 13.448998);
        ((GeneralPath) shape).lineTo(28.203003, 13.530998);
        ((GeneralPath) shape).curveTo(27.215002, 13.878998, 26.094004, 14.730998, 24.840004, 16.089998);
        ((GeneralPath) shape).lineTo(24.961004, 20.690998);
        ((GeneralPath) shape).lineTo(24.922005, 20.608997);
        ((GeneralPath) shape).lineTo(25.121004, 35.409996);
        ((GeneralPath) shape).curveTo(25.070004, 36.343994, 25.043005, 38.194996, 25.043005, 40.968994);
        ((GeneralPath) shape).lineTo(25.160006, 46.968994);
        ((GeneralPath) shape).curveTo(25.320005, 47.288994, 25.496006, 47.476994, 25.680006, 47.530994);
        ((GeneralPath) shape).curveTo(25.789005, 47.554993, 25.867006, 47.554993, 25.922007, 47.530994);
        ((GeneralPath) shape).lineTo(26.320007, 47.409996);
        ((GeneralPath) shape).lineTo(26.883007, 47.167995);
        ((GeneralPath) shape).lineTo(26.922007, 47.167995);
        ((GeneralPath) shape).lineTo(27.480007, 47.007996);
        ((GeneralPath) shape).lineTo(27.520008, 46.968994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(37.150001525878906, 84.9000015258789), 25.3f, new Point2D.Double(37.150001525878906, 84.9000015258789), new float[]{0, 1}, new Color[]{BLACK, BLACK}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_123_0_0

        // _0_0_0_124

        // _0_0_0_124_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.8f, 0, 0, 0.8f, 0.0011714f, -67.79f));

        // _0_0_0_124_0_0

        // _0_0_0_124_0_0_0

        // _0_0_0_124_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(62.641, 39.211);
        ((GeneralPath) shape).curveTo(62.773, 39.531, 62.934, 39.731, 63.121, 39.809);
        ((GeneralPath) shape).curveTo(63.226997, 39.836, 63.309, 39.836, 63.363, 39.809);
        ((GeneralPath) shape).lineTo(64.961, 39.25);
        ((GeneralPath) shape).lineTo(65.004, 39.25);
        ((GeneralPath) shape).lineTo(65.723, 39.012);
        ((GeneralPath) shape).lineTo(65.801, 38.969);
        ((GeneralPath) shape).lineTo(67.562004, 38.371002);
        ((GeneralPath) shape).lineTo(67.64101, 38.371002);
        ((GeneralPath) shape).lineTo(68.242004, 38.168003);
        ((GeneralPath) shape).lineTo(68.281006, 38.168003);
        ((GeneralPath) shape).lineTo(70.602005, 37.488003);
        ((GeneralPath) shape).lineTo(70.684006, 37.488003);
        ((GeneralPath) shape).lineTo(71.684006, 37.289);
        ((GeneralPath) shape).lineTo(71.76201, 37.289);
        ((GeneralPath) shape).lineTo(71.961006, 37.25);
        ((GeneralPath) shape).lineTo(72.08201, 37.211);
        ((GeneralPath) shape).lineTo(72.35901, 37.211);
        ((GeneralPath) shape).lineTo(72.40201, 37.171997);
        ((GeneralPath) shape).lineTo(72.88301, 34.249996);
        ((GeneralPath) shape).lineTo(72.80101, 34.249996);
        ((GeneralPath) shape).lineTo(72.52001, 34.171997);
        ((GeneralPath) shape).lineTo(72.48001, 34.128998);
        ((GeneralPath) shape).lineTo(72.40201, 34.128998);
        ((GeneralPath) shape).lineTo(71.88301, 33.809);
        ((GeneralPath) shape).lineTo(71.76201, 33.690998);
        ((GeneralPath) shape).lineTo(71.52001, 33.488);
        ((GeneralPath) shape).lineTo(71.52001, 33.448997);
        ((GeneralPath) shape).lineTo(71.44101, 33.371);
        ((GeneralPath) shape).lineTo(71.64101, 33.331997);
        ((GeneralPath) shape).lineTo(71.68001, 33.331997);
        ((GeneralPath) shape).lineTo(72.16001, 33.171997);
        ((GeneralPath) shape).lineTo(72.16001, 33.128998);
        ((GeneralPath) shape).lineTo(72.363014, 33.051);
        ((GeneralPath) shape).lineTo(72.52302, 32.891);
        ((GeneralPath) shape).lineTo(72.56202, 32.809);
        ((GeneralPath) shape).lineTo(72.64102, 32.690998);
        ((GeneralPath) shape).lineTo(72.72302, 32.608997);
        ((GeneralPath) shape).lineTo(72.762024, 32.448997);
        ((GeneralPath) shape).lineTo(72.762024, 32.331997);
        ((GeneralPath) shape).lineTo(72.801025, 32.051);
        ((GeneralPath) shape).lineTo(72.762024, 31.769999);
        ((GeneralPath) shape).curveTo(72.65202, 29.421999, 72.60202, 25.183998, 72.60202, 19.050999);
        ((GeneralPath) shape).lineTo(72.60202, 6.968999);
        ((GeneralPath) shape).lineTo(72.12102, 6.5309987);
        ((GeneralPath) shape).lineTo(71.60202, 6.1719985);
        ((GeneralPath) shape).lineTo(71.56202, 6.1719985);
        ((GeneralPath) shape).lineTo(71.35902, 6.0509987);
        ((GeneralPath) shape).lineTo(71.043015, 5.929999);
        ((GeneralPath) shape).lineTo(71.000015, 5.890999);
        ((GeneralPath) shape).lineTo(70.402016, 5.690999);
        ((GeneralPath) shape).lineTo(70.35902, 5.690999);
        ((GeneralPath) shape).lineTo(69.56202, 5.530999);
        ((GeneralPath) shape).lineTo(68.84002, 5.487999);
        ((GeneralPath) shape).lineTo(68.76202, 5.448999);
        ((GeneralPath) shape).lineTo(67.48002, 5.448999);
        ((GeneralPath) shape).lineTo(66.402016, 5.5699987);
        ((GeneralPath) shape).lineTo(65.88302, 5.6909986);
        ((GeneralPath) shape).lineTo(65.84002, 5.7309985);
        ((GeneralPath) shape).lineTo(65.680016, 5.7699986);
        ((GeneralPath) shape).curveTo(64.668015, 6.1719985, 63.535015, 7.022999, 62.281017, 8.331999);
        ((GeneralPath) shape).lineTo(62.441017, 13.530998);
        ((GeneralPath) shape).curveTo(62.547016, 18.171997, 62.602016, 21.862999, 62.602016, 24.608997);
        ((GeneralPath) shape).lineTo(62.562016, 37.089996);
        ((GeneralPath) shape).lineTo(62.602016, 37.448997);
        ((GeneralPath) shape).lineTo(62.641018, 39.171997);
        ((GeneralPath) shape).lineTo(62.641018, 39.211);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(85.25, 96.05000305175781), 15.888f, new Point2D.Double(85.25, 96.05000305175781), new float[]{0, 1}, new Color[]{BLACK, BLACK}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_124_0_0

        // _0_0_0_125
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.961, 38.371);
        ((GeneralPath) shape).lineTo(3.6800003, 39.531);
        ((GeneralPath) shape).lineTo(3.6800003, 41.128998);
        ((GeneralPath) shape).lineTo(6.6800003, 41.648);
        ((GeneralPath) shape).lineTo(57.723, 33.531);
        ((GeneralPath) shape).lineTo(56.281, 31.011997);
        ((GeneralPath) shape).curveTo(51.241997, 31.808998, 47.336, 32.476997, 44.561996, 33.011997);
        ((GeneralPath) shape).curveTo(42.667995, 33.382996, 38.706997, 34.023, 32.684, 34.929996);
        ((GeneralPath) shape).curveTo(27.296997, 35.730995, 23.093998, 36.327995, 20.081997, 36.730995);
        ((GeneralPath) shape).curveTo(17.976997, 37.022995, 14.601997, 37.569996, 9.960997, 38.370995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x715A3E));
        g.fill(shape);

        // _0_0_0_126
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.762, 39.211);
        ((GeneralPath) shape).lineTo(3.402, 40.731);
        ((GeneralPath) shape).lineTo(4.3199997, 41.211);
        ((GeneralPath) shape).curveTo(4.988, 41.581997, 5.5079994, 41.823997, 5.8829994, 41.93);
        ((GeneralPath) shape).curveTo(6.4959993, 42.117, 7.7229996, 42.688, 9.561999, 43.648);
        ((GeneralPath) shape).lineTo(56.441, 36.448997);
        ((GeneralPath) shape).lineTo(59.043003, 33.409996);
        ((GeneralPath) shape).curveTo(58.695004, 32.233997, 58.293003, 31.647997, 57.840004, 31.647997);
        ((GeneralPath) shape).curveTo(53.707005, 32.371, 49.320004, 33.144997, 44.680004, 33.968998);
        ((GeneralPath) shape).curveTo(35.320004, 35.598, 28.773005, 36.608997, 25.043005, 37.011997);
        ((GeneralPath) shape).curveTo(21.176004, 37.382996, 16.414005, 38.116997, 10.762005, 39.211);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB49064));
        g.fill(shape);

        // _0_0_0_127
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.0, 39.609);
        ((GeneralPath) shape).lineTo(3.6799998, 41.129);
        ((GeneralPath) shape).lineTo(4.562, 41.609);
        ((GeneralPath) shape).curveTo(5.2539997, 41.984, 5.7889996, 42.227, 6.16, 42.332);
        ((GeneralPath) shape).curveTo(6.773, 42.516, 7.988, 43.09, 9.801, 44.051003);
        ((GeneralPath) shape).lineTo(56.68, 36.852);
        ((GeneralPath) shape).lineTo(59.281002, 33.809002);
        ((GeneralPath) shape).curveTo(58.934002, 32.637, 58.547, 32.051003, 58.121002, 32.051003);
        ((GeneralPath) shape).curveTo(53.988003, 32.770004, 49.602, 33.543003, 44.961002, 34.371002);
        ((GeneralPath) shape).curveTo(35.602, 35.996002, 29.043003, 37.012, 25.281002, 37.410004);
        ((GeneralPath) shape).curveTo(21.414001, 37.781002, 16.656002, 38.516003, 11.000002, 39.609005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8A6F4C));
        g.fill(shape);

        // _0_0_0_128
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.203, 39.129);
        ((GeneralPath) shape).curveTo(16.75, 39.184002, 16.147999, 39.316, 15.401999, 39.531002);
        ((GeneralPath) shape).curveTo(14.469, 39.77, 13.855, 39.918003, 13.561999, 39.969);
        ((GeneralPath) shape).lineTo(10.921999, 40.410004);
        ((GeneralPath) shape).curveTo(10.253999, 40.492004, 9.667999, 40.598003, 9.159999, 40.731003);
        ((GeneralPath) shape).curveTo(8.226999, 40.945004, 7.745999, 41.211002, 7.7229986, 41.531002);
        ((GeneralPath) shape).curveTo(7.7229986, 41.664, 7.8829985, 41.813004, 8.202998, 41.969);
        ((GeneralPath) shape).curveTo(8.468998, 42.106003, 8.694998, 42.184002, 8.882998, 42.211002);
        ((GeneralPath) shape).lineTo(26.241997, 41.531002);
        ((GeneralPath) shape).lineTo(56.679996, 36.852);
        ((GeneralPath) shape).lineTo(59.281, 33.809002);
        ((GeneralPath) shape).curveTo(58.934, 32.637, 58.546997, 32.051003, 58.121, 32.051003);
        ((GeneralPath) shape).lineTo(53.921997, 32.770004);
        ((GeneralPath) shape).lineTo(53.839996, 32.852005);
        ((GeneralPath) shape).curveTo(53.815998, 33.117004, 53.749996, 33.305004, 53.640995, 33.410004);
        ((GeneralPath) shape).curveTo(53.425995, 33.598003, 52.987995, 33.715004, 52.319996, 33.770004);
        ((GeneralPath) shape).curveTo(51.601997, 33.770004, 51.136997, 33.781006, 50.921997, 33.809006);
        ((GeneralPath) shape).curveTo(49.561996, 33.891006, 48.871, 33.930004, 48.843998, 33.930004);
        ((GeneralPath) shape).curveTo(47.668, 33.902004, 46.081997, 34.156006, 44.081997, 34.688004);
        ((GeneralPath) shape).curveTo(41.921997, 35.277004, 40.347996, 35.598003, 39.363, 35.648003);
        ((GeneralPath) shape).curveTo(37.761997, 35.731003, 36.32, 35.863003, 35.043, 36.051003);
        ((GeneralPath) shape).lineTo(32.203, 36.488003);
        ((GeneralPath) shape).curveTo(29.59, 37.074, 27.616999, 37.516003, 26.280998, 37.809002);
        ((GeneralPath) shape).curveTo(23.960999, 38.289, 21.987999, 38.637, 20.362999, 38.848003);
        ((GeneralPath) shape).curveTo(18.977, 38.957005, 17.921999, 39.051003, 17.203, 39.129);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x55442F));
        g.fill(shape);

        // _0_0_0_129
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.121, 75.77);
        ((GeneralPath) shape).curveTo(58.188, 79.211, 57.746, 81.156, 57.801, 81.60899);
        ((GeneralPath) shape).curveTo(57.961, 82.784996, 58.761997, 83.77, 60.203, 84.56999);
        ((GeneralPath) shape).curveTo(61.266, 85.18399, 62.48, 85.60899, 63.84, 85.85199);
        ((GeneralPath) shape).curveTo(66.266, 86.30499, 72.32, 82.02299, 82.0, 73.01199);
        ((GeneralPath) shape).curveTo(85.68, 69.56999, 91.734, 63.558994, 100.16, 54.968994);
        ((GeneralPath) shape).curveTo(102.402, 52.702995, 103.922005, 50.448994, 104.72301, 48.210995);
        ((GeneralPath) shape).curveTo(105.14801, 47.011993, 105.32001, 45.968994, 105.242004, 45.089996);
        ((GeneralPath) shape).curveTo(105.242004, 44.210995, 104.97301, 43.265995, 104.441, 42.249996);
        ((GeneralPath) shape).curveTo(103.48, 40.355995, 101.812004, 38.702995, 99.441, 37.288998);
        ((GeneralPath) shape).curveTo(90.109, 31.823997, 83.922005, 28.304996, 80.879, 26.730999);
        ((GeneralPath) shape).curveTo(71.093994, 21.664, 65.055, 19.758, 62.761997, 21.012);
        ((GeneralPath) shape).curveTo(61.878998, 21.464998, 61.253998, 22.625, 60.878998, 24.487999);
        ((GeneralPath) shape).curveTo(60.613, 25.714998, 60.374996, 27.940998, 60.159996, 31.171999);
        ((GeneralPath) shape).curveTo(60.054996, 32.531, 59.999996, 34.796997, 59.999996, 37.968998);
        ((GeneralPath) shape).curveTo(44.906, 39.996, 31.784996, 41.878998, 20.640995, 43.608997);
        ((GeneralPath) shape).curveTo(15.624995, 44.382996, 12.292995, 45.315998, 10.640995, 46.409996);
        ((GeneralPath) shape).curveTo(9.331995, 47.265995, 8.468995, 48.730995, 8.038995, 50.809);
        ((GeneralPath) shape).curveTo(7.6129947, 52.996, 7.241995, 56.809, 6.9219947, 62.25);
        ((GeneralPath) shape).lineTo(6.8789945, 63.691);
        ((GeneralPath) shape).lineTo(6.9219947, 63.731003);
        ((GeneralPath) shape).curveTo(6.9219947, 64.559006, 6.347995, 66.289, 5.1989946, 68.93);
        ((GeneralPath) shape).curveTo(4.104995, 71.438, 3.6409945, 73.211, 3.8009946, 74.25);
        ((GeneralPath) shape).curveTo(3.9059947, 74.918, 4.7189946, 75.715, 6.241995, 76.648);
        ((GeneralPath) shape).curveTo(7.038995, 77.129005, 8.065995, 77.691, 9.319995, 78.332);
        ((GeneralPath) shape).curveTo(10.120995, 78.785, 11.347995, 78.969, 12.999995, 78.891);
        ((GeneralPath) shape).curveTo(14.706995, 78.809, 17.120995, 78.449, 20.241995, 77.809);
        ((GeneralPath) shape).curveTo(33.601994, 74.984, 47.015995, 72.022995, 60.479996, 68.93);
        ((GeneralPath) shape).curveTo(60.507996, 69.969, 60.054996, 72.25, 59.120995, 75.770004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5C4932));
        g.fill(shape);

        // _0_0_0_130
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.961, 81.488);
        ((GeneralPath) shape).lineTo(64.882996, 80.77);
        ((GeneralPath) shape).curveTo(64.641, 80.824, 64.40199, 80.702995, 64.159996, 80.409996);
        ((GeneralPath) shape).curveTo(63.894997, 80.145, 63.839996, 79.918, 63.999996, 79.730995);
        ((GeneralPath) shape).curveTo(64.10899, 79.56999, 64.281, 79.516, 64.52, 79.56999);
        ((GeneralPath) shape).lineTo(63.601997, 79.050995);
        ((GeneralPath) shape).curveTo(63.203, 78.86299, 62.882996, 78.715, 62.641, 78.60899);
        ((GeneralPath) shape).curveTo(62.242, 78.422, 61.921997, 78.343994, 61.68, 78.370995);
        ((GeneralPath) shape).lineTo(62.762, 81.01199);
        ((GeneralPath) shape).curveTo(64.176, 81.01199, 65.43, 81.27699, 66.523, 81.80899);
        ((GeneralPath) shape).curveTo(66.977005, 82.02299, 67.656006, 82.37099, 68.562004, 82.85199);
        ((GeneralPath) shape).lineTo(69.602005, 83.40999);
        ((GeneralPath) shape).lineTo(69.840004, 83.249985);
        ((GeneralPath) shape).lineTo(69.72301, 83.21098);
        ((GeneralPath) shape).curveTo(68.840004, 82.89098, 67.922005, 82.31599, 66.961006, 81.48798);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x52412D));
        g.fill(shape);

        // _0_0_0_131
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.043, 78.012);
        ((GeneralPath) shape).curveTo(66.227, 78.172005, 66.59, 78.238, 67.121, 78.211);
        ((GeneralPath) shape).curveTo(67.840004, 78.156, 68.227005, 78.129, 68.281006, 78.129);
        ((GeneralPath) shape).curveTo(68.78901, 78.184, 69.41401, 78.477, 70.16, 79.012);
        ((GeneralPath) shape).curveTo(70.61301, 79.277, 71.254005, 79.715004, 72.082, 80.332);
        ((GeneralPath) shape).lineTo(72.883, 80.969);
        ((GeneralPath) shape).lineTo(73.48, 80.531);
        ((GeneralPath) shape).lineTo(73.402, 80.449);
        ((GeneralPath) shape).lineTo(72.840004, 79.968994);
        ((GeneralPath) shape).lineTo(69.359, 78.24999);
        ((GeneralPath) shape).curveTo(69.121, 78.19499, 68.867004, 78.08999, 68.602, 77.92999);
        ((GeneralPath) shape).curveTo(68.281, 77.715, 68.109, 77.51599, 68.082, 77.33199);
        ((GeneralPath) shape).curveTo(68.32, 77.22299, 68.773, 77.30499, 69.441, 77.56999);
        ((GeneralPath) shape).curveTo(69.840004, 77.702995, 70.32, 77.91799, 70.883, 78.21099);
        ((GeneralPath) shape).lineTo(69.840004, 77.288994);
        ((GeneralPath) shape).curveTo(68.934006, 76.62499, 68.453, 76.26599, 68.402, 76.21099);
        ((GeneralPath) shape).curveTo(67.762, 75.80899, 67.215004, 75.64799, 66.762, 75.73099);
        ((GeneralPath) shape).lineTo(66.043, 78.011986);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_132
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.16, 76.531);
        ((GeneralPath) shape).lineTo(77.32001, 75.730995);
        ((GeneralPath) shape).lineTo(75.40201, 74.33199);
        ((GeneralPath) shape).curveTo(75.16001, 74.355995, 74.895004, 74.23799, 74.602005, 73.968994);
        ((GeneralPath) shape).curveTo(74.254005, 73.675995, 74.01601, 73.48799, 73.883, 73.409996);
        ((GeneralPath) shape).curveTo(73.695, 73.24999, 73.227005, 72.968994, 72.48, 72.57);
        ((GeneralPath) shape).curveTo(72.242004, 72.409996, 72.109, 72.305, 72.082, 72.25);
        ((GeneralPath) shape).lineTo(71.043, 74.09);
        ((GeneralPath) shape).curveTo(71.203, 73.875, 71.59, 73.77, 72.203, 73.77);
        ((GeneralPath) shape).curveTo(72.789, 73.77, 73.227005, 73.852, 73.520004, 74.01199);
        ((GeneralPath) shape).curveTo(73.734, 74.117, 74.039, 74.343994, 74.441, 74.690994);
        ((GeneralPath) shape).curveTo(75.055, 75.034996, 75.559006, 75.397995, 75.961, 75.77);
        ((GeneralPath) shape).curveTo(76.309, 76.117, 76.827995, 76.504, 77.52, 76.93);
        ((GeneralPath) shape).lineTo(77.602, 77.012);
        ((GeneralPath) shape).lineTo(78.159996, 76.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_133
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(72.121, 72.172);
        ((GeneralPath) shape).lineTo(72.602005, 72.129);
        ((GeneralPath) shape).lineTo(72.203, 72.012);
        ((GeneralPath) shape).lineTo(72.121, 72.172005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_134
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.723, 73.852);
        ((GeneralPath) shape).curveTo(78.48, 73.663994, 78.293, 73.465, 78.159996, 73.25);
        ((GeneralPath) shape).curveTo(77.977, 73.012, 77.977, 72.824, 78.159996, 72.691);
        ((GeneralPath) shape).curveTo(78.40199, 72.531, 78.99999, 72.715004, 79.961, 73.25);
        ((GeneralPath) shape).curveTo(79.507996, 72.77, 79.159996, 72.41, 78.922, 72.172);
        ((GeneralPath) shape).curveTo(78.52, 71.77, 78.147995, 71.504, 77.800995, 71.370995);
        ((GeneralPath) shape).curveTo(77.72299, 71.422, 77.65199, 71.59799, 77.602, 71.89099);
        ((GeneralPath) shape).curveTo(77.387, 71.80899, 77.137, 71.59799, 76.84, 71.24999);
        ((GeneralPath) shape).curveTo(76.547, 70.85199, 76.348, 70.58199, 76.242, 70.44899);
        ((GeneralPath) shape).curveTo(75.629, 69.73099, 75.309, 69.31599, 75.281, 69.21099);
        ((GeneralPath) shape).curveTo(75.602, 69.07799, 75.977, 69.12899, 76.402, 69.370995);
        ((GeneralPath) shape).curveTo(76.48, 69.422, 77.789, 70.19499, 80.32, 71.690994);
        ((GeneralPath) shape).curveTo(80.055, 71.422, 79.762, 71.18399, 79.441, 70.968994);
        ((GeneralPath) shape).curveTo(78.348, 70.034996, 77.492004, 69.382996, 76.879005, 69.01199);
        ((GeneralPath) shape).curveTo(76.16, 68.58199, 75.38701, 68.33199, 74.562004, 68.24999);
        ((GeneralPath) shape).curveTo(74.109, 68.19499, 73.762, 68.27699, 73.520004, 68.48799);
        ((GeneralPath) shape).curveTo(73.227005, 68.83599, 72.98801, 69.12899, 72.801, 69.370995);
        ((GeneralPath) shape).lineTo(74.082, 70.77);
        ((GeneralPath) shape).curveTo(74.801, 70.77, 75.387, 70.875, 75.840004, 71.09);
        ((GeneralPath) shape).curveTo(75.977005, 71.145, 76.203, 71.25, 76.523, 71.409996);
        ((GeneralPath) shape).curveTo(76.789, 71.57, 76.961006, 71.730995, 77.043, 71.891);
        ((GeneralPath) shape).lineTo(76.84, 71.93);
        ((GeneralPath) shape).curveTo(76.73399, 72.305, 76.934, 72.676, 77.440994, 73.051);
        ((GeneralPath) shape).curveTo(77.602, 73.184006, 78.02699, 73.449005, 78.72299, 73.852005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_135
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(80.32, 67.129);
        ((GeneralPath) shape).curveTo(79.84, 66.757996, 79.508, 66.422, 79.32, 66.129);
        ((GeneralPath) shape).lineTo(79.281, 66.129);
        ((GeneralPath) shape).lineTo(78.159996, 67.012);
        ((GeneralPath) shape).curveTo(78.547, 66.731, 79.27, 66.770004, 80.32, 67.129);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_136
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(82.961, 67.41);
        ((GeneralPath) shape).curveTo(82.562, 66.93, 82.215, 66.625, 81.922, 66.48801);
        ((GeneralPath) shape).curveTo(81.547, 66.27701, 81.065994, 66.172005, 80.479996, 66.172005);
        ((GeneralPath) shape).curveTo(81.97299, 66.836006, 83.147995, 67.55501, 83.99999, 68.33201);
        ((GeneralPath) shape).lineTo(81.96099, 68.01201);
        ((GeneralPath) shape).lineTo(82.51999, 68.41001);
        ((GeneralPath) shape).lineTo(84.80099, 70.37101);
        ((GeneralPath) shape).lineTo(85.761986, 69.44901);
        ((GeneralPath) shape).curveTo(84.98798, 68.99601, 84.57398, 68.74201, 84.51999, 68.69101);
        ((GeneralPath) shape).lineTo(82.96099, 67.41001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_137
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(82.562, 65.129);
        ((GeneralPath) shape).curveTo(81.812, 64.437996, 81.120995, 64.050995, 80.479996, 63.968998);
        ((GeneralPath) shape).lineTo(80.35899, 65.690994);
        ((GeneralPath) shape).curveTo(80.895, 65.663994, 81.547, 65.824, 82.31999, 66.172);
        ((GeneralPath) shape).curveTo(83.25399, 66.620995, 83.89499, 66.875, 84.24199, 66.93);
        ((GeneralPath) shape).curveTo(83.54699, 66.129, 82.98799, 65.531, 82.56199, 65.129);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_138
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.961, 67.969);
        ((GeneralPath) shape).curveTo(85.202995, 68.398, 85.562, 68.809, 86.043, 69.211);
        ((GeneralPath) shape).lineTo(86.723, 68.531);
        ((GeneralPath) shape).lineTo(84.961, 67.969);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_139
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(82.082, 59.051);
        ((GeneralPath) shape).curveTo(80.109, 59.851997, 78.91, 60.690998, 78.48, 61.57);
        ((GeneralPath) shape).lineTo(83.883, 62.128998);
        ((GeneralPath) shape).curveTo(84.816, 62.184, 85.48, 62.398, 85.883, 62.769997);
        ((GeneralPath) shape).lineTo(87.281006, 64.050995);
        ((GeneralPath) shape).curveTo(87.46901, 64.184, 88.32001, 64.647995, 89.840004, 65.449);
        ((GeneralPath) shape).lineTo(90.32001, 65.012);
        ((GeneralPath) shape).lineTo(85.922005, 62.57);
        ((GeneralPath) shape).curveTo(85.68001, 62.516, 85.441, 62.315998, 85.203, 61.968998);
        ((GeneralPath) shape).curveTo(84.98801, 61.621, 84.91, 61.331997, 84.961006, 61.089996);
        ((GeneralPath) shape).curveTo(85.38701, 60.983997, 85.883, 61.156, 86.44101, 61.608997);
        ((GeneralPath) shape).curveTo(86.76201, 61.851997, 87.17601, 62.211, 87.684006, 62.690998);
        ((GeneralPath) shape).curveTo(88.801, 63.625, 89.938, 63.996, 91.08201, 63.809);
        ((GeneralPath) shape).curveTo(91.10901, 63.41, 91.01601, 63.089996, 90.80101, 62.851997);
        ((GeneralPath) shape).curveTo(90.69501, 62.690998, 90.40201, 62.464996, 89.92201, 62.171997);
        ((GeneralPath) shape).curveTo(88.16001, 61.156, 86.94901, 60.249996, 86.28101, 59.448997);
        ((GeneralPath) shape).curveTo(86.41402, 59.448997, 86.50801, 59.476997, 86.56201, 59.531);
        ((GeneralPath) shape).lineTo(87.20301, 59.891);
        ((GeneralPath) shape).curveTo(88.24201, 60.531, 89.21501, 61.09, 90.12101, 61.57);
        ((GeneralPath) shape).lineTo(92.56201, 62.731);
        ((GeneralPath) shape).lineTo(93.76201, 61.531);
        ((GeneralPath) shape).lineTo(93.20301, 61.488);
        ((GeneralPath) shape).curveTo(91.33601, 61.277, 89.20301, 60.315998, 86.80101, 58.608997);
        ((GeneralPath) shape).curveTo(86.37501, 58.315998, 85.97701, 58.171997, 85.60201, 58.171997);
        ((GeneralPath) shape).curveTo(84.613014, 58.194996, 83.44101, 58.488, 82.082016, 59.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_140
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(88.961, 66.332);
        ((GeneralPath) shape).lineTo(88.800995, 66.289);
        ((GeneralPath) shape).lineTo(87.31999, 65.691);
        ((GeneralPath) shape).lineTo(87.479996, 65.770004);
        ((GeneralPath) shape).lineTo(88.72299, 66.57001);
        ((GeneralPath) shape).lineTo(88.96099, 66.33201);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_141
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(89.32, 59.172);
        ((GeneralPath) shape).curveTo(89.695, 59.332, 90.32, 59.621002, 91.203, 60.051003);
        ((GeneralPath) shape).curveTo(92.0, 60.449, 92.64101, 60.742004, 93.121, 60.930004);
        ((GeneralPath) shape).curveTo(92.988, 60.824005, 92.359, 60.371002, 91.242004, 59.570004);
        ((GeneralPath) shape).lineTo(90.961006, 59.371002);
        ((GeneralPath) shape).lineTo(89.559006, 59.012);
        ((GeneralPath) shape).curveTo(89.05501, 58.852, 88.64101, 58.715, 88.32001, 58.609);
        ((GeneralPath) shape).curveTo(87.836006, 58.391003, 87.60901, 58.148003, 87.64101, 57.891003);
        ((GeneralPath) shape).lineTo(87.44101, 58.531002);
        ((GeneralPath) shape).lineTo(89.32001, 59.172);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(87.68, 57.731003);
        ((GeneralPath) shape).curveTo(88.109, 57.648003, 88.629, 57.731003, 89.242, 57.969);
        ((GeneralPath) shape).curveTo(88.574, 57.383003, 88.13699, 57.035004, 87.922, 56.93);
        ((GeneralPath) shape).lineTo(87.68, 57.731);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_142
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(95.762, 59.531);
        ((GeneralPath) shape).lineTo(96.32, 58.929996);
        ((GeneralPath) shape).curveTo(96.215, 58.714996, 95.973, 58.397995, 95.602, 57.968998);
        ((GeneralPath) shape).lineTo(92.52, 56.57);
        ((GeneralPath) shape).curveTo(92.413994, 56.465, 92.147995, 56.266, 91.723, 55.968998);
        ((GeneralPath) shape).curveTo(91.402, 55.785, 91.159996, 55.554996, 91.0, 55.288998);
        ((GeneralPath) shape).curveTo(90.602, 54.648, 90.402, 54.238, 90.402, 54.051);
        ((GeneralPath) shape).curveTo(89.68, 53.57, 89.242, 53.266, 89.082, 53.128998);
        ((GeneralPath) shape).lineTo(89.32, 55.769997);
        ((GeneralPath) shape).curveTo(89.723, 55.929996, 90.281, 56.171997, 91.004, 56.487995);
        ((GeneralPath) shape).curveTo(91.641, 56.784996, 92.175995, 57.077995, 92.602, 57.370995);
        ((GeneralPath) shape).curveTo(93.215, 57.796993, 94.137, 58.421993, 95.363, 59.249996);
        ((GeneralPath) shape).lineTo(95.762, 59.530994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_143
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(81.883, 39.969);
        ((GeneralPath) shape).curveTo(81.215004, 41.172, 80.949005, 42.078003, 81.082, 42.691);
        ((GeneralPath) shape).lineTo(90.762, 53.371002);
        ((GeneralPath) shape).curveTo(90.977, 53.582, 91.242004, 53.77, 91.562004, 53.93);
        ((GeneralPath) shape).curveTo(91.453, 53.77, 91.414, 53.609, 91.441, 53.449);
        ((GeneralPath) shape).curveTo(91.629005, 52.465, 93.055, 53.023003, 95.723, 55.129);
        ((GeneralPath) shape).lineTo(96.523, 55.570004);
        ((GeneralPath) shape).curveTo(97.109, 55.891003, 97.617004, 56.223003, 98.043, 56.570004);
        ((GeneralPath) shape).lineTo(98.324, 56.852005);
        ((GeneralPath) shape).lineTo(99.324, 55.891006);
        ((GeneralPath) shape).curveTo(99.163994, 55.625008, 98.602, 55.078007, 97.641, 54.250008);
        ((GeneralPath) shape).lineTo(95.242, 53.250008);
        ((GeneralPath) shape).curveTo(94.468994, 52.82401, 94.004, 52.543007, 93.843994, 52.410007);
        ((GeneralPath) shape).curveTo(93.093994, 52.145008, 92.68399, 51.875008, 92.602, 51.60901);
        ((GeneralPath) shape).curveTo(92.895, 51.37101, 93.534996, 51.28901, 94.522995, 51.37101);
        ((GeneralPath) shape).curveTo(94.788994, 51.42201, 95.147995, 51.555008, 95.602, 51.770008);
        ((GeneralPath) shape).curveTo(96.109, 52.01201, 96.468994, 52.15601, 96.684, 52.21101);
        ((GeneralPath) shape).curveTo(96.734, 52.02301, 96.574, 51.71501, 96.202995, 51.28901);
        ((GeneralPath) shape).curveTo(95.937996, 50.80901, 95.711, 50.44901, 95.522995, 50.21101);
        ((GeneralPath) shape).curveTo(96.13699, 50.21101, 96.656, 50.34401, 97.08199, 50.60901);
        ((GeneralPath) shape).curveTo(97.74999, 50.98401, 98.62899, 51.63701, 99.72299, 52.570007);
        ((GeneralPath) shape).curveTo(100.04299, 52.809006, 100.53499, 53.238007, 101.202995, 53.85201);
        ((GeneralPath) shape).lineTo(101.882996, 53.05101);
        ((GeneralPath) shape).curveTo(101.479996, 52.70301, 101.242, 52.44901, 101.163994, 52.28901);
        ((GeneralPath) shape).lineTo(101.36299, 52.37101);
        ((GeneralPath) shape).lineTo(100.60199, 51.64801);
        ((GeneralPath) shape).curveTo(99.53499, 50.77001, 98.74999, 50.10201, 98.24199, 49.64801);
        ((GeneralPath) shape).lineTo(98.44099, 49.89101);
        ((GeneralPath) shape).curveTo(99.29699, 50.66401, 99.96098, 51.38301, 100.44099, 52.05101);
        ((GeneralPath) shape).lineTo(97.60299, 49.77001);
        ((GeneralPath) shape).curveTo(97.39199, 49.71501, 97.21599, 49.609013, 97.08299, 49.449013);
        ((GeneralPath) shape).curveTo(96.92299, 49.266014, 96.855995, 49.06301, 96.883995, 48.852013);
        ((GeneralPath) shape).curveTo(97.07099, 48.824013, 97.364, 48.957012, 97.76299, 49.25001);
        ((GeneralPath) shape).lineTo(97.203995, 48.69101);
        ((GeneralPath) shape).curveTo(97.551994, 48.58201, 97.978, 48.59801, 98.48499, 48.73101);
        ((GeneralPath) shape).curveTo(98.673, 48.78501, 99.09899, 48.93001, 99.76699, 49.172012);
        ((GeneralPath) shape).curveTo(100.27099, 49.352013, 100.96199, 49.71501, 101.84499, 50.25001);
        ((GeneralPath) shape).lineTo(99.926994, 48.89101);
        ((GeneralPath) shape).curveTo(99.12599, 48.27701, 98.728, 47.94501, 98.728, 47.89101);
        ((GeneralPath) shape).curveTo(99.340996, 48.37101, 100.246994, 48.94501, 101.446, 49.60901);
        ((GeneralPath) shape).lineTo(100.364, 48.64801);
        ((GeneralPath) shape).curveTo(99.833, 48.03501, 99.230995, 47.47701, 98.562996, 46.96901);
        ((GeneralPath) shape).curveTo(98.19199, 46.73101, 97.993, 46.555008, 97.965996, 46.44901);
        ((GeneralPath) shape).curveTo(97.883995, 46.12901, 98.203995, 45.89101, 98.926994, 45.73101);
        ((GeneralPath) shape).curveTo(99.562996, 45.62501, 100.032, 45.63701, 100.325, 45.77001);
        ((GeneralPath) shape).curveTo(100.458, 45.824013, 100.618, 45.93001, 100.806, 46.09001);
        ((GeneralPath) shape).curveTo(100.993, 46.27701, 101.138, 46.39801, 101.247, 46.449013);
        ((GeneralPath) shape).curveTo(101.380005, 46.504013, 101.618004, 46.543015, 101.966, 46.57001);
        ((GeneralPath) shape).curveTo(102.181, 46.67601, 102.47401, 46.94501, 102.845, 47.37101);
        ((GeneralPath) shape).curveTo(103.728004, 48.25001, 104.259, 48.770008, 104.446, 48.930008);
        ((GeneralPath) shape).lineTo(104.524, 48.731007);
        ((GeneralPath) shape).curveTo(104.208, 48.356007, 103.966, 48.090008, 103.806, 47.930008);
        ((GeneralPath) shape).curveTo(103.142, 47.238007, 102.657, 46.69101, 102.364, 46.28901);
        ((GeneralPath) shape).curveTo(103.485, 46.770008, 104.340996, 46.930008, 104.927, 46.770008);
        ((GeneralPath) shape).curveTo(104.845, 46.50401, 104.728004, 46.277008, 104.567, 46.090008);
        ((GeneralPath) shape).curveTo(103.579, 44.918007, 102.86, 44.023006, 102.407, 43.410007);
        ((GeneralPath) shape).curveTo(102.142, 42.98401, 101.833, 42.625008, 101.485, 42.33201);
        ((GeneralPath) shape).curveTo(101.513, 42.383007, 101.778, 42.715008, 102.286, 43.33201);
        ((GeneralPath) shape).curveTo(102.712006, 43.83601, 102.86, 44.15601, 102.728004, 44.28901);
        ((GeneralPath) shape).curveTo(101.09901, 43.89101, 99.899, 43.570007, 99.12601, 43.33201);
        ((GeneralPath) shape).curveTo(98.728004, 43.195007, 98.52801, 43.11701, 98.52801, 43.090008);
        ((GeneralPath) shape).curveTo(98.392006, 43.035007, 98.28601, 42.930008, 98.20801, 42.770008);
        ((GeneralPath) shape).curveTo(98.12601, 42.60901, 98.09901, 42.33201, 98.12601, 41.930008);
        ((GeneralPath) shape).curveTo(98.15301, 41.715008, 98.18101, 41.42201, 98.20801, 41.051006);
        ((GeneralPath) shape).lineTo(98.20801, 40.250008);
        ((GeneralPath) shape).curveTo(98.50101, 40.305008, 99.087006, 40.50401, 99.96601, 40.85201);
        ((GeneralPath) shape).curveTo(101.14201, 41.277008, 102.419014, 41.86301, 103.80601, 42.60901);
        ((GeneralPath) shape).lineTo(104.96601, 43.48801);
        ((GeneralPath) shape).curveTo(104.70001, 42.71501, 104.40701, 42.09001, 104.08701, 41.60901);
        ((GeneralPath) shape).curveTo(103.23101, 40.80901, 102.23101, 40.195007, 101.08701, 39.770008);
        ((GeneralPath) shape).curveTo(100.419014, 39.60901, 99.89901, 39.465008, 99.528015, 39.328007);
        ((GeneralPath) shape).curveTo(98.806015, 39.090008, 98.40701, 38.781006, 98.32501, 38.410007);
        ((GeneralPath) shape).curveTo(98.24701, 37.95701, 98.60601, 37.58201, 99.40701, 37.28901);
        ((GeneralPath) shape).curveTo(96.528015, 35.53101, 93.75501, 33.89101, 91.08701, 32.37101);
        ((GeneralPath) shape).lineTo(90.763016, 32.44901);
        ((GeneralPath) shape).curveTo(89.056015, 33.01201, 87.165016, 34.18401, 85.083015, 35.96901);
        ((GeneralPath) shape).curveTo(83.80202, 37.090008, 82.73901, 38.42201, 81.88402, 39.96901);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_144
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(60.121, 82.09);
        ((GeneralPath) shape).curveTo(59.695, 81.92999, 59.426, 81.918, 59.32, 82.050995);
        ((GeneralPath) shape).curveTo(59.188, 82.23799, 59.266, 82.465, 59.562, 82.730995);
        ((GeneralPath) shape).curveTo(59.828, 83.022995, 60.066, 83.145, 60.281002, 83.09);
        ((GeneralPath) shape).lineTo(66.039, 85.449);
        ((GeneralPath) shape).lineTo(66.520004, 85.211);
        ((GeneralPath) shape).lineTo(61.762005, 82.93);
        ((GeneralPath) shape).curveTo(60.773006, 82.449, 60.227005, 82.172, 60.121006, 82.090004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_145
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.961, 76.172);
        ((GeneralPath) shape).lineTo(7.203, 76.409996);
        ((GeneralPath) shape).curveTo(7.359, 76.488, 7.613, 76.559, 7.961, 76.60899);
        ((GeneralPath) shape).curveTo(8.359, 76.663994, 8.613, 76.715, 8.723, 76.77);
        ((GeneralPath) shape).curveTo(10.452999, 76.824, 11.733999, 76.784996, 12.561999, 76.647995);
        ((GeneralPath) shape).curveTo(14.374999, 76.30499, 16.574, 75.56999, 19.16, 74.449);
        ((GeneralPath) shape).curveTo(19.855, 74.156, 20.895, 73.784996, 22.281, 73.332);
        ((GeneralPath) shape).curveTo(23.695, 72.879, 24.734001, 72.504, 25.402, 72.211);
        ((GeneralPath) shape).curveTo(26.602001, 71.647995, 28.375, 71.09, 30.723, 70.531);
        ((GeneralPath) shape).curveTo(31.84, 70.266, 34.109, 70.034996, 37.52, 69.852);
        ((GeneralPath) shape).curveTo(39.762, 69.715, 43.137, 69.690994, 47.641, 69.77);
        ((GeneralPath) shape).lineTo(56.762, 69.77);
        ((GeneralPath) shape).curveTo(53.668, 69.60899, 51.348, 69.543, 49.801003, 69.57);
        ((GeneralPath) shape).curveTo(46.520004, 69.57, 44.547, 69.555, 43.883003, 69.531);
        ((GeneralPath) shape).lineTo(39.359, 69.57);
        ((GeneralPath) shape).curveTo(38.934002, 69.621, 38.586002, 69.648, 38.32, 69.648);
        ((GeneralPath) shape).curveTo(37.815998, 69.648, 37.574, 69.516, 37.602, 69.25);
        ((GeneralPath) shape).lineTo(38.961002, 69.129);
        ((GeneralPath) shape).curveTo(34.055, 68.784996, 30.016003, 68.891, 26.840002, 69.449);
        ((GeneralPath) shape).curveTo(26.336002, 69.555, 25.750002, 69.730995, 25.082003, 69.968994);
        ((GeneralPath) shape).curveTo(23.961002, 70.397995, 23.387003, 70.60899, 23.359003, 70.60899);
        ((GeneralPath) shape).curveTo(20.855003, 71.382996, 19.480003, 71.82399, 19.242002, 71.92999);
        ((GeneralPath) shape).curveTo(19.988003, 72.17199, 20.469002, 72.465, 20.680002, 72.80899);
        ((GeneralPath) shape).curveTo(20.227003, 73.10599, 19.574001, 73.37099, 18.723001, 73.60899);
        ((GeneralPath) shape).curveTo(17.762001, 73.82399, 17.070002, 73.995995, 16.641, 74.12899);
        ((GeneralPath) shape).curveTo(16.109001, 74.288994, 15.281001, 74.59799, 14.160001, 75.05099);
        ((GeneralPath) shape).curveTo(13.094001, 75.50399, 12.266001, 75.80899, 11.68, 75.96899);
        ((GeneralPath) shape).curveTo(10.961, 76.18398, 9.816, 76.26598, 8.242001, 76.21098);
        ((GeneralPath) shape).lineTo(6.9610004, 76.17198);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_146
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.402, 76.211);
        ((GeneralPath) shape).curveTo(15.293, 76.852, 14.082001, 77.195, 13.762, 77.25);
        ((GeneralPath) shape).curveTo(12.695, 77.438, 11.387, 77.582, 9.84, 77.691);
        ((GeneralPath) shape).curveTo(9.895, 77.875, 10.176001, 77.996, 10.68, 78.051);
        ((GeneralPath) shape).lineTo(13.203, 77.852005);
        ((GeneralPath) shape).curveTo(13.4140005, 77.797005, 14.242001, 77.59801, 15.68, 77.25001);
        ((GeneralPath) shape).curveTo(16.562, 77.090004, 17.426, 76.86301, 18.281, 76.57001);
        ((GeneralPath) shape).curveTo(18.68, 76.438, 19.254, 76.19501, 20.0, 75.852005);
        ((GeneralPath) shape).curveTo(21.043, 75.531006, 21.656, 75.33201, 21.84, 75.25001);
        ((GeneralPath) shape).curveTo(22.426, 75.01201, 23.293, 74.63701, 24.441, 74.129005);
        ((GeneralPath) shape).curveTo(24.68, 74.051, 25.387, 73.879005, 26.562, 73.60901);
        ((GeneralPath) shape).curveTo(27.414, 73.39801, 28.055, 73.211006, 28.48, 73.05101);
        ((GeneralPath) shape).curveTo(28.535, 73.02301, 29.094, 72.94501, 30.16, 72.80901);
        ((GeneralPath) shape).curveTo(31.812, 72.64801, 33.016, 72.50401, 33.762, 72.37101);
        ((GeneralPath) shape).curveTo(34.754, 72.15201, 35.574, 72.03501, 36.223, 72.01201);
        ((GeneralPath) shape).curveTo(33.547, 72.02001, 31.737999, 72.09801, 30.800999, 72.25001);
        ((GeneralPath) shape).curveTo(28.453, 72.70301, 27.203, 72.94501, 27.043, 72.96901);
        ((GeneralPath) shape).curveTo(25.629, 73.211006, 24.562, 73.48801, 23.84, 73.809006);
        ((GeneralPath) shape).lineTo(22.16, 74.57001);
        ((GeneralPath) shape).curveTo(20.402, 75.28901, 18.816, 75.836006, 17.402, 76.211006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_147
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.961, 76.648);
        ((GeneralPath) shape).curveTo(19.668001, 76.731, 19.441, 76.785, 19.281, 76.809006);
        ((GeneralPath) shape).curveTo(18.988, 76.91801, 18.789, 77.023, 18.68, 77.129005);
        ((GeneralPath) shape).lineTo(19.801, 76.852005);
        ((GeneralPath) shape).curveTo(20.387001, 76.63701, 21.121, 76.22301, 22.0, 75.60901);
        ((GeneralPath) shape).lineTo(21.441, 75.93001);
        ((GeneralPath) shape).curveTo(20.562, 76.35601, 20.066, 76.59801, 19.961, 76.64801);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_148
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.68, 75.809);
        ((GeneralPath) shape).curveTo(24.227001, 76.397995, 23.883, 76.824, 23.641, 77.09);
        ((GeneralPath) shape).lineTo(24.84, 76.852);
        ((GeneralPath) shape).lineTo(25.32, 76.531);
        ((GeneralPath) shape).lineTo(26.0, 75.809);
        ((GeneralPath) shape).curveTo(26.855, 75.034996, 27.922, 74.647995, 29.203, 74.647995);
        ((GeneralPath) shape).curveTo(28.612999, 74.836, 28.054998, 75.117, 27.519999, 75.48799);
        ((GeneralPath) shape).curveTo(27.977, 75.33199, 28.640999, 75.08999, 29.519999, 74.76999);
        ((GeneralPath) shape).curveTo(30.293, 74.50399, 30.977, 74.31599, 31.561998, 74.21099);
        ((GeneralPath) shape).curveTo(32.468998, 73.995995, 33.788998, 73.64799, 35.519997, 73.17199);
        ((GeneralPath) shape).curveTo(37.069996, 72.79699, 38.413998, 72.59799, 39.561996, 72.56999);
        ((GeneralPath) shape).curveTo(35.479996, 72.56999, 32.214996, 72.87499, 29.761997, 73.48799);
        ((GeneralPath) shape).curveTo(27.335997, 74.15599, 25.640997, 74.92999, 24.679996, 75.80899);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_149
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(52.16, 70.809);
        ((GeneralPath) shape).lineTo(53.723, 70.449);
        ((GeneralPath) shape).curveTo(49.988, 70.504, 46.922, 70.637, 44.52, 70.852);
        ((GeneralPath) shape).lineTo(38.242, 71.531);
        ((GeneralPath) shape).curveTo(38.027, 71.559, 37.734, 71.582, 37.359, 71.609);
        ((GeneralPath) shape).lineTo(42.883003, 71.41);
        ((GeneralPath) shape).lineTo(42.562004, 71.371);
        ((GeneralPath) shape).curveTo(42.586002, 71.289, 42.680004, 71.266, 42.840004, 71.289);
        ((GeneralPath) shape).curveTo(43.453003, 71.184, 44.453003, 71.117004, 45.840004, 71.090004);
        ((GeneralPath) shape).curveTo(47.496002, 70.902, 49.602005, 70.809006, 52.160004, 70.809006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_150
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(51.242, 68.969);
        ((GeneralPath) shape).curveTo(52.656002, 68.969, 54.773, 68.93, 57.602, 68.852005);
        ((GeneralPath) shape).curveTo(57.707, 68.852005, 57.961002, 68.86301, 58.359, 68.89101);
        ((GeneralPath) shape).curveTo(58.707, 68.89101, 58.91, 68.797005, 58.961002, 68.60901);
        ((GeneralPath) shape).lineTo(61.922, 68.25001);
        ((GeneralPath) shape).lineTo(56.762, 68.33201);
        ((GeneralPath) shape).lineTo(56.121002, 68.60901);
        ((GeneralPath) shape).lineTo(53.359, 68.60901);
        ((GeneralPath) shape).curveTo(52.668, 68.63701, 52.148003, 68.64801, 51.801003, 68.64801);
        ((GeneralPath) shape).curveTo(51.137, 68.67601, 50.602, 68.66401, 50.203003, 68.60901);
        ((GeneralPath) shape).lineTo(50.402004, 68.531006);
        ((GeneralPath) shape).curveTo(47.520004, 68.63701, 44.613003, 68.715004, 41.680004, 68.770004);
        ((GeneralPath) shape).lineTo(42.922005, 68.89101);
        ((GeneralPath) shape).curveTo(44.121006, 68.96901, 45.336006, 69.01201, 46.562004, 69.01201);
        ((GeneralPath) shape).lineTo(51.242004, 68.96901);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_151
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.801, 66.891);
        ((GeneralPath) shape).curveTo(55.883, 66.809, 54.426, 66.784996, 53.440998, 66.809);
        ((GeneralPath) shape).curveTo(51.581997, 67.113, 49.968998, 67.327995, 48.601997, 67.449);
        ((GeneralPath) shape).curveTo(50.406, 67.336, 52.898, 67.336, 56.081997, 67.449);
        ((GeneralPath) shape).lineTo(60.999996, 67.449);
        ((GeneralPath) shape).lineTo(62.640995, 66.129);
        ((GeneralPath) shape).lineTo(57.800995, 66.891);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_152
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.242, 65.969);
        ((GeneralPath) shape).lineTo(63.242, 65.648);
        ((GeneralPath) shape).lineTo(63.562, 65.371);
        ((GeneralPath) shape).curveTo(62.84, 65.316, 61.949, 65.371, 60.879, 65.531006);
        ((GeneralPath) shape).curveTo(59.703003, 65.715004, 58.824, 65.85901, 58.242, 65.96901);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_153
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.641, 75.77);
        ((GeneralPath) shape).lineTo(6.961, 76.172);
        ((GeneralPath) shape).lineTo(8.242, 76.211);
        ((GeneralPath) shape).curveTo(9.816, 76.266, 10.9609995, 76.184, 11.679999, 75.969);
        ((GeneralPath) shape).curveTo(12.266, 75.809, 13.094, 75.504005, 14.16, 75.051);
        ((GeneralPath) shape).curveTo(15.281, 74.598, 16.109, 74.289, 16.640999, 74.129005);
        ((GeneralPath) shape).curveTo(17.07, 73.996, 17.762, 73.824005, 18.723, 73.60901);
        ((GeneralPath) shape).curveTo(19.574, 73.37101, 20.227, 73.10601, 20.68, 72.809006);
        ((GeneralPath) shape).curveTo(20.469, 72.465004, 19.988, 72.172005, 19.242, 71.93001);
        ((GeneralPath) shape).curveTo(18.734001, 71.797005, 17.883001, 71.69101, 16.68, 71.60901);
        ((GeneralPath) shape).curveTo(13.266001, 71.34401, 9.508, 71.43801, 5.4020004, 71.89101);
        ((GeneralPath) shape).lineTo(4.0000005, 72.05101);
        ((GeneralPath) shape).curveTo(3.7620006, 72.98401, 3.6950004, 73.71501, 3.8010006, 74.25001);
        ((GeneralPath) shape).lineTo(4.0000005, 74.770004);
        ((GeneralPath) shape).lineTo(4.7620006, 74.852005);
        ((GeneralPath) shape).curveTo(5.1090007, 74.770004, 5.469001, 74.836006, 5.8400006, 75.051);
        ((GeneralPath) shape).curveTo(6.1880007, 75.211006, 6.4530005, 75.449005, 6.6410007, 75.770004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x453626));
        g.fill(shape);

        // _0_0_0_154
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.281, 76.809);
        ((GeneralPath) shape).curveTo(19.441, 76.784996, 19.668, 76.730995, 19.961, 76.647995);
        ((GeneralPath) shape).curveTo(20.066, 76.59799, 20.562, 76.355995, 21.441, 75.92999);
        ((GeneralPath) shape).lineTo(22.0, 75.60899);
        ((GeneralPath) shape).curveTo(22.426, 75.397995, 22.855, 75.23799, 23.281, 75.12899);
        ((GeneralPath) shape).curveTo(24.402, 74.86299, 25.402, 74.56999, 26.281, 74.24999);
        ((GeneralPath) shape).curveTo(26.789, 74.062996, 27.562, 73.76999, 28.602001, 73.370995);
        ((GeneralPath) shape).curveTo(28.789001, 73.315994, 29.082, 73.24999, 29.480001, 73.172);
        ((GeneralPath) shape).curveTo(29.188002, 73.062996, 28.707, 73.09, 28.043001, 73.25);
        ((GeneralPath) shape).curveTo(27.320002, 73.438, 26.840002, 73.555, 26.602001, 73.609);
        ((GeneralPath) shape).lineTo(26.562, 73.609);
        ((GeneralPath) shape).curveTo(25.387001, 73.875, 24.68, 74.051, 24.441, 74.129);
        ((GeneralPath) shape).curveTo(23.293, 74.637, 22.426, 75.012, 21.84, 75.25);
        ((GeneralPath) shape).curveTo(21.656, 75.332, 21.043, 75.531, 20.0, 75.852);
        ((GeneralPath) shape).curveTo(19.254, 76.195, 18.68, 76.437996, 18.281, 76.57);
        ((GeneralPath) shape).curveTo(17.426, 76.863, 16.562, 77.09, 15.68, 77.25);
        ((GeneralPath) shape).curveTo(14.242001, 77.598, 13.4140005, 77.797, 13.203, 77.852);
        ((GeneralPath) shape).lineTo(12.043, 78.129);
        ((GeneralPath) shape).lineTo(18.562, 77.211);
        ((GeneralPath) shape).lineTo(18.68, 77.129);
        ((GeneralPath) shape).curveTo(18.789, 77.022995, 18.988, 76.918, 19.281, 76.809);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_155
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.043, 76.77);
        ((GeneralPath) shape).lineTo(26.203, 76.531);
        ((GeneralPath) shape).lineTo(26.401999, 76.409996);
        ((GeneralPath) shape).curveTo(26.694998, 76.117, 27.065998, 75.809, 27.519999, 75.488);
        ((GeneralPath) shape).curveTo(28.054998, 75.117, 28.612999, 74.836, 29.203, 74.648);
        ((GeneralPath) shape).curveTo(27.921999, 74.648, 26.855, 75.035, 26.0, 75.809006);
        ((GeneralPath) shape).lineTo(25.32, 76.531006);
        ((GeneralPath) shape).lineTo(25.043, 76.770004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_156
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.84, 71.289);
        ((GeneralPath) shape).curveTo(42.68, 71.266, 42.59, 71.289, 42.562, 71.371);
        ((GeneralPath) shape).lineTo(42.883, 71.41);
        ((GeneralPath) shape).curveTo(43.496, 71.51601, 44.281, 71.51601, 45.242, 71.41);
        ((GeneralPath) shape).curveTo(46.496002, 71.305, 47.414, 71.305, 48.0, 71.41);
        ((GeneralPath) shape).lineTo(48.68, 71.57001);
        ((GeneralPath) shape).lineTo(52.16, 70.809006);
        ((GeneralPath) shape).curveTo(49.602, 70.809006, 47.496, 70.90201, 45.84, 71.090004);
        ((GeneralPath) shape).curveTo(44.453, 71.117004, 43.453, 71.184006, 42.84, 71.289);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_157
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(46.562, 69.012);
        ((GeneralPath) shape).curveTo(41.734, 69.090004, 39.309002, 69.129, 39.281, 69.129);
        ((GeneralPath) shape).lineTo(38.961, 69.129);
        ((GeneralPath) shape).lineTo(37.601997, 69.25);
        ((GeneralPath) shape).curveTo(37.573997, 69.516, 37.815998, 69.648, 38.319996, 69.648);
        ((GeneralPath) shape).curveTo(38.585995, 69.648, 38.933994, 69.621, 39.358997, 69.57);
        ((GeneralPath) shape).lineTo(52.839996, 68.969);
        ((GeneralPath) shape).lineTo(46.561996, 69.012);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_158
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.121, 68.609);
        ((GeneralPath) shape).lineTo(58.16, 67.691);
        ((GeneralPath) shape).curveTo(57.387, 67.715004, 56.387, 67.809, 55.16, 67.969);
        ((GeneralPath) shape).curveTo(53.48, 68.211, 52.492, 68.344, 52.203, 68.371);
        ((GeneralPath) shape).curveTo(51.375, 68.422005, 50.773, 68.477005, 50.402, 68.531006);
        ((GeneralPath) shape).lineTo(50.203, 68.60901);
        ((GeneralPath) shape).curveTo(50.601997, 68.66401, 51.137, 68.67601, 51.801, 68.64801);
        ((GeneralPath) shape).curveTo(52.148, 68.64801, 52.668, 68.63701, 53.358997, 68.60901);
        ((GeneralPath) shape).lineTo(56.121, 68.60901);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_159
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.801, 66.891);
        ((GeneralPath) shape).lineTo(67.479996, 65.371);
        ((GeneralPath) shape).lineTo(58.159996, 65.969);
        ((GeneralPath) shape).curveTo(54.374996, 66.106, 51.546997, 66.25, 49.679996, 66.41);
        ((GeneralPath) shape).curveTo(49.015995, 66.465004, 48.081997, 66.609, 46.882996, 66.852005);
        ((GeneralPath) shape).curveTo(45.601997, 67.090004, 44.667995, 67.23801, 44.081997, 67.289);
        ((GeneralPath) shape).curveTo(45.253998, 67.289, 46.761997, 67.223, 48.601997, 67.090004);
        ((GeneralPath) shape).curveTo(50.948997, 66.93, 52.453, 66.836006, 53.121, 66.809006);
        ((GeneralPath) shape).lineTo(53.440998, 66.809006);
        ((GeneralPath) shape).curveTo(54.426, 66.785, 55.883, 66.809006, 57.801, 66.89101);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_160
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.242, 77.809);
        ((GeneralPath) shape).lineTo(22.801, 77.25);
        ((GeneralPath) shape).lineTo(22.043001, 77.332);
        ((GeneralPath) shape).curveTo(21.348001, 77.465004, 20.840002, 77.559, 20.52, 77.609);
        ((GeneralPath) shape).curveTo(19.906, 77.715004, 19.387001, 77.770004, 18.961, 77.770004);
        ((GeneralPath) shape).lineTo(15.359, 77.93001);
        ((GeneralPath) shape).curveTo(14.109, 78.03501, 13.0, 78.10601, 12.043, 78.129005);
        ((GeneralPath) shape).curveTo(11.613, 78.129005, 11.16, 78.106, 10.68, 78.051);
        ((GeneralPath) shape).curveTo(10.176001, 77.996, 9.895, 77.875, 9.84, 77.691);
        ((GeneralPath) shape).lineTo(9.801001, 77.609);
        ((GeneralPath) shape).curveTo(9.375001, 77.582, 9.109, 77.559, 9.000001, 77.531);
        ((GeneralPath) shape).curveTo(8.816001, 77.449, 8.7890005, 77.238, 8.922001, 76.891);
        ((GeneralPath) shape).lineTo(8.723001, 76.77);
        ((GeneralPath) shape).curveTo(8.613001, 76.715, 8.359, 76.663994, 7.9610004, 76.60899);
        ((GeneralPath) shape).curveTo(7.6130004, 76.55499, 7.359, 76.48799, 7.2030005, 76.409996);
        ((GeneralPath) shape).lineTo(6.9610004, 76.172);
        ((GeneralPath) shape).lineTo(6.6410003, 75.77);
        ((GeneralPath) shape).curveTo(6.453, 75.449, 6.188, 75.211, 5.84, 75.050995);
        ((GeneralPath) shape).curveTo(5.4690003, 74.836, 5.109, 74.77, 4.762, 74.852);
        ((GeneralPath) shape).lineTo(4.0, 74.77);
        ((GeneralPath) shape).curveTo(4.402, 75.355995, 5.281, 76.050995, 6.641, 76.852);
        ((GeneralPath) shape).curveTo(7.3589997, 77.277, 8.254, 77.77, 9.32, 78.332);
        ((GeneralPath) shape).curveTo(10.120999, 78.785, 11.348, 78.969, 13.0, 78.891);
        ((GeneralPath) shape).curveTo(14.707, 78.809, 17.121, 78.449, 20.242, 77.809);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7C6245));
        g.fill(shape);

        // _0_0_0_161
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.762, 75.731);
        ((GeneralPath) shape).curveTo(27.745998, 75.89101, 26.960999, 76.117004, 26.401999, 76.41);
        ((GeneralPath) shape).lineTo(26.203, 76.531006);
        ((GeneralPath) shape).lineTo(46.16, 72.172005);
        ((GeneralPath) shape).curveTo(44.801, 72.356, 43.773, 72.477005, 43.082, 72.531006);
        ((GeneralPath) shape).curveTo(42.176003, 72.531006, 41.496002, 72.559006, 41.043, 72.60901);
        ((GeneralPath) shape).curveTo(40.242, 72.74201, 39.628998, 72.836006, 39.203, 72.89101);
        ((GeneralPath) shape).lineTo(37.801, 72.93001);
        ((GeneralPath) shape).curveTo(37.241997, 72.98401, 36.573997, 73.211006, 35.801, 73.60901);
        ((GeneralPath) shape).curveTo(34.761997, 74.14501, 34.136997, 74.449005, 33.921997, 74.531006);
        ((GeneralPath) shape).lineTo(31.241997, 75.33201);
        ((GeneralPath) shape).curveTo(31.054996, 75.38301, 30.226997, 75.51601, 28.761997, 75.73101);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_162
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.883, 80.77);
        ((GeneralPath) shape).lineTo(67.961006, 81.809);
        ((GeneralPath) shape).curveTo(67.43001, 81.355995, 66.938, 80.957, 66.48, 80.609);
        ((GeneralPath) shape).curveTo(65.629005, 79.969, 64.977005, 79.625, 64.523, 79.57);
        ((GeneralPath) shape).curveTo(64.281006, 79.516, 64.109, 79.57, 64.004005, 79.731);
        ((GeneralPath) shape).curveTo(63.844006, 79.918, 63.895004, 80.145004, 64.16, 80.41);
        ((GeneralPath) shape).curveTo(64.402, 80.703, 64.64101, 80.824005, 64.883, 80.770004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x453626));
        g.fill(shape);

        // _0_0_0_163
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.359, 78.25);
        ((GeneralPath) shape).lineTo(73.641, 80.371);
        ((GeneralPath) shape).lineTo(73.801, 80.25);
        ((GeneralPath) shape).curveTo(72.520004, 79.238, 71.547005, 78.555, 70.883, 78.211);
        ((GeneralPath) shape).curveTo(70.32, 77.918, 69.840004, 77.702995, 69.441, 77.57);
        ((GeneralPath) shape).curveTo(68.773, 77.305, 68.32, 77.223, 68.082, 77.332);
        ((GeneralPath) shape).curveTo(68.109, 77.516, 68.281, 77.715004, 68.602, 77.93);
        ((GeneralPath) shape).curveTo(68.867, 78.090004, 69.120995, 78.195, 69.359, 78.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_164
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.281, 76.449);
        ((GeneralPath) shape).lineTo(78.800995, 75.93);
        ((GeneralPath) shape).lineTo(77.08199, 74.57);
        ((GeneralPath) shape).curveTo(76.01599, 73.664, 74.895, 72.918, 73.72299, 72.332);
        ((GeneralPath) shape).curveTo(73.24199, 72.172, 72.86699, 72.106, 72.60199, 72.129);
        ((GeneralPath) shape).lineTo(72.12099, 72.172);
        ((GeneralPath) shape).lineTo(72.081985, 72.211);
        ((GeneralPath) shape).lineTo(72.081985, 72.25);
        ((GeneralPath) shape).curveTo(72.108986, 72.305, 72.24199, 72.41, 72.47999, 72.57);
        ((GeneralPath) shape).curveTo(73.22699, 72.969, 73.694984, 73.25, 73.88299, 73.409996);
        ((GeneralPath) shape).curveTo(74.01599, 73.488, 74.25399, 73.675995, 74.60199, 73.968994);
        ((GeneralPath) shape).curveTo(74.89499, 74.23799, 75.15999, 74.355995, 75.40199, 74.33199);
        ((GeneralPath) shape).lineTo(78.28099, 76.44899);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_165
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(81.0, 73.93);
        ((GeneralPath) shape).lineTo(82.242, 72.809);
        ((GeneralPath) shape).lineTo(80.32, 71.690994);
        ((GeneralPath) shape).curveTo(77.789, 70.19499, 76.48, 69.422, 76.402, 69.370995);
        ((GeneralPath) shape).curveTo(75.977, 69.129, 75.602, 69.077995, 75.281, 69.21099);
        ((GeneralPath) shape).curveTo(75.309, 69.315994, 75.629, 69.73099, 76.242, 70.44899);
        ((GeneralPath) shape).curveTo(76.348, 70.58199, 76.550995, 70.85199, 76.843994, 71.24999);
        ((GeneralPath) shape).curveTo(77.13699, 71.59799, 77.39099, 71.80899, 77.602, 71.89099);
        ((GeneralPath) shape).curveTo(77.656, 71.59799, 77.723, 71.42199, 77.800995, 71.370995);
        ((GeneralPath) shape).curveTo(78.147995, 71.504, 78.522995, 71.77, 78.922, 72.172);
        ((GeneralPath) shape).curveTo(79.159996, 72.409996, 79.507996, 72.77, 79.961, 73.25);
        ((GeneralPath) shape).curveTo(80.359, 73.598, 80.707, 73.824, 81.0, 73.93);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_166
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.121, 68.332);
        ((GeneralPath) shape).curveTo(78.121, 68.598, 78.336, 68.863, 78.762, 69.129);
        ((GeneralPath) shape).curveTo(79.16, 69.422, 79.492004, 69.543, 79.762, 69.488);
        ((GeneralPath) shape).lineTo(83.723, 71.409996);
        ((GeneralPath) shape).lineTo(83.879, 71.24999);
        ((GeneralPath) shape).curveTo(82.065994, 70.050995, 80.723, 69.24999, 79.84, 68.85199);
        ((GeneralPath) shape).curveTo(79.043, 68.44899, 78.468994, 68.27699, 78.120995, 68.33199);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_167
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(80.48, 66.172);
        ((GeneralPath) shape).lineTo(80.441, 66.129);
        ((GeneralPath) shape).curveTo(79.801, 65.863, 79.375, 65.757996, 79.16, 65.809);
        ((GeneralPath) shape).lineTo(79.32001, 66.129);
        ((GeneralPath) shape).curveTo(79.50801, 66.422, 79.840004, 66.757996, 80.32001, 67.129);
        ((GeneralPath) shape).curveTo(80.82801, 67.504, 81.309006, 67.784996, 81.76201, 67.968994);
        ((GeneralPath) shape).lineTo(84.00001, 68.33199);
        ((GeneralPath) shape).curveTo(83.14801, 67.55499, 81.977005, 66.83599, 80.48001, 66.17199);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_168
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(91.082, 63.809);
        ((GeneralPath) shape).curveTo(89.934, 63.996, 88.801, 63.625, 87.68, 62.690998);
        ((GeneralPath) shape).curveTo(87.176, 62.211, 86.762, 61.851997, 86.441, 61.608997);
        ((GeneralPath) shape).curveTo(85.883, 61.156, 85.387, 60.983997, 84.961, 61.089996);
        ((GeneralPath) shape).curveTo(84.909996, 61.331997, 84.988, 61.624996, 85.202995, 61.968998);
        ((GeneralPath) shape).curveTo(85.440994, 62.315998, 85.67999, 62.516, 85.922, 62.57);
        ((GeneralPath) shape).lineTo(90.32, 65.012);
        ((GeneralPath) shape).lineTo(92.562, 62.731003);
        ((GeneralPath) shape).lineTo(90.120995, 61.570004);
        ((GeneralPath) shape).curveTo(89.215, 61.090004, 88.242, 60.531002, 87.202995, 59.891003);
        ((GeneralPath) shape).lineTo(86.562, 59.531002);
        ((GeneralPath) shape).curveTo(86.507996, 59.477, 86.413994, 59.449, 86.281, 59.449);
        ((GeneralPath) shape).curveTo(86.949, 60.25, 88.159996, 61.156002, 89.922, 62.172);
        ((GeneralPath) shape).curveTo(90.402, 62.465, 90.695, 62.691, 90.800995, 62.852);
        ((GeneralPath) shape).curveTo(91.01599, 63.09, 91.10899, 63.41, 91.08199, 63.809002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_169
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(89.562, 59.012);
        ((GeneralPath) shape).lineTo(92.159996, 59.691);
        ((GeneralPath) shape).curveTo(91.602, 59.316, 91.159996, 59.023003, 90.84, 58.809002);
        ((GeneralPath) shape).curveTo(90.227, 58.410004, 89.695, 58.129, 89.242, 57.969);
        ((GeneralPath) shape).curveTo(88.629, 57.731003, 88.10899, 57.648003, 87.68, 57.731003);
        ((GeneralPath) shape).curveTo(87.523, 58.051003, 87.734, 58.344, 88.32, 58.609);
        ((GeneralPath) shape).curveTo(88.641, 58.715, 89.055, 58.852, 89.562, 59.012);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_170
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(91.723, 55.969);
        ((GeneralPath) shape).curveTo(92.148, 56.266003, 92.414, 56.465, 92.52, 56.570004);
        ((GeneralPath) shape).lineTo(96.723, 58.488003);
        ((GeneralPath) shape).lineTo(96.801, 58.410004);
        ((GeneralPath) shape).curveTo(95.336006, 56.809002, 93.883, 55.598003, 92.441, 54.770004);
        ((GeneralPath) shape).curveTo(92.043, 54.531006, 91.723, 54.344006, 91.48, 54.211006);
        ((GeneralPath) shape).curveTo(91.0, 53.996006, 90.64101, 53.902008, 90.402, 53.930008);
        ((GeneralPath) shape).lineTo(90.402, 54.051006);
        ((GeneralPath) shape).curveTo(90.402, 54.238007, 90.602, 54.648006, 91.0, 55.289005);
        ((GeneralPath) shape).curveTo(91.16, 55.555004, 91.402, 55.785004, 91.723, 55.969006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_171
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(95.723, 55.129);
        ((GeneralPath) shape).curveTo(93.055, 53.023003, 91.629, 52.465, 91.441, 53.449);
        ((GeneralPath) shape).curveTo(91.414, 53.609, 91.453, 53.77, 91.559, 53.93);
        ((GeneralPath) shape).curveTo(91.691, 54.145, 91.879, 54.332, 92.120995, 54.488);
        ((GeneralPath) shape).curveTo(92.35899, 54.676, 92.574, 54.758, 92.76199, 54.731);
        ((GeneralPath) shape).lineTo(97.60199, 56.690998);
        ((GeneralPath) shape).curveTo(97.19899, 56.288998, 96.57399, 55.769997, 95.71899, 55.128998);
        ((GeneralPath) shape).lineTo(95.722984, 55.128998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_172
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(95.242, 53.25);
        ((GeneralPath) shape).lineTo(98.202995, 54.488);
        ((GeneralPath) shape).curveTo(97.31999, 53.851997, 96.641, 53.356, 96.159996, 53.011997);
        ((GeneralPath) shape).curveTo(95.309, 52.398, 94.574, 51.983997, 93.961, 51.769997);
        ((GeneralPath) shape).curveTo(93.723, 51.554996, 93.507996, 51.531, 93.32, 51.690998);
        ((GeneralPath) shape).curveTo(93.348, 51.901997, 93.52, 52.144997, 93.84, 52.41);
        ((GeneralPath) shape).curveTo(94.0, 52.543, 94.468994, 52.824, 95.242, 53.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_173
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(100.44, 52.051);
        ((GeneralPath) shape).curveTo(99.96, 51.383, 99.292, 50.663998, 98.44, 49.891);
        ((GeneralPath) shape).lineTo(98.241005, 49.648);
        ((GeneralPath) shape).lineTo(97.761, 49.25);
        ((GeneralPath) shape).curveTo(97.358, 48.957, 97.065, 48.824, 96.878, 48.852);
        ((GeneralPath) shape).curveTo(96.854, 49.063, 96.921, 49.266003, 97.081, 49.449);
        ((GeneralPath) shape).curveTo(97.214005, 49.609, 97.386, 49.715, 97.601, 49.77);
        ((GeneralPath) shape).lineTo(100.439995, 52.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_174
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(102.12, 52.77);
        ((GeneralPath) shape).lineTo(101.358, 52.371002);
        ((GeneralPath) shape).lineTo(101.159004, 52.289);
        ((GeneralPath) shape).curveTo(101.241005, 52.449, 101.479004, 52.703003, 101.878006, 53.051003);
        ((GeneralPath) shape).curveTo(101.96001, 52.996002, 102.04201, 52.902004, 102.12, 52.770004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_175
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(99.922, 48.891);
        ((GeneralPath) shape).lineTo(103.242, 51.211);
        ((GeneralPath) shape).lineTo(103.52, 50.731);
        ((GeneralPath) shape).lineTo(101.440994, 49.608997);
        ((GeneralPath) shape).curveTo(100.242, 48.944996, 99.33199, 48.371, 98.72299, 47.891);
        ((GeneralPath) shape).curveTo(98.72299, 47.945, 99.120995, 48.277, 99.92199, 48.891);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_176
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(98.203, 40.25);
        ((GeneralPath) shape).lineTo(98.203, 41.051);
        ((GeneralPath) shape).curveTo(98.176, 41.421997, 98.148, 41.715, 98.121, 41.93);
        ((GeneralPath) shape).curveTo(98.094, 42.332, 98.121, 42.609, 98.203, 42.77);
        ((GeneralPath) shape).curveTo(98.281006, 42.93, 98.387, 43.035, 98.520004, 43.09);
        ((GeneralPath) shape).curveTo(98.520004, 43.117, 98.72301, 43.195, 99.121, 43.332);
        ((GeneralPath) shape).curveTo(99.895004, 43.57, 101.094, 43.891, 102.723, 44.289);
        ((GeneralPath) shape).curveTo(102.855, 44.156002, 102.707, 43.836002, 102.281, 43.332);
        ((GeneralPath) shape).curveTo(101.772995, 42.715, 101.507996, 42.383, 101.479996, 42.332);
        ((GeneralPath) shape).curveTo(101.827995, 42.625, 102.132996, 42.984, 102.397995, 43.41);
        ((GeneralPath) shape).curveTo(102.852, 44.023, 103.574, 44.918, 104.559, 46.09);
        ((GeneralPath) shape).curveTo(104.719, 46.277, 104.84, 46.504, 104.922, 46.77);
        ((GeneralPath) shape).curveTo(104.332, 46.93, 103.479996, 46.77, 102.35899, 46.289);
        ((GeneralPath) shape).curveTo(102.65199, 46.691, 103.132996, 47.238003, 103.800995, 47.93);
        ((GeneralPath) shape).curveTo(103.961, 48.09, 104.199, 48.356, 104.52, 48.731);
        ((GeneralPath) shape).curveTo(105.0, 47.531, 105.238, 46.315998, 105.238, 45.09);
        ((GeneralPath) shape).curveTo(105.238, 44.664, 105.148, 44.129, 104.961, 43.488);
        ((GeneralPath) shape).lineTo(103.800995, 42.608997);
        ((GeneralPath) shape).curveTo(102.413994, 41.863, 101.132996, 41.276997, 99.961, 40.851997);
        ((GeneralPath) shape).curveTo(99.082, 40.503998, 98.492, 40.304996, 98.202995, 40.249996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_177
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(98.32, 38.41);
        ((GeneralPath) shape).curveTo(98.402, 38.781, 98.801, 39.09, 99.52, 39.328);
        ((GeneralPath) shape).curveTo(99.895, 39.465, 100.413994, 39.608997, 101.08199, 39.77);
        ((GeneralPath) shape).curveTo(102.22699, 40.195, 103.22699, 40.809002, 104.08199, 41.609);
        ((GeneralPath) shape).curveTo(103.147995, 40.035, 101.60199, 38.598, 99.440994, 37.289);
        ((GeneralPath) shape).lineTo(99.397995, 37.289);
        ((GeneralPath) shape).curveTo(98.602, 37.582, 98.242, 37.957, 98.31999, 38.41);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        paint1(g, origAlpha, transformations);
    }

    private static void paint1(Graphics2D g, float origAlpha, java.util.LinkedList<AffineTransform> transformations) {
        Shape shape = null;

        // _0_0_0_178
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.441, 80.731);
        ((GeneralPath) shape).curveTo(57.895, 82.648, 58.574, 83.703, 59.480003, 83.89101);
        ((GeneralPath) shape).curveTo(61.910004, 84.37101, 67.949005, 79.94501, 77.602005, 70.60901);
        ((GeneralPath) shape).curveTo(81.121, 67.22301, 87.16, 61.01201, 95.72301, 51.96901);
        ((GeneralPath) shape).curveTo(97.961006, 49.62101, 99.46901, 47.28901, 100.242004, 44.96901);
        ((GeneralPath) shape).curveTo(100.66801, 43.74201, 100.840004, 42.67601, 100.762, 41.770008);
        ((GeneralPath) shape).curveTo(100.762, 40.863007, 100.508, 39.87901, 100.0, 38.813007);
        ((GeneralPath) shape).curveTo(99.039, 36.836006, 97.375, 35.11701, 95.0, 33.652008);
        ((GeneralPath) shape).curveTo(85.879, 28.051008, 79.707, 24.383007, 76.479996, 22.652008);
        ((GeneralPath) shape).curveTo(66.69499, 17.398008, 60.651997, 15.410007, 58.358994, 16.691008);
        ((GeneralPath) shape).curveTo(57.50799, 17.172009, 56.894993, 18.371008, 56.519993, 20.289007);
        ((GeneralPath) shape).curveTo(56.253994, 21.570007, 56.01599, 23.875008, 55.80099, 27.211006);
        ((GeneralPath) shape).curveTo(55.694992, 28.598005, 55.64099, 30.941006, 55.64099, 34.250008);
        ((GeneralPath) shape).curveTo(39.24199, 36.516006, 26.147991, 38.438007, 16.35899, 40.01201);
        ((GeneralPath) shape).curveTo(11.3749895, 40.78101, 8.04299, 41.74201, 6.3589897, 42.89101);
        ((GeneralPath) shape).curveTo(5.05499, 43.77001, 4.2029896, 45.27701, 3.8009896, 47.41001);
        ((GeneralPath) shape).curveTo(3.3749895, 49.62501, 2.9999895, 53.57001, 2.6799896, 59.25001);
        ((GeneralPath) shape).lineTo(2.6409895, 59.289013);
        ((GeneralPath) shape).lineTo(2.6409895, 60.809013);
        ((GeneralPath) shape).curveTo(2.7229896, 66.277016, 2.9489896, 70.18401, 3.3199897, 72.53101);
        ((GeneralPath) shape).curveTo(3.6679897, 74.60902, 4.49599, 75.85201, 5.8009896, 76.250015);
        ((GeneralPath) shape).curveTo(7.4799895, 76.78502, 10.866989, 76.50401, 15.960989, 75.41002);
        ((GeneralPath) shape).curveTo(25.722988, 73.35602, 39.10899, 70.332016, 56.120987, 66.332016);
        ((GeneralPath) shape).curveTo(56.202988, 69.66402, 56.31999, 72.10602, 56.47999, 73.64802);
        ((GeneralPath) shape).curveTo(56.827988, 77.14502, 57.147987, 79.50402, 57.440987, 80.73102);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x957C5E));
        g.fill(shape);

        // _0_0_0_179
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.242, 79.809);
        ((GeneralPath) shape).curveTo(57.695, 81.702995, 58.375, 82.742, 59.281002, 82.93);
        ((GeneralPath) shape).curveTo(61.707, 83.41, 67.734, 79.051, 77.359, 69.852);
        ((GeneralPath) shape).curveTo(80.109, 67.211, 86.121, 61.089996, 95.402, 51.488);
        ((GeneralPath) shape).curveTo(97.641, 49.171997, 99.148, 46.863, 99.922, 44.57);
        ((GeneralPath) shape).curveTo(100.375, 43.266, 100.534996, 42.211, 100.402, 41.41);
        ((GeneralPath) shape).curveTo(100.402, 40.504, 100.148, 39.531, 99.641, 38.488);
        ((GeneralPath) shape).curveTo(98.707, 36.543, 97.055, 34.851997, 94.68, 33.41);
        ((GeneralPath) shape).curveTo(84.867004, 27.515999, 78.707, 23.902, 76.203, 22.57);
        ((GeneralPath) shape).curveTo(66.469, 17.371, 60.453003, 15.398, 58.160004, 16.647999);
        ((GeneralPath) shape).curveTo(57.309002, 17.129, 56.695004, 18.331999, 56.320004, 20.249998);
        ((GeneralPath) shape).curveTo(56.055004, 21.503998, 55.812004, 23.769999, 55.602005, 27.050999);
        ((GeneralPath) shape).curveTo(55.492004, 28.437998, 55.441006, 30.758, 55.441006, 34.011997);
        ((GeneralPath) shape).curveTo(41.656006, 35.874996, 28.613007, 37.769997, 16.320007, 39.690998);
        ((GeneralPath) shape).curveTo(11.359007, 40.464996, 8.043007, 41.41, 6.359007, 42.531);
        ((GeneralPath) shape).curveTo(5.055007, 43.383, 4.2030067, 44.863, 3.8010068, 46.968998);
        ((GeneralPath) shape).curveTo(3.3750067, 49.156, 3.0000067, 53.051, 2.6800067, 58.648);
        ((GeneralPath) shape).lineTo(2.6410067, 58.690998);
        ((GeneralPath) shape).lineTo(2.6410067, 60.171997);
        ((GeneralPath) shape).curveTo(2.7230067, 65.582, 2.9490068, 69.437996, 3.3200068, 71.730995);
        ((GeneralPath) shape).curveTo(3.641007, 73.784996, 4.469007, 75.022995, 5.801007, 75.449);
        ((GeneralPath) shape).curveTo(7.4800067, 75.984, 10.855007, 75.702995, 15.922007, 74.609);
        ((GeneralPath) shape).curveTo(27.867006, 72.078, 41.203007, 69.078, 55.922005, 65.609);
        ((GeneralPath) shape).curveTo(56.000004, 68.945, 56.121006, 71.356, 56.281006, 72.852005);
        ((GeneralPath) shape).curveTo(56.629005, 76.289, 56.949005, 78.60901, 57.242004, 79.809006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6D583E));
        g.fill(shape);

        // _0_0_0_180
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.68, 76.609);
        ((GeneralPath) shape).lineTo(57.043, 78.852005);
        ((GeneralPath) shape).lineTo(69.203, 77.211006);
        ((GeneralPath) shape).lineTo(72.441, 74.37101);
        ((GeneralPath) shape).curveTo(68.094, 74.79701, 62.840004, 75.54301, 56.68, 76.60901);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x765E40));
        g.fill(shape);

        // _0_0_0_181
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.922, 65.609);
        ((GeneralPath) shape).lineTo(55.961002, 66.691);
        ((GeneralPath) shape).lineTo(66.121, 64.488);
        ((GeneralPath) shape).curveTo(71.641, 63.315998, 75.988, 62.531, 79.16, 62.128998);
        ((GeneralPath) shape).curveTo(79.855, 62.051, 82.027, 61.863, 85.68, 61.57);
        ((GeneralPath) shape).lineTo(87.762, 59.449);
        ((GeneralPath) shape).curveTo(85.098, 59.715, 83.043, 60.078003, 81.602005, 60.531002);
        ((GeneralPath) shape).curveTo(79.73401, 61.145, 77.66801, 61.637, 75.40201, 62.012);
        ((GeneralPath) shape).curveTo(72.492004, 62.488003, 65.06601, 63.809002, 53.12101, 65.969);
        ((GeneralPath) shape).curveTo(40.93401, 68.184, 33.10901, 69.582, 29.64101, 70.172005);
        ((GeneralPath) shape).lineTo(27.12101, 70.57001);
        ((GeneralPath) shape).lineTo(29.76201, 70.449005);
        ((GeneralPath) shape).lineTo(20.320011, 71.691);
        ((GeneralPath) shape).curveTo(19.039011, 71.902, 17.94901, 72.051, 17.039011, 72.129005);
        ((GeneralPath) shape).curveTo(16.160011, 72.184006, 15.426011, 72.23801, 14.840012, 72.28901);
        ((GeneralPath) shape).lineTo(12.160011, 72.64801);
        ((GeneralPath) shape).lineTo(12.082011, 72.64801);
        ((GeneralPath) shape).lineTo(9.480011, 73.05101);
        ((GeneralPath) shape).curveTo(7.348011, 73.39801, 5.559011, 73.78501, 4.121011, 74.21101);
        ((GeneralPath) shape).curveTo(4.7340107, 75.11701, 5.855011, 75.60902, 7.480011, 75.69102);
        ((GeneralPath) shape).curveTo(9.266011, 75.79702, 12.082011, 75.43802, 15.922011, 74.60902);
        ((GeneralPath) shape).curveTo(27.867012, 72.07802, 41.20301, 69.07802, 55.922012, 65.60902);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_182
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.68, 25.609);
        ((GeneralPath) shape).curveTo(61.949, 24.25, 68.094, 22.941, 74.121, 21.691);
        ((GeneralPath) shape).lineTo(74.402, 21.609);
        ((GeneralPath) shape).lineTo(72.242, 20.531);
        ((GeneralPath) shape).lineTo(55.800995, 24.172);
        ((GeneralPath) shape).lineTo(55.679996, 25.609001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_183
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.762, 42.969);
        ((GeneralPath) shape).curveTo(9.629, 41.902, 12.586, 41.117, 14.641, 40.609);
        ((GeneralPath) shape).curveTo(18.055, 39.781002, 21.254, 39.117, 24.242, 38.609);
        ((GeneralPath) shape).curveTo(26.773, 38.184002, 29.855, 37.731003, 33.48, 37.25);
        ((GeneralPath) shape).curveTo(36.093998, 36.902, 38.281, 36.543, 40.043, 36.168);
        ((GeneralPath) shape).curveTo(28.387, 37.823997, 20.48, 38.996, 16.32, 39.688);
        ((GeneralPath) shape).curveTo(10.882999, 40.516, 7.3589993, 41.609, 5.762, 42.968998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_184
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.602, 45.172);
        ((GeneralPath) shape).curveTo(6.7730002, 45.488003, 6.176, 45.703, 5.801, 45.809002);
        ((GeneralPath) shape).curveTo(5.1600003, 45.969, 4.5620003, 46.035004, 4.0, 46.012);
        ((GeneralPath) shape).lineTo(3.84, 46.77);
        ((GeneralPath) shape).curveTo(4.828, 46.477, 6.762, 45.77, 9.641, 44.648);
        ((GeneralPath) shape).lineTo(10.762, 44.171997);
        ((GeneralPath) shape).lineTo(7.602, 45.171997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_185
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.043, 22.09);
        ((GeneralPath) shape).lineTo(55.883, 23.25);
        ((GeneralPath) shape).lineTo(70.723, 19.77);
        ((GeneralPath) shape).lineTo(68.602, 18.852001);
        ((GeneralPath) shape).curveTo(63.081997, 20.316002, 58.894997, 21.398, 56.043, 22.09);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_186
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(75.402, 44.332);
        ((GeneralPath) shape).lineTo(78.281, 44.051003);
        ((GeneralPath) shape).curveTo(85.43, 43.277004, 92.800995, 42.637, 100.402, 42.129);
        ((GeneralPath) shape).curveTo(100.453, 41.758003, 100.453, 41.516003, 100.402, 41.41);
        ((GeneralPath) shape).curveTo(100.402, 40.797, 100.281, 40.156, 100.043, 39.492);
        ((GeneralPath) shape).curveTo(91.159996, 40.93, 85.695, 41.813, 83.641, 42.133);
        ((GeneralPath) shape).curveTo(80.734, 42.559, 75.656, 43.238, 68.402, 44.172);
        ((GeneralPath) shape).curveTo(61.652, 45.051003, 53.387, 46.238, 43.602, 47.731003);
        ((GeneralPath) shape).curveTo(36.109, 48.906002, 31.426003, 49.664, 29.562, 50.012);
        ((GeneralPath) shape).curveTo(28.867, 50.145, 27.906, 50.426003, 26.68, 50.852);
        ((GeneralPath) shape).lineTo(21.723, 52.691);
        ((GeneralPath) shape).curveTo(19.535, 53.570004, 18.043, 54.156002, 17.242, 54.449);
        ((GeneralPath) shape).curveTo(16.043001, 54.879, 14.469001, 55.25, 12.52, 55.57);
        ((GeneralPath) shape).lineTo(2.762, 57.41);
        ((GeneralPath) shape).lineTo(2.68, 58.652);
        ((GeneralPath) shape).lineTo(2.641, 58.691);
        ((GeneralPath) shape).lineTo(2.641, 59.531002);
        ((GeneralPath) shape).curveTo(6.27, 58.969, 9.988, 58.410004, 13.801, 57.852);
        ((GeneralPath) shape).curveTo(16.175999, 57.422, 18.668, 56.691, 21.281, 55.648003);
        ((GeneralPath) shape).curveTo(23.281, 54.875004, 25.254, 53.930004, 27.203, 52.809002);
        ((GeneralPath) shape).curveTo(28.293, 52.195004, 29.800999, 51.715, 31.723, 51.371002);
        ((GeneralPath) shape).lineTo(48.48, 48.449);
        ((GeneralPath) shape).curveTo(48.562, 48.422, 50.922, 47.984, 55.562, 47.129);
        ((GeneralPath) shape).curveTo(58.309002, 46.625, 61.0, 46.184002, 63.641, 45.809002);
        ((GeneralPath) shape).curveTo(67.055, 45.145, 70.977, 44.648003, 75.402, 44.332);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_187
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(77.203, 39.93);
        ((GeneralPath) shape).curveTo(75.762, 40.172, 72.492004, 40.758, 67.402, 41.691);
        ((GeneralPath) shape).curveTo(63.75, 42.356003, 57.562, 43.156002, 48.84, 44.09);
        ((GeneralPath) shape).curveTo(40.227, 45.023, 35.359, 45.598, 34.242, 45.809002);
        ((GeneralPath) shape).curveTo(29.52, 46.664, 26.75, 47.184002, 25.922, 47.371002);
        ((GeneralPath) shape).curveTo(22.375, 48.117, 20.0, 48.875004, 18.801, 49.648003);
        ((GeneralPath) shape).curveTo(17.68, 50.371002, 16.375, 51.117004, 14.883, 51.891003);
        ((GeneralPath) shape).lineTo(12.961, 52.852);
        ((GeneralPath) shape).lineTo(2.922001, 54.531002);
        ((GeneralPath) shape).lineTo(2.8010008, 56.648003);
        ((GeneralPath) shape).lineTo(8.043001, 55.648003);
        ((GeneralPath) shape).curveTo(12.281001, 54.852, 14.801001, 54.250004, 15.602001, 53.852);
        ((GeneralPath) shape).curveTo(16.828001, 53.211002, 18.668001, 52.582, 21.121002, 51.969);
        ((GeneralPath) shape).curveTo(22.348001, 51.648003, 24.082003, 50.984, 26.320002, 49.969);
        ((GeneralPath) shape).curveTo(27.520002, 49.438004, 32.27, 48.449, 40.562, 47.012);
        ((GeneralPath) shape).curveTo(49.602, 45.438, 60.695, 43.785, 73.84, 42.051003);
        ((GeneralPath) shape).curveTo(88.13699, 40.184002, 95.909996, 39.145004, 97.159996, 38.930004);
        ((GeneralPath) shape).lineTo(99.67999, 38.531006);
        ((GeneralPath) shape).curveTo(99.28099, 37.758007, 98.84, 37.090004, 98.35899, 36.531006);
        ((GeneralPath) shape).curveTo(94.867, 37.172005, 92.04299, 37.637005, 89.879, 37.930004);
        ((GeneralPath) shape).curveTo(83.961, 38.758003, 79.73399, 39.422005, 77.199, 39.930004);
        ((GeneralPath) shape).lineTo(77.202995, 39.930004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_188
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(73.801, 39.25);
        ((GeneralPath) shape).curveTo(76.309006, 38.691, 77.574005, 38.332, 77.602005, 38.168);
        ((GeneralPath) shape).curveTo(77.629005, 38.09, 80.08201, 37.663998, 84.961006, 36.891);
        ((GeneralPath) shape).lineTo(96.840004, 35.008);
        ((GeneralPath) shape).curveTo(96.121, 34.395, 95.402, 33.863, 94.68, 33.41);
        ((GeneralPath) shape).lineTo(94.363, 33.25);
        ((GeneralPath) shape).curveTo(85.293, 34.367, 79.227, 35.168, 76.16, 35.648);
        ((GeneralPath) shape).curveTo(74.590004, 35.913998, 72.64101, 36.184, 70.32001, 36.448997);
        ((GeneralPath) shape).curveTo(68.48001, 36.687996, 66.49601, 37.007996, 64.36301, 37.409996);
        ((GeneralPath) shape).curveTo(51.08201, 39.995995, 43.160007, 41.515995, 40.602005, 41.968994);
        ((GeneralPath) shape).curveTo(38.203007, 42.366993, 34.590004, 42.847996, 29.762005, 43.409996);
        ((GeneralPath) shape).curveTo(25.684006, 43.886997, 22.977005, 44.272995, 21.641005, 44.569996);
        ((GeneralPath) shape).curveTo(20.629005, 44.808994, 19.414005, 45.194996, 18.004005, 45.730995);
        ((GeneralPath) shape).curveTo(16.375006, 46.421997, 15.121006, 46.940994, 14.242005, 47.288994);
        ((GeneralPath) shape).lineTo(16.762005, 46.690994);
        ((GeneralPath) shape).lineTo(13.762005, 47.487995);
        ((GeneralPath) shape).curveTo(12.242004, 48.105995, 10.777005, 48.608994, 9.363005, 49.011993);
        ((GeneralPath) shape).curveTo(8.988005, 49.116993, 6.9490047, 49.75799, 3.2420049, 50.929993);
        ((GeneralPath) shape).lineTo(3.043005, 53.370995);
        ((GeneralPath) shape).lineTo(4.121005, 53.171993);
        ((GeneralPath) shape).curveTo(5.988005, 52.823994, 8.176004, 52.515995, 10.684006, 52.249992);
        ((GeneralPath) shape).curveTo(12.574006, 51.929993, 14.242006, 51.35599, 15.684006, 50.53099);
        ((GeneralPath) shape).curveTo(18.082006, 49.11699, 19.348005, 48.38299, 19.480005, 48.33199);
        ((GeneralPath) shape).curveTo(20.496006, 47.85199, 21.988005, 47.355988, 23.961006, 46.85199);
        ((GeneralPath) shape).curveTo(28.414005, 45.70299, 30.883007, 45.07799, 31.363007, 44.96899);
        ((GeneralPath) shape).curveTo(35.336006, 44.17199, 41.297005, 43.27699, 49.242004, 42.28899);
        ((GeneralPath) shape).curveTo(55.188004, 41.54299, 60.723003, 40.95699, 65.844, 40.53099);
        ((GeneralPath) shape).curveTo(68.137, 40.34399, 70.789, 39.91799, 73.801, 39.249992);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_189
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.359, 80.289);
        ((GeneralPath) shape).curveTo(57.52, 80.93, 57.773003, 81.543, 58.121002, 82.129);
        ((GeneralPath) shape).lineTo(58.922, 82.012);
        ((GeneralPath) shape).curveTo(60.039, 81.449, 61.535, 81.035, 63.402, 80.770004);
        ((GeneralPath) shape).lineTo(64.762, 80.609);
        ((GeneralPath) shape).lineTo(64.840004, 80.57);
        ((GeneralPath) shape).lineTo(63.520004, 80.449);
        ((GeneralPath) shape).curveTo(64.188, 79.809, 65.176, 79.449, 66.48, 79.370995);
        ((GeneralPath) shape).lineTo(67.32, 78.730995);
        ((GeneralPath) shape).lineTo(57.359, 80.288994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_190
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.043, 16.77);
        ((GeneralPath) shape).curveTo(57.508, 17.09, 57.065998, 17.742, 56.723, 18.731);
        ((GeneralPath) shape).lineTo(64.562, 17.25);
        ((GeneralPath) shape).curveTo(63.309, 16.824, 62.136997, 16.531, 61.042995, 16.371);
        ((GeneralPath) shape).lineTo(60.761997, 16.41);
        ((GeneralPath) shape).curveTo(59.882996, 16.648, 59.309, 16.715, 59.042995, 16.609);
        ((GeneralPath) shape).lineTo(58.042995, 16.769999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_191
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.441, 32.051);
        ((GeneralPath) shape).curveTo(58.668003, 31.168, 61.816, 30.383, 64.883, 29.690998);
        ((GeneralPath) shape).curveTo(65.094, 29.636997, 69.137, 28.769999, 77.0, 27.089998);
        ((GeneralPath) shape).lineTo(82.32, 25.968998);
        ((GeneralPath) shape).lineTo(79.84, 24.569998);
        ((GeneralPath) shape).curveTo(70.827995, 26.222998, 62.976997, 27.968998, 56.281, 29.808998);
        ((GeneralPath) shape).lineTo(55.48, 30.011997);
        ((GeneralPath) shape).lineTo(55.440998, 32.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_192
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.441, 40.891);
        ((GeneralPath) shape).curveTo(14.094, 41.371, 10.242001, 42.383, 4.8830004, 43.93);
        ((GeneralPath) shape).curveTo(4.4800005, 44.543, 4.2030005, 45.211, 4.043, 45.93);
        ((GeneralPath) shape).curveTo(4.816, 45.316, 5.828, 44.742, 7.0820003, 44.211);
        ((GeneralPath) shape).curveTo(7.723, 43.918, 8.816, 43.503998, 10.359, 42.968998);
        ((GeneralPath) shape).curveTo(11.934, 42.383, 13.828, 41.874996, 16.043, 41.448997);
        ((GeneralPath) shape).curveTo(16.094, 41.448997, 18.055, 41.128998, 21.921999, 40.488);
        ((GeneralPath) shape).lineTo(22.203, 40.448997);
        ((GeneralPath) shape).lineTo(21.561998, 40.648);
        ((GeneralPath) shape).lineTo(19.479998, 41.57);
        ((GeneralPath) shape).lineTo(20.401999, 41.371);
        ((GeneralPath) shape).curveTo(23.065998, 40.940998, 27.226997, 40.343998, 32.883, 39.57);
        ((GeneralPath) shape).curveTo(38.0, 38.824, 42.133, 38.078, 45.281, 37.328);
        ((GeneralPath) shape).curveTo(47.976997, 36.688, 52.426, 35.582, 58.641, 34.012);
        ((GeneralPath) shape).curveTo(64.988, 32.488003, 71.800995, 31.102001, 79.082, 29.852001);
        ((GeneralPath) shape).lineTo(86.68, 28.570002);
        ((GeneralPath) shape).lineTo(86.602, 28.488);
        ((GeneralPath) shape).curveTo(85.242, 28.676, 83.73399, 28.809, 82.082, 28.891);
        ((GeneralPath) shape).curveTo(83.227, 28.781, 84.590004, 28.570002, 86.16, 28.25);
        ((GeneralPath) shape).lineTo(83.203, 26.488);
        ((GeneralPath) shape).curveTo(78.188, 27.477001, 74.043, 28.356, 70.762, 29.129002);
        ((GeneralPath) shape).curveTo(69.348, 29.477001, 64.242004, 30.848001, 55.441, 33.25);
        ((GeneralPath) shape).lineTo(55.441, 34.008);
        ((GeneralPath) shape).lineTo(49.922, 34.77);
        ((GeneralPath) shape).curveTo(47.176003, 35.516, 45.004, 36.039, 43.402, 36.332);
        ((GeneralPath) shape).curveTo(41.535, 36.703, 37.254, 37.422, 30.562, 38.488);
        ((GeneralPath) shape).curveTo(23.789001, 39.555, 19.082, 40.356, 16.441, 40.891);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_193
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.723, 38.289);
        ((GeneralPath) shape).curveTo(58.039, 37.758003, 59.973, 37.266003, 61.52, 36.809002);
        ((GeneralPath) shape).curveTo(62.746002, 36.516003, 64.961, 36.117, 68.16, 35.609);
        ((GeneralPath) shape).curveTo(69.121, 35.449, 70.734, 35.305, 73.0, 35.168);
        ((GeneralPath) shape).curveTo(74.762, 35.063, 80.574, 34.156, 90.441, 32.448997);
        ((GeneralPath) shape).lineTo(92.523, 32.089996);
        ((GeneralPath) shape).lineTo(88.043, 29.370996);
        ((GeneralPath) shape).lineTo(86.082, 29.730997);
        ((GeneralPath) shape).curveTo(67.441, 33.437996, 56.203003, 35.757996, 52.363, 36.690998);
        ((GeneralPath) shape).curveTo(48.843998, 37.598, 46.496, 38.184, 45.32, 38.448997);
        ((GeneralPath) shape).curveTo(43.59, 38.874996, 41.188, 39.266, 38.121, 39.608997);
        ((GeneralPath) shape).curveTo(30.733997, 40.437996, 24.706999, 41.328, 20.043, 42.288998);
        ((GeneralPath) shape).lineTo(8.120999, 46.608997);
        ((GeneralPath) shape).lineTo(7.7229996, 46.648);
        ((GeneralPath) shape).curveTo(7.0039997, 46.836, 6.3629994, 46.945, 5.8009996, 46.968998);
        ((GeneralPath) shape).lineTo(3.6799996, 47.488);
        ((GeneralPath) shape).lineTo(3.3589995, 49.93);
        ((GeneralPath) shape).curveTo(5.0429993, 49.609, 6.5619993, 49.277, 7.922, 48.93);
        ((GeneralPath) shape).curveTo(10.402, 48.238, 13.203, 47.184002, 16.32, 45.77);
        ((GeneralPath) shape).curveTo(19.121, 44.488, 21.32, 43.676, 22.922, 43.332);
        ((GeneralPath) shape).curveTo(24.895, 42.902, 27.07, 42.598, 29.441002, 42.41);
        ((GeneralPath) shape).curveTo(32.508003, 42.145, 35.629, 41.758, 38.801003, 41.25);
        ((GeneralPath) shape).curveTo(42.137, 40.719, 45.359, 40.227, 48.480003, 39.77);
        ((GeneralPath) shape).curveTo(50.535004, 39.449, 52.949005, 38.957, 55.723003, 38.289);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_194
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.84, 62.77);
        ((GeneralPath) shape).curveTo(69.772995, 62.289, 72.70699, 61.621002, 75.641, 60.77);
        ((GeneralPath) shape).curveTo(78.336, 59.996002, 80.452995, 59.504, 82.0, 59.289);
        ((GeneralPath) shape).curveTo(83.816, 59.051003, 85.961, 58.875, 88.441, 58.77);
        ((GeneralPath) shape).lineTo(89.602005, 57.57);
        ((GeneralPath) shape).lineTo(86.883, 57.968998);
        ((GeneralPath) shape).curveTo(81.73801, 58.851997, 73.949005, 60.223, 63.523003, 62.089996);
        ((GeneralPath) shape).curveTo(59.363003, 62.862995, 54.949, 63.597996, 50.281002, 64.288994);
        ((GeneralPath) shape).curveTo(43.641003, 65.33199, 36.602, 66.477, 29.160002, 67.730995);
        ((GeneralPath) shape).curveTo(20.469002, 69.22299, 14.070002, 70.355995, 9.961002, 71.129);
        ((GeneralPath) shape).lineTo(6.4410024, 71.852);
        ((GeneralPath) shape).curveTo(5.7770023, 72.034996, 4.7770023, 72.238, 3.4410024, 72.449);
        ((GeneralPath) shape).lineTo(3.6410024, 73.172);
        ((GeneralPath) shape).curveTo(6.4140024, 72.504, 8.641003, 72.034996, 10.320003, 71.77);
        ((GeneralPath) shape).curveTo(11.469003, 71.58199, 14.844003, 71.117, 20.441002, 70.370995);
        ((GeneralPath) shape).curveTo(25.883001, 69.675995, 30.656002, 68.98399, 34.762, 68.288994);
        ((GeneralPath) shape).curveTo(42.281002, 67.034996, 52.977, 65.19499, 66.84, 62.769993);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_195
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(79.281, 67.969);
        ((GeneralPath) shape).curveTo(75.016, 68.531, 69.215, 69.371, 61.882996, 70.488);
        ((GeneralPath) shape).curveTo(59.667995, 70.836, 57.761997, 71.172, 56.159996, 71.488);
        ((GeneralPath) shape).lineTo(56.241997, 72.488);
        ((GeneralPath) shape).curveTo(59.866997, 71.824, 62.347996, 71.382996, 63.679996, 71.172);
        ((GeneralPath) shape).curveTo(67.016, 70.582, 71.562, 70.156, 77.32, 69.891);
        ((GeneralPath) shape).lineTo(79.281, 67.969);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_196
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.16, 61.731);
        ((GeneralPath) shape).curveTo(63.641, 60.715, 67.789, 60.011997, 71.602, 59.608997);
        ((GeneralPath) shape).lineTo(90.602, 56.488);
        ((GeneralPath) shape).lineTo(91.562, 55.488);
        ((GeneralPath) shape).lineTo(69.602, 58.77);
        ((GeneralPath) shape).curveTo(61.121, 60.051, 48.668, 62.063, 32.241997, 64.809);
        ((GeneralPath) shape).curveTo(29.093996, 65.316, 23.839996, 66.289, 16.479996, 67.730995);
        ((GeneralPath) shape).curveTo(8.933996, 69.22299, 4.4799957, 70.09, 3.1209955, 70.33199);
        ((GeneralPath) shape).lineTo(3.2029955, 71.050995);
        ((GeneralPath) shape).curveTo(10.772996, 69.90199, 18.265995, 68.702995, 25.679995, 67.449);
        ((GeneralPath) shape).lineTo(59.159996, 61.731);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_197
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.723, 24.77);
        ((GeneralPath) shape).curveTo(70.812, 24.582, 72.453, 24.383001, 74.641, 24.172);
        ((GeneralPath) shape).curveTo(75.734, 24.012001, 76.879, 23.813002, 78.082, 23.570002);
        ((GeneralPath) shape).lineTo(77.762, 23.410002);
        ((GeneralPath) shape).curveTo(76.855, 23.598001, 76.121, 23.676003, 75.562004, 23.648003);
        ((GeneralPath) shape).lineTo(76.961006, 22.969002);
        ((GeneralPath) shape).lineTo(76.00001, 22.449001);
        ((GeneralPath) shape).lineTo(73.602005, 22.891);
        ((GeneralPath) shape).curveTo(68.40201, 23.852001, 62.414005, 25.051, 55.641006, 26.488);
        ((GeneralPath) shape).lineTo(55.520008, 29.09);
        ((GeneralPath) shape).curveTo(59.03901, 27.941, 62.203007, 27.063, 65.00001, 26.449);
        ((GeneralPath) shape).curveTo(66.254005, 25.647999, 67.82801, 25.09, 69.72301, 24.769999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_198
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.082, 21.531);
        ((GeneralPath) shape).lineTo(67.840004, 18.488);
        ((GeneralPath) shape).lineTo(66.082, 17.809);
        ((GeneralPath) shape).curveTo(64.055, 18.262, 62.441, 18.598, 61.242, 18.809);
        ((GeneralPath) shape).lineTo(56.402, 19.731);
        ((GeneralPath) shape).lineTo(56.082, 21.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_199
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.602, 48.852);
        ((GeneralPath) shape).curveTo(61.176003, 48.449, 64.668, 47.984, 68.082, 47.449);
        ((GeneralPath) shape).curveTo(72.215004, 46.758003, 75.867004, 46.211002, 79.043, 45.809002);
        ((GeneralPath) shape).curveTo(81.867, 45.465, 85.375, 45.129, 89.562, 44.809002);
        ((GeneralPath) shape).curveTo(94.895, 44.410004, 98.40199, 44.129, 100.082, 43.969);
        ((GeneralPath) shape).lineTo(100.16, 43.77);
        ((GeneralPath) shape).lineTo(97.762, 43.891);
        ((GeneralPath) shape).lineTo(100.203, 43.531);
        ((GeneralPath) shape).lineTo(100.32, 42.891);
        ((GeneralPath) shape).curveTo(93.121, 43.742, 88.641, 44.117, 86.879, 44.011997);
        ((GeneralPath) shape).curveTo(85.602, 43.929996, 83.547, 44.062996, 80.723, 44.409996);
        ((GeneralPath) shape).lineTo(64.922, 47.171997);
        ((GeneralPath) shape).curveTo(63.613, 47.249996, 60.573997, 47.569996, 55.800995, 48.128998);
        ((GeneralPath) shape).lineTo(36.440994, 51.448997);
        ((GeneralPath) shape).curveTo(33.987995, 51.874996, 32.159996, 52.266, 30.960995, 52.608997);
        ((GeneralPath) shape).curveTo(30.292995, 52.796997, 29.147995, 53.211, 27.519995, 53.851997);
        ((GeneralPath) shape).curveTo(25.679995, 54.757996, 24.175995, 55.488, 22.999994, 56.051);
        ((GeneralPath) shape).curveTo(20.815994, 57.063, 18.679995, 57.715, 16.601994, 58.011997);
        ((GeneralPath) shape).curveTo(12.866994, 58.542995, 8.2149935, 59.288998, 2.640993, 60.249996);
        ((GeneralPath) shape).lineTo(2.6799932, 61.730995);
        ((GeneralPath) shape).curveTo(5.722993, 61.569996, 8.065993, 61.464996, 9.722994, 61.409996);
        ((GeneralPath) shape).lineTo(7.319994, 61.769997);
        ((GeneralPath) shape).curveTo(10.015994, 61.531, 12.479994, 61.128998, 14.722994, 60.569996);
        ((GeneralPath) shape).curveTo(17.069994, 60.011997, 19.827993, 58.956997, 22.999994, 57.409996);
        ((GeneralPath) shape).curveTo(26.042994, 55.968994, 28.280994, 55.105995, 29.722994, 54.808994);
        ((GeneralPath) shape).curveTo(30.866993, 54.569996, 31.933994, 54.288994, 32.921993, 53.968994);
        ((GeneralPath) shape).curveTo(33.479992, 53.784996, 34.358994, 53.487995, 35.561993, 53.089993);
        ((GeneralPath) shape).curveTo(37.45299, 52.315994, 39.253994, 51.741993, 40.96099, 51.37099);
        ((GeneralPath) shape).curveTo(42.854992, 50.96899, 46.98799, 50.249992, 53.35899, 49.21099);
        ((GeneralPath) shape).curveTo(54.40199, 49.02299, 55.96099, 48.74199, 58.04299, 48.37099);
        ((GeneralPath) shape).curveTo(59.88299, 48.05099, 61.45299, 47.83599, 62.761993, 47.73099);
        ((GeneralPath) shape).lineTo(57.241993, 48.89099);
        ((GeneralPath) shape).lineTo(57.601994, 48.85199);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_200
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.281, 56.129);
        ((GeneralPath) shape).curveTo(67.336, 55.488003, 71.0, 54.918003, 74.281, 54.41);
        ((GeneralPath) shape).curveTo(77.534996, 53.902, 84.613, 52.875, 95.522995, 51.332);
        ((GeneralPath) shape).lineTo(97.08199, 49.57);
        ((GeneralPath) shape).curveTo(91.854996, 50.156, 87.815994, 50.676, 84.96099, 51.128998);
        ((GeneralPath) shape).curveTo(82.05499, 51.581997, 76.33599, 52.276997, 67.800995, 53.211);
        ((GeneralPath) shape).curveTo(58.386993, 54.25, 53.202995, 54.836, 52.241997, 54.968998);
        ((GeneralPath) shape).curveTo(48.456997, 55.448997, 41.815998, 56.714996, 32.319996, 58.769997);
        ((GeneralPath) shape).curveTo(31.761995, 58.874996, 29.147995, 59.809, 24.479996, 61.569996);
        ((GeneralPath) shape).curveTo(20.054996, 63.222996, 16.573996, 64.24999, 14.042995, 64.647995);
        ((GeneralPath) shape).lineTo(2.843995, 66.409996);
        ((GeneralPath) shape).lineTo(2.8829951, 67.24999);
        ((GeneralPath) shape).lineTo(9.120995, 66.44899);
        ((GeneralPath) shape).curveTo(11.2269945, 65.96899, 14.3589945, 65.50399, 18.519995, 65.05099);
        ((GeneralPath) shape).curveTo(19.722994, 64.73099, 20.894995, 64.38299, 22.042995, 64.011986);
        ((GeneralPath) shape).curveTo(24.147995, 63.288986, 26.413996, 62.515987, 28.839996, 61.690987);
        ((GeneralPath) shape).curveTo(30.679996, 61.155987, 33.253998, 60.59799, 36.561996, 60.011986);
        ((GeneralPath) shape).curveTo(38.667995, 59.636986, 40.425995, 59.397987, 41.839996, 59.288986);
        ((GeneralPath) shape).curveTo(39.519997, 59.183987, 37.800995, 59.288986, 36.679996, 59.608986);
        ((GeneralPath) shape).curveTo(34.788998, 60.144985, 32.839996, 60.515987, 30.839996, 60.730988);
        ((GeneralPath) shape).curveTo(31.987997, 59.95699, 33.866997, 59.448986, 36.479996, 59.210987);
        ((GeneralPath) shape).curveTo(37.733997, 59.050987, 38.386997, 58.968987, 38.440994, 58.968987);
        ((GeneralPath) shape).curveTo(39.452995, 58.647987, 40.226994, 58.448986, 40.761993, 58.370987);
        ((GeneralPath) shape).curveTo(41.479992, 58.265987, 42.440994, 58.210987, 43.640995, 58.210987);
        ((GeneralPath) shape).curveTo(45.187996, 58.210987, 46.175995, 58.19499, 46.601994, 58.171986);
        ((GeneralPath) shape).curveTo(47.933994, 58.089985, 49.88299, 57.917984, 52.440994, 57.647987);
        ((GeneralPath) shape).curveTo(55.108994, 57.355988, 57.081993, 57.171986, 58.358994, 57.08999);
        ((GeneralPath) shape).curveTo(59.909992, 56.71499, 61.546993, 56.397987, 63.280994, 56.12899);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_201
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(80.359, 54.609);
        ((GeneralPath) shape).curveTo(75.562004, 55.356003, 69.91, 56.332, 63.402, 57.531002);
        ((GeneralPath) shape).curveTo(56.977, 58.703003, 53.0, 59.410004, 51.48, 59.648003);
        ((GeneralPath) shape).curveTo(49.348, 59.969, 46.68, 60.277004, 43.48, 60.570004);
        ((GeneralPath) shape).curveTo(40.148, 60.891003, 38.016, 61.117004, 37.082, 61.250004);
        ((GeneralPath) shape).lineTo(34.723, 61.691006);
        ((GeneralPath) shape).curveTo(33.895, 61.875004, 30.934, 62.625008, 25.84, 63.930004);
        ((GeneralPath) shape).curveTo(21.574001, 65.023, 18.32, 65.785, 16.082, 66.211006);
        ((GeneralPath) shape).lineTo(9.84, 67.449005);
        ((GeneralPath) shape).curveTo(8.43, 67.711006, 7.375, 67.79301, 6.6800003, 67.691);
        ((GeneralPath) shape).lineTo(6.6410003, 67.691);
        ((GeneralPath) shape).lineTo(2.9610002, 68.211);
        ((GeneralPath) shape).lineTo(3.0430002, 69.57);
        ((GeneralPath) shape).curveTo(10.668, 68.637, 17.707, 67.305, 24.16, 65.57);
        ((GeneralPath) shape).curveTo(30.453, 63.891, 36.148, 62.609, 41.242, 61.731);
        ((GeneralPath) shape).curveTo(43.773, 61.305, 45.68, 61.035, 46.961, 60.93);
        ((GeneralPath) shape).lineTo(51.121, 60.449);
        ((GeneralPath) shape).curveTo(55.921997, 59.836002, 63.468998, 58.758003, 73.762, 57.211002);
        ((GeneralPath) shape).curveTo(81.652, 56.012, 87.977005, 55.023003, 92.723, 54.250004);
        ((GeneralPath) shape).lineTo(94.441, 52.488003);
        ((GeneralPath) shape).lineTo(80.359, 54.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_202
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(75.602, 71.531);
        ((GeneralPath) shape).curveTo(73.895, 71.582, 72.452995, 71.647995, 71.281, 71.730995);
        ((GeneralPath) shape).curveTo(69.147995, 71.836, 66.613, 72.01199, 63.68, 72.24999);
        ((GeneralPath) shape).curveTo(60.773, 72.48799, 58.32, 72.79699, 56.32, 73.17199);
        ((GeneralPath) shape).lineTo(56.48, 74.96899);
        ((GeneralPath) shape).curveTo(57.523, 74.67599, 58.801, 74.43799, 60.32, 74.249985);
        ((GeneralPath) shape).curveTo(61.203, 74.14498, 62.508, 74.011986, 64.242, 73.85198);
        ((GeneralPath) shape).curveTo(68.055, 73.42198, 71.02699, 73.14498, 73.159996, 73.011986);
        ((GeneralPath) shape).lineTo(65.723, 74.40999);
        ((GeneralPath) shape).curveTo(68.359, 74.011986, 70.973, 73.66399, 73.562, 73.37099);
        ((GeneralPath) shape).lineTo(75.602, 71.53099);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_203
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(83.441, 62.77);
        ((GeneralPath) shape).curveTo(77.523, 63.063, 73.176, 63.598, 70.402, 64.371);
        ((GeneralPath) shape).curveTo(64.48, 66.078, 60.055, 67.223, 57.121002, 67.809006);
        ((GeneralPath) shape).lineTo(56.000004, 68.051);
        ((GeneralPath) shape).lineTo(56.121002, 70.41);
        ((GeneralPath) shape).curveTo(62.039, 69.344, 70.387, 67.91801, 81.16, 66.129005);
        ((GeneralPath) shape).lineTo(84.562004, 62.731007);
        ((GeneralPath) shape).lineTo(83.441, 62.770008);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_204
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(71.961, 51.129);
        ((GeneralPath) shape).curveTo(73.055, 50.969, 74.68, 50.676003, 76.84, 50.25);
        ((GeneralPath) shape).curveTo(84.281, 49.023, 91.574, 47.996, 98.72299, 47.172);
        ((GeneralPath) shape).curveTo(99.120995, 46.422, 99.38699, 45.875, 99.522995, 45.531002);
        ((GeneralPath) shape).lineTo(98.004, 45.488003);
        ((GeneralPath) shape).curveTo(95.016, 45.863003, 92.309, 46.117004, 89.882996, 46.250004);
        ((GeneralPath) shape).curveTo(84.229996, 46.570004, 79.922, 46.863003, 76.961, 47.129005);
        ((GeneralPath) shape).curveTo(73.07, 47.477005, 69.27, 47.957005, 65.562, 48.570007);
        ((GeneralPath) shape).curveTo(64.257996, 48.785007, 59.214996, 49.570007, 50.444996, 50.930008);
        ((GeneralPath) shape).curveTo(43.749996, 51.96901, 39.601997, 52.69101, 38.003998, 53.090008);
        ((GeneralPath) shape).curveTo(36.456997, 53.465008, 34.534996, 54.106007, 32.241997, 55.01201);
        ((GeneralPath) shape).curveTo(29.788998, 55.99601, 28.280996, 56.570007, 27.722996, 56.73101);
        ((GeneralPath) shape).curveTo(25.479996, 57.63701, 23.468996, 58.44901, 21.683996, 59.172012);
        ((GeneralPath) shape).curveTo(18.214996, 60.504013, 15.136996, 61.332012, 12.440996, 61.648014);
        ((GeneralPath) shape).curveTo(6.308996, 62.398014, 3.0699959, 62.797012, 2.7229958, 62.852013);
        ((GeneralPath) shape).lineTo(2.8009958, 65.69101);
        ((GeneralPath) shape).lineTo(6.9609957, 65.09001);
        ((GeneralPath) shape).curveTo(9.202995, 64.60901, 10.722996, 64.34401, 11.522995, 64.28901);
        ((GeneralPath) shape).curveTo(11.120995, 64.39801, 10.815995, 64.47701, 10.601995, 64.531006);
        ((GeneralPath) shape).curveTo(12.386995, 64.23801, 14.042995, 63.891006, 15.5619955, 63.488007);
        ((GeneralPath) shape).curveTo(17.269995, 63.035007, 19.507996, 62.33201, 22.280994, 61.371006);
        ((GeneralPath) shape).curveTo(26.015995, 60.090008, 28.854994, 58.945007, 30.800995, 57.930008);
        ((GeneralPath) shape).curveTo(32.319996, 57.31601, 36.015995, 56.53101, 41.882996, 55.570007);
        ((GeneralPath) shape).curveTo(48.468994, 54.504005, 54.546997, 53.66401, 60.120995, 53.051006);
        ((GeneralPath) shape).curveTo(63.292995, 52.703007, 67.413994, 52.305008, 72.479996, 51.852005);
        ((GeneralPath) shape).curveTo(74.934, 51.609005, 76.42999, 51.438004, 76.961, 51.332005);
        ((GeneralPath) shape).curveTo(77.387, 51.277004, 78.147995, 51.117004, 79.242, 50.852005);
        ((GeneralPath) shape).curveTo(77.641, 50.875004, 76.43, 50.902004, 75.602, 50.930004);
        ((GeneralPath) shape).curveTo(74.159996, 50.957005, 72.949, 51.023003, 71.961, 51.129005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_205
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(79.043, 45.809);
        ((GeneralPath) shape).curveTo(75.867, 46.211, 72.215, 46.758, 68.082, 47.448997);
        ((GeneralPath) shape).curveTo(64.668, 47.983997, 61.176003, 48.448997, 57.602, 48.851997);
        ((GeneralPath) shape).lineTo(57.242, 48.891);
        ((GeneralPath) shape).lineTo(45.359, 51.332);
        ((GeneralPath) shape).curveTo(44.293, 51.332, 42.641003, 51.648003, 40.402, 52.289);
        ((GeneralPath) shape).curveTo(38.293, 52.902, 36.68, 53.172, 35.562, 53.09);
        ((GeneralPath) shape).curveTo(34.359, 53.488, 33.48, 53.785, 32.922, 53.969);
        ((GeneralPath) shape).curveTo(31.934, 54.289, 30.867, 54.570004, 29.723001, 54.809002);
        ((GeneralPath) shape).curveTo(28.281002, 55.106003, 26.043001, 55.969, 23.000002, 57.410004);
        ((GeneralPath) shape).curveTo(19.828003, 58.957005, 17.066002, 60.012005, 14.7230015, 60.570004);
        ((GeneralPath) shape).curveTo(12.480001, 61.129005, 10.016002, 61.531002, 7.3200016, 61.770004);
        ((GeneralPath) shape).lineTo(2.6800017, 62.488003);
        ((GeneralPath) shape).lineTo(2.7230017, 62.852);
        ((GeneralPath) shape).curveTo(3.0700016, 62.797, 6.309002, 62.398003, 12.441002, 61.648003);
        ((GeneralPath) shape).curveTo(15.137002, 61.332, 18.215002, 60.504, 21.680002, 59.172);
        ((GeneralPath) shape).curveTo(23.469002, 58.449, 25.480001, 57.637, 27.723003, 56.731003);
        ((GeneralPath) shape).curveTo(28.281004, 56.570004, 29.789003, 55.996002, 32.242004, 55.012);
        ((GeneralPath) shape).curveTo(34.535004, 54.106003, 36.453003, 53.465, 38.000004, 53.09);
        ((GeneralPath) shape).curveTo(39.602005, 52.691, 43.750004, 51.969, 50.441, 50.93);
        ((GeneralPath) shape).curveTo(59.215004, 49.57, 64.254, 48.785, 65.562004, 48.57);
        ((GeneralPath) shape).curveTo(69.26601, 47.957, 73.066, 47.477, 76.961006, 47.128998);
        ((GeneralPath) shape).curveTo(79.922005, 46.863, 84.227005, 46.57, 89.879005, 46.249996);
        ((GeneralPath) shape).curveTo(92.309006, 46.116997, 95.01601, 45.862995, 98.00001, 45.487995);
        ((GeneralPath) shape).curveTo(97.199005, 45.464996, 96.44101, 45.315994, 95.71901, 45.050995);
        ((GeneralPath) shape).curveTo(96.281006, 44.917995, 96.81201, 44.874996, 97.32001, 44.929996);
        ((GeneralPath) shape).lineTo(99.840004, 44.730995);
        ((GeneralPath) shape).lineTo(100.078, 43.968994);
        ((GeneralPath) shape).curveTo(98.398, 44.128994, 94.895004, 44.409996, 89.559006, 44.808994);
        ((GeneralPath) shape).curveTo(85.37501, 45.128994, 81.867004, 45.464993, 79.04301, 45.808994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6D573C));
        g.fill(shape);

        // _0_0_0_206
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(52.242, 54.969);
        ((GeneralPath) shape).curveTo(53.203, 54.836002, 58.387, 54.25, 67.801, 53.211002);
        ((GeneralPath) shape).curveTo(76.336, 52.277, 82.055, 51.582, 84.961, 51.129);
        ((GeneralPath) shape).curveTo(87.812, 50.676003, 91.854996, 50.156002, 97.082, 49.57);
        ((GeneralPath) shape).curveTo(97.562004, 48.93, 97.906, 48.438, 98.121, 48.09);
        ((GeneralPath) shape).lineTo(79.242004, 50.852);
        ((GeneralPath) shape).curveTo(78.148, 51.117, 77.387, 51.277, 76.961006, 51.332);
        ((GeneralPath) shape).curveTo(76.426, 51.438, 74.934006, 51.609, 72.48, 51.852);
        ((GeneralPath) shape).curveTo(67.414, 52.305, 63.293003, 52.703003, 60.121002, 53.051003);
        ((GeneralPath) shape).curveTo(54.547, 53.664, 48.469, 54.504, 41.883003, 55.570004);
        ((GeneralPath) shape).curveTo(36.016003, 56.531002, 32.320004, 57.316, 30.801003, 57.930004);
        ((GeneralPath) shape).curveTo(28.855003, 58.945004, 26.016003, 60.090004, 22.281002, 61.371002);
        ((GeneralPath) shape).curveTo(19.508001, 62.332, 17.266003, 63.035004, 15.562002, 63.488003);
        ((GeneralPath) shape).curveTo(14.043002, 63.891003, 12.387002, 64.23801, 10.602002, 64.531006);
        ((GeneralPath) shape).lineTo(9.441002, 64.96901);
        ((GeneralPath) shape).curveTo(7.574002, 65.50401, 5.883002, 65.82401, 4.359002, 65.93001);
        ((GeneralPath) shape).lineTo(4.8830023, 65.48801);
        ((GeneralPath) shape).lineTo(6.9610023, 65.090004);
        ((GeneralPath) shape).lineTo(2.8010025, 65.691);
        ((GeneralPath) shape).lineTo(2.8400025, 66.41);
        ((GeneralPath) shape).lineTo(14.043003, 64.648);
        ((GeneralPath) shape).curveTo(16.574003, 64.25, 20.055004, 63.223003, 24.480003, 61.570004);
        ((GeneralPath) shape).curveTo(29.148003, 59.809002, 31.762003, 58.875004, 32.320004, 58.770004);
        ((GeneralPath) shape).curveTo(41.816, 56.715004, 48.453003, 55.449005, 52.242004, 54.969006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_207
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.082, 66.891);
        ((GeneralPath) shape).lineTo(16.082, 66.211);
        ((GeneralPath) shape).curveTo(18.32, 65.784996, 21.574001, 65.022995, 25.84, 63.93);
        ((GeneralPath) shape).curveTo(30.934, 62.625, 33.895, 61.879, 34.723, 61.691);
        ((GeneralPath) shape).lineTo(29.960999, 62.609);
        ((GeneralPath) shape).curveTo(29.508, 62.824, 29.159998, 62.969, 28.921999, 63.051003);
        ((GeneralPath) shape).curveTo(28.526999, 63.207, 28.214998, 63.234, 27.98, 63.129);
        ((GeneralPath) shape).lineTo(27.961, 63.129);
        ((GeneralPath) shape).curveTo(27.418001, 63.207, 26.992, 63.223003, 26.68, 63.172);
        ((GeneralPath) shape).curveTo(27.293001, 62.902, 28.227001, 62.543, 29.48, 62.09);
        ((GeneralPath) shape).curveTo(29.612999, 62.035, 29.961, 61.863, 30.52, 61.57);
        ((GeneralPath) shape).curveTo(30.949001, 61.356, 31.309, 61.211, 31.602001, 61.128998);
        ((GeneralPath) shape).lineTo(32.562, 60.968998);
        ((GeneralPath) shape).curveTo(33.387, 60.676, 34.281002, 60.464996, 35.242, 60.331997);
        ((GeneralPath) shape).lineTo(44.402, 59.331997);
        ((GeneralPath) shape).curveTo(43.84, 59.355995, 42.988, 59.343998, 41.84, 59.288998);
        ((GeneralPath) shape).curveTo(40.426, 59.398, 38.668, 59.636997, 36.562, 60.011997);
        ((GeneralPath) shape).curveTo(33.254, 60.597996, 30.68, 61.156, 28.84, 61.690998);
        ((GeneralPath) shape).curveTo(26.414, 62.516, 24.148, 63.288998, 22.043, 64.012);
        ((GeneralPath) shape).curveTo(20.894999, 64.383, 19.723, 64.731, 18.519999, 65.051);
        ((GeneralPath) shape).lineTo(19.921999, 64.891);
        ((GeneralPath) shape).lineTo(12.081999, 66.891);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_208
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(51.48, 59.648);
        ((GeneralPath) shape).curveTo(53.0, 59.41, 56.977, 58.703, 63.402, 57.531);
        ((GeneralPath) shape).curveTo(69.91, 56.331997, 75.562, 55.356, 80.359, 54.608997);
        ((GeneralPath) shape).lineTo(94.441, 52.488);
        ((GeneralPath) shape).lineTo(95.402, 51.488);
        ((GeneralPath) shape).lineTo(95.52, 51.332);
        ((GeneralPath) shape).curveTo(84.617, 52.879, 77.534996, 53.902, 74.281, 54.41);
        ((GeneralPath) shape).curveTo(71.0, 54.918, 67.332, 55.488, 63.281, 56.129);
        ((GeneralPath) shape).curveTo(61.546997, 56.398003, 59.906, 56.715, 58.358997, 57.09);
        ((GeneralPath) shape).curveTo(58.999996, 57.035, 59.961, 56.984, 61.241997, 56.93);
        ((GeneralPath) shape).lineTo(50.519997, 58.57);
        ((GeneralPath) shape).lineTo(50.401997, 58.609);
        ((GeneralPath) shape).lineTo(43.961, 59.809002);
        ((GeneralPath) shape).lineTo(44.921997, 59.77);
        ((GeneralPath) shape).lineTo(37.081997, 61.25);
        ((GeneralPath) shape).curveTo(38.016, 61.117, 40.147995, 60.891, 43.479996, 60.57);
        ((GeneralPath) shape).curveTo(46.679996, 60.277, 49.347996, 59.968998, 51.479996, 59.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_209
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.68, 67.691);
        ((GeneralPath) shape).curveTo(6.6019998, 67.316, 7.414, 66.902, 9.121, 66.449005);
        ((GeneralPath) shape).lineTo(2.8830004, 67.25001);
        ((GeneralPath) shape).lineTo(2.9610004, 68.211006);
        ((GeneralPath) shape).lineTo(6.6800003, 67.69101);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_210
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(83.641, 42.129);
        ((GeneralPath) shape).curveTo(85.695, 41.813, 91.159996, 40.93, 100.043, 39.488003);
        ((GeneralPath) shape).lineTo(99.683, 38.531002);
        ((GeneralPath) shape).lineTo(97.163, 38.93);
        ((GeneralPath) shape).curveTo(95.913, 39.145, 88.14, 40.184002, 73.847, 42.051);
        ((GeneralPath) shape).curveTo(60.697998, 43.785, 49.605, 45.438, 40.565, 47.011997);
        ((GeneralPath) shape).curveTo(32.273, 48.448997, 27.526, 49.437996, 26.322998, 49.968998);
        ((GeneralPath) shape).curveTo(24.085, 50.983997, 22.350998, 51.648, 21.123999, 51.968998);
        ((GeneralPath) shape).curveTo(18.670998, 52.581997, 16.830997, 53.211, 15.604999, 53.851997);
        ((GeneralPath) shape).curveTo(14.803999, 54.249996, 12.2839985, 54.851997, 8.045999, 55.648);
        ((GeneralPath) shape).lineTo(2.8039985, 56.648);
        ((GeneralPath) shape).lineTo(2.7649984, 57.41);
        ((GeneralPath) shape).lineTo(12.525998, 55.57);
        ((GeneralPath) shape).curveTo(14.471998, 55.25, 16.045998, 54.875, 17.244999, 54.449);
        ((GeneralPath) shape).curveTo(18.046, 54.156002, 19.537998, 53.57, 21.725998, 52.691);
        ((GeneralPath) shape).lineTo(26.686998, 50.852);
        ((GeneralPath) shape).curveTo(27.912998, 50.422, 28.869999, 50.145, 29.564999, 50.012);
        ((GeneralPath) shape).curveTo(31.432999, 49.664, 36.112, 48.902, 43.605, 47.731003);
        ((GeneralPath) shape).curveTo(53.39, 46.238003, 61.659, 45.051003, 68.405, 44.172005);
        ((GeneralPath) shape).curveTo(75.659, 43.238007, 80.737, 42.555004, 83.644, 42.129005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_211
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(91.562, 55.488);
        ((GeneralPath) shape).lineTo(92.723, 54.25);
        ((GeneralPath) shape).curveTo(87.977, 55.023, 81.656, 56.012, 73.762, 57.211);
        ((GeneralPath) shape).curveTo(63.469, 58.758, 55.922, 59.836, 51.121002, 60.448997);
        ((GeneralPath) shape).lineTo(46.961002, 60.929996);
        ((GeneralPath) shape).curveTo(45.680004, 61.034996, 43.773003, 61.304996, 41.242004, 61.730995);
        ((GeneralPath) shape).curveTo(36.148003, 62.608994, 30.453005, 63.890995, 24.160004, 65.56999);
        ((GeneralPath) shape).curveTo(17.707005, 67.30499, 10.668004, 68.63699, 3.043003, 69.56999);
        ((GeneralPath) shape).lineTo(3.1210032, 70.33199);
        ((GeneralPath) shape).curveTo(4.4800034, 70.09, 8.934004, 69.22299, 16.480003, 67.730995);
        ((GeneralPath) shape).curveTo(23.840004, 66.288994, 29.094004, 65.315994, 32.242004, 64.809);
        ((GeneralPath) shape).curveTo(48.668007, 62.063, 61.121002, 60.051, 69.602005, 58.769997);
        ((GeneralPath) shape).lineTo(91.562004, 55.487995);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_212
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(71.602, 59.609);
        ((GeneralPath) shape).lineTo(72.68, 59.488003);
        ((GeneralPath) shape).lineTo(54.84, 63.488003);
        ((GeneralPath) shape).curveTo(54.336, 63.543003, 53.336, 63.664, 51.84, 63.852);
        ((GeneralPath) shape).curveTo(50.562, 64.012, 49.562, 64.102005, 48.84, 64.129);
        ((GeneralPath) shape).curveTo(49.75, 64.077995, 51.16, 63.784996, 53.082, 63.249996);
        ((GeneralPath) shape).lineTo(59.16, 61.730995);
        ((GeneralPath) shape).lineTo(25.68, 67.449);
        ((GeneralPath) shape).curveTo(18.266, 68.702995, 10.773001, 69.902, 3.203001, 71.050995);
        ((GeneralPath) shape).lineTo(3.441001, 72.449);
        ((GeneralPath) shape).curveTo(4.7730007, 72.238, 5.7730007, 72.034996, 6.441001, 71.852);
        ((GeneralPath) shape).lineTo(9.961, 71.129);
        ((GeneralPath) shape).curveTo(14.066, 70.355995, 20.469002, 69.223, 29.16, 67.730995);
        ((GeneralPath) shape).curveTo(36.602, 66.477, 43.641, 65.33199, 50.281, 64.288994);
        ((GeneralPath) shape).curveTo(54.948997, 63.597992, 59.358997, 62.862995, 63.519997, 62.089993);
        ((GeneralPath) shape).curveTo(73.949, 60.222992, 81.73399, 58.851994, 86.879, 57.968994);
        ((GeneralPath) shape).lineTo(89.602, 57.569996);
        ((GeneralPath) shape).lineTo(90.602, 56.487995);
        ((GeneralPath) shape).lineTo(71.602, 59.608994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_213
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.801, 48.129);
        ((GeneralPath) shape).lineTo(53.641, 48.371002);
        ((GeneralPath) shape).curveTo(54.336, 48.238003, 55.309, 47.969, 56.562, 47.570004);
        ((GeneralPath) shape).curveTo(58.641, 46.930004, 61.0, 46.344, 63.641, 45.809002);
        ((GeneralPath) shape).curveTo(61.0, 46.184002, 58.309, 46.625, 55.561996, 47.129);
        ((GeneralPath) shape).curveTo(50.921997, 47.984, 48.561996, 48.422, 48.479996, 48.449);
        ((GeneralPath) shape).lineTo(31.722996, 51.371002);
        ((GeneralPath) shape).curveTo(29.800995, 51.715004, 28.292995, 52.195004, 27.202995, 52.809002);
        ((GeneralPath) shape).curveTo(25.253996, 53.93, 23.280994, 54.875, 21.280994, 55.648003);
        ((GeneralPath) shape).curveTo(18.667995, 56.691, 16.175995, 57.422, 13.800995, 57.852);
        ((GeneralPath) shape).curveTo(9.987995, 58.41, 6.265995, 58.969, 2.640995, 59.531002);
        ((GeneralPath) shape).lineTo(2.640995, 60.250004);
        ((GeneralPath) shape).curveTo(8.214994, 59.289005, 12.866995, 58.543003, 16.601995, 58.012005);
        ((GeneralPath) shape).curveTo(18.679996, 57.715004, 20.815996, 57.063004, 22.999996, 56.051006);
        ((GeneralPath) shape).curveTo(24.175997, 55.488007, 25.679996, 54.758007, 27.519997, 53.852005);
        ((GeneralPath) shape).curveTo(29.147997, 53.211006, 30.292997, 52.797005, 30.960997, 52.609005);
        ((GeneralPath) shape).curveTo(32.159996, 52.266006, 33.987995, 51.875004, 36.440998, 51.449005);
        ((GeneralPath) shape).lineTo(55.801, 48.129005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_214
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.281, 44.051);
        ((GeneralPath) shape).lineTo(75.402, 44.331997);
        ((GeneralPath) shape).curveTo(77.668, 44.194996, 80.016, 44.116997, 82.441, 44.089996);
        ((GeneralPath) shape).lineTo(80.723, 44.409996);
        ((GeneralPath) shape).curveTo(83.547, 44.062996, 85.602, 43.929996, 86.882996, 44.011997);
        ((GeneralPath) shape).curveTo(88.641, 44.116997, 93.120995, 43.741997, 100.31999, 42.891);
        ((GeneralPath) shape).lineTo(100.40199, 42.128998);
        ((GeneralPath) shape).curveTo(92.800995, 42.636997, 85.425995, 43.276997, 78.28099, 44.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_215
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(67.84, 18.488);
        ((GeneralPath) shape).lineTo(56.081997, 21.531);
        ((GeneralPath) shape).lineTo(56.042995, 22.09);
        ((GeneralPath) shape).curveTo(58.894997, 21.398, 63.081997, 20.316, 68.602, 18.852001);
        ((GeneralPath) shape).lineTo(67.84, 18.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_216
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.641, 26.488);
        ((GeneralPath) shape).curveTo(62.413998, 25.051, 68.402, 23.852001, 73.602, 22.891);
        ((GeneralPath) shape).lineTo(76.0, 22.449001);
        ((GeneralPath) shape).lineTo(74.402, 21.609001);
        ((GeneralPath) shape).lineTo(74.121, 21.691002);
        ((GeneralPath) shape).curveTo(68.094, 22.941002, 61.949, 24.250002, 55.68, 25.609001);
        ((GeneralPath) shape).lineTo(55.641, 26.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_217
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.84, 72.289);
        ((GeneralPath) shape).curveTo(15.426001, 72.238, 16.16, 72.184, 17.043, 72.129);
        ((GeneralPath) shape).curveTo(17.949, 72.050995, 19.043, 71.902, 20.32, 71.690994);
        ((GeneralPath) shape).lineTo(21.883, 71.449);
        ((GeneralPath) shape).lineTo(14.839999, 72.288994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_218
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(53.121, 65.969);
        ((GeneralPath) shape).curveTo(65.065994, 63.809002, 72.492, 62.488003, 75.402, 62.012);
        ((GeneralPath) shape).curveTo(77.668, 61.637, 79.734, 61.145, 81.602, 60.531002);
        ((GeneralPath) shape).curveTo(83.043, 60.078003, 85.093994, 59.715004, 87.76199, 59.449);
        ((GeneralPath) shape).lineTo(88.440994, 58.77);
        ((GeneralPath) shape).curveTo(85.96099, 58.875, 83.815994, 59.051, 81.99999, 59.289);
        ((GeneralPath) shape).curveTo(80.452995, 59.504, 78.33599, 59.996002, 75.64099, 60.77);
        ((GeneralPath) shape).curveTo(72.70699, 61.621002, 69.772995, 62.289, 66.83999, 62.77);
        ((GeneralPath) shape).curveTo(52.97699, 65.195, 42.28099, 67.035, 34.76199, 68.289);
        ((GeneralPath) shape).curveTo(30.65599, 68.984, 25.88299, 69.676, 20.44099, 70.371);
        ((GeneralPath) shape).curveTo(14.839991, 71.117004, 11.46899, 71.582, 10.31999, 71.770004);
        ((GeneralPath) shape).curveTo(8.64099, 72.035, 6.41399, 72.504005, 3.6409903, 73.172005);
        ((GeneralPath) shape).curveTo(3.7729902, 73.59801, 3.9339902, 73.94501, 4.1209903, 74.211006);
        ((GeneralPath) shape).curveTo(5.5619903, 73.785, 7.34799, 73.398, 9.47999, 73.051);
        ((GeneralPath) shape).lineTo(12.08199, 72.648);
        ((GeneralPath) shape).curveTo(11.839991, 72.648, 11.42599, 72.691, 10.839991, 72.770004);
        ((GeneralPath) shape).curveTo(10.3089905, 72.852005, 9.905991, 72.87501, 9.64099, 72.852005);
        ((GeneralPath) shape).curveTo(9.53499, 72.60901, 9.53499, 72.344, 9.64099, 72.051);
        ((GeneralPath) shape).curveTo(10.3089905, 71.945, 11.33599, 71.875, 12.72299, 71.852005);
        ((GeneralPath) shape).curveTo(18.96099, 71.156006, 23.76199, 70.731, 27.12099, 70.57001);
        ((GeneralPath) shape).lineTo(29.640991, 70.172005);
        ((GeneralPath) shape).curveTo(33.10899, 69.58201, 40.93399, 68.184006, 53.12099, 65.969);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_219
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.48, 30.012);
        ((GeneralPath) shape).lineTo(56.281, 29.809);
        ((GeneralPath) shape).curveTo(62.976997, 27.969, 70.827995, 26.223, 79.84, 24.57);
        ((GeneralPath) shape).lineTo(79.32, 24.289);
        ((GeneralPath) shape).lineTo(76.441, 24.969);
        ((GeneralPath) shape).curveTo(74.973, 25.105999, 73.055, 25.344, 70.68, 25.691);
        ((GeneralPath) shape).curveTo(67.828, 26.09, 65.934, 26.344, 65.0, 26.449);
        ((GeneralPath) shape).curveTo(62.199, 27.063, 59.039, 27.941, 55.52, 29.09);
        ((GeneralPath) shape).lineTo(55.48, 30.012001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_220
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.641, 40.609);
        ((GeneralPath) shape).curveTo(12.59, 41.117, 9.629, 41.902, 5.762, 42.969);
        ((GeneralPath) shape).curveTo(5.441, 43.238003, 5.1480002, 43.555, 4.883, 43.93);
        ((GeneralPath) shape).curveTo(10.242001, 42.383, 14.094, 41.371002, 16.441, 40.891);
        ((GeneralPath) shape).curveTo(19.082, 40.356, 23.789, 39.555, 30.562, 38.488);
        ((GeneralPath) shape).curveTo(37.254, 37.421997, 41.535, 36.703, 43.402, 36.332);
        ((GeneralPath) shape).curveTo(45.0, 36.039, 47.176, 35.516, 49.922, 34.77);
        ((GeneralPath) shape).lineTo(40.043, 36.172);
        ((GeneralPath) shape).curveTo(38.281, 36.543, 36.093998, 36.902, 33.48, 37.25);
        ((GeneralPath) shape).curveTo(29.855, 37.731, 26.772999, 38.184, 24.242, 38.609);
        ((GeneralPath) shape).curveTo(21.254002, 39.117, 18.055, 39.781002, 14.641001, 40.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_221
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.441, 33.25);
        ((GeneralPath) shape).curveTo(64.242004, 30.852, 69.348, 29.477, 70.762, 29.129);
        ((GeneralPath) shape).curveTo(74.043, 28.355999, 78.188, 27.477, 83.203, 26.487999);
        ((GeneralPath) shape).lineTo(82.32, 25.969);
        ((GeneralPath) shape).lineTo(77.0, 27.09);
        ((GeneralPath) shape).curveTo(69.137, 28.77, 65.094, 29.637001, 64.883, 29.691);
        ((GeneralPath) shape).curveTo(61.816, 30.383, 58.668003, 31.172, 55.441, 32.051);
        ((GeneralPath) shape).lineTo(55.441, 33.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_222
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.359, 49.012);
        ((GeneralPath) shape).curveTo(10.773001, 48.609, 12.242001, 48.106003, 13.762, 47.488003);
        ((GeneralPath) shape).lineTo(3.3199997, 50.332005);
        ((GeneralPath) shape).lineTo(3.2419996, 50.930004);
        ((GeneralPath) shape).curveTo(6.9489994, 49.758003, 8.987999, 49.117004, 9.358999, 49.012005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_223
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.359, 37.41);
        ((GeneralPath) shape).curveTo(66.492004, 37.012, 68.48, 36.690998, 70.32, 36.449);
        ((GeneralPath) shape).curveTo(72.641, 36.184002, 74.586, 35.918003, 76.16, 35.648003);
        ((GeneralPath) shape).curveTo(79.227005, 35.168003, 85.29301, 34.371002, 94.359, 33.250004);
        ((GeneralPath) shape).lineTo(92.520004, 32.090004);
        ((GeneralPath) shape).lineTo(90.441, 32.449005);
        ((GeneralPath) shape).curveTo(80.574005, 34.156006, 74.762, 35.063004, 73.0, 35.168007);
        ((GeneralPath) shape).curveTo(70.734, 35.305008, 69.121, 35.449005, 68.16, 35.60901);
        ((GeneralPath) shape).curveTo(64.961006, 36.11701, 62.746002, 36.51601, 61.520004, 36.80901);
        ((GeneralPath) shape).curveTo(59.973003, 37.26201, 58.039005, 37.75801, 55.719006, 38.28901);
        ((GeneralPath) shape).curveTo(52.945007, 38.95701, 50.531006, 39.44901, 48.480007, 39.770008);
        ((GeneralPath) shape).curveTo(45.35901, 40.223007, 42.133007, 40.71901, 38.801006, 41.250008);
        ((GeneralPath) shape).curveTo(35.625008, 41.758007, 32.508007, 42.145008, 29.441006, 42.410007);
        ((GeneralPath) shape).curveTo(27.066006, 42.598007, 24.895006, 42.902008, 22.922005, 43.33201);
        ((GeneralPath) shape).curveTo(21.320005, 43.67601, 19.121004, 44.488007, 16.320004, 45.770008);
        ((GeneralPath) shape).curveTo(13.199003, 47.18401, 10.398004, 48.238007, 7.9220037, 48.930008);
        ((GeneralPath) shape).lineTo(14.242004, 47.28901);
        ((GeneralPath) shape).curveTo(15.121004, 46.945007, 16.375004, 46.42201, 18.000004, 45.73101);
        ((GeneralPath) shape).curveTo(19.414003, 45.19501, 20.625004, 44.80901, 21.641005, 44.57001);
        ((GeneralPath) shape).curveTo(22.973005, 44.27701, 25.680004, 43.89101, 29.762005, 43.41001);
        ((GeneralPath) shape).curveTo(34.586006, 42.852013, 38.199005, 42.37101, 40.602005, 41.96901);
        ((GeneralPath) shape).curveTo(43.160004, 41.51601, 51.082005, 39.99601, 64.35901, 37.41001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_224
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.52, 19.449);
        ((GeneralPath) shape).curveTo(57.109, 19.022999, 57.867, 18.715, 58.801, 18.531);
        ((GeneralPath) shape).curveTo(59.203, 18.449, 60.016, 18.371, 61.241997, 18.289);
        ((GeneralPath) shape).curveTo(62.839996, 18.105999, 64.281, 17.890999, 65.562, 17.647999);
        ((GeneralPath) shape).lineTo(61.921997, 18.409998);
        ((GeneralPath) shape).curveTo(59.733997, 18.757998, 57.934, 19.105997, 56.519997, 19.448997);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(56.723, 18.730999);
        ((GeneralPath) shape).lineTo(56.402, 19.730999);
        ((GeneralPath) shape).lineTo(61.242, 18.813);
        ((GeneralPath) shape).curveTo(62.441, 18.598, 64.055, 18.265999, 66.082, 17.813);
        ((GeneralPath) shape).lineTo(65.68, 17.652);
        ((GeneralPath) shape).lineTo(65.641, 17.652);
        ((GeneralPath) shape).lineTo(64.562, 17.25);
        ((GeneralPath) shape).lineTo(56.722996, 18.730999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_225
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(79.16, 62.129);
        ((GeneralPath) shape).curveTo(75.98801, 62.531002, 71.64101, 63.316, 66.121, 64.488);
        ((GeneralPath) shape).lineTo(55.961002, 66.691);
        ((GeneralPath) shape).lineTo(56.000004, 68.051);
        ((GeneralPath) shape).lineTo(57.121002, 67.809006);
        ((GeneralPath) shape).curveTo(60.055, 67.22301, 64.48, 66.078, 70.402, 64.371);
        ((GeneralPath) shape).curveTo(73.176, 63.598003, 77.520004, 63.063004, 83.441, 62.77);
        ((GeneralPath) shape).lineTo(84.562004, 62.731);
        ((GeneralPath) shape).lineTo(85.68001, 61.57);
        ((GeneralPath) shape).curveTo(82.02701, 61.863, 79.85501, 62.051, 79.16001, 62.128998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_226
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(79.281, 67.969);
        ((GeneralPath) shape).lineTo(81.159996, 66.129005);
        ((GeneralPath) shape).curveTo(70.38699, 67.91801, 62.042995, 69.344, 56.120995, 70.41);
        ((GeneralPath) shape).lineTo(56.159996, 71.48801);
        ((GeneralPath) shape).curveTo(57.761997, 71.172005, 59.667995, 70.836006, 61.882996, 70.48801);
        ((GeneralPath) shape).curveTo(69.215, 69.37101, 75.016, 68.531006, 79.281, 67.96901);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_227
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.602, 75.93);
        ((GeneralPath) shape).curveTo(57.281002, 75.879, 56.949, 75.879, 56.602, 75.93);
        ((GeneralPath) shape).lineTo(56.68, 76.609);
        ((GeneralPath) shape).curveTo(62.84, 75.543, 68.094, 74.797005, 72.441, 74.371);
        ((GeneralPath) shape).lineTo(73.562004, 73.371);
        ((GeneralPath) shape).curveTo(70.977005, 73.664, 68.359, 74.012, 65.72301, 74.41);
        ((GeneralPath) shape).lineTo(57.602005, 75.93);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_228
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.281, 82.332);
        ((GeneralPath) shape).lineTo(58.921997, 82.012);
        ((GeneralPath) shape).lineTo(58.121, 82.129);
        ((GeneralPath) shape).lineTo(58.281, 82.332);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_229
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(60.922, 82.289);
        ((GeneralPath) shape).lineTo(61.043, 82.129);
        ((GeneralPath) shape).curveTo(59.895, 82.343994, 59.043, 82.465, 58.48, 82.488);
        ((GeneralPath) shape).curveTo(58.75, 82.757996, 59.016, 82.902, 59.281, 82.93);
        ((GeneralPath) shape).lineTo(59.401997, 82.969);
        ((GeneralPath) shape).lineTo(61.640995, 82.449005);
        ((GeneralPath) shape).lineTo(62.042995, 82.25001);
        ((GeneralPath) shape).curveTo(61.640995, 82.33201, 61.265995, 82.34401, 60.921997, 82.28901);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_230
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.359, 80.289);
        ((GeneralPath) shape).lineTo(67.32, 78.731);
        ((GeneralPath) shape).lineTo(69.203, 77.211006);
        ((GeneralPath) shape).lineTo(57.043003, 78.852005);
        ((GeneralPath) shape).lineTo(57.359005, 80.289);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_231
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(77.602, 38.172);
        ((GeneralPath) shape).curveTo(77.574, 38.332, 76.309, 38.691, 73.800995, 39.25);
        ((GeneralPath) shape).curveTo(70.788994, 39.918, 68.13699, 40.344, 65.84, 40.531);
        ((GeneralPath) shape).curveTo(60.722996, 40.956997, 55.187996, 41.543, 49.241997, 42.288998);
        ((GeneralPath) shape).curveTo(41.292995, 43.276997, 35.336, 44.171997, 31.358997, 44.973);
        ((GeneralPath) shape).curveTo(30.882998, 45.078, 28.413998, 45.703, 23.960999, 46.852);
        ((GeneralPath) shape).curveTo(21.987999, 47.356003, 20.495998, 47.852, 19.48, 48.332);
        ((GeneralPath) shape).curveTo(19.348, 48.383, 18.081999, 49.117, 15.679999, 50.531002);
        ((GeneralPath) shape).curveTo(14.242, 51.359, 12.573999, 51.93, 10.679999, 52.250004);
        ((GeneralPath) shape).curveTo(8.176, 52.516003, 5.9879994, 52.824005, 4.1209993, 53.172005);
        ((GeneralPath) shape).lineTo(3.0429993, 53.371006);
        ((GeneralPath) shape).lineTo(2.9219992, 54.531006);
        ((GeneralPath) shape).lineTo(12.960999, 52.852005);
        ((GeneralPath) shape).lineTo(14.882998, 51.891006);
        ((GeneralPath) shape).curveTo(16.374998, 51.11701, 17.679998, 50.371006, 18.800999, 49.648006);
        ((GeneralPath) shape).curveTo(19.999998, 48.875008, 22.374998, 48.11701, 25.921999, 47.371006);
        ((GeneralPath) shape).curveTo(26.749998, 47.184006, 29.519999, 46.664005, 34.241997, 45.809006);
        ((GeneralPath) shape).curveTo(35.358997, 45.598007, 40.226997, 45.023006, 48.839996, 44.090004);
        ((GeneralPath) shape).curveTo(57.561996, 43.156006, 63.749996, 42.356003, 67.40199, 41.691006);
        ((GeneralPath) shape).curveTo(72.49199, 40.758007, 75.76199, 40.172005, 77.202995, 39.930004);
        ((GeneralPath) shape).curveTo(79.73399, 39.422005, 83.961, 38.758003, 89.882996, 37.930004);
        ((GeneralPath) shape).curveTo(92.043, 37.637005, 94.867, 37.172005, 98.36299, 36.531006);
        ((GeneralPath) shape).lineTo(97.88299, 35.969006);
        ((GeneralPath) shape).curveTo(95.21499, 36.211006, 93.22699, 36.438007, 91.92199, 36.652004);
        ((GeneralPath) shape).curveTo(93.49599, 36.117004, 95.24199, 35.664005, 97.15999, 35.289005);
        ((GeneralPath) shape).curveTo(97.108986, 35.211006, 97.00399, 35.117004, 96.84399, 35.012005);
        ((GeneralPath) shape).lineTo(84.96098, 36.891006);
        ((GeneralPath) shape).curveTo(80.081985, 37.664005, 77.62898, 38.090008, 77.60198, 38.172005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_232
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(70.723, 19.77);
        ((GeneralPath) shape).lineTo(55.883, 23.25);
        ((GeneralPath) shape).lineTo(55.801, 24.172);
        ((GeneralPath) shape).lineTo(72.242, 20.531);
        ((GeneralPath) shape).lineTo(70.723, 19.77);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_233
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(45.281, 37.332);
        ((GeneralPath) shape).curveTo(42.133, 38.078, 38.0, 38.824, 32.883, 39.57);
        ((GeneralPath) shape).curveTo(27.227, 40.343998, 23.065998, 40.945, 20.402, 41.371);
        ((GeneralPath) shape).lineTo(19.48, 41.57);
        ((GeneralPath) shape).lineTo(18.800999, 41.852);
        ((GeneralPath) shape).lineTo(23.679998, 40.969);
        ((GeneralPath) shape).lineTo(20.043, 42.289);
        ((GeneralPath) shape).curveTo(24.706999, 41.328003, 30.734, 40.438, 38.121, 39.609);
        ((GeneralPath) shape).curveTo(41.188, 39.262, 43.586, 38.875, 45.32, 38.449);
        ((GeneralPath) shape).curveTo(46.496, 38.184002, 48.84, 37.598, 52.359, 36.688);
        ((GeneralPath) shape).curveTo(56.203003, 35.753998, 67.441, 33.438, 86.082, 29.730999);
        ((GeneralPath) shape).lineTo(88.039, 29.370998);
        ((GeneralPath) shape).lineTo(86.68, 28.569998);
        ((GeneralPath) shape).lineTo(79.082, 29.851997);
        ((GeneralPath) shape).curveTo(71.801, 31.101997, 64.988, 32.488, 58.641, 34.011997);
        ((GeneralPath) shape).curveTo(52.426, 35.581997, 47.973, 36.690998, 45.281, 37.331997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_234
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.84, 46.77);
        ((GeneralPath) shape).lineTo(3.7619998, 47.172);
        ((GeneralPath) shape).lineTo(5.16, 46.731);
        ((GeneralPath) shape).curveTo(5.535, 46.356, 6.535, 45.902, 8.16, 45.371);
        ((GeneralPath) shape).lineTo(9.4609995, 44.731);
        ((GeneralPath) shape).curveTo(6.6799994, 45.805, 4.8089995, 46.483997, 3.8399997, 46.77);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_235
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.68, 47.488);
        ((GeneralPath) shape).lineTo(5.801, 46.968998);
        ((GeneralPath) shape).lineTo(5.6410003, 46.968998);
        ((GeneralPath) shape).lineTo(3.7230003, 47.288998);
        ((GeneralPath) shape).lineTo(3.6800003, 47.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_236
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.043, 16.609);
        ((GeneralPath) shape).curveTo(58.988, 16.609, 58.934, 16.57, 58.883, 16.487999);
        ((GeneralPath) shape).lineTo(58.961, 16.41);
        ((GeneralPath) shape).curveTo(58.668, 16.465, 58.402, 16.543, 58.16, 16.648);
        ((GeneralPath) shape).lineTo(58.043, 16.77);
        ((GeneralPath) shape).lineTo(59.043, 16.609001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_237
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.242, 72.488);
        ((GeneralPath) shape).lineTo(56.32, 73.172);
        ((GeneralPath) shape).curveTo(58.32, 72.797, 60.773, 72.488, 63.68, 72.25);
        ((GeneralPath) shape).curveTo(66.613, 72.012, 69.148, 71.836, 71.281, 71.731);
        ((GeneralPath) shape).curveTo(72.452995, 71.648, 73.895, 71.582, 75.602, 71.531006);
        ((GeneralPath) shape).curveTo(76.348, 70.785, 76.922, 70.23801, 77.32, 69.89101);
        ((GeneralPath) shape).curveTo(71.559, 70.156006, 67.012, 70.58201, 63.68, 71.172005);
        ((GeneralPath) shape).curveTo(62.348, 71.383, 59.867, 71.824005, 56.242, 72.48801);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_238
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.402, 80.77);
        ((GeneralPath) shape).curveTo(61.535, 81.034996, 60.043, 81.449, 58.922, 82.01199);
        ((GeneralPath) shape).lineTo(58.281002, 82.33199);
        ((GeneralPath) shape).lineTo(58.480003, 82.48799);
        ((GeneralPath) shape).curveTo(59.039, 82.46499, 59.895004, 82.343994, 61.039, 82.12899);
        ((GeneralPath) shape).curveTo(61.465, 81.70299, 62.332, 81.40999, 63.641003, 81.24999);
        ((GeneralPath) shape).lineTo(63.879, 81.21099);
        ((GeneralPath) shape).lineTo(64.762, 80.60899);
        ((GeneralPath) shape).lineTo(63.402, 80.77);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F4C34));
        g.fill(shape);

        // _0_0_0_239
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.602, 75.93);
        ((GeneralPath) shape).curveTo(56.949, 75.879, 57.281002, 75.879, 57.602, 75.93);
        ((GeneralPath) shape).lineTo(73.16, 73.012);
        ((GeneralPath) shape).curveTo(71.027, 73.145004, 68.055, 73.422005, 64.242004, 73.852);
        ((GeneralPath) shape).curveTo(62.508003, 74.012, 61.203003, 74.145, 60.320004, 74.25);
        ((GeneralPath) shape).curveTo(58.801003, 74.438, 57.523003, 74.676, 56.480003, 74.969);
        ((GeneralPath) shape).lineTo(56.602005, 75.93);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_240
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.723, 71.852);
        ((GeneralPath) shape).curveTo(11.3359995, 71.875, 10.309, 71.945, 9.641, 72.050995);
        ((GeneralPath) shape).curveTo(9.535, 72.343994, 9.535, 72.60899, 9.641, 72.852);
        ((GeneralPath) shape).curveTo(9.906, 72.875, 10.309, 72.852, 10.84, 72.77);
        ((GeneralPath) shape).curveTo(11.426001, 72.690994, 11.84, 72.647995, 12.082, 72.647995);
        ((GeneralPath) shape).lineTo(12.16, 72.647995);
        ((GeneralPath) shape).lineTo(29.762, 70.449);
        ((GeneralPath) shape).lineTo(27.120998, 70.57);
        ((GeneralPath) shape).curveTo(23.762, 70.731, 18.960999, 71.156, 12.722999, 71.852);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_241
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.961, 62.609);
        ((GeneralPath) shape).lineTo(28.0, 63.129);
        ((GeneralPath) shape).lineTo(27.961, 63.129);
        ((GeneralPath) shape).curveTo(28.203001, 63.238003, 28.52, 63.211002, 28.922, 63.051003);
        ((GeneralPath) shape).curveTo(29.160002, 62.969, 29.508001, 62.824, 29.961, 62.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_242
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(44.402, 59.332);
        ((GeneralPath) shape).lineTo(35.242, 60.332);
        ((GeneralPath) shape).curveTo(34.281002, 60.465, 33.387, 60.676003, 32.562, 60.969);
        ((GeneralPath) shape).curveTo(33.387, 60.836002, 34.402, 60.77, 35.602, 60.77);
        ((GeneralPath) shape).curveTo(36.508, 60.742, 37.895, 60.582, 39.762, 60.289);
        ((GeneralPath) shape).curveTo(41.629, 59.996002, 43.027, 59.836002, 43.961002, 59.809002);
        ((GeneralPath) shape).lineTo(51.281002, 58.449);
        ((GeneralPath) shape).lineTo(44.480003, 59.332);
        ((GeneralPath) shape).lineTo(44.402004, 59.332);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_243
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.121, 66.449);
        ((GeneralPath) shape).curveTo(7.4140005, 66.902, 6.602, 67.315994, 6.6800003, 67.690994);
        ((GeneralPath) shape).lineTo(6.6410003, 67.690994);
        ((GeneralPath) shape).curveTo(7.3360004, 67.797, 8.402, 67.715, 9.84, 67.449);
        ((GeneralPath) shape).lineTo(19.922, 64.891);
        ((GeneralPath) shape).lineTo(18.52, 65.051);
        ((GeneralPath) shape).curveTo(14.359001, 65.504005, 11.227, 65.969, 9.121, 66.449005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_244
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.602, 64.531);
        ((GeneralPath) shape).curveTo(10.816, 64.477, 11.121, 64.397995, 11.52, 64.289);
        ((GeneralPath) shape).curveTo(10.723001, 64.344, 9.203001, 64.609, 6.9610004, 65.090004);
        ((GeneralPath) shape).lineTo(4.8830004, 65.48801);
        ((GeneralPath) shape).lineTo(4.359, 65.93001);
        ((GeneralPath) shape).curveTo(5.8830004, 65.824005, 7.5740004, 65.504005, 9.441, 64.96901);
        ((GeneralPath) shape).lineTo(10.602, 64.531006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_245
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.68, 62.488);
        ((GeneralPath) shape).lineTo(9.723001, 61.41);
        ((GeneralPath) shape).lineTo(2.6800003, 62.09);
        ((GeneralPath) shape).lineTo(2.6800003, 62.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_246
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(95.723, 45.051);
        ((GeneralPath) shape).curveTo(96.441, 45.315998, 97.203, 45.465, 98.0, 45.488);
        ((GeneralPath) shape).lineTo(99.52, 45.531);
        ((GeneralPath) shape).lineTo(99.84, 44.731);
        ((GeneralPath) shape).lineTo(97.32, 44.93);
        ((GeneralPath) shape).curveTo(96.816, 44.875, 96.281, 44.918, 95.723, 45.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_247
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.922, 47.172);
        ((GeneralPath) shape).lineTo(82.440994, 44.09);
        ((GeneralPath) shape).curveTo(80.01599, 44.117, 77.66799, 44.195, 75.397995, 44.332);
        ((GeneralPath) shape).curveTo(70.97299, 44.648003, 67.05499, 45.145, 63.640995, 45.809002);
        ((GeneralPath) shape).curveTo(60.999996, 46.344, 58.640995, 46.93, 56.558994, 47.570004);
        ((GeneralPath) shape).curveTo(55.308994, 47.969, 54.331993, 48.238003, 53.640995, 48.371002);
        ((GeneralPath) shape).lineTo(55.800995, 48.129);
        ((GeneralPath) shape).curveTo(60.573994, 47.57, 63.612995, 47.25, 64.922, 47.172);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_248
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(97.883, 35.969);
        ((GeneralPath) shape).lineTo(97.16, 35.289);
        ((GeneralPath) shape).curveTo(95.242004, 35.664, 93.496, 36.117, 91.922005, 36.648003);
        ((GeneralPath) shape).curveTo(93.227005, 36.438004, 95.215004, 36.211002, 97.883, 35.969);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_249
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.562, 47.27);
        ((GeneralPath) shape).lineTo(7.9220004, 48.93);
        ((GeneralPath) shape).curveTo(6.5620003, 49.277, 5.043, 49.609, 3.3590002, 49.93);
        ((GeneralPath) shape).lineTo(3.3200002, 50.332);
        ((GeneralPath) shape).lineTo(14.562, 47.27);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_250
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.961, 43.77);
        ((GeneralPath) shape).curveTo(13.762, 43.504, 15.227, 42.969, 17.359001, 42.172);
        ((GeneralPath) shape).lineTo(15.602001, 42.57);
        ((GeneralPath) shape).lineTo(10.762001, 44.172);
        ((GeneralPath) shape).lineTo(9.641001, 44.648003);
        ((GeneralPath) shape).lineTo(9.52, 44.691);
        ((GeneralPath) shape).lineTo(8.160001, 45.371002);
        ((GeneralPath) shape).lineTo(8.801001, 45.172);
        ((GeneralPath) shape).curveTo(9.707001, 44.824, 11.094001, 44.356003, 12.961, 43.77);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_251
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.0, 46.129);
        ((GeneralPath) shape).curveTo(8.734, 46.289, 8.309, 46.465, 7.723, 46.648003);
        ((GeneralPath) shape).lineTo(8.121, 46.609);
        ((GeneralPath) shape).lineTo(23.68, 40.969);
        ((GeneralPath) shape).lineTo(18.801, 41.852);
        ((GeneralPath) shape).lineTo(9.000001, 46.129);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_252
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.723, 47.289);
        ((GeneralPath) shape).lineTo(5.641, 46.969);
        ((GeneralPath) shape).lineTo(4.961, 46.969);
        ((GeneralPath) shape).lineTo(5.16, 46.731003);
        ((GeneralPath) shape).lineTo(3.7619998, 47.172005);
        ((GeneralPath) shape).lineTo(3.7229998, 47.289005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_253
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(86.602, 28.488);
        ((GeneralPath) shape).lineTo(86.159996, 28.25);
        ((GeneralPath) shape).curveTo(84.586, 28.57, 83.227, 28.781, 82.08199, 28.891);
        ((GeneralPath) shape).curveTo(83.73399, 28.809, 85.242, 28.676, 86.60199, 28.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_254
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.0, 26.449);
        ((GeneralPath) shape).curveTo(65.934, 26.344, 67.828, 26.09, 70.68, 25.691);
        ((GeneralPath) shape).curveTo(73.055, 25.344, 74.977, 25.106, 76.441, 24.969);
        ((GeneralPath) shape).lineTo(79.32, 24.289);
        ((GeneralPath) shape).lineTo(78.082, 23.57);
        ((GeneralPath) shape).curveTo(76.883, 23.813, 75.734, 24.012, 74.641, 24.171999);
        ((GeneralPath) shape).curveTo(72.452995, 24.383, 70.816, 24.581999, 69.723, 24.769999);
        ((GeneralPath) shape).curveTo(67.828, 25.089998, 66.254, 25.647999, 65.0, 26.449);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_255
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.52, 19.449);
        ((GeneralPath) shape).curveTo(57.934002, 19.102, 59.734, 18.758, 61.922, 18.41);
        ((GeneralPath) shape).lineTo(65.562004, 17.648);
        ((GeneralPath) shape).curveTo(64.281006, 17.891, 62.840004, 18.102001, 61.242004, 18.289001);
        ((GeneralPath) shape).curveTo(60.016003, 18.371002, 59.203003, 18.449001, 58.801003, 18.531002);
        ((GeneralPath) shape).curveTo(57.867004, 18.715002, 57.109, 19.023003, 56.520004, 19.449001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_256
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(62.762, 47.731);
        ((GeneralPath) shape).curveTo(61.453003, 47.836, 59.879, 48.051, 58.043, 48.371);
        ((GeneralPath) shape).curveTo(55.961, 48.741997, 54.402, 49.023, 53.359, 49.211);
        ((GeneralPath) shape).curveTo(46.988003, 50.25, 42.855003, 50.968998, 40.961002, 51.371);
        ((GeneralPath) shape).curveTo(39.254, 51.741997, 37.453003, 52.315998, 35.562004, 53.09);
        ((GeneralPath) shape).curveTo(36.680004, 53.172, 38.293003, 52.902, 40.402004, 52.289);
        ((GeneralPath) shape).curveTo(42.641003, 51.648003, 44.293003, 51.332, 45.359005, 51.332);
        ((GeneralPath) shape).lineTo(62.762005, 47.731);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_257
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(54.84, 63.488);
        ((GeneralPath) shape).lineTo(72.68, 59.488);
        ((GeneralPath) shape).lineTo(71.602, 59.608997);
        ((GeneralPath) shape).curveTo(67.788994, 60.011997, 63.641, 60.714996, 59.159996, 61.731);
        ((GeneralPath) shape).lineTo(53.081997, 63.25);
        ((GeneralPath) shape).curveTo(51.159996, 63.785, 49.746, 64.078, 48.839996, 64.129);
        ((GeneralPath) shape).curveTo(49.559, 64.105995, 50.559, 64.012, 51.839996, 63.851997);
        ((GeneralPath) shape).curveTo(53.335995, 63.663998, 54.335995, 63.543, 54.839996, 63.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_258
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(60.922, 82.289);
        ((GeneralPath) shape).curveTo(61.266003, 82.344, 61.641003, 82.332, 62.039, 82.25);
        ((GeneralPath) shape).lineTo(63.879, 81.211);
        ((GeneralPath) shape).lineTo(63.641003, 81.25);
        ((GeneralPath) shape).curveTo(62.332, 81.41, 61.465004, 81.703, 61.039, 82.129);
        ((GeneralPath) shape).lineTo(60.922, 82.289);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4E3E2B));
        g.fill(shape);

        // _0_0_0_259
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(44.922, 59.77);
        ((GeneralPath) shape).lineTo(43.961002, 59.809002);
        ((GeneralPath) shape).curveTo(43.027, 59.836002, 41.629, 59.996002, 39.762, 60.289);
        ((GeneralPath) shape).curveTo(37.895, 60.582, 36.508, 60.742, 35.602, 60.77);
        ((GeneralPath) shape).curveTo(34.402, 60.77, 33.387, 60.836002, 32.562, 60.969);
        ((GeneralPath) shape).lineTo(31.602001, 61.129);
        ((GeneralPath) shape).curveTo(31.309002, 61.211002, 30.949001, 61.356003, 30.52, 61.570004);
        ((GeneralPath) shape).curveTo(29.961, 61.863003, 29.613, 62.035004, 29.48, 62.090004);
        ((GeneralPath) shape).curveTo(28.227, 62.543003, 27.293, 62.902004, 26.68, 63.172005);
        ((GeneralPath) shape).curveTo(27.0, 63.223003, 27.441, 63.211006, 28.0, 63.129005);
        ((GeneralPath) shape).lineTo(29.641, 62.691006);
        ((GeneralPath) shape).lineTo(44.922, 59.770004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_260
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.961, 46.969);
        ((GeneralPath) shape).lineTo(5.801, 46.969);
        ((GeneralPath) shape).curveTo(6.359, 46.945004, 7.0, 46.836002, 7.723, 46.648003);
        ((GeneralPath) shape).curveTo(8.309, 46.465004, 8.734, 46.289, 9.0, 46.129);
        ((GeneralPath) shape).lineTo(21.562, 40.648003);
        ((GeneralPath) shape).lineTo(17.359001, 42.172);
        ((GeneralPath) shape).curveTo(15.227001, 42.969, 13.762001, 43.504, 12.961001, 43.77);
        ((GeneralPath) shape).curveTo(11.094002, 44.356, 9.707002, 44.824, 8.801002, 45.172);
        ((GeneralPath) shape).lineTo(8.160002, 45.371002);
        ((GeneralPath) shape).curveTo(6.5350018, 45.902, 5.5350018, 46.356003, 5.1600018, 46.731003);
        ((GeneralPath) shape).lineTo(4.961002, 46.969);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_261
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.043, 16.609);
        ((GeneralPath) shape).curveTo(59.309, 16.715, 59.883, 16.647999, 60.762, 16.41);
        ((GeneralPath) shape).lineTo(60.922, 16.371);
        ((GeneralPath) shape).curveTo(60.121002, 16.289, 59.469, 16.305, 58.961002, 16.41);
        ((GeneralPath) shape).lineTo(58.879, 16.487999);
        ((GeneralPath) shape).curveTo(58.934002, 16.57, 58.988003, 16.609, 59.043003, 16.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_262
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(66.48, 79.371);
        ((GeneralPath) shape).curveTo(65.176, 79.449005, 64.188, 79.809006, 63.520004, 80.449005);
        ((GeneralPath) shape).lineTo(64.840004, 80.57001);
        ((GeneralPath) shape).lineTo(66.48, 79.37101);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8A6E4C));
        g.fill(shape);

        // _0_0_0_263
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(61.242, 56.93);
        ((GeneralPath) shape).curveTo(59.961002, 56.984, 59.0, 57.035, 58.359, 57.09);
        ((GeneralPath) shape).curveTo(57.082, 57.172, 55.109, 57.356, 52.441, 57.648);
        ((GeneralPath) shape).curveTo(49.883003, 57.918, 47.934002, 58.09, 46.602, 58.171997);
        ((GeneralPath) shape).curveTo(46.176003, 58.194996, 45.188, 58.211, 43.641003, 58.211);
        ((GeneralPath) shape).curveTo(42.441, 58.211, 41.480003, 58.266, 40.762, 58.371);
        ((GeneralPath) shape).curveTo(40.227, 58.448997, 39.453003, 58.648, 38.441, 58.968998);
        ((GeneralPath) shape).curveTo(38.387, 58.968998, 37.734, 59.051, 36.480003, 59.211);
        ((GeneralPath) shape).curveTo(33.867004, 59.448997, 31.988003, 59.956997, 30.840004, 60.731);
        ((GeneralPath) shape).curveTo(32.840004, 60.516, 34.789005, 60.145, 36.680004, 59.608997);
        ((GeneralPath) shape).curveTo(37.801003, 59.288998, 39.520004, 59.184, 41.840004, 59.288998);
        ((GeneralPath) shape).curveTo(42.988003, 59.343998, 43.840004, 59.356, 44.402004, 59.331997);
        ((GeneralPath) shape).lineTo(44.480003, 59.331997);
        ((GeneralPath) shape).lineTo(61.242004, 56.929996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_264
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.68, 62.09);
        ((GeneralPath) shape).lineTo(9.723001, 61.41);
        ((GeneralPath) shape).curveTo(8.070001, 61.465, 5.7230005, 61.57, 2.6800003, 61.731);
        ((GeneralPath) shape).lineTo(2.6800003, 62.09);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_265
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.359, 42.969);
        ((GeneralPath) shape).curveTo(8.812, 43.504, 7.7230005, 43.918003, 7.0820003, 44.211002);
        ((GeneralPath) shape).curveTo(5.828, 44.742, 4.816, 45.316, 4.043, 45.930004);
        ((GeneralPath) shape).lineTo(4.0, 46.012005);
        ((GeneralPath) shape).curveTo(4.562, 46.035004, 5.16, 45.969006, 5.801, 45.809006);
        ((GeneralPath) shape).curveTo(6.176, 45.703007, 6.7730002, 45.488007, 7.602, 45.172005);
        ((GeneralPath) shape).lineTo(22.203, 40.449005);
        ((GeneralPath) shape).lineTo(21.921999, 40.488007);
        ((GeneralPath) shape).curveTo(18.054998, 41.129005, 16.093998, 41.449005, 16.043, 41.449005);
        ((GeneralPath) shape).curveTo(13.827999, 41.875004, 11.933999, 42.383003, 10.358999, 42.969006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_266
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(75.562, 23.648);
        ((GeneralPath) shape).curveTo(76.120995, 23.676, 76.854996, 23.598001, 77.76199, 23.41);
        ((GeneralPath) shape).lineTo(76.96099, 22.969);
        ((GeneralPath) shape).lineTo(75.56199, 23.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_267
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(76.84, 50.25);
        ((GeneralPath) shape).curveTo(74.67999, 50.676, 73.05499, 50.969, 71.961, 51.129);
        ((GeneralPath) shape).curveTo(72.949, 51.023003, 74.159996, 50.957, 75.602, 50.93);
        ((GeneralPath) shape).curveTo(76.425995, 50.902, 77.641, 50.879, 79.242, 50.852);
        ((GeneralPath) shape).lineTo(98.120995, 48.09);
        ((GeneralPath) shape).lineTo(98.72299, 47.172);
        ((GeneralPath) shape).curveTo(91.577995, 47.996002, 84.28099, 49.023003, 76.843994, 50.25);
        ((GeneralPath) shape).lineTo(76.84, 50.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_268
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(100.2, 43.531);
        ((GeneralPath) shape).lineTo(97.758995, 43.891);
        ((GeneralPath) shape).lineTo(100.157, 43.77);
        ((GeneralPath) shape).lineTo(100.2, 43.531002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_269
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.562, 52.488);
        ((GeneralPath) shape).curveTo(34.734, 52.676, 33.734, 52.996, 32.562, 53.448997);
        ((GeneralPath) shape).curveTo(30.906, 54.062996, 29.812, 54.409996, 29.281, 54.488);
        ((GeneralPath) shape).lineTo(31.641, 54.488);
        ((GeneralPath) shape).lineTo(40.602, 51.09);
        ((GeneralPath) shape).lineTo(40.203003, 51.09);
        ((GeneralPath) shape).curveTo(39.961002, 51.117, 39.453003, 51.223, 38.680004, 51.41);
        ((GeneralPath) shape).curveTo(38.281006, 51.516, 37.762005, 51.690998, 37.121002, 51.93);
        ((GeneralPath) shape).curveTo(36.402, 52.223, 35.883003, 52.41, 35.562004, 52.488);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_270
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.68, 49.41);
        ((GeneralPath) shape).curveTo(26.148, 49.758, 25.734001, 50.012, 25.441, 50.172);
        ((GeneralPath) shape).lineTo(26.0, 50.012);
        ((GeneralPath) shape).curveTo(26.641, 49.797, 27.027, 49.691, 27.16, 49.691);
        ((GeneralPath) shape).lineTo(45.16, 46.410004);
        ((GeneralPath) shape).curveTo(42.309, 46.332005, 39.32, 46.742004, 36.203, 47.648003);
        ((GeneralPath) shape).curveTo(35.508, 47.863003, 34.988, 48.023003, 34.641, 48.129);
        ((GeneralPath) shape).curveTo(34.0, 48.289, 33.468998, 48.383003, 33.043, 48.41);
        ((GeneralPath) shape).curveTo(30.987999, 48.465, 29.75, 48.531, 29.32, 48.609);
        ((GeneralPath) shape).curveTo(28.706999, 48.742, 27.828, 49.012, 26.68, 49.41);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_271
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(87.723, 32.449);
        ((GeneralPath) shape).curveTo(89.375, 31.969002, 90.613, 31.637001, 91.441, 31.449001);
        ((GeneralPath) shape).lineTo(90.281, 30.731);
        ((GeneralPath) shape).curveTo(88.949, 31.078001, 87.441, 31.570002, 85.762, 32.211002);
        ((GeneralPath) shape).curveTo(85.254, 32.426003, 84.762, 32.570004, 84.281, 32.652004);
        ((GeneralPath) shape).lineTo(82.120995, 32.969006);
        ((GeneralPath) shape).curveTo(81.26599, 33.106007, 80.547, 33.238007, 79.96099, 33.371006);
        ((GeneralPath) shape).curveTo(78.89499, 33.637005, 78.093994, 33.824005, 77.55899, 33.930008);
        ((GeneralPath) shape).curveTo(76.62499, 34.145008, 75.81199, 34.266006, 75.12099, 34.28901);
        ((GeneralPath) shape).lineTo(76.358986, 34.28901);
        ((GeneralPath) shape).curveTo(76.41399, 34.28901, 77.60199, 34.250008, 79.92199, 34.17201);
        ((GeneralPath) shape).curveTo(80.69099, 34.17201, 81.19899, 34.145008, 81.44099, 34.090008);
        ((GeneralPath) shape).lineTo(82.23798, 33.96901);
        ((GeneralPath) shape).curveTo(83.44099, 33.625008, 85.26598, 33.11701, 87.71899, 32.44901);
        ((GeneralPath) shape).lineTo(87.722984, 32.44901);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_272
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.043, 74.449);
        ((GeneralPath) shape).curveTo(58.68, 74.238, 59.203, 74.129, 59.601997, 74.129);
        ((GeneralPath) shape).lineTo(63.479996, 73.77);
        ((GeneralPath) shape).lineTo(63.358997, 73.77);
        ((GeneralPath) shape).lineTo(73.082, 72.93);
        ((GeneralPath) shape).curveTo(72.176, 72.93, 69.281, 72.996, 64.402, 73.129);
        ((GeneralPath) shape).curveTo(63.336, 73.129, 62.52, 73.145, 61.961, 73.172);
        ((GeneralPath) shape).curveTo(61.027, 73.223, 60.215, 73.315994, 59.519997, 73.449);
        ((GeneralPath) shape).curveTo(58.347996, 73.663994, 57.640995, 74.034996, 57.401997, 74.57);
        ((GeneralPath) shape).lineTo(58.042995, 74.449);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_273
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.48, 46.25);
        ((GeneralPath) shape).curveTo(14.108999, 46.465, 13.48, 46.703, 12.601999, 46.969);
        ((GeneralPath) shape).curveTo(11.749999, 47.211002, 11.120999, 47.449, 10.723, 47.691);
        ((GeneralPath) shape).curveTo(10.801, 47.664, 11.0, 47.637, 11.32, 47.609);
        ((GeneralPath) shape).curveTo(11.5859995, 47.582, 11.789, 47.531002, 11.922, 47.449);
        ((GeneralPath) shape).lineTo(24.0, 42.531002);
        ((GeneralPath) shape).curveTo(20.801, 43.305, 17.629, 44.543003, 14.48, 46.250004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_274
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.801, 52.172);
        ((GeneralPath) shape).curveTo(5.1480002, 52.356, 3.9060001, 52.531002, 3.082, 52.691);
        ((GeneralPath) shape).lineTo(3.043, 53.289);
        ((GeneralPath) shape).curveTo(3.656, 53.156002, 4.215, 53.09, 4.723, 53.09);
        ((GeneralPath) shape).lineTo(11.641001, 51.371);
        ((GeneralPath) shape).curveTo(10.574, 51.476997, 9.816001, 51.581997, 9.359001, 51.690998);
        ((GeneralPath) shape).lineTo(6.801001, 52.171997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_275
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.922, 55.891);
        ((GeneralPath) shape).lineTo(2.84, 55.93);
        ((GeneralPath) shape).lineTo(2.8009999, 56.531002);
        ((GeneralPath) shape).curveTo(3.066, 56.531002, 3.2419999, 56.559002, 3.32, 56.609);
        ((GeneralPath) shape).lineTo(11.561999, 54.488003);
        ((GeneralPath) shape).curveTo(8.094, 54.969, 5.214999, 55.438004, 2.921999, 55.891003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_276
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(86.242, 54.852);
        ((GeneralPath) shape).curveTo(88.266, 54.422, 90.574, 54.078003, 93.159996, 53.809002);
        ((GeneralPath) shape).lineTo(94.84, 52.051003);
        ((GeneralPath) shape).lineTo(91.479996, 52.852);
        ((GeneralPath) shape).curveTo(89.42999, 53.465, 87.882996, 53.93, 86.84, 54.25);
        ((GeneralPath) shape).curveTo(85.163994, 54.723, 83.718994, 54.996, 82.5, 55.07);
        ((GeneralPath) shape).lineTo(85.883, 54.93);
        ((GeneralPath) shape).lineTo(86.242004, 54.852);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_277
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(80.281, 61.891);
        ((GeneralPath) shape).lineTo(82.762, 61.57);
        ((GeneralPath) shape).curveTo(83.695, 61.332, 85.07, 60.918, 86.883, 60.332);
        ((GeneralPath) shape).lineTo(86.961006, 60.289);
        ((GeneralPath) shape).curveTo(85.309006, 60.422, 83.91, 60.609, 82.76201, 60.852);
        ((GeneralPath) shape).curveTo(80.81201, 61.223, 78.49201, 61.785, 75.80101, 62.531002);
        ((GeneralPath) shape).lineTo(74.52001, 62.852);
        ((GeneralPath) shape).curveTo(75.000015, 62.852, 75.641014, 62.742, 76.44101, 62.531002);
        ((GeneralPath) shape).curveTo(77.39801, 62.289, 78.03901, 62.156002, 78.35901, 62.129);
        ((GeneralPath) shape).curveTo(79.50801, 61.945004, 80.14801, 61.863003, 80.281006, 61.891003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_278
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.0, 71.051);
        ((GeneralPath) shape).lineTo(66.402, 68.129005);
        ((GeneralPath) shape).curveTo(62.242, 69.01201, 59.121002, 69.66401, 57.043, 70.090004);
        ((GeneralPath) shape).lineTo(56.082, 70.25001);
        ((GeneralPath) shape).lineTo(56.16, 71.090004);
        ((GeneralPath) shape).lineTo(56.203, 71.090004);
        ((GeneralPath) shape).curveTo(56.386997, 71.063, 56.652, 71.051, 57.0, 71.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_279
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.922, 54.648);
        ((GeneralPath) shape).curveTo(3.402, 54.543, 3.75, 54.448997, 3.961, 54.371);
        ((GeneralPath) shape).curveTo(4.332, 54.211, 4.949, 54.023, 5.801, 53.809);
        ((GeneralPath) shape).lineTo(10.723, 52.371);
        ((GeneralPath) shape).lineTo(8.5199995, 52.371);
        ((GeneralPath) shape).curveTo(8.042999, 52.371, 7.4689994, 52.465, 6.8009996, 52.648);
        ((GeneralPath) shape).lineTo(5.16, 53.09);
        ((GeneralPath) shape).curveTo(4.203, 53.25, 3.48, 53.41, 2.9999998, 53.57);
        ((GeneralPath) shape).lineTo(2.9219997, 54.648);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4E3E2B));
        g.fill(shape);

        // _0_0_0_280
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(63.262, 73.789);
        ((GeneralPath) shape).lineTo(62.84, 73.852005);
        ((GeneralPath) shape).curveTo(61.242, 74.01201, 59.641, 74.211006, 58.043, 74.449005);
        ((GeneralPath) shape).lineTo(56.48, 74.731);
        ((GeneralPath) shape).lineTo(56.562, 75.57);
        ((GeneralPath) shape).lineTo(63.262, 73.789);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_281
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(79.18, 62.352);
        ((GeneralPath) shape).lineTo(84.0, 61.891003);
        ((GeneralPath) shape).curveTo(84.586, 61.809002, 85.082, 61.770004, 85.48, 61.770004);
        ((GeneralPath) shape).lineTo(86.883, 60.332005);
        ((GeneralPath) shape).curveTo(85.066, 60.918003, 83.695, 61.332005, 82.762, 61.570004);
        ((GeneralPath) shape).curveTo(81.336, 61.969, 80.145004, 62.231003, 79.18, 62.352005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_282
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(81.641, 56.25);
        ((GeneralPath) shape).curveTo(77.824, 57.387, 74.254, 57.977, 70.941, 58.012);
        ((GeneralPath) shape).curveTo(73.57, 58.035, 75.312004, 58.035, 76.16, 58.012);
        ((GeneralPath) shape).curveTo(78.34801, 57.902, 80.254005, 57.625, 81.879005, 57.172);
        ((GeneralPath) shape).curveTo(83.188, 56.824, 85.133, 56.25, 87.72301, 55.449);
        ((GeneralPath) shape).curveTo(88.309006, 55.266003, 89.08201, 55.129, 90.03901, 55.051003);
        ((GeneralPath) shape).curveTo(90.22701, 55.023003, 90.586006, 55.012, 91.12101, 55.012);
        ((GeneralPath) shape).curveTo(91.65201, 54.957, 92.03901, 54.875, 92.28101, 54.77);
        ((GeneralPath) shape).lineTo(93.16001, 53.809002);
        ((GeneralPath) shape).curveTo(90.57401, 54.078003, 88.266014, 54.422, 86.24201, 54.852);
        ((GeneralPath) shape).lineTo(85.88301, 54.93);
        ((GeneralPath) shape).curveTo(84.65601, 55.195, 83.75001, 55.449, 83.16001, 55.691);
        ((GeneralPath) shape).lineTo(81.641014, 56.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_283
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(69.883, 45.332);
        ((GeneralPath) shape).curveTo(68.04301, 45.625, 66.867004, 45.879, 66.36301, 46.09);
        ((GeneralPath) shape).curveTo(65.80101, 46.277, 65.49601, 46.41, 65.44101, 46.488);
        ((GeneralPath) shape).curveTo(65.84401, 46.516, 66.39101, 46.476997, 67.08201, 46.371);
        ((GeneralPath) shape).curveTo(67.88301, 46.238, 68.44101, 46.171997, 68.76201, 46.171997);
        ((GeneralPath) shape).lineTo(84.12101, 43.569996);
        ((GeneralPath) shape).curveTo(81.18801, 43.730995, 76.44101, 44.315994, 69.88301, 45.331997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_284
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(91.441, 31.449);
        ((GeneralPath) shape).curveTo(90.613, 31.637, 89.375, 31.969, 87.723, 32.448997);
        ((GeneralPath) shape).curveTo(85.27, 33.116997, 83.441, 33.624996, 82.242, 33.968998);
        ((GeneralPath) shape).curveTo(81.336, 34.238, 80.800995, 34.398, 80.641, 34.448997);
        ((GeneralPath) shape).curveTo(82.082, 34.211, 84.254, 33.929996, 87.159996, 33.608997);
        ((GeneralPath) shape).lineTo(91.76199, 33.089996);
        ((GeneralPath) shape).curveTo(92.772995, 32.956997, 93.440994, 32.890995, 93.76199, 32.890995);
        ((GeneralPath) shape).lineTo(91.440994, 31.448996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_285
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.402, 34.891);
        ((GeneralPath) shape).curveTo(56.91, 34.703, 57.535, 34.543, 58.281002, 34.41);
        ((GeneralPath) shape).lineTo(57.121002, 34.41);
        ((GeneralPath) shape).curveTo(56.883003, 34.438, 56.668003, 34.449, 56.480003, 34.449);
        ((GeneralPath) shape).curveTo(56.160004, 34.477, 55.949005, 34.465, 55.840004, 34.41);
        ((GeneralPath) shape).curveTo(55.680004, 34.305, 55.547005, 34.129, 55.441006, 33.891);
        ((GeneralPath) shape).lineTo(55.441006, 34.011997);
        ((GeneralPath) shape).lineTo(54.320007, 34.171997);
        ((GeneralPath) shape).curveTo(54.375008, 34.437996, 54.375008, 34.676, 54.320007, 34.891);
        ((GeneralPath) shape).curveTo(54.24201, 35.156, 54.08201, 35.356, 53.840008, 35.488);
        ((GeneralPath) shape).curveTo(53.49201, 35.57, 53.22701, 35.648, 53.043007, 35.731);
        ((GeneralPath) shape).curveTo(53.309006, 35.731, 53.680008, 35.636997, 54.160007, 35.448997);
        ((GeneralPath) shape).curveTo(54.668007, 35.315998, 55.41401, 35.128998, 56.402008, 34.891);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_286
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(76.941, 66.488);
        ((GeneralPath) shape).lineTo(80.562004, 66.488);
        ((GeneralPath) shape).curveTo(81.734, 66.488, 82.535, 66.824, 82.961006, 67.488);
        ((GeneralPath) shape).lineTo(85.922005, 67.891);
        ((GeneralPath) shape).curveTo(84.34801, 66.93, 83.37501, 66.289, 83.00001, 65.969);
        ((GeneralPath) shape).curveTo(82.840004, 65.809, 82.75001, 65.715004, 82.72301, 65.691);
        ((GeneralPath) shape).curveTo(82.66801, 65.664, 82.535, 65.637, 82.32001, 65.609);
        ((GeneralPath) shape).curveTo(81.78901, 65.559, 80.97301, 65.648, 79.879005, 65.891);
        ((GeneralPath) shape).curveTo(78.562004, 66.277, 77.586006, 66.477, 76.941, 66.488);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x453626));
        g.fill(shape);

        // _0_0_0_287
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(98.043, 44.051);
        ((GeneralPath) shape).curveTo(98.336, 44.051, 98.84, 44.023, 99.562, 43.968998);
        ((GeneralPath) shape).curveTo(100.227, 43.945, 100.723, 44.011997, 101.043, 44.171997);
        ((GeneralPath) shape).lineTo(102.801, 44.409996);
        ((GeneralPath) shape).curveTo(102.508, 44.144997, 102.266, 43.956997, 102.082, 43.851997);
        ((GeneralPath) shape).curveTo(101.789, 43.608997, 101.523, 43.476997, 101.281, 43.448997);
        ((GeneralPath) shape).curveTo(101.175995, 43.421997, 101.0, 43.437996, 100.762, 43.488);
        ((GeneralPath) shape).curveTo(100.496, 43.543, 100.32, 43.57, 100.242004, 43.57);
        ((GeneralPath) shape).lineTo(97.16, 43.809);
        ((GeneralPath) shape).curveTo(96.508, 43.938, 95.953, 44.019997, 95.504005, 44.051);
        ((GeneralPath) shape).lineTo(98.04301, 44.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_288
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(93.281, 42.93);
        ((GeneralPath) shape).curveTo(94.534996, 42.797, 95.507996, 42.742, 96.202995, 42.77);
        ((GeneralPath) shape).curveTo(97.452995, 42.77, 99.34799, 42.731, 101.882996, 42.648);
        ((GeneralPath) shape).lineTo(102.562, 42.77);
        ((GeneralPath) shape).curveTo(102.10899, 42.477, 101.77699, 42.266, 101.562, 42.129);
        ((GeneralPath) shape).curveTo(101.159996, 41.918003, 100.788994, 41.813, 100.440994, 41.813);
        ((GeneralPath) shape).lineTo(99.800995, 41.813);
        ((GeneralPath) shape).curveTo(99.72299, 41.813, 99.01599, 41.93, 97.684, 42.172);
        ((GeneralPath) shape).curveTo(96.937996, 42.356, 96.375, 42.477, 96.004, 42.531002);
        ((GeneralPath) shape).lineTo(94.32, 42.648003);
        ((GeneralPath) shape).curveTo(93.469, 42.785004, 92.816, 42.891003, 92.363, 42.969);
        ((GeneralPath) shape).curveTo(92.254, 42.988003, 92.148, 43.008003, 92.043, 43.031002);
        ((GeneralPath) shape).curveTo(92.414, 43.000004, 92.824, 42.965, 93.281, 42.93);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_289
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(92.883, 55.332);
        ((GeneralPath) shape).lineTo(94.402, 55.332);
        ((GeneralPath) shape).curveTo(94.0, 54.879, 93.695, 54.543, 93.48, 54.332);
        ((GeneralPath) shape).curveTo(93.055, 53.93, 92.656006, 53.758, 92.281006, 53.809002);
        ((GeneralPath) shape).curveTo(92.176, 53.809002, 91.855, 53.918003, 91.32001, 54.129);
        ((GeneralPath) shape).curveTo(89.87101, 54.652, 88.56601, 54.938004, 87.40201, 54.988003);
        ((GeneralPath) shape).curveTo(87.57001, 55.016003, 87.75801, 55.047, 87.961006, 55.090004);
        ((GeneralPath) shape).lineTo(90.04301, 55.090004);
        ((GeneralPath) shape).curveTo(90.309006, 55.090004, 90.78901, 55.145004, 91.48, 55.250004);
        ((GeneralPath) shape).curveTo(92.066, 55.332005, 92.535, 55.356003, 92.883, 55.332005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_290
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(99.043, 49.449);
        ((GeneralPath) shape).lineTo(100.0, 49.809002);
        ((GeneralPath) shape).curveTo(99.254, 49.305, 98.68, 48.957, 98.281, 48.77);
        ((GeneralPath) shape).curveTo(97.534996, 48.398, 96.882996, 48.305, 96.32, 48.488);
        ((GeneralPath) shape).curveTo(95.68, 48.836, 95.188, 49.063, 94.84, 49.171997);
        ((GeneralPath) shape).curveTo(95.0, 49.194996, 95.695, 49.211, 96.922, 49.211);
        ((GeneralPath) shape).lineTo(98.004, 49.211);
        ((GeneralPath) shape).curveTo(98.479996, 49.238, 98.827995, 49.315998, 99.043, 49.448997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_291
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(97.883, 48.609);
        ((GeneralPath) shape).lineTo(98.602005, 47.93);
        ((GeneralPath) shape).lineTo(96.840004, 47.93);
        ((GeneralPath) shape).curveTo(96.602005, 47.957, 96.29301, 48.035, 95.922005, 48.172);
        ((GeneralPath) shape).lineTo(95.08201, 48.488003);
        ((GeneralPath) shape).curveTo(93.84401, 48.938004, 92.34401, 49.176003, 90.58201, 49.211002);
        ((GeneralPath) shape).lineTo(93.44101, 49.211002);
        ((GeneralPath) shape).curveTo(94.05501, 49.211002, 94.66801, 49.106003, 95.281006, 48.891003);
        ((GeneralPath) shape).curveTo(96.48, 48.465004, 97.34801, 48.371002, 97.883, 48.609);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x957C5E));
        g.fill(shape);

        // _0_0_0_292
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.441, 60.012);
        ((GeneralPath) shape).curveTo(34.094, 59.715, 33.453003, 59.691, 32.52, 59.93);
        ((GeneralPath) shape).curveTo(31.32, 60.332, 30.387001, 60.637, 29.723, 60.852);
        ((GeneralPath) shape).curveTo(28.816, 61.172, 28.175999, 60.785, 27.800999, 59.691);
        ((GeneralPath) shape).curveTo(27.534998, 58.891003, 27.387, 57.582, 27.359, 55.77);
        ((GeneralPath) shape).curveTo(27.359, 53.902, 27.453, 52.543, 27.640999, 51.691);
        ((GeneralPath) shape).curveTo(27.905998, 50.410004, 28.468998, 49.449, 29.32, 48.809002);
        ((GeneralPath) shape).curveTo(29.772999, 48.488003, 30.855, 48.078003, 32.562, 47.570004);
        ((GeneralPath) shape).curveTo(33.84, 47.172005, 34.602, 46.598003, 34.84, 45.852005);
        ((GeneralPath) shape).curveTo(35.188, 44.785004, 35.07, 44.012005, 34.48, 43.531006);
        ((GeneralPath) shape).curveTo(33.867, 42.996006, 32.828, 42.918007, 31.359, 43.289005);
        ((GeneralPath) shape).curveTo(29.519999, 43.770004, 28.133, 44.316006, 27.203, 44.930004);
        ((GeneralPath) shape).curveTo(25.839998, 45.758003, 24.921999, 46.918003, 24.440998, 48.410004);
        ((GeneralPath) shape).curveTo(23.905998, 49.957005, 23.655998, 52.383003, 23.679998, 55.691);
        ((GeneralPath) shape).curveTo(23.706999, 58.676003, 23.921999, 61.195004, 24.319998, 63.25);
        ((GeneralPath) shape).curveTo(24.612997, 64.852, 26.241999, 65.422, 29.202997, 64.969);
        ((GeneralPath) shape).curveTo(31.815998, 64.57, 33.519997, 63.984, 34.319996, 63.211002);
        ((GeneralPath) shape).curveTo(35.546997, 62.063004, 35.585995, 60.996002, 34.440994, 60.012);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4C3D2C));
        g.fill(shape);

        // _0_0_0_293
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.441, 56.531);
        ((GeneralPath) shape).curveTo(27.629, 56.476997, 28.375, 56.356, 29.68, 56.171997);
        ((GeneralPath) shape).curveTo(31.016, 55.956997, 31.883, 55.676, 32.281002, 55.331997);
        ((GeneralPath) shape).curveTo(32.867, 54.851997, 33.227, 54.503998, 33.359, 54.288998);
        ((GeneralPath) shape).curveTo(33.547, 53.996, 33.656002, 53.516, 33.68, 52.851997);
        ((GeneralPath) shape).curveTo(33.707, 52.156, 33.496002, 51.663998, 33.043, 51.371);
        ((GeneralPath) shape).curveTo(32.613, 51.078, 32.043, 51.063, 31.32, 51.331997);
        ((GeneralPath) shape).curveTo(31.081999, 51.409996, 30.215, 51.648, 28.723, 52.051);
        ((GeneralPath) shape).curveTo(27.629, 52.315998, 26.961, 52.57, 26.723, 52.809);
        ((GeneralPath) shape).curveTo(26.453, 53.106, 26.441, 53.823997, 26.68, 54.968998);
        ((GeneralPath) shape).curveTo(26.895, 56.089996, 27.148, 56.608997, 27.441, 56.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_294
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(44.723, 57.809);
        ((GeneralPath) shape).curveTo(45.656, 59.703, 46.602, 60.676, 47.562, 60.731);
        ((GeneralPath) shape).curveTo(48.574, 60.785, 49.281002, 60.398, 49.68, 59.57);
        ((GeneralPath) shape).curveTo(50.0, 58.852, 49.988, 58.156, 49.641, 57.488);
        ((GeneralPath) shape).curveTo(49.242, 56.715, 47.733997, 54.758, 45.121, 51.608997);
        ((GeneralPath) shape).lineTo(47.121, 48.448997);
        ((GeneralPath) shape).curveTo(48.561996, 46.101997, 49.561996, 44.249996, 50.121, 42.891);
        ((GeneralPath) shape).curveTo(50.706997, 41.421997, 50.453, 40.636997, 49.358997, 40.531);
        ((GeneralPath) shape).curveTo(48.347996, 40.398, 47.519997, 40.648, 46.882996, 41.288998);
        ((GeneralPath) shape).curveTo(46.507996, 41.663998, 45.800995, 42.968998, 44.761997, 45.211);
        ((GeneralPath) shape).lineTo(43.319996, 48.448997);
        ((GeneralPath) shape).lineTo(42.440994, 45.331997);
        ((GeneralPath) shape).curveTo(41.640995, 43.249996, 40.694996, 42.249996, 39.601994, 42.331997);
        ((GeneralPath) shape).curveTo(38.425995, 42.409996, 37.749992, 42.996, 37.561993, 44.089996);
        ((GeneralPath) shape).curveTo(37.42599, 44.968998, 37.58599, 45.851997, 38.04299, 46.730995);
        ((GeneralPath) shape).lineTo(40.999992, 52.171997);
        ((GeneralPath) shape).curveTo(39.214993, 54.968998, 38.136993, 56.956997, 37.761993, 58.128998);
        ((GeneralPath) shape).curveTo(37.468994, 59.144997, 37.425995, 59.968998, 37.640995, 60.608997);
        ((GeneralPath) shape).curveTo(37.882996, 61.331997, 38.440994, 61.676, 39.319996, 61.648);
        ((GeneralPath) shape).curveTo(40.093994, 61.621, 41.026997, 60.503998, 42.120995, 58.288998);
        ((GeneralPath) shape).curveTo(42.679993, 57.194996, 43.159996, 56.106, 43.561996, 55.011997);
        ((GeneralPath) shape).lineTo(44.722996, 57.809);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_295
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.043, 51.57);
        ((GeneralPath) shape).curveTo(57.867, 51.145, 58.336, 50.128998, 58.440998, 48.531);
        ((GeneralPath) shape).curveTo(58.440998, 48.371, 58.413998, 46.304996, 58.358997, 42.331997);
        ((GeneralPath) shape).curveTo(58.336, 40.089996, 57.988, 38.823997, 57.319996, 38.531);
        ((GeneralPath) shape).curveTo(57.136997, 38.448997, 56.491997, 38.598, 55.401997, 38.968998);
        ((GeneralPath) shape).curveTo(54.866997, 39.156, 54.519997, 40.383, 54.358997, 42.651997);
        ((GeneralPath) shape).curveTo(54.253998, 45.503998, 54.159996, 47.542995, 54.081997, 48.769997);
        ((GeneralPath) shape).curveTo(53.948997, 50.371, 54.281, 51.355995, 55.081997, 51.730995);
        ((GeneralPath) shape).curveTo(55.667995, 51.995995, 56.319996, 51.944996, 57.042995, 51.569996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_296
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.242, 58.25);
        ((GeneralPath) shape).curveTo(57.066, 57.93, 57.641, 57.582, 57.961002, 57.211);
        ((GeneralPath) shape).curveTo(58.254, 56.863, 58.414, 56.315998, 58.441, 55.57);
        ((GeneralPath) shape).curveTo(58.492, 53.758, 58.0, 52.968998, 56.961002, 53.211);
        ((GeneralPath) shape).curveTo(54.988003, 53.663998, 53.988003, 54.559, 53.961002, 55.891);
        ((GeneralPath) shape).curveTo(53.934002, 56.77, 54.148003, 57.448997, 54.602, 57.93);
        ((GeneralPath) shape).curveTo(55.055, 58.383, 55.602, 58.488, 56.242, 58.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_297
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(61.52, 52.09);
        ((GeneralPath) shape).curveTo(60.293, 52.758, 59.988, 53.637, 60.602, 54.731);
        ((GeneralPath) shape).curveTo(61.188, 55.823997, 62.148003, 56.356, 63.48, 56.332);
        ((GeneralPath) shape).curveTo(67.507996, 56.25, 71.094, 55.465, 74.242, 53.969);
        ((GeneralPath) shape).curveTo(75.949, 53.145, 76.882996, 52.25, 77.043, 51.289);
        ((GeneralPath) shape).curveTo(77.176, 50.383003, 76.641, 49.703003, 75.441, 49.25);
        ((GeneralPath) shape).curveTo(74.508, 48.902, 73.414, 48.891, 72.16, 49.211);
        ((GeneralPath) shape).lineTo(70.520004, 49.769997);
        ((GeneralPath) shape).lineTo(70.40201, 44.690998);
        ((GeneralPath) shape).curveTo(70.26601, 41.038998, 70.10901, 38.531, 69.922005, 37.171997);
        ((GeneralPath) shape).curveTo(69.68001, 35.648, 68.961006, 35.249996, 67.762, 35.968998);
        ((GeneralPath) shape).curveTo(66.562004, 36.690998, 65.879, 37.758, 65.723, 39.171997);
        ((GeneralPath) shape).curveTo(65.586, 40.266, 65.52, 42.488, 65.52, 45.851997);
        ((GeneralPath) shape).lineTo(65.562, 50.569996);
        ((GeneralPath) shape).curveTo(64.574, 50.675995, 63.226997, 51.183994, 61.519997, 52.089996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_298
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.043, 65.09);
        ((GeneralPath) shape).curveTo(34.242, 63.917995, 34.281, 62.851997, 33.16, 61.890995);
        ((GeneralPath) shape).curveTo(32.812, 61.569996, 32.176, 61.542995, 31.242, 61.808994);
        ((GeneralPath) shape).curveTo(30.043001, 62.210995, 29.109001, 62.515995, 28.441, 62.730995);
        ((GeneralPath) shape).curveTo(27.535, 63.022995, 26.895, 62.624996, 26.52, 61.530994);
        ((GeneralPath) shape).curveTo(26.254, 60.730995, 26.109001, 59.421993, 26.082, 57.608994);
        ((GeneralPath) shape).curveTo(26.082, 55.769993, 26.176, 54.409992, 26.359001, 53.530994);
        ((GeneralPath) shape).curveTo(26.629002, 52.249996, 27.188002, 51.304993, 28.043001, 50.690994);
        ((GeneralPath) shape).curveTo(28.496, 50.343994, 29.562, 49.929993, 31.242, 49.448994);
        ((GeneralPath) shape).curveTo(32.52, 49.077995, 33.281002, 48.515995, 33.52, 47.769993);
        ((GeneralPath) shape).curveTo(33.867, 46.70299, 33.75, 45.929993, 33.16, 45.448994);
        ((GeneralPath) shape).curveTo(32.547, 44.917995, 31.52, 44.835995, 30.082, 45.210995);
        ((GeneralPath) shape).curveTo(28.266, 45.663994, 26.883001, 46.194996, 25.922, 46.808994);
        ((GeneralPath) shape).curveTo(24.562, 47.663994, 23.641, 48.823994, 23.16, 50.288994);
        ((GeneralPath) shape).curveTo(22.656, 51.808994, 22.414, 54.222992, 22.441, 57.530994);
        ((GeneralPath) shape).curveTo(22.469, 60.464996, 22.668, 62.983994, 23.043, 65.09);
        ((GeneralPath) shape).curveTo(23.359, 66.690994, 25.0, 67.266, 27.960999, 66.809);
        ((GeneralPath) shape).curveTo(30.546999, 66.409996, 32.241997, 65.836, 33.043, 65.09);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x706748));
        g.fill(shape);

        // _0_0_0_299
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.32, 57.449);
        ((GeneralPath) shape).curveTo(30.883, 56.996002, 31.227, 56.648003, 31.359, 56.41);
        ((GeneralPath) shape).curveTo(31.546999, 56.117, 31.656, 55.648, 31.679998, 55.012);
        ((GeneralPath) shape).curveTo(31.734, 54.344, 31.534998, 53.863003, 31.081999, 53.57);
        ((GeneralPath) shape).curveTo(30.629, 53.276997, 30.054998, 53.25, 29.359, 53.488);
        ((GeneralPath) shape).curveTo(29.120998, 53.57, 28.254, 53.809, 26.762, 54.211);
        ((GeneralPath) shape).curveTo(25.668, 54.476997, 25.015999, 54.731, 24.800999, 54.968998);
        ((GeneralPath) shape).curveTo(24.508, 55.238, 24.48, 55.945, 24.723, 57.089996);
        ((GeneralPath) shape).curveTo(24.961, 58.210995, 25.227, 58.730995, 25.52, 58.647995);
        ((GeneralPath) shape).curveTo(25.707, 58.597996, 26.453001, 58.487995, 27.762001, 58.331993);
        ((GeneralPath) shape).curveTo(29.043001, 58.089993, 29.895, 57.796993, 30.320002, 57.448994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_300
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.402, 56.731);
        ((GeneralPath) shape).lineTo(43.562, 59.531);
        ((GeneralPath) shape).curveTo(44.496002, 61.398, 45.441, 62.356, 46.402, 62.41);
        ((GeneralPath) shape).curveTo(47.414, 62.465, 48.121002, 62.078, 48.52, 61.25);
        ((GeneralPath) shape).curveTo(48.84, 60.531, 48.828, 59.836, 48.48, 59.172);
        ((GeneralPath) shape).curveTo(48.082, 58.398003, 46.574, 56.438, 43.961, 53.289);
        ((GeneralPath) shape).lineTo(45.961, 50.172);
        ((GeneralPath) shape).curveTo(47.402, 47.824, 48.402, 45.969, 48.961, 44.609);
        ((GeneralPath) shape).curveTo(49.546997, 43.172, 49.281, 42.383, 48.16, 42.25);
        ((GeneralPath) shape).curveTo(47.148, 42.145, 46.332, 42.398, 45.723, 43.012);
        ((GeneralPath) shape).curveTo(45.348, 43.383, 44.641, 44.691, 43.602, 46.93);
        ((GeneralPath) shape).lineTo(42.16, 50.129);
        ((GeneralPath) shape).lineTo(41.281, 47.012);
        ((GeneralPath) shape).curveTo(40.508, 44.957, 39.573997, 43.969, 38.48, 44.051003);
        ((GeneralPath) shape).curveTo(37.309, 44.102, 36.628998, 44.676003, 36.440998, 45.770004);
        ((GeneralPath) shape).curveTo(36.281, 46.676003, 36.426, 47.570004, 36.883, 48.449005);
        ((GeneralPath) shape).lineTo(39.84, 53.852005);
        ((GeneralPath) shape).curveTo(38.055, 56.648006, 36.988, 58.648006, 36.641, 59.852005);
        ((GeneralPath) shape).curveTo(36.348, 60.836006, 36.309, 61.648006, 36.52, 62.289005);
        ((GeneralPath) shape).curveTo(36.762, 63.012005, 37.309002, 63.356007, 38.16, 63.332005);
        ((GeneralPath) shape).curveTo(38.934, 63.305004, 39.867, 62.195004, 40.961, 60.012005);
        ((GeneralPath) shape).curveTo(41.519997, 58.918003, 42.0, 57.824005, 42.402, 56.731007);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_301
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.762, 53.371);
        ((GeneralPath) shape).curveTo(56.562, 52.945, 57.027, 51.93, 57.16, 50.331997);
        ((GeneralPath) shape).curveTo(57.16, 50.062996, 57.137, 47.996, 57.082, 44.128998);
        ((GeneralPath) shape).curveTo(57.055, 41.891, 56.707, 40.624996, 56.039, 40.331997);
        ((GeneralPath) shape).curveTo(55.879, 40.276997, 55.242, 40.421997, 54.121002, 40.769997);
        ((GeneralPath) shape).curveTo(53.586002, 40.956997, 53.242, 42.198997, 53.082, 44.487995);
        ((GeneralPath) shape).curveTo(53.0, 47.343994, 52.906002, 49.370995, 52.801003, 50.569996);
        ((GeneralPath) shape).curveTo(52.668003, 52.144997, 53.000004, 53.116997, 53.801003, 53.487995);
        ((GeneralPath) shape).curveTo(54.387, 53.757996, 55.043003, 53.714996, 55.762, 53.370995);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_302
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(54.961, 60.051);
        ((GeneralPath) shape).curveTo(55.812, 59.731, 56.386997, 59.398, 56.68, 59.051);
        ((GeneralPath) shape).curveTo(56.973, 58.676, 57.133, 58.116997, 57.16, 57.371);
        ((GeneralPath) shape).curveTo(57.215, 55.555, 56.723, 54.769997, 55.68, 55.011997);
        ((GeneralPath) shape).curveTo(53.734, 55.382996, 52.734, 56.276997, 52.68, 57.690998);
        ((GeneralPath) shape).curveTo(52.652, 58.57, 52.867, 59.25, 53.32, 59.731);
        ((GeneralPath) shape).curveTo(53.773, 60.184, 54.32, 60.288998, 54.961, 60.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_303
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(60.203, 56.289);
        ((GeneralPath) shape).curveTo(60.788998, 57.356003, 61.75, 57.875, 63.082, 57.852);
        ((GeneralPath) shape).curveTo(67.109, 57.77, 70.707, 56.984, 73.883, 55.488003);
        ((GeneralPath) shape).curveTo(75.590004, 54.664, 76.523, 53.770004, 76.68, 52.809002);
        ((GeneralPath) shape).curveTo(76.816, 51.93, 76.281, 51.25, 75.082, 50.77);
        ((GeneralPath) shape).curveTo(74.121, 50.422, 73.016, 50.41, 71.762, 50.731);
        ((GeneralPath) shape).lineTo(70.121, 51.288998);
        ((GeneralPath) shape).lineTo(70.0, 46.211);
        ((GeneralPath) shape).curveTo(69.867, 42.555, 69.707, 40.063, 69.52, 38.731);
        ((GeneralPath) shape).curveTo(69.309, 37.184, 68.586, 36.77, 67.35899, 37.488);
        ((GeneralPath) shape).curveTo(66.159996, 38.211, 65.479996, 39.277, 65.31999, 40.690998);
        ((GeneralPath) shape).curveTo(65.21499, 41.781, 65.15999, 44.011997, 65.15999, 47.371);
        ((GeneralPath) shape).lineTo(65.20299, 52.089996);
        ((GeneralPath) shape).curveTo(64.18799, 52.222996, 62.827988, 52.741997, 61.120987, 53.647995);
        ((GeneralPath) shape).curveTo(59.894985, 54.315994, 59.585987, 55.194996, 60.202988, 56.288994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_304
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.68, 66.449);
        ((GeneralPath) shape).lineTo(29.68, 66.332);
        ((GeneralPath) shape).curveTo(28.828001, 66.625, 28.121, 66.785, 27.562, 66.809);
        ((GeneralPath) shape).curveTo(27.32, 66.836, 27.203001, 66.730995, 27.203001, 66.488);
        ((GeneralPath) shape).curveTo(27.203001, 66.25, 27.320002, 66.117, 27.562, 66.09);
        ((GeneralPath) shape).curveTo(29.375, 65.95699, 31.066, 65.050995, 32.641, 63.370995);
        ((GeneralPath) shape).curveTo(33.121, 62.944996, 33.535, 62.784996, 33.883, 62.890995);
        ((GeneralPath) shape).curveTo(33.773, 62.542995, 33.535, 62.210995, 33.16, 61.890995);
        ((GeneralPath) shape).curveTo(32.812, 61.569996, 32.176, 61.542995, 31.242, 61.808994);
        ((GeneralPath) shape).curveTo(30.043001, 62.210995, 29.109001, 62.515995, 28.441, 62.730995);
        ((GeneralPath) shape).curveTo(27.48, 63.050995, 26.816, 62.558994, 26.441, 61.249996);
        ((GeneralPath) shape).curveTo(25.27, 61.194996, 24.227, 60.769997, 23.32, 59.968998);
        ((GeneralPath) shape).curveTo(23.16, 59.836, 23.16, 59.663998, 23.32, 59.448997);
        ((GeneralPath) shape).lineTo(23.203, 59.288998);
        ((GeneralPath) shape).curveTo(23.094, 59.156, 23.109, 59.023, 23.241999, 58.891);
        ((GeneralPath) shape).curveTo(23.374998, 58.785, 23.519999, 58.758, 23.679998, 58.809);
        ((GeneralPath) shape).lineTo(23.999998, 58.968998);
        ((GeneralPath) shape).lineTo(24.241999, 58.851997);
        ((GeneralPath) shape).curveTo(24.425999, 58.823997, 24.694998, 58.809, 25.043, 58.809);
        ((GeneralPath) shape).curveTo(24.987999, 58.543, 25.094, 58.41, 25.359, 58.41);
        ((GeneralPath) shape).lineTo(26.120998, 58.531);
        ((GeneralPath) shape).lineTo(26.081999, 57.608997);
        ((GeneralPath) shape).curveTo(26.081999, 56.089996, 26.133, 54.956997, 26.241999, 54.211);
        ((GeneralPath) shape).curveTo(26.374998, 53.09, 26.679998, 52.211, 27.159998, 51.57);
        ((GeneralPath) shape).lineTo(26.440998, 51.488);
        ((GeneralPath) shape).lineTo(25.358997, 51.648);
        ((GeneralPath) shape).curveTo(25.175997, 51.703, 25.026997, 51.636997, 24.921997, 51.448997);
        ((GeneralPath) shape).curveTo(24.839996, 51.266, 24.894997, 51.116997, 25.081997, 51.011997);
        ((GeneralPath) shape).lineTo(25.159996, 51.011997);
        ((GeneralPath) shape).lineTo(25.159996, 50.968998);
        ((GeneralPath) shape).lineTo(25.202995, 50.968998);
        ((GeneralPath) shape).lineTo(25.839994, 50.769997);
        ((GeneralPath) shape).lineTo(25.839994, 50.730995);
        ((GeneralPath) shape).curveTo(25.706995, 50.464996, 25.772995, 50.288994, 26.042994, 50.210995);
        ((GeneralPath) shape).curveTo(26.468994, 50.050995, 27.319994, 49.929996, 28.601994, 49.851994);
        ((GeneralPath) shape).curveTo(29.749994, 49.690994, 30.386993, 49.288994, 30.519993, 48.647995);
        ((GeneralPath) shape).curveTo(30.815992, 47.448994, 31.280993, 46.944996, 31.921993, 47.128994);
        ((GeneralPath) shape).curveTo(32.269993, 47.237995, 32.546993, 47.397995, 32.761993, 47.608994);
        ((GeneralPath) shape).curveTo(33.026993, 47.901993, 33.026993, 48.183994, 32.761993, 48.448994);
        ((GeneralPath) shape).lineTo(32.319992, 48.769993);
        ((GeneralPath) shape).lineTo(32.241993, 49.089993);
        ((GeneralPath) shape).curveTo(32.905994, 48.769993, 33.335995, 48.331993, 33.519993, 47.769993);
        ((GeneralPath) shape).curveTo(33.866993, 46.70299, 33.749992, 45.929993, 33.159992, 45.448994);
        ((GeneralPath) shape).curveTo(32.546993, 44.917995, 31.519993, 44.835995, 30.081993, 45.210995);
        ((GeneralPath) shape).curveTo(28.265993, 45.663994, 26.882994, 46.194996, 25.921993, 46.808994);
        ((GeneralPath) shape).curveTo(24.561993, 47.663994, 23.640993, 48.823994, 23.159992, 50.288994);
        ((GeneralPath) shape).curveTo(22.655993, 51.808994, 22.413992, 54.222992, 22.440992, 57.530994);
        ((GeneralPath) shape).curveTo(22.468992, 60.464996, 22.667992, 62.983994, 23.042992, 65.09);
        ((GeneralPath) shape).curveTo(23.253992, 66.129, 24.081991, 66.730995, 25.51999, 66.891);
        ((GeneralPath) shape).curveTo(26.667992, 67.023, 28.05499, 66.875, 29.67999, 66.449);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x564F37));
        g.fill(shape);

        // _0_0_0_305
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.641, 56.609);
        ((GeneralPath) shape).curveTo(24.75, 57.438, 24.934, 58.051003, 25.203001, 58.449);
        ((GeneralPath) shape).lineTo(25.359001, 58.41);
        ((GeneralPath) shape).lineTo(26.160002, 58.57);
        ((GeneralPath) shape).lineTo(27.160002, 58.41);
        ((GeneralPath) shape).curveTo(27.055002, 58.356, 26.988, 58.266, 26.961002, 58.129);
        ((GeneralPath) shape).curveTo(26.961002, 57.996002, 27.016003, 57.891003, 27.121002, 57.809002);
        ((GeneralPath) shape).curveTo(27.359003, 57.648003, 27.613003, 57.531002, 27.883001, 57.449);
        ((GeneralPath) shape).curveTo(27.828001, 57.398003, 27.828001, 57.332, 27.883001, 57.25);
        ((GeneralPath) shape).curveTo(27.453001, 56.422, 27.934002, 55.875, 29.320002, 55.609);
        ((GeneralPath) shape).curveTo(29.723001, 55.398003, 30.203001, 55.344, 30.762001, 55.449);
        ((GeneralPath) shape).lineTo(31.52, 55.41);
        ((GeneralPath) shape).lineTo(31.68, 55.371);
        ((GeneralPath) shape).lineTo(31.68, 55.011997);
        ((GeneralPath) shape).curveTo(31.734001, 54.343998, 31.535, 53.863, 31.082, 53.569996);
        ((GeneralPath) shape).curveTo(30.629002, 53.276993, 30.055, 53.249996, 29.359001, 53.487995);
        ((GeneralPath) shape).curveTo(29.121, 53.569996, 28.254002, 53.808994, 26.762001, 54.210995);
        ((GeneralPath) shape).curveTo(25.668001, 54.476994, 25.016, 54.730995, 24.801, 54.968994);
        ((GeneralPath) shape).curveTo(24.562, 55.210995, 24.508001, 55.757996, 24.641, 56.608994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_306
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.641, 59.852);
        ((GeneralPath) shape).lineTo(36.52, 60.211002);
        ((GeneralPath) shape).curveTo(37.48, 59.465004, 38.469, 59.195004, 39.48, 59.410004);
        ((GeneralPath) shape).curveTo(40.148, 59.570004, 40.547, 59.957005, 40.68, 60.570004);
        ((GeneralPath) shape).curveTo(41.32, 59.344, 41.895, 58.063004, 42.402, 56.731003);
        ((GeneralPath) shape).curveTo(42.508, 57.129, 42.68, 57.598003, 42.922, 58.129);
        ((GeneralPath) shape).curveTo(43.109, 57.195, 43.414, 56.543003, 43.84, 56.172);
        ((GeneralPath) shape).curveTo(44.562, 55.582, 45.359, 55.57, 46.242, 56.129);
        ((GeneralPath) shape).lineTo(43.961002, 53.289);
        ((GeneralPath) shape).lineTo(45.961002, 50.172);
        ((GeneralPath) shape).curveTo(47.402, 47.824, 48.402, 45.969, 48.961002, 44.609);
        ((GeneralPath) shape).curveTo(49.520004, 43.195, 49.266003, 42.41, 48.203003, 42.25);
        ((GeneralPath) shape).curveTo(47.266003, 42.117, 46.453003, 42.356, 45.762, 42.969);
        ((GeneralPath) shape).curveTo(46.215, 42.996002, 46.586002, 43.106003, 46.883, 43.289);
        ((GeneralPath) shape).curveTo(47.387, 43.582, 47.535, 44.238003, 47.32, 45.25);
        ((GeneralPath) shape).curveTo(47.27, 45.516, 47.027, 46.223, 46.602, 47.371);
        ((GeneralPath) shape).curveTo(45.773003, 49.581997, 44.426003, 51.078, 42.562, 51.851997);
        ((GeneralPath) shape).curveTo(42.375, 51.956997, 42.215, 51.901997, 42.082, 51.690998);
        ((GeneralPath) shape).curveTo(41.977, 51.503998, 42.016, 51.356, 42.203, 51.249996);
        ((GeneralPath) shape).lineTo(42.543, 50.769997);
        ((GeneralPath) shape).curveTo(42.715, 50.733997, 42.801, 50.628998, 42.801, 50.448997);
        ((GeneralPath) shape).lineTo(42.801, 50.409996);
        ((GeneralPath) shape).lineTo(46.601997, 45.089996);
        ((GeneralPath) shape).curveTo(46.815998, 44.077995, 46.347996, 43.624996, 45.203, 43.730995);
        ((GeneralPath) shape).curveTo(44.641, 44.663994, 43.801, 46.397995, 42.68, 48.929996);
        ((GeneralPath) shape).lineTo(42.801, 50.409996);
        ((GeneralPath) shape).lineTo(42.543, 50.769997);
        ((GeneralPath) shape).lineTo(42.440998, 50.769997);
        ((GeneralPath) shape).curveTo(42.203, 50.769997, 42.081997, 50.663998, 42.081997, 50.448997);
        ((GeneralPath) shape).lineTo(42.042995, 49.608997);
        ((GeneralPath) shape).curveTo(41.425995, 46.757996, 40.561996, 44.996, 39.440994, 44.331997);
        ((GeneralPath) shape).curveTo(40.026993, 44.784996, 40.269993, 45.531, 40.159996, 46.569996);
        ((GeneralPath) shape).curveTo(40.054996, 47.608997, 39.585995, 48.077995, 38.761997, 47.968994);
        ((GeneralPath) shape).curveTo(38.656, 48.636993, 38.226997, 49.183994, 37.479996, 49.608994);
        ((GeneralPath) shape).lineTo(39.839996, 53.851994);
        ((GeneralPath) shape).curveTo(38.054996, 56.647995, 36.987995, 58.647995, 36.640995, 59.851994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_307
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(56.48, 45.77);
        ((GeneralPath) shape).curveTo(56.855, 46.438, 57.093998, 47.195, 57.203, 48.051);
        ((GeneralPath) shape).lineTo(57.082, 44.128998);
        ((GeneralPath) shape).curveTo(57.055, 41.891, 56.707, 40.624996, 56.043, 40.331997);
        ((GeneralPath) shape).curveTo(55.883, 40.276997, 55.242, 40.421997, 54.121, 40.769997);
        ((GeneralPath) shape).curveTo(53.641, 40.956997, 53.309, 42.062996, 53.121, 44.089996);
        ((GeneralPath) shape).lineTo(53.203, 44.050995);
        ((GeneralPath) shape).curveTo(54.453, 43.597996, 55.547, 44.171993, 56.48, 45.769997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_308
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.121, 57.648);
        ((GeneralPath) shape).lineTo(57.16, 57.371);
        ((GeneralPath) shape).curveTo(57.215, 55.555, 56.723, 54.769997, 55.68, 55.011997);
        ((GeneralPath) shape).curveTo(53.973, 55.382996, 53.0, 56.128998, 52.762, 57.249996);
        ((GeneralPath) shape).curveTo(52.977, 57.116997, 53.215, 57.034996, 53.48, 57.011997);
        ((GeneralPath) shape).curveTo(54.039, 56.581997, 54.668, 56.448997, 55.359, 56.608997);
        ((GeneralPath) shape).curveTo(56.0, 56.741997, 56.586002, 57.089996, 57.121002, 57.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_309
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(68.762, 37.371);
        ((GeneralPath) shape).curveTo(69.16, 37.93, 69.453, 38.651997, 69.641, 39.531);
        ((GeneralPath) shape).lineTo(69.523, 38.731);
        ((GeneralPath) shape).curveTo(69.414, 37.957, 69.137, 37.476997, 68.68, 37.288998);
        ((GeneralPath) shape).lineTo(68.762, 37.371);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_310
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(61.922, 57.648);
        ((GeneralPath) shape).lineTo(62.082, 57.488);
        ((GeneralPath) shape).curveTo(62.934002, 56.663998, 64.723, 55.421997, 67.441, 53.77);
        ((GeneralPath) shape).curveTo(71.465004, 51.266, 74.508, 51.051, 76.559006, 53.129);
        ((GeneralPath) shape).curveTo(76.746, 52.625, 76.70701, 52.172, 76.44101, 51.77);
        ((GeneralPath) shape).curveTo(76.17601, 51.344, 75.72301, 51.012, 75.08201, 50.77);
        ((GeneralPath) shape).curveTo(74.12101, 50.422, 73.01601, 50.41, 71.76201, 50.731);
        ((GeneralPath) shape).lineTo(70.12101, 51.288998);
        ((GeneralPath) shape).lineTo(69.94101, 45.190998);
        ((GeneralPath) shape).curveTo(69.93801, 47.843998, 69.23801, 49.476997, 67.84001, 50.089996);
        ((GeneralPath) shape).curveTo(67.68001, 50.171997, 67.52001, 50.128998, 67.35901, 49.968998);
        ((GeneralPath) shape).lineTo(65.16001, 49.891);
        ((GeneralPath) shape).lineTo(65.20301, 52.09);
        ((GeneralPath) shape).curveTo(64.18801, 52.223, 62.82801, 52.742, 61.12101, 53.648);
        ((GeneralPath) shape).curveTo(60.10901, 54.184, 59.74601, 54.902, 60.03901, 55.809);
        ((GeneralPath) shape).curveTo(60.28101, 56.690998, 60.910007, 57.304996, 61.92201, 57.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_311
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.441, 64.172);
        ((GeneralPath) shape).curveTo(31.668, 63.023, 31.707, 61.956997, 30.562, 60.968998);
        ((GeneralPath) shape).curveTo(30.215, 60.676, 29.586, 60.648, 28.68, 60.891);
        ((GeneralPath) shape).curveTo(27.48, 61.288998, 26.547, 61.598, 25.883, 61.809);
        ((GeneralPath) shape).curveTo(25.0, 62.106, 24.375, 61.703, 24.0, 60.608997);
        ((GeneralPath) shape).curveTo(23.734, 59.809, 23.586, 58.516, 23.562, 56.731);
        ((GeneralPath) shape).curveTo(23.535, 54.891, 23.613, 53.531, 23.801, 52.648);
        ((GeneralPath) shape).curveTo(24.066, 51.371, 24.629, 50.421997, 25.480001, 49.809);
        ((GeneralPath) shape).curveTo(25.934002, 49.464996, 27.000002, 49.051, 28.680002, 48.57);
        ((GeneralPath) shape).curveTo(29.961002, 48.195, 30.723001, 47.637, 30.961002, 46.891);
        ((GeneralPath) shape).curveTo(31.309002, 45.823997, 31.188002, 45.051, 30.602003, 44.57);
        ((GeneralPath) shape).curveTo(29.988003, 44.035, 28.949003, 43.957, 27.480003, 44.332);
        ((GeneralPath) shape).curveTo(25.695004, 44.785, 24.309004, 45.316, 23.320004, 45.93);
        ((GeneralPath) shape).curveTo(21.988003, 46.785, 21.082005, 47.945, 20.602003, 49.41);
        ((GeneralPath) shape).curveTo(20.094004, 50.957, 19.855003, 53.371, 19.883003, 56.648);
        ((GeneralPath) shape).curveTo(19.906004, 59.636997, 20.121004, 62.145, 20.520002, 64.172);
        ((GeneralPath) shape).curveTo(20.816002, 65.77, 22.426003, 66.343994, 25.359003, 65.891);
        ((GeneralPath) shape).curveTo(27.949003, 65.488, 29.641003, 64.918, 30.441002, 64.172);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF4EDCC));
        g.fill(shape);

        // _0_0_0_312
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.203, 57.41);
        ((GeneralPath) shape).curveTo(26.508, 57.195, 27.359, 56.918, 27.762, 56.57);
        ((GeneralPath) shape).curveTo(28.348, 56.09, 28.695, 55.742, 28.800999, 55.531);
        ((GeneralPath) shape).curveTo(28.987999, 55.238, 29.093998, 54.769997, 29.120998, 54.128998);
        ((GeneralPath) shape).curveTo(29.147999, 53.437996, 28.948997, 52.945, 28.519999, 52.648);
        ((GeneralPath) shape).curveTo(28.069998, 52.356, 27.495998, 52.343998, 26.800999, 52.608997);
        ((GeneralPath) shape).curveTo(26.561998, 52.690998, 25.695, 52.929996, 24.203, 53.331997);
        ((GeneralPath) shape).curveTo(23.137, 53.597996, 22.48, 53.851997, 22.241999, 54.089996);
        ((GeneralPath) shape).curveTo(21.977, 54.355995, 21.960999, 55.050995, 22.203, 56.171997);
        ((GeneralPath) shape).curveTo(22.414, 57.288998, 22.668, 57.823997, 22.960999, 57.769997);
        ((GeneralPath) shape).curveTo(23.147999, 57.714996, 23.894999, 57.597996, 25.203, 57.409996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_313
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.84, 63.172);
        ((GeneralPath) shape).curveTo(32.043, 62.051003, 32.082, 60.984, 30.961, 59.969);
        ((GeneralPath) shape).curveTo(30.613, 59.676003, 29.977001, 59.664, 29.043001, 59.93);
        ((GeneralPath) shape).curveTo(27.840002, 60.332, 26.906002, 60.637, 26.242, 60.852);
        ((GeneralPath) shape).curveTo(25.359001, 61.145, 24.734001, 60.742, 24.359001, 59.648003);
        ((GeneralPath) shape).curveTo(24.094002, 58.852, 23.949001, 57.543003, 23.922, 55.731003);
        ((GeneralPath) shape).curveTo(23.895, 53.891003, 23.977001, 52.531002, 24.160002, 51.648003);
        ((GeneralPath) shape).curveTo(24.426003, 50.371002, 24.988, 49.422, 25.840002, 48.809002);
        ((GeneralPath) shape).curveTo(26.293001, 48.465, 27.359001, 48.051003, 29.043003, 47.570004);
        ((GeneralPath) shape).curveTo(30.320004, 47.195004, 31.082003, 46.637005, 31.320004, 45.891003);
        ((GeneralPath) shape).curveTo(31.668003, 44.824, 31.547003, 44.051003, 30.961004, 43.570004);
        ((GeneralPath) shape).curveTo(30.348003, 43.035004, 29.320004, 42.957005, 27.883003, 43.332005);
        ((GeneralPath) shape).curveTo(26.043003, 43.809006, 24.656004, 44.356003, 23.723003, 44.969006);
        ((GeneralPath) shape).curveTo(22.387003, 45.797005, 21.469004, 46.957005, 20.961002, 48.449005);
        ((GeneralPath) shape).curveTo(20.453003, 49.969006, 20.215002, 52.371006, 20.242002, 55.648006);
        ((GeneralPath) shape).curveTo(20.270002, 58.637005, 20.480003, 61.156006, 20.883003, 63.211006);
        ((GeneralPath) shape).curveTo(21.176003, 64.809006, 22.801003, 65.383, 25.762003, 64.93001);
        ((GeneralPath) shape).curveTo(28.348003, 64.504005, 30.043003, 63.918007, 30.840004, 63.17201);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD0C594));
        g.fill(shape);

        // _0_0_0_314
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.32, 56.77);
        ((GeneralPath) shape).curveTo(23.508, 56.715, 24.254, 56.609, 25.562, 56.449);
        ((GeneralPath) shape).curveTo(26.84, 56.211002, 27.695, 55.918003, 28.121, 55.57);
        ((GeneralPath) shape).curveTo(28.68, 55.117, 29.027, 54.77, 29.16, 54.531);
        ((GeneralPath) shape).curveTo(29.348, 54.238, 29.453, 53.769997, 29.48, 53.128998);
        ((GeneralPath) shape).curveTo(29.535, 52.437996, 29.331999, 51.945, 28.883, 51.648);
        ((GeneralPath) shape).curveTo(28.453, 51.356, 27.883, 51.343998, 27.16, 51.608997);
        ((GeneralPath) shape).curveTo(26.921999, 51.690998, 26.055, 51.929996, 24.562, 52.331997);
        ((GeneralPath) shape).curveTo(23.496, 52.597996, 22.84, 52.851997, 22.602001, 53.089996);
        ((GeneralPath) shape).curveTo(22.336, 53.355995, 22.320002, 54.062996, 22.562, 55.210995);
        ((GeneralPath) shape).curveTo(22.773, 56.331993, 23.027, 56.851994, 23.32, 56.769997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_315
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.121, 58.531);
        ((GeneralPath) shape).curveTo(42.055, 60.398, 42.988, 61.356, 43.921997, 61.41);
        ((GeneralPath) shape).curveTo(44.961, 61.465, 45.667995, 61.078, 46.042995, 60.25);
        ((GeneralPath) shape).curveTo(46.358997, 59.555, 46.347996, 58.863, 45.999996, 58.172);
        ((GeneralPath) shape).curveTo(45.601997, 57.422, 44.108997, 55.477, 41.519997, 52.332);
        ((GeneralPath) shape).lineTo(43.479996, 49.211002);
        ((GeneralPath) shape).curveTo(44.921997, 46.863003, 45.921997, 45.012, 46.479996, 43.648003);
        ((GeneralPath) shape).curveTo(47.065994, 42.211002, 46.815994, 41.422, 45.722996, 41.289);
        ((GeneralPath) shape).curveTo(44.706997, 41.184002, 43.882996, 41.438, 43.241997, 42.051003);
        ((GeneralPath) shape).curveTo(42.866997, 42.422, 42.175995, 43.731003, 41.159996, 45.969);
        ((GeneralPath) shape).lineTo(39.722996, 49.172);
        ((GeneralPath) shape).lineTo(38.839996, 46.051003);
        ((GeneralPath) shape).curveTo(38.069996, 43.996002, 37.136997, 43.012, 36.042995, 43.090004);
        ((GeneralPath) shape).curveTo(34.866997, 43.145004, 34.187996, 43.715004, 33.999996, 44.809006);
        ((GeneralPath) shape).curveTo(33.866997, 45.691006, 34.026997, 46.582005, 34.479996, 47.488007);
        ((GeneralPath) shape).lineTo(37.401997, 52.891006);
        ((GeneralPath) shape).curveTo(35.640995, 55.664005, 34.573997, 57.648006, 34.202995, 58.852005);
        ((GeneralPath) shape).curveTo(33.905994, 59.809006, 33.866997, 60.609005, 34.081997, 61.250004);
        ((GeneralPath) shape).curveTo(34.319996, 61.996002, 34.866997, 62.356003, 35.722996, 62.332005);
        ((GeneralPath) shape).curveTo(36.495995, 62.305004, 37.425995, 61.195004, 38.519997, 59.012005);
        ((GeneralPath) shape).curveTo(39.081997, 57.918003, 39.561996, 56.824005, 39.961, 55.731007);
        ((GeneralPath) shape).lineTo(41.121, 58.531006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF4EDCC));
        g.fill(shape);

        // _0_0_0_316
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.441, 57.609);
        ((GeneralPath) shape).curveTo(42.402, 59.477, 43.348003, 60.438, 44.281002, 60.488003);
        ((GeneralPath) shape).curveTo(45.293003, 60.543003, 46.000004, 60.156002, 46.402, 59.332005);
        ((GeneralPath) shape).curveTo(46.723, 58.609005, 46.707, 57.918003, 46.359, 57.250004);
        ((GeneralPath) shape).curveTo(45.961002, 56.477005, 44.453003, 54.516003, 41.84, 51.371002);
        ((GeneralPath) shape).lineTo(43.84, 48.250004);
        ((GeneralPath) shape).curveTo(45.254, 45.902004, 46.242, 44.051003, 46.801, 42.691);
        ((GeneralPath) shape).curveTo(47.413998, 41.25, 47.16, 40.465, 46.043, 40.332);
        ((GeneralPath) shape).curveTo(45.027, 40.223, 44.215, 40.488, 43.601997, 41.129);
        ((GeneralPath) shape).curveTo(43.226997, 41.504, 42.519997, 42.797, 41.479996, 45.012);
        ((GeneralPath) shape).lineTo(40.081997, 48.211002);
        ((GeneralPath) shape).lineTo(39.202995, 45.090004);
        ((GeneralPath) shape).curveTo(38.401997, 43.035004, 37.452995, 42.051003, 36.358994, 42.129005);
        ((GeneralPath) shape).curveTo(35.214993, 42.211006, 34.546993, 42.785004, 34.358994, 43.852005);
        ((GeneralPath) shape).curveTo(34.202995, 44.758003, 34.347992, 45.648006, 34.800995, 46.531006);
        ((GeneralPath) shape).lineTo(37.761993, 51.930008);
        ((GeneralPath) shape).curveTo(35.976994, 54.731007, 34.905994, 56.715008, 34.561993, 57.891006);
        ((GeneralPath) shape).curveTo(34.26599, 58.902008, 34.226994, 59.715008, 34.440994, 60.33201);
        ((GeneralPath) shape).curveTo(34.679993, 61.05101, 35.226994, 61.39801, 36.081993, 61.37101);
        ((GeneralPath) shape).curveTo(36.854992, 61.34401, 37.788994, 60.23801, 38.88299, 58.05101);
        ((GeneralPath) shape).curveTo(39.41399, 56.95701, 39.88299, 55.87501, 40.28099, 54.80901);
        ((GeneralPath) shape).lineTo(41.44099, 57.60901);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD0C594));
        g.fill(shape);

        // _0_0_0_317
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(53.203, 52.41);
        ((GeneralPath) shape).curveTo(54.027, 51.984, 54.492, 50.969, 54.601997, 49.371);
        ((GeneralPath) shape).curveTo(54.601997, 49.211, 54.573997, 47.156, 54.519997, 43.211);
        ((GeneralPath) shape).curveTo(54.491997, 40.968998, 54.147995, 39.703, 53.479996, 39.41);
        ((GeneralPath) shape).curveTo(53.292995, 39.328, 52.667995, 39.477, 51.601997, 39.852);
        ((GeneralPath) shape).curveTo(51.065998, 40.035, 50.718998, 41.266003, 50.559, 43.531002);
        ((GeneralPath) shape).curveTo(50.453, 46.383003, 50.358997, 48.410004, 50.281, 49.609);
        ((GeneralPath) shape).curveTo(50.148, 51.184002, 50.48, 52.156002, 51.281, 52.531002);
        ((GeneralPath) shape).curveTo(51.866997, 52.824, 52.508, 52.785004, 53.203, 52.410004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF4EDCC));
        g.fill(shape);

        // _0_0_0_318
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(52.441, 59.051);
        ((GeneralPath) shape).curveTo(53.293003, 58.731, 53.855003, 58.398, 54.121002, 58.051);
        ((GeneralPath) shape).curveTo(54.414, 57.703, 54.574, 57.156, 54.602, 56.41);
        ((GeneralPath) shape).curveTo(54.629, 55.531, 54.551003, 54.918, 54.363003, 54.57);
        ((GeneralPath) shape).curveTo(54.148003, 54.09, 53.750004, 53.918, 53.160004, 54.051);
        ((GeneralPath) shape).curveTo(51.188004, 54.421997, 50.188004, 55.315998, 50.160004, 56.731);
        ((GeneralPath) shape).curveTo(50.137005, 57.608997, 50.348003, 58.277, 50.801003, 58.731);
        ((GeneralPath) shape).curveTo(51.254, 59.184, 51.801003, 59.288998, 52.441, 59.051);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_319
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(53.602, 51.41);
        ((GeneralPath) shape).curveTo(54.402, 50.984, 54.867, 49.984, 55.0, 48.41);
        ((GeneralPath) shape).curveTo(55.0, 48.145, 54.977, 46.078, 54.922, 42.211);
        ((GeneralPath) shape).curveTo(54.867, 39.968998, 54.52, 38.715, 53.879, 38.448997);
        ((GeneralPath) shape).curveTo(53.695004, 38.371, 53.055, 38.516, 51.961002, 38.891);
        ((GeneralPath) shape).curveTo(51.426003, 39.078, 51.082, 40.305, 50.922, 42.57);
        ((GeneralPath) shape).curveTo(50.84, 45.422, 50.75, 47.449, 50.641003, 48.652);
        ((GeneralPath) shape).curveTo(50.508003, 50.223, 50.840004, 51.199, 51.641003, 51.57);
        ((GeneralPath) shape).curveTo(52.227, 51.836, 52.883003, 51.785, 53.602, 51.41);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD0C594));
        g.fill(shape);

        // _0_0_0_320
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(52.801, 58.09);
        ((GeneralPath) shape).curveTo(53.652, 57.77, 54.215, 57.438, 54.48, 57.09);
        ((GeneralPath) shape).curveTo(54.773, 56.742, 54.934, 56.195, 54.961, 55.449);
        ((GeneralPath) shape).curveTo(55.07, 53.637, 54.59, 52.852, 53.523, 53.09);
        ((GeneralPath) shape).curveTo(51.573997, 53.465, 50.573997, 54.356, 50.523, 55.77);
        ((GeneralPath) shape).curveTo(50.496, 56.648, 50.706997, 57.316, 51.16, 57.77);
        ((GeneralPath) shape).curveTo(51.613, 58.223, 52.16, 58.332, 52.801, 58.09);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_321
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(58.762, 52.93);
        ((GeneralPath) shape).curveTo(57.535, 53.57, 57.215, 54.449, 57.801003, 55.57);
        ((GeneralPath) shape).curveTo(58.387, 56.664, 59.348003, 57.195, 60.680004, 57.172);
        ((GeneralPath) shape).curveTo(64.734, 57.09, 68.336006, 56.305, 71.48, 54.809002);
        ((GeneralPath) shape).curveTo(73.188, 53.984, 74.121, 53.09, 74.281006, 52.129);
        ((GeneralPath) shape).curveTo(74.41401, 51.223003, 73.883, 50.543003, 72.68001, 50.09);
        ((GeneralPath) shape).curveTo(71.75001, 49.742, 70.64101, 49.731, 69.36301, 50.051);
        ((GeneralPath) shape).lineTo(67.72301, 50.608997);
        ((GeneralPath) shape).lineTo(67.602005, 45.531);
        ((GeneralPath) shape).curveTo(67.469, 41.878998, 67.309006, 39.371, 67.121, 38.011997);
        ((GeneralPath) shape).curveTo(66.91, 36.491997, 66.188, 36.089996, 64.961, 36.812996);
        ((GeneralPath) shape).curveTo(63.761997, 37.530994, 63.081997, 38.597996, 62.921997, 40.011997);
        ((GeneralPath) shape).curveTo(62.815998, 41.106, 62.761997, 43.331997, 62.761997, 46.690998);
        ((GeneralPath) shape).lineTo(62.801, 51.409996);
        ((GeneralPath) shape).curveTo(61.788998, 51.515995, 60.440998, 52.022995, 58.761997, 52.929996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF4EDCC));
        g.fill(shape);

        // _0_0_0_322
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.203, 52.25);
        ((GeneralPath) shape).curveTo(57.976997, 52.891, 57.652, 53.77, 58.242, 54.891);
        ((GeneralPath) shape).curveTo(58.828, 55.983997, 59.789, 56.516, 61.121002, 56.488);
        ((GeneralPath) shape).curveTo(65.176, 56.41, 68.773, 55.625, 71.922005, 54.128998);
        ((GeneralPath) shape).curveTo(73.629005, 53.304996, 74.562004, 52.409996, 74.72301, 51.448997);
        ((GeneralPath) shape).curveTo(74.85501, 50.543, 74.32001, 49.863, 73.12101, 49.409996);
        ((GeneralPath) shape).curveTo(72.18801, 49.062996, 71.08201, 49.050995, 69.80101, 49.370995);
        ((GeneralPath) shape).lineTo(68.16001, 49.929993);
        ((GeneralPath) shape).lineTo(68.043015, 44.851994);
        ((GeneralPath) shape).curveTo(67.93801, 41.198994, 67.777016, 38.690994, 67.56201, 37.331993);
        ((GeneralPath) shape).curveTo(67.348015, 35.808994, 66.641014, 35.409992, 65.44101, 36.128994);
        ((GeneralPath) shape).curveTo(64.24201, 36.823994, 63.562008, 37.878994, 63.402008, 39.288994);
        ((GeneralPath) shape).curveTo(63.266006, 40.382996, 63.203007, 42.624992, 63.203007, 46.011993);
        ((GeneralPath) shape).lineTo(63.24201, 50.730995);
        ((GeneralPath) shape).curveTo(62.22701, 50.835995, 60.883007, 51.343994, 59.203007, 52.249996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD0C594));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

