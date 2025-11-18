package Zoho.GitHub_pradeep;

public class No_111_matrixSum {
    public static void main(String[] args) {
        int [][]arr={
                {1,2,3,4,5,6},
                {4,5,6,7,8,9},
                {7,8,9,5,6,3},
                {8,5,6,9,7,5},
                {7,5,8,6,6,7}
        };

        int n=arr.length;
        int m=arr[0].length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j || i+j==m-1)
                {
                    ans+=arr[i][j];
                }
            }
        }
        System.out.println(ans);
    }
}
