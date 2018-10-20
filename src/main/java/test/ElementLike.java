package test;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * Created by Administrator on 2018/9/30.
 */
public class ElementLike<E> implements Iterable<E> {
    public Iterator<E> iterator() {
        return null;
    }

    public void forEach(Consumer<? super E> action) {

    }

    public Spliterator<E> spliterator() {
        return null;
    }
}
