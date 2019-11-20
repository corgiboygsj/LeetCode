package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 三个线程循环交叉打印
 */
public class CrossPrintPlus {
    public static void main(String[] args) throws Exception {
        ReentrantLock reentrantLock = new ReentrantLock();
        reentrantLock.unlock();
        reentrantLock.lock();
        ExecutorService single = Executors.newSingleThreadExecutor();

        Thread t1 = new Thread(() -> System.out.println("t1"));
        Thread t2 = new Thread(() -> System.out.println("t2"));
        Thread t3 = new Thread(() -> System.out.println("t3"));

        while(true){
            single.execute(t1);
            single.execute(t2);
            single.execute(t3);
        }

    }
}
