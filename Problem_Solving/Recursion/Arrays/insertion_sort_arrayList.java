package Problem_Solving.Recursion.Arrays;

import java.util.ArrayList;

public class insertion_sort_arrayList {
    public static void main(String[] args) {
        int []arr={4,5,6,7,8,4};
        int tar=4;
        ArrayList<Integer>ans=sorted(arr,tar,0,new ArrayList<>());
        System.out.println(ans);
    }
    static ArrayList<Integer> sorted(int []arr,int tar,int i,ArrayList<Integer>ans)
    {

            if(i==arr.length)
            {
                return ans;
            }else if(arr[i]==tar)
            {
                ans.add(i);
            }
            return sorted(arr,tar,i+1,ans);


    }
}
