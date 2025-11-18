package GFG_Experinece;

import java.util.Arrays;

public class arrayManipulation {
    public static void main(String[] args) {
        int arr[]={2,2,0,4,0,8};
        int n=arr.length;
        function(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void function(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=0){
                int j=i+1;

                while(j<n && arr[j]==0){
                    j++;
                }

                if(j<n && arr[i]==arr[j])
                {
                    arr[i]*=2;
                    arr[j]=0;
                }
            }

        }
    }
    
}
