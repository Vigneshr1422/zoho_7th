package BitManipulation;

public class BinaryConvert {
    public static void main(String[] args) {
        int a=5;
        System.out.println(BinaryConvertFun(a));
    }
    public static String BinaryConvertFun(int a)
    {
        String ans="";
        while(a!=0)
        {
            if(a%2==1)
            {
                ans+="1";
            }else
            {
                ans+='0';
            }
            a/=2;
        }
        return ans;
    }
}
