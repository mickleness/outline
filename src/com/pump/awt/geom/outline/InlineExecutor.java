package com.pump.awt.geom.outline;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;

/**
 * This executes every Runnable/Callable immediately. This object
 * uses no additional threads. Attempts to apply timeouts are ignored
 * because this Executor has no way of applying/enforcing timeouts.
 */
class InlineExecutor implements ExecutorService {

    static class FinishedFuture<T> implements Future<T> {

        private final T value;

        FinishedFuture(T value) {
            this.value = value;
        }

        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return false;
        }

        @Override
        public boolean isCancelled() {
            return false;
        }

        @Override
        public boolean isDone() {
            return true;
        }

        @Override
        public T get() throws InterruptedException, ExecutionException {
            return value;
        }

        @Override
        public T get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return value;
        }
    }

    boolean isShutdown = false;

    @Override
    public void shutdown() {
        isShutdown = true;
    }

    @Override
    public List<Runnable> shutdownNow() {
        isShutdown = true;
        return Collections.EMPTY_LIST;
    }

    @Override
    public boolean isShutdown() {
        return isShutdown;
    }

    @Override
    public boolean isTerminated() {
        return isShutdown;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        return true;
    }

    @Override
    public <T> Future<T> submit(Callable<T> task) {
        T returnValue = null;
        try {
            returnValue = task.call();
        } catch(RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return new FinishedFuture(returnValue);
    }

    @Override
    public <T> Future<T> submit(Runnable task, T result) {
        task.run();
        return new FinishedFuture(result);
    }

    @Override
    public Future<?> submit(Runnable task) {
        task.run();
        return new FinishedFuture(Void.TYPE);
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException {
        List<Future<T>> returnValue = new ArrayList<>(tasks.size());
        for(Callable<T> task : tasks) {
            returnValue.add(submit(task));
        }
        return returnValue;
    }

    @Override
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException {
        return invokeAll(tasks);
    }

    /**
     * This method throws an UnsupportedOperationException.
     */
    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException {
        throw new UnsupportedOperationException();
    }

    /**
     * This method throws an UnsupportedOperationException.
     */
    @Override
    public <T> T invokeAny(Collection<? extends Callable<T>> tasks, long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void execute(Runnable command) {
        command.run();
    }
}
