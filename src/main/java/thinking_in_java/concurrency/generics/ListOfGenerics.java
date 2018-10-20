package thinking_in_java.concurrency.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/16.
 */
public class ListOfGenerics<T> {
    private List<T> array = new ArrayList<T>();
    public void add(T item) { array.add(item); }
    public T get(int index) { return array.get(index); }
}
