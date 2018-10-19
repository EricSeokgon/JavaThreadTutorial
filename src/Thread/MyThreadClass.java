package Thread;

public class MyThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Java Thread!");
    }

    @FunctionalInterface
    public interface Runnable {
        void run();
    }

    public static void main(String[] args) {
        MyThreadClass myThread = new MyThreadClass();
        myThread.start();

        Runnable  aRunnableObject = () ->  System.out.println("Hello Java  thread!");
        Thread  myThread2 = new Thread(String.valueOf(aRunnableObject));
        myThread2.start();
    }
}
