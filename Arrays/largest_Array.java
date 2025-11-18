package Arrays;

public class largest_Array {
    public static void main(String[] args) {
        int []arr={8,9,10,1,2,5};

        System.out.println("First largest "+first_laregst(arr));
        System.out.println("Second largest "+second_largest(arr));
        System.out.println("Third Largest "+third_largest(arr));
    }

    public static int first_laregst(int []arr)
    {
        int ans=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>ans)
            {
                ans=arr[i];
            }
        }
        return ans;
    }

    public  static int second_largest(int []arr)
    {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;

        for(int i:arr)
        {
            if(i>first)
            {
                second=first;
                first=i;
            }
            else if(i>second && i!=first)
            {
                second=i;
            }
        }
        return second;
    }

    public static int third_largest(int []arr)
    {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i:arr)
        {
            if(i>first)
            {
                third=second;
                second=first;
                first=i;
            }
            else if(i>second && i!=first)
            {
                third=second;
                second=i;
            }
            else if(i>third && i!=first && i!=second)
            {
                third=i;
            }
        }
        return third;
    }
}
