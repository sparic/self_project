package thinking_in_java.generics;

/**
 * Created by Administrator on 2018/10/11.
 */
class ClassAsFactory<T>  {
    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {}

public class InstantiateGenericType<T> {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<Employee>(Employee.class);
        System.out.println("ClassAsFactory<Employee> succeed");
        try {
            ClassAsFactory<Integer> fi = new ClassAsFactory<Integer>(Integer.class);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("ClassAsFactory<Integer> failed");
        }
    }
}
