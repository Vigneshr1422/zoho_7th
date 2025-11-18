package Ninety_program;

public class SmallAndBig {
    public static void main(String[] args) {
//        small4();
//        smallusingop();
        big4();
        bigusingop();
    }
    public static void small4()
    {
        int a=1;
        int b=25;
        int c=24;
        int d=15;
        int ans=Math.min(Math.min(a,b),Math.min(c,d));
        System.out.println(ans);
    }
    public static void smallusingop()
    {
        int a=4;
        int b=17;
        int c=1;
        int d=25;
        int min=a;

        if(b<min)
        {
            min=b;
        }
        if(c<min)
        {
            min=c;
        }
        if(d<min)
        {
            min=d;
        }
        System.out.println("Minimum "+min);
    }

    public static void big4()
    {
        int a=1;
        int b=25;
        int c=24;
        int d=15;
        int ans=Math.max(Math.max(a,b),Math.max(c,d));
        System.out.println(ans);
    }
    public static void bigusingop()
    {
        int a=4;
        int b=17;
        int c=1;
        int d=25;
        int min=a;

        if(b>min)
        {
            min=b;
        }
        if(c>min)
        {
            min=c;
        }
        if(d>min)
        {
            min=d;
        }
        System.out.println("Maximum "+min);
    }
}
