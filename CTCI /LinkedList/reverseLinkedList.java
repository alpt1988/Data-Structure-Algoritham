public class reverseLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverselist(ListNode head){
            ListNode prev = null ;
            ListNode curr = head;

            while (curr != null){
                ListNode nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
            }
            return prev;
        }

        public ListNode recursiveReverse(ListNode head){
            if ( head == null){
                return null;
            }

            ListNode newHead = head;
            if (head.next != null){
                newHead = recursiveReverse(head.next);
                head.next.next = head;
            }
            head.next = null;
            return newHead;
        }
}
