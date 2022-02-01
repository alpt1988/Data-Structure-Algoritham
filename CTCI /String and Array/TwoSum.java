import java.util.HashMap;
import java.util.Map;


// Hashmap store in key/value pair. It can be string or interger. It has  methods,
// Hashmap.put("USA", "DC")
// Hashmap.get("USA")
// Hashmap.remove("USA")
// Hashmap.containtskey("USA")
public class TwoSum {
    public int[] TwoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return null;
    }

}
