package Zoho.Experience.ZohoPreviousSet.DriveSet.Set5;
import java.util.*;
/*
🔹Example Input:
arr = ["abc", "bcd", "abcd"]

🔹Expected Output:
["a", "cd", ""]

🔹Explanation:

🧩 Example

Input:
["cab", "ad", "bad", "c"]

Output:
["ab", "", "ba", ""]
For "abc", substring "a" is not present in "bcd" or "abcd", and it’s the shortest.

For "bcd", substring "cd" is unique.

For "abcd", every substring appears in other strings, so the answer is "".
 */
public class SubstringPresentCheckReplace {
    public static void main(String[] args) {
        String []arr={"abc", "bcd", "abcd"};
        String []ans=subStringFunction(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static String [] subStringFunction(String []arr)
    {
        int n=arr.length;
        String []ans=new String[n];

        for(int i=0;i<n;i++)
        {
            String str=arr[i];
            String store="";
            boolean found=false;

            for(int j=1;j<= str.length() && !found ;j++)
            {
                TreeSet<String>set=new TreeSet<>();
                for(int k=0;k+j<= str.length();k++)  // shortest
                {
                    String sub=str.substring(k,k+j);
                    if(isCheck(sub,arr,i)){
                        set.add(sub);
                    }
                }
                if(!set.isEmpty()){
                   store= set.first();
                   found=true;
                }
            }
            ans[i]=store;
        }
        return ans;
    }

    public static  boolean isCheck(String sub,String []arr,int x){
        for(int j=0;j<arr.length;j++)
        {
            if(j!=x && arr[j].contains(sub)) {
                return false;
            }
        }
        return  true;
    }
}
