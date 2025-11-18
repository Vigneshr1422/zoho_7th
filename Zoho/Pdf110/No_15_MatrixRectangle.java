package Zoho.Pdf110;

public class No_15_MatrixRectangle {
        public static void main(String[] args) {
            int[][] mat = {
                    {1, 2, 3, 4, 6},
                    {5, 3, 8, 1, 2},
                    {4, 6, 7, 5, 5},
                    {2, 4, 8, 9, 4}
            };

            int r1 = 2, c1 = 0;  // first index
            int r2 = 3, c2 = 4;  // second index

            printRectangle(mat, r1, c1, r2, c2);
        }

        public static void printRectangle(int[][] mat, int r1, int c1, int r2, int c2) {
            // Ensure r1 <= r2 and c1 <= c2
            int top = Math.min(r1, r2);
            int bottom = Math.max(r1, r2);
            int left = Math.min(c1, c2);
            int right = Math.max(c1, c2);

            int sum = 0;

            System.out.println("Rectangle:");
            for (int i = top; i <= bottom; i++) {
                for (int j = left; j <= right; j++) {
                    System.out.print(mat[i][j] + " ");
                    sum += mat[i][j];
                }
                System.out.println();
            }

            System.out.println("Sum = " + sum);
        }
    }
