package Arrays;

public class Laregest {
    public static void main(String[] args) {
        int []arr={4,8,6,19,28,34,5,12};
        System.out.println("Second Largest "+seocndlargest(arr));
    }
    public static int seocndlargest(int []arr)
    {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>first)
            {
                third=second;
                second=first;
                first=arr[i];
            }
         else   if(arr[i]!=first &&arr[i]>second )
            {
                third=second;
                second=arr[i];
            }

     else       if(arr[i]!=second && arr[i]>third && arr[i]!=first)
            {
                third=arr[i];
            }
        }
        return third;
    }
}
