package javaBase.concurrent;

import java.util.ArrayList;
import java.util.List;

/**
 * 两个线程交叉打印
 */
public class CrossPrint {
    private static final Object lock = new Object();
    private volatile static boolean flag;

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        initList(1, list1);
        initList(2, list2);

        System.out.println("list1:" + list1.toString());
        System.out.println("list2:" + list2.toString());

        flag = true;

        new Thread(() -> {
            try {
                synchronized (lock){
                    int i = 0;
                    while(i < list1.size()){
                        if(!flag){
                            lock.wait();
                        }
                        System.out.println(list1.get(i++));
                        flag = false;
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                synchronized (lock){
                    int i = 0;
                    while(i < list2.size()){
                        if(flag){
                            lock.wait();
                        }
                        System.out.println(list2.get(i++));
                        flag = true;
                        lock.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private static void initList(Integer begin, List<Integer> list){
        for (int i = begin; i <= begin + 20; i += 2){
            list.add(i);
        }
    }
}
