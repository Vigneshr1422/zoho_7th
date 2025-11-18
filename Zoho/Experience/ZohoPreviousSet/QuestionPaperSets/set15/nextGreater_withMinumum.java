package set15;

import java.util.*;

public class nextGreater_withMinumum {
    public static void main(String[] args) {
        int arr[]={4,5,25,95};
        TreeSet<Integer>ans=new TreeSet<>();
        int res[]=new int[arr.length];

        for(int i=arr.length-2;i>=0;i--){
            Integer st=fun_higher(arr,arr[i]);
            res[i]=(st == null)? 0 : st;
            ans.add(arr[i]);
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" < ");
            System.out.println(res[i]+" ");
        }

    }

    public static Integer fun_higher(int []arr, int t){
        Integer ans=null;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>t){
                if(ans == null || arr[i] < ans){  
                ans = arr[i];   // smallest greater store
            }
            }
        }
        return ans;
    }
}
