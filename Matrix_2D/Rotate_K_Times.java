package Matrix_2D;

public class Rotate_K_Times {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int k = 3; // rotate 3 times (means 270°)

        System.out.println("Before:");
        printMatrix(arr);

        rotateKTimes(arr, k);

        System.out.println("\nAfter rotating " + k + " times:");
        printMatrix(arr);
    }

    // ================= ROTATE K TIMES ==================
    public static void rotateKTimes(int[][] arr, int k) {
        k = k % 4; // only 0,1,2,3 matter

        if (k == 1)
            rotate90(arr);
        else if (k == 2)
            rotate180(arr);
        else if (k == 3)
            rotate270(arr);
        // k == 0 -> do nothing
    }

    // ==================== 90° CLOCKWISE ====================
    public static void rotate90(int[][] arr) {
        transpose(arr);
        rowReverse(arr);
    }

    // ==================== 180° ROTATION ====================
    public static void rotate180(int[][] arr) {
        rowReverse(arr);
        columnReverse(arr);
    }

    // ==================== 270° (90° ANTI-CLOCKWISE) ====================
    public static void rotate270(int[][] arr) {
        transpose(arr);
        columnReverse(arr);
    }

    // ==================== TRANSPOSE ====================
    public static void transpose(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }

    // ==================== ROW REVERSE ====================
    public static void rowReverse(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[i][m - j - 1];
                arr[i][m - j - 1] = t;
            }
        }
    }

    // ==================== COLUMN REVERSE ====================
    public static void columnReverse(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n / 2; i++) {
                int t = arr[i][j];
                arr[i][j] = arr[n - i - 1][j];
                arr[n - i - 1][j] = t;
            }
        }
    }

    // ==================== PRINT MATRIX ====================
    public static void printMatrix(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
package Matrix_2D;

public class Rotate_K_Times_Anti {

    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int k = 3; // anti-clockwise 3 times = 270° ACW

        System.out.println("Before:");
        printMatrix(arr);

        rotateKTimesAnti(arr, k);

        System.out.println("\nAfter Anti-Clockwise rotate " + k + " times:");
        printMatrix(arr);
    }

    // ================= ROTATE K TIMES ANTI-CLOCKWISE ==================
    public static void rotateKTimesAnti(int[][] arr, int k) {
        k = k % 4;  // only 0,1,2,3 matter

        if (k == 1)
            rotate90Anti(arr);       // 90° ACW
        else if (k == 2)
            rotate180(arr);          // same for both sides
        else if (k == 3)
            rotate270Anti(arr);      // 270° ACW = 90° CW
        // k == 0 -> do nothing
    }

    // ==================== 90° ANTI-CLOCKWISE ====================
    public static void rotate90Anti(int[][] arr) {
        transpose(arr);
        columnReverse(arr); // ACW => transpose + columnReverse
    }

    // ==================== 180° ROTATION ====================
    public static void rotate180(int[][] arr) {
        rowReverse(arr);
        columnReverse(arr);
    }

    // ==================== 270° ANTI-CLOCKWISE ====================
    // 270° ACW = 90° CLOCKWISE
    public static void rotate270Anti(int[][] arr) {
        transpose(arr);
        rowReverse(arr); // clockwise 90
    }

    // ==================== TRANSPOSE ====================
    public static void transpose(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }

    // ==================== ROW REVERSE ====================
    public static void rowReverse(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[i][m - j - 1];
                arr[i][m - j - 1] = t;
            }
        }
    }

    // ==================== COLUMN REVERSE ====================
    public static void columnReverse(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n / 2; i++) {
                int t = arr[i][j];
                arr[i][j] = arr[n - i - 1][j];
                arr[n - i - 1][j] = t;
            }
        }
    }

    // ==================== PRINT MATRIX ====================
    public static void printMatrix(int [][]arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

 */