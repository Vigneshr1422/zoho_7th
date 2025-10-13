package Matrix_2D;

public class Col_reverse {

    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Before ");
        printMatrix(arr);
        colReverse(arr);
        System.out.println("Col reverse");
        printMatrix(arr);
    }
    public static void colReverse(int [][]arr)
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
