package Zoho.GitHub_pradeep;

import java.util.ArrayList;

public class No_58_Decode_ways {
    public static void main(String[] args) {
        String a="131";
        ArrayList<String> ans=new ArrayList<>();
        int index=0;
        String current="";

        Decode(a,index,current,ans);

        System.out.println(ans);


    }

    public static void Decode(String a,int index, String current, ArrayList<String>ans)
    {
        if(index==a.length())
        {
            ans.add(current);
            return;
        }
        int one=a.charAt(index)-'0';
        if(one>=1)
        {
            Decode(a,index+1,current+(char)('A'+one-1),ans);
        }
        if(index+1<a.length())
        {
            int two=Integer.parseInt(a.substring(index,index+2));

            if(two>=10 && two<=26)
            {
                Decode(a,index+2,current+(char)('A'+two-1),ans);
            }
        }
    }
}
