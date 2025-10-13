package Pdf110;

import java.util.Stack;

public class No_109_Expressionvalidate {
    public static void main(String[] args) {
        String a = "(a+b)(a-b)";  // ✅ valid
        String b = "(a+)";        // ❌ invalid

        System.out.println(ExpressionCheck(a)); // true
        System.out.println(ExpressionCheck(b)); // false
    }
    public static boolean ExpressionCheck(String a) {
        if (a.isEmpty()) return false;
        Stack<Character> st = new Stack<>();
        char prev = '\0'; // previous non-space character
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            // Case 1: Opening bracket '('
            if (x == '(') {
                // Invalid if directly after operand or ')'
                if (operand(prev) || prev == ')') return false;
                st.push(x);
            }
            // Case 2: Closing bracket ')'
            else if (x == ')') {
                // Must match a previous '('
                if (st.isEmpty() || st.peek() != '(') return false;
                st.pop();
                // Invalid if previous was operator or '('
                if (prev == '\0' || operator(prev) || prev == '(') return false;
            }
            // Case 3: Operator
            else if (operator(x)) {
                // Invalid if at start, after another operator, or after '('
                if (prev == '\0' || operator(prev) || prev == '(') return false;
            }
            // Case 4: Operand (letter or digit)
            else if (operand(x)) {
                // Invalid if directly after another operand (like "ab")
                if (operand(prev)) return false;
                // Note: operand after ')' is allowed → implicit multiplication
            }
            // Case 5: Invalid characters
            else if (!Character.isWhitespace(x)) {
                return false;
            }
            // Update prev (ignore spaces)
            if (!Character.isWhitespace(x)) {
                prev = x;
            }
        }
        // Expression cannot end with an operator
        if (operator(prev)) return false;
        // All brackets must be matched
        return st.isEmpty();
    }

    // Check if character is an operator
    public static boolean operator(char x) {
        return x == '+' || x == '-' || x == '*' || x == '/' || x == '^';
    }

    // Check if character is an operand (letter or digit)
    public static boolean operand(char x) {
        return Character.isLetterOrDigit(x);
    }
}
