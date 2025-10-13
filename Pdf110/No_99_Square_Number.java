package Pdf110;

public class No_99_Square_Number {
    public static void main(String[] args) {
        int a=20;
        int b=100;
        int i=1;
        while(i*i<a)
        {
            i++;
        }
        while(i*i<=b)
        {
            System.out.print(i*i+" ");
            i++;
        }
    }
}
