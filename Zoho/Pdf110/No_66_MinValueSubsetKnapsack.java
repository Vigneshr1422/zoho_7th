package Zoho.Pdf110;
import java.util.*;
public class No_66_MinValueSubsetKnapsack {
    public static void main(String[] args) {
        int[] values = {10, 40, 30};
        int[] weights = {1, 3, 2};
        int W = 5;
        int n = values.length;
        int INF = 1000000;
        int[] dp = new int[W+1];
        Arrays.fill(dp, INF);
        dp[0] = 0;
        for(int i=0; i<n; i++)
        {
            for(int w=W; w>=weights[i]; w--)
            {
                dp[w] = Math.min(dp[w], dp[w-weights[i]] + values[i]);
            }
        }
    }
}
