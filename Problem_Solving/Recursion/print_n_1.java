package Problem_Solving.Recursion;

public class print_n_1 {
    public static void main(String[] args) {
        int n=5;
        func(n);
    }
    public static void func(int n)
    {
        if(n==0) return;
        System.out.println(n);
        func(--n);
    }
}
