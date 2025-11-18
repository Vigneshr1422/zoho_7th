package Number_Crunching;

import java.util.ArrayList;

public class prime_fibob {
    public static void main(String[] args) {
        int n = 20;
        ArrayList<Integer>a=new ArrayList<>();
        a.add(0);
        a.add(1);
        int x=0;
        int b=1;

        for (int i=2;i<n;i++)
        {
            int c=x+b;
            x=b;
            b=c;
            a.add(c);

        }

        for(int i:a)
        {
            if(prime(i))
            {
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(a);

    }
    public static boolean prime(int n){
        if(n<2) return false;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
