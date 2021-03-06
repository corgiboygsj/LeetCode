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

        //思路：记录前面连续的最大值，但是如果最大值的值小于0了，那么向后加值肯定小于0+后面的值，所以如果当前最大值小于0就将最大值设置为后续值。
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
