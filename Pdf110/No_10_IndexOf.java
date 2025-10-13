package Pdf110;
import java.util.*;
public class No_10_IndexOf {
    public static void main(String[] args) {
        String s1 = "expErIence";
        String s2 = "En";

        Set<Character> removeChars = new HashSet<>();
        for (char c : s2.toCharArray()) {
            removeChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : s1.toCharArray()) {
            if (!removeChars.contains(c)) {
                result.append(c);
            }
        }

        System.out.println("s1 = \"" + result + "\"");
    }

    public static void CustomFunction()
    {
        String a="Experience";
        String b="En";

        StringBuilder ans=new StringBuilder();

        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            if(!FunIndexOf(b,c)){
                ans.append(c);
            }
        }
        System.out.println(ans);
    }

    public static boolean FunIndexOf (String a,char x)
    {
        for(int i=0;i<a.length();i++)
        {
            if(x==a.charAt(i)) return true ;
        }
                return false;
    }
}
