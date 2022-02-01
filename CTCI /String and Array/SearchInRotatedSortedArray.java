public class SearchInRotatedSortedArray {
    public static int search(int nums[], int target){
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            int n =  (l + r) / 2;
            int m = (int) Math.floor(n);
            if (target == nums[m]){
                return m;
            }

            // left sorted portion
            if(nums[l] <= nums[m]){
                if (target >= nums[l] && target < nums[m]){
                    r = m - 1;
                }else{
                    l = m + 1;
                }
            }else{
                if (target > nums[m] && target <= nums[r]){
                    l = m + 1;
                }else{
                    r = m - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(search(new int[]{4,5,6,7, 0, 1, 2}, 5));
    }



}
