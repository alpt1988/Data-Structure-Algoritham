public class findMininRotatedSortedArray {
    public static int findMin(int[] nums){
        int result = nums[0];
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            if(nums[l] < nums[r]){
                result = Math.min(result, nums[l]);
                break;
            }

            double n = (l + r) / 2;
            int m = (int) Math.floor(n);
            result = Math.min(result, nums[m]);
            if (nums[m] >= nums[l]){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println(findMin(new int[]{3,4,5,1,2}));
    }
}
