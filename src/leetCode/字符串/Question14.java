package leetCode.字符串;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 */
public class Question14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        String subString = strs[0];
        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(subString) != 0){
                subString = subString.substring(0, subString.length() - 1);
                if(subString.length() == 0){
                    return "";
                }
            }
        }
        return subString;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));

        String[] strs1 = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs1));
    }
}
