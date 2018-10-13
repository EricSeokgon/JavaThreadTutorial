package Thread;

public class MyThreadClass extends Thread {
    @Override
    public void run() {
        System.out.println("Hello Java Thread!");
    }

    public static void main(String[] args) {
        MyThreadClass myThread = new MyThreadClass();
        myThread.start();
    }
}
