package Zoho.Others;
import java.util.*;
public class multi_sum_array {

    public static void main(String[] args) {
        int []arr={1,2,3,9};
        int []arr2={3,4,5};

        int len=Math.max(arr.length,arr2.length);
        int []ans=new int[len];

        for(int i=0;i<len;i++)
        {
            int a = (i < arr.length) ? arr[i] : 0;
            int b = (i < arr2.length) ? arr2[i] : 0;
            ans[i]=a+b;
        }


        System.out.println(Arrays.toString(ans));

    }
}
