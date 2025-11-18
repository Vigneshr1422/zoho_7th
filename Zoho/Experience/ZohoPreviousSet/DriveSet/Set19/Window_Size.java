package Zoho.Experience.ZohoPreviousSet.DriveSet.Set19;

public class Window_Size {
    public static void main(String[] args) {
        int []arr={2, 1, 5, 1, 3, 2};
        int k=3;

        Wind_function(arr,k);
    }
    public static void Wind_function(int []arr,int k)
    {
        int wSum=0;
        int index=0;

        for(int i=0;i<k;i++){
            wSum+=arr[i];
        }
      int  max=wSum;

        for(int i=k;i<arr.length;i++)
        {
            wSum+=arr[i]-arr[i-k];

            if(max<wSum)
            {
                max=wSum;
                index=i-k+1;
            }
        }
        for (int i=index;i<index+k;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Sum is "+max);

    }
}
