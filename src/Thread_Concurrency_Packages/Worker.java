package Thread_Concurrency_Packages;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Worker extends Thread {
    private CyclicBarrier barrier;
    private int ID;
    private static Random random = new Random();

    public Worker(int ID, CyclicBarrier barrier) {
        this.ID = ID;
        this.barrier = barrier;
    }

    public void run() {
        try {
            int workTime = random.nextInt(30) + 1;
            System.out.println("Thread #" + ID + " is going to work for " + workTime + "  seconds");
            Thread.sleep(workTime * 1000);
            System.out.println("Thread #" + ID + " is waiting at the barrier.");
            this.barrier.await();
            System.out.println("Thread #" + ID + " passed the barrier.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            System.out.println("Barrier is broken.");
        }
    }
}
