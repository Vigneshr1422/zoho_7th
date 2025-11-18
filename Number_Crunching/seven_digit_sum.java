package Number_Crunching;

public class seven_digit_sum {
    public static void main(String[] args) {
        int n=99;
        for(int i=10;i<=n;i++)
        {
            if(fun(i))
            {
                System.out.print(i+" ");
            }
        }
    }


        public static boolean fun(int n) {
            int first = n / 10;
            int second = n % 10;
            return (first + second) % 7 == 0;

    }
}
