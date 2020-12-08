package 牛客网刷题;

/**
 * 题目描述
 * 判断给定的链表中是否有环。如果有环则返回true，否则返回false。
 * 扩展：
 * 你能给出空间复杂度的解法么？
 *
 * @author guoshoujing
 * @create 2020-12-07 10:56 上午
 */
public class 链表中是否有环 {

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow, fast;
        slow = fast = head;

        while(head.next != null && head.next.next != null){
            head = head.next.next;
            slow = slow.next;
            if (head == slow){
                return true;
            }
        }

        return false;
    }
}
