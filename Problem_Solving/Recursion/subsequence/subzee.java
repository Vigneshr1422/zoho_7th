package Problem_Solving.Recursion.subsequence;

import java.util.ArrayList;

public class subzee {
    public static void main(String[] args) {
        int []arr={3,1,2};
        fun(arr,0,new ArrayList<>());
    }
    public static  void fun(int []arr, int idx,ArrayList<Integer>ans)
    {
     if(arr.length==idx)
     {
         System.out.println(ans);
         return;
     }
     ans.add(arr[idx]);
     fun(arr,idx+1,ans);
     ans.remove(ans.size()-1);
     fun(arr,idx+1,ans);
    }
}
