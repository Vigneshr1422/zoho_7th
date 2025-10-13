package GitHub_pradeep;
import java.util.Scanner;

public class No_27_NumberPalindrome {
     public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int original = n, reverse = 0;

            while (n > 0) {
                int digit = n % 10;
                reverse = reverse * 10 + digit;
                n /= 10;
            }

            if (original == reverse) System.out.println("Palindrome");
            else System.out.println("Not Palindrome");
        }
    }
