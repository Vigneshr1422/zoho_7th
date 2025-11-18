package Zoho.GitHub_pradeep;

public class No_54_MatrixRectangleSum {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 2, 3, 4, 6},
                {5, 3, 8, 1, 2},
                {4, 6, 7, 5, 5},
                {2, 4, 8, 9, 4}
        };

        int r1 = 2, c1 = 0;
        int r2 = 3, c2 = 4;

        int sum = 0;

        System.out.println("Rectangle:");
        for (int i = r1; i <= r2; i++) {
            for (int j = c1; j <= c2; j++) {
                System.out.print(mat[i][j] + " ");
                sum += mat[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum: " + sum);
    }
    }

