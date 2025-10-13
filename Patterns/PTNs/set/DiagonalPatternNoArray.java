package Patters.set;

public class DiagonalPatternNoArray {
    public static void main(String[] args) {
        int n = 5, m = 5;
        int val = 1;
        int arr[][] = new int[n][m];

        for (int i = 0; i < m + n - 1; i++) {   // start from 0
            int row = (i < n) ? 0 : i - n + 1;
            int col = (i < n) ? i : n - 1;

            while (row < n && col >= 0) {
                arr[row][col] = val++;
                row++;
                col--;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", arr[i][j]);
            }
            System.out.println();
        }
    }
}
