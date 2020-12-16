package 牛客网刷题;

import java.util.HashMap;
import java.util.Map;

/**
 * 题目描述
 * 给定一个数组arr，返回arr的最长无的重复子串的长度(无重复指的是所有数字都不相同)。
 *
 * @author guoshoujing
 * @create 2020-12-14 10:21 上午
 */
public class 最长无重复字符子串长度 {
    public int maxLength (int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int strBegin, strEnd, maxSubStrLength = 0;
        for(strBegin = 0, strEnd = 0; strEnd < arr.length; strEnd++){
            if(map.containsKey(arr[strEnd])){
                strBegin = Math.max(strBegin, map.get(arr[strEnd]) + 1);
            }
            map.put(arr[strEnd], strEnd);
            maxSubStrLength = Math.max(maxSubStrLength, strEnd - strBegin + 1);
        }

        return maxSubStrLength;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,2,3,4,5,6,2};
        System.out.println(new 最长无重复字符子串长度().maxLength(arr));
    }
}
