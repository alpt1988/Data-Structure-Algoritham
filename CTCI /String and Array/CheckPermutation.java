import java.util.Arrays;
public class CheckPermutation {
// This method will compare two string and determine if t is permutation of the s. For example,
// if string s is dog, then the permutation of string t should be god. It is case-sensitive and whitespace
// sensitive.
    static boolean Permutation(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        return sort(s).equals(sort(t));
    }

    static String sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public static void main(String[] args){
        System.out.print(Permutation("abcdefg","bcdefga"));
    }
}
