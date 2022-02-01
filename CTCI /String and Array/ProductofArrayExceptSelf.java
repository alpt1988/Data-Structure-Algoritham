public class ProductofArrayExceptSelf {
    public int[] solution(int[] nums){
        int[] solution = new int[nums.length];

        int prefix = 1;
        for (int i = 0; i < nums.length; i++){
            solution[i] = prefix;
            prefix = prefix * solution[i];
        }
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--){
            solution[i] = solution[i] * postfix;
            postfix = postfix * nums[i];
        }
        return solution;
    }
}
