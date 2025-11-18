package Zoho.Experience.GFG_Experinece;

 public class fibo_spiral {

    // Function to generate first n*m Fibonacci numbers
    public static int[] generateFibonacci(int total) {
        int[] fib = new int[total];
        if (total == 0) return fib;
        fib[0] = 0;
        if (total == 1) return fib;
        fib[1] = 1;
        for (int i = 2; i < total; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }

    // Function to fill spiral Fibonacci matrix
    public static int[][] generateSpiralFibonacciMatrix(int n, int m) {
        int[][] mat = new int[n][m];
        int[] fib = generateFibonacci(n * m);

        int top = 0, bottom = n - 1, left = 0, right = m - 1;
        int index = 0;

        while (top <= bottom && left <= right) {
            // Fill top row
            for (int j = left; j <= right; j++) mat[top][j] = fib[index++];
            top++;

            // Fill right column
            for (int i = top; i <= bottom; i++) mat[i][right] = fib[index++];
            right--;

            // Fill bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) mat[bottom][j] = fib[index++];
                bottom--;
            }

            // Fill left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) mat[i][left] = fib[index++];
                left++;
            }
        }

        return mat;
    }

    // Function to print matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + "\t");
            System.out.println();
        }
    }

    // Testing
    public static void main(String[] args) {
        int n = 3, m = 3; // Example: 3x3 matrix
        int[][] spiralFib = generateSpiralFibonacciMatrix(n, m);

        System.out.println("Spiral Fibonacci Matrix (Version 1):");
        printMatrix(spiralFib);
    }
}

