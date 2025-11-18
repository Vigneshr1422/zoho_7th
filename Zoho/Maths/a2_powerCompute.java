package Maths;
public class a2_powerCompute
{
    public static void main(String[] args) {
        bruteforce();
        optimal();
    }

    public static void optimal()
    {
        int a=15;
        int b=3;
        int c=7;
        a=a%c;
        int res=1;
        while(b!=0){
            if((b&1)==1){
                res=(res*a)%c;

            }
            a=a%c;
            b=b>>1;
        }
    }

    public static void bruteforce()
    {
        int a=15;
        int b=3;
        int c=7;
        int res=1;
         for(int i=1;i<=b;i++){
            res=res*a;
        }
        System.out.println(res%c);
    }
}