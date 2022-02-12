import java.util.LinkedList;
import java.util.List;

public class encodeAndDecode {
    public String encode(List<String> strs){
        String res = "";
        for (String s : strs){
            res += s.length() + "#" + s;
        }
        return res;
    }


    public List<String> decode(String str){
        List<String> res = new LinkedList<>();
        int i = 0;

        while (i < str.length()){
            int j = i;
            while (str.charAt(j) != '#' ){
                j += 1;
            }
            int length = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j+1, j+1+length));
            i = j + 1 +length;
        }
        return res;
    }

}
