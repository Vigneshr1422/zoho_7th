package Zoho.Pdf110;

import java.util.ArrayList;

public class No_25_longestPalindromic {
    public static void main(String[] args) {
        String a="racecar";

        ArrayList<String>list=new ArrayList<>();
        subString(a,list);
        System.out.println(list);
        longest(list);
    }

//    public static void longest(ArrayList<String>list)
//    {
//        int l=0;
//        String ans="";
//        for(String x:list)
//        {
//            if(isPali(x))
//            {
//                l=Math.max(l,x.length());
//            }
//
//        }
//        System.out.println(ans);
//        System.out.println(l);
//    }
public static void longest(ArrayList<String> list) {
    int l = 0;
    String ans = "";
    for (String x : list) {
        if (isPali(x)) {
            if (x.length() > l) {   // only update if this palindrome is longer
                l = x.length();      // update longest length
                ans = x;             // store this palindrome
            }
        }
    }
    System.out.println("Largest Palindrome: " + ans);
    System.out.println("Length: " + l);
}

    public static boolean isPali(String a)
    {
        int s=0;
        int e=a.length()-1;

        while(s<e)
        {
            if(a.charAt(s)!=a.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void subString(String a,ArrayList<String>list)
    {
        for(int i=0;i<a.length();i++)
        {
            for(int j=i+1;j<=a.length();j++)
            {
                list.add(a.substring(i,j));
            }
        }
    }
}
