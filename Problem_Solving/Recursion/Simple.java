package Problem_Solving.Recursion;

public class Simple {
    public static void main(String[] args) {
        function(1);
    }
    public static void function(int n)
    {
        if(n==5)               // base case
        {
            return;
        }
        System.out.println(n);
        function(n+1);


    }
}
