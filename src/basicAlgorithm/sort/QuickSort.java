package basicAlgorithm.sort;

import java.util.Arrays;

/**
 * 快排
 * @author guoshoujing
 * @create 2020-01-02 2:41 下午
 */
public class QuickSort {
    public static void quickSort(int[] arr, int begin, int end){
        if(begin >= end){
            return;
        }

        int left = begin, right = end;
        int temp = arr[begin];

        while(left < right){
            while(arr[right] >= temp && left < right){
                right--;
            }
            if(left < right){
                arr[left] = arr[right];
            }

            while(arr[left] <= temp && left < right){
                left++;
            }
            if(left < right){
                arr[right] = arr[left];
            }
        }
        arr[left] = temp;

        quickSort(arr, begin, left - 1);
        quickSort(arr, right + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {4,1,20,21,12,7,5,9,2,0,12,23,45,29,31,32,25,64,23,21,20,38,35,47};
        quickSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
