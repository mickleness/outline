package com.pump.awt.geom.outline;

import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.util.*;
import java.util.List;
import java.util.concurrent.*;

public class OptimizedAreaEngine implements OutlineEngine {
    /**
     * TODO: remove this method if Path2D offers a static getBounds2D(PathIterator) method someday.
     */
    private static Rectangle2D getBounds2D(PathIterator pi) {
        double[] coords = new double[6];
        Rectangle2D r = null;
        for(; !pi.isDone(); pi.next()) {
            int k = pi.currentSegment(coords);
            if (k == PathIterator.SEG_MOVETO) {
                if (r == null) {
                    r = new Rectangle2D.Double(coords[0], coords[1], 0, 0);
                } else {
                    r.add(coords[0], coords[1]);
                }
            } else if (k == PathIterator.SEG_LINETO) {
                r.add(coords[0], coords[1]);
            } else if (k == PathIterator.SEG_QUADTO) {
                r.add(coords[0], coords[1]);
                r.add(coords[2], coords[3]);
            } else if (k == PathIterator.SEG_CUBICTO) {
                r.add(coords[0], coords[1]);
                r.add(coords[2], coords[3]);
                r.add(coords[4], coords[5]);
            }
        }
        return r;
    }

    /**
     * This OutlineOperation collects a little metadata about the shape operand
     */
    static class OptimizedOutlineOperation extends OutlineOperation {
        static long idCtr = 0;

        Collection<String> id = Collections.singleton(Long.toString(idCtr++));

        Rectangle2D bounds;

        int lineSegments = 0;

        int quadSegments = 0;

        int cubicSegments = 0;

        /**
         * The number of SEG_MOVETO segments (aka "the number of subpaths")
         */
        int moveTos = 0;

        public OptimizedOutlineOperation(Type type, Shape shape) {
            super(type, shape);
        }

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

    ExecutorService executor;
    List<Future<?>> prepareFutures = new LinkedList<>();
    int workerThreadCount;

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
    public Shape flush(Shape body, List<OutlineOperation> operationQueue) {
        flushFutures( (List) prepareFutures);

        Area result = body == null ? new Area() : new Area(body);

        for(List<OptimizedOutlineOperation> operationsRun : getOperationRuns(operationQueue)) {
            if (operationsRun.get(0).type == OutlineOperation.Type.ADD) {
                result = flushAdds(result, operationsRun);
            } else {
                for(OptimizedOutlineOperation op : operationsRun) {
                    if (op.type == OutlineOperation.Type.INTERSECT) {
                        result.intersect(new Area(op.shape));
                    } else if (op.type == OutlineOperation.Type.XOR) {
                        result.exclusiveOr(new Area(op.shape));
                    } else if (op.type == OutlineOperation.Type.SUBTRACT) {
                        result.subtract(new Area(op.shape));
                    }
                }
            }
        }

        return result.isEmpty() ? null : result;
    }

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

    private Area flushAdds(Area result, List<OptimizedOutlineOperation> operationsRun) {
        List<OptimizedOutlineOperation> linearOperations = removeLinearOperations(operationsRun);
        result = flushAdds2(result, linearOperations);
        result = flushAdds2(result, operationsRun);
        return result;
    }

    private List<OptimizedOutlineOperation> removeLinearOperations(List<OptimizedOutlineOperation> operations) {
        List<OptimizedOutlineOperation> returnValue = null;
        Iterator<OptimizedOutlineOperation> iter = operations.iterator();
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

    private Area flushAdds2(Area result, List<OptimizedOutlineOperation> operationsRun) {
        class AddRunnable implements Callable<OptimizedOutlineOperation> {
            OptimizedOutlineOperation op1, op2;
            Area result;
            public AddRunnable(Area result, OptimizedOutlineOperation op1, OptimizedOutlineOperation op2) {
                this.op1 = op1;
                this.op2 = op2;
                this.result = result;
            }

            @Override
            public OptimizedOutlineOperation call() {
                if (result.getBounds2D().contains(op1.bounds) && result.contains(op1.bounds)) {
                    op1 = null;
                }
                if (result.getBounds2D().contains(op2.bounds) && result.contains(op2.bounds)) {
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

        Collections.sort(operationsRun, AREA_ORDER_COMPARATOR);

        List<Future<OptimizedOutlineOperation>> futures = new LinkedList<>();
        while(!operationsRun.isEmpty()) {
            OptimizedOutlineOperation op = operationsRun.remove(0);
            if (result.isEmpty()) {
                result = new Area(op.shape);
            } else {
                result.add(new Area(op.shape));
            }

            Iterator<OptimizedOutlineOperation> iter = operationsRun.iterator();
            while(iter.hasNext() && futures.size() < workerThreadCount * 2) {
                OptimizedOutlineOperation op1 = iter.next();
                iter.remove();
                OptimizedOutlineOperation op2 = null;
                if (iter.hasNext()) {
                    op2 = iter.next();
                    iter.remove();
                    futures.add(executor.submit(new AddRunnable(result, op1, op2)));
                } else {
                    futures.add(new InlineExecutor.FinishedFuture<>(op1));
                }
            }

            operationsRun.addAll(flushFutures(futures));
            Collections.sort(operationsRun, AREA_ORDER_COMPARATOR);
        }
        return result;
    }

    private <T> List<T> flushFutures(List<Future<T>> futures) {
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


