package Zoho.Pdf110;

import java.util.Scanner;

public class No_52_MaxNumber {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int max=0;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
                return;
            }


        }else
        {
            if(b>c)
            {
                System.out.println(b);
                return;
            }
            else{
                System.out.println(c);
            }
        }
    }
}
