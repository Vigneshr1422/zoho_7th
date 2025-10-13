package GitHub_pradeep;

public class No_29_PathMatrix {
        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int m = mat.length;
            int n = mat[0].length;
            int[][] dp = new int[m][n];

            dp[0][0] = mat[0][0];

            // first row
            for (int j = 1; j < n; j++) dp[0][j] = dp[0][j-1] + mat[0][j];
            // first column
            for (int i = 1; i < m; i++) dp[i][0] = dp[i-1][0] + mat[i][0];
            // rest
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + mat[i][j];
                }
            }

            System.out.println("Shortest path sum: " + dp[m-1][n-1]);
        }
    }
