package Thread_Concurrency_Packages;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicCounter {
    private AtomicLong value = new AtomicLong(0L);

    public long next() {
        return value.incrementAndGet();
    }

}
