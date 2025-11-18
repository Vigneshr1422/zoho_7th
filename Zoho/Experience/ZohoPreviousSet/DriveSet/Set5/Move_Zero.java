package Zoho.Experience.ZohoPreviousSet.DriveSet.Set5;

import java.util.Arrays;

public class Move_Zero {
    public static void main(String[] args) {
        int []arr={0,1,0,10,9,0,0,2};
        int x=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[x]=arr[i];
                x--;
            }
        }
        while(x>=0)
        {
            arr[x]=0;
            x--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
