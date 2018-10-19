package Thread;

public class ThreadTest {
    public static void execute() {
        System.out.println("Hello Java  thread!");
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(ThreadTest::execute);
        myThread.start();
    }
}
