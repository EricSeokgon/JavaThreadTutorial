package Thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t = new Thread(ThreadTest2::print);
        t.start();
    }
    public static void print() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "  ");
        }
}

}
