package Problem_Solving.Recursion;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }
    static int fibo(int n)
    {
        if(n<2)
        {
            return n;
        }
        int first= fibo(n-1);
        int last =fibo(n-2);
        return first+last;
    }
}
