package GitHub_pradeep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class No_62_GroupAnagarm {
        public static void main(String[] args) {
            String arr[]={
                    "eat","tea","tan","ate","nat","bat"
            };
            List<List<String>> answer=group(arr);
            System.out.println(answer);


        }
        public static List<List<String>> group(String arr[])
        {
            HashMap<String,List<String>> ans=new HashMap<>();

            for(String x:arr)
            {
                char [] a=x.toCharArray();
                Arrays.sort(a);
                String s=new String(a);

                if(!ans.containsKey(s)){
                    ans.put(s, new ArrayList<>());
                }

                ans.get(s).add(x);
            }
            List<List<String>> anagrams = new ArrayList<>();
            List<List<String>> others = new ArrayList<>();

            for(List<String> group : ans.values()) {
                if(group.size() > 1)
                    anagrams.add(group);
                else
                    others.add(group);
            }

            System.out.println("Anagrams: " + anagrams);
            System.out.println("Others: " + others);


            return new ArrayList<>(ans.values());
        }
    }

