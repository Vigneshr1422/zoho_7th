package folders.set.set5;

import java.util.Arrays;

public class array_reverse_kstep {
    public static void main(String[] args) {
        int []a={2,1,3,5,8,6,7,9};
        int k=3;

        for(int i=0;i<a.length;i=i+k)
        {
            int left=i;
            int right=Math.min(i+k-1,a.length-1);
            reverse(a,left,right);


        }

        System.out.println(Arrays.toString(a));

    }    

    public static void reverse(int []arr, int start , int end)
    {

         while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
