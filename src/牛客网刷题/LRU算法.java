package 牛客网刷题;

import java.util.*;

/**
 * 题目描述
 * 设计LRU缓存结构，该结构在构造时确定大小，假设大小为K，并有如下两个功能
 * set(key, value)：将记录(key, value)插入该结构
 * get(key)：返回key对应的value值
 * [要求]
 * set和get方法的时间复杂度为O(1)
 * 某个key的set或get操作一旦发生，认为这个key的记录成了最常使用的。
 * 当缓存的大小超过K时，移除最不经常使用的记录，即set或get最久远的。
 * 若opt=1，接下来两个整数x, y，表示set(x, y)
 * 若opt=2，接下来一个整数x，表示get(x)，若x未出现过或已被移除，则返回-1
 * 对于每个操作2，输出一个答案
 * 示例1
 * 输入
 * 复制
 * [[1,1,1],[1,2,2],[1,3,2],[2,1],[1,4,4],[2,2]],3
 * 返回值
 * 复制
 * [1,-1]
 *
 * @author guoshoujing
 * @create 2020-12-07 6:18 下午
 */
public class LRU算法 {

    private class LRU{
        private Map<Integer, Node> cache = new HashMap<>();
        private Node head = new Node();
        private Node tail = new Node();
        private int cap;
        private int currentCap = 0;

        {
            head.next = tail;
            tail.pre = head;
        }

        public LRU(int cap){
            this.cap = cap;
        }

        private class Node {
            private int key;
            private int val;
            private Node pre;
            private Node next;

            private Node(int key, int val, Node pre, Node next) {
                this.key = key;
                this.val = val;
                this.pre = pre;
                this.next = next;
            }

            private Node() {
            }
        }

        public int get(Integer key){
            Node node = cache.get(key);
            if(node != null){
                node.next.pre = node.pre;
                node.pre.next = node.next;

                node.next = head.next;
                node.pre = head;
                head.next.pre = node;
                head.next = node;

                return node.val;
            }

            return -1;
        }

        public void set(Integer key, Integer val){
            Node node = cache.get(key);
            if(node != null){
                node.pre.next = node.next;
                node.next.pre = node.pre;
            } else {
                node = new Node(key, val, head, head.next);
                if(currentCap + 1 > cap){
                    Node last = tail.pre;
                    tail.pre = last.pre;
                    last.pre.next = tail;

                    cache.remove(last.key);
                } else {
                    currentCap++;
                }
            }

            cache.put(key, node);

            node.next = head.next;
            node.pre = head;
            head.next.pre = node;
            head.next = node;
        }
    }


    public int[] LRU (int[][] operators, int k) {
        LRU lru = new LRU(k);
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < operators.length; i++){
            int[] operate = operators[i];
            if(operate[0] == 1){
                lru.set(operate[1], operate[2]);
            } else {
                result.add(lru.get(operate[1]));
            }
        }

        int[] arr = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            arr[i] = result.get(i);
        }

        return arr;
    }

    public static void main(String[] args) {
        LRU算法 lru算法 = new LRU算法();
        //[[1,1,1],[1,2,2],[1,3,2],[2,1],[1,4,4],[2,2]],3
        int[] lru = lru算法.LRU(new int[][]{{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}}, 3);
        System.out.println(Arrays.toString(lru));
    }
}
