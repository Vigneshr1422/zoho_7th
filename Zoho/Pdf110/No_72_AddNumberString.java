package Zoho.Pdf110;

public class No_72_AddNumberString {
    public static void main(String[] args) {
        String x="1234";
        String y="12";

        int i=x.length()-1;
        int j=y.length()-1;
        int c=0;

        StringBuilder ans=new StringBuilder();
        while(i>=0 || j>=0 || c>0){
            int d1=(i>=0) ?x.charAt(i)-'0' : 0 ;
            int d2=(j>=0) ?y.charAt(j)-'0' : 0;
            int sum=d1+d2+c;
            ans.append(sum%10);
            c=sum/10;
            i--;
            j--;
        }
        for(int ii=ans.length()-1;ii>=0;ii--){
            System.out.print(ans.charAt(ii));
        }
        System.out.println();
       // bruteforce();
    }

/*
    public static void bruteforce(){
        String a="1574";
        String b="88";

        BigInteger ans=new BigInteger(a);
        BigInteger ans1=new BigInteger(b);
        BigInteger sum=ans.add(ans1);
        System.out.println(sum.toString());

    }
}


1. Adding 2 numbers
GIven 2 huge numbers as seperate digits, store them in array
and process them and calculate the sum of 2 numbers and store
the result in an array and print the sum.
Input:
Number of digits: 12
928135673116
Number of digits:9
784621997
Output :
928920295113


 */
}
