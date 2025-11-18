package Zoho.Others;

public class number_Present {
    public static void main(String[] args) {
        int a = 876;
        int b = 9012342;

        boolean[] present = new boolean[10];

        // Mark digits present in b
        while (b > 0) {
            int digit = b % 10;
            present[digit] = true;
            b /= 10;
        }

        // Check each digit in a
        while (a > 0) {
            int digit = a % 10;
            if (!present[digit]) {
                System.out.println("No");
                return;
            }
            a /= 10;
        }

        System.out.println("True");
    }
}

