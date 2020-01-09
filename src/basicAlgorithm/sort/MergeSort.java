package basicAlgorithm.sort;

import java.util.Arrays;

/**
 * 归并排序
 * @author guoshoujing
 * @create 2020-01-02 5:01 下午
 */
public class MergeSort {
    public static void mergeSort(int[] arr, int begin, int end){
        if(begin >= end){
            return;
        }

        int mid = (begin + end) / 2;

        mergeSort(arr, begin, mid);
        mergeSort(arr, mid + 1, end);
        mergeArray(arr, begin, mid, end);
    }

    public static void mergeArray(int[] arr, int left, int mid, int right){
        int[] leftArr = new int[mid - left + 1];
        int[] rightArr = new int[right - mid];

        for(int i = left; i <= mid; i++){
            leftArr[i- left] = arr[i];
        }
        for(int i = mid + 1; i <= right; i++){
            rightArr[i - mid - 1] = arr[i];
        }

        int i = 0, j = 0, k = left;
        while(i < leftArr.length && j < rightArr.length){
            if(leftArr[i] < rightArr[j]){
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while(i < leftArr.length){
            arr[k++] = leftArr[i++];
        }
        while(j < rightArr.length){
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,1,20,21,12,7,5,9,2,0,12,23,45,29,31,32,25,64,23,21,20,38,35,47};
        mergeSort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
