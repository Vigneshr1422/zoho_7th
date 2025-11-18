package Zoho.Others;

import java.util.ArrayList;
import java.util.*;

public class Fibo {

    public static void main(String[] args) {
        int []arr={2,10,4,8};
        int max=0;
        for(int i:arr)
        {
            max=Math.max(i,max);

        }
        HashSet<Integer>fibo_Ans=fibo_fun(max);

        for(int a:arr)
        {
            if(fibo_Ans.contains(a))
            {
                System.out.print(a+" ");
            }

        }
    }
    public static HashSet<Integer> fibo_fun(int max)
    {

        int a=0;
        int b=1;
        int c=0;
        HashSet<Integer>ans=new HashSet<>();
        ans.add(a);
        ans.add(b);
        c=a+b;
        while(c<=max)
        {
            ans.add(c);
            a=b;
            b=c;
            c=a+b;
        }
        return ans;
    }
}
