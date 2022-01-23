package com.pump.awt.geom;

import com.pump.awt.geom.mask.RectangleMask2D;

import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;


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
public class AddingShape implements Shape, Serializable {

    /**
     * This is an alternative winding rule indicating that the winding rule isn't
     * WIND_EVEN_ODD or WIND_NON_ZERO yet. AddingShapes stay in this undefined
     * shape as long as possible. (If an AddingShape uses this winding rule then
     * its PathIterator picks a default rule.)
     */
    public static int WIND_UNKNOWN = -1;

    private static class ShapeInfo {
        final Shape shape;
        final int windingRule;
        final Rectangle2D bounds;
        RectangleMask2D mask;

        ShapeInfo(Area area) {
            this.shape = area;
            this.bounds = area.getBounds2D();
            this.windingRule = WIND_UNKNOWN;
        }

        ShapeInfo(Shape shape, int windingRule) {
            this.shape = shape;
            this.bounds = ShapeUtils.getBounds2D(shape);
            this.windingRule = WIND_UNKNOWN;
        }

        public ShapeInfo(Rectangle2D r) {
            this.shape = r;
            this.bounds = r;
            this.windingRule = WIND_UNKNOWN;
        }

        Rectangle2D cloneBounds() {
            return new Rectangle2D.Double(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
        }

        public boolean contains(double x, double y) {
            if (!bounds.contains(x,y))
                return false;
            if (mask != null && !mask.contains(x,y))
                return false;
            return shape.contains(x,y);
        }

        public boolean contains(double x, double y, double w, double h) {
            if(!bounds.contains(x, y, w, h))
                return false;

            if (mask!=null && !mask.contains(x, y, w, h))
                return false;

            return shape.contains(x, y, w, h);
        }

        public boolean intersects(double x, double y, double w, double h) {
            if(!bounds.intersects(x, y, w, h))
                return false;

            if (mask!=null && !mask.intersects(x, y, w, h))
                return false;

            boolean returnValue = shape.intersects(x, y, w, h);

            if (!returnValue) {
                if (mask == null) {
                    mask = new RectangleMask2D(bounds);
                }
                mask.subtract(x,y,w,h);
            }

            return returnValue;
        }

        public boolean contains(Rectangle2D r) {
            return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
        }
    }

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
     * The member shapes and their masks. Member shapes are generally supposed to be
     * immutable once submitted into this map, but we can't enforce that if
     * the user tries to mutate a shape.
     */
    private Collection<ShapeInfo> members = new LinkedList<>();

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

    public AddingShape() {
        // intentionally empty
    }

    public AddingShape(Shape shape) {
        try {
            add(shape);
        } catch (IncompatibleWindingRuleException e) {
            // this shouldn't happen since our initial winding rule is UNKNOWN and we only added one shape:
            throw new IllegalStateException(e);
        }
    }

    /**
     * Create a new AddingShape that combines the argument shapes.
     */
    public AddingShape(Shape... shapes) throws IncompatibleWindingRuleException {
        for(Shape shape : shapes) {
            add(shape);
        }
    }

    /**
     * Add an Area to this AddingShape.
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

        return addCommon(new ShapeInfo(area));
    }

    /**
     * Return the winding rule of this shape, which may be {@link PathIterator#WIND_NON_ZERO},
     * {@link PathIterator#WIND_EVEN_ODD} or {@link #WIND_UNKNOWN}.
     */
    public int getWindingRule() {
        return windingRule;
    }

    /**
     * Add a shape to this AddingShape.
     *
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     *
     * @throws IncompatibleWindingRuleException if this AddingShape already has identified
     * a winding rule and the incoming shape is a different winding rule.
     */
    public boolean add(Shape shape) throws IncompatibleWindingRuleException {
        if (shape instanceof Area) {
            return add((Area) shape);
        } else if (shape instanceof AddingShape) {
            AddingShape s = (AddingShape) shape;
            boolean returnValue = false;
            int incomingWindingRule = s.getWindingRule();

            if (windingRule == WIND_UNKNOWN) {
                windingRule = incomingWindingRule;
            } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
                throw new IncompatibleWindingRuleException();
            }

            for (ShapeInfo incomingShape : s.members) {
                if (addCommon(incomingShape))
                    returnValue = true;
            }
            return returnValue;
        } else if (shape == null || ShapeUtils.isEmpty(shape)) {
            return false;
        }

        int incomingWindingRule = shape.getPathIterator(null).getWindingRule();

        if (windingRule == WIND_UNKNOWN) {
            windingRule = incomingWindingRule;
        } else if (incomingWindingRule != WIND_UNKNOWN && windingRule != incomingWindingRule) {
            throw new IncompatibleWindingRuleException();
        }



        return addCommon(new ShapeInfo(shape, windingRule));
    }

    /**
     * This is shared code that both Areas and non-Areas use to add a new shape. This should be called
     * after evaluating if an IncompatibleWindingRuleException is warranted.
     *
     * @return false if this call definitely did not modify this object. This method returns true if
     * this call may have modified this object.
     */
    private boolean addCommon(ShapeInfo incoming) {
        if (!intersects(incoming.bounds)) {
            members.add(incoming);

            if (cachedBounds == null) {
                cachedBounds = incoming.cloneBounds();
            } else {
                cachedBounds.add(incoming.bounds);
            }
            if (windingRule == WIND_UNKNOWN)
                windingRule = incoming.windingRule;
            return true;
        }

        if (cachedBounds != null && incoming.contains(cachedBounds)) {
            windingRule = incoming.windingRule;
            members.clear();
            members.add(incoming);
            cachedBounds = incoming.cloneBounds();
            return true;
        }

        if(contains(incoming.bounds)) {
            return false;
        }

        Area sum;
        if (members.size() == 1) {
            // if our only member happens to be an Area then this Area constructor is more efficient:
            sum = new Area(members.iterator().next().shape);
        } else {
            sum = new Area(this);
        }
        sum.add(new Area(incoming.shape));

        members.clear();
        cachedBounds.add(incoming.bounds);
        members.add(new ShapeInfo(sum));
        windingRule = WIND_UNKNOWN;

        return true;
    }

    /**
     * Add a shape to this AddingShape.
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
     * Return the shapes in this AddingShape.
     * <p>
     * This may not return the same set of shapes that were added to this object. As shapes are added sometimes they
     * are flattened/converted into other member shapes.
     * </p>
     */
    public Shape[] getShapes() {
        Shape[] returnValue = new Shape[members.size()];
        Iterator<ShapeInfo> iter = members.iterator();
        for(int i = 0; i < returnValue.length; i++) {
            returnValue[i] = iter.next().shape;
        }
        return returnValue;
    }

    /**
     * Return true if this AddingShape is empty.
     */
    public boolean isEmpty() {
        return members.isEmpty();
    }

    /**
     * Remove all shapes from this AddingShape.
     */
    public void clear() {
        members.clear();
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

        for (ShapeInfo i : members) {
            if (i.contains(x, y))
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
        if (cachedBounds == null || !cachedBounds.intersects(x, y, w, h))
            return false;

        for (ShapeInfo member : members) {
            if (member.intersects(x, y, w, h))
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
        if (cachedBounds == null || !cachedBounds.contains(x, y, w, h))
            return false;

        for (ShapeInfo member : members) {
            if (member.contains(x, y, w, h))
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
        return new MultipleShapePathIterator(getMembers(), at, null, windingRule);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return new MultipleShapePathIterator(getMembers(), at, Double.valueOf(flatness), windingRule);
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeInt(0);
        out.writeObject(members);
        out.writeObject(cachedBounds);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            members = (Collection<ShapeInfo>) in.readObject();
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

        Iterator<Shape> shapeIter = getMembers();
        int ctr = 0;
        while (shapeIter.hasNext()) {
            Shape shape = shapeIter.next();
            ctr++;
            sb.append(shape.toString());
            if (shapeIter.hasNext()) {
                sb.append(", ");
                if (sb.length() > 200) {
                    sb.append("... (and " + (members.size() - ctr)+" more shapes)");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private Iterator<Shape> getMembers() {
        return new Iterator<Shape>() {
            Iterator<ShapeInfo> memberIter = members.iterator();

            @Override
            public boolean hasNext() {
                return memberIter.hasNext();
            }

            @Override
            public Shape next() {
                return memberIter.next().shape;
            }
        };
    }
}