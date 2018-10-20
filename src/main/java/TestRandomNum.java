import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/9/15.
 */
public class TestRandomNum {

    public static void main(String[] args) {
        List<Integer> resultOne = new ArrayList<Integer>();
        List<Integer> resultZero = new ArrayList<Integer>();

        for (int i = 0; i < 20000000; i++) {
            int rd = Math.random() > 0.5? 1:0;
            if (rd == 1) resultOne.add(rd);
            else resultZero.add(rd);
        }

        System.out.println("1的数量:" + resultOne.size());
        System.out.println("0的数量:" + resultZero.size());
    }
}
