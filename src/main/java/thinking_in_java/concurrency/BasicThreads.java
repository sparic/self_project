package thinking_in_java.concurrency;

/**
 * Created by sparic on 2017/12/29.
 */
public class BasicThreads {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
