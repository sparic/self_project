package thinking_in_java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
public class FilledListMaker<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++)
            result.add(t);
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker<String> stringMaker = new FilledListMaker<>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }
}
