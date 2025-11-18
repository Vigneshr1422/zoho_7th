package Zoho.Experience.Zoho_Images.ImageSet1;

import java.util.HashMap;

public class noof_goodpair {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,3,3};
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:arr)
        {
            count+=map.getOrDefault(a, 0);
            map.put(a,map.getOrDefault(a, 0)+1);
        }

        System.out.println(count);
    }
    
}
