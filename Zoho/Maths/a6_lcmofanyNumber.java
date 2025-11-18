package Maths;
import java.util.*;
public class a6_lcmofanyNumber {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
        System.out.println("Enter how maby number ");
        int n=in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("LCM ");
        int res=1;
        for(int i=1;i<n;i++)
        {
            res=lcm(res,arr[i]);
        }
        System.out.println(res);

    }

    public static int lcm(int a,int b)
    {
        return a/(gcd(a, b)) *b;

    }
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
}
