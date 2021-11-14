package com.pump.awt.geom.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import static java.awt.Color.BLACK;
import static java.awt.Color.WHITE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/302705/cat-5
 * </p>
 */
public class Cat5 implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public Cat5() {
        this(1283, 1848);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Cat5(int width, int height) {
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
        double coef = Math.min((double) width / (double) 1283, (double) height / (double) 1848);

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
        g.transform(new AffineTransform(1.066672f, 0, 0, 1.066672f, 0, 0.004622419f));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1829.9f, 862.17f));

        // _0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, -2726.4f, 1073.1f));

        // _0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1460.6f, 1149.7f));

        // _0_0_0_0

        // _0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.165, 0.107, -0.33, 0.214, -0.495, 0.322);
        ((GeneralPath) shape).curveTo(-0.465, 0.286, -0.44300002, 0.241, -0.41, 0.20899999);
        ((GeneralPath) shape).curveTo(-0.304, 0.10799999, -0.139, 0.06799999, 0.0, -1.4901161E-8);

        g.setPaint(BLACK);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1451.7f, 1155.2f));

        // _0_0_0_1

        // _0_0_0_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.02, 0.067, -0.052, 0.12, -0.069, 0.19);
        ((GeneralPath) shape).lineTo(-0.18, 0.074999996);
        ((GeneralPath) shape).curveTo(-0.120000005, 0.049999997, -0.06000001, 0.023999996, 0.0, -7.4505806E-9);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1456.1f, 1151.8f));

        // _0_0_0_2

        // _0_0_0_2_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.079, 0.042, -0.162, 0.078, -0.243, 0.118);
        ((GeneralPath) shape).curveTo(-0.211, 0.031000003, -0.15200001, -0.022, -0.125, -0.11399999);
        ((GeneralPath) shape).curveTo(-0.12, -0.10999999, 0.0, 7.4505806E-9, 0.0, 7.4505806E-9);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_2
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1451.7f, 1155.4f));

        // _0_0_0_3

        // _0_0_0_3_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.129, -0.007, -0.254, -0.003, -0.382, -0.008);
        ((GeneralPath) shape).lineTo(-0.11500001, -0.119);
        ((GeneralPath) shape).curveTo(-0.11100001, -0.115, -7.4505806E-9, 0.0, -7.4505806E-9, 0.0);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_3
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1448.1f, 1156.9f));

        // _0_0_0_4

        // _0_0_0_4_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).lineTo(-0.103, -0.116);
        ((GeneralPath) shape).curveTo(-0.012000002, -0.154, 0.078999996, -0.192, 0.17099999, -0.22999999);
        ((GeneralPath) shape).curveTo(0.117999986, -0.14199999, 0.04699999, -0.099999994, -1.4901161E-8, 1.4901161E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_4
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1132.6f, 1119.1f));

        // _0_0_0_5

        // _0_0_0_5_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-3.394, -0.846, -6.787, -1.697, -10.178, -2.553);
        ((GeneralPath) shape).curveTo(-6.7870007, -1.697, -3.3940005, -0.845, 0.0, 0.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_5
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 912.94f, 1351.4f));

        // _0_0_0_6

        // _0_0_0_6_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.29, 0.407, 0.581, 0.813, 0.871, 1.22);
        ((GeneralPath) shape).curveTo(0.581, 0.813, 0.29000002, 0.40600002, 0.0, 0.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_6
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1346, 250.38f));

        // _0_0_0_7

        // _0_0_0_7_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.69, 0.26, 1.351, 0.697, 2.027, 1.041);
        ((GeneralPath) shape).curveTo(2.032, 1.041, 2.036, 1.042, 2.041, 1.042);
        ((GeneralPath) shape).curveTo(1.3579998, 0.69900006, 0.69299984, 0.26100004, 0.0, 0.0);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_7
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1448.1f, 1156.9f));

        // _0_0_0_8

        // _0_0_0_8_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.188, 0.058, -0.375, 0.117, -0.563, 0.175);
        ((GeneralPath) shape).curveTo(-0.40900004, 0.078999996, -0.25700003, -0.020999998, -0.10200003, -0.11600001);
        ((GeneralPath) shape).lineTo(-2.9802322E-8, -1.4901161E-8);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_8
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 796.08f, 915.16f));

        // _0_0_0_9

        // _0_0_0_9_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).lineTo(0.437, 0.002);
        ((GeneralPath) shape).lineTo(0.22700001, 0.491);
        ((GeneralPath) shape).lineTo(1.4901161E-8, 0.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_9
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 781.11f, 1436.4f));

        // _0_0_0_10

        // _0_0_0_10_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(9.421, -1.693, 16.819, -4.212, 24.169, -6.813);
        ((GeneralPath) shape).curveTo(34.905, -10.614, 45.595, -14.551001, 56.236, -18.609);
        ((GeneralPath) shape).curveTo(59.764, -19.955, 63.279, -21.540998, 66.455, -23.560999);
        ((GeneralPath) shape).curveTo(75.842, -29.529999, 85.139, -35.649998, 94.313, -41.942);
        ((GeneralPath) shape).curveTo(102.194, -47.349003, 108.810005, -54.185, 115.146, -61.306);
        ((GeneralPath) shape).curveTo(117.623, -64.09, 118.887, -67.149, 118.944, -70.875);
        ((GeneralPath) shape).curveTo(119.031, -76.575, 119.169, -82.283, 119.574, -87.966995);
        ((GeneralPath) shape).curveTo(120.440994, -100.144, 121.492, -112.30699, 122.471, -124.476);
        ((GeneralPath) shape).curveTo(122.514, -125.017, 122.636, -125.555, 122.643, -126.095);
        ((GeneralPath) shape).curveTo(122.81, -140.468, 122.766, -154.83301, 121.542, -169.182);
        ((GeneralPath) shape).curveTo(119.43, -169.313, 119.302, -167.707, 118.791, -166.67801);
        ((GeneralPath) shape).curveTo(110.594, -150.15001, 102.732, -133.45001, 94.223, -117.08501);
        ((GeneralPath) shape).curveTo(79.385, -88.545006, 61.436, -62.081005, 39.935, -38.088005);
        ((GeneralPath) shape).curveTo(29.030003, -25.913006, 16.833002, -15.106005, 4.722, -4.208004);
        ((GeneralPath) shape).curveTo(3.5670002, -3.168004, 2.403, -2.138004, -0.0089998245, 0.014996052);

        g.setPaint(new Color(0xCC8564));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_10
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1384, 1473));

        // _0_0_0_11

        // _0_0_0_11_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(2.267, 2.194, 4.535, 4.389, 7.234, 7.001);
        ((GeneralPath) shape).curveTo(6.1050005, 7.6, 5.287, 8.368, 4.406, 8.448999);
        ((GeneralPath) shape).curveTo(-2.0759997, 9.047999, -8.571, 9.504, -15.060999, 10.016999);
        ((GeneralPath) shape).curveTo(-17.200998, 10.185999, -19.336998, 10.393, -21.918, 10.622);
        ((GeneralPath) shape).curveTo(-21.781, 16.087, -20.977999, 20.967999, -17.224998, 24.911);
        ((GeneralPath) shape).curveTo(-12.352999, 30.030998, -7.3449984, 35.012, -1.2089977, 38.659);
        ((GeneralPath) shape).curveTo(8.821002, 44.621002, 19.061003, 50.259003, 28.837002, 56.611);
        ((GeneralPath) shape).curveTo(35.074, 60.664, 41.746002, 63.506, 48.621002, 65.995);
        ((GeneralPath) shape).curveTo(52.127003, 67.264, 55.733, 68.706, 59.642002, 67.986);
        ((GeneralPath) shape).curveTo(59.708004, 67.368004, 59.989002, 66.717, 59.778004, 66.435);
        ((GeneralPath) shape).curveTo(49.625004, 52.894997, 43.986004, 37.427, 40.743004, 21.036999);
        ((GeneralPath) shape).curveTo(37.322002, 3.7459984, 33.927002, -13.565002, 31.198004, -30.974003);
        ((GeneralPath) shape).curveTo(29.351004, -42.750004, 28.651005, -54.708, 27.483004, -66.589005);
        ((GeneralPath) shape).curveTo(25.437004, -87.401, 24.222004, -108.257, 24.281004, -129.17801);
        ((GeneralPath) shape).curveTo(24.283005, -129.64601, 23.978004, -130.11401, 23.800003, -130.62701);
        ((GeneralPath) shape).curveTo(22.206003, -130.14801, 22.109003, -128.61902, 21.745003, -127.443016);
        ((GeneralPath) shape).curveTo(17.170002, -112.66102, 13.272003, -97.75601, 11.287003, -82.32902);
        ((GeneralPath) shape).curveTo(10.382003, -75.28702, 10.118003, -68.304016, 9.888002, -61.259018);
        ((GeneralPath) shape).curveTo(9.533003, -50.414017, 8.899002, -39.579018, 8.472002, -28.73602);
        ((GeneralPath) shape).curveTo(8.291002, -24.126019, 8.353002, -19.507019, 8.262002, -14.892019);
        ((GeneralPath) shape).curveTo(8.237002, -13.60302, 8.060002, -12.316019, 7.894002, -10.31502);
        ((GeneralPath) shape).curveTo(6.455002, -10.88702, 5.385002, -11.04002, 4.706002, -11.63802);
        ((GeneralPath) shape).curveTo(3.109002, -13.041019, 1.7010021, -14.65702, -0.652998, -17.08302);
        ((GeneralPath) shape).curveTo(-0.456998, -13.979019, 0.676002, -12.531019, 1.4910021, -10.994019);
        ((GeneralPath) shape).curveTo(2.379002, -9.319018, 3.2980022, -7.6580186, 4.247002, -6.0160184);
        ((GeneralPath) shape).curveTo(5.164002, -4.4310184, 6.137002, -2.8780184, 7.1120024, -1.2670183);
        ((GeneralPath) shape).curveTo(4.734002, 1.1609817, 2.1550026, -0.43601835, -0.06699753, 0.079981685);
        ((GeneralPath) shape).lineTo(2.4735928E-6, -1.8313527E-5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0926E));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_11
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1347.5f, 1485.4f));

        // _0_0_0_12

        // _0_0_0_12_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.981, 1.456, 2.141, 2.957, 3.068, 4.591);
        ((GeneralPath) shape).curveTo(6.879, 11.307, 12.139, 16.74, 18.082, 21.538);
        ((GeneralPath) shape).curveTo(21.243, 24.09, 24.478, 26.589, 27.893002, 28.78);
        ((GeneralPath) shape).curveTo(34.503002, 33.02, 41.314003, 36.945, 47.942, 41.159);
        ((GeneralPath) shape).curveTo(51.256, 43.266, 55.286003, 44.421, 57.562, 47.99);
        ((GeneralPath) shape).curveTo(54.683, 47.632, 51.729, 47.557003, 48.949, 46.823);
        ((GeneralPath) shape).curveTo(34.551003, 43.017002, 20.262001, 38.783, 5.8170013, 35.172);
        ((GeneralPath) shape).curveTo(-12.935999, 30.485, -29.218998, 20.933, -45.03, 10.337002);
        ((GeneralPath) shape).curveTo(-46.009, 9.682002, -46.708, 8.610002, -47.711, 7.5490017);
        ((GeneralPath) shape).curveTo(-37.697, 3.9380016, -9.197998, -0.52399826, 0.0, 1.9073486E-6);
        ((GeneralPath) shape).moveTo(57.656, 48.118004);
        ((GeneralPath) shape).curveTo(57.627, 48.072002, 57.591, 48.036003, 57.561996, 47.990005);
        ((GeneralPath) shape).curveTo(57.621998, 47.998005, 57.682995, 48.002007, 57.743996, 48.010006);
        ((GeneralPath) shape).lineTo(57.655994, 48.118008);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-339.764, -449.982);
        ((GeneralPath) shape).curveTo(-341.894, -448.555, -343.366, -447.49, -344.91202, -446.54498);
        ((GeneralPath) shape).curveTo(-352.37402, -441.985, -359.11002, -436.53497, -365.10703, -430.17297);
        ((GeneralPath) shape).curveTo(-366.59702, -428.593, -368.10703, -427.02798, -369.536, -425.39297);
        ((GeneralPath) shape).curveTo(-370.888, -423.84497, -372.544, -423.15997, -374.574, -423.24997);
        ((GeneralPath) shape).curveTo(-382.71, -423.61096, -390.92102, -423.38397, -398.97, -424.42197);
        ((GeneralPath) shape).curveTo(-422.47202, -427.45496, -445.22, -433.74597, -467.565, -441.52997);
        ((GeneralPath) shape).curveTo(-469.564, -442.22696, -471.446, -443.25998, -472.994, -443.95996);
        ((GeneralPath) shape).curveTo(-477.43, -456.56396, -481.65198, -468.59195, -485.89798, -480.61197);
        ((GeneralPath) shape).curveTo(-489.24097, -490.07397, -492.624, -499.52197, -495.95898, -508.98798);
        ((GeneralPath) shape).curveTo(-496.373, -510.166, -497.15698, -511.485, -495.034, -512.743);
        ((GeneralPath) shape).curveTo(-491.363, -509.91397, -487.555, -506.926, -483.69, -504.01398);
        ((GeneralPath) shape).curveTo(-476.776, -498.80597, -476.03, -498.503, -469.864, -498.408);
        ((GeneralPath) shape).curveTo(-477.272, -505.76898, -484.832, -511.926, -491.746, -521.453);
        ((GeneralPath) shape).curveTo(-480.133, -518.341, -471.086, -512.979, -460.201, -513.792);
        ((GeneralPath) shape).curveTo(-460.789, -515.013, -460.981, -515.855, -461.49197, -516.395);
        ((GeneralPath) shape).curveTo(-464.10297, -519.154, -466.60397, -522.065, -469.498, -524.5);
        ((GeneralPath) shape).curveTo(-478.01797, -531.667, -486.70798, -538.631, -495.322, -545.685);
        ((GeneralPath) shape).curveTo(-496.50998, -546.658, -498.218, -547.31, -497.824, -549.36);
        ((GeneralPath) shape).curveTo(-490.712, -553.399, -485.723, -555.17096, -477.915, -556.372);
        ((GeneralPath) shape).curveTo(-439.565, -511.614, -393.196, -476.858, -339.765, -449.982);
        ((GeneralPath) shape).moveTo(303.71497, -666.562);
        ((GeneralPath) shape).curveTo(302.39096, -663.887, 301.19196, -661.14, 299.70496, -658.559);
        ((GeneralPath) shape).curveTo(297.68396, -655.05005, 295.44196, -651.668, 293.42694, -648.44604);
        ((GeneralPath) shape).curveTo(293.59494, -645.0621, 295.67093, -643.416, 297.91995, -641.762);
        ((GeneralPath) shape).curveTo(299.95895, -640.262, 302.98196, -639.939, 304.25894, -636.831);
        ((GeneralPath) shape).curveTo(297.71295, -632.98, 291.46695, -629.3, 283.93494, -628.497);
        ((GeneralPath) shape).curveTo(281.94495, -628.28503, 279.56195, -628.478, 278.15094, -626.231);
        ((GeneralPath) shape).curveTo(279.93393, -620.958, 283.50894, -617.39905, 287.92093, -614.541);
        ((GeneralPath) shape).curveTo(292.20392, -611.767, 296.50592, -609.021, 302.35593, -605.26404);
        ((GeneralPath) shape).curveTo(297.64893, -604.34406, 294.73093, -603.75903, 291.80792, -603.20306);
        ((GeneralPath) shape).curveTo(279.1769, -600.8011, 266.35593, -600.93604, 253.61093, -600.9111);
        ((GeneralPath) shape).curveTo(233.47693, -600.8711, 213.45694, -602.8841, 193.65393, -606.58307);
        ((GeneralPath) shape).curveTo(163.93094, -612.1351, 138.36794, -625.6221, 117.27993, -647.37305);
        ((GeneralPath) shape).curveTo(105.022934, -660.0151, 95.99293, -674.78906, 88.967926, -690.85803);
        ((GeneralPath) shape).curveTo(82.316925, -706.07, 77.080925, -721.78503, 72.72793, -737.776);
        ((GeneralPath) shape).curveTo(64.941925, -766.372, 59.28793, -795.385, 55.944927, -824.861);
        ((GeneralPath) shape).curveTo(53.583927, -845.689, 52.572926, -866.539, 52.887928, -887.49304);
        ((GeneralPath) shape).curveTo(53.103928, -901.9241, 54.396927, -916.24805, 56.24593, -930.53107);
        ((GeneralPath) shape).curveTo(58.65093, -949.1091, 61.05593, -967.69104, 63.82793, -986.21704);
        ((GeneralPath) shape).curveTo(66.480934, -1003.93805, 69.70293, -1021.57306, 72.49593, -1039.2731);
        ((GeneralPath) shape).curveTo(76.562935, -1065.05, 81.97293, -1090.53, 89.216934, -1115.5991);
        ((GeneralPath) shape).curveTo(90.408936, -1119.7261, 92.15293, -1123.8181, 94.34693, -1127.5071);
        ((GeneralPath) shape).curveTo(101.01093, -1138.711, 108.01593, -1149.7131, 114.90693, -1160.7831);
        ((GeneralPath) shape).curveTo(115.41493, -1161.5991, 115.842926, -1162.7561, 117.38793, -1161.9851);
        ((GeneralPath) shape).curveTo(117.230934, -1161.2432, 117.145935, -1160.4691, 116.90393, -1159.7471);
        ((GeneralPath) shape).curveTo(107.63593, -1132.088, 102.20593, -1103.577, 98.08793, -1074.78);
        ((GeneralPath) shape).curveTo(96.01193, -1060.266, 93.84693, -1045.758, 92.11393, -1031.202);
        ((GeneralPath) shape).curveTo(90.63793, -1018.80005, 89.17693, -1006.353, 88.69593, -993.887);
        ((GeneralPath) shape).curveTo(88.06793, -977.604, 87.87493, -961.26404, 88.49393, -944.986);
        ((GeneralPath) shape).curveTo(89.080925, -929.536, 90.538925, -914.085, 92.372925, -898.72504);
        ((GeneralPath) shape).curveTo(94.50392, -880.88306, 99.36492, -863.598, 104.856926, -846.512);
        ((GeneralPath) shape).curveTo(112.608925, -822.39703, 122.46693, -799.187, 134.73293, -777.007);
        ((GeneralPath) shape).curveTo(144.90092, -758.62305, 158.66393, -743.474, 175.57092, -731.073);
        ((GeneralPath) shape).curveTo(182.01692, -726.345, 189.14592, -723.084, 196.70792, -720.77);
        ((GeneralPath) shape).curveTo(214.69492, -715.266, 231.03392, -718.133, 245.44691, -730.633);
        ((GeneralPath) shape).curveTo(258.2789, -741.761, 269.74393, -753.966, 277.1969, -769.487);
        ((GeneralPath) shape).curveTo(278.0879, -771.344, 279.3949, -773.0, 280.5309, -774.783);
        ((GeneralPath) shape).curveTo(281.35092, -774.158, 282.02292, -773.919, 282.1419, -773.515);
        ((GeneralPath) shape).curveTo(285.1449, -763.372, 288.65692, -753.33704, 290.92792, -743.03);
        ((GeneralPath) shape).curveTo(295.8359, -720.765, 300.03992, -698.34503, 304.6979, -676.023);
        ((GeneralPath) shape).curveTo(305.40692, -672.63, 305.2159, -669.59503, 303.7149, -666.562);
        ((GeneralPath) shape).moveTo(50.9449, -505.742);
        ((GeneralPath) shape).curveTo(12.893902, -476.571, -28.772102, -454.057, -73.9851, -438.11102);
        ((GeneralPath) shape).curveTo(-81.0691, -435.61304, -87.6231, -438.584, -90.2381, -445.53403);
        ((GeneralPath) shape).curveTo(-92.5331, -451.63403, -94.5551, -457.84604, -97.0821, -463.84604);
        ((GeneralPath) shape).curveTo(-99.7151, -470.09604, -102.6741, -476.22104, -105.7471, -482.27005);
        ((GeneralPath) shape).curveTo(-107.8841, -486.47806, -109.8631, -487.23706, -114.3861, -486.00406);
        ((GeneralPath) shape).curveTo(-116.4591, -485.44006, -118.5181, -484.60706, -120.3881, -483.55005);
        ((GeneralPath) shape).curveTo(-129.4271, -478.43805, -137.69211, -472.27905, -144.9071, -464.77905);
        ((GeneralPath) shape).curveTo(-146.4041, -463.22406, -147.7101, -461.48505, -148.9501, -460.01105);
        ((GeneralPath) shape).curveTo(-150.7211, -460.31104, -151.7711, -460.48105, -152.8191, -460.66605);
        ((GeneralPath) shape).curveTo(-164.5811, -462.75006, -176.3011, -465.12805, -188.11711, -466.83505);
        ((GeneralPath) shape).curveTo(-199.24312, -468.44305, -210.34111, -468.28806, -220.91711, -463.47906);
        ((GeneralPath) shape).curveTo(-222.86412, -462.59308, -225.07211, -462.28006, -226.98311, -461.75208);
        ((GeneralPath) shape).curveTo(-235.54012, -465.15707, -236.80711, -465.20407, -247.8831, -464.9691);
        ((GeneralPath) shape).curveTo(-264.2101, -464.62408, -280.4031, -462.7251, -296.5921, -460.8961);
        ((GeneralPath) shape).curveTo(-305.7501, -459.86108, -315.0361, -458.8551, -323.7071, -455.5381);
        ((GeneralPath) shape).curveTo(-328.5841, -453.6721, -332.43408, -454.58008, -336.76608, -456.9181);
        ((GeneralPath) shape).curveTo(-354.7251, -466.61008, -372.0941, -477.2671, -389.04507, -488.5961);
        ((GeneralPath) shape).curveTo(-417.36707, -507.5241, -443.8061, -528.8091, -468.15707, -552.6531);
        ((GeneralPath) shape).curveTo(-469.63406, -554.09906, -471.6761, -555.2521, -471.90707, -558.16907);
        ((GeneralPath) shape).curveTo(-469.79907, -558.76306, -467.81006, -559.5361, -465.74908, -559.8691);
        ((GeneralPath) shape).curveTo(-453.9451, -561.7781, -442.13107, -563.58905, -430.12207, -563.6401);
        ((GeneralPath) shape).curveTo(-422.51108, -563.67206, -414.90207, -563.94507, -407.29208, -564.0641);
        ((GeneralPath) shape).curveTo(-396.7021, -564.2281, -386.10208, -564.6971, -375.52408, -564.40106);
        ((GeneralPath) shape).curveTo(-361.4181, -564.0071, -347.32907, -563.02106, -333.23407, -562.25507);
        ((GeneralPath) shape).curveTo(-319.12506, -561.4891, -305.01907, -560.64905, -290.90808, -559.89905);
        ((GeneralPath) shape).curveTo(-263.7751, -558.45905, -236.64308, -556.9761, -209.50208, -555.6871);
        ((GeneralPath) shape).curveTo(-199.45908, -555.2101, -189.38408, -555.42004, -179.33908, -554.9751);
        ((GeneralPath) shape).curveTo(-162.24008, -554.2191, -145.15308, -553.1891, -128.06108, -552.2831);
        ((GeneralPath) shape).curveTo(-107.17008, -551.1761, -86.28708, -549.8871, -65.385086, -549.04205);
        ((GeneralPath) shape).curveTo(-49.806084, -548.41205, -34.637085, -545.663, -19.668087, -541.55206);
        ((GeneralPath) shape).curveTo(2.3299122, -535.5101, 24.323914, -529.47504, 46.785915, -525.32007);
        ((GeneralPath) shape).curveTo(53.629913, -524.0541, 60.389915, -522.3351, 68.015915, -520.63904);
        ((GeneralPath) shape).curveTo(66.556915, -519.01807, 65.793915, -517.94006, 64.81492, -517.12006);
        ((GeneralPath) shape).curveTo(60.23092, -513.28107, 55.690918, -509.37805, 50.947918, -505.74207);
        ((GeneralPath) shape).moveTo(49.858917, -1255.302);
        ((GeneralPath) shape).curveTo(50.754917, -1255.082, 51.651917, -1254.863, 52.547916, -1254.643);
        ((GeneralPath) shape).curveTo(52.573917, -1254.7899, 52.599915, -1254.9359, 52.626915, -1255.0829);
        ((GeneralPath) shape).curveTo(51.705914, -1255.1569, 50.782913, -1255.2299, 49.858913, -1255.3019);
        ((GeneralPath) shape).moveTo(153.8789, -1245.5139);
        ((GeneralPath) shape).curveTo(152.2489, -1242.3989, 150.24991, -1239.4469, 148.17491, -1236.5989);
        ((GeneralPath) shape).curveTo(142.25491, -1228.4729, 136.30292, -1220.3668, 130.19391, -1212.3829);
        ((GeneralPath) shape).curveTo(113.61691, -1190.72, 95.20691, -1170.7579, 74.04191, -1153.4979);
        ((GeneralPath) shape).curveTo(61.62091, -1143.3689, 48.91391, -1133.575, 36.08891, -1123.9569);
        ((GeneralPath) shape).curveTo(18.697908, -1110.914, 0.6999092, -1098.6539, -16.355091, -1085.195);
        ((GeneralPath) shape).curveTo(-35.33709, -1070.216, -53.55609, -1054.271, -72.10009, -1038.7379);
        ((GeneralPath) shape).curveTo(-90.01909, -1023.7269, -107.999084, -1008.7869, -125.82409, -993.6649);
        ((GeneralPath) shape).curveTo(-143.77708, -978.4329, -159.23509, -960.9629, -171.40509, -940.7659);
        ((GeneralPath) shape).curveTo(-177.56909, -930.5349, -183.1641, -919.96094, -188.9621, -909.51294);
        ((GeneralPath) shape).curveTo(-193.0461, -902.15393, -197.01309, -894.73193, -201.1001, -887.37494);
        ((GeneralPath) shape).curveTo(-201.7101, -886.2769, -202.3331, -884.8779, -204.5101, -885.31195);
        ((GeneralPath) shape).curveTo(-205.5161, -887.5449, -206.7421, -889.954, -207.7081, -892.4639);
        ((GeneralPath) shape).curveTo(-213.1661, -906.6519, -219.1371, -920.67694, -223.7961, -935.12494);
        ((GeneralPath) shape).curveTo(-227.5341, -946.71594, -230.2761, -958.72095, -232.36609, -970.7329);
        ((GeneralPath) shape).curveTo(-236.9361, -997.0029, -238.96909, -1023.5609, -239.36009, -1050.22);
        ((GeneralPath) shape).curveTo(-239.53609, -1062.187, -238.7761, -1074.15, -236.61809, -1085.9309);
        ((GeneralPath) shape).curveTo(-233.78108, -1101.4199, -230.67308, -1116.8639, -227.4101, -1132.2699);
        ((GeneralPath) shape).curveTo(-224.2571, -1147.153, -220.5811, -1161.908, -214.5501, -1175.9589);
        ((GeneralPath) shape).curveTo(-212.62709, -1180.4388, -210.5911, -1184.8918, -209.0201, -1189.4978);
        ((GeneralPath) shape).curveTo(-203.8931, -1204.5258, -196.7051, -1218.4918, -187.5541, -1231.4238);
        ((GeneralPath) shape).curveTo(-184.58109, -1235.6249, -181.0261, -1239.4158, -177.68309, -1243.3489);
        ((GeneralPath) shape).curveTo(-177.02708, -1244.1208, -176.1211, -1244.6809, -175.01909, -1245.5979);
        ((GeneralPath) shape).curveTo(-174.64108, -1244.4539, -174.33508, -1243.7859, -174.20209, -1243.085);
        ((GeneralPath) shape).curveTo(-173.09009, -1237.219, -172.24109, -1231.292, -170.86209, -1225.491);
        ((GeneralPath) shape).curveTo(-169.0671, -1217.945, -165.6041, -1211.135, -159.6151, -1206.044);
        ((GeneralPath) shape).curveTo(-153.79309, -1201.095, -147.4261, -1196.8839, -139.8401, -1195.0499);
        ((GeneralPath) shape).curveTo(-134.0441, -1193.6489, -128.20111, -1192.444, -122.3841, -1191.1299);
        ((GeneralPath) shape).curveTo(-120.8411, -1190.7809, -119.3151, -1190.3508, -117.282104, -1189.8309);
        ((GeneralPath) shape).curveTo(-118.5201, -1187.5709, -119.5491, -1185.715, -120.557106, -1183.8469);
        ((GeneralPath) shape).curveTo(-124.42711, -1176.6809, -128.8751, -1169.7579, -132.02411, -1162.2869);
        ((GeneralPath) shape).curveTo(-137.31511, -1149.7318, -143.8721, -1137.8549, -150.15811, -1125.8269);
        ((GeneralPath) shape).curveTo(-156.3231, -1114.0299, -162.51012, -1102.2379, -169.0301, -1090.637);
        ((GeneralPath) shape).curveTo(-174.2411, -1081.366, -180.61511, -1072.8529, -188.3761, -1065.531);
        ((GeneralPath) shape).curveTo(-194.5091, -1059.745, -201.2311, -1054.679, -208.8431, -1050.915);
        ((GeneralPath) shape).curveTo(-210.1901, -1050.249, -211.5681, -1049.646, -212.8671, -1049.045);
        ((GeneralPath) shape).curveTo(-209.90309, -1039.8721, -208.5441, -1038.3611, -199.43109, -1034.06);
        ((GeneralPath) shape).curveTo(-202.64609, -1031.692, -205.74908, -1029.5641, -208.6691, -1027.211);
        ((GeneralPath) shape).curveTo(-211.5051, -1024.926, -214.8291, -1022.98804, -216.3401, -1018.89606);
        ((GeneralPath) shape).curveTo(-214.17911, -1018.62604, -212.5621, -1018.543, -210.99811, -1018.21106);
        ((GeneralPath) shape).curveTo(-199.93211, -1015.8611, -188.85811, -1016.1501, -177.8201, -1018.24506);
        ((GeneralPath) shape).curveTo(-154.3251, -1022.70404, -132.6881, -1032.003, -112.1511, -1043.9901);
        ((GeneralPath) shape).curveTo(-106.5421, -1047.2642, -101.1111, -1050.9271, -96.8581, -1056.0061);
        ((GeneralPath) shape).curveTo(-96.547104, -1056.5131, -96.2361, -1057.0201, -95.9251, -1057.5271);
        ((GeneralPath) shape).curveTo(-96.5201, -1057.3461, -97.114105, -1057.165, -97.7091, -1056.9851);
        ((GeneralPath) shape).curveTo(-100.3631, -1055.6561, -103.0841, -1054.4481, -105.6581, -1052.9791);
        ((GeneralPath) shape).curveTo(-123.884094, -1042.5791, -142.94809, -1034.1132, -163.1001, -1028.2172);
        ((GeneralPath) shape).curveTo(-174.59709, -1024.8531, -186.3291, -1022.7192, -198.36609, -1022.71515);
        ((GeneralPath) shape).curveTo(-199.64108, -1022.7142, -201.14009, -1022.4302, -202.02309, -1024.3612);
        ((GeneralPath) shape).curveTo(-200.57608, -1026.6102, -197.89508, -1027.4622, -195.79808, -1029.0402);
        ((GeneralPath) shape).curveTo(-193.64207, -1030.6602, -191.42007, -1032.2592, -189.57909, -1034.2012);
        ((GeneralPath) shape).curveTo(-188.85608, -1034.9641, -188.73009, -1036.7252, -189.02208, -1037.8531);
        ((GeneralPath) shape).curveTo(-189.19408, -1038.5182, -190.67508, -1039.0962, -191.64308, -1039.2551);
        ((GeneralPath) shape).curveTo(-194.56808, -1039.7351, -197.55708, -1039.8441, -200.47008, -1040.3782);
        ((GeneralPath) shape).curveTo(-203.04507, -1040.8512, -204.71307, -1042.5471, -205.46808, -1044.9822);
        ((GeneralPath) shape).curveTo(-205.04608, -1045.5721, -204.84108, -1046.1552, -204.43707, -1046.3792);
        ((GeneralPath) shape).curveTo(-198.46507, -1049.6921, -192.77608, -1053.2921, -188.86707, -1059.1702);
        ((GeneralPath) shape).curveTo(-188.00706, -1060.4641, -186.42107, -1061.2892, -185.12807, -1062.2772);
        ((GeneralPath) shape).curveTo(-177.95506, -1067.7622, -171.84306, -1074.2772, -166.39307, -1081.4473);
        ((GeneralPath) shape).curveTo(-158.15306, -1092.2893, -151.25307, -1103.9542, -144.78307, -1115.9153);
        ((GeneralPath) shape).curveTo(-136.64706, -1130.9553, -128.61206, -1146.0703, -119.85806, -1160.7502);
        ((GeneralPath) shape).curveTo(-113.89307, -1170.7512, -107.244064, -1180.4323, -100.06906, -1189.6062);
        ((GeneralPath) shape).curveTo(-82.97306, -1211.4642, -62.268063, -1229.2422, -37.71706, -1242.3903);
        ((GeneralPath) shape).curveTo(-19.42706, -1252.1853, -0.029060364, -1257.6353, 20.826939, -1257.0172);
        ((GeneralPath) shape).curveTo(30.210938, -1256.7382, 39.58194, -1256.0002, 48.95894, -1255.4633);
        ((GeneralPath) shape).curveTo(48.04894, -1255.9193, 47.169937, -1256.5453, 46.21594, -1256.6973);
        ((GeneralPath) shape).curveTo(38.71494, -1257.8933, 31.22794, -1259.3073, 23.675938, -1260.0303);
        ((GeneralPath) shape).curveTo(5.3479385, -1261.7833, -12.731064, -1260.2512, -30.215061, -1254.2393);
        ((GeneralPath) shape).curveTo(-52.92306, -1246.4313, -72.90006, -1234.1353, -89.84906, -1217.0262);
        ((GeneralPath) shape).curveTo(-93.09606, -1213.7483, -96.51506, -1210.6422, -100.35006, -1206.9852);
        ((GeneralPath) shape).curveTo(-101.99206, -1206.7073, -104.38606, -1206.1462, -106.81106, -1205.9182);
        ((GeneralPath) shape).curveTo(-118.19906, -1204.8433, -129.56706, -1204.3322, -140.89105, -1206.7703);
        ((GeneralPath) shape).curveTo(-147.34505, -1208.1593, -152.47205, -1211.4122, -156.05405, -1216.8943);
        ((GeneralPath) shape).curveTo(-157.82504, -1219.6053, -159.45805, -1222.4902, -160.61205, -1225.5033);
        ((GeneralPath) shape).curveTo(-164.15305, -1234.7452, -165.34805, -1244.4303, -165.37105, -1254.2793);
        ((GeneralPath) shape).curveTo(-165.37305, -1255.2183, -165.08505, -1256.1583, -164.63304, -1258.9293);
        ((GeneralPath) shape).curveTo(-163.59604, -1256.2463, -163.22604, -1255.3313, -162.88704, -1254.4043);
        ((GeneralPath) shape).curveTo(-160.74203, -1248.5503, -158.82803, -1242.5983, -156.39804, -1236.8654);
        ((GeneralPath) shape).curveTo(-154.15804, -1231.5803, -150.79604, -1226.9243, -146.53804, -1223.0154);
        ((GeneralPath) shape).curveTo(-145.67503, -1222.2234, -144.57603, -1220.9304, -142.98305, -1222.5514);
        ((GeneralPath) shape).curveTo(-148.38005, -1229.2474, -151.54205, -1237.0664, -153.39505, -1245.3204);
        ((GeneralPath) shape).curveTo(-155.23605, -1253.5154, -156.36806, -1261.8694, -157.84406, -1270.1475);
        ((GeneralPath) shape).curveTo(-158.37906, -1273.1505, -157.41406, -1275.4705, -154.92606, -1277.2004);
        ((GeneralPath) shape).curveTo(-153.81105, -1277.9755, -152.80206, -1278.9424, -151.61006, -1279.5625);
        ((GeneralPath) shape).curveTo(-144.38106, -1283.3175, -137.13907, -1287.0496, -129.83105, -1290.6445);
        ((GeneralPath) shape).curveTo(-128.76105, -1291.1715, -127.31106, -1290.9236, -125.58405, -1291.0735);
        ((GeneralPath) shape).curveTo(-125.85606, -1284.1605, -126.68305, -1277.6675, -126.24205, -1271.2625);
        ((GeneralPath) shape).curveTo(-125.43905, -1259.6124, -123.00505, -1248.1875, -119.53405, -1237.0165);
        ((GeneralPath) shape).curveTo(-119.46505, -1236.7975, -118.64505, -1236.8125, -118.01505, -1236.6865);
        ((GeneralPath) shape).curveTo(-117.77005, -1237.4095, -117.263054, -1238.1665, -117.30805, -1238.8895);
        ((GeneralPath) shape).curveTo(-117.79705, -1246.7535, -118.441055, -1254.6075, -118.902054, -1262.4725);
        ((GeneralPath) shape).curveTo(-119.25305, -1268.4365, -119.595055, -1274.4115, -119.57305, -1280.3795);
        ((GeneralPath) shape).curveTo(-119.55905, -1284.3695, -118.96105, -1288.3685, -117.59305, -1292.5215);
        ((GeneralPath) shape).curveTo(-114.041046, -1292.6775, -110.81405, -1292.8955, -107.584045, -1292.9495);
        ((GeneralPath) shape).curveTo(-74.68904, -1293.5005, -41.822044, -1292.6045, -8.968048, -1291.0365);
        ((GeneralPath) shape).curveTo(-6.5250483, -1290.9196, -4.087048, -1290.7195, -1.6460481, -1290.5645);
        ((GeneralPath) shape).curveTo(12.448952, -1289.6715, 26.536953, -1288.6654, 40.63995, -1287.9375);
        ((GeneralPath) shape).curveTo(47.14795, -1287.6025, 53.68795, -1287.9545, 60.205948, -1287.7426);
        ((GeneralPath) shape).curveTo(80.31795, -1287.0916, 100.42495, -1287.0336, 120.52595, -1287.9706);
        ((GeneralPath) shape).curveTo(130.55995, -1288.4386, 140.58295, -1289.1466, 150.61395, -1289.6766);
        ((GeneralPath) shape).curveTo(157.93396, -1290.0626, 165.25995, -1290.3556, 172.58595, -1290.6377);
        ((GeneralPath) shape).curveTo(173.58995, -1290.6766, 174.60495, -1290.4127, 176.27995, -1290.2067);
        ((GeneralPath) shape).curveTo(175.39795, -1288.0256, 174.83495, -1286.2677, 174.00696, -1284.6447);
        ((GeneralPath) shape).curveTo(167.33997, -1271.5797, 160.67896, -1258.5106, 153.87895, -1245.5146);
        ((GeneralPath) shape).moveTo(-246.87105, -769.00464);
        ((GeneralPath) shape).curveTo(-246.94305, -769.09467, -247.05605, -769.1516, -247.15605, -769.21967);
        ((GeneralPath) shape).curveTo(-247.02705, -768.96765, -246.89806, -768.7167, -246.76906, -768.46466);
        ((GeneralPath) shape).curveTo(-246.79906, -768.6487, -246.77007, -768.87866, -246.87106, -769.00464);
        ((GeneralPath) shape).moveTo(-215.21007, -1220.0547);
        ((GeneralPath) shape).curveTo(-223.37607, -1190.7417, -229.79007, -1161.0046, -236.30807, -1131.2987);
        ((GeneralPath) shape).curveTo(-239.39308, -1117.2386, -242.17108, -1103.1298, -243.58307, -1088.7557);
        ((GeneralPath) shape).curveTo(-244.67607, -1077.6298, -244.52307, -1066.5198, -244.68108, -1055.3827);
        ((GeneralPath) shape).curveTo(-244.98708, -1033.8796, -242.91107, -1012.48267, -242.34607, -991.02167);
        ((GeneralPath) shape).curveTo(-242.18207, -984.7837, -241.72208, -978.51666, -240.84708, -972.3407);
        ((GeneralPath) shape).curveTo(-238.14407, -953.2547, -235.56807, -934.1527, -231.33807, -915.3047);
        ((GeneralPath) shape).curveTo(-224.19807, -883.4877, -216.01807, -851.9867, -205.21007, -821.1837);
        ((GeneralPath) shape).curveTo(-189.90007, -777.5567, -172.80006, -734.7027, -151.34407, -693.6837);
        ((GeneralPath) shape).curveTo(-148.57307, -688.3867, -145.77707, -683.1027, -143.05006, -677.7827);
        ((GeneralPath) shape).curveTo(-129.87706, -652.0857, -114.71906, -627.6347, -97.17006, -604.6857);
        ((GeneralPath) shape).curveTo(-92.87806, -599.0737, -88.48506, -593.53876, -84.18206, -587.9357);
        ((GeneralPath) shape).curveTo(-83.43006, -586.9567, -82.89306, -585.8117, -81.90506, -584.15173);
        ((GeneralPath) shape).curveTo(-85.14306, -584.44476, -87.26106, -585.61774, -89.51406, -586.34875);
        ((GeneralPath) shape).curveTo(-101.27906, -590.1628, -113.24806, -592.3608, -125.606064, -589.9288);
        ((GeneralPath) shape).curveTo(-134.66307, -588.14575, -143.75806, -586.3678, -152.24007, -582.52576);
        ((GeneralPath) shape).curveTo(-163.61607, -577.3738, -174.93207, -572.08875, -186.28906, -566.8948);
        ((GeneralPath) shape).curveTo(-187.69307, -566.25275, -189.19006, -565.81775, -190.57506, -565.31177);
        ((GeneralPath) shape).curveTo(-192.61206, -572.54376, -194.34906, -579.36475, -196.45605, -586.06976);
        ((GeneralPath) shape).curveTo(-201.43506, -601.9128, -209.75705, -615.75476, -221.69305, -627.3788);
        ((GeneralPath) shape).curveTo(-232.06206, -637.47577, -243.35605, -646.3528, -255.92305, -653.57275);
        ((GeneralPath) shape).curveTo(-256.63004, -653.9778, -257.41306, -654.29175, -258.02505, -654.80774);
        ((GeneralPath) shape).curveTo(-258.66806, -655.34875, -260.21106, -655.4987, -259.14105, -657.22375);
        ((GeneralPath) shape).curveTo(-256.55606, -656.81976, -253.88306, -656.4437, -251.22505, -655.97473);
        ((GeneralPath) shape).curveTo(-248.41205, -655.47876, -245.58005, -654.2857, -241.93105, -656.6337);
        ((GeneralPath) shape).curveTo(-245.06804, -659.60175, -248.43405, -661.26874, -251.40105, -663.42175);
        ((GeneralPath) shape).curveTo(-254.69905, -665.8168, -258.04205, -668.1547, -261.25806, -670.6547);
        ((GeneralPath) shape).curveTo(-264.26205, -672.9887, -267.17706, -675.4447, -270.03607, -677.9547);
        ((GeneralPath) shape).curveTo(-273.02606, -680.57874, -276.30508, -682.9487, -279.12006, -687.0637);
        ((GeneralPath) shape).curveTo(-272.15906, -686.0067, -266.23904, -681.4867, -259.78705, -685.2707);
        ((GeneralPath) shape).curveTo(-259.34705, -688.8177, -260.40704, -691.5767, -261.51904, -694.3477);
        ((GeneralPath) shape).curveTo(-263.94904, -700.3967, -266.38605, -706.4437, -268.70804, -712.5347);
        ((GeneralPath) shape).curveTo(-270.33102, -716.79175, -272.13504, -721.0357, -272.05005, -726.3007);
        ((GeneralPath) shape).curveTo(-270.67905, -725.8197, -269.67105, -725.61774, -268.81506, -725.1427);
        ((GeneralPath) shape).curveTo(-262.40308, -721.5857, -256.01907, -717.9777, -249.63106, -714.3777);
        ((GeneralPath) shape).curveTo(-248.21706, -713.5807, -246.87006, -712.64667, -245.40605, -711.9617);
        ((GeneralPath) shape).curveTo(-243.86705, -711.24066, -241.77405, -712.6437, -241.96506, -714.25165);
        ((GeneralPath) shape).curveTo(-242.15605, -715.8547, -242.47606, -717.46564, -242.94806, -719.00867);
        ((GeneralPath) shape).curveTo(-245.55305, -727.53265, -248.22105, -736.0367, -250.86707, -744.54767);
        ((GeneralPath) shape).curveTo(-248.31207, -744.5387, -247.51506, -742.2287, -246.17307, -740.73364);
        ((GeneralPath) shape).curveTo(-239.27507, -733.04767, -232.51607, -725.2346, -225.58307, -717.58167);
        ((GeneralPath) shape).curveTo(-223.59007, -715.38165, -221.23506, -713.49164, -218.93407, -711.59467);
        ((GeneralPath) shape).curveTo(-217.41707, -710.3437, -215.63307, -709.69965, -213.03006, -710.8597);
        ((GeneralPath) shape).curveTo(-212.97305, -712.9537, -212.85007, -715.3367, -212.85606, -717.71967);
        ((GeneralPath) shape).curveTo(-212.87007, -723.15265, -212.99207, -728.58466, -212.96106, -734.01764);
        ((GeneralPath) shape).curveTo(-212.95406, -735.18665, -213.52606, -736.79266, -211.33105, -737.3956);
        ((GeneralPath) shape).curveTo(-210.54906, -736.42566, -209.60106, -735.45465, -208.88806, -734.33264);
        ((GeneralPath) shape).curveTo(-204.05707, -726.73065, -198.01506, -720.09265, -192.32506, -713.1616);
        ((GeneralPath) shape).curveTo(-188.36707, -708.3416, -184.89206, -703.1196, -181.29706, -698.0106);
        ((GeneralPath) shape).curveTo(-179.58105, -695.5706, -178.14406, -692.93463, -176.45706, -690.47064);
        ((GeneralPath) shape).curveTo(-175.94206, -689.7186, -175.01807, -689.2446, -173.48807, -687.99567);
        ((GeneralPath) shape).curveTo(-173.20807, -690.2577, -172.65306, -691.5997, -172.97507, -692.6827);
        ((GeneralPath) shape).curveTo(-174.51607, -697.87366, -175.71106, -703.2837, -178.09407, -708.0877);
        ((GeneralPath) shape).curveTo(-186.49007, -725.0107, -197.34708, -740.2337, -211.14407, -753.2437);
        ((GeneralPath) shape).curveTo(-211.98207, -754.0337, -213.18707, -754.4337, -214.63007, -755.2457);
        ((GeneralPath) shape).curveTo(-216.61807, -744.8137, -218.47406, -735.07776, -220.55606, -724.15674);
        ((GeneralPath) shape).curveTo(-222.11006, -726.07874, -222.87706, -727.06775, -223.68607, -728.02075);
        ((GeneralPath) shape).curveTo(-227.90007, -732.98676, -231.67706, -738.4338, -236.44307, -742.79974);
        ((GeneralPath) shape).curveTo(-245.42506, -751.0278, -253.97208, -759.5928, -261.52106, -769.7357);
        ((GeneralPath) shape).curveTo(-262.01605, -768.6367, -262.60507, -767.95874, -262.55206, -767.3357);
        ((GeneralPath) shape).curveTo(-262.31708, -764.6397, -262.13705, -761.9007, -261.49707, -759.28467);
        ((GeneralPath) shape).curveTo(-259.43307, -750.84564, -257.18008, -742.45264, -254.98708, -734.04565);
        ((GeneralPath) shape).curveTo(-254.26608, -731.28064, -253.37007, -728.53766, -253.82507, -725.17865);
        ((GeneralPath) shape).curveTo(-259.3401, -726.8597, -264.12808, -728.6146, -268.41507, -731.59064);
        ((GeneralPath) shape).curveTo(-271.29007, -733.58563, -274.44406, -734.86365, -278.73407, -735.43964);
        ((GeneralPath) shape).curveTo(-278.24008, -721.22864, -272.91208, -708.20667, -272.42807, -693.53265);
        ((GeneralPath) shape).curveTo(-280.04108, -698.66364, -285.89606, -704.10767, -290.43707, -710.99066);
        ((GeneralPath) shape).curveTo(-302.42007, -729.15063, -313.73508, -747.70166, -323.89908, -766.95166);
        ((GeneralPath) shape).curveTo(-340.14508, -797.72064, -355.32208, -829.01764, -369.99408, -860.55365);
        ((GeneralPath) shape).curveTo(-378.93207, -879.76263, -387.7331, -899.0577, -395.82108, -918.63367);
        ((GeneralPath) shape).curveTo(-419.61508, -976.2217, -438.62607, -1035.4037, -453.86008, -1095.8137);
        ((GeneralPath) shape).curveTo(-458.3101, -1113.4587, -462.7621, -1131.1067, -465.5641, -1149.1127);
        ((GeneralPath) shape).curveTo(-468.02808, -1164.9497, -470.4751, -1180.7887, -472.8661, -1196.6367);
        ((GeneralPath) shape).curveTo(-475.90707, -1216.8007, -478.3111, -1237.0308, -478.9911, -1257.4357);
        ((GeneralPath) shape).curveTo(-479.0901, -1260.4187, -479.4501, -1263.3937, -479.7031, -1266.3707);
        ((GeneralPath) shape).curveTo(-480.6211, -1277.1987, -481.6301, -1288.0187, -482.41708, -1298.8557);
        ((GeneralPath) shape).curveTo(-482.64807, -1302.0427, -483.0911, -1305.3607, -481.54108, -1308.5477);
        ((GeneralPath) shape).curveTo(-472.10907, -1307.5508, -462.75607, -1306.5627, -453.5171, -1305.5867);
        ((GeneralPath) shape).curveTo(-451.4541, -1301.0306, -451.86908, -1296.6177, -451.8291, -1292.3326);
        ((GeneralPath) shape).curveTo(-451.6611, -1274.3026, -448.6861, -1256.6406, -445.1061, -1239.0516);
        ((GeneralPath) shape).curveTo(-444.94812, -1238.2756, -444.31512, -1237.5956, -443.9031, -1236.8706);
        ((GeneralPath) shape).curveTo(-442.8341, -1238.7476, -442.7601, -1240.3236, -442.8461, -1241.8906);
        ((GeneralPath) shape).curveTo(-443.7731, -1258.7136, -444.7561, -1275.5336, -445.6461, -1292.3586);
        ((GeneralPath) shape).curveTo(-445.84308, -1296.0776, -446.6741, -1299.8556, -445.43808, -1303.8536);
        ((GeneralPath) shape).curveTo(-436.77808, -1305.1747, -428.55408, -1302.3527, -420.19507, -1302.5027);
        ((GeneralPath) shape).curveTo(-416.75406, -1302.5637, -413.10907, -1302.8176, -409.41507, -1300.8597);
        ((GeneralPath) shape).curveTo(-409.41507, -1298.8588, -409.23907, -1296.7047, -409.44708, -1294.5878);
        ((GeneralPath) shape).curveTo(-410.13907, -1287.5587, -411.0641, -1280.5527, -411.7241, -1273.5208);
        ((GeneralPath) shape).curveTo(-412.8971, -1261.0448, -412.78708, -1248.5448, -412.0311, -1236.0487);
        ((GeneralPath) shape).curveTo(-411.9371, -1234.4967, -412.0041, -1232.7157, -409.6021, -1231.9847);
        ((GeneralPath) shape).curveTo(-409.3501, -1232.9797, -408.97412, -1233.9268, -408.88412, -1234.8998);
        ((GeneralPath) shape).curveTo(-407.08612, -1254.3707, -405.3351, -1273.8447, -403.53513, -1293.3158);
        ((GeneralPath) shape).curveTo(-403.28812, -1295.9818, -403.02512, -1298.6877, -401.61414, -1300.8278);
        ((GeneralPath) shape).curveTo(-393.21112, -1302.4647, -379.89114, -1302.1498, -373.51312, -1300.0818);
        ((GeneralPath) shape).curveTo(-373.51312, -1297.0658, -373.28412, -1293.8368, -373.55713, -1290.6508);
        ((GeneralPath) shape).curveTo(-374.36914, -1281.1768, -375.40912, -1271.7218, -376.30313, -1262.2548);
        ((GeneralPath) shape).curveTo(-376.99213, -1254.9528, -377.67514, -1247.6498, -378.22113, -1240.3358);
        ((GeneralPath) shape).curveTo(-379.19012, -1227.3268, -379.90912, -1214.2979, -380.99512, -1201.2998);
        ((GeneralPath) shape).curveTo(-382.51312, -1183.1328, -383.32013, -1164.9688, -382.51312, -1146.7318);
        ((GeneralPath) shape).curveTo(-381.26312, -1118.4908, -379.33212, -1090.3048, -376.94113, -1062.1338);
        ((GeneralPath) shape).curveTo(-375.03113, -1039.6218, -371.82913, -1017.3028, -367.70615, -995.15076);
        ((GeneralPath) shape).curveTo(-362.14413, -965.26074, -355.98013, -935.46875, -349.39413, -905.78674);
        ((GeneralPath) shape).curveTo(-342.43112, -874.4047, -331.60614, -844.2327, -318.65213, -814.83673);
        ((GeneralPath) shape).curveTo(-316.46613, -809.87573, -313.78412, -805.1207, -311.11612, -800.3927);
        ((GeneralPath) shape).curveTo(-310.4291, -799.1747, -309.0451, -798.3487, -307.92313, -797.3767);
        ((GeneralPath) shape).curveTo(-308.21512, -798.8567, -308.37314, -800.3867, -308.8951, -801.78174);
        ((GeneralPath) shape).curveTo(-313.0791, -812.97174, -317.4491, -824.0927, -321.5621, -835.3087);
        ((GeneralPath) shape).curveTo(-328.9491, -855.45074, -336.14612, -875.65674, -340.9571, -896.6207);
        ((GeneralPath) shape).curveTo(-348.5511, -929.7077, -355.5231, -962.92474, -360.96408, -996.43475);
        ((GeneralPath) shape).curveTo(-363.79208, -1013.85175, -366.35107, -1031.3278, -367.10208, -1049.0057);
        ((GeneralPath) shape).curveTo(-367.32108, -1054.1598, -367.97107, -1059.2947, -368.3281, -1064.4447);
        ((GeneralPath) shape).curveTo(-369.26608, -1077.9867, -370.5731, -1091.5217, -370.9651, -1105.0807);
        ((GeneralPath) shape).curveTo(-371.63208, -1128.1697, -371.8551, -1151.2777, -369.6201, -1174.3237);
        ((GeneralPath) shape).curveTo(-368.30807, -1187.8407, -367.27408, -1201.3907, -365.6811, -1214.8738);
        ((GeneralPath) shape).curveTo(-363.8341, -1230.5128, -361.52408, -1246.0968, -359.37408, -1261.6987);
        ((GeneralPath) shape).curveTo(-359.1601, -1263.2548, -358.66708, -1264.7727, -358.23608, -1266.5907);
        ((GeneralPath) shape).curveTo(-352.04007, -1266.3057, -346.12207, -1265.9637, -340.1991, -1265.7806);
        ((GeneralPath) shape).curveTo(-333.9561, -1265.5876, -327.6861, -1265.8276, -321.4681, -1265.3546);
        ((GeneralPath) shape).curveTo(-315.6151, -1264.9097, -309.6211, -1266.4026, -303.71912, -1264.6676);
        ((GeneralPath) shape).curveTo(-303.48712, -1263.1456, -303.1831, -1262.1027, -303.1931, -1261.0626);
        ((GeneralPath) shape).curveTo(-303.26312, -1253.7256, -303.33713, -1246.3876, -303.52612, -1239.0526);
        ((GeneralPath) shape).curveTo(-303.74313, -1230.6376, -304.39813, -1222.2216, -304.28214, -1213.8146);
        ((GeneralPath) shape).curveTo(-304.14615, -1204.0416, -303.43515, -1194.2756, -302.87415, -1184.5116);
        ((GeneralPath) shape).curveTo(-301.93915, -1168.2366, -300.87015, -1151.9686, -299.95914, -1135.6926);
        ((GeneralPath) shape).curveTo(-298.73013, -1113.7186, -297.09714, -1091.7786, -294.56613, -1069.9126);
        ((GeneralPath) shape).curveTo(-291.56815, -1044.0146, -288.74612, -1018.0916, -285.39313, -992.2386);
        ((GeneralPath) shape).curveTo(-282.07614, -966.66156, -278.11914, -941.1676, -274.59213, -915.61755);
        ((GeneralPath) shape).curveTo(-273.07013, -904.59357, -271.91113, -893.51855, -270.60913, -882.46454);
        ((GeneralPath) shape).curveTo(-269.27512, -871.14453, -268.36014, -859.7595, -266.56613, -848.51355);
        ((GeneralPath) shape).curveTo(-262.84113, -825.16956, -257.31213, -802.2026, -250.96013, -779.4396);
        ((GeneralPath) shape).curveTo(-250.04514, -776.1606, -248.63313, -773.02057, -247.43112, -769.8216);
        ((GeneralPath) shape).curveTo(-246.75412, -775.4586, -247.97412, -780.9526, -248.78513, -786.46857);
        ((GeneralPath) shape).curveTo(-250.72012, -799.6316, -252.38513, -812.84656, -254.77513, -825.92755);
        ((GeneralPath) shape).curveTo(-257.17212, -839.04456, -258.86014, -852.23157, -260.32214, -865.46454);
        ((GeneralPath) shape).curveTo(-261.57513, -876.80853, -262.80014, -888.15656, -264.11615, -899.4935);
        ((GeneralPath) shape).curveTo(-265.52615, -911.63556, -267.08115, -923.76154, -268.47714, -935.9055);
        ((GeneralPath) shape).curveTo(-269.71713, -946.7035, -270.71313, -957.5305, -272.02014, -968.3205);
        ((GeneralPath) shape).curveTo(-274.43814, -988.2785, -277.40814, -1008.1775, -279.40915, -1028.1755);
        ((GeneralPath) shape).curveTo(-282.08615, -1054.9435, -284.05215, -1081.7815, -286.34015, -1108.5875);
        ((GeneralPath) shape).curveTo(-286.89413, -1115.0845, -287.55316, -1121.5715, -288.09116, -1128.0696);
        ((GeneralPath) shape).curveTo(-288.98715, -1138.9016, -289.90616, -1149.7335, -290.66617, -1160.5756);
        ((GeneralPath) shape).curveTo(-291.52118, -1172.7736, -292.15317, -1184.9875, -292.98718, -1197.1875);
        ((GeneralPath) shape).curveTo(-293.8022, -1209.1115, -294.75317, -1221.0255, -295.63718, -1232.9445);
        ((GeneralPath) shape).curveTo(-296.28217, -1241.6324, -296.60318, -1250.3135, -295.38116, -1258.9895);
        ((GeneralPath) shape).curveTo(-293.78818, -1270.3005, -292.54315, -1281.6425, -292.50516, -1293.0885);
        ((GeneralPath) shape).curveTo(-292.50116, -1294.3475, -292.11615, -1295.6045, -291.84317, -1297.2555);
        ((GeneralPath) shape).curveTo(-282.4272, -1295.9855, -273.36417, -1295.3545, -264.01016, -1293.4495);
        ((GeneralPath) shape).curveTo(-264.37115, -1291.5764, -264.58417, -1290.2825, -264.87317, -1289.0055);
        ((GeneralPath) shape).curveTo(-265.71118, -1285.3005, -266.75018, -1281.6315, -267.40616, -1277.8955);
        ((GeneralPath) shape).curveTo(-270.18417, -1262.0546, -270.85516, -1246.0325, -271.21417, -1229.9955);
        ((GeneralPath) shape).curveTo(-271.28116, -1227.0155, -270.99017, -1224.0175, -270.68716, -1221.0465);
        ((GeneralPath) shape).curveTo(-270.58316, -1220.0175, -270.93716, -1218.4395, -268.94815, -1218.1135);
        ((GeneralPath) shape).curveTo(-267.64215, -1226.0415, -266.49915, -1233.8135, -265.06015, -1241.5295);
        ((GeneralPath) shape).curveTo(-262.42215, -1255.6796, -259.71915, -1269.8185, -256.78217, -1283.9076);
        ((GeneralPath) shape).curveTo(-256.14716, -1286.9546, -255.83417, -1290.4116, -253.23117, -1292.5966);
        ((GeneralPath) shape).curveTo(-240.13817, -1293.1896, -234.08318, -1292.5625, -228.32417, -1290.0526);
        ((GeneralPath) shape).curveTo(-227.17218, -1285.0646, -229.12218, -1280.3687, -229.78517, -1275.5686);
        ((GeneralPath) shape).curveTo(-231.34618, -1264.2697, -233.15417, -1253.0037, -234.84618, -1241.7227);
        ((GeneralPath) shape).curveTo(-235.27718, -1238.8486, -235.65318, -1235.9677, -236.05318, -1233.0896);
        ((GeneralPath) shape).curveTo(-233.54817, -1234.6075, -233.04218, -1237.3276, -232.13017, -1239.7876);
        ((GeneralPath) shape).curveTo(-227.02017, -1253.5646, -222.90918, -1267.6136, -220.60117, -1282.1566);
        ((GeneralPath) shape).curveTo(-220.14317, -1285.0406, -219.46516, -1287.8906, -218.80817, -1291.1586);
        ((GeneralPath) shape).curveTo(-209.43617, -1290.6335, -200.53116, -1290.1395, -191.62717, -1289.6285);
        ((GeneralPath) shape).curveTo(-190.81917, -1289.5825, -190.01317, -1289.4506, -189.21716, -1289.3005);
        ((GeneralPath) shape).curveTo(-189.00616, -1289.2605, -188.79216, -1289.0376, -188.65816, -1288.8435);
        ((GeneralPath) shape).curveTo(-188.50716, -1288.6255, -188.44516, -1288.3466, -188.31616, -1288.0215);
        ((GeneralPath) shape).curveTo(-191.14516, -1282.5215, -194.33516, -1277.1205, -196.78915, -1271.4034);
        ((GeneralPath) shape).curveTo(-203.97116, -1254.6714, -210.31915, -1237.6115, -215.21016, -1220.0575);
        ((GeneralPath) shape).moveTo(-250.90717, -744.6775);
        ((GeneralPath) shape).curveTo(-250.89417, -744.6355, -250.88017, -744.59247, -250.86717, -744.5495);
        ((GeneralPath) shape).curveTo(-250.91817, -744.5505, -250.95917, -744.5635, -251.01117, -744.5625);
        ((GeneralPath) shape).lineTo(-250.90717, -744.6775);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-382.23718, -329.7975);
        ((GeneralPath) shape).curveTo(-386.70117, -331.7685, -391.27618, -333.50848, -395.8722, -335.1525);
        ((GeneralPath) shape).curveTo(-397.5552, -335.7545, -399.4492, -335.7665, -401.6562, -336.1125);
        ((GeneralPath) shape).curveTo(-401.95618, -333.7855, -402.37518, -331.96048, -402.3982, -330.1315);
        ((GeneralPath) shape).curveTo(-402.6532, -310.0195, -401.70218, -289.9695, -399.96518, -269.9215);
        ((GeneralPath) shape).curveTo(-398.73517, -255.7395, -395.40918, -242.09251, -391.35617, -228.5655);
        ((GeneralPath) shape).curveTo(-387.22617, -214.7805, -382.54718, -201.1745, -376.66418, -188.0245);
        ((GeneralPath) shape).curveTo(-371.70218, -176.9375, -364.6522, -167.38951, -354.9532, -159.9575);
        ((GeneralPath) shape).curveTo(-352.59518, -158.1505, -350.02118, -156.6075, -347.46118, -155.0865);
        ((GeneralPath) shape).curveTo(-342.02917, -151.8585, -336.0522, -151.6985, -330.0662, -152.5805);
        ((GeneralPath) shape).curveTo(-325.0122, -153.3255, -320.8282, -156.0765, -318.00418, -160.2445);
        ((GeneralPath) shape).curveTo(-315.43918, -164.03151, -313.0752, -168.0995, -311.4802, -172.36351);
        ((GeneralPath) shape).curveTo(-309.3002, -178.18951, -307.6152, -184.24951, -306.2792, -190.3325);
        ((GeneralPath) shape).curveTo(-303.0192, -205.1725, -299.7582, -220.0265, -297.1062, -234.98251);
        ((GeneralPath) shape).curveTo(-294.4522, -249.94652, -292.5642, -265.00952, -292.7562, -280.3185);
        ((GeneralPath) shape).curveTo(-292.8502, -287.7495, -296.2682, -291.9305, -302.5052, -294.6925);
        ((GeneralPath) shape).curveTo(-302.75317, -294.8025, -303.01718, -294.87552, -303.27118, -294.97052);
        ((GeneralPath) shape).curveTo(-330.2592, -305.07153, -355.91818, -318.18152, -382.23718, -329.79752);
        ((GeneralPath) shape).moveTo(-380.26617, -134.99751);
        ((GeneralPath) shape).curveTo(-375.38718, -126.37651, -368.5652, -119.40651, -360.34616, -113.89851);
        ((GeneralPath) shape).curveTo(-351.16016, -107.742516, -341.37015, -107.62251, -331.81516, -112.54452);
        ((GeneralPath) shape).curveTo(-321.89316, -117.65452, -314.54916, -125.506516, -310.38416, -136.04852);
        ((GeneralPath) shape).curveTo(-310.01715, -136.97752, -309.92615, -138.01552, -309.31314, -140.77252);
        ((GeneralPath) shape).curveTo(-311.49915, -138.44353, -312.58115, -137.47552, -313.44513, -136.34052);
        ((GeneralPath) shape).curveTo(-317.74713, -130.68051, -322.84012, -125.84451, -328.64914, -121.78052);
        ((GeneralPath) shape).curveTo(-331.99313, -119.44152, -335.56113, -117.505516, -339.70114, -116.910515);
        ((GeneralPath) shape).curveTo(-346.72113, -115.90051, -353.28214, -116.97352, -358.77515, -121.714516);
        ((GeneralPath) shape).curveTo(-362.24814, -124.71152, -365.74313, -127.80652, -368.60715, -131.35751);
        ((GeneralPath) shape).curveTo(-373.19214, -137.04051, -377.26614, -143.13652, -381.54715, -149.06451);
        ((GeneralPath) shape).curveTo(-383.09216, -151.20352, -384.61514, -153.35852, -386.14716, -155.5075);
        ((GeneralPath) shape).curveTo(-386.75217, -147.9425, -383.83615, -141.30351, -380.26614, -134.99751);
        ((GeneralPath) shape).moveTo(-201.22615, -116.258514);
        ((GeneralPath) shape).curveTo(-198.18515, -99.90652, -190.46014, -86.62651, -175.26915, -78.910515);
        ((GeneralPath) shape).curveTo(-165.67415, -74.035515, -155.32115, -73.79151, -145.12614, -77.131516);
        ((GeneralPath) shape).curveTo(-134.86914, -80.49052, -126.02515, -86.39052, -118.76614, -94.30752);
        ((GeneralPath) shape).curveTo(-113.82614, -99.69552, -109.59215, -105.73252, -105.097145, -111.52252);
        ((GeneralPath) shape).curveTo(-104.65714, -112.08952, -104.60214, -112.95552, -104.36915, -113.682526);
        ((GeneralPath) shape).curveTo(-104.69115, -114.00953, -105.014145, -114.335526, -105.33715, -114.66152);
        ((GeneralPath) shape).curveTo(-107.53115, -113.10552, -109.76915, -111.60852, -111.90915, -109.98252);
        ((GeneralPath) shape).curveTo(-118.61715, -104.88752, -125.25015, -99.69252, -131.99216, -94.64452);
        ((GeneralPath) shape).curveTo(-134.81216, -92.53352, -137.77815, -90.599525, -140.77916, -88.751526);
        ((GeneralPath) shape).curveTo(-149.10316, -83.627525, -158.26616, -83.03953, -167.56915, -84.53953);
        ((GeneralPath) shape).curveTo(-173.94916, -85.56853, -179.01115, -89.348526, -183.35815, -94.02653);
        ((GeneralPath) shape).curveTo(-189.16615, -100.27853, -193.18016, -107.66653, -196.70816, -115.349525);
        ((GeneralPath) shape).curveTo(-197.49516, -117.06352, -198.15816, -118.835526, -198.87616, -120.573524);
        ((GeneralPath) shape).curveTo(-201.32216, -120.404526, -200.87616, -118.447525, -201.27615, -117.06653);
        ((GeneralPath) shape).curveTo(-201.34715, -116.821526, -201.27615, -116.52353, -201.22615, -116.25853);
        ((GeneralPath) shape).moveTo(-56.816147, -194.78253);
        ((GeneralPath) shape).curveTo(-49.949146, -206.80054, -42.998146, -218.81053, -39.045147, -232.19853);
        ((GeneralPath) shape).curveTo(-35.59015, -243.89653, -32.384148, -255.66853, -29.072147, -267.40854);
        ((GeneralPath) shape).curveTo(-28.925148, -267.93054, -28.807148, -268.46155, -28.705147, -268.99454);
        ((GeneralPath) shape).curveTo(-27.485147, -275.35754, -28.578146, -277.40955, -34.718147, -279.28055);
        ((GeneralPath) shape).curveTo(-38.078148, -280.30453, -41.545147, -281.17755, -45.025146, -281.56354);
        ((GeneralPath) shape).curveTo(-51.49415, -282.28055, -58.000145, -282.77155, -64.50314, -283.03653);
        ((GeneralPath) shape).curveTo(-82.404144, -283.76553, -100.30914, -284.39252, -118.21614, -284.92554);
        ((GeneralPath) shape).curveTo(-124.99414, -285.12653, -131.78413, -284.95853, -138.56815, -284.95853);
        ((GeneralPath) shape).curveTo(-138.56714, -284.91254, -138.56615, -284.86652, -138.56415, -284.82053);
        ((GeneralPath) shape).curveTo(-148.87215, -284.40454, -159.18115, -284.01752, -169.48615, -283.55753);
        ((GeneralPath) shape).curveTo(-174.12314, -283.35052, -175.08514, -282.39252, -175.60014, -277.78354);
        ((GeneralPath) shape).curveTo(-175.75114, -276.43753, -175.76614, -275.07452, -175.82214, -273.71854);
        ((GeneralPath) shape).curveTo(-176.48415, -257.71454, -176.75314, -241.68153, -177.90715, -225.71353);
        ((GeneralPath) shape).curveTo(-179.12315, -208.90353, -179.66216, -192.10153, -179.56615, -175.26154);
        ((GeneralPath) shape).curveTo(-179.50314, -164.39554, -179.24815, -153.54053, -177.50415, -142.78653);
        ((GeneralPath) shape).curveTo(-176.58815, -137.14752, -175.25815, -131.60553, -172.54015, -126.50853);
        ((GeneralPath) shape).curveTo(-168.29214, -118.54153, -161.95514, -114.60053, -152.62915, -115.44253);
        ((GeneralPath) shape).curveTo(-145.71014, -116.06753, -139.40715, -118.14853, -133.33914, -121.36953);
        ((GeneralPath) shape).curveTo(-100.87514, -138.59853, -75.096146, -162.79153, -56.81614, -194.78253);
        ((GeneralPath) shape).moveTo(-460.91614, -430.64252);
        ((GeneralPath) shape).curveTo(-453.34915, -428.45752, -445.80212, -426.2025, -438.21014, -424.10553);
        ((GeneralPath) shape).curveTo(-422.72015, -419.82852, -406.96515, -416.95752, -390.94614, -415.64352);
        ((GeneralPath) shape).curveTo(-378.68713, -414.6375, -366.47513, -415.74353, -354.35413, -417.3315);
        ((GeneralPath) shape).curveTo(-345.1711, -418.5335, -336.3221, -421.3095, -328.20013, -425.97052);
        ((GeneralPath) shape).curveTo(-326.90814, -426.71252, -325.79114, -427.75952, -323.58914, -429.42352);
        ((GeneralPath) shape).curveTo(-325.65915, -429.22052, -326.46213, -429.31253, -327.12714, -429.0515);
        ((GeneralPath) shape).curveTo(-337.63812, -424.9345, -348.64114, -423.46152, -359.81613, -422.9125);
        ((GeneralPath) shape).curveTo(-361.85114, -422.8125, -363.99112, -422.5075, -365.83414, -424.6715);
        ((GeneralPath) shape).curveTo(-364.44315, -425.98752, -363.36115, -427.1785, -362.11514, -428.16052);
        ((GeneralPath) shape).curveTo(-354.14413, -434.4515, -345.24713, -438.99353, -335.72516, -442.49753);
        ((GeneralPath) shape).curveTo(-330.11316, -444.56354, -324.84915, -444.90353, -319.14716, -442.6765);
        ((GeneralPath) shape).curveTo(-308.50015, -438.51852, -297.42816, -438.6075, -286.26816, -440.5465);
        ((GeneralPath) shape).curveTo(-287.95117, -441.2385, -289.69217, -441.4805, -291.42416, -441.7785);
        ((GeneralPath) shape).curveTo(-297.56915, -442.8335, -303.72617, -443.8355, -309.84418, -445.03052);
        ((GeneralPath) shape).curveTo(-311.17517, -445.29053, -312.36618, -446.26752, -314.52417, -447.3785);
        ((GeneralPath) shape).curveTo(-289.13116, -453.34552, -264.58716, -453.8205, -240.26917, -452.1495);
        ((GeneralPath) shape).curveTo(-237.52817, -448.2135, -237.33316, -444.6225, -238.29817, -440.69852);
        ((GeneralPath) shape).curveTo(-242.53917, -423.4595, -244.45618, -405.94852, -244.19917, -388.1935);
        ((GeneralPath) shape).curveTo(-244.17618, -386.62152, -244.61618, -385.04352, -244.90717, -383.0125);
        ((GeneralPath) shape).curveTo(-250.60716, -381.82852, -256.15018, -380.58252, -261.73117, -379.5375);
        ((GeneralPath) shape).curveTo(-273.19418, -377.39252, -283.42017, -372.6065, -292.51617, -365.36652);
        ((GeneralPath) shape).curveTo(-298.80417, -360.3615, -303.43018, -354.21252, -306.53918, -346.68652);
        ((GeneralPath) shape).curveTo(-308.5182, -341.89352, -307.59918, -338.35352, -304.31018, -334.85553);
        ((GeneralPath) shape).curveTo(-300.17017, -330.45154, -295.25818, -327.08054, -290.1822, -323.88354);
        ((GeneralPath) shape).curveTo(-271.2782, -311.97556, -250.43419, -308.23154, -228.5102, -309.47055);
        ((GeneralPath) shape).curveTo(-223.96419, -309.72855, -219.36919, -310.89255, -215.0152, -312.31155);
        ((GeneralPath) shape).curveTo(-209.6882, -314.04855, -206.6322, -318.05954, -205.9252, -323.75757);
        ((GeneralPath) shape).curveTo(-205.2342, -329.32257, -205.9832, -334.73358, -208.59221, -339.60156);
        ((GeneralPath) shape).curveTo(-212.0502, -346.05356, -215.7982, -352.38358, -219.8742, -358.46255);
        ((GeneralPath) shape).curveTo(-224.56421, -365.45755, -229.6492, -372.19754, -234.7702, -378.88855);
        ((GeneralPath) shape).curveTo(-236.7062, -381.41656, -237.73221, -383.97855, -237.4772, -387.13055);
        ((GeneralPath) shape).curveTo(-236.8652, -394.70856, -236.6942, -402.34555, -235.6362, -409.85855);
        ((GeneralPath) shape).curveTo(-234.1602, -420.33655, -232.1132, -430.73755, -230.1252, -441.13556);
        ((GeneralPath) shape).curveTo(-229.7352, -443.17856, -228.9102, -445.40656, -227.5902, -446.95755);
        ((GeneralPath) shape).curveTo(-221.29419, -454.35455, -213.43219, -458.83856, -203.41919, -458.31656);
        ((GeneralPath) shape).curveTo(-196.64319, -457.96356, -189.79019, -457.76956, -183.14319, -456.56055);
        ((GeneralPath) shape).curveTo(-168.18518, -453.83856, -153.29219, -450.71555, -138.45119, -447.40454);
        ((GeneralPath) shape).curveTo(-124.65318, -444.32553, -111.135185, -440.21555, -98.01219, -434.89755);
        ((GeneralPath) shape).curveTo(-96.36619, -434.23056, -94.44719, -433.86755, -93.72219, -431.34454);
        ((GeneralPath) shape).curveTo(-102.75719, -427.55453, -111.95719, -425.24255, -121.02019, -422.61053);
        ((GeneralPath) shape).curveTo(-129.8812, -420.03854, -138.85118, -417.73154, -147.8982, -415.94254);
        ((GeneralPath) shape).curveTo(-157.0662, -414.12955, -166.38719, -413.09253, -175.64119, -411.71555);
        ((GeneralPath) shape).curveTo(-174.78918, -410.99854, -174.00519, -410.81955, -173.2132, -410.77054);
        ((GeneralPath) shape).curveTo(-161.42819, -410.03754, -149.9262, -412.34055, -138.42319, -414.27353);
        ((GeneralPath) shape).curveTo(-121.00619, -417.20053, -103.77919, -421.07553, -86.748184, -425.77353);
        ((GeneralPath) shape).curveTo(-84.247185, -426.46353, -82.07719, -426.38254, -79.73618, -425.09753);
        ((GeneralPath) shape).curveTo(-68.27818, -418.80853, -56.91918, -412.40253, -47.501183, -403.11954);
        ((GeneralPath) shape).curveTo(-46.595184, -402.22653, -45.40618, -401.61954, -43.457184, -400.25653);
        ((GeneralPath) shape).curveTo(-43.781185, -402.53854, -43.730183, -403.87854, -44.175182, -405.02753);
        ((GeneralPath) shape).curveTo(-46.38618, -410.7455, -50.179184, -415.3445, -54.85018, -419.2065);
        ((GeneralPath) shape).curveTo(-58.40918, -422.1505, -62.160183, -424.8615, -65.75318, -427.7665);
        ((GeneralPath) shape).curveTo(-66.66218, -428.5015, -67.29118, -429.5835, -68.40718, -430.9415);
        ((GeneralPath) shape).curveTo(-49.81218, -436.8555, -32.273182, -443.4205, -15.445179, -451.7575);
        ((GeneralPath) shape).curveTo(1.3918209, -460.1005, 17.580822, -469.4815, 32.59782, -480.8725);
        ((GeneralPath) shape).curveTo(47.60582, -492.2565, 60.22782, -506.0915, 72.98082, -519.8925);
        ((GeneralPath) shape).curveTo(76.82182, -519.49054, 80.31982, -519.13654, 83.81582, -518.7555);
        ((GeneralPath) shape).curveTo(87.32782, -518.3735, 90.83682, -517.9595, 94.34782, -517.5705);
        ((GeneralPath) shape).curveTo(98.128815, -517.1515, 101.90182, -516.6125, 105.69382, -516.3715);
        ((GeneralPath) shape).curveTo(109.21682, -516.1485, 112.76182, -516.2965, 116.294815, -516.19354);
        ((GeneralPath) shape).curveTo(119.64581, -516.0955, 123.11781, -516.94653, 126.948814, -515.39954);
        ((GeneralPath) shape).curveTo(124.09482, -511.24252, 121.02281, -508.20154, 117.767815, -505.37354);
        ((GeneralPath) shape).curveTo(113.254814, -501.45255, 108.59281, -497.70255, 104.00082, -493.87152);
        ((GeneralPath) shape).curveTo(102.98682, -493.02454, 101.75882, -492.28152, 102.25781, -490.20853);
        ((GeneralPath) shape).curveTo(104.28381, -490.13452, 106.42681, -489.86252, 108.53481, -490.03354);
        ((GeneralPath) shape).curveTo(110.682816, -490.20755, 112.806816, -490.77054, 114.921814, -491.24854);
        ((GeneralPath) shape).curveTo(117.307816, -491.78754, 119.699814, -492.32953, 122.03781, -493.04153);
        ((GeneralPath) shape).curveTo(124.10381, -493.67154, 126.11981, -494.48654, 128.11981, -495.31055);
        ((GeneralPath) shape).curveTo(129.9378, -496.05954, 131.33081, -498.02155, 134.16281, -497.64655);
        ((GeneralPath) shape).curveTo(133.7738, -496.11655, 133.64781, -495.06955, 133.24881, -494.14053);
        ((GeneralPath) shape).curveTo(127.34881, -480.38754, 120.78781, -466.97052, 112.90581, -454.22653);
        ((GeneralPath) shape).curveTo(106.45881, -443.80054, 99.58381, -433.70654, 90.80981, -425.03455);
        ((GeneralPath) shape).curveTo(89.47181, -423.71155, 88.33481, -422.14355, 87.325806, -420.54855);
        ((GeneralPath) shape).curveTo(86.85081, -419.79855, 86.9008, -418.71555, 86.48981, -416.67957);
        ((GeneralPath) shape).curveTo(95.049805, -419.85757, 102.813805, -421.97757, 109.65381, -426.61456);
        ((GeneralPath) shape).curveTo(118.52481, -432.62857, 126.12281, -439.91956, 132.70981, -448.33356);
        ((GeneralPath) shape).curveTo(135.72382, -452.18457, 138.82881, -455.96756, 141.9528, -459.73157);
        ((GeneralPath) shape).curveTo(142.6988, -460.62958, 143.6858, -461.32758, 145.67581, -463.12256);
        ((GeneralPath) shape).curveTo(143.27982, -450.71356, 141.02881, -439.83655, 139.15181, -428.89557);
        ((GeneralPath) shape).curveTo(138.50981, -425.15756, 136.72081, -423.15256, 133.2528, -422.01758);
        ((GeneralPath) shape).curveTo(124.47581, -419.14557, 115.78081, -416.02557, 107.00481, -413.1526);
        ((GeneralPath) shape).curveTo(81.187805, -404.70358, 55.322807, -396.43558, 28.826805, -390.2816);
        ((GeneralPath) shape).curveTo(4.934805, -384.7316, -19.260197, -381.02258, -43.719193, -380.06458);
        ((GeneralPath) shape).curveTo(-65.70819, -379.20358, -87.76619, -379.39456, -109.77319, -379.9546);
        ((GeneralPath) shape).curveTo(-126.61119, -380.3826, -143.38919, -382.3466, -159.8622, -386.18658);
        ((GeneralPath) shape).curveTo(-166.1292, -387.64658, -172.3542, -389.2876, -178.5972, -390.84958);
        ((GeneralPath) shape).curveTo(-177.0022, -388.03857, -173.9752, -387.4246, -171.3092, -386.47256);
        ((GeneralPath) shape).curveTo(-157.71521, -381.61755, -143.7222, -378.26056, -129.4762, -376.02057);
        ((GeneralPath) shape).curveTo(-111.185196, -373.14456, -92.70819, -372.25656, -74.24919, -371.49158);
        ((GeneralPath) shape).curveTo(-46.76219, -370.35358, -19.359192, -371.37057, 7.8368073, -375.96658);
        ((GeneralPath) shape).curveTo(30.626808, -379.81857, 53.162807, -384.72958, 75.23981, -391.6526);
        ((GeneralPath) shape).curveTo(93.41681, -397.3526, 111.09581, -404.31058, 128.36281, -412.3436);
        ((GeneralPath) shape).curveTo(130.4488, -413.3146, 132.4288, -414.9096, 135.1678, -414.3706);
        ((GeneralPath) shape).curveTo(135.2278, -413.3866, 135.4718, -412.55762, 135.2928, -411.8326);
        ((GeneralPath) shape).curveTo(133.0178, -402.6076, 130.6388, -393.4086, 128.3738, -384.1806);
        ((GeneralPath) shape).curveTo(126.7578, -377.5946, 125.0758, -371.0146, 123.7858, -364.3616);
        ((GeneralPath) shape).curveTo(122.385796, -357.1456, 120.5438, -350.0826, 118.2538, -343.0996);
        ((GeneralPath) shape).curveTo(117.2278, -339.97162, 115.6928, -338.0606, 112.4078, -337.0906);
        ((GeneralPath) shape).curveTo(94.914795, -331.9276, 77.190796, -327.9646, 59.0588, -325.82062);
        ((GeneralPath) shape).curveTo(44.4408, -324.09262, 29.7648, -324.1216, 15.084801, -323.8796);
        ((GeneralPath) shape).curveTo(-14.689199, -323.38962, -44.0412, -326.9796, -73.1352, -332.9226);
        ((GeneralPath) shape).curveTo(-116.754196, -341.83362, -158.4292, -356.4786, -198.44519, -375.9176);
        ((GeneralPath) shape).curveTo(-199.33719, -376.35062, -200.34119, -377.0406, -201.53918, -375.4906);
        ((GeneralPath) shape).curveTo(-199.18619, -372.0976, -195.43819, -370.3166, -191.91219, -368.5996);
        ((GeneralPath) shape).curveTo(-179.2172, -362.4186, -166.58418, -356.0306, -153.54619, -350.64362);
        ((GeneralPath) shape).curveTo(-109.53219, -332.45862, -63.72419, -321.30762, -16.226181, -317.65262);
        ((GeneralPath) shape).curveTo(7.1008186, -315.85663, 30.511818, -316.06763, 53.875816, -317.49063);
        ((GeneralPath) shape).curveTo(59.547817, -317.83563, 65.184814, -318.95163, 70.80582, -319.90662);
        ((GeneralPath) shape).curveTo(83.69282, -322.09662, 96.25781, -325.49762, 108.52682, -330.0386);
        ((GeneralPath) shape).curveTo(110.098816, -330.6196, 111.809814, -332.2606, 114.058815, -330.4606);
        ((GeneralPath) shape).curveTo(113.33981, -327.9876, 112.709816, -325.3826, 111.82881, -322.8646);
        ((GeneralPath) shape).curveTo(105.09581, -303.63858, 98.28381, -284.4396, 91.55281, -265.2126);
        ((GeneralPath) shape).curveTo(82.57581, -239.56758, 73.09581, -214.11859, 62.69981, -189.00458);
        ((GeneralPath) shape).curveTo(57.30081, -175.96259, 52.05981, -162.82858, 48.38481, -149.14658);
        ((GeneralPath) shape).curveTo(44.222813, -133.65958, 40.28781, -118.14358, 38.95381, -102.07458);
        ((GeneralPath) shape).curveTo(38.01081, -90.703575, 36.626812, -79.368576, 35.60781, -68.00258);
        ((GeneralPath) shape).curveTo(35.29481, -64.51758, 35.30381, -60.96558, 35.57281, -57.47558);
        ((GeneralPath) shape).curveTo(36.07181, -51.03758, 36.87181, -44.623577, 37.58881, -37.788578);
        ((GeneralPath) shape).curveTo(32.94781, -38.812576, 30.87081, -43.96058, 25.52581, -43.91858);
        ((GeneralPath) shape).curveTo(25.63381, -36.67858, 28.20281, -30.066578, 29.291811, -22.85458);
        ((GeneralPath) shape).curveTo(23.494812, -22.98058, 19.29781, -28.08358, 12.9698105, -26.55158);
        ((GeneralPath) shape).curveTo(18.329811, -18.72258, 27.15981, -15.27058, 33.06581, -7.6315804);
        ((GeneralPath) shape).curveTo(30.550812, -7.6315804, 28.946812, -7.56858, 27.348812, -7.64058);
        ((GeneralPath) shape).curveTo(3.9348125, -8.6955805, -19.387188, -7.69558, -42.586185, -4.33558);
        ((GeneralPath) shape).curveTo(-63.286186, -1.33758, -83.943184, 1.91542, -104.342186, 6.6344204);
        ((GeneralPath) shape).curveTo(-135.56418, 13.85742, -166.80418, 20.99842, -198.04019, 28.157421);
        ((GeneralPath) shape).curveTo(-199.55519, 28.504421, -201.10619, 28.697422, -202.7862, 28.986422);
        ((GeneralPath) shape).curveTo(-202.6962, 28.197422, -202.76419, 27.792421, -202.6212, 27.694422);
        ((GeneralPath) shape).curveTo(-198.1432, 24.625422, -193.6962, 21.506422, -189.1362, 18.562422);
        ((GeneralPath) shape).curveTo(-184.0062, 15.251422, -180.0362, 10.841421, -176.6592, 5.8524218);
        ((GeneralPath) shape).curveTo(-176.1662, 5.1244216, -176.1472, 4.074422, -175.46219, 1.4834218);
        ((GeneralPath) shape).curveTo(-187.19418, 7.416422, -197.77019, 12.109423, -208.86618, 15.548422);
        ((GeneralPath) shape).curveTo(-220.35118, 19.107422, -231.97118, 21.646421, -244.00818, 22.11642);
        ((GeneralPath) shape).lineTo(-243.88318, 22.063421);
        ((GeneralPath) shape).curveTo(-239.89719, 19.251421, -235.75517, 16.63142, -231.96417, 13.576421);
        ((GeneralPath) shape).curveTo(-227.29517, 9.813421, -225.17818, 4.742421, -225.31218, -1.965579);
        ((GeneralPath) shape).curveTo(-235.61919, 2.0384212, -245.67818, 5.028421, -255.94019, 7.2974205);
        ((GeneralPath) shape).curveTo(-266.4232, 9.61542, -276.8372, 12.508421, -289.0542, 11.74642);
        ((GeneralPath) shape).curveTo(-286.3942, 9.41342, -284.5672, 7.94942, -282.9072, 6.3154197);
        ((GeneralPath) shape).curveTo(-281.1712, 4.6064196, -279.4302, 2.8544197, -277.9992, 0.89741945);
        ((GeneralPath) shape).curveTo(-276.6412, -0.95958054, -273.7202, -1.5985806, -273.4572, -4.9285808);
        ((GeneralPath) shape).curveTo(-274.99622, -4.9285808, -276.25122, -4.9365807, -277.5072, -4.927581);
        ((GeneralPath) shape).curveTo(-285.1052, -4.867581, -292.75922, -4.1985807, -300.2872, -4.892581);
        ((GeneralPath) shape).curveTo(-310.2762, -5.811581, -320.2092, -7.562581, -330.0912, -9.363581);
        ((GeneralPath) shape).curveTo(-360.63818, -14.931581, -390.4152, -23.239582, -419.18118, -35.023582);
        ((GeneralPath) shape).curveTo(-430.0062, -39.45758, -439.96817, -45.58058, -450.30017, -50.978584);
        ((GeneralPath) shape).curveTo(-451.15518, -51.424583, -452.43817, -51.757584, -452.09018, -53.618584);
        ((GeneralPath) shape).curveTo(-449.56317, -54.815582, -445.61417, -54.238583, -444.30118, -58.508583);
        ((GeneralPath) shape).curveTo(-446.35117, -60.693584, -448.5782, -63.015583, -450.72418, -65.409584);
        ((GeneralPath) shape).curveTo(-451.01517, -65.73358, -450.90518, -66.41759, -450.98218, -66.94158);
        ((GeneralPath) shape).curveTo(-449.56717, -67.61858, -448.15018, -68.296585, -446.60117, -69.03858);
        ((GeneralPath) shape).curveTo(-446.20816, -72.657585, -445.78915, -76.14158, -445.45816, -79.63458);
        ((GeneralPath) shape).curveTo(-444.56317, -89.100586, -443.64615, -98.56458, -442.85516, -108.03958);
        ((GeneralPath) shape).curveTo(-442.38116, -113.72058, -442.20016, -119.42658, -441.75818, -125.11158);
        ((GeneralPath) shape).curveTo(-441.20917, -132.15659, -440.00317, -139.19058, -440.00018, -146.22958);
        ((GeneralPath) shape).curveTo(-439.99118, -167.71158, -437.51218, -189.12558, -438.4232, -210.62457);
        ((GeneralPath) shape).curveTo(-438.9982, -224.19957, -438.94818, -237.82857, -440.1882, -251.34058);
        ((GeneralPath) shape).curveTo(-442.0512, -271.62756, -443.1422, -291.98157, -445.9442, -312.20056);
        ((GeneralPath) shape).curveTo(-448.0302, -327.25858, -449.2922, -342.42657, -452.4252, -357.33957);
        ((GeneralPath) shape).curveTo(-452.9102, -359.64557, -452.80222, -362.07455, -452.9422, -364.08057);
        ((GeneralPath) shape).curveTo(-450.2222, -366.14157, -447.6962, -365.58356, -445.3112, -365.60156);
        ((GeneralPath) shape).curveTo(-436.8822, -365.66656, -428.45117, -365.59555, -420.02118, -365.63257);
        ((GeneralPath) shape).curveTo(-400.0622, -365.72058, -380.45117, -368.22858, -361.39017, -374.33456);
        ((GeneralPath) shape).curveTo(-348.89017, -378.33957, -337.08817, -383.78357, -326.62418, -391.84155);
        ((GeneralPath) shape).curveTo(-325.69818, -392.55457, -324.06616, -393.06354, -324.9882, -395.14655);
        ((GeneralPath) shape).curveTo(-326.4642, -394.36255, -327.90518, -393.67953, -329.26718, -392.86154);
        ((GeneralPath) shape).curveTo(-341.74017, -385.37054, -355.27417, -380.49753, -369.33218, -377.14655);
        ((GeneralPath) shape).curveTo(-396.8072, -370.59854, -424.7212, -369.73755, -452.78317, -371.41254);
        ((GeneralPath) shape).curveTo(-453.50616, -371.45554, -454.19516, -372.08752, -454.88016, -372.43555);
        ((GeneralPath) shape).curveTo(-455.22314, -373.28055, -455.62814, -373.99954, -455.81216, -374.77054);
        ((GeneralPath) shape).curveTo(-460.14417, -393.00153, -464.46616, -411.23453, -468.72217, -429.48254);
        ((GeneralPath) shape).curveTo(-468.93417, -430.39554, -468.52716, -431.45255, -468.36618, -432.79855);
        ((GeneralPath) shape).curveTo(-465.57117, -431.98956, -463.24118, -431.31454, -460.9112, -430.64255);

        g.setPaint(new Color(0xF5E8AA));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_12
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1116.8f, 1167.3f));

        // _0_0_0_13

        // _0_0_0_13_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(2.012, -3.173, 1.437, -5.56, -0.264, -7.471);
        ((GeneralPath) shape).curveTo(-2.406, -9.876, -4.674, -12.32, -7.325, -14.094);
        ((GeneralPath) shape).curveTo(-18.640999, -21.667, -30.935001, -27.314999, -43.865, -31.51);
        ((GeneralPath) shape).curveTo(-48.243, -32.931, -52.850002, -33.588, -57.508003, -33.131);
        ((GeneralPath) shape).curveTo(-64.253006, -32.47, -69.987, -30.065, -73.656006, -23.871);
        ((GeneralPath) shape).curveTo(-72.381004, -20.632, -69.728004, -19.156, -67.295006, -17.536);
        ((GeneralPath) shape).curveTo(-54.924004, -9.296999, -40.951004, -5.048999, -26.744007, -1.4159985);
        ((GeneralPath) shape).curveTo(-17.978008, 0.8250015, -9.110006, 0.9190016, -7.6293945E-6, 1.5497208E-6);

        g.setPaint(new Color(0xF77959));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_13
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1205.8f, 1027.1f));

        // _0_0_0_14

        // _0_0_0_14_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(11.773, 3.539, 23.433, 6.255, 35.794, 10.367);
        ((GeneralPath) shape).curveTo(33.071, -0.04300022, 30.706, -9.0859995, 28.336998, -18.140999);
        ((GeneralPath) shape).curveTo(22.811998, -16.504, 5.8989983, -5.6659985, -1.9073486E-6, 1.9073486E-6);

        g.setPaint(WHITE);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_14
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 967.65f, 1187.5f));

        // _0_0_0_15

        // _0_0_0_15_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-2.038, 0.918, -4.448, 0.54, -6.038, -0.947);
        ((GeneralPath) shape).curveTo(-8.71, -3.445, -9.616, -8.116, -8.071, -11.417999);
        ((GeneralPath) shape).curveTo(-6.484, -14.806999, -1.5669999, -15.657999, 0.69299984, -12.665999);
        ((GeneralPath) shape).curveTo(2.0909998, -10.813999, 2.751, -8.403999, 3.202, -7.4229994);
        ((GeneralPath) shape).curveTo(3.2989998, -3.0179992, 2.21, -0.9949994, 0.0, 4.7683716E-7);
        ((GeneralPath) shape).moveTo(68.46, 93.072);
        ((GeneralPath) shape).curveTo(66.218, 104.542, 63.159, 115.831, 58.192, 126.489);
        ((GeneralPath) shape).curveTo(57.165, 128.691, 56.012, 130.89099, 54.565002, 132.83);
        ((GeneralPath) shape).curveTo(51.343002, 137.149, 46.850002, 138.896, 41.625004, 137.737);
        ((GeneralPath) shape).curveTo(38.769005, 137.104, 35.786003, 136.046, 33.435005, 134.372);
        ((GeneralPath) shape).curveTo(29.924006, 131.873, 26.705006, 128.86499, 23.740005, 125.716995);
        ((GeneralPath) shape).curveTo(14.236006, 115.617, 8.138005, 103.517, 3.9930058, 90.43199);
        ((GeneralPath) shape).curveTo(-0.35299444, 76.71199, -4.3849945, 62.89299, -8.513994, 49.10599);
        ((GeneralPath) shape).curveTo(-8.783995, 48.20599, -8.703994, 47.200993, -8.817994, 45.88699);
        ((GeneralPath) shape).curveTo(2.7750063, 52.56099, 4.293006, 52.99099, 17.509007, 53.13099);
        ((GeneralPath) shape).curveTo(16.390007, 50.70199, 15.642007, 49.042988, 14.865006, 47.397987);
        ((GeneralPath) shape).curveTo(10.209006, 37.54199, 13.604007, 28.072987, 23.518005, 23.788988);
        ((GeneralPath) shape).curveTo(29.735004, 21.101988, 36.126007, 20.662989, 42.549004, 23.246988);
        ((GeneralPath) shape).curveTo(43.992004, 23.826988, 45.445004, 24.382988, 47.260002, 25.093988);
        ((GeneralPath) shape).curveTo(50.561, 17.642988, 50.582, 10.008988, 51.512, 1.9389877);
        ((GeneralPath) shape).curveTo(53.800003, 2.6609879, 55.895, 3.0689878, 57.761, 3.9549878);
        ((GeneralPath) shape).curveTo(64.846, 7.3209877, 72.013, 10.577988, 77.855, 15.401987);
        ((GeneralPath) shape).curveTo(80.588005, 24.535988, 78.969, 33.244987, 77.672005, 41.737988);
        ((GeneralPath) shape).curveTo(75.047005, 58.91699, 71.79401, 76.00799, 68.46001, 93.068985);
        ((GeneralPath) shape).moveTo(228.18001, 45.315987);
        ((GeneralPath) shape).curveTo(225.60101, 46.540985, 223.014, 46.582985, 220.514, 44.93099);
        ((GeneralPath) shape).curveTo(216.10501, 42.01799, 216.408, 31.842987, 221.24101, 29.462988);
        ((GeneralPath) shape).curveTo(223.89502, 28.155989, 226.34702, 27.976988, 228.878, 29.527988);
        ((GeneralPath) shape).curveTo(231.92401, 31.394989, 233.07701, 34.266987, 233.21701, 37.29699);
        ((GeneralPath) shape).curveTo(233.11101, 41.27399, 231.35501, 43.80899, 228.18001, 45.31599);
        ((GeneralPath) shape).moveTo(341.82, 31.466991);
        ((GeneralPath) shape).curveTo(337.86002, 48.13299, 332.099, 64.16499, 325.59802, 80.02199);
        ((GeneralPath) shape).curveTo(317.959, 98.65799, 306.739, 114.66199, 293.43802, 129.61398);
        ((GeneralPath) shape).curveTo(277.89203, 147.08998, 260.09903, 161.46698, 239.33202, 172.14798);
        ((GeneralPath) shape).curveTo(235.74402, 173.99397, 231.93402, 175.63197, 228.03601, 176.60599);
        ((GeneralPath) shape).curveTo(219.64201, 178.70299, 214.81201, 175.67299, 213.35602, 167.20999);
        ((GeneralPath) shape).curveTo(212.07002, 159.73799, 210.89001, 152.14899, 210.76802, 144.594);
        ((GeneralPath) shape).curveTo(210.47803, 126.676994, 210.83502, 108.74999, 210.96303, 90.826996);
        ((GeneralPath) shape).curveTo(210.97102, 89.829994, 210.79402, 88.593994, 212.58803, 88.141);
        ((GeneralPath) shape).curveTo(221.52203, 95.432, 231.27502, 100.639, 244.06503, 95.791);
        ((GeneralPath) shape).curveTo(243.23604, 94.484, 242.78703, 93.542, 242.13103, 92.78);
        ((GeneralPath) shape).curveTo(234.60503, 84.038, 234.99002, 73.992, 242.76402, 65.925);
        ((GeneralPath) shape).curveTo(250.11203, 58.300003, 262.18103, 61.128002, 266.109, 67.962006);
        ((GeneralPath) shape).curveTo(267.027, 69.560005, 268.032, 71.108, 269.6, 73.66301);
        ((GeneralPath) shape).curveTo(272.723, 69.99901, 273.775, 66.63201, 274.898, 63.33001);
        ((GeneralPath) shape).curveTo(275.944, 60.25101, 276.996, 57.15601, 277.737, 53.99501);
        ((GeneralPath) shape).curveTo(278.539, 50.57001, 279.166, 47.08001, 279.531, 43.58201);
        ((GeneralPath) shape).curveTo(279.867, 40.35201, 279.94, 37.06601, 279.78702, 33.820007);
        ((GeneralPath) shape).curveTo(279.626, 30.433006, 279.057, 27.066008, 278.605, 23.153008);
        ((GeneralPath) shape).curveTo(282.177, 22.992008, 285.11902, 22.818008, 288.065, 22.737007);
        ((GeneralPath) shape).curveTo(292.949, 22.604008, 297.861, 22.814007, 302.716, 22.375008);
        ((GeneralPath) shape).curveTo(314.177, 21.338007, 325.486, 22.339008, 336.754, 24.303007);
        ((GeneralPath) shape).curveTo(338.578, 24.621008, 340.368, 25.133007, 342.514, 25.635008);
        ((GeneralPath) shape).curveTo(342.268, 27.793007, 342.245, 29.678009, 341.82, 31.467007);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_15
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1376.4f, 1464.5f));

        // _0_0_0_16

        // _0_0_0_16_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(4.286, 4.138, 7.21, 9.664, 8.22, 15.535);
        ((GeneralPath) shape).curveTo(0.4420004, 15.615, -7.3359995, 15.695, -15.114999, 15.775);
        ((GeneralPath) shape).curveTo(-17.658998, 20.885, -16.442999, 27.223999, -13.460999, 32.092);
        ((GeneralPath) shape).curveTo(-10.477999, 36.96, -5.9669986, 40.663998, -1.5419989, 44.271);
        ((GeneralPath) shape).curveTo(17.294003, 59.625, 37.436, 75.569, 61.503, 78.929);
        ((GeneralPath) shape).curveTo(40.907997, 59.406, 30.38, 31.362999, 25.427998, 3.4209976);
        ((GeneralPath) shape).curveTo(20.474998, -24.521002, 20.450996, -53.086002, 17.291998, -81.287);
        ((GeneralPath) shape).curveTo(13.171998, -57.219, 13.827998, -32.622, 14.496998, -8.213005);
        ((GeneralPath) shape).curveTo(10.266998, -9.724005, 6.473998, -12.439005, 3.6799974, -15.956005);
        ((GeneralPath) shape).curveTo(3.8379974, -9.901005, 5.433997, -3.8880053, 8.300997, 1.4489956);
        ((GeneralPath) shape).lineTo(-2.861023E-6, -4.4107437E-6);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCC8564));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_16
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1075.2f, 1150.2f));

        // _0_0_0_17

        // _0_0_0_17_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-9.356, -3.238, -18.396, -7.552, -27.418, -11.9);
        ((GeneralPath) shape).curveTo(-24.171999, -14.379999, -20.217999, -15.577, -15.820999, -16.008);
        ((GeneralPath) shape).curveTo(-11.162999, -16.465, -6.555999, -15.808, -2.1779995, -14.386999);
        ((GeneralPath) shape).curveTo(10.752001, -10.191999, 23.046001, -4.5439987, 34.362, 3.0290012);
        ((GeneralPath) shape).curveTo(37.013, 4.8030014, 39.281, 7.247001, 41.423, 9.652001);
        ((GeneralPath) shape).curveTo(41.607, 9.859001, 41.771, 10.075002, 41.927002, 10.293001);
        ((GeneralPath) shape).curveTo(27.745003, 8.159001, 13.799002, 4.776001, 3.8146973E-6, 9.536743E-7);

        g.setPaint(new Color(0xC44727));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_17
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -529.15f, -264.58f));

        // _0_0_0_18

        // _0_0_0_18_0
        g.setComposite(AlphaComposite.getInstance(3, 0.39999f * origAlpha));

        // _0_0_0_18_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1959.2f, 597.8f));

        // _0_0_0_18_0_0_0

        // _0_0_0_18_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-27.846, 24.44, -59.867, 43.568, -89.724, 65.506);
        ((GeneralPath) shape).curveTo(-112.459, 82.211, -133.94, 100.547, -155.397, 118.864);
        ((GeneralPath) shape).curveTo(-149.79001, 99.576, -140.104, 81.485, -127.16, 66.125);
        ((GeneralPath) shape).curveTo(-139.412, 75.270996, -152.71, 84.224, -167.244, 88.127);
        ((GeneralPath) shape).curveTo(-198.65001, 109.063995, -232.965, 126.517, -270.08398, 132.368);
        ((GeneralPath) shape).curveTo(-257.163, 129.465, -248.85098, 115.97099, -243.02399, 103.658);
        ((GeneralPath) shape).curveTo(-237.61398, 92.224, -232.64499, 80.584, -227.15799, 69.187);
        ((GeneralPath) shape).curveTo(-216.06099, 46.138996, -202.70099, 23.916996, -185.00598, 5.444996);
        ((GeneralPath) shape).curveTo(-193.74799, 22.848995, -198.75098, 42.120995, -199.57898, 61.579994);
        ((GeneralPath) shape).curveTo(-164.65198, 5.9409943, -99.95998, -22.315002, -50.808975, -65.90001);
        ((GeneralPath) shape).curveTo(-61.576973, -44.83901, -75.33298, -25.30801, -91.53697, -8.076008);
        ((GeneralPath) shape).curveTo(-65.52898, -22.701008, -42.44897, -42.507008, -24.044975, -65.994);
        ((GeneralPath) shape).curveTo(-31.842976, -50.242004, -40.982975, -35.270004, -51.175976, -21.031002);
        ((GeneralPath) shape).curveTo(-50.727974, -14.699002, -52.286976, -8.215002, -55.705975, -2.8580017);
        ((GeneralPath) shape).curveTo(-3.765976, -36.099003, 47.764027, -72.454, 84.32402, -122.118004);
        ((GeneralPath) shape).curveTo(66.80102, -75.313, 37.550022, -32.953003, -0.008979797, 0.011993408);
        ((GeneralPath) shape).moveTo(-319.15897, 181.652);
        ((GeneralPath) shape).curveTo(-316.06097, 197.872, -311.85898, 213.858, -307.66098, 229.82799);
        ((GeneralPath) shape).curveTo(-295.67798, 275.41498, -283.69498, 321.00098, -271.71198, 366.58798);
        ((GeneralPath) shape).curveTo(-289.50098, 324.34198, -304.179, 280.862, -318.52698, 237.32799);
        ((GeneralPath) shape).curveTo(-324.74896, 218.44798, -330.92596, 199.49599, -334.835, 180.00499);
        ((GeneralPath) shape).curveTo(-340.356, 152.484, -341.28198, 124.275986, -342.192, 96.22099);
        ((GeneralPath) shape).curveTo(-342.65598, 81.88799, -343.12, 67.51399, -341.86798, 53.228992);
        ((GeneralPath) shape).curveTo(-338.11, 10.319992, -318.857, -30.203007, -292.58398, -64.33101);
        ((GeneralPath) shape).curveTo(-307.107, -27.34401, -317.055, 11.436989, -322.13098, 50.84899);
        ((GeneralPath) shape).curveTo(-327.72498, 94.28899, -327.37598, 138.63998, -319.159, 181.659);
        ((GeneralPath) shape).moveTo(-457.739, -117.871);
        ((GeneralPath) shape).curveTo(-454.50403, -80.403, -453.57202, -42.737, -454.94803, -5.151001);
        ((GeneralPath) shape).curveTo(-455.55704, 11.471998, -456.61703, 28.082, -456.81503, 44.715);
        ((GeneralPath) shape).curveTo(-457.88605, 134.478, -433.95102, 222.435, -410.20404, 309.005);
        ((GeneralPath) shape).curveTo(-407.20105, 319.95, -404.14105, 331.036, -398.43204, 340.845);
        ((GeneralPath) shape).curveTo(-484.42404, 206.745, -506.80203, 33.695007, -457.73904, -117.86499);
        ((GeneralPath) shape).moveTo(98.60098, 544.09503);
        ((GeneralPath) shape).curveTo(90.95398, 538.72504, 84.318985, 532.04504, 78.03798, 525.11505);
        ((GeneralPath) shape).curveTo(42.26398, 485.69507, 16.726978, 437.06506, 4.584976, 385.23505);
        ((GeneralPath) shape).curveTo(26.212976, 438.16605, 66.48097, 483.26205, 116.63498, 510.72504);
        ((GeneralPath) shape).curveTo(103.64498, 500.68903, 95.21298, 484.97003, 94.03698, 468.59705);
        ((GeneralPath) shape).curveTo(111.02898, 486.87805, 131.60898, 501.80905, 154.25998, 512.291);
        ((GeneralPath) shape).curveTo(148.12997, 499.94302, 146.58798, 485.381, 149.99597, 472.02402);
        ((GeneralPath) shape).curveTo(159.46198, 504.794, 175.31197, 535.70703, 196.39497, 562.52);
        ((GeneralPath) shape).curveTo(162.62697, 563.398, 126.23598, 563.528, 98.599976, 544.104);
        ((GeneralPath) shape).moveTo(-321.90002, 429.654);
        ((GeneralPath) shape).curveTo(-310.618, 440.746, -299.33603, 451.839, -288.05502, 462.931);
        ((GeneralPath) shape).curveTo(-285.09802, 453.214, -284.562, 442.769, -286.51102, 432.8);
        ((GeneralPath) shape).curveTo(-272.941, 449.314, -259.37003, 465.82898, -245.80002, 482.344);
        ((GeneralPath) shape).curveTo(-255.63503, 449.26498, -262.695, 415.362, -266.88, 381.104);
        ((GeneralPath) shape).curveTo(-241.56201, 444.794, -207.675, 505.074, -166.42001, 559.804);
        ((GeneralPath) shape).curveTo(-203.945, 532.56104, -240.25002, 503.63702, -275.19, 473.148);
        ((GeneralPath) shape).curveTo(-271.622, 482.21802, -268.053, 491.28802, -264.48502, 500.358);
        ((GeneralPath) shape).curveTo(-276.37302, 491.212, -288.26, 482.065, -300.148, 472.919);
        ((GeneralPath) shape).curveTo(-293.67902, 484.31, -285.45502, 494.70102, -275.854, 503.613);
        ((GeneralPath) shape).curveTo(-301.13602, 493.672, -322.098, 473.229, -332.669, 448.20502);
        ((GeneralPath) shape).curveTo(-326.22202, 453.52402, -319.35602, 458.33502, -312.156, 462.579);
        ((GeneralPath) shape).lineTo(-321.901, 429.652);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-100.27002, 1105.7739);
        ((GeneralPath) shape).curveTo(-95.91702, 1105.418, -91.09802, 1105.195, -87.67002, 1107.8999);
        ((GeneralPath) shape).curveTo(-85.30102, 1109.7709, -84.07702, 1112.6919, -82.77802, 1115.4169);
        ((GeneralPath) shape).curveTo(-77.46302, 1126.5709, -69.345024, 1136.3749, -59.38002, 1143.6779);
        ((GeneralPath) shape).curveTo(-74.93002, 1143.7289, -90.30502, 1146.7048, -105.57102, 1149.6698);
        ((GeneralPath) shape).curveTo(-158.32703, 1159.9178, -211.08102, 1170.1658, -263.84103, 1180.4138);
        ((GeneralPath) shape).curveTo(-234.86703, 1163.4858, -212.13303, 1136.7698, -181.79904, 1122.4229);
        ((GeneralPath) shape).curveTo(-156.58005, 1110.4949, -128.07605, 1108.0438, -100.27104, 1105.7738);
        ((GeneralPath) shape).moveTo(-350.36102, 733.5238);
        ((GeneralPath) shape).curveTo(-355.19403, 738.4748, -361.015, 742.4578, -367.38004, 745.1708);
        ((GeneralPath) shape).curveTo(-383.79404, 752.1658, -402.91605, 750.33276, -419.57202, 743.9358);
        ((GeneralPath) shape).curveTo(-427.14102, 741.0298, -434.364, 737.2218, -441.03903, 732.6188);
        ((GeneralPath) shape).curveTo(-443.26004, 731.08777, -445.62305, 729.11176, -445.77203, 726.41876);
        ((GeneralPath) shape).curveTo(-445.90604, 723.99475, -444.17203, 721.8948, -442.41003, 720.2248);
        ((GeneralPath) shape).curveTo(-429.04803, 707.5668, -409.51904, 704.5048, -391.27902, 702.0378);
        ((GeneralPath) shape).curveTo(-377.98804, 700.2388, -364.69702, 698.4408, -351.406, 696.64276);
        ((GeneralPath) shape).curveTo(-349.36502, 696.36676, -347.174, 696.1138, -345.34302, 697.05676);
        ((GeneralPath) shape).curveTo(-343.83203, 697.83575, -342.812, 699.31775, -342.05002, 700.8368);
        ((GeneralPath) shape).curveTo(-336.67, 711.5668, -341.976, 724.9338, -350.36102, 733.5238);
        ((GeneralPath) shape).moveTo(-316.92902, 718.69183);
        ((GeneralPath) shape).curveTo(-315.27103, 710.85284, -313.364, 702.5418, -307.683, 696.8928);
        ((GeneralPath) shape).curveTo(-300.927, 690.1768, -290.56302, 688.91583, -281.03802, 688.79083);
        ((GeneralPath) shape).curveTo(-279.93903, 688.7758, -278.84402, 688.81384, -277.74802, 688.8258);
        ((GeneralPath) shape).curveTo(-281.81003, 696.2698, -284.26703, 704.5188, -285.575, 713.04083);
        ((GeneralPath) shape).curveTo(-288.397, 724.78186, -289.91202, 736.55383, -288.717, 748.8488);
        ((GeneralPath) shape).curveTo(-287.298, 763.4368, -284.04202, 778.8598, -271.36502, 787.86383);
        ((GeneralPath) shape).curveTo(-263.782, 793.2498, -256.01102, 794.81384, -248.88202, 791.74884);
        ((GeneralPath) shape).curveTo(-237.09702, 798.08887, -225.03702, 803.91486, -212.68903, 809.07086);
        ((GeneralPath) shape).curveTo(-212.74202, 811.10986, -213.13303, 813.08984, -213.72502, 815.0099);
        ((GeneralPath) shape).curveTo(-214.18602, 815.46387, -214.63303, 815.9319, -215.12903, 816.3559);
        ((GeneralPath) shape).curveTo(-222.68202, 822.8119, -231.38103, 827.3559, -240.05702, 832.0619);
        ((GeneralPath) shape).curveTo(-244.51802, 834.4829, -249.02702, 836.9559, -253.60602, 839.31287);
        ((GeneralPath) shape).curveTo(-268.518, 841.14685, -283.639, 841.2679, -298.578, 839.6719);
        ((GeneralPath) shape).curveTo(-297.07, 830.9269, -298.535, 821.69586, -302.677, 813.8479);
        ((GeneralPath) shape).curveTo(-307.603, 804.5159, -316.025, 797.3459, -320.658, 787.8659);
        ((GeneralPath) shape).curveTo(-327.947, 772.9479, -324.666, 755.2699, -321.22998, 739.0269);
        ((GeneralPath) shape).curveTo(-319.79697, 732.2489, -318.36298, 725.4699, -316.929, 718.6919);
        ((GeneralPath) shape).moveTo(-0.9589844, 808.4439);
        ((GeneralPath) shape).curveTo(5.1550155, 789.79694, 8.300015, 770.17993, 8.322016, 750.5569);
        ((GeneralPath) shape).curveTo(20.596016, 747.8399, 32.449017, 743.2289, 43.334015, 736.9389);
        ((GeneralPath) shape).curveTo(48.267014, 734.0869, 53.577015, 730.7629, 59.209015, 731.6279);
        ((GeneralPath) shape).lineTo(41.428017, 795.9509);
        ((GeneralPath) shape).curveTo(41.080017, 797.2099, 40.713017, 798.50793, 39.89702, 799.52893);
        ((GeneralPath) shape).curveTo(39.073017, 800.56195, 37.871017, 801.20996, 36.69302, 801.80994);
        ((GeneralPath) shape).curveTo(25.08302, 807.7219, 11.667021, 811.66095, -0.95898056, 808.4439);
        ((GeneralPath) shape).moveTo(-4.9019804, 830.2419);
        ((GeneralPath) shape).curveTo(9.3100195, 825.7859, 23.521019, 821.3299, 37.733017, 816.8739);
        ((GeneralPath) shape).curveTo(34.291016, 829.0459, 30.850018, 841.2189, 27.408016, 853.39087);
        ((GeneralPath) shape).curveTo(21.507015, 874.26086, 15.576016, 895.2159, 6.742016, 915.02386);
        ((GeneralPath) shape).curveTo(1.5720158, 926.6169, -4.565984, 937.75385, -9.902985, 949.2709);
        ((GeneralPath) shape).curveTo(-25.902985, 983.79785, -34.507984, 1021.30286, -40.371986, 1058.9009);
        ((GeneralPath) shape).curveTo(-39.336987, 1023.7419, -38.28499, 988.42285, -31.980988, 953.82086);
        ((GeneralPath) shape).curveTo(-24.418987, 912.3019, -9.3629875, 872.20886, -4.901987, 830.24084);
        ((GeneralPath) shape).moveTo(-433.68198, 1040.5608);
        ((GeneralPath) shape).curveTo(-425.43698, 1041.7518, -417.36597, 1037.6158, -410.59897, 1032.7588);
        ((GeneralPath) shape).curveTo(-399.20297, 1024.5787, -389.58096, 1013.9428, -382.57996, 1001.7868);
        ((GeneralPath) shape).curveTo(-381.81897, 1021.6728, -387.96695, 1041.7578, -399.72894, 1057.8098);
        ((GeneralPath) shape).curveTo(-402.31995, 1061.3458, -405.37494, 1064.8348, -409.50696, 1066.2988);
        ((GeneralPath) shape).curveTo(-412.27896, 1067.2798, -415.31497, 1067.2578, -418.22195, 1066.8208);
        ((GeneralPath) shape).curveTo(-427.78696, 1065.3848, -436.23694, 1059.6688, -443.09195, 1052.8448);
        ((GeneralPath) shape).curveTo(-455.86594, 1040.1268, -464.17194, 1023.00684, -466.25394, 1005.10187);
        ((GeneralPath) shape).curveTo(-461.17694, 1011.66486, -457.83795, 1019.39886, -453.16693, 1026.2568);
        ((GeneralPath) shape).curveTo(-448.49692, 1033.1149, -441.89392, 1039.3738, -433.68195, 1040.5608);
        ((GeneralPath) shape).moveTo(-244.24194, 1074.9768);
        ((GeneralPath) shape).curveTo(-231.87994, 1073.2478, -221.16495, 1065.8168, -211.03795, 1058.5198);
        ((GeneralPath) shape).curveTo(-198.50494, 1049.4897, -185.96295, 1040.2438, -175.65594, 1028.7388);
        ((GeneralPath) shape).curveTo(-174.69795, 1054.5918, -190.28494, 1080.3168, -213.64494, 1091.4348);
        ((GeneralPath) shape).curveTo(-226.60895, 1097.6038, -243.46094, 1098.8868, -254.23494, 1089.3978);
        ((GeneralPath) shape).curveTo(-260.31693, 1084.0419, -263.42896, 1076.2609, -267.31094, 1069.0679);
        ((GeneralPath) shape).curveTo(-261.10693, 1073.9608, -252.25694, 1076.0969, -244.24194, 1074.9769);
        ((GeneralPath) shape).moveTo(-274.51193, 1058.752);
        ((GeneralPath) shape).curveTo(-271.54993, 1061.747, -269.32794, 1065.329, -267.31094, 1069.068);
        ((GeneralPath) shape).curveTo(-270.67496, 1066.415, -273.27493, 1062.963, -274.51193, 1058.752);

        g.setPaint(new Color(0xF5F5F5));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_18_0_0_0

        g.setTransform(transformations.pop()); // _0_0_0_18
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1660.5f, 850.61f));

        // _0_0_0_19

        // _0_0_0_19_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-7.376, 5.622, -15.986, 9.615, -25.042, 11.614);
        ((GeneralPath) shape).curveTo(-23.452, 20.696, -11.941999, 24.316, -7.5650005, 32.432);
        ((GeneralPath) shape).curveTo(-7.3120008, 32.899998, -7.0790005, 33.429, -7.1990004, 33.947);
        ((GeneralPath) shape).curveTo(-7.3760004, 34.706997, -8.205, 35.091, -8.936001, 35.365997);
        ((GeneralPath) shape).curveTo(-15.224001, 37.736996, -22.507, 40.054996, -28.376001, 36.781);
        ((GeneralPath) shape).curveTo(-30.499, 35.598, -32.192, 33.782997, -33.762, 31.927998);
        ((GeneralPath) shape).curveTo(-43.207, 20.771997, -49.526, 6.996998, -51.821, -7.439003);
        ((GeneralPath) shape).curveTo(-43.772, 1.5829973, -32.71, 8.386997, -20.655998, 9.339996);
        ((GeneralPath) shape).curveTo(-31.949997, -1.0370035, -39.265, -15.642004, -40.809, -30.901005);
        ((GeneralPath) shape).curveTo(-36.112, -28.771004, -31.344997, -26.619005, -26.251999, -25.807005);
        ((GeneralPath) shape).curveTo(-21.158998, -24.994005, -15.611999, -25.671005, -11.488999, -28.769005);
        ((GeneralPath) shape).curveTo(-13.900999, -24.516005, -15.483999, -19.794004, -16.120998, -14.946005);
        ((GeneralPath) shape).curveTo(-16.255999, -13.924005, -16.337997, -12.833005, -15.878999, -11.909005);
        ((GeneralPath) shape).curveTo(-15.248999, -10.640005, -13.798999, -10.046005, -12.468999, -9.5560055);
        ((GeneralPath) shape).curveTo(-8.326999, -8.031006, -4.185999, -6.5070057, -0.04399872, -4.9820056);
        ((GeneralPath) shape).curveTo(0.6360013, -4.7310057, 1.3660012, -4.4410057, 1.7430012, -3.8210056);
        ((GeneralPath) shape).curveTo(2.5430012, -2.5040054, 1.2260013, -0.93500566, 1.1920929E-6, -5.4836273E-6);
        ((GeneralPath) shape).moveTo(-40.655, -97.45801);
        ((GeneralPath) shape).curveTo(-47.136997, -91.353004, -54.447, -85.63801, -63.102997, -83.55001);
        ((GeneralPath) shape).curveTo(-59.609997, -79.73401, -54.343998, -77.613014, -49.179996, -77.94401);
        ((GeneralPath) shape).curveTo(-65.715996, -64.06301, -90.31799, -60.61701, -110.031, -69.421005);
        ((GeneralPath) shape).curveTo(-109.314995, -60.929005, -104.770996, -52.833008, -97.895, -47.799004);
        ((GeneralPath) shape).curveTo(-124.08099, -59.539, -145.121, -80.808, -160.79999, -104.844);
        ((GeneralPath) shape).curveTo(-176.47798, -128.881, -187.236, -155.743, -197.29498, -182.62);
        ((GeneralPath) shape).curveTo(-201.42099, -193.646, -205.49298, -204.927, -206.00998, -216.68799);
        ((GeneralPath) shape).curveTo(-200.66298, -204.91998, -195.31497, -193.15099, -189.96799, -181.383);
        ((GeneralPath) shape).curveTo(-181.53699, -162.827, -173.00499, -144.099, -160.69798, -127.852);
        ((GeneralPath) shape).curveTo(-148.39098, -111.605995, -131.81198, -97.82, -112.10098, -92.63699);
        ((GeneralPath) shape).curveTo(-102.11698, -90.01199, -91.31298, -89.70599, -81.60898, -93.230995);
        ((GeneralPath) shape).curveTo(-72.308975, -96.60899, -64.56598, -103.24999, -57.67698, -110.353);
        ((GeneralPath) shape).curveTo(-46.401978, -121.978, -36.79898, -135.22, -29.253979, -149.548);
        ((GeneralPath) shape).curveTo(-23.26598, -141.13101, -21.506979, -129.85501, -24.645979, -120.01401);
        ((GeneralPath) shape).curveTo(-27.47798, -111.13301, -33.86898, -103.850006, -40.65498, -97.45801);
        ((GeneralPath) shape).moveTo(-132.48097, 31.621994);
        ((GeneralPath) shape).curveTo(-162.82797, 25.185993, -189.23897, 5.329994, -207.87997, -19.467007);
        ((GeneralPath) shape).curveTo(-226.52098, -44.26301, -237.99898, -73.76401, -245.97098, -103.74501);
        ((GeneralPath) shape).curveTo(-262.839, -167.18001, -264.82297, -233.835, -259.12698, -299.225);
        ((GeneralPath) shape).curveTo(-253.43098, -364.617, -240.20499, -429.08502, -227.00598, -493.385);
        ((GeneralPath) shape).curveTo(-225.40398, -501.18402, -223.74998, -509.129, -219.82698, -516.058);
        ((GeneralPath) shape).curveTo(-213.38998, -527.43, -201.71698, -534.661, -190.52698, -541.40796);
        ((GeneralPath) shape).curveTo(-215.43997, -442.19296, -231.24197, -340.68796, -237.66898, -238.59796);
        ((GeneralPath) shape).curveTo(-239.12997, -215.38797, -240.10698, -192.07796, -238.29997, -168.89296);
        ((GeneralPath) shape).curveTo(-232.25697, -91.37596, -193.41296, -16.662964, -132.47998, 31.627045);
        ((GeneralPath) shape).moveTo(-307.02997, -627.8529);
        ((GeneralPath) shape).curveTo(-305.34497, -627.34393, -304.05396, -625.2459, -305.01398, -623.7699);
        ((GeneralPath) shape).curveTo(-308.70197, -624.4449, -312.42697, -625.1119, -316.16898, -625.7279);
        ((GeneralPath) shape).curveTo(-314.83698, -626.2159, -313.51797, -626.7379, -312.17996, -627.2069);
        ((GeneralPath) shape).curveTo(-310.51797, -627.7899, -308.71597, -628.3609, -307.02997, -627.8529);
        ((GeneralPath) shape).moveTo(-471.34998, -578.60693);
        ((GeneralPath) shape).curveTo(-470.27496, -577.2819, -469.14297, -575.9979, -467.91797, -574.78296);
        ((GeneralPath) shape).curveTo(-457.20596, -564.15796, -440.85995, -559.77094, -426.19296, -563.05096);
        ((GeneralPath) shape).curveTo(-429.95496, -563.136, -433.73596, -563.568, -437.38995, -564.193);
        ((GeneralPath) shape).curveTo(-449.48196, -566.261, -461.97797, -570.972, -471.34995, -578.607);
        ((GeneralPath) shape).moveTo(-141.22995, -647.891);
        ((GeneralPath) shape).curveTo(-145.21394, -645.23596, -150.09094, -644.373, -154.81094, -643.57);
        ((GeneralPath) shape).curveTo(-172.45294, -640.568, -190.14095, -637.562, -208.00793, -636.558);
        ((GeneralPath) shape).curveTo(-270.76395, -633.031, -333.75793, -654.255, -395.90793, -644.89496);
        ((GeneralPath) shape).curveTo(-406.06494, -643.36597, -416.47293, -640.8519, -424.53293, -634.48395);
        ((GeneralPath) shape).curveTo(-432.59293, -628.1149, -437.67093, -616.99994, -434.27792, -607.30493);
        ((GeneralPath) shape).curveTo(-439.43393, -612.5169, -442.27692, -619.7279, -447.68793, -624.6749);
        ((GeneralPath) shape).curveTo(-453.09894, -629.6209, -457.45392, -632.7879, -460.90292, -626.31793);
        ((GeneralPath) shape).curveTo(-463.74692, -620.9829, -465.81793, -612.61694, -461.5739, -608.30994);
        ((GeneralPath) shape).curveTo(-452.4869, -599.0889, -440.33792, -592.93695, -427.52692, -591.0709);
        ((GeneralPath) shape).curveTo(-425.11893, -590.72095, -422.7189, -590.54895, -420.32492, -590.47595);
        ((GeneralPath) shape).curveTo(-404.24692, -602.33295, -390.0649, -617.27795, -371.3749, -624.08093);
        ((GeneralPath) shape).curveTo(-353.8489, -630.4589, -334.7789, -628.7899, -316.1669, -625.7279);
        ((GeneralPath) shape).curveTo(-322.9719, -623.2299, -329.6799, -620.4779, -336.2799, -617.4789);
        ((GeneralPath) shape).curveTo(-336.3409, -617.35486, -336.4099, -617.2309, -336.4689, -617.1059);
        ((GeneralPath) shape).curveTo(-337.09592, -615.7769, -337.6019, -614.4319, -337.9659, -613.0779);
        ((GeneralPath) shape).lineTo(-349.67493, -611.0079);
        ((GeneralPath) shape).curveTo(-360.35593, -605.48285, -370.68292, -599.2839, -380.60092, -592.48486);
        ((GeneralPath) shape).curveTo(-384.81693, -588.61084, -388.82193, -584.5079, -392.55994, -580.16986);
        ((GeneralPath) shape).curveTo(-395.96194, -576.22186, -399.21094, -572.0439, -403.44394, -569.00385);
        ((GeneralPath) shape).curveTo(-408.45694, -565.40283, -414.38495, -563.7238, -420.55994, -563.21686);
        ((GeneralPath) shape).lineTo(-469.27094, -474.32385);
        ((GeneralPath) shape).curveTo(-474.97894, -463.90985, -480.70395, -453.46585, -487.62595, -443.81586);
        ((GeneralPath) shape).curveTo(-496.60794, -431.29385, -507.56894, -420.19485, -519.97894, -411.05887);
        ((GeneralPath) shape).curveTo(-519.23096, -405.88187, -514.8239, -401.45087, -509.65094, -400.67487);
        ((GeneralPath) shape).curveTo(-511.03894, -398.81186, -512.4279, -396.94788, -513.81696, -395.08487);
        ((GeneralPath) shape).curveTo(-507.29697, -401.11588, -497.56696, -406.72687, -492.35196, -410.96188);
        ((GeneralPath) shape).curveTo(-488.42197, -414.14288, -484.73895, -417.4279, -481.99796, -421.7179);
        ((GeneralPath) shape).curveTo(-484.86597, -406.5299, -501.22696, -383.3619, -519.84393, -386.9959);
        ((GeneralPath) shape).curveTo(-519.94495, -386.85992, -520.04596, -386.7249, -520.1469, -386.5889);
        ((GeneralPath) shape).curveTo(-483.4609, -381.9099, -447.7679, -398.8849, -415.30692, -416.6149);
        ((GeneralPath) shape).curveTo(-431.39493, -391.0909, -451.2629, -367.9549, -474.0639, -348.1949);
        ((GeneralPath) shape).curveTo(-475.7879, -357.53387, -475.37192, -367.26288, -472.8579, -376.4209);
        ((GeneralPath) shape).curveTo(-485.4729, -359.2889, -496.3539, -340.8819, -505.2829, -321.5699);
        ((GeneralPath) shape).curveTo(-507.8429, -330.03888, -508.7269, -339.0099, -507.8699, -347.81488);
        ((GeneralPath) shape).curveTo(-521.9849, -330.0699, -531.84393, -308.96387, -536.3949, -286.7509);
        ((GeneralPath) shape).curveTo(-549.4819, -308.00888, -551.9419, -333.98987, -552.7149, -358.9409);
        ((GeneralPath) shape).curveTo(-553.1909, -374.3039, -553.15393, -389.6779, -553.1179, -405.04788);
        ((GeneralPath) shape).curveTo(-553.0619, -428.07187, -553.0019, -451.1779, -549.86194, -473.98688);
        ((GeneralPath) shape).curveTo(-547.28394, -492.71786, -542.64795, -511.09888, -537.82196, -529.3799);
        ((GeneralPath) shape).curveTo(-529.675, -560.2409, -520.175, -592.3459, -497.84998, -615.15686);
        ((GeneralPath) shape).curveTo(-495.90198, -617.1479, -493.10297, -619.20087, -490.58496, -618.0099);
        ((GeneralPath) shape).curveTo(-488.88495, -617.2069, -488.13196, -615.2409, -487.53995, -613.4569);
        ((GeneralPath) shape).curveTo(-487.19794, -612.4279, -486.85095, -611.3899, -486.50696, -610.3559);
        ((GeneralPath) shape).curveTo(-486.37296, -617.2349, -484.72397, -624.1739, -482.35394, -630.6709);
        ((GeneralPath) shape).curveTo(-481.36993, -633.3699, -480.25293, -636.0449, -478.64294, -638.4239);
        ((GeneralPath) shape).curveTo(-476.19196, -642.0479, -472.69595, -644.8399, -469.04794, -647.2569);
        ((GeneralPath) shape).curveTo(-444.61493, -663.4439, -413.33694, -664.2089, -384.05896, -662.86487);
        ((GeneralPath) shape).curveTo(-312.88495, -659.5989, -240.95895, -647.1739, -170.94896, -660.41486);
        ((GeneralPath) shape).curveTo(-159.16896, -662.6429, -146.39996, -665.4709, -135.67096, -660.1199);
        ((GeneralPath) shape).curveTo(-134.37196, -655.5119, -137.23396, -650.5459, -141.21896, -647.89087);
        ((GeneralPath) shape).moveTo(-509.48895, -633.1399);
        ((GeneralPath) shape).curveTo(-511.69296, -631.9679, -514.329, -632.1379, -516.824, -632.0399);
        ((GeneralPath) shape).curveTo(-529.79, -631.5329, -541.92896, -622.1089, -545.63495, -609.6739);
        ((GeneralPath) shape).curveTo(-543.21796, -618.9349, -542.73596, -628.69586, -544.22894, -638.1499);
        ((GeneralPath) shape).curveTo(-544.54694, -640.1589, -545.05493, -642.3299, -546.65295, -643.5879);
        ((GeneralPath) shape).curveTo(-548.42395, -644.9809, -550.94196, -644.79486, -553.14996, -644.34686);
        ((GeneralPath) shape).curveTo(-561.02295, -642.74786, -568.36194, -638.6199, -573.818, -632.72284);
        ((GeneralPath) shape).curveTo(-574.45197, -632.03784, -575.271, -631.2598, -576.174, -631.49585);
        ((GeneralPath) shape).curveTo(-576.192, -631.4999, -576.202, -631.51483, -576.219, -631.5209);
        ((GeneralPath) shape).curveTo(-596.286, -513.49084, -589.133, -392.70087, -581.906, -273.18088);
        ((GeneralPath) shape).curveTo(-582.993, -274.59686, -583.906, -276.10187, -584.742, -277.64688);
        ((GeneralPath) shape).curveTo(-582.521, -259.3159, -580.267, -240.99088, -578.00903, -222.67389);
        ((GeneralPath) shape).curveTo(-589.09406, -265.0199, -600.50604, -308.1319, -623.93604, -345.10388);
        ((GeneralPath) shape).curveTo(-627.06006, -350.03387, -631.59705, -355.4289, -637.39404, -354.7479);
        ((GeneralPath) shape).curveTo(-640.09106, -354.4319, -642.447, -352.7899, -644.45605, -350.9629);
        ((GeneralPath) shape).curveTo(-658.49304, -338.1889, -659.59204, -316.7049, -658.14404, -297.78088);
        ((GeneralPath) shape).curveTo(-656.93005, -281.92288, -654.57904, -266.15887, -651.21906, -250.61288);
        ((GeneralPath) shape).curveTo(-661.6841, -281.71988, -668.08105, -314.15488, -674.41003, -346.4149);
        ((GeneralPath) shape).curveTo(-677.98303, -364.62488, -681.55505, -382.83588, -685.12805, -401.04688);
        ((GeneralPath) shape).curveTo(-688.4631, -418.04788, -688.5491, -444.0659, -690.51404, -461.27988);
        ((GeneralPath) shape).curveTo(-697.502, -522.4989, -690.23004, -575.21985, -679.74005, -635.9399);
        ((GeneralPath) shape).curveTo(-658.28406, -628.8979, -634.58105, -628.89087, -613.12006, -635.91986);
        ((GeneralPath) shape).curveTo(-613.00604, -623.2079, -612.71704, -610.50385, -612.34906, -597.80286);
        ((GeneralPath) shape).curveTo(-611.97906, -615.38385, -610.91705, -632.93884, -608.85706, -650.43787);
        ((GeneralPath) shape).curveTo(-608.31305, -655.0519, -607.25903, -660.3379, -603.17505, -662.55286);
        ((GeneralPath) shape).curveTo(-601.202, -663.62286, -598.869, -663.73987, -596.62604, -663.8329);
        ((GeneralPath) shape).curveTo(-563.077, -665.2319, -528.95, -666.5729, -496.43604, -658.18286);
        ((GeneralPath) shape).curveTo(-498.50204, -651.22687, -501.38702, -644.51587, -505.01105, -638.23083);
        ((GeneralPath) shape).curveTo(-506.15604, -636.24585, -507.46506, -634.2158, -509.48804, -633.1408);
        ((GeneralPath) shape).moveTo(-635.3981, -197.7508);
        ((GeneralPath) shape).curveTo(-642.07007, -214.9158, -647.3291, -232.6198, -651.2181, -250.6198);
        ((GeneralPath) shape).curveTo(-649.2701, -244.82779, -647.1971, -239.0768, -644.9391, -233.3868);
        ((GeneralPath) shape).lineTo(-635.3981, -197.7508);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-701.02606, -628.16077);
        ((GeneralPath) shape).curveTo(-711.67505, -621.86475, -718.93207, -610.1658, -719.84204, -597.82874);
        ((GeneralPath) shape).curveTo(-720.40704, -614.98773, -720.97107, -632.14575, -721.536, -649.30475);
        ((GeneralPath) shape).curveTo(-738.848, -642.1857, -752.182, -626.10675, -755.97504, -607.77673);
        ((GeneralPath) shape).curveTo(-756.59204, -622.3427, -759.48303, -636.8967, -765.392, -650.22375);
        ((GeneralPath) shape).curveTo(-760.16705, -468.78375, -714.30005, -288.62375, -632.122, -126.77374);
        ((GeneralPath) shape).curveTo(-629.038, -120.699745, -625.922, -114.63774, -622.94, -108.51474);
        ((GeneralPath) shape).curveTo(-617.264, -104.77774, -611.458, -101.23674, -605.528, -97.91674);
        ((GeneralPath) shape).curveTo(-610.956, -118.313736, -613.737, -139.41374, -613.779, -160.52074);
        ((GeneralPath) shape).curveTo(-608.583, -146.86073, -599.789, -134.58774, -588.52496, -125.27574);
        ((GeneralPath) shape).curveTo(-591.186, -142.21375, -591.998, -159.44073, -590.94196, -176.55374);
        ((GeneralPath) shape).curveTo(-580.009, -156.47974, -564.558, -138.88274, -546.066, -125.44474);
        ((GeneralPath) shape).curveTo(-547.352, -137.58675, -547.389, -149.86174, -546.17596, -162.01175);
        ((GeneralPath) shape).curveTo(-521.16296, -130.35374, -495.45496, -97.28575, -486.40897, -57.97175);
        ((GeneralPath) shape).curveTo(-494.11798, -72.41575, -503.46295, -85.98575, -514.20795, -98.33775);
        ((GeneralPath) shape).curveTo(-519.02496, -91.41576, -524.41797, -84.89575, -530.31396, -78.86575);
        ((GeneralPath) shape).curveTo(-538.751, -88.28975, -547.18896, -97.71275, -555.626, -107.13675);
        ((GeneralPath) shape).curveTo(-555.857, -95.11275, -554.289, -83.05675, -550.98895, -71.49275);
        ((GeneralPath) shape).curveTo(-558.18396, -79.98975, -567.683, -86.51775, -578.19495, -90.18875);
        ((GeneralPath) shape).curveTo(-570.36896, -74.00575, -561.277, -58.436752, -551.027, -43.66975);
        ((GeneralPath) shape).curveTo(-562.725, -44.79375, -574.07697, -49.30875, -583.35, -56.52675);
        ((GeneralPath) shape).curveTo(-574.94995, -40.80275, -561.35095, -27.913748, -545.201, -20.366749);
        ((GeneralPath) shape).curveTo(-557.191, -19.42775, -569.384, -21.17875, -580.625, -25.454748);
        ((GeneralPath) shape).curveTo(-577.003, -24.723747, -573.128, -25.314749, -569.889, -27.093748);
        ((GeneralPath) shape).curveTo(-577.50696, -32.966747, -584.94495, -39.071747, -592.191, -45.396748);
        ((GeneralPath) shape).curveTo(-596.80096, -49.42175, -601.732, -54.487747, -601.18097, -60.58175);
        ((GeneralPath) shape).curveTo(-600.998, -62.611748, -600.19196, -64.58075, -600.29, -66.616745);
        ((GeneralPath) shape).curveTo(-600.40796, -69.07275, -601.81396, -71.255745, -603.17395, -73.30475);
        ((GeneralPath) shape).lineTo(-629.496, -112.95575);
        ((GeneralPath) shape).curveTo(-628.474, -112.24175, -627.435, -111.55175, -626.404, -110.851746);
        ((GeneralPath) shape).curveTo(-673.705, -189.54175, -712.607, -273.28174, -742.224, -360.18176);
        ((GeneralPath) shape).curveTo(-776.99, -462.21176, -798.982, -569.03174, -801.613, -676.79175);
        ((GeneralPath) shape).curveTo(-779.803, -683.53876, -756.31696, -680.33575, -733.72095, -677.0718);
        ((GeneralPath) shape).curveTo(-718.63696, -674.89276, -703.553, -672.7148, -688.46893, -670.53577);
        ((GeneralPath) shape).curveTo(-687.2169, -670.35474, -685.9259, -670.1598, -684.8519, -669.49274);
        ((GeneralPath) shape).curveTo(-682.30194, -667.9077, -681.92694, -664.4127, -681.82294, -661.41174);
        ((GeneralPath) shape).curveTo(-681.51794, -652.64075, -681.58496, -642.8347, -687.64996, -636.48975);
        ((GeneralPath) shape).curveTo(-691.295, -632.6757, -696.48694, -630.84875, -701.02795, -628.1627);
        ((GeneralPath) shape).moveTo(-502.87796, 69.7973);
        ((GeneralPath) shape).curveTo(-505.54495, 67.988304, -506.78397, 64.751305, -507.87097, 61.7173);
        ((GeneralPath) shape).curveTo(-509.58698, 56.9293, -511.30197, 52.1403, -513.01794, 47.3513);
        ((GeneralPath) shape).curveTo(-514.3159, 43.7273, -515.6259, 39.7823, -514.46796, 36.111298);
        ((GeneralPath) shape).curveTo(-512.454, 29.729298, -504.47696, 27.775297, -497.79996, 27.334297);
        ((GeneralPath) shape).curveTo(-458.86896, 24.766296, -420.18994, 38.368298, -387.12994, 59.086296);
        ((GeneralPath) shape).lineTo(-492.32996, 71.089294);
        ((GeneralPath) shape).curveTo(-495.93097, 71.5003, -499.88394, 71.83129, -502.88297, 69.797295);
        ((GeneralPath) shape).moveTo(-284.70297, 562.8273);
        ((GeneralPath) shape).curveTo(-285.44498, 551.18225, -281.81796, 538.86127, -273.19797, 530.9963);
        ((GeneralPath) shape).curveTo(-273.97098, 552.5423, -274.06998, 574.1123, -273.49496, 595.6643);
        ((GeneralPath) shape).curveTo(-279.30396, 585.5443, -283.96097, 574.4723, -284.70297, 562.82733);
        ((GeneralPath) shape).moveTo(-277.22897, 628.3773);
        ((GeneralPath) shape).curveTo(-283.26996, 634.4763, -294.01797, 625.95435, -298.10397, 621.6713);
        ((GeneralPath) shape).curveTo(-308.23697, 611.0473, -315.20297, 597.4373, -317.89297, 583.00433);
        ((GeneralPath) shape).curveTo(-313.18698, 592.74634, -304.63098, 599.97736, -296.31998, 606.9033);
        ((GeneralPath) shape).curveTo(-292.645, 609.96533, -288.97098, 613.02734, -285.29697, 616.0893);
        ((GeneralPath) shape).curveTo(-284.17398, 617.0243, -283.02298, 618.0103, -281.97897, 619.0753);
        ((GeneralPath) shape).lineTo(-278.71497, 617.3803);
        ((GeneralPath) shape).curveTo(-275.86896, 620.9003, -273.72498, 624.8393, -277.22897, 628.3773);
        ((GeneralPath) shape).moveTo(-299.62997, 561.78735);
        ((GeneralPath) shape).curveTo(-288.78098, 578.33136, -280.65897, 596.65936, -275.68997, 615.8093);
        ((GeneralPath) shape).lineTo(-278.71497, 617.3803);
        ((GeneralPath) shape).curveTo(-280.20197, 615.5413, -281.87598, 613.8153, -283.04398, 612.3253);
        ((GeneralPath) shape).curveTo(-294.62698, 597.54834, -301.899, 581.0083, -299.62997, 561.7873);
        ((GeneralPath) shape).moveTo(-698.93994, 414.20728);
        ((GeneralPath) shape).curveTo(-693.06995, 435.95728, -681.56995, 456.77527, -663.62994, 470.40128);
        ((GeneralPath) shape).curveTo(-659.36896, 473.63727, -654.4769, 476.53928, -649.12695, 476.60028);
        ((GeneralPath) shape).curveTo(-637.13995, 476.73627, -629.954, 463.5673, -626.15894, 452.1963);
        ((GeneralPath) shape).curveTo(-621.53796, 438.3533, -617.90393, 424.19128, -615.1699, 409.8563);
        ((GeneralPath) shape).curveTo(-614.7749, 397.8323, -613.3609, 385.8433, -610.8209, 374.0843);
        ((GeneralPath) shape).curveTo(-610.58795, 373.0033, -610.34894, 371.91528, -610.1129, 370.8253);
        ((GeneralPath) shape).curveTo(-609.7089, 364.9653, -609.4829, 359.09528, -609.3949, 353.2223);
        ((GeneralPath) shape).curveTo(-610.4859, 349.2613, -612.6369, 345.8473, -615.4669, 342.91428);
        ((GeneralPath) shape).curveTo(-643.3259, 334.69427, -670.5199, 324.22427, -696.7079, 311.65927);
        ((GeneralPath) shape).curveTo(-695.0479, 312.65927, -693.3879, 313.66028, -691.7279, 314.6613);
        ((GeneralPath) shape).curveTo(-702.7889, 320.1233, -704.7969, 334.79828, -705.0409, 347.1333);
        ((GeneralPath) shape).curveTo(-705.4859, 369.6563, -704.8109, 392.4583, -698.9399, 414.2073);
        ((GeneralPath) shape).moveTo(-733.4389, 282.5973);
        ((GeneralPath) shape).curveTo(-719.5969, 279.8493, -705.7039, 286.01028, -692.9679, 292.08728);
        ((GeneralPath) shape).curveTo(-673.7059, 301.2783, -654.1909, 310.8863, -637.0559, 323.41727);
        ((GeneralPath) shape).curveTo(-632.9779, 323.50626, -628.8929, 323.16428, -624.9149, 322.24426);
        ((GeneralPath) shape).curveTo(-623.59894, 321.94028, -622.1909, 321.51328, -621.3999, 320.41827);
        ((GeneralPath) shape).curveTo(-620.6909, 319.43826, -620.6409, 318.1443, -620.6179, 316.93427);
        ((GeneralPath) shape).curveTo(-620.4719, 309.41626, -620.3269, 301.89825, -620.18195, 294.38025);
        ((GeneralPath) shape).curveTo(-611.23395, 298.30325, -605.9329, 307.54724, -602.11694, 316.54126);
        ((GeneralPath) shape).curveTo(-585.76495, 355.08026, -586.09595, 400.27927, -602.58093, 438.72125);
        ((GeneralPath) shape).curveTo(-607.71295, 463.46924, -618.33093, 487.06024, -634.0659, 506.86127);
        ((GeneralPath) shape).curveTo(-637.8509, 511.62527, -642.0919, 516.31824, -647.66895, 518.75024);
        ((GeneralPath) shape).curveTo(-656.29395, 522.51227, -666.67896, 520.0142, -674.30695, 514.50525);
        ((GeneralPath) shape).curveTo(-681.93494, 508.99524, -687.25793, 500.89526, -691.837, 492.67426);
        ((GeneralPath) shape).curveTo(-723.448, 435.91925, -726.41296, 366.84424, -713.759, 303.08426);
        ((GeneralPath) shape).curveTo(-717.144, 301.31125, -720.526, 299.53326, -723.87195, 297.68927);
        ((GeneralPath) shape).curveTo(-729.65796, 294.50027, -736.31995, 288.54428, -733.43896, 282.60028);
        ((GeneralPath) shape).moveTo(-368.76895, 335.72028);
        ((GeneralPath) shape).curveTo(-358.33997, 335.44226, -347.80896, 335.58026, -337.62296, 337.8343);
        ((GeneralPath) shape).curveTo(-330.74496, 339.3563, -322.86597, 343.38928, -322.64395, 350.4303);
        ((GeneralPath) shape).curveTo(-322.44095, 356.8793, -329.33395, 361.60928, -335.77994, 361.9183);
        ((GeneralPath) shape).curveTo(-342.22495, 362.2273, -348.37094, 359.5283, -354.57092, 357.73932);
        ((GeneralPath) shape).curveTo(-367.32492, 354.05832, -380.82294, 354.17432, -394.09592, 354.3193);
        ((GeneralPath) shape).lineTo(-482.33893, 355.2843);
        ((GeneralPath) shape).curveTo(-445.68192, 343.3593, -407.30194, 336.7483, -368.76892, 335.7203);
        ((GeneralPath) shape).moveTo(-512.3789, 520.4403);
        ((GeneralPath) shape).curveTo(-516.1979, 507.8413, -516.1889, 494.4173, -515.4439, 481.27332);
        ((GeneralPath) shape).curveTo(-513.0009, 438.20932, -502.9349, 395.58832, -485.8539, 355.9833);
        ((GeneralPath) shape).curveTo(-484.5089, 397.1433, -484.5309, 438.3483, -485.9209, 479.5033);
        ((GeneralPath) shape).curveTo(-486.1439, 486.1153, -486.3899, 492.84628, -484.6579, 499.2323);
        ((GeneralPath) shape).curveTo(-482.9269, 505.6173, -478.8689, 511.7243, -472.7479, 514.2323);
        ((GeneralPath) shape).curveTo(-464.0249, 517.8063, -454.22888, 513.2983, -446.14688, 508.4463);
        ((GeneralPath) shape).curveTo(-430.66388, 499.15128, -416.1819, 488.19128, -403.02887, 475.81628);
        ((GeneralPath) shape).curveTo(-401.66687, 479.9773, -403.44485, 484.4463, -405.19485, 488.4603);
        ((GeneralPath) shape).curveTo(-412.95184, 506.2583, -421.05786, 524.5663, -435.12485, 537.9483);
        ((GeneralPath) shape).curveTo(-449.19183, 551.3313, -470.90085, 558.6523, -488.48883, 550.4273);
        ((GeneralPath) shape).curveTo(-500.41382, 544.8503, -508.5598, 533.0383, -512.37885, 520.43933);
        ((GeneralPath) shape).moveTo(-287.46884, 316.6093);
        ((GeneralPath) shape).curveTo(-365.62283, 314.27933, -444.57886, 298.7503, -513.12885, 261.1433);
        ((GeneralPath) shape).curveTo(-461.01285, 278.9903, -407.22885, 292.6983, -352.36884, 297.7153);
        ((GeneralPath) shape).curveTo(-297.51083, 302.7323, -241.45883, 298.8913, -188.90883, 282.3543);
        ((GeneralPath) shape).curveTo(-190.23083, 286.8803, -191.55283, 291.40732, -192.87383, 295.93332);
        ((GeneralPath) shape).curveTo(-193.13582, 296.83032, -193.41783, 297.7643, -194.06383, 298.4403);
        ((GeneralPath) shape).curveTo(-194.74083, 299.1503, -195.71783, 299.47232, -196.65283, 299.7683);
        ((GeneralPath) shape).lineTo(-219.20683, 306.9143);
        ((GeneralPath) shape).curveTo(-229.00284, 310.0183, -238.83583, 313.13132, -248.96483, 314.8613);
        ((GeneralPath) shape).curveTo(-261.64883, 317.02728, -274.59982, 316.9933, -287.46082, 316.60928);
        ((GeneralPath) shape).moveTo(-192.20882, 134.93929);
        ((GeneralPath) shape).curveTo(-191.65681, 134.89229, -191.10881, 134.81529, -190.56181, 134.73228);
        ((GeneralPath) shape).curveTo(-195.87082, 138.41028, -202.20981, 140.58528, -208.65982, 140.92128);
        ((GeneralPath) shape).curveTo(-203.42882, 133.78027, -207.60683, 122.942276, -214.97083, 118.03028);
        ((GeneralPath) shape).curveTo(-219.06982, 115.29728, -223.78282, 113.92328, -228.67482, 113.14528);
        ((GeneralPath) shape).curveTo(-212.56082, 114.596275, -196.44682, 116.04728, -180.33282, 117.49728);
        ((GeneralPath) shape).curveTo(-183.54782, 123.77428, -187.54782, 129.64827, -192.20883, 134.93927);
        ((GeneralPath) shape).moveTo(-200.10783, 198.62027);
        ((GeneralPath) shape).curveTo(-185.67883, 190.00627, -173.65384, 177.41327, -165.71384, 162.60327);
        ((GeneralPath) shape).curveTo(-165.45284, 176.40527, -166.39984, 190.23128, -168.53984, 203.86926);
        ((GeneralPath) shape).curveTo(-168.99484, 206.76627, -169.56784, 209.80127, -171.44284, 212.05626);
        ((GeneralPath) shape).curveTo(-172.82184, 213.71526, -174.76984, 214.77927, -176.67784, 215.78726);
        ((GeneralPath) shape).curveTo(-269.21585, 264.68326, -380.49786, 270.96027, -482.36786, 246.91026);
        ((GeneralPath) shape).curveTo(-401.81485, 248.28926, -319.85785, 249.15526, -242.47786, 226.72527);
        ((GeneralPath) shape).curveTo(-233.80986, 224.21327, -224.78485, 221.13426, -218.81886, 214.36327);
        ((GeneralPath) shape).curveTo(-213.65387, 208.50026, -211.49086, 200.66226, -209.36786, 193.14427);
        ((GeneralPath) shape).curveTo(-203.80086, 173.43127, -197.46886, 153.93427, -190.39487, 134.71127);
        ((GeneralPath) shape).curveTo(-185.67886, 133.96628, -181.16986, 131.92427, -177.52087, 128.84227);
        ((GeneralPath) shape).curveTo(-177.50388, 153.69627, -185.53188, 178.49228, -200.11087, 198.62027);
        ((GeneralPath) shape).moveTo(-190.39487, 134.71127);
        ((GeneralPath) shape).curveTo(-190.45087, 134.72028, -190.50787, 134.72427, -190.56487, 134.73227);
        ((GeneralPath) shape).curveTo(-190.49486, 134.68427, -190.42186, 134.64326, -190.35286, 134.59427);
        ((GeneralPath) shape).curveTo(-190.36687, 134.63327, -190.37985, 134.67227, -190.39487, 134.71127);
        ((GeneralPath) shape).moveTo(-427.02487, 212.02327);
        ((GeneralPath) shape).curveTo(-446.92487, 218.95227, -467.65286, 223.20427, -488.68387, 223.34528);
        ((GeneralPath) shape).lineTo(-427.02487, 212.02327);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-642.0649, 242.88428);
        ((GeneralPath) shape).curveTo(-642.21185, 246.69928, -646.3979, 248.87027, -650.0069, 250.11328);
        ((GeneralPath) shape).curveTo(-659.1439, 253.25928, -668.5569, 255.57129, -678.0989, 257.0763);
        ((GeneralPath) shape).curveTo(-675.44086, 256.01828, -672.83386, 254.81029, -670.2909, 253.42029);
        ((GeneralPath) shape).lineTo(-642.0649, 242.8843);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-656.28186, 180.82529);
        ((GeneralPath) shape).curveTo(-632.9429, 160.01628, -601.34283, 147.73529, -569.88086, 143.87129);
        ((GeneralPath) shape).curveTo(-532.25885, 139.2493, -494.36188, 144.8113, -456.97086, 151.8803);
        ((GeneralPath) shape).curveTo(-448.75586, 145.7413, -440.19885, 140.0603, -431.34286, 134.8893);
        ((GeneralPath) shape).curveTo(-426.32385, 141.9893, -422.26587, 149.7683, -419.31287, 157.94629);
        ((GeneralPath) shape).curveTo(-417.74786, 162.2833, -416.41586, 166.86829, -413.38687, 170.34428);
        ((GeneralPath) shape).curveTo(-411.02487, 173.05629, -407.82288, 174.86128, -404.76788, 176.75728);
        ((GeneralPath) shape).curveTo(-397.42987, 181.31128, -390.6229, 186.70128, -384.4579, 192.74828);
        ((GeneralPath) shape).curveTo(-355.3509, 176.68727, -328.7039, 156.51328, -302.22488, 136.37828);
        ((GeneralPath) shape).curveTo(-301.34488, 135.70927, -300.4679, 135.03328, -299.5889, 134.36128);
        ((GeneralPath) shape).curveTo(-303.9709, 130.24529, -309.7049, 127.20728, -315.2219, 124.62728);
        ((GeneralPath) shape).curveTo(-336.0819, 114.87328, -357.8049, 106.96528, -380.0539, 101.02728);
        ((GeneralPath) shape).curveTo(-393.8659, 97.34029, -407.8689, 94.413284, -421.86288, 91.49028);
        ((GeneralPath) shape).curveTo(-525.92285, 89.86828, -632.43286, 88.02628, -719.2029, 116.90628);
        ((GeneralPath) shape).curveTo(-717.98486, 126.00828, -713.8869, 134.70328, -707.6419, 141.43729);
        ((GeneralPath) shape).curveTo(-714.1619, 141.03429, -720.6629, 140.37828, -727.1419, 139.55728);
        ((GeneralPath) shape).curveTo(-703.2269, 152.25528, -680.89594, 169.22629, -656.2809, 180.82529);
        ((GeneralPath) shape).moveTo(-638.5279, 71.08529);
        ((GeneralPath) shape).curveTo(-550.78687, 77.34029, -461.25787, 68.92029, -374.7779, 81.438286);
        ((GeneralPath) shape).curveTo(-341.7609, 84.051285, -309.1549, 91.90428, -278.6549, 104.82028);
        ((GeneralPath) shape).curveTo(-275.6749, 106.08228, -272.7059, 107.44828, -269.95392, 109.13228);
        ((GeneralPath) shape).curveTo(-260.4609, 105.11228, -249.06392, 108.484276, -239.04692, 112.16128);
        ((GeneralPath) shape).curveTo(-235.59192, 112.34428, -232.09492, 112.60328, -228.67693, 113.14628);
        ((GeneralPath) shape).curveTo(-232.07092, 112.84128, -235.46393, 112.53528, -238.85793, 112.23028);
        ((GeneralPath) shape).curveTo(-238.66493, 112.30128, -238.46793, 112.37128, -238.27592, 112.442276);
        ((GeneralPath) shape).curveTo(-247.50192, 125.39227, -259.93094, 136.04028, -274.14194, 143.17128);
        ((GeneralPath) shape).curveTo(-279.49493, 145.85828, -285.09595, 148.05428, -290.29593, 151.02628);
        ((GeneralPath) shape).curveTo(-295.69794, 154.11328, -300.59393, 157.99428, -305.64993, 161.62027);
        ((GeneralPath) shape).curveTo(-328.08594, 177.70827, -353.48892, 188.65327, -379.68094, 197.72726);
        ((GeneralPath) shape).curveTo(-371.88794, 206.30727, -365.31894, 215.99927, -360.35193, 226.47226);
        ((GeneralPath) shape).curveTo(-369.03494, 220.82227, -377.71793, 215.17126, -386.40094, 209.52126);
        ((GeneralPath) shape).curveTo(-389.54593, 207.47426, -392.74893, 205.35225, -395.85095, 203.09825);
        ((GeneralPath) shape).curveTo(-404.37595, 205.82126, -412.93594, 208.42525, -421.46194, 211.00325);
        ((GeneralPath) shape).lineTo(-427.02295, 212.02425);
        ((GeneralPath) shape).curveTo(-417.57196, 208.73425, -408.30994, 204.84525, -399.29294, 200.48825);
        ((GeneralPath) shape).curveTo(-407.26895, 194.21225, -414.12494, 186.84924, -416.89294, 177.27425);
        ((GeneralPath) shape).curveTo(-418.89594, 170.34525, -419.10394, 161.85025, -425.10895, 157.85425);
        ((GeneralPath) shape).curveTo(-432.39194, 153.00725, -441.88895, 158.68524, -448.71194, 164.16325);
        ((GeneralPath) shape).curveTo(-449.57693, 164.85725, -450.44595, 165.57726, -451.30795, 166.31226);
        ((GeneralPath) shape).curveTo(-453.97595, 169.83026, -456.47495, 173.65126, -459.29996, 176.86426);
        ((GeneralPath) shape).curveTo(-459.43796, 177.02126, -459.58295, 177.17426, -459.72595, 177.32826);
        ((GeneralPath) shape).curveTo(-459.92096, 177.95126, -460.10297, 178.57927, -460.21094, 179.23827);
        ((GeneralPath) shape).curveTo(-460.63095, 179.13626, -461.03793, 178.98827, -461.45593, 178.87727);
        ((GeneralPath) shape).curveTo(-461.75095, 179.07828, -462.05792, 179.25928, -462.38593, 179.40628);
        ((GeneralPath) shape).curveTo(-464.38992, 180.30128, -466.70593, 179.89328, -468.85892, 179.46828);
        ((GeneralPath) shape).curveTo(-479.9919, 177.27127, -491.1239, 175.07527, -502.25693, 172.87927);
        ((GeneralPath) shape).curveTo(-509.60892, 171.42827, -517.27094, 169.98528, -524.5109, 171.91927);
        ((GeneralPath) shape).curveTo(-538.70795, 175.71327, -546.5139, 191.01027, -549.78394, 205.33727);
        ((GeneralPath) shape).curveTo(-553.54395, 221.81326, -553.63696, 238.88426, -553.32697, 255.78027);
        ((GeneralPath) shape).curveTo(-553.28296, 258.19528, -553.38495, 260.96426, -555.24994, 262.49826);
        ((GeneralPath) shape).curveTo(-556.4199, 263.46127, -558.01294, 263.68127, -559.5139, 263.89526);
        ((GeneralPath) shape).curveTo(-581.6349, 267.05026, -602.7169, 277.13327, -619.0569, 292.37527);
        ((GeneralPath) shape).curveTo(-621.84186, 277.57928, -615.7859, 262.12527, -605.9289, 250.74527);
        ((GeneralPath) shape).curveTo(-596.0719, 239.36526, -582.7859, 231.51727, -569.2279, 224.97127);
        ((GeneralPath) shape).lineTo(-566.9389, 192.45027);
        ((GeneralPath) shape).curveTo(-566.7099, 189.19028, -566.5399, 185.67528, -568.29193, 182.91628);
        ((GeneralPath) shape).curveTo(-570.7589, 179.02928, -575.9799, 178.15128, -580.57495, 177.87227);
        ((GeneralPath) shape).curveTo(-615.51794, 175.74426, -651.07794, 187.16226, -678.334, 209.11827);
        ((GeneralPath) shape).lineTo(-640.958, 208.12328);
        ((GeneralPath) shape).curveTo(-654.093, 216.97427, -670.997, 218.86627, -686.619, 216.25427);
        ((GeneralPath) shape).curveTo(-694.33704, 214.96428, -701.807, 212.66127, -709.08704, 209.78627);
        ((GeneralPath) shape).curveTo(-703.48004, 209.92126, -697.86804, 209.84227, -692.27106, 209.48927);
        ((GeneralPath) shape).lineTo(-679.33105, 209.14528);
        ((GeneralPath) shape).curveTo(-673.7341, 199.23428, -666.6351, 190.45328, -658.4241, 182.77428);
        ((GeneralPath) shape).curveTo(-692.5021, 173.85828, -724.7301, 157.92627, -752.5011, 136.25728);
        ((GeneralPath) shape).curveTo(-748.4521, 147.76228, -741.5941, 158.26927, -732.6511, 166.56229);
        ((GeneralPath) shape).curveTo(-744.0401, 166.29028, -755.40814, 165.1623, -766.62915, 163.18929);
        ((GeneralPath) shape).curveTo(-763.70514, 169.97029, -761.17914, 176.87828, -758.92413, 183.8693);
        ((GeneralPath) shape).curveTo(-749.74414, 189.3893, -740.41113, 194.6563, -730.9071, 199.5983);
        ((GeneralPath) shape).curveTo(-723.7971, 203.2963, -716.5421, 206.8423, -709.0871, 209.7863);
        ((GeneralPath) shape).curveTo(-722.9061, 209.45331, -736.6901, 207.6713, -750.1231, 204.4103);
        ((GeneralPath) shape).curveTo(-751.2151, 204.1453, -752.30414, 203.85329, -753.3871, 203.53929);
        ((GeneralPath) shape).curveTo(-749.3691, 220.1713, -746.7611, 237.20029, -744.9201, 254.3563);
        ((GeneralPath) shape).curveTo(-723.1241, 259.6613, -700.2591, 260.5723, -678.0981, 257.0773);
        ((GeneralPath) shape).curveTo(-697.1481, 264.6583, -718.8981, 264.2563, -739.6571, 263.6253);
        ((GeneralPath) shape).curveTo(-741.1011, 263.5813, -742.5571, 263.5343, -744.01013, 263.4523);
        ((GeneralPath) shape).curveTo(-742.8331, 276.16132, -741.99915, 288.9103, -741.2691, 301.5933);
        ((GeneralPath) shape).curveTo(-737.3551, 369.6503, -735.6081, 437.86328, -737.5681, 506.0033);
        ((GeneralPath) shape).curveTo(-737.9531, 519.4063, -738.4491, 533.0823, -734.66614, 545.94727);
        ((GeneralPath) shape).curveTo(-730.8832, 558.81226, -721.9561, 570.9703, -709.13715, 574.90326);
        ((GeneralPath) shape).curveTo(-717.88214, 574.73425, -726.62714, 574.5663, -735.37317, 574.3973);
        ((GeneralPath) shape).curveTo(-703.7972, 600.70325, -666.95917, 620.6683, -627.68317, 632.7633);
        ((GeneralPath) shape).curveTo(-678.66516, 624.8833, -728.11316, 607.2303, -772.5632, 581.0473);
        ((GeneralPath) shape).curveTo(-770.06915, 579.4963, -767.5752, 577.9453, -765.0802, 576.3943);
        ((GeneralPath) shape).curveTo(-766.1782, 575.52826, -767.1282, 574.49927, -768.0022, 573.40826);
        ((GeneralPath) shape).curveTo(-767.84717, 573.77026, -767.6762, 574.12225, -767.5642, 574.50726);
        ((GeneralPath) shape).curveTo(-773.3042, 575.26324, -778.6162, 575.96326, -783.9872, 576.6703);
        ((GeneralPath) shape).curveTo(-783.70416, 577.5703, -783.7062, 578.2943, -783.3772, 578.50726);
        ((GeneralPath) shape).curveTo(-767.4342, 588.83624, -750.9272, 598.13525, -732.2872, 605.5773);
        ((GeneralPath) shape).curveTo(-734.01917, 606.72125, -734.4162, 607.19525, -734.8642, 607.24927);
        ((GeneralPath) shape).curveTo(-744.0342, 608.35425, -753.2022, 609.4303, -762.4742, 609.21027);
        ((GeneralPath) shape).curveTo(-773.6122, 608.9443, -784.75916, 608.96326, -795.8922, 608.58026);
        ((GeneralPath) shape).curveTo(-807.0092, 608.19824, -818.0722, 607.4333, -829.04724, 605.1523);
        ((GeneralPath) shape).curveTo(-836.1862, 603.6683, -843.58026, 603.1033, -850.88727, 602.8163);
        ((GeneralPath) shape).curveTo(-860.92725, 602.42126, -870.99225, 602.71027, -881.0453, 602.6223);
        ((GeneralPath) shape).curveTo(-882.3833, 602.6103, -884.0103, 603.31433, -885.5353, 601.6953);
        ((GeneralPath) shape).curveTo(-879.4333, 599.6573, -873.72925, 597.93933, -868.1603, 595.8593);
        ((GeneralPath) shape).curveTo(-852.60626, 590.0493, -838.0633, 582.0473, -823.17725, 574.7973);
        ((GeneralPath) shape).curveTo(-813.1392, 569.9083, -803.56323, 564.1793, -794.6572, 557.4693);
        ((GeneralPath) shape).curveTo(-784.9002, 550.1193, -775.47424, 542.3283, -765.8892, 534.7493);
        ((GeneralPath) shape).curveTo(-764.70123, 533.8103, -763.8302, 532.08435, -761.4842, 533.00934);
        ((GeneralPath) shape).curveTo(-761.0612, 542.5913, -761.8992, 552.1403, -764.1202, 562.05536);
        ((GeneralPath) shape).curveTo(-767.68317, 561.68335, -770.75415, 561.36237, -773.93616, 561.03033);
        ((GeneralPath) shape).curveTo(-774.09814, 564.4713, -772.3492, 566.84534, -770.5961, 569.2103);
        ((GeneralPath) shape).curveTo(-770.98315, 568.3233, -771.30914, 567.4093, -771.55115, 566.47235);
        ((GeneralPath) shape).curveTo(-768.6121, 563.88934, -764.33514, 562.9213, -760.5701, 563.98834);
        ((GeneralPath) shape).curveTo(-746.2511, 411.32834, -762.32715, 254.95834, -815.6751, 111.20834);
        ((GeneralPath) shape).curveTo(-804.14813, 112.83834, -792.62213, 114.468346, -781.0961, 116.09834);
        ((GeneralPath) shape).curveTo(-790.1951, 106.054344, -800.62213, 97.21434, -812.0211, 89.88234);
        ((GeneralPath) shape).curveTo(-813.7691, 84.36734, -807.4611, 79.86034, -802.0711, 77.75934);
        ((GeneralPath) shape).curveTo(-750.7571, 57.75934, -693.4611, 67.16334, -638.5311, 71.08034);
        ((GeneralPath) shape).moveTo(-584.0291, 645.3003);
        ((GeneralPath) shape).curveTo(-568.4871, 643.25726, -553.2121, 639.1893, -538.7121, 633.2333);
        ((GeneralPath) shape).curveTo(-533.8491, 642.2903, -538.4341, 655.0863, -547.9421, 658.99426);
        ((GeneralPath) shape).curveTo(-526.5671, 655.8503, -505.72308, 649.12225, -486.5431, 639.1763);
        ((GeneralPath) shape).curveTo(-484.65808, 648.3553, -489.6091, 658.0873, -497.2941, 663.45026);
        ((GeneralPath) shape).curveTo(-504.9791, 668.81226, -514.8791, 670.26025, -524.1871, 669.1783);
        ((GeneralPath) shape).curveTo(-521.9411, 665.73926, -519.69507, 662.3003, -517.44806, 658.86127);
        ((GeneralPath) shape).curveTo(-532.46204, 661.63525, -547.84607, 662.40027, -563.06104, 661.1283);
        ((GeneralPath) shape).curveTo(-561.596, 657.3213, -559.09204, 653.9213, -555.89105, 651.3923);
        ((GeneralPath) shape).curveTo(-574.73804, 652.59827, -593.7471, 651.25024, -612.2361, 647.39825);
        ((GeneralPath) shape).curveTo(-603.6371, 638.7803, -593.6221, 631.5792, -582.7151, 626.17224);
        ((GeneralPath) shape).curveTo(-580.80206, 632.42126, -581.2791, 639.3712, -584.0291, 645.30023);
        ((GeneralPath) shape).moveTo(-365.7491, 638.56726);
        ((GeneralPath) shape).curveTo(-361.97513, 636.92224, -357.8991, 635.83527, -353.7821, 635.91327);
        ((GeneralPath) shape).curveTo(-343.97812, 636.0973, -335.6191, 642.6233, -327.7181, 648.4313);
        ((GeneralPath) shape).curveTo(-306.4671, 664.0513, -282.9161, 676.53827, -258.0631, 685.36426);
        ((GeneralPath) shape).curveTo(-295.6781, 678.87427, -333.3741, 668.5173, -365.32312, 647.63324);
        ((GeneralPath) shape).curveTo(-367.53613, 646.18726, -370.01712, 643.85223, -369.10114, 641.3732);
        ((GeneralPath) shape).curveTo(-368.58115, 639.96625, -367.12112, 639.16724, -365.74612, 638.5672);

        g.setPaint(new Color(0xE0D086));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_19
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -529.15f, -264.58f));

        // _0_0_0_20

        // _0_0_0_20_0
        g.setComposite(AlphaComposite.getInstance(3, 0.10001f * origAlpha));

        // _0_0_0_20_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1506.8f, 1476.7f));

        // _0_0_0_20_0_0_0

        // _0_0_0_20_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-4.345, 7.606, -5.093, 16.724, -4.923, 25.482);
        ((GeneralPath) shape).curveTo(-4.627, 40.687, -1.8469999, 55.842003, 3.2739997, 70.162);
        ((GeneralPath) shape).curveTo(7.2959995, 81.412, 13.257999, 92.706, 23.461, 98.92);
        ((GeneralPath) shape).curveTo(33.664, 105.134995, 48.937, 104.190994, 55.544, 94.237);
        ((GeneralPath) shape).curveTo(56.444, 103.409, 49.272, 112.171, 40.429, 114.767);
        ((GeneralPath) shape).curveTo(31.586002, 117.363, 21.791, 114.611, 14.302, 109.239);
        ((GeneralPath) shape).curveTo(6.813, 103.868996, 1.3339996, 96.145, -3.2150002, 88.13);
        ((GeneralPath) shape).curveTo(-14.833, 67.661995, -21.25, 44.269997, -21.701, 20.739998);
        ((GeneralPath) shape).curveTo(-21.763, 17.501999, -21.708, 14.212997, -20.79, 11.107998);
        ((GeneralPath) shape).curveTo(-19.648, 7.247998, -17.236, 3.887998, -14.580001, 0.862998);
        ((GeneralPath) shape).curveTo(-4.337001, -10.807002, 10.065999, -18.481003, 25.25, -21.729);
        ((GeneralPath) shape).curveTo(33.639, -23.523, 42.484, -24.006, 50.724, -21.62);
        ((GeneralPath) shape).curveTo(58.965, -19.233002, 66.541, -13.693001, 70.053, -5.866001);
        ((GeneralPath) shape).curveTo(58.651, -12.172001, 46.122, -17.226002, 33.093002, -17.221);
        ((GeneralPath) shape).curveTo(20.064003, -17.215, 6.462002, -11.315001, 3.8146973E-6, -0.001001358);
        ((GeneralPath) shape).moveTo(293.47, 5.4679985);
        ((GeneralPath) shape).curveTo(263.014, 6.7089987, 233.063, 18.175999, 209.564, 37.59);
        ((GeneralPath) shape).lineTo(211.967, 104.04401);
        ((GeneralPath) shape).curveTo(212.24199, 111.65501, 212.65, 119.698006, 216.842, 126.05601);
        ((GeneralPath) shape).curveTo(224.95099, 138.35301, 243.56, 138.57701, 256.79498, 132.113);
        ((GeneralPath) shape).curveTo(250.68698, 140.462, 242.66599, 147.832, 232.81998, 151.005);
        ((GeneralPath) shape).curveTo(222.97398, 154.179, 210.22397, 157.942, 203.12898, 150.41301);
        ((GeneralPath) shape).curveTo(196.78899, 143.686, 196.10999, 128.35701, 195.30598, 119.14901);
        ((GeneralPath) shape).curveTo(192.82498, 90.76501, 195.07698, 61.97401, 201.94098, 34.322006);
        ((GeneralPath) shape).curveTo(202.33199, 32.750008, 202.81998, 31.054007, 204.12798, 30.099007);
        ((GeneralPath) shape).curveTo(205.64998, 28.987007, 207.72697, 29.255007, 209.61197, 29.314007);
        ((GeneralPath) shape).curveTo(224.11797, 29.768007, 234.30296, 15.745007, 242.08096, 3.4910069);
        ((GeneralPath) shape).curveTo(244.26796, 0.046006918, 246.57796, -3.483993, 249.98296, -5.732993);
        ((GeneralPath) shape).curveTo(255.21896, -9.190993, 261.97894, -8.981993, 268.23895, -8.554993);
        ((GeneralPath) shape).curveTo(289.99896, -7.0709925, 311.68097, -4.4559927, 333.16995, -0.72499275);
        ((GeneralPath) shape).curveTo(321.47095, 6.111007, 307.00797, 4.916007, 293.46994, 5.468007);

        g.setPaint(BLACK);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_20_0_0_0

        g.setTransform(transformations.pop()); // _0_0_0_20
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1019.2f, 1189.4f));

        // _0_0_0_21

        // _0_0_0_21_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.93, 8.07, -0.951, 15.704, -4.252, 23.155);
        ((GeneralPath) shape).curveTo(-6.067, 22.444, -7.5199995, 21.888, -8.962999, 21.308);
        ((GeneralPath) shape).curveTo(-15.386, 18.724, -21.777, 19.163, -27.994, 21.85);
        ((GeneralPath) shape).curveTo(-37.906998, 26.134, -41.303, 35.603, -36.647, 45.459);
        ((GeneralPath) shape).curveTo(-35.87, 47.104, -35.121998, 48.763, -34.003, 51.192);
        ((GeneralPath) shape).curveTo(-47.218998, 51.052002, -48.737, 50.622, -60.329998, 43.948);
        ((GeneralPath) shape).curveTo(-60.216, 45.262, -60.295998, 46.267002, -60.025997, 47.167004);
        ((GeneralPath) shape).curveTo(-55.896996, 60.955, -51.864998, 74.773, -47.518997, 88.493004);
        ((GeneralPath) shape).curveTo(-43.373997, 101.58, -37.275997, 113.681, -27.771997, 123.77501);
        ((GeneralPath) shape).curveTo(-24.806997, 126.92301, -21.587997, 129.932, -18.076998, 132.43001);
        ((GeneralPath) shape).curveTo(-15.725998, 134.104, -12.742998, 135.162, -9.886998, 135.79501);
        ((GeneralPath) shape).curveTo(-4.6619983, 136.95401, -0.16899776, 135.20702, 3.0530014, 130.88802);
        ((GeneralPath) shape).curveTo(4.5000014, 128.94902, 5.6530013, 126.750015, 6.6800013, 124.54701);
        ((GeneralPath) shape).curveTo(11.647001, 113.88701, 14.706001, 102.597015, 16.948002, 91.127014);
        ((GeneralPath) shape).curveTo(20.282001, 74.06601, 23.535002, 56.975014, 26.160002, 39.796013);
        ((GeneralPath) shape).curveTo(27.457003, 31.304012, 29.076002, 22.594013, 26.343002, 13.460012);
        ((GeneralPath) shape).curveTo(20.501003, 8.636013, 13.3340025, 5.379012, 6.2490025, 2.013013);
        ((GeneralPath) shape).curveTo(4.3830023, 1.127013, 2.2880025, 0.71901286, 2.3841858E-6, -0.0029871464);
        ((GeneralPath) shape).moveTo(-50.818996, -14.610987);
        ((GeneralPath) shape).curveTo(-53.078995, -17.601986, -57.995995, -16.751987, -59.582996, -13.362987);
        ((GeneralPath) shape).curveTo(-61.127995, -10.0609865, -60.221996, -5.3899865, -57.549995, -2.8919868);
        ((GeneralPath) shape).curveTo(-55.959995, -1.4049869, -53.549995, -1.0269868, -51.511993, -1.9449868);
        ((GeneralPath) shape).curveTo(-49.301994, -2.9399867, -48.212994, -4.962987, -48.309994, -9.367987);
        ((GeneralPath) shape).curveTo(-48.759995, -10.348987, -49.420994, -12.758986, -50.818993, -14.610987);
        ((GeneralPath) shape).moveTo(25.854004, 1.2270136);
        ((GeneralPath) shape).curveTo(32.092003, 3.9890137, 35.510002, 8.170013, 35.603004, 15.601013);
        ((GeneralPath) shape).curveTo(35.795006, 30.910013, 33.907005, 45.972015, 31.253004, 60.93701);
        ((GeneralPath) shape).curveTo(28.601004, 75.89301, 25.340004, 90.74601, 22.080004, 105.58601);
        ((GeneralPath) shape).curveTo(20.744003, 111.669014, 19.059004, 117.72901, 16.880005, 123.555016);
        ((GeneralPath) shape).curveTo(15.284005, 127.820015, 12.921005, 131.88802, 10.355005, 135.67502);
        ((GeneralPath) shape).curveTo(7.5310054, 139.84302, 3.3480053, 142.59402, -1.7059946, 143.33801);
        ((GeneralPath) shape).curveTo(-7.6929946, 144.22101, -13.668995, 144.06102, -19.100994, 140.83301);
        ((GeneralPath) shape).curveTo(-21.660994, 139.311, -24.235994, 137.76901, -26.593994, 135.962);
        ((GeneralPath) shape).curveTo(-36.291992, 128.53, -43.342995, 118.98201, -48.303993, 107.895004);
        ((GeneralPath) shape).curveTo(-54.187992, 94.745, -58.865993, 81.13901, -62.996994, 67.354004);
        ((GeneralPath) shape).curveTo(-67.049995, 53.827003, -70.37599, 40.180004, -71.604996, 25.998005);
        ((GeneralPath) shape).curveTo(-73.342995, 5.9500046, -74.294, -14.099995, -74.038994, -34.211994);
        ((GeneralPath) shape).curveTo(-74.01499, -36.040993, -73.59699, -37.865993, -73.297, -40.192993);
        ((GeneralPath) shape).curveTo(-71.089, -39.846992, -69.196, -39.83499, -67.513, -39.232994);
        ((GeneralPath) shape).curveTo(-62.917, -37.588993, -58.342003, -35.848995, -53.877, -33.877995);
        ((GeneralPath) shape).curveTo(-27.558998, -22.261993, -1.8989983, -9.152994, 25.089005, 0.9480057);
        ((GeneralPath) shape).curveTo(25.343004, 1.0440056, 25.606005, 1.1170057, 25.854004, 1.2270057);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_21
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1645.4f, 843.61f));

        // _0_0_0_22

        // _0_0_0_22_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-2.249, -1.654, -4.325, -3.3, -4.492, -6.684);
        ((GeneralPath) shape).curveTo(-2.4780002, -9.907, -0.23600006, -13.288, 1.7849998, -16.797);
        ((GeneralPath) shape).curveTo(3.2719998, -19.378, 4.472, -22.125, 5.795, -24.801);
        ((GeneralPath) shape).curveTo(7.296, -27.833, 7.487, -30.868, 6.7790003, -34.262);
        ((GeneralPath) shape).curveTo(2.1200004, -56.584, -2.0839996, -79.003006, -6.991, -101.268);
        ((GeneralPath) shape).curveTo(-9.2630005, -111.576, -12.775, -121.611, -15.777, -131.754);
        ((GeneralPath) shape).curveTo(-15.897, -132.157, -16.569, -132.397, -17.388, -133.021);
        ((GeneralPath) shape).curveTo(-18.525, -131.23799, -19.832, -129.582, -20.723, -127.726);
        ((GeneralPath) shape).curveTo(-28.175999, -112.205, -39.64, -99.999, -52.472, -88.871);
        ((GeneralPath) shape).curveTo(-66.886, -76.372, -83.225, -73.504005, -101.212006, -79.008);
        ((GeneralPath) shape).curveTo(-108.773, -81.32201, -115.90201, -84.583, -122.34901, -89.312004);
        ((GeneralPath) shape).curveTo(-139.25601, -101.712006, -153.01901, -116.86101, -163.18701, -135.245);
        ((GeneralPath) shape).curveTo(-175.45201, -157.42499, -185.31001, -180.635, -193.06201, -204.75);
        ((GeneralPath) shape).curveTo(-198.55501, -221.836, -203.41602, -239.12201, -205.54701, -256.963);
        ((GeneralPath) shape).curveTo(-207.38101, -272.323, -208.83902, -287.77402, -209.42601, -303.224);
        ((GeneralPath) shape).curveTo(-210.04501, -319.502, -209.852, -335.843, -209.223, -352.126);
        ((GeneralPath) shape).curveTo(-208.74301, -364.591, -207.28201, -377.038, -205.806, -389.44);
        ((GeneralPath) shape).curveTo(-204.073, -403.997, -201.908, -418.504, -199.832, -433.019);
        ((GeneralPath) shape).curveTo(-195.714, -461.815, -190.284, -490.32602, -181.016, -517.986);
        ((GeneralPath) shape).curveTo(-180.774, -518.70703, -180.68901, -519.481, -180.53201, -520.224);
        ((GeneralPath) shape).curveTo(-182.07701, -520.995, -182.50502, -519.838, -183.01302, -519.021);
        ((GeneralPath) shape).curveTo(-189.90402, -507.952, -196.90901, -496.95, -203.57301, -485.745);
        ((GeneralPath) shape).curveTo(-205.76701, -482.057, -207.51102, -477.964, -208.70302, -473.837);
        ((GeneralPath) shape).curveTo(-215.94702, -448.768, -221.35602, -423.289, -225.42401, -397.51202);
        ((GeneralPath) shape).curveTo(-228.21701, -379.81104, -231.43901, -362.17603, -234.091, -344.45602);
        ((GeneralPath) shape).curveTo(-236.864, -325.93002, -239.269, -307.34702, -241.67401, -288.769);
        ((GeneralPath) shape).curveTo(-243.52301, -274.487, -244.81601, -260.16302, -245.03201, -245.73102);
        ((GeneralPath) shape).curveTo(-245.34702, -224.77802, -244.33601, -203.92801, -241.97401, -183.10002);
        ((GeneralPath) shape).curveTo(-238.63202, -153.62302, -232.97702, -124.61102, -225.19202, -96.01502);
        ((GeneralPath) shape).curveTo(-220.83801, -80.024025, -215.60301, -64.30902, -208.95201, -49.096024);
        ((GeneralPath) shape).curveTo(-201.92702, -33.027023, -192.897, -18.254025, -180.639, -5.611023);
        ((GeneralPath) shape).curveTo(-159.552, 16.138977, -133.988, 29.626976, -104.26601, 35.17798);
        ((GeneralPath) shape).curveTo(-84.463005, 38.87698, -64.44301, 40.89098, -44.309006, 40.85098);
        ((GeneralPath) shape).curveTo(-31.564007, 40.825977, -18.743006, 40.96098, -6.112007, 38.55798);
        ((GeneralPath) shape).curveTo(-3.189007, 38.00198, -0.27100706, 37.41798, 4.435993, 36.49798);
        ((GeneralPath) shape).curveTo(-1.4130068, 32.73998, -5.716007, 29.994978, -9.999007, 27.219978);
        ((GeneralPath) shape).curveTo(-14.411007, 24.361979, -17.986008, 20.803978, -19.769009, 15.530978);
        ((GeneralPath) shape).curveTo(-18.35801, 13.282978, -15.974009, 13.475978, -13.985008, 13.263978);
        ((GeneralPath) shape).curveTo(-6.448008, 12.461978, -0.20300865, 8.780978, 6.342991, 4.930978);
        ((GeneralPath) shape).curveTo(5.065991, 1.8229778, 2.0429907, 1.4999778, 0.00399065, -2.2411346E-5);
        ((GeneralPath) shape).moveTo(-167.676, -570.64);
        ((GeneralPath) shape).curveTo(-161.567, -578.624, -155.614, -586.731, -149.694, -594.857);
        ((GeneralPath) shape).curveTo(-147.619, -597.705, -145.62, -600.656, -143.99, -603.772);
        ((GeneralPath) shape).curveTo(-137.19101, -616.76794, -130.53, -629.837, -123.86301, -642.902);
        ((GeneralPath) shape).curveTo(-123.035, -644.524, -122.47201, -646.282, -121.590004, -648.464);
        ((GeneralPath) shape).curveTo(-123.26401, -648.669, -124.28001, -648.933, -125.284004, -648.894);
        ((GeneralPath) shape).curveTo(-132.61, -648.612, -139.935, -648.32, -147.25601, -647.933);
        ((GeneralPath) shape).curveTo(-157.28702, -647.40295, -167.309, -646.695, -177.34302, -646.22797);
        ((GeneralPath) shape).curveTo(-197.44502, -645.29, -217.55202, -645.34796, -237.66402, -645.99994);
        ((GeneralPath) shape).curveTo(-244.18102, -646.21094, -250.72202, -645.85895, -257.23, -646.19495);
        ((GeneralPath) shape).curveTo(-271.333, -646.923, -285.42102, -647.9279, -299.51602, -648.82196);
        ((GeneralPath) shape).curveTo(-301.95602, -648.97595, -304.39502, -649.17694, -306.838, -649.29297);
        ((GeneralPath) shape).curveTo(-339.69202, -650.86194, -372.55902, -651.75696, -405.454, -651.206);
        ((GeneralPath) shape).curveTo(-408.68402, -651.152, -411.91, -650.934, -415.463, -650.778);
        ((GeneralPath) shape).curveTo(-416.83102, -646.62604, -417.42902, -642.62604, -417.44302, -638.637);
        ((GeneralPath) shape).curveTo(-417.46402, -632.668, -417.12302, -626.693, -416.77203, -620.73004);
        ((GeneralPath) shape).curveTo(-416.31003, -612.86505, -415.66702, -605.0101, -415.17804, -597.14606);
        ((GeneralPath) shape).curveTo(-415.13303, -596.4241, -415.63904, -595.6661, -415.88403, -594.94305);
        ((GeneralPath) shape).curveTo(-416.51404, -595.06903, -417.33502, -595.05505, -417.40402, -595.27405);
        ((GeneralPath) shape).curveTo(-420.87503, -606.44507, -423.308, -617.87006, -424.11102, -629.51904);
        ((GeneralPath) shape).curveTo(-424.553, -635.92505, -423.726, -642.418, -423.45303, -649.33);
        ((GeneralPath) shape).curveTo(-425.18103, -649.181, -426.63104, -649.42804, -427.70004, -648.90204);
        ((GeneralPath) shape).curveTo(-435.00903, -645.30707, -442.25104, -641.57404, -449.48004, -637.81903);
        ((GeneralPath) shape).curveTo(-450.67203, -637.2, -451.68103, -636.23303, -452.79605, -635.45703);
        ((GeneralPath) shape).curveTo(-455.28406, -633.72705, -456.24905, -631.408, -455.71405, -628.405);
        ((GeneralPath) shape).curveTo(-454.23706, -620.12604, -453.10605, -611.773, -451.26505, -603.577);
        ((GeneralPath) shape).curveTo(-449.41104, -595.32404, -446.25003, -587.504, -440.85306, -580.80804);
        ((GeneralPath) shape).curveTo(-442.44604, -579.1871, -443.54504, -580.48004, -444.40805, -581.2731);
        ((GeneralPath) shape).curveTo(-448.66504, -585.1811, -452.02805, -589.8371, -454.26804, -595.1221);
        ((GeneralPath) shape).curveTo(-456.69803, -600.85504, -458.61203, -606.80707, -460.75705, -612.6611);
        ((GeneralPath) shape).curveTo(-461.09604, -613.5881, -461.46606, -614.5041, -462.50305, -617.1861);
        ((GeneralPath) shape).curveTo(-462.95505, -614.4151, -463.24304, -613.4751, -463.24106, -612.5361);
        ((GeneralPath) shape).curveTo(-463.21805, -602.68805, -462.02206, -593.0021, -458.48206, -583.7601);
        ((GeneralPath) shape).curveTo(-457.32706, -580.7471, -455.69507, -577.86206, -453.92404, -575.1521);
        ((GeneralPath) shape).curveTo(-450.34204, -569.6701, -445.21503, -566.4171, -438.76105, -565.0271);
        ((GeneralPath) shape).curveTo(-427.43704, -562.5901, -416.06906, -563.1011, -404.68103, -564.1751);
        ((GeneralPath) shape).curveTo(-402.25504, -564.4041, -399.86102, -564.9641, -398.22003, -565.2421);
        ((GeneralPath) shape).curveTo(-394.38504, -568.90015, -390.96503, -572.0061, -387.71902, -575.28314);
        ((GeneralPath) shape).curveTo(-370.77002, -592.3931, -350.79303, -604.6882, -328.08502, -612.49615);
        ((GeneralPath) shape).curveTo(-310.601, -618.5082, -292.52103, -620.04016, -274.19403, -618.2872);
        ((GeneralPath) shape).curveTo(-266.64203, -617.5652, -259.15503, -616.15015, -251.65303, -614.9552);
        ((GeneralPath) shape).curveTo(-250.70203, -614.8032, -249.82603, -614.1802, -248.92403, -613.7212);
        ((GeneralPath) shape).curveTo(-258.29602, -614.2592, -267.66302, -614.9962, -277.04303, -615.2742);
        ((GeneralPath) shape).curveTo(-297.89902, -615.89215, -317.29703, -610.4422, -335.58603, -600.64716);
        ((GeneralPath) shape).curveTo(-360.13803, -587.49915, -380.84204, -569.7211, -397.93903, -547.86316);
        ((GeneralPath) shape).curveTo(-405.114, -538.68915, -411.76303, -529.00916, -417.72702, -519.0082);
        ((GeneralPath) shape).curveTo(-426.48203, -504.3282, -434.51602, -489.21317, -442.653, -474.17218);
        ((GeneralPath) shape).curveTo(-449.12302, -462.21118, -456.023, -450.54617, -464.263, -439.70517);
        ((GeneralPath) shape).curveTo(-469.712, -432.53418, -475.825, -426.02017, -482.998, -420.53516);
        ((GeneralPath) shape).curveTo(-484.28998, -419.54715, -485.87698, -418.72116, -486.737, -417.42816);
        ((GeneralPath) shape).curveTo(-490.646, -411.55017, -496.335, -407.94916, -502.307, -404.63617);
        ((GeneralPath) shape).curveTo(-502.711, -404.41217, -502.91602, -403.82916, -503.337, -403.24017);
        ((GeneralPath) shape).curveTo(-502.582, -400.80417, -500.915, -399.1082, -498.34, -398.63617);
        ((GeneralPath) shape).curveTo(-495.427, -398.10117, -492.438, -397.99216, -489.512, -397.51318);
        ((GeneralPath) shape).curveTo(-488.54498, -397.3542, -487.064, -396.77518, -486.892, -396.11017);
        ((GeneralPath) shape).curveTo(-486.6, -394.98218, -486.726, -393.22116, -487.449, -392.45816);
        ((GeneralPath) shape).curveTo(-489.29, -390.51617, -491.512, -388.91815, -493.668, -387.29715);
        ((GeneralPath) shape).curveTo(-495.764, -385.72015, -498.44598, -384.86716, -499.893, -382.61816);
        ((GeneralPath) shape).curveTo(-499.009, -380.68716, -497.51, -380.97116, -496.236, -380.97217);
        ((GeneralPath) shape).curveTo(-484.199, -380.97617, -472.46698, -383.11118, -460.97, -386.47418);
        ((GeneralPath) shape).curveTo(-440.818, -392.3712, -421.753, -400.8372, -403.528, -411.23718);
        ((GeneralPath) shape).curveTo(-400.954, -412.70517, -398.233, -413.91418, -395.58002, -415.2432);
        ((GeneralPath) shape).lineTo(-395.579, -415.2422);
        ((GeneralPath) shape).curveTo(-394.984, -415.4232, -394.389, -415.6042, -393.795, -415.7852);
        ((GeneralPath) shape).curveTo(-394.10602, -415.2772, -394.41702, -414.77017, -394.72803, -414.26318);
        ((GeneralPath) shape).curveTo(-398.98004, -409.18417, -404.41104, -405.5222, -410.02103, -402.24817);
        ((GeneralPath) shape).curveTo(-430.558, -390.26117, -452.19504, -380.96216, -475.69003, -376.50317);
        ((GeneralPath) shape).curveTo(-486.72803, -374.40717, -497.80103, -374.11917, -508.86804, -376.46817);
        ((GeneralPath) shape).curveTo(-510.43204, -376.80017, -512.0491, -376.88416, -514.21, -377.15317);
        ((GeneralPath) shape).curveTo(-512.69904, -381.24615, -509.37503, -383.18317, -506.53903, -385.46817);
        ((GeneralPath) shape).curveTo(-503.61902, -387.82217, -500.51602, -389.95016, -497.30103, -392.31818);
        ((GeneralPath) shape).curveTo(-506.41403, -396.61816, -507.773, -398.1302, -510.73703, -407.30316);
        ((GeneralPath) shape).curveTo(-509.43802, -407.90417, -508.06003, -408.50717, -506.71304, -409.17316);
        ((GeneralPath) shape).curveTo(-499.10104, -412.93616, -492.37805, -418.00217, -486.24603, -423.78815);
        ((GeneralPath) shape).curveTo(-478.48404, -431.11014, -472.11102, -439.62314, -466.90002, -448.89413);
        ((GeneralPath) shape).curveTo(-460.38004, -460.49612, -454.19302, -472.28815, -448.028, -484.08414);
        ((GeneralPath) shape).curveTo(-441.742, -496.11313, -435.18402, -507.98914, -429.893, -520.54517);
        ((GeneralPath) shape).curveTo(-426.745, -528.0162, -422.29602, -534.93915, -418.427, -542.10516);
        ((GeneralPath) shape).curveTo(-417.418, -543.97217, -416.39, -545.82916, -415.152, -548.0892);
        ((GeneralPath) shape).curveTo(-417.185, -548.6092, -418.71002, -549.03815, -420.254, -549.38715);
        ((GeneralPath) shape).curveTo(-426.07098, -550.7012, -431.914, -551.90717, -437.71, -553.30817);
        ((GeneralPath) shape).curveTo(-445.296, -555.1412, -451.663, -559.35315, -457.485, -564.30115);
        ((GeneralPath) shape).curveTo(-463.474, -569.39215, -466.93597, -576.20215, -468.732, -583.74915);
        ((GeneralPath) shape).curveTo(-470.111, -589.5502, -470.95898, -595.47614, -472.07098, -601.34216);
        ((GeneralPath) shape).curveTo(-472.205, -602.04315, -472.511, -602.71216, -472.88898, -603.85516);
        ((GeneralPath) shape).curveTo(-473.99097, -602.93915, -474.89697, -602.37915, -475.55298, -601.6072);
        ((GeneralPath) shape).curveTo(-478.89597, -597.6742, -482.451, -593.8822, -485.42398, -589.68115);
        ((GeneralPath) shape).curveTo(-494.57498, -576.74915, -501.76297, -562.7842, -506.88898, -547.7551);
        ((GeneralPath) shape).curveTo(-508.46, -543.1491, -510.49698, -538.69714, -512.42, -534.2171);
        ((GeneralPath) shape).curveTo(-518.451, -520.1651, -522.12695, -505.4101, -525.279, -490.5281);
        ((GeneralPath) shape).curveTo(-528.54297, -475.1221, -531.64996, -459.6781, -534.488, -444.18912);
        ((GeneralPath) shape).curveTo(-536.646, -432.4081, -537.406, -420.44513, -537.23, -408.4771);
        ((GeneralPath) shape).curveTo(-536.839, -381.8181, -534.805, -355.2601, -530.235, -328.9901);
        ((GeneralPath) shape).curveTo(-528.146, -316.97812, -525.404, -304.97412, -521.666, -293.38312);
        ((GeneralPath) shape).curveTo(-517.007, -278.93512, -511.036, -264.90912, -505.578, -250.72212);
        ((GeneralPath) shape).curveTo(-504.612, -248.21213, -503.385, -245.80312, -502.38, -243.57013);
        ((GeneralPath) shape).curveTo(-500.202, -243.13612, -499.58002, -244.53513, -498.97, -245.63313);
        ((GeneralPath) shape).curveTo(-494.883, -252.98914, -490.915, -260.41214, -486.832, -267.77014);
        ((GeneralPath) shape).curveTo(-481.033, -278.21915, -475.439, -288.79315, -469.275, -299.02313);
        ((GeneralPath) shape).curveTo(-457.10498, -319.22113, -441.647, -336.69113, -423.694, -351.92212);
        ((GeneralPath) shape).curveTo(-405.869, -367.0451, -387.889, -381.98413, -369.97, -396.99512);
        ((GeneralPath) shape).curveTo(-351.426, -412.5281, -333.207, -428.4731, -314.225, -443.45212);
        ((GeneralPath) shape).curveTo(-297.169, -456.9121, -279.172, -469.1711, -261.78, -482.2141);
        ((GeneralPath) shape).curveTo(-248.956, -491.83212, -236.249, -501.6261, -223.827, -511.7561);
        ((GeneralPath) shape).curveTo(-202.663, -529.0151, -184.252, -548.9781, -167.676, -570.6401);
        ((GeneralPath) shape).moveTo(-486.526, -647.0951);
        ((GeneralPath) shape).curveTo(-486.66, -647.2881, -486.875, -647.5121, -487.085, -647.5511);
        ((GeneralPath) shape).curveTo(-487.882, -647.7011, -488.688, -647.83307, -489.496, -647.8791);
        ((GeneralPath) shape).curveTo(-498.4, -648.3911, -507.305, -648.8851, -516.677, -649.4091);
        ((GeneralPath) shape).curveTo(-517.334, -646.1421, -518.011, -643.2921, -518.47003, -640.4071);
        ((GeneralPath) shape).curveTo(-520.778, -625.8641, -524.88904, -611.8161, -529.999, -598.0381);
        ((GeneralPath) shape).curveTo(-530.911, -595.5801, -531.41705, -592.8611, -533.921, -591.34607);
        ((GeneralPath) shape).curveTo(-533.52203, -594.2231, -533.145, -597.10205, -532.715, -599.97406);
        ((GeneralPath) shape).curveTo(-531.02203, -611.25507, -529.215, -622.5201, -527.65405, -633.82007);
        ((GeneralPath) shape).curveTo(-526.991, -638.62006, -525.0411, -643.31506, -526.19006, -648.30304);
        ((GeneralPath) shape).curveTo(-531.9521, -650.81305, -538.00604, -651.44104, -551.10004, -650.84705);
        ((GeneralPath) shape).curveTo(-553.70306, -648.66205, -554.01605, -645.20605, -554.65106, -642.15906);
        ((GeneralPath) shape).curveTo(-557.5881, -628.07007, -560.2911, -613.93005, -562.9291, -599.78107);
        ((GeneralPath) shape).curveTo(-564.3681, -592.0641, -565.51105, -584.29205, -566.8171, -576.36505);
        ((GeneralPath) shape).curveTo(-568.8061, -576.69104, -568.45105, -578.26904, -568.5561, -579.29706);
        ((GeneralPath) shape).curveTo(-568.8591, -582.26904, -569.1501, -585.267, -569.08307, -588.24603);
        ((GeneralPath) shape).curveTo(-568.72406, -604.283, -568.05206, -620.30505, -565.27405, -636.14703);
        ((GeneralPath) shape).curveTo(-564.619, -639.88306, -563.5801, -643.551, -562.74207, -647.25604);
        ((GeneralPath) shape).curveTo(-562.45306, -648.53406, -562.24005, -649.82806, -561.8791, -651.7);
        ((GeneralPath) shape).curveTo(-571.2331, -653.60504, -580.2961, -654.236, -589.7121, -655.50604);
        ((GeneralPath) shape).curveTo(-589.9851, -653.85504, -590.3701, -652.598, -590.3741, -651.34);
        ((GeneralPath) shape).curveTo(-590.4121, -639.89404, -591.6571, -628.551, -593.25006, -617.24005);
        ((GeneralPath) shape).curveTo(-594.47205, -608.56506, -594.15106, -599.88403, -593.50604, -591.19604);
        ((GeneralPath) shape).curveTo(-592.6221, -579.27704, -591.671, -567.36206, -590.856, -555.43805);
        ((GeneralPath) shape).curveTo(-590.02203, -543.23804, -589.39, -531.025, -588.53503, -518.82605);
        ((GeneralPath) shape).curveTo(-587.775, -507.98404, -586.856, -497.15305, -585.95905, -486.32004);
        ((GeneralPath) shape).curveTo(-585.42206, -479.82303, -584.76306, -473.33505, -584.20905, -466.83905);
        ((GeneralPath) shape).curveTo(-581.921, -440.03204, -579.955, -413.19406, -577.27704, -386.42706);
        ((GeneralPath) shape).curveTo(-575.27704, -366.42908, -572.30707, -346.52905, -569.88904, -326.57108);
        ((GeneralPath) shape).curveTo(-568.58203, -315.78207, -567.58606, -304.95508, -566.34503, -294.15707);
        ((GeneralPath) shape).curveTo(-564.95, -282.01306, -563.395, -269.88608, -561.98505, -257.74408);
        ((GeneralPath) shape).curveTo(-560.66907, -246.40707, -559.44403, -235.06007, -558.19104, -223.71509);
        ((GeneralPath) shape).curveTo(-556.72906, -210.48209, -555.041, -197.29509, -552.64404, -184.1791);
        ((GeneralPath) shape).curveTo(-550.254, -171.09709, -548.58905, -157.88309, -546.65405, -144.71909);
        ((GeneralPath) shape).curveTo(-545.84204, -139.20209, -544.6221, -133.70709, -545.2991, -128.07008);
        ((GeneralPath) shape).curveTo(-546.5011, -131.27008, -547.91406, -134.41109, -548.8291, -137.69109);
        ((GeneralPath) shape).curveTo(-555.1811, -160.45308, -560.7101, -183.42108, -564.4351, -206.76408);
        ((GeneralPath) shape).curveTo(-566.2291, -218.01009, -567.1441, -229.39609, -568.47815, -240.71608);
        ((GeneralPath) shape).curveTo(-569.78015, -251.77008, -570.93915, -262.8441, -572.46014, -273.86807);
        ((GeneralPath) shape).curveTo(-575.98816, -299.41907, -579.9451, -324.91208, -583.26215, -350.48907);
        ((GeneralPath) shape).curveTo(-586.6152, -376.34308, -589.43713, -402.26508, -592.4351, -428.16406);
        ((GeneralPath) shape).curveTo(-594.96515, -450.02905, -596.5991, -471.96906, -597.8281, -493.94406);
        ((GeneralPath) shape).curveTo(-598.73914, -510.22006, -599.8081, -526.48804, -600.7431, -542.76306);
        ((GeneralPath) shape).curveTo(-601.3031, -552.52606, -602.0151, -562.2931, -602.1511, -572.06506);
        ((GeneralPath) shape).curveTo(-602.26715, -580.4731, -601.6121, -588.88904, -601.39514, -597.3041);
        ((GeneralPath) shape).curveTo(-601.2061, -604.63806, -601.13214, -611.9761, -601.06213, -619.31305);
        ((GeneralPath) shape).curveTo(-601.0521, -620.35406, -601.35614, -621.39703, -601.58716, -622.91907);
        ((GeneralPath) shape).curveTo(-607.4902, -624.6531, -613.48315, -623.1611, -619.33716, -623.60504);
        ((GeneralPath) shape).curveTo(-625.5552, -624.07806, -631.82416, -623.838, -638.0682, -624.03204);
        ((GeneralPath) shape).curveTo(-643.99115, -624.215, -649.9092, -624.55707, -656.10516, -624.84106);
        ((GeneralPath) shape).curveTo(-656.5362, -623.02405, -657.0292, -621.50604, -657.24316, -619.94904);
        ((GeneralPath) shape).curveTo(-659.3932, -604.34705, -661.7032, -588.76306, -663.5502, -573.12506);
        ((GeneralPath) shape).curveTo(-665.1432, -559.64105, -666.1772, -546.09204, -667.48816, -532.5751);
        ((GeneralPath) shape).curveTo(-669.7242, -509.52808, -669.50116, -486.42007, -668.83417, -463.3321);
        ((GeneralPath) shape).curveTo(-668.44214, -449.7721, -667.1352, -436.2381, -666.19714, -422.6951);
        ((GeneralPath) shape).curveTo(-665.84015, -417.5451, -665.18915, -412.4111, -664.9711, -407.2571);
        ((GeneralPath) shape).curveTo(-664.22015, -389.57812, -661.66016, -372.1021, -658.8331, -354.6861);
        ((GeneralPath) shape).curveTo(-653.39215, -321.1751, -646.4191, -287.9591, -638.8261, -254.8711);
        ((GeneralPath) shape).curveTo(-634.01514, -233.90709, -626.8181, -213.7011, -619.4311, -193.5591);
        ((GeneralPath) shape).curveTo(-615.3181, -182.3441, -610.9481, -171.22209, -606.7641, -160.0321);
        ((GeneralPath) shape).curveTo(-606.2421, -158.6381, -606.0841, -157.1071, -605.7911, -155.6271);
        ((GeneralPath) shape).curveTo(-606.91406, -156.5991, -608.2981, -157.42511, -608.98505, -158.64311);
        ((GeneralPath) shape).curveTo(-611.6531, -163.37212, -614.335, -168.1271, -616.52106, -173.0881);
        ((GeneralPath) shape).curveTo(-629.47504, -202.4841, -640.30005, -232.6551, -647.26306, -264.0371);
        ((GeneralPath) shape).curveTo(-653.84906, -293.72012, -660.0121, -323.5111, -665.5751, -353.40112);
        ((GeneralPath) shape).curveTo(-669.69806, -375.55313, -672.9001, -397.87213, -674.81006, -420.38412);
        ((GeneralPath) shape).curveTo(-677.20105, -448.55612, -679.1321, -476.74112, -680.3821, -504.98312);
        ((GeneralPath) shape).curveTo(-681.1891, -523.2191, -680.3821, -541.3831, -678.8641, -559.5501);
        ((GeneralPath) shape).curveTo(-677.7781, -572.54913, -677.0591, -585.5781, -676.08905, -598.5871);
        ((GeneralPath) shape).curveTo(-675.54407, -605.9001, -674.861, -613.2041, -674.171, -620.5051);
        ((GeneralPath) shape).curveTo(-673.27704, -629.97314, -672.23804, -639.4271, -671.42505, -648.9021);
        ((GeneralPath) shape).curveTo(-671.15204, -652.0881, -671.382, -655.3161, -671.382, -658.3331);
        ((GeneralPath) shape).curveTo(-677.76, -660.40015, -691.07904, -660.7161, -699.48303, -659.0791);
        ((GeneralPath) shape).curveTo(-700.89404, -656.9391, -701.15704, -654.2331, -701.40405, -651.5661);
        ((GeneralPath) shape).curveTo(-703.20404, -632.0961, -704.9551, -612.6211, -706.75305, -593.1511);
        ((GeneralPath) shape).curveTo(-706.8431, -592.1781, -707.21906, -591.23114, -707.47107, -590.2351);
        ((GeneralPath) shape).curveTo(-709.87305, -590.9671, -709.80505, -592.7481, -709.89905, -594.3001);
        ((GeneralPath) shape).curveTo(-710.655, -606.7961, -710.76605, -619.2951, -709.593, -631.7711);
        ((GeneralPath) shape).curveTo(-708.932, -638.8031, -708.007, -645.8101, -707.31604, -652.8391);
        ((GeneralPath) shape).curveTo(-707.10803, -654.95514, -707.283, -657.1101, -707.283, -659.1101);
        ((GeneralPath) shape).curveTo(-710.978, -661.0681, -714.62305, -660.8151, -718.064, -660.7531);
        ((GeneralPath) shape).curveTo(-726.42303, -660.6031, -734.64703, -663.4261, -743.307, -662.1041);
        ((GeneralPath) shape).curveTo(-744.543, -658.10614, -743.71204, -654.3291, -743.515, -650.60913);
        ((GeneralPath) shape).curveTo(-742.624, -633.7841, -741.642, -616.9641, -740.715, -600.1411);
        ((GeneralPath) shape).curveTo(-740.62805, -598.5741, -740.703, -596.9981, -741.77106, -595.12213);
        ((GeneralPath) shape).curveTo(-742.1841, -595.8471, -742.8171, -596.5261, -742.97504, -597.30316);
        ((GeneralPath) shape).curveTo(-746.55505, -614.89215, -749.53, -632.55316, -749.69806, -650.58417);
        ((GeneralPath) shape).curveTo(-749.73804, -654.86914, -749.32306, -659.2812, -751.3851, -663.83716);
        ((GeneralPath) shape).curveTo(-760.62506, -664.8132, -769.9781, -665.8022, -779.4101, -666.79816);
        ((GeneralPath) shape).curveTo(-780.9601, -663.6122, -780.5171, -660.29315, -780.2851, -657.1072);
        ((GeneralPath) shape).curveTo(-779.4991, -646.2702, -778.4901, -635.44916, -777.5711, -624.6222);
        ((GeneralPath) shape).curveTo(-777.3191, -621.64417, -776.9591, -618.6692, -776.8601, -615.6862);
        ((GeneralPath) shape).curveTo(-776.1801, -595.2812, -773.7761, -575.0512, -770.73413, -554.8872);
        ((GeneralPath) shape).curveTo(-768.3441, -539.0402, -765.89716, -523.2002, -763.4331, -507.3642);
        ((GeneralPath) shape).curveTo(-760.6311, -489.3572, -756.1781, -471.7092, -751.7291, -454.0642);
        ((GeneralPath) shape).curveTo(-736.4951, -393.6582, -717.48413, -334.4742, -693.6901, -276.88422);
        ((GeneralPath) shape).curveTo(-685.60114, -257.30823, -676.8001, -238.01321, -667.8631, -218.80522);
        ((GeneralPath) shape).curveTo(-653.1901, -187.26822, -638.0141, -155.97122, -621.76807, -125.203224);
        ((GeneralPath) shape).curveTo(-611.60406, -105.953224, -600.28906, -87.40123, -588.3061, -69.24123);
        ((GeneralPath) shape).curveTo(-583.7641, -62.358227, -577.9101, -56.914227, -570.2971, -51.783226);
        ((GeneralPath) shape).curveTo(-570.7811, -66.45723, -576.10913, -79.480225, -576.60315, -93.69122);
        ((GeneralPath) shape).curveTo(-572.3132, -93.11422, -569.1592, -91.83723, -566.2842, -89.841225);
        ((GeneralPath) shape).curveTo(-561.9972, -86.86523, -557.20917, -85.11122, -551.69415, -83.42922);
        ((GeneralPath) shape).curveTo(-551.23914, -86.78822, -552.13513, -89.53222, -552.85614, -92.297226);
        ((GeneralPath) shape).curveTo(-555.04913, -100.70422, -557.30115, -109.09723, -559.36615, -117.536224);
        ((GeneralPath) shape).curveTo(-560.00616, -120.15222, -560.18616, -122.89123, -560.42017, -125.58723);
        ((GeneralPath) shape).curveTo(-560.4742, -126.20923, -559.8852, -126.88723, -559.39014, -127.98723);
        ((GeneralPath) shape).curveTo(-551.8411, -117.84423, -543.29315, -109.27823, -534.31213, -101.05023);
        ((GeneralPath) shape).curveTo(-529.54614, -96.684235, -525.7691, -91.238235, -521.5551, -86.27223);
        ((GeneralPath) shape).curveTo(-520.7461, -85.31823, -519.9791, -84.32923, -518.42413, -82.407234);
        ((GeneralPath) shape).curveTo(-516.34314, -93.32823, -514.4871, -103.06523, -512.49915, -113.49623);
        ((GeneralPath) shape).curveTo(-511.05515, -112.685234, -509.85016, -112.28523, -509.01315, -111.49523);
        ((GeneralPath) shape).curveTo(-495.21515, -98.48523, -484.35916, -83.26123, -475.96317, -66.33923);
        ((GeneralPath) shape).curveTo(-473.58017, -61.535233, -472.38516, -56.124233, -470.84418, -50.933235);
        ((GeneralPath) shape).curveTo(-470.5222, -49.851234, -471.07718, -48.508236, -471.35617, -46.247234);
        ((GeneralPath) shape).curveTo(-472.88718, -47.496235, -473.81116, -47.969234, -474.32617, -48.722233);
        ((GeneralPath) shape).curveTo(-476.01318, -51.185234, -477.44916, -53.82123, -479.16617, -56.261234);
        ((GeneralPath) shape).curveTo(-482.76117, -61.371235, -486.23618, -66.59323, -490.19318, -71.41324);
        ((GeneralPath) shape).curveTo(-495.88318, -78.34324, -501.92618, -84.98124, -506.75717, -92.584236);
        ((GeneralPath) shape).curveTo(-507.46918, -93.70524, -508.41818, -94.67724, -509.20016, -95.64623);
        ((GeneralPath) shape).curveTo(-511.39517, -95.043236, -510.82315, -93.43823, -510.82916, -92.268234);
        ((GeneralPath) shape).curveTo(-510.86118, -86.836235, -510.73816, -81.40324, -510.72516, -75.97023);
        ((GeneralPath) shape).curveTo(-510.71915, -73.58723, -510.84216, -71.20423, -510.89917, -69.11023);
        ((GeneralPath) shape).curveTo(-513.5022, -67.95123, -515.2862, -68.59523, -516.80316, -69.84623);
        ((GeneralPath) shape).curveTo(-519.1042, -71.74223, -521.45917, -73.63223, -523.4512, -75.83223);
        ((GeneralPath) shape).curveTo(-530.3852, -83.48623, -537.14417, -91.29823, -544.0422, -98.98523);
        ((GeneralPath) shape).curveTo(-545.3802, -100.47623, -546.17816, -102.77623, -548.71716, -102.797226);
        ((GeneralPath) shape).curveTo(-546.0862, -94.27823, -543.42017, -85.77923, -540.81714, -77.26022);
        ((GeneralPath) shape).curveTo(-540.34515, -75.716225, -540.02515, -74.106224, -539.83417, -72.50322);
        ((GeneralPath) shape).curveTo(-539.64215, -70.89422, -541.73517, -69.49222, -543.2742, -70.21222);
        ((GeneralPath) shape).curveTo(-544.7392, -70.89822, -546.0862, -71.83122, -547.5002, -72.62822);
        ((GeneralPath) shape).curveTo(-553.8882, -76.22922, -560.27216, -79.83622, -566.6842, -83.39322);
        ((GeneralPath) shape).curveTo(-567.5402, -83.86822, -568.5472, -84.07122, -569.9192, -84.552216);
        ((GeneralPath) shape).curveTo(-570.0042, -79.28722, -568.1992, -75.04221, -566.5772, -70.78622);
        ((GeneralPath) shape).curveTo(-564.2552, -64.69521, -561.81824, -58.647217, -559.3882, -52.598217);
        ((GeneralPath) shape).curveTo(-558.2752, -49.828217, -557.2162, -47.069218, -557.6562, -43.521217);
        ((GeneralPath) shape).curveTo(-564.1082, -39.737217, -570.0282, -44.258217, -576.9892, -45.315216);
        ((GeneralPath) shape).curveTo(-574.1732, -41.20022, -570.8952, -38.829216, -567.9052, -36.205215);
        ((GeneralPath) shape).curveTo(-565.0462, -33.695217, -562.1312, -31.240215, -559.1272, -28.906216);
        ((GeneralPath) shape).curveTo(-555.9112, -26.406216, -552.5682, -24.067215, -549.2702, -21.673216);
        ((GeneralPath) shape).curveTo(-546.3032, -19.519217, -542.9372, -17.852215, -539.80023, -14.884216);
        ((GeneralPath) shape).curveTo(-543.4492, -12.536217, -546.28125, -13.729217, -549.09424, -14.226216);
        ((GeneralPath) shape).curveTo(-551.7512, -14.694217, -554.42523, -15.070216, -557.0092, -15.474216);
        ((GeneralPath) shape).curveTo(-558.0802, -13.7502165, -556.53723, -13.600217, -555.8942, -13.058216);
        ((GeneralPath) shape).curveTo(-555.2822, -12.542216, -554.4982, -12.229216, -553.79224, -11.823216);
        ((GeneralPath) shape).curveTo(-541.2252, -4.6042166, -529.93024, 4.272784, -519.56226, 14.370784);
        ((GeneralPath) shape).curveTo(-507.62625, 25.993784, -499.30325, 39.835785, -494.32526, 55.678783);
        ((GeneralPath) shape).curveTo(-492.21826, 62.38378, -490.48026, 69.20478, -488.44424, 76.43778);
        ((GeneralPath) shape).curveTo(-487.05923, 75.931786, -485.56125, 75.49578, -484.15823, 74.85378);
        ((GeneralPath) shape).curveTo(-472.80124, 69.65978, -461.48523, 64.375786, -450.10922, 59.222782);
        ((GeneralPath) shape).curveTo(-441.62622, 55.381783, -432.53122, 53.603783, -423.4742, 51.82078);
        ((GeneralPath) shape).curveTo(-411.11722, 49.387783, -399.14722, 51.58678, -387.3832, 55.40078);
        ((GeneralPath) shape).curveTo(-385.13022, 56.13078, -383.0122, 57.30478, -379.7742, 57.59678);
        ((GeneralPath) shape).curveTo(-380.7622, 55.93778, -381.2982, 54.792778, -382.0502, 53.813778);
        ((GeneralPath) shape).curveTo(-386.3542, 48.209778, -390.7472, 42.674778, -395.0392, 37.06278);
        ((GeneralPath) shape).curveTo(-412.58722, 14.1147785, -427.74622, -10.33622, -440.91922, -36.03422);
        ((GeneralPath) shape).curveTo(-443.64523, -41.35322, -446.44223, -46.637222, -449.21323, -51.93422);
        ((GeneralPath) shape).curveTo(-470.6682, -92.957214, -487.76923, -135.81021, -503.07822, -179.43422);
        ((GeneralPath) shape).curveTo(-513.8872, -210.23622, -522.0672, -241.73721, -529.2072, -273.55423);
        ((GeneralPath) shape).curveTo(-533.4362, -292.40222, -536.01324, -311.50522, -538.7162, -330.59122);
        ((GeneralPath) shape).curveTo(-539.5902, -336.7672, -540.0502, -343.0342, -540.2152, -349.27222);
        ((GeneralPath) shape).curveTo(-540.7802, -370.7322, -542.8552, -392.1292, -542.55023, -413.6322);
        ((GeneralPath) shape).curveTo(-542.3922, -424.7702, -542.5452, -435.8792, -541.4522, -447.0052);
        ((GeneralPath) shape).curveTo(-540.0402, -461.3802, -537.2622, -475.4892, -534.1772, -489.5482);
        ((GeneralPath) shape).curveTo(-527.6592, -519.2552, -521.2452, -548.9922, -513.0782, -578.3052);
        ((GeneralPath) shape).curveTo(-508.18817, -595.8592, -501.84018, -612.9192, -494.65817, -629.65015);
        ((GeneralPath) shape).curveTo(-492.20416, -635.36816, -489.01416, -640.76917, -486.18518, -646.2681);
        ((GeneralPath) shape).curveTo(-486.31418, -646.59314, -486.3762, -646.8731, -486.52618, -647.0911);
        ((GeneralPath) shape).moveTo(-507.3772, 86.0589);
        ((GeneralPath) shape).curveTo(-534.5182, 84.7689, -561.6502, 83.286896, -588.7832, 81.8459);
        ((GeneralPath) shape).curveTo(-602.8942, 81.0969, -617.0002, 80.255905, -631.1092, 79.4899);
        ((GeneralPath) shape).curveTo(-645.20416, 78.7249, -659.2932, 77.7389, -673.3992, 77.3439);
        ((GeneralPath) shape).curveTo(-683.9772, 77.047905, -694.57715, 77.51791, -705.1672, 77.6819);
        ((GeneralPath) shape).curveTo(-712.77716, 77.7999, -720.38617, 78.0739, -727.99615, 78.1059);
        ((GeneralPath) shape).curveTo(-740.00616, 78.156906, -751.8201, 79.9679, -763.62415, 81.8759);
        ((GeneralPath) shape).curveTo(-765.68414, 82.2099, -767.67413, 82.9819, -769.78217, 83.5759);
        ((GeneralPath) shape).curveTo(-769.55115, 86.4929, -767.50916, 87.6459, -766.03217, 89.091896);
        ((GeneralPath) shape).curveTo(-741.68115, 112.9359, -715.2422, 134.2209, -686.92017, 153.1489);
        ((GeneralPath) shape).curveTo(-669.96814, 164.47789, -652.60016, 175.13489, -634.6412, 184.82689);
        ((GeneralPath) shape).curveTo(-630.30817, 187.16489, -626.45917, 188.07388, -621.5812, 186.20789);
        ((GeneralPath) shape).curveTo(-612.9112, 182.89088, -603.6252, 181.88388, -594.46716, 180.84988);
        ((GeneralPath) shape).curveTo(-578.27814, 179.02089, -562.08514, 177.12189, -545.7582, 176.77588);
        ((GeneralPath) shape).curveTo(-534.68115, 176.54189, -533.41516, 176.58888, -524.85815, 179.99388);
        ((GeneralPath) shape).curveTo(-522.94714, 179.46487, -520.73914, 179.15189, -518.7922, 178.26688);
        ((GeneralPath) shape).curveTo(-508.2162, 173.45688, -497.11816, 173.30188, -485.9922, 174.90988);
        ((GeneralPath) shape).curveTo(-474.1752, 176.61787, -462.45618, 178.99588, -450.69418, 181.07889);
        ((GeneralPath) shape).curveTo(-449.64618, 181.2649, -448.5962, 181.43489, -446.8252, 181.73389);
        ((GeneralPath) shape).curveTo(-445.5842, 180.26088, -444.2782, 178.52188, -442.7822, 176.96588);
        ((GeneralPath) shape).curveTo(-435.5662, 169.46588, -427.3022, 163.30688, -418.2622, 158.19588);
        ((GeneralPath) shape).curveTo(-416.39322, 157.13887, -414.3342, 156.30588, -412.2612, 155.74088);
        ((GeneralPath) shape).curveTo(-407.7382, 154.50888, -405.7592, 155.26787, -403.6222, 159.47588);
        ((GeneralPath) shape).curveTo(-400.5492, 165.52487, -397.59018, 171.64888, -394.95718, 177.89888);
        ((GeneralPath) shape).curveTo(-392.43018, 183.89888, -390.40817, 190.11188, -388.1132, 196.21088);
        ((GeneralPath) shape).curveTo(-385.4982, 203.16188, -378.94418, 206.13287, -371.8602, 203.63388);
        ((GeneralPath) shape).curveTo(-326.6442, 187.68887, -284.9782, 165.17488, -246.9302, 136.00288);
        ((GeneralPath) shape).curveTo(-242.18721, 132.36688, -237.6472, 128.46388, -233.0632, 124.624886);
        ((GeneralPath) shape).curveTo(-232.0842, 123.805885, -231.3212, 122.72788, -229.8622, 121.10689);
        ((GeneralPath) shape).curveTo(-237.4882, 119.41089, -244.2482, 117.69089, -251.0922, 116.42489);
        ((GeneralPath) shape).curveTo(-273.5542, 112.26989, -295.5482, 106.235886, -317.5462, 100.193886);
        ((GeneralPath) shape).curveTo(-332.5152, 96.08189, -347.6842, 93.333885, -363.2632, 92.70389);
        ((GeneralPath) shape).curveTo(-384.16522, 91.85889, -405.04822, 90.568886, -425.9392, 89.46289);
        ((GeneralPath) shape).curveTo(-443.03122, 88.55689, -460.11823, 87.525894, -477.21622, 86.76989);
        ((GeneralPath) shape).curveTo(-487.2622, 86.32589, -497.33722, 86.53589, -507.38022, 86.05889);
        ((GeneralPath) shape).moveTo(-795.75024, 92.40689);
        ((GeneralPath) shape).curveTo(-796.14526, 94.455894, -794.43726, 95.108894, -793.24927, 96.080894);
        ((GeneralPath) shape).curveTo(-784.6343, 103.135895, -775.9443, 110.09989, -767.4253, 117.26689);
        ((GeneralPath) shape).curveTo(-764.5303, 119.70189, -762.0303, 122.61189, -759.4183, 125.370895);
        ((GeneralPath) shape).curveTo(-758.90826, 125.9109, -758.71625, 126.7529, -758.12726, 127.97389);
        ((GeneralPath) shape).curveTo(-769.01324, 128.78789, -778.06024, 123.425896, -789.6733, 120.31389);
        ((GeneralPath) shape).curveTo(-782.7593, 129.83989, -775.1993, 135.9979, -767.79126, 143.3579);
        ((GeneralPath) shape).curveTo(-773.9573, 143.2639, -774.70325, 142.9599, -781.61725, 137.75189);
        ((GeneralPath) shape).curveTo(-785.48224, 134.83989, -789.28925, 131.8519, -792.96124, 129.02289);
        ((GeneralPath) shape).curveTo(-795.0842, 130.28189, -794.30023, 131.60089, -793.88525, 132.77888);
        ((GeneralPath) shape).curveTo(-790.5513, 142.24388, -787.1683, 151.69289, -783.82526, 161.15488);
        ((GeneralPath) shape).curveTo(-779.5793, 173.17488, -775.35724, 185.20288, -770.92126, 197.80588);
        ((GeneralPath) shape).curveTo(-769.3733, 198.50688, -767.4913, 199.53987, -765.49225, 200.23688);
        ((GeneralPath) shape).curveTo(-743.1473, 208.02087, -720.39923, 214.31187, -696.8972, 217.34387);
        ((GeneralPath) shape).curveTo(-688.8482, 218.38287, -680.6372, 218.15587, -672.50024, 218.51587);
        ((GeneralPath) shape).curveTo(-670.47125, 218.60587, -668.81525, 217.92087, -667.4622, 216.37387);
        ((GeneralPath) shape).curveTo(-666.0332, 214.73888, -664.52423, 213.17387, -663.03424, 211.59286);
        ((GeneralPath) shape).curveTo(-657.03723, 205.23087, -650.3013, 199.78087, -642.83923, 195.22087);
        ((GeneralPath) shape).curveTo(-641.2932, 194.27687, -639.82025, 193.21088, -637.6912, 191.78387);
        ((GeneralPath) shape).curveTo(-691.1232, 164.90887, -737.49225, 130.15288, -775.8412, 85.393875);
        ((GeneralPath) shape).curveTo(-783.6492, 86.59487, -788.6382, 88.366875, -795.7492, 92.406876);
        ((GeneralPath) shape).moveTo(-535.8692, 309.57687);
        ((GeneralPath) shape).curveTo(-547.1852, 302.00388, -559.4792, 296.35587, -572.4092, 292.1609);
        ((GeneralPath) shape).curveTo(-576.7882, 290.7399, -581.39417, 290.0829, -586.05316, 290.5399);
        ((GeneralPath) shape).curveTo(-592.7972, 291.2009, -598.53217, 293.6059, -602.20013, 299.7999);
        ((GeneralPath) shape).curveTo(-600.9251, 303.0379, -598.27313, 304.5149, -595.84015, 306.1349);
        ((GeneralPath) shape).curveTo(-583.46814, 314.3739, -569.4952, 318.6219, -555.28815, 322.25488);
        ((GeneralPath) shape).curveTo(-546.52313, 324.49588, -537.65515, 324.58987, -528.5441, 323.67087);
        ((GeneralPath) shape).curveTo(-526.53314, 320.49786, -527.1071, 318.11087, -528.80914, 316.19986);
        ((GeneralPath) shape).curveTo(-530.9512, 313.79486, -533.2191, 311.35086, -535.86914, 309.57687);
        ((GeneralPath) shape).moveTo(-403.76913, 193.86688);
        ((GeneralPath) shape).curveTo(-406.49213, 183.45688, -408.85715, 174.41489, -411.22614, 165.35889);
        ((GeneralPath) shape).curveTo(-416.75113, 166.99689, -433.66412, 177.83289, -439.56314, 183.4999);
        ((GeneralPath) shape).curveTo(-427.78915, 187.0389, -416.13013, 189.75589, -403.76913, 193.8669);
        ((GeneralPath) shape).moveTo(-766.5991, 212.26889);
        ((GeneralPath) shape).curveTo(-762.3441, 230.51689, -758.0211, 248.7499, -753.6901, 266.9799);
        ((GeneralPath) shape).curveTo(-753.5061, 267.7519, -753.10114, 268.4709, -752.7581, 269.3159);
        ((GeneralPath) shape).curveTo(-752.0731, 269.66287, -751.3841, 270.2949, -750.6601, 270.3389);
        ((GeneralPath) shape).curveTo(-722.5991, 272.0139, -694.6841, 271.1519, -667.2091, 264.6039);
        ((GeneralPath) shape).curveTo(-653.1521, 261.2539, -639.6171, 256.38092, -627.1451, 248.88892);
        ((GeneralPath) shape).curveTo(-625.7831, 248.07191, -624.34106, 247.38791, -622.8661, 246.60492);
        ((GeneralPath) shape).curveTo(-621.9441, 248.68692, -623.5761, 249.19592, -624.5021, 249.90892);
        ((GeneralPath) shape).curveTo(-634.96606, 257.96692, -646.76807, 263.41193, -659.26807, 267.41592);
        ((GeneralPath) shape).curveTo(-678.32904, 273.52292, -697.94006, 276.0309, -717.89905, 276.11893);
        ((GeneralPath) shape).curveTo(-726.32904, 276.1559, -734.7601, 276.08392, -743.189, 276.14993);
        ((GeneralPath) shape).curveTo(-745.57404, 276.16794, -748.10004, 275.60895, -750.82, 277.66992);
        ((GeneralPath) shape).curveTo(-750.679, 279.67593, -750.787, 282.10593, -750.303, 284.41092);
        ((GeneralPath) shape).curveTo(-747.17, 299.32492, -745.90796, 314.4919, -743.82196, 329.54993);
        ((GeneralPath) shape).curveTo(-741.01996, 349.76993, -739.92896, 370.12292, -738.066, 390.4099);
        ((GeneralPath) shape).curveTo(-736.82495, 403.9229, -736.876, 417.5519, -736.30096, 431.12692);
        ((GeneralPath) shape).curveTo(-735.38995, 452.6249, -737.86896, 474.03992, -737.878, 495.52094);
        ((GeneralPath) shape).curveTo(-737.881, 502.56094, -739.087, 509.59494, -739.635, 516.63995);
        ((GeneralPath) shape).curveTo(-740.078, 522.324, -740.25903, 528.02997, -740.73303, 533.712);
        ((GeneralPath) shape).curveTo(-741.523, 543.18695, -742.44, 552.651, -743.33606, 562.11597);
        ((GeneralPath) shape).curveTo(-743.6661, 565.60895, -744.08606, 569.094, -744.47906, 572.71295);
        ((GeneralPath) shape).curveTo(-746.0281, 573.454, -747.44507, 574.13293, -748.86005, 574.80994);
        ((GeneralPath) shape).curveTo(-748.783, 575.3339, -748.89307, 576.0169, -748.60205, 576.3419);
        ((GeneralPath) shape).curveTo(-746.4551, 578.7349, -744.22906, 581.0579, -742.1791, 583.24194);
        ((GeneralPath) shape).curveTo(-743.49207, 587.51294, -747.4411, 586.93494, -749.9681, 588.13196);
        ((GeneralPath) shape).curveTo(-750.31506, 589.993, -749.0331, 590.3259, -748.1781, 590.77295);
        ((GeneralPath) shape).curveTo(-737.8461, 596.17096, -727.8841, 602.29297, -717.0591, 606.72797);
        ((GeneralPath) shape).curveTo(-688.2931, 618.511, -658.5161, 626.819, -627.9691, 632.38696);
        ((GeneralPath) shape).curveTo(-618.0861, 634.18896, -608.15314, 635.93896, -598.1651, 636.85895);
        ((GeneralPath) shape).curveTo(-590.6361, 637.55194, -582.9831, 636.88293, -575.3841, 636.824);
        ((GeneralPath) shape).curveTo(-574.1291, 636.81396, -572.8741, 636.823, -571.3341, 636.823);
        ((GeneralPath) shape).curveTo(-571.5981, 640.152, -574.5191, 640.791, -575.87714, 642.649);
        ((GeneralPath) shape).curveTo(-577.30817, 644.60596, -579.04913, 646.357, -580.78516, 648.066);
        ((GeneralPath) shape).curveTo(-582.44415, 649.69995, -584.27216, 651.164, -586.9321, 653.498);
        ((GeneralPath) shape).curveTo(-574.71515, 654.26, -564.30115, 651.36597, -553.8181, 649.048);
        ((GeneralPath) shape).curveTo(-543.5561, 646.779, -533.49713, 643.79, -523.1901, 639.78595);
        ((GeneralPath) shape).curveTo(-523.0551, 646.4929, -525.1721, 651.56494, -529.8421, 655.32794);
        ((GeneralPath) shape).curveTo(-533.6331, 658.38293, -537.7751, 661.00195, -541.7611, 663.81494);
        ((GeneralPath) shape).lineTo(-541.8291, 663.85394);
        ((GeneralPath) shape).curveTo(-529.8101, 663.38794, -518.2101, 660.85297, -506.7431, 657.29895);
        ((GeneralPath) shape).curveTo(-495.6481, 653.86096, -485.0721, 649.16693, -473.3401, 643.23395);
        ((GeneralPath) shape).curveTo(-474.0251, 645.8259, -474.0441, 646.87494, -474.53708, 647.60394);
        ((GeneralPath) shape).curveTo(-477.9141, 652.59296, -481.8841, 657.0029, -487.0131, 660.31396);
        ((GeneralPath) shape).curveTo(-491.5731, 663.25696, -496.0211, 666.376, -500.49908, 669.446);
        ((GeneralPath) shape).curveTo(-500.64108, 669.54297, -500.5731, 669.949, -500.6641, 670.738);
        ((GeneralPath) shape).curveTo(-498.9841, 670.448, -497.4331, 670.256, -495.91708, 669.90796);
        ((GeneralPath) shape).curveTo(-464.68207, 662.74896, -433.44208, 655.608, -402.2201, 648.38495);
        ((GeneralPath) shape).curveTo(-381.8201, 643.66595, -361.1641, 640.41394, -340.46408, 637.41595);
        ((GeneralPath) shape).curveTo(-317.26407, 634.05597, -293.94308, 633.05493, -270.52908, 634.1099);
        ((GeneralPath) shape).curveTo(-268.9311, 634.18195, -267.3271, 634.11993, -264.81207, 634.11993);
        ((GeneralPath) shape).curveTo(-270.71808, 626.4799, -279.54807, 623.02893, -284.90808, 615.1989);
        ((GeneralPath) shape).curveTo(-278.58008, 613.66693, -274.3831, 618.77094, -268.5861, 618.89594);
        ((GeneralPath) shape).curveTo(-269.67508, 611.68494, -272.24408, 605.07196, -272.35208, 597.83295);
        ((GeneralPath) shape).curveTo(-267.00708, 597.79095, -264.92908, 602.93896, -260.2891, 603.96295);
        ((GeneralPath) shape).curveTo(-261.0061, 597.1279, -261.8061, 590.7139, -262.3041, 584.27594);
        ((GeneralPath) shape).curveTo(-262.5741, 580.78595, -262.5831, 577.2329, -262.2701, 573.74896);
        ((GeneralPath) shape).curveTo(-261.25012, 562.38196, -259.8671, 551.048, -258.92313, 539.67596);
        ((GeneralPath) shape).curveTo(-257.59012, 523.608, -253.65512, 508.09198, -249.49313, 492.60397);
        ((GeneralPath) shape).curveTo(-245.81813, 478.92297, -240.57614, 465.78796, -235.17813, 452.74597);
        ((GeneralPath) shape).curveTo(-224.78214, 427.63196, -215.30212, 402.18396, -206.32513, 376.53897);
        ((GeneralPath) shape).curveTo(-199.59413, 357.31097, -192.78214, 338.11298, -186.04913, 318.886);
        ((GeneralPath) shape).curveTo(-185.16814, 316.369, -184.53813, 313.763, -183.81914, 311.28998);
        ((GeneralPath) shape).curveTo(-186.06813, 309.49097, -187.77914, 311.13098, -189.35114, 311.71298);
        ((GeneralPath) shape).curveTo(-201.62013, 316.25397, -214.18513, 319.65497, -227.07214, 321.84497);
        ((GeneralPath) shape).curveTo(-232.69214, 322.79996, -238.33014, 323.916, -244.00214, 324.26096);
        ((GeneralPath) shape).curveTo(-267.36615, 325.68295, -290.77612, 325.89496, -314.10413, 324.09897);
        ((GeneralPath) shape).curveTo(-361.60114, 320.44296, -407.40814, 309.29196, -451.42413, 291.10696);
        ((GeneralPath) shape).curveTo(-464.46213, 285.71997, -477.09415, 279.33298, -489.79013, 273.15097);
        ((GeneralPath) shape).curveTo(-493.31613, 271.43497, -497.06314, 269.65298, -499.41714, 266.26096);
        ((GeneralPath) shape).curveTo(-498.21915, 264.70996, -497.21515, 265.40097, -496.32315, 265.83395);
        ((GeneralPath) shape).curveTo(-456.30316, 285.27194, -414.62814, 299.91696, -371.01315, 308.82794);
        ((GeneralPath) shape).curveTo(-341.91916, 314.77194, -312.56616, 318.36093, -282.79214, 317.87094);
        ((GeneralPath) shape).curveTo(-268.11316, 317.62994, -253.43715, 317.65894, -238.81915, 315.92993);
        ((GeneralPath) shape).curveTo(-220.68715, 313.78592, -202.96315, 309.82294, -185.47015, 304.65994);
        ((GeneralPath) shape).curveTo(-182.18515, 303.69095, -180.65015, 301.77994, -179.62416, 298.65094);
        ((GeneralPath) shape).curveTo(-177.33417, 291.66794, -175.49117, 284.60593, -174.09216, 277.38995);
        ((GeneralPath) shape).curveTo(-172.80217, 270.73694, -171.12016, 264.15594, -169.50316, 257.56995);
        ((GeneralPath) shape).curveTo(-167.23917, 248.34294, -164.86015, 239.14294, -162.58516, 229.91794);
        ((GeneralPath) shape).curveTo(-162.40616, 229.19394, -162.65016, 228.36494, -162.71016, 227.38094);
        ((GeneralPath) shape).curveTo(-165.44916, 226.84094, -167.42915, 228.43694, -169.51515, 229.40694);
        ((GeneralPath) shape).curveTo(-186.78215, 237.44093, -204.46014, 244.39793, -222.63815, 250.09894);
        ((GeneralPath) shape).curveTo(-244.71515, 257.02194, -267.25116, 261.93195, -290.04114, 265.78394);
        ((GeneralPath) shape).curveTo(-317.23712, 270.38092, -344.64014, 271.39694, -372.12714, 270.25894);
        ((GeneralPath) shape).curveTo(-390.58612, 269.49493, -409.06314, 268.60593, -427.35315, 265.73096);
        ((GeneralPath) shape).curveTo(-441.60016, 263.48996, -455.59314, 260.13397, -469.18713, 255.27795);
        ((GeneralPath) shape).curveTo(-471.85214, 254.32695, -474.87613, 253.71295, -476.46915, 250.90295);
        ((GeneralPath) shape).curveTo(-470.22815, 252.46495, -464.00516, 254.10495, -457.74014, 255.56496);
        ((GeneralPath) shape).curveTo(-441.26715, 259.40396, -424.48914, 261.36896, -407.65115, 261.79697);
        ((GeneralPath) shape).curveTo(-385.64417, 262.35696, -363.58514, 262.54697, -341.59717, 261.68698);
        ((GeneralPath) shape).curveTo(-317.13818, 260.72897, -292.94318, 257.01898, -269.05118, 251.46999);
        ((GeneralPath) shape).curveTo(-242.55518, 245.31499, -216.69019, 237.04698, -190.87317, 228.59799);
        ((GeneralPath) shape).curveTo(-182.09616, 225.726, -173.40216, 222.60599, -164.62517, 219.734);
        ((GeneralPath) shape).curveTo(-161.15717, 218.599, -159.36816, 216.59299, -158.72617, 212.85599);
        ((GeneralPath) shape).curveTo(-156.84816, 201.915, -154.59717, 191.038, -152.20216, 178.62898);
        ((GeneralPath) shape).curveTo(-154.19217, 180.42398, -155.17917, 181.12099, -155.92517, 182.01999);
        ((GeneralPath) shape).curveTo(-159.04916, 185.784, -162.15317, 189.566, -165.16817, 193.41798);
        ((GeneralPath) shape).curveTo(-171.75517, 201.83098, -179.35217, 209.12198, -188.22417, 215.13599);
        ((GeneralPath) shape).curveTo(-195.06416, 219.77399, -202.82817, 221.89398, -211.38817, 225.07098);
        ((GeneralPath) shape).curveTo(-210.97717, 223.03499, -211.02718, 221.95299, -210.55217, 221.20198);
        ((GeneralPath) shape).curveTo(-209.54317, 219.60799, -208.40617, 218.03899, -207.06717, 216.71597);
        ((GeneralPath) shape).curveTo(-198.29417, 208.04398, -191.41917, 197.94997, -184.97116, 187.52397);
        ((GeneralPath) shape).curveTo(-177.09016, 174.77997, -170.52916, 161.36298, -164.62917, 147.61098);
        ((GeneralPath) shape).curveTo(-164.23016, 146.68098, -164.10417, 145.63498, -163.71417, 144.10498);
        ((GeneralPath) shape).curveTo(-166.54716, 143.72998, -167.94017, 145.69098, -169.75717, 146.43999);
        ((GeneralPath) shape).curveTo(-171.75818, 147.26498, -173.77318, 148.07999, -175.84018, 148.70898);
        ((GeneralPath) shape).curveTo(-178.17719, 149.42099, -180.57018, 149.96399, -182.95618, 150.50299);
        ((GeneralPath) shape).curveTo(-185.07118, 150.98099, -187.19518, 151.54399, -189.34317, 151.71799);
        ((GeneralPath) shape).curveTo(-191.45117, 151.88899, -193.59418, 151.61598, -195.61917, 151.54199);
        ((GeneralPath) shape).curveTo(-196.11917, 149.46999, -194.89117, 148.726, -193.87717, 147.87999);
        ((GeneralPath) shape).curveTo(-189.28517, 144.049, -184.62317, 140.299, -180.10916, 136.37698);
        ((GeneralPath) shape).curveTo(-176.85516, 133.54898, -173.78316, 130.50798, -170.92816, 126.35098);
        ((GeneralPath) shape).curveTo(-174.76016, 124.804985, -178.23216, 125.65498, -181.58316, 125.556984);
        ((GeneralPath) shape).curveTo(-185.11617, 125.45499, -188.66116, 125.60298, -192.18416, 125.37898);
        ((GeneralPath) shape).curveTo(-195.97617, 125.138985, -199.74916, 124.59998, -203.52916, 124.180984);
        ((GeneralPath) shape).curveTo(-207.04115, 123.790985, -210.55016, 123.37698, -214.06216, 122.99499);
        ((GeneralPath) shape).curveTo(-217.55817, 122.61499, -221.05617, 122.26099, -224.89717, 121.858986);
        ((GeneralPath) shape).curveTo(-237.65018, 135.65999, -250.27217, 149.49498, -265.28018, 160.87898);
        ((GeneralPath) shape).curveTo(-280.29718, 172.26999, -296.48517, 181.65099, -313.32318, 189.99298);
        ((GeneralPath) shape).curveTo(-330.15118, 198.32999, -347.6902, 204.89598, -366.2852, 210.80998);
        ((GeneralPath) shape).curveTo(-365.1692, 212.16698, -364.5402, 213.24898, -363.6302, 213.98398);
        ((GeneralPath) shape).curveTo(-360.03818, 216.88898, -356.2872, 219.59998, -352.72717, 222.54398);
        ((GeneralPath) shape).curveTo(-348.05716, 226.40698, -344.26416, 231.00497, -342.05316, 236.72298);
        ((GeneralPath) shape).curveTo(-341.60815, 237.87198, -341.65915, 239.21298, -341.33517, 241.49498);
        ((GeneralPath) shape).curveTo(-343.28317, 240.13197, -344.47318, 239.52498, -345.37918, 238.63098);
        ((GeneralPath) shape).curveTo(-354.79718, 229.34798, -366.1562, 222.94298, -377.6142, 216.65298);
        ((GeneralPath) shape).curveTo(-379.9542, 215.36899, -382.12518, 215.28798, -384.6262, 215.97798);
        ((GeneralPath) shape).curveTo(-401.6562, 220.67598, -418.88318, 224.55098, -436.30118, 227.47697);
        ((GeneralPath) shape).curveTo(-447.80417, 229.40997, -459.30618, 231.71397, -471.0912, 230.97998);
        ((GeneralPath) shape).curveTo(-471.88318, 230.93098, -472.66718, 230.75298, -473.5192, 230.03497);
        ((GeneralPath) shape).curveTo(-464.2652, 228.65797, -454.94418, 227.62198, -445.77618, 225.80797);
        ((GeneralPath) shape).curveTo(-436.7292, 224.01897, -427.7592, 221.71297, -418.8982, 219.13997);
        ((GeneralPath) shape).curveTo(-409.8342, 216.50897, -400.6342, 214.19597, -391.59918, 210.40697);
        ((GeneralPath) shape).curveTo(-392.3252, 207.88397, -394.24417, 207.52097, -395.8892, 206.85397);
        ((GeneralPath) shape).curveTo(-409.01318, 201.53598, -422.5312, 197.42497, -436.3292, 194.34697);
        ((GeneralPath) shape).curveTo(-451.1692, 191.03596, -466.0622, 187.91296, -481.0202, 185.19096);
        ((GeneralPath) shape).curveTo(-487.6672, 183.98096, -494.5212, 183.78796, -501.2972, 183.43497);
        ((GeneralPath) shape).curveTo(-511.3102, 182.91197, -519.17224, 187.39697, -525.4672, 194.79396);
        ((GeneralPath) shape).curveTo(-526.78723, 196.34496, -527.6132, 198.57297, -528.00323, 200.61496);
        ((GeneralPath) shape).curveTo(-529.9912, 211.01396, -532.0382, 221.41496, -533.5142, 231.89197);
        ((GeneralPath) shape).curveTo(-534.5722, 239.40598, -534.7432, 247.04297, -535.3552, 254.62097);
        ((GeneralPath) shape).curveTo(-535.60925, 257.77298, -534.58325, 260.33398, -532.64825, 262.86298);
        ((GeneralPath) shape).curveTo(-527.5273, 269.554, -522.44226, 276.29398, -517.75226, 283.28897);
        ((GeneralPath) shape).curveTo(-513.6763, 289.36697, -509.92825, 295.69696, -506.47025, 302.149);
        ((GeneralPath) shape).curveTo(-503.86124, 307.017, -503.11224, 312.429, -503.80325, 317.99298);
        ((GeneralPath) shape).curveTo(-504.51025, 323.692, -507.56625, 327.70297, -512.89325, 329.439);
        ((GeneralPath) shape).curveTo(-517.2463, 330.858, -521.8422, 332.023, -526.38824, 332.28);
        ((GeneralPath) shape).curveTo(-548.31226, 333.52, -569.15625, 329.775, -588.06024, 317.867);
        ((GeneralPath) shape).curveTo(-593.1362, 314.67, -598.0482, 311.299, -602.18823, 306.896);
        ((GeneralPath) shape).curveTo(-605.47723, 303.397, -606.39624, 299.857, -604.41626, 295.065);
        ((GeneralPath) shape).curveTo(-601.3083, 287.539, -596.68225, 281.389, -590.3943, 276.385);
        ((GeneralPath) shape).curveTo(-581.2983, 269.144, -571.07227, 264.359, -559.6093, 262.213);
        ((GeneralPath) shape).curveTo(-554.0283, 261.169, -548.4853, 259.923, -542.78534, 258.739);
        ((GeneralPath) shape).curveTo(-542.4943, 256.707, -542.0543, 255.12901, -542.07733, 253.55801);
        ((GeneralPath) shape).curveTo(-542.3333, 235.80202, -540.41736, 218.29102, -536.17633, 201.05301);
        ((GeneralPath) shape).curveTo(-535.2113, 197.12901, -535.4063, 193.53801, -538.14734, 189.602);
        ((GeneralPath) shape).curveTo(-562.46533, 187.93001, -587.00934, 188.406, -612.40234, 194.373);
        ((GeneralPath) shape).curveTo(-610.2443, 195.484, -609.05237, 196.461, -607.72235, 196.72101);
        ((GeneralPath) shape).curveTo(-601.60333, 197.91602, -595.4473, 198.91801, -589.30237, 199.973);
        ((GeneralPath) shape).curveTo(-587.5704, 200.27, -585.82837, 200.51201, -584.1454, 201.20401);
        ((GeneralPath) shape).curveTo(-595.30536, 203.14401, -606.37836, 203.23302, -617.0244, 199.07501);
        ((GeneralPath) shape).curveTo(-622.7274, 196.848, -627.9904, 197.18802, -633.6034, 199.253);
        ((GeneralPath) shape).curveTo(-643.1244, 202.75801, -652.0224, 207.29901, -659.9934, 213.59001);
        ((GeneralPath) shape).curveTo(-661.2394, 214.57301, -662.3214, 215.764, -663.7124, 217.08002);
        ((GeneralPath) shape).curveTo(-661.8694, 219.24402, -659.72943, 218.93901, -657.6934, 218.83902);
        ((GeneralPath) shape).curveTo(-646.51843, 218.28902, -635.5164, 216.81702, -625.00543, 212.69902);
        ((GeneralPath) shape).curveTo(-624.34045, 212.43903, -623.5374, 212.53001, -621.4674, 212.32703);
        ((GeneralPath) shape).curveTo(-623.66943, 213.99202, -624.7864, 215.03802, -626.0784, 215.78003);
        ((GeneralPath) shape).curveTo(-634.20044, 220.44102, -643.04944, 223.21703, -652.2324, 224.42003);
        ((GeneralPath) shape).curveTo(-664.3534, 226.00703, -676.5654, 227.11302, -688.8244, 226.10803);
        ((GeneralPath) shape).curveTo(-704.8434, 224.79404, -720.5984, 221.92303, -736.0884, 217.64503);
        ((GeneralPath) shape).curveTo(-743.6794, 215.54904, -751.22736, 213.29303, -758.7944, 211.10904);
        ((GeneralPath) shape).curveTo(-761.1244, 210.43604, -763.45337, 209.76103, -766.2494, 208.95303);
        ((GeneralPath) shape).curveTo(-766.4104, 210.29803, -766.8174, 211.35603, -766.6044, 212.26903);
        ((GeneralPath) shape).moveTo(-770.0694, 475.729);
        ((GeneralPath) shape).curveTo(-784.9084, 504.269, -802.8564, 530.73303, -824.3574, 554.726);
        ((GeneralPath) shape).curveTo(-835.2544, 566.886, -847.4514, 577.693, -859.5614, 588.591);
        ((GeneralPath) shape).curveTo(-860.7174, 589.631, -861.8804, 590.661, -864.2924, 592.814);
        ((GeneralPath) shape).curveTo(-854.87244, 591.12103, -847.4734, 588.60205, -840.1244, 586.00104);
        ((GeneralPath) shape).curveTo(-829.38837, 582.2, -818.6974, 578.26306, -808.0564, 574.205);
        ((GeneralPath) shape).curveTo(-804.5294, 572.86005, -801.01337, 571.273, -797.8384, 569.253);
        ((GeneralPath) shape).curveTo(-788.45135, 563.284, -779.1534, 557.165, -769.9804, 550.872);
        ((GeneralPath) shape).curveTo(-762.0984, 545.465, -755.4834, 538.629, -749.1464, 531.508);
        ((GeneralPath) shape).curveTo(-746.66943, 528.724, -745.40643, 525.666, -745.3494, 521.93896);
        ((GeneralPath) shape).curveTo(-745.2614, 516.23895, -745.1234, 510.53098, -744.71844, 504.84695);
        ((GeneralPath) shape).curveTo(-743.85144, 492.66995, -742.8004, 480.50696, -741.82245, 468.33795);
        ((GeneralPath) shape).curveTo(-741.77844, 467.79697, -741.65643, 467.25894, -741.65045, 466.71896);
        ((GeneralPath) shape).curveTo(-741.48346, 452.34695, -741.52747, 437.98096, -742.7504, 423.63196);
        ((GeneralPath) shape).curveTo(-744.8624, 423.50095, -744.99146, 425.10696, -745.5014, 426.13696);
        ((GeneralPath) shape).curveTo(-753.6984, 442.66397, -761.5614, 459.36395, -770.0694, 475.72897);
        ((GeneralPath) shape).moveTo(-870.4894, 608.68896);
        ((GeneralPath) shape).curveTo(-868.96436, 610.30896, -867.3374, 609.60394, -866.00037, 609.61597);
        ((GeneralPath) shape).curveTo(-855.94635, 609.70496, -845.88135, 609.41595, -835.84235, 609.80994);
        ((GeneralPath) shape).curveTo(-828.53534, 610.0969, -821.1403, 610.6619, -814.0023, 612.14594);
        ((GeneralPath) shape).curveTo(-803.0263, 614.4279, -791.9633, 615.19293, -780.8463, 615.5739);
        ((GeneralPath) shape).curveTo(-769.7133, 615.9569, -758.5673, 615.9389, -747.42834, 616.2039);
        ((GeneralPath) shape).curveTo(-738.1564, 616.4249, -728.98834, 615.3479, -719.81836, 614.2429);
        ((GeneralPath) shape).curveTo(-719.37036, 614.1889, -718.9734, 613.71594, -717.2424, 612.5709);
        ((GeneralPath) shape).curveTo(-735.88135, 605.1289, -752.38934, 595.83093, -768.33136, 585.50195);
        ((GeneralPath) shape).curveTo(-768.66034, 585.28894, -768.65936, 584.56494, -768.94135, 583.665);
        ((GeneralPath) shape).curveTo(-763.5704, 582.957, -758.25836, 582.258, -752.5184, 581.50195);
        ((GeneralPath) shape).curveTo(-753.9374, 576.63696, -759.1664, 573.86694, -758.89136, 568.0239);
        ((GeneralPath) shape).curveTo(-755.70935, 568.3559, -752.6373, 568.67694, -749.0754, 569.0499);
        ((GeneralPath) shape).curveTo(-746.8534, 559.1339, -746.0154, 549.58594, -746.43835, 540.0039);
        ((GeneralPath) shape).curveTo(-748.78534, 539.0779, -749.65533, 540.8039, -750.8434, 541.7439);
        ((GeneralPath) shape).curveTo(-760.4294, 549.3229, -769.8544, 557.1129, -779.6114, 564.46387);
        ((GeneralPath) shape).curveTo(-788.5174, 571.17285, -798.09436, 576.9029, -808.1314, 581.7909);
        ((GeneralPath) shape).curveTo(-823.01843, 589.0419, -837.5614, 597.0429, -853.1154, 602.8529);
        ((GeneralPath) shape).curveTo(-858.6844, 604.9329, -864.3874, 606.6519, -870.48944, 608.6889);
        ((GeneralPath) shape).moveTo(-342.9594, 652.1039);
        ((GeneralPath) shape).curveTo(-327.1474, 662.69885, -310.8644, 672.2519, -292.11243, 676.9389);
        ((GeneralPath) shape).curveTo(-277.66742, 680.5489, -263.37842, 684.7829, -248.97943, 688.5889);
        ((GeneralPath) shape).curveTo(-246.19943, 689.3239, -243.24544, 689.3989, -240.36543, 689.75696);
        ((GeneralPath) shape).curveTo(-242.64243, 686.188, -246.67244, 685.03296, -249.98743, 682.92596);
        ((GeneralPath) shape).curveTo(-256.61542, 678.712, -263.42642, 674.78595, -270.03644, 670.54596);
        ((GeneralPath) shape).curveTo(-273.45145, 668.35596, -276.68643, 665.85596, -279.84744, 663.30396);
        ((GeneralPath) shape).curveTo(-285.79044, 658.506, -291.04944, 653.074, -294.86044, 646.358);
        ((GeneralPath) shape).curveTo(-295.78845, 644.724, -296.94846, 643.222, -297.92944, 641.76697);
        ((GeneralPath) shape).curveTo(-307.12744, 641.243, -335.62543, 645.70496, -345.64044, 649.31494);
        ((GeneralPath) shape).curveTo(-344.63745, 650.37695, -343.93744, 651.44794, -342.95944, 652.10394);
        ((GeneralPath) shape).moveTo(-262.37146, 628.49896);
        ((GeneralPath) shape).curveTo(-262.96045, 629.73096, -262.06647, 629.35693, -261.54547, 629.38696);
        ((GeneralPath) shape).lineTo(-262.37146, 628.49896);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-212.76146, 695.40497);
        ((GeneralPath) shape).curveTo(-209.25645, 696.67395, -205.64946, 698.11597, -201.74146, 697.396);
        ((GeneralPath) shape).curveTo(-201.67445, 696.778, -201.39345, 696.127, -201.60545, 695.845);
        ((GeneralPath) shape).curveTo(-211.75845, 682.305, -217.39746, 666.837, -220.64046, 650.44696);
        ((GeneralPath) shape).curveTo(-224.06146, 633.15594, -227.45645, 615.845, -230.18546, 598.436);
        ((GeneralPath) shape).curveTo(-232.03145, 586.66, -232.73245, 574.70197, -233.90045, 562.821);
        ((GeneralPath) shape).curveTo(-235.94545, 542.009, -237.16145, 521.15295, -237.10146, 500.232);
        ((GeneralPath) shape).curveTo(-237.10045, 499.764, -237.40546, 499.296, -237.58345, 498.783);
        ((GeneralPath) shape).curveTo(-239.17645, 499.262, -239.27444, 500.791, -239.63745, 501.96698);
        ((GeneralPath) shape).curveTo(-244.21245, 516.74896, -248.11145, 531.654, -250.09546, 547.081);
        ((GeneralPath) shape).curveTo(-251.00146, 554.123, -251.26546, 561.106, -251.49545, 568.151);
        ((GeneralPath) shape).curveTo(-251.84946, 578.996, -252.48445, 589.831, -252.91045, 600.674);
        ((GeneralPath) shape).curveTo(-253.09245, 605.284, -253.02945, 609.903, -253.12045, 614.518);
        ((GeneralPath) shape).curveTo(-253.14645, 615.807, -253.32245, 617.094, -253.48946, 619.09503);
        ((GeneralPath) shape).curveTo(-254.92746, 618.523, -255.99745, 618.37006, -256.67746, 617.77203);
        ((GeneralPath) shape).curveTo(-258.27347, 616.369, -259.68246, 614.75305, -262.03546, 612.327);
        ((GeneralPath) shape).curveTo(-261.84045, 615.431, -260.70645, 616.879, -259.89145, 618.416);
        ((GeneralPath) shape).curveTo(-259.00345, 620.091, -258.08545, 621.752, -257.13644, 623.39404);
        ((GeneralPath) shape).curveTo(-256.21945, 624.97906, -255.24544, 626.53204, -254.27144, 628.14404);
        ((GeneralPath) shape).curveTo(-256.60342, 630.525, -259.12744, 629.04504, -261.31845, 629.47406);
        ((GeneralPath) shape).curveTo(-259.07245, 631.64606, -256.82245, 633.82404, -254.14944, 636.4111);
        ((GeneralPath) shape).curveTo(-255.27745, 637.0101, -256.09546, 637.7781, -256.97745, 637.8591);
        ((GeneralPath) shape).curveTo(-263.45944, 638.45807, -269.95346, 638.91406, -276.44345, 639.42706);
        ((GeneralPath) shape).curveTo(-278.58347, 639.59607, -280.72046, 639.80304, -283.30145, 640.03204);
        ((GeneralPath) shape).curveTo(-283.16345, 645.4971, -282.36044, 650.37805, -278.60745, 654.32104);
        ((GeneralPath) shape).curveTo(-273.73544, 659.44104, -268.72745, 664.42206, -262.59247, 668.06903);
        ((GeneralPath) shape).curveTo(-252.56146, 674.031, -242.32246, 679.669, -232.54646, 686.02106);
        ((GeneralPath) shape).curveTo(-226.30846, 690.07404, -219.63747, 692.91705, -212.76146, 695.405);
        ((GeneralPath) shape).moveTo(23.87854, -0.0949707);
        ((GeneralPath) shape).curveTo(26.83354, 0.7710293, 29.92754, 1.1670293, 33.924538, 1.9600294);
        ((GeneralPath) shape).curveTo(31.961538, 4.0310297, 30.882538, 5.5520296, 29.458538, 6.60903);
        ((GeneralPath) shape).curveTo(21.08154, 12.82603, 12.016539, 17.61303, 1.6575375, 19.65503);
        ((GeneralPath) shape).curveTo(0.22953749, 19.93603, -1.6994627, 19.67103, -2.2294626, 22.41403);
        ((GeneralPath) shape).curveTo(0.45953727, 24.25403, 3.2855372, 26.29603, 6.2195377, 28.16903);
        ((GeneralPath) shape).curveTo(10.111538, 30.65403, 14.127538, 32.94403, 18.000538, 35.45703);
        ((GeneralPath) shape).curveTo(19.023539, 36.121033, 19.715538, 37.294033, 20.868538, 38.57803);
        ((GeneralPath) shape).curveTo(17.840538, 42.14503, 14.152538, 43.87403, 10.506537, 45.533028);
        ((GeneralPath) shape).curveTo(-4.2574625, 52.250027, -19.896461, 55.82203, -35.971462, 56.783028);
        ((GeneralPath) shape).curveTo(-66.82646, 58.62803, -96.60747, 53.264027, -125.22046, 41.633026);
        ((GeneralPath) shape).curveTo(-130.99046, 39.288025, -136.56445, 36.398026, -142.04745, 33.425026);
        ((GeneralPath) shape).curveTo(-147.53345, 30.449026, -152.82646, 27.110025, -158.14545, 23.835026);
        ((GeneralPath) shape).curveTo(-176.45445, 12.560026, -192.10245, -1.4509735, -203.37344, -20.013973);
        ((GeneralPath) shape).curveTo(-210.17145, -31.209972, -215.73244, -43.000973, -220.19444, -55.272972);
        ((GeneralPath) shape).curveTo(-232.28844, -88.53597, -241.71944, -122.516975, -246.65344, -157.63297);
        ((GeneralPath) shape).curveTo(-248.20345, -168.65796, -249.43445, -179.73596, -250.47144, -190.82196);
        ((GeneralPath) shape).curveTo(-251.53343, -202.18095, -252.43044, -213.56696, -252.92444, -224.96196);
        ((GeneralPath) shape).curveTo(-253.31244, -233.91595, -253.62944, -242.95895, -252.83044, -251.85896);
        ((GeneralPath) shape).curveTo(-251.15645, -270.52197, -248.86145, -289.13397, -246.57144, -307.73697);
        ((GeneralPath) shape).curveTo(-243.55344, -332.26898, -240.36745, -356.78098, -237.11244, -381.28296);
        ((GeneralPath) shape).curveTo(-235.11044, -396.35797, -233.39345, -411.50195, -230.57645, -426.42996);
        ((GeneralPath) shape).curveTo(-225.69345, -452.29895, -221.03944, -478.26096, -212.32344, -503.23596);
        ((GeneralPath) shape).curveTo(-212.00644, -504.14496, -211.16844, -505.16495, -212.36844, -506.09195);
        ((GeneralPath) shape).curveTo(-212.89844, -505.98895, -213.52144, -506.03494, -213.93144, -505.76196);
        ((GeneralPath) shape).curveTo(-229.76443, -495.21896, -246.09444, -485.33395, -261.27444, -473.91995);
        ((GeneralPath) shape).curveTo(-285.38446, -455.79196, -308.88446, -436.83896, -332.33746, -417.85696);
        ((GeneralPath) shape).curveTo(-349.87445, -403.66397, -366.81845, -388.74197, -384.22748, -374.38898);
        ((GeneralPath) shape).curveTo(-405.68747, -356.69598, -425.44547, -337.305, -443.3715, -316.05896);
        ((GeneralPath) shape).curveTo(-451.9615, -305.87695, -460.51147, -295.59296, -466.8595, -283.81195);
        ((GeneralPath) shape).curveTo(-473.5595, -271.37695, -479.7535, -258.67096, -486.2115, -246.10394);
        ((GeneralPath) shape).curveTo(-489.34448, -240.00594, -491.2515, -233.49794, -492.64148, -226.84195);
        ((GeneralPath) shape).curveTo(-493.80746, -221.25894, -494.72748, -215.62296, -495.65848, -209.99396);
        ((GeneralPath) shape).curveTo(-496.7765, -203.22395, -496.5395, -196.54295, -495.09848, -189.76396);
        ((GeneralPath) shape).curveTo(-492.32547, -176.70895, -488.64047, -163.94595, -484.0615, -151.43097);
        ((GeneralPath) shape).curveTo(-465.4335, -100.51397, -442.1605, -51.837967, -414.6825, -5.0709686);
        ((GeneralPath) shape).curveTo(-396.8815, 25.221031, -374.1585, 51.371033, -349.8435, 76.36303);
        ((GeneralPath) shape).curveTo(-347.3135, 78.96303, -344.40152, 80.78503, -340.84952, 81.65703);
        ((GeneralPath) shape).curveTo(-336.10352, 82.82103, -331.3735, 84.053024, -326.66953, 85.372025);
        ((GeneralPath) shape).curveTo(-301.8315, 92.33402, -276.99652, 99.30702, -252.17453, 106.328026);
        ((GeneralPath) shape).curveTo(-235.99252, 110.90603, -219.71053, 115.05803, -203.06754, 117.58402);
        ((GeneralPath) shape).curveTo(-197.70753, 118.398026, -192.25554, 118.58302, -186.85854, 119.17902);
        ((GeneralPath) shape).curveTo(-179.53754, 119.98702, -172.24153, 120.33602, -164.92053, 119.11302);
        ((GeneralPath) shape).curveTo(-162.59154, 118.72402, -160.16553, 118.00602, -157.62854, 119.412025);
        ((GeneralPath) shape).curveTo(-157.49654, 121.79202, -159.10155, 123.35103, -160.47054, 124.95802);
        ((GeneralPath) shape).curveTo(-162.05453, 126.817024, -163.77853, 128.55902, -165.44554, 130.34802);
        ((GeneralPath) shape).curveTo(-166.81554, 131.81802, -168.52454, 133.03603, -169.90254, 136.05803);
        ((GeneralPath) shape).curveTo(-162.48254, 131.32404, -156.96454, 126.34903, -152.64255, 119.995026);
        ((GeneralPath) shape).curveTo(-152.05754, 120.619026, -151.74855, 120.79403, -151.74355, 120.97803);
        ((GeneralPath) shape).curveTo(-151.71855, 122.04403, -151.57254, 123.15903, -151.81555, 124.17303);
        ((GeneralPath) shape).curveTo(-153.96754, 133.15002, -156.23856, 142.09802, -158.38655, 151.07503);
        ((GeneralPath) shape).curveTo(-161.82256, 165.43202, -169.59955, 177.94102, -175.77354, 191.18503);
        ((GeneralPath) shape).curveTo(-175.17955, 191.35103, -174.86055, 191.54402, -174.73755, 191.45802);
        ((GeneralPath) shape).curveTo(-174.08255, 191.00102, -173.39555, 190.54703, -172.86855, 189.95903);
        ((GeneralPath) shape).curveTo(-163.22855, 179.21103, -154.27255, 167.96404, -147.59755, 155.06602);
        ((GeneralPath) shape).curveTo(-146.98656, 153.88503, -146.41956, 152.58902, -144.46255, 153.45203);
        ((GeneralPath) shape).curveTo(-144.81155, 159.85303, -145.13455, 166.32002, -145.52455, 172.78203);
        ((GeneralPath) shape).curveTo(-145.93355, 179.56303, -146.69855, 186.33704, -146.76855, 193.12003);
        ((GeneralPath) shape).curveTo(-146.83556, 199.58502, -149.42955, 205.88902, -148.04456, 212.75702);
        ((GeneralPath) shape).curveTo(-142.93655, 211.97702, -138.64856, 209.56302, -134.10556, 207.92102);
        ((GeneralPath) shape).curveTo(-129.36856, 206.20802, -124.96756, 203.49402, -119.65556, 203.17802);
        ((GeneralPath) shape).curveTo(-123.82556, 207.06903, -128.97556, 209.28702, -133.87857, 211.87602);
        ((GeneralPath) shape).curveTo(-139.15057, 214.66002, -144.48756, 217.31902, -149.70557, 219.98602);
        ((GeneralPath) shape).curveTo(-151.44257, 228.94002, -152.98056, 237.48602, -154.78357, 245.97702);
        ((GeneralPath) shape).curveTo(-156.58856, 254.47502, -158.65756, 262.91803, -160.61256, 271.385);
        ((GeneralPath) shape).curveTo(-162.54256, 279.745, -165.20757, 287.956, -166.43356, 297.465);
        ((GeneralPath) shape).curveTo(-163.33257, 296.366, -161.13057, 295.53, -158.89157, 294.805);
        ((GeneralPath) shape).curveTo(-155.74358, 293.787, -152.57358, 292.84, -149.41057, 291.867);
        ((GeneralPath) shape).curveTo(-153.85057, 294.614, -158.15457, 297.633, -162.81256, 299.939);
        ((GeneralPath) shape).curveTo(-166.79855, 301.913, -168.94257, 304.52798, -170.15056, 308.879);
        ((GeneralPath) shape).curveTo(-176.40556, 331.425, -185.22955, 353.099, -193.70355, 374.85);
        ((GeneralPath) shape).curveTo(-201.98256, 396.104, -211.27356, 416.97202, -220.47255, 437.854);
        ((GeneralPath) shape).curveTo(-224.23955, 446.408, -227.54755, 454.89502, -227.18355, 464.431);
        ((GeneralPath) shape).curveTo(-227.12155, 466.033, -227.72354, 467.649, -227.82256, 469.271);
        ((GeneralPath) shape).curveTo(-228.44856, 479.574, -229.73856, 489.901, -229.43056, 500.179);
        ((GeneralPath) shape).curveTo(-229.02356, 513.739, -227.36856, 527.263, -226.21056, 540.8);
        ((GeneralPath) shape).curveTo(-225.72456, 546.484, -225.28555, 552.18, -224.56755, 557.838);
        ((GeneralPath) shape).curveTo(-222.24055, 576.161, -219.53755, 594.44104, -217.46355, 612.793);
        ((GeneralPath) shape).curveTo(-215.26155, 632.275, -211.52855, 651.44, -206.93254, 670.46704);
        ((GeneralPath) shape).curveTo(-205.26654, 677.366, -202.71754, 683.911, -199.70854, 690.338);
        ((GeneralPath) shape).curveTo(-197.66054, 694.71, -194.81154, 698.515, -191.51654, 702.655);
        ((GeneralPath) shape).curveTo(-193.35254, 703.39, -194.54755, 704.23004, -195.78455, 704.296);
        ((GeneralPath) shape).curveTo(-199.29955, 704.48303, -202.88754, 704.75, -206.34555, 704.265);
        ((GeneralPath) shape).curveTo(-213.33356, 703.286, -220.33655, 702.168, -227.18555, 700.503);
        ((GeneralPath) shape).curveTo(-242.22354, 696.847, -257.16754, 692.804, -272.15454, 688.94);
        ((GeneralPath) shape).curveTo(-304.07355, 680.711, -335.24554, 670.479, -364.29153, 654.558);
        ((GeneralPath) shape).curveTo(-366.82553, 653.169, -369.30252, 653.169, -372.11554, 653.742);
        ((GeneralPath) shape).curveTo(-384.88855, 656.344, -397.68353, 658.856, -410.51855, 661.129);
        ((GeneralPath) shape).curveTo(-420.14355, 662.833, -429.87756, 663.92804, -439.49954, 665.64703);
        ((GeneralPath) shape).curveTo(-451.79355, 667.843, -464.02353, 670.40106, -476.28354, 672.78906);
        ((GeneralPath) shape).curveTo(-485.61255, 674.60504, -494.91254, 676.60205, -504.28854, 678.12805);
        ((GeneralPath) shape).curveTo(-510.17355, 679.08606, -516.17053, 679.3851, -522.12854, 679.83905);
        ((GeneralPath) shape).curveTo(-523.63354, 679.95404, -525.49457, 680.262, -526.3375, 677.73206);
        ((GeneralPath) shape).curveTo(-521.6245, 673.5331, -514.8095, 672.56805, -508.63254, 667.65204);
        ((GeneralPath) shape).curveTo(-511.33554, 667.65204, -512.5645, 667.554, -513.77454, 667.668);
        ((GeneralPath) shape).curveTo(-520.26556, 668.27905, -526.74054, 669.158, -533.2445, 669.53406);
        ((GeneralPath) shape).curveTo(-541.3775, 670.004, -549.5335, 670.17004, -557.6815, 670.26605);
        ((GeneralPath) shape).curveTo(-560.5025, 670.2991, -563.4805, 670.18604, -566.0825, 667.7701);
        ((GeneralPath) shape).curveTo(-562.8805, 666.5771, -560.04755, 665.71405, -557.3875, 664.47906);
        ((GeneralPath) shape).curveTo(-554.5875, 663.17804, -551.3955, 662.38104, -548.3035, 658.87506);
        ((GeneralPath) shape).curveTo(-555.2305, 659.22205, -560.8505, 659.52905, -566.4735, 659.7781);
        ((GeneralPath) shape).curveTo(-570.2705, 659.9461, -574.0725, 660.1741, -577.8685, 660.1241);
        ((GeneralPath) shape).curveTo(-584.11255, 660.0411, -590.3535, 659.7591, -596.59454, 659.5511);
        ((GeneralPath) shape).curveTo(-600.12555, 659.4341, -603.65955, 659.3681, -607.1846, 659.1481);
        ((GeneralPath) shape).curveTo(-610.37756, 658.9491, -613.40656, 658.1371, -616.99255, 655.87805);
        ((GeneralPath) shape).curveTo(-608.68054, 652.2391, -599.81055, 652.92004, -592.0795, 647.94904);
        ((GeneralPath) shape).curveTo(-594.0365, 647.22003, -595.25653, 646.44305, -596.5305, 646.343);
        ((GeneralPath) shape).curveTo(-606.3415, 645.57104, -615.7945, 643.083, -625.25354, 640.591);
        ((GeneralPath) shape).curveTo(-626.8275, 640.177, -628.44055, 639.902, -630.04456, 639.611);
        ((GeneralPath) shape).curveTo(-652.78455, 635.49005, -675.40356, 630.919, -696.7286, 621.56903);
        ((GeneralPath) shape).curveTo(-699.0306, 620.56006, -701.21155, 620.49805, -703.7906, 620.99005);
        ((GeneralPath) shape).curveTo(-711.5146, 622.4631, -719.31757, 624.176, -727.1306, 624.40204);
        ((GeneralPath) shape).curveTo(-748.31464, 625.015, -769.5336, 625.80304, -790.68463, 623.39703);
        ((GeneralPath) shape).curveTo(-796.6226, 622.72205, -802.57764, 622.205, -808.5206, 621.577);
        ((GeneralPath) shape).curveTo(-821.7576, 620.18005, -834.9906, 618.73303, -848.23065, 617.36304);
        ((GeneralPath) shape).curveTo(-852.00867, 616.97205, -855.8027, 616.629, -859.59766, 616.517);
        ((GeneralPath) shape).curveTo(-874.04065, 616.088, -888.3597, 617.918, -902.72064, 618.997);
        ((GeneralPath) shape).curveTo(-903.95465, 619.09, -905.45966, 619.739, -906.1517, 617.959);
        ((GeneralPath) shape).curveTo(-905.94165, 617.45996, -905.87067, 616.733, -905.53467, 616.576);
        ((GeneralPath) shape).curveTo(-898.7967, 613.42096, -893.2757, 608.53796, -887.60266, 603.906);
        ((GeneralPath) shape).curveTo(-873.03766, 592.012, -859.60864, 578.902, -847.27167, 564.739);
        ((GeneralPath) shape).curveTo(-836.0267, 551.82904, -825.1747, 538.57404, -814.2557, 525.38403);
        ((GeneralPath) shape).curveTo(-811.31866, 521.835, -808.5967, 518.07904, -806.0677, 514.22705);
        ((GeneralPath) shape).curveTo(-796.6607, 499.90604, -788.0027, 485.14804, -780.2737, 469.84006);
        ((GeneralPath) shape).curveTo(-774.14966, 457.71207, -767.72266, 445.73807, -761.49567, 433.66107);
        ((GeneralPath) shape).curveTo(-760.25464, 431.25406, -759.0707, 428.76706, -758.27466, 426.18808);
        ((GeneralPath) shape).curveTo(-754.01666, 412.38208, -751.2397, 398.17508, -749.97363, 383.87408);
        ((GeneralPath) shape).curveTo(-748.53564, 367.6461, -748.97363, 351.28708, -751.8646, 335.1201);
        ((GeneralPath) shape).curveTo(-754.97064, 317.7421, -757.9976, 300.3491, -761.1286, 282.9751);
        ((GeneralPath) shape).curveTo(-761.5516, 280.6321, -762.3806, 278.36108, -763.0576, 275.9271);
        ((GeneralPath) shape).curveTo(-764.72064, 275.6761, -766.0406, 275.47308, -767.3626, 275.2771);
        ((GeneralPath) shape).curveTo(-778.91364, 273.5591, -790.5476, 272.2671, -802.0026, 270.0481);
        ((GeneralPath) shape).curveTo(-843.4536, 262.0181, -882.21765, 246.65309, -919.07263, 226.2641);
        ((GeneralPath) shape).curveTo(-921.4036, 224.9741, -923.47064, 223.2051, -925.66064, 221.6591);
        ((GeneralPath) shape).lineTo(-925.66064, 221.6581);
        ((GeneralPath) shape).curveTo(-926.5206, 221.1671, -927.37964, 220.6751, -928.23865, 220.18309);
        ((GeneralPath) shape).curveTo(-927.22864, 220.49908, -926.2186, 220.8171, -925.20966, 221.1341);
        ((GeneralPath) shape).curveTo(-922.46265, 222.25009, -919.63763, 223.2061, -916.98065, 224.50609);
        ((GeneralPath) shape).curveTo(-874.5057, 245.2851, -830.21063, 260.4491, -783.41064, 267.89108);
        ((GeneralPath) shape).curveTo(-780.4617, 268.36008, -777.47363, 268.5861, -774.50165, 268.89807);
        ((GeneralPath) shape).curveTo(-771.3386, 269.22906, -768.19165, 270.38007, -764.57263, 269.38806);
        ((GeneralPath) shape).curveTo(-764.57263, 267.56406, -764.2836, 265.94006, -764.61664, 264.45605);
        ((GeneralPath) shape).curveTo(-768.8366, 245.64406, -773.1586, 226.85405, -777.41864, 208.05106);
        ((GeneralPath) shape).curveTo(-777.94763, 205.71806, -779.18066, 204.18506, -781.48566, 203.43205);
        ((GeneralPath) shape).curveTo(-783.29065, 202.84206, -785.02966, 202.05505, -786.80963, 201.38905);
        ((GeneralPath) shape).curveTo(-820.09265, 188.93106, -851.02264, 172.05205, -880.08466, 151.68405);
        ((GeneralPath) shape).curveTo(-882.8647, 149.73505, -886.10266, 148.20905, -887.71765, 144.92705);
        ((GeneralPath) shape).curveTo(-884.60266, 146.34105, -881.36865, 147.54605, -878.41864, 149.24304);
        ((GeneralPath) shape).curveTo(-849.1566, 166.07904, -818.5206, 179.98204, -787.11566, 192.26004);
        ((GeneralPath) shape).curveTo(-785.20465, 193.00703, -783.3287, 194.41704, -781.0107, 192.85304);
        ((GeneralPath) shape).curveTo(-781.7077, 189.85304, -782.1777, 186.88704, -783.0887, 184.06305);
        ((GeneralPath) shape).curveTo(-787.75366, 169.60104, -792.5327, 155.17606, -797.2707, 140.73705);
        ((GeneralPath) shape).curveTo(-800.3147, 131.45905, -803.37866, 122.18604, -806.3687, 112.890045);
        ((GeneralPath) shape).curveTo(-806.7407, 111.73405, -806.7127, 110.45004, -806.9757, 108.405045);
        ((GeneralPath) shape).curveTo(-804.3047, 109.72704, -802.1207, 111.77304, -800.6137, 111.35805);
        ((GeneralPath) shape).curveTo(-797.1267, 110.39805, -794.9127, 112.52705, -792.2047, 113.45105);
        ((GeneralPath) shape).curveTo(-785.6077, 115.70205, -779.0297, 118.01005, -772.4447, 120.29505);
        ((GeneralPath) shape).curveTo(-773.1207, 119.25505, -773.6377, 118.00305, -774.5707, 117.31005);
        ((GeneralPath) shape).curveTo(-784.8587, 109.67105, -793.6517, 100.38005, -803.0097, 91.71605);
        ((GeneralPath) shape).curveTo(-803.7567, 91.02505, -804.1977, 90.00405, -804.9427, 88.89605);
        ((GeneralPath) shape).curveTo(-798.78467, 82.60005, -790.1017, 81.22305, -782.8977, 76.69905);
        ((GeneralPath) shape).curveTo(-784.3187, 74.68505, -785.3957, 73.14605, -786.4857, 71.61605);
        ((GeneralPath) shape).curveTo(-787.74774, 69.84505, -789.1347, 68.151054, -790.25073, 66.29305);
        ((GeneralPath) shape).curveTo(-791.13873, 64.81406, -793.1027, 63.71905, -792.2457, 60.817055);
        ((GeneralPath) shape).curveTo(-786.94574, 65.54305, -783.5477, 71.55605, -778.67474, 75.29305);
        ((GeneralPath) shape).curveTo(-766.1157, 72.970055, -754.12775, 70.73705, -742.13477, 68.537056);
        ((GeneralPath) shape).curveTo(-727.05774, 65.77106, -711.8868, 65.68205, -696.6548, 66.857056);
        ((GeneralPath) shape).curveTo(-684.1958, 67.818054, -671.7248, 68.61906, -659.2558, 69.455055);
        ((GeneralPath) shape).curveTo(-655.7308, 69.691055, -652.1908, 69.71406, -648.6678, 69.97606);
        ((GeneralPath) shape).curveTo(-629.9668, 71.36906, -611.28876, 73.204056, -592.56476, 74.13706);
        ((GeneralPath) shape).curveTo(-564.06274, 75.55806, -535.53174, 76.381065, -507.00977, 77.38606);
        ((GeneralPath) shape).curveTo(-505.50278, 77.44006, -503.97177, 76.83606, -502.33777, 76.51506);
        ((GeneralPath) shape).curveTo(-502.09076, 74.79906, -501.76178, 73.48406, -501.74176, 72.16406);
        ((GeneralPath) shape).curveTo(-501.70776, 69.993065, -501.69577, 67.79607, -501.98575, 65.65206);
        ((GeneralPath) shape).curveTo(-504.23874, 48.983063, -510.83276, 34.248062, -522.8818, 22.45406);
        ((GeneralPath) shape).curveTo(-530.6338, 14.868059, -538.9408, 7.7770596, -547.4958, 1.101059);
        ((GeneralPath) shape).curveTo(-557.9888, -7.086941, -568.8518, -14.841941, -581.1908, -20.189941);
        ((GeneralPath) shape).curveTo(-582.3568, -20.695942, -583.7308, -21.334942, -583.0638, -23.484941);
        ((GeneralPath) shape).curveTo(-577.4458, -24.55894, -571.5378, -23.656942, -564.2818, -24.161942);
        ((GeneralPath) shape).curveTo(-567.7508, -26.692942, -570.1418, -28.306942, -572.3838, -30.106941);
        ((GeneralPath) shape).curveTo(-574.9258, -32.146942, -577.4198, -34.26194, -579.7748, -36.51194);
        ((GeneralPath) shape).curveTo(-581.9328, -38.57294, -583.96875, -40.78094, -585.89276, -43.063942);
        ((GeneralPath) shape).curveTo(-587.8188, -45.345943, -589.6078, -47.75194, -591.33075, -50.193943);
        ((GeneralPath) shape).curveTo(-593.21075, -52.85594, -595.03174, -55.568943, -596.71576, -58.35794);
        ((GeneralPath) shape).curveTo(-598.1418, -60.72094, -600.97473, -62.46394, -600.63074, -66.51294);
        ((GeneralPath) shape).curveTo(-598.31573, -65.31494, -596.58875, -64.42094, -593.18976, -62.661938);
        ((GeneralPath) shape).curveTo(-598.43677, -70.89094, -602.72473, -77.438934, -606.8268, -84.10094);
        ((GeneralPath) shape).curveTo(-610.5278, -90.11194, -614.3048, -96.102936, -617.55975, -102.355934);
        ((GeneralPath) shape).curveTo(-627.2178, -120.908936, -636.7908, -139.50993, -646.1058, -158.23694);
        ((GeneralPath) shape).curveTo(-657.23676, -180.61494, -668.41077, -202.98294, -678.94275, -225.64594);
        ((GeneralPath) shape).curveTo(-693.48175, -256.92993, -707.83575, -288.30695, -719.28174, -320.92194);
        ((GeneralPath) shape).curveTo(-729.62476, -350.39493, -740.37775, -379.74094, -748.65576, -409.87595);
        ((GeneralPath) shape).curveTo(-754.40875, -430.82095, -758.96875, -452.09195, -764.6918, -473.04596);
        ((GeneralPath) shape).curveTo(-771.2778, -497.16095, -777.7438, -521.27295, -781.36975, -546.053);
        ((GeneralPath) shape).curveTo(-783.72974, -562.178, -786.47577, -578.255, -788.44275, -594.427);
        ((GeneralPath) shape).curveTo(-790.3768, -610.335, -791.8237, -626.317, -792.95575, -642.304);
        ((GeneralPath) shape).curveTo(-793.7228, -653.137, -793.6287, -664.034, -793.7828, -674.905);
        ((GeneralPath) shape).curveTo(-793.8088, -676.684, -793.1238, -678.474, -792.76776, -680.252);
        ((GeneralPath) shape).curveTo(-788.2978, -681.31104, -784.25977, -681.04803, -780.21576, -680.61);
        ((GeneralPath) shape).curveTo(-770.76575, -679.584, -761.31476, -678.561, -751.86475, -677.529);
        ((GeneralPath) shape).curveTo(-746.19073, -676.908, -740.51276, -676.326, -734.8477, -675.632);
        ((GeneralPath) shape).curveTo(-722.7187, -674.148, -710.5957, -672.614, -698.4737, -671.07404);
        ((GeneralPath) shape).curveTo(-693.3517, -670.424, -688.2437, -669.666, -683.1197, -669.03204);
        ((GeneralPath) shape).curveTo(-678.0407, -668.405, -672.9497, -667.87305, -667.7387, -667.28503);
        ((GeneralPath) shape).curveTo(-667.0367, -665.64905, -666.2877, -664.213, -665.7937, -662.69403);
        ((GeneralPath) shape).curveTo(-663.8157, -656.616, -664.4477, -650.31903, -664.3207, -644.08405);
        ((GeneralPath) shape).curveTo(-664.27167, -641.70807, -665.1637, -639.20703, -663.20667, -636.59);
        ((GeneralPath) shape).curveTo(-656.95264, -635.19604, -650.28864, -633.84705, -643.52264, -633.775);
        ((GeneralPath) shape).curveTo(-631.02765, -633.643, -618.52563, -633.882, -606.02966, -634.09503);
        ((GeneralPath) shape).curveTo(-604.54266, -634.12006, -603.06964, -634.94403, -601.8987, -635.30304);
        ((GeneralPath) shape).curveTo(-598.56067, -645.213, -599.4717, -655.86005, -593.2857, -664.20306);
        ((GeneralPath) shape).curveTo(-588.7177, -665.77704, -584.3347, -665.2281, -580.0227, -665.1891);
        ((GeneralPath) shape).curveTo(-571.3257, -665.1101, -562.6287, -664.8821, -553.9337, -664.65607);
        ((GeneralPath) shape).curveTo(-550.9477, -664.57904, -547.9627, -664.3721, -544.9837, -664.1481);
        ((GeneralPath) shape).curveTo(-534.1457, -663.33105, -523.3207, -662.3031, -512.4707, -661.69006);
        ((GeneralPath) shape).curveTo(-499.4447, -660.95404, -486.3967, -660.58405, -473.3617, -659.9891);
        ((GeneralPath) shape).curveTo(-471.8457, -659.9201, -470.3487, -659.4241, -468.44168, -659.0461);
        ((GeneralPath) shape).curveTo(-470.34067, -648.41406, -478.4007, -640.7621, -480.4777, -630.0661);
        ((GeneralPath) shape).curveTo(-476.6337, -630.0061, -473.5007, -630.1661, -471.0997, -630.9961);
        ((GeneralPath) shape).curveTo(-467.8287, -635.2011, -465.2227, -639.0301, -462.1407, -642.4261);
        ((GeneralPath) shape).curveTo(-451.51868, -654.1341, -437.55768, -659.1811, -422.39767, -660.9891);
        ((GeneralPath) shape).curveTo(-412.4337, -662.1781, -402.33167, -662.20807, -392.28967, -662.7251);
        ((GeneralPath) shape).curveTo(-390.93567, -662.7951, -389.53568, -662.8701, -388.21866, -662.6191);
        ((GeneralPath) shape).curveTo(-380.67065, -661.18005, -373.04465, -661.75806, -365.44666, -661.6231);
        ((GeneralPath) shape).curveTo(-358.65164, -661.5011, -351.84967, -661.5071, -345.06265, -661.1991);
        ((GeneralPath) shape).curveTo(-324.70264, -660.2771, -304.34964, -659.19507, -283.99066, -658.2451);
        ((GeneralPath) shape).curveTo(-275.57666, -657.8521, -267.15265, -657.69214, -258.73767, -657.3241);
        ((GeneralPath) shape).curveTo(-243.26067, -656.6471, -227.79468, -655.6391, -212.31168, -655.2441);
        ((GeneralPath) shape).curveTo(-197.09468, -654.85706, -181.86168, -655.0241, -166.63568, -655.0251);
        ((GeneralPath) shape).curveTo(-162.29068, -655.0251, -157.93768, -655.1681, -153.60268, -655.4591);
        ((GeneralPath) shape).curveTo(-140.04868, -656.3661, -126.49867, -657.3281, -112.95468, -658.3681);
        ((GeneralPath) shape).curveTo(-107.78968, -658.7641, -104.879684, -658.2221, -107.01068, -650.6021);
        ((GeneralPath) shape).curveTo(-107.52068, -648.77814, -108.17368, -646.96313, -109.005684, -645.2641);
        ((GeneralPath) shape).curveTo(-112.70769, -637.70807, -116.08369, -629.9521, -120.34368, -622.7191);
        ((GeneralPath) shape).curveTo(-128.75568, -608.4401, -137.62769, -594.4301, -146.40668, -580.3701);
        ((GeneralPath) shape).curveTo(-150.14868, -574.3781, -153.82268, -568.4281, -156.54367, -561.8231);
        ((GeneralPath) shape).curveTo(-165.98567, -538.9121, -172.22467, -514.9621, -179.88766, -491.47513);
        ((GeneralPath) shape).curveTo(-183.36166, -480.83112, -184.39166, -469.69113, -186.78366, -458.83713);
        ((GeneralPath) shape).curveTo(-193.82666, -426.88312, -197.21466, -394.47812, -198.84566, -361.89612);
        ((GeneralPath) shape).curveTo(-200.61465, -326.5411, -199.74866, -291.23712, -193.89966, -256.21613);
        ((GeneralPath) shape).curveTo(-191.88766, -244.17113, -190.32666, -232.00912, -186.14766, -220.43312);
        ((GeneralPath) shape).curveTo(-181.62965, -207.91512, -177.25465, -195.33913, -172.42966, -182.93912);
        ((GeneralPath) shape).curveTo(-165.01866, -163.89511, -155.53865, -145.85912, -144.81366, -128.48111);
        ((GeneralPath) shape).curveTo(-140.62466, -121.69411, -135.24567, -115.90911, -128.67867, -111.41211);
        ((GeneralPath) shape).curveTo(-118.54666, -104.47111, -107.58966, -98.93711, -96.03267, -94.90211);
        ((GeneralPath) shape).curveTo(-84.57767, -90.90211, -73.02867, -91.27211, -62.06467, -97.12511);
        ((GeneralPath) shape).curveTo(-46.64567, -105.35711, -33.608673, -116.08211, -25.52267, -132.0381);
        ((GeneralPath) shape).curveTo(-22.820671, -137.3681, -19.78967, -142.5311, -16.89167, -147.76111);
        ((GeneralPath) shape).curveTo(-15.96967, -149.42511, -15.10867, -151.14311, -13.99067, -152.6681);
        ((GeneralPath) shape).curveTo(-13.29867, -153.6111, -12.175671, -154.2361, -10.75367, -155.41011);
        ((GeneralPath) shape).curveTo(-9.290669, -151.43411, -7.94367, -148.19011, -6.8946695, -144.8531);
        ((GeneralPath) shape).curveTo(2.07833, -116.3131, 8.969331, -87.2571, 14.12633, -57.8011);
        ((GeneralPath) shape).curveTo(16.09633, -46.547104, 16.80833, -35.158104, 16.40633, -23.691101);
        ((GeneralPath) shape).curveTo(16.25333, -19.298101, 15.2233305, -15.803101, 11.51833, -13.139101);
        ((GeneralPath) shape).curveTo(9.619329, -11.773101, 8.140329, -9.823101, 5.9583297, -7.618101);
        ((GeneralPath) shape).curveTo(9.62733, -5.987101, 12.564329, -4.6331015, 15.540329, -3.3731012);
        ((GeneralPath) shape).curveTo(18.28933, -2.2091012, 21.01933, -0.9331012, 23.87233, -0.09710121);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_22
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 965.97f, 1336.3f));

        // _0_0_0_23

        // _0_0_0_23_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(4.281, 5.928, 8.355, 12.024, 12.94, 17.707);
        ((GeneralPath) shape).curveTo(15.804, 21.259, 19.299, 24.353, 22.772, 27.35);
        ((GeneralPath) shape).curveTo(28.265, 32.091, 34.826, 33.164, 41.846, 32.155);
        ((GeneralPath) shape).curveTo(45.986, 31.558998, 49.555, 29.623, 52.898003, 27.283998);
        ((GeneralPath) shape).curveTo(58.707, 23.220999, 63.800003, 18.384998, 68.103004, 12.724998);
        ((GeneralPath) shape).curveTo(68.966, 11.589998, 70.048004, 10.620998, 72.234, 8.291998);
        ((GeneralPath) shape).curveTo(71.621, 11.048998, 71.53, 12.086998, 71.163, 13.015998);
        ((GeneralPath) shape).curveTo(66.999, 23.557999, 59.654003, 31.411, 49.732002, 36.520996);
        ((GeneralPath) shape).curveTo(40.177002, 41.441998, 30.388002, 41.321995, 21.202002, 35.165997);
        ((GeneralPath) shape).curveTo(12.982001, 29.657997, 6.161001, 22.687996, 1.281002, 14.066996);
        ((GeneralPath) shape).curveTo(-2.290998, 7.7569957, -5.2089977, 1.114996, -4.603998, -6.448004);
        ((GeneralPath) shape).curveTo(-3.0709982, -4.2980037, -1.5469983, -2.1410036, 1.9073486E-6, -3.8146973E-6);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_23
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1261.1f, 1317.1f));

        // _0_0_0_24

        // _0_0_0_24_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(13.301, -14.952, 24.521, -30.957, 32.16, -49.593);
        ((GeneralPath) shape).curveTo(38.661, -65.45, 44.422, -81.481, 48.382, -98.147);
        ((GeneralPath) shape).curveTo(48.807, -99.936005, 48.83, -101.82101, 49.076, -103.979004);
        ((GeneralPath) shape).curveTo(46.93, -104.481, 45.14, -104.993004, 43.316, -105.311005);
        ((GeneralPath) shape).curveTo(32.048004, -107.276, 20.739002, -108.276, 9.278004, -107.240005);
        ((GeneralPath) shape).curveTo(4.4230037, -106.8, -0.4889965, -107.01, -5.3729963, -106.87701);
        ((GeneralPath) shape).curveTo(-8.318996, -106.796005, -11.260996, -106.62201, -14.832996, -106.462006);
        ((GeneralPath) shape).curveTo(-14.380997, -102.548004, -13.811996, -99.18101, -13.650996, -95.79401);
        ((GeneralPath) shape).curveTo(-13.497996, -92.549, -13.570996, -89.26201, -13.906996, -86.032005);
        ((GeneralPath) shape).curveTo(-14.271996, -82.535, -14.898995, -79.045006, -15.700995, -75.619);
        ((GeneralPath) shape).curveTo(-16.441996, -72.459, -17.493996, -69.364006, -18.540995, -66.285);
        ((GeneralPath) shape).curveTo(-19.662994, -62.982002, -20.714994, -59.616005, -23.837994, -55.952003);
        ((GeneralPath) shape).curveTo(-25.405994, -58.506004, -26.410994, -60.054005, -27.328993, -61.652004);
        ((GeneralPath) shape).curveTo(-31.256992, -68.48701, -43.325993, -71.315, -50.673992, -63.689003);
        ((GeneralPath) shape).curveTo(-58.44799, -55.622, -58.832993, -45.576004, -51.30699, -36.835003);
        ((GeneralPath) shape).curveTo(-50.650993, -36.072002, -50.201992, -35.13, -49.372993, -33.823);
        ((GeneralPath) shape).curveTo(-62.162994, -28.975002, -71.91599, -34.182003, -80.84999, -41.473003);
        ((GeneralPath) shape).curveTo(-82.64399, -41.021004, -82.46799, -39.784004, -82.47499, -38.787003);
        ((GeneralPath) shape).curveTo(-82.60299, -20.864002, -82.95999, -2.937004, -82.66999, 14.978996);
        ((GeneralPath) shape).curveTo(-82.54799, 22.534996, -81.36899, 30.122997, -80.08299, 37.595997);
        ((GeneralPath) shape).curveTo(-78.62599, 46.058, -73.79599, 49.088997, -65.40199, 46.991997);
        ((GeneralPath) shape).curveTo(-61.503994, 46.017998, -57.693993, 44.379997, -54.105995, 42.533997);
        ((GeneralPath) shape).curveTo(-33.338997, 31.850998, -15.545994, 17.472996, 3.8146973E-6, -0.002002716);
        ((GeneralPath) shape).moveTo(-64.554, -100.091995);
        ((GeneralPath) shape).curveTo(-67.085, -101.643, -69.537, -101.464, -72.192, -100.157);
        ((GeneralPath) shape).curveTo(-77.024, -97.777, -77.327, -87.602, -72.918, -84.688995);
        ((GeneralPath) shape).curveTo(-70.418, -83.037994, -67.831, -83.078995, -65.252, -84.30399);
        ((GeneralPath) shape).curveTo(-62.077, -85.81099, -60.321, -88.34599, -60.215, -92.32299);
        ((GeneralPath) shape).curveTo(-60.355, -95.35299, -61.508, -98.22599, -64.554, -100.09199);
        ((GeneralPath) shape).moveTo(-66.191, 52.79801);
        ((GeneralPath) shape).curveTo(-75.517, 53.64101, -81.854004, 49.699013, -86.102005, 41.73201);
        ((GeneralPath) shape).curveTo(-88.82001, 36.63601, -90.15, 31.09401, -91.065, 25.45401);
        ((GeneralPath) shape).curveTo(-92.810005, 14.70101, -93.065, 3.8460102, -93.127, -7.0209885);
        ((GeneralPath) shape).curveTo(-93.224, -23.860989, -92.684, -40.661987, -91.469, -57.47299);
        ((GeneralPath) shape).curveTo(-90.314, -73.44099, -90.045, -89.47299, -89.383, -105.47699);
        ((GeneralPath) shape).curveTo(-89.327, -106.83399, -89.313, -108.19599, -89.162, -109.54299);
        ((GeneralPath) shape).curveTo(-88.646, -114.15199, -87.684006, -115.10999, -83.048004, -115.31699);
        ((GeneralPath) shape).curveTo(-72.742004, -115.77699, -62.433006, -116.162994, -52.126003, -116.578995);
        ((GeneralPath) shape).curveTo(-52.127003, -116.62499, -52.129, -116.671, -52.130005, -116.716995);
        ((GeneralPath) shape).curveTo(-45.346004, -116.716995, -38.556004, -116.885994, -31.778006, -116.684);
        ((GeneralPath) shape).curveTo(-13.870005, -116.152, 4.034994, -115.525, 21.934996, -114.796);
        ((GeneralPath) shape).curveTo(28.438995, -114.531, 34.944996, -114.04, 41.412994, -113.323);
        ((GeneralPath) shape).curveTo(44.893993, -112.937, 48.360992, -112.062996, 51.720993, -111.04);
        ((GeneralPath) shape).curveTo(57.860992, -109.169, 58.95299, -107.116, 57.733994, -100.754);
        ((GeneralPath) shape).curveTo(57.631992, -100.221, 57.512993, -99.689995, 57.365993, -99.168);
        ((GeneralPath) shape).curveTo(54.053993, -87.427, 50.847992, -75.656, 47.393993, -63.958);
        ((GeneralPath) shape).curveTo(43.439995, -50.569, 36.489994, -38.559998, 29.622993, -26.542);
        ((GeneralPath) shape).curveTo(11.341993, 5.4489994, -14.437008, 29.643002, -46.90101, 46.872);
        ((GeneralPath) shape).curveTo(-52.96801, 50.092003, -59.271008, 52.174004, -66.19101, 52.798);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_24
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1148.6f, 1364.8f));

        // _0_0_0_25

        // _0_0_0_25_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.717, 1.738, 1.381, 3.509, 2.168, 5.224);
        ((GeneralPath) shape).curveTo(5.696, 12.906, 9.71, 20.293999, 15.518001, 26.546001);
        ((GeneralPath) shape).curveTo(19.865002, 31.225002, 24.927002, 35.005, 31.307, 36.033);
        ((GeneralPath) shape).curveTo(40.61, 37.534, 49.772, 36.946, 58.096, 31.822);
        ((GeneralPath) shape).curveTo(61.098, 29.974, 64.064, 28.04, 66.883, 25.928001);
        ((GeneralPath) shape).curveTo(73.62601, 20.881, 80.259, 15.685001, 86.967, 10.5910015);
        ((GeneralPath) shape).curveTo(89.107, 8.965001, 91.345, 7.4680014, 93.539, 5.9120016);
        ((GeneralPath) shape).curveTo(93.862, 6.238002, 94.184, 6.5640016, 94.507, 6.890002);
        ((GeneralPath) shape).curveTo(94.274, 7.6170015, 94.219, 8.484002, 93.77901, 9.051002);
        ((GeneralPath) shape).curveTo(89.284004, 14.840002, 85.05, 20.878002, 80.11001, 26.266003);
        ((GeneralPath) shape).curveTo(72.850006, 34.182003, 64.007, 40.082, 53.750008, 43.442);
        ((GeneralPath) shape).curveTo(43.55401, 46.782, 33.202007, 46.538002, 23.606009, 41.663002);
        ((GeneralPath) shape).curveTo(8.416009, 33.946003, 0.6910076, 20.666002, -2.3499908, 4.3150024);
        ((GeneralPath) shape).curveTo(-2.3999908, 4.0500026, -2.470991, 3.7520025, -2.3999908, 3.5070024);
        ((GeneralPath) shape).curveTo(-1.9999908, 2.1260023, -2.4459908, 0.1690023, 9.298325E-6, 2.3841858E-6);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_25
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1111.3f, 252.36f));

        // _0_0_0_26

        // _0_0_0_26_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.049, -0.028, 0.085, -0.064, 0.133, -0.092);
        ((GeneralPath) shape).curveTo(0.124, -0.026, 0.115, 0.04, 0.105000004, 0.105);
        ((GeneralPath) shape).lineTo(7.4505806E-9, 0.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_26
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1100.1f, 715.9f));

        // _0_0_0_27

        // _0_0_0_27_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.016, -0.12, 0.019, -0.239, 0.033, -0.359);
        ((GeneralPath) shape).curveTo(0.063999996, -0.278, 0.097, -0.198, 0.126, -0.118);
        ((GeneralPath) shape).lineTo(0.0, 0.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_27
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1396.7f, 230));

        // _0_0_0_28

        // _0_0_0_28_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.071, -0.034, -0.142, -0.075, -0.213, -0.112);
        ((GeneralPath) shape).curveTo(-0.102, -0.105000004, 0.009000003, -0.098000005, 0.11899999, -0.091000006);
        ((GeneralPath) shape).lineTo(-1.4901161E-8, -7.4505806E-9);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_28
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1496.5f, 1135.4f));

        // _0_0_0_29

        // _0_0_0_29_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.188, 0.058, -0.375, 0.117, -0.563, 0.175);
        ((GeneralPath) shape).curveTo(-0.40900004, 0.078999996, -0.25700003, -0.020999998, -0.10200003, -0.11600001);
        ((GeneralPath) shape).lineTo(-2.9802322E-8, -1.4901161E-8);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_29
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1168.8f, 1094.3f));

        // _0_0_0_30

        // _0_0_0_30_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.033, 0.063, 0.077, 0.11, 0.111, 0.171);
        ((GeneralPath) shape).curveTo(0.039000005, 0.153, -0.032000005, 0.135, -0.104, 0.117);
        ((GeneralPath) shape).lineTo(0.0, 0.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_30
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 752.12f, 984.98f));

        // _0_0_0_31

        // _0_0_0_31_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.128, 0.062, 0.255, 0.125, 0.383, 0.187);
        ((GeneralPath) shape).lineTo(0.27699998, 0.301);
        ((GeneralPath) shape).curveTo(0.18499997, 0.19999999, 0.09299998, 0.099999994, -2.9802322E-8, 0.0);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_31
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1504.5f, 1130.3f));

        // _0_0_0_32

        // _0_0_0_32_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.079, 0.042, -0.162, 0.078, -0.243, 0.118);
        ((GeneralPath) shape).curveTo(-0.212, 0.031000003, -0.153, -0.022, -0.125, -0.11399999);
        ((GeneralPath) shape).curveTo(-0.12, -0.10999999, 0.0, 7.4505806E-9, 0.0, 7.4505806E-9);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_32
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1500.2f, 1133.7f));

        // _0_0_0_33

        // _0_0_0_33_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.02, 0.067, -0.052, 0.12, -0.069, 0.19);
        ((GeneralPath) shape).lineTo(-0.18, 0.074999996);
        ((GeneralPath) shape).curveTo(-0.120000005, 0.049999997, -0.06000001, 0.023999996, 0.0, -7.4505806E-9);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_33
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 752.5f, 985.17f));

        // _0_0_0_34

        // _0_0_0_34_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.038, 0.061, 0.087, 0.105, 0.126, 0.164);
        ((GeneralPath) shape).curveTo(0.047, 0.15100001, -0.023000002, 0.123, -0.104, 0.113000005);
        ((GeneralPath) shape).curveTo(-0.106, 0.11400001, 0.0, 7.4505806E-9, 0.0, 7.4505806E-9);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_34
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 757.33f, 988.34f));

        // _0_0_0_35

        // _0_0_0_35_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.078, 0.01, 0.145, 0.04, 0.224, 0.047);
        ((GeneralPath) shape).lineTo(0.172, 0.105);
        ((GeneralPath) shape).curveTo(0.199, 0.076, 0.22500001, 0.047, 0.22500001, 0.047);
        ((GeneralPath) shape).curveTo(0.261, 0.124, 0.308, 0.188, 0.345, 0.263);
        ((GeneralPath) shape).curveTo(0.271, 0.229, 0.194, 0.19800001, 0.120000005, 0.16300002);
        ((GeneralPath) shape).curveTo(0.08500001, 0.10100002, 0.036000006, 0.060000017, 7.4505806E-9, 1.4901161E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_35
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1509, 1128.2f));

        // _0_0_0_36

        // _0_0_0_36_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.165, 0.107, -0.33, 0.214, -0.495, 0.322);
        ((GeneralPath) shape).curveTo(-0.465, 0.286, -0.44300002, 0.241, -0.41, 0.20899999);
        ((GeneralPath) shape).curveTo(-0.304, 0.10799999, -0.139, 0.06799999, 0.0, -1.4901161E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_36
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 844.52f, 893.64f));

        // _0_0_0_37

        // _0_0_0_37_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).lineTo(0.437, 0.002);
        ((GeneralPath) shape).lineTo(0.22700001, 0.491);
        ((GeneralPath) shape).lineTo(1.4901161E-8, 0.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_37
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1500.1f, 1133.9f));

        // _0_0_0_38

        // _0_0_0_38_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.129, -0.007, -0.254, -0.003, -0.382, -0.008);
        ((GeneralPath) shape).lineTo(-0.11500001, -0.119);
        ((GeneralPath) shape).curveTo(-0.11100001, -0.115, -7.4505806E-9, 0.0, -7.4505806E-9, 0.0);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_38
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1496.5f, 1135.4f));

        // _0_0_0_39

        // _0_0_0_39_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).lineTo(-0.103, -0.116);
        ((GeneralPath) shape).curveTo(-0.012000002, -0.154, 0.078999996, -0.192, 0.17099999, -0.22999999);
        ((GeneralPath) shape).curveTo(0.117999986, -0.14299999, 0.04699999, -0.099999994, -1.4901161E-8, 1.4901161E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_39
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 961.37f, 1329.8f));

        // _0_0_0_40

        // _0_0_0_40_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.033, -0.047, -0.067, -0.094, -0.1, -0.141);
        ((GeneralPath) shape).lineTo(0.008999996, -0.255);
        ((GeneralPath) shape).curveTo(9.999955E-4, -0.169, 0.0069999956, -0.085999995, -3.7252903E-9, 0.0);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_40
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1168.8f, 1094.3f));

        // _0_0_0_41

        // _0_0_0_41_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.004, -0.003, -0.1, 0.114, -0.1, 0.114);
        ((GeneralPath) shape).curveTo(-0.477, -0.143, -0.85400003, -0.4, -1.23, -0.65599996);
        ((GeneralPath) shape).curveTo(-0.821, -0.43699998, -0.412, -0.21699995, 0.0, 5.9604645E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_41
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 961.27f, 1329.7f));

        // _0_0_0_42

        // _0_0_0_42_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.146, -0.332, -0.291, -0.663, -0.374, -0.853);
        ((GeneralPath) shape).curveTo(-0.26900002, -0.696, -0.07800001, -0.40899998, 0.111, -0.11799997);
        ((GeneralPath) shape).curveTo(0.109000005, -0.11399997, 0.0, 2.9802322E-8, 0.0, 2.9802322E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_42
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1100.8f, 716.89f));

        // _0_0_0_43

        // _0_0_0_43_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.129, -0.252, -0.258, -0.503, -0.387, -0.755);
        ((GeneralPath) shape).curveTo(-0.287, -0.687, -0.174, -0.63, -0.102, -0.53999996);
        ((GeneralPath) shape).curveTo(-9.999946E-4, -0.41399997, -0.029, -0.18399996, 0.0, 5.9604645E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_43
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1100.1f, 715.91f));

        // _0_0_0_44

        // _0_0_0_44_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(0.001, -0.002, 0.128, -0.12, 0.128, -0.12);
        ((GeneralPath) shape).curveTo(0.18800001, -0.0019999966, 0.24900001, 0.116000004, 0.30900002, 0.23299998);
        ((GeneralPath) shape).curveTo(0.201, 0.15999998, 0.10500002, 0.07699998, 2.9802322E-8, -1.4901161E-8);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_44
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1040.1f, 689.52f));

        // _0_0_0_45

        // _0_0_0_45_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.14, -0.42, -0.279, -0.84, -0.419, -1.26);
        ((GeneralPath) shape).curveTo(-0.419, -1.26, -0.384, -1.29, -0.348, -1.318);
        ((GeneralPath) shape).curveTo(-0.384, -1.29, -0.419, -1.2609999, -0.419, -1.2609999);
        ((GeneralPath) shape).curveTo(-0.438, -1.3519999, -0.453, -1.4449999, -0.47100002, -1.537);
        ((GeneralPath) shape).curveTo(-0.40800002, -1.482, -0.338, -1.4319999, -0.277, -1.3759999);
        ((GeneralPath) shape).curveTo(-0.185, -0.91699994, -0.09200001, -0.45899993, 0.0, 1.1920929E-7);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_45
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1111.3f, 252.36f));

        // _0_0_0_46

        // _0_0_0_46_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.002, -0.004, 0.103, 0.102, 0.103, 0.102);
        ((GeneralPath) shape).curveTo(-0.207, 0.352, 0.089, -0.018, 0.0, 0.0);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_46
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 1396.7f, 230));

        // _0_0_0_47

        // _0_0_0_47_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(0.0, 0.0);
        ((GeneralPath) shape).curveTo(-0.006, 0.004, 0.113, -0.087, 0.113, -0.087);
        ((GeneralPath) shape).curveTo(0.306, -0.04, 0.499, 0.0069999993, 0.692, 0.055000007);
        ((GeneralPath) shape).curveTo(0.46099997, 0.037000008, 0.23199996, 0.018000007, 0.0, 7.4505806E-9);

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_47

        g.setTransform(transformations.pop()); // _0_0_0

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

