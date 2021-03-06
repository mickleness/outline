package com.pump.awt.geom;

import com.pump.awt.geom.clip.RectangularClipperFactory;
import com.pump.awt.geom.mask.AbstractRectangleMask;
import com.pump.awt.geom.outline.OutlineEngine;
import com.pump.awt.geom.outline.OutlineOperation;
import com.pump.awt.geom.outline.AreaOutlineEngine;

import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.io.Serial;
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

    /**
     * This is an alternative winding rule indicating that the winding rule isn't
     * WIND_EVEN_ODD or WIND_NON_ZERO yet. CompoundShapes stay in this undefined
     * state as long as possible. (If a CompoundShape uses this winding rule then
     * its PathIterator picks a default rule.)
     */
    public static int WIND_UNKNOWN = -1;

    /**
     * The member shapes and their bounds. (These are generally supposed to be
     * immutable once submitted into this map, but we can't enforce that if
     * the user tries to mutate a shape.)
     */
    protected Map<Shape, Rectangle2D> shapes = new HashMap<>();

    /**
     * The total bounds of all our member shapes, or null if we have
     * no member shapes. This is meant to constantly mutate.
     */
    private Rectangle2D cachedBounds = null;

    /**
     * Our winding rule, which may be WIND_UNKNOWN. As shapes are added this can
     * change (including changing to a WIND_NON_ZERO, WIND_EVEN_ODD, or back to
     * WIND_UNKNOWN as this object is flattened).
     */
    private int windingRule = WIND_UNKNOWN;

    private OutlineEngine engine = new AreaOutlineEngine();

    public CompoundShape() {
        this( (OutlineEngine) null);
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     */
    public CompoundShape(Shape... shapes) {
        this(null, shapes);
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     *
     * @param engine the optional engine to use when this shape needs to perform a complex operation.
     */
    public CompoundShape(OutlineEngine engine, Shape... shapes)  {
        if (engine != null)
            this.engine = engine;

        for(Shape shape : shapes) {
            add(shape);
        }
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
     */
    public boolean add(Shape operand) {
        if (operand == null || ShapeUtils.isEmpty(operand)) {
            return false;

        } else if (isEmpty()) {
            if (operand instanceof CompoundShape) {
                CompoundShape s = (CompoundShape) operand;
                shapes.putAll(s.shapes);
                cachedBounds = new Rectangle2D.Double(s.cachedBounds.getX(), s.cachedBounds.getY(), s.cachedBounds.getWidth(), s.cachedBounds.getHeight());
                windingRule = s.getWindingRule();
            } else {
                Rectangle2D operandBounds = ShapeUtils.getBounds2D(operand);
                shapes.put(operand, operandBounds);
                cachedBounds = new Rectangle2D.Double(operandBounds.getX(), operandBounds.getY(), operandBounds.getWidth(), operandBounds.getHeight());
                windingRule = getWindingRule(operand);
            }
            return true;
        }

        // This method is messier than the other operations because this is the only method that can
        // add key/value pairs to the shapes map. This requires safety-checking the winding rules of
        // the existing and incoming shapes.

        Integer requiredWindingRule = windingRule == WIND_UNKNOWN ? null : Integer.valueOf(windingRule);
        if (operand instanceof CompoundShape) {
            CompoundShape s = (CompoundShape) operand;

            boolean returnValue = false;
            List<OutlineOperation> remainingAdds = new LinkedList<>();
            for (Map.Entry<Shape, Rectangle2D> operandMemberEntry : s.shapes.entrySet()) {
                Rectangle2D operandMemberBounds = operandMemberEntry.getValue();
                if (contains(operandMemberBounds))
                    continue;

                returnValue = true;
                if (intersects(operandMemberBounds)) {
                    // we'll invoke flatten() to make sure we get the merge correct
                    remainingAdds.add(new OutlineOperation(OutlineOperation.Type.ADD, operandMemberEntry.getKey()));
                } else if (requiredWindingRule == null) {
                    shapes.put(operandMemberEntry.getKey(), operandMemberEntry.getValue());
                    cachedBounds.add(operandMemberEntry.getValue());
                } else {
                    int operandMemberWindingRule = getWindingRule(operandMemberEntry.getKey());
                    if (operandMemberWindingRule == WIND_UNKNOWN || operandMemberWindingRule == requiredWindingRule.intValue()) {
                        shapes.put(operandMemberEntry.getKey(), operandMemberEntry.getValue());
                        cachedBounds.add(operandMemberEntry.getValue());
                    } else {
                        // conflicting winding rules require passing this to an OutlineEngine to resolve:
                        remainingAdds.add(new OutlineOperation(OutlineOperation.Type.ADD, operandMemberEntry.getKey()));
                    }
                }
            }

            if (!remainingAdds.isEmpty()) {
                flatten(remainingAdds);
            }

            return returnValue;
        }

        int operandWindingRule = getWindingRule(operand);
        Rectangle2D operandBounds = ShapeUtils.getBounds2D(operand);

        if (operandBounds.contains(cachedBounds) && operand.contains(cachedBounds)) {
            // the operand completely envelopes this object, so we can gut this object and just use the operand:
            windingRule = operandWindingRule;
            shapes.clear();
            shapes.put(operand, operandBounds);
            cachedBounds = new Rectangle2D.Double(operandBounds.getX(), operandBounds.getY(), operandBounds.getWidth(), operandBounds.getHeight());
            return true;
        } else if (contains(operandBounds)) {
            return false;
        }

        boolean isOperandWindingRuleCompatible = requiredWindingRule == null || operandWindingRule == WIND_UNKNOWN ||
                requiredWindingRule.intValue() == operandWindingRule;

        if (isOperandWindingRuleCompatible && !intersects(operandBounds)) {
            shapes.put(operand, operandBounds);
            cachedBounds.add(operandBounds);
            return true;
        }

        flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.ADD, operand)));

        return true;
    }

    /**
     * Return a Rectangle2D if this object can be expressed as a rectangle. If this object
     * cannot be expressed as a rectangle this returns null.
     */
    private Rectangle2D toRectangle2D() {
        if (shapes.size() == 1) {
            Shape shape = shapes.keySet().iterator().next();
            if (shape instanceof Rectangle2D) {
                return (Rectangle2D) shape;
            }
            return ShapeUtils.toRectangle2D(shape);
        }
        return null;
    }

    /**
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    public boolean clip(Shape operand) {
        if (isEmpty())
            return false;

        if (isNotIntersecting(operand))
            return clear();

        if (operand instanceof CompoundShape) {
            CompoundShape s = (CompoundShape) operand;

            // identify which parts of the operand are relevant, and ignore other parts
            List<Map.Entry<Shape, Rectangle2D>> relevantOperandMembers = new LinkedList<>();
            for (Map.Entry<Shape, Rectangle2D> operandEntry : s.shapes.entrySet()) {
                if (isNotIntersecting(operandEntry.getValue())) {
                    // ignore this operand entry
                } else {
                    relevantOperandMembers.add(operandEntry);
                }
            }

            if (relevantOperandMembers.isEmpty()) {
                return clear();
            } else if (relevantOperandMembers.size() != s.shapes.size()) {
                // create a new simpler operand with just the parts we're interested in:
                CompoundShape newOperand = new CompoundShape();
                newOperand.windingRule = s.getWindingRule();
                for (Map.Entry<Shape, Rectangle2D> relevantOperandMember : relevantOperandMembers) {
                    newOperand.shapes.put(relevantOperandMember.getKey(), relevantOperandMember.getValue());

                    if (newOperand.cachedBounds == null) {
                        newOperand.cachedBounds = new Rectangle2D.Double();
                        newOperand.cachedBounds.setFrame(relevantOperandMember.getValue());
                    } else {
                        newOperand.cachedBounds.add(relevantOperandMember.getValue());
                    }
                }

                operand = newOperand;
            }
        }

        boolean returnValue = false;
        Rectangle2D operandBounds = ShapeUtils.getBounds2D(operand);
        Iterator<Map.Entry<Shape, Rectangle2D>> myIter = shapes.entrySet().iterator();
        while (myIter.hasNext()) {
            Map.Entry<Shape, Rectangle2D> entry = myIter.next();
            if (!entry.getValue().intersects(operandBounds)) {
                myIter.remove();
                returnValue = true;
            }
        }

        // here we optimize for clipping to a rectangle:

        Rectangle2D operandAsRect = null;
        if (operand instanceof Rectangle2D) {
            operandAsRect = (Rectangle2D) operand;
        } else {
            operandAsRect = ShapeUtils.toRectangle2D(operand);
        }

        if (operandAsRect != null) {
            return clipRect(operandAsRect) || returnValue;
        }

        Rectangle2D meAsRect = toRectangle2D();
        if (meAsRect != null) {
            shapes.clear();

            Shape clippedShape = RectangularClipperFactory.get().createClipper().clip(operand, null, meAsRect);
            if (ShapeUtils.isEmpty(clippedShape)) {
                cachedBounds = null;
                windingRule = WIND_UNKNOWN;
            } else {
                Rectangle2D clippedShapeBounds = ShapeUtils.getBounds2D(clippedShape);
                shapes.put(clippedShape, clippedShapeBounds);
                cachedBounds = new Rectangle2D.Double(clippedShapeBounds.getX(), clippedShapeBounds.getY(),
                        clippedShapeBounds.getWidth(), clippedShapeBounds.getHeight());
                windingRule = getWindingRule(clippedShape);
            }

            return true;
        }

        //// end of special rect clipping

        if (shapes.size() == 0) {
            cachedBounds = null;
            windingRule = WIND_UNKNOWN;
            return true;
        }

        flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.CLIP, operand)));

        return true;
    }

    /**
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    public boolean subtract(Shape operand) {
        if (isNotIntersecting(operand)) {
            return false;
        }

        flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.SUBTRACT, operand)));
        return true;
    }

    /**
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    public boolean xor(Shape operand) {
        if (isNotIntersecting(operand)) {
            return add(operand);
        }

        flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.EXCLUSIVE_OR, operand)));
        return true;
    }

    /**
     * Return true if this object definitely does not intersect the argument. This return false if the two
     * shapes *may* intersect.
     */
    private boolean isNotIntersecting(Shape shape) {
        if (isEmpty() || ShapeUtils.isEmpty(shape))
            return true;

        Rectangle2D shapeBounds = ShapeUtils.getBounds2D(shape);
        if(!shapeBounds.intersects(cachedBounds)) {
            return true;
        }

        if (shape instanceof CompoundShape) {
            CompoundShape otherShape = (CompoundShape) shape;
            for (Map.Entry<Shape, Rectangle2D> entry1 : shapes.entrySet()) {
                for (Map.Entry<Shape, Rectangle2D> entry2 : otherShape.shapes.entrySet()) {
                    if (entry1.getValue().intersects(entry2.getValue())) {
                        return false;
                    }
                }
            }
        } else {
            for (Map.Entry<Shape, Rectangle2D> entry : shapes.entrySet()) {
                if (entry.getValue().intersects(shapeBounds)) {
                    return false;
                }
            }
        }

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
     * Collapse the {@link #shapes} map into one element and apply the argument ops. This also updates
     * the cachedBounds and windingRule fields.
     */
    private void flatten(List<OutlineOperation> additionalOps) {
        List<OutlineOperation> opsToProcess = new ArrayList<>(1 + additionalOps.size());
        if (shapes.isEmpty()) {
            // this shouldn't happen... but if somehow it does this case is harmless
        } else if (shapes.size() == 1) {
            // use the raw shape if possible. This may offer a performance boost if that shape
            // is an Area, because other code may perform an instanceof check against it later
            opsToProcess.add(new OutlineOperation(OutlineOperation.Type.ADD, shapes.keySet().iterator().next()));
        } else {
            opsToProcess.add(new OutlineOperation(OutlineOperation.Type.ADD, this));
        }

        opsToProcess.addAll(additionalOps);

        Shape newFlattenedShape = engine.calculate(opsToProcess);

        windingRule = getWindingRule(newFlattenedShape);
        shapes.clear();
        if (!ShapeUtils.isEmpty(newFlattenedShape)) {
            shapes.put(newFlattenedShape, ShapeUtils.getBounds2D(newFlattenedShape));
            cachedBounds = ShapeUtils.getBounds2D(getPathIterator(null));
        } else {
            cachedBounds = null;
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

        // if winding rule conflicts become a problem we could make this smarter? For ex:
        // we could identify convex shapes and declare them UNKNOWNs? Or we could dig
        // into winding rules and identify when a shape starts to be impacted by them...

        return shape.getPathIterator(null).getWindingRule();
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
        return new CompoundShapePathIterator(shapes.keySet().iterator(), at, flatness, windingRule);
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeInt(0);
        out.writeObject(shapes);
        out.writeObject(cachedBounds);
    }

    @Serial
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
                    sb.append("... (and ");
                    sb.append(shapes.size() - ctr);
                    sb.append(" more shapes)");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
}