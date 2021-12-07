package com.pump.awt.geom.outline;

import com.pump.awt.geom.ShapeUtils;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;

public class OptimizedAreaEngine implements OutlineEngine {

    /**
     * This OutlineOperation collects a little metadata about the shape operand
     */
    static class OptimizedOutlineOperation extends OutlineOperation {
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

    protected ExecutorService executor;
    protected List<Future<?>> prepareFutures = new LinkedList<>();
    protected int workerThreadCount;

    /**
     * @param workerThreadCount if this is 1 or less then no additional worker threads are used. (That is:
     *                          everything will be processed in the calling thread.) If this is two or
     *                          more than separate worker threads may be used for complex calculations.
     */
    public OptimizedAreaEngine(int workerThreadCount) {
        this.workerThreadCount = workerThreadCount;
        if (workerThreadCount <= 1) {
            executor = new InlineExecutor();
        } else {
            executor = Executors.newFixedThreadPool(workerThreadCount);
        }
    }

    @Override
    public Area calculate(List<OutlineOperation> operationQueue) {
        flushFutures( (List) prepareFutures);
        removeClippedOperations(operationQueue);
        removeInitialNegativeOperations(operationQueue);
        preprocessOperationsUsingRectangleMask(operationQueue);

        Area result = new Area();

        for (List<OptimizedOutlineOperation> operationsRun : getOperationRuns(operationQueue)) {
            OutlineOperation.Type type = operationsRun.get(0).type;
            if (type == OutlineOperation.Type.ADD || type == OutlineOperation.Type.SUBTRACT)
                removeRectangleEnclosedOperations(operationsRun);

            if (type == OutlineOperation.Type.ADD) {
                result = flushAdds(result, operationsRun);
            } else {
                for (OptimizedOutlineOperation op : operationsRun) {
                    if (type == OutlineOperation.Type.INTERSECT) {
                        if (result != null)
                            result.intersect(new Area(op.shape));
                    } else if (type == OutlineOperation.Type.XOR) {
                        if (result == null) {
                            result = new Area(op.shape);
                        } else {
                            result.exclusiveOr(new Area(op.shape));
                        }
                    } else if (type == OutlineOperation.Type.SUBTRACT) {
                        if (result != null)
                            result.subtract(new Area(op.shape));
                    }
                }
            }
        }

        return result == null || result.isEmpty() ? null : result;
    }

    /**
     * Given a set of consecutive operations: if any represent a Rectangle2D, then we can remove
     * any inner operands that are contained inside that Rectangle2D. This only applies to ADD and SUBTRACT
     * operations.
     */
    private void removeRectangleEnclosedOperations(List<OptimizedOutlineOperation> operations) {
        boolean loop = true;
        while (loop) {
            loop = false;
            scan : for(OptimizedOutlineOperation op : operations) {
                if (op.isRectangle2D) {
                    Rectangle2D r = op.bounds;
                    Iterator<OptimizedOutlineOperation> iter = operations.iterator();
                    while (iter.hasNext()) {
                        OptimizedOutlineOperation otherOp = iter.next();
                        if (otherOp != op) {
                            if (op.bounds.contains(otherOp.bounds)) {
                                iter.remove();
                                loop = true;
                                break scan;
                            }
                        }
                    }
                }
            }
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

    private Area flushAdds(Area result, List<OptimizedOutlineOperation> addOperations) {
        List<OptimizedOutlineOperation> linearOperations = removeLinearOperations(addOperations);

        // Linear shapes are usually easier to churn through than quadratic & cubic shapes
        Area polygonShapes = flushAdds2(new Area(), linearOperations);
        if (!polygonShapes.isEmpty()) {
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
    private Area flushAdds2(Area result, List<OptimizedOutlineOperation> addOperations) {
        class MergeShapesCallable implements Callable<OptimizedOutlineOperation> {
            OptimizedOutlineOperation op1, op2;
            Area result;
            RectangleMask2D resultBounds;
            public MergeShapesCallable(Area result, RectangleMask2D resultBounds, OptimizedOutlineOperation op1, OptimizedOutlineOperation op2) {
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

                Area area1 = new Area(op1.shape);
                Area area2 = new Area(op2.shape);
                area1.add(area2);
                OptimizedOutlineOperation op = new OptimizedOutlineOperation(OutlineOperation.Type.ADD, area1);
                op.populateMetadata(op1, op2);
                return op;
            }
        }

        Collections.sort(addOperations, AREA_ORDER_COMPARATOR);

        List<Future<OptimizedOutlineOperation>> futures = new LinkedList<>();
        while(!addOperations.isEmpty()) {
            // we only change result on this thread here:
            OptimizedOutlineOperation op = addOperations.remove(0);
            if (result == null || result.isEmpty()) {
                // a very small optimization:
                // calling Area.add(..) ALWAYS fires off some complex calculations. If the LHS
                // Area starts out empty: there's no need to calculate anything.
                result = new Area(op.shape);
            } else {
                result.add(new Area(op.shape));
            }
            RectangleMask2D resultBounds = new RectangleMask2D(result.getBounds2D());

            // but everything else we can spin off into worker threads in a divide-and-conquer approach:
            Iterator<OptimizedOutlineOperation> iter = addOperations.iterator();
            while(iter.hasNext() && futures.size() < workerThreadCount * 2) {
                OptimizedOutlineOperation op1 = iter.next();
                iter.remove();
                OptimizedOutlineOperation op2 = null;
                if (iter.hasNext()) {
                    op2 = iter.next();
                    iter.remove();
                    futures.add(executor.submit(new MergeShapesCallable(result, resultBounds, op1, op2)));
                } else {
                    futures.add(new InlineExecutor.FinishedFuture<>(op1));
                }
            }

            addOperations.addAll(flushFutures(futures));

            // now with some newly merged shapes: identify the new sorted order
            Collections.sort(addOperations, AREA_ORDER_COMPARATOR);
        }
        return result;
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
        if (workerThreadCount <= 1) {
            return getClass().getSimpleName();
        } else {
            return getClass().getSimpleName()+"["+workerThreadCount+"]";
        }
    }
}
