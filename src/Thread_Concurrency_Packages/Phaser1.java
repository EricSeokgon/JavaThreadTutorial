package Thread_Concurrency_Packages;
import java.util.concurrent.Phaser;
public class Phaser1 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser() {
            protected boolean onAdvance(int phase, int parties) {
                System.out.println("Inside onAdvance(): phase  = " + phase
                        + ",  Registered Parties = " + parties);
                // Do not terminate the phaser by returning false
                return false;
            }
        };
        // Register the self (the "main" thread) as a party 
        phaser.register();
        System.out.println("#1: isTerminated():" + phaser.isTerminated());
        phaser.arriveAndDeregister();

        // Trigger another phase advance
        phaser.register();
        phaser.arriveAndDeregister();

        System.out.println("#2: isTerminated():" + phaser.isTerminated());
        phaser.forceTermination();
        System.out.println("#3: isTerminated():" + phaser.isTerminated());

    }
}
