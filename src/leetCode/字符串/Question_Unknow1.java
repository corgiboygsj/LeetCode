package leetCode.字符串;

import java.util.Arrays;

/**
 * 题目：
 * 输入一个数字，比如1234，返回一个由这四个数字组成的，比给定数字大的，最小的数字
 * 输入1234，返回1243
 * 输入1243，返回1324
 * 输入1324，返回1342
 *
 * 后面如果小于前面则不能操作
 * 前面小于后面直接调换位置
 */
public class Question_Unknow1 {
    public static void main(String[] args) {
        System.out.println(test(1243));

        System.out.println(test(1563987));
        System.out.println(test(1643927));
        System.out.println(test(95623987));
    }

    private static Integer test(Integer num){
        char[] chars = String.valueOf(num).toCharArray();

        int index = 0;

        if(chars[chars.length - 1] > chars[chars.length - 2]){
            swap(chars, chars.length - 1, chars.length - 2);
            return Integer.valueOf(new String(chars));
        }

        for(int i = chars.length - 1; i > 0; i--){
            if(chars[i] > chars[i - 1]){
                index = i - 1;
                swap(chars, index, chars.length - 1);
                Arrays.sort(chars, index + 1, chars.length);
                break;
            }
        }
        return Integer.valueOf(new String(chars));
    }

    private static void swap(char[] arr, int index1, int index2){
        char temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
