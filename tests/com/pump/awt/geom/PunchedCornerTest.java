package com.pump.awt.geom;

import com.pump.geom.TransformUtils;
import junit.framework.TestCase;
import org.junit.Test;

import java.awt.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;

public class PunchedCornerTest extends TestCase {

    /**
     * This is a real-world problem I observed when designing a board game board.
     */
    @Test
    public void testPunchedCorner() {
        Path2D p = new Path2D.Double();
        p.moveTo(-35.980762113533146, 52.320508075688785);
        p.lineTo(-35.980762113533146, 42.320508075688785);
        p.lineTo(-45.980762113533146, 42.32050807568879);
        p.lineTo(-45.980762113533146, 52.32050807568879);
        p.closePath();

        double r = .65;
        Ellipse2D e = new Ellipse2D.Double(-35.980762113533146 - r, 42.320508075688785 - r, 2 * r, 2 * r);

        Area area = new Area(p);
        area.subtract(new Area(e));

        // this only exists for you to look at in the debugger
        BufferedImage bi = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g = bi.createGraphics();
        Rectangle2D bounds = area.getBounds2D();
        AffineTransform tx = TransformUtils.createAffineTransform(bounds, new Rectangle(10, 10, 980, 980));
        g.setTransform(tx);
        g.setColor(Color.black);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setStroke(new BasicStroke(.01f));
        g.draw(area);
        g.dispose();

        // the top-right corner should be empty, but the Area has the wrong result (see the BufferedImage)
        double k = .1;
        assertFalse(area.intersects( -35.980762113533146 - k, 42.320508075688785 - k, 2 * k, 2 * k));
        assertFalse(new BasicStroke(.1f).createStrokedShape(area).intersects( -35.980762113533146 - k, 42.320508075688785 - k, 2 * k, 2 * k));
    }
}
