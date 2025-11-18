package Zoho.Others;
import java.util.*;
public class Group_Anagram {
    public static void main(String[] args) {
        String []arr={ "eat","tea","tan","ate","nat","bat"};
        List<List<String>>ans=group_anagram(arr);
        for(List<String> x :ans)
        {

            for(String y:x)
            {
                System.out.print(y+",");
            }
            System.out.println();
        }
    }
    public static List<List<String>>group_anagram(String []arr)
    {
        HashMap<String,List<String>>ans=new HashMap<>();

        for(String x:arr)
        {
            char []arrr=x.toCharArray();
            Arrays.sort(arrr);
            String store=new String(arrr);
        if(!ans.containsKey(store))
        {
            ans.put(store,new ArrayList<>());
        }
        ans.get(store).add(x);
        }
        return new ArrayList<>(ans.values());
    }
}
