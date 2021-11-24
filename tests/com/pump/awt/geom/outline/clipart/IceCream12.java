package com.pump.awt.geom.outline.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

import static java.awt.Color.BLACK;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/306633/ice-cream-12
 * </p>
 */
public class IceCream12 implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public IceCream12() {
        this(1004, 1528);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public IceCream12(int width, int height) {
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
        double coef = Math.min((double) width / (double) 1004, (double) height / (double) 1528);

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
        g.transform(new AffineTransform(1.3333334f, 0, 0, 1.3333334f, 0, 0));

        // _0

        // _0_0

        // _0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(530.16, 32.11);
        ((GeneralPath) shape).curveTo(534.0, 13.800001, 553.37, -0.069999695, 572.13, 5.7700005);
        ((GeneralPath) shape).curveTo(581.27, 9.1, 590.79, 11.27, 600.12, 14.01);
        ((GeneralPath) shape).curveTo(612.43, 17.44, 625.46, 22.42, 635.17, 30.12);
        ((GeneralPath) shape).curveTo(643.13995, 41.800003, 627.23, 46.67, 626.07, 57.120003);
        ((GeneralPath) shape).curveTo(618.87, 82.240005, 610.58, 107.16, 603.03, 132.18);
        ((GeneralPath) shape).curveTo(600.51, 143.73999, 595.92004, 154.95, 592.0, 166.04999);
        ((GeneralPath) shape).curveTo(588.29, 173.29999, 585.65, 181.12, 584.03, 189.09999);
        ((GeneralPath) shape).curveTo(582.61005, 195.35999, 580.23004, 201.51999, 577.08, 207.09999);
        ((GeneralPath) shape).curveTo(570.37, 219.32999, 564.52, 232.54, 560.98004, 246.09);
        ((GeneralPath) shape).curveTo(560.43005, 249.67, 559.49005, 253.31999, 557.06006, 256.12);
        ((GeneralPath) shape).curveTo(548.5801, 272.38998, 543.73004, 290.61, 537.8901, 308.02);
        ((GeneralPath) shape).curveTo(536.9501, 312.19, 536.62006, 316.63998, 534.19006, 320.3);
        ((GeneralPath) shape).curveTo(527.4001, 338.36, 520.2701, 356.50998, 514.98004, 375.06998);
        ((GeneralPath) shape).curveTo(513.41003, 382.72998, 510.49005, 390.15997, 507.05005, 397.14996);
        ((GeneralPath) shape).curveTo(497.76004, 419.44995, 490.77005, 442.87997, 483.98004, 466.07996);
        ((GeneralPath) shape).curveTo(483.29004, 469.96997, 482.39005, 473.93994, 480.07004, 477.21997);
        ((GeneralPath) shape).curveTo(479.26004, 483.47998, 468.91003, 491.64996, 472.78003, 496.82996);
        ((GeneralPath) shape).curveTo(479.99002, 504.46997, 485.20004, 513.86, 490.15002, 523.08997);
        ((GeneralPath) shape).curveTo(492.51, 522.68994, 492.07004, 519.72, 493.07004, 518.05994);
        ((GeneralPath) shape).curveTo(517.46, 456.26993, 540.12006, 394.14993, 561.26, 331.22992);
        ((GeneralPath) shape).curveTo(563.99, 322.03992, 570.14, 313.13992, 569.2, 303.22992);
        ((GeneralPath) shape).curveTo(565.5, 300.82993, 568.52, 297.6299, 571.18, 296.0299);
        ((GeneralPath) shape).curveTo(575.98, 286.9899, 575.93, 275.8599, 580.89996, 266.8699);
        ((GeneralPath) shape).curveTo(586.26996, 253.0999, 590.58997, 238.6999, 595.89996, 224.8299);
        ((GeneralPath) shape).curveTo(598.97, 216.72989, 604.29, 208.47989, 611.72, 203.8799);
        ((GeneralPath) shape).curveTo(624.89996, 196.8999, 639.73, 200.6099, 653.05, 205.0699);
        ((GeneralPath) shape).curveTo(662.27997, 207.4799, 669.8, 214.0099, 677.01996, 219.9399);
        ((GeneralPath) shape).curveTo(693.17993, 226.4299, 684.67993, 241.9599, 680.01996, 253.0899);
        ((GeneralPath) shape).curveTo(678.11993, 260.6399, 675.82996, 268.2799, 672.07996, 275.1199);
        ((GeneralPath) shape).curveTo(666.2999, 289.0599, 660.67, 303.3799, 656.9899, 318.0799);
        ((GeneralPath) shape).curveTo(655.42993, 325.7299, 652.4599, 333.0899, 649.0399, 340.0699);
        ((GeneralPath) shape).curveTo(645.5399, 347.0399, 642.68994, 354.4499, 640.9799, 362.0799);
        ((GeneralPath) shape).curveTo(635.17993, 379.9299, 627.24994, 397.24988, 619.0899, 414.1099);
        ((GeneralPath) shape).curveTo(609.17993, 433.84988, 601.0499, 454.74988, 591.8599, 474.8899);
        ((GeneralPath) shape).curveTo(585.80994, 488.34988, 580.11993, 502.1199, 573.0899, 515.10986);
        ((GeneralPath) shape).curveTo(569.0399, 520.70984, 566.3599, 527.28986, 564.9699, 534.03986);
        ((GeneralPath) shape).curveTo(553.1299, 566.9498, 540.80994, 599.9498, 527.0999, 632.13983);
        ((GeneralPath) shape).curveTo(526.0099, 638.96985, 509.5999, 646.40985, 519.7799, 649.1998);
        ((GeneralPath) shape).curveTo(533.2399, 655.0598, 543.3899, 666.7598, 550.9999, 679.02985);
        ((GeneralPath) shape).curveTo(553.16986, 681.7498, 554.5099, 676.22986, 555.9599, 674.9398);
        ((GeneralPath) shape).curveTo(584.7999, 623.01984, 623.5199, 577.2898, 653.0199, 525.9998);
        ((GeneralPath) shape).curveTo(660.2799, 511.81982, 667.8499, 497.2998, 677.9499, 484.9198);
        ((GeneralPath) shape).curveTo(683.3499, 478.9698, 688.5999, 472.7498, 693.0999, 466.0998);
        ((GeneralPath) shape).curveTo(693.7699, 464.8298, 694.7899, 463.7998, 695.9499, 462.9798);
        ((GeneralPath) shape).curveTo(708.5699, 452.0498, 728.7499, 441.3898, 743.8799, 454.0998);
        ((GeneralPath) shape).curveTo(754.04987, 464.7598, 746.5699, 478.4498, 741.0199, 489.05978);
        ((GeneralPath) shape).curveTo(732.8899, 501.7498, 721.7999, 512.5198, 711.1099, 523.0998);
        ((GeneralPath) shape).curveTo(704.93994, 528.0198, 699.9699, 534.2498, 696.0199, 541.0398);
        ((GeneralPath) shape).curveTo(654.2799, 597.8398, 604.67993, 648.6798, 564.8399, 706.8498);
        ((GeneralPath) shape).curveTo(558.1899, 711.8698, 561.9699, 722.06976, 558.4199, 728.9698);
        ((GeneralPath) shape).curveTo(574.05994, 729.37976, 590.5499, 737.0198, 595.00995, 753.0498);
        ((GeneralPath) shape).curveTo(599.18994, 767.8598, 593.27997, 781.7098, 584.16, 792.9998);
        ((GeneralPath) shape).curveTo(569.12, 809.8598, 533.89996, 812.3698, 525.87, 787.14984);
        ((GeneralPath) shape).curveTo(518.61, 791.9398, 512.66, 798.6998, 504.91998, 802.9498);
        ((GeneralPath) shape).curveTo(496.62, 805.01984, 487.74, 808.8598, 479.37997, 804.8598);
        ((GeneralPath) shape).curveTo(460.02997, 796.4098, 459.96997, 768.9798, 469.83, 753.6498);
        ((GeneralPath) shape).curveTo(441.55, 750.2698, 408.62, 757.0298, 380.31998, 750.43976);
        ((GeneralPath) shape).curveTo(367.21, 769.98975, 356.90997, 791.5298, 341.61996, 809.59973);
        ((GeneralPath) shape).curveTo(328.57996, 824.2597, 306.62997, 824.4497, 289.00995, 819.72974);
        ((GeneralPath) shape).curveTo(268.62994, 816.05975, 242.01994, 826.36975, 227.25995, 806.75977);
        ((GeneralPath) shape).curveTo(221.95995, 803.56976, 225.70995, 794.0898, 221.04994, 792.1598);
        ((GeneralPath) shape).curveTo(194.07994, 799.6198, 169.02994, 815.7398, 140.30994, 815.94977);
        ((GeneralPath) shape).curveTo(115.339935, 809.9098, 90.00993, 818.2898, 64.80994, 818.74976);
        ((GeneralPath) shape).curveTo(61.629936, 820.16974, 54.289936, 817.84973, 53.029938, 822.05975);
        ((GeneralPath) shape).curveTo(56.619938, 838.0798, 53.949936, 854.75977, 57.149937, 870.87976);
        ((GeneralPath) shape).curveTo(67.699936, 932.8898, 111.85994, 986.25977, 168.55994, 1012.3998);
        ((GeneralPath) shape).curveTo(184.13994, 1020.1398, 200.30994, 1026.5698, 216.06993, 1033.8998);
        ((GeneralPath) shape).curveTo(229.35992, 1050.1097, 252.15993, 1049.8397, 271.47992, 1050.4098);
        ((GeneralPath) shape).curveTo(306.8499, 1055.7297, 342.53992, 1059.1598, 375.01993, 1049.1598);
        ((GeneralPath) shape).curveTo(395.20993, 1040.0798, 415.44992, 1029.1998, 438.21994, 1029.0098);
        ((GeneralPath) shape).curveTo(479.26993, 1015.5998, 501.93994, 975.79974, 529.2899, 945.29974);
        ((GeneralPath) shape).curveTo(563.5099, 902.48975, 569.9799, 846.59973, 584.9599, 795.85974);
        ((GeneralPath) shape).curveTo(598.2699, 783.43976, 601.6899, 767.37976, 599.7599, 750.0197);
        ((GeneralPath) shape).lineTo(599.85986, 749.1997);
        ((GeneralPath) shape).curveTo(603.5099, 743.9597, 613.23987, 751.9197, 615.03986, 756.9297);
        ((GeneralPath) shape).curveTo(618.4498, 766.8597, 618.02985, 777.1697, 615.03986, 787.15967);
        ((GeneralPath) shape).curveTo(612.83984, 795.0997, 606.0098, 801.89966, 598.9498, 805.87964);
        ((GeneralPath) shape).curveTo(592.72986, 808.95966, 591.2398, 816.57965, 589.47986, 822.5996);
        ((GeneralPath) shape).curveTo(582.03986, 856.2596, 571.76984, 889.3696, 557.85986, 920.9096);
        ((GeneralPath) shape).curveTo(547.53986, 942.5296, 537.32983, 965.1996, 521.09985, 983.1096);
        ((GeneralPath) shape).curveTo(515.89984, 987.6596, 511.64984, 993.12964, 507.87985, 998.88965);
        ((GeneralPath) shape).curveTo(507.65985, 999.1697, 507.21985, 999.7297, 506.99985, 1000.00964);
        ((GeneralPath) shape).curveTo(492.34985, 1013.7897, 478.75986, 1029.0996, 460.96985, 1039.0197);
        ((GeneralPath) shape).curveTo(464.45984, 1043.5297, 468.63986, 1047.7296, 473.93985, 1050.0497);
        ((GeneralPath) shape).curveTo(479.47986, 1053.9996, 486.91986, 1058.4697, 488.02985, 1065.8896);
        ((GeneralPath) shape).curveTo(489.95984, 1080.7797, 498.86984, 1093.8197, 499.13983, 1108.9796);
        ((GeneralPath) shape).curveTo(498.74982, 1120.4396, 493.70984, 1132.5796, 483.04984, 1138.0496);
        ((GeneralPath) shape).curveTo(475.15982, 1142.0496, 465.28983, 1142.7196, 459.17984, 1135.2996);
        ((GeneralPath) shape).curveTo(406.25983, 1141.0896, 352.94983, 1137.0195, 299.93982, 1141.0996);
        ((GeneralPath) shape).curveTo(263.96982, 1138.5696, 226.45981, 1142.7496, 192.02982, 1129.8696);
        ((GeneralPath) shape).curveTo(155.63982, 1120.5796, 167.34982, 1066.6597, 194.00981, 1053.0796);
        ((GeneralPath) shape).curveTo(195.91982, 1052.2096, 199.0498, 1051.8696, 199.10982, 1049.2196);
        ((GeneralPath) shape).curveTo(185.77982, 1042.3896, 172.13982, 1036.1996, 159.05981, 1028.9095);
        ((GeneralPath) shape).curveTo(149.7398, 1024.0396, 141.81981, 1016.8895, 133.82982, 1010.14954);
        ((GeneralPath) shape).curveTo(115.34982, 995.10956, 97.42982, 979.28955, 81.95982, 961.09955);
        ((GeneralPath) shape).curveTo(74.02982, 952.26953, 67.819824, 941.86957, 63.049824, 931.03955);
        ((GeneralPath) shape).curveTo(60.679825, 924.9495, 58.87982, 918.4495, 54.909824, 913.15955);
        ((GeneralPath) shape).curveTo(52.489822, 910.01953, 51.869823, 906.0095, 50.889824, 902.27954);
        ((GeneralPath) shape).curveTo(44.809822, 878.3096, 38.029823, 854.29956, 37.819824, 829.35956);
        ((GeneralPath) shape).curveTo(31.499825, 829.8796, 24.999825, 830.5795, 19.019825, 827.9996);
        ((GeneralPath) shape).curveTo(11.729825, 825.67957, 6.9998245, 818.3796, 5.9998245, 811.0696);
        ((GeneralPath) shape).curveTo(3.3598244, 800.53955, 3.8498244, 789.61957, 8.849825, 779.85956);
        ((GeneralPath) shape).curveTo(16.699825, 767.51953, 30.459826, 758.83954, 44.94982, 757.03955);
        ((GeneralPath) shape).curveTo(69.80982, 754.17957, 95.10982, 750.1995, 120.08982, 753.20953);
        ((GeneralPath) shape).curveTo(121.04982, 760.27954, 110.40982, 756.73956, 105.68982, 758.64954);
        ((GeneralPath) shape).curveTo(81.28982, 761.4495, 55.92982, 762.3795, 32.97982, 771.9395);
        ((GeneralPath) shape).curveTo(17.789822, 777.02954, 15.929821, 798.83954, 25.72982, 809.51953);
        ((GeneralPath) shape).curveTo(54.77982, 813.96954, 86.14982, 811.8895, 115.95982, 807.02954);
        ((GeneralPath) shape).curveTo(114.749825, 802.6395, 111.83982, 798.97955, 109.969826, 794.8795);
        ((GeneralPath) shape).curveTo(109.18983, 789.7295, 109.109825, 784.46954, 109.069824, 779.2995);
        ((GeneralPath) shape).curveTo(110.82983, 774.1095, 112.29983, 768.7595, 115.139824, 764.0195);
        ((GeneralPath) shape).curveTo(118.20982, 761.4695, 120.62982, 755.19946, 125.57983, 756.5195);
        ((GeneralPath) shape).curveTo(124.55983, 768.3595, 114.819824, 779.13947, 118.749825, 791.80945);
        ((GeneralPath) shape).curveTo(126.109825, 819.38947, 161.57983, 808.8995, 180.22983, 800.22943);
        ((GeneralPath) shape).curveTo(197.44983, 792.87946, 219.86983, 791.61945, 231.45982, 776.25946);
        ((GeneralPath) shape).curveTo(242.34982, 776.1495, 235.71982, 792.12946, 239.58983, 798.2795);
        ((GeneralPath) shape).curveTo(254.82983, 810.2695, 275.3698, 799.6195, 292.69983, 804.13947);
        ((GeneralPath) shape).curveTo(314.49982, 814.42944, 338.8098, 799.9795, 348.88983, 779.93945);
        ((GeneralPath) shape).curveTo(355.07983, 768.35944, 364.96982, 759.22943, 370.19983, 747.07947);
        ((GeneralPath) shape).curveTo(372.60983, 741.79944, 375.16983, 733.81946, 366.87982, 733.92944);
        ((GeneralPath) shape).curveTo(363.68982, 722.22943, 366.40982, 710.36945, 370.06982, 699.18945);
        ((GeneralPath) shape).curveTo(381.75983, 661.36945, 357.88983, 623.67944, 333.76984, 596.2894);
        ((GeneralPath) shape).curveTo(304.41983, 562.93945, 257.15985, 557.5394, 215.41983, 558.37946);
        ((GeneralPath) shape).curveTo(174.51984, 563.56946, 133.05983, 577.79944, 102.76983, 606.81946);
        ((GeneralPath) shape).curveTo(80.43983, 627.0995, 56.299828, 650.43945, 51.66983, 681.75946);
        ((GeneralPath) shape).curveTo(49.659832, 701.57947, 46.46983, 723.9795, 58.71983, 741.30945);
        ((GeneralPath) shape).curveTo(60.34983, 744.61945, 67.97983, 752.5195, 60.19983, 753.4094);
        ((GeneralPath) shape).curveTo(53.59983, 752.0294, 46.639828, 748.7194, 43.81983, 742.2194);
        ((GeneralPath) shape).curveTo(28.109833, 710.98944, 30.239832, 673.2894, 46.839832, 642.8494);
        ((GeneralPath) shape).curveTo(67.51984, 611.2594, 96.60983, 583.85944, 130.06984, 566.2194);
        ((GeneralPath) shape).curveTo(143.16985, 561.3194, 116.24984, 560.5394, 114.22984, 552.8294);
        ((GeneralPath) shape).curveTo(95.14984, 519.7894, 136.89984, 470.1694, 172.92984, 487.1694);
        ((GeneralPath) shape).curveTo(180.98984, 494.9994, 192.51984, 497.7094, 200.09984, 505.9494);
        ((GeneralPath) shape).curveTo(207.43983, 514.0694, 205.12984, 527.5294, 200.14984, 536.1794);
        ((GeneralPath) shape).curveTo(196.00984, 540.52936, 190.41985, 543.0794, 186.10985, 547.1894);
        ((GeneralPath) shape).curveTo(208.07985, 542.6694, 230.76985, 541.4994, 252.93985, 544.6994);
        ((GeneralPath) shape).curveTo(253.24985, 539.0594, 253.34985, 533.3494, 255.06985, 527.9294);
        ((GeneralPath) shape).curveTo(256.28986, 523.1794, 258.97986, 518.8694, 262.86984, 515.89935);
        ((GeneralPath) shape).curveTo(267.92984, 511.66934, 273.01984, 507.32935, 276.89984, 501.94934);
        ((GeneralPath) shape).curveTo(278.47983, 499.83936, 280.55984, 498.18933, 282.80984, 496.85934);
        ((GeneralPath) shape).curveTo(297.69986, 488.33936, 311.87985, 478.57935, 327.70984, 471.79935);
        ((GeneralPath) shape).curveTo(327.20984, 467.46936, 322.04984, 464.95935, 318.88983, 462.16934);
        ((GeneralPath) shape).curveTo(317.87982, 461.46933, 317.20984, 460.41934, 316.78983, 459.29935);
        ((GeneralPath) shape).curveTo(309.3098, 443.07935, 308.85983, 424.31934, 315.98984, 407.93933);
        ((GeneralPath) shape).curveTo(317.23984, 403.80933, 320.11984, 400.12933, 323.80984, 397.89932);
        ((GeneralPath) shape).curveTo(333.88983, 392.2293, 345.04984, 388.26932, 356.78986, 388.9193);
        ((GeneralPath) shape).curveTo(359.48987, 388.83932, 362.41986, 388.51932, 364.81985, 390.0393);
        ((GeneralPath) shape).curveTo(373.65985, 395.29932, 384.60986, 393.2493, 393.99985, 397.0293);
        ((GeneralPath) shape).curveTo(400.10983, 401.3193, 403.73984, 407.5693, 407.12985, 413.9793);
        ((GeneralPath) shape).curveTo(407.82986, 414.9493, 408.15985, 416.0293, 408.10986, 417.23932);
        ((GeneralPath) shape).curveTo(407.98987, 424.54932, 408.08987, 431.92932, 406.98987, 439.18933);
        ((GeneralPath) shape).curveTo(406.72986, 441.72934, 406.18988, 444.38934, 404.12988, 446.11932);
        ((GeneralPath) shape).curveTo(385.36987, 458.61932, 423.1399, 463.73932, 415.0199, 445.12933);
        ((GeneralPath) shape).curveTo(415.1499, 444.02933, 415.4699, 442.97934, 415.9799, 441.98932);
        ((GeneralPath) shape).curveTo(417.1999, 436.3293, 424.55988, 426.93933, 419.05988, 422.0993);
        ((GeneralPath) shape).curveTo(418.95987, 416.29932, 430.54987, 407.7193, 425.02988, 399.1893);
        ((GeneralPath) shape).curveTo(433.10986, 388.6493, 431.4199, 373.7093, 437.86987, 362.8693);
        ((GeneralPath) shape).curveTo(449.0399, 335.94928, 455.01987, 306.3493, 462.0099, 277.8993);
        ((GeneralPath) shape).curveTo(462.9199, 273.1193, 463.37988, 268.1193, 465.9499, 263.8793);
        ((GeneralPath) shape).curveTo(469.3599, 255.5593, 471.52988, 246.7893, 472.96988, 237.9293);
        ((GeneralPath) shape).curveTo(475.46988, 228.61931, 476.8899, 218.7393, 480.9799, 209.9593);
        ((GeneralPath) shape).curveTo(493.0199, 174.36931, 502.4799, 137.8793, 511.30988, 101.319305);
        ((GeneralPath) shape).curveTo(514.84985, 90.36931, 518.09985, 79.2693, 519.90985, 67.889305);
        ((GeneralPath) shape).curveTo(520.47986, 63.809303, 521.03986, 59.669304, 522.89984, 55.939304);
        ((GeneralPath) shape).curveTo(525.84985, 48.199303, 528.33984, 40.239304, 530.15985, 32.1593);
        ((GeneralPath) shape).moveTo(554.1799, 30.3693);
        ((GeneralPath) shape).curveTo(541.83984, 54.2093, 537.0799, 81.429306, 528.90985, 106.7693);
        ((GeneralPath) shape).curveTo(538.26984, 105.5893, 547.64984, 104.029305, 556.91986, 102.499306);
        ((GeneralPath) shape).curveTo(568.9399, 99.529305, 580.48987, 94.86931, 592.6998, 92.75931);
        ((GeneralPath) shape).curveTo(592.3598, 90.01931, 593.1998, 86.46931, 591.89984, 84.249306);
        ((GeneralPath) shape).curveTo(580.6799, 86.6293, 569.9398, 90.71931, 558.9398, 93.89931);
        ((GeneralPath) shape).curveTo(551.2498, 95.54931, 541.4498, 101.51931, 535.02985, 97.12931);
        ((GeneralPath) shape).curveTo(542.3699, 88.90931, 557.60986, 89.49931, 566.8099, 85.07931);
        ((GeneralPath) shape).curveTo(574.8699, 82.86931, 582.79987, 80.18931, 590.85986, 77.96931);
        ((GeneralPath) shape).curveTo(610.02985, 78.94931, 604.1999, 51.789307, 609.85986, 39.429306);
        ((GeneralPath) shape).curveTo(592.28986, 34.539307, 570.9299, 16.609306, 554.1799, 30.369305);
        ((GeneralPath) shape).moveTo(552.97986, 108.78931);
        ((GeneralPath) shape).curveTo(544.5599, 111.319305, 531.13983, 110.069305, 526.01984, 116.08931);
        ((GeneralPath) shape).curveTo(533.9998, 117.68931, 547.21985, 114.20931, 555.97986, 114.16931);
        ((GeneralPath) shape).curveTo(567.8199, 108.86931, 592.73987, 115.15931, 594.76984, 98.95931);
        ((GeneralPath) shape).curveTo(580.1298, 98.77931, 567.4898, 107.939316, 552.97986, 108.789314);
        ((GeneralPath) shape).moveTo(587.39984, 114.40932);
        ((GeneralPath) shape).curveTo(580.9398, 115.67931, 574.40985, 116.649315, 568.02985, 118.22932);
        ((GeneralPath) shape).curveTo(570.83984, 122.73932, 598.33984, 122.37932, 587.39984, 114.40932);
        ((GeneralPath) shape).moveTo(556.71985, 125.469315);
        ((GeneralPath) shape).curveTo(546.10986, 131.54932, 524.2598, 121.149315, 520.83984, 132.93932);
        ((GeneralPath) shape).curveTo(536.4498, 129.53932, 552.7598, 129.56932, 568.16986, 125.88931);
        ((GeneralPath) shape).curveTo(565.72986, 123.12931, 560.02985, 126.12931, 556.71985, 125.469315);
        ((GeneralPath) shape).moveTo(564.1998, 135.12932);
        ((GeneralPath) shape).curveTo(559.1198, 135.49931, 553.9898, 135.85931, 549.0498, 137.09932);
        ((GeneralPath) shape).curveTo(538.8398, 138.84932, 527.8998, 140.33932, 518.1198, 141.94933);
        ((GeneralPath) shape).curveTo(509.4198, 171.92932, 496.6998, 200.73932, 489.12982, 231.07932);
        ((GeneralPath) shape).curveTo(497.38983, 228.39932, 508.1798, 227.11931, 514.6098, 225.15932);
        ((GeneralPath) shape).curveTo(526.1698, 220.50932, 542.1698, 222.30931, 551.0098, 212.87932);
        ((GeneralPath) shape).curveTo(553.82983, 213.05931, 557.88983, 213.40932, 558.9998, 210.05931);
        ((GeneralPath) shape).curveTo(569.1998, 185.3993, 576.2998, 159.48932, 583.9098, 134.04932);
        ((GeneralPath) shape).curveTo(579.69977, 132.55931, 568.0798, 133.15932, 564.19977, 135.12932);
        ((GeneralPath) shape).moveTo(618.7098, 217.80933);
        ((GeneralPath) shape).curveTo(601.19977, 237.56932, 596.9598, 265.29932, 590.0898, 289.99933);
        ((GeneralPath) shape).curveTo(595.4098, 289.53934, 601.0198, 288.61932, 605.9098, 287.20932);
        ((GeneralPath) shape).curveTo(616.8098, 283.7293, 628.6098, 282.92932, 639.06976, 278.17932);
        ((GeneralPath) shape).curveTo(659.66974, 274.4793, 655.31976, 247.95932, 665.8898, 234.03932);
        ((GeneralPath) shape).curveTo(654.3398, 223.00932, 635.31976, 209.55933, 618.7098, 217.80933);
        ((GeneralPath) shape).moveTo(539.3998, 226.10933);
        ((GeneralPath) shape).curveTo(532.05975, 228.42934, 524.5198, 230.02933, 517.11975, 232.10933);
        ((GeneralPath) shape).curveTo(504.52975, 236.63933, 483.69977, 234.74933, 483.24976, 252.11932);
        ((GeneralPath) shape).curveTo(496.83975, 250.33932, 510.17975, 246.59932, 523.6398, 243.92932);
        ((GeneralPath) shape).curveTo(520.37976, 234.83932, 534.6698, 239.30933, 539.10974, 237.75932);
        ((GeneralPath) shape).curveTo(548.66974, 237.90932, 553.5797, 229.75932, 554.10974, 221.34932);
        ((GeneralPath) shape).curveTo(549.54974, 222.88931, 541.94977, 223.25932, 539.3997, 226.10931);
        ((GeneralPath) shape).moveTo(544.1197, 244.37932);
        ((GeneralPath) shape).curveTo(530.6897, 249.83932, 516.65967, 253.57932, 502.6797, 257.30933);
        ((GeneralPath) shape).curveTo(507.01968, 259.43933, 515.1197, 257.26932, 515.9197, 263.24933);
        ((GeneralPath) shape).curveTo(517.0397, 268.65933, 507.84967, 269.87933, 507.38968, 272.98932);
        ((GeneralPath) shape).curveTo(517.0697, 271.29932, 527.7897, 270.92932, 536.6897, 267.8193);
        ((GeneralPath) shape).curveTo(538.3597, 260.5593, 546.3897, 248.3293, 544.1197, 244.3793);
        ((GeneralPath) shape).moveTo(480.53967, 264.0993);
        ((GeneralPath) shape).curveTo(471.19968, 274.2193, 491.81967, 267.1393, 496.10968, 265.9593);
        ((GeneralPath) shape).curveTo(491.8097, 263.4093, 485.5297, 264.72928, 480.53967, 264.0993);
        ((GeneralPath) shape).moveTo(527.51965, 280.4793);
        ((GeneralPath) shape).curveTo(507.93967, 284.64932, 488.62964, 290.7293, 470.28964, 298.3093);
        ((GeneralPath) shape).curveTo(464.63965, 317.6293, 458.47964, 337.2893, 453.29965, 356.5393);
        ((GeneralPath) shape).curveTo(473.26965, 353.7793, 490.98965, 341.1093, 511.07965, 338.42932);
        ((GeneralPath) shape).curveTo(517.99963, 320.49933, 522.89966, 301.83932, 529.93964, 283.95932);
        ((GeneralPath) shape).curveTo(531.2296, 281.20932, 530.96967, 278.87933, 527.51965, 280.4793);
        ((GeneralPath) shape).moveTo(630.0497, 289.0093);
        ((GeneralPath) shape).curveTo(620.7497, 291.9393, 611.3497, 294.48932, 601.89966, 296.92932);
        ((GeneralPath) shape).curveTo(592.1097, 296.87933, 581.43964, 301.21933, 582.90967, 312.81934);
        ((GeneralPath) shape).curveTo(588.9397, 311.88934, 595.26965, 310.70935, 600.9997, 309.36932);
        ((GeneralPath) shape).curveTo(611.3697, 306.79932, 621.6397, 303.81934, 631.9797, 301.11932);
        ((GeneralPath) shape).curveTo(642.38965, 300.8593, 645.95966, 291.1093, 647.2397, 282.34933);
        ((GeneralPath) shape).curveTo(641.70966, 284.94934, 635.1197, 286.41934, 630.0497, 289.00934);
        ((GeneralPath) shape).moveTo(635.4797, 309.45935);
        ((GeneralPath) shape).curveTo(624.1197, 313.29935, 612.14966, 315.24936, 600.88965, 319.28934);
        ((GeneralPath) shape).curveTo(611.2396, 321.63934, 623.7996, 317.59933, 634.74963, 315.95935);
        ((GeneralPath) shape).curveTo(637.13965, 315.26935, 640.0496, 307.53934, 635.4796, 309.45935);
        ((GeneralPath) shape).moveTo(604.6196, 324.52936);
        ((GeneralPath) shape).curveTo(590.6596, 329.18936, 570.20966, 321.42935, 572.1196, 343.89935);
        ((GeneralPath) shape).curveTo(578.95966, 342.47934, 588.4696, 341.26935, 593.76965, 338.00934);
        ((GeneralPath) shape).curveTo(586.88965, 328.17935, 616.19965, 325.38934, 604.6196, 324.52933);
        ((GeneralPath) shape).moveTo(627.50964, 328.43933);
        ((GeneralPath) shape).curveTo(619.71967, 330.54932, 611.77966, 332.21933, 604.20966, 335.06934);
        ((GeneralPath) shape).curveTo(606.50964, 337.93933, 608.62964, 343.03934, 604.20966, 345.30933);
        ((GeneralPath) shape).curveTo(592.6697, 349.77933, 579.6697, 351.18933, 568.33966, 355.30933);
        ((GeneralPath) shape).curveTo(562.76965, 371.8893, 556.31964, 388.30933, 550.94965, 404.94934);
        ((GeneralPath) shape).curveTo(569.15967, 401.38934, 587.44965, 396.34933, 605.77966, 395.02933);
        ((GeneralPath) shape).curveTo(615.64966, 373.9193, 623.1797, 351.77933, 630.7397, 329.77933);
        ((GeneralPath) shape).curveTo(631.71967, 327.28934, 628.90967, 328.30933, 627.5097, 328.43933);
        ((GeneralPath) shape).moveTo(503.4797, 349.37933);
        ((GeneralPath) shape).curveTo(488.0397, 355.67932, 472.73972, 362.85934, 456.2297, 366.05933);
        ((GeneralPath) shape).curveTo(467.5697, 373.26932, 482.8597, 358.1093, 496.3497, 362.69934);
        ((GeneralPath) shape).curveTo(503.1697, 367.35934, 510.6397, 348.00934, 503.4797, 349.37933);
        ((GeneralPath) shape).moveTo(493.5397, 370.57935);
        ((GeneralPath) shape).curveTo(483.8997, 371.55936, 472.7297, 374.18933, 465.0797, 379.17935);
        ((GeneralPath) shape).curveTo(475.70972, 377.50934, 486.3497, 375.76935, 496.98972, 374.20935);
        ((GeneralPath) shape).curveTo(501.3597, 373.09937, 498.18973, 366.18936, 493.5397, 370.57935);
        ((GeneralPath) shape).moveTo(468.6597, 382.53934);
        ((GeneralPath) shape).curveTo(460.3897, 384.52933, 451.9897, 385.67935, 443.5597, 386.69934);
        ((GeneralPath) shape).curveTo(439.7897, 397.43933, 455.7197, 386.99933, 460.6997, 386.66934);
        ((GeneralPath) shape).curveTo(462.95972, 386.66934, 480.1297, 381.50934, 468.6597, 382.53934);
        ((GeneralPath) shape).moveTo(492.4597, 382.42935);
        ((GeneralPath) shape).curveTo(476.07968, 389.72934, 458.8797, 395.20935, 441.44968, 399.34937);
        ((GeneralPath) shape).curveTo(437.9597, 401.62936, 437.6797, 406.79938, 437.24966, 410.65936);
        ((GeneralPath) shape).curveTo(444.22968, 409.68936, 450.86966, 406.27936, 457.33966, 403.41937);
        ((GeneralPath) shape).curveTo(448.91965, 390.68936, 483.01965, 398.5594, 490.13965, 397.06937);
        ((GeneralPath) shape).curveTo(489.89966, 393.16937, 498.06964, 382.18936, 492.45966, 382.42935);
        ((GeneralPath) shape).moveTo(338.69965, 462.44934);
        ((GeneralPath) shape).curveTo(359.00964, 463.84933, 388.07965, 458.58936, 393.58966, 434.41934);
        ((GeneralPath) shape).curveTo(395.25967, 416.65933, 378.28967, 398.29935, 359.92966, 399.88934);
        ((GeneralPath) shape).curveTo(326.36966, 390.45935, 307.54965, 447.52936, 338.69965, 462.44934);
        ((GeneralPath) shape).moveTo(482.89966, 404.06934);
        ((GeneralPath) shape).curveTo(466.38965, 408.86932, 450.51965, 415.88934, 434.15967, 421.15933);
        ((GeneralPath) shape).curveTo(428.07968, 432.39932, 426.90967, 446.28934, 417.73965, 455.84933);
        ((GeneralPath) shape).curveTo(415.35965, 459.02933, 421.13965, 459.15933, 423.08966, 459.90933);
        ((GeneralPath) shape).curveTo(437.66965, 462.68933, 449.05966, 473.44934, 460.74966, 480.76935);
        ((GeneralPath) shape).curveTo(465.22968, 468.97934, 469.68967, 457.13934, 473.89966, 445.26935);
        ((GeneralPath) shape).curveTo(479.17966, 431.07935, 483.54965, 416.53934, 488.01965, 402.07935);
        ((GeneralPath) shape).curveTo(486.21967, 402.43933, 484.36966, 402.90933, 482.89966, 404.06934);
        ((GeneralPath) shape).moveTo(598.4896, 403.39932);
        ((GeneralPath) shape).curveTo(582.63965, 409.4493, 566.1496, 413.68933, 549.6096, 417.42932);
        ((GeneralPath) shape).curveTo(548.0196, 417.8593, 546.4296, 419.31934, 547.1196, 421.08932);
        ((GeneralPath) shape).curveTo(564.31964, 418.92932, 581.3396, 415.40933, 598.4896, 412.8293);
        ((GeneralPath) shape).curveTo(599.87964, 410.02933, 604.9696, 401.4793, 598.4896, 403.39932);
        ((GeneralPath) shape).moveTo(595.18964, 419.4793);
        ((GeneralPath) shape).curveTo(583.77966, 423.04932, 569.08966, 425.2493, 560.1096, 430.0693);
        ((GeneralPath) shape).curveTo(571.24963, 426.51932, 594.4796, 432.2593, 595.18964, 419.4793);
        ((GeneralPath) shape).moveTo(586.4196, 435.3593);
        ((GeneralPath) shape).curveTo(576.6396, 437.86932, 566.6096, 439.48932, 557.12964, 443.04932);
        ((GeneralPath) shape).curveTo(569.99963, 460.52933, 537.43964, 461.61932, 527.81964, 466.80933);
        ((GeneralPath) shape).curveTo(518.62964, 484.48932, 508.19965, 502.34933, 501.39963, 521.39935);
        ((GeneralPath) shape).curveTo(518.5996, 517.03937, 536.3396, 513.32935, 553.74963, 511.98935);
        ((GeneralPath) shape).curveTo(565.81964, 486.58936, 577.3496, 460.65936, 588.80963, 434.87933);
        ((GeneralPath) shape).curveTo(588.20966, 434.99933, 587.01965, 435.23932, 586.4196, 435.35934);
        ((GeneralPath) shape).moveTo(538.6996, 437.13934);
        ((GeneralPath) shape).curveTo(536.1396, 442.05936, 533.73956, 447.37933, 533.11957, 452.93933);
        ((GeneralPath) shape).curveTo(538.6996, 452.53934, 543.7696, 449.85934, 549.0096, 448.11932);
        ((GeneralPath) shape).curveTo(543.2196, 442.68933, 552.7896, 432.17932, 538.6996, 437.1393);
        ((GeneralPath) shape).moveTo(702.0596, 481.08932);
        ((GeneralPath) shape).curveTo(675.8096, 510.3893, 657.8296, 546.45935, 633.17957, 577.2193);
        ((GeneralPath) shape).curveTo(609.53955, 610.0093, 582.42957, 640.4293, 563.23956, 676.24927);
        ((GeneralPath) shape).curveTo(558.6996, 681.60925, 552.92957, 691.04926, 558.84955, 696.9493);
        ((GeneralPath) shape).curveTo(568.1896, 683.0893, 577.6296, 669.23926, 588.1896, 656.24927);
        ((GeneralPath) shape).curveTo(611.6496, 627.3993, 638.1296, 600.6893, 658.0796, 569.1293);
        ((GeneralPath) shape).curveTo(676.2296, 534.8793, 705.0796, 508.11926, 728.4896, 477.63928);
        ((GeneralPath) shape).curveTo(731.0996, 474.19928, 733.0496, 469.82928, 731.51965, 465.4293);
        ((GeneralPath) shape).curveTo(719.4296, 462.97928, 709.21967, 472.6893, 702.05963, 481.0893);
        ((GeneralPath) shape).moveTo(382.45963, 468.4893);
        ((GeneralPath) shape).curveTo(370.21964, 475.72928, 356.02963, 477.06927, 342.2296, 478.16928);
        ((GeneralPath) shape).curveTo(310.1596, 493.40927, 271.55963, 510.8993, 259.42963, 546.6393);
        ((GeneralPath) shape).curveTo(313.01962, 556.73926, 356.76962, 598.3993, 378.01962, 647.05927);
        ((GeneralPath) shape).curveTo(382.35962, 642.7693, 384.71964, 635.92926, 390.0096, 632.02924);
        ((GeneralPath) shape).curveTo(410.3396, 619.1392, 434.7496, 625.30927, 456.98962, 628.03925);
        ((GeneralPath) shape).curveTo(469.7896, 630.67926, 484.11963, 634.80927, 497.51962, 637.85925);
        ((GeneralPath) shape).curveTo(507.05963, 619.60925, 503.57962, 596.74927, 497.0996, 578.1993);
        ((GeneralPath) shape).curveTo(487.6896, 574.36926, 500.04962, 563.2293, 490.2096, 559.5193);
        ((GeneralPath) shape).curveTo(491.4696, 550.3493, 487.3696, 541.1693, 481.8896, 534.0793);
        ((GeneralPath) shape).curveTo(476.12958, 520.5193, 467.6996, 507.8693, 458.2096, 496.62927);
        ((GeneralPath) shape).curveTo(440.7096, 474.47928, 410.2896, 462.42926, 382.4596, 468.48926);
        ((GeneralPath) shape).moveTo(152.5996, 494.47925);
        ((GeneralPath) shape).curveTo(131.65959, 499.57925, 115.98959, 523.7593, 120.82959, 544.91925);
        ((GeneralPath) shape).curveTo(130.41959, 558.47925, 150.58958, 553.8793, 163.3496, 548.3292);
        ((GeneralPath) shape).curveTo(174.9896, 540.35925, 196.32959, 538.41925, 193.8396, 519.78925);
        ((GeneralPath) shape).curveTo(185.7596, 515.73926, 173.7496, 513.55927, 171.9996, 502.89923);
        ((GeneralPath) shape).curveTo(173.6196, 492.57922, 158.5796, 494.42923, 152.59961, 494.47922);
        ((GeneralPath) shape).moveTo(546.50964, 522.4392);
        ((GeneralPath) shape).curveTo(529.6796, 526.8492, 512.5397, 530.2092, 496.17963, 536.2292);
        ((GeneralPath) shape).curveTo(496.04962, 538.4892, 497.59964, 540.3692, 499.05963, 541.9292);
        ((GeneralPath) shape).curveTo(513.7396, 537.1392, 530.2796, 538.1192, 544.81964, 535.1492);
        ((GeneralPath) shape).curveTo(545.58966, 531.43915, 553.49963, 520.9292, 546.50964, 522.43915);
        ((GeneralPath) shape).moveTo(529.6196, 557.5892);
        ((GeneralPath) shape).curveTo(525.4896, 558.1492, 521.32965, 558.43915, 517.2396, 559.1592);
        ((GeneralPath) shape).curveTo(517.49963, 563.56915, 526.4296, 562.1092, 526.93964, 567.3592);
        ((GeneralPath) shape).curveTo(528.25964, 576.2792, 517.33966, 577.0092, 511.25964, 578.3792);
        ((GeneralPath) shape).curveTo(512.1196, 588.6692, 513.43964, 600.6192, 515.8497, 610.02924);
        ((GeneralPath) shape).curveTo(522.76965, 592.39923, 529.76965, 574.7592, 535.81964, 556.8292);
        ((GeneralPath) shape).lineTo(529.6196, 557.58923);
        ((GeneralPath) shape).moveTo(385.5996, 657.6792);
        ((GeneralPath) shape).curveTo(381.73962, 680.0592, 389.3196, 704.2092, 378.3996, 725.5492);
        ((GeneralPath) shape).curveTo(373.22958, 734.4892, 387.75958, 732.6592, 390.6896, 739.3792);
        ((GeneralPath) shape).curveTo(419.1596, 744.4992, 449.10962, 737.9192, 477.7796, 741.96924);
        ((GeneralPath) shape).curveTo(485.5596, 742.03925, 486.2896, 751.64923, 482.5796, 756.5692);
        ((GeneralPath) shape).curveTo(476.0496, 765.77924, 473.4196, 780.4192, 480.6096, 789.8292);
        ((GeneralPath) shape).curveTo(491.71957, 796.27924, 504.03958, 787.47925, 513.1596, 781.1992);
        ((GeneralPath) shape).curveTo(522.80963, 777.21924, 525.8296, 763.21924, 535.7296, 761.1392);
        ((GeneralPath) shape).curveTo(547.99963, 765.14923, 532.24963, 779.2092, 538.9596, 786.9992);
        ((GeneralPath) shape).curveTo(548.5296, 801.6892, 569.7696, 792.2892, 576.9696, 780.0792);
        ((GeneralPath) shape).curveTo(584.2796, 771.78925, 589.2296, 753.4592, 576.8696, 746.9392);
        ((GeneralPath) shape).curveTo(557.4696, 736.8792, 534.6796, 745.14923, 514.0996, 741.1192);
        ((GeneralPath) shape).curveTo(511.5896, 740.4292, 510.2896, 737.8492, 511.1196, 735.4192);
        ((GeneralPath) shape).curveTo(521.8696, 730.1592, 534.5496, 732.2592, 545.7796, 729.6492);
        ((GeneralPath) shape).curveTo(545.8596, 723.36914, 548.4796, 717.7192, 550.2896, 711.8592);
        ((GeneralPath) shape).curveTo(549.0196, 706.32916, 549.37964, 696.70917, 546.0996, 693.26917);
        ((GeneralPath) shape).curveTo(542.9796, 683.24915, 536.2596, 674.63916, 528.24963, 667.98914);
        ((GeneralPath) shape).curveTo(520.1196, 660.01917, 509.89963, 652.9091, 498.74963, 650.2291);
        ((GeneralPath) shape).curveTo(487.68964, 643.3891, 471.15964, 641.0391, 457.70963, 638.2191);
        ((GeneralPath) shape).curveTo(457.26962, 638.1891, 456.37964, 638.1291, 455.93964, 638.0891);
        ((GeneralPath) shape).curveTo(434.20963, 632.9191, 393.79962, 627.5991, 385.59964, 657.67914);
        ((GeneralPath) shape).moveTo(439.58963, 1045.4491);
        ((GeneralPath) shape).curveTo(426.69962, 1052.7191, 410.31964, 1047.8091, 396.96964, 1054.9991);
        ((GeneralPath) shape).curveTo(341.85962, 1071.3792, 281.43964, 1066.6292, 227.44963, 1050.3992);
        ((GeneralPath) shape).curveTo(222.84962, 1055.6992, 223.79964, 1066.2491, 232.38963, 1065.5792);
        ((GeneralPath) shape).curveTo(309.64963, 1079.4792, 388.59964, 1070.4092, 466.06964, 1063.1293);
        ((GeneralPath) shape).curveTo(458.32965, 1057.0293, 450.41965, 1045.6593, 439.58963, 1045.4492);
        ((GeneralPath) shape).moveTo(204.10963, 1118.8892);
        ((GeneralPath) shape).curveTo(248.85963, 1129.1191, 295.52963, 1126.9791, 341.05963, 1125.0791);
        ((GeneralPath) shape).curveTo(380.02963, 1121.5491, 419.51962, 1124.1691, 458.16962, 1117.0691);
        ((GeneralPath) shape).curveTo(463.13962, 1115.2091, 471.2596, 1122.8591, 473.0696, 1115.1191);
        ((GeneralPath) shape).curveTo(485.3496, 1101.7491, 468.7196, 1084.5991, 471.7296, 1069.3391);
        ((GeneralPath) shape).curveTo(424.66962, 1070.1791, 378.0896, 1080.7592, 330.7896, 1078.2891);
        ((GeneralPath) shape).curveTo(318.2196, 1077.629, 305.6196, 1078.129, 293.0396, 1077.9591);
        ((GeneralPath) shape).curveTo(267.95963, 1073.7091, 240.09961, 1076.0791, 216.36961, 1064.4991);
        ((GeneralPath) shape).curveTo(190.64961, 1064.0991, 174.89961, 1111.3291, 204.10962, 1118.8892);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        // _0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(572.13, 5.77);
        ((GeneralPath) shape).curveTo(581.69, 6.9, 591.78, 9.23, 600.12, 14.01);
        ((GeneralPath) shape).curveTo(590.79, 11.27, 581.27, 9.1, 572.13, 5.7700005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x878787));
        g.fill(shape);

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(554.18, 30.32);
        ((GeneralPath) shape).curveTo(570.93, 16.56, 592.29, 34.489998, 609.86, 39.38);
        ((GeneralPath) shape).curveTo(604.2, 51.74, 610.02997, 78.9, 590.86, 77.92);
        ((GeneralPath) shape).curveTo(599.64996, 74.52, 591.6, 61.67, 585.73, 58.989998);
        ((GeneralPath) shape).curveTo(574.45996, 54.789997, 569.51, 67.45, 566.82996, 75.81);
        ((GeneralPath) shape).curveTo(566.0499, 78.56, 561.55994, 85.189995, 566.80994, 85.03);
        ((GeneralPath) shape).curveTo(557.6099, 89.45, 542.36993, 88.86, 535.0299, 97.08);
        ((GeneralPath) shape).curveTo(541.4499, 101.47, 551.2499, 95.5, 558.9399, 93.85);
        ((GeneralPath) shape).curveTo(557.6199, 96.49, 555.3799, 99.42, 556.91986, 102.45);
        ((GeneralPath) shape).curveTo(547.64984, 103.979996, 538.26984, 105.53999, 528.90985, 106.71999);
        ((GeneralPath) shape).curveTo(537.07983, 81.37999, 541.83984, 54.159992, 554.1799, 30.319992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97752));
        g.fill(shape);

        // _0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(522.9, 55.89);
        ((GeneralPath) shape).curveTo(525.36005, 48.53, 524.93005, 37.82, 530.16003, 32.11);
        ((GeneralPath) shape).curveTo(528.34, 40.190002, 525.85004, 48.15, 522.9, 55.89);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8A8A8A));
        g.fill(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(603.03, 132.18);
        ((GeneralPath) shape).curveTo(610.58, 107.15999, 618.87006, 82.23999, 626.07, 57.119995);
        ((GeneralPath) shape).curveTo(620.83, 82.70999, 612.77, 108.06999, 603.03, 132.18);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(566.83, 75.81);
        ((GeneralPath) shape).curveTo(569.51, 67.45, 574.46, 54.789997, 585.73004, 58.989998);
        ((GeneralPath) shape).curveTo(591.60004, 61.67, 599.65, 74.52, 590.86005, 77.92);
        ((GeneralPath) shape).curveTo(582.80005, 80.14, 574.87006, 82.82, 566.81006, 85.03);
        ((GeneralPath) shape).curveTo(561.56006, 85.19, 566.05005, 78.56, 566.8301, 75.81);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6E1D7));
        g.fill(shape);

        // _0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(511.31, 101.27);
        ((GeneralPath) shape).curveTo(512.58, 89.88, 516.46, 78.56, 519.91, 67.84);
        ((GeneralPath) shape).curveTo(518.1, 79.21999, 514.85, 90.31999, 511.30997, 101.27);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E8D8D));
        g.fill(shape);

        // _0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(591.9, 84.2);
        ((GeneralPath) shape).curveTo(593.2, 86.42, 592.36005, 89.96999, 592.7, 92.71);
        ((GeneralPath) shape).curveTo(580.49, 94.82, 568.94, 99.479996, 556.92004, 102.45);
        ((GeneralPath) shape).curveTo(555.38007, 99.42, 557.62006, 96.49, 558.94006, 93.85);
        ((GeneralPath) shape).curveTo(569.94006, 90.67, 580.68005, 86.58, 591.9001, 84.2);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF3DFD5));
        g.fill(shape);

        // _0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(552.98, 108.74);
        ((GeneralPath) shape).curveTo(567.49, 107.89, 580.13, 98.729996, 594.76996, 98.909996);
        ((GeneralPath) shape).curveTo(592.7399, 115.11, 567.81995, 108.81999, 555.98, 114.119995);
        ((GeneralPath) shape).curveTo(551.70996, 115.28999, 549.18, 111.649994, 552.98, 108.74);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF2DED3));
        g.fill(shape);

        // _0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(480.98, 209.91);
        ((GeneralPath) shape).curveTo(481.69, 171.79001, 497.27002, 135.47, 511.31, 101.270004);
        ((GeneralPath) shape).curveTo(502.48, 137.83, 493.02, 174.32, 480.98, 209.91);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDC8D62));
        g.fill(shape);

        // _0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(526.02, 116.04);
        ((GeneralPath) shape).curveTo(531.14, 110.020004, 544.56, 111.270004, 552.98004, 108.74);
        ((GeneralPath) shape).curveTo(549.18005, 111.65, 551.71, 115.29, 555.98004, 114.119995);
        ((GeneralPath) shape).curveTo(547.22003, 114.159996, 534.00006, 117.63999, 526.02, 116.03999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAF704F));
        g.fill(shape);

        // _0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(587.4, 114.36);
        ((GeneralPath) shape).curveTo(598.34, 122.33, 570.84, 122.69, 568.03, 118.18);
        ((GeneralPath) shape).curveTo(574.41003, 116.6, 580.94, 115.63, 587.4, 114.36);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDEA897));
        g.fill(shape);

        // _0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(556.72, 125.42);
        ((GeneralPath) shape).curveTo(560.02997, 126.08, 565.73, 123.08, 568.17, 125.84);
        ((GeneralPath) shape).curveTo(552.76, 129.51999, 536.45, 129.48999, 520.83997, 132.89);
        ((GeneralPath) shape).curveTo(524.25995, 121.1, 546.11, 131.5, 556.72, 125.42);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x986748));
        g.fill(shape);

        // _0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(564.2, 135.08);
        ((GeneralPath) shape).curveTo(568.08, 133.11, 579.7, 132.51, 583.91003, 134.0);
        ((GeneralPath) shape).curveTo(576.30005, 159.44, 569.2, 185.35, 559.00006, 210.01001);
        ((GeneralPath) shape).curveTo(557.8901, 213.36002, 553.8301, 213.01001, 551.0101, 212.83002);
        ((GeneralPath) shape).curveTo(562.1501, 187.47002, 570.9501, 161.01001, 578.1501, 134.34003);
        ((GeneralPath) shape).curveTo(573.4801, 134.46002, 568.8401, 134.87003, 564.2001, 135.08003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDC8D62));
        g.fill(shape);

        // _0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(564.2, 135.08);
        ((GeneralPath) shape).curveTo(568.84, 134.87, 573.48004, 134.46, 578.15, 134.34);
        ((GeneralPath) shape).curveTo(570.95, 161.01, 562.15, 187.47, 551.01, 212.82999);
        ((GeneralPath) shape).curveTo(542.17, 222.25998, 526.17, 220.45999, 514.61, 225.10999);
        ((GeneralPath) shape).curveTo(501.43, 226.38998, 510.65997, 208.30998, 514.26, 202.22998);
        ((GeneralPath) shape).curveTo(528.67, 184.17998, 536.23, 162.08998, 543.23, 140.41998);
        ((GeneralPath) shape).curveTo(543.94995, 137.95998, 547.07, 137.98999, 549.05, 137.04999);
        ((GeneralPath) shape).curveTo(553.99, 135.80998, 559.12, 135.44998, 564.2, 135.07999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF7E3D8));
        g.fill(shape);

        // _0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(518.12, 141.9);
        ((GeneralPath) shape).curveTo(527.9, 140.29, 538.83997, 138.79999, 549.05, 137.04999);
        ((GeneralPath) shape).curveTo(547.07, 137.98999, 543.95, 137.95999, 543.23, 140.41998);
        ((GeneralPath) shape).curveTo(536.23, 162.08998, 528.67, 184.17998, 514.26, 202.22998);
        ((GeneralPath) shape).curveTo(510.66, 208.30998, 501.43002, 226.38998, 514.61, 225.10999);
        ((GeneralPath) shape).curveTo(508.18, 227.06999, 497.38998, 228.34999, 489.12997, 231.02998);
        ((GeneralPath) shape).curveTo(496.69998, 200.68999, 509.41998, 171.87997, 518.12, 141.9);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(584.03, 189.1);
        ((GeneralPath) shape).curveTo(585.65, 181.12001, 588.29004, 173.3, 592.0, 166.05);
        ((GeneralPath) shape).curveTo(590.15, 173.91, 588.24, 182.15001, 584.03, 189.1);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E8E8E));
        g.fill(shape);

        // _0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(611.72, 203.88);
        ((GeneralPath) shape).curveTo(623.27997, 194.38, 641.39996, 197.44, 653.05, 205.07);
        ((GeneralPath) shape).curveTo(639.73, 200.61, 624.89996, 196.90001, 611.72, 203.88);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x90908F));
        g.fill(shape);

        // _0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(560.98, 246.09);
        ((GeneralPath) shape).curveTo(564.51996, 232.54, 570.37, 219.33, 577.07996, 207.09999);
        ((GeneralPath) shape).curveTo(572.39996, 220.24998, 566.93994, 233.62, 560.98, 246.09);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8C8C8C));
        g.fill(shape);

        // _0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(618.71, 217.76);
        ((GeneralPath) shape).curveTo(635.32, 209.51, 654.34, 222.95999, 665.89, 233.98999);
        ((GeneralPath) shape).curveTo(655.32, 247.90999, 659.67004, 274.43, 639.07, 278.13);
        ((GeneralPath) shape).curveTo(643.92, 269.53, 644.86, 258.79, 643.19, 249.23001);
        ((GeneralPath) shape).curveTo(638.72003, 236.67001, 617.69, 237.22002, 614.54, 250.64001);
        ((GeneralPath) shape).curveTo(612.73, 262.23, 603.88, 277.76, 605.91, 287.16);
        ((GeneralPath) shape).curveTo(601.01996, 288.57, 595.41, 289.49, 590.08997, 289.95);
        ((GeneralPath) shape).curveTo(596.95996, 265.25, 601.19995, 237.52002, 618.70996, 217.76001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD4875E));
        g.fill(shape);

        // _0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(677.02, 219.94);
        ((GeneralPath) shape).curveTo(694.84, 223.58, 687.97003, 243.62, 680.02, 253.09);
        ((GeneralPath) shape).curveTo(684.68, 241.95999, 693.18, 226.43, 677.02, 219.94);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x888888));
        g.fill(shape);

        // _0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(539.4, 226.06);
        ((GeneralPath) shape).curveTo(541.95, 223.20999, 549.55005, 222.84, 554.11005, 221.3);
        ((GeneralPath) shape).curveTo(553.58, 229.71, 548.67004, 237.86, 539.11005, 237.71);
        ((GeneralPath) shape).curveTo(534.67004, 239.26001, 520.38007, 234.79001, 523.6401, 243.88);
        ((GeneralPath) shape).curveTo(510.18008, 246.55, 496.8401, 250.29001, 483.25006, 252.07);
        ((GeneralPath) shape).curveTo(483.70007, 234.70001, 504.53006, 236.59001, 517.12006, 232.06001);
        ((GeneralPath) shape).curveTo(510.88007, 243.65001, 552.00006, 232.64001, 539.4001, 226.06001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(580.9, 266.87);
        ((GeneralPath) shape).curveTo(584.62, 252.72, 588.24005, 237.31999, 595.9, 224.82999);
        ((GeneralPath) shape).curveTo(590.59, 238.69998, 586.27, 253.09999, 580.9, 266.87);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E8E8E));
        g.fill(shape);

        // _0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(517.12, 232.06);
        ((GeneralPath) shape).curveTo(524.52, 229.98, 532.06, 228.38, 539.4, 226.06);
        ((GeneralPath) shape).curveTo(552.0, 232.64, 510.88004, 243.65, 517.12, 232.06);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF3DED3));
        g.fill(shape);

        // _0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(465.95, 263.83);
        ((GeneralPath) shape).curveTo(468.56, 255.66998, 468.16, 244.65999, 472.97, 237.87999);
        ((GeneralPath) shape).curveTo(471.53, 246.73999, 469.36002, 255.51, 465.95, 263.83);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E8E8E));
        g.fill(shape);

        // _0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(614.54, 250.64);
        ((GeneralPath) shape).curveTo(617.69, 237.22, 638.72, 236.67, 643.19, 249.23);
        ((GeneralPath) shape).curveTo(644.86, 258.79, 643.92, 269.53, 639.07, 278.13);
        ((GeneralPath) shape).curveTo(628.61, 282.88, 616.81, 283.68, 605.91003, 287.16);
        ((GeneralPath) shape).curveTo(603.88, 277.76, 612.73004, 262.23, 614.54004, 250.64);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF3E0D5));
        g.fill(shape);

        // _0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(544.12, 244.33);
        ((GeneralPath) shape).curveTo(546.39, 248.28, 538.36, 260.51, 536.69, 267.77);
        ((GeneralPath) shape).curveTo(527.79, 270.87997, 517.07, 271.25, 507.39, 272.94);
        ((GeneralPath) shape).curveTo(507.85, 269.83002, 517.04004, 268.61002, 515.92004, 263.2);
        ((GeneralPath) shape).curveTo(515.12006, 257.22, 507.02005, 259.39, 502.68005, 257.26);
        ((GeneralPath) shape).curveTo(516.66003, 253.53001, 530.69006, 249.79001, 544.12006, 244.33002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDD8D61));
        g.fill(shape);

        // _0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(537.89, 308.02);
        ((GeneralPath) shape).curveTo(543.73004, 290.61, 548.58, 272.38998, 557.06, 256.12);
        ((GeneralPath) shape).curveTo(550.82, 273.35, 545.65, 291.69, 537.89, 308.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8D8D8D));
        g.fill(shape);

        // _0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(480.54, 264.05);
        ((GeneralPath) shape).curveTo(485.53, 264.68, 491.81, 263.36, 496.11002, 265.90997);
        ((GeneralPath) shape).curveTo(491.82, 267.08997, 471.2, 274.16998, 480.54, 264.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD2865D));
        g.fill(shape);

        // _0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(656.99, 318.08);
        ((GeneralPath) shape).curveTo(660.67, 303.37997, 666.3, 289.06, 672.08, 275.12);
        ((GeneralPath) shape).curveTo(667.51, 289.43, 663.38, 304.75, 656.99, 318.08);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8F8F8F));
        g.fill(shape);

        // _0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(437.87, 362.82);
        ((GeneralPath) shape).curveTo(447.22, 334.91, 452.63, 305.59, 462.01, 277.85);
        ((GeneralPath) shape).curveTo(455.02002, 306.30002, 449.04, 335.9, 437.87, 362.82);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8D8D8D));
        g.fill(shape);

        // _0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(527.52, 280.43);
        ((GeneralPath) shape).curveTo(530.97003, 278.83, 531.23004, 281.16, 529.94, 283.91);
        ((GeneralPath) shape).curveTo(522.9, 301.79, 518.0, 320.45, 511.08002, 338.38);
        ((GeneralPath) shape).curveTo(490.99002, 341.06, 473.27002, 353.73, 453.30002, 356.49);
        ((GeneralPath) shape).curveTo(458.48, 337.24, 464.64, 317.58, 470.29, 298.25998);
        ((GeneralPath) shape).curveTo(488.63, 290.68, 507.94, 284.59998, 527.52, 280.43);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(630.05, 288.96);
        ((GeneralPath) shape).curveTo(635.12, 286.37, 641.70996, 284.9, 647.24, 282.3);
        ((GeneralPath) shape).curveTo(645.95996, 291.06, 642.39, 300.81, 631.98, 301.06998);
        ((GeneralPath) shape).curveTo(635.17, 296.08, 640.67, 284.41998, 630.05, 288.96);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDD8D62));
        g.fill(shape);

        // _0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(630.05, 288.96);
        ((GeneralPath) shape).curveTo(640.67, 284.41998, 635.17, 296.08, 631.98, 301.06998);
        ((GeneralPath) shape).curveTo(621.63995, 303.77, 611.37, 306.74997, 601.0, 309.31998);
        ((GeneralPath) shape).curveTo(596.98, 306.65997, 599.84, 300.34998, 601.9, 296.87997);
        ((GeneralPath) shape).curveTo(611.35004, 294.43997, 620.75, 291.88998, 630.05005, 288.95996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6E2D7));
        g.fill(shape);

        // _0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(582.91, 312.77);
        ((GeneralPath) shape).curveTo(581.44, 301.16998, 592.11, 296.83, 601.89996, 296.87997);
        ((GeneralPath) shape).curveTo(599.83997, 300.34998, 596.98, 306.65997, 600.99994, 309.31998);
        ((GeneralPath) shape).curveTo(595.26996, 310.65997, 588.93994, 311.83997, 582.9099, 312.77);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB87552));
        g.fill(shape);

        // _0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(569.2, 303.23);
        ((GeneralPath) shape).curveTo(570.14, 313.14, 563.99, 322.04, 561.26, 331.23);
        ((GeneralPath) shape).curveTo(562.26, 321.55002, 567.73, 312.87, 569.2, 303.23);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8B8A8A));
        g.fill(shape);

        // _0_0_36
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(635.48, 309.41);
        ((GeneralPath) shape).curveTo(640.05, 307.49, 637.13995, 315.22, 634.75, 315.91);
        ((GeneralPath) shape).curveTo(623.8, 317.55002, 611.24, 321.59, 600.89, 319.24);
        ((GeneralPath) shape).curveTo(612.15, 315.19998, 624.12, 313.25, 635.48004, 309.41);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDBB8AD));
        g.fill(shape);

        // _0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(514.98, 375.07);
        ((GeneralPath) shape).curveTo(520.26996, 356.51, 527.39996, 338.36002, 534.19, 320.30002);
        ((GeneralPath) shape).curveTo(528.63, 338.62003, 523.01, 357.89, 514.98, 375.07);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8F8F8F));
        g.fill(shape);

        // _0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(604.62, 324.48);
        ((GeneralPath) shape).curveTo(616.2, 325.34, 586.89, 328.13, 593.77, 337.96002);
        ((GeneralPath) shape).curveTo(588.47003, 341.22003, 578.96, 342.43002, 572.12, 343.85004);
        ((GeneralPath) shape).curveTo(570.21, 321.38004, 590.66, 329.14005, 604.62, 324.48004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(627.51, 328.39);
        ((GeneralPath) shape).curveTo(628.91003, 328.26, 631.72003, 327.24002, 630.74, 329.73);
        ((GeneralPath) shape).curveTo(623.18, 351.73, 615.64996, 373.87, 605.77997, 394.98);
        ((GeneralPath) shape).curveTo(587.44995, 396.30002, 569.16, 401.34, 550.94995, 404.90002);
        ((GeneralPath) shape).curveTo(556.31995, 388.26, 562.76996, 371.84003, 568.33997, 355.26);
        ((GeneralPath) shape).curveTo(579.67, 351.14, 592.67, 349.73, 604.20996, 345.26);
        ((GeneralPath) shape).curveTo(608.62994, 342.99002, 606.50995, 337.89, 604.20996, 335.02002);
        ((GeneralPath) shape).curveTo(611.77997, 332.17, 619.72, 330.50003, 627.50995, 328.39);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDF8E62));
        g.fill(shape);

        // _0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(515.87, 454.75);
        ((GeneralPath) shape).curveTo(518.98, 410.66998, 544.08, 370.54, 561.26, 331.23);
        ((GeneralPath) shape).curveTo(540.12, 394.15002, 517.46, 456.27002, 493.07, 518.06);
        ((GeneralPath) shape).curveTo(498.11002, 496.29, 508.06, 475.71, 515.87, 454.75);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD5895F));
        g.fill(shape);

        // _0_0_41
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(640.98, 362.08);
        ((GeneralPath) shape).curveTo(642.69, 354.44998, 645.54, 347.03998, 649.04, 340.06998);
        ((GeneralPath) shape).curveTo(646.74, 347.36996, 645.76996, 355.89996, 640.98, 362.08);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8B8B8B));
        g.fill(shape);

        // _0_0_42
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(503.48, 349.33);
        ((GeneralPath) shape).curveTo(510.64, 347.96, 503.17, 367.31, 496.35, 362.65);
        ((GeneralPath) shape).curveTo(482.86002, 358.06, 467.57, 373.22, 456.23, 366.00998);
        ((GeneralPath) shape).curveTo(472.74002, 362.80997, 488.04, 355.62997, 503.48, 349.33);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(493.54, 370.53);
        ((GeneralPath) shape).curveTo(498.19, 366.13998, 501.36002, 373.05, 496.99002, 374.16);
        ((GeneralPath) shape).curveTo(486.35, 375.72, 475.71002, 377.46, 465.08002, 379.13);
        ((GeneralPath) shape).curveTo(472.73, 374.14, 483.90002, 371.51, 493.54, 370.53);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB2724F));
        g.fill(shape);

        // _0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(468.66, 382.49);
        ((GeneralPath) shape).curveTo(480.13, 381.46, 462.96, 386.62, 460.7, 386.62);
        ((GeneralPath) shape).curveTo(455.72, 386.94998, 439.79, 397.38998, 443.56, 386.65);
        ((GeneralPath) shape).curveTo(451.99, 385.63, 460.38998, 384.47998, 468.66, 382.49);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD1855C));
        g.fill(shape);

        // _0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(492.46, 382.38);
        ((GeneralPath) shape).curveTo(498.06998, 382.14, 489.9, 393.12, 490.13998, 397.02002);
        ((GeneralPath) shape).curveTo(483.02, 398.51, 448.91998, 390.64, 457.34, 403.37003);
        ((GeneralPath) shape).curveTo(450.87, 406.23, 444.23, 409.64, 437.25, 410.61002);
        ((GeneralPath) shape).curveTo(437.68, 406.75003, 437.96, 401.58002, 441.45, 399.30002);
        ((GeneralPath) shape).curveTo(458.88, 395.16, 476.08002, 389.68002, 492.46002, 382.38);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB87552));
        g.fill(shape);

        // _0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(323.81, 397.85);
        ((GeneralPath) shape).curveTo(331.49, 388.99002, 347.51, 385.36002, 356.79, 388.87);
        ((GeneralPath) shape).curveTo(345.05002, 388.22, 333.89, 392.18, 323.81, 397.85);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA0A0A0));
        g.fill(shape);

        // _0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(364.82, 389.99);
        ((GeneralPath) shape).curveTo(374.89, 388.46, 385.91, 391.72, 394.0, 396.97998);
        ((GeneralPath) shape).curveTo(384.61, 393.19998, 373.66, 395.24997, 364.82, 389.99);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF907D9));
        g.fill(shape);

        // _0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(394.0, 396.98);
        ((GeneralPath) shape).curveTo(401.26, 399.2, 406.03, 406.66, 407.13, 413.93002);
        ((GeneralPath) shape).curveTo(403.74, 407.52002, 400.11002, 401.27002, 394.0, 396.98);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8B8B8B));
        g.fill(shape);

        // _0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(483.98, 466.08);
        ((GeneralPath) shape).curveTo(490.77002, 442.87997, 497.76, 419.44998, 507.05002, 397.15);
        ((GeneralPath) shape).curveTo(499.7, 420.0, 493.23, 444.15, 483.98, 466.08);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8D8D8D));
        g.fill(shape);

        // _0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(338.7, 462.4);
        ((GeneralPath) shape).curveTo(307.55002, 447.47998, 326.37003, 390.41, 359.93002, 399.84);
        ((GeneralPath) shape).curveTo(345.68002, 397.94998, 343.89, 417.52, 339.06003, 427.46);
        ((GeneralPath) shape).curveTo(332.62003, 437.31, 345.42, 443.00998, 342.76004, 452.38);
        ((GeneralPath) shape).curveTo(341.46005, 456.04, 334.84003, 458.27002, 338.70004, 462.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD400B8));
        g.fill(shape);

        // _0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(339.06, 427.46);
        ((GeneralPath) shape).curveTo(343.88998, 417.52, 345.68, 397.94998, 359.93, 399.84);
        ((GeneralPath) shape).curveTo(378.28998, 398.25, 395.26, 416.61, 393.59, 434.37);
        ((GeneralPath) shape).curveTo(388.08, 458.54, 359.01, 463.8, 338.7, 462.4);
        ((GeneralPath) shape).curveTo(334.84003, 458.27, 341.46002, 456.04, 342.76, 452.38);
        ((GeneralPath) shape).curveTo(345.42, 443.01, 332.62, 437.31, 339.06, 427.46);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF00DE));
        g.fill(shape);

        // _0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(482.9, 404.02);
        ((GeneralPath) shape).curveTo(484.37, 402.86, 486.22, 402.38998, 488.02, 402.03);
        ((GeneralPath) shape).curveTo(483.55, 416.49, 479.18, 431.03, 473.9, 445.22);
        ((GeneralPath) shape).curveTo(467.16, 432.81, 481.25998, 417.32, 482.9, 404.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCDC8C5));
        g.fill(shape);

        // _0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(598.49, 403.35);
        ((GeneralPath) shape).curveTo(604.97, 401.43, 599.88, 409.98, 598.49, 412.78);
        ((GeneralPath) shape).curveTo(581.33997, 415.36, 564.32, 418.88, 547.12, 421.04);
        ((GeneralPath) shape).curveTo(546.43, 419.27002, 548.02, 417.81, 549.61, 417.38);
        ((GeneralPath) shape).curveTo(566.14996, 413.64, 582.64, 409.4, 598.49, 403.35);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD88A5F));
        g.fill(shape);

        // _0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(434.16, 421.11);
        ((GeneralPath) shape).curveTo(450.52002, 415.84, 466.39, 408.81998, 482.9, 404.02);
        ((GeneralPath) shape).curveTo(481.25998, 417.31998, 467.16, 432.81, 473.9, 445.22);
        ((GeneralPath) shape).curveTo(469.69, 457.09, 465.22998, 468.93, 460.75, 480.72);
        ((GeneralPath) shape).curveTo(449.06, 473.4, 437.67, 462.64, 423.09, 459.86);
        ((GeneralPath) shape).curveTo(421.13998, 459.11, 415.36, 458.97998, 417.74, 455.8);
        ((GeneralPath) shape).curveTo(426.91, 446.24, 428.08, 432.34998, 434.16, 421.11);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(316.79, 459.25);
        ((GeneralPath) shape).curveTo(307.24002, 444.39, 305.78, 422.45, 315.99002, 407.89);
        ((GeneralPath) shape).curveTo(308.86002, 424.27002, 309.31003, 443.03003, 316.79, 459.25);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x909090));
        g.fill(shape);

        // _0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(591.86, 474.89);
        ((GeneralPath) shape).curveTo(601.05, 454.75, 609.18, 433.85, 619.08997, 414.11002);
        ((GeneralPath) shape).curveTo(611.23, 434.76, 602.97, 455.89, 591.86, 474.89);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8C8C8C));
        g.fill(shape);

        // _0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(408.11, 417.19);
        ((GeneralPath) shape).curveTo(410.5, 422.01, 411.03, 433.35, 406.99, 439.14);
        ((GeneralPath) shape).curveTo(408.09, 431.88, 407.99, 424.5, 408.11, 417.19);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x999999));
        g.fill(shape);

        // _0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(595.19, 419.43);
        ((GeneralPath) shape).curveTo(594.48, 432.21, 571.25, 426.47, 560.11, 430.02);
        ((GeneralPath) shape).curveTo(569.08997, 425.19998, 583.77997, 423.0, 595.19, 419.43);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD2865D));
        g.fill(shape);

        // _0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(419.06, 422.05);
        ((GeneralPath) shape).curveTo(424.56, 426.88998, 417.2, 436.28, 415.98, 441.94);
        ((GeneralPath) shape).curveTo(417.46002, 435.38, 418.57, 428.76, 419.06, 422.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA68878));
        g.fill(shape);

        // _0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(586.42, 435.31);
        ((GeneralPath) shape).curveTo(587.01996, 435.19, 588.20996, 434.95, 588.81, 434.83);
        ((GeneralPath) shape).curveTo(577.35, 460.61, 565.82, 486.53998, 553.75, 511.94);
        ((GeneralPath) shape).curveTo(536.34, 513.28, 518.6, 516.99, 501.4, 521.35);
        ((GeneralPath) shape).curveTo(508.19998, 502.3, 518.63, 484.43997, 527.82, 466.75998);
        ((GeneralPath) shape).curveTo(537.44, 461.56998, 570.0, 460.47998, 557.13, 442.99997);
        ((GeneralPath) shape).curveTo(566.61, 439.43997, 576.64, 437.81998, 586.42, 435.30997);
        ((GeneralPath) shape).moveTo(555.41, 467.22998);
        ((GeneralPath) shape).curveTo(546.63995, 468.93997, 550.04, 483.77997, 559.11, 479.38998);
        ((GeneralPath) shape).curveTo(565.7, 476.24997, 562.26, 466.15997, 555.41, 467.22998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDF8E62));
        g.fill(shape);

        // _0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(538.7, 437.09);
        ((GeneralPath) shape).curveTo(552.79004, 432.13, 543.22003, 442.63998, 549.01, 448.07);
        ((GeneralPath) shape).curveTo(543.77, 449.81, 538.7, 452.49002, 533.12, 452.89);
        ((GeneralPath) shape).curveTo(533.74, 447.33002, 536.14, 442.01, 538.7, 437.09003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB8C60));
        g.fill(shape);

        // _0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(404.13, 446.07);
        ((GeneralPath) shape).curveTo(393.48, 459.39, 419.44, 458.76, 415.02002, 445.08002);
        ((GeneralPath) shape).curveTo(423.14, 463.69, 385.37003, 458.57, 404.13, 446.07);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x948686));
        g.fill(shape);

        // _0_0_63
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(695.95, 462.98);
        ((GeneralPath) shape).curveTo(706.58, 449.37003, 728.62, 441.0, 743.81, 452.13);
        ((GeneralPath) shape).curveTo(754.32, 461.96, 750.19, 479.78, 741.02, 489.06);
        ((GeneralPath) shape).curveTo(746.57, 478.45, 754.05005, 464.76, 743.88, 454.1);
        ((GeneralPath) shape).curveTo(728.75, 441.39, 708.57, 452.05002, 695.95, 462.98);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8D8D8D));
        g.fill(shape);

        // _0_0_64
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(318.89, 462.12);
        ((GeneralPath) shape).curveTo(322.05002, 464.91, 327.21002, 467.41998, 327.71002, 471.75);
        ((GeneralPath) shape).curveTo(311.88004, 478.53, 297.7, 488.29, 282.81003, 496.81);
        ((GeneralPath) shape).curveTo(295.98004, 487.11, 309.67004, 477.34, 324.79004, 470.8);
        ((GeneralPath) shape).curveTo(324.86005, 467.09, 319.65002, 465.78998, 318.89005, 462.12);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAE7F80));
        g.fill(shape);

        // _0_0_65
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(702.06, 481.04);
        ((GeneralPath) shape).curveTo(709.22, 472.64, 719.43, 462.93, 731.52, 465.38);
        ((GeneralPath) shape).curveTo(733.05005, 469.78, 731.10004, 474.15, 728.49, 477.59);
        ((GeneralPath) shape).curveTo(705.08, 508.07, 676.23, 534.83, 658.07996, 569.08);
        ((GeneralPath) shape).curveTo(638.12994, 600.64, 611.64996, 627.35004, 588.18994, 656.2);
        ((GeneralPath) shape).curveTo(586.5399, 657.26, 584.83997, 658.23004, 583.0999, 659.13);
        ((GeneralPath) shape).curveTo(593.80994, 636.47003, 612.7199, 619.25, 626.8499, 598.84);
        ((GeneralPath) shape).curveTo(653.0399, 560.35004, 680.7999, 522.55005, 702.05994, 481.04004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFEFEFE));
        g.fill(shape);

        // _0_0_66
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(677.95, 484.92);
        ((GeneralPath) shape).curveTo(680.88, 477.29, 686.58, 470.88, 693.10004, 466.1);
        ((GeneralPath) shape).curveTo(688.60004, 472.75, 683.35004, 478.97, 677.95, 484.92);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x939393));
        g.fill(shape);

        // _0_0_67
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(382.46, 468.44);
        ((GeneralPath) shape).curveTo(410.28998, 462.38, 440.71, 474.43, 458.21, 496.58002);
        ((GeneralPath) shape).curveTo(453.03998, 495.59003, 448.75, 499.61002, 444.09, 501.11002);
        ((GeneralPath) shape).curveTo(440.13998, 497.7, 436.41998, 493.6, 431.34, 491.91);
        ((GeneralPath) shape).curveTo(416.22, 496.22, 414.27, 479.57, 411.22, 469.52002);
        ((GeneralPath) shape).curveTo(390.12, 466.89, 362.02, 469.41003, 350.86, 489.91003);
        ((GeneralPath) shape).curveTo(348.62, 495.71002, 359.4, 500.05005, 356.86, 507.03003);
        ((GeneralPath) shape).curveTo(358.61, 521.55005, 340.43, 524.01, 334.12, 532.95);
        ((GeneralPath) shape).curveTo(348.75, 534.32, 354.29, 551.94, 346.0, 563.08);
        ((GeneralPath) shape).curveTo(356.69, 574.81, 363.07, 590.15, 363.07, 606.46);
        ((GeneralPath) shape).curveTo(370.93, 614.03, 378.75, 622.26, 383.34, 632.53);
        ((GeneralPath) shape).curveTo(384.6, 636.58, 387.66, 633.05005, 390.01, 631.98004);
        ((GeneralPath) shape).curveTo(384.72, 635.88007, 382.36002, 642.72003, 378.02002, 647.0101);
        ((GeneralPath) shape).curveTo(356.77002, 598.3501, 313.02002, 556.69006, 259.43002, 546.5901);
        ((GeneralPath) shape).curveTo(271.56003, 510.8501, 310.16003, 493.36008, 342.23004, 478.1201);
        ((GeneralPath) shape).curveTo(356.03003, 477.02008, 370.22003, 475.68008, 382.46005, 468.4401);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCC6D6F));
        g.fill(shape);

        // _0_0_68
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(555.41, 467.23);
        ((GeneralPath) shape).curveTo(562.25995, 466.16, 565.69995, 476.25, 559.11, 479.39);
        ((GeneralPath) shape).curveTo(550.04, 483.78003, 546.64, 468.94, 555.41, 467.23);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF7E1D6));
        g.fill(shape);

        // _0_0_69
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(350.86, 489.91);
        ((GeneralPath) shape).curveTo(362.02, 469.41, 390.12, 466.89, 411.21997, 469.52002);
        ((GeneralPath) shape).curveTo(414.26996, 479.57, 416.21997, 496.22003, 431.33997, 491.91003);
        ((GeneralPath) shape).curveTo(423.02997, 491.76004, 412.06998, 492.80005, 410.44995, 503.11005);
        ((GeneralPath) shape).curveTo(405.19995, 522.93005, 431.49994, 532.81006, 446.52997, 527.9);
        ((GeneralPath) shape).curveTo(455.23996, 521.28, 449.98996, 508.10004, 444.08997, 501.11002);
        ((GeneralPath) shape).curveTo(448.74997, 499.61002, 453.03998, 495.59003, 458.20996, 496.58002);
        ((GeneralPath) shape).curveTo(467.69995, 507.82, 476.12997, 520.47003, 481.88995, 534.03);
        ((GeneralPath) shape).curveTo(497.84995, 566.09, 459.65994, 596.34, 469.68994, 629.38);
        ((GeneralPath) shape).curveTo(465.44995, 628.9, 461.21994, 628.33, 456.98993, 627.99);
        ((GeneralPath) shape).curveTo(434.74994, 625.26, 410.33994, 619.08997, 390.00992, 631.98);
        ((GeneralPath) shape).curveTo(387.6599, 633.05, 384.5999, 636.57996, 383.3399, 632.52997);
        ((GeneralPath) shape).curveTo(378.7499, 622.25995, 370.9299, 614.02997, 363.06992, 606.45996);
        ((GeneralPath) shape).curveTo(363.06992, 590.14996, 356.6899, 574.80994, 345.9999, 563.07996);
        ((GeneralPath) shape).curveTo(354.28992, 551.93994, 348.7499, 534.31995, 334.1199, 532.94995);
        ((GeneralPath) shape).curveTo(340.4299, 524.00995, 358.6099, 521.5499, 356.8599, 507.02994);
        ((GeneralPath) shape).curveTo(359.3999, 500.04993, 348.6199, 495.70993, 350.8599, 489.90994);
        ((GeneralPath) shape).moveTo(390.7999, 513.62994);
        ((GeneralPath) shape).curveTo(377.6399, 514.27997, 371.0599, 530.11993, 377.1999, 540.75995);
        ((GeneralPath) shape).curveTo(385.40988, 547.01996, 401.2699, 548.70996, 406.9599, 538.6099);
        ((GeneralPath) shape).curveTo(406.2599, 530.2199, 402.0999, 511.6299, 390.7999, 513.62994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF68385));
        g.fill(shape);

        // _0_0_70
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(141.68, 474.65);
        ((GeneralPath) shape).curveTo(152.95, 471.1, 167.63998, 471.05, 175.20999, 481.82);
        ((GeneralPath) shape).curveTo(182.34999, 491.0, 196.31999, 493.96002, 200.09999, 505.9);
        ((GeneralPath) shape).curveTo(192.51999, 497.66, 180.98999, 494.94998, 172.93, 487.12);
        ((GeneralPath) shape).curveTo(136.9, 470.12, 95.149994, 519.74, 114.229996, 552.78);
        ((GeneralPath) shape).curveTo(116.24999, 560.49005, 143.17, 561.27, 130.06999, 566.17004);
        ((GeneralPath) shape).curveTo(126.13999, 559.69006, 108.77999, 557.29004, 106.369995, 545.58);
        ((GeneralPath) shape).curveTo(98.549995, 517.79004, 117.59999, 487.82, 141.68, 474.65002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF0005));
        g.fill(shape);

        // _0_0_71
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(472.78, 496.83);
        ((GeneralPath) shape).curveTo(468.91, 491.65, 479.26, 483.47998, 480.07, 477.21997);
        ((GeneralPath) shape).curveTo(479.89, 484.52997, 474.64, 490.12997, 472.78, 496.82996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x888888));
        g.fill(shape);

        // _0_0_72
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(633.18, 577.17);
        ((GeneralPath) shape).curveTo(657.83, 546.41, 675.81, 510.33997, 702.06, 481.03998);
        ((GeneralPath) shape).curveTo(680.8, 522.55, 653.04, 560.35, 626.85, 598.83997);
        ((GeneralPath) shape).curveTo(612.72, 619.24994, 593.81, 636.47, 583.1, 659.12994);
        ((GeneralPath) shape).curveTo(584.83997, 658.2299, 586.54, 657.25995, 588.19, 656.19995);
        ((GeneralPath) shape).curveTo(577.63, 669.18994, 568.19, 683.04, 558.85, 696.89996);
        ((GeneralPath) shape).curveTo(552.93, 690.99994, 558.69995, 681.55994, 563.24, 676.19995);
        ((GeneralPath) shape).curveTo(582.43, 640.37994, 609.54, 609.95996, 633.18, 577.1699);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD3D3D3));
        g.fill(shape);

        // _0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(410.45, 503.11);
        ((GeneralPath) shape).curveTo(412.07, 492.8, 423.03, 491.75998, 431.34003, 491.90997);
        ((GeneralPath) shape).curveTo(436.42, 493.59998, 440.14, 497.69998, 444.09003, 501.11);
        ((GeneralPath) shape).curveTo(449.99002, 508.09998, 455.24002, 521.27997, 446.53003, 527.89996);
        ((GeneralPath) shape).curveTo(431.50003, 532.80994, 405.2, 522.93, 410.45, 503.10995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFDE0E1));
        g.fill(shape);

        // _0_0_74
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(152.6, 494.43);
        ((GeneralPath) shape).curveTo(158.58, 494.38, 173.62001, 492.53, 172.0, 502.85);
        ((GeneralPath) shape).curveTo(173.75, 513.51, 185.76, 515.69, 193.84, 519.74);
        ((GeneralPath) shape).curveTo(196.33, 538.37, 174.98999, 540.31, 163.34999, 548.27997);
        ((GeneralPath) shape).curveTo(150.59, 553.82996, 130.41998, 558.43, 120.82999, 544.87);
        ((GeneralPath) shape).curveTo(115.98999, 523.71, 131.65999, 499.53, 152.59999, 494.43);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF0005));
        g.fill(shape);

        // _0_0_75
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(262.87, 515.85);
        ((GeneralPath) shape).curveTo(266.72, 510.58997, 271.0, 504.95996, 276.9, 501.89996);
        ((GeneralPath) shape).curveTo(273.02, 507.27997, 267.93, 511.61996, 262.87, 515.85);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x919090));
        g.fill(shape);

        // _0_0_76
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(390.8, 513.63);
        ((GeneralPath) shape).curveTo(402.09998, 511.63, 406.25998, 530.22003, 406.96, 538.61);
        ((GeneralPath) shape).curveTo(401.27, 548.70996, 385.41, 547.01996, 377.19998, 540.76);
        ((GeneralPath) shape).curveTo(371.05997, 530.12, 377.63998, 514.28, 390.8, 513.63);
        ((GeneralPath) shape).moveTo(385.66998, 522.25);
        ((GeneralPath) shape).curveTo(376.99, 526.95, 380.71, 543.44, 391.99, 540.03);
        ((GeneralPath) shape).curveTo(406.63998, 542.7, 391.9, 520.07, 385.66998, 522.25);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x020101));
        g.fill(shape);

        // _0_0_77
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(564.97, 534.04);
        ((GeneralPath) shape).curveTo(566.36, 527.29, 569.04, 520.70996, 573.08997, 515.11);
        ((GeneralPath) shape).curveTo(571.05, 521.61, 569.00995, 528.56, 564.97, 534.04);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8D8D8D));
        g.fill(shape);

        // _0_0_78
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(385.67, 522.25);
        ((GeneralPath) shape).curveTo(391.90002, 520.07, 406.64, 542.7, 391.99002, 540.03);
        ((GeneralPath) shape).curveTo(380.71002, 543.44, 376.99002, 526.95, 385.67, 522.25);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF58284));
        g.fill(shape);

        // _0_0_79
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(546.51, 522.39);
        ((GeneralPath) shape).curveTo(553.5, 520.88, 545.59, 531.39, 544.82, 535.10004);
        ((GeneralPath) shape).curveTo(530.28, 538.07, 513.74, 537.09, 499.06, 541.88007);
        ((GeneralPath) shape).curveTo(497.6, 540.32007, 496.05, 538.44006, 496.18, 536.18005);
        ((GeneralPath) shape).curveTo(512.54, 530.16003, 529.68, 526.80005, 546.51, 522.3901);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB8C61));
        g.fill(shape);

        // _0_0_80
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(696.02, 541.04);
        ((GeneralPath) shape).curveTo(699.97003, 534.25, 704.94, 528.01996, 711.11005, 523.1);
        ((GeneralPath) shape).curveTo(706.61005, 529.49, 701.69006, 535.64996, 696.02, 541.04);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E8E8E));
        g.fill(shape);

        // _0_0_81
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(555.96, 674.94);
        ((GeneralPath) shape).curveTo(581.53, 621.39, 621.9, 576.27, 653.02, 526.0);
        ((GeneralPath) shape).curveTo(623.52, 577.29, 584.80005, 623.02, 555.96, 674.94);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x959595));
        g.fill(shape);

        // _0_0_82
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(248.12, 542.99);
        ((GeneralPath) shape).curveTo(256.38, 544.1, 248.78, 531.17, 255.06999, 527.88);
        ((GeneralPath) shape).curveTo(253.34999, 533.3, 253.24998, 539.01, 252.93999, 544.65);
        ((GeneralPath) shape).curveTo(230.76999, 541.45, 208.07999, 542.62, 186.10999, 547.14);
        ((GeneralPath) shape).curveTo(190.41998, 543.03, 196.00998, 540.48004, 200.14998, 536.13);
        ((GeneralPath) shape).curveTo(198.61998, 539.2, 195.46999, 541.13, 194.04997, 544.23);
        ((GeneralPath) shape).curveTo(211.97998, 541.58997, 230.11996, 539.69995, 248.11996, 542.99);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x898785));
        g.fill(shape);

        // _0_0_83
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(481.89, 534.03);
        ((GeneralPath) shape).curveTo(487.37003, 541.12006, 491.47, 550.30005, 490.21002, 559.47003);
        ((GeneralPath) shape).curveTo(500.05002, 563.18005, 487.69003, 574.32, 497.10004, 578.15);
        ((GeneralPath) shape).curveTo(503.58005, 596.7, 507.06003, 619.56, 497.52005, 637.81);
        ((GeneralPath) shape).curveTo(484.12006, 634.76, 469.79004, 630.63, 456.99005, 627.99);
        ((GeneralPath) shape).curveTo(461.22006, 628.33, 465.45004, 628.89996, 469.69006, 629.38);
        ((GeneralPath) shape).curveTo(459.66006, 596.34, 497.85007, 566.09, 481.89008, 534.03);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCC6D6F));
        g.fill(shape);

        // _0_0_84
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(529.62, 557.54);
        ((GeneralPath) shape).lineTo(535.82, 556.77997);
        ((GeneralPath) shape).curveTo(529.77, 574.70996, 522.77, 592.35, 515.85004, 609.98);
        ((GeneralPath) shape).curveTo(513.44006, 600.57, 512.12006, 588.62, 511.26004, 578.32996);
        ((GeneralPath) shape).curveTo(517.34, 576.95996, 528.26, 576.23, 526.94006, 567.30994);
        ((GeneralPath) shape).curveTo(526.43005, 562.05994, 517.50006, 563.51996, 517.24005, 559.1099);
        ((GeneralPath) shape).curveTo(521.3301, 558.38995, 525.49005, 558.0999, 529.62006, 557.5399);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB8C61));
        g.fill(shape);

        // _0_0_85
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(215.42, 558.33);
        ((GeneralPath) shape).curveTo(257.16, 557.49, 304.41998, 562.89, 333.77, 596.24);
        ((GeneralPath) shape).curveTo(357.88998, 623.63, 381.75998, 661.32, 370.06998, 699.14);
        ((GeneralPath) shape).curveTo(370.71, 687.97003, 371.86, 676.68, 370.77997, 665.53);
        ((GeneralPath) shape).curveTo(360.55997, 659.88, 355.25998, 649.81006, 351.93997, 639.13);
        ((GeneralPath) shape).curveTo(350.44998, 629.87, 338.17996, 630.13, 335.8, 621.5);
        ((GeneralPath) shape).curveTo(333.09998, 615.5, 336.25, 609.78, 337.87, 604.14);
        ((GeneralPath) shape).curveTo(323.09, 595.25, 312.43, 581.07, 297.74, 572.17004);
        ((GeneralPath) shape).curveTo(265.22, 559.08, 228.44998, 556.81006, 194.16998, 563.09);
        ((GeneralPath) shape).curveTo(189.62999, 563.23004, 189.21999, 568.16003, 186.77998, 570.92004);
        ((GeneralPath) shape).curveTo(164.34998, 576.61005, 153.68, 600.78, 136.07999, 614.04004);
        ((GeneralPath) shape).curveTo(149.45999, 636.17004, 120.00999, 652.16003, 111.47999, 669.67004);
        ((GeneralPath) shape).curveTo(123.59999, 680.48004, 117.18999, 697.05005, 108.16999, 707.39);
        ((GeneralPath) shape).curveTo(116.12999, 708.2, 125.31999, 711.72003, 126.31999, 720.83);
        ((GeneralPath) shape).curveTo(128.93999, 727.43, 120.439995, 733.02, 121.899994, 738.68);
        ((GeneralPath) shape).curveTo(131.95, 738.26, 142.65, 740.7, 148.59, 749.58997);
        ((GeneralPath) shape).curveTo(159.54, 752.36, 171.06999, 760.20996, 169.88, 772.91);
        ((GeneralPath) shape).curveTo(169.91, 788.64996, 149.17001, 797.94995, 137.16, 787.75);
        ((GeneralPath) shape).curveTo(130.75, 786.06, 115.83, 777.72, 118.73, 790.92);
        ((GeneralPath) shape).lineTo(118.75, 791.76);
        ((GeneralPath) shape).curveTo(114.82, 779.09, 124.56, 768.31, 125.58, 756.47003);
        ((GeneralPath) shape).curveTo(120.630005, 755.15, 118.21, 761.42004, 115.14, 763.97003);
        ((GeneralPath) shape).curveTo(115.14, 758.78, 109.84, 758.64, 105.69, 758.60004);
        ((GeneralPath) shape).curveTo(110.41, 756.69006, 121.05, 760.23004, 120.090004, 753.16003);
        ((GeneralPath) shape).curveTo(95.11, 750.15, 69.810005, 754.13, 44.950005, 756.99005);
        ((GeneralPath) shape).curveTo(49.420006, 754.7001, 55.290005, 755.2701, 60.200005, 753.36005);
        ((GeneralPath) shape).curveTo(67.98, 752.47003, 60.350006, 744.57007, 58.720005, 741.2601);
        ((GeneralPath) shape).curveTo(46.470005, 723.93005, 49.660004, 701.5301, 51.670006, 681.7101);
        ((GeneralPath) shape).curveTo(56.300007, 650.3901, 80.44, 627.0501, 102.770004, 606.7701);
        ((GeneralPath) shape).curveTo(133.06, 577.75006, 174.52, 563.5201, 215.42001, 558.3301);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCA16D));
        g.fill(shape);

        // _0_0_86
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(194.17, 563.09);
        ((GeneralPath) shape).curveTo(228.45, 556.81, 265.22, 559.08, 297.74, 572.17004);
        ((GeneralPath) shape).curveTo(312.43, 581.07007, 323.09, 595.25006, 337.87, 604.14);
        ((GeneralPath) shape).curveTo(336.25, 609.78, 333.1, 615.5, 335.8, 621.5);
        ((GeneralPath) shape).curveTo(338.18, 630.13, 350.44998, 629.87, 351.94, 639.13);
        ((GeneralPath) shape).curveTo(355.26, 649.81, 360.56, 659.88, 370.78, 665.53);
        ((GeneralPath) shape).curveTo(371.86, 676.68005, 370.71, 687.97003, 370.07, 699.14);
        ((GeneralPath) shape).curveTo(366.41, 710.32, 363.69, 722.18, 366.88, 733.88);
        ((GeneralPath) shape).curveTo(375.17, 733.77, 372.61002, 741.75, 370.2, 747.03);
        ((GeneralPath) shape).curveTo(364.82, 758.04004, 350.23, 755.17004, 341.97, 762.95);
        ((GeneralPath) shape).curveTo(325.44, 771.82, 326.85, 793.28, 315.09, 806.13);
        ((GeneralPath) shape).curveTo(307.56, 806.38, 300.13998, 804.97003, 292.7, 804.09);
        ((GeneralPath) shape).curveTo(275.37003, 799.57, 254.83002, 810.22003, 239.59001, 798.23004);
        ((GeneralPath) shape).curveTo(235.72002, 792.08, 242.35, 776.10004, 231.46, 776.21);
        ((GeneralPath) shape).curveTo(219.87001, 791.57, 197.45001, 792.83, 180.23001, 800.18);
        ((GeneralPath) shape).curveTo(160.25002, 799.51, 130.14001, 814.79, 118.73001, 790.92);
        ((GeneralPath) shape).curveTo(115.83001, 777.72, 130.75002, 786.06, 137.16, 787.75);
        ((GeneralPath) shape).curveTo(149.17, 797.95, 169.91, 788.65, 169.88, 772.91);
        ((GeneralPath) shape).curveTo(171.07, 760.20996, 159.54001, 752.36, 148.59, 749.58997);
        ((GeneralPath) shape).curveTo(142.65, 740.69995, 131.95, 738.25995, 121.899994, 738.68);
        ((GeneralPath) shape).curveTo(120.439995, 733.02, 128.93999, 727.43, 126.31999, 720.83);
        ((GeneralPath) shape).curveTo(125.31999, 711.72003, 116.12999, 708.2, 108.16999, 707.39);
        ((GeneralPath) shape).curveTo(117.18999, 697.05, 123.59999, 680.48004, 111.47999, 669.67004);
        ((GeneralPath) shape).curveTo(120.00999, 652.16003, 149.45999, 636.17004, 136.07999, 614.04004);
        ((GeneralPath) shape).curveTo(153.68, 600.78, 164.34999, 576.61005, 186.77998, 570.92004);
        ((GeneralPath) shape).curveTo(189.21999, 568.16003, 189.62999, 563.23004, 194.16998, 563.09);
        ((GeneralPath) shape).moveTo(236.46999, 600.48004);
        ((GeneralPath) shape).curveTo(249.38998, 615.67004, 272.62, 618.94006, 283.83, 636.17004);
        ((GeneralPath) shape).curveTo(297.86, 652.08, 289.75998, 674.86005, 295.99, 692.21);
        ((GeneralPath) shape).curveTo(290.28, 684.47003, 280.78998, 691.39, 282.13998, 699.7);
        ((GeneralPath) shape).curveTo(285.62997, 704.73004, 292.24, 700.4, 295.00998, 696.76);
        ((GeneralPath) shape).curveTo(288.52, 710.06, 295.25998, 729.24, 310.46997, 732.67);
        ((GeneralPath) shape).curveTo(323.45996, 734.83997, 337.67996, 724.61, 338.07996, 711.01996);
        ((GeneralPath) shape).curveTo(334.41995, 681.42, 336.51996, 649.58997, 321.24997, 622.75995);
        ((GeneralPath) shape).curveTo(307.42996, 599.44995, 283.61, 583.5499, 258.25998, 575.20996);
        ((GeneralPath) shape).curveTo(244.12997, 571.23, 225.25998, 586.08997, 236.46997, 600.48);
        ((GeneralPath) shape).moveTo(218.80997, 604.24);
        ((GeneralPath) shape).curveTo(206.29997, 613.08, 207.63997, 639.01, 225.60997, 638.68);
        ((GeneralPath) shape).curveTo(247.20998, 633.52, 242.02997, 598.57, 218.80997, 604.24);
        ((GeneralPath) shape).moveTo(153.10997, 647.43);
        ((GeneralPath) shape).curveTo(142.16997, 647.82, 143.55997, 664.85, 155.00996, 656.87);
        ((GeneralPath) shape).curveTo(156.53996, 665.55, 133.39996, 658.44, 143.99997, 665.2);
        ((GeneralPath) shape).curveTo(157.47997, 673.04004, 171.23997, 649.63, 153.10997, 647.43);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6C283));
        g.fill(shape);

        // _0_0_87
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(236.47, 600.48);
        ((GeneralPath) shape).curveTo(225.26, 586.08997, 244.13, 571.23, 258.26, 575.20996);
        ((GeneralPath) shape).curveTo(283.61002, 583.55, 307.43, 599.44995, 321.25, 622.75995);
        ((GeneralPath) shape).curveTo(336.52, 649.58997, 334.42, 681.4199, 338.08, 711.01996);
        ((GeneralPath) shape).curveTo(337.68, 724.61, 323.46, 734.83997, 310.46997, 732.67);
        ((GeneralPath) shape).curveTo(295.25998, 729.24, 288.51996, 710.06, 295.00998, 696.76);
        ((GeneralPath) shape).curveTo(295.58997, 695.31, 296.02, 693.77, 295.99, 692.21);
        ((GeneralPath) shape).curveTo(289.75998, 674.86005, 297.86, 652.08, 283.83, 636.17004);
        ((GeneralPath) shape).curveTo(272.62, 618.94006, 249.38998, 615.67004, 236.46999, 600.48004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFDF0E0));
        g.fill(shape);

        // _0_0_88
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(218.81, 604.24);
        ((GeneralPath) shape).curveTo(242.03, 598.57, 247.20999, 633.52, 225.61, 638.68);
        ((GeneralPath) shape).curveTo(207.64, 639.01, 206.3, 613.08, 218.81, 604.24);
        ((GeneralPath) shape).moveTo(221.56, 611.37);
        ((GeneralPath) shape).curveTo(211.48999, 614.52, 214.28, 633.51, 224.62, 634.04);
        ((GeneralPath) shape).curveTo(236.89, 630.57996, 236.98, 608.86, 221.56, 611.37);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x040302));
        g.fill(shape);

        // _0_0_89
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(221.56, 611.37);
        ((GeneralPath) shape).curveTo(236.98, 608.86, 236.89, 630.58, 224.62, 634.04);
        ((GeneralPath) shape).curveTo(214.28, 633.50995, 211.48999, 614.51996, 221.56, 611.37);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6C283));
        g.fill(shape);

        // _0_0_90
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(519.78, 649.2);
        ((GeneralPath) shape).curveTo(509.60004, 646.41003, 526.01, 638.97003, 527.10004, 632.14);
        ((GeneralPath) shape).curveTo(528.02, 639.54004, 515.99005, 643.06, 519.78, 649.2);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x868686));
        g.fill(shape);

        // _0_0_91
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(385.6, 657.63);
        ((GeneralPath) shape).curveTo(393.80002, 627.55, 434.21002, 632.87, 455.94, 638.04);
        ((GeneralPath) shape).curveTo(451.97, 639.11, 442.35, 635.37, 440.52, 637.42);
        ((GeneralPath) shape).curveTo(451.55, 643.5, 448.37997, 658.26996, 438.47998, 663.6);
        ((GeneralPath) shape).curveTo(439.08, 667.42, 447.37, 669.75, 446.33997, 675.5);
        ((GeneralPath) shape).curveTo(444.18997, 682.19, 448.87997, 678.38, 451.20996, 677.83);
        ((GeneralPath) shape).curveTo(446.63995, 682.28, 442.57996, 689.71, 445.99997, 695.81);
        ((GeneralPath) shape).curveTo(452.21997, 700.41, 460.50998, 697.02, 467.11996, 695.08);
        ((GeneralPath) shape).curveTo(461.32996, 700.88, 441.65997, 702.61005, 443.44995, 690.07);
        ((GeneralPath) shape).curveTo(445.96994, 681.86, 429.23996, 696.37, 438.46994, 696.53);
        ((GeneralPath) shape).curveTo(449.28995, 697.88, 451.73993, 712.28, 444.04993, 719.17004);
        ((GeneralPath) shape).curveTo(452.91992, 725.64, 459.68994, 717.7601, 465.83994, 711.4501);
        ((GeneralPath) shape).curveTo(487.76993, 700.4501, 492.56995, 733.05005, 512.8499, 732.74005);
        ((GeneralPath) shape).curveTo(523.0299, 731.05005, 533.2799, 729.87006, 543.5899, 729.21);
        ((GeneralPath) shape).curveTo(545.5499, 724.9, 545.6499, 712.85004, 550.2899, 711.81);
        ((GeneralPath) shape).curveTo(548.4799, 717.67, 545.8599, 723.32, 545.7799, 729.6);
        ((GeneralPath) shape).curveTo(534.5499, 732.20996, 521.86993, 730.11, 511.1199, 735.37);
        ((GeneralPath) shape).curveTo(510.28992, 737.8, 511.5899, 740.38, 514.0999, 741.07);
        ((GeneralPath) shape).curveTo(534.67993, 745.10004, 557.4699, 736.83, 576.86993, 746.89);
        ((GeneralPath) shape).curveTo(589.2299, 753.41003, 584.2799, 771.74, 576.9699, 780.03);
        ((GeneralPath) shape).curveTo(581.5199, 770.36005, 588.2999, 754.74005, 575.9699, 747.97003);
        ((GeneralPath) shape).curveTo(559.7799, 740.19, 540.5999, 744.9, 523.2799, 743.7);
        ((GeneralPath) shape).curveTo(529.2599, 754.16003, 527.4699, 770.10004, 514.0099, 773.5);
        ((GeneralPath) shape).curveTo(501.6799, 777.15, 493.21988, 767.41, 487.43988, 758.25);
        ((GeneralPath) shape).curveTo(475.98987, 758.47, 482.2599, 777.17, 479.0699, 785.49);
        ((GeneralPath) shape).curveTo(488.39987, 797.49, 502.86987, 785.0, 513.1599, 781.14996);
        ((GeneralPath) shape).curveTo(504.03992, 787.43, 491.7199, 796.23, 480.60992, 789.77997);
        ((GeneralPath) shape).curveTo(473.41992, 780.37, 476.04993, 765.73, 482.57993, 756.51996);
        ((GeneralPath) shape).curveTo(486.28992, 751.6, 485.55994, 741.9899, 477.77994, 741.92);
        ((GeneralPath) shape).curveTo(449.10992, 737.87, 419.15994, 744.45, 390.68994, 739.32996);
        ((GeneralPath) shape).curveTo(387.75995, 732.61, 373.22995, 734.43994, 378.39993, 725.49994);
        ((GeneralPath) shape).curveTo(389.31995, 704.1599, 381.73993, 680.00995, 385.59995, 657.62994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6DCACC));
        g.fill(shape);

        // _0_0_92
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(440.52, 637.42);
        ((GeneralPath) shape).curveTo(442.34998, 635.37, 451.97, 639.11, 455.94, 638.04);
        ((GeneralPath) shape).curveTo(456.38, 638.07996, 457.27, 638.13995, 457.71, 638.17);
        ((GeneralPath) shape).curveTo(471.19, 643.31, 483.09998, 653.11, 498.75, 650.18);
        ((GeneralPath) shape).curveTo(509.9, 652.86, 520.12, 659.97, 528.25, 667.94);
        ((GeneralPath) shape).curveTo(524.3, 671.76, 518.12, 667.46, 513.52, 670.19);
        ((GeneralPath) shape).curveTo(502.11002, 672.61, 494.69003, 692.52, 505.87003, 699.09);
        ((GeneralPath) shape).curveTo(501.97003, 698.71, 496.56003, 696.15, 494.12003, 700.39);
        ((GeneralPath) shape).curveTo(492.97003, 710.17004, 513.79004, 719.52, 512.98004, 705.21);
        ((GeneralPath) shape).curveTo(523.17004, 716.17004, 546.94006, 709.85004, 546.10004, 693.22003);
        ((GeneralPath) shape).curveTo(549.38007, 696.66003, 549.02, 706.28, 550.29004, 711.81006);
        ((GeneralPath) shape).curveTo(545.65, 712.85004, 545.55005, 724.9001, 543.59, 729.2101);
        ((GeneralPath) shape).curveTo(533.28, 729.87006, 523.03, 731.0501, 512.85004, 732.7401);
        ((GeneralPath) shape).curveTo(492.57004, 733.0501, 487.77005, 700.45013, 465.84003, 711.45013);
        ((GeneralPath) shape).curveTo(459.69003, 717.76013, 452.92, 725.64014, 444.05002, 719.1701);
        ((GeneralPath) shape).curveTo(451.74002, 712.2801, 449.29, 697.8801, 438.47003, 696.5301);
        ((GeneralPath) shape).curveTo(429.24002, 696.3701, 445.97003, 681.8601, 443.45004, 690.07007);
        ((GeneralPath) shape).curveTo(441.66003, 702.61005, 461.33005, 700.88007, 467.12006, 695.0801);
        ((GeneralPath) shape).curveTo(475.79007, 685.9001, 459.95004, 674.3501, 451.21005, 677.8301);
        ((GeneralPath) shape).curveTo(448.88007, 678.38007, 444.19006, 682.19006, 446.34006, 675.50006);
        ((GeneralPath) shape).curveTo(447.37006, 669.75006, 439.08005, 667.42004, 438.48007, 663.60004);
        ((GeneralPath) shape).curveTo(448.38007, 658.27, 451.55008, 643.50006, 440.52008, 637.42004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x83F3F6));
        g.fill(shape);

        // _0_0_93
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(457.71, 638.17);
        ((GeneralPath) shape).curveTo(471.16, 640.99, 487.69, 643.33997, 498.75, 650.18);
        ((GeneralPath) shape).curveTo(483.1, 653.11, 471.19, 643.31, 457.71, 638.17);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEE8385));
        g.fill(shape);

        // _0_0_94
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(43.82, 742.17);
        ((GeneralPath) shape).curveTo(23.0, 713.18, 28.349998, 671.54, 46.84, 642.8);
        ((GeneralPath) shape).curveTo(30.24, 673.24, 28.11, 710.94, 43.82, 742.17);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDBAD77));
        g.fill(shape);

        // _0_0_95
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(153.11, 647.43);
        ((GeneralPath) shape).curveTo(171.24, 649.63, 157.48, 673.04, 144.0, 665.2);
        ((GeneralPath) shape).curveTo(133.4, 658.44, 156.54, 665.55, 155.01, 656.87);
        ((GeneralPath) shape).curveTo(143.56, 664.85, 142.17, 647.82, 153.11, 647.43);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x030202));
        g.fill(shape);

        // _0_0_96
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(513.52, 670.19);
        ((GeneralPath) shape).curveTo(518.12, 667.46, 524.30005, 671.76, 528.25, 667.94);
        ((GeneralPath) shape).curveTo(536.26, 674.59, 542.98, 683.2, 546.1, 693.22003);
        ((GeneralPath) shape).curveTo(546.94, 709.85004, 523.17, 716.17004, 512.98, 705.21);
        ((GeneralPath) shape).curveTo(511.21, 702.53, 508.68997, 700.55005, 505.87, 699.09);
        ((GeneralPath) shape).curveTo(494.69, 692.52, 502.11, 672.61005, 513.52, 670.19);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0FCFD));
        g.fill(shape);

        // _0_0_97
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(451.21, 677.83);
        ((GeneralPath) shape).curveTo(459.94998, 674.35004, 475.78998, 685.9, 467.12, 695.08);
        ((GeneralPath) shape).curveTo(460.51, 697.02, 452.22, 700.41003, 446.0, 695.81);
        ((GeneralPath) shape).curveTo(442.58, 689.71, 446.64, 682.27997, 451.21, 677.83);
        ((GeneralPath) shape).moveTo(454.33, 687.10004);
        ((GeneralPath) shape).curveTo(450.3, 690.11005, 452.19998, 696.27, 458.38998, 692.61005);
        ((GeneralPath) shape).curveTo(464.53998, 692.10004, 457.59, 685.86005, 454.33, 687.10004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x010101));
        g.fill(shape);

        // _0_0_98
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(454.33, 687.1);
        ((GeneralPath) shape).curveTo(457.59, 685.86, 464.53998, 692.1, 458.38998, 692.61);
        ((GeneralPath) shape).curveTo(452.19998, 696.26996, 450.3, 690.11, 454.33, 687.1);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7CE7EA));
        g.fill(shape);

        // _0_0_99
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(282.14, 699.7);
        ((GeneralPath) shape).curveTo(280.79, 691.39, 290.28003, 684.47003, 295.99002, 692.21);
        ((GeneralPath) shape).curveTo(296.02002, 693.77, 295.59003, 695.31, 295.01, 696.76);
        ((GeneralPath) shape).curveTo(292.24002, 700.4, 285.63, 704.73, 282.14, 699.7);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x010101));
        g.fill(shape);

        // _0_0_100
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(494.12, 700.39);
        ((GeneralPath) shape).curveTo(496.56, 696.15, 501.97, 698.71, 505.87, 699.09);
        ((GeneralPath) shape).curveTo(508.69, 700.55005, 511.21, 702.53, 512.98, 705.21);
        ((GeneralPath) shape).curveTo(513.79, 719.52, 492.96997, 710.17004, 494.12, 700.39);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_101
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(558.42, 728.97);
        ((GeneralPath) shape).curveTo(561.97, 722.06995, 558.19, 711.87, 564.83997, 706.85);
        ((GeneralPath) shape).curveTo(566.43994, 712.29, 567.16, 717.93, 568.68994, 723.41);
        ((GeneralPath) shape).curveTo(584.2399, 723.37, 594.7899, 735.73, 599.8599, 749.19995);
        ((GeneralPath) shape).lineTo(599.75995, 750.01996);
        ((GeneralPath) shape).curveTo(599.64996, 756.17, 596.64996, 760.64996, 595.00995, 753.05);
        ((GeneralPath) shape).curveTo(590.5499, 737.01996, 574.05994, 729.38, 558.4199, 728.97);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x82F1F4));
        g.fill(shape);

        // _0_0_102
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(523.28, 743.7);
        ((GeneralPath) shape).curveTo(540.60004, 744.9, 559.78, 740.19, 575.97003, 747.97003);
        ((GeneralPath) shape).curveTo(588.30005, 754.74005, 581.52, 770.36005, 576.97003, 780.03);
        ((GeneralPath) shape).curveTo(569.77, 792.24005, 548.53, 801.64, 538.96, 786.95);
        ((GeneralPath) shape).curveTo(532.25, 779.16003, 548.0, 765.10004, 535.73004, 761.09);
        ((GeneralPath) shape).curveTo(525.83, 763.17004, 522.81006, 777.17004, 513.16003, 781.15);
        ((GeneralPath) shape).curveTo(502.87003, 785.0, 488.40002, 797.49005, 479.07004, 785.49005);
        ((GeneralPath) shape).curveTo(482.26004, 777.17004, 475.99005, 758.47003, 487.44003, 758.25006);
        ((GeneralPath) shape).curveTo(493.22003, 767.41003, 501.68002, 777.1501, 514.01, 773.50006);
        ((GeneralPath) shape).curveTo(527.47003, 770.10004, 529.26, 754.16003, 523.28, 743.7001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x83F3F6));
        g.fill(shape);

        // _0_0_103
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(341.97, 762.95);
        ((GeneralPath) shape).curveTo(350.23, 755.17, 364.82, 758.04004, 370.2, 747.03);
        ((GeneralPath) shape).curveTo(364.97, 759.18005, 355.08002, 768.31006, 348.89, 779.89);
        ((GeneralPath) shape).curveTo(338.81003, 799.93, 314.5, 814.38, 292.7, 804.09);
        ((GeneralPath) shape).curveTo(300.14, 804.97, 307.56, 806.38, 315.09003, 806.13);
        ((GeneralPath) shape).curveTo(326.85004, 793.28, 325.44003, 771.82, 341.97003, 762.95);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCA16D));
        g.fill(shape);

        // _0_0_104
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(380.32, 750.44);
        ((GeneralPath) shape).curveTo(408.62, 757.03, 441.55002, 750.27, 469.83002, 753.65);
        ((GeneralPath) shape).curveTo(459.97003, 768.98004, 460.03003, 796.41003, 479.38, 804.86005);
        ((GeneralPath) shape).curveTo(487.74, 808.86005, 496.62, 805.02, 504.92, 802.9501);
        ((GeneralPath) shape).curveTo(499.63, 807.3301, 492.06003, 807.4101, 486.89, 812.25006);
        ((GeneralPath) shape).curveTo(473.94, 815.10004, 463.98, 804.62006, 454.76, 797.3401);
        ((GeneralPath) shape).curveTo(442.55002, 780.1801, 411.18, 802.7101, 406.16, 778.50006);
        ((GeneralPath) shape).curveTo(391.48, 778.5201, 376.03, 779.04004, 362.12, 784.13007);
        ((GeneralPath) shape).curveTo(352.09, 797.2001, 343.26, 811.5101, 336.88998, 826.82007);
        ((GeneralPath) shape).curveTo(326.96, 841.4101, 307.31, 839.5901, 291.99, 842.9001);
        ((GeneralPath) shape).curveTo(294.47, 845.1701, 297.53998, 846.7401, 300.06, 849.0201);
        ((GeneralPath) shape).curveTo(293.36, 843.9201, 285.38998, 844.9501, 278.2, 847.56006);
        ((GeneralPath) shape).curveTo(275.92, 837.1401, 273.02002, 849.61005, 272.22, 854.3401);
        ((GeneralPath) shape).curveTo(271.33, 850.9801, 274.4, 843.8701, 267.3, 845.7701);
        ((GeneralPath) shape).curveTo(244.93999, 840.31006, 220.65, 845.81006, 199.62, 835.5201);
        ((GeneralPath) shape).curveTo(181.41, 837.0901, 163.31, 840.37006, 145.20999, 843.00006);
        ((GeneralPath) shape).curveTo(136.01, 842.3901, 142.38998, 851.05005, 142.92, 855.17004);
        ((GeneralPath) shape).curveTo(148.17, 879.29004, 153.70999, 904.2001, 168.33, 924.65);
        ((GeneralPath) shape).curveTo(180.08, 933.81, 188.89, 947.96, 187.26001, 963.39);
        ((GeneralPath) shape).curveTo(197.02, 977.54004, 193.79001, 1000.09, 176.90001, 1007.02);
        ((GeneralPath) shape).curveTo(174.56001, 1009.39, 167.98001, 1008.13, 168.56001, 1012.4);
        ((GeneralPath) shape).curveTo(111.860016, 986.26, 67.70001, 932.89, 57.15001, 870.88);
        ((GeneralPath) shape).curveTo(53.95001, 854.76, 56.62001, 838.08, 53.03001, 822.06);
        ((GeneralPath) shape).curveTo(54.29001, 817.85, 61.630013, 820.17, 64.81001, 818.75);
        ((GeneralPath) shape).curveTo(90.01001, 818.29, 115.34001, 809.91, 140.31001, 815.95);
        ((GeneralPath) shape).curveTo(169.03001, 815.74, 194.08002, 799.62, 221.05002, 792.16003);
        ((GeneralPath) shape).curveTo(225.71002, 794.09, 221.96002, 803.57, 227.26003, 806.76);
        ((GeneralPath) shape).curveTo(242.02002, 826.37, 268.63004, 816.06, 289.01, 819.73);
        ((GeneralPath) shape).curveTo(306.63, 824.44995, 328.58002, 824.26, 341.62, 809.6);
        ((GeneralPath) shape).curveTo(356.91, 791.52997, 367.21, 769.99, 380.32, 750.44);
        ((GeneralPath) shape).moveTo(114.42999, 839.41003);
        ((GeneralPath) shape).curveTo(106.229996, 837.43005, 107.73999, 846.84, 106.26999, 851.39);
        ((GeneralPath) shape).curveTo(103.98999, 896.88, 114.219986, 947.21, 147.98999, 980.01);
        ((GeneralPath) shape).curveTo(153.71999, 984.9, 175.29999, 992.88, 171.21999, 977.88);
        ((GeneralPath) shape).curveTo(159.81999, 945.65, 150.29999, 912.76, 145.13998, 878.88);
        ((GeneralPath) shape).curveTo(141.94998, 862.87, 135.25998, 838.32, 114.429985, 839.41003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_105
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(595.01, 753.05);
        ((GeneralPath) shape).curveTo(596.65, 760.64996, 599.65, 756.17, 599.76, 750.01996);
        ((GeneralPath) shape).curveTo(601.69, 767.37994, 598.27, 783.43994, 584.96, 795.86);
        ((GeneralPath) shape).curveTo(584.69, 794.89, 584.42004, 793.94, 584.16003, 793.0);
        ((GeneralPath) shape).curveTo(593.28, 781.71, 599.19006, 767.86, 595.01, 753.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x67BEC0));
        g.fill(shape);

        // _0_0_106
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(615.04, 756.93);
        ((GeneralPath) shape).curveTo(620.70996, 764.54, 620.27997, 778.88, 615.04, 787.16);
        ((GeneralPath) shape).curveTo(618.02997, 777.17, 618.44995, 766.86, 615.04, 756.93);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x909090));
        g.fill(shape);

        // _0_0_107
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.98, 771.89);
        ((GeneralPath) shape).curveTo(55.93, 762.33, 81.29, 761.4, 105.69, 758.60004);
        ((GeneralPath) shape).curveTo(109.840004, 758.64, 115.14, 758.78, 115.14, 763.97003);
        ((GeneralPath) shape).curveTo(112.3, 768.71, 110.83, 774.06006, 109.07, 779.25006);
        ((GeneralPath) shape).curveTo(109.18, 775.2601, 109.73, 771.2701, 109.94, 767.30005);
        ((GeneralPath) shape).curveTo(96.61, 768.66003, 79.42, 777.24005, 68.770004, 765.0801);
        ((GeneralPath) shape).curveTo(65.840004, 762.0101, 52.090004, 766.9101, 59.850006, 769.38007);
        ((GeneralPath) shape).curveTo(75.91, 768.99005, 88.66, 787.0201, 79.15001, 801.2601);
        ((GeneralPath) shape).curveTo(74.19001, 809.2601, 87.13001, 808.63007, 91.69001, 806.8301);
        ((GeneralPath) shape).curveTo(99.23001, 803.37006, 116.98001, 807.6401, 109.97001, 794.8301);
        ((GeneralPath) shape).curveTo(111.84001, 798.93005, 114.75001, 802.5901, 115.96001, 806.9801);
        ((GeneralPath) shape).curveTo(86.15001, 811.8401, 54.780006, 813.9201, 25.730003, 809.4701);
        ((GeneralPath) shape).curveTo(15.930003, 798.7901, 17.790003, 776.9801, 32.980003, 771.8901);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_108
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(59.85, 769.38);
        ((GeneralPath) shape).curveTo(52.089996, 766.91003, 65.84, 762.01, 68.77, 765.08);
        ((GeneralPath) shape).curveTo(79.42, 777.24, 96.61, 768.66003, 109.939995, 767.3);
        ((GeneralPath) shape).curveTo(109.729996, 771.26996, 109.17999, 775.26, 109.06999, 779.25);
        ((GeneralPath) shape).curveTo(109.10999, 784.42, 109.189995, 789.68, 109.96999, 794.83);
        ((GeneralPath) shape).curveTo(116.979996, 807.64, 99.229996, 803.37, 91.689995, 806.83);
        ((GeneralPath) shape).curveTo(87.13, 808.63, 74.189995, 809.26, 79.149994, 801.26);
        ((GeneralPath) shape).curveTo(88.659996, 787.02, 75.909996, 768.99, 59.849995, 769.38);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBEF4F9));
        g.fill(shape);

        // _0_0_109
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(362.12, 784.13);
        ((GeneralPath) shape).curveTo(376.03, 779.04, 391.47998, 778.52, 406.16, 778.5);
        ((GeneralPath) shape).curveTo(411.18, 802.71, 442.55, 780.18, 454.76, 797.34);
        ((GeneralPath) shape).curveTo(463.98, 804.62006, 473.94, 815.10004, 486.89, 812.25);
        ((GeneralPath) shape).curveTo(492.06003, 807.41, 499.63, 807.33, 504.92, 802.95);
        ((GeneralPath) shape).curveTo(512.66003, 798.7, 518.61, 791.94, 525.87, 787.15);
        ((GeneralPath) shape).curveTo(533.9, 812.37, 569.12, 809.86005, 584.16, 793.0);
        ((GeneralPath) shape).curveTo(584.42, 793.94, 584.69, 794.89, 584.95996, 795.86);
        ((GeneralPath) shape).curveTo(569.98, 846.6, 563.50995, 902.49, 529.29, 945.3);
        ((GeneralPath) shape).curveTo(501.93997, 975.8, 479.27, 1015.6, 438.21997, 1029.01);
        ((GeneralPath) shape).curveTo(415.44998, 1029.2, 395.20996, 1040.08, 375.01996, 1049.16);
        ((GeneralPath) shape).curveTo(328.38995, 1044.8401, 281.37994, 1041.15, 234.38995, 1043.0);
        ((GeneralPath) shape).curveTo(226.30995, 1044.66, 223.40996, 1034.96, 216.06995, 1033.9);
        ((GeneralPath) shape).curveTo(200.30995, 1026.5701, 184.13995, 1020.14, 168.55995, 1012.4);
        ((GeneralPath) shape).curveTo(167.97995, 1008.13, 174.55995, 1009.39, 176.89995, 1007.02);
        ((GeneralPath) shape).curveTo(193.78995, 1000.09, 197.01994, 977.54004, 187.25995, 963.39);
        ((GeneralPath) shape).curveTo(188.88995, 947.96, 180.07996, 933.81, 168.32996, 924.65);
        ((GeneralPath) shape).curveTo(153.70996, 904.2, 148.16995, 879.29004, 142.91995, 855.17004);
        ((GeneralPath) shape).curveTo(142.38995, 851.05005, 136.00995, 842.39, 145.20995, 843.00006);
        ((GeneralPath) shape).curveTo(163.30995, 840.37006, 181.40994, 837.0901, 199.61995, 835.5201);
        ((GeneralPath) shape).curveTo(220.64995, 845.81006, 244.93994, 840.31006, 267.29996, 845.7701);
        ((GeneralPath) shape).curveTo(274.39996, 843.87006, 271.32996, 850.9801, 272.21997, 854.3401);
        ((GeneralPath) shape).curveTo(271.54996, 888.63007, 272.44998, 922.93005, 271.75998, 957.2201);
        ((GeneralPath) shape).curveTo(270.00998, 938.5301, 271.55, 919.7401, 270.99, 901.0101);
        ((GeneralPath) shape).curveTo(265.53998, 923.94006, 278.03, 955.44006, 261.53, 976.93005);
        ((GeneralPath) shape).curveTo(252.31999, 1006.11005, 301.06, 1017.7001, 306.15, 987.10004);
        ((GeneralPath) shape).curveTo(324.03998, 962.41003, 319.63998, 930.56006, 317.94, 902.08);
        ((GeneralPath) shape).curveTo(315.36002, 883.60004, 312.67, 863.71, 300.06, 849.02);
        ((GeneralPath) shape).curveTo(297.54, 846.74, 294.47, 845.17004, 291.99, 842.9);
        ((GeneralPath) shape).curveTo(307.31, 839.59, 326.96, 841.41003, 336.88998, 826.82);
        ((GeneralPath) shape).curveTo(343.25998, 811.51, 352.09, 797.2, 362.12, 784.13);
        ((GeneralPath) shape).moveTo(446.32, 823.32);
        ((GeneralPath) shape).curveTo(439.2, 824.31, 427.29, 831.32, 432.83002, 839.41003);
        ((GeneralPath) shape).curveTo(432.69, 879.21, 422.84003, 918.27, 408.21002, 955.13);
        ((GeneralPath) shape).curveTo(394.43002, 964.92, 386.31003, 986.88, 402.26, 998.79);
        ((GeneralPath) shape).curveTo(426.47, 1013.50995, 459.96002, 987.31, 456.82, 959.94);
        ((GeneralPath) shape).curveTo(469.38, 926.98, 475.38, 891.08, 472.15, 855.85);
        ((GeneralPath) shape).curveTo(470.62, 841.45996, 463.66998, 822.63995, 446.32, 823.31995);
        ((GeneralPath) shape).moveTo(381.21002, 828.33997);
        ((GeneralPath) shape).curveTo(364.74002, 829.1, 360.48, 848.02997, 359.40002, 861.41);
        ((GeneralPath) shape).curveTo(357.16003, 893.56995, 354.58002, 927.76996, 368.12003, 957.85);
        ((GeneralPath) shape).curveTo(384.09003, 965.62, 400.84003, 949.77997, 404.83002, 934.79);
        ((GeneralPath) shape).curveTo(411.15002, 909.24, 407.95, 882.26, 404.52002, 856.47);
        ((GeneralPath) shape).curveTo(403.30002, 843.66, 396.14, 827.87, 381.21002, 828.33997);
        ((GeneralPath) shape).moveTo(490.63, 893.37);
        ((GeneralPath) shape).curveTo(476.80002, 900.18, 471.72, 921.39, 477.16, 934.87);
        ((GeneralPath) shape).curveTo(487.69, 942.45, 494.6, 927.02, 497.69, 918.74);
        ((GeneralPath) shape).curveTo(504.22, 910.86, 505.53, 890.56, 490.63, 893.37);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_110
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.0, 811.02);
        ((GeneralPath) shape).curveTo(1.0100002, 802.65, 2.04, 788.18, 8.85, 779.81);
        ((GeneralPath) shape).curveTo(3.8500004, 789.57, 3.3600006, 800.49, 6.0000005, 811.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x909192));
        g.fill(shape);

        // _0_0_111
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(118.73, 790.92);
        ((GeneralPath) shape).curveTo(130.14, 814.79, 160.25, 799.51, 180.23001, 800.18);
        ((GeneralPath) shape).curveTo(161.58002, 808.85, 126.110016, 819.33997, 118.750015, 791.76);
        ((GeneralPath) shape).lineTo(118.73002, 790.92);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBFE9EB));
        g.fill(shape);

        // _0_0_112
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(589.48, 822.6);
        ((GeneralPath) shape).curveTo(591.24, 816.57996, 592.73, 808.95996, 598.94995, 805.88);
        ((GeneralPath) shape).curveTo(581.63995, 842.41003, 579.52997, 885.98, 557.8599, 920.91003);
        ((GeneralPath) shape).curveTo(571.7699, 889.37006, 582.0399, 856.26, 589.4799, 822.60004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x839A9C));
        g.fill(shape);

        // _0_0_113
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(446.32, 823.32);
        ((GeneralPath) shape).curveTo(463.67, 822.64, 470.62, 841.46, 472.15, 855.85);
        ((GeneralPath) shape).curveTo(475.38, 891.07996, 469.38, 926.98, 456.82, 959.93994);
        ((GeneralPath) shape).curveTo(448.37, 976.38995, 433.74002, 997.57996, 412.57, 993.27997);
        ((GeneralPath) shape).curveTo(396.49002, 986.91, 404.23, 967.37994, 408.21002, 955.12994);
        ((GeneralPath) shape).curveTo(422.84003, 918.26996, 432.69003, 879.20996, 432.83002, 839.4099);
        ((GeneralPath) shape).curveTo(427.29, 831.3199, 439.2, 824.30994, 446.32, 823.3199);
        ((GeneralPath) shape).moveTo(445.77002, 835.3999);
        ((GeneralPath) shape).curveTo(443.63, 836.0399, 439.31003, 836.0899, 439.92, 839.2199);
        ((GeneralPath) shape).curveTo(440.47, 881.8399, 428.82, 923.18994, 415.08002, 963.1599);
        ((GeneralPath) shape).curveTo(414.16, 970.3799, 408.78003, 980.9099, 415.48, 986.8999);
        ((GeneralPath) shape).curveTo(433.33002, 987.6399, 444.47, 969.1399, 450.91, 954.9199);
        ((GeneralPath) shape).curveTo(462.94, 924.3599, 468.05, 890.5499, 466.15, 857.8399);
        ((GeneralPath) shape).curveTo(465.75, 846.9199, 459.61, 831.2599, 445.77, 835.3999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x010101));
        g.fill(shape);

        // _0_0_114
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.02, 827.95);
        ((GeneralPath) shape).curveTo(25.0, 830.53, 31.5, 829.83, 37.82, 829.31);
        ((GeneralPath) shape).curveTo(38.03, 854.25, 44.809998, 878.26, 50.89, 902.23);
        ((GeneralPath) shape).curveTo(41.559998, 883.22, 40.68, 861.6, 36.12, 841.19995);
        ((GeneralPath) shape).curveTo(33.48, 833.01996, 25.55, 831.2399, 19.019999, 827.94995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9CC6C9));
        g.fill(shape);

        // _0_0_115
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(381.21, 828.34);
        ((GeneralPath) shape).curveTo(396.13998, 827.87006, 403.3, 843.66003, 404.52, 856.47003);
        ((GeneralPath) shape).curveTo(407.94998, 882.26, 411.15, 909.24005, 404.83, 934.79004);
        ((GeneralPath) shape).curveTo(400.84, 949.78, 384.09, 965.62006, 368.12, 957.85004);
        ((GeneralPath) shape).curveTo(354.58, 927.77, 357.16, 893.57007, 359.4, 861.41003);
        ((GeneralPath) shape).curveTo(360.47998, 848.03, 364.74, 829.10004, 381.21, 828.34);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEFFCFE));
        g.fill(shape);

        // _0_0_116
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(445.77, 835.4);
        ((GeneralPath) shape).curveTo(459.61, 831.26, 465.75, 846.92004, 466.15, 857.84);
        ((GeneralPath) shape).curveTo(468.05, 890.55005, 462.94, 924.36005, 450.91, 954.92004);
        ((GeneralPath) shape).curveTo(444.47, 969.14, 433.33002, 987.64, 415.48, 986.9);
        ((GeneralPath) shape).curveTo(408.78, 980.91003, 414.16, 970.38, 415.08002, 963.16003);
        ((GeneralPath) shape).curveTo(428.82, 923.19006, 440.47003, 881.84, 439.92, 839.22003);
        ((GeneralPath) shape).curveTo(439.31003, 836.09, 443.63, 836.04004, 445.77002, 835.4);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_117
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(114.43, 839.41);
        ((GeneralPath) shape).curveTo(135.26, 838.31995, 141.95, 862.87, 145.14, 878.88);
        ((GeneralPath) shape).curveTo(150.3, 912.76, 159.82, 945.65, 171.22, 977.88);
        ((GeneralPath) shape).curveTo(175.3, 992.88, 153.72, 984.9, 147.99, 980.01);
        ((GeneralPath) shape).curveTo(114.22, 947.21, 103.990005, 896.88, 106.270004, 851.39);
        ((GeneralPath) shape).curveTo(107.740005, 846.84, 106.23, 837.43, 114.43001, 839.41003);
        ((GeneralPath) shape).moveTo(112.08001, 845.09);
        ((GeneralPath) shape).curveTo(109.73001, 888.13, 117.04001, 935.14, 146.34001, 968.63);
        ((GeneralPath) shape).curveTo(150.47002, 974.2, 157.06001, 977.92, 163.88, 978.92);
        ((GeneralPath) shape).curveTo(157.77, 948.99, 145.14, 920.47, 142.33, 889.72);
        ((GeneralPath) shape).curveTo(139.57, 871.85, 134.66, 845.8, 112.08, 845.08997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x020202));
        g.fill(shape);

        // _0_0_118
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(272.22, 854.34);
        ((GeneralPath) shape).curveTo(273.02, 849.61005, 275.92, 837.14, 278.2, 847.56);
        ((GeneralPath) shape).curveTo(285.39, 844.95, 293.36002, 843.92, 300.06, 849.02);
        ((GeneralPath) shape).curveTo(312.66998, 863.71, 315.36, 883.60004, 317.94, 902.08);
        ((GeneralPath) shape).curveTo(319.64, 930.56, 324.04, 962.41003, 306.15, 987.10004);
        ((GeneralPath) shape).curveTo(285.71, 1005.12006, 270.69, 975.30005, 271.76, 957.22003);
        ((GeneralPath) shape).curveTo(272.45, 922.93005, 271.55002, 888.63, 272.22, 854.34);
        ((GeneralPath) shape).moveTo(287.59, 853.61005);
        ((GeneralPath) shape).curveTo(283.6, 854.58, 276.15, 854.4, 278.94998, 861.22003);
        ((GeneralPath) shape).curveTo(279.12, 894.38, 278.84998, 927.54004, 279.06998, 960.7);
        ((GeneralPath) shape).curveTo(279.88998, 968.58, 281.68997, 977.25, 286.99997, 983.24);
        ((GeneralPath) shape).curveTo(297.93997, 986.99, 303.54996, 973.81, 306.89996, 965.89996);
        ((GeneralPath) shape).curveTo(315.47995, 939.39996, 312.17996, 910.81995, 308.23996, 883.74);
        ((GeneralPath) shape).curveTo(305.69995, 872.73, 302.46997, 852.42, 287.58997, 853.61);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x010202));
        g.fill(shape);

        // _0_0_119
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(112.08, 845.09);
        ((GeneralPath) shape).curveTo(134.66, 845.80005, 139.57, 871.85004, 142.33, 889.72003);
        ((GeneralPath) shape).curveTo(145.14, 920.47003, 157.77, 948.99005, 163.88, 978.92004);
        ((GeneralPath) shape).curveTo(157.06, 977.92004, 150.47, 974.2001, 146.34, 968.63007);
        ((GeneralPath) shape).curveTo(117.03999, 935.1401, 109.729996, 888.13007, 112.08, 845.0901);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_120
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(287.59, 853.61);
        ((GeneralPath) shape).curveTo(302.47, 852.42, 305.7, 872.73, 308.24, 883.74);
        ((GeneralPath) shape).curveTo(312.18, 910.82, 315.47998, 939.39996, 306.9, 965.9);
        ((GeneralPath) shape).curveTo(303.55, 973.81, 297.94, 986.99005, 287.0, 983.24005);
        ((GeneralPath) shape).curveTo(281.69, 977.25006, 279.89, 968.5801, 279.07, 960.7001);
        ((GeneralPath) shape).curveTo(278.85, 927.5401, 279.12, 894.38007, 278.95, 861.2201);
        ((GeneralPath) shape).curveTo(276.15002, 854.4001, 283.6, 854.5801, 287.59003, 853.6101);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_121
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(490.63, 893.37);
        ((GeneralPath) shape).curveTo(505.53, 890.56, 504.22, 910.86, 497.69, 918.74);
        ((GeneralPath) shape).curveTo(494.6, 927.02, 487.69, 942.45, 477.16, 934.87);
        ((GeneralPath) shape).curveTo(471.72, 921.39, 476.80002, 900.18, 490.63, 893.37);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEFFCFE));
        g.fill(shape);

        // _0_0_122
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(261.53, 976.93);
        ((GeneralPath) shape).curveTo(278.03, 955.44, 265.54, 923.94, 270.99, 901.01);
        ((GeneralPath) shape).curveTo(271.55, 919.74, 270.00998, 938.53, 271.75998, 957.22003);
        ((GeneralPath) shape).curveTo(270.68997, 975.30005, 285.71, 1005.12006, 306.14996, 987.10004);
        ((GeneralPath) shape).curveTo(301.05997, 1017.7, 252.31996, 1006.11005, 261.52997, 976.93005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_123
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(54.91, 913.11);
        ((GeneralPath) shape).curveTo(58.88, 918.39996, 60.68, 924.89996, 63.05, 930.99);
        ((GeneralPath) shape).curveTo(58.3, 926.57, 57.04, 919.17, 54.91, 913.11);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x909090));
        g.fill(shape);

        // _0_0_124
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(402.26, 998.79);
        ((GeneralPath) shape).curveTo(386.31, 986.88, 394.43002, 964.92, 408.21002, 955.13);
        ((GeneralPath) shape).curveTo(404.23, 967.38, 396.49002, 986.91003, 412.57, 993.28);
        ((GeneralPath) shape).curveTo(433.74002, 997.58, 448.37, 976.39, 456.82, 959.94);
        ((GeneralPath) shape).curveTo(459.96002, 987.31, 426.47, 1013.51, 402.26, 998.79);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_125
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(81.96, 961.05);
        ((GeneralPath) shape).curveTo(97.43, 979.24, 115.35, 995.06, 133.83, 1010.14996);
        ((GeneralPath) shape).curveTo(113.97, 997.24994, 95.0, 980.81995, 81.96001, 961.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7FA1A4));
        g.fill(shape);

        // _0_0_126
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(507.88, 998.89);
        ((GeneralPath) shape).curveTo(511.65, 993.13, 515.9, 987.66003, 521.1, 983.11);
        ((GeneralPath) shape).curveTo(517.51996, 988.82996, 513.36, 994.82996, 507.87997, 998.89);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8B8E8E));
        g.fill(shape);

        // _0_0_127
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(460.97, 1039.0);
        ((GeneralPath) shape).curveTo(478.76, 1029.08, 492.35, 1013.77, 507.0, 999.99);
        ((GeneralPath) shape).curveTo(495.28, 1015.48, 480.31, 1028.6, 463.96, 1039.17);
        ((GeneralPath) shape).curveTo(465.78, 1043.89, 470.75998, 1046.28, 473.94, 1050.03);
        ((GeneralPath) shape).curveTo(468.64, 1047.7101, 464.46, 1043.51, 460.97, 1039.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7F9B9D));
        g.fill(shape);

        // _0_0_128
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(159.06, 1028.9);
        ((GeneralPath) shape).curveTo(172.14, 1036.1901, 185.78, 1042.38, 199.11, 1049.2101);
        ((GeneralPath) shape).curveTo(199.05, 1051.8601, 195.92, 1052.2001, 194.01, 1053.0701);
        ((GeneralPath) shape).curveTo(195.04, 1051.77, 196.79999, 1050.8701, 196.87999, 1049.06);
        ((GeneralPath) shape).curveTo(184.10999, 1042.89, 169.65, 1038.51, 159.06, 1028.9);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9B8888));
        g.fill(shape);

        // _0_0_129
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(216.07, 1033.9);
        ((GeneralPath) shape).curveTo(223.41, 1034.9601, 226.31001, 1044.66, 234.39001, 1043.0);
        ((GeneralPath) shape).curveTo(281.38, 1041.15, 328.39, 1044.84, 375.02002, 1049.16);
        ((GeneralPath) shape).curveTo(342.54, 1059.16, 306.85004, 1055.73, 271.48, 1050.41);
        ((GeneralPath) shape).curveTo(252.16, 1049.8401, 229.36002, 1050.11, 216.07, 1033.9);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_130
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(439.59, 1045.4);
        ((GeneralPath) shape).curveTo(450.41998, 1045.61, 458.33, 1056.98, 466.07, 1063.0801);
        ((GeneralPath) shape).curveTo(388.6, 1070.3601, 309.65002, 1079.43, 232.39001, 1065.53);
        ((GeneralPath) shape).curveTo(223.80002, 1066.2001, 222.85002, 1055.65, 227.45001, 1050.35);
        ((GeneralPath) shape).curveTo(281.44, 1066.58, 341.86002, 1071.33, 396.97003, 1054.95);
        ((GeneralPath) shape).curveTo(410.32004, 1047.76, 426.70004, 1052.6699, 439.59003, 1045.3999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9DCACE));
        g.fill(shape);

        // _0_0_131
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(204.11, 1118.9);
        ((GeneralPath) shape).curveTo(174.9, 1111.34, 190.65, 1064.11, 216.37, 1064.51);
        ((GeneralPath) shape).curveTo(240.09999, 1076.09, 267.96, 1073.72, 293.03998, 1077.97);
        ((GeneralPath) shape).curveTo(294.02997, 1079.21, 295.83997, 1078.94, 297.24, 1079.33);
        ((GeneralPath) shape).curveTo(298.44, 1089.6599, 289.81998, 1098.7, 279.55, 1098.5599);
        ((GeneralPath) shape).curveTo(273.19998, 1097.7599, 277.03, 1110.99, 282.19, 1107.0299);
        ((GeneralPath) shape).curveTo(295.97, 1102.2899, 309.03, 1112.3899, 313.82, 1124.84);
        ((GeneralPath) shape).curveTo(366.77002, 1122.5399, 421.17, 1120.82, 473.07, 1115.13);
        ((GeneralPath) shape).curveTo(471.26, 1122.87, 463.14, 1115.22, 458.17, 1117.08);
        ((GeneralPath) shape).curveTo(419.52002, 1124.1799, 380.03003, 1121.5599, 341.06, 1125.09);
        ((GeneralPath) shape).curveTo(295.53, 1126.99, 248.86, 1129.13, 204.11, 1118.9);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_132
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(488.03, 1065.9);
        ((GeneralPath) shape).curveTo(492.92, 1078.9501, 500.87, 1095.22, 499.13998, 1108.99);
        ((GeneralPath) shape).curveTo(498.87, 1093.83, 489.96, 1080.79, 488.03, 1065.9);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E999A));
        g.fill(shape);

        // _0_0_133
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(330.79, 1078.3);
        ((GeneralPath) shape).curveTo(378.09, 1080.77, 424.67, 1070.1901, 471.73, 1069.3501);
        ((GeneralPath) shape).curveTo(468.72, 1084.6101, 485.35, 1101.7601, 473.07, 1115.1301);
        ((GeneralPath) shape).curveTo(421.17, 1120.8201, 366.77002, 1122.5402, 313.82, 1124.8401);
        ((GeneralPath) shape).curveTo(309.03, 1112.3901, 295.97, 1102.29, 282.19, 1107.03);
        ((GeneralPath) shape).curveTo(277.03, 1110.99, 273.2, 1097.76, 279.55, 1098.56);
        ((GeneralPath) shape).curveTo(289.81998, 1098.7001, 298.44, 1089.66, 297.24, 1079.3301);
        ((GeneralPath) shape).curveTo(304.77, 1079.06, 312.3, 1078.7201, 319.83, 1078.79);
        ((GeneralPath) shape).curveTo(318.22998, 1085.0901, 316.74, 1092.2201, 320.81998, 1097.9501);
        ((GeneralPath) shape).curveTo(328.37997, 1116.06, 366.49, 1109.2501, 362.33997, 1088.2201);
        ((GeneralPath) shape).curveTo(358.63995, 1073.04, 341.42996, 1081.2201, 330.78998, 1078.3);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBEF4F9));
        g.fill(shape);

        // _0_0_134
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(293.04, 1078.0);
        ((GeneralPath) shape).curveTo(305.62, 1078.17, 318.22, 1077.67, 330.79, 1078.33);
        ((GeneralPath) shape).curveTo(341.43002, 1081.25, 358.64, 1073.07, 362.34, 1088.25);
        ((GeneralPath) shape).curveTo(366.49, 1109.28, 328.38, 1116.09, 320.82, 1097.98);
        ((GeneralPath) shape).curveTo(316.74002, 1092.25, 318.23, 1085.12, 319.83002, 1078.82);
        ((GeneralPath) shape).curveTo(312.30002, 1078.75, 304.77002, 1079.09, 297.24002, 1079.36);
        ((GeneralPath) shape).curveTo(295.84003, 1078.97, 294.03003, 1079.24, 293.04, 1078.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEFFCFE));
        g.fill(shape);

        // _0_0_135
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(192.03, 1129.9);
        ((GeneralPath) shape).curveTo(226.45999, 1142.78, 263.97, 1138.6, 299.94, 1141.13);
        ((GeneralPath) shape).curveTo(352.95, 1137.05, 406.26, 1141.12, 459.18, 1135.33);
        ((GeneralPath) shape).curveTo(465.28998, 1142.75, 475.16, 1142.08, 483.05, 1138.08);
        ((GeneralPath) shape).curveTo(477.4, 1144.6799, 464.59998, 1143.23, 458.22, 1136.99);
        ((GeneralPath) shape).curveTo(428.66, 1140.8, 398.79, 1139.5, 369.06, 1140.73);
        ((GeneralPath) shape).curveTo(334.63, 1137.45, 300.41998, 1145.89, 266.02, 1142.0);
        ((GeneralPath) shape).curveTo(241.48999, 1139.46, 213.68, 1143.87, 192.03, 1129.9);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8F9899));
        g.fill(shape);

        // _0_0_136
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(546.15, 9.19);
        ((GeneralPath) shape).curveTo(553.55005, 4.0699997, 563.05005, 4.95, 571.55005, 5.2699995);
        ((GeneralPath) shape).curveTo(584.67004, 6.9299994, 596.87006, 12.33, 609.19006, 16.83);
        ((GeneralPath) shape).curveTo(617.7601, 19.88, 625.8301, 24.11, 634.00006, 28.09);
        ((GeneralPath) shape).curveTo(636.3401, 31.67, 637.82007, 36.13, 636.7601, 40.42);
        ((GeneralPath) shape).curveTo(634.74005, 45.489998, 628.3501, 47.809998, 627.48004, 53.519997);
        ((GeneralPath) shape).curveTo(619.92004, 87.409996, 607.7601, 119.96999, 596.74005, 152.81);
        ((GeneralPath) shape).lineTo(595.94006, 152.92);
        ((GeneralPath) shape).curveTo(597.00006, 145.73, 599.86005, 138.98999, 602.1501, 132.14);
        ((GeneralPath) shape).curveTo(607.3501, 118.08, 611.9501, 103.81, 616.56006, 89.55);
        ((GeneralPath) shape).curveTo(620.28, 77.350006, 622.85004, 64.82001, 626.50006, 52.600002);
        ((GeneralPath) shape).curveTo(627.87006, 47.710003, 632.42004, 44.870003, 635.0801, 40.780003);
        ((GeneralPath) shape).curveTo(637.06006, 37.000004, 635.2601, 32.390003, 632.9101, 29.250004);
        ((GeneralPath) shape).curveTo(619.7801, 21.840004, 605.5301, 16.780003, 591.4201, 11.600004);
        ((GeneralPath) shape).curveTo(581.2301, 8.020004, 570.4601, 5.570004, 559.6001, 6.1900043);
        ((GeneralPath) shape).curveTo(554.9101, 6.9500046, 549.9501, 7.680004, 546.2001, 10.870005);
        ((GeneralPath) shape).curveTo(538.9801, 15.350004, 535.43005, 23.170006, 530.9101, 29.990005);
        ((GeneralPath) shape).curveTo(533.2101, 21.480005, 538.9301, 14.120006, 546.1501, 9.190006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x868686));
        g.fill(shape);

        // _0_0_137
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(546.2, 10.87);
        ((GeneralPath) shape).curveTo(549.95, 7.68, 554.91003, 6.95, 559.60004, 6.19);
        ((GeneralPath) shape).curveTo(570.46, 5.57, 581.23004, 8.02, 591.42004, 11.6);
        ((GeneralPath) shape).curveTo(605.53, 16.78, 619.78, 21.84, 632.91003, 29.25);
        ((GeneralPath) shape).curveTo(635.26, 32.39, 637.06006, 37.0, 635.08, 40.78);
        ((GeneralPath) shape).curveTo(632.42004, 44.87, 627.87, 47.71, 626.5, 52.6);
        ((GeneralPath) shape).curveTo(622.85, 64.82, 620.28, 77.35, 616.56, 89.55);
        ((GeneralPath) shape).curveTo(611.95, 103.810005, 607.35, 118.08, 602.15, 132.14);
        ((GeneralPath) shape).curveTo(599.86005, 138.99, 597.0, 145.73, 595.94, 152.92);
        ((GeneralPath) shape).curveTo(595.75, 153.99, 595.46, 155.03, 595.07, 156.05);
        ((GeneralPath) shape).curveTo(590.94, 165.06, 588.47003, 174.71, 584.99, 183.97);
        ((GeneralPath) shape).curveTo(577.72, 205.37, 567.70996, 225.68, 559.87, 246.86);
        ((GeneralPath) shape).curveTo(554.45, 260.04, 549.51, 273.4, 544.87, 286.87);
        ((GeneralPath) shape).curveTo(539.87, 301.51, 534.11, 315.88998, 529.74, 330.74);
        ((GeneralPath) shape).curveTo(521.77997, 356.18, 511.78, 380.91998, 503.12, 406.12);
        ((GeneralPath) shape).curveTo(498.3, 420.94998, 492.99, 435.62, 488.61, 450.59);
        ((GeneralPath) shape).curveTo(485.43, 461.11, 481.15, 471.25, 477.71997, 481.7);
        ((GeneralPath) shape).curveTo(476.68997, 485.63, 474.56998, 489.08002, 472.39996, 492.45);
        ((GeneralPath) shape).curveTo(470.90997, 493.64, 470.90997, 495.62003, 471.89996, 497.02002);
        ((GeneralPath) shape).curveTo(473.72995, 499.51, 476.04996, 501.59003, 478.10995, 503.93002);
        ((GeneralPath) shape).curveTo(478.92996, 504.81003, 479.54996, 505.87003, 479.99997, 507.00003);
        ((GeneralPath) shape).curveTo(482.66998, 513.41003, 486.43997, 519.32, 490.25998, 525.09);
        ((GeneralPath) shape).curveTo(493.46997, 524.91003, 492.72998, 521.42004, 493.13998, 519.16003);
        ((GeneralPath) shape).lineTo(493.24, 518.33);
        ((GeneralPath) shape).curveTo(496.72, 508.32, 501.03998, 498.63, 504.69, 488.69);
        ((GeneralPath) shape).curveTo(507.97, 479.74, 511.39, 470.84, 514.99, 462.01);
        ((GeneralPath) shape).curveTo(516.5, 458.13, 518.1, 454.27002, 519.04, 450.22);
        ((GeneralPath) shape).curveTo(523.43, 442.4, 525.06, 433.52, 528.41, 425.28);
        ((GeneralPath) shape).curveTo(529.75995, 421.27, 529.69995, 416.76, 532.12, 413.13);
        ((GeneralPath) shape).curveTo(534.67, 409.25, 535.38, 404.57, 537.44, 400.46);
        ((GeneralPath) shape).curveTo(540.52, 394.11, 542.0, 387.15, 544.57, 380.59);
        ((GeneralPath) shape).curveTo(547.46, 372.73, 550.37, 364.88, 552.86, 356.88);
        ((GeneralPath) shape).curveTo(555.44, 348.25, 558.99, 339.94, 561.27997, 331.23);
        ((GeneralPath) shape).curveTo(564.18994, 323.46002, 567.31995, 315.75, 569.69995, 307.79);
        ((GeneralPath) shape).curveTo(571.13995, 304.2, 568.07996, 300.16, 570.76996, 296.89);
        ((GeneralPath) shape).curveTo(571.04, 296.65002, 571.58997, 296.16, 571.86993, 295.92);
        ((GeneralPath) shape).curveTo(573.01996, 294.95, 574.12994, 293.82, 574.55994, 292.32);
        ((GeneralPath) shape).curveTo(576.9799, 284.89, 578.50995, 277.2, 580.6699, 269.7);
        ((GeneralPath) shape).curveTo(584.93994, 255.68001, 589.1699, 241.59001, 595.1499, 228.18001);
        ((GeneralPath) shape).curveTo(597.6899, 223.1, 600.6899, 218.25, 603.1299, 213.11002);
        ((GeneralPath) shape).curveTo(603.3099, 212.80002, 603.6599, 212.18002, 603.8399, 211.87001);
        ((GeneralPath) shape).curveTo(607.5899, 208.59001, 611.4799, 205.46, 615.61993, 202.68001);
        ((GeneralPath) shape).curveTo(620.0999, 199.73001, 625.74994, 200.11, 630.88995, 199.96);
        ((GeneralPath) shape).curveTo(639.7399, 199.73001, 647.98, 203.51001, 655.80994, 207.19);
        ((GeneralPath) shape).curveTo(663.9799, 210.83, 670.7399, 216.82, 678.2399, 221.59);
        ((GeneralPath) shape).curveTo(680.94995, 223.7, 684.4699, 225.12, 686.36993, 228.12);
        ((GeneralPath) shape).curveTo(687.6599, 231.83, 687.0899, 235.9, 685.4899, 239.4);
        ((GeneralPath) shape).curveTo(682.13995, 246.82999, 678.55994, 254.18, 675.8999, 261.9);
        ((GeneralPath) shape).curveTo(666.8699, 287.52, 658.1499, 313.25, 648.7399, 338.72998);
        ((GeneralPath) shape).curveTo(643.13995, 355.05, 636.75995, 371.08, 629.9599, 386.93);
        ((GeneralPath) shape).curveTo(627.4199, 392.84, 624.6299, 398.68, 622.8799, 404.9);
        ((GeneralPath) shape).curveTo(622.6599, 405.43, 622.2199, 406.47998, 621.9999, 407.00998);
        ((GeneralPath) shape).curveTo(619.8299, 410.93997, 617.60986, 414.84998, 615.98987, 419.05);
        ((GeneralPath) shape).curveTo(610.3799, 433.16998, 604.2499, 447.08, 597.9499, 460.90997);
        ((GeneralPath) shape).curveTo(595.0199, 467.58, 590.7799, 473.73996, 588.9499, 480.86996);
        ((GeneralPath) shape).curveTo(588.6899, 481.36996, 588.1599, 482.37997, 587.8899, 482.87997);
        ((GeneralPath) shape).curveTo(586.3899, 484.61996, 585.29987, 486.65997, 584.8099, 488.90997);
        ((GeneralPath) shape).curveTo(584.60986, 489.43997, 584.2099, 490.50998, 584.0199, 491.03998);
        ((GeneralPath) shape).curveTo(580.8699, 496.36, 577.9399, 501.80997, 575.5199, 507.50998);
        ((GeneralPath) shape).curveTo(570.9099, 518.26996, 566.0799, 528.93, 561.8599, 539.86);
        ((GeneralPath) shape).curveTo(554.31995, 558.25, 547.81995, 577.05, 540.5899, 595.56);
        ((GeneralPath) shape).curveTo(538.3499, 600.88, 536.1099, 606.23, 534.9199, 611.9);
        ((GeneralPath) shape).curveTo(534.68994, 612.44, 534.2399, 613.5, 534.00995, 614.03);
        ((GeneralPath) shape).curveTo(528.61993, 622.26, 527.45996, 632.54004, 521.70996, 640.58);
        ((GeneralPath) shape).curveTo(519.58997, 642.84, 517.11, 644.72003, 514.99, 646.98004);
        ((GeneralPath) shape).curveTo(517.44, 648.73004, 520.24, 649.91003, 523.05, 650.99005);
        ((GeneralPath) shape).curveTo(524.18, 651.4, 525.23, 652.04004, 526.12, 652.8901);
        ((GeneralPath) shape).curveTo(534.21, 660.5101, 542.0, 668.44006, 549.14, 676.9701);
        ((GeneralPath) shape).curveTo(549.96, 677.8701, 550.74, 678.8501, 551.08, 680.07007);
        ((GeneralPath) shape).curveTo(551.34, 680.5201, 551.86005, 681.42004, 552.13, 681.88007);
        ((GeneralPath) shape).curveTo(553.62, 682.0901, 553.65, 680.1501, 553.94, 679.18005);
        ((GeneralPath) shape).curveTo(554.25, 677.65, 554.92, 676.22003, 555.85, 674.97003);
        ((GeneralPath) shape).curveTo(557.29, 672.97003, 558.70996, 670.95, 559.92, 668.80005);
        ((GeneralPath) shape).curveTo(567.37, 656.0801, 574.98, 643.46, 583.27997, 631.28);
        ((GeneralPath) shape).curveTo(592.73, 615.94, 602.52997, 600.81006, 613.57996, 586.57);
        ((GeneralPath) shape).curveTo(626.88995, 568.03, 640.12994, 549.39, 651.68994, 529.68);
        ((GeneralPath) shape).curveTo(659.80994, 515.31, 668.1099, 501.02, 677.32996, 487.32);
        ((GeneralPath) shape).curveTo(683.83997, 477.12, 691.81995, 467.92, 700.7399, 459.76);
        ((GeneralPath) shape).curveTo(707.42993, 454.39, 715.1499, 449.64, 723.8599, 448.7);
        ((GeneralPath) shape).curveTo(730.38995, 447.32, 737.30994, 449.33002, 742.74994, 453.04);
        ((GeneralPath) shape).curveTo(749.0999, 458.67, 750.6099, 468.54, 747.1699, 476.14);
        ((GeneralPath) shape).curveTo(739.74994, 494.40002, 723.50995, 506.55002, 711.87994, 521.88);
        ((GeneralPath) shape).curveTo(711.64996, 522.15, 711.17993, 522.69, 710.94995, 522.96);
        ((GeneralPath) shape).curveTo(705.1, 528.2, 700.07996, 534.27, 695.92993, 540.93);
        ((GeneralPath) shape).curveTo(695.69995, 541.2, 695.2399, 541.75, 695.00995, 542.02);
        ((GeneralPath) shape).curveTo(686.8599, 549.96, 680.44995, 559.42004, 672.9199, 567.92004);
        ((GeneralPath) shape).curveTo(666.3899, 575.16003, 660.7899, 583.16003, 654.99994, 591.00006);
        ((GeneralPath) shape).curveTo(653.00995, 593.47003, 651.39996, 596.2101, 649.7899, 598.94006);
        ((GeneralPath) shape).curveTo(649.5499, 599.2001, 649.05994, 599.7201, 648.81995, 599.98004);
        ((GeneralPath) shape).curveTo(647.50995, 600.94006, 646.44995, 602.18005, 645.82996, 603.69006);
        ((GeneralPath) shape).curveTo(645.64996, 603.99005, 645.27997, 604.5901, 645.1, 604.8901);
        ((GeneralPath) shape).curveTo(639.16, 610.11005, 634.27997, 616.32007, 629.89996, 622.87006);
        ((GeneralPath) shape).curveTo(629.67, 623.1401, 629.19995, 623.68005, 628.97, 623.9501);
        ((GeneralPath) shape).curveTo(625.43, 627.1401, 622.00995, 630.56006, 619.87994, 634.88007);
        ((GeneralPath) shape).curveTo(619.36993, 635.69006, 618.76996, 636.42004, 618.07996, 637.0801);
        ((GeneralPath) shape).curveTo(614.08997, 640.4701, 610.68994, 644.4601, 607.86993, 648.87006);
        ((GeneralPath) shape).curveTo(607.64996, 649.1501, 607.20996, 649.7001, 606.9799, 649.98004);
        ((GeneralPath) shape).curveTo(598.11993, 657.57007, 591.7899, 667.49005, 584.5199, 676.50006);
        ((GeneralPath) shape).curveTo(580.7299, 680.93005, 577.7199, 685.8901, 575.2599, 691.17004);
        ((GeneralPath) shape).curveTo(574.7199, 692.2601, 573.8899, 693.17004, 572.9999, 693.99005);
        ((GeneralPath) shape).curveTo(571.0099, 695.5101, 569.5799, 697.5801, 568.9399, 700.0101);
        ((GeneralPath) shape).curveTo(568.0599, 702.5401, 566.8799, 705.07007, 564.8099, 706.86005);
        ((GeneralPath) shape).curveTo(563.65985, 707.9501, 562.41986, 708.98004, 561.47986, 710.28);
        ((GeneralPath) shape).curveTo(560.85986, 715.05005, 561.15985, 719.93005, 560.3699, 724.7);
        ((GeneralPath) shape).curveTo(559.53986, 726.56, 555.6399, 727.94, 557.7699, 730.11);
        ((GeneralPath) shape).curveTo(559.9799, 730.18, 564.4199, 730.32996, 566.6399, 730.39996);
        ((GeneralPath) shape).curveTo(572.4499, 729.79, 577.4299, 733.11993, 582.23987, 735.8);
        ((GeneralPath) shape).curveTo(586.95984, 738.64996, 590.39984, 743.19, 593.0699, 747.94);
        ((GeneralPath) shape).curveTo(595.47986, 756.57, 597.35986, 765.82, 594.8299, 774.64);
        ((GeneralPath) shape).curveTo(592.8599, 781.63, 587.5599, 786.77, 584.1599, 793.0);
        ((GeneralPath) shape).curveTo(580.0199, 796.67, 575.5699, 800.06, 570.6099, 802.55);
        ((GeneralPath) shape).curveTo(563.5999, 806.33997, 555.13995, 804.95, 547.5299, 804.93);
        ((GeneralPath) shape).curveTo(540.80994, 805.2, 534.6299, 801.26, 531.0099, 795.82);
        ((GeneralPath) shape).curveTo(528.5099, 792.84, 527.4599, 788.98, 525.2099, 785.88);
        ((GeneralPath) shape).curveTo(520.1599, 790.94, 515.4499, 796.54, 509.1499, 800.12);
        ((GeneralPath) shape).curveTo(505.1299, 802.89, 500.2799, 804.0, 495.78992, 805.76);
        ((GeneralPath) shape).curveTo(489.1199, 805.9, 481.5999, 807.24, 475.70993, 803.22003);
        ((GeneralPath) shape).curveTo(471.83994, 800.41003, 468.51993, 796.73004, 466.16992, 792.57);
        ((GeneralPath) shape).curveTo(463.61993, 785.12, 463.66992, 777.11, 464.0299, 769.36);
        ((GeneralPath) shape).curveTo(464.3099, 763.89996, 467.56992, 759.27997, 469.9599, 754.55);
        ((GeneralPath) shape).curveTo(469.9099, 754.1, 469.7999, 753.20996, 469.7499, 752.76996);
        ((GeneralPath) shape).curveTo(443.2199, 753.17, 416.6899, 752.89996, 390.1599, 753.11);
        ((GeneralPath) shape).curveTo(386.7499, 753.3, 384.06992, 750.89996, 380.9399, 750.04);
        ((GeneralPath) shape).curveTo(378.6299, 752.1, 377.7199, 755.38, 375.88992, 757.87);
        ((GeneralPath) shape).curveTo(368.9999, 767.3, 363.52994, 777.64, 357.6899, 787.72);
        ((GeneralPath) shape).curveTo(354.91992, 791.68994, 352.3699, 795.81995, 350.1499, 800.12994);
        ((GeneralPath) shape).curveTo(346.4999, 803.81995, 343.1499, 807.80994, 339.5599, 811.55994);
        ((GeneralPath) shape).curveTo(333.9299, 816.3499, 327.2499, 820.0399, 320.0299, 821.7399);
        ((GeneralPath) shape).curveTo(313.9099, 822.2199, 307.78992, 822.2999, 301.66992, 821.9699);
        ((GeneralPath) shape).curveTo(295.7499, 821.9499, 290.26993, 819.3999, 284.38992, 819.11993);
        ((GeneralPath) shape).curveTo(272.73993, 818.56995, 261.06992, 819.43994, 249.42993, 818.7299);
        ((GeneralPath) shape).curveTo(245.78993, 818.43994, 242.03993, 818.0199, 238.88994, 816.0399);
        ((GeneralPath) shape).curveTo(233.42993, 812.6499, 227.61993, 808.87994, 224.83994, 802.8399);
        ((GeneralPath) shape).curveTo(223.27994, 799.6399, 223.43994, 796.0099, 222.71994, 792.6099);
        ((GeneralPath) shape).curveTo(220.21994, 791.62994, 218.04994, 792.8399, 215.85994, 793.63995);
        ((GeneralPath) shape).curveTo(207.16994, 796.97, 198.70995, 800.89996, 189.84995, 803.74994);
        ((GeneralPath) shape).curveTo(185.86995, 804.93994, 182.06995, 806.63995, 178.23994, 808.2299);
        ((GeneralPath) shape).curveTo(172.55995, 810.6399, 166.42995, 811.6399, 160.56995, 813.5199);
        ((GeneralPath) shape).curveTo(153.72995, 815.9999, 146.35994, 816.0899, 139.16995, 816.2199);
        ((GeneralPath) shape).curveTo(134.09995, 816.5899, 129.38995, 814.5399, 124.429955, 813.99994);
        ((GeneralPath) shape).curveTo(100.88995, 813.45996, 77.77995, 819.1699, 54.259956, 819.17993);
        ((GeneralPath) shape).curveTo(53.779957, 827.1499, 54.939957, 835.05994, 55.029957, 843.0499);
        ((GeneralPath) shape).curveTo(55.119957, 854.94995, 56.189957, 866.8599, 58.399956, 878.56995);
        ((GeneralPath) shape).curveTo(59.809956, 886.7299, 63.749954, 894.08997, 66.01996, 901.99994);
        ((GeneralPath) shape).curveTo(68.58996, 910.76996, 72.70996, 918.9699, 76.78996, 927.1099);
        ((GeneralPath) shape).curveTo(78.71996, 931.31995, 80.78996, 935.55994, 83.92996, 939.0399);
        ((GeneralPath) shape).curveTo(88.95996, 948.9099, 97.229965, 956.4099, 103.81996, 965.17993);
        ((GeneralPath) shape).curveTo(115.839966, 979.0299, 130.95996, 989.7299, 146.05997, 999.93994);
        ((GeneralPath) shape).curveTo(153.16997, 1004.7999, 160.91997, 1008.49994, 168.54997, 1012.39996);
        ((GeneralPath) shape).curveTo(178.85997, 1017.19995, 188.88997, 1022.6, 199.64998, 1026.2999);
        ((GeneralPath) shape).curveTo(203.66998, 1027.7999, 207.42998, 1029.7999, 211.08998, 1031.9999);
        ((GeneralPath) shape).curveTo(214.81998, 1034.1998, 218.88998, 1035.7999, 222.53998, 1038.1998);
        ((GeneralPath) shape).curveTo(224.07997, 1040.1998, 225.14998, 1042.5999, 227.15997, 1044.0999);
        ((GeneralPath) shape).curveTo(234.36998, 1046.4999, 241.98997, 1047.1998, 249.31998, 1049.0999);
        ((GeneralPath) shape).curveTo(249.50998, 1049.6998, 249.87997, 1050.8999, 250.06998, 1051.4999);
        ((GeneralPath) shape).curveTo(258.53998, 1051.1998, 267.03998, 1050.5999, 275.50998, 1051.2999);
        ((GeneralPath) shape).curveTo(285.83997, 1052.6, 296.27, 1052.9999, 306.53998, 1054.7999);
        ((GeneralPath) shape).curveTo(317.96997, 1055.3999, 329.41998, 1054.7999, 340.87, 1055.1);
        ((GeneralPath) shape).curveTo(346.19, 1055.6, 351.27, 1053.7999, 356.51, 1053.2999);
        ((GeneralPath) shape).curveTo(360.52002, 1052.6, 364.6, 1052.3999, 368.62, 1051.7999);
        ((GeneralPath) shape).curveTo(371.99, 1051.2, 375.0, 1049.4999, 378.06, 1048.1);
        ((GeneralPath) shape).curveTo(383.58, 1045.7, 388.97, 1043.0, 394.37, 1040.4);
        ((GeneralPath) shape).curveTo(398.97, 1038.1, 403.94, 1036.8, 408.59, 1034.6);
        ((GeneralPath) shape).curveTo(416.35, 1031.0, 425.04, 1030.2999, 433.47, 1029.2999);
        ((GeneralPath) shape).curveTo(441.9, 1028.7999, 449.82, 1025.2999, 456.96, 1020.8999);
        ((GeneralPath) shape).curveTo(462.18, 1017.5999, 467.5, 1014.2999, 472.06, 1009.9999);
        ((GeneralPath) shape).curveTo(483.52, 999.4999, 494.16998, 988.0899, 504.15, 976.1399);
        ((GeneralPath) shape).curveTo(512.86, 964.9199, 522.02, 954.0399, 531.11, 943.1199);
        ((GeneralPath) shape).curveTo(537.44, 935.7499, 542.22, 927.2099, 546.55, 918.5699);
        ((GeneralPath) shape).curveTo(553.43, 905.1199, 558.8, 890.97986, 563.76, 876.72986);
        ((GeneralPath) shape).curveTo(566.94, 866.63983, 570.16003, 856.51984, 572.08, 846.09985);
        ((GeneralPath) shape).curveTo(573.05, 838.60986, 576.53, 831.71985, 577.32, 824.1998);
        ((GeneralPath) shape).curveTo(578.3, 814.4198, 581.12, 804.88983, 584.94, 795.8598);
        ((GeneralPath) shape).curveTo(589.11, 789.9798, 593.52, 784.2598, 597.68, 778.3798);
        ((GeneralPath) shape).curveTo(601.82, 769.3498, 598.0, 759.39984, 599.63, 749.9498);
        ((GeneralPath) shape).lineTo(599.7, 749.13983);
        ((GeneralPath) shape).curveTo(603.03, 747.01984, 606.29004, 750.34985, 608.99, 751.9398);
        ((GeneralPath) shape).curveTo(614.67, 755.32983, 616.77, 762.3698, 617.58997, 768.5398);
        ((GeneralPath) shape).curveTo(618.81995, 779.2298, 613.68994, 789.3598, 607.97, 797.9998);
        ((GeneralPath) shape).curveTo(606.82996, 800.13983, 605.14996, 801.9498, 602.97, 803.0598);
        ((GeneralPath) shape).curveTo(599.67, 805.2798, 595.50995, 806.9098, 593.70996, 810.7298);
        ((GeneralPath) shape).curveTo(590.20996, 817.6898, 588.81995, 825.4698, 587.05, 833.0098);
        ((GeneralPath) shape).curveTo(583.67, 849.13983, 578.17, 864.6998, 573.49, 880.47986);
        ((GeneralPath) shape).curveTo(571.27, 887.95984, 568.3, 895.1799, 565.45, 902.4399);
        ((GeneralPath) shape).curveTo(563.05, 908.6399, 559.78, 914.48987, 557.89, 920.8899);
        ((GeneralPath) shape).curveTo(557.65, 921.3999, 557.18, 922.4199, 556.95, 922.9399);
        ((GeneralPath) shape).curveTo(550.73004, 932.6399, 545.51, 942.9299, 540.09, 953.0899);
        ((GeneralPath) shape).curveTo(533.06, 966.4899, 523.83, 978.5799, 514.25, 990.2399);
        ((GeneralPath) shape).curveTo(512.01, 993.0299, 509.98, 995.9799, 507.89, 998.8999);
        ((GeneralPath) shape).curveTo(507.66, 999.17993, 507.21002, 999.7299, 506.99002, 999.9999);
        ((GeneralPath) shape).curveTo(497.1, 1008.79987, 488.57, 1018.9999, 478.04, 1026.9999);
        ((GeneralPath) shape).curveTo(472.88, 1031.7999, 466.55002, 1034.7999, 461.07, 1039.0999);
        ((GeneralPath) shape).curveTo(466.4, 1046.0999, 473.76, 1051.0999, 480.91, 1056.0999);
        ((GeneralPath) shape).curveTo(481.2, 1056.2998, 481.77, 1056.6998, 482.05002, 1056.8999);
        ((GeneralPath) shape).curveTo(484.71002, 1061.0999, 487.53003, 1065.3999, 488.79, 1070.2999);
        ((GeneralPath) shape).curveTo(491.07, 1080.1, 495.28, 1089.3999, 498.02002, 1099.2);
        ((GeneralPath) shape).curveTo(499.46002, 1104.2999, 498.13, 1109.7999, 497.07, 1114.8999);
        ((GeneralPath) shape).curveTo(495.91, 1118.7, 495.57, 1122.8999, 493.29, 1126.2);
        ((GeneralPath) shape).curveTo(489.1, 1131.8999, 483.99002, 1137.2, 477.47, 1140.1);
        ((GeneralPath) shape).curveTo(473.96, 1141.4, 469.9, 1141.6, 466.4, 1140.2);
        ((GeneralPath) shape).curveTo(464.12, 1138.7999, 462.16998, 1137.0, 459.88998, 1135.7);
        ((GeneralPath) shape).curveTo(455.38998, 1134.6, 450.90997, 1135.7999, 446.43997, 1136.2999);
        ((GeneralPath) shape).curveTo(433.12997, 1137.9999, 419.69998, 1137.8999, 406.31998, 1138.2);
        ((GeneralPath) shape).curveTo(377.90997, 1140.3999, 349.36, 1137.5, 320.96997, 1140.0);
        ((GeneralPath) shape).curveTo(290.23996, 1140.4, 259.53998, 1139.0, 228.83997, 1138.1);
        ((GeneralPath) shape).curveTo(222.09996, 1137.7, 215.35997, 1136.7999, 208.78996, 1135.2);
        ((GeneralPath) shape).curveTo(203.13997, 1133.7, 197.71997, 1131.3999, 192.07996, 1129.8999);
        ((GeneralPath) shape).curveTo(189.23996, 1128.8999, 186.15996, 1128.2, 183.97995, 1125.9999);
        ((GeneralPath) shape).curveTo(182.26994, 1124.2999, 180.28995, 1122.8999, 178.14995, 1121.7999);
        ((GeneralPath) shape).curveTo(177.86995, 1121.6, 177.30995, 1121.2, 177.01994, 1120.9999);
        ((GeneralPath) shape).curveTo(174.24994, 1115.5999, 171.13994, 1110.2999, 170.65994, 1104.1998);
        ((GeneralPath) shape).curveTo(169.04994, 1095.1998, 172.04994, 1086.3998, 173.92995, 1077.7998);
        ((GeneralPath) shape).curveTo(174.41995, 1075.5999, 175.17995, 1073.3998, 176.92995, 1071.8998);
        ((GeneralPath) shape).curveTo(180.81995, 1067.6998, 183.69995, 1062.6998, 187.71994, 1058.6998);
        ((GeneralPath) shape).curveTo(191.70995, 1055.4999, 196.01994, 1052.7998, 200.13994, 1049.7998);
        ((GeneralPath) shape).curveTo(189.46994, 1043.3998, 177.47993, 1039.5999, 166.94994, 1032.9998);
        ((GeneralPath) shape).curveTo(158.78993, 1027.9998, 151.03993, 1022.29974, 143.18994, 1016.79974);
        ((GeneralPath) shape).curveTo(140.13994, 1014.19977, 137.19994, 1011.3997, 133.86993, 1009.09973);
        ((GeneralPath) shape).curveTo(117.77994, 997.10974, 102.13994, 984.22974, 89.13994, 968.86975);
        ((GeneralPath) shape).curveTo(84.87994, 964.06976, 81.81994, 958.2698, 76.979935, 954.00977);
        ((GeneralPath) shape).curveTo(76.089935, 953.17975, 75.43993, 952.1598, 74.909935, 951.0898);
        ((GeneralPath) shape).curveTo(70.45994, 941.44977, 64.00993, 932.87976, 59.959934, 923.0498);
        ((GeneralPath) shape).curveTo(49.409935, 898.88983, 42.209934, 873.2698, 38.729935, 847.1398);
        ((GeneralPath) shape).curveTo(38.029934, 841.23975, 38.319935, 835.30975, 37.629936, 829.43976);
        ((GeneralPath) shape).curveTo(33.559937, 828.8298, 29.499935, 830.00977, 25.429935, 829.8298);
        ((GeneralPath) shape).curveTo(19.949936, 828.1698, 15.459935, 824.3998, 10.809936, 821.2098);
        ((GeneralPath) shape).curveTo(9.789936, 820.4798, 9.279936, 819.2898, 8.869936, 818.1698);
        ((GeneralPath) shape).curveTo(6.279936, 808.9198, 2.4399362, 799.1798, 5.2999363, 789.5198);
        ((GeneralPath) shape).curveTo(6.939936, 784.23975, 10.379936, 779.7998, 13.059937, 775.0298);
        ((GeneralPath) shape).curveTo(14.369936, 772.44977, 16.169937, 770.0498, 18.969936, 768.9898);
        ((GeneralPath) shape).curveTo(27.099937, 764.7798, 35.019936, 759.6598, 44.209938, 758.1198);
        ((GeneralPath) shape).curveTo(51.03994, 756.3398, 58.17994, 756.2498, 64.93994, 754.1298);
        ((GeneralPath) shape).curveTo(65.38994, 754.0498, 66.28994, 753.88983, 66.739944, 753.8098);
        ((GeneralPath) shape).curveTo(78.64995, 753.4198, 90.56995, 753.0998, 102.46994, 752.4498);
        ((GeneralPath) shape).curveTo(108.00994, 752.09985, 113.56994, 752.1198, 119.08994, 752.6998);
        ((GeneralPath) shape).curveTo(119.79994, 753.95984, 119.989944, 755.4198, 120.14994, 756.83984);
        ((GeneralPath) shape).curveTo(117.60994, 757.45984, 115.08994, 758.26984, 112.50994, 758.6998);
        ((GeneralPath) shape).curveTo(104.32994, 758.83984, 96.06994, 758.59985, 87.97994, 759.9998);
        ((GeneralPath) shape).curveTo(80.60994, 761.3498, 73.07994, 761.77985, 65.78994, 763.5598);
        ((GeneralPath) shape).curveTo(61.34994, 764.2298, 56.85994, 764.5098, 52.43994, 765.2298);
        ((GeneralPath) shape).curveTo(47.409943, 766.3998, 42.52994, 768.1198, 37.59994, 769.6198);
        ((GeneralPath) shape).curveTo(32.68994, 771.0898, 28.529942, 774.2398, 24.529942, 777.3398);
        ((GeneralPath) shape).curveTo(23.15994, 778.5798, 21.469942, 779.9098, 21.279942, 781.8998);
        ((GeneralPath) shape).curveTo(20.779942, 788.37976, 20.679941, 794.9098, 20.949942, 801.4298);
        ((GeneralPath) shape).curveTo(21.129942, 804.8798, 23.339941, 807.9798, 26.14994, 809.8698);
        ((GeneralPath) shape).curveTo(33.799942, 810.1698, 41.44994, 809.7498, 49.09994, 810.1598);
        ((GeneralPath) shape).curveTo(51.749943, 811.2998, 53.499943, 814.4298, 57.09994, 812.7298);
        ((GeneralPath) shape).curveTo(71.49994, 811.2798, 86.05994, 811.6898, 100.379944, 809.3098);
        ((GeneralPath) shape).curveTo(105.57994, 808.51984, 110.849945, 808.1898, 115.99995, 807.0698);
        ((GeneralPath) shape).curveTo(115.07995, 803.0398, 112.209946, 799.8598, 110.19994, 796.34985);
        ((GeneralPath) shape).curveTo(109.629944, 789.66986, 109.85995, 782.97986, 110.14994, 776.3099);
        ((GeneralPath) shape).curveTo(111.22994, 771.96985, 113.01994, 767.84985, 115.129944, 763.91986);
        ((GeneralPath) shape).curveTo(118.24995, 761.47986, 120.639946, 755.10986, 125.559944, 756.4999);
        ((GeneralPath) shape).curveTo(126.11994, 758.7799, 124.99995, 760.96985, 124.22994, 763.0599);
        ((GeneralPath) shape).curveTo(121.56994, 769.4299, 118.61994, 775.9399, 118.89994, 783.02985);
        ((GeneralPath) shape).curveTo(119.07994, 786.9299, 118.66994, 791.0098, 119.60994, 794.8798);
        ((GeneralPath) shape).curveTo(121.73994, 801.45984, 127.12994, 806.9898, 133.98994, 808.40985);
        ((GeneralPath) shape).curveTo(140.02994, 809.2499, 146.21994, 809.4399, 152.26994, 808.53986);
        ((GeneralPath) shape).curveTo(158.60994, 807.28986, 164.91994, 805.84985, 171.06995, 803.85986);
        ((GeneralPath) shape).curveTo(186.00995, 798.6899, 200.69995, 792.82983, 215.62994, 787.6199);
        ((GeneralPath) shape).curveTo(218.65994, 786.3699, 221.97995, 785.65985, 224.78995, 783.90985);
        ((GeneralPath) shape).curveTo(226.83995, 781.78986, 228.12994, 779.04987, 230.03995, 776.82983);
        ((GeneralPath) shape).curveTo(231.81995, 775.5598, 234.34995, 775.77985, 236.12994, 776.9398);
        ((GeneralPath) shape).curveTo(237.79994, 783.14984, 237.30994, 789.71985, 238.45995, 796.0398);
        ((GeneralPath) shape).curveTo(239.28995, 800.00977, 243.77995, 801.8898, 247.19995, 803.1398);
        ((GeneralPath) shape).curveTo(258.38995, 803.3398, 269.56995, 802.69977, 280.76996, 802.9598);
        ((GeneralPath) shape).curveTo(287.41995, 802.5498, 293.70996, 804.93976, 300.13995, 806.18976);
        ((GeneralPath) shape).curveTo(305.28995, 807.12976, 310.69995, 808.56976, 315.90994, 807.00977);
        ((GeneralPath) shape).curveTo(322.65994, 805.74976, 328.43994, 801.79974, 333.96994, 797.9698);
        ((GeneralPath) shape).curveTo(341.74994, 791.9098, 346.81995, 783.2198, 351.95993, 774.9798);
        ((GeneralPath) shape).curveTo(356.91992, 767.0598, 363.43994, 760.2298, 368.03992, 752.0698);
        ((GeneralPath) shape).curveTo(371.04993, 747.2998, 372.88992, 741.64984, 372.6299, 735.95984);
        ((GeneralPath) shape).curveTo(370.22992, 734.59985, 367.7099, 733.38983, 365.60992, 731.57983);
        ((GeneralPath) shape).curveTo(365.6899, 723.60986, 365.1299, 715.41986, 367.73993, 707.76984);
        ((GeneralPath) shape).curveTo(369.01993, 702.59985, 371.78992, 697.82983, 371.87994, 692.39984);
        ((GeneralPath) shape).curveTo(372.22995, 683.16986, 372.49994, 673.8698, 371.50995, 664.6898);
        ((GeneralPath) shape).curveTo(371.05994, 659.4098, 369.11993, 654.45984, 367.45996, 649.51984);
        ((GeneralPath) shape).curveTo(362.47995, 632.82983, 351.61996, 618.7598, 341.40997, 604.95984);
        ((GeneralPath) shape).curveTo(331.62997, 592.83984, 319.84998, 582.15985, 306.13998, 574.6798);
        ((GeneralPath) shape).curveTo(303.3, 573.1798, 300.49, 571.5898, 297.44998, 570.5498);
        ((GeneralPath) shape).curveTo(294.65, 569.5998, 291.49997, 569.1798, 289.41998, 566.8998);
        ((GeneralPath) shape).curveTo(286.15, 565.8598, 282.68, 565.7098, 279.40997, 564.7298);
        ((GeneralPath) shape).curveTo(274.36, 563.2398, 269.44998, 561.2198, 264.14996, 560.7798);
        ((GeneralPath) shape).curveTo(247.20996, 558.69977, 230.10995, 558.9698, 213.07996, 558.8698);
        ((GeneralPath) shape).curveTo(208.77995, 558.51984, 204.55995, 559.2898, 200.46996, 560.45984);
        ((GeneralPath) shape).curveTo(192.87996, 562.20984, 185.20996, 563.63983, 177.68996, 565.66986);
        ((GeneralPath) shape).curveTo(159.09996, 571.45984, 140.70996, 578.5599, 124.44995, 589.4399);
        ((GeneralPath) shape).curveTo(113.68995, 597.1799, 103.22995, 605.4599, 94.17995, 615.1799);
        ((GeneralPath) shape).curveTo(86.64995, 622.97986, 78.349945, 630.0799, 71.71995, 638.72986);
        ((GeneralPath) shape).curveTo(61.04995, 652.4498, 51.91995, 668.52985, 51.129948, 686.29987);
        ((GeneralPath) shape).curveTo(50.82995, 699.34985, 50.719948, 712.4299, 51.219948, 725.48987);
        ((GeneralPath) shape).curveTo(51.629948, 729.71985, 54.199947, 733.3099, 56.14995, 736.9499);
        ((GeneralPath) shape).curveTo(58.699947, 741.6599, 61.86995, 746.0699, 63.95995, 751.0299);
        ((GeneralPath) shape).curveTo(63.77995, 753.0999, 61.48995, 752.7999, 60.00995, 753.2299);
        ((GeneralPath) shape).curveTo(57.199947, 752.67993, 54.059948, 752.1699, 51.95995, 750.0499);
        ((GeneralPath) shape).curveTo(49.41995, 747.2399, 46.86995, 744.44995, 44.02995, 741.9599);
        ((GeneralPath) shape).curveTo(35.02995, 724.6499, 32.06995, 704.7099, 33.179947, 685.3899);
        ((GeneralPath) shape).curveTo(35.109947, 670.5599, 40.129948, 656.23987, 47.119946, 643.0599);
        ((GeneralPath) shape).curveTo(51.129944, 637.7699, 55.189945, 632.5199, 59.239944, 627.2599);
        ((GeneralPath) shape).curveTo(62.459946, 623.1499, 66.46995, 619.6799, 69.21994, 615.2099);
        ((GeneralPath) shape).curveTo(70.83994, 612.8399, 72.02994, 609.8099, 74.93994, 608.7399);
        ((GeneralPath) shape).curveTo(76.74994, 608.0999, 78.099945, 606.7099, 78.74994, 604.92993);
        ((GeneralPath) shape).curveTo(79.269936, 603.51996, 80.48994, 602.61993, 81.74994, 601.9199);
        ((GeneralPath) shape).curveTo(85.88994, 599.8299, 89.28994, 596.68994, 91.95994, 592.93994);
        ((GeneralPath) shape).curveTo(92.229935, 592.70996, 92.75994, 592.2399, 93.02994, 592.00995);
        ((GeneralPath) shape).curveTo(98.23994, 589.07996, 102.77994, 585.22, 106.949936, 580.97);
        ((GeneralPath) shape).curveTo(109.93993, 578.22, 113.019936, 575.32996, 116.949936, 574.05);
        ((GeneralPath) shape).curveTo(120.05994, 573.11, 122.73994, 571.26, 125.089935, 569.07);
        ((GeneralPath) shape).curveTo(128.12993, 567.68, 131.24994, 566.47003, 134.24994, 565.01);
        ((GeneralPath) shape).curveTo(135.38994, 564.71, 135.91994, 563.98, 135.85994, 562.82);
        ((GeneralPath) shape).curveTo(129.85994, 561.13, 123.339935, 559.85004, 118.449936, 555.71);
        ((GeneralPath) shape).curveTo(114.909935, 552.88, 110.84994, 549.63, 110.78993, 544.58);
        ((GeneralPath) shape).curveTo(109.049934, 534.48004, 109.71993, 523.61005, 114.34993, 514.32);
        ((GeneralPath) shape).curveTo(120.70993, 504.07, 128.27994, 493.97, 139.04993, 488.04);
        ((GeneralPath) shape).curveTo(147.13992, 483.25, 157.05992, 483.43002, 166.07993, 484.62);
        ((GeneralPath) shape).curveTo(174.11992, 486.01, 179.71992, 492.61, 186.46992, 496.57);
        ((GeneralPath) shape).curveTo(191.43993, 498.96002, 196.28992, 501.80002, 199.99992, 505.95);
        ((GeneralPath) shape).curveTo(204.50992, 516.03, 204.19992, 528.59, 197.83992, 537.8);
        ((GeneralPath) shape).curveTo(194.80992, 542.01, 189.55992, 543.5, 186.08992, 547.16);
        ((GeneralPath) shape).curveTo(190.99992, 546.63995, 195.80992, 545.48, 200.68993, 544.76996);
        ((GeneralPath) shape).curveTo(211.63992, 542.86993, 222.78993, 542.72, 233.86993, 542.92993);
        ((GeneralPath) shape).curveTo(240.28993, 542.68994, 246.52994, 544.69995, 252.94994, 544.2399);
        ((GeneralPath) shape).curveTo(253.42993, 540.25995, 252.81993, 536.12994, 254.03993, 532.26996);
        ((GeneralPath) shape).curveTo(257.21994, 523.55, 263.38992, 516.33997, 269.71994, 509.72995);
        ((GeneralPath) shape).curveTo(273.92993, 505.25995, 279.02994, 501.70996, 283.02994, 497.03995);
        ((GeneralPath) shape).curveTo(290.59995, 492.24994, 298.27994, 487.60995, 305.90994, 482.89993);
        ((GeneralPath) shape).curveTo(312.84995, 478.57993, 320.50995, 475.60992, 327.69995, 471.74994);
        ((GeneralPath) shape).curveTo(327.71994, 471.38995, 327.76996, 470.66995, 327.78995, 470.30994);
        ((GeneralPath) shape).curveTo(325.21994, 467.13992, 322.12994, 464.49994, 318.85995, 462.09995);
        ((GeneralPath) shape).curveTo(317.80997, 461.40994, 317.30997, 460.23996, 316.90994, 459.10995);
        ((GeneralPath) shape).curveTo(314.92993, 452.77997, 311.71994, 446.78995, 311.16995, 440.07996);
        ((GeneralPath) shape).curveTo(310.53995, 432.07996, 310.36996, 423.87994, 313.07996, 416.19995);
        ((GeneralPath) shape).curveTo(314.92996, 409.74994, 319.54996, 404.65994, 322.92996, 398.98996);
        ((GeneralPath) shape).curveTo(323.13995, 398.69995, 323.54996, 398.10995, 323.75995, 397.81995);
        ((GeneralPath) shape).curveTo(329.64996, 394.86993, 335.55994, 391.79996, 342.00995, 390.23996);
        ((GeneralPath) shape).curveTo(350.17996, 389.54996, 358.40994, 389.96997, 366.53995, 390.91995);
        ((GeneralPath) shape).curveTo(375.17996, 394.98996, 385.17993, 393.37994, 394.02994, 396.94995);
        ((GeneralPath) shape).curveTo(397.23993, 400.04996, 400.86993, 402.85995, 403.23993, 406.69995);
        ((GeneralPath) shape).curveTo(406.73993, 413.22995, 408.56992, 420.63995, 408.16992, 428.07996);
        ((GeneralPath) shape).curveTo(408.73993, 435.22995, 405.28992, 441.84995, 401.9699, 447.92996);
        ((GeneralPath) shape).curveTo(400.5899, 450.57996, 398.53992, 453.04996, 398.1899, 456.11996);
        ((GeneralPath) shape).curveTo(403.16992, 456.56998, 408.1499, 457.19995, 413.1199, 457.74997);
        ((GeneralPath) shape).curveTo(414.3099, 453.63998, 414.4199, 449.29996, 415.03992, 445.09998);
        ((GeneralPath) shape).curveTo(415.2199, 444.02, 415.51993, 442.96997, 415.92993, 441.96997);
        ((GeneralPath) shape).curveTo(418.21994, 436.08997, 420.99994, 430.17996, 420.86993, 423.70996);
        ((GeneralPath) shape).curveTo(420.42993, 423.27997, 419.53995, 422.42996, 419.08994, 421.99997);
        ((GeneralPath) shape).curveTo(416.94992, 420.91998, 418.01993, 418.52997, 420.02994, 418.18997);
        ((GeneralPath) shape).curveTo(421.72995, 417.18997, 423.86993, 416.41998, 424.72995, 414.48996);
        ((GeneralPath) shape).curveTo(426.37994, 410.38995, 427.66995, 406.04996, 427.40994, 401.59995);
        ((GeneralPath) shape).curveTo(427.21994, 397.62994, 429.64993, 394.18994, 430.52994, 390.44995);
        ((GeneralPath) shape).curveTo(432.32993, 382.58997, 435.38992, 375.10995, 437.23993, 367.25995);
        ((GeneralPath) shape).curveTo(443.76993, 347.91995, 449.72992, 328.37994, 454.52994, 308.52994);
        ((GeneralPath) shape).curveTo(460.11993, 286.09995, 467.09995, 264.04993, 472.48993, 241.56995);
        ((GeneralPath) shape).curveTo(474.13992, 236.47995, 475.93994, 231.42995, 477.26993, 226.23994);
        ((GeneralPath) shape).curveTo(479.23993, 218.64995, 482.03992, 211.24994, 483.15994, 203.45995);
        ((GeneralPath) shape).curveTo(489.26993, 181.96994, 496.82996, 160.89995, 502.21994, 139.20995);
        ((GeneralPath) shape).curveTo(504.59995, 126.40994, 507.63995, 113.74995, 511.33994, 101.279945);
        ((GeneralPath) shape).curveTo(516.56995, 84.72995, 520.67993, 67.849945, 524.9699, 51.039944);
        ((GeneralPath) shape).curveTo(526.5399, 44.719944, 528.9199, 38.609943, 530.1499, 32.18994);
        ((GeneralPath) shape).curveTo(530.3399, 31.639942, 530.7199, 30.539942, 530.9099, 29.98994);
        ((GeneralPath) shape).curveTo(535.42993, 23.16994, 538.9799, 15.34994, 546.1999, 10.86994);
        ((GeneralPath) shape).moveTo(561.6999, 25.34994);
        ((GeneralPath) shape).curveTo(557.7699, 26.25994, 554.5199, 29.25994, 552.5999, 32.709938);
        ((GeneralPath) shape).curveTo(545.0899, 47.22994, 541.7599, 63.379936, 536.8299, 78.839935);
        ((GeneralPath) shape).curveTo(534.9199, 85.269936, 533.2099, 91.74994, 531.0299, 98.07993);
        ((GeneralPath) shape).curveTo(530.0799, 100.89993, 529.0199, 103.78993, 529.0099, 106.81993);
        ((GeneralPath) shape).curveTo(538.7199, 105.67993, 548.2799, 103.34993, 558.0299, 102.45993);
        ((GeneralPath) shape).curveTo(562.0699, 101.65993, 565.7399, 99.63993, 569.6999, 98.58993);
        ((GeneralPath) shape).curveTo(576.9799, 97.16993, 583.73987, 93.94993, 591.1499, 93.05993);
        ((GeneralPath) shape).curveTo(591.7699, 93.01993, 592.9999, 92.91993, 593.6199, 92.87993);
        ((GeneralPath) shape).curveTo(593.65985, 90.27993, 592.6999, 87.49993, 594.09985, 85.08993);
        ((GeneralPath) shape).curveTo(595.22986, 84.689926, 596.1199, 84.99993, 596.78986, 85.99993);
        ((GeneralPath) shape).curveTo(596.57983, 87.34993, 596.26984, 88.66993, 596.04987, 90.00993);
        ((GeneralPath) shape).curveTo(599.66986, 90.57993, 599.59985, 85.34993, 598.85986, 83.21993);
        ((GeneralPath) shape).curveTo(594.1999, 82.84993, 589.39984, 83.50993, 585.03986, 85.17993);
        ((GeneralPath) shape).lineTo(585.0699, 86.02993);
        ((GeneralPath) shape).curveTo(576.1799, 87.98993, 567.6999, 91.44993, 558.9299, 93.85993);
        ((GeneralPath) shape).curveTo(552.7699, 95.19993, 546.90985, 97.82993, 540.65985, 98.67993);
        ((GeneralPath) shape).curveTo(538.72986, 99.77993, 534.45984, 99.12993, 534.97986, 96.23993);
        ((GeneralPath) shape).curveTo(540.4999, 92.24993, 547.41986, 90.86993, 553.78986, 88.78993);
        ((GeneralPath) shape).curveTo(557.97986, 87.479935, 562.32983, 86.799934, 566.59985, 85.799934);
        ((GeneralPath) shape).lineTo(566.8198, 85.019936);
        ((GeneralPath) shape).curveTo(572.89984, 83.88994, 578.26984, 80.37994, 584.40985, 79.449936);
        ((GeneralPath) shape).curveTo(587.32983, 77.99994, 592.6998, 79.31994, 594.34985, 75.68993);
        ((GeneralPath) shape).curveTo(596.65985, 76.09994, 598.9999, 76.13993, 601.3799, 75.80994);
        ((GeneralPath) shape).curveTo(602.16986, 73.949936, 602.5899, 71.949936, 603.0299, 69.979935);
        ((GeneralPath) shape).curveTo(604.5499, 62.529934, 606.86993, 55.279934, 608.0099, 47.759933);
        ((GeneralPath) shape).curveTo(608.9399, 45.309933, 609.4699, 42.729935, 609.91986, 40.149933);
        ((GeneralPath) shape).curveTo(608.82983, 39.059933, 607.60986, 37.739933, 605.91986, 37.889935);
        ((GeneralPath) shape).lineTo(605.58984, 37.159935);
        ((GeneralPath) shape).curveTo(596.01984, 34.539936, 587.09985, 30.049934, 577.7498, 26.809935);
        ((GeneralPath) shape).lineTo(577.83984, 25.959934);
        ((GeneralPath) shape).curveTo(572.5098, 25.109934, 567.0598, 24.819935, 561.6998, 25.349934);
        ((GeneralPath) shape).moveTo(584.4398, 99.16994);
        ((GeneralPath) shape).lineTo(584.4898, 100.06994);
        ((GeneralPath) shape).curveTo(580.1098, 101.42994, 575.9998, 103.62994, 571.4898, 104.53994);
        ((GeneralPath) shape).curveTo(568.2498, 105.01994, 565.1198, 105.92994, 562.1198, 107.18994);
        ((GeneralPath) shape).curveTo(559.1698, 108.44994, 555.89984, 108.22994, 552.8098, 108.75994);
        ((GeneralPath) shape).curveTo(544.2798, 109.83994, 535.9398, 112.09994, 527.4298, 113.29994);
        ((GeneralPath) shape).curveTo(525.5998, 113.72994, 525.8998, 115.46994, 526.01984, 116.90994);
        ((GeneralPath) shape).curveTo(535.90985, 116.33994, 545.6998, 114.50994, 555.64984, 114.989944);
        ((GeneralPath) shape).lineTo(555.82983, 114.06995);
        ((GeneralPath) shape).curveTo(565.97986, 112.239944, 576.3198, 111.04995, 586.2598, 108.209946);
        ((GeneralPath) shape).curveTo(588.53986, 108.17995, 590.7998, 107.94994, 593.0598, 107.50995);
        ((GeneralPath) shape).curveTo(594.6298, 105.00995, 595.13983, 101.86995, 594.7198, 98.96995);
        ((GeneralPath) shape).curveTo(592.1498, 99.01995, 587.00977, 99.11995, 584.43976, 99.169945);
        ((GeneralPath) shape).moveTo(580.34973, 115.08994);
        ((GeneralPath) shape).lineTo(580.12976, 115.94994);
        ((GeneralPath) shape).curveTo(578.11975, 116.129944, 576.0798, 116.25994, 574.1498, 116.879944);
        ((GeneralPath) shape).curveTo(571.19977, 117.11994, 568.0398, 117.44994, 565.6698, 119.40994);
        ((GeneralPath) shape).curveTo(569.3698, 120.07994, 573.1498, 120.279945, 577.0198, 119.97994);
        ((GeneralPath) shape).curveTo(578.2298, 120.11994, 579.44977, 120.22994, 580.67975, 120.309944);
        ((GeneralPath) shape).curveTo(583.0297, 121.64994, 585.7698, 120.97994, 588.3397, 120.93994);
        ((GeneralPath) shape).curveTo(590.6997, 119.56994, 590.7697, 116.379944, 590.98975, 113.95994);
        ((GeneralPath) shape).curveTo(587.42975, 114.28994, 583.8898, 114.659935, 580.34973, 115.089935);
        ((GeneralPath) shape).moveTo(556.74976, 125.42993);
        ((GeneralPath) shape).curveTo(553.78973, 125.78993, 550.93976, 126.62993, 548.0298, 127.12993);
        ((GeneralPath) shape).curveTo(539.5898, 128.66992, 530.9798, 127.65993, 522.4798, 128.06993);
        ((GeneralPath) shape).curveTo(520.3598, 128.85992, 520.9598, 131.17993, 520.9598, 132.93993);
        ((GeneralPath) shape).curveTo(526.7398, 132.29993, 532.3998, 130.79993, 538.19977, 130.20993);
        ((GeneralPath) shape).curveTo(548.12976, 128.25993, 558.54974, 129.02994, 568.2198, 125.83993);
        ((GeneralPath) shape).lineTo(567.7198, 125.079926);
        ((GeneralPath) shape).curveTo(564.0598, 124.80993, 560.3998, 124.91992, 556.7498, 125.429924);
        ((GeneralPath) shape).moveTo(549.0098, 136.90993);
        ((GeneralPath) shape).curveTo(546.9898, 137.05992, 544.96985, 137.29993, 543.02985, 137.86993);
        ((GeneralPath) shape).curveTo(534.79987, 140.29993, 526.1298, 140.09993, 517.72986, 141.50993);
        ((GeneralPath) shape).curveTo(516.0699, 144.06993, 515.88983, 147.22993, 515.07983, 150.10994);
        ((GeneralPath) shape).curveTo(514.32983, 153.48994, 512.78986, 156.60994, 511.82983, 159.91994);
        ((GeneralPath) shape).curveTo(508.03983, 177.46994, 499.75983, 193.55994, 494.74985, 210.72993);
        ((GeneralPath) shape).curveTo(492.63986, 217.38994, 490.25986, 224.02994, 489.06985, 230.92993);
        ((GeneralPath) shape).curveTo(492.63986, 230.71992, 495.84985, 228.96992, 499.30984, 228.22993);
        ((GeneralPath) shape).curveTo(504.42984, 226.96994, 509.70984, 226.75993, 514.89984, 225.86993);
        ((GeneralPath) shape).lineTo(514.60986, 225.02994);
        ((GeneralPath) shape).curveTo(525.46985, 222.13994, 536.79987, 220.77994, 547.21985, 216.34995);
        ((GeneralPath) shape).curveTo(548.45984, 215.97995, 549.4299, 215.04994, 549.96985, 213.87994);
        ((GeneralPath) shape).curveTo(552.5698, 213.35994, 555.32983, 213.20995, 557.71985, 211.94995);
        ((GeneralPath) shape).curveTo(559.0599, 210.34995, 559.72986, 208.32996, 560.5098, 206.41995);
        ((GeneralPath) shape).curveTo(564.1898, 196.38995, 568.45984, 186.54996, 571.1698, 176.18996);
        ((GeneralPath) shape).curveTo(574.5298, 165.83995, 577.1198, 155.24995, 581.0398, 145.08995);
        ((GeneralPath) shape).curveTo(582.3598, 141.62994, 583.3098, 137.92995, 582.6698, 134.17995);
        ((GeneralPath) shape).curveTo(581.1798, 133.97995, 579.6798, 133.92995, 578.1998, 134.05995);
        ((GeneralPath) shape).curveTo(568.4198, 134.18996, 558.65985, 135.35995, 549.0098, 136.90996);
        ((GeneralPath) shape).moveTo(612.9498, 224.06996);
        ((GeneralPath) shape).curveTo(607.38983, 232.82996, 603.3098, 242.50996, 600.47986, 252.47997);
        ((GeneralPath) shape).curveTo(596.78986, 264.89996, 592.28986, 277.14996, 590.08984, 289.96997);
        ((GeneralPath) shape).curveTo(595.3098, 289.38998, 600.5098, 288.73996, 605.72986, 288.05997);
        ((GeneralPath) shape).lineTo(605.84985, 287.22998);
        ((GeneralPath) shape).curveTo(612.60986, 285.43997, 619.35986, 283.59998, 626.23987, 282.24997);
        ((GeneralPath) shape).curveTo(630.52985, 281.03998, 635.1399, 280.36996, 639.0799, 278.13998);
        ((GeneralPath) shape).curveTo(642.7899, 276.53, 646.8099, 275.44998, 650.23987, 273.24);
        ((GeneralPath) shape).curveTo(651.29987, 271.78998, 651.79987, 270.03, 652.41986, 268.36);
        ((GeneralPath) shape).curveTo(656.3199, 256.72998, 660.3099, 245.08998, 665.78986, 234.09999);
        ((GeneralPath) shape).curveTo(663.85986, 230.76999, 660.10986, 229.09, 657.02985, 227.01999);
        ((GeneralPath) shape).curveTo(655.90985, 225.43999, 654.46985, 224.10999, 652.7498, 223.21999);
        ((GeneralPath) shape).curveTo(645.33984, 219.13998, 637.5998, 215.12999, 629.0498, 214.26999);
        ((GeneralPath) shape).curveTo(622.3798, 214.43999, 616.4398, 218.55998, 612.9498, 224.06999);
        ((GeneralPath) shape).moveTo(539.2498, 225.34);
        ((GeneralPath) shape).lineTo(539.4498, 226.12);
        ((GeneralPath) shape).curveTo(532.32983, 228.29999, 524.97986, 229.65, 517.84985, 231.79999);
        ((GeneralPath) shape).curveTo(509.80984, 233.24998, 502.18985, 236.33998, 494.25986, 238.24998);
        ((GeneralPath) shape).curveTo(491.88986, 238.87999, 489.37985, 239.02998, 487.17987, 240.08998);
        ((GeneralPath) shape).curveTo(485.61987, 243.99998, 483.96988, 247.96999, 483.11987, 252.10999);
        ((GeneralPath) shape).curveTo(491.11987, 251.55998, 498.74988, 249.00998, 506.59988, 247.59999);
        ((GeneralPath) shape).curveTo(512.2699, 246.35999, 517.9699, 245.23, 523.60986, 243.84999);
        ((GeneralPath) shape).curveTo(523.47986, 242.57999, 523.15985, 241.34, 523.09985, 240.06999);
        ((GeneralPath) shape).curveTo(526.40985, 237.64, 530.8198, 238.17, 534.64984, 237.87999);
        ((GeneralPath) shape).curveTo(539.95984, 238.04999, 545.26984, 236.37999, 549.84985, 233.74998);
        ((GeneralPath) shape).curveTo(551.7598, 229.81999, 553.85986, 225.73999, 554.07983, 221.28998);
        ((GeneralPath) shape).curveTo(548.9998, 222.05998, 544.1198, 223.81998, 539.2498, 225.33998);
        ((GeneralPath) shape).moveTo(526.5498, 250.60999);
        ((GeneralPath) shape).curveTo(521.38983, 252.23999, 515.9998, 253.04999, 510.8998, 254.84999);
        ((GeneralPath) shape).curveTo(506.3998, 255.48999, 501.81982, 256.21, 497.7298, 258.28);
        ((GeneralPath) shape).lineTo(498.33978, 259.0);
        ((GeneralPath) shape).curveTo(502.85977, 259.42, 507.4098, 258.82, 511.95978, 258.92);
        ((GeneralPath) shape).curveTo(514.3598, 260.0, 516.75977, 262.65002, 515.92975, 265.5);
        ((GeneralPath) shape).curveTo(514.05975, 267.98, 511.16974, 269.23, 508.78973, 271.11);
        ((GeneralPath) shape).curveTo(510.90973, 272.06, 513.1397, 272.16998, 515.47974, 271.43997);
        ((GeneralPath) shape).curveTo(522.42975, 270.65997, 529.4497, 270.13998, 536.2697, 268.44998);
        ((GeneralPath) shape).curveTo(538.2697, 264.80997, 539.3897, 260.77, 540.8897, 256.9);
        ((GeneralPath) shape).curveTo(542.41974, 252.51, 544.66974, 248.37, 545.6797, 243.81);
        ((GeneralPath) shape).curveTo(539.2897, 246.02, 533.0397, 248.67, 526.5497, 250.61);
        ((GeneralPath) shape).moveTo(479.47968, 264.03);
        ((GeneralPath) shape).curveTo(478.13968, 265.7, 477.78967, 267.85, 478.04968, 269.93);
        ((GeneralPath) shape).curveTo(484.1897, 269.35, 490.07968, 267.21, 496.09967, 265.91998);
        ((GeneralPath) shape).lineTo(495.65967, 265.18997);
        ((GeneralPath) shape).curveTo(490.33966, 264.14996, 484.87967, 263.92996, 479.47968, 264.02997);
        ((GeneralPath) shape).moveTo(518.6197, 282.46997);
        ((GeneralPath) shape).curveTo(507.4997, 285.55997, 496.0297, 287.70996, 485.4297, 292.41998);
        ((GeneralPath) shape).curveTo(482.1497, 293.93, 478.69968, 294.97998, 475.3097, 296.16998);
        ((GeneralPath) shape).lineTo(475.0697, 296.94998);
        ((GeneralPath) shape).curveTo(473.6397, 296.93997, 472.1697, 296.93997, 470.8397, 297.47998);
        ((GeneralPath) shape).curveTo(468.2097, 301.34998, 468.10968, 306.30997, 466.6297, 310.63998);
        ((GeneralPath) shape).curveTo(463.4197, 321.43997, 459.8597, 332.13998, 457.1097, 343.06);
        ((GeneralPath) shape).curveTo(456.05972, 347.41, 453.5197, 351.48, 453.2597, 356.0);
        ((GeneralPath) shape).curveTo(454.6997, 355.84, 457.5697, 355.54, 458.9997, 355.39);
        ((GeneralPath) shape).curveTo(472.5697, 352.18002, 485.2497, 346.09003, 498.1997, 341.07);
        ((GeneralPath) shape).curveTo(502.33972, 339.39, 506.9397, 339.64, 511.2197, 338.44);
        ((GeneralPath) shape).curveTo(513.7997, 331.7, 516.0297, 324.78, 517.7697, 317.77);
        ((GeneralPath) shape).curveTo(518.5697, 316.78998, 519.2697, 315.69998, 519.6397, 314.47);
        ((GeneralPath) shape).curveTo(521.4597, 308.39, 523.2797, 302.3, 525.1997, 296.26);
        ((GeneralPath) shape).curveTo(526.6897, 293.16, 527.5497, 289.84, 527.9997, 286.45);
        ((GeneralPath) shape).curveTo(528.5997, 286.44, 529.8097, 286.44, 530.4197, 286.44);
        ((GeneralPath) shape).curveTo(530.3697, 283.9, 530.5497, 280.12, 527.2297, 281.22);
        ((GeneralPath) shape).curveTo(524.3197, 281.07, 521.3597, 281.48, 518.6197, 282.47);
        ((GeneralPath) shape).moveTo(474.6197, 282.17);
        ((GeneralPath) shape).curveTo(473.38968, 283.46002, 473.0597, 285.25, 472.82968, 286.95);
        ((GeneralPath) shape).curveTo(476.37967, 286.47, 479.3697, 284.30002, 482.37967, 282.51);
        ((GeneralPath) shape).curveTo(479.89966, 281.83002, 477.10968, 281.68002, 474.61966, 282.17);
        ((GeneralPath) shape).moveTo(646.96967, 282.42);
        ((GeneralPath) shape).curveTo(641.4297, 284.51, 635.70966, 286.05002, 630.18964, 288.15002);
        ((GeneralPath) shape).lineTo(630.08966, 288.97003);
        ((GeneralPath) shape).curveTo(625.62964, 289.90002, 621.4897, 291.93002, 617.13965, 293.21002);
        ((GeneralPath) shape).curveTo(612.2396, 295.11002, 606.9797, 295.60004, 601.90967, 296.80002);
        ((GeneralPath) shape).curveTo(596.5397, 297.68002, 590.9197, 298.45, 586.1197, 301.13);
        ((GeneralPath) shape).curveTo(583.90967, 304.58002, 583.40967, 308.80002, 582.90967, 312.77002);
        ((GeneralPath) shape).curveTo(588.75964, 312.1, 594.46967, 310.41003, 600.3497, 309.84003);
        ((GeneralPath) shape).lineTo(601.00964, 309.34003);
        ((GeneralPath) shape).curveTo(605.3596, 308.35004, 609.6096, 306.99002, 613.9296, 305.86002);
        ((GeneralPath) shape).curveTo(619.68964, 304.43002, 625.55963, 303.19, 631.1596, 301.17);
        ((GeneralPath) shape).curveTo(635.6196, 299.96002, 641.9196, 299.56003, 643.5496, 294.47);
        ((GeneralPath) shape).curveTo(644.9596, 290.55, 646.80963, 286.65, 646.9696, 282.42);
        ((GeneralPath) shape).moveTo(627.7896, 311.93002);
        ((GeneralPath) shape).curveTo(622.8996, 312.64, 618.1796, 314.10004, 613.4896, 315.60004);
        ((GeneralPath) shape).curveTo(609.31964, 316.87003, 604.9896, 317.54004, 600.9696, 319.20004);
        ((GeneralPath) shape).lineTo(601.2596, 320.03003);
        ((GeneralPath) shape).curveTo(609.66956, 320.02002, 618.0896, 319.00003, 626.3796, 317.57004);
        ((GeneralPath) shape).curveTo(629.7096, 317.02005, 633.17957, 316.67004, 636.36957, 315.46005);
        ((GeneralPath) shape).curveTo(637.47955, 313.51004, 637.86957, 311.24005, 637.8296, 309.02005);
        ((GeneralPath) shape).curveTo(634.42957, 309.38004, 630.4196, 309.73004, 627.7896, 311.93005);
        ((GeneralPath) shape).moveTo(591.5296, 326.33005);
        ((GeneralPath) shape).lineTo(590.8796, 326.95004);
        ((GeneralPath) shape).curveTo(586.4596, 327.20004, 581.98956, 326.85004, 577.5896, 326.98004);
        ((GeneralPath) shape).curveTo(576.0596, 329.63004, 575.2396, 332.61005, 574.1996, 335.46005);
        ((GeneralPath) shape).curveTo(573.3896, 338.21005, 571.92957, 340.91006, 572.11957, 343.86005);
        ((GeneralPath) shape).curveTo(575.72955, 343.81006, 579.16956, 342.53006, 582.65955, 341.68005);
        ((GeneralPath) shape).curveTo(586.35956, 340.62006, 590.1896, 340.05005, 593.83954, 338.76004);
        ((GeneralPath) shape).curveTo(593.67957, 336.95004, 593.22955, 335.18005, 593.10956, 333.38004);
        ((GeneralPath) shape).curveTo(595.5096, 329.85004, 599.59955, 328.41003, 603.26953, 326.63004);
        ((GeneralPath) shape).curveTo(605.97955, 327.07004, 608.5595, 325.84003, 610.96954, 324.73004);
        ((GeneralPath) shape).lineTo(610.6995, 323.93005);
        ((GeneralPath) shape).curveTo(604.22955, 323.90005, 597.9495, 325.81006, 591.52954, 326.33005);
        ((GeneralPath) shape).moveTo(620.48956, 330.44003);
        ((GeneralPath) shape).curveTo(614.96954, 331.61005, 609.45953, 332.96002, 604.1896, 335.01004);
        ((GeneralPath) shape).curveTo(604.90955, 337.66003, 608.5896, 338.93005, 606.78955, 342.45004);
        ((GeneralPath) shape).curveTo(605.79956, 344.29004, 604.0596, 345.62006, 602.0696, 346.19003);
        ((GeneralPath) shape).curveTo(596.3996, 347.94003, 590.48956, 348.94003, 584.9096, 350.96002);
        ((GeneralPath) shape).curveTo(579.2896, 351.41003, 573.74963, 352.68002, 568.3696, 354.29);
        ((GeneralPath) shape).curveTo(565.62964, 359.96002, 564.2196, 366.18002, 562.0996, 372.1);
        ((GeneralPath) shape).curveTo(558.6496, 383.32, 553.5796, 393.99, 550.2396, 405.24);
        ((GeneralPath) shape).curveTo(554.9596, 404.46, 559.6496, 403.47998, 564.3396, 402.53);
        ((GeneralPath) shape).curveTo(565.5896, 402.1, 567.2496, 402.21, 568.1096, 401.03);
        ((GeneralPath) shape).curveTo(576.9096, 399.92, 585.4196, 397.18, 594.2296, 396.13998);
        ((GeneralPath) shape).curveTo(598.1396, 395.56998, 602.37964, 396.69998, 606.12964, 395.43997);
        ((GeneralPath) shape).curveTo(610.40967, 382.66998, 616.8596, 370.72998, 620.8496, 357.86);
        ((GeneralPath) shape).curveTo(623.6196, 349.34, 627.0696, 341.06998, 629.7396, 332.53);
        ((GeneralPath) shape).curveTo(629.9796, 331.43, 630.01965, 330.33, 629.8596, 329.23);
        ((GeneralPath) shape).curveTo(626.69965, 329.0, 623.5396, 329.89, 620.4896, 330.44);
        ((GeneralPath) shape).moveTo(503.5096, 349.36002);
        ((GeneralPath) shape).curveTo(487.95963, 355.42, 472.76962, 362.88, 456.23962, 366.0);
        ((GeneralPath) shape).curveTo(456.2896, 367.39, 458.13962, 367.44, 459.05963, 368.08);
        ((GeneralPath) shape).curveTo(460.14963, 368.5, 461.40964, 369.06, 462.57962, 368.52);
        ((GeneralPath) shape).curveTo(471.14963, 365.28998, 480.1296, 363.09, 489.2596, 362.27);
        ((GeneralPath) shape).curveTo(493.3196, 362.16998, 497.3796, 362.94998, 501.44962, 362.87);
        ((GeneralPath) shape).curveTo(502.94962, 362.13998, 503.1896, 360.21, 503.94962, 358.88);
        ((GeneralPath) shape).curveTo(505.07962, 355.71, 506.94962, 352.59, 506.7496, 349.12);
        ((GeneralPath) shape).curveTo(505.6496, 349.03, 504.5696, 349.11, 503.5096, 349.36);
        ((GeneralPath) shape).moveTo(493.6296, 370.50998);
        ((GeneralPath) shape).curveTo(488.2396, 371.27, 482.6896, 371.38998, 477.6296, 373.61);
        ((GeneralPath) shape).curveTo(473.4796, 375.18997, 469.2096, 376.43997, 465.19962, 378.33);
        ((GeneralPath) shape).lineTo(465.0596, 379.15997);
        ((GeneralPath) shape).curveTo(473.1896, 378.08, 481.2196, 376.20996, 489.4096, 375.46997);
        ((GeneralPath) shape).curveTo(492.4096, 374.98996, 495.6296, 374.97998, 498.3796, 373.52997);
        ((GeneralPath) shape).curveTo(499.1596, 372.37997, 499.4996, 371.00998, 499.8996, 369.69998);
        ((GeneralPath) shape).curveTo(498.3296, 369.9, 495.1996, 370.3, 493.6296, 370.50998);
        ((GeneralPath) shape).moveTo(468.6196, 382.43997);
        ((GeneralPath) shape).curveTo(460.3996, 384.17996, 452.1396, 385.64996, 443.7796, 386.49997);
        ((GeneralPath) shape).curveTo(442.6296, 388.13998, 442.3296, 390.18997, 442.1896, 392.13998);
        ((GeneralPath) shape).curveTo(451.88962, 391.12, 460.4596, 385.81, 470.0396, 384.18);
        ((GeneralPath) shape).curveTo(471.0296, 383.71, 473.45963, 383.47, 472.8996, 381.9);
        ((GeneralPath) shape).lineTo(468.6196, 382.44);
        ((GeneralPath) shape).moveTo(483.8096, 385.84);
        ((GeneralPath) shape).curveTo(475.0796, 390.22, 465.4596, 392.16998, 456.2796, 395.33);
        ((GeneralPath) shape).curveTo(451.3896, 397.09998, 446.1596, 397.58, 441.2396, 399.18);
        ((GeneralPath) shape).lineTo(441.1396, 400.0);
        ((GeneralPath) shape).curveTo(440.7696, 400.17, 440.0196, 400.5, 439.6496, 400.67);
        ((GeneralPath) shape).curveTo(438.47958, 403.68002, 437.7396, 406.86002, 437.2696, 410.06003);
        ((GeneralPath) shape).curveTo(442.7996, 409.47003, 448.3596, 407.75003, 453.12958, 404.86002);
        ((GeneralPath) shape).curveTo(454.68958, 404.62003, 456.25958, 404.34003, 457.77957, 403.89);
        ((GeneralPath) shape).curveTo(458.88956, 401.55002, 455.36957, 401.63, 455.03958, 399.76);
        ((GeneralPath) shape).curveTo(454.56958, 398.44, 455.00958, 397.56, 456.37958, 397.14);
        ((GeneralPath) shape).curveTo(461.7696, 396.6, 467.22958, 397.24002, 472.64957, 396.79);
        ((GeneralPath) shape).curveTo(477.14957, 396.47, 481.65958, 395.66, 486.19955, 396.21002);
        ((GeneralPath) shape).curveTo(487.43954, 396.91003, 487.98956, 398.32, 489.12955, 399.14);
        ((GeneralPath) shape).curveTo(490.97955, 393.5, 494.51956, 388.16, 494.73953, 382.14);
        ((GeneralPath) shape).curveTo(490.72952, 381.7, 487.37955, 384.53003, 483.80954, 385.84003);
        ((GeneralPath) shape).moveTo(342.27954, 401.29004);
        ((GeneralPath) shape).curveTo(337.97955, 403.35004, 333.43954, 405.67004, 331.00955, 410.00003);
        ((GeneralPath) shape).curveTo(328.69955, 413.87003, 326.01956, 417.59003, 324.28955, 421.77002);
        ((GeneralPath) shape).curveTo(323.62955, 429.91003, 323.77954, 438.12003, 324.51956, 446.26);
        ((GeneralPath) shape).curveTo(324.74957, 449.68002, 327.34955, 452.18002, 329.37955, 454.68002);
        ((GeneralPath) shape).curveTo(332.41956, 458.40002, 336.06955, 461.87003, 340.72955, 463.40002);
        ((GeneralPath) shape).curveTo(344.23956, 464.79004, 348.07956, 463.52002, 351.59955, 462.67);
        ((GeneralPath) shape).curveTo(358.75955, 460.6, 366.09955, 459.24002, 373.34955, 457.56003);
        ((GeneralPath) shape).curveTo(375.02954, 457.04004, 377.15955, 456.66003, 377.96954, 454.89);
        ((GeneralPath) shape).curveTo(381.25955, 454.01, 383.48953, 451.19, 385.75955, 448.86002);
        ((GeneralPath) shape).curveTo(389.64957, 444.07, 393.74954, 438.37003, 393.08954, 431.83002);
        ((GeneralPath) shape).curveTo(392.55954, 428.16, 394.01953, 423.75003, 391.64954, 420.53003);
        ((GeneralPath) shape).curveTo(387.46954, 414.77002, 382.96954, 409.22003, 378.12955, 404.01004);
        ((GeneralPath) shape).curveTo(374.28955, 399.63004, 367.54956, 401.16003, 362.48953, 400.13004);
        ((GeneralPath) shape).lineTo(362.90955, 399.34003);
        ((GeneralPath) shape).curveTo(356.05954, 397.28003, 348.70953, 398.43002, 342.27954, 401.29004);
        ((GeneralPath) shape).moveTo(482.89954, 404.02005);
        ((GeneralPath) shape).curveTo(471.17953, 406.74005, 460.37955, 412.41006, 448.85953, 415.82004);
        ((GeneralPath) shape).curveTo(446.41953, 417.08005, 442.9695, 416.93002, 441.00952, 419.11005);
        ((GeneralPath) shape).curveTo(437.97952, 419.92004, 433.63953, 420.16003, 432.66953, 423.80005);
        ((GeneralPath) shape).curveTo(430.40952, 430.23004, 427.65952, 436.53006, 425.88953, 443.12006);
        ((GeneralPath) shape).lineTo(425.11954, 443.24005);
        ((GeneralPath) shape).curveTo(424.12955, 446.25006, 422.83954, 449.14005, 421.16953, 451.83005);
        ((GeneralPath) shape).curveTo(419.14954, 453.28006, 417.0295, 455.39005, 417.09952, 458.06006);
        ((GeneralPath) shape).curveTo(418.34952, 458.67004, 419.72952, 459.07007, 421.13953, 459.14005);
        ((GeneralPath) shape).lineTo(421.1895, 459.96005);
        ((GeneralPath) shape).curveTo(425.7795, 461.29004, 430.65952, 461.90005, 435.0195, 463.99005);
        ((GeneralPath) shape).curveTo(440.6895, 466.72006, 445.9895, 470.18005, 450.9895, 473.99005);
        ((GeneralPath) shape).curveTo(453.9995, 476.31006, 456.6995, 479.09006, 459.9995, 481.02005);
        ((GeneralPath) shape).curveTo(462.44952, 478.59006, 463.3095, 474.80005, 464.66953, 471.64005);
        ((GeneralPath) shape).curveTo(467.2195, 462.67004, 471.57953, 454.27005, 473.85953, 445.23004);
        ((GeneralPath) shape).curveTo(479.22952, 431.06003, 483.51953, 416.48004, 488.00952, 402.01004);
        ((GeneralPath) shape).curveTo(486.22952, 402.43005, 484.37952, 402.89005, 482.89954, 404.02005);
        ((GeneralPath) shape).moveTo(598.4995, 403.36005);
        ((GeneralPath) shape).curveTo(595.1395, 404.15005, 592.0395, 405.74005, 588.77954, 406.81006);
        ((GeneralPath) shape).curveTo(575.92957, 411.05005, 562.78955, 414.35007, 549.61957, 417.40005);
        ((GeneralPath) shape).curveTo(548.0196, 417.79007, 546.4396, 419.27005, 547.09955, 421.04007);
        ((GeneralPath) shape).curveTo(555.23956, 420.33008, 563.3096, 418.94006, 571.3096, 417.29007);
        ((GeneralPath) shape).curveTo(580.29956, 415.31006, 589.5696, 414.81006, 598.53955, 412.70007);
        ((GeneralPath) shape).curveTo(600.10956, 409.72006, 601.84955, 406.52008, 601.77954, 403.07007);
        ((GeneralPath) shape).curveTo(600.66956, 403.04007, 599.5695, 403.14008, 598.4995, 403.36008);
        ((GeneralPath) shape).moveTo(593.4995, 419.38007);
        ((GeneralPath) shape).curveTo(582.5595, 422.91006, 571.58954, 426.50006, 560.20953, 428.28006);
        ((GeneralPath) shape).curveTo(560.1995, 428.71005, 560.1795, 429.59006, 560.1795, 430.02005);
        ((GeneralPath) shape).curveTo(570.9295, 429.65005, 581.4195, 426.66006, 592.2295, 426.81006);
        ((GeneralPath) shape).curveTo(594.1895, 424.61005, 595.4695, 421.80005, 595.8395, 418.88007);
        ((GeneralPath) shape).curveTo(595.24945, 419.01007, 594.07947, 419.26007, 593.49945, 419.38007);
        ((GeneralPath) shape).moveTo(557.16943, 442.99005);
        ((GeneralPath) shape).curveTo(558.12946, 444.40005, 560.0294, 447.21005, 560.98944, 448.61005);
        ((GeneralPath) shape).lineTo(560.86945, 452.38004);
        ((GeneralPath) shape).curveTo(557.87946, 457.10004, 552.2894, 458.57004, 547.35944, 460.36005);
        ((GeneralPath) shape).curveTo(540.3994, 462.88004, 533.18945, 464.71005, 526.18945, 467.09006);
        ((GeneralPath) shape).curveTo(523.17944, 472.41006, 522.32947, 478.72006, 518.93945, 483.89005);
        ((GeneralPath) shape).curveTo(517.86945, 486.25003, 515.7095, 488.32004, 515.5195, 490.99005);
        ((GeneralPath) shape).curveTo(513.1095, 493.99005, 511.60947, 497.57004, 509.94946, 501.02005);
        ((GeneralPath) shape).curveTo(506.88947, 507.70004, 503.68945, 514.35004, 501.46945, 521.38007);
        ((GeneralPath) shape).curveTo(502.64944, 521.13007, 504.98944, 520.62006, 506.15945, 520.36005);
        ((GeneralPath) shape).lineTo(506.73944, 519.80005);
        ((GeneralPath) shape).curveTo(511.76944, 519.00006, 516.80945, 518.11005, 521.68945, 516.61005);
        ((GeneralPath) shape).curveTo(525.85944, 515.4501, 530.24945, 515.62006, 534.43945, 514.48004);
        ((GeneralPath) shape).curveTo(540.87946, 512.92004, 547.5895, 513.43005, 554.10944, 512.52);
        ((GeneralPath) shape).curveTo(556.94946, 508.11002, 557.8394, 502.80002, 560.0994, 498.12003);
        ((GeneralPath) shape).curveTo(568.3394, 480.87003, 576.0194, 463.36002, 583.92944, 445.97003);
        ((GeneralPath) shape).curveTo(585.47943, 442.25003, 588.10944, 438.96002, 588.80945, 434.91003);
        ((GeneralPath) shape).curveTo(578.05945, 436.66003, 567.50946, 439.64005, 557.16943, 442.99002);
        ((GeneralPath) shape).moveTo(538.72943, 437.1);
        ((GeneralPath) shape).curveTo(536.05945, 441.98, 533.81946, 447.34, 533.0894, 452.9);
        ((GeneralPath) shape).curveTo(538.6294, 452.21, 543.8394, 450.0, 549.04944, 448.11);
        ((GeneralPath) shape).curveTo(548.0894, 446.61, 546.93945, 445.27, 545.9594, 443.81);
        ((GeneralPath) shape).curveTo(545.9294, 441.37, 547.91943, 439.27, 547.5794, 436.82);
        ((GeneralPath) shape).curveTo(545.3694, 436.89, 540.9394, 437.03, 538.72943, 437.1);
        ((GeneralPath) shape).moveTo(709.42944, 473.44);
        ((GeneralPath) shape).curveTo(706.0894, 476.42, 702.48944, 479.3, 700.04944, 483.09);
        ((GeneralPath) shape).curveTo(697.4694, 484.84, 695.8494, 487.59, 693.97943, 490.01);
        ((GeneralPath) shape).curveTo(683.0194, 505.13, 672.0994, 520.29004, 662.0394, 536.04004);
        ((GeneralPath) shape).curveTo(647.7794, 558.12006, 631.7694, 578.99005, 616.0094, 600.02);
        ((GeneralPath) shape).curveTo(606.2594, 614.12, 594.3894, 626.64, 585.0294, 641.03);
        ((GeneralPath) shape).curveTo(575.48944, 655.33, 566.7494, 670.14, 557.6594, 684.72003);
        ((GeneralPath) shape).curveTo(555.16943, 688.30005, 556.49945, 693.08, 558.0894, 696.78);
        ((GeneralPath) shape).curveTo(559.41943, 697.27, 559.9094, 695.31006, 560.72943, 694.63);
        ((GeneralPath) shape).curveTo(566.99945, 685.31, 572.5994, 675.49, 579.9094, 666.91003);
        ((GeneralPath) shape).curveTo(582.8494, 663.48004, 585.67944, 659.95, 588.2594, 656.23004);
        ((GeneralPath) shape).curveTo(590.2394, 654.47003, 591.0794, 651.81006, 592.8494, 649.86005);
        ((GeneralPath) shape).curveTo(600.7594, 642.04004, 607.37946, 633.05005, 614.60944, 624.61005);
        ((GeneralPath) shape).curveTo(617.19946, 620.9, 621.12946, 618.37006, 623.4594, 614.44006);
        ((GeneralPath) shape).curveTo(625.16943, 611.57007, 627.48944, 609.17004, 629.8494, 606.8301);
        ((GeneralPath) shape).curveTo(640.5794, 594.3601, 650.98944, 581.49005, 659.11945, 567.12006);
        ((GeneralPath) shape).curveTo(665.5195, 555.8301, 672.7095, 544.97003, 680.8494, 534.85004);
        ((GeneralPath) shape).curveTo(693.04944, 520.08, 705.22943, 505.29004, 717.93945, 490.95004);
        ((GeneralPath) shape).curveTo(721.73944, 486.40005, 725.12946, 481.53003, 728.8494, 476.93005);
        ((GeneralPath) shape).curveTo(731.48944, 473.74005, 732.79944, 469.44006, 731.5994, 465.33005);
        ((GeneralPath) shape).lineTo(727.10944, 465.09006);
        ((GeneralPath) shape).curveTo(719.94946, 464.19006, 714.47943, 469.27005, 709.42944, 473.44006);
        ((GeneralPath) shape).moveTo(376.37946, 471.55005);
        ((GeneralPath) shape).curveTo(371.08945, 473.83005, 365.39944, 474.99005, 359.97946, 476.91003);
        ((GeneralPath) shape).curveTo(354.94946, 476.77002, 349.92947, 476.94003, 344.93945, 477.41003);
        ((GeneralPath) shape).curveTo(340.87946, 478.68002, 337.07947, 480.63004, 333.11945, 482.14005);
        ((GeneralPath) shape).curveTo(323.42944, 485.96005, 314.93945, 492.15005, 305.49945, 496.49005);
        ((GeneralPath) shape).curveTo(297.47946, 500.40005, 291.00946, 506.65005, 283.84946, 511.85004);
        ((GeneralPath) shape).curveTo(277.57947, 516.13007, 272.11945, 521.63007, 267.93945, 527.98004);
        ((GeneralPath) shape).curveTo(264.81946, 532.46, 263.06946, 537.67004, 260.38947, 542.4);
        ((GeneralPath) shape).curveTo(259.76947, 543.72003, 258.45947, 545.10004, 259.40945, 546.61005);
        ((GeneralPath) shape).curveTo(271.00946, 550.22003, 283.21945, 552.23004, 294.05945, 557.9501);
        ((GeneralPath) shape).curveTo(308.45944, 565.1501, 322.56946, 573.50006, 333.90945, 585.0901);
        ((GeneralPath) shape).curveTo(343.81946, 595.2301, 353.48944, 605.6701, 361.92944, 617.0801);
        ((GeneralPath) shape).curveTo(367.34946, 625.63007, 372.22943, 634.57007, 376.02945, 643.9701);
        ((GeneralPath) shape).curveTo(376.68945, 645.1801, 376.91946, 647.2701, 378.79944, 646.88007);
        ((GeneralPath) shape).curveTo(381.87943, 641.43005, 385.34943, 636.24005, 389.99945, 631.98004);
        ((GeneralPath) shape).curveTo(394.67944, 629.44006, 399.63947, 627.39, 404.65945, 625.62006);
        ((GeneralPath) shape).curveTo(409.96945, 623.17004, 415.82947, 624.5101, 421.40945, 623.81006);
        ((GeneralPath) shape).curveTo(428.63947, 624.32007, 435.88947, 625.0201, 443.14944, 624.93005);
        ((GeneralPath) shape).curveTo(447.32944, 627.29004, 452.39944, 627.05005, 457.01944, 627.97003);
        ((GeneralPath) shape).lineTo(457.33945, 628.78);
        ((GeneralPath) shape).curveTo(466.90945, 630.72003, 476.74945, 631.75, 486.00946, 635.03);
        ((GeneralPath) shape).curveTo(489.76947, 636.2, 493.48947, 637.81006, 497.51947, 637.81006);
        ((GeneralPath) shape).curveTo(503.14948, 628.41003, 503.27948, 616.86005, 503.09946, 606.23004);
        ((GeneralPath) shape).curveTo(503.25946, 597.18005, 500.07947, 588.65, 498.50946, 579.86005);
        ((GeneralPath) shape).curveTo(497.43945, 577.4501, 494.36945, 576.72003, 493.04947, 574.4501);
        ((GeneralPath) shape).curveTo(492.88947, 570.49005, 493.75946, 566.57007, 493.84946, 562.6401);
        ((GeneralPath) shape).curveTo(492.63947, 561.8501, 491.36945, 561.18005, 490.16946, 560.4101);
        ((GeneralPath) shape).curveTo(489.34946, 555.7801, 490.38947, 550.8601, 488.63947, 546.4201);
        ((GeneralPath) shape).curveTo(487.02948, 542.1701, 485.04947, 538.0601, 483.05948, 533.9801);
        ((GeneralPath) shape).curveTo(481.4795, 531.2901, 480.52948, 527.9001, 477.91946, 526.0401);
        ((GeneralPath) shape).curveTo(475.37946, 519.1901, 470.27945, 513.7201, 466.25946, 507.7501);
        ((GeneralPath) shape).curveTo(463.61945, 503.9801, 461.59946, 499.74008, 458.24945, 496.5301);
        ((GeneralPath) shape).curveTo(452.76944, 488.7501, 444.62946, 483.4101, 436.88947, 478.1301);
        ((GeneralPath) shape).curveTo(429.47946, 473.0101, 420.81946, 470.21008, 412.11948, 468.2701);
        ((GeneralPath) shape).curveTo(403.92947, 467.4901, 395.6595, 467.9901, 387.43948, 468.06012);
        ((GeneralPath) shape).curveTo(383.1595, 467.0801, 379.96948, 470.04013, 376.3795, 471.5501);
        ((GeneralPath) shape).moveTo(147.41948, 495.50012);
        ((GeneralPath) shape).curveTo(137.59949, 500.0801, 130.06947, 508.39014, 124.66948, 517.6101);
        ((GeneralPath) shape).curveTo(121.95948, 522.6801, 119.49948, 528.1801, 119.939476, 534.1001);
        ((GeneralPath) shape).curveTo(120.079475, 537.9401, 119.609474, 542.0801, 121.06947, 545.7701);
        ((GeneralPath) shape).lineTo(121.829475, 545.9001);
        ((GeneralPath) shape).curveTo(123.509476, 549.2701, 127.329475, 551.0501, 130.52948, 552.7201);
        ((GeneralPath) shape).curveTo(136.45947, 553.6501, 142.52948, 552.9501, 148.50948, 552.9601);
        ((GeneralPath) shape).curveTo(152.67947, 553.4001, 156.19948, 551.1701, 159.90947, 549.7901);
        ((GeneralPath) shape).curveTo(164.79947, 547.9801, 169.04947, 544.8601, 173.82947, 542.7901);
        ((GeneralPath) shape).curveTo(180.32947, 539.8501, 187.25946, 537.0601, 192.04947, 531.5201);
        ((GeneralPath) shape).curveTo(192.49947, 529.5901, 193.37947, 525.7301, 193.82947, 523.7901);
        ((GeneralPath) shape).lineTo(193.80946, 519.7701);
        ((GeneralPath) shape).curveTo(187.06946, 516.2101, 178.29947, 514.6601, 173.86946, 507.85007);
        ((GeneralPath) shape).curveTo(170.99947, 504.86008, 172.66946, 500.54007, 171.16946, 497.21005);
        ((GeneralPath) shape).curveTo(163.96947, 493.28006, 155.16946, 493.37006, 147.41946, 495.50006);
        ((GeneralPath) shape).moveTo(547.7395, 522.2001);
        ((GeneralPath) shape).curveTo(530.3495, 526.06006, 512.9995, 530.24005, 496.1895, 536.19006);
        ((GeneralPath) shape).curveTo(496.0195, 538.43005, 497.57953, 540.35004, 499.10953, 541.82007);
        ((GeneralPath) shape).curveTo(513.70953, 537.32007, 529.16956, 537.9501, 544.1895, 536.5301);
        ((GeneralPath) shape).curveTo(545.9995, 533.3701, 546.95953, 529.8101, 548.4795, 526.5101);
        ((GeneralPath) shape).curveTo(548.9295, 525.0301, 550.0895, 523.49005, 549.4895, 521.8901);
        ((GeneralPath) shape).curveTo(549.0495, 521.9701, 548.1795, 522.13007, 547.7395, 522.2001);
        ((GeneralPath) shape).moveTo(529.6195, 557.5301);
        ((GeneralPath) shape).curveTo(525.4895, 558.0901, 521.3195, 558.3601, 517.2295, 559.1501);
        ((GeneralPath) shape).curveTo(517.2095, 559.56006, 517.1695, 560.37006, 517.1495, 560.7801);
        ((GeneralPath) shape).curveTo(519.9295, 562.00006, 523.18945, 562.4901, 525.4195, 564.7201);
        ((GeneralPath) shape).curveTo(528.07947, 566.9501, 527.6095, 571.7101, 524.88947, 573.7501);
        ((GeneralPath) shape).curveTo(521.1595, 577.1201, 515.85944, 576.9701, 511.27948, 578.3701);
        ((GeneralPath) shape).curveTo(510.5095, 584.8101, 513.5995, 590.9401, 513.9095, 597.3201);
        ((GeneralPath) shape).curveTo(513.8995, 600.91016, 513.87946, 608.10016, 513.8695, 611.70013);
        ((GeneralPath) shape).curveTo(514.3295, 611.7401, 515.2395, 611.8101, 515.6995, 611.85016);
        ((GeneralPath) shape).curveTo(516.9195, 605.89014, 519.8195, 600.52014, 521.8195, 594.8201);
        ((GeneralPath) shape).curveTo(523.9995, 588.7401, 526.59955, 582.8101, 528.6895, 576.6901);
        ((GeneralPath) shape).curveTo(530.95953, 570.01013, 534.0095, 563.6101, 535.7995, 556.78015);
        ((GeneralPath) shape).curveTo(534.2595, 556.97015, 531.1695, 557.35016, 529.6195, 557.53015);
        ((GeneralPath) shape).moveTo(400.0295, 639.0502);
        ((GeneralPath) shape).curveTo(393.6795, 641.8102, 389.90952, 648.0502, 387.0895, 654.0702);
        ((GeneralPath) shape).curveTo(383.31952, 661.4002, 383.9695, 670.0102, 383.9495, 677.9702);
        ((GeneralPath) shape).curveTo(383.7895, 692.68024, 385.49948, 708.0902, 380.0795, 722.1302);
        ((GeneralPath) shape).curveTo(378.8695, 723.9102, 378.2595, 726.0002, 377.6395, 728.04016);
        ((GeneralPath) shape).curveTo(376.2095, 728.53015, 377.2295, 730.47015, 377.2695, 731.5502);
        ((GeneralPath) shape).curveTo(379.8995, 732.9502, 382.9895, 733.5802, 385.1895, 735.72015);
        ((GeneralPath) shape).curveTo(387.7695, 737.51013, 389.69952, 741.1901, 393.2495, 741.0002);
        ((GeneralPath) shape).curveTo(421.87952, 741.35016, 450.53952, 740.2702, 479.1495, 741.6802);
        ((GeneralPath) shape).curveTo(480.9995, 742.6902, 482.9395, 743.8902, 483.9895, 745.8102);
        ((GeneralPath) shape).curveTo(483.8495, 749.7402, 483.3195, 753.72015, 483.3095, 757.6902);
        ((GeneralPath) shape).curveTo(482.9395, 757.85016, 482.19952, 758.1802, 481.8295, 758.35016);
        ((GeneralPath) shape).curveTo(478.4295, 762.86017, 476.4995, 768.45013, 476.2095, 774.09015);
        ((GeneralPath) shape).curveTo(476.34952, 777.7501, 477.0395, 781.35016, 477.84952, 784.9401);
        ((GeneralPath) shape).curveTo(478.73953, 788.1101, 480.85953, 791.6901, 484.53952, 791.9101);
        ((GeneralPath) shape).curveTo(486.6895, 791.9201, 490.9995, 791.9301, 493.1495, 791.9301);
        ((GeneralPath) shape).curveTo(501.7595, 788.0701, 510.8295, 784.3801, 517.7595, 777.7501);
        ((GeneralPath) shape).curveTo(521.3895, 774.39014, 524.9995, 770.9201, 527.6395, 766.70013);
        ((GeneralPath) shape).curveTo(529.0095, 764.71014, 530.3195, 762.4301, 532.70953, 761.5501);
        ((GeneralPath) shape).curveTo(535.08954, 760.2901, 538.3295, 761.3101, 539.8695, 763.4301);
        ((GeneralPath) shape).curveTo(541.3795, 769.7201, 536.2995, 775.3701, 537.95953, 781.71014);
        ((GeneralPath) shape).curveTo(536.4995, 787.1901, 541.1795, 790.6901, 545.1895, 793.02014);
        ((GeneralPath) shape).curveTo(548.8595, 795.1801, 553.3795, 793.59015, 557.3495, 793.5701);
        ((GeneralPath) shape).curveTo(563.4195, 792.7901, 568.4995, 788.8601, 573.0495, 785.0501);
        ((GeneralPath) shape).curveTo(577.4695, 781.1701, 579.8795, 775.6601, 582.6395, 770.5901);
        ((GeneralPath) shape).curveTo(585.1295, 766.2101, 583.90955, 760.8901, 584.0495, 756.1501);
        ((GeneralPath) shape).curveTo(582.0295, 749.19006, 574.9095, 744.4201, 567.9095, 744.00006);
        ((GeneralPath) shape).lineTo(568.2095, 743.0901);
        ((GeneralPath) shape).curveTo(564.2795, 741.5901, 559.9195, 742.2101, 555.8595, 741.9501);
        ((GeneralPath) shape).curveTo(542.4995, 741.7001, 529.0995, 742.6601, 515.7895, 741.50006);
        ((GeneralPath) shape).curveTo(513.2095, 741.24005, 510.0495, 739.1401, 511.0495, 736.2001);
        ((GeneralPath) shape).curveTo(510.9795, 734.1501, 515.4195, 734.93005, 514.6295, 732.92004);
        ((GeneralPath) shape).curveTo(524.90955, 731.19006, 535.3195, 730.89, 545.7395, 730.85004);
        ((GeneralPath) shape).curveTo(545.8095, 728.30005, 545.9595, 723.21, 546.0295, 720.67004);
        ((GeneralPath) shape).curveTo(546.8995, 719.48004, 548.9095, 719.07007, 549.0395, 717.44006);
        ((GeneralPath) shape).curveTo(549.38947, 709.1501, 549.3195, 700.69006, 546.6695, 692.75006);
        ((GeneralPath) shape).lineTo(546.1595, 693.42004);
        ((GeneralPath) shape).curveTo(541.9395, 683.98004, 537.4595, 673.53, 528.19946, 667.96);
        ((GeneralPath) shape).curveTo(526.54944, 665.23004, 523.4595, 663.80005, 521.16943, 661.78);
        ((GeneralPath) shape).curveTo(515.43945, 657.63, 509.42944, 653.85004, 503.08945, 650.72003);
        ((GeneralPath) shape).curveTo(501.80945, 650.07, 500.33945, 650.18005, 498.96945, 650.08);
        ((GeneralPath) shape).lineTo(498.90945, 649.2);
        ((GeneralPath) shape).curveTo(488.22946, 645.17, 477.24945, 641.82, 465.96945, 639.93);
        ((GeneralPath) shape).curveTo(462.69946, 638.58, 458.72946, 637.81, 455.20944, 637.64996);
        ((GeneralPath) shape).curveTo(452.82944, 636.14996, 449.65945, 636.86, 446.98944, 636.85);
        ((GeneralPath) shape).lineTo(447.42944, 636.02997);
        ((GeneralPath) shape).curveTo(444.62946, 634.22, 440.92944, 635.16, 437.89944, 634.91);
        ((GeneralPath) shape).curveTo(429.71945, 635.04, 421.54944, 634.81, 413.37946, 635.06);
        ((GeneralPath) shape).curveTo(408.56946, 634.93, 404.24945, 637.1, 400.02945, 639.05);
        ((GeneralPath) shape).moveTo(438.91943, 1046.5);
        ((GeneralPath) shape).curveTo(434.93942, 1047.6, 431.14944, 1049.7, 426.81943, 1049.0);
        ((GeneralPath) shape).curveTo(421.84943, 1049.3, 416.6494, 1048.7, 412.03943, 1051.0);
        ((GeneralPath) shape).curveTo(407.75943, 1052.9, 402.82944, 1052.5, 398.57944, 1054.6);
        ((GeneralPath) shape).curveTo(394.33945, 1056.0, 389.86945, 1056.5, 385.50943, 1057.5);
        ((GeneralPath) shape).curveTo(377.06943, 1059.1, 368.93942, 1062.1, 360.46942, 1063.6);
        ((GeneralPath) shape).curveTo(348.3294, 1064.6, 336.1494, 1065.2, 323.9594, 1065.0);
        ((GeneralPath) shape).curveTo(309.9894, 1065.3, 295.90942, 1064.8, 282.1994, 1062.0);
        ((GeneralPath) shape).curveTo(279.4794, 1060.9, 276.4894, 1060.3, 273.5694, 1060.4);
        ((GeneralPath) shape).curveTo(265.3194, 1059.6, 256.7994, 1059.9, 248.8994, 1057.0);
        ((GeneralPath) shape).curveTo(241.8694, 1055.0, 235.0694, 1052.2, 228.0894, 1050.0);
        ((GeneralPath) shape).curveTo(226.1994, 1051.4, 225.2194, 1053.9, 224.5994, 1056.1);
        ((GeneralPath) shape).curveTo(225.0994, 1058.6, 225.5394, 1061.0, 225.5194, 1063.6);
        ((GeneralPath) shape).curveTo(229.38939, 1064.7, 233.21939, 1066.0, 237.07939, 1067.1);
        ((GeneralPath) shape).curveTo(245.11938, 1068.2, 253.1794, 1069.0, 261.26938, 1069.6);
        ((GeneralPath) shape).curveTo(273.35938, 1071.7999, 285.6894, 1072.1, 297.94937, 1072.0);
        ((GeneralPath) shape).lineTo(353.03937, 1072.0);
        ((GeneralPath) shape).curveTo(365.17938, 1071.9, 377.47937, 1072.7, 389.47937, 1070.4);
        ((GeneralPath) shape).curveTo(401.81937, 1068.4, 414.30936, 1067.7001, 426.76938, 1066.8);
        ((GeneralPath) shape).curveTo(434.12936, 1066.3, 441.41937, 1065.0, 448.8094, 1064.8);
        ((GeneralPath) shape).curveTo(454.5894, 1064.3, 460.4794, 1064.4, 466.17938, 1063.2001);
        ((GeneralPath) shape).curveTo(465.2794, 1061.0001, 462.9694, 1060.0001, 461.3394, 1058.5001);
        ((GeneralPath) shape).curveTo(456.32938, 1054.9001, 452.1194, 1050.2001, 446.8394, 1046.9001);
        ((GeneralPath) shape).curveTo(444.5594, 1045.4001, 441.3694, 1046.0001, 438.91937, 1046.5001);
        ((GeneralPath) shape).moveTo(208.92937, 1065.3002);
        ((GeneralPath) shape).curveTo(200.20937, 1068.7002, 194.96936, 1077.0001, 190.92937, 1085.0001);
        ((GeneralPath) shape).curveTo(187.29936, 1091.4001, 189.23936, 1099.0001, 189.34937, 1106.0001);
        ((GeneralPath) shape).curveTo(190.97937, 1111.0001, 194.40936, 1115.7001, 199.44937, 1117.6001);
        ((GeneralPath) shape).curveTo(207.70937, 1120.7001, 216.51938, 1121.9001, 225.05937, 1124.0001);
        ((GeneralPath) shape).curveTo(232.23936, 1125.2001, 239.54938, 1124.7001, 246.79938, 1125.0001);
        ((GeneralPath) shape).curveTo(272.16937, 1126.8002, 297.6194, 1125.6001, 323.03937, 1126.0001);
        ((GeneralPath) shape).curveTo(332.66937, 1126.4001, 342.23938, 1125.2001, 351.84937, 1124.9001);
        ((GeneralPath) shape).lineTo(351.87936, 1123.9001);
        ((GeneralPath) shape).curveTo(370.28937, 1121.9001, 388.84937, 1124.0001, 407.27936, 1122.3002);
        ((GeneralPath) shape).curveTo(416.96936, 1121.3002, 426.70935, 1121.1002, 436.41937, 1120.5001);
        ((GeneralPath) shape).curveTo(443.78937, 1119.9001, 451.01938, 1118.2001, 458.35938, 1117.3002);
        ((GeneralPath) shape).curveTo(462.56937, 1117.1002, 466.7794, 1118.2002, 470.9994, 1117.5001);
        ((GeneralPath) shape).curveTo(473.9094, 1115.4001, 477.1894, 1112.7001, 477.1894, 1108.7001);
        ((GeneralPath) shape).curveTo(479.1694, 1101.9, 477.3394, 1094.8, 474.01938, 1088.8);
        ((GeneralPath) shape).curveTo(472.26938, 1082.5, 472.37936, 1075.8, 471.62936, 1069.3);
        ((GeneralPath) shape).curveTo(466.86935, 1069.1001, 461.21936, 1068.2001, 457.05936, 1071.1001);
        ((GeneralPath) shape).curveTo(447.40936, 1070.4001, 437.79935, 1071.7001, 428.19934, 1072.3);
        ((GeneralPath) shape).curveTo(421.17935, 1072.8, 414.08936, 1072.8, 407.14935, 1074.0);
        ((GeneralPath) shape).curveTo(400.61935, 1075.1, 394.04935, 1076.1, 387.42935, 1076.2);
        ((GeneralPath) shape).lineTo(387.13934, 1077.1);
        ((GeneralPath) shape).curveTo(374.47934, 1078.6, 361.71933, 1077.9, 349.01935, 1078.0);
        ((GeneralPath) shape).curveTo(330.39935, 1077.9, 311.78934, 1078.2, 293.17935, 1077.8);
        ((GeneralPath) shape).curveTo(290.75934, 1076.6001, 287.70935, 1076.8, 285.17935, 1076.6001);
        ((GeneralPath) shape).curveTo(277.17935, 1076.3, 269.22934, 1075.4001, 261.25934, 1074.8);
        ((GeneralPath) shape).curveTo(251.06934, 1073.9, 241.04935, 1070.9, 230.74934, 1071.4);
        ((GeneralPath) shape).curveTo(230.70935, 1070.8, 230.62935, 1069.5, 230.58934, 1068.9);
        ((GeneralPath) shape).curveTo(229.24934, 1068.6, 226.54935, 1068.1, 225.20934, 1067.8);
        ((GeneralPath) shape).curveTo(220.78934, 1067.9, 217.90933, 1063.1001, 213.19934, 1065.0);
        ((GeneralPath) shape).lineTo(208.92934, 1065.3);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);

        // _0_0_138
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(561.7, 25.35);
        ((GeneralPath) shape).curveTo(567.06, 24.82, 572.51, 25.11, 577.84, 25.960001);
        ((GeneralPath) shape).lineTo(577.75, 26.810001);
        ((GeneralPath) shape).curveTo(577.15, 26.890001, 575.94, 27.050001, 575.34, 27.130001);
        ((GeneralPath) shape).curveTo(574.4, 31.010002, 579.92004, 31.130001, 581.2, 34.100002);
        ((GeneralPath) shape).curveTo(584.06, 40.620003, 582.26, 47.75, 580.67, 54.32);
        ((GeneralPath) shape).curveTo(580.02997, 57.13, 577.01996, 58.26, 575.1, 60.07);
        ((GeneralPath) shape).curveTo(570.82996, 64.95, 568.45996, 71.17, 566.1, 77.13);
        ((GeneralPath) shape).curveTo(565.19995, 79.56, 564.16, 82.09, 564.38995, 84.74);
        ((GeneralPath) shape).curveTo(564.99994, 84.81, 566.22, 84.95, 566.81995, 85.02);
        ((GeneralPath) shape).lineTo(566.6, 85.799995);
        ((GeneralPath) shape).curveTo(562.32996, 86.799995, 557.98, 87.479996, 553.79, 88.78999);
        ((GeneralPath) shape).curveTo(547.42, 90.869995, 540.5, 92.24999, 534.98, 96.23999);
        ((GeneralPath) shape).curveTo(534.45996, 99.12999, 538.73, 99.77999, 540.66, 98.67999);
        ((GeneralPath) shape).curveTo(546.91, 97.829994, 552.76996, 95.19999, 558.93, 93.85999);
        ((GeneralPath) shape).curveTo(557.92, 96.42999, 554.0, 100.73999, 558.02997, 102.45999);
        ((GeneralPath) shape).curveTo(548.27997, 103.34999, 538.72, 105.67999, 529.00995, 106.81999);
        ((GeneralPath) shape).curveTo(529.01996, 103.78999, 530.07996, 100.899994, 531.02997, 98.079994);
        ((GeneralPath) shape).curveTo(533.20996, 91.74999, 534.92, 85.27, 536.82996, 78.84);
        ((GeneralPath) shape).curveTo(541.75995, 63.379997, 545.08997, 47.229996, 552.6, 32.709995);
        ((GeneralPath) shape).curveTo(554.51996, 29.259995, 557.76996, 26.259995, 561.69995, 25.349995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_139
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(575.34, 27.13);
        ((GeneralPath) shape).curveTo(575.94, 27.05, 577.15, 26.89, 577.75, 26.81);
        ((GeneralPath) shape).curveTo(587.1, 30.05, 596.02, 34.54, 605.59, 37.16);
        ((GeneralPath) shape).lineTo(605.92004, 37.89);
        ((GeneralPath) shape).curveTo(605.31006, 37.989998, 604.07007, 38.18, 603.4501, 38.28);
        ((GeneralPath) shape).curveTo(603.0401, 42.37, 603.63007, 46.489998, 604.00006, 50.57);
        ((GeneralPath) shape).curveTo(606.11005, 52.44, 606.87006, 49.02, 608.0101, 47.76);
        ((GeneralPath) shape).curveTo(606.87006, 55.28, 604.55005, 62.53, 603.0301, 69.979996);
        ((GeneralPath) shape).curveTo(602.5901, 71.95, 602.1701, 73.95, 601.38007, 75.81);
        ((GeneralPath) shape).curveTo(599.00006, 76.14, 596.6601, 76.1, 594.35004, 75.689995);
        ((GeneralPath) shape).curveTo(594.52, 68.95, 591.88007, 60.969994, 584.73004, 58.899994);
        ((GeneralPath) shape).curveTo(581.58, 57.209995, 578.12006, 59.019993, 575.10004, 60.069992);
        ((GeneralPath) shape).curveTo(577.02, 58.25999, 580.03, 57.129993, 580.67004, 54.319992);
        ((GeneralPath) shape).curveTo(582.2601, 47.749992, 584.06006, 40.61999, 581.2001, 34.09999);
        ((GeneralPath) shape).curveTo(579.92004, 31.129992, 574.4001, 31.00999, 575.3401, 27.129992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDF8E62));
        g.fill(shape);

        // _0_0_140
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(529.35, 32.24);
        ((GeneralPath) shape).lineTo(530.14996, 32.190002);
        ((GeneralPath) shape).curveTo(528.92, 38.61, 526.54, 44.72, 524.97, 51.04);
        ((GeneralPath) shape).curveTo(520.68, 67.85, 516.56995, 84.729996, 511.33997, 101.28);
        ((GeneralPath) shape).curveTo(511.56998, 97.28, 512.16, 93.299995, 513.37, 89.479996);
        ((GeneralPath) shape).curveTo(518.04, 75.21999, 520.83997, 60.439995, 525.05, 46.049995);
        ((GeneralPath) shape).curveTo(526.49, 41.459995, 527.13, 36.549995, 529.35, 32.239994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8B8B8B));
        g.fill(shape);

        // _0_0_141
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(603.45, 38.28);
        ((GeneralPath) shape).curveTo(604.07, 38.18, 605.31, 37.989998, 605.92, 37.89);
        ((GeneralPath) shape).curveTo(607.61, 37.739998, 608.82996, 39.059998, 609.92, 40.149998);
        ((GeneralPath) shape).curveTo(609.47, 42.729996, 608.94, 45.309998, 608.01, 47.76);
        ((GeneralPath) shape).curveTo(606.87, 49.019997, 606.11, 52.44, 604.0, 50.57);
        ((GeneralPath) shape).curveTo(603.63, 46.489998, 603.04, 42.37, 603.45, 38.28);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF8F4F0));
        g.fill(shape);

        // _0_0_142
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(575.1, 60.07);
        ((GeneralPath) shape).curveTo(578.12, 59.02, 581.57996, 57.21, 584.73, 58.9);
        ((GeneralPath) shape).curveTo(591.88, 60.97, 594.51996, 68.950005, 594.35, 75.69);
        ((GeneralPath) shape).curveTo(592.69995, 79.32, 587.32996, 78.0, 584.41, 79.450005);
        ((GeneralPath) shape).curveTo(578.26996, 80.380005, 572.89996, 83.89001, 566.81995, 85.020004);
        ((GeneralPath) shape).curveTo(566.22, 84.950005, 564.99994, 84.810005, 564.38995, 84.740005);
        ((GeneralPath) shape).curveTo(564.16, 82.090004, 565.19995, 79.560005, 566.1, 77.130005);
        ((GeneralPath) shape).curveTo(568.45996, 71.170006, 570.82996, 64.950005, 575.1, 60.070007);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6E2D7));
        g.fill(shape);

        // _0_0_143
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(585.04, 85.18);
        ((GeneralPath) shape).curveTo(589.39996, 83.51, 594.19995, 82.85, 598.86, 83.22);
        ((GeneralPath) shape).curveTo(599.6, 85.35, 599.67, 90.58, 596.05, 90.01);
        ((GeneralPath) shape).curveTo(596.26996, 88.670006, 596.58, 87.35, 596.79, 86.0);
        ((GeneralPath) shape).curveTo(596.12, 85.0, 595.23, 84.69, 594.1, 85.09);
        ((GeneralPath) shape).curveTo(592.69995, 87.5, 593.66, 90.28, 593.62, 92.88);
        ((GeneralPath) shape).curveTo(593.0, 92.92, 591.77, 93.02, 591.15, 93.06);
        ((GeneralPath) shape).curveTo(591.69, 90.299995, 592.32, 87.549995, 592.67004, 84.75);
        ((GeneralPath) shape).curveTo(590.04004, 85.13, 587.64, 85.59, 585.07007, 86.03);
        ((GeneralPath) shape).lineTo(585.04004, 85.18);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x705140));
        g.fill(shape);

        // _0_0_144
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(585.07, 86.03);
        ((GeneralPath) shape).curveTo(587.64, 85.59, 590.04, 85.13, 592.67, 84.75);
        ((GeneralPath) shape).curveTo(592.32, 87.55, 591.69, 90.3, 591.14996, 93.06);
        ((GeneralPath) shape).curveTo(583.74, 93.95, 576.98, 97.17, 569.69995, 98.59);
        ((GeneralPath) shape).curveTo(565.7399, 99.64, 562.06995, 101.659996, 558.02997, 102.46);
        ((GeneralPath) shape).curveTo(553.99994, 100.74, 557.92, 96.43, 558.93, 93.86);
        ((GeneralPath) shape).curveTo(567.7, 91.45, 576.18, 87.99, 585.07, 86.03);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF4E0D5));
        g.fill(shape);

        // _0_0_145
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(584.44, 99.17);
        ((GeneralPath) shape).curveTo(587.01, 99.119995, 592.15, 99.02, 594.72003, 98.97);
        ((GeneralPath) shape).curveTo(595.14, 101.87, 594.63, 105.01, 593.06006, 107.51);
        ((GeneralPath) shape).curveTo(590.80005, 107.950005, 588.54004, 108.18, 586.2601, 108.21);
        ((GeneralPath) shape).curveTo(587.13007, 105.62, 587.9501, 102.95, 587.92004, 100.19);
        ((GeneralPath) shape).curveTo(586.77, 100.11, 585.63007, 100.07, 584.49005, 100.07);
        ((GeneralPath) shape).lineTo(584.44006, 99.17);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDD8D62));
        g.fill(shape);

        // _0_0_146
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(584.49, 100.07);
        ((GeneralPath) shape).curveTo(585.63, 100.07, 586.77, 100.11, 587.92, 100.19);
        ((GeneralPath) shape).curveTo(587.95, 102.950005, 587.13, 105.62, 586.26, 108.21001);
        ((GeneralPath) shape).curveTo(576.32, 111.05, 565.98, 112.240005, 555.83, 114.07001);
        ((GeneralPath) shape).curveTo(554.61005, 114.07001, 553.39, 114.03001, 552.19, 113.94001);
        ((GeneralPath) shape).curveTo(551.97003, 112.19001, 552.4, 110.45001, 552.81, 108.76001);
        ((GeneralPath) shape).curveTo(555.9, 108.23001, 559.17, 108.45001, 562.12, 107.19001);
        ((GeneralPath) shape).curveTo(565.12, 105.93001, 568.25, 105.02001, 571.49, 104.54001);
        ((GeneralPath) shape).curveTo(576.0, 103.630005, 580.11, 101.43001, 584.49, 100.07001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF4E0D5));
        g.fill(shape);

        // _0_0_147
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(506.22, 113.23);
        ((GeneralPath) shape).curveTo(508.29, 109.64001, 507.96, 103.8, 511.34, 101.28001);
        ((GeneralPath) shape).curveTo(507.63998, 113.75001, 504.6, 126.41, 502.22, 139.21);
        ((GeneralPath) shape).curveTo(496.83, 160.90001, 489.27, 181.97, 483.16, 203.46);
        ((GeneralPath) shape).lineTo(482.74, 202.70001);
        ((GeneralPath) shape).curveTo(481.16, 196.71, 482.33, 190.41002, 483.5, 184.47002);
        ((GeneralPath) shape).curveTo(487.61, 159.75002, 497.41, 136.54001, 506.22, 113.23002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDC8D62));
        g.fill(shape);

        // _0_0_148
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(527.43, 113.3);
        ((GeneralPath) shape).curveTo(535.94, 112.100006, 544.27997, 109.840004, 552.81, 108.76);
        ((GeneralPath) shape).curveTo(552.4, 110.450005, 551.97, 112.19, 552.19, 113.94);
        ((GeneralPath) shape).curveTo(553.39, 114.03, 554.61, 114.07, 555.83, 114.07);
        ((GeneralPath) shape).lineTo(555.65, 114.99);
        ((GeneralPath) shape).curveTo(545.7, 114.509995, 535.91003, 116.34, 526.02, 116.909996);
        ((GeneralPath) shape).curveTo(525.9, 115.46999, 525.60004, 113.729996, 527.43, 113.299995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAF704F));
        g.fill(shape);
        paint1(g, origAlpha, transformations);
    }

    private static void paint1(Graphics2D g, float origAlpha, java.util.LinkedList<AffineTransform> transformations) {
        Shape shape = null;

        // _0_0_149
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(580.35, 115.09);
        ((GeneralPath) shape).curveTo(583.88995, 114.659996, 587.43, 114.28999, 590.99, 113.96);
        ((GeneralPath) shape).curveTo(590.77, 116.38, 590.7, 119.57, 588.33997, 120.94);
        ((GeneralPath) shape).curveTo(585.76996, 120.98, 583.02997, 121.65, 580.68, 120.310005);
        ((GeneralPath) shape).curveTo(582.64, 119.64001, 584.62, 118.91, 586.33, 117.71001);
        ((GeneralPath) shape).curveTo(586.11005, 117.32001, 585.68, 116.54001, 585.46, 116.15001);
        ((GeneralPath) shape).curveTo(584.13, 116.100006, 581.47003, 116.00001, 580.13, 115.95001);
        ((GeneralPath) shape).lineTo(580.35, 115.09001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD0855C));
        g.fill(shape);

        // _0_0_150
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(574.15, 116.88);
        ((GeneralPath) shape).curveTo(576.08, 116.259995, 578.12, 116.13, 580.13, 115.95);
        ((GeneralPath) shape).curveTo(581.47003, 116.0, 584.13, 116.1, 585.46, 116.149994);
        ((GeneralPath) shape).curveTo(585.68, 116.53999, 586.11005, 117.31999, 586.33, 117.70999);
        ((GeneralPath) shape).curveTo(584.62, 118.90999, 582.64, 119.63999, 580.68, 120.30999);
        ((GeneralPath) shape).curveTo(579.45, 120.22999, 578.23, 120.11999, 577.02, 119.97999);
        ((GeneralPath) shape).curveTo(575.65, 119.819984, 572.9, 119.48999, 571.53, 119.32999);
        ((GeneralPath) shape).curveTo(572.29004, 118.39999, 573.17004, 117.58999, 574.15, 116.87999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xECD6CC));
        g.fill(shape);

        // _0_0_151
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(565.67, 119.41);
        ((GeneralPath) shape).curveTo(568.04, 117.450005, 571.2, 117.12, 574.14996, 116.880005);
        ((GeneralPath) shape).curveTo(573.17, 117.590004, 572.29, 118.4, 571.52997, 119.33);
        ((GeneralPath) shape).curveTo(572.89996, 119.490005, 575.64996, 119.82, 577.01996, 119.98);
        ((GeneralPath) shape).curveTo(573.14996, 120.28001, 569.36993, 120.08, 565.67, 119.41);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x706763));
        g.fill(shape);

        // _0_0_152
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(556.75, 125.43);
        ((GeneralPath) shape).curveTo(560.4, 124.92, 564.06, 124.81, 567.72, 125.08);
        ((GeneralPath) shape).lineTo(568.22, 125.840004);
        ((GeneralPath) shape).curveTo(558.55, 129.03, 548.12994, 128.26001, 538.19995, 130.21);
        ((GeneralPath) shape).curveTo(532.39996, 130.8, 526.7399, 132.3, 520.95996, 132.94);
        ((GeneralPath) shape).curveTo(520.95996, 131.18001, 520.36, 128.86, 522.48, 128.07);
        ((GeneralPath) shape).curveTo(530.98, 127.66, 539.58997, 128.67001, 548.02997, 127.130005);
        ((GeneralPath) shape).curveTo(550.93994, 126.630005, 553.79, 125.79001, 556.74994, 125.43001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x986748));
        g.fill(shape);

        // _0_0_153
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(549.01, 136.91);
        ((GeneralPath) shape).curveTo(558.66003, 135.36, 568.42, 134.19, 578.2, 134.06);
        ((GeneralPath) shape).curveTo(576.11, 145.43, 571.63, 156.13, 568.08, 167.08);
        ((GeneralPath) shape).curveTo(566.31, 172.38, 564.88, 177.78, 563.09, 183.07);
        ((GeneralPath) shape).curveTo(559.24005, 193.55, 554.84, 203.83, 549.97003, 213.88);
        ((GeneralPath) shape).curveTo(549.43005, 215.05, 548.46, 215.98001, 547.22003, 216.35);
        ((GeneralPath) shape).curveTo(536.80005, 220.78, 525.47003, 222.14, 514.61005, 225.03);
        ((GeneralPath) shape).curveTo(513.05005, 224.91, 509.95004, 224.68, 508.39005, 224.56);
        ((GeneralPath) shape).curveTo(506.64005, 215.48999, 511.11005, 207.12, 515.82007, 199.81);
        ((GeneralPath) shape).curveTo(522.5101, 191.04, 528.1601, 181.45, 532.17004, 171.16);
        ((GeneralPath) shape).curveTo(535.72003, 161.97, 539.52, 152.85, 542.22003, 143.36);
        ((GeneralPath) shape).curveTo(542.69, 141.91, 543.07, 140.39, 543.96, 139.13);
        ((GeneralPath) shape).curveTo(545.53, 138.15001, 547.29004, 137.55, 549.01, 136.91);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF7E3D8));
        g.fill(shape);

        // _0_0_154
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(578.2, 134.06);
        ((GeneralPath) shape).curveTo(579.68, 133.93, 581.18, 133.98, 582.67, 134.18);
        ((GeneralPath) shape).curveTo(583.31, 137.93, 582.36, 141.62999, 581.04, 145.09);
        ((GeneralPath) shape).curveTo(577.12, 155.25, 574.52997, 165.84, 571.17, 176.19);
        ((GeneralPath) shape).curveTo(568.45996, 186.55, 564.19, 196.39, 560.51, 206.42);
        ((GeneralPath) shape).curveTo(559.73, 208.33, 559.06, 210.34999, 557.72003, 211.95);
        ((GeneralPath) shape).curveTo(555.33, 213.20999, 552.57, 213.36, 549.97003, 213.87999);
        ((GeneralPath) shape).curveTo(554.84, 203.82999, 559.24005, 193.54999, 563.09, 183.06999);
        ((GeneralPath) shape).curveTo(564.88, 177.78, 566.31, 172.37999, 568.08, 167.07999);
        ((GeneralPath) shape).curveTo(571.63, 156.12999, 576.11005, 145.43, 578.2, 134.05998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDC8D62));
        g.fill(shape);

        // _0_0_155
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(543.03, 137.87);
        ((GeneralPath) shape).curveTo(544.97003, 137.29999, 546.99005, 137.06, 549.01, 136.90999);
        ((GeneralPath) shape).curveTo(547.29004, 137.54999, 545.53, 138.15, 543.96, 139.12999);
        ((GeneralPath) shape).curveTo(543.07, 140.38998, 542.69, 141.90999, 542.22003, 143.35999);
        ((GeneralPath) shape).curveTo(539.52, 152.84999, 535.72003, 161.96999, 532.17004, 171.15999);
        ((GeneralPath) shape).curveTo(528.16003, 181.44998, 522.5101, 191.04, 515.82007, 199.80998);
        ((GeneralPath) shape).curveTo(511.11008, 207.11998, 506.64008, 215.48999, 508.39008, 224.55998);
        ((GeneralPath) shape).curveTo(509.95007, 224.67998, 513.05005, 224.90999, 514.61005, 225.02998);
        ((GeneralPath) shape).lineTo(514.9, 225.86998);
        ((GeneralPath) shape).curveTo(509.71002, 226.75998, 504.43002, 226.96999, 499.31003, 228.22998);
        ((GeneralPath) shape).curveTo(495.85004, 228.96999, 492.64, 230.71999, 489.07004, 230.92998);
        ((GeneralPath) shape).curveTo(490.26004, 224.02998, 492.64005, 217.38998, 494.75003, 210.72998);
        ((GeneralPath) shape).curveTo(499.76004, 193.55998, 508.04004, 177.46999, 511.83002, 159.91998);
        ((GeneralPath) shape).curveTo(512.79004, 156.60999, 514.33, 153.48999, 515.08, 150.10999);
        ((GeneralPath) shape).curveTo(515.89, 147.22998, 516.07, 144.06999, 517.73004, 141.50998);
        ((GeneralPath) shape).curveTo(526.13007, 140.09998, 534.80005, 140.29997, 543.03, 137.86998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_156
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(584.99, 183.97);
        ((GeneralPath) shape).curveTo(588.47, 174.71, 590.94, 165.06, 595.07, 156.05);
        ((GeneralPath) shape).curveTo(594.49, 162.29001, 591.65, 168.05, 590.07, 174.08);
        ((GeneralPath) shape).curveTo(584.57, 189.62, 578.62, 204.99, 572.15, 220.15);
        ((GeneralPath) shape).curveTo(566.30005, 233.81999, 560.95, 247.7, 555.56, 261.55);
        ((GeneralPath) shape).curveTo(551.7, 271.22998, 547.94, 280.94998, 544.95, 290.93);
        ((GeneralPath) shape).curveTo(543.24, 296.94998, 540.68, 302.66, 538.44, 308.49);
        ((GeneralPath) shape).curveTo(533.74, 323.84998, 528.62, 339.08, 523.19, 354.19998);
        ((GeneralPath) shape).curveTo(517.59, 370.74997, 510.83002, 386.88998, 505.58002, 403.56);
        ((GeneralPath) shape).curveTo(501.31003, 415.2, 497.30002, 426.93, 493.86002, 438.85);
        ((GeneralPath) shape).curveTo(489.07, 454.67, 482.98, 470.05002, 477.81003, 485.75);
        ((GeneralPath) shape).curveTo(476.81003, 488.89, 474.69003, 491.45, 473.09003, 494.28);
        ((GeneralPath) shape).curveTo(472.87003, 498.03, 476.76004, 500.65, 478.11002, 503.93);
        ((GeneralPath) shape).curveTo(476.05002, 501.59, 473.73, 499.50998, 471.90002, 497.02);
        ((GeneralPath) shape).curveTo(470.91003, 495.62, 470.91003, 493.63998, 472.40002, 492.44998);
        ((GeneralPath) shape).curveTo(474.57004, 489.08, 476.69003, 485.62997, 477.72003, 481.69998);
        ((GeneralPath) shape).curveTo(481.15002, 471.24997, 485.43002, 461.11, 488.61005, 450.58997);
        ((GeneralPath) shape).curveTo(492.99005, 435.61996, 498.30005, 420.94995, 503.12006, 406.11996);
        ((GeneralPath) shape).curveTo(511.78006, 380.91995, 521.78, 356.17996, 529.74005, 330.73996);
        ((GeneralPath) shape).curveTo(534.11005, 315.88995, 539.87006, 301.50995, 544.87006, 286.86996);
        ((GeneralPath) shape).curveTo(549.5101, 273.39996, 554.4501, 260.03998, 559.87006, 246.85997);
        ((GeneralPath) shape).curveTo(567.7101, 225.67996, 577.72003, 205.36996, 584.99005, 183.96997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8A8A8A));
        g.fill(shape);

        // _0_0_157
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(621.15, 199.04);
        ((GeneralPath) shape).curveTo(627.16003, 197.7, 633.5, 197.96999, 639.52, 199.23);
        ((GeneralPath) shape).curveTo(647.53, 201.84, 655.39, 205.09, 662.72003, 209.28);
        ((GeneralPath) shape).curveTo(668.98004, 213.25, 674.73004, 217.98, 681.04004, 221.89);
        ((GeneralPath) shape).curveTo(683.17004, 223.4, 685.78, 224.58, 687.25006, 226.87);
        ((GeneralPath) shape).curveTo(688.69006, 229.37999, 689.10004, 232.47, 688.30005, 235.26999);
        ((GeneralPath) shape).curveTo(686.5801, 241.94998, 682.73004, 247.82999, 680.17004, 254.18999);
        ((GeneralPath) shape).curveTo(669.64, 282.56, 660.50006, 311.41998, 649.66003, 339.68);
        ((GeneralPath) shape).curveTo(645.96, 352.38, 640.50006, 364.43, 635.72003, 376.72998);
        ((GeneralPath) shape).curveTo(632.79004, 384.30997, 629.12006, 391.58, 626.25006, 399.19998);
        ((GeneralPath) shape).curveTo(625.36005, 401.19998, 624.73004, 403.55, 622.88007, 404.9);
        ((GeneralPath) shape).curveTo(624.63007, 398.68, 627.42004, 392.84, 629.9601, 386.93);
        ((GeneralPath) shape).curveTo(636.7601, 371.08, 643.1401, 355.05, 648.7401, 338.72998);
        ((GeneralPath) shape).curveTo(658.1501, 313.24997, 666.8701, 287.52, 675.9001, 261.89996);
        ((GeneralPath) shape).curveTo(678.56006, 254.17996, 682.1401, 246.82996, 685.4901, 239.39996);
        ((GeneralPath) shape).curveTo(687.0901, 235.89996, 687.6601, 231.82996, 686.3701, 228.11996);
        ((GeneralPath) shape).curveTo(684.4701, 225.11996, 680.95013, 223.69997, 678.2401, 221.58997);
        ((GeneralPath) shape).curveTo(670.7401, 216.81996, 663.9801, 210.82997, 655.8101, 207.18997);
        ((GeneralPath) shape).curveTo(647.9801, 203.50998, 639.7401, 199.72997, 630.89014, 199.95998);
        ((GeneralPath) shape).curveTo(625.7501, 200.10997, 620.10016, 199.72998, 615.6201, 202.67998);
        ((GeneralPath) shape).curveTo(611.4801, 205.45998, 607.5901, 208.58998, 603.8401, 211.86998);
        ((GeneralPath) shape).curveTo(607.3401, 205.28998, 614.13007, 201.03998, 621.1501, 199.03998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_158
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(482.74, 202.7);
        ((GeneralPath) shape).lineTo(483.16, 203.45999);
        ((GeneralPath) shape).curveTo(482.04, 211.24998, 479.24, 218.65, 477.27, 226.23999);
        ((GeneralPath) shape).curveTo(475.94, 231.43, 474.13998, 236.48, 472.49, 241.56999);
        ((GeneralPath) shape).curveTo(467.09998, 264.05, 460.12, 286.09998, 454.53, 308.53);
        ((GeneralPath) shape).curveTo(449.73, 328.38, 443.77, 347.91998, 437.24, 367.26);
        ((GeneralPath) shape).curveTo(435.38998, 375.11002, 432.33, 382.59, 430.53, 390.45);
        ((GeneralPath) shape).curveTo(429.65, 394.19, 427.22, 397.63, 427.41, 401.6);
        ((GeneralPath) shape).curveTo(427.67, 406.05002, 426.38, 410.39, 424.73, 414.49002);
        ((GeneralPath) shape).curveTo(423.87003, 416.42, 421.73, 417.19003, 420.03, 418.19003);
        ((GeneralPath) shape).curveTo(422.1, 415.37003, 424.72, 412.76004, 425.21, 409.10004);
        ((GeneralPath) shape).curveTo(427.19998, 405.80005, 426.25998, 402.37003, 425.08, 399.13004);
        ((GeneralPath) shape).curveTo(426.69998, 395.95004, 429.47, 393.36005, 429.90997, 389.60004);
        ((GeneralPath) shape).curveTo(430.31998, 387.41003, 431.11996, 383.02005, 431.52997, 380.82004);
        ((GeneralPath) shape).curveTo(433.40997, 377.14005, 435.15997, 373.34003, 434.92996, 369.05005);
        ((GeneralPath) shape).curveTo(435.21997, 365.28006, 437.98996, 362.38004, 438.96997, 358.83005);
        ((GeneralPath) shape).curveTo(441.82996, 348.23004, 445.42996, 337.85004, 448.19998, 327.23004);
        ((GeneralPath) shape).curveTo(452.50998, 313.68005, 454.84, 299.60004, 458.97998, 286.00003);
        ((GeneralPath) shape).curveTo(463.4, 271.17004, 467.46997, 256.24002, 471.13998, 241.21002);
        ((GeneralPath) shape).curveTo(475.65, 228.57002, 478.41998, 215.39001, 482.74, 202.70003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8A8A89));
        g.fill(shape);

        // _0_0_159
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(600.11, 216.16);
        ((GeneralPath) shape).curveTo(600.8, 214.88, 601.94, 213.94, 603.13, 213.11);
        ((GeneralPath) shape).curveTo(600.69, 218.25, 597.69, 223.1, 595.15, 228.18);
        ((GeneralPath) shape).curveTo(589.17004, 241.59, 584.94, 255.68, 580.67004, 269.69998);
        ((GeneralPath) shape).curveTo(578.5101, 277.19998, 576.98004, 284.88998, 574.56006, 292.31998);
        ((GeneralPath) shape).curveTo(574.13007, 293.81998, 573.0201, 294.94998, 571.87006, 295.91998);
        ((GeneralPath) shape).curveTo(573.25006, 290.97998, 574.81006, 286.09, 576.22003, 281.15997);
        ((GeneralPath) shape).curveTo(580.2, 264.91998, 585.55005, 249.04997, 591.41003, 233.40997);
        ((GeneralPath) shape).curveTo(593.63, 227.33997, 596.83, 221.70998, 600.11005, 216.15997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8A8A8A));
        g.fill(shape);

        // _0_0_160
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(612.95, 224.07);
        ((GeneralPath) shape).curveTo(616.44, 218.56001, 622.38, 214.44, 629.05, 214.27);
        ((GeneralPath) shape).curveTo(637.6, 215.13, 645.33997, 219.14, 652.75, 223.22);
        ((GeneralPath) shape).curveTo(654.47, 224.11, 655.91, 225.44, 657.03, 227.02);
        ((GeneralPath) shape).curveTo(653.77, 225.27, 650.60004, 223.29001, 647.09, 222.12001);
        ((GeneralPath) shape).curveTo(644.74005, 228.46, 643.72003, 236.03001, 638.44, 240.78001);
        ((GeneralPath) shape).curveTo(636.19, 240.72002, 633.99, 240.30002, 631.77, 240.10002);
        ((GeneralPath) shape).curveTo(625.99, 239.22002, 619.59, 241.65002, 616.23004, 246.45003);
        ((GeneralPath) shape).curveTo(611.10004, 258.13004, 609.55005, 270.98004, 604.9, 282.83002);
        ((GeneralPath) shape).curveTo(604.4, 284.35, 603.33, 287.1, 605.85004, 287.23);
        ((GeneralPath) shape).lineTo(605.73004, 288.06);
        ((GeneralPath) shape).curveTo(600.5101, 288.74, 595.31006, 289.38998, 590.09, 289.97);
        ((GeneralPath) shape).curveTo(592.29004, 277.15, 596.79004, 264.9, 600.48004, 252.48);
        ((GeneralPath) shape).curveTo(603.31006, 242.51, 607.39, 232.83, 612.95, 224.06999);
        ((GeneralPath) shape).moveTo(624.78, 216.45);
        ((GeneralPath) shape).curveTo(620.11005, 217.47, 616.56006, 221.33, 613.94, 225.09999);
        ((GeneralPath) shape).curveTo(609.09, 232.45999, 605.65, 240.66998, 603.14, 249.10999);
        ((GeneralPath) shape).curveTo(601.18, 255.75998, 598.38, 262.15997, 596.94, 268.96);
        ((GeneralPath) shape).curveTo(600.21, 267.55, 601.5, 263.97998, 603.19, 261.13998);
        ((GeneralPath) shape).curveTo(611.09, 246.43999, 621.51, 233.29999, 629.6, 218.70999);
        ((GeneralPath) shape).curveTo(630.05, 217.76999, 630.41, 216.79, 630.69, 215.79);
        ((GeneralPath) shape).curveTo(629.22003, 215.95, 626.26, 216.28, 624.78, 216.45);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_161
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(624.78, 216.45);
        ((GeneralPath) shape).curveTo(626.26, 216.28, 629.22003, 215.95, 630.69, 215.79);
        ((GeneralPath) shape).curveTo(630.41, 216.79, 630.05, 217.76999, 629.6, 218.70999);
        ((GeneralPath) shape).curveTo(621.50995, 233.29999, 611.08997, 246.43999, 603.19, 261.13998);
        ((GeneralPath) shape).curveTo(601.5, 263.97998, 600.21, 267.55, 596.94, 268.96);
        ((GeneralPath) shape).curveTo(598.38, 262.16, 601.18, 255.76, 603.14, 249.10999);
        ((GeneralPath) shape).curveTo(605.65, 240.66998, 609.09, 232.45999, 613.94, 225.09999);
        ((GeneralPath) shape).curveTo(616.56, 221.32999, 620.11, 217.46999, 624.78, 216.45);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDE8D62));
        g.fill(shape);

        // _0_0_162
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(539.25, 225.34);
        ((GeneralPath) shape).curveTo(544.12, 223.81999, 549.0, 222.06, 554.08, 221.29);
        ((GeneralPath) shape).curveTo(553.86005, 225.73999, 551.76, 229.81999, 549.85004, 233.75);
        ((GeneralPath) shape).curveTo(545.27, 236.38, 539.96, 238.05, 534.65, 237.88);
        ((GeneralPath) shape).curveTo(530.82, 238.17, 526.41003, 237.64, 523.10004, 240.07);
        ((GeneralPath) shape).curveTo(523.16003, 241.34001, 523.48004, 242.58, 523.61005, 243.85);
        ((GeneralPath) shape).curveTo(517.97003, 245.23001, 512.27, 246.36, 506.60004, 247.6);
        ((GeneralPath) shape).curveTo(498.75003, 249.01001, 491.12003, 251.56001, 483.12003, 252.11);
        ((GeneralPath) shape).curveTo(483.97003, 247.97, 485.62003, 244.0, 487.18002, 240.09);
        ((GeneralPath) shape).curveTo(489.38004, 239.03, 491.89, 238.87999, 494.26, 238.25);
        ((GeneralPath) shape).curveTo(502.19, 236.34, 509.81, 233.25, 517.85004, 231.8);
        ((GeneralPath) shape).curveTo(517.37006, 232.18001, 516.39, 232.94, 515.9, 233.32);
        ((GeneralPath) shape).curveTo(516.07, 233.93001, 516.4, 235.13, 516.57, 235.74);
        ((GeneralPath) shape).curveTo(523.17, 237.22, 531.03, 238.61, 536.68, 233.92);
        ((GeneralPath) shape).curveTo(539.16, 231.72, 542.21, 229.44, 542.63, 225.89);
        ((GeneralPath) shape).curveTo(541.56, 225.94, 540.51, 226.02, 539.45, 226.12);
        ((GeneralPath) shape).lineTo(539.25, 225.34);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_163
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(647.09, 222.12);
        ((GeneralPath) shape).curveTo(650.60004, 223.29, 653.77, 225.26999, 657.03, 227.01999);
        ((GeneralPath) shape).curveTo(660.11005, 229.09, 663.86005, 230.76999, 665.79004, 234.09999);
        ((GeneralPath) shape).curveTo(660.31006, 245.09, 656.32007, 256.72998, 652.42004, 268.36);
        ((GeneralPath) shape).curveTo(651.80005, 270.03, 651.30005, 271.78998, 650.24005, 273.24);
        ((GeneralPath) shape).curveTo(646.81006, 275.44998, 642.79004, 276.53, 639.0801, 278.13998);
        ((GeneralPath) shape).curveTo(641.7801, 273.93997, 642.4701, 268.87, 643.38007, 264.06);
        ((GeneralPath) shape).curveTo(643.75006, 258.45, 645.35004, 252.3, 642.2101, 247.14);
        ((GeneralPath) shape).curveTo(640.2901, 243.08, 635.50006, 241.91, 631.7701, 240.1);
        ((GeneralPath) shape).curveTo(633.99005, 240.3, 636.19006, 240.72, 638.44006, 240.78);
        ((GeneralPath) shape).curveTo(643.7201, 236.03, 644.74005, 228.45999, 647.0901, 222.12);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDF8E62));
        g.fill(shape);

        // _0_0_164
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(517.85, 231.8);
        ((GeneralPath) shape).curveTo(524.98, 229.65001, 532.32996, 228.3, 539.44995, 226.12001);
        ((GeneralPath) shape).curveTo(540.50995, 226.02, 541.55994, 225.94002, 542.62994, 225.89001);
        ((GeneralPath) shape).curveTo(542.20996, 229.44002, 539.16, 231.72002, 536.67993, 233.92001);
        ((GeneralPath) shape).curveTo(531.0299, 238.61002, 523.1699, 237.22002, 516.56995, 235.74002);
        ((GeneralPath) shape).curveTo(516.39996, 235.13002, 516.06995, 233.93002, 515.89996, 233.32002);
        ((GeneralPath) shape).curveTo(516.38995, 232.94002, 517.36993, 232.18002, 517.85, 231.80002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF3DED3));
        g.fill(shape);

        // _0_0_165
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(616.23, 246.45);
        ((GeneralPath) shape).curveTo(619.58997, 241.65, 625.99, 239.22, 631.76996, 240.09999);
        ((GeneralPath) shape).curveTo(635.49994, 241.90999, 640.29, 243.07999, 642.20996, 247.13998);
        ((GeneralPath) shape).curveTo(645.35, 252.29999, 643.74994, 258.44998, 643.37994, 264.06);
        ((GeneralPath) shape).curveTo(642.47, 268.87, 641.77997, 273.94, 639.07996, 278.13998);
        ((GeneralPath) shape).curveTo(635.13995, 280.37, 630.52997, 281.03998, 626.2399, 282.24997);
        ((GeneralPath) shape).curveTo(619.3599, 283.59998, 612.6099, 285.43997, 605.8499, 287.22998);
        ((GeneralPath) shape).curveTo(603.3299, 287.09998, 604.3999, 284.34998, 604.8999, 282.83);
        ((GeneralPath) shape).curveTo(609.5499, 270.97998, 611.0999, 258.12997, 616.2299, 246.44998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF3E0D5));
        g.fill(shape);

        // _0_0_166
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(526.55, 250.61);
        ((GeneralPath) shape).curveTo(533.04, 248.67, 539.29, 246.02, 545.68, 243.81);
        ((GeneralPath) shape).curveTo(544.67, 248.37, 542.42, 252.51, 540.89, 256.9);
        ((GeneralPath) shape).curveTo(539.39, 260.77, 538.27, 264.81, 536.27, 268.44998);
        ((GeneralPath) shape).curveTo(529.45, 270.13998, 522.43, 270.65997, 515.48004, 271.43997);
        ((GeneralPath) shape).curveTo(513.14, 272.16998, 510.91003, 272.05997, 508.79004, 271.11);
        ((GeneralPath) shape).curveTo(511.17004, 269.22998, 514.06006, 267.97998, 515.93005, 265.5);
        ((GeneralPath) shape).curveTo(516.7601, 262.65, 514.36005, 260.0, 511.96005, 258.92);
        ((GeneralPath) shape).curveTo(510.68005, 258.49002, 509.37006, 258.15002, 508.09006, 257.75);
        ((GeneralPath) shape).curveTo(507.38007, 255.78, 509.63007, 255.53, 510.90005, 254.85);
        ((GeneralPath) shape).curveTo(516.00006, 253.05, 521.3901, 252.24, 526.55005, 250.61);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDD8D61));
        g.fill(shape);

        // _0_0_167
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(497.73, 258.28);
        ((GeneralPath) shape).curveTo(501.82, 256.21, 506.40002, 255.49, 510.90002, 254.85);
        ((GeneralPath) shape).curveTo(509.63004, 255.53, 507.38004, 255.78, 508.09003, 257.75);
        ((GeneralPath) shape).curveTo(509.37003, 258.15, 510.68002, 258.49, 511.96002, 258.92);
        ((GeneralPath) shape).curveTo(507.41003, 258.82, 502.86002, 259.42, 498.34003, 259.0);
        ((GeneralPath) shape).lineTo(497.73004, 258.28);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x84553B));
        g.fill(shape);

        // _0_0_168
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(479.48, 264.03);
        ((GeneralPath) shape).curveTo(484.88, 263.93, 490.34, 264.15, 495.66, 265.19);
        ((GeneralPath) shape).lineTo(496.1, 265.92);
        ((GeneralPath) shape).curveTo(490.08002, 267.21002, 484.19, 269.35, 478.05002, 269.93002);
        ((GeneralPath) shape).curveTo(477.79, 267.85004, 478.14, 265.7, 479.48, 264.03003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD0855C));
        g.fill(shape);

        // _0_0_169
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(518.62, 282.47);
        ((GeneralPath) shape).curveTo(521.36, 281.48, 524.32, 281.07, 527.23, 281.22);
        ((GeneralPath) shape).curveTo(523.72, 282.43, 520.1, 283.33, 516.67, 284.74);
        ((GeneralPath) shape).curveTo(515.13995, 287.94, 514.77997, 291.53, 513.93, 294.94998);
        ((GeneralPath) shape).curveTo(511.75, 306.05, 507.61, 316.61, 504.4, 327.43);
        ((GeneralPath) shape).curveTo(503.34, 331.03998, 501.81, 334.71, 502.27, 338.56);
        ((GeneralPath) shape).curveTo(504.72998, 338.68, 507.12997, 338.33, 509.59, 337.95);
        ((GeneralPath) shape).curveTo(512.15, 333.03, 513.75, 327.7, 515.23, 322.39);
        ((GeneralPath) shape).curveTo(515.63995, 320.63, 516.66, 319.15002, 517.76996, 317.77002);
        ((GeneralPath) shape).curveTo(516.02997, 324.78003, 513.8, 331.7, 511.21997, 338.44003);
        ((GeneralPath) shape).curveTo(506.93997, 339.64005, 502.33997, 339.39005, 498.19998, 341.07004);
        ((GeneralPath) shape).curveTo(485.24997, 346.09003, 472.56998, 352.18002, 458.99997, 355.39005);
        ((GeneralPath) shape).curveTo(460.87997, 354.06006, 463.18997, 352.98004, 464.36996, 350.91003);
        ((GeneralPath) shape).curveTo(466.13995, 344.85004, 466.93997, 338.56003, 468.37997, 332.42004);
        ((GeneralPath) shape).curveTo(470.55, 322.21005, 473.70996, 312.24005, 477.53998, 302.54004);
        ((GeneralPath) shape).curveTo(478.08997, 300.82004, 479.11, 299.00003, 478.37997, 297.18005);
        ((GeneralPath) shape).curveTo(477.27, 297.06006, 476.16998, 296.98004, 475.06998, 296.95004);
        ((GeneralPath) shape).lineTo(475.30997, 296.17004);
        ((GeneralPath) shape).curveTo(478.69998, 294.98004, 482.14996, 293.93005, 485.42996, 292.42004);
        ((GeneralPath) shape).curveTo(496.02997, 287.71005, 507.49997, 285.56006, 518.61993, 282.47003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_170
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(527.23, 281.22);
        ((GeneralPath) shape).curveTo(530.55, 280.12, 530.37, 283.9, 530.42, 286.44);
        ((GeneralPath) shape).curveTo(529.81, 286.44, 528.6, 286.44, 528.0, 286.45);
        ((GeneralPath) shape).curveTo(527.55, 289.84003, 526.69, 293.16, 525.2, 296.26);
        ((GeneralPath) shape).curveTo(523.28, 302.30002, 521.46, 308.39, 519.64, 314.47);
        ((GeneralPath) shape).curveTo(519.27, 315.7, 518.57, 316.79, 517.77, 317.77);
        ((GeneralPath) shape).curveTo(516.66003, 319.15, 515.64, 320.62997, 515.23004, 322.38998);
        ((GeneralPath) shape).curveTo(513.75006, 327.69998, 512.15, 333.03, 509.59003, 337.94998);
        ((GeneralPath) shape).curveTo(507.13004, 338.33, 504.73004, 338.68, 502.27002, 338.55997);
        ((GeneralPath) shape).curveTo(501.81003, 334.70996, 503.34003, 331.03998, 504.40002, 327.42996);
        ((GeneralPath) shape).curveTo(507.61002, 316.60995, 511.75003, 306.04996, 513.93005, 294.94995);
        ((GeneralPath) shape).curveTo(514.78, 291.52994, 515.1401, 287.93994, 516.67004, 284.73996);
        ((GeneralPath) shape).curveTo(520.10004, 283.32996, 523.72003, 282.42996, 527.23004, 281.21997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDE8D62));
        g.fill(shape);

        // _0_0_171
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(474.62, 282.17);
        ((GeneralPath) shape).curveTo(477.11, 281.68002, 479.9, 281.83002, 482.38, 282.51);
        ((GeneralPath) shape).curveTo(479.37, 284.30002, 476.38, 286.47, 472.83002, 286.95);
        ((GeneralPath) shape).curveTo(473.06003, 285.25, 473.39, 283.46002, 474.62003, 282.17);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB77550));
        g.fill(shape);

        // _0_0_172
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(646.97, 282.42);
        ((GeneralPath) shape).curveTo(646.81, 286.65002, 644.95996, 290.55002, 643.55, 294.47);
        ((GeneralPath) shape).curveTo(641.92, 299.56, 635.62, 299.96, 631.16, 301.17);
        ((GeneralPath) shape).curveTo(634.41, 297.56003, 636.19, 292.86002, 636.74, 288.08002);
        ((GeneralPath) shape).curveTo(634.5, 288.24002, 632.29, 288.59003, 630.08997, 288.97003);
        ((GeneralPath) shape).lineTo(630.18994, 288.15002);
        ((GeneralPath) shape).curveTo(635.70996, 286.05002, 641.42993, 284.51, 646.97, 282.42);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDD8D62));
        g.fill(shape);

        // _0_0_173
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(630.09, 288.97);
        ((GeneralPath) shape).curveTo(632.29004, 288.59, 634.5, 288.24, 636.74005, 288.08);
        ((GeneralPath) shape).curveTo(636.19006, 292.86, 634.41003, 297.56, 631.16003, 301.16998);
        ((GeneralPath) shape).curveTo(625.56006, 303.18997, 619.69006, 304.43, 613.93005, 305.86);
        ((GeneralPath) shape).curveTo(609.61005, 306.99, 605.36005, 308.34998, 601.0101, 309.34);
        ((GeneralPath) shape).curveTo(600.6501, 309.13998, 599.92004, 308.75, 599.56006, 308.55);
        ((GeneralPath) shape).curveTo(598.50006, 304.56, 599.7601, 300.22998, 601.91003, 296.8);
        ((GeneralPath) shape).curveTo(606.98004, 295.59998, 612.24005, 295.11, 617.14, 293.21);
        ((GeneralPath) shape).curveTo(621.49, 291.93, 625.63, 289.9, 630.09, 288.97);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6E2D7));
        g.fill(shape);

        // _0_0_174
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(470.84, 297.48);
        ((GeneralPath) shape).curveTo(472.16998, 296.94, 473.63998, 296.94, 475.07, 296.95);
        ((GeneralPath) shape).curveTo(476.17, 296.98, 477.27002, 297.06, 478.38, 297.18002);
        ((GeneralPath) shape).curveTo(479.11002, 299.00003, 478.09, 300.82004, 477.54, 302.54);
        ((GeneralPath) shape).curveTo(473.71002, 312.24002, 470.55002, 322.21002, 468.38, 332.42);
        ((GeneralPath) shape).curveTo(466.94, 338.56003, 466.14, 344.85, 464.37, 350.91);
        ((GeneralPath) shape).curveTo(463.19, 352.98, 460.88, 354.06, 459.0, 355.39);
        ((GeneralPath) shape).curveTo(457.57, 355.54, 454.7, 355.84003, 453.26, 356.0);
        ((GeneralPath) shape).curveTo(453.52002, 351.48, 456.06, 347.41, 457.11002, 343.06);
        ((GeneralPath) shape).curveTo(459.86002, 332.13998, 463.42, 321.44, 466.63, 310.64);
        ((GeneralPath) shape).curveTo(468.11002, 306.31003, 468.21, 301.35, 470.84, 297.48);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB8C61));
        g.fill(shape);

        // _0_0_175
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(567.33, 300.09);
        ((GeneralPath) shape).curveTo(567.65, 298.35, 569.19, 297.37, 570.77, 296.88998);
        ((GeneralPath) shape).curveTo(568.08, 300.15997, 571.14, 304.19998, 569.7, 307.78998);
        ((GeneralPath) shape).curveTo(567.32, 315.74997, 564.19, 323.46, 561.28, 331.22998);
        ((GeneralPath) shape).curveTo(562.09, 322.37, 566.83, 314.38998, 568.91003, 305.80997);
        ((GeneralPath) shape).curveTo(569.01, 303.78998, 567.75006, 302.01996, 567.33, 300.08997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8B8A89));
        g.fill(shape);

        // _0_0_176
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(586.12, 301.13);
        ((GeneralPath) shape).curveTo(590.92, 298.45, 596.54, 297.68, 601.91, 296.80002);
        ((GeneralPath) shape).curveTo(599.75995, 300.23, 598.5, 304.56003, 599.56, 308.55002);
        ((GeneralPath) shape).curveTo(599.92, 308.75003, 600.65, 309.14, 601.01, 309.34003);
        ((GeneralPath) shape).lineTo(600.35004, 309.84003);
        ((GeneralPath) shape).curveTo(594.47003, 310.41003, 588.76, 312.10004, 582.91003, 312.77002);
        ((GeneralPath) shape).curveTo(583.41003, 308.80002, 583.91003, 304.58002, 586.12006, 301.13);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB87552));
        g.fill(shape);

        // _0_0_177
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(627.79, 311.93);
        ((GeneralPath) shape).curveTo(630.42, 309.72998, 634.43, 309.38, 637.82996, 309.02);
        ((GeneralPath) shape).curveTo(637.86993, 311.24, 637.48, 313.50998, 636.36993, 315.46);
        ((GeneralPath) shape).curveTo(633.17993, 316.66998, 629.70996, 317.02, 626.37994, 317.56998);
        ((GeneralPath) shape).curveTo(626.97, 315.71997, 627.3599, 313.81998, 627.7899, 311.92996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDA8B60));
        g.fill(shape);

        // _0_0_178
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(613.49, 315.6);
        ((GeneralPath) shape).curveTo(618.18, 314.1, 622.89996, 312.64, 627.79, 311.93);
        ((GeneralPath) shape).curveTo(627.36, 313.82, 626.97, 315.72, 626.38, 317.57);
        ((GeneralPath) shape).curveTo(618.09, 319.0, 609.67, 320.02002, 601.26, 320.03);
        ((GeneralPath) shape).lineTo(600.97003, 319.2);
        ((GeneralPath) shape).curveTo(604.99005, 317.54, 609.32, 316.87003, 613.49005, 315.6);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEBD6CC));
        g.fill(shape);

        // _0_0_179
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(591.53, 326.33);
        ((GeneralPath) shape).curveTo(597.95, 325.81, 604.23004, 323.9, 610.7, 323.93);
        ((GeneralPath) shape).lineTo(610.97003, 324.72998);
        ((GeneralPath) shape).curveTo(608.56006, 325.83997, 605.98004, 327.06998, 603.27, 326.62997);
        ((GeneralPath) shape).curveTo(599.14, 326.08, 595.0, 326.73996, 590.88, 326.94998);
        ((GeneralPath) shape).lineTo(591.53, 326.33);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x55473F));
        g.fill(shape);

        // _0_0_180
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(590.88, 326.95);
        ((GeneralPath) shape).curveTo(595.0, 326.74002, 599.14, 326.08002, 603.27, 326.63);
        ((GeneralPath) shape).curveTo(599.60004, 328.41, 595.51, 329.85, 593.11005, 333.38);
        ((GeneralPath) shape).curveTo(593.23004, 335.18, 593.68005, 336.95, 593.84, 338.76);
        ((GeneralPath) shape).curveTo(590.19, 340.05002, 586.36005, 340.62, 582.66003, 341.68002);
        ((GeneralPath) shape).curveTo(579.17004, 342.53003, 575.73004, 343.81003, 572.12006, 343.86002);
        ((GeneralPath) shape).curveTo(571.93005, 340.91, 573.3901, 338.21002, 574.2001, 335.46002);
        ((GeneralPath) shape).curveTo(575.24005, 332.61002, 576.06006, 329.63004, 577.5901, 326.98);
        ((GeneralPath) shape).curveTo(581.9901, 326.85, 586.4601, 327.2, 590.88007, 326.95);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_181
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(620.49, 330.44);
        ((GeneralPath) shape).curveTo(623.54, 329.89, 626.7, 329.0, 629.86, 329.23);
        ((GeneralPath) shape).curveTo(630.01996, 330.33002, 629.98, 331.43002, 629.74, 332.53);
        ((GeneralPath) shape).curveTo(627.07, 341.07, 623.62, 349.34, 620.85, 357.86);
        ((GeneralPath) shape).curveTo(616.86, 370.72998, 610.41, 382.66998, 606.13, 395.44);
        ((GeneralPath) shape).curveTo(602.38, 396.7, 598.14, 395.57, 594.23, 396.14);
        ((GeneralPath) shape).curveTo(585.42, 397.18002, 576.91, 399.92, 568.11, 401.03003);
        ((GeneralPath) shape).curveTo(563.44, 400.81003, 558.31, 404.04004, 553.87, 402.03003);
        ((GeneralPath) shape).curveTo(559.29, 391.58002, 564.04, 380.79004, 569.24, 370.23004);
        ((GeneralPath) shape).curveTo(571.73, 365.09003, 573.63, 359.61005, 576.7, 354.78003);
        ((GeneralPath) shape).curveTo(579.0, 352.78003, 582.15, 352.14, 584.91003, 350.96002);
        ((GeneralPath) shape).curveTo(590.49005, 348.94003, 596.4, 347.94003, 602.07, 346.19003);
        ((GeneralPath) shape).curveTo(604.06, 345.62003, 605.8, 344.29004, 606.79, 342.45004);
        ((GeneralPath) shape).curveTo(608.58997, 338.93005, 604.91, 337.66003, 604.19, 335.01004);
        ((GeneralPath) shape).curveTo(609.46, 332.96005, 614.97003, 331.61005, 620.49, 330.44003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDF8E62));
        g.fill(shape);

        // _0_0_182
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(559.11, 334.16);
        ((GeneralPath) shape).curveTo(559.74, 333.19, 559.8, 331.24, 561.27997, 331.23);
        ((GeneralPath) shape).curveTo(558.99, 339.94, 555.43994, 348.25, 552.86, 356.88);
        ((GeneralPath) shape).curveTo(550.37, 364.88, 547.45996, 372.73, 544.57, 380.59);
        ((GeneralPath) shape).curveTo(542.0, 387.15, 540.52, 394.11, 537.44, 400.46);
        ((GeneralPath) shape).curveTo(535.38, 404.56998, 534.67, 409.25, 532.12, 413.13);
        ((GeneralPath) shape).curveTo(529.7, 416.76, 529.76, 421.27002, 528.41, 425.28);
        ((GeneralPath) shape).curveTo(525.06, 433.52, 523.43, 442.4, 519.04, 450.22);
        ((GeneralPath) shape).curveTo(518.70996, 446.56, 518.18, 442.94, 517.94, 439.29);
        ((GeneralPath) shape).curveTo(518.07, 436.97, 519.19, 434.87, 519.8, 432.67);
        ((GeneralPath) shape).curveTo(522.44, 424.91, 522.74, 416.51, 525.95996, 408.94);
        ((GeneralPath) shape).curveTo(529.49, 399.72, 533.72, 390.8, 537.83997, 381.84);
        ((GeneralPath) shape).curveTo(542.57996, 371.57, 546.86, 361.08, 551.98, 350.97998);
        ((GeneralPath) shape).curveTo(554.76996, 345.55997, 556.97, 339.86, 559.11, 334.15997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD5885E));
        g.fill(shape);

        // _0_0_183
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(503.51, 349.36);
        ((GeneralPath) shape).curveTo(504.57, 349.11, 505.65002, 349.03, 506.75, 349.12);
        ((GeneralPath) shape).curveTo(506.95, 352.59, 505.08, 355.71, 503.95, 358.88);
        ((GeneralPath) shape).curveTo(503.19, 360.21, 502.95, 362.14, 501.45, 362.87);
        ((GeneralPath) shape).curveTo(497.38, 362.94998, 493.32, 362.16998, 489.26, 362.27);
        ((GeneralPath) shape).curveTo(480.13, 363.09, 471.15002, 365.28998, 462.58002, 368.52);
        ((GeneralPath) shape).curveTo(461.41, 369.06, 460.15002, 368.5, 459.06003, 368.08);
        ((GeneralPath) shape).curveTo(458.14, 367.43997, 456.29004, 367.38998, 456.24002, 366.0);
        ((GeneralPath) shape).curveTo(472.77002, 362.88, 487.96002, 355.42, 503.51, 349.36);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB87652));
        g.fill(shape);

        // _0_0_184
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(568.37, 354.29);
        ((GeneralPath) shape).curveTo(573.75, 352.68002, 579.29, 351.41, 584.91, 350.96002);
        ((GeneralPath) shape).curveTo(582.14996, 352.14, 579.0, 352.78003, 576.69995, 354.78003);
        ((GeneralPath) shape).curveTo(573.62994, 359.61002, 571.73, 365.09003, 569.2399, 370.23004);
        ((GeneralPath) shape).curveTo(564.0399, 380.79004, 559.2899, 391.58005, 553.86993, 402.03003);
        ((GeneralPath) shape).curveTo(558.30994, 404.04004, 563.43994, 400.81003, 568.1099, 401.03003);
        ((GeneralPath) shape).curveTo(567.24994, 402.21002, 565.5899, 402.10004, 564.3399, 402.53003);
        ((GeneralPath) shape).curveTo(559.6499, 403.48004, 554.9599, 404.46002, 550.2399, 405.24002);
        ((GeneralPath) shape).curveTo(553.57996, 393.99002, 558.6499, 383.32, 562.0999, 372.10004);
        ((GeneralPath) shape).curveTo(564.2199, 366.18002, 565.62994, 359.96002, 568.36993, 354.29004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB67451));
        g.fill(shape);

        // _0_0_185
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(493.63, 370.51);
        ((GeneralPath) shape).curveTo(495.2, 370.30002, 498.33002, 369.90002, 499.9, 369.7);
        ((GeneralPath) shape).curveTo(499.5, 371.01, 499.16, 372.38, 498.38, 373.53);
        ((GeneralPath) shape).curveTo(495.63, 374.98, 492.41, 374.99, 489.41, 375.47);
        ((GeneralPath) shape).curveTo(481.22, 376.21, 473.19, 378.08, 465.06, 379.16);
        ((GeneralPath) shape).lineTo(465.2, 378.33002);
        ((GeneralPath) shape).curveTo(469.21002, 376.44, 473.48, 375.19, 477.63, 373.61002);
        ((GeneralPath) shape).curveTo(482.69, 371.39, 488.24, 371.27002, 493.63, 370.51);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB1714F));
        g.fill(shape);

        // _0_0_186
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(468.62, 382.44);
        ((GeneralPath) shape).lineTo(472.9, 381.9);
        ((GeneralPath) shape).curveTo(473.46, 383.47, 471.03, 383.71, 470.04, 384.18);
        ((GeneralPath) shape).curveTo(460.46002, 385.81, 451.89, 391.12, 442.19, 392.13998);
        ((GeneralPath) shape).curveTo(442.33002, 390.18997, 442.63, 388.13998, 443.78, 386.49997);
        ((GeneralPath) shape).curveTo(452.13998, 385.64996, 460.4, 384.17996, 468.62, 382.43997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCE845B));
        g.fill(shape);

        // _0_0_187
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(483.81, 385.84);
        ((GeneralPath) shape).curveTo(487.38, 384.53, 490.73, 381.69998, 494.74, 382.13998);
        ((GeneralPath) shape).curveTo(494.52, 388.15997, 490.97998, 393.49997, 489.13, 399.13998);
        ((GeneralPath) shape).curveTo(487.99, 398.31998, 487.44, 396.90997, 486.2, 396.21);
        ((GeneralPath) shape).curveTo(481.66, 395.66, 477.15002, 396.47, 472.65002, 396.78998);
        ((GeneralPath) shape).curveTo(467.23, 397.24, 461.77002, 396.59998, 456.38004, 397.13998);
        ((GeneralPath) shape).curveTo(455.01004, 397.56, 454.57004, 398.43997, 455.04004, 399.75998);
        ((GeneralPath) shape).curveTo(455.37003, 401.62997, 458.89005, 401.55, 457.78003, 403.88998);
        ((GeneralPath) shape).curveTo(456.26004, 404.34, 454.69003, 404.62, 453.13004, 404.86);
        ((GeneralPath) shape).curveTo(453.36005, 402.62997, 453.56003, 400.4, 453.71002, 398.18);
        ((GeneralPath) shape).curveTo(449.48, 398.5, 445.30002, 399.19998, 441.14, 400.0);
        ((GeneralPath) shape).lineTo(441.24002, 399.18);
        ((GeneralPath) shape).curveTo(446.16003, 397.58, 451.39, 397.1, 456.28003, 395.33);
        ((GeneralPath) shape).curveTo(465.46002, 392.16998, 475.08002, 390.22, 483.81003, 385.84);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB67451));
        g.fill(shape);

        // _0_0_188
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(347.34, 387.54);
        ((GeneralPath) shape).curveTo(354.05, 387.47, 360.83, 388.48, 367.27, 390.38);
        ((GeneralPath) shape).lineTo(366.53998, 390.92);
        ((GeneralPath) shape).curveTo(358.40997, 389.97, 350.18, 389.55002, 342.00998, 390.24002);
        ((GeneralPath) shape).curveTo(335.55997, 391.80002, 329.65, 394.87003, 323.75998, 397.82);
        ((GeneralPath) shape).curveTo(329.62997, 390.94, 338.72998, 388.58002, 347.33997, 387.54);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA0A0A0));
        g.fill(shape);

        // _0_0_189
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(367.27, 390.38);
        ((GeneralPath) shape).curveTo(373.16, 389.05002, 379.19998, 390.04, 384.59998, 392.55002);
        ((GeneralPath) shape).curveTo(387.42996, 394.34003, 392.21997, 393.71002, 394.02997, 396.95);
        ((GeneralPath) shape).curveTo(385.17996, 393.38, 375.17996, 394.99002, 366.53998, 390.92);
        ((GeneralPath) shape).lineTo(367.27, 390.38);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF805D8));
        g.fill(shape);

        // _0_0_190
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(394.03, 396.95);
        ((GeneralPath) shape).curveTo(398.79, 398.26, 402.29, 402.2, 404.6, 406.41);
        ((GeneralPath) shape).curveTo(408.78, 415.09, 411.41, 425.15, 408.96, 434.71);
        ((GeneralPath) shape).curveTo(407.49, 441.33, 403.56, 446.97, 401.08, 453.19);
        ((GeneralPath) shape).curveTo(401.15997, 453.59, 401.31998, 454.4, 401.38998, 454.8);
        ((GeneralPath) shape).curveTo(404.78998, 455.36, 408.21997, 455.74, 411.66998, 455.94);
        ((GeneralPath) shape).curveTo(414.96, 453.39, 411.96997, 447.45, 415.03998, 445.1);
        ((GeneralPath) shape).curveTo(414.41998, 449.30002, 414.30997, 453.64, 413.11996, 457.75);
        ((GeneralPath) shape).curveTo(408.14996, 457.2, 403.16995, 456.57, 398.18997, 456.12);
        ((GeneralPath) shape).curveTo(398.53998, 453.05, 400.58997, 450.58, 401.96997, 447.93);
        ((GeneralPath) shape).curveTo(405.28998, 441.85, 408.73996, 435.22998, 408.16998, 428.08);
        ((GeneralPath) shape).curveTo(408.56998, 420.63998, 406.74, 413.22998, 403.24, 406.69998);
        ((GeneralPath) shape).curveTo(400.87, 402.86, 397.24, 400.05, 394.03, 396.94998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8F898A));
        g.fill(shape);

        // _0_0_191
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(342.28, 401.29);
        ((GeneralPath) shape).curveTo(348.71, 398.43002, 356.06, 397.28, 362.91, 399.34);
        ((GeneralPath) shape).lineTo(362.49, 400.13);
        ((GeneralPath) shape).curveTo(358.94998, 400.08002, 355.43, 400.16, 351.91998, 400.38);
        ((GeneralPath) shape).curveTo(347.3, 407.03, 344.18997, 414.59, 340.99997, 422.0);
        ((GeneralPath) shape).curveTo(338.67996, 427.01, 337.53998, 432.6, 338.30997, 438.13);
        ((GeneralPath) shape).curveTo(339.46997, 441.05002, 341.72998, 443.37, 342.93997, 446.27002);
        ((GeneralPath) shape).curveTo(343.64996, 448.29, 343.77997, 450.66003, 342.77997, 452.61002);
        ((GeneralPath) shape).curveTo(340.95996, 455.24002, 338.76996, 457.58002, 336.88995, 460.17);
        ((GeneralPath) shape).curveTo(338.51996, 460.81003, 341.77997, 462.1, 343.40994, 462.74002);
        ((GeneralPath) shape).curveTo(347.77994, 462.61002, 351.97995, 461.38004, 356.14993, 460.2);
        ((GeneralPath) shape).curveTo(363.35992, 458.17, 370.67993, 456.59003, 377.96994, 454.89);
        ((GeneralPath) shape).curveTo(377.15994, 456.66, 375.02994, 457.04, 373.34995, 457.56003);
        ((GeneralPath) shape).curveTo(366.09995, 459.24002, 358.75995, 460.60004, 351.59995, 462.67);
        ((GeneralPath) shape).curveTo(348.07996, 463.52002, 344.23996, 464.79, 340.72995, 463.40002);
        ((GeneralPath) shape).curveTo(336.06995, 461.87003, 332.41995, 458.40002, 329.37994, 454.68002);
        ((GeneralPath) shape).curveTo(327.34995, 452.18002, 324.74994, 449.68002, 324.51996, 446.26);
        ((GeneralPath) shape).curveTo(323.77997, 438.12, 323.62994, 429.91, 324.28995, 421.77002);
        ((GeneralPath) shape).curveTo(326.01996, 417.59003, 328.69995, 413.87003, 331.00995, 410.00003);
        ((GeneralPath) shape).curveTo(333.43994, 405.67004, 337.97995, 403.35004, 342.27994, 401.29004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD400B8));
        g.fill(shape);

        // _0_0_192
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(441.14, 400.0);
        ((GeneralPath) shape).curveTo(445.30002, 399.2, 449.48, 398.5, 453.71002, 398.18);
        ((GeneralPath) shape).curveTo(453.56003, 400.4, 453.36002, 402.63, 453.13004, 404.86);
        ((GeneralPath) shape).curveTo(448.36005, 407.75, 442.80005, 409.46997, 437.27005, 410.06);
        ((GeneralPath) shape).curveTo(437.74005, 406.86, 438.48004, 403.68, 439.65005, 400.66998);
        ((GeneralPath) shape).curveTo(440.02005, 400.49997, 440.77005, 400.16998, 441.14005, 399.99997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDC8C61));
        g.fill(shape);

        // _0_0_193
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(314.77, 408.76);
        ((GeneralPath) shape).curveTo(317.06998, 405.24002, 319.00998, 401.02002, 322.93, 398.99002);
        ((GeneralPath) shape).curveTo(319.55, 404.66003, 314.93, 409.75003, 313.08, 416.2);
        ((GeneralPath) shape).curveTo(310.37, 423.88, 310.53998, 432.08002, 311.16998, 440.08002);
        ((GeneralPath) shape).curveTo(311.71997, 446.79, 314.93, 452.78003, 316.90997, 459.11002);
        ((GeneralPath) shape).curveTo(313.99997, 456.24002, 312.90997, 452.17, 311.56998, 448.43002);
        ((GeneralPath) shape).curveTo(307.87997, 435.40002, 307.97998, 420.80002, 314.77, 408.76);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E8E8E));
        g.fill(shape);

        // _0_0_194
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(351.92, 400.38);
        ((GeneralPath) shape).curveTo(355.43002, 400.16, 358.95, 400.08002, 362.49002, 400.13);
        ((GeneralPath) shape).curveTo(367.55002, 401.16, 374.29, 399.63, 378.13004, 404.01);
        ((GeneralPath) shape).curveTo(382.97003, 409.22, 387.47003, 414.77002, 391.65002, 420.53);
        ((GeneralPath) shape).curveTo(394.02002, 423.75, 392.56003, 428.16, 393.09003, 431.83);
        ((GeneralPath) shape).curveTo(393.75003, 438.37, 389.65002, 444.06998, 385.76004, 448.86);
        ((GeneralPath) shape).curveTo(383.49005, 451.18997, 381.26004, 454.00998, 377.97003, 454.88998);
        ((GeneralPath) shape).curveTo(370.68002, 456.59, 363.36005, 458.16998, 356.15002, 460.19998);
        ((GeneralPath) shape).curveTo(351.98, 461.37997, 347.78003, 462.61, 343.41003, 462.74);
        ((GeneralPath) shape).curveTo(341.78003, 462.09998, 338.52002, 460.81, 336.89005, 460.16998);
        ((GeneralPath) shape).curveTo(338.77005, 457.58, 340.96005, 455.24, 342.78006, 452.61);
        ((GeneralPath) shape).curveTo(343.78006, 450.65997, 343.65005, 448.28998, 342.94006, 446.27);
        ((GeneralPath) shape).curveTo(341.73007, 443.37, 339.47006, 441.05, 338.31006, 438.12997);
        ((GeneralPath) shape).curveTo(337.54007, 432.59998, 338.68005, 427.00998, 341.00006, 421.99997);
        ((GeneralPath) shape).curveTo(344.19006, 414.58997, 347.30005, 407.02997, 351.92007, 400.37997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF00DE));
        g.fill(shape);

        // _0_0_195
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(482.9, 404.02);
        ((GeneralPath) shape).curveTo(484.38, 402.88998, 486.22998, 402.43, 488.00998, 402.00998);
        ((GeneralPath) shape).curveTo(483.52, 416.47998, 479.22998, 431.05997, 473.86, 445.22998);
        ((GeneralPath) shape).curveTo(472.9, 444.02, 471.93, 442.83, 471.18, 441.49997);
        ((GeneralPath) shape).curveTo(470.72, 438.87997, 472.19998, 436.29996, 472.78998, 433.88998);
        ((GeneralPath) shape).curveTo(476.21, 423.94998, 479.44998, 413.94998, 482.89996, 404.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCDC8C5));
        g.fill(shape);

        // _0_0_196
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(598.5, 403.36);
        ((GeneralPath) shape).curveTo(599.57, 403.13998, 600.67, 403.03998, 601.78, 403.06998);
        ((GeneralPath) shape).curveTo(601.85004, 406.52, 600.11005, 409.71997, 598.54004, 412.69998);
        ((GeneralPath) shape).curveTo(589.57007, 414.80997, 580.30005, 415.30997, 571.31006, 417.28998);
        ((GeneralPath) shape).curveTo(563.31006, 418.93997, 555.24005, 420.33, 547.10004, 421.03998);
        ((GeneralPath) shape).curveTo(546.44006, 419.27, 548.02, 417.78998, 549.62006, 417.39996);
        ((GeneralPath) shape).curveTo(562.79004, 414.34998, 575.93005, 411.04996, 588.78, 406.80997);
        ((GeneralPath) shape).curveTo(592.04004, 405.73996, 595.14, 404.14996, 598.5, 403.35995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD88A5F));
        g.fill(shape);

        // _0_0_197
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(448.86, 415.82);
        ((GeneralPath) shape).curveTo(460.37997, 412.41, 471.18, 406.74002, 482.9, 404.02002);
        ((GeneralPath) shape).curveTo(479.44998, 413.95, 476.21, 423.95, 472.79, 433.89);
        ((GeneralPath) shape).curveTo(472.2, 436.30002, 470.72, 438.88, 471.18002, 441.5);
        ((GeneralPath) shape).curveTo(471.93002, 442.83, 472.90002, 444.02, 473.86002, 445.23);
        ((GeneralPath) shape).curveTo(471.58002, 454.27002, 467.22, 462.67, 464.67, 471.64);
        ((GeneralPath) shape).curveTo(463.31003, 474.80002, 462.45, 478.59003, 460.0, 481.02002);
        ((GeneralPath) shape).curveTo(456.7, 479.09003, 454.0, 476.31003, 450.99, 473.99002);
        ((GeneralPath) shape).curveTo(445.99, 470.18002, 440.69, 466.72003, 435.02, 463.99002);
        ((GeneralPath) shape).curveTo(430.66, 461.90002, 425.78, 461.29, 421.19, 459.96002);
        ((GeneralPath) shape).lineTo(421.14, 459.14);
        ((GeneralPath) shape).curveTo(422.23, 459.15002, 423.31003, 459.14, 424.41, 459.1);
        ((GeneralPath) shape).curveTo(424.4, 456.30002, 422.71, 454.0, 421.17, 451.83002);
        ((GeneralPath) shape).curveTo(422.84003, 449.14, 424.13, 446.25003, 425.12003, 443.24002);
        ((GeneralPath) shape).lineTo(425.89, 443.12003);
        ((GeneralPath) shape).curveTo(426.24002, 445.64, 427.85, 446.40002, 430.71002, 445.40002);
        ((GeneralPath) shape).curveTo(435.18002, 445.17, 439.39, 446.82004, 443.68002, 447.78003);
        ((GeneralPath) shape).curveTo(444.76, 446.66003, 445.62003, 445.31003, 446.05002, 443.81003);
        ((GeneralPath) shape).curveTo(448.46002, 435.14, 449.39, 426.16003, 450.19003, 417.23004);
        ((GeneralPath) shape).curveTo(447.10004, 417.74005, 444.08005, 418.53003, 441.01004, 419.11005);
        ((GeneralPath) shape).curveTo(442.97003, 416.93005, 446.42004, 417.08005, 448.86005, 415.82004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB97652));
        g.fill(shape);

        // _0_0_198
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(615.99, 419.05);
        ((GeneralPath) shape).curveTo(617.61, 414.84998, 619.83, 410.94, 622.0, 407.00998);
        ((GeneralPath) shape).curveTo(621.21, 409.75998, 620.32, 412.49, 619.24, 415.15);
        ((GeneralPath) shape).curveTo(609.95, 436.91998, 601.22, 458.97, 590.06, 479.87);
        ((GeneralPath) shape).curveTo(589.77997, 480.12, 589.23, 480.62, 588.95, 480.87);
        ((GeneralPath) shape).curveTo(590.78, 473.74, 595.02, 467.58, 597.95, 460.91);
        ((GeneralPath) shape).curveTo(604.25, 447.08002, 610.38, 433.17, 615.99, 419.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x898989));
        g.fill(shape);

        // _0_0_199
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(441.01, 419.11);
        ((GeneralPath) shape).curveTo(444.08002, 418.53, 447.1, 417.74, 450.19, 417.22998);
        ((GeneralPath) shape).curveTo(449.39, 426.15997, 448.46, 435.13998, 446.05, 443.80997);
        ((GeneralPath) shape).curveTo(445.62, 445.30997, 444.75998, 446.65997, 443.68, 447.77997);
        ((GeneralPath) shape).curveTo(439.38998, 446.81998, 435.18, 445.16998, 430.71, 445.39996);
        ((GeneralPath) shape).curveTo(427.85, 446.39996, 426.24, 445.63995, 425.88998, 443.11996);
        ((GeneralPath) shape).curveTo(427.65997, 436.52997, 430.40997, 430.22995, 432.66998, 423.79996);
        ((GeneralPath) shape).curveTo(433.63998, 420.15994, 437.97998, 419.91995, 441.00998, 419.10995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDF8E62));
        g.fill(shape);

        // _0_0_200
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(593.5, 419.38);
        ((GeneralPath) shape).curveTo(594.08, 419.26, 595.25, 419.01, 595.84, 418.88);
        ((GeneralPath) shape).curveTo(595.47003, 421.80002, 594.19, 424.61002, 592.23004, 426.81);
        ((GeneralPath) shape).curveTo(581.42004, 426.66, 570.93005, 429.65, 560.18005, 430.02);
        ((GeneralPath) shape).curveTo(560.18005, 429.59, 560.2001, 428.71, 560.2101, 428.28);
        ((GeneralPath) shape).curveTo(571.5901, 426.5, 582.56006, 422.91, 593.50006, 419.38);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD2865D));
        g.fill(shape);

        // _0_0_201
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(419.09, 422.0);
        ((GeneralPath) shape).curveTo(419.54, 422.43, 420.43, 423.28, 420.87, 423.71);
        ((GeneralPath) shape).curveTo(421.0, 430.18, 418.22, 436.09, 415.93, 441.97);
        ((GeneralPath) shape).curveTo(417.49, 435.39, 418.53, 428.73, 419.09, 422.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA48675));
        g.fill(shape);

        // _0_0_202
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(557.17, 442.99);
        ((GeneralPath) shape).curveTo(567.51, 439.63998, 578.06, 436.66, 588.81, 434.91);
        ((GeneralPath) shape).curveTo(588.11, 438.96, 585.48, 442.25, 583.93, 445.97);
        ((GeneralPath) shape).curveTo(576.02, 463.36, 568.33997, 480.87, 560.1, 498.12);
        ((GeneralPath) shape).curveTo(557.83997, 502.8, 556.94995, 508.11, 554.11, 512.52);
        ((GeneralPath) shape).curveTo(547.58997, 513.43, 540.88, 512.92004, 534.44, 514.48004);
        ((GeneralPath) shape).curveTo(530.25, 515.62006, 525.86, 515.45, 521.69, 516.61005);
        ((GeneralPath) shape).curveTo(516.81, 518.11005, 511.77, 519.00006, 506.74, 519.80005);
        ((GeneralPath) shape).curveTo(508.93, 514.75006, 510.52, 509.46005, 512.25, 504.24005);
        ((GeneralPath) shape).curveTo(513.63, 499.90005, 516.15, 495.71005, 515.52, 490.99005);
        ((GeneralPath) shape).curveTo(515.71, 488.32004, 517.87, 486.25006, 518.94, 483.89005);
        ((GeneralPath) shape).curveTo(522.33, 478.72003, 523.18, 472.41003, 526.19, 467.09006);
        ((GeneralPath) shape).curveTo(533.19, 464.71005, 540.4, 462.88007, 547.36, 460.36005);
        ((GeneralPath) shape).curveTo(552.29, 458.57004, 557.88, 457.10004, 560.87, 452.38004);
        ((GeneralPath) shape).lineTo(560.99, 448.61005);
        ((GeneralPath) shape).curveTo(560.02997, 447.21005, 558.13, 444.40005, 557.17, 442.99005);
        ((GeneralPath) shape).moveTo(555.42, 467.25006);
        ((GeneralPath) shape).curveTo(552.27997, 468.54007, 548.47, 471.45007, 550.33997, 475.48007);
        ((GeneralPath) shape).curveTo(550.77997, 479.22006, 555.25995, 480.50006, 558.44995, 479.81006);
        ((GeneralPath) shape).curveTo(561.18994, 478.06006, 564.3599, 474.30005, 562.12994, 471.01007);
        ((GeneralPath) shape).curveTo(560.8499, 468.75006, 558.12994, 466.53006, 555.4199, 467.25006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDF8E62));
        g.fill(shape);

        // _0_0_203
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(538.73, 437.1);
        ((GeneralPath) shape).curveTo(540.94, 437.03, 545.37, 436.89, 547.57996, 436.82);
        ((GeneralPath) shape).curveTo(547.92, 439.27002, 545.92993, 441.37, 545.95996, 443.81);
        ((GeneralPath) shape).curveTo(546.93994, 445.27, 548.08997, 446.61, 549.05, 448.11);
        ((GeneralPath) shape).curveTo(543.83997, 450.0, 538.63, 452.21, 533.08997, 452.9);
        ((GeneralPath) shape).curveTo(533.81995, 447.34, 536.05994, 441.97998, 538.73, 437.1);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB8C60));
        g.fill(shape);

        // _0_0_204
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(517.06, 439.11);
        ((GeneralPath) shape).lineTo(517.94, 439.28998);
        ((GeneralPath) shape).curveTo(518.18, 442.93997, 518.71, 446.55997, 519.04, 450.21997);
        ((GeneralPath) shape).curveTo(518.1, 454.26996, 516.5, 458.12997, 514.99, 462.00998);
        ((GeneralPath) shape).curveTo(511.38998, 470.83997, 507.97, 479.74, 504.69, 488.68997);
        ((GeneralPath) shape).curveTo(501.04, 498.62997, 496.72, 508.31998, 493.24, 518.32996);
        ((GeneralPath) shape).curveTo(493.16998, 516.25995, 493.38, 514.18994, 494.03998, 512.2399);
        ((GeneralPath) shape).curveTo(496.39996, 505.01993, 499.12997, 497.93994, 501.86, 490.86993);
        ((GeneralPath) shape).curveTo(505.9, 480.25995, 509.65, 469.53995, 514.13, 459.09995);
        ((GeneralPath) shape).curveTo(514.93, 456.87994, 516.12, 454.77994, 516.49, 452.42993);
        ((GeneralPath) shape).curveTo(516.66, 447.99994, 515.81, 443.44992, 517.06, 439.10992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9E9B99));
        g.fill(shape);

        // _0_0_205
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(701.26, 457.26);
        ((GeneralPath) shape).curveTo(708.59, 451.43002, 717.66003, 447.16, 727.18, 447.05002);
        ((GeneralPath) shape).curveTo(733.26, 446.00003, 738.81, 449.16, 743.82, 452.12003);
        ((GeneralPath) shape).curveTo(747.97003, 455.90002, 750.11, 461.52002, 750.0, 467.10004);
        ((GeneralPath) shape).curveTo(750.52, 472.43002, 748.16, 477.34003, 745.94, 481.99005);
        ((GeneralPath) shape).curveTo(741.02, 491.86005, 733.14, 499.74005, 725.92, 507.91006);
        ((GeneralPath) shape).curveTo(721.41, 512.73004, 717.31, 518.0301, 711.88, 521.88007);
        ((GeneralPath) shape).curveTo(723.51, 506.55008, 739.75, 494.40005, 747.17, 476.14008);
        ((GeneralPath) shape).curveTo(750.61, 468.54007, 749.1, 458.67007, 742.75, 453.04007);
        ((GeneralPath) shape).curveTo(737.31, 449.33008, 730.39, 447.32007, 723.86, 448.70007);
        ((GeneralPath) shape).curveTo(715.14996, 449.64008, 707.43, 454.39008, 700.74, 459.76007);
        ((GeneralPath) shape).curveTo(691.82, 467.92007, 683.83997, 477.12006, 677.33, 487.32007);
        ((GeneralPath) shape).curveTo(668.11005, 501.02008, 659.81, 515.31006, 651.69, 529.68005);
        ((GeneralPath) shape).curveTo(640.13, 549.3901, 626.89, 568.03, 613.58, 586.57007);
        ((GeneralPath) shape).curveTo(602.53, 600.81006, 592.73004, 615.94006, 583.28, 631.2801);
        ((GeneralPath) shape).curveTo(574.98004, 643.4601, 567.37006, 656.0801, 559.92004, 668.8001);
        ((GeneralPath) shape).curveTo(558.71, 670.95013, 557.29004, 672.9701, 555.85004, 674.9701);
        ((GeneralPath) shape).curveTo(556.96, 671.2801, 558.38007, 667.6701, 560.38007, 664.3701);
        ((GeneralPath) shape).curveTo(568.42004, 651.4301, 576.04004, 638.2301, 584.67004, 625.6701);
        ((GeneralPath) shape).curveTo(596.17004, 606.5601, 609.92004, 588.9801, 622.89, 570.89014);
        ((GeneralPath) shape).curveTo(630.22003, 559.90015, 638.24, 549.3701, 644.99, 537.9901);
        ((GeneralPath) shape).curveTo(654.99, 522.1701, 663.61, 505.5201, 673.83997, 489.84012);
        ((GeneralPath) shape).curveTo(677.81995, 484.16013, 680.97, 477.85013, 685.8, 472.8001);
        ((GeneralPath) shape).curveTo(690.83997, 467.5101, 696.01, 462.34012, 701.26, 457.2601);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8F8F8F));
        g.fill(shape);

        // _0_0_206
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(417.1, 458.06);
        ((GeneralPath) shape).curveTo(417.03, 455.38998, 419.15, 453.28, 421.17, 451.83);
        ((GeneralPath) shape).curveTo(422.71002, 454.0, 424.40002, 456.3, 424.41, 459.09998);
        ((GeneralPath) shape).curveTo(423.31, 459.13998, 422.23, 459.14996, 421.14, 459.13998);
        ((GeneralPath) shape).curveTo(419.73, 459.06998, 418.35, 458.66998, 417.1, 458.06);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCAC5C2));
        g.fill(shape);

        // _0_0_207
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(318.86, 462.1);
        ((GeneralPath) shape).curveTo(322.12997, 464.5, 325.21997, 467.14, 327.78998, 470.31);
        ((GeneralPath) shape).curveTo(327.77, 470.66998, 327.71997, 471.38998, 327.69998, 471.75);
        ((GeneralPath) shape).curveTo(320.50998, 475.61, 312.84998, 478.58, 305.90997, 482.9);
        ((GeneralPath) shape).curveTo(298.27997, 487.61, 290.59998, 492.25, 283.02997, 497.04);
        ((GeneralPath) shape).curveTo(284.93997, 493.94, 288.40997, 492.32, 291.28998, 490.27002);
        ((GeneralPath) shape).curveTo(302.53998, 483.93002, 312.50998, 475.26, 324.77997, 470.81003);
        ((GeneralPath) shape).curveTo(324.77997, 470.44003, 324.76996, 469.71002, 324.75998, 469.34003);
        ((GeneralPath) shape).curveTo(322.77997, 466.94003, 319.99997, 465.10004, 318.86, 462.10004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAE7F80));
        g.fill(shape);

        // _0_0_208
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(709.43, 473.44);
        ((GeneralPath) shape).curveTo(714.48, 469.27, 719.95, 464.19, 727.11, 465.09);
        ((GeneralPath) shape).lineTo(731.6, 465.33);
        ((GeneralPath) shape).curveTo(732.8, 469.43997, 731.49, 473.74, 728.85, 476.93);
        ((GeneralPath) shape).curveTo(725.13, 481.53, 721.74, 486.4, 717.94, 490.94998);
        ((GeneralPath) shape).curveTo(705.23, 505.28998, 693.05, 520.07996, 680.85, 534.85);
        ((GeneralPath) shape).curveTo(672.70996, 544.97, 665.51996, 555.82996, 659.12, 567.12);
        ((GeneralPath) shape).curveTo(650.99, 581.49, 640.58, 594.36, 629.85, 606.83);
        ((GeneralPath) shape).curveTo(627.49, 609.17004, 625.17, 611.57, 623.45996, 614.44);
        ((GeneralPath) shape).curveTo(621.12994, 618.37, 617.19995, 620.9, 614.61, 624.61);
        ((GeneralPath) shape).curveTo(607.38, 633.05, 600.76, 642.04, 592.85, 649.86);
        ((GeneralPath) shape).curveTo(591.07996, 651.81, 590.24, 654.47, 588.25995, 656.23);
        ((GeneralPath) shape).curveTo(586.77997, 657.11, 585.25995, 657.94, 583.69995, 658.68);
        ((GeneralPath) shape).curveTo(584.61993, 655.56, 586.01996, 652.6, 587.88995, 649.94);
        ((GeneralPath) shape).curveTo(597.11993, 636.05, 607.92993, 623.33, 618.3599, 610.36);
        ((GeneralPath) shape).curveTo(629.2199, 596.95, 637.94995, 582.01996, 648.1099, 568.11);
        ((GeneralPath) shape).curveTo(656.2099, 557.06, 663.9699, 545.76, 670.99994, 534.0);
        ((GeneralPath) shape).curveTo(680.8499, 517.13, 693.77997, 501.82, 700.0499, 483.09);
        ((GeneralPath) shape).curveTo(702.4899, 479.3, 706.0899, 476.41998, 709.42993, 473.44);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFEFEFE));
        g.fill(shape);

        // _0_0_209
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(555.42, 467.25);
        ((GeneralPath) shape).curveTo(558.13, 466.53, 560.85, 468.75, 562.13, 471.01);
        ((GeneralPath) shape).curveTo(564.36, 474.30002, 561.19, 478.06, 558.45, 479.81);
        ((GeneralPath) shape).curveTo(555.26, 480.5, 550.78, 479.22, 550.34, 475.48);
        ((GeneralPath) shape).curveTo(548.47003, 471.45, 552.28, 468.54, 555.42004, 467.25);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF7E1D6));
        g.fill(shape);

        // _0_0_210
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(376.38, 471.55);
        ((GeneralPath) shape).curveTo(379.97, 470.03998, 383.16, 467.08, 387.44, 468.06);
        ((GeneralPath) shape).curveTo(395.66, 467.99, 403.93, 467.49, 412.12, 468.27);
        ((GeneralPath) shape).curveTo(411.24, 470.86, 412.21, 473.66998, 413.02, 476.13998);
        ((GeneralPath) shape).curveTo(414.52, 481.43997, 416.44998, 486.72998, 419.59, 491.31);
        ((GeneralPath) shape).curveTo(423.35, 492.53, 427.61, 490.45, 431.41998, 491.83);
        ((GeneralPath) shape).curveTo(426.08, 491.96, 420.56, 492.47998, 415.61, 494.59998);
        ((GeneralPath) shape).curveTo(409.05, 500.56998, 407.91998, 511.49, 412.99, 518.68);
        ((GeneralPath) shape).curveTo(420.83, 527.11, 433.03, 530.06, 444.16998, 528.81);
        ((GeneralPath) shape).curveTo(447.12997, 528.18, 449.71997, 525.79, 450.34998, 522.8);
        ((GeneralPath) shape).curveTo(451.02, 519.27997, 451.05997, 515.56, 450.38998, 512.07);
        ((GeneralPath) shape).curveTo(448.78998, 508.15, 446.49, 504.57, 444.12, 501.08002);
        ((GeneralPath) shape).curveTo(448.79, 499.57, 453.12, 496.01, 458.25, 496.53003);
        ((GeneralPath) shape).curveTo(461.6, 499.74002, 463.62, 503.98004, 466.26, 507.75003);
        ((GeneralPath) shape).curveTo(470.28, 513.72003, 475.38, 519.19, 477.92, 526.04004);
        ((GeneralPath) shape).curveTo(480.05002, 532.25006, 483.43002, 537.92004, 486.03, 543.94006);
        ((GeneralPath) shape).curveTo(487.35, 547.29004, 485.63, 550.87006, 485.2, 554.19006);
        ((GeneralPath) shape).curveTo(482.92, 563.1401, 482.69, 572.56006, 479.30002, 581.24005);
        ((GeneralPath) shape).curveTo(476.23, 588.55005, 471.68002, 595.30005, 470.06003, 603.17004);
        ((GeneralPath) shape).curveTo(467.39, 611.62006, 467.72003, 620.69006, 469.76004, 629.24005);
        ((GeneralPath) shape).curveTo(465.50003, 628.8901, 461.26004, 628.3901, 457.02005, 627.97003);
        ((GeneralPath) shape).curveTo(452.40005, 627.05005, 447.33005, 627.29004, 443.15005, 624.93005);
        ((GeneralPath) shape).curveTo(438.81006, 621.57007, 433.15005, 620.4501, 427.76004, 621.2001);
        ((GeneralPath) shape).curveTo(425.52005, 621.7301, 423.50003, 622.8901, 421.41003, 623.81006);
        ((GeneralPath) shape).curveTo(415.83005, 624.5101, 409.97003, 623.17004, 404.66003, 625.62006);
        ((GeneralPath) shape).curveTo(399.64005, 627.3901, 394.68002, 629.44006, 390.00003, 631.98004);
        ((GeneralPath) shape).curveTo(388.32004, 632.92004, 386.68002, 633.94006, 384.96002, 634.81006);
        ((GeneralPath) shape).curveTo(380.41003, 627.62006, 376.98, 619.41003, 370.31003, 613.8401);
        ((GeneralPath) shape).curveTo(368.15002, 611.81006, 365.66003, 610.1501, 363.78003, 607.8601);
        ((GeneralPath) shape).curveTo(362.12003, 600.4001, 362.15002, 592.64014, 359.85004, 585.3101);
        ((GeneralPath) shape).curveTo(357.61005, 578.7801, 353.87003, 572.8201, 349.11005, 567.84015);
        ((GeneralPath) shape).curveTo(348.13004, 566.29016, 346.14005, 565.0701, 346.01004, 563.10016);
        ((GeneralPath) shape).curveTo(347.54004, 558.8102, 350.61005, 554.89014, 349.89005, 550.03015);
        ((GeneralPath) shape).curveTo(350.40005, 544.9302, 347.70004, 540.1301, 343.86005, 537.01013);
        ((GeneralPath) shape).curveTo(341.02005, 534.84015, 337.37006, 534.29016, 334.17004, 532.85016);
        ((GeneralPath) shape).curveTo(334.19003, 532.48016, 334.23004, 531.73016, 334.25003, 531.36017);
        ((GeneralPath) shape).curveTo(340.81003, 526.58014, 348.93002, 523.59015, 354.09003, 517.10016);
        ((GeneralPath) shape).curveTo(357.42, 512.8802, 357.14, 507.01016, 356.48004, 502.00015);
        ((GeneralPath) shape).curveTo(354.87006, 498.04016, 351.43005, 495.08014, 349.95004, 491.05014);
        ((GeneralPath) shape).curveTo(354.05005, 486.90015, 357.47003, 482.18015, 359.98004, 476.91013);
        ((GeneralPath) shape).curveTo(365.40005, 474.9901, 371.09003, 473.83014, 376.38004, 471.55014);
        ((GeneralPath) shape).moveTo(390.80005, 513.64014);
        ((GeneralPath) shape).curveTo(387.33005, 514.51013, 384.07004, 516.1301, 380.88004, 517.6901);
        ((GeneralPath) shape).curveTo(377.39005, 520.0601, 376.00003, 524.4901, 374.99002, 528.3701);
        ((GeneralPath) shape).curveTo(375.17, 532.40015, 373.87003, 537.5701, 377.23, 540.70013);
        ((GeneralPath) shape).curveTo(378.66, 542.83014, 381.36002, 542.58014, 383.6, 542.8801);
        ((GeneralPath) shape).curveTo(383.57, 543.4901, 383.51, 544.70013, 383.48, 545.3101);
        ((GeneralPath) shape).curveTo(388.97, 545.3001, 394.45, 545.01013, 399.93002, 544.51013);
        ((GeneralPath) shape).curveTo(402.57004, 543.4401, 405.41003, 541.91016, 406.85004, 539.35016);
        ((GeneralPath) shape).curveTo(408.33005, 531.0602, 402.95004, 523.6902, 398.96002, 516.95013);
        ((GeneralPath) shape).curveTo(397.81003, 513.53015, 394.08002, 511.85013, 390.80002, 513.64014);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF68385));
        g.fill(shape);

        // _0_0_211
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(413.02, 476.14);
        ((GeneralPath) shape).curveTo(412.21, 473.67, 411.24, 470.86002, 412.12, 468.27002);
        ((GeneralPath) shape).curveTo(420.82, 470.21002, 429.47998, 473.01, 436.88998, 478.13);
        ((GeneralPath) shape).curveTo(444.62997, 483.41, 452.77, 488.75, 458.25, 496.53);
        ((GeneralPath) shape).curveTo(453.12, 496.01, 448.79, 499.57, 444.12, 501.08);
        ((GeneralPath) shape).curveTo(440.15, 497.68997, 436.38998, 493.74, 431.41998, 491.83);
        ((GeneralPath) shape).curveTo(427.61, 490.44998, 423.34998, 492.53, 419.59, 491.31);
        ((GeneralPath) shape).curveTo(416.44998, 486.73, 414.52, 481.44, 413.02, 476.13998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCC6D6F));
        g.fill(shape);

        // _0_0_212
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(145.56, 473.19);
        ((GeneralPath) shape).curveTo(151.31999, 473.03, 157.20999, 471.88, 162.92, 473.09);
        ((GeneralPath) shape).lineTo(162.87, 474.03);
        ((GeneralPath) shape).curveTo(156.94, 474.03, 151.01999, 473.96, 145.09999, 473.98);
        ((GeneralPath) shape).lineTo(145.56, 473.19);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF7F81));
        g.fill(shape);

        // _0_0_213
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(134.56, 478.64);
        ((GeneralPath) shape).curveTo(137.84, 476.73, 141.09999, 473.96002, 145.09999, 473.98);
        ((GeneralPath) shape).curveTo(151.01999, 473.96002, 156.93999, 474.03, 162.87, 474.03);
        ((GeneralPath) shape).curveTo(164.76999, 473.97, 166.90999, 474.25, 168.09999, 475.94);
        ((GeneralPath) shape).curveTo(170.87999, 479.12, 173.49998, 482.61002, 177.15999, 484.85);
        ((GeneralPath) shape).curveTo(181.48, 487.82, 185.96999, 490.57, 189.99998, 493.95);
        ((GeneralPath) shape).curveTo(192.06999, 495.89, 194.09999, 497.90002, 196.17998, 499.86002);
        ((GeneralPath) shape).curveTo(198.14998, 501.40002, 199.50998, 503.49002, 199.99998, 505.95);
        ((GeneralPath) shape).curveTo(196.28998, 501.80002, 191.43999, 498.96002, 186.46999, 496.57);
        ((GeneralPath) shape).curveTo(179.71999, 492.61002, 174.11998, 486.01, 166.07999, 484.62);
        ((GeneralPath) shape).curveTo(157.05998, 483.43, 147.13998, 483.25, 139.04999, 488.04);
        ((GeneralPath) shape).curveTo(128.27998, 493.97, 120.70999, 504.07, 114.34999, 514.32);
        ((GeneralPath) shape).curveTo(109.71999, 523.61, 109.04999, 534.48, 110.78999, 544.58);
        ((GeneralPath) shape).curveTo(110.84999, 549.63, 114.909996, 552.88, 118.45, 555.71);
        ((GeneralPath) shape).curveTo(123.34, 559.85004, 129.86, 561.13, 135.86, 562.82);
        ((GeneralPath) shape).curveTo(135.92, 563.98, 135.39, 564.71, 134.25, 565.01);
        ((GeneralPath) shape).curveTo(129.86, 562.13, 124.729996, 560.82, 119.78, 559.25);
        ((GeneralPath) shape).curveTo(118.17, 558.66, 116.92, 557.43, 115.78, 556.2);
        ((GeneralPath) shape).curveTo(110.659996, 550.92, 106.82, 544.58, 104.659996, 537.55);
        ((GeneralPath) shape).curveTo(104.28999, 536.23, 104.74, 534.87, 104.899994, 533.57);
        ((GeneralPath) shape).curveTo(105.81999, 528.3, 106.35999, 522.99, 107.659996, 517.81);
        ((GeneralPath) shape).curveTo(109.17, 513.39, 111.45, 509.3, 112.95, 504.88998);
        ((GeneralPath) shape).curveTo(117.659996, 494.49, 125.42, 485.43, 134.56, 478.63998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFE0005));
        g.fill(shape);

        // _0_0_214
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(168.1, 475.94);
        ((GeneralPath) shape).curveTo(171.81001, 478.07, 175.41, 480.83002, 177.16, 484.85);
        ((GeneralPath) shape).curveTo(173.5, 482.61002, 170.88, 479.12, 168.1, 475.94);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF7F81));
        g.fill(shape);

        // _0_0_215
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(344.94, 477.41);
        ((GeneralPath) shape).curveTo(349.93, 476.94, 354.95, 476.77, 359.98, 476.91);
        ((GeneralPath) shape).curveTo(357.47, 482.18, 354.05002, 486.9, 349.95, 491.05002);
        ((GeneralPath) shape).curveTo(351.43002, 495.08002, 354.87003, 498.04, 356.48, 502.00003);
        ((GeneralPath) shape).curveTo(357.14, 507.01004, 357.42, 512.88, 354.09, 517.10004);
        ((GeneralPath) shape).curveTo(348.93, 523.59, 340.81, 526.58, 334.25, 531.36005);
        ((GeneralPath) shape).curveTo(334.23, 531.73004, 334.19, 532.48004, 334.17, 532.85004);
        ((GeneralPath) shape).curveTo(337.37003, 534.29004, 341.02002, 534.84, 343.86002, 537.01);
        ((GeneralPath) shape).curveTo(347.7, 540.13, 350.40002, 544.93, 349.89, 550.03);
        ((GeneralPath) shape).curveTo(350.61002, 554.89, 347.54, 558.81006, 346.01, 563.10004);
        ((GeneralPath) shape).curveTo(346.14, 565.07, 348.13, 566.29004, 349.11002, 567.84);
        ((GeneralPath) shape).curveTo(353.87003, 572.82, 357.61002, 578.78, 359.85, 585.31);
        ((GeneralPath) shape).curveTo(362.15, 592.64, 362.12, 600.4, 363.78, 607.86);
        ((GeneralPath) shape).curveTo(365.66, 610.14996, 368.15, 611.81, 370.31, 613.83997);
        ((GeneralPath) shape).curveTo(376.98, 619.41, 380.41, 627.62, 384.96, 634.80994);
        ((GeneralPath) shape).curveTo(386.68, 633.93994, 388.31998, 632.9199, 390.0, 631.9799);
        ((GeneralPath) shape).curveTo(385.35, 636.2399, 381.88, 641.42993, 378.8, 646.87994);
        ((GeneralPath) shape).curveTo(376.91998, 647.26996, 376.69, 645.17993, 376.03, 643.97);
        ((GeneralPath) shape).curveTo(372.23, 634.56995, 367.35, 625.62994, 361.93, 617.07996);
        ((GeneralPath) shape).curveTo(353.49, 605.67, 343.82, 595.23, 333.91, 585.08997);
        ((GeneralPath) shape).curveTo(322.57, 573.49994, 308.46, 565.14996, 294.06, 557.94995);
        ((GeneralPath) shape).curveTo(283.22, 552.23, 271.01, 550.22, 259.41, 546.6099);
        ((GeneralPath) shape).curveTo(258.46, 545.0999, 259.77, 543.7199, 260.39, 542.3999);
        ((GeneralPath) shape).curveTo(263.07, 537.6699, 264.82, 532.4599, 267.94, 527.9799);
        ((GeneralPath) shape).curveTo(272.12, 521.62994, 277.58002, 516.12994, 283.85, 511.8499);
        ((GeneralPath) shape).curveTo(291.01, 506.6499, 297.48, 500.3999, 305.5, 496.48993);
        ((GeneralPath) shape).curveTo(314.94, 492.14993, 323.43, 485.95993, 333.12, 482.13992);
        ((GeneralPath) shape).curveTo(337.08, 480.6299, 340.88, 478.67993, 344.94, 477.4099);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCC6D6F));
        g.fill(shape);

        // _0_0_216
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(584.81, 488.91);
        ((GeneralPath) shape).curveTo(585.3, 486.66, 586.39, 484.62, 587.89, 482.88);
        ((GeneralPath) shape).curveTo(587.4, 485.07, 586.96, 487.72, 584.81, 488.91);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7E7E7E));
        g.fill(shape);

        // _0_0_217
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(693.98, 490.01);
        ((GeneralPath) shape).curveTo(695.85, 487.59, 697.47, 484.84, 700.05, 483.09);
        ((GeneralPath) shape).curveTo(693.77997, 501.82, 680.85, 517.13, 671.0, 534.0);
        ((GeneralPath) shape).curveTo(663.97, 545.76, 656.21, 557.06, 648.11, 568.11);
        ((GeneralPath) shape).curveTo(637.95, 582.01996, 629.22, 596.95, 618.36, 610.36);
        ((GeneralPath) shape).curveTo(607.93, 623.32996, 597.12, 636.05, 587.89, 649.94);
        ((GeneralPath) shape).curveTo(586.02, 652.6, 584.62, 655.56, 583.7, 658.68);
        ((GeneralPath) shape).curveTo(585.26, 657.94, 586.78, 657.11, 588.26, 656.23);
        ((GeneralPath) shape).curveTo(585.68, 659.94995, 582.85004, 663.48, 579.91003, 666.91);
        ((GeneralPath) shape).curveTo(572.60004, 675.49, 567.00006, 685.31, 560.73004, 694.62994);
        ((GeneralPath) shape).curveTo(559.91003, 695.30994, 559.42004, 697.26996, 558.09, 696.77997);
        ((GeneralPath) shape).curveTo(556.5, 693.07996, 555.17004, 688.3, 557.66003, 684.72);
        ((GeneralPath) shape).curveTo(566.75006, 670.13995, 575.49005, 655.32996, 585.03, 641.02997);
        ((GeneralPath) shape).curveTo(594.39, 626.63995, 606.26, 614.12, 616.01, 600.01996);
        ((GeneralPath) shape).curveTo(631.77, 578.9899, 647.78, 558.11993, 662.04004, 536.04);
        ((GeneralPath) shape).curveTo(672.10004, 520.29, 683.02, 505.12997, 693.98004, 490.00998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD3D3D3));
        g.fill(shape);

        // _0_0_218
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(515.52, 490.99);
        ((GeneralPath) shape).curveTo(516.15, 495.71, 513.63, 499.9, 512.25, 504.24);
        ((GeneralPath) shape).curveTo(510.52, 509.46, 508.93, 514.75, 506.74, 519.8);
        ((GeneralPath) shape).lineTo(506.16, 520.36);
        ((GeneralPath) shape).curveTo(504.99, 520.62, 502.65, 521.13, 501.47, 521.38);
        ((GeneralPath) shape).curveTo(503.69, 514.35, 506.89, 507.7, 509.95, 501.02002);
        ((GeneralPath) shape).curveTo(511.61002, 497.57, 513.11, 493.99002, 515.52, 490.99002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCC8C7));
        g.fill(shape);

        // _0_0_219
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(575.52, 507.51);
        ((GeneralPath) shape).curveTo(577.94, 501.81, 580.87, 496.36002, 584.02, 491.04);
        ((GeneralPath) shape).curveTo(581.54004, 499.88, 576.35004, 507.6, 573.17004, 516.17);
        ((GeneralPath) shape).curveTo(564.54004, 536.23, 556.47003, 556.52997, 549.10004, 577.08997);
        ((GeneralPath) shape).curveTo(544.99005, 587.64996, 540.97003, 598.24, 536.93005, 608.81995);
        ((GeneralPath) shape).curveTo(536.38007, 609.87994, 536.18005, 611.4199, 534.92004, 611.89996);
        ((GeneralPath) shape).curveTo(536.11005, 606.23, 538.35004, 600.87994, 540.59, 595.55994);
        ((GeneralPath) shape).curveTo(547.82, 577.0499, 554.32, 558.24994, 561.86005, 539.8599);
        ((GeneralPath) shape).curveTo(566.08, 528.92993, 570.91003, 518.2699, 575.52, 507.50992);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x898989));
        g.fill(shape);

        // _0_0_220
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(415.61, 494.6);
        ((GeneralPath) shape).curveTo(420.56, 492.48, 426.08, 491.96, 431.41998, 491.83002);
        ((GeneralPath) shape).curveTo(436.38998, 493.74002, 440.15, 497.69, 444.12, 501.08002);
        ((GeneralPath) shape).curveTo(446.49, 504.57, 448.79, 508.15002, 450.38998, 512.07);
        ((GeneralPath) shape).curveTo(451.06, 515.56, 451.02, 519.28, 450.34998, 522.8);
        ((GeneralPath) shape).curveTo(449.71997, 525.79, 447.12997, 528.18, 444.16998, 528.81);
        ((GeneralPath) shape).curveTo(433.02997, 530.06, 420.83, 527.11, 412.99, 518.68);
        ((GeneralPath) shape).curveTo(407.91998, 511.49, 409.05, 500.57, 415.61, 494.6);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFDE0E1));
        g.fill(shape);

        // _0_0_221
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(147.42, 495.5);
        ((GeneralPath) shape).curveTo(155.17, 493.37, 163.97, 493.28, 171.17, 497.21);
        ((GeneralPath) shape).curveTo(172.67, 500.53998, 171.0, 504.86, 173.87, 507.85);
        ((GeneralPath) shape).curveTo(178.29999, 514.66003, 187.06999, 516.21, 193.81, 519.77);
        ((GeneralPath) shape).lineTo(193.83, 523.79004);
        ((GeneralPath) shape).curveTo(193.38, 525.73004, 192.5, 529.59, 192.05, 531.52);
        ((GeneralPath) shape).curveTo(187.26001, 537.06, 180.33, 539.85004, 173.83, 542.79004);
        ((GeneralPath) shape).curveTo(169.05, 544.86005, 164.8, 547.98004, 159.91, 549.79004);
        ((GeneralPath) shape).curveTo(156.2, 551.17004, 152.68001, 553.4, 148.51001, 552.96);
        ((GeneralPath) shape).curveTo(142.53001, 552.95, 136.46, 553.65, 130.53001, 552.72003);
        ((GeneralPath) shape).curveTo(127.33002, 551.05005, 123.51002, 549.27, 121.83002, 545.9);
        ((GeneralPath) shape).curveTo(121.91002, 544.15, 120.66002, 541.64, 123.250015, 540.96);
        ((GeneralPath) shape).curveTo(129.68001, 536.14, 133.63002, 528.93, 139.29001, 523.34);
        ((GeneralPath) shape).curveTo(143.27, 518.96, 148.16, 514.85004, 150.32, 509.2);
        ((GeneralPath) shape).curveTo(152.45001, 504.01, 146.88, 500.46002, 147.42001, 495.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF0005));
        g.fill(shape);

        // _0_0_222
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(190.0, 493.95);
        ((GeneralPath) shape).curveTo(192.78, 495.04, 194.92, 497.17, 196.18, 499.86002);
        ((GeneralPath) shape).curveTo(194.09999, 497.90002, 192.06999, 495.89, 190.0, 493.95);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFC8E90));
        g.fill(shape);

        // _0_0_223
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(124.67, 517.61);
        ((GeneralPath) shape).curveTo(130.06999, 508.38998, 137.6, 500.08, 147.42, 495.5);
        ((GeneralPath) shape).curveTo(146.88, 500.46, 152.45, 504.01, 150.31999, 509.2);
        ((GeneralPath) shape).curveTo(148.15999, 514.85004, 143.26999, 518.96, 139.29, 523.34);
        ((GeneralPath) shape).curveTo(133.62999, 528.93005, 129.68, 536.14, 123.24999, 540.96);
        ((GeneralPath) shape).curveTo(120.659996, 541.64, 121.909996, 544.15, 121.829994, 545.9);
        ((GeneralPath) shape).lineTo(121.06999, 545.77);
        ((GeneralPath) shape).curveTo(119.60999, 542.08, 120.079994, 537.94, 119.939995, 534.10004);
        ((GeneralPath) shape).curveTo(119.49999, 528.18005, 121.95999, 522.68005, 124.67, 517.61005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD40005));
        g.fill(shape);

        // _0_0_224
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(273.28, 504.29);
        ((GeneralPath) shape).curveTo(276.34, 501.66, 279.13, 498.45, 283.03, 497.04);
        ((GeneralPath) shape).curveTo(279.03, 501.71002, 273.93, 505.26, 269.72, 509.73);
        ((GeneralPath) shape).curveTo(263.39, 516.34, 257.22, 523.55, 254.04001, 532.27);
        ((GeneralPath) shape).curveTo(252.82, 536.13, 253.43001, 540.26, 252.95001, 544.24);
        ((GeneralPath) shape).curveTo(246.53001, 544.7, 240.29001, 542.69, 233.87001, 542.93);
        ((GeneralPath) shape).curveTo(222.79001, 542.72, 211.64001, 542.87, 200.69, 544.77);
        ((GeneralPath) shape).curveTo(195.81, 545.48004, 191.0, 546.64, 186.09, 547.16003);
        ((GeneralPath) shape).curveTo(189.56, 543.50006, 194.81, 542.01, 197.84, 537.80005);
        ((GeneralPath) shape).curveTo(204.2, 528.59, 204.51, 516.03, 200.0, 505.95004);
        ((GeneralPath) shape).curveTo(203.53, 508.39005, 204.13, 513.35004, 204.72, 517.27);
        ((GeneralPath) shape).curveTo(204.92, 522.82, 203.49, 528.37, 201.71, 533.59);
        ((GeneralPath) shape).curveTo(200.35, 537.92004, 196.06001, 540.31, 194.02, 544.24005);
        ((GeneralPath) shape).curveTo(208.63, 542.67004, 223.37001, 539.4501, 238.06, 541.96);
        ((GeneralPath) shape).curveTo(242.56, 542.19, 247.23, 543.78, 251.7, 542.56);
        ((GeneralPath) shape).curveTo(252.0, 537.18, 251.92, 531.55, 254.84999, 526.79);
        ((GeneralPath) shape).curveTo(259.34998, 518.08997, 266.19, 510.91998, 273.28, 504.28998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x888584));
        g.fill(shape);

        // _0_0_225
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(107.07, 515.3);
        ((GeneralPath) shape).curveTo(108.58, 511.62997, 109.78, 507.50998, 112.95, 504.88998);
        ((GeneralPath) shape).curveTo(111.45, 509.3, 109.17, 513.39, 107.659996, 517.81);
        ((GeneralPath) shape).curveTo(106.35999, 522.99, 105.82, 528.3, 104.899994, 533.57);
        ((GeneralPath) shape).curveTo(105.09, 527.44, 104.67999, 521.11, 107.06999, 515.3);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF7D7F));
        g.fill(shape);

        // _0_0_226
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(480.0, 507.0);
        ((GeneralPath) shape).curveTo(484.84, 511.25, 486.83, 517.73, 490.14, 523.08);
        ((GeneralPath) shape).curveTo(492.6, 523.15, 491.38, 519.92004, 493.14, 519.16003);
        ((GeneralPath) shape).curveTo(492.73, 521.42004, 493.47, 524.91003, 490.26, 525.09);
        ((GeneralPath) shape).curveTo(486.44, 519.32, 482.67, 513.41003, 480.0, 507.00003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8C8C8C));
        g.fill(shape);

        // _0_0_227
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(390.8, 513.64);
        ((GeneralPath) shape).curveTo(394.08, 511.85, 397.81, 513.53, 398.96, 516.95);
        ((GeneralPath) shape).curveTo(402.94998, 523.69, 408.33, 531.06, 406.85, 539.35004);
        ((GeneralPath) shape).curveTo(405.41, 541.91003, 402.57, 543.44006, 399.93, 544.51);
        ((GeneralPath) shape).curveTo(394.44998, 545.01, 388.97, 545.3, 383.47998, 545.31);
        ((GeneralPath) shape).curveTo(383.50998, 544.7, 383.56998, 543.49, 383.59998, 542.88);
        ((GeneralPath) shape).curveTo(381.36, 542.58, 378.65997, 542.83, 377.22998, 540.7);
        ((GeneralPath) shape).curveTo(373.87, 537.57, 375.16998, 532.4, 374.99, 528.37);
        ((GeneralPath) shape).curveTo(376.0, 524.49, 377.38998, 520.06, 380.88, 517.69);
        ((GeneralPath) shape).curveTo(384.07, 516.13, 387.33002, 514.51, 390.80002, 513.64);
        ((GeneralPath) shape).moveTo(385.68002, 522.25);
        ((GeneralPath) shape).lineTo(384.88004, 522.38);
        ((GeneralPath) shape).curveTo(381.78003, 525.77, 380.00003, 530.56, 381.16003, 535.17);
        ((GeneralPath) shape).curveTo(382.34003, 537.64996, 384.80005, 539.63995, 387.56003, 539.99);
        ((GeneralPath) shape).curveTo(391.28003, 539.93, 395.34003, 540.42, 398.84003, 538.82);
        ((GeneralPath) shape).curveTo(398.87003, 538.41003, 398.93002, 537.61, 398.96002, 537.21);
        ((GeneralPath) shape).curveTo(396.14, 532.19, 393.03003, 527.33, 390.48, 522.16003);
        ((GeneralPath) shape).curveTo(389.28, 522.19006, 386.88, 522.23004, 385.68002, 522.25006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x020101));
        g.fill(shape);

        // _0_0_228
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(385.68, 522.25);
        ((GeneralPath) shape).curveTo(386.88, 522.23, 389.28, 522.19, 390.47998, 522.16);
        ((GeneralPath) shape).curveTo(393.02997, 527.32996, 396.13998, 532.19, 398.96, 537.20996);
        ((GeneralPath) shape).curveTo(398.93, 537.61, 398.87, 538.41, 398.84, 538.81995);
        ((GeneralPath) shape).curveTo(395.34, 540.4199, 391.28, 539.92993, 387.56, 539.9899);
        ((GeneralPath) shape).curveTo(384.8, 539.63995, 382.34, 537.6499, 381.16, 535.1699);
        ((GeneralPath) shape).curveTo(380.0, 530.55994, 381.78, 525.7699, 384.88, 522.37994);
        ((GeneralPath) shape).lineTo(385.68, 522.24994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF58284));
        g.fill(shape);

        // _0_0_229
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(547.74, 522.2);
        ((GeneralPath) shape).curveTo(548.18, 522.13, 549.05, 521.97003, 549.49, 521.89);
        ((GeneralPath) shape).curveTo(550.08997, 523.49, 548.93, 525.03, 548.48, 526.51);
        ((GeneralPath) shape).curveTo(546.95996, 529.81, 546.0, 533.37, 544.19, 536.53);
        ((GeneralPath) shape).curveTo(529.17, 537.95, 513.71, 537.32, 499.11, 541.82);
        ((GeneralPath) shape).curveTo(497.58, 540.35004, 496.02, 538.43, 496.18997, 536.19);
        ((GeneralPath) shape).curveTo(513.0, 530.24, 530.35, 526.06, 547.74, 522.2);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB8C61));
        g.fill(shape);

        // _0_0_230
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(695.93, 540.93);
        ((GeneralPath) shape).curveTo(700.08, 534.27, 705.1, 528.2, 710.95, 522.96);
        ((GeneralPath) shape).curveTo(706.76, 529.55005, 701.74, 535.69, 695.93, 540.93);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E8E8E));
        g.fill(shape);

        // _0_0_231
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(477.92, 526.04);
        ((GeneralPath) shape).curveTo(480.53, 527.89996, 481.48, 531.29, 483.06003, 533.98);
        ((GeneralPath) shape).curveTo(485.05002, 538.06, 487.03003, 542.17, 488.64, 546.42);
        ((GeneralPath) shape).curveTo(490.39, 550.86, 489.35, 555.77997, 490.17, 560.41);
        ((GeneralPath) shape).curveTo(491.37003, 561.18, 492.64, 561.85, 493.85, 562.63995);
        ((GeneralPath) shape).curveTo(493.76, 566.56995, 492.89, 570.4899, 493.05002, 574.44995);
        ((GeneralPath) shape).curveTo(494.37003, 576.72, 497.44003, 577.44995, 498.51, 579.8599);
        ((GeneralPath) shape).curveTo(500.08002, 588.6499, 503.26, 597.17993, 503.1, 606.2299);
        ((GeneralPath) shape).curveTo(503.28, 616.8599, 503.15, 628.4099, 497.52002, 637.80994);
        ((GeneralPath) shape).curveTo(493.49002, 637.80994, 489.77002, 636.19995, 486.01, 635.0299);
        ((GeneralPath) shape).curveTo(476.75, 631.7499, 466.91, 630.7199, 457.34, 628.7799);
        ((GeneralPath) shape).lineTo(457.02, 627.9699);
        ((GeneralPath) shape).curveTo(461.25998, 628.3899, 465.5, 628.8899, 469.75998, 629.2399);
        ((GeneralPath) shape).curveTo(467.71997, 620.68994, 467.38998, 611.61993, 470.05997, 603.1699);
        ((GeneralPath) shape).curveTo(471.67996, 595.2999, 476.22998, 588.5499, 479.29996, 581.2399);
        ((GeneralPath) shape).curveTo(482.68997, 572.55994, 482.91995, 563.13995, 485.19995, 554.18994);
        ((GeneralPath) shape).curveTo(485.62994, 550.86993, 487.34995, 547.2899, 486.02994, 543.93994);
        ((GeneralPath) shape).curveTo(483.42993, 537.9199, 480.04993, 532.24994, 477.91995, 526.0399);
        ((GeneralPath) shape).moveTo(500.39996, 599.80994);
        ((GeneralPath) shape).curveTo(492.07996, 609.30994, 489.76996, 622.30994, 489.24997, 634.51996);
        ((GeneralPath) shape).curveTo(491.63998, 635.67, 494.19998, 636.47, 496.82996, 636.86993);
        ((GeneralPath) shape).curveTo(499.73996, 629.4799, 502.33997, 621.56995, 501.25995, 613.5399);
        ((GeneralPath) shape).curveTo(500.91995, 608.9799, 501.57996, 604.1599, 500.39996, 599.80994);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCC6D6F));
        g.fill(shape);

        // _0_0_232
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(104.66, 537.55);
        ((GeneralPath) shape).curveTo(106.82001, 544.58, 110.66, 550.92, 115.78001, 556.2);
        ((GeneralPath) shape).curveTo(109.05, 552.47003, 104.91, 545.18, 104.66, 537.55);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF97D7F));
        g.fill(shape);

        // _0_0_233
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(672.92, 567.92);
        ((GeneralPath) shape).curveTo(680.45, 559.42, 686.86, 549.95996, 695.01, 542.01996);
        ((GeneralPath) shape).curveTo(692.89, 545.4899, 690.7, 548.92993, 688.0, 551.9899);
        ((GeneralPath) shape).curveTo(682.35, 558.67993, 676.93, 565.56995, 671.15, 572.1499);
        ((GeneralPath) shape).curveTo(664.68005, 579.4599, 659.46, 587.7599, 653.54004, 595.4999);
        ((GeneralPath) shape).curveTo(652.52, 596.8699, 651.21, 597.98987, 649.79004, 598.9399);
        ((GeneralPath) shape).curveTo(651.4, 596.2099, 653.01, 593.4699, 655.00006, 590.9999);
        ((GeneralPath) shape).curveTo(660.79004, 583.15985, 666.3901, 575.15985, 672.92004, 567.91986);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x878787));
        g.fill(shape);

        // _0_0_234
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(529.62, 557.53);
        ((GeneralPath) shape).curveTo(531.17, 557.35004, 534.26, 556.97003, 535.8, 556.78);
        ((GeneralPath) shape).curveTo(534.01, 563.61005, 530.95996, 570.01, 528.69, 576.69);
        ((GeneralPath) shape).curveTo(526.6, 582.81, 524.0, 588.74, 521.82, 594.82);
        ((GeneralPath) shape).curveTo(519.82, 600.52, 516.92, 605.89, 515.7, 611.85004);
        ((GeneralPath) shape).curveTo(515.24, 611.81006, 514.33, 611.74005, 513.87, 611.7);
        ((GeneralPath) shape).curveTo(513.88, 608.10004, 513.9, 600.91003, 513.91, 597.32);
        ((GeneralPath) shape).curveTo(513.6, 590.94, 510.50998, 584.81, 511.27997, 578.37);
        ((GeneralPath) shape).curveTo(515.86, 576.97, 521.16, 577.12, 524.88995, 573.75);
        ((GeneralPath) shape).curveTo(527.6099, 571.71, 528.07996, 566.95, 525.42, 564.72);
        ((GeneralPath) shape).curveTo(523.19, 562.49, 519.93, 562.0, 517.14996, 560.77997);
        ((GeneralPath) shape).curveTo(517.17, 560.37, 517.20996, 559.56, 517.23, 559.14996);
        ((GeneralPath) shape).curveTo(521.32, 558.36, 525.49, 558.08997, 529.62, 557.52997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDB8C61));
        g.fill(shape);

        // _0_0_235
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(119.78, 559.25);
        ((GeneralPath) shape).curveTo(124.729996, 560.82, 129.86, 562.13, 134.25, 565.01);
        ((GeneralPath) shape).curveTo(131.25, 566.47003, 128.13, 567.68, 125.09, 569.07);
        ((GeneralPath) shape).curveTo(126.979996, 567.47003, 128.97, 566.01, 131.06999, 564.7);
        ((GeneralPath) shape).curveTo(127.21999, 563.09, 123.119995, 561.85004, 119.77999, 559.25);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xC68283));
        g.fill(shape);

        // _0_0_236
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(200.47, 560.46);
        ((GeneralPath) shape).curveTo(204.56, 559.29004, 208.78, 558.52, 213.08, 558.87);
        ((GeneralPath) shape).curveTo(230.11, 558.97, 247.21, 558.7, 264.15, 560.77997);
        ((GeneralPath) shape).curveTo(269.44998, 561.22, 274.36, 563.24, 279.41, 564.73);
        ((GeneralPath) shape).curveTo(282.68, 565.70996, 286.15, 565.86, 289.42, 566.89996);
        ((GeneralPath) shape).curveTo(291.5, 569.18, 294.65002, 569.6, 297.45, 570.55);
        ((GeneralPath) shape).curveTo(300.49002, 571.58997, 303.30002, 573.18, 306.14, 574.68);
        ((GeneralPath) shape).curveTo(305.40002, 575.31, 304.71002, 575.99, 304.08002, 576.73);
        ((GeneralPath) shape).curveTo(306.65002, 578.89996, 309.55002, 580.67, 312.06003, 582.94995);
        ((GeneralPath) shape).curveTo(315.38004, 586.27997, 318.36002, 589.97, 321.78003, 593.23);
        ((GeneralPath) shape).curveTo(326.74002, 597.67, 332.37003, 601.26996, 337.87003, 605.01);
        ((GeneralPath) shape).curveTo(334.86002, 610.96, 333.52002, 618.8, 337.27002, 624.68);
        ((GeneralPath) shape).curveTo(341.14, 628.56, 346.92, 630.33997, 349.96002, 635.17);
        ((GeneralPath) shape).curveTo(352.94003, 639.66, 353.94003, 645.01, 356.10004, 649.86);
        ((GeneralPath) shape).curveTo(359.23004, 656.39996, 364.35004, 662.52997, 371.51004, 664.69);
        ((GeneralPath) shape).curveTo(372.50003, 673.87, 372.23004, 683.17, 371.88004, 692.4);
        ((GeneralPath) shape).curveTo(371.79004, 697.83, 369.02005, 702.60004, 367.74002, 707.77);
        ((GeneralPath) shape).curveTo(365.13004, 715.42004, 365.69003, 723.61005, 365.61002, 731.58);
        ((GeneralPath) shape).curveTo(366.32, 734.34, 369.06003, 735.68, 370.7, 737.82);
        ((GeneralPath) shape).curveTo(371.02002, 742.76, 369.08002, 747.44, 366.77002, 751.69);
        ((GeneralPath) shape).curveTo(365.52002, 754.2, 362.04, 754.0, 359.94003, 755.07);
        ((GeneralPath) shape).curveTo(350.19003, 757.62, 340.70004, 762.28, 333.80005, 769.79);
        ((GeneralPath) shape).curveTo(328.51004, 775.98, 326.55005, 784.12, 323.68005, 791.54);
        ((GeneralPath) shape).curveTo(321.23004, 796.66, 318.50006, 801.75995, 314.78006, 806.07996);
        ((GeneralPath) shape).curveTo(309.90005, 806.30994, 305.02005, 806.35, 300.14005, 806.18994);
        ((GeneralPath) shape).curveTo(293.71005, 804.93994, 287.42004, 802.5499, 280.77005, 802.95996);
        ((GeneralPath) shape).curveTo(269.57004, 802.69995, 258.39005, 803.33997, 247.20004, 803.13995);
        ((GeneralPath) shape).curveTo(243.78004, 801.88995, 239.29004, 800.00995, 238.46004, 796.04);
        ((GeneralPath) shape).curveTo(237.31004, 789.72, 237.80003, 783.14996, 236.13004, 776.94);
        ((GeneralPath) shape).curveTo(234.35004, 775.78, 231.82004, 775.56, 230.04004, 776.83);
        ((GeneralPath) shape).curveTo(228.13004, 779.05, 226.84004, 781.79004, 224.79004, 783.91003);
        ((GeneralPath) shape).curveTo(221.98004, 785.66003, 218.66003, 786.37006, 215.63004, 787.62006);
        ((GeneralPath) shape).curveTo(200.70004, 792.8301, 186.01004, 798.69006, 171.07004, 803.86005);
        ((GeneralPath) shape).curveTo(170.49004, 801.84, 169.11003, 799.97003, 166.77003, 800.2001);
        ((GeneralPath) shape).curveTo(158.67003, 800.93005, 150.83003, 803.61005, 142.67003, 804.0101);
        ((GeneralPath) shape).curveTo(138.11003, 803.38007, 133.12003, 804.4501, 128.83003, 802.44006);
        ((GeneralPath) shape).curveTo(125.520035, 800.2101, 122.39003, 797.73004, 119.61003, 794.88007);
        ((GeneralPath) shape).curveTo(118.67003, 791.0101, 119.08003, 786.93005, 118.90003, 783.0301);
        ((GeneralPath) shape).curveTo(124.06003, 784.0201, 129.21004, 785.0601, 134.24004, 786.5901);
        ((GeneralPath) shape).curveTo(139.58003, 788.2701, 144.11003, 792.63007, 150.08003, 791.9501);
        ((GeneralPath) shape).curveTo(159.41003, 792.0401, 168.43004, 784.6501, 169.52003, 775.25006);
        ((GeneralPath) shape).curveTo(171.12004, 768.9501, 168.76004, 762.16003, 164.35004, 757.61005);
        ((GeneralPath) shape).curveTo(160.08003, 753.29004, 153.77003, 752.41003, 148.63004, 749.57007);
        ((GeneralPath) shape).curveTo(145.32004, 747.07007, 143.10004, 743.30005, 139.48004, 741.2101);
        ((GeneralPath) shape).curveTo(133.78004, 739.1701, 127.65004, 739.63007, 121.780045, 738.57007);
        ((GeneralPath) shape).curveTo(121.600044, 738.2201, 121.24004, 737.5201, 121.06004, 737.17004);
        ((GeneralPath) shape).curveTo(122.850044, 732.98004, 126.02004, 729.30005, 126.62004, 724.68005);
        ((GeneralPath) shape).curveTo(126.96004, 720.5201, 124.91004, 716.61005, 123.11004, 713.0201);
        ((GeneralPath) shape).lineTo(119.91004, 710.87006);
        ((GeneralPath) shape).curveTo(116.52004, 707.92004, 111.73004, 709.2001, 108.05004, 707.2101);
        ((GeneralPath) shape).curveTo(110.710045, 702.5101, 114.77004, 698.63007, 116.56004, 693.4701);
        ((GeneralPath) shape).curveTo(118.06004, 689.0001, 119.80004, 684.1601, 117.62004, 679.5601);
        ((GeneralPath) shape).curveTo(116.48004, 675.76013, 113.56004, 672.95013, 111.40004, 669.7401);
        ((GeneralPath) shape).curveTo(113.16004, 665.70013, 116.53004, 662.64014, 119.11004, 659.1501);
        ((GeneralPath) shape).curveTo(125.16004, 651.1801, 132.31004, 644.0301, 137.36005, 635.3301);
        ((GeneralPath) shape).curveTo(139.36005, 632.0201, 139.98004, 628.0401, 139.96005, 624.2301);
        ((GeneralPath) shape).curveTo(139.86005, 620.26013, 136.03006, 617.2701, 136.24005, 613.3501);
        ((GeneralPath) shape).curveTo(142.91005, 606.9801, 150.04005, 601.0901, 156.23006, 594.2201);
        ((GeneralPath) shape).curveTo(162.03006, 588.2901, 166.92006, 581.4601, 173.29005, 576.1101);
        ((GeneralPath) shape).curveTo(177.12006, 573.3401, 182.00006, 573.3401, 186.15005, 571.3801);
        ((GeneralPath) shape).curveTo(188.37006, 569.65015, 189.01006, 566.66016, 190.61006, 564.4301);
        ((GeneralPath) shape).curveTo(194.03006, 562.8001, 197.95006, 562.7201, 201.57007, 561.70013);
        ((GeneralPath) shape).curveTo(201.29007, 561.39014, 200.74007, 560.77014, 200.47006, 560.46014);
        ((GeneralPath) shape).moveTo(243.12006, 577.0502);
        ((GeneralPath) shape).curveTo(237.57005, 578.85016, 234.15005, 584.5502, 233.06006, 590.02014);
        ((GeneralPath) shape).curveTo(233.32005, 598.3201, 239.06006, 605.17017, 246.00006, 609.0601);
        ((GeneralPath) shape).curveTo(257.75006, 616.08014, 270.58005, 621.83014, 280.46005, 631.5401);
        ((GeneralPath) shape).curveTo(286.63007, 638.9701, 290.70004, 647.9701, 292.84006, 657.3601);
        ((GeneralPath) shape).curveTo(294.18005, 666.6001, 293.71005, 675.9401, 293.63007, 685.2501);
        ((GeneralPath) shape).curveTo(293.52008, 686.65015, 292.90005, 687.9701, 292.67007, 689.3701);
        ((GeneralPath) shape).curveTo(289.58008, 688.5401, 286.3101, 689.0401, 283.22006, 689.65015);
        ((GeneralPath) shape).curveTo(283.69006, 692.0502, 283.07007, 694.33014, 282.18005, 696.5601);
        ((GeneralPath) shape).curveTo(280.77005, 698.5701, 282.32007, 702.4101, 284.92004, 702.0501);
        ((GeneralPath) shape).curveTo(288.25003, 702.9601, 290.86005, 700.8801, 293.39005, 699.2501);
        ((GeneralPath) shape).curveTo(292.02005, 704.3801, 293.22003, 709.9301, 293.40005, 715.1801);
        ((GeneralPath) shape).curveTo(295.64005, 724.0001, 302.95004, 731.6701, 312.15005, 732.9701);
        ((GeneralPath) shape).curveTo(319.37006, 733.57007, 326.30005, 730.2501, 331.66006, 725.6801);
        ((GeneralPath) shape).curveTo(334.11008, 723.2301, 335.46005, 719.9101, 336.90005, 716.83014);
        ((GeneralPath) shape).curveTo(339.11005, 711.79016, 337.71005, 706.09015, 337.39005, 700.86017);
        ((GeneralPath) shape).curveTo(335.01004, 689.33014, 335.55005, 677.47015, 334.25003, 665.8302);
        ((GeneralPath) shape).curveTo(332.42004, 654.6902, 330.77002, 643.3102, 325.97003, 632.9902);
        ((GeneralPath) shape).curveTo(320.39005, 617.7702, 309.13004, 605.35016, 296.76004, 595.22015);
        ((GeneralPath) shape).curveTo(284.82004, 587.03015, 272.25003, 579.29016, 258.25003, 575.21014);
        ((GeneralPath) shape).curveTo(253.15002, 574.72015, 247.95003, 575.3701, 243.12003, 577.0502);
        ((GeneralPath) shape).moveTo(218.84003, 604.1902);
        ((GeneralPath) shape).curveTo(217.67003, 604.91016, 217.12003, 606.2502, 216.35002, 607.3402);
        ((GeneralPath) shape).curveTo(213.91002, 611.4002, 210.51003, 615.2302, 210.04002, 620.1402);
        ((GeneralPath) shape).curveTo(209.43002, 625.8502, 212.62003, 630.8502, 215.68002, 635.3202);
        ((GeneralPath) shape).curveTo(218.66002, 638.0102, 223.19002, 639.7602, 227.14003, 638.2702);
        ((GeneralPath) shape).curveTo(233.26003, 636.4702, 236.53003, 630.1802, 238.92003, 624.7602);
        ((GeneralPath) shape).curveTo(240.86003, 619.8202, 240.77003, 613.2602, 236.41003, 609.61017);
        ((GeneralPath) shape).curveTo(231.84003, 605.27014, 225.12004, 603.02014, 218.84003, 604.1902);
        ((GeneralPath) shape).moveTo(146.51003, 651.79016);
        ((GeneralPath) shape).curveTo(143.77002, 653.2402, 145.11003, 656.4402, 146.43002, 658.28015);
        ((GeneralPath) shape).curveTo(145.08002, 659.1301, 143.66002, 659.86017, 142.17003, 660.4302);
        ((GeneralPath) shape).lineTo(142.41003, 661.23016);
        ((GeneralPath) shape).curveTo(141.78003, 661.3702, 140.53003, 661.65015, 139.90004, 661.78015);
        ((GeneralPath) shape).curveTo(140.92004, 664.09015, 141.60004, 667.28015, 145.65004, 665.6901);
        ((GeneralPath) shape).curveTo(149.89005, 666.0501, 155.15004, 666.9301, 158.30003, 663.3801);
        ((GeneralPath) shape).curveTo(162.51004, 660.47015, 163.98003, 652.7401, 159.21004, 649.6901);
        ((GeneralPath) shape).curveTo(155.19003, 647.3201, 149.31004, 647.5401, 146.51004, 651.7901);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6C283));
        g.fill(shape);

        // _0_0_237
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(177.69, 565.67);
        ((GeneralPath) shape).curveTo(185.21, 563.63995, 192.88, 562.20996, 200.47, 560.45996);
        ((GeneralPath) shape).curveTo(200.74, 560.76996, 201.29001, 561.38995, 201.57, 561.69995);
        ((GeneralPath) shape).curveTo(197.95001, 562.72, 194.03001, 562.7999, 190.61, 564.42993);
        ((GeneralPath) shape).curveTo(189.01, 566.6599, 188.37, 569.6499, 186.15, 571.37994);
        ((GeneralPath) shape).curveTo(182.0, 573.33997, 177.12, 573.33997, 173.29, 576.1099);
        ((GeneralPath) shape).curveTo(166.92, 581.4599, 162.03, 588.2899, 156.23, 594.2199);
        ((GeneralPath) shape).curveTo(150.04, 601.0899, 142.91, 606.9799, 136.23999, 613.3499);
        ((GeneralPath) shape).curveTo(136.02998, 617.2699, 139.85999, 620.2599, 139.95999, 624.2299);
        ((GeneralPath) shape).curveTo(139.98, 628.0399, 139.35999, 632.0199, 137.35999, 635.3299);
        ((GeneralPath) shape).curveTo(132.30998, 644.0299, 125.15999, 651.1799, 119.109985, 659.1499);
        ((GeneralPath) shape).curveTo(116.52998, 662.6399, 113.15999, 665.6999, 111.39999, 669.7399);
        ((GeneralPath) shape).curveTo(113.55999, 672.94995, 116.47999, 675.75995, 117.61999, 679.55994);
        ((GeneralPath) shape).curveTo(119.79999, 684.1599, 118.05999, 688.99994, 116.55999, 693.4699);
        ((GeneralPath) shape).curveTo(114.76999, 698.6299, 110.70999, 702.5099, 108.04999, 707.2099);
        ((GeneralPath) shape).curveTo(111.72999, 709.1999, 116.51999, 707.9199, 119.90999, 710.8699);
        ((GeneralPath) shape).lineTo(123.109985, 713.0199);
        ((GeneralPath) shape).curveTo(124.90999, 716.6099, 126.959984, 720.5199, 126.61999, 724.6799);
        ((GeneralPath) shape).curveTo(126.01999, 729.29987, 122.84999, 732.97986, 121.05999, 737.16986);
        ((GeneralPath) shape).curveTo(121.23999, 737.51984, 121.59999, 738.21985, 121.77999, 738.5699);
        ((GeneralPath) shape).curveTo(127.649994, 739.6299, 133.78, 739.16986, 139.48, 741.2099);
        ((GeneralPath) shape).curveTo(143.09999, 743.2999, 145.31999, 747.0699, 148.62999, 749.5699);
        ((GeneralPath) shape).curveTo(153.76999, 752.4099, 160.07999, 753.28986, 164.34999, 757.60986);
        ((GeneralPath) shape).curveTo(168.76, 762.15985, 171.12, 768.9499, 169.51999, 775.2499);
        ((GeneralPath) shape).curveTo(168.43, 784.6499, 159.40999, 792.03986, 150.07999, 791.9499);
        ((GeneralPath) shape).curveTo(144.10999, 792.6299, 139.57999, 788.2699, 134.23999, 786.5899);
        ((GeneralPath) shape).curveTo(129.20999, 785.0599, 124.05999, 784.0199, 118.899994, 783.0299);
        ((GeneralPath) shape).curveTo(118.619995, 775.9399, 121.56999, 769.42993, 124.229996, 763.05994);
        ((GeneralPath) shape).curveTo(124.99999, 760.9699, 126.119995, 758.7799, 125.56, 756.49994);
        ((GeneralPath) shape).curveTo(120.64, 755.1099, 118.25, 761.4799, 115.13, 763.9199);
        ((GeneralPath) shape).curveTo(114.439995, 762.0899, 113.52, 760.3599, 112.509995, 758.69995);
        ((GeneralPath) shape).curveTo(115.09, 758.26996, 117.60999, 757.45996, 120.149994, 756.83997);
        ((GeneralPath) shape).curveTo(119.98999, 755.42, 119.799995, 753.95996, 119.09, 752.69995);
        ((GeneralPath) shape).curveTo(114.329994, 751.06995, 109.229996, 751.1, 104.25, 751.04);
        ((GeneralPath) shape).curveTo(103.68, 749.69995, 103.13, 748.37, 102.47, 747.1);
        ((GeneralPath) shape).curveTo(94.19, 748.05, 86.14, 750.31, 77.96, 751.87);
        ((GeneralPath) shape).curveTo(74.18, 752.23, 70.46, 753.06, 66.74, 753.81);
        ((GeneralPath) shape).curveTo(66.29, 753.89, 65.39, 754.05, 64.939995, 754.13);
        ((GeneralPath) shape).curveTo(63.409996, 754.15, 61.879993, 754.11, 60.349995, 754.06);
        ((GeneralPath) shape).lineTo(60.009995, 753.23);
        ((GeneralPath) shape).curveTo(61.489994, 752.8, 63.779995, 753.1, 63.959995, 751.02997);
        ((GeneralPath) shape).curveTo(61.869995, 746.06995, 58.699997, 741.66, 56.149994, 736.94995);
        ((GeneralPath) shape).curveTo(54.199993, 733.30994, 51.629993, 729.72, 51.219994, 725.4899);
        ((GeneralPath) shape).curveTo(50.719994, 712.42993, 50.829994, 699.3499, 51.129993, 686.2999);
        ((GeneralPath) shape).curveTo(51.919994, 668.5299, 61.049995, 652.44995, 71.71999, 638.7299);
        ((GeneralPath) shape).curveTo(78.34999, 630.0799, 86.649994, 622.9799, 94.17999, 615.17993);
        ((GeneralPath) shape).curveTo(103.229996, 605.45996, 113.689995, 597.17993, 124.45, 589.43994);
        ((GeneralPath) shape).curveTo(140.70999, 578.55994, 159.1, 571.45996, 177.69, 565.6699);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCA16D));
        g.fill(shape);

        // _0_0_238
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(116.95, 574.05);
        ((GeneralPath) shape).curveTo(118.829994, 571.29, 121.95, 569.85, 125.09, 569.07);
        ((GeneralPath) shape).curveTo(122.74, 571.26, 120.06, 573.11, 116.95, 574.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x919191));
        g.fill(shape);

        // _0_0_239
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(243.12, 577.05);
        ((GeneralPath) shape).curveTo(247.95, 575.37, 253.15, 574.72, 258.25, 575.20996);
        ((GeneralPath) shape).curveTo(272.25, 579.29, 284.82, 587.02997, 296.76, 595.22);
        ((GeneralPath) shape).curveTo(309.13, 605.35, 320.39, 617.76996, 325.97, 632.99);
        ((GeneralPath) shape).curveTo(330.77, 643.31, 332.42, 654.69, 334.25, 665.83);
        ((GeneralPath) shape).curveTo(335.55, 677.47003, 335.01, 689.33, 337.39, 700.86);
        ((GeneralPath) shape).curveTo(337.71002, 706.08997, 339.11002, 711.79, 336.90002, 716.82996);
        ((GeneralPath) shape).curveTo(335.46002, 719.91, 334.11002, 723.23, 331.66003, 725.67993);
        ((GeneralPath) shape).curveTo(326.30005, 730.24994, 319.37003, 733.56995, 312.15002, 732.9699);
        ((GeneralPath) shape).curveTo(302.95, 731.6699, 295.64, 723.99994, 293.40002, 715.17993);
        ((GeneralPath) shape).curveTo(293.22003, 709.92993, 292.02002, 704.37994, 293.39, 699.24994);
        ((GeneralPath) shape).curveTo(294.18002, 697.0399, 295.28003, 694.6699, 295.1, 692.31995);
        ((GeneralPath) shape).curveTo(294.69, 691.05994, 293.51, 690.2999, 292.67, 689.36993);
        ((GeneralPath) shape).curveTo(292.90002, 687.9699, 293.52002, 686.64996, 293.63, 685.24994);
        ((GeneralPath) shape).curveTo(293.71, 675.93994, 294.18, 666.5999, 292.84, 657.3599);
        ((GeneralPath) shape).curveTo(290.69998, 647.9699, 286.63, 638.9699, 280.46, 631.5399);
        ((GeneralPath) shape).curveTo(270.58, 621.8299, 257.75, 616.0799, 246.0, 609.05994);
        ((GeneralPath) shape).curveTo(239.06, 605.1699, 233.32, 598.31995, 233.06, 590.01996);
        ((GeneralPath) shape).curveTo(234.15, 584.55, 237.56999, 578.85, 243.12, 577.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFDF0E0));
        g.fill(shape);

        // _0_0_240
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(304.08, 576.73);
        ((GeneralPath) shape).curveTo(304.71, 575.99, 305.4, 575.31, 306.13998, 574.68);
        ((GeneralPath) shape).curveTo(319.84998, 582.16, 331.62997, 592.83997, 341.40997, 604.96);
        ((GeneralPath) shape).curveTo(340.21997, 604.97003, 339.03998, 604.99005, 337.86996, 605.01);
        ((GeneralPath) shape).curveTo(332.36996, 601.27, 326.73996, 597.67, 321.77997, 593.23);
        ((GeneralPath) shape).curveTo(318.35995, 589.97, 315.37997, 586.27997, 312.05997, 582.94995);
        ((GeneralPath) shape).curveTo(309.54996, 580.6699, 306.64996, 578.89996, 304.07996, 576.73);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF38283));
        g.fill(shape);

        // _0_0_241
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(93.03, 592.01);
        ((GeneralPath) shape).curveTo(96.94, 587.53, 101.56, 583.54004, 106.95, 580.97003);
        ((GeneralPath) shape).curveTo(102.78, 585.22003, 98.24, 589.08, 93.03, 592.01);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x878787));
        g.fill(shape);

        // _0_0_242
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(81.75, 601.92);
        ((GeneralPath) shape).curveTo(84.97, 598.76996, 87.6, 594.63995, 91.96, 592.94);
        ((GeneralPath) shape).curveTo(89.29, 596.69, 85.89, 599.83, 81.75, 601.92);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7E7E7E));
        g.fill(shape);

        // _0_0_243
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(500.4, 599.81);
        ((GeneralPath) shape).curveTo(501.58, 604.16, 500.91998, 608.98, 501.25998, 613.54);
        ((GeneralPath) shape).curveTo(502.33997, 621.57, 499.74, 629.48, 496.83, 636.87);
        ((GeneralPath) shape).curveTo(494.19998, 636.47, 491.63998, 635.67, 489.25, 634.52);
        ((GeneralPath) shape).curveTo(489.77, 622.31, 492.08, 609.31, 500.4, 599.81);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF48384));
        g.fill(shape);

        // _0_0_244
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(645.83, 603.69);
        ((GeneralPath) shape).curveTo(646.45, 602.18, 647.51, 600.94, 648.82, 599.98);
        ((GeneralPath) shape).curveTo(649.96, 601.51, 647.55, 604.55, 645.83, 603.69);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x909090));
        g.fill(shape);

        // _0_0_245
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(218.84, 604.19);
        ((GeneralPath) shape).curveTo(225.12, 603.02, 231.84, 605.27, 236.41, 609.61);
        ((GeneralPath) shape).curveTo(240.77, 613.26, 240.86, 619.82, 238.92, 624.76);
        ((GeneralPath) shape).curveTo(236.53, 630.18, 233.26, 636.47003, 227.14, 638.27);
        ((GeneralPath) shape).curveTo(223.19, 639.76, 218.66, 638.01, 215.68, 635.32);
        ((GeneralPath) shape).curveTo(212.62, 630.85004, 209.43, 625.85004, 210.04, 620.14);
        ((GeneralPath) shape).curveTo(210.51, 615.23004, 213.90999, 611.4, 216.34999, 607.34);
        ((GeneralPath) shape).curveTo(217.12, 606.25, 217.67, 604.91003, 218.84, 604.19);
        ((GeneralPath) shape).moveTo(221.56, 611.36);
        ((GeneralPath) shape).curveTo(217.76, 612.02997, 215.93, 616.05, 215.48, 619.51);
        ((GeneralPath) shape).curveTo(214.59, 624.02, 216.86, 628.21, 219.19, 631.87);
        ((GeneralPath) shape).curveTo(221.46, 633.97, 225.55, 635.3, 227.84, 632.14);
        ((GeneralPath) shape).curveTo(231.94, 630.16003, 232.59, 625.37, 233.58, 621.53);
        ((GeneralPath) shape).curveTo(234.08, 619.76, 233.90001, 617.82, 232.87, 616.29004);
        ((GeneralPath) shape).curveTo(229.56999, 613.89, 226.2, 609.92004, 221.56, 611.36005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x040302));
        g.fill(shape);

        // _0_0_246
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(74.94, 608.74);
        ((GeneralPath) shape).curveTo(74.36, 607.0, 77.01, 604.33997, 78.75, 604.93);
        ((GeneralPath) shape).curveTo(78.1, 606.71, 76.75, 608.1, 74.94, 608.74);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9F9F9F));
        g.fill(shape);

        // _0_0_247
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(337.87, 605.01);
        ((GeneralPath) shape).curveTo(339.04, 604.99, 340.22, 604.97003, 341.41, 604.96);
        ((GeneralPath) shape).curveTo(351.62, 618.76, 362.48, 632.83, 367.46, 649.52);
        ((GeneralPath) shape).curveTo(369.12, 654.46, 371.06, 659.41003, 371.50998, 664.69);
        ((GeneralPath) shape).curveTo(364.34998, 662.53, 359.22998, 656.4, 356.09998, 649.86);
        ((GeneralPath) shape).curveTo(353.93997, 645.01, 352.93997, 639.66, 349.95996, 635.17);
        ((GeneralPath) shape).curveTo(346.91995, 630.33997, 341.13995, 628.56, 337.26996, 624.68);
        ((GeneralPath) shape).curveTo(333.51996, 618.8, 334.85995, 610.96, 337.86996, 605.01);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCA16D));
        g.fill(shape);

        // _0_0_248
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(629.9, 622.87);
        ((GeneralPath) shape).curveTo(634.28, 616.32, 639.16003, 610.11, 645.10004, 604.89);
        ((GeneralPath) shape).curveTo(640.52, 611.2, 636.28, 618.23004, 629.9, 622.87);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x898989));
        g.fill(shape);

        // _0_0_249
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(221.56, 611.36);
        ((GeneralPath) shape).curveTo(226.2, 609.92, 229.56999, 613.89, 232.87, 616.29);
        ((GeneralPath) shape).curveTo(233.9, 617.82, 234.08, 619.75995, 233.58, 621.52997);
        ((GeneralPath) shape).curveTo(232.59, 625.37, 231.94, 630.16, 227.84, 632.13995);
        ((GeneralPath) shape).curveTo(225.55, 635.2999, 221.45999, 633.97, 219.19, 631.86993);
        ((GeneralPath) shape).curveTo(216.86, 628.20996, 214.59, 624.01996, 215.48, 619.50995);
        ((GeneralPath) shape).curveTo(215.93, 616.0499, 217.76, 612.02997, 221.56, 611.3599);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF6C283));
        g.fill(shape);

        // _0_0_250
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(521.71, 640.58);
        ((GeneralPath) shape).curveTo(527.46, 632.54004, 528.62, 622.26, 534.01, 614.03);
        ((GeneralPath) shape).curveTo(533.26, 619.0, 530.83, 623.47003, 529.10004, 628.14);
        ((GeneralPath) shape).curveTo(527.37006, 632.31, 526.16003, 636.76, 523.62006, 640.56);
        ((GeneralPath) shape).curveTo(521.79004, 642.67, 519.6401, 644.52, 518.0801, 646.87);
        ((GeneralPath) shape).curveTo(519.7801, 648.18, 521.5401, 649.43, 523.05005, 650.99);
        ((GeneralPath) shape).curveTo(520.24005, 649.91, 517.44006, 648.73, 514.99005, 646.98);
        ((GeneralPath) shape).curveTo(517.11005, 644.72, 519.59, 642.83997, 521.71, 640.57996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x828282));
        g.fill(shape);

        // _0_0_251
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(64.19, 619.19);
        ((GeneralPath) shape).curveTo(65.600006, 617.56, 67.350006, 616.27, 69.22, 615.21);
        ((GeneralPath) shape).curveTo(66.47, 619.68, 62.46, 623.15, 59.24, 627.26);
        ((GeneralPath) shape).curveTo(55.190002, 632.52, 51.13, 637.77, 47.120003, 643.06);
        ((GeneralPath) shape).curveTo(47.700005, 640.97, 48.49, 638.74, 49.910004, 637.08);
        ((GeneralPath) shape).curveTo(54.170006, 630.74, 59.140003, 624.91003, 64.19, 619.19);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8B8B8B));
        g.fill(shape);

        // _0_0_252
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(427.76, 621.2);
        ((GeneralPath) shape).curveTo(433.15002, 620.45, 438.81, 621.57, 443.15002, 624.93);
        ((GeneralPath) shape).curveTo(435.89, 625.02, 428.64, 624.32, 421.41003, 623.81);
        ((GeneralPath) shape).curveTo(423.50003, 622.89, 425.52002, 621.73, 427.76004, 621.2);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8BDFE1));
        g.fill(shape);

        // _0_0_253
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(619.88, 634.88);
        ((GeneralPath) shape).curveTo(622.01, 630.56, 625.43, 627.14, 628.97003, 623.95);
        ((GeneralPath) shape).curveTo(626.37006, 627.86, 624.07, 632.4, 619.88, 634.88);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x898989));
        g.fill(shape);

        // _0_0_254
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(400.03, 639.05);
        ((GeneralPath) shape).curveTo(404.25, 637.1, 408.57, 634.93, 413.38, 635.06);
        ((GeneralPath) shape).curveTo(421.55002, 634.81, 429.72, 635.04, 437.9, 634.91);
        ((GeneralPath) shape).curveTo(440.93, 635.16, 444.63, 634.22, 447.43, 636.02997);
        ((GeneralPath) shape).lineTo(446.99, 636.85);
        ((GeneralPath) shape).curveTo(444.62, 637.02997, 442.25998, 637.13995, 439.9, 637.19);
        ((GeneralPath) shape).curveTo(442.00998, 639.15, 444.38, 640.88, 446.24, 643.13);
        ((GeneralPath) shape).curveTo(447.94, 646.6, 447.99, 650.87, 446.77, 654.51);
        ((GeneralPath) shape).curveTo(444.72, 658.39, 440.97, 660.96, 438.00998, 664.10004);
        ((GeneralPath) shape).curveTo(440.30997, 666.52, 442.99997, 668.51, 445.24, 671.01);
        ((GeneralPath) shape).curveTo(446.69, 673.54004, 446.05, 676.7, 446.75998, 679.44);
        ((GeneralPath) shape).curveTo(448.27, 678.97003, 449.72998, 678.38, 451.21997, 677.84);
        ((GeneralPath) shape).curveTo(447.31998, 681.75, 444.01996, 686.93005, 444.90997, 692.73004);
        ((GeneralPath) shape).curveTo(444.8, 695.11005, 446.72998, 696.99005, 448.94998, 697.48004);
        ((GeneralPath) shape).curveTo(455.15, 699.12006, 461.24997, 696.89, 467.12, 695.12006);
        ((GeneralPath) shape).curveTo(464.91, 698.1501, 460.63, 698.24005, 457.31, 698.92004);
        ((GeneralPath) shape).curveTo(453.34, 698.73004, 448.34, 699.9, 445.15, 696.89);
        ((GeneralPath) shape).curveTo(442.63998, 694.19, 443.58, 690.31, 443.59, 687.01);
        ((GeneralPath) shape).curveTo(440.15, 688.79004, 436.12, 691.72003, 435.52, 695.85004);
        ((GeneralPath) shape).curveTo(438.16, 696.63007, 441.02, 696.9, 443.38998, 698.42004);
        ((GeneralPath) shape).curveTo(447.24, 700.96, 449.3, 705.78, 448.58, 710.36005);
        ((GeneralPath) shape).curveTo(447.62, 713.53, 445.40997, 716.15, 444.03998, 719.16003);
        ((GeneralPath) shape).curveTo(447.43997, 721.12006, 451.36996, 721.97003, 455.3, 721.78);
        ((GeneralPath) shape).curveTo(458.86, 718.77, 460.97998, 714.17004, 465.24, 711.99005);
        ((GeneralPath) shape).curveTo(473.34998, 706.82007, 485.19998, 709.73004, 490.09, 717.98004);
        ((GeneralPath) shape).curveTo(492.36, 720.67004, 493.48, 724.60004, 496.97, 726.05005);
        ((GeneralPath) shape).curveTo(502.59, 728.81006, 508.11002, 732.84, 514.63, 732.92004);
        ((GeneralPath) shape).curveTo(515.42, 734.93005, 510.98, 734.15, 511.05002, 736.2001);
        ((GeneralPath) shape).curveTo(510.05002, 739.1401, 513.21, 741.24005, 515.79004, 741.50006);
        ((GeneralPath) shape).curveTo(529.10004, 742.66003, 542.50006, 741.7001, 555.86005, 741.9501);
        ((GeneralPath) shape).curveTo(559.92004, 742.2101, 564.28, 741.5901, 568.21, 743.0901);
        ((GeneralPath) shape).lineTo(567.91003, 744.00006);
        ((GeneralPath) shape).curveTo(553.02, 743.7701, 538.12006, 743.36005, 523.22003, 743.61005);
        ((GeneralPath) shape).curveTo(525.27, 748.85004, 528.13, 754.41003, 526.51, 760.21);
        ((GeneralPath) shape).curveTo(525.02, 764.42004, 523.17, 769.10004, 518.83, 771.15);
        ((GeneralPath) shape).curveTo(512.86005, 775.33, 504.22003, 774.98004, 498.27002, 770.96);
        ((GeneralPath) shape).curveTo(493.37003, 767.98004, 490.76, 762.64, 487.17, 758.4);
        ((GeneralPath) shape).curveTo(485.90002, 758.02, 484.59003, 757.87, 483.31003, 757.69);
        ((GeneralPath) shape).curveTo(483.32004, 753.72003, 483.85004, 749.74, 483.99002, 745.81);
        ((GeneralPath) shape).curveTo(482.94003, 743.89, 481.00003, 742.69, 479.15002, 741.68);
        ((GeneralPath) shape).curveTo(474.65002, 739.75, 469.60004, 740.19, 464.84003, 739.98);
        ((GeneralPath) shape).curveTo(444.90002, 739.97, 424.96002, 739.92, 405.03003, 740.12);
        ((GeneralPath) shape).curveTo(400.67004, 739.94, 396.24002, 740.51, 391.97003, 739.49);
        ((GeneralPath) shape).curveTo(399.98004, 739.33997, 407.98004, 738.88, 416.00003, 738.93);
        ((GeneralPath) shape).curveTo(410.54004, 738.11, 404.77002, 737.24, 400.22003, 733.85);
        ((GeneralPath) shape).curveTo(397.42004, 731.75, 395.82004, 728.63, 394.52002, 725.49);
        ((GeneralPath) shape).curveTo(393.88, 724.19, 393.52002, 722.58997, 392.11002, 721.92);
        ((GeneralPath) shape).curveTo(389.38, 720.27997, 386.6, 718.72, 383.92, 717.01);
        ((GeneralPath) shape).curveTo(382.68002, 718.47003, 381.74002, 720.15, 380.78, 721.8);
        ((GeneralPath) shape).lineTo(380.08, 722.13);
        ((GeneralPath) shape).curveTo(385.5, 708.09, 383.78998, 692.68, 383.94998, 677.97003);
        ((GeneralPath) shape).curveTo(383.96997, 670.01, 383.31998, 661.4, 387.09, 654.07);
        ((GeneralPath) shape).curveTo(389.91, 648.05, 393.68, 641.81, 400.03, 639.05);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x6DCACC));
        g.fill(shape);

        // _0_0_255
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(439.9, 637.19);
        ((GeneralPath) shape).curveTo(442.25998, 637.14, 444.62, 637.03, 446.99, 636.85);
        ((GeneralPath) shape).curveTo(449.66, 636.86, 452.83, 636.14996, 455.21, 637.64996);
        ((GeneralPath) shape).curveTo(454.65, 637.95996, 453.50998, 638.56995, 452.94, 638.87994);
        ((GeneralPath) shape).curveTo(459.61002, 641.08997, 466.31, 643.24994, 472.64, 646.3499);
        ((GeneralPath) shape).curveTo(475.62003, 647.7899, 478.83002, 648.68994, 482.13, 649.0199);
        ((GeneralPath) shape).curveTo(487.71, 649.7199, 493.34, 649.8099, 498.97, 650.0799);
        ((GeneralPath) shape).curveTo(500.34, 650.1799, 501.81, 650.0699, 503.09, 650.7199);
        ((GeneralPath) shape).curveTo(509.43, 653.8499, 515.44, 657.6299, 521.17, 661.7799);
        ((GeneralPath) shape).curveTo(523.45996, 663.7999, 526.55, 665.2299, 528.2, 667.9599);
        ((GeneralPath) shape).curveTo(524.63, 671.3899, 519.29004, 668.1099, 514.98004, 669.6599);
        ((GeneralPath) shape).curveTo(510.63004, 671.3899, 505.61005, 673.2599, 503.68005, 677.9699);
        ((GeneralPath) shape).curveTo(499.44006, 683.3599, 501.35007, 690.4599, 501.72006, 696.7299);
        ((GeneralPath) shape).curveTo(500.54007, 697.0399, 498.18005, 697.6499, 497.00006, 697.9599);
        ((GeneralPath) shape).curveTo(494.27005, 698.9399, 494.58005, 702.7899, 495.46005, 705.1199);
        ((GeneralPath) shape).curveTo(497.06006, 707.02985, 499.09006, 708.52985, 501.03006, 710.0799);
        ((GeneralPath) shape).curveTo(503.33005, 711.7699, 505.63007, 713.8899, 508.90005, 712.98987);
        ((GeneralPath) shape).curveTo(510.40005, 713.16986, 511.43005, 711.95984, 511.92004, 710.6899);
        ((GeneralPath) shape).curveTo(512.15, 709.5099, 512.60004, 707.15985, 512.83, 705.97986);
        ((GeneralPath) shape).curveTo(517.44, 708.6299, 522.51, 710.52985, 527.88, 710.85986);
        ((GeneralPath) shape).curveTo(533.41003, 709.5599, 540.07, 708.32983, 543.17, 702.8799);
        ((GeneralPath) shape).curveTo(545.75, 700.3199, 545.54, 696.6599, 546.16, 693.41986);
        ((GeneralPath) shape).lineTo(546.67, 692.7499);
        ((GeneralPath) shape).curveTo(549.32, 700.6899, 549.38995, 709.1499, 549.04, 717.4399);
        ((GeneralPath) shape).curveTo(548.91, 719.0699, 546.89996, 719.47986, 546.02997, 720.66986);
        ((GeneralPath) shape).curveTo(545.95996, 723.20984, 545.81, 728.29987, 545.74, 730.84985);
        ((GeneralPath) shape).curveTo(535.32, 730.88983, 524.91, 731.1899, 514.63, 732.91986);
        ((GeneralPath) shape).curveTo(508.11002, 732.83984, 502.59, 728.8099, 496.97, 726.04987);
        ((GeneralPath) shape).curveTo(493.48, 724.59985, 492.36002, 720.66986, 490.09, 717.97986);
        ((GeneralPath) shape).curveTo(485.19998, 709.72986, 473.35, 706.8199, 465.24, 711.98987);
        ((GeneralPath) shape).curveTo(460.97998, 714.16986, 458.86, 718.7699, 455.3, 721.77985);
        ((GeneralPath) shape).curveTo(451.37, 721.96985, 447.44, 721.1199, 444.03998, 719.15985);
        ((GeneralPath) shape).curveTo(445.40997, 716.14984, 447.61996, 713.52985, 448.58, 710.35986);
        ((GeneralPath) shape).curveTo(449.3, 705.77985, 447.24, 700.95984, 443.38998, 698.41986);
        ((GeneralPath) shape).curveTo(441.02, 696.89984, 438.15997, 696.6299, 435.52, 695.84985);
        ((GeneralPath) shape).curveTo(436.12, 691.71985, 440.15, 688.78986, 443.59, 687.0098);
        ((GeneralPath) shape).curveTo(443.58, 690.3098, 442.63998, 694.1898, 445.15, 696.88983);
        ((GeneralPath) shape).curveTo(448.34, 699.89984, 453.34, 698.72986, 457.31, 698.91986);
        ((GeneralPath) shape).curveTo(460.63, 698.23987, 464.91, 698.14984, 467.12, 695.1199);
        ((GeneralPath) shape).curveTo(469.41998, 692.40985, 470.69, 688.4299, 469.15, 685.02985);
        ((GeneralPath) shape).curveTo(467.19998, 683.88983, 464.91, 683.34985, 463.11, 681.9498);
        ((GeneralPath) shape).curveTo(461.87, 680.6098, 461.12, 678.89984, 459.90997, 677.5498);
        ((GeneralPath) shape).curveTo(457.06998, 676.57983, 453.94998, 676.7198, 451.21997, 677.8398);
        ((GeneralPath) shape).curveTo(449.72998, 678.37976, 448.26996, 678.9698, 446.75998, 679.43976);
        ((GeneralPath) shape).curveTo(446.05, 676.69977, 446.68997, 673.53973, 445.24, 671.00977);
        ((GeneralPath) shape).curveTo(443.0, 668.50977, 440.31, 666.5198, 438.00998, 664.0998);
        ((GeneralPath) shape).curveTo(440.96997, 660.9598, 444.71997, 658.3898, 446.77, 654.50977);
        ((GeneralPath) shape).curveTo(447.99, 650.86975, 447.94, 646.5998, 446.24, 643.12976);
        ((GeneralPath) shape).curveTo(444.38, 640.87976, 442.00998, 639.1498, 439.9, 637.18976);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x83F3F6));
        g.fill(shape);

        // _0_0_256
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(607.87, 648.87);
        ((GeneralPath) shape).curveTo(610.69, 644.46, 614.08997, 640.47, 618.08, 637.08);
        ((GeneralPath) shape).curveTo(615.34, 641.49, 612.45, 646.16003, 607.87, 648.87);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8A8A8A));
        g.fill(shape);

        // _0_0_257
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(452.94, 638.88);
        ((GeneralPath) shape).curveTo(453.51, 638.57, 454.65, 637.96, 455.21, 637.65);
        ((GeneralPath) shape).curveTo(458.72998, 637.81, 462.69998, 638.58, 465.97, 639.93005);
        ((GeneralPath) shape).curveTo(470.94, 643.62006, 476.34, 646.80005, 482.13, 649.0201);
        ((GeneralPath) shape).curveTo(478.83002, 648.69006, 475.62, 647.7901, 472.64, 646.3501);
        ((GeneralPath) shape).curveTo(466.31003, 643.2501, 459.61002, 641.0901, 452.94, 638.8801);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDBE6E6));
        g.fill(shape);

        // _0_0_258
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(465.97, 639.93);
        ((GeneralPath) shape).curveTo(477.25, 641.82, 488.23, 645.17, 498.91, 649.2);
        ((GeneralPath) shape).lineTo(498.97, 650.08);
        ((GeneralPath) shape).curveTo(493.34, 649.81, 487.71, 649.72003, 482.13, 649.02);
        ((GeneralPath) shape).curveTo(476.34, 646.80005, 470.94, 643.62, 465.97, 639.93);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xED8385));
        g.fill(shape);

        // _0_0_259
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.35, 664.38);
        ((GeneralPath) shape).curveTo(39.21, 656.96, 41.219997, 648.77, 47.12, 643.06);
        ((GeneralPath) shape).curveTo(40.129997, 656.24, 35.11, 670.56, 33.18, 685.39);
        ((GeneralPath) shape).curveTo(32.07, 704.71, 35.03, 724.65, 44.03, 741.96);
        ((GeneralPath) shape).curveTo(40.629997, 738.66003, 39.16, 734.05005, 37.129997, 729.91003);
        ((GeneralPath) shape).curveTo(34.899998, 724.84, 32.119995, 719.89, 31.509998, 714.27);
        ((GeneralPath) shape).curveTo(29.939999, 697.54004, 30.689999, 680.34, 36.35, 664.38);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDBAD77));
        g.fill(shape);

        // _0_0_260
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(146.51, 651.79);
        ((GeneralPath) shape).curveTo(149.31, 647.54, 155.19, 647.32, 159.20999, 649.69);
        ((GeneralPath) shape).curveTo(163.98, 652.74, 162.51, 660.47003, 158.29999, 663.38);
        ((GeneralPath) shape).curveTo(155.15, 666.93, 149.88998, 666.05, 145.65, 665.69);
        ((GeneralPath) shape).curveTo(141.59999, 667.28, 140.92, 664.09, 139.9, 661.78);
        ((GeneralPath) shape).curveTo(140.53, 661.65, 141.78, 661.37006, 142.40999, 661.23004);
        ((GeneralPath) shape).curveTo(146.35999, 660.81006, 151.16998, 662.85004, 154.71999, 660.27);
        ((GeneralPath) shape).curveTo(154.94998, 658.91003, 154.96999, 657.53, 154.90999, 656.17004);
        ((GeneralPath) shape).curveTo(151.95999, 656.24005, 149.13998, 657.19006, 146.43, 658.28);
        ((GeneralPath) shape).curveTo(145.10999, 656.44, 143.76999, 653.24005, 146.51, 651.79004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x020201));
        g.fill(shape);

        // _0_0_261
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(584.52, 676.5);
        ((GeneralPath) shape).curveTo(591.79004, 667.49, 598.12, 657.57, 606.98004, 649.98);
        ((GeneralPath) shape).curveTo(604.55005, 654.08997, 601.21, 657.55, 598.28, 661.29);
        ((GeneralPath) shape).curveTo(590.16003, 670.89996, 582.99005, 681.25995, 575.26, 691.17);
        ((GeneralPath) shape).curveTo(577.72003, 685.88995, 580.73, 680.93, 584.52, 676.5);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x848484));
        g.fill(shape);

        // _0_0_262
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(526.12, 652.89);
        ((GeneralPath) shape).curveTo(530.9, 655.10004, 534.58, 659.05, 538.31, 662.69);
        ((GeneralPath) shape).curveTo(542.43, 666.97003, 547.01, 671.27, 549.14, 676.97003);
        ((GeneralPath) shape).curveTo(542.0, 668.44, 534.21, 660.51, 526.12, 652.89);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x858585));
        g.fill(shape);

        // _0_0_263
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(146.43, 658.28);
        ((GeneralPath) shape).curveTo(149.14, 657.19, 151.95999, 656.24005, 154.90999, 656.17004);
        ((GeneralPath) shape).curveTo(154.96999, 657.53, 154.94998, 658.91003, 154.71999, 660.27);
        ((GeneralPath) shape).curveTo(151.16998, 662.85004, 146.35999, 660.81, 142.40999, 661.23004);
        ((GeneralPath) shape).lineTo(142.16998, 660.43005);
        ((GeneralPath) shape).curveTo(143.65999, 659.86005, 145.07999, 659.13007, 146.42998, 658.28);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE7B77B));
        g.fill(shape);

        // _0_0_264
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(514.98, 669.66);
        ((GeneralPath) shape).curveTo(519.29, 668.11, 524.63, 671.38995, 528.19995, 667.95996);
        ((GeneralPath) shape).curveTo(537.45996, 673.52997, 541.93994, 683.98, 546.16, 693.42);
        ((GeneralPath) shape).curveTo(545.54, 696.66, 545.75, 700.32, 543.17, 702.88);
        ((GeneralPath) shape).curveTo(540.07, 708.33, 533.41, 709.56, 527.88, 710.86);
        ((GeneralPath) shape).curveTo(522.51, 710.52997, 517.44, 708.63, 512.83, 705.98);
        ((GeneralPath) shape).curveTo(512.60004, 707.16, 512.15, 709.51, 511.92, 710.69);
        ((GeneralPath) shape).curveTo(511.62003, 707.5, 513.47003, 702.27, 509.08002, 700.92);
        ((GeneralPath) shape).curveTo(505.52002, 698.45, 501.2, 697.95, 497.00003, 697.95996);
        ((GeneralPath) shape).curveTo(498.18002, 697.64996, 500.54004, 697.04, 501.72003, 696.73);
        ((GeneralPath) shape).curveTo(501.35004, 690.45996, 499.44003, 683.36, 503.68002, 677.97);
        ((GeneralPath) shape).curveTo(505.61002, 673.25995, 510.63004, 671.38995, 514.98004, 669.66);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0FCFD));
        g.fill(shape);

        // _0_0_265
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(451.22, 677.84);
        ((GeneralPath) shape).curveTo(453.95, 676.72003, 457.07, 676.58, 459.91, 677.55005);
        ((GeneralPath) shape).curveTo(461.12, 678.9, 461.87, 680.61005, 463.11002, 681.9501);
        ((GeneralPath) shape).curveTo(464.91, 683.3501, 467.2, 683.8901, 469.15002, 685.0301);
        ((GeneralPath) shape).curveTo(470.69003, 688.4301, 469.42, 692.4101, 467.12003, 695.1201);
        ((GeneralPath) shape).curveTo(461.25003, 696.89014, 455.15002, 699.1201, 448.95, 697.4801);
        ((GeneralPath) shape).curveTo(446.73, 696.9901, 444.80002, 695.1101, 444.91, 692.7301);
        ((GeneralPath) shape).curveTo(444.02, 686.9301, 447.32, 681.7501, 451.22, 677.8401);
        ((GeneralPath) shape).moveTo(454.29, 687.0101);
        ((GeneralPath) shape).curveTo(452.73, 688.5301, 451.72, 690.75006, 452.22, 692.9501);
        ((GeneralPath) shape).curveTo(455.11002, 692.92004, 458.11002, 692.93005, 460.88, 691.9501);
        ((GeneralPath) shape).curveTo(460.91, 691.5401, 460.98, 690.7201, 461.01, 690.30005);
        ((GeneralPath) shape).curveTo(459.31, 688.4501, 456.94, 686.69006, 454.29, 687.0101);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x010101));
        g.fill(shape);

        // _0_0_266
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(551.08, 680.07);
        ((GeneralPath) shape).curveTo(551.82, 678.9, 552.77, 678.60004, 553.94, 679.18);
        ((GeneralPath) shape).curveTo(553.65, 680.14996, 553.62, 682.08997, 552.13, 681.88);
        ((GeneralPath) shape).curveTo(551.86, 681.42, 551.34, 680.52, 551.08, 680.07);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x979797));
        g.fill(shape);

        // _0_0_267
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(454.29, 687.01);
        ((GeneralPath) shape).curveTo(456.94, 686.69, 459.31, 688.45, 461.01, 690.3);
        ((GeneralPath) shape).curveTo(460.98, 690.72, 460.91, 691.54, 460.88, 691.95);
        ((GeneralPath) shape).curveTo(458.11002, 692.93, 455.11002, 692.92, 452.22, 692.95);
        ((GeneralPath) shape).curveTo(451.72, 690.75, 452.73, 688.53, 454.29, 687.01);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7CE7EA));
        g.fill(shape);

        // _0_0_268
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(283.22, 689.65);
        ((GeneralPath) shape).curveTo(286.31, 689.04004, 289.58, 688.54004, 292.67, 689.37);
        ((GeneralPath) shape).curveTo(293.51, 690.3, 294.69, 691.06, 295.1, 692.32);
        ((GeneralPath) shape).curveTo(295.28, 694.67, 294.18, 697.04, 293.39, 699.25);
        ((GeneralPath) shape).curveTo(290.86002, 700.88, 288.25, 702.96, 284.92, 702.05);
        ((GeneralPath) shape).curveTo(282.32, 702.41, 280.77002, 698.57, 282.18002, 696.56);
        ((GeneralPath) shape).curveTo(283.07004, 694.33, 283.69003, 692.05, 283.22003, 689.65);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x020101));
        g.fill(shape);

        // _0_0_269
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(568.94, 700.01);
        ((GeneralPath) shape).curveTo(569.58, 697.58, 571.01, 695.51, 573.0, 693.99);
        ((GeneralPath) shape).curveTo(572.33, 696.37, 571.13, 698.68, 568.94, 700.01);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x898989));
        g.fill(shape);

        // _0_0_270
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(495.46, 705.12);
        ((GeneralPath) shape).curveTo(494.58, 702.79, 494.27, 698.94, 497.0, 697.96);
        ((GeneralPath) shape).curveTo(501.2, 697.95, 505.52, 698.45, 509.08, 700.92004);
        ((GeneralPath) shape).curveTo(513.47, 702.27, 511.62, 707.50006, 511.91998, 710.69006);
        ((GeneralPath) shape).curveTo(511.43, 711.9601, 510.4, 713.17004, 508.9, 712.99005);
        ((GeneralPath) shape).curveTo(505.63, 713.8901, 503.33, 711.7701, 501.03, 710.0801);
        ((GeneralPath) shape).curveTo(499.09, 708.5301, 497.06, 707.0301, 495.46, 705.12006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x000101));
        g.fill(shape);

        // _0_0_271
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(561.48, 710.28);
        ((GeneralPath) shape).curveTo(562.42, 708.98004, 563.66, 707.95, 564.81, 706.86005);
        ((GeneralPath) shape).curveTo(566.5, 712.27, 567.09, 717.9501, 568.71, 723.3901);
        ((GeneralPath) shape).curveTo(576.56, 724.49005, 584.94, 726.19006, 590.32, 732.69006);
        ((GeneralPath) shape).curveTo(595.08, 737.1501, 596.28, 743.79004, 599.7, 749.1401);
        ((GeneralPath) shape).lineTo(599.63, 749.9501);
        ((GeneralPath) shape).curveTo(598.65, 752.3301, 599.37, 756.2201, 597.09, 757.9601);
        ((GeneralPath) shape).curveTo(595.98004, 754.5301, 594.94, 751.0501, 593.07, 747.94006);
        ((GeneralPath) shape).curveTo(590.4, 743.19006, 586.96, 738.6501, 582.24, 735.80005);
        ((GeneralPath) shape).curveTo(577.43, 733.12006, 572.45, 729.79004, 566.64, 730.4);
        ((GeneralPath) shape).curveTo(564.42004, 730.33, 559.98004, 730.18005, 557.77, 730.11005);
        ((GeneralPath) shape).curveTo(555.64, 727.94006, 559.54004, 726.56006, 560.37, 724.7001);
        ((GeneralPath) shape).curveTo(561.16, 719.93005, 560.86, 715.05005, 561.48, 710.2801);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x82F2F5));
        g.fill(shape);

        // _0_0_272
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(380.78, 721.8);
        ((GeneralPath) shape).curveTo(381.74, 720.14996, 382.68, 718.47, 383.92, 717.01);
        ((GeneralPath) shape).curveTo(386.6, 718.72003, 389.38, 720.28, 392.11002, 721.92);
        ((GeneralPath) shape).curveTo(393.52002, 722.58997, 393.88, 724.19, 394.52002, 725.49);
        ((GeneralPath) shape).curveTo(395.82, 728.63, 397.42, 731.75, 400.22003, 733.85);
        ((GeneralPath) shape).curveTo(404.77002, 737.24, 410.54004, 738.11, 416.00003, 738.93);
        ((GeneralPath) shape).curveTo(407.98004, 738.88, 399.98004, 739.33997, 391.97003, 739.49);
        ((GeneralPath) shape).curveTo(388.87003, 738.3, 387.02002, 735.19, 384.74002, 732.89996);
        ((GeneralPath) shape).curveTo(384.34003, 728.86993, 383.83002, 724.74, 380.78003, 721.8);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x83F2F5));
        g.fill(shape);

        // _0_0_273
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(380.08, 722.13);
        ((GeneralPath) shape).lineTo(380.78, 721.8);
        ((GeneralPath) shape).curveTo(383.83, 724.74, 384.34, 728.87, 384.74, 732.89996);
        ((GeneralPath) shape).curveTo(382.02, 731.92, 378.31, 731.42, 377.63998, 728.04);
        ((GeneralPath) shape).curveTo(378.25998, 726.0, 378.87, 723.91, 380.08, 722.13);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xF4FBFB));
        g.fill(shape);

        // _0_0_274
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(377.27, 731.55);
        ((GeneralPath) shape).curveTo(377.22998, 730.47, 376.21, 728.52997, 377.63998, 728.04);
        ((GeneralPath) shape).curveTo(378.31, 731.42, 382.02, 731.92, 384.74, 732.89996);
        ((GeneralPath) shape).curveTo(387.02, 735.18994, 388.87, 738.3, 391.97, 739.49);
        ((GeneralPath) shape).curveTo(396.24, 740.51, 400.67, 739.94, 405.03, 740.12);
        ((GeneralPath) shape).curveTo(424.96, 739.92, 444.9, 739.97, 464.84, 739.98);
        ((GeneralPath) shape).curveTo(469.6, 740.19, 474.65, 739.75, 479.15, 741.68);
        ((GeneralPath) shape).curveTo(450.53998, 740.27, 421.88, 741.35, 393.25, 741.0);
        ((GeneralPath) shape).curveTo(389.7, 741.19, 387.77, 737.51, 385.19, 735.72);
        ((GeneralPath) shape).curveTo(382.99, 733.57996, 379.9, 732.94995, 377.27, 731.55);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4C7677));
        g.fill(shape);

        // _0_0_275
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(365.61, 731.58);
        ((GeneralPath) shape).curveTo(367.71, 733.39, 370.22998, 734.60004, 372.62997, 735.96);
        ((GeneralPath) shape).curveTo(372.88998, 741.65, 371.05, 747.30005, 368.03998, 752.07);
        ((GeneralPath) shape).curveTo(363.43997, 760.23, 356.91998, 767.06, 351.96, 774.98);
        ((GeneralPath) shape).curveTo(346.81998, 783.22, 341.75, 791.91, 333.97, 797.97);
        ((GeneralPath) shape).curveTo(328.44, 801.8, 322.66, 805.75, 315.91, 807.00995);
        ((GeneralPath) shape).curveTo(310.7, 808.56995, 305.29, 807.12994, 300.14, 806.18994);
        ((GeneralPath) shape).curveTo(305.02002, 806.3499, 309.90002, 806.30994, 314.78003, 806.07996);
        ((GeneralPath) shape).curveTo(318.50003, 801.75995, 321.23004, 796.66, 323.68002, 791.54);
        ((GeneralPath) shape).curveTo(326.55002, 784.12, 328.51, 775.98, 333.80002, 769.79);
        ((GeneralPath) shape).curveTo(340.7, 762.27997, 350.19, 757.62, 359.94, 755.07);
        ((GeneralPath) shape).curveTo(362.04, 754.0, 365.52, 754.2, 366.77, 751.69);
        ((GeneralPath) shape).curveTo(369.08, 747.44, 371.02, 742.76, 370.69998, 737.82);
        ((GeneralPath) shape).curveTo(369.05997, 735.68, 366.31998, 734.34, 365.61, 731.58);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCCA16D));
        g.fill(shape);

        // _0_0_276
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(44.03, 741.96);
        ((GeneralPath) shape).curveTo(46.87, 744.45, 49.42, 747.24005, 51.96, 750.05005);
        ((GeneralPath) shape).curveTo(48.6, 748.23004, 45.01, 745.8901, 44.03, 741.96);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x868686));
        g.fill(shape);

        // _0_0_277
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(523.22, 743.61);
        ((GeneralPath) shape).curveTo(538.12, 743.36, 553.01996, 743.76996, 567.91, 744.0);
        ((GeneralPath) shape).curveTo(574.91, 744.42, 582.02997, 749.19, 584.05, 756.15);
        ((GeneralPath) shape).curveTo(583.91, 760.89, 585.13, 766.21, 582.64, 770.59);
        ((GeneralPath) shape).curveTo(579.88, 775.66003, 577.47003, 781.17004, 573.05, 785.05005);
        ((GeneralPath) shape).curveTo(568.5, 788.86005, 563.42, 792.79004, 557.35, 793.57007);
        ((GeneralPath) shape).curveTo(553.38, 793.5901, 548.86, 795.18005, 545.19, 793.0201);
        ((GeneralPath) shape).curveTo(541.18, 790.69006, 536.5, 787.19006, 537.96, 781.7101);
        ((GeneralPath) shape).curveTo(536.30005, 775.37006, 541.38, 769.7201, 539.87, 763.43005);
        ((GeneralPath) shape).curveTo(538.33, 761.31006, 535.08997, 760.29004, 532.71, 761.55005);
        ((GeneralPath) shape).curveTo(530.32, 762.43005, 529.01, 764.71, 527.64, 766.7001);
        ((GeneralPath) shape).curveTo(525.0, 770.92004, 521.39, 774.3901, 517.76, 777.75006);
        ((GeneralPath) shape).curveTo(510.83002, 784.38007, 501.76, 788.07007, 493.15002, 791.93005);
        ((GeneralPath) shape).curveTo(491.00003, 791.93005, 486.69003, 791.92004, 484.54004, 791.91003);
        ((GeneralPath) shape).curveTo(480.86005, 791.69006, 478.74005, 788.11005, 477.85004, 784.94006);
        ((GeneralPath) shape).curveTo(477.04004, 781.35004, 476.35004, 777.75006, 476.21002, 774.0901);
        ((GeneralPath) shape).curveTo(476.50003, 768.4501, 478.43002, 762.8601, 481.83002, 758.3501);
        ((GeneralPath) shape).curveTo(482.2, 758.1801, 482.94, 757.8501, 483.31003, 757.6901);
        ((GeneralPath) shape).curveTo(484.59003, 757.8701, 485.90002, 758.02014, 487.17, 758.40015);
        ((GeneralPath) shape).curveTo(490.76, 762.64014, 493.37003, 767.98016, 498.27002, 770.96014);
        ((GeneralPath) shape).curveTo(504.22003, 774.98016, 512.86005, 775.33014, 518.83, 771.15015);
        ((GeneralPath) shape).curveTo(523.17004, 769.10016, 525.02, 764.42017, 526.51, 760.21014);
        ((GeneralPath) shape).curveTo(528.13, 754.41016, 525.27, 748.85016, 523.22003, 743.61017);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x83F3F6));
        g.fill(shape);

        // _0_0_278
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(77.96, 751.87);
        ((GeneralPath) shape).curveTo(86.14, 750.31, 94.19, 748.05, 102.47, 747.1);
        ((GeneralPath) shape).curveTo(103.130005, 748.37, 103.68, 749.69995, 104.25, 751.04);
        ((GeneralPath) shape).curveTo(95.5, 751.69, 86.729996, 751.92, 77.96, 751.87);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xB2CBC7));
        g.fill(shape);

        // _0_0_279
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(599.7, 749.14);
        ((GeneralPath) shape).curveTo(600.35004, 748.03, 601.18, 746.54004, 602.74, 747.12);
        ((GeneralPath) shape).curveTo(608.92, 749.35, 614.91, 753.52, 617.14996, 760.02997);
        ((GeneralPath) shape).curveTo(620.14996, 770.23, 619.06995, 781.55, 613.86993, 790.86);
        ((GeneralPath) shape).curveTo(612.26996, 793.43, 610.75995, 796.48, 607.9699, 798.0);
        ((GeneralPath) shape).curveTo(613.6899, 789.36, 618.8199, 779.23, 617.5899, 768.54);
        ((GeneralPath) shape).curveTo(616.7699, 762.37, 614.6699, 755.32996, 608.9899, 751.94);
        ((GeneralPath) shape).curveTo(606.2899, 750.35, 603.0299, 747.02, 599.69995, 749.14);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x868686));
        g.fill(shape);

        // _0_0_280
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(593.07, 747.94);
        ((GeneralPath) shape).curveTo(594.94, 751.05, 595.98, 754.53, 597.09, 757.96);
        ((GeneralPath) shape).curveTo(599.37006, 756.22003, 598.65, 752.33, 599.63, 749.95);
        ((GeneralPath) shape).curveTo(598.0, 759.4, 601.82, 769.35004, 597.68, 778.38);
        ((GeneralPath) shape).curveTo(593.52, 784.26, 589.11, 789.98, 584.94, 795.86);
        ((GeneralPath) shape).curveTo(584.68, 794.89996, 584.41, 793.94, 584.16, 793.0);
        ((GeneralPath) shape).curveTo(587.56, 786.77, 592.86, 781.63, 594.82996, 774.64);
        ((GeneralPath) shape).curveTo(597.36, 765.82, 595.48, 756.57, 593.06995, 747.94);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x67BFC2));
        g.fill(shape);

        // _0_0_281
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(375.89, 757.87);
        ((GeneralPath) shape).curveTo(377.72, 755.38, 378.63, 752.1, 380.94, 750.04);
        ((GeneralPath) shape).curveTo(384.07, 750.89996, 386.75, 753.3, 390.16, 753.11);
        ((GeneralPath) shape).curveTo(416.69, 752.89996, 443.22, 753.17, 469.75, 752.76996);
        ((GeneralPath) shape).curveTo(469.8, 753.20996, 469.91, 754.1, 469.96, 754.55);
        ((GeneralPath) shape).curveTo(467.56998, 759.27997, 464.31, 763.89996, 464.03, 769.36);
        ((GeneralPath) shape).curveTo(463.67, 777.11, 463.62, 785.12, 466.17, 792.57);
        ((GeneralPath) shape).curveTo(468.52002, 796.73, 471.84003, 800.41003, 475.71002, 803.22003);
        ((GeneralPath) shape).curveTo(481.60004, 807.24005, 489.12003, 805.9, 495.79, 805.76);
        ((GeneralPath) shape).curveTo(491.77002, 809.4, 487.22, 813.75, 481.29, 812.78);
        ((GeneralPath) shape).curveTo(471.08002, 811.7, 463.27002, 804.54004, 455.81, 798.22003);
        ((GeneralPath) shape).curveTo(452.26, 795.27, 448.87, 791.58, 444.19, 790.56006);
        ((GeneralPath) shape).curveTo(435.89, 789.3301, 427.59, 791.49005, 419.29, 790.97003);
        ((GeneralPath) shape).curveTo(414.94, 790.60004, 410.58002, 788.36005, 408.35, 784.51);
        ((GeneralPath) shape).curveTo(407.42, 782.61, 406.93, 780.55, 406.07, 778.64);
        ((GeneralPath) shape).curveTo(401.36002, 777.76, 396.57, 778.14, 391.87, 778.74);
        ((GeneralPath) shape).curveTo(383.41998, 779.72, 374.84, 780.12, 366.61, 782.44);
        ((GeneralPath) shape).curveTo(363.28, 783.5, 360.49, 785.7, 357.68997, 787.72003);
        ((GeneralPath) shape).curveTo(363.52997, 777.64, 368.99997, 767.30005, 375.88998, 757.87006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_282
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(77.96, 751.87);
        ((GeneralPath) shape).curveTo(86.729996, 751.92, 95.5, 751.69, 104.25, 751.04);
        ((GeneralPath) shape).curveTo(109.23, 751.1, 114.33, 751.07, 119.09, 752.69995);
        ((GeneralPath) shape).curveTo(113.57, 752.11993, 108.009995, 752.1, 102.46999, 752.44995);
        ((GeneralPath) shape).curveTo(90.56999, 753.1, 78.649994, 753.4199, 66.73999, 753.80994);
        ((GeneralPath) shape).curveTo(70.45999, 753.05994, 74.17999, 752.2299, 77.95999, 751.86993);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x656E66));
        g.fill(shape);

        // _0_0_283
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(50.44, 755.46);
        ((GeneralPath) shape).curveTo(53.719997, 754.91003, 57.0, 753.99005, 60.35, 754.06);
        ((GeneralPath) shape).curveTo(61.879997, 754.11, 63.41, 754.15, 64.94, 754.13);
        ((GeneralPath) shape).curveTo(58.18, 756.25, 51.04, 756.34, 44.210003, 758.12);
        ((GeneralPath) shape).curveTo(35.020004, 759.66, 27.100002, 764.77997, 18.970003, 768.99);
        ((GeneralPath) shape).curveTo(21.410004, 765.62, 25.430004, 763.95, 28.940002, 761.95);
        ((GeneralPath) shape).curveTo(35.49, 758.12, 43.140003, 757.04004, 50.440002, 755.46);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x818584));
        g.fill(shape);

        // _0_0_284
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(87.98, 760.0);
        ((GeneralPath) shape).curveTo(96.07001, 758.6, 104.33, 758.84, 112.51, 758.7);
        ((GeneralPath) shape).curveTo(113.520004, 760.36, 114.44, 762.09, 115.130005, 763.92);
        ((GeneralPath) shape).curveTo(113.020004, 767.85, 111.23, 771.97, 110.15, 776.31);
        ((GeneralPath) shape).curveTo(109.880005, 773.22, 110.67, 769.92, 109.200005, 767.1);
        ((GeneralPath) shape).curveTo(99.00001, 768.66, 88.82001, 772.98, 78.380005, 771.13);
        ((GeneralPath) shape).curveTo(73.28001, 770.21, 70.29001, 765.66003, 65.79001, 763.56);
        ((GeneralPath) shape).curveTo(73.08001, 761.77997, 80.61001, 761.35, 87.98001, 760.0);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_285
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(52.44, 765.23);
        ((GeneralPath) shape).curveTo(56.86, 764.51, 61.35, 764.23, 65.79, 763.56);
        ((GeneralPath) shape).curveTo(63.05, 765.07, 58.120003, 764.66, 56.760002, 768.12);
        ((GeneralPath) shape).curveTo(62.25, 770.63, 68.87, 770.06, 73.82, 773.95);
        ((GeneralPath) shape).curveTo(79.229996, 776.82, 82.16, 783.28, 81.96, 789.25);
        ((GeneralPath) shape).curveTo(83.09, 794.47, 80.25, 798.95, 78.18, 803.41);
        ((GeneralPath) shape).curveTo(77.31, 805.16, 78.83, 807.38995, 80.66, 807.69995);
        ((GeneralPath) shape).curveTo(86.14001, 808.50995, 91.41, 806.66, 96.73, 805.69995);
        ((GeneralPath) shape).curveTo(101.73, 804.6, 106.840004, 804.1, 111.850006, 803.02997);
        ((GeneralPath) shape).curveTo(111.33001, 800.79, 110.69, 798.58997, 110.200005, 796.35);
        ((GeneralPath) shape).curveTo(112.21001, 799.86, 115.08, 803.04, 116.00001, 807.06995);
        ((GeneralPath) shape).curveTo(110.850006, 808.18994, 105.58001, 808.51996, 100.380005, 809.30994);
        ((GeneralPath) shape).curveTo(86.060005, 811.68994, 71.50001, 811.2799, 57.100006, 812.7299);
        ((GeneralPath) shape).curveTo(53.500008, 814.42993, 51.750008, 811.2999, 49.100006, 810.1599);
        ((GeneralPath) shape).curveTo(41.450005, 809.74994, 33.800007, 810.1699, 26.150005, 809.86993);
        ((GeneralPath) shape).curveTo(23.340006, 807.9799, 21.130005, 804.87994, 20.950005, 801.42993);
        ((GeneralPath) shape).curveTo(20.680004, 794.9099, 20.780005, 788.37994, 21.280005, 781.8999);
        ((GeneralPath) shape).curveTo(21.470005, 779.9099, 23.160004, 778.5799, 24.530005, 777.3399);
        ((GeneralPath) shape).curveTo(28.530005, 774.2399, 32.690002, 771.0899, 37.600006, 769.61993);
        ((GeneralPath) shape).curveTo(42.530006, 768.11993, 47.410007, 766.39996, 52.440006, 765.2299);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_286
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(65.79, 763.56);
        ((GeneralPath) shape).curveTo(70.29, 765.66, 73.28, 770.21, 78.380005, 771.13);
        ((GeneralPath) shape).curveTo(88.82001, 772.98, 99.00001, 768.66003, 109.200005, 767.1);
        ((GeneralPath) shape).curveTo(110.670006, 769.92, 109.880005, 773.22, 110.15, 776.31);
        ((GeneralPath) shape).curveTo(109.86, 782.98, 109.630005, 789.67, 110.200005, 796.35);
        ((GeneralPath) shape).curveTo(110.69, 798.58997, 111.33, 800.79, 111.850006, 803.02997);
        ((GeneralPath) shape).curveTo(106.840004, 804.1, 101.73, 804.6, 96.73, 805.69995);
        ((GeneralPath) shape).curveTo(91.41, 806.66, 86.14, 808.50995, 80.66, 807.69995);
        ((GeneralPath) shape).curveTo(78.83, 807.38995, 77.310005, 805.16, 78.18, 803.41);
        ((GeneralPath) shape).curveTo(80.25, 798.94995, 83.09, 794.47, 81.96, 789.25);
        ((GeneralPath) shape).curveTo(82.159996, 783.28, 79.229996, 776.82, 73.82, 773.95);
        ((GeneralPath) shape).curveTo(68.87, 770.06, 62.25, 770.63, 56.760002, 768.12);
        ((GeneralPath) shape).curveTo(58.120003, 764.66, 63.050003, 765.07, 65.79, 763.56);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBEF4F9));
        g.fill(shape);

        // _0_0_287
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.09, 794.51);
        ((GeneralPath) shape).curveTo(4.16, 787.36, 6.7, 779.23, 13.06, 775.03);
        ((GeneralPath) shape).curveTo(10.38, 779.80005, 6.9400005, 784.24005, 5.3, 789.52);
        ((GeneralPath) shape).curveTo(2.4400003, 799.18, 6.28, 808.92004, 8.87, 818.17004);
        ((GeneralPath) shape).curveTo(4.18, 811.37006, 2.7199998, 802.65, 3.0899997, 794.5101);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8C8D8D));
        g.fill(shape);

        // _0_0_288
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(391.87, 778.74);
        ((GeneralPath) shape).curveTo(396.57, 778.14, 401.36, 777.76, 406.07, 778.64);
        ((GeneralPath) shape).curveTo(406.93, 780.55, 407.42, 782.61, 408.35, 784.51);
        ((GeneralPath) shape).curveTo(410.58002, 788.36, 414.94, 790.60004, 419.29, 790.97003);
        ((GeneralPath) shape).curveTo(427.59, 791.49005, 435.89, 789.33, 444.19, 790.56006);
        ((GeneralPath) shape).curveTo(448.87, 791.5801, 452.26, 795.2701, 455.81, 798.22003);
        ((GeneralPath) shape).curveTo(463.27, 804.54004, 471.08, 811.7, 481.29, 812.78);
        ((GeneralPath) shape).curveTo(487.22, 813.75, 491.77002, 809.4, 495.79, 805.76);
        ((GeneralPath) shape).curveTo(500.28, 804.0, 505.13, 802.89, 509.15, 800.12);
        ((GeneralPath) shape).curveTo(515.45, 796.54, 520.16, 790.94, 525.21, 785.88);
        ((GeneralPath) shape).curveTo(527.46, 788.98, 528.51, 792.84, 531.01, 795.82);
        ((GeneralPath) shape).curveTo(534.63, 801.26, 540.81, 805.2, 547.53, 804.93);
        ((GeneralPath) shape).curveTo(555.14, 804.95, 563.60004, 806.33997, 570.61005, 802.55);
        ((GeneralPath) shape).curveTo(575.57007, 800.06, 580.02, 796.67, 584.16003, 793.0);
        ((GeneralPath) shape).curveTo(584.41003, 793.94, 584.68005, 794.9, 584.94006, 795.86);
        ((GeneralPath) shape).curveTo(581.12006, 804.89, 578.30005, 814.42, 577.32007, 824.2);
        ((GeneralPath) shape).curveTo(576.5301, 831.72003, 573.05005, 838.61, 572.0801, 846.10004);
        ((GeneralPath) shape).curveTo(570.1601, 856.52, 566.94006, 866.64, 563.7601, 876.73004);
        ((GeneralPath) shape).curveTo(558.80005, 890.98004, 553.43005, 905.12006, 546.55005, 918.57007);
        ((GeneralPath) shape).curveTo(542.22003, 927.2101, 537.44006, 935.75006, 531.11005, 943.12006);
        ((GeneralPath) shape).curveTo(522.02, 954.04004, 512.86005, 964.92004, 504.15005, 976.1401);
        ((GeneralPath) shape).curveTo(494.17004, 988.0901, 483.52005, 999.50006, 472.06006, 1010.00006);
        ((GeneralPath) shape).curveTo(467.50006, 1014.30005, 462.18005, 1017.60004, 456.96005, 1020.9001);
        ((GeneralPath) shape).curveTo(449.82004, 1025.3, 441.90005, 1028.8, 433.47006, 1029.3);
        ((GeneralPath) shape).curveTo(425.04007, 1030.3, 416.35007, 1031.0, 408.59006, 1034.6001);
        ((GeneralPath) shape).curveTo(403.94006, 1036.8, 398.97006, 1038.1001, 394.37006, 1040.4001);
        ((GeneralPath) shape).curveTo(388.97006, 1043.0001, 383.58005, 1045.7002, 378.06006, 1048.1001);
        ((GeneralPath) shape).curveTo(369.22006, 1049.1001, 360.19006, 1049.4001, 351.44006, 1047.6001);
        ((GeneralPath) shape).curveTo(335.25006, 1044.4001, 318.70007, 1043.9001, 302.25006, 1043.8);
        ((GeneralPath) shape).curveTo(288.77005, 1042.9, 275.26007, 1043.0, 261.77005, 1042.4);
        ((GeneralPath) shape).curveTo(252.64005, 1041.7001, 243.55005, 1043.6, 234.42004, 1043.0);
        ((GeneralPath) shape).curveTo(229.57004, 1044.1, 226.21004, 1040.5, 222.54004, 1038.2);
        ((GeneralPath) shape).curveTo(218.89005, 1035.7999, 214.82004, 1034.2, 211.09004, 1032.0);
        ((GeneralPath) shape).curveTo(207.43004, 1029.8, 203.67004, 1027.8, 199.65004, 1026.3);
        ((GeneralPath) shape).curveTo(188.89005, 1022.60004, 178.86005, 1017.2001, 168.55003, 1012.4);
        ((GeneralPath) shape).curveTo(168.57004, 1011.80005, 168.60004, 1010.80005, 168.62004, 1010.2);
        ((GeneralPath) shape).curveTo(173.19005, 1008.5, 178.23004, 1007.5, 181.97005, 1004.10004);
        ((GeneralPath) shape).curveTo(189.78004, 998.98004, 192.92004, 988.88007, 193.04004, 980.01);
        ((GeneralPath) shape).curveTo(193.19003, 972.65, 186.92004, 966.89, 187.29004, 959.49);
        ((GeneralPath) shape).curveTo(186.89005, 952.23, 185.45004, 944.77997, 181.10004, 938.82);
        ((GeneralPath) shape).curveTo(177.34004, 932.12, 171.13004, 927.43, 166.03003, 921.88);
        ((GeneralPath) shape).curveTo(160.53003, 911.71, 155.31003, 901.33, 151.61003, 890.36);
        ((GeneralPath) shape).curveTo(148.78003, 881.36, 147.00003, 872.11, 145.17003, 862.88);
        ((GeneralPath) shape).curveTo(143.88004, 856.85, 141.32002, 851.19, 139.93002, 845.2);
        ((GeneralPath) shape).curveTo(144.02002, 842.52, 149.12003, 842.44, 153.79002, 841.77);
        ((GeneralPath) shape).curveTo(168.42003, 840.38, 182.83002, 837.31, 197.43002, 835.68);
        ((GeneralPath) shape).curveTo(202.41002, 835.06, 206.39003, 838.91, 211.03003, 840.05);
        ((GeneralPath) shape).curveTo(219.22003, 841.85, 227.66003, 841.64996, 235.99002, 841.99);
        ((GeneralPath) shape).curveTo(245.36002, 841.95996, 254.59003, 843.81, 263.84003, 845.06);
        ((GeneralPath) shape).curveTo(266.52002, 845.5, 269.25003, 845.81, 271.83002, 846.76);
        ((GeneralPath) shape).curveTo(272.02002, 849.26, 272.15002, 851.78, 272.21002, 854.31);
        ((GeneralPath) shape).curveTo(271.53003, 887.92, 272.50003, 921.55, 271.75003, 955.17);
        ((GeneralPath) shape).curveTo(269.98004, 937.16, 271.66003, 919.05, 270.92004, 901.01996);
        ((GeneralPath) shape).lineTo(269.92004, 900.92);
        ((GeneralPath) shape).curveTo(269.81006, 917.82996, 270.40005, 934.75, 269.58005, 951.64996);
        ((GeneralPath) shape).curveTo(269.19003, 955.83997, 269.60004, 960.22, 268.61005, 964.37994);
        ((GeneralPath) shape).curveTo(266.89005, 969.19995, 262.03006, 972.5499, 261.39005, 977.80994);
        ((GeneralPath) shape).curveTo(261.13004, 981.5299, 260.57004, 985.4899, 261.49005, 989.20996);
        ((GeneralPath) shape).curveTo(263.40005, 995.92, 268.44006, 1001.89996, 275.18005, 1004.1);
        ((GeneralPath) shape).curveTo(282.83005, 1007.39996, 292.06006, 1005.5, 298.41006, 1000.3);
        ((GeneralPath) shape).curveTo(301.98007, 996.55, 303.78006, 991.62, 306.16006, 987.12);
        ((GeneralPath) shape).curveTo(311.97006, 978.31, 315.84006, 968.31, 318.11008, 958.02997);
        ((GeneralPath) shape).curveTo(319.82007, 946.07996, 318.76007, 933.97, 319.0601, 921.97);
        ((GeneralPath) shape).curveTo(318.8501, 915.82996, 319.55008, 909.63995, 318.52008, 903.56995);
        ((GeneralPath) shape).curveTo(316.55008, 894.6699, 315.79007, 885.52997, 313.1901, 876.76996);
        ((GeneralPath) shape).curveTo(311.4201, 870.7399, 310.8401, 864.13995, 307.1501, 858.86);
        ((GeneralPath) shape).curveTo(304.95007, 855.47, 302.8801, 851.92, 300.01007, 849.05);
        ((GeneralPath) shape).curveTo(297.45007, 846.83, 294.58008, 845.01, 292.01007, 842.85);
        ((GeneralPath) shape).curveTo(301.41006, 841.94, 310.82007, 840.63995, 319.9001, 837.97);
        ((GeneralPath) shape).curveTo(324.5001, 836.75, 329.1501, 834.97, 332.6901, 831.67);
        ((GeneralPath) shape).curveTo(337.2601, 827.81, 339.4701, 822.1, 341.6901, 816.72);
        ((GeneralPath) shape).curveTo(343.8601, 810.87, 347.80008, 805.89996, 350.1501, 800.12994);
        ((GeneralPath) shape).curveTo(352.3701, 795.81995, 354.92007, 791.68994, 357.6901, 787.72);
        ((GeneralPath) shape).curveTo(360.49008, 785.69995, 363.2801, 783.5, 366.6101, 782.43994);
        ((GeneralPath) shape).curveTo(374.84012, 780.11993, 383.4201, 779.72, 391.87012, 778.7399);
        ((GeneralPath) shape).moveTo(432.2101, 832.2199);
        ((GeneralPath) shape).curveTo(430.25012, 835.24994, 431.90012, 839.0299, 431.7301, 842.30994);
        ((GeneralPath) shape).curveTo(432.8601, 851.7999, 431.1701, 861.2899, 430.7301, 870.7799);
        ((GeneralPath) shape).curveTo(430.6901, 880.4399, 427.3801, 889.6399, 426.2201, 899.1599);
        ((GeneralPath) shape).curveTo(424.0701, 909.11993, 421.21008, 918.9499, 417.3801, 928.3999);
        ((GeneralPath) shape).curveTo(414.6101, 937.3899, 411.2001, 946.1499, 408.1601, 955.0399);
        ((GeneralPath) shape).curveTo(405.3001, 959.1399, 401.4001, 962.3299, 398.0801, 966.0299);
        ((GeneralPath) shape).curveTo(391.4801, 973.8499, 391.9201, 986.0499, 397.7101, 994.2299);
        ((GeneralPath) shape).curveTo(402.7101, 1000.6999, 411.1401, 1004.6999, 419.38013, 1003.49994);
        ((GeneralPath) shape).curveTo(429.77014, 1001.5999, 439.4601, 996.30994, 446.97012, 988.9699);
        ((GeneralPath) shape).curveTo(453.92014, 981.1099, 456.48013, 970.2099, 456.81012, 959.9499);
        ((GeneralPath) shape).curveTo(458.98013, 954.2499, 461.37012, 948.5699, 462.3601, 942.5099);
        ((GeneralPath) shape).curveTo(463.8301, 937.29987, 466.84012, 932.35986, 465.7601, 926.72986);
        ((GeneralPath) shape).curveTo(466.40012, 926.6899, 467.6601, 926.6199, 468.2901, 926.57983);
        ((GeneralPath) shape).curveTo(469.1501, 918.39984, 469.0001, 910.09985, 470.8901, 902.0698);
        ((GeneralPath) shape).curveTo(471.9601, 899.0398, 472.7601, 895.82983, 472.6801, 892.59985);
        ((GeneralPath) shape).curveTo(473.2401, 880.28986, 473.2901, 867.9498, 472.6101, 855.66986);
        ((GeneralPath) shape).curveTo(472.1401, 851.78986, 469.62012, 848.45984, 469.4401, 844.48987);
        ((GeneralPath) shape).curveTo(468.6601, 839.97986, 466.3201, 835.95984, 463.9201, 832.1399);
        ((GeneralPath) shape).curveTo(462.0001, 828.2799, 458.0101, 826.1399, 454.3501, 824.2899);
        ((GeneralPath) shape).curveTo(446.5401, 822.74994, 436.0901, 824.3399, 432.21008, 832.2199);
        ((GeneralPath) shape).moveTo(381.21008, 828.3399);
        ((GeneralPath) shape).curveTo(375.83008, 828.8099, 370.7201, 831.1899, 367.1301, 835.2399);
        ((GeneralPath) shape).curveTo(361.6701, 843.49994, 360.2201, 853.55994, 359.2201, 863.2099);
        ((GeneralPath) shape).curveTo(357.3801, 879.0299, 358.0601, 894.9799, 358.0001, 910.8799);
        ((GeneralPath) shape).curveTo(358.46008, 919.5799, 358.8101, 928.4299, 361.0901, 936.8899);
        ((GeneralPath) shape).curveTo(363.1001, 942.9099, 365.0701, 948.9199, 366.6601, 955.0799);
        ((GeneralPath) shape).curveTo(367.1501, 957.54987, 369.3601, 959.2699, 371.7501, 959.7499);
        ((GeneralPath) shape).curveTo(377.4501, 960.3899, 383.6001, 959.6499, 388.46008, 956.40985);
        ((GeneralPath) shape).curveTo(392.95007, 953.3699, 397.73007, 950.14984, 400.04007, 945.03986);
        ((GeneralPath) shape).curveTo(404.80008, 937.09985, 407.13007, 927.98987, 407.88007, 918.8199);
        ((GeneralPath) shape).curveTo(408.51007, 895.4599, 407.97006, 871.85986, 403.10007, 848.9299);
        ((GeneralPath) shape).curveTo(401.75006, 843.54987, 399.08008, 838.5799, 396.04007, 833.9999);
        ((GeneralPath) shape).curveTo(391.78006, 830.85986, 386.66006, 828.1199, 381.21008, 828.3399);
        ((GeneralPath) shape).moveTo(490.63007, 893.3899);
        ((GeneralPath) shape).curveTo(487.48007, 894.2599, 484.91006, 896.54987, 482.92007, 899.0699);
        ((GeneralPath) shape).curveTo(478.41006, 905.28986, 476.3701, 912.8799, 475.1501, 920.35986);
        ((GeneralPath) shape).curveTo(475.01007, 924.6999, 474.61008, 929.40985, 476.23007, 933.57983);
        ((GeneralPath) shape).curveTo(477.73007, 936.0098, 480.46008, 938.09985, 483.61008, 936.91986);
        ((GeneralPath) shape).curveTo(486.38007, 935.88983, 489.61008, 934.78986, 491.13007, 932.0599);
        ((GeneralPath) shape).curveTo(494.47006, 926.2099, 497.08008, 919.97986, 499.94006, 913.8999);
        ((GeneralPath) shape).curveTo(502.22006, 909.1899, 503.37006, 903.6999, 501.95007, 898.5599);
        ((GeneralPath) shape).curveTo(499.41006, 895.0699, 495.33008, 891.5899, 490.63007, 893.3899);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBEF4F9));
        g.fill(shape);

        // _0_0_289
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(215.86, 793.64);
        ((GeneralPath) shape).curveTo(218.05, 792.84, 220.22, 791.63, 222.72, 792.61);
        ((GeneralPath) shape).curveTo(223.44, 796.01, 223.28, 799.64, 224.84, 802.83997);
        ((GeneralPath) shape).curveTo(227.62, 808.87994, 233.43, 812.64996, 238.89, 816.04);
        ((GeneralPath) shape).curveTo(242.04, 818.01996, 245.79, 818.44, 249.43, 818.73);
        ((GeneralPath) shape).curveTo(261.07, 819.44, 272.74, 818.57, 284.38998, 819.12);
        ((GeneralPath) shape).curveTo(290.27, 819.4, 295.74997, 821.95, 301.66998, 821.97);
        ((GeneralPath) shape).curveTo(307.78998, 822.3, 313.90997, 822.22, 320.02997, 821.74);
        ((GeneralPath) shape).curveTo(327.24997, 820.04, 333.92996, 816.35, 339.55997, 811.56);
        ((GeneralPath) shape).curveTo(343.14996, 807.81, 346.49997, 803.82, 350.14996, 800.13);
        ((GeneralPath) shape).curveTo(347.79996, 805.9, 343.85995, 810.87, 341.68997, 816.72003);
        ((GeneralPath) shape).curveTo(339.46997, 822.10004, 337.25998, 827.81006, 332.68997, 831.67004);
        ((GeneralPath) shape).curveTo(329.14996, 834.97003, 324.49997, 836.75006, 319.89996, 837.97003);
        ((GeneralPath) shape).curveTo(310.81998, 840.64, 301.40997, 841.94, 292.00995, 842.85004);
        ((GeneralPath) shape).curveTo(294.57996, 845.01, 297.44995, 846.83, 300.00995, 849.05005);
        ((GeneralPath) shape).curveTo(297.22995, 847.5101, 294.28995, 846.23004, 291.27994, 845.25006);
        ((GeneralPath) shape).curveTo(286.87994, 844.06006, 282.98993, 846.47003, 279.00995, 847.79004);
        ((GeneralPath) shape).curveTo(277.37994, 846.59, 277.91995, 843.84, 275.99994, 842.79004);
        ((GeneralPath) shape).curveTo(275.67993, 843.01, 275.02994, 843.45, 274.69995, 843.67004);
        ((GeneralPath) shape).curveTo(273.91995, 847.2001, 273.22995, 850.81006, 272.20996, 854.31006);
        ((GeneralPath) shape).curveTo(272.14996, 851.78, 272.01996, 849.2601, 271.82996, 846.7601);
        ((GeneralPath) shape).curveTo(269.24997, 845.81006, 266.51996, 845.50006, 263.83997, 845.06006);
        ((GeneralPath) shape).curveTo(254.58997, 843.81006, 245.35997, 841.9601, 235.98996, 841.99005);
        ((GeneralPath) shape).curveTo(227.65996, 841.65, 219.21996, 841.85004, 211.02997, 840.05005);
        ((GeneralPath) shape).curveTo(206.38997, 838.91003, 202.40997, 835.06006, 197.42996, 835.68005);
        ((GeneralPath) shape).curveTo(182.82996, 837.31006, 168.41997, 840.38007, 153.78996, 841.7701);
        ((GeneralPath) shape).curveTo(149.11996, 842.44006, 144.01996, 842.5201, 139.92996, 845.2001);
        ((GeneralPath) shape).curveTo(141.31996, 851.19006, 143.87996, 856.8501, 145.16997, 862.88007);
        ((GeneralPath) shape).curveTo(146.99997, 872.11005, 148.77997, 881.36005, 151.60997, 890.36005);
        ((GeneralPath) shape).curveTo(155.30997, 901.33, 160.52997, 911.71, 166.02997, 921.88007);
        ((GeneralPath) shape).curveTo(171.12997, 927.43005, 177.33997, 932.12006, 181.09998, 938.82007);
        ((GeneralPath) shape).curveTo(185.44998, 944.7801, 186.88997, 952.23004, 187.28998, 959.49005);
        ((GeneralPath) shape).curveTo(186.91998, 966.8901, 193.18997, 972.65, 193.03998, 980.0101);
        ((GeneralPath) shape).curveTo(192.91998, 988.88007, 189.77998, 998.98004, 181.96997, 1004.1001);
        ((GeneralPath) shape).curveTo(178.22997, 1007.5001, 173.18997, 1008.5001, 168.61996, 1010.2001);
        ((GeneralPath) shape).curveTo(168.59996, 1010.80005, 168.56996, 1011.80005, 168.54996, 1012.4001);
        ((GeneralPath) shape).curveTo(160.91995, 1008.50006, 153.16995, 1004.8001, 146.05995, 999.94006);
        ((GeneralPath) shape).curveTo(130.95995, 989.73004, 115.83995, 979.0301, 103.81995, 965.18005);
        ((GeneralPath) shape).curveTo(97.22995, 956.41003, 88.959946, 948.91003, 83.92995, 939.04004);
        ((GeneralPath) shape).curveTo(84.21995, 937.26, 84.56995, 935.49005, 84.67995, 933.7);
        ((GeneralPath) shape).curveTo(82.349945, 931.15, 79.489944, 929.21, 76.78995, 927.11);
        ((GeneralPath) shape).curveTo(72.709946, 918.97, 68.58995, 910.76996, 66.01994, 902.0);
        ((GeneralPath) shape).curveTo(63.749943, 894.09, 59.809944, 886.73, 58.399944, 878.57);
        ((GeneralPath) shape).curveTo(56.189945, 866.86, 55.119946, 854.95, 55.029945, 843.05);
        ((GeneralPath) shape).curveTo(54.939945, 835.06, 53.779945, 827.14996, 54.259945, 819.18);
        ((GeneralPath) shape).curveTo(77.779945, 819.17, 100.889946, 813.46, 124.42995, 814.0);
        ((GeneralPath) shape).curveTo(129.38995, 814.54, 134.09995, 816.59, 139.16995, 816.22);
        ((GeneralPath) shape).curveTo(146.35995, 816.08997, 153.72995, 816.0, 160.56995, 813.51996);
        ((GeneralPath) shape).curveTo(166.42995, 811.63995, 172.55995, 810.63995, 178.23994, 808.23);
        ((GeneralPath) shape).curveTo(182.06995, 806.63995, 185.86995, 804.94, 189.84995, 803.75);
        ((GeneralPath) shape).curveTo(188.51994, 804.71, 187.22995, 805.71, 185.95995, 806.76);
        ((GeneralPath) shape).curveTo(193.34995, 807.25, 200.61995, 805.59, 207.94995, 804.91003);
        ((GeneralPath) shape).curveTo(212.76996, 804.36005, 217.63995, 804.37006, 222.45995, 803.78);
        ((GeneralPath) shape).curveTo(223.09995, 800.30005, 221.47995, 796.84, 220.64995, 793.57);
        ((GeneralPath) shape).curveTo(219.04994, 793.46, 217.44995, 793.54, 215.85995, 793.64);
        ((GeneralPath) shape).moveTo(109.22996, 839.16003);
        ((GeneralPath) shape).curveTo(108.08996, 839.84, 107.079956, 841.02, 107.04996, 842.43005);
        ((GeneralPath) shape).curveTo(106.18996, 850.94006, 105.999954, 859.48004, 105.91996, 868.04004);
        ((GeneralPath) shape).curveTo(105.94996, 875.65, 105.65996, 883.38007, 107.12996, 890.91003);
        ((GeneralPath) shape).curveTo(108.63996, 898.60004, 110.15996, 906.30005, 112.11996, 913.9);
        ((GeneralPath) shape).curveTo(116.95996, 935.5, 126.84996, 955.97003, 140.89996, 973.08);
        ((GeneralPath) shape).curveTo(147.59996, 981.45, 158.46997, 987.72003, 169.48996, 985.88);
        ((GeneralPath) shape).curveTo(169.82996, 985.58, 170.51996, 984.98, 170.85995, 984.68);
        ((GeneralPath) shape).curveTo(171.36995, 981.47, 170.83995, 978.14, 170.15996, 975.02);
        ((GeneralPath) shape).curveTo(166.77995, 962.27, 161.98996, 949.96, 157.38995, 937.62);
        ((GeneralPath) shape).curveTo(155.61995, 932.92, 154.93996, 927.92, 153.99995, 923.02997);
        ((GeneralPath) shape).curveTo(152.15996, 914.57996, 150.48996, 906.07996, 148.15996, 897.74994);
        ((GeneralPath) shape).curveTo(145.72997, 881.50995, 143.71996, 864.39996, 134.83997, 850.19995);
        ((GeneralPath) shape).curveTo(132.72997, 846.68994, 129.77997, 843.50995, 125.939964, 841.92993);
        ((GeneralPath) shape).curveTo(122.87997, 840.6599, 119.67996, 838.9099, 116.24996, 839.38995);
        ((GeneralPath) shape).curveTo(113.909966, 839.7399, 111.55996, 839.4899, 109.229965, 839.16);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_290
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(215.86, 793.64);
        ((GeneralPath) shape).curveTo(217.45, 793.54004, 219.05, 793.46, 220.65, 793.57);
        ((GeneralPath) shape).curveTo(221.48, 796.84, 223.09999, 800.3, 222.45999, 803.78);
        ((GeneralPath) shape).curveTo(217.63998, 804.37006, 212.76999, 804.36005, 207.95, 804.91003);
        ((GeneralPath) shape).curveTo(200.62, 805.59, 193.34999, 807.25006, 185.95999, 806.76);
        ((GeneralPath) shape).curveTo(187.23, 805.71, 188.51999, 804.71, 189.84999, 803.75);
        ((GeneralPath) shape).curveTo(198.70999, 800.9, 207.16998, 796.97, 215.85999, 793.64);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBDF2F7));
        g.fill(shape);

        // _0_0_291
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(119.61, 794.88);
        ((GeneralPath) shape).curveTo(122.39, 797.73, 125.520004, 800.21, 128.83, 802.44);
        ((GeneralPath) shape).curveTo(133.12, 804.45, 138.11, 803.38, 142.67, 804.01);
        ((GeneralPath) shape).curveTo(143.79, 808.18, 149.04, 807.65, 152.27, 808.54004);
        ((GeneralPath) shape).curveTo(146.22, 809.44006, 140.03, 809.25006, 133.99, 808.41003);
        ((GeneralPath) shape).curveTo(127.130005, 806.99005, 121.740005, 801.46, 119.61001, 794.88);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA9CAC8));
        g.fill(shape);

        // _0_0_292
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(142.67, 804.01);
        ((GeneralPath) shape).curveTo(150.83, 803.61, 158.67, 800.93, 166.77, 800.2);
        ((GeneralPath) shape).curveTo(169.11, 799.97003, 170.49, 801.84, 171.07, 803.86);
        ((GeneralPath) shape).curveTo(164.92001, 805.85, 158.61, 807.29, 152.27, 808.54);
        ((GeneralPath) shape).curveTo(149.04001, 807.64996, 143.79001, 808.18, 142.67, 804.00995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCAF2F5));
        g.fill(shape);

        // _0_0_293
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(593.71, 810.73);
        ((GeneralPath) shape).curveTo(595.51, 806.91, 599.67004, 805.27997, 602.97003, 803.06);
        ((GeneralPath) shape).curveTo(600.19, 805.93, 596.76, 808.37, 594.96, 812.06);
        ((GeneralPath) shape).curveTo(591.47003, 818.79, 590.80005, 826.52, 588.77, 833.74);
        ((GeneralPath) shape).curveTo(583.69, 850.76, 578.96, 867.87, 573.9, 884.89);
        ((GeneralPath) shape).curveTo(570.68005, 894.87, 566.42004, 904.46, 562.09, 913.99);
        ((GeneralPath) shape).curveTo(560.79004, 916.27, 560.05005, 919.25, 557.89, 920.89);
        ((GeneralPath) shape).curveTo(559.78, 914.49, 563.05, 908.64, 565.45, 902.44);
        ((GeneralPath) shape).curveTo(568.3, 895.18, 571.27, 887.96, 573.49, 880.48);
        ((GeneralPath) shape).curveTo(578.17, 864.69995, 583.67, 849.13995, 587.05, 833.01);
        ((GeneralPath) shape).curveTo(588.82, 825.47003, 590.20996, 817.69, 593.70996, 810.73);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x82989A));
        g.fill(shape);

        // _0_0_294
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.81, 821.21);
        ((GeneralPath) shape).curveTo(15.460001, 824.4, 19.95, 828.17004, 25.43, 829.83);
        ((GeneralPath) shape).curveTo(29.5, 830.01, 33.56, 828.83, 37.63, 829.44);
        ((GeneralPath) shape).curveTo(38.32, 835.31, 38.030003, 841.24, 38.73, 847.14);
        ((GeneralPath) shape).curveTo(42.21, 873.27, 49.41, 898.89, 59.96, 923.05005);
        ((GeneralPath) shape).curveTo(64.01, 932.88007, 70.46, 941.4501, 74.909996, 951.09);
        ((GeneralPath) shape).curveTo(72.24999, 948.97003, 70.729996, 945.81, 68.99, 942.98004);
        ((GeneralPath) shape).curveTo(66.189995, 937.81006, 63.01, 932.85004, 60.409996, 927.59);
        ((GeneralPath) shape).curveTo(52.269997, 908.38, 44.719997, 888.78, 40.67, 868.26);
        ((GeneralPath) shape).curveTo(40.14, 860.16003, 38.199997, 852.27, 36.92, 844.28);
        ((GeneralPath) shape).curveTo(35.98, 839.60004, 32.82, 835.60004, 29.429998, 832.36005);
        ((GeneralPath) shape).curveTo(24.559998, 830.38007, 19.119999, 829.50006, 14.999998, 825.96);
        ((GeneralPath) shape).curveTo(12.609998, 825.13, 11.709998, 823.2, 10.809998, 821.21);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9CC6C9));
        g.fill(shape);

        // _0_0_295
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(432.21, 832.22);
        ((GeneralPath) shape).curveTo(436.09, 824.33997, 446.53998, 822.75, 454.34998, 824.29);
        ((GeneralPath) shape).curveTo(458.00998, 826.13995, 461.99997, 828.27997, 463.91998, 832.13995);
        ((GeneralPath) shape).curveTo(466.31998, 835.95996, 468.65997, 839.98, 469.43997, 844.4899);
        ((GeneralPath) shape).curveTo(469.61996, 848.4599, 472.13998, 851.7899, 472.61, 855.6699);
        ((GeneralPath) shape).curveTo(473.28998, 867.94995, 473.24, 880.2899, 472.68, 892.5999);
        ((GeneralPath) shape).curveTo(472.75998, 895.8299, 471.96, 899.0399, 470.88998, 902.0699);
        ((GeneralPath) shape).curveTo(468.99997, 910.0999, 469.15, 918.3999, 468.28998, 926.5799);
        ((GeneralPath) shape).curveTo(467.65997, 926.6199, 466.39996, 926.6899, 465.75998, 926.7299);
        ((GeneralPath) shape).curveTo(466.83997, 932.3599, 463.83, 937.2999, 462.36, 942.50995);
        ((GeneralPath) shape).curveTo(461.37, 948.56995, 458.97998, 954.24994, 456.81, 959.94995);
        ((GeneralPath) shape).curveTo(449.72, 973.38995, 440.45, 987.33997, 425.63, 992.95996);
        ((GeneralPath) shape).curveTo(418.01, 995.67, 407.28, 993.74, 404.2, 985.45996);
        ((GeneralPath) shape).curveTo(401.06, 975.19995, 405.22, 964.76996, 408.16, 955.04);
        ((GeneralPath) shape).curveTo(411.2, 946.14996, 414.61002, 937.38995, 417.38, 928.39996);
        ((GeneralPath) shape).curveTo(421.21, 918.94995, 424.07, 909.11993, 426.22, 899.16);
        ((GeneralPath) shape).curveTo(427.38, 889.63995, 430.69, 880.44, 430.73, 870.77997);
        ((GeneralPath) shape).curveTo(431.17, 861.29, 432.86002, 851.8, 431.73, 842.31);
        ((GeneralPath) shape).curveTo(431.90002, 839.02997, 430.25, 835.25, 432.21002, 832.22);
        ((GeneralPath) shape).moveTo(445.72003, 835.31);
        ((GeneralPath) shape).curveTo(444.39005, 835.47, 441.73004, 835.81, 440.40002, 835.98);
        ((GeneralPath) shape).curveTo(437.68002, 839.77997, 439.51, 844.77997, 438.97003, 849.08997);
        ((GeneralPath) shape).curveTo(440.31003, 875.35, 433.28003, 900.86, 427.15002, 926.12);
        ((GeneralPath) shape).curveTo(422.54004, 939.93, 418.21002, 953.83997, 413.52002, 967.63);
        ((GeneralPath) shape).curveTo(412.00003, 973.44, 413.15002, 979.56, 412.97003, 985.52);
        ((GeneralPath) shape).curveTo(416.63004, 988.13, 421.60004, 987.15, 425.54004, 985.64);
        ((GeneralPath) shape).curveTo(435.47003, 980.22003, 443.03003, 971.04004, 448.03003, 961.03);
        ((GeneralPath) shape).curveTo(453.52002, 949.95, 457.86002, 938.21, 459.97003, 925.99005);
        ((GeneralPath) shape).curveTo(461.09003, 920.46, 462.64005, 915.04004, 463.60004, 909.48004);
        ((GeneralPath) shape).curveTo(464.37003, 903.22003, 464.71002, 896.95, 465.68002, 890.72003);
        ((GeneralPath) shape).curveTo(467.92, 876.51, 467.91003, 861.71, 464.25003, 847.74005);
        ((GeneralPath) shape).curveTo(462.82004, 842.42004, 459.59003, 837.0201, 454.24002, 834.97003);
        ((GeneralPath) shape).curveTo(452.11002, 835.05005, 447.85, 835.22003, 445.72003, 835.31006);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x010101));
        g.fill(shape);

        // _0_0_296
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(381.21, 828.34);
        ((GeneralPath) shape).curveTo(386.66, 828.12006, 391.78, 830.86005, 396.03998, 834.0);
        ((GeneralPath) shape).curveTo(399.08, 838.58, 401.74997, 843.55, 403.09998, 848.93);
        ((GeneralPath) shape).curveTo(407.96997, 871.86, 408.50998, 895.45996, 407.87997, 918.82);
        ((GeneralPath) shape).curveTo(407.12997, 927.99, 404.8, 937.10004, 400.03998, 945.04);
        ((GeneralPath) shape).curveTo(397.72998, 950.14996, 392.94998, 953.37, 388.46, 956.41);
        ((GeneralPath) shape).curveTo(383.6, 959.64996, 377.44998, 960.38995, 371.75, 959.75);
        ((GeneralPath) shape).curveTo(369.36, 959.27, 367.15, 957.55, 366.66, 955.08);
        ((GeneralPath) shape).curveTo(365.07, 948.92004, 363.1, 942.91003, 361.09, 936.89);
        ((GeneralPath) shape).curveTo(358.81, 928.43, 358.46, 919.58, 358.0, 910.88);
        ((GeneralPath) shape).curveTo(358.06, 894.98, 357.38, 879.03, 359.22, 863.21);
        ((GeneralPath) shape).curveTo(360.22, 853.56, 361.67, 843.5, 367.13, 835.24005);
        ((GeneralPath) shape).curveTo(370.72, 831.19006, 375.83002, 828.81006, 381.21, 828.34);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEFFCFE));
        g.fill(shape);

        // _0_0_297
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(445.72, 835.31);
        ((GeneralPath) shape).curveTo(447.85, 835.22, 452.11002, 835.05, 454.24, 834.97);
        ((GeneralPath) shape).curveTo(459.59, 837.01996, 462.81998, 842.42, 464.25, 847.74);
        ((GeneralPath) shape).curveTo(467.91, 861.70996, 467.92, 876.51, 465.68, 890.72);
        ((GeneralPath) shape).curveTo(464.71, 896.94995, 464.37, 903.22, 463.6, 909.48);
        ((GeneralPath) shape).curveTo(462.64, 915.04, 461.09, 920.45996, 459.97, 925.99);
        ((GeneralPath) shape).curveTo(457.86002, 938.20996, 453.52, 949.95, 448.03, 961.02997);
        ((GeneralPath) shape).curveTo(443.03, 971.04, 435.47, 980.22, 425.54, 985.63995);
        ((GeneralPath) shape).curveTo(421.6, 987.14996, 416.63, 988.12994, 412.97, 985.51996);
        ((GeneralPath) shape).curveTo(413.15, 979.55994, 412.0, 973.43994, 413.52, 967.62994);
        ((GeneralPath) shape).curveTo(418.21, 953.83997, 422.53998, 939.92993, 427.15, 926.11993);
        ((GeneralPath) shape).curveTo(433.28, 900.8599, 440.31, 875.3499, 438.97, 849.08997);
        ((GeneralPath) shape).curveTo(439.51, 844.77997, 437.68, 839.77997, 440.4, 835.98);
        ((GeneralPath) shape).curveTo(441.72998, 835.81, 444.38998, 835.47, 445.72, 835.31);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_298
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(109.23, 839.16);
        ((GeneralPath) shape).curveTo(111.560005, 839.49, 113.91, 839.74, 116.25, 839.38995);
        ((GeneralPath) shape).curveTo(119.68, 838.91, 122.88, 840.66, 125.94, 841.92993);
        ((GeneralPath) shape).curveTo(129.78, 843.50995, 132.73, 846.68994, 134.84, 850.19995);
        ((GeneralPath) shape).curveTo(143.72, 864.39996, 145.73, 881.50995, 148.16, 897.74994);
        ((GeneralPath) shape).curveTo(150.49, 906.07996, 152.16, 914.57996, 154.0, 923.02997);
        ((GeneralPath) shape).curveTo(154.94, 927.92, 155.62, 932.92, 157.39, 937.62);
        ((GeneralPath) shape).curveTo(161.99, 949.96, 166.78, 962.27, 170.16, 975.02);
        ((GeneralPath) shape).curveTo(170.84, 978.14, 171.37001, 981.47003, 170.86, 984.68);
        ((GeneralPath) shape).curveTo(170.52, 984.98, 169.83, 985.58, 169.49, 985.88);
        ((GeneralPath) shape).curveTo(158.47, 987.72003, 147.6, 981.45, 140.90001, 973.08);
        ((GeneralPath) shape).curveTo(126.850006, 955.97003, 116.96001, 935.5, 112.12001, 913.9);
        ((GeneralPath) shape).curveTo(110.16001, 906.30005, 108.64001, 898.60004, 107.13001, 890.91003);
        ((GeneralPath) shape).curveTo(105.66001, 883.38, 105.95001, 875.65, 105.92001, 868.04004);
        ((GeneralPath) shape).curveTo(106.000015, 859.48004, 106.19001, 850.94006, 107.05001, 842.43005);
        ((GeneralPath) shape).curveTo(107.08001, 841.0201, 108.09001, 839.84, 109.23001, 839.16003);
        ((GeneralPath) shape).moveTo(112.08001, 845.10004);
        ((GeneralPath) shape).curveTo(111.81001, 861.44006, 111.50001, 877.89, 113.71001, 894.14);
        ((GeneralPath) shape).curveTo(116.36001, 904.52, 118.240005, 915.10004, 121.69001, 925.28);
        ((GeneralPath) shape).curveTo(125.48001, 935.61005, 129.56001, 945.97003, 135.98001, 955.01);
        ((GeneralPath) shape).curveTo(140.59001, 961.61, 145.34001, 968.24, 151.29001, 973.73);
        ((GeneralPath) shape).curveTo(155.14001, 976.1, 159.15001, 978.79, 163.88, 978.83997);
        ((GeneralPath) shape).curveTo(162.98001, 970.17, 160.29001, 961.77997, 157.37001, 953.61);
        ((GeneralPath) shape).curveTo(150.22002, 931.6, 144.31001, 909.04, 142.1, 885.94995);
        ((GeneralPath) shape).curveTo(140.24, 877.26996, 138.15001, 868.6, 134.66, 860.4199);
        ((GeneralPath) shape).curveTo(130.71, 851.7399, 121.75, 845.1499, 112.08, 845.0999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x020202));
        g.fill(shape);

        // _0_0_299
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(274.7, 843.67);
        ((GeneralPath) shape).curveTo(275.03, 843.45, 275.68002, 843.01, 276.0, 842.79);
        ((GeneralPath) shape).curveTo(277.92, 843.83997, 277.38, 846.58997, 279.01, 847.79);
        ((GeneralPath) shape).curveTo(282.99002, 846.47, 286.88, 844.06, 291.28, 845.25);
        ((GeneralPath) shape).curveTo(294.29, 846.23, 297.23, 847.51, 300.01, 849.05);
        ((GeneralPath) shape).curveTo(302.88, 851.92, 304.95, 855.47, 307.15002, 858.86);
        ((GeneralPath) shape).curveTo(310.84003, 864.14, 311.42, 870.74, 313.19003, 876.76996);
        ((GeneralPath) shape).curveTo(315.79004, 885.52997, 316.55002, 894.67, 318.52002, 903.56995);
        ((GeneralPath) shape).curveTo(319.55002, 909.63995, 318.85, 915.82996, 319.06003, 921.97);
        ((GeneralPath) shape).curveTo(318.76004, 933.97, 319.82004, 946.07996, 318.11002, 958.02997);
        ((GeneralPath) shape).curveTo(315.84003, 968.31, 311.97, 978.31, 306.16, 987.12);
        ((GeneralPath) shape).curveTo(301.95, 990.06, 297.19, 992.55, 291.97, 992.87);
        ((GeneralPath) shape).curveTo(285.7, 992.41, 280.64, 987.32, 277.92, 981.97);
        ((GeneralPath) shape).curveTo(273.94, 973.62994, 272.13, 964.36, 271.75, 955.17);
        ((GeneralPath) shape).curveTo(272.5, 921.55, 271.53, 887.92, 272.21, 854.31);
        ((GeneralPath) shape).curveTo(273.22998, 850.81, 273.91998, 847.2, 274.69998, 843.67);
        ((GeneralPath) shape).moveTo(287.59998, 853.63);
        ((GeneralPath) shape).curveTo(284.64996, 854.14, 281.19998, 854.41003, 278.92996, 856.5);
        ((GeneralPath) shape).curveTo(279.00995, 884.69, 279.01996, 912.88, 278.98996, 941.08);
        ((GeneralPath) shape).curveTo(279.09995, 951.60004, 278.01996, 962.48004, 281.34995, 972.67004);
        ((GeneralPath) shape).curveTo(282.18994, 976.41003, 283.85995, 979.93005, 286.35995, 982.88007);
        ((GeneralPath) shape).curveTo(289.79996, 984.82007, 294.55997, 984.19006, 297.32996, 981.3401);
        ((GeneralPath) shape).curveTo(303.98996, 974.9501, 307.66995, 965.9101, 308.98996, 956.9101);
        ((GeneralPath) shape).curveTo(310.26996, 954.1001, 310.44995, 950.9701, 310.93997, 947.9701);
        ((GeneralPath) shape).curveTo(313.36, 928.8601, 311.71997, 909.5301, 309.68997, 890.4701);
        ((GeneralPath) shape).lineTo(309.01996, 889.8701);
        ((GeneralPath) shape).curveTo(308.38995, 878.70013, 304.92996, 867.6601, 298.82996, 858.26013);
        ((GeneralPath) shape).curveTo(296.32996, 854.78015, 291.96997, 852.3201, 287.59995, 853.6301);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x010202));
        g.fill(shape);

        // _0_0_300
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(112.08, 845.1);
        ((GeneralPath) shape).curveTo(121.75, 845.14996, 130.71, 851.74, 134.66, 860.42);
        ((GeneralPath) shape).curveTo(138.15001, 868.6, 140.24, 877.26996, 142.1, 885.95);
        ((GeneralPath) shape).curveTo(144.31001, 909.04004, 150.22, 931.60004, 157.37001, 953.61);
        ((GeneralPath) shape).curveTo(160.29001, 961.77997, 162.98001, 970.17, 163.88, 978.83997);
        ((GeneralPath) shape).curveTo(159.15001, 978.79, 155.14, 976.1, 151.29001, 973.73);
        ((GeneralPath) shape).curveTo(145.34001, 968.24, 140.59001, 961.61, 135.98001, 955.01);
        ((GeneralPath) shape).curveTo(129.56001, 945.97003, 125.48001, 935.61, 121.69001, 925.28);
        ((GeneralPath) shape).curveTo(118.24001, 915.10004, 116.36001, 904.52, 113.71001, 894.14);
        ((GeneralPath) shape).curveTo(111.50001, 877.89, 111.810005, 861.44, 112.08001, 845.10004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_301
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(287.6, 853.63);
        ((GeneralPath) shape).curveTo(291.97, 852.32, 296.33002, 854.78, 298.83002, 858.26);
        ((GeneralPath) shape).curveTo(304.93002, 867.66003, 308.39, 878.7, 309.02002, 889.87);
        ((GeneralPath) shape).curveTo(307.18002, 909.33997, 304.90002, 928.77, 304.04, 948.31);
        ((GeneralPath) shape).curveTo(303.82, 954.92, 303.43002, 961.66, 304.59, 968.23);
        ((GeneralPath) shape).curveTo(305.99, 964.42, 307.29, 960.57996, 308.99, 956.91);
        ((GeneralPath) shape).curveTo(307.66998, 965.91, 303.99, 974.94995, 297.33, 981.33997);
        ((GeneralPath) shape).curveTo(294.56, 984.18994, 289.8, 984.81995, 286.36, 982.87994);
        ((GeneralPath) shape).curveTo(283.86, 979.92993, 282.18997, 976.41, 281.34998, 972.6699);
        ((GeneralPath) shape).curveTo(278.02, 962.4799, 279.09998, 951.5999, 278.99, 941.0799);
        ((GeneralPath) shape).curveTo(279.02, 912.8799, 279.00998, 884.6899, 278.93, 856.4999);
        ((GeneralPath) shape).curveTo(281.19998, 854.40985, 284.65, 854.1399, 287.6, 853.6299);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_302
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(309.02, 889.87);
        ((GeneralPath) shape).lineTo(309.69, 890.47);
        ((GeneralPath) shape).curveTo(311.72, 909.52997, 313.36002, 928.86, 310.94, 947.97);
        ((GeneralPath) shape).curveTo(310.45, 950.97, 310.27, 954.1, 308.99, 956.91);
        ((GeneralPath) shape).curveTo(307.28998, 960.57996, 305.99, 964.42, 304.59, 968.23);
        ((GeneralPath) shape).curveTo(303.43, 961.66, 303.82, 954.92, 304.04, 948.31);
        ((GeneralPath) shape).curveTo(304.9, 928.77, 307.18002, 909.33997, 309.02002, 889.87);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBBF0F5));
        g.fill(shape);

        // _0_0_303
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(490.63, 893.39);
        ((GeneralPath) shape).curveTo(495.33002, 891.59, 499.41, 895.07, 501.95, 898.56);
        ((GeneralPath) shape).curveTo(503.37003, 903.7, 502.22, 909.19, 499.94, 913.9);
        ((GeneralPath) shape).curveTo(497.08002, 919.98004, 494.47, 926.21, 491.13, 932.06);
        ((GeneralPath) shape).curveTo(489.61002, 934.79, 486.38, 935.89, 483.61002, 936.92);
        ((GeneralPath) shape).curveTo(480.46002, 938.1, 477.73, 936.01, 476.23, 933.57996);
        ((GeneralPath) shape).curveTo(474.61002, 929.41, 475.01, 924.69995, 475.15002, 920.36);
        ((GeneralPath) shape).curveTo(476.37003, 912.88, 478.41003, 905.29, 482.92, 899.07);
        ((GeneralPath) shape).curveTo(484.91, 896.55, 487.48, 894.26, 490.63, 893.39);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEFFCFE));
        g.fill(shape);

        // _0_0_304
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(269.92, 900.92);
        ((GeneralPath) shape).lineTo(270.92, 901.01996);
        ((GeneralPath) shape).curveTo(271.66, 919.05, 269.98, 937.16, 271.75, 955.17);
        ((GeneralPath) shape).curveTo(272.13, 964.36, 273.94, 973.63, 277.92, 981.97);
        ((GeneralPath) shape).curveTo(280.64, 987.31995, 285.7, 992.41, 291.97, 992.87);
        ((GeneralPath) shape).curveTo(297.19, 992.55, 301.95, 990.06, 306.16, 987.12);
        ((GeneralPath) shape).curveTo(303.78, 991.62, 301.98, 996.55, 298.41, 1000.3);
        ((GeneralPath) shape).curveTo(292.06, 1005.5, 282.83002, 1007.39996, 275.18, 1004.1);
        ((GeneralPath) shape).curveTo(268.44, 1001.89996, 263.4, 995.92, 261.49, 989.20996);
        ((GeneralPath) shape).curveTo(260.56998, 985.49, 261.13, 981.52997, 261.38998, 977.80994);
        ((GeneralPath) shape).curveTo(262.03, 972.5499, 266.88998, 969.19995, 268.61, 964.37994);
        ((GeneralPath) shape).curveTo(269.59998, 960.22, 269.18997, 955.83997, 269.58, 951.64996);
        ((GeneralPath) shape).curveTo(270.4, 934.74994, 269.81, 917.82996, 269.91998, 900.92);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_305
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(540.09, 953.09);
        ((GeneralPath) shape).curveTo(545.51, 942.93005, 550.73004, 932.64, 556.95, 922.94);
        ((GeneralPath) shape).curveTo(554.47003, 930.01, 550.74, 936.53, 546.95, 942.97003);
        ((GeneralPath) shape).curveTo(543.21, 949.89, 539.85004, 957.02, 535.78, 963.77);
        ((GeneralPath) shape).curveTo(528.51, 974.38, 520.86005, 984.73004, 512.61005, 994.61005);
        ((GeneralPath) shape).curveTo(511.23004, 996.21, 509.74005, 997.81006, 507.89005, 998.9);
        ((GeneralPath) shape).curveTo(509.98004, 995.98004, 512.0101, 993.03, 514.25006, 990.24005);
        ((GeneralPath) shape).curveTo(523.8301, 978.5801, 533.06006, 966.49005, 540.0901, 953.09);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x898A8A));
        g.fill(shape);

        // _0_0_306
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(76.79, 927.11);
        ((GeneralPath) shape).curveTo(79.49, 929.20996, 82.35, 931.14996, 84.68, 933.7);
        ((GeneralPath) shape).curveTo(84.57, 935.49, 84.22, 937.26, 83.93, 939.04004);
        ((GeneralPath) shape).curveTo(80.79, 935.56006, 78.72, 931.32007, 76.79, 927.11005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA08484));
        g.fill(shape);

        // _0_0_307
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(76.98, 954.01);
        ((GeneralPath) shape).curveTo(81.82001, 958.27, 84.880005, 964.07, 89.14, 968.87);
        ((GeneralPath) shape).curveTo(102.14, 984.23, 117.78, 997.11, 133.87, 1009.1);
        ((GeneralPath) shape).curveTo(137.2, 1011.39996, 140.14, 1014.19995, 143.19, 1016.8);
        ((GeneralPath) shape).curveTo(137.34, 1013.89996, 132.38, 1009.6, 127.05, 1005.89996);
        ((GeneralPath) shape).curveTo(117.94, 999.55, 109.48, 992.24, 101.73, 984.26996);
        ((GeneralPath) shape).curveTo(96.64, 979.01996, 91.130005, 974.14996, 86.590004, 968.41);
        ((GeneralPath) shape).curveTo(83.07001, 963.81995, 79.9, 958.98, 76.98, 954.00995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7F9B9E));
        g.fill(shape);

        // _0_0_308
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(398.08, 966.03);
        ((GeneralPath) shape).curveTo(401.4, 962.33, 405.3, 959.14, 408.15997, 955.04004);
        ((GeneralPath) shape).curveTo(405.21997, 964.77, 401.05997, 975.2, 404.19998, 985.46);
        ((GeneralPath) shape).curveTo(407.27997, 993.74005, 418.00998, 995.67004, 425.62997, 992.96);
        ((GeneralPath) shape).curveTo(440.44998, 987.34, 449.71997, 973.39, 456.80997, 959.95);
        ((GeneralPath) shape).curveTo(456.47998, 970.21, 453.91995, 981.11, 446.96997, 988.97003);
        ((GeneralPath) shape).curveTo(439.45996, 996.31006, 429.76996, 1001.60004, 419.37997, 1003.50006);
        ((GeneralPath) shape).curveTo(411.13998, 1004.7001, 402.70996, 1000.7001, 397.70996, 994.23004);
        ((GeneralPath) shape).curveTo(391.91995, 986.05005, 391.47995, 973.85004, 398.07996, 966.03);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_309
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(478.04, 1027.0);
        ((GeneralPath) shape).curveTo(488.57, 1019.0, 497.1, 1008.8, 506.99002, 1000.0);
        ((GeneralPath) shape).curveTo(505.31003, 1003.4, 502.43002, 1006.1, 499.82, 1008.8);
        ((GeneralPath) shape).curveTo(493.45, 1015.1, 487.57, 1022.0, 480.38, 1027.4);
        ((GeneralPath) shape).curveTo(475.07, 1031.5, 469.38, 1035.2001, 463.98, 1039.2001);
        ((GeneralPath) shape).curveTo(467.23, 1046.8, 476.61002, 1049.2001, 480.91, 1056.1001);
        ((GeneralPath) shape).curveTo(473.76, 1051.1001, 466.4, 1046.1001, 461.07, 1039.1001);
        ((GeneralPath) shape).curveTo(466.55002, 1034.8, 472.88, 1031.8, 478.04, 1027.0001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7E979A));
        g.fill(shape);

        // _0_0_310
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(143.19, 1016.8);
        ((GeneralPath) shape).curveTo(151.04001, 1022.3, 158.79001, 1028.0, 166.95, 1033.0);
        ((GeneralPath) shape).curveTo(177.48, 1039.6, 189.47, 1043.4, 200.14, 1049.8);
        ((GeneralPath) shape).curveTo(196.02, 1052.8, 191.70999, 1055.5, 187.72, 1058.7001);
        ((GeneralPath) shape).curveTo(183.7, 1062.7001, 180.82, 1067.7001, 176.93001, 1071.9);
        ((GeneralPath) shape).curveTo(178.68001, 1067.4, 181.41, 1063.2001, 184.68001, 1059.7001);
        ((GeneralPath) shape).curveTo(188.16, 1055.7001, 193.32, 1053.7001, 197.03001, 1050.0001);
        ((GeneralPath) shape).lineTo(196.78001, 1049.2001);
        ((GeneralPath) shape).curveTo(186.50002, 1044.2001, 175.68001, 1040.1001, 165.91002, 1034.1001);
        ((GeneralPath) shape).curveTo(159.19002, 1029.9001, 152.56001, 1025.6001, 146.36002, 1020.6001);
        ((GeneralPath) shape).curveTo(145.01001, 1019.6001, 143.99002, 1018.3001, 143.19002, 1016.8001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x928887));
        g.fill(shape);

        // _0_0_311
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(222.54, 1038.2);
        ((GeneralPath) shape).curveTo(226.20999, 1040.5, 229.56999, 1044.1, 234.42, 1043.0);
        ((GeneralPath) shape).curveTo(243.55, 1043.6, 252.64, 1041.7, 261.77, 1042.4);
        ((GeneralPath) shape).curveTo(275.25998, 1043.0, 288.77, 1042.9, 302.25, 1043.8);
        ((GeneralPath) shape).curveTo(318.7, 1043.9, 335.25, 1044.4, 351.44, 1047.6001);
        ((GeneralPath) shape).curveTo(360.19, 1049.4001, 369.22, 1049.1001, 378.06, 1048.1001);
        ((GeneralPath) shape).curveTo(375.0, 1049.5001, 371.99, 1051.2001, 368.62, 1051.8);
        ((GeneralPath) shape).curveTo(364.6, 1052.4, 360.52, 1052.6001, 356.51, 1053.3);
        ((GeneralPath) shape).curveTo(351.27002, 1053.8, 346.19, 1055.6001, 340.87, 1055.1001);
        ((GeneralPath) shape).curveTo(329.41998, 1054.8, 317.97, 1055.4001, 306.53998, 1054.8);
        ((GeneralPath) shape).curveTo(296.27, 1053.0, 285.83997, 1052.6001, 275.50998, 1051.3);
        ((GeneralPath) shape).curveTo(267.03998, 1050.6001, 258.53998, 1051.2001, 250.06998, 1051.5);
        ((GeneralPath) shape).curveTo(249.87997, 1050.9, 249.50998, 1049.7, 249.31998, 1049.1);
        ((GeneralPath) shape).curveTo(241.98997, 1047.2, 234.36998, 1046.5, 227.15997, 1044.1);
        ((GeneralPath) shape).curveTo(225.14998, 1042.6, 224.07997, 1040.2, 222.53998, 1038.2);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_312
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(438.92, 1046.5);
        ((GeneralPath) shape).curveTo(441.37003, 1046.0, 444.56003, 1045.4, 446.84003, 1046.9);
        ((GeneralPath) shape).curveTo(452.12003, 1050.2001, 456.33002, 1054.9, 461.34003, 1058.5);
        ((GeneralPath) shape).curveTo(462.97003, 1060.0, 465.28003, 1061.0, 466.18002, 1063.2);
        ((GeneralPath) shape).curveTo(460.48, 1064.3999, 454.59003, 1064.2999, 448.81003, 1064.7999);
        ((GeneralPath) shape).curveTo(441.42, 1064.9999, 434.13004, 1066.2999, 426.77002, 1066.7999);
        ((GeneralPath) shape).curveTo(414.31003, 1067.7, 401.82, 1068.3999, 389.48, 1070.3999);
        ((GeneralPath) shape).curveTo(377.48, 1072.7, 365.18002, 1071.8999, 353.04, 1071.9999);
        ((GeneralPath) shape).lineTo(297.95, 1071.9999);
        ((GeneralPath) shape).curveTo(285.69, 1072.0999, 273.36002, 1071.7999, 261.27002, 1069.5999);
        ((GeneralPath) shape).curveTo(253.18002, 1068.9999, 245.12003, 1068.1998, 237.08002, 1067.0999);
        ((GeneralPath) shape).curveTo(233.22002, 1065.9999, 229.39001, 1064.6998, 225.52002, 1063.5999);
        ((GeneralPath) shape).curveTo(225.54002, 1060.9999, 225.10002, 1058.5999, 224.60002, 1056.0999);
        ((GeneralPath) shape).curveTo(225.22002, 1053.8999, 226.20003, 1051.3999, 228.09003, 1049.9999);
        ((GeneralPath) shape).curveTo(235.07002, 1052.1998, 241.87003, 1054.9999, 248.90002, 1056.9999);
        ((GeneralPath) shape).curveTo(256.80002, 1059.8999, 265.32004, 1059.5999, 273.57004, 1060.3999);
        ((GeneralPath) shape).curveTo(276.49005, 1060.2999, 279.48004, 1060.8999, 282.20004, 1061.9999);
        ((GeneralPath) shape).curveTo(295.91003, 1064.7999, 309.99005, 1065.2999, 323.96005, 1064.9999);
        ((GeneralPath) shape).curveTo(336.15005, 1065.1998, 348.33005, 1064.5999, 360.47006, 1063.5999);
        ((GeneralPath) shape).curveTo(368.94006, 1062.0999, 377.07007, 1059.0999, 385.51007, 1057.4999);
        ((GeneralPath) shape).curveTo(389.87006, 1056.4999, 394.34006, 1055.9999, 398.58008, 1054.5999);
        ((GeneralPath) shape).curveTo(402.83008, 1052.4999, 407.76007, 1052.8999, 412.04007, 1050.9999);
        ((GeneralPath) shape).curveTo(416.65005, 1048.6998, 421.85007, 1049.2999, 426.82007, 1048.9999);
        ((GeneralPath) shape).curveTo(431.15005, 1049.6998, 434.94006, 1047.5999, 438.92007, 1046.4999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9DCACE));
        g.fill(shape);

        // _0_0_313
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(482.05, 1056.9);
        ((GeneralPath) shape).curveTo(485.93, 1058.8, 487.55, 1063.1, 489.22, 1066.8);
        ((GeneralPath) shape).curveTo(492.28, 1073.1001, 492.73, 1080.2001, 495.42, 1086.6001);
        ((GeneralPath) shape).curveTo(497.32, 1091.1001, 499.01, 1095.7001, 499.61002, 1100.7001);
        ((GeneralPath) shape).curveTo(500.83002, 1105.9, 499.19, 1111.0001, 497.99002, 1116.0001);
        ((GeneralPath) shape).curveTo(496.77002, 1119.7001, 496.63004, 1124.0001, 494.25003, 1127.3002);
        ((GeneralPath) shape).curveTo(489.62003, 1133.5001, 483.74002, 1139.5001, 476.20004, 1141.9001);
        ((GeneralPath) shape).curveTo(472.30005, 1141.8002, 467.98004, 1142.8002, 464.39005, 1140.9001);
        ((GeneralPath) shape).curveTo(462.84006, 1139.9001, 459.75003, 1138.0001, 458.20004, 1137.0001);
        ((GeneralPath) shape).curveTo(455.95004, 1136.9001, 453.73004, 1137.0001, 451.54004, 1137.4001);
        ((GeneralPath) shape).curveTo(443.61005, 1139.0001, 435.48004, 1138.8002, 427.46005, 1139.4001);
        ((GeneralPath) shape).curveTo(412.70004, 1140.8002, 397.88007, 1139.5001, 383.11005, 1140.2002);
        ((GeneralPath) shape).curveTo(377.82004, 1140.2002, 372.56006, 1141.0002, 367.28006, 1140.6002);
        ((GeneralPath) shape).curveTo(355.08005, 1139.6002, 342.81006, 1139.7002, 330.62006, 1140.8002);
        ((GeneralPath) shape).curveTo(327.40005, 1140.9001, 324.22006, 1141.3002, 321.01007, 1141.0001);
        ((GeneralPath) shape).lineTo(320.97006, 1140.0001);
        ((GeneralPath) shape).curveTo(349.36005, 1137.5001, 377.91006, 1140.4001, 406.32007, 1138.2001);
        ((GeneralPath) shape).curveTo(419.70007, 1137.9, 433.13007, 1138.0001, 446.44006, 1136.3);
        ((GeneralPath) shape).curveTo(450.91006, 1135.8, 455.39008, 1134.6001, 459.89008, 1135.7001);
        ((GeneralPath) shape).curveTo(462.17007, 1137.0001, 464.1201, 1138.8, 466.4001, 1140.2001);
        ((GeneralPath) shape).curveTo(469.9001, 1141.6001, 473.96008, 1141.4, 477.4701, 1140.1001);
        ((GeneralPath) shape).curveTo(483.99008, 1137.2001, 489.1001, 1131.9001, 493.2901, 1126.2001);
        ((GeneralPath) shape).curveTo(495.5701, 1122.9, 495.9101, 1118.7001, 497.0701, 1114.9);
        ((GeneralPath) shape).curveTo(498.1301, 1109.8, 499.4601, 1104.3, 498.0201, 1099.2001);
        ((GeneralPath) shape).curveTo(495.28012, 1089.4, 491.0701, 1080.1001, 488.7901, 1070.3);
        ((GeneralPath) shape).curveTo(487.5301, 1065.4, 484.7101, 1061.1001, 482.0501, 1056.9);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x818F90));
        g.fill(shape);

        // _0_0_314
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(208.93, 1065.3);
        ((GeneralPath) shape).lineTo(213.2, 1065.0);
        ((GeneralPath) shape).curveTo(217.91, 1063.1, 220.79, 1067.9, 225.20999, 1067.8);
        ((GeneralPath) shape).curveTo(226.54999, 1068.1001, 229.24998, 1068.6001, 230.59, 1068.9);
        ((GeneralPath) shape).curveTo(230.62999, 1069.5, 230.70999, 1070.8, 230.75, 1071.4);
        ((GeneralPath) shape).curveTo(241.05, 1070.9, 251.07, 1073.9, 261.26, 1074.8);
        ((GeneralPath) shape).curveTo(269.23, 1075.4, 277.18002, 1076.3, 285.18002, 1076.6001);
        ((GeneralPath) shape).curveTo(287.71002, 1076.8, 290.76, 1076.6001, 293.18002, 1077.8);
        ((GeneralPath) shape).curveTo(295.53003, 1078.9, 298.47003, 1080.5, 296.85004, 1084.1001);
        ((GeneralPath) shape).curveTo(296.60004, 1088.9001, 293.34003, 1093.0001, 289.59003, 1095.7001);
        ((GeneralPath) shape).curveTo(285.54004, 1098.0001, 280.75003, 1098.0001, 276.37003, 1099.2001);
        ((GeneralPath) shape).curveTo(275.86002, 1101.9, 276.90002, 1104.7001, 278.59003, 1106.8);
        ((GeneralPath) shape).curveTo(283.86002, 1106.8, 289.15002, 1105.7001, 294.41003, 1106.3);
        ((GeneralPath) shape).curveTo(298.29004, 1107.4, 302.06003, 1109.2001, 305.23004, 1111.8);
        ((GeneralPath) shape).curveTo(308.76004, 1115.6001, 310.88004, 1120.5, 313.83005, 1124.8);
        ((GeneralPath) shape).curveTo(326.51004, 1124.8, 339.17004, 1123.6001, 351.88004, 1123.9);
        ((GeneralPath) shape).lineTo(351.85004, 1124.9);
        ((GeneralPath) shape).curveTo(342.24005, 1125.2001, 332.67004, 1126.4, 323.04004, 1126.0);
        ((GeneralPath) shape).curveTo(297.62003, 1125.6, 272.17004, 1126.8, 246.80005, 1125.0);
        ((GeneralPath) shape).curveTo(239.55005, 1124.7, 232.24005, 1125.2, 225.06004, 1124.0);
        ((GeneralPath) shape).curveTo(216.52005, 1121.9, 207.71004, 1120.7, 199.45004, 1117.6);
        ((GeneralPath) shape).curveTo(194.41005, 1115.7, 190.98004, 1111.0, 189.35004, 1106.0);
        ((GeneralPath) shape).curveTo(189.24004, 1099.0, 187.30003, 1091.4, 190.93004, 1085.0);
        ((GeneralPath) shape).curveTo(194.97003, 1077.0, 200.21004, 1068.7, 208.93004, 1065.3);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9ECBCF));
        g.fill(shape);

        // _0_0_315
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(457.06, 1071.1);
        ((GeneralPath) shape).curveTo(461.22, 1068.2, 466.87, 1069.1, 471.63, 1069.2999);
        ((GeneralPath) shape).curveTo(472.38, 1075.7999, 472.27002, 1082.4999, 474.02002, 1088.7999);
        ((GeneralPath) shape).curveTo(477.34003, 1094.7999, 479.17, 1101.8999, 477.19003, 1108.7);
        ((GeneralPath) shape).curveTo(477.19003, 1112.7, 473.91003, 1115.3999, 471.00003, 1117.5);
        ((GeneralPath) shape).curveTo(466.78003, 1118.2, 462.57004, 1117.1, 458.36002, 1117.3);
        ((GeneralPath) shape).curveTo(451.02002, 1118.2001, 443.79, 1119.9, 436.42, 1120.5);
        ((GeneralPath) shape).curveTo(426.71002, 1121.1, 416.97, 1121.3, 407.28003, 1122.3);
        ((GeneralPath) shape).curveTo(388.85004, 1124.0, 370.29004, 1121.9, 351.88004, 1123.9);
        ((GeneralPath) shape).curveTo(339.17004, 1123.6, 326.51004, 1124.8, 313.83005, 1124.8);
        ((GeneralPath) shape).curveTo(310.88004, 1120.5, 308.76004, 1115.6001, 305.23004, 1111.8);
        ((GeneralPath) shape).curveTo(302.06003, 1109.2001, 298.29004, 1107.4, 294.41003, 1106.3);
        ((GeneralPath) shape).curveTo(289.15002, 1105.7001, 283.86005, 1106.8, 278.59003, 1106.8);
        ((GeneralPath) shape).curveTo(276.90002, 1104.7001, 275.86002, 1101.9, 276.37003, 1099.2001);
        ((GeneralPath) shape).curveTo(280.75003, 1098.0001, 285.54004, 1098.0001, 289.59003, 1095.7001);
        ((GeneralPath) shape).curveTo(293.34003, 1093.0001, 296.60004, 1088.9, 296.85004, 1084.1001);
        ((GeneralPath) shape).curveTo(298.47003, 1080.5001, 295.53003, 1078.9001, 293.18002, 1077.8);
        ((GeneralPath) shape).curveTo(311.79004, 1078.2001, 330.40002, 1077.9, 349.02002, 1078.0);
        ((GeneralPath) shape).curveTo(361.72003, 1077.9, 374.48, 1078.6, 387.14, 1077.1);
        ((GeneralPath) shape).curveTo(406.13, 1075.7, 425.18002, 1076.4, 444.18002, 1075.2999);
        ((GeneralPath) shape).curveTo(448.57004, 1074.7999, 454.13004, 1075.1, 457.06003, 1071.1);
        ((GeneralPath) shape).moveTo(320.50003, 1078.9);
        ((GeneralPath) shape).curveTo(315.57004, 1086.1, 318.32004, 1096.1, 323.63004, 1102.3);
        ((GeneralPath) shape).curveTo(329.35004, 1108.6001, 338.84003, 1109.0, 346.64005, 1107.1001);
        ((GeneralPath) shape).curveTo(353.48004, 1105.9001, 360.74005, 1101.6001, 362.70004, 1094.5001);
        ((GeneralPath) shape).curveTo(363.90005, 1088.7001, 360.38004, 1083.6001, 356.67004, 1079.7001);
        ((GeneralPath) shape).lineTo(354.20004, 1079.0001);
        ((GeneralPath) shape).curveTo(342.96005, 1078.8002, 331.73004, 1079.0001, 320.50003, 1078.9001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBEF4F9));
        g.fill(shape);

        // _0_0_316
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(428.2, 1072.3);
        ((GeneralPath) shape).curveTo(437.80002, 1071.7001, 447.41, 1070.4, 457.06, 1071.1001);
        ((GeneralPath) shape).curveTo(454.13, 1075.1001, 448.57, 1074.8, 444.18, 1075.3);
        ((GeneralPath) shape).curveTo(425.18, 1076.4, 406.13, 1075.7001, 387.13998, 1077.1001);
        ((GeneralPath) shape).lineTo(387.43, 1076.2001);
        ((GeneralPath) shape).curveTo(394.05, 1076.1001, 400.62, 1075.1001, 407.15, 1074.0001);
        ((GeneralPath) shape).curveTo(414.09, 1072.8002, 421.18, 1072.8002, 428.19998, 1072.3002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x9DC9CD));
        g.fill(shape);

        // _0_0_317
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(171.36, 1083.4);
        ((GeneralPath) shape).curveTo(171.84, 1081.4, 172.63, 1079.4, 173.93001, 1077.8);
        ((GeneralPath) shape).curveTo(172.05, 1086.4, 169.05, 1095.2001, 170.66, 1104.2001);
        ((GeneralPath) shape).curveTo(171.14, 1110.3, 174.25, 1115.6001, 177.02, 1121.0001);
        ((GeneralPath) shape).curveTo(174.99, 1120.0001, 173.94, 1117.9001, 172.96, 1116.0001);
        ((GeneralPath) shape).curveTo(170.01001, 1110.8002, 169.44, 1104.7001, 169.11, 1098.8002);
        ((GeneralPath) shape).curveTo(168.47, 1093.5001, 170.13, 1088.5001, 171.36, 1083.4001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x919293));
        g.fill(shape);
        paint2(g, origAlpha, transformations);
    }

    private static void paint2(Graphics2D g, float origAlpha, java.util.LinkedList<AffineTransform> transformations) {
        Shape shape = null;

        // _0_0_318
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(320.5, 1078.9);
        ((GeneralPath) shape).curveTo(331.73, 1079.0, 342.96, 1078.8, 354.2, 1079.0);
        ((GeneralPath) shape).lineTo(356.67, 1079.7);
        ((GeneralPath) shape).curveTo(360.38, 1083.6, 363.90002, 1088.7, 362.7, 1094.5);
        ((GeneralPath) shape).curveTo(360.74002, 1101.6, 353.48, 1105.9, 346.64, 1107.1);
        ((GeneralPath) shape).curveTo(338.84003, 1109.0, 329.35, 1108.6, 323.63, 1102.2999);
        ((GeneralPath) shape).curveTo(318.32, 1096.1, 315.57, 1086.1, 320.5, 1078.8999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEFFCFE));
        g.fill(shape);

        // _0_0_319
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(178.15, 1121.8);
        ((GeneralPath) shape).curveTo(180.29, 1122.9, 182.26999, 1124.3, 183.98, 1126.0);
        ((GeneralPath) shape).curveTo(181.54, 1125.5, 179.01, 1124.4, 178.15, 1121.8);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8E9091));
        g.fill(shape);

        // _0_0_320
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(192.08, 1129.9);
        ((GeneralPath) shape).curveTo(197.72, 1131.4, 203.14, 1133.7001, 208.79001, 1135.2001);
        ((GeneralPath) shape).curveTo(215.36002, 1136.8, 222.1, 1137.7001, 228.84001, 1138.1001);
        ((GeneralPath) shape).curveTo(243.35, 1140.3, 258.04, 1139.7001, 272.65002, 1140.3);
        ((GeneralPath) shape).curveTo(287.76, 1141.6001, 302.91003, 1140.8, 318.05002, 1141.0);
        ((GeneralPath) shape).lineTo(317.95, 1142.0);
        ((GeneralPath) shape).curveTo(307.02002, 1142.4, 296.12003, 1143.7, 285.18002, 1143.0);
        ((GeneralPath) shape).curveTo(268.02002, 1141.7, 250.80002, 1141.7, 233.65002, 1140.3);
        ((GeneralPath) shape).curveTo(222.23003, 1139.7001, 210.44003, 1138.9, 199.87003, 1134.1001);
        ((GeneralPath) shape).curveTo(197.24002, 1132.8, 193.99002, 1132.2001, 192.08003, 1129.9001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA8A8A8));
        g.fill(shape);

        // _0_0_321
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(228.84, 1138.1);
        ((GeneralPath) shape).curveTo(259.54, 1139.0, 290.24, 1140.4, 320.97, 1140.0);
        ((GeneralPath) shape).lineTo(321.01, 1141.0);
        ((GeneralPath) shape).lineTo(318.05002, 1141.0);
        ((GeneralPath) shape).curveTo(302.91, 1140.8, 287.76, 1141.6, 272.65002, 1140.3);
        ((GeneralPath) shape).curveTo(258.04004, 1139.7001, 243.35002, 1140.3, 228.84003, 1138.1001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4B4B4B));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0

    }
}

