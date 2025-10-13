package Recursion;
import java.util.*;
public class subset1_subset2 {
    public static void main(String[] args) {
      int []arr={3,34,4,12,5,2};
      int tar=9;
      boolean res=subsetFunction(arr,tar,0);
        System.out.println(res);

        System.out.println("Subset 2 program ");
        int []ar={1,2,3};
        List<List<Integer>>ans=subsetFunctionTwo(ar);
        System.out.println(ans);

    }

    public static boolean subsetFunction(int []arr,int tar,int ix)
    {
        if(arr.length==ix) return false;
        if(tar==0) return  true;

        if(arr[ix]<=tar){
            if(subsetFunction(arr,tar-arr[ix],ix+1)){
                return true;
            }
        }
        return subsetFunction(arr,tar,ix+1);
    }

    public static List<List<Integer>> subsetFunctionTwo(int []arr ){
        Arrays.sort(arr);
        List<List<Integer>>ans=new ArrayList<>();
        backtrack(arr,0,new ArrayList<>(),ans);
        return ans;
    }

    public static void backtrack(int []arr,int s,List<Integer>store,List<List<Integer>>ans)
    {
        ans.add(new ArrayList<>(store));
        for(int i=s;i<arr.length;i++)
        {
            if(i>s && arr[i]==arr[i-1]) continue;
            store.add(arr[i]);

            backtrack(arr,i+1,store,ans);
            store.remove(store.size()-1);

        }
    }

}
