package Stack;
import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false; 
        Stack<Character> stack = new Stack<>();
        char ch;
        for(int i=0;i<s.length();i++)
        {
            ch = s.charAt(i);
            if(ch == '[')
            {
                stack.push(']');
            }
            else if(ch == '{')
            {
                stack.push('}');
            }
            else if(ch == '(')
            {
                stack.push(')');
            }
            else if(stack.empty() || stack.pop() != ch)
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}