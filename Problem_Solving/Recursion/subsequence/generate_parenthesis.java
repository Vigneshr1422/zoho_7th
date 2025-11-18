package Problem_Solving.Recursion.subsequence;

import java.util.*;

public class generate_parenthesis {
    public static void main(String[] args) {
        int n=3;
        List<String>ans=new ArrayList<>();
        funct(ans,n,"",0,0);
        System.out.println(ans);
    }

    public static void funct(List<String>ans,int n,String store,int st,int end)
    {
        if(store.length()==n*2)
        {
            ans.add(store);
            return;
        }
        if(st<n)
        {
            funct(ans,n,store+"(",st+1,end);
        }
        if(end<st)
        {
            funct(ans,n,store+")",st,end+1);
        }
    }

}
