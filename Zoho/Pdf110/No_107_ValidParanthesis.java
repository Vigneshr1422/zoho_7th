package Zoho.Pdf110;

import java.util.Stack;

public class No_107_ValidParanthesis {
    public static void main(String[] args) {
        String a = "((abc))";
        System.out.println(CheckParenthesis(a));
    }

    public static boolean CheckParenthesis(String a) {
        Stack<Character> st = new Stack<>();

        for (char x : a.toCharArray()) {
            if (x == '(') {
                st.push(x);
            }
            else if(x==')'){
                if(st.isEmpty()) return false;
                st.pop();
            }
        }

        return st.isEmpty();

    }
}
