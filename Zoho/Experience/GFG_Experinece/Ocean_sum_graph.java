package Zoho.Experience.GFG_Experinece;

import java.util.*;

public class Ocean_sum_graph {

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 2, 3, 5},
            {3, 2, 3, 4, 4},
            {2, 4, 5, 3, 1},
            {6, 7, 1, 4, 5},
            {5, 1, 1, 2, 4}
        };

        Solution sol = new Solution();
        List<List<Integer>> result = sol.pacificAtlantic(matrix);
        System.out.println("Cells where water can flow to both oceans:");
        for (List<Integer> cell : result) {
            System.out.println(cell);
        }
    }
}

class Solution {
    int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}}; // right, left, down, up
    int m, n;

    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        if(matrix==null || matrix.length==0) return res;
        m = matrix.length;
        n = matrix[0].length;

        boolean[][] pac = new boolean[m][n];
        boolean[][] atl = new boolean[m][n];

        // DFS from Pacific (top row + left column)
        for(int i=0;i<m;i++){
            dfs(matrix,i,0,pac);
            dfs(matrix,i,n-1,atl); // DFS from Atlantic (right column)
        }
        for(int j=0;j<n;j++){
            dfs(matrix,0,j,pac);      // top row
            dfs(matrix,m-1,j,atl);    // bottom row
        }

        // Collect cells reachable from both oceans
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pac[i][j] && atl[i][j]){
                    res.add(Arrays.asList(i,j));
                }
            }
        }
        return res;
    }

    void dfs(int[][] matrix, int i, int j, boolean[][] visited){
        visited[i][j] = true;
        for(int[] d: dirs){
            int x = i + d[0], y = j + d[1];
            if(x<0 || y<0 || x>=m || y>=n) continue;       // boundary check
            if(visited[x][y]) continue;                    // already visited
            if(matrix[x][y] < matrix[i][j]) continue;      // cannot flow uphill
            dfs(matrix,x,y,visited);
        }
    }
}
