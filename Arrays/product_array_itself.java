package Arrays;

import java.util.Arrays;

public class product_array_itself {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int []res=new int[arr.length];
        res[0]=1;

        for(int i=1;i<arr.length;i++)
        {
            res[i]=res[i-1]*arr[i-1];
        }

        int right=1;


        for(int i=arr.length-1;i>=0;i--)
        {
            res[i]*=right;
            right*=arr[i];
        }

        System.out.println(Arrays.toString(res));
    }
}
