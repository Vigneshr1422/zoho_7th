package Problem_Solving.Recursion_problems;
import java.util.*;
public class Palindromic_Partition {
    public static void main(String[] args) {
        String a="aabc";
        List<List<String>>ans=Partition(a);

        System.out.println(ans);
    }
    public static List<List<String>> Partition(String a)
    {
        List<List<String>>ans=new ArrayList<>();
        BackTrack(a,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void BackTrack(String a,int start,ArrayList<String>store,List<List<String>>ans){
        if(a.length()==start){
            ans.add(new ArrayList<>(store));
            return;
        }

        for(int i=start;i<a.length();i++)
        {
            if (isPali(a,start,i)) {
                store.add(a.substring(start,i+1));
                BackTrack(a,i+1,store,ans);
                store.remove(store.size()-1);

            }
        }

    }

    public static boolean isPali(String a,int s,int e){
        while(s<e){
            if(a.charAt(s)!=a.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }
}
