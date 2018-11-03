package Thread;

public class Example2 {
    private static int myValue = 1;

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            while (true) {
                updateBalance();
            }
        });
        t.start();
        t = new Thread(() -> {
            while (true) {
                monitorBalance();
            }
        });
        t.start();
    }

    public static  void updateBalance() {
        System.out.println("start:" + myValue);
        myValue = myValue + 1;
        myValue = myValue - 1;
        System.out.println("end:" + myValue);
    }

    public static synchronized void monitorBalance() {
        int b = myValue;
        if (b != 1) {
            System.out.println("Balance  changed: " + b);
            System.exit(1);
        }
    }
}
