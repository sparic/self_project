package thinking_in_java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by sparic on 2018/1/2.
 */
public class SleepingTask extends LiftOff {

    public void run() {
        try {
            while (countDown-- > 0) {
                System.out.print(status());
//            Old-style:
//            Thread.sleep(100);
//            java se5/6-style:
                TimeUnit.MICROSECONDS.sleep(100);
            }
        } catch (InterruptedException e) {
            System.err.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }

}
