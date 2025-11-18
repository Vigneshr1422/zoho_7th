package Problem_Solving.Recursion_problems;
import java.util.*;
public class combination_sum1_and_sum2{
    public static void main(String[] args) {
        int []arr={2,3,6,7};
        int tar=7;

        List<List<Integer>>ans=combinationFunction(arr,tar);
        System.out.println(ans);

        int []arr2={10,1,2,7,6,1,5};
        int target=8;

        List<List<Integer>>answer=combinationSum2Function(arr2,target);
        System.out.println(answer);


    }
    public static List<List<Integer>> combinationFunction(int []arr, int tar)
    {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(arr,tar,0,new ArrayList<>(),result);
        return result;
    }

    public static void backtrack(int []arr, int tar, int ix, ArrayList<Integer>store, List<List<Integer>>ans)
    {
        if( tar<0 || arr.length==ix){
            return ;
        }
        if(tar ==0){
            ans.add(new ArrayList<>(store));
            return;
        }
        store.add(arr[ix]);
        backtrack(arr,tar-arr[ix],ix,store,ans);
        store.remove(store.size()-1);
        backtrack(arr,tar,ix+1,store,ans);
    }

    public static List<List<Integer>> combinationSum2Function(int []arr,int tar)
    {
        List<List<Integer>>ans=new ArrayList<>();
        Arrays.sort(arr);
        backtracking(arr,tar,0,new ArrayList<>(),ans);
        return  ans;
    }

    public static  void backtracking(int []arr, int tar,int ix, List<Integer>store,List<List<Integer>>ans)
    {
        if(tar==0)
        {
            ans.add(new ArrayList<>(store));
            return;
        }

        for(int i=ix;i<arr.length;i++)
        {
            if(i>ix && arr[i]==arr[i-1]) continue;

            if(arr[i]>tar) break;

            store.add(arr[i]);
            backtracking(arr,tar-arr[i],i+1,store,ans);
            store.remove(store.size()-1);

        }

    }
}
