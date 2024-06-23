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
        this( (OutlineFactory) null, null);
    }

    public CompoundOutline(OutlineFactory outlineFactory) {
        this(outlineFactory, null);
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     */
    public CompoundOutline(Shape shape) {
        this(null, shape);
    }

    /**
     * Create a new CompoundShape that combines the argument shapes.
     *
     * @param factory the optional factory to use when this shape needs to perform a complex operation.
     *               If this is null then this object uses an AreaOutlineEngine.
     */
    public CompoundOutline(OutlineFactory factory, Shape shape)  {
        this.factory = factory == null ? OutlineFactory.getDefault() : factory;

        if (shape == null || ShapeUtils.isEmpty(shape)) {
            windingRule = WIND_UNKNOWN;
            return;
        } else if (shape instanceof CompoundOutline compoundOutline) {
            windingRule = compoundOutline.windingRule;
            if (compoundOutline.cachedBounds != null) {
                cachedBounds = new Rectangle2D.Double();
                cachedBounds.setFrame(compoundOutline.cachedBounds);
            }
            shapes.addAll(compoundOutline.shapes);
            return;
        }

        windingRule = getWindingRule(shape);
        Map<Shape, Rectangle2D> paths = ShapeUtils.getPaths(shape);

        for (Map.Entry<Shape, Rectangle2D> entry : paths.entrySet()) {
            if (cachedBounds == null) {
                cachedBounds = new Rectangle2D.Double();
                cachedBounds.setFrame(entry.getValue());
            } else {
                cachedBounds.add(entry.getValue());
            }
            shapes.add(new Member(null, entry.getKey(), entry.getValue()));
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
        } else {
            if (cachedBounds == null)
                cachedBounds = new Rectangle2D.Double();
            if (operand instanceof CompoundOutline s) {
                shapes.addAll(s.shapes);
                cachedBounds.setFrame(s.cachedBounds);
                windingRule = s.getWindingRule();
            } else {
                Member m = new Member(operand);
                shapes.add(m);
                cachedBounds.setFrame(m.bounds);
                windingRule = getWindingRule(operand);
            }
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
        if (operand instanceof CompoundOutline compoundOutline) {
            add(compoundOutline);
            return;
        }
        add(new CompoundOutline(operand));
    }

    private void add(CompoundOutline operand) {
        if (operand == null || ShapeUtils.isEmpty(operand)) {
            return;
        } else if (isEmpty()) {
            reset(operand);
            return;
        }
        if (cachedBounds.contains(operand.cachedBounds)) {
            for (Member member : shapes) {
                if (member.bounds.contains(operand.cachedBounds) && member.shape.contains(operand.cachedBounds))
                    return;
            }
        } else if (operand.cachedBounds.contains(cachedBounds) && ShapeUtils.contains(operand.getPathIterator(null), cachedBounds)) {
            reset(operand);
            return;
        }

        List<OutlineOperation> remainingAdds = new LinkedList<>();

        scanOperandMembers : for (Member operandMember : operand.shapes) {
            for (Member myMember : shapes) {
                if (myMember.bounds.contains(operandMember.bounds) &&
                        ShapeUtils.contains(myMember.shape.getPathIterator(null), operandMember.bounds))
                    continue scanOperandMembers;
            }

            int operandMemberWindingRule = getWindingRule(operandMember.shape);
            boolean isWindingRuleCompatible = windingRule == WIND_UNKNOWN ||
                    operandMemberWindingRule == WIND_UNKNOWN ||
                    operandMemberWindingRule == windingRule;

            ListIterator<Member> myMembersIter = shapes.listIterator();
            while (myMembersIter.hasNext()) {
                Member myMember = myMembersIter.next();
                if (operandMember.bounds.contains(myMember.bounds) &&
                        ShapeUtils.contains(operandMember.shape.getPathIterator(null), myMember.bounds) &&
                        isWindingRuleCompatible) {
                    myMembersIter.remove();
                }
            }

            if (isWindingRuleCompatible && !intersects(operandMember.bounds)) {
                shapes.add(operandMember);
                cachedBounds.add(operandMember.bounds);
            } else {
                // we'll invoke flatten() later to make sure we get the merge correct
                remainingAdds.add(new OutlineOperation(OutlineOperation.Type.ADD, operandMember.shape));
            }
        }

        if (!remainingAdds.isEmpty()) {
            flatten(remainingAdds);
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
                CompoundOutline newOperand = new CompoundOutline(s.factory, null);
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
            if (!ShapeUtils.intersects(entry.shape.getPathIterator(null), operandBounds)) {
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
        } else {
            if (shapes.isEmpty()) {
                // I'm not sure if this condition is ever reachable, but just in case:
                newFlattenedShape = factory.create();
            } else if (shapes.size() == 1) {
                newFlattenedShape = factory.create(shapes.get(0).shape);
            } else {
                List<Shape> shapesToAdd = new LinkedList<>();
                Iterator<Member> iter = shapes.iterator();
                while (iter.hasNext()) {
                    shapesToAdd.add(iter.next().shape);
                }
                Iterator<OutlineOperation> opIter = additionalOps.iterator();
                while (opIter.hasNext()) {
                    OutlineOperation op = opIter.next();
                    if (op.type == OutlineOperation.Type.ADD) {
                        shapesToAdd.add(op.shape);
                    } else {
                        break;
                    }
                }

                while (shapesToAdd.size() > 1) {
                    Shape s1 = shapesToAdd.remove(0);
                    if (!shapes.isEmpty()) {
                        Shape s2 = shapesToAdd.remove(0);
                        Outline outline = factory.create(s1);
                        outline.add(s2);
                        shapesToAdd.add(outline);
                    }
                }

                newFlattenedShape = factory.create(shapesToAdd.get(0));
            }
        }
        newFlattenedShape.execute(additionalOps);

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
            if (entry.bounds.contains(x,y) && ShapeUtils.contains(entry.shape.getPathIterator(null), x, y))
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
            if (ShapeUtils.intersects(entry.bounds, r) && ShapeUtils.intersects(entry.shape.getPathIterator(null), r))
                return true;
        }
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        if (cachedBounds == null || !cachedBounds.contains(x,y,w,h))
            return false;

        for (Member entry : shapes) {
            if (entry.bounds.contains(x, y, w, h) && ShapeUtils.contains(entry.shape.getPathIterator(null), x, y, w, h))
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