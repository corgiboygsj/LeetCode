package leetCode.动态规划;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定不同面额的硬币 coins 和一个总金额 amount。编写一个函数来计算可以凑成总金额所需的最少的硬币个数。如果没有任何一种硬币组合能组成总金额，返回 -1。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: coins = [1, 2, 5], amount = 11
 * 输出: 3
 * 解释: 11 = 5 + 5 + 1
 * 示例 2:
 *
 * 输入: coins = [2], amount = 3
 * 输出: -1
 *
 * @author guoshoujing
 * @create 2020-09-15 4:50 下午
 */
public class Question322 {
    public static int coinChange(int[] coins, int amount) {
        List<Integer> dp = new ArrayList<>(amount + 1);
        for(int i = 0; i <= amount; i++){
            dp.add(i, amount + 1);
        }
        dp.set(0, 0);

        for(int i = 0; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){
                if(i < coins[j]) continue;
                dp.set(i, Math.min(dp.get(i), 1 + dp.get(i - coins[j])));
            }
        }

        return dp.get(amount) >= amount + 1 ? -1 : dp.get(amount);
    }

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{186,419,83,408}, 6249));
    }
}
