package test;

import java.util.concurrent.*;

/**
 * @author guoshoujing
 * @create 2019-11-20 1:47 下午
 */
public class ThreadPoolTest {
    public static void main(String[] args) throws Exception {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10), new ThreadPoolExecutor.AbortPolicy());
//        Executors.newFixedThreadPool(1);
        int i = 1;
        i = i++;
        System.out.println(i);
    }
}
