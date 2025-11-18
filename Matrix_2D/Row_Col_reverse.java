package Matrix_2D;

public class Row_Col_reverse {

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

        int [][]arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Before ");
        printMatrix(arr1);
        ColReverse(arr1);
        System.out.println("col reverse");
        printMatrix(arr1);

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

    public static void ColReverse(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        for(int j=0;j<m;j++)
        {
            for(int i=0;i<n/2;i++)
            {
                int t=arr[i][j];
                arr[i][j]=arr[n-i-1][j];
                arr[n-i-1][j]=t;
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
