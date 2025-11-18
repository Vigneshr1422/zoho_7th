package Matrix_2D;

public class MagicSquare {
    public static boolean isMagicSquare(int[][] mat) {
        int n = mat.length;
        int sum = 0;

        // reference sum from first row
        for (int j = 0; j < n; j++) sum += mat[0][j];

        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }
            if (rowSum != sum || colSum != sum) return false;

            d1 += mat[i][i];
            d2 += mat[i][n - 1 - i];
        }

        return d1 == sum && d2 == sum;
    }

    public static void main(String[] args) {
        int[][] mat = {
            {2,7,6},
            {9,5,1},
            {4,3,8}
        };
        System.out.println(isMagicSquare(mat)); // true
    }
}
