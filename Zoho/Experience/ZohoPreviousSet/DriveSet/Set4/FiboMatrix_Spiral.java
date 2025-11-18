package Zoho.Experience.ZohoPreviousSet.DriveSet.Set4;
import java.util.*;

public class FiboMatrix_Spiral {
    public static void main(String[] args) {
        int n = 4; // rows
        int m = 3; // columns
        int total = n * m;

        // Step 1: Generate Fibonacci sequence
        int[] dp = new int[total];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < total; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(Arrays.toString(dp));

        int[][] arr = new int[n][m]; // n rows, m cols

        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;
        int ind = 0;

        // Step 2: Spiral fill
        while (left <= right && top <= bottom) {

            // left → right
            for (int j = left; j <= right; j++) {
                arr[top][j] = dp[ind++];
            }
            top++;

            // top → bottom
            for (int i = top; i <= bottom; i++) {
                arr[i][right] = dp[ind++];
            }
            right--;

            // right → left
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    arr[bottom][j] = dp[ind++];
                }
                bottom--;
            }

            // bottom → top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    arr[i][left] = dp[ind++];
                }
                left++;
            }
        }

        // Step 3: Print matrix
        for (int[] ar : arr) {
            for (int i : ar) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
