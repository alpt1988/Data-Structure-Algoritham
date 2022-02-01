import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class threeSum {
    public List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();

        for (int i = 0; i < nums.length - 2; i ++){
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int l = i + 1;
                int r = nums.length - 1;
                int sum = 0 - nums[i];
                while (l < r){
                    if (nums[l] + nums[r] == sum){
                        res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l+1]){
                        l = l + 1;
                        }
                        while (l < r && nums[r] == nums[r-1]){
                        r = r - 1;
                        }
                        l = l + 1;
                        r = r - 1;
                }else if(nums[l] + nums[r] < sum){
                        l = l + 1;
                    }else{
                    r = r - 1;}
                }
            }
        }
        return res;
    }
}
