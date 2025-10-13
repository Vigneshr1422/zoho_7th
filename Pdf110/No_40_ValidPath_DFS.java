package Pdf110;

public class No_40_ValidPath_DFS {
    public static void main(String[] args) {
        int [][]arr={
                {1,0,0,0},
                {1,0,1,0},
                {1,1,0,0},
                {0,1,1,1}
        };

        int n=4;
        boolean [][] visited=new boolean[n][n];

        if(arr[0][0]==0 || arr[n-1][n-1]==0)
            System.out.println("Not valid out ");

        if(DFS(arr,visited,0,0,n))
        {
            printMatrix(arr,n,visited);
        }
        else
        {
            System.out.println("No path found");
        }
    }

    public static boolean DFS(int [][]arr,boolean [][]visited,int i,int j,int n)
    {
        if(i<0 || i>=n || j<0 || j>=n || arr[i][j]==0|| visited[i][j]) return false;

        visited[i][j]=true;
        if(i==n-1 && j==n-1) return true;

        int []dr={0,1,0,-1};
        int []dc={1,0,-1,0};

        for(int x=0;x<4;x++)
        {
            int xi=i+dr[x];
            int yi=j+dc[x];

            if(DFS(arr,visited,xi,yi,n)) return true;
        }
        visited[i][j]=false;
        return  false;
    }

    public static void printMatrix(int [][]arr,int n,boolean [][]visited)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(visited[i][j]){
                    System.out.print("_");
                }else {
                    System.out.print(arr[i][j]);
                }
                if(j!=n-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
