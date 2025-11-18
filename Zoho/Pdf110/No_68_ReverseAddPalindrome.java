package Zoho.Pdf110;
import java.util.*;
public class No_68_ReverseAddPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 or 3 digit number: ");
        int n = sc.nextInt();

        int iterations = 0;
        while(iterations < 5){
            int rev = reverse(n);
            int sum = n + rev;
            System.out.println(n + " + " + rev + " = " + sum);
            n = sum;
            iterations++;
            if(isPalindrome(n)){
                System.out.println("Palindrome obtained: " + n);
                break;
            }
        }

        if(!isPalindrome(n)){
            System.out.println("Palindrome not obtained in 5 iterations, last number: " + n);
        }
    }

    static int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    static boolean isPalindrome(int n){
        return n == reverse(n);
    }
}
