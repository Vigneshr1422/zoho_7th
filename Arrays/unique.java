package Arrays;

import java.util.HashMap;

public class unique {
    public static void main(String[] args) {
        int arr[]={4,5,8,7,5,3};
        HashMap<Integer,Integer>a=new HashMap<>();

       for(int k:arr)
       {
           a.put(k,a.getOrDefault(k,0)+1);
       }

       for(int x:arr)
       {
           if(a.get(x)==1)
           {
               System.out.println(x);
           }
       }
    }
}
