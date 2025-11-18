package Problem_Solving.SubArray;

import java.util.HashMap;

public class prefix_sum {
    public static void main(String[] args) {
        int []arr={1,-1,5,3,-2};
        HashMap<Integer,Integer>map=new HashMap<>();

        int k=2;

        int sum=0;
        int maxlength=0;

        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];

            if(sum==k)
            {
                maxlength=i+1;
            }

            if(map.containsKey(sum-k))
            {
                int prev=map.get(sum-k);
                maxlength=Math.max(maxlength,i-prev);

            }

            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }

        }

        System.out.println(maxlength);
    }
}
