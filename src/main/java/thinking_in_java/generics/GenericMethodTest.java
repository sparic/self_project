package thinking_in_java.generics;

/**
 * Created by Administrator on 2018/10/14.
 */
public class GenericMethodTest {

    public static <T> void test(T x) {
        System.out.println(x.getClass().getName());
    }

    public static void main(String[] args) {
//        Integer[] intArr = {1,2,3};
        test("");
    }
}
