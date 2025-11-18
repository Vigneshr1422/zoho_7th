package Number_Crunching;

public class num_without_0 {
    public static void main(String[] args) {

        int n = 1020;
        reverse(n);
        int sum = 0;
        int t = 1;

        while (n != 0) {
            int rem=n%10;
            if(rem!=0)
            {
                sum+=rem*t;
                t*=10;
            }
            n/=10;
        }
        System.out.println(sum);
    }
    public static  void reverse(int n)
    {
        int sum=0;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum*10+rem;
            n/=10;
        }
        System.out.println(sum);
    }
}
