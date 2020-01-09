package basicAlgorithm.sort;

import java.util.Arrays;

/**
 * @author guoshoujing
 * @create 2020-01-02 11:42 上午
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int compareCount = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j <= arr.length - 1; j++){
                compareCount++;
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }

        System.out.println("bubbleSort compareCount:" + compareCount);
    }

    public static void bubbleSortOptimization1(int[] arr){
        int compareCount = 0;
        int flag = arr.length - 1;
        for(int i = 0; i < arr.length; i++, flag--){
            for(int j = 1; j <= flag; j++){
                compareCount++;
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }

        System.out.println("bubbleSortOptimization1 compareCount:" + compareCount);
    }

    public static void bubbleSortOptimization2(int[] arr){
        int compareCount = 0;
        int flag = arr.length - 1;
        int f = flag;
        int tempF = f;
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j <= flag; j++){
                compareCount++;
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                    f = j - 1;
                }
            }
            if(tempF == f){
                flag --;
            } else {
                tempF = f;
                flag = f;
            }
        }

        System.out.println("bubbleSortOptimization2 compareCount:" + compareCount);
    }

    private static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,20,21,12,7,5,9,2,0,12,23,45,29,31,32,25,64,23,21,20,38,35,47};
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, arr.length);

        bubbleSort(arr1);
        bubbleSortOptimization1(arr2);
        bubbleSortOptimization2(arr3);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
