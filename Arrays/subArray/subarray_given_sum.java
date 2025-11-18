package Problem_Solving.SubArray;

public class subarray_given_sum {
    public static void main(String[] args) {
        int []arr={1, 4, 20, 3, 10, 5};
        int n=arr.length;
        int t=55;
        boolean a=false;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    sum+=arr[k];
                    if(sum==t){
                        a=true;
                    }
                }
            }
        }
        System.out.println(a);
    }
}
