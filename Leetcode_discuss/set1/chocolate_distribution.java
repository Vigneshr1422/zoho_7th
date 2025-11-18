package Leetcode_discuss.set1;

import java.util.Arrays;

public class chocolate_distribution {
    public static void main(String[] args) {
        int n=4;
        int c=7;

        int []arr=new int[n];
        int i=0;
        int x=1;
        while(c>0)
        {
            if(c<x)
            {
                arr[i]+=c;
                break;
            }
            arr[i++]=x;
            c=c-x;
            x++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
