package Zoho.Experience.Zoho_Images.ImageSet1;

import java.util.*;

public class SmallestNumberCountingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int[] freq = new int[10]; // digits 0-9

        // count frequency of each digit
        while (n > 0) {
            freq[(int)(n % 10)]++;
            n /= 10;
        }

        System.out.print("Smallest number is : ");
        // print digits in increasing order
        for (int d = 0; d <= 9; d++) {
            while (freq[d] > 0) {
                System.out.print(d);
                freq[d]--;
            }
        }
    }
}

