package Mathemetics;

public class Lcm {
    public static void main(String[] args) {
        int a=12;
        int b=15;

        int gcdans=gcd_fun(a,b);

        int lcm=(a*b)/gcdans;
        System.out.println("Lcm answer "+lcm);
    }
    public static int  gcd_fun(int x,int y)
    {
        while(y!=0)
        {
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;

    }
    
}
