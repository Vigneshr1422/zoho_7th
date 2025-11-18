package Zoho.GitHub_pradeep;
import java.util.*;
public class No_12_OddEvenLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of words
        sc.nextLine(); // consume newline

        for (int k = 0; k < t; k++) {
            String word = sc.nextLine();
            String odd = "";
            String even = "";

            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0) odd += word.charAt(i); // odd-position letters
                else even += word.charAt(i);           // even-position letters
            }

            System.out.println(odd + " " + even);
        }
    }
}
