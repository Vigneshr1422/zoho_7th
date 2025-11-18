package Zoho.Experience.ZohoPreviousSet.DriveSet.Set19;
import java.util.*;
public class ProductOfArray {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        productArrayFuntion(arr);
    }
    public static void productArrayFuntion(int []arr)
    {
        int n=arr.length;
        int []res=new int[n];
        res[0]=1;

        for(int i=1;i<n;i++)
        {
            res[i]=res[i-1]*arr[i-1];
        }
        int right=1;

        for(int i=n-1;i>=0;i--)
        {
            res[i]=res[i]*right;
            right*=arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
}
