package Zoho.Others;

import java.util.*;

public class generate_All_number {
    public static void main(String[] args) {
        int n=10;
        Queue<String>x=new LinkedList<>();
        x.add("4");
        x.add("4");

        String ans="";
        for(int i=0;i<n;i++)
        {
            ans=x.poll();
            x.add(ans+"3");
            x.add(ans+"4");
        }

        System.out.println("Answer "+ans);
    }
}
