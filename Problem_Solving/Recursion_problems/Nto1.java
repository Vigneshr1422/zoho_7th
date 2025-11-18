package Problem_Solving.Recursion_problems;
import java.util.*;
public class Nto1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        fun(n);
        in.close();
    }
    public static void fun(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    
}
