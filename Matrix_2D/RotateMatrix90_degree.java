package Matrix_2D;
/*
Original:

1 2 3
4 5 6
7 8 9


After transpose:

1 4 7
2 5 8
3 6 9


After reversing rows:

7 4 1
8 5 2
9 6 3
 */
public class RotateMatrix90_degree {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        RotateMatrixFunction(arr);
        for(int[] i:arr)
        {
            for(int x:i)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void RotateMatrixFunction(int [][]arr) {
        // transpose
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                int t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }

        // rotate

        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int t = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = t;
                left++;
                right--;
            }
        }
    }
}
