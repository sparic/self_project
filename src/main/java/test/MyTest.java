package test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by ray.fu on 2017/12/25.
 */
public class MyTest {

    private long abc;

    public static int[] getArr(int n) {
        Set<Integer> tempSet = new HashSet<Integer>();
        int[] arr = new int[n];
        if (n > 0) {
            while (tempSet.size() < n) {
                tempSet.add(getRandomNumber());
            }
        }
//        arr = tempSet.toArray();
        Iterator it = tempSet.iterator();
        for (int t = 0; t < n; t++) {
            while (it.hasNext()) {
                arr[t] = (Integer) it.next();
                break;
            }
        }
        return arr;
    }

    private static int getRandomNumber() {
        int random = 0;
        double temp = Math.random() * 32;
        if (temp < 1) {
            random = (int) (temp) + 2;
        } else if (temp < 2 && temp >= 1) {
            random = (int) (temp) + 1;
        } else if (temp >= 2 && temp <= 32) {
            random = (int) temp;
        }
        return random;
    }

    public static void main(String[] args) {
        int[] arr = getArr(10);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
