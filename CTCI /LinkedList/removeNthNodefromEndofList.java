public class removeNthNodefromEndofList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthNode(ListNode head, int n){
        ListNode dummy = new ListNode(0,head);
        ListNode left = dummy;
        ListNode right = head;

        while (n > 0 && right !=null){
            right = right.next;
            n = n -1;
        }

        while (right != null){
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return dummy.next;
    }

}
