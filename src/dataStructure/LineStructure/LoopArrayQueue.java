package dataStructure.LineStructure;

/**
 * 循环数组实现队列
 * @author guoshoujing
 * @create 2020-01-03 10:50 上午
 */
public class LoopArrayQueue {
    public static class MyLoopArrayQueue {
        private int[] arr;
        private int head;
        private int tail;

        public MyLoopArrayQueue(int length){
            if(length <= 0){
                throw new IllegalArgumentException("array length illegal");
            }
            arr = new int[length + 1];
            head = 0;
            tail = 0;
        }

        public void offer(int a){
             if((tail + 1) % arr.length == head){
                 throw new ArrayIndexOutOfBoundsException("queue out of bound");
             }
             arr[(tail = (tail + 1) % arr.length) - 1] = a;
        }

        public int pop(){
            if(head == tail){
                throw new ArrayIndexOutOfBoundsException("no data pop");
            }
            return arr[(head = (head + 1) % arr.length) - 1];
        }
    }

    public static void main(String[] args) {
        MyLoopArrayQueue array = new MyLoopArrayQueue(3);
        array.offer(1);
        array.offer(1);
        array.offer(1);
        array.pop();
        array.pop();
        array.pop();
    }
}
