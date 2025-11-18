package Zoho.Pdf110;

public class No_65_CountRectanglesDP {
    public static void main(String[] args) {
        int[][] mat = {
                {0,1,1,0},
                {1,1,1,0},
                {0,0,1,1},
                {0,0,1,1}
        };

        int rows = mat.length;
        int cols = mat[0].length;
        int[][] dp = new int[rows][cols]; // consecutive 1s in row
        int count = 0;

        // Step 1: fill dp for consecutive 1s in each row
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j]==0) dp[i][j] = 0;
                else dp[i][j] = (j==0 ? 1 : dp[i][j-1]+1);
            }
        }

        // Step 2: for each cell, expand upwards
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(mat[i][j]==0) continue;
                int width = dp[i][j];
                for(int k=i; k>=0; k--){ // expand upwards
                    width = Math.min(width, dp[k][j]);
                    if(width==0) break;
                    count += width; // add rectangles ending at (i,j) from row k to i
                }
            }
        }

        System.out.println("Number of rectangles filled with 1s = " + count);
    }
}
