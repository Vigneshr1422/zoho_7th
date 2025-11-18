package Matrix_2D;

public class Rotate_image {

    public static void main(String[] args) {

        int [][]arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int n = arr.length;
        int m = arr[0].length;

        System.out.println("Original Matrix:");
        print(arr);

        // ---------------- TRANSPOSE ----------------
        System.out.println("\nAfter Transpose:");
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < m; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
        print(arr);

        // ---------------- ROW REVERSE (Rotate 90°) ----------------
        System.out.println("\nAfter 90° Rotation (Row Reverse):");
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m / 2; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[i][m - 1 - j];
                arr[i][m - 1 - j] = t;
            }
        }
        print(arr);

        System.out.println("\nFinish");
    }

    // ---------------- PRINT FUNCTION ----------------
    public static void print(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
