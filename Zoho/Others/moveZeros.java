package Zoho.Others;
import java.util.*;
public class moveZeros {
    public static void main(String[] args) {
        int []arr={1,0,2,3,4,5,0};

        int ans[]=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                ans[idx++]=arr[i];
            }
        }

        while(idx<arr.length)
        {
            ans[idx++]=0;
        }
        System.out.println(Arrays.toString(ans));



        int index=arr.length-1;
        int []move=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                move[index--]=arr[i];
            }
        }
        System.out.println(Arrays.toString(move));
    }
}
