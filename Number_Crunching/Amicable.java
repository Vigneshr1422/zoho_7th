package Number_Crunching;

public class Amicable {
    public static void main(String[] args) {
        int a=220;
        int b=284;

        int ans=diviser(a);
        int ans2=diviser(b);

        System.out.println("Answer one "+ans+" answer two"+ans2);

        if((ans==b) && (ans2==a))
        {
            System.out.println("Amicable number ");
        }
        else
        {
            System.out.println("Not Amicable  number ");
        }


    }

    public static int diviser(int n)
    {
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
                sum+=i;

            }
        }

        return sum;
    }
}
