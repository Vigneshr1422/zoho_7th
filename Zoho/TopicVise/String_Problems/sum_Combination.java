package TopicVise.String_Problems;
import java.util.*;
public class sum_Combination {
    public static void main(String[] args) {
        int arr[]={8,3,7,4,9};
        int tar=7;

        List<List<Integer>> ans=new ArrayList<>();

        dfs(arr,tar,0,new ArrayList<>(),ans);
        
        System.out.println(ans);
        
    }

    public static void dfs(int []arr,int tar, int index,ArrayList<Integer> current, List<List<Integer>>ans){

        if(tar==0){
            ans.add(new ArrayList<>(current));
            return ;
        }

        if(tar==arr.length){
            return ;
        }
        current.add(arr[index]);
        dfs(arr, tar-arr[index], index+1, current, ans);
        current.remove(current.size()-1);
        dfs(arr, tar, index+1, current, ans);


        }
}
