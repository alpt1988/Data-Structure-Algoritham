public class MaxSubbary {
    public int solution(int[] nums){
        int maxSub = 0;
        int curSum = 0;

        for (int i = 0; i < nums.length; i++){
            if (curSum < 0){
                curSum = 0;
            }
            curSum = curSum + nums[i];
            maxSub = Math.max(curSum, maxSub);
        }
        return maxSub;
    }

}
