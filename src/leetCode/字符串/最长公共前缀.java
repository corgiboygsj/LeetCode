package leetCode.字符串;

/**
 * @author guoshoujing
 * @create 2021-01-13 4:22 下午
 */
public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        String commonPrefix = null;

        if(strs.length == 1){
            return strs[0];
        }

        for(int i = 1; i < strs.length; i++){
            if("".equals(strs[i]) || "".equals(commonPrefix)){
                return "";
            }
            if(commonPrefix == null){
                commonPrefix = commonPrefix(strs[0], strs[i]);
            } else {
                commonPrefix = commonPrefix(commonPrefix, strs[i]);
            }
        }

        return commonPrefix == null ? "" : commonPrefix;
    }

    private String commonPrefix(String currentPrefix, String s){
        int minLength = Math.min(currentPrefix.length(), s.length());
        StringBuilder common = new StringBuilder();

        for(int i = 0; i < minLength; i++){
            if(currentPrefix.charAt(i) != s.charAt(i)){
                return currentPrefix.substring(0, i);
            } else {
                common.append(currentPrefix.charAt(i));
            }
        }

        return common.toString();
    }

    public static void main(String[] args) {
        String[] s = new String[]{"ab", "a"};
        System.out.println(new 最长公共前缀().longestCommonPrefix(s));
    }
}
