package test;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sparic on 2017/12/25.
 */
public class Test {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("当前日期: " + date);
        int i = (int) (Math.random() * 30);
        System.out.println(i);
        Map map = new HashMap<String, String>();
        Collections.synchronizedMap(map);
    }
}
