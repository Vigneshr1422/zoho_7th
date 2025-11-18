package Arrays;

import java.util.HashSet;

public class Remove_duplicate {
    public static void main(String[] args) {
        int []arr={1,1,2};
        HashSet<Integer>a=new HashSet<>();
        for(int i:arr)
        {
            a.add(i);
        }
        System.out.println(a.size());
        System.out.println(a);
    }
}
