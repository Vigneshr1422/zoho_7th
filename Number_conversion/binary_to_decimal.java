package Number_conversion;

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while (true) {

            System.out.println("1.Binary to Decimal\n" +
                    "2.Binary to Octal\n" +
                    "3.Binary to Hexa-Decimal\n" +
                    "4.Decimal to Binary\n" +
                    "5.Decimal to Octal\n" +
                    "6.Decimal to Hexa-Decimal\n" +
                    "7.Octal to Binary\n" +
                    "8.Octal to Decimal\n" +
                    "9.Octal to Hexa-Decimal\n" +
                    "10.Hexa-Decimal to Binary\n" +
                    "11.Hexa-Decimal to Decimal\n" +
                    "12.Hexa-Decimal to Octal\n"+
                    "13.Exit"
            );
            System.out.println("Enter operation do you want ");
            int n=in.nextInt();
            switch (n)
            {
                case 1:
                    System.out.println("Enter the value (ex : 1011) ");
                    int x=in.nextInt();
                    BinaryToDecimal(x);
                    break;
                case 2:
                    System.out.println("Enter teh value (ex : 110010");
                    int y=in.nextInt();
                    BinarytoOctal(y);
                    break;
                case 3:
                    System.out.println("Enter a value binary value");
                    int z=in.nextInt();
                    BinaryToHexaDecimal(z);
                case 13:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
            }

        }
    }

    public static  void  BinaryToDecimal(int n)
    {
        int base=1;
        int ans=0;

        while(n!=0)
        {
            int rem=n%10;
            ans=ans+rem*base;
            base*=2;
            n/=10;
        }
        System.out.println("Answer " +ans);
    }

    public static void BinarytoOctal(int n)
    {
        int base=1;
        int ans=0;
        while(n!=0)
        {
            int rem=n%10;
            ans=ans+rem*base;
            base=base*2;
            n/=10;
        }
        int octaAns=0;
        int base1=1;
        while(ans!=0)
        {
            int rem=ans%8;
            octaAns=octaAns+rem*base1;
            base1*=2;
            ans/=8;
        }

        System.out.println("Answer isd ");
    }

    public static void BinaryToHexaDecimal(int n)
    {
        int ans=0;
        int base=1;

        while(n!=0){
            int rem=n%10;
            ans+=rem*base;
            base*=2;
            n/=10;
        }

        char []arr={'0','1','2','3','4',
                '5','6','7','8','9','A',
                'B','C','D','E','F','G'};

        String answer="";
        while(ans!=0)
        {
            int rem=ans%10;
            answer=arr[rem]+answer;
            ans/=10;

        }
        System.out.println("Answer is "+answer);
    }
}
