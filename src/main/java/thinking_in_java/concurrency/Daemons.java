package thinking_in_java.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by sparic on 2018/1/2.
 */
class Daemon implements Runnable {
    private Thread[] t = new Thread[10];

    public void run() {
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new DaemonSpawn());
            t[i].start();
            System.out.println(t[i].getName() + " DaemonSpawn " + i + " started. ");
        }
        for (int i = 0; i < t.length; i++) {
            System.out.println(Thread.currentThread().getName() + "t[" + i + "].isDaemon() = " +
                    t[i].isDaemon() + ". ");
        }
        while (true)
            Thread.yield();
    }
}

class DaemonSpawn implements Runnable {
    public void run() {
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(2);
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + "thread into yield()......");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

public class Daemons {

    public static void main(String[] args) throws Exception {
        Thread d = new Thread(new Daemon());
        d.setDaemon(true);
        d.start();
        System.out.println("d.isDaemon() = " + d.isDaemon() + ". ");
//        Allow the damon threads to
//        finish their startup processes:
        TimeUnit.SECONDS.sleep(10);
        System.out.println("to the end of the program");
    }
}
