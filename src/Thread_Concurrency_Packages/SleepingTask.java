package Thread_Concurrency_Packages;

import java.util.concurrent.Callable;

class SleepingTask implements Callable<MyResult> {
    private int taskId;
    private int loopCounter;
    public SleepingTask(int taskId, int loopCounter) {
        this.taskId = taskId;
        this.loopCounter = loopCounter;
    }

    public MyResult call() throws InterruptedException {
        int totalSleepTime = 0;
        for (int i = 1; i <= loopCounter; i++) {
            try {
                System.out.println("Task #" + this.taskId + "  - Iteration #"
                        + i);
                Thread.sleep(1000);
                totalSleepTime = totalSleepTime + 1000;
            } catch (InterruptedException e) {
                System.out.println("Task #" + this.taskId
                        + "  has  been  interupted.");
                throw e;
            }
        }
        return new MyResult(taskId, totalSleepTime);
    }
}

