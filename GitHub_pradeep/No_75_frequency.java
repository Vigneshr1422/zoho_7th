package GitHub_pradeep;

import java.util.HashMap;

public class No_75_frequency {
    public static void main(String[] args) {
        int []arr={1,2,1,2,3,5,4};
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int i:arr)
        {
            ans.put(i, ans.getOrDefault(i,0)+1);
        }
        System.out.println(ans);
    }
}
