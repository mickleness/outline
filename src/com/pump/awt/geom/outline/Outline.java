package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;

import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * An Outline is a <code>java.awt.Shape</code> that supports five geometric operations:
 * adding, subtracting, clipping, exclusiveOr'ing, and transforming.
 * <p>
 * The Outline class itself is a lightweight wrapper class that enqueues
 * {@link OutlineOperation} objects that represent requested changes. This
 * object uses a {@link OutlineEngine} to actually compute all these operations.
 * </p>
 * <p>
 * This object is thread-safe.
 * </p>
 */
public class Outline implements Shape, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static OutlineEngine DEFAULT_ENGINE = new OptimizedEngine();

    /**
     * Set the default engine that all new Outline objects will use
     * by default if no specific engine is assigned.
     *
     * @param newEngine the new OutlineEngine to assign. This may not be null.
     */
    public static void setDefaultEngine(OutlineEngine newEngine) {
        Objects.requireNonNull(newEngine);
        DEFAULT_ENGINE = newEngine;
    }

    /**
     * Return the default OutlineEngine that all new Outlines will
     * use by default if no specific engine is specified.
     */
    public static OutlineEngine getDefaultEngine() {
        return DEFAULT_ENGINE;
    }

    protected OutlineEngine engine;

    // the queue should be a LinkedList because the OutlineEngine may alter it a lot
    protected List<OutlineOperation> operationQueue = new LinkedList<>();

    protected Shape shape;

    /**
     * Create a new Outline with a specific OutlineEngine.
     */
    public Outline(OutlineEngine engine) {
        this(engine, null);
    }

    /**
     * Create a new Outline with an initial shape.
     */
    public Outline(Shape shape) {
        this(getDefaultEngine(), shape);
    }

    /**
     * Create a new Outline with a specific OutlineEngine and an initial shape.
     */
    public Outline(OutlineEngine engine, Shape shape) {
        setEngine(engine);
        if (shape != null)
            add(shape);
    }

    /**
     * Return the current engine this Outline will use to process OutlineOperations.
     */
    public OutlineEngine getEngine() {
        return engine;
    }

    /**
     * Assign the engine this Outline will use to process OutlineOperations.
     *
     * @param engine the OutlineEngine to assign. This may not be null, but it
     *               can be {@link #getDefaultEngine()}.
     */
    public OutlineEngine setEngine(OutlineEngine engine) {
        Objects.requireNonNull(engine);
        synchronized(this) {
            // finish anything we might have started
            flush();

            OutlineEngine oldEngine = this.engine;
            this.engine = engine;
            return oldEngine;
        }
    }

    /**
     * Add a shape to this Outline.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     */
    public void add(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.ADD, shape));
        }
    }

    /**
     * Subtract a shape from this Outline.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     */
    public void subtract(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.SUBTRACT, shape));
        }
    }

    /**
     * Clip this Outline to a given shape.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     * <p>
     * This is analogous to the {@link Area#intersect(Area)} method. But this method was
     * renamed to <code>clip(..)</code> to better distinguish it from the {@link Shape#intersects(Rectangle2D)}
     * method. This project follows this convention and tries to use "clip" as an action verb
     * and "intersects" as a boolean query.
     * </p>
     */
    public synchronized void clip(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.CLIP, shape));
        }
    }

    /**
     * This performs an exclusive-or operation between this Outline the argument.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     */
    public synchronized void exclusiveOr(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.EXCLUSIVE_OR, shape));
        }
    }

    /**
     * Transform this Operation.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     *
     * @param transform the transform to apply. This may not be null.
     */
    public synchronized void transform(AffineTransform transform) {
        Objects.requireNonNull(transform);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(transform));
        }
    }

    /**
     * Process all queued/pending operations. Every method that relies on up-to-date shape
     * data invokes this method. You do not need to invoke this method directly.
     * <p>
     * The methods {@link #add(Shape)}, {@link #clip(Shape)}, {@link #exclusiveOr(Shape)}
     * and {@link #subtract(Shape)} all enqueue operations and return nearly immediately. This
     * method processes all the operations in that queue. This design lets the engine optimize
     * some operations once it can analyze the context of all the requested operations.
     * <p>
     * </p>
     */
    protected synchronized void flush() {
        if (operationQueue.isEmpty())
            return;

        if (shape != null && !ShapeUtils.isEmpty(shape)) {
            OutlineOperation initOp = new OutlineOperation(OutlineOperation.Type.ADD, shape);
            operationQueue.add(0, initOp);
        }

        shape = getEngine().calculate(operationQueue);
        operationQueue.clear();
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);

        out.writeObject(engine);
        out.writeObject(operationQueue);

        if (shape == null || shape instanceof Serializable) {
            out.writeObject(shape);
        } else {
            PathIterator pi = shape.getPathIterator(null);
            int windingRule = pi.getWindingRule();
            Path2D path = new Path2D.Double(windingRule);
            path.append(pi, false);
            out.writeObject(path);
        }
    }

    @Serial
    private void readObject(java.io.ObjectInputStream in)
            throws IOException, ClassNotFoundException {
        int internalVersion = in.readInt();
        if (internalVersion == 0) {
            engine = (OutlineEngine) in.readObject();
            operationQueue = (List<OutlineOperation>) in.readObject();
            shape = (Shape) in.readObject();
        } else {
            throw new IOException("unsupported internal version: "+internalVersion);
        }
    }

    @Override
    public Rectangle getBounds() {
        return getBounds2D().getBounds();
    }

    @Override
    public synchronized Rectangle2D getBounds2D() {
        flush();
        if (shape == null)
            return new Rectangle2D.Double(0,0,0,0);
        return shape.getBounds2D();
    }

    @Override
    public synchronized boolean contains(double x, double y) {
        flush();
        if (shape == null)
            return false;
        return shape.contains(x, y);
    }

    @Override
    public boolean contains(Point2D p) {
        return contains(p.getX(), p.getY());
    }

    @Override
    public synchronized boolean intersects(double x, double y, double w, double h) {
        flush();
        if (shape == null)
            return false;
        return shape.intersects(x, y, w, h);
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return intersects(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public synchronized boolean contains(double x, double y, double w, double h) {
        flush();
        if (shape == null)
            return false;
        return shape.contains(x, y, w, h);
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return contains(r.getX(), r.getY(), r.getWidth(), r.getHeight());
    }

    @Override
    public synchronized PathIterator getPathIterator(AffineTransform at) {
        flush();
        if (shape == null)
            return EmptyPathIterator.INSTANCE;
        return shape.getPathIterator(at);
    }

    @Override
    public synchronized PathIterator getPathIterator(AffineTransform at, double flatness) {
        flush();
        if (shape == null)
            return EmptyPathIterator.INSTANCE;
        return shape.getPathIterator(at, flatness);
    }
}