package Matrix_2D;
public class Transpose {
    public static void main(String[] args) {
       int [][]arr={
               {1,2,3},
               {4,5,6},
               {7,8,9}
       } ;
       transpose(arr);
       rotate_90degree.printMatrix(arr);

    }
    public static void transpose(int [][]arr)
    {
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int t=arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }

    }
}
