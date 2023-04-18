package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    
    public static boolean Task3(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.empty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
