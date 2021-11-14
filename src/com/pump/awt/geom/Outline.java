package com.pump.awt.geom;

import com.pump.awt.geom.outline.OutlineEngine;
import com.pump.awt.geom.outline.OutlineOperation;
import com.pump.awt.geom.outline.PlainAreaEngine;

import java.awt.*;
import java.awt.geom.*;
import java.io.IOException;
import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 * The Outline class is similar to (and relies on) the java.awt.geom.Area class,
 * but it includes some performance optimizations.
 */
public class Outline implements Shape, Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private static OutlineEngine DEFAULT_ENGINE = new PlainAreaEngine();

    public static void setDefaultEngine(OutlineEngine newEngine) {
        Objects.requireNonNull(newEngine);
        DEFAULT_ENGINE = newEngine;
    }

    public static OutlineEngine getDefaultEngine() {
        return DEFAULT_ENGINE;
    }

    private transient OutlineEngine engine;
    private transient List<OutlineOperation> operationQueue = new LinkedList<>();

    private Shape shape;

    public Outline(OutlineEngine engine) {
        setEngine(engine);
    }

    public Outline() {
        this(getDefaultEngine());
    }

    public OutlineEngine getEngine() {
        return engine;
    }

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

    public void add(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            OutlineOperation addOperation = new OutlineOperation(OutlineOperation.Type.ADD, shape);
            operationQueue.add(addOperation);
            getEngine().prepare(addOperation);
        }
    }

    public void subtract(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            OutlineOperation subtractOperation = new OutlineOperation(OutlineOperation.Type.SUBTRACT, shape);
            operationQueue.add(subtractOperation);
            getEngine().prepare(subtractOperation);
        }
    }

    public synchronized void intersect(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            OutlineOperation intersectOperation = new OutlineOperation(OutlineOperation.Type.INTERSECT, shape);
            operationQueue.add(intersectOperation);
            getEngine().prepare(intersectOperation);
        }
    }

    public synchronized void exclusiveOr(Shape shape) {
        Objects.requireNonNull(shape);
        synchronized(this) {
            OutlineOperation xorOperation = new OutlineOperation(OutlineOperation.Type.XOR, shape);
            operationQueue.add(xorOperation);
            getEngine().prepare(xorOperation);
        }
    }

    /**
     * Process all queued/pending operations. Every method that relies on up-to-date shape
     * data invokes this method. You do not need to invoke this method directly.
     * <p>
     * The methods {@link #add(Shape)}, {@link #intersect(Shape)}, {@link #exclusiveOr(Shape)}
     * and {@link #subtract(Shape)} all enqueue operations and return nearly immediately. This
     * method processes all the operations in that queue. This design lets the engine optimize
     * some operations once it can analyze the context of all the requested operations.
     * <p>
     * </p>
     */
    protected synchronized void flush() {
        if (operationQueue.isEmpty())
            return;

        shape = getEngine().flush(shape, operationQueue);
    }

    @Serial
    private void writeObject(java.io.ObjectOutputStream out)
            throws IOException {
        flush();

        out.writeInt(0);
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