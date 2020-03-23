package leetCode.未分类;

/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 *
 * 如果有两个中间结点，则返回第二个中间结点。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4,5]
 * 输出：此列表中的结点 3 (序列化形式：[3,4,5])
 * 返回的结点值为 3 。 (测评系统对该结点序列化表述是 [3,4,5])。
 * 注意，我们返回了一个 ListNode 类型的对象 ans，这样：
 * ans.val = 3, ans.next.val = 4, ans.next.next.val = 5, 以及 ans.next.next.next = NULL.
 * 示例 2：
 *
 * 输入：[1,2,3,4,5,6]
 * 输出：此列表中的结点 4 (序列化形式：[4,5,6])
 * 由于该列表有两个中间结点，值分别为 3 和 4，我们返回第二个结点。
 *  
 *
 * 提示：
 *
 * 给定链表的结点数介于 1 和 100 之间。
 */
public class Question876 {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode worker_1 = head;
        ListNode worker_2 = head;

        while(worker_2 != null && (worker_2 = worker_2.next) != null){
            worker_1 = worker_1.next;
            worker_2 = worker_2.next;
        }

        return worker_1;
    }

    public static void main(String[] args) {
        ListNode line_head_1;
        ListNode link_1 = new ListNode(1);
        line_head_1 = link_1;
        link_1.next = new ListNode(2);
        (link_1 = link_1.next).next = new ListNode(3);
        (link_1 = link_1.next).next = new ListNode(4);
        (link_1 = link_1.next).next = new ListNode(5);

        System.out.println(middleNode(line_head_1).val);

        ListNode line_head_2;
        ListNode link_2 = new ListNode(1);
        line_head_2 = link_2;
        link_2.next = new ListNode(2);
        (link_2 = link_2.next).next = new ListNode(3);
        (link_2 = link_2.next).next = new ListNode(4);
        (link_2 = link_2.next).next = new ListNode(5);
        (link_2 = link_2.next).next = new ListNode(6);

        System.out.println(middleNode(line_head_2).val);

        ListNode line_head_3 = new ListNode(1);
        System.out.println(middleNode(line_head_3).val);
    }
}
