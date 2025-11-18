package Number_Crunching;

import java.util.ArrayList;

public class ugly_prime {
    public static void main(String[] args) {
        int n=740;
        while(n%2==0)
        {
            n/=2;
        }

        while(n%3==0)
        {
            n/=3;

        }
        while(n%5==0)
        {

            n/=5;
        }

        String ans=n==1 ? "True" : "false";
        System.out.println(ans);
    }


}
