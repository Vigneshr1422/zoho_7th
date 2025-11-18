package Mathemetics;

public class Prime {
    public static void main(String[] args) {
        int n=11;
        if(n<=1) 
        {
            System.out.println("Not Prime");
            return;
        }
        if(n==2)
        {
            System.out.println("Prime");
            return;
        }
        if( n%2==0)
        {
            System.out.println("Not prime");
            return;
        }
       for(int i=3;i*i<=n;i++)
       {
        if(n%i==0)
        {
            System.out.println("Not prime");
            return;
        }
       }
       System.out.println("Prime");
       
    }
    
}
