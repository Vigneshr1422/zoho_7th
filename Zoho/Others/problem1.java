package Zoho.Others;

public class problem1 {
    public static void main(String[] args) {

        fun(5);
    }
    public static void fun(int n)
    {
        if(n>0)
        {
            System.out.println(n+" ");
            fun(n-1);
            fun(n- 1);
        }
    }
}
