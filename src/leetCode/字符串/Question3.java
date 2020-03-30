package leetCode.字符串;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 *
 * 示例 1:
 *
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 *
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 *
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class Question3 {
    /**
     *  滑动窗口：设置一个滑动窗口的开始位置，这个窗口的开始值用来记录重复字符的出现位置。比如一开始位置是0字符是a，向后遍历，直到发现另一个遍历过程中的字符，则需要将窗口的开始变成第一次这个字符的位置+1，也就是改变滑动窗口的开始位置。
     *  之后继续向后遍历。遍历过程中要记录窗口字符串的长度，改变位置之后也要根据窗口大小对之前的长度进行更改。
     */
    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        int windowBegin = 0;
        int windowSize = 0;
        int lengthOfLongestSubstring = 0;

        for(int i = 0; i < s.length(); i++){
            int indexOfCharAtI;
            //如果出现重复字符
            if((indexOfCharAtI = s.indexOf(s.charAt(i), windowBegin)) != i){
                windowBegin = indexOfCharAtI + 1;
                windowSize = i - indexOfCharAtI;
            } else if(++windowSize > lengthOfLongestSubstring){
                lengthOfLongestSubstring = windowSize;
            }
        }

        return lengthOfLongestSubstring;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }
}
