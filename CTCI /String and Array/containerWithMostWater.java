public class containerWithMostWater {
    public int solution(int[] height){
        int res = 0;
        int l = 0;
        int r = height.length - 1;

        while (l < r){
            int area = (r - l) * Math.min(height[l], height[r]);
            res = Math.max(area, res);

            if (height[l] < height[r]){
                l = l +1;
            }else{
                r = r - 1;
            }
        }
        return res;
    }
}
