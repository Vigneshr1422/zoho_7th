package Problem_Solving.Recursion_problems;

import java.util.Scanner;

public class print {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        fun(1,n);
        in.close();
    }

    public static void fun(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.println("Vignesh");
        fun(i+1, n);

    }
    
}
