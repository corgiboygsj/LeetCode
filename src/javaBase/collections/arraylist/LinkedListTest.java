package javaBase.collections.arraylist;

import java.util.LinkedList;

/**
 * @author guoshoujing
 * @create 2020-04-01 2:31 下午
 */
public class LinkedListTest {
    public static void main(String[] args) {
        //testStack();
        testQueue();
    }

    /**
     * push为入栈
     * pop为出栈
     * peek为查看栈顶元素
     */
    public static void testStack(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);

        System.out.println(linkedList);

        System.out.println(linkedList.peek());
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        linkedList.push(4);
        System.out.println(linkedList);
        System.out.println(linkedList.peek());
    }

    /**
     * offer为入队
     * poll为出队
     * peekFirst队头元素、peekLast队尾元素
     */
    public static void testQueue(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.offer(1);
        linkedList.offer(2);
        linkedList.offer(3);
        linkedList.offer(4);

        System.out.println(linkedList);
        System.out.println(linkedList.poll());
        System.out.println(linkedList.pollFirst());
        System.out.println(linkedList.peek());
    }
}
