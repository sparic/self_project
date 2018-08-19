package thinking_in_java.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by sparic on 2018/1/17.
 */
public class ExceptionThread implements Runnable {

    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        try {
            ExecutorService exec = Executors.newCachedThreadPool();
            exec.execute(new ExceptionThread());
        } catch (Exception e) {
            System.out.println("外部报错了!!!");
            e.printStackTrace();
        }
    }
}
