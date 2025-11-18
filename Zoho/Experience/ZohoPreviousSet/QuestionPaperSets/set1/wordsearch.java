
public class wordsearch {

    /*

Overall complexity dominated by Problem_Solving.search → O(n²·m) time, O(n²) space
     */
    public static void main(String[] args) {
        String str = "welcometozoho ";
        int n = 5;
        char[][] arr = new char[n][n];
        int index = 0;

        // Fill the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (index < str.length()) {
                    arr[i][j] = str.charAt(index++);
                } else {
                    arr[i][j] = '*';
                }
            }
        }

        // Print matrix
        for (char[] a : arr) {
            for (char x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        String tar = "oho";
        boolean found = false;

        // Horizontal Problem_Solving.search
        for (int i = 0; i < n && !found; i++) {
            for (int j = 0; j <= n - tar.length(); j++) {
                boolean match = true;
                for (int k = 0; k < tar.length(); k++) {
                    if (arr[i][j + k] != tar.charAt(k)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Start index: " + i + "," + j);
                    System.out.println("End index: " + i + "," + (j + tar.length() - 1));
                    found = true;
                    break;
                }
            }
        }

        // Vertical Problem_Solving.search
        for (int i = 0; i <= n - tar.length() && !found; i++) {
            for (int j = 0; j < n; j++) {
                boolean match = true;
                for (int k = 0; k < tar.length(); k++) {
                    if (arr[i + k][j] != tar.charAt(k)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    System.out.println("Start index: " + i + "," + j);
                    System.out.println("End index: " + (i + tar.length() - 1) + "," + j);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }

}
