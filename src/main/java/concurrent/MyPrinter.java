package concurrent;

/**
 * Created by Administrator on 2019/1/13.
 */
public class MyPrinter  implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " hello Ray!");
    }

}
