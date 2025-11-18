package Zoho.GitHub_pradeep;
import java.util.*;

public class No_106_wordSearch {
    static int rows, cols;
    static char[][] board;
    static boolean[][] visited;
    static String target;
    static int[] dr = {-1, 0, 1, 0}; // up, right, down, left
    static int[] dc = {0, 1, 0, -1};

    public static void main(String[] args) {
        String a = "zohonxholoveorise";
        int row = 4, col = 4;
        board = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = a.charAt(i * col + j);
            }
        }

        System.out.println("Matrix:");
        for (char[] r : board) {
            for (char c : r)
                System.out.print(c + " ");
            System.out.println();
        }

        String[] words = {"van", "zoho", "love", "are", "is"};

        for (String w : words) {
            target = w;
            visited = new boolean[row][col];
            boolean found = false;

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] == w.charAt(0)) {
                        List<String> path = new ArrayList<>();
                        if (dfs(i, j, 0, path)) {
                            found = true;
                            System.out.println("Word: " + w + " → Path: " + path);
                            break;
                        }
                    }
                }
                if (found) break;
            }
            if (!found) System.out.println("Word: " + w + " → Not found");
        }
    }

    static boolean dfs(int r, int c, int idx, List<String> path) {
        if (idx == target.length()) return true;
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) return false;
        if (visited[r][c] || board[r][c] != target.charAt(idx)) return false;

        visited[r][c] = true;
        path.add("(" + r + "," + c + ")");

        for (int d = 0; d < 4; d++) {
            if (dfs(r + dr[d], c + dc[d], idx + 1, path))
                return true;
        }

        // backtrack
        visited[r][c] = false;
        path.remove(path.size() - 1);
        return false;
    }
}
