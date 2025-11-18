package Zoho.Pdf110;

import java.util.Arrays;

public class No_46_InsertElement {
    public static void main(String[] args) {
        int []arr={1,2,3,4,6};
        int tar=5;
        int pos=4;
        int []ans=new int[arr.length+1];

        for(int i=0;i<pos;i++)
        {
            ans[i]=arr[i];
        }
        ans[pos]=tar;
        for(int i=pos+1;i<ans.length;i++)
        {
            ans[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(ans));
    }
}
