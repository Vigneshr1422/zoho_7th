package Problem_Solving.SubArray;

import java.util.*;

public class longest_substring_without_Repeating_character {
    public static void main(String[] args) {
        String x="abac";
        System.out.println("Ans "+fun(x));
    }
    public static int fun(String s)
    {
        int start=0;
        int end=0;
        int n=s.length();
        int ans=0;

        Map<Character,Integer>map=new HashMap<>();
        while(end<n)
        {
            if(map.containsKey(s.charAt(end)))
            {
                start=Math.max(map.get(s.charAt(end))+1,start);
            }
            map.put(s.charAt(end),end);
            ans=Math.max(ans,end-start+1);
            end++;
        }
        return ans;
    }
}
