package Maths;

public class fibonacci {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<=n;i++){
        System.out.println(fibonacci_fun(i));
        }
    }
    public static int fibonacci_fun(int n){
        if(n<=1) return n;

        int a=0;
        int b=1;

        for(int i=2;i<=n;i++){
            int c=a+b;
            a=b;
            b=c;
        }
        return b;
    }
}
