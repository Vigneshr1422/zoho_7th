package set3;

import java.util.Arrays;

public class mergeArray {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5,6};
        int[]arr2={5,6,7,8,9,10};

        int i=0;
        int j=0;
        int k=0;
        int ans[]=new int[arr1.length+arr2.length];

        while(i<arr1.length && j<arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                if(k==0 || ans[k-1]!=arr1[i]){
                    ans[k++]=arr1[i];
                }
            i++;
            }
            else if(arr1[i]>arr2[j])
            {
                if(k==0|| ans[k-1]!=arr2[j]){
                    ans[k++]=arr2[j];
                }
                j++;
            }
            else
            {
                if(k==0 || ans[k-1]!=arr1[i]){
                    ans[k++]=arr1[i];
                    i++;
                    j++;
                    
                }

            }
        }


        while (i<arr1.length) {
            if(ans[k-1]!=arr1[i])
            {
                ans[k++]=arr1[i];
            }
            i++;
        }

        while (j<arr2.length) {
            if( ans[k-1]!=arr2[j])
            {
                ans[k++]=arr2[j];
            }
            j++;
        }

        for(int ii=0;ii<k;ii++){
            System.out.print(ans[ii]+" ");
        }

    }
}
