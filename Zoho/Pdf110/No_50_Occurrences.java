package Zoho.Pdf110;

import java.util.HashMap;

public class No_50_Occurrences {
    public static void main(String[] args) {
        String a="abaabccded";
        HashMap<Character,Integer>ans=new HashMap<>();
        char prev='\0';

        for(char x:a.toCharArray()) {
            if (prev != x) {
                ans.put(x, ans.getOrDefault(x, 0) + 1);
            }
            prev=x;
        }

        for(char k:ans.keySet())
        {
            if(ans.get(k)==2)
            {
                System.out.println(k+" ");
            }
        }
    }
}
