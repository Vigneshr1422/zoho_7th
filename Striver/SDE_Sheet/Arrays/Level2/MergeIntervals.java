package Striver.SDE_Sheet.Arrays.Level2;

import java.util.*;

public class MergeIntervals {
    public static void main(String[] args) {
        int [][]arr= {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18},
        };
      int [][]ans=  MergeIntervalFunction(arr);
      for(int [] i:ans)
      {
          System.out.println(Arrays.toString(i));
      }
    }
    public  static int[][] MergeIntervalFunction(int [][]arr){

        int n=arr.length;
        int []start=new int[n];
        int []end=new int[n];

        for(int i=0;i<n;i++)
        {
            start[i]=arr[i][0];
            end[i]=arr[i][1];
        }
        int idx=0;
        List<int []>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(i==n-1 || start[i+1]>end[i]){
                ans.add(new int[]{start[idx],end[i]});
                idx=i+1;
            }
        }
        return  ans.toArray(new int[ans.size()][]);
    }
}
