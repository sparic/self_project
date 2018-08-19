package thinking_in_java.concurrency.execise;

/**
 * Created by sparic on 2017/12/29.
 */
public class MyThread implements Runnable {

    public MyThread() {
        System.out.println("MyThread started");
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("print a message");
            Thread.yield();
        }
    }
}
