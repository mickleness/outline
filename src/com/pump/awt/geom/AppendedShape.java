package com.pump.awt.geom;

import java.awt.*;
import java.awt.geom.*;
import java.util.*;


/**
 * This shape is composed of several shapes appended consecutively.
 * <p>
 * This object lazily converts constituent shapes into Areas as necessary.
 * You should not alter a constituent shape after adding it to this object; if you
 * plan to mutate a constituent shape then you should add its clone to this object instead.
 * </p>
 * <p>
 * This object automatically inherits the winding rule of its constituent shapes,
 * but it will throw a IncompatibleWindingRuleException if you attempt to combine
 * shapes with different winding rules. When in doubt: remember that an Area class
 * is immune from winding rule constraints, so you can use the {@link #appendSafely(Shape)}.
 * </p>
 */
public class AppendedShape implements Shape {

    /**
     * This is an alternative winding rule indicating that the winding rule isn't
     * WIND_EVEN_ODD or WIND_NON_ZERO yet.
     */
    public static int WIND_UNKNOWN = -1;

    /**
     * This indicates we attempted to append multiple paths with different
     * winding rules. A PathIterator should only have one constant
     * winding rule, so it's impossible to create a unified shape with
     * multiple winding rules.
     */
    public static class IncompatibleWindingRuleException extends Exception {

    }

    // TODO: make serializable

    protected Collection<Shape> shapes = new HashSet<>();

    // this is null when shapes is empty
    private Rectangle2D cachedBounds = null;

    // this is null when it is undefined
    private int windingRule = WIND_UNKNOWN;

    public AppendedShape() {
        // intentionally empty
    }

    public AppendedShape(Shape shape) {
        try {
            append(shape);
        } catch (IncompatibleWindingRuleException e) {
            // this shouldn't happen since our internal windingRule should be WIND_UNKNOWN initially
            throw new IllegalStateException(e);
        }
    }

    /**
     * Create a new AppendedShape that combines the argument shapes.
     * <p>
     * This constructor avoids recursively nested AppendedShapes.
     * </p>
     */
    public AppendedShape(Shape... shapes) throws IncompatibleWindingRuleException {
        for(Shape shape : shapes) {
            append(shape);
        }
    }

    /**
     * Append an Area to this AppendedShape.
     * <p>
     * Area objects are defined in such a way that their winding rules don't
     * matter, so this method won't throw an IncompatibleWindingRuleException.
     * </p>
     */
    public boolean append(Area area) {
        if (area == null || area.isEmpty())
            return false;

        // Areas don't need/use winding rules. You can think of them as ambi-winding-rule.

        Rectangle2D incomingBounds = area.getBounds2D();

        if (cachedBounds != null && incomingBounds.contains(cachedBounds) && area.contains(cachedBounds)) {
            shapes.clear();
            shapes.add(area);
            cachedBounds = incomingBounds;
            return true;
        }

        if (!intersects(incomingBounds)) {
            shapes.add(area);
            if (cachedBounds == null) {
                cachedBounds = incomingBounds;
            } else {
                cachedBounds.add(incomingBounds);
            }
        } else if(contains(incomingBounds)) {
            return false;
        } else {
            Area sum = toArea();
            sum.add(area);

            shapes.clear();
            shapes.add(sum);
            cachedBounds = sum.getBounds2D();
            windingRule = WIND_UNKNOWN;
        }

        return true;
    }

    /**
     * Return the winding rule of this shape, which may be {@link PathIterator#WIND_NON_ZERO},
     * {@link PathIterator#WIND_EVEN_ODD} or {@link #WIND_UNKNOWN}.
     */
    public int getWindingRule() {
        return windingRule;
    }

    /**
     * Append a shape to this AppendedShape.
     *
     * @throws IncompatibleWindingRuleException if this AppendedShape already has identified
     * a winding rule and the incoming shape is a different winding rule.
     */
    public boolean append(Shape shape) throws IncompatibleWindingRuleException {
        if (shape instanceof Area) {
            return append((Area) shape);
        } else if (shape instanceof AppendedShape) {
            AppendedShape s = (AppendedShape) shape;
            boolean returnValue = false;
            for(Shape incomingShape : s.shapes) {
                if (append(incomingShape))
                    returnValue = true;
            }
            return returnValue;
        } else if (shape == null || ShapeUtils.isEmpty(shape)) {
            return false;
        }

        Rectangle2D incomingBounds = ShapeUtils.getBounds2D(shape);
        int incomingWindingRule = shape.getPathIterator(null).getWindingRule();

        if (cachedBounds != null && incomingBounds.contains(cachedBounds) && shape.contains(cachedBounds)) {
            windingRule = incomingWindingRule;
            shapes.clear();
            shapes.add(shape);
            cachedBounds = incomingBounds;
            return true;
        }

        if (windingRule == WIND_UNKNOWN) {
            windingRule = incomingWindingRule;
        } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
            throw new IncompatibleWindingRuleException();
        }

        if (!intersects(incomingBounds)) {
            shapes.add(shape);
            if (cachedBounds == null) {
                cachedBounds = incomingBounds;
            } else {
                cachedBounds.add(incomingBounds);
            }
            windingRule = incomingWindingRule;
        } else if(contains(incomingBounds)) {
            return false;
        } else {
            Area sum = toArea();
            sum.add(new Area(shape));

            shapes.clear();
            shapes.add(sum);
            cachedBounds = sum.getBounds2D();
            windingRule = WIND_UNKNOWN;
        }

        return true;
    }

    private Area toArea() {
        if (shapes.size() == 0)
            return new Area();
        if (shapes.size() == 1) {
            Shape element = shapes.iterator().next();
            if (element instanceof Area)
                return (Area) element;
        }

        return new Area(this);
    }

    /**
     * Append a shape to this AppendedShape.
     * <p>
     * If there is a winding rule problem: this method converts the incoming shape to an Area.
     * This may be very expensive, but it is guaranteed to not throw an exception.
     * </p>
     */
    public void appendSafely(Shape shape) {
        if (shape == null)
            return;

        try {
            append(shape);
        } catch (IncompatibleWindingRuleException e) {
            append(new Area(shape));
        }
    }

    /**
     * Return the shapes in this AppendedShape.
     */
    public Shape[] getShapes() {
        return shapes.toArray(new Shape[0]);
    }

    /**
     * Return true if this AppendedShape is empty.
     */
    public boolean isEmpty() {
        return shapes.isEmpty();
    }

    /**
     * Remove all shapes from this AppendedShape.
     */
    public void clear() {
        shapes.clear();
        cachedBounds = null;
        windingRule = WIND_UNKNOWN;
    }

    @Override
    public Rectangle getBounds() {
        if (cachedBounds == null)
            return new Rectangle(0,0,0,0);

        return cachedBounds.getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        if (cachedBounds == null)
            return new Rectangle2D.Double();

        return new Rectangle2D.Double(cachedBounds.getX(), cachedBounds.getY(), cachedBounds.getWidth(), cachedBounds.getHeight());
    }

    @Override
    public boolean contains(double x, double y) {
        if (cachedBounds == null || !cachedBounds.contains(x,y))
            return false;

        for (Shape shape : shapes) {
            if (shape.contains(x, y))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        if (cachedBounds == null || !cachedBounds.intersects(x,y,w,h))
            return false;

        for (Shape shape : shapes) {
            if (shape.intersects(x, y, w, h))
                return true;
        }
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (cachedBounds == null || !cachedBounds.contains(x,y,w,h))
            return false;

        for (Shape shape : shapes) {
            if (shape.contains(x, y, w, h))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return new AppendedShapePathIterator(shapes.iterator(), at, null, windingRule);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new AppendedShapePathIterator(shapes.iterator(), at, Double.valueOf(flatness), windingRule);
    }
}