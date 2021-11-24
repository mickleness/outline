package com.pump.awt.geom.outline.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;

import static java.awt.Color.WHITE;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/334050/john-lemon
 * </p>
 */
public class JohnLemon implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public JohnLemon() {
        this(406, 445);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public JohnLemon(int width, int height) {
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
        double coef = Math.min((double) width / (double) 406, (double) height / (double) 445);

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
        g.transform(new AffineTransform(3.7795274f, 0, 0, 3.7795274f, 2.8835506E-5f, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 0, -164.70831f));

        // _0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, -289.45853f, 0.57151484f));

        // _0_0_0

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(346.82977, 285.05136);
        ((GeneralPath) shape).curveTo(344.43314, 284.40616, 343.28107, 283.03485, 342.99536, 280.48715);
        ((GeneralPath) shape).curveTo(342.8952, 279.59387, 342.77322, 278.82303, 342.72437, 278.77414);
        ((GeneralPath) shape).curveTo(342.67566, 278.72534, 341.57034, 278.40582, 340.26852, 278.06427);
        ((GeneralPath) shape).curveTo(333.75385, 276.35507, 328.84903, 273.22592, 324.47272, 267.98682);
        ((GeneralPath) shape).curveTo(319.23553, 261.71716, 315.98538, 254.11694, 314.94073, 245.6972);
        ((GeneralPath) shape).curveTo(314.61072, 243.03728, 314.6651, 237.49626, 315.0485, 234.7121);
        ((GeneralPath) shape).curveTo(315.94534, 228.19995, 318.1326, 222.26051, 321.50516, 217.17938);
        ((GeneralPath) shape).curveTo(326.7184, 209.32503, 332.26584, 205.1829, 340.43536, 203.04462);
        ((GeneralPath) shape).curveTo(342.91632, 202.39526, 342.9485, 202.36331, 342.99176, 200.50465);
        ((GeneralPath) shape).curveTo(343.02246, 199.18599, 343.46014, 198.30884, 344.57895, 197.32408);
        ((GeneralPath) shape).curveTo(345.75137, 196.29207, 346.93686, 195.89339, 348.75278, 195.92043);
        ((GeneralPath) shape).curveTo(351.94583, 195.96812, 353.92654, 197.82162, 353.94495, 200.77954);
        ((GeneralPath) shape).curveTo(353.94894, 201.48698, 354.03104, 202.18883, 354.12643, 202.33916);
        ((GeneralPath) shape).curveTo(354.22183, 202.48953, 355.16092, 202.843, 356.21335, 203.12468);
        ((GeneralPath) shape).curveTo(362.50925, 204.80981, 367.0582, 207.66797, 371.57846, 212.77873);
        ((GeneralPath) shape).curveTo(385.60373, 228.63622, 385.18704, 254.00285, 370.649, 269.36127);
        ((GeneralPath) shape).curveTo(366.386, 273.86484, 361.71716, 276.6502, 356.0512, 278.0702);
        ((GeneralPath) shape).lineTo(354.19006, 278.53662);
        ((GeneralPath) shape).lineTo(354.05728, 279.96103);
        ((GeneralPath) shape).curveTo(353.88037, 281.8582, 353.81375, 282.12494, 353.3148, 282.93317);
        ((GeneralPath) shape).curveTo(352.7087, 283.915, 351.31525, 284.85373, 350.06622, 285.12158);
        ((GeneralPath) shape).curveTo(348.72983, 285.4082, 348.10474, 285.39462, 346.82977, 285.05148);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFDB01));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.26458332f, 0, 0, 0.26458332f, 0, 164.70831f));

        // _0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(1289.041, 144.26367);
        ((GeneralPath) shape).curveTo(1288.3094, 144.4626, 1287.5762, 144.65945, 1286.6855, 144.89258);
        ((GeneralPath) shape).curveTo(1255.8086, 152.97427, 1234.8423, 168.63065, 1215.1388, 198.3164);
        ((GeneralPath) shape).curveTo(1202.392, 217.52068, 1194.1241, 239.96918, 1190.7345, 264.58203);
        ((GeneralPath) shape).curveTo(1189.2854, 275.1048, 1189.0809, 296.0464, 1190.3282, 306.0996);
        ((GeneralPath) shape).curveTo(1194.2765, 337.92224, 1206.5597, 366.64746, 1226.3536, 390.34375);
        ((GeneralPath) shape).curveTo(1241.9352, 408.99728, 1259.2944, 420.57016, 1281.838, 427.25);
        ((GeneralPath) shape).curveTo(1254.6691, 406.17313, 1199.7418, 354.61517, 1201.3575, 283.19727);
        ((GeneralPath) shape).curveTo(1203.7599, 177.01537, 1295.8575, 144.36328, 1295.8575, 144.36328);
        ((GeneralPath) shape).curveTo(1295.8575, 144.36328, 1290.7362, 144.29099, 1289.0411, 144.26369);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(1296.3633, 437.60547);
        ((GeneralPath) shape).curveTo(1296.3733, 437.67847, 1296.3843, 437.74585, 1296.3923, 437.81836);
        ((GeneralPath) shape).curveTo(1296.3923, 437.81796, 1296.6482, 437.78717, 1296.6482, 437.78717);
        ((GeneralPath) shape).curveTo(1296.6482, 437.78717, 1296.414, 437.63724, 1296.363, 437.60553);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFFEF8C));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_1

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(349.5522, 192.11049);
        ((GeneralPath) shape).lineTo(348.48282, 192.11107);
        ((GeneralPath) shape).curveTo(348.08444, 192.11128, 347.70474, 192.13797, 347.3463, 192.18137);
        ((GeneralPath) shape).curveTo(343.27475, 192.65439, 339.69754, 195.45549, 338.84625, 199.52223);
        ((GeneralPath) shape).curveTo(329.85657, 201.96172, 323.4058, 207.29025, 318.32452, 214.93391);
        ((GeneralPath) shape).curveTo(316.29172, 217.89891, 314.6273, 221.29567, 313.31097, 225.14845);
        ((GeneralPath) shape).lineTo(313.31097, 225.149);
        ((GeneralPath) shape).lineTo(313.31097, 225.14957);
        ((GeneralPath) shape).curveTo(313.31097, 225.14958, 313.3104, 225.15157, 313.3104, 225.15157);
        ((GeneralPath) shape).lineTo(313.3064, 225.16226);
        ((GeneralPath) shape).lineTo(313.30585, 225.16324);
        ((GeneralPath) shape).lineTo(313.28305, 225.21994);
        ((GeneralPath) shape).lineTo(313.27234, 225.25264);
        ((GeneralPath) shape).curveTo(313.27194, 225.25362, 313.2716, 225.25464, 313.27136, 225.25565);
        ((GeneralPath) shape).lineTo(313.26016, 225.29124);
        ((GeneralPath) shape).curveTo(313.24268, 225.34624, 313.21976, 225.41463, 313.19357, 225.49701);
        ((GeneralPath) shape).lineTo(313.20428, 225.46822);
        ((GeneralPath) shape).curveTo(312.81183, 226.63484, 312.4683, 227.82121, 312.16818, 229.02135);
        ((GeneralPath) shape).curveTo(312.16818, 229.02138, 312.16763, 229.02232, 312.1676, 229.02232);
        ((GeneralPath) shape).curveTo(312.1606, 229.05092, 312.1505, 229.07872, 312.1431, 229.10722);
        ((GeneralPath) shape).lineTo(312.14258, 229.1082);
        ((GeneralPath) shape).curveTo(312.14236, 229.10895, 312.14215, 229.10918, 312.142, 229.1102);
        ((GeneralPath) shape).lineTo(312.135, 229.1441);
        ((GeneralPath) shape).curveTo(312.0819, 229.37314, 312.02887, 229.60739, 311.97748, 229.84573);
        ((GeneralPath) shape).curveTo(311.9773, 229.84648, 311.9771, 229.84671, 311.97693, 229.84773);
        ((GeneralPath) shape).curveTo(311.86166, 230.34206, 311.75665, 230.83879, 311.65744, 231.33644);
        ((GeneralPath) shape).lineTo(311.65244, 231.35464);
        ((GeneralPath) shape).lineTo(311.63544, 231.44304);
        ((GeneralPath) shape).lineTo(311.63446, 231.44804);
        ((GeneralPath) shape).lineTo(311.6339, 231.45105);
        ((GeneralPath) shape).curveTo(311.63364, 231.45203, 311.63306, 231.45305, 311.63293, 231.45505);
        ((GeneralPath) shape).lineTo(311.63293, 231.45602);
        ((GeneralPath) shape).curveTo(311.53247, 231.96695, 311.4414, 232.48155, 311.3573, 232.9985);
        ((GeneralPath) shape).curveTo(311.3567, 233.00151, 311.3553, 233.00551, 311.3553, 233.0095);
        ((GeneralPath) shape).lineTo(311.3573, 232.9994);
        ((GeneralPath) shape).lineTo(311.3573, 233.00038);
        ((GeneralPath) shape).lineTo(311.3553, 233.00938);
        ((GeneralPath) shape).curveTo(311.35483, 233.01239, 311.3543, 233.01439, 311.35327, 233.01839);
        ((GeneralPath) shape).lineTo(311.34628, 233.05458);
        ((GeneralPath) shape).lineTo(311.3433, 233.07788);
        ((GeneralPath) shape).lineTo(311.3383, 233.10938);
        ((GeneralPath) shape).curveTo(311.2818, 233.49481, 311.23203, 233.8803, 311.1852, 234.26639);
        ((GeneralPath) shape).lineTo(311.1762, 234.33249);
        ((GeneralPath) shape).curveTo(311.17523, 234.34369, 311.17322, 234.35478, 311.1722, 234.36589);
        ((GeneralPath) shape).lineTo(311.1702, 234.38629);
        ((GeneralPath) shape).lineTo(311.16818, 234.40619);
        ((GeneralPath) shape).curveTo(311.11, 234.83936, 311.0562, 235.27472, 311.00958, 235.71239);
        ((GeneralPath) shape).lineTo(311.03888, 235.51993);
        ((GeneralPath) shape).curveTo(311.03885, 235.51999, 311.01138, 235.75897, 311.00278, 235.87325);
        ((GeneralPath) shape).curveTo(311.0048, 235.80835, 311.00677, 235.73997, 311.00778, 235.73401);
        ((GeneralPath) shape).curveTo(310.96118, 236.17308, 310.9207, 236.61198, 310.88635, 237.05188);
        ((GeneralPath) shape).lineTo(310.88434, 237.07698);
        ((GeneralPath) shape).curveTo(310.8838, 237.08398, 310.88232, 237.09119, 310.88232, 237.09808);
        ((GeneralPath) shape).lineTo(310.88232, 237.10208);
        ((GeneralPath) shape).lineTo(310.8803, 237.12718);
        ((GeneralPath) shape).lineTo(310.87933, 237.15648);
        ((GeneralPath) shape).curveTo(310.84393, 237.62611, 310.81653, 238.0964, 310.79492, 238.56697);
        ((GeneralPath) shape).lineTo(310.79193, 238.59688);
        ((GeneralPath) shape).lineTo(310.78992, 238.65408);
        ((GeneralPath) shape).lineTo(310.78992, 238.65465);
        ((GeneralPath) shape).lineTo(310.78992, 238.65518);
        ((GeneralPath) shape).lineTo(310.78992, 238.65575);
        ((GeneralPath) shape).curveTo(310.7676, 239.15979, 310.75342, 239.66466, 310.74713, 240.16995);
        ((GeneralPath) shape).curveTo(310.74414, 240.25725, 310.74112, 240.33733, 310.73703, 240.40735);
        ((GeneralPath) shape).curveTo(310.73694, 240.40935, 310.73657, 240.41235, 310.73645, 240.41435);
        ((GeneralPath) shape).lineTo(310.73444, 240.46205);
        ((GeneralPath) shape).lineTo(310.73444, 240.57245);
        ((GeneralPath) shape).lineTo(310.73444, 240.57297);
        ((GeneralPath) shape).lineTo(310.73444, 240.66547);
        ((GeneralPath) shape).lineTo(310.7354, 240.70146);
        ((GeneralPath) shape).curveTo(310.7384, 240.80602, 310.74442, 240.90163, 310.7477, 240.99045);
        ((GeneralPath) shape).curveTo(310.7477, 240.99062, 310.74768, 240.99081, 310.7477, 240.991);
        ((GeneralPath) shape).curveTo(310.74777, 240.99197, 310.74762, 240.99197, 310.7477, 240.994);
        ((GeneralPath) shape).curveTo(310.74774, 240.99701, 310.7482, 241.001, 310.74823, 241.0047);
        ((GeneralPath) shape).lineTo(310.74823, 241.0087);
        ((GeneralPath) shape).curveTo(310.75424, 241.50343, 310.76822, 241.99696, 310.78983, 242.48854);
        ((GeneralPath) shape).lineTo(310.78983, 242.49054);
        ((GeneralPath) shape).lineTo(310.78983, 242.49254);
        ((GeneralPath) shape).curveTo(310.78986, 242.4929, 310.78983, 242.49327, 310.78983, 242.49352);
        ((GeneralPath) shape).lineTo(310.79184, 242.54851);
        ((GeneralPath) shape).lineTo(310.79483, 242.5773);
        ((GeneralPath) shape).curveTo(310.81644, 243.04796, 310.84412, 243.5188, 310.87973, 243.98946);
        ((GeneralPath) shape).lineTo(310.8807, 244.01825);
        ((GeneralPath) shape).lineTo(310.88272, 244.04395);
        ((GeneralPath) shape).lineTo(310.88272, 244.04695);
        ((GeneralPath) shape).lineTo(310.88474, 244.06805);
        ((GeneralPath) shape).lineTo(310.88675, 244.09305);
        ((GeneralPath) shape).curveTo(310.92114, 244.53268, 310.96164, 244.97238, 311.0082, 245.41147);
        ((GeneralPath) shape).curveTo(311.00793, 245.40646, 311.0062, 245.33667, 311.0032, 245.27167);
        ((GeneralPath) shape).curveTo(311.0122, 245.38597, 311.0393, 245.62495, 311.0393, 245.625);
        ((GeneralPath) shape).lineTo(311.01, 245.43307);
        ((GeneralPath) shape).curveTo(311.0567, 245.87077, 311.11035, 246.30559, 311.16864, 246.73877);
        ((GeneralPath) shape).curveTo(311.169, 246.74178, 311.16937, 246.74377, 311.16962, 246.74777);
        ((GeneralPath) shape).lineTo(311.1706, 246.75957);
        ((GeneralPath) shape).lineTo(311.1726, 246.77946);
        ((GeneralPath) shape).curveTo(311.17358, 246.78957, 311.17462, 246.79936, 311.1766, 246.80937);
        ((GeneralPath) shape).curveTo(311.17682, 246.81035, 311.177, 246.81137, 311.1772, 246.81337);
        ((GeneralPath) shape).lineTo(311.1862, 246.87947);
        ((GeneralPath) shape).curveTo(311.23328, 247.26562, 311.28317, 247.65166, 311.33926, 248.03647);
        ((GeneralPath) shape).lineTo(311.34427, 248.06816);
        ((GeneralPath) shape).lineTo(311.34726, 248.09146);
        ((GeneralPath) shape).lineTo(311.35425, 248.12746);
        ((GeneralPath) shape).lineTo(311.35626, 248.13646);
        ((GeneralPath) shape).lineTo(311.35828, 248.14546);
        ((GeneralPath) shape).lineTo(311.35828, 248.14644);
        ((GeneralPath) shape).lineTo(311.35626, 248.13634);
        ((GeneralPath) shape).curveTo(311.35687, 248.13934, 311.35724, 248.14334, 311.35828, 248.14734);
        ((GeneralPath) shape).curveTo(311.44247, 248.66417, 311.5334, 249.1787, 311.6339, 249.68983);
        ((GeneralPath) shape).lineTo(311.6339, 249.69081);
        ((GeneralPath) shape).lineTo(311.63593, 249.69681);
        ((GeneralPath) shape).curveTo(311.6363, 249.6988, 311.6367, 249.69981, 311.6369, 249.70181);
        ((GeneralPath) shape).lineTo(311.6539, 249.79012);
        ((GeneralPath) shape).lineTo(311.6589, 249.80841);
        ((GeneralPath) shape).curveTo(311.758, 250.30606, 311.86316, 250.8028, 311.9784, 251.29712);
        ((GeneralPath) shape).curveTo(311.97858, 251.29784, 311.9788, 251.29808, 311.97894, 251.29912);
        ((GeneralPath) shape).curveTo(312.03024, 251.53748, 312.0835, 251.77171, 312.13647, 252.00076);
        ((GeneralPath) shape).lineTo(312.14346, 252.03467);
        ((GeneralPath) shape).curveTo(312.14365, 252.0354, 312.14383, 252.03564, 312.14404, 252.03667);
        ((GeneralPath) shape).lineTo(312.1446, 252.03764);
        ((GeneralPath) shape).curveTo(312.15158, 252.06624, 312.16168, 252.09404, 312.1691, 252.12254);
        ((GeneralPath) shape).curveTo(312.16922, 252.12294, 312.16956, 252.12326, 312.16968, 252.12352);
        ((GeneralPath) shape).curveTo(312.46957, 253.3227, 312.8126, 254.50813, 313.20465, 255.67387);
        ((GeneralPath) shape).lineTo(313.19766, 255.65158);
        ((GeneralPath) shape).curveTo(313.22107, 255.72498, 313.24335, 255.79424, 313.26425, 255.85902);
        ((GeneralPath) shape).lineTo(313.27435, 255.88902);
        ((GeneralPath) shape).curveTo(313.27484, 255.89, 313.27533, 255.89203, 313.27637, 255.89302);
        ((GeneralPath) shape).lineTo(313.28735, 255.92741);
        ((GeneralPath) shape).lineTo(313.30966, 255.98172);
        ((GeneralPath) shape).lineTo(313.30966, 255.9827);
        ((GeneralPath) shape).lineTo(313.31366, 255.9928);
        ((GeneralPath) shape).lineTo(313.3142, 255.9948);
        ((GeneralPath) shape).curveTo(313.31424, 255.99496, 313.31412, 255.9952, 313.3142, 255.99535);
        ((GeneralPath) shape).lineTo(313.3142, 255.99591);
        ((GeneralPath) shape).curveTo(314.63052, 259.8487, 316.29492, 263.24545, 318.32773, 266.21045);
        ((GeneralPath) shape).curveTo(323.40887, 273.85394, 329.85956, 279.182, 338.84885, 281.62158);
        ((GeneralPath) shape).curveTo(339.69434, 285.65997, 343.23032, 288.44714, 347.26132, 288.95245);
        ((GeneralPath) shape).curveTo(347.65082, 289.00336, 348.0597, 289.03305, 348.48602, 289.03336);
        ((GeneralPath) shape).lineTo(348.48657, 289.03336);
        ((GeneralPath) shape).lineTo(348.48715, 289.03336);
        ((GeneralPath) shape).curveTo(353.1142, 289.03336, 357.358, 286.09537, 358.1731, 281.44403);
        ((GeneralPath) shape).curveTo(364.83908, 279.51962, 369.87207, 276.06564, 374.5005, 270.90668);
        ((GeneralPath) shape).lineTo(374.5025, 270.90466);
        ((GeneralPath) shape).curveTo(375.3655, 269.94562, 376.18607, 268.9406, 376.9624, 267.89288);
        ((GeneralPath) shape).curveTo(377.0073, 267.83368, 377.0472, 267.7803, 377.07556, 267.74255);
        ((GeneralPath) shape).lineTo(377.08456, 267.73184);
        ((GeneralPath) shape).lineTo(377.09155, 267.72113);
        ((GeneralPath) shape).curveTo(377.81952, 266.7267, 378.5067, 265.6958, 379.15094, 264.6317);
        ((GeneralPath) shape).curveTo(379.22394, 264.51395, 379.29736, 264.39456, 379.37115, 264.27286);
        ((GeneralPath) shape).lineTo(379.37717, 264.26187);
        ((GeneralPath) shape).lineTo(379.38318, 264.25116);
        ((GeneralPath) shape).curveTo(379.97702, 263.2453, 380.53214, 262.21152, 381.0477, 261.15286);
        ((GeneralPath) shape).curveTo(381.145, 260.95834, 381.24176, 260.76263, 381.33722, 260.56436);
        ((GeneralPath) shape).lineTo(381.34222, 260.55338);
        ((GeneralPath) shape).lineTo(381.34723, 260.54156);
        ((GeneralPath) shape).curveTo(381.81085, 259.54938, 382.2388, 258.53757, 382.63123, 257.50815);
        ((GeneralPath) shape).curveTo(382.74524, 257.21832, 382.85657, 256.92734, 382.9646, 256.63513);
        ((GeneralPath) shape).lineTo(382.9686, 256.62332);
        ((GeneralPath) shape).lineTo(382.9726, 256.61234);
        ((GeneralPath) shape).curveTo(383.14288, 256.13507, 383.30524, 255.65431, 383.46014, 255.17024);
        ((GeneralPath) shape).curveTo(383.61227, 254.69484, 383.75714, 254.21568, 383.89444, 253.73367);
        ((GeneralPath) shape).lineTo(383.895, 253.73167);
        ((GeneralPath) shape).curveTo(384.0051, 253.35947, 384.11005, 252.98544, 384.21112, 252.60962);
        ((GeneralPath) shape).lineTo(384.21112, 252.60864);
        ((GeneralPath) shape).lineTo(384.21112, 252.60767);
        ((GeneralPath) shape).lineTo(384.2141, 252.59866);
        ((GeneralPath) shape).curveTo(384.21466, 252.59666, 384.21613, 252.59467, 384.21613, 252.59267);
        ((GeneralPath) shape).lineTo(384.2231, 252.56607);
        ((GeneralPath) shape).lineTo(384.2271, 252.54837);
        ((GeneralPath) shape).lineTo(384.23312, 252.52277);
        ((GeneralPath) shape).curveTo(384.4616, 251.62689, 384.66425, 250.72209, 384.84045, 249.80995);
        ((GeneralPath) shape).curveTo(384.9406, 249.31834, 385.03326, 248.82558, 385.1178, 248.33124);
        ((GeneralPath) shape).lineTo(385.1198, 248.31894);
        ((GeneralPath) shape).lineTo(385.12183, 248.30664);
        ((GeneralPath) shape).curveTo(385.2511, 247.49458, 385.35883, 246.67741, 385.44632, 245.85728);
        ((GeneralPath) shape).curveTo(385.46643, 245.7059, 385.4403, 245.91258, 385.44833, 245.83958);
        ((GeneralPath) shape).lineTo(385.45035, 245.82259);
        ((GeneralPath) shape).curveTo(385.4505, 245.82161, 385.45074, 245.82059, 385.4509, 245.81859);
        ((GeneralPath) shape).curveTo(385.4849, 245.52751, 385.5165, 245.23502, 385.5452, 244.94112);
        ((GeneralPath) shape).curveTo(385.54532, 244.94014, 385.54562, 244.93912, 385.54575, 244.93712);
        ((GeneralPath) shape).curveTo(385.58685, 244.52573, 385.58655, 244.52444, 385.5452, 244.93768);
        ((GeneralPath) shape).lineTo(385.5452, 244.93568);
        ((GeneralPath) shape).curveTo(385.5744, 244.63806, 385.6002, 244.34288, 385.6236, 244.04935);
        ((GeneralPath) shape).lineTo(385.6053, 244.20686);
        ((GeneralPath) shape).curveTo(385.60532, 244.20677, 385.6309, 243.83847, 385.62857, 243.78755);
        ((GeneralPath) shape).curveTo(385.62656, 243.73665, 385.63058, 243.80646, 385.63058, 243.87746);
        ((GeneralPath) shape).lineTo(385.6236, 244.04941);
        ((GeneralPath) shape).curveTo(385.6466, 243.76605, 385.6668, 243.48325, 385.6845, 243.20134);
        ((GeneralPath) shape).lineTo(385.66342, 243.39603);
        ((GeneralPath) shape).curveTo(385.66342, 243.39595, 385.68903, 243.02763, 385.6867, 242.9767);
        ((GeneralPath) shape).curveTo(385.6847, 242.9258, 385.68872, 242.9956, 385.68872, 243.0665);
        ((GeneralPath) shape).lineTo(385.68472, 243.20074);
        ((GeneralPath) shape).curveTo(385.70102, 242.94293, 385.71512, 242.68304, 385.7275, 242.42148);
        ((GeneralPath) shape).lineTo(385.73352, 242.36168);
        ((GeneralPath) shape).lineTo(385.73352, 242.30399);
        ((GeneralPath) shape).lineTo(385.73352, 242.25578);
        ((GeneralPath) shape).curveTo(385.73352, 242.25577, 385.73355, 242.24979, 385.73352, 242.24678);
        ((GeneralPath) shape).curveTo(385.7336, 242.24478, 385.7334, 242.24278, 385.73352, 242.23978);
        ((GeneralPath) shape).curveTo(385.75592, 241.7214, 385.77112, 241.20299, 385.77682, 240.68451);
        ((GeneralPath) shape).lineTo(385.77682, 240.68353);
        ((GeneralPath) shape).curveTo(385.77725, 240.64323, 385.77682, 240.62444, 385.77682, 240.63023);
        ((GeneralPath) shape).lineTo(385.77682, 240.55603);
        ((GeneralPath) shape).lineTo(385.77737, 240.56203);
        ((GeneralPath) shape).lineTo(385.77682, 240.49263);
        ((GeneralPath) shape).curveTo(385.77695, 240.50513, 385.77682, 240.49663, 385.77682, 240.46863);
        ((GeneralPath) shape).lineTo(385.77682, 240.45683);
        ((GeneralPath) shape).lineTo(385.77682, 240.44504);
        ((GeneralPath) shape).curveTo(385.77182, 239.93208, 385.75623, 239.41739, 385.73404, 238.90257);
        ((GeneralPath) shape).lineTo(385.73404, 238.83937);
        ((GeneralPath) shape).lineTo(385.73203, 238.79128);
        ((GeneralPath) shape).curveTo(385.71912, 238.50587, 385.70334, 238.22255, 385.68533, 237.94154);
        ((GeneralPath) shape).lineTo(385.68933, 238.07634);
        ((GeneralPath) shape).curveTo(385.68933, 238.07623, 385.68732, 238.16673, 385.68732, 238.16653);
        ((GeneralPath) shape).curveTo(385.68732, 238.16646, 385.6883, 237.95828, 385.6783, 237.8637);
        ((GeneralPath) shape).lineTo(385.68433, 237.94159);
        ((GeneralPath) shape).curveTo(385.66653, 237.65938, 385.64633, 237.37643, 385.62332, 237.09352);
        ((GeneralPath) shape).lineTo(385.6303, 237.26546);
        ((GeneralPath) shape).curveTo(385.6303, 237.26538, 385.6283, 237.35596, 385.6283, 237.35585);
        ((GeneralPath) shape).curveTo(385.6283, 237.35577, 385.62927, 237.14757, 385.6193, 237.053);
        ((GeneralPath) shape).curveTo(385.597, 236.77335, 385.57278, 236.49362, 385.5456, 236.21269);
        ((GeneralPath) shape).curveTo(385.54532, 236.2107, 385.5453, 236.21172, 385.54504, 236.2087);
        ((GeneralPath) shape).lineTo(385.54504, 236.2067);
        ((GeneralPath) shape).lineTo(385.54446, 236.20369);
        ((GeneralPath) shape).curveTo(385.54434, 236.20271, 385.5446, 236.2031, 385.54446, 236.20169);
        ((GeneralPath) shape).curveTo(385.51578, 235.90695, 385.48407, 235.61491, 385.45026, 235.32478);
        ((GeneralPath) shape).curveTo(385.451, 235.32878, 385.4494, 235.32079, 385.4497, 235.32079);
        ((GeneralPath) shape).lineTo(385.4477, 235.30379);
        ((GeneralPath) shape).curveTo(385.4477, 235.30359, 385.44772, 235.30339, 385.4477, 235.30322);
        ((GeneralPath) shape).lineTo(385.44672, 235.29422);
        ((GeneralPath) shape).curveTo(385.35892, 234.47105, 385.25085, 233.65096, 385.12112, 232.83597);
        ((GeneralPath) shape).lineTo(385.1191, 232.82367);
        ((GeneralPath) shape).lineTo(385.1171, 232.81187);
        ((GeneralPath) shape).curveTo(385.0328, 232.31903, 384.9407, 231.82773, 384.84085, 231.33759);
        ((GeneralPath) shape).lineTo(384.83884, 231.33058);
        ((GeneralPath) shape).curveTo(384.66278, 230.4195, 384.46054, 229.51521, 384.23206, 228.61942);
        ((GeneralPath) shape).lineTo(384.22906, 228.60712);
        ((GeneralPath) shape).lineTo(384.22607, 228.59532);
        ((GeneralPath) shape).curveTo(384.12003, 228.19884, 384.00882, 227.80414, 383.89273, 227.41168);
        ((GeneralPath) shape).curveTo(383.75522, 226.92879, 383.6103, 226.44919, 383.4579, 225.97292);
        ((GeneralPath) shape).curveTo(383.303, 225.48883, 383.14066, 225.0075, 382.97034, 224.53023);
        ((GeneralPath) shape).lineTo(382.96634, 224.51923);
        ((GeneralPath) shape).lineTo(382.96234, 224.50822);
        ((GeneralPath) shape).curveTo(382.85434, 224.21602, 382.74298, 223.92447, 382.629, 223.63464);
        ((GeneralPath) shape).curveTo(382.2366, 222.60521, 381.80862, 221.5934, 381.34497, 220.60126);
        ((GeneralPath) shape).lineTo(381.33997, 220.59026);
        ((GeneralPath) shape).lineTo(381.33496, 220.57925);
        ((GeneralPath) shape).curveTo(381.23956, 220.38112, 381.1432, 220.18517, 381.046, 219.99077);
        ((GeneralPath) shape).curveTo(380.5304, 218.93208, 379.97528, 217.89832, 379.38144, 216.89246);
        ((GeneralPath) shape).lineTo(379.37543, 216.88145);
        ((GeneralPath) shape).lineTo(379.36942, 216.87076);
        ((GeneralPath) shape).curveTo(379.29562, 216.7489, 379.22223, 216.62921, 379.1492, 216.51135);
        ((GeneralPath) shape).lineTo(379.14822, 216.50935);
        ((GeneralPath) shape).curveTo(378.50424, 215.44586, 377.81747, 214.41603, 377.08987, 213.42213);
        ((GeneralPath) shape).lineTo(377.0829, 213.41144);
        ((GeneralPath) shape).lineTo(377.0759, 213.40074);
        ((GeneralPath) shape).curveTo(377.048, 213.36365, 377.0084, 213.31055, 376.96445, 213.25208);
        ((GeneralPath) shape).lineTo(376.96243, 213.25008);
        ((GeneralPath) shape).curveTo(376.18616, 212.20245, 375.36542, 211.19725, 374.50253, 210.2383);
        ((GeneralPath) shape).lineTo(374.50052, 210.23529);
        ((GeneralPath) shape).curveTo(369.8721, 205.07643, 364.83884, 201.62334, 358.17307, 199.69907);
        ((GeneralPath) shape).curveTo(357.42603, 195.43306, 353.7908, 192.63742, 349.62305, 192.19899);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(385.45227, 235.32706);
        ((GeneralPath) shape).curveTo(385.44827, 235.30415, 385.46936, 235.4844, 385.45526, 235.34875);
        ((GeneralPath) shape).lineTo(385.45468, 235.34375);
        ((GeneralPath) shape).curveTo(385.45413, 235.33875, 385.45267, 235.33305, 385.45267, 235.32755);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(312.14285, 252.03828);
        ((GeneralPath) shape).lineTo(312.14886, 252.06758);
        ((GeneralPath) shape).lineTo(312.16446, 252.11978);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(312.14285, 229.10715);
        ((GeneralPath) shape).lineTo(312.16504, 229.02565);
        ((GeneralPath) shape).lineTo(312.14954, 229.07785);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(348.47614, 196.37135);
        ((GeneralPath) shape).lineTo(348.48514, 196.37135);
        ((GeneralPath) shape).curveTo(351.5006, 196.37135, 353.5839, 197.87485, 354.00064, 200.50742);
        ((GeneralPath) shape).curveTo(354.00076, 200.50839, 354.00104, 200.50941, 354.0012, 200.51042);
        ((GeneralPath) shape).lineTo(354.00174, 200.51343);
        ((GeneralPath) shape).lineTo(354.00174, 200.51543);
        ((GeneralPath) shape).curveTo(354.01624, 200.60762, 354.02823, 200.69554, 354.03735, 200.77943);
        ((GeneralPath) shape).lineTo(354.03735, 200.78143);
        ((GeneralPath) shape).lineTo(354.03787, 200.78644);
        ((GeneralPath) shape).lineTo(354.03845, 200.79144);
        ((GeneralPath) shape).curveTo(354.04855, 200.88315, 354.05545, 200.97884, 354.06125, 201.0782);
        ((GeneralPath) shape).lineTo(354.06125, 201.0822);
        ((GeneralPath) shape).curveTo(354.06625, 201.18434, 354.07025, 201.27556, 354.07025, 201.35397);
        ((GeneralPath) shape).lineTo(354.07025, 203.02347);
        ((GeneralPath) shape).lineTo(355.69208, 203.42227);
        ((GeneralPath) shape).curveTo(362.3517, 205.05872, 366.75446, 207.98534, 371.33005, 213.08604);
        ((GeneralPath) shape).lineTo(371.33206, 213.08702);
        ((GeneralPath) shape).lineTo(371.33304, 213.08902);
        ((GeneralPath) shape).curveTo(372.1059, 213.94775, 372.8422, 214.84941, 373.54, 215.7913);
        ((GeneralPath) shape).lineTo(373.549, 215.8031);
        ((GeneralPath) shape).lineTo(373.558, 215.8141);
        ((GeneralPath) shape).curveTo(373.5813, 215.8447, 373.6162, 215.892, 373.6556, 215.94444);
        ((GeneralPath) shape).curveTo(374.30844, 216.8364, 374.92593, 217.76251, 375.50595, 218.7205);
        ((GeneralPath) shape).lineTo(375.51196, 218.7306);
        ((GeneralPath) shape).lineTo(375.51697, 218.7407);
        ((GeneralPath) shape).curveTo(375.58548, 218.85115, 375.65274, 218.96053, 375.7183, 219.06851);
        ((GeneralPath) shape).curveTo(376.2523, 219.9734, 376.75302, 220.90459, 377.2181, 221.85954);
        ((GeneralPath) shape).lineTo(377.2231, 221.87024);
        ((GeneralPath) shape).lineTo(377.22812, 221.88094);
        ((GeneralPath) shape).curveTo(377.31653, 222.05751, 377.40323, 222.23326, 377.48828, 222.40953);
        ((GeneralPath) shape).curveTo(377.48914, 222.41153, 377.48926, 222.41353, 377.4903, 222.41454);
        ((GeneralPath) shape).curveTo(377.9085, 223.30989, 378.2959, 224.22417, 378.65118, 225.15622);
        ((GeneralPath) shape).lineTo(378.65518, 225.16722);
        ((GeneralPath) shape).lineTo(378.65918, 225.17792);
        ((GeneralPath) shape).curveTo(378.76306, 225.4416, 378.86432, 225.70746, 378.96313, 225.97441);
        ((GeneralPath) shape).curveTo(379.11664, 226.40495, 379.26385, 226.83861, 379.40353, 227.27509);
        ((GeneralPath) shape).curveTo(379.54404, 227.7143, 379.6772, 228.15602, 379.80344, 228.60016);
        ((GeneralPath) shape).lineTo(379.80643, 228.61116);
        ((GeneralPath) shape).lineTo(379.80942, 228.62216);
        ((GeneralPath) shape).curveTo(379.91397, 228.97556, 380.0135, 229.33022, 380.10892, 229.68655);
        ((GeneralPath) shape).curveTo(380.31635, 230.50044, 380.50098, 231.32202, 380.6608, 232.14978);
        ((GeneralPath) shape).lineTo(380.6628, 232.16078);
        ((GeneralPath) shape).lineTo(380.6658, 232.17178);
        ((GeneralPath) shape).curveTo(380.7571, 232.61919, 380.84125, 233.06865, 380.9187, 233.5207);
        ((GeneralPath) shape).curveTo(381.0385, 234.2746, 381.13864, 235.03226, 381.21875, 235.79202);
        ((GeneralPath) shape).curveTo(381.18625, 235.50412, 381.16205, 235.37474, 381.22574, 235.85292);
        ((GeneralPath) shape).lineTo(381.22174, 235.81732);
        ((GeneralPath) shape).curveTo(381.25266, 236.08249, 381.28094, 236.34627, 381.30664, 236.60826);
        ((GeneralPath) shape).curveTo(381.3072, 236.61327, 381.30762, 236.61896, 381.30865, 236.62436);
        ((GeneralPath) shape).curveTo(381.30872, 236.62509, 381.30856, 236.62476, 381.30865, 236.62534);
        ((GeneralPath) shape).lineTo(381.30865, 236.62631);
        ((GeneralPath) shape).lineTo(381.3092, 236.62932);
        ((GeneralPath) shape).curveTo(381.30933, 236.6303, 381.3091, 236.62988, 381.3092, 236.63132);
        ((GeneralPath) shape).curveTo(381.3343, 236.88805, 381.3568, 237.14594, 381.3776, 237.40506);
        ((GeneralPath) shape).lineTo(381.38058, 237.44116);
        ((GeneralPath) shape).curveTo(381.4015, 237.69774, 381.41968, 237.95572, 381.4362, 238.2138);
        ((GeneralPath) shape).lineTo(381.4382, 238.2431);
        ((GeneralPath) shape).lineTo(381.43875, 238.2532);
        ((GeneralPath) shape).curveTo(381.45355, 238.48607, 381.46585, 238.71724, 381.47635, 238.94708);
        ((GeneralPath) shape).lineTo(381.47635, 238.97038);
        ((GeneralPath) shape).lineTo(381.47836, 239.01799);
        ((GeneralPath) shape).curveTo(381.49988, 239.49683, 381.51218, 239.97789, 381.51776, 240.46008);
        ((GeneralPath) shape).lineTo(381.51077, 240.576);
        ((GeneralPath) shape).lineTo(381.51776, 240.68748);
        ((GeneralPath) shape).curveTo(381.51276, 241.17009, 381.49936, 241.6522, 381.47787, 242.13348);
        ((GeneralPath) shape).lineTo(381.47586, 242.18068);
        ((GeneralPath) shape).lineTo(381.47586, 242.20288);
        ((GeneralPath) shape).curveTo(381.46457, 242.44585, 381.45078, 242.69022, 381.43546, 242.93668);
        ((GeneralPath) shape).lineTo(381.43344, 242.97598);
        ((GeneralPath) shape).curveTo(381.41785, 243.22124, 381.39984, 243.46599, 381.38013, 243.70924);
        ((GeneralPath) shape).lineTo(381.37714, 243.74915);
        ((GeneralPath) shape).curveTo(381.35645, 244.00824, 381.33435, 244.26472, 381.30945, 244.51901);
        ((GeneralPath) shape).curveTo(381.30933, 244.51999, 381.309, 244.52101, 381.30887, 244.52202);
        ((GeneralPath) shape).curveTo(381.30872, 244.523, 381.30902, 244.52281, 381.30887, 244.52402);
        ((GeneralPath) shape).lineTo(381.30887, 244.52458);
        ((GeneralPath) shape).curveTo(381.30832, 244.52959, 381.3083, 244.52759, 381.30792, 244.53358);
        ((GeneralPath) shape).curveTo(381.28192, 244.79924, 381.25363, 245.06581, 381.2224, 245.33284);
        ((GeneralPath) shape).lineTo(381.2264, 245.29774);
        ((GeneralPath) shape).curveTo(381.1621, 245.77966, 381.1861, 245.6546, 381.21942, 245.35864);
        ((GeneralPath) shape).curveTo(381.13953, 246.1177, 381.039, 246.87459, 380.9193, 247.62775);
        ((GeneralPath) shape).curveTo(380.8418, 248.08034, 380.75787, 248.53041, 380.6664, 248.97835);
        ((GeneralPath) shape).lineTo(380.66342, 248.98935);
        ((GeneralPath) shape).lineTo(380.6614, 249.00035);
        ((GeneralPath) shape).curveTo(380.50137, 249.82915, 380.3164, 250.6522, 380.1084, 251.46802);
        ((GeneralPath) shape).curveTo(380.10797, 251.47002, 380.10773, 251.47102, 380.10742, 251.47302);
        ((GeneralPath) shape).curveTo(380.01273, 251.82623, 379.9138, 252.17824, 379.81012, 252.52855);
        ((GeneralPath) shape).lineTo(379.80713, 252.53964);
        ((GeneralPath) shape).lineTo(379.80414, 252.55064);
        ((GeneralPath) shape).curveTo(379.6779, 252.99478, 379.54477, 253.43594, 379.40424, 253.87514);
        ((GeneralPath) shape).curveTo(379.26456, 254.3116, 379.11737, 254.74525, 378.96384, 255.1758);
        ((GeneralPath) shape).curveTo(378.96286, 255.1788, 378.96182, 255.1808, 378.96085, 255.1848);
        ((GeneralPath) shape).curveTo(378.86295, 255.44897, 378.76245, 255.71198, 378.65967, 255.97296);
        ((GeneralPath) shape).lineTo(378.65567, 255.98405);
        ((GeneralPath) shape).lineTo(378.65167, 255.99506);
        ((GeneralPath) shape).curveTo(378.29688, 256.92578, 377.90997, 257.83875, 377.49246, 258.73285);
        ((GeneralPath) shape).curveTo(377.40607, 258.91202, 377.31824, 259.0914, 377.22842, 259.27087);
        ((GeneralPath) shape).lineTo(377.22342, 259.28098);
        ((GeneralPath) shape).lineTo(377.2184, 259.2917);
        ((GeneralPath) shape).curveTo(376.75336, 260.24664, 376.25266, 261.17783, 375.71863, 262.0827);
        ((GeneralPath) shape).curveTo(375.65292, 262.1907, 375.58575, 262.30005, 375.51727, 262.41052);
        ((GeneralPath) shape).lineTo(375.51227, 262.42062);
        ((GeneralPath) shape).lineTo(375.50626, 262.43073);
        ((GeneralPath) shape).curveTo(374.9255, 263.38986, 374.3074, 264.3166, 373.6537, 265.20956);
        ((GeneralPath) shape).curveTo(373.6156, 265.26056, 373.58118, 265.30667, 373.5583, 265.33658);
        ((GeneralPath) shape).lineTo(373.5493, 265.3484);
        ((GeneralPath) shape).lineTo(373.54028, 265.3602);
        ((GeneralPath) shape).curveTo(372.84244, 266.3021, 372.10614, 267.20374, 371.3333, 268.06247);
        ((GeneralPath) shape).lineTo(371.33234, 268.06345);
        ((GeneralPath) shape).lineTo(371.33032, 268.06442);
        ((GeneralPath) shape).curveTo(366.75473, 273.1652, 362.35193, 276.0929, 355.69235, 277.7293);
        ((GeneralPath) shape).lineTo(354.07776, 278.1259);
        ((GeneralPath) shape).lineTo(354.07077, 279.78818);
        ((GeneralPath) shape).curveTo(354.07037, 279.87936, 354.06778, 279.9743, 354.06177, 280.07214);
        ((GeneralPath) shape).lineTo(354.06177, 280.07416);
        ((GeneralPath) shape).curveTo(354.06174, 280.0747, 354.0618, 280.07513, 354.06177, 280.07617);
        ((GeneralPath) shape).curveTo(354.05676, 280.17398, 354.04907, 280.26825, 354.03946, 280.35846);
        ((GeneralPath) shape).lineTo(354.03946, 280.35904);
        ((GeneralPath) shape).lineTo(354.03848, 280.36404);
        ((GeneralPath) shape).lineTo(354.03787, 280.37006);
        ((GeneralPath) shape).lineTo(354.03787, 280.37103);
        ((GeneralPath) shape).curveTo(354.02887, 280.45493, 354.01706, 280.5424, 354.00226, 280.6361);
        ((GeneralPath) shape).lineTo(354.00226, 280.63812);
        ((GeneralPath) shape).curveTo(353.58734, 283.27325, 351.50345, 284.77826, 348.4868, 284.77863);
        ((GeneralPath) shape).curveTo(348.2512, 284.77847, 348.02768, 284.76233, 347.8073, 284.73303);
        ((GeneralPath) shape).lineTo(347.80032, 284.73248);
        ((GeneralPath) shape).lineTo(347.79333, 284.7315);
        ((GeneralPath) shape).curveTo(345.73047, 284.4739, 343.96915, 283.7795, 343.0714, 280.5397);
        ((GeneralPath) shape).curveTo(343.0714, 280.5397, 347.4025, 280.9735, 350.10638, 278.37228);
        ((GeneralPath) shape).curveTo(346.51706, 279.0629, 342.86246, 278.2509, 342.86246, 278.2509);
        ((GeneralPath) shape).lineTo(341.25116, 277.88205);
        ((GeneralPath) shape).curveTo(332.50107, 275.88104, 326.81665, 271.2968, 321.86707, 263.84705);
        ((GeneralPath) shape).lineTo(321.85806, 263.83365);
        ((GeneralPath) shape).lineTo(321.84906, 263.82025);
        ((GeneralPath) shape).curveTo(320.03973, 261.1841, 318.5272, 258.11697, 317.31143, 254.53476);
        ((GeneralPath) shape).curveTo(317.29184, 254.47417, 317.27283, 254.41591, 317.25522, 254.36171);
        ((GeneralPath) shape).lineTo(317.2445, 254.32841);
        ((GeneralPath) shape).lineTo(317.24353, 254.32541);
        ((GeneralPath) shape).curveTo(316.87918, 253.24268, 316.55856, 252.14098, 316.28122, 251.02356);
        ((GeneralPath) shape).curveTo(316.23032, 250.8028, 316.18152, 250.5859, 316.1359, 250.37296);
        ((GeneralPath) shape).lineTo(316.1319, 250.35416);
        ((GeneralPath) shape).lineTo(316.1279, 250.33595);
        ((GeneralPath) shape).curveTo(316.0148, 249.85081, 315.91003, 249.36255, 315.81342, 248.87166);
        ((GeneralPath) shape).lineTo(315.81342, 248.87068);
        ((GeneralPath) shape).lineTo(315.8129, 248.86868);
        ((GeneralPath) shape).curveTo(315.71838, 248.3881, 315.6319, 247.90648, 315.55386, 247.4238);
        ((GeneralPath) shape).curveTo(315.5536, 247.4218, 315.55362, 247.4198, 315.55334, 247.4178);
        ((GeneralPath) shape).curveTo(315.49796, 247.03918, 315.44727, 246.65924, 315.4019, 246.27856);
        ((GeneralPath) shape).lineTo(315.40588, 246.31897);
        ((GeneralPath) shape).curveTo(315.40588, 246.31895, 315.4079, 246.39737, 315.4109, 246.4654);
        ((GeneralPath) shape).curveTo(315.4019, 246.35112, 315.3747, 246.11215, 315.3747, 246.11208);
        ((GeneralPath) shape).lineTo(315.397, 246.24298);
        ((GeneralPath) shape).curveTo(315.3404, 245.828, 315.2898, 245.41325, 315.2456, 244.99944);
        ((GeneralPath) shape).curveTo(315.24554, 244.99907, 315.24564, 244.9987, 315.2456, 244.99846);
        ((GeneralPath) shape).lineTo(315.245, 244.99146);
        ((GeneralPath) shape).lineTo(315.24402, 244.98645);
        ((GeneralPath) shape).lineTo(315.24402, 244.98547);
        ((GeneralPath) shape).curveTo(315.1993, 244.56622, 315.16132, 244.14542, 315.12866, 243.72362);
        ((GeneralPath) shape).lineTo(315.13165, 243.78111);
        ((GeneralPath) shape).curveTo(315.14575, 244.06349, 315.15884, 244.02437, 315.12466, 243.67412);
        ((GeneralPath) shape).lineTo(315.12866, 243.72342);
        ((GeneralPath) shape).curveTo(315.09265, 243.25258, 315.06415, 242.78053, 315.04315, 242.30737);
        ((GeneralPath) shape).lineTo(315.04315, 242.30684);
        ((GeneralPath) shape).lineTo(315.04315, 242.30627);
        ((GeneralPath) shape).curveTo(315.02246, 241.83284, 315.00906, 241.36041, 315.00375, 240.88913);
        ((GeneralPath) shape).lineTo(315.0032, 240.84982);
        ((GeneralPath) shape).curveTo(315.00317, 240.84903, 315.00323, 240.84901, 315.0032, 240.84782);
        ((GeneralPath) shape).lineTo(315.0012, 240.81343);
        ((GeneralPath) shape).lineTo(315.00064, 240.80743);
        ((GeneralPath) shape).curveTo(315.0006, 240.80646, 315.0007, 240.8069, 315.00064, 240.80544);
        ((GeneralPath) shape).curveTo(314.99765, 240.72644, 314.99463, 240.65564, 314.99164, 240.58969);
        ((GeneralPath) shape).lineTo(314.99164, 240.57869);
        ((GeneralPath) shape).lineTo(314.99164, 240.57812);
        ((GeneralPath) shape).lineTo(314.99164, 240.57312);
        ((GeneralPath) shape).lineTo(314.99164, 240.56412);
        ((GeneralPath) shape).curveTo(314.99463, 240.48271, 314.99765, 240.40309, 315.00174, 240.33615);
        ((GeneralPath) shape).lineTo(315.00375, 240.28995);
        ((GeneralPath) shape).lineTo(315.00375, 240.26665);
        ((GeneralPath) shape).curveTo(315.00876, 239.79448, 315.02225, 239.32278, 315.04315, 238.8506);
        ((GeneralPath) shape).lineTo(315.04315, 238.8476);
        ((GeneralPath) shape).curveTo(315.06375, 238.37527, 315.09244, 237.90312, 315.12866, 237.4321);
        ((GeneralPath) shape).lineTo(315.12466, 237.4814);
        ((GeneralPath) shape).curveTo(315.15985, 237.1311, 315.14658, 237.092, 315.13165, 237.37437);
        ((GeneralPath) shape).lineTo(315.12866, 237.43207);
        ((GeneralPath) shape).curveTo(315.16125, 237.0102, 315.19916, 236.58983, 315.244, 236.17024);
        ((GeneralPath) shape).lineTo(315.244, 236.16927);
        ((GeneralPath) shape).lineTo(315.24496, 236.16426);
        ((GeneralPath) shape).lineTo(315.24554, 236.15726);
        ((GeneralPath) shape).lineTo(315.24554, 236.15628);
        ((GeneralPath) shape).curveTo(315.28986, 235.74245, 315.34055, 235.32825, 315.39694, 234.9133);
        ((GeneralPath) shape).lineTo(315.37476, 235.04362);
        ((GeneralPath) shape).curveTo(315.37476, 235.04356, 315.40225, 234.80461, 315.41086, 234.69029);
        ((GeneralPath) shape).curveTo(315.40884, 234.75879, 315.40585, 234.83678, 315.40585, 234.83673);
        ((GeneralPath) shape).lineTo(315.40186, 234.87714);
        ((GeneralPath) shape).curveTo(315.44745, 234.49536, 315.49786, 234.11522, 315.55325, 233.73624);
        ((GeneralPath) shape).curveTo(315.55347, 233.73526, 315.55365, 233.73424, 315.55383, 233.73224);
        ((GeneralPath) shape).curveTo(315.63193, 233.24957, 315.7183, 232.76776, 315.81287, 232.2868);
        ((GeneralPath) shape).lineTo(315.8134, 232.2838);
        ((GeneralPath) shape).curveTo(315.9101, 231.79291, 316.01477, 231.30464, 316.12787, 230.8195);
        ((GeneralPath) shape).lineTo(316.13187, 230.80121);
        ((GeneralPath) shape).lineTo(316.13586, 230.783);
        ((GeneralPath) shape).curveTo(316.18167, 230.56987, 316.23016, 230.35226, 316.2812, 230.1313);
        ((GeneralPath) shape).curveTo(316.55765, 229.01761, 316.8779, 227.91978, 317.24075, 226.84053);
        ((GeneralPath) shape).curveTo(317.24173, 226.83653, 317.24277, 226.83153, 317.24475, 226.82713);
        ((GeneralPath) shape).lineTo(317.25705, 226.79004);
        ((GeneralPath) shape).curveTo(317.27094, 226.74614, 317.28995, 226.68665, 317.31085, 226.622);
        ((GeneralPath) shape).curveTo(318.52667, 223.03926, 320.03952, 219.97182, 321.84903, 217.33539);
        ((GeneralPath) shape).lineTo(321.85803, 217.32199);
        ((GeneralPath) shape).lineTo(321.86703, 217.3086);
        ((GeneralPath) shape).curveTo(326.81665, 209.85884, 332.50104, 205.27463, 341.25113, 203.2736);
        ((GeneralPath) shape).lineTo(342.86243, 202.90474);
        ((GeneralPath) shape).lineTo(342.90573, 201.25244);
        ((GeneralPath) shape).curveTo(342.97922, 198.42676, 344.90277, 196.75797, 347.84494, 196.41803);
        ((GeneralPath) shape).lineTo(347.85095, 196.4175);
        ((GeneralPath) shape).lineTo(347.85696, 196.41652);
        ((GeneralPath) shape).curveTo(348.0633, 196.39131, 348.26804, 196.37833, 348.47873, 196.37782);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(354.0277, 200.51299);
        ((GeneralPath) shape).curveTo(354.02762, 200.53758, 354.02972, 200.57579, 354.0317, 200.63055);
        ((GeneralPath) shape).curveTo(354.03073, 200.61345, 354.0267, 200.58615, 354.0267, 200.57675);
        ((GeneralPath) shape).curveTo(354.0265, 200.53735, 354.02762, 200.53175, 354.02872, 200.51295);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(313.24664, 225.34935);
        ((GeneralPath) shape).lineTo(313.24612, 225.35236);
        ((GeneralPath) shape).lineTo(313.24313, 225.36136);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(317.269, 226.7221);
        ((GeneralPath) shape).lineTo(317.26602, 226.73221);
        ((GeneralPath) shape).lineTo(317.26602, 226.73123);
        ((GeneralPath) shape).lineTo(317.26654, 226.72923);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(317.2058, 226.92015);
        ((GeneralPath) shape).lineTo(317.2018, 226.93245);
        ((GeneralPath) shape).lineTo(317.2018, 226.93147);
        ((GeneralPath) shape).lineTo(317.2024, 226.92947);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(316.25125, 230.22812);
        ((GeneralPath) shape).lineTo(316.24924, 230.23512);
        ((GeneralPath) shape).lineTo(316.24924, 230.23415);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.8436, 231.69019);
        ((GeneralPath) shape).curveTo(315.84262, 231.67828, 315.8486, 231.78018, 315.8486, 231.78009);
        ((GeneralPath) shape).curveTo(315.8486, 231.78009, 315.84763, 231.79329, 315.84763, 231.79399);
        ((GeneralPath) shape).curveTo(315.8456, 231.74739, 315.84363, 231.69759, 315.84363, 231.69029);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(311.60822, 231.75899);
        ((GeneralPath) shape).curveTo(311.6022, 231.84499, 311.5945, 231.93065, 311.5938, 231.94037);
        ((GeneralPath) shape).curveTo(311.59283, 231.91217, 311.59082, 231.87708, 311.59082, 231.87717);
        ((GeneralPath) shape).curveTo(311.59082, 231.87718, 311.6028, 231.79556, 311.60782, 231.75903);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.8336, 231.97752);
        ((GeneralPath) shape).curveTo(315.82208, 232.12381, 315.809, 232.28429, 315.80908, 232.28424);
        ((GeneralPath) shape).lineTo(315.761, 232.48004);
        ((GeneralPath) shape).curveTo(315.76102, 232.48, 315.8111, 232.13367, 315.8336, 231.97752);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.4115, 234.51286);
        ((GeneralPath) shape).curveTo(315.41092, 234.50087, 315.41183, 234.51086, 315.4135, 234.55156);
        ((GeneralPath) shape).curveTo(315.41357, 234.55356, 315.41293, 234.56166, 315.413, 234.56436);
        ((GeneralPath) shape).curveTo(315.4124, 234.54916, 315.4121, 234.51796, 315.41202, 234.51276);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(311.16006, 234.55556);
        ((GeneralPath) shape).curveTo(311.15805, 234.61096, 311.15607, 234.64955, 311.15607, 234.67424);
        ((GeneralPath) shape).curveTo(311.15536, 234.65553, 311.15405, 234.64944, 311.15405, 234.60994);
        ((GeneralPath) shape).curveTo(311.1541, 234.59984, 311.15805, 234.57294, 311.15906, 234.55563);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.2523, 235.88452);
        ((GeneralPath) shape).curveTo(315.25302, 235.90323, 315.2543, 235.90892, 315.2543, 235.94832);
        ((GeneralPath) shape).curveTo(315.25424, 235.95842, 315.2503, 235.98492, 315.2493, 236.00212);
        ((GeneralPath) shape).curveTo(315.2513, 235.94713, 315.2533, 235.90912, 315.2533, 235.88455);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(310.99588, 235.99377);
        ((GeneralPath) shape).curveTo(310.99646, 236.00908, 310.99673, 236.04027, 310.99686, 236.04538);
        ((GeneralPath) shape).curveTo(310.9974, 236.05737, 310.9965, 236.04738, 310.99484, 236.00719);
        ((GeneralPath) shape).curveTo(310.99478, 236.00519, 310.99542, 235.99649, 310.9954, 235.99379);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(381.48486, 242.04453);
        ((GeneralPath) shape).curveTo(381.47476, 242.13913, 381.47586, 242.34729, 381.47586, 242.34738);
        ((GeneralPath) shape).curveTo(381.47586, 242.34746, 381.47385, 242.25699, 381.47385, 242.25708);
        ((GeneralPath) shape).lineTo(381.47385, 242.25653);
        ((GeneralPath) shape).lineTo(381.47385, 242.25597);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(310.997, 245.10013);
        ((GeneralPath) shape).curveTo(310.9967, 245.10513, 310.99646, 245.13683, 310.99603, 245.15173);
        ((GeneralPath) shape).curveTo(310.99606, 245.14873, 310.99542, 245.14034, 310.99548, 245.13834);
        ((GeneralPath) shape).curveTo(310.99646, 245.09744, 310.9975, 245.08824, 310.9975, 245.10014);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.24844, 245.14343);
        ((GeneralPath) shape).curveTo(315.24942, 245.16054, 315.25345, 245.18784, 315.25345, 245.19724);
        ((GeneralPath) shape).curveTo(315.25363, 245.23643, 315.2525, 245.24223, 315.25143, 245.26103);
        ((GeneralPath) shape).curveTo(315.25156, 245.23643, 315.24942, 245.19833, 315.24744, 245.14345);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(311.1562, 246.47128);
        ((GeneralPath) shape).curveTo(311.15607, 246.49608, 311.1582, 246.53468, 311.1602, 246.58997);
        ((GeneralPath) shape).curveTo(311.1592, 246.57257, 311.15518, 246.54506, 311.15518, 246.53566);
        ((GeneralPath) shape).curveTo(311.155, 246.49596, 311.15616, 246.49007, 311.1572, 246.47136);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.41263, 246.5811);
        ((GeneralPath) shape).curveTo(315.4126, 246.5841, 315.4132, 246.5925, 315.41315, 246.5945);
        ((GeneralPath) shape).curveTo(315.41217, 246.63539, 315.41113, 246.64459, 315.41113, 246.63269);
        ((GeneralPath) shape).curveTo(315.41138, 246.62769, 315.41165, 246.5958, 315.4121, 246.58109);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.76093, 248.66605);
        ((GeneralPath) shape).lineTo(315.8091, 248.86128);
        ((GeneralPath) shape).curveTo(315.80908, 248.86124, 315.82202, 249.02174, 315.83362, 249.168);
        ((GeneralPath) shape).curveTo(315.811, 249.01178, 315.76102, 248.66609, 315.76102, 248.66605);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(311.5938, 249.20515);
        ((GeneralPath) shape).curveTo(311.59454, 249.21526, 311.6008, 249.30035, 311.6083, 249.386);
        ((GeneralPath) shape).curveTo(311.6033, 249.35, 311.5913, 249.26837, 311.5913, 249.2684);
        ((GeneralPath) shape).curveTo(311.5913, 249.26845, 311.5923, 249.2334, 311.5943, 249.2052);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(315.84802, 249.3516);
        ((GeneralPath) shape).curveTo(315.84808, 249.35234, 315.849, 249.3655, 315.849, 249.3655);
        ((GeneralPath) shape).curveTo(315.849, 249.36537, 315.843, 249.46712, 315.844, 249.45529);
        ((GeneralPath) shape).curveTo(315.8446, 249.44829, 315.846, 249.39789, 315.848, 249.35158);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(316.24902, 250.91072);
        ((GeneralPath) shape).lineTo(316.25104, 250.91772);
        ((GeneralPath) shape).lineTo(316.24902, 250.91173);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(380.12985, 251.38661);
        ((GeneralPath) shape).lineTo(380.12985, 251.38759);
        ((GeneralPath) shape).lineTo(380.12686, 251.39769);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(317.2014, 254.21317);
        ((GeneralPath) shape).lineTo(317.2064, 254.22766);
        ((GeneralPath) shape).lineTo(317.2014, 254.21587);
        ((GeneralPath) shape).lineTo(317.2008, 254.21387);
        ((GeneralPath) shape).lineTo(317.2008, 254.21289);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(317.26578, 254.41394);
        ((GeneralPath) shape).lineTo(317.26877, 254.42404);
        ((GeneralPath) shape).lineTo(317.26578, 254.41805);
        ((GeneralPath) shape).lineTo(317.26526, 254.41605);
        ((GeneralPath) shape).lineTo(317.26526, 254.41507);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(313.2434, 255.78616);
        ((GeneralPath) shape).lineTo(313.2464, 255.79317);
        ((GeneralPath) shape).lineTo(313.24695, 255.79517);
        ((GeneralPath) shape).lineTo(313.24695, 255.79614);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(358.30643, 280.39624);
        ((GeneralPath) shape).lineTo(358.30588, 280.39923);
        ((GeneralPath) shape).lineTo(358.30588, 280.39722);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(354.03116, 280.5155);
        ((GeneralPath) shape).curveTo(354.02914, 280.5705, 354.02716, 280.6085, 354.02716, 280.63312);
        ((GeneralPath) shape).curveTo(354.02646, 280.6144, 354.02515, 280.60852, 354.02515, 280.56943);
        ((GeneralPath) shape).curveTo(354.0252, 280.55933, 354.02914, 280.5327, 354.03015, 280.51562);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x222A29));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.0733244f, 0, 0, 1.0733244f, 103.45165f, -18.821842f));

        // _0_0_0_3

        // _0_0_0_3_0
        shape = new Ellipse2D.Double(240.7435760498047, 214.98660278320312, 4.424308776855469, 4.424308776855469);
        g.setPaint(new Color(0xFFBD01));
        g.fill(shape);

        // _0_0_0_3_1
        shape = new Ellipse2D.Double(246.0367431640625, 222.85069274902344, 4.424308776855469, 4.424308776855469);
        g.fill(shape);

        // _0_0_0_3_2
        shape = new Ellipse2D.Double(249.8175811767578, 231.47097778320312, 4.424308776855469, 4.424308776855469);
        g.fill(shape);

        // _0_0_0_3_3
        shape = new Ellipse2D.Double(249.9688262939453, 250.223876953125, 4.424308776855469, 4.424308776855469);
        g.fill(shape);

        // _0_0_0_3_4
        shape = new Ellipse2D.Double(246.0367889404297, 260.05401611328125, 4.424308776855469, 4.424308776855469);
        g.fill(shape);

        // _0_0_0_3_5
        shape = new Ellipse2D.Double(241.1973114013672, 251.58494567871094, 4.424308776855469, 4.424308776855469);
        g.fill(shape);

        // _0_0_0_3_6
        shape = new Ellipse2D.Double(240.89486694335938, 231.01719665527344, 4.424308776855469, 4.424308776855469);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_3

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(311.5481, 230.5591);
        ((GeneralPath) shape).curveTo(311.4539, 230.5591, 311.36096, 230.5631, 311.26743, 230.5661);
        ((GeneralPath) shape).curveTo(311.18982, 230.56708, 311.11264, 230.5691, 311.03558, 230.5721);
        ((GeneralPath) shape).curveTo(310.91742, 230.5781, 310.79977, 230.5883, 310.68283, 230.5992);
        ((GeneralPath) shape).curveTo(310.62833, 230.6032, 310.5735, 230.6062, 310.5192, 230.6137);
        ((GeneralPath) shape).curveTo(310.3984, 230.627, 310.27908, 230.64299, 310.1598, 230.66019);
        ((GeneralPath) shape).curveTo(310.1121, 230.66618, 310.0647, 230.67319, 310.01724, 230.68059);
        ((GeneralPath) shape).curveTo(309.89743, 230.69958, 309.77838, 230.72029, 309.66003, 230.74379);
        ((GeneralPath) shape).curveTo(309.61444, 230.75389, 309.56943, 230.7636, 309.52414, 230.7737);
        ((GeneralPath) shape).curveTo(309.4009, 230.8004, 309.27783, 230.8274, 309.1564, 230.8586);
        ((GeneralPath) shape).curveTo(308.86795, 230.933, 308.58502, 231.0214, 308.30777, 231.12097);
        ((GeneralPath) shape).curveTo(308.28867, 231.12697, 308.26868, 231.13387, 308.24948, 231.13977);
        ((GeneralPath) shape).curveTo(308.14734, 231.17717, 308.04718, 231.21867, 307.94662, 231.2596);
        ((GeneralPath) shape).curveTo(307.88583, 231.2849, 307.82498, 231.3085, 307.7647, 231.3351);
        ((GeneralPath) shape).curveTo(307.6798, 231.37129, 307.59586, 231.4102, 307.51233, 231.44879);
        ((GeneralPath) shape).curveTo(307.43332, 231.4856, 307.35498, 231.52399, 307.27716, 231.5625);
        ((GeneralPath) shape).curveTo(307.20877, 231.5966, 307.14056, 231.6305, 307.07306, 231.66672);
        ((GeneralPath) shape).curveTo(306.9647, 231.72472, 306.85727, 231.78427, 306.75137, 231.84587);
        ((GeneralPath) shape).curveTo(306.71637, 231.86597, 306.68088, 231.88567, 306.64597, 231.90617);
        ((GeneralPath) shape).curveTo(306.3389, 232.09003, 306.04205, 232.28969, 305.7585, 232.50577);
        ((GeneralPath) shape).curveTo(305.75452, 232.50877, 305.7495, 232.51176, 305.74573, 232.51587);
        ((GeneralPath) shape).curveTo(305.60324, 232.62502, 305.4641, 232.73755, 305.32806, 232.85419);
        ((GeneralPath) shape).curveTo(305.189, 232.97351, 305.053, 233.09671, 304.92093, 233.2236);
        ((GeneralPath) shape).curveTo(304.5248, 233.60435, 304.16098, 234.01825, 303.83435, 234.4616);
        ((GeneralPath) shape).lineTo(303.83337, 234.46104);
        ((GeneralPath) shape).curveTo(302.66605, 236.04648, 301.97528, 238.00406, 301.97528, 240.12407);
        ((GeneralPath) shape).curveTo(301.97528, 245.24423, 305.99945, 249.42664, 311.05612, 249.68303);
        ((GeneralPath) shape).curveTo(311.21918, 249.69003, 311.38348, 249.69643, 311.54865, 249.69643);
        ((GeneralPath) shape).curveTo(311.7006, 249.6962, 311.85205, 249.69243, 312.00235, 249.68463);
        ((GeneralPath) shape).curveTo(316.79926, 249.45386, 320.6644, 245.68709, 321.06485, 240.93605);
        ((GeneralPath) shape).curveTo(322.20755, 240.5589, 323.2995, 240.43684, 324.30182, 240.45183);
        ((GeneralPath) shape).curveTo(325.30423, 240.43703, 326.39703, 240.55905, 327.5399, 240.93605);
        ((GeneralPath) shape).curveTo(327.9404, 245.68707, 331.8044, 249.45386, 336.60132, 249.68463);
        ((GeneralPath) shape).curveTo(336.756, 249.69164, 336.91226, 249.69643, 337.06888, 249.69643);
        ((GeneralPath) shape).curveTo(337.2298, 249.6962, 337.38974, 249.69243, 337.54865, 249.68303);
        ((GeneralPath) shape).curveTo(342.0914, 249.45268, 345.7983, 246.053, 346.50522, 241.65216);
        ((GeneralPath) shape).lineTo(366.62338, 241.77419);
        ((GeneralPath) shape).lineTo(366.6294, 241.77419);
        ((GeneralPath) shape).curveTo(367.92355, 241.77419, 369.0915, 241.9973, 369.73602, 242.36101);
        ((GeneralPath) shape).curveTo(370.38055, 242.7247, 370.6907, 243.00652, 370.78653, 244.24129);
        ((GeneralPath) shape).curveTo(370.97314, 247.15268, 375.35526, 246.81398, 375.09232, 243.9085);
        ((GeneralPath) shape).curveTo(374.90573, 241.50507, 373.55167, 239.55643, 371.85757, 238.60045);
        ((GeneralPath) shape).curveTo(370.16684, 237.64636, 368.32706, 237.45639, 366.63992, 237.45564);
        ((GeneralPath) shape).lineTo(366.6292, 237.45564);
        ((GeneralPath) shape).lineTo(346.20544, 237.3325);
        ((GeneralPath) shape).curveTo(345.8873, 236.28925, 345.40137, 235.31932, 344.76944, 234.46106);
        ((GeneralPath) shape).lineTo(344.7685, 234.46161);
        ((GeneralPath) shape).curveTo(344.44193, 234.01826, 344.07806, 233.60437, 343.68192, 233.22362);
        ((GeneralPath) shape).curveTo(343.55478, 233.10136, 343.4246, 232.98268, 343.2909, 232.86752);
        ((GeneralPath) shape).curveTo(343.2869, 232.86353, 343.2808, 232.85742, 343.27588, 232.85413);
        ((GeneralPath) shape).curveTo(343.2729, 232.85112, 343.26688, 232.84813, 343.2649, 232.84402);
        ((GeneralPath) shape).curveTo(343.12958, 232.72835, 342.9906, 232.61658, 342.8489, 232.50845);
        ((GeneralPath) shape).curveTo(342.56647, 232.29301, 342.2717, 232.09348, 341.96588, 231.90999);
        ((GeneralPath) shape).curveTo(341.92548, 231.88559, 341.88388, 231.86359, 341.84274, 231.8402);
        ((GeneralPath) shape).curveTo(341.7383, 231.7797, 341.6324, 231.72043, 341.52545, 231.66382);
        ((GeneralPath) shape).curveTo(341.46124, 231.62991, 341.3964, 231.59692, 341.33133, 231.56462);
        ((GeneralPath) shape).curveTo(341.25122, 231.52422, 341.17007, 231.48572, 341.0884, 231.44759);
        ((GeneralPath) shape).curveTo(341.0087, 231.41089, 340.92914, 231.37369, 340.84824, 231.33888);
        ((GeneralPath) shape).curveTo(340.78082, 231.30978, 340.71268, 231.28319, 340.64468, 231.25578);
        ((GeneralPath) shape).curveTo(340.5485, 231.21729, 340.45224, 231.17699, 340.3546, 231.14154);
        ((GeneralPath) shape).curveTo(340.35162, 231.14056, 340.35062, 231.14091, 340.3456, 231.13853);
        ((GeneralPath) shape).curveTo(340.3291, 231.13254, 340.3117, 231.12633, 340.2952, 231.12154);
        ((GeneralPath) shape).curveTo(340.01794, 231.02234, 339.7356, 230.93384, 339.4471, 230.85971);
        ((GeneralPath) shape).curveTo(339.32928, 230.82932, 339.21005, 230.80241, 339.09045, 230.77711);
        ((GeneralPath) shape).curveTo(339.03995, 230.76532, 338.98935, 230.75491, 338.9385, 230.74442);
        ((GeneralPath) shape).curveTo(338.82376, 230.72191, 338.70798, 230.70192, 338.59186, 230.68352);
        ((GeneralPath) shape).curveTo(338.54117, 230.67651, 338.49033, 230.66731, 338.43933, 230.65971);
        ((GeneralPath) shape).curveTo(338.32132, 230.64302, 338.20316, 230.62712, 338.0838, 230.61412);
        ((GeneralPath) shape).curveTo(338.0301, 230.61012, 337.9759, 230.60402, 337.92184, 230.59892);
        ((GeneralPath) shape).curveTo(337.80447, 230.58882, 337.68658, 230.57852, 337.568, 230.57172);
        ((GeneralPath) shape).curveTo(337.49008, 230.56871, 337.41205, 230.56772, 337.33392, 230.56471);
        ((GeneralPath) shape).curveTo(337.24133, 230.5617, 337.14883, 230.55872, 337.05548, 230.55872);
        ((GeneralPath) shape).curveTo(332.8281, 230.56271, 329.24823, 233.31447, 327.98743, 237.1203);
        ((GeneralPath) shape).curveTo(327.98444, 237.11961, 327.98343, 237.11932, 327.97842, 237.11932);
        ((GeneralPath) shape).curveTo(327.96832, 237.14873, 327.95624, 237.17723, 327.94672, 237.20653);
        ((GeneralPath) shape).curveTo(327.03433, 236.96452, 325.9921, 236.76346, 324.83066, 236.70013);
        ((GeneralPath) shape).curveTo(324.65814, 236.69003, 324.4778, 236.69414, 324.30096, 236.69003);
        ((GeneralPath) shape).curveTo(324.12384, 236.69304, 323.94348, 236.69054, 323.7707, 236.70013);
        ((GeneralPath) shape).curveTo(322.60925, 236.76343, 321.56592, 236.96452, 320.65353, 237.20653);
        ((GeneralPath) shape).curveTo(320.64343, 237.17703, 320.63153, 237.14853, 320.62183, 237.11932);
        ((GeneralPath) shape).curveTo(320.62085, 237.11989, 320.61783, 237.1203, 320.6158, 237.1203);
        ((GeneralPath) shape).curveTo(319.3551, 233.31471, 315.77475, 230.56467, 311.54773, 230.55872);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x222A29));
        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 0.388f * origAlpha));

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(309.17755, 247.77701);
        ((GeneralPath) shape).curveTo(312.00842, 248.53172, 315.02243, 247.61633, 316.95547, 245.4148);
        ((GeneralPath) shape).curveTo(315.22873, 246.34235, 313.21347, 246.57721, 311.31967, 246.07161);
        ((GeneralPath) shape).curveTo(307.20782, 244.96935, 304.768, 240.74252, 305.87018, 236.63065);
        ((GeneralPath) shape).curveTo(306.17953, 235.48796, 306.74796, 234.43185, 307.53134, 233.5443);
        ((GeneralPath) shape).curveTo(305.6564, 234.54878, 304.2799, 236.28339, 303.72763, 238.33748);
        ((GeneralPath) shape).curveTo(302.62643, 242.449, 305.06622, 246.6749, 309.17752, 247.77701);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(334.89246, 247.77701);
        ((GeneralPath) shape).curveTo(337.72333, 248.5317, 340.7373, 247.61633, 342.67038, 245.4148);
        ((GeneralPath) shape).curveTo(340.94363, 246.34235, 338.92834, 246.57721, 337.03455, 246.07161);
        ((GeneralPath) shape).curveTo(332.92273, 244.96933, 330.48294, 240.7425, 331.58508, 236.63065);
        ((GeneralPath) shape).curveTo(331.89444, 235.48796, 332.46286, 234.43187, 333.24622, 233.5443);
        ((GeneralPath) shape).curveTo(331.3713, 234.54878, 329.99478, 236.28339, 329.44254, 238.33748);
        ((GeneralPath) shape).curveTo(328.34134, 242.449, 330.78116, 246.6749, 334.89243, 247.77701);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setComposite(AlphaComposite.getInstance(3, 1 * origAlpha));
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.0733244f, 0, 0, 1.0733244f, -27.99982f, -17.765158f));

        // _0_0_0_7

        // _0_0_0_7_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(387.28516, 176.36523);
        ((GeneralPath) shape).lineTo(383.8711, 178.24805);
        ((GeneralPath) shape).curveTo(383.8711, 178.24805, 377.75775, 181.62502, 369.09766, 180.65039);
        ((GeneralPath) shape).curveTo(361.5069, 179.79611, 356.18872, 183.4005, 353.04102, 187.10352);
        ((GeneralPath) shape).curveTo(349.8933, 190.80652, 348.64648, 194.72656, 348.64648, 194.72656);
        ((GeneralPath) shape).lineTo(347.52344, 198.23047);
        ((GeneralPath) shape).lineTo(350.95898, 196.91797);
        ((GeneralPath) shape).curveTo(353.67126, 195.88173, 357.90094, 196.05682, 362.15234, 196.39453);
        ((GeneralPath) shape).curveTo(366.40375, 196.73225, 370.62946, 197.28024, 374.05664, 195.99023);
        ((GeneralPath) shape).curveTo(384.0068, 192.24495, 386.44922, 180.17383, 386.44922, 180.17383);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(381.73242, 182.8086);
        ((GeneralPath) shape).curveTo(380.35745, 186.10675, 377.72974, 190.83272, 372.8125, 192.6836);
        ((GeneralPath) shape).curveTo(370.7603, 193.45604, 366.71964, 193.21367, 362.43164, 192.87305);
        ((GeneralPath) shape).curveTo(359.49118, 192.63947, 356.42548, 192.42445, 353.53516, 192.76172);
        ((GeneralPath) shape).curveTo(354.1161, 191.70708, 354.71185, 190.5932, 355.73242, 189.39258);
        ((GeneralPath) shape).curveTo(358.3844, 186.27274, 362.3517, 183.4473, 368.70312, 184.16211);
        ((GeneralPath) shape).curveTo(374.53635, 184.81859, 378.74353, 183.8281, 381.73242, 182.8086);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x222A29));
        g.fill(shape);

        // _0_0_0_7_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(360.6506, 192.89853);
        ((GeneralPath) shape).curveTo(358.88086, 192.74702, 356.47852, 192.6638, 355.31213, 192.7136);
        ((GeneralPath) shape).curveTo(354.1457, 192.7634, 353.19135, 192.7334, 353.19135, 192.64699);
        ((GeneralPath) shape).curveTo(353.19135, 192.2485, 354.87384, 190.01218, 356.22815, 188.61053);
        ((GeneralPath) shape).curveTo(359.85355, 184.85844, 363.3464, 183.69743, 369.71875, 184.12631);
        ((GeneralPath) shape).curveTo(373.53763, 184.38333, 377.45215, 184.08441, 380.1764, 183.32779);
        ((GeneralPath) shape).curveTo(381.2624, 183.02617, 382.15088, 182.83276, 382.15088, 182.89803);
        ((GeneralPath) shape).curveTo(382.15088, 183.20552, 380.78665, 185.64459, 379.80695, 187.08864);
        ((GeneralPath) shape).curveTo(378.37927, 189.19302, 376.17908, 191.22537, 374.21857, 192.25076);
        ((GeneralPath) shape).curveTo(372.71292, 193.03827, 372.4519, 193.07648, 368.25616, 193.12416);
        ((GeneralPath) shape).curveTo(365.84286, 193.15157, 362.42038, 193.05006, 360.6506, 192.89854);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x91DD32));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_7
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.0733244f, 0, 0, 1.0733244f, -61.473858f, -17.765158f));

        // _0_0_0_8

        // _0_0_0_8_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(409.69836, 211.06264);
        ((GeneralPath) shape).curveTo(407.30734, 210.38985, 404.5799, 208.84462, 397.60126, 204.20912);
        ((GeneralPath) shape).curveTo(390.8635, 199.73363, 388.02786, 198.03139, 385.75928, 197.10036);
        ((GeneralPath) shape).curveTo(385.00067, 196.78903, 384.41885, 196.4035, 384.46634, 196.24365);
        ((GeneralPath) shape).curveTo(384.6295, 195.69469, 390.4413, 192.97574, 392.82837, 192.33165);
        ((GeneralPath) shape).curveTo(399.9488, 190.41035, 405.8731, 191.6296, 412.86942, 196.45613);
        ((GeneralPath) shape).curveTo(417.98547, 199.98553, 423.28683, 202.39502, 428.48068, 203.55151);
        ((GeneralPath) shape).curveTo(429.79944, 203.84515, 430.8784, 204.18054, 430.8784, 204.29684);
        ((GeneralPath) shape).curveTo(430.8784, 204.52965, 428.4149, 206.38026, 426.8011, 207.35974);
        ((GeneralPath) shape).curveTo(424.67096, 208.65262, 421.54987, 210.05508, 419.4942, 210.64313);
        ((GeneralPath) shape).curveTo(416.6533, 211.45578, 411.82962, 211.66237, 409.69836, 211.06267);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_8_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(401.40625, 188.32422);
        ((GeneralPath) shape).curveTo(397.31937, 187.98312, 393.50543, 188.72069, 390.30273, 189.86328);
        ((GeneralPath) shape).curveTo(383.89737, 192.14847, 379.64258, 196.02539, 379.64258, 196.02539);
        ((GeneralPath) shape).lineTo(376.91992, 198.4961);
        ((GeneralPath) shape).lineTo(380.55078, 199.07812);
        ((GeneralPath) shape).curveTo(384.9237, 199.7778, 390.09058, 203.10533, 395.1328, 206.57617);
        ((GeneralPath) shape).curveTo(400.17505, 210.04703, 405.02762, 213.67738, 409.89258, 214.48047);
        ((GeneralPath) shape).curveTo(424.41458, 216.87767, 435.91992, 203.96875, 435.91992, 203.96875);
        ((GeneralPath) shape).lineTo(438.55078, 201.08789);
        ((GeneralPath) shape).lineTo(434.6504, 201.01169);
        ((GeneralPath) shape).curveTo(434.6504, 201.01169, 424.39594, 200.81529, 414.1504, 193.25583);
        ((GeneralPath) shape).curveTo(409.85367, 190.08556, 405.49313, 188.66528, 401.40625, 188.32419);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(401.05664, 191.78516);
        ((GeneralPath) shape).curveTo(404.53784, 192.06549, 408.2578, 193.29762, 412.05273, 196.09766);
        ((GeneralPath) shape).curveTo(419.29156, 201.43866, 426.31644, 203.26828, 430.57227, 203.99022);
        ((GeneralPath) shape).curveTo(426.69684, 207.21281, 419.04434, 212.412, 410.4668, 210.99608);
        ((GeneralPath) shape).curveTo(407.0514, 210.43228, 402.2092, 207.15768, 397.13672, 203.66602);
        ((GeneralPath) shape).curveTo(393.17896, 200.94165, 389.03717, 198.14151, 384.75586, 196.59766);
        ((GeneralPath) shape).curveTo(386.40762, 195.50247, 388.71094, 194.18294, 391.49023, 193.1914);
        ((GeneralPath) shape).curveTo(394.3325, 192.1774, 397.57544, 191.50482, 401.05664, 191.78516);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x222A29));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0_8

        g.setTransform(transformations.pop()); // _0_0_0

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

