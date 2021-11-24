package com.pump.awt.geom.outline.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/208866/artifact-mysterious-cube
 * </p>
 */
public class MysteriousCube implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public MysteriousCube() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public MysteriousCube(int width, int height) {
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
        g.transform(new AffineTransform(0.020519555f, 0, 0, 0.020519555f, 0, 0.062933505f));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, 0, 42.6f));

        // _0_0

        // _0_0_0

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.535, 33.56);
        ((GeneralPath) shape).lineTo(15.293, 33.760002);
        ((GeneralPath) shape).curveTo(15.828, 33.893, 16.441, 33.893, 17.133, 33.760002);
        ((GeneralPath) shape).curveTo(30.440998, 32.615, 37.32, 31.920002, 37.773, 31.682003);
        ((GeneralPath) shape).curveTo(38.226997, 31.412003, 38.508, 31.025003, 38.613, 30.521004);
        ((GeneralPath) shape).lineTo(38.573997, 8.959003);
        ((GeneralPath) shape).curveTo(38.573997, 8.560003, 38.413998, 8.146004, 38.093998, 7.7210035);
        ((GeneralPath) shape).lineTo(37.573997, 7.2010036);
        ((GeneralPath) shape).curveTo(35.706997, 6.1070037, 33.773, 5.0140038, 31.772997, 3.9200037);
        ((GeneralPath) shape).curveTo(27.823997, 1.7050037, 25.612997, 0.53300357, 25.132998, 0.40000367);
        ((GeneralPath) shape).curveTo(24.651997, 0.26800367, 24.065998, 0.24000368, 23.374998, 0.31800365);
        ((GeneralPath) shape).lineTo(22.491999, 0.52100366);
        ((GeneralPath) shape).curveTo(19.054998, 1.1070037, 15.601999, 1.7050037, 12.132998, 2.3180037);
        ((GeneralPath) shape).curveTo(5.1719985, 3.5450037, 1.5859985, 4.2400036, 1.3749981, 4.4000034);
        ((GeneralPath) shape).curveTo(1.187998, 4.5600033, 0.9999981, 4.9200034, 0.81199807, 5.4780035);
        ((GeneralPath) shape).curveTo(0.73399806, 5.7480035, 0.6679981, 5.9980035, 0.61299807, 6.2400036);
        ((GeneralPath) shape).curveTo(0.39799806, 19.975002, 0.30899808, 26.986004, 0.33199808, 27.279003);
        ((GeneralPath) shape).curveTo(0.33199808, 27.654003, 0.3749981, 27.908003, 0.45299807, 28.041002);
        ((GeneralPath) shape).curveTo(0.53499806, 28.146002, 0.7579981, 28.307003, 1.1329981, 28.521002);
        ((GeneralPath) shape).lineTo(14.534999, 33.56);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x766434));
        g.fill(shape);

        // _0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.613, 1.439);
        ((GeneralPath) shape).lineTo(26.574001, 1.08);
        ((GeneralPath) shape).curveTo(25.691002, 0.65400004, 25.215002, 0.42800003, 25.133001, 0.40000004);
        ((GeneralPath) shape).curveTo(24.652, 0.26800004, 24.066002, 0.24000004, 23.375002, 0.31800002);
        ((GeneralPath) shape).lineTo(22.492002, 0.521);
        ((GeneralPath) shape).curveTo(17.000002, 1.455, 12.188003, 2.295, 8.055002, 3.041);
        ((GeneralPath) shape).lineTo(8.734002, 2.9589999);
        ((GeneralPath) shape).curveTo(10.8670025, 2.666, 12.121002, 2.4669998, 12.4920025, 2.3609998);
        ((GeneralPath) shape).curveTo(13.078003, 2.2789998, 16.453003, 1.9749998, 22.613003, 1.4389999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6A5A2F));
        g.fill(shape);

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.375, 24.318);
        ((GeneralPath) shape).lineTo(0.332, 25.6);
        ((GeneralPath) shape).curveTo(4.469, 25.732, 8.188, 25.732, 11.492, 25.6);
        ((GeneralPath) shape).curveTo(14.054999, 25.467001, 17.84, 25.185, 22.852, 24.76);
        ((GeneralPath) shape).lineTo(26.895, 24.4);
        ((GeneralPath) shape).lineTo(26.895, 23.720999);
        ((GeneralPath) shape).curveTo(19.641, 24.467, 14.922001, 24.814, 12.734, 24.759998);
        ((GeneralPath) shape).curveTo(11.934, 24.731998, 9.867001, 24.626999, 6.5350003, 24.439);
        ((GeneralPath) shape).curveTo(4.1880007, 24.307, 2.1330004, 24.268, 0.37500048, 24.317999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.453, 3.721);
        ((GeneralPath) shape).curveTo(2.641, 4.064, 1.6130002, 4.295, 1.375, 4.4);
        ((GeneralPath) shape).curveTo(3.293, 4.291, 6.121, 4.252, 9.852, 4.2790003);
        ((GeneralPath) shape).curveTo(12.918, 4.334, 16.812, 4.1460004, 21.535, 3.7210002);
        ((GeneralPath) shape).lineTo(26.895, 3.2400002);
        ((GeneralPath) shape).lineTo(26.895, 1.9980003);
        ((GeneralPath) shape).lineTo(13.012, 3.1580002);
        ((GeneralPath) shape).curveTo(11.359, 3.3180003, 8.507999, 3.5060003, 4.453, 3.7210002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.254, 33.76);
        ((GeneralPath) shape).lineTo(26.895, 32.720997);
        ((GeneralPath) shape).lineTo(26.895, 31.841997);
        ((GeneralPath) shape).lineTo(12.973001, 32.958996);
        ((GeneralPath) shape).lineTo(14.535001, 33.559998);
        ((GeneralPath) shape).lineTo(15.254001, 33.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.453, 27.92);
        ((GeneralPath) shape).curveTo(18.879, 27.627, 22.746, 27.307, 26.055, 26.959);
        ((GeneralPath) shape).lineTo(26.895, 26.881);
        ((GeneralPath) shape).lineTo(26.895, 25.521);
        ((GeneralPath) shape).lineTo(0.33200073, 27.4);
        ((GeneralPath) shape).curveTo(0.33200073, 27.692999, 0.38700074, 27.92, 0.49200073, 28.08);
        ((GeneralPath) shape).curveTo(0.5740007, 28.185, 0.78500074, 28.334, 1.1330007, 28.521);
        ((GeneralPath) shape).lineTo(1.6130008, 28.721);
        ((GeneralPath) shape).curveTo(9.160001, 28.268002, 13.441001, 27.998001, 14.453001, 27.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.613, 6.478);
        ((GeneralPath) shape).lineTo(0.613, 7.439);
        ((GeneralPath) shape).curveTo(2.215, 7.389, 4.3320003, 7.4, 6.973, 7.478);
        ((GeneralPath) shape).curveTo(9.961, 7.533, 12.68, 7.545, 15.132999, 7.5210004);
        ((GeneralPath) shape).curveTo(17.081999, 7.4940004, 19.265999, 7.5210004, 21.691, 7.6000004);
        ((GeneralPath) shape).curveTo(22.547, 7.6000004, 24.281, 7.5060005, 26.895, 7.3180003);
        ((GeneralPath) shape).lineTo(26.895, 6.478);
        ((GeneralPath) shape).curveTo(21.988, 6.853, 16.027, 6.893, 9.012001, 6.6000004);
        ((GeneralPath) shape).curveTo(6.906001, 6.5210004, 4.105001, 6.478, 0.61300087, 6.478);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.492, 14.158);
        ((GeneralPath) shape).lineTo(0.492, 15.318);
        ((GeneralPath) shape).lineTo(6.895, 14.721);
        ((GeneralPath) shape).curveTo(10.973, 14.346, 14.492001, 13.92, 17.453, 13.439);
        ((GeneralPath) shape).curveTo(20.894999, 12.853, 24.039, 12.412001, 26.895, 12.119);
        ((GeneralPath) shape).lineTo(26.895, 11.361);
        ((GeneralPath) shape).lineTo(19.934, 12.08);
        ((GeneralPath) shape).curveTo(14.066, 12.826, 9.895, 13.307, 7.4139996, 13.521);
        ((GeneralPath) shape).lineTo(0.49199963, 14.158);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.895, 21.721);
        ((GeneralPath) shape).lineTo(24.453001, 21.842001);
        ((GeneralPath) shape).curveTo(22.453001, 21.893002, 20.387001, 21.842001, 18.254002, 21.682001);
        ((GeneralPath) shape).lineTo(15.652001, 21.439001);
        ((GeneralPath) shape).lineTo(18.574001, 21.041);
        ((GeneralPath) shape).curveTo(21.133001, 20.693, 23.906002, 20.361, 26.891003, 20.041);
        ((GeneralPath) shape).lineTo(26.891003, 19.119);
        ((GeneralPath) shape).lineTo(26.574003, 19.119);
        ((GeneralPath) shape).curveTo(19.000004, 20.025, 14.215003, 20.705, 12.215003, 21.157999);
        ((GeneralPath) shape).lineTo(10.094003, 21.639);
        ((GeneralPath) shape).lineTo(14.293003, 22.279);
        ((GeneralPath) shape).curveTo(18.055004, 22.654, 22.254004, 22.731998, 26.895004, 22.521);
        ((GeneralPath) shape).lineTo(26.895004, 21.721);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.293, 21.4);
        ((GeneralPath) shape).lineTo(0.41399997, 21.56);
        ((GeneralPath) shape).lineTo(0.37499997, 22.880999);
        ((GeneralPath) shape).curveTo(1.867, 22.56, 4.145, 21.998, 7.215, 21.200998);
        ((GeneralPath) shape).curveTo(10.492001, 20.427998, 14.199, 19.731998, 18.332, 19.118998);
        ((GeneralPath) shape).curveTo(19.027, 19.040998, 21.879002, 18.626997, 26.895, 17.880997);
        ((GeneralPath) shape).lineTo(26.895, 17.118998);
        ((GeneralPath) shape).curveTo(16.254002, 18.638998, 7.719, 20.063997, 1.2930012, 21.399998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.691, 16.478);
        ((GeneralPath) shape).lineTo(0.45300007, 17.400002);
        ((GeneralPath) shape).lineTo(0.41400006, 19.760002);
        ((GeneralPath) shape).lineTo(2.094, 19.400002);
        ((GeneralPath) shape).curveTo(4.414, 18.893002, 6.281, 18.334002, 7.691, 17.721);
        ((GeneralPath) shape).curveTo(9.453, 17.185001, 13.441, 16.639, 19.652, 16.08);
        ((GeneralPath) shape).curveTo(22.613, 15.814, 25.027, 15.559999, 26.895, 15.318);
        ((GeneralPath) shape).lineTo(26.895, 14.041);
        ((GeneralPath) shape).curveTo(19.32, 14.76, 14.602, 15.213, 12.734, 15.400001);
        ((GeneralPath) shape).curveTo(10.469, 15.56, 8.785, 15.693001, 7.691, 15.799001);
        ((GeneralPath) shape).curveTo(5.801, 15.986001, 4.469, 16.213001, 3.691, 16.478);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.895, 30.799);
        ((GeneralPath) shape).lineTo(26.895, 29.998);
        ((GeneralPath) shape).curveTo(17.801, 30.532999, 11.535001, 30.907999, 8.094, 31.119);
        ((GeneralPath) shape).lineTo(9.773, 31.76);
        ((GeneralPath) shape).curveTo(17.852001, 31.385, 23.559, 31.064001, 26.895, 30.799);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.574, 9.041);
        ((GeneralPath) shape).lineTo(0.574, 10.400001);
        ((GeneralPath) shape).lineTo(4.7339997, 10.357);
        ((GeneralPath) shape).curveTo(9.879, 10.279, 13.586, 10.185, 15.851999, 10.08);
        ((GeneralPath) shape).curveTo(18.441, 9.947, 22.120998, 9.6779995, 26.895, 9.279);
        ((GeneralPath) shape).lineTo(26.895, 8.56);
        ((GeneralPath) shape).lineTo(19.414001, 9.201);
        ((GeneralPath) shape).curveTo(17.066002, 9.412001, 14.000002, 9.428, 10.215001, 9.24);
        ((GeneralPath) shape).curveTo(5.895001, 9.025, 2.6800013, 8.959, 0.5740013, 9.040999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.375, 15.6);
        ((GeneralPath) shape).lineTo(26.691, 14.478001);
        ((GeneralPath) shape).curveTo(25.812, 14.373001, 24.691, 14.455001, 23.332, 14.721001);
        ((GeneralPath) shape).curveTo(21.68, 14.986001, 20.453001, 15.158001, 19.652, 15.240001);
        ((GeneralPath) shape).curveTo(19.277, 15.400001, 18.984001, 15.5060005, 18.773, 15.56);
        ((GeneralPath) shape).curveTo(18.531, 15.639001, 18.266, 15.654, 17.973001, 15.6);
        ((GeneralPath) shape).curveTo(18.000002, 15.467, 18.012001, 15.385, 18.012001, 15.357);
        ((GeneralPath) shape).curveTo(18.012001, 15.334001, 17.945002, 15.334001, 17.812, 15.357);
        ((GeneralPath) shape).lineTo(15.973001, 15.842);
        ((GeneralPath) shape).curveTo(15.598001, 15.998, 15.387, 16.092, 15.332001, 16.119);
        ((GeneralPath) shape).curveTo(17.094, 15.959, 18.0, 15.881, 18.051, 15.881);
        ((GeneralPath) shape).curveTo(19.094, 15.693, 20.211, 15.599999, 21.414001, 15.599999);
        ((GeneralPath) shape).lineTo(24.375002, 15.599999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5C4F2D));
        g.fill(shape);

        // _0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.574, 17.4);
        ((GeneralPath) shape).curveTo(3.7459998, 17.4, 3.027, 17.477999, 2.4139998, 17.639);
        ((GeneralPath) shape).curveTo(2.281, 17.666, 1.6249998, 17.907999, 0.45299983, 18.361);
        ((GeneralPath) shape).lineTo(0.41399983, 19.318);
        ((GeneralPath) shape).curveTo(0.5739998, 19.295, 1.0389998, 19.146, 1.8119998, 18.881);
        ((GeneralPath) shape).curveTo(2.1599998, 18.748001, 2.6679997, 18.545, 3.3319998, 18.279001);
        ((GeneralPath) shape).curveTo(3.6799998, 18.174002, 3.9179997, 18.080002, 4.055, 17.998001);
        ((GeneralPath) shape).curveTo(4.586, 17.705002, 4.988, 17.549002, 5.2539997, 17.521002);
        ((GeneralPath) shape).lineTo(5.9729996, 17.439001);
        ((GeneralPath) shape).curveTo(5.8669996, 17.412, 5.398, 17.400002, 4.5739994, 17.400002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.094, 22.361);
        ((GeneralPath) shape).curveTo(15.469, 22.439, 16.199, 22.478, 17.293, 22.478);
        ((GeneralPath) shape).lineTo(24.215, 22.6);
        ((GeneralPath) shape).curveTo(21.574, 22.361, 19.586, 22.185, 18.254, 22.08);
        ((GeneralPath) shape).curveTo(16.152, 21.912, 14.312, 21.818, 12.733999, 21.799);
        ((GeneralPath) shape).curveTo(13.030999, 21.822, 13.351999, 21.873, 13.690999, 21.959);
        ((GeneralPath) shape).curveTo(14.011999, 22.041, 14.479999, 22.174, 15.093999, 22.361);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.414, 20.998);
        ((GeneralPath) shape).curveTo(18.055, 20.842, 19.0, 20.665998, 20.254, 20.477999);
        ((GeneralPath) shape).curveTo(21.508, 20.213, 22.652, 20.079998, 23.691, 20.079998);
        ((GeneralPath) shape).lineTo(26.215, 19.798998);
        ((GeneralPath) shape).curveTo(23.199, 19.798998, 20.746, 19.974998, 18.852001, 20.317997);
        ((GeneralPath) shape).lineTo(16.852001, 20.720997);
        ((GeneralPath) shape).curveTo(16.215002, 21.067997, 15.707001, 21.278997, 15.332001, 21.360996);
        ((GeneralPath) shape).curveTo(16.027, 21.333996, 16.719, 21.212996, 17.414001, 20.997995);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.613, 13.799);
        ((GeneralPath) shape).curveTo(9.8949995, 13.799, 8.867, 13.853, 7.535, 13.959);
        ((GeneralPath) shape).curveTo(6.387, 14.200999, 5.535, 14.334, 4.9729996, 14.356999);
        ((GeneralPath) shape).curveTo(5.5079994, 14.356999, 6.3199997, 14.306999, 7.4139996, 14.200999);
        ((GeneralPath) shape).curveTo(8.48, 14.091999, 9.280999, 14.0529995, 9.811999, 14.079999);
        ((GeneralPath) shape).lineTo(10.612999, 13.798999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.934, 9.842);
        ((GeneralPath) shape).curveTo(6.332, 9.842, 6.918, 9.826, 7.691, 9.799);
        ((GeneralPath) shape).lineTo(14.215, 9.278999);
        ((GeneralPath) shape).curveTo(10.266001, 9.278999, 7.492, 9.372999, 5.8950005, 9.559999);
        ((GeneralPath) shape).curveTo(5.0120006, 9.587999, 4.4410005, 9.665999, 4.1720004, 9.799);
        ((GeneralPath) shape).curveTo(4.6250005, 9.853, 5.215, 9.865, 5.9340005, 9.842);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.215, 9.682);
        ((GeneralPath) shape).lineTo(26.492, 8.8810005);
        ((GeneralPath) shape).curveTo(24.336, 9.092001, 22.773, 9.279, 21.812, 9.439);
        ((GeneralPath) shape).curveTo(21.895, 9.494, 22.266, 9.521, 22.934, 9.521);
        ((GeneralPath) shape).curveTo(23.227, 9.545, 23.652, 9.6, 24.215, 9.682);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2.973, 6.76);
        ((GeneralPath) shape).lineTo(2.535, 6.76);
        ((GeneralPath) shape).curveTo(2.375, 6.814, 2.332, 6.932, 2.414, 7.1190004);
        ((GeneralPath) shape).curveTo(3.426, 7.2520003, 4.719, 7.2950006, 6.293, 7.2400002);
        ((GeneralPath) shape).curveTo(7.1720004, 7.2400002, 8.4800005, 7.2130003, 10.215, 7.1580005);
        ((GeneralPath) shape).lineTo(9.012, 6.76);
        ((GeneralPath) shape).curveTo(7.6800003, 6.7320004, 6.6800003, 6.7050004, 6.012, 6.6780005);
        ((GeneralPath) shape).curveTo(4.7580004, 6.6540003, 3.746, 6.6820006, 2.973, 6.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.172, 3.682);
        ((GeneralPath) shape).lineTo(24.891, 1.9589999);
        ((GeneralPath) shape).curveTo(20.387001, 2.467, 16.441002, 3.08, 13.051001, 3.7989998);
        ((GeneralPath) shape).curveTo(13.988001, 3.7709997, 15.359001, 3.7319999, 17.172, 3.6819997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.094, 7.721);
        ((GeneralPath) shape).lineTo(37.574, 7.201);
        ((GeneralPath) shape).curveTo(35.707, 6.1070004, 33.773003, 5.014, 31.773, 3.9200003);
        ((GeneralPath) shape).curveTo(27.824001, 1.7050004, 25.613, 0.53300023, 25.133001, 0.40000033);
        ((GeneralPath) shape).curveTo(24.812002, 0.31800032, 24.508001, 0.27900034, 24.215002, 0.27900034);
        ((GeneralPath) shape).curveTo(24.348001, 0.73200035, 24.359001, 1.5450003, 24.254002, 2.7210002);
        ((GeneralPath) shape).lineTo(24.254002, 25.279001);
        ((GeneralPath) shape).lineTo(24.973001, 25.920002);
        ((GeneralPath) shape).lineTo(38.094, 31.400002);
        ((GeneralPath) shape).curveTo(38.359, 31.135002, 38.535004, 30.842001, 38.613003, 30.521002);
        ((GeneralPath) shape).lineTo(38.574, 8.959002);
        ((GeneralPath) shape).curveTo(38.574, 8.560001, 38.414, 8.146002, 38.094, 7.7210016);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x554825));
        g.fill(shape);

        // _0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.895, 28.92);
        ((GeneralPath) shape).lineTo(35.895, 28.881);
        ((GeneralPath) shape).lineTo(35.414, 28.721);
        ((GeneralPath) shape).lineTo(35.414, 29.361);
        ((GeneralPath) shape).lineTo(36.012, 29.56);
        ((GeneralPath) shape).curveTo(35.906002, 29.295, 35.867, 29.08, 35.895, 28.92);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4E4222));
        g.fill(shape);

        // _0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.293, 26.521);
        ((GeneralPath) shape).curveTo(28.133, 26.572, 27.745998, 26.6, 27.133, 26.6);
        ((GeneralPath) shape).lineTo(26.691, 26.56);
        ((GeneralPath) shape).lineTo(27.934, 27.119);
        ((GeneralPath) shape).curveTo(28.066, 27.067999, 28.281, 27.08, 28.574, 27.157999);
        ((GeneralPath) shape).curveTo(29.585999, 27.294998, 31.055, 27.654, 32.973, 28.24);
        ((GeneralPath) shape).lineTo(29.293, 27.682);
        ((GeneralPath) shape).lineTo(29.772999, 27.880999);
        ((GeneralPath) shape).curveTo(32.413998, 28.494, 34.105, 28.919998, 34.851997, 29.157999);
        ((GeneralPath) shape).curveTo(34.961, 29.106998, 34.999996, 28.998, 34.972996, 28.842);
        ((GeneralPath) shape).curveTo(34.972996, 28.786999, 34.921997, 28.705, 34.811996, 28.599998);
        ((GeneralPath) shape).curveTo(34.761997, 28.520998, 34.718998, 28.467, 34.690998, 28.439);
        ((GeneralPath) shape).curveTo(33.440998, 28.064, 32.535, 27.786999, 31.972998, 27.599998);
        ((GeneralPath) shape).curveTo(30.987997, 27.307, 29.933998, 26.919998, 28.811998, 26.439);
        ((GeneralPath) shape).lineTo(28.573997, 26.361);
        ((GeneralPath) shape).curveTo(28.464998, 26.467001, 28.374998, 26.521, 28.292997, 26.521);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.773, 19.92);
        ((GeneralPath) shape).curveTo(26.293001, 19.732, 25.535, 19.6, 24.492, 19.521);
        ((GeneralPath) shape).lineTo(24.492, 20.279);
        ((GeneralPath) shape).curveTo(26.492, 20.786999, 27.891, 21.24, 28.691, 21.639);
        ((GeneralPath) shape).curveTo(29.734, 22.092, 33.039, 23.693, 38.613, 26.439);
        ((GeneralPath) shape).lineTo(38.613, 25.24);
        ((GeneralPath) shape).curveTo(32.398, 22.307, 28.453, 20.533, 26.772999, 19.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.055, 27.201);
        ((GeneralPath) shape).lineTo(37.773, 28.478);
        ((GeneralPath) shape).curveTo(37.746, 28.318, 37.641, 28.174, 37.453, 28.041);
        ((GeneralPath) shape).curveTo(37.773, 28.041, 38.027, 28.252, 38.215, 28.682001);
        ((GeneralPath) shape).lineTo(38.613, 28.842001);
        ((GeneralPath) shape).lineTo(38.613, 27.998001);
        ((GeneralPath) shape).lineTo(30.734, 24.318);
        ((GeneralPath) shape).curveTo(29.188, 23.6, 28.039, 23.174, 27.293, 23.041);
        ((GeneralPath) shape).curveTo(26.387, 22.986, 25.546999, 22.92, 24.772999, 22.842001);
        ((GeneralPath) shape).curveTo(24.772999, 23.478, 24.784998, 23.826, 24.811998, 23.881);
        ((GeneralPath) shape).lineTo(26.253998, 24.08);
        ((GeneralPath) shape).curveTo(26.358997, 23.893, 26.507998, 23.787, 26.690998, 23.76);
        ((GeneralPath) shape).lineTo(27.335999, 23.76);
        ((GeneralPath) shape).curveTo(27.387, 23.814001, 27.425999, 23.975, 27.453, 24.24);
        ((GeneralPath) shape).lineTo(27.491999, 24.361);
        ((GeneralPath) shape).curveTo(28.640999, 24.654, 29.585999, 24.92, 30.335999, 25.158);
        ((GeneralPath) shape).curveTo(31.425999, 25.560001, 33.0, 26.240002, 35.055, 27.201);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.453, 8.361);
        ((GeneralPath) shape).lineTo(34.293, 7.08);
        ((GeneralPath) shape).lineTo(34.253998, 7.08);
        ((GeneralPath) shape).lineTo(38.573997, 8.799);
        ((GeneralPath) shape).lineTo(38.453, 8.361);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.293, 2.24);
        ((GeneralPath) shape).lineTo(24.254, 2.9980001);
        ((GeneralPath) shape).curveTo(26.921999, 4.146, 29.945, 5.385, 33.336, 6.721);
        ((GeneralPath) shape).lineTo(33.336, 6.678);
        ((GeneralPath) shape).curveTo(33.440998, 6.678, 33.785, 6.799, 34.375, 7.041);
        ((GeneralPath) shape).lineTo(38.453, 8.357);
        ((GeneralPath) shape).lineTo(38.293, 8.041);
        ((GeneralPath) shape).curveTo(34.535, 6.6270003, 30.535, 4.998, 26.293, 3.1580005);
        ((GeneralPath) shape).lineTo(24.293, 2.2400005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.254, 5.08);
        ((GeneralPath) shape).lineTo(25.612999, 5.6);
        ((GeneralPath) shape).curveTo(26.811998, 6.025, 28.265999, 6.748, 29.973, 7.76);
        ((GeneralPath) shape).lineTo(26.973, 6.7990003);
        ((GeneralPath) shape).lineTo(34.492, 10.998);
        ((GeneralPath) shape).curveTo(35.852, 11.748, 37.227, 12.4, 38.613, 12.959);
        ((GeneralPath) shape).lineTo(38.613, 12.040999);
        ((GeneralPath) shape).curveTo(35.867, 10.947, 33.945, 9.997999, 32.851997, 9.200999);
        ((GeneralPath) shape).curveTo(30.905998, 7.813999, 28.640997, 6.4279995, 26.050997, 5.0409994);
        ((GeneralPath) shape).lineTo(24.253996, 4.1189995);
        ((GeneralPath) shape).lineTo(24.253996, 5.0799994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.254, 7.119);
        ((GeneralPath) shape).lineTo(24.254, 8.041);
        ((GeneralPath) shape).curveTo(27.640999, 9.748, 32.426, 12.174, 38.613, 15.318001);
        ((GeneralPath) shape).lineTo(38.613, 14.842001);
        ((GeneralPath) shape).curveTo(37.68, 14.494001, 37.0, 14.213001, 36.573997, 13.998001);
        ((GeneralPath) shape).curveTo(36.651997, 13.975001, 36.746, 13.975001, 36.851997, 13.998001);
        ((GeneralPath) shape).lineTo(37.690998, 14.119001);
        ((GeneralPath) shape).curveTo(36.309, 13.478002, 34.468998, 12.533001, 32.176, 11.279001);
        ((GeneralPath) shape).curveTo(29.026999, 9.600001, 26.387, 8.213001, 24.253998, 7.1190014);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.254, 11.6);
        ((GeneralPath) shape).lineTo(24.254, 12.682);
        ((GeneralPath) shape).curveTo(25.078, 13.107, 27.32, 14.318, 30.973, 16.318);
        ((GeneralPath) shape).curveTo(34.093998, 18.025002, 36.641, 19.361, 38.613, 20.318);
        ((GeneralPath) shape).lineTo(38.613, 19.361);
        ((GeneralPath) shape).lineTo(37.253998, 18.682);
        ((GeneralPath) shape).curveTo(34.401997, 17.268, 31.761997, 15.841999, 29.335999, 14.4);
        ((GeneralPath) shape).curveTo(27.038998, 13.063999, 25.348, 12.131, 24.253998, 11.599999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.094, 21.158);
        ((GeneralPath) shape).curveTo(35.039, 21.158, 34.906002, 21.092001, 34.691, 20.959002);
        ((GeneralPath) shape).curveTo(34.133003, 20.533, 33.691, 20.252, 33.375, 20.119001);
        ((GeneralPath) shape).curveTo(33.508, 20.014002, 34.016, 20.119001, 34.895, 20.439001);
        ((GeneralPath) shape).curveTo(35.691, 20.654001, 36.867, 21.053001, 38.414, 21.639002);
        ((GeneralPath) shape).curveTo(33.32, 19.053001, 29.012001, 17.092003, 25.492, 15.760002);
        ((GeneralPath) shape).lineTo(27.453001, 16.639002);
        ((GeneralPath) shape).curveTo(27.582, 16.725002, 27.695002, 16.779001, 27.793001, 16.799002);
        ((GeneralPath) shape).lineTo(27.055, 16.721003);
        ((GeneralPath) shape).lineTo(26.332, 16.478003);
        ((GeneralPath) shape).curveTo(25.824001, 16.400003, 25.453001, 16.318003, 25.215, 16.240002);
        ((GeneralPath) shape).curveTo(24.84, 16.025002, 24.547, 15.893002, 24.332, 15.842002);
        ((GeneralPath) shape).lineTo(24.254002, 15.799002);
        ((GeneralPath) shape).lineTo(24.254002, 16.279001);
        ((GeneralPath) shape).curveTo(25.508001, 16.814001, 27.078001, 17.521002, 28.973001, 18.400002);
        ((GeneralPath) shape).curveTo(29.988, 18.881002, 31.359001, 19.533, 33.094, 20.361002);
        ((GeneralPath) shape).curveTo(33.84, 20.682001, 35.68, 21.639002, 38.613003, 23.240002);
        ((GeneralPath) shape).lineTo(38.613003, 21.959002);
        ((GeneralPath) shape).lineTo(35.094, 21.158);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.934, 11.201);
        ((GeneralPath) shape).lineTo(26.254, 10.998);
        ((GeneralPath) shape).curveTo(25.934, 10.893001, 25.746, 10.814, 25.691, 10.76);
        ((GeneralPath) shape).curveTo(25.852, 10.678, 26.188, 10.705, 26.691, 10.842);
        ((GeneralPath) shape).curveTo(27.176, 10.975, 27.547, 11.119, 27.812, 11.279);
        ((GeneralPath) shape).lineTo(29.094, 11.8810005);
        ((GeneralPath) shape).lineTo(24.254, 9.361);
        ((GeneralPath) shape).lineTo(24.254, 10.08);
        ((GeneralPath) shape).curveTo(27.375, 11.654, 31.52, 13.853, 36.691, 16.682);
        ((GeneralPath) shape).lineTo(38.613003, 17.720999);
        ((GeneralPath) shape).lineTo(38.613003, 16.720999);
        ((GeneralPath) shape).curveTo(35.785004, 15.360999, 33.387, 14.157999, 31.414003, 13.118999);
        ((GeneralPath) shape).lineTo(26.934004, 11.200998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.793, 16.799);
        ((GeneralPath) shape).curveTo(27.695, 16.779, 27.581999, 16.725, 27.453, 16.639);
        ((GeneralPath) shape).lineTo(24.453, 15.24);
        ((GeneralPath) shape).lineTo(24.254, 15.158);
        ((GeneralPath) shape).lineTo(24.254, 15.799);
        ((GeneralPath) shape).lineTo(24.331999, 15.842);
        ((GeneralPath) shape).curveTo(24.546999, 15.893, 24.839998, 16.025, 25.214998, 16.24);
        ((GeneralPath) shape).curveTo(25.453, 16.317999, 25.828, 16.4, 26.331999, 16.478);
        ((GeneralPath) shape).lineTo(27.050999, 16.721);
        ((GeneralPath) shape).lineTo(27.793, 16.799);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3D341B));
        g.fill(shape);

        // _0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.691, 20.959);
        ((GeneralPath) shape).curveTo(34.906002, 21.092, 35.039, 21.157999, 35.094, 21.157999);
        ((GeneralPath) shape).lineTo(38.613003, 21.959);
        ((GeneralPath) shape).lineTo(38.613003, 21.682);
        ((GeneralPath) shape).lineTo(38.414, 21.639);
        ((GeneralPath) shape).curveTo(36.867, 21.053, 35.691, 20.654, 34.895, 20.439);
        ((GeneralPath) shape).curveTo(34.012, 20.119, 33.508, 20.014, 33.375, 20.119);
        ((GeneralPath) shape).curveTo(33.691, 20.251999, 34.133, 20.532999, 34.691, 20.959);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_36
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.574, 27.158);
        ((GeneralPath) shape).curveTo(28.281, 27.080002, 28.066, 27.064001, 27.934, 27.119001);
        ((GeneralPath) shape).lineTo(29.293, 27.682001);
        ((GeneralPath) shape).lineTo(32.973, 28.240002);
        ((GeneralPath) shape).curveTo(31.055, 27.654001, 29.585999, 27.295002, 28.574, 27.158);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.691, 26.56);
        ((GeneralPath) shape).lineTo(27.133, 26.6);
        ((GeneralPath) shape).curveTo(27.746, 26.6, 28.133, 26.572, 28.293, 26.521);
        ((GeneralPath) shape).curveTo(28.375, 26.521, 28.465, 26.467, 28.574, 26.361);
        ((GeneralPath) shape).curveTo(28.706999, 26.201, 28.706999, 26.014, 28.574, 25.799);
        ((GeneralPath) shape).curveTo(28.519999, 25.532999, 28.387, 25.4, 28.171999, 25.4);
        ((GeneralPath) shape).curveTo(28.120998, 25.4, 28.078, 25.428, 28.054998, 25.477999);
        ((GeneralPath) shape).lineTo(27.972998, 25.638998);
        ((GeneralPath) shape).curveTo(27.866997, 25.720999, 27.745998, 25.731998, 27.612997, 25.681997);
        ((GeneralPath) shape).curveTo(27.452997, 25.626997, 27.358997, 25.532997, 27.331997, 25.399998);
        ((GeneralPath) shape).curveTo(27.304996, 25.345997, 27.331997, 25.267998, 27.413998, 25.157997);
        ((GeneralPath) shape).curveTo(27.491997, 25.052998, 27.534998, 24.974997, 27.534998, 24.919996);
        ((GeneralPath) shape).curveTo(27.558998, 24.786997, 27.546997, 24.599997, 27.491999, 24.360996);
        ((GeneralPath) shape).lineTo(27.453, 24.239996);
        ((GeneralPath) shape).curveTo(27.425999, 23.974997, 27.387, 23.813995, 27.335999, 23.759996);
        ((GeneralPath) shape).lineTo(26.690998, 23.759996);
        ((GeneralPath) shape).curveTo(26.507998, 23.786997, 26.358997, 23.892996, 26.253998, 24.079996);
        ((GeneralPath) shape).lineTo(26.093998, 24.399996);
        ((GeneralPath) shape).curveTo(26.093998, 24.157995, 26.011997, 24.063995, 25.851997, 24.118996);
        ((GeneralPath) shape).curveTo(25.772997, 24.200996, 25.706997, 24.251995, 25.651997, 24.278996);
        ((GeneralPath) shape).curveTo(25.546997, 24.333996, 25.425997, 24.333996, 25.292997, 24.278996);
        ((GeneralPath) shape).curveTo(25.026997, 24.224995, 24.866997, 24.091995, 24.811996, 23.880995);
        ((GeneralPath) shape).curveTo(24.784996, 23.825994, 24.772997, 23.477995, 24.772997, 22.841995);
        ((GeneralPath) shape).lineTo(24.772997, 22.720995);
        ((GeneralPath) shape).curveTo(24.772997, 22.587996, 24.706997, 22.411995, 24.573997, 22.200994);
        ((GeneralPath) shape).curveTo(24.519997, 22.091995, 24.491997, 21.774994, 24.491997, 21.239994);
        ((GeneralPath) shape).lineTo(24.491997, 19.520994);
        ((GeneralPath) shape).curveTo(24.491997, 19.145994, 24.452997, 18.825994, 24.374996, 18.559994);
        ((GeneralPath) shape).lineTo(24.253996, 19.200994);
        ((GeneralPath) shape).lineTo(24.253996, 25.278996);
        ((GeneralPath) shape).lineTo(24.972996, 25.919996);
        ((GeneralPath) shape).lineTo(26.690996, 26.559996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.812, 30.842);
        ((GeneralPath) shape).lineTo(37.055, 30.880999);
        ((GeneralPath) shape).curveTo(37.133, 30.880999, 37.375, 30.892998, 37.773, 30.919998);
        ((GeneralPath) shape).curveTo(38.065998, 30.946999, 38.293, 30.946999, 38.453, 30.919998);
        ((GeneralPath) shape).lineTo(38.613, 30.520998);
        ((GeneralPath) shape).lineTo(38.613, 29.841997);
        ((GeneralPath) shape).lineTo(38.535, 29.559998);
        ((GeneralPath) shape).curveTo(38.48, 29.267998, 38.375, 28.974998, 38.215, 28.681997);
        ((GeneralPath) shape).curveTo(38.027, 28.251997, 37.773, 28.040997, 37.453, 28.040997);
        ((GeneralPath) shape).curveTo(37.641, 28.173996, 37.746, 28.317997, 37.773, 28.477997);
        ((GeneralPath) shape).curveTo(37.801, 28.559998, 37.801, 28.653997, 37.773, 28.759996);
        ((GeneralPath) shape).curveTo(37.746, 28.892996, 37.718998, 28.958996, 37.690998, 28.958996);
        ((GeneralPath) shape).curveTo(37.668, 28.985996, 37.586, 28.974997, 37.453, 28.919996);
        ((GeneralPath) shape).curveTo(37.078, 28.731997, 36.801, 28.638996, 36.613, 28.638996);
        ((GeneralPath) shape).lineTo(36.055, 28.681995);
        ((GeneralPath) shape).curveTo(35.945, 28.731995, 35.895, 28.798996, 35.895, 28.880995);
        ((GeneralPath) shape).lineTo(35.895, 28.919994);
        ((GeneralPath) shape).curveTo(35.867, 29.079994, 35.906002, 29.294994, 36.012, 29.559994);
        ((GeneralPath) shape).lineTo(36.055, 29.681993);
        ((GeneralPath) shape).curveTo(35.68, 29.786993, 35.469, 29.681993, 35.414, 29.360994);
        ((GeneralPath) shape).lineTo(35.414, 28.720995);
        ((GeneralPath) shape).curveTo(35.465, 28.079994, 35.426003, 27.692995, 35.293003, 27.559996);
        ((GeneralPath) shape).curveTo(35.188004, 27.454996, 34.973003, 27.438995, 34.652004, 27.520996);
        ((GeneralPath) shape).curveTo(34.469006, 27.548996, 34.402004, 27.665997, 34.453003, 27.880997);
        ((GeneralPath) shape).curveTo(34.453003, 28.040997, 34.535004, 28.224997, 34.691, 28.438997);
        ((GeneralPath) shape).curveTo(34.719, 28.466997, 34.762, 28.520998, 34.812, 28.599997);
        ((GeneralPath) shape).curveTo(34.922, 28.704996, 34.973, 28.786997, 34.973, 28.841997);
        ((GeneralPath) shape).curveTo(35.0, 28.997997, 34.961, 29.106997, 34.852, 29.157997);
        ((GeneralPath) shape).curveTo(34.773003, 29.184998, 34.602, 29.200996, 34.332, 29.200996);
        ((GeneralPath) shape).curveTo(34.094, 29.224997, 33.945, 29.278996, 33.895, 29.360996);
        ((GeneralPath) shape).lineTo(35.293, 30.239996);
        ((GeneralPath) shape).lineTo(36.812, 30.841995);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.934, 11.201);
        ((GeneralPath) shape).lineTo(33.734, 14.08);
        ((GeneralPath) shape).curveTo(32.961002, 13.732, 31.414001, 12.998, 29.094002, 11.8810005);
        ((GeneralPath) shape).lineTo(27.812002, 11.279);
        ((GeneralPath) shape).curveTo(27.547003, 11.119, 27.172003, 10.975, 26.691002, 10.842);
        ((GeneralPath) shape).curveTo(26.188002, 10.705, 25.852001, 10.682, 25.691002, 10.76);
        ((GeneralPath) shape).curveTo(25.746002, 10.814, 25.934002, 10.893001, 26.254002, 10.998);
        ((GeneralPath) shape).lineTo(26.934002, 11.201);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.852, 13.998);
        ((GeneralPath) shape).curveTo(36.746002, 13.975, 36.652, 13.975, 36.574, 13.998);
        ((GeneralPath) shape).curveTo(37.0, 14.213, 37.68, 14.494, 38.613003, 14.842);
        ((GeneralPath) shape).lineTo(38.613003, 14.279);
        ((GeneralPath) shape).lineTo(36.852, 13.998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_41
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.012, 6.478);
        ((GeneralPath) shape).lineTo(29.973, 7.76);
        ((GeneralPath) shape).curveTo(28.265999, 6.748, 26.812, 6.025, 25.612999, 5.6000004);
        ((GeneralPath) shape).lineTo(24.254, 5.0800004);
        ((GeneralPath) shape).lineTo(24.254, 5.4780006);
        ((GeneralPath) shape).lineTo(24.331999, 5.521001);
        ((GeneralPath) shape).curveTo(25.054998, 6.025001, 25.612999, 6.3460007, 26.012, 6.4780006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_42
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.293, 7.08);
        ((GeneralPath) shape).lineTo(37.434, 8.041);
        ((GeneralPath) shape).lineTo(34.375, 7.0410004);
        ((GeneralPath) shape).curveTo(33.785, 6.7990003, 33.441, 6.682, 33.332, 6.682);
        ((GeneralPath) shape).lineTo(33.332, 6.721);
        ((GeneralPath) shape).curveTo(33.52, 6.959, 33.824, 7.0800004, 34.254, 7.0800004);
        ((GeneralPath) shape).lineTo(34.293003, 7.0800004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.535, 33.56);
        ((GeneralPath) shape).lineTo(15.293, 33.760002);
        ((GeneralPath) shape).curveTo(15.828, 33.893, 16.441, 33.893, 17.133, 33.760002);
        ((GeneralPath) shape).curveTo(30.440998, 32.615, 37.32, 31.920002, 37.773, 31.682003);
        ((GeneralPath) shape).lineTo(38.093998, 31.400003);
        ((GeneralPath) shape).lineTo(24.972998, 25.920004);
        ((GeneralPath) shape).lineTo(23.651999, 25.639004);
        ((GeneralPath) shape).lineTo(1.2929993, 28.560003);
        ((GeneralPath) shape).lineTo(14.534999, 33.560005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x89743D));
        g.fill(shape);

        // _0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.414, 32.92);
        ((GeneralPath) shape).lineTo(37.613, 31.200998);
        ((GeneralPath) shape).lineTo(36.690998, 30.798998);
        ((GeneralPath) shape).curveTo(23.440998, 32.345997, 16.120998, 33.279, 14.733997, 33.6);
        ((GeneralPath) shape).lineTo(15.292997, 33.76);
        ((GeneralPath) shape).curveTo(15.479998, 33.814, 15.772997, 33.842, 16.171997, 33.842);
        ((GeneralPath) shape).curveTo(18.784996, 33.412, 20.866997, 33.107, 22.413998, 32.92);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7A6836));
        g.fill(shape);

        // _0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.613, 26.521);
        ((GeneralPath) shape).lineTo(25.934, 26.24);
        ((GeneralPath) shape).lineTo(25.895, 26.24);
        ((GeneralPath) shape).curveTo(22.719, 26.639, 19.852001, 26.92, 17.293, 27.08);
        ((GeneralPath) shape).curveTo(13.690999, 27.318, 9.026999, 27.732, 3.2929993, 28.318);
        ((GeneralPath) shape).lineTo(3.0549994, 28.318);
        ((GeneralPath) shape).lineTo(1.2929994, 28.560001);
        ((GeneralPath) shape).lineTo(1.9339993, 28.842001);
        ((GeneralPath) shape).lineTo(3.0119991, 28.682001);
        ((GeneralPath) shape).curveTo(5.1209993, 28.361002, 8.159999, 28.025002, 12.132999, 27.682001);
        ((GeneralPath) shape).lineTo(6.3749995, 28.560001);
        ((GeneralPath) shape).lineTo(22.414, 26.998001);
        ((GeneralPath) shape).curveTo(23.32, 26.893002, 24.719, 26.732, 26.612999, 26.521002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.453, 27.318);
        ((GeneralPath) shape).lineTo(27.852, 27.08);
        ((GeneralPath) shape).curveTo(19.852, 27.881, 11.867, 28.705, 3.8949986, 29.56);
        ((GeneralPath) shape).lineTo(4.7339983, 29.880999);
        ((GeneralPath) shape).lineTo(28.453, 27.317999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.934, 31.041);
        ((GeneralPath) shape).lineTo(8.934, 31.439001);
        ((GeneralPath) shape).lineTo(32.535, 29.080002);
        ((GeneralPath) shape).lineTo(31.734, 28.760002);
        ((GeneralPath) shape).curveTo(26.585999, 29.318003, 21.785, 29.799002, 17.331999, 30.201002);
        ((GeneralPath) shape).curveTo(12.265999, 30.627003, 9.132998, 30.908003, 7.933999, 31.041002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.332, 31.881);
        ((GeneralPath) shape).lineTo(16.734, 31.6);
        ((GeneralPath) shape).lineTo(11.690999, 32.478);
        ((GeneralPath) shape).lineTo(12.093999, 32.639);
        ((GeneralPath) shape).curveTo(15.933999, 32.158, 21.387, 31.521, 28.453, 30.721);
        ((GeneralPath) shape).lineTo(34.895, 30.08);
        ((GeneralPath) shape).lineTo(34.453, 29.881);
        ((GeneralPath) shape).lineTo(32.453, 30.24);
        ((GeneralPath) shape).curveTo(32.266, 30.291, 31.987999, 30.317999, 31.612999, 30.317999);
        ((GeneralPath) shape).lineTo(28.734, 30.520998);
        ((GeneralPath) shape).curveTo(28.866999, 30.466997, 29.800999, 30.317999, 31.535, 30.079998);
        ((GeneralPath) shape).lineTo(33.973, 29.681997);
        ((GeneralPath) shape).lineTo(33.690998, 29.559998);
        ((GeneralPath) shape).curveTo(26.308998, 30.349998, 19.854998, 31.122997, 14.331999, 31.880997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.691, 29.639);
        ((GeneralPath) shape).lineTo(5.895, 30.318);
        ((GeneralPath) shape).lineTo(6.574, 30.521);
        ((GeneralPath) shape).lineTo(7.832, 30.4);
        ((GeneralPath) shape).curveTo(8.023, 30.291, 8.578, 30.17, 9.492, 30.041);
        ((GeneralPath) shape).lineTo(12.691, 29.639);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(14.113, 29.721);
        ((GeneralPath) shape).lineTo(30.332, 28.119001);
        ((GeneralPath) shape).lineTo(29.613, 27.842001);
        ((GeneralPath) shape).lineTo(14.113001, 29.721);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.691, 32.478);
        ((GeneralPath) shape).lineTo(16.734001, 31.6);
        ((GeneralPath) shape).lineTo(11.133001, 32.279);
        ((GeneralPath) shape).lineTo(11.691001, 32.478);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6C5C30));
        g.fill(shape);

        // _0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.613, 30.318);
        ((GeneralPath) shape).curveTo(31.988, 30.318, 32.266003, 30.295, 32.453, 30.240002);
        ((GeneralPath) shape).lineTo(34.453, 29.881002);
        ((GeneralPath) shape).lineTo(33.973, 29.682003);
        ((GeneralPath) shape).lineTo(31.535, 30.080004);
        ((GeneralPath) shape).curveTo(29.801, 30.318005, 28.867, 30.467003, 28.734, 30.521004);
        ((GeneralPath) shape).lineTo(31.612999, 30.318005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.414, 29.381);
        ((GeneralPath) shape).lineTo(9.492, 30.041);
        ((GeneralPath) shape).curveTo(8.559, 30.174, 7.9999995, 30.291, 7.812, 30.4);
        ((GeneralPath) shape).lineTo(15.414, 29.381);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.012, 28.682);
        ((GeneralPath) shape).lineTo(1.9340001, 28.842);
        ((GeneralPath) shape).lineTo(2.535, 29.040998);
        ((GeneralPath) shape).curveTo(3.1990001, 28.985998, 3.867, 28.907999, 4.535, 28.798998);
        ((GeneralPath) shape).lineTo(12.132999, 27.681997);
        ((GeneralPath) shape).curveTo(8.16, 28.024998, 5.1209993, 28.360998, 3.0119991, 28.681997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.852, 31.478);
        ((GeneralPath) shape).curveTo(11.801001, 31.533, 11.961, 31.588001, 12.332, 31.639);
        ((GeneralPath) shape).lineTo(25.574, 32.279);
        ((GeneralPath) shape).curveTo(25.921999, 32.279, 26.105, 32.239998, 26.133, 32.158);
        ((GeneralPath) shape).lineTo(28.094, 29.158);
        ((GeneralPath) shape).curveTo(28.148, 29.053001, 28.012, 28.998001, 27.691, 28.998001);
        ((GeneralPath) shape).lineTo(14.215, 28.080002);
        ((GeneralPath) shape).curveTo(13.84, 28.080002, 13.625, 28.119001, 13.574, 28.201002);
        ((GeneralPath) shape).lineTo(11.852, 31.478003);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(14.4140005, 28.361);
        ((GeneralPath) shape).curveTo(14.469001, 28.252, 14.652, 28.225, 14.973001, 28.279);
        ((GeneralPath) shape).lineTo(27.133, 29.08);
        ((GeneralPath) shape).curveTo(27.425999, 29.08, 27.546999, 29.135, 27.491999, 29.24);
        ((GeneralPath) shape).lineTo(25.690998, 32.041);
        ((GeneralPath) shape).lineTo(25.171999, 32.119);
        ((GeneralPath) shape).lineTo(13.292999, 31.477999);
        ((GeneralPath) shape).curveTo(12.945, 31.477999, 12.801, 31.428, 12.851999, 31.317999);
        ((GeneralPath) shape).lineTo(14.414, 28.360998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA68D49));
        g.fill(shape);

        // _0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.133, 30.881);
        ((GeneralPath) shape).curveTo(16.081999, 30.932001, 16.147999, 30.959, 16.331999, 30.959);
        ((GeneralPath) shape).lineTo(22.491999, 31.279);
        ((GeneralPath) shape).lineTo(22.772999, 31.24);
        ((GeneralPath) shape).lineTo(23.772999, 29.842);
        ((GeneralPath) shape).curveTo(23.772999, 29.786999, 23.706999, 29.759998, 23.574, 29.759998);
        ((GeneralPath) shape).lineTo(17.375, 29.399998);
        ((GeneralPath) shape).curveTo(17.188, 29.399998, 17.078, 29.411997, 17.055, 29.438997);
        ((GeneralPath) shape).lineTo(16.133, 30.880997);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(17.691, 29.560001);
        ((GeneralPath) shape).curveTo(17.691, 29.533, 17.773, 29.521002, 17.934, 29.521002);
        ((GeneralPath) shape).lineTo(23.254, 29.799002);
        ((GeneralPath) shape).curveTo(23.414, 29.799002, 23.469, 29.826002, 23.414, 29.881002);
        ((GeneralPath) shape).lineTo(22.535, 31.080002);
        ((GeneralPath) shape).curveTo(22.535, 31.107002, 22.453, 31.119001, 22.293, 31.119001);
        ((GeneralPath) shape).lineTo(17.094, 30.842001);
        ((GeneralPath) shape).lineTo(16.895, 30.799002);
        ((GeneralPath) shape).lineTo(17.691, 29.560001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.375, 31.4);
        ((GeneralPath) shape).curveTo(11.32, 31.506, 11.492, 31.56, 11.895, 31.56);
        ((GeneralPath) shape).lineTo(25.094002, 32.201);
        ((GeneralPath) shape).lineTo(25.652002, 32.119);
        ((GeneralPath) shape).lineTo(27.613003, 29.08);
        ((GeneralPath) shape).curveTo(27.668003, 29.025, 27.535004, 28.975, 27.215002, 28.92);
        ((GeneralPath) shape).lineTo(13.734002, 28.041);
        ((GeneralPath) shape).curveTo(13.359002, 27.986, 13.148002, 28.014, 13.094002, 28.119);
        ((GeneralPath) shape).lineTo(11.375002, 31.4);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(13.934, 28.317999);
        ((GeneralPath) shape).curveTo(13.988, 28.24, 14.188, 28.200998, 14.535, 28.200998);
        ((GeneralPath) shape).lineTo(26.652, 28.998);
        ((GeneralPath) shape).curveTo(26.945, 29.053, 27.078001, 29.106998, 27.055, 29.157999);
        ((GeneralPath) shape).lineTo(25.215, 31.959);
        ((GeneralPath) shape).curveTo(25.16, 32.064, 24.988, 32.092, 24.691, 32.041);
        ((GeneralPath) shape).lineTo(12.852, 31.4);
        ((GeneralPath) shape).curveTo(12.535, 31.4, 12.375, 31.361, 12.375, 31.279);
        ((GeneralPath) shape).lineTo(13.934, 28.317999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x60522B));
        g.fill(shape);

        // _0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.652, 30.842);
        ((GeneralPath) shape).lineTo(15.895, 30.880999);
        ((GeneralPath) shape).lineTo(22.055, 31.200998);
        ((GeneralPath) shape).curveTo(22.215, 31.200998, 22.293001, 31.184998, 22.293001, 31.157999);
        ((GeneralPath) shape).lineTo(23.293001, 29.759998);
        ((GeneralPath) shape).lineTo(23.094002, 29.682);
        ((GeneralPath) shape).lineTo(16.895002, 29.317999);
        ((GeneralPath) shape).lineTo(16.613003, 29.4);
        ((GeneralPath) shape).lineTo(15.652002, 30.842);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(17.215, 29.477999);
        ((GeneralPath) shape).lineTo(17.492, 29.439);
        ((GeneralPath) shape).lineTo(22.773, 29.759998);
        ((GeneralPath) shape).curveTo(22.906, 29.759998, 22.961, 29.774998, 22.934, 29.798998);
        ((GeneralPath) shape).lineTo(22.094, 31.040998);
        ((GeneralPath) shape).lineTo(21.852, 31.079998);
        ((GeneralPath) shape).lineTo(16.612999, 30.798998);
        ((GeneralPath) shape).lineTo(16.414, 30.720999);
        ((GeneralPath) shape).lineTo(17.215, 29.477999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.215, 29.6);
        ((GeneralPath) shape).curveTo(26.215, 29.494, 26.094, 29.4, 25.852, 29.318);
        ((GeneralPath) shape).curveTo(25.612999, 29.240002, 25.32, 29.201, 24.973, 29.201);
        ((GeneralPath) shape).curveTo(24.625, 29.201, 24.32, 29.24, 24.055, 29.318);
        ((GeneralPath) shape).curveTo(23.812, 29.400002, 23.691, 29.494001, 23.691, 29.6);
        ((GeneralPath) shape).curveTo(23.691, 29.865, 24.121, 29.998001, 24.973, 29.998001);
        ((GeneralPath) shape).curveTo(25.800999, 29.998001, 26.215, 29.865002, 26.215, 29.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.734, 30.279);
        ((GeneralPath) shape).curveTo(20.734, 30.174, 20.612999, 30.08, 20.375, 29.998);
        ((GeneralPath) shape).curveTo(20.133, 29.92, 19.84, 29.880999, 19.492, 29.880999);
        ((GeneralPath) shape).curveTo(19.145, 29.880999, 18.84, 29.919998, 18.574001, 29.998);
        ((GeneralPath) shape).curveTo(18.332, 30.08, 18.215002, 30.174, 18.215002, 30.279);
        ((GeneralPath) shape).curveTo(18.215002, 30.521, 18.641003, 30.639, 19.492002, 30.639);
        ((GeneralPath) shape).curveTo(20.320002, 30.639, 20.734003, 30.521, 20.734003, 30.279);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.133, 18.361);
        ((GeneralPath) shape).curveTo(37.266, 18.119, 37.266, 17.881, 37.133, 17.639);
        ((GeneralPath) shape).lineTo(32.253998, 6.2790003);
        ((GeneralPath) shape).curveTo(32.121, 6.0140004, 31.987997, 5.959, 31.851997, 6.1190004);
        ((GeneralPath) shape).lineTo(26.573997, 13.201);
        ((GeneralPath) shape).curveTo(26.440998, 13.357, 26.425997, 13.6, 26.534998, 13.92);
        ((GeneralPath) shape).lineTo(31.413998, 25.279);
        ((GeneralPath) shape).curveTo(31.546997, 25.545, 31.679998, 25.599998, 31.811998, 25.439);
        ((GeneralPath) shape).lineTo(37.133, 18.361);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(36.535, 17.439);
        ((GeneralPath) shape).curveTo(36.641, 17.759998, 36.625, 17.986, 36.492, 18.119);
        ((GeneralPath) shape).lineTo(31.812, 24.682);
        ((GeneralPath) shape).curveTo(31.734001, 24.865, 31.613, 24.814, 31.453001, 24.521);
        ((GeneralPath) shape).lineTo(26.934002, 13.998);
        ((GeneralPath) shape).curveTo(26.801003, 13.705, 26.801003, 13.467, 26.934002, 13.279);
        ((GeneralPath) shape).lineTo(31.734001, 6.998);
        ((GeneralPath) shape).curveTo(31.867, 6.814, 31.984001, 6.8650002, 32.094, 7.158);
        ((GeneralPath) shape).lineTo(36.535004, 17.439);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6E5E31));
        g.fill(shape);

        // _0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.492, 17.201);
        ((GeneralPath) shape).curveTo(34.547, 17.092001, 34.547, 16.975, 34.492, 16.842001);
        ((GeneralPath) shape).lineTo(32.215, 11.721001);
        ((GeneralPath) shape).curveTo(32.16, 11.588, 32.094, 11.56, 32.012, 11.639001);
        ((GeneralPath) shape).lineTo(29.535002, 14.799001);
        ((GeneralPath) shape).curveTo(29.480001, 14.908001, 29.480001, 15.014001, 29.535002, 15.119);
        ((GeneralPath) shape).lineTo(31.812002, 20.279);
        ((GeneralPath) shape).curveTo(31.867002, 20.411999, 31.934002, 20.439, 32.012, 20.356998);
        ((GeneralPath) shape).lineTo(34.492, 17.200998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(34.012, 16.682001);
        ((GeneralPath) shape).curveTo(34.066, 16.814001, 34.066, 16.920002, 34.012, 16.998001);
        ((GeneralPath) shape).lineTo(31.934002, 19.799002);
        ((GeneralPath) shape).curveTo(31.879002, 19.853003, 31.824001, 19.826002, 31.773003, 19.721003);
        ((GeneralPath) shape).lineTo(29.734003, 15.201002);
        ((GeneralPath) shape).curveTo(29.680002, 15.064002, 29.691004, 14.9590025, 29.773003, 14.881002);
        ((GeneralPath) shape).lineTo(31.891003, 12.201002);
        ((GeneralPath) shape).curveTo(31.945004, 12.092002, 32.000004, 12.119002, 32.051003, 12.279002);
        ((GeneralPath) shape).lineTo(34.012, 16.682003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.215, 25.478);
        ((GeneralPath) shape).curveTo(31.266, 25.588001, 31.332, 25.666, 31.414, 25.721);
        ((GeneralPath) shape).curveTo(31.491999, 25.748001, 31.559, 25.721, 31.612999, 25.639);
        ((GeneralPath) shape).lineTo(36.895, 18.6);
        ((GeneralPath) shape).curveTo(37.027, 18.439001, 37.039, 18.201, 36.934002, 17.881);
        ((GeneralPath) shape).lineTo(32.055, 6.521001);
        ((GeneralPath) shape).curveTo(32.0, 6.389001, 31.934, 6.3070006, 31.852001, 6.2790008);
        ((GeneralPath) shape).curveTo(31.773, 6.252001, 31.707, 6.2790008, 31.652, 6.3610005);
        ((GeneralPath) shape).lineTo(26.332, 13.400001);
        ((GeneralPath) shape).curveTo(26.199001, 13.588, 26.199001, 13.826, 26.332, 14.119);
        ((GeneralPath) shape).lineTo(31.215, 25.478);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(36.293, 17.682001);
        ((GeneralPath) shape).curveTo(36.402, 17.893002, 36.402, 18.119001, 36.293, 18.361002);
        ((GeneralPath) shape).lineTo(31.612999, 24.881002);
        ((GeneralPath) shape).curveTo(31.48, 25.064003, 31.359, 25.014002, 31.254, 24.721003);
        ((GeneralPath) shape).lineTo(26.691, 14.201002);
        ((GeneralPath) shape).curveTo(26.586, 13.908002, 26.602, 13.682002, 26.734, 13.521002);
        ((GeneralPath) shape).lineTo(31.535, 7.2010016);
        ((GeneralPath) shape).curveTo(31.641, 7.041002, 31.762, 7.0920014, 31.895, 7.3610015);
        ((GeneralPath) shape).lineTo(36.293, 17.682001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x463B1F));
        g.fill(shape);

        // _0_0_0_63
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.254, 17.4);
        ((GeneralPath) shape).curveTo(34.336002, 17.317999, 34.348003, 17.213, 34.293003, 17.08);
        ((GeneralPath) shape).lineTo(32.012005, 11.92);
        ((GeneralPath) shape).curveTo(31.934006, 11.787, 31.867004, 11.76, 31.812004, 11.842);
        ((GeneralPath) shape).lineTo(29.332005, 15.041);
        ((GeneralPath) shape).curveTo(29.227005, 15.092, 29.227005, 15.201, 29.332005, 15.357);
        ((GeneralPath) shape).lineTo(31.613005, 20.478);
        ((GeneralPath) shape).curveTo(31.668005, 20.639, 31.719006, 20.666, 31.773005, 20.560001);
        ((GeneralPath) shape).lineTo(34.254005, 17.400002);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(33.812, 16.92);
        ((GeneralPath) shape).curveTo(33.867, 17.053, 33.867, 17.146, 33.812, 17.201);
        ((GeneralPath) shape).lineTo(31.691, 19.998001);
        ((GeneralPath) shape).curveTo(31.641, 20.107, 31.586, 20.080002, 31.535, 19.920002);
        ((GeneralPath) shape).lineTo(29.535, 15.400002);
        ((GeneralPath) shape).curveTo(29.48, 15.268002, 29.48, 15.174002, 29.535, 15.119001);
        ((GeneralPath) shape).lineTo(31.691, 12.400002);
        ((GeneralPath) shape).curveTo(31.746, 12.346002, 31.801, 12.373001, 31.852, 12.478002);
        ((GeneralPath) shape).lineTo(33.812, 16.920002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_64
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.973, 23.119);
        ((GeneralPath) shape).curveTo(33.105, 23.014, 33.32, 22.959, 33.613, 22.959);
        ((GeneralPath) shape).lineTo(33.652, 22.92);
        ((GeneralPath) shape).lineTo(34.934002, 21.24);
        ((GeneralPath) shape).lineTo(34.973003, 20.881);
        ((GeneralPath) shape).curveTo(35.000004, 20.4, 35.133003, 20.014, 35.375004, 19.721);
        ((GeneralPath) shape).curveTo(35.453003, 19.615, 35.641003, 19.412, 35.934006, 19.119001);
        ((GeneralPath) shape).curveTo(36.176006, 18.853, 36.281006, 18.627, 36.254005, 18.439001);
        ((GeneralPath) shape).lineTo(36.254005, 18.400002);
        ((GeneralPath) shape).lineTo(32.094006, 24.201002);
        ((GeneralPath) shape).lineTo(32.254005, 23.998003);
        ((GeneralPath) shape).curveTo(32.414005, 23.814003, 32.652004, 23.521004, 32.973007, 23.119003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x382F19));
        g.fill(shape);

        // _0_0_0_65
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.332, 25.201);
        ((GeneralPath) shape).curveTo(31.465, 25.307001, 31.547, 25.361, 31.574001, 25.361);
        ((GeneralPath) shape).lineTo(31.691002, 24.76);
        ((GeneralPath) shape).lineTo(31.613003, 24.881);
        ((GeneralPath) shape).curveTo(31.480003, 25.064001, 31.359003, 25.014, 31.254004, 24.721);
        ((GeneralPath) shape).lineTo(28.852003, 19.201);
        ((GeneralPath) shape).lineTo(29.652002, 21.4);
        ((GeneralPath) shape).curveTo(29.785002, 21.692999, 29.961002, 22.174, 30.172003, 22.842);
        ((GeneralPath) shape).curveTo(30.359003, 23.4, 30.574003, 23.852999, 30.812002, 24.200998);
        ((GeneralPath) shape).lineTo(31.332003, 25.200998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_66
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.852, 16.998);
        ((GeneralPath) shape).curveTo(27.934, 17.24, 28.16, 17.705, 28.535, 18.4);
        ((GeneralPath) shape).lineTo(26.691, 14.201);
        ((GeneralPath) shape).curveTo(26.586, 13.908, 26.602, 13.682, 26.734, 13.518001);
        ((GeneralPath) shape).lineTo(27.691, 12.240001);
        ((GeneralPath) shape).lineTo(27.691, 11.6);
        ((GeneralPath) shape).lineTo(26.332, 13.400001);
        ((GeneralPath) shape).lineTo(26.254002, 13.6);
        ((GeneralPath) shape).lineTo(26.293001, 13.6);
        ((GeneralPath) shape).lineTo(26.336, 14.201);
        ((GeneralPath) shape).lineTo(26.613, 14.76);
        ((GeneralPath) shape).lineTo(27.336, 15.842);
        ((GeneralPath) shape).lineTo(27.852001, 16.998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_67
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.172, 7.76);
        ((GeneralPath) shape).lineTo(32.652, 8.6);
        ((GeneralPath) shape).curveTo(32.387, 7.9080005, 32.199, 7.4820004, 32.094, 7.3180003);
        ((GeneralPath) shape).curveTo(31.988, 7.1580005, 31.852001, 7.1070004, 31.691002, 7.1580005);
        ((GeneralPath) shape).lineTo(31.895002, 7.3610005);
        ((GeneralPath) shape).lineTo(32.293003, 8.400001);
        ((GeneralPath) shape).lineTo(32.172005, 7.7600007);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_68
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.973, 16.361);
        ((GeneralPath) shape).lineTo(36.172, 16.721);
        ((GeneralPath) shape).lineTo(36.133, 16.521);
        ((GeneralPath) shape).lineTo(35.253998, 13.998);
        ((GeneralPath) shape).curveTo(35.038998, 13.705, 34.921997, 13.533, 34.894997, 13.478001);
        ((GeneralPath) shape).lineTo(34.374996, 12.400001);
        ((GeneralPath) shape).lineTo(34.253998, 12.201);
        ((GeneralPath) shape).lineTo(35.973, 16.361);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_69
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.215, 25.478);
        ((GeneralPath) shape).curveTo(31.266, 25.588001, 31.332, 25.666, 31.414, 25.721);
        ((GeneralPath) shape).curveTo(31.491999, 25.748001, 31.559, 25.721, 31.612999, 25.639);
        ((GeneralPath) shape).lineTo(33.652, 22.92);
        ((GeneralPath) shape).lineTo(33.613, 22.959);
        ((GeneralPath) shape).curveTo(33.32, 22.959, 33.105, 23.014, 32.973, 23.119);
        ((GeneralPath) shape).curveTo(32.652, 23.521, 32.414, 23.814, 32.253998, 23.998);
        ((GeneralPath) shape).lineTo(31.690998, 24.759998);
        ((GeneralPath) shape).lineTo(31.573997, 25.360998);
        ((GeneralPath) shape).curveTo(31.546997, 25.360998, 31.464998, 25.306997, 31.331997, 25.200998);
        ((GeneralPath) shape).lineTo(30.811996, 24.200998);
        ((GeneralPath) shape).curveTo(30.573996, 23.852999, 30.358997, 23.399998, 30.171997, 22.842);
        ((GeneralPath) shape).curveTo(29.960997, 22.174, 29.784998, 21.692999, 29.651997, 21.4);
        ((GeneralPath) shape).lineTo(28.534996, 18.4);
        ((GeneralPath) shape).curveTo(28.159996, 17.705, 27.933996, 17.24, 27.851995, 16.998);
        ((GeneralPath) shape).lineTo(27.331995, 15.841999);
        ((GeneralPath) shape).lineTo(26.612995, 14.759999);
        ((GeneralPath) shape).lineTo(26.573996, 14.6779995);
        ((GeneralPath) shape).lineTo(31.214996, 25.478);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x302916));
        g.fill(shape);

        // _0_0_0_70
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.332, 14.1);
        ((GeneralPath) shape).lineTo(26.293001, 13.6);
        ((GeneralPath) shape).lineTo(26.254002, 13.6);
        ((GeneralPath) shape).curveTo(26.254002, 13.83, 26.281002, 13.998, 26.332, 14.1);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_71
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.293, 17.682);
        ((GeneralPath) shape).curveTo(36.348, 17.759998, 36.375, 17.907999, 36.375, 18.119);
        ((GeneralPath) shape).lineTo(36.652, 17.998);
        ((GeneralPath) shape).curveTo(36.629, 17.731998, 36.469, 17.307, 36.176, 16.720999);
        ((GeneralPath) shape).lineTo(35.973, 16.360998);
        ((GeneralPath) shape).lineTo(33.690998, 10.599998);
        ((GeneralPath) shape).curveTo(33.535, 10.118999, 33.188, 9.450998, 32.651997, 8.599998);
        ((GeneralPath) shape).lineTo(32.171997, 7.7599983);
        ((GeneralPath) shape).lineTo(32.292995, 8.399999);
        ((GeneralPath) shape).lineTo(36.292995, 17.682);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_72
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.133, 14.08);
        ((GeneralPath) shape).curveTo(29.133, 13.682, 29.050999, 13.334, 28.890999, 13.041);
        ((GeneralPath) shape).curveTo(28.734, 12.771, 28.546999, 12.639, 28.331999, 12.639);
        ((GeneralPath) shape).curveTo(28.120998, 12.639, 27.933998, 12.771, 27.772999, 13.041);
        ((GeneralPath) shape).curveTo(27.612999, 13.334001, 27.534998, 13.682, 27.534998, 14.08);
        ((GeneralPath) shape).curveTo(27.534998, 14.455, 27.612997, 14.787, 27.772999, 15.08);
        ((GeneralPath) shape).curveTo(27.933998, 15.346, 28.120998, 15.478, 28.331999, 15.478);
        ((GeneralPath) shape).curveTo(28.546999, 15.478, 28.734, 15.346, 28.890999, 15.08);
        ((GeneralPath) shape).curveTo(29.054998, 14.787, 29.133, 14.455, 29.133, 14.08);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x766434));
        g.fill(shape);

        // _0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.094, 17.521);
        ((GeneralPath) shape).curveTo(36.094, 17.146, 36.027, 16.842, 35.895, 16.6);
        ((GeneralPath) shape).curveTo(35.734, 16.334, 35.559002, 16.201, 35.375, 16.201);
        ((GeneralPath) shape).curveTo(35.188, 16.201, 35.027, 16.334, 34.895, 16.6);
        ((GeneralPath) shape).curveTo(34.762, 16.865, 34.691, 17.174, 34.691, 17.521);
        ((GeneralPath) shape).curveTo(34.691, 17.893, 34.762, 18.213, 34.895, 18.478);
        ((GeneralPath) shape).curveTo(35.027, 18.748001, 35.188, 18.881, 35.375, 18.881);
        ((GeneralPath) shape).curveTo(35.586, 18.881, 35.762, 18.748001, 35.895, 18.478);
        ((GeneralPath) shape).curveTo(36.027, 18.213001, 36.094, 17.893002, 36.094, 17.521);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_74
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.613, 22.279);
        ((GeneralPath) shape).curveTo(32.613, 21.907999, 32.546997, 21.588, 32.413998, 21.317999);
        ((GeneralPath) shape).curveTo(32.281, 21.053, 32.121, 20.919998, 31.933998, 20.919998);
        ((GeneralPath) shape).curveTo(31.745998, 20.919998, 31.573997, 21.052998, 31.413998, 21.317999);
        ((GeneralPath) shape).curveTo(31.280998, 21.588, 31.214998, 21.907999, 31.214998, 22.279);
        ((GeneralPath) shape).curveTo(31.214998, 22.654, 31.280998, 22.959, 31.413998, 23.201);
        ((GeneralPath) shape).curveTo(31.573997, 23.467001, 31.745998, 23.6, 31.933998, 23.6);
        ((GeneralPath) shape).curveTo(32.121, 23.6, 32.281, 23.467001, 32.413998, 23.201);
        ((GeneralPath) shape).curveTo(32.546997, 22.932001, 32.613, 22.627, 32.613, 22.279);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_75
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.895, 14.318);
        ((GeneralPath) shape).curveTo(28.895, 13.92, 28.812, 13.572, 28.652, 13.278999);
        ((GeneralPath) shape).curveTo(28.492, 13.013999, 28.305, 12.881, 28.094, 12.881);
        ((GeneralPath) shape).curveTo(27.879, 12.881, 27.691, 13.014, 27.535, 13.278999);
        ((GeneralPath) shape).curveTo(27.375, 13.572, 27.293, 13.919999, 27.293, 14.317999);
        ((GeneralPath) shape).curveTo(27.293, 14.720999, 27.375, 15.052999, 27.535, 15.317999);
        ((GeneralPath) shape).curveTo(27.691, 15.614999, 27.879, 15.759999, 28.094, 15.759999);
        ((GeneralPath) shape).curveTo(28.305, 15.759999, 28.492, 15.614999, 28.652, 15.317999);
        ((GeneralPath) shape).curveTo(28.812, 15.052999, 28.895, 14.720999, 28.895, 14.317999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x463B1F));
        g.fill(shape);

        // _0_0_0_76
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.812, 17.76);
        ((GeneralPath) shape).curveTo(35.812, 17.385, 35.746, 17.08, 35.613, 16.842001);
        ((GeneralPath) shape).curveTo(35.48, 16.572, 35.32, 16.439001, 35.133, 16.439001);
        ((GeneralPath) shape).curveTo(34.945, 16.439001, 34.773, 16.572, 34.613, 16.842001);
        ((GeneralPath) shape).curveTo(34.48, 17.080002, 34.413998, 17.385, 34.413998, 17.76);
        ((GeneralPath) shape).curveTo(34.413998, 18.135, 34.48, 18.455, 34.613, 18.721);
        ((GeneralPath) shape).curveTo(34.773, 18.986, 34.945, 19.119001, 35.133, 19.119001);
        ((GeneralPath) shape).curveTo(35.32, 19.119001, 35.48, 18.986002, 35.613, 18.721);
        ((GeneralPath) shape).curveTo(35.746, 18.455, 35.812, 18.135, 35.812, 17.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_77
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.375, 22.521);
        ((GeneralPath) shape).curveTo(32.375, 22.146, 32.305, 21.826, 32.172, 21.56);
        ((GeneralPath) shape).curveTo(32.039, 21.295, 31.867, 21.157999, 31.652, 21.157999);
        ((GeneralPath) shape).curveTo(31.469, 21.157999, 31.305, 21.294998, 31.172, 21.56);
        ((GeneralPath) shape).curveTo(31.039001, 21.826, 30.973001, 22.146, 30.973001, 22.521);
        ((GeneralPath) shape).curveTo(30.973001, 22.865, 31.039001, 23.174, 31.172, 23.439);
        ((GeneralPath) shape).curveTo(31.305, 23.705, 31.465, 23.842, 31.652, 23.842);
        ((GeneralPath) shape).curveTo(31.84, 23.842, 32.012, 23.705, 32.172, 23.439);
        ((GeneralPath) shape).curveTo(32.305, 23.200998, 32.375, 22.893, 32.375, 22.521);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_78
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.094, 15.76);
        ((GeneralPath) shape).curveTo(28.546999, 15.76, 28.812, 15.361, 28.895, 14.56);
        ((GeneralPath) shape).lineTo(28.812, 14.6);
        ((GeneralPath) shape).curveTo(28.707, 14.865001, 28.535, 14.932, 28.293001, 14.799001);
        ((GeneralPath) shape).curveTo(28.027, 14.666, 27.852001, 14.478001, 27.773, 14.240001);
        ((GeneralPath) shape).curveTo(27.668001, 13.975, 27.723001, 13.732, 27.934, 13.521001);
        ((GeneralPath) shape).curveTo(28.176, 13.334001, 28.414, 13.318001, 28.652, 13.478001);
        ((GeneralPath) shape).lineTo(28.812, 13.6);
        ((GeneralPath) shape).curveTo(28.625, 13.119, 28.387001, 12.8810005, 28.094, 12.8810005);
        ((GeneralPath) shape).curveTo(27.879, 12.8810005, 27.691, 13.014001, 27.535, 13.279);
        ((GeneralPath) shape).curveTo(27.375, 13.5720005, 27.293, 13.92, 27.293, 14.318001);
        ((GeneralPath) shape).curveTo(27.293, 14.721001, 27.375, 15.053, 27.535, 15.318001);
        ((GeneralPath) shape).curveTo(27.691, 15.615001, 27.879, 15.760001, 28.094, 15.760001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x382F19));
        g.fill(shape);

        // _0_0_0_79
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.613, 18.721);
        ((GeneralPath) shape).curveTo(34.773, 18.986, 34.945, 19.119001, 35.133, 19.119001);
        ((GeneralPath) shape).curveTo(35.535, 19.119001, 35.758, 18.760002, 35.812, 18.041002);
        ((GeneralPath) shape).lineTo(35.535, 17.998003);
        ((GeneralPath) shape).curveTo(35.238, 17.814003, 35.093998, 17.572002, 35.093998, 17.279003);
        ((GeneralPath) shape).curveTo(35.093998, 17.014004, 35.211, 16.787003, 35.453, 16.600002);
        ((GeneralPath) shape).curveTo(35.348, 16.494001, 35.238, 16.439003, 35.133, 16.439003);
        ((GeneralPath) shape).curveTo(34.945, 16.439003, 34.773, 16.572002, 34.613, 16.842003);
        ((GeneralPath) shape).curveTo(34.48, 17.080004, 34.413998, 17.385002, 34.413998, 17.760002);
        ((GeneralPath) shape).curveTo(34.413998, 18.135002, 34.48, 18.455002, 34.613, 18.721003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_80
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.332, 22.881);
        ((GeneralPath) shape).lineTo(32.172, 22.881);
        ((GeneralPath) shape).curveTo(31.668001, 22.932001, 31.414001, 22.721, 31.414001, 22.24);
        ((GeneralPath) shape).curveTo(31.465002, 21.865, 31.680002, 21.588, 32.055, 21.4);
        ((GeneralPath) shape).curveTo(31.945, 21.24, 31.812, 21.157999, 31.652, 21.157999);
        ((GeneralPath) shape).curveTo(31.469, 21.157999, 31.305, 21.294998, 31.172, 21.56);
        ((GeneralPath) shape).curveTo(31.039001, 21.826, 30.973001, 22.146, 30.973001, 22.521);
        ((GeneralPath) shape).curveTo(30.973001, 22.865, 31.039001, 23.174, 31.172, 23.439);
        ((GeneralPath) shape).curveTo(31.305, 23.705, 31.465, 23.842, 31.652, 23.842);
        ((GeneralPath) shape).curveTo(32.027, 23.842, 32.254, 23.521, 32.332, 22.880999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_81
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.094, 15.76);
        ((GeneralPath) shape).curveTo(28.492, 15.76, 28.746, 15.400001, 28.852, 14.682);
        ((GeneralPath) shape).lineTo(28.811998, 14.639);
        ((GeneralPath) shape).lineTo(28.690998, 14.76);
        ((GeneralPath) shape).curveTo(28.690998, 14.893001, 28.624998, 15.014, 28.491999, 15.119);
        ((GeneralPath) shape).curveTo(28.359, 15.225, 28.227, 15.240001, 28.093998, 15.158);
        ((GeneralPath) shape).curveTo(27.800999, 14.998, 27.612997, 14.732, 27.534998, 14.357);
        ((GeneralPath) shape).curveTo(27.452997, 14.014, 27.519999, 13.693001, 27.733997, 13.400001);
        ((GeneralPath) shape).curveTo(27.921997, 13.107, 28.198997, 13.025001, 28.573997, 13.158001);
        ((GeneralPath) shape).curveTo(28.386997, 12.975001, 28.226997, 12.8810005, 28.093998, 12.8810005);
        ((GeneralPath) shape).curveTo(27.878998, 12.8810005, 27.690998, 13.014001, 27.534998, 13.279);
        ((GeneralPath) shape).curveTo(27.374998, 13.5720005, 27.292997, 13.92, 27.292997, 14.318001);
        ((GeneralPath) shape).curveTo(27.292997, 14.721001, 27.374998, 15.053, 27.534998, 15.318001);
        ((GeneralPath) shape).curveTo(27.690998, 15.615001, 27.878998, 15.760001, 28.093998, 15.760001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x302916));
        g.fill(shape);

        // _0_0_0_82
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.055, 18.041);
        ((GeneralPath) shape).curveTo(34.762, 17.428, 34.785, 16.893, 35.133, 16.439001);
        ((GeneralPath) shape).curveTo(34.922, 16.467001, 34.746, 16.6, 34.613, 16.842001);
        ((GeneralPath) shape).curveTo(34.48, 17.107, 34.413998, 17.412, 34.413998, 17.76);
        ((GeneralPath) shape).curveTo(34.413998, 18.135, 34.48, 18.455, 34.613, 18.721);
        ((GeneralPath) shape).curveTo(34.773, 18.986, 34.945, 19.119001, 35.133, 19.119001);
        ((GeneralPath) shape).curveTo(35.453, 19.119001, 35.68, 18.799002, 35.812, 18.158);
        ((GeneralPath) shape).curveTo(35.734, 18.268002, 35.602, 18.318, 35.414, 18.318);
        ((GeneralPath) shape).curveTo(35.227, 18.295, 35.105003, 18.201, 35.055, 18.041);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_83
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.012, 23.318);
        ((GeneralPath) shape).curveTo(31.801, 23.428001, 31.625002, 23.385, 31.492, 23.201);
        ((GeneralPath) shape).curveTo(31.227001, 22.826, 31.148, 22.467001, 31.254, 22.119);
        ((GeneralPath) shape).curveTo(31.359, 21.775, 31.586, 21.505999, 31.934, 21.317999);
        ((GeneralPath) shape).curveTo(31.828, 21.213, 31.734, 21.157999, 31.652, 21.157999);
        ((GeneralPath) shape).curveTo(31.469, 21.157999, 31.305, 21.294998, 31.172, 21.56);
        ((GeneralPath) shape).curveTo(31.039001, 21.826, 30.973001, 22.146, 30.973001, 22.521);
        ((GeneralPath) shape).curveTo(30.973001, 22.865, 31.039001, 23.174, 31.172, 23.439);
        ((GeneralPath) shape).curveTo(31.305, 23.705, 31.465, 23.842, 31.652, 23.842);
        ((GeneralPath) shape).curveTo(32.027, 23.842, 32.254, 23.521, 32.336, 22.880999);
        ((GeneralPath) shape).lineTo(32.215, 22.880999);
        ((GeneralPath) shape).curveTo(32.293, 23.092, 32.227, 23.239998, 32.012, 23.317999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_84
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.055, 31.56);
        ((GeneralPath) shape).curveTo(27.988, 31.907999, 28.961, 32.014, 29.973, 31.880999);
        ((GeneralPath) shape).curveTo(31.147999, 31.720999, 31.492, 31.494, 31.012, 31.200998);
        ((GeneralPath) shape).curveTo(30.535, 30.880999, 29.905998, 30.748, 29.133, 30.798998);
        ((GeneralPath) shape).curveTo(28.199, 30.907997, 27.746, 31.040998, 27.772999, 31.200998);
        ((GeneralPath) shape).curveTo(27.800999, 31.384998, 28.171999, 31.505999, 28.890999, 31.559998);
        ((GeneralPath) shape).curveTo(29.188, 31.559998, 29.425999, 31.532997, 29.612999, 31.477997);
        ((GeneralPath) shape).curveTo(29.824, 31.427998, 29.890999, 31.372997, 29.811998, 31.317997);
        ((GeneralPath) shape).curveTo(29.757998, 31.267998, 29.640999, 31.224997, 29.453, 31.200996);
        ((GeneralPath) shape).curveTo(29.265999, 31.200996, 29.133, 31.224997, 29.050999, 31.278996);
        ((GeneralPath) shape).curveTo(28.973, 31.360996, 28.866999, 31.384996, 28.734, 31.360996);
        ((GeneralPath) shape).curveTo(28.546999, 31.333996, 28.465, 31.294996, 28.491999, 31.239996);
        ((GeneralPath) shape).curveTo(28.546999, 31.157995, 28.706999, 31.091995, 28.973, 31.040997);
        ((GeneralPath) shape).curveTo(29.559, 30.907997, 30.039, 30.974997, 30.414, 31.239996);
        ((GeneralPath) shape).curveTo(30.574, 31.345997, 30.546999, 31.454996, 30.331999, 31.559996);
        ((GeneralPath) shape).curveTo(30.120998, 31.692995, 29.690998, 31.759996, 29.054998, 31.759996);
        ((GeneralPath) shape).curveTo(27.718998, 31.759996, 27.026999, 31.559996, 26.972998, 31.157997);
        ((GeneralPath) shape).curveTo(26.921997, 30.864998, 27.397997, 30.665997, 28.413998, 30.559998);
        ((GeneralPath) shape).curveTo(30.226997, 30.477997, 31.519997, 30.599998, 32.293, 30.919998);
        ((GeneralPath) shape).curveTo(33.707, 31.454998, 34.895, 31.731998, 35.851997, 31.759998);
        ((GeneralPath) shape).curveTo(36.413998, 31.814, 36.921997, 31.798998, 37.374996, 31.720999);
        ((GeneralPath) shape).curveTo(37.823997, 31.638998, 37.972996, 31.532999, 37.811996, 31.4);
        ((GeneralPath) shape).curveTo(37.386997, 31.053, 36.745995, 30.907999, 35.894997, 30.959);
        ((GeneralPath) shape).curveTo(35.093998, 31.014, 34.827995, 31.135, 35.093998, 31.317999);
        ((GeneralPath) shape).curveTo(35.468998, 31.532999, 35.934, 31.588, 36.491997, 31.477999);
        ((GeneralPath) shape).curveTo(36.706997, 31.454998, 36.761997, 31.4, 36.651997, 31.317999);
        ((GeneralPath) shape).curveTo(36.573997, 31.268, 36.440998, 31.24, 36.253998, 31.24);
        ((GeneralPath) shape).curveTo(35.878998, 31.185, 35.784996, 31.201, 35.973, 31.279);
        ((GeneralPath) shape).lineTo(36.253998, 31.361);
        ((GeneralPath) shape).curveTo(36.304996, 31.412, 36.121, 31.412, 35.690998, 31.361);
        ((GeneralPath) shape).curveTo(35.535, 31.334, 35.468998, 31.295, 35.491997, 31.24);
        ((GeneralPath) shape).curveTo(35.519997, 31.185, 35.624996, 31.146, 35.811996, 31.119);
        ((GeneralPath) shape).curveTo(36.319996, 31.041, 36.772995, 31.092, 37.171997, 31.279);
        ((GeneralPath) shape).curveTo(37.491997, 31.467, 37.319996, 31.588, 36.651997, 31.639);
        ((GeneralPath) shape).curveTo(35.772995, 31.748, 34.761997, 31.572, 33.612995, 31.119);
        ((GeneralPath) shape).curveTo(32.440994, 30.666, 31.198996, 30.428, 29.894995, 30.4);
        ((GeneralPath) shape).curveTo(28.479996, 30.4, 27.519995, 30.467, 27.011995, 30.6);
        ((GeneralPath) shape).curveTo(26.667995, 30.705, 26.507996, 30.865, 26.534996, 31.08);
        ((GeneralPath) shape).curveTo(26.558996, 31.268, 26.733995, 31.428, 27.054996, 31.56);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1B960));
        g.fill(shape);

        // _0_0_0_85
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.094, 31.92);
        ((GeneralPath) shape).curveTo(29.801, 31.998, 29.785, 32.107, 30.055, 32.24);
        ((GeneralPath) shape).curveTo(30.266, 32.346, 30.535, 32.373, 30.852001, 32.318);
        ((GeneralPath) shape).curveTo(31.254002, 32.268, 31.348001, 32.213, 31.133001, 32.158);
        ((GeneralPath) shape).curveTo(31.082, 32.107002, 31.000002, 32.092, 30.895, 32.119);
        ((GeneralPath) shape).curveTo(30.812, 32.119, 30.801, 32.146, 30.852001, 32.201);
        ((GeneralPath) shape).curveTo(30.934002, 32.225, 30.906002, 32.24, 30.773, 32.24);
        ((GeneralPath) shape).curveTo(30.641, 32.24, 30.508001, 32.225002, 30.375, 32.201);
        ((GeneralPath) shape).curveTo(30.16, 32.119, 30.348, 32.053, 30.934, 31.998001);
        ((GeneralPath) shape).curveTo(31.281, 31.998001, 31.559, 32.107002, 31.773, 32.318);
        ((GeneralPath) shape).curveTo(31.824001, 32.373, 31.973001, 32.373, 32.215, 32.318);
        ((GeneralPath) shape).curveTo(32.293, 32.135002, 32.012, 31.986, 31.375, 31.881);
        ((GeneralPath) shape).curveTo(31.0, 31.748001, 30.574, 31.76, 30.094, 31.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_86
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.492, 30.041);
        ((GeneralPath) shape).curveTo(33.785, 29.986, 33.828, 29.92, 33.613, 29.842001);
        ((GeneralPath) shape).curveTo(33.398, 29.76, 33.105, 29.748001, 32.733997, 29.799002);
        ((GeneralPath) shape).curveTo(32.226997, 29.799002, 32.026997, 29.881002, 32.132996, 30.041002);
        ((GeneralPath) shape).curveTo(32.347996, 30.252003, 32.667995, 30.334002, 33.093994, 30.279003);
        ((GeneralPath) shape).curveTo(33.890995, 30.279003, 34.440994, 30.213003, 34.733994, 30.080004);
        ((GeneralPath) shape).curveTo(34.784992, 30.053003, 34.772995, 30.025003, 34.690994, 29.998003);
        ((GeneralPath) shape).curveTo(34.585995, 29.975002, 34.479996, 29.975002, 34.374992, 29.998003);
        ((GeneralPath) shape).curveTo(33.706993, 30.135002, 33.253994, 30.174004, 33.011993, 30.119003);
        ((GeneralPath) shape).curveTo(32.827995, 30.064003, 32.733994, 30.025003, 32.733994, 29.998003);
        ((GeneralPath) shape).curveTo(32.706993, 29.947002, 32.772995, 29.908003, 32.933994, 29.881002);
        ((GeneralPath) shape).curveTo(33.093994, 29.853003, 33.237995, 29.853003, 33.374996, 29.881002);
        ((GeneralPath) shape).curveTo(33.507996, 29.908003, 33.507996, 29.932003, 33.374996, 29.959002);
        ((GeneralPath) shape).curveTo(33.237995, 29.959002, 33.198997, 29.975002, 33.253998, 29.998001);
        ((GeneralPath) shape).curveTo(33.281, 30.025002, 33.358997, 30.041, 33.491997, 30.041);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_87
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.812, 31.799);
        ((GeneralPath) shape).curveTo(33.68, 31.692999, 33.453, 31.639, 33.133, 31.639);
        ((GeneralPath) shape).curveTo(32.84, 31.639, 32.602, 31.666, 32.413998, 31.721);
        ((GeneralPath) shape).curveTo(32.281, 31.748001, 32.293, 31.787, 32.453, 31.842001);
        ((GeneralPath) shape).curveTo(32.613, 31.92, 32.812, 31.975, 33.055, 31.998001);
        ((GeneralPath) shape).curveTo(33.32, 32.025, 33.535, 32.014, 33.691, 31.959002);
        ((GeneralPath) shape).curveTo(33.828003, 31.908, 33.867, 31.853, 33.812, 31.799002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_88
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.414, 30.721);
        ((GeneralPath) shape).curveTo(35.121002, 30.533, 34.652, 30.494001, 34.012, 30.6);
        ((GeneralPath) shape).curveTo(33.879, 30.627, 33.879, 30.682001, 34.012, 30.76);
        ((GeneralPath) shape).curveTo(34.172, 30.842001, 34.387, 30.893, 34.652, 30.92);
        ((GeneralPath) shape).curveTo(34.895, 30.947, 35.094, 30.932, 35.254, 30.881);
        ((GeneralPath) shape).curveTo(35.414, 30.826, 35.465, 30.775, 35.414, 30.721);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_89
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.812, 27.201);
        ((GeneralPath) shape).curveTo(17.227001, 27.252, 16.895, 27.361, 16.812, 27.521);
        ((GeneralPath) shape).curveTo(16.758, 27.654, 16.895, 27.799, 17.215, 27.959);
        ((GeneralPath) shape).curveTo(18.012001, 28.334, 19.105, 28.494, 20.492, 28.439);
        ((GeneralPath) shape).curveTo(21.402, 28.439, 22.254, 28.307, 23.055, 28.040998);
        ((GeneralPath) shape).curveTo(23.719, 27.825998, 23.613, 27.439, 22.734001, 26.880999);
        ((GeneralPath) shape).curveTo(22.387001, 26.692999, 22.238, 26.505999, 22.293001, 26.317999);
        ((GeneralPath) shape).curveTo(22.320002, 26.157999, 22.480001, 26.053, 22.773, 25.998);
        ((GeneralPath) shape).curveTo(23.441, 25.893, 23.961, 25.92, 24.332, 26.08);
        ((GeneralPath) shape).curveTo(24.52, 26.157999, 24.602001, 26.24, 24.574001, 26.318);
        ((GeneralPath) shape).curveTo(24.547, 26.373001, 24.414001, 26.412, 24.172, 26.439001);
        ((GeneralPath) shape).curveTo(23.961, 26.467001, 23.746, 26.467001, 23.535002, 26.439001);
        ((GeneralPath) shape).curveTo(23.320002, 26.439001, 23.199001, 26.412, 23.172, 26.361002);
        ((GeneralPath) shape).curveTo(23.172, 26.307001, 23.215, 26.268002, 23.293001, 26.240002);
        ((GeneralPath) shape).curveTo(23.375002, 26.213001, 23.441002, 26.213001, 23.492, 26.240002);
        ((GeneralPath) shape).curveTo(23.602001, 26.240002, 23.668001, 26.279001, 23.691, 26.361002);
        ((GeneralPath) shape).curveTo(23.801, 26.439001, 23.906, 26.428001, 24.012, 26.318003);
        ((GeneralPath) shape).curveTo(24.094, 26.268003, 24.050999, 26.213003, 23.890999, 26.158003);
        ((GeneralPath) shape).curveTo(23.734, 26.107002, 23.519999, 26.092003, 23.254, 26.119003);
        ((GeneralPath) shape).curveTo(22.961, 26.146004, 22.801, 26.201004, 22.772999, 26.279003);
        ((GeneralPath) shape).curveTo(22.718998, 26.361004, 22.800999, 26.428003, 23.012, 26.478003);
        ((GeneralPath) shape).curveTo(23.464998, 26.666002, 24.039, 26.682003, 24.734, 26.521002);
        ((GeneralPath) shape).curveTo(25.0, 26.467001, 25.09, 26.373001, 25.012, 26.240002);
        ((GeneralPath) shape).curveTo(24.934, 26.135002, 24.706999, 26.025002, 24.331999, 25.920002);
        ((GeneralPath) shape).curveTo(23.956999, 25.814001, 23.504, 25.775002, 22.973, 25.799002);
        ((GeneralPath) shape).curveTo(22.465, 25.853003, 22.09, 25.947002, 21.852, 26.080002);
        ((GeneralPath) shape).curveTo(21.453, 26.295002, 21.719, 26.682001, 22.651999, 27.240002);
        ((GeneralPath) shape).curveTo(22.999998, 27.455002, 23.026999, 27.654001, 22.734, 27.842001);
        ((GeneralPath) shape).curveTo(22.491999, 27.975, 22.078, 28.092001, 21.491999, 28.201);
        ((GeneralPath) shape).curveTo(20.508, 28.334, 19.534998, 28.318, 18.574, 28.158);
        ((GeneralPath) shape).curveTo(18.039, 28.080002, 17.668, 27.975, 17.453, 27.842001);
        ((GeneralPath) shape).curveTo(17.214998, 27.682001, 17.293, 27.545, 17.691, 27.439001);
        ((GeneralPath) shape).curveTo(18.094, 27.307001, 18.602, 27.252, 19.215, 27.279001);
        ((GeneralPath) shape).curveTo(19.719, 27.307001, 20.121, 27.361002, 20.414, 27.439001);
        ((GeneralPath) shape).curveTo(20.625, 27.521002, 20.734, 27.6, 20.734, 27.682001);
        ((GeneralPath) shape).curveTo(20.706999, 27.76, 20.519999, 27.814001, 20.171999, 27.842001);
        ((GeneralPath) shape).curveTo(19.188, 27.893002, 18.758, 27.853, 18.894999, 27.721);
        ((GeneralPath) shape).curveTo(18.918, 27.693, 19.078, 27.682001, 19.374998, 27.682001);
        ((GeneralPath) shape).curveTo(19.640999, 27.705002, 19.811998, 27.693, 19.890999, 27.639002);
        ((GeneralPath) shape).curveTo(19.973, 27.611002, 19.918, 27.572002, 19.734, 27.521002);
        ((GeneralPath) shape).curveTo(19.227, 27.361002, 18.758, 27.373001, 18.331999, 27.560001);
        ((GeneralPath) shape).curveTo(17.987999, 27.721, 18.188, 27.865002, 18.933998, 27.998001);
        ((GeneralPath) shape).curveTo(19.573997, 28.080002, 20.280998, 28.053001, 21.054998, 27.920002);
        ((GeneralPath) shape).curveTo(21.347998, 27.865002, 21.479998, 27.787003, 21.453, 27.682001);
        ((GeneralPath) shape).curveTo(21.401999, 27.572, 21.214998, 27.467001, 20.894999, 27.361002);
        ((GeneralPath) shape).curveTo(20.065998, 27.092003, 19.038998, 27.041002, 17.811998, 27.201002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_90
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.734, 27.119);
        ((GeneralPath) shape).curveTo(18.535, 27.119, 18.866999, 27.053, 18.734, 26.92);
        ((GeneralPath) shape).curveTo(18.625, 26.705, 18.281, 26.572, 17.691, 26.521);
        ((GeneralPath) shape).curveTo(17.586, 26.494, 17.492, 26.494, 17.414, 26.521);
        ((GeneralPath) shape).curveTo(17.309, 26.549, 17.293, 26.572, 17.375, 26.6);
        ((GeneralPath) shape).curveTo(18.094, 26.732, 18.309, 26.842001, 18.012, 26.92);
        ((GeneralPath) shape).curveTo(17.508, 27.025, 17.16, 27.025, 16.973, 26.92);
        ((GeneralPath) shape).curveTo(16.918, 26.865, 16.918, 26.826, 16.973, 26.799);
        ((GeneralPath) shape).curveTo(17.055, 26.775, 17.133, 26.787, 17.215, 26.842);
        ((GeneralPath) shape).curveTo(17.613, 26.919998, 17.734, 26.907999, 17.574, 26.799);
        ((GeneralPath) shape).curveTo(17.469, 26.721, 17.215, 26.705, 16.812, 26.76);
        ((GeneralPath) shape).curveTo(16.547, 26.787, 16.48, 26.853, 16.613, 26.959);
        ((GeneralPath) shape).curveTo(16.828001, 27.092, 17.199001, 27.146, 17.734001, 27.119);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_91
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.492, 27.478);
        ((GeneralPath) shape).curveTo(25.359001, 27.506, 25.32, 27.545, 25.375, 27.6);
        ((GeneralPath) shape).curveTo(25.426, 27.682001, 25.559, 27.748001, 25.773, 27.799);
        ((GeneralPath) shape).curveTo(26.199001, 27.881, 26.625, 27.881, 27.055, 27.799);
        ((GeneralPath) shape).curveTo(27.426, 27.748, 27.535, 27.682, 27.375, 27.6);
        ((GeneralPath) shape).curveTo(27.215, 27.494, 26.988, 27.467001, 26.691, 27.521);
        ((GeneralPath) shape).curveTo(26.559, 27.549, 26.535, 27.572, 26.613, 27.6);
        ((GeneralPath) shape).curveTo(26.668001, 27.627, 26.762001, 27.627, 26.895, 27.6);
        ((GeneralPath) shape).curveTo(27.055, 27.572, 27.133001, 27.588001, 27.133001, 27.639);
        ((GeneralPath) shape).curveTo(27.105001, 27.666, 27.012001, 27.693, 26.852001, 27.721);
        ((GeneralPath) shape).curveTo(26.453001, 27.775002, 26.199001, 27.721, 26.094002, 27.560001);
        ((GeneralPath) shape).curveTo(26.039001, 27.506, 26.199001, 27.467001, 26.574001, 27.439001);
        ((GeneralPath) shape).curveTo(26.785002, 27.412, 27.039001, 27.385, 27.332, 27.361002);
        ((GeneralPath) shape).curveTo(27.785, 27.361002, 27.773, 27.318003, 27.293001, 27.240002);
        ((GeneralPath) shape).curveTo(26.574001, 27.240002, 25.973001, 27.318, 25.492, 27.478003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_92
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.414, 26.478);
        ((GeneralPath) shape).curveTo(20.305, 26.428001, 20.121, 26.412, 19.852, 26.439001);
        ((GeneralPath) shape).curveTo(19.585999, 26.439001, 19.401999, 26.467001, 19.293, 26.521002);
        ((GeneralPath) shape).curveTo(19.188, 26.572002, 19.227, 26.639002, 19.414, 26.721003);
        ((GeneralPath) shape).curveTo(19.602, 26.775003, 19.785, 26.799002, 19.973, 26.799002);
        ((GeneralPath) shape).curveTo(20.746, 26.721003, 20.895, 26.615002, 20.414, 26.478003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_93
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.254, 26.76);
        ((GeneralPath) shape).curveTo(24.828, 26.627, 24.441, 26.639, 24.094, 26.799);
        ((GeneralPath) shape).curveTo(23.987999, 26.853, 24.027, 26.92, 24.215, 26.998);
        ((GeneralPath) shape).curveTo(24.375, 27.053, 24.559, 27.08, 24.773, 27.08);
        ((GeneralPath) shape).curveTo(25.039001, 27.08, 25.266, 27.053, 25.453001, 26.998);
        ((GeneralPath) shape).curveTo(25.668001, 26.92, 25.602001, 26.842, 25.254002, 26.759998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_94
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.094, 32.521);
        ((GeneralPath) shape).curveTo(18.879, 32.494, 18.746, 32.494, 18.691, 32.521);
        ((GeneralPath) shape).curveTo(18.641, 32.549, 18.707, 32.588, 18.895, 32.639);
        ((GeneralPath) shape).curveTo(19.266, 32.775, 19.625, 32.775, 19.973, 32.639);
        ((GeneralPath) shape).curveTo(20.265999, 32.506, 20.078, 32.385, 19.414, 32.279);
        ((GeneralPath) shape).curveTo(19.012, 32.201, 18.425999, 32.184998, 17.652, 32.239998);
        ((GeneralPath) shape).curveTo(17.414, 32.267998, 17.332, 32.334, 17.414, 32.439);
        ((GeneralPath) shape).curveTo(17.469, 32.545, 17.640999, 32.654, 17.934, 32.76);
        ((GeneralPath) shape).curveTo(18.574, 32.975, 19.414, 33.040997, 20.453, 32.959);
        ((GeneralPath) shape).curveTo(20.905998, 32.932, 21.16, 32.853, 21.214998, 32.721);
        ((GeneralPath) shape).curveTo(21.237999, 32.615, 21.120998, 32.494, 20.851997, 32.361);
        ((GeneralPath) shape).curveTo(20.132998, 32.041, 19.171997, 31.853, 17.972998, 31.799);
        ((GeneralPath) shape).curveTo(17.120998, 31.775, 16.413998, 31.881, 15.851997, 32.119);
        ((GeneralPath) shape).curveTo(15.374997, 32.279, 15.612997, 32.614998, 16.573997, 33.119);
        ((GeneralPath) shape).curveTo(16.917997, 33.279, 17.104998, 33.427998, 17.132998, 33.56);
        ((GeneralPath) shape).curveTo(17.187998, 33.666, 17.093998, 33.748, 16.851997, 33.799);
        ((GeneralPath) shape).curveTo(16.374998, 33.853, 15.933997, 33.814, 15.534997, 33.682);
        ((GeneralPath) shape).curveTo(15.347997, 33.627, 15.253997, 33.572, 15.253997, 33.521);
        ((GeneralPath) shape).curveTo(15.253997, 33.467, 15.347997, 33.428, 15.534997, 33.4);
        ((GeneralPath) shape).curveTo(16.038998, 33.346, 16.319998, 33.385002, 16.374996, 33.521);
        ((GeneralPath) shape).curveTo(16.397997, 33.549, 16.386995, 33.572, 16.331997, 33.6);
        ((GeneralPath) shape).curveTo(16.280996, 33.627, 16.226997, 33.627, 16.171997, 33.6);
        ((GeneralPath) shape).lineTo(15.972997, 33.521);
        ((GeneralPath) shape).curveTo(15.917996, 33.467, 15.823997, 33.467, 15.690997, 33.521);
        ((GeneralPath) shape).curveTo(15.612997, 33.682, 15.851997, 33.732, 16.413998, 33.682);
        ((GeneralPath) shape).curveTo(16.651999, 33.682, 16.772997, 33.654, 16.772997, 33.6);
        ((GeneralPath) shape).curveTo(16.772997, 33.521, 16.667997, 33.454998, 16.452997, 33.399998);
        ((GeneralPath) shape).curveTo(16.054996, 33.267998, 15.5739975, 33.252, 15.011997, 33.360996);
        ((GeneralPath) shape).curveTo(14.585998, 33.438995, 14.784997, 33.599995, 15.612997, 33.841995);
        ((GeneralPath) shape).curveTo(16.491997, 34.024994, 17.147997, 33.997993, 17.573997, 33.759995);
        ((GeneralPath) shape).curveTo(17.839998, 33.571995, 17.479998, 33.251995, 16.491997, 32.798996);
        ((GeneralPath) shape).curveTo(16.120996, 32.614998, 16.026997, 32.438995, 16.214996, 32.278996);
        ((GeneralPath) shape).curveTo(16.374996, 32.173996, 16.690996, 32.079994, 17.171997, 31.997995);
        ((GeneralPath) shape).curveTo(17.944998, 31.892996, 18.784998, 31.931995, 19.690998, 32.118996);
        ((GeneralPath) shape).curveTo(20.120998, 32.200996, 20.440998, 32.306995, 20.651999, 32.438995);
        ((GeneralPath) shape).curveTo(20.866999, 32.571995, 20.824, 32.681995, 20.534998, 32.759995);
        ((GeneralPath) shape).curveTo(19.890999, 32.946995, 19.159998, 32.919994, 18.331997, 32.681995);
        ((GeneralPath) shape).curveTo(18.120996, 32.626995, 18.011997, 32.559994, 18.011997, 32.477997);
        ((GeneralPath) shape).curveTo(17.987997, 32.427998, 18.120996, 32.385, 18.413998, 32.360996);
        ((GeneralPath) shape).curveTo(18.706997, 32.333996, 18.972998, 32.345997, 19.214998, 32.399998);
        ((GeneralPath) shape).curveTo(19.453, 32.427998, 19.546999, 32.467, 19.491999, 32.520996);
        ((GeneralPath) shape).lineTo(19.093998, 32.520996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_95
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.414, 33.158);
        ((GeneralPath) shape).curveTo(21.199, 33.053, 20.906, 32.998, 20.535, 32.998);
        ((GeneralPath) shape).curveTo(19.973, 32.998, 19.719, 33.053, 19.773, 33.158);
        ((GeneralPath) shape).curveTo(20.148, 33.346, 20.441, 33.455, 20.652, 33.478);
        ((GeneralPath) shape).curveTo(20.762001, 33.506, 20.84, 33.506, 20.895, 33.478);
        ((GeneralPath) shape).curveTo(20.973, 33.478, 20.973, 33.467, 20.895, 33.439);
        ((GeneralPath) shape).curveTo(20.387001, 33.307, 20.215, 33.212997, 20.375, 33.158);
        ((GeneralPath) shape).curveTo(20.773, 33.107002, 21.039, 33.119, 21.176, 33.201);
        ((GeneralPath) shape).curveTo(21.148, 33.279, 21.078001, 33.295002, 20.973001, 33.24);
        ((GeneralPath) shape).curveTo(20.895002, 33.213, 20.812002, 33.225002, 20.734001, 33.279003);
        ((GeneralPath) shape).curveTo(20.867, 33.334003, 21.055, 33.346004, 21.293001, 33.318005);
        ((GeneralPath) shape).curveTo(21.559002, 33.268005, 21.602001, 33.213005, 21.414001, 33.158005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_96
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.293, 32.56);
        ((GeneralPath) shape).curveTo(11.895, 32.56, 11.934, 32.600002, 12.4140005, 32.682003);
        ((GeneralPath) shape).curveTo(13.078, 32.705, 13.586, 32.654003, 13.934, 32.521004);
        ((GeneralPath) shape).curveTo(14.172, 32.467003, 14.027, 32.373005, 13.492, 32.240005);
        ((GeneralPath) shape).curveTo(13.280999, 32.185005, 12.879, 32.158005, 12.292999, 32.158005);
        ((GeneralPath) shape).curveTo(11.973, 32.213005, 11.905999, 32.279003, 12.093999, 32.361004);
        ((GeneralPath) shape).curveTo(12.331999, 32.467003, 12.573998, 32.494003, 12.811999, 32.439003);
        ((GeneralPath) shape).curveTo(12.917999, 32.439003, 12.933999, 32.428, 12.851999, 32.4);
        ((GeneralPath) shape).curveTo(12.772999, 32.373, 12.679999, 32.361, 12.573999, 32.361);
        ((GeneralPath) shape).curveTo(12.440999, 32.385, 12.358999, 32.385, 12.332, 32.361);
        ((GeneralPath) shape).curveTo(12.332, 32.334, 12.398, 32.307, 12.535, 32.279);
        ((GeneralPath) shape).curveTo(12.852, 32.225, 13.121, 32.279, 13.332, 32.439);
        ((GeneralPath) shape).curveTo(13.492, 32.521, 13.148, 32.559998, 12.292999, 32.559998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_97
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.574, 33.478);
        ((GeneralPath) shape).curveTo(19.0, 33.56, 19.293, 33.56, 19.453, 33.478);
        ((GeneralPath) shape).curveTo(19.508, 33.428, 19.453, 33.373, 19.293, 33.318);
        ((GeneralPath) shape).curveTo(19.16, 33.268, 19.012, 33.24, 18.852, 33.24);
        ((GeneralPath) shape).curveTo(18.640999, 33.24, 18.48, 33.252003, 18.375, 33.279003);
        ((GeneralPath) shape).curveTo(18.238, 33.334003, 18.309, 33.4, 18.574, 33.478004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_98
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.492, 33.158);
        ((GeneralPath) shape).curveTo(14.945, 33.24, 15.266, 33.24, 15.453, 33.158);
        ((GeneralPath) shape).curveTo(15.535, 33.107002, 15.4800005, 33.041, 15.293, 32.959);
        ((GeneralPath) shape).curveTo(15.133, 32.908, 14.961, 32.881, 14.773001, 32.881);
        ((GeneralPath) shape).curveTo(13.867001, 32.881, 13.773001, 32.975002, 14.492001, 33.158);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_99
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.574, 28.959);
        ((GeneralPath) shape).curveTo(9.758, 28.959, 9.867001, 28.932, 9.895, 28.881);
        ((GeneralPath) shape).curveTo(9.918, 28.799, 10.027, 28.775, 10.215, 28.799);
        ((GeneralPath) shape).curveTo(10.375, 28.799, 10.453, 28.842, 10.453, 28.92);
        ((GeneralPath) shape).curveTo(10.453, 28.998001, 10.332, 29.053, 10.094, 29.08);
        ((GeneralPath) shape).curveTo(9.559, 29.213, 9.078, 29.157999, 8.651999, 28.92);
        ((GeneralPath) shape).curveTo(8.469, 28.814, 8.440999, 28.705, 8.573999, 28.6);
        ((GeneralPath) shape).curveTo(8.733999, 28.494, 9.105, 28.439001, 9.690999, 28.439001);
        ((GeneralPath) shape).curveTo(10.308999, 28.412, 10.827999, 28.467001, 11.253999, 28.6);
        ((GeneralPath) shape).curveTo(11.6519985, 28.705, 11.894999, 28.826, 11.972999, 28.959);
        ((GeneralPath) shape).curveTo(12.132998, 29.225, 11.745998, 29.411999, 10.811998, 29.521);
        ((GeneralPath) shape).curveTo(10.253999, 29.572, 9.640999, 29.572, 8.972999, 29.521);
        ((GeneralPath) shape).curveTo(8.198998, 29.467, 7.5589986, 29.373, 7.0549984, 29.24);
        ((GeneralPath) shape).curveTo(5.5349984, 28.76, 4.3319983, 28.506, 3.4529984, 28.478);
        ((GeneralPath) shape).curveTo(2.9449983, 28.455, 2.5199983, 28.478, 2.1719985, 28.560001);
        ((GeneralPath) shape).curveTo(1.8009984, 28.639002, 1.7189984, 28.732002, 1.9339985, 28.842001);
        ((GeneralPath) shape).curveTo(2.4689984, 29.135, 3.0939984, 29.252, 3.8119984, 29.201);
        ((GeneralPath) shape).curveTo(4.558998, 29.146, 4.7339983, 29.053, 4.3319983, 28.92);
        ((GeneralPath) shape).curveTo(3.9059982, 28.705, 3.4799984, 28.654, 3.0549984, 28.76);
        ((GeneralPath) shape).curveTo(2.7069983, 28.842001, 2.8119984, 28.92, 3.3749983, 28.998001);
        ((GeneralPath) shape).curveTo(3.6679983, 28.998001, 3.7459984, 28.986002, 3.6129982, 28.959002);
        ((GeneralPath) shape).lineTo(3.2929983, 28.842001);
        ((GeneralPath) shape).lineTo(3.8119984, 28.842001);
        ((GeneralPath) shape).curveTo(3.9449983, 28.893002, 4.0269985, 28.932001, 4.0549984, 28.959002);
        ((GeneralPath) shape).curveTo(4.0549984, 29.014002, 3.9729984, 29.053001, 3.8119984, 29.080002);
        ((GeneralPath) shape).curveTo(3.3319983, 29.135002, 2.9059982, 29.080002, 2.5349984, 28.920002);
        ((GeneralPath) shape).curveTo(2.1879983, 28.814001, 2.2809985, 28.705002, 2.8119984, 28.600002);
        ((GeneralPath) shape).curveTo(3.0779984, 28.572002, 3.4919984, 28.600002, 4.0549984, 28.682003);
        ((GeneralPath) shape).curveTo(4.6909986, 28.760002, 5.2659984, 28.881002, 5.7729983, 29.041002);
        ((GeneralPath) shape).curveTo(7.077998, 29.467003, 8.331999, 29.693003, 9.534998, 29.721003);
        ((GeneralPath) shape).curveTo(10.784998, 29.721003, 11.6519985, 29.639002, 12.1329975, 29.478003);
        ((GeneralPath) shape).curveTo(12.452997, 29.373003, 12.5739975, 29.225002, 12.491998, 29.041002);
        ((GeneralPath) shape).curveTo(12.386998, 28.881002, 12.144998, 28.732002, 11.772998, 28.600002);
        ((GeneralPath) shape).curveTo(10.733997, 28.279003, 9.733997, 28.185001, 8.772998, 28.318003);
        ((GeneralPath) shape).curveTo(8.292998, 28.400003, 7.999998, 28.506002, 7.8949976, 28.639002);
        ((GeneralPath) shape).curveTo(7.7849975, 28.748001, 7.8519974, 28.853003, 8.093998, 28.959002);
        ((GeneralPath) shape).curveTo(8.651998, 29.279001, 9.308998, 29.385002, 10.054998, 29.279001);
        ((GeneralPath) shape).curveTo(10.933998, 29.225, 11.308998, 29.119001, 11.171998, 28.959002);
        ((GeneralPath) shape).curveTo(11.065998, 28.748001, 10.6519985, 28.639002, 9.933998, 28.639002);
        ((GeneralPath) shape).curveTo(9.667998, 28.611002, 9.452998, 28.627003, 9.292998, 28.682001);
        ((GeneralPath) shape).curveTo(9.104999, 28.732, 9.065998, 28.787, 9.171998, 28.842001);
        ((GeneralPath) shape).curveTo(9.253998, 28.893002, 9.386998, 28.932001, 9.573998, 28.959002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_100
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.492, 27.959);
        ((GeneralPath) shape).curveTo(6.492, 28.119, 6.828, 28.251999, 7.492, 28.361);
        ((GeneralPath) shape).curveTo(7.895, 28.439, 8.281, 28.412, 8.652, 28.279);
        ((GeneralPath) shape).curveTo(8.973001, 28.174, 8.934, 28.08, 8.535001, 27.998);
        ((GeneralPath) shape).curveTo(8.320001, 27.893, 8.055001, 27.865, 7.7340007, 27.92);
        ((GeneralPath) shape).curveTo(7.3870006, 27.975, 7.3200006, 28.025, 7.535001, 28.08);
        ((GeneralPath) shape).curveTo(7.6410007, 28.107, 7.719001, 28.107, 7.7730007, 28.08);
        ((GeneralPath) shape).curveTo(7.8520007, 28.08, 7.8520007, 28.064, 7.7730007, 28.041);
        ((GeneralPath) shape).curveTo(7.719001, 27.986, 7.758001, 27.959, 7.895001, 27.959);
        ((GeneralPath) shape).curveTo(8.027001, 27.959, 8.145, 27.986, 8.254001, 28.041);
        ((GeneralPath) shape).curveTo(8.387001, 28.064001, 8.402, 28.092001, 8.293, 28.119);
        ((GeneralPath) shape).curveTo(8.188001, 28.174, 8.027, 28.201, 7.8120003, 28.201);
        ((GeneralPath) shape).curveTo(7.492, 28.225, 7.1720004, 28.135, 6.852, 27.92);
        ((GeneralPath) shape).curveTo(6.801, 27.893, 6.7190003, 27.881, 6.6130004, 27.881);
        ((GeneralPath) shape).curveTo(6.5080004, 27.908, 6.4690003, 27.932001, 6.4920006, 27.959);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_101
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.613, 29.842);
        ((GeneralPath) shape).curveTo(5.9179997, 29.842, 5.469, 29.893, 5.2539997, 29.998);
        ((GeneralPath) shape).curveTo(5.2269998, 30.025, 5.2539997, 30.053, 5.332, 30.08);
        ((GeneralPath) shape).curveTo(5.4139996, 30.107, 5.4919996, 30.107, 5.574, 30.08);
        ((GeneralPath) shape).curveTo(6.105, 29.975, 6.4919996, 29.932, 6.7339997, 29.959);
        ((GeneralPath) shape).curveTo(7.2149997, 30.064, 7.2809997, 30.146, 6.9339995, 30.201);
        ((GeneralPath) shape).curveTo(6.3479996, 30.201, 6.2149997, 30.174, 6.5349994, 30.119);
        ((GeneralPath) shape).curveTo(6.6679993, 30.119, 6.6129994, 30.092, 6.3749995, 30.041);
        ((GeneralPath) shape).curveTo(6.0779996, 30.092001, 6.0659995, 30.146, 6.3319993, 30.201);
        ((GeneralPath) shape).curveTo(6.4689994, 30.252, 6.7339993, 30.279, 7.1329994, 30.279);
        ((GeneralPath) shape).curveTo(7.5589995, 30.201, 7.7069993, 30.119, 7.5739994, 30.040998);
        ((GeneralPath) shape).curveTo(7.3319993, 29.852999, 7.0119996, 29.786999, 6.6129994, 29.842);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_102
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.574, 28.521);
        ((GeneralPath) shape).curveTo(6.895, 28.385, 6.652, 28.295, 5.8519998, 28.24);
        ((GeneralPath) shape).curveTo(5.3199997, 28.24, 5.121, 28.307, 5.2539997, 28.439);
        ((GeneralPath) shape).curveTo(5.547, 28.599998, 5.988, 28.626999, 6.574, 28.521);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_103
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.375, 29.4);
        ((GeneralPath) shape).curveTo(4.668, 29.588, 5.094, 29.626999, 5.652, 29.521);
        ((GeneralPath) shape).curveTo(5.945, 29.385, 5.707, 29.295, 4.934, 29.24);
        ((GeneralPath) shape).curveTo(4.719, 29.24, 4.547, 29.268, 4.414, 29.317999);
        ((GeneralPath) shape).curveTo(4.309, 29.345999, 4.293, 29.373, 4.375, 29.4);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_104
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.652, 14.959);
        ((GeneralPath) shape).curveTo(3.4689999, 15.228, 3.4919999, 15.478, 3.734, 15.721);
        ((GeneralPath) shape).lineTo(12.332, 23.639);
        ((GeneralPath) shape).curveTo(12.547, 23.853, 12.745999, 23.814, 12.934, 23.521);
        ((GeneralPath) shape).lineTo(20.375, 12.959);
        ((GeneralPath) shape).curveTo(20.586, 12.665999, 20.574, 12.4279995, 20.332, 12.24);
        ((GeneralPath) shape).lineTo(11.734001, 4.279);
        ((GeneralPath) shape).curveTo(11.492002, 4.0959997, 11.281001, 4.1349998, 11.094001, 4.3999996);
        ((GeneralPath) shape).lineTo(3.652001, 14.959);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4.691, 15.559999);
        ((GeneralPath) shape).curveTo(4.453, 15.372999, 4.441, 15.146, 4.652, 14.881);
        ((GeneralPath) shape).lineTo(11.375, 5.2789993);
        ((GeneralPath) shape).curveTo(11.559, 5.0409994, 11.746, 5.0139995, 11.934, 5.2009993);
        ((GeneralPath) shape).lineTo(19.734001, 12.278999);
        ((GeneralPath) shape).curveTo(19.945002, 12.4939995, 19.961, 12.721, 19.773, 12.959);
        ((GeneralPath) shape).lineTo(12.895, 22.759998);
        ((GeneralPath) shape).curveTo(12.707001, 23.052998, 12.508, 23.092, 12.293, 22.880999);
        ((GeneralPath) shape).lineTo(4.691, 15.5599985);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9D874D));
        g.fill(shape);

        // _0_0_0_105
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.895, 18.521);
        ((GeneralPath) shape).curveTo(11.973001, 18.6, 12.066, 18.588, 12.172001, 18.478);
        ((GeneralPath) shape).lineTo(15.652, 13.682001);
        ((GeneralPath) shape).curveTo(15.758, 13.572001, 15.758, 13.467001, 15.652, 13.361001);
        ((GeneralPath) shape).lineTo(11.613001, 9.760001);
        ((GeneralPath) shape).curveTo(11.508001, 9.709002, 11.4140005, 9.732001, 11.332001, 9.842001);
        ((GeneralPath) shape).lineTo(7.8520007, 14.6);
        ((GeneralPath) shape).curveTo(7.7730007, 14.732, 7.7730007, 14.842, 7.8520007, 14.92);
        ((GeneralPath) shape).lineTo(11.895, 18.521);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(12.254001, 17.92);
        ((GeneralPath) shape).curveTo(12.148001, 18.025, 12.066001, 18.041, 12.012001, 17.959);
        ((GeneralPath) shape).lineTo(8.613001, 14.841999);
        ((GeneralPath) shape).curveTo(8.535001, 14.759999, 8.52, 14.653999, 8.574001, 14.520999);
        ((GeneralPath) shape).lineTo(11.574001, 10.4);
        ((GeneralPath) shape).curveTo(11.680001, 10.295, 11.773002, 10.278999, 11.852001, 10.361);
        ((GeneralPath) shape).lineTo(15.293001, 13.4);
        ((GeneralPath) shape).curveTo(15.375001, 13.481999, 15.387001, 13.587999, 15.332001, 13.721);
        ((GeneralPath) shape).lineTo(12.254001, 17.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_106
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.535, 15.279);
        ((GeneralPath) shape).curveTo(3.453, 15.389, 3.426, 15.5060005, 3.453, 15.639);
        ((GeneralPath) shape).curveTo(3.453, 15.799, 3.492, 15.92, 3.5740001, 15.998);
        ((GeneralPath) shape).lineTo(12.172, 23.92);
        ((GeneralPath) shape).curveTo(12.414, 24.107, 12.625, 24.08, 12.812, 23.842001);
        ((GeneralPath) shape).lineTo(20.254, 13.240001);
        ((GeneralPath) shape).curveTo(20.441, 12.975, 20.426, 12.732, 20.215, 12.521001);
        ((GeneralPath) shape).lineTo(11.613, 4.600001);
        ((GeneralPath) shape).curveTo(11.398, 4.3850007, 11.188, 4.4120007, 10.973, 4.6820006);
        ((GeneralPath) shape).lineTo(3.5349994, 15.279001);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4.535, 15.8810005);
        ((GeneralPath) shape).curveTo(4.375, 15.666, 4.3589997, 15.428, 4.4919996, 15.158001);
        ((GeneralPath) shape).lineTo(11.254, 5.5600014);
        ((GeneralPath) shape).curveTo(11.309, 5.4550014, 11.401999, 5.4000015, 11.535, 5.4000015);
        ((GeneralPath) shape).curveTo(11.641, 5.3730016, 11.734, 5.4000015, 11.812, 5.4820013);
        ((GeneralPath) shape).lineTo(19.613, 12.560001);
        ((GeneralPath) shape).curveTo(19.828001, 12.775002, 19.84, 13.002002, 19.652, 13.240002);
        ((GeneralPath) shape).lineTo(12.734, 23.080002);
        ((GeneralPath) shape).curveTo(12.68, 23.189001, 12.586, 23.240002, 12.453, 23.240002);
        ((GeneralPath) shape).curveTo(12.348001, 23.268002, 12.254, 23.240002, 12.172, 23.162003);
        ((GeneralPath) shape).lineTo(4.535, 15.881002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x574927));
        g.fill(shape);

        // _0_0_0_107
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.332, 20.842);
        ((GeneralPath) shape).lineTo(14.973, 20.040998);
        ((GeneralPath) shape).curveTo(15.16, 19.798998, 15.48, 19.520998, 15.934, 19.200998);
        ((GeneralPath) shape).lineTo(16.613, 18.399998);
        ((GeneralPath) shape).lineTo(20.254002, 13.239998);
        ((GeneralPath) shape).curveTo(20.441002, 12.9749975, 20.426003, 12.7319975, 20.215002, 12.520998);
        ((GeneralPath) shape).lineTo(20.094002, 12.399998);
        ((GeneralPath) shape).lineTo(19.934002, 12.559998);
        ((GeneralPath) shape).lineTo(20.012001, 12.759997);
        ((GeneralPath) shape).curveTo(20.066002, 12.946998, 19.961, 13.091997, 19.691002, 13.200997);
        ((GeneralPath) shape).lineTo(19.652002, 13.239997);
        ((GeneralPath) shape).lineTo(14.332003, 20.841997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x493D20));
        g.fill(shape);

        // _0_0_0_108
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.535, 15.881);
        ((GeneralPath) shape).lineTo(4.414, 15.521);
        ((GeneralPath) shape).curveTo(4.281, 15.521, 4.105, 15.455, 3.895, 15.318);
        ((GeneralPath) shape).lineTo(3.652, 15.08);
        ((GeneralPath) shape).lineTo(3.5349998, 15.279);
        ((GeneralPath) shape).curveTo(3.4529998, 15.412001, 3.4259999, 15.56, 3.4529998, 15.721001);
        ((GeneralPath) shape).lineTo(4.094, 16.279001);
        ((GeneralPath) shape).curveTo(4.652, 16.760002, 5.078, 17.185001, 5.375, 17.560001);
        ((GeneralPath) shape).curveTo(5.613, 17.853, 6.0, 18.240002, 6.535, 18.721);
        ((GeneralPath) shape).lineTo(6.691, 18.842001);
        ((GeneralPath) shape).lineTo(8.492, 20.521002);
        ((GeneralPath) shape).curveTo(8.573999, 20.572002, 8.785, 20.693003, 9.132999, 20.881002);
        ((GeneralPath) shape).curveTo(9.254, 20.939003, 9.358999, 20.998003, 9.452999, 21.060003);
        ((GeneralPath) shape).curveTo(9.206999, 20.842003, 8.968999, 20.572002, 8.733999, 20.240004);
        ((GeneralPath) shape).curveTo(8.468999, 19.893003, 8.331999, 19.682003, 8.331999, 19.600004);
        ((GeneralPath) shape).lineTo(8.573998, 19.721004);
        ((GeneralPath) shape).lineTo(4.5349984, 15.881004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_109
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.691, 11.998);
        ((GeneralPath) shape).lineTo(6.734, 11.998);
        ((GeneralPath) shape).lineTo(11.254, 5.56);
        ((GeneralPath) shape).curveTo(11.309, 5.4509997, 11.401999, 5.4, 11.535, 5.4);
        ((GeneralPath) shape).curveTo(11.641, 5.373, 11.734, 5.4, 11.812, 5.478);
        ((GeneralPath) shape).lineTo(12.332001, 5.92);
        ((GeneralPath) shape).lineTo(11.934001, 5.361);
        ((GeneralPath) shape).curveTo(12.121001, 5.334, 12.332001, 5.455, 12.574001, 5.721);
        ((GeneralPath) shape).curveTo(12.707002, 5.881, 12.867002, 6.092, 13.055001, 6.361);
        ((GeneralPath) shape).curveTo(13.188002, 6.494, 13.680001, 6.959, 14.535002, 7.76);
        ((GeneralPath) shape).lineTo(18.332, 11.002001);
        ((GeneralPath) shape).lineTo(18.734001, 11.240001);
        ((GeneralPath) shape).lineTo(17.012001, 9.56);
        ((GeneralPath) shape).curveTo(16.559002, 9.295, 16.238, 9.068001, 16.055, 8.8810005);
        ((GeneralPath) shape).lineTo(14.172, 7.3610005);
        ((GeneralPath) shape).lineTo(12.734, 5.8420005);
        ((GeneralPath) shape).curveTo(12.387, 5.4120007, 12.066, 5.1850004, 11.773, 5.1580005);
        ((GeneralPath) shape).curveTo(11.613, 5.1310005, 11.441, 5.2400002, 11.254, 5.4780006);
        ((GeneralPath) shape).curveTo(11.039, 5.7990007, 10.801, 6.0640006, 10.535, 6.2790008);
        ((GeneralPath) shape).curveTo(9.812, 6.9980006, 9.082, 7.8650007, 8.332, 8.8810005);
        ((GeneralPath) shape).curveTo(7.8789997, 9.494, 7.586, 9.971001, 7.4529996, 10.318001);
        ((GeneralPath) shape).lineTo(7.0939994, 11.279001);
        ((GeneralPath) shape).curveTo(7.0389996, 11.467001, 6.905999, 11.705001, 6.6909995, 11.998001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_110
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.691, 13.201);
        ((GeneralPath) shape).curveTo(19.961, 13.092, 20.066, 12.9470005, 20.012, 12.76);
        ((GeneralPath) shape).lineTo(19.934, 12.56);
        ((GeneralPath) shape).lineTo(19.934, 12.518001);
        ((GeneralPath) shape).lineTo(19.852, 12.678);
        ((GeneralPath) shape).lineTo(19.734, 12.76);
        ((GeneralPath) shape).curveTo(19.762, 12.893001, 19.745998, 13.041, 19.691, 13.201);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_111
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.375, 17.56);
        ((GeneralPath) shape).curveTo(5.078, 17.185, 4.652, 16.76, 4.094, 16.279);
        ((GeneralPath) shape).lineTo(3.4529998, 15.721);
        ((GeneralPath) shape).curveTo(3.4529998, 15.825999, 3.4919999, 15.92, 3.574, 16.001999);
        ((GeneralPath) shape).lineTo(5.793, 18.021);
        ((GeneralPath) shape).curveTo(5.625, 17.85, 5.484, 17.697, 5.375, 17.56);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3A311A));
        g.fill(shape);

        // _0_0_0_112
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.613, 18.4);
        ((GeneralPath) shape).lineTo(15.934001, 19.201);
        ((GeneralPath) shape).curveTo(15.480001, 19.521, 15.160001, 19.799, 14.973001, 20.041);
        ((GeneralPath) shape).lineTo(12.734, 23.08);
        ((GeneralPath) shape).curveTo(12.68, 23.185, 12.586, 23.24, 12.453, 23.24);
        ((GeneralPath) shape).curveTo(12.348001, 23.268, 12.254, 23.24, 12.172, 23.157999);
        ((GeneralPath) shape).lineTo(8.573999, 19.720999);
        ((GeneralPath) shape).lineTo(8.332, 19.599998);
        ((GeneralPath) shape).curveTo(8.332, 19.682, 8.469, 19.892998, 8.734, 20.239998);
        ((GeneralPath) shape).curveTo(8.969, 20.571999, 9.207, 20.841997, 9.453, 21.059998);
        ((GeneralPath) shape).curveTo(9.359, 20.997997, 9.254, 20.938997, 9.133, 20.880997);
        ((GeneralPath) shape).curveTo(8.785001, 20.692997, 8.574, 20.571997, 8.492001, 20.520996);
        ((GeneralPath) shape).lineTo(12.172001, 23.919996);
        ((GeneralPath) shape).curveTo(12.4140005, 24.106997, 12.625001, 24.079996, 12.812001, 23.841997);
        ((GeneralPath) shape).lineTo(16.613, 18.399998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_113
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.852, 12.682);
        ((GeneralPath) shape).lineTo(19.934, 12.521);
        ((GeneralPath) shape).lineTo(19.934, 12.361);
        ((GeneralPath) shape).lineTo(19.895, 12.24);
        ((GeneralPath) shape).lineTo(18.895, 11.278999);
        ((GeneralPath) shape).lineTo(18.734001, 11.24);
        ((GeneralPath) shape).lineTo(18.332, 10.998);
        ((GeneralPath) shape).lineTo(14.535001, 7.76);
        ((GeneralPath) shape).curveTo(13.68, 6.959, 13.188001, 6.4940004, 13.055, 6.361);
        ((GeneralPath) shape).curveTo(12.867001, 6.092, 12.707001, 5.881, 12.574, 5.721);
        ((GeneralPath) shape).curveTo(12.332001, 5.4550004, 12.121, 5.334, 11.934, 5.361);
        ((GeneralPath) shape).lineTo(12.332, 5.92);
        ((GeneralPath) shape).lineTo(19.612999, 12.559999);
        ((GeneralPath) shape).lineTo(19.734, 12.759999);
        ((GeneralPath) shape).lineTo(19.852, 12.681999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_114
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.773, 18.799);
        ((GeneralPath) shape).curveTo(11.879, 18.907999, 11.973, 18.893, 12.054999, 18.76);
        ((GeneralPath) shape).lineTo(15.535, 13.998);
        ((GeneralPath) shape).curveTo(15.641, 13.865, 15.641, 13.748, 15.535, 13.639);
        ((GeneralPath) shape).lineTo(11.492, 10.08);
        ((GeneralPath) shape).curveTo(11.387, 9.975, 11.280999, 9.986, 11.172, 10.1189995);
        ((GeneralPath) shape).lineTo(7.691, 14.92);
        ((GeneralPath) shape).curveTo(7.613, 15.002, 7.625, 15.107, 7.734, 15.24);
        ((GeneralPath) shape).lineTo(11.773001, 18.799);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(12.132999, 18.201);
        ((GeneralPath) shape).curveTo(12.054999, 18.334, 11.9609995, 18.346, 11.851999, 18.24);
        ((GeneralPath) shape).lineTo(8.492, 15.1189995);
        ((GeneralPath) shape).curveTo(8.414, 15.040999, 8.398, 14.931999, 8.453, 14.799);
        ((GeneralPath) shape).lineTo(11.453, 10.721);
        ((GeneralPath) shape).curveTo(11.535, 10.615, 11.613, 10.599999, 11.691, 10.682);
        ((GeneralPath) shape).lineTo(15.172, 13.721001);
        ((GeneralPath) shape).curveTo(15.309, 13.771001, 15.309, 13.865001, 15.172, 14.002001);
        ((GeneralPath) shape).lineTo(12.132999, 18.201);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x574927));
        g.fill(shape);

        // _0_0_0_115
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.215, 16.4);
        ((GeneralPath) shape).curveTo(9.719, 16.771, 10.078, 16.986, 10.293, 17.041);
        ((GeneralPath) shape).lineTo(10.254001, 16.76);
        ((GeneralPath) shape).lineTo(8.492001, 15.119);
        ((GeneralPath) shape).curveTo(8.4140005, 15.041, 8.398001, 14.932, 8.453001, 14.799001);
        ((GeneralPath) shape).lineTo(8.734001, 14.439001);
        ((GeneralPath) shape).curveTo(8.625001, 14.389001, 8.547001, 14.307001, 8.492002, 14.201001);
        ((GeneralPath) shape).curveTo(8.469002, 14.068001, 8.469002, 13.947001, 8.492002, 13.842001);
        ((GeneralPath) shape).lineTo(7.6910014, 14.920001);
        ((GeneralPath) shape).lineTo(7.6910014, 14.959001);
        ((GeneralPath) shape).lineTo(7.773001, 15.119);
        ((GeneralPath) shape).curveTo(7.8240013, 15.228001, 7.9880013, 15.373, 8.254002, 15.56);
        ((GeneralPath) shape).lineTo(9.215002, 16.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x493D20));
        g.fill(shape);

        // _0_0_0_116
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.414, 11.842);
        ((GeneralPath) shape).lineTo(13.613, 11.959);
        ((GeneralPath) shape).lineTo(12.375, 10.842);
        ((GeneralPath) shape).lineTo(12.094, 10.721);
        ((GeneralPath) shape).curveTo(11.934, 10.615, 11.773, 10.545, 11.613, 10.521);
        ((GeneralPath) shape).curveTo(11.398, 10.521, 11.309, 10.627, 11.332, 10.842);
        ((GeneralPath) shape).lineTo(11.453, 10.721);
        ((GeneralPath) shape).curveTo(11.535, 10.615, 11.613, 10.599999, 11.691, 10.682);
        ((GeneralPath) shape).lineTo(12.691, 11.521);
        ((GeneralPath) shape).lineTo(13.414, 11.842);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_117
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.133, 18.201);
        ((GeneralPath) shape).curveTo(12.055, 18.334, 11.961, 18.346, 11.852, 18.24);
        ((GeneralPath) shape).lineTo(10.254, 16.76);
        ((GeneralPath) shape).lineTo(10.292999, 17.041);
        ((GeneralPath) shape).curveTo(10.077999, 16.986, 9.718999, 16.775, 9.214999, 16.4);
        ((GeneralPath) shape).lineTo(8.253999, 15.559999);
        ((GeneralPath) shape).curveTo(7.987999, 15.372999, 7.8279986, 15.224999, 7.772999, 15.1189995);
        ((GeneralPath) shape).lineTo(7.690999, 14.959);
        ((GeneralPath) shape).curveTo(7.6679993, 15.063999, 7.679999, 15.158, 7.7339993, 15.24);
        ((GeneralPath) shape).lineTo(11.772999, 18.799);
        ((GeneralPath) shape).curveTo(11.878999, 18.907999, 11.972999, 18.893, 12.054998, 18.76);
        ((GeneralPath) shape).lineTo(15.534998, 13.998);
        ((GeneralPath) shape).curveTo(15.640998, 13.865, 15.640998, 13.748, 15.534998, 13.639);
        ((GeneralPath) shape).lineTo(13.612998, 11.959);
        ((GeneralPath) shape).lineTo(13.413998, 11.842);
        ((GeneralPath) shape).lineTo(12.690998, 11.521);
        ((GeneralPath) shape).lineTo(15.171998, 13.721);
        ((GeneralPath) shape).curveTo(15.308998, 13.771, 15.308998, 13.865, 15.171998, 14.002);
        ((GeneralPath) shape).lineTo(12.1329975, 18.201);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3A311A));
        g.fill(shape);

        // _0_0_0_118
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.215, 14.041);
        ((GeneralPath) shape).curveTo(13.215, 13.588, 13.094, 13.201, 12.852, 12.8810005);
        ((GeneralPath) shape).curveTo(12.613, 12.56, 12.320001, 12.400001, 11.973001, 12.400001);
        ((GeneralPath) shape).curveTo(11.625001, 12.400001, 11.348001, 12.56, 11.133, 12.8810005);
        ((GeneralPath) shape).curveTo(10.895, 13.201, 10.773001, 13.588, 10.773001, 14.041);
        ((GeneralPath) shape).curveTo(10.773001, 14.494, 10.895, 14.8810005, 11.133, 15.201);
        ((GeneralPath) shape).curveTo(11.348001, 15.518001, 11.625, 15.682, 11.973001, 15.682);
        ((GeneralPath) shape).curveTo(12.320001, 15.682, 12.613001, 15.521, 12.852, 15.201);
        ((GeneralPath) shape).curveTo(13.094, 14.8810005, 13.215, 14.494, 13.215, 14.041);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9D874D));
        g.fill(shape);

        // _0_0_0_119
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.613, 13.201);
        ((GeneralPath) shape).curveTo(18.613, 12.748, 18.492, 12.357, 18.254002, 12.041);
        ((GeneralPath) shape).curveTo(18.012001, 11.721001, 17.719002, 11.56, 17.375002, 11.56);
        ((GeneralPath) shape).curveTo(17.027002, 11.56, 16.734001, 11.721001, 16.492002, 12.041);
        ((GeneralPath) shape).curveTo(16.254002, 12.357, 16.133003, 12.748, 16.133003, 13.201);
        ((GeneralPath) shape).curveTo(16.133003, 13.654, 16.254004, 14.041, 16.492002, 14.357);
        ((GeneralPath) shape).curveTo(16.734003, 14.678, 17.027002, 14.842, 17.375002, 14.842);
        ((GeneralPath) shape).curveTo(17.719002, 14.842, 18.012001, 14.682, 18.254002, 14.357);
        ((GeneralPath) shape).curveTo(18.492002, 14.041, 18.613, 13.654, 18.613, 13.201);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_120
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.973, 7.76);
        ((GeneralPath) shape).curveTo(12.973, 7.307, 12.851999, 6.92, 12.613, 6.6000004);
        ((GeneralPath) shape).curveTo(12.398, 6.2790003, 12.121, 6.1190004, 11.773, 6.1190004);
        ((GeneralPath) shape).curveTo(11.426, 6.1190004, 11.132999, 6.2790003, 10.8949995, 6.6000004);
        ((GeneralPath) shape).curveTo(10.651999, 6.9200006, 10.535, 7.307, 10.535, 7.76);
        ((GeneralPath) shape).curveTo(10.535, 8.213, 10.651999, 8.6, 10.8949995, 8.92);
        ((GeneralPath) shape).curveTo(11.132999, 9.24, 11.426, 9.4, 11.773, 9.4);
        ((GeneralPath) shape).curveTo(12.120999, 9.4, 12.398, 9.24, 12.613, 8.92);
        ((GeneralPath) shape).curveTo(12.852, 8.6, 12.973, 8.213, 12.973, 7.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_121
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.934, 14.4);
        ((GeneralPath) shape).curveTo(12.934, 13.947, 12.812, 13.572, 12.574, 13.278999);
        ((GeneralPath) shape).curveTo(12.359, 12.959, 12.078, 12.799, 11.734, 12.799);
        ((GeneralPath) shape).curveTo(11.387, 12.799, 11.094, 12.959, 10.852, 13.278999);
        ((GeneralPath) shape).curveTo(10.613, 13.572, 10.492001, 13.947, 10.492001, 14.4);
        ((GeneralPath) shape).curveTo(10.492001, 14.853, 10.613001, 15.24, 10.852, 15.559999);
        ((GeneralPath) shape).curveTo(11.094, 15.881, 11.387, 16.041, 11.734, 16.041);
        ((GeneralPath) shape).curveTo(12.082, 16.041, 12.359, 15.8810005, 12.574, 15.56);
        ((GeneralPath) shape).curveTo(12.812, 15.240001, 12.934, 14.853001, 12.934, 14.400001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x574927));
        g.fill(shape);

        // _0_0_0_122
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.332, 13.56);
        ((GeneralPath) shape).curveTo(18.332, 13.107, 18.215, 12.732, 17.973001, 12.439);
        ((GeneralPath) shape).curveTo(17.734001, 12.119, 17.441002, 11.959001, 17.094002, 11.959001);
        ((GeneralPath) shape).curveTo(16.746002, 11.959001, 16.469002, 12.119, 16.254002, 12.439);
        ((GeneralPath) shape).curveTo(16.012001, 12.732, 15.895001, 13.107, 15.895001, 13.56);
        ((GeneralPath) shape).curveTo(15.895001, 14.014, 16.012001, 14.400001, 16.254002, 14.721001);
        ((GeneralPath) shape).curveTo(16.469002, 15.041, 16.746002, 15.201, 17.094002, 15.201);
        ((GeneralPath) shape).curveTo(17.441002, 15.201, 17.734001, 15.041, 17.973001, 14.721001);
        ((GeneralPath) shape).curveTo(18.215002, 14.400001, 18.332, 14.014001, 18.332, 13.56);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_123
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.734, 8.119);
        ((GeneralPath) shape).curveTo(12.734, 7.6660004, 12.613, 7.2790003, 12.375, 6.9590006);
        ((GeneralPath) shape).curveTo(12.133, 6.6430006, 11.84, 6.4780006, 11.492, 6.4780006);
        ((GeneralPath) shape).curveTo(11.1449995, 6.4780006, 10.851999, 6.6390004, 10.613, 6.9590006);
        ((GeneralPath) shape).curveTo(10.375, 7.2790008, 10.254, 7.6660004, 10.254, 8.119);
        ((GeneralPath) shape).curveTo(10.254, 8.5720005, 10.375, 8.959001, 10.613, 9.279);
        ((GeneralPath) shape).curveTo(10.852, 9.6, 11.148, 9.76, 11.492, 9.76);
        ((GeneralPath) shape).curveTo(11.839999, 9.76, 12.132999, 9.6, 12.375, 9.279);
        ((GeneralPath) shape).curveTo(12.613, 8.959001, 12.734, 8.5720005, 12.734, 8.119);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_124
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.574, 15.56);
        ((GeneralPath) shape).curveTo(12.812, 15.240001, 12.934, 14.853001, 12.934, 14.400001);
        ((GeneralPath) shape).curveTo(12.934, 13.6, 12.668, 13.092001, 12.133, 12.8810005);
        ((GeneralPath) shape).lineTo(12.012, 12.959001);
        ((GeneralPath) shape).curveTo(11.828, 13.041, 11.719, 13.146001, 11.691, 13.279);
        ((GeneralPath) shape).curveTo(11.668, 13.334001, 11.68, 13.428, 11.734, 13.56);
        ((GeneralPath) shape).lineTo(11.812, 13.643001);
        ((GeneralPath) shape).curveTo(11.945001, 13.748, 12.012, 13.893001, 12.012, 14.080001);
        ((GeneralPath) shape).curveTo(12.012, 14.268001, 11.945, 14.412001, 11.812, 14.521001);
        ((GeneralPath) shape).curveTo(11.574, 14.732001, 11.332001, 14.748001, 11.094, 14.56);
        ((GeneralPath) shape).curveTo(10.852, 14.400001, 10.68, 14.174001, 10.573999, 13.8810005);
        ((GeneralPath) shape).lineTo(10.492, 14.400001);
        ((GeneralPath) shape).curveTo(10.492, 14.853001, 10.613, 15.240001, 10.851999, 15.56);
        ((GeneralPath) shape).curveTo(11.093999, 15.8810005, 11.386999, 16.041, 11.733999, 16.041);
        ((GeneralPath) shape).curveTo(12.077999, 16.041, 12.358999, 15.8810005, 12.573999, 15.56);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x493D20));
        g.fill(shape);

        // _0_0_0_125
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.973, 14.721);
        ((GeneralPath) shape).curveTo(18.215, 14.4, 18.331999, 14.014, 18.331999, 13.559999);
        ((GeneralPath) shape).curveTo(18.331999, 13.106999, 18.214998, 12.731999, 17.973, 12.438999);
        ((GeneralPath) shape).curveTo(17.734, 12.1189995, 17.441, 11.959, 17.094, 11.959);
        ((GeneralPath) shape).curveTo(16.934, 11.959, 16.812, 11.986, 16.734, 12.040999);
        ((GeneralPath) shape).curveTo(17.081999, 12.174, 17.293, 12.415999, 17.375, 12.759999);
        ((GeneralPath) shape).curveTo(17.48, 13.079999, 17.414, 13.4, 17.172, 13.721);
        ((GeneralPath) shape).curveTo(17.066, 13.853, 16.918001, 13.908, 16.734001, 13.881);
        ((GeneralPath) shape).curveTo(16.547, 13.881, 16.387001, 13.825999, 16.254002, 13.721);
        ((GeneralPath) shape).curveTo(16.094002, 13.587999, 15.988002, 13.4, 15.934002, 13.158);
        ((GeneralPath) shape).lineTo(15.895002, 13.56);
        ((GeneralPath) shape).curveTo(15.895002, 14.014, 16.012003, 14.400001, 16.254002, 14.721001);
        ((GeneralPath) shape).curveTo(16.469002, 15.041, 16.746002, 15.201, 17.094002, 15.201);
        ((GeneralPath) shape).curveTo(17.441002, 15.201, 17.734001, 15.041, 17.973001, 14.721001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_126
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.613, 9.279);
        ((GeneralPath) shape).curveTo(10.852, 9.6, 11.148, 9.76, 11.492, 9.76);
        ((GeneralPath) shape).curveTo(11.839999, 9.76, 12.132999, 9.6, 12.375, 9.279);
        ((GeneralPath) shape).curveTo(12.613, 8.959001, 12.734, 8.5720005, 12.734, 8.119);
        ((GeneralPath) shape).curveTo(12.734, 7.6930003, 12.613, 7.3180003, 12.375, 7.0020003);
        ((GeneralPath) shape).curveTo(12.16, 6.709, 11.879, 6.5490003, 11.535, 6.5210004);
        ((GeneralPath) shape).curveTo(11.828, 7.135, 11.812, 7.6150002, 11.492, 7.9590006);
        ((GeneralPath) shape).curveTo(11.280999, 8.174001, 11.012, 8.240001, 10.691, 8.158001);
        ((GeneralPath) shape).lineTo(10.414, 8.080001);
        ((GeneralPath) shape).curveTo(10.332, 8.025001, 10.292999, 7.975001, 10.292999, 7.920001);
        ((GeneralPath) shape).lineTo(10.254, 8.119001);
        ((GeneralPath) shape).curveTo(10.254, 8.572001, 10.375, 8.959002, 10.613, 9.279001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_127
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.574, 15.56);
        ((GeneralPath) shape).curveTo(12.812, 15.240001, 12.934, 14.853001, 12.934, 14.400001);
        ((GeneralPath) shape).curveTo(12.934, 13.6, 12.668, 13.092001, 12.133, 12.8810005);
        ((GeneralPath) shape).lineTo(12.012, 12.959001);
        ((GeneralPath) shape).curveTo(11.828, 13.041, 11.719, 13.146001, 11.691, 13.279);
        ((GeneralPath) shape).curveTo(11.668, 13.334001, 11.68, 13.428, 11.734, 13.56);
        ((GeneralPath) shape).lineTo(11.934, 13.478001);
        ((GeneralPath) shape).curveTo(12.039, 13.455001, 12.148, 13.467001, 12.254, 13.521001);
        ((GeneralPath) shape).curveTo(12.332, 13.5720005, 12.387, 13.639001, 12.414, 13.721001);
        ((GeneralPath) shape).curveTo(12.601999, 14.279, 12.414, 14.705001, 11.851999, 15.002001);
        ((GeneralPath) shape).curveTo(11.32, 15.295001, 10.879, 15.228001, 10.534999, 14.799001);
        ((GeneralPath) shape).curveTo(10.585999, 15.174001, 10.733999, 15.467001, 10.972999, 15.682001);
        ((GeneralPath) shape).curveTo(11.187999, 15.920001, 11.440999, 16.041, 11.733998, 16.041);
        ((GeneralPath) shape).curveTo(12.077998, 16.041, 12.358998, 15.8810005, 12.573998, 15.56);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3A311A));
        g.fill(shape);

        // _0_0_0_128
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.973, 14.721);
        ((GeneralPath) shape).curveTo(18.215, 14.4, 18.331999, 14.014, 18.331999, 13.559999);
        ((GeneralPath) shape).curveTo(18.331999, 12.865, 18.105, 12.389, 17.651999, 12.1189995);
        ((GeneralPath) shape).curveTo(17.918, 12.544999, 17.987999, 13.014, 17.852, 13.521);
        ((GeneralPath) shape).curveTo(17.745998, 13.92, 17.519999, 14.184999, 17.171999, 14.318);
        ((GeneralPath) shape).curveTo(16.824, 14.4279995, 16.48, 14.373, 16.133, 14.158);
        ((GeneralPath) shape).curveTo(15.973, 14.053, 15.917999, 13.908, 15.973, 13.721);
        ((GeneralPath) shape).lineTo(15.934, 13.721);
        ((GeneralPath) shape).lineTo(15.895, 13.682);
        ((GeneralPath) shape).curveTo(15.918, 14.107, 16.039, 14.467, 16.254, 14.76);
        ((GeneralPath) shape).curveTo(16.492, 15.053, 16.772999, 15.201, 17.094, 15.201);
        ((GeneralPath) shape).curveTo(17.441, 15.201, 17.734, 15.041, 17.973, 14.721001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_129
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.492, 7.201);
        ((GeneralPath) shape).curveTo(12.492, 7.682, 12.280999, 8.092, 11.851999, 8.439);
        ((GeneralPath) shape).curveTo(11.48, 8.732, 11.011999, 8.908, 10.452999, 8.959);
        ((GeneralPath) shape).curveTo(10.667999, 9.4939995, 11.011999, 9.759999, 11.491999, 9.759999);
        ((GeneralPath) shape).curveTo(11.839998, 9.759999, 12.132998, 9.599999, 12.374999, 9.278999);
        ((GeneralPath) shape).curveTo(12.612999, 8.959, 12.733999, 8.572, 12.733999, 8.1189995);
        ((GeneralPath) shape).curveTo(12.733999, 7.8259993, 12.651999, 7.5209994, 12.492, 7.2009993);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_130
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.453, 29.4);
        ((GeneralPath) shape).curveTo(37.453, 29.185, 37.508, 29.041, 37.613, 28.959);
        ((GeneralPath) shape).curveTo(37.718998, 28.907999, 37.812, 28.92, 37.895, 28.998);
        ((GeneralPath) shape).curveTo(37.973, 29.08, 38.027, 29.185, 38.055, 29.317999);
        ((GeneralPath) shape).curveTo(38.078, 29.428, 38.078, 29.477999, 38.055, 29.477999);
        ((GeneralPath) shape).curveTo(38.0, 29.477999, 37.906002, 29.428, 37.773, 29.317999);
        ((GeneralPath) shape).curveTo(37.718998, 29.268, 37.690998, 29.279, 37.690998, 29.360998);
        ((GeneralPath) shape).curveTo(37.690998, 29.411999, 37.718998, 29.505999, 37.773, 29.638998);
        ((GeneralPath) shape).curveTo(37.855, 29.774998, 37.948997, 29.841997, 38.055, 29.841997);
        ((GeneralPath) shape).curveTo(38.188, 29.841997, 38.27, 29.747997, 38.293, 29.559998);
        ((GeneralPath) shape).curveTo(38.348, 29.345997, 38.309, 29.134998, 38.176, 28.919998);
        ((GeneralPath) shape).curveTo(38.043, 28.704998, 37.867, 28.587997, 37.656, 28.559998);
        ((GeneralPath) shape).curveTo(37.496, 28.532997, 37.363, 28.626997, 37.253998, 28.841997);
        ((GeneralPath) shape).curveTo(37.171997, 29.024998, 37.159996, 29.278997, 37.214996, 29.599997);
        ((GeneralPath) shape).curveTo(37.265995, 29.892996, 37.413998, 30.145996, 37.651997, 30.360996);
        ((GeneralPath) shape).curveTo(37.894997, 30.571997, 38.147995, 30.681995, 38.413998, 30.681995);
        ((GeneralPath) shape).curveTo(38.706997, 30.681995, 38.866997, 30.454996, 38.894997, 29.997995);
        ((GeneralPath) shape).curveTo(38.944996, 29.599995, 38.878998, 29.184996, 38.690998, 28.759995);
        ((GeneralPath) shape).curveTo(38.348, 27.907995, 37.559, 27.184994, 36.336, 26.599995);
        ((GeneralPath) shape).curveTo(35.906, 26.384995, 35.546997, 25.958994, 35.253998, 25.317995);
        ((GeneralPath) shape).curveTo(35.011997, 24.759995, 34.878998, 24.200994, 34.851997, 23.638994);
        ((GeneralPath) shape).curveTo(34.773, 22.653994, 35.026997, 22.024994, 35.613, 21.759995);
        ((GeneralPath) shape).curveTo(35.906, 21.626995, 36.198997, 21.638994, 36.492, 21.798994);
        ((GeneralPath) shape).curveTo(36.84, 21.985994, 37.078, 22.360994, 37.215, 22.919994);
        ((GeneralPath) shape).curveTo(37.348, 23.477995, 37.32, 23.931993, 37.133, 24.278994);
        ((GeneralPath) shape).curveTo(36.945, 24.571993, 36.746, 24.704994, 36.535, 24.681993);
        ((GeneralPath) shape).curveTo(36.348, 24.653994, 36.172, 24.544994, 36.012, 24.360994);
        ((GeneralPath) shape).curveTo(35.879, 24.145994, 35.828003, 23.892994, 35.852, 23.599995);
        ((GeneralPath) shape).curveTo(35.879, 23.306995, 35.961002, 23.106995, 36.094, 22.997995);
        ((GeneralPath) shape).curveTo(36.199, 22.919996, 36.293003, 22.946995, 36.375, 23.079996);
        ((GeneralPath) shape).curveTo(36.453, 23.184996, 36.426, 23.306995, 36.293, 23.438995);
        ((GeneralPath) shape).curveTo(36.188, 23.544996, 36.176, 23.681995, 36.253998, 23.841995);
        ((GeneralPath) shape).curveTo(36.304996, 23.997995, 36.401997, 24.079996, 36.534996, 24.079996);
        ((GeneralPath) shape).curveTo(36.690994, 24.052996, 36.800995, 23.931995, 36.851997, 23.720997);
        ((GeneralPath) shape).curveTo(36.878998, 23.477997, 36.851997, 23.239996, 36.773, 22.997997);
        ((GeneralPath) shape).curveTo(36.559, 22.411997, 36.253998, 22.212997, 35.851997, 22.399998);
        ((GeneralPath) shape).curveTo(35.534996, 22.559998, 35.401997, 23.091997, 35.453, 23.997997);
        ((GeneralPath) shape).curveTo(35.48, 24.294998, 35.613, 24.559998, 35.851997, 24.798998);
        ((GeneralPath) shape).curveTo(36.065998, 25.040998, 36.304996, 25.184998, 36.573997, 25.239998);
        ((GeneralPath) shape).curveTo(37.238, 25.290998, 37.586, 24.747997, 37.613, 23.599998);
        ((GeneralPath) shape).curveTo(37.690998, 22.477999, 37.266, 21.731998, 36.332, 21.360998);
        ((GeneralPath) shape).curveTo(35.984, 21.224998, 35.652, 21.251999, 35.332, 21.438997);
        ((GeneralPath) shape).curveTo(34.961002, 21.626997, 34.719, 21.931997, 34.613, 22.360998);
        ((GeneralPath) shape).curveTo(34.398, 23.024998, 34.465, 23.931997, 34.812, 25.079998);
        ((GeneralPath) shape).curveTo(35.078, 26.040998, 35.812, 26.841997, 37.012, 27.477999);
        ((GeneralPath) shape).curveTo(37.465, 27.720999, 37.852, 28.053, 38.172, 28.477999);
        ((GeneralPath) shape).curveTo(38.465, 28.880999, 38.613003, 29.224998, 38.613003, 29.520998);
        ((GeneralPath) shape).curveTo(38.668003, 30.134998, 38.492004, 30.399998, 38.094, 30.317999);
        ((GeneralPath) shape).curveTo(37.668003, 30.185, 37.453003, 29.880999, 37.453003, 29.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x463B1F));
        g.fill(shape);

        // _0_0_0_131
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.895, 24.799);
        ((GeneralPath) shape).curveTo(38.293, 25.201, 38.641, 25.307, 38.934002, 25.119);
        ((GeneralPath) shape).curveTo(38.988003, 25.067999, 39.000004, 24.986, 38.973003, 24.880999);
        ((GeneralPath) shape).curveTo(38.973003, 24.774998, 38.934002, 24.720999, 38.855003, 24.720999);
        ((GeneralPath) shape).curveTo(38.375004, 24.720999, 38.121002, 24.588, 38.094, 24.317999);
        ((GeneralPath) shape).curveTo(38.066, 24.106998, 38.066, 23.919998, 38.094, 23.759998);
        ((GeneralPath) shape).curveTo(38.148003, 23.626999, 38.215, 23.587997, 38.293003, 23.638998);
        ((GeneralPath) shape).curveTo(38.402004, 23.665998, 38.469, 23.747997, 38.492004, 23.880999);
        ((GeneralPath) shape).curveTo(38.547005, 24.013998, 38.535004, 24.064, 38.453003, 24.040998);
        ((GeneralPath) shape).curveTo(38.375004, 24.013998, 38.336002, 24.052998, 38.336002, 24.157999);
        ((GeneralPath) shape).curveTo(38.309002, 24.24, 38.336002, 24.294998, 38.414, 24.317999);
        ((GeneralPath) shape).curveTo(38.574, 24.428, 38.656002, 24.294998, 38.656002, 23.919998);
        ((GeneralPath) shape).curveTo(38.656002, 23.599998, 38.547, 23.384998, 38.336002, 23.278997);
        ((GeneralPath) shape).curveTo(38.043003, 23.118998, 37.844, 23.239998, 37.734, 23.638998);
        ((GeneralPath) shape).curveTo(37.684002, 23.880999, 37.668, 24.118998, 37.695, 24.360998);
        ((GeneralPath) shape).curveTo(37.746, 24.599998, 37.812, 24.747997, 37.895, 24.798998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_132
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.055, 29.318);
        ((GeneralPath) shape).curveTo(35.055, 29.428001, 35.078, 29.506, 35.133, 29.560001);
        ((GeneralPath) shape).curveTo(35.215, 29.615002, 35.266, 29.600002, 35.293, 29.521002);
        ((GeneralPath) shape).curveTo(35.48, 29.119001, 35.48, 28.600002, 35.293, 27.959002);
        ((GeneralPath) shape).curveTo(35.266, 27.799002, 35.198997, 27.666002, 35.093998, 27.560001);
        ((GeneralPath) shape).curveTo(34.961, 27.428001, 34.811996, 27.373001, 34.651997, 27.400002);
        ((GeneralPath) shape).curveTo(34.358997, 27.428001, 34.253998, 27.682001, 34.331997, 28.158);
        ((GeneralPath) shape).curveTo(34.331997, 28.506, 34.426, 28.732, 34.612995, 28.842001);
        ((GeneralPath) shape).curveTo(34.827995, 28.92, 34.933994, 28.826, 34.933994, 28.560001);
        ((GeneralPath) shape).curveTo(34.905994, 28.428001, 34.866993, 28.361002, 34.811993, 28.361002);
        ((GeneralPath) shape).curveTo(34.761993, 28.334002, 34.733994, 28.385002, 34.733994, 28.521002);
        ((GeneralPath) shape).curveTo(34.733994, 28.654001, 34.706993, 28.682001, 34.651993, 28.600002);
        ((GeneralPath) shape).curveTo(34.597992, 28.521002, 34.558994, 28.400002, 34.534992, 28.240002);
        ((GeneralPath) shape).curveTo(34.50799, 28.080002, 34.546993, 27.986002, 34.651993, 27.959002);
        ((GeneralPath) shape).curveTo(34.733994, 27.932001, 34.839993, 27.975002, 34.972992, 28.080002);
        ((GeneralPath) shape).curveTo(35.159992, 28.240002, 35.187992, 28.654001, 35.054993, 29.318003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_133
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.812, 25.92);
        ((GeneralPath) shape).curveTo(37.707, 26.639, 37.879, 26.986, 38.332, 26.959);
        ((GeneralPath) shape).curveTo(38.414, 26.959, 38.492, 26.881, 38.574, 26.720999);
        ((GeneralPath) shape).curveTo(38.625, 26.532999, 38.613003, 26.334, 38.535, 26.119);
        ((GeneralPath) shape).curveTo(38.426, 25.932, 38.293, 25.814, 38.133, 25.76);
        ((GeneralPath) shape).curveTo(37.973, 25.732, 37.867, 25.787, 37.812, 25.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_134
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.691, 29.4);
        ((GeneralPath) shape).curveTo(36.801003, 29.4, 36.867, 29.317999, 36.895, 29.157999);
        ((GeneralPath) shape).curveTo(36.945, 28.974998, 36.934002, 28.775, 36.852, 28.56);
        ((GeneralPath) shape).curveTo(36.773003, 28.373, 36.652, 28.251999, 36.492, 28.201);
        ((GeneralPath) shape).curveTo(36.332, 28.174, 36.227, 28.225, 36.172, 28.361);
        ((GeneralPath) shape).curveTo(36.066, 29.08, 36.238003, 29.428, 36.691, 29.4);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_135
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.332, 21.6);
        ((GeneralPath) shape).curveTo(28.066, 22.053, 27.707, 22.24, 27.254002, 22.158);
        ((GeneralPath) shape).curveTo(26.746002, 22.025002, 26.277002, 21.998001, 25.852001, 22.080002);
        ((GeneralPath) shape).curveTo(25.371, 22.158, 25.066002, 22.346003, 24.934002, 22.639002);
        ((GeneralPath) shape).curveTo(24.746002, 22.986002, 24.680002, 23.400002, 24.734001, 23.881002);
        ((GeneralPath) shape).curveTo(24.785002, 24.412003, 24.961, 24.787003, 25.254002, 24.998003);
        ((GeneralPath) shape).curveTo(25.547, 25.213003, 25.812002, 25.295004, 26.051003, 25.240004);
        ((GeneralPath) shape).curveTo(26.293003, 25.185003, 26.426003, 25.014004, 26.453003, 24.721004);
        ((GeneralPath) shape).curveTo(26.559004, 23.998005, 26.398003, 23.506004, 25.973003, 23.240005);
        ((GeneralPath) shape).curveTo(25.758003, 23.135006, 25.598003, 23.146006, 25.492002, 23.279005);
        ((GeneralPath) shape).curveTo(25.359003, 23.412004, 25.320002, 23.615005, 25.371002, 23.881004);
        ((GeneralPath) shape).curveTo(25.398003, 24.119005, 25.480001, 24.279005, 25.613003, 24.361004);
        ((GeneralPath) shape).curveTo(25.719004, 24.412004, 25.812002, 24.400003, 25.891003, 24.318005);
        ((GeneralPath) shape).curveTo(25.945004, 24.240005, 25.973003, 24.158005, 25.973003, 24.080004);
        ((GeneralPath) shape).curveTo(25.973003, 23.998003, 25.945004, 23.975004, 25.891003, 23.998003);
        ((GeneralPath) shape).curveTo(25.758003, 24.025003, 25.668003, 24.014004, 25.613003, 23.959003);
        ((GeneralPath) shape).curveTo(25.559002, 23.908003, 25.547003, 23.842003, 25.574003, 23.760004);
        ((GeneralPath) shape).curveTo(25.598003, 23.654003, 25.652002, 23.588003, 25.734003, 23.560003);
        ((GeneralPath) shape).curveTo(25.812002, 23.506002, 25.906004, 23.560003, 26.012003, 23.721003);
        ((GeneralPath) shape).curveTo(26.121002, 23.881002, 26.188004, 24.068003, 26.211002, 24.279003);
        ((GeneralPath) shape).curveTo(26.211002, 24.814003, 26.000002, 24.998003, 25.574003, 24.842003);
        ((GeneralPath) shape).curveTo(25.199003, 24.627003, 25.012003, 24.201002, 25.012003, 23.560003);
        ((GeneralPath) shape).curveTo(25.012003, 23.240004, 25.160004, 22.975004, 25.453003, 22.760004);
        ((GeneralPath) shape).curveTo(25.801003, 22.545004, 26.188004, 22.494003, 26.613003, 22.600004);
        ((GeneralPath) shape).curveTo(27.812002, 22.842005, 28.531002, 22.533005, 28.773003, 21.682005);
        ((GeneralPath) shape).curveTo(28.984003, 21.041004, 29.090002, 20.478004, 29.090002, 19.998005);
        ((GeneralPath) shape).lineTo(28.691002, 19.318005);
        ((GeneralPath) shape).lineTo(28.734001, 20.080004);
        ((GeneralPath) shape).curveTo(28.707, 20.666004, 28.574001, 21.174004, 28.332, 21.600004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_136
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.012, 20.478);
        ((GeneralPath) shape).curveTo(27.280998, 20.639, 27.519999, 20.666, 27.734, 20.560001);
        ((GeneralPath) shape).curveTo(27.973, 20.478, 28.094, 20.279001, 28.094, 19.959002);
        ((GeneralPath) shape).curveTo(28.145, 19.053001, 28.012, 18.400002, 27.691, 17.998001);
        ((GeneralPath) shape).curveTo(27.238, 17.439001, 26.918, 17.412, 26.734, 17.920002);
        ((GeneralPath) shape).curveTo(26.679998, 18.135002, 26.668, 18.373001, 26.691, 18.639002);
        ((GeneralPath) shape).curveTo(26.746, 18.932001, 26.852, 19.135002, 27.012, 19.240002);
        ((GeneralPath) shape).curveTo(27.144999, 19.346003, 27.237999, 19.334002, 27.293, 19.201002);
        ((GeneralPath) shape).curveTo(27.348, 19.092003, 27.32, 18.932003, 27.210999, 18.721003);
        ((GeneralPath) shape).curveTo(27.104998, 18.478003, 27.078, 18.334003, 27.133, 18.279003);
        ((GeneralPath) shape).curveTo(27.210999, 18.201004, 27.32, 18.252003, 27.453, 18.439003);
        ((GeneralPath) shape).curveTo(27.585999, 18.654003, 27.679998, 18.932003, 27.734, 19.279003);
        ((GeneralPath) shape).curveTo(27.758, 19.627003, 27.706999, 19.853003, 27.574, 19.959003);
        ((GeneralPath) shape).curveTo(27.414, 20.064003, 27.237999, 20.053003, 27.050999, 19.920004);
        ((GeneralPath) shape).curveTo(26.811998, 19.760004, 26.612999, 19.455004, 26.453, 18.998003);
        ((GeneralPath) shape).curveTo(26.210999, 18.467003, 26.16, 17.959003, 26.293, 17.478003);
        ((GeneralPath) shape).curveTo(26.425999, 16.975002, 26.668, 16.748003, 27.012, 16.799002);
        ((GeneralPath) shape).curveTo(27.304998, 16.853003, 27.598, 17.080002, 27.890999, 17.478003);
        ((GeneralPath) shape).curveTo(27.999998, 17.560003, 28.078, 17.682003, 28.133, 17.842003);
        ((GeneralPath) shape).lineTo(28.050999, 17.521004);
        ((GeneralPath) shape).lineTo(27.734, 16.959003);
        ((GeneralPath) shape).lineTo(27.691, 16.799004);
        ((GeneralPath) shape).lineTo(27.133, 16.439003);
        ((GeneralPath) shape).curveTo(26.227, 16.174004, 25.812, 16.654003, 25.890999, 17.881002);
        ((GeneralPath) shape).curveTo(25.973, 19.185003, 26.348, 20.053001, 27.012, 20.478003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_137
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.215, 17.959);
        ((GeneralPath) shape).curveTo(25.188, 17.826, 25.133, 17.748, 25.055, 17.720999);
        ((GeneralPath) shape).curveTo(24.973, 17.692999, 24.961, 17.626999, 25.012001, 17.520998);
        ((GeneralPath) shape).curveTo(25.039001, 17.411999, 25.094002, 17.360998, 25.172, 17.360998);
        ((GeneralPath) shape).curveTo(25.414001, 17.411999, 25.508001, 17.731998, 25.453001, 18.317999);
        ((GeneralPath) shape).curveTo(25.402, 18.56, 25.133001, 18.494, 24.652, 18.119);
        ((GeneralPath) shape).curveTo(24.574001, 18.092, 24.535, 18.135, 24.535, 18.24);
        ((GeneralPath) shape).curveTo(24.535, 18.346, 24.559, 18.439, 24.612999, 18.521);
        ((GeneralPath) shape).curveTo(24.879, 18.92, 25.227, 19.08, 25.651999, 18.998);
        ((GeneralPath) shape).curveTo(25.866999, 18.946999, 25.905998, 18.56, 25.772999, 17.842);
        ((GeneralPath) shape).curveTo(25.668, 17.360998, 25.468998, 17.08, 25.175999, 16.998);
        ((GeneralPath) shape).curveTo(24.933998, 16.946999, 24.828, 17.092, 24.855, 17.439);
        ((GeneralPath) shape).curveTo(24.855, 17.814, 24.934, 18.025, 25.094, 18.08);
        ((GeneralPath) shape).curveTo(25.171999, 18.107, 25.215, 18.064, 25.215, 17.959);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_138
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.973, 25.478);
        ((GeneralPath) shape).curveTo(28.945, 25.346, 28.906, 25.268002, 28.852, 25.24);
        ((GeneralPath) shape).curveTo(28.800999, 25.185, 28.772999, 25.225, 28.772999, 25.361);
        ((GeneralPath) shape).curveTo(28.772999, 25.654, 28.879, 25.826, 29.093998, 25.881);
        ((GeneralPath) shape).curveTo(29.276999, 25.932001, 29.374998, 25.775, 29.374998, 25.4);
        ((GeneralPath) shape).curveTo(29.374998, 24.893, 29.253998, 24.532999, 29.011997, 24.317999);
        ((GeneralPath) shape).curveTo(28.851997, 24.185, 28.706997, 24.134998, 28.573997, 24.157999);
        ((GeneralPath) shape).curveTo(28.464998, 24.185, 28.397997, 24.268, 28.374998, 24.4);
        ((GeneralPath) shape).curveTo(28.265999, 25.092, 28.292997, 25.666, 28.452997, 26.119);
        ((GeneralPath) shape).curveTo(28.479998, 26.225, 28.519997, 26.279, 28.573997, 26.279);
        ((GeneralPath) shape).curveTo(28.651997, 26.251999, 28.679998, 26.185, 28.651997, 26.08);
        ((GeneralPath) shape).curveTo(28.519997, 25.252, 28.534996, 24.826, 28.690996, 24.799);
        ((GeneralPath) shape).curveTo(28.827995, 24.748, 28.944996, 24.787, 29.054996, 24.92);
        ((GeneralPath) shape).curveTo(29.159996, 25.025, 29.198996, 25.158, 29.171997, 25.318);
        ((GeneralPath) shape).curveTo(29.147997, 25.455, 29.104998, 25.549002, 29.054996, 25.6);
        ((GeneralPath) shape).curveTo(28.999996, 25.654001, 28.972996, 25.615, 28.972996, 25.478);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_139
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.254, 20.998);
        ((GeneralPath) shape).curveTo(25.492, 21.185, 25.652, 21.157999, 25.734, 20.92);
        ((GeneralPath) shape).curveTo(25.785, 20.705, 25.785, 20.478, 25.734, 20.24);
        ((GeneralPath) shape).curveTo(25.679998, 20.053, 25.574, 19.92, 25.414, 19.842);
        ((GeneralPath) shape).curveTo(25.254, 19.759998, 25.133, 19.799, 25.055, 19.959);
        ((GeneralPath) shape).curveTo(24.973, 20.119, 24.973, 20.317999, 25.055, 20.56);
        ((GeneralPath) shape).curveTo(25.105, 20.775, 25.172, 20.92, 25.254, 20.998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_140
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.012, 24.92);
        ((GeneralPath) shape).curveTo(27.254, 25.107, 27.414, 25.08, 27.491999, 24.842001);
        ((GeneralPath) shape).curveTo(27.546999, 24.627, 27.546999, 24.400002, 27.491999, 24.158);
        ((GeneralPath) shape).curveTo(27.440998, 23.975, 27.335999, 23.842001, 27.175999, 23.76);
        ((GeneralPath) shape).curveTo(26.987999, 23.682001, 26.866999, 23.721, 26.811998, 23.881);
        ((GeneralPath) shape).curveTo(26.734, 24.014, 26.722998, 24.213001, 26.772999, 24.478);
        ((GeneralPath) shape).curveTo(26.828, 24.693, 26.905998, 24.842001, 27.012, 24.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_141
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.852, 13.24);
        ((GeneralPath) shape).curveTo(36.254, 13.693, 36.535, 13.731999, 36.691, 13.356999);
        ((GeneralPath) shape).curveTo(36.773003, 13.200999, 36.785004, 12.997999, 36.734, 12.759999);
        ((GeneralPath) shape).curveTo(36.707, 12.544999, 36.625, 12.384999, 36.492, 12.278999);
        ((GeneralPath) shape).curveTo(36.359, 12.174, 36.266, 12.174, 36.215, 12.278999);
        ((GeneralPath) shape).curveTo(36.133, 12.356999, 36.148, 12.4939995, 36.254, 12.6779995);
        ((GeneralPath) shape).curveTo(36.387, 12.837999, 36.414, 12.959, 36.336002, 13.040999);
        ((GeneralPath) shape).curveTo(36.281002, 13.1189995, 36.199, 13.063999, 36.094, 12.881);
        ((GeneralPath) shape).curveTo(35.934002, 12.693, 35.84, 12.450999, 35.812, 12.158);
        ((GeneralPath) shape).curveTo(35.762, 11.865, 35.801, 11.693, 35.934002, 11.639);
        ((GeneralPath) shape).curveTo(36.066, 11.559999, 36.227, 11.588, 36.414, 11.721);
        ((GeneralPath) shape).curveTo(36.625, 11.853, 36.812, 12.106999, 36.973, 12.478);
        ((GeneralPath) shape).curveTo(37.16, 12.908, 37.199, 13.306999, 37.093998, 13.681999);
        ((GeneralPath) shape).curveTo(37.011997, 14.079999, 36.811996, 14.251999, 36.491997, 14.200999);
        ((GeneralPath) shape).curveTo(36.198997, 14.145999, 35.917995, 13.959, 35.651997, 13.638999);
        ((GeneralPath) shape).curveTo(35.093998, 13.024999, 34.811996, 12.290998, 34.811996, 11.438999);
        ((GeneralPath) shape).curveTo(34.811996, 10.907999, 34.934, 10.477999, 35.171997, 10.157999);
        ((GeneralPath) shape).curveTo(35.413998, 9.786999, 35.757996, 9.6779995, 36.211, 9.841999);
        ((GeneralPath) shape).curveTo(37.331997, 10.239999, 38.038998, 10.212999, 38.331997, 9.759999);
        ((GeneralPath) shape).curveTo(38.464996, 9.4939995, 38.519997, 9.157999, 38.491997, 8.759999);
        ((GeneralPath) shape).curveTo(38.464996, 8.306999, 38.319996, 7.958999, 38.050995, 7.7209992);
        ((GeneralPath) shape).curveTo(37.784996, 7.4509993, 37.546993, 7.333999, 37.331993, 7.3569994);
        ((GeneralPath) shape).curveTo(37.116993, 7.3569994, 36.999992, 7.477999, 36.972992, 7.7209992);
        ((GeneralPath) shape).curveTo(36.91799, 8.384999, 37.06599, 8.837999, 37.413994, 9.079999);
        ((GeneralPath) shape).curveTo(37.573994, 9.212999, 37.706993, 9.239999, 37.811993, 9.157999);
        ((GeneralPath) shape).curveTo(37.944992, 9.079999, 37.999992, 8.919999, 37.972992, 8.6779995);
        ((GeneralPath) shape).curveTo(37.944992, 8.466999, 37.866993, 8.306999, 37.733994, 8.197);
        ((GeneralPath) shape).curveTo(37.624992, 8.1189995, 37.546993, 8.1189995, 37.491993, 8.197);
        ((GeneralPath) shape).curveTo(37.437992, 8.224999, 37.409992, 8.278999, 37.409992, 8.356999);
        ((GeneralPath) shape).curveTo(37.409992, 8.412, 37.437992, 8.450999, 37.491993, 8.478);
        ((GeneralPath) shape).curveTo(37.624992, 8.478, 37.706993, 8.506, 37.733994, 8.557);
        ((GeneralPath) shape).curveTo(37.784992, 8.584001, 37.800995, 8.639, 37.772995, 8.717);
        ((GeneralPath) shape).curveTo(37.745995, 8.799, 37.690994, 8.853, 37.612995, 8.881);
        ((GeneralPath) shape).curveTo(37.534996, 8.908, 37.452995, 8.842, 37.374996, 8.681999);
        ((GeneralPath) shape).curveTo(37.265995, 8.520999, 37.214996, 8.345999, 37.214996, 8.157999);
        ((GeneralPath) shape).curveTo(37.187996, 7.946999, 37.226997, 7.798999, 37.331997, 7.7209992);
        ((GeneralPath) shape).curveTo(37.440998, 7.6659994, 37.586, 7.6929994, 37.773, 7.7989993);
        ((GeneralPath) shape).curveTo(38.093998, 8.040999, 38.253998, 8.438999, 38.253998, 9.001999);
        ((GeneralPath) shape).curveTo(38.253998, 9.239999, 38.121, 9.427999, 37.851997, 9.5599985);
        ((GeneralPath) shape).curveTo(37.559, 9.692999, 37.226997, 9.692999, 36.851997, 9.5599985);
        ((GeneralPath) shape).curveTo(35.706997, 9.106998, 34.988, 9.251999, 34.690998, 10.001999);
        ((GeneralPath) shape).curveTo(34.401997, 10.825999, 34.374996, 11.626999, 34.613, 12.399999);
        ((GeneralPath) shape).curveTo(34.773, 12.880999, 35.027, 13.317999, 35.375, 13.720999);
        ((GeneralPath) shape).curveTo(35.719, 14.118999, 36.055, 14.372999, 36.375, 14.477999);
        ((GeneralPath) shape).curveTo(37.172, 14.692999, 37.535, 14.333999, 37.453, 13.399999);
        ((GeneralPath) shape).curveTo(37.375, 12.333999, 37.038998, 11.626999, 36.453, 11.278998);
        ((GeneralPath) shape).curveTo(36.215, 11.091998, 35.988, 11.024999, 35.773, 11.079998);
        ((GeneralPath) shape).curveTo(35.559, 11.130998, 35.440998, 11.294998, 35.413998, 11.559998);
        ((GeneralPath) shape).curveTo(35.413998, 12.333998, 35.559, 12.892998, 35.851997, 13.239998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_142
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.812, 12.92);
        ((GeneralPath) shape).curveTo(37.602, 12.975, 37.559002, 13.268, 37.691, 13.799);
        ((GeneralPath) shape).curveTo(37.801003, 14.174, 37.961002, 14.4, 38.176003, 14.481999);
        ((GeneralPath) shape).curveTo(38.359, 14.532999, 38.453003, 14.4279995, 38.453003, 14.162);
        ((GeneralPath) shape).curveTo(38.453003, 13.893, 38.387, 13.731999, 38.254, 13.682);
        ((GeneralPath) shape).curveTo(38.203003, 13.654, 38.176003, 13.682, 38.176003, 13.76);
        ((GeneralPath) shape).curveTo(38.176003, 13.842, 38.215004, 13.893001, 38.293003, 13.92);
        ((GeneralPath) shape).curveTo(38.348003, 13.9470005, 38.359005, 14.002, 38.336002, 14.08);
        ((GeneralPath) shape).curveTo(38.309002, 14.162, 38.254, 14.201, 38.176003, 14.201);
        ((GeneralPath) shape).curveTo(37.988003, 14.146, 37.922, 13.908, 37.973003, 13.482);
        ((GeneralPath) shape).curveTo(38.000004, 13.3220005, 38.215004, 13.373, 38.613003, 13.643001);
        ((GeneralPath) shape).curveTo(38.668003, 13.666, 38.707005, 13.654, 38.734, 13.6);
        ((GeneralPath) shape).curveTo(38.734, 13.521, 38.707, 13.439, 38.652, 13.361);
        ((GeneralPath) shape).curveTo(38.465, 13.064, 38.188, 12.92, 37.812, 12.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_143
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.453, 7.478);
        ((GeneralPath) shape).curveTo(35.559, 6.814, 35.52, 6.2520003, 35.336, 5.7990003);
        ((GeneralPath) shape).curveTo(35.281, 5.6930003, 35.226997, 5.6390004, 35.176, 5.6390004);
        ((GeneralPath) shape).curveTo(35.121, 5.6390004, 35.105, 5.6930003, 35.133, 5.7990003);
        ((GeneralPath) shape).curveTo(35.266, 6.6270003, 35.253998, 7.0410004, 35.093998, 7.0410004);
        ((GeneralPath) shape).curveTo(34.961, 7.0410004, 34.839996, 6.9750004, 34.733997, 6.8420005);
        ((GeneralPath) shape).curveTo(34.624996, 6.7050004, 34.573997, 6.5600004, 34.573997, 6.4000006);
        ((GeneralPath) shape).curveTo(34.601997, 6.2680006, 34.641, 6.1850004, 34.690998, 6.1580005);
        ((GeneralPath) shape).curveTo(34.746, 6.1310005, 34.785, 6.1850004, 34.811996, 6.3180003);
        ((GeneralPath) shape).curveTo(34.811996, 6.451, 34.851997, 6.545, 34.934, 6.6000004);
        ((GeneralPath) shape).curveTo(34.983997, 6.6540003, 35.011997, 6.6150002, 35.011997, 6.478);
        ((GeneralPath) shape).curveTo(35.011997, 6.2130003, 34.894997, 6.014, 34.651997, 5.881);
        ((GeneralPath) shape).curveTo(34.440998, 5.7990003, 34.335995, 5.932, 34.335995, 6.2790003);
        ((GeneralPath) shape).curveTo(34.335995, 6.76, 34.479996, 7.1310005, 34.772995, 7.4000006);
        ((GeneralPath) shape).curveTo(34.933994, 7.5600004, 35.081993, 7.6540008, 35.214996, 7.6820006);
        ((GeneralPath) shape).curveTo(35.347996, 7.6820006, 35.425995, 7.6150007, 35.452995, 7.4780006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_144
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.172, 11.4);
        ((GeneralPath) shape).curveTo(37.961002, 11.212999, 37.824, 11.212999, 37.773003, 11.4);
        ((GeneralPath) shape).curveTo(37.719, 11.559999, 37.707, 11.747999, 37.734, 11.959);
        ((GeneralPath) shape).curveTo(37.758, 12.092, 37.84, 12.200999, 37.973, 12.278999);
        ((GeneralPath) shape).curveTo(38.133, 12.356999, 38.253998, 12.346, 38.332, 12.24);
        ((GeneralPath) shape).curveTo(38.387, 12.131, 38.387, 11.971, 38.332, 11.76);
        ((GeneralPath) shape).curveTo(38.305, 11.6, 38.254, 11.478001, 38.172, 11.400001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_145
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.574, 7.799);
        ((GeneralPath) shape).curveTo(36.332, 7.56, 36.188, 7.5449996, 36.133, 7.7599998);
        ((GeneralPath) shape).curveTo(36.078, 7.9199996, 36.078, 8.131, 36.133, 8.4);
        ((GeneralPath) shape).curveTo(36.16, 8.559999, 36.253998, 8.693, 36.413998, 8.799);
        ((GeneralPath) shape).curveTo(36.601997, 8.908, 36.718998, 8.893, 36.773, 8.76);
        ((GeneralPath) shape).curveTo(36.851997, 8.654, 36.867, 8.478001, 36.812, 8.24);
        ((GeneralPath) shape).curveTo(36.734, 8.025, 36.652, 7.8809996, 36.574, 7.799);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_146
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.613, 7.998);
        ((GeneralPath) shape).curveTo(25.586, 8.588, 25.719002, 9.119, 26.012001, 9.6);
        ((GeneralPath) shape).curveTo(26.254002, 10.025001, 26.559002, 10.346001, 26.934002, 10.56);
        ((GeneralPath) shape).curveTo(27.281002, 10.799001, 27.641003, 10.853001, 28.012001, 10.721001);
        ((GeneralPath) shape).curveTo(28.387001, 10.611001, 28.625002, 10.346001, 28.734001, 9.920001);
        ((GeneralPath) shape).curveTo(28.918001, 9.279001, 28.824001, 8.334002, 28.453001, 7.080001);
        ((GeneralPath) shape).curveTo(28.160002, 6.014001, 27.398, 5.014001, 26.172, 4.080001);
        ((GeneralPath) shape).curveTo(25.719002, 3.760001, 25.320002, 3.3300009, 24.973001, 2.7990007);
        ((GeneralPath) shape).curveTo(24.652002, 2.3180008, 24.492, 1.9320008, 24.492, 1.6390008);
        ((GeneralPath) shape).curveTo(24.441, 0.9980008, 24.613, 0.76000077, 25.012001, 0.9200008);
        ((GeneralPath) shape).curveTo(25.465, 1.1350008, 25.691002, 1.5060008, 25.691002, 2.0410008);
        ((GeneralPath) shape).curveTo(25.691002, 2.2520008, 25.641003, 2.389001, 25.535002, 2.4390008);
        ((GeneralPath) shape).curveTo(25.426003, 2.494001, 25.336002, 2.4550009, 25.254002, 2.3180008);
        ((GeneralPath) shape).curveTo(25.172, 2.2400007, 25.105001, 2.1350007, 25.055002, 2.0020008);
        ((GeneralPath) shape).curveTo(25.027002, 1.8650008, 25.039001, 1.7990009, 25.094002, 1.7990009);
        ((GeneralPath) shape).lineTo(25.375002, 1.9980009);
        ((GeneralPath) shape).curveTo(25.559002, 2.240001, 25.559002, 2.1460009, 25.375002, 1.7210009);
        ((GeneralPath) shape).curveTo(25.293001, 1.5600009, 25.199001, 1.4510009, 25.094002, 1.4000009);
        ((GeneralPath) shape).curveTo(24.934002, 1.373001, 24.840002, 1.467001, 24.812002, 1.6820009);
        ((GeneralPath) shape).curveTo(24.785002, 1.8930008, 24.840002, 2.119001, 24.973001, 2.361001);
        ((GeneralPath) shape).curveTo(25.105001, 2.600001, 25.277002, 2.760001, 25.492, 2.842001);
        ((GeneralPath) shape).curveTo(25.68, 2.920001, 25.812, 2.8530009, 25.891, 2.643001);
        ((GeneralPath) shape).curveTo(25.973001, 2.455001, 25.984001, 2.2010012, 25.934, 1.881001);
        ((GeneralPath) shape).curveTo(25.906, 1.588001, 25.758, 1.295001, 25.492, 1.002001);
        ((GeneralPath) shape).curveTo(25.227001, 0.70900106, 24.945, 0.52100104, 24.652, 0.43900102);
        ((GeneralPath) shape).curveTo(24.359001, 0.361001, 24.199001, 0.560001, 24.172, 1.0410011);
        ((GeneralPath) shape).curveTo(24.145, 1.4670011, 24.223001, 1.920001, 24.410002, 2.400001);
        ((GeneralPath) shape).curveTo(24.730001, 3.307001, 25.559002, 4.228001, 26.891003, 5.158001);
        ((GeneralPath) shape).curveTo(27.344002, 5.478001, 27.719002, 6.002001, 28.012003, 6.7210007);
        ((GeneralPath) shape).curveTo(28.250004, 7.3340006, 28.398003, 7.9470005, 28.453003, 8.56);
        ((GeneralPath) shape).curveTo(28.531002, 9.6, 28.293003, 10.185, 27.734003, 10.318001);
        ((GeneralPath) shape).curveTo(27.414003, 10.400001, 27.090004, 10.318001, 26.773003, 10.080001);
        ((GeneralPath) shape).curveTo(26.426003, 9.814001, 26.172003, 9.373001, 26.012003, 8.760001);
        ((GeneralPath) shape).curveTo(25.879004, 8.174001, 25.918003, 7.721001, 26.133003, 7.400001);
        ((GeneralPath) shape).curveTo(26.293003, 7.131001, 26.492002, 7.041001, 26.734003, 7.119001);
        ((GeneralPath) shape).curveTo(26.918003, 7.1740007, 27.094004, 7.318001, 27.254004, 7.560001);
        ((GeneralPath) shape).curveTo(27.414003, 7.7990007, 27.480003, 8.068001, 27.453003, 8.361001);
        ((GeneralPath) shape).curveTo(27.426003, 8.654001, 27.332003, 8.842001, 27.172003, 8.920001);
        ((GeneralPath) shape).curveTo(27.066002, 9.002001, 26.973003, 8.975001, 26.891003, 8.842001);
        ((GeneralPath) shape).curveTo(26.840002, 8.682001, 26.867002, 8.545001, 26.973003, 8.439001);
        ((GeneralPath) shape).curveTo(27.078003, 8.334002, 27.090004, 8.201001, 27.012003, 8.041001);
        ((GeneralPath) shape).curveTo(26.934002, 7.8810015, 26.824003, 7.787001, 26.691004, 7.760001);
        ((GeneralPath) shape).curveTo(26.559004, 7.7320013, 26.465004, 7.826001, 26.414003, 8.041001);
        ((GeneralPath) shape).curveTo(26.387003, 8.279001, 26.414003, 8.533001, 26.492002, 8.799002);
        ((GeneralPath) shape).curveTo(26.680002, 9.439002, 27.000002, 9.705002, 27.453003, 9.600001);
        ((GeneralPath) shape).curveTo(27.746002, 9.518002, 27.867002, 9.014001, 27.812002, 8.080002);
        ((GeneralPath) shape).curveTo(27.785002, 7.7600017, 27.652002, 7.439002, 27.414001, 7.119002);
        ((GeneralPath) shape).curveTo(27.199001, 6.8260016, 26.945002, 6.627002, 26.652002, 6.521002);
        ((GeneralPath) shape).curveTo(25.988003, 6.334002, 25.641003, 6.8260016, 25.613003, 7.998002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_147
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.535, 7.439);
        ((GeneralPath) shape).curveTo(24.535, 7.787, 24.652, 8.025001, 24.891, 8.158);
        ((GeneralPath) shape).curveTo(25.188002, 8.373, 25.387001, 8.291, 25.492, 7.92);
        ((GeneralPath) shape).curveTo(25.602001, 7.334, 25.535, 6.92, 25.293001, 6.678);
        ((GeneralPath) shape).curveTo(24.891, 6.174, 24.535002, 5.998, 24.211, 6.158);
        ((GeneralPath) shape).curveTo(24.16, 6.185, 24.145, 6.252, 24.172, 6.357);
        ((GeneralPath) shape).curveTo(24.172, 6.494, 24.211, 6.56, 24.293001, 6.56);
        ((GeneralPath) shape).curveTo(24.801, 6.693, 25.078001, 6.893, 25.133001, 7.158);
        ((GeneralPath) shape).curveTo(25.184002, 7.373, 25.184002, 7.56, 25.133001, 7.721);
        ((GeneralPath) shape).curveTo(25.078001, 7.853, 25.000002, 7.893, 24.891, 7.8380003);
        ((GeneralPath) shape).curveTo(24.785, 7.76, 24.719, 7.6540003, 24.691, 7.518);
        ((GeneralPath) shape).curveTo(24.641, 7.3570004, 24.652, 7.307, 24.734, 7.3570004);
        ((GeneralPath) shape).curveTo(24.84, 7.385, 24.890999, 7.3570004, 24.890999, 7.2790003);
        ((GeneralPath) shape).curveTo(24.890999, 7.1970005, 24.852, 7.1310005, 24.772999, 7.0800004);
        ((GeneralPath) shape).curveTo(24.558998, 6.9200006, 24.48, 7.0410004, 24.534998, 7.4390006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_148
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.172, 4.478);
        ((GeneralPath) shape).curveTo(28.305, 4.6150002, 28.453001, 4.6930003, 28.613, 4.721);
        ((GeneralPath) shape).curveTo(28.906, 4.748, 29.012001, 4.506, 28.934, 4.0020003);
        ((GeneralPath) shape).curveTo(28.934, 3.6270003, 28.824, 3.3730004, 28.613, 3.2400002);
        ((GeneralPath) shape).curveTo(28.375, 3.1070004, 28.281, 3.1890001, 28.332, 3.4820004);
        ((GeneralPath) shape).curveTo(28.332, 3.6150002, 28.359001, 3.6820004, 28.414001, 3.6820004);
        ((GeneralPath) shape).curveTo(28.465002, 3.7090003, 28.492, 3.6540003, 28.492, 3.5210004);
        ((GeneralPath) shape).curveTo(28.492, 3.3890004, 28.535, 3.3730004, 28.613, 3.4820004);
        ((GeneralPath) shape).curveTo(28.668001, 3.5880003, 28.707, 3.7210004, 28.734001, 3.8810003);
        ((GeneralPath) shape).curveTo(28.758001, 4.0410004, 28.719002, 4.135, 28.613, 4.162);
        ((GeneralPath) shape).curveTo(28.508001, 4.162, 28.387001, 4.096, 28.254002, 3.959);
        ((GeneralPath) shape).curveTo(28.066002, 3.7480001, 28.039001, 3.3070002, 28.172, 2.6430001);
        ((GeneralPath) shape).curveTo(28.172, 2.5330002, 28.148, 2.443, 28.094002, 2.361);
        ((GeneralPath) shape).curveTo(28.039001, 2.3070002, 27.984001, 2.3070002, 27.934002, 2.361);
        ((GeneralPath) shape).curveTo(27.746002, 2.7870002, 27.746002, 3.334, 27.934002, 4.002);
        ((GeneralPath) shape).curveTo(27.961002, 4.158, 28.039001, 4.318, 28.172003, 4.4779997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_149
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.812, 4.361);
        ((GeneralPath) shape).curveTo(24.734001, 4.334, 24.668001, 4.4, 24.613, 4.56);
        ((GeneralPath) shape).curveTo(24.535002, 4.748, 24.535002, 4.947, 24.613, 5.158);
        ((GeneralPath) shape).curveTo(24.719002, 5.4, 24.867, 5.56, 25.055, 5.643);
        ((GeneralPath) shape).curveTo(25.215, 5.721, 25.305, 5.6930003, 25.336, 5.56);
        ((GeneralPath) shape).curveTo(25.387001, 5.373, 25.387001, 5.146, 25.336, 4.881);
        ((GeneralPath) shape).curveTo(25.227001, 4.56, 25.055, 4.389, 24.812, 4.361);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_150
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.492, 2.201);
        ((GeneralPath) shape).curveTo(26.414001, 2.174, 26.348001, 2.24, 26.293001, 2.4);
        ((GeneralPath) shape).curveTo(26.215002, 2.588, 26.215002, 2.7870002, 26.293001, 2.9980001);
        ((GeneralPath) shape).curveTo(26.402, 3.2400002, 26.547, 3.4, 26.734001, 3.4780002);
        ((GeneralPath) shape).curveTo(26.895, 3.5600002, 26.988, 3.5330002, 27.016, 3.4);
        ((GeneralPath) shape).curveTo(27.066, 3.213, 27.066, 2.986, 27.016, 2.7210002);
        ((GeneralPath) shape).curveTo(26.906, 2.4, 26.734001, 2.2280002, 26.492, 2.2010002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_151
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.934, 30.521);
        ((GeneralPath) shape).curveTo(37.746, 30.494, 37.601997, 30.385, 37.491997, 30.201);
        ((GeneralPath) shape).curveTo(37.358997, 30.041, 37.292995, 29.853, 37.292995, 29.639);
        ((GeneralPath) shape).curveTo(37.319996, 29.455, 37.374996, 29.318, 37.452995, 29.24);
        ((GeneralPath) shape).curveTo(37.558994, 29.157999, 37.651997, 29.157999, 37.733994, 29.24);
        ((GeneralPath) shape).curveTo(37.999992, 29.56, 38.050995, 29.721, 37.890995, 29.721);
        ((GeneralPath) shape).curveTo(37.839996, 29.748001, 37.745995, 29.705, 37.612995, 29.6);
        ((GeneralPath) shape).curveTo(37.425995, 29.412, 37.425995, 29.506, 37.612995, 29.881);
        ((GeneralPath) shape).curveTo(37.690994, 30.014, 37.784996, 30.092001, 37.894997, 30.119001);
        ((GeneralPath) shape).curveTo(38.026997, 30.119001, 38.104996, 30.014002, 38.132996, 29.799002);
        ((GeneralPath) shape).curveTo(38.187996, 29.588001, 38.147995, 29.373001, 38.015995, 29.158);
        ((GeneralPath) shape).curveTo(37.878994, 28.975, 37.722996, 28.865002, 37.534996, 28.842001);
        ((GeneralPath) shape).curveTo(37.159996, 28.76, 36.999996, 29.092001, 37.054996, 29.842001);
        ((GeneralPath) shape).curveTo(37.104996, 30.135, 37.253998, 30.385, 37.491997, 30.6);
        ((GeneralPath) shape).curveTo(37.733997, 30.814001, 37.999996, 30.92, 38.292995, 30.92);
        ((GeneralPath) shape).curveTo(38.585995, 30.92, 38.745995, 30.693, 38.772995, 30.24);
        ((GeneralPath) shape).curveTo(38.800995, 29.842, 38.722996, 29.428, 38.534996, 28.998);
        ((GeneralPath) shape).curveTo(38.214996, 28.224998, 37.440994, 27.505999, 36.214996, 26.842);
        ((GeneralPath) shape).curveTo(35.788998, 26.626999, 35.425995, 26.213, 35.132996, 25.599998);
        ((GeneralPath) shape).curveTo(34.894997, 25.064, 34.745995, 24.494, 34.690994, 23.880999);
        ((GeneralPath) shape).curveTo(34.612995, 22.892998, 34.866993, 22.267998, 35.452995, 21.998);
        ((GeneralPath) shape).curveTo(35.745995, 21.865, 36.038994, 21.880999, 36.335995, 22.040998);
        ((GeneralPath) shape).curveTo(36.679996, 22.251999, 36.921993, 22.638998, 37.054996, 23.200998);
        ((GeneralPath) shape).curveTo(37.187996, 23.731998, 37.159996, 24.173998, 36.972996, 24.520998);
        ((GeneralPath) shape).curveTo(36.811996, 24.813997, 36.612995, 24.946999, 36.374996, 24.919998);
        ((GeneralPath) shape).curveTo(36.187996, 24.892998, 36.011997, 24.786999, 35.851997, 24.599998);
        ((GeneralPath) shape).curveTo(35.718998, 24.384998, 35.668, 24.134998, 35.690998, 23.842);
        ((GeneralPath) shape).curveTo(35.718998, 23.544998, 35.801, 23.345999, 35.934, 23.24);
        ((GeneralPath) shape).curveTo(36.065998, 23.157999, 36.16, 23.185, 36.214996, 23.317999);
        ((GeneralPath) shape).curveTo(36.265995, 23.428, 36.253998, 23.549, 36.175995, 23.682);
        ((GeneralPath) shape).curveTo(36.065994, 23.786999, 36.054996, 23.92, 36.132996, 24.08);
        ((GeneralPath) shape).curveTo(36.187996, 24.24, 36.280994, 24.318, 36.413994, 24.318);
        ((GeneralPath) shape).curveTo(36.546993, 24.318, 36.640995, 24.201, 36.694992, 23.959002);
        ((GeneralPath) shape).curveTo(36.722992, 23.721, 36.694992, 23.494001, 36.61299, 23.279001);
        ((GeneralPath) shape).curveTo(36.401993, 22.666, 36.09399, 22.467001, 35.694992, 22.682001);
        ((GeneralPath) shape).curveTo(35.401993, 22.814001, 35.28099, 23.334002, 35.33599, 24.240002);
        ((GeneralPath) shape).curveTo(35.33599, 24.533, 35.45299, 24.814001, 35.694992, 25.080002);
        ((GeneralPath) shape).curveTo(35.90599, 25.318003, 36.14799, 25.455002, 36.413994, 25.478003);
        ((GeneralPath) shape).curveTo(37.081993, 25.560003, 37.425995, 25.014002, 37.452995, 23.842003);
        ((GeneralPath) shape).curveTo(37.534996, 22.775003, 37.120995, 22.041002, 36.214996, 21.639004);
        ((GeneralPath) shape).curveTo(35.866997, 21.478004, 35.519997, 21.494003, 35.175995, 21.682003);
        ((GeneralPath) shape).curveTo(34.800995, 21.865004, 34.558994, 22.185003, 34.452995, 22.639004);
        ((GeneralPath) shape).curveTo(34.241997, 23.279003, 34.308994, 24.185003, 34.651997, 25.361004);
        ((GeneralPath) shape).curveTo(34.972996, 26.373003, 35.722996, 27.174004, 36.894997, 27.760004);
        ((GeneralPath) shape).curveTo(37.319996, 27.975004, 37.694996, 28.295004, 38.015995, 28.721004);
        ((GeneralPath) shape).curveTo(38.308994, 29.119005, 38.468994, 29.467005, 38.491997, 29.760004);
        ((GeneralPath) shape).curveTo(38.491997, 30.346004, 38.304996, 30.600004, 37.934, 30.521004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x837236));
        g.fill(shape);

        // _0_0_0_152
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.734, 25.08);
        ((GeneralPath) shape).curveTo(38.238003, 25.373, 38.586002, 25.467, 38.773003, 25.361);
        ((GeneralPath) shape).curveTo(38.824, 25.307, 38.852, 25.225, 38.852, 25.119);
        ((GeneralPath) shape).curveTo(38.828003, 25.014, 38.773003, 24.959, 38.691, 24.959);
        ((GeneralPath) shape).curveTo(38.215, 24.959, 37.961002, 24.826, 37.934002, 24.56);
        ((GeneralPath) shape).curveTo(37.906002, 24.345999, 37.906002, 24.174, 37.934002, 24.041);
        ((GeneralPath) shape).curveTo(37.988003, 23.881, 38.066, 23.826, 38.176003, 23.881);
        ((GeneralPath) shape).curveTo(38.254, 23.932001, 38.320004, 24.014, 38.375004, 24.119001);
        ((GeneralPath) shape).curveTo(38.402004, 24.252, 38.375004, 24.307001, 38.293003, 24.279001);
        ((GeneralPath) shape).curveTo(38.215004, 24.252, 38.176003, 24.295002, 38.176003, 24.400002);
        ((GeneralPath) shape).curveTo(38.148003, 24.478, 38.176003, 24.533, 38.254, 24.560001);
        ((GeneralPath) shape).curveTo(38.469, 24.666002, 38.547, 24.533, 38.492, 24.158);
        ((GeneralPath) shape).curveTo(38.492, 23.814001, 38.387, 23.611, 38.176, 23.560001);
        ((GeneralPath) shape).curveTo(37.883, 23.400002, 37.68, 23.521002, 37.573997, 23.920002);
        ((GeneralPath) shape).curveTo(37.440998, 24.455002, 37.491997, 24.842003, 37.733997, 25.080002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_153
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.492, 29.08);
        ((GeneralPath) shape).curveTo(34.68, 29.157999, 34.773, 29.064, 34.773, 28.799);
        ((GeneralPath) shape).curveTo(34.773, 28.692999, 34.746, 28.626999, 34.690998, 28.6);
        ((GeneralPath) shape).curveTo(34.641, 28.6, 34.601997, 28.666, 34.573997, 28.799);
        ((GeneralPath) shape).curveTo(34.573997, 28.932, 34.546997, 28.947, 34.491997, 28.842);
        ((GeneralPath) shape).curveTo(34.440998, 28.759998, 34.397995, 28.639, 34.374996, 28.477999);
        ((GeneralPath) shape).curveTo(34.347996, 28.345999, 34.386997, 28.251999, 34.491997, 28.200998);
        ((GeneralPath) shape).curveTo(34.601997, 28.173998, 34.706997, 28.212997, 34.811996, 28.317999);
        ((GeneralPath) shape).curveTo(34.972996, 28.454998, 34.999996, 28.880999, 34.890995, 29.599998);
        ((GeneralPath) shape).curveTo(34.890995, 29.704998, 34.917995, 29.774998, 34.972996, 29.798998);
        ((GeneralPath) shape).curveTo(35.054996, 29.852999, 35.104996, 29.852999, 35.132996, 29.798998);
        ((GeneralPath) shape).curveTo(35.265995, 29.505999, 35.280994, 28.974998, 35.171997, 28.200998);
        ((GeneralPath) shape).curveTo(35.065998, 27.774998, 34.839996, 27.587997, 34.491997, 27.638998);
        ((GeneralPath) shape).curveTo(34.276997, 27.665998, 34.171997, 27.931997, 34.171997, 28.438997);
        ((GeneralPath) shape).curveTo(34.171997, 28.786997, 34.281, 28.997997, 34.491997, 29.079998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_154
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.172, 27.201);
        ((GeneralPath) shape).curveTo(38.254, 27.201, 38.332, 27.119, 38.414, 26.959);
        ((GeneralPath) shape).curveTo(38.465, 26.775, 38.453003, 26.588, 38.375, 26.4);
        ((GeneralPath) shape).curveTo(38.293, 26.185, 38.16, 26.053, 37.973, 25.998);
        ((GeneralPath) shape).curveTo(37.812, 25.946999, 37.718998, 25.998, 37.690998, 26.157999);
        ((GeneralPath) shape).curveTo(37.641, 26.345999, 37.641, 26.56, 37.690998, 26.799);
        ((GeneralPath) shape).curveTo(37.773, 27.092, 37.934, 27.225, 38.171997, 27.201);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_155
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.535, 29.639);
        ((GeneralPath) shape).curveTo(36.613, 29.639, 36.690998, 29.56, 36.773, 29.4);
        ((GeneralPath) shape).curveTo(36.823997, 29.213, 36.812, 29.025, 36.733997, 28.842);
        ((GeneralPath) shape).curveTo(36.624996, 28.626999, 36.491997, 28.494, 36.331997, 28.439);
        ((GeneralPath) shape).curveTo(36.171997, 28.384998, 36.065998, 28.439, 36.011997, 28.599998);
        ((GeneralPath) shape).curveTo(35.906, 29.317999, 36.078, 29.665998, 36.534996, 29.638998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_156
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.652, 21.92);
        ((GeneralPath) shape).curveTo(28.945, 20.932, 28.988, 20.014, 28.773, 19.158);
        ((GeneralPath) shape).curveTo(28.641, 18.572, 28.387001, 18.041, 28.012001, 17.560001);
        ((GeneralPath) shape).curveTo(27.668001, 17.107002, 27.320002, 16.826002, 26.973001, 16.721);
        ((GeneralPath) shape).curveTo(26.602001, 16.588001, 26.305002, 16.615, 26.094002, 16.799);
        ((GeneralPath) shape).curveTo(25.824001, 17.041, 25.707003, 17.478, 25.734001, 18.119);
        ((GeneralPath) shape).curveTo(25.812, 19.428, 26.188002, 20.295, 26.852001, 20.720999);
        ((GeneralPath) shape).curveTo(27.121, 20.907999, 27.359001, 20.946999, 27.574001, 20.842);
        ((GeneralPath) shape).curveTo(27.812002, 20.731998, 27.934002, 20.521, 27.934002, 20.200998);
        ((GeneralPath) shape).curveTo(27.984001, 19.294998, 27.852001, 18.638998, 27.531002, 18.239998);
        ((GeneralPath) shape).curveTo(27.078003, 17.681997, 26.773003, 17.653997, 26.613003, 18.157997);
        ((GeneralPath) shape).curveTo(26.531002, 18.345997, 26.520002, 18.587997, 26.574003, 18.880997);
        ((GeneralPath) shape).curveTo(26.625004, 19.145996, 26.719004, 19.345997, 26.852003, 19.477997);
        ((GeneralPath) shape).curveTo(26.984003, 19.587997, 27.094004, 19.587997, 27.172003, 19.477997);
        ((GeneralPath) shape).curveTo(27.227003, 19.345997, 27.199003, 19.184998, 27.090002, 18.997997);
        ((GeneralPath) shape).curveTo(26.957003, 18.786997, 26.934002, 18.626997, 27.012003, 18.520998);
        ((GeneralPath) shape).curveTo(27.066004, 18.411999, 27.160004, 18.466997, 27.293003, 18.681997);
        ((GeneralPath) shape).curveTo(27.453003, 18.919998, 27.547003, 19.200996, 27.574003, 19.520998);
        ((GeneralPath) shape).curveTo(27.598003, 19.864998, 27.547003, 20.091997, 27.414003, 20.200998);
        ((GeneralPath) shape).curveTo(27.254004, 20.307, 27.078003, 20.294998, 26.891003, 20.157999);
        ((GeneralPath) shape).curveTo(26.652002, 19.998, 26.453003, 19.705, 26.293003, 19.279);
        ((GeneralPath) shape).curveTo(26.078003, 18.748, 26.027002, 18.224998, 26.133003, 17.720999);
        ((GeneralPath) shape).curveTo(26.266003, 17.213, 26.508003, 16.985998, 26.852003, 17.040998);
        ((GeneralPath) shape).curveTo(27.145002, 17.092, 27.453003, 17.317999, 27.773003, 17.720999);
        ((GeneralPath) shape).curveTo(28.332003, 18.411999, 28.598003, 19.279, 28.574003, 20.317999);
        ((GeneralPath) shape).curveTo(28.547003, 20.932, 28.414003, 21.439, 28.172003, 21.842);
        ((GeneralPath) shape).curveTo(27.906002, 22.290998, 27.559002, 22.477999, 27.133003, 22.4);
        ((GeneralPath) shape).curveTo(26.598003, 22.268, 26.117002, 22.24, 25.691004, 22.317999);
        ((GeneralPath) shape).curveTo(25.238005, 22.4, 24.934004, 22.599998, 24.773005, 22.919998);
        ((GeneralPath) shape).curveTo(24.613005, 23.239998, 24.547005, 23.638998, 24.574005, 24.118998);
        ((GeneralPath) shape).curveTo(24.625006, 24.653997, 24.801004, 25.024998, 25.090006, 25.239998);
        ((GeneralPath) shape).curveTo(25.387007, 25.454998, 25.652006, 25.532997, 25.891006, 25.477999);
        ((GeneralPath) shape).curveTo(26.160006, 25.428, 26.305006, 25.251999, 26.332006, 24.959);
        ((GeneralPath) shape).curveTo(26.387007, 24.185, 26.211006, 23.705, 25.812006, 23.521);
        ((GeneralPath) shape).curveTo(25.625006, 23.412, 25.465006, 23.412, 25.332006, 23.521);
        ((GeneralPath) shape).curveTo(25.227007, 23.654, 25.184006, 23.853, 25.211006, 24.119);
        ((GeneralPath) shape).curveTo(25.238007, 24.384998, 25.332006, 24.56, 25.492006, 24.639);
        ((GeneralPath) shape).curveTo(25.602007, 24.693, 25.680006, 24.666, 25.734007, 24.56);
        ((GeneralPath) shape).curveTo(25.891006, 24.345999, 25.891006, 24.24, 25.734007, 24.24);
        ((GeneralPath) shape).curveTo(25.625008, 24.268, 25.535007, 24.251999, 25.453007, 24.201);
        ((GeneralPath) shape).curveTo(25.426006, 24.174, 25.426006, 24.107, 25.453007, 23.998001);
        ((GeneralPath) shape).curveTo(25.480007, 23.893002, 25.535007, 23.826, 25.613007, 23.799002);
        ((GeneralPath) shape).curveTo(25.691006, 23.748001, 25.785007, 23.814001, 25.891006, 23.998001);
        ((GeneralPath) shape).curveTo(26.000006, 24.158, 26.051006, 24.346, 26.051006, 24.560001);
        ((GeneralPath) shape).curveTo(26.078007, 24.775002, 26.027006, 24.932001, 25.891006, 25.041002);
        ((GeneralPath) shape).curveTo(25.785006, 25.174002, 25.641006, 25.185001, 25.453007, 25.080002);
        ((GeneralPath) shape).curveTo(25.051006, 24.865002, 24.852007, 24.439001, 24.852007, 23.799002);
        ((GeneralPath) shape).curveTo(24.852007, 23.506002, 25.000008, 23.252, 25.293007, 23.041002);
        ((GeneralPath) shape).curveTo(25.641006, 22.799002, 26.027006, 22.732002, 26.453007, 22.842003);
        ((GeneralPath) shape).curveTo(27.652006, 23.053003, 28.387007, 22.748003, 28.652006, 21.920002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_157
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.453, 18.76);
        ((GeneralPath) shape).curveTo(24.719, 19.185, 25.066, 19.346, 25.491999, 19.24);
        ((GeneralPath) shape).curveTo(25.574, 19.24, 25.640999, 19.135, 25.690998, 18.92);
        ((GeneralPath) shape).curveTo(25.718998, 18.682, 25.690998, 18.412, 25.612999, 18.119);
        ((GeneralPath) shape).curveTo(25.535, 17.692999, 25.331999, 17.4, 25.012, 17.24);
        ((GeneralPath) shape).curveTo(24.800999, 17.185, 24.691, 17.334, 24.691, 17.682);
        ((GeneralPath) shape).curveTo(24.691, 18.053, 24.785, 18.268, 24.973, 18.317999);
        ((GeneralPath) shape).curveTo(25.027, 18.345999, 25.055, 18.307, 25.055, 18.200998);
        ((GeneralPath) shape).curveTo(25.055, 18.064, 25.016, 17.985998, 24.934, 17.958998);
        ((GeneralPath) shape).curveTo(24.828, 17.907997, 24.801, 17.841997, 24.855, 17.759998);
        ((GeneralPath) shape).curveTo(24.879, 17.653997, 24.949, 17.610998, 25.055, 17.638998);
        ((GeneralPath) shape).curveTo(25.137001, 17.638998, 25.203001, 17.747997, 25.254, 17.958998);
        ((GeneralPath) shape).curveTo(25.309, 18.173998, 25.32, 18.372997, 25.293, 18.559998);
        ((GeneralPath) shape).curveTo(25.269999, 18.720997, 25.147999, 18.747997, 24.934, 18.638998);
        ((GeneralPath) shape).curveTo(24.695, 18.505999, 24.547, 18.427998, 24.492, 18.399998);
        ((GeneralPath) shape).curveTo(24.414001, 18.317997, 24.398, 18.438997, 24.453001, 18.759998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_158
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.492, 26.318);
        ((GeneralPath) shape).curveTo(28.359001, 25.494001, 28.375, 25.068, 28.535, 25.041);
        ((GeneralPath) shape).curveTo(28.668, 25.014, 28.785, 25.053, 28.895, 25.158);
        ((GeneralPath) shape).curveTo(29.0, 25.268002, 29.039, 25.400002, 29.012001, 25.560001);
        ((GeneralPath) shape).curveTo(29.012001, 25.721, 28.988, 25.826002, 28.934002, 25.881);
        ((GeneralPath) shape).curveTo(28.852001, 25.908, 28.812002, 25.853, 28.812002, 25.721);
        ((GeneralPath) shape).curveTo(28.812002, 25.588001, 28.785002, 25.506, 28.734003, 25.478);
        ((GeneralPath) shape).curveTo(28.652002, 25.428001, 28.613003, 25.467001, 28.613003, 25.6);
        ((GeneralPath) shape).curveTo(28.613003, 25.893, 28.719004, 26.064001, 28.934002, 26.119);
        ((GeneralPath) shape).curveTo(29.121002, 26.174, 29.215002, 26.014, 29.215002, 25.639);
        ((GeneralPath) shape).curveTo(29.215002, 25.135, 29.094002, 24.775, 28.852001, 24.56);
        ((GeneralPath) shape).curveTo(28.719002, 24.428, 28.586, 24.373, 28.453001, 24.4);
        ((GeneralPath) shape).curveTo(28.320002, 24.428, 28.238, 24.506, 28.215, 24.639);
        ((GeneralPath) shape).curveTo(28.105, 25.361, 28.133, 25.947, 28.293, 26.4);
        ((GeneralPath) shape).curveTo(28.348, 26.477999, 28.401999, 26.521, 28.453, 26.521);
        ((GeneralPath) shape).curveTo(28.508, 26.494, 28.519999, 26.428, 28.491999, 26.318);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_159
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.094, 21.24);
        ((GeneralPath) shape).curveTo(25.336, 21.428, 25.492, 21.4, 25.574, 21.157999);
        ((GeneralPath) shape).curveTo(25.625, 20.974998, 25.625, 20.748, 25.574, 20.477999);
        ((GeneralPath) shape).curveTo(25.546999, 20.294998, 25.453, 20.157999, 25.293, 20.079998);
        ((GeneralPath) shape).curveTo(25.105, 19.997997, 24.973, 20.040998, 24.894999, 20.200998);
        ((GeneralPath) shape).curveTo(24.811998, 20.360998, 24.811998, 20.559998, 24.894999, 20.798998);
        ((GeneralPath) shape).curveTo(24.944998, 21.013998, 25.012, 21.157997, 25.093998, 21.239998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_160
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.852, 25.158);
        ((GeneralPath) shape).curveTo(27.094, 25.346, 27.254, 25.318, 27.335999, 25.080002);
        ((GeneralPath) shape).curveTo(27.387, 24.893002, 27.387, 24.666002, 27.335999, 24.400002);
        ((GeneralPath) shape).curveTo(27.308998, 24.240002, 27.214998, 24.107002, 27.054998, 23.998001);
        ((GeneralPath) shape).curveTo(26.866999, 23.920002, 26.734, 23.959002, 26.651999, 24.119001);
        ((GeneralPath) shape).curveTo(26.574, 24.279001, 26.574, 24.478, 26.651999, 24.721);
        ((GeneralPath) shape).curveTo(26.706999, 24.932001, 26.772999, 25.08, 26.852, 25.158);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_161
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.332, 14.439);
        ((GeneralPath) shape).curveTo(36.066, 14.389, 35.785, 14.201, 35.492, 13.8810005);
        ((GeneralPath) shape).curveTo(34.934002, 13.268001, 34.652, 12.533001, 34.652, 11.682001);
        ((GeneralPath) shape).curveTo(34.68, 11.146001, 34.801, 10.721001, 35.012, 10.400002);
        ((GeneralPath) shape).curveTo(35.281002, 10.025002, 35.625, 9.920002, 36.055, 10.080002);
        ((GeneralPath) shape).curveTo(37.172, 10.478002, 37.879, 10.455002, 38.172, 9.998002);
        ((GeneralPath) shape).curveTo(38.332, 9.732002, 38.398003, 9.4000025, 38.375, 8.998002);
        ((GeneralPath) shape).curveTo(38.32, 8.545002, 38.172, 8.201002, 37.934, 7.959002);
        ((GeneralPath) shape).curveTo(37.641, 7.721002, 37.386997, 7.600002, 37.171997, 7.600002);
        ((GeneralPath) shape).curveTo(36.961, 7.600002, 36.839996, 7.732002, 36.811996, 7.998002);
        ((GeneralPath) shape).curveTo(36.761997, 8.615002, 36.906, 9.053002, 37.253998, 9.318002);
        ((GeneralPath) shape).curveTo(37.440998, 9.451002, 37.586, 9.478002, 37.690998, 9.400002);
        ((GeneralPath) shape).curveTo(37.828, 9.318002, 37.866997, 9.158002, 37.811996, 8.920002);
        ((GeneralPath) shape).curveTo(37.784996, 8.705002, 37.706997, 8.545002, 37.573997, 8.439002);
        ((GeneralPath) shape).curveTo(37.464996, 8.357002, 37.386997, 8.357002, 37.331997, 8.439002);
        ((GeneralPath) shape).curveTo(37.281, 8.490002, 37.253998, 8.557002, 37.253998, 8.639002);
        ((GeneralPath) shape).curveTo(37.253998, 8.693002, 37.276997, 8.721002, 37.331997, 8.721002);
        ((GeneralPath) shape).curveTo(37.464996, 8.721002, 37.546997, 8.744001, 37.573997, 8.799002);
        ((GeneralPath) shape).curveTo(37.624996, 8.853002, 37.641, 8.908002, 37.613, 8.959002);
        ((GeneralPath) shape).curveTo(37.586, 9.041001, 37.535, 9.092002, 37.453, 9.119001);
        ((GeneralPath) shape).curveTo(37.402, 9.146002, 37.32, 9.080002, 37.215, 8.920001);
        ((GeneralPath) shape).curveTo(37.105, 8.760001, 37.055, 8.588001, 37.055, 8.400002);
        ((GeneralPath) shape).curveTo(37.055, 8.185001, 37.105, 8.053001, 37.215, 7.9980016);
        ((GeneralPath) shape).curveTo(37.32, 7.9470015, 37.453, 7.975002, 37.613, 8.080002);
        ((GeneralPath) shape).curveTo(37.934, 8.318002, 38.093998, 8.705002, 38.093998, 9.240002);
        ((GeneralPath) shape).curveTo(38.093998, 9.506001, 37.961, 9.693002, 37.690998, 9.799002);
        ((GeneralPath) shape).curveTo(37.401997, 9.959002, 37.065998, 9.959002, 36.690998, 9.799002);
        ((GeneralPath) shape).curveTo(35.519997, 9.400002, 34.811996, 9.545002, 34.573997, 10.240002);
        ((GeneralPath) shape).curveTo(34.253998, 11.119001, 34.214996, 11.920002, 34.453, 12.639002);
        ((GeneralPath) shape).curveTo(34.613, 13.119001, 34.867, 13.560001, 35.215, 13.959002);
        ((GeneralPath) shape).curveTo(35.559002, 14.357001, 35.895, 14.611002, 36.215, 14.721002);
        ((GeneralPath) shape).curveTo(37.016, 14.932002, 37.375, 14.588001, 37.293, 13.678001);
        ((GeneralPath) shape).curveTo(37.27, 12.639002, 36.948997, 11.920001, 36.336, 11.518002);
        ((GeneralPath) shape).curveTo(36.065998, 11.334002, 35.828, 11.268002, 35.613, 11.318002);
        ((GeneralPath) shape).curveTo(35.402, 11.373002, 35.293, 11.533002, 35.293, 11.799002);
        ((GeneralPath) shape).curveTo(35.242, 12.572001, 35.375, 13.131001, 35.695, 13.478002);
        ((GeneralPath) shape).curveTo(36.093998, 13.908002, 36.387, 13.947001, 36.574, 13.600001);
        ((GeneralPath) shape).curveTo(36.629, 13.439001, 36.629, 13.240002, 36.574, 12.998001);
        ((GeneralPath) shape).curveTo(36.551003, 12.787001, 36.469, 12.627001, 36.336002, 12.518002);
        ((GeneralPath) shape).curveTo(36.203003, 12.412002, 36.109, 12.412002, 36.055004, 12.518002);
        ((GeneralPath) shape).curveTo(36.004005, 12.600001, 36.027004, 12.732001, 36.137005, 12.920002);
        ((GeneralPath) shape).curveTo(36.215004, 13.107002, 36.242004, 13.225002, 36.215004, 13.279002);
        ((GeneralPath) shape).curveTo(36.137005, 13.357002, 36.043003, 13.307002, 35.938004, 13.119002);
        ((GeneralPath) shape).curveTo(35.777004, 12.932002, 35.684002, 12.705003, 35.656002, 12.439002);
        ((GeneralPath) shape).curveTo(35.574, 11.853002, 35.789, 11.693002, 36.293003, 11.9590025);
        ((GeneralPath) shape).curveTo(36.508003, 12.119002, 36.680004, 12.373002, 36.816, 12.717003);
        ((GeneralPath) shape).curveTo(37.0, 13.170003, 37.055, 13.5840025, 36.977, 13.9590025);
        ((GeneralPath) shape).curveTo(36.867, 14.3340025, 36.652, 14.494002, 36.332, 14.439002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_162
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.652, 13.201);
        ((GeneralPath) shape).curveTo(37.574, 13.201, 37.52, 13.279, 37.492, 13.439);
        ((GeneralPath) shape).curveTo(37.469, 13.627, 37.48, 13.826, 37.535, 14.041);
        ((GeneralPath) shape).curveTo(37.641, 14.439, 37.812, 14.666, 38.055, 14.721001);
        ((GeneralPath) shape).curveTo(38.215, 14.771001, 38.293, 14.682001, 38.293, 14.439001);
        ((GeneralPath) shape).curveTo(38.293, 14.146001, 38.226997, 13.975001, 38.093998, 13.920001);
        ((GeneralPath) shape).curveTo(38.038998, 13.893001, 38.011997, 13.920001, 38.011997, 14.002001);
        ((GeneralPath) shape).curveTo(38.011997, 14.107, 38.054996, 14.174001, 38.132996, 14.201001);
        ((GeneralPath) shape).curveTo(38.187996, 14.228002, 38.198997, 14.279001, 38.171997, 14.361001);
        ((GeneralPath) shape).curveTo(38.148, 14.439001, 38.093998, 14.467001, 38.011997, 14.439001);
        ((GeneralPath) shape).curveTo(37.828, 14.389001, 37.761997, 14.146001, 37.811996, 13.721001);
        ((GeneralPath) shape).curveTo(37.839996, 13.455001, 38.054996, 13.521001, 38.452995, 13.920001);
        ((GeneralPath) shape).curveTo(38.507996, 13.947001, 38.546997, 13.920001, 38.573994, 13.842001);
        ((GeneralPath) shape).curveTo(38.601994, 13.760001, 38.585995, 13.693001, 38.534992, 13.643001);
        ((GeneralPath) shape).curveTo(38.29299, 13.268001, 37.999992, 13.119, 37.651993, 13.201);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_163
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.094, 7.92);
        ((GeneralPath) shape).curveTo(35.199, 7.92, 35.266003, 7.853, 35.293003, 7.721);
        ((GeneralPath) shape).curveTo(35.398003, 7.0530005, 35.375004, 6.506, 35.215004, 6.08);
        ((GeneralPath) shape).curveTo(35.188004, 5.947, 35.133003, 5.881, 35.055004, 5.881);
        ((GeneralPath) shape).curveTo(34.973003, 5.853, 34.945004, 5.908, 34.973003, 6.041);
        ((GeneralPath) shape).curveTo(35.078003, 6.865, 35.066, 7.279, 34.934002, 7.279);
        ((GeneralPath) shape).curveTo(34.824, 7.279, 34.707, 7.213, 34.574, 7.08);
        ((GeneralPath) shape).curveTo(34.465, 6.947, 34.414, 6.814, 34.414, 6.682);
        ((GeneralPath) shape).curveTo(34.441, 6.5210004, 34.480003, 6.428, 34.535, 6.4);
        ((GeneralPath) shape).curveTo(34.586, 6.373, 34.625, 6.428, 34.652, 6.56);
        ((GeneralPath) shape).curveTo(34.68, 6.693, 34.719, 6.7869997, 34.773, 6.842);
        ((GeneralPath) shape).curveTo(34.823997, 6.865, 34.851997, 6.826, 34.851997, 6.721);
        ((GeneralPath) shape).curveTo(34.851997, 6.4550004, 34.733997, 6.2520003, 34.491997, 6.1190004);
        ((GeneralPath) shape).curveTo(34.304996, 6.0410004, 34.211, 6.1740003, 34.211, 6.5210004);
        ((GeneralPath) shape).curveTo(34.211, 7.0250006, 34.348, 7.412, 34.613, 7.682);
        ((GeneralPath) shape).curveTo(34.773, 7.842, 34.934, 7.92, 35.093998, 7.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_164
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.012, 11.639);
        ((GeneralPath) shape).curveTo(37.801003, 11.455, 37.668, 11.467, 37.613003, 11.682);
        ((GeneralPath) shape).curveTo(37.559002, 11.814, 37.547, 11.986, 37.574, 12.201);
        ((GeneralPath) shape).curveTo(37.625, 12.334001, 37.719, 12.439, 37.852, 12.518001);
        ((GeneralPath) shape).curveTo(38.012, 12.6, 38.121002, 12.588, 38.172, 12.478001);
        ((GeneralPath) shape).curveTo(38.254, 12.373001, 38.266003, 12.213, 38.215, 11.998001);
        ((GeneralPath) shape).curveTo(38.16, 11.842001, 38.094, 11.721001, 38.012, 11.639001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_165
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.414, 8.041);
        ((GeneralPath) shape).curveTo(36.172, 7.7990003, 36.027, 7.7990003, 35.973, 8.041);
        ((GeneralPath) shape).curveTo(35.922, 8.201, 35.922, 8.400001, 35.973, 8.639);
        ((GeneralPath) shape).curveTo(36.0, 8.799, 36.093998, 8.932, 36.253998, 9.041);
        ((GeneralPath) shape).curveTo(36.440998, 9.146, 36.573997, 9.1310005, 36.651997, 8.998);
        ((GeneralPath) shape).curveTo(36.706997, 8.893001, 36.706997, 8.721, 36.651997, 8.478001);
        ((GeneralPath) shape).curveTo(36.573997, 8.268001, 36.491997, 8.119, 36.413998, 8.041);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_166
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.895, 8.998);
        ((GeneralPath) shape).curveTo(25.762001, 8.412, 25.785, 7.9750004, 25.973, 7.682);
        ((GeneralPath) shape).curveTo(26.133, 7.412, 26.336, 7.3180003, 26.574, 7.4);
        ((GeneralPath) shape).curveTo(26.762, 7.451, 26.934, 7.5880003, 27.094, 7.7990003);
        ((GeneralPath) shape).curveTo(27.254, 8.064, 27.32, 8.346001, 27.293, 8.639);
        ((GeneralPath) shape).curveTo(27.265999, 8.931999, 27.175999, 9.1189995, 27.012, 9.201);
        ((GeneralPath) shape).curveTo(26.905998, 9.252, 26.811998, 9.213, 26.734, 9.08);
        ((GeneralPath) shape).curveTo(26.679998, 8.92, 26.706999, 8.787, 26.811998, 8.682);
        ((GeneralPath) shape).curveTo(26.921999, 8.5720005, 26.933998, 8.439, 26.852, 8.279);
        ((GeneralPath) shape).curveTo(26.800999, 8.119, 26.691, 8.025001, 26.535, 7.998);
        ((GeneralPath) shape).curveTo(26.402, 7.9750004, 26.309, 8.08, 26.254, 8.318);
        ((GeneralPath) shape).curveTo(26.227, 8.533, 26.254, 8.771, 26.336, 9.040999);
        ((GeneralPath) shape).curveTo(26.547, 9.6779995, 26.867, 9.947, 27.293001, 9.837999);
        ((GeneralPath) shape).curveTo(27.508001, 9.787, 27.625002, 9.599999, 27.652, 9.278999);
        ((GeneralPath) shape).curveTo(27.68, 9.1189995, 27.68, 8.799, 27.652, 8.317999);
        ((GeneralPath) shape).curveTo(27.625, 7.9979987, 27.492, 7.677999, 27.254, 7.356999);
        ((GeneralPath) shape).curveTo(27.039, 7.0639987, 26.785, 6.864999, 26.492, 6.759999);
        ((GeneralPath) shape).curveTo(25.828001, 6.5719986, 25.480001, 7.0639987, 25.453001, 8.239999);
        ((GeneralPath) shape).curveTo(25.426, 9.388999, 25.867, 10.251999, 26.773, 10.841999);
        ((GeneralPath) shape).curveTo(27.121, 11.0529995, 27.480001, 11.091999, 27.852001, 10.958999);
        ((GeneralPath) shape).curveTo(28.227001, 10.852999, 28.469002, 10.587998, 28.574001, 10.157999);
        ((GeneralPath) shape).curveTo(28.758001, 9.544999, 28.680002, 8.599999, 28.332, 7.317999);
        ((GeneralPath) shape).curveTo(28.039001, 6.251999, 27.266, 5.2679987, 26.012001, 4.356999);
        ((GeneralPath) shape).curveTo(25.559002, 4.040999, 25.160002, 3.6109989, 24.812, 3.079999);
        ((GeneralPath) shape).curveTo(24.492, 2.571999, 24.332, 2.1739988, 24.332, 1.880999);
        ((GeneralPath) shape).curveTo(24.305, 1.587999, 24.348001, 1.372999, 24.453001, 1.239999);
        ((GeneralPath) shape).curveTo(24.535002, 1.106999, 24.668001, 1.091999, 24.852001, 1.1969991);
        ((GeneralPath) shape).curveTo(25.305, 1.384999, 25.535002, 1.743999, 25.535002, 2.278999);
        ((GeneralPath) shape).curveTo(25.535002, 2.493999, 25.480001, 2.6269991, 25.375002, 2.677999);
        ((GeneralPath) shape).curveTo(25.266003, 2.731999, 25.172003, 2.704999, 25.094002, 2.599999);
        ((GeneralPath) shape).curveTo(24.852001, 2.224999, 24.801003, 2.040999, 24.934002, 2.040999);
        ((GeneralPath) shape).curveTo(24.961002, 2.040999, 25.051003, 2.118999, 25.215002, 2.2789989);
        ((GeneralPath) shape).curveTo(25.426003, 2.5719988, 25.426003, 2.4669988, 25.215002, 1.9589989);
        ((GeneralPath) shape).curveTo(25.133001, 1.8259989, 25.039001, 1.7319989, 24.934002, 1.6779989);
        ((GeneralPath) shape).curveTo(24.801003, 1.6269989, 24.719002, 1.7049989, 24.691002, 1.9199989);
        ((GeneralPath) shape).curveTo(24.668001, 2.1309988, 24.719002, 2.356999, 24.852001, 2.599999);
        ((GeneralPath) shape).curveTo(24.961, 2.841999, 25.121, 2.997999, 25.332, 3.079999);
        ((GeneralPath) shape).curveTo(25.52, 3.157999, 25.652, 3.091999, 25.734001, 2.880999);
        ((GeneralPath) shape).curveTo(25.812, 2.6929991, 25.824001, 2.4389992, 25.773, 2.118999);
        ((GeneralPath) shape).curveTo(25.719, 1.7989991, 25.574001, 1.5059991, 25.332, 1.239999);
        ((GeneralPath) shape).curveTo(25.094, 0.9469991, 24.812, 0.75999904, 24.492, 0.681999);
        ((GeneralPath) shape).curveTo(24.199001, 0.626999, 24.039001, 0.825999, 24.012001, 1.2789991);
        ((GeneralPath) shape).curveTo(23.988, 1.7049991, 24.066002, 2.173999, 24.254002, 2.6819992);
        ((GeneralPath) shape).curveTo(24.625002, 3.6149993, 25.453001, 4.520999, 26.734001, 5.399999);
        ((GeneralPath) shape).curveTo(27.188002, 5.7209992, 27.559002, 6.251999, 27.852001, 6.997999);
        ((GeneralPath) shape).curveTo(28.094002, 7.6149993, 28.238, 8.224999, 28.293001, 8.841999);
        ((GeneralPath) shape).curveTo(28.375002, 9.852999, 28.133001, 10.438999, 27.574001, 10.599999);
        ((GeneralPath) shape).curveTo(27.254002, 10.681999, 26.949001, 10.599999, 26.652, 10.356999);
        ((GeneralPath) shape).curveTo(26.305, 10.063999, 26.055, 9.615, 25.895, 8.997999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_167
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.734, 8.08);
        ((GeneralPath) shape).curveTo(24.625, 7.998, 24.559, 7.893, 24.535, 7.7599998);
        ((GeneralPath) shape).curveTo(24.48, 7.654, 24.508, 7.615, 24.612999, 7.6429996);
        ((GeneralPath) shape).curveTo(24.690998, 7.6659994, 24.734, 7.6429996, 24.734, 7.5599995);
        ((GeneralPath) shape).curveTo(24.734, 7.4549994, 24.691, 7.3729997, 24.612999, 7.3179994);
        ((GeneralPath) shape).curveTo(24.453, 7.1579995, 24.374998, 7.2789993, 24.374998, 7.681999);
        ((GeneralPath) shape).curveTo(24.374998, 8.0529995, 24.491999, 8.294999, 24.733997, 8.4);
        ((GeneralPath) shape).curveTo(25.026997, 8.615, 25.226997, 8.533, 25.331997, 8.158);
        ((GeneralPath) shape).curveTo(25.464996, 7.6, 25.397997, 7.185, 25.132998, 6.92);
        ((GeneralPath) shape).curveTo(24.651997, 6.439, 24.304998, 6.268, 24.093998, 6.4);
        ((GeneralPath) shape).curveTo(24.038998, 6.428, 24.011997, 6.506, 24.011997, 6.639);
        ((GeneralPath) shape).curveTo(24.038998, 6.748, 24.077997, 6.814, 24.132998, 6.842);
        ((GeneralPath) shape).curveTo(24.612997, 6.842, 24.890997, 7.025, 24.972998, 7.4);
        ((GeneralPath) shape).curveTo(25.022997, 7.639, 25.022997, 7.826, 24.972998, 7.959);
        ((GeneralPath) shape).curveTo(24.921997, 8.119, 24.839998, 8.158, 24.733997, 8.08);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        paint1(g, origAlpha, transformations);
    }

    private static void paint1(Graphics2D g, float origAlpha, java.util.LinkedList<AffineTransform> transformations) {
        Shape shape = null;

        // _0_0_0_168
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.453, 4.959);
        ((GeneralPath) shape).curveTo(28.745998, 4.986, 28.852, 4.748, 28.772999, 4.2400002);
        ((GeneralPath) shape).curveTo(28.772999, 3.8930001, 28.668, 3.6430001, 28.453, 3.4820004);
        ((GeneralPath) shape).curveTo(28.375, 3.4280005, 28.304998, 3.4280005, 28.254, 3.4820004);
        ((GeneralPath) shape).curveTo(28.171999, 3.5330005, 28.147999, 3.6150002, 28.171999, 3.7210004);
        ((GeneralPath) shape).curveTo(28.171999, 3.8530004, 28.199, 3.9200006, 28.254, 3.9200006);
        ((GeneralPath) shape).curveTo(28.305, 3.9470005, 28.348, 3.8930006, 28.375, 3.7600005);
        ((GeneralPath) shape).curveTo(28.375, 3.6270006, 28.398, 3.6150005, 28.453, 3.7210004);
        ((GeneralPath) shape).curveTo(28.508, 3.8260005, 28.546999, 3.9590003, 28.574, 4.1190004);
        ((GeneralPath) shape).curveTo(28.602, 4.2790003, 28.559, 4.3730006, 28.453, 4.4000006);
        ((GeneralPath) shape).curveTo(28.375, 4.4000006, 28.265999, 4.3340006, 28.133, 4.2010007);
        ((GeneralPath) shape).curveTo(27.921999, 3.9860008, 27.879, 3.5450006, 28.012, 2.8810005);
        ((GeneralPath) shape).curveTo(28.039, 2.7710006, 28.012, 2.6930006, 27.934, 2.6390004);
        ((GeneralPath) shape).curveTo(27.879, 2.5880003, 27.824, 2.5880003, 27.773, 2.6390004);
        ((GeneralPath) shape).curveTo(27.668001, 2.8530004, 27.668001, 3.4000003, 27.773, 4.2790003);
        ((GeneralPath) shape).curveTo(27.906, 4.7320004, 28.133001, 4.959, 28.453001, 4.959);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_169
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.652, 4.6);
        ((GeneralPath) shape).curveTo(24.574001, 4.572, 24.508001, 4.639, 24.453001, 4.799);
        ((GeneralPath) shape).curveTo(24.402, 4.9859996, 24.414001, 5.185, 24.492, 5.3999996);
        ((GeneralPath) shape).curveTo(24.574001, 5.6389995, 24.707, 5.799, 24.895, 5.8809996);
        ((GeneralPath) shape).curveTo(25.055, 5.9589996, 25.16, 5.9319997, 25.215, 5.799);
        ((GeneralPath) shape).curveTo(25.238, 5.588, 25.227, 5.357, 25.172, 5.119);
        ((GeneralPath) shape).curveTo(25.066, 4.799, 24.895, 4.627, 24.652, 4.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_170
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.332, 2.439);
        ((GeneralPath) shape).curveTo(26.227001, 2.439, 26.16, 2.521, 26.133001, 2.682);
        ((GeneralPath) shape).curveTo(26.078001, 2.865, 26.094002, 3.064, 26.172, 3.2789998);
        ((GeneralPath) shape).curveTo(26.254002, 3.521, 26.387001, 3.6819997, 26.574001, 3.7599998);
        ((GeneralPath) shape).curveTo(26.734001, 3.8139997, 26.840002, 3.7749999, 26.891, 3.6429996);
        ((GeneralPath) shape).curveTo(26.918001, 3.4549997, 26.906, 3.2399998, 26.852001, 3.0019996);
        ((GeneralPath) shape).curveTo(26.746, 2.6819997, 26.574001, 2.4939995, 26.332, 2.4389997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_171
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.691, 27.478);
        ((GeneralPath) shape).curveTo(8.707, 27.400002, 8.973, 27.185001, 8.492, 26.842001);
        ((GeneralPath) shape).curveTo(8.358999, 26.705002, 7.9059997, 26.721, 7.1329994, 26.881);
        ((GeneralPath) shape).curveTo(7.0549994, 26.213001, 7.1049995, 25.842001, 7.2929993, 25.76);
        ((GeneralPath) shape).curveTo(7.5079994, 25.682001, 7.690999, 25.666, 7.8519993, 25.721);
        ((GeneralPath) shape).curveTo(8.011999, 25.775002, 8.081999, 25.881, 8.054999, 26.041);
        ((GeneralPath) shape).curveTo(8.026999, 26.174, 7.9609995, 26.279001, 7.8519993, 26.361);
        ((GeneralPath) shape).curveTo(7.7459993, 26.439, 7.6909995, 26.412, 7.6909995, 26.279);
        ((GeneralPath) shape).curveTo(7.6679997, 26.146, 7.6129994, 26.08, 7.5349994, 26.08);
        ((GeneralPath) shape).curveTo(7.4529996, 26.08, 7.3979993, 26.135, 7.3749995, 26.24);
        ((GeneralPath) shape).curveTo(7.3749995, 26.532999, 7.5469995, 26.654, 7.8949995, 26.6);
        ((GeneralPath) shape).curveTo(8.214999, 26.549, 8.374999, 26.346, 8.374999, 25.998001);
        ((GeneralPath) shape).curveTo(8.374999, 25.494001, 8.187999, 25.201, 7.811999, 25.119001);
        ((GeneralPath) shape).curveTo(7.573999, 25.068, 7.331999, 25.080002, 7.093999, 25.158);
        ((GeneralPath) shape).curveTo(6.9059987, 25.240002, 6.784999, 25.361, 6.733999, 25.521002);
        ((GeneralPath) shape).curveTo(6.546999, 26.080002, 6.534999, 26.560001, 6.6909986, 26.959002);
        ((GeneralPath) shape).lineTo(5.5739985, 27.158);
        ((GeneralPath) shape).curveTo(4.7459984, 27.295, 3.8789983, 27.385, 2.9729984, 27.439001);
        ((GeneralPath) shape).curveTo(3.3749983, 27.279001, 3.5859983, 27.053001, 3.6129985, 26.76);
        ((GeneralPath) shape).curveTo(3.6679986, 26.439001, 3.6249986, 26.174, 3.4919984, 25.959);
        ((GeneralPath) shape).curveTo(3.3589985, 25.720999, 3.1449986, 25.6, 2.8519983, 25.6);
        ((GeneralPath) shape).curveTo(2.5349984, 25.572, 2.2659984, 25.654001, 2.0549984, 25.842001);
        ((GeneralPath) shape).curveTo(1.8399984, 25.998001, 1.7729983, 26.213001, 1.8519984, 26.478);
        ((GeneralPath) shape).curveTo(1.9059985, 26.693, 2.0389984, 26.814001, 2.2539985, 26.842001);
        ((GeneralPath) shape).curveTo(2.4689984, 26.842001, 2.6129985, 26.775002, 2.6909986, 26.639002);
        ((GeneralPath) shape).curveTo(2.8009984, 26.533, 2.8519986, 26.455002, 2.8519986, 26.400002);
        ((GeneralPath) shape).curveTo(2.8519986, 26.318, 2.8009987, 26.307001, 2.6909986, 26.361002);
        ((GeneralPath) shape).curveTo(2.4799986, 26.439001, 2.3319986, 26.467003, 2.2539985, 26.439001);
        ((GeneralPath) shape).curveTo(2.1989985, 26.412, 2.1879985, 26.346, 2.2149985, 26.240002);
        ((GeneralPath) shape).curveTo(2.2659984, 26.135002, 2.3589985, 26.041002, 2.4919984, 25.959002);
        ((GeneralPath) shape).curveTo(2.6249983, 25.908, 2.7729983, 25.920002, 2.9339983, 25.998001);
        ((GeneralPath) shape).curveTo(3.0939984, 26.107, 3.1879983, 26.268002, 3.2149982, 26.478);
        ((GeneralPath) shape).curveTo(3.2379982, 26.693, 3.1599982, 26.881, 2.9729981, 27.041);
        ((GeneralPath) shape).curveTo(2.7579982, 27.201, 2.5079982, 27.279001, 2.2149982, 27.279001);
        ((GeneralPath) shape).curveTo(1.6019983, 27.279001, 1.2929983, 26.959002, 1.2929983, 26.318);
        ((GeneralPath) shape).curveTo(1.2929983, 26.025002, 1.5349983, 25.705, 2.0119982, 25.361);
        ((GeneralPath) shape).curveTo(2.5469983, 24.986, 3.171998, 24.748, 3.894998, 24.639);
        ((GeneralPath) shape).curveTo(5.8119984, 24.318, 6.999998, 23.682, 7.452998, 22.721);
        ((GeneralPath) shape).curveTo(7.7459984, 22.107, 7.9179983, 21.627, 7.972998, 21.279001);
        ((GeneralPath) shape).curveTo(8.054998, 20.853, 7.987998, 20.412, 7.7729983, 19.959002);
        ((GeneralPath) shape).curveTo(7.5349984, 19.455002, 7.1209984, 19.064001, 6.5349984, 18.799002);
        ((GeneralPath) shape).curveTo(5.9729986, 18.533, 5.4139986, 18.428001, 4.8519983, 18.478003);
        ((GeneralPath) shape).curveTo(4.2379985, 18.533003, 3.7459984, 18.721003, 3.3749983, 19.041002);
        ((GeneralPath) shape).curveTo(2.9449983, 19.385002, 2.7579985, 19.853003, 2.8119984, 20.439003);
        ((GeneralPath) shape).curveTo(2.9179983, 21.666002, 3.5079985, 22.318003, 4.5739985, 22.400003);
        ((GeneralPath) shape).curveTo(4.9999986, 22.428003, 5.3979983, 22.346003, 5.7729983, 22.158003);
        ((GeneralPath) shape).curveTo(6.1449986, 21.947002, 6.347998, 21.693003, 6.374998, 21.400003);
        ((GeneralPath) shape).curveTo(6.425998, 20.467003, 6.2149982, 19.893003, 5.7339983, 19.682003);
        ((GeneralPath) shape).curveTo(4.9879985, 19.385002, 4.4689984, 19.521004, 4.171998, 20.080004);
        ((GeneralPath) shape).curveTo(4.065998, 20.318005, 4.054998, 20.545004, 4.132998, 20.760004);
        ((GeneralPath) shape).curveTo(4.214998, 21.025003, 4.358998, 21.174004, 4.573998, 21.201004);
        ((GeneralPath) shape).curveTo(4.811998, 21.225004, 4.987998, 21.174004, 5.093998, 21.041004);
        ((GeneralPath) shape).curveTo(5.171998, 20.908005, 5.132998, 20.775003, 4.972998, 20.639004);
        ((GeneralPath) shape).curveTo(4.866998, 20.560003, 4.800998, 20.494003, 4.7729983, 20.439003);
        ((GeneralPath) shape).curveTo(4.7459984, 20.385002, 4.7729983, 20.307003, 4.8519983, 20.201002);
        ((GeneralPath) shape).curveTo(4.933998, 20.092003, 5.0939984, 20.107002, 5.3319983, 20.240002);
        ((GeneralPath) shape).curveTo(5.5469985, 20.373001, 5.6909986, 20.600002, 5.7729983, 20.920002);
        ((GeneralPath) shape).curveTo(5.8239985, 21.213001, 5.7339983, 21.455002, 5.491998, 21.639002);
        ((GeneralPath) shape).curveTo(5.2539983, 21.799002, 4.972998, 21.865002, 4.651998, 21.842001);
        ((GeneralPath) shape).curveTo(4.280998, 21.814001, 3.944998, 21.627, 3.651998, 21.279001);
        ((GeneralPath) shape).curveTo(3.331998, 20.881, 3.2659981, 20.412, 3.4529982, 19.881);
        ((GeneralPath) shape).curveTo(3.667998, 19.318, 4.0549984, 18.986, 4.612998, 18.881);
        ((GeneralPath) shape).curveTo(5.120998, 18.775, 5.612998, 18.842001, 6.093998, 19.08);
        ((GeneralPath) shape).curveTo(7.026998, 19.478, 7.452998, 20.174, 7.374998, 21.158);
        ((GeneralPath) shape).curveTo(7.3199983, 21.775002, 7.104998, 22.334002, 6.7339983, 22.842001);
        ((GeneralPath) shape).curveTo(6.280998, 23.428001, 5.690998, 23.775002, 4.972998, 23.881);
        ((GeneralPath) shape).curveTo(2.917998, 24.225, 1.6409981, 24.775, 1.1329982, 25.521);
        ((GeneralPath) shape).lineTo(0.9339982, 25.959);
        ((GeneralPath) shape).lineTo(0.89499825, 21.799);
        ((GeneralPath) shape).curveTo(1.2379982, 21.907999, 1.7339983, 21.853, 2.3749983, 21.639);
        ((GeneralPath) shape).curveTo(2.5349984, 21.588, 2.6409984, 21.439, 2.6909983, 21.201);
        ((GeneralPath) shape).curveTo(2.7459984, 20.959, 2.7189984, 20.721, 2.6129982, 20.478);
        ((GeneralPath) shape).curveTo(2.4529982, 20.053001, 2.1209981, 19.881, 1.6129982, 19.959002);
        ((GeneralPath) shape).curveTo(1.2659982, 20.014002, 1.0939982, 20.201002, 1.0939982, 20.521002);
        ((GeneralPath) shape).curveTo(1.0939982, 20.893002, 1.2379982, 21.053001, 1.5349982, 20.998001);
        ((GeneralPath) shape).curveTo(1.6679982, 20.975, 1.7189982, 20.920002, 1.6909982, 20.842001);
        ((GeneralPath) shape).curveTo(1.6679982, 20.732, 1.5859982, 20.682001, 1.4529982, 20.682001);
        ((GeneralPath) shape).curveTo(1.3199981, 20.682001, 1.2809981, 20.627, 1.3319981, 20.521002);
        ((GeneralPath) shape).curveTo(1.4139981, 20.412003, 1.5199981, 20.346003, 1.651998, 20.318003);
        ((GeneralPath) shape).curveTo(1.811998, 20.268003, 1.9339981, 20.334003, 2.0119982, 20.521002);
        ((GeneralPath) shape).curveTo(2.0939982, 20.682001, 2.104998, 20.865002, 2.0549982, 21.080002);
        ((GeneralPath) shape).curveTo(1.9999982, 21.318003, 1.6129981, 21.400002, 0.8949982, 21.318003);
        ((GeneralPath) shape).curveTo(0.8669982, 20.600002, 0.8119982, 20.158003, 0.7339982, 19.998003);
        ((GeneralPath) shape).curveTo(0.70699817, 19.893003, 0.6249982, 19.881002, 0.4919982, 19.959003);
        ((GeneralPath) shape).curveTo(0.3869982, 20.014004, 0.3089982, 20.439003, 0.2539982, 21.240004);
        ((GeneralPath) shape).curveTo(0.2269982, 22.014004, 0.2269982, 22.760004, 0.2539982, 23.478004);
        ((GeneralPath) shape).curveTo(0.2809982, 23.959005, 0.26599818, 24.842005, 0.21499819, 26.119005);
        ((GeneralPath) shape).curveTo(0.21499819, 27.185005, 0.2929982, 27.799006, 0.4529982, 27.959005);
        ((GeneralPath) shape).curveTo(0.5349982, 28.041006, 0.97299814, 28.268005, 1.7729982, 28.639006);
        ((GeneralPath) shape).curveTo(2.0939982, 28.478006, 2.3589983, 28.385006, 2.5739982, 28.361006);
        ((GeneralPath) shape).lineTo(2.374998, 28.279005);
        ((GeneralPath) shape).curveTo(2.0549982, 28.174006, 3.8279982, 27.908005, 7.690998, 27.478004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5C4F2D));
        g.fill(shape);

        // _0_0_0_172
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.691, 23.76);
        ((GeneralPath) shape).curveTo(2.0939999, 23.842001, 2.359, 23.732, 2.492, 23.439001);
        ((GeneralPath) shape).curveTo(2.5740001, 23.225, 2.5740001, 23.014002, 2.492, 22.799002);
        ((GeneralPath) shape).curveTo(2.441, 22.639002, 2.2810001, 22.560001, 2.012, 22.560001);
        ((GeneralPath) shape).curveTo(1.7190001, 22.560001, 1.5080001, 22.654001, 1.375, 22.842001);
        ((GeneralPath) shape).curveTo(1.238, 23.025002, 1.227, 23.225, 1.332, 23.439001);
        ((GeneralPath) shape).curveTo(1.441, 23.627, 1.559, 23.732, 1.691, 23.76);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_173
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.492, 26.682);
        ((GeneralPath) shape).curveTo(4.895, 26.759998, 5.16, 26.654, 5.293, 26.361);
        ((GeneralPath) shape).curveTo(5.375, 26.174, 5.375, 25.959, 5.293, 25.721);
        ((GeneralPath) shape).curveTo(5.2380004, 25.560001, 5.078, 25.494001, 4.8120003, 25.521);
        ((GeneralPath) shape).curveTo(4.5200005, 25.521, 4.309, 25.615, 4.1720004, 25.799);
        ((GeneralPath) shape).curveTo(4.0390005, 25.986, 4.0270004, 26.174, 4.1330004, 26.361);
        ((GeneralPath) shape).curveTo(4.2420006, 26.545, 4.359, 26.654, 4.4920006, 26.682);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_174
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.332, 19.842);
        ((GeneralPath) shape).curveTo(23.199001, 19.654, 22.984001, 19.588, 22.691, 19.639);
        ((GeneralPath) shape).curveTo(22.426, 19.693, 22.266, 19.799, 22.211, 19.959);
        ((GeneralPath) shape).curveTo(22.133001, 20.225, 22.133001, 20.467, 22.211, 20.682);
        ((GeneralPath) shape).curveTo(22.348, 20.946999, 22.613, 21.014, 23.012001, 20.880999);
        ((GeneralPath) shape).curveTo(23.145, 20.798998, 23.266, 20.665998, 23.371, 20.477999);
        ((GeneralPath) shape).curveTo(23.453001, 20.239998, 23.441, 20.025, 23.332, 19.842);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_175
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.574, 23.439);
        ((GeneralPath) shape).curveTo(20.441, 23.251999, 20.227, 23.174, 19.934, 23.200998);
        ((GeneralPath) shape).curveTo(19.668, 23.251999, 19.508, 23.373, 19.453, 23.559998);
        ((GeneralPath) shape).curveTo(19.397999, 23.825998, 19.414, 24.052998, 19.491999, 24.239998);
        ((GeneralPath) shape).curveTo(19.624998, 24.505999, 19.878998, 24.571999, 20.253998, 24.438997);
        ((GeneralPath) shape).curveTo(20.413998, 24.384996, 20.534998, 24.251997, 20.612997, 24.040997);
        ((GeneralPath) shape).curveTo(20.718998, 23.825996, 20.706997, 23.626997, 20.573997, 23.438997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_176
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.492, 24.24);
        ((GeneralPath) shape).curveTo(22.707, 24.185, 22.84, 24.025, 22.895, 23.76);
        ((GeneralPath) shape).curveTo(22.945, 23.494, 22.867, 23.279, 22.652, 23.119);
        ((GeneralPath) shape).curveTo(22.441, 22.986, 22.188, 22.946999, 21.895, 22.998);
        ((GeneralPath) shape).curveTo(21.602001, 23.053, 21.387001, 23.213, 21.254, 23.477999);
        ((GeneralPath) shape).curveTo(21.121, 23.748, 21.078, 24.040998, 21.133, 24.360998);
        ((GeneralPath) shape).curveTo(21.16, 24.599998, 21.32, 24.798998, 21.612999, 24.958998);
        ((GeneralPath) shape).lineTo(17.933998, 25.399998);
        ((GeneralPath) shape).lineTo(17.972998, 25.360998);
        ((GeneralPath) shape).curveTo(18.214998, 24.931997, 18.241997, 24.333998, 18.054998, 23.559998);
        ((GeneralPath) shape).curveTo(17.999998, 23.399998, 17.866999, 23.294998, 17.651999, 23.239998);
        ((GeneralPath) shape).curveTo(17.440998, 23.184998, 17.214998, 23.212997, 16.972998, 23.317997);
        ((GeneralPath) shape).curveTo(16.601997, 23.477997, 16.413998, 23.825996, 16.413998, 24.360996);
        ((GeneralPath) shape).curveTo(16.413998, 24.731997, 16.573997, 24.919996, 16.894999, 24.919996);
        ((GeneralPath) shape).curveTo(17.241999, 24.919996, 17.413998, 24.774996, 17.413998, 24.477997);
        ((GeneralPath) shape).curveTo(17.386997, 24.345997, 17.335999, 24.278997, 17.253998, 24.278997);
        ((GeneralPath) shape).curveTo(17.147997, 24.306997, 17.093998, 24.384998, 17.093998, 24.520998);
        ((GeneralPath) shape).curveTo(17.093998, 24.653997, 17.038998, 24.692999, 16.933998, 24.638998);
        ((GeneralPath) shape).curveTo(16.827997, 24.587997, 16.761997, 24.477999, 16.733997, 24.317999);
        ((GeneralPath) shape).curveTo(16.706997, 24.157999, 16.772997, 24.040998, 16.933998, 23.959);
        ((GeneralPath) shape).curveTo(17.093998, 23.852999, 17.280998, 23.826, 17.491999, 23.881);
        ((GeneralPath) shape).curveTo(17.706999, 23.932001, 17.745998, 24.385, 17.612999, 25.24);
        ((GeneralPath) shape).lineTo(17.651999, 25.4);
        ((GeneralPath) shape).curveTo(16.694998, 25.506, 16.269999, 25.720999, 16.374998, 26.041);
        ((GeneralPath) shape).curveTo(16.479998, 26.252, 16.811998, 26.307001, 17.374998, 26.201);
        ((GeneralPath) shape).curveTo(21.187998, 25.693, 23.374998, 25.439001, 23.933998, 25.439001);
        ((GeneralPath) shape).lineTo(24.093998, 25.478);
        ((GeneralPath) shape).curveTo(24.011997, 24.998001, 24.011997, 24.467001, 24.093998, 23.881);
        ((GeneralPath) shape).curveTo(24.253998, 23.025, 24.292997, 21.893, 24.214998, 20.478);
        ((GeneralPath) shape).curveTo(24.078, 18.346, 24.012, 17.185001, 24.012, 16.998001);
        ((GeneralPath) shape).curveTo(23.987999, 17.053001, 23.945, 17.412, 23.894999, 18.080002);
        ((GeneralPath) shape).curveTo(23.120998, 18.346003, 22.690998, 18.346003, 22.612999, 18.080002);
        ((GeneralPath) shape).curveTo(22.558998, 17.842001, 22.574, 17.627003, 22.651999, 17.439001);
        ((GeneralPath) shape).curveTo(22.734, 17.252, 22.852, 17.174002, 23.012, 17.201);
        ((GeneralPath) shape).curveTo(23.171999, 17.201, 23.280998, 17.252, 23.331999, 17.361);
        ((GeneralPath) shape).curveTo(23.387, 17.467001, 23.348, 17.533, 23.214998, 17.56);
        ((GeneralPath) shape).curveTo(23.078, 17.588, 23.012, 17.654, 23.012, 17.76);
        ((GeneralPath) shape).curveTo(22.987999, 17.865, 23.039, 17.92, 23.171999, 17.92);
        ((GeneralPath) shape).curveTo(23.440998, 17.92, 23.574, 17.721, 23.574, 17.318);
        ((GeneralPath) shape).curveTo(23.574, 16.975, 23.397999, 16.799002, 23.055, 16.799002);
        ((GeneralPath) shape).curveTo(22.547, 16.799002, 22.227001, 17.041002, 22.094, 17.521002);
        ((GeneralPath) shape).curveTo(21.987999, 17.814001, 21.973, 18.080002, 22.055, 18.318003);
        ((GeneralPath) shape).curveTo(22.105, 18.560003, 22.199, 18.693003, 22.336, 18.721003);
        ((GeneralPath) shape).curveTo(22.52, 18.775003, 22.746, 18.799002, 23.016, 18.799002);
        ((GeneralPath) shape).curveTo(23.359001, 18.799002, 23.652, 18.721003, 23.895, 18.560001);
        ((GeneralPath) shape).lineTo(23.977001, 20.998001);
        ((GeneralPath) shape).curveTo(24.027, 21.986002, 23.988, 22.76, 23.855001, 23.318);
        ((GeneralPath) shape).curveTo(23.801, 23.053001, 23.707, 22.826, 23.574001, 22.639);
        ((GeneralPath) shape).curveTo(23.336, 22.291, 22.840002, 22.025, 22.094002, 21.842);
        ((GeneralPath) shape).curveTo(21.402002, 21.654, 20.629002, 21.56, 19.773003, 21.56);
        ((GeneralPath) shape).curveTo(19.055002, 21.532999, 18.469002, 21.251999, 18.016003, 20.720999);
        ((GeneralPath) shape).curveTo(17.613003, 20.239998, 17.387003, 19.682, 17.336002, 19.040998);
        ((GeneralPath) shape).curveTo(17.254002, 17.974998, 17.684002, 17.157999, 18.613003, 16.599998);
        ((GeneralPath) shape).curveTo(19.094004, 16.279, 19.574003, 16.134998, 20.055002, 16.157999);
        ((GeneralPath) shape).curveTo(20.613003, 16.185, 21.004002, 16.467, 21.215002, 16.998);
        ((GeneralPath) shape).curveTo(21.430002, 17.532999, 21.375002, 18.053, 21.055002, 18.56);
        ((GeneralPath) shape).curveTo(20.762003, 18.959, 20.430002, 19.213, 20.055002, 19.317999);
        ((GeneralPath) shape).curveTo(19.734003, 19.4, 19.453003, 19.373, 19.215002, 19.24);
        ((GeneralPath) shape).curveTo(18.977001, 19.08, 18.895002, 18.826, 18.977001, 18.478);
        ((GeneralPath) shape).curveTo(19.027, 18.135, 19.160002, 17.865, 19.375002, 17.682001);
        ((GeneralPath) shape).curveTo(19.590002, 17.521002, 19.750002, 17.494001, 19.855001, 17.6);
        ((GeneralPath) shape).curveTo(19.938002, 17.682001, 19.961002, 17.76, 19.938002, 17.842001);
        ((GeneralPath) shape).lineTo(19.734001, 18.041);
        ((GeneralPath) shape).curveTo(19.574001, 18.225, 19.551, 18.4, 19.656002, 18.56);
        ((GeneralPath) shape).curveTo(19.734001, 18.692999, 19.895002, 18.720999, 20.137003, 18.639);
        ((GeneralPath) shape).curveTo(20.348003, 18.56, 20.496002, 18.373, 20.574003, 18.08);
        ((GeneralPath) shape).curveTo(20.656004, 17.787, 20.629004, 17.532999, 20.496004, 17.318);
        ((GeneralPath) shape).curveTo(20.176004, 16.76, 19.668005, 16.721, 18.977005, 17.201);
        ((GeneralPath) shape).curveTo(18.496004, 17.494, 18.281006, 18.135, 18.336004, 19.119);
        ((GeneralPath) shape).curveTo(18.363005, 19.439, 18.562004, 19.682, 18.938004, 19.842);
        ((GeneralPath) shape).curveTo(19.309004, 19.998, 19.723003, 20.025, 20.176004, 19.919998);
        ((GeneralPath) shape).curveTo(21.215004, 19.626999, 21.789005, 18.825998, 21.895004, 17.520998);
        ((GeneralPath) shape).curveTo(21.949005, 16.880999, 21.750004, 16.411999, 21.293005, 16.118998);
        ((GeneralPath) shape).curveTo(20.922005, 15.852998, 20.441006, 15.7319975, 19.855005, 15.759997);
        ((GeneralPath) shape).curveTo(19.293005, 15.786998, 18.734005, 15.985997, 18.176004, 16.360998);
        ((GeneralPath) shape).curveTo(17.590004, 16.759998, 17.176004, 17.239998, 16.934004, 17.798998);
        ((GeneralPath) shape).curveTo(16.750004, 18.333998, 16.695004, 18.825998, 16.773005, 19.278997);
        ((GeneralPath) shape).curveTo(16.828005, 19.626997, 17.000004, 20.091997, 17.293005, 20.681997);
        ((GeneralPath) shape).curveTo(17.723005, 21.614998, 18.910006, 22.106997, 20.855005, 22.157997);
        ((GeneralPath) shape).curveTo(21.574005, 22.184998, 22.188005, 22.345997, 22.695005, 22.638998);
        ((GeneralPath) shape).curveTo(23.203005, 22.931997, 23.453005, 23.239998, 23.453005, 23.559998);
        ((GeneralPath) shape).curveTo(23.453005, 24.224998, 23.160006, 24.610998, 22.574005, 24.720997);
        ((GeneralPath) shape).curveTo(22.281006, 24.747997, 22.027004, 24.692997, 21.816006, 24.559998);
        ((GeneralPath) shape).curveTo(21.629005, 24.427998, 21.535006, 24.239998, 21.535006, 23.997997);
        ((GeneralPath) shape).curveTo(21.562006, 23.786997, 21.652006, 23.614998, 21.816006, 23.477997);
        ((GeneralPath) shape).curveTo(21.977005, 23.345997, 22.121006, 23.306997, 22.254005, 23.360996);
        ((GeneralPath) shape).curveTo(22.387005, 23.411997, 22.480005, 23.493996, 22.535006, 23.599997);
        ((GeneralPath) shape).curveTo(22.590006, 23.704996, 22.574005, 23.774996, 22.496006, 23.798996);
        ((GeneralPath) shape).curveTo(22.441006, 23.825996, 22.293007, 23.825996, 22.055006, 23.798996);
        ((GeneralPath) shape).curveTo(21.949005, 23.747995, 21.895006, 23.759996, 21.895006, 23.841995);
        ((GeneralPath) shape).curveTo(21.895006, 23.919994, 21.949007, 24.013996, 22.055006, 24.118996);
        ((GeneralPath) shape).curveTo(22.160006, 24.224997, 22.305006, 24.267996, 22.492006, 24.239996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_177
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.055, 8.842);
        ((GeneralPath) shape).curveTo(5.2929997, 8.975, 5.375, 9.185, 5.2929997, 9.478);
        ((GeneralPath) shape).curveTo(5.238, 9.748, 5.1049995, 9.959, 4.8949995, 10.1189995);
        ((GeneralPath) shape).curveTo(4.6799994, 10.252, 4.5199995, 10.278999, 4.4139996, 10.200999);
        ((GeneralPath) shape).curveTo(4.332, 10.1189995, 4.3199997, 10.0529995, 4.3749995, 10.001999);
        ((GeneralPath) shape).lineTo(4.5349994, 9.841999);
        ((GeneralPath) shape).curveTo(4.6909995, 9.681999, 4.7339993, 9.548999, 4.6519995, 9.438999);
        ((GeneralPath) shape).curveTo(4.5469995, 9.334, 4.3869996, 9.322, 4.1719995, 9.4);
        ((GeneralPath) shape).curveTo(3.9879994, 9.455, 3.8519995, 9.599999, 3.7729995, 9.842);
        ((GeneralPath) shape).curveTo(3.6909995, 10.053, 3.7189996, 10.256, 3.8519995, 10.439);
        ((GeneralPath) shape).curveTo(4.1209993, 10.865, 4.5859995, 10.893, 5.2539997, 10.521);
        ((GeneralPath) shape).curveTo(5.7339997, 10.279, 5.9449997, 9.748, 5.8949995, 8.92);
        ((GeneralPath) shape).curveTo(5.8949995, 8.654, 5.7069993, 8.455, 5.3319993, 8.3220005);
        ((GeneralPath) shape).curveTo(4.9879994, 8.213, 4.6019993, 8.228001, 4.1719995, 8.361);
        ((GeneralPath) shape).curveTo(3.2149994, 8.6, 2.6909995, 9.252, 2.6129994, 10.318);
        ((GeneralPath) shape).curveTo(2.5349994, 11.228, 3.1329994, 11.682, 4.4139996, 11.682);
        ((GeneralPath) shape).curveTo(4.9449997, 11.654, 5.4919996, 11.494, 6.0549994, 11.201);
        ((GeneralPath) shape).curveTo(6.6409993, 10.853001, 7.0549994, 10.451, 7.2929993, 9.998);
        ((GeneralPath) shape).curveTo(7.5079994, 9.545, 7.5859995, 9.119, 7.5349994, 8.721001);
        ((GeneralPath) shape).curveTo(7.4799995, 8.428, 7.319999, 8.014001, 7.0549994, 7.4780006);
        ((GeneralPath) shape).curveTo(6.6249995, 6.705001, 5.452999, 6.3730006, 3.5349994, 6.4780006);
        ((GeneralPath) shape).curveTo(2.8949995, 6.5060005, 2.3319993, 6.4280005, 1.8519994, 6.2400007);
        ((GeneralPath) shape).curveTo(1.4019995, 6.0250006, 1.1719995, 5.7870007, 1.1719995, 5.521001);
        ((GeneralPath) shape).curveTo(1.1209995, 4.959001, 1.3749994, 4.600001, 1.9339995, 4.439001);
        ((GeneralPath) shape).curveTo(2.1989994, 4.361001, 2.4259996, 4.373001, 2.6129994, 4.478001);
        ((GeneralPath) shape).curveTo(2.8009994, 4.560001, 2.8949995, 4.705001, 2.8949995, 4.920001);
        ((GeneralPath) shape).curveTo(2.8949995, 5.107001, 2.8119996, 5.268001, 2.6519995, 5.400001);
        ((GeneralPath) shape).curveTo(2.4919994, 5.560001, 2.3479996, 5.615001, 2.2149994, 5.560001);
        ((GeneralPath) shape).curveTo(2.1049995, 5.533001, 2.0389996, 5.467001, 2.0119994, 5.361001);
        ((GeneralPath) shape).curveTo(1.9609994, 5.279001, 1.9609994, 5.228001, 2.0119994, 5.201001);
        ((GeneralPath) shape).lineTo(2.4139993, 5.158001);
        ((GeneralPath) shape).curveTo(2.5199993, 5.185001, 2.5739994, 5.158001, 2.5739994, 5.080001);
        ((GeneralPath) shape).curveTo(2.5739994, 5.025001, 2.5199995, 4.959001, 2.4139993, 4.881001);
        ((GeneralPath) shape).curveTo(2.3319993, 4.771001, 2.1989994, 4.760001, 2.0119994, 4.842001);
        ((GeneralPath) shape).curveTo(1.8279994, 4.920001, 1.7069993, 5.064001, 1.6519994, 5.2790008);
        ((GeneralPath) shape).curveTo(1.6019994, 5.521001, 1.6679994, 5.693001, 1.8519994, 5.7990007);
        ((GeneralPath) shape).curveTo(2.0389993, 5.908001, 2.2809994, 5.9200006, 2.5739994, 5.842001);
        ((GeneralPath) shape).curveTo(2.8399994, 5.760001, 3.0389993, 5.600001, 3.1719995, 5.361001);
        ((GeneralPath) shape).curveTo(3.2809994, 5.119001, 3.3089995, 4.853001, 3.2539995, 4.560001);
        ((GeneralPath) shape).curveTo(3.2269995, 4.295001, 3.0269995, 4.1350007, 2.6519995, 4.080001);
        ((GeneralPath) shape).curveTo(2.2809994, 4.025001, 1.8789995, 4.092001, 1.4529995, 4.2790008);
        ((GeneralPath) shape).curveTo(1.0549995, 4.4390006, 0.8279995, 4.7480006, 0.77299947, 5.2010007);
        ((GeneralPath) shape).curveTo(0.71899945, 5.600001, 0.81199944, 5.9590006, 1.0549995, 6.2790008);
        ((GeneralPath) shape).curveTo(1.5349995, 6.842001, 2.7069993, 7.053001, 4.5739994, 6.9200006);
        ((GeneralPath) shape).curveTo(5.2659993, 6.8650007, 5.839999, 7.068001, 6.2929993, 7.5210004);
        ((GeneralPath) shape).curveTo(6.690999, 7.9200006, 6.905999, 8.389, 6.933999, 8.92);
        ((GeneralPath) shape).curveTo(6.960999, 9.799, 6.519999, 10.494, 5.612999, 10.998);
        ((GeneralPath) shape).curveTo(5.132999, 11.24, 4.667999, 11.361, 4.214999, 11.361);
        ((GeneralPath) shape).curveTo(3.7069993, 11.334, 3.3589993, 11.107, 3.1719992, 10.682);
        ((GeneralPath) shape).curveTo(2.9879992, 10.252, 3.054999, 9.853001, 3.3749993, 9.478001);
        ((GeneralPath) shape).curveTo(3.6129992, 9.158001, 3.9059992, 8.9470005, 4.253999, 8.842001);
        ((GeneralPath) shape).curveTo(4.5739994, 8.760001, 4.839999, 8.760001, 5.0549994, 8.842001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_178
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.652, 10.56);
        ((GeneralPath) shape).curveTo(1.52, 10.56, 1.426, 10.521001, 1.375, 10.439);
        ((GeneralPath) shape).curveTo(1.32, 10.361, 1.348, 10.307, 1.453, 10.279);
        ((GeneralPath) shape).curveTo(1.5589999, 10.2560005, 1.625, 10.201, 1.652, 10.119);
        ((GeneralPath) shape).curveTo(1.652, 10.041, 1.602, 10.014001, 1.492, 10.041);
        ((GeneralPath) shape).curveTo(1.281, 10.041, 1.1719999, 10.189, 1.1719999, 10.482);
        ((GeneralPath) shape).curveTo(1.1719999, 10.748, 1.3199999, 10.8810005, 1.6129999, 10.8810005);
        ((GeneralPath) shape).curveTo(2.039, 10.799001, 2.32, 10.615001, 2.4529998, 10.318001);
        ((GeneralPath) shape).curveTo(2.5349998, 10.080001, 2.547, 9.865001, 2.4919999, 9.682001);
        ((GeneralPath) shape).curveTo(2.441, 9.494001, 2.3479998, 9.389001, 2.215, 9.361001);
        ((GeneralPath) shape).curveTo(1.602, 9.252001, 1.1329999, 9.334001, 0.8119999, 9.600001);
        ((GeneralPath) shape).curveTo(0.7339999, 9.654001, 0.7069999, 9.721002, 0.7339999, 9.799002);
        ((GeneralPath) shape).curveTo(0.7339999, 9.908002, 0.7849999, 9.947001, 0.8949999, 9.920002);
        ((GeneralPath) shape).curveTo(1.5349998, 9.654002, 1.895, 9.639002, 1.9729998, 9.881002);
        ((GeneralPath) shape).curveTo(2.0269997, 10.041002, 2.0119998, 10.197002, 1.9339998, 10.357002);
        ((GeneralPath) shape).curveTo(1.8519998, 10.521002, 1.7579998, 10.588002, 1.6519997, 10.560002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_179
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.094, 4.041);
        ((GeneralPath) shape).curveTo(7.094, 4.146, 7.145, 4.185, 7.2539997, 4.158);
        ((GeneralPath) shape).curveTo(7.332, 4.131, 7.3869996, 4.053, 7.4139996, 3.92);
        ((GeneralPath) shape).curveTo(7.4409995, 3.7870002, 7.5079994, 3.732, 7.6129994, 3.76);
        ((GeneralPath) shape).curveTo(7.6909995, 3.814, 7.7459993, 3.92, 7.7729993, 4.08);
        ((GeneralPath) shape).curveTo(7.800999, 4.213, 7.7189994, 4.33, 7.5349994, 4.439);
        ((GeneralPath) shape).curveTo(7.3479996, 4.545, 7.1479993, 4.5880003, 6.9339995, 4.557);
        ((GeneralPath) shape).curveTo(6.773, 4.533, 6.707, 4.346, 6.7339997, 3.9980001);
        ((GeneralPath) shape).curveTo(6.812, 3.6000001, 6.8519998, 3.357, 6.8519998, 3.2790003);
        ((GeneralPath) shape).curveTo(6.8789997, 3.1740003, 6.8399997, 3.1070004, 6.7339997, 3.0800004);
        ((GeneralPath) shape).curveTo(6.6249995, 3.0800004, 6.547, 3.1310005, 6.4919996, 3.2400005);
        ((GeneralPath) shape).curveTo(6.1989994, 3.7210004, 6.16, 4.2790003, 6.3749995, 4.9200006);
        ((GeneralPath) shape).curveTo(6.4259996, 5.0800004, 6.5589995, 5.1740007, 6.773, 5.2010007);
        ((GeneralPath) shape).curveTo(6.988, 5.225001, 7.2269998, 5.1740007, 7.4919996, 5.041001);
        ((GeneralPath) shape).curveTo(7.9449997, 4.8530006, 8.172, 4.506001, 8.172, 3.9980009);
        ((GeneralPath) shape).curveTo(8.121, 3.6540008, 7.934, 3.494001, 7.613, 3.5180008);
        ((GeneralPath) shape).curveTo(7.215, 3.5720007, 7.039, 3.7480009, 7.094, 4.041001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_180
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.332, 8.521);
        ((GeneralPath) shape).curveTo(1.441, 8.654, 1.625, 8.693, 1.895, 8.639);
        ((GeneralPath) shape).curveTo(2.105, 8.588, 2.238, 8.4939995, 2.293, 8.357);
        ((GeneralPath) shape).curveTo(2.375, 8.174001, 2.375, 7.9860005, 2.293, 7.7990003);
        ((GeneralPath) shape).curveTo(2.188, 7.5880003, 1.961, 7.545, 1.6129999, 7.682);
        ((GeneralPath) shape).curveTo(1.4799999, 7.76, 1.3749999, 7.881, 1.293, 8.041);
        ((GeneralPath) shape).curveTo(1.215, 8.228001, 1.227, 8.389, 1.332, 8.521);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_181
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.812, 5.318);
        ((GeneralPath) shape).curveTo(3.918, 5.4779997, 4.121, 5.521, 4.414, 5.4389997);
        ((GeneralPath) shape).curveTo(4.68, 5.3889995, 4.84, 5.279, 4.895, 5.1189995);
        ((GeneralPath) shape).curveTo(4.973, 4.8809996, 4.973, 4.6659994, 4.895, 4.4779997);
        ((GeneralPath) shape).curveTo(4.758, 4.24, 4.508, 4.213, 4.133, 4.3999996);
        ((GeneralPath) shape).curveTo(3.9729998, 4.4779997, 3.852, 4.615, 3.7729998, 4.799);
        ((GeneralPath) shape).curveTo(3.6679997, 5.014, 3.6799998, 5.185, 3.8119998, 5.318);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_182
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.895, 7.279);
        ((GeneralPath) shape).curveTo(16.785, 7.732, 16.84, 8.184999, 17.055, 8.639);
        ((GeneralPath) shape).curveTo(17.266, 9.092, 17.68, 9.439, 18.293001, 9.682);
        ((GeneralPath) shape).curveTo(18.879002, 9.865, 19.441002, 9.893001, 19.973001, 9.76);
        ((GeneralPath) shape).curveTo(20.613, 9.627, 21.121002, 9.373, 21.492, 9.002);
        ((GeneralPath) shape).curveTo(21.945, 8.572, 22.145, 8.068, 22.094, 7.482);
        ((GeneralPath) shape).curveTo(22.012, 6.256, 21.426, 5.666, 20.332, 5.7209997);
        ((GeneralPath) shape).curveTo(19.906, 5.7479997, 19.508001, 5.8809996, 19.133001, 6.1189995);
        ((GeneralPath) shape).curveTo(18.734001, 6.3889995, 18.52, 6.6819997, 18.492, 7.0019994);
        ((GeneralPath) shape).curveTo(18.469, 7.4549994, 18.480001, 7.7749996, 18.535, 7.9589996);
        ((GeneralPath) shape).curveTo(18.612999, 8.306999, 18.812, 8.533, 19.133, 8.643);
        ((GeneralPath) shape).curveTo(19.828, 8.853, 20.348, 8.665999, 20.691, 8.08);
        ((GeneralPath) shape).curveTo(20.828, 7.814, 20.852, 7.56, 20.773, 7.322);
        ((GeneralPath) shape).curveTo(20.691, 7.08, 20.535, 6.963, 20.293001, 6.963);
        ((GeneralPath) shape).curveTo(20.078001, 6.935, 19.922, 7.002, 19.812, 7.1619997);
        ((GeneralPath) shape).curveTo(19.707, 7.3219995, 19.734001, 7.4669995, 19.895, 7.6029997);
        ((GeneralPath) shape).curveTo(20.027, 7.6819997, 20.094, 7.7359996, 20.094, 7.7599998);
        ((GeneralPath) shape).curveTo(20.121, 7.8139997, 20.094, 7.896, 20.012, 8.002);
        ((GeneralPath) shape).curveTo(19.905998, 8.135, 19.745998, 8.15, 19.535, 8.040999);
        ((GeneralPath) shape).curveTo(19.32, 7.9349995, 19.171999, 7.7209992, 19.094, 7.3999996);
        ((GeneralPath) shape).curveTo(19.039, 7.0839996, 19.145, 6.8139997, 19.414, 6.6029997);
        ((GeneralPath) shape).curveTo(19.652, 6.416, 19.934, 6.3219995, 20.254, 6.3219995);
        ((GeneralPath) shape).curveTo(20.625, 6.2949996, 20.961, 6.4429994, 21.254, 6.7599998);
        ((GeneralPath) shape).curveTo(21.574, 7.1349998, 21.625, 7.6029997, 21.414, 8.162);
        ((GeneralPath) shape).curveTo(21.199, 8.748, 20.800999, 9.134999, 20.215, 9.322);
        ((GeneralPath) shape).curveTo(19.734, 9.509999, 19.238, 9.509999, 18.734001, 9.322);
        ((GeneralPath) shape).curveTo(17.801, 9.002, 17.375002, 8.334, 17.453001, 7.3219995);
        ((GeneralPath) shape).curveTo(17.535002, 6.6819997, 17.773, 6.0799994, 18.172, 5.5209994);
        ((GeneralPath) shape).curveTo(18.625, 4.8809996, 19.227001, 4.4549994, 19.973001, 4.2399993);
        ((GeneralPath) shape).curveTo(20.824001, 4.0019994, 21.625002, 3.6929994, 22.375002, 3.3219993);
        ((GeneralPath) shape).curveTo(23.148003, 2.8959994, 23.652002, 2.4939992, 23.891003, 2.1229992);
        ((GeneralPath) shape).curveTo(24.188004, 1.6699991, 24.305002, 1.2169992, 24.254004, 0.75999916);
        ((GeneralPath) shape).curveTo(24.172003, 0.28299916, 23.891003, 0.02899915, 23.414003, 0.0019991398);
        ((GeneralPath) shape).curveTo(22.934004, 0.0019991398, 22.492002, 0.10699914, 22.094004, 0.32199913);
        ((GeneralPath) shape).curveTo(21.691004, 0.5599991, 21.465004, 0.8419991, 21.414003, 1.1619991);
        ((GeneralPath) shape).curveTo(21.359003, 1.4819992, 21.387003, 1.7479992, 21.492002, 1.9629991);
        ((GeneralPath) shape).curveTo(21.652002, 2.173999, 21.879002, 2.2679992, 22.172003, 2.243999);
        ((GeneralPath) shape).curveTo(22.492002, 2.188999, 22.758003, 2.067999, 22.973003, 1.880999);
        ((GeneralPath) shape).curveTo(23.188004, 1.669999, 23.254004, 1.442999, 23.172003, 1.200999);
        ((GeneralPath) shape).curveTo(23.121002, 0.98999906, 22.988003, 0.880999, 22.773003, 0.880999);
        ((GeneralPath) shape).curveTo(22.586002, 0.90799904, 22.441002, 0.98999906, 22.332003, 1.1229991);
        ((GeneralPath) shape).curveTo(22.227003, 1.2279991, 22.172003, 1.3219991, 22.172003, 1.4039991);
        ((GeneralPath) shape).curveTo(22.172003, 1.481999, 22.227003, 1.4939991, 22.332003, 1.4429991);
        ((GeneralPath) shape).curveTo(22.547003, 1.3339992, 22.691002, 1.2829992, 22.773003, 1.2829992);
        ((GeneralPath) shape).curveTo(22.824003, 1.3099991, 22.840002, 1.3769991, 22.812002, 1.4819992);
        ((GeneralPath) shape).curveTo(22.762003, 1.5919992, 22.668003, 1.6969992, 22.535002, 1.8029991);
        ((GeneralPath) shape).curveTo(22.398003, 1.8849992, 22.254002, 1.8849992, 22.094002, 1.8029991);
        ((GeneralPath) shape).curveTo(21.906002, 1.7209991, 21.812002, 1.5759991, 21.812002, 1.3609991);
        ((GeneralPath) shape).curveTo(21.785002, 1.1499991, 21.879002, 0.9469991, 22.094002, 0.7639991);
        ((GeneralPath) shape).curveTo(22.305002, 0.57599914, 22.559002, 0.4709991, 22.852001, 0.4429991);
        ((GeneralPath) shape).curveTo(23.492, 0.3609991, 23.785002, 0.6429991, 23.734001, 1.282999);
        ((GeneralPath) shape).curveTo(23.734001, 1.575999, 23.480001, 1.934999, 22.973001, 2.360999);
        ((GeneralPath) shape).curveTo(22.441002, 2.7909992, 21.812002, 3.1229992, 21.094002, 3.360999);
        ((GeneralPath) shape).curveTo(19.121002, 3.8959992, 17.891003, 4.696999, 17.414001, 5.763999);
        ((GeneralPath) shape).curveTo(17.121002, 6.427999, 16.945002, 6.931999, 16.895002, 7.278999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_183
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.254, 6.682);
        ((GeneralPath) shape).curveTo(22.171999, 6.947, 22.188, 7.201, 22.293, 7.439);
        ((GeneralPath) shape).curveTo(22.453, 7.842, 22.785, 7.9750004, 23.293, 7.842);
        ((GeneralPath) shape).curveTo(23.612999, 7.732, 23.800999, 7.521, 23.852, 7.201);
        ((GeneralPath) shape).curveTo(23.852, 6.7990003, 23.706999, 6.6540003, 23.414, 6.76);
        ((GeneralPath) shape).curveTo(23.281, 6.787, 23.227, 6.853, 23.254, 6.959);
        ((GeneralPath) shape).curveTo(23.254, 7.064, 23.32, 7.1070004, 23.453, 7.08);
        ((GeneralPath) shape).curveTo(23.585999, 7.0529995, 23.625, 7.107, 23.574, 7.24);
        ((GeneralPath) shape).curveTo(23.519999, 7.3459997, 23.414, 7.424, 23.254, 7.4779997);
        ((GeneralPath) shape).curveTo(23.094, 7.5329995, 22.973, 7.4779997, 22.895, 7.318);
        ((GeneralPath) shape).curveTo(22.812, 7.158, 22.801, 6.9709997, 22.852001, 6.7599998);
        ((GeneralPath) shape).curveTo(22.934002, 6.494, 23.375002, 6.357, 24.172, 6.357);
        ((GeneralPath) shape).curveTo(24.281, 6.357, 24.348001, 6.3069997, 24.375, 6.2009997);
        ((GeneralPath) shape).curveTo(24.398, 6.0919995, 24.375, 6.014, 24.293, 5.9589996);
        ((GeneralPath) shape).curveTo(23.918, 5.7709994, 23.348, 5.8529997, 22.574, 6.2009997);
        ((GeneralPath) shape).curveTo(22.414, 6.279, 22.305, 6.4389997, 22.254, 6.6819997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_184
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.133, 3.318);
        ((GeneralPath) shape).curveTo(17.375, 3.3460002, 17.612999, 3.3070002, 17.852, 3.201);
        ((GeneralPath) shape).curveTo(18.039, 3.092, 18.16, 2.9589999, 18.215, 2.799);
        ((GeneralPath) shape).curveTo(18.426, 2.025, 18.414, 1.467, 18.172, 1.1190001);
        ((GeneralPath) shape).curveTo(18.121, 1.0410001, 18.039001, 1.0250001, 17.934, 1.08);
        ((GeneralPath) shape).curveTo(17.828, 1.131, 17.785, 1.213, 17.812, 1.3180001);
        ((GeneralPath) shape).curveTo(17.945, 2.092, 17.895, 2.533, 17.652, 2.639);
        ((GeneralPath) shape).curveTo(17.441, 2.748, 17.254, 2.771, 17.094, 2.721);
        ((GeneralPath) shape).curveTo(16.934, 2.6929998, 16.867, 2.6, 16.895, 2.439);
        ((GeneralPath) shape).curveTo(16.945, 2.2789998, 17.012001, 2.158, 17.094, 2.08);
        ((GeneralPath) shape).curveTo(17.199, 1.9979999, 17.254, 2.0249999, 17.254, 2.158);
        ((GeneralPath) shape).curveTo(17.281, 2.268, 17.331999, 2.318, 17.414, 2.318);
        ((GeneralPath) shape).curveTo(17.491999, 2.318, 17.546999, 2.252, 17.574, 2.119);
        ((GeneralPath) shape).curveTo(17.574, 1.8529999, 17.397999, 1.76, 17.055, 1.842);
        ((GeneralPath) shape).curveTo(16.734001, 1.92, 16.574, 2.146, 16.574, 2.521);
        ((GeneralPath) shape).curveTo(16.491999, 3.0249999, 16.68, 3.2949998, 17.133, 3.3179998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_185
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.574, 4.842);
        ((GeneralPath) shape).curveTo(23.706999, 4.627, 23.719, 4.428, 23.612999, 4.24);
        ((GeneralPath) shape).curveTo(23.535, 4.08, 23.425999, 3.9859998, 23.293, 3.9589999);
        ((GeneralPath) shape).curveTo(22.894999, 3.932, 22.625, 4.0639997, 22.491999, 4.357);
        ((GeneralPath) shape).curveTo(22.387, 4.6, 22.374998, 4.8259997, 22.453, 5.041);
        ((GeneralPath) shape).curveTo(22.508, 5.2009997, 22.679998, 5.2679996, 22.973, 5.24);
        ((GeneralPath) shape).curveTo(23.265999, 5.185, 23.465, 5.053, 23.574, 4.842);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_186
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.652, 2.4);
        ((GeneralPath) shape).curveTo(19.707, 2.5600002, 19.879, 2.627, 20.172, 2.6000001);
        ((GeneralPath) shape).curveTo(20.465, 2.545, 20.68, 2.4120002, 20.812, 2.2010002);
        ((GeneralPath) shape).curveTo(20.945, 1.9860002, 20.961, 1.7870002, 20.852001, 1.6000001);
        ((GeneralPath) shape).curveTo(20.773, 1.4120002, 20.652, 1.3180001, 20.492, 1.3180001);
        ((GeneralPath) shape).curveTo(20.094, 1.2910001, 19.828001, 1.4280001, 19.691, 1.7210001);
        ((GeneralPath) shape).curveTo(19.613, 1.9590001, 19.602, 2.185, 19.652, 2.4);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_187
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.492, 27.881);
        ((GeneralPath) shape).curveTo(8.535, 27.799, 8.801001, 27.572, 8.293, 27.201);
        ((GeneralPath) shape).curveTo(8.16, 27.092001, 7.7070003, 27.119, 6.934, 27.279);
        ((GeneralPath) shape).curveTo(6.801, 26.615, 6.852, 26.224998, 7.094, 26.119);
        ((GeneralPath) shape).curveTo(7.2809997, 26.041, 7.453, 26.025, 7.613, 26.08);
        ((GeneralPath) shape).curveTo(7.801, 26.157999, 7.8789997, 26.268, 7.8519998, 26.4);
        ((GeneralPath) shape).curveTo(7.8279996, 26.56, 7.758, 26.682, 7.652, 26.76);
        ((GeneralPath) shape).curveTo(7.547, 26.842001, 7.492, 26.814001, 7.492, 26.682001);
        ((GeneralPath) shape).curveTo(7.4690003, 26.545002, 7.414, 26.478, 7.3320003, 26.478);
        ((GeneralPath) shape).curveTo(7.254, 26.455, 7.1990004, 26.506, 7.1720004, 26.639);
        ((GeneralPath) shape).curveTo(7.1720004, 26.932, 7.3480005, 27.053, 7.6910005, 26.998);
        ((GeneralPath) shape).curveTo(7.9610004, 26.974998, 8.121, 26.775, 8.172001, 26.4);
        ((GeneralPath) shape).curveTo(8.172001, 25.893, 7.988001, 25.6, 7.613001, 25.521);
        ((GeneralPath) shape).curveTo(7.375001, 25.467, 7.133001, 25.478, 6.895001, 25.56);
        ((GeneralPath) shape).curveTo(6.7070007, 25.639, 6.586001, 25.76, 6.535001, 25.92);
        ((GeneralPath) shape).curveTo(6.348001, 26.478, 6.3320007, 26.959, 6.4920006, 27.361);
        ((GeneralPath) shape).lineTo(5.3750005, 27.56);
        ((GeneralPath) shape).curveTo(4.5740004, 27.692999, 3.7070005, 27.786999, 2.7730005, 27.842);
        ((GeneralPath) shape).curveTo(3.1720004, 27.654, 3.3870006, 27.411999, 3.4140005, 27.119);
        ((GeneralPath) shape).curveTo(3.4690006, 26.826, 3.4260006, 26.571999, 3.2930005, 26.361);
        ((GeneralPath) shape).curveTo(3.1600006, 26.119, 2.9450004, 25.986, 2.6520004, 25.959);
        ((GeneralPath) shape).curveTo(2.3320005, 25.959, 2.0660005, 26.041, 1.8520005, 26.201);
        ((GeneralPath) shape).curveTo(1.6410005, 26.385, 1.5740005, 26.6, 1.6520004, 26.842001);
        ((GeneralPath) shape).curveTo(1.7070004, 27.080002, 1.8400004, 27.201, 2.0550003, 27.201);
        ((GeneralPath) shape).curveTo(2.2380004, 27.225, 2.3870003, 27.174, 2.4920003, 27.041);
        ((GeneralPath) shape).curveTo(2.6020002, 26.932001, 2.6520004, 26.842001, 2.6520004, 26.76);
        ((GeneralPath) shape).curveTo(2.6520004, 26.682001, 2.6020005, 26.666, 2.4920003, 26.721);
        ((GeneralPath) shape).curveTo(2.3320003, 26.799, 2.1880004, 26.842001, 2.0550003, 26.842001);
        ((GeneralPath) shape).curveTo(2.0000002, 26.814001, 1.9880003, 26.748001, 2.0120003, 26.639002);
        ((GeneralPath) shape).curveTo(2.0660002, 26.533, 2.1480002, 26.439001, 2.2540004, 26.361002);
        ((GeneralPath) shape).curveTo(2.4140005, 26.307001, 2.5740004, 26.318003, 2.7340004, 26.400002);
        ((GeneralPath) shape).curveTo(2.8950005, 26.506002, 2.9880004, 26.666002, 3.0120006, 26.881002);
        ((GeneralPath) shape).curveTo(3.0120006, 27.092003, 2.9180005, 27.279003, 2.7340007, 27.439003);
        ((GeneralPath) shape).curveTo(2.5470006, 27.600002, 2.2930007, 27.682003, 1.9730008, 27.682003);
        ((GeneralPath) shape).curveTo(1.3870008, 27.682003, 1.0940008, 27.361004, 1.0940008, 26.721003);
        ((GeneralPath) shape).curveTo(1.0940008, 26.428003, 1.3320009, 26.107002, 1.8120008, 25.760002);
        ((GeneralPath) shape).curveTo(2.3480008, 25.385002, 2.961001, 25.146002, 3.652001, 25.041002);
        ((GeneralPath) shape).curveTo(5.602001, 24.721003, 6.8010006, 24.064003, 7.2540007, 23.080002);
        ((GeneralPath) shape).curveTo(7.547001, 22.494001, 7.719001, 22.025002, 7.7730007, 21.682001);
        ((GeneralPath) shape).curveTo(7.8520007, 21.225, 7.785001, 20.775002, 7.574001, 20.318);
        ((GeneralPath) shape).curveTo(7.3320007, 19.842001, 6.9180007, 19.455, 6.3320007, 19.158);
        ((GeneralPath) shape).curveTo(5.746001, 18.92, 5.1880007, 18.826, 4.652001, 18.881);
        ((GeneralPath) shape).curveTo(4.012001, 18.959, 3.5080009, 19.146, 3.1330009, 19.439001);
        ((GeneralPath) shape).curveTo(2.7070007, 19.787, 2.520001, 20.252, 2.5740008, 20.842001);
        ((GeneralPath) shape).curveTo(2.6800008, 22.041, 3.2810009, 22.693, 4.375001, 22.799002);
        ((GeneralPath) shape).curveTo(4.801001, 22.826002, 5.199001, 22.748001, 5.574001, 22.560001);
        ((GeneralPath) shape).curveTo(5.9450006, 22.346, 6.145001, 22.080002, 6.172001, 21.760002);
        ((GeneralPath) shape).curveTo(6.2270007, 20.853003, 6.000001, 20.295002, 5.492001, 20.080002);
        ((GeneralPath) shape).curveTo(4.801001, 19.760002, 4.293001, 19.881002, 3.973001, 20.439001);
        ((GeneralPath) shape).curveTo(3.840001, 20.682001, 3.812001, 20.920002, 3.895001, 21.158);
        ((GeneralPath) shape).curveTo(3.973001, 21.428001, 4.133001, 21.572, 4.375001, 21.6);
        ((GeneralPath) shape).curveTo(4.586001, 21.627, 4.746001, 21.572, 4.852001, 21.439001);
        ((GeneralPath) shape).curveTo(4.9610014, 21.307001, 4.934001, 21.158, 4.773001, 20.998001);
        ((GeneralPath) shape).curveTo(4.559001, 20.865002, 4.5080013, 20.732, 4.6130013, 20.6);
        ((GeneralPath) shape).curveTo(4.7190013, 20.494, 4.879001, 20.506, 5.0940013, 20.639);
        ((GeneralPath) shape).curveTo(5.332001, 20.775, 5.4800014, 20.986, 5.5350013, 21.279);
        ((GeneralPath) shape).curveTo(5.6130013, 21.599998, 5.5350013, 21.852999, 5.293001, 22.040998);
        ((GeneralPath) shape).curveTo(5.0550013, 22.200998, 4.773001, 22.267998, 4.453001, 22.239998);
        ((GeneralPath) shape).curveTo(4.082001, 22.184998, 3.746001, 21.997997, 3.453001, 21.681997);
        ((GeneralPath) shape).curveTo(3.133001, 21.251997, 3.066001, 20.786997, 3.2540011, 20.278997);
        ((GeneralPath) shape).curveTo(3.469001, 19.720997, 3.8520012, 19.372997, 4.414001, 19.239998);
        ((GeneralPath) shape).curveTo(4.895001, 19.134998, 5.387001, 19.200998, 5.895001, 19.438997);
        ((GeneralPath) shape).curveTo(6.828001, 19.864998, 7.2540007, 20.571997, 7.172001, 21.559998);
        ((GeneralPath) shape).curveTo(7.121001, 22.173998, 6.906001, 22.731998, 6.535001, 23.239998);
        ((GeneralPath) shape).curveTo(6.0820007, 23.825998, 5.4920006, 24.173998, 4.7730007, 24.278997);
        ((GeneralPath) shape).curveTo(3.9180007, 24.411997, 3.1450007, 24.626997, 2.4530008, 24.919998);
        ((GeneralPath) shape).curveTo(1.6800008, 25.212997, 1.1720008, 25.548998, 0.93400073, 25.919998);
        ((GeneralPath) shape).lineTo(0.73400074, 26.317999);
        ((GeneralPath) shape).lineTo(0.69100076, 22.157999);
        ((GeneralPath) shape).curveTo(1.0660007, 22.294998, 1.5590007, 22.251999, 2.1720006, 22.040998);
        ((GeneralPath) shape).curveTo(2.3090007, 21.958998, 2.3980007, 21.814, 2.4530005, 21.599998);
        ((GeneralPath) shape).curveTo(2.5350006, 21.360998, 2.5200005, 21.118998, 2.4140005, 20.880999);
        ((GeneralPath) shape).curveTo(2.2540004, 20.454998, 1.9180005, 20.279, 1.4140005, 20.360998);
        ((GeneralPath) shape).curveTo(1.0660005, 20.411999, 0.8950005, 20.599998, 0.8950005, 20.919998);
        ((GeneralPath) shape).curveTo(0.8950005, 21.294998, 1.0390005, 21.454998, 1.3320005, 21.399998);
        ((GeneralPath) shape).curveTo(1.4410005, 21.372997, 1.4920005, 21.317997, 1.4920005, 21.239998);
        ((GeneralPath) shape).curveTo(1.4690005, 21.134998, 1.3870004, 21.079998, 1.2540004, 21.079998);
        ((GeneralPath) shape).curveTo(1.1210004, 21.079998, 1.0820004, 21.024998, 1.1330004, 20.919998);
        ((GeneralPath) shape).curveTo(1.1880003, 20.786999, 1.2930003, 20.704998, 1.4530003, 20.681997);
        ((GeneralPath) shape).curveTo(1.6130003, 20.653997, 1.7340003, 20.720997, 1.8120003, 20.880997);
        ((GeneralPath) shape).curveTo(1.8950002, 21.063997, 1.9060003, 21.267996, 1.8520002, 21.477997);
        ((GeneralPath) shape).curveTo(1.7730002, 21.798996, 1.3870002, 21.864996, 0.6910002, 21.681997);
        ((GeneralPath) shape).curveTo(0.6680002, 20.985998, 0.6130002, 20.559998, 0.5350002, 20.399998);
        ((GeneralPath) shape).curveTo(0.5080002, 20.294998, 0.4260002, 20.278997, 0.29300022, 20.360998);
        ((GeneralPath) shape).curveTo(0.18800023, 20.411999, 0.10500023, 20.825998, 0.055000216, 21.599998);
        ((GeneralPath) shape).curveTo(2.1606684E-7, 22.345999, -0.011999786, 23.106998, 0.012000214, 23.880999);
        ((GeneralPath) shape).lineTo(0.012000214, 26.520998);
        ((GeneralPath) shape).curveTo(-0.011999786, 27.587997, 0.055000216, 28.200998, 0.21500021, 28.360998);
        ((GeneralPath) shape).curveTo(0.4800002, 28.626999, 2.1050003, 29.306997, 5.0940003, 30.399998);
        ((GeneralPath) shape).curveTo(5.6800003, 30.372997, 5.9340005, 30.317997, 5.852, 30.239998);
        ((GeneralPath) shape).curveTo(5.6130004, 30.134998, 5.453, 30.052998, 5.375, 29.997997);
        ((GeneralPath) shape).curveTo(5.266, 29.946997, 4.758, 29.720997, 3.852, 29.317997);
        ((GeneralPath) shape).curveTo(2.918, 28.946997, 2.359, 28.731997, 2.172, 28.681997);
        ((GeneralPath) shape).curveTo(1.9879999, 28.626997, 2.652, 28.493998, 4.172, 28.278997);
        ((GeneralPath) shape).curveTo(5.535, 28.091997, 6.641, 27.958998, 7.4919996, 27.880997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAC9647));
        g.fill(shape);

        // _0_0_0_188
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.492, 24.158);
        ((GeneralPath) shape).curveTo(1.895, 24.240002, 2.1599998, 24.135, 2.293, 23.842001);
        ((GeneralPath) shape).curveTo(2.375, 23.627, 2.375, 23.400002, 2.293, 23.158);
        ((GeneralPath) shape).curveTo(2.238, 22.998001, 2.078, 22.932001, 1.812, 22.959002);
        ((GeneralPath) shape).curveTo(1.52, 22.959002, 1.309, 23.053001, 1.172, 23.240002);
        ((GeneralPath) shape).curveTo(1.039, 23.428001, 1.0270001, 23.611002, 1.133, 23.799002);
        ((GeneralPath) shape).curveTo(1.215, 23.986002, 1.332, 24.107002, 1.492, 24.158);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_189
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.293, 27.08);
        ((GeneralPath) shape).curveTo(4.691, 27.157999, 4.9610004, 27.053, 5.0940003, 26.76);
        ((GeneralPath) shape).curveTo(5.1720004, 26.545, 5.1720004, 26.334, 5.0940003, 26.119);
        ((GeneralPath) shape).curveTo(5.0390005, 25.959, 4.879, 25.880999, 4.6130004, 25.880999);
        ((GeneralPath) shape).curveTo(4.32, 25.880999, 4.1050005, 25.974998, 3.9730005, 26.157999);
        ((GeneralPath) shape).curveTo(3.8400006, 26.345999, 3.8280005, 26.544998, 3.9340005, 26.759998);
        ((GeneralPath) shape).curveTo(4.0390005, 26.946999, 4.1600003, 27.052998, 4.2930007, 27.079998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_190
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.414, 32.4);
        ((GeneralPath) shape).lineTo(11.492, 32.56);
        ((GeneralPath) shape).curveTo(11.573999, 32.693, 11.733999, 32.814003, 11.973, 32.920002);
        ((GeneralPath) shape).lineTo(15.011999, 33.998);
        ((GeneralPath) shape).curveTo(15.546999, 34.158, 17.280998, 34.08, 20.215, 33.760002);
        ((GeneralPath) shape).curveTo(20.934, 33.705, 21.508, 33.56, 21.934, 33.318);
        ((GeneralPath) shape).lineTo(19.612999, 33.521);
        ((GeneralPath) shape).curveTo(17.425999, 33.76, 16.147999, 33.865, 15.772999, 33.842);
        ((GeneralPath) shape).curveTo(15.104999, 33.787, 14.573998, 33.627, 14.171999, 33.361);
        ((GeneralPath) shape).lineTo(11.414, 32.4);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_191
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.133, 20.24);
        ((GeneralPath) shape).curveTo(23.0, 20.053, 22.785, 19.986, 22.491999, 20.041);
        ((GeneralPath) shape).curveTo(22.199, 20.092001, 22.026999, 20.201, 21.973, 20.361);
        ((GeneralPath) shape).curveTo(21.921999, 20.627, 21.934, 20.853, 22.012, 21.041);
        ((GeneralPath) shape).curveTo(22.147999, 21.334, 22.414, 21.412, 22.811998, 21.279001);
        ((GeneralPath) shape).curveTo(22.944998, 21.201002, 23.065998, 21.064001, 23.171999, 20.881);
        ((GeneralPath) shape).curveTo(23.254, 20.639, 23.237999, 20.428001, 23.133, 20.24);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_192
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.375, 23.842);
        ((GeneralPath) shape).curveTo(20.238, 23.654, 20.027, 23.571999, 19.734, 23.599998);
        ((GeneralPath) shape).curveTo(19.465, 23.654, 19.304998, 23.774998, 19.254, 23.958998);
        ((GeneralPath) shape).curveTo(19.171999, 24.200998, 19.188, 24.427998, 19.293, 24.638998);
        ((GeneralPath) shape).curveTo(19.425999, 24.907997, 19.679998, 24.974998, 20.050999, 24.841997);
        ((GeneralPath) shape).curveTo(20.187998, 24.786997, 20.304998, 24.653997, 20.414, 24.438997);
        ((GeneralPath) shape).curveTo(20.52, 24.200996, 20.508, 23.997997, 20.375, 23.841997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_193
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.215, 27.4);
        ((GeneralPath) shape).curveTo(28.641, 27.506, 28.879, 27.494, 28.934, 27.361);
        ((GeneralPath) shape).curveTo(28.984, 27.252, 28.945, 27.119, 28.812, 26.959);
        ((GeneralPath) shape).curveTo(28.68, 26.720999, 27.867, 26.334, 26.375, 25.799);
        ((GeneralPath) shape).curveTo(25.305, 25.4, 24.707, 25.08, 24.574, 24.842);
        ((GeneralPath) shape).curveTo(24.491999, 24.682, 24.425999, 23.639, 24.375, 21.720999);
        ((GeneralPath) shape).curveTo(24.348, 20.013998, 24.348, 18.799, 24.375, 18.079998);
        ((GeneralPath) shape).curveTo(24.398, 17.278997, 24.238, 16.997997, 23.891, 17.239998);
        ((GeneralPath) shape).curveTo(23.758001, 17.317997, 23.691, 17.731998, 23.691, 18.477999);
        ((GeneralPath) shape).curveTo(22.918, 18.748, 22.492, 18.748, 22.414, 18.477999);
        ((GeneralPath) shape).curveTo(22.359, 18.268, 22.371, 18.053, 22.453, 17.842);
        ((GeneralPath) shape).curveTo(22.535, 17.654, 22.651999, 17.56, 22.811998, 17.56);
        ((GeneralPath) shape).curveTo(22.944998, 17.588, 23.050999, 17.654, 23.132998, 17.76);
        ((GeneralPath) shape).curveTo(23.183998, 17.865, 23.144997, 17.932001, 23.011997, 17.959);
        ((GeneralPath) shape).curveTo(22.878998, 17.985998, 22.800997, 18.053, 22.772997, 18.157999);
        ((GeneralPath) shape).curveTo(22.745996, 18.268, 22.800997, 18.317999, 22.933996, 18.317999);
        ((GeneralPath) shape).curveTo(23.226995, 18.317999, 23.370996, 18.119, 23.370996, 17.720999);
        ((GeneralPath) shape).curveTo(23.370996, 17.373, 23.198996, 17.200998, 22.851997, 17.200998);
        ((GeneralPath) shape).curveTo(22.347998, 17.200998, 22.011997, 17.439, 21.851997, 17.919998);
        ((GeneralPath) shape).curveTo(21.745996, 18.212997, 21.733997, 18.477999, 21.811996, 18.720999);
        ((GeneralPath) shape).curveTo(21.866997, 18.932, 21.972996, 19.067999, 22.132996, 19.119);
        ((GeneralPath) shape).curveTo(22.319996, 19.174, 22.546995, 19.201, 22.811996, 19.201);
        ((GeneralPath) shape).curveTo(23.159996, 19.201, 23.452997, 19.119, 23.690996, 18.959);
        ((GeneralPath) shape).lineTo(23.772997, 21.4);
        ((GeneralPath) shape).curveTo(23.823997, 22.361, 23.784996, 23.135, 23.651997, 23.721);
        ((GeneralPath) shape).curveTo(23.624996, 23.533, 23.534996, 23.307001, 23.374996, 23.041);
        ((GeneralPath) shape).curveTo(22.866997, 22.346, 21.585997, 21.975, 19.534996, 21.92);
        ((GeneralPath) shape).curveTo(18.839996, 21.92, 18.265995, 21.639, 17.811996, 21.08);
        ((GeneralPath) shape).curveTo(17.413996, 20.627, 17.187996, 20.08, 17.132996, 19.439);
        ((GeneralPath) shape).curveTo(17.054996, 18.4, 17.468996, 17.571999, 18.374996, 16.959);
        ((GeneralPath) shape).curveTo(18.878996, 16.639, 19.374996, 16.494, 19.851995, 16.521);
        ((GeneralPath) shape).curveTo(20.413996, 16.549, 20.800995, 16.842, 21.011995, 17.4);
        ((GeneralPath) shape).curveTo(21.226995, 17.932, 21.171995, 18.439, 20.851995, 18.92);
        ((GeneralPath) shape).curveTo(20.558996, 19.318, 20.226995, 19.572, 19.851995, 19.682);
        ((GeneralPath) shape).curveTo(19.534996, 19.759998, 19.253996, 19.731998, 19.011995, 19.599998);
        ((GeneralPath) shape).curveTo(18.772995, 19.467, 18.679995, 19.224998, 18.733995, 18.880999);
        ((GeneralPath) shape).curveTo(18.811995, 18.532999, 18.960995, 18.267998, 19.171995, 18.079998);
        ((GeneralPath) shape).curveTo(19.386995, 17.919998, 19.546995, 17.892998, 19.651995, 17.997997);
        ((GeneralPath) shape).curveTo(19.733995, 18.079998, 19.761995, 18.157997, 19.733995, 18.239998);
        ((GeneralPath) shape).lineTo(19.534996, 18.438997);
        ((GeneralPath) shape).curveTo(19.374996, 18.626997, 19.347996, 18.786997, 19.452995, 18.919998);
        ((GeneralPath) shape).curveTo(19.534996, 19.052998, 19.690996, 19.079998, 19.933996, 18.997997);
        ((GeneralPath) shape).curveTo(20.147997, 18.919998, 20.292995, 18.747997, 20.374996, 18.477997);
        ((GeneralPath) shape).curveTo(20.452995, 18.184998, 20.425997, 17.931997, 20.292995, 17.720997);
        ((GeneralPath) shape).curveTo(19.999996, 17.157997, 19.491995, 17.106997, 18.772995, 17.559998);
        ((GeneralPath) shape).curveTo(18.292995, 17.880997, 18.081995, 18.520998, 18.132996, 19.477997);
        ((GeneralPath) shape).curveTo(18.159996, 19.825996, 18.358995, 20.079996, 18.733995, 20.239996);
        ((GeneralPath) shape).curveTo(19.108995, 20.399996, 19.507996, 20.411997, 19.933996, 20.278996);
        ((GeneralPath) shape).curveTo(20.386995, 20.173996, 20.772997, 19.919996, 21.093996, 19.520996);
        ((GeneralPath) shape).curveTo(21.440996, 19.091995, 21.640997, 18.559996, 21.690996, 17.919996);
        ((GeneralPath) shape).curveTo(21.718996, 17.278996, 21.519997, 16.798996, 21.093996, 16.477997);
        ((GeneralPath) shape).curveTo(20.718996, 16.212997, 20.226995, 16.091997, 19.612995, 16.118998);
        ((GeneralPath) shape).curveTo(19.054995, 16.173998, 18.491995, 16.388998, 17.933994, 16.759998);
        ((GeneralPath) shape).curveTo(17.347994, 17.157999, 16.944994, 17.638998, 16.733994, 18.200998);
        ((GeneralPath) shape).curveTo(16.546993, 18.704998, 16.491993, 19.184998, 16.573994, 19.638998);
        ((GeneralPath) shape).curveTo(16.624994, 20.013998, 16.784994, 20.493998, 17.054995, 21.079998);
        ((GeneralPath) shape).curveTo(17.507994, 22.013998, 18.706995, 22.505999, 20.651995, 22.559998);
        ((GeneralPath) shape).curveTo(21.347994, 22.587997, 21.960995, 22.747997, 22.491995, 23.040998);
        ((GeneralPath) shape).curveTo(22.972996, 23.333998, 23.226995, 23.626999, 23.253994, 23.919998);
        ((GeneralPath) shape).curveTo(23.253994, 24.614998, 22.944994, 25.013998, 22.335995, 25.118998);
        ((GeneralPath) shape).curveTo(22.038994, 25.145998, 21.800995, 25.091997, 21.612995, 24.958998);
        ((GeneralPath) shape).curveTo(21.401995, 24.798998, 21.308994, 24.610998, 21.335995, 24.399998);
        ((GeneralPath) shape).curveTo(21.335995, 24.184998, 21.425995, 24.013998, 21.612995, 23.880999);
        ((GeneralPath) shape).curveTo(21.772995, 23.748, 21.921995, 23.704998, 22.054995, 23.759998);
        ((GeneralPath) shape).curveTo(22.187994, 23.814, 22.280994, 23.892998, 22.335995, 23.998);
        ((GeneralPath) shape).curveTo(22.386995, 24.106998, 22.374994, 24.174, 22.292995, 24.200998);
        ((GeneralPath) shape).curveTo(22.187996, 24.224998, 22.042995, 24.224998, 21.854996, 24.200998);
        ((GeneralPath) shape).curveTo(21.745996, 24.173998, 21.694996, 24.184998, 21.694996, 24.239998);
        ((GeneralPath) shape).curveTo(21.694996, 24.317997, 21.733995, 24.411999, 21.811996, 24.520998);
        ((GeneralPath) shape).curveTo(21.921997, 24.626999, 22.081997, 24.665998, 22.292997, 24.638998);
        ((GeneralPath) shape).curveTo(22.507998, 24.587997, 22.640997, 24.427998, 22.694998, 24.157997);
        ((GeneralPath) shape).curveTo(22.745998, 23.892998, 22.667997, 23.681997, 22.452997, 23.520998);
        ((GeneralPath) shape).curveTo(22.269997, 23.384998, 22.015997, 23.345999, 21.694998, 23.399998);
        ((GeneralPath) shape).curveTo(21.401999, 23.454998, 21.187998, 23.614998, 21.054998, 23.880999);
        ((GeneralPath) shape).curveTo(20.921999, 24.145998, 20.878998, 24.439, 20.933998, 24.759998);
        ((GeneralPath) shape).curveTo(20.987999, 25.024998, 21.147999, 25.212997, 21.413998, 25.317999);
        ((GeneralPath) shape).lineTo(17.733997, 25.759998);
        ((GeneralPath) shape).lineTo(17.772997, 25.720999);
        ((GeneralPath) shape).curveTo(18.015997, 25.317999, 18.026997, 24.731998, 17.815996, 23.959);
        ((GeneralPath) shape).curveTo(17.761995, 23.799, 17.640997, 23.692999, 17.452995, 23.639);
        ((GeneralPath) shape).curveTo(17.241995, 23.588, 17.015995, 23.611, 16.772995, 23.721);
        ((GeneralPath) shape).curveTo(16.319996, 23.881, 16.136995, 24.225, 16.214994, 24.76);
        ((GeneralPath) shape).curveTo(16.214994, 25.135, 16.374994, 25.318, 16.694994, 25.318);
        ((GeneralPath) shape).curveTo(17.069994, 25.318, 17.226994, 25.158, 17.175995, 24.842001);
        ((GeneralPath) shape).curveTo(17.175995, 24.705002, 17.136995, 24.654001, 17.054995, 24.682001);
        ((GeneralPath) shape).curveTo(16.948994, 24.705002, 16.894995, 24.787, 16.894995, 24.920002);
        ((GeneralPath) shape).curveTo(16.866995, 25.053001, 16.815994, 25.092003, 16.733995, 25.041002);
        ((GeneralPath) shape).curveTo(16.628996, 24.986002, 16.561995, 24.881002, 16.534996, 24.721003);
        ((GeneralPath) shape).curveTo(16.507996, 24.560003, 16.573996, 24.428003, 16.733995, 24.318003);
        ((GeneralPath) shape).curveTo(16.921995, 24.240004, 17.108995, 24.225002, 17.292995, 24.279003);
        ((GeneralPath) shape).curveTo(17.507996, 24.361004, 17.546995, 24.814003, 17.413996, 25.639004);
        ((GeneralPath) shape).curveTo(17.386995, 25.693005, 17.401997, 25.748003, 17.452995, 25.799004);
        ((GeneralPath) shape).curveTo(16.495995, 25.908003, 16.069996, 26.119003, 16.175995, 26.439003);
        ((GeneralPath) shape).curveTo(16.253994, 26.627003, 16.589994, 26.682003, 17.175995, 26.600002);
        ((GeneralPath) shape).curveTo(17.519995, 26.521002, 18.601995, 26.373003, 20.413994, 26.158003);
        ((GeneralPath) shape).curveTo(22.280994, 25.947002, 23.386993, 25.842003, 23.733994, 25.842003);
        ((GeneralPath) shape).curveTo(24.319994, 25.842003, 25.108994, 26.053003, 26.093994, 26.478003);
        ((GeneralPath) shape).lineTo(28.214994, 27.400003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_194
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.414, 11.4);
        ((GeneralPath) shape).curveTo(4.934, 11.639, 4.469, 11.759999, 4.012, 11.759999);
        ((GeneralPath) shape).curveTo(3.5080001, 11.731999, 3.16, 11.506, 2.973, 11.079999);
        ((GeneralPath) shape).curveTo(2.785, 10.653999, 2.852, 10.239999, 3.172, 9.841999);
        ((GeneralPath) shape).curveTo(3.414, 9.520999, 3.707, 9.306999, 4.055, 9.200999);
        ((GeneralPath) shape).curveTo(4.375, 9.1189995, 4.625, 9.131, 4.812, 9.239999);
        ((GeneralPath) shape).curveTo(5.055, 9.345999, 5.148, 9.544999, 5.094, 9.841999);
        ((GeneralPath) shape).curveTo(5.012, 10.130999, 4.8669996, 10.356999, 4.652, 10.520999);
        ((GeneralPath) shape).curveTo(4.441, 10.653999, 4.2929997, 10.681999, 4.215, 10.599999);
        ((GeneralPath) shape).curveTo(4.105, 10.4939995, 4.1480002, 10.372999, 4.3320003, 10.24);
        ((GeneralPath) shape).curveTo(4.492, 10.08, 4.5350003, 9.947, 4.453, 9.842);
        ((GeneralPath) shape).curveTo(4.348, 9.732, 4.188, 9.721, 3.973, 9.799);
        ((GeneralPath) shape).curveTo(3.7580001, 9.853, 3.625, 10.002, 3.5740001, 10.24);
        ((GeneralPath) shape).curveTo(3.492, 10.455, 3.5080001, 10.643, 3.6130002, 10.799);
        ((GeneralPath) shape).curveTo(3.9060001, 11.252, 4.387, 11.295, 5.0550003, 10.92);
        ((GeneralPath) shape).curveTo(5.5350003, 10.654, 5.7460003, 10.119, 5.6910005, 9.318);
        ((GeneralPath) shape).curveTo(5.6910005, 9.0529995, 5.5080004, 8.853, 5.1330004, 8.721);
        ((GeneralPath) shape).curveTo(4.7850003, 8.615, 4.3980002, 8.615, 3.9730005, 8.721);
        ((GeneralPath) shape).curveTo(3.0390005, 8.986, 2.5080004, 9.639, 2.3750005, 10.681999);
        ((GeneralPath) shape).curveTo(2.2930005, 11.614999, 2.9060006, 12.079999, 4.2150006, 12.079999);
        ((GeneralPath) shape).curveTo(4.719001, 12.052999, 5.2540007, 11.892999, 5.8120008, 11.599999);
        ((GeneralPath) shape).curveTo(6.3980007, 11.252, 6.8120008, 10.853, 7.055001, 10.4);
        ((GeneralPath) shape).curveTo(7.2930007, 9.947, 7.3870006, 9.521, 7.3320007, 9.1189995);
        ((GeneralPath) shape).curveTo(7.2810006, 8.825999, 7.121001, 8.412, 6.8520007, 7.8809996);
        ((GeneralPath) shape).curveTo(6.3980007, 7.0529995, 5.2270007, 6.7209997, 3.3320007, 6.8809996);
        ((GeneralPath) shape).curveTo(2.6910007, 6.9079995, 2.1330009, 6.8139997, 1.6520008, 6.5999994);
        ((GeneralPath) shape).curveTo(1.1990008, 6.411999, 0.97300076, 6.1849995, 0.97300076, 5.9199996);
        ((GeneralPath) shape).curveTo(0.91800076, 5.3069997, 1.1720008, 4.9469995, 1.7340007, 4.8419995);
        ((GeneralPath) shape).curveTo(2.0000007, 4.7599998, 2.2270007, 4.7709994, 2.4140007, 4.8809996);
        ((GeneralPath) shape).curveTo(2.6020007, 4.9589996, 2.6910007, 5.1069994, 2.6910007, 5.3179994);
        ((GeneralPath) shape).curveTo(2.6680007, 5.5059996, 2.5740006, 5.6659994, 2.4140007, 5.7989993);
        ((GeneralPath) shape).curveTo(2.2810009, 5.958999, 2.1480007, 6.0139995, 2.0120008, 5.958999);
        ((GeneralPath) shape).curveTo(1.9060009, 5.931999, 1.8280008, 5.8649993, 1.7730008, 5.7599993);
        ((GeneralPath) shape).curveTo(1.7460009, 5.6779995, 1.7580009, 5.6269994, 1.8120009, 5.5999994);
        ((GeneralPath) shape).curveTo(1.8950008, 5.5179996, 2.027001, 5.5059996, 2.2150009, 5.5599995);
        ((GeneralPath) shape).curveTo(2.4530008, 5.6109996, 2.4530008, 5.5179996, 2.2150009, 5.2789993);
        ((GeneralPath) shape).curveTo(2.1330009, 5.1739993, 2.000001, 5.1579995, 1.8120009, 5.2399993);
        ((GeneralPath) shape).curveTo(1.6250008, 5.3179994, 1.5080009, 5.466999, 1.4530009, 5.6779995);
        ((GeneralPath) shape).curveTo(1.4020009, 5.9199996, 1.4690009, 6.0919995, 1.6520009, 6.1969995);
        ((GeneralPath) shape).curveTo(1.8400009, 6.2789993, 2.082001, 6.2909994, 2.375001, 6.24);
        ((GeneralPath) shape).curveTo(2.934001, 6.08, 3.160001, 5.654, 3.055001, 4.9589996);
        ((GeneralPath) shape).curveTo(3.027001, 4.693, 2.828001, 4.5209994, 2.453001, 4.4389997);
        ((GeneralPath) shape).curveTo(2.082001, 4.3889995, 1.680001, 4.4549994, 1.254001, 4.6429996);
        ((GeneralPath) shape).curveTo(0.852001, 4.8259997, 0.625001, 5.146, 0.574001, 5.5999994);
        ((GeneralPath) shape).curveTo(0.520001, 6.0019994, 0.613001, 6.3609996, 0.852001, 6.681999);
        ((GeneralPath) shape).curveTo(1.309001, 7.2129993, 2.480001, 7.427999, 4.375001, 7.321999);
        ((GeneralPath) shape).curveTo(5.066001, 7.267999, 5.6410007, 7.466999, 6.094001, 7.919999);
        ((GeneralPath) shape).curveTo(6.469001, 8.294999, 6.6680007, 8.759999, 6.691001, 9.321999);
        ((GeneralPath) shape).curveTo(6.7730007, 10.200998, 6.348001, 10.892999, 5.414001, 11.399999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_195
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.734, 10.76);
        ((GeneralPath) shape).curveTo(1.652, 10.92, 1.5469999, 10.986, 1.414, 10.959001);
        ((GeneralPath) shape).curveTo(1.281, 10.959001, 1.199, 10.920001, 1.172, 10.842001);
        ((GeneralPath) shape).curveTo(1.121, 10.760001, 1.1450001, 10.709001, 1.2540001, 10.682001);
        ((GeneralPath) shape).curveTo(1.3590001, 10.654001, 1.4260001, 10.600001, 1.4530001, 10.521001);
        ((GeneralPath) shape).curveTo(1.4530001, 10.439001, 1.4020001, 10.400001, 1.2930001, 10.400001);
        ((GeneralPath) shape).curveTo(1.0270001, 10.400001, 0.9180001, 10.56, 0.9730001, 10.8810005);
        ((GeneralPath) shape).curveTo(0.9730001, 11.123, 1.121, 11.240001, 1.4140002, 11.240001);
        ((GeneralPath) shape).curveTo(1.8120002, 11.240001, 2.078, 11.057001, 2.2150002, 10.682001);
        ((GeneralPath) shape).curveTo(2.3200002, 10.467001, 2.348, 10.268002, 2.2930002, 10.080001);
        ((GeneralPath) shape).curveTo(2.2380002, 9.896001, 2.1450002, 9.787001, 2.0120003, 9.760001);
        ((GeneralPath) shape).curveTo(1.3750002, 9.654001, 0.89500034, 9.736001, 0.57400036, 10.002001);
        ((GeneralPath) shape).curveTo(0.52000034, 10.057001, 0.5080004, 10.123001, 0.5350004, 10.201001);
        ((GeneralPath) shape).curveTo(0.5350004, 10.283001, 0.5860004, 10.310001, 0.6910004, 10.283001);
        ((GeneralPath) shape).curveTo(0.7730004, 10.2560005, 0.96100044, 10.217001, 1.2540004, 10.162001);
        ((GeneralPath) shape).curveTo(1.5470004, 10.111001, 1.7190005, 10.150001, 1.7730005, 10.283001);
        ((GeneralPath) shape).curveTo(1.8280004, 10.439001, 1.8120005, 10.600001, 1.7340004, 10.760001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_196
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.133, 5.318);
        ((GeneralPath) shape).curveTo(6.1879997, 5.455, 6.3199997, 5.533, 6.535, 5.56);
        ((GeneralPath) shape).curveTo(6.773, 5.588, 7.027, 5.545, 7.2929997, 5.439);
        ((GeneralPath) shape).curveTo(7.719, 5.228, 7.9339995, 4.881, 7.9339995, 4.4);
        ((GeneralPath) shape).curveTo(7.9339995, 4.025, 7.7579994, 3.8530002, 7.4139996, 3.881);
        ((GeneralPath) shape).curveTo(7.0389996, 3.959, 6.8519998, 4.135, 6.8519998, 4.4);
        ((GeneralPath) shape).curveTo(6.8789997, 4.506, 6.9449997, 4.5490003, 7.055, 4.521);
        ((GeneralPath) shape).curveTo(7.133, 4.521, 7.1879997, 4.455, 7.2149997, 4.318);
        ((GeneralPath) shape).curveTo(7.2149997, 4.185, 7.266, 4.1349998, 7.3749995, 4.158);
        ((GeneralPath) shape).curveTo(7.4799995, 4.213, 7.5469995, 4.318, 7.5739994, 4.478);
        ((GeneralPath) shape).curveTo(7.6019993, 4.6150002, 7.5199995, 4.7320004, 7.3319993, 4.842);
        ((GeneralPath) shape).curveTo(7.1479993, 4.947, 6.944999, 4.986, 6.7339993, 4.959);
        ((GeneralPath) shape).curveTo(6.5739994, 4.932, 6.5079994, 4.748, 6.5349994, 4.4);
        ((GeneralPath) shape).curveTo(6.6129994, 3.9980001, 6.6519995, 3.7600002, 6.6519995, 3.6820002);
        ((GeneralPath) shape).curveTo(6.6799994, 3.5720003, 6.6409993, 3.506, 6.5349994, 3.4780002);
        ((GeneralPath) shape).curveTo(6.425999, 3.4780002, 6.3479996, 3.5330002, 6.2929993, 3.6390002);
        ((GeneralPath) shape).curveTo(5.972999, 4.1460004, 5.9179993, 4.705, 6.1329994, 5.3180003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_197
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.133, 8.92);
        ((GeneralPath) shape).curveTo(1.238, 9.053, 1.426, 9.092, 1.691, 9.041);
        ((GeneralPath) shape).curveTo(1.906, 8.986, 2.039, 8.893001, 2.0939999, 8.76);
        ((GeneralPath) shape).curveTo(2.145, 8.545, 2.133, 8.357, 2.0549998, 8.201);
        ((GeneralPath) shape).curveTo(1.9449998, 7.986, 1.7189999, 7.947, 1.3749998, 8.08);
        ((GeneralPath) shape).curveTo(1.2659998, 8.131, 1.1719998, 8.24, 1.0939997, 8.4);
        ((GeneralPath) shape).curveTo(1.0119997, 8.615, 1.0269997, 8.787, 1.1329998, 8.92);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_198
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.574, 5.721);
        ((GeneralPath) shape).curveTo(3.7069998, 5.881, 3.918, 5.92, 4.2149997, 5.842);
        ((GeneralPath) shape).curveTo(4.4799995, 5.787, 4.641, 5.682, 4.6909995, 5.521);
        ((GeneralPath) shape).curveTo(4.7729993, 5.279, 4.7729993, 5.068, 4.6909995, 4.881);
        ((GeneralPath) shape).curveTo(4.5589995, 4.639, 4.2929993, 4.6150002, 3.8949995, 4.7990003);
        ((GeneralPath) shape).curveTo(3.7579994, 4.853, 3.6519995, 4.9750004, 3.5739994, 5.1580005);
        ((GeneralPath) shape).curveTo(3.4689994, 5.3730006, 3.4689994, 5.5600004, 3.5739994, 5.7210007);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_199
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.691, 7.682);
        ((GeneralPath) shape).curveTo(16.586, 8.1310005, 16.641, 8.588, 16.852, 9.041);
        ((GeneralPath) shape).curveTo(17.066, 9.494, 17.48, 9.826, 18.094, 10.041);
        ((GeneralPath) shape).curveTo(18.652, 10.252001, 19.215, 10.291, 19.773, 10.158);
        ((GeneralPath) shape).curveTo(20.387001, 10.025, 20.891, 9.771, 21.293001, 9.4);
        ((GeneralPath) shape).curveTo(21.719002, 8.974999, 21.918001, 8.467, 21.891, 7.8809996);
        ((GeneralPath) shape).curveTo(21.867, 7.2949996, 21.68, 6.8259997, 21.332, 6.4779997);
        ((GeneralPath) shape).curveTo(21.012001, 6.1849995, 20.613, 6.0529995, 20.133001, 6.08);
        ((GeneralPath) shape).curveTo(19.680002, 6.107, 19.266, 6.24, 18.895, 6.4779997);
        ((GeneralPath) shape).curveTo(18.52, 6.7479997, 18.32, 7.041, 18.293001, 7.3609996);
        ((GeneralPath) shape).curveTo(18.266, 7.8419995, 18.281002, 8.174, 18.332, 8.361);
        ((GeneralPath) shape).curveTo(18.387001, 8.709, 18.586, 8.932, 18.934, 9.041);
        ((GeneralPath) shape).curveTo(19.625, 9.2560005, 20.133, 9.053, 20.453, 8.439);
        ((GeneralPath) shape).curveTo(20.585999, 8.201, 20.625, 7.959, 20.574, 7.721);
        ((GeneralPath) shape).curveTo(20.491999, 7.4820004, 20.331999, 7.346, 20.094, 7.322);
        ((GeneralPath) shape).curveTo(19.879, 7.322, 19.719, 7.4, 19.612999, 7.56);
        ((GeneralPath) shape).curveTo(19.504, 7.7209997, 19.530998, 7.853, 19.690998, 7.959);
        ((GeneralPath) shape).lineTo(19.890999, 8.162);
        ((GeneralPath) shape).curveTo(19.918, 8.212999, 19.890999, 8.295, 19.811998, 8.4);
        ((GeneralPath) shape).curveTo(19.706999, 8.533, 19.546999, 8.549, 19.331999, 8.443);
        ((GeneralPath) shape).curveTo(19.093998, 8.307, 18.945, 8.096, 18.890999, 7.803);
        ((GeneralPath) shape).curveTo(18.839998, 7.482, 18.945, 7.217, 19.210999, 7.002);
        ((GeneralPath) shape).curveTo(19.425999, 6.8139997, 19.706999, 6.7089996, 20.050999, 6.6819997);
        ((GeneralPath) shape).curveTo(20.425999, 6.6819997, 20.758, 6.83, 21.050999, 7.1229997);
        ((GeneralPath) shape).curveTo(21.370998, 7.4939995, 21.425999, 7.9749994, 21.210999, 8.559999);
        ((GeneralPath) shape).curveTo(20.999998, 9.15, 20.597998, 9.532999, 20.012, 9.721);
        ((GeneralPath) shape).curveTo(19.504, 9.881, 19.012, 9.881, 18.530998, 9.721);
        ((GeneralPath) shape).curveTo(17.597998, 9.4, 17.171999, 8.736, 17.253998, 7.7209997);
        ((GeneralPath) shape).curveTo(17.331997, 7.107, 17.573997, 6.5099998, 17.972998, 5.9199996);
        ((GeneralPath) shape).curveTo(18.425997, 5.2829995, 19.011997, 4.8529997, 19.733997, 4.6429996);
        ((GeneralPath) shape).curveTo(21.811996, 4.0569997, 23.116997, 3.3339996, 23.651997, 2.4819996);
        ((GeneralPath) shape).curveTo(23.944996, 2.0569997, 24.065996, 1.6149997, 24.011997, 1.1619996);
        ((GeneralPath) shape).curveTo(23.956997, 0.68199956, 23.690998, 0.42799956, 23.210997, 0.39999956);
        ((GeneralPath) shape).curveTo(22.702997, 0.39999956, 22.249996, 0.5099996, 21.851997, 0.7209996);
        ((GeneralPath) shape).curveTo(21.452997, 0.9629996, 21.226997, 1.2279997, 21.171997, 1.5209997);
        ((GeneralPath) shape).curveTo(21.065996, 2.2949996, 21.319998, 2.6699996, 21.933996, 2.6429996);
        ((GeneralPath) shape).curveTo(22.249996, 2.5879996, 22.530996, 2.4669995, 22.772997, 2.2829995);
        ((GeneralPath) shape).curveTo(22.983997, 2.0679996, 23.050997, 1.8419995, 22.972998, 1.5999994);
        ((GeneralPath) shape).curveTo(22.917997, 1.3889995, 22.784998, 1.2829994, 22.569998, 1.2829994);
        ((GeneralPath) shape).curveTo(22.358997, 1.3069994, 22.198997, 1.3889993, 22.089998, 1.5209994);
        ((GeneralPath) shape).curveTo(21.878998, 1.8689995, 21.890999, 1.9749994, 22.132998, 1.8419994);
        ((GeneralPath) shape).curveTo(22.343998, 1.7319994, 22.491997, 1.6819994, 22.569998, 1.6819994);
        ((GeneralPath) shape).curveTo(22.624998, 1.7089994, 22.636997, 1.7749995, 22.612997, 1.8809994);
        ((GeneralPath) shape).curveTo(22.558996, 1.9899994, 22.464996, 2.0959995, 22.331997, 2.2009995);
        ((GeneralPath) shape).curveTo(22.171997, 2.2829995, 22.011997, 2.2829995, 21.851997, 2.2009995);
        ((GeneralPath) shape).curveTo(21.690998, 2.1189995, 21.612997, 1.9749995, 21.612997, 1.7599995);
        ((GeneralPath) shape).curveTo(21.585997, 1.5449995, 21.679996, 1.3459995, 21.894997, 1.1579995);
        ((GeneralPath) shape).curveTo(22.077997, 0.94699955, 22.335997, 0.8259995, 22.651997, 0.79899955);
        ((GeneralPath) shape).curveTo(23.292997, 0.72099954, 23.585997, 1.0139996, 23.534996, 1.6819996);
        ((GeneralPath) shape).curveTo(23.534996, 1.9749995, 23.280996, 2.3339996, 22.772997, 2.7599995);
        ((GeneralPath) shape).curveTo(22.241997, 3.1889994, 21.612997, 3.5099995, 20.894997, 3.7209995);
        ((GeneralPath) shape).curveTo(18.866997, 4.3339996, 17.640997, 5.1459994, 17.214996, 6.1619997);
        ((GeneralPath) shape).curveTo(16.917995, 6.8259997, 16.745996, 7.3339996, 16.690996, 7.6819997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_200
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.055, 8.24);
        ((GeneralPath) shape).curveTo(23.426, 8.131, 23.613, 7.9199996, 23.613, 7.6);
        ((GeneralPath) shape).curveTo(23.641, 7.439, 23.613, 7.318, 23.535002, 7.24);
        ((GeneralPath) shape).curveTo(23.453001, 7.1309996, 23.348001, 7.107, 23.215002, 7.158);
        ((GeneralPath) shape).curveTo(23.078003, 7.185, 23.027002, 7.24, 23.055002, 7.318);
        ((GeneralPath) shape).curveTo(23.055002, 7.428, 23.121002, 7.467, 23.254002, 7.4389997);
        ((GeneralPath) shape).curveTo(23.387001, 7.4389997, 23.426003, 7.49, 23.375002, 7.5999994);
        ((GeneralPath) shape).curveTo(23.320002, 7.7319994, 23.215002, 7.8259993, 23.055002, 7.8809996);
        ((GeneralPath) shape).curveTo(22.895002, 7.9319997, 22.773003, 7.8809996, 22.691002, 7.7209997);
        ((GeneralPath) shape).curveTo(22.613003, 7.56, 22.602001, 7.3729997, 22.652002, 7.1579995);
        ((GeneralPath) shape).curveTo(22.734003, 6.8929996, 23.172003, 6.7599993, 23.973001, 6.7599993);
        ((GeneralPath) shape).curveTo(24.078001, 6.7599993, 24.148, 6.7049994, 24.172, 6.5999994);
        ((GeneralPath) shape).curveTo(24.199001, 6.4669995, 24.160002, 6.3849993, 24.055, 6.3569994);
        ((GeneralPath) shape).curveTo(23.707, 6.1739993, 23.133, 6.2519994, 22.336, 6.5999994);
        ((GeneralPath) shape).curveTo(22.199001, 6.681999, 22.105, 6.8419995, 22.055, 7.0799994);
        ((GeneralPath) shape).curveTo(22.0, 7.3459992, 22.012001, 7.5999994, 22.094, 7.8419995);
        ((GeneralPath) shape).curveTo(22.281, 8.268, 22.602, 8.4, 23.055, 8.24);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_201
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.453, 3.4);
        ((GeneralPath) shape).curveTo(16.535, 3.588, 16.679998, 3.693, 16.894999, 3.7210002);
        ((GeneralPath) shape).curveTo(17.133, 3.7440002, 17.374998, 3.7050002, 17.612999, 3.6000001);
        ((GeneralPath) shape).curveTo(17.828, 3.4940002, 17.960999, 3.357, 18.012, 3.2010002);
        ((GeneralPath) shape).curveTo(18.227, 2.4, 18.199, 1.8420002, 17.934, 1.5180002);
        ((GeneralPath) shape).curveTo(17.879, 1.4390002, 17.801, 1.4280002, 17.691, 1.4780003);
        ((GeneralPath) shape).curveTo(17.586, 1.5330002, 17.547, 1.6110003, 17.574, 1.7210003);
        ((GeneralPath) shape).curveTo(17.651999, 1.9040003, 17.691, 2.1190004, 17.691, 2.3570004);
        ((GeneralPath) shape).curveTo(17.719, 2.7320004, 17.641, 2.9590003, 17.453, 3.0410004);
        ((GeneralPath) shape).curveTo(17.237999, 3.1460004, 17.054998, 3.1740003, 16.894999, 3.1190004);
        ((GeneralPath) shape).curveTo(16.734, 3.0920005, 16.668, 3.0020003, 16.690998, 2.8420005);
        ((GeneralPath) shape).curveTo(16.718998, 2.6780005, 16.784998, 2.5600004, 16.894999, 2.4780004);
        ((GeneralPath) shape).curveTo(16.999998, 2.3730004, 17.054998, 2.3890004, 17.054998, 2.5210004);
        ((GeneralPath) shape).curveTo(17.054998, 2.6540003, 17.104998, 2.7210004, 17.214998, 2.7210004);
        ((GeneralPath) shape).curveTo(17.292997, 2.7210004, 17.347998, 2.6540005, 17.374998, 2.5210004);
        ((GeneralPath) shape).curveTo(17.374998, 2.2280004, 17.198997, 2.1190004, 16.851997, 2.2010005);
        ((GeneralPath) shape).curveTo(16.534998, 2.3340003, 16.374998, 2.5720005, 16.374998, 2.9200006);
        ((GeneralPath) shape).curveTo(16.347998, 3.0800006, 16.374998, 3.2400005, 16.452997, 3.4000006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_202
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.375, 5.24);
        ((GeneralPath) shape).curveTo(23.508, 5.0249996, 23.52, 4.8259997, 23.414, 4.639);
        ((GeneralPath) shape).curveTo(23.331999, 4.455, 23.215, 4.357, 23.055, 4.357);
        ((GeneralPath) shape).curveTo(22.68, 4.334, 22.426, 4.467, 22.293001, 4.7599998);
        ((GeneralPath) shape).curveTo(22.188002, 4.9979997, 22.172, 5.2279997, 22.254002, 5.4389997);
        ((GeneralPath) shape).curveTo(22.305002, 5.5999994, 22.469002, 5.6659994, 22.734001, 5.6389995);
        ((GeneralPath) shape).curveTo(23.027, 5.5879993, 23.238, 5.4549994, 23.375002, 5.2399993);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_203
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.453, 2.799);
        ((GeneralPath) shape).curveTo(19.508, 2.959, 19.679998, 3.014, 19.973, 2.959);
        ((GeneralPath) shape).curveTo(20.265999, 2.9320002, 20.48, 2.8140001, 20.612999, 2.6000001);
        ((GeneralPath) shape).curveTo(20.745998, 2.3890002, 20.762, 2.1850002, 20.651999, 1.9980001);
        ((GeneralPath) shape).curveTo(20.574, 1.8140001, 20.453, 1.7210002, 20.293, 1.7210002);
        ((GeneralPath) shape).curveTo(19.894999, 1.6930002, 19.625, 1.8260002, 19.491999, 2.1190002);
        ((GeneralPath) shape).curveTo(19.414, 2.334, 19.397999, 2.5600002, 19.453, 2.7990003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_204
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.535, 22.041);
        ((GeneralPath) shape).lineTo(5.613, 22.041);
        ((GeneralPath) shape).curveTo(5.719, 21.932001, 5.8789997, 21.932001, 6.094, 22.041);
        ((GeneralPath) shape).lineTo(6.172, 21.76);
        ((GeneralPath) shape).curveTo(6.2269998, 20.853, 6.0, 20.295, 5.492, 20.08);
        ((GeneralPath) shape).curveTo(5.066, 19.893, 4.719, 19.865, 4.453, 19.998);
        ((GeneralPath) shape).curveTo(4.613, 20.213, 4.602, 20.384998, 4.414, 20.521);
        ((GeneralPath) shape).curveTo(4.172, 20.705, 4.238, 20.842, 4.613, 20.92);
        ((GeneralPath) shape).curveTo(4.535, 20.842001, 4.535, 20.732, 4.613, 20.6);
        ((GeneralPath) shape).curveTo(4.691, 20.521, 4.828, 20.506, 5.012, 20.56);
        ((GeneralPath) shape).curveTo(5.199, 20.666, 5.348, 20.826, 5.453, 21.041);
        ((GeneralPath) shape).curveTo(5.691, 21.279001, 5.719, 21.56, 5.535, 21.881);
        ((GeneralPath) shape).curveTo(5.453, 22.064001, 5.332, 22.135, 5.172, 22.08);
        ((GeneralPath) shape).curveTo(4.988, 22.185, 4.746, 22.24, 4.453, 22.24);
        ((GeneralPath) shape).curveTo(4.0820003, 22.189, 3.77, 22.021, 3.512, 21.74);
        ((GeneralPath) shape).lineTo(3.7340002, 21.998);
        ((GeneralPath) shape).curveTo(4.1600003, 22.428, 4.7580004, 22.439, 5.5350003, 22.040998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x998540));
        g.fill(shape);

        // _0_0_0_205
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1.332, 21.4);
        ((GeneralPath) shape).curveTo(1.441, 21.373, 1.492, 21.317999, 1.492, 21.24);
        ((GeneralPath) shape).curveTo(1.469, 21.135, 1.387, 21.08, 1.254, 21.08);
        ((GeneralPath) shape).curveTo(1.1209999, 21.08, 1.0819999, 21.025, 1.1329999, 20.92);
        ((GeneralPath) shape).curveTo(1.1879998, 20.787, 1.2929999, 20.705, 1.4529998, 20.682);
        ((GeneralPath) shape).curveTo(1.6129998, 20.654, 1.7339998, 20.720999, 1.8119998, 20.880999);
        ((GeneralPath) shape).curveTo(1.8399998, 20.942999, 1.8589998, 21.009998, 1.8749998, 21.079998);
        ((GeneralPath) shape).curveTo(1.8589997, 20.872997, 1.8669997, 20.645998, 1.8949997, 20.399998);
        ((GeneralPath) shape).curveTo(1.7069998, 20.317997, 1.5469997, 20.306997, 1.4139998, 20.360998);
        ((GeneralPath) shape).curveTo(1.0659997, 20.411999, 0.8949998, 20.599998, 0.8949998, 20.919998);
        ((GeneralPath) shape).curveTo(0.8949998, 21.294998, 1.0389998, 21.454998, 1.3319998, 21.399998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(1.172, 27.279);
        ((GeneralPath) shape).lineTo(1.215, 27.317999);
        ((GeneralPath) shape).curveTo(1.227, 27.334, 1.242, 27.345999, 1.2540001, 27.360998);
        ((GeneralPath) shape).curveTo(1.1480001, 27.204998, 1.0940001, 26.989998, 1.0940001, 26.720999);
        ((GeneralPath) shape).curveTo(1.0940001, 26.239998, 1.5590001, 25.798998, 2.492, 25.4);
        ((GeneralPath) shape).curveTo(2.492, 25.185, 2.5860002, 25.08, 2.773, 25.08);
        ((GeneralPath) shape).curveTo(3.9450002, 24.865, 4.602, 24.732, 4.734, 24.682);
        ((GeneralPath) shape).curveTo(5.48, 24.494, 6.066, 24.200998, 6.492, 23.799);
        ((GeneralPath) shape).curveTo(7.105, 23.24, 7.492, 22.157999, 7.652, 20.56);
        ((GeneralPath) shape).lineTo(7.574, 20.317999);
        ((GeneralPath) shape).curveTo(7.332, 19.842, 6.9179997, 19.454998, 6.332, 19.157999);
        ((GeneralPath) shape).curveTo(5.746, 18.919998, 5.1879997, 18.825998, 4.652, 18.880999);
        ((GeneralPath) shape).curveTo(3.7459998, 18.985998, 3.133, 19.307, 2.8119998, 19.842);
        ((GeneralPath) shape).curveTo(3.0269997, 19.842, 3.133, 19.959, 3.133, 20.200998);
        ((GeneralPath) shape).lineTo(3.133, 20.638998);
        ((GeneralPath) shape).lineTo(3.254, 20.278997);
        ((GeneralPath) shape).curveTo(3.4689999, 19.720997, 3.852, 19.372997, 4.414, 19.239998);
        ((GeneralPath) shape).curveTo(4.895, 19.134998, 5.387, 19.200998, 5.895, 19.438997);
        ((GeneralPath) shape).curveTo(6.828, 19.864998, 7.2539997, 20.571997, 7.172, 21.559998);
        ((GeneralPath) shape).curveTo(7.121, 22.173998, 6.906, 22.731998, 6.535, 23.239998);
        ((GeneralPath) shape).curveTo(6.082, 23.825998, 5.4919996, 24.173998, 4.773, 24.278997);
        ((GeneralPath) shape).curveTo(3.9179997, 24.411997, 3.1449997, 24.626997, 2.4529998, 24.919998);
        ((GeneralPath) shape).curveTo(1.6799998, 25.212997, 1.1719998, 25.548998, 0.9339998, 25.919998);
        ((GeneralPath) shape).lineTo(0.7339998, 26.317999);
        ((GeneralPath) shape).lineTo(0.6909998, 22.56);
        ((GeneralPath) shape).curveTo(0.5349998, 22.505999, 0.4689998, 22.373, 0.4919998, 22.157999);
        ((GeneralPath) shape).curveTo(0.5469998, 21.946999, 0.6799998, 21.825998, 0.8949998, 21.799);
        ((GeneralPath) shape).lineTo(1.1519998, 21.779);
        ((GeneralPath) shape).curveTo(1.0199999, 21.76, 0.86699986, 21.724998, 0.69099987, 21.682);
        ((GeneralPath) shape).curveTo(0.66799986, 20.986, 0.61299986, 20.56, 0.53499985, 20.4);
        ((GeneralPath) shape).curveTo(0.50799984, 20.295, 0.42599985, 20.279, 0.29299986, 20.361);
        ((GeneralPath) shape).lineTo(0.21499985, 20.478);
        ((GeneralPath) shape).lineTo(0.29299986, 21.6);
        ((GeneralPath) shape).curveTo(0.31999987, 22.318, 0.33199987, 23.428, 0.33199987, 24.92);
        ((GeneralPath) shape).curveTo(0.35199988, 25.912, 0.39799988, 26.779, 0.47299987, 27.521);
        ((GeneralPath) shape).curveTo(0.48799986, 27.439, 0.53499985, 27.357, 0.61299986, 27.279);
        ((GeneralPath) shape).curveTo(0.8009999, 27.092, 0.98799986, 27.092, 1.1719999, 27.279);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(7.773, 26.599998);
        ((GeneralPath) shape).curveTo(7.8009996, 26.654, 7.785, 26.748, 7.7339997, 26.880999);
        ((GeneralPath) shape).lineTo(7.652, 26.998);
        ((GeneralPath) shape).lineTo(7.691, 26.998);
        ((GeneralPath) shape).curveTo(7.961, 26.974998, 8.121, 26.775, 8.172, 26.4);
        ((GeneralPath) shape).curveTo(8.172, 25.893, 7.988, 25.6, 7.613, 25.521);
        ((GeneralPath) shape).lineTo(7.2539997, 25.478);
        ((GeneralPath) shape).curveTo(7.2539997, 25.666, 7.16, 25.799, 6.9729996, 25.881);
        ((GeneralPath) shape).curveTo(6.812, 25.959, 6.6909995, 26.295, 6.6129994, 26.881);
        ((GeneralPath) shape).curveTo(6.6129994, 27.064001, 6.5589995, 27.174, 6.4529996, 27.201);
        ((GeneralPath) shape).lineTo(6.4919996, 27.361);
        ((GeneralPath) shape).lineTo(5.3749995, 27.56);
        ((GeneralPath) shape).curveTo(4.5739994, 27.692999, 3.7069995, 27.786999, 2.7729995, 27.842);
        ((GeneralPath) shape).curveTo(3.1719995, 27.654, 3.3869996, 27.411999, 3.4139996, 27.119);
        ((GeneralPath) shape).curveTo(3.4689996, 26.826, 3.4259996, 26.571999, 3.2929995, 26.361);
        ((GeneralPath) shape).curveTo(3.1599996, 26.119, 2.9449995, 25.986, 2.6519995, 25.959);
        ((GeneralPath) shape).curveTo(2.1989994, 25.959, 1.8789995, 26.107, 1.6909995, 26.4);
        ((GeneralPath) shape).curveTo(1.8789995, 26.506, 1.9609995, 26.654, 1.9339995, 26.842);
        ((GeneralPath) shape).curveTo(2.0389996, 26.942999, 2.0659995, 27.064, 2.0119996, 27.200998);
        ((GeneralPath) shape).curveTo(2.0699997, 27.064, 2.1599996, 26.985998, 2.2929995, 26.958998);
        ((GeneralPath) shape).lineTo(2.3319995, 26.958998);
        ((GeneralPath) shape).lineTo(2.2539995, 26.798998);
        ((GeneralPath) shape).lineTo(2.0549994, 26.841997);
        ((GeneralPath) shape).curveTo(1.9999994, 26.813997, 1.9879993, 26.747997, 2.0119994, 26.638998);
        ((GeneralPath) shape).curveTo(2.0659993, 26.532997, 2.1479993, 26.438997, 2.2539995, 26.360998);
        ((GeneralPath) shape).lineTo(2.4919994, 26.317999);
        ((GeneralPath) shape).curveTo(2.7069993, 26.24, 2.8669994, 26.294998, 2.9729993, 26.477999);
        ((GeneralPath) shape).curveTo(3.1329994, 26.775, 3.1719995, 27.040998, 3.0939994, 27.279);
        ((GeneralPath) shape).curveTo(3.0119994, 27.521, 2.8119993, 27.665998, 2.4919994, 27.720999);
        ((GeneralPath) shape).curveTo(2.3869994, 27.748, 2.2659993, 27.720999, 2.1329994, 27.638998);
        ((GeneralPath) shape).lineTo(1.9729995, 27.681997);
        ((GeneralPath) shape).curveTo(1.6679995, 27.681997, 1.4409995, 27.591997, 1.2929995, 27.419998);
        ((GeneralPath) shape).curveTo(1.3949995, 27.571999, 1.3669995, 27.724998, 1.2149996, 27.880999);
        ((GeneralPath) shape).curveTo(1.0269996, 28.064, 0.83999956, 28.064, 0.65199953, 27.880999);
        ((GeneralPath) shape).lineTo(0.61299956, 27.842);
        ((GeneralPath) shape).curveTo(0.5549996, 27.782999, 0.51599956, 27.720999, 0.49199957, 27.657999);
        ((GeneralPath) shape).curveTo(0.51599956, 27.880999, 0.54299957, 28.088, 0.5739996, 28.279);
        ((GeneralPath) shape).curveTo(2.4919996, 27.986, 3.7459996, 27.799, 4.3319993, 27.720999);
        ((GeneralPath) shape).curveTo(5.7459993, 27.532999, 7.011999, 27.439, 8.132999, 27.439);
        ((GeneralPath) shape).curveTo(8.292999, 27.439, 8.398, 27.505999, 8.452999, 27.639);
        ((GeneralPath) shape).curveTo(8.5859995, 27.506, 8.534999, 27.361, 8.292999, 27.201);
        ((GeneralPath) shape).curveTo(8.159999, 27.092001, 7.7069993, 27.119, 6.933999, 27.279);
        ((GeneralPath) shape).curveTo(6.800999, 26.615, 6.8519993, 26.224998, 7.093999, 26.119);
        ((GeneralPath) shape).curveTo(7.2809987, 26.041, 7.452999, 26.025, 7.612999, 26.08);
        ((GeneralPath) shape).curveTo(7.800999, 26.157999, 7.8789988, 26.268, 7.851999, 26.4);
        ((GeneralPath) shape).lineTo(7.772999, 26.6);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_206
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.414, 32.4);
        ((GeneralPath) shape).lineTo(11.492, 32.56);
        ((GeneralPath) shape).curveTo(11.573999, 32.693, 11.733999, 32.814003, 11.973, 32.920002);
        ((GeneralPath) shape).lineTo(15.011999, 33.998);
        ((GeneralPath) shape).curveTo(15.546999, 34.158, 17.280998, 34.08, 20.215, 33.760002);
        ((GeneralPath) shape).curveTo(20.934, 33.705, 21.508, 33.56, 21.934, 33.318);
        ((GeneralPath) shape).lineTo(19.612999, 33.521);
        ((GeneralPath) shape).curveTo(17.425999, 33.76, 16.147999, 33.865, 15.772999, 33.842);
        ((GeneralPath) shape).curveTo(15.104999, 33.787, 14.573998, 33.627, 14.171999, 33.361);
        ((GeneralPath) shape).lineTo(11.414, 32.4);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_207
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.172, 26.439);
        ((GeneralPath) shape).lineTo(16.215, 26.477999);
        ((GeneralPath) shape).curveTo(16.266, 26.317999, 16.387001, 26.224998, 16.574, 26.200998);
        ((GeneralPath) shape).lineTo(23.492, 25.520998);
        ((GeneralPath) shape).lineTo(23.492, 25.438997);
        ((GeneralPath) shape).curveTo(23.625, 24.852997, 23.719, 23.985998, 23.773, 22.841997);
        ((GeneralPath) shape).lineTo(23.652, 23.720997);
        ((GeneralPath) shape).curveTo(23.625, 23.532997, 23.535, 23.306997, 23.375, 23.040997);
        ((GeneralPath) shape).curveTo(22.867, 22.345997, 21.586, 21.974997, 19.535, 21.919996);
        ((GeneralPath) shape).curveTo(18.84, 21.919996, 18.265999, 21.638996, 17.812, 21.079996);
        ((GeneralPath) shape).curveTo(17.414, 20.626997, 17.188, 20.079996, 17.133, 19.438995);
        ((GeneralPath) shape).curveTo(17.055, 18.399996, 17.469, 17.571995, 18.375, 16.958996);
        ((GeneralPath) shape).curveTo(18.879, 16.638996, 19.375, 16.493996, 19.852, 16.520996);
        ((GeneralPath) shape).curveTo(20.414, 16.548996, 20.800999, 16.841995, 21.012, 17.399996);
        ((GeneralPath) shape).curveTo(21.227, 17.931995, 21.171999, 18.438995, 20.852, 18.919996);
        ((GeneralPath) shape).curveTo(20.559, 19.317997, 20.227, 19.571997, 19.852, 19.681995);
        ((GeneralPath) shape).curveTo(19.535, 19.759995, 19.254, 19.731995, 19.012, 19.599995);
        ((GeneralPath) shape).curveTo(18.772999, 19.466995, 18.679998, 19.224995, 18.734, 18.880995);
        ((GeneralPath) shape).curveTo(18.811998, 18.532995, 18.960999, 18.267994, 19.171999, 18.079994);
        ((GeneralPath) shape).curveTo(19.387, 17.919994, 19.546999, 17.892994, 19.651999, 17.997993);
        ((GeneralPath) shape).lineTo(19.734, 18.118994);
        ((GeneralPath) shape).curveTo(19.921999, 18.118994, 20.066, 18.145994, 20.175999, 18.200994);
        ((GeneralPath) shape).curveTo(20.227, 18.224995, 20.293, 18.317995, 20.374998, 18.477995);
        ((GeneralPath) shape).curveTo(20.425999, 18.184996, 20.401999, 17.931995, 20.292997, 17.720995);
        ((GeneralPath) shape).curveTo(19.999998, 17.157995, 19.491997, 17.106995, 18.772997, 17.559996);
        ((GeneralPath) shape).lineTo(18.694998, 17.638996);
        ((GeneralPath) shape).lineTo(18.694998, 17.841995);
        ((GeneralPath) shape).curveTo(18.374998, 18.880995, 18.468998, 19.599995, 18.972998, 19.997995);
        ((GeneralPath) shape).curveTo(19.187998, 20.157995, 19.507998, 20.212996, 19.933998, 20.157995);
        ((GeneralPath) shape).curveTo(20.386997, 20.079996, 20.640999, 19.907995, 20.690998, 19.638996);
        ((GeneralPath) shape).curveTo(20.718998, 19.372995, 20.878998, 19.290997, 21.175999, 19.399996);
        ((GeneralPath) shape).curveTo(21.440998, 19.024996, 21.612999, 18.532995, 21.690998, 17.919996);
        ((GeneralPath) shape).curveTo(21.718998, 17.278996, 21.519999, 16.798996, 21.093998, 16.477997);
        ((GeneralPath) shape).curveTo(20.718998, 16.212997, 20.226997, 16.091997, 19.612999, 16.118998);
        ((GeneralPath) shape).lineTo(19.414, 16.157997);
        ((GeneralPath) shape).lineTo(17.734, 17.360996);
        ((GeneralPath) shape).curveTo(17.309, 17.653996, 17.026999, 17.997995, 16.894999, 18.399996);
        ((GeneralPath) shape).curveTo(16.811998, 18.720995, 16.811998, 19.184996, 16.894999, 19.798996);
        ((GeneralPath) shape).curveTo(17.159998, 21.317997, 18.758, 22.184996, 21.690998, 22.399996);
        ((GeneralPath) shape).curveTo(21.960999, 22.454996, 22.093998, 22.599997, 22.093998, 22.841995);
        ((GeneralPath) shape).curveTo(22.811998, 23.134995, 23.198997, 23.493996, 23.253998, 23.919994);
        ((GeneralPath) shape).curveTo(23.253998, 24.614994, 22.944998, 25.013994, 22.335999, 25.118994);
        ((GeneralPath) shape).curveTo(21.905998, 25.145994, 21.602, 25.013994, 21.413998, 24.720993);
        ((GeneralPath) shape).lineTo(21.452997, 24.841993);
        ((GeneralPath) shape).curveTo(21.534998, 25.024994, 21.507998, 25.184994, 21.374998, 25.317993);
        ((GeneralPath) shape).lineTo(21.335999, 25.317993);
        ((GeneralPath) shape).curveTo(21.199, 25.454992, 21.054998, 25.477993, 20.894999, 25.399994);
        ((GeneralPath) shape).curveTo(19.453, 25.614994, 18.401999, 25.731995, 17.734, 25.759995);
        ((GeneralPath) shape).lineTo(17.772999, 25.720995);
        ((GeneralPath) shape).curveTo(18.012, 25.317995, 18.026999, 24.731995, 17.811998, 23.958996);
        ((GeneralPath) shape).curveTo(17.757998, 23.798996, 17.640999, 23.692995, 17.453, 23.638996);
        ((GeneralPath) shape).curveTo(17.237999, 23.587996, 17.012, 23.610996, 16.772999, 23.720997);
        ((GeneralPath) shape).curveTo(16.558998, 23.798996, 16.397999, 23.974997, 16.293, 24.239996);
        ((GeneralPath) shape).lineTo(16.293, 24.360996);
        ((GeneralPath) shape).curveTo(16.293, 24.786997, 16.387, 25.040997, 16.574, 25.118996);
        ((GeneralPath) shape).curveTo(16.625, 25.145996, 16.68, 25.212996, 16.734, 25.317995);
        ((GeneralPath) shape).lineTo(16.934, 25.239996);
        ((GeneralPath) shape).lineTo(16.934, 25.118996);
        ((GeneralPath) shape).lineTo(16.973, 24.798996);
        ((GeneralPath) shape).lineTo(16.973, 24.720997);
        ((GeneralPath) shape).lineTo(16.895, 24.919996);
        ((GeneralPath) shape).curveTo(16.867, 25.052996, 16.812, 25.091997, 16.734001, 25.040997);
        ((GeneralPath) shape).curveTo(16.625002, 24.985996, 16.559002, 24.880997, 16.535002, 24.720997);
        ((GeneralPath) shape).curveTo(16.535002, 24.587997, 16.559002, 24.505997, 16.613, 24.477997);
        ((GeneralPath) shape).curveTo(16.508001, 24.345997, 16.480001, 24.200996, 16.535002, 24.040997);
        ((GeneralPath) shape).curveTo(16.613, 23.880997, 16.734001, 23.798996, 16.895002, 23.798996);
        ((GeneralPath) shape).curveTo(17.559002, 23.825996, 17.840002, 24.345997, 17.734003, 25.360996);
        ((GeneralPath) shape).curveTo(17.707003, 25.544996, 17.602003, 25.638996, 17.414003, 25.638996);
        ((GeneralPath) shape).curveTo(17.387003, 25.692997, 17.398003, 25.747995, 17.453003, 25.798996);
        ((GeneralPath) shape).curveTo(16.492002, 25.907995, 16.066004, 26.118996, 16.172003, 26.438995);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_208
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.215, 27.4);
        ((GeneralPath) shape).curveTo(28.641, 27.506, 28.879, 27.494, 28.934, 27.361);
        ((GeneralPath) shape).curveTo(28.984, 27.252, 28.945, 27.119, 28.812, 26.959);
        ((GeneralPath) shape).curveTo(28.68, 26.720999, 27.867, 26.334, 26.375, 25.799);
        ((GeneralPath) shape).lineTo(25.895, 25.6);
        ((GeneralPath) shape).curveTo(25.895, 25.893, 25.762001, 26.053, 25.492, 26.08);
        ((GeneralPath) shape).lineTo(25.133001, 26.119);
        ((GeneralPath) shape).lineTo(28.215002, 27.4);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_209
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.055, 11.639);
        ((GeneralPath) shape).curveTo(3.402, 11.826, 3.852, 11.908, 4.414, 11.881);
        ((GeneralPath) shape).curveTo(5.3980002, 11.881, 6.254, 11.361, 6.973, 10.318);
        ((GeneralPath) shape).lineTo(7.293, 9.799);
        ((GeneralPath) shape).curveTo(7.3980002, 9.346, 7.254, 8.709, 6.852, 7.8809996);
        ((GeneralPath) shape).curveTo(6.3980002, 7.0529995, 5.227, 6.7209997, 3.3320003, 6.8809996);
        ((GeneralPath) shape).curveTo(2.6910002, 6.9079995, 2.1330004, 6.8139997, 1.6520003, 6.5999994);
        ((GeneralPath) shape).curveTo(1.1990004, 6.411999, 0.9730003, 6.1849995, 0.9730003, 5.9199996);
        ((GeneralPath) shape).curveTo(0.9180003, 5.3069997, 1.1720003, 4.9469995, 1.7340002, 4.8419995);
        ((GeneralPath) shape).curveTo(2.0000002, 4.7599998, 2.2270002, 4.7709994, 2.4140003, 4.8809996);
        ((GeneralPath) shape).curveTo(2.6020002, 4.9589996, 2.6910002, 5.1069994, 2.6910002, 5.3179994);
        ((GeneralPath) shape).curveTo(2.6910002, 5.4549994, 2.6250002, 5.5879993, 2.492, 5.7209992);
        ((GeneralPath) shape).lineTo(2.934, 5.7599993);
        ((GeneralPath) shape).curveTo(3.066, 5.5209994, 3.105, 5.2519994, 3.055, 4.958999);
        ((GeneralPath) shape).curveTo(3.027, 4.6929994, 2.828, 4.520999, 2.453, 4.438999);
        ((GeneralPath) shape).curveTo(2.082, 4.388999, 1.6800001, 4.454999, 1.2540001, 4.642999);
        ((GeneralPath) shape).curveTo(0.9340001, 4.774999, 0.71900004, 5.013999, 0.6130001, 5.360999);
        ((GeneralPath) shape).curveTo(0.87900007, 6.2399993, 1.3870001, 6.774999, 2.1330001, 6.958999);
        ((GeneralPath) shape).curveTo(2.746, 7.118999, 3.7070003, 7.227999, 5.012, 7.2789993);
        ((GeneralPath) shape).curveTo(6.293, 7.4669995, 6.934, 8.306999, 6.934, 9.799);
        ((GeneralPath) shape).curveTo(6.934, 10.040999, 6.812, 10.158, 6.574, 10.158);
        ((GeneralPath) shape).curveTo(6.414, 10.639, 6.027, 11.0529995, 5.414, 11.4);
        ((GeneralPath) shape).curveTo(4.934, 11.639, 4.469, 11.759999, 4.012, 11.759999);
        ((GeneralPath) shape).curveTo(3.5080001, 11.731999, 3.16, 11.506, 2.973, 11.079999);
        ((GeneralPath) shape).curveTo(2.812, 10.704999, 2.8400002, 10.345999, 3.055, 9.997999);
        ((GeneralPath) shape).curveTo(3.2380002, 9.731999, 3.492, 9.506, 3.812, 9.317999);
        ((GeneralPath) shape).curveTo(3.707, 9.106998, 3.734, 8.919999, 3.895, 8.759999);
        ((GeneralPath) shape).curveTo(3.4689999, 8.893, 3.145, 9.106999, 2.934, 9.4);
        ((GeneralPath) shape).lineTo(2.613, 10.24);
        ((GeneralPath) shape).curveTo(2.375, 10.908, 2.52, 11.373, 3.0549998, 11.639);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_210
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.691, 7.682);
        ((GeneralPath) shape).curveTo(16.586, 8.1310005, 16.641, 8.588, 16.852, 9.041);
        ((GeneralPath) shape).curveTo(17.066, 9.494, 17.48, 9.826, 18.094, 10.041);
        ((GeneralPath) shape).curveTo(18.652, 10.252001, 19.215, 10.291, 19.773, 10.158);
        ((GeneralPath) shape).curveTo(20.387001, 10.025, 20.891, 9.771, 21.293001, 9.4);
        ((GeneralPath) shape).curveTo(21.719002, 8.974999, 21.918001, 8.467, 21.891, 7.8809996);
        ((GeneralPath) shape).curveTo(21.867, 7.2949996, 21.68, 6.8259997, 21.332, 6.4779997);
        ((GeneralPath) shape).curveTo(21.012001, 6.1849995, 20.613, 6.0529995, 20.133001, 6.08);
        ((GeneralPath) shape).curveTo(19.680002, 6.107, 19.266, 6.24, 18.895, 6.4779997);
        ((GeneralPath) shape).curveTo(18.52, 6.7479997, 18.32, 7.041, 18.293001, 7.3609996);
        ((GeneralPath) shape).curveTo(18.266, 7.8419995, 18.281002, 8.174, 18.332, 8.361);
        ((GeneralPath) shape).curveTo(18.387001, 8.709, 18.586, 8.932, 18.934, 9.041);
        ((GeneralPath) shape).curveTo(19.625, 9.2560005, 20.133, 9.053, 20.453, 8.439);
        ((GeneralPath) shape).curveTo(20.585999, 8.201, 20.625, 7.959, 20.574, 7.721);
        ((GeneralPath) shape).curveTo(20.491999, 7.4820004, 20.331999, 7.346, 20.094, 7.322);
        ((GeneralPath) shape).curveTo(19.879, 7.322, 19.719, 7.4, 19.612999, 7.56);
        ((GeneralPath) shape).curveTo(19.504, 7.7209997, 19.530998, 7.853, 19.690998, 7.959);
        ((GeneralPath) shape).lineTo(19.890999, 8.162);
        ((GeneralPath) shape).curveTo(19.918, 8.212999, 19.890999, 8.295, 19.811998, 8.4);
        ((GeneralPath) shape).curveTo(19.706999, 8.533, 19.546999, 8.549, 19.331999, 8.443);
        ((GeneralPath) shape).curveTo(19.093998, 8.307, 18.945, 8.096, 18.890999, 7.803);
        ((GeneralPath) shape).curveTo(18.839998, 7.482, 18.945, 7.217, 19.210999, 7.002);
        ((GeneralPath) shape).curveTo(19.425999, 6.8139997, 19.706999, 6.7089996, 20.050999, 6.6819997);
        ((GeneralPath) shape).curveTo(20.425999, 6.6819997, 20.758, 6.83, 21.050999, 7.1229997);
        ((GeneralPath) shape).curveTo(21.370998, 7.4939995, 21.425999, 7.9749994, 21.210999, 8.559999);
        ((GeneralPath) shape).curveTo(20.999998, 9.15, 20.597998, 9.532999, 20.012, 9.721);
        ((GeneralPath) shape).curveTo(19.504, 9.881, 19.012, 9.881, 18.530998, 9.721);
        ((GeneralPath) shape).curveTo(17.597998, 9.4, 17.171999, 8.736, 17.253998, 7.7209997);
        ((GeneralPath) shape).curveTo(17.331997, 7.107, 17.573997, 6.5099998, 17.972998, 5.9199996);
        ((GeneralPath) shape).curveTo(18.425997, 5.2829995, 19.011997, 4.8529997, 19.733997, 4.6429996);
        ((GeneralPath) shape).curveTo(21.811996, 4.0569997, 23.116997, 3.3339996, 23.651997, 2.4819996);
        ((GeneralPath) shape).curveTo(23.944996, 2.0569997, 24.065996, 1.6149997, 24.011997, 1.1619996);
        ((GeneralPath) shape).curveTo(23.956997, 0.68199956, 23.690998, 0.42799956, 23.210997, 0.39999956);
        ((GeneralPath) shape).curveTo(22.702997, 0.39999956, 22.249996, 0.5099996, 21.851997, 0.7209996);
        ((GeneralPath) shape).curveTo(21.452997, 0.9629996, 21.226997, 1.2279997, 21.171997, 1.5209997);
        ((GeneralPath) shape).curveTo(21.065996, 2.2949996, 21.319998, 2.6699996, 21.933996, 2.6429996);
        ((GeneralPath) shape).curveTo(22.249996, 2.5879996, 22.530996, 2.4669995, 22.772997, 2.2829995);
        ((GeneralPath) shape).curveTo(22.983997, 2.0679996, 23.050997, 1.8419995, 22.972998, 1.5999994);
        ((GeneralPath) shape).curveTo(22.917997, 1.3889995, 22.784998, 1.2829994, 22.569998, 1.2829994);
        ((GeneralPath) shape).curveTo(22.358997, 1.3069994, 22.198997, 1.3889993, 22.089998, 1.5209994);
        ((GeneralPath) shape).curveTo(21.878998, 1.8689995, 21.890999, 1.9749994, 22.132998, 1.8419994);
        ((GeneralPath) shape).curveTo(22.343998, 1.7319994, 22.491997, 1.6819994, 22.569998, 1.6819994);
        ((GeneralPath) shape).curveTo(22.624998, 1.7089994, 22.636997, 1.7749995, 22.612997, 1.8809994);
        ((GeneralPath) shape).curveTo(22.558996, 1.9899994, 22.464996, 2.0959995, 22.331997, 2.2009995);
        ((GeneralPath) shape).curveTo(22.171997, 2.2829995, 22.011997, 2.2829995, 21.851997, 2.2009995);
        ((GeneralPath) shape).curveTo(21.690998, 2.1189995, 21.612997, 1.9749995, 21.612997, 1.7599995);
        ((GeneralPath) shape).curveTo(21.585997, 1.5449995, 21.679996, 1.3459995, 21.894997, 1.1579995);
        ((GeneralPath) shape).curveTo(22.077997, 0.94699955, 22.335997, 0.8259995, 22.651997, 0.79899955);
        ((GeneralPath) shape).curveTo(23.292997, 0.72099954, 23.585997, 1.0139996, 23.534996, 1.6819996);
        ((GeneralPath) shape).curveTo(23.534996, 1.9749995, 23.280996, 2.3339996, 22.772997, 2.7599995);
        ((GeneralPath) shape).curveTo(22.241997, 3.1889994, 21.612997, 3.5099995, 20.894997, 3.7209995);
        ((GeneralPath) shape).curveTo(18.866997, 4.3339996, 17.640997, 5.1459994, 17.214996, 6.1619997);
        ((GeneralPath) shape).curveTo(16.917995, 6.8259997, 16.745996, 7.3339996, 16.690996, 7.6819997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_211
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.055, 8.24);
        ((GeneralPath) shape).curveTo(23.426, 8.131, 23.613, 7.9199996, 23.613, 7.6);
        ((GeneralPath) shape).curveTo(23.641, 7.439, 23.613, 7.318, 23.535002, 7.24);
        ((GeneralPath) shape).curveTo(23.453001, 7.1309996, 23.348001, 7.107, 23.215002, 7.158);
        ((GeneralPath) shape).curveTo(23.078003, 7.185, 23.027002, 7.24, 23.055002, 7.318);
        ((GeneralPath) shape).curveTo(23.055002, 7.428, 23.121002, 7.467, 23.254002, 7.4389997);
        ((GeneralPath) shape).curveTo(23.387001, 7.4389997, 23.426003, 7.49, 23.375002, 7.5999994);
        ((GeneralPath) shape).curveTo(23.320002, 7.7319994, 23.215002, 7.8259993, 23.055002, 7.8809996);
        ((GeneralPath) shape).curveTo(22.895002, 7.9319997, 22.773003, 7.8809996, 22.691002, 7.7209997);
        ((GeneralPath) shape).curveTo(22.613003, 7.56, 22.602001, 7.3729997, 22.652002, 7.1579995);
        ((GeneralPath) shape).curveTo(22.734003, 6.8929996, 23.172003, 6.7599993, 23.973001, 6.7599993);
        ((GeneralPath) shape).curveTo(24.078001, 6.7599993, 24.148, 6.7049994, 24.172, 6.5999994);
        ((GeneralPath) shape).curveTo(24.199001, 6.4669995, 24.160002, 6.3849993, 24.055, 6.3569994);
        ((GeneralPath) shape).curveTo(23.707, 6.1739993, 23.133, 6.2519994, 22.336, 6.5999994);
        ((GeneralPath) shape).curveTo(22.199001, 6.681999, 22.105, 6.8419995, 22.055, 7.0799994);
        ((GeneralPath) shape).curveTo(22.0, 7.3459992, 22.012001, 7.5999994, 22.094, 7.8419995);
        ((GeneralPath) shape).curveTo(22.281, 8.268, 22.602, 8.4, 23.055, 8.24);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_212
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.453, 3.4);
        ((GeneralPath) shape).curveTo(16.535, 3.588, 16.679998, 3.693, 16.894999, 3.7210002);
        ((GeneralPath) shape).curveTo(17.133, 3.7440002, 17.374998, 3.7050002, 17.612999, 3.6000001);
        ((GeneralPath) shape).curveTo(17.828, 3.4940002, 17.960999, 3.357, 18.012, 3.2010002);
        ((GeneralPath) shape).curveTo(18.227, 2.4, 18.199, 1.8420002, 17.934, 1.5180002);
        ((GeneralPath) shape).curveTo(17.879, 1.4390002, 17.801, 1.4280002, 17.691, 1.4780003);
        ((GeneralPath) shape).curveTo(17.586, 1.5330002, 17.547, 1.6110003, 17.574, 1.7210003);
        ((GeneralPath) shape).curveTo(17.651999, 1.9040003, 17.691, 2.1190004, 17.691, 2.3570004);
        ((GeneralPath) shape).curveTo(17.719, 2.7320004, 17.641, 2.9590003, 17.453, 3.0410004);
        ((GeneralPath) shape).curveTo(17.237999, 3.1460004, 17.054998, 3.1740003, 16.894999, 3.1190004);
        ((GeneralPath) shape).curveTo(16.734, 3.0920005, 16.668, 3.0020003, 16.690998, 2.8420005);
        ((GeneralPath) shape).curveTo(16.718998, 2.6780005, 16.784998, 2.5600004, 16.894999, 2.4780004);
        ((GeneralPath) shape).curveTo(16.999998, 2.3730004, 17.054998, 2.3890004, 17.054998, 2.5210004);
        ((GeneralPath) shape).curveTo(17.054998, 2.6540003, 17.104998, 2.7210004, 17.214998, 2.7210004);
        ((GeneralPath) shape).curveTo(17.292997, 2.7210004, 17.347998, 2.6540005, 17.374998, 2.5210004);
        ((GeneralPath) shape).curveTo(17.374998, 2.2280004, 17.198997, 2.1190004, 16.851997, 2.2010005);
        ((GeneralPath) shape).curveTo(16.534998, 2.3340003, 16.374998, 2.5720005, 16.374998, 2.9200006);
        ((GeneralPath) shape).curveTo(16.347998, 3.0800006, 16.374998, 3.2400005, 16.452997, 3.4000006);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_213
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.375, 5.24);
        ((GeneralPath) shape).curveTo(23.508, 5.0249996, 23.52, 4.8259997, 23.414, 4.639);
        ((GeneralPath) shape).curveTo(23.331999, 4.455, 23.215, 4.357, 23.055, 4.357);
        ((GeneralPath) shape).curveTo(22.68, 4.334, 22.426, 4.467, 22.293001, 4.7599998);
        ((GeneralPath) shape).curveTo(22.188002, 4.9979997, 22.172, 5.2279997, 22.254002, 5.4389997);
        ((GeneralPath) shape).curveTo(22.305002, 5.5999994, 22.469002, 5.6659994, 22.734001, 5.6389995);
        ((GeneralPath) shape).curveTo(23.027, 5.5879993, 23.238, 5.4549994, 23.375002, 5.2399993);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_214
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.453, 2.799);
        ((GeneralPath) shape).curveTo(19.508, 2.959, 19.679998, 3.014, 19.973, 2.959);
        ((GeneralPath) shape).curveTo(20.265999, 2.9320002, 20.48, 2.8140001, 20.612999, 2.6000001);
        ((GeneralPath) shape).curveTo(20.745998, 2.3890002, 20.762, 2.1850002, 20.651999, 1.9980001);
        ((GeneralPath) shape).curveTo(20.574, 1.8140001, 20.453, 1.7210002, 20.293, 1.7210002);
        ((GeneralPath) shape).curveTo(19.894999, 1.6930002, 19.625, 1.8260002, 19.491999, 2.1190002);
        ((GeneralPath) shape).curveTo(19.414, 2.334, 19.397999, 2.5600002, 19.453, 2.7990003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_215
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.535, 11.158);
        ((GeneralPath) shape).curveTo(0.64100003, 8.307, 0.66800004, 6.666, 0.61300004, 6.24);
        ((GeneralPath) shape).curveTo(0.559, 5.3609996, 0.69100004, 4.8139997, 1.0120001, 4.6);
        ((GeneralPath) shape).curveTo(1.2810001, 4.389, 3.1880002, 4.002, 6.734, 3.439);
        ((GeneralPath) shape).curveTo(7.32, 3.307, 7.4690003, 3.1739998, 7.1720004, 3.041);
        ((GeneralPath) shape).curveTo(7.0660005, 3.014, 6.0780005, 3.1739998, 4.215, 3.521);
        ((GeneralPath) shape).curveTo(2.375, 3.869, 1.3320003, 4.08, 1.0940001, 4.1619997);
        ((GeneralPath) shape).curveTo(0.90600014, 4.213, 0.70700014, 4.3339996, 0.4920001, 4.521);
        ((GeneralPath) shape).lineTo(0.2150001, 4.799);
        ((GeneralPath) shape).lineTo(0.2150001, 10.24);
        ((GeneralPath) shape).curveTo(0.2150001, 10.771, 0.32000008, 11.08, 0.5350001, 11.158);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAC9647));
        g.fill(shape);

        // _0_0_0_216
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.973, 7.08);
        ((GeneralPath) shape).curveTo(23.973, 7.881, 24.078, 8.279, 24.293, 8.279);
        ((GeneralPath) shape).curveTo(24.48, 8.279, 24.559, 7.6150002, 24.535, 6.2790003);
        ((GeneralPath) shape).curveTo(24.426, 4.6540003, 24.375, 3.5720003, 24.375, 3.0410004);
        ((GeneralPath) shape).curveTo(24.375, 1.6270003, 24.48, 0.86500025, 24.691, 0.76000047);
        ((GeneralPath) shape).curveTo(24.824, 0.62700045, 26.133, 1.1850004, 28.612999, 2.4390006);
        ((GeneralPath) shape).curveTo(28.800999, 2.5210006, 28.933998, 2.5330007, 29.012, 2.4780006);
        ((GeneralPath) shape).curveTo(29.066, 2.4280007, 29.039, 2.3610005, 28.934, 2.2790008);
        ((GeneralPath) shape).lineTo(26.531, 1.0410007);
        ((GeneralPath) shape).curveTo(26.0, 0.74800074, 25.586, 0.54500073, 25.293, 0.43900073);
        ((GeneralPath) shape).curveTo(24.84, 0.22500072, 24.41, 0.09200072, 24.012, 0.041000724);
        ((GeneralPath) shape).curveTo(23.637, 0.014000723, 22.585999, 0.17400073, 20.852, 0.52100074);
        ((GeneralPath) shape).curveTo(19.012, 0.8930007, 17.918, 1.1190007, 17.57, 1.2010007);
        ((GeneralPath) shape).curveTo(17.117, 1.2790006, 16.852, 1.3890007, 16.772999, 1.5210006);
        ((GeneralPath) shape).curveTo(16.664, 1.6270006, 16.679998, 1.6820006, 16.811998, 1.6820006);
        ((GeneralPath) shape).curveTo(16.944998, 1.6820006, 17.612999, 1.5600007, 18.811998, 1.3180007);
        ((GeneralPath) shape).curveTo(20.171999, 1.0530007, 21.144999, 0.84200066, 21.729998, 0.6820007);
        ((GeneralPath) shape).curveTo(22.745998, 0.38900068, 23.409998, 0.3610007, 23.729998, 0.6000007);
        ((GeneralPath) shape).curveTo(23.839998, 0.6540007, 23.890997, 1.1190007, 23.890997, 1.9980006);
        ((GeneralPath) shape).lineTo(23.972998, 7.0800004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_217
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.215, 27.4);
        ((GeneralPath) shape).curveTo(28.641, 27.506, 28.879, 27.494, 28.934, 27.361);
        ((GeneralPath) shape).curveTo(28.984, 27.252, 28.945, 27.119, 28.812, 26.959);
        ((GeneralPath) shape).curveTo(28.68, 26.720999, 27.867, 26.334, 26.375, 25.799);
        ((GeneralPath) shape).curveTo(25.305, 25.4, 24.707, 25.08, 24.574, 24.842);
        ((GeneralPath) shape).curveTo(24.491999, 24.682, 24.425999, 23.639, 24.375, 21.720999);
        ((GeneralPath) shape).curveTo(24.348, 20.013998, 24.348, 18.799, 24.375, 18.079998);
        ((GeneralPath) shape).curveTo(24.398, 17.333998, 24.266, 17.040998, 23.973, 17.200998);
        ((GeneralPath) shape).curveTo(23.973, 19.013998, 23.934, 20.372997, 23.852, 21.279);
        ((GeneralPath) shape).curveTo(23.960999, 22.826, 24.012, 23.986, 24.012, 24.759998);
        ((GeneralPath) shape).curveTo(24.039, 25.024998, 24.0, 25.399998, 23.894999, 25.880999);
        ((GeneralPath) shape).curveTo(24.425999, 25.880999, 25.159998, 26.079998, 26.093998, 26.477999);
        ((GeneralPath) shape).lineTo(28.214998, 27.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x837236));
        g.fill(shape);

        // _0_0_0_218
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.613, 2.439);
        ((GeneralPath) shape).curveTo(28.801, 2.521, 28.934, 2.533, 29.012001, 2.478);
        ((GeneralPath) shape).curveTo(29.066002, 2.428, 29.039001, 2.3609998, 28.934002, 2.2789998);
        ((GeneralPath) shape).lineTo(26.535002, 1.0409998);
        ((GeneralPath) shape).curveTo(26.000002, 0.7479998, 25.586002, 0.5449998, 25.293001, 0.43899977);
        ((GeneralPath) shape).curveTo(24.840002, 0.22499977, 24.414001, 0.09199977, 24.012001, 0.04099977);
        ((GeneralPath) shape).curveTo(24.145, 0.73199975, 24.238, 1.7869998, 24.293001, 3.2009997);
        ((GeneralPath) shape).curveTo(24.293001, 4.291, 24.348001, 5.9319997, 24.453001, 8.1189995);
        ((GeneralPath) shape).curveTo(24.559002, 7.8259993, 24.574001, 7.0639997, 24.492, 5.8379993);
        ((GeneralPath) shape).curveTo(24.414001, 4.1069994, 24.375, 3.1739993, 24.375, 3.0409994);
        ((GeneralPath) shape).curveTo(24.375, 1.6269994, 24.48, 0.8649993, 24.691, 0.7599995);
        ((GeneralPath) shape).curveTo(24.828, 0.6269995, 26.133, 1.1849995, 28.612999, 2.4389997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_219
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.254, 32.361);
        ((GeneralPath) shape).curveTo(36.066, 32.119, 37.188004, 31.986, 37.613003, 31.959);
        ((GeneralPath) shape).curveTo(38.148003, 31.932, 38.508003, 31.705, 38.691, 31.279);
        ((GeneralPath) shape).curveTo(38.801003, 30.826, 38.852, 30.571999, 38.852, 30.521);
        ((GeneralPath) shape).curveTo(38.906002, 30.412, 38.945, 28.053, 38.973, 23.439);
        ((GeneralPath) shape).curveTo(38.973, 23.307, 38.922, 23.213, 38.812, 23.157999);
        ((GeneralPath) shape).lineTo(38.652, 23.157999);
        ((GeneralPath) shape).lineTo(38.492, 29.759998);
        ((GeneralPath) shape).curveTo(38.469, 30.345999, 38.387, 30.704998, 38.254, 30.842);
        ((GeneralPath) shape).lineTo(38.012, 30.842);
        ((GeneralPath) shape).curveTo(35.934002, 30.014, 34.668, 29.494, 34.215, 29.279);
        ((GeneralPath) shape).curveTo(33.945, 29.146, 33.773, 29.157999, 33.691, 29.317999);
        ((GeneralPath) shape).lineTo(33.613003, 29.599998);
        ((GeneralPath) shape).lineTo(34.734, 30.079998);
        ((GeneralPath) shape).curveTo(36.973, 30.958998, 37.984, 31.493998, 37.773003, 31.681997);
        ((GeneralPath) shape).curveTo(37.641003, 31.786997, 36.840004, 31.907997, 35.375004, 32.040997);
        ((GeneralPath) shape).curveTo(33.719006, 32.173996, 32.668003, 32.267998, 32.215004, 32.317997);
        ((GeneralPath) shape).curveTo(31.625004, 32.372997, 31.293003, 32.454998, 31.215004, 32.559998);
        ((GeneralPath) shape).curveTo(31.105003, 32.665997, 31.160004, 32.720997, 31.375004, 32.720997);
        ((GeneralPath) shape).curveTo(31.559004, 32.720997, 32.520004, 32.6, 34.254005, 32.360996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_220
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.973, 7.478);
        ((GeneralPath) shape).curveTo(37.812, 7.346, 37.332, 7.025, 36.535, 6.521);
        ((GeneralPath) shape).curveTo(35.652, 5.959, 35.078, 5.639, 34.812, 5.56);
        ((GeneralPath) shape).curveTo(34.574, 5.455, 34.441, 5.428, 34.414, 5.478);
        ((GeneralPath) shape).curveTo(34.414, 5.506, 34.441, 5.5880003, 34.492, 5.721);
        ((GeneralPath) shape).curveTo(34.602, 5.908, 35.039, 6.201, 35.812, 6.6000004);
        ((GeneralPath) shape).curveTo(37.121002, 7.3180003, 37.906002, 7.8650002, 38.172, 8.240001);
        ((GeneralPath) shape).curveTo(38.305, 8.455001, 38.398003, 8.814001, 38.453, 9.3220005);
        ((GeneralPath) shape).curveTo(38.48, 9.482, 38.492, 10.268001, 38.492, 11.682);
        ((GeneralPath) shape).curveTo(38.52, 13.096001, 38.52, 13.932, 38.492, 14.201);
        ((GeneralPath) shape).curveTo(38.492, 14.6, 38.547, 14.826, 38.652, 14.8810005);
        ((GeneralPath) shape).curveTo(38.785, 14.826, 38.84, 14.068001, 38.812, 12.6);
        ((GeneralPath) shape).curveTo(38.762, 10.893001, 38.734, 9.814, 38.734, 9.361);
        ((GeneralPath) shape).curveTo(38.734, 8.533, 38.48, 7.908, 37.973, 7.478);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_221
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.492, 27.881);
        ((GeneralPath) shape).curveTo(8.238, 27.799, 8.586, 27.666, 8.535, 27.478);
        ((GeneralPath) shape).lineTo(0.5739999, 28.560001);
        ((GeneralPath) shape).curveTo(1.3199999, 28.932001, 2.824, 29.545002, 5.094, 30.400002);
        ((GeneralPath) shape).curveTo(5.68, 30.373001, 5.934, 30.318, 5.8519998, 30.240002);
        ((GeneralPath) shape).curveTo(5.613, 30.135002, 5.4529996, 30.053001, 5.375, 29.998001);
        ((GeneralPath) shape).curveTo(5.266, 29.947, 4.758, 29.721, 3.852, 29.318);
        ((GeneralPath) shape).curveTo(2.918, 28.947, 2.359, 28.732, 2.172, 28.682001);
        ((GeneralPath) shape).curveTo(1.9879999, 28.627, 2.652, 28.494001, 4.172, 28.279001);
        ((GeneralPath) shape).curveTo(5.535, 28.092001, 6.641, 27.959002, 7.4919996, 27.881);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1B960));
        g.fill(shape);

        // _0_0_0_222
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.293, 26.56);
        ((GeneralPath) shape).curveTo(16.425999, 26.666, 16.719, 26.682, 17.171999, 26.6);
        ((GeneralPath) shape).curveTo(17.519999, 26.521, 18.602, 26.373001, 20.414, 26.158);
        ((GeneralPath) shape).curveTo(22.281, 25.947, 23.387, 25.842001, 23.734, 25.842001);
        ((GeneralPath) shape).curveTo(24.32, 25.842001, 25.105, 26.053001, 26.094, 26.478);
        ((GeneralPath) shape).lineTo(28.211, 27.400002);
        ((GeneralPath) shape).curveTo(28.613, 27.506002, 28.852001, 27.494001, 28.934, 27.361002);
        ((GeneralPath) shape).lineTo(28.895, 27.361002);
        ((GeneralPath) shape).curveTo(27.16, 26.666002, 25.879, 26.119001, 25.055, 25.721003);
        ((GeneralPath) shape).lineTo(24.652, 25.639002);
        ((GeneralPath) shape).lineTo(24.492, 25.560001);
        ((GeneralPath) shape).curveTo(21.215, 25.666002, 18.48, 25.998001, 16.293, 26.560001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_223
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.414, 32.4);
        ((GeneralPath) shape).lineTo(11.492, 32.56);
        ((GeneralPath) shape).curveTo(11.573999, 32.693, 11.733999, 32.814003, 11.973, 32.920002);
        ((GeneralPath) shape).lineTo(15.011999, 33.998);
        ((GeneralPath) shape).curveTo(15.546999, 34.158, 17.280998, 34.08, 20.215, 33.760002);
        ((GeneralPath) shape).curveTo(20.934, 33.705, 21.508, 33.56, 21.934, 33.318);
        ((GeneralPath) shape).lineTo(19.612999, 33.521);
        ((GeneralPath) shape).curveTo(17.425999, 33.76, 16.147999, 33.865, 15.772999, 33.842);
        ((GeneralPath) shape).curveTo(15.104999, 33.787, 14.573998, 33.627, 14.171999, 33.361);
        ((GeneralPath) shape).lineTo(11.414, 32.4);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_224
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.254, 32.361);
        ((GeneralPath) shape).curveTo(36.066, 32.119, 37.188004, 31.986, 37.613003, 31.959);
        ((GeneralPath) shape).curveTo(37.961002, 31.959, 38.227, 31.865, 38.414, 31.682);
        ((GeneralPath) shape).curveTo(36.734, 30.505999, 35.188, 29.748, 33.773003, 29.4);
        ((GeneralPath) shape).lineTo(33.652004, 29.361);
        ((GeneralPath) shape).lineTo(33.613003, 29.6);
        ((GeneralPath) shape).lineTo(34.734, 30.08);
        ((GeneralPath) shape).curveTo(36.973, 30.959, 37.984, 31.494, 37.773003, 31.682);
        ((GeneralPath) shape).curveTo(37.641003, 31.786999, 36.840004, 31.907999, 35.375004, 32.041);
        ((GeneralPath) shape).curveTo(33.719006, 32.174, 32.668003, 32.268, 32.215004, 32.318);
        ((GeneralPath) shape).curveTo(31.625004, 32.373, 31.293003, 32.455, 31.215004, 32.56);
        ((GeneralPath) shape).curveTo(31.105003, 32.666, 31.160004, 32.721, 31.375004, 32.721);
        ((GeneralPath) shape).curveTo(31.559004, 32.721, 32.520004, 32.600002, 34.254005, 32.361);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_225

        // _0_0_0_225_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.60864f, -0.51912f, 0.51912f, 0.60864f, 5804.3f, 2711.3f));

        // _0_0_0_225_0_0

        // _0_0_0_225_0_0_0

        // _0_0_0_225_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.613, 31.959);
        ((GeneralPath) shape).lineTo(37.973, 31.92);
        ((GeneralPath) shape).lineTo(38.093998, 31.881);
        ((GeneralPath) shape).lineTo(38.293, 31.76);
        ((GeneralPath) shape).curveTo(38.535, 31.627, 38.690998, 31.4, 38.773, 31.08);
        ((GeneralPath) shape).curveTo(38.823997, 30.92, 38.851997, 30.732, 38.851997, 30.521);
        ((GeneralPath) shape).curveTo(38.878998, 30.521, 38.894997, 30.385, 38.894997, 30.119);
        ((GeneralPath) shape).lineTo(38.972996, 23.439);
        ((GeneralPath) shape).curveTo(38.972996, 23.224998, 38.866997, 23.134998, 38.651997, 23.157999);
        ((GeneralPath) shape).lineTo(38.651997, 23.799);
        ((GeneralPath) shape).lineTo(38.612995, 23.682);
        ((GeneralPath) shape).lineTo(38.612995, 14.798999);
        ((GeneralPath) shape).lineTo(38.651997, 14.880999);
        ((GeneralPath) shape).curveTo(38.784996, 14.825998, 38.839996, 14.067999, 38.811996, 12.599998);
        ((GeneralPath) shape).curveTo(38.811996, 11.798999, 38.784996, 10.720999, 38.733997, 9.360998);
        ((GeneralPath) shape).curveTo(38.733997, 8.532998, 38.479996, 7.907998, 37.972996, 7.4779983);
        ((GeneralPath) shape).curveTo(37.519997, 7.1069984, 36.651997, 6.544998, 35.374996, 5.7989984);
        ((GeneralPath) shape).lineTo(35.331997, 5.7989984);
        ((GeneralPath) shape).curveTo(35.281, 5.5599985, 35.214996, 5.5209985, 35.132996, 5.6819983);
        ((GeneralPath) shape).lineTo(34.491997, 5.438998);
        ((GeneralPath) shape).lineTo(29.011997, 2.3999982);
        ((GeneralPath) shape).lineTo(28.933998, 2.2789981);
        ((GeneralPath) shape).lineTo(26.534998, 1.0409981);
        ((GeneralPath) shape).curveTo(25.999998, 0.7479981, 25.585999, 0.5449981, 25.292997, 0.4389981);
        ((GeneralPath) shape).curveTo(24.839998, 0.2249981, 24.413998, 0.0919981, 24.011997, 0.0409981);
        ((GeneralPath) shape).lineTo(23.651997, 0.0409981);
        ((GeneralPath) shape).lineTo(23.413996, 0.0019981004);
        ((GeneralPath) shape).curveTo(22.987995, 0.0019981004, 22.612995, 0.079998106, 22.292995, 0.2399981);
        ((GeneralPath) shape).lineTo(18.093996, 1.079998);
        ((GeneralPath) shape).curveTo(18.011995, 1.0529981, 17.933996, 1.079998, 17.851995, 1.157998);
        ((GeneralPath) shape).lineTo(17.573996, 1.200998);
        ((GeneralPath) shape).curveTo(17.144995, 1.251998, 16.878996, 1.3609979, 16.772995, 1.520998);
        ((GeneralPath) shape).lineTo(9.851995, 2.720998);
        ((GeneralPath) shape).lineTo(9.8119955, 2.720998);
        ((GeneralPath) shape).lineTo(8.093995, 3.040998);
        ((GeneralPath) shape).lineTo(8.054996, 3.040998);
        ((GeneralPath) shape).lineTo(7.3319955, 3.200998);
        ((GeneralPath) shape).curveTo(7.3319955, 3.118998, 7.2809954, 3.0679982, 7.1719956, 3.040998);
        ((GeneralPath) shape).curveTo(7.0659957, 3.013998, 6.077996, 3.1739979, 4.2149954, 3.520998);
        ((GeneralPath) shape).curveTo(2.3749952, 3.864998, 1.3319955, 4.079998, 1.0939953, 4.157998);
        ((GeneralPath) shape).curveTo(0.77299535, 4.239998, 0.4799953, 4.454998, 0.21499532, 4.798998);
        ((GeneralPath) shape).lineTo(0.21499532, 10.239998);
        ((GeneralPath) shape).curveTo(0.21499532, 10.559998, 0.26599532, 10.813998, 0.37499532, 11.001998);
        ((GeneralPath) shape).lineTo(0.5349953, 11.157998);
        ((GeneralPath) shape).lineTo(0.5739953, 10.278998);
        ((GeneralPath) shape).lineTo(0.4139953, 20.157997);
        ((GeneralPath) shape).lineTo(0.3749953, 20.278997);
        ((GeneralPath) shape).lineTo(0.29299527, 20.360998);
        ((GeneralPath) shape).curveTo(0.18799528, 20.411999, 0.10499528, 20.825998, 0.05499527, 21.599998);
        ((GeneralPath) shape).curveTo(-4.7311187E-6, 22.345999, -0.012004733, 23.106998, 0.011995267, 23.880999);
        ((GeneralPath) shape).lineTo(0.011995267, 26.520998);
        ((GeneralPath) shape).curveTo(-0.012004733, 27.587997, 0.05499527, 28.200998, 0.21499527, 28.360998);
        ((GeneralPath) shape).curveTo(0.37499526, 28.520998, 1.2379953, 28.907999, 2.811995, 29.520998);
        ((GeneralPath) shape).curveTo(3.585995, 29.841997, 4.347995, 30.134998, 5.093995, 30.399998);
        ((GeneralPath) shape).curveTo(5.491995, 30.399998, 5.745995, 30.372997, 5.851995, 30.317997);
        ((GeneralPath) shape).lineTo(11.413995, 32.399998);
        ((GeneralPath) shape).lineTo(11.491995, 32.559998);
        ((GeneralPath) shape).curveTo(11.573995, 32.692997, 11.7339945, 32.814, 11.972995, 32.92);
        ((GeneralPath) shape).lineTo(15.011995, 34.002);
        ((GeneralPath) shape).curveTo(15.546995, 34.157997, 17.280994, 34.079998, 20.214996, 33.76);
        ((GeneralPath) shape).curveTo(20.901997, 33.709, 21.452997, 33.576, 21.874996, 33.361);
        ((GeneralPath) shape).lineTo(31.452995, 32.439);
        ((GeneralPath) shape).curveTo(31.265995, 32.494, 31.171995, 32.559998, 31.171995, 32.639);
        ((GeneralPath) shape).curveTo(31.171995, 32.693, 31.237995, 32.721, 31.374994, 32.721);
        ((GeneralPath) shape).curveTo(31.772995, 32.721, 33.851994, 32.467, 37.612995, 31.959002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-3338.199951171875, -7254), new Point2D.Double(-3293.5, -7254), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_225_0_0

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

