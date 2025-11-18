package array;
import java.util.*;

public class max_min {
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
        for(int i=0;i<arr.length;i++)
        {
            int temp=0;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }
        System.out.println("Cj");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
            
        }
        
        System.out.println("smallest element "+arr[0]+"\n"+"largest element "+arr[arr.length-1]);
    
}
}
