package Thread_Producer_Consumer;

        import java.util.Random;

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        Random rand = new Random();
        while (true) {
            int n = rand.nextInt();
            buffer.produce(n);

        }
    }
}
