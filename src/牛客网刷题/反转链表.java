package 牛客网刷题;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 * 示例1
 * 输入
 * 复制
 * {1,2,3}
 * 返回值
 * 复制
 * {3,2,1}
 * @author guoshoujing
 * @create 2020-12-04 6:42 下午
 */
public class 反转链表 {

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode ReverseList(ListNode head) {
        ListNode next;
        if(head == null || (next = head.next) == null){
            return head;
        }

        ListNode result = ReverseList(next);
        next.next = head;
        head.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);

        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode node = ReverseList(listNode1);
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
