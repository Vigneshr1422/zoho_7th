package Matrix_2D;

public class Spiral_fibo {
public static void main(String[] args) {
        int n = 3;
        int m = 4;

        int[][] res = fibSpiral(n, m);

        for (int[] row : res) {
            for (int x : row) System.out.print(x + " ");
            System.out.println();
        }
    }

    public static int[][] fibSpiral(int n, int m) {
        int total = n * m;
        int[][] mat = new int[n][m];

        // Generate Fibonacci numbers
        int[] fib = new int[total];
        fib[0] = 0;
        if (total > 1) fib[1] = 1;

        for (int i = 2; i < total; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        // REVERSE the Fibonacci array
//        int leftIdx = 0, rightIdx = total - 1;
//        while (leftIdx < rightIdx) {
//            int t = fib[leftIdx];
//            fib[leftIdx] = fib[rightIdx];
//            fib[rightIdx] = t;
//            leftIdx++;
//            rightIdx--;
//        }

        // Spiral boundaries
        int top = 0, bottom = n - 1;
        int left = 0, right = m - 1;

        int idx = 0;

        while (top <= bottom && left <= right) {

            // left -> right
            for (int i = left; i <= right; i++)
                mat[top][i] = fib[idx++];
            top++;

            // top -> bottom
            for (int i = top; i <= bottom; i++)
                mat[i][right] = fib[idx++];
            right--;

            // right -> left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    mat[bottom][i] = fib[idx++];
                bottom--;
            }

            // bottom -> top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    mat[i][left] = fib[idx++];
                left++;
            }
        }

        return mat;
    }
}
