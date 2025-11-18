package Zoho.Others;

import java.util.Scanner;

public class no_of_island {
    public static void main(String[] args) {
        System.out.println("Enter of row ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        int m=in.nextInt();
        char [][]arr=new char[n][m];

        /*
        Input: grid = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1
         */

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=in.next().charAt(0);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]=='1')
                {
                    dfs(arr,i,j);
                    {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
    public  static  void dfs(char [][]arr,int i,int j)
    {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length ||arr[i][j]=='0')
        {
            return;
        }
        arr[i][j]='0';
        dfs(arr,i+1,j);
        dfs(arr,i-1,j);
        dfs(arr,i,j+1);
        dfs(arr,i,j-1);
    }
}
