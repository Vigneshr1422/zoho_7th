    package Problem_Solving.SubArray;

    public class generate_subarray {
        public static void main(String[] args) {
            int []arr={1,2,3,4};
            int n=arr.length;
            int c= n * (n + 1) / 2;
            int sum=0;
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    System.out.print("[ ");
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(arr[k]+" ");

                    }
                    sum+=arr[j];

                    System.out.println("]");

                }
            }
            System.out.println("Count "+c);
            System.out.println("sum "+sum);
        }
    }
