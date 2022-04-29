import java.util.Collections;

import static java.util.Collections.swap;

public class quickSort {
    public void qucikSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    public void quickSort(int[] array, int left, int right){
        if (left >= right) return;

        int pivot = (left + right) / 2;
        int index = partition(array, left, right, pivot);
        quickSort(array, left, index - 1);
        quickSort(array, index, right);
    }

    public int partition(int[] array, int left, int right, int pivot){
        while (left <= right){
            while (array[left] < pivot){
                left ++;
            }
            while (array[right] > pivot){
                right --;
            }

            if (left <= right){
                swap(Collections.singletonList(array), left, right);
                left ++;
                right --;
            }
        }
        return left;
    }

}
