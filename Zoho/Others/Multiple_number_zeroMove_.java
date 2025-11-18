package Zoho.Others;
import java.util.*;
public class Multiple_number_zeroMove_ {
    public static void main(String[] args) {
        int []arr={2,2,0,4,0,8};

        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=0 && arr[i]==arr[i+1])
            {
                arr[i]*=2;
                arr[i+1]=0;
            }
        }

        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[j++]=arr[i];
            }
        }

        while(j<arr.length)
        {
            arr[j++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
