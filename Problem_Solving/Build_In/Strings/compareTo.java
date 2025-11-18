package Problem_Solving.Build_In.Strings;

public class compareTo {
    public static void main(String[] args) {
        String a = "axioz";
        String b = "aaios";

        int ans=compareToFun(a,b);

        if(ans==0)
        {

        }
    }
    public static int compareToFun(String a,String b)
    {
        int n=a.length();
        int m=b.length();

        int x=Math.min(n,m);
        for(int i=0;i<x;i++)
        {
            char y=a.charAt(i);
            char z=b.charAt(i);

            if(y!=z)
            {
                return y-z;
            }
        }
        return n-m;
    }
}
