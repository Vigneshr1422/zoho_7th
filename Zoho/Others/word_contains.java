package Zoho.Others;
import java.util.*;

public class word_contains {
    public static void main(String[] args) {
        // Corrected 4x4 grid string with 'zoho' in first row
        String str = "zohonxholoveorise";

        int row = 4;
        int col = 4;

        char[][] arr = new char[row][col];

        // Fill grid from string
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = str.charAt(i * col + j);
            }
        }

        // Print grid
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Dictionary words
        String[] word = {"van", "zoho", "love", "are", "is"};

        HashSet<String> ans = function(arr, word, row, col);

        // Print found words
        for (String w : ans) {
            System.out.println(w);
        }
    }

    public static HashSet<String> function(char[][] arr, String[] word, int row, int col) {
        // Use lowercase to ignore case differences
        HashSet<String> diction = new HashSet<>();
        for (String w : word) {
            diction.add(w.toLowerCase());
        }

        HashSet<String> ans = new HashSet<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Check right direction substrings
                StringBuilder right = new StringBuilder();
                for (int k = j; k < col; k++) {
                    right.append(Character.toLowerCase(arr[i][k]));
                    if (diction.contains(right.toString())) {
                        ans.add(right.toString());
                    }
                }

                // Check down direction substrings
                StringBuilder down = new StringBuilder();
                for (int k = i; k < row; k++) {
                    down.append(Character.toLowerCase(arr[k][j]));
                    if (diction.contains(down.toString())) {
                        ans.add(down.toString());
                    }
                }
            }
        }
        return ans;
    }
}
