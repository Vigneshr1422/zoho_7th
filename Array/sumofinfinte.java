package Array;

public class sumofinfinte {
    public static void main(String[] args) {
        int []arr={4,2,3,4};
        int n=5;
        System.out.println(func(arr,n));
    }
    public static int func(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i%arr.length];
        }
        return sum;
    }
    
}
