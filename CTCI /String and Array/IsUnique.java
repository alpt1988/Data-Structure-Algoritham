class IsUnique{
    // This algorithm will determine if a string has all unique characters. It will return true if all
    // character is unique.
    // Example: string array will return false, becuase there are two r. But string ok will return true
    // Will use ASCII character, it only has 128. Unicode has more than 143859
    static boolean IsUnique(String str){
        if(str.length() > 128)
            return false;

        boolean[] char_set = new boolean[128];
        for (int i=0; i<str.length(); i++){
            int val = str.charAt(i);
            if(char_set[val]){
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.print(IsUnique("also"));
    }

}