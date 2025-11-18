package Zoho.Pdf110;
import java.util.*;
public class No_70_wordsearch8dir {
    static char[][] board;
    static boolean[][] visited;
    static String target;
    static int[] dr = {-1,-1,-1,0,0,1,1,1};
    static int[] dc = {-1,0,1,-1,1,-1,0,1};


    public static void main(String[] args) {
        board = new char[][]{
                {'P','W','K','C','T'},
                {'B','O','F','A','L'},
                {'O','O','E','R','M'},
                {'x','L','A','T','E'},
                {'A','C','O','T','N'}
        };
        int row = board.length;
        int col = board[0].length;

        String[] words = {"POET", "WOOL", "MOUSE", "CAMP", "ROAM"};

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

        for (int d = 0; d < 8; d++) { // use 8 if diagonals needed
            if (dfs(r + dr[d], c + dc[d], idx + 1, path))
                return true;
        }

        visited[r][c] = false;
        path.remove(path.size() - 1);
        return false;
    }

}
