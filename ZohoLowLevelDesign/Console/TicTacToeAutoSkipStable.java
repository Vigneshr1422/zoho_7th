package ZohoLowLevelDesign.Console;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class TicTacToeAutoSkipStable {

    private static final int TIME_LIMIT_SEC = 15; // per-player time
    private static final
    char EMPTY = '-';

    private static final char[][] board = new char[3][3];
    private static final Scanner SC = new Scanner(System.in);
    private static final BlockingQueue<String> INPUT_QUEUE =
            new LinkedBlockingQueue<>();

    public static void main(String[] args) {
        // start a dedicated input thread that keeps reading lines and pushes to queue
        Thread inputThread = new Thread(() -> {
            while (true) {
                String line = SC.nextLine();
                INPUT_QUEUE.offer(line);
            }
        }, "InputReader");
        inputThread.setDaemon(true);
        inputThread.start();

        initBoard();

        char player = 'X';
        boolean gameOver = false;

        while (!gameOver) {
            printBoard();
            System.out.println("Player " + player + " turn." +
                    " Enter move as `row col` (0-2). You have "
                    + TIME_LIMIT_SEC + " seconds.");

            // drop any late input from previous turn
            INPUT_QUEUE.clear();

            boolean moved = takeMoveWithTimeout(player, TIME_LIMIT_SEC);

            if (!moved) {
                System.out.println("⏰ Time up! Skipping Player " + player + ".");
            } else {
                // check win/draw only after a valid move
                if (haveWon(player)) {
                    printBoard();
                    System.out.println("🎉 Player " + player + " wins!");
                    break;
                }
                if (isBoardFull()) {
                    printBoard();
                    System.out.println("It's a draw!");
                    break;
                }
            }

            // switch player
            player = (player == 'X') ? 'O' : 'X';
        }
    }

    // waits up to 'seconds' for a valid move; returns true if move placed, false if timed out
    private static boolean takeMoveWithTimeout(char player, int seconds) {
        long deadline = System.nanoTime() + TimeUnit.SECONDS.toNanos(seconds);

        while (true) {
            long remainingNanos = deadline - System.nanoTime();
            if (remainingNanos <= 0) return false; // timed out

            // wait only for -the remaining time
            String line;
            try {
                line = INPUT_QUEUE.poll(remainingNanos, TimeUnit.NANOSECONDS);
            } catch (InterruptedException ie) {
                return false;
            }

            if (line == null) {
                // no input arrived within remaining time
                return false;
            }

            line = line.trim();
            if (line.isEmpty()) {
                System.out.println("Empty input. Try again quickly!");
                continue;
            }

            String[] parts = line.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Format: row col (e.g., 0 2). Try again quickly!");
                continue;
            }

            int r, c;
            try {
                r = Integer.parseInt(parts[0]);
                c = Integer.parseInt(parts[1]);
            } catch (NumberFormatException nfe) {
                System.out.println("Numbers only (0,1,2). Try again quickly!");
                continue;
            }

            if (r < 0 || r > 2 || c < 0 || c > 2) {
                System.out.println("Row/Col must be 0..2. Try again quickly!");
                continue;
            }

            if (board[r][c] != EMPTY) {
                System.out.println("Cell already taken. Try another quickly!");
                continue;
            }

            // valid move
            board[r][c] = player;
            return true;
        }
    }

    private static void initBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;
    }

    private static void printBoard() {
        System.out.println();
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c]);
                if (c < 2) System.out.print(" | ");
            }
            System.out.println();
            if (r < 2) System.out.println("--+---+--");
        }
        System.out.println();
    }

    private static boolean haveWon(char p) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == p && board[i][1] == p && board[i][2] == p) return true;
            if (board[0][i] == p && board[1][i] == p && board[2][i] == p) return true;
        }
        if (board[0][0] == p && board[1][1] == p && board[2][2] == p) return true;
        if (board[0][2] == p && board[1][1] == p && board[2][0] == p) return true;
        return false;
    }

    private static boolean isBoardFull() {
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c] == EMPTY) return false;
        return true;
    }
}



