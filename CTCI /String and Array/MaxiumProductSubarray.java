public class MaxiumProductSubarray {
    public int maxProduct(int[] nums){
        if (nums == null || nums.length == 0){
            return 0;
        }

        int result = nums[0];
        int curMin = nums[0];
        int curMax = nums[0];

        for (int i =1; i <nums.length; i++){
            int temp = curMax * nums[i];
            curMax = Math.max(Math.max(nums[i] * curMax, nums[i] * curMin), nums[i]);
            curMin = Math.min(Math.min(temp, nums[i] * curMin), nums[i]);
            if (curMax > result){
                result = curMax;
            }
        }
        return result;
    }
}
