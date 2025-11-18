package Problem_Solving.HashMap;

import java.util.ArrayList;
import java.util.HashMap;

public class High_low {
    public static void main(String[] args) {
        int []arr={2,2,4,4,2,6};

        HashMap<Integer,Integer> a=new HashMap<>();

        for(int i:arr){
            a.put(i,a.getOrDefault(i,0)+1);
        }
        
        for(int i:a.keySet())
        {
//            System.out.println(i+"->"+a.get(i));

        }
    }
}
