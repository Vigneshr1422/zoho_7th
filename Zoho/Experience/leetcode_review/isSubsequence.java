package leetcode_review;

public class isSubsequence {
    public static void main(String[] args) {
        String a="abc";
        String b="ahbgdc";

        int i=0;
        int j=0;

        while(i<a.length() && j<b.length())
        {
            if(a.charAt(i)==b.charAt(j)){
                i++;
            }
            j++;
        }

        if(i==a.length()){
            System.out.println("True");
            return;
        }

        System.out.println("false");
        
    }

    public static class z_matrix_chek {
        public static boolean isZMatrix(int[][] matrix) {
            int m = matrix.length;       // number of rows
            int n = matrix[0].length;    // number of columns

            // Loop through middle rows only (skip first and last row)
            for (int i = 1; i < m - 1; i++) {
                for (int j = 0; j < n; j++) {
                    // Only diagonal elements are allowed non-zero
                    if (j != n - 1 - i && matrix[i][j] != 0) {
                        return false; // found invalid non-zero element
                    }
                }
            }

            return true; // all checks passed
        }

        // Testing the function
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3, 4},
                {0, 0, 5, 0},
                {0, 6, 0, 0},
                {7, 8, 9, 10}
            };

            if (isZMatrix(matrix)) {
                System.out.println("Matrix is a Z-matrix");
            } else {
                System.out.println("Matrix is NOT a Z-matrix");
            }
        }
    }
}
