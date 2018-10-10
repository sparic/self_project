package effective_java;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by Ray on 2018/9/23.
 */
public class InstrumentedHashSet<E> extends HashSet<E> {

    private int addCount = 0;

    public InstrumentedHashSet(){}

    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return true;
    }

    public int getAddCount() {
        return addCount;
    }


}
