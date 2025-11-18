package Number_Crunching;

public class Armstrong {
    public static void main(String[] args) {
        int n=1236;

        for(int i=0;i<n;i++)
        {
            if(arms(i))
            {
                System.out.print(i+" ");
            }
        }

    }
    public static boolean arms(int n)
    {
        int store=n;
        int len = (n == 0) ? 1 : (int) Math.log10(n) + 1;
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum+=(int)Math.pow(rem,len);
            n/=10;
        }
        return sum == store;
    }
}
