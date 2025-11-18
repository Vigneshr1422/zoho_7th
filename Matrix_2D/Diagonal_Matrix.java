package Matrix_2D;

/*
-------diagonal matrix-----------
            1
            2 4
            3 5 7
            6 8
            9
above is diagonal matrix
-------Zig zag matrix-----------
            1
            2 4
            7 5 3
            6 8
            9
above is Zig zag matrix

-------Reverse diagonal matrix-----------
            9
            6 8
            3 5 7
            2 4
            1
above is Reverse diagonal matrix

-------Reverse Rev diagonal matrix-----------
            9
            8 6
            7 5 3
            4 2
            1
above is Reverse  Rev diagonal matrix

 */
public class Diagonal_Matrix {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        diagonalPrint(arr);
        diagonalReversePrint(arr);
        System.out.println();
        diagonalReverseRevPrint(arr);
    }

    public static void diagonalPrint(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m + n - 1; i++) {
            int row = (i < n) ? 0 : i - n + 1;
            int col = (i < n) ? i : n - 1;
            while (row < m && col >= 0) {
                System.out.print(arr[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();

        }
    }

    public static void diagonalReversePrint(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = m + n - 1;i>=0; i--) {
            int row = (i < n) ? 0 : i - n + 1;
            int col = (i < n) ? i : n - 1;
            while (row < m && col >= 0) {
                System.out.print(arr[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();

        }
    }

    public static void diagonalReverseRevPrint(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        for (int k = m + n - 2; k >= 0; k--) {
            int row = (k < n) ? 0 : k - n + 1;
            int col = (k < n) ? k : n - 1;

            // find length of diagonal
            int len = 0, r = row, c = col;
            while (r < m && c >= 0) {
                len++;
                r++;
                c--;
            }

            // print diagonal elements in reverse
            for (int i = len - 1; i >= 0; i--) {
                System.out.print(arr[row + i][col - i] + " ");
            }
            System.out.println();
        }
    }
}
