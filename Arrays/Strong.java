package Arrays;

public class Strong {
    public static void main(String[] args) {
        int []arr={145,11,1,7,5,2};
        for(int i=0;i<arr.length;i++)
        {
            if (storng_cheak(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
    public static boolean storng_cheak(int n)
    {

        int sum=0;
        int store=n;

        while(n!=0)
        {
            int rem=n%10;
            sum+=fact(rem);
            n/=10;
        }

        return store == sum;


    }

    public static int fact(int n)
    {
        int sum=1;
      for(int i=1;i<=n;i++)
      {
          sum*=i;
      }
      return sum;
    }
}
