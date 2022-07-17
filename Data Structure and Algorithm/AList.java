import java.util.ArrayList;

// Array based list
public class AList<Item> {

    //         0,1,2,3,4
    // items: [2,3,6,8,3,0,0,0,0,0...]
    //  size: 5


    // addLst: The next item add will go into position size
    // getLast: The item in the last is at size - 1
    // size: Is the number of items in the list

    private Item[] items;
    private int size;

    public AList(){
        items = (Item[]) new Object[100];
        size = 0;
    }


    private void resize(int capacity){
        Item[] a = (Item[]) new Object[capacity];
        System.arraycopy(items, 0 ,a, 0, size);
        items = a;
    }

    public void addLast(Item x){
        if (size == items.length){
            resize(size + 1);
        }
        items[size] = x;
        size += 1;
    }

    public Item getLast(){
        return items[size-1];
    }

    public Item get(int i){
        return items[i];
    }

    public int size(){
        return size;
    }

    public Item removeLast(){
        Item x = getLast();
        items[size -1] = null;
        size -= 1;
        return x;
    }
}
