package leetCode.动态规划;

/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 *
 * 输入: [-2,1,-3,4,-1,2,1,-5,4],
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class Question53 {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int max = arr[0];
        int temp = max;

        for(int i = 1; i < arr.length; i++){
            if(temp > 0){
                temp += arr[i];
            } else {
                temp = arr[i];
            }
            max = Math.max(temp, max);
        }
    }
}
