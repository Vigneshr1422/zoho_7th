package Zoho.Others;

import java.util.HashSet;

public class stone_jewel {
    public static void main(String[] args) {
        String a="zz";
        String b="Zwaaase";

        HashSet<Character>ans=new HashSet<>();
        int i=0;
        for(char x:b.toCharArray())
        {
            ans.add(x);
        }

        for(char x:a.toCharArray()) {
            if (ans.contains(x)) {
                i++;
            }
        }
        System.out.println(i);

    }
}
