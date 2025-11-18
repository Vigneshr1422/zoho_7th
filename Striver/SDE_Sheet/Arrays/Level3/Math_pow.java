package Striver.SDE_Sheet.Arrays.Level3;

public class Math_pow {
    public static void main(String[] args) {
        double x=2.00000;
        int n=10;


        System.out.println( FunctionPower(x,n));
    }
    public static double FunctionPower(double x,int n)
    {
        double ans=1.0;
        long temp=n;

        if(temp<0) temp= -1* n;

        while(temp>0){
            if(temp%2==0){
                x=x*x;
                temp/=2;
            }
            else{
                ans=ans*x;
                temp=temp-1;
            }
        }
        if(n<0)
            ans=(double) (1.0)/ (double) ans;
        return ans;
    }
}
