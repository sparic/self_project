package thinking_in_java.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by sparic on 2018/1/2.
 */
public class SimpleDaemons implements Runnable {

    private static boolean flag = false;

    public void run() {
        try {
            while (true) {
                TimeUnit.MICROSECONDS.sleep(100);
                flag = true;
                System.out.println(Thread.currentThread() + " " + this);
            }
        } catch (InterruptedException e) {
            System.out.println("sleep() interrupted");
        }
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        System.out.println(flag);
//        TimeUnit.MILLISECONDS.sleep(175);
//        System.out.println("All daemons ended");
    }
}
