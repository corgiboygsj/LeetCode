package javaBase.concurrent;

/**
 * @author guoshoujing
 * @create 2021-01-12 2:27 下午
 */
public class Main {
    public static void main(String[] args) {
        Object lock = new Object();

        new Thread(() -> {
            while(true){
                String s = "1";

                synchronized (lock){
                    System.out.println(s);
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            String s = "2";

            while (true){
                synchronized (lock){
                    System.out.println(s);
                    try {
                        lock.notifyAll();
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
