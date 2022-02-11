import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeInterval {
    public int[][] solution(int[][] intervals){
        if (intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));

        List<int[]> result = new ArrayList<>();
        for (int[] interval : intervals){
            // if list is empty or does not overlap, just append
            if (result.isEmpty() || result.get(result.size()-1)[1] < interval[0]){
                result.add(interval);
            }else{
                // if overlap, merge the current and previous interval
                result.get(result.size()-1)[1] = Math.max(result.get(result.size()-1)[1], interval[1]);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
