package GFG_Experinece;

import java.util.*;

public class a4_3_subset {
    public static void main(String[] args) {
        int []arr={2,3,5,8,10};
        int tar=10;

        List<Integer>ans=new ArrayList<>();
        backtrack(arr,0,ans,0,tar);
    }

    public static void backtrack(int []arr,int index, List<Integer>ans,int sum,int tar)
    {
        if(sum==tar)
        {
            System.out.println(ans);
            return;
        }

        if(tar<sum ||arr.length==index )
        {
            return;
        }

        ans.add(arr[index]);
        backtrack(arr, index+1, ans, sum+arr[index], tar);
        ans.remove(ans.size()-1);
        backtrack(arr, index+1, ans, sum, tar);

    }
}
