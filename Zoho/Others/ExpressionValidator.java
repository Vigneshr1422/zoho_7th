package Zoho.Others;
import java.util.*;

public class ExpressionValidator {
    public static void main(String[] args) {
        String x="()";
        System.out.println(express(x));
    }
    public static  boolean express(String str)
    {
        char []arr=str.toCharArray();
        Stack<Character>st=new Stack<>();
        for(int i=0;i<arr.length;i++)
        {
            char x=arr[i];
            if(x=='('){
                st.add(x);
            }else if(x==')')
            {
                if(st.isEmpty() || st.peek()!='(')
                {
                    return  false;
                }
                st.pop();
            }

            if(i>0)
            {
                char prev=arr[i-1];

                if(Character.isLetter(prev) &&  Character.isLetter(x)){
                    return false;
                }
                if(operator(prev) && operator(x)){
                    return false;
                }

            }


        }
        return st.isEmpty();
    }

    public static  boolean operator(char x)
    {
        if(x=='+' || x=='-' || x=='*'|| x=='/'|| x=='^')
        {
            return true;
        }
        return false;
    }
//        public static boolean isValidExpression(String expr) {
//            Stack<Character> stack = new Stack<>();
//            char[] arr = expr.toCharArray();
//
//            for (int i = 0; i < arr.length; i++) {
//                char ch = arr[i];
//
//                // 1. Check for balanced parentheses
//                if (ch == '(') {
//                    stack.push(ch);
//                } else if (ch == ')') {
//                    if (stack.isEmpty() || stack.peek() != '(')
//                        return false;
//                    stack.pop();
//                }
//
//                // 2. Check for invalid character combinations
//                if (i > 0) {
//                    char prev = arr[i - 1];
//                    if (Character.isLetter(prev) && Character.isLetter(ch)) {
//                        // Two letters together (like ab) without an operator
//                        return false;
//                    }
//                    if (isOperator(prev) && isOperator(ch)) {
//                        // Two operators together (++ or **)
//                        return false;
//                    }
//                }
//            }
//
//            // 3. After loop, stack must be empty
//            return stack.isEmpty();
//        }
//
//        public static boolean isOperator(char ch) {
//            return ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^';
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter expression: ");
//            String expr = sc.nextLine().replaceAll("\\s+", "");
//
//            if (isValidExpression(expr))
//                System.out.println("Valid");
//            else
//                System.out.println("Invalid");
//        }
    }


