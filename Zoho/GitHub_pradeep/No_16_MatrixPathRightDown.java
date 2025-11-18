package Zoho.GitHub_pradeep;

import java.util.*;

public class No_16_MatrixPathRightDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] mat = new int[N][N];

        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                mat[i][j] = sc.nextInt();

        if(canReach(mat, 0, 0, N))
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean canReach(int[][] mat, int i, int j, int N) {
        if (i >= N || j >= N || mat[i][j] == 0) return false;
        if (i == N-1 && j == N-1) return true;
        // Move right or down
        return canReach(mat, i+1, j, N) || canReach(mat, i, j+1, N);
    }
}
