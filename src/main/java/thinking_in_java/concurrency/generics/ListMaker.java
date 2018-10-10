package thinking_in_java.concurrency.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/10/10.
 */
public class ListMaker<T> {
    List<T> create() { return new ArrayList<>(); }

    public static void main(String[] args) {
        ListMaker<String> stringMaker = new ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }
}
