package Zoho.Others;
//day 2
import java.util.Stack;

public class arithmetic {
    public static void main(String[] args) {
        String input="1244+-";

        System.out.println(Evaluate(input));
    }
    static int Evaluate(String a)
    {
        Stack<Integer>ans=new Stack<>();

        for(char x:a.toCharArray())
        {
            if(Character.isDigit(x))
            {
                ans.push(x-'0');
            }else
            {
                int s=ans.pop();
                int f=ans.pop();
                int res=0;

                switch (x)
                {
                    case '+' :
                        res=f+s;
                        break;
                    case '-' :
                        res=f-s;
                        break;
                    case '*' :
                        res=f*s;
                        break;
                    case '/':
                        res=f/s;
                        break;
                }
                ans.push(res);
            }
        }
        return ans.peek();
    }
}
