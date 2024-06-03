package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.clip.RectangularClipperFactory;
import com.pump.awt.geom.mask.AbstractRectangleMask;

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
 * This object lazily tries to avoid computing intersections as much as possible. For example: when this
 * object adds shapes it will check to see (based on their bounding boxes) if they obviously cannot overlap, or
 * if one shape obviously contains another.
 * <p>
 * This object is not thread-safe.
 */
public class CompoundOutline implements Outline, Serializable {

    /**
     * This is an alternative winding rule indicating that the winding rule isn't
     * WIND_EVEN_ODD or WIND_NON_ZERO yet. It makes no difference yet, so it can be either.
     * CompoundShapes stay in this undefined state as long as possible. (If a CompoundShape
     * uses this winding rule then its PathIterator picks a default rule.)
     */
    public static int WIND_UNKNOWN = -1;

    /**
     * @param outline an optional Outline created by this CompoundOutline's OutlineFactory.
     *                If non-null: this should be the same as the `shape` parameter
     */
    record Member(Outline outline, Shape shape, Rectangle2D bounds) {
        public Member(Shape shape) {
            this(null, shape, ShapeUtils.getBounds2D(shape));
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

    OutlineFactory factory;

    public CompoundOutline() {
        this( (OutlineFactory) null);
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     */
    public CompoundOutline(Shape... shapes) {
        this(null, shapes);
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     *
     * @param factory the optional factory to use when this shape needs to perform a complex operation.
     *               If this is null then this object uses an AreaOutlineEngine.
     */
    public CompoundOutline(OutlineFactory factory, Shape... shapes)  {
        this.factory = factory == null ? OutlineFactory.getDefault() : factory;

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

    public void reset(Shape operand) {
        shapes.clear();
        if (operand == null) {
            cachedBounds = null;
            windingRule = WIND_UNKNOWN;
        } else if (operand instanceof CompoundOutline s) {
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
    @Override
    public void add(Shape operand) {
        if (operand == null || ShapeUtils.isEmpty(operand)) {
            return;
        } else if (isEmpty()) {
            reset(operand);
            return;
        }

        Rectangle2D operandBounds = ShapeUtils.getBounds2D(operand);
        if (cachedBounds.contains(operandBounds) && contains(operandBounds)) {
            return;
        } else if (operandBounds.contains(cachedBounds) && Path2D.contains(operand.getPathIterator(null), cachedBounds)) {
            reset(operand);
            return;
        }

        if (operand instanceof CompoundOutline s) {
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
                            Path2D.contains(operandMember.shape.getPathIterator(null), myMember.bounds) &&
                            isWindingRuleCompatible) {
                        myMembersIter.set(operandMember);
                        cachedBounds.add(operandMember.bounds);
                        isOperandMemberHandled = true;
                    }
                }

                if (!isOperandMemberHandled) {
                    if (isWindingRuleCompatible && !intersects(operandMember.bounds)) {
                        shapes.add(operandMember);
                    } else {
                        // we'll invoke flatten() later to make sure we get the merge correct
                        remainingAdds.add(new OutlineOperation(OutlineOperation.Type.ADD, operandMember.shape));
                    }
                }
            }

            if (!remainingAdds.isEmpty()) {
                flatten(remainingAdds);
            }
        } else {
            int operandWindingRule = getWindingRule(operand);
            boolean isOperandWindingRuleCompatible = windingRule == WIND_UNKNOWN ||
                    operandWindingRule == WIND_UNKNOWN ||
                    windingRule == operandWindingRule;

            if (isOperandWindingRuleCompatible) {
                ListIterator<Member> myMembersIter = shapes.listIterator();
                while (myMembersIter.hasNext()) {
                    Member member = myMembersIter.next();
                    if (operandBounds.contains(member.bounds) &&
                            Path2D.contains(operand.getPathIterator(null), member.bounds)) {
                        // this member is going to be eclipsed by the incoming shape
                        myMembersIter.remove();
                    }
                }

                boolean intersects = false;
                while (myMembersIter.hasPrevious()) {
                    Member member = myMembersIter.previous();
                    if (ShapeUtils.intersects(member.bounds, operandBounds) &&
                            Path2D.intersects(member.shape.getPathIterator(null), operandBounds)) {
                        intersects = true;
                        break;
                    }
                }

                if (!intersects) {
                    shapes.add(new Member(null, operand, operandBounds));
                    cachedBounds.add(operandBounds);
                    return;
                }
            }

            flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.ADD, operand)));
        }
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
    @Override
    public void clip(Shape operand) {
        boolean isEmpty = isEmpty();
        if (isEmpty)
            return;

        if (isNotIntersecting(operand)) {
            reset();
            return;
        }

        if (operand instanceof CompoundOutline s) {
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
                return;
            } else if (relevantOperandMembers.size() != s.shapes.size()) {
                // create a new simpler operand with just the parts we're interested in:
                CompoundOutline newOperand = new CompoundOutline(s.factory);
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

        Rectangle2D operandBounds = ShapeUtils.getBounds2D(operand);
        Iterator<Member> myIter = shapes.iterator();
        while (myIter.hasNext()) {
            Member entry = myIter.next();
            if (!Path2D.intersects(entry.shape.getPathIterator(null), operandBounds)) {
                myIter.remove();
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
            clipRect(operandAsRect);
            return;
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
                shapes.add(new Member(null, clippedShape, clippedShapeBounds));
                cachedBounds = new Rectangle2D.Double(clippedShapeBounds.getX(), clippedShapeBounds.getY(),
                        clippedShapeBounds.getWidth(), clippedShapeBounds.getHeight());
                windingRule = getWindingRule(clippedShape);
            }

            return;
        }

        //// end of special rect clipping

        if (shapes.size() == 0) {
            cachedBounds = null;
            windingRule = WIND_UNKNOWN;
            return;
        }

        flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.CLIP, operand)));
    }

    /**
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    @Override
    public void subtract(Shape operand) {
        if (isNotIntersecting(operand)) {
            return;
        }

        flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.SUBTRACT, operand)));
    }

    /**
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    @Override
    public void exclusiveOr(Shape operand) {
        if (isNotIntersecting(operand)) {
            add(operand);
            return;
        }

        flatten(Collections.singletonList(new OutlineOperation(OutlineOperation.Type.EXCLUSIVE_OR, operand)));
    }

    @Override
    public void transform(AffineTransform transform) {
        ListIterator<Member> listIter = shapes.listIterator();
        cachedBounds = null;
        while (listIter.hasNext()) {
            Member untransformedMember = listIter.next();
            Shape transformedShape = transform.createTransformedShape(untransformedMember.shape);
            Member transformedMember = new Member(transformedShape);
            listIter.set(transformedMember);
            if (cachedBounds == null) {
                cachedBounds = new Rectangle2D.Double();
                cachedBounds.setFrame(transformedMember.bounds);
            } else {
                cachedBounds.add(transformedMember.bounds);
            }
        }
    }

    /**
     * Return true if this object definitely does not intersect the argument. This return false if the two
     * shapes *may* intersect.
     */
    private boolean isNotIntersecting(Shape shape) {
        if (isEmpty() || ShapeUtils.isEmpty(shape))
            return true;

        Rectangle2D shapeBounds = ShapeUtils.getBounds2D(shape);
        if(!ShapeUtils.intersects(shapeBounds, cachedBounds)) {
            return true;
        }

        if (shape instanceof CompoundOutline otherShape) {
            for (Member entry1 : shapes) {
                for (Member entry2 : otherShape.shapes) {
                    if (ShapeUtils.intersects(entry1.bounds, entry2.bounds)) {
                        return false;
                    }
                }
            }
        } else {
            for (Member entry : shapes) {
                if (ShapeUtils.intersects(entry.bounds, shapeBounds)) {
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
                shapes.add(new Member(null, clippedShape, clippedShapeRect));

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
     * Collapse the {@link #shapes} list into one element and apply the argument ops. This also updates
     * the cachedBounds and windingRule fields.
     */
    private void flatten(List<OutlineOperation> additionalOps) {
        Outline newFlattenedShape;
        if (shapes.size() == 1 && shapes.get(0).outline != null) {
            newFlattenedShape = shapes.get(0).outline;
            for (OutlineOperation additionalOp : additionalOps) {
                additionalOp.execute(newFlattenedShape);
            }
        } else {
            newFlattenedShape = factory.create();
            if (shapes.size() == 1) {
                // Area#add is more performant if the arg is an Area
                newFlattenedShape.add(shapes.get(0).shape);
            } else if (shapes.size() > 1) {
                newFlattenedShape.add(this);
            }
            newFlattenedShape.execute(additionalOps);
        }

        windingRule = getWindingRule(newFlattenedShape);
        shapes.clear();
        if (!ShapeUtils.isEmpty(newFlattenedShape)) {
            Member newMember = new Member(newFlattenedShape, newFlattenedShape, newFlattenedShape.getBounds2D());
            shapes.add(newMember);
            cachedBounds = new Rectangle2D.Double();
            cachedBounds.setFrame(newMember.bounds);
        } else {
            cachedBounds = null;
        }
    }

    private int getWindingRule(Shape shape) {
        if (shape instanceof CompoundOutline cs) {
            return cs.getWindingRule();
        } else if (shape instanceof Path2D path2D) {
            return path2D.getWindingRule();
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
    public void clear() {
        reset(null);
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
            if (entry.bounds.contains(x,y) && Path2D.contains(entry.shape.getPathIterator(null), x, y))
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
            if (ShapeUtils.intersects(entry.bounds, r) && Path2D.intersects(entry.shape.getPathIterator(null), r))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (cachedBounds == null || !cachedBounds.contains(x,y,w,h))
            return false;

        for (Member entry : shapes) {
            if (entry.bounds.contains(x, y, w, h) && Path2D.contains(entry.shape.getPathIterator(null), x, y, w, h))
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
                shapes.add(new Member(null, shape, bounds));
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