// Linear data structure  LIFO (Last in First out)
// flexible with size, don't have to allocate initially
// push(add first) pop(remove first)
// Time complexity:  Access O(n),  Search O(n),  Insert O(1),   Remove O(1)
public class stack {
    private static class Node{
        private int data;
        private Node next;
        private Node(int data){
            this.data = data;
        }
    }

    private Node top;// add and remove from the top

    // if top is null, return true
    public boolean isEmpty(){
        return top == null;
    };

    public int peek(){
        return top.data;
    };

    // creat a new node
    // then point to the old head
    // top will be the new top
    public void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
    };

    // get the top data
    // top should be the next element down
    // return the data
    public int pop(){
        int data = top.data;
        top = top.next;
        return data;
    };
}
