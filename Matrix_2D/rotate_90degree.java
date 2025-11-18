package Matrix_2D;

public class rotate_90degree {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Before:");
        printMatrix(arr);

        rotate90degree(arr);

        System.out.println("After 90-degree clockwise:");
        printMatrix(arr);
    }

    public static void rotate90degree(int [][]arr)
    {
        transpose(arr);
        Row_reverse(arr);
    }

    public static void transpose(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                int t=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=t;
            }
        }
    }

    public static void Row_reverse(int [][]arr)
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
