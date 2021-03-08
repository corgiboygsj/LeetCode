package 牛客网刷题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author guoshoujing
 * @create 2020-12-23 7:41 下午
 */
public class 括号序列 {
    public boolean isValid (String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < chars.length; i++){
            if(stack.isEmpty()){
                stack.push(chars[i]);
                continue;
            }
            Character peekChar = stack.peek();
            if(peekChar == '('){
                if(chars[i] == '}' || chars[i] == ']')
                    return false;
                if(chars[i] == ')')
                    stack.pop();
                else
                    stack.push(chars[i]);
            } else if(peekChar == '[') {
                if(chars[i] == '}' || chars[i] == ')')
                    return false;
                if(chars[i] == ']')
                    stack.pop();
                else
                    stack.push(chars[i]);
            } else {
                if(chars[i] == ']' || chars[i] == ')')
                    return false;
                if(chars[i] == '}')
                    stack.pop();
                else
                    stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }
}
