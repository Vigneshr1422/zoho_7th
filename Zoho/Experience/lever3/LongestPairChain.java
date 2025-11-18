package Zoho.Experience.lever3;

import java.util.*;

public class LongestPairChain {

    public static void main(String[] args) {

        int[][] pairs = {
                {5, 24},
                {39, 60},
                {15, 28},
                {27, 40},
                {50, 90}
        };

        findLongestChain(pairs);
    }

    public static void findLongestChain(int[][] pairs) {

        int n = pairs.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (pairs[j][1] > pairs[j + 1][1]) {
                    int[] temp = pairs[j];
                    pairs[j] = pairs[j + 1];
                    pairs[j + 1] = temp;
                }
            }
        }


        int count = 1;
        int lastEnd = pairs[0][1];

        System.out.print("Pairs in Longest Chain: " + Arrays.toString(pairs[0]));

        for (int i = 1; i < n; i++) {
            if (pairs[i][0] > lastEnd) {
                System.out.print(" " + Arrays.toString(pairs[i]));
                count++;
                lastEnd = pairs[i][1];
            }
        }

        System.out.println("\nLength = " + count);
    }
}
