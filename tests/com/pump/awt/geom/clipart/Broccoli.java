package com.pump.awt.geom.clipart;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

/**
 * This class has been automatically generated using
 * <a href="http://ebourg.github.io/flamingo-svg-transcoder/">Flamingo SVG transcoder</a>.
 * <p>
 * Source image: https://openclipart.org/detail/209529/food-broccoli
 * </p>
 */
public class Broccoli implements javax.swing.Icon {

    /** The width of this icon. */
    private int width;

    /** The height of this icon. */
    private int height;

    /**
     * Creates a new transcoded SVG image.
     */
    public Broccoli() {
        this(1000, 1000);
    }

    /**
     * Creates a new transcoded SVG image.
     */
    public Broccoli(int width, int height) {
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
        g.transform(new AffineTransform(0.025f, 0, 0, 0.025f, 0, 0));

        // _0
        transformations.push(g.getTransform());
        g.transform(new AffineTransform(1.25f, 0, 0, -1.25f, 0, 40));

        // _0_0

        // _0_0_0

        // _0_0_0_0
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.141, 12.969);
        ((GeneralPath) shape).curveTo(19.867, 12.7699995, 19.68, 12.594, 19.578001, 12.445);
        ((GeneralPath) shape).curveTo(19.305, 12.0199995, 18.879002, 11.922, 18.305, 12.1449995);
        ((GeneralPath) shape).lineTo(18.082, 10.8359995);
        ((GeneralPath) shape).curveTo(18.031, 10.3359995, 17.223001, 9.761999, 15.648001, 9.112999);
        ((GeneralPath) shape).curveTo(15.473001, 9.710999, 15.312, 10.323999, 15.160001, 10.944999);
        ((GeneralPath) shape).curveTo(14.863001, 12.218999, 14.762001, 12.944999, 14.863001, 13.116999);
        ((GeneralPath) shape).curveTo(14.961, 13.319999, 15.609001, 13.753999, 16.809, 14.429998);
        ((GeneralPath) shape).curveTo(17.832, 15.003999, 18.469, 15.339998, 18.719, 15.440998);
        ((GeneralPath) shape).curveTo(18.844, 15.487998, 19.156, 15.265998, 19.652, 14.765998);
        ((GeneralPath) shape).curveTo(20.176, 14.241998, 20.426, 13.831998, 20.402, 13.530998);
        ((GeneralPath) shape).curveTo(20.379, 13.280998, 20.289, 13.093998, 20.141, 12.968998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4F6E34));
        g.fill(shape);

        // _0_0_0_1
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.617, 14.504);
        ((GeneralPath) shape).lineTo(18.457, 17.125);
        ((GeneralPath) shape).lineTo(19.578001, 17.012);
        ((GeneralPath) shape).lineTo(21.449001, 12.48);
        ((GeneralPath) shape).curveTo(21.500002, 12.309, 21.961, 11.370999, 22.836, 9.676);
        ((GeneralPath) shape).curveTo(23.359001, 8.651999, 23.473, 8.077999, 23.172, 7.9529996);
        ((GeneralPath) shape).curveTo(22.973001, 7.8789997, 22.836, 7.6519995, 22.762001, 7.2769995);
        ((GeneralPath) shape).curveTo(22.734001, 7.0549994, 22.512001, 7.0269995, 22.086, 7.2029996);
        ((GeneralPath) shape).curveTo(19.816, 8.026999, 18.379, 8.577999, 17.781, 8.851999);
        ((GeneralPath) shape).curveTo(17.406, 9.026999, 17.082, 9.311999, 16.809, 9.7109995);
        ((GeneralPath) shape).lineTo(16.473, 10.233999);
        ((GeneralPath) shape).lineTo(17.145, 10.573999);
        ((GeneralPath) shape).lineTo(17.781, 10.124999);
        ((GeneralPath) shape).curveTo(18.258, 9.823999, 18.582, 9.663999, 18.754, 9.636999);
        ((GeneralPath) shape).curveTo(19.004, 9.561999, 19.265999, 9.598, 19.539, 9.749999);
        ((GeneralPath) shape).lineTo(18.27, 13.866999);
        ((GeneralPath) shape).lineTo(18.566, 14.128999);
        ((GeneralPath) shape).lineTo(19.016, 12.780998);
        ((GeneralPath) shape).curveTo(19.391, 11.757998, 19.727001, 10.921998, 20.027, 10.272999);
        ((GeneralPath) shape).curveTo(20.328001, 9.624999, 20.789, 9.226999, 21.414, 9.073998);
        ((GeneralPath) shape).curveTo(21.737999, 8.999998, 22.022999, 8.999998, 22.272999, 9.073998);
        ((GeneralPath) shape).curveTo(21.499998, 9.272999, 21.050999, 9.647999, 20.925999, 10.198998);
        ((GeneralPath) shape).curveTo(20.852, 10.698998, 20.776999, 11.147999, 20.703, 11.546999);
        ((GeneralPath) shape).curveTo(20.526999, 12.296999, 20.164, 13.280999, 19.616999, 14.503999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x658C42));
        g.fill(shape);

        // _0_0_0_2
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.703, 16.449);
        ((GeneralPath) shape).lineTo(20.737999, 15.702999);
        ((GeneralPath) shape).curveTo(20.862999, 14.976999, 21.164, 13.991999, 21.637, 12.741999);
        ((GeneralPath) shape).curveTo(22.188, 11.323998, 22.647999, 10.358999, 23.022999, 9.862999);
        ((GeneralPath) shape).curveTo(23.296999, 9.487999, 23.945, 8.862999, 24.968998, 7.9919987);
        ((GeneralPath) shape).curveTo(25.815998, 7.292999, 26.565998, 6.8159986, 27.214998, 6.5659986);
        ((GeneralPath) shape).curveTo(27.561998, 6.4409986, 27.811998, 6.3949986, 27.964998, 6.4179983);
        ((GeneralPath) shape).lineTo(28.112999, 5.5199986);
        ((GeneralPath) shape).curveTo(28.137, 4.8439984, 27.914, 4.2579985, 27.438, 3.7619987);
        ((GeneralPath) shape).curveTo(26.941, 3.2109985, 26.465, 2.9729986, 26.015999, 3.0469987);
        ((GeneralPath) shape).lineTo(25.491999, 3.3479986);
        ((GeneralPath) shape).curveTo(25.319998, 3.6479986, 24.394999, 4.483999, 22.723, 5.8549986);
        ((GeneralPath) shape).curveTo(21.425999, 6.9059987, 20.164, 7.640999, 18.941, 8.065998);
        ((GeneralPath) shape).curveTo(18.145, 8.311998, 16.758, 8.577998, 14.789, 8.851998);
        ((GeneralPath) shape).curveTo(13.816, 8.999998, 13.151999, 9.175999, 12.804999, 9.374998);
        ((GeneralPath) shape).lineTo(12.577999, 9.636998);
        ((GeneralPath) shape).lineTo(12.73, 11.769999);
        ((GeneralPath) shape).lineTo(19.32, 8.925999);
        ((GeneralPath) shape).curveTo(18.52, 10.370998, 17.706999, 11.769999, 16.887, 13.116999);
        ((GeneralPath) shape).curveTo(16.359, 13.964998, 15.909999, 14.464998, 15.539, 14.612999);
        ((GeneralPath) shape).lineTo(15.089999, 14.577999);
        ((GeneralPath) shape).lineTo(16.772999, 15.698999);
        ((GeneralPath) shape).lineTo(17.780998, 13.304999);
        ((GeneralPath) shape).curveTo(18.257998, 12.280999, 18.968998, 11.469, 19.913998, 10.870999);
        ((GeneralPath) shape).curveTo(19.991997, 11.5199995, 19.827997, 12.219, 19.429998, 12.969);
        ((GeneralPath) shape).lineTo(18.155998, 15.323999);
        ((GeneralPath) shape).lineTo(18.718998, 15.438);
        ((GeneralPath) shape).lineTo(19.616999, 13.379);
        ((GeneralPath) shape).curveTo(19.890999, 12.703, 20.366999, 12.179999, 21.039, 11.804999);
        ((GeneralPath) shape).curveTo(21.062, 12.429999, 20.890999, 13.190999, 20.515999, 14.089999);
        ((GeneralPath) shape).curveTo(20.265999, 14.687999, 20.004, 15.261999, 19.73, 15.811999);
        ((GeneralPath) shape).lineTo(19.355, 16.445);
        ((GeneralPath) shape).lineTo(20.703, 16.445);
        ((GeneralPath) shape).lineTo(20.703, 16.449);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x81B354));
        g.fill(shape);

        // _0_0_0_3
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(27.402, 5.184);
        ((GeneralPath) shape).curveTo(27.703001, 5.082, 27.777, 5.156, 27.629, 5.406);
        ((GeneralPath) shape).curveTo(26.754, 6.1330004, 26.156, 6.605, 25.831999, 6.828);
        ((GeneralPath) shape).lineTo(24.370998, 8.066);
        ((GeneralPath) shape).lineTo(25.530998, 7.277);
        ((GeneralPath) shape).curveTo(26.354998, 6.7539997, 26.913998, 6.4179997, 27.214998, 6.27);
        ((GeneralPath) shape).lineTo(27.964998, 5.895);
        ((GeneralPath) shape).lineTo(28.112999, 5.293);
        ((GeneralPath) shape).curveTo(28.061998, 4.695, 27.839998, 4.184, 27.440998, 3.762);
        ((GeneralPath) shape).curveTo(26.890999, 3.16, 26.390999, 2.9380002, 25.940998, 3.086);
        ((GeneralPath) shape).lineTo(26.019999, 3.312);
        ((GeneralPath) shape).curveTo(26.964998, 3.785, 27.265999, 4.32, 26.913998, 4.922);
        ((GeneralPath) shape).curveTo(26.741997, 5.172, 26.417997, 5.457, 25.940998, 5.781);
        ((GeneralPath) shape).curveTo(25.218998, 6.254, 24.667997, 6.6410003, 24.296997, 6.941);
        ((GeneralPath) shape).curveTo(23.745996, 7.391, 22.983997, 7.914, 22.011997, 8.512);
        ((GeneralPath) shape).lineTo(20.737997, 9.262);
        ((GeneralPath) shape).lineTo(24.632998, 7.094);
        ((GeneralPath) shape).curveTo(25.179998, 6.766, 25.780998, 6.355, 26.429998, 5.855);
        ((GeneralPath) shape).curveTo(26.929998, 5.457, 27.253998, 5.234, 27.401999, 5.184);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x66943B));
        g.fill(shape);

        // _0_0_0_4
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.941, 8.066);
        ((GeneralPath) shape).curveTo(18.145, 8.316, 16.758, 8.578, 14.789, 8.852);
        ((GeneralPath) shape).curveTo(13.816, 9.0, 13.151999, 9.176001, 12.804999, 9.375);
        ((GeneralPath) shape).lineTo(12.577999, 9.637);
        ((GeneralPath) shape).lineTo(12.616999, 9.898);
        ((GeneralPath) shape).curveTo(15.038999, 9.151999, 16.66, 8.766, 17.484, 8.738);
        ((GeneralPath) shape).curveTo(19.331999, 8.613, 20.715, 8.254, 21.637, 7.652);
        ((GeneralPath) shape).curveTo(22.637, 7.031, 23.796999, 6.031, 25.120998, 4.66);
        ((GeneralPath) shape).curveTo(25.741999, 3.961, 26.378998, 3.5349998, 27.026999, 3.3869998);
        ((GeneralPath) shape).curveTo(26.405998, 2.9099998, 25.894999, 2.8979998, 25.495998, 3.3479998);
        ((GeneralPath) shape).curveTo(25.319998, 3.6479998, 24.397999, 4.4839997, 22.726997, 5.8549995);
        ((GeneralPath) shape).curveTo(21.425997, 6.9059997, 20.163998, 7.641, 18.940998, 8.066);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_5
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.488, 11.809);
        ((GeneralPath) shape).curveTo(21.387001, 11.984, 21.262001, 12.332, 21.113, 12.859);
        ((GeneralPath) shape).curveTo(20.988, 13.43, 20.977001, 13.742001, 21.074001, 13.793);
        ((GeneralPath) shape).curveTo(21.176, 13.816, 21.312002, 13.43, 21.488, 12.633);
        ((GeneralPath) shape).curveTo(21.637001, 11.832001, 21.637001, 11.559, 21.488, 11.809);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0xA5DB72));
        g.fill(shape);

        // _0_0_0_6
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.891, 10.984);
        ((GeneralPath) shape).curveTo(21.012001, 10.734, 20.902, 10.5, 20.555, 10.273);
        ((GeneralPath) shape).curveTo(20.227001, 10.073999, 19.965, 10.073999, 19.766, 10.273);
        ((GeneralPath) shape).curveTo(19.492, 10.547, 19.652, 10.637, 20.254002, 10.535);
        ((GeneralPath) shape).curveTo(20.430002, 10.512, 20.465002, 10.698999, 20.367002, 11.098);
        ((GeneralPath) shape).curveTo(20.242002, 11.672, 20.180002, 11.995999, 20.180002, 12.07);
        ((GeneralPath) shape).curveTo(20.203003, 12.245999, 20.305002, 12.172, 20.477003, 11.844);
        ((GeneralPath) shape).curveTo(20.578003, 11.6449995, 20.715004, 11.359, 20.891003, 10.984);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_7
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.793, 11.023);
        ((GeneralPath) shape).curveTo(18.918, 10.698999, 19.054998, 10.387, 19.203, 10.0859995);
        ((GeneralPath) shape).curveTo(19.254, 9.938, 19.203, 9.898, 19.054998, 9.973);
        ((GeneralPath) shape).curveTo(18.878998, 10.073999, 18.679998, 10.348, 18.456999, 10.797);
        ((GeneralPath) shape).curveTo(18.23, 11.223, 18.093998, 11.57, 18.043, 11.844);
        ((GeneralPath) shape).curveTo(18.019999, 12.098, 18.105, 12.098, 18.304998, 11.844);
        ((GeneralPath) shape).curveTo(18.479998, 11.621, 18.644999, 11.348, 18.793, 11.023);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_8
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.371, 8.066);
        ((GeneralPath) shape).curveTo(25.121, 7.316, 25.379, 6.992, 25.156, 7.094);
        ((GeneralPath) shape).curveTo(24.98, 7.191, 24.645, 7.441, 24.145, 7.8399997);
        ((GeneralPath) shape).curveTo(22.199001, 9.141, 21.125, 9.926, 20.926, 10.198999);
        ((GeneralPath) shape).curveTo(20.777, 10.398, 20.852001, 10.426, 21.152, 10.273);
        ((GeneralPath) shape).curveTo(21.426, 10.148, 21.676, 9.988, 21.898, 9.789);
        ((GeneralPath) shape).curveTo(21.949001, 9.738, 22.324001, 9.488, 23.023, 9.039);
        ((GeneralPath) shape).curveTo(23.648, 8.664, 24.098001, 8.339999, 24.371, 8.066);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_9
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.957, 6.68);
        ((GeneralPath) shape).curveTo(25.133001, 5.582, 25.566, 5.047, 25.27, 5.0699997);
        ((GeneralPath) shape).lineTo(23.137001, 6.8669996);
        ((GeneralPath) shape).curveTo(22.688002, 7.2419996, 22.285002, 7.6049995, 21.938002, 7.9529996);
        ((GeneralPath) shape).curveTo(21.613, 8.301, 21.562002, 8.414, 21.789001, 8.289);
        ((GeneralPath) shape).curveTo(22.637001, 7.7149997, 23.359001, 7.1799994, 23.957, 6.6799994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_10
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.508, 25.473);
        ((GeneralPath) shape).curveTo(24.081999, 25.473, 24.469, 25.195, 24.671999, 24.647999);
        ((GeneralPath) shape).lineTo(24.706999, 24.124998);
        ((GeneralPath) shape).curveTo(25.280998, 24.073997, 25.655998, 23.761997, 25.831999, 23.187998);
        ((GeneralPath) shape).curveTo(25.956999, 22.788998, 25.918, 22.425999, 25.718998, 22.101997);
        ((GeneralPath) shape).curveTo(25.843998, 21.929996, 25.917997, 21.788998, 25.940998, 21.690998);
        ((GeneralPath) shape).curveTo(26.042997, 21.339998, 25.991999, 21.015999, 25.792997, 20.718998);
        ((GeneralPath) shape).lineTo(25.905998, 20.456999);
        ((GeneralPath) shape).curveTo(26.003998, 20.081999, 25.968998, 19.73, 25.792997, 19.405998);
        ((GeneralPath) shape).curveTo(25.620996, 19.081999, 25.354998, 18.858997, 25.007998, 18.733997);
        ((GeneralPath) shape).lineTo(24.933998, 18.733997);
        ((GeneralPath) shape).curveTo(24.979998, 18.460997, 24.933998, 18.198997, 24.780998, 17.948997);
        ((GeneralPath) shape).curveTo(24.604998, 17.698997, 24.394999, 17.534998, 24.144999, 17.460997);
        ((GeneralPath) shape).lineTo(23.769999, 17.425997);
        ((GeneralPath) shape).curveTo(23.819998, 17.147997, 23.769999, 16.913998, 23.620998, 16.710997);
        ((GeneralPath) shape).curveTo(23.495998, 16.487997, 23.308998, 16.339996, 23.058998, 16.265997);
        ((GeneralPath) shape).curveTo(22.909998, 16.214996, 22.772999, 16.214996, 22.647999, 16.265997);
        ((GeneralPath) shape).curveTo(22.598, 15.913997, 22.433998, 15.702997, 22.159998, 15.628997);
        ((GeneralPath) shape).curveTo(21.835999, 15.5549965, 21.585999, 15.651997, 21.409998, 15.925997);
        ((GeneralPath) shape).lineTo(21.112997, 15.851996);
        ((GeneralPath) shape).lineTo(21.073997, 15.851996);
        ((GeneralPath) shape).curveTo(21.050997, 15.651997, 20.948997, 15.476996, 20.772997, 15.327996);
        ((GeneralPath) shape).curveTo(20.601997, 15.1799965, 20.401997, 15.104997, 20.175997, 15.104997);
        ((GeneralPath) shape).lineTo(19.874996, 15.1799965);
        ((GeneralPath) shape).curveTo(19.726995, 14.952996, 19.499996, 14.843996, 19.202995, 14.843996);
        ((GeneralPath) shape).curveTo(18.952995, 14.843996, 18.753996, 14.940996, 18.601995, 15.140996);
        ((GeneralPath) shape).lineTo(18.565996, 15.179996);
        ((GeneralPath) shape).curveTo(18.440996, 14.780995, 18.190996, 14.530995, 17.815996, 14.429996);
        ((GeneralPath) shape).lineTo(17.405996, 14.390996);
        ((GeneralPath) shape).curveTo(17.456997, 14.167996, 17.433996, 13.940996, 17.331997, 13.718996);
        ((GeneralPath) shape).curveTo(17.206997, 13.519996, 17.034996, 13.378996, 16.808996, 13.3049965);
        ((GeneralPath) shape).curveTo(16.632996, 13.280996, 16.460997, 13.280996, 16.284996, 13.3049965);
        ((GeneralPath) shape).curveTo(16.183996, 13.132997, 16.034996, 13.007997, 15.835996, 12.933996);
        ((GeneralPath) shape).curveTo(15.784996, 12.581996, 15.608995, 12.370996, 15.3119955, 12.296996);
        ((GeneralPath) shape).curveTo(15.085996, 12.222996, 14.874995, 12.245996, 14.675996, 12.370996);
        ((GeneralPath) shape).curveTo(14.573996, 12.147997, 14.413996, 11.995996, 14.187996, 11.921996);
        ((GeneralPath) shape).curveTo(13.8119955, 11.847996, 13.503996, 11.944996, 13.253996, 12.222996);
        ((GeneralPath) shape).lineTo(13.065996, 12.144996);
        ((GeneralPath) shape).curveTo(12.815996, 12.069996, 12.577996, 12.097996, 12.354996, 12.222996);
        ((GeneralPath) shape).curveTo(12.104996, 12.319996, 11.929996, 12.4959955, 11.831996, 12.7459955);
        ((GeneralPath) shape).curveTo(11.354996, 12.694996, 11.058996, 12.905995, 10.933996, 13.378996);
        ((GeneralPath) shape).curveTo(10.858996, 13.581996, 10.870996, 13.792995, 10.968996, 14.019996);
        ((GeneralPath) shape).curveTo(10.394996, 14.065995, 10.034996, 14.366996, 9.882996, 14.913996);
        ((GeneralPath) shape).lineTo(9.847996, 15.214995);
        ((GeneralPath) shape).curveTo(9.323996, 15.288996, 8.960996, 15.589995, 8.761995, 16.112995);
        ((GeneralPath) shape).curveTo(8.636995, 16.561995, 8.722996, 16.972996, 9.022995, 17.347996);
        ((GeneralPath) shape).curveTo(8.796995, 17.421995, 8.647995, 17.585997, 8.573995, 17.835997);
        ((GeneralPath) shape).curveTo(8.448995, 18.108997, 8.487994, 18.358997, 8.687995, 18.585997);
        ((GeneralPath) shape).lineTo(8.6089945, 18.921997);
        ((GeneralPath) shape).curveTo(8.6089945, 19.069998, 8.659994, 19.194998, 8.761994, 19.296997);
        ((GeneralPath) shape).curveTo(8.437994, 19.519997, 8.300994, 19.804996, 8.347995, 20.155996);
        ((GeneralPath) shape).curveTo(8.347995, 20.503996, 8.487995, 20.753996, 8.761994, 20.905996);
        ((GeneralPath) shape).curveTo(8.6089945, 21.077997, 8.534994, 21.276997, 8.534994, 21.503996);
        ((GeneralPath) shape).curveTo(8.534994, 21.901997, 8.737994, 22.163996, 9.136994, 22.288996);
        ((GeneralPath) shape).curveTo(9.061995, 22.390995, 9.022994, 22.511995, 9.022994, 22.663996);
        ((GeneralPath) shape).curveTo(9.022994, 22.811996, 9.073994, 22.937996, 9.171994, 23.038996);
        ((GeneralPath) shape).curveTo(9.097994, 23.612995, 9.323995, 23.987995, 9.847994, 24.159996);
        ((GeneralPath) shape).curveTo(10.019994, 24.237995, 10.183994, 24.249996, 10.331994, 24.198996);
        ((GeneralPath) shape).lineTo(10.331994, 24.233995);
        ((GeneralPath) shape).curveTo(10.3589945, 24.534996, 10.479994, 24.784996, 10.706994, 24.983995);
        ((GeneralPath) shape).curveTo(10.933994, 25.210995, 11.194994, 25.308996, 11.491994, 25.284996);
        ((GeneralPath) shape).curveTo(11.616994, 25.284996, 11.780993, 25.233995, 11.979994, 25.132996);
        ((GeneralPath) shape).curveTo(12.030993, 25.433996, 12.167994, 25.683996, 12.390994, 25.882996);
        ((GeneralPath) shape).curveTo(12.616994, 26.081995, 12.878994, 26.171995, 13.179994, 26.144995);
        ((GeneralPath) shape).curveTo(13.226994, 26.421995, 13.351994, 26.655994, 13.554994, 26.854994);
        ((GeneralPath) shape).curveTo(13.776994, 27.058994, 14.038994, 27.155994, 14.3399935, 27.155994);
        ((GeneralPath) shape).lineTo(14.788994, 27.042994);
        ((GeneralPath) shape).curveTo(14.8399935, 27.343994, 14.976994, 27.581993, 15.198994, 27.757994);
        ((GeneralPath) shape).curveTo(15.448994, 27.956993, 15.722994, 28.054995, 16.022993, 28.054995);
        ((GeneralPath) shape).curveTo(16.421993, 28.030994, 16.745993, 27.843994, 16.995993, 27.495995);
        ((GeneralPath) shape).curveTo(17.245993, 27.593994, 17.444992, 27.644995, 17.597992, 27.644995);
        ((GeneralPath) shape).lineTo(17.745993, 27.604994);
        ((GeneralPath) shape).curveTo(17.921993, 27.854994, 18.183992, 27.979994, 18.530993, 27.979994);
        ((GeneralPath) shape).curveTo(18.929993, 27.979994, 19.206993, 27.819994, 19.354992, 27.495995);
        ((GeneralPath) shape).curveTo(19.554993, 27.593994, 19.718992, 27.644995, 19.839993, 27.644995);
        ((GeneralPath) shape).curveTo(20.140993, 27.593994, 20.390993, 27.456995, 20.589993, 27.233995);
        ((GeneralPath) shape).curveTo(20.741993, 27.382996, 20.940992, 27.456995, 21.190992, 27.456995);
        ((GeneralPath) shape).curveTo(21.413992, 27.456995, 21.612993, 27.370995, 21.788992, 27.194996);
        ((GeneralPath) shape).curveTo(21.937992, 27.019997, 22.011992, 26.808996, 22.011992, 26.558996);
        ((GeneralPath) shape).lineTo(22.011992, 26.483995);
        ((GeneralPath) shape).lineTo(22.124992, 26.483995);
        ((GeneralPath) shape).curveTo(22.347992, 26.483995, 22.550993, 26.409996, 22.722992, 26.257996);
        ((GeneralPath) shape).curveTo(22.925991, 26.108995, 23.034992, 25.921995, 23.061993, 25.698996);
        ((GeneralPath) shape).lineTo(23.507992, 25.472996);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4A732F));
        g.fill(shape);

        // _0_0_0_11
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.477, 16.152);
        ((GeneralPath) shape).curveTo(20.227, 16.102001, 20.078, 16.199001, 20.026999, 16.449001);
        ((GeneralPath) shape).curveTo(19.977, 16.699001, 20.078, 16.848001, 20.328, 16.898);
        ((GeneralPath) shape).curveTo(20.578, 16.949001, 20.727, 16.848001, 20.776999, 16.602001);
        ((GeneralPath) shape).curveTo(20.828, 16.352001, 20.727, 16.199001, 20.477, 16.152);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4C7A31));
        g.fill(shape);

        // _0_0_0_12
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.535, 22.777);
        ((GeneralPath) shape).curveTo(22.41, 22.727001, 22.324, 22.777, 22.273, 22.926);
        ((GeneralPath) shape).curveTo(22.223001, 23.102001, 22.273, 23.188, 22.426, 23.188);
        ((GeneralPath) shape).curveTo(22.574001, 23.237999, 22.672, 23.188, 22.723001, 23.039);
        ((GeneralPath) shape).curveTo(22.723001, 22.862999, 22.660002, 22.777, 22.535002, 22.777);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x508033));
        g.fill(shape);

        // _0_0_0_13
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.574, 24.199);
        ((GeneralPath) shape).curveTo(22.272999, 24.147999, 22.098, 24.262, 22.050999, 24.535);
        ((GeneralPath) shape).curveTo(21.999998, 24.809, 22.112999, 24.973, 22.387, 25.023);
        ((GeneralPath) shape).curveTo(22.66, 25.121, 22.824, 25.023, 22.870998, 24.723001);
        ((GeneralPath) shape).curveTo(22.948997, 24.422, 22.847998, 24.250002, 22.573997, 24.199001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A8F39));
        g.fill(shape);

        // _0_0_0_14
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.348, 25.211);
        ((GeneralPath) shape).curveTo(22.223, 25.16, 22.137, 25.223, 22.086, 25.395);
        ((GeneralPath) shape).curveTo(22.035, 25.52, 22.102001, 25.609001, 22.273, 25.66);
        ((GeneralPath) shape).curveTo(22.398, 25.707, 22.488, 25.645, 22.535, 25.473);
        ((GeneralPath) shape).curveTo(22.535, 25.348, 22.473, 25.258, 22.348, 25.211);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_15
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.508, 23.75);
        ((GeneralPath) shape).curveTo(23.285, 23.699, 23.147999, 23.801, 23.098, 24.051);
        ((GeneralPath) shape).curveTo(22.996, 24.273, 23.086, 24.41, 23.359, 24.461);
        ((GeneralPath) shape).curveTo(23.585999, 24.512001, 23.723, 24.426, 23.772999, 24.199001);
        ((GeneralPath) shape).curveTo(23.82, 23.949001, 23.734, 23.801, 23.508, 23.750002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_16
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.258, 22.215);
        ((GeneralPath) shape).curveTo(23.859, 22.113, 23.609, 22.266, 23.508, 22.664);
        ((GeneralPath) shape).curveTo(23.484, 22.84, 23.508, 23.0, 23.585999, 23.152);
        ((GeneralPath) shape).curveTo(23.683998, 23.273, 23.819998, 23.363, 23.995998, 23.414);
        ((GeneralPath) shape).curveTo(24.144999, 23.438, 24.296999, 23.414, 24.444998, 23.34);
        ((GeneralPath) shape).curveTo(24.597998, 23.238, 24.683998, 23.102, 24.706997, 22.926);
        ((GeneralPath) shape).curveTo(24.780996, 22.551, 24.632998, 22.312, 24.257998, 22.215);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_17
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.746, 20.828);
        ((GeneralPath) shape).curveTo(24.422, 20.780998, 24.234001, 20.905998, 24.184, 21.203);
        ((GeneralPath) shape).curveTo(24.082, 21.554998, 24.195, 21.754, 24.52, 21.804998);
        ((GeneralPath) shape).curveTo(24.871, 21.878998, 25.07, 21.753998, 25.117, 21.429998);
        ((GeneralPath) shape).curveTo(25.219, 21.128998, 25.094, 20.929998, 24.746, 20.828);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_18
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.172, 21.316);
        ((GeneralPath) shape).curveTo(22.871, 21.266, 22.699001, 21.379, 22.648, 21.652);
        ((GeneralPath) shape).curveTo(22.598001, 21.926, 22.711, 22.102001, 22.984001, 22.176);
        ((GeneralPath) shape).curveTo(23.262001, 22.227001, 23.422, 22.113, 23.473001, 21.84);
        ((GeneralPath) shape).curveTo(23.523, 21.715, 23.508001, 21.602, 23.434002, 21.504);
        ((GeneralPath) shape).curveTo(23.387001, 21.402, 23.297003, 21.34, 23.172003, 21.316);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x508033));
        g.fill(shape);

        // _0_0_0_19
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.621, 20.043);
        ((GeneralPath) shape).curveTo(23.496, 19.991999, 23.371, 20.019999, 23.246, 20.116999);
        ((GeneralPath) shape).curveTo(23.121, 20.194998, 23.047, 20.293, 23.023, 20.418);
        ((GeneralPath) shape).curveTo(22.949001, 20.741999, 23.074001, 20.953, 23.398, 21.054998);
        ((GeneralPath) shape).curveTo(23.523, 21.078, 23.648, 21.054998, 23.773, 20.979998);
        ((GeneralPath) shape).curveTo(23.898, 20.901999, 23.973001, 20.792997, 23.996, 20.640997);
        ((GeneralPath) shape).curveTo(24.047, 20.519997, 24.023, 20.394997, 23.922, 20.269997);
        ((GeneralPath) shape).curveTo(23.848001, 20.144997, 23.746, 20.069996, 23.621, 20.042997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_20
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.707, 19.07);
        ((GeneralPath) shape).curveTo(24.508001, 19.02, 24.332, 19.043, 24.184, 19.145);
        ((GeneralPath) shape).curveTo(24.035, 19.27, 23.934, 19.418001, 23.883, 19.594);
        ((GeneralPath) shape).curveTo(23.781, 20.043, 23.956999, 20.332, 24.406, 20.457);
        ((GeneralPath) shape).curveTo(24.582, 20.480001, 24.758, 20.441, 24.93, 20.344);
        ((GeneralPath) shape).curveTo(25.105, 20.242, 25.207, 20.094, 25.23, 19.895);
        ((GeneralPath) shape).curveTo(25.281, 19.695, 25.258, 19.52, 25.156, 19.371);
        ((GeneralPath) shape).curveTo(25.031, 19.195, 24.883, 19.094, 24.707, 19.07);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_21
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.246, 18.77);
        ((GeneralPath) shape).curveTo(23.047, 18.695, 22.898, 18.785, 22.797, 19.035);
        ((GeneralPath) shape).curveTo(22.773, 19.258, 22.871, 19.421999, 23.098001, 19.52);
        ((GeneralPath) shape).curveTo(23.348001, 19.57, 23.496002, 19.469, 23.547, 19.223);
        ((GeneralPath) shape).curveTo(23.598001, 18.973, 23.496, 18.82, 23.246, 18.77);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_22
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.273, 19.559);
        ((GeneralPath) shape).curveTo(22.148, 19.508, 22.023, 19.531, 21.898, 19.633);
        ((GeneralPath) shape).curveTo(21.801, 19.706999, 21.738, 19.805, 21.711, 19.934);
        ((GeneralPath) shape).curveTo(21.613, 20.207, 21.727001, 20.395, 22.051, 20.492);
        ((GeneralPath) shape).curveTo(22.375, 20.543001, 22.562, 20.418001, 22.609001, 20.121);
        ((GeneralPath) shape).curveTo(22.637001, 19.996, 22.625002, 19.871, 22.574001, 19.746);
        ((GeneralPath) shape).curveTo(22.500002, 19.645, 22.398, 19.582, 22.273, 19.559);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_23
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.711, 18.324);
        ((GeneralPath) shape).curveTo(21.465, 18.272999, 21.289, 18.387, 21.188, 18.66);
        ((GeneralPath) shape).curveTo(21.140999, 18.934, 21.25, 19.094, 21.527, 19.145);
        ((GeneralPath) shape).curveTo(21.773, 19.219, 21.949001, 19.121, 22.051, 18.844);
        ((GeneralPath) shape).curveTo(22.102001, 18.546999, 21.988, 18.371, 21.711, 18.324);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4C7A31));
        g.fill(shape);

        // _0_0_0_24
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(22.348, 17.535);
        ((GeneralPath) shape).curveTo(22.022999, 17.484, 21.836, 17.609, 21.789, 17.91);
        ((GeneralPath) shape).curveTo(21.762, 18.035, 21.789, 18.16, 21.862999, 18.285);
        ((GeneralPath) shape).curveTo(21.938, 18.41, 22.035, 18.484, 22.164, 18.508);
        ((GeneralPath) shape).curveTo(22.289, 18.535, 22.41, 18.508, 22.535, 18.434);
        ((GeneralPath) shape).curveTo(22.637, 18.359, 22.699, 18.262, 22.723, 18.133);
        ((GeneralPath) shape).curveTo(22.824, 17.809, 22.699, 17.609, 22.348, 17.535);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_25
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.34, 17.234);
        ((GeneralPath) shape).curveTo(21.141, 17.188, 21.016, 17.262, 20.965, 17.460999);
        ((GeneralPath) shape).curveTo(20.914, 17.659998, 20.988, 17.784998, 21.188, 17.835999);
        ((GeneralPath) shape).curveTo(21.390999, 17.887, 21.512, 17.808998, 21.562, 17.609);
        ((GeneralPath) shape).curveTo(21.613, 17.41, 21.539, 17.285, 21.34, 17.234);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_26
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.824, 16.074);
        ((GeneralPath) shape).curveTo(21.526999, 16.026999, 21.34, 16.151999, 21.262, 16.449);
        ((GeneralPath) shape).curveTo(21.210999, 16.772999, 21.335999, 16.960999, 21.637, 17.012);
        ((GeneralPath) shape).curveTo(21.938, 17.061998, 22.125, 16.938, 22.199, 16.637);
        ((GeneralPath) shape).curveTo(22.25, 16.335999, 22.125, 16.151999, 21.824, 16.074);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_27
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.172, 16.938);
        ((GeneralPath) shape).curveTo(22.922, 16.887, 22.773, 16.987999, 22.723001, 17.234);
        ((GeneralPath) shape).curveTo(22.699001, 17.335999, 22.711002, 17.421999, 22.762001, 17.5);
        ((GeneralPath) shape).curveTo(22.812, 17.598, 22.887001, 17.66, 22.984001, 17.688);
        ((GeneralPath) shape).curveTo(23.234001, 17.734, 23.398, 17.637, 23.473001, 17.387);
        ((GeneralPath) shape).curveTo(23.523, 17.137, 23.422, 16.987999, 23.172, 16.938);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_28
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.035, 17.945);
        ((GeneralPath) shape).curveTo(23.758, 17.897999, 23.57, 18.008, 23.473, 18.285);
        ((GeneralPath) shape).curveTo(23.421999, 18.559, 23.535, 18.746, 23.809, 18.844);
        ((GeneralPath) shape).curveTo(24.109, 18.895, 24.297, 18.77, 24.371, 18.473);
        ((GeneralPath) shape).curveTo(24.422, 18.171999, 24.309, 17.996, 24.035, 17.945);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x508033));
        g.fill(shape);

        // _0_0_0_29
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.379, 22.141);
        ((GeneralPath) shape).curveTo(25.18, 22.09, 25.059, 22.164001, 25.008, 22.363);
        ((GeneralPath) shape).curveTo(24.956999, 22.539001, 25.031, 22.652, 25.23, 22.703001);
        ((GeneralPath) shape).curveTo(25.406, 22.754002, 25.52, 22.676, 25.566, 22.477001);
        ((GeneralPath) shape).curveTo(25.617, 22.301, 25.555, 22.191002, 25.379, 22.141);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5A8F39));
        g.fill(shape);

        // _0_0_0_30
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(25.082, 22.965);
        ((GeneralPath) shape).curveTo(24.906, 22.914, 24.793001, 22.988, 24.746, 23.188);
        ((GeneralPath) shape).curveTo(24.695, 23.362999, 24.77, 23.473, 24.969, 23.522999);
        ((GeneralPath) shape).curveTo(25.145, 23.574, 25.258, 23.499998, 25.305, 23.300999);
        ((GeneralPath) shape).curveTo(25.355, 23.124998, 25.281, 23.012, 25.082, 22.964998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_31
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(24.297, 23.75);
        ((GeneralPath) shape).curveTo(24.098001, 23.699, 23.973001, 23.773, 23.922, 23.973);
        ((GeneralPath) shape).curveTo(23.871, 24.175999, 23.945002, 24.296999, 24.145, 24.348);
        ((GeneralPath) shape).curveTo(24.344, 24.397999, 24.469, 24.324, 24.52, 24.125);
        ((GeneralPath) shape).curveTo(24.57, 23.926, 24.496, 23.801, 24.297, 23.75);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_32
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(23.547, 24.723);
        ((GeneralPath) shape).curveTo(23.422, 24.723, 23.336, 24.785, 23.285002, 24.91);
        ((GeneralPath) shape).curveTo(23.285002, 25.086, 23.348001, 25.171999, 23.473001, 25.171999);
        ((GeneralPath) shape).curveTo(23.598001, 25.223, 23.684002, 25.171999, 23.734001, 25.022999);
        ((GeneralPath) shape).curveTo(23.785002, 24.870998, 23.723001, 24.772999, 23.547, 24.723);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_33
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.711, 25.922);
        ((GeneralPath) shape).curveTo(21.562, 25.871, 21.465, 25.934, 21.414, 26.109001);
        ((GeneralPath) shape).curveTo(21.414, 26.258001, 21.477, 26.359001, 21.602, 26.406002);
        ((GeneralPath) shape).curveTo(21.75, 26.406002, 21.848, 26.344002, 21.897999, 26.219002);
        ((GeneralPath) shape).curveTo(21.949, 26.020002, 21.887, 25.922, 21.710999, 25.922);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_34
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.992, 26.707);
        ((GeneralPath) shape).lineTo(20.141, 26.219);
        ((GeneralPath) shape).curveTo(20.715, 26.27, 21.141, 26.031, 21.414001, 25.508);
        ((GeneralPath) shape).curveTo(21.613, 25.109, 21.637001, 24.734, 21.488, 24.387);
        ((GeneralPath) shape).curveTo(21.637001, 24.311998, 21.75, 24.199, 21.824001, 24.050999);
        ((GeneralPath) shape).curveTo(21.977001, 23.699, 21.977001, 23.362999, 21.824001, 23.039);
        ((GeneralPath) shape).lineTo(21.977001, 22.812);
        ((GeneralPath) shape).curveTo(22.152, 22.488, 22.188002, 22.141, 22.090002, 21.766);
        ((GeneralPath) shape).curveTo(21.988003, 21.414001, 21.777002, 21.156, 21.453003, 20.980001);
        ((GeneralPath) shape).lineTo(21.375004, 20.941002);
        ((GeneralPath) shape).curveTo(21.477003, 20.668001, 21.477003, 20.406002, 21.375004, 20.156002);
        ((GeneralPath) shape).curveTo(21.254004, 19.883001, 21.066004, 19.684002, 20.816004, 19.559002);
        ((GeneralPath) shape).curveTo(20.715004, 19.480001, 20.602003, 19.445002, 20.477003, 19.445002);
        ((GeneralPath) shape).curveTo(20.578003, 19.195002, 20.578003, 18.957, 20.477003, 18.734001);
        ((GeneralPath) shape).curveTo(20.402002, 18.484001, 20.254004, 18.309002, 20.027002, 18.211);
        ((GeneralPath) shape).curveTo(19.879002, 18.137001, 19.730001, 18.098, 19.578003, 18.098);
        ((GeneralPath) shape).curveTo(19.629004, 17.772999, 19.516003, 17.535, 19.242002, 17.387);
        ((GeneralPath) shape).curveTo(18.969002, 17.210999, 18.691002, 17.262, 18.418003, 17.535);
        ((GeneralPath) shape).curveTo(18.395002, 17.484, 18.305002, 17.438, 18.156004, 17.387);
        ((GeneralPath) shape).lineTo(18.121004, 17.421999);
        ((GeneralPath) shape).curveTo(18.121004, 16.874998, 17.883003, 16.561998, 17.406004, 16.487999);
        ((GeneralPath) shape).lineTo(17.070004, 16.522999);
        ((GeneralPath) shape).curveTo(16.973003, 16.272999, 16.773003, 16.112999, 16.473003, 16.039);
        ((GeneralPath) shape).curveTo(16.297003, 16.012, 16.086004, 16.074, 15.836003, 16.227);
        ((GeneralPath) shape).lineTo(15.801003, 16.262);
        ((GeneralPath) shape).curveTo(15.723003, 15.862999, 15.523004, 15.577999, 15.199003, 15.401999);
        ((GeneralPath) shape).curveTo(15.102003, 15.327999, 14.965003, 15.289, 14.789003, 15.289);
        ((GeneralPath) shape).curveTo(14.887003, 15.066, 14.898004, 14.839999, 14.824003, 14.617);
        ((GeneralPath) shape).curveTo(14.750003, 14.367, 14.613003, 14.191, 14.414003, 14.094);
        ((GeneralPath) shape).curveTo(14.215003, 14.0199995, 14.051003, 13.992, 13.926003, 14.0199995);
        ((GeneralPath) shape).curveTo(13.828004, 13.7699995, 13.703004, 13.617, 13.555003, 13.566);
        ((GeneralPath) shape).lineTo(13.516004, 13.531);
        ((GeneralPath) shape).curveTo(13.566004, 13.207, 13.430003, 12.969, 13.102004, 12.82);
        ((GeneralPath) shape).curveTo(12.930004, 12.719, 12.730004, 12.707, 12.5040045, 12.781);
        ((GeneralPath) shape).curveTo(12.430004, 12.559, 12.293004, 12.383, 12.094005, 12.258);
        ((GeneralPath) shape).curveTo(11.742004, 12.059, 11.418005, 12.098001, 11.117004, 12.371);
        ((GeneralPath) shape).lineTo(10.969005, 12.258);
        ((GeneralPath) shape).curveTo(10.418005, 12.008, 9.969005, 12.121, 9.621004, 12.594001);
        ((GeneralPath) shape).curveTo(9.148005, 12.496001, 8.809004, 12.645, 8.609004, 13.043001);
        ((GeneralPath) shape).curveTo(8.512004, 13.219001, 8.484004, 13.441001, 8.535004, 13.719001);
        ((GeneralPath) shape).curveTo(7.9880037, 13.668001, 7.5740037, 13.879001, 7.3010035, 14.3550005);
        ((GeneralPath) shape).lineTo(7.1910033, 14.652);
        ((GeneralPath) shape).curveTo(6.6640034, 14.652, 6.266003, 14.891001, 5.9920034, 15.363001);
        ((GeneralPath) shape).curveTo(5.7660036, 15.766001, 5.7660036, 16.176, 5.9920034, 16.602001);
        ((GeneralPath) shape).curveTo(5.7660036, 16.652, 5.5940037, 16.789001, 5.4690037, 17.012001);
        ((GeneralPath) shape).curveTo(5.316004, 17.262001, 5.3050036, 17.512001, 5.4300036, 17.762001);
        ((GeneralPath) shape).curveTo(5.355004, 17.836, 5.3200035, 17.934002, 5.3200035, 18.062);
        ((GeneralPath) shape).curveTo(5.2930036, 18.188, 5.3050036, 18.324, 5.3550034, 18.473);
        ((GeneralPath) shape).curveTo(5.055003, 18.647999, 4.8670034, 18.897999, 4.7930036, 19.223);
        ((GeneralPath) shape).curveTo(4.770004, 19.546999, 4.8550034, 19.82, 5.0550036, 20.043);
        ((GeneralPath) shape).curveTo(4.8790035, 20.219, 4.7810035, 20.406, 4.7580037, 20.605);
        ((GeneralPath) shape).curveTo(4.6800036, 20.98, 4.8200035, 21.277, 5.1680036, 21.504);
        ((GeneralPath) shape).curveTo(5.066004, 21.605, 5.0200033, 21.715, 5.0200033, 21.84);
        ((GeneralPath) shape).curveTo(4.9920034, 21.914, 5.0040035, 22.055, 5.055003, 22.254);
        ((GeneralPath) shape).curveTo(4.879003, 22.777, 5.043003, 23.188, 5.543003, 23.487999);
        ((GeneralPath) shape).curveTo(5.691003, 23.561998, 5.855003, 23.602, 6.0270033, 23.602);
        ((GeneralPath) shape).curveTo(5.9800034, 23.897999, 6.043003, 24.171999, 6.2150035, 24.421999);
        ((GeneralPath) shape).curveTo(6.3910036, 24.671999, 6.6290035, 24.824, 6.9260035, 24.870998);
        ((GeneralPath) shape).curveTo(7.1520033, 24.870998, 7.3120036, 24.847998, 7.4140034, 24.796999);
        ((GeneralPath) shape).curveTo(7.4140034, 25.098, 7.5120034, 25.359, 7.7150035, 25.581999);
        ((GeneralPath) shape).curveTo(7.8870034, 25.831999, 8.125004, 25.98, 8.426003, 26.030998);
        ((GeneralPath) shape).curveTo(8.398004, 26.308998, 8.488004, 26.558998, 8.688004, 26.780998);
        ((GeneralPath) shape).curveTo(8.863004, 27.030998, 9.098003, 27.179998, 9.398004, 27.229998);
        ((GeneralPath) shape).lineTo(9.848003, 27.194998);
        ((GeneralPath) shape).curveTo(9.848003, 27.491999, 9.949003, 27.753998, 10.148004, 27.979998);
        ((GeneralPath) shape).curveTo(10.324003, 28.229998, 10.559004, 28.378998, 10.859004, 28.429998);
        ((GeneralPath) shape).curveTo(11.281004, 28.479998, 11.645004, 28.354998, 11.9450035, 28.054998);
        ((GeneralPath) shape).curveTo(12.0700035, 28.179998, 12.258003, 28.265999, 12.508003, 28.315998);
        ((GeneralPath) shape).lineTo(12.617003, 28.315998);
        ((GeneralPath) shape).curveTo(12.793003, 28.640999, 13.043003, 28.815998, 13.367003, 28.839998);
        ((GeneralPath) shape).curveTo(13.719004, 28.890999, 14.016004, 28.788998, 14.266004, 28.542997);
        ((GeneralPath) shape).curveTo(14.465004, 28.667997, 14.613004, 28.729998, 14.715004, 28.729998);
        ((GeneralPath) shape).curveTo(15.016004, 28.753998, 15.277004, 28.679998, 15.500004, 28.503998);
        ((GeneralPath) shape).curveTo(15.652004, 28.702997, 15.824004, 28.815998, 16.027004, 28.839998);
        ((GeneralPath) shape).curveTo(16.273005, 28.866999, 16.500004, 28.804998, 16.699005, 28.651999);
        ((GeneralPath) shape).curveTo(16.898005, 28.526999, 17.012005, 28.339998, 17.035006, 28.093998);
        ((GeneralPath) shape).lineTo(17.035006, 28.019999);
        ((GeneralPath) shape).lineTo(17.148006, 28.054998);
        ((GeneralPath) shape).curveTo(17.672007, 28.128998, 18.023006, 27.918, 18.195007, 27.418);
        ((GeneralPath) shape).curveTo(18.223007, 27.418, 18.383007, 27.383, 18.684008, 27.309);
        ((GeneralPath) shape).curveTo(19.281008, 27.43, 19.719007, 27.23, 19.992008, 26.707);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x466B2C));
        g.fill(shape);

        // _0_0_0_35
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.211, 27.156);
        ((GeneralPath) shape).curveTo(15.910001, 27.055, 15.699, 27.18, 15.574, 27.531);
        ((GeneralPath) shape).curveTo(15.398001, 27.879, 15.461, 28.117, 15.762, 28.242);
        ((GeneralPath) shape).curveTo(16.012001, 28.367, 16.223, 28.242, 16.398, 27.867);
        ((GeneralPath) shape).curveTo(16.523, 27.52, 16.461, 27.281, 16.211, 27.156);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E943B));
        g.fill(shape);

        // _0_0_0_36
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.938, 26.969);
        ((GeneralPath) shape).curveTo(14.613, 26.844, 14.387, 26.957, 14.262, 27.305);
        ((GeneralPath) shape).curveTo(14.188, 27.43, 14.176, 27.566, 14.227, 27.719);
        ((GeneralPath) shape).curveTo(14.277, 27.867, 14.363, 27.965, 14.488, 28.016);
        ((GeneralPath) shape).curveTo(14.812, 28.117, 15.039, 28.004002, 15.164, 27.68);
        ((GeneralPath) shape).curveTo(15.285, 27.332, 15.2109995, 27.094, 14.938, 26.969);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_37
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.59, 27.344);
        ((GeneralPath) shape).curveTo(13.316, 27.191, 13.1050005, 27.281, 12.953, 27.605);
        ((GeneralPath) shape).curveTo(12.805, 27.879, 12.891, 28.094, 13.215, 28.241999);
        ((GeneralPath) shape).curveTo(13.34, 28.293, 13.465, 28.293, 13.59, 28.241999);
        ((GeneralPath) shape).curveTo(13.715, 28.190998, 13.801001, 28.105, 13.852, 27.98);
        ((GeneralPath) shape).curveTo(13.902, 27.855, 13.902, 27.73, 13.852, 27.605);
        ((GeneralPath) shape).curveTo(13.801001, 27.456999, 13.715, 27.366999, 13.59, 27.344);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_38
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.59, 25.922);
        ((GeneralPath) shape).curveTo(13.34, 25.797, 13.141, 25.871, 12.992001, 26.145);
        ((GeneralPath) shape).curveTo(12.867001, 26.418001, 12.941001, 26.633001, 13.215, 26.781);
        ((GeneralPath) shape).curveTo(13.516, 26.906, 13.727, 26.82, 13.852, 26.52);
        ((GeneralPath) shape).curveTo(13.902, 26.395, 13.902, 26.27, 13.852, 26.145);
        ((GeneralPath) shape).curveTo(13.801001, 26.02, 13.715, 25.945, 13.59, 25.922);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_39
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.469, 26.895);
        ((GeneralPath) shape).curveTo(12.266, 26.82, 12.117, 26.867, 12.0199995, 27.043001);
        ((GeneralPath) shape).curveTo(11.940999, 27.242, 11.992, 27.395, 12.167999, 27.492);
        ((GeneralPath) shape).curveTo(12.367, 27.566, 12.515999, 27.52, 12.617, 27.344);
        ((GeneralPath) shape).curveTo(12.691, 27.145, 12.641, 26.992, 12.469, 26.895);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_40
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.457, 26.594);
        ((GeneralPath) shape).curveTo(11.105, 26.469, 10.859, 26.57, 10.707, 26.895);
        ((GeneralPath) shape).curveTo(10.559, 27.27, 10.656, 27.52, 11.007999, 27.641);
        ((GeneralPath) shape).curveTo(11.332, 27.793001, 11.582, 27.691, 11.757999, 27.344);
        ((GeneralPath) shape).curveTo(11.879, 26.992, 11.780999, 26.742, 11.457, 26.594);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_41
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.941, 25.473);
        ((GeneralPath) shape).curveTo(11.668, 25.371, 11.48, 25.456999, 11.383, 25.734);
        ((GeneralPath) shape).curveTo(11.258, 25.984, 11.332001, 26.184, 11.6050005, 26.331999);
        ((GeneralPath) shape).curveTo(11.879001, 26.433998, 12.082001, 26.343998, 12.207001, 26.07);
        ((GeneralPath) shape).curveTo(12.305, 25.796999, 12.219001, 25.598, 11.941001, 25.473);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_42
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.656, 24.945);
        ((GeneralPath) shape).curveTo(12.453, 24.848, 12.305, 24.91, 12.203, 25.133);
        ((GeneralPath) shape).curveTo(12.1050005, 25.359, 12.168, 25.522999, 12.391, 25.621);
        ((GeneralPath) shape).curveTo(12.617, 25.695, 12.766, 25.633, 12.84, 25.434);
        ((GeneralPath) shape).curveTo(12.965, 25.211, 12.902, 25.047, 12.656, 24.945);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_43
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.332, 24.945);
        ((GeneralPath) shape).curveTo(10.132999, 24.848, 9.934, 24.836, 9.734, 24.91);
        ((GeneralPath) shape).curveTo(9.535, 25.008, 9.387, 25.16, 9.285, 25.359);
        ((GeneralPath) shape).curveTo(9.184, 25.559, 9.184, 25.758, 9.285, 25.956999);
        ((GeneralPath) shape).curveTo(9.359, 26.159998, 9.496, 26.296999, 9.695, 26.370998);
        ((GeneralPath) shape).curveTo(9.898, 26.468998, 10.098, 26.468998, 10.297, 26.370998);
        ((GeneralPath) shape).curveTo(10.496, 26.296999, 10.633, 26.155998, 10.707, 25.956999);
        ((GeneralPath) shape).curveTo(10.809, 25.784998, 10.82, 25.585999, 10.745999, 25.359);
        ((GeneralPath) shape).curveTo(10.671999, 25.16, 10.534999, 25.022999, 10.332, 24.945);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_44
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.859, 24.086);
        ((GeneralPath) shape).curveTo(10.582, 23.961, 10.383, 24.051, 10.258, 24.348);
        ((GeneralPath) shape).curveTo(10.207001, 24.449, 10.207001, 24.562, 10.258, 24.688);
        ((GeneralPath) shape).curveTo(10.309, 24.809, 10.383, 24.897999, 10.4800005, 24.945);
        ((GeneralPath) shape).curveTo(10.781, 25.07, 10.992001, 24.996, 11.117001, 24.723);
        ((GeneralPath) shape).curveTo(11.246, 24.421999, 11.156, 24.211, 10.859, 24.086);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_45
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.211, 22.887);
        ((GeneralPath) shape).curveTo(9.035001, 22.811998, 8.859, 22.811998, 8.688001, 22.887);
        ((GeneralPath) shape).curveTo(8.488001, 22.964998, 8.348001, 23.089998, 8.273001, 23.262);
        ((GeneralPath) shape).curveTo(8.102001, 23.688, 8.227001, 24.012, 8.648001, 24.234);
        ((GeneralPath) shape).curveTo(8.824, 24.311998, 9.012001, 24.311998, 9.211, 24.234);
        ((GeneralPath) shape).curveTo(9.387, 24.16, 9.512, 24.022999, 9.586, 23.824);
        ((GeneralPath) shape).curveTo(9.660001, 23.647999, 9.660001, 23.473, 9.586, 23.300999);
        ((GeneralPath) shape).curveTo(9.512, 23.102, 9.387, 22.964998, 9.211, 22.887);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_46
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.613, 24.535);
        ((GeneralPath) shape).curveTo(8.312, 24.41, 8.09, 24.5, 7.9379997, 24.796999);
        ((GeneralPath) shape).curveTo(7.8399997, 25.120998, 7.9259996, 25.348, 8.198999, 25.473);
        ((GeneralPath) shape).curveTo(8.499999, 25.598, 8.723, 25.508, 8.874999, 25.206999);
        ((GeneralPath) shape).curveTo(8.999999, 24.909998, 8.909999, 24.688, 8.612999, 24.534998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_47
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.184, 22.363);
        ((GeneralPath) shape).curveTo(9.961, 22.266, 9.797, 22.34, 9.699, 22.59);
        ((GeneralPath) shape).curveTo(9.598001, 22.812, 9.660001, 22.977, 9.887, 23.074);
        ((GeneralPath) shape).curveTo(10.109, 23.175999, 10.285, 23.112999, 10.41, 22.887);
        ((GeneralPath) shape).curveTo(10.507999, 22.664, 10.434, 22.487999, 10.184, 22.362999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_48
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.699, 24.199);
        ((GeneralPath) shape).curveTo(9.672, 24.171999, 9.621, 24.171999, 9.547, 24.199);
        ((GeneralPath) shape).curveTo(9.496, 24.223, 9.4609995, 24.262, 9.434, 24.312);
        ((GeneralPath) shape).curveTo(9.387, 24.41, 9.422, 24.5, 9.547, 24.574);
        ((GeneralPath) shape).curveTo(9.672, 24.625, 9.762, 24.585999, 9.809, 24.460999);
        ((GeneralPath) shape).curveTo(9.859, 24.335999, 9.82, 24.249998, 9.699, 24.199);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_49
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.211, 21.277);
        ((GeneralPath) shape).curveTo(8.887, 21.105, 8.648001, 21.191, 8.5, 21.539);
        ((GeneralPath) shape).curveTo(8.426, 21.664, 8.41, 21.805, 8.461, 21.953);
        ((GeneralPath) shape).curveTo(8.535001, 22.102, 8.637, 22.203, 8.762, 22.254);
        ((GeneralPath) shape).curveTo(8.887, 22.301, 9.023, 22.301, 9.172, 22.254);
        ((GeneralPath) shape).curveTo(9.324, 22.203, 9.422, 22.102, 9.473, 21.953);
        ((GeneralPath) shape).curveTo(9.598, 21.629, 9.511999, 21.401999, 9.2109995, 21.276999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x518033));
        g.fill(shape);

        // _0_0_0_50
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.453, 23.113);
        ((GeneralPath) shape).curveTo(7.176, 22.988, 6.965, 23.074001, 6.816, 23.375);
        ((GeneralPath) shape).curveTo(6.691, 23.699, 6.777, 23.926, 7.078, 24.047);
        ((GeneralPath) shape).curveTo(7.352, 24.172, 7.5620003, 24.086, 7.715, 23.785002);
        ((GeneralPath) shape).curveTo(7.84, 23.461002, 7.75, 23.238, 7.453, 23.113);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_51
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.141, 21.914);
        ((GeneralPath) shape).curveTo(5.7929997, 21.789, 5.5309997, 21.890999, 5.3549995, 22.215);
        ((GeneralPath) shape).curveTo(5.2299995, 22.566, 5.332, 22.828001, 5.6559997, 23.0);
        ((GeneralPath) shape).curveTo(6.0039997, 23.125, 6.266, 23.012, 6.4409995, 22.664);
        ((GeneralPath) shape).curveTo(6.5899997, 22.289, 6.4919996, 22.039, 6.1409993, 21.914);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_52
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.414, 21.539);
        ((GeneralPath) shape).curveTo(7.039, 21.366999, 6.766, 21.465, 6.59, 21.84);
        ((GeneralPath) shape).curveTo(6.539, 21.992, 6.539, 22.141, 6.59, 22.289);
        ((GeneralPath) shape).curveTo(6.664, 22.465, 6.777, 22.578, 6.926, 22.629);
        ((GeneralPath) shape).curveTo(7.277, 22.801, 7.539, 22.703, 7.711, 22.328);
        ((GeneralPath) shape).curveTo(7.762, 22.175999, 7.762, 22.026999, 7.711, 21.879);
        ((GeneralPath) shape).curveTo(7.664, 21.703, 7.562, 21.59, 7.414, 21.539);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_53
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.238, 22.363);
        ((GeneralPath) shape).curveTo(8.012, 22.266, 7.875, 22.328001, 7.824, 22.551);
        ((GeneralPath) shape).curveTo(7.7269998, 22.727001, 7.773, 22.863, 7.9769998, 22.961);
        ((GeneralPath) shape).curveTo(8.176, 23.012001, 8.311999, 22.949001, 8.387, 22.773);
        ((GeneralPath) shape).curveTo(8.488, 22.602001, 8.438, 22.465, 8.238, 22.363);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E943B));
        g.fill(shape);

        // _0_0_0_54
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.898, 20.156);
        ((GeneralPath) shape).curveTo(7.5, 20.031, 7.2269998, 20.145, 7.0779996, 20.492);
        ((GeneralPath) shape).curveTo(7.0269995, 20.641, 7.0269995, 20.793001, 7.0779996, 20.941);
        ((GeneralPath) shape).curveTo(7.1519995, 21.117, 7.266, 21.23, 7.4139996, 21.277);
        ((GeneralPath) shape).curveTo(7.7619996, 21.453001, 8.023, 21.34, 8.198999, 20.941);
        ((GeneralPath) shape).curveTo(8.374999, 20.594, 8.273, 20.332, 7.8979993, 20.156);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x518033));
        g.fill(shape);

        // _0_0_0_55
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.195, 20.941);
        ((GeneralPath) shape).curveTo(10.870999, 20.816, 10.6449995, 20.906, 10.5199995, 21.203);
        ((GeneralPath) shape).curveTo(10.445, 21.504, 10.535, 21.714998, 10.780999, 21.839998);
        ((GeneralPath) shape).curveTo(11.108999, 21.964998, 11.331999, 21.878998, 11.456999, 21.578);
        ((GeneralPath) shape).curveTo(11.604999, 21.276999, 11.519999, 21.066, 11.194999, 20.941);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_56
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.691, 21.277);
        ((GeneralPath) shape).curveTo(12.418, 21.18, 12.219, 21.266, 12.094, 21.539);
        ((GeneralPath) shape).curveTo(11.992, 21.84, 12.078, 22.027, 12.355, 22.102);
        ((GeneralPath) shape).curveTo(12.452999, 22.151999, 12.566, 22.151999, 12.691, 22.102);
        ((GeneralPath) shape).curveTo(12.816, 22.078, 12.891, 22.004, 12.914, 21.879);
        ((GeneralPath) shape).curveTo(13.039, 21.629, 12.964999, 21.43, 12.691, 21.277);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_57
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.473, 21.617);
        ((GeneralPath) shape).curveTo(16.223, 21.539001, 16.035, 21.617, 15.91, 21.84);
        ((GeneralPath) shape).curveTo(15.809, 22.09, 15.887, 22.266, 16.133, 22.363);
        ((GeneralPath) shape).curveTo(16.41, 22.465, 16.585999, 22.391, 16.66, 22.141);
        ((GeneralPath) shape).curveTo(16.785, 21.941, 16.723, 21.766, 16.473, 21.617);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_58
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.223, 23.789);
        ((GeneralPath) shape).curveTo(17.02, 23.688, 16.871, 23.75, 16.77, 23.973);
        ((GeneralPath) shape).curveTo(16.695, 24.199, 16.758001, 24.348, 16.957, 24.425999);
        ((GeneralPath) shape).curveTo(17.184, 24.499998, 17.332, 24.437998, 17.406, 24.237999);
        ((GeneralPath) shape).curveTo(17.531, 24.035, 17.469, 23.887, 17.223, 23.789);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E943B));
        g.fill(shape);

        // _0_0_0_59
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.27, 24.461);
        ((GeneralPath) shape).curveTo(18.121, 24.41, 18.02, 24.445, 17.969, 24.574001);
        ((GeneralPath) shape).curveTo(17.918, 24.723001, 17.957, 24.824001, 18.082, 24.871002);
        ((GeneralPath) shape).curveTo(18.230001, 24.922003, 18.332, 24.887003, 18.383001, 24.762003);
        ((GeneralPath) shape).curveTo(18.430002, 24.609003, 18.395, 24.512003, 18.27, 24.461002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_60
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.195, 22.328);
        ((GeneralPath) shape).curveTo(17.996, 22.254, 17.844, 22.300999, 17.746, 22.477);
        ((GeneralPath) shape).curveTo(17.672, 22.699, 17.734001, 22.852, 17.934, 22.925999);
        ((GeneralPath) shape).curveTo(18.133, 23.026999, 18.27, 22.964998, 18.344, 22.737999);
        ((GeneralPath) shape).curveTo(18.445, 22.561998, 18.395, 22.425999, 18.195, 22.328);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_61
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.008, 25.883);
        ((GeneralPath) shape).curveTo(17.758, 25.758, 17.57, 25.831999, 17.445, 26.105);
        ((GeneralPath) shape).curveTo(17.371, 26.355, 17.445, 26.543, 17.671999, 26.668);
        ((GeneralPath) shape).curveTo(17.969, 26.769999, 18.155998, 26.695, 18.23, 26.445);
        ((GeneralPath) shape).curveTo(18.383, 26.168, 18.305, 25.98, 18.008, 25.883);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_62
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.633, 26.82);
        ((GeneralPath) shape).curveTo(17.484, 26.77, 17.383, 26.82, 17.331999, 26.969);
        ((GeneralPath) shape).curveTo(17.258, 27.07, 17.296999, 27.168, 17.445, 27.27);
        ((GeneralPath) shape).curveTo(17.546999, 27.293001, 17.645, 27.242, 17.746, 27.117);
        ((GeneralPath) shape).curveTo(17.797, 26.992, 17.758, 26.895, 17.633, 26.82);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_63
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.773, 26.07);
        ((GeneralPath) shape).curveTo(16.496, 25.969, 16.297, 26.059, 16.172, 26.331999);
        ((GeneralPath) shape).curveTo(16.074001, 26.633, 16.160002, 26.82, 16.434, 26.894999);
        ((GeneralPath) shape).curveTo(16.535, 26.944998, 16.648, 26.944998, 16.773, 26.894999);
        ((GeneralPath) shape).curveTo(16.898, 26.870998, 16.973001, 26.793, 16.996, 26.668);
        ((GeneralPath) shape).curveTo(17.121, 26.418, 17.047, 26.219, 16.773, 26.07);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_64
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.688, 26.371);
        ((GeneralPath) shape).curveTo(15.535, 26.27, 15.438, 26.309, 15.387, 26.48);
        ((GeneralPath) shape).curveTo(15.312, 26.605, 15.348001, 26.719, 15.5, 26.82);
        ((GeneralPath) shape).curveTo(15.648, 26.867, 15.762, 26.82, 15.836, 26.668);
        ((GeneralPath) shape).curveTo(15.887, 26.519999, 15.836, 26.418, 15.688001, 26.370998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_65
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.02, 25.621);
        ((GeneralPath) shape).curveTo(18.793001, 25.547, 18.645, 25.609001, 18.566, 25.809);
        ((GeneralPath) shape).curveTo(18.441, 26.031, 18.504, 26.195, 18.754, 26.293);
        ((GeneralPath) shape).curveTo(18.956999, 26.394999, 19.105, 26.331999, 19.203, 26.105);
        ((GeneralPath) shape).curveTo(19.304998, 25.859, 19.241999, 25.695, 19.019999, 25.621);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x518033));
        g.fill(shape);

        // _0_0_0_66
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.027, 24.234);
        ((GeneralPath) shape).curveTo(19.656, 24.109, 19.391, 24.223, 19.242, 24.574);
        ((GeneralPath) shape).curveTo(19.066, 24.921999, 19.168001, 25.184, 19.543001, 25.359);
        ((GeneralPath) shape).curveTo(19.918001, 25.535, 20.191002, 25.421999, 20.367, 25.022999);
        ((GeneralPath) shape).curveTo(20.492, 24.647999, 20.379, 24.387, 20.027, 24.234);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_67
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.812, 23.0);
        ((GeneralPath) shape).curveTo(20.492, 22.875, 20.266, 22.965, 20.141, 23.262);
        ((GeneralPath) shape).curveTo(19.992, 23.535, 20.078001, 23.75, 20.402, 23.897999);
        ((GeneralPath) shape).curveTo(20.703001, 24.022999, 20.914, 23.938, 21.039, 23.637);
        ((GeneralPath) shape).curveTo(21.164, 23.335999, 21.09, 23.125, 20.812, 23.0);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_68
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.129, 23.152);
        ((GeneralPath) shape).curveTo(18.906, 23.074001, 18.719, 23.152, 18.566, 23.375);
        ((GeneralPath) shape).curveTo(18.469, 23.676, 18.543, 23.863, 18.793, 23.938);
        ((GeneralPath) shape).curveTo(18.894999, 23.987999, 19.004, 23.987999, 19.129, 23.938);
        ((GeneralPath) shape).curveTo(19.254, 23.91, 19.328, 23.836, 19.355, 23.711);
        ((GeneralPath) shape).curveTo(19.504, 23.488, 19.43, 23.301, 19.129, 23.152);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E943B));
        g.fill(shape);

        // _0_0_0_69
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.156, 23.336);
        ((GeneralPath) shape).curveTo(17.957, 23.262001, 17.809, 23.312, 17.707, 23.488);
        ((GeneralPath) shape).curveTo(17.633001, 23.688002, 17.684, 23.836, 17.859001, 23.938002);
        ((GeneralPath) shape).curveTo(18.059002, 24.012001, 18.207, 23.961002, 18.309002, 23.789001);
        ((GeneralPath) shape).curveTo(18.383001, 23.586002, 18.332003, 23.438002, 18.156002, 23.336002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_70
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.84, 21.992);
        ((GeneralPath) shape).curveTo(19.516, 21.867, 19.293, 21.953001, 19.168, 22.254);
        ((GeneralPath) shape).curveTo(19.116999, 22.379, 19.116999, 22.515999, 19.168, 22.664);
        ((GeneralPath) shape).curveTo(19.219, 22.789, 19.304998, 22.875, 19.429998, 22.925999);
        ((GeneralPath) shape).curveTo(19.753998, 23.050999, 19.979998, 22.964998, 20.104998, 22.664);
        ((GeneralPath) shape).curveTo(20.226997, 22.34, 20.140997, 22.112999, 19.839998, 21.991999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x518033));
        g.fill(shape);

        // _0_0_0_71
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.078, 21.242);
        ((GeneralPath) shape).curveTo(20.901999, 21.168001, 20.727, 21.168001, 20.554998, 21.242);
        ((GeneralPath) shape).curveTo(20.378998, 21.316, 20.253998, 21.441, 20.179998, 21.617);
        ((GeneralPath) shape).curveTo(20.003998, 22.016, 20.116999, 22.328001, 20.515999, 22.551);
        ((GeneralPath) shape).curveTo(20.690998, 22.625, 20.879, 22.625, 21.078, 22.551);
        ((GeneralPath) shape).curveTo(21.25, 22.477001, 21.375, 22.352001, 21.453, 22.176);
        ((GeneralPath) shape).curveTo(21.526999, 21.977001, 21.526999, 21.793001, 21.453, 21.617);
        ((GeneralPath) shape).curveTo(21.375, 21.441, 21.25, 21.316, 21.078, 21.242);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_72
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.73, 20.68);
        ((GeneralPath) shape).curveTo(19.504, 20.555, 19.344, 20.617, 19.241999, 20.867);
        ((GeneralPath) shape).curveTo(19.116999, 21.094, 19.179998, 21.254, 19.429998, 21.355001);
        ((GeneralPath) shape).curveTo(19.651999, 21.477001, 19.815998, 21.414001, 19.913998, 21.168001);
        ((GeneralPath) shape).curveTo(20.038998, 20.941002, 19.976997, 20.781002, 19.729998, 20.68);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_73
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.605, 21.242);
        ((GeneralPath) shape).curveTo(18.305, 21.168001, 18.094, 21.254, 17.969, 21.504);
        ((GeneralPath) shape).curveTo(17.844, 21.805, 17.934, 22.015999, 18.23, 22.140999);
        ((GeneralPath) shape).curveTo(18.508, 22.237999, 18.706999, 22.151999, 18.831999, 21.879);
        ((GeneralPath) shape).curveTo(18.98, 21.602, 18.905998, 21.390999, 18.605, 21.242);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_74
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.332, 21.691);
        ((GeneralPath) shape).curveTo(17.184, 21.641, 17.070002, 21.691, 16.996, 21.84);
        ((GeneralPath) shape).curveTo(16.945, 21.992, 16.996, 22.09, 17.145, 22.141);
        ((GeneralPath) shape).curveTo(17.297, 22.238, 17.395, 22.203001, 17.445, 22.027);
        ((GeneralPath) shape).curveTo(17.52, 21.902, 17.484, 21.789, 17.331999, 21.691);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_75
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.809, 22.812);
        ((GeneralPath) shape).curveTo(16.711, 22.762001, 16.637, 22.789, 16.586, 22.887001);
        ((GeneralPath) shape).curveTo(16.535, 23.012001, 16.57, 23.102001, 16.695, 23.152);
        ((GeneralPath) shape).curveTo(16.796999, 23.199001, 16.871, 23.164, 16.921999, 23.039);
        ((GeneralPath) shape).curveTo(16.973, 22.938, 16.933998, 22.862999, 16.808998, 22.812);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E943B));
        g.fill(shape);

        // _0_0_0_76
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.711, 25.211);
        ((GeneralPath) shape).curveTo(14.512, 25.133001, 14.363001, 25.184, 14.262, 25.359001);
        ((GeneralPath) shape).curveTo(14.188, 25.559002, 14.238, 25.707, 14.4140005, 25.809002);
        ((GeneralPath) shape).curveTo(14.637, 25.883001, 14.7890005, 25.820002, 14.863001, 25.621002);
        ((GeneralPath) shape).curveTo(14.9140005, 25.547003, 14.9140005, 25.461002, 14.863001, 25.359003);
        ((GeneralPath) shape).curveTo(14.836, 25.285004, 14.7890005, 25.234003, 14.711, 25.211002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_77
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.875, 25.211);
        ((GeneralPath) shape).curveTo(15.699, 25.109001, 15.562, 25.16, 15.461, 25.359001);
        ((GeneralPath) shape).curveTo(15.410001, 25.508001, 15.461, 25.633001, 15.609, 25.734001);
        ((GeneralPath) shape).curveTo(15.785, 25.832, 15.922, 25.781002, 16.023, 25.582);
        ((GeneralPath) shape).curveTo(16.125, 25.383001, 16.074001, 25.258001, 15.875001, 25.211);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_78
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.129, 23.938);
        ((GeneralPath) shape).curveTo(11.929999, 23.836, 11.781, 23.897999, 11.679999, 24.125);
        ((GeneralPath) shape).curveTo(11.605, 24.348, 11.667999, 24.5, 11.867, 24.574);
        ((GeneralPath) shape).curveTo(12.094, 24.647999, 12.242, 24.585999, 12.316, 24.387);
        ((GeneralPath) shape).curveTo(12.391, 24.16, 12.332, 24.012, 12.129, 23.938);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_79
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.68, 24.762);
        ((GeneralPath) shape).curveTo(11.559, 24.688, 11.445001, 24.723, 11.344, 24.870998);
        ((GeneralPath) shape).curveTo(11.297, 25.022999, 11.344, 25.120998, 11.496, 25.171999);
        ((GeneralPath) shape).curveTo(11.594, 25.245998, 11.695001, 25.210999, 11.793, 25.058998);
        ((GeneralPath) shape).curveTo(11.844, 24.909998, 11.805, 24.808998, 11.68, 24.761997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_80
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.344, 23.227);
        ((GeneralPath) shape).curveTo(11.094, 23.102, 10.922, 23.164, 10.82, 23.414);
        ((GeneralPath) shape).curveTo(10.695, 23.637, 10.757999, 23.824, 11.007999, 23.973);
        ((GeneralPath) shape).curveTo(11.257999, 24.050999, 11.445, 23.973, 11.57, 23.75);
        ((GeneralPath) shape).curveTo(11.6449995, 23.5, 11.57, 23.324, 11.344, 23.227);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_81
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.258, 23.336);
        ((GeneralPath) shape).curveTo(10.059, 23.238, 9.934, 23.289, 9.887, 23.488);
        ((GeneralPath) shape).curveTo(9.809, 23.637001, 9.859, 23.762001, 10.035, 23.863);
        ((GeneralPath) shape).curveTo(10.184, 23.961, 10.309, 23.910002, 10.41, 23.711);
        ((GeneralPath) shape).curveTo(10.457, 23.535, 10.406, 23.41, 10.257999, 23.336);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_82
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.703, 24.609);
        ((GeneralPath) shape).curveTo(13.43, 24.512, 13.227, 24.598, 13.102, 24.870998);
        ((GeneralPath) shape).curveTo(12.953, 25.147999, 13.027, 25.335999, 13.328, 25.433998);
        ((GeneralPath) shape).curveTo(13.453, 25.483997, 13.578, 25.483997, 13.703, 25.433998);
        ((GeneralPath) shape).curveTo(13.828, 25.382998, 13.902, 25.308998, 13.926, 25.210999);
        ((GeneralPath) shape).curveTo(14.051, 24.960999, 13.976999, 24.762, 13.703, 24.609);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_83
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.918, 24.234);
        ((GeneralPath) shape).curveTo(12.816, 24.188, 12.742001, 24.210999, 12.691, 24.311998);
        ((GeneralPath) shape).curveTo(12.641, 24.409998, 12.68, 24.484, 12.805, 24.534998);
        ((GeneralPath) shape).curveTo(12.879001, 24.585999, 12.941, 24.546997, 12.992001, 24.421997);
        ((GeneralPath) shape).curveTo(13.0390005, 24.347998, 13.016001, 24.284998, 12.918, 24.233997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_84
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.73, 22.664);
        ((GeneralPath) shape).curveTo(12.355, 22.539, 12.105, 22.652, 11.98, 23.0);
        ((GeneralPath) shape).curveTo(11.905999, 23.152, 11.905999, 23.301, 11.98, 23.449);
        ((GeneralPath) shape).curveTo(12.030999, 23.602, 12.132999, 23.699, 12.280999, 23.75);
        ((GeneralPath) shape).curveTo(12.429999, 23.824, 12.577999, 23.824, 12.73, 23.75);
        ((GeneralPath) shape).curveTo(12.879, 23.699, 12.98, 23.602, 13.030999, 23.449);
        ((GeneralPath) shape).curveTo(13.202999, 23.102, 13.101999, 22.84, 12.73, 22.664);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_85
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.57, 22.066);
        ((GeneralPath) shape).curveTo(11.2699995, 21.988, 11.059, 22.078, 10.934, 22.328);
        ((GeneralPath) shape).curveTo(10.883, 22.425999, 10.883, 22.539, 10.934, 22.664);
        ((GeneralPath) shape).curveTo(10.98, 22.789, 11.059, 22.875, 11.156, 22.925999);
        ((GeneralPath) shape).curveTo(11.457, 23.050999, 11.668, 22.977, 11.793, 22.699);
        ((GeneralPath) shape).curveTo(11.918, 22.401999, 11.844, 22.191, 11.570001, 22.066);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_86
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.223, 21.652);
        ((GeneralPath) shape).curveTo(10.098, 21.602001, 10.007999, 21.641, 9.957, 21.766);
        ((GeneralPath) shape).curveTo(9.859, 21.914001, 9.8949995, 22.016, 10.07, 22.066);
        ((GeneralPath) shape).curveTo(10.172, 22.141, 10.2699995, 22.102, 10.370999, 21.953);
        ((GeneralPath) shape).curveTo(10.421999, 21.828, 10.370999, 21.727, 10.223, 21.651999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x518033));
        g.fill(shape);

        // _0_0_0_87
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.152, 23.152);
        ((GeneralPath) shape).curveTo(13.801001, 22.977001, 13.5390005, 23.074001, 13.367001, 23.449001);
        ((GeneralPath) shape).curveTo(13.191001, 23.824001, 13.2890005, 24.098001, 13.6640005, 24.273);
        ((GeneralPath) shape).curveTo(14.0390005, 24.398, 14.312, 24.285, 14.488001, 23.938002);
        ((GeneralPath) shape).curveTo(14.5390005, 23.789001, 14.5390005, 23.637001, 14.488001, 23.488);
        ((GeneralPath) shape).curveTo(14.438001, 23.312, 14.328001, 23.199001, 14.152, 23.152);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E943B));
        g.fill(shape);

        // _0_0_0_88
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.602, 26.184);
        ((GeneralPath) shape).curveTo(14.449, 26.133, 14.352, 26.184, 14.301001, 26.332);
        ((GeneralPath) shape).curveTo(14.203001, 26.480001, 14.238001, 26.582, 14.4140005, 26.633001);
        ((GeneralPath) shape).curveTo(14.5390005, 26.707, 14.652, 26.668001, 14.750001, 26.52);
        ((GeneralPath) shape).curveTo(14.801001, 26.32, 14.750001, 26.207, 14.602001, 26.184);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_89
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.312, 23.938);
        ((GeneralPath) shape).curveTo(15.0390005, 23.812, 14.824, 23.887, 14.676001, 24.16);
        ((GeneralPath) shape).curveTo(14.551001, 24.438, 14.625001, 24.648, 14.898001, 24.796999);
        ((GeneralPath) shape).curveTo(15.199, 24.921999, 15.410001, 24.835999, 15.535001, 24.535);
        ((GeneralPath) shape).curveTo(15.586, 24.41, 15.586, 24.285, 15.535001, 24.16);
        ((GeneralPath) shape).curveTo(15.512001, 24.035, 15.438001, 23.961, 15.312001, 23.938);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_90
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.062, 23.637);
        ((GeneralPath) shape).curveTo(15.859, 23.585999, 15.723001, 23.647999, 15.648001, 23.824);
        ((GeneralPath) shape).curveTo(15.598001, 24.0, 15.648001, 24.125, 15.801001, 24.199);
        ((GeneralPath) shape).curveTo(15.973001, 24.296999, 16.109001, 24.25, 16.211, 24.046999);
        ((GeneralPath) shape).curveTo(16.262001, 23.848, 16.211, 23.710999, 16.062, 23.637);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_91
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.66, 24.574);
        ((GeneralPath) shape).curveTo(16.434, 24.449, 16.273, 24.512, 16.171999, 24.762);
        ((GeneralPath) shape).curveTo(16.098, 24.984, 16.16, 25.133, 16.359, 25.210999);
        ((GeneralPath) shape).curveTo(16.609, 25.308998, 16.772999, 25.245998, 16.848, 25.022999);
        ((GeneralPath) shape).curveTo(16.921999, 24.796999, 16.859, 24.647999, 16.66, 24.574);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_92
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.184, 25.359);
        ((GeneralPath) shape).curveTo(17.035, 25.309, 16.91, 25.359, 16.809, 25.508);
        ((GeneralPath) shape).curveTo(16.758, 25.66, 16.809, 25.781, 16.957, 25.883);
        ((GeneralPath) shape).curveTo(17.133001, 25.934, 17.258001, 25.883, 17.332, 25.734);
        ((GeneralPath) shape).curveTo(17.383001, 25.559, 17.332, 25.434, 17.184, 25.359);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_93
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.781, 24.91);
        ((GeneralPath) shape).curveTo(17.609, 24.809, 17.469, 24.859, 17.371, 25.059);
        ((GeneralPath) shape).curveTo(17.27, 25.234, 17.32, 25.371, 17.52, 25.473);
        ((GeneralPath) shape).curveTo(17.719, 25.546999, 17.855, 25.496, 17.934, 25.32);
        ((GeneralPath) shape).curveTo(18.031, 25.098, 17.98, 24.961, 17.781, 24.91);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_94
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.535, 22.215);
        ((GeneralPath) shape).curveTo(15.188, 22.039, 14.926, 22.141, 14.75, 22.512001);
        ((GeneralPath) shape).curveTo(14.625, 22.863, 14.727, 23.125002, 15.051, 23.301);
        ((GeneralPath) shape).curveTo(15.398, 23.426, 15.66, 23.312, 15.8359995, 22.965);
        ((GeneralPath) shape).curveTo(15.983999, 22.59, 15.886999, 22.34, 15.535, 22.215);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_95
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.34, 22.102);
        ((GeneralPath) shape).curveTo(14.137, 21.977, 13.965, 22.039, 13.812, 22.289);
        ((GeneralPath) shape).curveTo(13.715, 22.539, 13.7890005, 22.699, 14.0390005, 22.777);
        ((GeneralPath) shape).curveTo(14.262, 22.902, 14.426001, 22.84, 14.527, 22.59);
        ((GeneralPath) shape).curveTo(14.625, 22.34, 14.562, 22.176, 14.34, 22.102);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x518033));
        g.fill(shape);

        // _0_0_0_96
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.367, 22.176);
        ((GeneralPath) shape).curveTo(13.164, 22.102001, 13.016, 22.152, 12.914, 22.328001);
        ((GeneralPath) shape).curveTo(12.839999, 22.551, 12.901999, 22.699001, 13.101999, 22.777);
        ((GeneralPath) shape).curveTo(13.304999, 22.875, 13.452999, 22.828001, 13.554999, 22.625);
        ((GeneralPath) shape).curveTo(13.629, 22.402, 13.565999, 22.254, 13.367, 22.176);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_97
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.711, 21.617);
        ((GeneralPath) shape).curveTo(14.637, 21.566, 14.574, 21.59, 14.527, 21.691);
        ((GeneralPath) shape).curveTo(14.477, 21.793, 14.5, 21.867, 14.602, 21.914);
        ((GeneralPath) shape).curveTo(14.699, 21.965, 14.773001, 21.941, 14.824, 21.84);
        ((GeneralPath) shape).curveTo(14.824, 21.715, 14.7890005, 21.641, 14.711, 21.617);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_98
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.406, 20.457);
        ((GeneralPath) shape).curveTo(17.16, 20.355001, 16.996, 20.43, 16.922, 20.68);
        ((GeneralPath) shape).curveTo(16.820002, 20.906, 16.883001, 21.066, 17.109001, 21.168001);
        ((GeneralPath) shape).curveTo(17.332, 21.266, 17.508001, 21.203001, 17.633001, 20.980001);
        ((GeneralPath) shape).curveTo(17.734001, 20.703001, 17.656002, 20.531002, 17.406002, 20.457);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_99
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.27, 19.93);
        ((GeneralPath) shape).curveTo(18.043001, 19.832, 17.855, 19.906, 17.707, 20.156);
        ((GeneralPath) shape).curveTo(17.605001, 20.457, 17.684, 20.641, 17.934, 20.719);
        ((GeneralPath) shape).curveTo(18.031, 20.766, 18.145, 20.766, 18.27, 20.719);
        ((GeneralPath) shape).curveTo(18.395, 20.691, 18.469, 20.617, 18.492, 20.492);
        ((GeneralPath) shape).curveTo(18.645, 20.27, 18.566, 20.082, 18.27, 19.93);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_100
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.055, 19.297);
        ((GeneralPath) shape).curveTo(18.781, 19.145, 18.566, 19.234001, 18.418001, 19.559);
        ((GeneralPath) shape).curveTo(18.293001, 19.883, 18.379002, 20.105, 18.68, 20.23);
        ((GeneralPath) shape).curveTo(18.98, 20.305, 19.191, 20.219, 19.316, 19.969);
        ((GeneralPath) shape).curveTo(19.441, 19.645, 19.355, 19.421999, 19.055, 19.296999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_101
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.992, 18.844);
        ((GeneralPath) shape).curveTo(19.719, 18.746, 19.543001, 18.82, 19.469, 19.07);
        ((GeneralPath) shape).curveTo(19.367, 19.296999, 19.43, 19.456999, 19.656, 19.559);
        ((GeneralPath) shape).curveTo(19.93, 19.633, 20.105, 19.57, 20.18, 19.371);
        ((GeneralPath) shape).curveTo(20.277, 19.094, 20.215, 18.922, 19.992, 18.844);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_102
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.629, 20.008);
        ((GeneralPath) shape).curveTo(20.352, 19.906, 20.152, 19.991999, 20.027, 20.269999);
        ((GeneralPath) shape).curveTo(19.977001, 20.366999, 19.977001, 20.479998, 20.027, 20.604998);
        ((GeneralPath) shape).curveTo(20.055, 20.702997, 20.129, 20.776999, 20.254, 20.827997);
        ((GeneralPath) shape).curveTo(20.504, 20.952997, 20.703, 20.878998, 20.852, 20.604998);
        ((GeneralPath) shape).curveTo(20.977, 20.354998, 20.901999, 20.155998, 20.629, 20.007998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_103
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(21.152, 24.387);
        ((GeneralPath) shape).curveTo(21.0, 24.311998, 20.875, 24.359, 20.777, 24.535);
        ((GeneralPath) shape).curveTo(20.703001, 24.688, 20.754, 24.809, 20.926, 24.91);
        ((GeneralPath) shape).curveTo(21.078001, 24.984, 21.203001, 24.934, 21.301, 24.762);
        ((GeneralPath) shape).curveTo(21.402, 24.559, 21.352001, 24.438, 21.152, 24.387);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_104
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(20.738, 25.133);
        ((GeneralPath) shape).curveTo(20.539001, 25.035, 20.414001, 25.085999, 20.367, 25.285);
        ((GeneralPath) shape).curveTo(20.293001, 25.434, 20.34, 25.559, 20.516, 25.66);
        ((GeneralPath) shape).curveTo(20.664001, 25.758, 20.789001, 25.711, 20.891, 25.508);
        ((GeneralPath) shape).curveTo(20.988, 25.309, 20.938002, 25.184, 20.738, 25.133);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_105
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(19.805, 25.77);
        ((GeneralPath) shape).curveTo(19.629, 25.672, 19.492, 25.723, 19.391, 25.922);
        ((GeneralPath) shape).curveTo(19.293001, 26.094002, 19.344, 26.234001, 19.543001, 26.332);
        ((GeneralPath) shape).curveTo(19.719002, 26.434, 19.855001, 26.383001, 19.953001, 26.184);
        ((GeneralPath) shape).curveTo(20.055, 25.957, 20.004002, 25.82, 19.805, 25.77);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_106
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.906, 26.594);
        ((GeneralPath) shape).curveTo(18.754, 26.543, 18.656, 26.582, 18.605, 26.707);
        ((GeneralPath) shape).curveTo(18.555, 26.855001, 18.594, 26.957, 18.719, 27.004002);
        ((GeneralPath) shape).curveTo(18.867, 27.055002, 18.969, 27.020002, 19.02, 26.895002);
        ((GeneralPath) shape).curveTo(19.066, 26.742002, 19.031, 26.645002, 18.906, 26.594002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_107
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.883, 27.379);
        ((GeneralPath) shape).curveTo(16.710999, 27.331999, 16.598, 27.379, 16.546999, 27.531);
        ((GeneralPath) shape).curveTo(16.473, 27.656, 16.508, 27.766, 16.66, 27.867);
        ((GeneralPath) shape).curveTo(16.859, 27.918001, 16.973, 27.867, 16.996, 27.719);
        ((GeneralPath) shape).curveTo(17.047, 27.566, 17.008, 27.457, 16.883, 27.379);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_108
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.258, 26.668);
        ((GeneralPath) shape).curveTo(10.133, 26.616999, 10.047, 26.656, 9.996, 26.781);
        ((GeneralPath) shape).curveTo(9.922, 26.883, 9.945001, 26.969, 10.070001, 27.043);
        ((GeneralPath) shape).curveTo(10.195001, 27.094, 10.285001, 27.054998, 10.332001, 26.929998);
        ((GeneralPath) shape).curveTo(10.434001, 26.831999, 10.406001, 26.741999, 10.258, 26.668);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5E943B));
        g.fill(shape);

        // _0_0_0_109
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.906, 21.055);
        ((GeneralPath) shape).curveTo(12.004, 21.277, 12.145, 21.43, 12.316, 21.504);
        ((GeneralPath) shape).curveTo(12.492, 21.605, 12.691, 21.617, 12.918, 21.539);
        ((GeneralPath) shape).curveTo(13.117001, 21.465, 13.266, 21.328, 13.367001, 21.129);
        ((GeneralPath) shape).lineTo(13.367001, 21.055);
        ((GeneralPath) shape).lineTo(13.477, 21.129);
        ((GeneralPath) shape).curveTo(13.902, 21.305, 14.266, 21.203, 14.562, 20.828);
        ((GeneralPath) shape).curveTo(14.715, 20.855, 14.863, 20.855, 15.012, 20.828);
        ((GeneralPath) shape).curveTo(15.238, 20.953, 15.461, 20.991999, 15.688, 20.941);
        ((GeneralPath) shape).curveTo(15.938, 20.918, 16.147999, 20.816, 16.324, 20.641);
        ((GeneralPath) shape).curveTo(16.445, 20.516, 16.522999, 20.391, 16.546999, 20.266);
        ((GeneralPath) shape).curveTo(17.046999, 20.441, 17.484, 20.344, 17.859, 19.969);
        ((GeneralPath) shape).curveTo(18.105, 19.719, 18.23, 19.395, 18.23, 18.996);
        ((GeneralPath) shape).lineTo(18.57, 18.77);
        ((GeneralPath) shape).curveTo(18.82, 18.52, 18.906, 18.234001, 18.831999, 17.91);
        ((GeneralPath) shape).lineTo(19.019999, 17.758);
        ((GeneralPath) shape).curveTo(19.269999, 17.484, 19.394999, 17.184, 19.394999, 16.859);
        ((GeneralPath) shape).curveTo(19.394999, 16.512, 19.269999, 16.210999, 19.019999, 15.9609995);
        ((GeneralPath) shape).lineTo(18.940998, 15.926);
        ((GeneralPath) shape).curveTo(19.292997, 15.453, 19.253998, 15.0, 18.831999, 14.577999);
        ((GeneralPath) shape).lineTo(18.530998, 14.390999);
        ((GeneralPath) shape).curveTo(18.679998, 14.190999, 18.741999, 13.976999, 18.718998, 13.753999);
        ((GeneralPath) shape).curveTo(18.718998, 13.530999, 18.632998, 13.343999, 18.456999, 13.190999);
        ((GeneralPath) shape).curveTo(18.331999, 13.065999, 18.206999, 12.991999, 18.081999, 12.968999);
        ((GeneralPath) shape).curveTo(18.206999, 12.694999, 18.168, 12.456999, 17.968998, 12.257998);
        ((GeneralPath) shape).curveTo(17.718998, 12.058998, 17.468998, 12.042998, 17.222998, 12.218999);
        ((GeneralPath) shape).curveTo(17.194998, 12.120999, 17.132998, 12.042999, 17.034998, 11.995999);
        ((GeneralPath) shape).lineTo(16.956999, 11.995999);
        ((GeneralPath) shape).curveTo(17.133, 11.57, 16.995998, 11.245999, 16.546999, 11.023);
        ((GeneralPath) shape).lineTo(16.285, 10.945);
        ((GeneralPath) shape).curveTo(16.234, 10.695, 16.098, 10.507999, 15.871, 10.387);
        ((GeneralPath) shape).curveTo(15.648001, 10.309, 15.449, 10.309, 15.273001, 10.387);
        ((GeneralPath) shape).lineTo(15.199, 10.387);
        ((GeneralPath) shape).curveTo(15.25, 10.035, 15.152, 9.734, 14.898001, 9.488);
        ((GeneralPath) shape).curveTo(14.727001, 9.387, 14.613001, 9.324, 14.562, 9.301);
        ((GeneralPath) shape).curveTo(14.715, 9.125, 14.7890005, 8.926, 14.7890005, 8.698999);
        ((GeneralPath) shape).curveTo(14.762, 8.476999, 14.676001, 8.289, 14.527, 8.141);
        ((GeneralPath) shape).curveTo(14.426001, 8.039, 14.2890005, 7.9649997, 14.113001, 7.9139996);
        ((GeneralPath) shape).curveTo(14.113001, 7.7419996, 14.0390005, 7.5779996, 13.891001, 7.4299994);
        ((GeneralPath) shape).curveTo(13.988001, 7.1049995, 13.926001, 6.8549995, 13.703001, 6.6799994);
        ((GeneralPath) shape).curveTo(13.551001, 6.503999, 13.379001, 6.4409995, 13.176001, 6.491999);
        ((GeneralPath) shape).curveTo(13.176001, 6.269999, 13.102, 6.0819993, 12.953001, 5.933999);
        ((GeneralPath) shape).curveTo(12.680001, 5.706999, 12.379001, 5.655999, 12.055001, 5.780999);
        ((GeneralPath) shape).lineTo(11.941001, 5.6329994);
        ((GeneralPath) shape).curveTo(11.766001, 5.4569993, 11.555001, 5.3709993, 11.305001, 5.3709993);
        ((GeneralPath) shape).curveTo(11.082002, 5.3709993, 10.871001, 5.444999, 10.668001, 5.5939994);
        ((GeneralPath) shape).curveTo(10.320002, 5.3949995, 9.996001, 5.444999, 9.695002, 5.7459993);
        ((GeneralPath) shape).curveTo(9.547002, 5.8949995, 9.4730015, 6.0819993, 9.4730015, 6.3049994);
        ((GeneralPath) shape).curveTo(8.996001, 6.1049995, 8.574001, 6.1909995, 8.199001, 6.5659995);
        ((GeneralPath) shape).lineTo(8.051002, 6.7929993);
        ((GeneralPath) shape).curveTo(7.5740013, 6.6409993, 7.1640015, 6.741999, 6.8120017, 7.0939994);
        ((GeneralPath) shape).curveTo(6.488002, 7.4139996, 6.3910017, 7.7769995, 6.5160017, 8.176);
        ((GeneralPath) shape).curveTo(6.2660017, 8.176, 6.066002, 8.254, 5.9140015, 8.401999);
        ((GeneralPath) shape).curveTo(5.7420015, 8.573999, 5.6800013, 8.801, 5.7270017, 9.073999);
        ((GeneralPath) shape).curveTo(5.6290016, 9.124999, 5.566002, 9.198999, 5.5390015, 9.301);
        ((GeneralPath) shape).curveTo(5.4650016, 9.398, 5.4530015, 9.523, 5.5040016, 9.676);
        ((GeneralPath) shape).curveTo(5.1800017, 9.723, 4.9410014, 9.898, 4.7930017, 10.198999);
        ((GeneralPath) shape).curveTo(4.691002, 10.448999, 4.7070017, 10.7109995, 4.8320017, 10.983999);
        ((GeneralPath) shape).curveTo(4.6290016, 11.058999, 4.4920015, 11.195, 4.4180017, 11.3949995);
        ((GeneralPath) shape).curveTo(4.2700014, 11.719, 4.3200016, 12.007999, 4.5700016, 12.257999);
        ((GeneralPath) shape).curveTo(4.469002, 12.332, 4.3950014, 12.429999, 4.344002, 12.554999);
        ((GeneralPath) shape).curveTo(4.2930017, 12.629, 4.270002, 12.742, 4.270002, 12.8949995);
        ((GeneralPath) shape).curveTo(3.9690018, 13.339999, 4.008002, 13.754, 4.383002, 14.129);
        ((GeneralPath) shape).curveTo(4.4060016, 14.151999, 4.5430017, 14.226999, 4.7930017, 14.351999);
        ((GeneralPath) shape).curveTo(4.6680017, 14.601999, 4.6560016, 14.851999, 4.758002, 15.101999);
        ((GeneralPath) shape).curveTo(4.8320017, 15.374999, 5.0040016, 15.573999, 5.281002, 15.698999);
        ((GeneralPath) shape).lineTo(5.730002, 15.773);
        ((GeneralPath) shape).curveTo(5.656002, 16.051, 5.668002, 16.301, 5.7660017, 16.522999);
        ((GeneralPath) shape).curveTo(5.8670015, 16.796999, 6.0430017, 16.984, 6.2930017, 17.085999);
        ((GeneralPath) shape).lineTo(6.3280015, 17.085999);
        ((GeneralPath) shape).curveTo(6.2300014, 17.335999, 6.2300014, 17.585999, 6.3280015, 17.835999);
        ((GeneralPath) shape).curveTo(6.4300013, 18.085999, 6.6020017, 18.269999, 6.8520017, 18.394999);
        ((GeneralPath) shape).curveTo(6.8790016, 18.394999, 7.0160017, 18.433998, 7.2660017, 18.508);
        ((GeneralPath) shape).curveTo(7.191002, 18.781, 7.2030015, 19.031, 7.3010015, 19.258);
        ((GeneralPath) shape).curveTo(7.4260015, 19.531, 7.6130013, 19.719, 7.8630013, 19.82);
        ((GeneralPath) shape).curveTo(8.188002, 19.992, 8.523002, 19.98, 8.875001, 19.781);
        ((GeneralPath) shape).curveTo(9.023001, 19.957, 9.172001, 20.082, 9.324001, 20.156);
        ((GeneralPath) shape).lineTo(9.434001, 20.195);
        ((GeneralPath) shape).curveTo(9.535001, 20.52, 9.711001, 20.73, 9.961001, 20.828);
        ((GeneralPath) shape).curveTo(10.234001, 20.98, 10.520001, 20.969, 10.820002, 20.793);
        ((GeneralPath) shape).curveTo(10.922002, 20.918, 11.031002, 21.015999, 11.156002, 21.094);
        ((GeneralPath) shape).curveTo(11.434002, 21.219, 11.680002, 21.203, 11.906002, 21.055);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x476E2D));
        g.fill(shape);

        // _0_0_0_110
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.879, 20.082);
        ((GeneralPath) shape).curveTo(12.629, 19.93, 12.406, 19.980001, 12.207, 20.230001);
        ((GeneralPath) shape).curveTo(11.98, 20.531002, 11.98, 20.766, 12.207, 20.941002);
        ((GeneralPath) shape).curveTo(12.406, 21.090002, 12.617, 21.027002, 12.84, 20.754002);
        ((GeneralPath) shape).curveTo(13.066, 20.504002, 13.078, 20.281002, 12.879, 20.082);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_111
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.793, 19.594);
        ((GeneralPath) shape).curveTo(11.570001, 19.421999, 11.344, 19.457, 11.121, 19.707);
        ((GeneralPath) shape).curveTo(10.895, 19.980001, 10.906, 20.207, 11.156, 20.379002);
        ((GeneralPath) shape).curveTo(11.383, 20.555002, 11.6050005, 20.520002, 11.832, 20.270002);
        ((GeneralPath) shape).curveTo(12.054999, 20.020002, 12.043, 19.793003, 11.793, 19.594002);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_112
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.52, 19.559);
        ((GeneralPath) shape).curveTo(10.320001, 19.383, 10.109, 19.406, 9.887, 19.633);
        ((GeneralPath) shape).curveTo(9.711, 19.855, 9.734, 20.07, 9.961, 20.269999);
        ((GeneralPath) shape).curveTo(10.207001, 20.468998, 10.422001, 20.440998, 10.598001, 20.194998);
        ((GeneralPath) shape).curveTo(10.77, 19.968998, 10.746, 19.757998, 10.52, 19.558998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_113
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.895, 18.324);
        ((GeneralPath) shape).curveTo(10.672001, 18.147999, 10.473001, 18.171999, 10.297001, 18.397999);
        ((GeneralPath) shape).curveTo(10.223001, 18.473, 10.184001, 18.57, 10.184001, 18.695);
        ((GeneralPath) shape).curveTo(10.184001, 18.82, 10.234001, 18.921999, 10.332001, 18.996);
        ((GeneralPath) shape).curveTo(10.559001, 19.172, 10.77, 19.145, 10.969001, 18.922);
        ((GeneralPath) shape).curveTo(11.145, 18.695002, 11.121001, 18.496, 10.895, 18.324001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_114
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.621, 18.883);
        ((GeneralPath) shape).curveTo(9.496, 18.758, 9.359, 18.769999, 9.211, 18.921999);
        ((GeneralPath) shape).curveTo(9.086, 19.094, 9.098001, 19.241999, 9.246, 19.370998);
        ((GeneralPath) shape).curveTo(9.297, 19.421999, 9.371, 19.444998, 9.473001, 19.444998);
        ((GeneralPath) shape).curveTo(9.547001, 19.421997, 9.609, 19.382998, 9.660001, 19.331997);
        ((GeneralPath) shape).curveTo(9.785001, 19.159996, 9.773001, 19.007998, 9.621001, 18.882998);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_115
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.836, 18.395);
        ((GeneralPath) shape).curveTo(8.586, 18.172, 8.336, 18.184, 8.086, 18.434);
        ((GeneralPath) shape).curveTo(7.8630004, 18.707, 7.8870006, 18.957, 8.1640005, 19.184);
        ((GeneralPath) shape).curveTo(8.438001, 19.406, 8.688001, 19.383, 8.910001, 19.105);
        ((GeneralPath) shape).curveTo(9.109001, 18.831999, 9.086, 18.598, 8.836, 18.395);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_116
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.547, 17.535);
        ((GeneralPath) shape).curveTo(9.348, 17.359, 9.148, 17.375, 8.949, 17.574);
        ((GeneralPath) shape).curveTo(8.797, 17.824, 8.824, 18.022999, 9.023001, 18.171999);
        ((GeneralPath) shape).curveTo(9.246, 18.348, 9.434001, 18.324, 9.586, 18.098);
        ((GeneralPath) shape).curveTo(9.785001, 17.897999, 9.773001, 17.711, 9.547001, 17.535);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_117
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.297, 17.234);
        ((GeneralPath) shape).curveTo(10.121, 17.109, 9.973, 17.137, 9.848, 17.311998);
        ((GeneralPath) shape).curveTo(9.695, 17.460999, 9.7109995, 17.609, 9.882999, 17.762);
        ((GeneralPath) shape).curveTo(10.058999, 17.887, 10.207, 17.870998, 10.332, 17.723);
        ((GeneralPath) shape).curveTo(10.507999, 17.546999, 10.495999, 17.387, 10.297, 17.234);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_118
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.238, 16.637);
        ((GeneralPath) shape).curveTo(8.0859995, 16.512, 7.914, 16.449, 7.715, 16.449);
        ((GeneralPath) shape).curveTo(7.512, 16.477, 7.352, 16.562, 7.227, 16.710999);
        ((GeneralPath) shape).curveTo(7.102, 16.887, 7.0550003, 17.074, 7.078, 17.272999);
        ((GeneralPath) shape).curveTo(7.078, 17.473, 7.164, 17.624998, 7.34, 17.723);
        ((GeneralPath) shape).curveTo(7.488, 17.848, 7.664, 17.91, 7.863, 17.91);
        ((GeneralPath) shape).curveTo(8.062, 17.887, 8.227, 17.796999, 8.348, 17.648);
        ((GeneralPath) shape).curveTo(8.473, 17.473001, 8.523, 17.285, 8.5, 17.086);
        ((GeneralPath) shape).curveTo(8.473, 16.887001, 8.387, 16.738, 8.238, 16.637001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_119
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.949, 16.039);
        ((GeneralPath) shape).curveTo(8.699, 15.839999, 8.488, 15.851999, 8.312, 16.074);
        ((GeneralPath) shape).curveTo(8.137, 16.300999, 8.1640005, 16.512, 8.387, 16.710999);
        ((GeneralPath) shape).curveTo(8.613, 16.887, 8.812, 16.862999, 8.988, 16.637);
        ((GeneralPath) shape).curveTo(9.16, 16.414, 9.148, 16.210999, 8.949, 16.039);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_120
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.789, 14.543);
        ((GeneralPath) shape).curveTo(7.414, 14.266, 7.102, 14.305, 6.852, 14.652);
        ((GeneralPath) shape).curveTo(6.754, 14.777, 6.703, 14.93, 6.703, 15.102);
        ((GeneralPath) shape).curveTo(6.727, 15.277, 6.801, 15.43, 6.926, 15.555);
        ((GeneralPath) shape).curveTo(7.25, 15.852, 7.5620003, 15.828, 7.863, 15.477);
        ((GeneralPath) shape).curveTo(8.137, 15.129001, 8.113, 14.816, 7.789, 14.543);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_121
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.816, 15.852);
        ((GeneralPath) shape).curveTo(6.59, 15.676001, 6.379, 15.688001, 6.18, 15.891);
        ((GeneralPath) shape).curveTo(6.027, 16.137, 6.055, 16.362999, 6.2539997, 16.562);
        ((GeneralPath) shape).curveTo(6.4769998, 16.738, 6.6909995, 16.711, 6.891, 16.488);
        ((GeneralPath) shape).curveTo(7.0899997, 16.262001, 7.066, 16.051, 6.816, 15.852001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_122
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.762, 14.355);
        ((GeneralPath) shape).curveTo(8.562, 14.202999, 8.398, 14.219, 8.273, 14.391);
        ((GeneralPath) shape).curveTo(8.125, 14.594, 8.137, 14.754, 8.311999, 14.879);
        ((GeneralPath) shape).curveTo(8.487999, 15.026999, 8.659999, 15.016, 8.8359995, 14.84);
        ((GeneralPath) shape).curveTo(8.983999, 14.668, 8.9609995, 14.504, 8.761999, 14.3550005);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_123
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.898, 15.812);
        ((GeneralPath) shape).curveTo(7.8009996, 15.715, 7.711, 15.727, 7.6369996, 15.852);
        ((GeneralPath) shape).curveTo(7.562, 15.926001, 7.562, 16.012001, 7.6369996, 16.113);
        ((GeneralPath) shape).curveTo(7.7889996, 16.164001, 7.8749995, 16.152, 7.898, 16.074001);
        ((GeneralPath) shape).curveTo(8.0, 15.977001, 8.0, 15.891002, 7.898, 15.812001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_124
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.164, 13.117);
        ((GeneralPath) shape).curveTo(7.9139996, 12.917999, 7.6759996, 12.929999, 7.4529996, 13.155999);
        ((GeneralPath) shape).curveTo(7.2769995, 13.405999, 7.3009996, 13.640999, 7.5269995, 13.867);
        ((GeneralPath) shape).curveTo(7.7729993, 14.066, 8.011999, 14.042999, 8.238, 13.792999);
        ((GeneralPath) shape).curveTo(8.312, 13.690999, 8.348, 13.577999, 8.348, 13.456999);
        ((GeneralPath) shape).curveTo(8.323999, 13.304998, 8.261999, 13.194999, 8.164, 13.116999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_125
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.18, 14.316);
        ((GeneralPath) shape).curveTo(5.953, 14.094, 5.7419996, 14.105, 5.5429997, 14.355);
        ((GeneralPath) shape).curveTo(5.344, 14.605, 5.3669996, 14.816, 5.6169996, 14.992);
        ((GeneralPath) shape).curveTo(5.8159995, 15.191, 6.0309997, 15.176, 6.2539997, 14.953);
        ((GeneralPath) shape).curveTo(6.43, 14.703, 6.4019995, 14.492, 6.18, 14.316);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_126
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.316, 12.895);
        ((GeneralPath) shape).curveTo(5.02, 12.668, 4.758, 12.695001, 4.531, 12.969001);
        ((GeneralPath) shape).curveTo(4.3050003, 13.242001, 4.3320003, 13.492001, 4.605, 13.719001);
        ((GeneralPath) shape).curveTo(4.906, 13.941001, 5.168, 13.918001, 5.391, 13.645);
        ((GeneralPath) shape).curveTo(5.6169996, 13.367001, 5.594, 13.117001, 5.316, 12.895);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_127
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.516, 12.895);
        ((GeneralPath) shape).curveTo(6.4139996, 12.77, 6.277, 12.719001, 6.1049995, 12.742001);
        ((GeneralPath) shape).curveTo(5.9529996, 12.77, 5.8279996, 12.844001, 5.7299995, 12.969001);
        ((GeneralPath) shape).curveTo(5.5039997, 13.242001, 5.5309997, 13.492001, 5.8049994, 13.719001);
        ((GeneralPath) shape).curveTo(5.9299994, 13.816001, 6.0659995, 13.867001, 6.2189994, 13.867001);
        ((GeneralPath) shape).curveTo(6.3669996, 13.844001, 6.4919996, 13.77, 6.589999, 13.645);
        ((GeneralPath) shape).curveTo(6.815999, 13.367001, 6.788999, 13.117001, 6.5159993, 12.895);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_128
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.039, 13.832);
        ((GeneralPath) shape).curveTo(6.914, 13.707, 6.777, 13.719, 6.629, 13.867);
        ((GeneralPath) shape).curveTo(6.504, 13.992, 6.5160003, 14.129, 6.664, 14.276999);
        ((GeneralPath) shape).curveTo(6.789, 14.401999, 6.926, 14.391, 7.078, 14.242);
        ((GeneralPath) shape).curveTo(7.203, 14.117, 7.191, 13.98, 7.039, 13.832);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_129
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.301, 11.809);
        ((GeneralPath) shape).curveTo(7.004, 11.586, 6.738, 11.609, 6.5160003, 11.883);
        ((GeneralPath) shape).curveTo(6.4140005, 11.984, 6.367, 12.121, 6.367, 12.297);
        ((GeneralPath) shape).curveTo(6.3910003, 12.445, 6.465, 12.57, 6.59, 12.668);
        ((GeneralPath) shape).curveTo(6.84, 12.895, 7.102, 12.871, 7.375, 12.594);
        ((GeneralPath) shape).curveTo(7.602, 12.297, 7.574, 12.035, 7.301, 11.809);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_130
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(5.73, 11.324);
        ((GeneralPath) shape).curveTo(5.43, 11.098001, 5.168, 11.121, 4.945, 11.398001);
        ((GeneralPath) shape).curveTo(4.8440003, 11.523001, 4.8050003, 11.660001, 4.8320003, 11.809001);
        ((GeneralPath) shape).curveTo(4.8320003, 11.961001, 4.8950005, 12.086001, 5.0200005, 12.184001);
        ((GeneralPath) shape).curveTo(5.2700005, 12.406001, 5.5310006, 12.383001, 5.8050003, 12.109001);
        ((GeneralPath) shape).curveTo(6.0270004, 11.809001, 6.004, 11.547001, 5.7300005, 11.324001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_131
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.703, 9.898);
        ((GeneralPath) shape).curveTo(6.5550003, 9.773, 6.379, 9.7109995, 6.1800003, 9.7109995);
        ((GeneralPath) shape).curveTo(5.977, 9.738, 5.8160005, 9.8359995, 5.6910005, 10.011999);
        ((GeneralPath) shape).curveTo(5.5660005, 10.164, 5.5200005, 10.3359995, 5.543, 10.534999);
        ((GeneralPath) shape).curveTo(5.566, 10.733998, 5.6520004, 10.897999, 5.8050003, 11.022999);
        ((GeneralPath) shape).curveTo(5.953, 11.147999, 6.129, 11.198998, 6.328, 11.171999);
        ((GeneralPath) shape).curveTo(6.527, 11.147999, 6.691, 11.058999, 6.8120003, 10.909999);
        ((GeneralPath) shape).curveTo(6.938, 10.761999, 6.9880004, 10.585999, 6.965, 10.386999);
        ((GeneralPath) shape).curveTo(6.941, 10.187999, 6.852, 10.022999, 6.703, 9.897999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4D7830));
        g.fill(shape);

        // _0_0_0_132
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.75, 10.648);
        ((GeneralPath) shape).curveTo(7.5, 10.448999, 7.289, 10.4609995, 7.113, 10.688);
        ((GeneralPath) shape).curveTo(6.891, 10.91, 6.902, 11.120999, 7.152, 11.323999);
        ((GeneralPath) shape).curveTo(7.25, 11.421999, 7.363, 11.4609995, 7.488, 11.433999);
        ((GeneralPath) shape).curveTo(7.613, 11.433999, 7.711, 11.382999, 7.789, 11.284999);
        ((GeneralPath) shape).curveTo(7.988, 11.034999, 7.977, 10.823998, 7.75, 10.647999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_133
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.613, 11.621);
        ((GeneralPath) shape).curveTo(8.3359995, 11.398001, 8.09, 11.422, 7.863, 11.695001);
        ((GeneralPath) shape).curveTo(7.637, 11.973001, 7.664, 12.219001, 7.9379997, 12.445001);
        ((GeneralPath) shape).curveTo(8.2109995, 12.668, 8.4609995, 12.645, 8.688, 12.371);
        ((GeneralPath) shape).curveTo(8.938, 12.070001, 8.91, 11.820001, 8.613, 11.621);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_134
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.211, 12.633);
        ((GeneralPath) shape).curveTo(9.012, 12.4800005, 8.824, 12.508, 8.648001, 12.707001);
        ((GeneralPath) shape).curveTo(8.473001, 12.934001, 8.500001, 13.121, 8.723001, 13.27);
        ((GeneralPath) shape).curveTo(8.926001, 13.469001, 9.109, 13.457001, 9.285001, 13.2300005);
        ((GeneralPath) shape).curveTo(9.461, 13.008, 9.434001, 12.809, 9.211, 12.633);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_135
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.996, 13.344);
        ((GeneralPath) shape).curveTo(9.773001, 13.117, 9.559, 13.132999, 9.359, 13.379);
        ((GeneralPath) shape).curveTo(9.188, 13.629, 9.211, 13.844, 9.434, 14.0199995);
        ((GeneralPath) shape).curveTo(9.637, 14.219, 9.848, 14.202999, 10.07, 13.98);
        ((GeneralPath) shape).curveTo(10.245999, 13.73, 10.223, 13.5199995, 9.995999, 13.344);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_136
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.559, 12.035);
        ((GeneralPath) shape).curveTo(10.359, 11.859, 10.145, 11.882999, 9.922, 12.109);
        ((GeneralPath) shape).curveTo(9.746, 12.332, 9.773, 12.547, 9.996, 12.746);
        ((GeneralPath) shape).curveTo(10.223001, 12.922, 10.434, 12.895, 10.633, 12.668);
        ((GeneralPath) shape).curveTo(10.809, 12.445001, 10.781, 12.234, 10.559, 12.035);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_137
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.66, 11.773);
        ((GeneralPath) shape).curveTo(9.4609995, 11.620999, 9.297, 11.632999, 9.172, 11.809);
        ((GeneralPath) shape).curveTo(9.0, 11.984, 9.012, 12.145, 9.2109995, 12.297);
        ((GeneralPath) shape).curveTo(9.386999, 12.469, 9.547, 12.457, 9.698999, 12.258);
        ((GeneralPath) shape).curveTo(9.848, 12.059, 9.8359995, 11.895, 9.66, 11.773001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_138
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.062, 10.688);
        ((GeneralPath) shape).curveTo(8.887, 10.535, 8.711, 10.547, 8.535, 10.723);
        ((GeneralPath) shape).curveTo(8.41, 10.898, 8.438, 11.073999, 8.613, 11.245999);
        ((GeneralPath) shape).curveTo(8.785, 11.370999, 8.949, 11.348, 9.098, 11.171999);
        ((GeneralPath) shape).curveTo(9.245999, 10.972999, 9.233999, 10.808999, 9.061999, 10.687999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_139
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.996, 10.574);
        ((GeneralPath) shape).curveTo(9.797, 10.426001, 9.633, 10.438001, 9.512, 10.609);
        ((GeneralPath) shape).curveTo(9.359, 10.812, 9.371, 10.973001, 9.547, 11.098001);
        ((GeneralPath) shape).curveTo(9.723, 11.273001, 9.887, 11.262, 10.035, 11.059001);
        ((GeneralPath) shape).curveTo(10.207, 10.887001, 10.195, 10.723001, 9.996, 10.574001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_140
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.672, 10.797);
        ((GeneralPath) shape).curveTo(10.547, 10.672, 10.406, 10.688, 10.258, 10.8359995);
        ((GeneralPath) shape).curveTo(10.184, 11.011999, 10.207001, 11.148, 10.332001, 11.245999);
        ((GeneralPath) shape).curveTo(10.484001, 11.398, 10.609001, 11.386999, 10.707001, 11.2109995);
        ((GeneralPath) shape).curveTo(10.859001, 11.058999, 10.844001, 10.922, 10.672001, 10.797);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_141
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.949, 9.711);
        ((GeneralPath) shape).curveTo(8.75, 9.562, 8.586, 9.574, 8.461, 9.75);
        ((GeneralPath) shape).curveTo(8.312, 9.949, 8.324, 10.109, 8.5, 10.234);
        ((GeneralPath) shape).curveTo(8.672, 10.41, 8.836, 10.398, 8.984, 10.199);
        ((GeneralPath) shape).curveTo(9.16, 10.023001, 9.148, 9.863, 8.949, 9.711);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4D7830));
        g.fill(shape);

        // _0_0_0_142
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.164, 9.34);
        ((GeneralPath) shape).curveTo(7.9379997, 9.141, 7.7269998, 9.1640005, 7.5269995, 9.4140005);
        ((GeneralPath) shape).curveTo(7.3279996, 9.613001, 7.3399997, 9.836, 7.5619993, 10.09);
        ((GeneralPath) shape).curveTo(7.839999, 10.262, 8.061999, 10.238, 8.237999, 10.012);
        ((GeneralPath) shape).curveTo(8.460999, 9.7890005, 8.437999, 9.562, 8.163999, 9.34);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_143
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.227, 8.516);
        ((GeneralPath) shape).curveTo(7.004, 8.34, 6.789, 8.352, 6.59, 8.551);
        ((GeneralPath) shape).curveTo(6.414, 8.776999, 6.441, 8.988, 6.664, 9.188);
        ((GeneralPath) shape).curveTo(6.891, 9.363, 7.09, 9.34, 7.266, 9.113);
        ((GeneralPath) shape).curveTo(7.4379997, 8.891, 7.4259996, 8.688, 7.2269998, 8.516);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_144
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.824, 7.766);
        ((GeneralPath) shape).curveTo(7.652, 7.641, 7.5, 7.6679997, 7.375, 7.8399997);
        ((GeneralPath) shape).curveTo(7.227, 7.9919996, 7.238, 8.141, 7.414, 8.289);
        ((GeneralPath) shape).curveTo(7.59, 8.414, 7.738, 8.401999, 7.863, 8.254);
        ((GeneralPath) shape).curveTo(7.988, 8.078, 7.9769998, 7.9139996, 7.824, 7.766);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_145
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.5, 8.176);
        ((GeneralPath) shape).curveTo(8.375, 8.026999, 8.227, 8.039, 8.051, 8.214999);
        ((GeneralPath) shape).curveTo(7.9259996, 8.390999, 7.9379997, 8.551, 8.0859995, 8.698999);
        ((GeneralPath) shape).curveTo(8.261999, 8.823999, 8.426, 8.811999, 8.573999, 8.664);
        ((GeneralPath) shape).curveTo(8.723, 8.488, 8.698999, 8.327999, 8.499999, 8.176);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_146
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.398, 8.59);
        ((GeneralPath) shape).curveTo(9.323999, 8.488, 9.234, 8.488, 9.137, 8.59);
        ((GeneralPath) shape).curveTo(9.012, 8.715, 9.023, 8.801001, 9.172, 8.852);
        ((GeneralPath) shape).curveTo(9.273, 8.953, 9.348, 8.953, 9.398, 8.852);
        ((GeneralPath) shape).curveTo(9.523, 8.727, 9.523, 8.641, 9.398, 8.59);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_147
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.836, 6.68);
        ((GeneralPath) shape).curveTo(8.609, 6.48, 8.398001, 6.5039997, 8.199, 6.7539997);
        ((GeneralPath) shape).curveTo(8.0, 7.0039997, 8.027, 7.219, 8.273001, 7.391);
        ((GeneralPath) shape).curveTo(8.473001, 7.566, 8.688001, 7.5429997, 8.910001, 7.316);
        ((GeneralPath) shape).curveTo(9.109001, 7.094, 9.086, 6.879, 8.836, 6.68);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_148
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.66, 7.203);
        ((GeneralPath) shape).curveTo(9.434, 7.031, 9.234, 7.0550003, 9.062, 7.281);
        ((GeneralPath) shape).curveTo(8.887, 7.504, 8.898001, 7.703, 9.098001, 7.879);
        ((GeneralPath) shape).curveTo(9.324, 8.055, 9.535001, 8.027, 9.734, 7.8050003);
        ((GeneralPath) shape).curveTo(9.91, 7.578, 9.883, 7.379, 9.66, 7.203);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_149
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.949, 7.84);
        ((GeneralPath) shape).curveTo(8.848001, 7.793, 8.773001, 7.8050003, 8.723001, 7.879);
        ((GeneralPath) shape).curveTo(8.676001, 7.9300003, 8.676001, 8.004, 8.723001, 8.102);
        ((GeneralPath) shape).curveTo(8.824, 8.152, 8.910001, 8.141, 8.988001, 8.066);
        ((GeneralPath) shape).curveTo(9.035001, 7.992, 9.023001, 7.914, 8.949001, 7.84);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_150
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.012, 7.277);
        ((GeneralPath) shape).curveTo(7.988, 7.254, 7.926, 7.266, 7.824, 7.316);
        ((GeneralPath) shape).curveTo(7.801, 7.34, 7.812, 7.402, 7.863, 7.504);
        ((GeneralPath) shape).curveTo(7.887, 7.527, 7.949, 7.5160003, 8.051, 7.465);
        ((GeneralPath) shape).curveTo(8.101999, 7.418, 8.0859995, 7.355, 8.012, 7.277);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_151
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.91, 8.965);
        ((GeneralPath) shape).curveTo(8.785, 8.84, 8.66, 8.852, 8.535, 9.0);
        ((GeneralPath) shape).curveTo(8.438, 9.125, 8.448999, 9.25, 8.573999, 9.375);
        ((GeneralPath) shape).curveTo(8.723, 9.477, 8.848, 9.461, 8.948999, 9.34);
        ((GeneralPath) shape).curveTo(9.073999, 9.1640005, 9.061999, 9.0390005, 8.91, 8.965);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_152
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.848, 9.113);
        ((GeneralPath) shape).curveTo(9.648, 8.938, 9.448999, 8.953, 9.245999, 9.151999);
        ((GeneralPath) shape).curveTo(9.073999, 9.374999, 9.098, 9.573999, 9.323999, 9.749999);
        ((GeneralPath) shape).curveTo(9.523, 9.925999, 9.7109995, 9.897999, 9.886999, 9.675999);
        ((GeneralPath) shape).curveTo(10.058999, 9.499999, 10.046999, 9.311998, 9.848, 9.112999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_153
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.559, 9.75);
        ((GeneralPath) shape).curveTo(10.406, 9.598, 10.258, 9.625, 10.109, 9.824);
        ((GeneralPath) shape).curveTo(9.984, 9.949, 9.996, 10.098001, 10.145, 10.273001);
        ((GeneralPath) shape).curveTo(10.320001, 10.398001, 10.4800005, 10.387001, 10.633, 10.238001);
        ((GeneralPath) shape).curveTo(10.781, 10.062001, 10.758, 9.898001, 10.559, 9.750001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_154
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.633, 8.141);
        ((GeneralPath) shape).curveTo(10.410001, 7.9649997, 10.207001, 7.9919996, 10.035001, 8.215);
        ((GeneralPath) shape).curveTo(9.859001, 8.391, 9.887001, 8.578, 10.109001, 8.777);
        ((GeneralPath) shape).curveTo(10.285001, 8.953, 10.4730015, 8.938001, 10.672001, 8.738001);
        ((GeneralPath) shape).curveTo(10.844001, 8.5390005, 10.832001, 8.340001, 10.633001, 8.141001);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4D7830));
        g.fill(shape);

        // _0_0_0_155
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.23, 14.02);
        ((GeneralPath) shape).curveTo(11.030999, 13.844001, 10.844, 13.867001, 10.672, 14.094001);
        ((GeneralPath) shape).curveTo(10.496, 14.266001, 10.508, 14.453001, 10.707, 14.652);
        ((GeneralPath) shape).curveTo(10.906, 14.828, 11.109, 14.816, 11.309, 14.617001);
        ((GeneralPath) shape).curveTo(11.48, 14.391001, 11.457, 14.191001, 11.23, 14.02);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_156
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.758, 12.742);
        ((GeneralPath) shape).curveTo(11.531, 12.542999, 11.320001, 12.57, 11.121, 12.82);
        ((GeneralPath) shape).curveTo(10.922, 13.07, 10.945001, 13.281, 11.195001, 13.457);
        ((GeneralPath) shape).curveTo(11.395, 13.629, 11.6050005, 13.605, 11.832001, 13.379);
        ((GeneralPath) shape).curveTo(12.031001, 13.156, 12.004001, 12.945, 11.758, 12.742);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_157
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.066, 13.68);
        ((GeneralPath) shape).curveTo(12.965, 13.6050005, 12.84, 13.617001, 12.691, 13.719);
        ((GeneralPath) shape).curveTo(12.594, 13.84, 12.605, 13.965, 12.73, 14.09);
        ((GeneralPath) shape).curveTo(12.879, 14.191, 12.992, 14.18, 13.066, 14.055);
        ((GeneralPath) shape).curveTo(13.168, 13.957001, 13.168, 13.832001, 13.066, 13.68);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_158
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.891, 13.117);
        ((GeneralPath) shape).curveTo(13.715, 12.992, 13.566, 13.007999, 13.441, 13.155999);
        ((GeneralPath) shape).curveTo(13.316, 13.280999, 13.328, 13.417999, 13.477, 13.565999);
        ((GeneralPath) shape).curveTo(13.652, 13.690999, 13.801001, 13.679999, 13.926001, 13.530999);
        ((GeneralPath) shape).curveTo(13.977, 13.48, 14.004001, 13.405999, 14.004001, 13.304999);
        ((GeneralPath) shape).curveTo(13.977, 13.23, 13.938001, 13.167999, 13.891001, 13.117);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_159
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.078, 12.184);
        ((GeneralPath) shape).curveTo(13.953, 12.082, 13.828, 12.098, 13.703, 12.219);
        ((GeneralPath) shape).curveTo(13.629, 12.344, 13.641, 12.457, 13.738, 12.559);
        ((GeneralPath) shape).curveTo(13.84, 12.656, 13.965, 12.656, 14.113, 12.559);
        ((GeneralPath) shape).curveTo(14.215, 12.434, 14.203, 12.309, 14.078, 12.184);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_160
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.562, 11.957);
        ((GeneralPath) shape).curveTo(14.4140005, 11.859, 14.301001, 11.870999, 14.227, 11.995999);
        ((GeneralPath) shape).curveTo(14.129001, 12.1449995, 14.141, 12.257999, 14.266, 12.332);
        ((GeneralPath) shape).curveTo(14.391, 12.457, 14.5, 12.445, 14.602, 12.297);
        ((GeneralPath) shape).curveTo(14.727, 12.172, 14.711, 12.059, 14.562, 11.957);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_161
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.789, 12.707);
        ((GeneralPath) shape).curveTo(14.636999, 12.582, 14.488, 12.594, 14.339999, 12.745999);
        ((GeneralPath) shape).curveTo(14.214999, 12.8949995, 14.226999, 13.042999, 14.374999, 13.195);
        ((GeneralPath) shape).curveTo(14.526999, 13.32, 14.675999, 13.309, 14.823999, 13.156);
        ((GeneralPath) shape).curveTo(14.948999, 13.008, 14.938, 12.8550005, 14.789, 12.707);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_162
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.5, 11.957);
        ((GeneralPath) shape).curveTo(15.273, 11.832, 15.086, 11.859, 14.938, 12.035);
        ((GeneralPath) shape).curveTo(14.789, 12.234, 14.811999, 12.422, 15.012, 12.594);
        ((GeneralPath) shape).curveTo(15.238, 12.7699995, 15.41, 12.746, 15.535, 12.5199995);
        ((GeneralPath) shape).curveTo(15.7109995, 12.344, 15.698999, 12.16, 15.5, 11.957);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4D7830));
        g.fill(shape);

        // _0_0_0_163
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.359, 11.996);
        ((GeneralPath) shape).curveTo(16.210999, 11.871, 16.046999, 11.895, 15.874999, 12.070001);
        ((GeneralPath) shape).curveTo(15.749999, 12.195001, 15.772999, 12.359, 15.948999, 12.559001);
        ((GeneralPath) shape).curveTo(16.098, 12.680001, 16.262, 12.656001, 16.434, 12.4800005);
        ((GeneralPath) shape).curveTo(16.586, 12.309, 16.559, 12.145, 16.359, 11.996);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_164
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.75, 13.793);
        ((GeneralPath) shape).curveTo(14.527, 13.570001, 14.312, 13.582, 14.113, 13.832);
        ((GeneralPath) shape).curveTo(13.891, 14.078, 13.901999, 14.304999, 14.151999, 14.504);
        ((GeneralPath) shape).curveTo(14.426, 14.73, 14.651999, 14.703, 14.823999, 14.429999);
        ((GeneralPath) shape).curveTo(14.926, 14.327999, 14.9609995, 14.218999, 14.938, 14.093999);
        ((GeneralPath) shape).curveTo(14.938, 13.968999, 14.875, 13.866999, 14.75, 13.792999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_165
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.723, 13.23);
        ((GeneralPath) shape).curveTo(15.547, 13.105, 15.386999, 13.132999, 15.238, 13.304999);
        ((GeneralPath) shape).curveTo(15.113, 13.457, 15.137, 13.617, 15.312, 13.792999);
        ((GeneralPath) shape).curveTo(15.461, 13.917999, 15.625, 13.8949995, 15.801001, 13.718999);
        ((GeneralPath) shape).curveTo(15.949, 13.542999, 15.922001, 13.378999, 15.723001, 13.229999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_166
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.449, 15.289);
        ((GeneralPath) shape).curveTo(14.301001, 15.113, 14.125, 15.129, 13.926001, 15.327999);
        ((GeneralPath) shape).curveTo(13.777, 15.526999, 13.801001, 15.702999, 14.000001, 15.851999);
        ((GeneralPath) shape).curveTo(14.176001, 15.999999, 14.352001, 15.987999, 14.527001, 15.811999);
        ((GeneralPath) shape).curveTo(14.676002, 15.589999, 14.652001, 15.414, 14.449001, 15.289);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_167
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.555, 14.391);
        ((GeneralPath) shape).curveTo(13.453, 14.266, 13.328, 14.276999, 13.18, 14.429999);
        ((GeneralPath) shape).curveTo(13.078, 14.577999, 13.09, 14.702999, 13.215, 14.804999);
        ((GeneralPath) shape).curveTo(13.367001, 14.929999, 13.488, 14.914, 13.59, 14.766);
        ((GeneralPath) shape).curveTo(13.738, 14.617, 13.727, 14.492, 13.555, 14.391);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_168
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.602, 17.387);
        ((GeneralPath) shape).curveTo(14.449, 17.234, 14.301001, 17.25, 14.152, 17.421999);
        ((GeneralPath) shape).curveTo(14.027, 17.574, 14.0390005, 17.723, 14.188001, 17.870998);
        ((GeneralPath) shape).curveTo(14.391001, 18.022999, 14.551001, 18.007998, 14.676001, 17.835999);
        ((GeneralPath) shape).curveTo(14.801001, 17.659998, 14.773001, 17.512, 14.602, 17.387);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_169
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.348, 18.246);
        ((GeneralPath) shape).curveTo(15.25, 18.148, 15.151999, 18.16, 15.051, 18.285);
        ((GeneralPath) shape).curveTo(14.976999, 18.359, 14.988, 18.445, 15.089999, 18.546999);
        ((GeneralPath) shape).curveTo(15.187999, 18.644999, 15.289, 18.633, 15.386999, 18.508);
        ((GeneralPath) shape).curveTo(15.4609995, 18.434, 15.448999, 18.348, 15.348, 18.246);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_170
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.801, 16.336);
        ((GeneralPath) shape).curveTo(15.648, 16.188, 15.512, 16.199001, 15.387, 16.375);
        ((GeneralPath) shape).curveTo(15.262, 16.550999, 15.273, 16.699, 15.426, 16.824);
        ((GeneralPath) shape).curveTo(15.625, 16.925999, 15.773, 16.897999, 15.875, 16.75);
        ((GeneralPath) shape).curveTo(15.973, 16.602, 15.949, 16.461, 15.801, 16.336);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_171
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.789, 19.406);
        ((GeneralPath) shape).curveTo(14.561999, 19.281, 14.375, 19.309, 14.226999, 19.48);
        ((GeneralPath) shape).curveTo(14.051, 19.656, 14.073999, 19.844, 14.301, 20.043);
        ((GeneralPath) shape).curveTo(14.526999, 20.219, 14.698999, 20.195, 14.823999, 19.969);
        ((GeneralPath) shape).curveTo(14.999999, 19.793, 14.987999, 19.605, 14.789, 19.406);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_172
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.188, 20.156);
        ((GeneralPath) shape).curveTo(14.113, 20.055, 14.016, 20.07, 13.891, 20.195);
        ((GeneralPath) shape).curveTo(13.811999, 20.27, 13.828, 20.367, 13.926, 20.492);
        ((GeneralPath) shape).curveTo(14.026999, 20.566, 14.125, 20.555, 14.226999, 20.457);
        ((GeneralPath) shape).curveTo(14.327999, 20.355001, 14.311999, 20.258001, 14.188, 20.156);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_173
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.629, 19.297);
        ((GeneralPath) shape).curveTo(13.453, 19.121, 13.266, 19.133001, 13.066, 19.332);
        ((GeneralPath) shape).curveTo(12.891, 19.531, 12.902, 19.730001, 13.102, 19.93);
        ((GeneralPath) shape).curveTo(13.328, 20.105, 13.527, 20.082, 13.703, 19.855);
        ((GeneralPath) shape).curveTo(13.875, 19.68, 13.852, 19.496, 13.629, 19.296999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_174
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.617, 19.258);
        ((GeneralPath) shape).curveTo(12.516, 19.156, 12.417999, 19.171999, 12.316, 19.296999);
        ((GeneralPath) shape).curveTo(12.219, 19.394999, 12.23, 19.495998, 12.355, 19.594);
        ((GeneralPath) shape).curveTo(12.452999, 19.695, 12.554999, 19.68, 12.655999, 19.559);
        ((GeneralPath) shape).curveTo(12.753999, 19.457, 12.742, 19.359, 12.617, 19.258);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_175
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.723, 19.445);
        ((GeneralPath) shape).curveTo(15.547, 19.32, 15.398, 19.344, 15.273, 19.52);
        ((GeneralPath) shape).curveTo(15.125, 19.668001, 15.137, 19.82, 15.311999, 19.969);
        ((GeneralPath) shape).curveTo(15.4609995, 20.07, 15.624999, 20.055, 15.796999, 19.934);
        ((GeneralPath) shape).curveTo(15.948999, 19.758, 15.921999, 19.594, 15.722999, 19.445);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_176
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.961, 18.508);
        ((GeneralPath) shape).curveTo(16.684, 18.285, 16.422, 18.309, 16.172, 18.585999);
        ((GeneralPath) shape).curveTo(16.074001, 18.683998, 16.035002, 18.819998, 16.062, 18.995998);
        ((GeneralPath) shape).curveTo(16.086, 19.144999, 16.148, 19.269999, 16.25, 19.370998);
        ((GeneralPath) shape).curveTo(16.547, 19.593998, 16.809, 19.569998, 17.035, 19.296999);
        ((GeneralPath) shape).curveTo(17.281, 18.995998, 17.258, 18.734, 16.961, 18.508);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_177
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.934, 17.609);
        ((GeneralPath) shape).curveTo(17.734, 17.41, 17.52, 17.421999, 17.297, 17.647999);
        ((GeneralPath) shape).curveTo(17.121, 17.870998, 17.145, 18.085999, 17.371, 18.280998);
        ((GeneralPath) shape).curveTo(17.473, 18.382998, 17.582, 18.421999, 17.707, 18.394999);
        ((GeneralPath) shape).curveTo(17.832, 18.394999, 17.934, 18.343998, 18.008001, 18.245998);
        ((GeneralPath) shape).curveTo(18.180002, 17.972998, 18.156002, 17.762, 17.934002, 17.609);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_178
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.434, 17.312);
        ((GeneralPath) shape).curveTo(16.234, 17.16, 16.047, 17.188, 15.875, 17.387001);
        ((GeneralPath) shape).curveTo(15.699, 17.609001, 15.723, 17.785002, 15.949, 17.910002);
        ((GeneralPath) shape).curveTo(16.125, 18.086002, 16.309, 18.074001, 16.508, 17.871002);
        ((GeneralPath) shape).curveTo(16.66, 17.672003, 16.633, 17.484003, 16.434, 17.312002);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_179
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.535, 17.199);
        ((GeneralPath) shape).curveTo(15.387, 17.074, 15.238, 17.085999, 15.0859995, 17.234);
        ((GeneralPath) shape).curveTo(14.9609995, 17.387, 14.973, 17.535, 15.124999, 17.688);
        ((GeneralPath) shape).curveTo(15.272999, 17.809, 15.425999, 17.796999, 15.573999, 17.647999);
        ((GeneralPath) shape).curveTo(15.698999, 17.499998, 15.688, 17.348, 15.535, 17.199);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_180
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.332, 16.488);
        ((GeneralPath) shape).curveTo(17.109001, 16.262001, 16.898, 16.277, 16.699001, 16.523);
        ((GeneralPath) shape).curveTo(16.473001, 16.773, 16.484001, 17.0, 16.734001, 17.199001);
        ((GeneralPath) shape).curveTo(17.008001, 17.422, 17.234001, 17.398, 17.410002, 17.125002);
        ((GeneralPath) shape).curveTo(17.508001, 17.023003, 17.547, 16.910002, 17.520002, 16.789001);
        ((GeneralPath) shape).curveTo(17.520002, 16.664001, 17.457003, 16.562002, 17.332003, 16.488);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_181
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.645, 16.152);
        ((GeneralPath) shape).curveTo(18.293001, 15.902, 17.996, 15.926001, 17.746, 16.227001);
        ((GeneralPath) shape).curveTo(17.645, 16.352001, 17.594, 16.500002, 17.594, 16.676);
        ((GeneralPath) shape).curveTo(17.621, 16.848001, 17.695, 17.0, 17.82, 17.125);
        ((GeneralPath) shape).curveTo(17.945, 17.227, 18.094, 17.273, 18.27, 17.273);
        ((GeneralPath) shape).curveTo(18.469, 17.25, 18.617, 17.176, 18.719, 17.051);
        ((GeneralPath) shape).curveTo(18.969, 16.699001, 18.941, 16.398, 18.645, 16.152);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_182
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.594, 15.289);
        ((GeneralPath) shape).curveTo(17.445, 15.113, 17.27, 15.129, 17.07, 15.327999);
        ((GeneralPath) shape).curveTo(16.945, 15.499999, 16.973, 15.664, 17.145, 15.811999);
        ((GeneralPath) shape).curveTo(17.348, 15.964999, 17.508001, 15.948999, 17.633001, 15.776999);
        ((GeneralPath) shape).curveTo(17.781002, 15.577999, 17.77, 15.414, 17.594002, 15.289);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_183
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.434, 15.516);
        ((GeneralPath) shape).curveTo(16.234, 15.34, 16.035, 15.352, 15.836, 15.551);
        ((GeneralPath) shape).curveTo(15.637, 15.801, 15.648001, 16.012, 15.875, 16.188);
        ((GeneralPath) shape).curveTo(16.098, 16.362999, 16.309, 16.336, 16.508, 16.112999);
        ((GeneralPath) shape).curveTo(16.684, 15.890999, 16.66, 15.687999, 16.434, 15.515999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_184
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.199, 15.59);
        ((GeneralPath) shape).curveTo(15.125, 15.465, 15.027, 15.465, 14.898001, 15.59);
        ((GeneralPath) shape).curveTo(14.801001, 15.738, 14.812, 15.852, 14.938001, 15.926001);
        ((GeneralPath) shape).curveTo(15.0390005, 16.027, 15.137001, 16.012001, 15.238001, 15.891001);
        ((GeneralPath) shape).curveTo(15.312001, 15.766001, 15.301001, 15.6640005, 15.199001, 15.590001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_185
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.488, 16.414);
        ((GeneralPath) shape).curveTo(14.391, 16.362999, 14.312, 16.375, 14.266, 16.449);
        ((GeneralPath) shape).curveTo(14.215, 16.5, 14.227, 16.574, 14.301, 16.675999);
        ((GeneralPath) shape).curveTo(14.351999, 16.749998, 14.426, 16.737999, 14.526999, 16.637);
        ((GeneralPath) shape).curveTo(14.601999, 16.561998, 14.589999, 16.487999, 14.488, 16.414);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_186
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.02, 17.984);
        ((GeneralPath) shape).curveTo(11.867001, 17.835999, 11.7300005, 17.848, 11.6050005, 18.022999);
        ((GeneralPath) shape).curveTo(11.457001, 18.171999, 11.469001, 18.308998, 11.641001, 18.433998);
        ((GeneralPath) shape).curveTo(11.691001, 18.483997, 11.766001, 18.507998, 11.867001, 18.507998);
        ((GeneralPath) shape).curveTo(11.969001, 18.507998, 12.031, 18.472998, 12.055, 18.394997);
        ((GeneralPath) shape).curveTo(12.1050005, 18.347996, 12.129001, 18.269997, 12.129001, 18.171997);
        ((GeneralPath) shape).curveTo(12.129001, 18.069998, 12.094001, 18.007998, 12.02, 17.983997);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_187
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.066, 18.285);
        ((GeneralPath) shape).curveTo(12.914, 18.133, 12.793, 18.148, 12.691, 18.32);
        ((GeneralPath) shape).curveTo(12.594, 18.421999, 12.605, 18.546999, 12.73, 18.695);
        ((GeneralPath) shape).curveTo(12.855, 18.796999, 12.98, 18.781, 13.105, 18.66);
        ((GeneralPath) shape).curveTo(13.202999, 18.508, 13.191, 18.383, 13.066, 18.285);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_188
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.055, 10.012);
        ((GeneralPath) shape).curveTo(11.8550005, 9.863, 11.68, 9.887, 11.531, 10.086);
        ((GeneralPath) shape).curveTo(11.383, 10.285001, 11.406, 10.461, 11.6050005, 10.609);
        ((GeneralPath) shape).curveTo(11.781, 10.734, 11.957001, 10.711, 12.129001, 10.535);
        ((GeneralPath) shape).curveTo(12.254001, 10.359, 12.2300005, 10.188, 12.055, 10.012);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_189
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.766, 10.051);
        ((GeneralPath) shape).curveTo(12.641, 10.0, 12.543, 10.012, 12.469, 10.0859995);
        ((GeneralPath) shape).curveTo(12.391, 10.188, 12.406, 10.285, 12.504, 10.386999);
        ((GeneralPath) shape).curveTo(12.629, 10.4609995, 12.73, 10.448999, 12.804999, 10.348);
        ((GeneralPath) shape).curveTo(12.901999, 10.25, 12.891, 10.148, 12.766, 10.051);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4D7830));
        g.fill(shape);

        // _0_0_0_190
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.758, 9.152);
        ((GeneralPath) shape).curveTo(11.7300005, 9.102, 11.656, 9.102, 11.531, 9.152);
        ((GeneralPath) shape).curveTo(11.4800005, 9.25, 11.496, 9.336, 11.57, 9.4140005);
        ((GeneralPath) shape).curveTo(11.667999, 9.461, 11.742, 9.449, 11.792999, 9.375001);
        ((GeneralPath) shape).curveTo(11.8949995, 9.277001, 11.879, 9.199001, 11.757999, 9.152001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_191
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.703, 9.414);
        ((GeneralPath) shape).curveTo(13.504, 9.2109995, 13.328, 9.226999, 13.18, 9.448999);
        ((GeneralPath) shape).curveTo(13.027, 9.648, 13.0390005, 9.8359995, 13.215, 10.011999);
        ((GeneralPath) shape).curveTo(13.4140005, 10.187999, 13.602, 10.159999, 13.777, 9.937999);
        ((GeneralPath) shape).curveTo(13.953, 9.710999, 13.926001, 9.538999, 13.703, 9.413999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_192
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.078, 8.367);
        ((GeneralPath) shape).curveTo(13.953, 8.289, 13.852, 8.301, 13.777, 8.401999);
        ((GeneralPath) shape).curveTo(13.676001, 8.504, 13.676001, 8.613, 13.777, 8.738);
        ((GeneralPath) shape).curveTo(13.902, 8.812, 14.016001, 8.801, 14.113001, 8.703);
        ((GeneralPath) shape).curveTo(14.215001, 8.551, 14.203001, 8.441, 14.078001, 8.367);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_193
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.066, 8.926);
        ((GeneralPath) shape).curveTo(12.992, 8.851999, 12.93, 8.863, 12.879, 8.964999);
        ((GeneralPath) shape).curveTo(12.828, 9.061999, 12.84, 9.124999, 12.917999, 9.151999);
        ((GeneralPath) shape).curveTo(12.968999, 9.226999, 13.026999, 9.226999, 13.105, 9.151999);
        ((GeneralPath) shape).curveTo(13.151999, 9.073999, 13.141, 8.999999, 13.066, 8.926);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_194
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.109, 16.188);
        ((GeneralPath) shape).curveTo(9.934, 16.062, 9.785, 16.09, 9.66, 16.262);
        ((GeneralPath) shape).curveTo(9.507999, 16.414, 9.523, 16.561998, 9.695, 16.710999);
        ((GeneralPath) shape).curveTo(9.848, 16.835999, 9.995999, 16.824, 10.1449995, 16.675999);
        ((GeneralPath) shape).curveTo(10.245999, 16.522999, 10.233999, 16.362999, 10.108999, 16.187998);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_195
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.473, 16.824);
        ((GeneralPath) shape).curveTo(9.348, 16.75, 9.245999, 16.75, 9.172, 16.824);
        ((GeneralPath) shape).curveTo(9.098, 16.949, 9.109, 17.046999, 9.2109995, 17.125);
        ((GeneralPath) shape).curveTo(9.285, 17.25, 9.386999, 17.25, 9.511999, 17.125);
        ((GeneralPath) shape).curveTo(9.5859995, 17.023, 9.569999, 16.926, 9.473, 16.824);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_196
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.547, 15.363);
        ((GeneralPath) shape).curveTo(9.348, 15.215, 9.188, 15.238, 9.062, 15.441);
        ((GeneralPath) shape).curveTo(8.887, 15.613, 8.898001, 15.777, 9.098001, 15.926);
        ((GeneralPath) shape).curveTo(9.273001, 16.078, 9.449, 16.062, 9.625001, 15.891);
        ((GeneralPath) shape).curveTo(9.773001, 15.688, 9.746001, 15.516, 9.547001, 15.363);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_197
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.574, 15.176);
        ((GeneralPath) shape).curveTo(8.473001, 15.101999, 8.348001, 15.113, 8.199, 15.214999);
        ((GeneralPath) shape).curveTo(8.102, 15.362999, 8.113, 15.487999, 8.238, 15.589999);
        ((GeneralPath) shape).curveTo(8.363, 15.687999, 8.488, 15.676, 8.613, 15.551);
        ((GeneralPath) shape).curveTo(8.7109995, 15.426, 8.699, 15.301, 8.574, 15.176);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_198
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.309, 17.199);
        ((GeneralPath) shape).curveTo(11.082, 17.022999, 10.883, 17.046999, 10.707, 17.272999);
        ((GeneralPath) shape).curveTo(10.535, 17.473, 10.559, 17.659998, 10.781, 17.835999);
        ((GeneralPath) shape).curveTo(10.957, 18.008, 11.145, 17.995998, 11.344, 17.796999);
        ((GeneralPath) shape).curveTo(11.5199995, 17.598, 11.507999, 17.397999, 11.309, 17.199);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_199
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.707, 16.676);
        ((GeneralPath) shape).curveTo(10.632999, 16.625, 10.559, 16.625, 10.484, 16.676);
        ((GeneralPath) shape).curveTo(10.434, 16.75, 10.445001, 16.824001, 10.52, 16.898);
        ((GeneralPath) shape).curveTo(10.621, 16.949001, 10.684, 16.938002, 10.707001, 16.863);
        ((GeneralPath) shape).curveTo(10.781001, 16.812, 10.781001, 16.75, 10.707001, 16.676);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_200
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.934, 15.254);
        ((GeneralPath) shape).curveTo(10.66, 15.026999, 10.41, 15.054999, 10.184, 15.328);
        ((GeneralPath) shape).curveTo(9.961, 15.602, 9.984, 15.852, 10.258, 16.078);
        ((GeneralPath) shape).curveTo(10.535001, 16.300999, 10.781, 16.276999, 11.008, 15.999999);
        ((GeneralPath) shape).curveTo(11.234, 15.726999, 11.207001, 15.476999, 10.934, 15.253999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_201
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.035, 14.43);
        ((GeneralPath) shape).curveTo(9.809, 14.254001, 9.609, 14.277, 9.434, 14.504001);
        ((GeneralPath) shape).curveTo(9.359, 14.578001, 9.324, 14.68, 9.324, 14.805);
        ((GeneralPath) shape).curveTo(9.324, 14.93, 9.371, 15.027, 9.473001, 15.102);
        ((GeneralPath) shape).curveTo(9.695001, 15.277, 9.910001, 15.254001, 10.109, 15.027);
        ((GeneralPath) shape).curveTo(10.281, 14.805, 10.258, 14.6050005, 10.035, 14.43);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_202
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(8.984, 13.719);
        ((GeneralPath) shape).curveTo(8.91, 13.617, 8.812, 13.629, 8.688, 13.754);
        ((GeneralPath) shape).curveTo(8.608999, 13.832, 8.625, 13.929999, 8.723, 14.054999);
        ((GeneralPath) shape).curveTo(8.823999, 14.129, 8.922, 14.117, 9.023, 14.0199995);
        ((GeneralPath) shape).curveTo(9.125, 13.917999, 9.109, 13.816, 8.984, 13.719);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_203
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.055, 16.039);
        ((GeneralPath) shape).curveTo(11.805, 15.811999, 11.543, 15.839999, 11.27, 16.112999);
        ((GeneralPath) shape).curveTo(11.168, 16.237999, 11.133, 16.374998, 11.156, 16.522999);
        ((GeneralPath) shape).curveTo(11.18, 16.675999, 11.258, 16.800999, 11.383, 16.897999);
        ((GeneralPath) shape).curveTo(11.656, 17.124998, 11.906, 17.098, 12.129001, 16.824);
        ((GeneralPath) shape).curveTo(12.379001, 16.522999, 12.3550005, 16.262, 12.055, 16.039);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_204
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.719, 18.809);
        ((GeneralPath) shape).curveTo(11.594, 18.734, 11.48, 18.746, 11.382999, 18.848);
        ((GeneralPath) shape).curveTo(11.280999, 18.996, 11.292999, 19.109, 11.417999, 19.184);
        ((GeneralPath) shape).curveTo(11.5199995, 19.258, 11.620999, 19.246, 11.718999, 19.145);
        ((GeneralPath) shape).curveTo(11.843999, 19.02, 11.843999, 18.91, 11.718999, 18.809);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_205
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.879, 17.012);
        ((GeneralPath) shape).curveTo(12.679999, 16.835999, 12.469, 16.862999, 12.242, 17.085999);
        ((GeneralPath) shape).curveTo(12.167999, 17.159998, 12.1449995, 17.262, 12.167999, 17.387);
        ((GeneralPath) shape).curveTo(12.167999, 17.512, 12.218999, 17.609, 12.32, 17.688);
        ((GeneralPath) shape).curveTo(12.542999, 17.859, 12.742, 17.836, 12.917999, 17.609);
        ((GeneralPath) shape).curveTo(13.089999, 17.387, 13.077999, 17.188, 12.879, 17.012);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_206
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.59, 16.973);
        ((GeneralPath) shape).curveTo(13.492001, 16.848, 13.367001, 16.862999, 13.215, 17.012);
        ((GeneralPath) shape).curveTo(13.117001, 17.137, 13.129, 17.262, 13.254, 17.387);
        ((GeneralPath) shape).curveTo(13.401999, 17.487999, 13.526999, 17.473, 13.629, 17.348);
        ((GeneralPath) shape).curveTo(13.776999, 17.199, 13.766, 17.074, 13.59, 16.973);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_207
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.926, 17.91);
        ((GeneralPath) shape).curveTo(13.754, 17.785, 13.589999, 17.796999, 13.441, 17.945);
        ((GeneralPath) shape).curveTo(13.316, 18.121, 13.328, 18.285, 13.477, 18.434);
        ((GeneralPath) shape).curveTo(13.652, 18.559, 13.812, 18.535, 13.965, 18.359);
        ((GeneralPath) shape).curveTo(14.113, 18.210999, 14.102, 18.059, 13.926001, 17.91);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_208
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.188, 18.77);
        ((GeneralPath) shape).curveTo(14.061999, 18.672, 13.938, 18.684, 13.811999, 18.809);
        ((GeneralPath) shape).curveTo(13.714999, 18.957, 13.726999, 19.07, 13.851999, 19.145);
        ((GeneralPath) shape).curveTo(13.999999, 19.246, 14.112999, 19.234001, 14.188, 19.109001);
        ((GeneralPath) shape).curveTo(14.311999, 18.984001, 14.311999, 18.871, 14.188, 18.77);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_209
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.824, 18.508);
        ((GeneralPath) shape).curveTo(14.652, 18.387, 14.512, 18.397999, 14.4140005, 18.546999);
        ((GeneralPath) shape).curveTo(14.2890005, 18.671999, 14.301001, 18.808998, 14.449, 18.956999);
        ((GeneralPath) shape).curveTo(14.602, 19.058998, 14.738, 19.034998, 14.863, 18.883);
        ((GeneralPath) shape).curveTo(15.012, 18.734, 15.0, 18.609, 14.824, 18.508);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_210
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.516, 15.551);
        ((GeneralPath) shape).curveTo(13.215, 15.328, 12.953, 15.351999, 12.73, 15.629);
        ((GeneralPath) shape).curveTo(12.504, 15.901999, 12.530999, 16.152, 12.804999, 16.375);
        ((GeneralPath) shape).curveTo(13.105, 16.602, 13.367, 16.574, 13.589999, 16.301);
        ((GeneralPath) shape).curveTo(13.815999, 16.027, 13.789, 15.777, 13.515999, 15.551001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_211
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.469, 15.141);
        ((GeneralPath) shape).curveTo(12.266, 14.992, 12.105, 15.004, 11.98, 15.176);
        ((GeneralPath) shape).curveTo(11.832, 15.351999, 11.844, 15.526999, 12.0199995, 15.703);
        ((GeneralPath) shape).curveTo(12.191, 15.828, 12.367, 15.801, 12.542999, 15.625);
        ((GeneralPath) shape).curveTo(12.690999, 15.453, 12.667999, 15.289, 12.468999, 15.141);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_212
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.605, 14.953);
        ((GeneralPath) shape).curveTo(11.554999, 14.902, 11.48, 14.891, 11.382999, 14.9140005);
        ((GeneralPath) shape).curveTo(11.280999, 14.9140005, 11.219, 14.953, 11.195, 15.027);
        ((GeneralPath) shape).curveTo(11.042999, 15.176001, 11.059, 15.312, 11.23, 15.438001);
        ((GeneralPath) shape).curveTo(11.382999, 15.590001, 11.5199995, 15.574, 11.6449995, 15.402);
        ((GeneralPath) shape).curveTo(11.792999, 15.254001, 11.780999, 15.102, 11.605, 14.953);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_213
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.355, 13.98);
        ((GeneralPath) shape).curveTo(12.155999, 13.804999, 11.957, 13.816, 11.757999, 14.016);
        ((GeneralPath) shape).curveTo(11.582, 14.242, 11.605, 14.441, 11.832, 14.617);
        ((GeneralPath) shape).curveTo(12.031, 14.789, 12.219, 14.766, 12.391, 14.539);
        ((GeneralPath) shape).curveTo(12.566, 14.367, 12.554999, 14.179999, 12.355, 13.98);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_214
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.953, 14.84);
        ((GeneralPath) shape).curveTo(12.902, 14.793, 12.828, 14.793, 12.7300005, 14.84);
        ((GeneralPath) shape).curveTo(12.68, 14.9140005, 12.691001, 14.992001, 12.766001, 15.066);
        ((GeneralPath) shape).curveTo(12.840001, 15.141, 12.902, 15.129, 12.953001, 15.027);
        ((GeneralPath) shape).curveTo(13.027001, 14.977, 13.027001, 14.9140005, 12.953001, 14.84);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_215
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.691, 12.781);
        ((GeneralPath) shape).curveTo(12.52, 12.656, 12.355, 12.668, 12.207, 12.82);
        ((GeneralPath) shape).curveTo(12.082, 12.992, 12.105, 13.156, 12.281, 13.304999);
        ((GeneralPath) shape).curveTo(12.43, 13.457, 12.594, 13.440999, 12.766, 13.2699995);
        ((GeneralPath) shape).curveTo(12.918, 13.094, 12.891, 12.929999, 12.691, 12.780999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_216
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.477, 12.035);
        ((GeneralPath) shape).curveTo(13.227, 11.832, 13.016, 11.848, 12.84, 12.07);
        ((GeneralPath) shape).curveTo(12.617001, 12.297, 12.629, 12.507999, 12.879, 12.707);
        ((GeneralPath) shape).curveTo(13.129, 12.906, 13.34, 12.8949995, 13.516, 12.668);
        ((GeneralPath) shape).curveTo(13.715, 12.422, 13.703, 12.207, 13.477, 12.035);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_217
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.469, 11.621);
        ((GeneralPath) shape).curveTo(12.242, 11.445001, 12.043, 11.473001, 11.867, 11.695001);
        ((GeneralPath) shape).curveTo(11.719, 11.895, 11.742, 12.082001, 11.941, 12.258);
        ((GeneralPath) shape).curveTo(12.168, 12.434, 12.355, 12.406, 12.504, 12.184);
        ((GeneralPath) shape).curveTo(12.703, 11.984, 12.691, 11.797, 12.469, 11.621);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_218
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.57, 11.586);
        ((GeneralPath) shape).curveTo(11.367, 11.434, 11.207, 11.445001, 11.082, 11.621);
        ((GeneralPath) shape).curveTo(10.906, 11.797, 10.922, 11.957001, 11.120999, 12.109);
        ((GeneralPath) shape).curveTo(11.292999, 12.281, 11.457, 12.27, 11.605, 12.070001);
        ((GeneralPath) shape).curveTo(11.757999, 11.871, 11.742, 11.711, 11.57, 11.586);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_219
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.07, 11.508);
        ((GeneralPath) shape).curveTo(9.995999, 11.461, 9.922, 11.473001, 9.848, 11.547);
        ((GeneralPath) shape).curveTo(9.797, 11.648, 9.809, 11.7109995, 9.886999, 11.734);
        ((GeneralPath) shape).curveTo(9.9609995, 11.785, 10.022999, 11.785, 10.069999, 11.734);
        ((GeneralPath) shape).curveTo(10.120998, 11.684, 10.120998, 11.609, 10.069999, 11.508);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_220
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.383, 10.91);
        ((GeneralPath) shape).curveTo(11.309, 10.809, 11.219001, 10.809, 11.121, 10.91);
        ((GeneralPath) shape).curveTo(11.02, 11.007999, 11.031, 11.098, 11.156, 11.172);
        ((GeneralPath) shape).curveTo(11.258, 11.246, 11.344, 11.246, 11.418, 11.172);
        ((GeneralPath) shape).curveTo(11.469, 11.023, 11.457, 10.938, 11.383, 10.91);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_221
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.156, 10.238);
        ((GeneralPath) shape).curveTo(11.031, 10.16, 10.934, 10.176, 10.859, 10.273);
        ((GeneralPath) shape).curveTo(10.758, 10.375, 10.77, 10.4609995, 10.895, 10.535);
        ((GeneralPath) shape).curveTo(10.996, 10.637, 11.094001, 10.637, 11.195001, 10.535);
        ((GeneralPath) shape).curveTo(11.246, 10.41, 11.2300005, 10.312, 11.156001, 10.238);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_222
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.281, 10.91);
        ((GeneralPath) shape).curveTo(12.203, 10.809, 12.117001, 10.809, 12.02, 10.91);
        ((GeneralPath) shape).curveTo(11.941, 10.984, 11.957001, 11.07, 12.055, 11.172);
        ((GeneralPath) shape).curveTo(12.156, 11.2699995, 12.242001, 11.258, 12.316, 11.133);
        ((GeneralPath) shape).curveTo(12.418, 11.035001, 12.406, 10.961, 12.281, 10.910001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_223
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.953, 11.023);
        ((GeneralPath) shape).curveTo(12.828, 10.898, 12.691, 10.91, 12.543, 11.059);
        ((GeneralPath) shape).curveTo(12.441, 11.211, 12.457, 11.348, 12.578, 11.473);
        ((GeneralPath) shape).curveTo(12.754, 11.547, 12.891, 11.535, 12.992, 11.434);
        ((GeneralPath) shape).curveTo(13.117, 11.262, 13.101999, 11.121, 12.953, 11.023);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_224
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.078, 10.984);
        ((GeneralPath) shape).curveTo(13.902, 10.809, 13.715, 10.824, 13.516, 11.023);
        ((GeneralPath) shape).curveTo(13.391, 11.245999, 13.414, 11.434, 13.59, 11.5859995);
        ((GeneralPath) shape).curveTo(13.766, 11.757999, 13.953, 11.733999, 14.152, 11.507999);
        ((GeneralPath) shape).curveTo(14.328, 11.285, 14.301001, 11.108999, 14.078, 10.983999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4D7830));
        g.fill(shape);

        // _0_0_0_225
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.012, 10.945);
        ((GeneralPath) shape).curveTo(14.887, 10.797, 14.738, 10.809, 14.562, 10.983999);
        ((GeneralPath) shape).curveTo(14.4140005, 11.183999, 14.426001, 11.348, 14.602, 11.473);
        ((GeneralPath) shape).curveTo(14.773001, 11.598, 14.938001, 11.5859995, 15.086, 11.434);
        ((GeneralPath) shape).curveTo(15.238001, 11.262, 15.211, 11.098, 15.012, 10.945);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_226
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.875, 10.91);
        ((GeneralPath) shape).curveTo(15.699, 10.785, 15.547, 10.797, 15.426, 10.945);
        ((GeneralPath) shape).curveTo(15.273, 11.098, 15.285, 11.245999, 15.4609995, 11.398);
        ((GeneralPath) shape).curveTo(15.636999, 11.523, 15.785, 11.507999, 15.91, 11.359);
        ((GeneralPath) shape).curveTo(16.035, 11.184, 16.023, 11.035, 15.875, 10.91);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_227
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(14.75, 9.898);
        ((GeneralPath) shape).curveTo(14.527, 9.726999, 14.324, 9.738, 14.152, 9.938);
        ((GeneralPath) shape).curveTo(13.977, 10.16, 14.0, 10.358999, 14.227, 10.535);
        ((GeneralPath) shape).curveTo(14.449, 10.7109995, 14.652, 10.698999, 14.824, 10.5);
        ((GeneralPath) shape).curveTo(15.0, 10.273, 14.977, 10.074, 14.75, 9.898);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_228
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.477, 10.426);
        ((GeneralPath) shape).curveTo(13.328, 10.323999, 13.191, 10.3359995, 13.066, 10.4609995);
        ((GeneralPath) shape).curveTo(12.965, 10.66, 12.98, 10.797, 13.102, 10.870999);
        ((GeneralPath) shape).curveTo(13.277, 10.995999, 13.4140005, 10.983999, 13.516, 10.8359995);
        ((GeneralPath) shape).curveTo(13.641, 10.7109995, 13.629, 10.573999, 13.477, 10.426);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_229
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.617, 9.113);
        ((GeneralPath) shape).curveTo(12.469, 8.965, 12.304999, 8.977, 12.129, 9.151999);
        ((GeneralPath) shape).curveTo(12.004, 9.323999, 12.031, 9.488, 12.203, 9.636999);
        ((GeneralPath) shape).curveTo(12.379, 9.761999, 12.543, 9.749999, 12.691, 9.598);
        ((GeneralPath) shape).curveTo(12.84, 9.426, 12.816, 9.261999, 12.617, 9.113);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_230
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.805, 8.027);
        ((GeneralPath) shape).curveTo(12.7300005, 7.9530005, 12.641001, 7.9300003, 12.543, 7.9530005);
        ((GeneralPath) shape).curveTo(12.418, 7.9530005, 12.328, 8.004001, 12.277, 8.102);
        ((GeneralPath) shape).curveTo(12.203, 8.18, 12.18, 8.266, 12.203, 8.367001);
        ((GeneralPath) shape).curveTo(12.203, 8.488001, 12.242, 8.578001, 12.316, 8.629001);
        ((GeneralPath) shape).curveTo(12.516, 8.777, 12.703, 8.766001, 12.879, 8.590001);
        ((GeneralPath) shape).curveTo(13.004, 8.367002, 12.98, 8.176002, 12.804999, 8.027001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_231
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.555, 8.629);
        ((GeneralPath) shape).curveTo(13.477, 8.551, 13.391001, 8.566, 13.2890005, 8.664);
        ((GeneralPath) shape).curveTo(13.215, 8.738, 13.227, 8.827999, 13.328, 8.926);
        ((GeneralPath) shape).curveTo(13.43, 8.976999, 13.516, 8.964999, 13.59, 8.891);
        ((GeneralPath) shape).curveTo(13.641, 8.789, 13.629, 8.703, 13.555, 8.629);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_232
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.59, 7.805);
        ((GeneralPath) shape).curveTo(13.441, 7.703, 13.316, 7.719, 13.215, 7.8399997);
        ((GeneralPath) shape).curveTo(13.066, 7.9919996, 13.078, 8.117, 13.254, 8.215);
        ((GeneralPath) shape).curveTo(13.379, 8.316, 13.504, 8.301001, 13.629, 8.18);
        ((GeneralPath) shape).curveTo(13.726999, 8.055, 13.715, 7.9300003, 13.59, 7.8050003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_233
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.516, 6.68);
        ((GeneralPath) shape).curveTo(13.316, 6.5309997, 13.141, 6.555, 12.992, 6.7539997);
        ((GeneralPath) shape).curveTo(12.839999, 6.957, 12.855, 7.1169996, 13.026999, 7.2419996);
        ((GeneralPath) shape).curveTo(13.226999, 7.4179997, 13.401999, 7.4019995, 13.551, 7.2029996);
        ((GeneralPath) shape).curveTo(13.726999, 7.0309997, 13.714999, 6.8549995, 13.516, 6.6799994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_234
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.918, 7.43);
        ((GeneralPath) shape).curveTo(12.84, 7.355, 12.754001, 7.3669996, 12.656, 7.469);
        ((GeneralPath) shape).curveTo(12.6050005, 7.566, 12.617001, 7.652, 12.691, 7.73);
        ((GeneralPath) shape).curveTo(12.793, 7.777, 12.879, 7.766, 12.953, 7.691);
        ((GeneralPath) shape).curveTo(13.055, 7.59, 13.0390005, 7.504, 12.918, 7.43);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_235
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.656, 6.457);
        ((GeneralPath) shape).curveTo(12.453, 6.305, 12.293, 6.3199997, 12.168, 6.4919996);
        ((GeneralPath) shape).curveTo(12.043, 6.6449995, 12.066, 6.805, 12.242001, 6.9799995);
        ((GeneralPath) shape).curveTo(12.395, 7.1289997, 12.543, 7.1049995, 12.691001, 6.9059997);
        ((GeneralPath) shape).curveTo(12.840001, 6.7539997, 12.828001, 6.6049995, 12.656001, 6.457);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_236
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.953, 6.156);
        ((GeneralPath) shape).curveTo(12.8550005, 6.105, 12.793, 6.1210003, 12.766, 6.195);
        ((GeneralPath) shape).curveTo(12.719, 6.242, 12.719, 6.293, 12.766, 6.3440003);
        ((GeneralPath) shape).curveTo(12.84, 6.3950005, 12.901999, 6.3950005, 12.953, 6.3440003);
        ((GeneralPath) shape).curveTo(13.004, 6.2700005, 13.004, 6.2070003, 12.953, 6.156);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_237
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.98, 6.121);
        ((GeneralPath) shape).curveTo(11.804999, 5.996, 11.667999, 6.008, 11.57, 6.1559997);
        ((GeneralPath) shape).curveTo(11.445, 6.2809997, 11.457, 6.4179997, 11.605, 6.5699997);
        ((GeneralPath) shape).curveTo(11.757999, 6.6679997, 11.8949995, 6.6559997, 12.0199995, 6.5309997);
        ((GeneralPath) shape).curveTo(12.117, 6.332, 12.105, 6.1949997, 11.98, 6.121);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_238
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.23, 6.008);
        ((GeneralPath) shape).curveTo(11.179999, 5.957, 11.105, 5.934, 11.007999, 5.934);
        ((GeneralPath) shape).curveTo(10.905999, 5.934, 10.844, 5.969, 10.82, 6.043);
        ((GeneralPath) shape).curveTo(10.7699995, 6.0940003, 10.745999, 6.168, 10.745999, 6.2700005);
        ((GeneralPath) shape).curveTo(10.745999, 6.3670006, 10.780999, 6.4300003, 10.858999, 6.4570003);
        ((GeneralPath) shape).curveTo(11.007999, 6.6050005, 11.1449995, 6.5940003, 11.2699995, 6.418);
        ((GeneralPath) shape).curveTo(11.417999, 6.2700005, 11.405999, 6.1330004, 11.23, 6.0080004);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_239
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.531, 5.707);
        ((GeneralPath) shape).curveTo(11.4800005, 5.633, 11.418, 5.633, 11.344, 5.707);
        ((GeneralPath) shape).curveTo(11.2699995, 5.7809997, 11.2699995, 5.8589997, 11.344, 5.934);
        ((GeneralPath) shape).curveTo(11.445, 5.98, 11.507999, 5.969, 11.531, 5.895);
        ((GeneralPath) shape).curveTo(11.582, 5.871, 11.6050005, 5.832, 11.6050005, 5.781);
        ((GeneralPath) shape).curveTo(11.6050005, 5.7580004, 11.582001, 5.734, 11.531, 5.7070003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_240
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.445, 5.969);
        ((GeneralPath) shape).curveTo(10.2699995, 5.844, 10.108999, 5.855, 9.9609995, 6.008);
        ((GeneralPath) shape).curveTo(9.8359995, 6.184, 9.848, 6.344, 9.995999, 6.492);
        ((GeneralPath) shape).curveTo(10.171999, 6.617, 10.332, 6.594, 10.483999, 6.418);
        ((GeneralPath) shape).curveTo(10.632999, 6.2700005, 10.620999, 6.1210003, 10.445, 5.9690003);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x4D7830));
        g.fill(shape);

        // _0_0_0_241
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.961, 6.57);
        ((GeneralPath) shape).curveTo(9.859, 6.4690003, 9.758, 6.48, 9.660001, 6.605);
        ((GeneralPath) shape).curveTo(9.559001, 6.707, 9.574, 6.805, 9.699, 6.906);
        ((GeneralPath) shape).curveTo(9.797, 7.004, 9.898001, 6.992, 9.996, 6.867);
        ((GeneralPath) shape).curveTo(10.098001, 6.77, 10.086, 6.668, 9.961, 6.57);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_242
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(9.324, 6.68);
        ((GeneralPath) shape).curveTo(9.297, 6.6289997, 9.262, 6.6289997, 9.211, 6.68);
        ((GeneralPath) shape).curveTo(9.188001, 6.7029996, 9.188001, 6.7419996, 9.211, 6.7929997);
        ((GeneralPath) shape).curveTo(9.285001, 6.8669996, 9.324, 6.8669996, 9.324, 6.7929997);
        ((GeneralPath) shape).curveTo(9.398001, 6.719, 9.398001, 6.68, 9.324, 6.68);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_243
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(6.293, 9.227);
        ((GeneralPath) shape).curveTo(6.191, 9.176001, 6.129, 9.188001, 6.105, 9.262);
        ((GeneralPath) shape).curveTo(6.055, 9.312, 6.055, 9.375, 6.105, 9.449);
        ((GeneralPath) shape).curveTo(6.156, 9.5, 6.23, 9.5, 6.328, 9.449);
        ((GeneralPath) shape).curveTo(6.379, 9.375, 6.367, 9.301001, 6.293, 9.227);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_244
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(10.445, 7.277);
        ((GeneralPath) shape).curveTo(10.348, 7.156, 10.223, 7.1679997, 10.07, 7.316);
        ((GeneralPath) shape).curveTo(9.973, 7.441, 9.983999, 7.566, 10.108999, 7.691);
        ((GeneralPath) shape).curveTo(10.257999, 7.793, 10.382999, 7.777, 10.483999, 7.652);
        ((GeneralPath) shape).curveTo(10.632999, 7.5039997, 10.620999, 7.3789997, 10.445, 7.277);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_245
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.121, 6.906);
        ((GeneralPath) shape).curveTo(10.922, 6.754, 10.758, 6.77, 10.633, 6.941);
        ((GeneralPath) shape).curveTo(10.508, 7.117, 10.531, 7.266, 10.707001, 7.391);
        ((GeneralPath) shape).curveTo(10.758, 7.469, 10.832001, 7.4919996, 10.934001, 7.469);
        ((GeneralPath) shape).curveTo(11.031001, 7.469, 11.105001, 7.43, 11.156001, 7.355);
        ((GeneralPath) shape).curveTo(11.281001, 7.203, 11.270001, 7.055, 11.121001, 6.906);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_246
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.832, 7.055);
        ((GeneralPath) shape).curveTo(11.656, 6.9059997, 11.495999, 6.93, 11.344, 7.1289997);
        ((GeneralPath) shape).curveTo(11.219, 7.305, 11.234, 7.469, 11.382999, 7.6169996);
        ((GeneralPath) shape).curveTo(11.558999, 7.766, 11.73, 7.7539997, 11.905999, 7.5779996);
        ((GeneralPath) shape).curveTo(12.030999, 7.4019995, 12.003999, 7.2299995, 11.831999, 7.0549994);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_247
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(12.391, 7.355);
        ((GeneralPath) shape).curveTo(12.293, 7.305, 12.219, 7.316, 12.168, 7.391);
        ((GeneralPath) shape).curveTo(12.094, 7.469, 12.094, 7.5429997, 12.168, 7.6169996);
        ((GeneralPath) shape).curveTo(12.266, 7.6679997, 12.344, 7.6519995, 12.391, 7.5779996);
        ((GeneralPath) shape).curveTo(12.469, 7.5039997, 12.469, 7.4299994, 12.391, 7.3549995);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_248
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.793, 8.066);
        ((GeneralPath) shape).curveTo(11.621, 7.891, 11.457, 7.902, 11.309, 8.102);
        ((GeneralPath) shape).curveTo(11.23, 8.18, 11.207, 8.266, 11.23, 8.367001);
        ((GeneralPath) shape).curveTo(11.23, 8.488001, 11.2699995, 8.578001, 11.344, 8.629001);
        ((GeneralPath) shape).curveTo(11.5199995, 8.777, 11.695, 8.766001, 11.867, 8.590001);
        ((GeneralPath) shape).curveTo(12.0199995, 8.367002, 11.992, 8.191001, 11.792999, 8.066001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_249
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.043, 7.805);
        ((GeneralPath) shape).curveTo(10.969, 7.7539997, 10.895, 7.766, 10.820001, 7.8399997);
        ((GeneralPath) shape).curveTo(10.77, 7.9139996, 10.781001, 7.9919996, 10.859, 8.066);
        ((GeneralPath) shape).curveTo(10.934, 8.117, 11.008, 8.102, 11.082, 8.027);
        ((GeneralPath) shape).curveTo(11.156, 7.9530005, 11.1449995, 7.8790007, 11.043, 7.8050003);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_250
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(11.195, 8.926);
        ((GeneralPath) shape).curveTo(10.995999, 8.776999, 10.82, 8.801, 10.672, 9.0);
        ((GeneralPath) shape).curveTo(10.5199995, 9.199, 10.547, 9.375, 10.746, 9.527);
        ((GeneralPath) shape).curveTo(10.922, 9.648001, 11.082001, 9.625, 11.2300005, 9.449);
        ((GeneralPath) shape).curveTo(11.406, 9.277, 11.395, 9.102, 11.195001, 8.926001);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_251
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.609, 14.504);
        ((GeneralPath) shape).curveTo(15.438, 14.379, 15.273, 14.391, 15.125, 14.542999);
        ((GeneralPath) shape).curveTo(14.973, 14.690999, 14.988, 14.867, 15.16, 15.065999);
        ((GeneralPath) shape).curveTo(15.3359995, 15.190999, 15.5, 15.163999, 15.648, 14.991999);
        ((GeneralPath) shape).curveTo(15.801, 14.792998, 15.785, 14.628999, 15.609, 14.503999);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_252
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.473, 14.277);
        ((GeneralPath) shape).curveTo(16.272999, 14.078, 16.098, 14.094001, 15.948999, 14.316);
        ((GeneralPath) shape).curveTo(15.796999, 14.516, 15.811999, 14.703, 15.983999, 14.879);
        ((GeneralPath) shape).curveTo(16.188, 15.026999, 16.370998, 15.016, 16.546999, 14.84);
        ((GeneralPath) shape).curveTo(16.723, 14.641, 16.695, 14.453, 16.473, 14.277);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_253
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.332, 13.906);
        ((GeneralPath) shape).curveTo(17.109001, 13.707, 16.898, 13.7300005, 16.699001, 13.9800005);
        ((GeneralPath) shape).curveTo(16.523, 14.203, 16.547, 14.418, 16.773, 14.617001);
        ((GeneralPath) shape).curveTo(16.996, 14.793, 17.211, 14.766001, 17.41, 14.543);
        ((GeneralPath) shape).curveTo(17.609, 14.316, 17.582, 14.1050005, 17.332, 13.906);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_254
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.621, 13.23);
        ((GeneralPath) shape).curveTo(16.496, 13.105, 16.359001, 13.117, 16.211, 13.2699995);
        ((GeneralPath) shape).curveTo(16.109001, 13.417999, 16.125, 13.554999, 16.246, 13.679999);
        ((GeneralPath) shape).curveTo(16.449, 13.780999, 16.586, 13.7699995, 16.66, 13.6449995);
        ((GeneralPath) shape).curveTo(16.785, 13.469, 16.773, 13.332, 16.621, 13.23);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_255
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.52, 12.52);
        ((GeneralPath) shape).curveTo(17.27, 12.320001, 17.059, 12.332001, 16.883001, 12.559);
        ((GeneralPath) shape).curveTo(16.711, 12.781, 16.734001, 12.98, 16.961, 13.156);
        ((GeneralPath) shape).curveTo(17.184, 13.332, 17.383001, 13.32, 17.559, 13.117001);
        ((GeneralPath) shape).curveTo(17.734, 12.895, 17.719, 12.695001, 17.52, 12.52);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_256
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.23, 13.754);
        ((GeneralPath) shape).curveTo(18.059, 13.629, 17.895, 13.641, 17.746, 13.792999);
        ((GeneralPath) shape).curveTo(17.621, 13.964999, 17.645, 14.129, 17.82, 14.276999);
        ((GeneralPath) shape).curveTo(17.996, 14.452999, 18.156, 14.440999, 18.305, 14.242);
        ((GeneralPath) shape).curveTo(18.457, 14.066, 18.43, 13.905999, 18.23, 13.754);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_257
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(18.531, 14.914);
        ((GeneralPath) shape).curveTo(18.281, 14.766, 18.082, 14.789, 17.934, 14.992);
        ((GeneralPath) shape).curveTo(17.781, 15.238, 17.809, 15.441, 18.008, 15.589999);
        ((GeneralPath) shape).curveTo(18.258, 15.737999, 18.441, 15.714999, 18.566, 15.515999);
        ((GeneralPath) shape).curveTo(18.742, 15.288999, 18.73, 15.089999, 18.531, 14.913999);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_258
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.934, 18.883);
        ((GeneralPath) shape).curveTo(17.781, 18.781, 17.645, 18.796999, 17.52, 18.921999);
        ((GeneralPath) shape).curveTo(17.445, 19.094, 17.457, 19.23, 17.559, 19.331999);
        ((GeneralPath) shape).curveTo(17.734, 19.405998, 17.871, 19.394999, 17.969, 19.296999);
        ((GeneralPath) shape).curveTo(18.043, 19.120998, 18.031, 18.984, 17.934, 18.883);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_259
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(17.371, 19.445);
        ((GeneralPath) shape).curveTo(17.223, 19.344, 17.098, 19.359, 16.996, 19.48);
        ((GeneralPath) shape).curveTo(16.848, 19.633, 16.859001, 19.758, 17.035, 19.855);
        ((GeneralPath) shape).curveTo(17.16, 19.956999, 17.281, 19.945, 17.406, 19.82);
        ((GeneralPath) shape).curveTo(17.508, 19.695, 17.496, 19.57, 17.371, 19.445);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_260
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(16.359, 19.781);
        ((GeneralPath) shape).curveTo(16.210999, 19.633, 16.085999, 19.645, 15.983999, 19.82);
        ((GeneralPath) shape).curveTo(15.8359995, 19.969, 15.848, 20.105, 16.022999, 20.23);
        ((GeneralPath) shape).curveTo(16.171999, 20.331999, 16.308998, 20.316, 16.433998, 20.195);
        ((GeneralPath) shape).curveTo(16.534998, 19.992, 16.507998, 19.855, 16.358997, 19.781);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x5F963C));
        g.fill(shape);

        // _0_0_0_261
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(15.387, 20.27);
        ((GeneralPath) shape).curveTo(15.285, 20.195, 15.188, 20.207, 15.086, 20.305);
        ((GeneralPath) shape).curveTo(15.012, 20.43, 15.023001, 20.531, 15.125, 20.605);
        ((GeneralPath) shape).curveTo(15.227, 20.706999, 15.312, 20.691, 15.387, 20.566);
        ((GeneralPath) shape).curveTo(15.488, 20.469, 15.488, 20.367, 15.387, 20.27);
        ((GeneralPath) shape).closePath();

        g.setPaint(new Color(0x548535));
        g.fill(shape);

        // _0_0_0_262
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(13.402, 20.457);
        ((GeneralPath) shape).curveTo(13.277, 20.379002, 13.1640005, 20.395, 13.066, 20.492);
        ((GeneralPath) shape).curveTo(12.965, 20.641, 12.98, 20.754, 13.102, 20.828001);
        ((GeneralPath) shape).curveTo(13.203, 20.879002, 13.316, 20.867, 13.441, 20.793001);
        ((GeneralPath) shape).curveTo(13.516, 20.668001, 13.504, 20.555, 13.402, 20.457);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        // _0_0_0_263
        shape = new GeneralPath();
        ((GeneralPath) shape).moveTo(7.75, 18.133);
        ((GeneralPath) shape).curveTo(7.676, 18.059, 7.59, 18.07, 7.488, 18.171999);
        ((GeneralPath) shape).curveTo(7.387, 18.272999, 7.402, 18.359, 7.527, 18.433998);
        ((GeneralPath) shape).curveTo(7.625, 18.483997, 7.711, 18.472998, 7.789, 18.397999);
        ((GeneralPath) shape).curveTo(7.84, 18.296999, 7.824, 18.210999, 7.75, 18.133);
        ((GeneralPath) shape).closePath();

        g.fill(shape);

        g.setTransform(transformations.pop()); // _0_0

        g.setTransform(transformations.pop()); // _0

    }
}

