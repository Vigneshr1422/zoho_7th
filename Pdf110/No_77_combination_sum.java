package Pdf110;
import java.util.*;
public class No_77_combination_sum {public static void main(String[] args) {
    int []arr={8,3,7,4,9};
    int tar=7;

    ArrayList<ArrayList<Integer>>a=new ArrayList<>();
    dfs(arr,tar,0,new ArrayList<>(),a);

    for(List<Integer> x:a){
        for(int j:x){
            System.out.print(j+" ");
        }
        System.out.println();
    }

}

    public static void dfs(int []arr,int tar,int index,ArrayList<Integer>now, ArrayList<ArrayList<Integer>>ans){
        if(tar==0){
            ans.add(new ArrayList<>(now));
            return;
        }
        if(index==arr.length){
            return;
        }
        now.add(arr[index]);
        dfs(arr,tar-arr[index],index+1,now,ans);
        now.remove(now.size()-1);
        dfs(arr,tar,index+1,now,ans);
    }

    public static void bruteforce(){
        int []arr={8,3,7,4,9};
        int tar=7;
        int n=arr.length;
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if (arr[i] == tar) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                ans.add(temp);
            }
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==tar){
                    ArrayList<Integer> temp= new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);

                    ans.add(temp);
                }
            }
        }

        for(ArrayList<Integer> a:ans){
            for(int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

/*
6. Given unsorted array find all combination of the element
for a given sum. Order should be maintained.
Input :
83479
N=7
Output
{3 4 } {7}


 */