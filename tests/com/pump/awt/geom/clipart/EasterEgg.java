package com.pump.awt.geom.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/209562/food-egghunt-egg-1
 * </p>
 */
public class EasterEgg implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public EasterEgg() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public EasterEgg(int width, int height) {
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
        g.transform(new AffineTransform(0.047427084f, 0, 0, 0.047427084f, 0, 0.122195855f));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, 0, 15.932f));

        // _0_0

        // _0_0_0

        // _0_0_0_0

        // _0_0_0_0_0

        // _0_0_0_0_0_0

        // _0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.32, 3.879);
        ((GeneralPath) shape).lineTo(15.0, 3.5579998);
        ((GeneralPath) shape).curveTo(14.602, 3.1869998, 14.133, 2.8119998, 13.602, 2.441);
        ((GeneralPath) shape).lineTo(13.441, 2.281);
        ((GeneralPath) shape).curveTo(13.359, 2.254, 13.293, 2.2259998, 13.238, 2.199);
        ((GeneralPath) shape).curveTo(14.5199995, 3.7729998, 14.934, 5.746, 14.48, 8.121);
        ((GeneralPath) shape).curveTo(14.132999, 9.773001, 13.348, 11.0390005, 12.120999, 11.918);
        ((GeneralPath) shape).curveTo(12.358999, 11.867001, 12.5859995, 11.785, 12.801, 11.68);
        ((GeneralPath) shape).lineTo(14.32, 10.918);
        ((GeneralPath) shape).curveTo(14.426, 10.867001, 14.5199995, 10.812, 14.601999, 10.758);
        ((GeneralPath) shape).lineTo(14.620999, 10.738);
        ((GeneralPath) shape).curveTo(15.245999, 10.0, 15.612999, 9.207, 15.719, 8.359);
        ((GeneralPath) shape).curveTo(15.934, 6.6800003, 15.852, 5.254, 15.48, 4.0820003);
        ((GeneralPath) shape).curveTo(15.426, 4.0270004, 15.375, 3.9610002, 15.32, 3.8790002);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(0.0, 5.601);
        ((GeneralPath) shape).curveTo(0.078, 7.332, 0.453, 8.625, 1.121, 9.48);
        ((GeneralPath) shape).curveTo(1.227, 9.639999, 1.348, 9.801, 1.48, 9.9609995);
        ((GeneralPath) shape).curveTo(2.066, 9.879, 2.52, 9.172, 2.8400002, 7.839999);
        ((GeneralPath) shape).curveTo(3.1600003, 6.5079985, 3.16, 5.2649994, 2.8400002, 4.1209993);
        ((GeneralPath) shape).curveTo(2.5470002, 2.9999993, 2.094, 2.4139993, 1.4800001, 2.3589993);
        ((GeneralPath) shape).curveTo(0.5740001, 3.3199992, 0.07800019, 4.3979993, 1.1920929E-7, 5.6009994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(5.176300048828125, -8.387700080871582), 12.978f, new Point2D.Double(5.176300048828125, -8.387700080871582), new float[]{0, 0.1373f, 0.349f, 0.6078f, 0.902f, 1}, new Color[]{new Color(0xBAFFED), new Color(0xB2F7E5), new Color(0x9EE2D0), new Color(0x7BBFAD), new Color(0x4C8F7E), new Color(0x3B7D6C)}, NO_CYCLE, SRGB, new AffineTransform(0.20944f, -0.77208f, 0.8444f, 0.22904f, 13.559f, 16.437f)));
        g.fill(shape);

        // _0_0_0_1

        // _0_0_0_1_0

        // _0_0_0_1_0_0

        // _0_0_0_1_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.641, 8.922);
        ((GeneralPath) shape).curveTo(13.855, 9.371, 13.651999, 9.773, 13.039, 10.121);
        ((GeneralPath) shape).curveTo(12.773, 10.281, 12.332, 10.332001, 11.723, 10.281);
        ((GeneralPath) shape).curveTo(11.026999, 10.226, 10.707, 10.0, 10.761999, 9.601);
        ((GeneralPath) shape).curveTo(10.839999, 8.719, 11.440999, 8.281, 12.561999, 8.281);
        ((GeneralPath) shape).curveTo(13.093999, 8.281, 13.452999, 8.492001, 13.640999, 8.922);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(14.621, 10.738);
        ((GeneralPath) shape).curveTo(15.949, 9.89, 16.691, 8.859, 16.84, 7.64);
        ((GeneralPath) shape).curveTo(17.0, 6.387, 16.492, 5.133, 15.32, 3.879);
        ((GeneralPath) shape).curveTo(15.370999, 3.961, 15.426, 4.027, 15.48, 4.082);
        ((GeneralPath) shape).curveTo(15.851999, 5.2539997, 15.934, 6.68, 15.719, 8.358999);
        ((GeneralPath) shape).curveTo(15.613, 9.206999, 15.246, 9.999999, 14.621, 10.737999);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.8980007, 12.601);
        ((GeneralPath) shape).curveTo(7.1020007, 12.808, 8.375001, 12.793, 9.719001, 12.558);
        ((GeneralPath) shape).curveTo(9.504001, 12.589999, 9.2890005, 12.617, 9.078001, 12.639999);
        ((GeneralPath) shape).curveTo(8.895001, 12.507999, 8.840001, 12.358999, 8.922001, 12.198999);
        ((GeneralPath) shape).curveTo(9.027, 12.014999, 9.332001, 11.839999, 9.840001, 11.679999);
        ((GeneralPath) shape).curveTo(10.453001, 11.492, 11.000001, 11.440999, 11.480001, 11.518999);
        ((GeneralPath) shape).curveTo(11.906001, 11.573999, 12.121001, 11.706999, 12.121001, 11.921999);
        ((GeneralPath) shape).curveTo(13.3480015, 11.038999, 14.133001, 9.772999, 14.480001, 8.120998);
        ((GeneralPath) shape).curveTo(14.934002, 5.7459984, 14.520001, 3.7729983, 13.238002, 2.1989985);
        ((GeneralPath) shape).curveTo(13.293002, 2.2259984, 13.359002, 2.2539985, 13.438002, 2.2809985);
        ((GeneralPath) shape).curveTo(13.121001, 2.0939984, 12.812001, 1.9059985, 12.520001, 1.7219985);
        ((GeneralPath) shape).curveTo(12.254002, 1.8009984, 11.879002, 1.7889985, 11.398002, 1.6799984);
        ((GeneralPath) shape).curveTo(11.000002, 1.5739985, 10.680001, 1.4139984, 10.441002, 1.1989985);
        ((GeneralPath) shape).curveTo(10.227002, 1.0149984, 10.121002, 0.82799846, 10.121002, 0.63999844);
        ((GeneralPath) shape).curveTo(10.723002, 0.8399984, 11.273003, 1.0579984, 11.781002, 1.3009984);
        ((GeneralPath) shape).curveTo(10.754002, 0.77299845, 9.734002, 0.40599847, 8.7230015, 0.19899845);
        ((GeneralPath) shape).curveTo(10.562001, 1.9609984, 11.148002, 4.6399984, 10.480001, 8.237998);
        ((GeneralPath) shape).curveTo(10.160002, 10.237998, 9.293001, 11.733998, 7.8790016, 12.718998);
        ((GeneralPath) shape).curveTo(7.1090016, 12.718998, 6.449002, 12.679998, 5.8980017, 12.600998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(11.441001, 5.7619996);
        ((GeneralPath) shape).curveTo(11.465001, 5.4139996, 11.707001, 5.2149997, 12.160001, 5.16);
        ((GeneralPath) shape).curveTo(12.559001, 5.133, 12.961, 5.226, 13.359001, 5.441);
        ((GeneralPath) shape).curveTo(13.812001, 5.652, 14.078001, 5.933, 14.160001, 6.281);
        ((GeneralPath) shape).curveTo(14.266001, 6.7070003, 13.973001, 6.988, 13.277, 7.1210003);
        ((GeneralPath) shape).curveTo(12.879001, 7.1990004, 12.465, 7.0820003, 12.0390005, 6.762);
        ((GeneralPath) shape).curveTo(11.613001, 6.441, 11.4140005, 6.105, 11.441001, 5.762);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(13.398001, 3.9609995);
        ((GeneralPath) shape).curveTo(13.078001, 4.0119996, 12.641001, 3.9219995, 12.078001, 3.6799996);
        ((GeneralPath) shape).curveTo(11.465001, 3.3869996, 11.148001, 3.0939996, 11.121001, 2.8009996);
        ((GeneralPath) shape).curveTo(11.094002, 2.5079997, 11.281001, 2.3709996, 11.680001, 2.3979998);
        ((GeneralPath) shape).curveTo(12.000001, 2.4529998, 12.375001, 2.5969996, 12.801002, 2.8399997);
        ((GeneralPath) shape).curveTo(13.227001, 3.0819998, 13.508001, 3.2929997, 13.641002, 3.4799995);
        ((GeneralPath) shape).curveTo(13.801002, 3.7189996, 13.719002, 3.8789995, 13.398002, 3.9609995);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(6.3200006, -4.7683716E-7);
        ((GeneralPath) shape).curveTo(4.9610004, 0.10499952, 3.6800005, 0.60099953, 2.4800007, 1.4799995);
        ((GeneralPath) shape).curveTo(3.0940008, 1.0549996, 3.7070007, 0.71899956, 4.3200006, 0.47999954);
        ((GeneralPath) shape).curveTo(4.508001, 0.61299956, 4.4530005, 0.85099953, 4.160001, 1.1989995);
        ((GeneralPath) shape).curveTo(3.945001, 1.4369996, 3.6250007, 1.6129996, 3.1990008, 1.7189995);
        ((GeneralPath) shape).curveTo(2.7730007, 1.8009995, 2.5350008, 1.7579995, 2.480001, 1.5969995);
        ((GeneralPath) shape).lineTo(2.480001, 1.4799995);
        ((GeneralPath) shape).curveTo(0.906001, 2.5739994, 0.07800102, 3.9449995, 9.536743E-7, 5.5969996);
        ((GeneralPath) shape).curveTo(0.078000955, 4.398, 0.57400095, 3.3199997, 1.480001, 2.3589997);
        ((GeneralPath) shape).curveTo(2.094001, 2.4139998, 2.547001, 2.9999998, 2.840001, 4.121);
        ((GeneralPath) shape).curveTo(3.160001, 5.265, 3.160001, 6.5039997, 2.840001, 7.84);
        ((GeneralPath) shape).curveTo(2.5200012, 9.172, 2.0660012, 9.879, 1.4800011, 9.961);
        ((GeneralPath) shape).curveTo(1.3480011, 9.801001, 1.2270011, 9.64, 1.1210011, 9.4800005);
        ((GeneralPath) shape).curveTo(1.2540011, 9.695001, 1.4140011, 9.906, 1.6020012, 10.121);
        ((GeneralPath) shape).curveTo(2.6410012, 11.371, 3.9220011, 12.172001, 5.441001, 12.519);
        ((GeneralPath) shape).lineTo(4.121001, 12.0390005);
        ((GeneralPath) shape).curveTo(5.508001, 11.375001, 6.453001, 10.238001, 6.9610004, 8.64);
        ((GeneralPath) shape).curveTo(7.4650006, 7.0660005, 7.5080004, 5.2260003, 7.0780005, 3.1210003);
        ((GeneralPath) shape).curveTo(6.7620006, 1.6250002, 6.1720004, 0.6520002, 5.3200006, 0.19900036);
        ((GeneralPath) shape).curveTo(5.6680007, 0.12100036, 6.0000005, 0.055000365, 6.3200006, 3.5762787E-7);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.5200005, 9.039);
        ((GeneralPath) shape).curveTo(5.1720004, 9.198999, 4.7730007, 9.148, 4.3200006, 8.879);
        ((GeneralPath) shape).curveTo(3.8670006, 8.613, 3.6680007, 8.332, 3.7190006, 8.039);
        ((GeneralPath) shape).curveTo(3.8010006, 7.6129994, 4.094001, 7.3869996, 4.6020007, 7.3589997);
        ((GeneralPath) shape).curveTo(5.027001, 7.3589997, 5.3980007, 7.4649997, 5.719001, 7.68);
        ((GeneralPath) shape).curveTo(6.012001, 7.8669996, 6.145001, 8.082, 6.121001, 8.32);
        ((GeneralPath) shape).curveTo(6.121001, 8.613, 5.922001, 8.855, 5.520001, 9.039);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4.359, 11.281);
        ((GeneralPath) shape).curveTo(4.1720004, 11.359, 3.867, 11.305, 3.4410002, 11.121);
        ((GeneralPath) shape).curveTo(2.9880002, 10.933001, 2.7340002, 10.707001, 2.6800003, 10.441);
        ((GeneralPath) shape).curveTo(2.6250002, 10.094, 2.6520002, 9.879, 2.7620003, 9.801);
        ((GeneralPath) shape).curveTo(2.8670003, 9.667999, 3.1210003, 9.639999, 3.5200005, 9.719);
        ((GeneralPath) shape).curveTo(4.0270004, 9.773, 4.4140005, 10.0, 4.6800003, 10.398);
        ((GeneralPath) shape).curveTo(4.945, 10.828, 4.84, 11.120999, 4.359, 11.281);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.6410003, 4.558);
        ((GeneralPath) shape).curveTo(5.9610004, 4.668, 6.1600003, 4.84, 6.2380004, 5.0820003);
        ((GeneralPath) shape).curveTo(6.293, 5.347, 6.1600003, 5.625, 5.84, 5.9220004);
        ((GeneralPath) shape).curveTo(5.547, 6.1600003, 5.145, 6.2260003, 4.6410003, 6.1210003);
        ((GeneralPath) shape).curveTo(4.1330004, 5.9880004, 3.8670003, 5.7730002, 3.8400002, 5.4800005);
        ((GeneralPath) shape).curveTo(3.812, 5.0550003, 4.027, 4.7620006, 4.48, 4.6010003);
        ((GeneralPath) shape).curveTo(4.879, 4.4690003, 5.266, 4.453, 5.641, 4.558);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4.3980002, 3.48);
        ((GeneralPath) shape).curveTo(3.8950002, 3.5310001, 3.5860002, 3.426, 3.4800003, 3.16);
        ((GeneralPath) shape).curveTo(3.3480003, 2.785, 3.4920003, 2.453, 3.9220002, 2.16);
        ((GeneralPath) shape).curveTo(4.2660003, 1.922, 4.625, 1.8010001, 5.0, 1.8010001);
        ((GeneralPath) shape).curveTo(5.348, 1.8010001, 5.574, 1.9060001, 5.68, 2.121);
        ((GeneralPath) shape).curveTo(5.812, 2.332, 5.7619996, 2.6130002, 5.52, 2.961);
        ((GeneralPath) shape).curveTo(5.305, 3.281, 4.934, 3.453, 4.398, 3.48);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(4.838399887084961, -7.772500038146973), 12.381f, new Point2D.Double(4.838399887084961, -7.772500038146973), new float[]{0, 0.1451f, 0.3686f, 0.6431f, 0.9529f, 1}, new Color[]{new Color(0xFFD1E4), new Color(0xF9C9DD), new Color(0xE7B4C9), new Color(0xCA91A9), new Color(0xA2617C), new Color(0x9C5975)}, NO_CYCLE, SRGB, new AffineTransform(0.17688f, -0.78024f, 0.8836f, 0.20032f, 12.931f, 15.692f)));
        g.fill(shape);

        // _0_0_0_2

        // _0_0_0_2_0

        // _0_0_0_2_0_0

        // _0_0_0_2_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.641, 8.922);
        ((GeneralPath) shape).curveTo(13.453, 8.492, 13.094, 8.281, 12.559, 8.281);
        ((GeneralPath) shape).curveTo(11.441, 8.281, 10.84, 8.719, 10.762, 9.601);
        ((GeneralPath) shape).curveTo(10.707, 10.0, 11.027, 10.226, 11.719, 10.281);
        ((GeneralPath) shape).curveTo(12.332, 10.332, 12.773, 10.281, 13.039, 10.121);
        ((GeneralPath) shape).curveTo(13.651999, 9.773001, 13.851999, 9.375, 13.641, 8.922);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.5199995, 9.039);
        ((GeneralPath) shape).curveTo(5.9219995, 8.855, 6.1209993, 8.613, 6.1209993, 8.32);
        ((GeneralPath) shape).curveTo(6.1449995, 8.082, 6.011999, 7.8669996, 5.7189994, 7.68);
        ((GeneralPath) shape).curveTo(5.3979993, 7.4649997, 5.0269995, 7.3589997, 4.6019993, 7.3589997);
        ((GeneralPath) shape).curveTo(4.0939994, 7.3869996, 3.8009992, 7.613, 3.7189994, 8.039);
        ((GeneralPath) shape).curveTo(3.6679993, 8.332, 3.8669994, 8.613, 4.319999, 8.879);
        ((GeneralPath) shape).curveTo(4.7729993, 9.148, 5.171999, 9.198999, 5.5199995, 9.039);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(3.950200080871582, -8.091300010681152), 12.639f, new Point2D.Double(3.950200080871582, -8.091300010681152), new float[]{0, 0.1451f, 0.3686f, 0.6431f, 0.9529f, 1}, new Color[]{new Color(0xFFFAD1), new Color(0xF9F3C9), new Color(0xE7E1B4), new Color(0xCAC491), new Color(0xA29B61), new Color(0x9C9459)}, NO_CYCLE, SRGB, new AffineTransform(0.13752f, -0.78808f, 0.92568f, 0.1616f, 13.867f, 15.18f)));
        g.fill(shape);

        // _0_0_0_3

        // _0_0_0_3_0

        // _0_0_0_3_0_0

        // _0_0_0_3_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.719, 12.558);
        ((GeneralPath) shape).lineTo(9.801, 12.539);
        ((GeneralPath) shape).curveTo(9.983999, 12.504, 10.172, 12.464999, 10.358999, 12.422);
        ((GeneralPath) shape).curveTo(10.401999, 12.418, 10.440999, 12.41, 10.48, 12.398);
        ((GeneralPath) shape).curveTo(11.039, 12.293, 11.5859995, 12.148, 12.120999, 11.9609995);
        ((GeneralPath) shape).lineTo(12.120999, 11.922);
        ((GeneralPath) shape).curveTo(12.120999, 11.707, 11.905999, 11.574, 11.48, 11.519);
        ((GeneralPath) shape).curveTo(11.0, 11.441, 10.452999, 11.492, 9.839999, 11.68);
        ((GeneralPath) shape).curveTo(9.331999, 11.84, 9.026999, 12.015, 8.921999, 12.199);
        ((GeneralPath) shape).curveTo(8.839999, 12.359, 8.894999, 12.508, 9.077999, 12.64);
        ((GeneralPath) shape).curveTo(9.289, 12.617001, 9.503999, 12.59, 9.718999, 12.558001);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(13.398, 3.9609995);
        ((GeneralPath) shape).curveTo(13.719, 3.8789995, 13.801, 3.7189994, 13.641, 3.4799995);
        ((GeneralPath) shape).curveTo(13.507999, 3.2929995, 13.227, 3.0819995, 12.801, 2.8399997);
        ((GeneralPath) shape).curveTo(12.375, 2.5969996, 12.0, 2.4529996, 11.679999, 2.3979998);
        ((GeneralPath) shape).curveTo(11.280999, 2.3709998, 11.093999, 2.5079997, 11.120999, 2.8009996);
        ((GeneralPath) shape).curveTo(11.148, 3.0939996, 11.468999, 3.3869996, 12.077999, 3.6799996);
        ((GeneralPath) shape).curveTo(12.640999, 3.9219997, 13.077999, 4.0119996, 13.397999, 3.9609995);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(11.441, 5.7619996);
        ((GeneralPath) shape).curveTo(11.414, 6.1049995, 11.613, 6.4409995, 12.039, 6.7619996);
        ((GeneralPath) shape).curveTo(12.464999, 7.0779996, 12.879, 7.1989994, 13.280999, 7.121);
        ((GeneralPath) shape).curveTo(13.973, 6.9839997, 14.265999, 6.707, 14.159999, 6.2809997);
        ((GeneralPath) shape).curveTo(14.077999, 5.9329996, 13.811999, 5.6519995, 13.358999, 5.437);
        ((GeneralPath) shape).curveTo(12.9609995, 5.226, 12.561999, 5.133, 12.159999, 5.16);
        ((GeneralPath) shape).curveTo(11.706999, 5.211, 11.464999, 5.414, 11.440999, 5.762);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4.359, 11.281);
        ((GeneralPath) shape).curveTo(4.84, 11.121, 4.945, 10.828, 4.6800003, 10.398);
        ((GeneralPath) shape).curveTo(4.4140005, 10.0, 4.0270004, 9.773, 3.5200005, 9.719);
        ((GeneralPath) shape).curveTo(3.1210005, 9.639999, 2.8670006, 9.668, 2.7620006, 9.801);
        ((GeneralPath) shape).curveTo(2.6520007, 9.879, 2.6250005, 10.094, 2.6800005, 10.441);
        ((GeneralPath) shape).curveTo(2.7340004, 10.707, 2.9880006, 10.933, 3.4410005, 11.121);
        ((GeneralPath) shape).curveTo(3.8670006, 11.305, 4.1720004, 11.359, 4.359, 11.281);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(11.781, 1.3010006);
        ((GeneralPath) shape).curveTo(11.273, 1.0580006, 10.723001, 0.8400006, 10.121, 0.6400006);
        ((GeneralPath) shape).curveTo(10.121, 0.82800055, 10.227, 1.0120006, 10.441, 1.1990006);
        ((GeneralPath) shape).curveTo(10.68, 1.4140006, 11.0, 1.5740006, 11.398, 1.6800005);
        ((GeneralPath) shape).curveTo(11.879, 1.7850006, 12.254, 1.8010006, 12.5199995, 1.7190006);
        ((GeneralPath) shape).lineTo(12.280999, 1.5580006);
        ((GeneralPath) shape).lineTo(11.780999, 1.3010006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(3.948699951171875, -8.09179973602295), 12.651f, new Point2D.Double(3.948699951171875, -8.09179973602295), new float[]{0, 0.1451f, 0.3686f, 0.6431f, 0.9529f, 1}, new Color[]{new Color(0xFFFAD1), new Color(0xF9F3C9), new Color(0xE7E1B4), new Color(0xCAC491), new Color(0xA29B61), new Color(0x9C9459)}, NO_CYCLE, SRGB, new AffineTransform(0.13744f, -0.78808f, 0.9256f, 0.16136f, 13.867f, 15.178f)));
        g.fill(shape);

        // _0_0_0_4

        // _0_0_0_4_0

        // _0_0_0_4_0_0

        // _0_0_0_4_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.898, 12.601);
        ((GeneralPath) shape).curveTo(6.449, 12.68, 7.1089997, 12.719, 7.8789997, 12.719);
        ((GeneralPath) shape).curveTo(9.292999, 11.734, 10.16, 10.238, 10.48, 8.238);
        ((GeneralPath) shape).curveTo(11.148, 4.64, 10.561999, 1.961, 8.723, 0.19900036);
        ((GeneralPath) shape).curveTo(8.5859995, 0.17200036, 8.452999, 0.14800036, 8.32, 0.12100036);
        ((GeneralPath) shape).lineTo(7.68, 0.039000355);
        ((GeneralPath) shape).curveTo(7.4649997, 0.0150003545, 7.266, 3.5390258E-7, 7.078, 3.5390258E-7);
        ((GeneralPath) shape).lineTo(6.32, 3.5390258E-7);
        ((GeneralPath) shape).curveTo(6.0, 0.055000354, 5.668, 0.12100035, 5.32, 0.19900036);
        ((GeneralPath) shape).curveTo(6.172, 0.65200037, 6.762, 1.6250004, 7.078, 3.1210003);
        ((GeneralPath) shape).curveTo(7.508, 5.2260003, 7.465, 7.066, 6.961, 8.64);
        ((GeneralPath) shape).curveTo(6.453, 10.238001, 5.508, 11.375, 4.1210003, 12.0390005);
        ((GeneralPath) shape).lineTo(5.4410005, 12.519);
        ((GeneralPath) shape).lineTo(5.8980002, 12.601);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(5.176300048828125, -8.387700080871582), 12.978f, new Point2D.Double(5.176300048828125, -8.387700080871582), new float[]{0, 0.2275f, 0.3333f, 0.498f, 0.698f, 0.9255f, 1}, new Color[]{new Color(0xE6FFF8), new Color(0xBAFFED), new Color(0xB2F7E5), new Color(0x9EE2D0), new Color(0x7BBFAD), new Color(0x4C8F7E), new Color(0x3B7D6C)}, NO_CYCLE, SRGB, new AffineTransform(0.20944f, -0.77208f, 0.8444f, 0.22904f, 13.559f, 16.437f)));
        g.fill(shape);

        // _0_0_0_5

        // _0_0_0_5_0

        // _0_0_0_5_0_0

        // _0_0_0_5_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.641, 4.558);
        ((GeneralPath) shape).curveTo(5.266, 4.453, 4.8789997, 4.469, 4.4799995, 4.6010003);
        ((GeneralPath) shape).curveTo(4.0269995, 4.762, 3.8119996, 5.0550003, 3.8399997, 5.4800005);
        ((GeneralPath) shape).curveTo(3.8669996, 5.7730007, 4.133, 5.9880004, 4.641, 6.1210003);
        ((GeneralPath) shape).curveTo(5.145, 6.2260003, 5.547, 6.1600003, 5.8399997, 5.9220004);
        ((GeneralPath) shape).curveTo(6.16, 5.6250005, 6.2929997, 5.3470006, 6.238, 5.0820003);
        ((GeneralPath) shape).curveTo(6.16, 4.84, 5.961, 4.668, 5.641, 4.558);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(3.2920000553131104, -8.683099746704102), 12.859f, new Point2D.Double(3.2920000553131104, -8.683099746704102), new float[]{0, 0.1451f, 0.3686f, 0.6431f, 0.9529f, 1}, new Color[]{new Color(0xFFFAD1), new Color(0xF9F3C9), new Color(0xE7E1B4), new Color(0xCAC491), new Color(0xA29B61), new Color(0x9C9459)}, NO_CYCLE, SRGB, new AffineTransform(0.05832f, -0.79784f, 0.79784f, 0.05832f, 13.856f, 13.773f)));
        g.fill(shape);

        // _0_0_0_6

        // _0_0_0_6_0

        // _0_0_0_6_0_0

        // _0_0_0_6_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.398, 3.48);
        ((GeneralPath) shape).curveTo(4.934, 3.453, 5.305, 3.2810001, 5.5199995, 2.961);
        ((GeneralPath) shape).curveTo(5.7619996, 2.613, 5.8119993, 2.336, 5.6799994, 2.121);
        ((GeneralPath) shape).curveTo(5.5739994, 1.906, 5.3479996, 1.8010001, 4.9999995, 1.8010001);
        ((GeneralPath) shape).curveTo(4.6249995, 1.8010001, 4.2659993, 1.9220002, 3.9219995, 2.16);
        ((GeneralPath) shape).curveTo(3.4919994, 2.453, 3.3479996, 2.785, 3.4799995, 3.16);
        ((GeneralPath) shape).curveTo(3.5859995, 3.426, 3.8949995, 3.535, 4.398, 3.48);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(2.3203001022338867, -9.034199714660645), 13.026f, new Point2D.Double(2.3203001022338867, -9.034199714660645), new float[]{0, 0.1451f, 0.3686f, 0.6431f, 0.9529f, 1}, new Color[]{new Color(0xFFFAD1), new Color(0xF9F3C9), new Color(0xE7E1B4), new Color(0xCAC491), new Color(0xA29B61), new Color(0x9C9459)}, NO_CYCLE, SRGB, new AffineTransform(-0.01152f, -0.79992f, 0.79992f, -0.01152f, 14.454f, 12.552f)));
        g.fill(shape);

        // _0_0_0_7

        // _0_0_0_7_0

        // _0_0_0_7_0_0

        // _0_0_0_7_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.48, 1.48);
        ((GeneralPath) shape).lineTo(2.48, 1.6010001);
        ((GeneralPath) shape).curveTo(2.5310001, 1.7620001, 2.773, 1.8010001, 3.199, 1.7190001);
        ((GeneralPath) shape).curveTo(3.625, 1.6130002, 3.945, 1.4410001, 4.16, 1.1990001);
        ((GeneralPath) shape).curveTo(4.453, 0.85100013, 4.508, 0.6130001, 4.3199997, 0.48000014);
        ((GeneralPath) shape).curveTo(3.7069998, 0.7190001, 3.0939999, 1.0550001, 2.4799995, 1.4800001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(2.649399995803833, -8.899900436401367), 12.55f, new Point2D.Double(2.649399995803833, -8.899900436401367), new float[]{0, 0.1451f, 0.3686f, 0.6431f, 0.9529f, 1}, new Color[]{new Color(0xFFFAD1), new Color(0xF9F3C9), new Color(0xE7E1B4), new Color(0xCAC491), new Color(0xA29B61), new Color(0x9C9459)}, NO_CYCLE, SRGB, new AffineTransform(3.1873E-5f, -0.8f, 0.8f, -3.1873E-5f, 14.24f, 12.759f)));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

