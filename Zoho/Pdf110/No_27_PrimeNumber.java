package Zoho.Pdf110;

public class No_27_PrimeNumber {
    public static void main(String[] args) {
        int n=5;

        System.out.println(isPrime(n));

    }
    public static boolean isPrime(int n)
    {
        if(n<=1) return false;

        for(int i=2;i<n;i++)
            {
                if(n%i==0) return false;
            }
            return true;
    }
}
