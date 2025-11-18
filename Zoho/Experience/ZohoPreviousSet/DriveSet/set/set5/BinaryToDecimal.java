package folders.set.set5;

import java.util.*;

public class BinaryToDecimal {

    // recursive function: bin = remaining binary, multiplier = 2^position
    static int binaryToDecimal(int n, int val) {
        if (n == 0) return 0;

        int ans = n % 10;          // last binary digit
        return ans * val + binaryToDecimal(n / 10, val * 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        int n = sc.nextInt();

        int decimal = binaryToDecimal(n, 1); // start multiplier = 1 (2^0)
        System.out.println("Decimal = " + decimal);
    }
}

