package javaBase.collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author guoshoujing
 * @create 2020-08-18 2:30 下午
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Iterator<Integer> iterator = list.iterator();
        long begin = System.currentTimeMillis();
        while(iterator.hasNext()){
            Integer next = iterator.next();
        }
        System.out.println("iterator:" + (System.currentTimeMillis() - begin));


        ListIterator<Integer> integerListIterator = list.listIterator();
        begin = System.currentTimeMillis();
        while(integerListIterator.hasNext()){
            Integer next = integerListIterator.next();
        }
        System.out.println("integerListIterator:" + (System.currentTimeMillis() - begin));
    }
}
