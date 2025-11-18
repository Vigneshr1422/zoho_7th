package Zoho.Pdf110;
import java.util.*;
public class No_62_minSquare {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number: ");
            int n = sc.nextInt();
            int[] dp = new int[n + 1];
            dp[0] = 0;
            for (int i = 1; i <= n; i++) {
                dp[i] = i; // maximum i = 1^2 + 1^2 + ...
                for (int j = 1; j * j <= i; j++) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
                }
            }
            System.out.println("Minimum number of squares: " + dp[n]);
        }
}
