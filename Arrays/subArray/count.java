package Problem_Solving.SubArray;

public class count {
        public static void main(String[] args) {
            int []arr={1,2,3,4};
            int n=arr.length;
            int v=0;

            int c= n * (n + 1) / 2; // formula method
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    System.out.print("[ ");
                    for(int k=i;k<=j;k++)
                    {
                        System.out.print(arr[k]+" ");

                    }
                v++;
                    System.out.println("]");

                }
            }
            System.out.println("Count loop way "+v);
            System.out.println("Count formula method "+c);
        }

    }
