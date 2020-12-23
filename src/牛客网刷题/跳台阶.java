package 牛客网刷题;

/**
 *
 * @author guoshoujing
 * @create 2020-12-23 10:19 上午
 */
public class 跳台阶 {
    public int JumpFloor(int target) {
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int fun1 = 1, fun2 = 2, result = 0;

        for(int i = 2; i < target; i++){
            result = fun1 + fun2;
            fun1 = fun2;
            fun2 = result;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(new 跳台阶().JumpFloor(5));
    }
}
