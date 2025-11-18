package Problem_Solving.Recursion;

public class print_n_1_backtrack {
    public static void main(String[] args) {
        int n=5;
        fun(n);

    }
    public static void fun(int n)
    {
        if(n==1) return;

        fun(n--);
        System.out.println(n);

    }
}
