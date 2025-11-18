package Zoho.GitHub_pradeep;

import java.util.Scanner;

public class No_11_OddEvenChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of strings
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            StringBuilder odd = new StringBuilder();
            StringBuilder even = new StringBuilder();

            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    odd.append(s.charAt(j));
                } else {
                    even.append(s.charAt(j));
                }
            }

            System.out.println(odd + " " + even);
        }
    }
}
