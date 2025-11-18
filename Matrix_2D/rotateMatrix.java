package Matrix_2D;

import java.util.*;

public class rotateMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int mat[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original:");
        printMatrix(mat);

        System.out.println("Enter degree to rotate (90/180/270/360): ");
        int degree = in.nextInt();

        int times = (degree / 90) % 4; // how many times to rotate 90°

        for (int i = 0; i < times; i++) {
            rotate(mat); // rotate 90 each time
        }

        System.out.println("After rotation:");
        printMatrix(mat);

        in.close();
    }

    // Rotate matrix by 90° clockwise
    public static void rotate(int[][] arr) {
        transpose(arr);
        reverse(arr);
    }

    // Print matrix
    public static void printMatrix(int[][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Transpose (swap row/col)
    public static void transpose(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }

    // Reverse each row
    public static void reverse(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0, k = n - 1; j < k; j++, k--) {
                int t = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = t;
            }
        }
    }
}
