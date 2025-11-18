package Zoho.Pdf110;

import java.util.TreeSet;

public class No_06_Merge_SortArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 3, 4, 5, 6, 7, 8};

        OptimalCollection(arr,arr2);
        WithoutCollection(arr,arr2);

    }
    public static void WithoutCollection(int []arr,int []arr2)
    {

    }
    public static void OptimalCollection(int []arr,int []arr2){
        TreeSet<Integer>ans=new TreeSet<>();

        for(int i=0;i<arr.length+arr2.length;i++)
        {
            if(i<arr.length)
            {
                ans.add(arr[i]);

            }else {
                ans.add(arr2[i-arr.length]);
            }
        }
        System.out.println(ans);
    }
}
