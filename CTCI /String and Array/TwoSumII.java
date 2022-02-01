public class TwoSumII {
    public static int[] twoSumII(int[] nums, int target){
        int l = 0;
        int r = nums.length-1;

        while (l < r){
            int curSum = nums[l] + nums[r];

            if (curSum > target){
                r = r - 1;
            }else if(curSum < target){
                l = l + 1;
            }else{
                return new int[]{l+1, r+1};
            }
        }
        return null;
    }

}
