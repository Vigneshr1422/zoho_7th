package Zoho.Experience.ZohoPreviousSet.DriveSet.Set21;

import java.util.*;

/*
L2 Questions
Question 1:
Given a pattern and a string "s". find if "s" follows the same pattern.
Here follow means a full match, such that there is a bisection between a letter in
pattern and a non-empty word in s.
Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
tout: false

 */
public class String_Check_sequence {
    public static void main(String[] args) {
        String a="abba";
        String b="dog at cat dog";

        System.out.println(StringFunction(a,b));
    }
    public static boolean StringFunction(String a, String b){

        String []arr=b.split(" ");
        if(a.length()!=arr.length){
            return false;
        }
        HashMap<Character,String>map=new HashMap<>();
        HashMap<String,Character>rev=new HashMap<>();

        for(int i=0;i<a.length();i++)
        {
            char x=a.charAt(i);
            String str=arr[i];

            if(map.containsKey(x)){
                if(!map.get(x).equals(str)) return false;
            }else
            {
                if(rev.containsKey(str)) return false;
                map.put(x,str);
                rev.put(str,x);
            }

        }
        return true;
    }

}
