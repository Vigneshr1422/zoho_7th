package array;
import java.util.*;
public class remove_duplicate {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Size of array ");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Array elements : ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("remove duplicate are");
        int res=duplicate(arr, n);
        for(int i=0;i<res;i++)
        {
            System.out.println(arr[i]+" "); 
        }

    }
    public static int duplicate(int arr[],int n)
    {
        if(n==0 ||n==1)
        {
            return n;
        }
        bubblesort(arr);
        int j=0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arr[j++]=arr[i];
            }
        }
        arr[j++]=arr[n-1];
        return j;
    }
    public static void bubblesort(int arr[])
    {
            boolean x;
            for(int i=0;i<arr.length-1;i++)
            {
                x=false;
                for(int j=0;j<arr.length-1-i;j++)
                {
                    if(arr[j]>arr[j+1])
                    {
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        x=true;
                    }
                }
                if(!x)
                {
                    break;
                }

            }

    }
}
