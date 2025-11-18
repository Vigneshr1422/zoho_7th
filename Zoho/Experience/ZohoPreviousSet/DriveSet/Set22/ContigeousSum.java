package Zoho.Experience.ZohoPreviousSet.DriveSet.Set22;

public class ContigeousSum {
    public static void main(String[] args) {
        int[] arr={0,5,6,0,9,0,0,1};
        System.out.println(function(arr));

    }
    public static int function(int []arr)
    {
        int maxSum=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++)
        {
            int s=arr[i]+arr[i-1];
            if(s>maxSum)
            {
                maxSum= s;
            }
        }
        return maxSum;
    }
}
