import java.util.HashMap;
import java.util.Map;


// given a string s and int k. Choose any character of the string and change it to uppercase, you can perform k action.
// return the longest substring containing the same letter
// Example: s = "ABAB"  k = 2, reutrn 4 because "AAAA" or "BBBB"

// Ket idea behind the solution.
// We created a window and adding character to the window, use the map to track the number of character in string with its count
// Expanding the window until window size - max number of certain character > k
// Then shrink the window from left side and update the char count

public class longestRepeatingCharacterReplacement {
    public int solution(String s, int k){
        Map<Character,Integer> map = new HashMap<>();
        int maxWindows = 0;
        int l = 0;
        int maxRepeat = 0;

        for (int r = 0; r <s.length(); r++){
            char c = s.charAt(r);
            if (!map.containsKey(c)){
                map.put(c,0);
            }
            map.put(c, map.get(c) + 1);

            // maxRepeat is the historical max count. We don't care it because unless it gets greater, it won't affect final window size
            maxRepeat = Math.max(maxRepeat, map.get(c));

            if (r - l + 1 -maxRepeat > k){
                char remove = s.charAt(l);
                map.put(remove, map.get(remove) - 1);
                l ++;
            }
            maxWindows = Math.max(maxWindows , r- l +1);
        }
        return maxWindows;
    }
}
