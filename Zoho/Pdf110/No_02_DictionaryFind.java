package Zoho.Pdf110;
import java.util.*;
public interface No_02_DictionaryFind {
    public static void main(String[] args) {
        Set<String> dict = new HashSet<>(Arrays.asList(
                "i", "like", "sam", "sung", "samsung", "mobile",
                "ice", "cream", "icecream", "man", "go", "mango"
        ));
        System.out.println(WordBreak("ice",dict));

    }

    public static boolean WordBreak(String a,Set<String>dict)
    {
        boolean []dp=new boolean[a.length()+1];
        dp[0]=true;
        for(int i=1;i<=a.length();i++)
        {
            for(int j=0;j<i;j++)
            {
                if(dp[j] &&dict.contains(a.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[a.length()];


    }
}
