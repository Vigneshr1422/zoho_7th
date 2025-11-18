package set6;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int k=3;

         k=k%arr.length;
         System.out.println("Left rotate  :  ");
            int n=arr.length;
         rotate(arr,0,k-1);
         rotate(arr,k,n-1);
         rotate(arr,0,n-1);

         System.out.println(Arrays.toString(arr));

         System.out.println("right rotate  :  ");
         rotate(arr,0,n-k-1);
         rotate(arr,n-k,n-1);
         rotate(arr,0,n-1);

         System.out.println(Arrays.toString(arr));

    }

    public static void rotate(int []arr, int s,int e){
        while (s<e) {
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
            
        }
    }
}
