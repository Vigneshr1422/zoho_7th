package Striver.SDE_Sheet.Arrays.Level2;
import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args) {
        int []arr1={1,2,3,0,0,0};
        int []arr2={2,5,6};
        int n=3;
        int m=3;
        mergeWithOutSpace(arr1,n,arr2,m);
        System.out.println(Arrays.toString(arr1));
    }
    public static void mergeWithOutSpace(int []arr1,int n,int []arr2,int m){
        int i=n-1;
        int j=m-1;
        int k=n+m-1;

        while (i>=0 && j>=0)
        {
            if(arr1[i]>arr2[j]){
                arr1[k--]=arr1[i--];
            }else {
                arr1[k--]=arr2[j--];
            }
        }
        while(j>=0){
            arr1[k--]=arr2[j--];
        }
    }
}
