package com.pump.awt.geom;

import com.pump.awt.geom.mask.AbstractRectangleMask;
import com.pump.awt.geom.outline.OutlineEngine;
import com.pump.awt.geom.outline.OutlineOperation;
import com.pump.awt.geom.outline.PlainAreaEngine;

import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;
import java.util.List;


/**
 * This shape is composed of several member shapes.
 * <p>
 * This object lazily converts member shapes into Areas as needed to execute
 * additions. But in many cases if shapes do not touch (or if one shape contains another): this
 * object just keeps a running list of member shapes.
 * </p>
 * <p>
 * This object assumes once a Shape object is added that it is not going to change. If this is
 * not a good assumption then the caller needs to clone the Shapes before they are added.
 * </p>
 * <p>
 * This object is not thread-safe.
 */
public class CompoundShape implements Shape, Serializable {

    /**
     * This is an alternative winding rule indicating that the winding rule isn't
     * WIND_EVEN_ODD or WIND_NON_ZERO yet. CompoundShapes stay in this undefined
     * shape as long as possible. (If an CompoundShape uses this winding rule then
     * its PathIterator picks a default rule.)
     */
    public static int WIND_UNKNOWN = -1;

    /**
     * This indicates we attempted to add multiple paths with different
     * winding rules. A PathIterator can only have one constant
     * winding rule, so it's impossible to create a unified shape with
     * multiple winding rules.
     */
    public static class IncompatibleWindingRuleException extends Exception {
        // We could be more clever in assessing when these are necessary.
        // For example: if we identify a shape is convex, or a quadrilateral/triangle/line:
        // we could treat it like it's a WIND_UNKNOWN. For now that idea seems like overkill,
        // but over time if this becomes a problem we might want to evaluate ways to reduce this
        // risk.
    }

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

    private OutlineEngine engine = new PlainAreaEngine();

    public CompoundShape() {
        this( (OutlineEngine) null);
    }

    /**
     * @param engine the optional engine to use when this shape needs to perform a complex operation.
     */
    public CompoundShape(OutlineEngine engine) {
        if (engine != null)
            this.engine = engine;
    }

    public CompoundShape(Shape shape) {
        this(null, shape);
    }

    /**
     * @param engine the optional engine to use when this shape needs to perform a complex operation.
     */
    public CompoundShape(OutlineEngine engine, Shape shape) {
        if (engine != null)
            this.engine = engine;

        try {
            add(shape);
        } catch (IncompatibleWindingRuleException e) {
            // this shouldn't happen since our initial winding rule is UNKNOWN and we only added one shape:
            throw new IllegalStateException(e);
        }
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     */
    public CompoundShape(Shape... shapes) throws IncompatibleWindingRuleException {
        this(null, shapes);
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     *
     * @param engine the optional engine to use when this shape needs to perform a complex operation.
     */
    public CompoundShape(OutlineEngine engine, Shape... shapes) throws IncompatibleWindingRuleException {
        if (engine != null)
            this.engine = engine;

        for(Shape shape : shapes) {
            add(shape);
        }
    }

    /**
     * Add an Area to this CompoundShape.
     * <p>
     * Area objects are defined so that their winding rules don't
     * matter, so this method won't throw an IncompatibleWindingRuleException.
     * </p>
     * <p>
     * If you call any add method that accepts a Shape (such as {@link #add(Shape)} or
     * {@link #addSafely(Shape)}), it will automatically defer to this method if the Shape
     * is an Area.
     * </p>
     *
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    public boolean add(Area area) {
        if (area == null || area.isEmpty())
            return false;

        // Areas don't need/use winding rules. You can think of them as ambi-winding-rule.

        return addCommon(area, area.getBounds2D(), WIND_UNKNOWN);
    }

    /**
     * Return the winding rule of this shape, which may be {@link PathIterator#WIND_NON_ZERO},
     * {@link PathIterator#WIND_EVEN_ODD} or {@link #WIND_UNKNOWN}.
     */
    public int getWindingRule() {
        return windingRule;
    }

    /**
     * Add a shape to this CompoundShape.
     *
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     *
     * @throws IncompatibleWindingRuleException if this CompoundShape already has identified
     * a winding rule and the incoming shape is a different winding rule.
     */
    public boolean add(Shape shape) throws IncompatibleWindingRuleException {
        if (shape instanceof Area) {
            return add((Area) shape);
        } else if (shape instanceof CompoundShape) {
            CompoundShape s = (CompoundShape) shape;
            boolean returnValue = false;
            int incomingWindingRule = s.getWindingRule();

            if (windingRule == WIND_UNKNOWN) {
                windingRule = incomingWindingRule;
            } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
                throw new IncompatibleWindingRuleException();
            }

            for (Map.Entry<Shape, Rectangle2D> incomingShape : s.shapes.entrySet()) {
                if (addCommon(incomingShape.getKey(), incomingShape.getValue(), incomingWindingRule))
                    returnValue = true;
            }
            return returnValue;
        } else if (shape == null || ShapeUtils.isEmpty(shape)) {
            return false;
        }

        Rectangle2D incomingBounds = ShapeUtils.getBounds2D(shape);
        int incomingWindingRule = shape.getPathIterator(null).getWindingRule();

        if (windingRule == WIND_UNKNOWN) {
            windingRule = incomingWindingRule;
        } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
            throw new IncompatibleWindingRuleException();
        }

        return addCommon(shape, incomingBounds, incomingWindingRule);
    }

    /**
     * This is shared code that both Areas and non-Areas use to add a new shape. This should be called
     * after evaluating if an IncompatibleWindingRuleException is warranted.
     *
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    private boolean addCommon(Shape incoming, Rectangle2D incomingBounds, int incomingWindingRule) {
        if (!intersects(incomingBounds)) {
            shapes.put(incoming, incomingBounds);
            if (cachedBounds == null) {
                cachedBounds = new Rectangle2D.Double(incomingBounds.getX(), incomingBounds.getY(), incomingBounds.getWidth(), incomingBounds.getHeight());
            } else {
                cachedBounds.add(incomingBounds);
            }
            if (windingRule == WIND_UNKNOWN)
                windingRule = incomingWindingRule;
            return true;
        }

        if (cachedBounds != null && incomingBounds.contains(cachedBounds) && incoming.contains(cachedBounds)) {
            windingRule = incomingWindingRule;
            shapes.clear();
            shapes.put(incoming, incomingBounds);
            cachedBounds = new Rectangle2D.Double(incomingBounds.getX(), incomingBounds.getY(), incomingBounds.getWidth(), incomingBounds.getHeight());
            return true;
        }

        if(contains(incomingBounds)) {
            return false;
        }

        flatten(incoming);

        return true;
    }

    /**
     * Collapse the {@link #shapes} map into one element. This one element should be a sum of all previous
     * elements plus the arguments provided here.
     */
    private void flatten(Shape... additionalShapes) {
        // see if we can avoid invoking our engine (which may create expensive Areas):
        if(shapes.size() <= 1 && additionalShapes.length == 0) {
            return;
        } else if (additionalShapes.length == 1 && isEmpty()) {
            cachedBounds = ShapeUtils.getBounds2D(additionalShapes[0]);
            shapes.put(additionalShapes[0], new Rectangle2D.Double(cachedBounds.getX(), cachedBounds.getY(), cachedBounds.getWidth(), cachedBounds.getHeight()));
            windingRule = getWindingRule(additionalShapes[0]);
            return;
        }

        List<OutlineOperation> ops = new ArrayList<>(shapes.size() + additionalShapes.length);
        for (Shape shape : shapes.keySet()) {
            ops.add(new OutlineOperation(OutlineOperation.Type.ADD, shape));
        }
        for (Shape additionalShape : additionalShapes) {
            cachedBounds.add(ShapeUtils.getBounds2D(additionalShape));
            ops.add(new OutlineOperation(OutlineOperation.Type.ADD, additionalShape));
        }
        Shape newFlattenedShape = engine.calculate(ops);

        shapes.clear();
        shapes.put(newFlattenedShape, new Rectangle2D.Double(cachedBounds.getX(), cachedBounds.getY(), cachedBounds.getWidth(), cachedBounds.getHeight()));
        windingRule = getWindingRule(newFlattenedShape);
    }

    private int getWindingRule(Shape shape) {
        if (shape instanceof CompoundShape) {
            for(Shape s : ((CompoundShape)shape).shapes.keySet() ) {
                if (s instanceof Area ||
                        s instanceof AbstractRectangleMask ||
                        s instanceof Rectangle2D ||
                        s instanceof RoundRectangle2D ||
                        s instanceof Ellipse2D)
                    continue;
                return s.getPathIterator(null).getWindingRule();
            }
            return WIND_UNKNOWN;
        }
        if (shape instanceof Area ||
                shape instanceof AbstractRectangleMask ||
                shape instanceof Rectangle2D ||
                shape instanceof RoundRectangle2D ||
                shape instanceof Ellipse2D)
            return WIND_UNKNOWN;
        return shape.getPathIterator(null).getWindingRule();
    }

    /**
     * Add a shape to this CompoundShape.
     * <p>
     * If there is a winding rule problem: this method converts the incoming shape to an Area.
     * This may be very expensive, but it is guaranteed to not throw an exception.
     * </p>
     *
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    public boolean addSafely(Shape shape) {
        if (shape == null)
            return false;

        try {
            return add(shape);
        } catch (IncompatibleWindingRuleException e) {
            return add(new Area(shape));
        }
    }

    /**
     * Return the shapes in this CompoundShape.
     * <p>
     * This may not return the same set of shapes that were added to this object. As shapes are added sometimes they
     * are flattened/converted into other member shapes.
     * </p>
     */
    public Shape[] getShapes() {
        return shapes.keySet().toArray(new Shape[0]);
    }

    /**
     * Return true if this CompoundShape is empty.
     */
    public boolean isEmpty() {
        return shapes.isEmpty();
    }

    /**
     * Remove all shapes from this CompoundShape.
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
        return new CompoundShapePathIterator(shapes.keySet().iterator(), at, null, windingRule);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new CompoundShapePathIterator(shapes.keySet().iterator(), at, Double.valueOf(flatness), windingRule);
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeInt(0);
        out.writeObject(shapes);
        out.writeObject(cachedBounds);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            shapes = (Map<Shape, Rectangle2D>) in.readObject();
            cachedBounds = (Rectangle2D) in.readObject();
        } else {
            throw new IOException("unsupported internal version: " + internalVersion);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");

        Iterator<Shape> shapeIter = shapes.keySet().iterator();
        int ctr = 0;
        while (shapeIter.hasNext()) {
            Shape shape = shapeIter.next();
            ctr++;
            sb.append(shape.toString());
            if (shapeIter.hasNext()) {
                sb.append(", ");
                if (sb.length() > 200) {
                    sb.append("... (and " + (shapes.size() - ctr)+" more shapes)");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}