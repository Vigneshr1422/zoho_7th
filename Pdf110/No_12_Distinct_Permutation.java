package Pdf110;
// it is  not accept duplicate
import java.util.Arrays;

public class No_12_Distinct_Permutation {
    public static void main(String[] args) {
        String a="AAB";
        PrintDistinctPermutation(a);
        System.out.println("Print Permutation");
        PrintPermutationWithDuplicate(a,"");
    }

    public static void PrintDistinctPermutation(String s)
    {
        char []arr=s.toCharArray();
        Arrays.sort(arr);
        boolean []check=new boolean[arr.length];
        BackTrack(arr,check,new StringBuilder());
    }
    public static void BackTrack(char []arr,boolean []check,StringBuilder ans)
    {
        if(arr.length==ans.length()){
            System.out.println(ans.toString());
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(check[i]){
                continue;
            }

            if(i>0 && arr[i]==arr[i-1] && !check[i-1])
                continue;

            check[i]=true;

            ans.append(arr[i]);

            BackTrack(arr,check,ans);

            ans.deleteCharAt(ans.length()-1);

            check[i]=false;
        }
    }
    // start
    public static void PrintPermutationWithDuplicate(String a,String ans)
    {
        if(a.isEmpty())
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<a.length();i++)
        {
            PrintPermutationWithDuplicate(a.substring(0,i)+a.substring(i+1),ans+a.charAt(i));
        }
    }
}
