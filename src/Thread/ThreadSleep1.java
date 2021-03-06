package Thread;

public class ThreadSleep1 {
    public static void main(String[] args) {
        try {
            System.out.println("sleep for 5  seconds.");
            Thread.sleep(5000);
            // The "main" thread will sleep
            System.out.println("woke up.");
        } catch (InterruptedException e) {
            System.out.println("interrupted.");
        }
        System.out.println("done.");
    }
}
