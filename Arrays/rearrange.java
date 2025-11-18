package Arrays;

import java.util.Arrays;

public class rearrange {
    public static void main(String[] args) {
        int []arr={2,1,4,3,0};
        int ans[]=new int[arr.length];

        for(int i=0;i<arr.length;i++)
        {
             ans[i]=arr[arr[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
