package Zoho.Experience.Zoho_Images.ImageSet1;

import java.util.Arrays;
import java.util.HashMap;

public class sortfreq {
 public static void main(String[] args) {
    int []arr={2,2,3,4,5,12,2,3,3,3,12};

    int ans[]=function(arr);
    System.out.println( Arrays.toString(ans));
 }   
 public static int [] function(int []arr)
 {
    HashMap<Integer,Integer>ans=new HashMap<>();

    for(int i:arr)
    {
        ans.put(i,ans.getOrDefault(i,0 )+1);
    }
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            int f1=ans.get(arr[i]);
            int f2=ans.get(arr[j]);

            if(f1<f2 || (f1==f2 && arr[i]>arr[j])){
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            } 
        }
    }

    return arr;
 }
}
