package Problem_Solving.SubArray;

public class sum_of {
    public static void main(String[] args) {
        int []arr={1,2,3,4};
        int n=arr.length;
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=(long)arr[i]*(i+1)*(n-i);
        }
        System.out.println("Sum in formula method "+sum);

        int total=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                System.out.print("[ ");
                for(int k=i;k<=j;k++)
                {
                    System.out.print(arr[k]+" ");
                    total+=arr[k];
                }
                System.out.println("]");
            }
        }

        System.out.println("Total "+total);
    }

}
