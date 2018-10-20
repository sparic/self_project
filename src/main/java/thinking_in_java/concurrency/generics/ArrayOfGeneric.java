package thinking_in_java.concurrency.generics;

/**
 * Created by Administrator on 2018/10/16.
 */
public class ArrayOfGeneric {

    static final int SIZE = 100;

    static Generic<Integer>[] gia;

    public static void main(String[] args) {
        gia = (Generic<Integer>[]) new Generic[SIZE];
        System.out.println(gia.getClass().getSimpleName());
        gia[0] = new Generic<Integer>();
//        gia[1] = new Object();
    }
}
