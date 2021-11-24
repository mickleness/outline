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
 * Source image: https://openclipart.org/detail/209524/food-big-salad
 * </p>
 */
public class Salad implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public Salad() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Salad(int width, int height) {
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
        g.transform(new AffineTransform(0.016330529f, 0, 0, 0.016330529f, 0, 0.14000979f));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, 0, 44.088f));

        // _0_0

        // _0_0_0

        // _0_0_0_0

        // _0_0_0_0_0

        // _0_0_0_0_0_0

        // _0_0_0_0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.922, 20.649);
        ((GeneralPath) shape).curveTo(42.906002, 19.684, 44.898003, 18.485, 44.898003, 17.056);
        ((GeneralPath) shape).curveTo(44.898003, 15.660999, 42.906002, 14.466, 38.922005, 13.458);
        ((GeneralPath) shape).curveTo(34.938004, 12.454, 30.145004, 11.95, 24.535004, 11.95);
        ((GeneralPath) shape).curveTo(18.930004, 11.95, 14.113004, 12.4539995, 10.094004, 13.458);
        ((GeneralPath) shape).curveTo(6.109004, 14.466001, 4.1170034, 15.661, 4.1170034, 17.056);
        ((GeneralPath) shape).curveTo(4.1170034, 18.485, 6.1090035, 19.684, 10.094004, 20.649);
        ((GeneralPath) shape).curveTo(14.074003, 21.657, 18.891003, 22.161, 24.535004, 22.161);
        ((GeneralPath) shape).curveTo(30.184004, 22.161, 34.977005, 21.657, 38.922005, 20.649);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(9.099599838256836, 32.849998474121094), new Point2D.Double(44.249000549316406, 32.849998474121094), new float[]{0, 1}, new Color[]{new Color(0xA9CAD1), WHITE}, NO_CYCLE, SRGB, new AffineTransform(1.1602f, 0, 0, -1.1602f, -6.4406f, 55.167f)));
        g.fill(shape);

        // _0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(45.824, 17.227);
        ((GeneralPath) shape).lineTo(44.898003, 17.227);
        ((GeneralPath) shape).curveTo(44.742004, 18.583, 42.691, 19.743, 38.750004, 20.708);
        ((GeneralPath) shape).curveTo(34.766003, 21.677, 30.027004, 22.161, 24.535004, 22.161);
        ((GeneralPath) shape).curveTo(19.043003, 22.161, 14.324003, 21.677, 10.383003, 20.708);
        ((GeneralPath) shape).curveTo(6.4380035, 19.743, 4.3670034, 18.583, 4.1760035, 17.227001);
        ((GeneralPath) shape).lineTo(3.0160036, 17.227001);
        ((GeneralPath) shape).curveTo(3.5200036, 18.852001, 5.8010035, 20.204, 9.859003, 21.29);
        ((GeneralPath) shape).curveTo(13.961003, 22.411001, 18.812004, 22.970001, 24.422003, 22.970001);
        ((GeneralPath) shape).curveTo(29.992002, 22.970001, 34.824005, 22.411001, 38.922005, 21.29);
        ((GeneralPath) shape).curveTo(42.984005, 20.204, 45.285004, 18.852001, 45.824005, 17.227001);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.242, 28.075);
        ((GeneralPath) shape).lineTo(20.359001, 28.946001);
        ((GeneralPath) shape).curveTo(20.438002, 29.911001, 20.633001, 30.724, 20.941002, 31.384);
        ((GeneralPath) shape).curveTo(21.250002, 32.04, 21.598001, 32.368, 21.984001, 32.368);
        ((GeneralPath) shape).lineTo(23.957, 32.368);
        ((GeneralPath) shape).lineTo(25.406, 32.02);
        ((GeneralPath) shape).lineTo(25.699, 32.774002);
        ((GeneralPath) shape).curveTo(26.125, 33.278004, 26.800999, 33.528004, 27.727, 33.528004);
        ((GeneralPath) shape).curveTo(28.074, 33.528004, 28.965, 33.587, 30.394999, 33.700005);
        ((GeneralPath) shape).curveTo(31.206999, 33.739006, 31.808998, 33.681004, 32.195, 33.528004);
        ((GeneralPath) shape).curveTo(32.852, 33.294003, 33.723, 32.618004, 34.805, 31.497004);
        ((GeneralPath) shape).lineTo(35.617, 30.048004);
        ((GeneralPath) shape).lineTo(36.371002, 30.165005);
        ((GeneralPath) shape).curveTo(36.836002, 30.126005, 36.934002, 29.700005, 36.660004, 28.888004);
        ((GeneralPath) shape).curveTo(36.391003, 28.036005, 35.773003, 27.552004, 34.805004, 27.438004);
        ((GeneralPath) shape).curveTo(34.031006, 27.321003, 33.414005, 27.419004, 32.949005, 27.727003);
        ((GeneralPath) shape).curveTo(32.719006, 27.880003, 32.254005, 27.532003, 31.559006, 26.684004);
        ((GeneralPath) shape).curveTo(31.441006, 26.528004, 30.863007, 25.696003, 29.816006, 24.188004);
        ((GeneralPath) shape).curveTo(29.160006, 23.184004, 28.480005, 22.544003, 27.785006, 22.274004);
        ((GeneralPath) shape).lineTo(26.801006, 20.766005);
        ((GeneralPath) shape).curveTo(26.414007, 20.106005, 25.949007, 19.313005, 25.410006, 18.388004);
        ((GeneralPath) shape).curveTo(25.023006, 17.806004, 24.633005, 17.595005, 24.250006, 17.751005);
        ((GeneralPath) shape).curveTo(23.824005, 17.903006, 23.551006, 17.903006, 23.438005, 17.751005);
        ((GeneralPath) shape).curveTo(23.398005, 17.712006, 23.090006, 17.056005, 22.508005, 15.778006);
        ((GeneralPath) shape).lineTo(21.523005, 13.513005);
        ((GeneralPath) shape).curveTo(20.980005, 12.239005, 20.555004, 11.270005, 20.246004, 10.614005);
        ((GeneralPath) shape).curveTo(20.207005, 10.462005, 20.090004, 9.513005, 19.898005, 7.770005);
        ((GeneralPath) shape).curveTo(19.781004, 6.8060055, 19.781004, 5.470005, 19.898005, 3.7700052);
        ((GeneralPath) shape).curveTo(19.938005, 2.9970052, 19.723005, 2.5520053, 19.258005, 2.4340053);
        ((GeneralPath) shape).curveTo(18.445005, 2.1650052, 17.324005, 2.3760052, 15.895005, 3.0710053);
        ((GeneralPath) shape).curveTo(14.117005, 3.9620054, 12.820005, 5.3370056, 12.008005, 7.192005);
        ((GeneralPath) shape).curveTo(12.008005, 11.173005, 12.762005, 13.958005, 14.270005, 15.544005);
        ((GeneralPath) shape).curveTo(14.734005, 16.087006, 15.043005, 16.743006, 15.199005, 17.516005);
        ((GeneralPath) shape).curveTo(15.312005, 18.134005, 15.547005, 18.505005, 15.895005, 18.618004);
        ((GeneralPath) shape).lineTo(16.879005, 19.024004);
        ((GeneralPath) shape).lineTo(17.520006, 22.446003);
        ((GeneralPath) shape).curveTo(17.285006, 22.524002, 17.113007, 22.661003, 16.996006, 22.856003);
        ((GeneralPath) shape).curveTo(16.727007, 23.239002, 16.898006, 23.743002, 17.520006, 24.364002);
        ((GeneralPath) shape).lineTo(18.910006, 25.872002);
        ((GeneralPath) shape).curveTo(19.336006, 26.372002, 19.684006, 27.013002, 19.957006, 27.786001);
        ((GeneralPath) shape).curveTo(20.109007, 28.173, 20.207006, 28.27, 20.242006, 28.075);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x719B3F));
        g.fill(shape);

        // _0_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.332, 28.54);
        ((GeneralPath) shape).curveTo(22.641, 28.27, 22.953001, 28.056002, 23.262001, 27.903002);
        ((GeneralPath) shape).curveTo(23.375002, 28.173002, 23.551, 28.462002, 23.781, 28.770002);
        ((GeneralPath) shape).curveTo(24.168, 29.352003, 24.574, 29.700003, 25.0, 29.817003);
        ((GeneralPath) shape).curveTo(25.621, 30.009003, 26.027, 30.106003, 26.219, 30.106003);
        ((GeneralPath) shape).curveTo(25.987999, 30.649002, 25.987999, 31.247004, 26.219, 31.903004);
        ((GeneralPath) shape).curveTo(26.449, 32.602005, 27.07, 32.950005, 28.074, 32.950005);
        ((GeneralPath) shape).lineTo(29.234, 32.950005);
        ((GeneralPath) shape).curveTo(28.984, 32.942005, 28.710999, 32.903004, 28.421999, 32.833004);
        ((GeneralPath) shape).curveTo(27.765999, 32.677006, 27.359, 32.427006, 27.203, 32.079002);
        ((GeneralPath) shape).curveTo(26.894999, 31.501003, 26.780998, 30.977003, 26.855, 30.513002);
        ((GeneralPath) shape).lineTo(27.609, 30.919003);
        ((GeneralPath) shape).curveTo(28.265999, 31.266003, 28.965, 31.516003, 29.699, 31.673002);
        ((GeneralPath) shape).curveTo(30.316, 31.790003, 30.991999, 31.981003, 31.73, 32.251003);
        ((GeneralPath) shape).curveTo(32.309, 32.446003, 32.695, 32.544003, 32.891, 32.544003);
        ((GeneralPath) shape).curveTo(33.238, 32.544003, 33.68, 32.157, 34.223, 31.384003);
        ((GeneralPath) shape).curveTo(33.641, 31.731003, 33.102, 31.829002, 32.598, 31.673002);
        ((GeneralPath) shape).lineTo(31.324, 31.208002);
        ((GeneralPath) shape).lineTo(32.190998, 31.384003);
        ((GeneralPath) shape).curveTo(32.848, 31.384003, 33.41, 31.110003, 33.875, 30.571003);
        ((GeneralPath) shape).curveTo(33.914, 30.532003, 34.242, 30.126003, 34.859, 29.352003);
        ((GeneralPath) shape).curveTo(35.016003, 29.196003, 35.191, 29.118004, 35.383, 29.118004);
        ((GeneralPath) shape).curveTo(35.77, 29.118004, 36.117, 29.161003, 36.43, 29.235004);
        ((GeneralPath) shape).curveTo(36.039, 28.231005, 35.539, 28.016005, 34.922, 28.599005);
        ((GeneralPath) shape).curveTo(34.105, 29.372005, 33.641003, 29.798004, 33.527, 29.876005);
        ((GeneralPath) shape).curveTo(32.984, 30.263004, 32.465, 30.434006, 31.961, 30.395004);
        ((GeneralPath) shape).lineTo(30.219, 30.224005);
        ((GeneralPath) shape).lineTo(30.277, 29.934004);
        ((GeneralPath) shape).curveTo(30.395, 29.700005, 30.664, 29.528004, 31.09, 29.411003);
        ((GeneralPath) shape).curveTo(31.711, 29.216003, 32.328, 29.083004, 32.945, 29.005003);
        ((GeneralPath) shape).curveTo(32.945, 28.888002, 32.348, 28.829002, 31.147999, 28.829002);
        ((GeneralPath) shape).curveTo(30.605, 28.829002, 30.105, 29.005003, 29.640999, 29.352003);
        ((GeneralPath) shape).curveTo(29.293, 29.587004, 28.905998, 29.602003, 28.48, 29.411003);
        ((GeneralPath) shape).lineTo(26.043, 28.309004);
        ((GeneralPath) shape).lineTo(28.074, 27.208004);
        ((GeneralPath) shape).curveTo(28.965, 26.821005, 29.699, 26.821005, 30.277, 27.208004);
        ((GeneralPath) shape).curveTo(29.312, 26.317003, 28.559, 25.872004, 28.016, 25.872004);
        ((GeneralPath) shape).curveTo(27.863, 25.872004, 27.414001, 26.067003, 26.68, 26.454004);
        ((GeneralPath) shape).curveTo(26.023, 26.841003, 25.5, 26.938004, 25.117, 26.743004);
        ((GeneralPath) shape).curveTo(24.496, 26.474005, 23.914001, 26.009005, 23.375, 25.349003);
        ((GeneralPath) shape).curveTo(22.719, 24.653004, 22.273, 23.899002, 22.039, 23.087002);
        ((GeneralPath) shape).lineTo(21.461, 20.708002);
        ((GeneralPath) shape).lineTo(23.664001, 21.173002);
        ((GeneralPath) shape).curveTo(24.516, 21.407001, 25.02, 21.559002, 25.172, 21.638002);
        ((GeneralPath) shape).curveTo(25.367, 21.755003, 25.637001, 22.141003, 25.984001, 22.798002);
        ((GeneralPath) shape).curveTo(26.488, 23.649002, 26.953001, 24.114002, 27.379002, 24.192001);
        ((GeneralPath) shape).lineTo(25.984001, 21.696001);
        ((GeneralPath) shape).curveTo(25.562, 20.845001, 25.250002, 20.306002, 25.059002, 20.071001);
        ((GeneralPath) shape).curveTo(24.672003, 19.645, 24.188002, 19.434002, 23.605001, 19.434002);
        ((GeneralPath) shape).curveTo(22.836002, 19.474003, 22.312002, 19.493002, 22.039001, 19.493002);
        ((GeneralPath) shape).curveTo(21.613, 19.493002, 21.324001, 19.337002, 21.172, 19.028002);
        ((GeneralPath) shape).curveTo(20.902, 18.563002, 20.418001, 17.927002, 19.723001, 17.114002);
        ((GeneralPath) shape).curveTo(19.797, 16.532001, 20.203001, 16.532001, 20.938002, 17.114002);
        ((GeneralPath) shape).curveTo(21.637001, 17.731003, 22.312002, 18.099003, 22.969002, 18.216002);
        ((GeneralPath) shape).curveTo(23.164001, 17.751001, 22.910002, 17.153002, 22.215002, 16.415);
        ((GeneralPath) shape).curveTo(21.906002, 16.067001, 20.629002, 14.309001, 18.387001, 11.1380005);
        ((GeneralPath) shape).curveTo(16.262001, 8.431001, 15.023001, 7.7940006, 14.676001, 9.224001);
        ((GeneralPath) shape).curveTo(14.402, 10.306001, 14.4800005, 11.446001, 14.906, 12.645);
        ((GeneralPath) shape).curveTo(15.41, 13.692, 15.66, 14.329, 15.66, 14.559);
        ((GeneralPath) shape).curveTo(15.391, 16.067, 15.371, 17.095, 15.602, 17.634);
        ((GeneralPath) shape).curveTo(15.758, 17.981, 16.008, 18.309, 16.355, 18.622002);
        ((GeneralPath) shape).lineTo(16.879, 19.028002);
        ((GeneralPath) shape).lineTo(17.227, 18.274002);
        ((GeneralPath) shape).curveTo(17.495998, 17.770002, 17.769999, 17.520002, 18.039, 17.520002);
        ((GeneralPath) shape).curveTo(18.543, 17.520002, 18.852, 17.692003, 18.969, 18.040003);
        ((GeneralPath) shape).curveTo(18.195, 18.544003, 17.789, 19.239002, 17.75, 20.130003);
        ((GeneralPath) shape).curveTo(17.75, 20.325003, 17.711, 20.790003, 17.633, 21.520002);
        ((GeneralPath) shape).curveTo(17.754, 20.899002, 17.969, 20.434002, 18.269999, 20.130003);
        ((GeneralPath) shape).lineTo(19.605, 18.735003);
        ((GeneralPath) shape).curveTo(20.262, 19.126003, 20.397999, 19.782003, 20.012, 20.708002);
        ((GeneralPath) shape).curveTo(19.699, 21.368002, 19.526999, 21.813002, 19.487999, 22.044003);
        ((GeneralPath) shape).curveTo(19.370998, 22.352003, 19.355, 22.837002, 19.429998, 23.493002);
        ((GeneralPath) shape).lineTo(19.953, 26.626001);
        ((GeneralPath) shape).lineTo(20.07, 22.974);
        ((GeneralPath) shape).curveTo(20.145, 22.391, 20.418, 21.966002, 20.879, 21.696001);
        ((GeneralPath) shape).curveTo(20.879, 22.817001, 21.035, 23.86, 21.344, 24.829);
        ((GeneralPath) shape).curveTo(21.5, 25.446001, 21.695, 25.970001, 21.926, 26.395);
        ((GeneralPath) shape).curveTo(22.043001, 26.626001, 22.137001, 26.782, 22.215, 26.86);
        ((GeneralPath) shape).curveTo(21.637001, 26.86, 21.328001, 27.208, 21.289, 27.903);
        ((GeneralPath) shape).curveTo(21.133, 28.598999, 21.035, 29.102, 20.996, 29.411);
        ((GeneralPath) shape).curveTo(20.879, 29.953999, 21.016, 30.414999, 21.402, 30.806);
        ((GeneralPath) shape).curveTo(21.789, 31.265999, 22.121, 31.559, 22.391, 31.673);
        ((GeneralPath) shape).curveTo(22.582, 31.751, 22.855001, 31.79, 23.203001, 31.79);
        ((GeneralPath) shape).lineTo(23.637001, 31.79);
        ((GeneralPath) shape).curveTo(23.18, 31.727001, 22.766, 31.399, 22.391, 30.806002);
        ((GeneralPath) shape).curveTo(21.734001, 29.759, 21.715, 29.005001, 22.332, 28.54);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A873C));
        g.fill(shape);

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.781, 24.829);
        ((GeneralPath) shape).curveTo(24.402, 25.563, 25.02, 25.755001, 25.637001, 25.407);
        ((GeneralPath) shape).curveTo(26.375002, 25.059, 26.527, 24.809, 26.102001, 24.653);
        ((GeneralPath) shape).curveTo(25.988, 24.614, 25.719002, 24.188, 25.289001, 23.376);
        ((GeneralPath) shape).curveTo(24.828001, 22.602, 24.422, 22.196, 24.070002, 22.161);
        ((GeneralPath) shape).lineTo(22.219002, 21.809);
        ((GeneralPath) shape).curveTo(22.758001, 23.204, 23.281002, 24.208, 23.781002, 24.829);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7BB342));
        g.fill(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.594, 27.903);
        ((GeneralPath) shape).curveTo(21.059, 27.595, 21.27, 27.282, 21.23, 26.973999);
        ((GeneralPath) shape).curveTo(21.191, 26.782, 20.996, 26.414999, 20.652, 25.872);
        ((GeneralPath) shape).curveTo(20.34, 25.177, 20.301, 24.149, 20.535, 22.798);
        ((GeneralPath) shape).curveTo(20.301, 23.028, 20.168, 23.591, 20.129, 24.477001);
        ((GeneralPath) shape).curveTo(20.09, 25.329, 20.109, 26.102001, 20.188, 26.802002);
        ((GeneralPath) shape).curveTo(20.262, 27.688002, 20.397999, 28.059002, 20.594, 27.903002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.504, 23.841);
        ((GeneralPath) shape).curveTo(18.772999, 23.802, 18.93, 23.609999, 18.969, 23.263);
        ((GeneralPath) shape).curveTo(18.969, 23.028, 18.93, 22.606, 18.852, 21.985);
        ((GeneralPath) shape).curveTo(18.811998, 21.329, 19.022999, 20.536001, 19.487999, 19.606);
        ((GeneralPath) shape).curveTo(18.637, 20.266, 18.112999, 20.923, 17.921999, 21.579);
        ((GeneralPath) shape).curveTo(17.804998, 22.083, 17.804998, 22.606, 17.921999, 23.145);
        ((GeneralPath) shape).curveTo(18.039, 23.649, 18.234, 23.880001, 18.504, 23.841);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.957, 31.79);
        ((GeneralPath) shape).curveTo(24.188002, 31.712002, 24.266, 31.423, 24.188002, 30.919);
        ((GeneralPath) shape).curveTo(24.152002, 30.415, 23.938002, 30.067001, 23.551003, 29.876001);
        ((GeneralPath) shape).curveTo(23.203003, 29.720001, 22.992002, 29.505001, 22.914003, 29.235);
        ((GeneralPath) shape).curveTo(22.875004, 29.083, 22.875004, 28.946001, 22.914003, 28.829);
        ((GeneralPath) shape).curveTo(22.719004, 28.868, 22.621004, 29.255001, 22.621004, 29.989);
        ((GeneralPath) shape).curveTo(22.621004, 30.571001, 22.758003, 31.036001, 23.027004, 31.384);
        ((GeneralPath) shape).curveTo(23.301004, 31.77, 23.609005, 31.903, 23.957005, 31.79);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.727, 31.673);
        ((GeneralPath) shape).lineTo(28.074, 32.251);
        ((GeneralPath) shape).curveTo(28.421999, 32.638, 28.828, 32.871998, 29.293, 32.95);
        ((GeneralPath) shape).curveTo(29.679998, 33.024002, 30.184, 33.141003, 30.800999, 33.298);
        ((GeneralPath) shape).curveTo(31.227, 33.337, 31.343998, 33.22, 31.151999, 32.95);
        ((GeneralPath) shape).curveTo(31.069998, 32.794003, 30.530998, 32.638, 29.526999, 32.485);
        ((GeneralPath) shape).curveTo(28.558998, 32.29, 27.956999, 32.02, 27.727, 31.673);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.785, 28.427);
        ((GeneralPath) shape).curveTo(28.094, 28.27, 28.305, 28.192, 28.421999, 28.192);
        ((GeneralPath) shape).curveTo(28.499998, 28.230999, 28.637, 28.269999, 28.828, 28.309);
        ((GeneralPath) shape).curveTo(28.984, 28.309, 29.234, 28.349, 29.581999, 28.427);
        ((GeneralPath) shape).curveTo(29.929998, 28.427, 30.335999, 28.29, 30.800999, 28.016);
        ((GeneralPath) shape).curveTo(31.227, 27.708, 31.265999, 27.536001, 30.918, 27.497002);
        ((GeneralPath) shape).curveTo(30.296999, 27.497002, 29.812, 27.477001, 29.465, 27.438002);
        ((GeneralPath) shape).curveTo(29.078001, 27.399002, 28.691, 27.556002, 28.305, 27.903002);
        ((GeneralPath) shape).lineTo(27.785, 28.427002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.32, 18.911);
        ((GeneralPath) shape).curveTo(23.164, 18.677, 22.987999, 18.524, 22.796999, 18.446);
        ((GeneralPath) shape).curveTo(22.449, 18.407, 22.140999, 18.273998, 21.866999, 18.039999);
        ((GeneralPath) shape).curveTo(21.328, 17.574999, 20.727, 17.442, 20.069998, 17.633999);
        ((GeneralPath) shape).curveTo(20.495998, 17.828999, 20.940998, 18.157, 21.401999, 18.622);
        ((GeneralPath) shape).curveTo(21.710999, 18.97, 22.155998, 19.181, 22.737999, 19.258999);
        ((GeneralPath) shape).curveTo(23.280998, 19.376, 23.473, 19.258999, 23.32, 18.911);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.383, 29.876);
        ((GeneralPath) shape).lineTo(32.66, 29.876);
        ((GeneralPath) shape).curveTo(33.043, 29.876, 33.395, 29.778, 33.703, 29.583);
        ((GeneralPath) shape).curveTo(34.011997, 29.391, 34.128998, 29.196001, 34.051, 29.005001);
        ((GeneralPath) shape).curveTo(34.011997, 28.809002, 33.781, 28.735, 33.355, 28.77);
        ((GeneralPath) shape).curveTo(32.93, 28.809, 32.543, 28.966, 32.195, 29.235);
        ((GeneralPath) shape).lineTo(31.383, 29.876001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(4.582, 27.091);
        ((GeneralPath) shape).curveTo(4.621, 27.208, 4.7929997, 27.574999, 5.1049995, 28.192);
        ((GeneralPath) shape).curveTo(5.6049995, 29.234999, 5.8789997, 29.798, 5.9179997, 29.876);
        ((GeneralPath) shape).curveTo(6.148, 30.262999, 6.4769998, 30.512999, 6.902, 30.63);
        ((GeneralPath) shape).lineTo(8.875, 31.265999);
        ((GeneralPath) shape).curveTo(9.766, 33.083, 10.422, 34.204, 10.848, 34.629997);
        ((GeneralPath) shape).curveTo(11.077999, 34.864, 11.464999, 34.496998, 12.007999, 33.527996);
        ((GeneralPath) shape).curveTo(12.315999, 32.988995, 12.780999, 32.019997, 13.398, 30.629995);
        ((GeneralPath) shape).curveTo(13.745999, 29.933996, 13.844, 29.430996, 13.691, 29.121996);
        ((GeneralPath) shape).curveTo(13.34, 28.500996, 13.148, 28.000996, 13.109, 27.613997);
        ((GeneralPath) shape).curveTo(13.031, 26.875996, 13.031, 26.336996, 13.109, 25.988997);
        ((GeneralPath) shape).curveTo(13.148, 25.758997, 13.246, 25.078997, 13.398, 23.957996);
        ((GeneralPath) shape).curveTo(13.516, 23.144997, 13.613, 22.777996, 13.691, 22.855997);
        ((GeneralPath) shape).curveTo(13.922, 23.047997, 14.23, 22.894997, 14.617, 22.390997);
        ((GeneralPath) shape).curveTo(15.042999, 21.887997, 15.198999, 21.617996, 15.082, 21.578997);
        ((GeneralPath) shape).curveTo(14.848, 21.500998, 14.754, 21.172997, 14.793, 20.594997);
        ((GeneralPath) shape).curveTo(14.832, 19.973997, 14.906, 19.683998, 15.023, 19.723997);
        ((GeneralPath) shape).curveTo(15.332, 19.801996, 15.698999, 19.586998, 16.125, 19.086998);
        ((GeneralPath) shape).curveTo(16.59, 18.543999, 16.844, 18.215998, 16.879, 18.098997);
        ((GeneralPath) shape).curveTo(17.035, 17.711998, 17.441, 17.015997, 18.098, 16.012997);
        ((GeneralPath) shape).curveTo(20.34, 12.605997, 20.844, 10.984997, 19.605, 11.137997);
        ((GeneralPath) shape).curveTo(18.758, 11.254996, 17.848, 11.293997, 16.879, 11.254996);
        ((GeneralPath) shape).curveTo(15.219, 11.176996, 14.367, 11.137997, 14.327999, 11.137997);
        ((GeneralPath) shape).curveTo(12.315999, 11.137997, 10.848, 11.234997, 9.917999, 11.426996);
        ((GeneralPath) shape).curveTo(9.301, 11.582996, 8.640999, 12.219996, 7.944999, 13.340996);
        ((GeneralPath) shape).curveTo(7.366999, 14.308996, 6.862999, 15.4109955, 6.4379992, 16.648996);
        ((GeneralPath) shape).curveTo(6.2069993, 17.344995, 6.011999, 17.769997, 5.8589993, 17.926996);
        ((GeneralPath) shape).curveTo(5.819999, 17.965996, 5.761999, 18.234997, 5.683999, 18.734997);
        ((GeneralPath) shape).curveTo(5.604999, 19.394997, 5.491999, 19.742996, 5.335999, 19.781998);
        ((GeneralPath) shape).lineTo(5.104999, 19.664997);
        ((GeneralPath) shape).curveTo(4.4839993, 20.668997, 4.116999, 21.480997, 3.999999, 22.101997);
        ((GeneralPath) shape).curveTo(3.9259992, 22.836998, 4.038999, 23.957996, 4.347999, 25.465998);
        ((GeneralPath) shape).curveTo(4.503999, 26.394999, 4.5819993, 26.933998, 4.5819993, 27.090998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x719B3F));
        g.fill(shape);

        // _0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.164, 30.395);
        ((GeneralPath) shape).curveTo(9.551, 31.868, 10.148, 32.755, 10.9609995, 33.067);
        ((GeneralPath) shape).curveTo(11.426, 33.22, 11.679999, 33.048, 11.719, 32.544003);
        ((GeneralPath) shape).curveTo(11.602, 32.622, 11.445, 32.641003, 11.254, 32.602);
        ((GeneralPath) shape).curveTo(10.906, 32.563, 10.594, 32.251, 10.323999, 31.673);
        ((GeneralPath) shape).curveTo(10.016, 31.056, 9.839999, 30.356, 9.801, 29.583);
        ((GeneralPath) shape).curveTo(9.766, 29.352, 9.745999, 28.579, 9.745999, 27.266);
        ((GeneralPath) shape).curveTo(9.745999, 26.141, 9.780999, 25.157001, 9.858999, 24.306);
        ((GeneralPath) shape).lineTo(10.034999, 24.888);
        ((GeneralPath) shape).curveTo(10.304999, 25.852001, 10.671999, 26.45, 11.136999, 26.684);
        ((GeneralPath) shape).curveTo(11.405999, 26.802, 11.640999, 27.149, 11.831999, 27.727);
        ((GeneralPath) shape).curveTo(12.140999, 28.578999, 12.354999, 29.102, 12.468999, 29.293999);
        ((GeneralPath) shape).curveTo(12.702999, 29.640999, 12.913999, 29.817, 13.108999, 29.817);
        ((GeneralPath) shape).curveTo(13.226999, 29.817, 13.301, 29.778, 13.339999, 29.699999);
        ((GeneralPath) shape).lineTo(12.992, 29.352);
        ((GeneralPath) shape).curveTo(12.839999, 29.196, 12.742, 29.043999, 12.703, 28.887999);
        ((GeneralPath) shape).curveTo(12.6640005, 28.848999, 12.586, 28.501, 12.469, 27.845);
        ((GeneralPath) shape).curveTo(12.355, 27.38, 12.219, 27.032, 12.066, 26.797998);
        ((GeneralPath) shape).curveTo(11.988, 26.644999, 11.754, 26.316998, 11.367, 25.812998);
        ((GeneralPath) shape).curveTo(10.901999, 25.039997, 10.613, 23.996998, 10.5, 22.680998);
        ((GeneralPath) shape).curveTo(10.461, 21.828999, 10.5, 21.402998, 10.613, 21.402998);
        ((GeneralPath) shape).curveTo(10.9609995, 22.062998, 11.387, 22.660997, 11.891, 23.203999);
        ((GeneralPath) shape).curveTo(12.238, 23.551998, 12.469, 24.095, 12.5859995, 24.828999);
        ((GeneralPath) shape).lineTo(12.6449995, 25.812998);
        ((GeneralPath) shape).lineTo(12.6449995, 24.015997);
        ((GeneralPath) shape).curveTo(12.6449995, 23.394997, 12.374999, 22.543997, 11.832, 21.461998);
        ((GeneralPath) shape).curveTo(11.328, 20.457998, 11.137, 19.605999, 11.254, 18.910997);
        ((GeneralPath) shape).curveTo(11.367, 18.445997, 11.504, 18.176998, 11.66, 18.098997);
        ((GeneralPath) shape).curveTo(11.773, 18.098997, 11.948999, 18.195997, 12.18, 18.387997);
        ((GeneralPath) shape).curveTo(12.453, 18.578997, 12.820001, 19.297997, 13.281, 20.535997);
        ((GeneralPath) shape).curveTo(13.516, 21.191998, 13.766, 21.695997, 14.035, 22.043997);
        ((GeneralPath) shape).lineTo(14.441, 22.332996);
        ((GeneralPath) shape).lineTo(14.035, 21.289997);
        ((GeneralPath) shape).curveTo(13.805, 19.664997, 13.648, 18.734997, 13.57, 18.504997);
        ((GeneralPath) shape).curveTo(13.262, 17.265997, 12.914, 16.629997, 12.526999, 16.590998);
        ((GeneralPath) shape).lineTo(12.992, 15.719997);
        ((GeneralPath) shape).curveTo(13.1449995, 15.371998, 13.32, 15.101997, 13.516, 14.906998);
        ((GeneralPath) shape).curveTo(14.598, 15.137998, 15.292999, 15.680998, 15.601999, 16.531998);
        ((GeneralPath) shape).curveTo(15.757999, 17.031998, 15.870999, 17.594997, 15.948999, 18.211998);
        ((GeneralPath) shape).lineTo(15.948999, 18.965998);
        ((GeneralPath) shape).lineTo(16.125, 18.504997);
        ((GeneralPath) shape).curveTo(16.242, 18.113997, 16.297, 17.730997, 16.297, 17.344997);
        ((GeneralPath) shape).curveTo(16.297, 16.762997, 16.277, 16.394997, 16.238, 16.238998);
        ((GeneralPath) shape).curveTo(16.203001, 15.969998, 16.047, 15.543999, 15.777, 14.965999);
        ((GeneralPath) shape).curveTo(15.352, 14.113998, 15.004001, 13.687999, 14.7300005, 13.687999);
        ((GeneralPath) shape).lineTo(16.82, 13.746999);
        ((GeneralPath) shape).curveTo(17.477, 13.820999, 18.171999, 14.133999, 18.91, 14.672998);
        ((GeneralPath) shape).lineTo(19.546999, 13.976998);
        ((GeneralPath) shape).lineTo(19.487999, 11.890999);
        ((GeneralPath) shape).curveTo(19.296999, 11.426999, 18.695, 11.1919985, 17.690998, 11.1919985);
        ((GeneralPath) shape).curveTo(16.104998, 10.922998, 14.538998, 10.824999, 12.991999, 10.902999);
        ((GeneralPath) shape).curveTo(11.983998, 10.9419985, 10.940998, 11.387999, 9.858999, 12.238998);
        ((GeneralPath) shape).lineTo(8.522999, 13.570998);
        ((GeneralPath) shape).lineTo(9.976999, 13.687998);
        ((GeneralPath) shape).curveTo(10.671999, 13.687998, 11.195, 13.863997, 11.542999, 14.211998);
        ((GeneralPath) shape).curveTo(11.155999, 14.324998, 10.749999, 14.383998, 10.323999, 14.383998);
        ((GeneralPath) shape).curveTo(9.433999, 14.383998, 8.719, 14.656998, 8.176, 15.195998);
        ((GeneralPath) shape).curveTo(7.9449997, 15.430998, 7.7149997, 15.812998, 7.4799995, 16.355999);
        ((GeneralPath) shape).lineTo(7.1909995, 17.056);
        ((GeneralPath) shape).lineTo(7.5389996, 16.88);
        ((GeneralPath) shape).curveTo(7.8089995, 16.727, 8.061999, 16.512999, 8.292999, 16.243);
        ((GeneralPath) shape).curveTo(8.526999, 15.934, 8.718999, 15.739, 8.874999, 15.661);
        ((GeneralPath) shape).curveTo(8.991999, 15.583, 9.261999, 15.47, 9.687999, 15.313001);
        ((GeneralPath) shape).curveTo(10.226998, 15.083001, 10.499999, 15.177001, 10.499999, 15.602);
        ((GeneralPath) shape).lineTo(8.933999, 17.11);
        ((GeneralPath) shape).curveTo(8.042999, 17.614, 7.444999, 17.962, 7.132999, 18.157001);
        ((GeneralPath) shape).curveTo(6.745999, 18.388002, 6.476999, 19.161001, 6.3199987, 20.474);
        ((GeneralPath) shape).curveTo(6.2809987, 20.786001, 6.0899987, 21.212002, 5.7419987, 21.751001);
        ((GeneralPath) shape).curveTo(5.4339986, 22.216002, 5.2769985, 22.583002, 5.2769985, 22.856);
        ((GeneralPath) shape).lineTo(5.5079985, 26.220001);
        ((GeneralPath) shape).lineTo(5.5079985, 24.595001);
        ((GeneralPath) shape).curveTo(5.5079985, 24.130001, 5.6049986, 23.724, 5.8009987, 23.376001);
        ((GeneralPath) shape).curveTo(5.8789988, 23.145, 6.0699987, 22.813002, 6.3789988, 22.391);
        ((GeneralPath) shape).curveTo(6.573999, 22.079, 6.784999, 21.481, 7.0199986, 20.591002);
        ((GeneralPath) shape).curveTo(7.0979986, 20.282001, 7.2699986, 20.048002, 7.5389986, 19.895002);
        ((GeneralPath) shape).curveTo(7.890999, 19.665003, 8.159999, 19.411003, 8.351998, 19.141003);
        ((GeneralPath) shape).curveTo(8.854999, 18.485003, 9.300999, 18.020002, 9.687998, 17.747002);
        ((GeneralPath) shape).lineTo(9.280998, 18.677002);
        ((GeneralPath) shape).curveTo(9.124998, 19.024002, 9.030998, 19.583002, 8.991999, 20.360003);
        ((GeneralPath) shape).lineTo(8.933999, 21.403002);
        ((GeneralPath) shape).curveTo(8.429999, 22.138002, 7.831999, 22.891003, 7.132999, 23.665);
        ((GeneralPath) shape).curveTo(6.667999, 24.169, 6.3789988, 24.614, 6.265999, 25.001001);
        ((GeneralPath) shape).curveTo(6.187999, 25.27, 6.147999, 25.809002, 6.147999, 26.626001);
        ((GeneralPath) shape).curveTo(6.147999, 27.204, 6.206999, 27.825, 6.3199987, 28.481);
        ((GeneralPath) shape).lineTo(6.495999, 29.352001);
        ((GeneralPath) shape).lineTo(6.437999, 28.192001);
        ((GeneralPath) shape).curveTo(6.437999, 27.188002, 6.745999, 26.239002, 7.3669987, 25.349);
        ((GeneralPath) shape).curveTo(7.9059987, 24.501001, 8.390999, 24.036001, 8.815999, 23.958);
        ((GeneralPath) shape).lineTo(8.815999, 26.509);
        ((GeneralPath) shape).curveTo(8.815999, 27.438002, 8.874999, 28.368, 8.991999, 29.294);
        ((GeneralPath) shape).lineTo(9.163999, 30.395);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A873C));
        g.fill(shape);

        // _0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.586, 25.813);
        ((GeneralPath) shape).curveTo(8.738001, 25.274, 8.719001, 24.946, 8.527, 24.829);
        ((GeneralPath) shape).curveTo(7.984, 25.485, 7.4610004, 26.181, 6.9610004, 26.915);
        ((GeneralPath) shape).curveTo(6.609, 27.419, 6.4570003, 27.962002, 6.4960003, 28.54);
        ((GeneralPath) shape).curveTo(6.5350003, 29.044, 6.668, 29.470001, 6.9020004, 29.817001);
        ((GeneralPath) shape).curveTo(7.2890005, 30.282001, 7.6560006, 29.661001, 8.004001, 27.962002);
        ((GeneralPath) shape).curveTo(8.199, 26.993002, 8.391001, 26.278002, 8.586, 25.813002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7BB342));
        g.fill(shape);

        // _0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.816, 30.106);
        ((GeneralPath) shape).lineTo(8.641, 27.380001);
        ((GeneralPath) shape).curveTo(8.257999, 28.849, 8.062, 29.778002, 8.062, 30.165);
        ((GeneralPath) shape).curveTo(8.062, 30.474, 8.18, 30.649, 8.41, 30.684);
        ((GeneralPath) shape).curveTo(8.641, 30.724, 8.776999, 30.532, 8.816, 30.106);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.035, 27.845);
        ((GeneralPath) shape).curveTo(9.918, 29.083, 10.035, 30.028, 10.382999, 30.688);
        ((GeneralPath) shape).curveTo(10.999999, 31.883999, 11.464999, 32.157, 11.773, 31.501);
        ((GeneralPath) shape).curveTo(12.0859995, 30.88, 11.811999, 30.359999, 10.9609995, 29.934);
        ((GeneralPath) shape).curveTo(10.573999, 29.7, 10.266, 29.005, 10.035, 27.845);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.035, 26.509);
        ((GeneralPath) shape).curveTo(10.227, 27.130001, 10.651999, 27.806002, 11.309, 28.54);
        ((GeneralPath) shape).curveTo(11.543, 28.77, 11.754, 29.177, 11.949, 29.759);
        ((GeneralPath) shape).curveTo(12.141001, 30.302, 12.277, 30.61, 12.3550005, 30.684);
        ((GeneralPath) shape).curveTo(12.547001, 30.841, 12.645, 30.743, 12.645, 30.395);
        ((GeneralPath) shape).curveTo(12.645, 30.048, 12.492001, 29.622, 12.18, 29.118);
        ((GeneralPath) shape).curveTo(11.676001, 28.388, 10.961, 27.516, 10.035, 26.509);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.613, 22.333);
        ((GeneralPath) shape).curveTo(6.305, 22.798, 6.09, 23.126, 5.9769998, 23.317);
        ((GeneralPath) shape).curveTo(5.7809997, 23.708, 5.7419996, 24.036, 5.8589997, 24.306);
        ((GeneralPath) shape).curveTo(6.1289997, 25.001, 6.535, 24.442, 7.074, 22.622);
        ((GeneralPath) shape).curveTo(7.387, 21.657, 7.887, 20.864, 8.5859995, 20.243);
        ((GeneralPath) shape).curveTo(9.0859995, 19.509, 9.223, 19.067, 8.988, 18.911);
        ((GeneralPath) shape).lineTo(8.816, 19.434);
        ((GeneralPath) shape).curveTo(8.66, 19.895, 8.273, 20.204, 7.656, 20.36);
        ((GeneralPath) shape).curveTo(7.461, 20.438, 7.27, 20.688, 7.0740004, 21.114);
        ((GeneralPath) shape).curveTo(6.8830004, 21.657, 6.727, 22.063, 6.6130004, 22.333);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.789, 22.509);
        ((GeneralPath) shape).curveTo(10.7109995, 23.513, 10.941, 24.364, 11.483999, 25.059);
        ((GeneralPath) shape).curveTo(11.909999, 25.563, 12.218999, 25.755, 12.414, 25.641);
        ((GeneralPath) shape).curveTo(12.605, 25.563002, 12.605, 25.294, 12.414, 24.829);
        ((GeneralPath) shape).curveTo(12.297, 24.516, 12.16, 24.345001, 12.007999, 24.306);
        ((GeneralPath) shape).curveTo(11.811999, 24.227, 11.620999, 24.056, 11.426, 23.782);
        ((GeneralPath) shape).curveTo(11.2699995, 23.552, 11.059, 23.126, 10.789, 22.508999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.715, 18.794);
        ((GeneralPath) shape).curveTo(11.523, 19.298, 11.621, 19.974, 12.004, 20.825);
        ((GeneralPath) shape).curveTo(12.16, 21.173, 12.297, 21.657001, 12.41, 22.274);
        ((GeneralPath) shape).curveTo(12.488, 22.587, 12.605, 22.739, 12.762, 22.739);
        ((GeneralPath) shape).curveTo(13.227, 22.739, 13.188, 22.216, 12.645, 21.173);
        ((GeneralPath) shape).curveTo(12.492001, 20.786001, 12.277, 20.341, 12.008, 19.841);
        ((GeneralPath) shape).curveTo(11.812, 19.454, 11.715, 19.105999, 11.715, 18.793999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.109, 16.36);
        ((GeneralPath) shape).curveTo(13.727, 16.552, 14.035, 16.997, 14.035, 17.692001);
        ((GeneralPath) shape).curveTo(14.035, 18.235, 14.191, 18.622002, 14.5, 18.852001);
        ((GeneralPath) shape).curveTo(14.809, 19.044, 14.984, 18.852001, 15.023, 18.274002);
        ((GeneralPath) shape).curveTo(15.102, 17.501001, 14.715, 16.821003, 13.863, 16.243002);
        ((GeneralPath) shape).curveTo(13.797, 16.188002, 13.746, 16.141003, 13.719, 16.099003);
        ((GeneralPath) shape).curveTo(13.632999, 16.173002, 13.43, 16.259003, 13.109, 16.360003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.227, 16.591);
        ((GeneralPath) shape).curveTo(17.612999, 16.473999, 17.769999, 16.126, 17.691, 15.544);
        ((GeneralPath) shape).curveTo(17.613, 15.082999, 17.422, 14.638, 17.109, 14.212);
        ((GeneralPath) shape).curveTo(16.762, 13.786, 16.085999, 13.669, 15.081999, 13.864);
        ((GeneralPath) shape).lineTo(15.546999, 14.095);
        ((GeneralPath) shape).curveTo(15.815999, 14.095, 16.164, 14.559, 16.589998, 15.489);
        ((GeneralPath) shape).curveTo(16.741999, 15.950001, 16.858997, 16.243, 16.937998, 16.356);
        ((GeneralPath) shape).curveTo(16.976997, 16.552, 17.073997, 16.630001, 17.226997, 16.591002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.461, 22.391);
        ((GeneralPath) shape).curveTo(40.68, 21.809, 39.426, 21.192001, 38.690998, 20.536001);
        ((GeneralPath) shape).curveTo(38.339996, 20.266, 37.858997, 20.149002, 37.241997, 20.184002);
        ((GeneralPath) shape).curveTo(36.659996, 20.227001, 36.121, 20.032001, 35.616997, 19.606003);
        ((GeneralPath) shape).curveTo(35.112995, 19.141003, 34.550995, 18.216003, 33.934, 16.821003);
        ((GeneralPath) shape).curveTo(33.276997, 15.352003, 32.891, 14.559003, 32.773, 14.442003);
        ((GeneralPath) shape).curveTo(32.581997, 14.251003, 32.190998, 13.630003, 31.612999, 12.587004);
        ((GeneralPath) shape).curveTo(30.956999, 11.5440035, 30.124998, 10.845004, 29.120998, 10.501003);
        ((GeneralPath) shape).curveTo(27.995998, 9.9190035, 27.241999, 9.571003, 26.854998, 9.454003);
        ((GeneralPath) shape).curveTo(26.354998, 9.263003, 25.503998, 9.302003, 24.304998, 9.571003);
        ((GeneralPath) shape).curveTo(23.647999, 9.688003, 22.679998, 9.763003, 21.401999, 9.802003);
        ((GeneralPath) shape).curveTo(20.824, 9.802003, 20.418, 10.036003, 20.187998, 10.501003);
        ((GeneralPath) shape).curveTo(20.030998, 10.809003, 19.315998, 11.2940035, 18.038998, 11.950004);
        ((GeneralPath) shape).curveTo(17.151999, 12.454003, 17.015997, 12.876003, 17.632998, 13.227003);
        ((GeneralPath) shape).curveTo(18.522997, 13.727003, 19.140997, 14.114003, 19.491997, 14.384003);
        ((GeneralPath) shape).curveTo(19.991997, 14.774003, 20.882998, 15.602003, 22.159996, 16.880003);
        ((GeneralPath) shape).curveTo(22.542995, 17.266003, 23.222996, 17.247004, 24.187996, 16.821003);
        ((GeneralPath) shape).curveTo(25.425997, 16.243004, 26.159996, 15.954003, 26.394997, 15.954003);
        ((GeneralPath) shape).curveTo(27.050997, 15.954003, 27.573997, 16.087004, 27.960997, 16.360003);
        ((GeneralPath) shape).curveTo(28.386997, 16.747002, 28.772997, 17.423002, 29.120996, 18.388002);
        ((GeneralPath) shape).curveTo(29.311996, 18.891003, 29.542997, 19.993002, 29.815996, 21.696003);
        ((GeneralPath) shape).curveTo(30.046997, 22.856003, 30.319996, 23.493004, 30.628996, 23.610003);
        ((GeneralPath) shape).curveTo(33.026997, 24.345003, 34.495995, 25.255003, 35.034996, 26.337002);
        ((GeneralPath) shape).curveTo(35.616997, 27.497002, 35.925995, 28.099, 35.964996, 28.134003);
        ((GeneralPath) shape).curveTo(36.272995, 28.559002, 36.659996, 28.579002, 37.124996, 28.192003);
        ((GeneralPath) shape).curveTo(37.319996, 28.036003, 37.706997, 27.556004, 38.284996, 26.743004);
        ((GeneralPath) shape).curveTo(38.671997, 26.278004, 39.097996, 26.048004, 39.561996, 26.048004);
        ((GeneralPath) shape).lineTo(43.042995, 26.048004);
        ((GeneralPath) shape).lineTo(45.479996, 23.899004);
        ((GeneralPath) shape).curveTo(45.788994, 23.708004, 46.194996, 22.798004, 46.694996, 21.173004);
        ((GeneralPath) shape).curveTo(46.308994, 21.481005, 45.847996, 21.755005, 45.304996, 21.985004);
        ((GeneralPath) shape).curveTo(44.222996, 22.489004, 43.272995, 22.622004, 42.460995, 22.391005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x719B3F));
        g.fill(shape);

        // _0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.055, 23.958);
        ((GeneralPath) shape).curveTo(43.988, 23.415, 45.129, 23.009, 45.477, 22.739);
        ((GeneralPath) shape).curveTo(46.211002, 22.161001, 46.617, 21.638, 46.695, 21.173);
        ((GeneralPath) shape).curveTo(46.23, 21.599, 45.785, 21.809, 45.363, 21.809);
        ((GeneralPath) shape).curveTo(44.938, 21.696, 44.586, 21.599, 44.315998, 21.52);
        ((GeneralPath) shape).curveTo(43.851997, 21.442001, 43.366997, 21.54, 42.866997, 21.809);
        ((GeneralPath) shape).curveTo(42.711, 21.888, 41.976997, 22.352, 40.659996, 23.204);
        ((GeneralPath) shape).curveTo(39.772995, 23.743, 39.210995, 23.977001, 38.979996, 23.899);
        ((GeneralPath) shape).curveTo(38.745995, 23.821001, 38.554996, 23.630001, 38.397995, 23.317);
        ((GeneralPath) shape).curveTo(38.089996, 22.739, 37.878994, 22.372, 37.761993, 22.216);
        ((GeneralPath) shape).curveTo(36.601994, 20.203999, 35.866993, 19.239, 35.558994, 19.317);
        ((GeneralPath) shape).curveTo(34.280994, 19.587, 33.448994, 19.644999, 33.061993, 19.493);
        ((GeneralPath) shape).curveTo(32.714993, 19.337, 32.479992, 19.161, 32.366993, 18.97);
        ((GeneralPath) shape).lineTo(32.308994, 18.681);
        ((GeneralPath) shape).lineTo(32.772995, 18.798);
        ((GeneralPath) shape).curveTo(33.003994, 18.872, 33.565994, 18.716, 34.456993, 18.333);
        ((GeneralPath) shape).curveTo(34.76599, 18.177, 35.11299, 18.138, 35.499992, 18.216);
        ((GeneralPath) shape).curveTo(35.229992, 18.02, 34.937992, 17.883999, 34.628994, 17.809);
        ((GeneralPath) shape).curveTo(34.124992, 17.731, 33.604996, 17.809, 33.061993, 18.04);
        ((GeneralPath) shape).curveTo(32.597992, 18.196001, 31.940992, 17.981, 31.089993, 17.403002);
        ((GeneralPath) shape).curveTo(30.472992, 16.977001, 29.870993, 16.126001, 29.292992, 14.852001);
        ((GeneralPath) shape).lineTo(30.741991, 15.313002);
        ((GeneralPath) shape).curveTo(31.011992, 15.313002, 31.30499, 15.509002, 31.612991, 15.895001);
        ((GeneralPath) shape).curveTo(31.96099, 16.165, 32.32799, 16.302002, 32.714993, 16.302002);
        ((GeneralPath) shape).curveTo(33.061993, 16.302002, 33.25799, 16.224003, 33.296993, 16.071001);
        ((GeneralPath) shape).lineTo(32.772995, 16.071001);
        ((GeneralPath) shape).curveTo(32.620995, 16.071001, 32.405994, 15.895001, 32.136993, 15.548001);
        ((GeneralPath) shape).curveTo(31.827993, 15.161001, 31.593994, 14.931002, 31.440994, 14.852001);
        ((GeneralPath) shape).curveTo(31.245995, 14.774001, 30.995995, 14.735002, 30.687994, 14.735002);
        ((GeneralPath) shape).curveTo(30.452993, 14.735002, 30.300995, 14.6570015, 30.222994, 14.505002);
        ((GeneralPath) shape).lineTo(30.104994, 13.806002);
        ((GeneralPath) shape).curveTo(30.065994, 13.614001, 30.085995, 13.556002, 30.163994, 13.634002);
        ((GeneralPath) shape).curveTo(30.354994, 13.786002, 30.569994, 13.884002, 30.800993, 13.923001);
        ((GeneralPath) shape).curveTo(31.226994, 14.001001, 31.651993, 13.903001, 32.07799, 13.634002);
        ((GeneralPath) shape).lineTo(31.49599, 13.634002);
        ((GeneralPath) shape).curveTo(30.608992, 13.634002, 29.65999, 13.071002, 28.65599, 11.950002);
        ((GeneralPath) shape).curveTo(28.19099, 11.4070015, 26.97299, 10.927002, 24.99999, 10.501001);
        ((GeneralPath) shape).curveTo(23.37499, 10.114001, 22.25399, 9.919002, 21.63699, 9.919002);
        ((GeneralPath) shape).curveTo(21.210989, 9.919002, 19.85499, 10.712002, 17.57399, 12.298001);
        ((GeneralPath) shape).curveTo(17.30499, 12.493001, 17.14799, 12.665001, 17.10899, 12.821001);
        ((GeneralPath) shape).curveTo(17.10899, 12.974001, 17.18799, 13.071001, 17.34399, 13.110001);
        ((GeneralPath) shape).curveTo(17.76999, 13.227, 18.640991, 13.786, 19.95299, 14.794001);
        ((GeneralPath) shape).lineTo(21.98399, 16.766);
        ((GeneralPath) shape).lineTo(21.69499, 15.606001);
        ((GeneralPath) shape).curveTo(21.49999, 14.716001, 21.425991, 13.942001, 21.46099, 13.286001);
        ((GeneralPath) shape).curveTo(21.80899, 13.595001, 22.15999, 14.075001, 22.507992, 14.735002);
        ((GeneralPath) shape).curveTo(22.89499, 15.548001, 23.550991, 15.993002, 24.476992, 16.067001);
        ((GeneralPath) shape).curveTo(24.749992, 16.106, 25.01999, 16.028002, 25.292992, 15.837002);
        ((GeneralPath) shape).curveTo(25.601992, 15.645001, 25.640991, 15.567001, 25.405993, 15.606002);
        ((GeneralPath) shape).curveTo(24.905993, 15.681002, 24.382992, 15.489002, 23.839993, 15.024002);
        ((GeneralPath) shape).curveTo(23.300993, 14.520002, 22.991993, 14.095002, 22.913992, 13.747002);
        ((GeneralPath) shape).lineTo(23.378992, 13.806002);
        ((GeneralPath) shape).curveTo(23.726992, 13.845001, 24.073992, 13.942001, 24.421991, 14.095001);
        ((GeneralPath) shape).curveTo(24.847992, 14.251001, 25.386992, 14.6570015, 26.046991, 15.313002);
        ((GeneralPath) shape).curveTo(26.354992, 15.622002, 26.64499, 15.739001, 26.913992, 15.661001);
        ((GeneralPath) shape).curveTo(27.265991, 15.583001, 27.323992, 15.509001, 27.089993, 15.431002);
        ((GeneralPath) shape).curveTo(26.897993, 15.431002, 26.472992, 15.196002, 25.811993, 14.735002);
        ((GeneralPath) shape).curveTo(25.347992, 14.384002, 25.175993, 14.173001, 25.292994, 14.095001);
        ((GeneralPath) shape).lineTo(26.276993, 14.212001);
        ((GeneralPath) shape).curveTo(26.972992, 14.329, 27.651993, 14.735001, 28.308992, 15.431001);
        ((GeneralPath) shape).curveTo(28.460993, 15.583001, 28.577991, 15.895, 28.655993, 16.356);
        ((GeneralPath) shape).curveTo(28.772993, 16.899, 28.944992, 17.325, 29.179993, 17.634);
        ((GeneralPath) shape).curveTo(29.448992, 18.02, 29.640993, 18.446001, 29.757992, 18.911001);
        ((GeneralPath) shape).curveTo(29.874992, 19.489, 29.972992, 19.993002, 30.046991, 20.419);
        ((GeneralPath) shape).curveTo(30.241991, 21.427, 30.452991, 22.157001, 30.687992, 22.622002);
        ((GeneralPath) shape).curveTo(30.878992, 23.009, 31.171991, 23.224, 31.558992, 23.263002);
        ((GeneralPath) shape).curveTo(31.749992, 23.298002, 31.925993, 23.298002, 32.07799, 23.263002);
        ((GeneralPath) shape).curveTo(31.925991, 23.224003, 31.76999, 23.145002, 31.612991, 23.028002);
        ((GeneralPath) shape).curveTo(31.265991, 22.837002, 31.015991, 22.602001, 30.862991, 22.333002);
        ((GeneralPath) shape).curveTo(30.706991, 22.063002, 30.608992, 21.696003, 30.569992, 21.231003);
        ((GeneralPath) shape).lineTo(30.569992, 19.724003);
        ((GeneralPath) shape).curveTo(30.569992, 18.911003, 30.491993, 18.427002, 30.339993, 18.270002);
        ((GeneralPath) shape).curveTo(30.491993, 18.349003, 30.687992, 18.579002, 30.921993, 18.966002);
        ((GeneralPath) shape).curveTo(31.190992, 19.313002, 31.382994, 19.587002, 31.499992, 19.778002);
        ((GeneralPath) shape).curveTo(31.733992, 20.130001, 31.886992, 20.458002, 31.964993, 20.766003);
        ((GeneralPath) shape).curveTo(32.155994, 21.579002, 32.54299, 22.372002, 33.124992, 23.145002);
        ((GeneralPath) shape).curveTo(33.663994, 23.919003, 34.034992, 24.380003, 34.226994, 24.536003);
        ((GeneralPath) shape).lineTo(33.937992, 23.841003);
        ((GeneralPath) shape).lineTo(32.89099, 21.927004);
        ((GeneralPath) shape).curveTo(32.62099, 21.427004, 32.60199, 21.099005, 32.831993, 20.942003);
        ((GeneralPath) shape).curveTo(33.218994, 21.212004, 33.644993, 21.579002, 34.108994, 22.044003);
        ((GeneralPath) shape).curveTo(34.456993, 22.352003, 34.651993, 22.567003, 34.687992, 22.681002);
        ((GeneralPath) shape).lineTo(34.687992, 23.317001);
        ((GeneralPath) shape).curveTo(34.651993, 23.821001, 34.63299, 24.227001, 34.63299, 24.536001);
        ((GeneralPath) shape).curveTo(34.63299, 25.079, 34.706993, 25.505001, 34.86299, 25.813002);
        ((GeneralPath) shape).lineTo(35.67599, 27.208002);
        ((GeneralPath) shape).lineTo(35.32799, 25.872002);
        ((GeneralPath) shape).curveTo(35.171993, 25.524002, 35.11299, 25.177002, 35.151993, 24.829002);
        ((GeneralPath) shape).curveTo(35.190994, 24.595003, 35.249992, 24.227003, 35.32799, 23.727003);
        ((GeneralPath) shape).curveTo(35.401993, 23.341003, 35.53899, 23.317003, 35.73399, 23.669003);
        ((GeneralPath) shape).curveTo(35.84799, 23.899002, 36.02299, 24.306002, 36.25399, 24.888002);
        ((GeneralPath) shape).curveTo(36.40999, 25.157001, 36.48799, 25.466002, 36.48799, 25.813002);
        ((GeneralPath) shape).lineTo(36.48799, 26.974);
        ((GeneralPath) shape).curveTo(36.526993, 27.36, 36.60199, 27.669, 36.71899, 27.903002);
        ((GeneralPath) shape).lineTo(36.89499, 28.134003);
        ((GeneralPath) shape).lineTo(36.83599, 25.349003);
        ((GeneralPath) shape).lineTo(37.819992, 25.755003);
        ((GeneralPath) shape).curveTo(38.519993, 25.872004, 38.999992, 25.638002, 39.27299, 25.059004);
        ((GeneralPath) shape).curveTo(39.347992, 24.868004, 40.276993, 24.501003, 42.054993, 23.958004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A873C));
        g.fill(shape);

        // _0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.078, 23.263);
        ((GeneralPath) shape).curveTo(31.574, 22.946001, 31.245998, 22.134, 31.094, 20.825);
        ((GeneralPath) shape).curveTo(31.016, 20.091002, 30.762, 19.239, 30.34, 18.274);
        ((GeneralPath) shape).curveTo(30.453001, 18.735, 30.512001, 19.141, 30.512001, 19.493);
        ((GeneralPath) shape).curveTo(30.512001, 20.341, 30.59, 21.134, 30.742, 21.868);
        ((GeneralPath) shape).curveTo(30.82, 22.333, 31.016, 22.681, 31.324001, 22.915);
        ((GeneralPath) shape).curveTo(31.480001, 23.032001, 31.633001, 23.087002, 31.789001, 23.087002);
        ((GeneralPath) shape).lineTo(32.078003, 23.263002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7BB342));
        g.fill(shape);

        // _0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(32.773, 21.114);
        ((GeneralPath) shape).curveTo(32.773, 21.231, 33.062, 22.005001, 33.645, 23.434);
        ((GeneralPath) shape).lineTo(34.281002, 24.942);
        ((GeneralPath) shape).lineTo(33.875004, 22.855999);
        ((GeneralPath) shape).curveTo(33.836002, 22.622, 33.801003, 22.313, 33.762005, 21.926998);
        ((GeneralPath) shape).curveTo(33.680004, 21.617998, 33.566006, 21.441998, 33.410004, 21.406998);
        ((GeneralPath) shape).curveTo(33.297005, 21.367998, 33.160004, 21.230997, 33.004005, 21.000998);
        ((GeneralPath) shape).curveTo(32.891006, 20.883997, 32.812004, 20.922998, 32.773006, 21.113998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.082, 27.786);
        ((GeneralPath) shape).curveTo(36.16, 27.863998, 36.234, 27.922998, 36.312, 27.962);
        ((GeneralPath) shape).lineTo(35.965, 27.325);
        ((GeneralPath) shape).curveTo(35.695, 26.782001, 35.578, 26.337, 35.617, 25.989);
        ((GeneralPath) shape).curveTo(35.656002, 25.681, 35.75, 25.372, 35.906002, 25.059);
        ((GeneralPath) shape).curveTo(36.062, 24.751, 36.121002, 24.501, 36.082, 24.309);
        ((GeneralPath) shape).curveTo(36.039, 23.88, 35.867, 23.571, 35.559002, 23.38);
        ((GeneralPath) shape).curveTo(35.133003, 24.074999, 34.996002, 24.809, 35.152, 25.583);
        ((GeneralPath) shape).curveTo(35.191, 25.7, 35.363, 26.239, 35.672, 27.208);
        ((GeneralPath) shape).curveTo(35.75, 27.438, 35.887, 27.634, 36.082, 27.786);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.836, 25.349);
        ((GeneralPath) shape).lineTo(36.891, 26.856);
        ((GeneralPath) shape).curveTo(36.855, 27.282001, 36.871, 27.575, 36.948997, 27.727001);
        ((GeneralPath) shape).curveTo(37.065998, 27.923, 37.198997, 27.884, 37.354996, 27.61);
        ((GeneralPath) shape).curveTo(37.472996, 27.458, 37.589996, 27.243, 37.702995, 26.974);
        ((GeneralPath) shape).curveTo(37.780994, 26.743, 37.897995, 26.587002, 38.054996, 26.509);
        ((GeneralPath) shape).curveTo(38.362995, 26.317001, 38.534996, 26.083, 38.573997, 25.813002);
        ((GeneralPath) shape).curveTo(37.648, 25.622002, 37.065998, 25.466002, 36.836, 25.349);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.406, 15.602);
        ((GeneralPath) shape).curveTo(25.367, 15.372001, 25.02, 15.161, 24.363, 14.966001);
        ((GeneralPath) shape).curveTo(23.977001, 14.849001, 23.629002, 14.618001, 23.320002, 14.27);
        ((GeneralPath) shape).curveTo(23.188002, 14.1380005, 23.078001, 14.0130005, 23.000002, 13.891001);
        ((GeneralPath) shape).curveTo(23.098001, 14.056001, 23.203001, 14.243001, 23.320002, 14.442);
        ((GeneralPath) shape).curveTo(23.629002, 14.946, 23.938002, 15.294001, 24.246002, 15.489);
        ((GeneralPath) shape).curveTo(24.559002, 15.72, 24.848001, 15.798, 25.117002, 15.72);
        ((GeneralPath) shape).curveTo(25.230003, 15.72, 25.328003, 15.681001, 25.406002, 15.602);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.289, 14.095);
        ((GeneralPath) shape).curveTo(25.328, 14.251, 25.406, 14.427, 25.522999, 14.618);
        ((GeneralPath) shape).curveTo(25.754, 15.005, 26.081999, 15.274, 26.508, 15.431);
        ((GeneralPath) shape).curveTo(26.816, 15.587, 27.203, 15.681, 27.668, 15.719999);
        ((GeneralPath) shape).curveTo(27.977, 15.758999, 28.191, 15.875999, 28.304998, 16.067);
        ((GeneralPath) shape).lineTo(28.828, 16.938);
        ((GeneralPath) shape).lineTo(28.769999, 16.591);
        ((GeneralPath) shape).curveTo(28.729998, 16.282, 28.637, 16.008999, 28.479998, 15.778);
        ((GeneralPath) shape).curveTo(28.210999, 15.235, 27.706997, 14.794, 26.972998, 14.441999);
        ((GeneralPath) shape).curveTo(26.546997, 14.289999, 26.140997, 14.172999, 25.753998, 14.094999);
        ((GeneralPath) shape).lineTo(25.288998, 14.094999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.461, 13.282);
        ((GeneralPath) shape).curveTo(21.461, 13.707999, 21.52, 14.29, 21.637001, 15.023999);
        ((GeneralPath) shape).curveTo(21.754002, 16.105999, 22.062, 16.684, 22.562, 16.765999);
        ((GeneralPath) shape).curveTo(23.105, 16.765999, 23.473, 16.747, 23.668, 16.707998);
        ((GeneralPath) shape).lineTo(24.07, 16.648998);
        ((GeneralPath) shape).lineTo(23.605, 16.414999);
        ((GeneralPath) shape).curveTo(23.223, 16.223999, 22.93, 15.992999, 22.737999, 15.719999);
        ((GeneralPath) shape).curveTo(22.581999, 15.488999, 22.311998, 14.926999, 21.925999, 14.039999);
        ((GeneralPath) shape).curveTo(21.734, 13.535999, 21.578, 13.281999, 21.460999, 13.281999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.395, 16.415);
        ((GeneralPath) shape).curveTo(30.551, 16.727001, 30.742, 17.016, 30.977001, 17.286001);
        ((GeneralPath) shape).curveTo(31.480001, 17.864, 32.02, 18.138, 32.602, 18.099);
        ((GeneralPath) shape).curveTo(33.527, 18.059, 34.07, 17.907001, 34.223, 17.634);
        ((GeneralPath) shape).curveTo(33.992, 17.712, 33.391, 17.634, 32.426, 17.403);
        ((GeneralPath) shape).curveTo(31.843998, 17.247, 31.343998, 17.036, 30.918, 16.766);
        ((GeneralPath) shape).curveTo(30.684, 16.649, 30.512, 16.532001, 30.394999, 16.415);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.418, 8.641);
        ((GeneralPath) shape).curveTo(40.836, 7.5199995, 39.773, 6.825, 38.226997, 6.5559998);
        ((GeneralPath) shape).curveTo(36.176, 6.2429996, 33.761997, 5.934, 30.976997, 5.626);
        ((GeneralPath) shape).curveTo(28.964996, 5.239, 27.667997, 5.106, 27.089996, 5.22);
        ((GeneralPath) shape).curveTo(26.159996, 5.415, 25.733997, 6.575, 25.811996, 8.7);
        ((GeneralPath) shape).curveTo(25.890997, 10.594999, 26.507996, 10.985, 27.667995, 9.86);
        ((GeneralPath) shape).curveTo(29.061996, 8.544, 29.948996, 8.254999, 30.335995, 8.993);
        ((GeneralPath) shape).curveTo(31.612995, 11.235001, 32.772995, 13.884, 33.819996, 16.938);
        ((GeneralPath) shape).curveTo(34.280994, 18.177, 34.745995, 19.181, 35.210995, 19.954);
        ((GeneralPath) shape).curveTo(35.753994, 20.766, 36.194996, 21.481, 36.542995, 22.102001);
        ((GeneralPath) shape).curveTo(37.550995, 23.802002, 38.167995, 24.923, 38.401997, 25.466002);
        ((GeneralPath) shape).curveTo(38.671997, 26.434002, 38.882996, 27.091002, 39.038998, 27.438002);
        ((GeneralPath) shape).curveTo(39.269997, 28.016, 39.714996, 28.384, 40.371, 28.54);
        ((GeneralPath) shape).curveTo(40.605, 28.579, 41.223, 28.442001, 42.23, 28.134);
        ((GeneralPath) shape).curveTo(42.77, 27.942001, 43.253998, 28.27, 43.68, 29.118);
        ((GeneralPath) shape).curveTo(44.223, 30.204, 44.957, 30.782, 45.883, 30.86);
        ((GeneralPath) shape).curveTo(46.852, 30.899, 47.336, 30.317001, 47.336, 29.118);
        ((GeneralPath) shape).curveTo(47.336, 28.231, 47.008, 26.587, 46.348, 24.188);
        ((GeneralPath) shape).curveTo(45.574, 21.364, 45.133, 19.548, 45.016, 18.735);
        ((GeneralPath) shape).curveTo(44.823997, 17.345001, 44.59, 16.243, 44.32, 15.431001);
        ((GeneralPath) shape).curveTo(44.125, 14.8880005, 43.664, 13.864, 42.926, 12.356001);
        ((GeneralPath) shape).curveTo(42.461, 11.427001, 41.956997, 10.192001, 41.418, 8.641001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x719B3F));
        g.fill(shape);

        // _0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(43.449, 28.77);
        ((GeneralPath) shape).curveTo(43.488003, 29.083, 43.602, 29.235, 43.797, 29.235);
        ((GeneralPath) shape).curveTo(43.953, 29.235, 44.164, 29.255001, 44.434002, 29.294);
        ((GeneralPath) shape).curveTo(44.668003, 29.333, 44.703003, 29.255001, 44.551003, 29.063);
        ((GeneralPath) shape).curveTo(44.320004, 28.829, 44.164, 28.657, 44.086002, 28.539999);
        ((GeneralPath) shape).curveTo(43.934002, 28.306, 43.836002, 27.977, 43.797, 27.556);
        ((GeneralPath) shape).curveTo(43.758, 27.208, 43.738003, 26.763, 43.738003, 26.22);
        ((GeneralPath) shape).curveTo(43.699, 25.793999, 43.586002, 25.446, 43.391003, 25.177);
        ((GeneralPath) shape).curveTo(42.617004, 24.286, 42.191, 23.802, 42.113003, 23.727);
        ((GeneralPath) shape).curveTo(41.262, 22.837, 40.531002, 21.946, 39.910004, 21.056);
        ((GeneralPath) shape).curveTo(39.367004, 20.282, 39.328003, 19.973999, 39.793003, 20.13);
        ((GeneralPath) shape).curveTo(40.219, 20.282, 40.934002, 20.977, 41.941, 22.216);
        ((GeneralPath) shape).curveTo(43.68, 24.423, 44.629, 25.618, 44.781002, 25.813);
        ((GeneralPath) shape).curveTo(45.402, 26.508999, 45.965004, 26.895, 46.465004, 26.973999);
        ((GeneralPath) shape).curveTo(45.691006, 26.082998, 44.879005, 25.001, 44.031006, 23.727);
        ((GeneralPath) shape).curveTo(42.480007, 21.403, 41.305004, 20.071, 40.492004, 19.723999);
        ((GeneralPath) shape).lineTo(38.750004, 18.793999);
        ((GeneralPath) shape).lineTo(38.461002, 18.269999);
        ((GeneralPath) shape).curveTo(38.383003, 17.961998, 38.730003, 17.902998, 39.504, 18.098999);
        ((GeneralPath) shape).curveTo(40.512, 18.328999, 41.285, 18.578999, 41.824, 18.852);
        ((GeneralPath) shape).curveTo(42.445, 19.238998, 42.926003, 19.778, 43.273003, 20.473999);
        ((GeneralPath) shape).lineTo(44.957, 23.258999);
        ((GeneralPath) shape).curveTo(44.453, 20.786, 43.953, 19.355999, 43.449, 18.966);
        ((GeneralPath) shape).curveTo(43.141003, 18.657, 42.887, 18.427, 42.695, 18.27);
        ((GeneralPath) shape).curveTo(42.387, 18.04, 41.766, 17.77, 40.84, 17.458);
        ((GeneralPath) shape).lineTo(37.938, 16.591);
        ((GeneralPath) shape).lineTo(37.766, 15.8949995);
        ((GeneralPath) shape).curveTo(37.878998, 15.504999, 38.538998, 15.485, 39.738, 15.832999);
        ((GeneralPath) shape).curveTo(41.476997, 16.414999, 42.406, 16.723999, 42.52, 16.762999);
        ((GeneralPath) shape).curveTo(42.984, 16.957998, 43.312, 17.246998, 43.508, 17.633999);
        ((GeneralPath) shape).lineTo(44.027, 18.505);
        ((GeneralPath) shape).lineTo(44.086, 17.227);
        ((GeneralPath) shape).curveTo(43.855, 16.337, 43.101997, 15.773999, 41.823997, 15.544);
        ((GeneralPath) shape).curveTo(40.507996, 15.273999, 39.581997, 15.024, 39.038998, 14.79);
        ((GeneralPath) shape).curveTo(38.886997, 14.751, 38.499996, 14.5199995, 37.878998, 14.095);
        ((GeneralPath) shape).curveTo(37.301, 13.669001, 36.874996, 13.419001, 36.601997, 13.341001);
        ((GeneralPath) shape).lineTo(37.358997, 13.165001);
        ((GeneralPath) shape).curveTo(38.016, 13.091001, 38.729996, 13.145, 39.503998, 13.341001);
        ((GeneralPath) shape).curveTo(40.741997, 13.610001, 41.863, 13.747001, 42.866997, 13.747001);
        ((GeneralPath) shape).curveTo(41.241997, 12.005001, 39.621, 10.384001, 37.996, 8.872001);
        ((GeneralPath) shape).curveTo(34.706997, 5.934001, 33.008, 5.1410007, 32.891, 6.4970007);
        ((GeneralPath) shape).curveTo(32.851997, 9.278001, 32.793, 10.903001, 32.715, 11.368);
        ((GeneralPath) shape).curveTo(32.676, 11.677, 32.852, 12.2, 33.238, 12.934);
        ((GeneralPath) shape).lineTo(33.440998, 13.282);
        ((GeneralPath) shape).curveTo(33.434, 13.099, 33.561996, 12.962, 33.82, 12.875999);
        ((GeneralPath) shape).curveTo(34.281, 12.723999, 34.633, 12.7039995, 34.863, 12.816999);
        ((GeneralPath) shape).curveTo(35.093998, 12.8949995, 35.093998, 13.11, 34.863, 13.457999);
        ((GeneralPath) shape).curveTo(34.59, 13.805999, 34.398, 14.035999, 34.281, 14.152999);
        ((GeneralPath) shape).curveTo(34.168, 14.305999, 34.089996, 14.519999, 34.051, 14.793999);
        ((GeneralPath) shape).lineTo(33.992, 16.301998);
        ((GeneralPath) shape).lineTo(34.34, 15.488998);
        ((GeneralPath) shape).curveTo(34.613, 14.945998, 34.883, 14.672998, 35.152, 14.672998);
        ((GeneralPath) shape).curveTo(35.617, 14.672998, 35.906002, 14.867998, 36.023, 15.254998);
        ((GeneralPath) shape).lineTo(35.440998, 16.765999);
        ((GeneralPath) shape).curveTo(35.019997, 17.652998, 34.98, 18.637999, 35.328, 19.723999);
        ((GeneralPath) shape).curveTo(35.402, 19.992998, 35.402, 19.837, 35.328, 19.258999);
        ((GeneralPath) shape).curveTo(35.25, 18.446, 35.309, 18.098999, 35.5, 18.216);
        ((GeneralPath) shape).lineTo(35.906, 18.446);
        ((GeneralPath) shape).lineTo(36.081997, 19.258999);
        ((GeneralPath) shape).curveTo(36.198997, 19.683998, 36.371, 19.933998, 36.601997, 20.012999);
        ((GeneralPath) shape).curveTo(36.757996, 20.090998, 36.991997, 20.13, 37.301, 20.13);
        ((GeneralPath) shape).curveTo(37.453, 20.168999, 37.551, 20.109999, 37.59, 19.953999);
        ((GeneralPath) shape).curveTo(37.629, 19.876, 37.668, 19.992998, 37.707, 20.301998);
        ((GeneralPath) shape).lineTo(37.879, 21.172998);
        ((GeneralPath) shape).curveTo(37.879, 21.289999, 37.898003, 21.406998, 37.938, 21.519999);
        ((GeneralPath) shape).curveTo(38.016, 21.793999, 38.188, 21.926998, 38.461, 21.926998);
        ((GeneralPath) shape).lineTo(39.156, 21.926998);
        ((GeneralPath) shape).curveTo(39.309, 22.121998, 39.328, 22.430998, 39.211, 22.855999);
        ((GeneralPath) shape).lineTo(39.038998, 23.433998);
        ((GeneralPath) shape).curveTo(39.156, 23.512999, 39.156, 23.801998, 39.038998, 24.305998);
        ((GeneralPath) shape).lineTo(38.98, 24.769999);
        ((GeneralPath) shape).lineTo(38.863, 25.058998);
        ((GeneralPath) shape).lineTo(38.98, 26.101997);
        ((GeneralPath) shape).lineTo(39.328, 25.058998);
        ((GeneralPath) shape).curveTo(39.562, 24.324999, 39.753998, 23.918999, 39.91, 23.840998);
        ((GeneralPath) shape).curveTo(40.027, 23.801998, 40.125, 23.707998, 40.199, 23.551998);
        ((GeneralPath) shape).lineTo(40.258, 23.726997);
        ((GeneralPath) shape).lineTo(40.315998, 24.887997);
        ((GeneralPath) shape).curveTo(40.315998, 25.195997, 40.198997, 25.426996, 39.968998, 25.582996);
        ((GeneralPath) shape).curveTo(39.891, 25.621996, 40.003998, 25.695997, 40.315998, 25.812996);
        ((GeneralPath) shape).curveTo(40.934, 26.008995, 41.418, 26.105995, 41.766, 26.105995);
        ((GeneralPath) shape).curveTo(42.309, 26.105995, 42.617, 26.125996, 42.695, 26.160995);
        ((GeneralPath) shape).curveTo(42.965, 26.316996, 43.141, 26.683996, 43.215, 27.265995);
        ((GeneralPath) shape).curveTo(43.332, 28.191996, 43.41, 28.695995, 43.449, 28.769995);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A873C));
        g.fill(shape);

        // _0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(43.043, 17.169);
        ((GeneralPath) shape).curveTo(41.457, 16.474, 40.355, 16.028, 39.734, 15.837001);
        ((GeneralPath) shape).curveTo(39.348, 15.720001, 38.922, 15.391001, 38.461002, 14.852001);
        ((GeneralPath) shape).curveTo(38.227, 14.579001, 38.031002, 14.329001, 37.879, 14.099001);
        ((GeneralPath) shape).lineTo(38.461002, 14.099001);
        ((GeneralPath) shape).curveTo(39.039, 14.059001, 39.793003, 13.942001, 40.723003, 13.747001);
        ((GeneralPath) shape).curveTo(42.035004, 13.516001, 41.184002, 11.891001, 38.168003, 8.876001);
        ((GeneralPath) shape).curveTo(35.309002, 6.0130014, 33.934002, 5.821001, 34.051003, 8.294002);
        ((GeneralPath) shape).curveTo(34.129, 9.493002, 34.012, 10.595001, 33.703003, 11.602001);
        ((GeneralPath) shape).curveTo(33.355003, 12.5320015, 33.219, 13.208001, 33.297005, 13.634001);
        ((GeneralPath) shape).lineTo(33.906006, 16.013);
        ((GeneralPath) shape).curveTo(33.980007, 15.817, 34.145004, 15.567, 34.398006, 15.259001);
        ((GeneralPath) shape).curveTo(34.977005, 14.559001, 35.402008, 14.212001, 35.676006, 14.212001);
        ((GeneralPath) shape).curveTo(35.402008, 14.329, 35.211006, 14.868001, 35.094006, 15.837001);
        ((GeneralPath) shape).curveTo(35.016006, 16.458, 35.035007, 17.286001, 35.152004, 18.333);
        ((GeneralPath) shape).lineTo(35.328003, 19.724);
        ((GeneralPath) shape).lineTo(35.676003, 18.157001);
        ((GeneralPath) shape).curveTo(35.945004, 17.114002, 36.254, 16.591002, 36.602, 16.591002);
        ((GeneralPath) shape).curveTo(36.949, 16.591002, 37.125, 16.806002, 37.125, 17.227001);
        ((GeneralPath) shape).curveTo(37.047, 17.884, 37.008, 18.466002, 37.008, 18.970001);
        ((GeneralPath) shape).lineTo(37.125, 22.856);
        ((GeneralPath) shape).curveTo(37.473, 19.45, 37.859, 18.349, 38.285, 19.548);
        ((GeneralPath) shape).curveTo(38.593998, 20.477001, 38.824, 21.134, 38.98, 21.52);
        ((GeneralPath) shape).curveTo(39.211, 22.099, 39.637, 22.837, 40.258, 23.724);
        ((GeneralPath) shape).curveTo(40.762, 24.497002, 41.281, 25.079, 41.823997, 25.466002);
        ((GeneralPath) shape).curveTo(42.211, 25.774002, 42.421997, 26.024002, 42.461, 26.220001);
        ((GeneralPath) shape).lineTo(42.578, 26.974);
        ((GeneralPath) shape).curveTo(42.695, 26.470001, 42.422, 25.774, 41.766, 24.884);
        ((GeneralPath) shape).lineTo(40.055, 22.216002);
        ((GeneralPath) shape).curveTo(40.23, 22.282001, 40.449, 22.341002, 40.723, 22.391);
        ((GeneralPath) shape).curveTo(41.805, 22.583, 42.848, 23.474, 43.852, 25.059);
        ((GeneralPath) shape).curveTo(43.312, 23.86, 42.672, 22.911, 41.938, 22.216);
        ((GeneralPath) shape).curveTo(40.815998, 21.324999, 40.102, 20.688, 39.793, 20.302);
        ((GeneralPath) shape).curveTo(39.367, 19.798, 39.073997, 19.411, 38.922, 19.141);
        ((GeneralPath) shape).curveTo(38.73, 18.677, 39.02, 18.466002, 39.793, 18.505001);
        ((GeneralPath) shape).curveTo(40.332, 18.579, 40.738, 18.657001, 41.012, 18.735);
        ((GeneralPath) shape).curveTo(41.496002, 18.899, 41.883, 19.11, 42.172, 19.376001);
        ((GeneralPath) shape).curveTo(41.336002, 18.497002, 40.543, 17.954, 39.793, 17.751001);
        ((GeneralPath) shape).curveTo(39.211, 17.595001, 38.805, 17.345001, 38.573997, 16.997002);
        ((GeneralPath) shape).curveTo(38.378998, 16.610003, 38.476997, 16.415, 38.863, 16.415);
        ((GeneralPath) shape).curveTo(39.440998, 16.415, 40.233997, 16.532001, 41.242, 16.766);
        ((GeneralPath) shape).lineTo(43.043, 17.169);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x769E3F));
        g.fill(shape);

        // _0_0_0_36
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.012, 28.251);
        ((GeneralPath) shape).curveTo(41.051003, 28.251, 41.09, 28.153, 41.129, 27.962);
        ((GeneralPath) shape).curveTo(41.129, 27.692, 41.168003, 27.458, 41.242, 27.266);
        ((GeneralPath) shape).curveTo(41.438, 26.915, 41.785, 26.704, 42.289, 26.626001);
        ((GeneralPath) shape).lineTo(41.359, 26.626001);
        ((GeneralPath) shape).curveTo(40.934002, 26.626001, 40.625, 26.938002, 40.43, 27.556002);
        ((GeneralPath) shape).curveTo(40.352, 27.79, 40.219, 27.923002, 40.023, 27.962002);
        ((GeneralPath) shape).curveTo(39.91, 27.962002, 39.891, 28.036001, 39.968998, 28.192001);
        ((GeneralPath) shape).curveTo(40.081997, 28.349, 40.238, 28.407001, 40.429996, 28.368002);
        ((GeneralPath) shape).lineTo(41.011997, 28.251001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7BB342));
        g.fill(shape);

        // _0_0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(39.328, 27.556);
        ((GeneralPath) shape).curveTo(39.328, 27.282, 39.523, 26.376, 39.91, 24.829);
        ((GeneralPath) shape).curveTo(39.973, 24.263, 40.059, 23.915, 40.168, 23.782);
        ((GeneralPath) shape).curveTo(39.863, 24.005, 39.601997, 24.274, 39.387, 24.595);
        ((GeneralPath) shape).curveTo(39.23, 24.828999, 39.137, 25.251, 39.098, 25.872);
        ((GeneralPath) shape).lineTo(39.039, 26.743);
        ((GeneralPath) shape).curveTo(39.078003, 26.974, 39.117, 27.188, 39.156002, 27.38);
        ((GeneralPath) shape).curveTo(39.230003, 27.765999, 39.289, 27.824999, 39.328003, 27.556);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.285, 24.188);
        ((GeneralPath) shape).curveTo(38.285, 23.727, 38.574, 23.126, 39.156, 22.390999);
        ((GeneralPath) shape).lineTo(38.75, 22.390999);
        ((GeneralPath) shape).curveTo(38.402, 22.390999, 38.031, 22.640999, 37.645, 23.144999);
        ((GeneralPath) shape).curveTo(37.57, 23.297998, 37.645, 23.644999, 37.879, 24.187998);
        ((GeneralPath) shape).curveTo(38.148003, 24.691998, 38.285, 24.691998, 38.285, 24.187998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(45.535, 30.048);
        ((GeneralPath) shape).curveTo(46.387, 30.552, 46.602, 29.989, 46.172, 28.368);
        ((GeneralPath) shape).curveTo(46.059002, 27.903, 45.941, 27.649, 45.824, 27.61);
        ((GeneralPath) shape).curveTo(45.594, 27.536001, 45.305, 27.380001, 44.957, 27.145);
        ((GeneralPath) shape).lineTo(43.68, 25.989);
        ((GeneralPath) shape).curveTo(43.871002, 26.645, 44.008, 27.341, 44.086, 28.075);
        ((GeneralPath) shape).curveTo(44.163998, 28.849, 44.644997, 29.509, 45.535, 30.048);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.809, 24.536);
        ((GeneralPath) shape).curveTo(43.503998, 25.157, 43.758, 25.177, 43.561996, 24.595);
        ((GeneralPath) shape).curveTo(43.370995, 23.977, 43.003998, 23.453999, 42.460995, 23.028);
        ((GeneralPath) shape).curveTo(41.417995, 22.102, 41.069996, 21.907, 41.417995, 22.45);
        ((GeneralPath) shape).curveTo(41.530994, 22.606, 41.647995, 22.876001, 41.765995, 23.263);
        ((GeneralPath) shape).curveTo(41.956997, 23.649, 42.308994, 24.075, 42.808994, 24.536001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_41
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(43.391, 22.622);
        ((GeneralPath) shape).lineTo(44.723, 24.829);
        ((GeneralPath) shape).curveTo(45.227, 25.677, 45.863, 26.470001, 46.637, 27.208);
        ((GeneralPath) shape).lineTo(46.465, 26.974);
        ((GeneralPath) shape).curveTo(46.191, 26.044, 45.883, 25.216002, 45.535, 24.477001);
        ((GeneralPath) shape).curveTo(45.343998, 23.977001, 44.938, 23.298, 44.32, 22.446001);
        ((GeneralPath) shape).curveTo(43.468998, 20.864, 42.753998, 19.876001, 42.172, 19.489);
        ((GeneralPath) shape).curveTo(41.824, 19.259, 41.418, 19.181, 40.953, 19.259);
        ((GeneralPath) shape).lineTo(40.434, 19.431002);
        ((GeneralPath) shape).lineTo(41.883, 20.649002);
        ((GeneralPath) shape).curveTo(42.074, 20.845001, 42.578, 21.501001, 43.391, 22.622002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_42
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(44.375, 21.638);
        ((GeneralPath) shape).curveTo(44.801, 22.177, 45.012, 22.313, 45.012, 22.044);
        ((GeneralPath) shape).curveTo(45.012, 21.927, 44.957, 21.618, 44.84, 21.114);
        ((GeneralPath) shape).curveTo(44.762, 20.302, 44.223, 19.298, 43.215, 18.099);
        ((GeneralPath) shape).curveTo(42.754, 17.481, 42.367, 17.227001, 42.055, 17.345001);
        ((GeneralPath) shape).lineTo(41.707, 17.751001);
        ((GeneralPath) shape).lineTo(43.273003, 19.434002);
        ((GeneralPath) shape).curveTo(43.699, 19.895002, 44.066, 20.634003, 44.375004, 21.638002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(40.895, 23.669);
        ((GeneralPath) shape).curveTo(39.734, 21.657001, 38.961, 19.895, 38.574, 18.388);
        ((GeneralPath) shape).curveTo(38.305, 17.149, 37.879, 15.333, 37.301003, 12.934);
        ((GeneralPath) shape).curveTo(36.836002, 11.001, 36.469, 9.7630005, 36.195004, 9.224);
        ((GeneralPath) shape).curveTo(35.695004, 8.333, 35.055004, 7.829, 34.281002, 7.712);
        ((GeneralPath) shape).curveTo(33.391003, 7.559, 33.160004, 8.391, 33.586002, 10.208);
        ((GeneralPath) shape).curveTo(34.320004, 10.556, 35.094, 11.716001, 35.906002, 13.688);
        ((GeneralPath) shape).curveTo(36.641003, 15.778, 37.434002, 17.730999, 38.285004, 19.548);
        ((GeneralPath) shape).curveTo(38.824005, 20.708, 39.695004, 22.157, 40.895004, 23.899);
        ((GeneralPath) shape).curveTo(41.305004, 24.528, 41.691006, 25.099, 42.055004, 25.61);
        ((GeneralPath) shape).curveTo(41.676003, 25.044, 41.285004, 24.395, 40.895004, 23.669);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD2D6A7));
        g.fill(shape);

        // _0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.848, 13.052);
        ((GeneralPath) shape).lineTo(37.184, 17.286);
        ((GeneralPath) shape).curveTo(37.608997, 18.637999, 38.401997, 20.227, 39.561996, 22.043999);
        ((GeneralPath) shape).curveTo(40.140995, 22.933998, 40.684, 23.707998, 41.187996, 24.363998);
        ((GeneralPath) shape).curveTo(40.991997, 24.095, 40.761997, 23.762999, 40.487995, 23.375998);
        ((GeneralPath) shape).curveTo(39.948994, 22.601997, 39.522995, 21.926998, 39.210995, 21.344997);
        ((GeneralPath) shape).curveTo(38.476994, 19.723997, 37.858994, 17.926998, 37.358994, 15.949997);
        ((GeneralPath) shape).curveTo(36.737995, 13.203997, 36.233994, 11.617997, 35.847992, 11.195997);
        ((GeneralPath) shape).curveTo(35.57799, 10.883997, 35.46099, 10.961997, 35.499992, 11.426997);
        ((GeneralPath) shape).curveTo(35.499992, 11.890997, 35.616993, 12.433997, 35.847992, 13.051997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDBDDBB));
        g.fill(shape);

        // _0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.719, 17.286);
        ((GeneralPath) shape).curveTo(16.105, 17.286, 16.492, 17.208, 16.879, 17.056);
        ((GeneralPath) shape).curveTo(17.147999, 17.015999, 17.461, 17.324999, 17.809, 17.980999);
        ((GeneralPath) shape).curveTo(18.348, 19.028, 18.641, 19.547998, 18.676, 19.547998);
        ((GeneralPath) shape).curveTo(18.871, 19.821, 19.141, 19.957998, 19.488, 19.957998);
        ((GeneralPath) shape).lineTo(21.172, 19.957998);
        ((GeneralPath) shape).curveTo(21.598001, 19.992998, 21.867, 20.031998, 21.984001, 20.071);
        ((GeneralPath) shape).curveTo(22.137001, 20.227, 22.352001, 20.38, 22.621, 20.536);
        ((GeneralPath) shape).curveTo(22.891, 20.692, 23.145, 20.883999, 23.375, 21.118);
        ((GeneralPath) shape).curveTo(23.57, 21.231, 23.859, 21.192, 24.246, 21.001);
        ((GeneralPath) shape).curveTo(24.555, 20.845, 24.863, 20.633999, 25.176, 20.364);
        ((GeneralPath) shape).curveTo(25.328001, 20.247, 25.484001, 20.227001, 25.637001, 20.306);
        ((GeneralPath) shape).curveTo(25.832, 20.345, 26.004002, 20.364, 26.160002, 20.364);
        ((GeneralPath) shape).curveTo(26.312002, 20.399, 26.547, 20.653, 26.855001, 21.118);
        ((GeneralPath) shape).curveTo(27.125002, 21.774, 27.301, 22.181, 27.379002, 22.333);
        ((GeneralPath) shape).curveTo(27.457, 22.567, 27.840002, 22.681, 28.539001, 22.681);
        ((GeneralPath) shape).curveTo(29.117, 22.681, 29.445002, 22.817, 29.523, 23.087);
        ((GeneralPath) shape).curveTo(29.562, 23.164999, 29.793001, 23.032, 30.219, 22.681);
        ((GeneralPath) shape).curveTo(30.605, 22.372, 31.457, 21.927, 32.77, 21.348999);
        ((GeneralPath) shape).curveTo(33.93, 20.845, 34.629, 20.418999, 34.859, 20.071);
        ((GeneralPath) shape).curveTo(35.016003, 19.88, 35.305, 19.762999, 35.73, 19.723999);
        ((GeneralPath) shape).curveTo(36.078, 19.723999, 36.503998, 19.317, 37.008, 18.505);
        ((GeneralPath) shape).curveTo(37.82, 17.113998, 38.262, 15.914999, 38.34, 14.910999);
        ((GeneralPath) shape).curveTo(38.379, 14.598999, 38.418, 14.157, 38.457, 13.574999);
        ((GeneralPath) shape).curveTo(38.457, 13.109999, 38.242, 12.840999, 37.82, 12.762999);
        ((GeneralPath) shape).curveTo(32.02, 11.023998, 27.688, 10.363998, 24.824, 10.789999);
        ((GeneralPath) shape).curveTo(24.09, 10.906999, 21.612999, 10.945999, 17.397999, 10.906999);
        ((GeneralPath) shape).curveTo(14.534999, 10.867999, 13.007999, 11.273998, 12.815999, 12.1259985);
        ((GeneralPath) shape).curveTo(12.581999, 13.051998, 12.874999, 14.074999, 13.687999, 15.199999);
        ((GeneralPath) shape).curveTo(14.269999, 15.969999, 14.944999, 16.668999, 15.718999, 17.286);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A873C));
        g.fill(shape);

        // _0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.816, 20.477);
        ((GeneralPath) shape).curveTo(29.895, 20.438, 30.281, 20.032, 30.977, 19.258999);
        ((GeneralPath) shape).curveTo(31.519999, 18.716, 32.038998, 18.446, 32.543, 18.446);
        ((GeneralPath) shape).curveTo(32.66, 18.446, 33.141, 18.505, 33.992, 18.622);
        ((GeneralPath) shape).curveTo(34.418, 18.696, 34.805, 18.622, 35.152, 18.388);
        ((GeneralPath) shape).curveTo(35.422, 18.157, 35.809002, 17.864, 36.312, 17.516);
        ((GeneralPath) shape).curveTo(36.738, 17.208, 37.008, 16.919, 37.125, 16.649);
        ((GeneralPath) shape).curveTo(37.359, 16.224, 37.609, 15.641, 37.879, 14.907001);
        ((GeneralPath) shape).curveTo(36.488003, 16.571001, 35.5, 17.477001, 34.922, 17.634);
        ((GeneralPath) shape).curveTo(34.57, 17.712, 34.227, 17.751001, 33.875, 17.751001);
        ((GeneralPath) shape).curveTo(33.41, 17.712002, 32.988, 17.692001, 32.602, 17.692001);
        ((GeneralPath) shape).curveTo(32.059002, 17.692001, 31.730001, 17.712002, 31.613, 17.751001);
        ((GeneralPath) shape).curveTo(31.461, 17.79, 31.109001, 18.001001, 30.570002, 18.388);
        ((GeneralPath) shape).curveTo(29.949001, 18.813, 29.602001, 19.044, 29.523, 19.083);
        ((GeneralPath) shape).curveTo(29.332, 19.122, 29.043001, 19.067, 28.656, 18.911);
        ((GeneralPath) shape).curveTo(28.191, 18.716, 27.707, 18.407, 27.203001, 17.980999);
        ((GeneralPath) shape).curveTo(26.703001, 17.556, 26.434002, 17.247, 26.395, 17.056);
        ((GeneralPath) shape).curveTo(26.199001, 16.243, 26.566, 15.934, 27.496, 16.126);
        ((GeneralPath) shape).curveTo(27.922, 16.203999, 28.422, 16.394999, 29.004, 16.703999);
        ((GeneralPath) shape).curveTo(29.469, 16.859999, 29.93, 16.765999, 30.395, 16.414999);
        ((GeneralPath) shape).lineTo(32.195, 15.082999);
        ((GeneralPath) shape).curveTo(32.734, 14.735, 33.043, 14.539999, 33.121, 14.500999);
        ((GeneralPath) shape).curveTo(33.315998, 14.426999, 33.605, 14.403, 33.991997, 14.441999);
        ((GeneralPath) shape).curveTo(34.569996, 14.480999, 35.211, 14.230999, 35.906, 13.691999);
        ((GeneralPath) shape).curveTo(35.559, 13.535999, 34.746, 13.613999, 33.468998, 13.922999);
        ((GeneralPath) shape).curveTo(32.851997, 14.075, 32.269997, 14.308999, 31.729998, 14.617999);
        ((GeneralPath) shape).curveTo(31.304998, 14.888, 30.897997, 15.043999, 30.511997, 15.082999);
        ((GeneralPath) shape).curveTo(29.311996, 15.508999, 28.577997, 15.625999, 28.308998, 15.430999);
        ((GeneralPath) shape).curveTo(28.073997, 15.273999, 27.456999, 15.121999, 26.453, 14.965999);
        ((GeneralPath) shape).lineTo(27.609, 14.848999);
        ((GeneralPath) shape).curveTo(28.421999, 14.734999, 29.043, 14.500999, 29.469, 14.152999);
        ((GeneralPath) shape).curveTo(29.508, 14.113999, 29.777, 13.824999, 30.281, 13.281999);
        ((GeneralPath) shape).curveTo(30.473, 13.090999, 30.781, 12.933999, 31.207, 12.820998);
        ((GeneralPath) shape).curveTo(31.941, 12.6259985, 32.891, 12.531999, 34.051003, 12.531999);
        ((GeneralPath) shape).curveTo(33.316, 11.910998, 32.621002, 11.601998, 31.961002, 11.601998);
        ((GeneralPath) shape).curveTo(26.895002, 12.105998, 23.648003, 12.336998, 22.219002, 12.297998);
        ((GeneralPath) shape).curveTo(20.398003, 12.0669985, 19.066002, 11.910998, 18.215002, 11.832998);
        ((GeneralPath) shape).curveTo(16.668001, 11.640998, 16.125002, 11.793999, 16.590002, 12.297998);
        ((GeneralPath) shape).curveTo(16.938002, 12.840999, 17.594002, 13.457998, 18.562002, 14.152998);
        ((GeneralPath) shape).curveTo(19.453003, 14.773998, 20.301003, 15.234998, 21.113003, 15.543998);
        ((GeneralPath) shape).curveTo(22.160004, 15.933998, 22.758003, 16.301998, 22.914003, 16.648998);
        ((GeneralPath) shape).curveTo(22.875004, 17.265999, 23.066004, 17.848999, 23.492002, 18.387999);
        ((GeneralPath) shape).curveTo(23.762003, 18.734999, 24.168003, 19.023998, 24.711002, 19.258999);
        ((GeneralPath) shape).curveTo(24.980001, 19.376, 25.230001, 19.47, 25.465002, 19.547998);
        ((GeneralPath) shape).lineTo(24.883001, 18.97);
        ((GeneralPath) shape).curveTo(24.461, 18.543999, 24.246002, 18.137999, 24.246002, 17.751);
        ((GeneralPath) shape).curveTo(24.246002, 17.442, 24.227003, 17.247, 24.188002, 17.168999);
        ((GeneralPath) shape).lineTo(24.770002, 17.461998);
        ((GeneralPath) shape).curveTo(25.852003, 17.808998, 26.508003, 18.234999, 26.742002, 18.734999);
        ((GeneralPath) shape).curveTo(26.895002, 19.238998, 27.012003, 19.605999, 27.090002, 19.841);
        ((GeneralPath) shape).curveTo(27.242002, 20.265999, 27.516003, 20.477, 27.902002, 20.477);
        ((GeneralPath) shape).curveTo(28.094002, 20.477, 28.461002, 20.536, 29.004002, 20.649);
        ((GeneralPath) shape).curveTo(29.273, 20.688, 29.543001, 20.634, 29.816002, 20.477);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4F7835));
        g.fill(shape);

        // _0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.996, 19.548);
        ((GeneralPath) shape).lineTo(18.27, 18.622);
        ((GeneralPath) shape).lineTo(17.75, 17.574999);
        ((GeneralPath) shape).curveTo(17.402, 16.727, 17.188, 15.8759985, 17.109, 15.023998);
        ((GeneralPath) shape).curveTo(16.995998, 14.094998, 17.206999, 13.281999, 17.75, 12.586998);
        ((GeneralPath) shape).curveTo(18.254, 12.008998, 18.812, 11.676998, 19.434, 11.601998);
        ((GeneralPath) shape).curveTo(20.012, 11.562999, 20.961, 11.621999, 22.273, 11.773998);
        ((GeneralPath) shape).curveTo(23.668001, 11.890998, 24.344002, 12.008998, 24.305, 12.1259985);
        ((GeneralPath) shape).curveTo(25.852001, 17.074999, 26.645, 19.723999, 26.684, 20.071);
        ((GeneralPath) shape).curveTo(26.684, 20.306, 26.742, 20.497, 26.859, 20.653);
        ((GeneralPath) shape).lineTo(26.973, 20.825);
        ((GeneralPath) shape).lineTo(27.785, 18.739);
        ((GeneralPath) shape).curveTo(28.367, 17.192, 28.773, 16.013, 29.004, 15.200001);
        ((GeneralPath) shape).curveTo(29.272999, 14.079, 27.921999, 12.802001, 24.941, 11.372001);
        ((GeneralPath) shape).curveTo(21.848, 9.903001, 19.453, 9.630001, 17.75, 10.559001);
        ((GeneralPath) shape).curveTo(16.203, 11.407001, 15.625, 13.169001, 16.012, 15.837001);
        ((GeneralPath) shape).lineTo(16.995998, 19.548);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x52702F));
        g.fill(shape);

        // _0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.324, 27.962);
        ((GeneralPath) shape).lineTo(32.773, 28.480999);
        ((GeneralPath) shape).lineTo(33.355, 27.668999);
        ((GeneralPath) shape).curveTo(33.703, 27.207998, 33.895, 27.144999, 33.934, 27.496998);
        ((GeneralPath) shape).curveTo(33.973, 27.922998, 34.535, 28.172998, 35.616997, 28.250998);
        ((GeneralPath) shape).curveTo(36.663998, 28.324997, 37.319996, 28.191998, 37.589996, 27.844997);
        ((GeneralPath) shape).curveTo(37.897995, 27.457998, 38.151997, 27.012997, 38.343998, 26.508997);
        ((GeneralPath) shape).curveTo(37.878998, 26.160997, 37.453, 25.988997, 37.065998, 25.988997);
        ((GeneralPath) shape).curveTo(36.448997, 25.988997, 36.043, 25.754997, 35.848, 25.289997);
        ((GeneralPath) shape).lineTo(34.574, 22.101997);
        ((GeneralPath) shape).lineTo(34.398003, 22.156998);
        ((GeneralPath) shape).lineTo(32.832, 23.027998);
        ((GeneralPath) shape).curveTo(32.715, 22.836998, 32.348, 22.469997, 31.730001, 21.926998);
        ((GeneralPath) shape).curveTo(30.801, 21.152998, 29.895, 20.765999, 29.004002, 20.765999);
        ((GeneralPath) shape).curveTo(28.422, 20.765999, 28.113, 20.883999, 28.074001, 21.113998);
        ((GeneralPath) shape).lineTo(31.324001, 27.961998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.531, 20.852);
        ((GeneralPath) shape).curveTo(15.836, 21.223999, 15.488, 21.484999, 15.488, 21.637999);
        ((GeneralPath) shape).lineTo(14.848, 26.161);
        ((GeneralPath) shape).lineTo(15.601999, 28.015999);
        ((GeneralPath) shape).curveTo(17.344, 27.321, 18.254, 26.933998, 18.328, 26.859999);
        ((GeneralPath) shape).curveTo(18.405998, 26.782, 18.464998, 26.277998, 18.504, 25.348999);
        ((GeneralPath) shape).curveTo(18.543, 24.501, 18.543, 23.997, 18.504, 23.841);
        ((GeneralPath) shape).curveTo(18.504, 23.765999, 18.426, 23.477, 18.27, 22.973999);
        ((GeneralPath) shape).curveTo(18.113, 22.47, 17.941, 22.22, 17.75, 22.22);
        ((GeneralPath) shape).curveTo(17.672, 22.22, 17.422, 22.411, 16.996, 22.797998);
        ((GeneralPath) shape).curveTo(16.684, 23.066998, 16.531, 23.047998, 16.531, 22.738998);
        ((GeneralPath) shape).lineTo(16.531, 20.852);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.07, 21.579);
        ((GeneralPath) shape).lineTo(24.129, 19.958);
        ((GeneralPath) shape).curveTo(24.168, 19.259, 24.344, 18.602001, 24.652, 17.981);
        ((GeneralPath) shape).lineTo(23.262001, 16.766);
        ((GeneralPath) shape).lineTo(21.695002, 21.579);
        ((GeneralPath) shape).lineTo(21.289001, 20.247);
        ((GeneralPath) shape).curveTo(21.055002, 19.587, 20.805002, 19.434, 20.535002, 19.782);
        ((GeneralPath) shape).curveTo(20.262001, 20.13, 20.164001, 20.63, 20.242002, 21.289999);
        ((GeneralPath) shape).curveTo(20.398003, 22.023998, 20.961002, 22.914999, 21.926003, 23.957998);
        ((GeneralPath) shape).curveTo(23.047003, 25.117998, 23.957003, 25.601997, 24.652002, 25.406998);
        ((GeneralPath) shape).curveTo(25.387003, 25.250998, 25.832003, 24.808998, 25.988003, 24.074997);
        ((GeneralPath) shape).curveTo(26.102003, 23.375998, 25.945004, 22.719997, 25.523003, 22.101997);
        ((GeneralPath) shape).curveTo(25.211002, 21.598997, 24.883003, 21.363997, 24.535002, 21.402998);
        ((GeneralPath) shape).lineTo(24.070002, 21.578999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.055, 20.36);
        ((GeneralPath) shape).lineTo(43.102, 21.809);
        ((GeneralPath) shape).curveTo(44.066, 18.794, 44.242, 16.727001, 43.621002, 15.602);
        ((GeneralPath) shape).curveTo(43.004, 14.52, 42.305, 14.036, 41.531002, 14.153);
        ((GeneralPath) shape).lineTo(41.883003, 20.649);
        ((GeneralPath) shape).lineTo(42.055004, 20.36);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.949, 31.384);
        ((GeneralPath) shape).curveTo(16.492, 32.274002, 16.996, 32.852, 17.461, 33.122);
        ((GeneralPath) shape).curveTo(17.73, 33.239002, 17.922, 33.278, 18.039, 33.239002);
        ((GeneralPath) shape).lineTo(19.953, 33.009003);
        ((GeneralPath) shape).lineTo(19.776999, 28.599003);
        ((GeneralPath) shape).curveTo(19.624998, 26.239002, 19.394999, 24.497002, 19.081999, 23.376003);
        ((GeneralPath) shape).curveTo(16.453, 24.306004, 14.847999, 25.118004, 14.269999, 25.813004);
        ((GeneralPath) shape).lineTo(15.948998, 31.384003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD66E40));
        g.fill(shape);

        // _0_0_0_53

        // _0_0_0_53_0

        // _0_0_0_53_0_0

        // _0_0_0_53_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.012, 33.009);
        ((GeneralPath) shape).curveTo(19.780998, 32.969997, 19.491999, 32.794, 19.140999, 32.485);
        ((GeneralPath) shape).curveTo(18.366999, 31.907001, 17.612999, 30.977001, 16.878998, 29.7);
        ((GeneralPath) shape).curveTo(15.874998, 27.923, 15.351997, 26.376001, 15.311997, 25.059002);
        ((GeneralPath) shape).curveTo(15.081998, 24.946001, 14.733997, 25.196001, 14.269998, 25.813002);
        ((GeneralPath) shape).curveTo(13.999997, 26.239002, 13.687998, 26.548002, 13.339997, 26.743002);
        ((GeneralPath) shape).lineTo(12.874997, 26.915003);
        ((GeneralPath) shape).curveTo(12.874997, 28.153004, 13.206997, 29.583002, 13.862997, 31.208004);
        ((GeneralPath) shape).curveTo(14.288997, 32.255005, 15.061997, 33.239002, 16.183998, 34.169003);
        ((GeneralPath) shape).curveTo(16.761997, 34.634003, 17.284998, 35.001003, 17.749998, 35.270004);
        ((GeneralPath) shape).lineTo(18.444998, 34.747005);
        ((GeneralPath) shape).curveTo(18.909998, 34.399006, 19.433998, 33.821007, 20.011997, 33.009007);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-5.894999980926514, -29.113000869750977), new Point2D.Double(0.025299999862909317, -29.113000869750977), new float[]{0, 1}, new Color[]{new Color(0xFF543D), new Color(0xB31205)}, NO_CYCLE, SRGB, new AffineTransform(-0.92104f, -0.70552f, -0.70552f, 0.92104f, -6.4415f, 55.166f)));
        g.fill(shape);

        // _0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.027, 24.306);
        ((GeneralPath) shape).lineTo(17.922, 27.208);
        ((GeneralPath) shape).curveTo(17.422, 28.79, 17.613, 29.970001, 18.504002, 30.743);
        ((GeneralPath) shape).curveTo(18.891, 31.056, 19.160002, 31.13, 19.316002, 30.977);
        ((GeneralPath) shape).curveTo(19.508001, 30.821, 19.586002, 30.262999, 19.547003, 29.293999);
        ((GeneralPath) shape).curveTo(19.469004, 27.902998, 19.297003, 26.238998, 19.027002, 24.306);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAD5630));
        g.fill(shape);

        // _0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.852, 24.075);
        ((GeneralPath) shape).curveTo(18.969, 23.763, 19.004, 23.552, 18.969, 23.434);
        ((GeneralPath) shape).lineTo(17.75, 23.841);
        ((GeneralPath) shape).lineTo(15.605, 24.888);
        ((GeneralPath) shape).curveTo(15.679999, 25.544, 15.816, 26.083, 16.012, 26.509);
        ((GeneralPath) shape).curveTo(16.164, 26.895, 16.359, 27.188002, 16.589998, 27.380001);
        ((GeneralPath) shape).curveTo(16.897999, 27.61, 17.151999, 27.61, 17.343998, 27.380001);
        ((GeneralPath) shape).curveTo(17.690998, 27.032001, 18.194998, 25.931002, 18.851997, 24.075);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.91, 28.77);
        ((GeneralPath) shape).lineTo(18.793, 28.075);
        ((GeneralPath) shape).lineTo(18.561998, 29.7);
        ((GeneralPath) shape).curveTo(18.637, 29.817001, 18.734, 29.739, 18.852, 29.470001);
        ((GeneralPath) shape).curveTo(18.929998, 29.196001, 18.949, 28.966002, 18.91, 28.77);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAB782A));
        g.fill(shape);

        // _0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.109, 25.294);
        ((GeneralPath) shape).curveTo(16.762, 25.255001, 16.531, 25.329, 16.414, 25.524);
        ((GeneralPath) shape).curveTo(16.336, 25.677, 16.355, 25.813, 16.473, 25.931);
        ((GeneralPath) shape).curveTo(16.550999, 25.97, 16.688, 25.872, 16.879, 25.640999);
        ((GeneralPath) shape).curveTo(16.956999, 25.523998, 17.035, 25.407, 17.109, 25.293999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.852, 29.177);
        ((GeneralPath) shape).curveTo(18.772999, 28.329, 18.734, 28.368, 18.734, 29.294);
        ((GeneralPath) shape).curveTo(18.695, 29.411001, 18.715, 29.470001, 18.793, 29.470001);
        ((GeneralPath) shape).curveTo(18.870998, 29.470001, 18.890999, 29.372002, 18.852, 29.177002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0BB82));
        g.fill(shape);

        // _0_0_0_59

        // _0_0_0_59_0

        // _0_0_0_59_0_0

        // _0_0_0_59_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.258, 32.622);
        ((GeneralPath) shape).lineTo(18.675999, 32.157);
        ((GeneralPath) shape).curveTo(18.366999, 32.622, 18.098, 33.009003, 17.866999, 33.317);
        ((GeneralPath) shape).curveTo(17.206999, 33.974003, 16.878998, 34.399002, 16.878998, 34.595);
        ((GeneralPath) shape).curveTo(16.917997, 34.825, 17.112997, 34.825, 17.460999, 34.595);
        ((GeneralPath) shape).curveTo(17.808998, 34.399002, 18.116999, 34.13, 18.387, 33.782);
        ((GeneralPath) shape).curveTo(18.772999, 33.47, 19.061998, 33.087, 19.258, 32.622);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(8854.7001953125, -19695), new Point2D.Double(8855.900390625, -19695), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(-0.8685f, -0.76919f, 0.76919f, -0.8685f, 22858, -10259)));
        g.fill(shape);

        // _0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.406, 24.188);
        ((GeneralPath) shape).curveTo(26.027, 23.414999, 26.125, 22.72, 25.695, 22.102);
        ((GeneralPath) shape).curveTo(25.272999, 21.793999, 24.848, 21.578999, 24.421999, 21.466);
        ((GeneralPath) shape).lineTo(23.144999, 21.348999);
        ((GeneralPath) shape).lineTo(23.319998, 20.477);
        ((GeneralPath) shape).curveTo(23.472998, 19.859999, 23.647997, 19.434, 23.839998, 19.199999);
        ((GeneralPath) shape).curveTo(24.151999, 18.852, 24.304998, 18.640999, 24.304998, 18.563);
        ((GeneralPath) shape).lineTo(23.262, 17.927);
        ((GeneralPath) shape).curveTo(22.875, 18.583, 22.487999, 19.259, 22.102, 19.958);
        ((GeneralPath) shape).curveTo(21.328, 21.388, 20.921999, 22.2, 20.883, 22.391);
        ((GeneralPath) shape).curveTo(20.844, 22.817001, 21.074, 23.395, 21.578, 24.134);
        ((GeneralPath) shape).curveTo(21.811998, 24.481, 22.061998, 24.809, 22.331999, 25.118);
        ((GeneralPath) shape).lineTo(23.550999, 25.059);
        ((GeneralPath) shape).curveTo(24.440998, 24.907, 25.058998, 24.614, 25.405998, 24.188);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7A6227));
        g.fill(shape);

        // _0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.836, 19.548);
        ((GeneralPath) shape).lineTo(19.953001, 22.391);
        ((GeneralPath) shape).curveTo(20.227001, 22.970001, 20.477001, 23.395, 20.707, 23.669);
        ((GeneralPath) shape).curveTo(21.211, 24.247, 21.402, 23.841002, 21.289001, 22.45);
        ((GeneralPath) shape).curveTo(21.211002, 21.056, 20.941002, 20.149, 20.477001, 19.724);
        ((GeneralPath) shape).curveTo(20.242, 19.528002, 20.031002, 19.470001, 19.836, 19.548);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.348, 23.145);
        ((GeneralPath) shape).curveTo(25.465, 22.606, 25.328, 22.181, 24.941, 21.868);
        ((GeneralPath) shape).curveTo(24.477, 21.481, 23.742, 21.329, 22.737999, 21.407);
        ((GeneralPath) shape).lineTo(22.855, 20.649);
        ((GeneralPath) shape).curveTo(23.008, 20.11, 23.164, 19.665, 23.32, 19.317);
        ((GeneralPath) shape).lineTo(23.781, 18.505);
        ((GeneralPath) shape).lineTo(22.738, 17.980999);
        ((GeneralPath) shape).curveTo(22.273, 17.712, 22.004002, 17.515999, 21.926, 17.403);
        ((GeneralPath) shape).lineTo(21.637001, 18.911);
        ((GeneralPath) shape).lineTo(20.883001, 20.883999);
        ((GeneralPath) shape).lineTo(20.359001, 19.547998);
        ((GeneralPath) shape).curveTo(19.934002, 18.852, 19.453001, 18.871998, 18.910002, 19.605999);
        ((GeneralPath) shape).curveTo(18.406002, 20.418999, 18.543001, 21.480999, 19.316002, 22.797998);
        ((GeneralPath) shape).curveTo(19.859001, 23.762999, 20.574001, 24.402998, 21.461002, 24.711998);
        ((GeneralPath) shape).curveTo(22.312002, 25.019999, 23.145002, 24.980997, 23.957003, 24.594997);
        ((GeneralPath) shape).curveTo(24.730003, 24.207998, 25.195004, 23.726997, 25.348003, 23.144997);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDED8A0));
        g.fill(shape);

        // _0_0_0_63
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.738, 21.407);
        ((GeneralPath) shape).curveTo(22.660002, 21.559, 22.602001, 21.755, 22.562, 21.984999);
        ((GeneralPath) shape).curveTo(22.488, 22.371998, 22.562, 22.621998, 22.797, 22.738998);
        ((GeneralPath) shape).curveTo(23.066, 22.894999, 23.281, 22.914999, 23.434, 22.797998);
        ((GeneralPath) shape).curveTo(23.59, 22.72, 23.59, 22.566998, 23.434, 22.332998);
        ((GeneralPath) shape).curveTo(23.395, 22.258999, 23.262, 22.140999, 23.027, 21.984999);
        ((GeneralPath) shape).curveTo(22.875, 21.907, 22.777, 21.716, 22.738, 21.407);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x968F48));
        g.fill(shape);

        // _0_0_0_64
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.883, 20.708);
        ((GeneralPath) shape).curveTo(20.805, 20.825, 20.668, 20.845, 20.477, 20.766);
        ((GeneralPath) shape).curveTo(20.206999, 20.688002, 20.012, 20.669, 19.894999, 20.708);
        ((GeneralPath) shape).curveTo(19.703, 20.747, 19.683998, 20.884, 19.835999, 21.114);
        ((GeneralPath) shape).curveTo(19.953, 21.384, 20.128998, 21.52, 20.359, 21.52);
        ((GeneralPath) shape).curveTo(20.668, 21.52, 20.844, 21.251001, 20.883, 20.708);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_65
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.859, 28.657);
        ((GeneralPath) shape).lineTo(33.934, 29.876);
        ((GeneralPath) shape).curveTo(36.758, 29.72, 38.246, 29.505, 38.401997, 29.234999);
        ((GeneralPath) shape).curveTo(38.554996, 28.966, 38.573997, 28.269999, 38.460995, 27.144999);
        ((GeneralPath) shape).curveTo(38.382996, 26.876, 38.128994, 26.703999, 37.702995, 26.626);
        ((GeneralPath) shape).curveTo(37.433994, 26.587, 37.046997, 26.626, 36.542995, 26.743);
        ((GeneralPath) shape).lineTo(35.847996, 26.974);
        ((GeneralPath) shape).lineTo(35.386997, 25.235);
        ((GeneralPath) shape).curveTo(35.151997, 24.384, 34.766, 23.552, 34.226997, 22.739);
        ((GeneralPath) shape).curveTo(34.069996, 22.934, 33.819996, 23.106, 33.472996, 23.263);
        ((GeneralPath) shape).curveTo(33.276997, 23.341, 33.046997, 23.36, 32.772995, 23.317001);
        ((GeneralPath) shape).lineTo(32.366997, 23.263);
        ((GeneralPath) shape).lineTo(32.019997, 24.188);
        ((GeneralPath) shape).lineTo(33.874996, 25.524);
        ((GeneralPath) shape).lineTo(33.991997, 27.962);
        ((GeneralPath) shape).lineTo(33.296997, 27.208);
        ((GeneralPath) shape).curveTo(33.026997, 26.895, 32.659996, 26.778, 32.194996, 26.856);
        ((GeneralPath) shape).lineTo(31.554996, 27.091002);
        ((GeneralPath) shape).lineTo(30.858997, 28.657001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7A6227));
        g.fill(shape);

        // _0_0_0_66
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.355, 28.134);
        ((GeneralPath) shape).curveTo(32.117, 27.516, 31.305, 27.595001, 30.918, 28.368);
        ((GeneralPath) shape).curveTo(30.644999, 28.985, 30.741999, 29.661, 31.206999, 30.395);
        ((GeneralPath) shape).curveTo(31.671999, 31.169, 32.288998, 31.673, 33.062, 31.907);
        ((GeneralPath) shape).curveTo(35.074, 32.524, 36.562, 32.274, 37.531, 31.149);
        ((GeneralPath) shape).curveTo(38.108997, 30.532, 38.418, 29.837, 38.456997, 29.063);
        ((GeneralPath) shape).curveTo(38.496, 28.368, 38.358997, 27.903, 38.051, 27.668999);
        ((GeneralPath) shape).curveTo(37.858997, 27.515999, 37.413998, 27.515999, 36.718998, 27.668999);
        ((GeneralPath) shape).lineTo(35.671997, 27.961998);
        ((GeneralPath) shape).lineTo(34.163998, 23.840998);
        ((GeneralPath) shape).curveTo(33.738, 24.035997, 33.311996, 24.133997, 32.891, 24.133997);
        ((GeneralPath) shape).lineTo(32.02, 24.191998);
        ((GeneralPath) shape).curveTo(32.676, 25.390997, 33.062, 26.238998, 33.18, 26.742998);
        ((GeneralPath) shape).lineTo(33.355, 28.133999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDED8A0));
        g.fill(shape);

        // _0_0_0_67
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.355, 28.368);
        ((GeneralPath) shape).curveTo(33.043, 28.946, 32.753998, 29.255, 32.484, 29.294);
        ((GeneralPath) shape).curveTo(32.211002, 29.294, 32.172, 29.470001, 32.367, 29.817001);
        ((GeneralPath) shape).curveTo(32.52, 30.126001, 32.754, 30.224, 33.062, 30.106);
        ((GeneralPath) shape).curveTo(33.527, 29.915, 33.625, 29.333, 33.355, 28.368);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x968F48));
        g.fill(shape);

        // _0_0_0_68
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.676, 28.192);
        ((GeneralPath) shape).lineTo(36.141, 29.118);
        ((GeneralPath) shape).curveTo(36.523, 29.7, 36.91, 29.895, 37.301, 29.7);
        ((GeneralPath) shape).curveTo(37.723, 29.505001, 37.84, 29.255001, 37.648, 28.946001);
        ((GeneralPath) shape).curveTo(37.413998, 28.638, 37.125, 28.481, 36.777, 28.481);
        ((GeneralPath) shape).curveTo(36.469, 28.559, 36.273, 28.599, 36.195, 28.599);
        ((GeneralPath) shape).curveTo(36.082, 28.599, 35.906, 28.462002, 35.676, 28.192001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_69
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.387, 28.427);
        ((GeneralPath) shape).lineTo(15.371, 28.134);
        ((GeneralPath) shape).curveTo(16.027, 27.864, 16.242, 27.516, 16.008, 27.091002);
        ((GeneralPath) shape).curveTo(15.66, 26.395002, 15.077999, 26.083002, 14.2699995, 26.161001);
        ((GeneralPath) shape).lineTo(14.2109995, 22.681002);
        ((GeneralPath) shape).lineTo(12.992, 22.681002);
        ((GeneralPath) shape).lineTo(12.992, 23.263002);
        ((GeneralPath) shape).curveTo(13.030999, 23.532001, 12.953, 24.056002, 12.757999, 24.829002);
        ((GeneralPath) shape).lineTo(12.526999, 25.931002);
        ((GeneralPath) shape).lineTo(11.945, 25.583002);
        ((GeneralPath) shape).curveTo(11.172, 25.196003, 10.476999, 25.118002, 9.858999, 25.349003);
        ((GeneralPath) shape).curveTo(9.3949995, 25.466003, 9.0859995, 25.813004, 8.929999, 26.395002);
        ((GeneralPath) shape).curveTo(8.776999, 27.091002, 9.026999, 27.806002, 9.683999, 28.540003);
        ((GeneralPath) shape).curveTo(10.726999, 29.661003, 12.179999, 30.243002, 14.034999, 30.278004);
        ((GeneralPath) shape).lineTo(14.265999, 29.759005);
        ((GeneralPath) shape).lineTo(14.1519985, 29.235004);
        ((GeneralPath) shape).curveTo(14.034999, 28.888004, 14.112999, 28.618004, 14.386998, 28.427004);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7A6227));
        g.fill(shape);

        // _0_0_0_70
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.848, 29.063);
        ((GeneralPath) shape).curveTo(11.811999, 29.837, 12.8949995, 30.243, 14.094, 30.278);
        ((GeneralPath) shape).curveTo(15.215, 30.317, 16.008, 30.048, 16.473, 29.47);
        ((GeneralPath) shape).curveTo(16.859, 28.966, 16.956999, 28.422998, 16.765999, 27.845);
        ((GeneralPath) shape).curveTo(16.57, 27.302, 16.241999, 26.934, 15.7769985, 26.743);
        ((GeneralPath) shape).curveTo(15.468999, 26.626, 15.179998, 26.567, 14.905998, 26.567);
        ((GeneralPath) shape).lineTo(14.616999, 26.567);
        ((GeneralPath) shape).lineTo(14.792998, 24.477);
        ((GeneralPath) shape).lineTo(15.257998, 22.797998);
        ((GeneralPath) shape).lineTo(13.632998, 22.102);
        ((GeneralPath) shape).curveTo(13.515999, 22.567, 13.417998, 23.184, 13.339998, 23.958);
        ((GeneralPath) shape).lineTo(13.226998, 26.048);
        ((GeneralPath) shape).curveTo(11.483998, 25.157, 10.538999, 25.099, 10.382998, 25.872);
        ((GeneralPath) shape).curveTo(10.112998, 26.105999, 9.937999, 26.434, 9.858998, 26.855999);
        ((GeneralPath) shape).curveTo(9.667998, 27.633999, 9.995998, 28.367998, 10.847999, 29.063);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDED8A0));
        g.fill(shape);

        // _0_0_0_71
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.703, 26.626);
        ((GeneralPath) shape).curveTo(12.625, 26.664999, 12.43, 26.605999, 12.121, 26.449999);
        ((GeneralPath) shape).curveTo(11.852, 26.376, 11.695001, 26.433998, 11.66, 26.626);
        ((GeneralPath) shape).curveTo(11.582, 26.855999, 11.641, 27.052, 11.832, 27.208);
        ((GeneralPath) shape).curveTo(12.026999, 27.321001, 12.297, 27.36, 12.6449995, 27.321001);
        ((GeneralPath) shape).curveTo(13.108999, 27.208, 13.301, 26.782001, 13.226999, 26.048);
        ((GeneralPath) shape).curveTo(13.188, 26.356, 13.011999, 26.548, 12.702999, 26.626);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x968F48));
        g.fill(shape);

        // _0_0_0_72
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.617, 26.567);
        ((GeneralPath) shape).curveTo(14.5, 27.071, 14.598, 27.477, 14.905999, 27.786);
        ((GeneralPath) shape).curveTo(15.140999, 28.015999, 15.331999, 28.133999, 15.487999, 28.133999);
        ((GeneralPath) shape).curveTo(15.640999, 28.133999, 15.698999, 28.015999, 15.659999, 27.786);
        ((GeneralPath) shape).curveTo(15.620999, 27.633999, 15.507998, 27.515999, 15.311999, 27.438);
        ((GeneralPath) shape).curveTo(15.120999, 27.36, 14.983999, 27.265999, 14.905999, 27.149);
        ((GeneralPath) shape).lineTo(14.617, 26.567);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.891, 17.462);
        ((GeneralPath) shape).curveTo(11.465, 18.427, 11.234, 19.298, 11.195, 20.071);
        ((GeneralPath) shape).lineTo(11.254, 21.001);
        ((GeneralPath) shape).lineTo(11.891, 23.841);
        ((GeneralPath) shape).lineTo(14.617, 22.390999);
        ((GeneralPath) shape).curveTo(16.086, 21.617998, 17.129, 20.863998, 17.75, 20.13);
        ((GeneralPath) shape).lineTo(16.703, 17.168999);
        ((GeneralPath) shape).curveTo(15.890999, 15.160999, 15.311999, 13.9419985, 14.964999, 13.515999);
        ((GeneralPath) shape).lineTo(11.890999, 17.461998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD66E40));
        g.fill(shape);

        // _0_0_0_74

        // _0_0_0_74_0

        // _0_0_0_74_0_0

        // _0_0_0_74_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.891, 23.841);
        ((GeneralPath) shape).lineTo(12.007999, 22.390999);
        ((GeneralPath) shape).curveTo(12.16, 21.152998, 12.546999, 19.836998, 13.167999, 18.446);
        ((GeneralPath) shape).curveTo(14.054999, 16.433998, 14.905999, 15.254999, 15.719, 14.907);
        ((GeneralPath) shape).lineTo(15.602, 14.500999);
        ((GeneralPath) shape).curveTo(15.488, 14.191999, 15.273001, 13.863999, 14.965, 13.516);
        ((GeneralPath) shape).curveTo(14.461, 12.974, 14.113, 12.375999, 13.922, 11.716);
        ((GeneralPath) shape).curveTo(13.148, 11.988999, 12.336, 12.837, 11.484, 14.2699995);
        ((GeneralPath) shape).curveTo(10.941, 15.160999, 10.52, 16.552, 10.207001, 18.446);
        ((GeneralPath) shape).lineTo(9.918001, 21.056);
        ((GeneralPath) shape).lineTo(10.383001, 21.927);
        ((GeneralPath) shape).curveTo(10.613001, 22.313, 10.926002, 22.739, 11.309001, 23.204);
        ((GeneralPath) shape).lineTo(11.891001, 23.841);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(31.746000289916992, -2.311000108718872), new Point2D.Double(39.34199905395508, -2.311000108718872), new float[]{0, 1}, new Color[]{new Color(0xFF543D), new Color(0xB31205)}, NO_CYCLE, SRGB, new AffineTransform(0.45056f, -1.0691f, -1.0691f, -0.45056f, -6.4406f, 55.167f)));
        g.fill(shape);

        // _0_0_0_75
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.109, 20.188);
        ((GeneralPath) shape).curveTo(16.57, 19.914999, 15.874999, 19.626, 15.022999, 19.317);
        ((GeneralPath) shape).curveTo(13.862999, 18.931, 13.167999, 19.508999, 12.933999, 21.056);
        ((GeneralPath) shape).curveTo(12.819999, 21.716, 12.839999, 22.140999, 12.991999, 22.333);
        ((GeneralPath) shape).curveTo(13.147999, 22.567, 13.515999, 22.528, 14.093999, 22.216);
        ((GeneralPath) shape).curveTo(14.944999, 21.793999, 15.948999, 21.114, 17.109, 20.188);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAD5630));
        g.fill(shape);

        // _0_0_0_76
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.633, 19.954);
        ((GeneralPath) shape).lineTo(15.8949995, 15.196001);
        ((GeneralPath) shape).curveTo(15.507999, 15.509001, 15.195, 15.876001, 14.964999, 16.302002);
        ((GeneralPath) shape).curveTo(14.421999, 17.266003, 14.362999, 18.001001, 14.789, 18.505001);
        ((GeneralPath) shape).curveTo(14.945, 18.774, 15.41, 19.106, 16.184, 19.489);
        ((GeneralPath) shape).lineTo(17.227, 19.954);
        ((GeneralPath) shape).curveTo(17.421999, 20.032, 17.554998, 20.032, 17.633, 19.954);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_77
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.27, 21.173);
        ((GeneralPath) shape).lineTo(14.676001, 20.825);
        ((GeneralPath) shape).curveTo(14.02, 20.708, 13.668, 20.747002, 13.629001, 20.942001);
        ((GeneralPath) shape).curveTo(13.594001, 21.099, 13.652, 21.192001, 13.805, 21.231);
        ((GeneralPath) shape).curveTo(14.0, 21.309, 14.152, 21.29, 14.27, 21.173);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAB782A));
        g.fill(shape);

        // _0_0_0_78
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.008, 17.634);
        ((GeneralPath) shape).curveTo(15.933999, 16.821001, 15.757999, 16.552, 15.487999, 16.821001);
        ((GeneralPath) shape).curveTo(15.448999, 16.938002, 15.5269985, 17.114, 15.718999, 17.345001);
        ((GeneralPath) shape).lineTo(16.008, 17.634);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_79
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.035, 21.173);
        ((GeneralPath) shape).curveTo(14.2699995, 21.056, 14.23, 21.001, 13.922, 21.001);
        ((GeneralPath) shape).curveTo(13.805, 21.001, 13.766, 21.056, 13.805, 21.173);
        ((GeneralPath) shape).curveTo(13.844, 21.251, 13.922, 21.251, 14.035, 21.173);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0BB82));
        g.fill(shape);

        // _0_0_0_80

        // _0_0_0_80_0

        // _0_0_0_80_0_0

        // _0_0_0_80_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.938, 22.688);
        ((GeneralPath) shape).lineTo(12.108999, 21.640999);
        ((GeneralPath) shape).curveTo(11.723, 21.332998, 11.414, 21.023998, 11.179999, 20.716);
        ((GeneralPath) shape).curveTo(11.065999, 20.52, 10.870999, 20.251, 10.601999, 19.903);
        ((GeneralPath) shape).curveTo(10.405999, 19.669, 10.254, 19.575, 10.136999, 19.614);
        ((GeneralPath) shape).curveTo(9.983999, 19.688, 10.0199995, 19.977001, 10.253999, 20.481);
        ((GeneralPath) shape).curveTo(10.444999, 20.907001, 10.698998, 21.313002, 11.007998, 21.7);
        ((GeneralPath) shape).curveTo(11.315998, 22.165, 11.624998, 22.493, 11.937999, 22.688002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-2861.800048828125, -11609), new Point2D.Double(-2859.39990234375, -11609), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(0.53831f, -1.0277f, 1.0277f, 0.53831f, 13481, 3331)));
        g.fill(shape);

        // _0_0_0_81
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.613, 25.989);
        ((GeneralPath) shape).lineTo(33.062, 24.364);
        ((GeneralPath) shape).curveTo(33.062, 23.938, 32.715, 23.493, 32.02, 23.028);
        ((GeneralPath) shape).curveTo(31.363, 22.528, 30.57, 22.044, 29.641, 21.579);
        ((GeneralPath) shape).lineTo(28.539001, 21.056);
        ((GeneralPath) shape).lineTo(27.902002, 20.883999);
        ((GeneralPath) shape).lineTo(31.613003, 25.988998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBD502F));
        g.fill(shape);

        // _0_0_0_82
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.957, 28.481);
        ((GeneralPath) shape).curveTo(28.695002, 28.329, 29.352001, 28.075, 29.93, 27.727001);
        ((GeneralPath) shape).curveTo(30.781, 27.188002, 31.305, 26.415, 31.496, 25.407001);
        ((GeneralPath) shape).curveTo(31.535, 25.059002, 31.402, 24.266, 31.09, 23.028002);
        ((GeneralPath) shape).lineTo(30.164, 22.161001);
        ((GeneralPath) shape).curveTo(29.777, 21.849, 29.022999, 21.427002, 27.902, 20.884);
        ((GeneralPath) shape).curveTo(27.746, 21.849, 27.516, 22.739, 27.203001, 23.552);
        ((GeneralPath) shape).curveTo(26.973001, 24.095, 26.703001, 24.981, 26.395, 26.22);
        ((GeneralPath) shape).lineTo(25.988, 27.903);
        ((GeneralPath) shape).lineTo(26.684, 28.539999);
        ((GeneralPath) shape).curveTo(26.914, 28.617998, 27.34, 28.598999, 27.957, 28.480999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEB7855));
        g.fill(shape);

        // _0_0_0_83

        // _0_0_0_83_0

        // _0_0_0_83_0_0

        // _0_0_0_83_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.902, 30.454);
        ((GeneralPath) shape).lineTo(28.887001, 30.165);
        ((GeneralPath) shape).curveTo(29.699001, 29.778002, 30.492, 29.161001, 31.266, 28.309002);
        ((GeneralPath) shape).curveTo(31.883001, 27.649002, 32.484, 26.337002, 33.062, 24.364002);
        ((GeneralPath) shape).curveTo(33.102, 24.130003, 32.871, 23.841002, 32.367, 23.493002);
        ((GeneralPath) shape).curveTo(32.059002, 23.263002, 31.75, 23.126001, 31.441, 23.087002);
        ((GeneralPath) shape).lineTo(31.09, 23.028002);
        ((GeneralPath) shape).lineTo(30.453001, 24.712002);
        ((GeneralPath) shape).curveTo(30.066002, 25.641003, 29.176, 26.548002, 27.785002, 27.438002);
        ((GeneralPath) shape).curveTo(27.242002, 27.747002, 26.777002, 27.923002, 26.395002, 27.962002);
        ((GeneralPath) shape).lineTo(25.988003, 27.903002);
        ((GeneralPath) shape).curveTo(25.945004, 27.981, 26.062002, 28.29, 26.336002, 28.833002);
        ((GeneralPath) shape).curveTo(26.797003, 29.759003, 27.320002, 30.302002, 27.902002, 30.454002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(36.52299880981445, -0.25), new Point2D.Double(43.4109992980957, -0.25), new float[]{0, 1}, new Color[]{new Color(0xFF543D), new Color(0xB31205)}, NO_CYCLE, SRGB, new AffineTransform(0.90968f, -0.72016f, -0.72016f, -0.90968f, -6.4403f, 55.166f)));
        g.fill(shape);

        // _0_0_0_84

        // _0_0_0_84_0

        // _0_0_0_84_0_0

        // _0_0_0_84_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.898, 28.575);
        ((GeneralPath) shape).curveTo(26.664001, 28.845001, 26.762001, 29.177, 27.188002, 29.559);
        ((GeneralPath) shape).curveTo(27.613, 29.911, 28.117002, 30.024, 28.695002, 29.911);
        ((GeneralPath) shape).curveTo(29.277002, 29.793999, 29.738, 29.559, 30.086002, 29.212);
        ((GeneralPath) shape).curveTo(30.438002, 28.903, 30.609003, 28.575, 30.609003, 28.227);
        ((GeneralPath) shape).curveTo(30.609003, 27.841, 30.125004, 27.644999, 29.160004, 27.644999);
        ((GeneralPath) shape).curveTo(28.117004, 27.644999, 27.363003, 27.957998, 26.898003, 28.574999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(-3261.5, -6474.2001953125), new Point2D.Double(-3258.5, -6474.2001953125), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(0.93161f, -0.69146f, 0.69146f, 0.93161f, 7541.2f, 3806.5f)));
        g.fill(shape);

        // _0_0_0_85
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.449, 26.974);
        ((GeneralPath) shape).curveTo(26.449, 27.282001, 26.684, 27.302, 27.144999, 27.032001);
        ((GeneralPath) shape).curveTo(27.569998, 26.802002, 27.843998, 26.489002, 27.956999, 26.102001);
        ((GeneralPath) shape).curveTo(28.269999, 24.942001, 28.343998, 23.782001, 28.190998, 22.622002);
        ((GeneralPath) shape).curveTo(28.151999, 22.083002, 28.034998, 21.579002, 27.843998, 21.114002);
        ((GeneralPath) shape).curveTo(27.843998, 21.888002, 27.706999, 22.583002, 27.437998, 23.204002);
        ((GeneralPath) shape).curveTo(27.011997, 24.016003, 26.702997, 25.040003, 26.507998, 26.278002);
        ((GeneralPath) shape).lineTo(26.448997, 26.974);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAD5630));
        g.fill(shape);

        // _0_0_0_86
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(28.309, 21.579);
        ((GeneralPath) shape).curveTo(28.191, 21.427, 28.539, 22.470001, 29.352, 24.712);
        ((GeneralPath) shape).curveTo(29.508, 24.946, 29.719, 24.888, 29.991999, 24.536);
        ((GeneralPath) shape).curveTo(30.223, 24.188, 30.319998, 23.786, 30.280998, 23.321);
        ((GeneralPath) shape).curveTo(30.241999, 22.934, 29.948997, 22.587, 29.409998, 22.278);
        ((GeneralPath) shape).lineTo(28.308998, 21.579);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_87
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.32, 24.829);
        ((GeneralPath) shape).curveTo(27.242, 24.981, 27.188, 25.157, 27.145, 25.349);
        ((GeneralPath) shape).curveTo(27.07, 25.696001, 27.09, 25.931002, 27.203001, 26.048);
        ((GeneralPath) shape).curveTo(27.438002, 26.278, 27.555, 26.122, 27.555, 25.583);
        ((GeneralPath) shape).curveTo(27.555, 25.427, 27.477001, 25.177, 27.32, 24.829);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xC48A30));
        g.fill(shape);

        // _0_0_0_88
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.062, 22.856);
        ((GeneralPath) shape).curveTo(29.102001, 23.087002, 29.16, 23.302, 29.234001, 23.493);
        ((GeneralPath) shape).curveTo(29.352001, 23.88, 29.488, 23.997, 29.641, 23.841);
        ((GeneralPath) shape).curveTo(29.875, 23.609999, 29.68, 23.282, 29.062, 22.855999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_89
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.203, 26.048);
        ((GeneralPath) shape).curveTo(27.359, 26.317, 27.438, 26.239, 27.438, 25.813);
        ((GeneralPath) shape).curveTo(27.438, 25.657, 27.379, 25.505, 27.262, 25.348999);
        ((GeneralPath) shape).lineTo(27.203, 26.047998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0BB82));
        g.fill(shape);

        // _0_0_0_90
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.41, 23.727);
        ((GeneralPath) shape).curveTo(29.602, 23.571, 29.527, 23.376, 29.176, 23.144999);
        ((GeneralPath) shape).curveTo(29.176, 23.262999, 29.195, 23.376, 29.234001, 23.492998);
        ((GeneralPath) shape).curveTo(29.273, 23.726997, 29.332, 23.801998, 29.410002, 23.726997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_91
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.219, 12.763);
        ((GeneralPath) shape).lineTo(26.566, 21.056);
        ((GeneralPath) shape).lineTo(26.914, 20.247);
        ((GeneralPath) shape).lineTo(27.379, 18.505);
        ((GeneralPath) shape).curveTo(27.609, 17.809, 27.883, 16.532, 28.191, 14.676999);
        ((GeneralPath) shape).curveTo(28.387, 13.515999, 28.367, 12.762999, 28.133, 12.414999);
        ((GeneralPath) shape).lineTo(26.219, 12.762999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xBD502F));
        g.fill(shape);

        // _0_0_0_92
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.566, 21.056);
        ((GeneralPath) shape).lineTo(27.379, 17.462);
        ((GeneralPath) shape).lineTo(27.555, 15.72);
        ((GeneralPath) shape).curveTo(27.051, 14.368, 26.684, 13.595, 26.453001, 13.399);
        ((GeneralPath) shape).curveTo(25.754002, 12.743, 24.965, 12.704, 24.070002, 13.282001);
        ((GeneralPath) shape).curveTo(23.453001, 13.669001, 22.875002, 14.212001, 22.332, 14.907001);
        ((GeneralPath) shape).curveTo(21.828001, 15.524, 21.539001, 15.993, 21.461, 16.302);
        ((GeneralPath) shape).lineTo(21.289, 17.575);
        ((GeneralPath) shape).curveTo(21.675999, 17.845001, 22.102, 18.138, 22.562, 18.446001);
        ((GeneralPath) shape).curveTo(23.492, 19.102001, 24.168, 19.528002, 24.594, 19.724);
        ((GeneralPath) shape).curveTo(25.289, 20.032001, 25.949, 20.477001, 26.566, 21.056002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xEB7855));
        g.fill(shape);

        // _0_0_0_93

        // _0_0_0_93_0

        // _0_0_0_93_0_0

        // _0_0_0_93_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.172, 13.341);
        ((GeneralPath) shape).curveTo(20.863, 14.153, 20.824001, 15.195999, 21.055, 16.473999);
        ((GeneralPath) shape).lineTo(21.289, 17.574999);
        ((GeneralPath) shape).lineTo(21.52, 17.056);
        ((GeneralPath) shape).curveTo(21.828001, 16.669, 22.254, 16.302, 22.797, 15.9539995);
        ((GeneralPath) shape).curveTo(23.570002, 15.488999, 24.168001, 15.2, 24.594002, 15.082999);
        ((GeneralPath) shape).curveTo(25.137001, 14.888, 25.660002, 14.907, 26.160002, 15.140999);
        ((GeneralPath) shape).curveTo(26.859001, 15.488998, 27.320002, 15.680999, 27.555002, 15.719999);
        ((GeneralPath) shape).lineTo(27.785002, 15.313);
        ((GeneralPath) shape).curveTo(27.941002, 14.927, 28.055002, 14.466, 28.133001, 13.922999);
        ((GeneralPath) shape).curveTo(28.250002, 13.070999, 28.250002, 12.566999, 28.133001, 12.414999);
        ((GeneralPath) shape).curveTo(26.625002, 11.484999, 25.465002, 11.098999, 24.652, 11.254999);
        ((GeneralPath) shape).curveTo(23.648, 11.407, 22.758, 11.812999, 21.984001, 12.473999);
        ((GeneralPath) shape).lineTo(21.172, 13.340999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(26.465999603271484, 32.18199920654297), new Point2D.Double(26.93400001525879, 38.356998443603516), new float[]{0, 1}, new Color[]{new Color(0xFF543D), new Color(0xB31205)}, NO_CYCLE, SRGB, new AffineTransform(1.1602f, 0, 0, -1.1602f, -6.4406f, 55.167f)));
        g.fill(shape);

        // _0_0_0_94

        // _0_0_0_94_0

        // _0_0_0_94_0_0

        // _0_0_0_94_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.645, 16.048);
        ((GeneralPath) shape).curveTo(22.266, 16.009, 22.922, 15.411, 23.617, 14.251);
        ((GeneralPath) shape).curveTo(24.277, 13.165001, 24.508001, 12.47, 24.312, 12.161);
        ((GeneralPath) shape).curveTo(24.121, 11.891, 23.812, 11.813001, 23.387001, 11.931001);
        ((GeneralPath) shape).curveTo(22.922, 12.044001, 22.477001, 12.391001, 22.051, 12.974001);
        ((GeneralPath) shape).curveTo(21.586, 13.516001, 21.316, 14.173001, 21.238, 14.946001);
        ((GeneralPath) shape).curveTo(21.199001, 15.720001, 21.336, 16.087002, 21.645, 16.048);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(1.1405999660491943, 0), new Point2D.Double(1.4607000350952148, -3.0255000591278076), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(1.1602f, 0, 0, 1.1602f, 21.239f, 16.048f)));
        g.fill(shape);

        // _0_0_0_95
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.941, 19.782);
        ((GeneralPath) shape).curveTo(25.484, 19.934, 25.969, 20.321, 26.395, 20.942);
        ((GeneralPath) shape).lineTo(25.812, 19.317);
        ((GeneralPath) shape).curveTo(25.621, 18.931, 25.289, 18.466, 24.828001, 17.927);
        ((GeneralPath) shape).curveTo(24.363, 17.384, 23.977001, 17.016, 23.668001, 16.821);
        ((GeneralPath) shape).curveTo(23.355001, 16.63, 22.988, 16.684, 22.562, 16.997);
        ((GeneralPath) shape).curveTo(22.102001, 17.306, 21.965, 17.574999, 22.16, 17.809);
        ((GeneralPath) shape).curveTo(22.312, 17.962, 22.449, 18.118, 22.562, 18.274);
        ((GeneralPath) shape).curveTo(22.719, 18.427, 23.027, 18.677, 23.492, 19.024);
        ((GeneralPath) shape).curveTo(24.07, 19.415, 24.555, 19.665, 24.941, 19.782);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAD5630));
        g.fill(shape);

        // _0_0_0_96
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.449, 20.071);
        ((GeneralPath) shape).curveTo(26.449, 20.032, 26.566, 19.453999, 26.796999, 18.332998);
        ((GeneralPath) shape).curveTo(26.991999, 17.441998, 26.991999, 16.805998, 26.796999, 16.414999);
        ((GeneralPath) shape).curveTo(26.605, 15.992999, 26.315998, 15.777999, 25.929998, 15.777999);
        ((GeneralPath) shape).curveTo(25.543, 15.8169985, 25.366999, 16.008999, 25.405998, 16.359999);
        ((GeneralPath) shape).curveTo(26.101997, 19.067, 26.448997, 20.301998, 26.448997, 20.071);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_97
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.957, 18.563);
        ((GeneralPath) shape).lineTo(23.723001, 17.633999);
        ((GeneralPath) shape).curveTo(23.414001, 17.324999, 23.242, 17.345, 23.203001, 17.692);
        ((GeneralPath) shape).curveTo(23.203001, 17.927, 23.336, 18.137999, 23.609001, 18.328999);
        ((GeneralPath) shape).lineTo(23.957, 18.562998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xC48A30));
        g.fill(shape);

        // _0_0_0_98
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.219, 18.157);
        ((GeneralPath) shape).curveTo(26.41, 17.149, 26.355, 16.668999, 26.043, 16.704);
        ((GeneralPath) shape).curveTo(25.852, 16.747, 25.831999, 16.997, 25.987999, 17.462);
        ((GeneralPath) shape).lineTo(26.219, 18.157);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_99
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.203, 17.692);
        ((GeneralPath) shape).lineTo(23.668, 18.157);
        ((GeneralPath) shape).lineTo(23.491999, 17.692);
        ((GeneralPath) shape).curveTo(23.262, 17.306, 23.164, 17.306, 23.203, 17.692);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0BB82));
        g.fill(shape);

        // _0_0_0_100
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.043, 17.056);
        ((GeneralPath) shape).curveTo(25.969, 17.095, 25.969, 17.227, 26.043, 17.462);
        ((GeneralPath) shape).lineTo(26.16, 17.809);
        ((GeneralPath) shape).curveTo(26.277, 17.266, 26.237999, 17.016, 26.043, 17.056);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_101
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.129, 21.696);
        ((GeneralPath) shape).lineTo(41.477, 20.883999);
        ((GeneralPath) shape).curveTo(41.707, 20.071, 41.766003, 19.028, 41.648003, 17.751);
        ((GeneralPath) shape).lineTo(40.027004, 11.601999);
        ((GeneralPath) shape).curveTo(39.562004, 11.754999, 38.633003, 12.527999, 37.242004, 13.922999);
        ((GeneralPath) shape).lineTo(35.328003, 16.008999);
        ((GeneralPath) shape).curveTo(35.637, 17.207998, 36.352, 18.734999, 37.473003, 20.595);
        ((GeneralPath) shape).lineTo(39.621002, 24.015999);
        ((GeneralPath) shape).lineTo(41.129, 21.696);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xD66E40));
        g.fill(shape);

        // _0_0_0_102

        // _0_0_0_102_0

        // _0_0_0_102_0_0

        // _0_0_0_102_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.594, 10.614);
        ((GeneralPath) shape).curveTo(41.242, 11.118, 40.723003, 11.446, 40.023003, 11.602);
        ((GeneralPath) shape).curveTo(39.602, 11.677, 39.289, 11.833, 39.098003, 12.063001);
        ((GeneralPath) shape).lineTo(38.863003, 12.415001);
        ((GeneralPath) shape).curveTo(39.562004, 13.380001, 39.988003, 15.161001, 40.141003, 17.751001);
        ((GeneralPath) shape).curveTo(40.258003, 19.567001, 40.199, 21.153002, 39.969, 22.509);
        ((GeneralPath) shape).lineTo(39.562, 24.016);
        ((GeneralPath) shape).lineTo(40.312, 23.841002);
        ((GeneralPath) shape).curveTo(40.855, 23.684002, 41.281002, 23.493002, 41.594, 23.263002);
        ((GeneralPath) shape).lineTo(42.402, 22.739002);
        ((GeneralPath) shape).lineTo(42.926, 19.958002);
        ((GeneralPath) shape).curveTo(43.273, 17.868002, 43.331997, 16.204002, 43.101997, 14.9660015);
        ((GeneralPath) shape).curveTo(42.753998, 12.915001, 42.249996, 11.4660015, 41.593998, 10.614001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(43.55400085449219, 34.972999572753906), new Point2D.Double(37.17499923706055, 29.62700080871582), new float[]{0, 1}, new Color[]{new Color(0xFF543D), new Color(0xB31205)}, NO_CYCLE, SRGB, new AffineTransform(1.1602f, 0, 0, -1.1602f, -6.4406f, 55.167f)));
        g.fill(shape);

        // _0_0_0_103
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.848, 16.532);
        ((GeneralPath) shape).curveTo(36.621, 18.313, 37.336, 19.723999, 37.996, 20.765999);
        ((GeneralPath) shape).curveTo(38.5, 21.501, 38.866997, 21.813, 39.098, 21.696);
        ((GeneralPath) shape).curveTo(39.293, 21.618, 39.426, 21.212, 39.503998, 20.477);
        ((GeneralPath) shape).curveTo(39.811996, 18.813, 39.348, 17.751, 38.113, 17.286);
        ((GeneralPath) shape).lineTo(35.848, 16.532);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAD5630));
        g.fill(shape);

        // _0_0_0_104
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(35.441, 15.954);
        ((GeneralPath) shape).lineTo(35.848003, 16.243);
        ((GeneralPath) shape).lineTo(37.008003, 16.532);
        ((GeneralPath) shape).curveTo(37.820004, 16.723999, 38.363003, 16.765999, 38.633003, 16.649);
        ((GeneralPath) shape).curveTo(39.176003, 16.458, 39.348003, 15.681, 39.156002, 14.329);
        ((GeneralPath) shape).curveTo(39.078003, 13.747001, 38.902, 13.169001, 38.633003, 12.587001);
        ((GeneralPath) shape).lineTo(35.441, 15.954);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_105
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.227, 19.606);
        ((GeneralPath) shape).curveTo(38.305, 19.802, 38.441, 19.938002, 38.633, 20.013);
        ((GeneralPath) shape).curveTo(38.824, 20.091, 38.922, 20.052, 38.922, 19.895);
        ((GeneralPath) shape).curveTo(38.922, 19.665, 38.594, 19.356, 37.938, 18.970001);
        ((GeneralPath) shape).lineTo(38.227, 19.606);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xAB782A));
        g.fill(shape);

        // _0_0_0_106
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.703, 14.849);
        ((GeneralPath) shape).lineTo(38.108997, 14.794);
        ((GeneralPath) shape).curveTo(38.343998, 14.716, 38.476997, 14.618, 38.519997, 14.500999);
        ((GeneralPath) shape).curveTo(38.554996, 14.2699995, 38.499996, 14.153, 38.343998, 14.153);
        ((GeneralPath) shape).curveTo(38.148, 14.114, 37.938, 14.349, 37.703, 14.849);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_107
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(38.461, 19.837);
        ((GeneralPath) shape).curveTo(38.535, 19.993, 38.613, 20.032, 38.690998, 19.954);
        ((GeneralPath) shape).curveTo(38.73, 19.876001, 38.711, 19.802, 38.633, 19.724);
        ((GeneralPath) shape).curveTo(38.516, 19.606, 38.440998, 19.548, 38.402, 19.548);
        ((GeneralPath) shape).curveTo(38.324, 19.509, 38.344, 19.606, 38.461, 19.837);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xE0BB82));
        g.fill(shape);

        // _0_0_0_108

        // _0_0_0_108_0

        // _0_0_0_108_0_0

        // _0_0_0_108_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(39.922, 22.888);
        ((GeneralPath) shape).curveTo(40.305, 22.927, 40.711002, 22.829, 41.137, 22.599);
        ((GeneralPath) shape).curveTo(41.523003, 22.481, 41.891003, 22.27, 42.242, 21.958);
        ((GeneralPath) shape).curveTo(42.59, 21.649, 42.723, 21.419, 42.648, 21.263);
        ((GeneralPath) shape).curveTo(42.57, 21.11, 42.375, 21.067001, 42.065998, 21.145);
        ((GeneralPath) shape).curveTo(41.758, 21.302, 41.508, 21.419, 41.311996, 21.493);
        ((GeneralPath) shape).curveTo(40.964996, 21.61, 40.577995, 21.688, 40.151997, 21.727);
        ((GeneralPath) shape).curveTo(40.073997, 21.88, 40.015995, 22.113998, 39.976997, 22.422998);
        ((GeneralPath) shape).lineTo(39.921997, 22.887999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(1.6943000555038452, -1.3051999807357788), new Point2D.Double(-0.00800000037997961, -0.10849999636411667), new float[]{0, 1}, new Color[]{WHITE, BLACK}, NO_CYCLE, SRGB, new AffineTransform(1.1602f, 0, 0, 1.1602f, 39.92f, 22.887f)));
        g.fill(shape);

        // _0_0_0_109
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.109, 12.587);
        ((GeneralPath) shape).curveTo(13.070001, 12.821, 13.207, 13.341, 13.516, 14.153);
        ((GeneralPath) shape).curveTo(13.632999, 14.427, 13.863, 14.677, 14.2109995, 14.907);
        ((GeneralPath) shape).curveTo(14.558999, 15.141, 14.773, 15.313, 14.848, 15.431);
        ((GeneralPath) shape).curveTo(14.926, 15.544, 15.061999, 15.934, 15.254, 16.591);
        ((GeneralPath) shape).curveTo(15.448999, 17.247, 15.620999, 17.673, 15.776999, 17.864);
        ((GeneralPath) shape).curveTo(15.969, 18.059, 16.184, 18.138, 16.414, 18.099);
        ((GeneralPath) shape).curveTo(16.531, 18.059, 16.727, 18.001001, 16.996, 17.927);
        ((GeneralPath) shape).curveTo(17.227001, 17.927, 17.422, 17.829, 17.574, 17.634);
        ((GeneralPath) shape).curveTo(17.73, 17.442001, 18.019999, 16.977001, 18.445, 16.243);
        ((GeneralPath) shape).curveTo(18.754, 15.626, 18.987999, 15.352, 19.140999, 15.431);
        ((GeneralPath) shape).curveTo(19.644999, 15.660999, 19.914, 15.778, 19.953, 15.778);
        ((GeneralPath) shape).curveTo(20.495998, 15.778, 21.019999, 15.528, 21.519999, 15.024);
        ((GeneralPath) shape).curveTo(21.984, 14.481, 21.964998, 14.095, 21.460999, 13.864);
        ((GeneralPath) shape).curveTo(20.030998, 13.13, 19.163998, 12.704, 18.852, 12.587);
        ((GeneralPath) shape).curveTo(17.191, 11.891, 15.737999, 11.544, 14.499999, 11.544);
        ((GeneralPath) shape).curveTo(13.300999, 11.544, 12.723, 11.660999, 12.761999, 11.891);
        ((GeneralPath) shape).curveTo(13.030999, 12.165, 13.147999, 12.3949995, 13.108999, 12.587);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7BB342));
        g.fill(shape);

        // _0_0_0_110
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(30.047, 17.575);
        ((GeneralPath) shape).curveTo(30.473001, 17.77, 30.762001, 18.001001, 30.918001, 18.274);
        ((GeneralPath) shape).curveTo(31.188002, 18.735, 31.383001, 19.005001, 31.500002, 19.083);
        ((GeneralPath) shape).curveTo(31.652002, 19.239, 31.887001, 19.317, 32.195004, 19.317);
        ((GeneralPath) shape).curveTo(33.043003, 19.317, 33.645004, 19.181, 33.992004, 18.911);
        ((GeneralPath) shape).curveTo(34.070004, 18.872, 34.207005, 18.618, 34.398003, 18.157);
        ((GeneralPath) shape).curveTo(34.555004, 17.809, 34.727, 17.633999, 34.922, 17.633999);
        ((GeneralPath) shape).curveTo(35.074, 17.633999, 35.309002, 17.769999, 35.617, 18.039999);
        ((GeneralPath) shape).curveTo(35.926, 18.348999, 36.176003, 18.505, 36.371002, 18.505);
        ((GeneralPath) shape).curveTo(36.758003, 18.505, 37.164, 18.313, 37.590004, 17.927);
        ((GeneralPath) shape).curveTo(37.395004, 17.657, 37.203003, 17.325, 37.008003, 16.938);
        ((GeneralPath) shape).curveTo(36.621002, 16.204, 36.371002, 15.547999, 36.254, 14.966);
        ((GeneralPath) shape).curveTo(36.215, 14.695999, 36.312, 14.177, 36.543003, 13.398999);
        ((GeneralPath) shape).curveTo(36.699, 12.937999, 36.504, 12.551999, 35.965004, 12.238999);
        ((GeneralPath) shape).curveTo(35.191006, 11.738999, 33.312004, 11.622, 30.336004, 11.891);
        ((GeneralPath) shape).curveTo(27.281004, 12.2039995, 25.754005, 12.782, 25.754005, 13.634);
        ((GeneralPath) shape).curveTo(25.754005, 14.407, 25.965006, 14.735, 26.391005, 14.618);
        ((GeneralPath) shape).curveTo(26.934004, 14.427, 27.320005, 14.524, 27.551004, 14.907);
        ((GeneralPath) shape).curveTo(27.629004, 15.063, 27.824005, 15.469999, 28.133005, 16.126);
        ((GeneralPath) shape).curveTo(28.250006, 16.394999, 28.480005, 16.668999, 28.828005, 16.938);
        ((GeneralPath) shape).curveTo(29.023005, 17.056, 29.430004, 17.265999, 30.047005, 17.574999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_111
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.133, 17.345);
        ((GeneralPath) shape).curveTo(6.98, 17.345, 6.902, 17.515999, 6.902, 17.863998);
        ((GeneralPath) shape).lineTo(6.961, 18.734999);
        ((GeneralPath) shape).lineTo(7.773, 18.97);
        ((GeneralPath) shape).curveTo(8.391, 19.126, 8.988, 19.140999, 9.57, 19.028);
        ((GeneralPath) shape).curveTo(10.422, 18.833, 11.233999, 18.466, 12.007999, 17.927);
        ((GeneralPath) shape).curveTo(12.973, 17.227, 13.594, 16.434, 13.862999, 15.548);
        ((GeneralPath) shape).curveTo(14.132999, 14.657001, 14.210999, 14.001, 14.093999, 13.575001);
        ((GeneralPath) shape).curveTo(14.019999, 13.306001, 13.784999, 13.0130005, 13.397999, 12.704);
        ((GeneralPath) shape).curveTo(12.972999, 12.395, 12.085999, 12.415001, 10.729999, 12.7630005);
        ((GeneralPath) shape).lineTo(10.210999, 11.313001);
        ((GeneralPath) shape).curveTo(9.358998, 11.235001, 8.7769985, 11.602, 8.468999, 12.415001);
        ((GeneralPath) shape).curveTo(8.237999, 12.954, 7.9449987, 13.942001, 7.597999, 15.372001);
        ((GeneralPath) shape).lineTo(7.132999, 17.345001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7A6227));
        g.fill(shape);

        // _0_0_0_112
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.613, 15.2);
        ((GeneralPath) shape).curveTo(5.762, 16.513, 5.723, 17.556, 6.496, 18.333);
        ((GeneralPath) shape).curveTo(7.309, 19.22, 8.816, 18.95, 11.02, 17.516);
        ((GeneralPath) shape).curveTo(12.027, 16.821001, 12.703, 15.915001, 13.051001, 14.794001);
        ((GeneralPath) shape).curveTo(13.359, 13.673, 13.09, 13.130001, 12.238001, 13.169001);
        ((GeneralPath) shape).curveTo(11.504001, 13.208, 10.828001, 13.286, 10.207001, 13.399);
        ((GeneralPath) shape).lineTo(9.512001, 13.575);
        ((GeneralPath) shape).lineTo(9.281001, 13.286);
        ((GeneralPath) shape).curveTo(9.125001, 13.0130005, 9.047001, 12.7630005, 9.047001, 12.532001);
        ((GeneralPath) shape).curveTo(9.086, 12.181001, 8.988001, 11.837001, 8.758001, 11.485001);
        ((GeneralPath) shape).curveTo(8.062001, 11.641001, 7.5590014, 11.891001, 7.2500014, 12.239);
        ((GeneralPath) shape).lineTo(6.7850013, 12.704);
        ((GeneralPath) shape).lineTo(7.0740013, 14.501);
        ((GeneralPath) shape).lineTo(6.6130013, 15.200001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDED8A0));
        g.fill(shape);

        // _0_0_0_113
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.699, 13.806);
        ((GeneralPath) shape).curveTo(8.699, 13.922999, 8.469001, 14.094999, 8.004001, 14.3289995);
        ((GeneralPath) shape).curveTo(7.4610004, 14.558999, 7.1520004, 14.794, 7.074001, 15.023999);
        ((GeneralPath) shape).curveTo(6.996001, 15.410999, 7.055001, 15.699999, 7.250001, 15.8949995);
        ((GeneralPath) shape).curveTo(7.480001, 16.126, 7.750001, 16.105999, 8.062001, 15.837);
        ((GeneralPath) shape).curveTo(8.527001, 15.411, 8.738001, 14.735, 8.699001, 13.806);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x968F48));
        g.fill(shape);

        // _0_0_0_114
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.512, 13.575);
        ((GeneralPath) shape).curveTo(9.785, 13.845, 10.094, 14.0789995, 10.441, 14.2699995);
        ((GeneralPath) shape).curveTo(11.098, 14.657, 11.562, 14.676999, 11.832, 14.3289995);
        ((GeneralPath) shape).curveTo(12.066, 14.056, 11.832, 13.903, 11.137, 13.863999);
        ((GeneralPath) shape).curveTo(10.258, 13.863999, 9.715, 13.766, 9.512, 13.575);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_115
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.66, 16.302);
        ((GeneralPath) shape).curveTo(33.953, 13.673, 32.543, 12.356, 32.426, 12.356);
        ((GeneralPath) shape).curveTo(30.300999, 12.356, 29.061998, 12.684, 28.710999, 13.341);
        ((GeneralPath) shape).curveTo(28.440998, 13.806, 28.421999, 14.403, 28.655998, 15.141);
        ((GeneralPath) shape).curveTo(28.847998, 15.837, 29.175999, 16.337, 29.640999, 16.649);
        ((GeneralPath) shape).curveTo(30.644999, 17.306, 31.862999, 17.614, 33.296997, 17.575);
        ((GeneralPath) shape).curveTo(34.839996, 17.501001, 35.866997, 17.247002, 36.371, 16.821001);
        ((GeneralPath) shape).curveTo(36.562, 16.669, 36.66, 16.552002, 36.66, 16.474);
        ((GeneralPath) shape).lineTo(36.66, 16.302);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7A6227));
        g.fill(shape);

        // _0_0_0_116
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(29.641, 13.458);
        ((GeneralPath) shape).curveTo(29.523, 13.806, 29.488, 14.212, 29.523, 14.677);
        ((GeneralPath) shape).curveTo(29.602001, 15.563, 30.027, 16.224, 30.801, 16.649);
        ((GeneralPath) shape).curveTo(31.691, 17.149, 32.852, 17.384, 34.281002, 17.345);
        ((GeneralPath) shape).curveTo(35.676003, 17.265999, 36.543003, 16.977, 36.895, 16.473999);
        ((GeneralPath) shape).curveTo(37.281002, 15.933999, 37.414, 15.390999, 37.301, 14.848999);
        ((GeneralPath) shape).curveTo(37.223, 14.230999, 36.895, 13.805999, 36.312, 13.574999);
        ((GeneralPath) shape).lineTo(34.398, 13.168999);
        ((GeneralPath) shape).lineTo(34.281, 11.890999);
        ((GeneralPath) shape).lineTo(32.309, 11.715999);
        ((GeneralPath) shape).lineTo(32.253998, 12.8169985);
        ((GeneralPath) shape).curveTo(30.667997, 12.781999, 29.796997, 12.992998, 29.640999, 13.457998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xDED8A0));
        g.fill(shape);

        // _0_0_0_117
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(33.527, 12.704);
        ((GeneralPath) shape).curveTo(33.258, 12.587001, 32.715, 12.606001, 31.902, 12.7630005);
        ((GeneralPath) shape).curveTo(31.285, 12.837001, 31.09, 13.13, 31.324001, 13.634001);
        ((GeneralPath) shape).curveTo(31.516, 14.134001, 31.844002, 14.349001, 32.309002, 14.27);
        ((GeneralPath) shape).curveTo(32.852, 14.192, 33.258003, 13.669001, 33.527, 12.704);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x968F48));
        g.fill(shape);

        // _0_0_0_118
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(34.398, 12.821);
        ((GeneralPath) shape).curveTo(34.242, 12.665, 34.34, 12.954, 34.688, 13.692);
        ((GeneralPath) shape).curveTo(34.961, 14.349, 35.27, 14.696, 35.617, 14.735001);
        ((GeneralPath) shape).curveTo(36.0, 14.774, 36.137, 14.618001, 36.023, 14.27);
        ((GeneralPath) shape).curveTo(35.945, 13.962001, 35.788998, 13.727, 35.559, 13.575001);
        ((GeneralPath) shape).curveTo(34.863, 13.188001, 34.476997, 12.934001, 34.398, 12.821001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_119

        // _0_0_0_119_0

        // _0_0_0_119_0_0

        // _0_0_0_119_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(45.305, 16.415);
        ((GeneralPath) shape).lineTo(45.941, 16.415);
        ((GeneralPath) shape).curveTo(45.168003, 11.735001, 42.773003, 7.833001, 38.75, 4.700001);
        ((GeneralPath) shape).curveTo(34.652, 1.5670009, 29.875, 0.0010008812, 24.422, 0.0010008812);
        ((GeneralPath) shape).curveTo(18.969002, 0.0010008812, 14.211, 1.5670009, 10.152, 4.700001);
        ((GeneralPath) shape).curveTo(6.0900006, 7.8330007, 3.6910005, 11.735001, 2.9570003, 16.415);
        ((GeneralPath) shape).lineTo(3.5940003, 16.415);
        ((GeneralPath) shape).curveTo(5.2970004, 14.755001, 8.004, 13.419001, 11.719, 12.415001);
        ((GeneralPath) shape).curveTo(15.547, 11.368001, 19.800999, 10.849001, 24.48, 10.849001);
        ((GeneralPath) shape).curveTo(29.120998, 10.849001, 33.355, 11.368001, 37.184, 12.415001);
        ((GeneralPath) shape).curveTo(40.934, 13.419001, 43.641, 14.755001, 45.305, 16.415);
        ((GeneralPath) shape).closePath();

        g.setPaint(new LinearGradientPaint(new Point2D.Double(4.25, 40.474998474121094), new Point2D.Double(49.25, 40.474998474121094), new float[]{0, 1}, new Color[]{WHITE, new Color(0xA9CAD1)}, NO_CYCLE, SRGB, new AffineTransform(1.1602f, 0, 0, -1.1602f, -6.4406f, 55.167f)));
        g.fill(shape);

        // _0_0_0_120
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(44.898, 17.227);
        ((GeneralPath) shape).lineTo(45.823997, 17.227);
        ((GeneralPath) shape).lineTo(45.882996, 16.649);
        ((GeneralPath) shape).curveTo(45.882996, 14.907001, 43.796997, 13.419001, 39.620995, 12.181);
        ((GeneralPath) shape).curveTo(35.401993, 10.946, 30.335995, 10.325, 24.421993, 10.325);
        ((GeneralPath) shape).curveTo(18.464993, 10.325, 13.397993, 10.946, 9.222993, 12.181);
        ((GeneralPath) shape).curveTo(5.0079927, 13.419, 2.897993, 14.907, 2.897993, 16.649);
        ((GeneralPath) shape).lineTo(3.015993, 17.227);
        ((GeneralPath) shape).lineTo(4.175993, 17.227);
        ((GeneralPath) shape).lineTo(4.116993, 17.056);
        ((GeneralPath) shape).curveTo(4.116993, 15.660999, 6.108993, 14.466, 10.093993, 13.458);
        ((GeneralPath) shape).curveTo(14.112993, 12.454, 18.929993, 11.95, 24.538994, 11.95);
        ((GeneralPath) shape).curveTo(30.144993, 11.95, 34.940994, 12.4539995, 38.921993, 13.458);
        ((GeneralPath) shape).curveTo(42.905994, 14.466001, 44.897995, 15.661, 44.897995, 17.056);
        ((GeneralPath) shape).lineTo(44.897995, 17.227);
        ((GeneralPath) shape).closePath();

        g.setPaint(WHITE);
        g.fill(shape);

        // _0_0_0_121
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(3.711, 15.544);
        ((GeneralPath) shape).curveTo(4.523, 15.816999, 5.395, 15.681, 6.3199997, 15.141);
        ((GeneralPath) shape).curveTo(6.785, 14.868, 7.172, 14.5789995, 7.4799995, 14.2699995);
        ((GeneralPath) shape).curveTo(7.3669996, 14.2699995, 7.2109995, 14.250999, 7.0199995, 14.212);
        ((GeneralPath) shape).curveTo(6.5549994, 14.095, 6.0509996, 13.825, 5.5079994, 13.399);
        ((GeneralPath) shape).curveTo(4.6209993, 12.743, 4.3279996, 11.95, 4.6409993, 11.02);
        ((GeneralPath) shape).lineTo(3.9449992, 12.587001);
        ((GeneralPath) shape).curveTo(3.7109993, 13.634001, 3.6329992, 14.618001, 3.7109993, 15.544001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x7C9FA3));
        g.fill(shape);

        // _0_0_0_122
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.355, 8.876);
        ((GeneralPath) shape).curveTo(12.507999, 9.802, 12.723, 10.481001, 12.992, 10.903);
        ((GeneralPath) shape).curveTo(13.57, 11.602, 15.504, 12.141, 18.793, 12.528);
        ((GeneralPath) shape).curveTo(21.112999, 12.837, 23.105, 12.993, 24.77, 12.993);
        ((GeneralPath) shape).curveTo(25.93, 12.993, 28.035, 12.7630005, 31.09, 12.298);
        ((GeneralPath) shape).curveTo(30.664, 12.298, 30.105, 11.891001, 29.41, 11.079);
        ((GeneralPath) shape).curveTo(29.176, 10.77, 28.612999, 10.286, 27.727, 9.63);
        ((GeneralPath) shape).curveTo(27.34, 9.317, 26.953, 9.224, 26.566, 9.341001);
        ((GeneralPath) shape).curveTo(25.906, 9.532001, 25.559, 9.63, 25.52, 9.63);
        ((GeneralPath) shape).curveTo(25.094, 9.63, 24.824001, 9.532001, 24.707, 9.341001);
        ((GeneralPath) shape).curveTo(24.594, 9.145, 24.379002, 8.544001, 24.070002, 7.5400004);
        ((GeneralPath) shape).curveTo(23.840002, 6.7660003, 23.527002, 6.399, 23.141, 6.4380007);
        ((GeneralPath) shape).lineTo(22.328001, 6.5560007);
        ((GeneralPath) shape).curveTo(22.254002, 6.4380007, 22.02, 6.5160007, 21.633001, 6.7860007);
        ((GeneralPath) shape).curveTo(21.129002, 7.134001, 20.723001, 7.290001, 20.414001, 7.251001);
        ((GeneralPath) shape).curveTo(19.680002, 7.134001, 19.004002, 7.270001, 18.387001, 7.657001);
        ((GeneralPath) shape).curveTo(17.922, 7.888001, 17.320002, 7.946001, 16.586, 7.833001);
        ((GeneralPath) shape).curveTo(15.812, 7.677001, 15.098001, 7.3840013, 14.441, 6.9620013);
        ((GeneralPath) shape).curveTo(13.781, 6.458001, 13.32, 6.208001, 13.047, 6.208001);
        ((GeneralPath) shape).curveTo(12.776999, 6.208001, 12.527, 6.477001, 12.293, 7.020001);
        ((GeneralPath) shape).curveTo(12.18, 7.329001, 12.199, 7.946001, 12.3550005, 8.876001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_123
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.531, 12.587);
        ((GeneralPath) shape).curveTo(42.616997, 12.782, 43.718998, 12.915, 44.839996, 12.993);
        ((GeneralPath) shape).lineTo(43.620995, 10.907);
        ((GeneralPath) shape).curveTo(42.827995, 9.544, 41.937996, 8.344999, 40.952995, 7.3089995);
        ((GeneralPath) shape).curveTo(41.144997, 7.5199995, 41.397995, 7.8719997, 41.706997, 8.356);
        ((GeneralPath) shape).curveTo(41.940998, 8.7039995, 42.073997, 9.165, 42.112995, 9.747);
        ((GeneralPath) shape).curveTo(42.151997, 10.285999, 42.073994, 10.613999, 41.882996, 10.731);
        ((GeneralPath) shape).curveTo(41.069996, 10.7699995, 40.546997, 10.884, 40.315994, 11.0789995);
        ((GeneralPath) shape).curveTo(39.772995, 11.622, 39.292995, 12.066999, 38.862995, 12.414999);
        ((GeneralPath) shape).curveTo(38.593994, 12.605999, 38.015995, 12.762999, 37.124996, 12.879999);
        ((GeneralPath) shape).lineTo(35.847996, 13.051999);
        ((GeneralPath) shape).lineTo(37.995995, 13.398999);
        ((GeneralPath) shape).curveTo(38.534996, 13.398999, 39.155994, 13.246999, 39.851994, 12.937999);
        ((GeneralPath) shape).curveTo(40.468994, 12.6259985, 41.030994, 12.508999, 41.530994, 12.586999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_124
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.996, 8.934);
        ((GeneralPath) shape).curveTo(15.562, 8.739, 14.344, 8.294, 13.34, 7.599);
        ((GeneralPath) shape).curveTo(12.4140005, 6.981, 11.504, 7.059, 10.613, 7.833);
        ((GeneralPath) shape).curveTo(10.188, 8.181, 9.668, 8.856, 9.047, 9.860001);
        ((GeneralPath) shape).curveTo(8.816, 10.208, 8.934, 10.442, 9.3949995, 10.559001);
        ((GeneralPath) shape).curveTo(10.172, 10.751001, 10.651999, 10.927001, 10.848, 11.079);
        ((GeneralPath) shape).curveTo(11.195, 11.349001, 11.754, 11.950001, 12.526999, 12.876);
        ((GeneralPath) shape).curveTo(12.801, 13.188001, 13.261999, 13.419001, 13.921999, 13.575001);
        ((GeneralPath) shape).curveTo(14.229999, 13.649001, 14.616999, 13.747001, 15.081999, 13.864);
        ((GeneralPath) shape).curveTo(15.351999, 13.942, 16.300999, 13.903, 17.921999, 13.747001);
        ((GeneralPath) shape).curveTo(18.387, 13.747001, 18.793, 13.825001, 19.140999, 13.977);
        ((GeneralPath) shape).curveTo(19.374998, 14.095, 19.741999, 14.306, 20.241999, 14.618);
        ((GeneralPath) shape).curveTo(20.706999, 14.849, 22.718998, 14.716, 26.276999, 14.212);
        ((GeneralPath) shape).curveTo(28.671999, 13.864, 30.473, 13.2039995, 31.671999, 12.239);
        ((GeneralPath) shape).curveTo(30.977, 12.239, 30.414, 12.161, 29.987999, 12.005);
        ((GeneralPath) shape).curveTo(29.91, 11.97, 29.561998, 11.677, 28.945, 11.1380005);
        ((GeneralPath) shape).curveTo(28.402, 10.673, 27.84, 10.423, 27.262, 10.384001);
        ((GeneralPath) shape).curveTo(26.679998, 10.345001, 26.237999, 10.149001, 25.925999, 9.802001);
        ((GeneralPath) shape).curveTo(25.734, 9.610001, 25.464998, 9.243001, 25.112999, 8.700001);
        ((GeneralPath) shape).curveTo(24.844, 8.352001, 24.554998, 8.1380005, 24.245998, 8.063001);
        ((GeneralPath) shape).curveTo(23.819998, 8.063001, 23.433998, 8.044001, 23.085999, 8.005001);
        ((GeneralPath) shape).curveTo(22.699, 7.927001, 22.272999, 8.005001, 21.808998, 8.235001);
        ((GeneralPath) shape).curveTo(21.343998, 8.47, 21.015999, 8.563001, 20.819998, 8.524);
        ((GeneralPath) shape).curveTo(20.472998, 8.411, 20.241999, 8.372, 20.124998, 8.411);
        ((GeneralPath) shape).curveTo(20.046999, 8.446, 19.815998, 8.583, 19.429998, 8.813001);
        ((GeneralPath) shape).curveTo(19.043, 9.048, 18.234, 9.087001, 16.995998, 8.934001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x8ABD4D));
        g.fill(shape);

        // _0_0_0_125
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.172, 14.907);
        ((GeneralPath) shape).curveTo(42.52, 15.332999, 42.926003, 15.563, 43.391003, 15.601999);
        ((GeneralPath) shape).curveTo(43.621002, 15.601999, 43.949, 15.586999, 44.375004, 15.544);
        ((GeneralPath) shape).curveTo(44.762005, 15.587, 45.188004, 15.544, 45.652004, 15.431);
        ((GeneralPath) shape).curveTo(45.961002, 15.431, 46.695004, 15.837, 47.855003, 16.645);
        ((GeneralPath) shape).curveTo(48.242004, 16.919, 48.535004, 16.997, 48.727005, 16.880001);
        ((GeneralPath) shape).curveTo(48.957005, 16.802002, 49.035004, 16.591002, 48.957005, 16.243002);
        ((GeneralPath) shape).curveTo(48.957005, 16.009003, 48.766003, 15.833002, 48.379005, 15.720002);
        ((GeneralPath) shape).curveTo(47.914005, 15.602002, 47.566006, 15.333002, 47.332005, 14.907002);
        ((GeneralPath) shape).curveTo(47.102005, 14.481003, 46.812004, 13.708002, 46.465004, 12.587003);
        ((GeneralPath) shape).curveTo(46.191006, 11.661003, 45.980003, 11.138002, 45.824005, 11.020002);
        ((GeneralPath) shape).curveTo(45.672005, 10.868002, 45.398006, 10.923002, 45.012005, 11.196002);
        ((GeneralPath) shape).curveTo(44.512005, 11.583002, 44.102005, 11.891002, 43.793003, 12.122002);
        ((GeneralPath) shape).curveTo(43.445004, 12.434002, 42.965004, 12.450002, 42.344, 12.181002);
        ((GeneralPath) shape).curveTo(41.727, 11.833002, 41.301003, 11.618002, 41.066, 11.544002);
        ((GeneralPath) shape).curveTo(40.797, 11.427002, 40.508003, 11.4660015, 40.199, 11.661001);
        ((GeneralPath) shape).curveTo(40.043003, 11.735002, 39.656002, 12.028001, 39.039, 12.528001);
        ((GeneralPath) shape).curveTo(38.691, 12.802001, 38.012, 12.934001, 37.008003, 12.934001);
        ((GeneralPath) shape).lineTo(35.613003, 12.817001);
        ((GeneralPath) shape).curveTo(35.848003, 12.895001, 36.406002, 13.071001, 37.297005, 13.3410015);
        ((GeneralPath) shape).curveTo(37.914005, 13.575002, 38.402004, 13.708001, 38.750004, 13.747002);
        ((GeneralPath) shape).curveTo(39.871002, 13.903002, 40.449005, 13.977001, 40.488003, 13.977001);
        ((GeneralPath) shape).curveTo(41.223003, 14.173001, 41.785004, 14.481001, 42.172005, 14.9070015);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_126
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.887, 14.212);
        ((GeneralPath) shape).curveTo(7.539, 14.134, 7.27, 14.153, 7.074, 14.2699995);
        ((GeneralPath) shape).curveTo(6.922, 14.426999, 6.535, 14.403, 5.914, 14.212);
        ((GeneralPath) shape).curveTo(5.258, 14.056, 4.832, 13.786, 4.641, 13.399);
        ((GeneralPath) shape).curveTo(4.4059997, 12.974, 4.2929997, 12.063, 4.2929997, 10.673);
        ((GeneralPath) shape).curveTo(4.2929997, 10.442, 4.1559997, 10.423, 3.8869998, 10.614);
        ((GeneralPath) shape).curveTo(3.422, 10.966001, 3.113, 11.177, 2.9569998, 11.255);
        ((GeneralPath) shape).curveTo(2.1839998, 11.641, 1.6599997, 12.454, 1.3909998, 13.692);
        ((GeneralPath) shape).curveTo(1.2379998, 14.427, 0.8319998, 15.063001, 0.17599976, 15.606001);
        ((GeneralPath) shape).curveTo(-0.05900024, 15.837001, -0.05900024, 16.458, 0.17599976, 17.462002);
        ((GeneralPath) shape).curveTo(0.24999976, 17.770002, 0.44499975, 18.059002, 0.75399977, 18.333002);
        ((GeneralPath) shape).curveTo(1.1019998, 18.641003, 1.5269997, 18.798002, 2.0309997, 18.798002);
        ((GeneralPath) shape).lineTo(3.8279996, 18.798002);
        ((GeneralPath) shape).curveTo(4.2539997, 18.798002, 4.562, 18.735003, 4.7579994, 18.622002);
        ((GeneralPath) shape).curveTo(4.9489994, 18.505001, 5.3359995, 18.196001, 5.9179993, 17.692001);
        ((GeneralPath) shape).curveTo(6.6879992, 16.997002, 7.347999, 15.837002, 7.886999, 14.212002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_127
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.625, 16.302);
        ((GeneralPath) shape).curveTo(5.805, 16.337, 5.969, 16.337, 6.121, 16.302);
        ((GeneralPath) shape).lineTo(5.684, 16.415);
        ((GeneralPath) shape).curveTo(5.453, 16.497002, 4.93, 16.532001, 4.117, 16.532001);
        ((GeneralPath) shape).curveTo(3.73, 16.532001, 3.5, 15.817001, 3.4220002, 14.388001);
        ((GeneralPath) shape).curveTo(3.344, 13.419002, 3.344, 12.548001, 3.4220002, 11.774001);
        ((GeneralPath) shape).curveTo(3.1520002, 12.513001, 3.0160003, 13.247002, 3.0160003, 13.981001);
        ((GeneralPath) shape).lineTo(3.3630004, 16.415);
        ((GeneralPath) shape).curveTo(3.2850003, 16.415, 3.1720004, 16.380001, 3.0160003, 16.302);
        ((GeneralPath) shape).curveTo(2.7460003, 16.184, 2.5120003, 15.993, 2.3200002, 15.72);
        ((GeneralPath) shape).lineTo(1.4490001, 14.442);
        ((GeneralPath) shape).curveTo(1.6050001, 15.141001, 1.7970002, 15.700001, 2.0270002, 16.126);
        ((GeneralPath) shape).curveTo(2.1840003, 16.394999, 2.3950002, 16.63, 2.6680002, 16.821);
        ((GeneralPath) shape).lineTo(3.0160003, 17.056);
        ((GeneralPath) shape).curveTo(2.6680002, 17.324999, 2.2420003, 17.462, 1.7380003, 17.462);
        ((GeneralPath) shape).lineTo(0.6370003, 17.345);
        ((GeneralPath) shape).lineTo(1.2190003, 17.633999);
        ((GeneralPath) shape).curveTo(1.6840004, 17.789999, 2.0860004, 17.828999, 2.4380002, 17.751);
        ((GeneralPath) shape).curveTo(3.0160003, 17.633999, 3.3240001, 17.536, 3.3630002, 17.462);
        ((GeneralPath) shape).lineTo(3.828, 17.751);
        ((GeneralPath) shape).lineTo(3.652, 17.751);
        ((GeneralPath) shape).lineTo(2.84, 18.387999);
        ((GeneralPath) shape).lineTo(3.188, 18.215998);
        ((GeneralPath) shape).curveTo(3.422, 18.137999, 3.652, 18.098997, 3.887, 18.098997);
        ((GeneralPath) shape).curveTo(4.234, 18.098997, 4.5230002, 17.863997, 4.754, 17.402998);
        ((GeneralPath) shape).lineTo(5.2190003, 17.402998);
        ((GeneralPath) shape).curveTo(5.762, 17.402998, 6.34, 17.055998, 6.9610004, 16.355997);
        ((GeneralPath) shape).curveTo(7.3870006, 15.933997, 7.5780005, 15.508997, 7.5390005, 15.082997);
        ((GeneralPath) shape).lineTo(7.3090005, 15.430997);
        ((GeneralPath) shape).lineTo(6.8440003, 15.719996);
        ((GeneralPath) shape).lineTo(6.2660003, 15.719996);
        ((GeneralPath) shape).curveTo(5.879, 15.719996, 5.3950005, 15.543997, 4.8120003, 15.195996);
        ((GeneralPath) shape).curveTo(4.465, 14.965997, 4.234, 14.598996, 4.117, 14.094996);
        ((GeneralPath) shape).curveTo(4.039, 13.824996, 4.004, 13.594996, 4.004, 13.398996);
        ((GeneralPath) shape).curveTo(3.9650002, 14.211996, 4.156, 14.926996, 4.5820003, 15.543997);
        ((GeneralPath) shape).curveTo(4.8910003, 15.969996, 5.2380004, 16.223997, 5.625, 16.301996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x719B3F));
        g.fill(shape);

        // _0_0_0_128
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.922, 11.716);
        ((GeneralPath) shape).curveTo(12.953, 10.594999, 12.198999, 10.035999, 11.66, 10.035999);
        ((GeneralPath) shape).lineTo(10.9609995, 10.035999);
        ((GeneralPath) shape).curveTo(11.891, 10.306, 12.526999, 10.789999, 12.875, 11.485);
        ((GeneralPath) shape).curveTo(13.301, 12.337, 14.344, 12.763, 16.008, 12.763);
        ((GeneralPath) shape).curveTo(16.394999, 12.763, 17.129, 12.665, 18.210999, 12.474);
        ((GeneralPath) shape).curveTo(19.061998, 12.317, 19.565998, 12.298, 19.722998, 12.415);
        ((GeneralPath) shape).curveTo(20.647997, 13.032, 21.132998, 13.341, 21.171997, 13.341);
        ((GeneralPath) shape).curveTo(21.323997, 13.341, 21.558996, 13.476999, 21.866997, 13.747);
        ((GeneralPath) shape).lineTo(19.140997, 13.458);
        ((GeneralPath) shape).curveTo(19.257998, 13.575, 19.409996, 13.692, 19.604998, 13.806);
        ((GeneralPath) shape).curveTo(19.952997, 14.04, 20.339998, 14.157, 20.765997, 14.157);
        ((GeneralPath) shape).curveTo(21.769997, 14.157, 22.429996, 14.250999, 22.737997, 14.445999);
        ((GeneralPath) shape).curveTo(22.890997, 14.562999, 23.183996, 14.638, 23.604998, 14.676999);
        ((GeneralPath) shape).lineTo(24.187998, 14.676999);
        ((GeneralPath) shape).lineTo(25.870998, 14.2699995);
        ((GeneralPath) shape).curveTo(25.675999, 14.231, 25.464998, 14.191999, 25.229998, 14.157);
        ((GeneralPath) shape).curveTo(24.729998, 14.075, 24.401999, 13.981, 24.245998, 13.863999);
        ((GeneralPath) shape).curveTo(24.128998, 13.785999, 24.382998, 13.634, 24.999998, 13.398999);
        ((GeneralPath) shape).curveTo(25.694998, 13.169, 26.101997, 12.9539995, 26.218998, 12.763);
        ((GeneralPath) shape).curveTo(26.448997, 12.415, 26.604998, 11.813, 26.679998, 10.966);
        ((GeneralPath) shape).curveTo(26.487999, 11.391, 26.218998, 11.759, 25.870998, 12.066999);
        ((GeneralPath) shape).curveTo(25.597998, 12.337, 25.132998, 12.587, 24.476997, 12.820999);
        ((GeneralPath) shape).curveTo(24.167997, 12.898999, 23.819998, 13.070999, 23.433998, 13.341);
        ((GeneralPath) shape).lineTo(22.909998, 13.747);
        ((GeneralPath) shape).lineTo(21.112997, 12.238999);
        ((GeneralPath) shape).lineTo(22.561996, 11.485);
        ((GeneralPath) shape).curveTo(22.909996, 11.216, 23.237997, 10.79, 23.546997, 10.208);
        ((GeneralPath) shape).curveTo(23.780996, 9.860001, 24.030996, 9.649, 24.304996, 9.571);
        ((GeneralPath) shape).curveTo(23.839996, 9.571, 23.394997, 9.786, 22.968996, 10.208);
        ((GeneralPath) shape).curveTo(22.194996, 11.059, 21.538996, 11.485001, 20.995996, 11.485001);
        ((GeneralPath) shape).lineTo(20.241997, 11.485001);
        ((GeneralPath) shape).lineTo(19.835997, 11.313001);
        ((GeneralPath) shape).curveTo(19.526997, 11.118001, 19.257998, 10.907001, 19.022997, 10.673);
        ((GeneralPath) shape).curveTo(18.675997, 10.247001, 18.249996, 9.997001, 17.745996, 9.919001);
        ((GeneralPath) shape).curveTo(18.097996, 10.423, 18.425997, 10.809001, 18.733997, 11.079);
        ((GeneralPath) shape).lineTo(19.429996, 11.602);
        ((GeneralPath) shape).curveTo(18.616997, 11.681001, 17.882996, 11.72, 17.226997, 11.72);
        ((GeneralPath) shape).curveTo(16.530998, 11.872001, 15.968997, 11.989, 15.542997, 12.067);
        ((GeneralPath) shape).curveTo(14.808997, 12.181001, 14.269998, 12.067, 13.921997, 11.716001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_129
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(41.301, 13.399);
        ((GeneralPath) shape).curveTo(41.261997, 13.477, 41.051, 13.575, 40.663998, 13.692);
        ((GeneralPath) shape).lineTo(40.081997, 13.864);
        ((GeneralPath) shape).lineTo(41.011997, 14.153);
        ((GeneralPath) shape).lineTo(41.706997, 14.153);
        ((GeneralPath) shape).curveTo(42.015995, 14.153, 42.671997, 14.309, 43.679996, 14.618);
        ((GeneralPath) shape).lineTo(45.999996, 14.677);
        ((GeneralPath) shape).curveTo(46.296997, 14.696, 46.636997, 14.825, 47.015995, 15.052);
        ((GeneralPath) shape).curveTo(46.581997, 14.614, 46.300995, 14.313, 46.171993, 14.153);
        ((GeneralPath) shape).curveTo(46.019993, 13.923, 45.804993, 13.806, 45.534992, 13.806);
        ((GeneralPath) shape).lineTo(45.187992, 13.922999);
        ((GeneralPath) shape).lineTo(45.304993, 13.457999);
        ((GeneralPath) shape).lineTo(45.71099, 12.355999);
        ((GeneralPath) shape).curveTo(45.39799, 12.547999, 45.14799, 12.836999, 44.95699, 13.223999);
        ((GeneralPath) shape).curveTo(44.72299, 13.726999, 44.237988, 13.976999, 43.50399, 13.976999);
        ((GeneralPath) shape).curveTo(43.23399, 13.976999, 42.944992, 13.863999, 42.63299, 13.629999);
        ((GeneralPath) shape).lineTo(42.284992, 13.341);
        ((GeneralPath) shape).lineTo(42.866993, 13.224);
        ((GeneralPath) shape).curveTo(43.253994, 13.184, 43.561993, 13.032, 43.79299, 12.763);
        ((GeneralPath) shape).lineTo(43.50399, 12.875999);
        ((GeneralPath) shape).curveTo(43.39099, 12.9539995, 43.17599, 12.973999, 42.86699, 12.933999);
        ((GeneralPath) shape).curveTo(42.28499, 12.8949995, 41.95699, 12.875999, 41.882988, 12.875999);
        ((GeneralPath) shape).curveTo(41.60899, 12.875999, 41.43799, 12.9539995, 41.35899, 13.11);
        ((GeneralPath) shape).lineTo(41.30099, 13.398999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

