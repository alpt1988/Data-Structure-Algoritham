public class validPalindrome {
    public boolean solution(String s){
        if (s.isEmpty()){
            return true;
        }

        int l = 0;
        int r = s.length()-1;
        char head, tail;

        while (l <= r){
            head = s.charAt(l);
            tail = s.charAt(r);
            if (!Character.isLetterOrDigit(head)){
                l++;
            }else if (!Character.isLetterOrDigit(tail)){
                r--;
            }else{
                if (Character.toLowerCase(head) != Character.toLowerCase(tail)){
                    return false;
                }
                l++;
                r--;
            }
        }
        return true;
    }
}
