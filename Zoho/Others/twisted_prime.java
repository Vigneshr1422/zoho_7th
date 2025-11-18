package Zoho.Others;

public class twisted_prime {
    public static void main(String[] args) {
        int n=97;
        if(isPrime(n) && isPrime(reverse(n)))
            System.out.println("Twisted Prime");
        else
            System.out.println("Not");

    }
    public static int reverse(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        return sum;
    }
    public static boolean isPrime(int n) {
        if (n < 2) return false;
         if(n%2==0) {
             return n==2;
         }

         for(int i=3;i*i<=n;i+=2){
             if(n%i==0){
                 return false;
             }
        }
        return true;
    }

}

