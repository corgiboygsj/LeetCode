package leetCode.链表;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Question2 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode head = new ListNode(0), work = head;
        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + sum;
            work.next = new ListNode(sum % 10);
            sum /= 10;
            work = work.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        while(l1 != null){
            sum = l1.val + sum;
            work.next = new ListNode(sum % 10);
            sum /= 10;
            l1 = l1.next;
            work = work.next;
        }
        while(l2 != null){
            sum = l2.val + sum;
            work.next = new ListNode(sum % 10);
            sum /= 10;
            l2 = l2.next;
            work = work.next;
        }
        if(sum != 0){
            work.next = new ListNode(sum);
        }

        return head.next;
    }
}
