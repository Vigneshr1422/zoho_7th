package Zoho.Pdf110;

public class No_29_addDigit {
    public static void main(String[] args) {
        String a="2875";

        StringBuilder ans=new StringBuilder();

        for(int i=0;i<a.length();i++)
        {
            int x=a.charAt(i)-'0';
            int y=x+4;
            ans.append(y);
        }
        System.out.println(ans);

    }
}
