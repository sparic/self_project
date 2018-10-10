package effective_java;


import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Administrator on 2018/10/7.
 */
public class Stack1<E> {

    public void print(Collection<? super E> e) {
        for (Object o : e) {
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        Stack1<Number> stack1 = new Stack1<Number>();
        Collection<Object> str = Arrays.asList("hello siri", "hello ray");
        stack1.print(str);
    }
}
