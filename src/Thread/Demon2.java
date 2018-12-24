package Thread;

public class Demon2 {
    public static void main(String[] args) {
        Thread t = new Thread(Demon2::print);
        t.setDaemon(false);
        t.start();
        System.out.println("Exiting main  method");
    }
    public static void print() {
        int counter = 1;
        while (true) {
            try {
                System.out.println("Counter:" + counter++);
                Thread.sleep(2000); // sleep for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
