package Problem_Solving.Recursion_problems;

public class add {
    public static void main(String[] args) {
        int n=5;
       System.out.println(fun(n));
    }
    public static int fun(int n)
    {
        if(n==0)
        { 
            return 0 ; 
        }
        return n+fun(n-1);
    }
}
