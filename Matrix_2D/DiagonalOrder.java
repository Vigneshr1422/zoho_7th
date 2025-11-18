package Matrix_2D;

public class DiagonalOrder{
    public static void main(String[] args) {
        int [][] arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n+m-1;i++)
        {
            int x=(i<n) ? 0:i-n+1;
            int y=(i<n) ? i:n-1;


            while(x<n && y>=0)
            {
                System.out.print(arr[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
}

/*
 * public class DiagonalFill {
    public static void main(String[] args) {
        int n = 5;
        int[][] mat = new int[n][n];
        int val = 1;

        for (int d = 0; d < 2*n - 1; d++) {
            int row = (d < n) ? 0 : d - n + 1;
            int col = (d < n) ? d : n - 1;

            while (row < n && col >= 0) {
                mat[row][col] = val++;
                row++;
                col--;
            }
        }

        // print
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }
}

 */