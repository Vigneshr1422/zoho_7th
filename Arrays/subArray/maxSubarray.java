package Array;

public class maxSubarray {
    public static void main(String[] args) {
        int []arr={5,4,-1,7,8};
        System.out.println("The answer is "+fun(arr));
    }
    public static int fun(int []arr)
    {
        int max=arr[0];
        int crt=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            crt=Math.max(arr[i], arr[i]+crt);
            max=Math.max(max, crt);
        }
        return max;
    }
    
}
