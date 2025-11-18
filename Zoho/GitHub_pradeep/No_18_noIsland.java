package Zoho.GitHub_pradeep;

public class No_18_noIsland {
     public static void main(String[] args) {
            int [][]arr={
                    {1,1,1,1,0},
                    {1,1,0,1,0},
                    {1,1,0,0,0},
                    {0,0,0,0,0}

            };
            int c=0;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++){
                    if(arr[i][j]==1)
                    {
                        dfs(arr,i,j);
                        c++;

                    }
                }
            }
            System.out.println(c+" ");
        }

        public static void dfs(int [][]arr, int i, int j)
        {
            if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==0)
            {
                return;
            }

            arr[i][j]=0;
            dfs(arr, i+1,j);
            dfs(arr,i-1,j);
            dfs(arr,i,j+1);
            dfs(arr,i,j-1);


            dfs(arr, i+1, j+1);
            dfs(arr, i+1, j-1);
            dfs(arr, i-1, j+1);
            dfs(arr, i-1, j-1);

        }

        public static void zohoversion()
        {
            int [][] arr = {
                    { 1, -1, -1,  1 },
                    { -1, 1, -1,  1 },
                    { -1, -1, 1, -1 },
                    { -1, -1, -1, 1 }
            };

            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    if (arr[i][j] == 1) {   // found new island
                        dfs(arr, i, j);
                        c++;
                    }
                }
            }
            System.out.println("Number of islands = " + c);
        }

        public static void dfsd(int [][] arr, int i, int j) {
            if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] != 1) {
                return;
            }

            arr[i][j] = -1; // mark visited (turn land into water)

            // 8 directions
            dfs(arr, i+1, j);
            dfs(arr, i-1, j);
            dfs(arr, i, j+1);
            dfs(arr, i, j-1);
            dfs(arr, i+1, j+1);
            dfs(arr, i+1, j-1);
            dfs(arr, i-1, j+1);
            dfs(arr, i-1, j-1);
        }


    }

