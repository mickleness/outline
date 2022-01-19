package com.pump.awt.geom.outline;

import junit.framework.TestCase;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Path2D;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class OutlineTests extends TestCase {

    public Writer createLog(String name) throws FileNotFoundException {if (name.contains("/") || name.contains("\\"))
        throw new IllegalArgumentException("illegal name = "+name);
        File file = new File(name+" Output.log");
        FileOutputStream fileOut = new FileOutputStream(file);
        OutputStreamWriter writer = new OutputStreamWriter(fileOut) {
            @Override
            public void write(String str) throws IOException {
                super.write(str);
                System.out.print(str);
            }
        };

        return writer;
    }

    public OutlineEngine[] getEngines() {
        List<OutlineEngine> engines = new ArrayList<>();
        engines.add(new PlainAreaEngine());
        engines.add(new TubmanEngine());
        engines.add(new OptimizedAreaEngine(1));
        engines.add(new MaskedOutlineEngine(1.0 / 64.0));
        engines.add(new MaskedOutlineEngine(Double.MAX_VALUE));
        engines.add(new MaskedOutlineEngine2());
        return engines.toArray(new OutlineEngine[0]);
    }

    /**
     * Create a shape whose top-left is at (x,y) and who is .9 x .9 px in size.
     * This contains random cubic data to make it challenging enough for performance gains
     * to become apparent.
     */
    protected Path2D createSquiggle(long randomSeed, double x, double y) {
        Random random = new Random(randomSeed);
        Path2D p = new Path2D.Double();
        p.moveTo(x + .9f * random.nextFloat(), y + .9f * random.nextFloat());
        for (int a = 0; a<10; a++) {
            p.curveTo(x + .9f * random.nextFloat(), y + .9f * random.nextFloat(),
                    x + .9f * random.nextFloat(), y + .9f * random.nextFloat(),
                    x + .9f * random.nextFloat(), y + .9f * random.nextFloat());
        }
        p.closePath();
        return p;
    }

    // this completely envelopes all the other shapes
    protected Rectangle2D createSquare(double x, double y, double w, double h) {
        return new Rectangle2D.Double(x - .01, y - .01, w + .02, h + .02);
    }

    protected Ellipse2D createEllipse(double x, double y, double w, double h) {
        return new Ellipse2D.Double(x, y, w, h);
    }

    protected Path2D createPlus(double x, double y, double w, double h) {
        double k = Math.min(w, h) / .9;
        Path2D p = new Path2D.Double();
        p.moveTo(x + w/2 - k, y);
        p.lineTo(x + w/2 + k, y);
        p.lineTo(x + w/2 + k, y + h/2 - k);
        p.lineTo(x + w, y + h/2 - k);
        p.lineTo(x + w, y + h/2 + k);
        p.lineTo(x + w/2 + k, y + h/2 + k);
        p.lineTo(x + w/2 + k, y + h);
        p.lineTo(x + w/2 - k, y + h);
        p.lineTo(x + w/2 - k, y + h/2 + k);
        p.lineTo(x, y + h/2 + k);
        p.lineTo(x, y + h/2 - k);
        p.lineTo(x + w/2 - k, y + h/2 - k);
        p.closePath();
        return p;
    }

    protected Path2D createTriangle(double x, double y, double w, double h) {
        Path2D p = new Path2D.Double();
        p.moveTo(x + w/2, y);
        p.lineTo(x + w, y + h);
        p.lineTo(x , y + h);
        p.closePath();
        return p;
    }
}
