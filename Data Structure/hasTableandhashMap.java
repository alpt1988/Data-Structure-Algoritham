import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

// For any problem, have has table at the top of your mind (Hash map)
// Key => value lookup
// hashtable.put("Mary", newPerson("xxxx"))
// hashtable.get("Mary)
// key -> hashcode -> index   two different could have same hashcode   differnet hashcode could map into same index
// chaining has be solution for collision, use linked list
// run time: O(1) for good hashtable
//           O(n) for terriblr hashtable
public class hasTable {
    public static void main(String[] args){
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(101, "Aili");
        ht.put(102, "something");
        ht.get(101);
        ht.get(102);

        // Hashtable and hashMap both implement Map, hashtable i a legacy calss that almost always should be avoided in favor of HashMap
        // Hashmap is faster than hastable, hashmap can store one null key and any number of null value
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Aili");
        hm.put(102, "something");
        hm.get(101);
        hm.get(102);

        // Hashset implements set, has nothgin to do with HashMap.
        // It use a HashMap internally to implement the set functionality
        HashSet<String> hs = new HashSet(){};

    }

}
