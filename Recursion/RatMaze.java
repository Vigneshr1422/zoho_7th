package Recursion;
import java.util.*;
public class RatMaze {
    public static void main(String[] args) {
        int [][]arr={
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1},
        };
        ArrayList<String>ans=DFS(arr,4);
        System.out.println(ans);
    }

    public static ArrayList<String>DFS(int [][]arr,int n)
    {
        int [][]visited=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                visited[i][j]=0;
            }
        }

        int []dr={0,1,0,-1};
        int []dc={1,0,-1,0};
        ArrayList<String>ans=new ArrayList<>();
        if(arr[0][0]==1){
            solve(0,0,arr,n,ans,"",visited,dr,dc);
        }
        return ans;
    }

    public static void solve(int i,int j,int [][]arr,int n,ArrayList<String>ans,String str,int [][]visited,int[]dr,int []dc)
    {
        if(i==n-1 && j==n-1 ){
            ans.add(str);
            return;
        }

        String dir="DLRU";

        for(int x=0;x<4;x++)
        {
            int nexti=i+dr[x];
            int nextj=j+dc[x];
            visited[i][j]=1;
            if(nexti>=0 && nextj>=0 && nexti<n && nextj<n && visited[nexti][nextj]==0 && arr[nexti][nextj]==1){
                solve(nexti,nextj,arr,n,ans,str+dir.charAt(x),visited,dr,dc);
            }
            visited[i][j]=0;
        }
    }
}
