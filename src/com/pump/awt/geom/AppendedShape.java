package com.pump.awt.geom;

import java.awt.*;
import java.awt.geom.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;


/**
 * This shape is composed of several shapes appended consecutively.
 * <p>
 * For example: if you know the bounds of two Area objects don't intersect,
 * then you can create one AppendedShape that includes both of them. This will
 * be faster than calling {@link java.awt.geom.Area#add(Area)} and officially
 * merging them. It is the callers responsibility to make sure the appended
 * shapes do not intersect, though.
 * </p>
 * <p>
 * This object automatically inherits the winding rule of its constituent shapes,
 * but it will throw a IncompatibleWindingRuleException if you attempt to combine
 * shapes with different winding rules. When in doubt: remember that an Area class
 * is immune from winding rule constraints.
 * </p>
 */
public class AppendedShape implements Shape {

    /**
     * This indicates we attempted to append multiple paths with different
     * winding rules. A PathIterator should only have one constant
     * winding rule, so it's impossible to create a unified shape with
     * multiple winding rules.
     */
    public static class IncompatibleWindingRuleException extends Exception {

    }

    // TODO: make serializable

    protected List<Shape> shapes = new ArrayList<>();

    // this is null when shapes is empty
    private Rectangle2D cachedBounds = null;

    // this is null when it is undefined
    private Integer windingRule;

    public AppendedShape() {
        // intentionally empty
    }

    public AppendedShape(Shape shape) {
        try {
            append(shape);
        } catch (IncompatibleWindingRuleException e) {
            // this shouldn't happen since our internal windingRule should be null initially
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
    public void append(Area area) {
        Objects.requireNonNull(area);

        // Areas don't need/use winding rules. You can think of them as ambi-winding-rule.
        shapes.add(area);

        if (cachedBounds == null) {
            cachedBounds = area.getBounds2D();
        } else {
            cachedBounds.add(area.getBounds2D());
        }
    }

    /**
     * Append a shape to this AppendedShape.
     *
     * @throws IncompatibleWindingRuleException if this AppendedShape already has identified
     * a winding rule and the incoming shape is a different winding rule.
     */
    public void append(Shape shape) throws IncompatibleWindingRuleException {
        if (shape instanceof Area) {
            append( (Area) shape);
            return;
        }

        Objects.requireNonNull(shape);
        if (shape instanceof AppendedShape) {
            AppendedShape as = (AppendedShape) shape;
            if (windingRule == null) {
                windingRule = as.windingRule;
            } else if (as.windingRule != null && windingRule.intValue() != as.windingRule.intValue()) {
                throw new IncompatibleWindingRuleException();
            }

            shapes.addAll( as.shapes );
        } else {
            int incomingWindingRule = shape.getPathIterator(null).getWindingRule();
            if (windingRule == null) {
                windingRule = incomingWindingRule;
            } else if (windingRule.intValue() != incomingWindingRule) {
                throw new IncompatibleWindingRuleException();
            }
            shapes.add(shape);
        }

        if (cachedBounds == null) {
            cachedBounds = ShapeUtils.getBounds2D(shape);
        } else {
            cachedBounds.add(ShapeUtils.getBounds2D(shape));
        }
    }

    /**
     * Append a shape to this AppendedShape.
     * <p>
     * If there is a winding rule problem: this method converts the incoming shape to an Area.
     * This may be very expensive, but it is guaranteed to not throw an exception.
     * </p>
     */
    public void appendSafely(Shape shape) {
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
        windingRule = null;
    }

    @Override
    public Rectangle getBounds() {
        return getBounds2D().getBounds();
    }

    @Override
    public Rectangle2D getBounds2D() {
        if (cachedBounds == null)
            return new Rectangle2D.Double();

        Rectangle2D returnValue = new Rectangle2D.Double();
        returnValue.setFrame(cachedBounds);
        return returnValue;
    }

    @Override
    public boolean contains(double x, double y) {
        for (Shape shape : shapes) {
            if (shape.contains(x, y))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        for (Shape shape : shapes) {
            if (shape.contains(p))
                return true;
        }
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        for (Shape shape : shapes) {
            if (shape.intersects(x, y, w, h))
                return true;
        }
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        for (Shape shape : shapes) {
            if (shape.intersects(r))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        for (Shape shape : shapes) {
            if (shape.contains(x, y, w, h))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        for (Shape shape : shapes) {
            if (shape.contains(r))
                return true;
        }
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        // if the windingRule is undefined we could be either: we use NON_ZERO by default

        int activeWindingRule = windingRule == null ? PathIterator.WIND_NON_ZERO : windingRule.intValue();
        return new AppendedShapePathIterator(new LinkedList<>(shapes), at, null, activeWindingRule);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        // if the windingRule is undefined we could be either: we use NON_ZERO by default

        int activeWindingRule = windingRule == null ? PathIterator.WIND_NON_ZERO : windingRule.intValue();
        return new AppendedShapePathIterator(new LinkedList<>(shapes), at, Double.valueOf(flatness), activeWindingRule);
    }
}