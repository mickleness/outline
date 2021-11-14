package com.pump.awt.geom.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D;

import static java.awt.Color.BLACK;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/334063/russian-bulldozer
 * </p>
 */
public class RussianBulldozer implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public RussianBulldozer() {
        this(884, 921);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public RussianBulldozer(int width, int height) {
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
        double coef = Math.min((double) width / (double) 884, (double) height / (double) 921);

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
        g.transform(new AffineTransform(3.7795274f, 0, 0, 3.7795274f, 0, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 123.93987f, -15.034926f));

        // _0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 14.786821f, -9.099583f));

        // _0_0_0

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-66.71016, 128.9342);
        ((GeneralPath) shape).lineTo(-58.79479, 191.76244);
        ((GeneralPath) shape).lineTo(-23.670341, 214.51912);
        ((GeneralPath) shape).lineTo(39.652607, 170.48988);
        ((GeneralPath) shape).lineTo(98.52316, 129.42891);
        ((GeneralPath) shape).lineTo(95.5549, 120.02941);
        ((GeneralPath) shape).lineTo(82.197716, 110.62991);
        ((GeneralPath) shape).lineTo(44.599716, 138.33371);
        ((GeneralPath) shape).lineTo(-8.829021, 78.473724);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);

        // _0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-16.186207, 247.4229);
        ((GeneralPath) shape).curveTo(-20.115788, 245.62569, -22.581247, 240.10536, -22.581247, 231.47652);
        ((GeneralPath) shape).curveTo(-22.581247, 215.37534, -13.996687, 194.72916, -3.3333073, 185.18501);
        ((GeneralPath) shape).lineTo(72.45416, 117.35228);
        ((GeneralPath) shape).curveTo(76.97162, 113.30894, 81.116035, 111.92609, 84.39258, 112.89926);

        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(4.753429f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.17656, 111.12463);
        ((GeneralPath) shape).lineTo(74.77706, 115.57703);
        ((GeneralPath) shape).lineTo(-11.302574, 192.75188);
        ((GeneralPath) shape).lineTo(-22.186205, 225.40277);
        ((GeneralPath) shape).lineTo(-7.3448887, 232.32872);
        ((GeneralPath) shape).lineTo(-5.366046, 239.74937);
        ((GeneralPath) shape).lineTo(73.29293, 160.10098);
        ((GeneralPath) shape).lineTo(76.26119, 163.06924);
        ((GeneralPath) shape).lineTo(77.74532, 167.52164);
        ((GeneralPath) shape).lineTo(78.73474, 173.45816);
        ((GeneralPath) shape).lineTo(75.76648, 178.40527);
        ((GeneralPath) shape).lineTo(3.0440292, 255.58011);
        ((GeneralPath) shape).lineTo(10.46469, 252.11714);
        ((GeneralPath) shape).lineTo(81.70301, 190.27832);
        ((GeneralPath) shape).lineTo(94.56548, 176.92114);
        ((GeneralPath) shape).lineTo(101.986145, 161.58511);
        ((GeneralPath) shape).lineTo(107.427956, 144.76495);
        ((GeneralPath) shape).lineTo(106.43854, 129.42894);
        ((GeneralPath) shape).lineTo(102.48086, 121.01886);
        ((GeneralPath) shape).lineTo(93.576065, 118.05059);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.7451295f, -0.66691977f, 0, 1, 0, 0));

        // _0_0_0_3
        shape = new RoundRectangle2D.Double(-9.14915657043457, 204.1930389404297, 153.373779296875, 58.12799835205078, 51.66337585449219, 58.12799835205078);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(5.506696f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0_0_0_3

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-59.152657, 187.78133);
        ((GeneralPath) shape).lineTo(-73.88161, 175.25261);
        ((GeneralPath) shape).lineTo(-73.38301, 143.27156);
        ((GeneralPath) shape).lineTo(-54.0466, 154.64513);
        ((GeneralPath) shape).lineTo(-28.534931, 156.48671);
        ((GeneralPath) shape).lineTo(-27.936432, 192.10349);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(4.753429f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-26.222017, 102.47492);
        ((GeneralPath) shape).lineTo(-26.373217, 59.27501);
        ((GeneralPath) shape).lineTo(8.489275, 38.66078);
        ((GeneralPath) shape).lineTo(60.56154, 54.7045);
        ((GeneralPath) shape).lineTo(61.679897, 118.55493);
        ((GeneralPath) shape).lineTo(27.901646, 152.9679);
        ((GeneralPath) shape).lineTo(24.997799, 147.42331);
        ((GeneralPath) shape).lineTo(-27.833015, 192.30249);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-28.957523, 98.32891);
        ((GeneralPath) shape).lineTo(-38.585835, 105.835724);
        ((GeneralPath) shape).lineTo(-32.058163, 108.120415);
        ((GeneralPath) shape).lineTo(-27.162415, 104.04061);
        ((GeneralPath) shape).lineTo(-26.83603, 99.471245);
        ((GeneralPath) shape).lineTo(-27.81518, 98.16571);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x838383));
        g.fill(shape);

        // _0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-28.119488, 156.53764);
        ((GeneralPath) shape).lineTo(20.938702, 120.503265);
        ((GeneralPath) shape).lineTo(20.938702, 150.08519);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-22.887966, 60.321438);
        ((GeneralPath) shape).lineTo(28.413475, 76.78424);
        ((GeneralPath) shape).lineTo(58.677055, 55.932953);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.902002, 152.9678);
        ((GeneralPath) shape).lineTo(28.413202, 76.78424);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-58.444717, 185.39084);
        ((GeneralPath) shape).lineTo(-55.183567, 155.0819);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.14184, 84.476746);
        ((GeneralPath) shape).lineTo(54.407005, 68.9384);
        ((GeneralPath) shape).lineTo(54.407005, 92.93843);
        ((GeneralPath) shape).lineTo(35.30504, 107.66083);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCFE8E8));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.107813, 81.47594);
        ((GeneralPath) shape).lineTo(-19.909056, 67.567154);
        ((GeneralPath) shape).lineTo(-19.909056, 97.722916);
        ((GeneralPath) shape).lineTo(20.679056, 113.13344);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xCFE8E8));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(4.75343f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-106.51264, 215.28632);
        ((GeneralPath) shape).curveTo(-110.09545, 213.22018, -112.314224, 207.83144, -112.314224, 199.6454);
        ((GeneralPath) shape).curveTo(-112.314224, 183.54413, -103.809944, 162.80759, -93.066284, 153.3539);
        ((GeneralPath) shape).lineTo(-26.524872, 94.80179);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(4.753429f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-57.29479, 201.45674);
        ((GeneralPath) shape).lineTo(-77.30233, 219.36432);
        ((GeneralPath) shape).curveTo(-87.96571, 228.90846, -96.55027, 223.62933, -96.55027, 207.52744);
        ((GeneralPath) shape).curveTo(-96.55027, 192.36739, -89.75923, 173.70139, -80.05228, 163.61787);
        ((GeneralPath) shape).curveTo(-79.45018, 162.99057, -74.06134, 156.9423, -73.437096, 156.38574);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-56.70011, 190.04266);
        ((GeneralPath) shape).lineTo(-86.23781, 178.94562);
        ((GeneralPath) shape).lineTo(-72.85609, 165.40071);
        ((GeneralPath) shape).lineTo(-73.18247, 143.8594);
        ((GeneralPath) shape).lineTo(-63.22778, 134.39429);
        ((GeneralPath) shape).lineTo(-22.756233, 142.0643);
        ((GeneralPath) shape).lineTo(-28.304752, 158.70985);
        ((GeneralPath) shape).lineTo(-59.967148, 152.30849);
        ((GeneralPath) shape).lineTo(-65.51247, 179.272);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);

        // _0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-73.66507, 166.13625);
        ((GeneralPath) shape).lineTo(-87.00379, 179.02002);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-22.129177, 201.90845);
        ((GeneralPath) shape).lineTo(73.97012, 115.96448);
        ((GeneralPath) shape).lineTo(60.51465, 113.51546);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-21.826057, 202.5146);
        ((GeneralPath) shape).lineTo(-86.85223, 178.86864);
        ((GeneralPath) shape).lineTo(-86.09443, 189.63039);
        ((GeneralPath) shape).lineTo(-21.826149, 215.24681);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-91.53735, 222.73383);
        ((GeneralPath) shape).lineTo(-106.84186, 215.273);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(101.18358, 119.53258);
        ((GeneralPath) shape).lineTo(82.37705, 112.15186);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.16512702, 255.39581);
        ((GeneralPath) shape).lineTo(-15.599137, 248.2148);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-13.337797, 249.65471);
        ((GeneralPath) shape).lineTo(68.51333, 164.16568);
        ((GeneralPath) shape).curveTo(77.97953, 154.27882, 81.900475, 172.341, 74.57645, 179.92944);
        ((GeneralPath) shape).lineTo(-9.396797, 266.93423);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-120.04747, 189.63055);
        ((GeneralPath) shape).lineTo(-7.2746735, 231.4656);
        ((GeneralPath) shape).curveTo(-1.7501135, 247.37419, -6.6518736, 261.32266, -10.003114, 277.24158);
        ((GeneralPath) shape).lineTo(-121.56316, 232.67819);
        ((GeneralPath) shape).curveTo(-118.08862, 218.18343, -118.93975, 204.25116, -120.04747, 189.63055);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF7C25));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(4.7535043f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-19.350428, 219.4904);
        ((GeneralPath) shape).lineTo(-6.0600376, 224.20631);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(3.3953066f, 1, 0, 4));
        g.draw(shape);

        // _0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-17.683086, 213.57884);
        ((GeneralPath) shape).lineTo(-4.3926964, 218.29494);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-15.864187, 207.51553);
        ((GeneralPath) shape).lineTo(-2.5737972, 212.23154);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-13.421675, 201.50404);
        ((GeneralPath) shape).lineTo(0.5339723, 206.3971);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(3.5439203f, 1, 0, 4));
        g.draw(shape);

        // _0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-10.939483, 195.35698);
        ((GeneralPath) shape).lineTo(3.602062, 200.6747);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(3.7712631f, 1, 0, 4));
        g.draw(shape);

        // _0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-5.556937, 190.38754);
        ((GeneralPath) shape).lineTo(7.733453, 195.10364);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(3.3953066f, 1, 0, 4));
        g.draw(shape);

        // _0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-0.32739702, 185.71764);
        ((GeneralPath) shape).lineTo(12.962993, 190.43372);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.901873, 181.047);
        ((GeneralPath) shape).lineTo(18.192263, 185.76318);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.131233, 176.37717);
        ((GeneralPath) shape).lineTo(23.421623, 181.09326);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.360503, 171.70651);
        ((GeneralPath) shape).lineTo(28.650894, 176.4226);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.589863, 167.0366);
        ((GeneralPath) shape).lineTo(33.880253, 171.7527);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.819134, 162.36604);
        ((GeneralPath) shape).lineTo(39.109524, 167.08214);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_36
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.048492, 157.69614);
        ((GeneralPath) shape).lineTo(44.338882, 162.41223);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.277763, 153.02621);
        ((GeneralPath) shape).lineTo(49.568153, 157.74231);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.507122, 148.35567);
        ((GeneralPath) shape).lineTo(54.797512, 153.07176);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(46.736393, 143.68575);
        ((GeneralPath) shape).lineTo(60.026783, 148.40184);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(51.96575, 139.01518);
        ((GeneralPath) shape).lineTo(65.25614, 143.73128);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_41
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(57.195023, 134.34528);
        ((GeneralPath) shape).lineTo(70.48541, 139.06137);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_42
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(62.42438, 129.67471);
        ((GeneralPath) shape).lineTo(75.71477, 134.39081);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(67.65375, 125.0048);
        ((GeneralPath) shape).lineTo(80.94414, 129.72089);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(72.88301, 120.33416);
        ((GeneralPath) shape).lineTo(86.1734, 125.05025);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(76.31727, 116.15391);
        ((GeneralPath) shape).lineTo(90.91319, 121.19638);

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-109.71308, 187.05331);
        ((GeneralPath) shape).lineTo(-96.4227, 191.76877);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-107.71936, 181.1414);
        ((GeneralPath) shape).lineTo(-94.42897, 185.8575);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-105.90037, 175.0781);
        ((GeneralPath) shape).lineTo(-92.60998, 179.79419);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-102.71734, 169.31828);
        ((GeneralPath) shape).lineTo(-89.42695, 174.03438);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-99.53422, 163.70993);
        ((GeneralPath) shape).lineTo(-86.24383, 168.42603);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-95.59321, 157.9501);
        ((GeneralPath) shape).lineTo(-82.30282, 162.6662);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-90.36367, 153.2802);
        ((GeneralPath) shape).lineTo(-77.07328, 157.99629);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-85.1344, 148.60963);
        ((GeneralPath) shape).lineTo(-74.84506, 152.25418);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-79.90504, 143.93971);
        ((GeneralPath) shape).lineTo(-73.68856, 146.08351);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-74.675766, 139.26917);
        ((GeneralPath) shape).lineTo(-61.385376, 143.98526);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-69.4464, 134.59924);
        ((GeneralPath) shape).lineTo(-56.156013, 139.31534);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-64.21714, 129.9287);
        ((GeneralPath) shape).lineTo(-50.92675, 134.6447);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-58.987778, 125.25878);
        ((GeneralPath) shape).lineTo(-45.697388, 129.97487);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-53.758507, 120.58886);
        ((GeneralPath) shape).lineTo(-40.468117, 125.30495);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-48.52915, 115.91822);
        ((GeneralPath) shape).lineTo(-35.238758, 120.63431);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-43.299877, 111.24839);
        ((GeneralPath) shape).lineTo(-30.009487, 115.96448);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-38.07052, 106.57775);
        ((GeneralPath) shape).lineTo(-24.780128, 111.29384);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_63
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-32.841248, 101.90783);
        ((GeneralPath) shape).lineTo(-19.550858, 106.62392);

        g.setPaint(new Color(0x838383));
        g.fill(shape);
        g.setPaint(BLACK);
        g.draw(shape);

        // _0_0_0_64
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.667353, 119.94239);
        ((GeneralPath) shape).lineTo(-24.099817, 101.86778);
        ((GeneralPath) shape).lineTo(-73.88161, 143.11874);
        ((GeneralPath) shape).lineTo(-55.148735, 154.11072);
        ((GeneralPath) shape).lineTo(-27.496145, 157.1115);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xFF6600));
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(4.753429f, 1, 1, 4));
        g.draw(shape);

        // _0_0_0_65
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(-74.13081, 143.2808);
        ((GeneralPath) shape).lineTo(-71.468605, 172.91936);
        ((GeneralPath) shape).lineTo(-59.79448, 184.6579);

        g.setStroke(new BasicStroke(4.7625003f, 1, 1, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0_0_0

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

