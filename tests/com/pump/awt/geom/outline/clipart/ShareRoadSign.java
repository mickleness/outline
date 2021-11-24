package com.pump.awt.geom.outline.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.RoundRectangle2D;

import static java.awt.Color.BLACK;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/333368/share-the-road
 * </p>
 */
public class ShareRoadSign implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public ShareRoadSign() {
        this(318, 318);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public ShareRoadSign(int width, int height) {
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
        double coef = Math.min((double) width / (double) 318, (double) height / (double) 318);

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
        g.transform(new AffineTransform(3.779528f, 0, 0, 3.779528f, 0, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, 1, 9.986046f, -87.22998f));

        // _0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.70710677f, -0.70710677f, 0.70710677f, 0.70710677f, 0, 0));

        // _0_0_0
        shape = new RoundRectangle2D.Double(-98.40206909179688, 83.14410400390625, 59.319915771484375, 61.910301208496094, 3.8855881690979004, 3.8855881690979004);
        g.setPaint(new Color(0xF6D018));
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.70710677f, -0.70710677f, 0.70710677f, 0.70710677f, 0, 0));

        // _0_0_1
        shape = new RoundRectangle2D.Double(-96.78910827636719, 84.8274917602539, 56.093997955322266, 58.54351043701172, 3.674283266067505, 3.674283266067505);
        g.fill(shape);
        g.setPaint(BLACK);
        g.setStroke(new BasicStroke(1.5f, 1, 2, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0_0_1

        // _0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.8799295, 134.50014);
        ((GeneralPath) shape).lineTo(57.730217, 134.50014);

        g.setStroke(new BasicStroke(1, 0, 0, 4));
        g.draw(shape);

        // _0_0_3

        // _0_0_3_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.525937, 143.4334);
        ((GeneralPath) shape).curveTo(14.525937, 141.11835, 11.753157, 141.84015, 11.673933, 140.74864);
        ((GeneralPath) shape).curveTo(11.673933, 140.73105, 11.673933, 140.70464, 11.673933, 140.68704);
        ((GeneralPath) shape).curveTo(11.673933, 140.2205, 12.114057, 140.06206, 12.518972, 140.06206);
        ((GeneralPath) shape).curveTo(12.536572, 140.06206, 12.554182, 140.06206, 12.580592, 140.06206);
        ((GeneralPath) shape).curveTo(13.240778, 140.07965, 13.452038, 140.5814, 13.452038, 140.5814);
        ((GeneralPath) shape).lineTo(14.27947, 140.33493);
        ((GeneralPath) shape).curveTo(13.988989, 139.60432, 13.42563, 139.129, 12.598196, 139.129);
        ((GeneralPath) shape).curveTo(11.541898, 139.129, 10.758477, 139.56912, 10.758477, 140.72224);
        ((GeneralPath) shape).curveTo(10.758477, 141.69931, 11.541898, 142.0514, 11.893997, 142.19226);
        ((GeneralPath) shape).curveTo(12.659813, 142.50035, 13.575272, 142.63239, 13.575272, 143.4158);
        ((GeneralPath) shape).curveTo(13.575272, 143.90874, 13.205567, 144.28725, 12.659814, 144.28725);
        ((GeneralPath) shape).curveTo(12.105258, 144.28725, 11.647529, 143.97035, 11.401059, 143.4158);
        ((GeneralPath) shape).lineTo(10.512009, 143.7415);
        ((GeneralPath) shape).curveTo(10.908119, 144.63934, 11.647529, 145.23792, 12.659814, 145.23792);
        ((GeneralPath) shape).curveTo(13.161556, 145.23792, 13.619285, 145.07066, 13.944977, 144.78018);
        ((GeneralPath) shape).curveTo(14.314681, 144.44568, 14.52594, 143.97035, 14.52594, 143.4334);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.864637, 145.13228);
        ((GeneralPath) shape).lineTo(19.864637, 139.23462);
        ((GeneralPath) shape).lineTo(18.931574, 139.23462);
        ((GeneralPath) shape).lineTo(18.931574, 141.61128);
        ((GeneralPath) shape).lineTo(16.78377, 141.61128);
        ((GeneralPath) shape).lineTo(16.78377, 139.23462);
        ((GeneralPath) shape).lineTo(15.850707, 139.23462);
        ((GeneralPath) shape).lineTo(15.850707, 145.13228);
        ((GeneralPath) shape).lineTo(16.78377, 145.13228);
        ((GeneralPath) shape).lineTo(16.78377, 142.56195);
        ((GeneralPath) shape).lineTo(18.931574, 142.56195);
        ((GeneralPath) shape).lineTo(18.931574, 145.13228);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(26.074781, 145.13228);
        ((GeneralPath) shape).lineTo(24.041407, 139.23462);
        ((GeneralPath) shape).lineTo(23.117147, 139.23462);
        ((GeneralPath) shape).lineTo(21.083775, 145.13228);
        ((GeneralPath) shape).lineTo(22.078455, 145.13228);
        ((GeneralPath) shape).lineTo(22.659418, 143.4774);
        ((GeneralPath) shape).lineTo(24.499138, 143.4774);
        ((GeneralPath) shape).lineTo(25.080101, 145.13228);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(24.164642, 142.52673);
        ((GeneralPath) shape).lineTo(22.98511, 142.52673);
        ((GeneralPath) shape).lineTo(23.59248, 140.87187);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.30785, 145.13228);
        ((GeneralPath) shape).lineTo(30.269157, 142.3771);
        ((GeneralPath) shape).curveTo(30.81491, 142.13063, 31.184616, 141.51447, 31.184616, 140.88948);
        ((GeneralPath) shape).curveTo(31.184616, 140.29091, 30.814913, 139.66594, 30.295565, 139.41946);
        ((GeneralPath) shape).curveTo(30.005083, 139.27863, 29.696995, 139.23462, 29.239267, 139.23462);
        ((GeneralPath) shape).lineTo(27.293919, 139.23462);
        ((GeneralPath) shape).lineTo(27.293919, 145.13228);
        ((GeneralPath) shape).lineTo(28.226982, 145.13228);
        ((GeneralPath) shape).lineTo(28.226982, 142.56195);
        ((GeneralPath) shape).lineTo(29.344896, 142.56195);
        ((GeneralPath) shape).lineTo(30.295565, 145.13228);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(30.251553, 140.88948);
        ((GeneralPath) shape).curveTo(30.251553, 141.13596, 30.110712, 141.38242, 29.88185, 141.51447);
        ((GeneralPath) shape).curveTo(29.732206, 141.59366, 29.63538, 141.61127, 29.344898, 141.61127);
        ((GeneralPath) shape).lineTo(28.22698, 141.61127);
        ((GeneralPath) shape).lineTo(28.22698, 140.16766);
        ((GeneralPath) shape).lineTo(29.344894, 140.16766);
        ((GeneralPath) shape).curveTo(29.65298, 140.16766, 29.723402, 140.18526, 29.881847, 140.2733);
        ((GeneralPath) shape).curveTo(30.110712, 140.39653, 30.25155, 140.643, 30.25155, 140.88947);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(36.29444, 145.13228);
        ((GeneralPath) shape).lineTo(36.29444, 144.18161);
        ((GeneralPath) shape).lineTo(33.565674, 144.18161);
        ((GeneralPath) shape).lineTo(33.565674, 142.56195);
        ((GeneralPath) shape).lineTo(35.282158, 142.56195);
        ((GeneralPath) shape).lineTo(35.282158, 141.6113);
        ((GeneralPath) shape).lineTo(33.565674, 141.6113);
        ((GeneralPath) shape).lineTo(33.565674, 140.1677);
        ((GeneralPath) shape).lineTo(36.109592, 140.1677);
        ((GeneralPath) shape).lineTo(36.109592, 139.23463);
        ((GeneralPath) shape).lineTo(32.632614, 139.23463);
        ((GeneralPath) shape).lineTo(32.632614, 145.1323);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(43.01952, 140.06206);
        ((GeneralPath) shape).lineTo(43.01952, 139.23463);
        ((GeneralPath) shape).lineTo(39.375294, 139.23463);
        ((GeneralPath) shape).lineTo(39.375294, 140.06206);
        ((GeneralPath) shape).lineTo(40.722073, 140.06206);
        ((GeneralPath) shape).lineTo(40.722073, 145.1323);
        ((GeneralPath) shape).lineTo(41.655136, 145.1323);
        ((GeneralPath) shape).lineTo(41.655136, 140.06206);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(48.234978, 145.13228);
        ((GeneralPath) shape).lineTo(48.234978, 139.23462);
        ((GeneralPath) shape).lineTo(47.301914, 139.23462);
        ((GeneralPath) shape).lineTo(47.301914, 141.61128);
        ((GeneralPath) shape).lineTo(45.15411, 141.61128);
        ((GeneralPath) shape).lineTo(45.15411, 139.23462);
        ((GeneralPath) shape).lineTo(44.221046, 139.23462);
        ((GeneralPath) shape).lineTo(44.221046, 145.13228);
        ((GeneralPath) shape).lineTo(45.15411, 145.13228);
        ((GeneralPath) shape).lineTo(45.15411, 142.56195);
        ((GeneralPath) shape).lineTo(47.301914, 142.56195);
        ((GeneralPath) shape).lineTo(47.301914, 145.13228);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(53.635292, 145.13228);
        ((GeneralPath) shape).lineTo(53.635292, 144.18161);
        ((GeneralPath) shape).lineTo(50.906525, 144.18161);
        ((GeneralPath) shape).lineTo(50.906525, 142.56195);
        ((GeneralPath) shape).lineTo(52.62301, 142.56195);
        ((GeneralPath) shape).lineTo(52.62301, 141.6113);
        ((GeneralPath) shape).lineTo(50.906525, 141.6113);
        ((GeneralPath) shape).lineTo(50.906525, 140.1677);
        ((GeneralPath) shape).lineTo(53.450443, 140.1677);
        ((GeneralPath) shape).lineTo(53.450443, 139.23463);
        ((GeneralPath) shape).lineTo(49.97346, 139.23463);
        ((GeneralPath) shape).lineTo(49.97346, 145.1323);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.78209, 153.93475);
        ((GeneralPath) shape).lineTo(24.743397, 151.17958);
        ((GeneralPath) shape).curveTo(25.28915, 150.9331, 25.658855, 150.31694, 25.658855, 149.69196);
        ((GeneralPath) shape).curveTo(25.658855, 149.0934, 25.289152, 148.46841, 24.769804, 148.22194);
        ((GeneralPath) shape).curveTo(24.479322, 148.0811, 24.171236, 148.0371, 23.713507, 148.0371);
        ((GeneralPath) shape).lineTo(21.768158, 148.0371);
        ((GeneralPath) shape).lineTo(21.768158, 153.93475);
        ((GeneralPath) shape).lineTo(22.701221, 153.93475);
        ((GeneralPath) shape).lineTo(22.701221, 151.36444);
        ((GeneralPath) shape).lineTo(23.819136, 151.36444);
        ((GeneralPath) shape).lineTo(24.769804, 153.93475);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(24.725792, 149.69196);
        ((GeneralPath) shape).curveTo(24.725792, 149.93843, 24.584951, 150.18489, 24.356089, 150.31694);
        ((GeneralPath) shape).curveTo(24.206446, 150.39613, 24.10962, 150.41374, 23.819138, 150.41374);
        ((GeneralPath) shape).lineTo(22.701223, 150.41374);
        ((GeneralPath) shape).lineTo(22.701223, 148.97014);
        ((GeneralPath) shape).lineTo(23.819138, 148.97014);
        ((GeneralPath) shape).curveTo(24.127224, 148.97014, 24.197645, 148.98773, 24.35609, 149.07578);
        ((GeneralPath) shape).curveTo(24.584955, 149.199, 24.725794, 149.44548, 24.725794, 149.69194);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(31.164793, 150.99474);
        ((GeneralPath) shape).curveTo(31.164793, 150.25533, 31.01515, 149.50711, 30.76868, 148.98778);
        ((GeneralPath) shape).curveTo(30.398977, 148.26596, 29.87963, 147.93147, 29.131418, 147.93147);
        ((GeneralPath) shape).curveTo(28.453627, 147.93147, 27.978292, 148.14273, 27.626194, 148.59166);
        ((GeneralPath) shape).curveTo(27.230082, 149.15501, 26.983612, 150.02647, 26.983612, 150.99474);
        ((GeneralPath) shape).curveTo(26.983612, 151.69893, 27.15086, 152.48236, 27.397327, 152.9841);
        ((GeneralPath) shape).curveTo(27.749428, 153.70592, 28.268774, 154.0404, 29.096207, 154.0404);
        ((GeneralPath) shape).curveTo(29.712381, 154.0404, 30.187716, 153.82915, 30.52221, 153.38022);
        ((GeneralPath) shape).curveTo(30.935926, 152.86089, 31.164791, 151.92781, 31.164791, 150.99475);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(30.23173, 150.99474);
        ((GeneralPath) shape).curveTo(30.23173, 151.45247, 30.1261, 152.03343, 30.002865, 152.34152);
        ((GeneralPath) shape).curveTo(29.800407, 152.86087, 29.52753, 153.08974, 29.096209, 153.08974);
        ((GeneralPath) shape).curveTo(28.717703, 153.08974, 28.471233, 152.9401, 28.28638, 152.632);
        ((GeneralPath) shape).curveTo(28.057516, 152.2623, 27.934282, 151.61972, 27.934282, 150.99475);
        ((GeneralPath) shape).curveTo(27.934282, 150.50182, 28.013502, 149.96486, 28.163147, 149.61276);
        ((GeneralPath) shape).curveTo(28.356802, 149.11102, 28.638481, 148.88216, 29.061, 148.88216);
        ((GeneralPath) shape).curveTo(29.0786, 148.88216, 29.09621, 148.88216, 29.113821, 148.88216);
        ((GeneralPath) shape).curveTo(29.465921, 148.90855, 29.694784, 149.0318, 29.879637, 149.33987);
        ((GeneralPath) shape).curveTo(30.108501, 149.736, 30.231735, 150.33456, 30.231735, 150.99475);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(37.269306, 153.93475);
        ((GeneralPath) shape).lineTo(35.23593, 148.0371);
        ((GeneralPath) shape).lineTo(34.311672, 148.0371);
        ((GeneralPath) shape).lineTo(32.278297, 153.93475);
        ((GeneralPath) shape).lineTo(33.27298, 153.93475);
        ((GeneralPath) shape).lineTo(33.853943, 152.27988);
        ((GeneralPath) shape).lineTo(35.69366, 152.27988);
        ((GeneralPath) shape).lineTo(36.274624, 153.93475);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(35.35917, 151.32922);
        ((GeneralPath) shape).lineTo(34.179634, 151.32922);
        ((GeneralPath) shape).lineTo(34.787006, 149.67435);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_3_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(42.502377, 150.97713);
        ((GeneralPath) shape).curveTo(42.502377, 149.8152, 42.150276, 148.88214, 41.534103, 148.34518);
        ((GeneralPath) shape).curveTo(41.217213, 148.09871, 40.98835, 148.03711, 40.389782, 148.03711);
        ((GeneralPath) shape).lineTo(38.488445, 148.03711);
        ((GeneralPath) shape).lineTo(38.488445, 153.93477);
        ((GeneralPath) shape).lineTo(40.284153, 153.93477);
        ((GeneralPath) shape).curveTo(40.433796, 153.93477, 40.55703, 153.93477, 40.61865, 153.93477);
        ((GeneralPath) shape).curveTo(40.926735, 153.91718, 41.243626, 153.81154, 41.463688, 153.60028);
        ((GeneralPath) shape).curveTo(42.132675, 153.08974, 42.50238, 152.15668, 42.50238, 150.97714);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(41.55171, 150.97713);
        ((GeneralPath) shape).curveTo(41.55171, 151.76054, 41.366856, 152.40312, 41.01476, 152.75523);
        ((GeneralPath) shape).curveTo(40.84751, 152.92247, 40.66266, 152.9841, 40.354572, 152.9841);
        ((GeneralPath) shape).lineTo(39.42151, 152.9841);
        ((GeneralPath) shape).lineTo(39.42151, 148.97017);
        ((GeneralPath) shape).lineTo(40.477806, 148.97017);
        ((GeneralPath) shape).curveTo(40.724277, 148.97017, 40.926735, 149.0758, 41.076374, 149.21664);
        ((GeneralPath) shape).curveTo(41.366856, 149.52473, 41.55171, 150.18492, 41.55171, 150.97714);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.112485, 121.25462);
        ((GeneralPath) shape).curveTo(8.418458, 121.25462, 7.64014, 122.132576, 7.64014, 122.915504);
        ((GeneralPath) shape).lineTo(7.64014, 128.5627);
        ((GeneralPath) shape).lineTo(7.64014, 130.22305);
        ((GeneralPath) shape).lineTo(31.196247, 130.22305);
        ((GeneralPath) shape).lineTo(31.196247, 122.9155);
        ((GeneralPath) shape).curveTo(31.196247, 122.13257, 30.417929, 121.254616, 29.723902, 121.254616);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(12.129732, 122.4318);
        ((GeneralPath) shape).curveTo(13.0574875, 122.431725, 13.809671, 123.124214, 13.8098545, 124.141785);
        ((GeneralPath) shape).curveTo(13.809929, 125.15955, 13.057669, 125.852356, 12.129732, 125.85227);
        ((GeneralPath) shape).curveTo(11.201979, 125.85206, 10.4500065, 125.159355, 10.45008, 124.141785);
        ((GeneralPath) shape).curveTo(10.450263, 123.12441, 11.202161, 122.432014, 12.129732, 122.43181);
        ((GeneralPath) shape).closePath();
        ((GeneralPath) shape).moveTo(26.603472, 122.4318);
        ((GeneralPath) shape).curveTo(27.531227, 122.431725, 28.283413, 123.124214, 28.283596, 124.141785);
        ((GeneralPath) shape).curveTo(28.28367, 125.15955, 27.531408, 125.852356, 26.603472, 125.85227);
        ((GeneralPath) shape).curveTo(25.67572, 125.85206, 24.923746, 125.159355, 24.92382, 124.141785);
        ((GeneralPath) shape).curveTo(24.924004, 123.12441, 25.675901, 122.432014, 26.603472, 122.43181);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.1563701f, 0, 0, 4));
        g.draw(shape);

        // _0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.997105, 121.26245);
        ((GeneralPath) shape).curveTo(9.997105, 121.26245, 11.738918, 113.93282, 14.079643, 113.93282);
        ((GeneralPath) shape).lineTo(24.757044, 113.93282);
        ((GeneralPath) shape).curveTo(27.097775, 113.93282, 28.839582, 121.26245, 28.839582, 121.26245);
        ((GeneralPath) shape).closePath();

        g.setStroke(new BasicStroke(1.282204f, 0, 0, 4));
        g.draw(shape);

        // _0_0_6
        shape = new RoundRectangle2D.Double(9.513904571533203, 128.55235290527344, 1.4722516536712646, 4.9824934005737305, 1.4722516536712646, 1.660831093788147);
        g.fill(shape);
        g.setStroke(new BasicStroke(1.1820103f, 1, 2, 4));
        g.draw(shape);

        // _0_0_7
        shape = new RoundRectangle2D.Double(27.769739151000977, 128.55235290527344, 1.4722516536712646, 4.9824934005737305, 1.4722516536712646, 1.660831093788147);
        g.fill(shape);
        g.draw(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.5226111f, 0, 0, 0.5226111f, -17.399555f, 76.21529f));

        // _0_0_8

        // _0_0_8_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(55.56946, 84.275);
        ((GeneralPath) shape).curveTo(55.56946, 84.275, 56.47502, 81.58332, 57.37723, 81.59151);
        ((GeneralPath) shape).curveTo(61.528114, 81.629166, 65.50055, 81.629166, 68.813614, 81.59151);
        ((GeneralPath) shape).curveTo(69.95249, 81.57856, 71.459206, 84.275, 71.459206, 84.275);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setStroke(new BasicStroke(0.22924225f, 0, 0, 4));
        g.draw(shape);

        // _0_0_8_1
        shape = new Ellipse2D.Double(60.88642883300781, 75.01590728759766, 5.291666507720947, 5.291666507720947);
        g.fill(shape);
        g.setStroke(new BasicStroke(2, 1, 2, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0_0_8
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0.7417957f, 0, 0, 0.7417957f, -10.932833f, 36.504765f));

        // _0_0_9

        // _0_0_9_0
        shape = new RoundRectangle2D.Double(78.05208587646484, 115.00447082519531, 2.6458332538604736, 8.126487731933594, 0.7255793213844299, 0.7255793213844299);
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(0, 1, 1, 0, 0, 0));

        // _0_0_9_1
        shape = new RoundRectangle2D.Double(114.81548309326172, 75.40625, 2.267857074737549, 10.583333015441895, 0.9449405074119568, 0.9449405074119568);
        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0_9_1

        // _0_0_9_2
        shape = new RoundRectangle2D.Double(80.86801147460938, 115.6659164428711, 2.6458358764648438, 12.92529010772705, 0.9449405074119568, 0.9449405074119568);
        g.fill(shape);

        // _0_0_9_3
        shape = new RoundRectangle2D.Double(79.82857513427734, 120.76859283447266, 1.9843748807907104, 10.583333015441895, 0.9449405074119568, 0.9449405074119568);
        g.fill(shape);

        // _0_0_9_4
        shape = new Ellipse2D.Double(79.94196319580078, 116.70535278320312, 1.5119048357009888, 1.5119048357009888);
        g.setPaint(new Color(0xF6D018));
        g.fill(shape);

        // _0_0_9_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(75.21726, 115.09896);
        ((GeneralPath) shape).curveTo(75.21726, 115.09896, 73.03276, 113.20349, 72.85491, 111.88616);
        ((GeneralPath) shape).curveTo(72.698395, 110.72683, 76.91816, 106.688995, 76.91816, 106.688995);
        ((GeneralPath) shape).lineTo(84.59107, 106.84017);
        ((GeneralPath) shape).curveTo(84.59107, 106.84017, 87.72583, 110.803085, 87.784966, 112.07515);
        ((GeneralPath) shape).curveTo(87.8438, 113.34077, 85.6116, 115.19345, 85.6116, 115.19345);
        ((GeneralPath) shape).lineTo(83.53274, 115.00446);
        ((GeneralPath) shape).curveTo(83.53274, 115.00446, 86.10194, 113.382164, 85.89509, 112.16964);
        ((GeneralPath) shape).curveTo(85.780426, 111.49751, 84.1186, 108.95684, 84.1186, 108.95684);
        ((GeneralPath) shape).lineTo(77.20164, 109.05134);
        ((GeneralPath) shape).curveTo(77.20164, 109.05134, 74.890976, 110.815956, 74.933784, 112.07515);
        ((GeneralPath) shape).curveTo(74.974754, 113.28046, 77.296135, 114.81548, 77.296135, 114.81548);
        ((GeneralPath) shape).closePath();

        g.setPaint(BLACK);
        g.fill(shape);
        g.setStroke(new BasicStroke(0.26458332f, 0, 0, 4));
        g.draw(shape);

        // _0_0_9_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(78.146576, 115.19345);
        ((GeneralPath) shape).lineTo(78.052086, 106.78348);
        ((GeneralPath) shape).lineTo(83.34375, 106.78348);
        ((GeneralPath) shape).lineTo(83.15476, 115.66592);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.draw(shape);

        // _0_0_9_7
        shape = new Ellipse2D.Double(78.05208587646484, 100.81145477294922, 5.386160850524902, 5.386160850524902);
        g.fill(shape);
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1, 0, 0, -1, 0, 0));

        // _0_0_9_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(84.0052, -102.65045);
        ((GeneralPath) shape).curveTo(84.0052, -101.69913, 83.3668, -100.82104, 82.33317, -100.35066);
        ((GeneralPath) shape).curveTo(81.29953, -99.880295, 80.02982, -99.89007, 79.00769, -100.37626);
        ((GeneralPath) shape).curveTo(77.98556, -100.86244, 77.36837, -101.75019, 77.391235, -102.70134);
        ((GeneralPath) shape).lineTo(80.697914, -102.65044);
        ((GeneralPath) shape).closePath();

        g.fill(shape);
        g.setPaint(new Color(0xF6D018));
        g.setStroke(new BasicStroke(0.25f, 1, 2, 4));
        g.draw(shape);

        g.setTransform(transformations.pop()); // _0_0_9_8

        g.setTransform(transformations.pop()); // _0_0_9

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

