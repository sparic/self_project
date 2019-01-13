package thinking_in_java.generics;

/**
 * Created by Administrator on 2018/10/10.
 */
public class TwoTuple<A,B> {
    public final A first;

    public final B second;

    public TwoTuple(A a, B b) { first = a; second = b;}

    @Override
    public String toString() {
        return "TwoTuple{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
