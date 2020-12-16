package 牛客网刷题;

/**
 * 题目描述
 * 给定一个无序单链表，实现单链表的排序(按升序排序)。
 *
 * 示例1
 * 输入
 * [1,3,2,4,5]
 * 返回值
 * {1,2,3,4,5}
 * @author guoshoujing
 * @create 2020-12-14 10:45 上午
 */
public class 单链表排序 {

    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    //插入排序，超时
//    public ListNode sortInList(ListNode head) {
//        if(head == null || head.next == null){
//            return head;
//        }
//
//        ListNode currentPre = head,current = head.next;
//        while(current != null){
//            if(current.val < currentPre.val){
//                ListNode currentNext = current.next;
//                //插入
//                if(head.val >= current.val){
//                    current.next = head;
//                    head = current;
//                } else {
//                    ListNode workerPre = head, worker = head.next;
//                    while (worker != current){
//                        if(worker.val >= current.val){
//                            workerPre.next = current;
//                            current.next = worker;
//                            break;
//                        }
//                        workerPre = worker;
//                        worker = worker.next;
//                    }
//                }
//                currentPre.next = currentNext;
//            }
//            currentPre = current;
//            current = current.next;
//        }
//        return head;
//    }

    public ListNode sortInList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        return null;
    }

    private ListNode mergeList(ListNode head1, ListNode head2){
        ListNode head = null, worker = null;
        while(head1 != null && head2 != null){
            ListNode max = head1.val > head2.val ? head1 : head2;
            if(head == null){
                head = max;
                worker = head;
            } else {
                worker.next = max;
                worker = worker.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        while(head1 != null){
            worker.next = head1;
            worker = worker.next;
        }

        while(head2 != null){

        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-426572,-406609,724427,-157789,-132713,720732,-39078,-348926,-693458,559374,114739,-748249,428207,-767407,401563,646432,-682870,483610,-608888,94840,749542,359115,131739,935294,347325,80573,-869091,-757897,-860166,-227942,-484068,-170790,-362441,-860466,819197,817675,886101,463504,-100482,496406,-860791};
//        int[] arr = new int[]{3,2,1,2,4};

        ListNode head = null, worker = null;
        for(int i = 0; i < arr.length; i++){
            if(head == null){
                head = new ListNode(arr[0]);
                worker = head;
            } else {
                ListNode node = new ListNode(arr[i]);
                worker.next = node;
                worker = node;
            }
        }

        ListNode listNode = new 单链表排序().sortInList(head);
        while(listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
