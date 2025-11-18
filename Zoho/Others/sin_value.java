package Zoho.Others;

public class sin_value {
    public static void main(String[] args) {
        double x=30;
        int n=4;

        double radian=Math.toRadians(x);
        double sinx=0;

        for(int i=0;i<n;i++)
        {
            int sign = (i%2==0) ? 1:-1;
            double term=Math.pow(radian,(2*i+1))/ fact(2*i+1);
            sinx+=term*sign;
        }
        System.out.printf("sin(%.0f) = %.4f",x,sinx);
    }
    public static int fact(int n)
    {
        int j=1;
        for(int i=1;i<=n;i++)
        {
            j*=i;
        }
        return j;
    }
}
