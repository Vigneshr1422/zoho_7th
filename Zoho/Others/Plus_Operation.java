package Zoho.Others;

public class Plus_Operation {
    public static void main(String[] args) {
        int a=6;
        int b=4;

        System.out.println("Addition "+a+b);
        System.out.println("Subtraction "+subtraction(a,b));
        System.out.println("Multiplication "+multi(a,b));
        System.out.println("Division "+divide(a,b));
    }
    public static int subtraction(int a,int b)
    {
        int t=0;
        int delta=(b>0) ? -1:1;
        while(b!=0)
        {
            t+=delta;
            b+=delta;
        }
        return t;
    }
    public static int multi(int a,int b) {
        int ans = 0;
        for (int i = 0; i < a; i++) {
            ans += b;
        }
        return ans;
    }

    public  static  int divide(int a, int b)
    {
        int ans=0;
        int sum=0;

        while(sum+b<=a)
        {
            sum+=b;
            ans++;
        }
        return ans;
    }

}
