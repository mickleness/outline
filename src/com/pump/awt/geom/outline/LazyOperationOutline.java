package com.pump.awt.geom.outline;

import com.pump.awt.geom.EmptyPathIterator;
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
 * This outline queues all geometric operations and only executes them when
 * necessary. When they are executed: some may be reordered, ignored or modified
 * based on other operations.
 * <p>
 * For example: if you call `outline.add(x)` for 3 circles, but then call
 * `outline.clip(y)` so that 2 circles don't show, then this class may
 * discard those 2 unused additions.
 * <p>
 * Operations that cannot be skipped will be delegated to another
 * {@link com.pump.awt.geom.outline.Outline} specified by this object's
 * {@link #getOutlineFactory()}.
 * <p>
 * This object is thread-safe.
 * </p>
 */
public class LazyOperationOutline implements Outline, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    protected OutlineFactory factory;

    // the queue should be a LinkedList because the OutlineEngine may alter it a lot
    protected List<OutlineOperation> operationQueue = new LinkedList<>();

    protected Shape shape;

    /**
     * Create a new Outline with a specific OutlineFactory.
     */
    public LazyOperationOutline(OutlineFactory factory) {
        this(factory, null);
    }

    /**
     * Create a new Outline with an initial shape.
     */
    public LazyOperationOutline(Shape shape) {
        this(OutlineFactory.getDefault(), shape);
    }

    /**
     * Create a new LazyOperationOutline with a specific OutlineFactory and an initial shape.
     *
     * @param factory this may not be null, but it can be {@link OutlineFactory#getDefault()}.
     */
    public LazyOperationOutline(OutlineFactory factory, Shape shape) {
        this.factory = Objects.requireNonNull(factory);
        if (shape != null)
            add(shape);
    }

    /**
     * Return the OutlineFactory that is used to create an Outline to
     * execute operations.
     */
    public OutlineFactory getOutlineFactory() {
        return factory;
    }

    /**
     * Add a shape to this LazyOperationOutline.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     */
    @Override
    public void add(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.ADD, shape));
        }
    }

    /**
     * Subtract a shape from this LazyOperationOutline.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     */
    @Override
    public void subtract(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.SUBTRACT, shape));
        }
    }

    /**
     * Clip this LazyOperationOutline to a given shape.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     */
    @Override
    public void clip(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.CLIP, shape));
        }
    }

    /**
     * This performs an exclusive-or operation between this LazyOperationOutline the argument.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     */
    @Override
    public void exclusiveOr(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(OutlineOperation.Type.EXCLUSIVE_OR, shape));
        }
    }

    /**
     * Transform this LazyOperationOutline.
     * <p>
     * This method will return immediately even if the operation is very complicated.
     * The operation is not fully processed until another method (like
     * {@link #getBounds2D()} or {@link #getPathIterator(AffineTransform)}) is called.
     * </p>
     *
     * @param transform the transform to apply. This may not be null.
     */
    @Override
    public void transform(AffineTransform transform) {
        Objects.requireNonNull(transform);
        synchronized(this) {
            operationQueue.add(new OutlineOperation(transform));
        }
    }

    @Override
    public synchronized boolean isEmpty() {
        flush();
        return shape == null || ShapeUtils.isEmpty(shape);
    }

    @Override
    public void clear() {
        synchronized(this) {
            shape = null;
            operationQueue.clear();
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

        if (shape != null) {
            operationQueue.add(0, new OutlineOperation(OutlineOperation.Type.ADD, shape));
        }
        shape = new LazyOutlineOperationManager().execute(factory, operationQueue);

        operationQueue.clear();
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        out.writeInt(0);

        out.writeObject(factory);
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
            factory = (OutlineFactory) in.readObject();
            operationQueue = (List<OutlineOperation>) in.readObject();
            Shape z = (Shape) in.readObject();
            if (z != null)
                shape = factory.create(z);
        } else {
            throw new UnsupportedOperationException("unsupported internal version: "+internalVersion);
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