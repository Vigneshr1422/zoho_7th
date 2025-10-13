package Pdf110;
// 5n^2+4
// 5n^-4
public class No_38_Fibo {
    public static void main(String[] args) {
        int[] arr = {1, 10, 6, 8, 13, 21};

        for(int i=0;i<arr.length;i++)
        {
            if(isFibo(arr[i])){
                System.out.println(arr[i]);
            }
        }
    }

    public static boolean isFibo(int n){
        if(n<0) return false;
        int a=5*n*n+4;
        int b=5*n*n-4;

        return isPerfect(a)||isPerfect(b);
    }
    public static  boolean isPerfect(int n)
    {
        for(int i=1;i*i<=n;i++)
        {
            if(i*i==n) return true;
        }
        return false;
    }
}
