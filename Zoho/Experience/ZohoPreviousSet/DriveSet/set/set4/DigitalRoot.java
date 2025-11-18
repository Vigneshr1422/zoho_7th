package folders.set.set4;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int root = digitalRoot(num);
        System.out.println("Digital root = " + root);
    }

    static int digitalRoot(int n) {
        while (n >= 10) { // repeat until single digit
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }
}
