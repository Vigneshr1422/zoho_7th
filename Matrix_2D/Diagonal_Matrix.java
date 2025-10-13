package Matrix_2D;

public class Diagonal_Matrix {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        diagonalPrint(arr);
    }

    public static void diagonalPrint(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n+m-1;i++)
        {
            int r=(i<n)?0:i-n+1;
            int c=(i<n)?i:n-1;
            while(r<n && c>=0)
            {
                System.out.print(arr[r][c]+" ");
                r++;
                c--;
            }
        }
    }
}
