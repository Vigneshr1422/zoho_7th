package ZohoLowLevelDesign.Console;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a first number ");
            int a=in.nextInt();
            System.out.println("Enter a second number " );
            int b=in.nextInt();
            System.out.println("Enter character : ");
            char c=in.next().charAt(0);
            int res=0;
            switch (c)
            {
                case '+':
                    res=a+b;
                    break;
                case '-':
                    res=a-b;
                    break;
                case '*':
                    res=a*b;
                    break;
                case '/':
                    if(b==0)
                    {
                        System.out.println("b is zero so not valid ");
                        break;
                    }
                    res=a/b;
                    break;
                case '%':
                    res=a%b;
                    break;

                default:
                    System.out.println("Wrong Character ");

            }

            System.out.println("Result is "+res);

            System.out.println("Try Another ... (yes / no ");
            char n=in.next().charAt(0);
            if(n=='n' || n=='N' )
            {
                System.out.println("Exit ......");
                break;
            }
        }
    }
}
