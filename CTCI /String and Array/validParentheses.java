import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class validParentheses {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (c == ')') {
                    if ('(' != stack.pop())
                        return false;
                     }
                else if (c == ']') {
                        if ('[' != stack.pop())
                            return false;
                    }
                else if (c == '}') {
                        if ('{' != stack.pop())
                            return false;
                    }
                }
            }
        return stack.isEmpty();
    }
}
