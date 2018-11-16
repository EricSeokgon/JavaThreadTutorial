package CurrentThread;

class CatchAllThreadExceptionHandler implements Thread.UncaughtExceptionHandler {
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Caught  Exception from  Thread:" + t.getName());
    }
}

public class uncaught  {
    public static void main(String[] args) {
        CatchAllThreadExceptionHandler handler = new CatchAllThreadExceptionHandler();

        // Set an uncaught exception handler for main thread
        Thread.currentThread().setUncaughtExceptionHandler(handler);

        // Throw an exception
        throw new RuntimeException();
    }
}
