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
     * WIND_EVEN_ODD or WIND_NON_ZERO yet. It makes no difference yet, so it can be either.
     * CompoundShapes stay in this undefined state as long as possible. (If a CompoundShape
     * uses this winding rule then its PathIterator picks a default rule.)
     */
    public static int WIND_UNKNOWN = -1;

    record Member(Shape shape, Rectangle2D bounds) {
        public Member(Shape shape) {
            this(shape, ShapeUtils.getBounds2D(shape));
        }
    }

    /**
     * The member shapes and their bounds. (These are generally supposed to be
     * immutable once submitted into this map, but we can't enforce that if
     * the user tries to mutate a shape.)
     */
    protected List<Member> shapes = new LinkedList<>();

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

    private OutlineEngine engine;

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
     *               If this is null then this object uses an AreaOutlineEngine.
     */
    public CompoundShape(OutlineEngine engine, Shape... shapes)  {
        this.engine = engine == null ?  new AreaOutlineEngine() : engine;

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

    public void reset() {
        reset(null);
    }

    public void reset(Shape operand) {
        shapes.clear();
        if (operand == null) {
            cachedBounds = null;
            windingRule = WIND_UNKNOWN;
        } else if (operand instanceof CompoundShape) {
            CompoundShape s = (CompoundShape) operand;
            shapes.addAll(s.shapes);
            cachedBounds = new Rectangle2D.Double(s.cachedBounds.getX(), s.cachedBounds.getY(), s.cachedBounds.getWidth(), s.cachedBounds.getHeight());
            windingRule = s.getWindingRule();
        } else {
            Member m = new Member(operand);
            shapes.add(m);
            cachedBounds = new Rectangle2D.Double(m.bounds.getX(), m.bounds.getY(), m.bounds.getWidth(), m.bounds.getHeight());
            windingRule = getWindingRule(operand);
        }
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
            reset(operand);
            return true;
        }

        Rectangle2D operandBounds = operand.getBounds2D();
        if (cachedBounds.contains(operandBounds) && contains(operandBounds)) {
            return false;
        } else if (operandBounds.contains(cachedBounds) && operand.contains(cachedBounds)) {
            reset(operand);
            return true;
        }

        // This method is messier than the other operations because this is the only method that can
        // add key/value pairs to the shapes map. This requires safety-checking the winding rules of
        // the existing and incoming shapes.

        boolean returnValue = false;
        if (operand instanceof CompoundShape) {
            CompoundShape s = (CompoundShape) operand;

            List<OutlineOperation> remainingAdds = new LinkedList<>();

            for (Member operandMember : s.shapes) {
                if (contains(operandMember.bounds))
                    continue;

                int operandMemberWindingRule = getWindingRule(operandMember.shape);
                boolean isWindingRuleCompatible = windingRule == WIND_UNKNOWN ||
                        operandMemberWindingRule == WIND_UNKNOWN ||
                        operandMemberWindingRule == windingRule;

                ListIterator<Member> myMembersIter = shapes.listIterator();
                boolean isOperandMemberHandled = false;
                while (myMembersIter.hasNext()) {
                    Member myMember = myMembersIter.next();
                    if (operandMember.bounds.contains(myMember.bounds) &&
                            operandMember.shape.contains(myMember.bounds) &&
                            isWindingRuleCompatible) {
                        myMembersIter.set(operandMember);
                        cachedBounds.add(operandMember.bounds);
                        isOperandMemberHandled = true;
                        returnValue = true;
                    }
                }

                if (!isOperandMemberHandled) {
                    if (isWindingRuleCompatible && !intersects(operandMember.bounds)) {
                        shapes.add(operandMember);
                        returnValue = true;
                    } else {
                        // we'll invoke flatten() later to make sure we get the merge correct
                        remainingAdds.add(new OutlineOperation(OutlineOperation.Type.ADD, operandMember.shape));
                    }
                }
            }

            if (!remainingAdds.isEmpty()) {
                flatten(remainingAdds);
            }

            return returnValue;
        }

        int operandWindingRule = getWindingRule(operand);
        boolean isOperandWindingRuleCompatible = windingRule == WIND_UNKNOWN ||
                operandWindingRule == WIND_UNKNOWN ||
                windingRule == operandWindingRule;

        if (isOperandWindingRuleCompatible) {
            Iterator<Member> myMembersIter = shapes.listIterator();
            boolean intersects = false;
            while (myMembersIter.hasNext()) {
                Member member = myMembersIter.next();
                if (operandBounds.contains(member.bounds) && operand.contains(member.bounds)) {
                    // this member is going to be eclipsed by the incoming shape
                    myMembersIter.remove();
                } else if (!intersects && member.shape.intersects(operandBounds)) {
                    intersects = true;
                }
            }

            if (!intersects) {
                shapes.add(new Member(operand, operandBounds));
                cachedBounds.add(operandBounds);
                return true;
            }
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
            Shape shape = shapes.get(0).shape;
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
        boolean isEmpty = isEmpty();
        if (isEmpty())
            return false;

        if (isNotIntersecting(operand)) {
            reset();
            return !isEmpty;
        }

        if (operand instanceof CompoundShape) {
            CompoundShape s = (CompoundShape) operand;

            // identify which parts of the operand are relevant, and ignore other parts
            List<Member> relevantOperandMembers = new LinkedList<>();
            for (Member operandMember : s.shapes) {
                if (isNotIntersecting(operandMember.shape())) {
                    // ignore this operand entry
                } else {
                    relevantOperandMembers.add(operandMember);
                }
            }

            if (relevantOperandMembers.isEmpty()) {
                reset();
                return !isEmpty;
            } else if (relevantOperandMembers.size() != s.shapes.size()) {
                // create a new simpler operand with just the parts we're interested in:
                CompoundShape newOperand = new CompoundShape();
                newOperand.windingRule = s.getWindingRule();
                for (Member relevantOperandMember : relevantOperandMembers) {
                    newOperand.shapes.add(relevantOperandMember);

                    if (newOperand.cachedBounds == null) {
                        newOperand.cachedBounds = new Rectangle2D.Double();
                        newOperand.cachedBounds.setFrame(relevantOperandMember.bounds);
                    } else {
                        newOperand.cachedBounds.add(relevantOperandMember.bounds);
                    }
                }

                operand = newOperand;
            }
        }

        boolean returnValue = false;
        Rectangle2D operandBounds = ShapeUtils.getBounds2D(operand);
        Iterator<Member> myIter = shapes.iterator();
        while (myIter.hasNext()) {
            Member entry = myIter.next();
            if (!entry.shape.intersects(operandBounds)) {
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
                shapes.add(new Member(clippedShape, clippedShapeBounds));
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
            for (Member entry1 : shapes) {
                for (Member entry2 : otherShape.shapes) {
                    if (entry1.bounds.intersects(entry2.bounds)) {
                        return false;
                    }
                }
            }
        } else {
            for (Member entry : shapes) {
                if (entry.bounds.intersects(shapeBounds)) {
                    return false;
                }
            }
        }

        return true;
    }

    protected boolean clipRect(Rectangle2D rect) {
        Collection<Shape> clippedShapes = new HashSet<>();
        for(Member entry : shapes) {
            Shape clippedShape = RectangularClipperFactory.get().createClipper().clip(entry.shape, null, rect);
            clippedShapes.add(clippedShape);
        }
        shapes.clear();
        cachedBounds = null;
        for(Shape clippedShape : clippedShapes) {
            if (!ShapeUtils.isEmpty(clippedShape)) {
                Rectangle2D clippedShapeRect = ShapeUtils.getBounds2D(clippedShape);
                shapes.add(new Member(clippedShape, clippedShapeRect));

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
            opsToProcess.add(new OutlineOperation(OutlineOperation.Type.ADD, shapes.get(0).shape));
        } else {
            opsToProcess.add(new OutlineOperation(OutlineOperation.Type.ADD, this));
        }

        opsToProcess.addAll(additionalOps);

        Shape newFlattenedShape = engine.calculate(opsToProcess);

        windingRule = getWindingRule(newFlattenedShape);
        shapes.clear();
        if (!ShapeUtils.isEmpty(newFlattenedShape)) {
            shapes.add(new Member(newFlattenedShape));
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
        Shape[] returnValue = new Shape[shapes.size()];
        int ctr = 0;
        for (Member member : shapes) {
            returnValue[ctr++] = member.shape;
        }
        return returnValue;
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

        for (Member entry : shapes) {
            if (entry.bounds.contains(x,y) && entry.shape.contains(x, y))
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

        for (Member entry : shapes) {
            if (ShapeUtils.intersects(entry.bounds, r) && entry.shape.intersects(r))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (cachedBounds == null || !cachedBounds.contains(x,y,w,h))
            return false;

        for (Member entry : shapes) {
            if (entry.bounds.contains(x, y, w, h) && entry.shape.contains(x, y, w, h))
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
        return new CompoundShapePathIterator(getShapes(), at, null, windingRule);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new CompoundShapePathIterator(getShapes(), at, flatness, windingRule);
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeInt(0);
        out.writeObject(cachedBounds);
        out.writeInt(shapes.size());
        for(Member member : shapes) {
            out.writeObject(member.shape);
            out.writeObject(member.bounds);
        }
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            cachedBounds = (Rectangle2D) in.readObject();
            int size = in.readInt();
            for (int a = 0; a < size; a++) {
                Shape shape = (Shape) in.readObject();
                Rectangle2D bounds = (Rectangle2D) in.readObject();
                shapes.add(new Member(shape, bounds));
            }
        } else {
            throw new IOException("unsupported internal version: " + internalVersion);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");

        Iterator<Member> shapeIter = shapes.iterator();
        int ctr = 0;
        while (shapeIter.hasNext()) {
            Shape shape = shapeIter.next().shape;
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