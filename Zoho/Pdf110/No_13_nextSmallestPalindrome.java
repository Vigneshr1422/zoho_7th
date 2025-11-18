package Zoho.Pdf110;
public class No_13_nextSmallestPalindrome {
    public static void main(String[] args) {
        int n=23545;
        System.out.println(NxtPali(n));
    }
    public static int NxtPali(int n)
    {
        n++;
        while (!isPali(n))
        {
            n++;
        }
        return n;
    }
    public static boolean isPali(int n)
    {
        int store=n;
        int ans=0;
        while(n!=0)
        {
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return  ans==store;
    }
}
