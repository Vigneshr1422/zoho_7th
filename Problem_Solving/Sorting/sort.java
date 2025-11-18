package Problem_Solving.Sorting;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int []arr={20,15,68,2,12};
        int n=arr.length;

//        selection_sort(arr,n);
//        insertion_sort(arr,n);
        bubblesort(arr,n);
    }

    public static void bubblesort(int []arr, int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if (arr[j+1]<arr[j]) {
                    int t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion_sort(int []arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int j=i;

            while (j>0 && arr[j]<arr[j-1])
            {
                int t=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=t;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void selection_sort(int []arr,int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }

            int t=arr[min];
            arr[min]=arr[i];
            arr[i]=t;
        }
        System.out.println(Arrays.toString(arr));
    }
}
