package com.pump.awt.geom;

import com.pump.awt.geom.clip.RectangularClipperFactory;
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
 * This object lazily flattens member shapes as needed (using an OutlineEngine) to execute
 * complex operations. But in some cases if shapes do not touch (or if one shape contains another): this
 * object just keeps a running list of member shapes.
 * </p>
 * <p>
 * This object assumes once a Shape object is added that it is not going to change, or that
 * this object is free to change the member Shapes (for ex: by growing an Area
 * or Rectangle2D). If this is not a good assumption then the caller needs to clone the
 * member Shapes before they are passed to this object as operands.
 * </p>
 * <p>
 * This object is not thread-safe.
 */
public class CompoundShape implements Shape, Serializable {

    // TODO: Every operation should take these special cases into account,
    // although the order may vary:
    // 1. Is the operand a Rectangle2D?
    // 2. Is the operand a CompoundShape?
    // 3. Is the operand an Area (so winding rule doesn't matter)?
    // 4. Is the operand empty?
    // 5. Is this object's current shape a rectangle?

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
     *
     * TODO: remove this, use the "addSafely" notion instead. Nobody will want to worry about this
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
        int incomingWindingRule = getWindingRule(shape);

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

        flatten(new OutlineOperation(OutlineOperation.Type.ADD, incoming));

        return true;
    }

    /**
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    public boolean clip(Shape operand) {
        if (isEmpty())
            return false;

        boolean isOperandEmpty = ShapeUtils.isEmpty(operand);

        if (isOperandEmpty) {
            return clear();
        }

        Rectangle2D operandBounds = ShapeUtils.getBounds2D(operand);
        if (!operandBounds.intersects(cachedBounds)) {
            return clear();
        }

        if (operand instanceof Rectangle2D) {
            clipRect( (Rectangle2D) operand);
        }

        Rectangle2D asRect = ShapeUtils.toRectangle2D(operand);
        if (asRect != null) {
            return clipRect(asRect);
        }

        int incomingWindingRule = getWindingRule(operand);

        if (windingRule == WIND_UNKNOWN) {
            windingRule = incomingWindingRule;
        } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
            // convert to an Area so we don't have to worry about winding rules:
            Area newShape = new Area(operand);
            return clip(newShape);
        }

        if (operand instanceof CompoundShape) {
            CompoundShape s = (CompoundShape) operand;
            boolean returnValue = false;

            List<Map.Entry<Shape, Rectangle2D>> relevantOperandMembers = new LinkedList<>();
            for (Map.Entry<Shape, Rectangle2D> operandEntry : s.shapes.entrySet()) {
                if (operandEntry.getValue().intersects(cachedBounds)) {
                    for (Map.Entry<Shape, Rectangle2D> myEntry : shapes.entrySet()) {
                        if (myEntry.getValue().intersects(operandEntry.getValue())) {
                            relevantOperandMembers.add(operandEntry);
                        }
                    }
                }
            }

            if (relevantOperandMembers.size() != s.shapes.size()) {
                CompoundShape newOperand = new CompoundShape();
                for (Map.Entry<Shape, Rectangle2D> relevantOperandMember : relevantOperandMembers) {
                    newOperand.shapes.put(relevantOperandMember.getKey(), relevantOperandMember.getValue());
                    if (newOperand.cachedBounds == null) {
                        newOperand.cachedBounds = new Rectangle2D.Double();
                        newOperand.cachedBounds.setFrame(relevantOperandMember.getValue());
                    } else {
                        newOperand.cachedBounds.add(relevantOperandMember.getValue());
                    }
                }

                if (newOperand.cachedBounds == null) {
                    return clear();
                }

                operand = newOperand;
            }
        }

        Rectangle2D shapeBounds = ShapeUtils.getBounds2D(operand);
        Iterator<Map.Entry<Shape, Rectangle2D>> iter = shapes.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<Shape, Rectangle2D> entry = iter.next();
            if (!entry.getValue().intersects(shapeBounds)) {
                iter.remove();
            }
        }

        if (shapes.size() == 0) {
            cachedBounds = null;
            return true;
        } else if (shapes.size() == 1) {
            asRect = ShapeUtils.toRectangle2D(shapes.keySet().iterator().next());
            if (asRect != null) {
                shapes.clear();
                Shape clippedOperand = RectangularClipperFactory.get().createClipper().clip(operand, null, asRect);
                Rectangle2D clippedOperandBounds = ShapeUtils.getBounds2D(clippedOperand);
                shapes.put(clippedOperand, clippedOperandBounds);
                cachedBounds = new Rectangle2D.Double(clippedOperandBounds.getMinX(),
                        clippedOperandBounds.getMinY(),
                        clippedOperandBounds.getWidth(),
                        clippedOperandBounds.getHeight());
                return true;
            }
        }

        cachedBounds = null;
        flatten(new OutlineOperation(OutlineOperation.Type.INTERSECT, operand));

        return true;
    }

    public boolean subtract(Shape shape) {
        // TODO: implement

        cachedBounds = null;
        flatten(new OutlineOperation(OutlineOperation.Type.SUBTRACT, shape));
        return true;
    }

    public boolean xor(Shape shape) {
        // TODO: implement

        cachedBounds = null;
        flatten(new OutlineOperation(OutlineOperation.Type.XOR, shape));
        return true;
    }

    protected boolean clipRect(Rectangle2D rect) {
        Collection<Shape> clippedShapes = new HashSet<>();
        for(Map.Entry<Shape, Rectangle2D> entry : shapes.entrySet()) {
            Shape clippedShape = RectangularClipperFactory.get().createClipper().clip(entry.getKey(), null, rect);
            clippedShapes.add(clippedShape);
        }
        shapes.clear();
        cachedBounds = null;
        for(Shape clippedShape : clippedShapes) {
            if (!ShapeUtils.isEmpty(clippedShape)) {
                Rectangle2D clippedShapeRect = ShapeUtils.getBounds2D(clippedShape);
                shapes.put(clippedShape, clippedShapeRect);

                if (cachedBounds == null) {
                    cachedBounds = new Rectangle2D.Double(clippedShapeRect.getMinX(), clippedShapeRect.getMinY(), clippedShapeRect.getWidth(), clippedShapeRect.getHeight());
                } else {
                    cachedBounds.add(clippedShapeRect);
                }
            }
        }
        return true;
    }

    /**
     * Collapse the {@link #shapes} map into one element. This one element should be a sum of all previous
     * elements plus the arguments provided here.
     */
    private void flatten(OutlineOperation additionalOp) {
        try {
            // see if we can avoid invoking our engine (which may create expensive Areas):
            if (shapes.size() <= 1 && additionalOp == null) {
                return;
            } else if (additionalOp != null &&
                    additionalOp.type == OutlineOperation.Type.ADD &&
                    isEmpty()) {
                cachedBounds = ShapeUtils.getBounds2D(additionalOp.shape);
                shapes.put(additionalOp.shape, new Rectangle2D.Double(cachedBounds.getX(), cachedBounds.getY(), cachedBounds.getWidth(), cachedBounds.getHeight()));
                windingRule = getWindingRule(additionalOp.shape);
                return;
            }

            List<OutlineOperation> ops = new ArrayList<>(2);
            if (shapes.size() == 1) {
                ops.add(new OutlineOperation(OutlineOperation.Type.ADD, shapes.keySet().iterator().next()));
            } else {
                ops.add(new OutlineOperation(OutlineOperation.Type.ADD, this));
            }
            if (additionalOp != null) {
                ops.add(additionalOp);

                // update cached bounds:
                // leave `cachedBounds` null if we need to recalculate it
                if (cachedBounds != null) {
                    if (additionalOp.type == OutlineOperation.Type.ADD ||
                            additionalOp.type == OutlineOperation.Type.XOR) {
                        cachedBounds.add(ShapeUtils.getBounds2D(additionalOp.shape));
                    } else {
                        cachedBounds = null;
                    }
                }
            }

            Shape newFlattenedShape = engine.calculate(ops);

            shapes.clear();
            if (!ShapeUtils.isEmpty(newFlattenedShape)) {
                shapes.put(newFlattenedShape, ShapeUtils.getBounds2D(newFlattenedShape));
                windingRule = getWindingRule(newFlattenedShape);
            } else {
                cachedBounds = null;
                windingRule = WIND_UNKNOWN;
            }
        } finally {
            if (cachedBounds == null && !isEmpty())
                cachedBounds = ShapeUtils.getBounds2D(getPathIterator(null));
        }
    }

    private int getWindingRule(Shape shape) {
        if (shape instanceof CompoundShape) {
            return ((CompoundShape)shape).getWindingRule();
        } else if (shape instanceof Area ||
                shape instanceof AbstractRectangleMask ||
                shape instanceof Rectangle2D ||
                shape instanceof RoundRectangle2D ||
                shape instanceof Ellipse2D) {
            return WIND_UNKNOWN;
        }
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
     * Return the shapes in this CompoundShape. This object assumes nobody else is going to modify a Shape once
     * it is added. If you modify any of the shapes returned by this method this CompoundShape may act unpredictably.
     * <p>
     * This may not return the same set of shapes that were added to this object. As shapes are added sometimes they
     * are flattened/converted into other member shapes.
     * </p>
     */
    public Shape[] getShapes() {
        return shapes.keySet().toArray(new Shape[0]);
    }

    /**
     * Return the size of array returned by {@link #getShapes()}.
     */
    public int getShapeCount() {
        return shapes.size();
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
    public boolean clear() {
        boolean hadPreviousData = !isEmpty();
        shapes.clear();
        cachedBounds = null;
        windingRule = WIND_UNKNOWN;

        return hadPreviousData;
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