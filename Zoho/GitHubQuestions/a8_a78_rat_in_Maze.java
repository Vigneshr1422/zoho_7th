package GitHubQuestions;

public class a8_a78_rat_in_Maze {

    static int n=4;
    public static void main(String[] args) {
        int [][]arr={
              {1,1,0,0},
            {1,0,0,1},
            {1,1,1,1},
            {0,0,0,1}
        };
        int a[][]=new int[n][n];

        
        if(bfs(arr,0,0,a)){
            printArray(a);
        }else
        {
            System.out.println("No path ");
        }
    }

    public static void printArray(int [][]arr)
    {
        for(int []a : arr)
        {
            for(int x:a)
            {
                System.out.print((x==1?"_" :"0")+" ");
            }
            System.out.println();
        }
    }

    public static boolean bfs(int [][]arr, int x, int y, int [][]ans)
    {
        if(x==n-1 && y==n-1 && arr[x][y]==1)
        {
            ans[x][y]=1;
            return true;
        }

        if(x>=0 && x<n && y>=0 && y<n && arr[x][y]==1){
            if(ans[x][y]==1){
                return false;
            }

            ans[x][y]=1;

            if(bfs(arr, x+1, y, ans)) 
            return true;

            if(bfs(arr, x, y+1, ans))
            return true;

            ans[x][y]=0;
        }
        return false;
    }

}
