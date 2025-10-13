package Pdf110;

public class No_103_SubMatrixCheck_Big_Small {
        public static void main(String[] args) {
            int[][] big = {
                    {1, 2, 3, 4, 5},
                    {6, 7, 8, 9, 0},
                    {1, 3, 5, 7, 9},
                    {2, 4, 6, 8, 0},
                    {9, 8, 7, 6, 5}
            };

            int[][] small = {
                    {7, 8},
                    {3, 5}
            };

            System.out.println(containsSubMatrix(big, small));
        }

        public static boolean containsSubMatrix(int[][] big, int[][] small) {
            int N = big.length;
            int M = small.length;

            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    if (isMatch(big, small, i, j)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static boolean isMatch(int[][] big, int[][] small, int row, int col) {
            int M = small.length;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < M; j++) {
                    if (big[row + i][col + j] != small[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

