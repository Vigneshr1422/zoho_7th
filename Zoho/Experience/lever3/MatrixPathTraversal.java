package Zoho.Experience.lever3;

import java.util.*;

public class MatrixPathTraversal {
    public static void main(String[] args) {

        // 5x5 example matrix
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {1, 2, 3, 4, 5}
        };
        traverse(arr, 1, 2, ">>>v");
        traverse(arr, 2, 3, "v>>v<<>>vv");
    }
    public static void traverse(int [][]arr,int start,int end,String path){
        int n=arr.length;
        int m=arr[0].length;

        int r=start-1;
        int c=end-1;

        if(r<0 || c<0 || r>=n || c>=m){
            System.out.println("Invalid path");
            return;
        }
StringBuilder sb=new StringBuilder();
        sb.append(arr[r][c]);

        for(int i=0;i<path.length();i++)
        {
            char x=path.charAt(i);
            if(x=='>') c++;
            else if(x=='<') c--;
            else if(x=='v') r++;
            else if(x=='^') r--;
            else {
                System.out.println("Invalid ");
                return;
            }

            if(r<0 || c<0 || r>=n || c>=m){
                System.out.println("Invalid path");
                return;
            }

            sb.append(arr[r][c]);
        }
        System.out.println(sb);


    }
}
