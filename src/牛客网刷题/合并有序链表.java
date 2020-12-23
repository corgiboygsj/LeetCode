package 牛客网刷题;

/**
 * 题目描述
 * 将两个有序的链表合并为一个新链表，要求新的链表是通过拼接两个链表的节点来生成的，且合并后新链表依然有序。
 *
 * @author guoshoujing
 * @create 2020-12-17 8:00 下午
 */
public class 合并有序链表 {

    public class ListNode {
        int val;
        ListNode next = null;
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }

        ListNode head = null, work = null;
        while(l1 != null && l2 != null){
            ListNode max;
            if(l1.val < l2.val){
                max = l1;
                l1 = l1.next;
            } else {
                max = l2;
                l2 = l2.next;
            }
            if(head == null){
                head = max;
                work = head;
            } else {
                work.next = max;
                work = work.next;
            }
        }

        while(l1 != null){
            work.next = l1;
            l1 = l1.next;
            work = work.next;
        }

        while(l2 != null){
            work.next = l2;
            l2 = l2.next;
            work = work.next;
        }

        return head;
    }
}
