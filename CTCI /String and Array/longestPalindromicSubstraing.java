public class longestPalindromicSubstraing {
    public static String solution(String s){
        String res = "";
        int resLength = 0;

        for (int i = 0; i < s.length(); i ++){
            // odd length
            int l = i;
            int r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                if ((r - l + 1) > resLength){
                    res = s.substring(l,r+1);
                    resLength = r - l + 1;
                }
                l -= 1;
                r += 1;
            }
            // even length
            int l2 = i;
            int r2 = i+1;
            while (l2 >= 0 && r2 < s.length() && s.charAt(l2) == s.charAt(r2)){
                if ((r2 - l2 + 1) > resLength){
                    res = s.substring(l2,r2+1);
                    resLength = r2 - l2 + 1;
                }
                l2 -= 1;
                r2 += 1;
            }
        }
        return res;
    }

}
