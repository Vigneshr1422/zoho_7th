package Zoho.Others;

import java.util.TreeSet;

public class greatest_num
{
    public static void main(String[] args) {
        int []arr={2,3,7,8,9,11};

        TreeSet<Integer>ans=new TreeSet<>();

        for(int k:arr)
        {
            ans.add(k);
        }
        for(int k:arr)
        {
            Integer x=ans.higher(k);
            if(x!=null)
            {
                System.out.println(k+">"+x);
            }else
            {
                System.out.println(k+">");
            }
        }
    }
}
