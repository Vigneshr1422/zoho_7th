package Pdf110;

public class No_105_MatrixMirrorCheck {
        public static void main(String[] args) {
            int[][] A = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}
            };

            int[][] B = {
                    {3, 2, 1},
                    {6, 5, 4},
                    {9, 8, 7}
            };
            int [][] c={
                    {7,8,9},
                    {4,5,6},
                    {1,2,3}
            };
            if (isSame(A, B)) {
                System.out.println("Matrix B is identical to Matrix A");
            } else if (isHorizontalMirror(A, B)) {
                System.out.println("Matrix B is a horizontal mirror of Matrix A");
            } else if (isVerticalMirror(A, B)) {
                System.out.println("Matrix B is a vertical mirror of Matrix A");
            } else {
                System.out.println("Matrix B cannot be formed from Matrix A by mirroring");
            }
        }

        // Check if two matrices are identical
        public static boolean isSame(int[][] A, int[][] B) {
            int n = A.length, m = A[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] != B[i][j]) return false;
                }
            }
            return true;
        }

        // Check horizontal mirror (left-right flip)
        public static boolean isHorizontalMirror(int[][] A, int[][] B) {
            int n = A.length, m = A[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] != B[i][m - j - 1]) return false;
                }
            }
            return true;
        }

        // Check vertical mirror (top-bottom flip)
        public static boolean isVerticalMirror(int[][] A, int[][] B) {
            int n = A.length, m = A[0].length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (A[i][j] != B[n - i - 1][j]) return false;
                }
            }
            return true;
        }
    }

