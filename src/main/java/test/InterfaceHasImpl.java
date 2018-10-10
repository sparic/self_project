package test;

/**
 * Created by Ray on 2018/9/1.
 */
public interface InterfaceHasImpl {

    static void staticMethod() {
        System.out.println("接口中的静态方法");
    }

    default void dream() {
        System.out.println("this is native dream");
    }

    static void main(String[] args) {
        InterfaceHasImpl.staticMethod();
        InterfaceHasImpl interfaceHas = new InterfaceHasImpl() {
            @Override
            public void dream() {
            }
        };
        interfaceHas.dream();
    }
}
