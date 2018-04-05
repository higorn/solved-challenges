package higorn.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by higor on 05/04/18.
 */
public class BalancedBrackets {
    public static Map<Character, Character> bracketsMap = new HashMap<>();
    static {
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');
        bracketsMap.put('(', ')');
    }

    public static boolean isBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        if (!brackets.contains("{") && !brackets.contains("[") && !brackets.contains("(")) {
            return false;
        }
        for (char c : brackets.toCharArray()) {

            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(bracketsMap.get(c));
                    break;
                default:
                    if (!stack.isEmpty() && c == stack.peek()) {
                        stack.pop();
                    }
            }
        }
        return stack.isEmpty();
    }
}
