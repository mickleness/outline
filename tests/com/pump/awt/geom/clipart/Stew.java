package com.pump.awt.geom.clipart;

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
 * Source image: https://openclipart.org/detail/209516/food-awesome-stew
 * </p>
 */
public class Stew implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public Stew() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Stew(int width, int height) {
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
        g.transform(new AffineTransform(0.024832997f, 0, 0, 0.024832997f, 0.059735786f, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, 0, 40.269f));

        // _0_0

        // _0_0_0

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.762, 8.489);
        ((GeneralPath) shape).lineTo(27.883, 8.52);
        ((GeneralPath) shape).curveTo(27.102, 6.0390005, 25.453, 4.0080004, 22.934, 2.4300003);
        ((GeneralPath) shape).curveTo(20.352, 0.80900025, 17.414, 2.3841858E-7, 14.113, 2.3841858E-7);
        ((GeneralPath) shape).curveTo(10.793, 2.3841858E-7, 7.844, 0.8210002, 5.262, 2.4570003);
        ((GeneralPath) shape).curveTo(2.703, 4.078, 1.0620003, 6.1410003, 0.34399986, 8.641001);
        ((GeneralPath) shape).lineTo(0.5549998, 8.578001);
        ((GeneralPath) shape).curveTo(1.3319998, 7.981001, 2.9839997, 7.481001, 5.5039997, 7.078001);
        ((GeneralPath) shape).curveTo(8.042999, 6.7000012, 10.952999, 6.508001, 14.233999, 6.508001);
        ((GeneralPath) shape).curveTo(17.414, 6.508001, 20.254, 6.700001, 22.754, 7.078001);
        ((GeneralPath) shape).curveTo(25.234, 7.438001, 26.902, 7.910001, 27.762, 8.489001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD9D9D9));
        g.fill(shape);

        // _0_0_0_1

        // _0_0_0_1_0

        // _0_0_0_1_0_0

        // _0_0_0_1_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_0_1_0_0_0_0

        // _0_0_0_1_0_0_0_0_0

        // _0_0_0_1_0_0_0_0_0_0

        // _0_0_0_1_0_0_0_0_0_0_0

        // _0_0_0_1_0_0_0_0_0_0_0_0

        // _0_0_0_1_0_0_0_0_0_0_0_0_0

        // _0_0_0_1_0_0_0_0_0_0_0_0_0_0

        // _0_0_0_1_0_0_0_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.434, 7.375);
        ((GeneralPath) shape).lineTo(15.516, 0.8629999);
        ((GeneralPath) shape).lineTo(14.105, 0.80499995);
        ((GeneralPath) shape).curveTo(13.542999, 0.80499995, 12.992, 0.83599997, 12.452999, 0.895);
        ((GeneralPath) shape).curveTo(11.792999, 0.996, 11.042999, 1.1949999, 10.202999, 1.492);
        ((GeneralPath) shape).curveTo(9.343999, 1.812, 8.624999, 2.164, 8.042999, 2.543);
        ((GeneralPath) shape).curveTo(6.202999, 3.742, 4.7849994, 5.082, 3.7849994, 6.5620003);
        ((GeneralPath) shape).curveTo(3.2849994, 7.3050003, 2.9729993, 7.926, 2.8549993, 8.426001);
        ((GeneralPath) shape).lineTo(4.444999, 8.094001);
        ((GeneralPath) shape).curveTo(7.183999, 7.574001, 10.445, 7.3120008, 14.223, 7.3120008);
        ((GeneralPath) shape).lineTo(17.434, 7.375001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-22.461000442504883, -32.38399887084961), new Point2D.Double(-6.760900020599365, -32.38399887084961), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(0.6f, -0.00192f, 0.00192f, 0.6f, 18.492f, 24.013f)));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_0_0_0_0

        // _0_0_0_2

        // _0_0_0_2_0

        // _0_0_0_2_0_0

        // _0_0_0_2_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_0_2_0_0_0_0

        // _0_0_0_2_0_0_0_0_0

        // _0_0_0_2_0_0_0_0_0_0

        // _0_0_0_2_0_0_0_0_0_0_0

        // _0_0_0_2_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.422, 7.883);
        ((GeneralPath) shape).curveTo(24.223001, 8.125, 25.633001, 8.426, 26.652, 8.785);
        ((GeneralPath) shape).curveTo(26.473, 8.223, 26.195, 7.633, 25.812, 7.016);
        ((GeneralPath) shape).curveTo(25.055, 5.832, 23.895, 4.6449995, 22.332, 3.4449997);
        ((GeneralPath) shape).curveTo(21.133001, 2.5429997, 19.605001, 1.7849997, 17.742, 1.1639998);
        ((GeneralPath) shape).lineTo(16.332, 0.95299983);
        ((GeneralPath) shape).curveTo(18.734001, 1.8119998, 20.434002, 3.0619998, 21.434002, 4.703);
        ((GeneralPath) shape).curveTo(21.895002, 5.426, 22.184002, 6.105, 22.305002, 6.742);
        ((GeneralPath) shape).curveTo(22.383001, 7.086, 22.422003, 7.465, 22.422003, 7.8830004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x595959));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_2_0_0_0_0

        // _0_0_0_3

        // _0_0_0_3_0

        // _0_0_0_3_0_0

        // _0_0_0_3_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_0_3_0_0_0_0

        // _0_0_0_3_0_0_0_0_0

        // _0_0_0_3_0_0_0_0_0_0

        // _0_0_0_3_0_0_0_0_0_0_0

        // _0_0_0_3_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.984, 1.895);
        ((GeneralPath) shape).curveTo(6.0620003, 2.613, 4.434, 3.633, 3.0940003, 4.953);
        ((GeneralPath) shape).curveTo(1.7340003, 6.2730002, 0.8120003, 7.766, 0.33200026, 9.426001);
        ((GeneralPath) shape).lineTo(0.5430002, 9.363001);
        ((GeneralPath) shape).lineTo(0.9920002, 9.094001);
        ((GeneralPath) shape).curveTo(1.3120003, 8.133, 1.8320003, 7.152001, 2.5550003, 6.152001);
        ((GeneralPath) shape).curveTo(3.9530003, 4.215001, 5.762, 2.793001, 7.984, 1.8950009);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_3_0_0_0_0

        // _0_0_0_4

        // _0_0_0_4_0

        // _0_0_0_4_0_0

        // _0_0_0_4_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.773, 13.321);
        ((GeneralPath) shape).curveTo(26.434, 12.321, 27.762001, 11.117001, 27.762001, 9.719);
        ((GeneralPath) shape).curveTo(27.762001, 8.301, 26.434002, 7.1019998, 23.773, 6.1169996);
        ((GeneralPath) shape).curveTo(21.133001, 5.1169996, 17.934, 4.6169996, 14.176001, 4.6169996);
        ((GeneralPath) shape).curveTo(10.434, 4.6169996, 7.2340007, 5.1169996, 4.5740004, 6.1169996);
        ((GeneralPath) shape).curveTo(1.9340003, 7.1019998, 0.6130004, 8.301, 0.6130004, 9.719);
        ((GeneralPath) shape).curveTo(0.6130004, 11.117, 1.9340004, 12.321, 4.5740004, 13.321);
        ((GeneralPath) shape).curveTo(7.234, 14.321, 10.434, 14.821, 14.176001, 14.821);
        ((GeneralPath) shape).curveTo(17.914001, 14.821, 21.113, 14.321, 23.773, 13.321);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(0.7997999787330627, 8.600600242614746), new Point2D.Double(46.04999923706055, 8.600600242614746), new float[]{0, 1}, new Color[]{new Color(0x7D7D7D), new Color(0xD4D4D4)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.152, 10.078);
        ((GeneralPath) shape).lineTo(27.285, 10.078);
        ((GeneralPath) shape).curveTo(27.102, 11.321, 25.754, 12.367001, 23.234, 13.231);
        ((GeneralPath) shape).curveTo(20.734, 14.09, 17.734, 14.52, 14.233999, 14.52);
        ((GeneralPath) shape).curveTo(10.754, 14.52, 7.7659993, 14.09, 5.261999, 13.231001);
        ((GeneralPath) shape).curveTo(2.745999, 12.367001, 1.394999, 11.321001, 1.2149992, 10.078001);
        ((GeneralPath) shape).lineTo(0.19499922, 10.078001);
        ((GeneralPath) shape).curveTo(0.5159992, 11.438001, 2.0039992, 12.578001, 4.663999, 13.500001);
        ((GeneralPath) shape).curveTo(7.362999, 14.418001, 10.534999, 14.879001, 14.175999, 14.879001);
        ((GeneralPath) shape).curveTo(17.831999, 14.879001, 21.003998, 14.418, 23.683998, 13.500001);
        ((GeneralPath) shape).curveTo(26.343998, 12.578001, 27.831997, 11.438001, 28.151999, 10.078001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        // _0_0_0_6

        // _0_0_0_6_0

        // _0_0_0_6_0_0

        // _0_0_0_6_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.113, 7.617);
        ((GeneralPath) shape).curveTo(24.895, 6.918, 23.793001, 6.367, 22.812, 5.969);
        ((GeneralPath) shape).curveTo(21.012001, 5.1879997, 19.262001, 4.789, 17.562, 4.77);
        ((GeneralPath) shape).curveTo(12.383, 4.649, 8.434, 5.071, 5.7110004, 6.028);
        ((GeneralPath) shape).curveTo(4.3950005, 6.508, 3.3320005, 7.02, 2.5310004, 7.559);
        ((GeneralPath) shape).lineTo(1.7230003, 8.219);
        ((GeneralPath) shape).curveTo(1.6410003, 8.5, 1.7540003, 8.848, 2.0510004, 9.2699995);
        ((GeneralPath) shape).curveTo(2.3120003, 9.648999, 2.6520004, 9.969, 3.0700004, 10.226999);
        ((GeneralPath) shape).curveTo(3.3520005, 10.409999, 3.9530005, 10.640999, 4.8710003, 10.917999);
        ((GeneralPath) shape).curveTo(5.793, 11.218999, 6.4220004, 11.468999, 6.762, 11.667999);
        ((GeneralPath) shape).curveTo(7.859, 12.348, 9.211, 12.718999, 10.812, 12.777999);
        ((GeneralPath) shape).curveTo(11.191, 12.800999, 12.141001, 12.827999, 13.66, 12.866999);
        ((GeneralPath) shape).curveTo(14.941, 12.909999, 15.941, 12.956999, 16.66, 13.019999);
        ((GeneralPath) shape).curveTo(17.941, 13.116999, 19.594, 12.820998, 21.612999, 12.116999);
        ((GeneralPath) shape).curveTo(23.352, 11.499999, 24.57, 10.999999, 25.272999, 10.616999);
        ((GeneralPath) shape).curveTo(25.933998, 10.277999, 26.390999, 9.788999, 26.651999, 9.148998);
        ((GeneralPath) shape).curveTo(26.953, 8.429998, 26.772999, 7.9179983, 26.112999, 7.616998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(2.6078999042510986, 9.97659969329834), new Point2D.Double(44.382999420166016, 9.97659969329834), new float[]{0, 1}, new Color[]{new Color(0xA67C3C), new Color(0x85612D)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.043, 9.27);
        ((GeneralPath) shape).curveTo(6.164, 9.168, 6.215, 9.028001, 6.195, 8.848001);
        ((GeneralPath) shape).curveTo(6.176, 8.668, 6.0940003, 8.5390005, 5.953, 8.457001);
        ((GeneralPath) shape).curveTo(5.855, 8.418001, 5.664, 8.418001, 5.383, 8.457001);
        ((GeneralPath) shape).curveTo(5.023, 8.5390005, 4.7539997, 8.578001, 4.574, 8.578001);
        ((GeneralPath) shape).curveTo(3.9919999, 8.578001, 3.863, 8.821001, 4.184, 9.301001);
        ((GeneralPath) shape).curveTo(4.344, 9.52, 4.613, 9.629001, 4.996, 9.629001);
        ((GeneralPath) shape).curveTo(5.395, 9.629001, 5.746, 9.508, 6.0429997, 9.27);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.125, 9.989);
        ((GeneralPath) shape).curveTo(7.004, 9.93, 6.824, 9.950001, 6.582, 10.051001);
        ((GeneralPath) shape).lineTo(5.9839997, 10.379001);
        ((GeneralPath) shape).lineTo(6.133, 10.617001);
        ((GeneralPath) shape).curveTo(6.2539997, 10.778001, 6.383, 10.84, 6.523, 10.801001);
        ((GeneralPath) shape).lineTo(7.6949997, 10.438001);
        ((GeneralPath) shape).curveTo(7.7339997, 10.438001, 7.5429997, 10.2890005, 7.1249995, 9.989);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.453, 8.367);
        ((GeneralPath) shape).curveTo(4.254, 8.289, 4.0230002, 8.289, 3.762, 8.367);
        ((GeneralPath) shape).curveTo(3.582, 8.41, 3.523, 8.488999, 3.582, 8.61);
        ((GeneralPath) shape).lineTo(3.734, 8.789);
        ((GeneralPath) shape).lineTo(3.824, 8.577999);
        ((GeneralPath) shape).curveTo(3.902, 8.437999, 4.113, 8.366999, 4.453, 8.366999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_0_10

        // _0_0_0_10_0

        // _0_0_0_10_0_0

        // _0_0_0_10_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_0_10_0_0_0_0

        // _0_0_0_10_0_0_0_0_0

        // _0_0_0_10_0_0_0_0_0_0

        // _0_0_0_10_0_0_0_0_0_0_0

        // _0_0_0_10_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.234, 10.555);
        ((GeneralPath) shape).curveTo(26.554998, 10.176001, 26.723, 9.805, 26.741999, 9.445001);
        ((GeneralPath) shape).lineTo(26.593998, 9.625001);
        ((GeneralPath) shape).curveTo(26.073997, 10.523001, 25.171997, 11.145, 23.894999, 11.484001);
        ((GeneralPath) shape).curveTo(23.554998, 11.586001, 22.984, 11.695002, 22.183998, 11.812001);
        ((GeneralPath) shape).curveTo(21.323997, 11.934001, 20.573997, 12.074001, 19.933998, 12.234001);
        ((GeneralPath) shape).curveTo(19.214998, 12.414001, 18.362999, 12.484001, 17.382998, 12.445002);
        ((GeneralPath) shape).curveTo(16.261997, 12.363002, 15.362997, 12.324001, 14.683998, 12.324001);
        ((GeneralPath) shape).curveTo(12.522998, 12.324001, 11.022998, 12.293001, 10.183998, 12.234001);
        ((GeneralPath) shape).curveTo(9.581998, 12.215001, 8.741998, 11.945002, 7.663998, 11.426002);
        ((GeneralPath) shape).curveTo(6.683998, 10.945002, 6.0429983, 10.555001, 5.741998, 10.254002);
        ((GeneralPath) shape).curveTo(5.604998, 10.312001, 5.433998, 10.332002, 5.2339983, 10.312001);
        ((GeneralPath) shape).curveTo(4.854998, 10.234001, 4.5349984, 9.926002, 4.2729983, 9.383001);
        ((GeneralPath) shape).curveTo(4.2149982, 9.266002, 3.9919984, 9.055001, 3.6129982, 8.754002);
        ((GeneralPath) shape).curveTo(3.2539983, 8.453002, 3.0549982, 8.215002, 3.0159984, 8.035002);
        ((GeneralPath) shape).curveTo(2.3549984, 8.414001, 1.9139984, 8.742002, 1.6949984, 9.023002);
        ((GeneralPath) shape).curveTo(1.6129984, 9.305001, 1.7229984, 9.652001, 2.0229983, 10.074001);
        ((GeneralPath) shape).curveTo(2.2849984, 10.453001, 2.6249983, 10.773002, 3.0429983, 11.035002);
        ((GeneralPath) shape).curveTo(3.3239982, 11.215002, 3.9259982, 11.445002, 4.8439984, 11.7230015);
        ((GeneralPath) shape).curveTo(5.761998, 12.023002, 6.3949986, 12.273002, 6.7339983, 12.4730015);
        ((GeneralPath) shape).curveTo(7.8319983, 13.152001, 9.183998, 13.523002, 10.784998, 13.586001);
        ((GeneralPath) shape).curveTo(11.163998, 13.605001, 12.112998, 13.633001, 13.6329975, 13.676002);
        ((GeneralPath) shape).curveTo(14.913998, 13.715001, 15.913998, 13.766002, 16.632998, 13.824001);
        ((GeneralPath) shape).curveTo(17.913998, 13.926002, 19.561996, 13.625001, 21.581997, 12.926002);
        ((GeneralPath) shape).curveTo(23.323997, 12.305001, 24.542997, 11.805001, 25.241997, 11.426002);
        ((GeneralPath) shape).curveTo(25.624996, 11.2230015, 25.952997, 10.934002, 26.233997, 10.555001);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_10_0_0_0_0

        // _0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.902, 10.77);
        ((GeneralPath) shape).curveTo(10.543, 11.129001, 10.266001, 11.528001, 10.062, 11.969001);
        ((GeneralPath) shape).curveTo(9.945001, 12.227001, 9.844, 12.52, 9.762, 12.840001);
        ((GeneralPath) shape).lineTo(9.703, 13.258001);
        ((GeneralPath) shape).lineTo(10.695, 13.200002);
        ((GeneralPath) shape).curveTo(10.992, 13.200002, 11.382999, 13.117002, 11.863, 12.957002);
        ((GeneralPath) shape).lineTo(12.195, 12.149002);
        ((GeneralPath) shape).curveTo(12.273, 11.950002, 12.422, 11.750002, 12.6449995, 11.547002);
        ((GeneralPath) shape).lineTo(10.901999, 10.770001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.246, 11.821);
        ((GeneralPath) shape).lineTo(10.965, 11.52);
        ((GeneralPath) shape).lineTo(12.645, 11.551001);
        ((GeneralPath) shape).lineTo(12.1050005, 10.801001);
        ((GeneralPath) shape).lineTo(12.016001, 10.559001);
        ((GeneralPath) shape).curveTo(11.633, 10.301001, 11.246, 10.129001, 10.844001, 10.047001);
        ((GeneralPath) shape).lineTo(9.402, 9.750001);
        ((GeneralPath) shape).lineTo(9.555, 11.157001);
        ((GeneralPath) shape).lineTo(10.246, 11.821);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.152, 12.899);
        ((GeneralPath) shape).lineTo(10.812, 12.059);
        ((GeneralPath) shape).curveTo(10.9140005, 11.899, 10.965, 11.719, 10.965, 11.52);
        ((GeneralPath) shape).curveTo(10.6640005, 11.438001, 10.422, 11.2890005, 10.246, 11.067);
        ((GeneralPath) shape).curveTo(10.1640005, 10.950001, 10.086, 10.77, 10.004001, 10.528001);
        ((GeneralPath) shape).curveTo(9.945001, 10.328001, 9.875001, 10.188001, 9.793, 10.110001);
        ((GeneralPath) shape).lineTo(9.402, 9.750001);
        ((GeneralPath) shape).curveTo(8.863001, 10.387001, 8.586, 10.778001, 8.562, 10.918001);
        ((GeneralPath) shape).curveTo(8.543, 11.000001, 8.652, 11.321001, 8.895, 11.879002);
        ((GeneralPath) shape).curveTo(9.133, 12.399002, 9.332001, 12.789001, 9.492001, 13.051002);
        ((GeneralPath) shape).curveTo(9.695001, 13.391002, 9.9140005, 13.340001, 10.152, 12.899001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.875, 10.981);
        ((GeneralPath) shape).lineTo(19.125, 10.321);
        ((GeneralPath) shape).curveTo(19.043, 10.2, 18.895, 10.071, 18.672, 9.93);
        ((GeneralPath) shape).lineTo(18.371, 9.75);
        ((GeneralPath) shape).lineTo(17.355, 10.289);
        ((GeneralPath) shape).lineTo(18.223, 11.941999);
        ((GeneralPath) shape).lineTo(19.785, 11.551);
        ((GeneralPath) shape).lineTo(19.875, 10.981);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.555, 12.207);
        ((GeneralPath) shape).lineTo(18.285, 11.429999);
        ((GeneralPath) shape).lineTo(18.254, 10.917999);
        ((GeneralPath) shape).lineTo(18.371, 9.749999);
        ((GeneralPath) shape).lineTo(18.285, 9.777999);
        ((GeneralPath) shape).lineTo(16.812, 10.019999);
        ((GeneralPath) shape).lineTo(16.305, 10.257998);
        ((GeneralPath) shape).curveTo(16.285, 10.257998, 16.043001, 10.347999, 15.582001, 10.531999);
        ((GeneralPath) shape).curveTo(15.324, 10.628999, 15.102001, 10.730999, 14.922001, 10.827999);
        ((GeneralPath) shape).lineTo(13.723001, 11.398999);
        ((GeneralPath) shape).lineTo(13.695001, 12.449999);
        ((GeneralPath) shape).lineTo(15.555, 12.206999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.883, 12.059);
        ((GeneralPath) shape).curveTo(19.285, 11.899, 19.581999, 11.731, 19.785, 11.551);
        ((GeneralPath) shape).lineTo(18.824, 11.339999);
        ((GeneralPath) shape).lineTo(18.254, 10.917999);
        ((GeneralPath) shape).curveTo(18.055, 10.917999, 17.772999, 10.988999, 17.414, 11.129);
        ((GeneralPath) shape).lineTo(13.695, 12.45);
        ((GeneralPath) shape).lineTo(14.473, 13.051);
        ((GeneralPath) shape).lineTo(15.285, 13.348);
        ((GeneralPath) shape).lineTo(16.664, 13.0199995);
        ((GeneralPath) shape).curveTo(17.184, 12.86, 17.921999, 12.539, 18.883, 12.058999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.914, 8.821);
        ((GeneralPath) shape).lineTo(7.242, 9.418);
        ((GeneralPath) shape).lineTo(10.844, 10.051001);
        ((GeneralPath) shape).lineTo(10.9609995, 9.899);
        ((GeneralPath) shape).curveTo(11.042999, 9.778, 11.073999, 9.668, 11.054999, 9.571);
        ((GeneralPath) shape).curveTo(11.030999, 9.367001, 10.882999, 9.27, 10.601999, 9.27);
        ((GeneralPath) shape).lineTo(8.535, 9.239);
        ((GeneralPath) shape).curveTo(8.312, 9.239, 8.073999, 9.149, 7.812, 8.969);
        ((GeneralPath) shape).curveTo(7.555, 8.789, 7.375, 8.68, 7.273, 8.641);
        ((GeneralPath) shape).curveTo(7.1759996, 8.578, 7.094, 8.559, 7.035, 8.578);
        ((GeneralPath) shape).lineTo(6.9449997, 8.61);
        ((GeneralPath) shape).lineTo(6.9139996, 8.821);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.793, 9.059);
        ((GeneralPath) shape).curveTo(6.8120003, 9.16, 6.8630004, 9.27, 6.945, 9.391);
        ((GeneralPath) shape).curveTo(7.086, 9.649, 7.2660003, 9.821, 7.484, 9.899);
        ((GeneralPath) shape).curveTo(7.8050003, 10.0390005, 8.195001, 10.16, 8.656, 10.258);
        ((GeneralPath) shape).curveTo(9.176001, 10.379001, 9.555, 10.410001, 9.793, 10.348001);
        ((GeneralPath) shape).curveTo(10.133, 10.2890005, 10.484, 10.188001, 10.844, 10.051001);
        ((GeneralPath) shape).curveTo(10.906, 9.7890005, 10.816, 9.629001, 10.573999, 9.571001);
        ((GeneralPath) shape).curveTo(10.516, 9.551001, 10.214999, 9.551001, 9.676, 9.571001);
        ((GeneralPath) shape).curveTo(9.132999, 9.610001, 8.676, 9.559001, 8.292999, 9.418001);
        ((GeneralPath) shape).curveTo(7.8949995, 9.278001, 7.5549994, 9.0980015, 7.2729993, 8.879002);
        ((GeneralPath) shape).curveTo(7.1129994, 8.778002, 7.003999, 8.688002, 6.944999, 8.610002);
        ((GeneralPath) shape).curveTo(6.8049994, 8.727001, 6.753999, 8.879002, 6.7929993, 9.059002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.512, 9.93);
        ((GeneralPath) shape).curveTo(19.651999, 9.7890005, 20.022999, 9.758, 20.625, 9.84);
        ((GeneralPath) shape).curveTo(20.785, 9.860001, 20.953, 9.918, 21.133, 10.02);
        ((GeneralPath) shape).curveTo(21.272999, 10.102, 21.375, 10.129001, 21.434, 10.110001);
        ((GeneralPath) shape).curveTo(21.555, 10.051001, 21.613, 9.969001, 21.613, 9.867001);
        ((GeneralPath) shape).lineTo(21.523, 9.719001);
        ((GeneralPath) shape).curveTo(21.484001, 9.617001, 21.352001, 9.532001, 21.133001, 9.450001);
        ((GeneralPath) shape).curveTo(20.875002, 9.348001, 20.602001, 9.301001, 20.324001, 9.301001);
        ((GeneralPath) shape).curveTo(19.844002, 9.278001, 19.352001, 9.360001, 18.855001, 9.5390005);
        ((GeneralPath) shape).curveTo(18.434002, 9.700001, 18.223001, 9.918, 18.223001, 10.200001);
        ((GeneralPath) shape).curveTo(18.223001, 10.379001, 18.492, 10.418001, 19.035002, 10.317);
        ((GeneralPath) shape).curveTo(19.195002, 10.258, 19.352001, 10.129001, 19.512001, 9.93);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.164, 10.77);
        ((GeneralPath) shape).curveTo(21.465, 10.7890005, 21.754, 10.75, 22.035, 10.649);
        ((GeneralPath) shape).curveTo(22.293, 10.551001, 22.421999, 10.457, 22.421999, 10.379);
        ((GeneralPath) shape).curveTo(22.401999, 10.278, 22.151999, 10.289, 21.671999, 10.41);
        ((GeneralPath) shape).curveTo(21.554998, 10.43, 21.331999, 10.399, 21.012, 10.321);
        ((GeneralPath) shape).curveTo(20.695, 10.239, 20.464998, 10.219, 20.324, 10.258);
        ((GeneralPath) shape).curveTo(20.144999, 10.301001, 20.184, 10.399, 20.445, 10.559);
        ((GeneralPath) shape).curveTo(20.684, 10.7, 20.921999, 10.77, 21.164, 10.77);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.105, 7.469);
        ((GeneralPath) shape).curveTo(12.523, 7.43, 12.625, 7.278, 12.401999, 7.02);
        ((GeneralPath) shape).curveTo(12.202999, 6.801, 11.933999, 6.649, 11.594, 6.567);
        ((GeneralPath) shape).curveTo(11.434, 6.547, 11.273, 6.387, 11.113, 6.086);
        ((GeneralPath) shape).curveTo(10.973, 5.828, 10.805, 5.719, 10.602, 5.758);
        ((GeneralPath) shape).curveTo(10.344, 5.817, 10.242001, 6.008, 10.305, 6.328);
        ((GeneralPath) shape).curveTo(10.344, 6.629, 10.473001, 6.856, 10.691, 7.0160003);
        ((GeneralPath) shape).curveTo(11.176, 7.36, 11.645, 7.5080004, 12.105, 7.4690003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.223, 7.86);
        ((GeneralPath) shape).curveTo(21.965, 7.821, 22.305, 7.6600003, 22.242, 7.379);
        ((GeneralPath) shape).curveTo(22.184, 7.098, 21.945, 6.9890003, 21.523, 7.051);
        ((GeneralPath) shape).curveTo(21.324001, 7.071, 21.043001, 7.039, 20.684, 6.9570003);
        ((GeneralPath) shape).curveTo(20.324, 6.86, 19.984, 6.828, 19.664, 6.8710003);
        ((GeneralPath) shape).curveTo(19.203, 6.9100003, 19.215, 7.09, 19.695, 7.4100003);
        ((GeneralPath) shape).curveTo(20.152, 7.727, 20.664, 7.879, 21.223, 7.86);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.914, 9.207);
        ((GeneralPath) shape).curveTo(25.352, 9.071, 25.504, 8.918, 25.362999, 8.757999);
        ((GeneralPath) shape).curveTo(25.223, 8.598, 25.022999, 8.5199995, 24.762, 8.5199995);
        ((GeneralPath) shape).curveTo(23.883, 8.5199995, 23.414, 8.598, 23.355, 8.757999);
        ((GeneralPath) shape).curveTo(23.293, 8.917999, 23.453, 9.058999, 23.831999, 9.179999);
        ((GeneralPath) shape).curveTo(24.234, 9.301, 24.593998, 9.308999, 24.914, 9.207);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.215, 7.891);
        ((GeneralPath) shape).curveTo(7.613, 8.032, 7.965, 7.981, 8.262, 7.739);
        ((GeneralPath) shape).curveTo(8.543, 7.52, 8.613, 7.348, 8.473001, 7.2269998);
        ((GeneralPath) shape).curveTo(8.375001, 7.1489997, 8.223001, 7.1169996, 8.023001, 7.141);
        ((GeneralPath) shape).curveTo(7.645001, 7.1569996, 7.422001, 7.1679997, 7.363001, 7.1679997);
        ((GeneralPath) shape).curveTo(7.262001, 7.1489997, 7.094001, 7.0899997, 6.855001, 6.989);
        ((GeneralPath) shape).curveTo(6.691001, 6.93, 6.555001, 6.93, 6.434001, 6.989);
        ((GeneralPath) shape).curveTo(6.273001, 7.0709996, 6.3120008, 7.219, 6.555001, 7.4379997);
        ((GeneralPath) shape).curveTo(6.7540007, 7.641, 6.973001, 7.7889996, 7.2150006, 7.891);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.523, 8.758);
        ((GeneralPath) shape).curveTo(12.523, 8.379001, 12.613, 8.059, 12.793, 7.8010006);
        ((GeneralPath) shape).curveTo(12.074, 7.8790007, 11.594, 7.950001, 11.3550005, 8.008);
        ((GeneralPath) shape).curveTo(10.8550005, 8.09, 10.512, 8.239, 10.332001, 8.461);
        ((GeneralPath) shape).curveTo(10.312, 8.559, 10.305, 8.660001, 10.305, 8.758);
        ((GeneralPath) shape).curveTo(10.285, 9.0, 10.293, 9.160001, 10.332001, 9.239);
        ((GeneralPath) shape).lineTo(10.695001, 10.5);
        ((GeneralPath) shape).lineTo(11.473001, 10.317);
        ((GeneralPath) shape).curveTo(11.555, 10.278001, 11.766001, 10.207001, 12.1050005, 10.110001);
        ((GeneralPath) shape).curveTo(12.383, 10.047001, 12.523001, 10.000001, 12.523001, 9.957001);
        ((GeneralPath) shape).lineTo(12.523001, 8.758);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.883, 10.59);
        ((GeneralPath) shape).curveTo(13.062, 10.59, 13.332001, 10.5, 13.691, 10.321);
        ((GeneralPath) shape).lineTo(12.523, 9.957);
        ((GeneralPath) shape).lineTo(12.132999, 10.051);
        ((GeneralPath) shape).lineTo(11.473, 10.321);
        ((GeneralPath) shape).lineTo(10.695, 10.5);
        ((GeneralPath) shape).lineTo(11.023, 10.59);
        ((GeneralPath) shape).lineTo(11.651999, 10.68);
        ((GeneralPath) shape).lineTo(11.863, 10.649);
        ((GeneralPath) shape).lineTo(12.882999, 10.59);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.523, 9.957);
        ((GeneralPath) shape).lineTo(13.035, 10.2);
        ((GeneralPath) shape).lineTo(13.695, 10.321);
        ((GeneralPath) shape).lineTo(13.695, 8.7);
        ((GeneralPath) shape).lineTo(13.844, 8.129);
        ((GeneralPath) shape).lineTo(12.793, 7.8009996);
        ((GeneralPath) shape).curveTo(12.633, 7.9379997, 12.543, 8.078, 12.523, 8.219);
        ((GeneralPath) shape).lineTo(12.465, 8.816999);
        ((GeneralPath) shape).lineTo(12.523, 9.957);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.422, 10.438);
        ((GeneralPath) shape).lineTo(18.223001, 10.051);
        ((GeneralPath) shape).curveTo(18.465002, 9.988999, 18.684002, 9.898999, 18.883001, 9.778);
        ((GeneralPath) shape).lineTo(17.652, 9.391);
        ((GeneralPath) shape).lineTo(15.043, 9.988999);
        ((GeneralPath) shape).lineTo(15.402, 10.167999);
        ((GeneralPath) shape).lineTo(16.422, 10.438);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.863, 9.0);
        ((GeneralPath) shape).lineTo(15.043, 9.989);
        ((GeneralPath) shape).lineTo(17.656, 9.387);
        ((GeneralPath) shape).lineTo(17.746, 8.367001);
        ((GeneralPath) shape).lineTo(16.812, 8.578001);
        ((GeneralPath) shape).curveTo(16.715, 8.617001, 16.543001, 8.641001, 16.305, 8.641001);
        ((GeneralPath) shape).curveTo(16.043001, 8.657001, 15.875, 8.68, 15.793, 8.700001);
        ((GeneralPath) shape).curveTo(15.434, 8.778001, 15.125, 8.879001, 14.863, 9.000001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.883, 9.778);
        ((GeneralPath) shape).lineTo(19.094, 8.821);
        ((GeneralPath) shape).lineTo(17.742, 8.367001);
        ((GeneralPath) shape).lineTo(17.625, 8.910001);
        ((GeneralPath) shape).lineTo(17.652, 9.391001);
        ((GeneralPath) shape).lineTo(18.074001, 9.602001);
        ((GeneralPath) shape).curveTo(18.215002, 9.660001, 18.484001, 9.719001, 18.883001, 9.778001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.113, 7.828);
        ((GeneralPath) shape).curveTo(17.516, 7.848, 17.723001, 7.719, 17.742, 7.438);
        ((GeneralPath) shape).curveTo(17.742, 7.2390003, 17.652, 7.059, 17.473001, 6.899);
        ((GeneralPath) shape).curveTo(17.293001, 6.7190003, 16.914001, 6.629, 16.332, 6.629);
        ((GeneralPath) shape).curveTo(16.215, 6.629, 15.953001, 6.7000003, 15.555, 6.84);
        ((GeneralPath) shape).lineTo(14.984, 7.078);
        ((GeneralPath) shape).lineTo(15.195001, 7.379);
        ((GeneralPath) shape).lineTo(15.945001, 7.86);
        ((GeneralPath) shape).lineTo(17.113, 7.828);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.945, 7.981);
        ((GeneralPath) shape).curveTo(10.061999, 7.86, 10.0859995, 7.739, 10.004, 7.617);
        ((GeneralPath) shape).curveTo(9.745999, 7.36, 9.523, 7.2070003, 9.344, 7.168);
        ((GeneralPath) shape).lineTo(8.504, 6.899);
        ((GeneralPath) shape).lineTo(8.292999, 7.5);
        ((GeneralPath) shape).curveTo(8.233999, 7.719, 8.214999, 7.879, 8.233999, 7.981);
        ((GeneralPath) shape).lineTo(8.261999, 8.071);
        ((GeneralPath) shape).lineTo(8.983999, 8.489);
        ((GeneralPath) shape).curveTo(9.183999, 8.59, 9.343999, 8.578, 9.464999, 8.457001);
        ((GeneralPath) shape).lineTo(9.944999, 7.981001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.234, 8.039);
        ((GeneralPath) shape).lineTo(8.3550005, 8.007999);
        ((GeneralPath) shape).curveTo(8.715, 7.8279996, 8.992001, 7.628999, 9.195001, 7.4099994);
        ((GeneralPath) shape).lineTo(9.375001, 7.1679993);
        ((GeneralPath) shape).lineTo(9.195001, 7.0199995);
        ((GeneralPath) shape).lineTo(8.832001, 6.7779994);
        ((GeneralPath) shape).lineTo(8.652, 6.7779994);
        ((GeneralPath) shape).lineTo(7.9020004, 7.0199995);
        ((GeneralPath) shape).lineTo(7.9920006, 7.3789997);
        ((GeneralPath) shape).lineTo(8.234, 8.039);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.285, 6.301);
        ((GeneralPath) shape).lineTo(13.934, 6.1800003);
        ((GeneralPath) shape).lineTo(14.082, 6.3910003);
        ((GeneralPath) shape).curveTo(14.401999, 6.8090005, 14.651999, 7.0200005, 14.832, 7.0200005);
        ((GeneralPath) shape).curveTo(14.914, 7.0200005, 14.984, 6.9380007, 15.043, 6.7780004);
        ((GeneralPath) shape).curveTo(15.203, 6.4810004, 15.285, 6.3210006, 15.285, 6.3010006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.215, 6.508);
        ((GeneralPath) shape).lineTo(13.785, 7.141);
        ((GeneralPath) shape).curveTo(13.965, 7.3209996, 14.184, 7.3479996, 14.445, 7.2269998);
        ((GeneralPath) shape).lineTo(14.922, 6.989);
        ((GeneralPath) shape).curveTo(14.984, 6.93, 14.824, 6.817, 14.445, 6.657);
        ((GeneralPath) shape).lineTo(13.934, 6.1800003);
        ((GeneralPath) shape).lineTo(13.664, 6.2390003);
        ((GeneralPath) shape).lineTo(13.214999, 6.5080004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_0_36

        // _0_0_0_36_0

        // _0_0_0_36_0_0

        // _0_0_0_36_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.832, 8.098);
        ((GeneralPath) shape).curveTo(5.832, 7.8599997, 5.633, 7.7499995, 5.2339997, 7.7699995);
        ((GeneralPath) shape).lineTo(4.7539997, 7.8279996);
        ((GeneralPath) shape).curveTo(4.6759996, 8.089999, 4.7149997, 8.301, 4.871, 8.457);
        ((GeneralPath) shape).curveTo(5.113, 8.719, 5.371, 8.75, 5.652, 8.547);
        ((GeneralPath) shape).curveTo(5.7929997, 8.45, 5.855, 8.301, 5.832, 8.098);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(7.674799919128418, 11.093000411987305), new Point2D.Double(9.524800300598145, 11.093000411987305), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_37

        // _0_0_0_37_0

        // _0_0_0_37_0_0

        // _0_0_0_37_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.723, 5.879);
        ((GeneralPath) shape).curveTo(13.723, 5.52, 13.422, 5.348, 12.823999, 5.367);
        ((GeneralPath) shape).lineTo(12.101999, 5.4570003);
        ((GeneralPath) shape).curveTo(12.004, 5.84, 12.073999, 6.168, 12.311999, 6.4500003);
        ((GeneralPath) shape).curveTo(12.671999, 6.828, 13.054999, 6.867, 13.452999, 6.5670004);
        ((GeneralPath) shape).curveTo(13.651999, 6.4300003, 13.745999, 6.2000003, 13.723, 5.879);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.88800048828125, 14.685999870300293), new Point2D.Double(22.613000869750977, 14.685999870300293), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_38

        // _0_0_0_38_0

        // _0_0_0_38_0_0

        // _0_0_0_38_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.594, 7.981);
        ((GeneralPath) shape).curveTo(11.594, 7.617, 11.312, 7.45, 10.754, 7.469);
        ((GeneralPath) shape).lineTo(10.094, 7.5899997);
        ((GeneralPath) shape).curveTo(10.073999, 7.6679997, 10.062, 7.7699995, 10.062, 7.8869996);
        ((GeneralPath) shape).curveTo(10.062, 8.129, 10.133, 8.328, 10.273001, 8.488999);
        ((GeneralPath) shape).curveTo(10.594001, 8.867, 10.945001, 8.917999, 11.324, 8.641);
        ((GeneralPath) shape).curveTo(11.523001, 8.5, 11.613, 8.278, 11.594001, 7.981);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.524999618530273, 11.227999687194824), new Point2D.Double(19.075000762939453, 11.227999687194824), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_39

        // _0_0_0_39_0

        // _0_0_0_39_0_0

        // _0_0_0_39_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.402, 10.559);
        ((GeneralPath) shape).curveTo(15.402, 10.278, 15.125, 10.149, 14.562, 10.168);
        ((GeneralPath) shape).lineTo(13.902, 10.231);
        ((GeneralPath) shape).curveTo(13.883, 10.309, 13.875, 10.399, 13.875, 10.5);
        ((GeneralPath) shape).curveTo(13.875, 10.7, 13.945, 10.86, 14.086, 10.981);
        ((GeneralPath) shape).curveTo(14.426001, 11.301, 14.773001, 11.34, 15.133, 11.102);
        ((GeneralPath) shape).curveTo(15.312, 10.981, 15.402, 10.801001, 15.402, 10.559);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(22.899999618530273, 6.948200225830078), new Point2D.Double(25.399999618530273, 6.948200225830078), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_40

        // _0_0_0_40_0

        // _0_0_0_40_0_0

        // _0_0_0_40_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.625, 8.61);
        ((GeneralPath) shape).curveTo(20.625, 8.25, 20.324, 8.078, 19.723, 8.098);
        ((GeneralPath) shape).lineTo(19.004, 8.219);
        ((GeneralPath) shape).curveTo(18.984, 8.316999, 18.973, 8.43, 18.973, 8.547);
        ((GeneralPath) shape).curveTo(18.991999, 8.809, 19.074, 9.0199995, 19.215, 9.18);
        ((GeneralPath) shape).curveTo(19.555, 9.578, 19.934, 9.629001, 20.355, 9.328);
        ((GeneralPath) shape).curveTo(20.555, 9.168, 20.645, 8.93, 20.625, 8.61);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(31.38800048828125, 10.114999771118164), new Point2D.Double(34.112998962402344, 10.114999771118164), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_41

        // _0_0_0_41_0

        // _0_0_0_41_0_0

        // _0_0_0_41_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.254, 10.289);
        ((GeneralPath) shape).curveTo(24.254, 10.007999, 23.984, 9.870999, 23.445, 9.870999);
        ((GeneralPath) shape).lineTo(22.785, 9.957);
        ((GeneralPath) shape).curveTo(22.766, 10.039, 22.754, 10.129, 22.754, 10.231);
        ((GeneralPath) shape).curveTo(22.754, 10.43, 22.824, 10.602, 22.965, 10.739);
        ((GeneralPath) shape).curveTo(23.305, 11.0390005, 23.652, 11.071, 24.016, 10.828);
        ((GeneralPath) shape).curveTo(24.195002, 10.707, 24.273, 10.528, 24.254002, 10.2890005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(37.70100021362305, 7.416999816894531), new Point2D.Double(40.20100021362305, 7.416999816894531), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_42

        // _0_0_0_42_0

        // _0_0_0_42_0_0

        // _0_0_0_42_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.375, 8.641);
        ((GeneralPath) shape).curveTo(24.574, 8.481, 24.664, 8.238999, 24.645, 7.9179997);
        ((GeneralPath) shape).curveTo(24.645, 7.5589995, 24.344, 7.391, 23.746, 7.41);
        ((GeneralPath) shape).curveTo(23.523, 7.41, 23.344, 7.43, 23.203001, 7.469);
        ((GeneralPath) shape).lineTo(23.055, 7.528);
        ((GeneralPath) shape).curveTo(23.035, 7.6289997, 23.023, 7.739, 23.023, 7.8599997);
        ((GeneralPath) shape).curveTo(23.023, 8.117, 23.094, 8.328, 23.234001, 8.488999);
        ((GeneralPath) shape).curveTo(23.594002, 8.867, 23.973001, 8.917999, 24.375002, 8.641);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(38.13800048828125, 11.277999877929688), new Point2D.Double(40.862998962402344, 11.277999877929688), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.426, 13.68);
        ((GeneralPath) shape).curveTo(14.0859995, 13.578, 14.504, 13.457001, 14.684, 13.321);
        ((GeneralPath) shape).curveTo(14.746, 13.278, 14.793, 13.149, 14.836, 12.93);
        ((GeneralPath) shape).curveTo(14.8550005, 12.809, 14.793, 12.739, 14.656, 12.719);
        ((GeneralPath) shape).lineTo(14.023, 12.719);
        ((GeneralPath) shape).curveTo(13.804999, 12.719, 13.495999, 12.641, 13.094, 12.481);
        ((GeneralPath) shape).curveTo(12.651999, 12.278, 12.363, 12.16, 12.223, 12.117);
        ((GeneralPath) shape).curveTo(12.004, 12.0, 11.8359995, 11.91, 11.714999, 11.848);
        ((GeneralPath) shape).curveTo(11.492, 11.7699995, 11.292999, 11.75, 11.112999, 11.789);
        ((GeneralPath) shape).curveTo(10.913999, 11.809, 10.874999, 11.981, 10.995999, 12.301);
        ((GeneralPath) shape).curveTo(11.093999, 12.578, 11.245999, 12.820999, 11.445, 13.0199995);
        ((GeneralPath) shape).curveTo(11.625, 13.179999, 11.945, 13.327999, 12.406, 13.469);
        ((GeneralPath) shape).curveTo(12.844, 13.629, 13.184, 13.7, 13.426001, 13.68);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.555, 8.25);
        ((GeneralPath) shape).curveTo(6.7339997, 8.188, 6.7619996, 8.129, 6.645, 8.071);
        ((GeneralPath) shape).curveTo(6.543, 8.008, 6.414, 7.981, 6.254, 7.981);
        ((GeneralPath) shape).curveTo(6.0940003, 7.981, 6.0620003, 8.039, 6.164, 8.16);
        ((GeneralPath) shape).curveTo(6.262, 8.278, 6.395, 8.309, 6.555, 8.25);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.844, 6.27);
        ((GeneralPath) shape).curveTo(17.164, 6.27, 17.375, 6.219, 17.473, 6.117);
        ((GeneralPath) shape).curveTo(17.574, 6.02, 17.535, 5.918, 17.355, 5.817);
        ((GeneralPath) shape).curveTo(16.996, 5.657, 16.594, 5.567, 16.156, 5.547);
        ((GeneralPath) shape).curveTo(15.273, 5.508, 14.703, 5.598, 14.445, 5.817);
        ((GeneralPath) shape).curveTo(14.363, 5.9179997, 14.516, 5.989, 14.8949995, 6.028);
        ((GeneralPath) shape).curveTo(15.355, 6.1099997, 15.594, 6.157, 15.613, 6.18);
        ((GeneralPath) shape).curveTo(15.695, 6.239, 16.102, 6.27, 16.844, 6.27);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.223, 6.719);
        ((GeneralPath) shape).curveTo(21.805, 6.7, 22.133, 6.6489997, 22.215, 6.571);
        ((GeneralPath) shape).curveTo(22.293, 6.4890003, 22.164, 6.387, 21.824, 6.27);
        ((GeneralPath) shape).curveTo(21.285, 6.071, 20.772999, 6.059, 20.293, 6.239);
        ((GeneralPath) shape).curveTo(20.054998, 6.3209996, 20.081999, 6.43, 20.383, 6.5709996);
        ((GeneralPath) shape).curveTo(20.664, 6.6879997, 20.945, 6.739, 21.223, 6.719);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.012, 8.551);
        ((GeneralPath) shape).curveTo(15.371, 8.469, 15.492, 8.36, 15.371, 8.219);
        ((GeneralPath) shape).curveTo(15.254001, 8.078, 15.004001, 8.0199995, 14.621, 8.039);
        ((GeneralPath) shape).curveTo(14.242001, 8.059, 14.133, 8.167999, 14.293, 8.367);
        ((GeneralPath) shape).curveTo(14.434, 8.589999, 14.676001, 8.648999, 15.012, 8.551);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.164, 7.02);
        ((GeneralPath) shape).lineTo(6.285, 6.867);
        ((GeneralPath) shape).curveTo(6.383, 6.77, 6.4919996, 6.727, 6.613, 6.75);
        ((GeneralPath) shape).lineTo(6.914, 6.809);
        ((GeneralPath) shape).curveTo(6.594, 6.668, 6.352, 6.617, 6.195, 6.657);
        ((GeneralPath) shape).curveTo(6.0740004, 6.68, 6.0350003, 6.75, 6.0740004, 6.867);
        ((GeneralPath) shape).lineTo(6.1640005, 7.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.695, 7.77);
        ((GeneralPath) shape).curveTo(4.7730002, 7.7269998, 4.875, 7.688, 4.992, 7.649);
        ((GeneralPath) shape).curveTo(5.074, 7.61, 5.0820003, 7.578, 5.0230002, 7.559);
        ((GeneralPath) shape).curveTo(4.965, 7.52, 4.8440003, 7.532, 4.664, 7.59);
        ((GeneralPath) shape).curveTo(4.5620003, 7.61, 4.5230002, 7.649, 4.543, 7.7070003);
        ((GeneralPath) shape).curveTo(4.5620003, 7.7700005, 4.6130004, 7.789, 4.695, 7.7700005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.445, 7.649);
        ((GeneralPath) shape).curveTo(5.543, 7.629, 5.586, 7.598, 5.5620003, 7.559);
        ((GeneralPath) shape).curveTo(5.543, 7.52, 5.492, 7.5, 5.4140005, 7.5);
        ((GeneralPath) shape).curveTo(5.3120003, 7.5, 5.3240004, 7.551, 5.4450006, 7.649);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.613, 8.578);
        ((GeneralPath) shape).curveTo(6.613, 8.481, 6.773, 8.43, 7.094, 8.43);
        ((GeneralPath) shape).curveTo(7.2929997, 8.43, 7.473, 8.457001, 7.633, 8.52);
        ((GeneralPath) shape).curveTo(7.434, 8.34, 7.2339997, 8.258, 7.035, 8.278001);
        ((GeneralPath) shape).curveTo(6.633, 8.317, 6.434, 8.399001, 6.434, 8.52);
        ((GeneralPath) shape).curveTo(6.434, 8.578, 6.465, 8.610001, 6.5230002, 8.610001);
        ((GeneralPath) shape).curveTo(6.5620003, 8.610001, 6.5940003, 8.598001, 6.6130004, 8.578001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.305, 7.321);
        ((GeneralPath) shape).lineTo(10.812, 7.321);
        ((GeneralPath) shape).curveTo(10.516001, 7.1800003, 10.285, 7.09, 10.125, 7.051);
        ((GeneralPath) shape).curveTo(9.766, 7.008, 9.516, 6.899, 9.375, 6.7190003);
        ((GeneralPath) shape).curveTo(9.195, 6.5000005, 8.902, 6.418, 8.504, 6.4810004);
        ((GeneralPath) shape).curveTo(8.304999, 6.5000005, 8.1449995, 6.5710006, 8.023, 6.688);
        ((GeneralPath) shape).lineTo(7.871, 6.8710003);
        ((GeneralPath) shape).lineTo(8.054999, 6.782);
        ((GeneralPath) shape).curveTo(8.433999, 6.6410003, 8.714999, 6.602, 8.8949995, 6.66);
        ((GeneralPath) shape).curveTo(9.073999, 6.719, 9.311999, 6.871, 9.613, 7.1099997);
        ((GeneralPath) shape).curveTo(9.934, 7.2499995, 10.164, 7.3209996, 10.305, 7.3209996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.012, 7.649);
        ((GeneralPath) shape).lineTo(12.371, 7.59);
        ((GeneralPath) shape).curveTo(12.633, 7.571, 12.812, 7.578, 12.9140005, 7.617);
        ((GeneralPath) shape).curveTo(13.094001, 7.6800003, 13.254001, 7.7070003, 13.395, 7.7070003);
        ((GeneralPath) shape).curveTo(13.352, 7.4500003, 13.191, 7.34, 12.9140005, 7.379);
        ((GeneralPath) shape).lineTo(12.012, 7.649);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.023, 8.008);
        ((GeneralPath) shape).lineTo(14.113, 7.918);
        ((GeneralPath) shape).curveTo(14.195, 7.879, 14.312, 7.86, 14.473, 7.86);
        ((GeneralPath) shape).lineTo(15.164, 7.86);
        ((GeneralPath) shape).curveTo(14.761999, 7.6800003, 14.452999, 7.629, 14.233999, 7.7070003);
        ((GeneralPath) shape).curveTo(14.093999, 7.7700005, 14.015999, 7.84, 13.992, 7.918);
        ((GeneralPath) shape).lineTo(14.023, 8.008);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.414, 9.149);
        ((GeneralPath) shape).curveTo(14.714999, 9.129, 14.832, 9.032001, 14.773, 8.848001);
        ((GeneralPath) shape).lineTo(14.414, 8.879001);
        ((GeneralPath) shape).curveTo(14.273, 8.899001, 14.214999, 8.950001, 14.233999, 9.032001);
        ((GeneralPath) shape).curveTo(14.272999, 9.129001, 14.331999, 9.168, 14.414, 9.149);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.375, 8.7);
        ((GeneralPath) shape).curveTo(15.492, 8.657, 15.703, 8.617, 16.004, 8.578);
        ((GeneralPath) shape).curveTo(16.164, 8.5390005, 16.125, 8.52, 15.882999, 8.52);
        ((GeneralPath) shape).curveTo(15.542999, 8.5390005, 15.311999, 8.571, 15.195, 8.610001);
        ((GeneralPath) shape).curveTo(15.132999, 8.649, 15.125, 8.68, 15.164, 8.700001);
        ((GeneralPath) shape).curveTo(15.184, 8.719001, 15.254, 8.719001, 15.375, 8.700001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.125, 5.91);
        ((GeneralPath) shape).lineTo(10.242, 5.758);
        ((GeneralPath) shape).lineTo(10.723, 5.547);
        ((GeneralPath) shape).curveTo(10.625, 5.528, 10.445, 5.528, 10.184, 5.547);
        ((GeneralPath) shape).curveTo(10.023, 5.567, 9.945, 5.6289997, 9.945, 5.7269998);
        ((GeneralPath) shape).curveTo(9.965, 5.8279996, 10.023, 5.891, 10.125, 5.91);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.734, 6.957);
        ((GeneralPath) shape).curveTo(18.973, 6.957, 19.164, 6.91, 19.304998, 6.809);
        ((GeneralPath) shape).curveTo(19.421999, 6.707, 19.624998, 6.641, 19.901999, 6.598);
        ((GeneralPath) shape).curveTo(19.464998, 6.578, 19.102, 6.578, 18.824, 6.598);
        ((GeneralPath) shape).curveTo(18.644999, 6.598, 18.543, 6.657, 18.522999, 6.778);
        ((GeneralPath) shape).curveTo(18.504, 6.8989997, 18.574, 6.957, 18.734, 6.957);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.793, 8.219);
        ((GeneralPath) shape).lineTo(18.883, 8.071);
        ((GeneralPath) shape).curveTo(18.965, 7.9890003, 19.102, 7.9500003, 19.305, 7.9500003);
        ((GeneralPath) shape).lineTo(19.844, 7.9500003);
        ((GeneralPath) shape).curveTo(19.262, 7.7070003, 18.883, 7.668, 18.703, 7.828);
        ((GeneralPath) shape).curveTo(18.581999, 7.9300003, 18.561998, 8.02, 18.644999, 8.102);
        ((GeneralPath) shape).curveTo(18.683998, 8.16, 18.734, 8.2, 18.793, 8.219);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.664, 7.528);
        ((GeneralPath) shape).lineTo(22.812, 7.3789997);
        ((GeneralPath) shape).curveTo(22.934, 7.297, 23.094, 7.258, 23.293001, 7.258);
        ((GeneralPath) shape).curveTo(24.035002, 7.258, 24.246, 7.239, 23.926, 7.2);
        ((GeneralPath) shape).curveTo(23.625, 7.18, 23.375, 7.1679997, 23.176, 7.1679997);
        ((GeneralPath) shape).curveTo(22.812, 7.1489997, 22.605001, 7.1679997, 22.543001, 7.2269998);
        ((GeneralPath) shape).curveTo(22.504002, 7.27, 22.516, 7.3279996, 22.574001, 7.41);
        ((GeneralPath) shape).curveTo(22.594002, 7.45, 22.625002, 7.489, 22.664001, 7.528);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.543, 9.93);
        ((GeneralPath) shape).lineTo(22.695, 9.809);
        ((GeneralPath) shape).curveTo(22.855, 9.727, 23.074, 9.7, 23.355, 9.719);
        ((GeneralPath) shape).lineTo(24.043, 9.75);
        ((GeneralPath) shape).curveTo(23.625, 9.489, 23.195, 9.41, 22.754, 9.508);
        ((GeneralPath) shape).curveTo(22.473, 9.571, 22.355, 9.660001, 22.395, 9.778001);
        ((GeneralPath) shape).lineTo(22.543001, 9.930001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.934, 10.051);
        ((GeneralPath) shape).curveTo(14.195, 9.988999, 14.375, 9.969, 14.473, 9.988999);
        ((GeneralPath) shape).curveTo(14.332, 9.808999, 14.202999, 9.749999, 14.0859995, 9.808999);
        ((GeneralPath) shape).curveTo(14.004, 9.827999, 13.952999, 9.878999, 13.933999, 9.956999);
        ((GeneralPath) shape).lineTo(13.933999, 10.050999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_63

        // _0_0_0_63_0

        // _0_0_0_63_0_0

        // _0_0_0_63_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.355, 13.649);
        ((GeneralPath) shape).lineTo(14.561999, 13.438);
        ((GeneralPath) shape).lineTo(14.292999, 13.469);
        ((GeneralPath) shape).curveTo(14.132999, 13.59, 13.983999, 13.68, 13.843999, 13.739);
        ((GeneralPath) shape).curveTo(13.581999, 13.860001, 13.261999, 13.867001, 12.882998, 13.77);
        ((GeneralPath) shape).curveTo(12.542998, 13.668, 12.311998, 13.52, 12.194999, 13.317);
        ((GeneralPath) shape).curveTo(12.011999, 12.938001, 11.874999, 12.700001, 11.772999, 12.598001);
        ((GeneralPath) shape).curveTo(11.132998, 11.957001, 10.694999, 11.5390005, 10.452999, 11.34);
        ((GeneralPath) shape).curveTo(10.233999, 11.157001, 10.054999, 10.938, 9.914, 10.68);
        ((GeneralPath) shape).lineTo(9.792999, 10.348001);
        ((GeneralPath) shape).lineTo(9.554999, 10.532001);
        ((GeneralPath) shape).lineTo(9.733999, 10.918);
        ((GeneralPath) shape).curveTo(9.914, 11.321, 10.214999, 11.66, 10.632999, 11.938);
        ((GeneralPath) shape).curveTo(10.914, 12.141, 11.101999, 12.289, 11.202999, 12.391);
        ((GeneralPath) shape).curveTo(11.362999, 12.551, 11.522999, 12.801, 11.683999, 13.141);
        ((GeneralPath) shape).curveTo(11.862999, 13.481, 12.054999, 13.719, 12.253999, 13.86);
        ((GeneralPath) shape).curveTo(12.452999, 14.0, 12.722999, 14.089999, 13.061998, 14.129);
        ((GeneralPath) shape).curveTo(13.522999, 14.188, 13.952998, 14.028, 14.354999, 13.649);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(15.737000465393066, 4.389599800109863), new Point2D.Double(24.062000274658203, 4.389599800109863), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_64

        // _0_0_0_64_0

        // _0_0_0_64_0_0

        // _0_0_0_64_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.234, 12.09);
        ((GeneralPath) shape).lineTo(19.305, 11.7);
        ((GeneralPath) shape).curveTo(18.703001, 11.66, 18.164, 11.668, 17.684, 11.731);
        ((GeneralPath) shape).curveTo(17.465, 11.75, 17.133, 11.758, 16.695, 11.758);
        ((GeneralPath) shape).curveTo(16.316, 11.758, 16.055, 11.778001, 15.914, 11.821);
        ((GeneralPath) shape).curveTo(15.594, 11.918, 15.113, 12.219, 14.473, 12.719);
        ((GeneralPath) shape).curveTo(14.035, 13.078, 13.554999, 13.257999, 13.035, 13.257999);
        ((GeneralPath) shape).curveTo(12.914, 13.257999, 12.882999, 13.308999, 12.945, 13.41);
        ((GeneralPath) shape).lineTo(13.061999, 13.559);
        ((GeneralPath) shape).lineTo(13.515999, 13.532);
        ((GeneralPath) shape).curveTo(13.854999, 13.45, 14.175999, 13.289, 14.472999, 13.051);
        ((GeneralPath) shape).curveTo(15.214998, 12.41, 15.804998, 12.089999, 16.245998, 12.089999);
        ((GeneralPath) shape).lineTo(17.234, 12.089999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(21.350000381469727, 3.7704999446868896), new Point2D.Double(31.950000762939453, 3.7704999446868896), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_65

        // _0_0_0_65_0

        // _0_0_0_65_0_0

        // _0_0_0_65_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.992, 12.418);
        ((GeneralPath) shape).curveTo(17.453001, 12.258, 17.535, 12.149, 17.234001, 12.09);
        ((GeneralPath) shape).curveTo(17.074001, 12.051001, 16.852001, 12.059, 16.574001, 12.117001);
        ((GeneralPath) shape).curveTo(16.254002, 12.160001, 16.035002, 12.18, 15.914001, 12.18);
        ((GeneralPath) shape).curveTo(15.633001, 12.141001, 15.203001, 11.891001, 14.625002, 11.43);
        ((GeneralPath) shape).curveTo(14.402002, 11.25, 13.812002, 10.950001, 12.855001, 10.528);
        ((GeneralPath) shape).curveTo(12.633001, 10.41, 12.414001, 10.399, 12.195002, 10.5);
        ((GeneralPath) shape).lineTo(11.953002, 10.68);
        ((GeneralPath) shape).lineTo(12.254002, 10.68);
        ((GeneralPath) shape).curveTo(12.492002, 10.700001, 12.703002, 10.758, 12.883001, 10.860001);
        ((GeneralPath) shape).curveTo(13.184001, 11.0390005, 13.645001, 11.239, 14.262001, 11.457001);
        ((GeneralPath) shape).curveTo(14.363001, 11.52, 14.562001, 11.660001, 14.863001, 11.879001);
        ((GeneralPath) shape).curveTo(15.1640005, 12.098001, 15.453001, 12.250001, 15.734001, 12.328001);
        ((GeneralPath) shape).curveTo(16.195002, 12.489001, 16.613, 12.520001, 16.992, 12.418001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.687999725341797, 5.709000110626221), new Point2D.Double(28.711999893188477, 5.709000110626221), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_66

        // _0_0_0_66_0

        // _0_0_0_66_0_0

        // _0_0_0_66_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.105, 11.7);
        ((GeneralPath) shape).curveTo(15.382999, 11.7, 15.792999, 11.7699995, 16.331999, 11.91);
        ((GeneralPath) shape).lineTo(16.695, 11.91);
        ((GeneralPath) shape).curveTo(16.234, 11.649, 15.811999, 11.5199995, 15.434, 11.5199995);
        ((GeneralPath) shape).curveTo(14.832, 11.5199995, 14.246, 11.738999, 13.664, 12.179999);
        ((GeneralPath) shape).curveTo(13.304999, 12.457, 12.676, 12.598, 11.773, 12.598);
        ((GeneralPath) shape).curveTo(11.516, 12.598, 11.223, 12.528, 10.901999, 12.386999);
        ((GeneralPath) shape).lineTo(10.516, 12.206999);
        ((GeneralPath) shape).lineTo(10.632999, 12.476999);
        ((GeneralPath) shape).lineTo(10.901999, 12.718999);
        ((GeneralPath) shape).curveTo(11.1449995, 12.878999, 11.433999, 12.956999, 11.773, 12.956999);
        ((GeneralPath) shape).curveTo(12.632999, 12.956999, 13.312, 12.777999, 13.812, 12.417999);
        ((GeneralPath) shape).curveTo(14.434, 11.938, 14.863, 11.699999, 15.1050005, 11.699999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(17.312000274658203, 4.400400161743164), new Point2D.Double(27.58799934387207, 4.400400161743164), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_67

        // _0_0_0_67_0

        // _0_0_0_67_0_0

        // _0_0_0_67_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.555, 14.551);
        ((GeneralPath) shape).curveTo(15.773001, 14.789, 15.984, 14.738999, 16.184, 14.398999);
        ((GeneralPath) shape).lineTo(16.062, 14.398999);
        ((GeneralPath) shape).curveTo(15.965, 14.398999, 15.832001, 14.316999, 15.676001, 14.157);
        ((GeneralPath) shape).curveTo(15.492001, 13.957, 15.383, 13.726999, 15.344001, 13.469);
        ((GeneralPath) shape).curveTo(15.305001, 13.227, 15.445001, 12.981, 15.762001, 12.719);
        ((GeneralPath) shape).curveTo(15.945001, 12.559, 16.195002, 12.348, 16.516, 12.09);
        ((GeneralPath) shape).curveTo(17.016, 11.547, 17.293001, 11.110001, 17.355001, 10.77);
        ((GeneralPath) shape).curveTo(17.414001, 10.450001, 17.285002, 10.219001, 16.965002, 10.078);
        ((GeneralPath) shape).lineTo(17.445002, 9.957);
        ((GeneralPath) shape).lineTo(17.535002, 9.778);
        ((GeneralPath) shape).curveTo(17.176003, 9.84, 16.895002, 9.93, 16.695002, 10.051);
        ((GeneralPath) shape).curveTo(16.574001, 10.11, 16.566002, 10.2, 16.664001, 10.321);
        ((GeneralPath) shape).curveTo(16.844002, 10.52, 16.945002, 10.668, 16.965002, 10.77);
        ((GeneralPath) shape).curveTo(17.004002, 10.950001, 16.926003, 11.149, 16.723001, 11.371);
        ((GeneralPath) shape).curveTo(16.664001, 11.450001, 16.395002, 11.719, 15.914001, 12.18);
        ((GeneralPath) shape).curveTo(15.574001, 12.461, 15.363002, 12.629001, 15.285002, 12.692);
        ((GeneralPath) shape).curveTo(15.164001, 12.7890005, 15.066002, 12.989, 14.984002, 13.2890005);
        ((GeneralPath) shape).curveTo(14.883002, 13.610001, 14.953002, 13.910001, 15.195003, 14.192);
        ((GeneralPath) shape).curveTo(15.293002, 14.348001, 15.414002, 14.469001, 15.555002, 14.551001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(24.687999725341797, 4.400899887084961), new Point2D.Double(29.01099967956543, 4.400899887084961), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_68

        // _0_0_0_68_0

        // _0_0_0_68_0_0

        // _0_0_0_68_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.973, 12.899);
        ((GeneralPath) shape).curveTo(19.316, 13.078, 19.515999, 12.969, 19.574, 12.571);
        ((GeneralPath) shape).curveTo(19.215, 12.45, 18.953, 12.2890005, 18.793, 12.09);
        ((GeneralPath) shape).curveTo(18.594, 11.809, 18.144999, 11.547, 17.445, 11.309);
        ((GeneralPath) shape).curveTo(17.145, 11.188, 16.871, 11.028, 16.633, 10.828);
        ((GeneralPath) shape).curveTo(16.352, 10.586, 16.133, 10.407, 15.973, 10.2890005);
        ((GeneralPath) shape).curveTo(15.573999, 10.028001, 15.164, 9.899, 14.742, 9.899);
        ((GeneralPath) shape).curveTo(14.601999, 9.899, 14.573999, 9.797, 14.651999, 9.598001);
        ((GeneralPath) shape).curveTo(14.695, 9.516001, 14.742, 9.426001, 14.804999, 9.328);
        ((GeneralPath) shape).lineTo(14.382999, 9.481);
        ((GeneralPath) shape).curveTo(14.344, 9.578, 14.323999, 9.688, 14.323999, 9.809);
        ((GeneralPath) shape).curveTo(14.344, 10.028, 14.473, 10.141, 14.714999, 10.141);
        ((GeneralPath) shape).curveTo(14.973, 10.141, 15.194999, 10.179999, 15.370999, 10.257999);
        ((GeneralPath) shape).curveTo(15.473, 10.316999, 15.683999, 10.457, 16.004, 10.679999);
        ((GeneralPath) shape).curveTo(16.184, 10.796999, 16.434, 10.988999, 16.754, 11.249999);
        ((GeneralPath) shape).curveTo(17.055, 11.449999, 17.362999, 11.609999, 17.684, 11.726999);
        ((GeneralPath) shape).curveTo(18.184, 11.909999, 18.613, 12.301, 18.973, 12.898999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(23.63800048828125, 6.205100059509277), new Point2D.Double(32.362998962402344, 6.205100059509277), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_69

        // _0_0_0_69_0

        // _0_0_0_69_0_0

        // _0_0_0_69_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.242, 10.469);
        ((GeneralPath) shape).curveTo(13.082, 10.387, 12.875, 10.227, 12.613, 9.989);
        ((GeneralPath) shape).curveTo(12.352, 9.75, 12.055, 9.559, 11.715, 9.418);
        ((GeneralPath) shape).curveTo(11.332, 9.258, 11.012, 9.157001, 10.754, 9.117001);
        ((GeneralPath) shape).lineTo(10.151999, 9.117001);
        ((GeneralPath) shape).lineTo(10.273, 9.301001);
        ((GeneralPath) shape).curveTo(10.473, 9.5390005, 10.922, 9.739, 11.625, 9.899);
        ((GeneralPath) shape).curveTo(11.945, 10.0, 12.164, 10.078, 12.285, 10.141);
        ((GeneralPath) shape).curveTo(12.401999, 10.219, 12.516, 10.348, 12.613, 10.528);
        ((GeneralPath) shape).curveTo(12.715, 10.707, 13.074, 10.816999, 13.691, 10.86);
        ((GeneralPath) shape).curveTo(14.215, 10.917999, 14.652, 10.917999, 15.012, 10.86);
        ((GeneralPath) shape).curveTo(15.4140005, 10.801, 15.324, 10.726999, 14.742, 10.648999);
        ((GeneralPath) shape).curveTo(14.1449995, 10.706999, 13.6449995, 10.648999, 13.242, 10.468999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.687999725341797, 8.113300323486328), new Point2D.Double(25.11199951171875, 8.113300323486328), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_70

        // _0_0_0_70_0

        // _0_0_0_70_0_0

        // _0_0_0_70_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.703, 12.0);
        ((GeneralPath) shape).curveTo(13.102, 11.879, 13.473, 11.727, 13.812, 11.547);
        ((GeneralPath) shape).curveTo(13.9140005, 11.489, 14.145, 11.328, 14.504001, 11.067);
        ((GeneralPath) shape).curveTo(14.723001, 10.907001, 14.973001, 10.809, 15.254001, 10.77);
        ((GeneralPath) shape).lineTo(16.336, 10.586);
        ((GeneralPath) shape).curveTo(16.754, 10.528001, 17.094, 10.508, 17.355, 10.528001);
        ((GeneralPath) shape).lineTo(18.612999, 10.633);
        ((GeneralPath) shape).curveTo(18.254, 10.59, 17.883, 10.465, 17.504, 10.258);
        ((GeneralPath) shape).curveTo(17.102, 10.0390005, 16.184, 10.168, 14.746, 10.649);
        ((GeneralPath) shape).curveTo(14.383, 10.766, 13.9140005, 11.067, 13.332001, 11.547);
        ((GeneralPath) shape).curveTo(13.133, 11.727, 12.863001, 11.856, 12.523001, 11.938);
        ((GeneralPath) shape).lineTo(12.074, 11.995999);
        ((GeneralPath) shape).curveTo(12.074, 12.098, 12.285001, 12.098, 12.703, 11.999999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.913000106811523, 6.273900032043457), new Point2D.Double(31.08799934387207, 6.273900032043457), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_71

        // _0_0_0_71_0

        // _0_0_0_71_0_0

        // _0_0_0_71_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.973, 12.0);
        ((GeneralPath) shape).lineTo(18.223, 12.36);
        ((GeneralPath) shape).curveTo(17.445, 12.757999, 16.965, 12.917999, 16.785, 12.839999);
        ((GeneralPath) shape).curveTo(16.421999, 12.577999, 16.145, 12.409999, 15.945, 12.327999);
        ((GeneralPath) shape).curveTo(14.945, 12.050999, 14.414, 11.909999, 14.355, 11.909999);
        ((GeneralPath) shape).curveTo(14.054999, 11.870999, 13.723, 11.788999, 13.363, 11.667999);
        ((GeneralPath) shape).curveTo(12.922, 11.507999, 12.6449995, 11.351999, 12.523, 11.188);
        ((GeneralPath) shape).curveTo(12.422, 11.051, 12.203, 10.899, 11.863, 10.738999);
        ((GeneralPath) shape).curveTo(11.401999, 10.558999, 11.1449995, 10.45, 11.082, 10.41);
        ((GeneralPath) shape).lineTo(10.304999, 9.957);
        ((GeneralPath) shape).lineTo(10.034999, 10.141);
        ((GeneralPath) shape).lineTo(10.843999, 10.441999);
        ((GeneralPath) shape).curveTo(11.425999, 10.679999, 11.862999, 10.917999, 12.163999, 11.16);
        ((GeneralPath) shape).curveTo(12.784999, 11.641, 13.604999, 11.969, 14.624998, 12.149);
        ((GeneralPath) shape).curveTo(15.042998, 12.231, 15.444998, 12.360001, 15.823998, 12.5390005);
        ((GeneralPath) shape).curveTo(16.022999, 12.641001, 16.284998, 12.778001, 16.604998, 12.957001);
        ((GeneralPath) shape).curveTo(16.964998, 13.157001, 17.593998, 12.977001, 18.491997, 12.418001);
        ((GeneralPath) shape).lineTo(19.124996, 12.117002);
        ((GeneralPath) shape).lineTo(18.972996, 12.000002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.5, 5.634799957275391), new Point2D.Double(31.625999450683594, 5.634799957275391), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_72

        // _0_0_0_72_0

        // _0_0_0_72_0_0

        // _0_0_0_72_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.523, 11.188);
        ((GeneralPath) shape).curveTo(12.664, 11.167999, 13.242, 11.257999, 14.262, 11.457);
        ((GeneralPath) shape).curveTo(14.562, 11.539, 14.9140005, 11.559, 15.312, 11.5199995);
        ((GeneralPath) shape).curveTo(15.715, 11.499999, 16.043001, 11.429999, 16.305, 11.308999);
        ((GeneralPath) shape).curveTo(16.746, 11.128999, 17.195, 11.077999, 17.656, 11.156999);
        ((GeneralPath) shape).lineTo(18.312, 11.249999);
        ((GeneralPath) shape).curveTo(18.133, 11.128999, 17.883, 11.027999, 17.562, 10.949999);
        ((GeneralPath) shape).curveTo(17.363, 10.886999, 17.082, 10.917999, 16.723, 11.038999);
        ((GeneralPath) shape).curveTo(16.664, 11.058999, 16.352, 11.167998, 15.792999, 11.366999);
        ((GeneralPath) shape).curveTo(15.573999, 11.449999, 15.164, 11.437999, 14.561999, 11.339998);
        ((GeneralPath) shape).curveTo(13.702999, 11.199998, 13.1449995, 11.116999, 12.882999, 11.097999);
        ((GeneralPath) shape).curveTo(12.401999, 11.077998, 12.011999, 11.116999, 11.714999, 11.218999);
        ((GeneralPath) shape).curveTo(11.473, 11.335999, 11.292999, 11.417999, 11.171999, 11.456999);
        ((GeneralPath) shape).lineTo(11.772999, 11.515999);
        ((GeneralPath) shape).lineTo(12.522999, 11.187999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(18.424999237060547, 6.084000110626221), new Point2D.Double(30.274999618530273, 6.084000110626221), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.6f, 0, 0, -0.6f, 0.13368f, 14.879f)));
        g.fill(shape);

        // _0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.285, 10.11);
        ((GeneralPath) shape).lineTo(28.152, 10.11);
        ((GeneralPath) shape).curveTo(28.195, 9.988999, 28.215, 9.828, 28.215, 9.629);
        ((GeneralPath) shape).curveTo(28.215, 8.167999, 26.844, 6.93, 24.102001, 5.91);
        ((GeneralPath) shape).curveTo(21.363, 4.891, 18.055, 4.3789997, 14.172001, 4.3789997);
        ((GeneralPath) shape).curveTo(10.293001, 4.3789997, 6.9840007, 4.891, 4.2420006, 5.91);
        ((GeneralPath) shape).curveTo(1.5040007, 6.93, 0.13300037, 8.167999, 0.13300037, 9.629);
        ((GeneralPath) shape).lineTo(0.19100037, 10.11);
        ((GeneralPath) shape).lineTo(1.2110003, 10.11);
        ((GeneralPath) shape).lineTo(1.2110003, 9.839999);
        ((GeneralPath) shape).curveTo(1.2110003, 8.539, 2.4840002, 7.4379992, 5.0230002, 6.538999);
        ((GeneralPath) shape).curveTo(7.5620003, 5.616999, 10.633, 5.156999, 14.234001, 5.156999);
        ((GeneralPath) shape).curveTo(17.852001, 5.156999, 20.934002, 5.616999, 23.473001, 6.538999);
        ((GeneralPath) shape).curveTo(26.016, 7.4379992, 27.285002, 8.539, 27.285002, 9.839999);
        ((GeneralPath) shape).lineTo(27.285002, 10.11);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        // _0_0_1

        // _0_0_1_0

        // _0_0_1_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_1_0_0_0

        // _0_0_1_0_0_0_0

        // _0_0_1_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.82, 13.859);
        ((GeneralPath) shape).lineTo(27.941, 13.879001);
        ((GeneralPath) shape).curveTo(26.973, 11.469001, 25.168, 9.570001, 22.531, 8.195001);
        ((GeneralPath) shape).curveTo(19.836, 6.7810006, 16.84, 6.2030005, 13.551001, 6.4570007);
        ((GeneralPath) shape).curveTo(10.242001, 6.719001, 7.3630004, 7.7660007, 4.918, 9.602001);
        ((GeneralPath) shape).curveTo(2.492, 11.418001, 1.0200002, 13.5980015, 0.4960003, 16.145);
        ((GeneralPath) shape).lineTo(0.7030003, 16.07);
        ((GeneralPath) shape).curveTo(1.4340003, 15.41, 3.0390003, 14.785, 5.5200005, 14.188);
        ((GeneralPath) shape).curveTo(8.02, 13.613, 10.906, 13.195, 14.18, 12.941);
        ((GeneralPath) shape).curveTo(17.348, 12.691, 20.195, 12.66, 22.715, 12.844);
        ((GeneralPath) shape).curveTo(25.215, 13.007999, 26.918, 13.348, 27.82, 13.859);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD9D9D9));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_1

        // _0_0_1_0_0_0_0_0_0_1_0

        // _0_0_1_0_0_0_0_0_0_1_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.383, 12.75);
        ((GeneralPath) shape).lineTo(14.9609995, 6.41);
        ((GeneralPath) shape).lineTo(13.551, 6.457);
        ((GeneralPath) shape).curveTo(12.992, 6.5039997, 12.445, 6.574, 11.914, 6.6759996);
        ((GeneralPath) shape).curveTo(11.261999, 6.8279996, 10.530999, 7.0859995, 9.715, 7.4489994);
        ((GeneralPath) shape).curveTo(8.883, 7.8359995, 8.195, 8.242, 7.6450005, 8.667999);
        ((GeneralPath) shape).curveTo(5.9020004, 10.007999, 4.5940003, 11.452999, 3.7110004, 13.007999);
        ((GeneralPath) shape).curveTo(3.2700005, 13.780999, 3.0120006, 14.426, 2.9300003, 14.933999);
        ((GeneralPath) shape).lineTo(4.4880004, 14.48);
        ((GeneralPath) shape).curveTo(7.1800003, 13.745999, 10.41, 13.233999, 14.176001, 12.938);
        ((GeneralPath) shape).lineTo(17.383001, 12.75);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-22.461000442504883, -32.38399887084961), new Point2D.Double(-6.760900020599365, -32.38399887084961), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(0.59801f, -0.048714f, 0.048714f, 0.59801f, 19.735f, 29.254f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_2

        // _0_0_1_0_0_0_0_0_0_2_0

        // _0_0_1_0_0_0_0_0_0_2_0_0

        // _0_0_1_0_0_0_0_0_0_2_0_0_0

        // _0_0_1_0_0_0_0_0_0_2_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_2_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_2_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_2_0_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_2_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.418, 12.867);
        ((GeneralPath) shape).curveTo(24.23, 12.964999, 25.66, 13.155999, 26.703, 13.434);
        ((GeneralPath) shape).curveTo(26.48, 12.891, 26.155998, 12.324, 25.73, 11.734);
        ((GeneralPath) shape).curveTo(24.879, 10.617001, 23.629, 9.523001, 21.98, 8.445);
        ((GeneralPath) shape).curveTo(20.715, 7.6449995, 19.129, 7.0039997, 17.227, 6.5309997);
        ((GeneralPath) shape).lineTo(15.804999, 6.4339995);
        ((GeneralPath) shape).curveTo(18.265999, 7.1019993, 20.059, 8.214999, 21.184, 9.773);
        ((GeneralPath) shape).curveTo(21.695, 10.457, 22.039, 11.108999, 22.207, 11.738);
        ((GeneralPath) shape).curveTo(22.316, 12.074, 22.383001, 12.449, 22.418001, 12.867);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x595959));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_3

        // _0_0_1_0_0_0_0_0_0_3_0

        // _0_0_1_0_0_0_0_0_0_3_0_0

        // _0_0_1_0_0_0_0_0_0_3_0_0_0

        // _0_0_1_0_0_0_0_0_0_3_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_3_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_3_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_3_0_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_3_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.535, 8.043);
        ((GeneralPath) shape).curveTo(5.68, 8.91, 4.133, 10.055, 2.8979998, 11.477);
        ((GeneralPath) shape).curveTo(1.6449997, 12.898001, 0.84399986, 14.453, 0.4959998, 16.145);
        ((GeneralPath) shape).lineTo(0.70299983, 16.07);
        ((GeneralPath) shape).lineTo(1.1289998, 15.766);
        ((GeneralPath) shape).curveTo(1.3709998, 14.785, 1.8159997, 13.766, 2.4529998, 12.715);
        ((GeneralPath) shape).curveTo(3.699, 10.672, 5.3949995, 9.113, 7.535, 8.043);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_4

        // _0_0_1_0_0_0_0_0_0_4_0

        // _0_0_1_0_0_0_0_0_0_4_0_0

        // _0_0_1_0_0_0_0_0_0_4_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.219, 18.984);
        ((GeneralPath) shape).curveTo(26.793, 17.781, 28.027, 16.48, 27.918, 15.0859995);
        ((GeneralPath) shape).curveTo(27.804998, 13.667999, 26.387, 12.573999, 23.655998, 11.804999);
        ((GeneralPath) shape).curveTo(20.948997, 11.016, 17.718998, 10.765999, 13.968998, 11.058999);
        ((GeneralPath) shape).curveTo(10.241998, 11.351999, 7.089998, 12.098, 4.515998, 13.304999);
        ((GeneralPath) shape).curveTo(1.9609978, 14.487999, 0.7379978, 15.785, 0.85199785, 17.203);
        ((GeneralPath) shape).curveTo(0.9609978, 18.598, 2.3669977, 19.690998, 5.0779977, 20.48);
        ((GeneralPath) shape).curveTo(7.8089976, 21.272999, 11.038998, 21.52, 14.765997, 21.23);
        ((GeneralPath) shape).curveTo(18.495996, 20.938, 21.644997, 20.188, 24.218998, 18.984);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(0.7997999787330627, -8.600099563598633), new Point2D.Double(46.04999923706055, -8.600099563598633), new float[]{0, 1}, new Color[]{new Color(0x7D7D7D), new Color(0xD4D4D4)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.332, 15.414);
        ((GeneralPath) shape).lineTo(27.465, 15.48);
        ((GeneralPath) shape).curveTo(27.383, 16.73, 26.121, 17.883, 23.676, 18.938);
        ((GeneralPath) shape).curveTo(21.25, 19.987999, 18.293001, 20.652, 14.801001, 20.926);
        ((GeneralPath) shape).curveTo(11.332001, 21.195, 8.320001, 21.0, 5.7580004, 20.34);
        ((GeneralPath) shape).curveTo(3.1800003, 19.68, 1.7540002, 18.738, 1.4770002, 17.516);
        ((GeneralPath) shape).lineTo(0.4610002, 17.594);
        ((GeneralPath) shape).curveTo(0.8830002, 18.926, 2.4570003, 19.945, 5.184, 20.656);
        ((GeneralPath) shape).curveTo(7.9449997, 21.359, 11.141, 21.574, 14.77, 21.289);
        ((GeneralPath) shape).curveTo(18.418001, 21.004, 21.543, 20.296999, 24.145, 19.171999);
        ((GeneralPath) shape).curveTo(26.723, 18.046999, 28.121, 16.793, 28.332, 15.414);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_6

        // _0_0_1_0_0_0_0_0_0_6_0

        // _0_0_1_0_0_0_0_0_0_6_0_0

        // _0_0_1_0_0_0_0_0_0_6_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.109, 13.121);
        ((GeneralPath) shape).curveTo(24.835999, 12.516001, 23.699, 12.055, 22.688, 11.7300005);
        ((GeneralPath) shape).curveTo(20.836, 11.094001, 19.059, 10.832001, 17.362999, 10.945001);
        ((GeneralPath) shape).curveTo(12.187999, 11.2300005, 8.284999, 11.957001, 5.647999, 13.125001);
        ((GeneralPath) shape).curveTo(4.3669987, 13.707001, 3.3519988, 14.297001, 2.593999, 14.898001);
        ((GeneralPath) shape).lineTo(1.839999, 15.621);
        ((GeneralPath) shape).curveTo(1.780999, 15.906, 1.9179989, 16.246, 2.249999, 16.641);
        ((GeneralPath) shape).curveTo(2.538999, 17.0, 2.901999, 17.293001, 3.343999, 17.52);
        ((GeneralPath) shape).curveTo(3.636999, 17.676, 4.249999, 17.859001, 5.190999, 18.066);
        ((GeneralPath) shape).curveTo(6.132999, 18.293, 6.776999, 18.492, 7.132999, 18.668);
        ((GeneralPath) shape).curveTo(8.280999, 19.258, 9.655999, 19.522999, 11.257999, 19.456999);
        ((GeneralPath) shape).curveTo(11.636999, 19.445, 12.5859995, 19.401999, 14.105, 19.324);
        ((GeneralPath) shape).curveTo(15.382999, 19.265999, 16.387, 19.234, 17.109, 19.237999);
        ((GeneralPath) shape).curveTo(18.390999, 19.237999, 20.012, 18.811998, 21.973, 17.956999);
        ((GeneralPath) shape).curveTo(23.66, 17.203, 24.835999, 16.609, 25.504, 16.175999);
        ((GeneralPath) shape).curveTo(26.137, 15.784999, 26.555, 15.261999, 26.765999, 14.601998);
        ((GeneralPath) shape).curveTo(27.008, 13.862998, 26.789, 13.366999, 26.109, 13.120998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(2.6078999042510986, -9.976099967956543), new Point2D.Double(44.382999420166016, -9.976099967956543), new float[]{0, 1}, new Color[]{new Color(0xA67C3C), new Color(0x85612D)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.227, 16.328);
        ((GeneralPath) shape).curveTo(6.34, 16.219, 6.379, 16.078, 6.3440003, 15.897999);
        ((GeneralPath) shape).curveTo(6.3120003, 15.722999, 6.2230005, 15.597999, 6.0740004, 15.530999);
        ((GeneralPath) shape).curveTo(5.9730005, 15.495999, 5.7850003, 15.511999, 5.5080004, 15.573999);
        ((GeneralPath) shape).curveTo(5.156, 15.679999, 4.8870006, 15.742, 4.7070003, 15.757999);
        ((GeneralPath) shape).curveTo(4.129, 15.801, 4.0200005, 16.050999, 4.3750005, 16.504);
        ((GeneralPath) shape).curveTo(4.5550003, 16.711, 4.8320003, 16.801, 5.2110004, 16.77);
        ((GeneralPath) shape).curveTo(5.609, 16.738, 5.9490004, 16.594, 6.227, 16.328001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.359, 16.965);
        ((GeneralPath) shape).curveTo(7.2380004, 16.914, 7.059, 16.945, 6.828, 17.066);
        ((GeneralPath) shape).lineTo(6.254, 17.441);
        ((GeneralPath) shape).lineTo(6.4220004, 17.668);
        ((GeneralPath) shape).curveTo(6.5550003, 17.82, 6.6910005, 17.866999, 6.8240004, 17.816);
        ((GeneralPath) shape).lineTo(7.965, 17.367);
        ((GeneralPath) shape).curveTo(8.004, 17.363, 7.8050003, 17.230001, 7.359, 16.965);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.574, 15.555);
        ((GeneralPath) shape).curveTo(4.367, 15.492001, 4.137, 15.512, 3.8869998, 15.609);
        ((GeneralPath) shape).curveTo(3.7069998, 15.6640005, 3.656, 15.75, 3.7229998, 15.863);
        ((GeneralPath) shape).lineTo(3.8869998, 16.031);
        ((GeneralPath) shape).lineTo(3.961, 15.816);
        ((GeneralPath) shape).curveTo(4.031, 15.668, 4.234, 15.582, 4.574, 15.555);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_10

        // _0_0_1_0_0_0_0_0_0_10_0

        // _0_0_1_0_0_0_0_0_0_10_0_0

        // _0_0_1_0_0_0_0_0_0_10_0_0_0

        // _0_0_1_0_0_0_0_0_0_10_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_10_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_10_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_10_0_0_0_0_0_0_0

        // _0_0_1_0_0_0_0_0_0_10_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.422, 15.23);
        ((GeneralPath) shape).curveTo(26.711, 14.827999, 26.855001, 14.445, 26.844002, 14.0859995);
        ((GeneralPath) shape).lineTo(26.711002, 14.276999);
        ((GeneralPath) shape).curveTo(26.262003, 15.214999, 25.414001, 15.901999, 24.164001, 16.34);
        ((GeneralPath) shape).curveTo(23.832, 16.469, 23.273, 16.621, 22.484001, 16.805);
        ((GeneralPath) shape).curveTo(21.637001, 16.988, 20.898, 17.188, 20.273, 17.398);
        ((GeneralPath) shape).curveTo(19.570002, 17.633001, 18.727001, 17.77, 17.75, 17.805);
        ((GeneralPath) shape).curveTo(16.625, 17.812, 15.727, 17.844, 15.047, 17.898);
        ((GeneralPath) shape).curveTo(12.895, 18.066, 11.395, 18.152, 10.555, 18.156);
        ((GeneralPath) shape).curveTo(9.953, 18.184, 9.094, 17.98, 7.977, 17.547);
        ((GeneralPath) shape).curveTo(6.965, 17.145, 6.2970004, 16.805, 5.9730005, 16.531);
        ((GeneralPath) shape).curveTo(5.8400006, 16.602, 5.6720004, 16.633, 5.4690003, 16.629);
        ((GeneralPath) shape).curveTo(5.0860004, 16.578, 4.7420006, 16.296999, 4.4410005, 15.776999);
        ((GeneralPath) shape).curveTo(4.3710003, 15.664, 4.1330004, 15.469, 3.7340004, 15.198999);
        ((GeneralPath) shape).curveTo(3.3520005, 14.929999, 3.1330004, 14.707, 3.0780005, 14.530999);
        ((GeneralPath) shape).curveTo(2.4490006, 14.9609995, 2.0390005, 15.323999, 1.8400005, 15.620999);
        ((GeneralPath) shape).curveTo(1.7810005, 15.905999, 1.9180005, 16.245998, 2.2500005, 16.640999);
        ((GeneralPath) shape).curveTo(2.5390005, 16.999998, 2.9020004, 17.293, 3.3440003, 17.519999);
        ((GeneralPath) shape).curveTo(3.6370003, 17.675999, 4.2500005, 17.859, 5.1910005, 18.065998);
        ((GeneralPath) shape).curveTo(6.1290007, 18.292997, 6.7770004, 18.491999, 7.1330004, 18.667997);
        ((GeneralPath) shape).curveTo(8.281, 19.257998, 9.656, 19.522997, 11.258, 19.456997);
        ((GeneralPath) shape).curveTo(11.637, 19.444998, 12.586, 19.401997, 14.1050005, 19.323997);
        ((GeneralPath) shape).curveTo(15.383, 19.265997, 16.387001, 19.233997, 17.109001, 19.237997);
        ((GeneralPath) shape).curveTo(18.391, 19.237997, 20.012001, 18.811996, 21.973001, 17.956997);
        ((GeneralPath) shape).curveTo(23.660002, 17.202997, 24.836002, 16.608997, 25.504002, 16.175997);
        ((GeneralPath) shape).curveTo(25.867002, 15.944997, 26.176003, 15.632997, 26.422, 15.229997);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.191, 17.445);
        ((GeneralPath) shape).curveTo(10.859, 17.831999, 10.613, 18.254, 10.445, 18.706999);
        ((GeneralPath) shape).curveTo(10.348, 18.977, 10.2699995, 19.272999, 10.215, 19.598);
        ((GeneralPath) shape).lineTo(10.188, 20.022999);
        ((GeneralPath) shape).lineTo(11.172, 19.887);
        ((GeneralPath) shape).curveTo(11.469, 19.862999, 11.852, 19.75, 12.316, 19.554998);
        ((GeneralPath) shape).lineTo(12.582, 18.722998);
        ((GeneralPath) shape).curveTo(12.648, 18.515997, 12.781, 18.304998, 12.984, 18.089998);
        ((GeneralPath) shape).lineTo(11.191, 17.444998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.613, 18.543);
        ((GeneralPath) shape).lineTo(11.309, 18.188);
        ((GeneralPath) shape).lineTo(12.984, 18.09);
        ((GeneralPath) shape).lineTo(12.391, 17.383);
        ((GeneralPath) shape).lineTo(12.281, 17.147999);
        ((GeneralPath) shape).curveTo(11.883, 16.921999, 11.4800005, 16.780998, 11.074, 16.734);
        ((GeneralPath) shape).lineTo(9.617001, 16.546999);
        ((GeneralPath) shape).lineTo(9.875001, 17.940998);
        ((GeneralPath) shape).lineTo(10.613001, 18.542997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.609, 19.629);
        ((GeneralPath) shape).lineTo(11.203, 18.737999);
        ((GeneralPath) shape).curveTo(11.2890005, 18.57, 11.324, 18.390999, 11.309, 18.188);
        ((GeneralPath) shape).curveTo(11.004, 18.133, 10.754, 18.004, 10.555, 17.796999);
        ((GeneralPath) shape).curveTo(10.469, 17.683998, 10.371, 17.512, 10.273001, 17.276999);
        ((GeneralPath) shape).curveTo(10.199, 17.081999, 10.117001, 16.949, 10.031001, 16.874998);
        ((GeneralPath) shape).lineTo(9.617002, 16.546999);
        ((GeneralPath) shape).curveTo(9.125002, 17.227, 8.879002, 17.637, 8.871001, 17.776999);
        ((GeneralPath) shape).curveTo(8.855001, 17.859, 8.988001, 18.171999, 9.273002, 18.710999);
        ((GeneralPath) shape).curveTo(9.555001, 19.210999, 9.781002, 19.581999, 9.961001, 19.828);
        ((GeneralPath) shape).curveTo(10.188002, 20.151999, 10.402001, 20.085999, 10.609001, 19.629);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.148, 16.957);
        ((GeneralPath) shape).lineTo(19.352001, 16.355001);
        ((GeneralPath) shape).curveTo(19.262001, 16.242, 19.102001, 16.125002, 18.871, 16.004002);
        ((GeneralPath) shape).lineTo(18.559, 15.8480015);
        ((GeneralPath) shape).lineTo(17.582, 16.465002);
        ((GeneralPath) shape).lineTo(18.578001, 18.043001);
        ((GeneralPath) shape).lineTo(20.105001, 17.531002);
        ((GeneralPath) shape).lineTo(20.148, 16.957003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.938, 18.52);
        ((GeneralPath) shape).lineTo(18.598, 17.527);
        ((GeneralPath) shape).lineTo(18.531, 17.023);
        ((GeneralPath) shape).lineTo(18.559, 15.848001);
        ((GeneralPath) shape).lineTo(18.469, 15.883);
        ((GeneralPath) shape).lineTo(17.023, 16.238);
        ((GeneralPath) shape).lineTo(16.535, 16.516);
        ((GeneralPath) shape).curveTo(16.512, 16.52, 16.281, 16.625, 15.8359995, 16.844);
        ((GeneralPath) shape).curveTo(15.5859995, 16.961, 15.374999, 17.078, 15.202999, 17.191);
        ((GeneralPath) shape).lineTo(14.050999, 17.855);
        ((GeneralPath) shape).lineTo(14.101998, 18.902);
        ((GeneralPath) shape).lineTo(15.937998, 18.52);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.246, 18.109);
        ((GeneralPath) shape).curveTo(19.633, 17.918, 19.918001, 17.727, 20.105, 17.531);
        ((GeneralPath) shape).lineTo(19.129, 17.398);
        ((GeneralPath) shape).lineTo(18.531, 17.023);
        ((GeneralPath) shape).curveTo(18.332, 17.039001, 18.055, 17.129002, 17.707, 17.297);
        ((GeneralPath) shape).lineTo(14.102001, 18.902);
        ((GeneralPath) shape).lineTo(14.926002, 19.441);
        ((GeneralPath) shape).lineTo(15.758001, 19.676);
        ((GeneralPath) shape).lineTo(17.109001, 19.238);
        ((GeneralPath) shape).curveTo(17.613, 19.039001, 18.328001, 18.664001, 19.246002, 18.109001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.059, 15.812);
        ((GeneralPath) shape).lineTo(7.438, 16.387001);
        ((GeneralPath) shape).lineTo(11.074, 16.734001);
        ((GeneralPath) shape).lineTo(11.184, 16.574001);
        ((GeneralPath) shape).curveTo(11.254, 16.449001, 11.273, 16.336, 11.246, 16.238);
        ((GeneralPath) shape).curveTo(11.211, 16.039001, 11.055, 15.953001, 10.773001, 15.973001);
        ((GeneralPath) shape).lineTo(8.707001, 16.105001);
        ((GeneralPath) shape).curveTo(8.488001, 16.121002, 8.242001, 16.051, 7.969001, 15.895001);
        ((GeneralPath) shape).curveTo(7.6950006, 15.734001, 7.508001, 15.637001, 7.4060006, 15.605001);
        ((GeneralPath) shape).curveTo(7.3010006, 15.555001, 7.219001, 15.539001, 7.160001, 15.566002);
        ((GeneralPath) shape).lineTo(7.074001, 15.602002);
        ((GeneralPath) shape).lineTo(7.059001, 15.812002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.961, 16.062);
        ((GeneralPath) shape).curveTo(6.988, 16.16, 7.047, 16.266, 7.137, 16.379);
        ((GeneralPath) shape).curveTo(7.293, 16.629, 7.488, 16.781, 7.715, 16.844);
        ((GeneralPath) shape).curveTo(8.043, 16.961, 8.441, 17.051, 8.906, 17.112999);
        ((GeneralPath) shape).curveTo(9.434, 17.190998, 9.816, 17.190998, 10.051001, 17.112999);
        ((GeneralPath) shape).curveTo(10.387001, 17.026999, 10.727, 16.901999, 11.074, 16.734);
        ((GeneralPath) shape).curveTo(11.113, 16.469, 11.012, 16.316, 10.77, 16.276999);
        ((GeneralPath) shape).curveTo(10.707001, 16.262, 10.406, 16.284998, 9.871, 16.347998);
        ((GeneralPath) shape).curveTo(9.336, 16.429998, 8.871, 16.413998, 8.484, 16.304998);
        ((GeneralPath) shape).curveTo(8.074, 16.194998, 7.7190003, 16.043, 7.426, 15.843998);
        ((GeneralPath) shape).curveTo(7.258, 15.7579975, 7.1410003, 15.675998, 7.0740004, 15.601998);
        ((GeneralPath) shape).curveTo(6.945, 15.729999, 6.906, 15.886998, 6.9610004, 16.061998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.262, 16.363);
        ((GeneralPath) shape).curveTo(19.414, 16.293001, 19.561998, 16.148, 19.706999, 15.938001);
        ((GeneralPath) shape).curveTo(19.835999, 15.785001, 20.203, 15.727, 20.808998, 15.762001);
        ((GeneralPath) shape).curveTo(20.968998, 15.770001, 21.144999, 15.816001, 21.331999, 15.902001);
        ((GeneralPath) shape).curveTo(21.477, 15.969002, 21.578, 15.992002, 21.637, 15.969002);
        ((GeneralPath) shape).curveTo(21.75, 15.898002, 21.804998, 15.812002, 21.796999, 15.715002);
        ((GeneralPath) shape).lineTo(21.695, 15.570002);
        ((GeneralPath) shape).curveTo(21.647999, 15.4730015, 21.512, 15.395001, 21.285, 15.332002);
        ((GeneralPath) shape).curveTo(21.02, 15.254002, 20.746, 15.2230015, 20.465, 15.246001);
        ((GeneralPath) shape).curveTo(19.988, 15.262001, 19.504, 15.383001, 19.02, 15.602001);
        ((GeneralPath) shape).curveTo(18.613, 15.793001, 18.422, 16.027, 18.445, 16.309002);
        ((GeneralPath) shape).curveTo(18.456999, 16.488003, 18.73, 16.504002, 19.262, 16.363003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.418, 16.645);
        ((GeneralPath) shape).curveTo(21.719, 16.641, 22.004, 16.582, 22.276999, 16.457);
        ((GeneralPath) shape).curveTo(22.526999, 16.34, 22.651999, 16.238, 22.644999, 16.16);
        ((GeneralPath) shape).curveTo(22.616999, 16.059, 22.366999, 16.09, 21.897999, 16.246);
        ((GeneralPath) shape).curveTo(21.780998, 16.277, 21.558998, 16.262001, 21.234, 16.207);
        ((GeneralPath) shape).curveTo(20.91, 16.156, 20.679998, 16.152, 20.543, 16.203001);
        ((GeneralPath) shape).curveTo(20.366999, 16.258001, 20.414, 16.352001, 20.684, 16.492);
        ((GeneralPath) shape).curveTo(20.934, 16.613, 21.18, 16.664001, 21.418, 16.645);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.129, 14.062);
        ((GeneralPath) shape).curveTo(12.542999, 13.992001, 12.632999, 13.832001, 12.3949995, 13.59);
        ((GeneralPath) shape).curveTo(12.176, 13.387, 11.8949995, 13.258, 11.551, 13.207);
        ((GeneralPath) shape).curveTo(11.391, 13.198999, 11.219, 13.051, 11.035, 12.766);
        ((GeneralPath) shape).curveTo(10.875, 12.516, 10.695, 12.418, 10.5, 12.477);
        ((GeneralPath) shape).curveTo(10.246, 12.555, 10.16, 12.754001, 10.246, 13.066);
        ((GeneralPath) shape).curveTo(10.309, 13.363, 10.457001, 13.582, 10.688001, 13.723);
        ((GeneralPath) shape).curveTo(11.195001, 14.026999, 11.672001, 14.136999, 12.129001, 14.061999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.25, 13.738);
        ((GeneralPath) shape).curveTo(21.984, 13.6449995, 22.312, 13.457, 22.23, 13.184);
        ((GeneralPath) shape).curveTo(22.147999, 12.906, 21.902, 12.816, 21.487999, 12.91);
        ((GeneralPath) shape).curveTo(21.289, 12.945, 21.008, 12.938, 20.644999, 12.887);
        ((GeneralPath) shape).curveTo(20.276999, 12.812, 19.933998, 12.809, 19.620998, 12.875);
        ((GeneralPath) shape).curveTo(19.163998, 12.949, 19.187998, 13.129, 19.690998, 13.41);
        ((GeneralPath) shape).curveTo(20.175999, 13.695, 20.694998, 13.805, 21.249998, 13.738);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.035, 14.797);
        ((GeneralPath) shape).curveTo(25.465, 14.625, 25.602, 14.465, 25.449, 14.312);
        ((GeneralPath) shape).curveTo(25.296999, 14.1640005, 25.094, 14.102, 24.831999, 14.121);
        ((GeneralPath) shape).curveTo(23.956999, 14.191, 23.491999, 14.309, 23.445, 14.473001);
        ((GeneralPath) shape).curveTo(23.398, 14.637001, 23.57, 14.762, 23.956999, 14.852);
        ((GeneralPath) shape).curveTo(24.362999, 14.941, 24.727, 14.922, 25.034998, 14.797);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.285, 14.863);
        ((GeneralPath) shape).curveTo(7.6949997, 14.973, 8.043, 14.8949995, 8.32, 14.633);
        ((GeneralPath) shape).curveTo(8.5859995, 14.391001, 8.641, 14.215, 8.492, 14.1050005);
        ((GeneralPath) shape).curveTo(8.387, 14.035001, 8.233999, 14.016001, 8.035, 14.051001);
        ((GeneralPath) shape).curveTo(7.66, 14.102, 7.441, 14.129001, 7.3789997, 14.133);
        ((GeneralPath) shape).curveTo(7.2769995, 14.121, 7.1049995, 14.074, 6.8589997, 13.992001);
        ((GeneralPath) shape).curveTo(6.6949997, 13.945001, 6.555, 13.957001, 6.4379997, 14.027);
        ((GeneralPath) shape).curveTo(6.285, 14.117001, 6.3359995, 14.266001, 6.594, 14.465);
        ((GeneralPath) shape).curveTo(6.809, 14.648, 7.039, 14.781, 7.285, 14.863);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.648, 15.316);
        ((GeneralPath) shape).curveTo(12.617, 14.938, 12.684, 14.609, 12.844, 14.336);
        ((GeneralPath) shape).curveTo(12.132999, 14.473001, 11.66, 14.582001, 11.422, 14.660001);
        ((GeneralPath) shape).curveTo(10.93, 14.777, 10.605, 14.953001, 10.441, 15.188001);
        ((GeneralPath) shape).curveTo(10.43, 15.2890005, 10.426, 15.391001, 10.434, 15.488001);
        ((GeneralPath) shape).curveTo(10.434, 15.7300005, 10.457, 15.891001, 10.504, 15.965001);
        ((GeneralPath) shape).lineTo(10.9609995, 17.191002);
        ((GeneralPath) shape).lineTo(11.723, 16.953001);
        ((GeneralPath) shape).curveTo(11.801, 16.906, 12.004, 16.820002, 12.3359995, 16.695002);
        ((GeneralPath) shape).curveTo(12.608999, 16.613, 12.745999, 16.551003, 12.742, 16.512001);
        ((GeneralPath) shape).lineTo(12.648, 15.316001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.938, 16.781);
        ((GeneralPath) shape).lineTo(12.742, 16.512001);
        ((GeneralPath) shape).lineTo(12.358999, 16.633001);
        ((GeneralPath) shape).lineTo(11.723, 16.953001);
        ((GeneralPath) shape).lineTo(10.9609995, 17.191002);
        ((GeneralPath) shape).lineTo(11.297, 17.258001);
        ((GeneralPath) shape).lineTo(11.93, 17.297);
        ((GeneralPath) shape).lineTo(12.137, 17.25);
        ((GeneralPath) shape).lineTo(13.148, 17.113);
        ((GeneralPath) shape).curveTo(13.328, 17.098001, 13.59, 16.988, 13.938, 16.781);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.742, 16.512);
        ((GeneralPath) shape).lineTo(13.2699995, 16.710999);
        ((GeneralPath) shape).lineTo(13.938, 16.780998);
        ((GeneralPath) shape).lineTo(13.809, 15.163999);
        ((GeneralPath) shape).lineTo(13.914, 14.585999);
        ((GeneralPath) shape).lineTo(12.844, 14.335999);
        ((GeneralPath) shape).curveTo(12.695, 14.487999, 12.613, 14.636998, 12.605, 14.7769985);
        ((GeneralPath) shape).lineTo(12.594, 15.378999);
        ((GeneralPath) shape).lineTo(12.742, 16.512);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.668, 16.688);
        ((GeneralPath) shape).lineTo(18.434, 16.156);
        ((GeneralPath) shape).curveTo(18.668, 16.078001, 18.879, 15.973001, 19.07, 15.836);
        ((GeneralPath) shape).lineTo(17.812, 15.543);
        ((GeneralPath) shape).lineTo(15.258, 16.344);
        ((GeneralPath) shape).lineTo(15.629001, 16.496);
        ((GeneralPath) shape).lineTo(16.668001, 16.688);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.0, 15.371);
        ((GeneralPath) shape).lineTo(15.258, 16.344);
        ((GeneralPath) shape).lineTo(17.812, 15.543);
        ((GeneralPath) shape).lineTo(17.82, 14.52);
        ((GeneralPath) shape).lineTo(16.91, 14.801001);
        ((GeneralPath) shape).curveTo(16.816, 14.852, 16.648, 14.883, 16.406, 14.902);
        ((GeneralPath) shape).curveTo(16.148, 14.941, 15.9800005, 14.973001, 15.902, 15.0);
        ((GeneralPath) shape).curveTo(15.551001, 15.109, 15.25, 15.234, 15.0, 15.371);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.07, 15.836);
        ((GeneralPath) shape).lineTo(19.203, 14.863001);
        ((GeneralPath) shape).lineTo(17.82, 14.52);
        ((GeneralPath) shape).lineTo(17.746, 15.066);
        ((GeneralPath) shape).lineTo(17.812, 15.543);
        ((GeneralPath) shape).lineTo(18.246, 15.719);
        ((GeneralPath) shape).curveTo(18.391, 15.7699995, 18.664, 15.809, 19.07, 15.8359995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.152, 14.031);
        ((GeneralPath) shape).curveTo(17.551, 14.02, 17.75, 13.875, 17.75, 13.594);
        ((GeneralPath) shape).curveTo(17.734, 13.3949995, 17.629, 13.223, 17.438, 13.073999);
        ((GeneralPath) shape).curveTo(17.246, 12.91, 16.859, 12.851999, 16.281, 12.8949995);
        ((GeneralPath) shape).curveTo(16.16, 12.905999, 15.906, 12.995999, 15.52, 13.164);
        ((GeneralPath) shape).lineTo(14.969001, 13.448999);
        ((GeneralPath) shape).lineTo(15.203001, 13.73);
        ((GeneralPath) shape).lineTo(15.988001, 14.151999);
        ((GeneralPath) shape).lineTo(17.152, 14.030999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.016, 14.738);
        ((GeneralPath) shape).curveTo(10.125, 14.609, 10.137, 14.488, 10.047, 14.375);
        ((GeneralPath) shape).curveTo(9.766, 14.137, 9.535, 14.004, 9.355, 13.98);
        ((GeneralPath) shape).lineTo(8.495999, 13.773);
        ((GeneralPath) shape).lineTo(8.332, 14.391);
        ((GeneralPath) shape).curveTo(8.289, 14.613, 8.285, 14.773, 8.311999, 14.870999);
        ((GeneralPath) shape).lineTo(8.348, 14.9609995);
        ((GeneralPath) shape).lineTo(9.098, 15.323999);
        ((GeneralPath) shape).curveTo(9.304999, 15.405999, 9.464999, 15.382999, 9.573999, 15.254);
        ((GeneralPath) shape).lineTo(10.016, 14.738);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.316, 14.934);
        ((GeneralPath) shape).lineTo(8.434, 14.895);
        ((GeneralPath) shape).curveTo(8.777, 14.688001, 9.039, 14.465, 9.223, 14.2300005);
        ((GeneralPath) shape).lineTo(9.382999, 13.977);
        ((GeneralPath) shape).lineTo(9.190999, 13.84);
        ((GeneralPath) shape).lineTo(8.815999, 13.629);
        ((GeneralPath) shape).lineTo(8.636999, 13.6449995);
        ((GeneralPath) shape).lineTo(7.905999, 13.941);
        ((GeneralPath) shape).lineTo(8.022999, 14.293);
        ((GeneralPath) shape).lineTo(8.315999, 14.934);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.207, 12.648);
        ((GeneralPath) shape).lineTo(13.851999, 12.632999);
        ((GeneralPath) shape).lineTo(14.0199995, 12.832);
        ((GeneralPath) shape).curveTo(14.370999, 13.227, 14.636999, 13.414, 14.816, 13.401999);
        ((GeneralPath) shape).curveTo(14.895, 13.3949995, 14.961, 13.308999, 15.008, 13.1449995);
        ((GeneralPath) shape).curveTo(15.145, 12.832, 15.211, 12.667999, 15.207001, 12.648);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.16, 13.02);
        ((GeneralPath) shape).lineTo(13.776999, 13.602);
        ((GeneralPath) shape).curveTo(13.973, 13.77, 14.195, 13.781, 14.440999, 13.641);
        ((GeneralPath) shape).lineTo(14.901999, 13.363);
        ((GeneralPath) shape).curveTo(14.957, 13.301, 14.789, 13.203, 14.398, 13.074);
        ((GeneralPath) shape).lineTo(13.851999, 12.633);
        ((GeneralPath) shape).lineTo(13.589999, 12.715);
        ((GeneralPath) shape).lineTo(13.159999, 13.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_36

        // _0_0_1_0_0_0_0_0_0_36_0

        // _0_0_1_0_0_0_0_0_0_36_0_0

        // _0_0_1_0_0_0_0_0_0_36_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.926, 15.18);
        ((GeneralPath) shape).curveTo(5.9100003, 14.941, 5.6990004, 14.848001, 5.3050003, 14.898001);
        ((GeneralPath) shape).lineTo(4.828, 14.996);
        ((GeneralPath) shape).curveTo(4.77, 15.262, 4.828, 15.465, 5.0, 15.613);
        ((GeneralPath) shape).curveTo(5.258, 15.855, 5.52, 15.863, 5.785, 15.641);
        ((GeneralPath) shape).curveTo(5.914, 15.531, 5.9649997, 15.379, 5.9259996, 15.179999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(7.674799919128418, -11.093000411987305), new Point2D.Double(9.524800300598145, -11.093000411987305), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_37

        // _0_0_1_0_0_0_0_0_0_37_0

        // _0_0_1_0_0_0_0_0_0_37_0_0

        // _0_0_1_0_0_0_0_0_0_37_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.621, 12.352);
        ((GeneralPath) shape).curveTo(13.594, 11.992001, 13.281, 11.848001, 12.684, 11.9140005);
        ((GeneralPath) shape).lineTo(11.973, 12.059001);
        ((GeneralPath) shape).curveTo(11.901999, 12.445001, 11.995999, 12.770001, 12.257999, 13.031001);
        ((GeneralPath) shape).curveTo(12.648, 13.379001, 13.030999, 13.391001, 13.405999, 13.059001);
        ((GeneralPath) shape).curveTo(13.593999, 12.906001, 13.664, 12.668001, 13.620999, 12.352001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.88800048828125, -14.685999870300293), new Point2D.Double(22.613000869750977, -14.685999870300293), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_38

        // _0_0_1_0_0_0_0_0_0_38_0

        // _0_0_1_0_0_0_0_0_0_38_0_0

        // _0_0_1_0_0_0_0_0_0_38_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.66, 14.609);
        ((GeneralPath) shape).curveTo(11.632999, 14.254001, 11.34, 14.1050005, 10.785, 14.168);
        ((GeneralPath) shape).lineTo(10.132999, 14.34);
        ((GeneralPath) shape).curveTo(10.120999, 14.422, 10.117, 14.52, 10.129, 14.641);
        ((GeneralPath) shape).curveTo(10.148, 14.879, 10.233999, 15.073999, 10.382999, 15.223);
        ((GeneralPath) shape).curveTo(10.733999, 15.573999, 11.0859995, 15.598, 11.440999, 15.289);
        ((GeneralPath) shape).curveTo(11.632999, 15.136999, 11.702999, 14.91, 11.659999, 14.608999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.524999618530273, -11.227999687194824), new Point2D.Double(19.075000762939453, -11.227999687194824), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_39

        // _0_0_1_0_0_0_0_0_0_39_0

        // _0_0_1_0_0_0_0_0_0_39_0_0

        // _0_0_1_0_0_0_0_0_0_39_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.66, 16.887);
        ((GeneralPath) shape).curveTo(15.637, 16.605, 15.348, 16.5, 14.793, 16.561998);
        ((GeneralPath) shape).lineTo(14.141, 16.671999);
        ((GeneralPath) shape).curveTo(14.125, 16.754, 14.120999, 16.844, 14.129, 16.945);
        ((GeneralPath) shape).curveTo(14.1449995, 17.145, 14.226999, 17.296999, 14.375, 17.406);
        ((GeneralPath) shape).curveTo(14.742, 17.699, 15.094, 17.711, 15.434, 17.445);
        ((GeneralPath) shape).curveTo(15.602, 17.312, 15.68, 17.125, 15.66, 16.887);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(22.899999618530273, -6.948200225830078), new Point2D.Double(25.399999618530273, -6.948200225830078), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_40

        // _0_0_1_0_0_0_0_0_0_40_0

        // _0_0_1_0_0_0_0_0_0_40_0_0

        // _0_0_1_0_0_0_0_0_0_40_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.711, 14.535);
        ((GeneralPath) shape).curveTo(20.684, 14.176, 20.371, 14.031, 19.773, 14.098);
        ((GeneralPath) shape).lineTo(19.066, 14.273);
        ((GeneralPath) shape).curveTo(19.055, 14.375, 19.055, 14.484, 19.062, 14.601999);
        ((GeneralPath) shape).curveTo(19.102001, 14.858999, 19.199, 15.061999, 19.352001, 15.2109995);
        ((GeneralPath) shape).curveTo(19.723001, 15.5859995, 20.105001, 15.605, 20.500002, 15.273);
        ((GeneralPath) shape).curveTo(20.688002, 15.098, 20.758001, 14.851999, 20.711002, 14.535);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(31.38800048828125, -10.116000175476074), new Point2D.Double(34.112998962402344, -10.116000175476074), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_41

        // _0_0_1_0_0_0_0_0_0_41_0

        // _0_0_1_0_0_0_0_0_0_41_0_0

        // _0_0_1_0_0_0_0_0_0_41_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.461, 15.926);
        ((GeneralPath) shape).curveTo(24.441, 15.648, 24.16, 15.526999, 23.621, 15.57);
        ((GeneralPath) shape).lineTo(22.969, 15.7109995);
        ((GeneralPath) shape).curveTo(22.957, 15.792999, 22.953, 15.882999, 22.961, 15.983999);
        ((GeneralPath) shape).curveTo(22.977001, 16.184, 23.062, 16.348, 23.211, 16.477);
        ((GeneralPath) shape).curveTo(23.574001, 16.75, 23.926, 16.75, 24.266, 16.484);
        ((GeneralPath) shape).curveTo(24.434, 16.352, 24.5, 16.164, 24.461, 15.926);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(37.70000076293945, -7.416500091552734), new Point2D.Double(40.20000076293945, -7.416500091552734), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_42

        // _0_0_1_0_0_0_0_0_0_42_0

        // _0_0_1_0_0_0_0_0_0_42_0_0

        // _0_0_1_0_0_0_0_0_0_42_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.453, 14.273);
        ((GeneralPath) shape).curveTo(24.640999, 14.098, 24.710999, 13.851999, 24.664, 13.531);
        ((GeneralPath) shape).curveTo(24.637, 13.176001, 24.324, 13.027, 23.73, 13.094);
        ((GeneralPath) shape).curveTo(23.508, 13.113, 23.331999, 13.1449995, 23.195, 13.195);
        ((GeneralPath) shape).lineTo(23.051, 13.2699995);
        ((GeneralPath) shape).curveTo(23.039001, 13.370999, 23.035, 13.48, 23.047, 13.601999);
        ((GeneralPath) shape).curveTo(23.066, 13.858999, 23.152, 14.061999, 23.305, 14.2109995);
        ((GeneralPath) shape).curveTo(23.691, 14.561999, 24.074, 14.582, 24.453001, 14.273);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(38.13800048828125, -11.277999877929688), new Point2D.Double(40.862998962402344, -11.277999877929688), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.93, 20.152);
        ((GeneralPath) shape).curveTo(14.578, 20.0, 14.988, 19.848, 15.156, 19.695);
        ((GeneralPath) shape).curveTo(15.215, 19.647999, 15.254, 19.515999, 15.277, 19.293);
        ((GeneralPath) shape).curveTo(15.285001, 19.171999, 15.223001, 19.105, 15.082001, 19.098);
        ((GeneralPath) shape).lineTo(14.453001, 19.147999);
        ((GeneralPath) shape).curveTo(14.234001, 19.164, 13.918001, 19.109, 13.508001, 18.98);
        ((GeneralPath) shape).curveTo(13.055001, 18.816, 12.754002, 18.719, 12.613001, 18.688);
        ((GeneralPath) shape).curveTo(12.383001, 18.586, 12.207001, 18.512, 12.082001, 18.461);
        ((GeneralPath) shape).curveTo(11.8550005, 18.398, 11.656001, 18.391, 11.4800005, 18.445);
        ((GeneralPath) shape).curveTo(11.281, 18.48, 11.254001, 18.656, 11.398001, 18.965);
        ((GeneralPath) shape).curveTo(11.52, 19.234, 11.688001, 19.465, 11.902, 19.648);
        ((GeneralPath) shape).curveTo(12.098001, 19.793001, 12.426001, 19.918001, 12.895, 20.02);
        ((GeneralPath) shape).curveTo(13.348001, 20.145, 13.691, 20.188, 13.93, 20.152);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.656, 15.273);
        ((GeneralPath) shape).curveTo(6.8320003, 15.198999, 6.855, 15.137, 6.734, 15.0859995);
        ((GeneralPath) shape).curveTo(6.629, 15.035, 6.4960003, 15.016, 6.3360004, 15.026999);
        ((GeneralPath) shape).curveTo(6.1760006, 15.039, 6.1520004, 15.101999, 6.2620006, 15.214999);
        ((GeneralPath) shape).curveTo(6.371001, 15.323999, 6.5040007, 15.343999, 6.6560006, 15.272999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.762, 12.496);
        ((GeneralPath) shape).curveTo(17.078, 12.473001, 17.285, 12.406, 17.379, 12.297);
        ((GeneralPath) shape).curveTo(17.469, 12.191, 17.421999, 12.094, 17.234, 12.008);
        ((GeneralPath) shape).curveTo(16.862999, 11.875, 16.456999, 11.816, 16.015999, 11.832001);
        ((GeneralPath) shape).curveTo(15.136999, 11.859001, 14.573998, 11.996, 14.331999, 12.234001);
        ((GeneralPath) shape).curveTo(14.261999, 12.340001, 14.417999, 12.398001, 14.796999, 12.410001);
        ((GeneralPath) shape).curveTo(15.261999, 12.453001, 15.507999, 12.484001, 15.5269985, 12.504001);
        ((GeneralPath) shape).curveTo(15.612999, 12.555, 16.022999, 12.555, 16.762, 12.496);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.164, 12.605);
        ((GeneralPath) shape).curveTo(21.737999, 12.539, 22.066, 12.4609995, 22.137, 12.375);
        ((GeneralPath) shape).curveTo(22.210999, 12.293, 22.074, 12.203, 21.727, 12.109);
        ((GeneralPath) shape).curveTo(21.171999, 11.949, 20.664, 11.9800005, 20.199, 12.199);
        ((GeneralPath) shape).curveTo(19.965, 12.297, 20.004, 12.402, 20.312, 12.52);
        ((GeneralPath) shape).curveTo(20.602001, 12.617001, 20.887001, 12.645, 21.164, 12.6050005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.113, 14.914);
        ((GeneralPath) shape).curveTo(15.469, 14.804999, 15.578, 14.684, 15.449, 14.554999);
        ((GeneralPath) shape).curveTo(15.316, 14.426, 15.062, 14.386999, 14.688001, 14.433999);
        ((GeneralPath) shape).curveTo(14.309001, 14.483999, 14.207001, 14.601999, 14.383, 14.788999);
        ((GeneralPath) shape).curveTo(14.5390005, 14.995998, 14.781, 15.038999, 15.113001, 14.913999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.172, 14.078);
        ((GeneralPath) shape).lineTo(6.281, 13.918);
        ((GeneralPath) shape).curveTo(6.3710003, 13.812, 6.48, 13.762, 6.602, 13.773);
        ((GeneralPath) shape).lineTo(6.9020004, 13.809);
        ((GeneralPath) shape).curveTo(6.5740004, 13.695, 6.3320003, 13.664, 6.1760006, 13.715);
        ((GeneralPath) shape).curveTo(6.055001, 13.746, 6.0200005, 13.816, 6.0700006, 13.934);
        ((GeneralPath) shape).lineTo(6.172001, 14.078);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.766, 14.941);
        ((GeneralPath) shape).curveTo(4.844, 14.895, 4.9379997, 14.848, 5.055, 14.797);
        ((GeneralPath) shape).curveTo(5.133, 14.75, 5.141, 14.719, 5.0779996, 14.703);
        ((GeneralPath) shape).curveTo(5.016, 14.668, 4.8949995, 14.688, 4.7229996, 14.762);
        ((GeneralPath) shape).curveTo(4.6209993, 14.7890005, 4.5859995, 14.832, 4.6089997, 14.891);
        ((GeneralPath) shape).curveTo(4.6369996, 14.948999, 4.6879997, 14.965, 4.766, 14.941);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.504, 14.762);
        ((GeneralPath) shape).curveTo(5.602, 14.734, 5.6410003, 14.699, 5.617, 14.6640005);
        ((GeneralPath) shape).curveTo(5.5940003, 14.625001, 5.543, 14.609, 5.461, 14.613001);
        ((GeneralPath) shape).curveTo(5.363, 14.621001, 5.375, 14.672001, 5.504, 14.762001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.742, 15.598);
        ((GeneralPath) shape).curveTo(6.734, 15.495999, 6.8910003, 15.434, 7.211, 15.41);
        ((GeneralPath) shape).curveTo(7.41, 15.3949995, 7.59, 15.41, 7.7539997, 15.457);
        ((GeneralPath) shape).curveTo(7.5429997, 15.293, 7.3359995, 15.23, 7.1369996, 15.266);
        ((GeneralPath) shape).curveTo(6.7419996, 15.3359995, 6.5509996, 15.434, 6.5589995, 15.551);
        ((GeneralPath) shape).curveTo(6.5619993, 15.613, 6.5939994, 15.641, 6.6559997, 15.632999);
        ((GeneralPath) shape).curveTo(6.6949997, 15.632999, 6.7229996, 15.617, 6.7419996, 15.598);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.324, 14.055);
        ((GeneralPath) shape).lineTo(10.832001, 14.016001);
        ((GeneralPath) shape).curveTo(10.52, 13.898001, 10.285001, 13.824, 10.121, 13.797001);
        ((GeneralPath) shape).curveTo(9.762, 13.785001, 9.504001, 13.695001, 9.348001, 13.527);
        ((GeneralPath) shape).curveTo(9.152, 13.324, 8.8550005, 13.266001, 8.465, 13.3550005);
        ((GeneralPath) shape).curveTo(8.266, 13.391001, 8.109, 13.473001, 8.0, 13.602);
        ((GeneralPath) shape).lineTo(7.867, 13.793);
        ((GeneralPath) shape).lineTo(8.0390005, 13.691);
        ((GeneralPath) shape).curveTo(8.406, 13.523, 8.684, 13.461, 8.867001, 13.504);
        ((GeneralPath) shape).curveTo(9.051001, 13.551, 9.301001, 13.684, 9.617001, 13.898);
        ((GeneralPath) shape).curveTo(9.949, 14.012, 10.184001, 14.061999, 10.324, 14.054999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.055, 14.25);
        ((GeneralPath) shape).lineTo(12.406, 14.16);
        ((GeneralPath) shape).curveTo(12.6640005, 14.121, 12.844, 14.117, 12.949, 14.148);
        ((GeneralPath) shape).curveTo(13.133, 14.195, 13.293, 14.2109995, 13.434, 14.203);
        ((GeneralPath) shape).curveTo(13.375, 13.945, 13.207, 13.848001, 12.93, 13.91);
        ((GeneralPath) shape).lineTo(12.055, 14.25);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.086, 14.453);
        ((GeneralPath) shape).lineTo(14.168, 14.3550005);
        ((GeneralPath) shape).curveTo(14.246, 14.309001, 14.363, 14.277, 14.523, 14.266001);
        ((GeneralPath) shape).lineTo(15.2109995, 14.211);
        ((GeneralPath) shape).curveTo(14.797, 14.066, 14.483999, 14.0390005, 14.2699995, 14.137);
        ((GeneralPath) shape).curveTo(14.136999, 14.207, 14.061999, 14.281, 14.047, 14.363);
        ((GeneralPath) shape).lineTo(14.0859995, 14.453);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.562, 15.559);
        ((GeneralPath) shape).curveTo(14.859, 15.512, 14.973001, 15.406, 14.898001, 15.23);
        ((GeneralPath) shape).lineTo(14.543001, 15.289);
        ((GeneralPath) shape).curveTo(14.402001, 15.32, 14.3480015, 15.375, 14.375001, 15.452999);
        ((GeneralPath) shape).curveTo(14.422001, 15.546999, 14.484001, 15.581999, 14.562001, 15.558999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.484, 15.035);
        ((GeneralPath) shape).curveTo(15.602, 14.984, 15.809, 14.93, 16.105, 14.863);
        ((GeneralPath) shape).curveTo(16.262, 14.812, 16.219, 14.797, 15.98, 14.816);
        ((GeneralPath) shape).curveTo(15.641, 14.859, 15.414, 14.91, 15.297, 14.957);
        ((GeneralPath) shape).curveTo(15.242, 15.004, 15.234, 15.035, 15.276999, 15.051);
        ((GeneralPath) shape).curveTo(15.297, 15.07, 15.367, 15.061999, 15.483999, 15.035);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.035, 12.66);
        ((GeneralPath) shape).lineTo(10.141, 12.504);
        ((GeneralPath) shape).lineTo(10.605, 12.257999);
        ((GeneralPath) shape).curveTo(10.504, 12.242, 10.323999, 12.257999, 10.066, 12.296999);
        ((GeneralPath) shape).curveTo(9.906, 12.331999, 9.832, 12.397999, 9.84, 12.495999);
        ((GeneralPath) shape).curveTo(9.867001, 12.593999, 9.934, 12.648, 10.035, 12.659999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.699, 13.035);
        ((GeneralPath) shape).curveTo(18.938, 13.0199995, 19.125, 12.953, 19.254, 12.844);
        ((GeneralPath) shape).curveTo(19.367, 12.734, 19.562, 12.648, 19.836, 12.5859995);
        ((GeneralPath) shape).curveTo(19.398, 12.601999, 19.039, 12.629, 18.762001, 12.672);
        ((GeneralPath) shape).curveTo(18.582, 12.684, 18.484001, 12.754, 18.477001, 12.875);
        ((GeneralPath) shape).curveTo(18.465002, 12.996, 18.539001, 13.051, 18.699001, 13.035);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.855, 14.289);
        ((GeneralPath) shape).lineTo(18.934, 14.132999);
        ((GeneralPath) shape).curveTo(19.008, 14.046999, 19.145, 13.995999, 19.344, 13.98);
        ((GeneralPath) shape).lineTo(19.883, 13.938);
        ((GeneralPath) shape).curveTo(19.285, 13.742, 18.901999, 13.733999, 18.737999, 13.906);
        ((GeneralPath) shape).curveTo(18.624998, 14.016, 18.612999, 14.1050005, 18.699, 14.18);
        ((GeneralPath) shape).curveTo(18.741999, 14.238, 18.796999, 14.273001, 18.855, 14.2890005);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.66, 13.297);
        ((GeneralPath) shape).lineTo(22.801, 13.137);
        ((GeneralPath) shape).curveTo(22.914001, 13.047, 23.07, 12.996, 23.27, 12.9800005);
        ((GeneralPath) shape).curveTo(24.008001, 12.922001, 24.215, 12.887, 23.891, 12.871);
        ((GeneralPath) shape).curveTo(23.59, 12.875, 23.34, 12.883, 23.141, 12.898001);
        ((GeneralPath) shape).curveTo(22.781, 12.910001, 22.574001, 12.945001, 22.52, 13.008);
        ((GeneralPath) shape).curveTo(22.48, 13.051001, 22.496, 13.109, 22.562, 13.188001);
        ((GeneralPath) shape).curveTo(22.586, 13.227, 22.617, 13.262001, 22.66, 13.297001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.73, 15.699);
        ((GeneralPath) shape).lineTo(22.871, 15.570001);
        ((GeneralPath) shape).curveTo(23.023, 15.477, 23.238, 15.43, 23.52, 15.43);
        ((GeneralPath) shape).lineTo(24.211, 15.406);
        ((GeneralPath) shape).curveTo(23.77, 15.176001, 23.336, 15.133, 22.906, 15.266);
        ((GeneralPath) shape).curveTo(22.633, 15.348, 22.52, 15.445, 22.566, 15.562);
        ((GeneralPath) shape).lineTo(22.73, 15.699);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.156, 16.492);
        ((GeneralPath) shape).curveTo(14.41, 16.41, 14.586, 16.379, 14.688, 16.391);
        ((GeneralPath) shape).curveTo(14.535, 16.223001, 14.401999, 16.172, 14.285, 16.242);
        ((GeneralPath) shape).curveTo(14.207, 16.266, 14.16, 16.32, 14.148, 16.402);
        ((GeneralPath) shape).lineTo(14.156, 16.492);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_63

        // _0_0_1_0_0_0_0_0_0_63_0

        // _0_0_1_0_0_0_0_0_0_63_0_0

        // _0_0_1_0_0_0_0_0_0_63_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.855, 20.047);
        ((GeneralPath) shape).lineTo(15.047, 19.824001);
        ((GeneralPath) shape).lineTo(14.781, 19.875002);
        ((GeneralPath) shape).curveTo(14.629, 20.004002, 14.488, 20.105001, 14.352, 20.176003);
        ((GeneralPath) shape).curveTo(14.102, 20.316002, 13.785, 20.352003, 13.398001, 20.281002);
        ((GeneralPath) shape).curveTo(13.051001, 20.211002, 12.809001, 20.078003, 12.676001, 19.887003);
        ((GeneralPath) shape).curveTo(12.465, 19.523003, 12.309001, 19.293003, 12.199, 19.203003);
        ((GeneralPath) shape).curveTo(11.512, 18.613003, 11.0390005, 18.230003, 10.785, 18.051003);
        ((GeneralPath) shape).curveTo(10.551, 17.887003, 10.355, 17.684002, 10.195, 17.434002);
        ((GeneralPath) shape).lineTo(10.051, 17.113003);
        ((GeneralPath) shape).lineTo(9.823999, 17.312002);
        ((GeneralPath) shape).lineTo(10.035, 17.688002);
        ((GeneralPath) shape).curveTo(10.246, 18.070002, 10.57, 18.387001, 11.012, 18.633001);
        ((GeneralPath) shape).curveTo(11.309, 18.812002, 11.508, 18.945002, 11.617001, 19.039001);
        ((GeneralPath) shape).curveTo(11.7890005, 19.184002, 11.965, 19.422, 12.152, 19.746002);
        ((GeneralPath) shape).curveTo(12.359, 20.074001, 12.566, 20.297003, 12.777, 20.422003);
        ((GeneralPath) shape).curveTo(12.988001, 20.547003, 13.262, 20.613003, 13.6050005, 20.629004);
        ((GeneralPath) shape).curveTo(14.070001, 20.652004, 14.484, 20.457003, 14.8550005, 20.047003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(15.737000465393066, -4.389599800109863), new Point2D.Double(24.062000274658203, -4.389599800109863), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_64

        // _0_0_1_0_0_0_0_0_0_64_0

        // _0_0_1_0_0_0_0_0_0_64_0_0

        // _0_0_1_0_0_0_0_0_0_64_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.605, 18.27);
        ((GeneralPath) shape).lineTo(19.637, 17.719);
        ((GeneralPath) shape).curveTo(19.035, 17.727, 18.5, 17.777, 18.022999, 17.875);
        ((GeneralPath) shape).curveTo(17.804998, 17.91, 17.477, 17.945, 17.039, 17.98);
        ((GeneralPath) shape).curveTo(16.66, 18.012, 16.402, 18.050999, 16.265999, 18.102);
        ((GeneralPath) shape).curveTo(15.956999, 18.227, 15.499999, 18.561998, 14.9019985, 19.112999);
        ((GeneralPath) shape).curveTo(14.491999, 19.504, 14.0269985, 19.723, 13.507998, 19.762);
        ((GeneralPath) shape).curveTo(13.386998, 19.772999, 13.362998, 19.824, 13.429998, 19.918);
        ((GeneralPath) shape).lineTo(13.561998, 20.059);
        ((GeneralPath) shape).lineTo(14.007998, 19.992);
        ((GeneralPath) shape).curveTo(14.339998, 19.887001, 14.647999, 19.703001, 14.925999, 19.441);
        ((GeneralPath) shape).curveTo(15.612999, 18.746, 16.179998, 18.379, 16.616999, 18.344);
        ((GeneralPath) shape).lineTo(17.605, 18.27);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(21.350000381469727, -3.7699999809265137), new Point2D.Double(31.950000762939453, -3.7699999809265137), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_65

        // _0_0_1_0_0_0_0_0_0_65_0

        // _0_0_1_0_0_0_0_0_0_65_0_0

        // _0_0_1_0_0_0_0_0_0_65_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.391, 18.617);
        ((GeneralPath) shape).curveTo(17.836, 18.422, 17.906, 18.305, 17.605001, 18.27);
        ((GeneralPath) shape).curveTo(17.441002, 18.242, 17.223001, 18.27, 16.949001, 18.352001);
        ((GeneralPath) shape).curveTo(16.633001, 18.414001, 16.414001, 18.453001, 16.293001, 18.461);
        ((GeneralPath) shape).curveTo(16.012001, 18.441, 15.566001, 18.227001, 14.949001, 17.812);
        ((GeneralPath) shape).curveTo(14.719002, 17.652, 14.105001, 17.398, 13.117002, 17.055);
        ((GeneralPath) shape).curveTo(12.887002, 16.953001, 12.668001, 16.961, 12.457002, 17.078001);
        ((GeneralPath) shape).lineTo(12.230001, 17.273);
        ((GeneralPath) shape).lineTo(12.527001, 17.25);
        ((GeneralPath) shape).curveTo(12.770001, 17.254, 12.984001, 17.297, 13.172001, 17.383);
        ((GeneralPath) shape).curveTo(13.484001, 17.539, 13.957001, 17.699, 14.594001, 17.871);
        ((GeneralPath) shape).curveTo(14.699, 17.926, 14.910001, 18.047, 15.227001, 18.242);
        ((GeneralPath) shape).curveTo(15.539001, 18.441, 15.840001, 18.566, 16.129002, 18.625);
        ((GeneralPath) shape).curveTo(16.598001, 18.75, 17.020002, 18.746, 17.391, 18.617);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.687999725341797, -5.709000110626221), new Point2D.Double(28.711999893188477, -5.709000110626221), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_66

        // _0_0_1_0_0_0_0_0_0_66_0

        // _0_0_1_0_0_0_0_0_0_66_0_0

        // _0_0_1_0_0_0_0_0_0_66_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.449, 18.047);
        ((GeneralPath) shape).curveTo(15.7300005, 18.023, 16.145, 18.062, 16.691, 18.160002);
        ((GeneralPath) shape).lineTo(17.051, 18.133001);
        ((GeneralPath) shape).curveTo(16.574001, 17.906002, 16.145, 17.812002, 15.766001, 17.840002);
        ((GeneralPath) shape).curveTo(15.168001, 17.887003, 14.598001, 18.152002, 14.051001, 18.637003);
        ((GeneralPath) shape).curveTo(13.715, 18.945004, 13.098001, 19.133003, 12.199, 19.203003);
        ((GeneralPath) shape).curveTo(11.941, 19.223003, 11.645, 19.176003, 11.316, 19.062002);
        ((GeneralPath) shape).lineTo(10.914, 18.914001);
        ((GeneralPath) shape).lineTo(11.054999, 19.172);
        ((GeneralPath) shape).lineTo(11.343999, 19.391);
        ((GeneralPath) shape).curveTo(11.593999, 19.531, 11.890999, 19.59, 12.226999, 19.562);
        ((GeneralPath) shape).curveTo(13.0859995, 19.496, 13.749999, 19.262001, 14.218999, 18.863);
        ((GeneralPath) shape).curveTo(14.800999, 18.336, 15.210999, 18.062, 15.448999, 18.047);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(17.312000274658203, -4.400400161743164), new Point2D.Double(27.58799934387207, -4.400400161743164), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_67

        // _0_0_1_0_0_0_0_0_0_67_0

        // _0_0_1_0_0_0_0_0_0_67_0_0

        // _0_0_1_0_0_0_0_0_0_67_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.121, 20.852);
        ((GeneralPath) shape).curveTo(16.359001, 21.074, 16.562, 21.008, 16.738, 20.651999);
        ((GeneralPath) shape).lineTo(16.617, 20.663998);
        ((GeneralPath) shape).curveTo(16.52, 20.671997, 16.383001, 20.601997, 16.211, 20.452997);
        ((GeneralPath) shape).curveTo(16.016, 20.269997, 15.887, 20.046997, 15.828, 19.792997);
        ((GeneralPath) shape).curveTo(15.77, 19.554996, 15.891, 19.296997, 16.188, 19.011997);
        ((GeneralPath) shape).curveTo(16.355, 18.835997, 16.586, 18.608997, 16.887, 18.323997);
        ((GeneralPath) shape).curveTo(17.344, 17.745998, 17.585999, 17.284998, 17.620998, 16.940998);
        ((GeneralPath) shape).curveTo(17.655998, 16.620998, 17.507998, 16.397999, 17.179998, 16.284998);
        ((GeneralPath) shape).lineTo(17.647999, 16.128998);
        ((GeneralPath) shape).lineTo(17.723, 15.940998);
        ((GeneralPath) shape).curveTo(17.366999, 16.030998, 17.098, 16.140999, 16.906, 16.276999);
        ((GeneralPath) shape).curveTo(16.793, 16.347998, 16.789, 16.437998, 16.898, 16.546999);
        ((GeneralPath) shape).curveTo(17.094, 16.734, 17.203001, 16.874998, 17.230001, 16.973);
        ((GeneralPath) shape).curveTo(17.285002, 17.147999, 17.223001, 17.355, 17.039001, 17.59);
        ((GeneralPath) shape).curveTo(16.984001, 17.676, 16.738, 17.965, 16.293001, 18.461);
        ((GeneralPath) shape).curveTo(15.977001, 18.766, 15.781001, 18.953001, 15.707001, 19.02);
        ((GeneralPath) shape).curveTo(15.594001, 19.129, 15.512001, 19.336, 15.453001, 19.641);
        ((GeneralPath) shape).curveTo(15.379001, 19.969, 15.4730015, 20.262001, 15.734001, 20.52);
        ((GeneralPath) shape).curveTo(15.8480015, 20.672, 15.977001, 20.781, 16.121, 20.852001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(24.687999725341797, -4.400899887084961), new Point2D.Double(29.01099967956543, -4.400899887084961), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_68

        // _0_0_1_0_0_0_0_0_0_68_0

        // _0_0_1_0_0_0_0_0_0_68_0_0

        // _0_0_1_0_0_0_0_0_0_68_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.402, 18.941);
        ((GeneralPath) shape).curveTo(19.754, 19.094, 19.945, 18.969, 19.973, 18.562);
        ((GeneralPath) shape).curveTo(19.605, 18.473, 19.336, 18.332, 19.16, 18.148);
        ((GeneralPath) shape).curveTo(18.938, 17.883001, 18.469, 17.66, 17.754, 17.473001);
        ((GeneralPath) shape).curveTo(17.445, 17.379002, 17.164, 17.238, 16.906, 17.059002);
        ((GeneralPath) shape).curveTo(16.609, 16.840002, 16.375, 16.680002, 16.207, 16.570002);
        ((GeneralPath) shape).curveTo(15.7890005, 16.344002, 15.371, 16.246002, 14.949, 16.277002);
        ((GeneralPath) shape).curveTo(14.812, 16.289001, 14.773001, 16.191002, 14.836, 15.988003);
        ((GeneralPath) shape).curveTo(14.871, 15.906003, 14.9140005, 15.809003, 14.965, 15.707003);
        ((GeneralPath) shape).lineTo(14.559, 15.887003);
        ((GeneralPath) shape).curveTo(14.527, 15.9920025, 14.516, 16.102003, 14.523, 16.223003);
        ((GeneralPath) shape).curveTo(14.561999, 16.441004, 14.698999, 16.539003, 14.941, 16.520004);
        ((GeneralPath) shape).curveTo(15.199, 16.500004, 15.422, 16.523005, 15.605, 16.590004);
        ((GeneralPath) shape).curveTo(15.7109995, 16.641005, 15.929999, 16.766005, 16.27, 16.957005);
        ((GeneralPath) shape).curveTo(16.457, 17.062004, 16.719, 17.234005, 17.059, 17.469004);
        ((GeneralPath) shape).curveTo(17.375, 17.645004, 17.695, 17.781004, 18.023, 17.875004);
        ((GeneralPath) shape).curveTo(18.535, 18.016005, 18.996, 18.371004, 19.402, 18.941004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(23.63800048828125, -6.205100059509277), new Point2D.Double(32.362998962402344, -6.205100059509277), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_69

        // _0_0_1_0_0_0_0_0_0_69_0

        // _0_0_1_0_0_0_0_0_0_69_0_0

        // _0_0_1_0_0_0_0_0_0_69_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.5, 16.965);
        ((GeneralPath) shape).curveTo(13.332, 16.898, 13.113, 16.754, 12.836, 16.535);
        ((GeneralPath) shape).curveTo(12.555, 16.316, 12.242001, 16.148, 11.891001, 16.035);
        ((GeneralPath) shape).curveTo(11.500001, 15.906, 11.176001, 15.832, 10.910001, 15.812);
        ((GeneralPath) shape).lineTo(10.312001, 15.859);
        ((GeneralPath) shape).lineTo(10.449001, 16.031);
        ((GeneralPath) shape).curveTo(10.664001, 16.254, 11.129002, 16.418, 11.840001, 16.523);
        ((GeneralPath) shape).curveTo(12.168001, 16.598001, 12.395001, 16.66, 12.516001, 16.711);
        ((GeneralPath) shape).curveTo(12.645, 16.781, 12.762001, 16.902, 12.875001, 17.074001);
        ((GeneralPath) shape).curveTo(12.992001, 17.246002, 13.359001, 17.328001, 13.980001, 17.316002);
        ((GeneralPath) shape).curveTo(14.504002, 17.336002, 14.941002, 17.305002, 15.293001, 17.215002);
        ((GeneralPath) shape).curveTo(15.688002, 17.125002, 15.594001, 17.062002, 15.008001, 17.027002);
        ((GeneralPath) shape).curveTo(14.414001, 17.133003, 13.914001, 17.113003, 13.500001, 16.965002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.687999725341797, -8.112799644470215), new Point2D.Double(25.11199951171875, -8.112799644470215), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_70

        // _0_0_1_0_0_0_0_0_0_70_0

        // _0_0_1_0_0_0_0_0_0_70_0_0

        // _0_0_1_0_0_0_0_0_0_70_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.082, 18.531);
        ((GeneralPath) shape).curveTo(13.469, 18.383, 13.828, 18.203001, 14.151999, 17.996);
        ((GeneralPath) shape).curveTo(14.245999, 17.93, 14.464999, 17.75, 14.801, 17.465);
        ((GeneralPath) shape).curveTo(15.007999, 17.289, 15.25, 17.168, 15.526999, 17.105);
        ((GeneralPath) shape).curveTo(15.761999, 17.046999, 16.116999, 16.961, 16.59, 16.844);
        ((GeneralPath) shape).curveTo(17.004, 16.75, 17.34, 16.703, 17.602, 16.703);
        ((GeneralPath) shape).lineTo(18.866999, 16.710999);
        ((GeneralPath) shape).curveTo(18.503998, 16.694998, 18.124998, 16.602, 17.73, 16.421999);
        ((GeneralPath) shape).curveTo(17.312, 16.234, 16.406, 16.438, 15.007999, 17.026999);
        ((GeneralPath) shape).curveTo(14.66, 17.175999, 14.214999, 17.512, 13.671999, 18.034998);
        ((GeneralPath) shape).curveTo(13.487999, 18.229998, 13.229999, 18.378998, 12.897999, 18.483997);
        ((GeneralPath) shape).lineTo(12.452999, 18.581997);
        ((GeneralPath) shape).curveTo(12.4609995, 18.679996, 12.667999, 18.663998, 13.081999, 18.530996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.913000106811523, -6.273900032043457), new Point2D.Double(31.08799934387207, -6.273900032043457), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_71

        // _0_0_1_0_0_0_0_0_0_71_0

        // _0_0_1_0_0_0_0_0_0_71_0_0

        // _0_0_1_0_0_0_0_0_0_71_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.332, 18.043);
        ((GeneralPath) shape).lineTo(18.613, 18.460999);
        ((GeneralPath) shape).curveTo(17.867, 18.921999, 17.398, 19.116999, 17.215, 19.050999);
        ((GeneralPath) shape).curveTo(16.836, 18.819998, 16.543, 18.671999, 16.336, 18.609);
        ((GeneralPath) shape).curveTo(15.316, 18.406, 14.777, 18.309, 14.719001, 18.311998);
        ((GeneralPath) shape).curveTo(14.418001, 18.296999, 14.082001, 18.241999, 13.715001, 18.151999);
        ((GeneralPath) shape).curveTo(13.262001, 18.026999, 12.969001, 17.890999, 12.840001, 17.737999);
        ((GeneralPath) shape).curveTo(12.727001, 17.605, 12.496001, 17.473, 12.145001, 17.339998);
        ((GeneralPath) shape).curveTo(11.672002, 17.198997, 11.406001, 17.108997, 11.340001, 17.073997);
        ((GeneralPath) shape).lineTo(10.527001, 16.683998);
        ((GeneralPath) shape).lineTo(10.273002, 16.886997);
        ((GeneralPath) shape).lineTo(11.105001, 17.120996);
        ((GeneralPath) shape).curveTo(11.703001, 17.315996, 12.160002, 17.519997, 12.477001, 17.737997);
        ((GeneralPath) shape).curveTo(13.133001, 18.167997, 13.977001, 18.433996, 15.008001, 18.530996);
        ((GeneralPath) shape).curveTo(15.430001, 18.577997, 15.840001, 18.675997, 16.234001, 18.827997);
        ((GeneralPath) shape).curveTo(16.441002, 18.909998, 16.711, 19.030996, 17.043001, 19.183998);
        ((GeneralPath) shape).curveTo(17.418001, 19.354998, 18.031002, 19.128998, 18.887001, 18.499998);
        ((GeneralPath) shape).lineTo(19.492, 18.151999);
        ((GeneralPath) shape).lineTo(19.332, 18.043);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.5, -5.634300231933594), new Point2D.Double(31.625, -5.634300231933594), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_72

        // _0_0_1_0_0_0_0_0_0_72_0

        // _0_0_1_0_0_0_0_0_0_72_0_0

        // _0_0_1_0_0_0_0_0_0_72_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.84, 17.738);
        ((GeneralPath) shape).curveTo(12.977, 17.707, 13.562, 17.754002, 14.594, 17.871);
        ((GeneralPath) shape).curveTo(14.898, 17.93, 15.25, 17.922, 15.6449995, 17.852001);
        ((GeneralPath) shape).curveTo(16.043, 17.801, 16.366999, 17.703001, 16.616999, 17.562);
        ((GeneralPath) shape).curveTo(17.039, 17.348, 17.484, 17.266, 17.949, 17.309);
        ((GeneralPath) shape).lineTo(18.612999, 17.348);
        ((GeneralPath) shape).curveTo(18.425999, 17.241999, 18.168, 17.16, 17.844, 17.105);
        ((GeneralPath) shape).curveTo(17.641, 17.062, 17.362999, 17.112999, 17.012, 17.262);
        ((GeneralPath) shape).curveTo(16.956999, 17.285, 16.655998, 17.421999, 16.112999, 17.664);
        ((GeneralPath) shape).curveTo(15.897999, 17.758, 15.487999, 17.781, 14.882999, 17.73);
        ((GeneralPath) shape).curveTo(14.016, 17.656, 13.448999, 17.621, 13.190999, 17.621);
        ((GeneralPath) shape).curveTo(12.7109995, 17.637001, 12.323999, 17.707, 12.030999, 17.832);
        ((GeneralPath) shape).curveTo(11.804999, 17.969, 11.628999, 18.062, 11.511999, 18.113);
        ((GeneralPath) shape).lineTo(12.116999, 18.125);
        ((GeneralPath) shape).lineTo(12.839998, 17.738);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(18.424999237060547, -6.083499908447266), new Point2D.Double(30.274999618530273, -6.083499908447266), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59816f, -0.0468f, 0.0468f, 0.59816f, 0.7739f, 22.384f)));
        g.fill(shape);

        // _0_0_1_0_0_0_0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.469, 15.512);
        ((GeneralPath) shape).lineTo(28.336, 15.441);
        ((GeneralPath) shape).curveTo(28.367, 15.32, 28.375, 15.16, 28.359001, 14.961);
        ((GeneralPath) shape).curveTo(28.246, 13.504001, 26.781002, 12.375, 23.973001, 11.570001);
        ((GeneralPath) shape).curveTo(21.160002, 10.77, 17.820002, 10.52, 13.953001, 10.820001);
        ((GeneralPath) shape).curveTo(10.082001, 11.125001, 6.824001, 11.891001, 4.172001, 13.121);
        ((GeneralPath) shape).curveTo(1.5200009, 14.352, 0.25000095, 15.695, 0.36300087, 17.148);
        ((GeneralPath) shape).lineTo(0.46100086, 17.625);
        ((GeneralPath) shape).lineTo(1.480001, 17.543);
        ((GeneralPath) shape).lineTo(1.457001, 17.272999);
        ((GeneralPath) shape).curveTo(1.355001, 15.979999, 2.5350008, 14.780998, 5.000001, 13.687999);
        ((GeneralPath) shape).curveTo(7.4570007, 12.573998, 10.484001, 11.874999, 14.074001, 11.593999);
        ((GeneralPath) shape).curveTo(17.68, 11.311999, 20.789001, 11.530999, 23.391003, 12.249999);
        ((GeneralPath) shape).curveTo(25.992002, 12.948999, 27.348003, 13.944999, 27.449003, 15.241999);
        ((GeneralPath) shape).lineTo(27.469004, 15.511999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_1_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_1_0_0_1

        // _0_0_1_0_0_1_0

        // _0_0_1_0_0_1_0_0

        // _0_0_1_0_0_1_0_0_0

        // _0_0_1_0_0_1_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.184, 7.418);
        ((GeneralPath) shape).curveTo(14.273, 7.426, 14.512, 7.4490004, 14.895, 7.48);
        ((GeneralPath) shape).curveTo(15.281, 7.512, 15.68, 7.594, 16.086, 7.719);
        ((GeneralPath) shape).curveTo(16.492, 7.844, 16.992, 7.797, 17.594, 7.5699997);
        ((GeneralPath) shape).curveTo(18.195, 7.3519998, 19.516, 7.613, 21.555, 8.358999);
        ((GeneralPath) shape).curveTo(23.598, 9.101999, 23.789, 8.742, 22.129, 7.2769995);
        ((GeneralPath) shape).curveTo(20.469, 5.8119993, 17.265999, 5.3909993, 12.523, 6.0119996);
        ((GeneralPath) shape).curveTo(7.777, 6.6369996, 5.258, 7.7699995, 4.9649997, 9.417999);
        ((GeneralPath) shape).curveTo(5.2339997, 9.718999, 5.7809997, 9.671999, 6.594, 9.272999);
        ((GeneralPath) shape).curveTo(7.41, 8.874999, 8.012, 8.659999, 8.3949995, 8.620998);
        ((GeneralPath) shape).curveTo(8.7699995, 8.589998, 9.202999, 8.425999, 9.695, 8.128999);
        ((GeneralPath) shape).curveTo(10.188, 7.831999, 10.667999, 7.7499986, 11.132999, 7.882999);
        ((GeneralPath) shape).curveTo(11.598, 8.015999, 12.073999, 7.979999, 12.57, 7.784999);
        ((GeneralPath) shape).curveTo(13.073999, 7.581999, 13.445, 7.468999, 13.688, 7.440999);
        ((GeneralPath) shape).curveTo(13.926, 7.4179993, 14.09, 7.409999, 14.184, 7.4179993);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFB666666, true));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_1_0_0_1

        // _0_0_2

        // _0_0_2_0

        // _0_0_2_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_2_0_0_0

        // _0_0_2_0_0_0_0

        // _0_0_2_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.598, 22.262);
        ((GeneralPath) shape).lineTo(27.715, 22.304998);
        ((GeneralPath) shape).curveTo(27.195, 19.758, 25.766, 17.565998, 23.426, 15.733998);
        ((GeneralPath) shape).curveTo(21.027, 13.854999, 18.188, 12.741999, 14.906, 12.397999);
        ((GeneralPath) shape).curveTo(11.602, 12.054998, 8.586, 12.561998, 5.8480005, 13.925999);
        ((GeneralPath) shape).curveTo(3.1330006, 15.269999, 1.2890005, 17.147999, 0.31200075, 19.558998);
        ((GeneralPath) shape).lineTo(0.5270008, 19.522999);
        ((GeneralPath) shape).curveTo(1.3630009, 19.008, 3.059001, 18.679998, 5.605001, 18.546999);
        ((GeneralPath) shape).curveTo(8.172001, 18.433998, 11.086, 18.546999, 14.3480015, 18.887);
        ((GeneralPath) shape).curveTo(17.512001, 19.219, 20.316002, 19.703, 22.762001, 20.339998);
        ((GeneralPath) shape).curveTo(25.191002, 20.956999, 26.805, 21.597998, 27.598001, 22.262);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD9D9D9));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_1

        // _0_0_2_0_0_0_0_0_0_1_0

        // _0_0_2_0_0_0_0_0_0_1_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.535, 19.281);
        ((GeneralPath) shape).lineTo(16.301, 12.605);
        ((GeneralPath) shape).lineTo(14.906, 12.398);
        ((GeneralPath) shape).curveTo(14.348001, 12.34, 13.797, 12.311999, 13.254, 12.316);
        ((GeneralPath) shape).curveTo(12.5859995, 12.348, 11.82, 12.469, 10.952999, 12.68);
        ((GeneralPath) shape).curveTo(10.065999, 12.91, 9.311999, 13.184, 8.695, 13.5);
        ((GeneralPath) shape).curveTo(6.7419996, 14.5, 5.191, 15.688, 4.0429997, 17.055);
        ((GeneralPath) shape).curveTo(3.4689999, 17.738, 3.0939999, 18.324001, 2.9259996, 18.809);
        ((GeneralPath) shape).lineTo(4.5389996, 18.645);
        ((GeneralPath) shape).curveTo(7.3199997, 18.414, 10.59, 18.492, 14.348, 18.887001);
        ((GeneralPath) shape).lineTo(17.535, 19.281);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-22.461000442504883, -32.38399887084961), new Point2D.Double(-6.760900020599365, -32.38399887084961), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(0.59692f, 0.06049f, -0.06049f, 0.59692f, 16.856f, 35.937f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_2

        // _0_0_2_0_0_0_0_0_0_2_0

        // _0_0_2_0_0_0_0_0_0_2_0_0

        // _0_0_2_0_0_0_0_0_0_2_0_0_0

        // _0_0_2_0_0_0_0_0_0_2_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_2_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_2_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_2_0_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_2_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.465, 20.309);
        ((GeneralPath) shape).curveTo(24.23, 20.734, 25.602001, 21.18, 26.578, 21.645);
        ((GeneralPath) shape).curveTo(26.456999, 21.066, 26.237999, 20.453001, 25.925999, 19.797);
        ((GeneralPath) shape).curveTo(25.293, 18.543001, 24.262, 17.238, 22.835999, 15.883001);
        ((GeneralPath) shape).curveTo(21.734, 14.863001, 20.293, 13.949001, 18.508, 13.137001);
        ((GeneralPath) shape).lineTo(17.129, 12.781001);
        ((GeneralPath) shape).curveTo(19.425999, 13.887001, 20.984, 15.309001, 21.809, 17.043001);
        ((GeneralPath) shape).curveTo(22.191, 17.805, 22.41, 18.512001, 22.461, 19.160002);
        ((GeneralPath) shape).curveTo(22.508001, 19.508001, 22.508001, 19.891003, 22.465, 20.309002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x595959));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_3

        // _0_0_2_0_0_0_0_0_0_3_0

        // _0_0_2_0_0_0_0_0_0_3_0_0

        // _0_0_2_0_0_0_0_0_0_3_0_0_0

        // _0_0_2_0_0_0_0_0_0_3_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_3_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_3_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_3_0_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_3_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.703, 12.867);
        ((GeneralPath) shape).curveTo(6.719, 13.382999, 4.992, 14.226999, 3.5230002, 15.401999);
        ((GeneralPath) shape).curveTo(2.0310001, 16.574, 0.9610002, 17.956999, 0.31200027, 19.559);
        ((GeneralPath) shape).lineTo(0.5270003, 19.523);
        ((GeneralPath) shape).lineTo(1.0040003, 19.301);
        ((GeneralPath) shape).curveTo(1.4220003, 18.379, 2.0390003, 17.457, 2.8590002, 16.539001);
        ((GeneralPath) shape).curveTo(4.453, 14.754002, 6.4020004, 13.531002, 8.703, 12.867002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_4

        // _0_0_2_0_0_0_0_0_0_4_0

        // _0_0_2_0_0_0_0_0_0_4_0_0

        // _0_0_2_0_0_0_0_0_0_4_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.129, 26.652);
        ((GeneralPath) shape).curveTo(25.875, 25.934, 27.324, 24.879, 27.469, 23.484001);
        ((GeneralPath) shape).curveTo(27.617, 22.074001, 26.418, 20.742, 23.875, 19.492);
        ((GeneralPath) shape).curveTo(21.355, 18.223, 18.223, 17.391, 14.484, 17.0);
        ((GeneralPath) shape).curveTo(10.766001, 16.613, 7.531, 16.777, 4.781, 17.492);
        ((GeneralPath) shape).curveTo(2.055, 18.195, 0.6170001, 19.25, 0.46900034, 20.664001);
        ((GeneralPath) shape).curveTo(0.32400036, 22.055002, 1.5120003, 23.387001, 4.031, 24.656002);
        ((GeneralPath) shape).curveTo(6.5740004, 25.926003, 9.703, 26.754002, 13.422, 27.145002);
        ((GeneralPath) shape).curveTo(17.145, 27.535002, 20.379, 27.371002, 23.129, 26.652002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(0.7997999787330627, -8.600099563598633), new Point2D.Double(46.04999923706055, -8.600099563598633), new float[]{0, 1}, new Color[]{new Color(0x7D7D7D), new Color(0xD4D4D4)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.82, 23.883);
        ((GeneralPath) shape).lineTo(26.953, 23.793);
        ((GeneralPath) shape).curveTo(26.647999, 25.008, 25.195, 25.914, 22.598, 26.504);
        ((GeneralPath) shape).curveTo(20.022999, 27.102, 16.995998, 27.215, 13.516, 26.852);
        ((GeneralPath) shape).curveTo(10.055, 26.491999, 7.125, 25.75, 4.727, 24.637);
        ((GeneralPath) shape).curveTo(2.3120003, 23.519999, 1.0780003, 22.335999, 1.0270002, 21.081999);
        ((GeneralPath) shape).lineTo(0.012000203, 20.977);
        ((GeneralPath) shape).curveTo(0.19100021, 22.362999, 1.5550002, 23.651999, 4.102, 24.844);
        ((GeneralPath) shape).curveTo(6.691, 26.039, 9.797001, 26.824, 13.418, 27.203);
        ((GeneralPath) shape).curveTo(17.059, 27.585999, 20.258, 27.456999, 23.02, 26.82);
        ((GeneralPath) shape).curveTo(25.758, 26.184, 27.359001, 25.203, 27.82, 23.883);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_6

        // _0_0_2_0_0_0_0_0_0_6_0

        // _0_0_2_0_0_0_0_0_0_6_0_0

        // _0_0_2_0_0_0_0_0_0_6_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.047, 21.227);
        ((GeneralPath) shape).curveTo(24.906, 20.401999, 23.871, 19.741999, 22.938002, 19.241999);
        ((GeneralPath) shape).curveTo(21.227001, 18.276999, 19.527002, 17.699, 17.840002, 17.503998);
        ((GeneralPath) shape).curveTo(12.703002, 16.843998, 8.730002, 16.851997, 5.9260025, 17.522997);
        ((GeneralPath) shape).curveTo(4.5620027, 17.862997, 3.4530025, 18.261997, 2.6020026, 18.714996);
        ((GeneralPath) shape).lineTo(1.7270026, 19.284996);
        ((GeneralPath) shape).curveTo(1.6210027, 19.554996, 1.6910026, 19.913996, 1.9450026, 20.362995);
        ((GeneralPath) shape).curveTo(2.1640027, 20.769995, 2.4730024, 21.124994, 2.8630025, 21.425995);
        ((GeneralPath) shape).curveTo(3.1210024, 21.632996, 3.6950026, 21.925995, 4.5780025, 22.296995);
        ((GeneralPath) shape).curveTo(5.4650025, 22.690994, 6.062002, 23.007996, 6.3830023, 23.241995);
        ((GeneralPath) shape).curveTo(7.406002, 24.030994, 8.707003, 24.538996, 10.293002, 24.765995);
        ((GeneralPath) shape).curveTo(10.668002, 24.823996, 11.613002, 24.952995, 13.1170025, 25.151995);
        ((GeneralPath) shape).curveTo(14.387003, 25.323996, 15.379003, 25.479994, 16.086002, 25.612995);
        ((GeneralPath) shape).curveTo(17.348001, 25.847996, 19.023003, 25.718996, 21.105003, 25.233995);
        ((GeneralPath) shape).curveTo(22.898003, 24.796995, 24.164003, 24.425995, 24.898003, 24.120995);
        ((GeneralPath) shape).curveTo(25.590002, 23.851995, 26.102003, 23.413994, 26.426003, 22.804995);
        ((GeneralPath) shape).curveTo(26.797003, 22.116995, 26.672003, 21.593994, 26.047003, 21.226995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(2.6078999042510986, -9.976099967956543), new Point2D.Double(44.382999420166016, -9.976099967956543), new float[]{0, 1}, new Color[]{new Color(0xA67C3C), new Color(0x85612D)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.914, 20.781);
        ((GeneralPath) shape).curveTo(6.047, 20.691, 6.109, 20.559, 6.109, 20.379);
        ((GeneralPath) shape).curveTo(6.105, 20.195, 6.039, 20.059, 5.9100003, 19.965);
        ((GeneralPath) shape).curveTo(5.8120003, 19.914, 5.6250005, 19.895, 5.3440003, 19.906);
        ((GeneralPath) shape).curveTo(4.977, 19.945, 4.7030005, 19.961, 4.5230002, 19.941);
        ((GeneralPath) shape).curveTo(3.9490004, 19.879, 3.7930002, 20.105, 4.0620003, 20.617);
        ((GeneralPath) shape).curveTo(4.1990004, 20.852001, 4.4570003, 20.988, 4.8320003, 21.027);
        ((GeneralPath) shape).curveTo(5.2300005, 21.07, 5.5940003, 20.988, 5.9140005, 20.781);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.914, 21.609);
        ((GeneralPath) shape).curveTo(6.801, 21.535, 6.621, 21.535, 6.3710003, 21.609);
        ((GeneralPath) shape).lineTo(5.7380004, 21.879);
        ((GeneralPath) shape).lineTo(5.8630004, 22.133);
        ((GeneralPath) shape).curveTo(5.9690003, 22.305, 6.09, 22.375, 6.234, 22.352);
        ((GeneralPath) shape).lineTo(7.434, 22.112999);
        ((GeneralPath) shape).curveTo(7.473, 22.116999, 7.301, 21.949, 6.914, 21.609);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.426, 19.719);
        ((GeneralPath) shape).curveTo(4.238, 19.617, 4.008, 19.594, 3.742, 19.648);
        ((GeneralPath) shape).curveTo(3.559, 19.668001, 3.4880002, 19.742, 3.539, 19.867);
        ((GeneralPath) shape).lineTo(3.668, 20.062);
        ((GeneralPath) shape).lineTo(3.777, 19.863);
        ((GeneralPath) shape).curveTo(3.871, 19.730001, 4.09, 19.684, 4.426, 19.719002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_10

        // _0_0_2_0_0_0_0_0_0_10_0

        // _0_0_2_0_0_0_0_0_0_10_0_0

        // _0_0_2_0_0_0_0_0_0_10_0_0_0

        // _0_0_2_0_0_0_0_0_0_10_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_10_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_10_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_10_0_0_0_0_0_0_0

        // _0_0_2_0_0_0_0_0_0_10_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.977, 23.359);
        ((GeneralPath) shape).curveTo(26.331999, 23.015999, 26.539, 22.664, 26.598, 22.309);
        ((GeneralPath) shape).lineTo(26.43, 22.473);
        ((GeneralPath) shape).curveTo(25.82, 23.312, 24.859001, 23.836, 23.551, 24.043);
        ((GeneralPath) shape).curveTo(23.203001, 24.105, 22.625, 24.156, 21.816, 24.191);
        ((GeneralPath) shape).curveTo(20.949, 24.223, 20.188, 24.281, 19.535, 24.375);
        ((GeneralPath) shape).curveTo(18.801, 24.48, 17.945, 24.461, 16.977, 24.32);
        ((GeneralPath) shape).curveTo(15.870999, 24.121, 14.98, 23.987999, 14.304999, 23.918);
        ((GeneralPath) shape).curveTo(12.155999, 23.695, 10.667999, 23.508, 9.8359995, 23.359);
        ((GeneralPath) shape).curveTo(9.242, 23.276999, 8.438, 22.921999, 7.4139996, 22.293);
        ((GeneralPath) shape).curveTo(6.4919996, 21.715, 5.8949995, 21.262, 5.6289997, 20.929998);
        ((GeneralPath) shape).curveTo(5.4839997, 20.977, 5.312, 20.977, 5.113, 20.937998);
        ((GeneralPath) shape).curveTo(4.746, 20.815998, 4.457, 20.476997, 4.258, 19.913998);
        ((GeneralPath) shape).curveTo(4.211, 19.784998, 4.012, 19.554998, 3.664, 19.218998);
        ((GeneralPath) shape).curveTo(3.3400002, 18.882998, 3.164, 18.620998, 3.145, 18.437998);
        ((GeneralPath) shape).curveTo(2.449, 18.745998, 1.977, 19.030998, 1.727, 19.284998);
        ((GeneralPath) shape).curveTo(1.621, 19.554998, 1.691, 19.913998, 1.9449999, 20.362997);
        ((GeneralPath) shape).curveTo(2.168, 20.769997, 2.473, 21.124996, 2.863, 21.425997);
        ((GeneralPath) shape).curveTo(3.1209998, 21.632998, 3.695, 21.925997, 4.578, 22.296997);
        ((GeneralPath) shape).curveTo(5.465, 22.690996, 6.0620003, 23.007998, 6.383, 23.241997);
        ((GeneralPath) shape).curveTo(7.406, 24.030996, 8.707, 24.538998, 10.293, 24.765997);
        ((GeneralPath) shape).curveTo(10.668, 24.823997, 11.613, 24.952997, 13.117001, 25.151997);
        ((GeneralPath) shape).curveTo(14.387001, 25.323997, 15.379001, 25.479996, 16.086, 25.612997);
        ((GeneralPath) shape).curveTo(17.348, 25.847998, 19.023, 25.718998, 21.105, 25.233997);
        ((GeneralPath) shape).curveTo(22.897999, 24.796997, 24.164, 24.425997, 24.897999, 24.120996);
        ((GeneralPath) shape).curveTo(25.296999, 23.960997, 25.655998, 23.706997, 25.977, 23.358997);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.594, 22.777);
        ((GeneralPath) shape).curveTo(10.195, 23.098, 9.875, 23.465, 9.632999, 23.883);
        ((GeneralPath) shape).curveTo(9.483999, 24.129, 9.355, 24.406, 9.242, 24.715);
        ((GeneralPath) shape).lineTo(9.141, 25.129);
        ((GeneralPath) shape).lineTo(10.132999, 25.171999);
        ((GeneralPath) shape).curveTo(10.429999, 25.203, 10.823999, 25.164, 11.32, 25.054998);
        ((GeneralPath) shape).lineTo(11.73, 24.284998);
        ((GeneralPath) shape).curveTo(11.832, 24.093998, 12.004, 23.909998, 12.242, 23.733997);
        ((GeneralPath) shape).lineTo(10.594, 22.776997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.828, 23.754);
        ((GeneralPath) shape).lineTo(10.574, 23.527);
        ((GeneralPath) shape).lineTo(12.242001, 23.734001);
        ((GeneralPath) shape).lineTo(11.781, 22.93);
        ((GeneralPath) shape).lineTo(11.719, 22.684);
        ((GeneralPath) shape).curveTo(11.367, 22.387, 10.996, 22.176, 10.609, 22.055);
        ((GeneralPath) shape).lineTo(9.207001, 21.605);
        ((GeneralPath) shape).lineTo(9.211, 23.022999);
        ((GeneralPath) shape).lineTo(9.828, 23.754);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.625, 24.816);
        ((GeneralPath) shape).lineTo(10.367, 24.051);
        ((GeneralPath) shape).curveTo(10.483999, 23.902, 10.554999, 23.727001, 10.573999, 23.527);
        ((GeneralPath) shape).curveTo(10.285, 23.418001, 10.061999, 23.242, 9.905999, 23.008001);
        ((GeneralPath) shape).curveTo(9.839999, 22.879002, 9.776999, 22.691002, 9.723, 22.445002);
        ((GeneralPath) shape).curveTo(9.684, 22.238, 9.629, 22.094002, 9.559, 22.004002);
        ((GeneralPath) shape).lineTo(9.207, 21.605001);
        ((GeneralPath) shape).curveTo(8.601999, 22.188002, 8.285, 22.543001, 8.25, 22.684002);
        ((GeneralPath) shape).curveTo(8.223, 22.762001, 8.297, 23.090002, 8.477, 23.672003);
        ((GeneralPath) shape).curveTo(8.6640005, 24.215002, 8.820001, 24.621002, 8.953, 24.898003);
        ((GeneralPath) shape).curveTo(9.117, 25.258003, 9.34, 25.230003, 9.625, 24.816002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.492, 23.918);
        ((GeneralPath) shape).lineTo(18.816, 23.184);
        ((GeneralPath) shape).curveTo(18.746, 23.055, 18.613, 22.91, 18.406, 22.75);
        ((GeneralPath) shape).lineTo(18.129, 22.539);
        ((GeneralPath) shape).lineTo(17.059, 22.969);
        ((GeneralPath) shape).lineTo(17.75, 24.703);
        ((GeneralPath) shape).lineTo(19.344, 24.477);
        ((GeneralPath) shape).lineTo(19.492, 23.918);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.066, 24.691);
        ((GeneralPath) shape).lineTo(17.862999, 24.199);
        ((GeneralPath) shape).lineTo(17.887, 23.691);
        ((GeneralPath) shape).lineTo(18.129, 22.539);
        ((GeneralPath) shape).lineTo(18.035, 22.559);
        ((GeneralPath) shape).lineTo(16.546999, 22.645);
        ((GeneralPath) shape).lineTo(16.015999, 22.832);
        ((GeneralPath) shape).curveTo(15.995998, 22.828001, 15.745998, 22.895, 15.272999, 23.023);
        ((GeneralPath) shape).curveTo(15.003999, 23.098001, 14.772999, 23.172, 14.585999, 23.254002);
        ((GeneralPath) shape).lineTo(13.331999, 23.695002);
        ((GeneralPath) shape).lineTo(13.190999, 24.738);
        ((GeneralPath) shape).lineTo(15.065999, 24.691);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.395, 24.891);
        ((GeneralPath) shape).curveTo(18.809, 24.773, 19.125, 24.633001, 19.344, 24.477001);
        ((GeneralPath) shape).lineTo(18.41, 24.168001);
        ((GeneralPath) shape).lineTo(17.887, 23.691002);
        ((GeneralPath) shape).curveTo(17.688, 23.668001, 17.401999, 23.711002, 17.030998, 23.812002);
        ((GeneralPath) shape).lineTo(13.190998, 24.738003);
        ((GeneralPath) shape).lineTo(13.905998, 25.414003);
        ((GeneralPath) shape).lineTo(14.679998, 25.797003);
        ((GeneralPath) shape).lineTo(16.085999, 25.613003);
        ((GeneralPath) shape).curveTo(16.620998, 25.508003, 17.390999, 25.266003, 18.394999, 24.891003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.828, 20.422);
        ((GeneralPath) shape).lineTo(7.094, 21.055);
        ((GeneralPath) shape).lineTo(10.609, 22.055);
        ((GeneralPath) shape).lineTo(10.742001, 21.918001);
        ((GeneralPath) shape).curveTo(10.836, 21.805, 10.875001, 21.699001, 10.867001, 21.598001);
        ((GeneralPath) shape).curveTo(10.867001, 21.398, 10.727, 21.281002, 10.449, 21.254002);
        ((GeneralPath) shape).lineTo(8.395, 21.008001);
        ((GeneralPath) shape).curveTo(8.176001, 20.984001, 7.9450006, 20.871002, 7.7070003, 20.664001);
        ((GeneralPath) shape).curveTo(7.4690003, 20.461002, 7.301, 20.332, 7.203, 20.281002);
        ((GeneralPath) shape).curveTo(7.109, 20.211002, 7.035, 20.184002, 6.973, 20.195002);
        ((GeneralPath) shape).lineTo(6.879, 20.215002);
        ((GeneralPath) shape).lineTo(6.828, 20.422003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.684, 20.648);
        ((GeneralPath) shape).curveTo(6.691, 20.75, 6.73, 20.863, 6.797, 20.992);
        ((GeneralPath) shape).curveTo(6.91, 21.266, 7.0699997, 21.453001, 7.281, 21.555);
        ((GeneralPath) shape).curveTo(7.586, 21.727001, 7.961, 21.887001, 8.406, 22.035);
        ((GeneralPath) shape).curveTo(8.9140005, 22.207, 9.2890005, 22.277, 9.531, 22.242);
        ((GeneralPath) shape).curveTo(9.875, 22.219, 10.234, 22.156, 10.609, 22.055);
        ((GeneralPath) shape).curveTo(10.695001, 21.801, 10.621, 21.633, 10.391, 21.551);
        ((GeneralPath) shape).curveTo(10.332, 21.523, 10.035, 21.492, 9.492, 21.457);
        ((GeneralPath) shape).curveTo(8.953, 21.438002, 8.5, 21.34, 8.136999, 21.164001);
        ((GeneralPath) shape).curveTo(7.753999, 20.980001, 7.433999, 20.770002, 7.1799994, 20.520002);
        ((GeneralPath) shape).curveTo(7.030999, 20.402002, 6.9299994, 20.301003, 6.878999, 20.215002);
        ((GeneralPath) shape).curveTo(6.7269993, 20.320002, 6.6599994, 20.465002, 6.683999, 20.648003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.727, 23.176);
        ((GeneralPath) shape).curveTo(18.890999, 23.133001, 19.061998, 23.02, 19.241999, 22.836);
        ((GeneralPath) shape).curveTo(19.394999, 22.711, 19.769999, 22.723, 20.355, 22.863);
        ((GeneralPath) shape).curveTo(20.512, 22.898, 20.675999, 22.977001, 20.844, 23.094002);
        ((GeneralPath) shape).curveTo(20.977, 23.188002, 21.07, 23.230001, 21.133, 23.215002);
        ((GeneralPath) shape).curveTo(21.258, 23.168001, 21.328, 23.094002, 21.335999, 22.996002);
        ((GeneralPath) shape).lineTo(21.265999, 22.836002);
        ((GeneralPath) shape).curveTo(21.234, 22.734003, 21.112999, 22.629002, 20.901999, 22.527002);
        ((GeneralPath) shape).curveTo(20.655998, 22.402002, 20.394999, 22.324003, 20.112999, 22.293003);
        ((GeneralPath) shape).curveTo(19.640999, 22.223003, 19.144999, 22.254004, 18.629, 22.379004);
        ((GeneralPath) shape).curveTo(18.191, 22.496004, 17.961, 22.691004, 17.934, 22.973003);
        ((GeneralPath) shape).curveTo(17.914, 23.148003, 18.176, 23.219004, 18.727, 23.176003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.797, 23.844);
        ((GeneralPath) shape).curveTo(21.094002, 23.895, 21.387001, 23.887, 21.676, 23.816);
        ((GeneralPath) shape).curveTo(21.941, 23.742, 22.082, 23.668, 22.09, 23.586);
        ((GeneralPath) shape).curveTo(22.082, 23.484001, 21.832, 23.469, 21.34, 23.539);
        ((GeneralPath) shape).curveTo(21.219, 23.546999, 21.004, 23.491999, 20.695, 23.379);
        ((GeneralPath) shape).curveTo(20.383, 23.27, 20.156, 23.223, 20.015999, 23.25);
        ((GeneralPath) shape).curveTo(19.831999, 23.27, 19.859, 23.375, 20.102, 23.559);
        ((GeneralPath) shape).curveTo(20.328, 23.723, 20.559, 23.82, 20.796999, 23.844);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.129, 19.621);
        ((GeneralPath) shape).curveTo(12.551, 19.625, 12.667999, 19.484001, 12.473, 19.203001);
        ((GeneralPath) shape).curveTo(12.297, 18.965, 12.047, 18.785002, 11.714999, 18.672);
        ((GeneralPath) shape).curveTo(11.558999, 18.637001, 11.417999, 18.461, 11.289, 18.145);
        ((GeneralPath) shape).curveTo(11.176, 17.871, 11.0199995, 17.742, 10.816, 17.762001);
        ((GeneralPath) shape).curveTo(10.551, 17.797, 10.43, 17.973001, 10.457, 18.297);
        ((GeneralPath) shape).curveTo(10.465, 18.602001, 10.57, 18.844002, 10.773, 19.023);
        ((GeneralPath) shape).curveTo(11.215, 19.414001, 11.667999, 19.613, 12.129, 19.621);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.16, 20.957);
        ((GeneralPath) shape).curveTo(21.898, 20.992, 22.254, 20.871, 22.223, 20.586);
        ((GeneralPath) shape).curveTo(22.191, 20.301, 21.965, 20.164, 21.543, 20.18);
        ((GeneralPath) shape).curveTo(21.34, 20.18, 21.066, 20.121, 20.715, 20.004);
        ((GeneralPath) shape).curveTo(20.367, 19.867, 20.031, 19.805, 19.711, 19.809);
        ((GeneralPath) shape).curveTo(19.25, 19.801, 19.238, 19.98, 19.684, 20.348);
        ((GeneralPath) shape).curveTo(20.109, 20.715, 20.602, 20.918, 21.16, 20.956999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.688, 22.684);
        ((GeneralPath) shape).curveTo(25.140999, 22.59, 25.305, 22.457, 25.184, 22.281);
        ((GeneralPath) shape).curveTo(25.059, 22.109, 24.871, 22.008, 24.609, 21.98);
        ((GeneralPath) shape).curveTo(23.734, 21.890999, 23.262, 21.918, 23.184, 22.074);
        ((GeneralPath) shape).curveTo(23.105, 22.227, 23.254, 22.383, 23.617, 22.539);
        ((GeneralPath) shape).curveTo(24.004, 22.699, 24.359001, 22.75, 24.688, 22.684);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.223, 19.527);
        ((GeneralPath) shape).curveTo(7.605, 19.711, 7.9570003, 19.695, 8.281, 19.488);
        ((GeneralPath) shape).curveTo(8.582, 19.297, 8.672, 19.137001, 8.543, 19.004002);
        ((GeneralPath) shape).curveTo(8.453, 18.914001, 8.305, 18.867002, 8.1050005, 18.867002);
        ((GeneralPath) shape).curveTo(7.7270007, 18.848003, 7.5080004, 18.836002, 7.4450006, 18.828003);
        ((GeneralPath) shape).curveTo(7.3480005, 18.797003, 7.1880007, 18.723003, 6.9570007, 18.598003);
        ((GeneralPath) shape).curveTo(6.805001, 18.520004, 6.6640005, 18.504004, 6.5390005, 18.551003);
        ((GeneralPath) shape).curveTo(6.3710003, 18.613003, 6.3980007, 18.770002, 6.6130004, 19.012003);
        ((GeneralPath) shape).curveTo(6.7890005, 19.230003, 6.9920006, 19.402002, 7.2230005, 19.527002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.414, 20.945);
        ((GeneralPath) shape).curveTo(12.452999, 20.57, 12.573999, 20.258, 12.780999, 20.02);
        ((GeneralPath) shape).curveTo(12.058999, 20.023, 11.57, 20.043001, 11.327999, 20.078001);
        ((GeneralPath) shape).curveTo(10.819999, 20.105001, 10.468999, 20.219002, 10.265999, 20.422);
        ((GeneralPath) shape).curveTo(10.233999, 20.52, 10.214999, 20.617, 10.202999, 20.715);
        ((GeneralPath) shape).curveTo(10.159999, 20.953001, 10.151999, 21.113, 10.183999, 21.195);
        ((GeneralPath) shape).lineTo(10.409999, 22.484);
        ((GeneralPath) shape).lineTo(11.206999, 22.387);
        ((GeneralPath) shape).curveTo(11.288999, 22.355, 11.507998, 22.309, 11.854999, 22.245998);
        ((GeneralPath) shape).curveTo(12.140999, 22.214998, 12.284999, 22.179998, 12.288999, 22.140999);
        ((GeneralPath) shape).lineTo(12.413999, 20.945);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.414, 22.621);
        ((GeneralPath) shape).lineTo(12.289, 22.141);
        ((GeneralPath) shape).lineTo(11.891, 22.188002);
        ((GeneralPath) shape).lineTo(11.207, 22.387001);
        ((GeneralPath) shape).lineTo(10.41, 22.484001);
        ((GeneralPath) shape).lineTo(10.73, 22.609001);
        ((GeneralPath) shape).lineTo(11.348, 22.766);
        ((GeneralPath) shape).lineTo(11.559, 22.758001);
        ((GeneralPath) shape).lineTo(12.582, 22.805002);
        ((GeneralPath) shape).curveTo(12.757999, 22.824001, 13.039, 22.762003, 13.414, 22.621002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.289, 22.141);
        ((GeneralPath) shape).lineTo(12.7699995, 22.43);
        ((GeneralPath) shape).lineTo(13.414, 22.621);
        ((GeneralPath) shape).lineTo(13.582, 21.008);
        ((GeneralPath) shape).lineTo(13.793, 20.456999);
        ((GeneralPath) shape).lineTo(12.781, 20.019999);
        ((GeneralPath) shape).curveTo(12.6050005, 20.140999, 12.504, 20.272999, 12.469, 20.409998);
        ((GeneralPath) shape).lineTo(12.348, 20.999998);
        ((GeneralPath) shape).lineTo(12.289, 22.140999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.117, 23.023);
        ((GeneralPath) shape).lineTo(17.949001, 22.820002);
        ((GeneralPath) shape).curveTo(18.191002, 22.789001, 18.422, 22.719002, 18.633001, 22.621002);
        ((GeneralPath) shape).lineTo(17.449001, 22.105001);
        ((GeneralPath) shape).lineTo(14.793001, 22.430002);
        ((GeneralPath) shape).lineTo(15.129002, 22.648003);
        ((GeneralPath) shape).lineTo(16.117002, 23.023003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.715, 21.43);
        ((GeneralPath) shape).lineTo(14.793, 22.43);
        ((GeneralPath) shape).lineTo(17.449, 22.105);
        ((GeneralPath) shape).lineTo(17.644999, 21.102);
        ((GeneralPath) shape).lineTo(16.699, 21.215);
        ((GeneralPath) shape).curveTo(16.594, 21.242, 16.421999, 21.246, 16.184, 21.219);
        ((GeneralPath) shape).curveTo(15.922, 21.211, 15.754, 21.215, 15.672, 21.227);
        ((GeneralPath) shape).curveTo(15.305, 21.269999, 14.984, 21.335999, 14.715, 21.429998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.633, 22.621);
        ((GeneralPath) shape).lineTo(18.941, 21.688);
        ((GeneralPath) shape).lineTo(17.645, 21.102);
        ((GeneralPath) shape).lineTo(17.469, 21.625);
        ((GeneralPath) shape).lineTo(17.449, 22.105);
        ((GeneralPath) shape).lineTo(17.844, 22.359);
        ((GeneralPath) shape).curveTo(17.977, 22.434, 18.237999, 22.519999, 18.633, 22.620998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.074, 20.5);
        ((GeneralPath) shape).curveTo(17.469, 20.559, 17.691, 20.453, 17.741999, 20.176);
        ((GeneralPath) shape).curveTo(17.762, 19.977001, 17.690998, 19.789001, 17.526999, 19.609001);
        ((GeneralPath) shape).curveTo(17.366999, 19.414001, 16.999998, 19.285002, 16.421999, 19.223001);
        ((GeneralPath) shape).curveTo(16.304998, 19.211002, 16.039, 19.254002, 15.624999, 19.352001);
        ((GeneralPath) shape).lineTo(15.034999, 19.531002);
        ((GeneralPath) shape).lineTo(15.210999, 19.852001);
        ((GeneralPath) shape).lineTo(15.905998, 20.406002);
        ((GeneralPath) shape).lineTo(17.073997, 20.500002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.93, 19.902);
        ((GeneralPath) shape).curveTo(10.059, 19.797, 10.094, 19.68, 10.023001, 19.551);
        ((GeneralPath) shape).curveTo(9.793001, 19.266, 9.590001, 19.094, 9.4140005, 19.035);
        ((GeneralPath) shape).lineTo(8.609, 18.68);
        ((GeneralPath) shape).lineTo(8.336, 19.254);
        ((GeneralPath) shape).curveTo(8.254001, 19.465, 8.219001, 19.621, 8.227, 19.723);
        ((GeneralPath) shape).lineTo(8.246, 19.816);
        ((GeneralPath) shape).lineTo(8.922, 20.309);
        ((GeneralPath) shape).curveTo(9.109, 20.43, 9.2699995, 20.438, 9.401999, 20.328);
        ((GeneralPath) shape).lineTo(9.929999, 19.901999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.223, 19.785);
        ((GeneralPath) shape).lineTo(8.344, 19.766);
        ((GeneralPath) shape).curveTo(8.719, 19.625, 9.0199995, 19.457, 9.242, 19.258001);
        ((GeneralPath) shape).lineTo(9.445, 19.039001);
        ((GeneralPath) shape).lineTo(9.281, 18.871002);
        ((GeneralPath) shape).lineTo(8.949, 18.594002);
        ((GeneralPath) shape).lineTo(8.77, 18.574001);
        ((GeneralPath) shape).lineTo(8.0, 18.734001);
        ((GeneralPath) shape).lineTo(8.051, 19.102001);
        ((GeneralPath) shape).lineTo(8.223, 19.785002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.414, 18.785);
        ((GeneralPath) shape).lineTo(14.082, 18.527);
        ((GeneralPath) shape).lineTo(14.2109995, 18.75);
        ((GeneralPath) shape).curveTo(14.483999, 19.203, 14.7109995, 19.438, 14.891, 19.457);
        ((GeneralPath) shape).curveTo(14.969, 19.465, 15.047, 19.391, 15.125, 19.238);
        ((GeneralPath) shape).curveTo(15.316, 18.957, 15.41, 18.805, 15.414, 18.785002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.332, 18.781);
        ((GeneralPath) shape).lineTo(13.8359995, 19.465);
        ((GeneralPath) shape).curveTo(13.995999, 19.664, 14.2109995, 19.715, 14.48, 19.625);
        ((GeneralPath) shape).lineTo(14.983999, 19.434);
        ((GeneralPath) shape).curveTo(15.051, 19.383, 14.901999, 19.258, 14.539, 19.059);
        ((GeneralPath) shape).lineTo(14.082, 18.527);
        ((GeneralPath) shape).lineTo(13.809, 18.559);
        ((GeneralPath) shape).lineTo(13.332, 18.781);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_36

        // _0_0_2_0_0_0_0_0_0_36_0

        // _0_0_2_0_0_0_0_0_0_36_0_0

        // _0_0_2_0_0_0_0_0_0_36_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.828, 19.594);
        ((GeneralPath) shape).curveTo(5.852, 19.355, 5.664, 19.227, 5.2660003, 19.203);
        ((GeneralPath) shape).lineTo(4.781, 19.214998);
        ((GeneralPath) shape).curveTo(4.676, 19.464998, 4.691, 19.675999, 4.836, 19.851997);
        ((GeneralPath) shape).curveTo(5.047, 20.136997, 5.301, 20.190998, 5.6019998, 20.022997);
        ((GeneralPath) shape).curveTo(5.75, 19.937998, 5.8279996, 19.792997, 5.8279996, 19.593996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(7.674799919128418, -11.093000411987305), new Point2D.Double(9.524800300598145, -11.093000411987305), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_37

        // _0_0_2_0_0_0_0_0_0_37_0

        // _0_0_2_0_0_0_0_0_0_37_0_0

        // _0_0_2_0_0_0_0_0_0_37_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.906, 18.207);
        ((GeneralPath) shape).curveTo(13.941, 17.848001, 13.6640005, 17.648, 13.062, 17.605001);
        ((GeneralPath) shape).lineTo(12.34, 17.621002);
        ((GeneralPath) shape).curveTo(12.199, 17.988003, 12.234, 18.324001, 12.445, 18.625002);
        ((GeneralPath) shape).curveTo(12.762, 19.043001, 13.137, 19.121002, 13.566, 18.863003);
        ((GeneralPath) shape).curveTo(13.777, 18.746002, 13.891, 18.527002, 13.906, 18.207003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.88800048828125, -14.685999870300293), new Point2D.Double(22.613000869750977, -14.685999870300293), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_38

        // _0_0_2_0_0_0_0_0_0_38_0

        // _0_0_2_0_0_0_0_0_0_38_0_0

        // _0_0_2_0_0_0_0_0_0_38_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.57, 20.074);
        ((GeneralPath) shape).curveTo(11.605, 19.715, 11.344, 19.519999, 10.785, 19.48);
        ((GeneralPath) shape).lineTo(10.117, 19.531);
        ((GeneralPath) shape).curveTo(10.089999, 19.605, 10.07, 19.707, 10.059, 19.824);
        ((GeneralPath) shape).curveTo(10.031, 20.062, 10.082, 20.269999, 10.203, 20.445);
        ((GeneralPath) shape).curveTo(10.4800005, 20.855, 10.824, 20.941, 11.23, 20.703);
        ((GeneralPath) shape).curveTo(11.445, 20.581999, 11.559, 20.375, 11.57, 20.074);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.524999618530273, -11.227999687194824), new Point2D.Double(19.075000762939453, -11.227999687194824), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_39

        // _0_0_2_0_0_0_0_0_0_39_0

        // _0_0_2_0_0_0_0_0_0_39_0_0

        // _0_0_2_0_0_0_0_0_0_39_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.09, 23.035);
        ((GeneralPath) shape).curveTo(15.117001, 22.758, 14.8550005, 22.598, 14.297, 22.562);
        ((GeneralPath) shape).lineTo(13.633, 22.551);
        ((GeneralPath) shape).curveTo(13.6050005, 22.629, 13.586, 22.719, 13.574, 22.816);
        ((GeneralPath) shape).curveTo(13.555, 23.016, 13.6050005, 23.184, 13.734, 23.316);
        ((GeneralPath) shape).curveTo(14.0390005, 23.668, 14.383, 23.746, 14.766, 23.543);
        ((GeneralPath) shape).curveTo(14.957, 23.445, 15.066, 23.272999, 15.09, 23.035);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(22.899999618530273, -6.948200225830078), new Point2D.Double(25.399999618530273, -6.948200225830078), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_40

        // _0_0_2_0_0_0_0_0_0_40_0

        // _0_0_2_0_0_0_0_0_0_40_0_0

        // _0_0_2_0_0_0_0_0_0_40_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.484, 21.641);
        ((GeneralPath) shape).curveTo(20.522999, 21.281, 20.241999, 21.082, 19.640999, 21.039001);
        ((GeneralPath) shape).lineTo(18.914, 21.082);
        ((GeneralPath) shape).curveTo(18.883, 21.18, 18.862999, 21.289001, 18.848, 21.406);
        ((GeneralPath) shape).curveTo(18.844, 21.668, 18.897999, 21.887001, 19.022999, 22.059);
        ((GeneralPath) shape).curveTo(19.32, 22.492, 19.690998, 22.582, 20.140999, 22.328);
        ((GeneralPath) shape).curveTo(20.355, 22.188, 20.468998, 21.960999, 20.484, 21.640999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(31.38800048828125, -10.116000175476074), new Point2D.Double(34.112998962402344, -10.116000175476074), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_41

        // _0_0_2_0_0_0_0_0_0_41_0

        // _0_0_2_0_0_0_0_0_0_41_0_0
        paint1(g, origAlpha, transformations);
    }

    private static void paint1(Graphics2D g, float origAlpha, java.util.LinkedList<AffineTransform> transformations) {
        Shape shape = null;

        // _0_0_2_0_0_0_0_0_0_41_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.918, 23.688);
        ((GeneralPath) shape).curveTo(23.949, 23.41, 23.695, 23.242, 23.156, 23.188);
        ((GeneralPath) shape).lineTo(22.492, 23.206999);
        ((GeneralPath) shape).curveTo(22.465, 23.284998, 22.445, 23.370998, 22.434, 23.473);
        ((GeneralPath) shape).curveTo(22.414, 23.671999, 22.465, 23.848, 22.59, 24.0);
        ((GeneralPath) shape).curveTo(22.898, 24.336, 23.242, 24.402, 23.625, 24.199);
        ((GeneralPath) shape).curveTo(23.816, 24.098, 23.914, 23.93, 23.918, 23.688);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(37.70000076293945, -7.416500091552734), new Point2D.Double(40.20000076293945, -7.416500091552734), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_42

        // _0_0_2_0_0_0_0_0_0_42_0

        // _0_0_2_0_0_0_0_0_0_42_0_0

        // _0_0_2_0_0_0_0_0_0_42_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.211, 22.059);
        ((GeneralPath) shape).curveTo(24.426, 21.922, 24.539, 21.691, 24.555, 21.371);
        ((GeneralPath) shape).curveTo(24.59, 21.012001, 24.312, 20.812, 23.711, 20.77);
        ((GeneralPath) shape).curveTo(23.492, 20.746, 23.312, 20.75, 23.168001, 20.773);
        ((GeneralPath) shape).lineTo(23.012001, 20.816);
        ((GeneralPath) shape).curveTo(22.984001, 20.914, 22.961, 21.023, 22.949001, 21.145);
        ((GeneralPath) shape).curveTo(22.922, 21.402, 22.969002, 21.617, 23.094002, 21.793001);
        ((GeneralPath) shape).curveTo(23.410002, 22.207, 23.785002, 22.297, 24.211002, 22.059002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(38.13800048828125, -11.277999877929688), new Point2D.Double(40.862998962402344, -11.277999877929688), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.797, 25.934);
        ((GeneralPath) shape).curveTo(13.465, 25.902, 13.895, 25.824, 14.086, 25.707);
        ((GeneralPath) shape).curveTo(14.152, 25.672, 14.215, 25.547, 14.277, 25.332);
        ((GeneralPath) shape).curveTo(14.309, 25.215, 14.258, 25.141, 14.121, 25.105001);
        ((GeneralPath) shape).lineTo(13.492001, 25.039001);
        ((GeneralPath) shape).curveTo(13.273001, 25.020002, 12.973001, 24.906002, 12.594001, 24.703001);
        ((GeneralPath) shape).curveTo(12.176001, 24.461, 11.898001, 24.312, 11.766001, 24.258001);
        ((GeneralPath) shape).curveTo(11.559001, 24.113, 11.398001, 24.008001, 11.285001, 23.934002);
        ((GeneralPath) shape).curveTo(11.074, 23.832003, 10.879001, 23.793001, 10.695001, 23.812002);
        ((GeneralPath) shape).curveTo(10.496, 23.812002, 10.438001, 23.977003, 10.523001, 24.309002);
        ((GeneralPath) shape).curveTo(10.594001, 24.598001, 10.719001, 24.852001, 10.895, 25.070002);
        ((GeneralPath) shape).curveTo(11.059, 25.250002, 11.359, 25.430002, 11.805, 25.617002);
        ((GeneralPath) shape).curveTo(12.223001, 25.824003, 12.555, 25.926003, 12.797, 25.934002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.527, 19.816);
        ((GeneralPath) shape).curveTo(6.715, 19.777, 6.75, 19.719, 6.637, 19.648);
        ((GeneralPath) shape).curveTo(6.543, 19.578001, 6.418, 19.535, 6.258, 19.52);
        ((GeneralPath) shape).curveTo(6.098, 19.5, 6.062, 19.559, 6.148, 19.688);
        ((GeneralPath) shape).curveTo(6.238, 19.816, 6.363, 19.859, 6.527, 19.816);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.969, 18.918);
        ((GeneralPath) shape).curveTo(17.285, 18.953, 17.5, 18.925999, 17.609, 18.835999);
        ((GeneralPath) shape).curveTo(17.719, 18.745998, 17.691, 18.644999, 17.522999, 18.522999);
        ((GeneralPath) shape).curveTo(17.179998, 18.328, 16.793, 18.195, 16.355, 18.133);
        ((GeneralPath) shape).curveTo(15.483999, 18.0, 14.91, 18.031, 14.629, 18.223);
        ((GeneralPath) shape).curveTo(14.539, 18.312, 14.679999, 18.397999, 15.054999, 18.477);
        ((GeneralPath) shape).curveTo(15.504, 18.605, 15.737999, 18.679998, 15.754, 18.703);
        ((GeneralPath) shape).curveTo(15.828, 18.769999, 16.23, 18.844, 16.969, 18.918);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.277, 19.82);
        ((GeneralPath) shape).curveTo(21.855, 19.862999, 22.191, 19.848, 22.277, 19.777);
        ((GeneralPath) shape).curveTo(22.363, 19.703001, 22.246, 19.59, 21.922, 19.438);
        ((GeneralPath) shape).curveTo(21.406, 19.184, 20.898, 19.117, 20.402, 19.246);
        ((GeneralPath) shape).curveTo(20.156, 19.301, 20.172, 19.414, 20.457, 19.586);
        ((GeneralPath) shape).curveTo(20.723001, 19.734001, 20.996, 19.812, 21.277, 19.82);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.91, 20.996);
        ((GeneralPath) shape).curveTo(15.276999, 20.953001, 15.406, 20.855, 15.305, 20.707);
        ((GeneralPath) shape).curveTo(15.199, 20.555, 14.957001, 20.469, 14.578, 20.449001);
        ((GeneralPath) shape).curveTo(14.195, 20.430002, 14.074, 20.527, 14.215, 20.742);
        ((GeneralPath) shape).curveTo(14.328, 20.977001, 14.562, 21.059, 14.91, 20.996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.27, 18.555);
        ((GeneralPath) shape).lineTo(6.402, 18.418001);
        ((GeneralPath) shape).curveTo(6.512, 18.328001, 6.625, 18.301, 6.742, 18.332);
        ((GeneralPath) shape).lineTo(7.0350003, 18.422);
        ((GeneralPath) shape).curveTo(6.734, 18.25, 6.5000005, 18.176, 6.3360004, 18.199001);
        ((GeneralPath) shape).curveTo(6.2150006, 18.207, 6.168, 18.273, 6.1950006, 18.395);
        ((GeneralPath) shape).lineTo(6.2700005, 18.555);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.73, 19.148);
        ((GeneralPath) shape).curveTo(4.812, 19.117, 4.914, 19.086, 5.039, 19.059);
        ((GeneralPath) shape).curveTo(5.121, 19.027, 5.137, 19.0, 5.078, 18.973);
        ((GeneralPath) shape).curveTo(5.0230002, 18.925999, 4.902, 18.925999, 4.719, 18.965);
        ((GeneralPath) shape).curveTo(4.6169996, 18.973, 4.5699997, 19.012001, 4.586, 19.07);
        ((GeneralPath) shape).curveTo(4.598, 19.133, 4.648, 19.16, 4.73, 19.147999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.488, 19.105);
        ((GeneralPath) shape).curveTo(5.59, 19.098, 5.633, 19.07, 5.617, 19.027);
        ((GeneralPath) shape).curveTo(5.602, 18.988, 5.551, 18.961, 5.473, 18.953001);
        ((GeneralPath) shape).curveTo(5.3710003, 18.941002, 5.379, 18.992, 5.488, 19.105001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.555, 20.152);
        ((GeneralPath) shape).curveTo(6.562, 20.055, 6.73, 20.02, 7.047, 20.055);
        ((GeneralPath) shape).curveTo(7.246, 20.074, 7.422, 20.121, 7.574, 20.199);
        ((GeneralPath) shape).curveTo(7.395, 20.0, 7.203, 19.897999, 7.0039997, 19.897999);
        ((GeneralPath) shape).curveTo(6.6019998, 19.894999, 6.3949995, 19.953, 6.383, 20.074);
        ((GeneralPath) shape).curveTo(6.375, 20.133, 6.402, 20.168, 6.461, 20.171999);
        ((GeneralPath) shape).curveTo(6.5, 20.175999, 6.531, 20.171999, 6.555, 20.151999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.355, 19.281);
        ((GeneralPath) shape).lineTo(10.863, 19.336);
        ((GeneralPath) shape).curveTo(10.578, 19.164, 10.359, 19.051, 10.203, 18.996);
        ((GeneralPath) shape).curveTo(9.852, 18.918001, 9.613, 18.785, 9.492, 18.59);
        ((GeneralPath) shape).curveTo(9.3359995, 18.352, 9.054999, 18.242, 8.651999, 18.262001);
        ((GeneralPath) shape).curveTo(8.448999, 18.258001, 8.285, 18.312, 8.151999, 18.418001);
        ((GeneralPath) shape).lineTo(7.9839993, 18.582);
        ((GeneralPath) shape).lineTo(8.171999, 18.512001);
        ((GeneralPath) shape).curveTo(8.565999, 18.414001, 8.847999, 18.402, 9.019999, 18.480001);
        ((GeneralPath) shape).curveTo(9.194999, 18.559002, 9.417998, 18.734001, 9.690998, 19.004002);
        ((GeneralPath) shape).curveTo(9.991998, 19.176003, 10.214998, 19.270002, 10.354998, 19.281002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.02, 19.789);
        ((GeneralPath) shape).lineTo(12.387, 19.765999);
        ((GeneralPath) shape).curveTo(12.645, 19.772999, 12.824, 19.800999, 12.918, 19.852);
        ((GeneralPath) shape).curveTo(13.094, 19.929998, 13.25, 19.977, 13.387, 19.991999);
        ((GeneralPath) shape).curveTo(13.375, 19.73, 13.227, 19.602, 12.945, 19.612999);
        ((GeneralPath) shape).lineTo(12.0199995, 19.789);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.984, 20.355);
        ((GeneralPath) shape).lineTo(14.082, 20.277);
        ((GeneralPath) shape).curveTo(14.164, 20.246, 14.285, 20.238, 14.445, 20.254);
        ((GeneralPath) shape).lineTo(15.132999, 20.324);
        ((GeneralPath) shape).curveTo(14.754, 20.105, 14.448999, 20.022999, 14.223, 20.078);
        ((GeneralPath) shape).curveTo(14.077999, 20.125, 13.988, 20.188, 13.9609995, 20.262);
        ((GeneralPath) shape).lineTo(13.983999, 20.355);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.25, 21.531);
        ((GeneralPath) shape).curveTo(14.551, 21.543, 14.684, 21.453001, 14.641, 21.27);
        ((GeneralPath) shape).lineTo(14.281, 21.262001);
        ((GeneralPath) shape).curveTo(14.141, 21.266, 14.074, 21.312, 14.086, 21.391);
        ((GeneralPath) shape).curveTo(14.113001, 21.496, 14.172001, 21.543001, 14.25, 21.531);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.254, 21.184);
        ((GeneralPath) shape).curveTo(15.379, 21.156, 15.59, 21.137, 15.891, 21.129);
        ((GeneralPath) shape).curveTo(16.055, 21.105, 16.02, 21.081999, 15.781, 21.059);
        ((GeneralPath) shape).curveTo(15.438, 21.043, 15.207, 21.047, 15.082, 21.074);
        ((GeneralPath) shape).curveTo(15.0199995, 21.109, 15.007999, 21.137, 15.043, 21.16);
        ((GeneralPath) shape).curveTo(15.062, 21.184, 15.133, 21.191, 15.254001, 21.184);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.324, 17.863);
        ((GeneralPath) shape).lineTo(10.457001, 17.727001);
        ((GeneralPath) shape).lineTo(10.957001, 17.566002);
        ((GeneralPath) shape).curveTo(10.859001, 17.535002, 10.68, 17.516003, 10.418001, 17.512001);
        ((GeneralPath) shape).curveTo(10.258001, 17.512001, 10.172001, 17.566002, 10.160001, 17.664001);
        ((GeneralPath) shape).curveTo(10.172001, 17.766, 10.227001, 17.832, 10.324, 17.863);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.777, 19.801);
        ((GeneralPath) shape).curveTo(19.016, 19.828001, 19.211, 19.797, 19.359001, 19.711);
        ((GeneralPath) shape).curveTo(19.488, 19.625, 19.695002, 19.578001, 19.977001, 19.566);
        ((GeneralPath) shape).curveTo(19.543001, 19.5, 19.184002, 19.461, 18.902, 19.453);
        ((GeneralPath) shape).curveTo(18.723, 19.434, 18.617, 19.484, 18.586, 19.602);
        ((GeneralPath) shape).curveTo(18.555, 19.719, 18.617, 19.785, 18.777, 19.800999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.703, 21.062);
        ((GeneralPath) shape).lineTo(18.809, 20.922);
        ((GeneralPath) shape).curveTo(18.898, 20.852001, 19.043, 20.824001, 19.238, 20.844002);
        ((GeneralPath) shape).lineTo(19.777, 20.902002);
        ((GeneralPath) shape).curveTo(19.227001, 20.602003, 18.852001, 20.523003, 18.656, 20.664001);
        ((GeneralPath) shape).curveTo(18.527, 20.750002, 18.496, 20.840002, 18.566, 20.926);
        ((GeneralPath) shape).curveTo(18.602, 20.988, 18.648, 21.035, 18.703, 21.062);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.625, 20.777);
        ((GeneralPath) shape).lineTo(22.789, 20.645);
        ((GeneralPath) shape).curveTo(22.918, 20.578001, 23.081999, 20.555, 23.281, 20.574001);
        ((GeneralPath) shape).curveTo(24.016, 20.652, 24.227, 20.652, 23.914, 20.582);
        ((GeneralPath) shape).curveTo(23.616999, 20.527, 23.366999, 20.492, 23.168, 20.473001);
        ((GeneralPath) shape).curveTo(22.811998, 20.414001, 22.602, 20.414001, 22.539, 20.465002);
        ((GeneralPath) shape).curveTo(22.491999, 20.504002, 22.496, 20.562002, 22.546999, 20.648003);
        ((GeneralPath) shape).curveTo(22.561998, 20.691002, 22.589998, 20.734003, 22.624998, 20.777002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.258, 23.152);
        ((GeneralPath) shape).lineTo(22.418, 23.047);
        ((GeneralPath) shape).curveTo(22.585999, 22.984001, 22.809, 22.977001, 23.081999, 23.027);
        ((GeneralPath) shape).lineTo(23.765999, 23.129);
        ((GeneralPath) shape).curveTo(23.374998, 22.824, 22.956999, 22.703, 22.508, 22.758);
        ((GeneralPath) shape).curveTo(22.223, 22.785, 22.094, 22.862999, 22.121, 22.987999);
        ((GeneralPath) shape).lineTo(22.258, 23.151999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.68, 22.375);
        ((GeneralPath) shape).curveTo(13.945001, 22.344, 14.125, 22.344, 14.223001, 22.371);
        ((GeneralPath) shape).curveTo(14.1050005, 22.18, 13.9800005, 22.105, 13.8550005, 22.152);
        ((GeneralPath) shape).curveTo(13.773001, 22.164, 13.719001, 22.207, 13.691001, 22.285);
        ((GeneralPath) shape).lineTo(13.680001, 22.375);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_63

        // _0_0_2_0_0_0_0_0_0_63_0

        // _0_0_2_0_0_0_0_0_0_63_0_0

        // _0_0_2_0_0_0_0_0_0_63_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.723, 26.0);
        ((GeneralPath) shape).lineTo(13.952999, 25.812);
        ((GeneralPath) shape).lineTo(13.683999, 25.816);
        ((GeneralPath) shape).curveTo(13.511999, 25.918, 13.351999, 25.992, 13.206999, 26.035);
        ((GeneralPath) shape).curveTo(12.937999, 26.129, 12.616999, 26.105, 12.249999, 25.965);
        ((GeneralPath) shape).curveTo(11.921999, 25.832, 11.706999, 25.656, 11.608999, 25.445);
        ((GeneralPath) shape).curveTo(11.473, 25.051, 11.355, 24.796999, 11.265999, 24.688);
        ((GeneralPath) shape).curveTo(10.698998, 23.984, 10.304998, 23.52, 10.085999, 23.296999);
        ((GeneralPath) shape).curveTo(9.886998, 23.094, 9.729999, 22.855, 9.616999, 22.585999);
        ((GeneralPath) shape).lineTo(9.530998, 22.241999);
        ((GeneralPath) shape).lineTo(9.272998, 22.397999);
        ((GeneralPath) shape).lineTo(9.413998, 22.804998);
        ((GeneralPath) shape).curveTo(9.550998, 23.222998, 9.811997, 23.589998, 10.202997, 23.913998);
        ((GeneralPath) shape).curveTo(10.460998, 24.140997, 10.6329975, 24.308998, 10.722998, 24.417997);
        ((GeneralPath) shape).curveTo(10.862998, 24.593998, 10.995997, 24.858997, 11.120997, 25.214998);
        ((GeneralPath) shape).curveTo(11.265998, 25.569998, 11.429997, 25.831999, 11.612997, 25.987999);
        ((GeneralPath) shape).curveTo(11.796997, 26.147999, 12.058997, 26.265999, 12.390997, 26.344);
        ((GeneralPath) shape).curveTo(12.843997, 26.449, 13.284997, 26.336, 13.722997, 26.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(15.737000465393066, -4.389599800109863), new Point2D.Double(24.062000274658203, -4.389599800109863), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_64

        // _0_0_2_0_0_0_0_0_0_64_0

        // _0_0_2_0_0_0_0_0_0_64_0_0

        // _0_0_2_0_0_0_0_0_0_64_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.75, 24.746);
        ((GeneralPath) shape).lineTo(18.852, 24.574);
        ((GeneralPath) shape).curveTo(18.258, 24.473, 17.719, 24.425999, 17.234, 24.438);
        ((GeneralPath) shape).curveTo(17.015999, 24.434, 16.684, 24.41, 16.245998, 24.362999);
        ((GeneralPath) shape).curveTo(15.870998, 24.324, 15.608998, 24.315998, 15.464998, 24.344);
        ((GeneralPath) shape).curveTo(15.136998, 24.41, 14.628998, 24.656, 13.940998, 25.086);
        ((GeneralPath) shape).curveTo(13.464998, 25.398, 12.968998, 25.527, 12.452998, 25.473);
        ((GeneralPath) shape).curveTo(12.331998, 25.461, 12.296998, 25.508, 12.347999, 25.612999);
        ((GeneralPath) shape).lineTo(12.448998, 25.776999);
        ((GeneralPath) shape).lineTo(12.9019985, 25.793);
        ((GeneralPath) shape).curveTo(13.245998, 25.75, 13.581999, 25.620998, 13.905998, 25.414);
        ((GeneralPath) shape).curveTo(14.706998, 24.855, 15.327998, 24.598, 15.765998, 24.645);
        ((GeneralPath) shape).lineTo(16.749998, 24.746);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(21.350000381469727, -3.7699999809265137), new Point2D.Double(31.950000762939453, -3.7699999809265137), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_65

        // _0_0_2_0_0_0_0_0_0_65_0

        // _0_0_2_0_0_0_0_0_0_65_0_0

        // _0_0_2_0_0_0_0_0_0_65_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.477, 25.051);
        ((GeneralPath) shape).curveTo(16.953, 24.941, 17.043, 24.84, 16.75, 24.746);
        ((GeneralPath) shape).curveTo(16.594, 24.691, 16.375, 24.68, 16.09, 24.707);
        ((GeneralPath) shape).curveTo(15.77, 24.715, 15.547, 24.711, 15.43, 24.699001);
        ((GeneralPath) shape).curveTo(15.156, 24.633001, 14.754001, 24.340002, 14.223001, 23.820002);
        ((GeneralPath) shape).curveTo(14.023001, 23.617002, 13.469001, 23.258001, 12.559, 22.742002);
        ((GeneralPath) shape).curveTo(12.352, 22.598003, 12.133, 22.566002, 11.902, 22.641003);
        ((GeneralPath) shape).lineTo(11.645, 22.797003);
        ((GeneralPath) shape).lineTo(11.945001, 22.828003);
        ((GeneralPath) shape).curveTo(12.18, 22.871002, 12.383, 22.953003, 12.551001, 23.070004);
        ((GeneralPath) shape).curveTo(12.832001, 23.281004, 13.27, 23.527004, 13.863001, 23.812004);
        ((GeneralPath) shape).curveTo(13.957001, 23.883003, 14.141001, 24.043005, 14.4140005, 24.293005);
        ((GeneralPath) shape).curveTo(14.691001, 24.543005, 14.965, 24.723005, 15.234, 24.832005);
        ((GeneralPath) shape).curveTo(15.676001, 25.039005, 16.09, 25.109005, 16.477001, 25.051004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.687999725341797, -5.709000110626221), new Point2D.Double(28.711999893188477, -5.709000110626221), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_66

        // _0_0_2_0_0_0_0_0_0_66_0

        // _0_0_2_0_0_0_0_0_0_66_0_0

        // _0_0_2_0_0_0_0_0_0_66_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.672, 24.137);
        ((GeneralPath) shape).curveTo(14.949, 24.168, 15.352, 24.280998, 15.875, 24.477);
        ((GeneralPath) shape).lineTo(16.23, 24.512);
        ((GeneralPath) shape).curveTo(15.801, 24.206999, 15.398, 24.030998, 15.0199995, 23.991999);
        ((GeneralPath) shape).curveTo(14.422, 23.929998, 13.811999, 24.089998, 13.191, 24.464998);
        ((GeneralPath) shape).curveTo(12.805, 24.706999, 12.164, 24.780998, 11.266, 24.687998);
        ((GeneralPath) shape).curveTo(11.007999, 24.659998, 10.727, 24.558998, 10.426, 24.386997);
        ((GeneralPath) shape).lineTo(10.054999, 24.167997);
        ((GeneralPath) shape).lineTo(10.1449995, 24.448997);
        ((GeneralPath) shape).lineTo(10.391, 24.714998);
        ((GeneralPath) shape).curveTo(10.613, 24.897999, 10.891, 25.012, 11.23, 25.046999);
        ((GeneralPath) shape).curveTo(12.0859995, 25.133, 12.780999, 25.026999, 13.316, 24.719);
        ((GeneralPath) shape).curveTo(13.98, 24.309, 14.434, 24.112999, 14.672, 24.137);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(17.312000274658203, -4.400400161743164), new Point2D.Double(27.58799934387207, -4.400400161743164), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_67

        // _0_0_2_0_0_0_0_0_0_67_0

        // _0_0_2_0_0_0_0_0_0_67_0_0

        // _0_0_2_0_0_0_0_0_0_67_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.824, 27.02);
        ((GeneralPath) shape).curveTo(15.02, 27.281, 15.2300005, 27.254, 15.465, 26.938);
        ((GeneralPath) shape).lineTo(15.348001, 26.921999);
        ((GeneralPath) shape).curveTo(15.246, 26.914, 15.125001, 26.82, 14.984, 26.644999);
        ((GeneralPath) shape).curveTo(14.824, 26.425999, 14.742001, 26.187998, 14.727, 25.921999);
        ((GeneralPath) shape).curveTo(14.711, 25.679998, 14.879001, 25.445, 15.223001, 25.223);
        ((GeneralPath) shape).curveTo(15.418, 25.081999, 15.691001, 24.897999, 16.035, 24.671999);
        ((GeneralPath) shape).curveTo(16.586, 24.188, 16.914, 23.780998, 17.008, 23.449);
        ((GeneralPath) shape).curveTo(17.102, 23.137, 16.996, 22.894999, 16.691, 22.719);
        ((GeneralPath) shape).lineTo(17.18, 22.652);
        ((GeneralPath) shape).lineTo(17.289, 22.48);
        ((GeneralPath) shape).curveTo(16.925999, 22.504, 16.637, 22.562, 16.425999, 22.664);
        ((GeneralPath) shape).curveTo(16.300999, 22.711, 16.280998, 22.796999, 16.366999, 22.93);
        ((GeneralPath) shape).curveTo(16.526999, 23.145, 16.609, 23.305, 16.620998, 23.406);
        ((GeneralPath) shape).curveTo(16.640999, 23.59, 16.538998, 23.781, 16.319998, 23.98);
        ((GeneralPath) shape).curveTo(16.249998, 24.050999, 15.952998, 24.293, 15.429997, 24.699);
        ((GeneralPath) shape).curveTo(15.061997, 24.941, 14.835998, 25.09, 14.749997, 25.140999);
        ((GeneralPath) shape).curveTo(14.620997, 25.23, 14.499997, 25.418, 14.386997, 25.706999);
        ((GeneralPath) shape).curveTo(14.253997, 26.015999, 14.292997, 26.32, 14.503997, 26.624998);
        ((GeneralPath) shape).curveTo(14.585997, 26.792997, 14.690997, 26.925999, 14.823997, 27.019999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(24.687999725341797, -4.400899887084961), new Point2D.Double(29.01099967956543, -4.400899887084961), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_68

        // _0_0_2_0_0_0_0_0_0_68_0

        // _0_0_2_0_0_0_0_0_0_68_0_0

        // _0_0_2_0_0_0_0_0_0_68_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.398, 25.734);
        ((GeneralPath) shape).curveTo(18.715, 25.949, 18.926, 25.859, 19.027, 25.469);
        ((GeneralPath) shape).curveTo(18.684, 25.312, 18.441, 25.125, 18.301, 24.91);
        ((GeneralPath) shape).curveTo(18.133001, 24.609, 17.711, 24.305, 17.039001, 23.992);
        ((GeneralPath) shape).curveTo(16.754002, 23.844, 16.504002, 23.656, 16.285002, 23.434);
        ((GeneralPath) shape).curveTo(16.031002, 23.164, 15.832002, 22.961, 15.684002, 22.828);
        ((GeneralPath) shape).curveTo(15.312002, 22.526999, 14.918002, 22.355, 14.504002, 22.311998);
        ((GeneralPath) shape).curveTo(14.363002, 22.296999, 14.344002, 22.194998, 14.445002, 22.003998);
        ((GeneralPath) shape).curveTo(14.492002, 21.929998, 14.551002, 21.843998, 14.621001, 21.749998);
        ((GeneralPath) shape).lineTo(14.188002, 21.854998);
        ((GeneralPath) shape).curveTo(14.137002, 21.948997, 14.105001, 22.058998, 14.094002, 22.175997);
        ((GeneralPath) shape).curveTo(14.090002, 22.397997, 14.207002, 22.519997, 14.449001, 22.546997);
        ((GeneralPath) shape).curveTo(14.707002, 22.573997, 14.922001, 22.636997, 15.090001, 22.733997);
        ((GeneralPath) shape).curveTo(15.184001, 22.804996, 15.379001, 22.964998, 15.676002, 23.218998);
        ((GeneralPath) shape).curveTo(15.840001, 23.354998, 16.070002, 23.569998, 16.359001, 23.862997);
        ((GeneralPath) shape).curveTo(16.637001, 24.093998, 16.93, 24.284998, 17.234001, 24.437998);
        ((GeneralPath) shape).curveTo(17.715002, 24.667997, 18.102001, 25.101997, 18.398, 25.733997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(23.63800048828125, -6.205100059509277), new Point2D.Double(32.362998962402344, -6.205100059509277), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_69

        // _0_0_2_0_0_0_0_0_0_69_0

        // _0_0_2_0_0_0_0_0_0_69_0_0

        // _0_0_2_0_0_0_0_0_0_69_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.949, 22.723);
        ((GeneralPath) shape).curveTo(12.801001, 22.625, 12.609, 22.445, 12.375, 22.18);
        ((GeneralPath) shape).curveTo(12.141, 21.914, 11.863, 21.691, 11.539, 21.52);
        ((GeneralPath) shape).curveTo(11.176, 21.32, 10.870999, 21.188, 10.613, 21.121);
        ((GeneralPath) shape).lineTo(10.0199995, 21.059);
        ((GeneralPath) shape).lineTo(10.117, 21.25);
        ((GeneralPath) shape).curveTo(10.292999, 21.508, 10.719, 21.754, 11.398, 21.984);
        ((GeneralPath) shape).curveTo(11.707, 22.120998, 11.917999, 22.223, 12.031, 22.293);
        ((GeneralPath) shape).curveTo(12.141, 22.387, 12.238, 22.526999, 12.316, 22.715);
        ((GeneralPath) shape).curveTo(12.398, 22.906, 12.746, 23.051, 13.359, 23.156);
        ((GeneralPath) shape).curveTo(13.867001, 23.27, 14.305, 23.316, 14.672, 23.293);
        ((GeneralPath) shape).curveTo(15.074, 23.276999, 14.992, 23.195, 14.426, 23.059);
        ((GeneralPath) shape).curveTo(13.82, 23.055, 13.332, 22.941, 12.948999, 22.723);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.687999725341797, -8.112799644470215), new Point2D.Double(25.11199951171875, -8.112799644470215), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_70

        // _0_0_2_0_0_0_0_0_0_70_0

        // _0_0_2_0_0_0_0_0_0_70_0_0

        // _0_0_2_0_0_0_0_0_0_70_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.254, 24.188);
        ((GeneralPath) shape).curveTo(12.664, 24.109, 13.047, 24.0, 13.406, 23.855);
        ((GeneralPath) shape).curveTo(13.512, 23.805, 13.758, 23.671999, 14.141, 23.449);
        ((GeneralPath) shape).curveTo(14.379, 23.312, 14.637, 23.237999, 14.918, 23.23);
        ((GeneralPath) shape).curveTo(15.16, 23.215, 15.527, 23.191, 16.012001, 23.164);
        ((GeneralPath) shape).curveTo(16.438002, 23.145, 16.777, 23.16, 17.031002, 23.206999);
        ((GeneralPath) shape).lineTo(18.273003, 23.445);
        ((GeneralPath) shape).curveTo(17.922003, 23.362999, 17.566002, 23.203, 17.211002, 22.956999);
        ((GeneralPath) shape).curveTo(16.836002, 22.695, 15.906002, 22.73, 14.4260025, 23.058998);
        ((GeneralPath) shape).curveTo(14.055002, 23.136997, 13.555002, 23.386997, 12.930002, 23.804998);
        ((GeneralPath) shape).curveTo(12.711002, 23.964998, 12.430002, 24.065998, 12.082003, 24.109);
        ((GeneralPath) shape).lineTo(11.629003, 24.120998);
        ((GeneralPath) shape).curveTo(11.6170025, 24.222998, 11.828003, 24.241999, 12.254003, 24.187998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.913000106811523, -6.273900032043457), new Point2D.Double(31.08799934387207, -6.273900032043457), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_71

        // _0_0_2_0_0_0_0_0_0_71_0

        // _0_0_2_0_0_0_0_0_0_71_0_0

        // _0_0_2_0_0_0_0_0_0_71_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.492, 24.84);
        ((GeneralPath) shape).lineTo(17.707, 25.121);
        ((GeneralPath) shape).curveTo(16.891, 25.438, 16.395, 25.547, 16.227001, 25.445);
        ((GeneralPath) shape).curveTo(15.895001, 25.152, 15.633001, 24.953, 15.441001, 24.852);
        ((GeneralPath) shape).curveTo(14.477001, 24.469, 13.965001, 24.276999, 13.906001, 24.269999);
        ((GeneralPath) shape).curveTo(13.609001, 24.199, 13.293001, 24.085999, 12.945001, 23.925999);
        ((GeneralPath) shape).curveTo(12.523001, 23.723, 12.262001, 23.534998, 12.160001, 23.362999);
        ((GeneralPath) shape).curveTo(12.074, 23.214998, 11.871001, 23.043, 11.551001, 22.848);
        ((GeneralPath) shape).curveTo(11.113001, 22.621, 10.863001, 22.484, 10.809001, 22.438);
        ((GeneralPath) shape).lineTo(10.082001, 21.91);
        ((GeneralPath) shape).lineTo(9.793001, 22.059);
        ((GeneralPath) shape).lineTo(10.566001, 22.441);
        ((GeneralPath) shape).curveTo(11.121001, 22.742, 11.531001, 23.027, 11.805001, 23.297);
        ((GeneralPath) shape).curveTo(12.371001, 23.836, 13.152001, 24.25, 14.148001, 24.535002);
        ((GeneralPath) shape).curveTo(14.559001, 24.660002, 14.941001, 24.832003, 15.301001, 25.047);
        ((GeneralPath) shape).curveTo(15.488001, 25.168001, 15.734, 25.336, 16.035, 25.547);
        ((GeneralPath) shape).curveTo(16.371, 25.785002, 17.016, 25.672, 17.969, 25.207);
        ((GeneralPath) shape).lineTo(18.629, 24.973001);
        ((GeneralPath) shape).lineTo(18.492, 24.840002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.5, -5.634300231933594), new Point2D.Double(31.625, -5.634300231933594), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_72

        // _0_0_2_0_0_0_0_0_0_72_0

        // _0_0_2_0_0_0_0_0_0_72_0_0

        // _0_0_2_0_0_0_0_0_0_72_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.16, 23.363);
        ((GeneralPath) shape).curveTo(12.301, 23.359001, 12.867, 23.508001, 13.863, 23.812);
        ((GeneralPath) shape).curveTo(14.151999, 23.922, 14.5, 23.98, 14.902, 23.98);
        ((GeneralPath) shape).curveTo(15.301001, 24.004, 15.637, 23.969, 15.906, 23.875);
        ((GeneralPath) shape).curveTo(16.363, 23.742, 16.816, 23.738, 17.266, 23.867);
        ((GeneralPath) shape).lineTo(17.914001, 24.023);
        ((GeneralPath) shape).curveTo(17.746002, 23.887001, 17.508001, 23.762001, 17.199001, 23.648);
        ((GeneralPath) shape).curveTo(17.004002, 23.566, 16.723001, 23.570002, 16.352001, 23.652);
        ((GeneralPath) shape).curveTo(16.289001, 23.664, 15.9730015, 23.742, 15.395001, 23.883001);
        ((GeneralPath) shape).curveTo(15.168001, 23.938002, 14.758001, 23.887001, 14.172001, 23.723001);
        ((GeneralPath) shape).curveTo(13.332001, 23.496002, 12.785001, 23.359001, 12.527, 23.312002);
        ((GeneralPath) shape).curveTo(12.051001, 23.242002, 11.660001, 23.238003, 11.352, 23.309002);
        ((GeneralPath) shape).curveTo(11.102, 23.402002, 10.9140005, 23.465002, 10.7890005, 23.492002);
        ((GeneralPath) shape).lineTo(11.379001, 23.613003);
        ((GeneralPath) shape).lineTo(12.160001, 23.363003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(18.424999237060547, -6.083499908447266), new Point2D.Double(30.274999618530273, -6.083499908447266), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59672f, 0.0624f, -0.0624f, 0.59672f, -0.54597f, 25.744f)));
        g.fill(shape);

        // _0_0_2_0_0_0_0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.953, 23.824);
        ((GeneralPath) shape).lineTo(27.816, 23.914);
        ((GeneralPath) shape).curveTo(27.867, 23.800999, 27.906, 23.640999, 27.926, 23.441);
        ((GeneralPath) shape).curveTo(28.078001, 21.992, 26.844, 20.617, 24.227001, 19.316);
        ((GeneralPath) shape).curveTo(21.605001, 18.016, 18.367, 17.164, 14.508001, 16.762001);
        ((GeneralPath) shape).curveTo(10.648002, 16.359001, 7.3050013, 16.52, 4.4730015, 17.250002);
        ((GeneralPath) shape).curveTo(1.6450014, 17.980001, 0.15200138, 19.070002, 1.4305115E-6, 20.523003);
        ((GeneralPath) shape).lineTo(0.012001431, 21.008003);
        ((GeneralPath) shape).lineTo(1.0230014, 21.113003);
        ((GeneralPath) shape).lineTo(1.0510014, 20.844004);
        ((GeneralPath) shape).curveTo(1.1880014, 19.551004, 2.5660014, 18.590004, 5.1840014, 17.957005);
        ((GeneralPath) shape).curveTo(7.8050013, 17.309004, 10.906002, 17.168005, 14.488001, 17.543005);
        ((GeneralPath) shape).curveTo(18.086, 17.922005, 21.105001, 18.699005, 23.535, 19.879005);
        ((GeneralPath) shape).curveTo(25.965, 21.035006, 27.112999, 22.262005, 26.98, 23.555006);
        ((GeneralPath) shape).lineTo(26.953, 23.824005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_2_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_2_0_0_1

        // _0_0_2_0_0_1_0

        // _0_0_2_0_0_1_0_0

        // _0_0_2_0_0_1_0_0_0

        // _0_0_2_0_0_1_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.352, 13.457);
        ((GeneralPath) shape).curveTo(15.441, 13.48, 15.672, 13.547, 16.043, 13.648);
        ((GeneralPath) shape).curveTo(16.418, 13.75, 16.793, 13.898, 17.171999, 14.098);
        ((GeneralPath) shape).curveTo(17.546999, 14.297, 18.046999, 14.3359995, 18.679998, 14.226999);
        ((GeneralPath) shape).curveTo(19.311998, 14.117, 20.561998, 14.617, 22.429998, 15.718999);
        ((GeneralPath) shape).curveTo(24.304998, 16.82, 24.558998, 16.499998, 23.194998, 14.757998);
        ((GeneralPath) shape).curveTo(21.823997, 13.015999, 18.753998, 12.022999, 13.976997, 11.772999);
        ((GeneralPath) shape).curveTo(9.194998, 11.5269985, 6.511997, 12.187999, 5.9259977, 13.753999);
        ((GeneralPath) shape).curveTo(6.1369977, 14.097999, 6.679998, 14.1519985, 7.5549974, 13.905999);
        ((GeneralPath) shape).curveTo(8.429997, 13.664, 9.058997, 13.558999, 9.440997, 13.593999);
        ((GeneralPath) shape).curveTo(9.819997, 13.628999, 10.276998, 13.546999, 10.808997, 13.343999);
        ((GeneralPath) shape).curveTo(11.347997, 13.140999, 11.835997, 13.147999, 12.269997, 13.358999);
        ((GeneralPath) shape).curveTo(12.698997, 13.573999, 13.1799965, 13.629, 13.702996, 13.522999);
        ((GeneralPath) shape).curveTo(14.233996, 13.417999, 14.620996, 13.374999, 14.862996, 13.390999);
        ((GeneralPath) shape).curveTo(15.101996, 13.409999, 15.265996, 13.429998, 15.351996, 13.456999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFB666666, true));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_2_0_0_1

        // _0_0_3

        // _0_0_3_0

        // _0_0_3_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_3_0_0_0

        // _0_0_3_0_0_0_0

        // _0_0_3_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.852, 26.297);
        ((GeneralPath) shape).lineTo(27.973, 26.324001);
        ((GeneralPath) shape).curveTo(27.140999, 23.863, 25.445, 21.871002, 22.890999, 20.348001);
        ((GeneralPath) shape).curveTo(20.272999, 18.785002, 17.315998, 18.039001, 14.015999, 18.113);
        ((GeneralPath) shape).curveTo(10.698999, 18.188002, 7.765999, 19.074001, 5.2229986, 20.773);
        ((GeneralPath) shape).curveTo(2.6989987, 22.449001, 1.1089988, 24.547, 0.44499874, 27.062);
        ((GeneralPath) shape).lineTo(0.65199876, 26.996);
        ((GeneralPath) shape).curveTo(1.4179988, 26.379, 3.0589988, 25.844, 5.565999, 25.387001);
        ((GeneralPath) shape).curveTo(8.098, 24.949001, 11.004, 24.695002, 14.280999, 24.621);
        ((GeneralPath) shape).curveTo(17.460999, 24.551, 20.305, 24.676, 22.812, 25.0);
        ((GeneralPath) shape).curveTo(25.301, 25.305, 26.98, 25.734, 27.852001, 26.297);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD9D9D9));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_1

        // _0_0_3_0_0_0_0_0_0_1_0

        // _0_0_3_0_0_0_0_0_0_1_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_1_0_0_0_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.492, 24.609);
        ((GeneralPath) shape).lineTo(15.426001, 18.144999);
        ((GeneralPath) shape).lineTo(14.016001, 18.112999);
        ((GeneralPath) shape).curveTo(13.457001, 18.129, 12.906001, 18.168, 12.371, 18.241999);
        ((GeneralPath) shape).curveTo(11.711, 18.355, 10.965, 18.574, 10.133, 18.890999);
        ((GeneralPath) shape).curveTo(9.281, 19.23, 8.570001, 19.598, 7.9960003, 19.987999);
        ((GeneralPath) shape).curveTo(6.184, 21.23, 4.7970004, 22.602, 3.828, 24.105);
        ((GeneralPath) shape).curveTo(3.344, 24.855, 3.051, 25.48, 2.941, 25.984);
        ((GeneralPath) shape).lineTo(4.523, 25.616999);
        ((GeneralPath) shape).curveTo(7.25, 25.039, 10.504, 24.703, 14.281, 24.620998);
        ((GeneralPath) shape).lineTo(17.492, 24.609);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-22.461000442504883, -32.38399887084961), new Point2D.Double(-6.760900020599365, -32.38399887084961), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(0.5998f, -0.01536f, 0.01536f, 0.5998f, 18.924f, 41.219f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_2

        // _0_0_3_0_0_0_0_0_0_2_0

        // _0_0_3_0_0_0_0_0_0_2_0_0

        // _0_0_3_0_0_0_0_0_0_2_0_0_0

        // _0_0_3_0_0_0_0_0_0_2_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_2_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_2_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_2_0_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_2_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.512, 25.008);
        ((GeneralPath) shape).curveTo(24.316, 25.206999, 25.734, 25.473, 26.762, 25.812);
        ((GeneralPath) shape).curveTo(26.57, 25.254, 26.276999, 24.672, 25.883, 24.059);
        ((GeneralPath) shape).curveTo(25.098, 22.898, 23.91, 21.734, 22.324, 20.57);
        ((GeneralPath) shape).curveTo(21.105, 19.695, 19.559, 18.969, 17.684, 18.395);
        ((GeneralPath) shape).lineTo(16.27, 18.215);
        ((GeneralPath) shape).curveTo(18.688, 19.02, 20.414001, 20.23, 21.453001, 21.848);
        ((GeneralPath) shape).curveTo(21.93, 22.559, 22.234001, 23.23, 22.367, 23.867);
        ((GeneralPath) shape).curveTo(22.457, 24.207, 22.504, 24.586, 22.512001, 25.008001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x595959));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_3

        // _0_0_3_0_0_0_0_0_0_3_0

        // _0_0_3_0_0_0_0_0_0_3_0_0

        // _0_0_3_0_0_0_0_0_0_3_0_0_0

        // _0_0_3_0_0_0_0_0_0_3_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_3_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_3_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_3_0_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_3_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.922, 19.363);
        ((GeneralPath) shape).curveTo(6.02, 20.125, 4.414, 21.18, 3.1019998, 22.531);
        ((GeneralPath) shape).curveTo(1.7729998, 23.879, 0.88699985, 25.391, 0.4449997, 27.062);
        ((GeneralPath) shape).lineTo(0.6519997, 26.996);
        ((GeneralPath) shape).lineTo(1.0979997, 26.715);
        ((GeneralPath) shape).curveTo(1.3949997, 25.75, 1.8949997, 24.758, 2.5899997, 23.742);
        ((GeneralPath) shape).curveTo(3.9449997, 21.77, 5.7229996, 20.312, 7.9219995, 19.363);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_4

        // _0_0_3_0_0_0_0_0_0_4_0

        // _0_0_3_0_0_0_0_0_0_4_0_0

        // _0_0_3_0_0_0_0_0_0_4_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.973, 31.215);
        ((GeneralPath) shape).curveTo(26.609, 30.156, 27.914, 28.926, 27.883, 27.527);
        ((GeneralPath) shape).curveTo(27.848, 26.105, 26.491999, 24.938, 23.812, 24.016);
        ((GeneralPath) shape).curveTo(21.148, 23.074001, 17.941, 22.648, 14.18, 22.730001);
        ((GeneralPath) shape).curveTo(10.441, 22.816002, 7.254, 23.387001, 4.6170006, 24.445002);
        ((GeneralPath) shape).curveTo(2.0000005, 25.484001, 0.7070005, 26.715002, 0.73800063, 28.133001);
        ((GeneralPath) shape).curveTo(0.77000064, 29.535002, 2.1170006, 30.703001, 4.7770004, 31.645);
        ((GeneralPath) shape).curveTo(7.4610004, 32.586, 10.672001, 33.012, 14.410001, 32.93);
        ((GeneralPath) shape).curveTo(18.148, 32.844, 21.336, 32.273, 23.973, 31.215);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(0.7997999787330627, -8.600099563598633), new Point2D.Double(46.04999923706055, -8.600099563598633), new float[]{0, 1}, new Color[]{new Color(0x7D7D7D), new Color(0xD4D4D4)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.277, 27.879);
        ((GeneralPath) shape).lineTo(27.41, 27.897999);
        ((GeneralPath) shape).curveTo(27.258, 29.140999, 25.93, 30.223, 23.43, 31.137);
        ((GeneralPath) shape).curveTo(20.949001, 32.051, 17.961, 32.551, 14.461, 32.628998);
        ((GeneralPath) shape).curveTo(10.984, 32.706997, 7.984, 32.343998, 5.465, 31.538998);
        ((GeneralPath) shape).curveTo(2.926, 30.733997, 1.5550001, 29.718998, 1.348, 28.479998);
        ((GeneralPath) shape).lineTo(0.32800007, 28.503998);
        ((GeneralPath) shape).curveTo(0.67600006, 29.854998, 2.191, 30.960999, 4.8710003, 31.823997);
        ((GeneralPath) shape).curveTo(7.59, 32.684, 10.77, 33.069996, 14.41, 32.988);
        ((GeneralPath) shape).curveTo(18.07, 32.906, 21.227, 32.375, 23.887001, 31.397999);
        ((GeneralPath) shape).curveTo(26.523, 30.418, 27.988, 29.245998, 28.277, 27.878998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_6

        // _0_0_3_0_0_0_0_0_0_6_0

        // _0_0_3_0_0_0_0_0_0_6_0_0

        // _0_0_3_0_0_0_0_0_0_6_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.184, 25.465);
        ((GeneralPath) shape).curveTo(24.949, 24.793, 23.836, 24.266, 22.848, 23.887001);
        ((GeneralPath) shape).curveTo(21.031, 23.148, 19.272999, 22.789001, 17.574, 22.805);
        ((GeneralPath) shape).curveTo(12.390999, 22.801, 8.452999, 23.312, 5.7539997, 24.332);
        ((GeneralPath) shape).curveTo(4.4449997, 24.84, 3.3979998, 25.375, 2.6089997, 25.934);
        ((GeneralPath) shape).lineTo(1.8119998, 26.609);
        ((GeneralPath) shape).curveTo(1.7419997, 26.890999, 1.8589998, 27.237999, 2.1679997, 27.651999);
        ((GeneralPath) shape).curveTo(2.4379997, 28.026999, 2.7849998, 28.339998, 3.2069998, 28.589998);
        ((GeneralPath) shape).curveTo(3.4919999, 28.762, 4.0979996, 28.979998, 5.023, 29.237999);
        ((GeneralPath) shape).curveTo(5.949, 29.519999, 6.5859995, 29.754, 6.93, 29.945);
        ((GeneralPath) shape).curveTo(8.047, 30.602, 9.401999, 30.941, 11.004, 30.965);
        ((GeneralPath) shape).curveTo(11.382999, 30.977, 12.3359995, 30.984, 13.855, 30.992);
        ((GeneralPath) shape).curveTo(15.136999, 31.004, 16.137, 31.031, 16.859, 31.074001);
        ((GeneralPath) shape).curveTo(18.140999, 31.145, 19.780998, 30.809002, 21.785, 30.062002);
        ((GeneralPath) shape).curveTo(23.512, 29.406002, 24.723, 28.879002, 25.41, 28.480001);
        ((GeneralPath) shape).curveTo(26.062, 28.129002, 26.512, 27.629002, 26.758, 26.980001);
        ((GeneralPath) shape).curveTo(27.043, 26.254002, 26.852, 25.750002, 26.184, 25.465002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(2.6078999042510986, -9.976099967956543), new Point2D.Double(44.382999420166016, -9.976099967956543), new float[]{0, 1}, new Color[]{new Color(0xA67C3C), new Color(0x85612D)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.156, 27.562);
        ((GeneralPath) shape).curveTo(6.2730002, 27.461, 6.32, 27.32, 6.297, 27.141);
        ((GeneralPath) shape).curveTo(6.273, 26.961, 6.191, 26.832, 6.047, 26.754002);
        ((GeneralPath) shape).curveTo(5.949, 26.719002, 5.758, 26.723001, 5.48, 26.770002);
        ((GeneralPath) shape).curveTo(5.121, 26.855001, 4.852, 26.902002, 4.672, 26.906002);
        ((GeneralPath) shape).curveTo(4.09, 26.918001, 3.9689999, 27.160002, 4.297, 27.633001);
        ((GeneralPath) shape).curveTo(4.465, 27.852001, 4.7339997, 27.953001, 5.113, 27.945002);
        ((GeneralPath) shape).curveTo(5.516, 27.938002, 5.863, 27.809002, 6.156, 27.562002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.254, 28.258);
        ((GeneralPath) shape).curveTo(7.1330004, 28.203, 6.953, 28.227, 6.715, 28.331999);
        ((GeneralPath) shape).lineTo(6.1210003, 28.675999);
        ((GeneralPath) shape).lineTo(6.2770004, 28.909998);
        ((GeneralPath) shape).curveTo(6.4020004, 29.065998, 6.5310006, 29.124998, 6.6720004, 29.081999);
        ((GeneralPath) shape).lineTo(7.8320003, 28.695);
        ((GeneralPath) shape).curveTo(7.8710003, 28.695, 7.6800003, 28.551, 7.254, 28.258);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.547, 26.699);
        ((GeneralPath) shape).curveTo(4.344, 26.625, 4.113, 26.629, 3.855, 26.715);
        ((GeneralPath) shape).curveTo(3.68, 26.758, 3.621, 26.84, 3.684, 26.957);
        ((GeneralPath) shape).lineTo(3.836, 27.137001);
        ((GeneralPath) shape).lineTo(3.922, 26.922);
        ((GeneralPath) shape).curveTo(4.0, 26.781, 4.207, 26.707, 4.547, 26.699001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_10

        // _0_0_3_0_0_0_0_0_0_10_0

        // _0_0_3_0_0_0_0_0_0_10_0_0

        // _0_0_3_0_0_0_0_0_0_10_0_0_0

        // _0_0_3_0_0_0_0_0_0_10_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_10_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_10_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_10_0_0_0_0_0_0_0

        // _0_0_3_0_0_0_0_0_0_10_0_0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.383, 27.59);
        ((GeneralPath) shape).curveTo(26.691, 27.203001, 26.855, 26.828001, 26.866999, 26.469);
        ((GeneralPath) shape).lineTo(26.723, 26.652);
        ((GeneralPath) shape).curveTo(26.223, 27.562, 25.336, 28.203001, 24.062, 28.57);
        ((GeneralPath) shape).curveTo(23.727001, 28.68, 23.156, 28.801, 22.359001, 28.941);
        ((GeneralPath) shape).curveTo(21.504002, 29.078, 20.758001, 29.238, 20.121002, 29.41);
        ((GeneralPath) shape).curveTo(19.406002, 29.605, 18.559002, 29.695, 17.578003, 29.676);
        ((GeneralPath) shape).curveTo(16.453003, 29.621, 15.555003, 29.602001, 14.875003, 29.617);
        ((GeneralPath) shape).curveTo(12.715003, 29.668001, 11.215003, 29.672, 10.375003, 29.629);
        ((GeneralPath) shape).curveTo(9.773003, 29.621, 8.930003, 29.371, 7.836003, 28.875);
        ((GeneralPath) shape).curveTo(6.848003, 28.418, 6.1990027, 28.043, 5.8910027, 27.75);
        ((GeneralPath) shape).curveTo(5.7540026, 27.812, 5.5820026, 27.836, 5.3830028, 27.82);
        ((GeneralPath) shape).curveTo(5.000003, 27.75, 4.672003, 27.445, 4.402003, 26.914);
        ((GeneralPath) shape).curveTo(4.340003, 26.793, 4.113003, 26.59, 3.7270029, 26.296999);
        ((GeneralPath) shape).curveTo(3.3590028, 26.004, 3.156003, 25.769999, 3.1130028, 25.589998);
        ((GeneralPath) shape).curveTo(2.4610028, 25.983997, 2.0270028, 26.323997, 1.8120028, 26.608997);
        ((GeneralPath) shape).curveTo(1.7420027, 26.890997, 1.8590028, 27.237997, 2.1680028, 27.651997);
        ((GeneralPath) shape).curveTo(2.4380028, 28.026997, 2.7850027, 28.339996, 3.2070029, 28.589996);
        ((GeneralPath) shape).curveTo(3.492003, 28.761997, 4.098003, 28.979996, 5.0230026, 29.237997);
        ((GeneralPath) shape).curveTo(5.9490027, 29.519997, 6.5860023, 29.753998, 6.9300027, 29.944998);
        ((GeneralPath) shape).curveTo(8.047003, 30.601997, 9.402002, 30.940998, 11.004003, 30.964998);
        ((GeneralPath) shape).curveTo(11.383002, 30.976997, 12.336002, 30.983997, 13.855002, 30.991999);
        ((GeneralPath) shape).curveTo(15.137002, 31.003998, 16.137003, 31.030998, 16.859003, 31.074);
        ((GeneralPath) shape).curveTo(18.141003, 31.144999, 19.781002, 30.809, 21.785004, 30.062);
        ((GeneralPath) shape).curveTo(23.512003, 29.406, 24.723003, 28.879, 25.410004, 28.48);
        ((GeneralPath) shape).curveTo(25.785004, 28.272999, 26.109003, 27.977, 26.383003, 27.59);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.051, 28.953);
        ((GeneralPath) shape).curveTo(10.695, 29.32, 10.426, 29.727, 10.233999, 30.171999);
        ((GeneralPath) shape).curveTo(10.120999, 30.433998, 10.026999, 30.727, 9.956999, 31.046999);
        ((GeneralPath) shape).lineTo(9.905999, 31.469);
        ((GeneralPath) shape).lineTo(10.8949995, 31.387);
        ((GeneralPath) shape).curveTo(11.195, 31.383, 11.582, 31.293, 12.059, 31.120998);
        ((GeneralPath) shape).lineTo(12.371, 30.304998);
        ((GeneralPath) shape).curveTo(12.445001, 30.102, 12.59, 29.897999, 12.805, 29.694998);
        ((GeneralPath) shape).lineTo(11.051001, 28.952997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.414, 30.02);
        ((GeneralPath) shape).lineTo(11.125, 29.703001);
        ((GeneralPath) shape).lineTo(12.805, 29.695002);
        ((GeneralPath) shape).lineTo(12.25, 28.957);
        ((GeneralPath) shape).lineTo(12.152, 28.719);
        ((GeneralPath) shape).curveTo(11.77, 28.469, 11.375, 28.309, 10.973001, 28.234);
        ((GeneralPath) shape).lineTo(9.527, 27.969);
        ((GeneralPath) shape).lineTo(9.707001, 29.375);
        ((GeneralPath) shape).lineTo(10.4140005, 30.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.348, 31.102);
        ((GeneralPath) shape).lineTo(10.988, 30.245998);
        ((GeneralPath) shape).curveTo(11.0859995, 30.081999, 11.129, 29.901999, 11.125, 29.703);
        ((GeneralPath) shape).curveTo(10.824, 29.629, 10.582, 29.484, 10.395, 29.269999);
        ((GeneralPath) shape).curveTo(10.312, 29.147999, 10.2300005, 28.972998, 10.145, 28.734);
        ((GeneralPath) shape).curveTo(10.078, 28.535, 10.008, 28.397999, 9.926001, 28.32);
        ((GeneralPath) shape).lineTo(9.527, 27.969);
        ((GeneralPath) shape).curveTo(9.0, 28.621, 8.7300005, 29.016, 8.715, 29.156);
        ((GeneralPath) shape).curveTo(8.695, 29.238, 8.812, 29.555, 9.062, 30.109);
        ((GeneralPath) shape).curveTo(9.316, 30.625, 9.523001, 31.008, 9.691, 31.265999);
        ((GeneralPath) shape).curveTo(9.898, 31.602, 10.117, 31.546999, 10.348, 31.102);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.02, 28.961);
        ((GeneralPath) shape).lineTo(19.258001, 28.32);
        ((GeneralPath) shape).curveTo(19.176, 28.203, 19.02, 28.074, 18.797, 27.941);
        ((GeneralPath) shape).lineTo(18.496, 27.766);
        ((GeneralPath) shape).lineTo(17.488, 28.328001);
        ((GeneralPath) shape).lineTo(18.395, 29.961);
        ((GeneralPath) shape).lineTo(19.945, 29.535);
        ((GeneralPath) shape).lineTo(20.02, 28.961);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.73, 30.289);
        ((GeneralPath) shape).lineTo(18.441, 29.449);
        ((GeneralPath) shape).lineTo(18.398, 28.938);
        ((GeneralPath) shape).lineTo(18.496, 27.765999);
        ((GeneralPath) shape).lineTo(18.406, 27.796999);
        ((GeneralPath) shape).lineTo(16.941, 28.07);
        ((GeneralPath) shape).lineTo(16.438, 28.324);
        ((GeneralPath) shape).curveTo(16.414, 28.324, 16.18, 28.418, 15.723, 28.609);
        ((GeneralPath) shape).curveTo(15.464999, 28.715, 15.245999, 28.82, 15.07, 28.921999);
        ((GeneralPath) shape).lineTo(13.882999, 29.519999);
        ((GeneralPath) shape).lineTo(13.874999, 30.569998);
        ((GeneralPath) shape).lineTo(15.73, 30.288998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.055, 30.066);
        ((GeneralPath) shape).curveTo(19.453001, 29.895, 19.75, 29.719, 19.945, 29.535);
        ((GeneralPath) shape).lineTo(18.98, 29.348);
        ((GeneralPath) shape).lineTo(18.397999, 28.938);
        ((GeneralPath) shape).curveTo(18.199, 28.945, 17.921999, 29.02, 17.565998, 29.168);
        ((GeneralPath) shape).lineTo(13.874998, 30.57);
        ((GeneralPath) shape).lineTo(14.667998, 31.152);
        ((GeneralPath) shape).lineTo(15.483998, 31.434);
        ((GeneralPath) shape).lineTo(16.858997, 31.074);
        ((GeneralPath) shape).curveTo(17.374998, 30.901999, 18.104998, 30.566, 19.054996, 30.066);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.016, 27.094);
        ((GeneralPath) shape).lineTo(7.3589997, 27.688);
        ((GeneralPath) shape).lineTo(10.973, 28.234);
        ((GeneralPath) shape).lineTo(11.089999, 28.081999);
        ((GeneralPath) shape).curveTo(11.167999, 27.960999, 11.194999, 27.852, 11.171999, 27.749998);
        ((GeneralPath) shape).curveTo(11.147999, 27.550999, 10.995999, 27.452997, 10.714999, 27.460999);
        ((GeneralPath) shape).lineTo(8.6449995, 27.477);
        ((GeneralPath) shape).curveTo(8.426, 27.48, 8.183999, 27.397999, 7.9179993, 27.223);
        ((GeneralPath) shape).curveTo(7.655999, 27.050999, 7.472999, 26.945, 7.3709993, 26.906);
        ((GeneralPath) shape).curveTo(7.2699995, 26.848, 7.1909995, 26.828001, 7.1329994, 26.852);
        ((GeneralPath) shape).lineTo(7.0429993, 26.883);
        ((GeneralPath) shape).lineTo(7.0159993, 27.094);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.902, 27.336);
        ((GeneralPath) shape).curveTo(6.922, 27.438, 6.9769998, 27.543001, 7.059, 27.664);
        ((GeneralPath) shape).curveTo(7.203, 27.918, 7.387, 28.086, 7.609, 28.16);
        ((GeneralPath) shape).curveTo(7.934, 28.293, 8.324, 28.406, 8.7890005, 28.496);
        ((GeneralPath) shape).curveTo(9.312, 28.602001, 9.691001, 28.625, 9.93, 28.559);
        ((GeneralPath) shape).curveTo(10.27, 28.492, 10.617001, 28.383, 10.973001, 28.234);
        ((GeneralPath) shape).curveTo(11.027, 27.973, 10.934001, 27.816, 10.691001, 27.762);
        ((GeneralPath) shape).curveTo(10.633001, 27.741999, 10.332001, 27.75, 9.793001, 27.780998);
        ((GeneralPath) shape).curveTo(9.254002, 27.831999, 8.793001, 27.792997, 8.410001, 27.663998);
        ((GeneralPath) shape).curveTo(8.008, 27.530998, 7.664001, 27.358997, 7.3790007, 27.144999);
        ((GeneralPath) shape).curveTo(7.2150006, 27.050999, 7.1020007, 26.960999, 7.0430007, 26.883);
        ((GeneralPath) shape).curveTo(6.9060006, 27.008, 6.8590007, 27.156, 6.902001, 27.335999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.168, 28.32);
        ((GeneralPath) shape).curveTo(19.324, 28.258, 19.48, 28.125, 19.637, 27.921999);
        ((GeneralPath) shape).curveTo(19.772999, 27.776999, 20.144999, 27.737999, 20.745998, 27.804998);
        ((GeneralPath) shape).curveTo(20.905998, 27.823997, 21.078, 27.878998, 21.257998, 27.977);
        ((GeneralPath) shape).curveTo(21.401997, 28.050999, 21.499998, 28.078, 21.561998, 28.059);
        ((GeneralPath) shape).curveTo(21.679998, 27.996, 21.737999, 27.914, 21.734, 27.812);
        ((GeneralPath) shape).lineTo(21.644999, 27.668001);
        ((GeneralPath) shape).curveTo(21.602, 27.566002, 21.468998, 27.480001, 21.245998, 27.406002);
        ((GeneralPath) shape).curveTo(20.984, 27.312002, 20.714998, 27.266003, 20.433998, 27.273003);
        ((GeneralPath) shape).curveTo(19.952997, 27.262003, 19.464998, 27.355003, 18.968998, 27.547003);
        ((GeneralPath) shape).curveTo(18.554998, 27.715002, 18.347998, 27.941002, 18.354998, 28.219004);
        ((GeneralPath) shape).curveTo(18.358997, 28.398005, 18.628998, 28.434004, 19.167997, 28.320004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.305, 28.723);
        ((GeneralPath) shape).curveTo(21.605, 28.737999, 21.895, 28.691, 22.172, 28.586);
        ((GeneralPath) shape).curveTo(22.43, 28.477001, 22.559, 28.387001, 22.559, 28.305);
        ((GeneralPath) shape).curveTo(22.535, 28.207, 22.285, 28.223, 21.809, 28.352001);
        ((GeneralPath) shape).curveTo(21.688, 28.375002, 21.469, 28.352001, 21.145, 28.277);
        ((GeneralPath) shape).curveTo(20.824001, 28.203001, 20.594, 28.191, 20.453001, 28.234001);
        ((GeneralPath) shape).curveTo(20.277, 28.277, 20.320002, 28.375002, 20.582, 28.531002);
        ((GeneralPath) shape).curveTo(20.824001, 28.664001, 21.066, 28.730001, 21.305, 28.723001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.176, 25.629);
        ((GeneralPath) shape).curveTo(12.594, 25.578, 12.691, 25.426, 12.464999, 25.171999);
        ((GeneralPath) shape).curveTo(12.261999, 24.956999, 11.983999, 24.811998, 11.6449995, 24.737999);
        ((GeneralPath) shape).curveTo(11.483999, 24.723, 11.32, 24.565998, 11.151999, 24.269999);
        ((GeneralPath) shape).curveTo(11.007999, 24.012, 10.8359995, 23.905998, 10.636999, 23.953);
        ((GeneralPath) shape).curveTo(10.378999, 24.019999, 10.280999, 24.210999, 10.351999, 24.526999);
        ((GeneralPath) shape).curveTo(10.3949995, 24.828, 10.530999, 25.054998, 10.754, 25.210999);
        ((GeneralPath) shape).curveTo(11.242, 25.538998, 11.715, 25.679998, 12.176, 25.628998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.301, 25.812);
        ((GeneralPath) shape).curveTo(22.039001, 25.758, 22.375, 25.59, 22.309, 25.312);
        ((GeneralPath) shape).curveTo(22.242, 25.031, 22.0, 24.926, 21.582, 24.996);
        ((GeneralPath) shape).curveTo(21.383001, 25.02, 21.102001, 24.996, 20.742, 24.926);
        ((GeneralPath) shape).curveTo(20.379, 24.832, 20.039001, 24.812, 19.719, 24.859001);
        ((GeneralPath) shape).curveTo(19.262, 24.910002, 19.273, 25.090002, 19.762, 25.398);
        ((GeneralPath) shape).curveTo(20.23, 25.707, 20.741999, 25.844, 21.300999, 25.812);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.02, 27.082);
        ((GeneralPath) shape).curveTo(25.457, 26.93, 25.602001, 26.777, 25.461, 26.621);
        ((GeneralPath) shape).curveTo(25.316, 26.465, 25.113, 26.387001, 24.855, 26.395);
        ((GeneralPath) shape).curveTo(23.977, 26.414, 23.508, 26.504, 23.449, 26.664);
        ((GeneralPath) shape).curveTo(23.394999, 26.828, 23.559, 26.965, 23.941, 27.074);
        ((GeneralPath) shape).curveTo(24.344, 27.184, 24.703, 27.188, 25.02, 27.081999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.297, 26.156);
        ((GeneralPath) shape).curveTo(7.699, 26.289, 8.047, 26.23, 8.344, 25.984);
        ((GeneralPath) shape).curveTo(8.617, 25.758, 8.684, 25.585999, 8.539, 25.469);
        ((GeneralPath) shape).curveTo(8.438, 25.391, 8.289, 25.362999, 8.089999, 25.391);
        ((GeneralPath) shape).curveTo(7.710999, 25.418001, 7.487999, 25.434, 7.4299994, 25.434);
        ((GeneralPath) shape).curveTo(7.327999, 25.418, 7.155999, 25.359, 6.9139996, 25.266);
        ((GeneralPath) shape).curveTo(6.7539997, 25.211, 6.6129994, 25.211, 6.4959993, 25.273);
        ((GeneralPath) shape).curveTo(6.3359995, 25.359001, 6.378999, 25.508001, 6.6249995, 25.723001);
        ((GeneralPath) shape).curveTo(6.8279996, 25.918001, 7.0549994, 26.062002, 7.2969995, 26.156002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.625, 26.906);
        ((GeneralPath) shape).curveTo(12.613, 26.527, 12.699, 26.207, 12.871, 25.941);
        ((GeneralPath) shape).curveTo(12.152, 26.039, 11.676001, 26.117, 11.438001, 26.184);
        ((GeneralPath) shape).curveTo(10.938001, 26.273, 10.602, 26.434, 10.426001, 26.656);
        ((GeneralPath) shape).curveTo(10.410001, 26.758, 10.402, 26.859, 10.402, 26.957);
        ((GeneralPath) shape).curveTo(10.391001, 27.199001, 10.402, 27.359001, 10.445001, 27.438002);
        ((GeneralPath) shape).lineTo(10.832001, 28.688002);
        ((GeneralPath) shape).lineTo(11.609001, 28.492002);
        ((GeneralPath) shape).curveTo(11.688002, 28.449003, 11.895001, 28.375002, 12.234001, 28.266003);
        ((GeneralPath) shape).curveTo(12.512001, 28.199003, 12.652001, 28.148003, 12.652001, 28.109003);
        ((GeneralPath) shape).lineTo(12.625001, 26.906004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.828, 28.441);
        ((GeneralPath) shape).lineTo(12.652, 28.109);
        ((GeneralPath) shape).lineTo(12.262, 28.206999);
        ((GeneralPath) shape).lineTo(11.609, 28.491999);
        ((GeneralPath) shape).lineTo(10.832, 28.687998);
        ((GeneralPath) shape).lineTo(11.164, 28.769999);
        ((GeneralPath) shape).lineTo(11.797, 28.847998);
        ((GeneralPath) shape).lineTo(12.008, 28.811998);
        ((GeneralPath) shape).lineTo(13.023001, 28.729998);
        ((GeneralPath) shape).curveTo(13.203001, 28.726997, 13.473001, 28.628998, 13.828001, 28.440998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.652, 28.109);
        ((GeneralPath) shape).lineTo(13.1640005, 28.335999);
        ((GeneralPath) shape).lineTo(13.828, 28.440998);
        ((GeneralPath) shape).lineTo(13.793, 26.819998);
        ((GeneralPath) shape).lineTo(13.93, 26.249998);
        ((GeneralPath) shape).lineTo(12.871, 25.940998);
        ((GeneralPath) shape).curveTo(12.715, 26.085999, 12.629001, 26.226997, 12.613, 26.366999);
        ((GeneralPath) shape).lineTo(12.566, 26.968998);
        ((GeneralPath) shape).lineTo(12.652, 28.108997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.559, 28.5);
        ((GeneralPath) shape).lineTo(18.352, 28.07);
        ((GeneralPath) shape).curveTo(18.59, 28.004, 18.809, 27.91, 19.004, 27.785);
        ((GeneralPath) shape).lineTo(17.765999, 27.421999);
        ((GeneralPath) shape).lineTo(15.171999, 28.081999);
        ((GeneralPath) shape).lineTo(15.534999, 28.254);
        ((GeneralPath) shape).lineTo(16.558998, 28.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.969, 27.094);
        ((GeneralPath) shape).lineTo(15.172, 28.082);
        ((GeneralPath) shape).lineTo(17.766, 27.422);
        ((GeneralPath) shape).lineTo(17.832, 26.402);
        ((GeneralPath) shape).lineTo(16.91, 26.633001);
        ((GeneralPath) shape).curveTo(16.809, 26.676, 16.641, 26.699001, 16.398, 26.703001);
        ((GeneralPath) shape).curveTo(16.141, 26.730001, 15.969001, 26.754002, 15.891001, 26.773);
        ((GeneralPath) shape).curveTo(15.531001, 26.863, 15.227001, 26.969, 14.969001, 27.094);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x805328));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.004, 27.785);
        ((GeneralPath) shape).lineTo(19.191, 26.82);
        ((GeneralPath) shape).lineTo(17.832, 26.402);
        ((GeneralPath) shape).lineTo(17.727001, 26.945);
        ((GeneralPath) shape).lineTo(17.766, 27.421999);
        ((GeneralPath) shape).lineTo(18.191, 27.624998);
        ((GeneralPath) shape).curveTo(18.332, 27.679998, 18.602, 27.733997, 19.004, 27.784998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x57381B));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.191, 25.875);
        ((GeneralPath) shape).curveTo(17.594, 25.887, 17.801, 25.754, 17.812, 25.473);
        ((GeneralPath) shape).curveTo(17.809, 25.272999, 17.715, 25.094, 17.531, 24.938);
        ((GeneralPath) shape).curveTo(17.348, 24.762, 16.965, 24.68, 16.387001, 24.691);
        ((GeneralPath) shape).curveTo(16.266, 24.695, 16.008001, 24.773, 15.609001, 24.922);
        ((GeneralPath) shape).lineTo(15.047001, 25.172);
        ((GeneralPath) shape).lineTo(15.262001, 25.469002);
        ((GeneralPath) shape).lineTo(16.023, 25.930002);
        ((GeneralPath) shape).lineTo(17.191, 25.875002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.027, 26.188);
        ((GeneralPath) shape).curveTo(10.145, 26.062, 10.160001, 25.941, 10.078, 25.824);
        ((GeneralPath) shape).curveTo(9.812, 25.57, 9.59, 25.425999, 9.41, 25.390999);
        ((GeneralPath) shape).lineTo(8.562, 25.137);
        ((GeneralPath) shape).lineTo(8.367001, 25.741999);
        ((GeneralPath) shape).curveTo(8.312, 25.964998, 8.297001, 26.124998, 8.316001, 26.223);
        ((GeneralPath) shape).lineTo(8.348001, 26.312);
        ((GeneralPath) shape).lineTo(9.078001, 26.719);
        ((GeneralPath) shape).curveTo(9.281001, 26.812, 9.441001, 26.801, 9.559001, 26.676);
        ((GeneralPath) shape).lineTo(10.027001, 26.188);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.32, 26.285);
        ((GeneralPath) shape).lineTo(8.438, 26.25);
        ((GeneralPath) shape).curveTo(8.792999, 26.062, 9.07, 25.859, 9.266, 25.633);
        ((GeneralPath) shape).lineTo(9.438, 25.390999);
        ((GeneralPath) shape).lineTo(9.254, 25.241999);
        ((GeneralPath) shape).lineTo(8.891, 25.012);
        ((GeneralPath) shape).lineTo(8.7109995, 25.015999);
        ((GeneralPath) shape).lineTo(7.9649997, 25.272999);
        ((GeneralPath) shape).lineTo(8.061999, 25.629);
        ((GeneralPath) shape).lineTo(8.32, 26.285);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.328, 24.387);
        ((GeneralPath) shape).lineTo(13.977, 24.296999);
        ((GeneralPath) shape).lineTo(14.129001, 24.504);
        ((GeneralPath) shape).curveTo(14.461, 24.918, 14.715001, 25.121, 14.895, 25.117);
        ((GeneralPath) shape).curveTo(14.973001, 25.113, 15.043, 25.035, 15.098001, 24.871);
        ((GeneralPath) shape).curveTo(15.250001, 24.57, 15.328, 24.406, 15.328, 24.387001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1BD88));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.262, 24.645);
        ((GeneralPath) shape).lineTo(13.848001, 25.262001);
        ((GeneralPath) shape).curveTo(14.031, 25.438002, 14.250001, 25.461, 14.508, 25.336);
        ((GeneralPath) shape).lineTo(14.984, 25.086);
        ((GeneralPath) shape).curveTo(15.043, 25.023, 14.879001, 24.918001, 14.496, 24.766);
        ((GeneralPath) shape).lineTo(13.977, 24.297);
        ((GeneralPath) shape).lineTo(13.707, 24.363);
        ((GeneralPath) shape).lineTo(13.262, 24.645);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6D3A3));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_36

        // _0_0_3_0_0_0_0_0_0_36_0

        // _0_0_3_0_0_0_0_0_0_36_0_0

        // _0_0_3_0_0_0_0_0_0_36_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.922, 26.398);
        ((GeneralPath) shape).curveTo(5.914, 26.156, 5.715, 26.055, 5.312, 26.082);
        ((GeneralPath) shape).lineTo(4.836, 26.152);
        ((GeneralPath) shape).curveTo(4.762, 26.414, 4.805, 26.621, 4.969, 26.781);
        ((GeneralPath) shape).curveTo(5.2149997, 27.035, 5.4769998, 27.059, 5.75, 26.852);
        ((GeneralPath) shape).curveTo(5.887, 26.75, 5.945, 26.598, 5.922, 26.397999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(7.674799919128418, -11.093000411987305), new Point2D.Double(9.524800300598145, -11.093000411987305), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_37

        // _0_0_3_0_0_0_0_0_0_37_0

        // _0_0_3_0_0_0_0_0_0_37_0_0

        // _0_0_3_0_0_0_0_0_0_37_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.758, 24.0);
        ((GeneralPath) shape).curveTo(13.75, 23.641, 13.445001, 23.48, 12.848001, 23.512);
        ((GeneralPath) shape).lineTo(12.129001, 23.616999);
        ((GeneralPath) shape).curveTo(12.0390005, 23.999998, 12.117001, 24.328, 12.363001, 24.602);
        ((GeneralPath) shape).curveTo(12.7300005, 24.977, 13.109001, 25.008, 13.504001, 24.699);
        ((GeneralPath) shape).curveTo(13.699, 24.555, 13.785001, 24.32, 13.758, 24.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.88800048828125, -14.685999870300293), new Point2D.Double(22.613000869750977, -14.685999870300293), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_38

        // _0_0_3_0_0_0_0_0_0_38_0

        // _0_0_3_0_0_0_0_0_0_38_0_0

        // _0_0_3_0_0_0_0_0_0_38_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.676, 26.148);
        ((GeneralPath) shape).curveTo(11.667999, 25.789001, 11.382999, 25.625, 10.823999, 25.656);
        ((GeneralPath) shape).lineTo(10.167999, 25.793);
        ((GeneralPath) shape).curveTo(10.147999, 25.870998, 10.140999, 25.973, 10.1449995, 26.094);
        ((GeneralPath) shape).curveTo(10.148, 26.332, 10.226999, 26.531, 10.367, 26.688);
        ((GeneralPath) shape).curveTo(10.695, 27.062, 11.047, 27.105, 11.422, 26.816);
        ((GeneralPath) shape).curveTo(11.617, 26.672, 11.703, 26.449, 11.676, 26.148);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.524999618530273, -11.227999687194824), new Point2D.Double(19.075000762939453, -11.227999687194824), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_39

        // _0_0_3_0_0_0_0_0_0_39_0

        // _0_0_3_0_0_0_0_0_0_39_0_0

        // _0_0_3_0_0_0_0_0_0_39_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.543, 28.645);
        ((GeneralPath) shape).curveTo(15.535, 28.363, 15.254001, 28.238, 14.695001, 28.273);
        ((GeneralPath) shape).lineTo(14.035001, 28.348001);
        ((GeneralPath) shape).curveTo(14.02, 28.426, 14.012001, 28.516, 14.012001, 28.617);
        ((GeneralPath) shape).curveTo(14.016001, 28.816, 14.090001, 28.977001, 14.234001, 29.094);
        ((GeneralPath) shape).curveTo(14.582001, 29.406, 14.930001, 29.438, 15.285001, 29.188);
        ((GeneralPath) shape).curveTo(15.461, 29.066, 15.547001, 28.883, 15.543001, 28.645);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(22.899999618530273, -6.948200225830078), new Point2D.Double(25.399999618530273, -6.948200225830078), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_40

        // _0_0_3_0_0_0_0_0_0_40_0

        // _0_0_3_0_0_0_0_0_0_40_0_0

        // _0_0_3_0_0_0_0_0_0_40_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.719, 26.578);
        ((GeneralPath) shape).curveTo(20.711, 26.214998, 20.406, 26.054998, 19.809, 26.085999);
        ((GeneralPath) shape).lineTo(19.09, 26.222998);
        ((GeneralPath) shape).curveTo(19.07, 26.323997, 19.062, 26.433998, 19.066, 26.554998);
        ((GeneralPath) shape).curveTo(19.094, 26.811998, 19.18, 27.019999, 19.32, 27.179998);
        ((GeneralPath) shape).curveTo(19.671999, 27.569998, 20.051, 27.612999, 20.465, 27.300999);
        ((GeneralPath) shape).curveTo(20.66, 27.137, 20.746, 26.894999, 20.719, 26.578);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(31.38800048828125, -10.116000175476074), new Point2D.Double(34.112998962402344, -10.116000175476074), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_41

        // _0_0_3_0_0_0_0_0_0_41_0

        // _0_0_3_0_0_0_0_0_0_41_0_0

        // _0_0_3_0_0_0_0_0_0_41_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.383, 28.176);
        ((GeneralPath) shape).curveTo(24.379, 27.895, 24.105, 27.762001, 23.566, 27.773);
        ((GeneralPath) shape).lineTo(22.906, 27.879002);
        ((GeneralPath) shape).curveTo(22.891, 27.957, 22.883, 28.051003, 22.883, 28.148);
        ((GeneralPath) shape).curveTo(22.887, 28.348001, 22.960999, 28.516, 23.105, 28.652);
        ((GeneralPath) shape).curveTo(23.453, 28.945, 23.800999, 28.969, 24.156, 28.719);
        ((GeneralPath) shape).curveTo(24.336, 28.598, 24.41, 28.414, 24.383, 28.176);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(37.70000076293945, -7.416500091552734), new Point2D.Double(40.20000076293945, -7.416500091552734), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_42

        // _0_0_3_0_0_0_0_0_0_42_0

        // _0_0_3_0_0_0_0_0_0_42_0_0

        // _0_0_3_0_0_0_0_0_0_42_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.469, 26.523);
        ((GeneralPath) shape).curveTo(24.664, 26.359001, 24.75, 26.117, 24.723, 25.797);
        ((GeneralPath) shape).curveTo(24.715, 25.438002, 24.41, 25.273, 23.809, 25.309);
        ((GeneralPath) shape).curveTo(23.59, 25.312, 23.41, 25.336, 23.273, 25.379);
        ((GeneralPath) shape).lineTo(23.125, 25.441);
        ((GeneralPath) shape).curveTo(23.105, 25.543, 23.098, 25.652, 23.102, 25.773);
        ((GeneralPath) shape).curveTo(23.105, 26.035, 23.179998, 26.242, 23.324, 26.398);
        ((GeneralPath) shape).curveTo(23.691, 26.77, 24.074, 26.812, 24.469, 26.523);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(38.13800048828125, -11.277999877929688), new Point2D.Double(40.862998962402344, -11.277999877929688), new float[]{0, 1}, new Color[]{new Color(0x548735), new Color(0x4A7516)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.633, 31.805);
        ((GeneralPath) shape).curveTo(14.293, 31.691, 14.707001, 31.562, 14.887, 31.418001);
        ((GeneralPath) shape).curveTo(14.945, 31.379002, 14.992, 31.246, 15.027, 31.023);
        ((GeneralPath) shape).curveTo(15.043, 30.906, 14.9800005, 30.836, 14.84, 30.820002);
        ((GeneralPath) shape).lineTo(14.211, 30.832);
        ((GeneralPath) shape).curveTo(13.992001, 30.84, 13.68, 30.766, 13.277, 30.613);
        ((GeneralPath) shape).curveTo(12.832001, 30.426, 12.5390005, 30.312, 12.398001, 30.273);
        ((GeneralPath) shape).curveTo(12.176001, 30.16, 12.004001, 30.074001, 11.883, 30.016);
        ((GeneralPath) shape).curveTo(11.660001, 29.941, 11.461, 29.926, 11.281, 29.969);
        ((GeneralPath) shape).curveTo(11.082, 29.992, 11.047, 30.164, 11.172, 30.48);
        ((GeneralPath) shape).curveTo(11.281, 30.758, 11.434, 30.996, 11.641, 31.191);
        ((GeneralPath) shape).curveTo(11.823999, 31.348, 12.1449995, 31.488, 12.609, 31.621);
        ((GeneralPath) shape).curveTo(13.051001, 31.77, 13.395, 31.832, 13.633, 31.805);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.645, 26.531);
        ((GeneralPath) shape).curveTo(6.824, 26.469, 6.8519998, 26.406, 6.73, 26.352);
        ((GeneralPath) shape).curveTo(6.629, 26.293, 6.496, 26.265999, 6.336, 26.269999);
        ((GeneralPath) shape).curveTo(6.176, 26.272999, 6.148, 26.331999, 6.25, 26.449);
        ((GeneralPath) shape).curveTo(6.355, 26.566, 6.484, 26.594, 6.645, 26.531);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x664220));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.887, 24.32);
        ((GeneralPath) shape).curveTo(17.206999, 24.316, 17.414, 24.262, 17.512, 24.156);
        ((GeneralPath) shape).curveTo(17.609, 24.055, 17.57, 23.957, 17.387, 23.859);
        ((GeneralPath) shape).curveTo(17.022999, 23.706999, 16.620998, 23.629, 16.179998, 23.616999);
        ((GeneralPath) shape).curveTo(15.300999, 23.598, 14.729999, 23.699, 14.476998, 23.925999);
        ((GeneralPath) shape).curveTo(14.397998, 24.026999, 14.550999, 24.093998, 14.933998, 24.124998);
        ((GeneralPath) shape).curveTo(15.394999, 24.194998, 15.632998, 24.237999, 15.655998, 24.257998);
        ((GeneralPath) shape).curveTo(15.733998, 24.315998, 16.147999, 24.339998, 16.886997, 24.319998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.277, 24.672);
        ((GeneralPath) shape).curveTo(21.855, 24.641, 22.184, 24.582, 22.262001, 24.5);
        ((GeneralPath) shape).curveTo(22.34, 24.422, 22.207, 24.324, 21.867, 24.211);
        ((GeneralPath) shape).curveTo(21.32, 24.023, 20.812, 24.023, 20.336, 24.215);
        ((GeneralPath) shape).curveTo(20.098, 24.301, 20.129, 24.41, 20.434, 24.543);
        ((GeneralPath) shape).curveTo(20.715, 24.656, 20.996, 24.699, 21.277, 24.671999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.109, 26.641);
        ((GeneralPath) shape).curveTo(15.465, 26.555, 15.582, 26.441, 15.461, 26.305);
        ((GeneralPath) shape).curveTo(15.336, 26.168001, 15.086, 26.113, 14.707001, 26.141);
        ((GeneralPath) shape).curveTo(14.328001, 26.168001, 14.219001, 26.281, 14.383, 26.477001);
        ((GeneralPath) shape).curveTo(14.527, 26.695002, 14.77, 26.750002, 15.109, 26.641);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.227, 25.312);
        ((GeneralPath) shape).lineTo(6.3440003, 25.16);
        ((GeneralPath) shape).curveTo(6.4410005, 25.055, 6.551, 25.016, 6.6720004, 25.031);
        ((GeneralPath) shape).lineTo(6.9730005, 25.086);
        ((GeneralPath) shape).curveTo(6.6480007, 24.953001, 6.4060006, 24.906, 6.2500005, 24.949001);
        ((GeneralPath) shape).curveTo(6.1290007, 24.973001, 6.0900006, 25.043001, 6.1330004, 25.164001);
        ((GeneralPath) shape).lineTo(6.227, 25.312002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE6C77A));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.773, 26.094);
        ((GeneralPath) shape).curveTo(4.8519998, 26.051, 4.9529996, 26.012, 5.0699997, 25.969);
        ((GeneralPath) shape).curveTo(5.148, 25.926, 5.16, 25.895, 5.0979996, 25.875);
        ((GeneralPath) shape).curveTo(5.0389996, 25.84, 4.9179997, 25.852, 4.7379994, 25.914);
        ((GeneralPath) shape).curveTo(4.6409993, 25.938, 4.6019993, 25.977, 4.6209993, 26.035);
        ((GeneralPath) shape).curveTo(4.6449995, 26.098, 4.694999, 26.112999, 4.7729993, 26.094);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.52, 25.957);
        ((GeneralPath) shape).curveTo(5.621, 25.934, 5.66, 25.902, 5.637, 25.863);
        ((GeneralPath) shape).curveTo(5.617, 25.824001, 5.566, 25.805, 5.488, 25.809);
        ((GeneralPath) shape).curveTo(5.387, 25.809, 5.398, 25.859, 5.52, 25.957);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.711, 26.859);
        ((GeneralPath) shape).curveTo(6.707, 26.762, 6.867, 26.706999, 7.1879997, 26.699);
        ((GeneralPath) shape).curveTo(7.3869996, 26.695, 7.5659995, 26.723, 7.7299995, 26.776999);
        ((GeneralPath) shape).curveTo(7.5269995, 26.602, 7.3239994, 26.526999, 7.1249995, 26.550999);
        ((GeneralPath) shape).curveTo(6.7269993, 26.602, 6.5269995, 26.683998, 6.5309997, 26.804998);
        ((GeneralPath) shape).curveTo(6.5309997, 26.862999, 6.562, 26.894999, 6.621, 26.890999);
        ((GeneralPath) shape).curveTo(6.66, 26.890999, 6.691, 26.879, 6.711, 26.859);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.371, 25.52);
        ((GeneralPath) shape).lineTo(10.883, 25.508001);
        ((GeneralPath) shape).curveTo(10.578, 25.375002, 10.348001, 25.289001, 10.188001, 25.254002);
        ((GeneralPath) shape).curveTo(9.824, 25.219002, 9.574, 25.117002, 9.43, 24.938002);
        ((GeneralPath) shape).curveTo(9.242001, 24.723001, 8.953, 24.648, 8.555, 24.719002);
        ((GeneralPath) shape).curveTo(8.3550005, 24.742002, 8.195001, 24.816002, 8.078, 24.938002);
        ((GeneralPath) shape).lineTo(7.934, 25.121002);
        ((GeneralPath) shape).lineTo(8.109, 25.027002);
        ((GeneralPath) shape).curveTo(8.488, 24.879002, 8.766, 24.832003, 8.949, 24.891003);
        ((GeneralPath) shape).curveTo(9.129001, 24.945004, 9.371, 25.090002, 9.676001, 25.324003);
        ((GeneralPath) shape).curveTo(10.000001, 25.457003, 10.2300005, 25.520002, 10.371, 25.520002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.09, 25.809);
        ((GeneralPath) shape).lineTo(12.449, 25.742);
        ((GeneralPath) shape).curveTo(12.707001, 25.715, 12.887, 25.723001, 12.988, 25.758001);
        ((GeneralPath) shape).curveTo(13.168, 25.816002, 13.328, 25.844002, 13.469, 25.840002);
        ((GeneralPath) shape).curveTo(13.422, 25.578003, 13.262, 25.473001, 12.984, 25.520002);
        ((GeneralPath) shape).lineTo(12.09, 25.809002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.105, 26.125);
        ((GeneralPath) shape).lineTo(14.195, 26.031);
        ((GeneralPath) shape).curveTo(14.273, 25.992, 14.3949995, 25.969, 14.554999, 25.965);
        ((GeneralPath) shape).lineTo(15.242, 25.949);
        ((GeneralPath) shape).curveTo(14.839999, 25.776999, 14.526999, 25.734, 14.309, 25.82);
        ((GeneralPath) shape).curveTo(14.172, 25.883, 14.094, 25.953, 14.074, 26.035);
        ((GeneralPath) shape).lineTo(14.1050005, 26.125);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.523, 27.254);
        ((GeneralPath) shape).curveTo(14.82, 27.227, 14.938, 27.125, 14.875, 26.949);
        ((GeneralPath) shape).lineTo(14.516, 26.984);
        ((GeneralPath) shape).curveTo(14.375, 27.008, 14.316, 27.059, 14.34, 27.140999);
        ((GeneralPath) shape).curveTo(14.383, 27.237999, 14.441, 27.276999, 14.523, 27.254);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.473, 26.785);
        ((GeneralPath) shape).curveTo(15.589999, 26.742, 15.801, 26.695, 16.098, 26.648);
        ((GeneralPath) shape).curveTo(16.258, 26.605001, 16.219, 26.586, 15.976999, 26.594);
        ((GeneralPath) shape).curveTo(15.636999, 26.621, 15.409999, 26.656, 15.289, 26.699);
        ((GeneralPath) shape).curveTo(15.23, 26.737999, 15.223, 26.769999, 15.261999, 26.789);
        ((GeneralPath) shape).curveTo(15.280999, 26.809, 15.351999, 26.809, 15.473, 26.785);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.16, 24.113);
        ((GeneralPath) shape).lineTo(10.276999, 23.961);
        ((GeneralPath) shape).lineTo(10.754, 23.738);
        ((GeneralPath) shape).curveTo(10.651999, 23.723001, 10.473, 23.727001, 10.2109995, 23.75);
        ((GeneralPath) shape).curveTo(10.051, 23.773, 9.973, 23.836, 9.976999, 23.938);
        ((GeneralPath) shape).curveTo(9.999999, 24.035, 10.058999, 24.094, 10.159999, 24.112999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.793, 24.969);
        ((GeneralPath) shape).curveTo(19.031, 24.965, 19.219, 24.91, 19.359, 24.809);
        ((GeneralPath) shape).curveTo(19.477, 24.703, 19.675999, 24.629, 19.953, 24.582);
        ((GeneralPath) shape).curveTo(19.512, 24.574001, 19.151999, 24.582, 18.875, 24.609001);
        ((GeneralPath) shape).curveTo(18.695, 24.613, 18.594, 24.672, 18.578, 24.793001);
        ((GeneralPath) shape).curveTo(18.559, 24.914001, 18.633, 24.973001, 18.793, 24.969002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.879, 26.227);
        ((GeneralPath) shape).lineTo(18.965, 26.074);
        ((GeneralPath) shape).curveTo(19.043, 25.996, 19.184, 25.949, 19.383, 25.945);
        ((GeneralPath) shape).lineTo(19.921999, 25.934);
        ((GeneralPath) shape).curveTo(19.339998, 25.707, 18.956999, 25.676, 18.780998, 25.84);
        ((GeneralPath) shape).curveTo(18.663998, 25.941, 18.644999, 26.031, 18.726997, 26.109);
        ((GeneralPath) shape).curveTo(18.769997, 26.171999, 18.819998, 26.210999, 18.878998, 26.227);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.734, 25.453);
        ((GeneralPath) shape).lineTo(22.879, 25.296999);
        ((GeneralPath) shape).curveTo(23.0, 25.214998, 23.156, 25.171999, 23.355, 25.168);
        ((GeneralPath) shape).curveTo(24.098, 25.151999, 24.305, 25.125, 23.984, 25.094);
        ((GeneralPath) shape).curveTo(23.684, 25.078, 23.434, 25.074, 23.234, 25.078);
        ((GeneralPath) shape).curveTo(22.875, 25.066, 22.664, 25.094, 22.605, 25.151999);
        ((GeneralPath) shape).curveTo(22.566, 25.194998, 22.578, 25.253998, 22.640999, 25.331999);
        ((GeneralPath) shape).curveTo(22.659998, 25.370998, 22.690998, 25.409998, 22.734, 25.453);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.668, 27.852);
        ((GeneralPath) shape).lineTo(22.811998, 27.73);
        ((GeneralPath) shape).curveTo(22.972998, 27.647999, 23.190998, 27.612999, 23.472998, 27.625);
        ((GeneralPath) shape).lineTo(24.163998, 27.641);
        ((GeneralPath) shape).curveTo(23.737997, 27.391, 23.304998, 27.320002, 22.866997, 27.43);
        ((GeneralPath) shape).curveTo(22.589996, 27.496, 22.472998, 27.586, 22.515997, 27.707);
        ((GeneralPath) shape).lineTo(22.667997, 27.852001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.062, 28.168);
        ((GeneralPath) shape).curveTo(14.320001, 28.102, 14.5, 28.078, 14.602, 28.094);
        ((GeneralPath) shape).curveTo(14.457, 27.918, 14.324, 27.859, 14.207, 27.921999);
        ((GeneralPath) shape).curveTo(14.129, 27.945, 14.078, 27.995998, 14.059, 28.074);
        ((GeneralPath) shape).lineTo(14.062, 28.168);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_63

        // _0_0_3_0_0_0_0_0_0_63_0

        // _0_0_3_0_0_0_0_0_0_63_0_0

        // _0_0_3_0_0_0_0_0_0_63_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.562, 31.754);
        ((GeneralPath) shape).lineTo(14.77, 31.543);
        ((GeneralPath) shape).lineTo(14.5, 31.578);
        ((GeneralPath) shape).curveTo(14.34, 31.699, 14.191, 31.793, 14.055, 31.855);
        ((GeneralPath) shape).curveTo(13.797, 31.984, 13.477, 32.0, 13.094, 31.91);
        ((GeneralPath) shape).curveTo(12.754, 31.816, 12.5199995, 31.671999, 12.3949995, 31.473);
        ((GeneralPath) shape).curveTo(12.207, 31.098, 12.061999, 30.862999, 11.9609995, 30.765999);
        ((GeneralPath) shape).curveTo(11.304999, 30.137, 10.855, 29.727, 10.612999, 29.535);
        ((GeneralPath) shape).curveTo(10.386999, 29.359, 10.202999, 29.141, 10.058999, 28.887);
        ((GeneralPath) shape).lineTo(9.929999, 28.559);
        ((GeneralPath) shape).lineTo(9.695, 28.742);
        ((GeneralPath) shape).lineTo(9.882999, 29.129);
        ((GeneralPath) shape).curveTo(10.07, 29.527, 10.379, 29.859, 10.804999, 30.129);
        ((GeneralPath) shape).curveTo(11.089999, 30.324, 11.280999, 30.469, 11.386999, 30.566);
        ((GeneralPath) shape).curveTo(11.550999, 30.723, 11.714999, 30.969, 11.882999, 31.305);
        ((GeneralPath) shape).curveTo(12.07, 31.641, 12.266, 31.879, 12.469, 32.012);
        ((GeneralPath) shape).curveTo(12.672, 32.148003, 12.941, 32.23, 13.285, 32.266003);
        ((GeneralPath) shape).curveTo(13.746, 32.312004, 14.172, 32.145004, 14.562, 31.754004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(15.737000465393066, -4.389599800109863), new Point2D.Double(24.062000274658203, -4.389599800109863), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_64

        // _0_0_3_0_0_0_0_0_0_64_0

        // _0_0_3_0_0_0_0_0_0_64_0_0

        // _0_0_3_0_0_0_0_0_0_64_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.406, 30.133);
        ((GeneralPath) shape).lineTo(19.469, 29.695);
        ((GeneralPath) shape).curveTo(18.867, 29.668, 18.328, 29.691, 17.848, 29.762);
        ((GeneralPath) shape).curveTo(17.629, 29.785, 17.300999, 29.804998, 16.859, 29.811998);
        ((GeneralPath) shape).curveTo(16.48, 29.823997, 16.219, 29.847998, 16.081999, 29.890999);
        ((GeneralPath) shape).curveTo(15.765999, 29.999998, 15.288999, 30.308998, 14.659999, 30.824);
        ((GeneralPath) shape).curveTo(14.229999, 31.191, 13.753999, 31.383, 13.233999, 31.394999);
        ((GeneralPath) shape).curveTo(13.112999, 31.397999, 13.0859995, 31.449, 13.147999, 31.546999);
        ((GeneralPath) shape).lineTo(13.269999, 31.695);
        ((GeneralPath) shape).lineTo(13.718999, 31.656);
        ((GeneralPath) shape).curveTo(14.058999, 31.566, 14.374999, 31.398, 14.667999, 31.152);
        ((GeneralPath) shape).curveTo(15.3949995, 30.496, 15.976999, 30.164, 16.418, 30.152);
        ((GeneralPath) shape).lineTo(17.406, 30.133001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(21.350000381469727, -3.7699999809265137), new Point2D.Double(31.950000762939453, -3.7699999809265137), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_65

        // _0_0_3_0_0_0_0_0_0_65_0

        // _0_0_3_0_0_0_0_0_0_65_0_0

        // _0_0_3_0_0_0_0_0_0_65_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.176, 30.469);
        ((GeneralPath) shape).curveTo(17.629, 30.296999, 17.707, 30.184, 17.406, 30.133);
        ((GeneralPath) shape).curveTo(17.246, 30.094, 17.027, 30.109, 16.746, 30.175999);
        ((GeneralPath) shape).curveTo(16.43, 30.223, 16.211, 30.249998, 16.09, 30.249998);
        ((GeneralPath) shape).curveTo(15.809, 30.218998, 15.375, 29.976997, 14.781, 29.530998);
        ((GeneralPath) shape).curveTo(14.559, 29.354998, 13.961, 29.069998, 12.992001, 28.671999);
        ((GeneralPath) shape).curveTo(12.77, 28.554998, 12.551001, 28.550999, 12.332001, 28.655998);
        ((GeneralPath) shape).lineTo(12.098001, 28.839998);
        ((GeneralPath) shape).lineTo(12.398001, 28.831999);
        ((GeneralPath) shape).curveTo(12.637001, 28.848, 12.848001, 28.901999, 13.031001, 28.999998);
        ((GeneralPath) shape).curveTo(13.336001, 29.171999, 13.801001, 29.362999, 14.422001, 29.565998);
        ((GeneralPath) shape).curveTo(14.523001, 29.624998, 14.727001, 29.761997, 15.031001, 29.976997);
        ((GeneralPath) shape).curveTo(15.336001, 30.187998, 15.629001, 30.331997, 15.914001, 30.405998);
        ((GeneralPath) shape).curveTo(16.375002, 30.554998, 16.797, 30.573997, 17.176, 30.468998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.687999725341797, -5.709000110626221), new Point2D.Double(28.711999893188477, -5.709000110626221), new float[]{0, 1}, new Color[]{new Color(0xFF3C00), new Color(0xBD2C00)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_66

        // _0_0_3_0_0_0_0_0_0_66_0

        // _0_0_3_0_0_0_0_0_0_66_0_0

        // _0_0_3_0_0_0_0_0_0_66_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.27, 29.789);
        ((GeneralPath) shape).curveTo(15.547001, 29.781, 15.961, 29.844, 16.504, 29.973);
        ((GeneralPath) shape).lineTo(16.862999, 29.965);
        ((GeneralPath) shape).curveTo(16.397999, 29.715, 15.972999, 29.594, 15.593999, 29.602);
        ((GeneralPath) shape).curveTo(14.995999, 29.616999, 14.409999, 29.848, 13.839999, 30.300999);
        ((GeneralPath) shape).curveTo(13.483999, 30.589998, 12.858999, 30.741999, 11.9609995, 30.765999);
        ((GeneralPath) shape).curveTo(11.698999, 30.769999, 11.405999, 30.706999, 11.0859995, 30.574);
        ((GeneralPath) shape).lineTo(10.690999, 30.401999);
        ((GeneralPath) shape).lineTo(10.815999, 30.668);
        ((GeneralPath) shape).lineTo(11.093999, 30.901999);
        ((GeneralPath) shape).curveTo(11.335999, 31.058998, 11.628999, 31.133, 11.968999, 31.124998);
        ((GeneralPath) shape).curveTo(12.827999, 31.104998, 13.503999, 30.909998, 13.995998, 30.538998);
        ((GeneralPath) shape).curveTo(14.604999, 30.042997, 15.0269985, 29.792997, 15.269999, 29.788998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(17.312000274658203, -4.400400161743164), new Point2D.Double(27.58799934387207, -4.400400161743164), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_67

        // _0_0_3_0_0_0_0_0_0_67_0

        // _0_0_3_0_0_0_0_0_0_67_0_0

        // _0_0_3_0_0_0_0_0_0_67_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.781, 32.629);
        ((GeneralPath) shape).curveTo(16.008, 32.863003, 16.215, 32.809002, 16.41, 32.465);
        ((GeneralPath) shape).lineTo(16.289, 32.469);
        ((GeneralPath) shape).curveTo(16.188, 32.469, 16.059, 32.391003, 15.8949995, 32.234);
        ((GeneralPath) shape).curveTo(15.7109995, 32.039, 15.594, 31.812, 15.547, 31.555);
        ((GeneralPath) shape).curveTo(15.504, 31.316, 15.637, 31.062, 15.953, 30.793001);
        ((GeneralPath) shape).curveTo(16.129, 30.629002, 16.375, 30.414001, 16.688, 30.148);
        ((GeneralPath) shape).curveTo(17.176, 29.598001, 17.445, 29.152, 17.496, 28.809);
        ((GeneralPath) shape).curveTo(17.551, 28.488, 17.414, 28.262, 17.094, 28.129);
        ((GeneralPath) shape).lineTo(17.57, 27.996);
        ((GeneralPath) shape).lineTo(17.656, 27.816);
        ((GeneralPath) shape).curveTo(17.297, 27.883, 17.02, 27.98, 16.82, 28.105);
        ((GeneralPath) shape).curveTo(16.703, 28.168, 16.695, 28.258, 16.796999, 28.375);
        ((GeneralPath) shape).curveTo(16.98, 28.57, 17.085999, 28.719, 17.105, 28.816);
        ((GeneralPath) shape).curveTo(17.152, 28.996, 17.078, 29.199, 16.883, 29.422);
        ((GeneralPath) shape).curveTo(16.824, 29.504002, 16.559, 29.781, 16.09, 30.25);
        ((GeneralPath) shape).curveTo(15.758, 30.539, 15.551001, 30.715, 15.473001, 30.773);
        ((GeneralPath) shape).curveTo(15.352, 30.879002, 15.258, 31.078001, 15.184001, 31.383001);
        ((GeneralPath) shape).curveTo(15.090001, 31.703001, 15.168001, 32.004, 15.4140005, 32.277);
        ((GeneralPath) shape).curveTo(15.52, 32.434002, 15.641001, 32.551, 15.781, 32.629);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(24.687999725341797, -4.400899887084961), new Point2D.Double(29.01099967956543, -4.400899887084961), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_68

        // _0_0_3_0_0_0_0_0_0_68_0

        // _0_0_3_0_0_0_0_0_0_68_0_0

        // _0_0_3_0_0_0_0_0_0_68_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.164, 30.902);
        ((GeneralPath) shape).curveTo(19.508, 31.074001, 19.706999, 30.961, 19.758, 30.559);
        ((GeneralPath) shape).curveTo(19.394999, 30.445, 19.133, 30.293, 18.965, 30.098);
        ((GeneralPath) shape).curveTo(18.762001, 29.82, 18.305, 29.57, 17.598, 29.348);
        ((GeneralPath) shape).curveTo(17.296999, 29.234, 17.022999, 29.081999, 16.777, 28.887);
        ((GeneralPath) shape).curveTo(16.492, 28.651999, 16.27, 28.477, 16.105, 28.359);
        ((GeneralPath) shape).curveTo(15.698999, 28.109, 15.289, 27.987999, 14.867, 27.995998);
        ((GeneralPath) shape).curveTo(14.73, 27.999998, 14.695, 27.901999, 14.773, 27.698997);
        ((GeneralPath) shape).curveTo(14.809, 27.620998, 14.859, 27.526997, 14.914, 27.425997);
        ((GeneralPath) shape).lineTo(14.5, 27.585997);
        ((GeneralPath) shape).curveTo(14.461, 27.687996, 14.445, 27.796997, 14.445, 27.917997);
        ((GeneralPath) shape).curveTo(14.473, 28.136997, 14.605, 28.241997, 14.844, 28.237997);
        ((GeneralPath) shape).curveTo(15.105, 28.233997, 15.323999, 28.265997, 15.507999, 28.343998);
        ((GeneralPath) shape).curveTo(15.608999, 28.401999, 15.82, 28.534998, 16.144999, 28.749998);
        ((GeneralPath) shape).curveTo(16.328, 28.866999, 16.581999, 29.050999, 16.905998, 29.300999);
        ((GeneralPath) shape).curveTo(17.210999, 29.495998, 17.526999, 29.647999, 17.847998, 29.762);
        ((GeneralPath) shape).curveTo(18.351997, 29.929998, 18.792997, 30.311998, 19.163998, 30.901999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(23.63800048828125, -6.205100059509277), new Point2D.Double(32.362998962402344, -6.205100059509277), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_69

        // _0_0_3_0_0_0_0_0_0_69_0

        // _0_0_3_0_0_0_0_0_0_69_0_0

        // _0_0_3_0_0_0_0_0_0_69_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.383, 28.602);
        ((GeneralPath) shape).curveTo(13.219001, 28.522999, 13.008, 28.370998, 12.742001, 28.137);
        ((GeneralPath) shape).curveTo(12.477, 27.901999, 12.172001, 27.719, 11.828001, 27.585999);
        ((GeneralPath) shape).curveTo(11.445001, 27.433998, 11.121001, 27.343998, 10.863001, 27.308998);
        ((GeneralPath) shape).lineTo(10.262001, 27.319998);
        ((GeneralPath) shape).lineTo(10.387001, 27.499998);
        ((GeneralPath) shape).curveTo(10.590001, 27.733997, 11.047001, 27.921999, 11.750001, 28.065998);
        ((GeneralPath) shape).curveTo(12.070001, 28.159998, 12.293001, 28.233997, 12.4140005, 28.292997);
        ((GeneralPath) shape).curveTo(12.535001, 28.370996, 12.648001, 28.495996, 12.754001, 28.675997);
        ((GeneralPath) shape).curveTo(12.8550005, 28.851997, 13.219001, 28.952997, 13.84, 28.979998);
        ((GeneralPath) shape).curveTo(14.363, 29.030998, 14.801001, 29.019999, 15.16, 28.952997);
        ((GeneralPath) shape).curveTo(15.559, 28.882998, 15.469, 28.815998, 14.887, 28.745996);
        ((GeneralPath) shape).curveTo(14.285, 28.819996, 13.785, 28.772997, 13.383, 28.601997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.687999725341797, -8.112799644470215), new Point2D.Double(25.11199951171875, -8.112799644470215), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xFF7B00), new Color(0xDB6A00), new Color(0xDB6A00)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_70

        // _0_0_3_0_0_0_0_0_0_70_0

        // _0_0_3_0_0_0_0_0_0_70_0_0

        // _0_0_3_0_0_0_0_0_0_70_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.875, 30.145);
        ((GeneralPath) shape).curveTo(13.273, 30.016, 13.641, 29.855, 13.977, 29.668001);
        ((GeneralPath) shape).curveTo(14.074, 29.605001, 14.301001, 29.441002, 14.656, 29.172);
        ((GeneralPath) shape).curveTo(14.871, 29.008001, 15.117001, 28.902, 15.398, 28.855001);
        ((GeneralPath) shape).curveTo(15.637, 28.812002, 15.995999, 28.742, 16.473, 28.652002);
        ((GeneralPath) shape).curveTo(16.890999, 28.582003, 17.23, 28.555002, 17.492, 28.570002);
        ((GeneralPath) shape).lineTo(18.754, 28.645002);
        ((GeneralPath) shape).curveTo(18.395, 28.613003, 18.02, 28.496002, 17.637, 28.297003);
        ((GeneralPath) shape).curveTo(17.23, 28.086002, 16.311998, 28.234003, 14.886999, 28.746002);
        ((GeneralPath) shape).curveTo(14.526999, 28.875002, 14.065999, 29.188002, 13.495999, 29.680002);
        ((GeneralPath) shape).curveTo(13.301, 29.863003, 13.030999, 30.000002, 12.695, 30.086002);
        ((GeneralPath) shape).lineTo(12.245999, 30.156002);
        ((GeneralPath) shape).curveTo(12.249999, 30.258001, 12.457, 30.254002, 12.874999, 30.145002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(19.913000106811523, -6.273900032043457), new Point2D.Double(31.08799934387207, -6.273900032043457), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_71

        // _0_0_3_0_0_0_0_0_0_71_0

        // _0_0_3_0_0_0_0_0_0_71_0_0

        // _0_0_3_0_0_0_0_0_0_71_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.145, 30.004);
        ((GeneralPath) shape).lineTo(18.402, 30.379);
        ((GeneralPath) shape).curveTo(17.633001, 30.796999, 17.156, 30.969, 16.973, 30.890999);
        ((GeneralPath) shape).curveTo(16.609, 30.640999, 16.324, 30.477, 16.121, 30.401999);
        ((GeneralPath) shape).curveTo(15.117001, 30.144999, 14.582001, 30.015999, 14.523001, 30.015999);
        ((GeneralPath) shape).curveTo(14.223001, 29.984, 13.891001, 29.909998, 13.527, 29.796999);
        ((GeneralPath) shape).curveTo(13.086, 29.647999, 12.801001, 29.495998, 12.68, 29.335999);
        ((GeneralPath) shape).curveTo(12.574, 29.199, 12.352, 29.054998, 12.008, 28.901999);
        ((GeneralPath) shape).curveTo(11.543, 28.734, 11.281, 28.628998, 11.223001, 28.589998);
        ((GeneralPath) shape).lineTo(10.43, 28.155998);
        ((GeneralPath) shape).lineTo(10.1640005, 28.343998);
        ((GeneralPath) shape).lineTo(10.9800005, 28.624998);
        ((GeneralPath) shape).curveTo(11.566001, 28.851997, 12.012, 29.081999, 12.316, 29.315998);
        ((GeneralPath) shape).curveTo(12.949, 29.780998, 13.773, 30.093998, 14.801, 30.249998);
        ((GeneralPath) shape).curveTo(15.219, 30.319998, 15.625, 30.440998, 16.008, 30.612999);
        ((GeneralPath) shape).curveTo(16.210999, 30.706999, 16.473, 30.844, 16.796999, 31.015999);
        ((GeneralPath) shape).curveTo(17.16, 31.206999, 17.785, 31.015999, 18.675999, 30.433998);
        ((GeneralPath) shape).lineTo(19.296999, 30.120998);
        ((GeneralPath) shape).lineTo(19.144999, 30.003998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(16.5, -5.634300231933594), new Point2D.Double(31.625, -5.634300231933594), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_72

        // _0_0_3_0_0_0_0_0_0_72_0

        // _0_0_3_0_0_0_0_0_0_72_0_0

        // _0_0_3_0_0_0_0_0_0_72_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.68, 29.336);
        ((GeneralPath) shape).curveTo(12.816, 29.312, 13.398001, 29.391, 14.422, 29.566);
        ((GeneralPath) shape).curveTo(14.727, 29.641, 15.074, 29.652, 15.477, 29.605);
        ((GeneralPath) shape).curveTo(15.875, 29.574, 16.203001, 29.5, 16.461, 29.371);
        ((GeneralPath) shape).curveTo(16.895, 29.184, 17.344, 29.121, 17.805, 29.191);
        ((GeneralPath) shape).lineTo(18.469, 29.27);
        ((GeneralPath) shape).curveTo(18.285, 29.152, 18.035, 29.059, 17.711, 28.984001);
        ((GeneralPath) shape).curveTo(17.512001, 28.93, 17.23, 28.965002, 16.875, 29.094002);
        ((GeneralPath) shape).curveTo(16.812, 29.113, 16.508, 29.230001, 15.949, 29.445002);
        ((GeneralPath) shape).curveTo(15.734, 29.527002, 15.324, 29.527002, 14.723001, 29.441002);
        ((GeneralPath) shape).curveTo(13.859, 29.320002, 13.297001, 29.254002, 13.035001, 29.238003);
        ((GeneralPath) shape).curveTo(12.555001, 29.230003, 12.168001, 29.277002, 11.867001, 29.387003);
        ((GeneralPath) shape).curveTo(11.633, 29.512003, 11.453001, 29.594004, 11.336, 29.637003);
        ((GeneralPath) shape).lineTo(11.938001, 29.684004);
        ((GeneralPath) shape).lineTo(12.68, 29.336004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(18.424999237060547, -6.083499908447266), new Point2D.Double(30.274999618530273, -6.083499908447266), new float[]{0, 0.9922f, 1}, new Color[]{new Color(0xED4A26), new Color(0xB84C1D), new Color(0xB84C1D)}, NO_CYCLE, SRGB, new AffineTransform(0.59984f, -0.01344f, 0.01344f, 0.59984f, 0.37393f, 33.304f)));
        g.fill(shape);

        // _0_0_3_0_0_0_0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.41, 27.926);
        ((GeneralPath) shape).lineTo(28.281, 27.906);
        ((GeneralPath) shape).curveTo(28.316, 27.785, 28.332, 27.625, 28.328001, 27.426);
        ((GeneralPath) shape).curveTo(28.297, 25.969, 26.898, 24.758001, 24.137001, 23.801);
        ((GeneralPath) shape).curveTo(21.375, 22.84, 18.055, 22.406, 14.176001, 22.492);
        ((GeneralPath) shape).curveTo(10.297001, 22.578001, 7.0000005, 23.164001, 4.281, 24.246);
        ((GeneralPath) shape).curveTo(1.5660002, 25.324, 0.22300005, 26.598, 0.25800037, 28.055);
        ((GeneralPath) shape).lineTo(0.32800037, 28.535);
        ((GeneralPath) shape).lineTo(1.3480003, 28.512);
        ((GeneralPath) shape).lineTo(1.3400003, 28.241999);
        ((GeneralPath) shape).curveTo(1.3120003, 26.940998, 2.5590003, 25.811998, 5.0740004, 24.855);
        ((GeneralPath) shape).curveTo(7.5940003, 23.879, 10.652, 23.352, 14.254001, 23.27);
        ((GeneralPath) shape).curveTo(17.871, 23.191, 20.961, 23.582, 23.52, 24.441);
        ((GeneralPath) shape).curveTo(26.082, 25.285, 27.375, 26.355, 27.402, 27.656);
        ((GeneralPath) shape).lineTo(27.41, 27.926);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_3_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -0.78486f));

        // _0_0_3_0_0_1

        // _0_0_3_0_0_1_0

        // _0_0_3_0_0_1_0_0

        // _0_0_3_0_0_1_0_0_0

        // _0_0_3_0_0_1_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.594, 19.105);
        ((GeneralPath) shape).curveTo(14.684, 19.121, 14.922, 19.156, 15.301, 19.211);
        ((GeneralPath) shape).curveTo(15.688, 19.266, 16.078, 19.363, 16.48, 19.516);
        ((GeneralPath) shape).curveTo(16.875, 19.66, 17.379, 19.641, 17.991999, 19.449001);
        ((GeneralPath) shape).curveTo(18.605, 19.266, 19.905998, 19.602001, 21.901999, 20.457);
        ((GeneralPath) shape).curveTo(23.897999, 21.312, 24.112999, 20.961, 22.538998, 19.41);
        ((GeneralPath) shape).curveTo(20.960999, 17.855, 17.784998, 17.254, 13.015998, 17.612999);
        ((GeneralPath) shape).curveTo(8.241998, 17.969, 5.6639977, 18.964998, 5.2809978, 20.589998);
        ((GeneralPath) shape).curveTo(5.534998, 20.905998, 6.0779977, 20.890999, 6.9139977, 20.538998);
        ((GeneralPath) shape).curveTo(7.753998, 20.187998, 8.362998, 20.003998, 8.745997, 19.987997);
        ((GeneralPath) shape).curveTo(9.124997, 19.976997, 9.569998, 19.835997, 10.0739975, 19.569998);
        ((GeneralPath) shape).curveTo(10.581998, 19.300999, 11.065997, 19.245998, 11.522998, 19.401999);
        ((GeneralPath) shape).curveTo(11.979998, 19.558998, 12.456998, 19.554998, 12.964998, 19.383);
        ((GeneralPath) shape).curveTo(13.476998, 19.210999, 13.854999, 19.116999, 14.097999, 19.102);
        ((GeneralPath) shape).curveTo(14.339998, 19.09, 14.503999, 19.094, 14.593999, 19.105);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFB666666, true));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_3_0_0_1

        // _0_0_4

        // _0_0_4_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.773, 16.0);
        ((GeneralPath) shape).curveTo(22.637001, 15.68, 22.438002, 15.465, 22.176, 15.36);
        ((GeneralPath) shape).curveTo(21.668001, 15.226999, 21.441, 15.387, 21.492, 15.839999);
        ((GeneralPath) shape).curveTo(21.574001, 16.293, 21.613, 16.585999, 21.613, 16.719);
        ((GeneralPath) shape).curveTo(21.641, 16.852, 21.574001, 17.055, 21.414001, 17.321);
        ((GeneralPath) shape).curveTo(21.254002, 17.613998, 21.066002, 17.773998, 20.855001, 17.800999);
        ((GeneralPath) shape).curveTo(20.613, 17.824999, 20.492, 17.946, 20.492, 18.159998);
        ((GeneralPath) shape).curveTo(20.492, 18.390999, 20.582, 18.523998, 20.754, 18.558998);
        ((GeneralPath) shape).curveTo(20.742, 18.550999, 20.734, 18.538998, 20.734, 18.519999);
        ((GeneralPath) shape).curveTo(20.734, 18.491999, 20.934, 18.374998, 21.331999, 18.159998);
        ((GeneralPath) shape).curveTo(21.734, 17.999998, 21.973, 17.734999, 22.054998, 17.359999);
        ((GeneralPath) shape).lineTo(22.054998, 16.480999);
        ((GeneralPath) shape).curveTo(22.054998, 15.917999, 22.159998, 15.667999, 22.370998, 15.718999);
        ((GeneralPath) shape).curveTo(22.558998, 15.718999, 22.690998, 15.812999, 22.772999, 15.999999);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4.6950016, 22.0);
        ((GeneralPath) shape).curveTo(4.719002, 21.84, 4.7730017, 21.641, 4.8550014, 21.399);
        ((GeneralPath) shape).curveTo(4.9880013, 20.918, 5.2420015, 20.68, 5.6130013, 20.68);
        ((GeneralPath) shape).curveTo(5.695001, 20.68, 5.734001, 20.746, 5.734001, 20.879);
        ((GeneralPath) shape).curveTo(5.734001, 21.039, 5.695001, 21.239, 5.6130013, 21.480999);
        ((GeneralPath) shape).curveTo(5.5350013, 21.745998, 5.4800014, 21.946, 5.4530015, 22.078);
        ((GeneralPath) shape).curveTo(5.4530015, 22.210999, 5.3980017, 22.425999, 5.2930017, 22.719);
        ((GeneralPath) shape).curveTo(5.2150016, 22.957, 5.1760015, 23.16, 5.1760015, 23.321);
        ((GeneralPath) shape).curveTo(5.1760015, 23.480999, 5.2810016, 23.745998, 5.4920015, 24.116999);
        ((GeneralPath) shape).curveTo(5.7340016, 24.519999, 5.8550014, 24.745998, 5.8550014, 24.800999);
        ((GeneralPath) shape).curveTo(5.9880013, 24.773998, 6.0940013, 24.706999, 6.1760015, 24.598);
        ((GeneralPath) shape).curveTo(6.3090014, 24.465, 6.3750014, 24.305, 6.3750014, 24.116999);
        ((GeneralPath) shape).curveTo(6.3750014, 23.933998, 6.2810016, 23.784998, 6.0940013, 23.679998);
        ((GeneralPath) shape).curveTo(5.906001, 23.574999, 5.812001, 23.491999, 5.812001, 23.437998);
        ((GeneralPath) shape).curveTo(5.812001, 23.359999, 5.8950014, 23.050999, 6.0550013, 22.519999);
        ((GeneralPath) shape).curveTo(6.215001, 22.012, 6.293001, 21.652998, 6.293001, 21.437998);
        ((GeneralPath) shape).curveTo(6.293001, 21.171997, 6.281001, 20.984999, 6.254001, 20.878998);
        ((GeneralPath) shape).curveTo(6.148001, 20.585999, 5.9490013, 20.437998, 5.6520014, 20.437998);
        ((GeneralPath) shape).curveTo(5.1990013, 20.437998, 4.8950014, 20.706997, 4.734001, 21.238998);
        ((GeneralPath) shape).curveTo(4.707001, 21.640999, 4.695001, 21.890999, 4.695001, 21.999998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(1.7730017, 13.559);
        ((GeneralPath) shape).curveTo(1.9060017, 13.239, 2.2150016, 13.039, 2.6950016, 12.957);
        ((GeneralPath) shape).curveTo(2.9880016, 12.907, 3.1760015, 12.985, 3.2540016, 13.2);
        ((GeneralPath) shape).curveTo(3.3050017, 13.441999, 3.3480017, 13.348, 3.3750017, 12.918);
        ((GeneralPath) shape).curveTo(3.3750017, 12.52, 3.3980017, 12.133, 3.4530017, 11.758);
        ((GeneralPath) shape).curveTo(3.5350018, 11.387, 3.6800017, 11.239, 3.8950016, 11.321);
        ((GeneralPath) shape).curveTo(4.0000014, 11.371, 4.094002, 11.52, 4.1760015, 11.758);
        ((GeneralPath) shape).curveTo(4.2810016, 12.0, 4.4140015, 12.106, 4.5740013, 12.078);
        ((GeneralPath) shape).curveTo(4.7620015, 12.078, 4.8550014, 12.0390005, 4.8550014, 11.957);
        ((GeneralPath) shape).curveTo(4.8790016, 11.879, 5.0940013, 11.774, 5.4920015, 11.641);
        ((GeneralPath) shape).curveTo(5.5470014, 11.641, 5.6130013, 11.679999, 5.6950016, 11.757999);
        ((GeneralPath) shape).curveTo(5.7460017, 11.757999, 5.8550014, 11.5859995, 6.0160017, 11.238999);
        ((GeneralPath) shape).curveTo(6.1760015, 10.973, 6.3870015, 10.933999, 6.652002, 11.120999);
        ((GeneralPath) shape).curveTo(6.762002, 11.226999, 6.906002, 11.348, 7.094002, 11.480999);
        ((GeneralPath) shape).curveTo(7.199002, 11.585999, 7.2660017, 11.718999, 7.2930017, 11.878999);
        ((GeneralPath) shape).curveTo(7.4530015, 11.667998, 7.508002, 11.4419985, 7.4530015, 11.199999);
        ((GeneralPath) shape).curveTo(7.3750014, 10.773999, 7.1760015, 10.425999, 6.8550014, 10.159999);
        ((GeneralPath) shape).curveTo(6.5080013, 9.972999, 6.2660017, 9.972999, 6.1330013, 10.159999);
        ((GeneralPath) shape).curveTo(5.9730015, 10.398999, 5.812001, 10.624999, 5.6520014, 10.839999);
        ((GeneralPath) shape).curveTo(5.4690013, 10.999999, 5.1880016, 11.159999, 4.812001, 11.320999);
        ((GeneralPath) shape).curveTo(4.4410014, 11.425999, 4.266001, 11.238999, 4.293001, 10.757999);
        ((GeneralPath) shape).curveTo(4.320001, 10.308999, 4.1330013, 10.105999, 3.7340012, 10.16);
        ((GeneralPath) shape).curveTo(3.3320012, 10.215, 3.0820012, 10.535, 2.9730012, 11.121);
        ((GeneralPath) shape).curveTo(3.0000012, 11.707001, 2.9880013, 12.067, 2.9340012, 12.200001);
        ((GeneralPath) shape).curveTo(2.215001, 12.973001, 1.8400012, 13.375001, 1.8120012, 13.403001);
        ((GeneralPath) shape).curveTo(1.7890012, 13.453001, 1.7730012, 13.504001, 1.7730012, 13.559001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x644922));
        g.fill(shape);

        // _0_0_4_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.492, 18.321);
        ((GeneralPath) shape).curveTo(22.652, 18.184, 22.773, 18.023998, 22.855001, 17.839998);
        ((GeneralPath) shape).curveTo(22.934002, 17.624998, 22.973001, 17.277998, 22.973001, 16.800999);
        ((GeneralPath) shape).curveTo(22.973001, 16.398998, 22.906002, 16.144999, 22.773, 16.039);
        ((GeneralPath) shape).lineTo(22.773, 16.0);
        ((GeneralPath) shape).curveTo(22.691, 15.813, 22.559, 15.719, 22.371, 15.719);
        ((GeneralPath) shape).curveTo(22.16, 15.668, 22.055, 15.918, 22.055, 16.480999);
        ((GeneralPath) shape).lineTo(22.055, 17.359999);
        ((GeneralPath) shape).curveTo(21.973, 17.734999, 21.734001, 17.999998, 21.332, 18.159998);
        ((GeneralPath) shape).curveTo(20.934, 18.370998, 20.734001, 18.491999, 20.734001, 18.519999);
        ((GeneralPath) shape).curveTo(20.734001, 18.538998, 20.742, 18.550999, 20.754002, 18.558998);
        ((GeneralPath) shape).lineTo(20.773, 18.558998);
        ((GeneralPath) shape).curveTo(20.828001, 18.613998, 20.906, 18.640999, 21.016, 18.640999);
        ((GeneralPath) shape).curveTo(20.961, 18.613998, 20.934, 18.574999, 20.934, 18.519999);
        ((GeneralPath) shape).curveTo(20.934, 18.437998, 21.066, 18.347998, 21.332, 18.238998);
        ((GeneralPath) shape).curveTo(21.625, 18.132998, 21.867, 18.050999, 22.055, 17.999998);
        ((GeneralPath) shape).curveTo(22.238, 17.972998, 22.348, 17.999998, 22.371, 18.077997);
        ((GeneralPath) shape).curveTo(22.402, 18.210997, 22.441, 18.292997, 22.492, 18.320997);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(22.254, 16.039);
        ((GeneralPath) shape).curveTo(22.281, 15.985, 22.32, 15.957, 22.371, 15.957);
        ((GeneralPath) shape).curveTo(22.48, 15.957, 22.547, 16.012, 22.574, 16.117);
        ((GeneralPath) shape).lineTo(22.574, 16.16);
        ((GeneralPath) shape).curveTo(22.574, 16.293, 22.508, 16.36, 22.371, 16.36);
        ((GeneralPath) shape).lineTo(22.254, 16.321001);
        ((GeneralPath) shape).lineTo(22.254, 16.039001);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.8549995, 24.800999);
        ((GeneralPath) shape).curveTo(5.8549995, 24.745998, 5.7339997, 24.519999, 5.4919996, 24.116999);
        ((GeneralPath) shape).curveTo(5.2809997, 23.745998, 5.1759996, 23.480999, 5.1759996, 23.321);
        ((GeneralPath) shape).curveTo(5.1759996, 23.16, 5.2149997, 22.956999, 5.2929997, 22.719);
        ((GeneralPath) shape).curveTo(5.398, 22.426, 5.4529996, 22.211, 5.4529996, 22.078);
        ((GeneralPath) shape).curveTo(5.4799995, 21.946, 5.5349994, 21.745998, 5.6129994, 21.480999);
        ((GeneralPath) shape).curveTo(5.694999, 21.238998, 5.7339993, 21.039, 5.7339993, 20.879);
        ((GeneralPath) shape).curveTo(5.7339993, 20.746, 5.694999, 20.68, 5.6129994, 20.68);
        ((GeneralPath) shape).curveTo(5.2419996, 20.68, 4.9879994, 20.918001, 4.8549995, 21.399);
        ((GeneralPath) shape).curveTo(4.773, 21.641, 4.7189994, 21.84, 4.6949997, 22.0);
        ((GeneralPath) shape).curveTo(4.641, 22.16, 4.574, 22.278, 4.4919996, 22.36);
        ((GeneralPath) shape).curveTo(4.2809997, 22.653, 4.1329994, 22.918001, 4.055, 23.16);
        ((GeneralPath) shape).curveTo(4.027, 23.371, 4.016, 23.641, 4.016, 23.957);
        ((GeneralPath) shape).curveTo(4.016, 24.278, 4.027, 24.481, 4.055, 24.559);
        ((GeneralPath) shape).curveTo(4.2419996, 24.825, 4.652, 24.957, 5.2929997, 24.957);
        ((GeneralPath) shape).curveTo(5.613, 24.957, 5.8009996, 24.907001, 5.8549995, 24.801);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.2929997, 24.078);
        ((GeneralPath) shape).curveTo(5.3749995, 24.16, 5.4139996, 24.238998, 5.4139996, 24.321);
        ((GeneralPath) shape).curveTo(5.4139996, 24.370998, 5.3589997, 24.453, 5.2539997, 24.559);
        ((GeneralPath) shape).curveTo(5.121, 24.692, 4.949, 24.758, 4.7339997, 24.758);
        ((GeneralPath) shape).curveTo(4.4139996, 24.758, 4.2539997, 24.614, 4.2539997, 24.321);
        ((GeneralPath) shape).curveTo(4.2539997, 24.238998, 4.2929997, 24.16, 4.3749995, 24.078);
        ((GeneralPath) shape).curveTo(4.4529996, 23.973, 4.5859995, 23.918, 4.773, 23.918);
        ((GeneralPath) shape).curveTo(4.961, 23.918, 5.133, 23.973, 5.2929997, 24.078);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(7.2929997, 11.878999);
        ((GeneralPath) shape).curveTo(7.266, 11.718999, 7.199, 11.585999, 7.094, 11.480999);
        ((GeneralPath) shape).curveTo(6.9059997, 11.343999, 6.762, 11.226999, 6.652, 11.116999);
        ((GeneralPath) shape).curveTo(6.387, 10.933999, 6.176, 10.972999, 6.016, 11.238998);
        ((GeneralPath) shape).curveTo(5.855, 11.585999, 5.746, 11.757998, 5.6949997, 11.757998);
        ((GeneralPath) shape).curveTo(5.613, 11.679998, 5.547, 11.640999, 5.4919996, 11.640999);
        ((GeneralPath) shape).curveTo(5.094, 11.773999, 4.8789997, 11.878999, 4.8549995, 11.956999);
        ((GeneralPath) shape).curveTo(4.8549995, 12.038999, 4.7619996, 12.077999, 4.5739994, 12.077999);
        ((GeneralPath) shape).curveTo(4.4139996, 12.105999, 4.280999, 11.999999, 4.1759996, 11.757999);
        ((GeneralPath) shape).curveTo(4.094, 11.5199995, 3.9999995, 11.370999, 3.8949997, 11.316999);
        ((GeneralPath) shape).curveTo(3.6799998, 11.238999, 3.5349998, 11.386999, 3.4529998, 11.757999);
        ((GeneralPath) shape).curveTo(3.3979998, 12.132999, 3.3749998, 12.5199995, 3.3749998, 12.917999);
        ((GeneralPath) shape).curveTo(3.3479998, 13.343999, 3.3089998, 13.438, 3.2539997, 13.199999);
        ((GeneralPath) shape).curveTo(3.1759996, 12.984999, 2.9879997, 12.906999, 2.6949997, 12.956999);
        ((GeneralPath) shape).curveTo(2.2149997, 13.038999, 1.9059997, 13.238998, 1.7729998, 13.558999);
        ((GeneralPath) shape).lineTo(1.7339997, 13.597999);
        ((GeneralPath) shape).lineTo(1.7339997, 13.640999);
        ((GeneralPath) shape).curveTo(1.6519997, 13.824999, 1.6409997, 14.050999, 1.6949997, 14.320999);
        ((GeneralPath) shape).curveTo(1.7729996, 14.907, 1.9489996, 15.187999, 2.2149997, 15.159999);
        ((GeneralPath) shape).curveTo(2.3199997, 15.132998, 2.4799995, 15.0669985, 2.6949997, 14.956999);
        ((GeneralPath) shape).curveTo(2.3479996, 15.093999, 2.1479998, 14.972999, 2.0939996, 14.597999);
        ((GeneralPath) shape).curveTo(2.0389996, 14.331999, 2.1989996, 14.077999, 2.5739996, 13.839998);
        ((GeneralPath) shape).curveTo(2.7889996, 13.757998, 3.2419996, 13.558998, 3.9339995, 13.238998);
        ((GeneralPath) shape).curveTo(4.0659995, 13.156999, 4.2149997, 13.023998, 4.3749995, 12.839998);
        ((GeneralPath) shape).curveTo(4.5349994, 12.652998, 4.6519995, 12.531999, 4.7339997, 12.480998);
        ((GeneralPath) shape).curveTo(5.883, 12.077998, 6.535, 11.878998, 6.6949997, 11.878998);
        ((GeneralPath) shape).curveTo(6.9059997, 11.824998, 7.0269995, 11.933998, 7.055, 12.199998);
        ((GeneralPath) shape).lineTo(7.055, 12.277998);
        ((GeneralPath) shape).curveTo(7.2419996, 12.093998, 7.3199997, 11.956998, 7.2929997, 11.878998);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.2539997, 21.321);
        ((GeneralPath) shape).curveTo(5.121, 21.265999, 5.055, 21.199999, 5.055, 21.116999);
        ((GeneralPath) shape).curveTo(5.055, 21.067, 5.121, 21.012, 5.2539997, 20.956999);
        ((GeneralPath) shape).curveTo(5.3589997, 21.067, 5.4139996, 21.133, 5.4139996, 21.159998);
        ((GeneralPath) shape).curveTo(5.4139996, 21.292997, 5.3589997, 21.343998, 5.2539997, 21.320997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x906A32));
        g.fill(shape);

        // _0_0_4_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.016, 18.641);
        ((GeneralPath) shape).curveTo(21.121, 18.692001, 21.281, 18.719, 21.492, 18.719);
        ((GeneralPath) shape).curveTo(21.602001, 18.719, 21.734001, 18.68, 21.895, 18.598);
        ((GeneralPath) shape).curveTo(22.082, 18.574999, 22.215, 18.559, 22.293001, 18.559);
        ((GeneralPath) shape).curveTo(22.375002, 18.559, 22.441002, 18.481, 22.492, 18.321);
        ((GeneralPath) shape).curveTo(22.441, 18.293, 22.402, 18.210999, 22.375, 18.078);
        ((GeneralPath) shape).curveTo(22.348, 18.0, 22.242, 17.973, 22.055, 18.0);
        ((GeneralPath) shape).curveTo(21.867, 18.051, 21.629, 18.133, 21.336, 18.239);
        ((GeneralPath) shape).curveTo(21.066, 18.344, 20.934, 18.438, 20.934, 18.52);
        ((GeneralPath) shape).curveTo(20.934, 18.575, 20.961, 18.614, 21.016, 18.641);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(22.254002, 16.039001);
        ((GeneralPath) shape).lineTo(22.254002, 16.321001);
        ((GeneralPath) shape).lineTo(22.371002, 16.36);
        ((GeneralPath) shape).curveTo(22.508001, 16.36, 22.574001, 16.293001, 22.574001, 16.16);
        ((GeneralPath) shape).lineTo(22.574001, 16.117);
        ((GeneralPath) shape).curveTo(22.547, 16.012001, 22.480001, 15.957001, 22.371002, 15.957001);
        ((GeneralPath) shape).curveTo(22.320002, 15.957001, 22.281002, 15.985001, 22.254002, 16.039001);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.293001, 24.078001);
        ((GeneralPath) shape).curveTo(5.1330013, 23.973001, 4.9610014, 23.918001, 4.773001, 23.918001);
        ((GeneralPath) shape).curveTo(4.5860014, 23.918001, 4.453001, 23.973001, 4.375001, 24.078001);
        ((GeneralPath) shape).curveTo(4.293001, 24.160002, 4.254001, 24.239, 4.254001, 24.321001);
        ((GeneralPath) shape).curveTo(4.254001, 24.614, 4.414001, 24.758001, 4.734001, 24.758001);
        ((GeneralPath) shape).curveTo(4.9490013, 24.758001, 5.1210012, 24.692001, 5.254001, 24.559002);
        ((GeneralPath) shape).curveTo(5.359001, 24.453001, 5.414001, 24.371002, 5.414001, 24.321001);
        ((GeneralPath) shape).curveTo(5.414001, 24.239, 5.375001, 24.160002, 5.293001, 24.078001);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(7.0550013, 12.278001);
        ((GeneralPath) shape).lineTo(7.0550013, 12.200001);
        ((GeneralPath) shape).curveTo(7.0270014, 11.934001, 6.906001, 11.825001, 6.695001, 11.879001);
        ((GeneralPath) shape).curveTo(6.5350013, 11.879001, 5.879001, 12.078001, 4.734001, 12.481001);
        ((GeneralPath) shape).curveTo(4.6520014, 12.532001, 4.5350013, 12.653001, 4.375001, 12.840001);
        ((GeneralPath) shape).curveTo(4.215001, 13.024001, 4.066001, 13.1570015, 3.934001, 13.239001);
        ((GeneralPath) shape).curveTo(3.242001, 13.559001, 2.789001, 13.758001, 2.5740008, 13.840001);
        ((GeneralPath) shape).curveTo(2.1990008, 14.078001, 2.0390007, 14.332001, 2.0940008, 14.5980015);
        ((GeneralPath) shape).curveTo(2.1480007, 14.9730015, 2.3480008, 15.090001, 2.695001, 14.957002);
        ((GeneralPath) shape).curveTo(2.773001, 14.957002, 2.8280008, 14.9070015, 2.855001, 14.801002);
        ((GeneralPath) shape).curveTo(2.879001, 14.719002, 3.066001, 14.438002, 3.414001, 13.957002);
        ((GeneralPath) shape).curveTo(3.734001, 13.5320015, 4.453001, 13.172002, 5.5740013, 12.879002);
        ((GeneralPath) shape).curveTo(6.668001, 12.586001, 7.1600013, 12.387002, 7.0550013, 12.278002);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(5.254001, 21.321001);
        ((GeneralPath) shape).curveTo(5.359001, 21.348001, 5.414001, 21.293001, 5.414001, 21.160002);
        ((GeneralPath) shape).curveTo(5.414001, 21.133001, 5.359001, 21.067001, 5.254001, 20.957003);
        ((GeneralPath) shape).curveTo(5.1210012, 21.012003, 5.0550013, 21.067003, 5.0550013, 21.117002);
        ((GeneralPath) shape).curveTo(5.0550013, 21.200003, 5.1210012, 21.266003, 5.254001, 21.321003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB5964A));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

