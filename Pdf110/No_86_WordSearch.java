package Pdf110;
import java.util.*;

public class No_86_WordSearch {
    static Set<String> dict = new HashSet<>();
    static Set<String> found = new LinkedHashSet<>();

    public static void main(String[] args) {
        char [][]arr = {
                {'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };
        String[] words = {"van", "zoho", "love", "are", "is"};
        dict.addAll(Arrays.asList(words));
        int n = arr.length, m = arr[0].length;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                dfs(arr, i, j, "", n, m);
            }
        }
        for (String w : found) {
            System.out.println(w);
        }
    }

    private static void dfs(char[][] arr, int i, int j, String path, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) return;
        path += arr[i][j];
        if (dict.contains(path)) {
            found.add(path);
        }
        dfs(arr, i+1, j, path, n, m);
        dfs(arr, i, j+1, path, n, m);
    }
}
/*
package Pdf110;
import java.util.*;

public class No_86_WordSearch {
    static Set<String> dict = new HashSet<>();
    static Set<String> found = new LinkedHashSet<>();

    public static void main(String[] args) {
        char [][]arr = {
                {'a', 'z', 'o', 'l'},
                {'n', 'x', 'h', 'o'},
                {'v', 'y', 'i', 'v'},
                {'o', 'r', 's', 'e'}
        };

        String[] words = {"van", "zoho", "love", "are", "is"};
        dict.addAll(Arrays.asList(words));

        int n = arr.length, m = arr[0].length;

        // Start DFS from every cell
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                dfs(arr, i, j, "", n, m);
            }
        }

        System.out.println("Words Found:");
        for (String w : found) {
            System.out.println(w);
        }
    }

    private static void dfs(char[][] arr, int i, int j, String path, int n, int m) {
        if (i < 0 || j < 0 || i >= n || j >= m) return;

        path += arr[i][j];
        if (dict.contains(path)) found.add(path);

        // Continue in allowed 3 directions
        dfs(arr, i + 1, j, path, n, m);   // ↓ Down
        dfs(arr, i, j + 1, path, n, m);   // → Right
        dfs(arr, i + 1, j + 1, path, n, m); // ↘ Diagonal
    }
}

 */
