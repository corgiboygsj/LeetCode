package test;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 两个线程交叉打印
 */
public class CrossPrint {
    private static Integer num = 0;

    public static void main(String[] args) {
        final Object lock = CrossPrint.class;

        Thread thread1 = new Thread(() -> {
            while(true){
                synchronized (lock){
                    try {
                        lock.wait();
                        System.out.println("t1" + ++num);
                        lock.notify();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                synchronized (lock){
                    try {
                        lock.notify();
                        lock.wait();
                        System.out.println("t2" + ++num);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
