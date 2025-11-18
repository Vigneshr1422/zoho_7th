package array;
import java.util.*;
public class peakelement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Array size ");
        int x=in.nextInt();
        System.out.println("Enter Array elements ");
        int arr[]=new int[x];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }
        int n=arr.length;
        // one element in array 
        if(n==1)
        {
            System.out.println(arr[0]);
            return;
        }
        // first element cheak
        if(arr[0]>=arr[1])
        {
            System.out.println(arr[0]);
            return;
        }
        // last element cheak
        if(arr[n-1]>=arr[n-2])
        {
            System.out.println(arr[n-1]);
            return;
        }
        // remaining element 
        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>=arr[i-1] && arr[i]>=arr[i+1])
            {
                System.out.println(arr[i]);
                return;
            }

        }

    }
    
}
