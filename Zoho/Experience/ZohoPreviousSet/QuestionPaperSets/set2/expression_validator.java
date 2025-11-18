package set2;
import java.util.*;

public class expression_validator {
    public static void main(String[] args) {
        String a = "(a+b)";
        System.out.println(validator(a));
    }

    public static boolean validator(String a) {
        if (a.length() == 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        char prev = '\0';

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == '(') {
                // ithuku previous aa letter digit vara kudathu like a() || 1()
                if (prev != '\0' && operand(prev)) return false;
                stack.push(ch);

            } else if (ch == ')') { 
                // ituku statck empty aa iruku "" ipa poi ) patha fail and verum ( first apa ipa vanthu ) -> () fail
                if (stack.isEmpty() || stack.peek() != '(') return false;
                stack.pop();

                // invalid if previous was operator -> eg: (a+)
                if (prev != '\0' && operator(prev)) return false;

            } else if (operand(ch)) {
                if (prev != '\0' && operand(prev)) return false;

            } else if (operator(ch)) {
                // operator first char || operator after another operator || operator after '('
                if (prev == '\0' || operator(prev) || prev == '(') return false;

            } else {
                // any invalid character
                return false;
            }

            if (!Character.isWhitespace(ch)) {
                prev = ch;
            }
        }

        // expression cannot end with operator
        if (operator(prev)) return false;

        // all parentheses must be closed
        return stack.isEmpty();
    }

    public static boolean operand(char ch) {
        // FIX: should be letter or digit (operand)
        return Character.isLetterOrDigit(ch);
    }

    public static boolean operator(char ch) {
        // FIX: actual operators
        return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
    }
}
