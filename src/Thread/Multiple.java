package Thread;

public class Multiple {
    public static void main(String[] args) {
        // Create two Thread objects
        Thread t1 = new Thread(Multiple::print);
        Thread t2 = new Thread(Multiple::print);
        Thread t3 = new Thread(Multiple::print);
        Thread t4 = new Thread(Multiple::print);

        // Start both threads
        t1.start();
        //t2.start();
        //t3.start();
        //t4.start();
    }

    private static void print() {
        for (int i = 1; i <= 500000; i++) {
            System.out.println(i);
        }
    }
}
