package Maths;

public class a4PrimeFactor {
    public static void main(String[] args) {
        int n=84;

        while(n%2==0)
        {
            System.out.print(2+ " ");
            n/=2;
        }

       for(int i=3;i*i<=n;i+=2)
       {
        while(n%i==0)
        {
            System.out.print(i+" ");
             n/=i;
        }
       
       }

       System.out.print(n);
    }
}
