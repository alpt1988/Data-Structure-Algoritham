// linkedlist: sequence of element, can be any data, can be sorted, unsorted, unique element or duplicate.
// For LL you have to take linear time to walk through every element
// insert and delete at first element can be constant time
//
public class linkedList {
    public class Node{
        Node next;
        int data;
        public Node(int data){
            this.data = data;
        }
    }

    Node head;
    // add last method, first create current node
    // loop through the list as long as next node has data until to the last node, then creat the new node
    public void addLast(int data){
        if (head == null){
            head = new Node(data);
            return;;
        }
        Node current = this;//pointer
        while (current.next != null){
            current = current.next;
        }
        current.next = new Node(data);
    }


    // add first method
    // create the new node, put the new head next to the old head
    // then make the new head head
    public void addFirst(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }

    // delete method will delete certain data in linked list
    public void delete(int data){
        if (head == null){
            return;
        }
        if (head.data == data){
            head = head.next;
            return;
        }
        Node current = head;
        while (current.next != null){
            if (current.next.data == data){
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
}
