package com.pump.awt.geom.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import static java.awt.MultipleGradientPaint.ColorSpaceType.SRGB;
import static java.awt.MultipleGradientPaint.CycleMethod.NO_CYCLE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/333423/young-woman-sitting-at-computer-desk
 * </p>
 */
public class PersonAtComputer implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public PersonAtComputer() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public PersonAtComputer(int width, int height) {
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
        g.transform(new AffineTransform(2.0E-4f, 0, 0, 2.0E-4f, 0.033083983f, 0));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2732.0784, 814.49805);
        ((GeneralPath) shape).curveTo(2740.7334, 913.3981, 2807.4153, 988.3511, 2881.0344, 981.9);
        ((GeneralPath) shape).curveTo(2954.6533, 975.44904, 3007.3184, 890.04504, 2998.6714, 791.145);
        ((GeneralPath) shape).curveTo(2990.0173, 692.245, 2923.3274, 617.299, 2849.7153, 623.75);
        ((GeneralPath) shape).curveTo(2776.0964, 630.193, 2723.4314, 715.598, 2732.0784, 814.498);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xC01F1F));
        g.fill(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3573.393, 622.46);
        ((GeneralPath) shape).curveTo(3573.393, 622.46, 3484.784, 1033.953, 3582.96, 1239.995);
        ((GeneralPath) shape).curveTo(3462.83, 1297.371, 3260.558, 1380.249, 3209.2493, 1268.73);
        ((GeneralPath) shape).curveTo(3209.2493, 1268.73, 3158.8237, 1204.4769, 3129.2957, 1025.739);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEC9458));
        g.fill(shape);

        // _0_0_2

        // _0_0_2_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3691.058, 3608.206);
        ((GeneralPath) shape).curveTo(3691.058, 3608.206, 3768.228, 3608.206, 3871.354, 3608.206);
        ((GeneralPath) shape).curveTo(3974.48, 3608.206, 3989.977, 3512.611, 3989.977, 3512.611);
        ((GeneralPath) shape).lineTo(3989.977, 3107.029);
        ((GeneralPath) shape).lineTo(3809.6802, 3107.029);
        ((GeneralPath) shape).lineTo(3809.6802, 3512.611);
        ((GeneralPath) shape).lineTo(3691.058, 3512.611);
        ((GeneralPath) shape).lineTo(3691.058, 3608.206);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8090BE));
        g.fill(shape);

        // _0_0_2_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3809.68, 3107.021);
        ((GeneralPath) shape).lineTo(3809.68, 3512.6099);
        ((GeneralPath) shape).lineTo(3691.065, 3512.6099);
        ((GeneralPath) shape).lineTo(3691.065, 3608.2048);
        ((GeneralPath) shape).curveTo(3691.065, 3608.2048, 3768.228, 3608.2048, 3871.354, 3608.2048);
        ((GeneralPath) shape).curveTo(3887.452, 3608.2048, 3900.76, 3605.3418, 3912.857, 3601.4058);
        ((GeneralPath) shape).curveTo(3852.48, 3578.1687, 3843.833, 3519.1257, 3843.833, 3519.1257);
        ((GeneralPath) shape).lineTo(3843.833, 3107.0208);
        ((GeneralPath) shape).lineTo(3809.68, 3107.0208);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x616F95));
        g.fill(shape);

        // _0_0_2_2

        // _0_0_2_2_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3380.086, 2386.807);
        ((GeneralPath) shape).curveTo(3348.39, 2977.324, 3605.241, 3210.307, 3937.5078, 3210.307);
        ((GeneralPath) shape).curveTo(4269.7676, 3210.307, 4551.632, 2977.324, 4583.321, 2386.807);
        ((GeneralPath) shape).curveTo(4615.01, 1796.2898, 4384.5347, 1071.8569, 4052.275, 1071.8569);
        ((GeneralPath) shape).curveTo(3720.0068, 1071.856, 3411.774, 1796.289, 3380.086, 2386.807);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x323249));
        g.fill(shape);

        // _0_0_2_2_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3320.202, 2378.638);
        ((GeneralPath) shape).curveTo(3289.564, 2949.52, 3537.877, 3174.762, 3859.0908, 3174.762);
        ((GeneralPath) shape).curveTo(4180.312, 3174.762, 4452.797, 2949.52, 4483.4346, 2378.638);
        ((GeneralPath) shape).curveTo(4514.0737, 1807.749, 4291.259, 1107.4009, 3970.0376, 1107.4009);
        ((GeneralPath) shape).curveTo(3648.8225, 1107.4009, 3350.8396, 1807.7489, 3320.2017, 2378.638);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3E3E5B));
        g.fill(shape);

        // _0_0_2_2_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4107.802, 1207.758);
        ((GeneralPath) shape).curveTo(4107.802, 1207.758, 4106.7217, 1207.258, 4104.714, 1206.3881);
        ((GeneralPath) shape).curveTo(4096.444, 1202.4961, 4037.814, 1177.4751, 3928.2659, 1159.935);
        ((GeneralPath) shape).lineTo(3928.252, 1159.925);
        ((GeneralPath) shape).curveTo(3906.674, 1156.468, 3884.169, 1153.322, 3858.648, 1150.785);
        ((GeneralPath) shape).lineTo(3858.873, 1150.379);
        ((GeneralPath) shape).curveTo(3858.873, 1150.379, 3850.5452, 1149.2051, 3837.0352, 1147.697);
        ((GeneralPath) shape).curveTo(3570.6172, 1302.589, 3346.5422, 1887.8291, 3320.2021, 2378.634);
        ((GeneralPath) shape).curveTo(3289.5642, 2949.516, 3537.87, 3174.758, 3859.091, 3174.758);
        ((GeneralPath) shape).curveTo(3949.882, 3174.758, 4036.466, 3156.007, 4115.108, 3117.31);
        ((GeneralPath) shape).curveTo(4115.978, 3114.157, 4116.899, 3111.0771, 4117.754, 3107.895);
        ((GeneralPath) shape).curveTo(4120.6597, 3109.925, 4122.3057, 3111.113, 4124.538, 3112.693);
        ((GeneralPath) shape).curveTo(4133.351, 3108.1272, 4142.0933, 3103.415, 4150.682, 3098.32);
        ((GeneralPath) shape).curveTo(4219.4883, 2977.8572, 4247.314, 2576.435, 4234.515, 2171.752);
        ((GeneralPath) shape).lineTo(4270.936, 2185.1099);
        ((GeneralPath) shape).curveTo(4321.8022, 1829.0479, 4354.499, 1297.1238, 4107.8022, 1207.7549);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x323249));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0, 1, -1, 0, 7481.568f, 973.8043f));

        // _0_0_2_3
        shape = new Rectangle2D.Double(2584.410888671875, 4181.31982421875, 1338.9410400390625, 92.73200225830078);
        g.setPaint(new Color(0x8090BE));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_2_3
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0, 1, -1, 0, 7510.9917f, 944.3806f));

        // _0_0_2_4
        shape = new Rectangle2D.Double(2613.8349609375, 4210.744140625, 1338.9410400390625, 33.8849983215332);
        g.setPaint(new Color(0x616F95));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_2_4

        // _0_0_2_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3203.123, 3927.18);
        ((GeneralPath) shape).lineTo(3129.41, 3579.822);
        ((GeneralPath) shape).lineTo(3378.361, 3579.822);
        ((GeneralPath) shape).lineTo(3304.647, 3927.18);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3356.37, 4880.479);
        ((GeneralPath) shape).lineTo(3775.114, 4950.358);
        ((GeneralPath) shape).lineTo(3775.114, 4978.944);
        ((GeneralPath) shape).lineTo(2732.656, 4978.944);
        ((GeneralPath) shape).lineTo(2732.656, 4950.358);
        ((GeneralPath) shape).lineTo(3151.408, 4880.479);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8090BE));
        g.fill(shape);

        // _0_0_2_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3380.789, 4888.423);
        ((GeneralPath) shape).lineTo(3126.982, 4888.423);
        ((GeneralPath) shape).lineTo(3174.117, 4592.244);
        ((GeneralPath) shape).lineTo(3333.654, 4592.244);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_2_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3080.138, 4950.358);
        ((GeneralPath) shape).lineTo(3203.123, 4897.157);
        ((GeneralPath) shape).lineTo(3236.313, 4618.46);
        ((GeneralPath) shape).lineTo(3174.117, 4592.244);
        ((GeneralPath) shape).lineTo(3333.654, 4592.244);
        ((GeneralPath) shape).lineTo(3380.151, 4884.451);
        ((GeneralPath) shape).lineTo(3775.114, 4950.358);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x616F95));
        g.fill(shape);

        // _0_0_2_9

        // _0_0_2_9_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2532.834, 3496.599);
        ((GeneralPath) shape).lineTo(3974.938, 3496.599);
        ((GeneralPath) shape).lineTo(3974.938, 3496.599);
        ((GeneralPath) shape).curveTo(3974.938, 3424.205, 3916.251, 3365.517, 3843.856, 3365.517);
        ((GeneralPath) shape).lineTo(2663.908, 3365.517);
        ((GeneralPath) shape).curveTo(2591.515, 3365.517, 2532.834, 3424.205, 2532.834, 3496.599);
        ((GeneralPath) shape).lineTo(2532.834, 3496.599);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x3E3E5B));
        g.fill(shape);

        // _0_0_2_9_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2673.867, 3365.517);
        ((GeneralPath) shape).lineTo(3280.33, 3365.517);
        ((GeneralPath) shape).curveTo(3202.435, 3365.517, 3139.289, 3424.205, 3139.289, 3496.592);
        ((GeneralPath) shape).lineTo(2532.833, 3496.592);
        ((GeneralPath) shape).curveTo(2532.834, 3424.205, 2595.979, 3365.517, 2673.867, 3365.517);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x323249));
        g.fill(shape);

        // _0_0_2_9_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3972.64, 3473.659);
        ((GeneralPath) shape).curveTo(3974.0598, 3481.117, 3974.937, 3488.7568, 3974.937, 3496.592);
        ((GeneralPath) shape).lineTo(2532.834, 3496.592);
        ((GeneralPath) shape).curveTo(2532.834, 3488.757, 2533.711, 3481.117, 2535.125, 3473.659);
        ((GeneralPath) shape).lineTo(3972.6401, 3473.659);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(-1, 0, 0, -1, 6507.765f, 7159.658f));

        // _0_0_2_9_3
        shape = new Rectangle2D.Double(2476.4150390625, 3491.35205078125, 1554.93505859375, 176.9550018310547);
        g.setPaint(new Color(0x3E3E5B));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_2_9_3
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(-1, 0, 0, -1, 5957.7207f, 7159.658f));

        // _0_0_2_9_4
        shape = new Rectangle2D.Double(2476.4150390625, 3491.35205078125, 1004.8900146484375, 176.9550018310547);
        g.setPaint(new Color(0x323249));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_2_9_4

        // _0_0_2_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3456.06, 3860.222);
        ((GeneralPath) shape).curveTo(3446.1812, 3860.222, 3437.788, 3859.207, 3431.474, 3856.888);
        ((GeneralPath) shape).curveTo(3380.172, 3838.202, 3390.7112, 3678.338, 3392.1401, 3660.182);
        ((GeneralPath) shape).curveTo(3392.436, 3656.138, 3395.8281, 3653.043, 3399.8152, 3653.043);
        ((GeneralPath) shape).curveTo(3399.996, 3653.043, 3400.1702, 3653.043, 3400.4092, 3653.101);
        ((GeneralPath) shape).curveTo(3404.6353, 3653.3982, 3407.8533, 3657.0872, 3407.4902, 3661.3782);
        ((GeneralPath) shape).curveTo(3402.6702, 3725.4731, 3406.3591, 3831.2952, 3436.7153, 3842.37);
        ((GeneralPath) shape).curveTo(3473.4404, 3855.402, 3612.7053, 3812.79, 3663.3552, 3795.112);
        ((GeneralPath) shape).curveTo(3667.4653, 3793.742, 3671.8062, 3795.945, 3673.2412, 3799.874);
        ((GeneralPath) shape).curveTo(3674.6042, 3803.918, 3672.4663, 3808.325, 3668.4792, 3809.753);
        ((GeneralPath) shape).curveTo(3651.8103, 3815.523, 3521.6482, 3860.222, 3456.0603, 3860.222);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x323749));
        g.fill(shape);

        // _0_0_2_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3707.265, 3741.875);
        ((GeneralPath) shape).curveTo(3673.503, 3750.797, 3623.5488, 3786.755, 3630.4858, 3812.993);
        ((GeneralPath) shape).curveTo(3637.4219, 3839.231, 3698.618, 3845.805, 3732.3718, 3836.89);
        ((GeneralPath) shape).curveTo(3766.1257, 3827.9668, 3787.8708, 3799.461, 3780.942, 3773.223);
        ((GeneralPath) shape).curveTo(3774.005, 3746.992, 3741.0188, 3732.953, 3707.265, 3741.875);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3

        // _0_0_3_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2944.46, 1385.409);
        ((GeneralPath) shape).curveTo(2884.8079, 1404.972, 2853.482, 1614.3771, 2790.46, 1925.6171);
        ((GeneralPath) shape).curveTo(2769.042, 2031.425, 2708.578, 2232.342, 2708.578, 2232.342);
        ((GeneralPath) shape).curveTo(2685.7458, 2420.2642, 2696.93, 2558.079, 2790.46, 2572.655);
        ((GeneralPath) shape).curveTo(3078.601, 2617.55, 3289.427, 1272.274, 2944.46, 1385.409);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEC9458));
        g.fill(shape);

        // _0_0_3_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2790.46, 2572.655);
        ((GeneralPath) shape).curveTo(2519.352, 2539.705, 2275.359, 2185.94, 2061.7139, 2171.886);
        ((GeneralPath) shape).lineTo(2105.703, 2076.472);
        ((GeneralPath) shape).curveTo(2237.908, 2062.911, 2600.503, 2203.473, 2708.6138, 2232.3418);
        ((GeneralPath) shape).curveTo(2875.2117, 2289.182, 2843.0808, 2579.0479, 2790.4597, 2572.6548);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_2

        // _0_0_3_2_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1871.88, 2175.082);
        ((GeneralPath) shape).curveTo(1871.88, 2175.082, 1872.119, 2230.516, 1877.251, 2244.07);
        ((GeneralPath) shape).curveTo(1883.412, 2260.32, 1939.215, 2334.258, 1955.835, 2328.278);
        ((GeneralPath) shape).curveTo(1979.761, 2319.667, 1946.26, 2278.506, 1946.26, 2278.506);
        ((GeneralPath) shape).lineTo(2045.11, 2162.87);
        ((GeneralPath) shape).lineTo(1871.88, 2175.082);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD87238));
        g.fill(shape);

        // _0_0_3_2_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2157.172, 2076.233);
        ((GeneralPath) shape).curveTo(2089.257, 2072.9858, 2020.9801, 2084.858, 1968.9171, 2095.6938);
        ((GeneralPath) shape).curveTo(1923.6161, 2105.117, 1890.2241, 2112.7559, 1884.5781, 2121.6567);
        ((GeneralPath) shape).curveTo(1873.0032, 2139.9438, 1871.8792, 2175.0828, 1871.8792, 2175.0828);
        ((GeneralPath) shape).curveTo(1871.8792, 2175.0828, 1845.1702, 2194.1309, 1819.2942, 2209.8157);
        ((GeneralPath) shape).curveTo(1788.4321, 2228.5237, 1749.6482, 2246.9048, 1758.4102, 2258.7117);
        ((GeneralPath) shape).curveTo(1774.9362, 2280.9487, 1868.1172, 2220.9568, 1911.9901, 2204.1846);
        ((GeneralPath) shape).curveTo(1966.6051, 2183.3096, 1988.6392, 2177.0986, 1997.6261, 2185.0276);
        ((GeneralPath) shape).curveTo(2008.477, 2194.5945, 1984.7611, 2229.8645, 1972.7441, 2241.8167);
        ((GeneralPath) shape).curveTo(1960.7262, 2253.7686, 1928.7112, 2278.8477, 1945.4471, 2293.2708);
        ((GeneralPath) shape).curveTo(1962.1902, 2307.7017, 1996.8081, 2269.9177, 2020.1101, 2251.0508);
        ((GeneralPath) shape).curveTo(2043.4131, 2232.1768, 2137.1602, 2198.0737, 2149.6711, 2156.0928);
        ((GeneralPath) shape).curveTo(2152.788, 2145.6328, 2186.1353, 2077.6099, 2157.172, 2076.2327);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEC9458));
        g.fill(shape);

        // _0_0_4

        // _0_0_4_0

        // _0_0_4_0_0

        // _0_0_4_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2306.099, 4831.648);
        ((GeneralPath) shape).curveTo(2306.099, 4831.648, 2268.416, 4894.453, 2177.141, 4932.128);
        ((GeneralPath) shape).curveTo(2085.8652, 4969.811, 2026.1261, 4961.3667, 2033.6641, 4986.518);
        ((GeneralPath) shape).curveTo(2041.202, 5011.6763, 2399.497, 4999.0503, 2395.634, 4969.775);
        ((GeneralPath) shape).curveTo(2391.771, 4940.5, 2369.446, 4898.635, 2364.714, 4831.648);
        ((GeneralPath) shape).curveTo(2359.9812, 4764.669, 2306.099, 4831.648, 2306.099, 4831.648);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_4_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2364.714, 4831.648);
        ((GeneralPath) shape).curveTo(2359.974, 4764.661, 2306.099, 4831.648, 2306.099, 4831.648);
        ((GeneralPath) shape).curveTo(2306.099, 4831.648, 2294.9802, 4849.602, 2271.185, 4871.962);
        ((GeneralPath) shape).curveTo(2311.4412, 4880.703, 2341.825, 4899.838, 2353.089, 4929.497);
        ((GeneralPath) shape).curveTo(2359.801, 4947.1753, 2358.829, 4966.622, 2352.1472, 4986.4673);
        ((GeneralPath) shape).curveTo(2379.0232, 4981.85, 2396.4912, 4976.2554, 2395.6362, 4969.7754);
        ((GeneralPath) shape).curveTo(2391.7712, 4940.5005, 2369.4473, 4898.6353, 2364.714, 4831.6484);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD87238));
        g.fill(shape);

        // _0_0_4_1

        // _0_0_4_1_0

        // _0_0_4_1_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2938.452, 4797.764);
        ((GeneralPath) shape).curveTo(2938.452, 4797.764, 2943.5688, 4873.202, 2839.763, 4918.4673);
        ((GeneralPath) shape).curveTo(2735.962, 4963.7314, 2728.562, 4953.5913, 2733.686, 4983.808);
        ((GeneralPath) shape).curveTo(2738.818, 5014.025, 3019.58, 4998.855, 3018.949, 4963.6953);
        ((GeneralPath) shape).curveTo(3018.311, 4928.5273, 2999.148, 4878.2334, 3002.17, 4797.764);
        ((GeneralPath) shape).curveTo(3005.1848, 4717.295, 2938.452, 4797.764, 2938.452, 4797.764);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFAB276));
        g.fill(shape);

        // _0_0_4_1_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3000.539, 4831.648);
        ((GeneralPath) shape).curveTo(2995.799, 4764.661, 2941.924, 4831.648, 2941.924, 4831.648);
        ((GeneralPath) shape).curveTo(2941.924, 4831.648, 2930.8052, 4849.602, 2907.01, 4871.962);
        ((GeneralPath) shape).curveTo(2947.266, 4880.703, 2977.65, 4899.838, 2988.914, 4929.497);
        ((GeneralPath) shape).curveTo(2995.626, 4947.1753, 2994.655, 4966.622, 2987.9722, 4986.4673);
        ((GeneralPath) shape).curveTo(3014.8552, 4981.85, 3032.3162, 4976.2554, 3031.4612, 4969.7754);
        ((GeneralPath) shape).curveTo(3027.5962, 4940.5005, 3005.2793, 4898.6353, 3000.539, 4831.6484);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEC9458));
        g.fill(shape);

        // _0_0_4_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2958.739, 2757.322);
        ((GeneralPath) shape).lineTo(4037.517, 2766.824);
        ((GeneralPath) shape).lineTo(3019.008, 3018.515);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x2A2E3D));
        g.fill(shape);

        // _0_0_4_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2886.961, 2785.829);
        ((GeneralPath) shape).curveTo(3230.311, 2675.767, 3436.426, 2786.9602, 3439.1938, 3264.2761);
        ((GeneralPath) shape).lineTo(2070.4487, 3246.707);
        ((GeneralPath) shape).curveTo(2070.4487, 3246.707, 2025.0677, 3049.7761, 2187.0767, 2958.385);
        ((GeneralPath) shape).curveTo(2270.5027, 2911.323, 2640.9246, 2825.549, 2886.9607, 2785.829);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x698EAF));
        g.fill(shape);

        // _0_0_4_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3019.008, 3018.515);
        ((GeneralPath) shape).curveTo(3019.008, 3018.515, 2878.749, 3070.9329, 2665.771, 3104.209);
        ((GeneralPath) shape).curveTo(2452.778, 3137.492, 2386.966, 3140.247, 2373.825, 3177.139);
        ((GeneralPath) shape).curveTo(2360.699, 3214.032, 2445.987, 3723.414, 2451.669, 3883.1548);
        ((GeneralPath) shape).curveTo(2456.5688, 4021.0278, 2356.459, 4635.6597, 2336.164, 4833.6997);
        ((GeneralPath) shape).lineTo(2405.332, 4833.6997);
        ((GeneralPath) shape).curveTo(2405.332, 4833.6997, 2592.42, 4165.6416, 2570.023, 3830.4756);
        ((GeneralPath) shape).curveTo(2551.685, 3556.1636, 2514.046, 3366.0176, 2514.046, 3366.0176);
        ((GeneralPath) shape).lineTo(2915.577, 3366.0176);
        ((GeneralPath) shape).curveTo(3002.337, 3344.3167, 3019.0078, 3018.5146, 3019.0078, 3018.5146);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x456683));
        g.fill(shape);

        // _0_0_4_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2582.745, 3268.386);
        ((GeneralPath) shape).curveTo(2587.9702, 3301.966, 2592.9932, 3334.387, 2597.9072, 3366.018);
        ((GeneralPath) shape).lineTo(2915.5781, 3366.018);
        ((GeneralPath) shape).curveTo(2943.736, 3358.9731, 2964.1401, 3319.188, 2979.339, 3269.589);
        ((GeneralPath) shape).curveTo(2979.216, 3269.1401, 2979.0781, 3268.5962, 2978.955, 3268.154);
        ((GeneralPath) shape).lineTo(2979.818, 3268.154);
        ((GeneralPath) shape).curveTo(2980.833, 3264.798, 2982.0442, 3261.855, 2983.0151, 3258.4202);
        ((GeneralPath) shape).lineTo(3439.196, 3264.2693);
        ((GeneralPath) shape).curveTo(3437.8481, 3031.2793, 3387.727, 2886.0632, 3297.162, 2810.6902);
        ((GeneralPath) shape).curveTo(2919.268, 2810.7192, 2700.0132, 2882.3162, 2630.8882, 2945.1492);
        ((GeneralPath) shape).curveTo(2530.0212, 3036.852, 2582.745, 3268.3862, 2582.745, 3268.3862);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_4_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4010.214, 2774.631);
        ((GeneralPath) shape).curveTo(4010.214, 2774.631, 3996.479, 3120.9531, 3886.438, 3267.6611);
        ((GeneralPath) shape).lineTo(2664.495, 3268.3862);
        ((GeneralPath) shape).curveTo(2664.495, 3268.3862, 2611.7722, 3036.8533, 2712.6372, 2945.1572);
        ((GeneralPath) shape).curveTo(2832.673, 2836.037, 3615.9172, 2783.8003, 4010.2144, 2774.6313);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x698EAF));
        g.fill(shape);

        // _0_0_4_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3158.468, 2827.121);
        ((GeneralPath) shape).curveTo(3158.468, 2827.121, 3249.83, 2816.2131, 3292.855, 2808.022);
        ((GeneralPath) shape).curveTo(3404.816, 2786.712, 3590.404, 2788.7559, 3983.186, 3068.2);
        ((GeneralPath) shape).lineTo(3911.125, 3207.574);
        ((GeneralPath) shape).curveTo(3911.125, 3207.574, 3396.706, 2843.132, 3158.468, 2827.121);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x456683));
        g.fill(shape);

        // _0_0_4_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3163.542, 3784.595);
        ((GeneralPath) shape).curveTo(3153.917, 3536.768, 3105.557, 3366.017, 3105.557, 3366.017);
        ((GeneralPath) shape).lineTo(3811.1575, 3369.7969);
        ((GeneralPath) shape).curveTo(3954.8936, 3254.806, 3954.534, 3170.753, 3983.186, 3068.2);
        ((GeneralPath) shape).lineTo(3677.541, 2925.2668);
        ((GeneralPath) shape).curveTo(3677.541, 2925.2668, 3646.222, 3073.4688, 3586.323, 3106.752);
        ((GeneralPath) shape).curveTo(3526.417, 3140.0278, 2932.501, 3140.659, 2906.995, 3167.44);
        ((GeneralPath) shape).curveTo(2881.489, 3194.222, 3015.289, 3610.973, 3042.788, 3800.663);
        ((GeneralPath) shape).curveTo(3070.287, 3990.353, 2979.896, 4833.64, 2979.896, 4833.64);
        ((GeneralPath) shape).lineTo(2980.005, 4833.698);
        ((GeneralPath) shape).lineTo(3053.378, 4833.698);
        ((GeneralPath) shape).curveTo(3053.378, 4833.698, 3180.531, 4039.0474, 3163.542, 3784.5952);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_4_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2070.449, 3246.707);
        ((GeneralPath) shape).curveTo(2223.441, 4130.345, 2256.079, 4833.7, 2256.079, 4833.7);
        ((GeneralPath) shape).lineTo(2407.4702, 4833.7);
        ((GeneralPath) shape).curveTo(2407.4702, 4833.7, 2556.7742, 4084.935, 2529.6882, 3830.476);
        ((GeneralPath) shape).curveTo(2502.6013, 3576.017, 2470.1091, 3142.298, 2470.1091, 3142.298);
        ((GeneralPath) shape).lineTo(2070.4492, 3246.707);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x698EAF));
        g.fill(shape);

        // _0_0_4_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2664.495, 3268.386);
        ((GeneralPath) shape).curveTo(2840.602, 4401.14, 2833.8691, 4402.293, 2881.4521, 4833.7);
        ((GeneralPath) shape).lineTo(3053.3772, 4833.7);
        ((GeneralPath) shape).curveTo(3053.3772, 4833.7, 3180.5303, 4039.047, 3163.548, 3784.5962);
        ((GeneralPath) shape).curveTo(3146.558, 3530.1372, 3023.855, 3142.2983, 3023.855, 3142.2983);
        ((GeneralPath) shape).lineTo(2664.495, 3268.3862);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_4_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3163.542, 3784.595);
        ((GeneralPath) shape).curveTo(3163.532, 3784.436, 3163.528, 3784.32, 3163.513, 3784.16);
        ((GeneralPath) shape).curveTo(3148.242, 3556.91, 3046.884, 3192.7148, 3027.64, 3150.4878);
        ((GeneralPath) shape).curveTo(3016.182, 3151.2349, 3005.2578, 3152.0027, 2995.024, 3152.8147);
        ((GeneralPath) shape).lineTo(2903.937, 3173.4333);
        ((GeneralPath) shape).curveTo(2908.975, 3241.7463, 3018.471, 3632.9287, 3042.789, 3800.6646);
        ((GeneralPath) shape).curveTo(3070.2961, 3990.3545, 2979.897, 4833.6416, 2979.897, 4833.6416);
        ((GeneralPath) shape).lineTo(2980.0059, 4833.7065);
        ((GeneralPath) shape).lineTo(3053.3857, 4833.7065);
        ((GeneralPath) shape).curveTo(3053.3857, 4833.7065, 3060.6858, 4779.5415, 3071.3828, 4694.3325);
        ((GeneralPath) shape).curveTo(3103.4548, 4438.6924, 3176.2837, 3975.4375, 3163.5417, 3784.5945);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x456683));
        g.fill(shape);

        // _0_0_4_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2470.109, 3142.298);
        ((GeneralPath) shape).curveTo(2431.1418, 3144.944, 2364.8079, 3150.4812, 2343.035, 3170.7542);
        ((GeneralPath) shape).curveTo(2320.907, 3207.6472, 2448.1318, 3723.414, 2453.815, 3883.1553);
        ((GeneralPath) shape).curveTo(2458.7148, 4021.0283, 2358.597, 4635.66, 2338.302, 4833.707);
        ((GeneralPath) shape).lineTo(2407.478, 4833.707);
        ((GeneralPath) shape).curveTo(2445.9011, 4626.266, 2577.816, 4194.729, 2572.046, 3865.31);
        ((GeneralPath) shape).curveTo(2569.2048, 3702.721, 2505.1748, 3270.132, 2470.109, 3142.298);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_4_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2886.961, 2785.829);
        ((GeneralPath) shape).curveTo(2886.961, 2785.829, 3001.206, 2781.386, 3035.6118, 2842.7412);
        ((GeneralPath) shape).lineTo(3340.8079, 2806.4062);
        ((GeneralPath) shape).curveTo(3340.8079, 2806.4062, 3016.2598, 2725.2783, 2886.961, 2785.8293);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2916.592, 1393.266);
        ((GeneralPath) shape).curveTo(2779.748, 1489.137, 2705.498, 2078.284, 2705.498, 2078.284);
        ((GeneralPath) shape).lineTo(2961.936, 2129.108);
        ((GeneralPath) shape).lineTo(2994.915, 1981.4639);
        ((GeneralPath) shape).curveTo(2994.915, 1981.4639, 3013.5142, 1788.6139, 2995.517, 1638.2089);
        ((GeneralPath) shape).curveTo(2977.5122, 1487.8029, 2916.592, 1393.2659, 2916.592, 1393.2659);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF7E4EA));
        g.fill(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3989.781, 3120.256);
        ((GeneralPath) shape).curveTo(4135.344, 2967.915, 4125.603, 1672.8181, 3962.47, 1289.1471);
        ((GeneralPath) shape).curveTo(3962.47, 1289.1471, 3762.966, 1190.0151, 3358.508, 1238.2941);
        ((GeneralPath) shape).curveTo(3059.799, 1273.9551, 2916.6921, 1392.6421, 2916.6921, 1392.6421);
        ((GeneralPath) shape).curveTo(2849.6921, 1541.967, 2930.2822, 1924.5, 2989.666, 2324.4292);
        ((GeneralPath) shape).curveTo(3049.253, 2725.7341, 2886.96, 2785.8281, 2886.96, 2785.8281);
        ((GeneralPath) shape).curveTo(2886.96, 2785.8281, 3108.281, 2755.538, 3435.272, 2850.0032);
        ((GeneralPath) shape).curveTo(3748.92, 2940.612, 3989.781, 3120.256, 3989.781, 3120.256);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3755.726, 1237.331);
        ((GeneralPath) shape).curveTo(3657.964, 1224.0891, 3527.092, 1218.1671, 3358.509, 1238.295);
        ((GeneralPath) shape).curveTo(3237.53, 1252.733, 3143.363, 1280.7621, 3072.6, 1309.0441);
        ((GeneralPath) shape).curveTo(3103.745, 1367.348, 3199.297, 1506.555, 3397.0032, 1491.1531);
        ((GeneralPath) shape).curveTo(3598.2612, 1475.467, 3717.318, 1303.114, 3755.726, 1237.331);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE3C5D6));
        g.fill(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3116.501, 1292.373);
        ((GeneralPath) shape).curveTo(3116.501, 1292.373, 3190.026, 1469.357, 3399.851, 1453.005);
        ((GeneralPath) shape).curveTo(3609.676, 1436.653, 3713.541, 1231.779, 3713.541, 1231.779);
        ((GeneralPath) shape).curveTo(3713.541, 1231.779, 3399.946, 1183.5131, 3116.501, 1292.373);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEC9458));
        g.fill(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3962.47, 1289.147);
        ((GeneralPath) shape).curveTo(3962.47, 1289.147, 3901.477, 1260.307, 3782.906, 1241.317);
        ((GeneralPath) shape).curveTo(3776.028, 1378.0961, 3727.574, 1993.307, 3408.027, 2123.345);
        ((GeneralPath) shape).curveTo(3169.4492, 2220.426, 3007.823, 2095.317, 2943.4602, 2029.018);
        ((GeneralPath) shape).curveTo(2958.4143, 2124.0908, 2974.7073, 2223.6948, 2989.6672, 2324.429);
        ((GeneralPath) shape).curveTo(3049.2542, 2725.734, 2886.9612, 2785.821, 2886.9612, 2785.821);
        ((GeneralPath) shape).curveTo(2886.9612, 2785.821, 3108.2822, 2755.538, 3435.2732, 2850.003);
        ((GeneralPath) shape).curveTo(3748.9202, 2940.6108, 3989.7822, 3120.2559, 3989.7822, 3120.2559);
        ((GeneralPath) shape).curveTo(4135.345, 2967.9158, 4125.604, 1672.8179, 3962.4702, 1289.1469);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE3C5D6));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.569192f, 0, 0, 0.56355935f, 2887.3857f, 4.6742854f));

        // _0_0_10

        // _0_0_10_0

        // _0_0_10_0_0

        // _0_0_10_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1240.0219, 2845.567);
        ((GeneralPath) shape).curveTo(1240.0219, 2845.567, 1305.3868, 2916.803, 1310.8988, 3015.1748);
        ((GeneralPath) shape).curveTo(1316.3778, 3113.5479, 1256.3018, 3217.3027, 1256.3018, 3217.3027);
        ((GeneralPath) shape).curveTo(1256.3018, 3217.3027, 1152.5427, 3145.8718, 1136.0718, 3047.6948);
        ((GeneralPath) shape).curveTo(1119.5997, 2949.5498, 1152.3148, 2861.8428, 1152.3148, 2861.8428);
        ((GeneralPath) shape).lineTo(1240.0219, 2845.567);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(1814.804931640625, 133.30039978027344), 2957.2039f, new Point2D.Double(1814.804931640625, 133.30039978027344), new float[]{0, 0.1744f, 0.6137f, 1}, new Color[]{new Color(0xDF7B32), new Color(0xD77631), new Color(0xCA6D2E), new Color(0xC56A2D)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 1, -1034.5892f, 228.20299f)));
        g.fill(shape);

        // _0_0_10_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1305.0918, 1593.334);
        ((GeneralPath) shape).curveTo(1392.5059, 1673.278, 1389.2108, 2032.065, 1252.5789, 2141.5278);
        ((GeneralPath) shape).curveTo(1349.7449, 2276.171, 1323.0319, 2431.1667, 1210.0789, 2549.0117);
        ((GeneralPath) shape).curveTo(1210.0789, 2549.0117, 1337.0569, 2727.6548, 1216.8348, 2889.8916);
        ((GeneralPath) shape).lineTo(1106.5854, 2820.6328);
        ((GeneralPath) shape).curveTo(1106.5854, 2820.6328, 930.71484, 2772.0137, 1029.0219, 2588.6077);
        ((GeneralPath) shape).curveTo(1029.0219, 2588.6077, 836.5488, 2418.0537, 933.87787, 2183.8306);
        ((GeneralPath) shape).curveTo(933.87787, 2183.8306, 713.12585, 2050.7205, 766.8789, 1817.0846);
        ((GeneralPath) shape).curveTo(820.6319, 1583.4506, 1305.0919, 1593.3336, 1305.0919, 1593.3336);
        ((GeneralPath) shape).closePath();

        g.setPaint(new RadialGradientPaint(new Point2D.Double(1814.8062744140625, 133.3905029296875), 2957.1238f, new Point2D.Double(1814.8062744140625, 133.3905029296875), new float[]{0, 0.1744f, 0.6137f, 1}, new Color[]{new Color(0xDF7B32), new Color(0xD77631), new Color(0xCA6D2E), new Color(0xC56A2D)}, NO_CYCLE, SRGB, new AffineTransform(1, 0, 0, 1, -1034.5892f, 228.20299f)));
        g.fill(shape);

        // _0_0_10_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1252.5789, 2141.529);
        ((GeneralPath) shape).curveTo(1389.2119, 2032.034, 1392.5059, 1673.2471, 1305.0918, 1593.302);
        ((GeneralPath) shape).curveTo(1305.0918, 1593.302, 820.63184, 1583.452, 766.8788, 1817.087);
        ((GeneralPath) shape).curveTo(713.1258, 2050.7231, 933.8778, 2183.833, 933.8778, 2183.833);
        ((GeneralPath) shape).curveTo(836.5488, 2418.056, 1029.0219, 2588.61, 1029.0219, 2588.61);
        ((GeneralPath) shape).curveTo(930.71387, 2771.9832, 1057.3988, 2842.3364, 1057.3988, 2842.3364);
        ((GeneralPath) shape).lineTo(1142.0728, 2898.178);
        ((GeneralPath) shape).curveTo(1134.1798, 2932.784, 1126.0907, 2988.233, 1136.0718, 3047.694);
        ((GeneralPath) shape).curveTo(1152.5427, 3145.871, 1256.3018, 3217.302, 1256.3018, 3217.302);
        ((GeneralPath) shape).curveTo(1256.3018, 3217.302, 1316.3778, 3113.547, 1310.8657, 3015.142);
        ((GeneralPath) shape).curveTo(1305.9728, 2927.435, 1253.5907, 2861.4832, 1242.2758, 2848.175);
        ((GeneralPath) shape).curveTo(1316.2147, 2698.528, 1210.0787, 2548.979, 1210.0787, 2548.979);
        ((GeneralPath) shape).curveTo(1323.0317, 2431.168, 1349.7448, 2276.1719, 1252.5787, 2141.529);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x1F1F1F));
        g.fill(shape);

        // _0_0_10_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1096.3438, 363.901);
        ((GeneralPath) shape).curveTo(1556.3418, 672.49097, 1487.3888, 1165.562, 1351.5427, 1500.963);
        ((GeneralPath) shape).curveTo(1202.2507, 1869.633, 803.47473, 2029.456, 535.72174, 1992.828);
        ((GeneralPath) shape).curveTo(247.78275, 1953.459, 131.92273, 1766.075, 148.62674, 1679.4761);
        ((GeneralPath) shape).curveTo(180.81573, 1512.3461, -235.76825, 1112.9841, -261.36926, 780.1921);
        ((GeneralPath) shape).curveTo(-290.43527, 402.74808, 5.792755, 286.56607, 230.55673, 330.04507);
        ((GeneralPath) shape).curveTo(368.79175, 184.93207, 842.6808, 193.73807, 1096.3438, 363.90106);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_10_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1305.0918, 903.909);
        ((GeneralPath) shape).curveTo(1097.5168, 1122.378, 771.3148, 972.437, 771.3148, 972.437);
        ((GeneralPath) shape).lineTo(555.74884, 1995.078);
        ((GeneralPath) shape).curveTo(822.9479, 2021.367, 1205.9038, 1860.565, 1351.5428, 1500.963);
        ((GeneralPath) shape).curveTo(1464.7528, 1221.468, 1531.1929, 832.477, 1284.0538, 532.00903);
        ((GeneralPath) shape).curveTo(1369.7388, 646.00604, 1388.6569, 815.908, 1305.0918, 903.90906);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x0E0E0E));
        g.fill(shape);

        // _0_0_10_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-127.21819, 1361.003);
        ((GeneralPath) shape).curveTo(-100.27619, 924.6531, -207.74919, 604.81006, 451.9948, 576.04205);
        ((GeneralPath) shape).curveTo(892.6508, 556.86304, 1072.6309, 1001.0741, 1027.0038, 1426.792);
        ((GeneralPath) shape).curveTo(1102.9648, 1353.241, 1198.5978, 1465.704, 1143.3447, 1588.996);
        ((GeneralPath) shape).curveTo(1100.6818, 1684.27, 1029.4468, 1690.924, 952.0457, 1719.7579);
        ((GeneralPath) shape).curveTo(828.49274, 2009.5929, 512.04175, 2152.031, 326.9737, 2151.509);
        ((GeneralPath) shape).curveTo(58.470703, 2150.759, -154.7793, 1829.253, -176.60031, 1654.328);
        ((GeneralPath) shape).curveTo(-189.0933, 1553.9, -132.82932, 1451.418, -127.21831, 1361.0029);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF9A867));
        g.fill(shape);

        // _0_0_10_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(462.7908, 1069.016);
        ((GeneralPath) shape).curveTo(449.2218, 1098.078, 518.6638, 1086.303, 622.0928, 1124.856);
        ((GeneralPath) shape).curveTo(706.0818, 1156.2009, 743.9178, 1235.656, 757.4858, 1206.627);
        ((GeneralPath) shape).curveTo(771.0218, 1177.565, 721.4438, 1112.9509, 640.06476, 1074.9519);
        ((GeneralPath) shape).curveTo(558.71674, 1036.986, 476.35876, 1039.9869, 462.79077, 1069.0159);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x1F1F1F));
        g.fill(shape);

        // _0_0_10_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1011.3478, 1478.914);
        ((GeneralPath) shape).curveTo(1094.8757, 1471.575, 1085.6128, 1576.83, 1054.6598, 1607.49);
        ((GeneralPath) shape).curveTo(1023.67377, 1638.117, 969.2028, 1656.35, 961.2448, 1635.736);
        ((GeneralPath) shape).curveTo(953.2888, 1615.1229, 1011.3478, 1478.914, 1011.3478, 1478.914);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE98948));
        g.fill(shape);

        // _0_0_10_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(204.6918, 1659.319);
        ((GeneralPath) shape).curveTo(210.39981, 1659.808, 216.49881, 1659.971, 222.76181, 1659.678);
        ((GeneralPath) shape).curveTo(228.63281, 1659.4819, 233.19981, 1654.459, 232.8728, 1648.556);
        ((GeneralPath) shape).curveTo(232.77881, 1642.685, 227.65381, 1638.021, 221.75081, 1638.4451);
        ((GeneralPath) shape).curveTo(170.6078, 1640.5321, 132.90181, 1608.7311, 116.03881, 1580.8761);
        ((GeneralPath) shape).curveTo(106.38381, 1564.633, 106.28681, 1554.6521, 107.39581, 1552.8582);
        ((GeneralPath) shape).curveTo(115.28881, 1543.0731, 150.97182, 1543.2031, 172.40181, 1546.8241);
        ((GeneralPath) shape).curveTo(177.06581, 1547.3461, 179.05582, 1546.1061, 181.59981, 1543.8561);
        ((GeneralPath) shape).curveTo(183.2628, 1542.2251, 221.91481, 1502.53, 234.14581, 1411.8551);
        ((GeneralPath) shape).curveTo(234.99382, 1406.0491, 230.88382, 1400.6351, 224.95181, 1399.8851);
        ((GeneralPath) shape).lineTo(224.62581, 1399.8522);
        ((GeneralPath) shape).curveTo(218.88081, 1399.3632, 213.72781, 1403.4072, 213.00981, 1409.0831);
        ((GeneralPath) shape).curveTo(203.77881, 1476.7961, 178.79482, 1513.5232, 169.7268, 1524.8412);
        ((GeneralPath) shape).curveTo(151.81981, 1523.8951, 106.840805, 1519.5571, 90.79381, 1539.4532);
        ((GeneralPath) shape).curveTo(83.06781, 1548.9122, 84.00981, 1565.1882, 93.533806, 1584.2042);
        ((GeneralPath) shape).curveTo(106.9718, 1610.9802, 144.6438, 1654.1653, 204.6918, 1659.3192);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_10_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(785.56885, 670.403);
        ((GeneralPath) shape).curveTo(785.56885, 670.403, 739.6769, 806.057, 346.73984, 700.606);
        ((GeneralPath) shape).curveTo(-59.832153, 591.50305, -79.27115, 800.317, -117.499176, 972.209);
        ((GeneralPath) shape).curveTo(-120.63017, 965.196, -266.00418, 675.916, 56.349823, 493.293);
        ((GeneralPath) shape).curveTo(468.66183, 259.65698, 785.56885, 670.403, 785.56885, 670.403);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x0E0E0E));
        g.fill(shape);

        // _0_0_10_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(72.85381, 1062.362);
        ((GeneralPath) shape).curveTo(88.640816, 1087.2161, 31.234814, 1081.28, -43.39319, 1119.083);
        ((GeneralPath) shape).curveTo(-103.99519, 1149.776, -119.09719, 1219.119, -134.8512, 1194.265);
        ((GeneralPath) shape).curveTo(-150.6382, 1169.411, -123.66319, 1112.625, -66.29019, 1076.191);
        ((GeneralPath) shape).curveTo(-8.949192, 1039.791, 57.099808, 1037.54, 72.853806, 1062.362);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x1F1F1F));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -1034.5892f, 228.20299f));

        // _0_0_10_0_0_11

        // _0_0_10_0_0_11_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1101.801, 1540.317);
        ((GeneralPath) shape).curveTo(1088.917, 1561.42, 1168.633, 1684.4191, 1282.047, 1684.81);
        ((GeneralPath) shape).curveTo(1419.198, 1685.2671, 1493.3359, 1560.604, 1482.475, 1556.071);
        ((GeneralPath) shape).curveTo(1477.061, 1553.8201, 1379.7639, 1565.4971, 1285.86, 1562.1381);
        ((GeneralPath) shape).curveTo(1192.15, 1558.7461, 1101.801, 1540.317, 1101.801, 1540.317);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(1444.21826171875, 1539.78662109375), new Point2D.Double(1428.718994140625, 1663.78076171875), new float[]{0, 0.4648f, 1}, new Color[]{new Color(0x784034), new Color(0x814638), new Color(0x91503F)}, NO_CYCLE, SRGB, new AffineTransform(0.9918f, -0.1281f, 0.1281f, 0.9918f, -337.637f, 211.9705f)));
        g.fill(shape);

        // _0_0_10_0_0_11_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1279.437, 1590.613);
        ((GeneralPath) shape).curveTo(1336.843, 1589.7981, 1379.535, 1571.532, 1400.312, 1560.4751);
        ((GeneralPath) shape).curveTo(1366.423, 1562.269, 1325.88, 1563.5741, 1285.859, 1562.1061);
        ((GeneralPath) shape).curveTo(1235.433, 1560.3121, 1186.116, 1554.1481, 1151.183, 1548.831);
        ((GeneralPath) shape).curveTo(1157.315, 1554.18, 1202.718, 1591.722, 1279.437, 1590.613);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE7DDD5));
        g.fill(shape);

        // _0_0_10_0_0_11_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1282.046, 1684.811);
        ((GeneralPath) shape).curveTo(1357.811, 1685.0391, 1414.271, 1647.1381, 1447.8671, 1612.336);
        ((GeneralPath) shape).curveTo(1344.112, 1615.4021, 1273.4961, 1653.5961, 1238.4331, 1678.451);
        ((GeneralPath) shape).curveTo(1252.2952, 1682.364, 1266.81, 1684.745, 1282.0461, 1684.811);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA95643));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_10_0_0_11

        // _0_0_10_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(717.30084, 686.092);
        ((GeneralPath) shape).curveTo(717.30084, 686.092, 659.20984, 715.349, 717.30084, 845.817);
        ((GeneralPath) shape).curveTo(775.39185, 976.28503, 847.96484, 1026.939, 891.54083, 1186.7631);
        ((GeneralPath) shape).curveTo(935.1168, 1346.5541, 881.6248, 1548.1271, 939.1618, 1559.0541);
        ((GeneralPath) shape).curveTo(997.5138, 1570.144, 995.0388, 1494.8961, 1044.8738, 1409.7991);
        ((GeneralPath) shape).curveTo(1066.9558, 1329.7241, 1132.0588, 1041.8141, 993.1758, 816.78906);
        ((GeneralPath) shape).curveTo(840.72375, 569.7151, 717.3008, 686.09204, 717.3008, 686.09204);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x37404C));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -1034.5892f, 228.20299f));

        // _0_0_10_0_0_13

        // _0_0_10_0_0_13_0

        // _0_0_10_0_0_13_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1481.495, 1057.422);
        ((GeneralPath) shape).curveTo(1443.594, 1090.43, 1443.692, 1187.27, 1456.673, 1202.437);
        ((GeneralPath) shape).curveTo(1491.475, 1242.98, 1699.833, 1243.697, 1724.491, 1175.071);
        ((GeneralPath) shape).curveTo(1724.491, 1175.071, 1701.039, 1103.672, 1644.5139, 1081.786);
        ((GeneralPath) shape).curveTo(1588.022, 1059.934, 1481.4949, 1057.422, 1481.4949, 1057.422);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD7CAC1));
        g.fill(shape);

        // _0_0_10_0_0_13_0_1

        // _0_0_10_0_0_13_0_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1670.413, 1164.993);
        ((GeneralPath) shape).curveTo(1669.141, 1236.1311, 1611.1799, 1291.025, 1540.989, 1287.6001);
        ((GeneralPath) shape).curveTo(1470.765, 1284.175, 1414.892, 1223.7681, 1416.196, 1152.6311);
        ((GeneralPath) shape).curveTo(1417.468, 1081.4932, 1475.4291, 1026.6311, 1545.6531, 1030.024);
        ((GeneralPath) shape).curveTo(1615.8451, 1033.4491, 1671.718, 1093.8881, 1670.4131, 1164.993);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(1539.459716796875, 1053.8062744140625), new Point2D.Double(1512.0213623046875, 1273.3135986328125), new float[]{0, 0.4393f, 1}, new Color[]{new Color(0x723B2F), new Color(0x7B4132), new Color(0x8D4C39)}, NO_CYCLE, SRGB, new AffineTransform(1.1115f, 0.0513f, -0.0195f, 0.9998f, -131.1052f, -75.0197f)));
        g.fill(shape);

        // _0_0_10_0_0_13_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1729.878, 1191.609);
        ((GeneralPath) shape).curveTo(1729.878, 1191.609, 1690.375, 1098.814, 1625.01, 1072.6221);
        ((GeneralPath) shape).curveTo(1532.545, 1035.5371, 1461.175, 1081.9501, 1457.852, 1070.1431);
        ((GeneralPath) shape).curveTo(1456.0221, 1063.7501, 1547.0231, 1003.18005, 1640.145, 1046.3981);
        ((GeneralPath) shape).curveTo(1709.981, 1078.8191, 1760.566, 1166.9501, 1729.878, 1191.6091);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E261B));
        g.fill(shape);

        // _0_0_10_0_0_13_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1788.095, 1149.924);
        ((GeneralPath) shape).lineTo(1712.13, 1154.654);
        ((GeneralPath) shape).lineTo(1729.878, 1191.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_10_0_0_13
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -1034.5892f, 228.20299f));

        // _0_0_10_0_0_14

        // _0_0_10_0_0_14_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(886.076, 1100.575);
        ((GeneralPath) shape).lineTo(930.496, 1110.262);
        ((GeneralPath) shape).lineTo(930.79, 1160.786);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_10_0_0_14_1

        // _0_0_10_0_0_14_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(958.09, 1036.776);
        ((GeneralPath) shape).curveTo(922.01605, 1070.828, 920.67804, 1151.947, 931.89905, 1168.712);
        ((GeneralPath) shape).curveTo(961.90704, 1213.593, 1142.05, 1221.6171, 1167.5901, 1148.816);
        ((GeneralPath) shape).curveTo(1167.5901, 1148.816, 1149.2961, 1071.024, 1098.6051, 1045.42);
        ((GeneralPath) shape).curveTo(1047.9501, 1019.81506, 958.0901, 1036.776, 958.0901, 1036.776);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD7CAC1));
        g.fill(shape);

        // _0_0_10_0_0_14_1_1

        // _0_0_10_0_0_14_1_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1134.157, 1144.021);
        ((GeneralPath) shape).curveTo(1129.949, 1220.41, 1063.802, 1276.609, 986.435, 1269.499);
        ((GeneralPath) shape).curveTo(909.035, 1262.421, 849.704, 1194.741, 853.912, 1118.352);
        ((GeneralPath) shape).curveTo(858.12, 1041.93, 924.3, 985.76404, 1001.667, 992.84204);
        ((GeneralPath) shape).curveTo(1079.067, 999.91907, 1138.397, 1067.599, 1134.157, 1144.021);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(1087.9486083984375, 1063.387451171875), new Point2D.Double(1058.5172119140625, 1298.8389892578125), new float[]{0, 0.4393f, 1}, new Color[]{new Color(0x723B2F), new Color(0x7B4132), new Color(0x8D4C39)}, NO_CYCLE, SRGB, new AffineTransform(1.3404f, 0.1104f, -0.0602f, 0.9982f, -375.3308f, -158.0485f)));
        g.fill(shape);

        // _0_0_10_0_0_14_1_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(927.724, 1158.503);
        ((GeneralPath) shape).curveTo(927.724, 1158.503, 891.16, 1069.1321, 959.754, 1025.2301);
        ((GeneralPath) shape).curveTo(1051.31, 966.6501, 1154.8401, 1065.5771, 1148.248, 1070.5352);
        ((GeneralPath) shape).curveTo(1141.6271, 1075.4932, 1071.826, 1008.0082, 981.51, 1047.7362);
        ((GeneralPath) shape).curveTo(926.58203, 1071.9373, 927.724, 1158.5032, 927.724, 1158.5032);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E261B));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_10_0_0_14

        // _0_0_10_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-99.331184, 544.371);
        ((GeneralPath) shape).curveTo(-263.6882, 610.779, -264.79718, 740.75793, -238.3122, 877.13);
        ((GeneralPath) shape).curveTo(-214.9262, 964.446, -171.8062, 1054.1431, -122.3912, 1141.491);
        ((GeneralPath) shape).lineTo(-120.532196, 1141.002);
        ((GeneralPath) shape).curveTo(-117.1402, 967.28394, -108.5292, 822.88794, -15.049194, 723.308);
        ((GeneralPath) shape).curveTo(46.759804, 669.001, 152.5048, 648.485, 346.7388, 700.607);
        ((GeneralPath) shape).curveTo(522.4178, 747.739, 628.71277, 746.727, 692.5448, 731.169);
        ((GeneralPath) shape).lineTo(693.4908, 730.223);
        ((GeneralPath) shape).curveTo(322.0478, 763.13403, 212.12878, 418.502, -99.33124, 544.37103);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x37404C));
        g.fill(shape);

        // _0_0_10_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(794.9298, 981.961);
        ((GeneralPath) shape).curveTo(831.2328, 1038.062, 866.2628, 1094.066, 891.5418, 1186.731);
        ((GeneralPath) shape).curveTo(935.1178, 1346.554, 881.6258, 1548.095, 939.1628, 1559.054);
        ((GeneralPath) shape).curveTo(997.5148, 1570.1439, 995.0398, 1494.864, 1044.8748, 1409.799);
        ((GeneralPath) shape).curveTo(1060.6288, 1352.687, 1098.2037, 1189.8949, 1068.1307, 1019.53595);
        ((GeneralPath) shape).curveTo(950.5458, 1032.9409, 841.34375, 999.2479, 794.92975, 981.96094);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_10
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -2.1745648E-6f, 115.06848f));

        // _0_0_11

        // _0_0_11_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3509.834, 689.476);
        ((GeneralPath) shape).curveTo(3516.93, 735.226, 3559.795, 766.067, 3605.567, 758.34705);
        ((GeneralPath) shape).curveTo(3651.346, 750.6351, 3682.701, 707.291, 3675.605, 661.541);
        ((GeneralPath) shape).curveTo(3668.502, 615.791, 3625.644, 584.958, 3579.865, 592.67004);
        ((GeneralPath) shape).curveTo(3534.093, 600.382, 3502.738, 643.7261, 3509.834, 689.4761);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEC9458));
        g.fill(shape);

        // _0_0_11_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3580.075, 718.258);
        ((GeneralPath) shape).curveTo(3601.399, 713.518, 3615.076, 692.404, 3610.626, 671.109);
        ((GeneralPath) shape).curveTo(3606.284, 650.336, 3586.265, 637.347, 3565.499, 641.102);
        ((GeneralPath) shape).curveTo(3570.638, 637.311, 3576.509, 634.39, 3583.127, 632.919);
        ((GeneralPath) shape).curveTo(3608.306, 627.323, 3632.979, 643.175, 3638.241, 668.31903);
        ((GeneralPath) shape).curveTo(3643.4958, 693.47003, 3627.347, 718.39606, 3602.167, 723.999);
        ((GeneralPath) shape).curveTo(3590.208, 726.65204, 3578.509, 724.195, 3568.804, 718.48303);
        ((GeneralPath) shape).curveTo(3572.523, 718.744, 3576.242, 719.11304, 3580.075, 718.25806);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1652F));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_11

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3123.7627, 153.07722);
        ((GeneralPath) shape).curveTo(3123.7627, 153.07722, 3492.7637, 142.87222, 3545.2466, 629.08923);
        ((GeneralPath) shape).lineTo(3619.9246, 613.83923);
        ((GeneralPath) shape).curveTo(3619.9246, 613.83923, 3634.4636, 190.55725, 3293.6946, 141.69125);
        ((GeneralPath) shape).lineTo(3123.7627, 153.07726);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xC01F1F));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -40.612404f, 121.83722f));

        // _0_0_13

        // _0_0_13_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3798.837, 718.722);
        ((GeneralPath) shape).curveTo(3772.9758, 832.45197, 3683.397, 909.04297, 3598.739, 889.784);
        ((GeneralPath) shape).curveTo(3514.089, 870.526, 3466.425, 762.71, 3492.279, 648.98);
        ((GeneralPath) shape).curveTo(3518.133, 535.25, 3607.719, 458.667, 3692.37, 477.925);
        ((GeneralPath) shape).curveTo(3777.028, 497.184, 3824.6912, 604.992, 3798.8372, 718.722);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_13_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3805.477, 713.532);
        ((GeneralPath) shape).curveTo(3783.465, 810.345, 3707.215, 875.534, 3635.154, 859.139);
        ((GeneralPath) shape).curveTo(3563.101, 842.74396, 3522.5261, 750.97595, 3544.531, 654.17);
        ((GeneralPath) shape).curveTo(3566.543, 557.364, 3642.793, 492.175, 3714.854, 508.563);
        ((GeneralPath) shape).curveTo(3786.907, 524.958, 3827.482, 616.727, 3805.477, 713.532);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.4f * origAlpha));

        // _0_0_13_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3690.754, 660.382);
        ((GeneralPath) shape).curveTo(3659.9639, 713.713, 3612.344, 743.87305, 3584.395, 727.739);
        ((GeneralPath) shape).curveTo(3556.447, 711.60504, 3558.751, 655.287, 3589.541, 601.948);
        ((GeneralPath) shape).curveTo(3620.331, 548.609, 3667.951, 518.45703, 3695.9, 534.591);
        ((GeneralPath) shape).curveTo(3723.8489, 550.725, 3721.544, 607.043, 3690.754, 660.382);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_13_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3625.586, 780.026);
        ((GeneralPath) shape).curveTo(3630.1519, 797.066, 3624.905, 813.28, 3613.859, 816.237);
        ((GeneralPath) shape).curveTo(3602.8118, 819.201, 3590.158, 807.786, 3585.583, 790.753);
        ((GeneralPath) shape).curveTo(3581.017, 773.713, 3586.264, 757.49896, 3597.311, 754.534);
        ((GeneralPath) shape).curveTo(3608.357, 751.577, 3621.012, 762.986, 3625.586, 780.026);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_13
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));

        // _0_0_14
        shape = new Rectangle2D.Double(3598.774658203125, 993.1034545898438, 35.42100143432617, 51.77299880981445);
        g.fill(shape);

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3305.525, 2615.52);
        ((GeneralPath) shape).lineTo(3303.401, 2604.865);
        ((GeneralPath) shape).curveTo(3651.013, 2533.942, 3612.786, 945.978, 3612.366, 929.94495);
        ((GeneralPath) shape).lineTo(3623.2668, 929.6619);
        ((GeneralPath) shape).curveTo(3625.035, 995.4899, 3662.0508, 2542.786, 3305.525, 2615.52);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_16

        // _0_0_16_0

        // _0_0_16_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3948.271, 1385.409);
        ((GeneralPath) shape).curveTo(3888.619, 1404.972, 3857.293, 1614.3771, 3794.271, 1925.6171);
        ((GeneralPath) shape).curveTo(3772.853, 2031.425, 3712.389, 2232.342, 3712.389, 2232.342);
        ((GeneralPath) shape).curveTo(3689.565, 2420.2642, 3700.742, 2558.079, 3794.271, 2572.655);
        ((GeneralPath) shape).curveTo(4082.412, 2617.55, 4293.237, 1272.274, 3948.271, 1385.409);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFAB276));
        g.fill(shape);

        // _0_0_16_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3794.271, 2572.655);
        ((GeneralPath) shape).curveTo(3523.163, 2539.705, 3408.027, 2352.248, 3093.293, 2251.419);
        ((GeneralPath) shape).lineTo(3066.939, 2160.644);
        ((GeneralPath) shape).curveTo(3230.906, 2161.499, 3609.677, 2235.981, 3712.434, 2232.342);
        ((GeneralPath) shape).curveTo(3879.0232, 2289.1821, 3846.892, 2579.048, 3794.271, 2572.655);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_16_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3066.939, 2160.644);
        ((GeneralPath) shape).curveTo(2977.483, 2161.499, 2892.898, 2189.2231, 2857.984, 2199.885);
        ((GeneralPath) shape).curveTo(2823.0698, 2210.547, 2794.578, 2237.082, 2768.086, 2259.486);
        ((GeneralPath) shape).curveTo(2741.594, 2281.882, 2710.435, 2321.363, 2723.155, 2332.2642);
        ((GeneralPath) shape).curveTo(2735.868, 2343.1582, 2774.0151, 2299.5613, 2793.998, 2283.2092);
        ((GeneralPath) shape).curveTo(2813.981, 2266.8652, 2848.4531, 2247.6353, 2852.092, 2249.4553);
        ((GeneralPath) shape).curveTo(2855.7231, 2251.2673, 2821.5781, 2277.1572, 2800.007, 2297.7424);
        ((GeneralPath) shape).curveTo(2784.96, 2312.1084, 2745.291, 2373.6594, 2757.309, 2383.4224);
        ((GeneralPath) shape).curveTo(2770.8271, 2394.4104, 2803.6611, 2345.8484, 2821.8901, 2325.1042);
        ((GeneralPath) shape).curveTo(2837.8281, 2306.9692, 2874.7292, 2274.9832, 2879.853, 2279.0862);
        ((GeneralPath) shape).curveTo(2884.985, 2283.1882, 2848.222, 2319.2913, 2838.988, 2332.6282);
        ((GeneralPath) shape).curveTo(2829.762, 2345.965, 2808.916, 2383.6692, 2820.324, 2396.027);
        ((GeneralPath) shape).curveTo(2831.74, 2408.385, 2861.624, 2360.134, 2873.931, 2346.798);
        ((GeneralPath) shape).curveTo(2886.2449, 2333.4622, 2912.853, 2295.6921, 2919.0068, 2296.7212);
        ((GeneralPath) shape).curveTo(2925.161, 2297.7432, 2898.4878, 2334.6792, 2892.3337, 2350.0671);
        ((GeneralPath) shape).curveTo(2886.1797, 2365.455, 2884.4478, 2401.6301, 2895.7327, 2402.6592);
        ((GeneralPath) shape).curveTo(2907.0176, 2403.6812, 2915.1138, 2370.695, 2924.3486, 2356.329);
        ((GeneralPath) shape).curveTo(2933.5747, 2341.9712, 2959.7766, 2313.5, 2959.7766, 2313.5);
        ((GeneralPath) shape).curveTo(2959.7766, 2313.5, 3026.5315, 2303.193, 3093.2937, 2251.42);
        ((GeneralPath) shape).curveTo(3101.9756, 2220.76, 3090.7417, 2190.557, 3066.9387, 2160.644);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_16_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3763.452, 2052.329);
        ((GeneralPath) shape).lineTo(3738.692, 2142.0461);
        ((GeneralPath) shape).lineTo(4031.001, 2283.166);
        ((GeneralPath) shape).curveTo(4044.729, 2244.229, 4056.13, 2203.944, 4066.72, 2163.522);
        ((GeneralPath) shape).lineTo(3763.452, 2052.3289);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEC9458));
        g.fill(shape);

        // _0_0_16_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3976.307, 2414.313);
        ((GeneralPath) shape).curveTo(3830.3948, 2597.494, 3594.8608, 2449.357, 3416.203, 2365.867);
        ((GeneralPath) shape).curveTo(3203.492, 2266.459, 3093.292, 2251.419, 3093.292, 2251.419);
        ((GeneralPath) shape).curveTo(3408.026, 2352.247, 3523.162, 2539.705, 3794.27, 2572.655);
        ((GeneralPath) shape).curveTo(3861.156, 2583.071, 3923.7441, 2518.0771, 3976.3071, 2414.313);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3962.47, 1289.147);
        ((GeneralPath) shape).curveTo(4209.166, 1378.523, 4176.463, 1829.051, 4125.603, 2185.114);
        ((GeneralPath) shape).lineTo(3689.608, 2025.25);
        ((GeneralPath) shape).curveTo(3689.608, 2025.25, 3862.4028, 1252.9, 3962.47, 1289.147);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD7B9CA));
        g.fill(shape);

        // _0_0_18

        // _0_0_18_0
        shape = new Rectangle2D.Double(4426.25390625, 2562.282958984375, 87.2239990234375, 2437.717041015625);
        g.setPaint(new Color(0xCB7441));
        g.fill(shape);

        // _0_0_18_1
        shape = new Rectangle2D.Double(3381.8759765625, 2562.282958984375, 51.895999908447266, 2437.717041015625);
        g.fill(shape);

        // _0_0_18_2
        shape = new Rectangle2D.Double(3329.987060546875, 2562.282958984375, 51.888999938964844, 2437.717041015625);
        g.setPaint(new Color(0xB04D26));
        g.fill(shape);

        // _0_0_18_3
        shape = new Rectangle2D.Double(3331.60302734375, 2569.6689453125, 1181.875, 254.1179962158203);
        g.setPaint(new Color(0xCB7441));
        g.fill(shape);

        // _0_0_18_4
        shape = new Rectangle2D.Double(1222.76904296875, 2562.282958984375, 87.21600341796875, 2437.717041015625);
        g.setPaint(new Color(0xA13E23));
        g.fill(shape);

        // _0_0_18_5
        shape = new Rectangle2D.Double(1858.405029296875, 2562.282958984375, 87.21600341796875, 2437.717041015625);
        g.fill(shape);

        // _0_0_18_6
        shape = new Rectangle2D.Double(175.1439971923828, 2562.282958984375, 87.2229995727539, 2437.717041015625);
        g.setPaint(new Color(0xB04D26));
        g.fill(shape);

        // _0_0_18_7
        shape = new Rectangle2D.Double(1349.748046875, 2562.282958984375, 87.21700286865234, 2437.717041015625);
        g.fill(shape);

        // _0_0_18_8
        shape = new Rectangle2D.Double(175.1439971923828, 2569.6689453125, 3206.73193359375, 254.1179962158203);
        g.fill(shape);

        // _0_0_18_9
        shape = new Rectangle2D.Double(175.0780029296875, 2569.595947265625, 1261.886962890625, 2329.5830078125);
        g.fill(shape);

        // _0_0_18_10
        shape = new Rectangle2D.Double(1424.926025390625, 2569.589111328125, 520.6959838867188, 2329.5830078125);
        g.setPaint(new Color(0xA13E23));
        g.fill(shape);

        // _0_0_18_11
        shape = new Rectangle2D.Double(175.1439971923828, 2562.97900390625, 3206.73193359375, 153.7969970703125);
        g.fill(shape);

        // _0_0_18_12
        shape = new Rectangle2D.Double(3381.8759765625, 2569.6689453125, 1131.60205078125, 147.10699462890625);
        g.setPaint(new Color(0xB7572B));
        g.fill(shape);

        // _0_0_18_13
        shape = new Rectangle2D.Double(3349.506103515625, 2482.096923828125, 1319.654052734375, 166.656005859375);
        g.setPaint(new Color(0xDA8150));
        g.fill(shape);

        // _0_0_18_14
        shape = new Rectangle2D.Double(0, 2482.096923828125, 3383.5, 166.656005859375);
        g.setPaint(new Color(0xBF5B33));
        g.fill(shape);

        // _0_0_18_15
        shape = new Rectangle2D.Double(0, 2482.096923828125, 4669.16015625, 34.44300079345703);
        g.setPaint(new Color(0xF5905F));
        g.fill(shape);

        // _0_0_19

        // _0_0_19_0

        // _0_0_19_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3033.714, 2439.116);
        ((GeneralPath) shape).lineTo(3033.714, 2482.576);
        ((GeneralPath) shape).lineTo(1131.682, 2482.576);
        ((GeneralPath) shape).lineTo(1131.682, 2409.138);
        ((GeneralPath) shape).lineTo(2654.892, 2409.138);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x33323D));
        g.fill(shape);

        // _0_0_19_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3033.714, 2439.116);
        ((GeneralPath) shape).lineTo(3033.714, 2482.576);
        ((GeneralPath) shape).lineTo(2374.267, 2482.576);
        ((GeneralPath) shape).lineTo(2374.267, 2409.138);
        ((GeneralPath) shape).lineTo(2654.892, 2409.138);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x767283));
        g.fill(shape);

        // _0_0_19_1

        // _0_0_19_1_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1460.673, 2429.324);
        ((GeneralPath) shape).lineTo(1707.167, 2429.324);
        ((GeneralPath) shape).lineTo(1707.167, 2482.163);
        ((GeneralPath) shape).lineTo(1087.287, 2482.163);
        ((GeneralPath) shape).lineTo(1087.287, 2429.324);
        ((GeneralPath) shape).lineTo(1331.809, 2429.324);
        ((GeneralPath) shape).lineTo(1331.809, 2207.46);
        ((GeneralPath) shape).lineTo(786.078, 2207.46);
        ((GeneralPath) shape).lineTo(487.957, 2207.46);
        ((GeneralPath) shape).lineTo(487.957, 857.726);
        ((GeneralPath) shape).lineTo(2300.866, 857.726);
        ((GeneralPath) shape).lineTo(2300.866, 2207.46);
        ((GeneralPath) shape).lineTo(2027.221, 2207.46);
        ((GeneralPath) shape).lineTo(1460.673, 2207.46);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_19_1_1

        // _0_0_19_1_1_0
        shape = new Rectangle2D.Double(487.9570007324219, 857.7260131835938, 1746.93701171875, 1350.531005859375);
        g.setPaint(new Color(0x33323D));
        g.fill(shape);

        // _0_0_19_1_1_1
        shape = new Rectangle2D.Double(1263.0679931640625, 2011.52197265625, 149.67999267578125, 442.4530029296875);
        g.setPaint(new Color(0x2D2D38));
        g.fill(shape);

        // _0_0_19_1_1_2
        shape = new Rectangle2D.Double(1018.5460205078125, 2430.12109375, 638.7310180664062, 52.04100036621094);
        g.fill(shape);

        // _0_0_19_1_1_3

        // _0_0_19_1_1_3_0
        shape = new Rectangle2D.Double(2020.1099853515625, 1743.885986328125, 214.7830047607422, 49.33100128173828);
        g.setPaint(new Color(0x454551));
        g.fill(shape);

        // _0_0_19_1_1_3_1
        shape = new Rectangle2D.Double(2020.1099853515625, 1853.947998046875, 214.7830047607422, 49.33100128173828);
        g.fill(shape);

        // _0_0_19_1_1_3_2
        shape = new Rectangle2D.Double(2020.1099853515625, 1964.010009765625, 214.7830047607422, 49.33100128173828);
        g.fill(shape);

        // _0_0_19_1_1_3_3
        shape = new Rectangle2D.Double(2020.1099853515625, 2074.06591796875, 214.7830047607422, 49.3380012512207);
        g.fill(shape);

        // _0_0_19_1_1_4

        // _0_0_19_1_1_4_0
        shape = new Rectangle2D.Double(487.9570007324219, 1743.885986328125, 179.00599670410156, 49.33100128173828);
        g.fill(shape);

        // _0_0_19_1_1_4_1
        shape = new Rectangle2D.Double(487.9570007324219, 1853.947998046875, 179.00599670410156, 49.33100128173828);
        g.fill(shape);

        // _0_0_19_1_1_4_2
        shape = new Rectangle2D.Double(487.9570007324219, 1964.010009765625, 179.00599670410156, 49.33100128173828);
        g.fill(shape);

        // _0_0_19_1_1_4_3
        shape = new Rectangle2D.Double(487.9570007324219, 2074.06591796875, 179.00599670410156, 49.3380012512207);
        g.fill(shape);

        // _0_0_19_1_1_5
        shape = new Rectangle2D.Double(766.2550048828125, 1462.7459716796875, 1143.3079833984375, 744.9739990234375);
        g.setPaint(new Color(0x2D2D38));
        g.fill(shape);

        // _0_0_19_1_1_6
        shape = new Rectangle2D.Double(1822.968994140625, 1462.7459716796875, 86.59300231933594, 744.9739990234375);
        g.setPaint(new Color(0x454551));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0

    }
}

