package Thread_Producer_Consumer;


class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        int data;
        while (true) {
            data = buffer.consume();

        }
    }
}


