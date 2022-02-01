import java.util.HashSet;
import java.util.Set;

// Use hashset to check duplicate values
public class ContainDuplicateValues {
    public boolean solution(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            if (!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}
