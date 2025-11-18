package Problem_Solving.Build_In;

public class sqrt {
    public static void main(String[] args) {
        int a=64;

        System.out.println("Newton Rahson "+newton(a));
    }
    public static double newton(int n)
    {
        double x=(int)n;
        double epsilon=1e-6;

        while((x*x-n)>epsilon || (n-x*x)>epsilon)
        {
            x=(x+n/x)/2;
        }
        return Math.round(x*100.0)/100.0;
    }
}
