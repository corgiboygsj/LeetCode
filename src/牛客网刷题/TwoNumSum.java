package 牛客网刷题;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoshoujing
 * @create 2020-12-16 7:04 下午
 */
public class TwoNumSum {
    public int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        int max = 0, min = 0;
        for(int i = 0; i < numbers.length; i++){
            Integer index = map.get(target - numbers[i]);
            if(index != null && index != i){
                if(++i > ++index){
                    max = i;
                    min = index;
                } else {
                    max = index;
                    min = i;
                }
            }
        }

        return new int[]{min, max};
    }
}
