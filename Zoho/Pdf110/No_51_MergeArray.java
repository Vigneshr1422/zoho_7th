package Zoho.Pdf110;

import java.util.Arrays;

public class No_51_MergeArray {
    public static void main(String[] args) {
        int []arr1={1,3};
        int []arr2={0,2,3,4,5,6,7};
        int n= arr1.length;
        int m=arr2.length;
        for(int i=0;i<n;i++)
        {
            if(arr1[i] >arr2[0])
            {
                int t=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=t;

                int firstElement=arr2[0];

                int k;

                for(k=1;k<m && arr2[k]<firstElement;k++)
                {
                    arr2[k-1]=arr2[k];
                }
                arr2[k-1]=firstElement;
            }
        }
        for(int i:arr1)
        {
            System.out.print(i+" ");
        }

        for(int i:arr2)
        {
            System.out.print(i+" ");
        }
     //   practice();
    }


    public static void practice()
    {
        int []arr1={1,8,3};
        int []arr2={0,4};

        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>arr2[0])
            {
                int t=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=t;

                int first=arr2[0];

                int j;

                for(j=1;j<arr2.length && arr2[j]<first;j++)
                {
                    arr2[j-1]=arr2[j];
                }
                arr2[j-1]=first;
            }
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
