package Pdf110;

import java.util.*;

public class No_108_NthNumber {
    public static void main(String[] args) {

        int n=10;


        Queue<String>ans=new LinkedList<>();
        ans.add("3");
        ans.add("4");
        String x="";
        for(int i=0;i<n;i++)
        {
            x=ans.poll();
            System.out.println(x);
            ans.add(x+"3");
            ans.add(x+"4");
        }
    }
}
