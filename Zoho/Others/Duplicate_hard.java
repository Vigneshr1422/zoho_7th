package Zoho.Others;
//28
import java.util.*;

public class Duplicate_hard {
    public static void main(String[] args) {
        String input = "abuZ900";

        StringBuilder ans=new StringBuilder();
        HashSet<Character>x=new HashSet<>();

        for(char i:input.toCharArray())
        {
            if(!x.contains(i))
            {
                ans.append(i);
                x.add(i);
            }
            else {
                char store=function(i,x);
                ans.append(store);
                x.add(store);
            }
        }
        System.out.println(x);
        System.out.println(input);
        System.out.println(ans);
    }
    public static char function(char x,Set<Character>ans)
    {
        if(Character.isLowerCase(x))
        {
            for(char i='a';i<='z';i++) {
                if (!ans.contains(i)) return i;
            }
        }

        if(Character.isUpperCase(x))
        {
            for(char i='A';i<='Z';i++) {
                if(!ans.contains(i))  return i;
            }
        }
        if(Character.isDigit(x))
        {
            for(char i='0';i<='9';i++)
            {
                if(!ans.contains(i)) return i;
            }
        }
        return '%';

    }
}
