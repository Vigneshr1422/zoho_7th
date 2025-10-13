package Matrix_2D;

public class Row_reverse {

    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Before ");
        printMatrix(arr);
        RowReverse(arr);
        System.out.println("Row reverse");
        printMatrix(arr);

    }
    public static void RowReverse(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int t=arr[i][j];
                arr[i][j]=arr[i][m-j-1];
                arr[i][m-j-1]=t;
            }
        }
    }
    public static void printMatrix(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
