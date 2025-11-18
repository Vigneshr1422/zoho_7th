package Problem_Solving.Recursion;

public class sum_of_n {
    public static void main(String[] args) {
        int n=5;
        int ans=0;

        fun(n,ans);
    }
    public static void fun(int n,int ans)
    {
        ans=ans+n;

        if(n==0) {
            System.out.println(ans);
            return;
        }
        fun(n-1,ans);


    }
}
