package zohosalem;

public class multiply {
    public static void main(String[] args) {
        String a="0062";
        String b="2";

        System.out.println(function(a,b));

    }

    public static int function(String a, String b)
    {
        int num1=intint(a);
        int num2=intint(b);
        return num1*num2;

    }

    public static int intint(String a)
    {
        int res=0;

        for(int i=0;i<a.length();i++)
        {
            int x=a.charAt(i)-'0';
            res=res*10+x;
        
        }
        return res;
    }
    
}
