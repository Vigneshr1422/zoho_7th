package Pdf110;

public class No_115_Expand {
    public static void main(String[] args) {
        String st = "a[10]b[2]c[6]";
        String x="a10b2c3";
        function(st);
        function(x);
    }
    public static void function(String st)
    {
        StringBuilder ans=new StringBuilder();
        String a="";
        for(int i=0;i<st.length();i++)
        {
            char x=st.charAt(i);
            if(x!='[' && x!=']')
            {
                a+=x;
            }
        }
        for(int i=0;i<a.length();i++)
        {
            char letter=a.charAt(i);
            StringBuilder num=new StringBuilder();
            while(i+1<a.length() && Character.isDigit(a.charAt(i+1)))
            {
                num.append(a.charAt(i+1));
                i++;
            }
            int n=Integer.parseInt(num.toString());
            for(int j=0;j<n;j++)
            {
                ans.append(letter);
            }
        }
        System.out.println(ans);
    }
}
