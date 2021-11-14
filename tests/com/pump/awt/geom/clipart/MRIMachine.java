package com.pump.awt.geom.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import static java.awt.Color.WHITE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/333555/mri-machine
 * </p>
 */
public class MRIMachine implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public MRIMachine() {
        this(1483, 977);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public MRIMachine(int width, int height) {
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
        double coef = Math.min((double) width / (double) 1483, (double) height / (double) 977);

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

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.3333333f, 0, 0, -1.3333333f, 370.56265f, 937.8673f));

        // _0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.1f, 0, 0, 0.1f, 0, 0));

        // _0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(2, 0, 0, 2, -2779.22f, -3372.395f));

        // _0_0_0_0

        // _0_0_0_0_0

        // _0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(876.055, 1594.97);
        ((GeneralPath) shape).lineTo(4830.73, 1594.97);
        ((GeneralPath) shape).lineTo(4830.73, 4924.8896);
        ((GeneralPath) shape).lineTo(876.05493, 4924.8896);
        ((GeneralPath) shape).lineTo(876.05493, 1594.9697);

        g.setPaint(new Color(0xEFF2F4));
        g.fill(shape);

        // _0_0_0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2779.22, 1541.59);
        ((GeneralPath) shape).curveTo(4309.98, 1541.59, 5558.44, 1574.86, 5558.44, 1615.6499);
        ((GeneralPath) shape).curveTo(5558.44, 1656.45, 4309.98, 1689.7299, 2779.22, 1689.7299);
        ((GeneralPath) shape).curveTo(1248.48, 1689.73, 0.0, 1656.45, 0.0, 1615.65);
        ((GeneralPath) shape).curveTo(0.0, 1574.86, 1248.48, 1541.5901, 2779.22, 1541.5901);

        g.setPaint(new Color(0xADC4CD));
        g.fill(shape);

        // _0_0_0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4862.84, 5203.2);
        ((GeneralPath) shape).curveTo(5143.8896, 5203.2, 5373.82, 4973.25, 5373.82, 4692.21);
        ((GeneralPath) shape).lineTo(5373.82, 2126.65);
        ((GeneralPath) shape).curveTo(5373.82, 1845.5798, 5143.8896, 1615.6499, 4862.84, 1615.6499);
        ((GeneralPath) shape).lineTo(3362.1199, 1615.6499);
        ((GeneralPath) shape).lineTo(3362.1199, 5203.2);
        ((GeneralPath) shape).lineTo(4862.84, 5203.2);

        g.setPaint(new Color(0xA6E0F8));
        g.fill(shape);

        // _0_0_0_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3362.12, 5203.2);
        ((GeneralPath) shape).lineTo(3362.12, 5203.2);
        ((GeneralPath) shape).curveTo(3643.1702, 5203.2, 3873.1, 4973.2603, 3873.1, 4692.21);
        ((GeneralPath) shape).lineTo(3873.1, 2126.65);
        ((GeneralPath) shape).curveTo(3873.1, 1845.5798, 3643.1702, 1615.6499, 3362.12, 1615.6499);
        ((GeneralPath) shape).lineTo(3362.12, 1615.6499);
        ((GeneralPath) shape).curveTo(3081.07, 1615.6499, 2851.1301, 1845.5798, 2851.1301, 2126.65);
        ((GeneralPath) shape).lineTo(2851.1301, 4692.21);
        ((GeneralPath) shape).curveTo(2851.1301, 4973.26, 3081.07, 5203.2, 3362.12, 5203.2);

        g.setPaint(new Color(0xC5ECFB));
        g.fill(shape);

        // _0_0_0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3371.52, 3174.33);
        ((GeneralPath) shape).lineTo(281.17603, 3174.33);
        ((GeneralPath) shape).curveTo(186.74603, 3174.33, 109.49202, 3097.09, 109.49202, 3002.6501);
        ((GeneralPath) shape).lineTo(109.49202, 3002.6501);
        ((GeneralPath) shape).curveTo(109.49202, 2908.2202, 186.74602, 2830.9602, 281.17603, 2830.9602);
        ((GeneralPath) shape).lineTo(3371.52, 2830.9602);
        ((GeneralPath) shape).lineTo(3371.52, 3174.33);

        g.setPaint(new Color(0x8C9399));
        g.fill(shape);

        // _0_0_0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3362.11, 4395.32);
        ((GeneralPath) shape).lineTo(3362.12, 4395.32);
        ((GeneralPath) shape).curveTo(3532.1501, 4395.32, 3671.28, 4256.1997, 3671.28, 4086.15);
        ((GeneralPath) shape).lineTo(3671.28, 2732.69);
        ((GeneralPath) shape).curveTo(3671.28, 2562.66, 3532.15, 2423.53, 3362.12, 2423.53);
        ((GeneralPath) shape).lineTo(3362.11, 2423.53);
        ((GeneralPath) shape).curveTo(3192.08, 2423.53, 3052.9502, 2562.6602, 3052.9502, 2732.69);
        ((GeneralPath) shape).lineTo(3052.9502, 4086.15);
        ((GeneralPath) shape).curveTo(3052.9502, 4256.1997, 3192.08, 4395.32, 3362.11, 4395.32);

        g.setPaint(new Color(0x80C5EC));
        g.fill(shape);

        // _0_0_0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3671.28, 3174.33);
        ((GeneralPath) shape).lineTo(888.83203, 3174.33);
        ((GeneralPath) shape).curveTo(803.81604, 3174.33, 734.25806, 3104.78, 734.25806, 3019.76);
        ((GeneralPath) shape).lineTo(734.25806, 3019.75);
        ((GeneralPath) shape).curveTo(734.25806, 2934.73, 803.81604, 2865.17, 888.83203, 2865.17);
        ((GeneralPath) shape).lineTo(3671.28, 2865.17);
        ((GeneralPath) shape).lineTo(3671.28, 3174.3298);

        g.setPaint(new Color(0x596F80));
        g.fill(shape);

        // _0_0_0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1201.21, 1615.65);
        ((GeneralPath) shape).lineTo(1349.35, 1615.65);
        ((GeneralPath) shape).lineTo(1349.35, 2782.4102);
        ((GeneralPath) shape).lineTo(1201.21, 2782.4102);
        ((GeneralPath) shape).lineTo(1201.21, 1615.6501);

        g.setPaint(new Color(0x80C5EC));
        g.fill(shape);

        // _0_0_0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1119.09, 1615.65);
        ((GeneralPath) shape).lineTo(1431.46, 1615.65);
        ((GeneralPath) shape).lineTo(1431.46, 1767.01);
        ((GeneralPath) shape).lineTo(1119.09, 1767.01);
        ((GeneralPath) shape).lineTo(1119.09, 1615.65);

        g.setPaint(new Color(0xC5ECFB));
        g.fill(shape);

        // _0_0_0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(503.992, 1615.65);
        ((GeneralPath) shape).lineTo(652.133, 1615.65);
        ((GeneralPath) shape).lineTo(652.133, 2782.4102);
        ((GeneralPath) shape).lineTo(503.992, 2782.4102);
        ((GeneralPath) shape).lineTo(503.992, 1615.6501);

        g.setPaint(new Color(0x80C5EC));
        g.fill(shape);

        // _0_0_0_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(421.875, 1615.65);
        ((GeneralPath) shape).lineTo(734.254, 1615.65);
        ((GeneralPath) shape).lineTo(734.254, 1767.01);
        ((GeneralPath) shape).lineTo(421.87503, 1767.01);
        ((GeneralPath) shape).lineTo(421.87503, 1615.65);

        g.setPaint(new Color(0xC5ECFB));
        g.fill(shape);

        // _0_0_0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(638.453, 2138.15);
        ((GeneralPath) shape).lineTo(1201.21, 2138.15);
        ((GeneralPath) shape).lineTo(1201.21, 2017.3999);
        ((GeneralPath) shape).lineTo(638.45294, 2017.3999);
        ((GeneralPath) shape).curveTo(605.2379, 2017.3999, 578.0629, 2044.57, 578.0629, 2077.77);
        ((GeneralPath) shape).lineTo(578.0629, 2077.77);
        ((GeneralPath) shape).curveTo(578.0629, 2110.97, 605.2379, 2138.15, 638.45294, 2138.15);

        g.setPaint(new Color(0x5099D2));
        g.fill(shape);

        // _0_0_0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(394.824, 2782.39);
        ((GeneralPath) shape).lineTo(3671.28, 2782.39);
        ((GeneralPath) shape).lineTo(3671.28, 2865.17);
        ((GeneralPath) shape).lineTo(353.43408, 2865.17);
        ((GeneralPath) shape).lineTo(353.43408, 2823.78);
        ((GeneralPath) shape).curveTo(353.43408, 2801.0, 372.05508, 2782.3901, 394.8241, 2782.3901);

        g.setPaint(new Color(0x47515B));
        g.fill(shape);

        // _0_0_0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4111.35, 2883.97);
        ((GeneralPath) shape).lineTo(5148.3203, 2883.97);
        ((GeneralPath) shape).lineTo(5148.3203, 4059.43);
        ((GeneralPath) shape).lineTo(4111.3506, 4059.43);
        ((GeneralPath) shape).lineTo(4111.3506, 2883.97);

        g.setPaint(new Color(0x8FD3F4));
        g.fill(shape);

        // _0_0_0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4233.72, 3685.86);
        ((GeneralPath) shape).lineTo(5025.96, 3685.86);
        ((GeneralPath) shape).lineTo(5025.96, 3959.59);
        ((GeneralPath) shape).lineTo(4233.7197, 3959.59);
        ((GeneralPath) shape).lineTo(4233.7197, 3685.86);

        g.setPaint(new Color(0x4288C3));
        g.fill(shape);

        // _0_0_0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2153.43, 3576.2);
        ((GeneralPath) shape).lineTo(2613.0498, 3576.2);
        ((GeneralPath) shape).curveTo(2763.9397, 3576.2, 2794.0498, 3478.8298, 2866.4297, 3433.95);
        ((GeneralPath) shape).curveTo(2866.4998, 3433.91, 2866.6196, 3433.8398, 2866.6797, 3433.79);
        ((GeneralPath) shape).curveTo(2901.7297, 3412.11, 2948.5896, 3408.56, 3020.0398, 3424.6501);
        ((GeneralPath) shape).lineTo(3020.0398, 3257.7803);
        ((GeneralPath) shape).lineTo(2882.0098, 3174.3303);
        ((GeneralPath) shape).lineTo(2167.7397, 3174.3303);
        ((GeneralPath) shape).lineTo(2153.4297, 3576.2002);

        g.setPaint(new Color(0xF68656));
        g.fill(shape);

        // _0_0_0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2866.68, 3433.79);
        ((GeneralPath) shape).curveTo(2901.74, 3412.11, 2948.5999, 3408.56, 3020.04, 3424.6501);
        ((GeneralPath) shape).lineTo(3020.04, 3306.33);
        ((GeneralPath) shape).lineTo(3010.43, 3307.29);
        ((GeneralPath) shape).curveTo(2932.75, 3315.05, 2869.3298, 3355.68, 2866.68, 3433.79);

        g.setPaint(new Color(0xF16D39));
        g.fill(shape);

        // _0_0_0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3074.83, 3523.68);
        ((GeneralPath) shape).lineTo(3354.36, 3495.72);
        ((GeneralPath) shape).lineTo(3354.36, 3204.22);
        ((GeneralPath) shape).lineTo(3074.83, 3232.17);
        ((GeneralPath) shape).curveTo(2995.4502, 3240.1099, 2930.51, 3312.19, 2930.51, 3392.3599);
        ((GeneralPath) shape).lineTo(2930.51, 3392.3699);
        ((GeneralPath) shape).curveTo(2930.51, 3472.5198, 2995.45, 3531.6099, 3074.83, 3523.68);

        g.setPaint(new Color(0xF68656));
        g.fill(shape);

        // _0_0_0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3304.99, 3500.66);
        ((GeneralPath) shape).lineTo(3342.76, 3520.76);
        ((GeneralPath) shape).curveTo(3377.37, 3539.17, 3420.26, 3529.11, 3443.09, 3497.24);
        ((GeneralPath) shape).curveTo(3465.9302, 3465.36, 3461.6501, 3421.52, 3433.07, 3394.67);
        ((GeneralPath) shape).lineTo(3433.07, 3305.25);
        ((GeneralPath) shape).curveTo(3433.07, 3279.04, 3416.05, 3255.87, 3391.04, 3248.02);
        ((GeneralPath) shape).lineTo(3128.08, 3226.84);
        ((GeneralPath) shape).lineTo(3212.2002, 3299.8801);
        ((GeneralPath) shape).lineTo(3212.2002, 3347.28);
        ((GeneralPath) shape).lineTo(3300.7302, 3341.92);
        ((GeneralPath) shape).lineTo(3304.9902, 3500.66);

        g.setPaint(new Color(0x293136));
        g.fill(shape);

        // _0_0_0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3165.69, 3284.69);
        ((GeneralPath) shape).curveTo(3360.76, 3284.69, 3518.89, 3235.45, 3518.89, 3174.71);
        ((GeneralPath) shape).lineTo(3518.8699, 3174.33);
        ((GeneralPath) shape).lineTo(2812.5, 3174.33);
        ((GeneralPath) shape).lineTo(2812.48, 3174.71);
        ((GeneralPath) shape).curveTo(2812.48, 3235.45, 2970.6099, 3284.69, 3165.69, 3284.69);

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3178.24, 3327.28);
        ((GeneralPath) shape).curveTo(3213.8, 3323.01, 3242.63, 3300.87, 3242.63, 3277.81);
        ((GeneralPath) shape).curveTo(3242.63, 3254.75, 3213.7998, 3239.52, 3178.24, 3243.79);
        ((GeneralPath) shape).curveTo(3142.67, 3248.05, 3113.83, 3270.2, 3113.83, 3293.25);
        ((GeneralPath) shape).curveTo(3113.83, 3316.31, 3142.6702, 3331.54, 3178.24, 3327.28);

        g.setPaint(new Color(0xF68656));
        g.fill(shape);

        // _0_0_0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1314.86, 2739.02);
        ((GeneralPath) shape).lineTo(1479.39, 2739.02);
        ((GeneralPath) shape).lineTo(1479.39, 2581.74);
        ((GeneralPath) shape).curveTo(1461.49, 2602.91, 1433.93, 2616.32, 1403.37, 2616.69);
        ((GeneralPath) shape).curveTo(1365.5, 2617.14, 1331.67, 2597.39, 1314.86, 2567.3198);
        ((GeneralPath) shape).lineTo(1314.86, 2739.0198);

        g.setPaint(new Color(0x5099D2));
        g.fill(shape);

        // _0_0_0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(540.492, 2739.02);
        ((GeneralPath) shape).lineTo(705.023, 2739.02);
        ((GeneralPath) shape).lineTo(705.023, 2581.74);
        ((GeneralPath) shape).curveTo(687.11304, 2602.91, 659.555, 2616.32, 629.004, 2616.69);
        ((GeneralPath) shape).curveTo(591.12103, 2617.14, 557.301, 2597.39, 540.492, 2567.3198);
        ((GeneralPath) shape).lineTo(540.492, 2739.0198);

        g.fill(shape);

        // _0_0_0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(901.563, 3665.61);
        ((GeneralPath) shape).lineTo(2174.9, 3665.61);
        ((GeneralPath) shape).curveTo(2353.92, 3665.61, 2500.38, 3519.1501, 2500.38, 3340.1301);
        ((GeneralPath) shape).lineTo(2500.38, 2910.9102);
        ((GeneralPath) shape).lineTo(1062.5099, 2910.9102);
        ((GeneralPath) shape).lineTo(1062.5099, 3174.33);
        ((GeneralPath) shape).lineTo(576.07385, 3174.33);
        ((GeneralPath) shape).lineTo(576.07385, 3340.1301);
        ((GeneralPath) shape).curveTo(576.07385, 3519.1501, 722.54285, 3665.61, 901.56287, 3665.61);

        g.setPaint(new Color(0xFAFBC5));
        g.fill(shape);

        // _0_0_0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(2683.7, 3174.33);
        ((GeneralPath) shape).lineTo(2300.14, 3091.25);
        ((GeneralPath) shape).curveTo(2167.69, 3062.56, 2000.5299, 3072.64, 1918.2699, 3183.65);
        ((GeneralPath) shape).lineTo(1643.7499, 3184.5398);
        ((GeneralPath) shape).curveTo(1632.0898, 3311.7397, 1812.2499, 3400.6897, 1920.95, 3291.8398);
        ((GeneralPath) shape).lineTo(2282.21, 3297.21);
        ((GeneralPath) shape).lineTo(2570.14, 3400.94);
        ((GeneralPath) shape).curveTo(2782.3098, 3487.55, 2826.7, 3205.31, 2683.7, 3174.3298);

        g.setPaint(new Color(0xF68656));
        g.fill(shape);

        // _0_0_0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3244.35, 3474.53);
        ((GeneralPath) shape).lineTo(3244.35, 3474.53);
        ((GeneralPath) shape).curveTo(3252.2202, 3473.11, 3257.5, 3465.52, 3256.09, 3457.66);
        ((GeneralPath) shape).lineTo(3248.33, 3414.53);
        ((GeneralPath) shape).curveTo(3246.9202, 3406.66, 3239.34, 3401.3801, 3231.46, 3402.8);
        ((GeneralPath) shape).lineTo(3231.46, 3402.8);
        ((GeneralPath) shape).curveTo(3223.5999, 3404.22, 3218.33, 3411.8, 3219.73, 3419.6602);
        ((GeneralPath) shape).lineTo(3227.49, 3462.79);
        ((GeneralPath) shape).curveTo(3228.89, 3470.6602, 3236.49, 3475.94, 3244.35, 3474.53);

        g.setPaint(new Color(0x293136));
        g.fill(shape);

        // _0_0_0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3180.02, 3457.32);
        ((GeneralPath) shape).lineTo(3195.68, 3457.32);
        ((GeneralPath) shape).curveTo(3203.98, 3457.32, 3210.76, 3450.54, 3210.76, 3442.24);
        ((GeneralPath) shape).lineTo(3210.76, 3442.24);
        ((GeneralPath) shape).curveTo(3210.76, 3433.93, 3203.98, 3427.15, 3195.68, 3427.15);
        ((GeneralPath) shape).lineTo(3180.02, 3427.15);
        ((GeneralPath) shape).curveTo(3171.72, 3427.15, 3164.94, 3433.93, 3164.94, 3442.24);
        ((GeneralPath) shape).lineTo(3164.94, 3442.24);
        ((GeneralPath) shape).curveTo(3164.94, 3450.54, 3171.72, 3457.32, 3180.02, 3457.32);

        g.fill(shape);

        // _0_0_0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3148.06, 3473.32);
        ((GeneralPath) shape).curveTo(3164.8, 3473.32, 3178.46, 3486.97, 3178.46, 3503.71);
        ((GeneralPath) shape).curveTo(3178.46, 3520.46, 3164.8, 3534.1099, 3148.06, 3534.1099);
        ((GeneralPath) shape).curveTo(3131.31, 3534.1099, 3117.6602, 3520.46, 3117.6602, 3503.71);
        ((GeneralPath) shape).curveTo(3117.6602, 3486.97, 3131.31, 3473.32, 3148.06, 3473.32);

        g.setPaint(new Color(0xF68656));
        g.fill(shape);

        // _0_0_0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4233.72, 3020.81);
        ((GeneralPath) shape).lineTo(5025.96, 3020.81);
        ((GeneralPath) shape).lineTo(5025.96, 3606.9302);
        ((GeneralPath) shape).lineTo(4233.7197, 3606.9302);
        ((GeneralPath) shape).lineTo(4233.7197, 3020.81);

        g.setPaint(new Color(0xADE3F9));
        g.fill(shape);

        // _0_0_0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4866.95, 3566.68);
        ((GeneralPath) shape).lineTo(4979.6704, 3566.68);
        ((GeneralPath) shape).lineTo(4979.6704, 3518.3699);
        ((GeneralPath) shape).lineTo(4866.95, 3518.3699);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4717.6, 3566.68);
        ((GeneralPath) shape).curveTo(4755.17, 3566.68, 4792.77, 3566.68, 4830.33, 3566.68);
        ((GeneralPath) shape).curveTo(4830.33, 3550.5698, 4830.33, 3534.47, 4830.33, 3518.3699);
        ((GeneralPath) shape).curveTo(4792.77, 3518.3699, 4755.17, 3518.3699, 4717.6, 3518.3699);
        ((GeneralPath) shape).curveTo(4717.6, 3534.47, 4717.6, 3550.5698, 4717.6, 3566.68);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4568.27, 3566.68);
        ((GeneralPath) shape).curveTo(4605.83, 3566.68, 4643.42, 3566.68, 4680.99, 3566.68);
        ((GeneralPath) shape).curveTo(4680.99, 3550.5698, 4680.99, 3534.47, 4680.99, 3518.3699);
        ((GeneralPath) shape).curveTo(4643.4204, 3518.3699, 4605.83, 3518.3699, 4568.27, 3518.3699);
        ((GeneralPath) shape).curveTo(4568.27, 3534.47, 4568.27, 3550.5698, 4568.27, 3566.68);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4269.58, 3566.68);
        ((GeneralPath) shape).lineTo(4382.3003, 3566.68);
        ((GeneralPath) shape).lineTo(4382.3003, 3518.3699);
        ((GeneralPath) shape).lineTo(4269.58, 3518.3699);
        ((GeneralPath) shape).lineTo(4269.58, 3566.68);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4418.92, 3566.68);
        ((GeneralPath) shape).curveTo(4456.4897, 3566.68, 4494.05, 3566.68, 4531.65, 3566.68);
        ((GeneralPath) shape).curveTo(4531.65, 3550.5698, 4531.65, 3534.47, 4531.65, 3518.3699);
        ((GeneralPath) shape).curveTo(4494.05, 3518.3699, 4456.4897, 3518.3699, 4418.92, 3518.3699);
        ((GeneralPath) shape).curveTo(4418.92, 3534.47, 4418.92, 3550.5698, 4418.92, 3566.68);
        ((GeneralPath) shape).lineTo(4418.92, 3566.68);

        g.setPaint(new Color(0x8FD3F4));
        g.fill(shape);

        // _0_0_0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4866.95, 3490.46);
        ((GeneralPath) shape).curveTo(4904.5503, 3490.46, 4942.1, 3490.46, 4979.6704, 3490.46);
        ((GeneralPath) shape).curveTo(4979.6704, 3474.3599, 4979.6704, 3458.25, 4979.6704, 3442.16);
        ((GeneralPath) shape).curveTo(4942.1006, 3442.16, 4904.5503, 3442.16, 4866.95, 3442.16);
        ((GeneralPath) shape).curveTo(4866.95, 3458.25, 4866.95, 3474.3599, 4866.95, 3490.46);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4717.6, 3490.46);
        ((GeneralPath) shape).curveTo(4755.17, 3490.46, 4792.77, 3490.46, 4830.33, 3490.46);
        ((GeneralPath) shape).curveTo(4830.33, 3474.3599, 4830.33, 3458.25, 4830.33, 3442.16);
        ((GeneralPath) shape).curveTo(4792.77, 3442.16, 4755.17, 3442.16, 4717.6, 3442.16);
        ((GeneralPath) shape).curveTo(4717.6, 3458.25, 4717.6, 3474.3599, 4717.6, 3490.46);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4568.27, 3490.46);
        ((GeneralPath) shape).curveTo(4605.83, 3490.46, 4643.42, 3490.46, 4680.99, 3490.46);
        ((GeneralPath) shape).curveTo(4680.99, 3474.3599, 4680.99, 3458.25, 4680.99, 3442.16);
        ((GeneralPath) shape).curveTo(4643.4204, 3442.16, 4605.83, 3442.16, 4568.27, 3442.16);
        ((GeneralPath) shape).curveTo(4568.27, 3458.25, 4568.27, 3474.3599, 4568.27, 3490.46);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4269.58, 3490.46);
        ((GeneralPath) shape).curveTo(4307.14, 3490.46, 4344.7, 3490.46, 4382.3003, 3490.46);
        ((GeneralPath) shape).curveTo(4382.3003, 3474.3599, 4382.3003, 3458.25, 4382.3003, 3442.16);
        ((GeneralPath) shape).curveTo(4344.7, 3442.16, 4307.14, 3442.16, 4269.58, 3442.16);
        ((GeneralPath) shape).curveTo(4269.58, 3458.25, 4269.58, 3474.3599, 4269.58, 3490.46);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4418.92, 3490.46);
        ((GeneralPath) shape).curveTo(4456.4897, 3490.46, 4494.05, 3490.46, 4531.65, 3490.46);
        ((GeneralPath) shape).curveTo(4531.65, 3474.3599, 4531.65, 3458.25, 4531.65, 3442.16);
        ((GeneralPath) shape).curveTo(4494.05, 3442.16, 4456.4897, 3442.16, 4418.92, 3442.16);
        ((GeneralPath) shape).curveTo(4418.92, 3458.25, 4418.92, 3474.3599, 4418.92, 3490.46);
        ((GeneralPath) shape).lineTo(4418.92, 3490.46);

        g.fill(shape);

        // _0_0_0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4866.95, 3414.24);
        ((GeneralPath) shape).curveTo(4904.5503, 3414.24, 4942.1, 3414.24, 4979.6704, 3414.24);
        ((GeneralPath) shape).curveTo(4979.6704, 3398.14, 4979.6704, 3382.03, 4979.6704, 3365.93);
        ((GeneralPath) shape).curveTo(4942.1006, 3365.93, 4904.5503, 3365.93, 4866.95, 3365.93);
        ((GeneralPath) shape).curveTo(4866.95, 3382.03, 4866.95, 3398.14, 4866.95, 3414.24);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4717.6, 3414.24);
        ((GeneralPath) shape).curveTo(4755.17, 3414.24, 4792.77, 3414.24, 4830.33, 3414.24);
        ((GeneralPath) shape).curveTo(4830.33, 3398.14, 4830.33, 3382.03, 4830.33, 3365.93);
        ((GeneralPath) shape).curveTo(4792.77, 3365.93, 4755.17, 3365.93, 4717.6, 3365.93);
        ((GeneralPath) shape).curveTo(4717.6, 3382.03, 4717.6, 3398.14, 4717.6, 3414.24);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4568.27, 3414.24);
        ((GeneralPath) shape).curveTo(4605.83, 3414.24, 4643.42, 3414.24, 4680.99, 3414.24);
        ((GeneralPath) shape).curveTo(4680.99, 3398.14, 4680.99, 3382.03, 4680.99, 3365.93);
        ((GeneralPath) shape).curveTo(4643.4204, 3365.93, 4605.83, 3365.93, 4568.27, 3365.93);
        ((GeneralPath) shape).curveTo(4568.27, 3382.03, 4568.27, 3398.14, 4568.27, 3414.24);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4269.58, 3414.24);
        ((GeneralPath) shape).curveTo(4307.14, 3414.24, 4344.7, 3414.24, 4382.3003, 3414.24);
        ((GeneralPath) shape).curveTo(4382.3003, 3398.14, 4382.3003, 3382.03, 4382.3003, 3365.93);
        ((GeneralPath) shape).curveTo(4344.7, 3365.93, 4307.14, 3365.93, 4269.58, 3365.93);
        ((GeneralPath) shape).curveTo(4269.58, 3382.03, 4269.58, 3398.14, 4269.58, 3414.24);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4418.92, 3414.24);
        ((GeneralPath) shape).curveTo(4456.4897, 3414.24, 4494.05, 3414.24, 4531.65, 3414.24);
        ((GeneralPath) shape).curveTo(4531.65, 3398.14, 4531.65, 3382.03, 4531.65, 3365.93);
        ((GeneralPath) shape).curveTo(4494.05, 3365.93, 4456.4897, 3365.93, 4418.92, 3365.93);
        ((GeneralPath) shape).curveTo(4418.92, 3382.03, 4418.92, 3398.14, 4418.92, 3414.24);
        ((GeneralPath) shape).lineTo(4418.92, 3414.24);

        g.fill(shape);

        // _0_0_0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4866.95, 3338.02);
        ((GeneralPath) shape).curveTo(4904.5503, 3338.02, 4942.1, 3338.02, 4979.6704, 3338.02);
        ((GeneralPath) shape).curveTo(4979.6704, 3321.92, 4979.6704, 3305.82, 4979.6704, 3289.72);
        ((GeneralPath) shape).curveTo(4942.1006, 3289.72, 4904.5503, 3289.72, 4866.95, 3289.72);
        ((GeneralPath) shape).curveTo(4866.95, 3305.82, 4866.95, 3321.92, 4866.95, 3338.02);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4717.6, 3338.02);
        ((GeneralPath) shape).curveTo(4755.17, 3338.02, 4792.77, 3338.02, 4830.33, 3338.02);
        ((GeneralPath) shape).curveTo(4830.33, 3321.92, 4830.33, 3305.82, 4830.33, 3289.72);
        ((GeneralPath) shape).curveTo(4792.77, 3289.72, 4755.17, 3289.72, 4717.6, 3289.72);
        ((GeneralPath) shape).curveTo(4717.6, 3305.82, 4717.6, 3321.92, 4717.6, 3338.02);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4568.27, 3338.02);
        ((GeneralPath) shape).curveTo(4605.83, 3338.02, 4643.42, 3338.02, 4680.99, 3338.02);
        ((GeneralPath) shape).curveTo(4680.99, 3321.92, 4680.99, 3305.82, 4680.99, 3289.72);
        ((GeneralPath) shape).curveTo(4643.4204, 3289.72, 4605.83, 3289.72, 4568.27, 3289.72);
        ((GeneralPath) shape).curveTo(4568.27, 3305.82, 4568.27, 3321.92, 4568.27, 3338.02);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4269.58, 3338.02);
        ((GeneralPath) shape).curveTo(4307.14, 3338.02, 4344.7, 3338.02, 4382.3003, 3338.02);
        ((GeneralPath) shape).curveTo(4382.3003, 3321.92, 4382.3003, 3305.82, 4382.3003, 3289.72);
        ((GeneralPath) shape).curveTo(4344.7, 3289.72, 4307.14, 3289.72, 4269.58, 3289.72);
        ((GeneralPath) shape).curveTo(4269.58, 3305.82, 4269.58, 3321.92, 4269.58, 3338.02);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4418.92, 3338.02);
        ((GeneralPath) shape).curveTo(4456.4897, 3338.02, 4494.05, 3338.02, 4531.65, 3338.02);
        ((GeneralPath) shape).curveTo(4531.65, 3321.92, 4531.65, 3305.82, 4531.65, 3289.72);
        ((GeneralPath) shape).curveTo(4494.05, 3289.72, 4456.4897, 3289.72, 4418.92, 3289.72);
        ((GeneralPath) shape).curveTo(4418.92, 3305.82, 4418.92, 3321.92, 4418.92, 3338.02);
        ((GeneralPath) shape).lineTo(4418.92, 3338.02);

        g.fill(shape);

        // _0_0_0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4866.95, 3261.81);
        ((GeneralPath) shape).curveTo(4904.5503, 3261.81, 4942.1, 3261.81, 4979.6704, 3261.81);
        ((GeneralPath) shape).curveTo(4979.6704, 3245.7, 4979.6704, 3229.61, 4979.6704, 3213.5);
        ((GeneralPath) shape).curveTo(4942.1006, 3213.5, 4904.5503, 3213.5, 4866.95, 3213.5);
        ((GeneralPath) shape).curveTo(4866.95, 3229.61, 4866.95, 3245.7, 4866.95, 3261.81);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4717.6, 3261.81);
        ((GeneralPath) shape).curveTo(4755.17, 3261.81, 4792.77, 3261.81, 4830.33, 3261.81);
        ((GeneralPath) shape).curveTo(4830.33, 3245.7, 4830.33, 3229.61, 4830.33, 3213.5);
        ((GeneralPath) shape).curveTo(4792.77, 3213.5, 4755.17, 3213.5, 4717.6, 3213.5);
        ((GeneralPath) shape).curveTo(4717.6, 3229.61, 4717.6, 3245.7, 4717.6, 3261.81);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4568.27, 3261.81);
        ((GeneralPath) shape).curveTo(4605.83, 3261.81, 4643.42, 3261.81, 4680.99, 3261.81);
        ((GeneralPath) shape).curveTo(4680.99, 3245.7, 4680.99, 3229.61, 4680.99, 3213.5);
        ((GeneralPath) shape).curveTo(4643.4204, 3213.5, 4605.83, 3213.5, 4568.27, 3213.5);
        ((GeneralPath) shape).curveTo(4568.27, 3229.61, 4568.27, 3245.7, 4568.27, 3261.81);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4269.58, 3261.81);
        ((GeneralPath) shape).curveTo(4307.14, 3261.81, 4344.7, 3261.81, 4382.3003, 3261.81);
        ((GeneralPath) shape).curveTo(4382.3003, 3245.7, 4382.3003, 3229.61, 4382.3003, 3213.5);
        ((GeneralPath) shape).curveTo(4344.7, 3213.5, 4307.14, 3213.5, 4269.58, 3213.5);
        ((GeneralPath) shape).curveTo(4269.58, 3229.61, 4269.58, 3245.7, 4269.58, 3261.81);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4418.92, 3261.81);
        ((GeneralPath) shape).curveTo(4456.4897, 3261.81, 4494.05, 3261.81, 4531.65, 3261.81);
        ((GeneralPath) shape).curveTo(4531.65, 3245.7, 4531.65, 3229.61, 4531.65, 3213.5);
        ((GeneralPath) shape).curveTo(4494.05, 3213.5, 4456.4897, 3213.5, 4418.92, 3213.5);
        ((GeneralPath) shape).curveTo(4418.92, 3229.61, 4418.92, 3245.7, 4418.92, 3261.81);
        ((GeneralPath) shape).lineTo(4418.92, 3261.81);

        g.fill(shape);

        // _0_0_0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4866.95, 3185.59);
        ((GeneralPath) shape).curveTo(4904.5503, 3185.59, 4942.1, 3185.59, 4979.6704, 3185.59);
        ((GeneralPath) shape).curveTo(4979.6704, 3169.48, 4979.6704, 3153.3901, 4979.6704, 3137.29);
        ((GeneralPath) shape).curveTo(4942.1006, 3137.29, 4904.5503, 3137.29, 4866.95, 3137.29);
        ((GeneralPath) shape).curveTo(4866.95, 3153.3901, 4866.95, 3169.48, 4866.95, 3185.59);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4717.6, 3185.59);
        ((GeneralPath) shape).curveTo(4755.17, 3185.59, 4792.77, 3185.59, 4830.33, 3185.59);
        ((GeneralPath) shape).curveTo(4830.33, 3169.48, 4830.33, 3153.3901, 4830.33, 3137.29);
        ((GeneralPath) shape).curveTo(4792.77, 3137.29, 4755.17, 3137.29, 4717.6, 3137.29);
        ((GeneralPath) shape).curveTo(4717.6, 3153.3901, 4717.6, 3169.48, 4717.6, 3185.59);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4568.27, 3185.59);
        ((GeneralPath) shape).curveTo(4605.83, 3185.59, 4643.42, 3185.59, 4680.99, 3185.59);
        ((GeneralPath) shape).curveTo(4680.99, 3169.48, 4680.99, 3153.3901, 4680.99, 3137.29);
        ((GeneralPath) shape).curveTo(4643.4204, 3137.29, 4605.83, 3137.29, 4568.27, 3137.29);
        ((GeneralPath) shape).curveTo(4568.27, 3153.3901, 4568.27, 3169.48, 4568.27, 3185.59);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4269.58, 3185.59);
        ((GeneralPath) shape).curveTo(4307.14, 3185.59, 4344.7, 3185.59, 4382.3003, 3185.59);
        ((GeneralPath) shape).curveTo(4382.3003, 3169.48, 4382.3003, 3153.3901, 4382.3003, 3137.29);
        ((GeneralPath) shape).curveTo(4344.7, 3137.29, 4307.14, 3137.29, 4269.58, 3137.29);
        ((GeneralPath) shape).curveTo(4269.58, 3153.3901, 4269.58, 3169.48, 4269.58, 3185.59);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4418.92, 3185.59);
        ((GeneralPath) shape).curveTo(4456.4897, 3185.59, 4494.05, 3185.59, 4531.65, 3185.59);
        ((GeneralPath) shape).curveTo(4531.65, 3169.48, 4531.65, 3153.3901, 4531.65, 3137.29);
        ((GeneralPath) shape).curveTo(4494.05, 3137.29, 4456.4897, 3137.29, 4418.92, 3137.29);
        ((GeneralPath) shape).curveTo(4418.92, 3153.3901, 4418.92, 3169.48, 4418.92, 3185.59);
        ((GeneralPath) shape).lineTo(4418.92, 3185.59);

        g.fill(shape);

        // _0_0_0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4866.95, 3109.37);
        ((GeneralPath) shape).lineTo(4979.6704, 3109.37);
        ((GeneralPath) shape).lineTo(4979.6704, 3061.06);
        ((GeneralPath) shape).lineTo(4866.95, 3061.06);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4717.6, 3109.37);
        ((GeneralPath) shape).curveTo(4755.17, 3109.37, 4792.77, 3109.37, 4830.33, 3109.37);
        ((GeneralPath) shape).curveTo(4830.33, 3093.27, 4830.33, 3077.1602, 4830.33, 3061.06);
        ((GeneralPath) shape).curveTo(4792.77, 3061.06, 4755.17, 3061.06, 4717.6, 3061.06);
        ((GeneralPath) shape).curveTo(4717.6, 3077.1602, 4717.6, 3093.27, 4717.6, 3109.37);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4568.27, 3109.37);
        ((GeneralPath) shape).curveTo(4605.83, 3109.37, 4643.42, 3109.37, 4680.99, 3109.37);
        ((GeneralPath) shape).curveTo(4680.99, 3093.27, 4680.99, 3077.1602, 4680.99, 3061.06);
        ((GeneralPath) shape).curveTo(4643.4204, 3061.06, 4605.83, 3061.06, 4568.27, 3061.06);
        ((GeneralPath) shape).curveTo(4568.27, 3077.1602, 4568.27, 3093.27, 4568.27, 3109.37);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4269.58, 3109.37);
        ((GeneralPath) shape).lineTo(4382.3003, 3109.37);
        ((GeneralPath) shape).lineTo(4382.3003, 3061.06);
        ((GeneralPath) shape).lineTo(4269.58, 3061.06);
        ((GeneralPath) shape).lineTo(4269.58, 3109.37);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(4418.92, 3109.37);
        ((GeneralPath) shape).curveTo(4456.4897, 3109.37, 4494.05, 3109.37, 4531.65, 3109.37);
        ((GeneralPath) shape).curveTo(4531.65, 3093.27, 4531.65, 3077.1602, 4531.65, 3061.06);
        ((GeneralPath) shape).curveTo(4494.05, 3061.06, 4456.4897, 3061.06, 4418.92, 3061.06);
        ((GeneralPath) shape).curveTo(4418.92, 3077.1602, 4418.92, 3093.27, 4418.92, 3109.37);
        ((GeneralPath) shape).lineTo(4418.92, 3109.37);

        g.fill(shape);

        // _0_0_0_0_0_36
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4801.76, 2251.95);
        ((GeneralPath) shape).lineTo(5148.32, 2251.95);
        ((GeneralPath) shape).lineTo(5148.32, 2670.5898);
        ((GeneralPath) shape).lineTo(4801.76, 2670.5898);
        ((GeneralPath) shape).lineTo(4801.76, 2251.9497);

        g.fill(shape);

        // _0_0_0_0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(590.77, 3312.42);
        ((GeneralPath) shape).lineTo(520.523, 3312.42);
        ((GeneralPath) shape).lineTo(460.81302, 3387.3599);
        ((GeneralPath) shape).curveTo(441.527, 3411.5498, 439.52002, 3416.2397, 408.71103, 3418.96);
        ((GeneralPath) shape).lineTo(399.34003, 3428.33);
        ((GeneralPath) shape).curveTo(389.85504, 3437.82, 374.56302, 3438.07, 364.76602, 3428.9102);
        ((GeneralPath) shape).curveTo(354.98, 3419.7402, 354.21902, 3404.4702, 363.04303, 3394.3801);
        ((GeneralPath) shape).curveTo(345.24203, 3378.1301, 335.29703, 3349.53, 356.60202, 3325.3);
        ((GeneralPath) shape).lineTo(459.64102, 3230.46);
        ((GeneralPath) shape).lineTo(471.34802, 3204.7);
        ((GeneralPath) shape).curveTo(480.39502, 3184.8, 499.93402, 3171.75, 521.773, 3171.0);
        ((GeneralPath) shape).curveTo(543.617, 3170.26, 564.0, 3181.95, 574.379, 3201.19);
        ((GeneralPath) shape).lineTo(671.56305, 3202.3599);
        ((GeneralPath) shape).curveTo(683.434, 3231.2, 640.25006, 3312.42, 590.77, 3312.42);

        g.setPaint(new Color(0xF46E3A));
        g.fill(shape);

        // _0_0_0_0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(768.746, 3312.42);
        ((GeneralPath) shape).lineTo(698.496, 3312.42);
        ((GeneralPath) shape).lineTo(638.777, 3387.3599);
        ((GeneralPath) shape).curveTo(619.50397, 3411.5498, 571.81995, 3410.98, 541.01196, 3413.7);
        ((GeneralPath) shape).lineTo(531.641, 3423.07);
        ((GeneralPath) shape).curveTo(522.156, 3432.55, 506.871, 3432.8, 497.07397, 3423.6401);
        ((GeneralPath) shape).curveTo(487.28497, 3414.4702, 486.52298, 3399.2002, 495.352, 3389.11);
        ((GeneralPath) shape).curveTo(489.848, 3358.82, 501.563, 3344.85, 534.574, 3325.3);
        ((GeneralPath) shape).lineTo(637.602, 3230.46);
        ((GeneralPath) shape).lineTo(649.313, 3204.7);
        ((GeneralPath) shape).curveTo(658.359, 3184.8, 677.895, 3171.75, 699.746, 3171.0);
        ((GeneralPath) shape).curveTo(721.594, 3170.26, 741.969, 3181.95, 752.34796, 3201.19);
        ((GeneralPath) shape).lineTo(790.98395, 3202.3599);
        ((GeneralPath) shape).lineTo(799.17993, 3222.2598);
        ((GeneralPath) shape).curveTo(812.9489, 3255.6997, 799.9649, 3312.4197, 768.7459, 3312.4197);

        g.setPaint(new Color(0xF68656));
        g.fill(shape);

        // _0_0_0_0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4237.825, 3691.1895);
        ((GeneralPath) shape).lineTo(4310.0024, 3809.579);
        ((GeneralPath) shape).lineTo(4374.604, 3730.5142);
        ((GeneralPath) shape).lineTo(4408.351, 3917.5703);
        ((GeneralPath) shape).lineTo(4493.201, 3713.1584);
        ((GeneralPath) shape).lineTo(4610.64, 3873.9915);
        ((GeneralPath) shape).lineTo(4714.776, 3697.3477);
        ((GeneralPath) shape).lineTo(4783.4272, 3905.9998);
        ((GeneralPath) shape).lineTo(4873.0986, 3707.3733);
        ((GeneralPath) shape).curveTo(4923.4883, 3776.4514, 4993.9746, 3848.9326, 5046.2676, 3916.606);

        g.setPaint(new Color(0xB0CBA6));
        g.setStroke(new BasicStroke(45, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4234.3706, 3997.3704);
        ((GeneralPath) shape).lineTo(4234.3706, 3690.398);
        ((GeneralPath) shape).lineTo(5022.6265, 3687.3127);
        ((GeneralPath) shape).lineTo(5021.084, 4001.9983);
        ((GeneralPath) shape).lineTo(5102.8403, 3935.6675);
        ((GeneralPath) shape).lineTo(5109.0107, 3650.291);
        ((GeneralPath) shape).lineTo(4171.125, 3645.6633);
        ((GeneralPath) shape).lineTo(4212.7744, 4020.5093);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8FD3F4));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_0

        g.setTransform(transformations.pop()); // _0_0_0

        g.setTransform(transformations.pop()); // _0_0

    }
}

