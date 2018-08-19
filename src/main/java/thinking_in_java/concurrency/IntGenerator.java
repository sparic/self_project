package thinking_in_java.concurrency;

/**
 * Created by Ray.fu on 2018/1/18.
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;
    public abstract int next();
    public void cancel() {
        canceled = true;
    }
    public boolean isCanceled() {
        return canceled;
    }
}
