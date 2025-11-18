package Leetcode_discuss.set1;

import java.util.Arrays;

public class meetingRoomAllocation {
    public static void main(String[] args) {
        int []arr={1,10,7};
        int []arr2={4,15,10};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int n=arr.length;
        int e=0;
        int r=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr2[e])
            {
                r++;
                ans=Math.max(ans,r);
            }
            else {
                e--;
            }
        }
        System.out.println(r);
    }
}
