package Pdf110;

import java.util.HashMap;

public class No_14_Top3KElement {
    public static void main(String[] args) {
        int []arr={1,2,3,5,1,7,2,3,6,3,2,4,1,2,3,1,4,1,2,2};
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int f:arr)
        {
            ans.put(f,ans.getOrDefault(f,0)+1);
        }
        for(int i=0;i<3;i++)
        {
            int key=-1;
            int maxCount=-1;
            for(int k:ans.keySet()) {
                int c = ans.get(k);
                if (c > maxCount) {
                    maxCount = c;
                    key = k;
                }
            }
                if(key ==-1) break;
                System.out.println(key);
                ans.remove(key);
        }
        System.out.println(ans);
    }
}
