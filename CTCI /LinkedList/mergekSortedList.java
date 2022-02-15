public class mergekSortedList {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int val){this.val = val;}
    }


    // make the multipy merge list to a two merge list problem
    public ListNode mergeklists(ListNode[] lists){
        if (lists == null || lists.length == 0){
            return null;
        }

        while (lists.length > 1){
            ListNode mergedList = new ListNode(1);

            for (int i = 0; i < lists.length; i = i +2){
                ListNode l1 = lists[i];
                ListNode l2 = lists[i+1];
                mergedList(mergeTwoList(l1,l2));
            }
            lists = mergedList;
        }
        return lists[0];
    }


    // method for merge two sorted list
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
