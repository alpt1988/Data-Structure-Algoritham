public class BinarySearch {
    public static boolean binarySearchRecursive(int[] array, int x, int left, int right){
        if (left < right){
            return false;
        }
        // int mid = left + ((right- left) / 2) to prevent interger overflow
        int mid = (left + right) / 2;
        if (array[mid] == x){
            return true;
        }else if (x < array[mid]) {
            return binarySearchRecursive(array, x, left, mid -1);
        }else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }

    }

    public static boolean binarySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length -1);
        }


    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        // int mid = left + ((right- left) / 2) to prevent interger overflow
        while (left < right) {
            int mid = (left + right) / 2;
            if (array[mid] == x) {
                return true;
            } else if (x < array[mid]) {
                right = mid -1;

            } else {
                left = mid + 1;
            }

        }
        return false;
    }
}
