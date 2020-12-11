package 牛客网刷题;

/**
 * 题目描述
 * 请实现有重复数字的有序数组的二分查找。
 * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
 * 示例1
 * 输入
 * 复制
 * 5,4,[1,2,4,4,5]
 * 返回值
 * 复制
 * 3
 * 说明
 * 输出位置从1开始计算
 *
 * @author guoshoujing
 * @create 2020-12-08 6:41 下午
 */
public class 二分查找 {
    public static int upper_bound_ (int n, int v, int[] a) {
        int start = 0, end = a.length - 1, mid, result = n;
        while(start <= end){
            mid = (start + end) / 2;
            if(a[mid] >= v){
                end = mid - 1;
                result = mid;
            } else if (a[mid] < v){
                start = mid + 1;
            }
        }

        return result + 1;
    }

    public static void main(String[] args) {
        System.out.println(upper_bound_(100, 99, new int[]{2,3,4,4,4,7,7,8,10,10,11,12,13,14,15,15,17,18,19,23,24,24,24,24,25,26,26,26,27,27,28,29,29,30,33,36,38,38,40,40,41,43,43,43,44,46,46,47,51,52,52,53,54,56,57,57,57,58,58,61,61,61,62,64,64,66,66,67,67,67,70,72,74,74,74,75,75,78,78,78,79,79,80,83,83,83,83,84,84,86,88,89,89,90,91,91,92,93,93,96}));
    }
}
