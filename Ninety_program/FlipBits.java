package Ninety_program;

public class FlipBits {
    public static void main(String[] args) {
//        fliplastonebit();
//        flipallbit();
        flip4bit();
    }
    public static void flipallbit()
    {
        int a=2;
        int res=~a;
        System.out.println("Before "+Integer.toBinaryString(a));
        System.out.println("After "+Integer.toBinaryString(res));
    };
    public static void fliplastonebit()
    {
        int a=4;
        int ans=a^1;

        System.out.println(a+" is binary "+Integer.toBinaryString(a));
        System.out.println(ans+" ans binary "+Integer.toBinaryString(ans));
    }

    public static void flip4bit()
    {
        int a=1;
        int fbit=0b1111;
        int ans=a^fbit;
        System.out.println("Before a is "+Integer.toBinaryString(a));
        System.out.println("After ans is "+Integer.toBinaryString(ans));

    }
}
