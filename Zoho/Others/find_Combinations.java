package Zoho.Others;

import java.util.ArrayList;
import java.util.List;

public class find_Combinations {
    public static void main(String[] args) {
        int []arr={8,3,4,7,9};
        int tar=7;

        List<List<Integer>>ans=new ArrayList<>();
        combination(arr,0,tar,new ArrayList<>(),ans);
        for(List<Integer>x:ans)
        {
            System.out.println(x);
        }
    }
    static void combination(int []arr, int index,int tar,List<Integer>now,List<List<Integer>>ans)
    {
        if(tar==0)
        {
            ans.add(new ArrayList<>(now));
            return;
        }
        if(index==arr.length || tar <0)
        {
            return;
        }
        now.add(arr[index]);
        combination(arr,index+1,tar-arr[index],now , ans);
        now.remove(now.size()-1);
        combination(arr,index+1,tar,now , ans);
    }
}
