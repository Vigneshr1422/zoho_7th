package Problem_Solving.Recursion.Arrays;

import java.util.ArrayList;

public class subsequence {
    public static void main(String[] args) {
        int []arr={3,1,2};
        int k=2;

        funtion(arr,0,new ArrayList<>(),k);
    }

    public static void funtion(int []arr, int index,ArrayList<Integer>ans,int k)
    {
        int sum=0;
        if(index==arr.length) {

            sum=summ(ans);
            if(sum<=k)
            {
                System.out.println(ans);

            }
//            System.out.println(ans);
//            sum=summ(ans);
//
            return;
        }
        ans.add(arr[index]);

        funtion(arr,index+1,ans,k);

        ans.remove(ans.size()-1);

        funtion(arr,index+1,ans,k);

    }

    public static int summ(ArrayList<Integer>a)
    {
        int ans=0;
        for(int l:a)
        {
            ans+=l;
        }
        return ans;
    }
}
