package GFG_Experinece;

public class TwistedPrime {
    public static void main(String[] args) {
        int n=151;
        System.out.println(twistedPrime(n));
        System.out.println("jhi");
    }
    public static boolean twistedPrime(int n)
    {
        int x=reverse(n);
       return PrimeFunc(x);
    }

    public static boolean PrimeFunc(int n)
    {
        if(n<2)return false;
        if(n%2==0){
            return n==2;
        }

        for(int i=3;i*i<=n;i+=2){
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static int reverse(int n)
    {
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }

        return sum;
    }
}
