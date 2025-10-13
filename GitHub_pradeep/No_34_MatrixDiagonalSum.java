package GitHub_pradeep;
import java.util.Scanner;

public class No_34_MatrixDiagonalSum {

    public class MatrixDiagonalSum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] mat = new int[rows][cols];
            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    mat[i][j] = sc.nextInt();

            int sum1 = 0; // sum of upper-left triangle including diagonal
            int sum2 = 0; // sum of lower-right triangle including diagonal

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i + j <= cols - 1) {
                        sum1 += mat[i][j]; // elements above or on the diagonal
                    }
                    if (i + j >= cols - 1) {
                        sum2 += mat[i][j]; // elements below or on the diagonal
                    }
                }
            }

            System.out.println(Math.max(sum1, sum2));
        }
    }
}
