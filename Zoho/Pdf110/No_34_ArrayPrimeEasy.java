package Zoho.Pdf110;

import java.util.Arrays;

public class No_34_ArrayPrimeEasy {
    public static void main(String[] args) {
        int[] arr1 = {20, 7};
        int[] arr2 = {11, 5};

        int n = arr1.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = -1; // default if not found
            for (int x = 1; x <= 1000; x++) {
                if (isPrime(x) && (arr1[i] + x) % arr2[i] == 0) {
                    res[i] = x;
                    break; // first prime found
                }
            }
        }

        System.out.println(Arrays.toString(res));
    }

    // Simple prime check, 1 is considered prime
    static boolean isPrime(int n) {
        if (n == 1) return true;
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
