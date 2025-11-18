package Zoho.GitHub_pradeep;
import java.util.*;
public class No_02_BooleanMatrixModify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] mat = new int[M][N];

        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                mat[i][j] = sc.nextInt();

        int[][] copy = new int[M][N];
        for (int i = 0; i < M; i++)
            for (int j = 0; j < N; j++)
                copy[i][j] = mat[i][j];

        int[] dx = {-1, 0, 0, 1}; // up, left, right, down
        int[] dy = {0, -1, 1, 0};

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (copy[i][j] == 1) {
                    for (int k = 0; k < 4; k++) {
                        int ni = i + dx[k];
                        int nj = j + dy[k];
                        if (ni >= 0 && ni < M && nj >= 0 && nj < N) {
                            mat[ni][nj] = 0;
                        }
                    }
                }
            }
        }

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}
