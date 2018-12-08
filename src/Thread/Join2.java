package Thread;

public class Join2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(Join2::print);
        t1.start();
        try {
            t1.join();
            // "main" thread waits until t1 is terminated
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done.");
    }

    public static void print() {
        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Counter: " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
