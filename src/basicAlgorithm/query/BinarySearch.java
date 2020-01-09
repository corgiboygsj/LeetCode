package basicAlgorithm.query;

/**
 * 二分查找
 * @author guoshoujing
 * @create 2020-01-02 10:32 上午
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int findItem){
        if(arr.length == 0){
            return -1;
        }

        int begin = 0;
        int end = arr.length - 1;
        int mid;

        while (begin <= end){
            mid = (begin + end) / 2;
            if(arr[mid] == findItem){
                return mid;
            } else if(arr[mid] > findItem){
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,5,6,9,12,14,17,20,28,34,49,50};
        System.out.println(binarySearch(arr, 28));
        System.out.println(binarySearch(arr, 7));
        System.out.println(binarySearch(arr, 2));
        System.out.println(binarySearch(arr, 1));
        System.out.println(binarySearch(arr, 50));
    }
}
