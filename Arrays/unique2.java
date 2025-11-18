package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class unique2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 5,6};
        int len=arr.length+arr2.length;
        int []ans=new int[len];
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            ans[c++]=arr[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            ans[c++]=arr2[i];
        }
        int k[]=new int[len];
        int x=0;
        for(int i=0;i<ans.length;i++)
        {
            int count=0;

            for(int j=0;j<ans.length;j++) {
                if (ans[i] == ans[j]) {
                    count++;
                }
            }
            if(count==1)
            {
                k[x++]=ans[i];

            }
        }

        for(int i=0;i<x;i++)
        {
            System.out.print(k[i]+" ");


        }
        //System.out.println(Arrays.toString(ans));

    }

    public static void lists()
    {
        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 5};

        HashSet<Integer>a=new HashSet<>();
        for(int k:arr)
        {
            a.add(k);
        }
        for(int k:arr2) {
            if (a.contains(k)) {

                a.remove(k);            }
        }
        System.out.println(a);

    }
}
