import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        // Use Deque for better performance than Stack class
        Deque<Character> stack = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {
            // Push corresponding closing bracket onto stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        
        // If stack is empty, all brackets matched
        return stack.isEmpty();
    }
}
