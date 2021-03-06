package Thread;

public class Group {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();

        ThreadGroup tg1 = t1.getThreadGroup();

        System.out.println("Current thread's  name:  " + t1.getName());
        System.out.println("Current thread's  group  name:  " + tg1.getName());

        Thread t2 = new Thread("my  new thread");

        ThreadGroup tg2 = t2.getThreadGroup();
        System.out.println("New  thread's name:  " + t2.getName());
        System.out.println("New  thread's  group  name:  " + tg2.getName());
    }
}
