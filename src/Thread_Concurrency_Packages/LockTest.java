package Thread_Concurrency_Packages;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {

    // Instantiate the lock object
    Lock myLock = new ReentrantLock();

    public void updateResource() {
        try {
            // Acquire the lock
            myLock.lock();
        } finally {
            // Release the lock
            myLock.unlock();
        }
    }

}
