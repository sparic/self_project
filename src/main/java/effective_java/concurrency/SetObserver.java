package effective_java.concurrency;

/**
 * Created by Administrator on 2018/10/31.
 */
public interface SetObserver<E> {
    void added(ObservableSet<E> set, E element);
}
