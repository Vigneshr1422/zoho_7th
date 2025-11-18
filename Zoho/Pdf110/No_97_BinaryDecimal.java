package Zoho.Pdf110;

public class No_97_BinaryDecimal {
    public static void main(String[] args) {
        int a=32;

        while(a!=0)
        {
            int t=a;
            int binarydecimal=0;
            int p=1;
            while(t>0){
                if(t%10>0){
                    binarydecimal+=p;
                }
                t/=10;
                p*=10;
            }
            System.out.print(binarydecimal+" ");
            a-=binarydecimal;
        }
    }
}
