package Problem_Solving.SubArray;
// maximum sum of sub array
public class sliding_window {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(fun(arr, k));
    }


public static int fun(int []arr,int k){

        int window=0;

        for(int i=0;i<k;i++)
        {
            window+=arr[i];
        }
        int sum=window;

        for(int i=k;i<arr.length;i++)
        {
            window+=arr[i]-arr[i-k];
            sum=Math.max(window,sum);
        }
        return sum;
        }


}
