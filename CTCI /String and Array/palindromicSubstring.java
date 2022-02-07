public class palindromicSubstring {
    public int solution(String s){
        int res = 0;

        for (int i = 0; i < s.length(); i++){
            // odd situition
            int l1 = i;
            int r1 = i;
            res += countPali(s,l1,r1);

            // even situition
            int l2 = i;
            int r2 = i + 1;
            res += countPali(s, l2,r2);
        }

        return res;
    }


    public int countPali(String s, int l ,int r){
        int res = 0;
        while (l >= 0 && r < s.length() && s.charAt(l)==s.charAt(r)){
            res += 1;
            l -= 1;
            r += 1;
        }
        return res;
    }

}
