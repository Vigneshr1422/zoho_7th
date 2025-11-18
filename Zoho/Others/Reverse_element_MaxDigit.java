package Zoho.Others;

import java.util.*;

public class Reverse_element_MaxDigit {
    public static void main(String[] args) {
        int[] arr = {4, 3, 70, 15, 118, 1};
        int[] ans = new int[arr.length];

        int max=0;
        for(int i:arr)
        {
            int digit=(int)Math.log10(i==0 ? 1 : i)+1;
            max=Math.max(digit,max);
        }

        for(int i=0;i<arr.length;i++)
        {
            String store=String.format("%0"+max+"d",arr[i]);
            String rev=new StringBuilder(store).reverse().toString();
            ans[i]=Integer.parseInt(rev);
         }

        System.out.println(Arrays.toString(ans));
    }
}