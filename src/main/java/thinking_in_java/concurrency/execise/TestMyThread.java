package thinking_in_java.concurrency.execise;

import thinking_in_java.concurrency.LiftOff;

/**
 * Created by sparic on 2017/12/29.
 */
public class TestMyThread {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new MyThread());
            t.start();
        }
    }
}
