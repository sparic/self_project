package thinking_in_java.generics;

/**
 * Created by Administrator on 2018/10/16.
 */
public class GenericArray<T> {
    private T[] array;

    public GenericArray(int sz) {
        array = (T[]) new Object[sz];
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() { return array; }

    public static void main(String[] args) {
        GenericArray<Integer> gai = new GenericArray<>(10);
//        Object[] oa = gai.rep();
        Integer[] oa = gai.rep();
    }
}
