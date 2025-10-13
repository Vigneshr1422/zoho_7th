package BitManipulation;

public class Compliment {
    public static void main(String[] args) {
        int a=13;
       String ans=ComplementOne(a);
        System.out.println(DecimalConvert.DeciConvert(ans));
    }
    public static String ComplementOne(int a)
    {
        StringBuilder x=new StringBuilder();
        while(a!=0)
        {
            int r=a%2;
            if(r==1)
            {   x.append("1");
            }else
            {
                x.append("0");
            }
            a/=2;
        }
        x.reverse();
        String ans="";
        for(char s:x.toString().toCharArray())
        {
            if(s=='1')
                ans+="0";
            else
            {
                ans+="1";
            }
        }
        return ans;

    }


}
