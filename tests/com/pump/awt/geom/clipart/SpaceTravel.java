package com.pump.awt.geom.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;

import static java.awt.Color.WHITE;
import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/329307/space-travel
 * </p>
 */
public class SpaceTravel implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public SpaceTravel() {
        this(1116, 762);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public SpaceTravel(int width, int height) {
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
        double coef = Math.min((double) width / (double) 1116, (double) height / (double) 762);

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
        g.transform(new AffineTransform(3.7795277f, 0, 0, 3.7795277f, 5.7671015E-5f, 0));

        // _0

        // _0_0

        // _0_0_0

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(263.2, 100.362);
        ((GeneralPath) shape).curveTo(281.862, 107.1226, 295.9787, 124.7251, 295.9787, 146.5744);
        ((GeneralPath) shape).curveTo(295.9787, 173.1872, 275.4643, 194.7693, 250.168, 194.7693);
        ((GeneralPath) shape).curveTo(238.0737, 194.7693, 229.6037, 177.6367, 218.887, 181.7754);
        ((GeneralPath) shape).curveTo(203.6323, 187.6667, 196.19489, 205.6685, 179.3232, 205.6685);
        ((GeneralPath) shape).curveTo(163.2283, 205.6685, 154.4271, 191.3557, 140.9006, 183.71921);
        ((GeneralPath) shape).curveTo(133.5699, 179.58061, 125.557304, 191.0227, 116.6528, 191.0227);
        ((GeneralPath) shape).curveTo(100.880905, 191.0227, 92.732, 175.76451, 78.727905, 169.8641);
        ((GeneralPath) shape).curveTo(56.175507, 160.362, 34.738506, 147.6813, 34.738506, 121.7106);
        ((GeneralPath) shape).curveTo(34.738506, 119.2572, 37.458908, 115.3765, 35.250706, 114.4918);
        ((GeneralPath) shape).curveTo(16.298605, 106.8985, 1.0224075, 90.2563, 1.0224075, 67.853195);
        ((GeneralPath) shape).curveTo(1.0224075, 41.240395, 21.536808, 19.658295, 46.833107, 19.658295);
        ((GeneralPath) shape).curveTo(51.908207, 19.658295, 57.417206, 24.943295, 61.35341, 22.132694);
        ((GeneralPath) shape).curveTo(72.527405, 14.153894, 82.55791, 4.331295, 96.901306, 4.331295);
        ((GeneralPath) shape).curveTo(111.48021, 4.331295, 119.08461, 20.354494, 132.8607, 22.669794);
        ((GeneralPath) shape).curveTo(144.447, 24.616995, 152.31801, 9.142294, 164.6774, 9.142294);
        ((GeneralPath) shape).curveTo(187.5967, 9.142294, 204.16159, 27.345795, 209.9577, 49.98239);
        ((GeneralPath) shape).curveTo(210.5732, 52.38629, 214.9113, 49.33309, 217.4704, 49.33309);
        ((GeneralPath) shape).curveTo(242.7667, 49.33309, 263.2811, 70.91519, 263.2811, 97.52799);
        ((GeneralPath) shape).curveTo(263.2811, 98.47969, 262.3167, 100.04199, 263.2, 100.36199);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x043C77));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.setStroke(new BasicStroke(0.0762f, 0, 0, 4));
        g.draw(shape);

        // _0_0_0_1

        // _0_0_0_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(167.715, 115.898);
        ((GeneralPath) shape).curveTo(166.7516, 120.085304, 163.6205, 123.40781, 159.194, 125.538);
        ((GeneralPath) shape).lineTo(163.3276, 132.1423);
        ((GeneralPath) shape).curveTo(164.421, 132.1783, 165.54341, 132.3219, 166.6745, 132.5821);
        ((GeneralPath) shape).curveTo(173.8655, 134.2368, 178.6839, 139.9821, 177.4345, 145.41211);
        ((GeneralPath) shape).curveTo(176.18509, 150.84201, 169.3402, 153.90372, 162.1492, 152.24911);
        ((GeneralPath) shape).curveTo(154.9582, 150.59451, 150.1397, 144.84912, 151.3891, 139.41911);
        ((GeneralPath) shape).curveTo(152.1194, 136.2456, 154.7616, 133.88152, 158.2666, 132.79462);
        ((GeneralPath) shape).lineTo(154.7413, 127.16222);
        ((GeneralPath) shape).curveTo(149.7575, 128.48152, 143.8112, 128.58742, 137.6947, 127.180016);
        ((GeneralPath) shape).curveTo(123.3127, 123.87082, 113.429306, 113.45122, 115.6243, 103.91212);
        ((GeneralPath) shape).curveTo(117.8192, 94.37302, 131.2625, 89.320816, 145.6445, 92.63002);
        ((GeneralPath) shape).curveTo(151.761, 94.03742, 157.063, 96.73142, 160.9691, 100.09622);
        ((GeneralPath) shape).lineTo(166.6017, 96.57082);
        ((GeneralPath) shape).curveTo(163.9241, 94.061424, 162.5808, 90.78023, 163.311, 87.60662);
        ((GeneralPath) shape).curveTo(164.56041, 82.17672, 171.4053, 79.11502, 178.5963, 80.76962);
        ((GeneralPath) shape).curveTo(185.7873, 82.424225, 190.6058, 88.169624, 189.3564, 93.599625);
        ((GeneralPath) shape).curveTo(188.107, 99.029526, 181.262, 102.091225, 174.071, 100.43652);
        ((GeneralPath) shape).curveTo(172.9401, 100.17632, 171.868, 99.814926, 170.8688, 99.36942);
        ((GeneralPath) shape).lineTo(164.2641, 103.50333);
        ((GeneralPath) shape).curveTo(167.3142, 107.35403, 168.6785, 111.710724, 167.715, 115.898026);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB214C));
        g.fill(shape);

        // _0_0_0_1_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(184.333, 146.999);
        ((GeneralPath) shape).curveTo(183.72589, 149.63849, 182.0573, 151.5085, 180.6068, 151.1745);
        ((GeneralPath) shape).curveTo(179.1566, 150.8409, 178.47319, 148.4299, 179.0801, 145.7901);
        ((GeneralPath) shape).curveTo(179.6875, 143.1508, 181.3563, 141.28079, 182.80629, 141.6148);
        ((GeneralPath) shape).curveTo(184.25679, 141.9483, 184.94049, 144.35931, 184.333, 146.99901);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(184.9563, 147.1424);
        ((GeneralPath) shape).curveTo(184.3491, 149.7815, 182.6804, 151.6517, 181.2301, 151.3179);
        ((GeneralPath) shape).curveTo(179.7794, 150.9842, 179.0961, 148.5729, 179.7034, 145.9337);
        ((GeneralPath) shape).curveTo(180.3105, 143.294, 181.9791, 141.4241, 183.4297, 141.7581);
        ((GeneralPath) shape).curveTo(184.8797, 142.0917, 185.5634, 144.50261, 184.9563, 147.1424);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(179.0070037841797, 145.7740020751953), new Point2D.Double(185.0290069580078, 147.15899658203125), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(195.398, 149.545);
        ((GeneralPath) shape).curveTo(194.56279, 153.1743, 192.2688, 155.7457, 190.2739, 155.2868);
        ((GeneralPath) shape).curveTo(188.27989, 154.82791, 187.3403, 151.5126, 188.17549, 147.88321);
        ((GeneralPath) shape).curveTo(189.01028, 144.25452, 191.30469, 141.6829, 193.299, 142.14171);
        ((GeneralPath) shape).curveTo(195.2932, 142.6006, 196.2328, 145.9158, 195.398, 149.54501);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(196.2546, 149.7423);
        ((GeneralPath) shape).curveTo(195.41959, 153.3716, 193.1249, 155.94269, 191.13129, 155.4841);
        ((GeneralPath) shape).curveTo(189.13708, 155.025, 188.19708, 151.7096, 189.03198, 148.0804);
        ((GeneralPath) shape).curveTo(189.86728, 144.4512, 192.16168, 141.8797, 194.15558, 142.3387);
        ((GeneralPath) shape).curveTo(196.14958, 142.7979, 197.08968, 146.1129, 196.25458, 149.7423);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(188.0749969482422, 147.86000061035156), new Point2D.Double(196.35499572753906, 149.76499938964844), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(208.666, 152.598);
        ((GeneralPath) shape).curveTo(207.6031, 157.2171, 204.6829, 160.48921, 202.145, 159.90501);
        ((GeneralPath) shape).curveTo(199.60721, 159.32141, 198.41101, 155.10132, 199.4743, 150.48262);
        ((GeneralPath) shape).curveTo(200.5366, 145.86311, 203.45691, 142.59113, 205.9946, 143.17513);
        ((GeneralPath) shape).curveTo(208.5329, 143.75902, 209.72859, 147.97842, 208.666, 152.59802);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(209.7563, 152.8484);
        ((GeneralPath) shape).curveTo(208.694, 157.4678, 205.7735, 160.7401, 203.23581, 160.156);
        ((GeneralPath) shape).curveTo(200.69751, 159.57211, 199.50131, 155.35251, 200.56401, 150.7334);
        ((GeneralPath) shape).curveTo(201.6271, 146.1142, 204.54721, 142.8419, 207.085, 143.4261);
        ((GeneralPath) shape).curveTo(209.62341, 144.01021, 210.8193, 148.22931, 209.7563, 152.8484);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(199.3459930419922, 150.4530029296875), new Point2D.Double(209.88400268554688, 152.8780059814453), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(223.781, 156.076);
        ((GeneralPath) shape).curveTo(222.53151, 161.5057, 219.0991, 165.3527, 216.1149, 164.6663);
        ((GeneralPath) shape).curveTo(213.13159, 163.9797, 211.7255, 159.01921, 212.975, 153.58981);
        ((GeneralPath) shape).curveTo(214.22441, 148.15971, 217.6569, 144.31291, 220.64061, 144.99911);
        ((GeneralPath) shape).curveTo(223.62392, 145.68591, 225.03021, 150.64551, 223.781, 156.07602);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(225.06311, 156.3708);
        ((GeneralPath) shape).curveTo(223.81342, 161.8011, 220.3807, 165.6477, 217.39722, 164.961);
        ((GeneralPath) shape).curveTo(214.41371, 164.27429, 213.00722, 159.31439, 214.25691, 153.88449);
        ((GeneralPath) shape).curveTo(215.50601, 148.4547, 218.93921, 144.60759, 221.9226, 145.2943);
        ((GeneralPath) shape).curveTo(224.90631, 145.98059, 226.3123, 150.941, 225.06311, 156.37079);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(212.8249969482422, 153.55499267578125), new Point2D.Double(225.21400451660156, 156.406005859375), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(196.255, 95.1865);
        ((GeneralPath) shape).curveTo(195.6477, 97.826004, 193.9788, 99.6961, 192.5289, 99.362);
        ((GeneralPath) shape).curveTo(191.0783, 99.028496, 190.395, 96.6174, 191.0023, 93.9779);
        ((GeneralPath) shape).curveTo(191.6095, 91.3385, 193.278, 89.4686, 194.7281, 89.8025);
        ((GeneralPath) shape).curveTo(196.1785, 90.1356, 196.8624, 92.5471, 196.255, 95.1865);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(196.8782, 95.3298);
        ((GeneralPath) shape).curveTo(196.2707, 97.969505, 194.602, 99.8392, 193.15201, 99.5055);
        ((GeneralPath) shape).curveTo(191.70161, 99.1717, 191.01811, 96.760704, 191.6253, 94.1215);
        ((GeneralPath) shape).curveTo(192.23271, 91.4818, 193.9015, 89.611694, 195.35161, 89.9457);
        ((GeneralPath) shape).curveTo(196.80151, 90.2796, 197.4855, 92.6905, 196.8782, 95.3298);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(190.9290008544922, 93.96099853515625), new Point2D.Double(196.9510040283203, 95.3468017578125), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(207.32, 97.7324);
        ((GeneralPath) shape).curveTo(206.4848, 101.3618, 204.1902, 103.9326, 202.19621, 103.474396);
        ((GeneralPath) shape).curveTo(200.20232, 103.0152, 199.26231, 99.6999, 200.09741, 96.0702);
        ((GeneralPath) shape).curveTo(200.93231, 92.440895, 203.22691, 89.8701, 205.2205, 90.3287);
        ((GeneralPath) shape).curveTo(207.2148, 90.78809, 208.15541, 94.1029, 207.32, 97.7324);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(208.1768, 97.9292);
        ((GeneralPath) shape).curveTo(207.3417, 101.5586, 205.04721, 104.1299, 203.0527, 103.6708);
        ((GeneralPath) shape).curveTo(201.0587, 103.2126, 200.1186, 99.897, 200.9541, 96.268);
        ((GeneralPath) shape).curveTo(201.78911, 92.6384, 204.0836, 90.0674, 206.0778, 90.5261);
        ((GeneralPath) shape).curveTo(208.0717, 90.9851, 209.0114, 94.3003, 208.1768, 97.9292);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(199.99600219726562, 96.04740142822266), new Point2D.Double(208.27699279785156, 97.95279693603516), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(220.588, 100.785);
        ((GeneralPath) shape).curveTo(219.5251, 105.4047, 216.605, 108.67641, 214.0671, 108.093);
        ((GeneralPath) shape).curveTo(211.5293, 107.508705, 210.3328, 103.289, 211.39569, 98.67);
        ((GeneralPath) shape).curveTo(212.45879, 94.0512, 215.37889, 90.7788, 217.9164, 91.363);
        ((GeneralPath) shape).curveTo(220.4545, 91.9469, 221.6509, 96.1662, 220.588, 100.784996);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(221.67819, 101.0363);
        ((GeneralPath) shape).curveTo(220.61519, 105.6554, 217.6955, 108.9279, 215.15768, 108.3434);
        ((GeneralPath) shape).curveTo(212.61938, 107.7596, 211.42358, 103.5401, 212.48598, 98.921);
        ((GeneralPath) shape).curveTo(213.54868, 94.3021, 216.46887, 91.0299, 219.00677, 91.613594);
        ((GeneralPath) shape).curveTo(221.54507, 92.197395, 222.74098, 96.4173, 221.67818, 101.03629);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(211.26699829101562, 98.6406021118164), new Point2D.Double(221.80599975585938, 101.06600189208984), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(235.703, 104.263);
        ((GeneralPath) shape).curveTo(234.4534, 109.6928, 231.0209, 113.5398, 228.03731, 112.8531);
        ((GeneralPath) shape).curveTo(225.0534, 112.1668, 223.6475, 107.2068, 224.8966, 101.776306);
        ((GeneralPath) shape).curveTo(226.1461, 96.34681, 229.5789, 92.49981, 232.5621, 93.18661);
        ((GeneralPath) shape).curveTo(235.5457, 93.87301, 236.9521, 98.833405, 235.703, 104.26301);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(236.9846, 104.5576);
        ((GeneralPath) shape).curveTo(235.7352, 109.9876, 232.3022, 113.8346, 229.3188, 113.1481);
        ((GeneralPath) shape).curveTo(226.3352, 112.4614, 224.9292, 107.501, 226.17911, 102.0718);
        ((GeneralPath) shape).curveTo(227.4282, 96.6418, 230.86081, 92.7954, 233.84381, 93.4811);
        ((GeneralPath) shape).curveTo(236.8276, 94.1681, 238.23412, 99.1283, 236.9846, 104.5576);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(224.7469940185547, 101.74199676513672), new Point2D.Double(237.13499450683594, 104.59300231933594), new float[]{0, 1}, new Color[]{new Color(0xDA251D), new Color(0xFFF500)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_1_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(149.744, 94.4528);
        ((GeneralPath) shape).curveTo(148.3471, 93.9626, 146.9281, 93.5541, 145.50731, 93.2271);
        ((GeneralPath) shape).curveTo(139.7474, 91.901794, 133.37561, 91.785194, 127.69171, 93.5439);
        ((GeneralPath) shape).curveTo(127.48461, 93.608, 127.27761, 93.6751, 127.07081, 93.7451);
        ((GeneralPath) shape).curveTo(126.86641, 94.8289, 126.84431, 95.9338, 127.00421, 97.0257);
        ((GeneralPath) shape).curveTo(130.2606, 98.535904, 133.89021, 99.4447, 137.43831, 99.8839);
        ((GeneralPath) shape).curveTo(141.3596, 100.3693, 145.4862, 100.3181, 149.3753, 99.5502);
        ((GeneralPath) shape).curveTo(149.4899, 99.218, 149.587, 98.8799, 149.6658, 98.5374);
        ((GeneralPath) shape).curveTo(149.9768, 97.1859, 149.9997, 95.8032, 149.744, 94.4528);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAAA9A9));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.597503f, 0.137483f, -0.137483f, 0.597503f, 113.412f, 103.403f));

        // _0_0_0_1_10
        shape = new Ellipse2D.Double(-1.784999966621399, -4.760000228881836, 3.569999933242798, 9.520000457763672);
        g.setPaint(new Color(0xF7C5B4));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_10
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.43934f, 0.10109f, -0.10109f, 0.43934f, 108.679f, 102.314f));

        // _0_0_0_1_11
        shape = new Ellipse2D.Double(-1.784999966621399, -4.760000228881836, 3.569999933242798, 9.520000457763672);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_11
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.251052f, 0.0577659f, -0.0577659f, 0.251052f, 104.564f, 101.367f));

        // _0_0_0_1_12
        shape = new Ellipse2D.Double(-1.784999966621399, -4.760000228881836, 3.569999933242798, 9.520000457763672);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_12

        // _0_0_0_1_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(115.954, 102.97);
        ((GeneralPath) shape).curveTo(116.490906, 103.064804, 116.8201, 103.627, 116.6978, 104.1584);
        ((GeneralPath) shape).lineTo(116.6978, 104.1584);
        ((GeneralPath) shape).curveTo(116.5755, 104.689705, 116.0337, 105.051605, 115.5094, 104.9022);
        ((GeneralPath) shape).lineTo(114.2179, 104.534096);
        ((GeneralPath) shape).curveTo(114.31821, 104.2597, 114.4067, 103.962, 114.479004, 103.6478);
        ((GeneralPath) shape).curveTo(114.5512, 103.33379, 114.60181, 103.0272, 114.6315, 102.736496);
        ((GeneralPath) shape).lineTo(115.954, 102.96999);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(113.243805, 104.2566);
        ((GeneralPath) shape).lineTo(109.278206, 103.1265);
        ((GeneralPath) shape).curveTo(109.349106, 102.93, 109.4119, 102.71751, 109.46341, 102.493805);
        ((GeneralPath) shape).curveTo(109.51491, 102.2701, 109.55131, 102.05141, 109.57341, 101.843704);
        ((GeneralPath) shape).lineTo(113.63421, 102.5605);
        ((GeneralPath) shape).curveTo(113.603806, 102.8356, 113.55511, 103.1243, 113.48711, 103.4196);
        ((GeneralPath) shape).curveTo(113.419205, 103.715004, 113.33681, 103.9959, 113.243805, 104.2566);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(108.562904, 102.9227);
        ((GeneralPath) shape).lineTo(104.890205, 101.8761);
        ((GeneralPath) shape).curveTo(104.93761, 101.7516, 104.9791, 101.6148, 105.012505, 101.4696);
        ((GeneralPath) shape).curveTo(105.045906, 101.3246, 105.068405, 101.1833, 105.08021, 101.0506);
        ((GeneralPath) shape).lineTo(108.840904, 101.7144);
        ((GeneralPath) shape).curveTo(108.818504, 101.9106, 108.7834, 102.1162, 108.73511, 102.3262);
        ((GeneralPath) shape).curveTo(108.68671, 102.5363, 108.62851, 102.736404, 108.562904, 102.9227);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(104.51311, 101.7686);
        ((GeneralPath) shape).lineTo(96.96901, 99.6188);
        ((GeneralPath) shape).lineTo(96.96901, 99.6188);
        ((GeneralPath) shape).lineTo(104.69411, 100.9825);
        ((GeneralPath) shape).curveTo(104.68181, 101.1092, 104.659904, 101.2435, 104.628204, 101.381195);
        ((GeneralPath) shape).curveTo(104.596504, 101.519, 104.5575, 101.64919, 104.51311, 101.76859);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE3556A));
        g.fill(shape);

        // _0_0_0_1_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(128.434, 93.3262);
        ((GeneralPath) shape).curveTo(128.18541, 93.3954, 127.937706, 93.467804, 127.691605, 93.5439);
        ((GeneralPath) shape).curveTo(127.484505, 93.608, 127.277504, 93.6751, 127.0707, 93.7451);
        ((GeneralPath) shape).curveTo(126.8663, 94.8289, 126.8442, 95.9338, 127.004105, 97.0257);
        ((GeneralPath) shape).curveTo(128.66391, 97.7955, 130.4208, 98.408806, 132.21431, 98.88351);
        ((GeneralPath) shape).lineTo(131.47401, 97.64521);
        ((GeneralPath) shape).lineTo(132.12552, 96.32451);
        ((GeneralPath) shape).lineTo(130.37653, 94.745605);
        ((GeneralPath) shape).lineTo(128.43402, 93.3262);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xC2C1C1));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.597503f, 0.137483f, -0.137483f, 0.597503f, 128.438f, 94.2195f));

        // _0_0_0_1_15
        shape = new Ellipse2D.Double(-0.42500001192092896, -0.3824999928474426, 0.8500000238418579, 0.7649999856948853);
        g.setPaint(new Color(0x0093DD));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_15
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.883886f, 0.203378f, -0.203378f, 0.883886f, 128.886f, 96.0642f));

        // _0_0_0_1_16
        shape = new Ellipse2D.Double(-1.5724999904632568, -1.2962000370025635, 3.1449999809265137, 2.592400074005127);
        g.setPaint(new Color(0x84C225));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_16

        // _0_0_0_1_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(129.154, 94.8957);
        ((GeneralPath) shape).curveTo(129.54301, 94.9852, 129.8657, 95.1967, 130.07271, 95.465996);
        ((GeneralPath) shape).curveTo(130.2807, 95.736595, 130.37221, 96.065895, 130.2978, 96.3892);
        ((GeneralPath) shape).curveTo(130.2234, 96.7125, 129.99721, 96.9687, 129.69191, 97.1213);
        ((GeneralPath) shape).curveTo(129.38802, 97.2731, 129.0052, 97.3222, 128.61621, 97.2327);
        ((GeneralPath) shape).curveTo(128.22731, 97.143196, 127.90451, 96.931694, 127.69751, 96.6624);
        ((GeneralPath) shape).curveTo(127.48951, 96.3917, 127.39811, 96.0624, 127.47241, 95.7391);
        ((GeneralPath) shape).curveTo(127.546814, 95.415794, 127.77311, 95.1596, 128.07841, 95.007195);
        ((GeneralPath) shape).curveTo(128.38231, 94.85539, 128.76501, 94.8062, 129.15402, 94.89569);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(130.0359, 95.4944);
        ((GeneralPath) shape).curveTo(129.8353, 95.2334, 129.5218, 95.0283, 129.14351, 94.9413);
        ((GeneralPath) shape).curveTo(128.76521, 94.8542, 128.39362, 94.9017, 128.0991, 95.0488);
        ((GeneralPath) shape).curveTo(127.80601, 95.1951, 127.5891, 95.4404, 127.518005, 95.749596);
        ((GeneralPath) shape).curveTo(127.44681, 96.05879, 127.534706, 96.3743, 127.734406, 96.633995);
        ((GeneralPath) shape).curveTo(127.935005, 96.895, 128.24841, 97.1002, 128.62671, 97.187195);
        ((GeneralPath) shape).curveTo(129.00511, 97.27429, 129.3766, 97.22679, 129.67111, 97.0797);
        ((GeneralPath) shape).curveTo(129.96422, 96.9333, 130.1811, 96.687996, 130.25232, 96.3788);
        ((GeneralPath) shape).curveTo(130.32343, 96.0696, 130.23552, 95.7541, 130.03592, 95.4944);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00923F));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.597503f, 0.137483f, -0.137483f, 0.597503f, 131.118f, 96.6942f));

        // _0_0_0_1_18
        shape = new Ellipse2D.Double(-0.5311999917030334, -0.6161999702453613, 1.062399983406067, 1.2323999404907227);
        g.setPaint(new Color(0xFFF500));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_18
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.597503f, 0.137483f, -0.137483f, 0.597503f, 130.614f, 97.7815f));

        // _0_0_0_1_19
        shape = new Ellipse2D.Double(-0.5950000286102295, -0.5311999917030334, 1.190000057220459, 1.062399983406067);
        g.setPaint(new Color(0x974578));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_19

        // _0_0_0_1_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(127.84, 96.6914);
        ((GeneralPath) shape).lineTo(127.9581, 96.6174);
        ((GeneralPath) shape).curveTo(127.940796, 96.5979, 127.9244, 96.5777, 127.9087, 96.557304);
        ((GeneralPath) shape).curveTo(127.7424, 96.340904, 127.6667, 96.078705, 127.7185, 95.8196);
        ((GeneralPath) shape).lineTo(127.5598, 95.783104);
        ((GeneralPath) shape).lineTo(127.5703, 95.7376);
        ((GeneralPath) shape).lineTo(127.729, 95.7741);
        ((GeneralPath) shape).curveTo(127.795395, 95.5183, 127.978195, 95.3156, 128.2225, 95.1936);
        ((GeneralPath) shape).curveTo(128.2455, 95.182106, 128.2691, 95.1713, 128.2932, 95.1613);
        ((GeneralPath) shape).lineTo(128.2192, 95.043);
        ((GeneralPath) shape).lineTo(128.2587, 95.0183);
        ((GeneralPath) shape).lineTo(128.3373, 95.14381);
        ((GeneralPath) shape).curveTo(128.5593, 95.06151, 128.8197, 95.04021, 129.0846, 95.09671);
        ((GeneralPath) shape).lineTo(129.1137, 94.97011);
        ((GeneralPath) shape).lineTo(129.1592, 94.98051);
        ((GeneralPath) shape).lineTo(129.1301, 95.10721);
        ((GeneralPath) shape).curveTo(129.39299, 95.17211, 129.61769, 95.30521, 129.7814, 95.47631);
        ((GeneralPath) shape).lineTo(129.9069, 95.39771);
        ((GeneralPath) shape).lineTo(129.9317, 95.43721);
        ((GeneralPath) shape).lineTo(129.8135, 95.51121);
        ((GeneralPath) shape).curveTo(129.83081, 95.53071, 129.84741, 95.550705, 129.86311, 95.571106);
        ((GeneralPath) shape).curveTo(130.02951, 95.787605, 130.10541, 96.049805, 130.05331, 96.30891);
        ((GeneralPath) shape).lineTo(130.21202, 96.345406);
        ((GeneralPath) shape).lineTo(130.20152, 96.39091);
        ((GeneralPath) shape).lineTo(130.04282, 96.35441);
        ((GeneralPath) shape).curveTo(129.97621, 96.61011, 129.79352, 96.812805, 129.54932, 96.93481);
        ((GeneralPath) shape).curveTo(129.52632, 96.946304, 129.50252, 96.95701, 129.47841, 96.96701);
        ((GeneralPath) shape).lineTo(129.55241, 97.08511);
        ((GeneralPath) shape).lineTo(129.51282, 97.10992);
        ((GeneralPath) shape).lineTo(129.43431, 96.984314);
        ((GeneralPath) shape).curveTo(129.21242, 97.06671, 128.95212, 97.08811, 128.68732, 97.03162);
        ((GeneralPath) shape).lineTo(128.65822, 97.15822);
        ((GeneralPath) shape).lineTo(128.61263, 97.14772);
        ((GeneralPath) shape).lineTo(128.64183, 97.02112);
        ((GeneralPath) shape).curveTo(128.37894, 96.956215, 128.15393, 96.82342, 127.99023, 96.65242);
        ((GeneralPath) shape).lineTo(127.86472, 96.73092);
        ((GeneralPath) shape).lineTo(127.84003, 96.69142);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(127.99809, 96.5924);
        ((GeneralPath) shape).lineTo(128.3071, 96.399);
        ((GeneralPath) shape).curveTo(128.19, 96.2623, 128.1335, 96.0915, 128.1644, 95.9222);
        ((GeneralPath) shape).lineTo(127.7641, 95.8301);
        ((GeneralPath) shape).curveTo(127.7154, 96.0751, 127.7876, 96.3234, 127.9456, 96.5289);
        ((GeneralPath) shape).curveTo(127.962204, 96.5506, 127.9796, 96.5718, 127.9981, 96.5924);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.347, 96.374);
        ((GeneralPath) shape).lineTo(128.7047, 96.1502);
        ((GeneralPath) shape).curveTo(128.68129, 96.117, 128.6695, 96.0783, 128.6724, 96.0391);
        ((GeneralPath) shape).lineTo(128.2099, 95.9327);
        ((GeneralPath) shape).curveTo(128.1821, 96.0893, 128.2362, 96.2475, 128.347, 96.374);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.7442, 96.1255);
        ((GeneralPath) shape).lineTo(128.8258, 96.0744);
        ((GeneralPath) shape).lineTo(128.7187, 96.049805);
        ((GeneralPath) shape).curveTo(128.7185, 96.0763, 128.7276, 96.10271, 128.7442, 96.1255);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.9213, 96.0146);
        ((GeneralPath) shape).lineTo(128.99379, 95.9692);
        ((GeneralPath) shape).curveTo(128.97789, 95.9569, 128.9594, 95.9465, 128.93858, 95.9392);
        ((GeneralPath) shape).lineTo(128.92128, 96.0146);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.0353, 95.9432);
        ((GeneralPath) shape).lineTo(129.39209, 95.7199);
        ((GeneralPath) shape).curveTo(129.30049, 95.6287, 129.1778, 95.557205, 129.0351, 95.5202);
        ((GeneralPath) shape).lineTo(128.9491, 95.8936);
        ((GeneralPath) shape).curveTo(128.98239, 95.9045, 129.0116, 95.9219, 129.0353, 95.9432);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.43259, 95.694595);
        ((GeneralPath) shape).lineTo(129.74098, 95.501595);
        ((GeneralPath) shape).curveTo(129.58398, 95.340294, 129.36989, 95.21459, 129.11958, 95.152695);
        ((GeneralPath) shape).lineTo(129.04549, 95.47469);
        ((GeneralPath) shape).curveTo(129.20099, 95.51479, 129.33398, 95.59359, 129.43259, 95.694595);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.77348, 95.536194);
        ((GeneralPath) shape).lineTo(129.46458, 95.72959);
        ((GeneralPath) shape).curveTo(129.58159, 95.866295, 129.63849, 96.036995, 129.60739, 96.20629);
        ((GeneralPath) shape).lineTo(130.0078, 96.29839);
        ((GeneralPath) shape).curveTo(130.0566, 96.05349, 129.98419, 95.80509, 129.8263, 95.599495);
        ((GeneralPath) shape).curveTo(129.8097, 95.577896, 129.79199, 95.55679, 129.7735, 95.536194);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.42468, 95.75459);
        ((GeneralPath) shape).lineTo(129.06699, 95.97849);
        ((GeneralPath) shape).curveTo(129.0904, 96.011696, 129.10239, 96.050095, 129.09938, 96.08939);
        ((GeneralPath) shape).lineTo(129.56187, 96.19579);
        ((GeneralPath) shape).curveTo(129.58977, 96.03909, 129.53537, 95.881096, 129.42467, 95.75459);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.02728, 96.00319);
        ((GeneralPath) shape).lineTo(128.94608, 96.05409);
        ((GeneralPath) shape).lineTo(129.05307, 96.07879);
        ((GeneralPath) shape).curveTo(129.05347, 96.052086, 129.04398, 96.02609, 129.02727, 96.00319);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.85048, 96.11389);
        ((GeneralPath) shape).lineTo(128.77768, 96.15949);
        ((GeneralPath) shape).curveTo(128.79378, 96.17159, 128.81258, 96.181595, 128.83328, 96.188896);
        ((GeneralPath) shape).lineTo(128.85048, 96.1139);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.73618, 96.18549);
        ((GeneralPath) shape).lineTo(128.37947, 96.40879);
        ((GeneralPath) shape).curveTo(128.47118, 96.49999, 128.59407, 96.57109, 128.73677, 96.60809);
        ((GeneralPath) shape).lineTo(128.82268, 96.2346);
        ((GeneralPath) shape).curveTo(128.78947, 96.223595, 128.75998, 96.206696, 128.73618, 96.18549);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.33897, 96.4341);
        ((GeneralPath) shape).lineTo(128.03047, 96.6272);
        ((GeneralPath) shape).curveTo(128.18738, 96.7884, 128.40187, 96.9137, 128.65218, 96.97559);
        ((GeneralPath) shape).lineTo(128.72627, 96.653595);
        ((GeneralPath) shape).curveTo(128.57097, 96.613594, 128.43758, 96.5349, 128.33897, 96.4341);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.36247, 95.1841);
        ((GeneralPath) shape).lineTo(128.55547, 95.49239);
        ((GeneralPath) shape).curveTo(128.68826, 95.444695, 128.84286, 95.4323, 128.99997, 95.464195);
        ((GeneralPath) shape).lineTo(129.07407, 95.1422);
        ((GeneralPath) shape).curveTo(128.82176, 95.08849, 128.57417, 95.1076, 128.36247, 95.1841);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.99727, 96.343994);
        ((GeneralPath) shape).lineTo(129.59697, 96.25179);
        ((GeneralPath) shape).curveTo(129.55397, 96.40609, 129.44228, 96.528496, 129.29398, 96.60259);
        ((GeneralPath) shape).curveTo(129.28297, 96.60809, 129.27158, 96.61319, 129.26007, 96.618195);
        ((GeneralPath) shape).lineTo(129.45337, 96.926994);
        ((GeneralPath) shape).curveTo(129.47897, 96.916595, 129.50417, 96.905396, 129.52856, 96.893196);
        ((GeneralPath) shape).curveTo(129.76047, 96.7773, 129.93396, 96.585594, 129.99727, 96.343994);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.40897, 96.94409);
        ((GeneralPath) shape).lineTo(129.21597, 96.63559);
        ((GeneralPath) shape).curveTo(129.08327, 96.68329, 128.92917, 96.69599, 128.77187, 96.66409);
        ((GeneralPath) shape).lineTo(128.69777, 96.98609);
        ((GeneralPath) shape).curveTo(128.94997, 97.03969, 129.19746, 97.02049, 129.40897, 96.94409);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(127.77447, 95.78459);
        ((GeneralPath) shape).lineTo(128.17487, 95.87669);
        ((GeneralPath) shape).curveTo(128.21767, 95.72229, 128.32936, 95.59989, 128.47777, 95.525795);
        ((GeneralPath) shape).curveTo(128.48877, 95.520294, 128.49997, 95.51499, 128.51147, 95.509995);
        ((GeneralPath) shape).lineTo(128.31818, 95.201294);
        ((GeneralPath) shape).curveTo(128.29268, 95.21179, 128.26758, 95.22309, 128.24318, 95.23519);
        ((GeneralPath) shape).curveTo(128.01128, 95.35109, 127.83768, 95.54289, 127.77448, 95.78459);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(129.08887, 96.134895);
        ((GeneralPath) shape).curveTo(129.07426, 96.171394, 129.04666, 96.2008, 129.01117, 96.2204);
        ((GeneralPath) shape).lineTo(129.23508, 96.5783);
        ((GeneralPath) shape).curveTo(129.24808, 96.5728, 129.26088, 96.5671, 129.27327, 96.5609);
        ((GeneralPath) shape).curveTo(129.40916, 96.493095, 129.51167, 96.3815, 129.55138, 96.241394);
        ((GeneralPath) shape).lineTo(129.08888, 96.134895);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.96736, 96.238495);
        ((GeneralPath) shape).curveTo(128.93686, 96.24719, 128.90286, 96.249695, 128.86826, 96.244995);
        ((GeneralPath) shape).lineTo(128.78226, 96.61849);
        ((GeneralPath) shape).curveTo(128.92686, 96.64759, 129.06836, 96.63719, 129.19066, 96.59519);
        ((GeneralPath) shape).lineTo(128.96736, 96.238495);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.68286, 95.99359);
        ((GeneralPath) shape).curveTo(128.69727, 95.956894, 128.72507, 95.92759, 128.76056, 95.90799);
        ((GeneralPath) shape).lineTo(128.53636, 95.54989);
        ((GeneralPath) shape).curveTo(128.52347, 95.55529, 128.51086, 95.56119, 128.49846, 95.56739);
        ((GeneralPath) shape).curveTo(128.36246, 95.63549, 128.26006, 95.74689, 128.22035, 95.88719);
        ((GeneralPath) shape).lineTo(128.68285, 95.99359);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.80417, 95.88979);
        ((GeneralPath) shape).curveTo(128.83476, 95.881, 128.86887, 95.878395, 128.90356, 95.883095);
        ((GeneralPath) shape).lineTo(128.98947, 95.5097);
        ((GeneralPath) shape).curveTo(128.84497, 95.4806, 128.70328, 95.491, 128.58087, 95.5329);
        ((GeneralPath) shape).lineTo(128.80417, 95.8898);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.83017, 95.93129);
        ((GeneralPath) shape).lineTo(128.87576, 96.00409);
        ((GeneralPath) shape).lineTo(128.89307, 95.92879);
        ((GeneralPath) shape).curveTo(128.87126, 95.92609, 128.85007, 95.927185, 128.83017, 95.93129);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.93556, 96.09969);
        ((GeneralPath) shape).lineTo(128.98647, 96.18089);
        ((GeneralPath) shape).curveTo(129.01126, 96.167694, 129.03116, 96.14819, 129.04257, 96.12429);
        ((GeneralPath) shape).lineTo(128.93558, 96.09969);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.94127, 96.19679);
        ((GeneralPath) shape).lineTo(128.89597, 96.12439);
        ((GeneralPath) shape).lineTo(128.87877, 96.19929);
        ((GeneralPath) shape).curveTo(128.90047, 96.20179, 128.92166, 96.20079, 128.94127, 96.196785);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(128.83617, 96.02889);
        ((GeneralPath) shape).lineTo(128.78526, 95.947395);
        ((GeneralPath) shape).curveTo(128.76036, 95.96069, 128.74057, 95.980095, 128.72916, 96.004196);
        ((GeneralPath) shape).lineTo(128.83615, 96.02889);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x00923F));
        g.fill(shape);

        // _0_0_0_1_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(147.069, 90.1238);
        ((GeneralPath) shape).lineTo(147.069, 90.124);
        ((GeneralPath) shape).curveTo(147.5558, 90.3249, 147.7896, 90.8873, 147.5888, 91.3741);
        ((GeneralPath) shape).lineTo(144.7155, 98.337);
        ((GeneralPath) shape).lineTo(143.959, 100.1701);
        ((GeneralPath) shape).curveTo(143.2657, 100.196495, 142.5713, 100.203896, 141.8782, 100.1934);
        ((GeneralPath) shape).lineTo(142.84511, 97.8501);
        ((GeneralPath) shape).lineTo(145.8188, 90.6437);
        ((GeneralPath) shape).curveTo(146.0196, 90.1569, 146.5823, 89.9232, 147.069, 90.1238);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFFCC8));
        g.fill(shape);

        // _0_0_0_1_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(133.466, 93.3243);
        ((GeneralPath) shape).curveTo(133.974, 93.939804, 135.7151, 94.6107, 135.0794, 95.0929);
        ((GeneralPath) shape).curveTo(134.1452, 95.801605, 132.36101, 93.88451, 131.57741, 94.757);
        ((GeneralPath) shape).curveTo(131.53531, 94.8039, 131.5075, 94.8495, 131.49141, 94.8943);
        ((GeneralPath) shape).curveTo(131.266, 95.5215, 133.43842, 95.958305, 133.51071, 96.8393);
        ((GeneralPath) shape).curveTo(133.56412, 97.4907, 132.78441, 98.2533, 132.24712, 98.8923);
        ((GeneralPath) shape).curveTo(133.96172, 99.34431, 135.70932, 99.66991, 137.43782, 99.8839);
        ((GeneralPath) shape).curveTo(138.88982, 100.06361, 140.36983, 100.1696, 141.85562, 100.193);
        ((GeneralPath) shape).curveTo(141.93622, 99.539604, 140.98032, 98.254, 141.10852, 97.436104);
        ((GeneralPath) shape).curveTo(141.11043, 97.423706, 141.11302, 97.411705, 141.11632, 97.4001);
        ((GeneralPath) shape).curveTo(141.22601, 97.0188, 142.06702, 97.0781, 142.13242, 96.6695);
        ((GeneralPath) shape).curveTo(142.21771, 96.1367, 141.32272, 95.7135, 141.46721, 95.1936);
        ((GeneralPath) shape).curveTo(141.58852, 94.7574, 142.56091, 95.0558, 142.70091, 94.625206);
        ((GeneralPath) shape).curveTo(142.80931, 94.29201, 141.73462, 94.3298, 141.85521, 94.00091);
        ((GeneralPath) shape).curveTo(142.18451, 93.10271, 143.22331, 92.63881, 143.72742, 91.82571);
        ((GeneralPath) shape).curveTo(144.23541, 91.00631, 144.86372, 90.126205, 144.85512, 89.16211);
        ((GeneralPath) shape).curveTo(144.85172, 88.77741, 144.00842, 89.018906, 143.70451, 89.25471);
        ((GeneralPath) shape).curveTo(142.83182, 89.932106, 142.59741, 91.49541, 141.52211, 91.74921);
        ((GeneralPath) shape).curveTo(140.78542, 91.923004, 142.17401, 90.351204, 142.25002, 89.59811);
        ((GeneralPath) shape).curveTo(142.30562, 89.04641, 142.22032, 88.4259, 141.90321, 87.97121);
        ((GeneralPath) shape).curveTo(141.74852, 87.749306, 141.31142, 87.77961, 141.09232, 87.93821);
        ((GeneralPath) shape).curveTo(140.78482, 88.16071, 140.69522, 88.58991, 140.55872, 88.94411);
        ((GeneralPath) shape).curveTo(140.32272, 89.55671, 139.94872, 90.17081, 139.97931, 90.826706);
        ((GeneralPath) shape).curveTo(140.00171, 91.30781, 140.7463, 91.5967, 140.7048, 92.07661);
        ((GeneralPath) shape).curveTo(140.6566, 92.633804, 140.2052, 93.12981, 139.7521, 93.4576);
        ((GeneralPath) shape).curveTo(139.5068, 93.635, 139.0729, 93.620804, 138.84451, 93.4222);
        ((GeneralPath) shape).curveTo(138.59862, 93.208405, 138.9394, 92.5223, 138.6177, 92.471504);
        ((GeneralPath) shape).curveTo(138.0233, 92.37781, 137.5243, 93.233604, 136.9331, 93.121);
        ((GeneralPath) shape).curveTo(136.61351, 93.060104, 137.082, 92.4484, 137.3173, 92.2238);
        ((GeneralPath) shape).curveTo(137.5155, 92.0346, 137.9982, 92.2505, 138.1083, 91.999504);
        ((GeneralPath) shape).curveTo(138.4393, 91.2443, 138.4597, 90.379105, 138.4873, 89.55501);
        ((GeneralPath) shape).curveTo(138.5076, 88.948906, 138.5988, 88.247406, 138.2503, 87.75111);
        ((GeneralPath) shape).curveTo(138.0016, 87.396904, 137.4162, 87.33691, 136.9928, 87.4268);
        ((GeneralPath) shape).curveTo(136.7039, 87.488205, 136.562, 87.8563, 136.45619, 88.1322);
        ((GeneralPath) shape).curveTo(136.33119, 88.4582, 136.35039, 88.823204, 136.32399, 89.1713);
        ((GeneralPath) shape).curveTo(136.2979, 89.516106, 136.17569, 89.885605, 136.29929, 90.208405);
        ((GeneralPath) shape).curveTo(136.42249, 90.530106, 137.09229, 90.6258, 137.00879, 90.95991);
        ((GeneralPath) shape).curveTo(136.91179, 91.34761, 136.35078, 91.64981, 135.96419, 91.54851);
        ((GeneralPath) shape).curveTo(135.34789, 91.38691, 135.00769, 90.70591, 134.51228, 90.305305);
        ((GeneralPath) shape).curveTo(134.08308, 89.958206, 133.74208, 89.3439, 133.19138, 89.306206);
        ((GeneralPath) shape).curveTo(132.88078, 89.284904, 133.36058, 89.9147, 133.35408, 90.226006);
        ((GeneralPath) shape).curveTo(133.34698, 90.564705, 132.88377, 91.0146, 133.15158, 91.222206);
        ((GeneralPath) shape).curveTo(133.69408, 91.64261, 134.62378, 91.216606, 135.16939, 91.633);
        ((GeneralPath) shape).curveTo(135.45659, 91.852104, 135.38258, 92.480705, 135.10759, 92.715004);
        ((GeneralPath) shape).curveTo(134.67299, 93.085304, 133.97519, 92.908005, 133.4399, 93.106705);
        ((GeneralPath) shape).curveTo(133.37149, 93.1321, 133.4195, 93.268005, 133.46599, 93.3243);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB8DB7C));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.597503f, 0.137483f, -0.137483f, 0.597503f, 137.323f, 94.5243f));

        // _0_0_0_1_23
        shape = new Ellipse2D.Double(-1.2537000179290771, -1.2537000179290771, 2.5074000358581543, 2.5074000358581543);
        g.setPaint(WHITE);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_23
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.347006f, 0.0798446f, -0.0798446f, 0.347006f, 137.221f, 94.5744f));

        // _0_0_0_1_24
        shape = new Ellipse2D.Double(-1.2537000179290771, -1.2537000179290771, 2.5074000358581543, 2.5074000358581543);
        g.setPaint(new Color(0x7BC4A0));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_24
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.597503f, 0.137483f, -0.137483f, 0.597503f, 139.242f, 94.9659f));

        // _0_0_0_1_25
        shape = new Ellipse2D.Double(-1.2537000179290771, -1.2537000179290771, 2.5074000358581543, 2.5074000358581543);
        g.setPaint(WHITE);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_25
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.347006f, 0.0798446f, -0.0798446f, 0.347006f, 139.14f, 95.016f));

        // _0_0_0_1_26
        shape = new Ellipse2D.Double(-1.2537000179290771, -1.2537000179290771, 2.5074000358581543, 2.5074000358581543);
        g.setPaint(new Color(0x7BC4A0));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1_26

        // _0_0_0_1_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(115.557, 109.031);
        ((GeneralPath) shape).curveTo(132.3577, 103.9052, 148.9308, 102.6987, 165.3045, 104.934296);
        ((GeneralPath) shape).curveTo(165.8957, 105.8258, 166.3975, 106.73869, 166.8031, 107.6653);
        ((GeneralPath) shape).curveTo(149.7901, 104.232796, 133.1867, 106.2165, 116.94701, 113.010895);
        ((GeneralPath) shape).curveTo(116.287, 111.7094, 115.8168, 110.375595, 115.55701, 109.031);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFF500));
        g.fill(shape);

        // _0_0_0_1_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(118.838, 116.0);
        ((GeneralPath) shape).curveTo(135.3436, 110.5069, 151.6286, 108.8124, 167.7195, 110.4654);
        ((GeneralPath) shape).curveTo(167.888, 111.2387, 167.9872, 112.016, 168.0132, 112.7932);
        ((GeneralPath) shape).curveTo(152.3835, 110.6234, 137.099, 113.0172, 122.1236, 119.4985);
        ((GeneralPath) shape).curveTo(120.8726, 118.3949, 119.770996, 117.221695, 118.838, 116.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x0093DD));
        g.fill(shape);

        // _0_0_0_1_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(125.473, 122.049);
        ((GeneralPath) shape).curveTo(139.6336, 117.588806, 153.6323, 115.91621, 167.4859, 116.74721);
        ((GeneralPath) shape).curveTo(167.2592, 117.480705, 166.9643, 118.18541, 166.6055, 118.859406);
        ((GeneralPath) shape).curveTo(154.3152, 118.07661, 142.2377, 120.109604, 130.3553, 124.722206);
        ((GeneralPath) shape).curveTo(128.606, 123.93451, 126.9716, 123.03651, 125.473, 122.049);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_1_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(176.076, 138.737);
        ((GeneralPath) shape).curveTo(177.4144, 140.8005, 177.9586, 143.1336, 177.43451, 145.4113);
        ((GeneralPath) shape).curveTo(176.9105, 147.6889, 175.40141, 149.54941, 173.29572, 150.8203);
        ((GeneralPath) shape).curveTo(173.25671, 149.161, 173.50081, 146.9755, 174.04051, 144.6302);
        ((GeneralPath) shape).curveTo(174.58011, 142.285, 175.31572, 140.2124, 176.07602, 138.737);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF8C300));
        g.fill(shape);

        // _0_0_0_1_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(187.998, 86.9251);
        ((GeneralPath) shape).curveTo(189.3364, 88.9887, 189.8807, 91.3215, 189.3566, 93.599205);
        ((GeneralPath) shape).curveTo(188.8325, 95.87681, 187.3234, 97.7375, 185.2177, 99.00851);
        ((GeneralPath) shape).curveTo(185.1787, 97.349106, 185.4229, 95.16341, 185.9625, 92.81811);
        ((GeneralPath) shape).curveTo(186.50209, 90.47291, 187.2377, 88.400604, 187.998, 86.92511);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_1_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(140.937, 84.9577);
        ((GeneralPath) shape).curveTo(147.4832, 86.464005, 151.6586, 92.6064, 150.2627, 98.67461);
        ((GeneralPath) shape).curveTo(150.151, 99.159805, 150.00659, 99.62941, 149.83319, 100.08281);
        ((GeneralPath) shape).curveTo(146.12749, 100.85651, 141.82379, 101.04461, 137.36209, 100.49251);
        ((GeneralPath) shape).curveTo(133.21799, 99.97901, 129.4878, 98.89541, 126.45009, 97.44281);
        ((GeneralPath) shape).curveTo(126.20569, 96.07161, 126.22619, 94.64361, 126.55369, 93.21981);
        ((GeneralPath) shape).curveTo(127.94999, 87.15131, 134.39088, 83.45141, 140.93698, 84.95771);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x80B3DEF8, true));
        g.fill(shape);

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(74.126, 56.2671);
        ((GeneralPath) shape).curveTo(97.3513, 43.617104, 117.673096, 36.0887, 119.5068, 39.4555);
        ((GeneralPath) shape).curveTo(121.3405, 42.8221, 103.9928, 55.811, 80.7675, 68.461);
        ((GeneralPath) shape).curveTo(57.542404, 81.1108, 37.2205, 88.6392, 35.386803, 85.2725);
        ((GeneralPath) shape).curveTo(33.553104, 81.9058, 50.9009, 68.917, 74.12601, 56.267097);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(74.7396, 57.3939);
        ((GeneralPath) shape).curveTo(93.6729, 47.081604, 110.2392, 40.944504, 111.734, 43.689003);
        ((GeneralPath) shape).curveTo(113.228905, 46.433502, 99.0871, 57.022003, 80.1538, 67.334206);
        ((GeneralPath) shape).curveTo(61.220703, 77.64641, 44.6544, 83.78351, 43.1596, 81.039);
        ((GeneralPath) shape).curveTo(41.6647, 78.2945, 55.8065, 67.706, 74.7396, 57.3939);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFF500));
        g.fill(shape);

        // _0_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.573, 40.5641);
        ((GeneralPath) shape).curveTo(77.6109, 34.007, 92.6904, 38.4524, 99.2467, 50.490196);
        ((GeneralPath) shape).curveTo(99.9675, 51.813095, 100.55499, 53.172997, 101.0135, 54.553497);
        ((GeneralPath) shape).curveTo(95.5123, 58.437798, 88.2746, 62.910995, 80.15399, 67.334595);
        ((GeneralPath) shape).curveTo(72.03289, 71.7567, 64.34929, 75.4107, 58.10189, 77.9265);
        ((GeneralPath) shape).curveTo(57.19069, 76.7915, 56.36699, 75.5607, 55.646492, 74.238);
        ((GeneralPath) shape).curveTo(49.08979, 62.199898, 53.53519, 47.1204, 65.57299, 40.5641);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(101.4739, 56.1102);
        ((GeneralPath) shape).curveTo(104.2867, 66.886696, 99.5408, 78.5973, 89.3206, 84.163895);
        ((GeneralPath) shape).curveTo(79.100105, 89.7307, 66.6881, 87.3651, 59.160004, 79.1571);
        ((GeneralPath) shape).curveTo(65.6622, 76.297195, 73.0538, 72.6623, 80.7674, 68.4609);
        ((GeneralPath) shape).curveTo(88.481, 64.26, 95.544205, 60.0215, 101.4739, 56.1102);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(82.41110229492188, 50.94269943237305), 24.8271f, new Point2D.Double(82.41110229492188, 50.94269943237305), new float[]{0, 1}, new Color[]{new Color(0xF8C300), new Color(0x8F5444)}, NO_CYCLE, SRGB, new AffineTransform()));
        g.fill(shape);

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(145.777, 38.2231);
        ((GeneralPath) shape).lineTo(147.722, 41.0736);
        ((GeneralPath) shape).lineTo(151.034, 42.0427);
        ((GeneralPath) shape).lineTo(148.924, 44.7736);
        ((GeneralPath) shape).lineTo(149.026, 48.2231);
        ((GeneralPath) shape).lineTo(145.777, 47.0602);
        ((GeneralPath) shape).lineTo(142.528, 48.2231);
        ((GeneralPath) shape).lineTo(142.63, 44.7736);
        ((GeneralPath) shape).lineTo(140.52, 42.0427);
        ((GeneralPath) shape).lineTo(143.832, 41.0736);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE77817));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(186.833, 57.5953);
        ((GeneralPath) shape).lineTo(187.287, 60.5402);
        ((GeneralPath) shape).lineTo(189.506, 62.5288);
        ((GeneralPath) shape).lineTo(186.845, 63.8701);
        ((GeneralPath) shape).lineTo(185.64, 66.5953);
        ((GeneralPath) shape).lineTo(183.542, 64.4793);
        ((GeneralPath) shape).lineTo(180.578, 64.175);
        ((GeneralPath) shape).lineTo(181.942, 61.5258);
        ((GeneralPath) shape).lineTo(181.315, 58.6126);
        ((GeneralPath) shape).lineTo(184.256, 59.0912);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(85.7512, 120.668);
        ((GeneralPath) shape).lineTo(88.2893, 121.678);
        ((GeneralPath) shape).lineTo(90.8916, 120.848);
        ((GeneralPath) shape).lineTo(90.7158, 123.574);
        ((GeneralPath) shape).lineTo(92.3094, 125.792);
        ((GeneralPath) shape).lineTo(89.6626, 126.467);
        ((GeneralPath) shape).lineTo(88.0452, 128.668);
        ((GeneralPath) shape).lineTo(86.5852, 126.36);
        ((GeneralPath) shape).lineTo(83.992, 125.501);
        ((GeneralPath) shape).lineTo(85.7365, 123.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFF500));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(218.473, 131.098);
        ((GeneralPath) shape).lineTo(220.913, 129.433);
        ((GeneralPath) shape).lineTo(221.742, 126.598);
        ((GeneralPath) shape).lineTo(224.08, 128.404);
        ((GeneralPath) shape).lineTo(227.032, 128.317);
        ((GeneralPath) shape).lineTo(226.037, 131.098);
        ((GeneralPath) shape).lineTo(227.032, 133.879);
        ((GeneralPath) shape).lineTo(224.08, 133.792);
        ((GeneralPath) shape).lineTo(221.742, 135.598);
        ((GeneralPath) shape).lineTo(220.913, 132.763);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEF9BA0));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(264.321, 145.479);
        ((GeneralPath) shape).lineTo(266.75, 147.704);
        ((GeneralPath) shape).lineTo(270.039, 147.882);
        ((GeneralPath) shape).lineTo(268.673, 150.879);
        ((GeneralPath) shape).lineTo(269.52, 154.062);
        ((GeneralPath) shape).lineTo(266.247, 153.69);
        ((GeneralPath) shape).lineTo(263.482, 155.479);
        ((GeneralPath) shape).lineTo(262.824, 152.251);
        ((GeneralPath) shape).lineTo(260.269, 150.174);
        ((GeneralPath) shape).lineTo(263.135, 148.551);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFF500));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(61.7181, 92.236);
        ((GeneralPath) shape).lineTo(63.6386, 94.5816);
        ((GeneralPath) shape).lineTo(66.6114, 95.1761);
        ((GeneralPath) shape).lineTo(64.974, 97.7276);
        ((GeneralPath) shape).lineTo(65.3272, 100.739);
        ((GeneralPath) shape).lineTo(62.3947, 99.9696);
        ((GeneralPath) shape).lineTo(59.6403, 101.236);
        ((GeneralPath) shape).lineTo(59.4653, 98.2095);
        ((GeneralPath) shape).lineTo(57.4098, 95.9812);
        ((GeneralPath) shape).lineTo(60.2341, 94.8795);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDA251D));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.7659, 50.003);
        ((GeneralPath) shape).lineTo(23.7069, 51.2486);
        ((GeneralPath) shape).lineTo(25.9974, 50.9799);
        ((GeneralPath) shape).lineTo(25.4125, 53.2107);
        ((GeneralPath) shape).lineTo(26.3759, 55.3061);
        ((GeneralPath) shape).lineTo(24.0735, 55.4393);
        ((GeneralPath) shape).lineTo(22.3783, 57.003);
        ((GeneralPath) shape).lineTo(21.5403, 54.8544);
        ((GeneralPath) shape).lineTo(19.5292, 53.7255);
        ((GeneralPath) shape).lineTo(21.3136, 52.2644);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB3DEF8));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(104.454, 16.041);
        ((GeneralPath) shape).lineTo(106.733, 18.459);
        ((GeneralPath) shape).lineTo(110.029, 18.8817);
        ((GeneralPath) shape).lineTo(108.434, 21.7968);
        ((GeneralPath) shape).lineTo(109.051, 25.0621);
        ((GeneralPath) shape).lineTo(105.785, 24.4456);
        ((GeneralPath) shape).lineTo(102.87, 26.041);
        ((GeneralPath) shape).lineTo(102.447, 22.745);
        ((GeneralPath) shape).lineTo(100.029, 20.4656);
        ((GeneralPath) shape).lineTo(103.033, 19.045);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFF500));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(133.135, 152.434);
        ((GeneralPath) shape).lineTo(135.908, 154.428);
        ((GeneralPath) shape).lineTo(139.316, 154.21);
        ((GeneralPath) shape).lineTo(138.276, 157.463);
        ((GeneralPath) shape).lineTo(139.536, 160.636);
        ((GeneralPath) shape).lineTo(136.121, 160.653);
        ((GeneralPath) shape).lineTo(133.492, 162.832);
        ((GeneralPath) shape).lineTo(132.421, 159.589);
        ((GeneralPath) shape).lineTo(129.536, 157.762);
        ((GeneralPath) shape).lineTo(132.289, 155.742);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDA251D));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(202.998, 113.407);
        ((GeneralPath) shape).lineTo(204.663, 115.847);
        ((GeneralPath) shape).lineTo(207.498, 116.677);
        ((GeneralPath) shape).lineTo(205.692, 119.014);
        ((GeneralPath) shape).lineTo(205.779, 121.967);
        ((GeneralPath) shape).lineTo(202.998, 120.971);
        ((GeneralPath) shape).lineTo(200.217, 121.967);
        ((GeneralPath) shape).lineTo(200.304, 119.014);
        ((GeneralPath) shape).lineTo(198.498, 116.677);
        ((GeneralPath) shape).lineTo(201.333, 115.847);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(178.317, 167.753);
        ((GeneralPath) shape).lineTo(178.901, 170.397);
        ((GeneralPath) shape).lineTo(181.03, 172.071);
        ((GeneralPath) shape).lineTo(178.696, 173.443);
        ((GeneralPath) shape).lineTo(177.763, 175.985);
        ((GeneralPath) shape).lineTo(175.736, 174.189);
        ((GeneralPath) shape).lineTo(173.03, 174.087);
        ((GeneralPath) shape).lineTo(174.112, 171.604);
        ((GeneralPath) shape).lineTo(173.373, 168.999);
        ((GeneralPath) shape).lineTo(176.068, 169.261);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDD137B));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(217.554, 74.0183);
        ((GeneralPath) shape).lineTo(220.167, 74.4991);
        ((GeneralPath) shape).lineTo(222.491, 73.2131);
        ((GeneralPath) shape).lineTo(222.841, 75.8464);
        ((GeneralPath) shape).lineTo(224.783, 77.6598);
        ((GeneralPath) shape).lineTo(222.387, 78.8064);
        ((GeneralPath) shape).lineTo(221.262, 81.2131);
        ((GeneralPath) shape).lineTo(219.431, 79.2883);
        ((GeneralPath) shape).lineTo(216.794, 78.9624);
        ((GeneralPath) shape).lineTo(218.059, 76.6263);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFF500));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(115.123, 58.7967);
        ((GeneralPath) shape).lineTo(116.485, 60.792);
        ((GeneralPath) shape).lineTo(118.803, 61.4704);
        ((GeneralPath) shape).lineTo(117.326, 63.382);
        ((GeneralPath) shape).lineTo(117.397, 65.7967);
        ((GeneralPath) shape).lineTo(115.123, 64.9827);
        ((GeneralPath) shape).lineTo(112.849, 65.7967);
        ((GeneralPath) shape).lineTo(112.92, 63.382);
        ((GeneralPath) shape).lineTo(111.443, 61.4704);
        ((GeneralPath) shape).lineTo(113.761, 60.792);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDA251D));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(105.45, 158.68);
        ((GeneralPath) shape).lineTo(106.288, 160.829);
        ((GeneralPath) shape).lineTo(108.299, 161.958);
        ((GeneralPath) shape).lineTo(106.514, 163.419);
        ((GeneralPath) shape).lineTo(106.061, 165.68);
        ((GeneralPath) shape).lineTo(104.12, 164.434);
        ((GeneralPath) shape).lineTo(101.83, 164.702);
        ((GeneralPath) shape).lineTo(102.415, 162.472);
        ((GeneralPath) shape).lineTo(101.452, 160.376);
        ((GeneralPath) shape).lineTo(103.755, 160.243);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB3DEF8));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(257.733, 122.849);
        ((GeneralPath) shape).lineTo(259.587, 121.49);
        ((GeneralPath) shape).lineTo(260.158, 119.263);
        ((GeneralPath) shape).lineTo(262.024, 120.607);
        ((GeneralPath) shape).lineTo(264.318, 120.462);
        ((GeneralPath) shape).lineTo(263.616, 122.651);
        ((GeneralPath) shape).lineTo(264.463, 124.788);
        ((GeneralPath) shape).lineTo(262.164, 124.798);
        ((GeneralPath) shape).lineTo(260.393, 126.263);
        ((GeneralPath) shape).lineTo(259.674, 124.08);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB3DEF8));
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(40.5689, 34.3552);
        ((GeneralPath) shape).lineTo(44.5975, 34.0516);
        ((GeneralPath) shape).lineTo(47.5188, 31.2609);
        ((GeneralPath) shape).lineTo(49.0524, 34.9985);
        ((GeneralPath) shape).lineTo(52.6093, 36.9145);
        ((GeneralPath) shape).lineTo(49.5285, 39.528);
        ((GeneralPath) shape).lineTo(48.8055, 43.5028);
        ((GeneralPath) shape).lineTo(45.3678, 41.3805);
        ((GeneralPath) shape).lineTo(41.3641, 41.9211);
        ((GeneralPath) shape).lineTo(42.3203, 37.9959);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);
        g.setPaint(new Color(0x1F1A17));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0

    }
}

