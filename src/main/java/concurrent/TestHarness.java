package concurrent;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Administrator on 2019/1/13.
 */
public class TestHarness {

    public long timeTasks(int nThreads, final Runnable task) throws InterruptedException {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGates = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread() {

                @Override
                public void run() {
                    try {
                        startGate.await();
                        try {
                            System.out.println(Thread.currentThread().getName() + "task.run()");
                            task.run();
                        } finally {
                            endGates.countDown();
                            System.out.println(Thread.currentThread().getName() + "endGates.countDown()");
                        }
                    } catch (InterruptedException ignored) {
                    }
                }
            };
            t.start();
        }

        long start = System.nanoTime();
        System.out.println("main thread - startTime=" + start);
//        startGate.countDown();
        System.out.println("main thread - after startGate.countDown()");
        endGates.await();
        System.out.println("main thread - after endGates.await()");
        long end = System.nanoTime();
        System.out.println("main thread - endTime=" + end);
        return end - start;
    }

    public static void main(String[] args) {
        TestHarness testHarness = new TestHarness();
        MyPrinter myPrinter = new MyPrinter();
        try {
            long totalTime = testHarness.timeTasks(3, myPrinter);
            System.out.println("totalTime=>" + totalTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
