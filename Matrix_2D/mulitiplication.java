package Matrix_2D;

public class mulitiplication {
    public static void main(String[] args) {
         int[][] A = {{1,2},{3,4}};
        int[][] B = {{5,6},{7,8}};
        multiply(A,B);
    }

    public static void multiply(int a[][],int b[][])
{
    int n=a.length;
    int m=a[0].length;

    int l=b[0].length;

    int ans[][]=new int[n][l];

    for(int i=0;i<n;i++)
    {
        for(int j=0;j<l;j++){
            for(int k=0;k<m;k++)
            {
                ans[i][j]+=a[i][k] * b[k][j];
            }
        }
    }

    for(int d[]:ans){
        for(int z:d)
        {
            System.out.print(z+" ");
        }
        System.out.println();
    }

}
    
}
