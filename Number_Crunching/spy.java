package Number_Crunching;

public class spy {
    public static void main(String[] args) {
                int n=9999;
                for(int i=0;i<n;i++)
                {
                    if(sum(i)==product(i))
                    {
                        System.out.print(i+" ");
                    }
                }
    }
    public static int sum(int n)
    {
        int sum=0;

        while(n!=0)
        {
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;

    }
    public static int product(int n)
    {
        int pro=1;
        while(n!=0)
        {
            int rem=n%10;
            pro*=rem;
            n/=10;
        }
        return pro;
    }
}
