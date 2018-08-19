package concurrent;

/**
 * Created by Ray on 2018/8/15.
 */
public class ClassA {

    private int id;
    private String name;
    private ClassB b;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassB getB() {
        return b;
    }

    public void setB(ClassB b) {
        this.b = b;
    }

    // ...

    public synchronized void m1(){
        // do something
        System.out.println("ClassA m1()...");
        b.method1();
    }
}
