package Maths;

public class a3_lastdigitofab {
    
    public static void main(String[] args) {
        bf();
        optimal();
    }
    public static void bf()
    {
        int a=15;
        int b=3;
        int res=1;
        for(int  i=1;i<=b;i++){
            res=res*a;
        }
        System.out.println(res%10);
    }

    public static void optimal()
    {
        int a=15;
        int b=3;
        
        int last=a%10;

        int s=((b-1)%4)+1;
        int ans=1;
        for(int i=0;i<s;i++){
            ans=(ans*last)%10;
        }
        System.out.println(ans);
    }
}
