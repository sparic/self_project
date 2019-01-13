package effective_java.serializable;

import java.io.Serializable;

/**
 * Created by Administrator on 2019/1/1.
 */
public class Sub extends AbstractParent implements Serializable {

    private String sex;

    public Sub(String name, String sex) {
        super(name);
        this.sex = sex;
    }

    public static void main(String[] args) {
        Sub sub = new Sub("jake", "marry");
        System.out.println(sub.getSex());
    }

    public String getSex() {
        return sex;
    }
}
