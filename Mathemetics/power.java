package Mathemetics;

import java.math.BigInteger;
import java.util.*;
public class power {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("base");
        int a=in.nextInt();
        System.out.println("Exponent ");
        int b=in.nextInt();
        System.out.println("The value is "+powers(a, b));
        in.close();
    }
    public static BigInteger powers(int x,int y)
    {
        BigInteger result= BigInteger.valueOf(1);
        BigInteger base=BigInteger.valueOf(x);
        for(int i=0;i<y;i++)
        {
            result=result.multiply(base);
        }
        return result;
    }
    
}
