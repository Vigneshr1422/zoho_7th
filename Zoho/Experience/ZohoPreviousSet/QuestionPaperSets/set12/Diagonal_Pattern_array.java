package set12;

public class Diagonal_Pattern_array {
    public static void main(String[] args) {
   
        int n = 6;
        int[][] matrix = new int[n][n];
        int value = 1;

        // Fill diagonals
        for (int d = 0; d < 2 * n - 1; d++) {
            int row = (d < n) ? d : n - 1;
            int col = (d < n) ? 0 : d - n + 1;

            while (row >= 0 && col < n) {
                matrix[row][col] = value++;
                row--;
                col++;
            }
        }

        // Print row-wise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}
