package Zoho.Pdf110;

import java.util.Arrays;

public class No_114_part2_sorting_based {
    public static void main(String[] args) {
     int []arr={1,2,3,4,5,6,7,8,9};
     int s=0;
     int e=arr.length-1;
        for(int i=0;s<e;i++)
        {
         if(i%2==0) {
             int t = arr[s];
             arr[s] = arr[e];
             arr[e] = t;
         }
         s++;
         e--;
        }
        System.out.println(Arrays.toString(arr));
    }

}
