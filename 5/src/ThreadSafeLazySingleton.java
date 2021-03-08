public class ThreadSafeLazySingleton {
    private static ThreadSafeLazySingleton INSTANCE;
    private ThreadSafeLazySingleton() {}
    public synchronized static ThreadSafeLazySingleton getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ThreadSafeLazySingleton();
        return INSTANCE;
    }
}
