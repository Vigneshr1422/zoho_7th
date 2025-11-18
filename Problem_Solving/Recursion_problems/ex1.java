package Problem_Solving.Recursion_problems;

public class ex1 {
    public static void main(String[] args) {
        fun(1);
    }
    public static void fun( int n)
    {
        
        if(n==4)
            {
                return;
            }
        System.out.println(n);
        fun(n+1);


    }
    
}
