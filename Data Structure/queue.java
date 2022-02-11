// Linear data structure   FIFO (First in First out)
// flexible with size, don't have to allocate initially
// add(add last) remove(remove first)
public class queue {
    private static class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data = data;
        }
    }

    private Node head;//remove from the head
    private Node tail;// add thing to the tail

    // if head is empty reutrn null, return true
    public boolean isEmpty(){
        return head == null;
    };

    //reutrn the head data
    public int peek(){
        return head.data;
    };

    // add to the last, create a new node and let the old tail point to this node. let the new node be the tail
    // if the queue is completely empty, then this new node should be head
    public void add(int data){
        Node node = new Node(data);
        if (tail != null){
            tail.next = node;
        }
        tail = node;
        if (head == null){
            head = node;
        }
    };

    // first get the head data
    // remove the head
    // if head is null then tail is null too and return the data
    public int remove(){
        int data = head.data;
        head = head.next;
        if (head == null){
            tail = null;
        }
        return data;
    };
}
