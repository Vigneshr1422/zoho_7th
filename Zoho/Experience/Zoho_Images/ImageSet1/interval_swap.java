package Zoho.Experience.Zoho_Images.ImageSet1;

import java.util.Arrays;

public class interval_swap {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,8,6,7,9};
        int k=3;
        for(int i=0;i<arr.length;i+=k)
        {
            int start=i;
            int end=Math.min(i+k-1,arr.length-1);

            while(start<end){
                int t=arr[start];
                arr[start]=arr[end];
                arr[end]=t;
                start++;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
