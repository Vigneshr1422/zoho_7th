package Mathemetics;
// addition without + ok
public class sum {
    public static void main(String[] args) {
        int a=5;
        int b=5;

        while(b!=0)
        {
            int c=(a&b)<<1;
            a=a^b;
            b=c;
        }
        System.out.println(a);
    }
}
