package Mathemetics;

public class gcd {
    public static void main(String[] args) {
        int a=14;
        int b=12;

        System.out.println(gcdfun(a,b));
    }
    public static int gcdfun(int x,int y)
    {
      
        while(y!=0)
        {
            int temp=y;
            y=x%y;
            x=temp;
        }
        return x;

    }
}
