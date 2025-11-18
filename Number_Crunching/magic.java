package Number_Crunching;

public class magic {
    public static void main(String[] args) {
        int a=1729;


        for(int i=1;i<=1729;i++)
        {
            if(fun(i)==1)
            {
                System.out.print(i+" ");
            }
        }




    }
    public static int fun(int a)
    {
        int sum=sumofdigit(a);
        while(sum>=10)
        {
            sum=sumofdigit(sum);
        }
        if(sum==1) return 1;

        return 0;
    }

    public static int sumofdigit(int n)
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
}
