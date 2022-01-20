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

    /**
     * The member shapes and their bounds. These are generally supposed to be
     * immutable once submitted into this map, but we can't enforce that if
     * the user tries to mutate a shape.
     */
    protected Map<Shape, Rectangle2D> shapes = new HashMap<>();

    /**
     * The total bounds of all our member shapes, or null if we have
     * no member shapes. This is meant to constantly mutate, so we need
     * to make sure this object is different than any Rectangle2D we store
     * in the shapes field.
     */
    private Rectangle2D cachedBounds = null;

    /**
     * Our winding rule, which may be WIND_UNKNOWN. As shapes are added this can
     * change (including changing to a WIND_NON_ZERO, WIND_EVEN_ODD, or back to
     * WIND_UNKNOWN).
     */
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
     * <p>
     * If you call any append method that accepts a Shape (such as {@link #append(Shape)} or
     * {@link #appendSafely(Shape)}), it will automatically defer to this method if the shape
     * is an Area.
     * </p>
     */
    public boolean append(Area area) {
        if (area == null || area.isEmpty())
            return false;

        // Areas don't need/use winding rules. You can think of them as ambi-winding-rule.

        return appendCommon(area, area.getBounds2D(), WIND_UNKNOWN);
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
            int incomingWindingRule = s.getWindingRule();

            if (windingRule == WIND_UNKNOWN) {
                windingRule = incomingWindingRule;
            } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
                throw new IncompatibleWindingRuleException();
            }

            for (Map.Entry<Shape, Rectangle2D> incomingShape : s.shapes.entrySet()) {
                if (appendCommon(incomingShape.getKey(), incomingShape.getValue(), incomingWindingRule))
                    returnValue = true;
            }
            return returnValue;
        } else if (shape == null || ShapeUtils.isEmpty(shape)) {
            return false;
        }

        Rectangle2D incomingBounds = ShapeUtils.getBounds2D(shape);
        int incomingWindingRule = shape.getPathIterator(null).getWindingRule();
        return appendNonArea(shape, incomingBounds, incomingWindingRule);
    }

    private boolean appendNonArea(Shape incoming, Rectangle2D incomingBounds, int incomingWindingRule) throws IncompatibleWindingRuleException {
        if (windingRule == WIND_UNKNOWN) {
            windingRule = incomingWindingRule;
        } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
            throw new IncompatibleWindingRuleException();
        }

        return appendCommon(incoming, incomingBounds, incomingWindingRule);
    }

    /**
     * This is shared code that both Areas and non-Areas use to add a new shape. This should be called
     * after evaluating if an IncompatibleWindingRuleException is warranted.
     */
    private boolean appendCommon(Shape incoming, Rectangle2D incomingBounds, int incomingWindingRule) {
        if (!intersects(incomingBounds)) {
            shapes.put(incoming, incomingBounds);
            if (cachedBounds == null) {
                cachedBounds = new Rectangle2D.Double(incomingBounds.getX(), incomingBounds.getY(), incomingBounds.getWidth(), incomingBounds.getHeight());
            } else {
                cachedBounds.add(incomingBounds);
            }
            if (windingRule == WIND_UNKNOWN)
                windingRule = incomingWindingRule;
        } else if (cachedBounds != null && incomingBounds.contains(cachedBounds) && incoming.contains(cachedBounds)) {
            windingRule = incomingWindingRule;
            shapes.clear();
            shapes.put(incoming, incomingBounds);
            cachedBounds = new Rectangle2D.Double(incomingBounds.getX(), incomingBounds.getY(), incomingBounds.getWidth(), incomingBounds.getHeight());
            return true;
        } else if(contains(incomingBounds)) {
            return false;
        } else {
            Area sum;
            if (shapes.size() == 1) {
                // if our only member happens to be an Area then this Area constructor is more efficient:
                sum = new Area(shapes.keySet().iterator().next());
            } else {
                sum = new Area(this);
            }
            sum.add(new Area(incoming));

            shapes.clear();
            cachedBounds.add(incomingBounds);
            shapes.put(sum, new Rectangle2D.Double(cachedBounds.getX(), cachedBounds.getY(), cachedBounds.getWidth(), cachedBounds.getHeight()));
            windingRule = WIND_UNKNOWN;
        }

        return true;
    }

    /**
     * Append a shape to this AppendedShape.
     * <p>
     * If there is a winding rule problem: this method converts the incoming shape to an Area.
     * This may be very expensive, but it is guaranteed to not throw an exception.
     * </p>
     */
    public boolean appendSafely(Shape shape) {
        if (shape == null)
            return false;

        try {
            return append(shape);
        } catch (IncompatibleWindingRuleException e) {
            return append(new Area(shape));
        }
    }

    /**
     * Return the shapes in this AppendedShape.
     */
    public Shape[] getShapes() {
        return shapes.keySet().toArray(new Shape[0]);
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

        for (Map.Entry<Shape, Rectangle2D> entry : shapes.entrySet()) {
            if (entry.getValue().contains(x,y) && entry.getKey().contains(x, y))
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
        return intersects(new Rectangle2D.Double(x,y,w,h));
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        if (cachedBounds == null || !cachedBounds.intersects(r))
            return false;

        for (Map.Entry<Shape, Rectangle2D> entry : shapes.entrySet()) {
            if (ShapeUtils.intersects(entry.getValue(), r) && entry.getKey().intersects(r))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (cachedBounds == null || !cachedBounds.contains(x,y,w,h))
            return false;

        for (Map.Entry<Shape, Rectangle2D> entry : shapes.entrySet()) {
            if (entry.getValue().contains(x, y, w, h) && entry.getKey().contains(x, y, w, h))
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
        return new AppendedShapePathIterator(shapes.keySet().iterator(), at, null, windingRule);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new AppendedShapePathIterator(shapes.keySet().iterator(), at, Double.valueOf(flatness), windingRule);
    }
}