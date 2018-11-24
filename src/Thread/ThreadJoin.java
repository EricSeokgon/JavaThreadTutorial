package Thread;

public class ThreadJoin {
    public static void main(String[] args) {
        Thread t1 = new Thread(ThreadJoin::print);
        t1.start();//from  ww  w .j  ava  2  s. c o  m
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
