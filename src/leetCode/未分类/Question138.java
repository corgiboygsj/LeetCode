package leetCode.未分类;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 *
 * 要求返回这个链表的深拷贝。
 * 输入：
 * {"$id":"1","next":{"$id":"2","next":null,"random":{"$ref":"2"},"val":2},"random":{"$ref":"2"},"val":1}
 *
 * 解释：
 * 节点 1 的值是 1，它的下一个指针和随机指针都指向节点 2 。
 * 节点 2 的值是 2，它的下一个指针指向 null，随机指针指向它自己。
 *  
 *
 * 提示：
 *
 * 你必须返回给定头的拷贝作为对克隆列表的引用。
 */
public class Question138 {
    public class Node {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }
    }

    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }

        Node worker = head;
        Map<Node, Node> map = new HashMap<>();
        while(worker != null){
            map.put(worker, new Node(worker.val, null, null));
            worker = worker.next;
        }
        worker = head;
        while(worker != null){
            Node node = map.get(worker);
            node.next = map.get(worker.next);
            node.random = map.get(worker.random);
            worker = worker.next;
        }
        return map.get(head);
    }
}
