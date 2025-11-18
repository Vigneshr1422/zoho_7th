package Zoho.Others;
//day 2
public class isSubsequence {
    public static void main(String[] args) {
        String a="sest";
        String b="settigs";

        int x=0;
        int y=0;

        while(x<a.length() && y<b.length())
        {
            if(a.charAt(x)==b.charAt(y))
            {
                x++;
            }
            y++;
        }
        if(x==a.length())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
