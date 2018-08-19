//package thinking_in_java.concurrency;
//
//import java.util.concurrent.locks.Lock;
//import java.util.concurrent.locks.ReentrantLock;
//
///**
// * Created by sparic on 2018/1/23.
// */
//public class MutexEvenGenerator extends IntGenerator {
//
//    private int currentEvenValue = 0;
//
//    private Lock lock = new ReentrantLock();
//
//    public int next() {
//        lock.lock();
//        try {
//            ++currentEvenValue;
//            Thread.yield();
//            ++currentEvenValue;
//            return currentEvenValue;
//        } catch (Exception e) {
//            e.getStackTrace();
//        }
//    }
//}
