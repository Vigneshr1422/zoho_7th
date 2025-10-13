package Recursion;

import java.util.*;

public class N_Queens {
    public static void main(String[] args) {
        int n=4;
        List<List<String>>a=QueenFunction(n);

        for(List<String> x:a){
            for(String ans:x){
                System.out.println(ans);
            }
            System.out.println();
        }


    }

    public static List<List<String>> QueenFunction(int n){
        List<List<String>>ans=new ArrayList<>();
        char [][]board=new char[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        boolean []col=new boolean[n];
        boolean []upperDia=new boolean[2*n];
        boolean []lowerDia=new boolean[2*n];
        BackTracking(0,board,n,col,lowerDia,upperDia,ans);
        return ans;
    }

    public static void BackTracking
            (int row,char [][]board,int n,
             boolean []col,boolean []lowerDia,
             boolean []upperDia,List<List<String>>ans){
        if(row==n){
            List<String>first=new ArrayList<>();
            for(char []r:board){
                first.add(new String(r));
            }

            ans.add(first);
            return;
        }

        for(int i=0;i<n;i++)
        {
            if(col[i] || lowerDia[row+i] || upperDia[row-i+(n-1)] ){
                continue;
            }
            board[row][i]='Q';
            col[i]=lowerDia[row+i]=upperDia[row-i+(n-1)]=true;

            BackTracking(row+1,board,n,col,lowerDia,upperDia,ans);

            board[row][i]='.';
            col[i]=false;
            lowerDia[row+i]=false;
            upperDia[row-i+(n-1)]=false;
        }
    }
}
