package Number_Crunching;

public class tribanoci {
    public static void main(String[] args) {
        int n=15;
        int a=0;
        int b=1;
        int c=1;
        System.out.print("0 1 1 ");
        for(int i=3;i<n;i++)
        {
            int x=a+b+c;
            a=b;
            b=c;
            c=x;

            System.out.print(x+" ");
        }
    }
}
