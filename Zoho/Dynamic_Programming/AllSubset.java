package Dynamic_Programming;
import java.util.*;
public class AllSubset {
    public static void main(String[] args) {
        int []arr={1,2,3};

        generate(arr,0, new ArrayList<>());
    }

    public static void generate(int []arr,int index,ArrayList<Integer>ans)
    {
        if(index==arr.length){
            System.out.println(ans);
            return ;
        }

        ans.add(arr[index]);
        generate(arr, index+1, ans);
        ans.remove(ans.size()-1);
        generate(arr, index+1, ans);


    }

}
