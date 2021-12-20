package com.pump.awt.geom;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.PathIterator;
import java.awt.geom.QuadCurve2D;

/**
 * This represents a path segment used by a PathIterator.
 */
class PathSegment {
    int type;
    double[] coords;

    public PathSegment(int type, double[] coords) {
        this.type = type;
        this.coords = coords;
    }

    public PathSegment(QuadCurve2D.Double quad) {
        type = PathIterator.SEG_QUADTO;
        coords = new double[] {quad.ctrlx, quad.ctrly, quad.x2, quad.y2};
    }

    public PathSegment(CubicCurve2D.Double cubic) {
        type = PathIterator.SEG_CUBICTO;
        coords = new double[] {cubic.ctrlx1, cubic.ctrly1, cubic.ctrlx2, cubic.ctrly2, cubic.x2, cubic.y2};
    }

    public int currentSegment(double[] c) {
        System.arraycopy(coords, 0, c, 0, coords.length);
        return type;
    }
}