package leetCode.回溯法;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 *
 * 示例:
 *
 * 输入: nums = [1,2,3]
 * 输出:
 * [
 *   [3],
 *   [1],
 *   [2],
 *   [1,2,3],
 *   [1,3],
 *   [2,3],
 *   [1,2],
 *   []
 * ]
 */
public class Question78 {
    private static List<List<Integer>> result = new ArrayList<>();
    /**
     * 思路：首先最小的子集是[]，从单个节点依次向下延伸，对于元素后面的元素都有选择与不选择的可能，如果选择了就可以继续向下继续延伸。
     *      层的深度也就表示了子集中元素的数量。
     *                           [ ]
     *                      /     |    \
     *                   [1]     [2]   [3]   index = 0
     *                  /  \       \
     *              [1][2] [1][3]  [2][3]    index = 1
     *                /
     *           [1][2][3]                   index = 2
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<Integer> subList = new ArrayList<>();
        getSub(nums, 0, subList);
        return result;
    }

    private static void getSub(int[] nums, int index, List<Integer> subList){
        result.add(new ArrayList<>(subList));
        //依次选择一层中的剩余每个元素
        for(int i = index; i < nums.length; i++){
            subList.add(nums[i]);
            //向下延伸选择下层之后的节点
            getSub(nums, i + 1, subList);
            //因为下层结束，需要回溯到上层。回溯到上层之前要删除掉最后一个元素，原因是要恢复到上层向下延伸之前的状态。
            subList.remove(subList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
    }
}
