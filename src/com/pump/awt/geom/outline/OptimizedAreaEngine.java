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
        Rectangle2D bounds;

        /**
         * The minimum order of a segment that's not a MOVETO or CLOSE. For ex: if this is 1 then the
         * shape includes at least one line. If this is 3 then this shape consists ONLY of cubic
         * segments.
         */
        int minOrder = -1;

        /**
         * The maximum order of a segment that's not a MOVETO or CLOSE. For ex: if this is 1 then the
         * shape is ALL lines. If this is 3 then the shape includes at least one cubic. If this is
         * -1 then this shape contains no linear, quadratic or cubic data.
         */
        int maxOrder = -1;

        /**
         * The number of SEG_MOVETO segments (aka "the number of subpaths")
         */
        int moveTos = 0;

        /**
         * The winding rule of this shape.
         */
        int windingRule;

        public OptimizedOutlineOperation(Type type, Shape shape) {
            super(type, shape);
        }

        public void populateMetadata() {
            PathIterator pi = shape.getPathIterator(null);
            windingRule = pi.getWindingRule();

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
                        minOrder = 1;
                        if (maxOrder == -1)
                            maxOrder = 1;
                    } else if(segmentType == PathIterator.SEG_QUADTO) {
                        if (minOrder == -1 || 2 < minOrder) {
                            minOrder = 2;
                        }
                        if (maxOrder == -1 || 2 > maxOrder)
                            maxOrder = 2;
                    } else if(segmentType == PathIterator.SEG_CUBICTO) {
                        if (minOrder == -1) {
                            minOrder = 3;
                        }
                        maxOrder = 3;
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
    }

    ExecutorService executor;
    List<Future<?>> prepareFutures = new LinkedList<>();

    public OptimizedAreaEngine(int threads) {
        if (threads <= 1) {
            executor = new InlineExecutor();
        } else {
            executor = Executors.newFixedThreadPool(threads - 1);
        }
    }

    @Override
    public Shape flush(Shape body, List<OutlineOperation> operationQueue) {
        Iterator<Future<?>> prepareFutureIter = prepareFutures.iterator();
        while(prepareFutureIter.hasNext()) {
            Future<?> future = prepareFutureIter.next();
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new RuntimeException(e);
            }
            prepareFutureIter.remove();
        }

        Area result = body == null ? new Area() : new Area(body);

        for(List<OptimizedOutlineOperation> operationsRun : getOperationRuns(operationQueue)) {
            if (operationsRun.get(0).type == OutlineOperation.Type.ADD) {
                flushAdds(result, operationsRun);
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

    private void flushAdds(Area result, List<OptimizedOutlineOperation> operationsRun) {
        while(!operationsRun.isEmpty()) {
            OptimizedOutlineOperation op;
            if (result.isEmpty()) {
                op = getLargestOperation(operationsRun, new int[] { 3, 2, 1});
            } else {
                op = getLargestOverlap(result.getBounds2D(), operationsRun, new int[] { 3, 2, 1});
            }
            if (!result.contains(op.bounds)) {
                result.add(new Area(op.shape));
            }
            operationsRun.remove(op);
        }
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

    private OptimizedOutlineOperation getLargestOverlap(Rectangle2D targetBounds, List<OptimizedOutlineOperation> operations, int[] prefMaxOrder) {
        Rectangle2D scratch = new Rectangle2D.Double();
        for(int maxOrder : prefMaxOrder) {
            double maxArea = -1;
            OptimizedOutlineOperation returnValue = null;
            for (OptimizedOutlineOperation op : operations) {
                if (op.maxOrder == maxOrder) {
                    scratch.setFrame(op.bounds);
                    // TODO: don't create Rectangle2D here, account for negative areas better
                    Rectangle2D overlap = scratch.createIntersection(targetBounds);
                    double area = Math.max(0, overlap.getWidth() * overlap.getHeight());
                    if (area > maxArea) {
                        maxArea = area;
                        returnValue = op;
                    }
                }
            }
            if (returnValue != null)
                return returnValue;
        }
        // we shouldn't reach this point
        return (OptimizedOutlineOperation) operations.get(0);
    }

    private OptimizedOutlineOperation getLargestOperation(List<OptimizedOutlineOperation> operations, int[] prefMaxOrder) {
        for(int maxOrder : prefMaxOrder) {
            double maxArea = -1;
            OptimizedOutlineOperation returnValue = null;
            for (OptimizedOutlineOperation op : operations) {
                if (op.maxOrder == maxOrder) {
                    double area = op.bounds.getWidth() * op.bounds.getHeight();
                    if (area > maxArea) {
                        maxArea = area;
                        returnValue = op;
                    }
                }
            }
            if (returnValue != null)
                return returnValue;
        }
        // we shouldn't reach this point
        return operations.get(0);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
