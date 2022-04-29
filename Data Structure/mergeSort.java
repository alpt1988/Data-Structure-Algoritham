// merge sort, recursive sorting mthod.
// sort left half and right half. And merge those in sorted order.
// runtime is O(NlogN) need space O(N)

public class mergeSort {
    public static void mergesort(int[] array){
        mergesort(array, new int[array.length],0, array.length-1);

    }
    public static void mergesort(int[] array, int[] tmp, int leftStart, int rightEnd){
        if (leftStart >= rightEnd){return;}
        int middle = (rightEnd - leftStart) / 2;
        mergesort(array, tmp,leftStart, middle);
        mergesort(array, tmp,middle + 1, rightEnd);
        mergehalve(array, tmp,leftStart, rightEnd);
    }

    public static void mergehalve(int[] array, int[] tmp,int leftstart, int rightend){
        int leftend = (rightend + leftstart) / 2;
        int rightstart = leftend + 1;
        int size = rightend = leftstart + 1;

        int left = leftstart;
        int right = rightstart;

        int index = leftstart;

        while (left <= leftend && right <= rightend){
            if (array[left] <= array[right]){
                tmp[index] = array[left];
                left ++;
            }else{
                tmp[index] = array[right];
                right ++;
            }
            index ++;
        }

        // copy over the left remaminder factor
        System.arraycopy(array, left, tmp, index, leftend - left +1);
        // copy over the right remainder factor
        System.arraycopy(array, right, tmp, index, rightend - left +1);
        // copy everything from tmp to array
        System.arraycopy(tmp, leftstart, array, leftstart, size);
    }
}
