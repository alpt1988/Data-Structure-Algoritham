// implementation of min Heap

import java.util.Arrays;

public class Heap {
    private int capacity = 10;
    private int size = 0;

    int [] items = new int[capacity];

    private int getLeftChildIndex(int paretnIndex){
        return 2 * paretnIndex + 1;
    }
    private int getRightChildIndex(int parentIndex){
        return 2 * parentIndex + 2;
    }
    private int getParentIndex(int childIndex){
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index){
        return getLeftChildIndex(index) < size;
    }
    private boolean hasRightChild(int index){
        return getRightChildIndex(index) < size;
    }
    private boolean hasParent(int index){
        return getParentIndex(index) >= 0;
    }

    private int leftchild(int index){
        return items[getLeftChildIndex(index)];
    }
    private int rightchild(int index){
        return items[getRightChildIndex(index)];
    }
    private int parent(int index){
        return items[getParentIndex(index)];
    }


    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }

    // get smallest
    public int peek() {
            if (size ==0) throw new IllegalStateException();
            return items[0];
        }

    // remove smallest
    public int poll(){
        if (size ==0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size - 1];
        size --;
        heapifyDown();
        return item;
    }

    // add element
    public void add(int item){
        ensureExtraCapacity();
        items[size] = item;
        size ++;
        heapifyUp();
    }

    public void heapifyUp(){
        int index = size -1;
        while (hasParent(index) && parent(index) > items[index]){
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }

    }

    public void heapifyDown(){
        int index = 0;
        while (hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasLeftChild(index) && rightchild(index) < leftchild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }
            if (items[index] < items[smallerChildIndex]){
                break;
            }else{
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }
    }
}
