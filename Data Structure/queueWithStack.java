import java.util.*;
public class queueWithStack<T> {
    private Stack<T> stackNewestOnTop = new Stack<T>();
    private Stack<T> stackOldestOnTop = new Stack<T>();

    //add item
    public void enqueue(T value){
        stackNewestOnTop.push(value);

    }

    public T peek(){
        shiftStacks();
        return stackOldestOnTop.peek();

    }

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
