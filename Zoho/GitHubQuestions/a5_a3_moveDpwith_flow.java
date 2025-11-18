package GitHubQuestions;

public class a5_a3_moveDpwith_flow {
    public static void main(String[] args) {
        int [][]arr=
        {
            {1,1,1,0,0},
            {1,1,1,1,1},
            {0,0,0,1,0},
            {1,0,1,1,0},
            {0,1,0,1,1},
        };
        int n=arr.length;
       System.out.print(check(arr,n));
    }
    public static boolean check(int [][]arr,int n)
    {
        boolean[][] dp=new boolean[n][n];

        if(arr[0][0] ==0 || arr[n-1][n-1]==0) return false;

        dp[0][0]=true;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==1)
                {
                    if(i>0) {
                    dp[i][j]=dp[i][j] | dp[i-1][j];
                    }
                    if(j>0){ // top ku da 
                    dp[i][j]=dp[i][j] | dp[i][j-1];
                }
            }
            }
            }
                    return dp[n-1][n-1];

        }


    }

 