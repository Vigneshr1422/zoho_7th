package GitHub_pradeep;

import java.util.Scanner;

public class No_39_ValidateKnights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] board = new char[5][5];

        System.out.println("Enter 5x5 board (K for knight, . for empty):");
        for (int i = 0; i < 5; i++) {
            String line = sc.nextLine();
            for (int j = 0; j < 5; j++) {
                board[i][j] = line.charAt(j);
            }
        }

        if (isValidKnightConfiguration(board))
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    static boolean isValidKnightConfiguration(char[][] board) {
        int knightCount = 0;

        // Possible moves for a knight
        int[] dr = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dc = {-1, 1, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (board[i][j] == 'K') {
                    knightCount++;

                    // Check if any other knight attacks this position
                    for (int k = 0; k < 8; k++) {
                        int ni = i + dr[k];
                        int nj = j + dc[k];
                        if (ni >= 0 && ni < 5 && nj >= 0 && nj < 5 && board[ni][nj] == 'K') {
                            return false; // Invalid, knights attack each other
                        }
                    }
                }
            }
        }

        return knightCount == 9; // Must have exactly 9 knights
    }
}
