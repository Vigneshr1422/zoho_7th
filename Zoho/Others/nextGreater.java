package Zoho.Others;
// 28
import  java.util.*;
public class nextGreater {
    public static void main(String[] args) {
        int []arr={16,17,4,5,2};
        int []ans=new int[arr.length];
        int right=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            int t=arr[i];
            ans[i]=right;
            if(right<t)
            {
                right=t;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
