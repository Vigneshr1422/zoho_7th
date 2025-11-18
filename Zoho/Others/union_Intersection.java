package Zoho.Others;

import java.util.HashSet;

public class union_Intersection {
    public static void main(String[] args) {
        int []arr={1,3,4,5,6,8,9};
        int []arr2={1,5,8,9,2};
        HashSet<Integer>union=new HashSet<>();
        HashSet<Integer>intersection=new HashSet<>();
        for(int i:arr)
        {
            union.add(i);
        }

        for(int i:arr2)
        {
            union.add(i);
            if(union.contains(i))
            {
                intersection.add(i);
            }
        }
        System.out.println(union);
        System.out.println(intersection);
    }
}
