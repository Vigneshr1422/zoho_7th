package Zoho.Pdf110;

public class No_101_BinaryToDecimal {
    public static void main(String[] args) {
        String a="101101";
        String b="1101";

        System.out.println(BinaryFunction(a,b,0));
        String x="123";
        String y="13";
        int z=4;
        System.out.println(BinaryFunction(x,y,z));


    }

    public static String BinaryFunction(String a,String b, int base)
    {

        base=(base==0) ? 2 : base;
        StringBuilder ans=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while (i>=0 ||  j>=0 || carry!=0)
        {
            int bitA= (i>=0) ? a.charAt(i)-'0' : 0;
            int bitB=(j>=0) ? b.charAt(j)-'0' : 0;
            int sum=bitA+bitB+carry;
            ans.append(sum%base);
            carry=sum/base;
            i--;
            j--;
        }

        return  ans.reverse().toString();

    }
}
