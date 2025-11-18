package Zoho.Others;

import java.util.Scanner;

public class matrix_0 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        int m=in.nextInt();
        int [][]arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=in.nextInt();
            }
        }

        boolean [][]cheak=new boolean[n][m];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==1)
                {
                    if(i-1>=0 && arr[i-1][j]!=1)
                        cheak[i-1][j]=true;         // left
                    if(i+1<n && arr[i+1][j]!=1)
                        cheak[i+1][j]=true;        // right
                    if(j-1>=0 && arr[i+1][j]!=1)
                        cheak[i][j-1]=true;        // up
                    if(j+1<m && arr[i][j+1]!=1)
                        cheak[i][j+1]=true;        // down
                }
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(cheak[i][j])
                    arr[i][j]=0;
            }
            System.out.println();
        }

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
