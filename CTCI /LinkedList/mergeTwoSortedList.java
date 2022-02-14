public class mergeTwoSortedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }


    public ListNode mergeTwoList(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(1);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null && list2 == null){
            tail.next = list1;
        }else if(list2 != null && list1 == null){
            tail.next = list2;
        }
        return dummy.next;
    }
}
