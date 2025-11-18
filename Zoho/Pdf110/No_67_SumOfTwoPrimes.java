package Zoho.Pdf110;
import java.util.*;
public class No_67_SumOfTwoPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        boolean found = false;

        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println(n + " = " + i + " + " + (n - i));
                found = true;
            }
        }

        if (!found) {
            System.out.println(n + " cannot be expressed as the sum of two primes.");
        }
    }

    static boolean isPrime(int num){
        if(num < 2) return false;
        for(int i=2; i*i <= num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}
