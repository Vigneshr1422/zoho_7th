package Striver.Arrays.Level1;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8};
        int n=arr.length;
        int k=2;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotate(int []arr,int k)
    {
        k=k%arr.length;
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

    }

    public static void reverse(int []arr,int s, int e)
    {
        while(s<e)
        {
            int n=arr[s];
            arr[s]=arr[e];
            arr[e]=n;
            s++;
            e--;
        }
    }
}
