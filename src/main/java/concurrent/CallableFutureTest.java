package concurrent;

import java.util.concurrent.*;

public class CallableFutureTest {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("start main thread ");

        ExecutorService exec = Executors.newFixedThreadPool(2);

        //新建一个Callable 任务，并将其提交到一个ExecutorService. 将返回一个描述任务情况的Future.
        Callable<String> call = new Callable<String>() {

//            @Override
            public String call() throws Exception {
                System.out.println("start new thread ");
                Thread.sleep(5000);
                System.out.println("end new thread ");
                return "我是返回的内容";
            }
        };

        Future<String> task = exec.submit(call);
        Thread.sleep(1000);
        System.out.println(task.isCancelled());
        String retn = task.get();
        //关闭线程池
        exec.shutdown();
        System.out.println(retn + "--end main thread");
    }
}

/*
作者：关注公众号_搜云库_每天更新
链接：https://juejin.im/post/5aae4e8f6fb9a028e52d9e8c
来源：掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
*/
