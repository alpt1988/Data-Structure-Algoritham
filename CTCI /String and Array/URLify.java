public class URLify {
// This method will replace all spaces in a string to %20. And you will know the true length of the string.
// For example, "Mr John Smith    " 13, will turn into "Mr%20John%20smith"
    static void replaceSpace(char[] str, int truelength){
        int numberOfSpce = countOfChar(str,0,truelength,' ');
        int newIndex = truelength - 1 + numberOfSpce * 2;

        // If there are excess, add a null character. this indicates that the sapce after the last char is not reaplced with %20
        if (newIndex + 1 < str.length){
            str[newIndex+1] = '\0';
        }
        for (int oldIndex=truelength-1; oldIndex>=0; oldIndex -=1){
            if (str[oldIndex] == ' '){
                str[newIndex] = '0';
                str[newIndex-1] = '2';
                str[newIndex-2] = '%';
                newIndex -= 3;
            } else{
                str[newIndex] = str[oldIndex];
                newIndex -= 1;
            }
        }
    }


    // This method count occurrence of target in a string between start and end.
    static int countOfChar(char[] str, int start, int end, int target){
        int count = 0;
        for (int i=0; i<str.length; i++){
            if (str[i]==target){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args){
        replaceSpace("Mr John Smith   ".toCharArray(), 13);
    }
}
