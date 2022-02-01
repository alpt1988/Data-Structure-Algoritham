import java.util.HashSet;
import java.util.Set;

public class longestSubString {
    public int solution(String s){
        Set<Character> hs = new HashSet<>();
        int l = 0;
        int res = 0;

        for (int r = 0; r <s.length(); r++){
            while (hs.contains(s.charAt(r))){
                hs.remove(s.charAt(l));
                l += 1;
            }
            hs.add(s.charAt(r));
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
