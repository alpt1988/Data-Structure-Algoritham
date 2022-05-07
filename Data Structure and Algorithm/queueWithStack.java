import java.util.*;
public class queueWithStack<T> {
    private Stack<T> stackNewestOnTop = new Stack<T>();
    private Stack<T> stackOldestOnTop = new Stack<T>();

    //add item
    public void enqueue(T value){
        stackNewestOnTop.push(value);

    }

    // Move items from the newest on top to the oldest on top
    // get the oldest item
    public T peek(){
        shiftStacks();
        return stackOldestOnTop.peek();

    }

    // Move items from the newest on top to oldest on top
    // remove the oldest item
    public T dequeue(){
        shiftStacks();
        return stackOldestOnTop.pop();
    }

    public void shiftStacks(){
        if (stackOldestOnTop.isEmpty()){
            while (!stackNewestOnTop.isEmpty()){
                stackOldestOnTop.push(stackNewestOnTop.pop());
            }
        }
    }



}
