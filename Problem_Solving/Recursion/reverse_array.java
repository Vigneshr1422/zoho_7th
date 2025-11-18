package Problem_Solving.Recursion;
import java.util.*;
public class reverse_array {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 4, 1};
        int s=0;
        int e=arr.length-1;
      //  function(arr,s,e);
        recursion(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void recursion(int []arr,int i,int n)
    {
        if(i>=n/2)
        {
            return;
        }
        int t=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=t;

        recursion(arr,i+1,n);
    }

    public static void function(int[] arr,int s,int e){


        if(s>=e){
            System.out.println(Arrays.toString(arr));
            return;
        }
        int t=arr[s];
        arr[s]=arr[e];
        arr[e]=t;

        function(arr,s+1,e-1);
}

}
