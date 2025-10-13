package GitHub_pradeep;
import java.util.*;
public class No_43_TwistedPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPrime(n)) {
            int rev = reverse(n);
            if (isPrime(rev))
                System.out.println("Twisted Prime Number");
            else
                System.out.println("Not a Twisted Prime Number");
        } else {
            System.out.println("Not a Twisted Prime Number");
        }
    }

    // ✅ Function to check prime number
    static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    // ✅ Function to reverse the number
    static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

}
