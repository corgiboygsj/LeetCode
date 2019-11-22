package leetCode.动态规划;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 */
public class Question70 {
    public static int solution(int n) {
        /**
         * 因为一次可以跳1或者2个，则跳第n个台阶的时候，可以由n-1和n-2跳一次到达，所以跳法f(n) = f(n-1) + f(n-2)
         */
        int f1 = 1;
        int f2 = 2;
        int result = 0;

        if(n == 1){
            return f1;
        }
        if(n == 2){
            return f2;
        }

        for(int i = 3; i <= n; i++){
            int temp = f2;
            f2 = f1 + f2;
            f1 = temp;
        }

        return f2;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
    }
}
