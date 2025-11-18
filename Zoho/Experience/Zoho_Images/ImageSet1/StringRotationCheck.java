package Zoho.Experience.Zoho_Images.ImageSet1;

import java.util.*;

public class StringRotationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        if (a.length() != b.length()) {
            System.out.println(0);
            return;
        }

        String doubled = a + a;
        boolean found = false;

        // manual substring check
        for (int i = 0; i <= doubled.length() - b.length(); i++) {
            int j = 0;
            while (j < b.length() && doubled.charAt(i + j) == b.charAt(j)) {
                j++;
            }
            if (j == b.length()) {
                found = true;
                break;
            }
        }

        System.out.println(found ? 1 : 0);
    }
}
