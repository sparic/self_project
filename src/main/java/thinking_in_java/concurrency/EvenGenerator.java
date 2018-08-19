package thinking_in_java.concurrency;

/**
 * Created by sparic on 2018/1/18.
 */
public class EvenGenerator extends IntGenerator {

    private volatile int currentEvenValue = 0;

    public int next() {
        ++currentEvenValue;
        ++currentEvenValue;
        return currentEvenValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator());
    }
}
