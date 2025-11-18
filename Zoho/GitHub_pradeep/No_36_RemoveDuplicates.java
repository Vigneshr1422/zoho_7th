package Zoho.GitHub_pradeep;

import java.util.Scanner;

public class No_36_RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256]; // ASCII

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                sb.append(ch);
                seen[ch] = true;
            }
        }

        System.out.println("Output:");
        System.out.println(sb.toString());
    }
}
