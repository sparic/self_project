package thinking_in_java.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by sparic on 2018/1/2.
 */
public class DaemonThreadFactory implements ThreadFactory {

    public Thread newThread(Runnable r) {
        Thread t = new Thread(r);
        t.setDaemon(true);
        return t;
    }
}
