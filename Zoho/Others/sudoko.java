package Zoho.Others;

public class sudoko {

        public static void main(String[] args) {
            int[][] sudoku = {
                    {5,3,4,6,7,8,9,1,2},
                    {6,7,2,1,9,5,3,4,8},
                    {1,9,8,3,4,2,5,6,7},
                    {8,5,9,7,6,1,4,2,3},
                    {4,2,6,8,5,3,7,9,1},
                    {7,1,3,9,2,4,8,5,6},
                    {9,6,1,5,3,7,2,8,4},
                    {2,8,7,4,1,9,6,3,5},
                    {3,4,5,2,8,6,1,7,9}
            };

            if (isValidSudoku(sudoku)) {
                System.out.println("Sudoku is valid!");
            } else {
                System.out.println("Sudoku is invalid.");
            }
        }

        public static boolean isValidSudoku(int[][] board) {
            // Check rows and columns
            for (int i = 0; i < 9; i++) {
                boolean[] rowCheck = new boolean[9];
                boolean[] colCheck = new boolean[9];

                for (int j = 0; j < 9; j++) {
                    // Check row
                    if (!checkNumber(board[i][j], rowCheck)) return false;
                    // Check column
                    if (!checkNumber(board[j][i], colCheck)) return false;
                }
            }

            // Check 3x3 sub-grids
            for (int row = 0; row < 9; row += 3) {
                for (int col = 0; col < 9; col += 3) {
                    boolean[] blockCheck = new boolean[9];
                    for (int r = row; r < row + 3; r++) {
                        for (int c = col; c < col + 3; c++) {
                            if (!checkNumber(board[r][c], blockCheck)) return false;
                        }
                    }
                }
            }

            return true;
        }



        private static boolean checkNumber(int num, boolean[] check) {
            if (num < 1 || num > 9) return false; // invalid number
            if (check[num - 1]) return false;    // duplicate found
            check[num - 1] = true;
            return true;
        }
    }
