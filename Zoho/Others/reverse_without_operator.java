package Zoho.Others;

import java.util.Stack;

public class reverse_without_operator {
    public static void main(String[] args) {
        String a="Hi+ bro";
        System.out.println("Answer is "+reverse(a));
    }
    public static String reverse(String a)
    {
StringBuilder ans=new StringBuilder();
Stack<Character>stack=new Stack<>();

        for(char x:a.toCharArray())
        {
            if(Character.isLetterOrDigit(x)) {
                stack.push(x);
            }
        }
        for(int i=0;i<a.length();i++)
        {
            if(Character.isLetterOrDigit(a.charAt(i)))
            {
                ans.append(stack.pop());
            }else
            {
                ans.append(a.charAt(i));
            }
        }
        return ans.toString();
    }
}
