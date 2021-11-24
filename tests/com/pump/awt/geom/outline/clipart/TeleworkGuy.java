package com.pump.awt.geom.outline.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/321065/telework-guy
 * </p>
 */
public class TeleworkGuy implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public TeleworkGuy() {
        this(1219, 1185);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public TeleworkGuy(int width, int height) {
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
        double coef = Math.min((double) width / (double) 1219, (double) height / (double) 1185);

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
        g.transform(new AffineTransform(1.0666668f, 0, 0, 1.0666668f, 0, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 474.15598f, 3.44455f));

        // _0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.0425915f, 0, 0, 1.0163594f, 3458.4902f, 1077.1125f));

        // _0_0_0

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3176.4636, -1002.3653);
        ((GeneralPath) shape).curveTo(-3183.3828, -1002.3653, -3190.0798, -1002.2043, -3196.4773, -1001.8653);
        ((GeneralPath) shape).curveTo(-3230.0781, -1000.0851, -3264.7058, -995.7089, -3291.7273, -989.82623);
        ((GeneralPath) shape).curveTo(-3305.3198, -986.86707, -3324.234, -982.10645, -3331.2273, -979.8848);
        ((GeneralPath) shape).curveTo(-3334.5273, -978.8365, -3342.4023, -976.36035, -3348.7273, -974.3829);
        ((GeneralPath) shape).curveTo(-3358.3958, -971.3601, -3371.8733, -966.4365, -3383.905, -961.52936);
        ((GeneralPath) shape).curveTo(-3385.378, -960.92865, -3386.4333, -960.1943, -3386.2507, -959.8985);
        ((GeneralPath) shape).curveTo(-3386.068, -959.6027, -3386.8882, -959.29553, -3388.073, -959.2149);
        ((GeneralPath) shape).curveTo(-3392.5527, -958.91003, -3438.736, -936.044, -3452.2273, -927.45123);
        ((GeneralPath) shape).curveTo(-3457.431, -924.1371, -3462.011, -921.2834, -3469.2273, -916.8614);
        ((GeneralPath) shape).curveTo(-3483.0571, -908.3867, -3516.3948, -883.81305, -3526.7273, -874.4766);
        ((GeneralPath) shape).curveTo(-3528.6523, -872.7372, -3534.0522, -868.116, -3538.7273, -864.2071);
        ((GeneralPath) shape).curveTo(-3553.2197, -852.0893, -3571.1624, -833.82007, -3590.6277, -811.3614);
        ((GeneralPath) shape).curveTo(-3603.235, -796.8153, -3619.3435, -775.58673, -3629.327, -760.3614);
        ((GeneralPath) shape).curveTo(-3632.5725, -755.4114, -3635.486, -751.1364, -3635.8015, -750.8614);
        ((GeneralPath) shape).curveTo(-3636.1172, -750.58636, -3640.7976, -742.9364, -3646.202, -733.8614);
        ((GeneralPath) shape).curveTo(-3660.9592, -709.08124, -3674.4507, -681.7835, -3683.7664, -657.8614);
        ((GeneralPath) shape).curveTo(-3689.0686, -644.24524, -3695.7273, -625.2835, -3695.7273, -623.7989);
        ((GeneralPath) shape).curveTo(-3695.7273, -622.90173, -3696.3728, -620.8607, -3697.1628, -619.26373);
        ((GeneralPath) shape).curveTo(-3698.9763, -615.5977, -3706.8906, -585.2217, -3710.194, -569.2442);
        ((GeneralPath) shape).curveTo(-3718.6396, -528.3953, -3721.1448, -502.85693, -3721.1707, -457.3614);
        ((GeneralPath) shape).curveTo(-3721.1987, -409.60745, -3719.3516, -391.14148, -3709.614, -341.8614);
        ((GeneralPath) shape).curveTo(-3706.9622, -328.4416, -3699.0286, -298.24765, -3697.159, -294.4571);
        ((GeneralPath) shape).curveTo(-3696.3713, -292.8601, -3695.7273, -290.83163, -3695.7273, -289.94928);
        ((GeneralPath) shape).curveTo(-3695.7273, -287.38623, -3685.4685, -259.3827, -3678.6023, -243.20123);
        ((GeneralPath) shape).curveTo(-3666.9353, -215.70645, -3637.2102, -160.94592, -3633.9187, -160.88483);
        ((GeneralPath) shape).curveTo(-3633.199, -160.87143, -3632.868, -160.44174, -3633.1843, -159.92975);
        ((GeneralPath) shape).curveTo(-3633.5007, -159.41776, -3633.302, -158.71661, -3632.743, -158.37115);
        ((GeneralPath) shape).curveTo(-3632.1838, -158.0257, -3631.7273, -156.64339, -3631.7273, -155.30084);
        ((GeneralPath) shape).curveTo(-3631.7273, -153.9583, -3631.337, -152.86139, -3630.86, -152.86139);
        ((GeneralPath) shape).curveTo(-3630.3833, -152.86139, -3627.9531, -149.82388, -3625.4597, -146.11139);
        ((GeneralPath) shape).curveTo(-3621.7603, -140.60292, -3608.326, -122.38403, -3604.9968, -118.36139);
        ((GeneralPath) shape).curveTo(-3604.5417, -117.811386, -3601.7476, -114.436386, -3598.7878, -110.86139);
        ((GeneralPath) shape).curveTo(-3582.6628, -91.383804, -3550.9565, -59.20218, -3534.2273, -45.334053);
        ((GeneralPath) shape).curveTo(-3530.9272, -42.598354, -3528.0022, -40.1094, -3527.7273, -39.802803);
        ((GeneralPath) shape).curveTo(-3524.26, -35.9378, -3496.1946, -14.807234, -3479.9773, -3.851635);
        ((GeneralPath) shape).curveTo(-3473.2397, 0.699965, -3467.7273, 4.9418554, -3467.7273, 5.574155);
        ((GeneralPath) shape).curveTo(-3467.7273, 6.2064548, -3462.6648, 9.361625, -3456.4773, 12.587826);
        ((GeneralPath) shape).curveTo(-3450.2898, 15.813926, -3442.9224, 19.714596, -3440.1042, 21.255795);
        ((GeneralPath) shape).curveTo(-3437.2861, 22.796995, -3434.6987, 23.776073, -3434.3542, 23.431574);
        ((GeneralPath) shape).curveTo(-3434.0098, 23.087074, -3433.7273, 23.356983, -3433.7273, 24.031183);
        ((GeneralPath) shape).curveTo(-3433.7273, 24.705584, -3433.3162, 25.002234, -3432.8132, 24.691334);
        ((GeneralPath) shape).curveTo(-3432.3103, 24.380434, -3431.7478, 24.536243, -3431.5632, 25.037045);
        ((GeneralPath) shape).curveTo(-3431.1975, 26.029844, -3403.8977, 39.768303, -3394.2273, 43.826103);
        ((GeneralPath) shape).curveTo(-3380.109, 49.750305, -3376.405, 51.059124, -3375.4402, 50.462822);
        ((GeneralPath) shape).curveTo(-3374.8777, 50.115322, -3374.6887, 50.270073, -3375.0203, 50.806572);
        ((GeneralPath) shape).curveTo(-3375.558, 51.676872, -3368.1304, 54.963703, -3364.3835, 55.513603);
        ((GeneralPath) shape).curveTo(-3363.5833, 55.631004, -3362.322, 56.22275, -3361.5789, 56.828053);
        ((GeneralPath) shape).curveTo(-3357.7388, 59.95605, -3310.0784, 73.424805, -3284.7273, 78.5468);
        ((GeneralPath) shape).curveTo(-3267.3655, 82.0545, -3239.3206, 85.938095, -3219.7273, 87.5468);
        ((GeneralPath) shape).curveTo(-3197.5947, 89.364, -3194.745, 89.401695, -3194.6492, 87.888596);
        ((GeneralPath) shape).curveTo(-3194.5862, 86.888596, -3194.4688, 86.888596, -3194.0652, 87.888596);
        ((GeneralPath) shape).curveTo(-3192.986, 90.563095, -3138.3826, 88.80916, -3110.7273, 85.21085);
        ((GeneralPath) shape).curveTo(-3082.9756, 81.59995, -3062.344, 77.70319, -3038.2273, 71.517494);
        ((GeneralPath) shape).curveTo(-3032.7273, 70.1068, -3027.5522, 68.80226, -3026.7273, 68.619064);
        ((GeneralPath) shape).curveTo(-3020.4883, 67.233864, -2982.7915, 54.581745, -2976.2273, 51.669846);
        ((GeneralPath) shape).curveTo(-2974.5774, 50.937946, -2969.1772, 48.679565, -2964.2273, 46.652267);
        ((GeneralPath) shape).curveTo(-2914.9187, 26.457367, -2858.206, -9.310303, -2815.2156, -47.3282);
        ((GeneralPath) shape).curveTo(-2810.809, -51.225163, -2806.309, -55.08987, -2805.2156, -55.916092);
        ((GeneralPath) shape).curveTo(-2804.1223, -56.742313, -2799.2058, -61.679623, -2794.2898, -66.88874);
        ((GeneralPath) shape).curveTo(-2789.3738, -72.09788, -2781.4941, -80.4114, -2776.78, -85.361404);
        ((GeneralPath) shape).curveTo(-2758.0452, -105.03378, -2736.7273, -131.42357, -2736.7273, -134.94344);
        ((GeneralPath) shape).curveTo(-2736.7273, -135.99838, -2736.3052, -136.7489, -2735.7898, -136.6114);
        ((GeneralPath) shape).curveTo(-2735.2744, -136.4739, -2733.137, -138.88762, -2731.0398, -141.97664);
        ((GeneralPath) shape).curveTo(-2719.0195, -159.68198, -2715.72, -165.07207, -2715.657, -167.10164);
        ((GeneralPath) shape).curveTo(-2715.5989, -168.97543, -2715.4692, -169.06258, -2714.8953, -167.61336);
        ((GeneralPath) shape).curveTo(-2714.3752, -166.30022, -2712.3108, -169.03273, -2706.5847, -178.61336);
        ((GeneralPath) shape).curveTo(-2697.314, -194.12474, -2696.9663, -194.78125, -2685.8328, -217.86139);
        ((GeneralPath) shape).curveTo(-2673.5942, -243.23232, -2667.6616, -257.77756, -2659.5437, -282.3145);
        ((GeneralPath) shape).curveTo(-2645.4148, -325.01907, -2637.2742, -364.15, -2633.2566, -408.66803);
        ((GeneralPath) shape).curveTo(-2625.1116, -498.92285, -2639.9124, -590.37866, -2676.3367, -674.8614);
        ((GeneralPath) shape).curveTo(-2684.213, -693.12915, -2700.3298, -724.60657, -2703.3582, -727.6348);
        ((GeneralPath) shape).curveTo(-2704.1108, -728.3876, -2704.7273, -729.3864, -2704.7273, -729.8536);
        ((GeneralPath) shape).curveTo(-2704.7273, -730.32074, -2707.042, -734.45026, -2709.8718, -739.0313);
        ((GeneralPath) shape).curveTo(-2743.1843, -792.96014, -2784.0205, -840.42053, -2826.7273, -874.84186);
        ((GeneralPath) shape).curveTo(-2829.7522, -877.27997, -2832.9023, -879.8441, -2833.7273, -880.5411);
        ((GeneralPath) shape).curveTo(-2845.126, -890.1709, -2888.0498, -920.8614, -2890.1199, -920.8614);
        ((GeneralPath) shape).curveTo(-2890.3098, -920.8614, -2896.4866, -924.48175, -2903.8464, -928.90826);
        ((GeneralPath) shape).curveTo(-2916.194, -936.3348, -2944.097, -950.79504, -2954.7273, -955.27545);
        ((GeneralPath) shape).curveTo(-2957.2024, -956.3186, -2961.5605, -958.2262, -2964.4128, -959.5157);
        ((GeneralPath) shape).curveTo(-2967.2651, -960.8052, -2969.8396, -961.8614, -2970.1335, -961.8614);
        ((GeneralPath) shape).curveTo(-2970.4275, -961.8614, -2973.0442, -962.92664, -2975.948, -964.2286);
        ((GeneralPath) shape).curveTo(-2978.8518, -965.5305, -2983.4773, -967.3778, -2986.2273, -968.33405);
        ((GeneralPath) shape).curveTo(-2988.9773, -969.2903, -2992.1272, -970.4605, -2993.2273, -970.9356);
        ((GeneralPath) shape).curveTo(-2995.1958, -971.78577, -3009.0425, -976.16, -3025.7273, -981.20123);
        ((GeneralPath) shape).curveTo(-3068.751, -994.2007, -3128.0298, -1002.348, -3176.4636, -1002.3653);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-3000.4832, -765.6446);
        ((GeneralPath) shape).lineTo(-2963.821, -680.5899);
        ((GeneralPath) shape).lineTo(-2955.6082, -675.6036);
        ((GeneralPath) shape).lineTo(-2945.3425, -661.8184);
        ((GeneralPath) shape).lineTo(-2945.9304, -645.3946);
        ((GeneralPath) shape).lineTo(-2952.9695, -630.4356);
        ((GeneralPath) shape).lineTo(-2974.0867, -622.8106);
        ((GeneralPath) shape).lineTo(-2992.5632, -628.9688);
        ((GeneralPath) shape).lineTo(-3021.0125, -603.1602);
        ((GeneralPath) shape).lineTo(-3030.985, -592.6016);
        ((GeneralPath) shape).lineTo(-3033.3308, -587.6153);
        ((GeneralPath) shape).lineTo(-3042.7175, -588.4942);
        ((GeneralPath) shape).lineTo(-3045.6492, -595.2403);
        ((GeneralPath) shape).lineTo(-3042.7175, -601.9864);
        ((GeneralPath) shape).lineTo(-3035.3835, -603.4532);
        ((GeneralPath) shape).lineTo(-2997.2566, -635.42194);
        ((GeneralPath) shape).lineTo(-3006.0554, -648.62115);
        ((GeneralPath) shape).lineTo(-2998.1355, -674.7227);
        ((GeneralPath) shape).lineTo(-2990.8035, -677.6563);
        ((GeneralPath) shape).lineTo(-3012.8015, -733.9688);
        ((GeneralPath) shape).lineTo(-3023.0652, -760.3653);
        ((GeneralPath) shape).curveTo(-3016.552, -762.7338, -3010.734, -765.5185, -3000.4832, -765.6446);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-2695.2976, -211.06451);
        ((GeneralPath) shape).curveTo(-2695.2197, -211.10641, -2695.129, -210.95673, -2695.034, -210.59186);
        ((GeneralPath) shape).curveTo(-2694.7803, -209.61888, -2694.797, -208.26889, -2695.071, -207.59186);
        ((GeneralPath) shape).curveTo(-2695.3447, -206.91483, -2695.552, -207.7114, -2695.532, -209.36139);
        ((GeneralPath) shape).curveTo(-2695.519, -210.39264, -2695.427, -210.99475, -2695.2976, -211.06451);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x0087A8));
        g.fill(shape);

        // _0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-3205.7273, 88.47814);
        ((GeneralPath) shape).curveTo(-3257.5198, 84.89024, -3301.8784, 76.694244, -3345.7273, 62.61084);
        ((GeneralPath) shape).curveTo(-3361.44, 57.56424, -3364.1643, 55.80734, -3369.7334, 47.12934);
        ((GeneralPath) shape).curveTo(-3373.5266, 41.218742, -3375.3743, 33.80574, -3376.8513, 18.572142);
        ((GeneralPath) shape).curveTo(-3378.2517, 4.1288414, -3377.6567, 0.18394089, -3372.342, -11.318859);
        ((GeneralPath) shape).curveTo(-3364.7778, -27.690859, -3354.3127, -34.22786, -3323.617, -41.75536);
        ((GeneralPath) shape).curveTo(-3316.8027, -43.42636, -3294.1274, -48.22086, -3273.2275, -52.409798);
        ((GeneralPath) shape).curveTo(-3252.3276, -56.59871, -3230.7275, -61.12235, -3225.2275, -62.462326);
        ((GeneralPath) shape).curveTo(-3217.3433, -64.38319, -3210.5728, -65.11485, -3193.2275, -65.92051);
        ((GeneralPath) shape).curveTo(-3181.1274, -66.48252, -3169.762, -67.40988, -3167.971, -67.98131);
        ((GeneralPath) shape).curveTo(-3166.18, -68.552734, -3162.3547, -71.16958, -3159.471, -73.79651);
        ((GeneralPath) shape).curveTo(-3156.5872, -76.42344, -3152.7864, -79.31308, -3151.0251, -80.21792);
        ((GeneralPath) shape).curveTo(-3147.7502, -81.90029, -3139.6177, -88.54815, -3124.5378, -101.869736);
        ((GeneralPath) shape).curveTo(-3116.038, -109.37862, -3111.4648, -112.30025, -3106.6829, -113.27637);
        ((GeneralPath) shape).curveTo(-3105.2832, -113.562065, -3101.3147, -115.62067, -3097.8638, -117.851036);
        ((GeneralPath) shape).curveTo(-3090.3225, -122.725266, -3090.046, -124.8318, -3096.7363, -126.440895);
        ((GeneralPath) shape).curveTo(-3099.8262, -127.18404, -3101.6045, -128.27068, -3102.4358, -129.92386);
        ((GeneralPath) shape).curveTo(-3104.1838, -133.3999, -3106.6218, -134.86111, -3110.6685, -134.85806);
        ((GeneralPath) shape).lineTo(-3114.2273, -134.85506);
        ((GeneralPath) shape).lineTo(-3114.2854, -127.529465);
        ((GeneralPath) shape).curveTo(-3114.3674, -117.14192, -3116.1184, -114.54782, -3126.881, -108.8719);
        ((GeneralPath) shape).curveTo(-3131.5862, -106.3906, -3136.064, -103.8385, -3136.8318, -103.200584);
        ((GeneralPath) shape).curveTo(-3138.9402, -101.44892, -3169.492, -100.83968, -3303.1172, -99.88466);
        ((GeneralPath) shape).curveTo(-3390.8833, -99.257385, -3423.195, -98.72268, -3423.7102, -97.889046);
        ((GeneralPath) shape).curveTo(-3424.8408, -96.059616, -3425.7224, -59.625916, -3425.725, -14.610443);
        ((GeneralPath) shape).curveTo(-3425.726, 8.3520565, -3425.97, 27.139557, -3426.2659, 27.139557);
        ((GeneralPath) shape).curveTo(-3427.1443, 27.139557, -3460.9578, 10.393757, -3464.313, 8.297157);
        ((GeneralPath) shape).lineTo(-3467.3982, 6.3692575);
        ((GeneralPath) shape).lineTo(-3468.0837, -41.99564);
        ((GeneralPath) shape).curveTo(-3468.4607, -68.59627, -3469.044, -92.27294, -3469.3801, -94.61044);
        ((GeneralPath) shape).lineTo(-3469.991, -98.86044);
        ((GeneralPath) shape).lineTo(-3529.349, -98.86044);
        ((GeneralPath) shape).lineTo(-3588.7075, -98.86044);
        ((GeneralPath) shape).lineTo(-3596.8005, -108.61044);
        ((GeneralPath) shape).curveTo(-3606.2063, -119.94223, -3612.934, -128.76804, -3623.868, -144.1187);
        ((GeneralPath) shape).lineTo(-3631.7278, -155.1542);
        ((GeneralPath) shape).lineTo(-3631.7278, -186.00748);
        ((GeneralPath) shape).lineTo(-3631.7278, -216.86075);
        ((GeneralPath) shape).lineTo(-3603.2278, -216.86075);
        ((GeneralPath) shape).lineTo(-3574.7278, -216.86075);
        ((GeneralPath) shape).lineTo(-3574.7278, -235.36075);
        ((GeneralPath) shape).lineTo(-3574.7278, -253.86075);
        ((GeneralPath) shape).lineTo(-3585.588, -253.86075);
        ((GeneralPath) shape).lineTo(-3596.448, -253.86075);
        ((GeneralPath) shape).lineTo(-3597.0828, -292.11075);
        ((GeneralPath) shape).curveTo(-3597.432, -313.14825, -3598.0093, -393.69824, -3598.3655, -471.11075);
        ((GeneralPath) shape).lineTo(-3599.0134, -611.8607);
        ((GeneralPath) shape).lineTo(-3567.5093, -611.8607);
        ((GeneralPath) shape).lineTo(-3536.0051, -611.8607);
        ((GeneralPath) shape).lineTo(-3535.3696, -553.6107);
        ((GeneralPath) shape).curveTo(-3535.0203, -521.57324, -3534.4448, -441.26355, -3534.091, -375.14478);
        ((GeneralPath) shape).lineTo(-3533.4478, -254.92883);
        ((GeneralPath) shape).lineTo(-3544.8376, -254.64478);
        ((GeneralPath) shape).lineTo(-3556.2275, -254.36072);
        ((GeneralPath) shape).lineTo(-3556.4998, -235.61072);
        ((GeneralPath) shape).lineTo(-3556.7717, -216.86072);
        ((GeneralPath) shape).lineTo(-3527.7498, -216.86072);
        ((GeneralPath) shape).lineTo(-3498.7275, -216.86072);
        ((GeneralPath) shape).lineTo(-3498.7275, -185.36072);
        ((GeneralPath) shape).lineTo(-3498.7275, -153.86072);
        ((GeneralPath) shape).lineTo(-3460.069, -153.86072);
        ((GeneralPath) shape).lineTo(-3421.4106, -153.86072);
        ((GeneralPath) shape).lineTo(-3427.4832, -160.18465);
        ((GeneralPath) shape).curveTo(-3434.3167, -167.30096, -3436.3318, -172.34671, -3435.2422, -179.61264);
        ((GeneralPath) shape).curveTo(-3434.694, -183.26851, -3433.4204, -185.231, -3427.6614, -191.29356);
        ((GeneralPath) shape).curveTo(-3415.6826, -203.904, -3412.5776, -205.29478, -3404.154, -201.8224);
        ((GeneralPath) shape).curveTo(-3400.2551, -200.21521, -3397.0515, -201.02722, -3392.256, -204.83812);
        ((GeneralPath) shape).curveTo(-3390.1643, -206.50055, -3387.6724, -207.86072, -3386.7188, -207.86072);
        ((GeneralPath) shape).curveTo(-3385.7651, -207.86072, -3380.3145, -205.6621, -3374.6062, -202.97487);
        ((GeneralPath) shape).curveTo(-3359.2358, -195.73906, -3355.721, -195.61412, -3349.0317, -202.06578);
        ((GeneralPath) shape).curveTo(-3346.1917, -204.80505, -3345.5237, -205.03026, -3343.0317, -204.0888);
        ((GeneralPath) shape).curveTo(-3341.4895, -203.50615, -3338.711, -202.7669, -3336.8574, -202.44604);
        ((GeneralPath) shape).curveTo(-3329.9, -201.2417, -3277.0107, -198.74681, -3271.8435, -199.37921);
        ((GeneralPath) shape).curveTo(-3265.35, -200.17393, -3262.324, -202.7877, -3261.3948, -208.40448);
        ((GeneralPath) shape).curveTo(-3260.9866, -210.87228, -3259.0073, -214.61806, -3256.1338, -218.36072);
        ((GeneralPath) shape).curveTo(-3253.6003, -221.66072, -3250.4822, -226.65729, -3249.2048, -229.4642);
        ((GeneralPath) shape).curveTo(-3247.3347, -233.57338, -3246.0393, -234.9617, -3242.555, -236.58998);
        ((GeneralPath) shape).curveTo(-3236.9893, -239.19098, -3235.976, -239.38467, -3212.4534, -242.34532);
        ((GeneralPath) shape).curveTo(-3194.0105, -244.66658, -3192.3945, -244.72876, -3188.4534, -243.26884);
        ((GeneralPath) shape).curveTo(-3186.1292, -242.40793, -3181.0227, -240.6665, -3177.1055, -239.39902);
        ((GeneralPath) shape).curveTo(-3167.4827, -236.28532, -3161.7405, -233.286, -3149.377, -224.91531);
        ((GeneralPath) shape).curveTo(-3133.7634, -214.34431, -3131.461, -213.51552, -3119.3044, -214.09073);
        ((GeneralPath) shape).curveTo(-3111.6296, -214.45387, -3107.3206, -215.24835, -3101.2275, -217.42355);
        ((GeneralPath) shape).curveTo(-3093.4873, -220.18686, -3092.6514, -220.27481, -3075.481, -220.1327);
        ((GeneralPath) shape).curveTo(-3057.9731, -219.98781, -3057.7283, -220.01529, -3057.294, -222.17325);
        ((GeneralPath) shape).curveTo(-3057.0518, -223.37634, -3056.5864, -231.99968, -3056.2603, -241.33624);
        ((GeneralPath) shape).curveTo(-3055.9338, -250.6728, -3055.005, -261.1662, -3054.1958, -264.65488);
        ((GeneralPath) shape).curveTo(-3053.3867, -268.14355, -3052.2769, -280.37122, -3051.7295, -291.82742);
        ((GeneralPath) shape).curveTo(-3049.7903, -332.40518, -3047.5212, -347.0145, -3039.111, -373.06912);
        ((GeneralPath) shape).curveTo(-3034.9004, -386.11383, -3031.471, -394.01984, -3028.114, -398.42102);
        ((GeneralPath) shape).curveTo(-3022.1592, -406.2281, -3021.4917, -409.97684, -3020.647, -440.36066);
        ((GeneralPath) shape).curveTo(-3019.4856, -482.12997, -3016.4246, -495.24133, -3002.5208, -518.0035);
        ((GeneralPath) shape).lineTo(-3000.2957, -521.6463);
        ((GeneralPath) shape).lineTo(-3003.4556, -526.72925);
        ((GeneralPath) shape).curveTo(-3005.229, -529.5822, -3006.1914, -532.0742, -3005.649, -532.4094);
        ((GeneralPath) shape).curveTo(-3004.4707, -533.13763, -3009.1313, -541.9831, -3012.1091, -544.67053);
        ((GeneralPath) shape).curveTo(-3014.2026, -546.5598, -3014.4387, -546.53723, -3031.728, -542.79834);
        ((GeneralPath) shape).curveTo(-3050.9136, -538.64935, -3054.6118, -538.60425, -3061.3362, -542.437);
        ((GeneralPath) shape).curveTo(-3068.1897, -546.3434, -3069.0886, -548.59515, -3068.4465, -560.247);
        ((GeneralPath) shape).lineTo(-3067.8933, -570.2889);
        ((GeneralPath) shape).lineTo(-3072.4233, -574.8189);
        ((GeneralPath) shape).curveTo(-3076.709, -579.1046, -3076.8933, -579.51483, -3075.8408, -582.4257);
        ((GeneralPath) shape).curveTo(-3074.22, -586.9083, -3074.4143, -587.6469, -3077.6572, -589.3239);
        ((GeneralPath) shape).curveTo(-3081.4304, -591.27515, -3082.128, -593.6593, -3080.2444, -598.16736);
        ((GeneralPath) shape).curveTo(-3078.4248, -602.522, -3078.274, -608.0064, -3079.928, -609.6605);
        ((GeneralPath) shape).curveTo(-3080.588, -610.3205, -3082.9958, -610.86053, -3085.2788, -610.86053);
        ((GeneralPath) shape).curveTo(-3093.9448, -610.86053, -3099.728, -614.2743, -3099.728, -619.3898);
        ((GeneralPath) shape).curveTo(-3099.728, -623.99805, -3097.882, -628.6841, -3088.1194, -648.85803);
        ((GeneralPath) shape).lineTo(-3079.4543, -666.7638);
        ((GeneralPath) shape).lineTo(-3081.3413, -670.56213);
        ((GeneralPath) shape).curveTo(-3082.8962, -673.6923, -3083.2207, -676.55945, -3083.185, -686.8605);
        ((GeneralPath) shape).curveTo(-3083.147, -697.84985, -3082.8079, -700.3273, -3080.3774, -707.3605);
        ((GeneralPath) shape).curveTo(-3078.857, -711.7605, -3075.766, -718.5105, -3073.509, -722.3605);
        ((GeneralPath) shape).curveTo(-3068.2017, -731.41327, -3054.322, -745.303, -3045.221, -750.6687);
        ((GeneralPath) shape).curveTo(-3036.1858, -755.99567, -3022.8877, -761.42664, -3021.7458, -760.256);
        ((GeneralPath) shape).curveTo(-3020.957, -759.4473, -2990.164, -682.7032, -2989.0098, -678.66895);
        ((GeneralPath) shape).curveTo(-2988.7012, -677.5909, -2989.8457, -675.81836, -2992.1653, -673.7818);
        ((GeneralPath) shape).curveTo(-2994.167, -672.02423, -2997.0251, -668.51044, -2998.5166, -665.9734);
        ((GeneralPath) shape).curveTo(-3000.858, -661.9906, -3001.2285, -660.26294, -3001.2285, -653.32465);
        ((GeneralPath) shape).curveTo(-3001.2285, -646.56964, -3000.803, -644.46747, -2998.5586, -640.1365);
        ((GeneralPath) shape).lineTo(-2995.8884, -634.98425);
        ((GeneralPath) shape).lineTo(-3013.9924, -618.1724);
        ((GeneralPath) shape).curveTo(-3030.8892, -602.48157, -3032.3257, -601.38116, -3035.5356, -601.6692);
        ((GeneralPath) shape).curveTo(-3042.14, -602.26184, -3046.143, -595.27496, -3041.7288, -590.86053);
        ((GeneralPath) shape).curveTo(-3038.3167, -587.44836, -3033.2192, -588.46423, -3031.3413, -592.9308);
        ((GeneralPath) shape).curveTo(-3030.3484, -595.29205, -3005.4272, -619.5858, -2995.253, -628.1106);
        ((GeneralPath) shape).lineTo(-2991.9707, -630.8606);
        ((GeneralPath) shape).lineTo(-2986.0999, -628.1261);
        ((GeneralPath) shape).curveTo(-2972.0671, -621.59015, -2956.3633, -627.1049, -2949.0864, -641.124);
        ((GeneralPath) shape).curveTo(-2948.1624, -642.9041, -2947.201, -647.5286, -2946.9497, -651.40076);
        ((GeneralPath) shape).curveTo(-2946.5754, -657.16974, -2946.8997, -659.387, -2948.7468, -663.6802);
        ((GeneralPath) shape).curveTo(-2951.1113, -669.17676, -2959.1575, -677.428, -2963.1235, -678.4234);
        ((GeneralPath) shape).curveTo(-2964.89, -678.86676, -2968.5342, -686.7237, -2983.4116, -722.1622);
        ((GeneralPath) shape).lineTo(-3001.5466, -765.36053);
        ((GeneralPath) shape).lineTo(-2997.388, -766.16907);
        ((GeneralPath) shape).curveTo(-2995.1006, -766.6138, -2986.2542, -766.7726, -2977.7292, -766.522);
        ((GeneralPath) shape).curveTo(-2958.9512, -765.97, -2950.5908, -764.03674, -2936.1055, -756.8969);
        ((GeneralPath) shape).curveTo(-2904.8625, -741.4974, -2888.5684, -708.93286, -2891.7747, -668.2993);
        ((GeneralPath) shape).curveTo(-2892.7185, -656.33704, -2894.1206, -650.73004, -2899.5388, -637.24963);
        ((GeneralPath) shape).curveTo(-2904.1567, -625.7603, -2906.7295, -616.622, -2906.7295, -611.70917);
        ((GeneralPath) shape).curveTo(-2906.7295, -607.28625, -2902.831, -593.26917, -2897.7427, -579.3966);
        ((GeneralPath) shape).curveTo(-2894.356, -570.1631, -2892.5007, -566.7922, -2886.9392, -559.76697);
        ((GeneralPath) shape).curveTo(-2880.1375, -551.175, -2877.6343, -546.59796, -2875.7793, -539.36053);
        ((GeneralPath) shape).curveTo(-2873.7664, -531.5077, -2871.4841, -529.1886, -2850.3752, -513.5478);
        ((GeneralPath) shape).curveTo(-2831.6216, -499.65213, -2806.7292, -473.43, -2801.8752, -462.4572);
        ((GeneralPath) shape).curveTo(-2800.8718, -460.1889, -2798.0447, -455.86423, -2795.5925, -452.84677);
        ((GeneralPath) shape).curveTo(-2781.806, -435.88177, -2772.7292, -421.82336, -2768.8257, -411.38873);
        ((GeneralPath) shape).curveTo(-2763.0337, -395.90677, -2756.0347, -359.67783, -2755.0376, -340.01813);
        ((GeneralPath) shape).curveTo(-2754.3252, -325.97437, -2753.7063, -325.02698, -2748.1643, -329.49963);
        ((GeneralPath) shape).curveTo(-2737.5908, -338.0332, -2725.9868, -342.86053, -2716.047, -342.86053);
        ((GeneralPath) shape).curveTo(-2711.3745, -342.86053, -2710.1626, -342.44748, -2707.7468, -340.03174);
        ((GeneralPath) shape).curveTo(-2706.191, -338.4759, -2704.428, -335.4384, -2703.8293, -333.28174);
        ((GeneralPath) shape).curveTo(-2702.0605, -326.91147, -2702.5012, -314.0557, -2704.7715, -305.7929);
        ((GeneralPath) shape).curveTo(-2707.9343, -294.28116, -2709.9553, -281.87872, -2709.2666, -278.20734);
        ((GeneralPath) shape).curveTo(-2708.8232, -275.8442, -2708.001, -274.7457, -2706.4355, -274.42587);
        ((GeneralPath) shape).curveTo(-2695.6313, -272.21838, -2693.6094, -271.50488, -2692.5505, -269.5264);
        ((GeneralPath) shape).curveTo(-2689.3435, -263.53384, -2689.709, -238.71448, -2693.2021, -225.304);
        ((GeneralPath) shape).curveTo(-2694.0352, -222.10646, -2694.9956, -214.51111, -2695.3367, -208.42542);
        ((GeneralPath) shape).curveTo(-2696.0269, -196.11417, -2695.977, -196.2399, -2708.073, -176.12035);
        ((GeneralPath) shape).curveTo(-2713.3, -167.42587, -2714.3264, -166.21829, -2714.872, -168.12035);
        ((GeneralPath) shape).curveTo(-2715.2256, -169.35245, -2716.018, -183.41054, -2716.6335, -199.36053);
        ((GeneralPath) shape).curveTo(-2717.7295, -227.76878, -2718.1978, -232.86053, -2719.7144, -232.86053);
        ((GeneralPath) shape).curveTo(-2721.308, -232.86053, -2723.9136, -220.0538, -2727.775, -193.24081);
        ((GeneralPath) shape).curveTo(-2735.401, -140.28665, -2736.5857, -133.59874, -2738.9165, -130.36053);
        ((GeneralPath) shape).curveTo(-2742.3306, -125.616714, -2763.2412, -99.826744, -2767.7, -94.860535);
        ((GeneralPath) shape).lineTo(-2771.7402, -90.360535);
        ((GeneralPath) shape).lineTo(-2773.722, -92.70519);
        ((GeneralPath) shape).curveTo(-2774.8118, -93.99477, -2776.1768, -96.80727, -2776.7551, -98.95519);
        ((GeneralPath) shape).curveTo(-2778.1714, -104.21447, -2780.0806, -103.97596, -2785.8623, -97.81744);
        ((GeneralPath) shape).curveTo(-2792.7463, -90.48504, -2794.3662, -85.58157, -2792.8933, -76.532745);
        ((GeneralPath) shape).lineTo(-2791.7258, -69.360535);
        ((GeneralPath) shape).lineTo(-2801.4775, -59.959576);
        ((GeneralPath) shape).curveTo(-2843.5781, -19.373634, -2904.3433, 20.836666, -2959.2292, 44.430164);
        ((GeneralPath) shape).curveTo(-3024.5945, 72.52827, -3102.6404, 89.02806, -3170.6113, 89.118866);
        ((GeneralPath) shape).curveTo(-3184.443, 89.13786, -3186.3308, 88.93086, -3189.343, 87.06917);
        ((GeneralPath) shape).curveTo(-3192.7876, 84.94027, -3194.7292, 85.16717, -3194.7292, 87.69847);
        ((GeneralPath) shape).curveTo(-3194.7292, 89.16197, -3195.288, 89.20157, -3205.7292, 88.47837);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-3133.2583, -155.81058);
        ((GeneralPath) shape).curveTo(-3132.3167, -157.3342, -3135.9722, -158.74774, -3146.1475, -160.79463);
        ((GeneralPath) shape).curveTo(-3157.3306, -163.04427, -3165.0535, -166.84926, -3173.7864, -174.41197);
        ((GeneralPath) shape).curveTo(-3180.507, -180.23209, -3186.0752, -183.32497, -3188.297, -182.47226);
        ((GeneralPath) shape).curveTo(-3190.5664, -181.60141, -3190.028, -180.26627, -3185.227, -174.86073);
        ((GeneralPath) shape).curveTo(-3179.3218, -168.2117, -3179.3044, -165.52116, -3185.143, -161.91252);
        ((GeneralPath) shape).curveTo(-3190.7366, -158.45554, -3202.3928, -157.82082, -3302.2268, -155.53712);
        ((GeneralPath) shape).curveTo(-3308.2769, -155.39873, -3272.866, -155.18993, -3223.536, -155.07312);
        ((GeneralPath) shape).curveTo(-3167.7366, -154.941, -3133.623, -155.21965, -3133.2578, -155.81058);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-3208.3342, -188.44254);
        ((GeneralPath) shape).curveTo(-3206.4207, -193.42902, -3211.105, -199.86075, -3216.6504, -199.86075);
        ((GeneralPath) shape).curveTo(-3221.2515, -199.86075, -3220.5374, -195.63564, -3214.918, -189.61075);
        ((GeneralPath) shape).curveTo(-3212.0566, -186.5428, -3209.2542, -186.04553, -3208.3342, -188.44254);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-3236.7998, -197.4956);
        ((GeneralPath) shape).curveTo(-3234.586, -200.31001, -3233.9854, -207.14914, -3235.714, -209.86075);
        ((GeneralPath) shape).curveTo(-3237.1658, -212.138, -3239.6646, -210.10172, -3243.6643, -203.38217);
        ((GeneralPath) shape).curveTo(-3246.9658, -197.836, -3247.0273, -197.55344, -3245.2231, -196.23424);
        ((GeneralPath) shape).curveTo(-3242.322, -194.11293, -3239.0784, -194.59866, -3236.7996, -197.4956);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(-2980.8042, -646.7838);
        ((GeneralPath) shape).curveTo(-2984.621, -650.6005, -2984.6804, -654.763, -2980.9773, -658.9054);
        ((GeneralPath) shape).curveTo(-2972.7285, -668.1326, -2959.3464, -656.409, -2967.3162, -646.93744);
        ((GeneralPath) shape).curveTo(-2970.9172, -642.6579, -2976.6135, -642.593, -2980.8042, -646.7838);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x000001));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

