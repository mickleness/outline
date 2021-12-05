package com.pump.awt.geom.outline;

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
     * Returns a high precision bounding box of the specified PathIterator.
     * <p>
     * This method provides a basic facility for implementors of the {@link Shape} interface to
     * implement support for the {@link Shape#getBounds2D()} method.
     * </p>
     * <p>
     * This is copied and pasted from a pull request for JDK 8176501
     * (https://github.com/openjdk/jdk/pull/6227).
     * </p>
     *
     * TODO: If the PR referenced above if accepted: remove this code and invoke the
     * same method in Path2D instead. (Also remove the "accumulateX" methods below.)
     *
     * @return an instance of {@code Rectangle2D} that is a high-precision bounding box of the
     *         {@code PathIterator}.
     * @see Shape#getBounds2D()
     */
    public static Rectangle2D getBounds2D(final PathIterator pi) {
        final double[] coeff = new double[4];
        final double[] deriv_coeff = new double[3];

        final double[] coords = new double[6];

        // bounds are stored as {leftX, rightX, topY, bottomY}
        double[] bounds = null;
        double lastX = 0.0;
        double lastY = 0.0;
        double endX = 0.0;
        double endY = 0.0;

        for (; !pi.isDone(); pi.next()) {
            final int type = pi.currentSegment(coords);
            switch (type) {
                case PathIterator.SEG_MOVETO:
                    if (bounds == null) {
                        bounds = new double[] { coords[0], coords[0], coords[1], coords[1] };
                    }
                    endX = coords[0];
                    endY = coords[1];
                    break;
                case PathIterator.SEG_LINETO:
                    endX = coords[0];
                    endY = coords[1];
                    break;
                case PathIterator.SEG_QUADTO:
                    endX = coords[2];
                    endY = coords[3];
                    break;
                case PathIterator.SEG_CUBICTO:
                    endX = coords[4];
                    endY = coords[5];
                    break;
                case PathIterator.SEG_CLOSE:
                default:
                    continue;
            }

            if (endX < bounds[0]) bounds[0] = endX;
            if (endX > bounds[1]) bounds[1] = endX;
            if (endY < bounds[2]) bounds[2] = endY;
            if (endY > bounds[3]) bounds[3] = endY;

            switch (type) {
                case PathIterator.SEG_QUADTO:
                    accumulateExtremaBoundsForQuad(bounds, 0, lastX, coords[0], coords[2], coeff, deriv_coeff);
                    accumulateExtremaBoundsForQuad(bounds, 2, lastY, coords[1], coords[3], coeff, deriv_coeff);
                    break;
                case PathIterator.SEG_CUBICTO:
                    accumulateExtremaBoundsForCubic(bounds, 0, lastX, coords[0], coords[2], coords[4], coeff, deriv_coeff);
                    accumulateExtremaBoundsForCubic(bounds, 2, lastY, coords[1], coords[3], coords[5], coeff, deriv_coeff);
                    break;
                default:
                    break;
            }

            lastX = endX;
            lastY = endY;
        }
        if (bounds != null) {
            return new Rectangle2D.Double(bounds[0], bounds[2], bounds[1] - bounds[0], bounds[3] - bounds[2]);
        }

        // there's room to debate what should happen here, but historically we return a zeroed
        // out rectangle here. So for backwards compatibility let's keep doing that:
        return new Rectangle2D.Double();
    }

    /**
     * Accumulate the quadratic extrema into the pre-existing bounding array.
     * <p>
     * This method focuses on one dimension at a time, so to get both the x and y
     * dimensions you'll need to call this method twice.
     * </p>
     * <p>
     * Whenever we have to examine cubic or quadratic extrema that change our bounding
     * box: we run the risk of machine error that may produce a box that is slightly
     * too small. But the contract of {@link Shape#getBounds2D()} says we should err
     * on the side of being too large. So to address this: we'll apply a margin based
     * on the upper limit of numerical error caused by the polynomial evaluation (horner
     * scheme).
     * </p>
     *
     * @param bounds the bounds to update, which are expressed as: { minX, maxX }
     * @param boundsOffset the index in boundsof the minimum value
     * @param x1 the starting value of the bezier curve where t = 0.0
     * @param ctrlX the control value of the bezier curve
     * @param x2 the ending value of the bezier curve where t = 1.0
     * @param coeff an array of at least 3 elements that will be overwritten and reused
     * @param deriv_coeff an array of at least 2 elements that will be overwritten and reused
     */
    private static void accumulateExtremaBoundsForQuad(double[] bounds, int boundsOffset, double x1, double ctrlX, double x2, double[] coeff, double[] deriv_coeff) {
        if (ctrlX < bounds[boundsOffset] ||
                ctrlX > bounds[boundsOffset + 1]) {

            final double dx21 = ctrlX - x1;
            coeff[2] = (x2 - ctrlX) - dx21;  // A = P3 - P0 - 2 P2
            coeff[1] = 2.0 * dx21;           // B = 2 (P2 - P1)
            coeff[0] = x1;                   // C = P1

            deriv_coeff[0] = coeff[1];
            deriv_coeff[1] = 2.0 * coeff[2];

            final double t = -deriv_coeff[0] / deriv_coeff[1];
            if (t > 0.0 && t < 1.0) {
                final double v = coeff[0] + t * (coeff[1] + t * coeff[2]);

                // error condition = sum ( abs (coeff) ):
                final double margin = Math.ulp(Math.abs(coeff[0])
                        + Math.abs(coeff[1]) + Math.abs(coeff[2]));

                if (v - margin < bounds[boundsOffset]) {
                    bounds[boundsOffset] = v - margin;
                }
                if (v + margin > bounds[boundsOffset + 1]) {
                    bounds[boundsOffset + 1] = v + margin;
                }
            }
        }
    }

    /**
     * Accumulate the cubic extrema into the pre-existing bounding array.
     * <p>
     * This method focuses on one dimension at a time, so to get both the x and y
     * dimensions you'll need to call this method twice.
     * </p>
     * <p>
     * Whenever we have to examine cubic or quadratic extrema that change our bounding
     * box: we run the risk of machine error that may produce a box that is slightly
     * too small. But the contract of {@link Shape#getBounds2D()} says we should err
     * on the side of being too large. So to address this: we'll apply a margin based
     * on the upper limit of numerical error caused by the polynomial evaluation (horner
     * scheme).
     * </p>
     *
     * @param bounds the bounds to update, which are expressed as: { minX, maxX }
     * @param boundsOffset the index in boundsof the minimum value
     * @param x1 the starting value of the bezier curve where t = 0.0
     * @param ctrlX1 the first control value of the bezier curve
     * @param ctrlX1 the second control value of the bezier curve
     * @param x2 the ending value of the bezier curve where t = 1.0
     * @param coeff an array of at least 3 elements that will be overwritten and reused
     * @param deriv_coeff an array of at least 2 elements that will be overwritten and reused
     */
    private static void accumulateExtremaBoundsForCubic(double[] bounds, int boundsOffset, double x1, double ctrlX1, double ctrlX2, double x2, double[] coeff, double[] deriv_coeff) {
        if (ctrlX1 < bounds[boundsOffset] ||
                ctrlX1 > bounds[boundsOffset + 1]) {
            final double dx32 = 3.0 * (ctrlX2 - ctrlX1);
            final double dx21 = 3.0 * (ctrlX1 - x1);
            coeff[3] = (x2 - x1) - dx32;  // A = P3 - P0 - 3 (P2 - P1) = (P3 - P0) + 3 (P1 - P2)
            coeff[2] = (dx32 - dx21);         // B = 3 (P2 - P1) - 3(P1 - P0) = 3 (P2 + P0) - 6 P1
            coeff[1] = dx21;                  // C = 3 (P1 - P0)
            coeff[0] = x1;                 // D = P0

            deriv_coeff[0] = coeff[1];
            deriv_coeff[1] = 2.0 * coeff[2];
            deriv_coeff[2] = 3.0 * coeff[3];

            // reuse this array, give it a new name for readability:
            final double[] tExtrema = deriv_coeff;

            // solveQuadratic should be improved to get correct t extrema (1 ulp):
            final int tExtremaCount = QuadCurve2D.solveQuadratic(deriv_coeff, tExtrema);
            if (tExtremaCount > 0) {
                // error condition = sum ( abs (coeff) ):
                final double margin = Math.ulp(Math.abs(coeff[0])
                        + Math.abs(coeff[1]) + Math.abs(coeff[2])
                        + Math.abs(coeff[3]));

                for (int i = 0; i < tExtremaCount; i++) {
                    final double t = tExtrema[i];
                    if (t > 0.0 && t < 1.0) {
                        final double v = coeff[0] + t * (coeff[1] + t * (coeff[2] + t * coeff[3]));
                        if (v - margin < bounds[boundsOffset]) {
                            bounds[boundsOffset] = v - margin;
                        }
                        if (v + margin > bounds[boundsOffset + 1]) {
                            bounds[boundsOffset + 1] = v + margin;
                        }
                    }
                }
            }
        }
    }

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
            bounds = getBounds2D(pi2);
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
    public Area flush(Shape body, List<OutlineOperation> operationQueue) {
        flushFutures( (List) prepareFutures);

        Area result = body == null ? new Area() : new Area(body);

        result = removeRedundanciesBasedOnBoundingBoxes(result, operationQueue);

        for (List<OptimizedOutlineOperation> operationsRun : getOperationRuns(operationQueue)) {
            if (operationsRun.get(0).type == OutlineOperation.Type.ADD) {
                result = flushAdds(result, operationsRun);
            } else {
                for (OptimizedOutlineOperation op : operationsRun) {
                    if (op.type == OutlineOperation.Type.INTERSECT) {
                        if (result != null)
                            result.intersect(new Area(op.shape));
                    } else if (op.type == OutlineOperation.Type.XOR) {
                        if (result == null) {
                            result = new Area(op.shape);
                        } else {
                            result.exclusiveOr(new Area(op.shape));
                        }
                    } else if (op.type == OutlineOperation.Type.SUBTRACT) {
                        if (result != null)
                            result.subtract(new Area(op.shape));
                    }
                }
            }
        }

        return result == null || result.isEmpty() ? null : result;
    }

    /**
     * @return a new starting Area, which may be null. For ex: this method may return
     *          null if an intersection operation is applied which makes the original
     *          starting area obsolete.
     */
    protected Area removeRedundanciesBasedOnBoundingBoxes(Area startingArea, List<OutlineOperation> operations) {
        Rectangle2D startingBounds = startingArea == null || startingArea.isEmpty() ? null : startingArea.getBounds2D();
        RectangleMask2D currentBounds = startingBounds == null ? null : new RectangleMask2D(startingBounds);

        // TODO: (separate method) rearrange clipping runs to smallest, calculate bounds intersection first,
        // maybe special treatment for rectangles and propagating clipping backwards to predecessors

        // TODO: check if op IS rectangle. for ADD and SUBTRACT: can it consume any predecessor?

        // TODO: do similar check with Areas

        ListIterator<OutlineOperation> iter = operations.listIterator();
        while (iter.hasNext()) {
            OptimizedOutlineOperation op = (OptimizedOutlineOperation) iter.next();
            switch (op.type) {
                case SUBTRACT:
                    boolean isNullOp;
                    if (currentBounds == null) {
                        isNullOp = true;
                    } else {
                        isNullOp = !currentBounds.intersects(op.bounds);
                    }
                    if (isNullOp) {
                        // we're subtracting something we can't possibly contain, so this
                        // op can be discarded:
                        iter.remove();
                    }
                    break;
                case ADD:
                case XOR:
                    // TODO: for xor (only): offer to convert to ADD

                    // grow our bounds:
                    if (currentBounds == null) {
                        currentBounds = new RectangleMask2D(op.bounds);
                    } else {
                        currentBounds.add(op.bounds.getX(), op.bounds.getY(), op.bounds.getWidth(), op.bounds.getHeight());
                    }
                    break;
                case INTERSECT:
                    if (currentBounds == null || currentBounds.isEmpty() ||
                            !currentBounds.intersects(op.bounds.getX(), op.bounds.getY(), op.bounds.getWidth(), op.bounds.getHeight())) {
                        // everything we've done so far is outside of this intersection,
                        // so EVERYTHING (including this op) can go:
                        currentBounds = null;
                        startingArea = null;
                        startingBounds = null;
                        iter.remove();
                        while (iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                    } else {
                        currentBounds.clip(op.bounds.getX(), op.bounds.getY(), op.bounds.getWidth(), op.bounds.getHeight());

                        // can we discard anything?

                        if (startingBounds != null && !new RectangleMask2D(startingBounds).intersects(op.bounds)) {
                            startingArea = null;
                            startingBounds = null;
                        }

                        iter.previous();
                        int rewindCtr = 0;
                        while (iter.hasPrevious()) {
                            OptimizedOutlineOperation prevOp = (OptimizedOutlineOperation) iter.previous();
                            if (!new RectangleMask2D(prevOp.bounds).intersects(op.bounds)) {
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
                default:
                    throw new IllegalStateException();
            }
        }
        return startingArea;
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
