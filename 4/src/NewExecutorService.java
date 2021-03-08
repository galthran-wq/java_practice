import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

class NewExecutorService extends AbstractExecutorService implements ExecutorService {
    private final int threadsAmount;
    private boolean isShutdown;
    private final List<Thread> threads;

    public NewExecutorService(int threadsAmount) {
        this.threadsAmount = threadsAmount;
        this.threads = new ArrayList<>();
    }

    @Override
    public void shutdown() {
        isShutdown = true;
        threads.forEach(Thread::interrupt);
    }

    @Override
    public boolean isShutdown() {
        return isShutdown;
    }

    @Override
    public List<Runnable> shutdownNow() {
        List<Runnable> list = threads.stream().map(thread -> (Runnable) thread).collect(Collectors.toList());
        this.shutdown();
        return list;
    }

    @Override
    public Future<?> submit(Runnable task) {
        if (task == null) throw new NullPointerException();
        RunnableFuture<Void> futureTask = new FutureTask<>(task, null);
        execute(futureTask);
        return futureTask;
    }

    @Override
    public void execute(Runnable command) {
        if (command == null)
            throw new NullPointerException();
        if (threads.size() == threadsAmount)
            throw new IllegalArgumentException("The maximum amount of threads is reached");
        isShutdown = false;

        Thread thread = new Thread(command);
        threads.add(thread);
        thread.start();
    }

    @Override
    public boolean isTerminated() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }
}