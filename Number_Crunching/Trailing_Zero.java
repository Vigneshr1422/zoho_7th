package Number_Crunching;

public class Trailing_Zero {
    public static void main(String[] args) {
            int m=1050080;
            int sum=0;
            while(m%10==0)
            {
                sum++;
                m/=10;
            }
        System.out.println(sum);
        int n = 40; // binary: 101000
        int count = 0;

        while ((n & 1) == 0 && n != 0) {
            count++;
            n >>= 1; // Right shift
        }

        System.out.println(count);
    }
}

