package Ninety_program;


import java.util.ArrayList;
import java.util.HashMap;

public class Ninety {
    public static void Substraction()
    {
        int a=14;
        int b=11;
        int ans=Addition(~b,1);
        int f=Addition(a,ans);
        System.out.println(f);


    }

    public static  int Addition(int x,int y)
    {
        int a=x;
        int b=y;
        while(b!=0)
        {
            int c=a&b; // define carry
            a=a^b;
            b=c<<1;

        }
//        System.out.println(a);
        return a;
    }
    public static void multiply()
    {
        int a=5;
        int b=-2;
        int r=0;
        boolean bool = (a < 0) ^ (b < 0);

        a=Math.abs(a);
        b=Math.abs(b);

        int min=Math.min(a,b);
        int max=Math.max(a,b);
        for(int i=0;i<min;i++)
        {
            r+=max;

        }
        int ans=bool?-r:r;
        System.out.println(ans);
    }
    public static  void divide()
    {
        int a=-15;
        int b=3;
        boolean cheak=(a<0) ^ (b<0);
        if(b==0)
        {
            throw  new ArithmeticException("dei zero da ");
        }
        a=Math.abs(a);
        b=Math.abs(b);
        int r=0;
        while(a>=b)
        {
            a=a-b;
            r++;
        }

        int ans=cheak?-r:r;
        System.out.println(ans);
    }
    public static void flip()
    {
        int a=4;
        System.out.println(a+" is binary String "+Integer.toBinaryString(a));
        int ans=~a;
        System.out.println(ans);
        System.out.println(ans+" is binary String "+Integer.toBinaryString(ans));
        System.out.println("flip "+ans);

    }

    public static void AddEven()
    {
        int a=1;
        if((a&1)==0)
        {
            System.out.println("Even");

        }
        else {
            System.out.println("Add");
        }
    }

    public static void PosNeg_without_Op()
    {
        int a=2;
        int ans=a<<31;

        if(ans==0)
        {
            System.out.println("even");
        }
        else {
            System.out.println("add");
        }
    }

    public static void digitcount()
    {
        int a=14788;
        int sum=0;
        while(a!=0)
        {
            int rem=a%10;
            sum++;
            a/=10;
        }
        System.out.println(sum);
    }

    public static void factorfind()
    {
        int a=9;
        int c=0;

        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
            }
        }
         String ans= c%2==0 ? "Even ": "Add";
        System.out.println(ans);
    }
    public static void powerOf2() {
        int a = 67;
        boolean ans = (a > 0) && ((a & (a - 1)) == 0);

        if (ans) {
            System.out.println(a + " can be expressed as 2^x.");
        } else {
            System.out.println(a + " cannot be expressed as 2^x.");
        }
    }

    public static void oddevenBIts()
    {
        int a=1457;
        int add=0;
        int even=0;

        while(a!=0)
        {
            int rem=a%10;
            if(rem%2!=0)
            {
                add++;
            }else
            {
                even++;
            }
            a/=10;
        }
        System.out.println("Add is "+ add+" even is "+even);
    }

    public static void maxdigit()
    {
        int n=1478565;
        int ans=0;

        while(n!=0)
        {
            int rem=n%10;
            ans=Math.max(ans,rem);
            n/=10;
        }
        System.out.println(ans);
    }





    public static void call()
    {
        //        Addition(5,8) ;
        //        Substraction();
        //        multiply()
        //        divide();
        //        flip();
        //        complement();
        //        AddEven();
        //        PosNeg_without_Op();
        //        digitcount();
        //        factorfind();
        //        powerOf2();
        //        oddevenBIts();
        maxdigit();

    }

    public static void main(String[] args) {
            call();
    }




}
