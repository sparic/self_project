package concurrent;

/**
 * Created by Ray on 2018/8/15.
 */
public class ClassB {

    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public synchronized void method1(){
        // do something
        System.out.println("ClassB method1()...");
    }
}
