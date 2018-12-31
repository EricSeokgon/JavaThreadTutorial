package Thread;

public class Interrupt2 {
    public static void main(String[] args) {
        Thread t = new Thread(Interrupt2::run);
        t.start();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }

    public static void run() {
        int counter = 0;
        while (!Thread.interrupted()) {
            counter++;
        }
        System.out.println("Counter:" + counter);

    }

}
