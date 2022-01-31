import java.util.HashMap;
import java.util.Map;

public class validAnagram {
    public boolean solution(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> countS = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();

        //
        for (char c : s.toCharArray()){
            countS.put(c, countS.getOrDefault(c,0)+1);
        }
        for (char c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c,0)+1);
        }

        if (countS.equals(countT)){
            return true;
        }else{return false;}
    }
}
