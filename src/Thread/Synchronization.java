package Thread;

public class Synchronization {
    public synchronized void someMethod_1() {
        // only one thread can execute here at a time
    }

    public void someMethod_11() {
        synchronized (this) {
            // only one thread can execute here at a time
        }
    }

    public void someMethod_12() {
        // multiple threads can execute here at a time
        synchronized (this) {
            // only one thread can execute here at a time
        }
        // multiple threads can execute here at a time
    }

    public static synchronized void someMethod_2() {
        // only one thread can execute here at a time
    }

    public static void someMethod_21() {
        synchronized (Synchronization.class) {
            // only one thread can execute here at a time
        }
    }

    public static void someMethod_22() {
        // multiple threads can execute here at a time
        synchronized (Synchronization.class) {
            // only one thread can execute here at a time
        }
        // multiple threads can execute here at a time
    }
}


