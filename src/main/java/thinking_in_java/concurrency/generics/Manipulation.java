package thinking_in_java.concurrency.generics;

/**
 * Created by Administrator on 2018/10/10.
 */
class Manipulator<T> {
    private T obj;

    public Manipulator(T x) {
        obj = x;
    }
    public void manipulate() {
//        obj.f();  //can't compile
    }
}

class Manipulator2<T extends HasF> {
    private T obj;
    public Manipulator2(T x) { obj = x; }
    public void manipulate() { obj.f(); }
}

public class Manipulation {
    public static void main(String[] args) {
        HasF hf = new HasF();
        Manipulator<HasF> manipulator = new Manipulator<HasF>(hf);
        manipulator.manipulate();
    }
}
