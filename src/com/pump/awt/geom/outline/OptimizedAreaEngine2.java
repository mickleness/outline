package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;
import com.pump.awt.geom.mask.RectangleMask2D;

import java.awt.*;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.List;
import java.util.*;
import java.util.concurrent.*;

/**
 * This engine filters operations and may prune, reorder, or multithread
 * operations to improve performance
 */
public class OptimizedAreaEngine2 implements OutlineEngine {

    // TODO: intercept shapes and replace quad/cubic segments if they live in dest

    /**
     * This OutlineOperation collects a little metadata about the shape operand
     */
    protected static class OptimizedOutlineOperation extends OutlineOperation {
        static long idCtr = 0;

        /**
         * Only used for debugging.
         */
        Collection<String> id = Collections.singleton(Long.toString(idCtr++));

        Rectangle2D bounds;

        /**
         * The number of line segments.
         * <p>
         * Note if two OptimizedOutlineOperations are merged this field may just be their sum, which means
         * it's no longer strictly accurate. It reflects the state of the ORIGIN of a path segment, but not
         * its current state.
         * </p>
         */
        int lineSegments = 0;

        /**
         * The number of quad segments.
         * <p>
         * Note if two OptimizedOutlineOperations are merged this field may just be their sum, which means
         * it's no longer strictly accurate. It reflects the state of the ORIGIN of a path segment, but not
         * its current state.
         * </p>
         */
        int quadSegments = 0;

        /**
         * The number of cubic segments.
         * <p>
         * Note if two OptimizedOutlineOperations are merged this field may just be their sum, which means
         * it's no longer strictly accurate. It reflects the state of the ORIGIN of a path segment, but not
         * its current state.
         * </p>
         */
        int cubicSegments = 0;

        /**
         * The number of SEG_MOVETO segments (aka "the number of subpaths")
         */
        int moveTos = 0;

        /**
         * If true then the shape operand is a rectangle, so {@link #bounds} is equivalent
         * to the operand {@link #shape}
         */
        boolean isRectangle2D;

        public OptimizedOutlineOperation(Type type, Shape shape) {
            super(type, shape);
        }

        /**
         * This walks through the PathIterator and updates the bounds and other metadata. This should
         * be called before any of the metadata fields are used.
         */
        void populateMetadata() {
            PathIterator pi = shape.getPathIterator(null);

            // sit on top of the other PathIterator and catalog minOrder, maxOrder & moveTos
            PathIterator pi2 = new PathIterator() {
                boolean dirty = true;
                @Override
                public int getWindingRule() {
                    return pi.getWindingRule();
                }

                @Override
                public boolean isDone() {
                    return pi.isDone();
                }

                @Override
                public void next() {
                    pi.next();
                    dirty = true;
                }

                @Override
                public int currentSegment(float[] coords) {
                    int returnValue = pi.currentSegment(coords);
                    if (dirty) {
                        recordSegmentType(returnValue);
                        dirty = false;
                    }
                    return returnValue;
                }

                private void recordSegmentType(int segmentType) {
                    if (segmentType == PathIterator.SEG_MOVETO) {
                        moveTos++;
                    } else if(segmentType == PathIterator.SEG_LINETO) {
                        lineSegments++;
                    } else if(segmentType == PathIterator.SEG_QUADTO) {
                        quadSegments++;
                    } else if(segmentType == PathIterator.SEG_CUBICTO) {
                        cubicSegments++;
                    }
                }

                @Override
                public int currentSegment(double[] coords) {
                    int returnValue = pi.currentSegment(coords);
                    if (dirty) {
                        recordSegmentType(returnValue);
                        dirty = false;
                    }
                    return returnValue;
                }
            };

            bounds = ShapeUtils.getBounds2D(pi2);

            if (moveTos == 1 && lineSegments < 5 && quadSegments == 0 && cubicSegments == 0) {
                isRectangle2D = ShapeUtils.toRectangle2D(shape.getPathIterator(null)) != null;
            } else {
                isRectangle2D = false;
            }
        }

        /**
         * Populate metadata as if this operation is based on one or more constituent operations.
         */
        void populateMetadata(OptimizedOutlineOperation... ops) {
            id = new LinkedList<>();
            for(OptimizedOutlineOperation op : ops) {
                if (op == null)
                    continue;

                if (bounds == null) {
                    bounds = new Rectangle2D.Double();
                    bounds.setFrame(op.bounds);
                } else {
                    bounds.add(op.bounds);
                }
                id.addAll(op.id);
                lineSegments += op.lineSegments;
                quadSegments += op.quadSegments;
                cubicSegments += op.cubicSegments;
                moveTos += op.moveTos;
            }

            if (ops.length == 1) {
                isRectangle2D = ops[0].isRectangle2D;
            } else {
                isRectangle2D = false;
            }
        }
    }

    protected final OutlineEngine delegateEngine;
    protected ExecutorService executor;
    protected List<Future<?>> prepareFutures = new LinkedList<>();
    protected int workerThreadCount;

    /**
     * @param workerThreadCount if this is 1 or less then no additional worker threads are used. (That is:
     *                          everything will be processed in the calling thread.) If this is two or
     *                          more than separate worker threads may be used for complex calculations.
     */
    public OptimizedAreaEngine2(int workerThreadCount) {
        this(new PlainAreaEngine(), workerThreadCount);
    }

    /**
     * @param engine the other engine that performs operations.
     * @param workerThreadCount if this is 1 or less then no additional worker threads are used. (That is:
     *                          everything will be processed in the calling thread.) If this is two or
     *                          more than separate worker threads may be used for complex calculations.
     */
    public OptimizedAreaEngine2(OutlineEngine engine, int workerThreadCount) {
        this.delegateEngine = engine;
        this.workerThreadCount = workerThreadCount;
        if (workerThreadCount <= 1) {
            executor = new InlineExecutor();
        } else {
            executor = Executors.newFixedThreadPool(workerThreadCount);
        }
    }

    @Override
    public Shape calculate(List<OutlineOperation> operationQueue) {
        flushFutures( (List) prepareFutures);
        removeClippedOperations(operationQueue);
        removeInitialNegativeOperations(operationQueue);
        preprocessOperationsUsingRectangleMask(operationQueue);

        Shape result = null;

        for (List<OptimizedOutlineOperation> operationsRun : getOperationRuns(operationQueue)) {
            OutlineOperation.Type type = operationsRun.get(0).type;
            removeRectangleEnclosedOperations(operationsRun);

            if (type == OutlineOperation.Type.ADD) {
                result = flushAdds(result, operationsRun);
            } else {
                // TODO: optimize other ops like how we optimized adds above
                for (OptimizedOutlineOperation op : operationsRun) {
                    if (type == OutlineOperation.Type.INTERSECT) {
                        // TODO: apply Clipper, or other clipping algorithm
                        if (result != null)
                            result = execute(OutlineOperation.Type.INTERSECT, result, op.shape);
                    } else if (type == OutlineOperation.Type.XOR) {
                        if (result == null) {
                            result = op.shape;
                        } else {
                            result = execute(OutlineOperation.Type.XOR, result, op.shape);
                        }
                    } else if (type == OutlineOperation.Type.SUBTRACT) {
                        if (result != null)
                            result = execute(OutlineOperation.Type.SUBTRACT, result, op.shape);
                    }
                }
            }
        }

        return result == null || ShapeUtils.isEmpty(result) ? null : result;
    }

    /**
     * Given a set of consecutive operations of the same type: if any represent a Rectangle2D, then we may remove either
     * the inner or outer operands (depending ont he operation type).
     */
    protected void removeRectangleEnclosedOperations(List<OptimizedOutlineOperation> operations) {
        boolean removeSmaller = operations.get(0).type == OutlineOperation.Type.ADD || operations.get(0).type == OutlineOperation.Type.SUBTRACT;
        boolean removeLarger = operations.get(0).type == OutlineOperation.Type.INTERSECT;

        if (!removeSmaller && !removeLarger)
            return;

        List<OptimizedOutlineOperation> toRemove = new LinkedList<>();

        int opIndex = 0;
        for (OptimizedOutlineOperation op : operations) {
            if (op.isRectangle2D) {
                Rectangle2D r = op.bounds;
                int otherOpIndex = 0;
                for (OptimizedOutlineOperation otherOp : operations) {
                    if (otherOp != op) {
                        if (op.bounds.equals(otherOp.bounds) && otherOp.isRectangle2D) {
                            // only remove one. If multiple rects are equal and we remove all of them: we've lost
                            // valuable data. It doesn't matter which one we choose:
                            toRemove.add(opIndex < otherOpIndex ? op : otherOp);
                        } else if (op.bounds.contains(otherOp.bounds)) {
                            if (removeSmaller) {
                                toRemove.add(otherOp);
                            } else if(removeLarger) {
                                toRemove.add(op);
                            }
                        }
                    }
                    otherOpIndex++;
                }
            }
            opIndex++;
        }

        if (!toRemove.isEmpty()) {
            operations.removeAll(toRemove);
        }
    }

    /**
     * Remove non-negative operations if they fall outside clipped bounds.
     */
    protected void removeClippedOperations(List<OutlineOperation> operations) {
        Rectangle2D[] clippingMask = new Rectangle2D[operations.size()];
        for(int a = 0; a < operations.size(); a++) {
            OptimizedOutlineOperation op = (OptimizedOutlineOperation) operations.get(a);
            if (op.type == OutlineOperation.Type.INTERSECT) {
                for(int b = 0; b<a; b++) {
                    OptimizedOutlineOperation prevOp = (OptimizedOutlineOperation) operations.get(b);
                    if (!prevOp.type.isNegative) {
                        if (clippingMask[b] == null) {
                            clippingMask[b] = new Rectangle2D.Double();
                            clippingMask[b].setFrame(prevOp.bounds);
                        }
                        Rectangle2D.intersect(clippingMask[b], op.bounds, clippingMask[b]);
                    }
                }
            }
        }

        Iterator<OutlineOperation> iter = operations.listIterator();
        int ctr = 0;
        while (iter.hasNext()) {
            OptimizedOutlineOperation op = (OptimizedOutlineOperation) iter.next();
            if (clippingMask[ctr] != null && clippingMask[ctr].isEmpty())
                iter.remove();
            ctr++;
        }
    }

    /**
     * Remove the operations at the head of this queue that involve removing data.
     */
    protected void removeInitialNegativeOperations(List<OutlineOperation> operations) {
        Iterator<OutlineOperation> iter = operations.listIterator();
        while (iter.hasNext()) {
            OptimizedOutlineOperation op = (OptimizedOutlineOperation) iter.next();
            if (op.type.isNegative) {
                iter.remove();
            } else {
                return;
            }
        }
    }

    /**
     * This creates a RectangleMask2D of all operations and performs and does a couple of things:
     * 1. If an XOR op is guaranteed to be an ADD operation: convert its type to ADD.
     * 2. If a negative space of (SUBTRACT or CLIP) falls outside our bounds, remove it.
     */
    protected void preprocessOperationsUsingRectangleMask(List<OutlineOperation> operations) {
        RectangleMask2D currentBounds = new RectangleMask2D();

        ListIterator<OutlineOperation> iter = operations.listIterator();
        while (iter.hasNext()) {
            OptimizedOutlineOperation op = (OptimizedOutlineOperation) iter.next();
            switch (op.type) {
                case SUBTRACT:
                    if (!currentBounds.intersects(op.bounds)) {
                        // we're subtracting something we can't possibly contain, so this
                        // op can be discarded:
                        iter.remove();
                    } else if (op.isRectangle2D) {
                        currentBounds.subtract(op.bounds.getX(), op.bounds.getY(), op.bounds.getWidth(), op.bounds.getHeight());
                    }
                    break;
                case XOR:
                    if (!currentBounds.intersects(op.bounds)) {
                        OptimizedOutlineOperation newOp = new OptimizedOutlineOperation(OutlineOperation.Type.ADD, op.shape);
                        newOp.populateMetadata(op);
                        iter.set(newOp);
                    }
                    currentBounds.add(op.bounds.getX(), op.bounds.getY(), op.bounds.getWidth(), op.bounds.getHeight());
                    break;
                case ADD:
                    currentBounds.add(op.bounds.getX(), op.bounds.getY(), op.bounds.getWidth(), op.bounds.getHeight());
                    break;
                case INTERSECT:
                    if (!currentBounds.intersects(op.bounds)) {
                        iter.remove();
                        while(iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        currentBounds.clear();
                    } else {
                        currentBounds.clip(op.bounds.getX(), op.bounds.getY(), op.bounds.getWidth(), op.bounds.getHeight());

                        // purge everything outside of currentBounds:

                        iter.previous();
                        int rewindCtr = 0;
                        while (iter.hasPrevious()) {
                            OptimizedOutlineOperation prevOp = (OptimizedOutlineOperation) iter.previous();
                            if (!op.type.isNegative && !currentBounds.intersects(prevOp.bounds)) {
                                iter.remove();
                            } else {
                                rewindCtr++;
                            }
                        }

                        // fast-forward our iterator back to where we left off:
                        while (rewindCtr >= 0) {
                            rewindCtr--;
                            iter.next();
                        }
                    }
                    break;
            }
        }
    }

    /**
     * Sort operations by the largest area to the smallest area. This is based on the operand's bounding box.
     * Of course it's possible a bounding box could be huge and the actual area is very small, but this is
     * the best rule of thumb we have so far.
     */
    static Comparator<OptimizedOutlineOperation> AREA_ORDER_COMPARATOR = new Comparator<OptimizedOutlineOperation>() {
        @Override
        public int compare(OptimizedOutlineOperation o1, OptimizedOutlineOperation o2) {
            double area1 = o1.bounds.getWidth() * o1.bounds.getHeight();
            double area2 = o2.bounds.getWidth() * o2.bounds.getHeight();

            int k = -Double.compare(area1, area2);
            if (k != 0)
                return k;
            return 0;
        }
    };

    private Shape flushAdds(Shape result, List<OptimizedOutlineOperation> addOperations) {
        List<OptimizedOutlineOperation> linearOperations = removeLinearOperations(addOperations);

        // Linear shapes are usually easier to churn through than quadratic & cubic shapes
        Shape polygonShapes = flushAdds2(result, linearOperations);
        if (polygonShapes != null && !ShapeUtils.isEmpty(polygonShapes)) {
            OptimizedOutlineOperation newOp = new OptimizedOutlineOperation(OutlineOperation.Type.ADD, polygonShapes);
            newOp.populateMetadata();
            addOperations.add(newOp);
        }

        result = flushAdds2(result, addOperations);
        return result;
    }

    private List<OptimizedOutlineOperation> removeLinearOperations(List<OptimizedOutlineOperation> addOperations) {
        List<OptimizedOutlineOperation> returnValue = null;
        Iterator<OptimizedOutlineOperation> iter = addOperations.iterator();
        while (iter.hasNext()) {
            OptimizedOutlineOperation op = iter.next();
            if (op.lineSegments > 0 && op.quadSegments == 0 && op.cubicSegments == 0) {
                if (returnValue == null)
                    returnValue = new LinkedList<>();
                returnValue.add(op);
                iter.remove();
            }
        }
        if (returnValue == null)
            return Collections.EMPTY_LIST;
        return returnValue;
    }

    /**
     * This is optimized by:
     * 1. Using multiple threads if possible. The Area class is not thread-safe, but if you have 100 additions to
     *    make you can merge each pair of shapes and end up with 50 additions. Then merge each of those pairs to
     *    get 25 additions, etc. A lot of the hard work in this case can be handled in separate threads.
     * 2. Merging the largest shapes first, and if our new Area contains the *bounds* of any operand (which
     *    is guaranteed to be a Rectangle2D): then we can discard that operand. (Sometimes this means we can even
     *    avoid constructing the operand's Area at all.)
     *
     * @param result the Area we're adding everything to.
     * @param addOperations
     * @return the new result, which may or may not be the same as the argument.
     */
    private Shape flushAdds2(Shape result, List<OptimizedOutlineOperation> addOperations) {
        class MergeShapesCallable implements Callable<OptimizedOutlineOperation> {
            OptimizedOutlineOperation op1, op2;
            Shape result;
            RectangleMask2D resultBounds;
            public MergeShapesCallable(Shape result, RectangleMask2D resultBounds, OptimizedOutlineOperation op1, OptimizedOutlineOperation op2) {
                this.op1 = op1;
                this.op2 = op2;
                this.result = result;
                this.resultBounds = resultBounds;
            }

            @Override
            public OptimizedOutlineOperation call() {
                if (resultBounds.contains(op1.bounds) && result.contains(op1.bounds)) {
                    op1 = null;
                }
                if (resultBounds.contains(op2.bounds) && result.contains(op2.bounds)) {
                    op2 = null;
                }

                if (op1 == null && op2 == null)
                    return null;

                if (op1 == null)
                    return op2;
                if (op2 == null)
                    return op1;

                Shape newShape = execute(OutlineOperation.Type.ADD, op1.shape, op2.shape);
                if (newShape == null) {
                    return null;
                }
                OptimizedOutlineOperation op = new OptimizedOutlineOperation(OutlineOperation.Type.ADD, newShape);
                op.populateMetadata(op1, op2);
                return op;
            }
        }

        Collections.sort(addOperations, AREA_ORDER_COMPARATOR);

        List<Future<OptimizedOutlineOperation>> futures = new LinkedList<>();
        while(!addOperations.isEmpty()) {
            // we only change result on this thread here:
            OptimizedOutlineOperation op = addOperations.remove(0);
            if (result == null || ShapeUtils.isEmpty(result)) {
                result = op.shape;
            } else {
                result = execute(OutlineOperation.Type.ADD, result, op.shape);
            }
//            RectangleMask2D resultBounds = new RectangleMask2D(result.getBounds2D());
//
//            // but everything else we can spin off into worker threads in a divide-and-conquer approach:
//            Iterator<OptimizedOutlineOperation> iter = addOperations.iterator();
//            while(iter.hasNext() && futures.size() < workerThreadCount * 2) {
//                OptimizedOutlineOperation op1 = iter.next();
//                iter.remove();
//                OptimizedOutlineOperation op2 = null;
//                if (iter.hasNext()) {
//                    op2 = iter.next();
//                    iter.remove();
//                    futures.add(executor.submit(new MergeShapesCallable(result, resultBounds, op1, op2)));
//                } else {
//                    futures.add(new InlineExecutor.FinishedFuture<>(op1));
//                }
//            }
//
//            addOperations.addAll(flushFutures(futures));

            // remove null elements:
//            iter = addOperations.iterator();
//            while (iter.hasNext()) {
//                if (iter.next() == null)
//                    iter.remove();
//            }
//
//            // now with some newly merged shapes: identify the new sorted order
//            Collections.sort(addOperations, AREA_ORDER_COMPARATOR);
        }
        return result;
    }

    protected Shape execute(OutlineOperation.Type type,Shape shape1, Shape shape2) {
        List<OutlineOperation> ops = new LinkedList<>();
        ops.add(delegateEngine.createOperation(OutlineOperation.Type.ADD, shape1));
        ops.add(delegateEngine.createOperation(type, shape2));
        return delegateEngine.calculate(ops);
    }

    protected <T> List<T> flushFutures(List<Future<T>> futures) {
        List<T> returnValue = new ArrayList<>(futures.size());
        Iterator<Future<T>> iter = futures.iterator();
        while(iter.hasNext()) {
            Future<T> future = iter.next();
            try {
                T value = future.get();
                if (value != null)
                    returnValue.add(value);
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            iter.remove();
        }
        return returnValue;
    }

    private List<List<OptimizedOutlineOperation>> getOperationRuns(List<OutlineOperation> allOperations) {
        List<List<OptimizedOutlineOperation>> returnValue = new LinkedList<>();

        while (!allOperations.isEmpty()) {
            List<OptimizedOutlineOperation> currentRun = new LinkedList<>();
            currentRun.add( (OptimizedOutlineOperation) allOperations.remove(0));
            OutlineOperation.Type runType = currentRun.get(0).type;
            while( !allOperations.isEmpty() && allOperations.get(0).type == runType) {
                currentRun.add( (OptimizedOutlineOperation) allOperations.remove(0));
            }
            returnValue.add(currentRun);
        }

        return returnValue;
    }

    @Override
    public OutlineOperation createOperation(OutlineOperation.Type type, Shape shape) {
        OptimizedOutlineOperation returnValue = new OptimizedOutlineOperation(type, shape);
        prepareFutures.add(executor.submit(new Runnable() {
            public void run() {
                returnValue.populateMetadata();
            }
        }));
        return returnValue;
    }

    @Override
    public String toString() {
        if (workerThreadCount <= 1 && delegateEngine instanceof PlainAreaEngine) {
            return getClass().getSimpleName();
        } else if (delegateEngine instanceof PlainAreaEngine) {
            return getClass().getSimpleName() + "[ workerThreadCount = " + workerThreadCount + "]";
        } else if (workerThreadCount == 1) {
            return getClass().getSimpleName() + "[ engine = "+delegateEngine+"]";
        }
        return getClass().getSimpleName() + "[ engine = "+delegateEngine+" workerThreadCount = " + workerThreadCount + "]";
    }

    public OutlineEngine getDelegateEngine() {
        return delegateEngine;
    }
}
